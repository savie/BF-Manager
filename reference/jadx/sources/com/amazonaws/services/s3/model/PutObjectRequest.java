package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.InputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class PutObjectRequest extends AbstractPutObjectRequest implements Serializable {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f640;

    public PutObjectRequest(String str, String str2, InputStream inputStream, ObjectMetadata objectMetadata) {
        super(str, str2, inputStream, objectMetadata);
    }

    @Override // com.amazonaws.services.s3.model.AbstractPutObjectRequest, com.amazonaws.AmazonWebServiceRequest
    /* JADX INFO: renamed from: clone */
    public final AmazonWebServiceRequest mo156clone() {
        PutObjectRequest putObjectRequest = (PutObjectRequest) super.mo156clone();
        m509(putObjectRequest);
        return putObjectRequest;
    }

    @Override // com.amazonaws.services.s3.model.AbstractPutObjectRequest, com.amazonaws.AmazonWebServiceRequest
    /* JADX INFO: renamed from: clone */
    public final AbstractPutObjectRequest mo156clone() {
        PutObjectRequest putObjectRequest = (PutObjectRequest) super.mo156clone();
        m509(putObjectRequest);
        return putObjectRequest;
    }

    @Override // com.amazonaws.services.s3.model.AbstractPutObjectRequest, com.amazonaws.AmazonWebServiceRequest
    /* JADX INFO: renamed from: clone */
    public final Object mo156clone() {
        PutObjectRequest putObjectRequest = (PutObjectRequest) super.mo156clone();
        m509(putObjectRequest);
        return putObjectRequest;
    }

    @Override // com.amazonaws.services.s3.model.AbstractPutObjectRequest
    /* JADX INFO: renamed from: ᩸ */
    public final AbstractPutObjectRequest mo512(String str) {
        super.mo512(str);
        return this;
    }

    @Override // com.amazonaws.services.s3.model.AbstractPutObjectRequest
    /* JADX INFO: renamed from: ᩷ */
    public final AbstractPutObjectRequest mo508(ObjectMetadata objectMetadata) {
        super.mo508(objectMetadata);
        return this;
    }

    @Override // com.amazonaws.services.s3.model.AbstractPutObjectRequest
    /* JADX INFO: renamed from: ᩷ */
    public final AbstractPutObjectRequest mo507(CannedAccessControlList cannedAccessControlList) {
        super.mo507(cannedAccessControlList);
        return this;
    }

    @Override // com.amazonaws.services.s3.model.AbstractPutObjectRequest
    /* JADX INFO: renamed from: ۙ */
    public final AbstractPutObjectRequest mo493(InputStream inputStream) {
        super.mo493(inputStream);
        return this;
    }

    @Override // com.amazonaws.services.s3.model.AbstractPutObjectRequest
    /* JADX INFO: renamed from: ۤ */
    public final AbstractPutObjectRequest mo500(String str) {
        super.mo500(str);
        return this;
    }

    @Override // com.amazonaws.services.s3.model.AbstractPutObjectRequest
    /* JADX INFO: renamed from: ᩷ */
    public final AbstractPutObjectRequest mo510(SSEAwsKeyManagementParams sSEAwsKeyManagementParams) {
        super.mo510(sSEAwsKeyManagementParams);
        return this;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m643() {
        return this.f640;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m642(boolean z) {
        this.f640 = z;
    }
}
