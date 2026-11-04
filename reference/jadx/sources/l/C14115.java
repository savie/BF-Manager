package l;

import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: l.۬᩷ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAL0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14115 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object f44637;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m34265() {
        return this.f44637;
    }

    public C14115(List list) {
        this.f44637 = list;
    }

    public final String toString() {
        return C7743.m21086((Collection) this.f44637, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C14115.class.equals(obj.getClass())) {
            return false;
        }
        return this.f44637.equals(((C14115) obj).f44637);
    }

    public final int hashCode() {
        return this.f44637.hashCode();
    }
}
