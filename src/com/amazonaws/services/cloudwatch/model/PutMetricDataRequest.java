/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cloudwatch.model;
import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cloudwatch.AmazonCloudWatch#putMetricData(PutMetricDataRequest) PutMetricData operation}.
 * <p>
 * Publishes metric data points to Amazon CloudWatch. Amazon CloudWatch associates the data points with the specified metric. If the specified metric
 * does not exist, Amazon CloudWatch creates the metric. When Amazon CloudWatch creates a metric, it can take up to fifteen minutes for the metric to
 * appear in calls to the ListMetrics action.
 * </p>
 * <p>
 * Each <code>PutMetricData</code> request is limited to 8 KB in size for HTTP GET requests and is limited to 40 KB in size for HTTP POST requests.
 * </p>
 * <p>
 * <b>IMPORTANT:</b>Although the Value parameter accepts numbers of type Double, Amazon CloudWatch rejects values that are either too small or too large.
 * Values must be in the range of 8.515920e-109 to 1.174271e+108 (Base 10) or 2e-360 to 2e360 (Base 2). In addition, special values (e.g., NaN,
 * +Infinity, -Infinity) are not supported.
 * </p>
 * <p>
 * Data that is timestamped 24 hours or more in the past may take in excess of 48 hours to become available from submission time using
 * <code>GetMetricStatistics</code> .
 * </p>
 *
 * @see com.amazonaws.services.cloudwatch.AmazonCloudWatch#putMetricData(PutMetricDataRequest)
 */
public class PutMetricDataRequest extends AmazonWebServiceRequest  implements Serializable  {

    /**
     * The namespace for the metric data. <note> You cannot specify a
     * namespace that begins with "AWS/". Namespaces that begin with "AWS/"
     * are reserved for other Amazon Web Services products that send metrics
     * to Amazon CloudWatch. </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^:].*<br/>
     */
    private String namespace;

    /**
     * A list of data describing the metric.
     */
    private java.util.List<MetricDatum> metricData;

    /**
     * The namespace for the metric data. <note> You cannot specify a
     * namespace that begins with "AWS/". Namespaces that begin with "AWS/"
     * are reserved for other Amazon Web Services products that send metrics
     * to Amazon CloudWatch. </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^:].*<br/>
     *
     * @return The namespace for the metric data. <note> You cannot specify a
     *         namespace that begins with "AWS/". Namespaces that begin with "AWS/"
     *         are reserved for other Amazon Web Services products that send metrics
     *         to Amazon CloudWatch. </note>
     */
    public String getNamespace() {
        return namespace;
    }
    
    /**
     * The namespace for the metric data. <note> You cannot specify a
     * namespace that begins with "AWS/". Namespaces that begin with "AWS/"
     * are reserved for other Amazon Web Services products that send metrics
     * to Amazon CloudWatch. </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^:].*<br/>
     *
     * @param namespace The namespace for the metric data. <note> You cannot specify a
     *         namespace that begins with "AWS/". Namespaces that begin with "AWS/"
     *         are reserved for other Amazon Web Services products that send metrics
     *         to Amazon CloudWatch. </note>
     */
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }
    
    /**
     * The namespace for the metric data. <note> You cannot specify a
     * namespace that begins with "AWS/". Namespaces that begin with "AWS/"
     * are reserved for other Amazon Web Services products that send metrics
     * to Amazon CloudWatch. </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^:].*<br/>
     *
     * @param namespace The namespace for the metric data. <note> You cannot specify a
     *         namespace that begins with "AWS/". Namespaces that begin with "AWS/"
     *         are reserved for other Amazon Web Services products that send metrics
     *         to Amazon CloudWatch. </note>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PutMetricDataRequest withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    
    
    /**
     * A list of data describing the metric.
     *
     * @return A list of data describing the metric.
     */
    public java.util.List<MetricDatum> getMetricData() {
        
        if (metricData == null) {
            metricData = new java.util.ArrayList<MetricDatum>();
        }
        return metricData;
    }
    
    /**
     * A list of data describing the metric.
     *
     * @param metricData A list of data describing the metric.
     */
    public void setMetricData(java.util.Collection<MetricDatum> metricData) {
        if (metricData == null) {
            this.metricData = null;
            return;
        }

        java.util.List<MetricDatum> metricDataCopy = new java.util.ArrayList<MetricDatum>(metricData.size());
        metricDataCopy.addAll(metricData);
        this.metricData = metricDataCopy;
    }
    
    /**
     * A list of data describing the metric.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param metricData A list of data describing the metric.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PutMetricDataRequest withMetricData(MetricDatum... metricData) {
        if (getMetricData() == null) setMetricData(new java.util.ArrayList<MetricDatum>(metricData.length));
        for (MetricDatum value : metricData) {
            getMetricData().add(value);
        }
        return this;
    }
    
    /**
     * A list of data describing the metric.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param metricData A list of data describing the metric.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PutMetricDataRequest withMetricData(java.util.Collection<MetricDatum> metricData) {
        if (metricData == null) {
            this.metricData = null;
        } else {
            java.util.List<MetricDatum> metricDataCopy = new java.util.ArrayList<MetricDatum>(metricData.size());
            metricDataCopy.addAll(metricData);
            this.metricData = metricDataCopy;
        }

        return this;
    }
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");    	
        if (getNamespace() != null) sb.append("Namespace: " + getNamespace() + ",");    	
        if (getMetricData() != null) sb.append("MetricData: " + getMetricData() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode()); 
        hashCode = prime * hashCode + ((getMetricData() == null) ? 0 : getMetricData().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PutMetricDataRequest == false) return false;
        PutMetricDataRequest other = (PutMetricDataRequest)obj;
        
        if (other.getNamespace() == null ^ this.getNamespace() == null) return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false) return false; 
        if (other.getMetricData() == null ^ this.getMetricData() == null) return false;
        if (other.getMetricData() != null && other.getMetricData().equals(this.getMetricData()) == false) return false; 
        return true;
    }
    
}
    