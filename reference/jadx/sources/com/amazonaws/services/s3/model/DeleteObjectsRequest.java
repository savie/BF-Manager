package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class DeleteObjectsRequest extends AmazonWebServiceRequest {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final ArrayList f576 = new ArrayList();

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f577;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f578;

    public DeleteObjectsRequest(String str) {
        this.f578 = str;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m556() {
        return this.f578;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m555() {
        this.f577 = true;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m557() {
        return this.f577;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m554(List list) {
        ArrayList arrayList = this.f576;
        arrayList.clear();
        arrayList.addAll(list);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final ArrayList m558() {
        return this.f576;
    }

    public class KeyVersion implements Serializable {

        /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
        public final String f579;

        public KeyVersion(String str) {
            this.f579 = str;
        }

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public final String m559() {
            return this.f579;
        }
    }
}
