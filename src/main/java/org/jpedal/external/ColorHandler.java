/*
 * ===========================================
 * Java Pdf Extraction Decoding Access Library
 * ===========================================
 *
 * Project Info:  http://www.idrsolutions.com
 * Help section for developers at http://www.idrsolutions.com/support/
 *
 * (C) Copyright 1997-2015 IDRsolutions and Contributors.
 *
 * This file is part of JPedal/JPDF2HTML5
 *
     This library is free software; you can redistribute it and/or
    modify it under the terms of the GNU Lesser General Public
    License as published by the Free Software Foundation; either
    version 2.1 of the License, or (at your option) any later version.

    This library is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
    Lesser General Public License for more details.

    You should have received a copy of the GNU Lesser General Public
    License along with this library; if not, write to the Free Software
    Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA


 *
 * ---------------
 * ColorHandler.java
 * ---------------
 */
package org.jpedal.external;

import org.jpedal.color.PdfPaint;

import java.awt.*;
import java.awt.image.BufferedImage;

@SuppressWarnings("UnusedParameters")
public interface ColorHandler {

    //allow user to control how color set when rendering (ie to produce grayscale or bw)
    void setPaint(Graphics2D g2, PdfPaint textFillCol, int pageNumber, boolean isPrinting);

    //allow user to process images before drawn (ie to convert to bw or grayscale)
    BufferedImage processImage(BufferedImage image, int pageNumber, boolean isPrinting);
}
