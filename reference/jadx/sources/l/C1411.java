package l;

/* JADX INFO: renamed from: l.֨᩶ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: XIYI */
/* JADX INFO: loaded from: classes3.dex */
public final class C1411 implements InterfaceC8670 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16954 f4984;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final EnumC22294 f4985;

    @Override // l.InterfaceC8670
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo5147() {
    }

    @Override // l.InterfaceC8670
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13890 mo5148() {
        return null;
    }

    public C1411(EnumC22294 enumC22294, C16954 c16954) {
        this.f4984 = c16954;
        this.f4985 = enumC22294;
    }

    @Override // l.InterfaceC8670
    public final EnumC22294 getType() {
        return this.f4985;
    }

    @Override // l.InterfaceC8670
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC1213 mo5149() {
        return this.f4984;
    }

    public final String toString() {
        return this.f4985 + ": " + this.f4984;
    }
}
