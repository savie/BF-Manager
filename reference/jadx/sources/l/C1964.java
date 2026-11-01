package l;

/* JADX INFO: renamed from: l.֫ܿ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: HAYQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C1964 extends C2339 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f7378;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1964() {
        super(true);
        boolean z = true;
        m7117((InterfaceC11138) null);
        InterfaceC15227 interfaceC15227M7110 = m7110();
        C21576 c21576 = interfaceC15227M7110 instanceof C21576 ? (C21576) interfaceC15227M7110 : null;
        if (c21576 == null) {
            z = false;
            break;
        }
        C2339 c2339M10026 = c21576.m10026();
        while (!c2339M10026.mo6332()) {
            InterfaceC15227 interfaceC15227M7111 = c2339M10026.m7110();
            C21576 c21577 = interfaceC15227M7111 instanceof C21576 ? (C21576) interfaceC15227M7111 : null;
            if (c21577 == null) {
                z = false;
                break;
            }
            c2339M10026 = c21577.m10026();
        }
        this.f7378 = z;
    }

    @Override // l.C2339
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean mo6332() {
        return this.f7378;
    }
}
