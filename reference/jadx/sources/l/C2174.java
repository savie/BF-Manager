package l;

/* JADX INFO: renamed from: l.ۖ֡۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 8AKK */
/* JADX INFO: loaded from: classes2.dex */
public final class C2174 implements InterfaceC6282 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Class f7886;

    public C2174(Class cls) {
        C13465.m32966(cls, "jClass");
        this.f7886 = cls;
    }

    public final int hashCode() {
        return this.f7886.hashCode();
    }

    @Override // l.InterfaceC6282
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Class mo6762() {
        return this.f7886;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2174) {
            return C13465.m32965(this.f7886, ((C2174) obj).f7886);
        }
        return false;
    }

    public final String toString() {
        return this.f7886.toString() + " (Kotlin reflection is not available)";
    }
}
