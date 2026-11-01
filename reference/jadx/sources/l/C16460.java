package l;

/* JADX INFO: renamed from: l.ܽۛᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16460 {
    public static final C16460 c = new C16460();
    public final boolean a;
    public final double b;

    public C16460() {
        this.a = false;
        this.b = Double.NaN;
    }

    public C16460(double d) {
        this.a = true;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16460)) {
            return false;
        }
        C16460 c16460 = (C16460) obj;
        boolean z = c16460.a;
        boolean z2 = this.a;
        if (z2 && z) {
            return Double.compare(this.b, c16460.b) == 0;
        }
        return z2 == z;
    }

    public final int hashCode() {
        if (!this.a) {
            return 0;
        }
        long jDoubleToLongBits = Double.doubleToLongBits(this.b);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public final String toString() {
        if (!this.a) {
            return "OptionalDouble.empty";
        }
        return "OptionalDouble[" + this.b + "]";
    }
}
