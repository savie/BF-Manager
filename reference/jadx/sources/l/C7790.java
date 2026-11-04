package l;

import java.util.Map;

/* JADX INFO: renamed from: l.۟ۡ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: I7LP */
/* JADX INFO: loaded from: classes4.dex */
public final class C7790 extends AbstractC6299 {

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7044 f25863;

    @Override // l.AbstractC6299
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC6299 mo4038(C3168 c3168, AbstractC22295 abstractC22295) {
        C1412 c1412 = (C1412) this.f21366;
        Map map = this.f21368;
        return new C7790(this.f25863, (C1412) abstractC22295, c3168, c1412, map);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7790(C7044 c7044, C1412 c1412, C3168 c3168, C1412 c1413, Map map) {
        super(c7044, c1412, c3168, c1413, map);
        this.f25863 = c7044;
    }

    @Override // l.AbstractC6299
    /* JADX INFO: renamed from: ᩷ */
    public final AbstractC22664 mo8632(C14479 c14479) {
        AbstractC22295 abstractC22295 = ((C1412) this.f21366).f4986;
        this.f25863.getClass();
        return C7044.m19377(abstractC22295, abstractC22295.f26659, c14479);
    }
}
