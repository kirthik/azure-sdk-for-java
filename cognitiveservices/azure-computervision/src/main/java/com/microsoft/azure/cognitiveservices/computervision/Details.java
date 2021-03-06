/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.cognitiveservices.computervision;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for Details.
 */
public enum Details {
    /** Enum value Celebrities. */
    CELEBRITIES("Celebrities"),

    /** Enum value Landmarks. */
    LANDMARKS("Landmarks");

    /** The actual serialized value for a Details instance. */
    private String value;

    Details(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a Details instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed Details object, or null if unable to parse.
     */
    @JsonCreator
    public static Details fromString(String value) {
        Details[] items = Details.values();
        for (Details item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
