package l;

/* JADX INFO: renamed from: l.ۜ᩸ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: K4WX */
/* JADX INFO: loaded from: classes4.dex */
public final class C7425 extends AbstractC19270 implements InterfaceC13633, InterfaceC21839 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public AbstractC13679 f24437;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f24438;

    @Override // l.InterfaceC23331
    /* JADX INFO: renamed from: ۛ */
    public final String mo1543() {
        throw null;
    }

    public C7425(C24975 c24975, EnumC22631 enumC22631, int i) {
        super(c24975, enumC22631, i);
        this.f24437 = null;
        this.f24438 = -1;
    }

    @Override // l.InterfaceC13633
    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int mo20338() {
        return this.f62313.m55818().m8716(this.f62315 + 1) & 63;
    }

    @Override // l.InterfaceC6177
    public final InterfaceC10824 getReference() {
        AbstractC13679 abstractC13679 = this.f24437;
        if (abstractC13679 != null) {
            return abstractC13679;
        }
        C24975 c24975 = this.f62313;
        int iM8721 = c24975.m55818().m8721(this.f62315 + 2);
        try {
            return AbstractC11902.m29783(c24975, mo2771(), iM8721);
        } catch (C15171 e) {
            return new C8916(e, iM8721);
        }
    }

    @Override // l.InterfaceC6177
    /* JADX INFO: renamed from: ᩵ */
    public final int mo2771() {
        int i = this.f24438;
        if (i != -1) {
            return i;
        }
        int iM8716 = (this.f62313.m55818().m8716(this.f62315 + 1) >>> 6) + 1;
        if (iM8716 < 0 || iM8716 > 4) {
            throw new C15171(iM8716);
        }
        this.f24438 = iM8716;
        return iM8716;
    }

    @Override // l.InterfaceC21839
    /* JADX INFO: renamed from: ۙ */
    public final void mo2770(C8850 c8850) {
        this.f24437 = (AbstractC13679) c8850.m23714(getReference());
    }
}
