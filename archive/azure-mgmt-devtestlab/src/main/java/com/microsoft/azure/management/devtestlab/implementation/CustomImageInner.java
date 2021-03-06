/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab.implementation;

import com.microsoft.azure.management.devtestlab.CustomImagePropertiesFromVm;
import com.microsoft.azure.management.devtestlab.CustomImagePropertiesCustom;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * A custom image.
 */
@JsonFlatten
public class CustomImageInner extends Resource {
    /**
     * The virtual machine from which the image is to be created.
     */
    @JsonProperty(value = "properties.vm")
    private CustomImagePropertiesFromVm vm;

    /**
     * The VHD from which the image is to be created.
     */
    @JsonProperty(value = "properties.vhd")
    private CustomImagePropertiesCustom vhd;

    /**
     * The description of the custom image.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * The author of the custom image.
     */
    @JsonProperty(value = "properties.author")
    private String author;

    /**
     * The creation date of the custom image.
     */
    @JsonProperty(value = "properties.creationDate", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime creationDate;

    /**
     * The Managed Image Id backing the custom image.
     */
    @JsonProperty(value = "properties.managedImageId")
    private String managedImageId;

    /**
     * The provisioning status of the resource.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * The unique immutable identifier of a resource (Guid).
     */
    @JsonProperty(value = "properties.uniqueIdentifier")
    private String uniqueIdentifier;

    /**
     * Get the vm value.
     *
     * @return the vm value
     */
    public CustomImagePropertiesFromVm vm() {
        return this.vm;
    }

    /**
     * Set the vm value.
     *
     * @param vm the vm value to set
     * @return the CustomImageInner object itself.
     */
    public CustomImageInner withVm(CustomImagePropertiesFromVm vm) {
        this.vm = vm;
        return this;
    }

    /**
     * Get the vhd value.
     *
     * @return the vhd value
     */
    public CustomImagePropertiesCustom vhd() {
        return this.vhd;
    }

    /**
     * Set the vhd value.
     *
     * @param vhd the vhd value to set
     * @return the CustomImageInner object itself.
     */
    public CustomImageInner withVhd(CustomImagePropertiesCustom vhd) {
        this.vhd = vhd;
        return this;
    }

    /**
     * Get the description value.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description value.
     *
     * @param description the description value to set
     * @return the CustomImageInner object itself.
     */
    public CustomImageInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the author value.
     *
     * @return the author value
     */
    public String author() {
        return this.author;
    }

    /**
     * Set the author value.
     *
     * @param author the author value to set
     * @return the CustomImageInner object itself.
     */
    public CustomImageInner withAuthor(String author) {
        this.author = author;
        return this;
    }

    /**
     * Get the creationDate value.
     *
     * @return the creationDate value
     */
    public DateTime creationDate() {
        return this.creationDate;
    }

    /**
     * Get the managedImageId value.
     *
     * @return the managedImageId value
     */
    public String managedImageId() {
        return this.managedImageId;
    }

    /**
     * Set the managedImageId value.
     *
     * @param managedImageId the managedImageId value to set
     * @return the CustomImageInner object itself.
     */
    public CustomImageInner withManagedImageId(String managedImageId) {
        this.managedImageId = managedImageId;
        return this;
    }

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState value.
     *
     * @param provisioningState the provisioningState value to set
     * @return the CustomImageInner object itself.
     */
    public CustomImageInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the uniqueIdentifier value.
     *
     * @return the uniqueIdentifier value
     */
    public String uniqueIdentifier() {
        return this.uniqueIdentifier;
    }

    /**
     * Set the uniqueIdentifier value.
     *
     * @param uniqueIdentifier the uniqueIdentifier value to set
     * @return the CustomImageInner object itself.
     */
    public CustomImageInner withUniqueIdentifier(String uniqueIdentifier) {
        this.uniqueIdentifier = uniqueIdentifier;
        return this;
    }

}
