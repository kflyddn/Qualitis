/*
 * Copyright 2019 WeBank
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
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

package com.webank.wedatasphere.qualitis.request.rolepermission;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author howeye
 */
public class AddRolePermissionRequest {

    @JsonProperty("role_id")
    private Long roleId;
    @JsonProperty("permission_id")
    private Long permissionId;

    public AddRolePermissionRequest() {
        // Default Constructor
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }

    @Override
    public String toString() {
        return "AddRolePermissionRequest{" +
                "roleId=" + roleId +
                ", permissionId=" + permissionId +
                '}';
    }
}
