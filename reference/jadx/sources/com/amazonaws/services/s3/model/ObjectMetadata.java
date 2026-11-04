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
import l.C4681;

/* JADX INFO: loaded from: classes.dex */
public class ObjectMetadata implements ServerSideEncryptionResult, S3RequesterChargedResult, ObjectExpirationResult, ObjectRestoreResult, Cloneable, Serializable {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final String f620;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Date f621;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public Map f622;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Date f623;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public TreeMap f624;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Date f625;

    @Override // com.amazonaws.services.s3.internal.ObjectExpirationResult
    /* JADX INFO: renamed from: ۤ */
    public final void mo463(String str) {
    }

    @Override // com.amazonaws.services.s3.internal.ObjectRestoreResult
    /* JADX INFO: renamed from: ۤ */
    public final void mo465(boolean z) {
    }

    static {
        SSEAlgorithm.AES256.getAlgorithm();
        f620 = SSEAlgorithm.KMS.getAlgorithm();
    }

    public ObjectMetadata() {
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        this.f622 = new TreeMap(comparator);
        this.f624 = new TreeMap(comparator);
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final Map m610() {
        return this.f622;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m616(Map map) {
        this.f622 = map;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m613(Object obj, String str) {
        this.f624.put(str, obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m615(String str, String str2) {
        this.f622.put(str, str2);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Map m621() {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        treeMap.putAll(this.f624);
        return C4681.unmodifiableMap(treeMap);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Object m632() {
        return this.f624.get("Content-Length");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m611() {
        Long l2 = (Long) this.f624.get("Content-Length");
        if (l2 == null) {
            return 0L;
        }
        return l2.longValue();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m608() {
        int iLastIndexOf;
        String str = (String) this.f624.get("Content-Range");
        if (str != null && (iLastIndexOf = str.lastIndexOf("/")) >= 0) {
            return Long.parseLong(str.substring(iLastIndexOf + 1));
        }
        return m611();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m612(long j) {
        this.f624.put("Content-Length", Long.valueOf(j));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m619() {
        return (String) this.f624.get("Content-Type");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m609(String str) {
        this.f624.put("Content-Type", str);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m623(String str) {
        this.f624.put("Content-Encoding", str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m614(String str) {
        this.f624.put("Cache-Control", str);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m618(String str) {
        TreeMap treeMap = this.f624;
        if (str == null) {
            treeMap.remove("Content-MD5");
        } else {
            treeMap.put("Content-MD5", str);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m631() {
        return (String) this.f624.get("Content-MD5");
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m625(String str) {
        this.f624.put("Content-Disposition", str);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String m629() {
        return (String) this.f624.get("ETag");
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final String m630() {
        return (String) this.f624.get("x-amz-version-id");
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String m627() {
        return (String) this.f624.get("x-amz-server-side-encryption");
    }

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    /* JADX INFO: renamed from: ᩸ */
    public final void mo479(String str) {
        this.f624.put("x-amz-server-side-encryption", str);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m628() {
        return (String) this.f624.get("x-amz-server-side-encryption-customer-algorithm");
    }

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    /* JADX INFO: renamed from: ᩷ */
    public final void mo478(String str) {
        this.f624.put("x-amz-server-side-encryption-customer-algorithm", str);
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final String m626() {
        return (String) this.f624.get("x-amz-server-side-encryption-customer-key-MD5");
    }

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    /* JADX INFO: renamed from: ᩴ */
    public final void mo476(String str) {
        this.f624.put("x-amz-server-side-encryption-customer-key-MD5", str);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Date m624() {
        return DateUtils.m764(this.f623);
    }

    @Override // com.amazonaws.services.s3.internal.ObjectExpirationResult
    /* JADX INFO: renamed from: ۙ */
    public final void mo462(Date date) {
        this.f623 = date;
    }

    @Override // com.amazonaws.services.s3.internal.ObjectRestoreResult
    /* JADX INFO: renamed from: ᩷ */
    public final void mo466(Date date) {
        this.f621 = date;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m620(Date date) {
        this.f625 = date;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Date m617() {
        return DateUtils.m764(this.f625);
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final ObjectMetadata m633clone() {
        TreeMap treeMap = this.f624;
        ObjectMetadata objectMetadata = new ObjectMetadata();
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        objectMetadata.f622 = new TreeMap(comparator);
        objectMetadata.f624 = new TreeMap(comparator);
        objectMetadata.f622 = this.f622 == null ? null : new TreeMap(this.f622);
        objectMetadata.f624 = treeMap != null ? new TreeMap((Map) treeMap) : null;
        objectMetadata.f623 = DateUtils.m764(this.f623);
        objectMetadata.f625 = DateUtils.m764(this.f625);
        objectMetadata.f621 = DateUtils.m764(this.f621);
        return objectMetadata;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m622() {
        return this.f624.get("x-amz-request-charged") != null;
    }

    @Override // com.amazonaws.services.s3.internal.S3RequesterChargedResult
    /* JADX INFO: renamed from: ۙ */
    public final void mo459(boolean z) {
        if (z) {
            this.f624.put("x-amz-request-charged", "requester");
        }
    }
}
