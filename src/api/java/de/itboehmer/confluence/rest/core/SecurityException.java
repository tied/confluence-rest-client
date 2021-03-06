/**
 * Copyright 2017 Martin Böhmer
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.itboehmer.confluence.rest.core;

/**
 * @author Martin Böhmer
 */
public class SecurityException extends RestException {

    private static final long serialVersionUID = -184282162127530712L;

    public SecurityException(int statusCode, String reasonPhrase, String message, Throwable cause) {
        super(statusCode, reasonPhrase, null, message, cause);
    }

}
