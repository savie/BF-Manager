package l;

import java.io.IOException;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.۠᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: A186 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8859 implements InterfaceC21539 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC22044 f28945;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ IntConsumer f28946;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15945 f28947;

    public C8859(AbstractC22044 abstractC22044, C15945 c15945, IntConsumer intConsumer) {
        this.f28945 = abstractC22044;
        this.f28947 = c15945;
        this.f28946 = intConsumer;
    }

    @Override // l.InterfaceC21539
    /* JADX INFO: renamed from: ۙ */
    public final void mo15009(AbstractC22044 abstractC22044, int i) {
        this.f28947.m38029(this.f28945.mo4278(), abstractC22044.mo4278(), C21576.m49078(), this.f28946);
    }

    @Override // l.InterfaceC21539
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo15010(IOException iOException) {
        String message = iOException.getMessage();
        return message != null && message.startsWith("Unable to open target file");
    }
}
