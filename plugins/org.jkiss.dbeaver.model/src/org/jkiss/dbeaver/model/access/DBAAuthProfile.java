/*
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2020 DBeaver Corp and others
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

package org.jkiss.dbeaver.model.access;

import org.jkiss.dbeaver.model.connection.DBPConfigurationProfile;

/**
 * Auth profile.
 * Authentication properties.
 */
public class DBAAuthProfile extends DBPConfigurationProfile {

    private String dataSourceProviderId;
    private String driverId;
    private String authModelId;

    public String getDataSourceProviderId() {
        return dataSourceProviderId;
    }

    public void setDataSourceProviderId(String dataSourceProviderId) {
        this.dataSourceProviderId = dataSourceProviderId;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public String getAuthModelId() {
        return authModelId;
    }

    public void setAuthModelId(String authModelId) {
        this.authModelId = authModelId;
    }

}
