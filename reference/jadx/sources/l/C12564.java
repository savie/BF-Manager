package l;

/* JADX INFO: renamed from: l.ۨᩴܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: S1VF */
/* JADX INFO: loaded from: classes4.dex */
public final class C12564 extends AbstractC21976 implements InterfaceC5656, InterfaceC11621 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3483 f40354;

    public C12564(C3483 c3483) {
        this.f40354 = c3483;
    }

    @Override // l.AbstractC21976, l.InterfaceC5656
    /* JADX INFO: renamed from: ۙ */
    public final void mo9647(C21383 c21383) {
        if (this.f40354.m11443(c21383.m13516())) {
            return;
        }
        c21383.mo13503((Object) c21383.m13516());
    }

    @Override // l.AbstractC21976, l.InterfaceC11621
    /* JADX INFO: renamed from: ۙ */
    public final void mo6610(C21383 c21383, C18399 c18399) {
        if (this.f40354.m11446(c18399.m35295())) {
            return;
        }
        String strM35295 = c18399.m35295();
        InterfaceC16842 interfaceC16842M29667 = C11818.m29667(c18399);
        if (!(interfaceC16842M29667 instanceof C13310)) {
            interfaceC16842M29667.mo13503(new C13310(strM35295));
        } else {
            ((C13310) interfaceC16842M29667).mo13503(strM35295);
        }
    }

    @Override // l.AbstractC21976, l.InterfaceC11621
    /* JADX INFO: renamed from: ۙ */
    public final void mo6609(C21383 c21383, C7958 c7958) {
        if (!EnumC2536.NATIVE.m8459(c7958.m35294())) {
            if (this.f40354.m11446(c7958.m35295())) {
                return;
            }
            m31274(c7958);
        } else {
            c21383.mo13503((Object) c21383.m13516());
            m31274(c7958);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m31274(AbstractC0500 abstractC0500) {
        String strM35295 = abstractC0500.m35295();
        if (C13923.m33909(strM35295)) {
            return;
        }
        InterfaceC16842 interfaceC16842M29667 = C11818.m29667(abstractC0500);
        if (!(interfaceC16842M29667 instanceof C13310)) {
            interfaceC16842M29667.mo13503(new C13310(strM35295));
        } else {
            ((C13310) interfaceC16842M29667).mo13503(strM35295);
        }
    }
}
