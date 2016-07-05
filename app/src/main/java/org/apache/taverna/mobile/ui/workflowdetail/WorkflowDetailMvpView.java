/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.taverna.mobile.ui.workflowdetail;


import org.apache.taverna.mobile.data.model.Workflow;
import org.apache.taverna.mobile.data.model.License;
import org.apache.taverna.mobile.data.model.User;
import org.apache.taverna.mobile.ui.base.MvpView;

public interface WorkflowDetailMvpView extends MvpView {

    void showProgressbar(boolean b);

    void showWorkflowDetail(Workflow workflow);

    void setImage(User user);

    void showErrorSnackBar(String error);

    void showLicense(License license);

    void showLicenseProgress(boolean b);

    void setFavouriteIcon();

    void getFavouriteIcon(boolean b);
}
