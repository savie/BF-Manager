package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ᩴ᩸ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20100 extends AbstractC14527 implements Serializable {
    public static final C20100 b;
    public static final long serialVersionUID = 6740630888130243051L;
    public final AbstractC22338 a;

    public C20100(AbstractC22338 abstractC22338) {
        this.a = abstractC22338;
    }

    static {
        System.currentTimeMillis();
        b = new C20100(C11149.f);
    }

    @Override // l.AbstractC14527
    public final C0358 instant() {
        return C0358.ofEpochMilli(System.currentTimeMillis());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C20100) {
            return this.a.equals(((C20100) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 1;
    }

    public final String toString() {
        return "SystemClock[" + this.a + "]";
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
    }
}
