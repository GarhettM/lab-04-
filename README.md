# Lab-04 BIT-MAP-TRANSFORMER
## to access this app open command line type:
*  ./gradlew run --args '...'
* the ... represent the input file output file & command
* current commands we have are shrink, bingo, delete

* <strong> Input is only needed for delete commands  </strong>


## bitMapImgUpload method
* takes in the string img path 
* it reads and creates a new file 
* and then it returns img 

## saveImge method
* takes in the BufferedImage &  takes the savPath.
* it then writes the image.bmp file andd then it makes a new savPath file
* its a void method it dosnt return anything

## ChangeColorImg method
* takes in the BufferedImage file
* iterates the length of the width then iterates the length of hieght
* then changes the rgba scale b subtracting each memebr of the scale from 255
* create new color to the new r,g,b,a values
* then we set the hieght and width and the color 


## CopImg method 
* takes in the BufferedImage file
* create the new BufferedImage while setting the height and width 
* uses Graphics2d to resize and dispose of image 
* return resize image 

## DelImg method
* takes in string image path 
* then MURDERS THE SHIT OUT OF IT !!!!!!!!!!



# Testing 
* 2 tests were made to ensure files were created and saved using Bingo , Shrink commands 
* additional test to ensure file was deleted using delete method

