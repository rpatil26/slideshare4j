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

package com.googlecode.slideshare4j.api.response.handlers;

import com.googlecode.slideshare4j.api.response.generated.SlideshowsByTag;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

public class GetSlideShowsByTagResponseHandler extends AbstractResponseHandler {

    private GetSlideShowResponseHandler slideshowHandler;

    private final SlideshowsByTag slideshowsByTag = new SlideshowsByTag();

    public void handleStartOf(String uri, String localName, String qName,
                              Attributes attributes) throws SAXException {
        if (localName.equals(GetSlideShowResponseHandler.TAG_SLIDESHOW)) {
            slideshowHandler = new GetSlideShowResponseHandler();
            slideshowHandler.handleStartOf(uri, localName, qName, attributes);
        } else if (slideshowHandler != null) {
            slideshowHandler.handleStartOf(uri, localName, qName, attributes);
        }
    }

    public void characters(char[] ch, int start, int length)
            throws SAXException {
        if (slideshowHandler != null) {
            slideshowHandler.characters(ch, start, length);
        } else {
            value += new String(ch, start, length);
        }

    }

    public SlideshowsByTag getSlideshowsByTag() {
        return slideshowsByTag;
    }

    public void handleEndOf(String uri, String localName, String qName)
            throws SAXException {
        if (localName.equals(GetSlideShowResponseHandler.TAG_SLIDESHOW)) {
            slideshowsByTag.getSlideshow().add(slideshowHandler.getSlideshow());
            slideshowHandler = null;
        } else if (slideshowHandler != null) {
            slideshowHandler.handleEndOf(uri, localName, qName);
        } else {
            super.setValue(slideshowsByTag, localName, value);
        }
        value = "";

    }

    @Override
    public Object getResult() {
        return this.getSlideshowsByTag();
    }
}
