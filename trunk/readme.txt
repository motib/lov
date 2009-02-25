        Learning Objects for Visualizations
         Programming in Java Using Jeliot
            Mordechai (Moti) Ben-Ari
      http://stwww.weizmann.ac.il/g-cs/benari/
          Copyrights: see below.

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

The following copyright notices applies to the text files:
  
Copyright 2007-9 by Mordechai (Moti) Ben-Ari. This work is licensed
under the Creative Commons Attribution-ShareAlike 3.0
License. To view a copy of this license, visit
http://creativecommons.org/licenses/by-sa/3.0/; or, (b) send a letter
to Creative Commons, 543 Howard Street, 5th Floor, San Francisco,
California, 94105, USA.

The following copyright notice applies to the source code files:

Copyright 2007-9 by Mordechai (Moti) Ben-Ari.
This program is free software; you can redistribute it and/or
modify it under the terms of the GNU General Public License
as published by the Free Software Foundation; either version 2
of the License, or (at your option) any later version.
This program is distributed in the hope that it will be useful
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
See the GNU General Public License for more details.
You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA
02111-1307, USA.
