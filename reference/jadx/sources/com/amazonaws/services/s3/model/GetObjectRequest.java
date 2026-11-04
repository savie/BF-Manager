package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.event.ProgressListener;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class GetObjectRequest extends AmazonWebServiceRequest implements Serializable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public ArrayList f583;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public ArrayList f584;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public S3ObjectIdBuilder f585;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public ProgressListener f586;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long[] f587;

    public GetObjectRequest(String str, String str2) {
        S3ObjectIdBuilder s3ObjectIdBuilder = new S3ObjectIdBuilder();
        this.f585 = s3ObjectIdBuilder;
        this.f583 = new ArrayList();
        this.f584 = new ArrayList();
        s3ObjectIdBuilder.m650(str);
        s3ObjectIdBuilder.m652(str2);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m565() {
        return this.f585.m649();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String m568() {
        return this.f585.m651();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m566() {
        this.f585.getClass();
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long[] m562() {
        long[] jArr = this.f587;
        if (jArr == null) {
            return null;
        }
        return (long[]) jArr.clone();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m563(long j, long j2) {
        this.f587 = new long[]{j, j2};
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList m567() {
        return this.f583;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final ArrayList m564() {
        return this.f584;
    }

    @Override // com.amazonaws.AmazonWebServiceRequest
    /* JADX INFO: renamed from: ۙ */
    public final void mo153(ProgressListener progressListener) {
        this.f586 = progressListener;
    }

    @Override // com.amazonaws.AmazonWebServiceRequest
    /* JADX INFO: renamed from: ۙ */
    public final ProgressListener mo152() {
        return this.f586;
    }
}
