package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.File;
import java.io.InputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractPutObjectRequest extends AmazonWebServiceRequest implements Serializable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f523;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f524;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public String f525;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public ObjectTagging f526;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ObjectMetadata f527;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public File f528;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public SSEAwsKeyManagementParams f529;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public CannedAccessControlList f530;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public transient InputStream f531;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String f532;

    public AbstractPutObjectRequest(File file, String str, String str2) {
        this.f523 = str;
        this.f525 = str2;
        this.f528 = file;
    }

    public AbstractPutObjectRequest(String str, String str2, InputStream inputStream, ObjectMetadata objectMetadata) {
        this.f523 = str;
        this.f525 = str2;
        this.f531 = inputStream;
        this.f527 = objectMetadata;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m498() {
        return this.f523;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String m509() {
        return this.f525;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final String m515() {
        return this.f524;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public AbstractPutObjectRequest mo497(String str) {
        this.f524 = str;
        return this;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m514(String str) {
        this.f524 = str;
    }

    /* JADX INFO: renamed from: ᩷ܰ, reason: not valid java name and contains not printable characters */
    public final File m516() {
        return this.f528;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final ObjectMetadata m499() {
        return this.f527;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m502(ObjectMetadata objectMetadata) {
        this.f527 = objectMetadata;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractPutObjectRequest mo511(ObjectMetadata objectMetadata) {
        this.f527 = objectMetadata;
        return this;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final CannedAccessControlList m506() {
        return this.f530;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m501(CannedAccessControlList cannedAccessControlList) {
        this.f530 = cannedAccessControlList;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractPutObjectRequest mo510(CannedAccessControlList cannedAccessControlList) {
        this.f530 = cannedAccessControlList;
        return this;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InputStream m518() {
        return this.f531;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractPutObjectRequest mo500(InputStream inputStream) {
        this.f531 = inputStream;
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m505(String str) {
        this.f532 = str;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m507() {
        return this.f532;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public AbstractPutObjectRequest mo508(String str) {
        this.f532 = str;
        return this;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ObjectTagging m517() {
        return this.f526;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m503(ObjectTagging objectTagging) {
        this.f526 = objectTagging;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final SSEAwsKeyManagementParams m519() {
        return this.f529;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m504(SSEAwsKeyManagementParams sSEAwsKeyManagementParams) {
        this.f529 = sSEAwsKeyManagementParams;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractPutObjectRequest mo513(SSEAwsKeyManagementParams sSEAwsKeyManagementParams) {
        this.f529 = sSEAwsKeyManagementParams;
        return this;
    }

    @Override // com.amazonaws.AmazonWebServiceRequest
    /* JADX INFO: renamed from: clone */
    public AbstractPutObjectRequest mo162clone() {
        return (AbstractPutObjectRequest) super.mo162clone();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractPutObjectRequest m512(PutObjectRequest putObjectRequest) {
        m160(putObjectRequest);
        ObjectMetadata objectMetadata = this.f527;
        putObjectRequest.mo510(this.f530);
        putObjectRequest.mo500(this.f531);
        putObjectRequest.mo511(objectMetadata == null ? null : objectMetadata.m639clone());
        putObjectRequest.mo508(this.f532);
        putObjectRequest.mo497(this.f524);
        putObjectRequest.mo513(this.f529);
        return putObjectRequest;
    }
}
