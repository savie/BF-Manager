package l;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ۖۡ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: I7LP */
/* JADX INFO: loaded from: classes3.dex */
public final class C2569 extends AbstractC6299 {

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public C15867 f8252;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7044 f8253;

    @Override // l.AbstractC6299
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC6299 mo4038(C3168 c3168, AbstractC22295 abstractC22295) {
        C13256 c13256 = (C13256) this.f21366;
        Map map = this.f21368;
        return new C2569(this.f8253, (C13256) abstractC22295, c3168, c13256, map);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2569(C7044 c7044, C13256 c13256, C3168 c3168, C13256 c13257, Map map) {
        super(c7044, c13256, c3168, c13257, map);
        this.f8253 = c7044;
        this.f8252 = C15867.empty();
    }

    @Override // l.AbstractC6299
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 mo8632(C14479 c14479) {
        C7044 c7044 = this.f8253;
        C0310 c0310 = c7044.f23245;
        InterfaceC1013 interfaceC1013 = c14479.f45571;
        c0310.getClass();
        C14479 c14479Mo30218 = c14479.mo30218(new C19701(c0310, interfaceC1013));
        AbstractC22664 abstractC22664 = c14479.f45575;
        if (abstractC22664.m51067(EnumC21172.VOID)) {
            c14479.f45571.mo3910(this.f28301, c7044.f23245.f1704.m45975(C19859.f63853));
            return c7044.f23245.f1670.m55139(abstractC22664);
        }
        Iterator it = ((C14769) this.f8252.orElseGet(new C8562(this, 1))).iterator();
        while (it.hasNext()) {
            AbstractC22295 abstractC22295 = ((C4307) it.next()).f15611;
            C7044.m19377(abstractC22295, abstractC22295.f26659, c14479);
        }
        return c14479Mo30218.f45575;
    }
}
