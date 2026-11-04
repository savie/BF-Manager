package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.File;
import java.io.InputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractPutObjectRequest extends AmazonWebServiceRequest implements Serializable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public CannedAccessControlList f513;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public ObjectMetadata f514;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public SSEAwsKeyManagementParams f515;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public ObjectTagging f516;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public File f517;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public String f518;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public String f519;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String f520;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f521;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public transient InputStream f522;

    public AbstractPutObjectRequest(File file, String str, String str2) {
        this.f521 = str;
        this.f520 = str2;
        this.f517 = file;
    }

    public AbstractPutObjectRequest(String str, String str2, InputStream inputStream, ObjectMetadata objectMetadata) {
        this.f521 = str;
        this.f520 = str2;
        this.f522 = inputStream;
        this.f514 = objectMetadata;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m501() {
        return this.f521;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m499() {
        return this.f520;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String m504() {
        return this.f518;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m511(String str) {
        this.f518 = str;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractPutObjectRequest mo512(String str) {
        this.f518 = str;
        return this;
    }

    /* JADX INFO: renamed from: ۘ᩷, reason: not valid java name and contains not printable characters */
    public final File m492() {
        return this.f517;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ObjectMetadata m491() {
        return this.f514;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m495(ObjectMetadata objectMetadata) {
        this.f514 = objectMetadata;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public AbstractPutObjectRequest mo508(ObjectMetadata objectMetadata) {
        this.f514 = objectMetadata;
        return this;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final CannedAccessControlList m506() {
        return this.f513;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m494(CannedAccessControlList cannedAccessControlList) {
        this.f513 = cannedAccessControlList;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public AbstractPutObjectRequest mo507(CannedAccessControlList cannedAccessControlList) {
        this.f513 = cannedAccessControlList;
        return this;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InputStream m503() {
        return this.f522;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractPutObjectRequest mo493(InputStream inputStream) {
        this.f522 = inputStream;
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m498(String str) {
        this.f519 = str;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m502() {
        return this.f519;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public AbstractPutObjectRequest mo500(String str) {
        this.f519 = str;
        return this;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ObjectTagging m505() {
        return this.f516;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m496(ObjectTagging objectTagging) {
        this.f516 = objectTagging;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final SSEAwsKeyManagementParams m513() {
        return this.f515;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m497(SSEAwsKeyManagementParams sSEAwsKeyManagementParams) {
        this.f515 = sSEAwsKeyManagementParams;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public AbstractPutObjectRequest mo510(SSEAwsKeyManagementParams sSEAwsKeyManagementParams) {
        this.f515 = sSEAwsKeyManagementParams;
        return this;
    }

    @Override // com.amazonaws.AmazonWebServiceRequest
    /* JADX INFO: renamed from: clone */
    public AbstractPutObjectRequest mo156clone() {
        return (AbstractPutObjectRequest) super.mo156clone();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractPutObjectRequest m509(PutObjectRequest putObjectRequest) {
        m154(putObjectRequest);
        ObjectMetadata objectMetadata = this.f514;
        putObjectRequest.mo507(this.f513);
        putObjectRequest.mo493(this.f522);
        putObjectRequest.mo508(objectMetadata == null ? null : objectMetadata.m633clone());
        putObjectRequest.mo500(this.f519);
        putObjectRequest.mo512(this.f518);
        putObjectRequest.mo510(this.f515);
        return putObjectRequest;
    }
}
