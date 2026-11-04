package l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.֡ۨۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: JJ7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0409 extends Number implements Comparable, Supplier {
    public static final long serialVersionUID = 62986528375L;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f1954;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f1954, ((C0409) obj).f1954);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2215(Long l2) {
        this.f1954 = l2.longValue() + this.f1954;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return this.f1954;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0409) && this.f1954 == ((C0409) obj).f1954;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return this.f1954;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.f1954);
    }

    @Deprecated
    public final Long getValue() {
        return Long.valueOf(this.f1954);
    }

    public final int hashCode() {
        long j = this.f1954;
        return (int) (j ^ (j >>> 32));
    }

    @Override // java.lang.Number
    public final int intValue() {
        return (int) this.f1954;
    }

    @Override // java.lang.Number
    public final long longValue() {
        return this.f1954;
    }

    public final String toString() {
        return String.valueOf(this.f1954);
    }
}
