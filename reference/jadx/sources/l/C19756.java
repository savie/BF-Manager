package l;

/* JADX INFO: renamed from: l.ᩴۤۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: BAYE */
/* JADX INFO: loaded from: classes5.dex */
public final class C19756 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C7406 f63579 = new C7406("NO_THREAD_ELEMENTS");

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC23955 f63580 = null;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final InterfaceC23955 f63581 = null;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final InterfaceC23955 f63582 = null;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Object m45511(InterfaceC11536 interfaceC11536, Object obj) {
        if (obj == null) {
            obj = interfaceC11536.mo5004(0, C21994.f70949);
            C15243.m36586(obj);
        }
        if (obj == 0) {
            return f63579;
        }
        if (obj instanceof Integer) {
            return interfaceC11536.mo5004(new C5586(((Number) obj).intValue(), interfaceC11536), C22740.f73790);
        }
        return ((InterfaceC16120) obj).m38281(interfaceC11536);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m45510(InterfaceC11536 interfaceC11536, Object obj) {
        if (obj == f63579) {
            return;
        }
        if (obj instanceof C5586) {
            ((C5586) obj).m16559(interfaceC11536);
            return;
        }
        Object objMo5004 = interfaceC11536.mo5004(null, C10805.f34287);
        C15243.m36587(objMo5004, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((InterfaceC16120) objMo5004).m38282(obj);
    }
}
