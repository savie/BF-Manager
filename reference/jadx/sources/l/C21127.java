package l;

/* JADX INFO: renamed from: l.᩷᩷ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes5.dex */
public final class C21127 implements InterfaceC16894 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f68796;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C18485 f68797;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f68798;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f68799;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f68800 = null;

    public C21127(C18485 c18485, int i) {
        this.f68797 = c18485;
        this.f68796 = i;
        this.f68799 = c18485.m42858();
        AbstractC19191 abstractC19191M42860 = c18485.m42860();
        if (abstractC19191M42860 != null) {
            this.f68798 = (int) abstractC19191M42860.mo5212();
        } else {
            this.f68798 = 0;
        }
    }

    @Override // l.InterfaceC16894
    public final String a() {
        if (this.f68800 == null) {
            AbstractC19191 abstractC19191M42860 = this.f68797.m42860();
            if (abstractC19191M42860 != null) {
                this.f68800 = abstractC19191M42860.m44053();
            }
            if (this.f68800 == null) {
                this.f68800 = "";
            }
        }
        return this.f68800;
    }

    @Override // l.InterfaceC16894
    public final int b() {
        return this.f68798;
    }

    @Override // l.InterfaceC16894
    public final int c() {
        return this.f68796;
    }

    @Override // l.InterfaceC16894
    public final int d() {
        return this.f68799;
    }

    public final String toString() {
        return "d@" + hashCode() + this.f68800 + this.f68799 + this.f68796 + this.f68798;
    }
}
