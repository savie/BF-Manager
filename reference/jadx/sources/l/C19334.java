package l;

import java.io.IOException;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩵۠ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A186 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19334 implements InterfaceC12984 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC20745 f62356;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ IntConsumer f62357;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7817 f62358;

    public C19334(AbstractC20745 abstractC20745, C7817 c7817, IntConsumer intConsumer) {
        this.f62356 = abstractC20745;
        this.f62358 = c7817;
        this.f62357 = intConsumer;
    }

    @Override // l.InterfaceC12984
    /* JADX INFO: renamed from: ۙ */
    public final void mo19602(AbstractC20745 abstractC20745, int i) {
        this.f62358.m20584(this.f62356.mo24643(), abstractC20745.mo24643(), C16737.m39280(), this.f62357);
    }

    @Override // l.InterfaceC12984
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo19603(IOException iOException) {
        String message = iOException.getMessage();
        return message != null && message.startsWith("Unable to open target file");
    }
}
