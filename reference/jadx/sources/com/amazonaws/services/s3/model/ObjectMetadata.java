package com.amazonaws.services.s3.model;

import com.amazonaws.services.s3.internal.ObjectExpirationResult;
import com.amazonaws.services.s3.internal.ObjectRestoreResult;
import com.amazonaws.services.s3.internal.S3RequesterChargedResult;
import com.amazonaws.services.s3.internal.ServerSideEncryptionResult;
import com.amazonaws.util.DateUtils;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;
import l.C0561;

/* JADX INFO: loaded from: classes.dex */
public class ObjectMetadata implements ServerSideEncryptionResult, S3RequesterChargedResult, ObjectExpirationResult, ObjectRestoreResult, Cloneable, Serializable {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final String f630;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public TreeMap f631;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Map f632;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Date f633;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Date f634;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Date f635;

    @Override // com.amazonaws.services.s3.internal.ObjectExpirationResult
    /* JADX INFO: renamed from: ۨ */
    public final void mo469(String str) {
    }

    @Override // com.amazonaws.services.s3.internal.ObjectRestoreResult
    /* JADX INFO: renamed from: ۨ */
    public final void mo471(boolean z) {
    }

    static {
        SSEAlgorithm.AES256.getAlgorithm();
        f630 = SSEAlgorithm.KMS.getAlgorithm();
    }

    public ObjectMetadata() {
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        this.f632 = new TreeMap(comparator);
        this.f631 = new TreeMap(comparator);
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final Map m626() {
        return this.f632;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m623(Map map) {
        this.f632 = map;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m620(Object obj, String str) {
        this.f631.put(str, obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m622(String str, String str2) {
        this.f632.put(str, str2);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Map m625() {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        treeMap.putAll(this.f631);
        return C0561.unmodifiableMap(treeMap);
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final Object m638() {
        return this.f631.get("Content-Length");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m618() {
        Long l2 = (Long) this.f631.get("Content-Length");
        if (l2 == null) {
            return 0L;
        }
        return l2.longValue();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final long m616() {
        int iLastIndexOf;
        String str = (String) this.f631.get("Content-Range");
        if (str != null && (iLastIndexOf = str.lastIndexOf("/")) >= 0) {
            return Long.parseLong(str.substring(iLastIndexOf + 1));
        }
        return m618();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m619(long j) {
        this.f631.put("Content-Length", Long.valueOf(j));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m615() {
        return (String) this.f631.get("Content-Type");
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m617(String str) {
        this.f631.put("Content-Type", str);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m614(String str) {
        this.f631.put("Content-Encoding", str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m621(String str) {
        this.f631.put("Cache-Control", str);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m631(String str) {
        TreeMap treeMap = this.f631;
        if (str == null) {
            treeMap.remove("Content-MD5");
        } else {
            treeMap.put("Content-MD5", str);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m628() {
        return (String) this.f631.get("Content-MD5");
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m637(String str) {
        this.f631.put("Content-Disposition", str);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m624() {
        return (String) this.f631.get("ETag");
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final String m634() {
        return (String) this.f631.get("x-amz-version-id");
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final String m632() {
        return (String) this.f631.get("x-amz-server-side-encryption");
    }

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    /* JADX INFO: renamed from: ۖ */
    public final void mo480(String str) {
        this.f631.put("x-amz-server-side-encryption", str);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m635() {
        return (String) this.f631.get("x-amz-server-side-encryption-customer-algorithm");
    }

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    /* JADX INFO: renamed from: ܰ */
    public final void mo485(String str) {
        this.f631.put("x-amz-server-side-encryption-customer-algorithm", str);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m633() {
        return (String) this.f631.get("x-amz-server-side-encryption-customer-key-MD5");
    }

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    /* JADX INFO: renamed from: ۚ */
    public final void mo482(String str) {
        this.f631.put("x-amz-server-side-encryption-customer-key-MD5", str);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Date m636() {
        return DateUtils.m770(this.f633);
    }

    @Override // com.amazonaws.services.s3.internal.ObjectExpirationResult
    /* JADX INFO: renamed from: ۙ */
    public final void mo468(Date date) {
        this.f633 = date;
    }

    @Override // com.amazonaws.services.s3.internal.ObjectRestoreResult
    /* JADX INFO: renamed from: ܰ */
    public final void mo472(Date date) {
        this.f634 = date;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m629(Date date) {
        this.f635 = date;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Date m630() {
        return DateUtils.m770(this.f635);
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final ObjectMetadata m639clone() {
        TreeMap treeMap = this.f631;
        ObjectMetadata objectMetadata = new ObjectMetadata();
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        objectMetadata.f632 = new TreeMap(comparator);
        objectMetadata.f631 = new TreeMap(comparator);
        objectMetadata.f632 = this.f632 == null ? null : new TreeMap(this.f632);
        objectMetadata.f631 = treeMap != null ? new TreeMap((Map) treeMap) : null;
        objectMetadata.f633 = DateUtils.m770(this.f633);
        objectMetadata.f635 = DateUtils.m770(this.f635);
        objectMetadata.f634 = DateUtils.m770(this.f634);
        return objectMetadata;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m627() {
        return this.f631.get("x-amz-request-charged") != null;
    }

    @Override // com.amazonaws.services.s3.internal.S3RequesterChargedResult
    /* JADX INFO: renamed from: ۙ */
    public final void mo465(boolean z) {
        if (z) {
            this.f631.put("x-amz-request-charged", "requester");
        }
    }
}
