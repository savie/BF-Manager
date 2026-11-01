package l;

/* JADX INFO: renamed from: l.᩵ܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: P61I */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19614 extends AbstractC8325 implements InterfaceC20852 {
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return getString().compareTo(((CharSequence) obj).toString());
    }

    public final int hashCode() {
        return getString().hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof InterfaceC20852)) {
            return false;
        }
        return getString().equals(((InterfaceC20852) obj).getString());
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return getString().length();
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return getString().charAt(i);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return getString().subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return getString();
    }
}
