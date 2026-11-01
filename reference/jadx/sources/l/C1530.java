package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.֫ۖ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: B7KX */
/* JADX INFO: loaded from: classes3.dex */
public final class C1530 extends AbstractC8587 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13609 f6231;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1530(C13609 c13609) {
        super(c13609, EnumC5992.HIERARCHY_PHASE, new C19876(c13609));
        this.f6231 = c13609;
    }

    @Override // l.AbstractC9293
    /* JADX INFO: renamed from: ۙ */
    public final void mo1178(C4603 c4603) {
        C8753 c8753 = c4603.f16301;
        if (!c8753.f30086.f77453.isEmpty() || c8753.f30086.m52717()) {
            C13609 c13609 = this.f6231;
            Iterator it = c13609.f44895.m52356(c8753.f30086.f77449).iterator();
            while (it.hasNext()) {
                AbstractC0618 abstractC0618 = ((AbstractC16579) it.next()).f53222;
                if (abstractC0618.f77452 == EnumC10477.f35865) {
                    C22492 c22492 = (C22492) abstractC0618;
                    C4603 c4603M28678 = c13609.f44892.f31863.m28678(c22492);
                    if (c22492.m52707() && !c22492.f73416 && c4603M28678 != null && c4603M28678.f16295 == c4603.f16295) {
                        c22492.f73421 = c22492.f73421.m48591(c8753.f30086);
                    }
                }
            }
        }
    }
}
