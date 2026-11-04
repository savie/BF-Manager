package l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ܿۨۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: IPI */
/* JADX INFO: loaded from: classes5.dex */
public final class C18308 extends Number implements Comparable, Supplier {
    public static final long serialVersionUID = 512176391864L;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f59699;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f59699, ((C18308) obj).f59699);
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return this.f59699;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C18308) && this.f59699 == ((C18308) obj).f59699;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return this.f59699;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return Integer.valueOf(this.f59699);
    }

    @Deprecated
    public final Integer getValue() {
        return Integer.valueOf(this.f59699);
    }

    public final int hashCode() {
        return this.f59699;
    }

    @Override // java.lang.Number
    public final int intValue() {
        return this.f59699;
    }

    @Override // java.lang.Number
    public final long longValue() {
        return this.f59699;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42695(int i) {
        this.f59699 = i;
    }

    public final String toString() {
        return String.valueOf(this.f59699);
    }
}
