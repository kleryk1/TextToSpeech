#!/usr/bin/python

import sys

import def_module

#you can start and stop the download mltiple times the download will continue whwrw it left off

file_path = ""
xml_archives = []
temp_archives = []

if( 2 == len(sys.argv) ):
    file_path = str(sys.argv[1])
    print ( "Parsing: ", file_path, "\n")


# create temporary environment
def_module.makeTemporaryEnvioronment()


# read from xml file and save to array
def_module.getZipNamesFromXML(file_path, xml_archives)





# download archives from URL
def_module.downloadArchives( xml_archives, temp_archives )



# unzip all archives
def_module.unzipArchives( temp_archives )


# remove all archives
def_module.deleteArchives( temp_archives )






# delete environment
#def_module.dropTemporaryEnvioronment()



for temp in temp_archives:
    print( temp )


 # for zip in xml_archives:
 #     print( zip )



