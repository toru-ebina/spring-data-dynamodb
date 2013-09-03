/*
 * Copyright 2013 the original author or authors.
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
package org.socialsignin.spring.data.dynamodb.repository.support;

import java.io.Serializable;
/**
 * @author Michael Lavelle
 */
public class DynamoDBEntityWithCompositeIdMetadataImpl<T, ID extends Serializable> extends
		DynamoDBEntityMetadataSupport<T> implements DynamoDBEntityWithCompositeIdMetadata<T, ID> {

	public DynamoDBEntityWithCompositeIdMetadataImpl(Class<T> domainType) {
		super(domainType);
	}

	@Override
	public DynamoDBCompositeIdMetadata<ID> getCompositeIdMetadata(Class<ID> idClass) {
		return new DynamoDBCompositeIdMetadataImpl<ID>(idClass);
	}

}