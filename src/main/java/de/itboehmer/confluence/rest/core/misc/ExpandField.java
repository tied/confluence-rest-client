/**
 * Copyright 2016 Micromata GmbH
 * Modifications Copyright 2017 Martin Böhmer
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
package de.itboehmer.confluence.rest.core.misc;

/**
 * @author Christian Schulze (c.schulze@micromata.de)
 * @author Martin Böhmer
 */
public enum ExpandField {
    SPACE("space"),
    BODY_VIEW("body.view"),
    BODY_STORAGE("body.storage"),
    VERSION("version"),
    CONTAINER("container"),
    HISTORY("history"),
    CHILDREN("children"),
    OPERATIONS("operations"),
    DESCENDANTS("descendants"),
    ANCESTORS("ancestors"),
    RESTRICTIONS("restrictions"),
    METADATA_LABELS("metadata.labels");

    String name;

    ExpandField(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}