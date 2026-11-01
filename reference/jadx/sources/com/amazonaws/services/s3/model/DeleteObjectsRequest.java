package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class DeleteObjectsRequest extends AmazonWebServiceRequest {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f586;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f587;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList f588 = new ArrayList();

    public DeleteObjectsRequest(String str) {
        this.f586 = str;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m560() {
        return this.f586;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m563() {
        this.f587 = true;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m564() {
        return this.f587;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m561(List list) {
        ArrayList arrayList = this.f588;
        arrayList.clear();
        arrayList.addAll(list);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final ArrayList m562() {
        return this.f588;
    }

    public class KeyVersion implements Serializable {

        /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
        public final String f589;

        public KeyVersion(String str) {
            this.f589 = str;
        }

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public final String m565() {
            return this.f589;
        }
    }
}
