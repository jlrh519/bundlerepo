/*
 * $Id: AddAttributeTagParent.java 527536 2007-04-11 15:44:51Z apetrelli $
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.tiles.jsp.taglib;

import javax.servlet.jsp.JspException;

/**
 * Tag classes implementing this interface can contain nested {@link AddAttributeTag}.
 * This interface defines a method called by nested tags.
 *
 * @version $Rev: 527536 $ $Date: 2007-04-11 16:44:51 +0100 (Wed, 11 Apr 2007) $
 */
public interface AddAttributeTagParent {
    /**
     * Process the nested tag.
     *
     * @param nestedTag Nested tag to process.
     * @throws JspException If something goes wrong during processing.
     */
    void processNestedTag(AddAttributeTag nestedTag) throws JspException;

}
