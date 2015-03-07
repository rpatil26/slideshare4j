/*
 * Copyright 2010 Rajendra Patil
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.10.21 at 04:29:20 AM GMT+05:30 
//


package com.googlecode.slideshare4j.api.response.generated;

import java.util.ArrayList;
import java.util.List;

public class SlideshowsByGroup {


    protected String name;

    protected long count;

    protected List<Slideshow> slideshow;

    /**
     * Gets the value of the name property.
     * <p/>
     * <p/>
     * possible object is
     * {
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * <p/>
     * <p/>
     * allowed object is
     * {
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the count property.
     */
    public long getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     */
    public void setCount(long value) {
        this.count = value;
    }

    /**
     * Gets the value of the slideshow property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the slideshow property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSlideshow().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {
     */
    public List<Slideshow> getSlideshow() {
        if (slideshow == null) {
            slideshow = new ArrayList<Slideshow>();
        }
        return this.slideshow;
    }

}
