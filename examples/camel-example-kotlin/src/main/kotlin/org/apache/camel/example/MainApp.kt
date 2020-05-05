/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.example

import org.apache.camel.main.Main

/**
 * A static main() so we can easily run these routing rules in our IDE
 */
fun main(args: Array<String>) {
    System.out.println("\n\n\n\n");
    System.out.println("===============================================");
    System.out.println("Open your web browser on http://localhost:8080");
    System.out.println("Press ctrl+c to stop this example");
    System.out.println("===============================================");
    System.out.println("\n\n\n\n");

    val main = Main()
    main.configure().addRoutesBuilder(MyRouteBuilder())
    main.run(args)
}
