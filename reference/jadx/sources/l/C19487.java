package l;

/* JADX INFO: renamed from: l.ᩴ֫ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19487 {
    public static final C19487 c = new C19487();
    public final boolean a;
    public final long b;

    public C19487() {
        this.a = false;
        this.b = 0L;
    }

    public C19487(long j) {
        this.a = true;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19487)) {
            return false;
        }
        C19487 c19487 = (C19487) obj;
        boolean z = c19487.a;
        boolean z2 = this.a;
        if (z2 && z) {
            return this.b == c19487.b;
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
