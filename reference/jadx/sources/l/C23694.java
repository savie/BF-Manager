package l;

/* JADX INFO: renamed from: l.᩻۫۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AY0 */
/* JADX INFO: loaded from: classes.dex */
public final class C23694 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m52151(Throwable th, InterfaceC22386 interfaceC22386) {
        try {
            C17343 c17343 = InterfaceC6054.f20554;
            InterfaceC6054 interfaceC6054 = (InterfaceC6054) interfaceC22386.mo4416(C17343.f55207);
            if (interfaceC6054 != null) {
                interfaceC6054.mo16451(th);
            } else {
                C10994.m27744(th, interfaceC22386);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                C13672.m33380(runtimeException, th);
                th = runtimeException;
            }
            C10994.m27744(th, interfaceC22386);
        }
    }
}
