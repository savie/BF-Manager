package l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۖۛᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2347 {
    public static final C2347 c = new C2347();
    public final boolean a;
    public final int b;

    public C2347() {
        this.a = false;
        this.b = 0;
    }

    public C2347(int i) {
        this.a = true;
        this.b = i;
    }

    public void ifPresent(IntConsumer intConsumer) {
        if (this.a) {
            intConsumer.accept(this.b);
        }
    }

    public int orElse(int i) {
        return this.a ? this.b : i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2347)) {
            return false;
        }
        C2347 c2347 = (C2347) obj;
        boolean z = c2347.a;
        boolean z2 = this.a;
        if (z2 && z) {
            return this.b == c2347.b;
        }
        return z2 == z;
    }

    public final int hashCode() {
        if (this.a) {
            return this.b;
        }
        return 0;
    }

    public final String toString() {
        if (!this.a) {
            return "OptionalInt.empty";
        }
        return "OptionalInt[" + this.b + "]";
    }
}
