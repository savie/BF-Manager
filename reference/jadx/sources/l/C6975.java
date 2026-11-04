package l;

/* JADX INFO: renamed from: l.ۜۜ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: HAYQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C6975 extends C15374 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f23012;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6975() {
        super(true);
        boolean z = true;
        m36820((InterfaceC9211) null);
        InterfaceC23427 interfaceC23427M36817 = m36817();
        C3289 c3289 = interfaceC23427M36817 instanceof C3289 ? (C3289) interfaceC23427M36817 : null;
        if (c3289 == null) {
            z = false;
            break;
        }
        C15374 c15374M49905 = c3289.m49905();
        while (!c15374M49905.mo19278()) {
            InterfaceC23427 interfaceC23427M36818 = c15374M49905.m36817();
            C3289 c32810 = interfaceC23427M36818 instanceof C3289 ? (C3289) interfaceC23427M36818 : null;
            if (c32810 == null) {
                z = false;
                break;
            }
            c15374M49905 = c32810.m49905();
        }
        this.f23012 = z;
    }

    @Override // l.C15374
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean mo19278() {
        return this.f23012;
    }
}
