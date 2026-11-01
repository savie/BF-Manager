package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ܶ᩻ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: J56M */
/* JADX INFO: loaded from: classes4.dex */
public final class C15566 extends AbstractC10959 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractC10959 f50627;

    @Override // l.AbstractC10959
    /* JADX INFO: renamed from: ۙ */
    public final Object mo27716(Object obj, Object obj2) {
        throw null;
    }

    public C15566(AbstractC10959 abstractC10959) {
        this.f50627 = abstractC10959;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f50627.compare(obj2, obj);
    }

    @Override // l.AbstractC10959
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC10959 mo27718() {
        return this.f50627;
    }

    public final int hashCode() {
        return -this.f50627.hashCode();
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C15566) {
            return this.f50627.equals(((C15566) obj).f50627);
        }
        return false;
    }

    public final String toString() {
        return this.f50627 + ".reverse()";
    }
}
