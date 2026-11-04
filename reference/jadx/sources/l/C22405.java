package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩷᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7KX */
/* JADX INFO: loaded from: classes.dex */
public final class C22405 extends AbstractC9329 implements InterfaceC14852 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17929 f72579;

    @Override // l.InterfaceC14852
    /* JADX INFO: renamed from: ۤ */
    public final /* synthetic */ boolean mo11630() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22405(C17929 c17929) {
        super(c17929, EnumC10712.HIERARCHY_PHASE, new C2268(c17929));
        this.f72579 = c17929;
    }

    @Override // l.AbstractC11962
    /* JADX INFO: renamed from: ᩷ */
    public final void mo8759(C14769 c14769) {
        Iterator it = c14769.iterator();
        while (it.hasNext()) {
            ((C3168) it.next()).f10279.f26345.f38070 = this;
        }
        Iterator it2 = c14769.iterator();
        while (it2.hasNext()) {
            ((C3168) it2.next()).f10279.f26345.mo29590();
        }
    }

    @Override // l.AbstractC11962
    /* JADX INFO: renamed from: ۙ */
    public final void mo7699(C3168 c3168) {
        C7926 c7926 = c3168.f10279;
        C24550 c24550 = c7926.f26345;
        C10510 c10510 = (C10510) c24550.f38067;
        C3168 c3168M24575 = AbstractC9329.m24575(c3168, c7926);
        m24577(c3168, c3168M24575);
        AbstractC19728 abstractC19728 = c24550.f79577;
        C17929 c17929 = this.f72579;
        if (abstractC19728 == c17929.f58729.f49838) {
            if (c7926.f26348 != null) {
                C22092 c22092 = c17929.f58725;
                AbstractC22295 abstractC22295 = c7926.f26348;
                abstractC22295.getClass();
                c22092.m50038(abstractC22295, c10510.f33442);
                c10510.f33442 = AbstractC22664.f73590;
            } else if (c7926.f26347.m35550()) {
                C22092 c22093 = c17929.f58725;
                AbstractC22295 abstractC22296 = (AbstractC22295) c7926.f26347.f48335;
                abstractC22296.getClass();
                c22093.m50038(abstractC22296, (AbstractC22664) c10510.f33437.f48335);
                c10510.f33437 = C14769.m35543();
            }
        }
        c17929.m41863(c24550, c7926.f26341.f15824, c3168M24575);
        C22092 c22094 = c17929.f58725;
        c22094.getClass();
        C8470 c8470 = new C8470(c22094);
        c7926.mo2284(c8470);
        if (c8470.f27742 || c8470.f27744) {
            return;
        }
        c7926.f26345.f38071 |= 1073741824;
    }

    @Override // l.AbstractC9329
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC22295 mo24576(AbstractC22295 abstractC22295) {
        return C0381.f1916[abstractC22295.mo2285().ordinal()] != 1 ? abstractC22295 : ((C25191) abstractC22295).f81425;
    }

    @Override // l.InterfaceC14852
    /* JADX INFO: renamed from: ۙ */
    public final void mo11629(AbstractC11781 abstractC11781) {
        C17929 c17929 = this.f72579;
        C11972.m30026((c17929.f58733 instanceof C15691) || c17929.f58733 == this);
        if (c17929.f58733 != this) {
            abstractC11781.f38070 = this;
        } else {
            super.mo8759(C14769.of((Object) c17929.f58723.m38995((C24550) abstractC11781)));
        }
    }
}
