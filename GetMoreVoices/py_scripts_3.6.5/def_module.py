import os, shutil, ntpath, pathlib
import urllib.request
from zipfile import ZipFile

dir_created = 0
path = "temp"




def deleteArchives( temp_archives ):
    for zip in temp_archives:
        print( "Deleting: ", zip)
        os.remove( zip )




# Define a function `plus()`
def unzipArchives( temp_archives ):
    for zip in temp_archives:
        with ZipFile( zip, 'r' ) as zipObj:
            print( "Extracting: ", zip )
            # Extract all the contents of zip file in current directory
            zipObj.extractall( path )



# Define a function `plus()`
def downloadArchives( xml_archives, temp_archives ):
    for zip in xml_archives:
        destination = path + "\\" + ntpath.basename(zip)
        file = pathlib.Path( destination )
        if file.exists():
            temp_archives.append( destination )
        else:
            print("Downloading: ", zip)
            urllib.request.urlretrieve( zip, destination )
            temp_archives.append( destination )




# Define a function `plus()`
def makeTemporaryEnvioronment():
    global dir_created
    # print( dir_created )
    if not os.path.exists( path ):
        os.mkdir( path )
        dir_created = 1





# Define a function `plus()`
def dropTemporaryEnvioronment():
    global dir_created
    # print( dir_created )
    if ( dir_created == 1 ):
        shutil.rmtree( path )
        dir_created = 0




# Define a function `plus()`
def getZipNamesFromXML( file_path, archives ):
    with open(file_path) as fp:
       line = fp.readline()
       while line:
           if '<location folder="false"' in line:
               archive = line.split('href="')[1].split( '"/>' )[0]
               archives.append(archive)
               #print( archive )
           line = fp.readline()





