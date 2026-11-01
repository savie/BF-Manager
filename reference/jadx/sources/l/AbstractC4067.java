package l;

/* JADX INFO: renamed from: l.ۘܽܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 952M */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4067 implements InterfaceC4981 {
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC4981) {
            return mo13811().equals(((InterfaceC4981) obj).mo13811());
        }
        return false;
    }

    public final int hashCode() {
        return mo13811().hashCode();
    }

    public final String toString() {
        return mo13811().toString();
    }
}
