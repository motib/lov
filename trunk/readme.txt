        Learning Objects for Visualizations
         Programming in Java Using Jeliot
            Mordechai (Moti) Ben-Ari
      http://stwww.weizmann.ac.il/g-cs/benari/

Copyright 2007-9 by Mordechai (Moti) Ben-Ari. This work is licensed
under the Creative Commons Attribution-Noncommercial-ShareAlike 3.0
License. To view a copy of this license, visit
http://creativecommons.org/licenses/by-nc-sa/3.0/; or, (b) send a letter
to Creative Commons, 543 Howard Street, 5th Floor, San Francisco,
California, 94105, USA.

Installation

Download and open the archive lov-N.zip (where N is a version number).
There will be three directores:
  src:  the Java source files;
  html: the html files, both the single file lov.html and
        a file with hyperlinks index.html;
  text: which contains the LaTeX source file.
The top level directory contains the complete text in PDF.

Directories html and src can be used for a website for LOV.

Building

To create the pdf file, "cd text" and execute twice:
  pdflatex lov

The HeVeA package available at http://hevea.inria.fr/ is used
to create the html files.

The following commands are for Windows,
assuming that HeVeA is installed at c:\hevea.

To create a single html file, "cd text" and execute twice:
  c:\hevea\hevea -o ..\html\lov.html lov

Then, to create the file with hyperlinks, "cd html" and execute:
  c:\hevea\hacha lov.html
