����   ? U
      java/lang/Object <init> ()V  [[I
 
     misc max (II)I  java/util/Scanner	      java/lang/System in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     out Ljava/io/PrintStream;  Enter the number of items: 
 ! " # $ % java/io/PrintStream print (Ljava/lang/String;)V
  ' ( ) nextInt ()I + 
Enter the items weights:  - 
Enter the items values:  / 
Enter the maximum capacity: 
 
 1 2 3 knapSack 	(I[I[II)I   5 6 7 makeConcatWithConstants (I)Ljava/lang/String;
  9 :  close Code LineNumberTable StackMapTable ? [I main ([Ljava/lang/String;)V C [Ljava/lang/String; 
SourceFile 	misc.java BootstrapMethods H
 I J K 6 L $java/lang/invoke/StringConcatFactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; N D
The maximum value that can be put in a knapsack of capacity W is:  InnerClasses Q %java/lang/invoke/MethodHandles$Lookup S java/lang/invoke/MethodHandles Lookup ! 
           ;        *� �    <            ;   .     � � �    <        =    	@  2 3  ;       �``� :6� {6� l� � 2O� P+d.� 32,d.d2+d.d.`d2.� 	O� 2d2.O��������2.�    <   .           (  4  ?  o  �  �  �  =   7 �   �   > >   :�   > >     	 @ A  ;  
     �� Y� � L� �  +� &=� *�  �
N6� -+� &O���� ,�  �
:6� +� &O���� .�  +� &6� -� 0� 4  �  +� 8�    <   J       !  "  #   $ $ % - & 5 % ; ( C ) H * Q + Z * ` - h . n 0 � 1 � 2 =   ! � '  B  >  � �  >�   D    E F     G  M O   
  P R T 