package l;

/* JADX INFO: renamed from: l.ۚۤۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: BAYE */
/* JADX INFO: loaded from: classes2.dex */
public final class C5586 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11536 f19396;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f19397;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC16120[] f19398;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Object[] f19399;

    public C5586(int i, InterfaceC11536 interfaceC11536) {
        this.f19396 = interfaceC11536;
        this.f19399 = new Object[i];
        this.f19398 = new InterfaceC16120[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16560(InterfaceC16120 interfaceC16120, Object obj) {
        int i = this.f19397;
        this.f19399[i] = obj;
        this.f19397 = i + 1;
        C15243.m36587((Object) interfaceC16120, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        this.f19398[i] = interfaceC16120;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16559(InterfaceC11536 interfaceC11536) {
        InterfaceC16120[] interfaceC16120Arr = this.f19398;
        int length = interfaceC16120Arr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            InterfaceC16120 interfaceC16120 = interfaceC16120Arr[length];
            C15243.m36586(interfaceC16120);
            interfaceC16120.m38282(this.f19399[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }
}
