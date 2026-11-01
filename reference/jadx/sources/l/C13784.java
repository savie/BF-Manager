package l;

/* JADX INFO: renamed from: l.ܰۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: W5OF */
/* JADX INFO: loaded from: classes4.dex */
public class C13784 extends AbstractC3384 implements InterfaceC10331, InterfaceC10062 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC18057 f45447 = EnumC18057.Format21c;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public InterfaceC7446 f45448;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f45449;

    @Override // l.InterfaceC1594
    /* JADX INFO: renamed from: ۤ */
    public final String mo1142() {
        return mo5435().f35326 + " v" + mo1140() + ", " + getReference();
    }

    public C13784(EnumC10297 enumC10297, int i, InterfaceC7446 interfaceC7446) {
        super(enumC10297);
        C13530.m33075(i);
        this.f45449 = i;
        this.f45448 = interfaceC7446;
    }

    @Override // l.InterfaceC4685
    /* JADX INFO: renamed from: ۙ */
    public final int mo1140() {
        return this.f45449;
    }

    @Override // l.InterfaceC13859
    public final InterfaceC7446 getReference() {
        return this.f45448;
    }

    @Override // l.InterfaceC10062
    /* JADX INFO: renamed from: ۙ */
    public final void mo1141(C8485 c8485) {
        this.f45448 = c8485.m22156(this.f45448);
    }

    @Override // l.InterfaceC13859
    /* JADX INFO: renamed from: ᩵ */
    public final int mo1143() {
        return this.f12506.f35329;
    }

    @Override // l.AbstractC3384
    /* JADX INFO: renamed from: ۛ */
    public final EnumC18057 mo2108() {
        return f45447;
    }
}
