/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.network;

import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.network.models.ExpressRouteCircuitPeering;
import com.microsoft.azure.management.network.models.PageImpl;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined
 * in ExpressRouteCircuitPeeringsOperations.
 */
public interface ExpressRouteCircuitPeeringsOperations {
    /**
     * The delete peering operation deletes the specified peering from the ExpressRouteCircuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> delete(String resourceGroupName, String circuitName, String peeringName) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The delete peering operation deletes the specified peering from the ExpressRouteCircuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall deleteAsync(String resourceGroupName, String circuitName, String peeringName, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * The delete peering operation deletes the specified peering from the ExpressRouteCircuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> beginDelete(String resourceGroupName, String circuitName, String peeringName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The delete peering operation deletes the specified peering from the ExpressRouteCircuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginDeleteAsync(String resourceGroupName, String circuitName, String peeringName, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * The GET peering operation retrieves the specified authorization from the ExpressRouteCircuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ExpressRouteCircuitPeering object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ExpressRouteCircuitPeering> get(String resourceGroupName, String circuitName, String peeringName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The GET peering operation retrieves the specified authorization from the ExpressRouteCircuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getAsync(String resourceGroupName, String circuitName, String peeringName, final ServiceCallback<ExpressRouteCircuitPeering> serviceCallback) throws IllegalArgumentException;

    /**
     * The Put Pering operation creates/updates an peering in the specified ExpressRouteCircuits.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param peeringParameters Parameters supplied to the create/update ExpressRouteCircuit Peering operation
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ExpressRouteCircuitPeering object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ExpressRouteCircuitPeering> createOrUpdate(String resourceGroupName, String circuitName, String peeringName, ExpressRouteCircuitPeering peeringParameters) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The Put Pering operation creates/updates an peering in the specified ExpressRouteCircuits.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param peeringParameters Parameters supplied to the create/update ExpressRouteCircuit Peering operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall createOrUpdateAsync(String resourceGroupName, String circuitName, String peeringName, ExpressRouteCircuitPeering peeringParameters, final ServiceCallback<ExpressRouteCircuitPeering> serviceCallback) throws IllegalArgumentException;

    /**
     * The Put Pering operation creates/updates an peering in the specified ExpressRouteCircuits.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param peeringParameters Parameters supplied to the create/update ExpressRouteCircuit Peering operation
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ExpressRouteCircuitPeering object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ExpressRouteCircuitPeering> beginCreateOrUpdate(String resourceGroupName, String circuitName, String peeringName, ExpressRouteCircuitPeering peeringParameters) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The Put Pering operation creates/updates an peering in the specified ExpressRouteCircuits.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param peeringParameters Parameters supplied to the create/update ExpressRouteCircuit Peering operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginCreateOrUpdateAsync(String resourceGroupName, String circuitName, String peeringName, ExpressRouteCircuitPeering peeringParameters, final ServiceCallback<ExpressRouteCircuitPeering> serviceCallback) throws IllegalArgumentException;

    /**
     * The List peering operation retrieves all the peerings in an ExpressRouteCircuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the curcuit.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;ExpressRouteCircuitPeering&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<ExpressRouteCircuitPeering>> list(final String resourceGroupName, final String circuitName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The List peering operation retrieves all the peerings in an ExpressRouteCircuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the curcuit.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listAsync(final String resourceGroupName, final String circuitName, final ListOperationCallback<ExpressRouteCircuitPeering> serviceCallback) throws IllegalArgumentException;

    /**
     * The List peering operation retrieves all the peerings in an ExpressRouteCircuit.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;ExpressRouteCircuitPeering&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PageImpl<ExpressRouteCircuitPeering>> listNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The List peering operation retrieves all the peerings in an ExpressRouteCircuit.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listNextAsync(final String nextPageLink, final ServiceCall serviceCall, final ListOperationCallback<ExpressRouteCircuitPeering> serviceCallback) throws IllegalArgumentException;

}