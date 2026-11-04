package l;

import java.util.Map;

/* JADX INFO: renamed from: l.᩺ۡ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: I7LP */
/* JADX INFO: loaded from: classes2.dex */
public final class C24199 extends AbstractC6299 {

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7044 f78350;

    @Override // l.AbstractC6299
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC6299 mo4038(C3168 c3168, AbstractC22295 abstractC22295) {
        C10162 c10162 = (C10162) this.f21366;
        Map map = this.f21368;
        return new C24199(this.f78350, (C10162) abstractC22295, c3168, c10162, map);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24199(C7044 c7044, C10162 c10162, C3168 c3168, C10162 c10163, Map map) {
        super(c7044, c10162, c3168, c10163, map);
        this.f78350 = c7044;
    }

    @Override // l.AbstractC6299
    /* JADX INFO: renamed from: ᩷ */
    public final AbstractC22664 mo8632(C14479 c14479) {
        C7044 c7044 = this.f78350;
        C0310 c0310 = c7044.f23245;
        InterfaceC1013 interfaceC1013 = c14479.f45571;
        AbstractC22664 abstractC22664 = c14479.f45575;
        c0310.getClass();
        C14479 c14479Mo30218 = c14479.mo30218(new C19701(c0310, interfaceC1013));
        AbstractC22295 abstractC22295 = this.f21366;
        C10162 c10162 = (C10162) abstractC22295;
        if (c10162.mo20264()) {
            return c14479Mo30218.mo30220(abstractC22295, c10162.f26659);
        }
        if (abstractC22664.m51067(EnumC21172.VOID)) {
            c14479.f45571.mo3910(this.f28301, c7044.f23245.f1704.m45975(C19859.f63863));
            return c7044.f23245.f1670.m55139(abstractC22664);
        }
        AbstractC22295 abstractC22296 = c10162.f32544;
        C7044.m19377(abstractC22296, abstractC22296.f26659, c14479Mo30218);
        AbstractC22295 abstractC22297 = c10162.f32545;
        C7044.m19377(abstractC22297, abstractC22297.f26659, c14479Mo30218);
        return c14479Mo30218.f45575;
    }
}
