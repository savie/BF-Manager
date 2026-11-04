package l;

/* JADX INFO: renamed from: l.ۡ۠᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AY0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9254 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m24437(Throwable th, InterfaceC11536 interfaceC11536) {
        try {
            C10000 c10000 = InterfaceC1052.f3779;
            InterfaceC1052 interfaceC1052 = (InterfaceC1052) interfaceC11536.mo5005(C10000.f32114);
            if (interfaceC1052 != null) {
                interfaceC1052.mo3950(th);
            } else {
                C17933.m41872(th, interfaceC11536);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                C18856.m43744(runtimeException, th);
                th = runtimeException;
            }
            C17933.m41872(th, interfaceC11536);
        }
    }
}
