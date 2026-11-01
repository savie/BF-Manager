package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۙۚ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: B7KX */
/* JADX INFO: loaded from: classes3.dex */
public final class C4435 extends AbstractC9998 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13609 f15772;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4435(C13609 c13609) {
        super(c13609, EnumC5992.RECORD_PHASE, new C14232(c13609));
        this.f15772 = c13609;
    }

    @Override // l.AbstractC9293
    /* JADX INFO: renamed from: ۙ */
    public final void mo1178(C4603 c4603) {
        C13609 c13609;
        C21825 c21825M1922;
        C8753 c8753 = c4603.f16301;
        C22492 c22492 = c8753.f30086;
        if ((c22492.f77447 & 2305843009213693952L) != 0) {
            Iterator it = C3128.m9444(c8753).iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                c13609 = this.f15772;
                if (!zHasNext) {
                    break;
                }
                C6656 c6656 = (C6656) it.next();
                C16142 c16142M49999 = c22492.m49999(c6656);
                if (c16142M49999 != null && c16142M49999.m38213().m48596() != c6656.f22476.f70566.m48596()) {
                    C5286 c5286 = c13609.f44896;
                    c5286.f18294 = c6656.f30189;
                    c6656.f22476.f70566 = new C0306(c5286).m1922((Object) null, c16142M49999.m38213());
                }
                c13609.f44904.m28956((AbstractC8774) c6656, c4603);
                if (!c6656.f22476.f70566.isEmpty()) {
                    C5286 c5287 = c13609.f44896;
                    c5287.f18294 = c6656.f30189;
                    c21825M1922 = new C0306(c5287).m1922((Object) null, c6656.f22476.f70566);
                } else {
                    c21825M1922 = C21825.m48588();
                }
                c22492.m50000(c16142M49999, c6656, c21825M1922);
            }
            m25266(c22492, c4603);
            for (AbstractC8774 abstractC8774 : c8753.f30090) {
                if (C3128.m9466(abstractC8774)) {
                    c13609.f44904.m28956(abstractC8774, c4603);
                }
            }
        }
    }
}
