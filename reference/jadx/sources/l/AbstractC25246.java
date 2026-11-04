package l;

/* JADX INFO: renamed from: l.᩻ᩴܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 952M */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC25246 implements InterfaceC6821 {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC6821) {
            return mo4357().equals(((InterfaceC6821) obj).mo4357());
        }
        return false;
    }

    public final int hashCode() {
        return mo4357().hashCode();
    }

    public final String toString() {
        return mo4357().toString();
    }
}
