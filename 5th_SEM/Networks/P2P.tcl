set ns [new Simulator]
set tf [open lab1.tr w] 
$ns trace-all $tf
set nf [open lab1.nam w]
$ns namtrace-all $nf

#Create the nodes
set n0 [$ns node]
set n1 [$ns node]
set n2 [$ns node]
set n3 [$ns node]

# Give color to packets
$ns color 1 "red"
$ns color 2 "blue"
$n0 label "Source/udp0"
$n1 label "Source/udp1"
$n2 label "Router"
$n3 label "Destination/Null"

#Vary the below Bandwidth & see the number of packets dropped
$ns duplex-link $n0 $n2 10Mb 300ms DropTail
$ns duplex-link $n1 $n2 10Mb 300ms DropTail
$ns duplex-link $n2 $n3 1Mb 300ms DropTail
#Set the queue size b/w the nodes
$ns set queue-limit $n0 $n2 10
$ns set queue-limit $n1 $n2 10
$ns set queue-limit $n2 $n3 5

#Attach a UDP agent to n0, UDP agent to n1 & null agent to n3
set udp0 [new Agent/UDP]
$ns attach-agent $n0 $udp0
set cbr0 [new Application/Traffic/CBR]
$cbr0 attach-agent $udp0
set null [new Agent/Null]
$ns attach-agent $n3 $null
set udp1 [new Agent/UDP]
$ns attach-agent $n1 $udp1
set cbr1 [new Application/Traffic/CBR]
$cbr1 attach-agent $udp1

# Set the udp0 packets to red & udp1 packets to blue color
$udp0 set class_ 1
$udp1 set class_ 2

#To connect the agents
$ns connect $udp0 $null
$ns connect $udp1 $null
# Set packet size to 500
$cbr1 set packetSize_ 500Mb

# Set the interval of the packets: Data rate of the packets. If the data rate is high then packet drops are high
$cbr1 set interval_ 0.005

proc finish {} {
global ns nf tf
$ns flush-trace
exec nam lab1.nam &
exec echo "Number of Packets dropped: " &
exec grep -c "^d" lab1.nam & 
close $tf
close $nf
exit 0
}
$ns at 0.1 "$cbr0 start"
$ns at 0.1 "$cbr1 start"
$ns at 10.0 "finish"
$ns run
