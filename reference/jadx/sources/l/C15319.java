package l;

/* JADX INFO: renamed from: l.ܶܶ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: JJ7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15319 extends Number implements Comparable {
    public static final long serialVersionUID = 62986528375L;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f49906;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.f49906;
        long j2 = ((C15319) obj).f49906;
        if (j == j2) {
            return 0;
        }
        return j < j2 ? -1 : 1;
    }

    public final Long getValue() {
        return Long.valueOf(this.f49906);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36683(Long l2) {
        this.f49906 = l2.longValue() + this.f49906;
    }

    @Override // java.lang.Number
    public final int intValue() {
        return (int) this.f49906;
    }

    @Override // java.lang.Number
    public final long longValue() {
        return this.f49906;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return this.f49906;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return this.f49906;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C15319) && this.f49906 == ((C15319) obj).f49906;
    }

    public final int hashCode() {
        long j = this.f49906;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return String.valueOf(this.f49906);
    }
}
