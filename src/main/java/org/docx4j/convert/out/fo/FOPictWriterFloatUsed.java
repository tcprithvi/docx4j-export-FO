/*
   Licensed to Plutext Pty Ltd under one or more contributor license agreements.  
   
 *  This file is part of docx4j.

    docx4j is licensed under the Apache License, Version 2.0 (the "License"); 
    you may not use this file except in compliance with the License. 

    You may obtain a copy of the License at 

        http://www.apache.org/licenses/LICENSE-2.0 

    Unless required by applicable law or agreed to in writing, software 
    distributed under the License is distributed on an "AS IS" BASIS, 
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
    See the License for the specific language governing permissions and 
    limitations under the License.

 */
package org.docx4j.convert.out.fo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * FOPictWriter intended to be used in conjunction with a 
 * renderer which supports fo:float (ie, not Apache FOP).
 * 
 * Note that despite its name, this currently only handles v:textbox.
 * 
 * Images (ie ./v:shape/v:imagedata) are handled differently, by legacy code.
 * 
 * 
 * @author jharrop
 *
 */
public  class FOPictWriterFloatUsed extends FOPictWriterAbstract {
	
	protected static Logger log = LoggerFactory.getLogger(FOPictWriterFloatUsed.class);
		
	public FOPictWriterFloatUsed() {
		super();
	}
	
	@Override
	public  boolean foRendererSupportsFoFloat() {
		return true;
	}
	
}
