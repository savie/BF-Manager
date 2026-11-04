package l;

import java.util.NoSuchElementException;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩹ۚۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class C23327 {
    public static final C23327 c = new C23327();
    public final boolean a;
    public final int b;

    public C23327() {
        this.a = false;
        this.b = 0;
    }

    public C23327(int i) {
        this.a = true;
        this.b = i;
    }

    public int getAsInt() {
        if (!this.a) {
            throw new NoSuchElementException("No value present");
        }
        return this.b;
    }

    public boolean isEmpty() {
        return !this.a;
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
        if (!(obj instanceof C23327)) {
            return false;
        }
        C23327 c23327 = (C23327) obj;
        boolean z = c23327.a;
        boolean z2 = this.a;
        if (z2 && z) {
            return this.b == c23327.b;
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
