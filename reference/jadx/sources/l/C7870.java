package l;

/* JADX INFO: renamed from: l.۠֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: K4WX */
/* JADX INFO: loaded from: classes4.dex */
public final class C7870 extends AbstractC6686 implements InterfaceC19503, InterfaceC10062 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f25898;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AbstractC8325 f25899;

    @Override // l.InterfaceC1594
    /* JADX INFO: renamed from: ۤ */
    public final String mo1142() {
        throw null;
    }

    public C7870(C17684 c17684, EnumC10297 enumC10297, int i) {
        super(c17684, enumC10297, i);
        this.f25899 = null;
        this.f25898 = -1;
    }

    @Override // l.InterfaceC19503
    /* JADX INFO: renamed from: ۠ */
    public final int mo9148() {
        return this.f22552.m41166().m42181(this.f22553 + 1) & 63;
    }

    @Override // l.InterfaceC13859
    public final InterfaceC7446 getReference() {
        AbstractC8325 abstractC8325 = this.f25899;
        if (abstractC8325 != null) {
            return abstractC8325;
        }
        C17684 c17684 = this.f22552;
        int iM42183 = c17684.m41166().m42183(this.f22553 + 2);
        try {
            return AbstractC4332.m12166(c17684, mo1143(), iM42183);
        } catch (C20880 e) {
            return new C18453(e, iM42183);
        }
    }

    @Override // l.InterfaceC13859
    /* JADX INFO: renamed from: ᩵ */
    public final int mo1143() {
        int i = this.f25898;
        if (i != -1) {
            return i;
        }
        int iM42181 = (this.f22552.m41166().m42181(this.f22553 + 1) >>> 6) + 1;
        if (iM42181 < 0 || iM42181 > 4) {
            throw new C20880(iM42181);
        }
        this.f25898 = iM42181;
        return iM42181;
    }

    @Override // l.InterfaceC10062
    /* JADX INFO: renamed from: ۙ */
    public final void mo1141(C8485 c8485) {
        this.f25899 = (AbstractC8325) c8485.m22156(getReference());
    }
}
