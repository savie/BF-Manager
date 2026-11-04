package com.amazonaws.services.s3.model;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class MultiObjectDeleteException extends AmazonS3Exception {
    public static final long serialVersionUID = -2004213552302446866L;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final ArrayList f611;

    public MultiObjectDeleteException(List list, List list2) {
        super("One or more objects could not be deleted");
        ArrayList arrayList = new ArrayList();
        this.f611 = arrayList;
        new ArrayList().addAll(list2);
        arrayList.addAll(list);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList m595() {
        return this.f611;
    }

    public class DeleteError {

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public String f612;

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public final String m596() {
            return this.f612;
        }

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public final void m597(String str) {
            this.f612 = str;
        }
    }
}
