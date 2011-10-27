/*
 * $Id: AttributeContextMutator.java 531864 2007-04-24 10:24:30Z apetrelli $
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
package org.apache.tiles.web.util;

import org.apache.tiles.AttributeContext;

import javax.servlet.ServletRequest;

/**
 * It represents an object able to manipulate a <code>AttributeContext</code>.
 * In other words, it is able to add, replace and remove attributes from the
 * <code>AttributeContext</code>.
 *
 * @since Tiles 2.0
 * @version $Rev: 531864 $ $Date: 2007-04-24 11:24:30 +0100 (Tue, 24 Apr 2007) $
 */
public interface AttributeContextMutator {

    /**
     * Mutate a <code>AttributeContext</code>.
     *
     * @param context The attribute context to mutate.
     * @param request The current servlet request.
     */
    void mutate(AttributeContext context, ServletRequest request);

}
