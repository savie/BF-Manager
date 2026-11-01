package l;

import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: l.ۚۨۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAL0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5331 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object f18400;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m14809() {
        return this.f18400;
    }

    public C5331(List list) {
        this.f18400 = list;
    }

    public final String toString() {
        return C4892.m13616((Collection) this.f18400, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C5331.class.equals(obj.getClass())) {
            return false;
        }
        return this.f18400.equals(((C5331) obj).f18400);
    }

    public final int hashCode() {
        return this.f18400.hashCode();
    }
}
