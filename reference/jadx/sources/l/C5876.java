package l;

/* JADX INFO: renamed from: l.ۛۛᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5876 {
    public static final C5876 c = new C5876();
    public final boolean a;
    public final long b;

    public C5876() {
        this.a = false;
        this.b = 0L;
    }

    public C5876(long j) {
        this.a = true;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5876)) {
            return false;
        }
        C5876 c5876 = (C5876) obj;
        boolean z = c5876.a;
        boolean z2 = this.a;
        if (z2 && z) {
            return this.b == c5876.b;
        }
        return z2 == z;
    }

    public final int hashCode() {
        if (!this.a) {
            return 0;
        }
        long j = this.b;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        if (!this.a) {
            return "OptionalLong.empty";
        }
        return "OptionalLong[" + this.b + "]";
    }
}
