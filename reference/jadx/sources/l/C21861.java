package l;

/* JADX INFO: renamed from: l.᩷ۛۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: S6B2 */
/* JADX INFO: loaded from: classes.dex */
public final class C21861 extends C2274 {
    @Override // l.C2274
    /* JADX INFO: renamed from: ۙ */
    public final String mo7716() {
        return "()* loopback of 785:5: ({...}? annotation )*";
    }

    public C21861(C3454 c3454) {
        this.f7415 = c3454;
        this.f7418 = 43;
        this.f7419 = C3454.f11467;
        this.f7414 = C3454.f11276;
        this.f7416 = C3454.f11450;
        this.f7417 = C3454.f11310;
        this.f7412 = C3454.f11484;
        this.f7413 = C3454.f11415;
        this.f7411 = C3454.f11571;
    }

    @Override // l.C2274
    /* JADX INFO: renamed from: ᩷ */
    public final int mo7718(int i, InterfaceC17189 interfaceC17189) throws C12714 {
        InterfaceC18681 interfaceC18681 = (InterfaceC18681) interfaceC17189;
        if (i == 0) {
            interfaceC18681.mo9833(1);
            int iIndex = interfaceC18681.index();
            interfaceC18681.mo17441();
            int i2 = interfaceC18681.mo9833(1) == 5 ? 71 : 1;
            interfaceC18681.mo17437(iIndex);
            return i2;
        }
        throw new C12714("()* loopback of 785:5: ({...}? annotation )*", 43, i, interfaceC18681);
    }
}
