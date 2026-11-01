package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.۟᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7702 extends AbstractC23225 implements Serializable {
    public static final C7702 b;
    public static final long serialVersionUID = 6740630888130243051L;
    public final AbstractC9114 a;

    public C7702(AbstractC9114 abstractC9114) {
        this.a = abstractC9114;
    }

    static {
        System.currentTimeMillis();
        b = new C7702(C2678.f);
    }

    @Override // l.AbstractC23225
    public final C18285 instant() {
        return C18285.ofEpochMilli(System.currentTimeMillis());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7702) {
            return this.a.equals(((C7702) obj).a);
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
