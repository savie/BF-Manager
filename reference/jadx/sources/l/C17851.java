package l;

/* JADX INFO: renamed from: l.ᩳۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 165B */
/* JADX INFO: loaded from: classes5.dex */
public final class C17851 extends C18557 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public InterfaceC3739 f56538;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public InterfaceC12913 f56539;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C22085 f56540;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public InterfaceC12913 f56541;

    @Override // l.C18557, l.InterfaceC19969
    public final int getType() {
        return 0;
    }

    @Override // l.C18557, l.AbstractC21379, l.InterfaceC19969
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean mo41440() {
        return false;
    }

    @Override // l.C18557, l.InterfaceC19969
    public final String getText() {
        InterfaceC3739 interfaceC3739 = this.f56538;
        InterfaceC12913 interfaceC12913 = this.f56539;
        InterfaceC12913 interfaceC12914 = this.f56541;
        if (interfaceC12914 != null) {
            int iMo30180 = interfaceC12914.mo30180();
            int iMo30181 = interfaceC12913.mo30180();
            if (interfaceC12913.getType() == -1) {
                iMo30181 = interfaceC3739.size();
            }
            return interfaceC3739.mo10948(iMo30180, iMo30181);
        }
        if (!(interfaceC12914 instanceof InterfaceC19969)) {
            return "<unknown>";
        }
        ((InterfaceC16441) interfaceC3739).getClass();
        return "n/a";
    }

    @Override // l.C18557
    public final String toString() {
        C22085 c22085 = this.f56540;
        if (c22085 instanceof C13619) {
            return C12441.m30911(((C13619) c22085).f11055, ">", new StringBuilder("<missing type: "));
        }
        if (c22085 instanceof C6562) {
            return "<extraneous: " + ((C6562) c22085).f71539 + ", resync=" + getText() + ">";
        }
        if (c22085 instanceof C2951) {
            return "<mismatched token: " + c22085.f71539 + ", resync=" + getText() + ">";
        }
        if (!(c22085 instanceof C11502)) {
            return "<error: " + getText() + ">";
        }
        return "<unexpected: " + c22085.f71539 + ", resync=" + getText() + ">";
    }
}
