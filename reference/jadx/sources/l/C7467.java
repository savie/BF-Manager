package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.۟۫ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17L4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7467 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final C16576 f24867 = new C16576();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C19003 f24868 = new C19003();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6761 f24869;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C3836 f24870;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C5286 f24871;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C5870 f24872;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C23800 f24873;

    public C7467(C12343 c12343) {
        c12343.m30659(f24867, this);
        this.f24869 = C6761.m18268(c12343);
        this.f24872 = C5870.m16083(c12343);
        C23942.m52776(c12343);
        this.f24871 = C5286.m14576(c12343);
        this.f24870 = C3836.m11131(c12343);
        this.f24873 = C23800.m52336(c12343);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19955() {
        AbstractC16579 abstractC16579M19953;
        C5286 c5286;
        while (true) {
            C19003 c19003 = this.f24868;
            if (!c19003.m43722()) {
                return;
            }
            C8879 c8879 = (C8879) c19003.remove();
            C19003 c19004 = new C19003();
            C4603 c4603 = c8879.f30438;
            C4603 c4604 = c8879.f30438;
            C1116 c1116 = c8879.f30434;
            AbstractC23903 abstractC23903 = c8879.f30435;
            boolean zM22847 = c4603.f16296.m22847(EnumC18651.f60539);
            boolean z = false;
            C3836 c3836 = this.f24870;
            if (zM22847) {
                C15434 c15434 = (C15434) c4603.f16296;
                boolean z2 = (abstractC23903.mo20276() & 17179869184L) != 0;
                if (z2 || c15434.f50298.m48596() <= abstractC23903.f77449.mo33523().m48596()) {
                    C21825 c21825 = c15434.f50298;
                    C21825 c21825Mo33523 = abstractC23903.f77449.mo33523();
                    while (true) {
                        boolean zM48595 = c21825.m48595();
                        c5286 = this.f24871;
                        if (!zM48595 || !c21825Mo33523.m48595()) {
                            break;
                        }
                        AbstractC5930 abstractC5930 = (AbstractC5930) c21825.f70876;
                        AbstractC16579 abstractC16579 = (c21825Mo33523.f70877.m48595() || !z2) ? (AbstractC16579) c21825Mo33523.f70876 : ((C8777) c21825Mo33523.f70876).f30194;
                        if (abstractC5930.m22847(EnumC18651.f60511)) {
                            C22489 c22489 = (C22489) abstractC5930;
                            if (c22489.f73411 == EnumC5555.IMPLICIT) {
                                for (Iterator it = c22489.f73410.iterator(); it.hasNext(); it = it) {
                                    ((C6656) it.next()).f22477 = null;
                                }
                            }
                            C23800 c23800 = this.f24873;
                            if (c23800.m52404(abstractC16579)) {
                                boolean zM39001 = c23800.m52431(abstractC16579).mo16235().m39001(EnumC6617.VOID);
                                c22489.f73408 = new C19462(this, zM39001, c19004, c22489).mo3964(c22489.f73408);
                                if (!zM39001) {
                                    C12281 c12281M14644 = c5286.m14644();
                                    c12281M14644.f30190 = c3836.f14261;
                                    C11200 c11200M14635 = c5286.m14635(c12281M14644);
                                    C21452 c21452 = (C21452) c22489.f73408;
                                    c21452.f69737 = c21452.f69737.m48591(c11200M14635);
                                    c19004.m43723(new RunnableC22849(1, c22489, c11200M14635));
                                }
                            }
                            z = true;
                        }
                        c21825 = c21825.f70877;
                        if (c21825Mo33523.f70877.m48595() || !z2) {
                            c21825Mo33523 = c21825Mo33523.f70877;
                        }
                    }
                    C21825 c21826 = c15434.f50298;
                    while (c21825Mo33523.m48595()) {
                        C21825 c21827 = c15434.f50298;
                        C12281 c12281M14645 = c5286.m14644();
                        c12281M14645.f30190 = c3836.f14261;
                        c15434.f50298 = c21827.m48591(c12281M14645);
                        c21825Mo33523 = c21825Mo33523.f70877;
                        z = true;
                    }
                    c19004.m43723(new RunnableC12027(3, c15434, c21826));
                }
            }
            if (z) {
                C21825 c21825M9445 = C3128.m9445(c4603.f16296);
                AbstractC16579 abstractC165710 = c1116.f5036;
                AbstractC16579 abstractC165711 = c1116.f5036;
                C21825 c21825Mo33524 = abstractC165710.mo33523();
                while (c21825Mo33524.m48596() < c21825M9445.m48596()) {
                    c21825Mo33524 = c21825Mo33524.m48591(c3836.f14261);
                }
                AbstractC16579 abstractC165712 = c8879.f30436;
                AbstractC23903 abstractC23904 = c8879.f30435;
                C6761 c6761 = this.f24869;
                C13638.requireNonNull(c6761);
                abstractC16579M19953 = c6761.m18307(abstractC165712, abstractC23904, new C1116(c6761, c1116.f5039, abstractC165711.mo16235(), c1116.f5037, c1116.f5040), c4604, c21825M9445, c21825Mo33524, abstractC165711.mo1938());
                C9030.stream(c19004).forEach(new C21578());
            } else {
                abstractC16579M19953 = m19953(c8879.f30439, c8879.f30436, c8879.f30437, c4604, c8879.f30434);
            }
            c8879.f30439.f30190 = abstractC16579M19953;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m19954(AbstractC8774 abstractC8774, AbstractC16579 abstractC16579, AbstractC23903 abstractC23903, C4603 c4603, C1116 c1116) {
        if ((abstractC23903.f77447 & 1099511627776L) != 0 && ((C22990) c4603.f16299).f74713.m10030()) {
            AbstractC23903 abstractC23904 = ((C10290) abstractC23903.f77449).f35039;
            this.f24869.getClass();
            this.f24868.m43723(new C8879(abstractC8774, abstractC16579, abstractC23903, abstractC23904, C6761.m18290(c4603), c1116));
            return this.f24870.f14261;
        }
        return m19953(abstractC8774, abstractC16579, abstractC23903, c4603, c1116);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private AbstractC16579 m19953(AbstractC8774 abstractC8774, AbstractC16579 abstractC16579, AbstractC23903 abstractC23903, C4603 c4603, C1116 c1116) {
        AbstractC16579 abstractC165710 = c1116.f5036;
        C5870 c5870 = this.f24872;
        C13638.requireNonNull(c5870);
        C12221 c12221 = new C12221(c5870, EnumC9729.SPECULATIVE, abstractC23903, ((C22990) c4603.f16299).f74727);
        abstractC165710.getClass();
        AbstractC16579 abstractC16579M18303 = this.f24869.m18303(abstractC8774, abstractC16579, abstractC23903, (AbstractC16579) c12221.m20360(null, abstractC165710), c4603, c1116);
        AbstractC16579 abstractC165711 = c1116.f5036;
        C13638.requireNonNull(c5870);
        C12221 c12222 = new C12221(c5870, EnumC9729.CHECK, abstractC23903, ((C22990) c4603.f16299).f74727);
        abstractC165711.getClass();
        return abstractC16579M18303;
    }
}
