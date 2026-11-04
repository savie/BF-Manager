package l;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۙ᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7KX */
/* JADX INFO: loaded from: classes3.dex */
public final class C5251 extends AbstractC9329 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17929 f18500;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5251(C17929 c17929) {
        super(c17929, EnumC10712.HEADER_PHASE, new C17183(c17929));
        this.f18500 = c17929;
    }

    @Override // l.AbstractC11962
    /* JADX INFO: renamed from: ۙ */
    public final void mo7699(C3168 c3168) {
        C7926 c7926 = c3168.f10279;
        C24550 c24550 = c7926.f26345;
        C3168 c3168M24575 = AbstractC9329.m24575(c3168, c7926);
        AbstractC22295 abstractC22295 = c7926.f26348;
        C17929 c17929 = this.f18500;
        if (abstractC22295 != null) {
            c17929.f58734.m28996(c7926.f26348, c3168M24575, c24550, c7926);
        }
        Iterator it = c7926.f26347.iterator();
        while (it.hasNext()) {
            c17929.f58734.m28996((AbstractC22295) it.next(), c3168M24575, c24550, c7926);
        }
        c17929.f58734.m29000();
        m24577(c3168, c3168M24575);
        HashSet hashSet = new HashSet();
        for (AbstractC22295 abstractC22296 : c7926.f26347) {
            AbstractC22664 abstractC22664 = abstractC22296.f26659;
            if (abstractC22664.m51067(EnumC21172.CLASS)) {
                c17929.f58725.m50013(abstractC22296, c17929.f58720.m55132(abstractC22664), hashSet);
            }
        }
        c17929.f58734.m28997(c7926.f26341.f15824, c3168M24575, c24550, c7926);
        c17929.f58718.m1959(c7926.f26343, c3168M24575, false);
        Iterator it2 = c7926.f26343.iterator();
        while (it2.hasNext()) {
            c17929.f58734.m28996((C16239) it2.next(), c3168M24575, c24550, c7926);
        }
        AbstractC11781 abstractC11781 = c24550.f38069;
        EnumC13603 enumC13603 = abstractC11781.f38066;
        EnumC13603 enumC13604 = EnumC13603.f43219;
        if (enumC13603 == enumC13604 && abstractC11781 != c3168.f10275.f61859.f9550 && c17929.f58739.m35525(c3168.f10275.f61859, c24550.f79577)) {
            C7312 c7312 = c17929.f58731;
            int i = c7926.f26658;
            EnumC4960 enumC4960M27726 = C10925.m27726(c24550);
            C11040 c11040 = C22843.f74058;
            c7312.m34517(i, new C11040("compiler", "clash.with.pkg.of.same.name", enumC4960M27726, c24550));
        }
        if (c24550.f38069.f38066 == enumC13604 && (c24550.f38071 & 1) == 0 && !c3168.f10275.f61856.mo10886(c24550.f38072.toString(), EnumC17468.SOURCE)) {
            c24550.f38071 |= 17592186044416L;
        }
    }
}
