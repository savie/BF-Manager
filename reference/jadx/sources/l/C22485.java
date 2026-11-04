package l;

/* JADX INFO: renamed from: l.᩸֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: O6FB */
/* JADX INFO: loaded from: classes.dex */
public final class C22485 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23435 f72770;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C18959 f72771;

    public C22485(InterfaceC23435 interfaceC23435, C18959 c18959) {
        this.f72770 = interfaceC23435;
        this.f72771 = c18959;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23435 m50719() {
        return this.f72770;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C18959 m50720() {
        return this.f72771;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22485)) {
            return false;
        }
        C22485 c22485 = (C22485) obj;
        return this.f72770.equals(c22485.f72770) && this.f72771.equals(c22485.f72771);
    }

    public final int hashCode() {
        return C17359.hash(this.f72770, this.f72771);
    }

    public final String toString() {
        return "BlockInsnPair{" + this.f72770 + ": " + this.f72771 + '}';
    }
}
