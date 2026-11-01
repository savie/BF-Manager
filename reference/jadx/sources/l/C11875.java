package l;

/* JADX INFO: renamed from: l.ۨᩳ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: R9OM */
/* JADX INFO: loaded from: classes3.dex */
public final class C11875 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f39840;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object f39841;

    public C11875(int i, InterfaceC23206 interfaceC23206) {
        this.f39841 = interfaceC23206;
        this.f39840 = i;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f39841) * 65535) + this.f39840;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11875)) {
            return false;
        }
        C11875 c11875 = (C11875) obj;
        return this.f39841 == c11875.f39841 && this.f39840 == c11875.f39840;
    }
}
