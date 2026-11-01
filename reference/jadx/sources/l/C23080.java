package l;

/* JADX INFO: renamed from: l.᩺ܶ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: IPI */
/* JADX INFO: loaded from: classes.dex */
public final class C23080 extends Number implements Comparable {
    public static final long serialVersionUID = 512176391864L;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f74982;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int i = this.f74982;
        int i2 = ((C23080) obj).f74982;
        if (i == i2) {
            return 0;
        }
        return i < i2 ? -1 : 1;
    }

    public final Integer getValue() {
        return Integer.valueOf(this.f74982);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51064(int i) {
        this.f74982 = i;
    }

    @Override // java.lang.Number
    public final int intValue() {
        return this.f74982;
    }

    @Override // java.lang.Number
    public final long longValue() {
        return this.f74982;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return this.f74982;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return this.f74982;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C23080) && this.f74982 == ((C23080) obj).f74982;
    }

    public final int hashCode() {
        return this.f74982;
    }

    public final String toString() {
        return String.valueOf(this.f74982);
    }
}
