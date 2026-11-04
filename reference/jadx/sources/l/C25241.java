package l;

/* JADX INFO: renamed from: l.᩻ᩴۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: V4E2 */
/* JADX INFO: loaded from: classes.dex */
public final class C25241 extends AbstractC17540 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16092 f81557;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17035 f81558;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25241(C17035 c17035, InterfaceC7099 interfaceC7099, C16092 c16092) {
        super(interfaceC7099);
        this.f81558 = c17035;
        this.f81557 = c16092;
    }

    @Override // l.AbstractC17540, l.InterfaceC7099, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f81558.f55658) {
            C17035 c17035 = this.f81558;
            if (c17035.f55657) {
                return;
            }
            c17035.f55657 = true;
            c17035.f55658.getClass();
            super.close();
            this.f81557.m38249();
        }
    }
}
