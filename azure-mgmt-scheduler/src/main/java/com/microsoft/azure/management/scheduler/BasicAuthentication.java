/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.scheduler;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The BasicAuthentication model.
 */
public class BasicAuthentication extends HttpAuthentication {
    /**
     * Gets or sets the username.
     */
    @JsonProperty(value = "username")
    private String username;

    /**
     * Gets or sets the password, return value will always be empty.
     */
    @JsonProperty(value = "password")
    private String password;

    /**
     * Get the username value.
     *
     * @return the username value
     */
    public String username() {
        return this.username;
    }

    /**
     * Set the username value.
     *
     * @param username the username value to set
     * @return the BasicAuthentication object itself.
     */
    public BasicAuthentication withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password value.
     *
     * @return the password value
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password value.
     *
     * @param password the password value to set
     * @return the BasicAuthentication object itself.
     */
    public BasicAuthentication withPassword(String password) {
        this.password = password;
        return this;
    }

}
