package l;

/* JADX INFO: renamed from: l.᩷֫ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class C21725 {
    public static final C21725 c = new C21725();
    public final boolean a;
    public final double b;

    public C21725() {
        this.a = false;
        this.b = Double.NaN;
    }

    public C21725(double d) {
        this.a = true;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21725)) {
            return false;
        }
        C21725 c21725 = (C21725) obj;
        boolean z = c21725.a;
        boolean z2 = this.a;
        if (z2 && z) {
            return Double.compare(this.b, c21725.b) == 0;
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
