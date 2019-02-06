/*
 * Copyright 2016 Lime - HighTech Solutions s.r.o.
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
package io.getlime.push.model.validator;

import io.getlime.push.model.request.GetApplicationDetailRequest;

/**
 * Validator class for get application detail request.
 *
 * @author Roman Strobl, roman.strobl@wultra.com
 */
public class GetApplicationDetailRequestValidator {

    /**
     * Validate {@link GetApplicationDetailRequest} instance.
     *
     * @param request Request to be validated.
     * @return Error message, or null in case of no error.
     */
    public static String validate(GetApplicationDetailRequest request) {
        if (request == null) {
            return "Request must not be null.";
        }
        if (request.getId() == null) {
            return "ID must not be null.";
        }
        if (request.getId() < 1) {
            return "ID must be a positive number.";
        }
        return null;
    }

}
