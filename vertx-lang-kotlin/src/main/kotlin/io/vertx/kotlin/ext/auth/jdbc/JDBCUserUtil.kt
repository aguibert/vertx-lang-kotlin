/*
 * Copyright 2019 Red Hat, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution.
 *
 * The Eclipse Public License is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * The Apache License v2.0 is available at
 * http://www.opensource.org/licenses/apache2.0.php
 *
 * You may elect to redistribute this code under either of these licenses.
 */
package io.vertx.kotlin.ext.auth.jdbc

import io.vertx.ext.auth.jdbc.JDBCUserUtil
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.ext.auth.jdbc.JDBCUserUtil.createUser]
 *
 * @param username the username to be set
 * @param password the passsword in clear text, will be adapted following the definitions of the defined strategy
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.auth.jdbc.JDBCUserUtil] using Vert.x codegen.
 */
suspend fun JDBCUserUtil.createUserAwait(username: String, password: String): Unit {
  return awaitResult {
    this.createUser(username, password, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.ext.auth.jdbc.JDBCUserUtil.createHashedUser]
 *
 * @param username the username to be set
 * @param hash the password hash, as result of [io.vertx.ext.auth.HashingStrategy]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.auth.jdbc.JDBCUserUtil] using Vert.x codegen.
 */
suspend fun JDBCUserUtil.createHashedUserAwait(username: String, hash: String): Unit {
  return awaitResult {
    this.createHashedUser(username, hash, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.ext.auth.jdbc.JDBCUserUtil.createUserRole]
 *
 * @param username the username to be set
 * @param role a to be set
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.auth.jdbc.JDBCUserUtil] using Vert.x codegen.
 */
suspend fun JDBCUserUtil.createUserRoleAwait(username: String, role: String): Unit {
  return awaitResult {
    this.createUserRole(username, role, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.ext.auth.jdbc.JDBCUserUtil.createRolePermission]
 *
 * @param role a to be set
 * @param permission the permission to be set
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.auth.jdbc.JDBCUserUtil] using Vert.x codegen.
 */
suspend fun JDBCUserUtil.createRolePermissionAwait(role: String, permission: String): Unit {
  return awaitResult {
    this.createRolePermission(role, permission, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

