package l;

import java.util.Set;

/* JADX INFO: renamed from: l.ۨܳۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5Z9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12425 extends AbstractC6460 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f39951;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C24975 f39952;

    public C12425(C24975 c24975, int i) {
        this.f39952 = c24975;
        this.f39951 = i;
    }

    @Override // l.AbstractC6460
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC3476 mo18263() {
        AbstractC2599 abstractC2599M55818 = this.f39952.m55818();
        int i = this.f39951;
        int iMo8719 = abstractC2599M55818.mo8719(i + 4);
        if (iMo8719 == 0) {
            return InterfaceC3476.f12020;
        }
        return new C20630(this, i + 16, iMo8719);
    }

    @Override // l.AbstractC6460
    /* JADX INFO: renamed from: ۤ */
    public final InterfaceC3476 mo18262() {
        C24975 c24975 = this.f39952;
        AbstractC2599 abstractC2599M55818 = c24975.m55818();
        int i = this.f39951;
        int iMo8719 = abstractC2599M55818.mo8719(i + 8);
        if (iMo8719 != 0) {
            return new C20630(this, (c24975.m55818().mo8719(i + 4) * 8) + i + 16, iMo8719);
        }
        return InterfaceC3476.f12020;
    }

    @Override // l.AbstractC6460
    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC3476 mo18264() {
        C24975 c24975 = this.f39952;
        AbstractC2599 abstractC2599M55818 = c24975.m55818();
        int i = this.f39951;
        int iMo8719 = abstractC2599M55818.mo8719(i + 12);
        if (iMo8719 != 0) {
            int iMo87110 = c24975.m55818().mo8719(i + 4);
            int i2 = iMo87110 * 8;
            return new C20630(this, (c24975.m55818().mo8719(i + 8) * 8) + i2 + i + 16, iMo8719);
        }
        return InterfaceC3476.f12020;
    }

    @Override // l.AbstractC6460
    /* JADX INFO: renamed from: ۙ */
    public final Set mo18261() {
        C24975 c24975 = this.f39952;
        return AbstractC6460.m18258(c24975, c24975.m55818().mo8719(this.f39951));
    }
}
