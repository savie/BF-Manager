package l;

/* JADX INFO: renamed from: l.ۧ᩷ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AX2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11880 extends RuntimeException {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final transient InterfaceC11536 f38300;

    public C11880(InterfaceC11536 interfaceC11536) {
        this.f38300 = interfaceC11536;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f38300.toString();
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
