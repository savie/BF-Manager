package l;

/* JADX INFO: renamed from: l.ܿۘ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: C7LA */
/* JADX INFO: loaded from: classes5.dex */
public final class C18079 extends AbstractC9874 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14769 f59178;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C24550 f59179;

    public C18079(C24550 c24550, C14769 c14769) {
        this.f59179 = c24550;
        this.f59178 = c14769;
    }

    public final String toString() {
        return "Provides[" + this.f59179 + "," + this.f59178 + "]";
    }

    @Override // l.InterfaceC16482
    /* JADX INFO: renamed from: ۙ */
    public final void mo1476(InterfaceC15736 interfaceC15736) {
        interfaceC15736.mo19136(this);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18079)) {
            return false;
        }
        C18079 c18079 = (C18079) obj;
        return this.f59179 == c18079.f59179 && this.f59178.equals(c18079.f59178);
    }

    public final int hashCode() {
        return (this.f59178.hashCode() * 37) + (this.f59179.hashCode() * 31);
    }
}
