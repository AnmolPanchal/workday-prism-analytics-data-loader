/*
 * =========================================================================================
 * Copyright (c) 2018 Workday, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 *
 * Contributors:
 * Each Contributor (“You”) represents that such You are legally entitled to submit any 
 * Contributions in accordance with these terms and by posting a Contribution, you represent
 * that each of Your Contribution is Your original creation.   
 *
 * You are not expected to provide support for Your Contributions, except to the extent You 
 * desire to provide support. You may provide support for free, for a fee, or not at all. 
 * Unless required by applicable law or agreed to in writing, You provide Your Contributions 
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or 
 * implied, including, without limitation, any warranties or conditions of TITLE, 
 * NON-INFRINGEMENT, MERCHANTABILITY, or FITNESS FOR A PARTICULAR PURPOSE.
 * =========================================================================================
 */
package com.wday.prism.dataset;

import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;

import com.wday.prism.dataset.util.APIEndpoint;

/**
 * @author puneet.gupta
 *
 */
public class PrismDataLoaderParams {
	String operation = null;
	String dataset = null;
	String datasetLabel = null;
	String inputFile = null;
	Charset fileEncoding = null;
	String schemaFile = null;
	String username = null;
	String password = null;
	String token = null;
	APIEndpoint endpoint = null;
	String accessToken = null;
	boolean debug = false;
	CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
}
