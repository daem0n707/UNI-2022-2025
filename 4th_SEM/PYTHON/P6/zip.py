import os
from zipfile import ZipFile

folder = "" #folder path goes here
myzip = folder + '.zip'

with ZipFile(myzip,'w') as zip_object:
    for folder_name, sub_folders, file_names in os.walk(folder):
        print(f"\n\nFoldername: {folder_name}\nSubfolder: {sub_folders}\nFilename: {file_names}")
        for filename in file_names:
            file_path = os.path.join(folder_name,filename)
            print("-----")
            print(file_path)
            print("-----")
            zip_object.write(file_path, os.path.basename(file_path))

if os.path.exists(myzip):
    print(f"{myzip} has been created")
else:
    print("Zip file was not created")
