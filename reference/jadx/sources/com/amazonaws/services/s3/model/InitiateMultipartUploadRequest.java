package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class InitiateMultipartUploadRequest extends AmazonWebServiceRequest implements Serializable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public CannedAccessControlList f596;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public ObjectTagging f597;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public String f598;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public SSEAwsKeyManagementParams f599;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f600;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public ObjectMetadata f601;

    public InitiateMultipartUploadRequest(String str, String str2) {
        this.f600 = str;
        this.f598 = str2;
    }

    public InitiateMultipartUploadRequest(String str, String str2, ObjectMetadata objectMetadata) {
        this.f600 = str;
        this.f598 = str2;
        this.f601 = objectMetadata;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m579() {
        return this.f600;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m580() {
        return this.f598;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final CannedAccessControlList m581() {
        return this.f596;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m575(CannedAccessControlList cannedAccessControlList) {
        this.f596 = cannedAccessControlList;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final SSEAwsKeyManagementParams m578() {
        return this.f599;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m577(SSEAwsKeyManagementParams sSEAwsKeyManagementParams) {
        this.f599 = sSEAwsKeyManagementParams;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ObjectTagging m574() {
        return this.f597;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m576(ObjectTagging objectTagging) {
        this.f597 = objectTagging;
    }
}
