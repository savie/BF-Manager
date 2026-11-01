package l;

/* JADX INFO: renamed from: l.ۧ֫۠, reason: contains not printable characters */
/* JADX INFO: compiled from: V4E2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10684 extends AbstractC1809 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9314 f36476;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23384 f36477;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10684(C23384 c23384, InterfaceC8597 interfaceC8597, C9314 c9314) {
        super(interfaceC8597);
        this.f36477 = c23384;
        this.f36476 = c9314;
    }

    @Override // l.AbstractC1809, l.InterfaceC8597, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f36477.f75757) {
            C23384 c23384 = this.f36477;
            if (c23384.f75758) {
                return;
            }
            c23384.f75758 = true;
            c23384.f75757.getClass();
            super.close();
            this.f36476.m23890();
        }
    }
}
