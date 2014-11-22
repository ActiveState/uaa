/*
 * Cloud Foundry 2012.02.03 Beta
 * Copyright (c) [2009-2012] VMware, Inc. All Rights Reserved.
 *
 * This product is licensed to you under the Apache License, Version 2.0 (the "License").
 * You may not use this product except in compliance with the License.
 *
 * This product includes a number of subcomponents with
 * separate copyright notices and license terms. Your use of these
 * subcomponents is subject to the terms and conditions of the
 * subcomponent's license, as noted in the LICENSE file.
 */
package org.cloudfoundry.identity.uaa.oauth;

import org.codehaus.jackson.map.annotate.JsonSerialize;

/**
 * @author Dave Syer
 * @author Luke Taylor
 */
@JsonSerialize (include = JsonSerialize.Inclusion.NON_NULL)
public class SecretChangeRequest {

    private String oldSecret;
    private String secret;

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getOldSecret() {
        return oldSecret;
    }

    public void setOldSecret(String old) {
        this.oldSecret = old;
    }

}
