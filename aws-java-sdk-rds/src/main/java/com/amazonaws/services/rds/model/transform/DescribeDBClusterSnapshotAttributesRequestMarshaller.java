/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.rds.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * DescribeDBClusterSnapshotAttributesRequest Marshaller
 */

public class DescribeDBClusterSnapshotAttributesRequestMarshaller implements
        Marshaller<Request<DescribeDBClusterSnapshotAttributesRequest>, DescribeDBClusterSnapshotAttributesRequest> {

    public Request<DescribeDBClusterSnapshotAttributesRequest> marshall(DescribeDBClusterSnapshotAttributesRequest describeDBClusterSnapshotAttributesRequest) {

        if (describeDBClusterSnapshotAttributesRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeDBClusterSnapshotAttributesRequest> request = new DefaultRequest<DescribeDBClusterSnapshotAttributesRequest>(
                describeDBClusterSnapshotAttributesRequest, "AmazonRDS");
        request.addParameter("Action", "DescribeDBClusterSnapshotAttributes");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeDBClusterSnapshotAttributesRequest.getDBClusterSnapshotIdentifier() != null) {
            request.addParameter("DBClusterSnapshotIdentifier",
                    StringUtils.fromString(describeDBClusterSnapshotAttributesRequest.getDBClusterSnapshotIdentifier()));
        }

        return request;
    }

}
