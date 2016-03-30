/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.compute.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes a data disk.
 */
public class DataDisk {
    /**
     * Gets or sets the logical unit number.
     */
    @JsonProperty(required = true)
    private int lun;

    /**
     * Gets or sets the disk name.
     */
    @JsonProperty(required = true)
    private String name;

    /**
     * Gets or sets the Virtual Hard Disk.
     */
    @JsonProperty(required = true)
    private VirtualHardDisk vhd;

    /**
     * Gets or sets the Source User Image VirtualHardDisk. This
     * VirtualHardDisk will be copied before using it to attach to the
     * Virtual Machine.If SourceImage is provided, the destination
     * VirtualHardDisk should not exist.
     */
    private VirtualHardDisk image;

    /**
     * Gets or sets the caching type. Possible values include: 'None',
     * 'ReadOnly', 'ReadWrite'.
     */
    private String caching;

    /**
     * Gets or sets the create option. Possible values include: 'fromImage',
     * 'empty', 'attach'.
     */
    @JsonProperty(required = true)
    private String createOption;

    /**
     * Gets or sets the initial disk size in GB for blank data disks, and the
     * new desired size for existing OS and Data disks.
     */
    private Integer diskSizeGB;

    /**
     * Get the lun value.
     *
     * @return the lun value
     */
    public int getLun() {
        return this.lun;
    }

    /**
     * Set the lun value.
     *
     * @param lun the lun value to set
     */
    public void setLun(int lun) {
        this.lun = lun;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the vhd value.
     *
     * @return the vhd value
     */
    public VirtualHardDisk getVhd() {
        return this.vhd;
    }

    /**
     * Set the vhd value.
     *
     * @param vhd the vhd value to set
     */
    public void setVhd(VirtualHardDisk vhd) {
        this.vhd = vhd;
    }

    /**
     * Get the image value.
     *
     * @return the image value
     */
    public VirtualHardDisk getImage() {
        return this.image;
    }

    /**
     * Set the image value.
     *
     * @param image the image value to set
     */
    public void setImage(VirtualHardDisk image) {
        this.image = image;
    }

    /**
     * Get the caching value.
     *
     * @return the caching value
     */
    public String getCaching() {
        return this.caching;
    }

    /**
     * Set the caching value.
     *
     * @param caching the caching value to set
     */
    public void setCaching(String caching) {
        this.caching = caching;
    }

    /**
     * Get the createOption value.
     *
     * @return the createOption value
     */
    public String getCreateOption() {
        return this.createOption;
    }

    /**
     * Set the createOption value.
     *
     * @param createOption the createOption value to set
     */
    public void setCreateOption(String createOption) {
        this.createOption = createOption;
    }

    /**
     * Get the diskSizeGB value.
     *
     * @return the diskSizeGB value
     */
    public Integer getDiskSizeGB() {
        return this.diskSizeGB;
    }

    /**
     * Set the diskSizeGB value.
     *
     * @param diskSizeGB the diskSizeGB value to set
     */
    public void setDiskSizeGB(Integer diskSizeGB) {
        this.diskSizeGB = diskSizeGB;
    }

}