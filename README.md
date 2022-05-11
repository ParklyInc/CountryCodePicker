Country Code Picker Library
==================================

![ViewCount](https://views.whatilearened.today/views/github/ParklyInc/CountryCodePicker.svg) [![GitHub issues](https://img.shields.io/github/issues/ParklyInc/CountryCodePicker)](https://github.com/ParklyInc/CountryCodePicker/issues)  [![GitHub forks](https://img.shields.io/github/forks/ParklyInc/CountryCodePicker)](https://github.com/ParklyInc/CountryCodePicker/network) [![GitHub stars](https://img.shields.io/github/stars/ParklyInc/CountryCodePicker)](https://github.com/ParklyInc/CountryCodePicker/stargazers) [![GitHub license](https://img.shields.io/github/license/ParklyInc/CountryCodePicker)](https://github.com/ParklyInc/CountryCodePicker/blob/master/License.txt) 
![GitHub search hit counter](https://img.shields.io/github/search/ParklyInc/CountryCodePicker/CountryCodePicker)


If you are looking for an android library for Country Selector or Country Spinner or Country Phone Code selector, this is the perfect place for you.

Country Code Picker (CCP) <img src="https://farm6.staticflickr.com/5726/30960801342_6e65c7ddd5_m.jpg" width="100"> or
<img src="https://farm5.staticflickr.com/4468/23591251898_f8c5e8393a_b.jpg" width="230">
  is an android library which provides an easy way to search and select country or country phone code for the telephone number.
  
  ![AwesomeCCPLIbrary](https://i.makeagif.com/media/10-02-2017/RyO2k_.gif)

Introduction
------------
* Give a professional touch to your well designed form like login screen, sign up screen, edit profile screen with CCP. When used as phone code picker, it helps by removing confusion about how to add phone number and making view more understandable. 
	  
* With CCP you can get following views easily without boilerplate code. (Left: Phone code selector. Right: Country Selector)

    - <img src="https://farm6.staticflickr.com/5625/30296514763_e3af239e2c_z.jpg" width="300">     <img src="https://farm5.staticflickr.com/4343/23591138638_45d0f08daf_b.jpg" width="400">    
    
* Tapping on CCP will open a dialog to search and select country (Left: Phone code selector. Right: Country Selector)
    - <img src="https://farm6.staticflickr.com/5686/30982885732_9e91ede573_b.jpg" width="300"> <img src="https://farm5.staticflickr.com/4384/37440899521_d19781dc52_b.jpg" width="300">

How to add to your project
--------------

Add this to your gradle file and sync.

  ````groovy
          dependencies {
            implementation 'com.github.ParklyInc:CountryCodePicker:X.Y.Z'
          }
   ````
   
Features
--------
If you prefer experience along with explanations, an demo android app is available that demonstrates all the features of this library. Click below button to download from Playstore.
<br/><a href="https://goo.gl/zI2cY2"><img src="https://raw.githubusercontent.com/hbb20/CountryCodePickerProject/master/playstore.jpeg"/></a>

* [Super easy to integrate ](https://github.com/ParklyInc/CountryCodePicker/wiki/How-to-integrate-into-your-project)
* [Full Number Support](https://github.com/ParklyInc/CountryCodePicker/wiki/Full-Number-Support)
	- Auto-Formatting
	- Number Validation
	- Validity Change Listener
	- Read / Load full number
* [Use as Country Selector / Country Spinner](https://github.com/ParklyInc/CountryCodePicker/wiki/Use-as-a-Country-Selector)
* [Country preference](https://github.com/ParklyInc/CountryCodePicker/wiki/Country-Preference)
* [Custom master list](https://github.com/ParklyInc/CountryCodePicker/wiki/Custom-Master-Country-List)
* [Country Selection Change Listener](https://github.com/ParklyInc/CountryCodePicker/wiki/Country-Change-Listener)
* [Multi-language support](https://github.com/ParklyInc/CountryCodePicker/wiki/Multi-Language-Support)
* Customizable [CCP theme](https://github.com/ParklyInc/CountryCodePicker/wiki/CCP-Theme-Customization) and [Dialog Theme](https://github.com/ParklyInc/CountryCodePicker/wiki/CCP-Dialog-Theme-Customization) 
* [Auto detect Country](https://github.com/ParklyInc/CountryCodePicker/wiki/Auto-detect-country)
* [Auto detect Language](https://github.com/ParklyInc/CountryCodePicker/wiki/XML-Properties#appccp_autodetectlanguagetrue-default--false-)
* [Remembers last selection](https://github.com/ParklyInc/CountryCodePicker/wiki/XML-Properties#appccp_rememberlastselectiontrue-default--false-)
* [Fast Scroller](https://github.com/ParklyInc/CountryCodePicker/wiki/XML-Properties#appccpdialog_showfastscrollerfalse-default-true-) 


## Available XML properties
To check all xml properties available for CCP and CCP Selection ppDialog, please visit the [wiki page](https://github.com/ParklyInc/CountryCodePicker/wiki/XML-Properties).

# Contribution
- To add a new country, follow the [guide to add new country](https://github.com/ParklyInc/CountryCodePicker/wiki/Guide-to-add-new-country-in-list).
- To add a new Language support, follow the [guide to add new language support](https://github.com/ParklyInc/CountryCodePicker/wiki/Add-New-Language-Support).



## License

[Apache Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)

    Copyright (C) 2016 Harsh Bhakta

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
