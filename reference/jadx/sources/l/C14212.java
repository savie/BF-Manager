package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܳ֫۠, reason: contains not printable characters */
/* JADX INFO: compiled from: V4E2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14212 extends AbstractC9572 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4424 f46599;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14212(InterfaceC10008 interfaceC10008, C4424 c4424) {
        super(interfaceC10008);
        this.f46599 = c4424;
    }

    @Override // l.AbstractC9572, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f46599.close();
        super.close();
    }
}
