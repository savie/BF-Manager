package l;

/* JADX INFO: renamed from: l.֨᩻ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 165B */
/* JADX INFO: loaded from: classes3.dex */
public final class C1528 extends C9730 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC21665 f5311;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public InterfaceC21665 f5312;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C4511 f5313;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public InterfaceC18681 f5314;

    @Override // l.C9730, l.InterfaceC22915
    public final int getType() {
        return 0;
    }

    @Override // l.C9730, l.AbstractC10476, l.InterfaceC22915
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean mo5415() {
        return false;
    }

    @Override // l.C9730, l.InterfaceC22915
    public final String getText() {
        InterfaceC18681 interfaceC18681 = this.f5314;
        InterfaceC21665 interfaceC21665 = this.f5311;
        InterfaceC21665 interfaceC21666 = this.f5312;
        if (interfaceC21666 != null) {
            int iMo33100 = interfaceC21666.mo33100();
            int iMo33101 = interfaceC21665.mo33100();
            if (interfaceC21665.getType() == -1) {
                iMo33101 = interfaceC18681.size();
            }
            return interfaceC18681.mo17435(iMo33100, iMo33101);
        }
        if (!(interfaceC21666 instanceof InterfaceC22915)) {
            return "<unknown>";
        }
        ((InterfaceC15455) interfaceC18681).getClass();
        return "n/a";
    }

    @Override // l.C9730
    public final String toString() {
        C4511 c4511 = this.f5313;
        if (c4511 instanceof C20919) {
            return C12669.m31437(((C20919) c4511).f77386, ">", new StringBuilder("<missing type: "));
        }
        if (c4511 instanceof C0782) {
            return "<extraneous: " + ((C0782) c4511).f16097 + ", resync=" + getText() + ">";
        }
        if (c4511 instanceof C23903) {
            return "<mismatched token: " + c4511.f16097 + ", resync=" + getText() + ">";
        }
        if (!(c4511 instanceof C12714)) {
            return "<error: " + getText() + ">";
        }
        return "<unexpected: " + c4511.f16097 + ", resync=" + getText() + ">";
    }
}
