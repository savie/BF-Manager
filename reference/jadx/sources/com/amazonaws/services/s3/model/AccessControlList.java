package com.amazonaws.services.s3.model;

import com.amazonaws.services.s3.internal.S3RequesterChargedResult;
import java.io.Serializable;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class AccessControlList implements Serializable, S3RequesterChargedResult {
    public static final long serialVersionUID = 8095040648034788376L;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public LinkedList f523;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Owner f524 = null;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public HashSet f525;

    @Override // com.amazonaws.services.s3.internal.S3RequesterChargedResult
    /* JADX INFO: renamed from: ۙ */
    public final void mo459(boolean z) {
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Owner m516() {
        return this.f524;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m515(Owner owner) {
        this.f524 = owner;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m514() {
        HashSet hashSet = this.f525;
        if (hashSet != null && this.f523 != null) {
            throw new IllegalStateException("Both grant set and grant list cannot be null");
        }
        if (this.f523 == null) {
            if (hashSet == null) {
                this.f523 = new LinkedList();
            } else {
                this.f523 = new LinkedList(this.f525);
                this.f525 = null;
            }
        }
        return this.f523;
    }

    public final int hashCode() {
        Owner owner = this.f524;
        int iHashCode = ((owner == null ? 0 : owner.hashCode()) + 31) * 31;
        HashSet hashSet = this.f525;
        int iHashCode2 = (iHashCode + (hashSet == null ? 0 : hashSet.hashCode())) * 31;
        LinkedList linkedList = this.f523;
        return iHashCode2 + (linkedList != null ? linkedList.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AccessControlList accessControlList = (AccessControlList) obj;
        Owner owner = this.f524;
        if (owner == null) {
            if (accessControlList.f524 != null) {
                return false;
            }
        } else if (!owner.equals(accessControlList.f524)) {
            return false;
        }
        HashSet hashSet = this.f525;
        if (hashSet == null) {
            if (accessControlList.f525 != null) {
                return false;
            }
        } else if (!hashSet.equals(accessControlList.f525)) {
            return false;
        }
        LinkedList linkedList = this.f523;
        if (linkedList == null) {
            return accessControlList.f523 == null;
        }
        return linkedList.equals(accessControlList.f523);
    }

    public final String toString() {
        return "AccessControlList [owner=" + this.f524 + ", grants=" + m514() + "]";
    }
}
