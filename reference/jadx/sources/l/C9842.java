package l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۢۗ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: L8GV */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C9842 implements InterfaceC2385 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC18881 f31677;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC2386 f31678;

    public /* synthetic */ C9842(AbstractC18881 abstractC18881, InterfaceC2386 interfaceC2386) {
        this.f31677 = abstractC18881;
        this.f31678 = interfaceC2386;
    }

    @Override // l.InterfaceC2385
    /* JADX INFO: renamed from: ۙ */
    public final InputStream mo8088(long j) throws IOException {
        AbstractC18881 abstractC18881 = this.f31677;
        if (abstractC18881.mo35568()) {
            return abstractC18881.mo35570(j, this.f31678.getPath());
        }
        throw new IOException();
    }
}
