package l;

import java.util.Iterator;
import java.util.Map;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.۠֡ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: I7LP */
/* JADX INFO: loaded from: classes4.dex */
public final class C7822 extends AbstractC11350 {

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8528 f25752;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public C11521 f25753;

    @Override // l.AbstractC11350
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC11350 mo6775(C4603 c4603, AbstractC5930 abstractC5930) {
        C9789 c9789 = (C9789) this.f38291;
        Map map = this.f38293;
        return new C7822(this.f25752, (C9789) abstractC5930, c4603, c9789, map);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7822(C8528 c8528, C9789 c9789, C4603 c4603, C9789 c97810, Map map) {
        super(c8528, c9789, c4603, c97810, map);
        this.f25752 = c8528;
        this.f25753 = C11521.empty();
    }

    @Override // l.AbstractC11350
    /* JADX INFO: renamed from: ܰ */
    public final AbstractC16579 mo6776(C1116 c1116) {
        C8528 c8528 = this.f25752;
        C6761 c6761 = c8528.f29530;
        InterfaceC18195 interfaceC18195 = c1116.f5037;
        c6761.getClass();
        C1116 c1116Mo4136 = c1116.mo4136(new C0535(c6761, interfaceC18195));
        AbstractC16579 abstractC16579 = c1116.f5036;
        if (abstractC16579.m39001(EnumC6617.VOID)) {
            c1116.f5037.mo2545(this.f34494, c8528.f29530.f22831.m51910(C14707.f48050));
            return c8528.f29530.f22802.m52440(abstractC16579);
        }
        Iterator it = ((C21825) this.f25753.orElseGet(new Supplier() { // from class: l.ᩳ֡ۤ
            @Override // java.util.function.Supplier
            public final Object get() {
                C19003 c19003 = new C19003();
                C7822 c7822 = this.f56196;
                new C18405(c7822, c19003).m49334(((C9789) c7822.f38291).f33505);
                C21825 c21825M43726 = c19003.m43726();
                c7822.f25753 = C11521.of(c21825M43726);
                return c21825M43726;
            }
        })).iterator();
        while (it.hasNext()) {
            AbstractC5930 abstractC5930 = ((C21473) it.next()).f69790;
            C8528.m22276(abstractC5930, abstractC5930.f30190, c1116);
        }
        return c1116Mo4136.f5036;
    }
}
