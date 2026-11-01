package l;

/* JADX INFO: renamed from: l.ܿ᩻۠, reason: contains not printable characters */
/* JADX INFO: compiled from: BAYE */
/* JADX INFO: loaded from: classes4.dex */
public final class C17675 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC8400 f56143 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C21203 f56144 = new C21203("NO_THREAD_ELEMENTS");

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC8400 f56145 = null;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC8400 f56146 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Object m41153(InterfaceC22386 interfaceC22386) {
        Object objMo4415 = interfaceC22386.mo4415(0, C0741.f3034);
        C13465.m32962(objMo4415);
        return objMo4415;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final Object m41155(InterfaceC22386 interfaceC22386, Object obj) {
        if (obj == null) {
            obj = m41153(interfaceC22386);
        }
        if (obj == 0) {
            return f56144;
        }
        if (obj instanceof Integer) {
            return interfaceC22386.mo4415(new C24026(interfaceC22386, ((Number) obj).intValue()), C12737.f42484);
        }
        return ((InterfaceC15041) obj).m36029(interfaceC22386);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m41154(InterfaceC22386 interfaceC22386, Object obj) {
        if (obj == f56144) {
            return;
        }
        if (obj instanceof C24026) {
            ((C24026) obj).m52869(interfaceC22386);
            return;
        }
        Object objMo4415 = interfaceC22386.mo4415(null, C16970.f54302);
        if (objMo4415 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        }
        ((InterfaceC15041) objMo4415).m36030(obj);
    }
}
