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
package io.vertx.kotlin.ext.web.sstore

import io.vertx.ext.web.Session
import io.vertx.ext.web.sstore.SessionStore
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Get the session with the specified ID.
 *
 * @param cookieValue the unique ID of the session
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.web.sstore.SessionStore original] using Vert.x codegen.
 */
suspend fun SessionStore.getAwait(cookieValue : String) : Session? {
  return awaitResult{
    this.get(cookieValue, it)
  }
}

/**
 * Delete the session with the specified ID.
 *
 * @param id the session id
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.web.sstore.SessionStore original] using Vert.x codegen.
 */
suspend fun SessionStore.deleteAwait(id : String) : Unit {
  return awaitResult{
    this.delete(id, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Add a session with the specified ID.
 *
 * @param session the session
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.web.sstore.SessionStore original] using Vert.x codegen.
 */
suspend fun SessionStore.putAwait(session : Session) : Unit {
  return awaitResult{
    this.put(session, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Remove all sessions from the store.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.web.sstore.SessionStore original] using Vert.x codegen.
 */
suspend fun SessionStore.clearAwait() : Unit {
  return awaitResult{
    this.clear({ ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Get the number of sessions in the store.
 * <p>
 * Beware of the result which is just an estimate, in particular with distributed session stores.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.web.sstore.SessionStore original] using Vert.x codegen.
 */
suspend fun SessionStore.sizeAwait() : Int {
  return awaitResult{
    this.size(it)
  }
}

