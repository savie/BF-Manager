package l;

/* JADX INFO: renamed from: l.ۤܶۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: S6B2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10372 extends C5774 {
    @Override // l.C5774
    /* JADX INFO: renamed from: ۙ */
    public final String mo15905() {
        return "()* loopback of 785:5: ({...}? annotation )*";
    }

    public C10372(C9770 c9770) {
        this.f19610 = c9770;
        this.f19617 = 43;
        this.f19611 = C9770.f33438;
        this.f19615 = C9770.f33121;
        this.f19618 = C9770.f32895;
        this.f19614 = C9770.f33207;
        this.f19613 = C9770.f32997;
        this.f19616 = C9770.f33086;
        this.f19612 = C9770.f32929;
    }

    @Override // l.C5774
    /* JADX INFO: renamed from: ܰ */
    public final int mo15907(int i, InterfaceC14242 interfaceC14242) throws C11502 {
        InterfaceC3739 interfaceC3739 = (InterfaceC3739) interfaceC14242;
        if (i == 0) {
            interfaceC3739.mo21038(1);
            int iIndex = interfaceC3739.index();
            interfaceC3739.mo34376();
            int i2 = interfaceC3739.mo21038(1) == 5 ? 71 : 1;
            interfaceC3739.mo34374(iIndex);
            return i2;
        }
        throw new C11502("()* loopback of 785:5: ({...}? annotation )*", 43, i, interfaceC3739);
    }
}
