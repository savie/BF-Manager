package com.amazonaws.services.s3.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class BucketLifecycleConfiguration implements Serializable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f532;

    public class NoncurrentVersionTransition implements Serializable {
    }

    public class Transition implements Serializable {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m524() {
        return this.f532;
    }

    public BucketLifecycleConfiguration(ArrayList arrayList) {
        this.f532 = arrayList;
    }

    public class Rule implements Serializable {

        /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
        public ArrayList f533;

        /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
        public ArrayList f534;

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public final void m526(Transition transition) {
            if (transition == null) {
                throw new IllegalArgumentException("Transition cannot be null.");
            }
            if (this.f534 == null) {
                this.f534 = new ArrayList();
            }
            this.f534.add(transition);
        }

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public final void m525(NoncurrentVersionTransition noncurrentVersionTransition) {
            if (noncurrentVersionTransition == null) {
                throw new IllegalArgumentException("NoncurrentVersionTransition cannot be null.");
            }
            if (this.f533 == null) {
                this.f533 = new ArrayList();
            }
            this.f533.add(noncurrentVersionTransition);
        }
    }
}
