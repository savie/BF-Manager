package l;

/* JADX INFO: renamed from: l.ᩳۘ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: C7LA */
/* JADX INFO: loaded from: classes5.dex */
public final class C18825 extends AbstractC9874 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24550 f61181;

    public C18825(C24550 c24550) {
        this.f61181 = c24550;
    }

    public final String toString() {
        return "Uses[" + this.f61181 + "]";
    }

    @Override // l.InterfaceC16482
    /* JADX INFO: renamed from: ۙ */
    public final void mo1476(InterfaceC15736 interfaceC15736) {
        interfaceC15736.mo19137(this);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C18825) && this.f61181 == ((C18825) obj).f61181;
    }

    public final int hashCode() {
        return this.f61181.hashCode() * 31;
    }
}
