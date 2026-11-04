package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.֫᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7KX */
/* JADX INFO: loaded from: classes3.dex */
public final class C2268 extends AbstractC9329 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17929 f7404;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2268(C17929 c17929) {
        super(c17929, EnumC10712.HIERARCHY_PHASE, new C5251(c17929));
        this.f7404 = c17929;
    }

    @Override // l.AbstractC11962
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo7699(C3168 c3168) {
        C7926 c7926 = c3168.f10279;
        if (!c7926.f26345.f38072.isEmpty() || c7926.f26345.m29588()) {
            C17929 c17929 = this.f7404;
            Iterator it = c17929.f58720.m55135(c7926.f26345.f38067).iterator();
            while (it.hasNext()) {
                AbstractC22970 abstractC22970 = ((AbstractC22664) it.next()).f73596;
                if (abstractC22970.f38066 == EnumC13603.f43213) {
                    C24550 c24550 = (C24550) abstractC22970;
                    C3168 c3168M38995 = c17929.f58726.f51524.m38995(c24550);
                    if (c24550.m29562() && !c24550.f79581 && c3168M38995 != null && c3168M38995.f10275 == c3168.f10275) {
                        c24550.f79583 = c24550.f79583.m35546(c7926.f26345);
                    }
                }
            }
        }
    }
}
