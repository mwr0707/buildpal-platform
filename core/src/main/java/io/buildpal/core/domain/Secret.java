/*
 * Copyright 2017 Buildpal
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

package io.buildpal.core.domain;

import io.vertx.core.json.JsonObject;

import static io.buildpal.core.domain.User.PASSWORD;
import static io.buildpal.core.domain.User.USERNAME;

public class Secret extends Entity<Secret> {

    public static final String SECRET = "secret";

    public Secret() {
        super();
    }

    public Secret(JsonObject jsonObject) {
        super(jsonObject);
    }

    public String getUserName() {
        return jsonObject.getString(USERNAME);
    }

    public String getPwd() {
        return jsonObject.getString(PASSWORD);
    }
}
