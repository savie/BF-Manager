package l;

/* JADX INFO: renamed from: l.᩹ܿ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AX2 */
/* JADX INFO: loaded from: classes.dex */
public final class C22427 extends RuntimeException {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22386 f73190;

    public C22427(InterfaceC22386 interfaceC22386) {
        this.f73190 = interfaceC22386;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f73190.toString();
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
