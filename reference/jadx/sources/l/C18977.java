package l;

import java.util.Map;

/* JADX INFO: renamed from: l.ᩳۡ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: I7LP */
/* JADX INFO: loaded from: classes5.dex */
public final class C18977 extends AbstractC10026 {

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7044 f61522;

    @Override // l.AbstractC6299
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC6299 mo4038(C3168 c3168, AbstractC22295 abstractC22295) {
        C18565 c18565 = (C18565) this.f21366;
        Map map = this.f21368;
        return new C18977(this.f61522, (C18565) abstractC22295, c3168, c18565, map);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18977(C7044 c7044, C18565 c18565, C3168 c3168, C18565 c18566, Map map) {
        super(c7044, c18565, c3168, c18566, map);
        this.f61522 = c7044;
    }

    @Override // l.AbstractC10026
    /* JADX INFO: renamed from: ۤ */
    public final C14479 mo4040(C14479 c14479) {
        C0310 c0310 = this.f61522.f23245;
        C18565 c18565 = (C18565) this.f21366;
        AbstractC22970 abstractC22970 = c18565.f60323.f26659.f73596;
        InterfaceC1013 interfaceC1013 = c14479.f45571;
        c0310.getClass();
        return c14479.mo30218(new C12988(c0310, interfaceC1013, c18565, abstractC22970));
    }

    @Override // l.AbstractC10026
    /* JADX INFO: renamed from: ۢۙ */
    public final AbstractC22664 mo4039() {
        AbstractC22664 abstractC22664 = ((C18565) this.f21366).f60322;
        return abstractC22664 != null ? abstractC22664.mo4935() : this.f61522.f23240.f48263;
    }
}
