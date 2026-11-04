package l;

import java.io.InputStream;

/* JADX INFO: renamed from: l.֫ۗ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: A6S3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1648 implements InterfaceC23473 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC7509 f5722;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC23473 f5723;

    public C1648(InterfaceC23473 interfaceC23473, InterfaceC7509 interfaceC7509) {
        this.f5723 = interfaceC23473;
        this.f5722 = interfaceC7509;
    }

    @Override // l.InterfaceC23473
    public final C16013 identity() {
        return this.f5723.identity();
    }

    @Override // l.InterfaceC23473
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InputStream mo5931() {
        InputStream inputStreamMo5931 = ((C7459) this.f5723).mo5931();
        InterfaceC7509 interfaceC7509 = this.f5722;
        return !(interfaceC7509 instanceof C16563) ? inputStreamMo5931 : new C5377(inputStreamMo5931, C16563.m39237(inputStreamMo5931, interfaceC7509));
    }
}
