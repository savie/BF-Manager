package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class InitiateMultipartUploadRequest extends AmazonWebServiceRequest implements Serializable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f606;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public SSEAwsKeyManagementParams f607;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ObjectTagging f608;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f609;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public CannedAccessControlList f610;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public ObjectMetadata f611;

    public InitiateMultipartUploadRequest(String str, String str2) {
        this.f606 = str;
        this.f609 = str2;
    }

    public InitiateMultipartUploadRequest(String str, String str2, ObjectMetadata objectMetadata) {
        this.f606 = str;
        this.f609 = str2;
        this.f611 = objectMetadata;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m580() {
        return this.f606;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String m587() {
        return this.f609;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final CannedAccessControlList m585() {
        return this.f610;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m582(CannedAccessControlList cannedAccessControlList) {
        this.f610 = cannedAccessControlList;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final SSEAwsKeyManagementParams m586() {
        return this.f607;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m584(SSEAwsKeyManagementParams sSEAwsKeyManagementParams) {
        this.f607 = sSEAwsKeyManagementParams;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final ObjectTagging m581() {
        return this.f608;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m583(ObjectTagging objectTagging) {
        this.f608 = objectTagging;
    }
}
