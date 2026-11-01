package l;

import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ܽۛ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: J4L7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16463 implements InterfaceC12086 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12230 f52919;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8963 f52920;

    public C16463(C12230 c12230, C8963 c8963) {
        this.f52919 = c12230;
        this.f52920 = c8963;
    }

    @Override // l.InterfaceC12086
    /* JADX INFO: renamed from: ۙ */
    public final void mo30075(int i, byte[] bArr) {
        this.f52920.m23258(new ByteArrayInputStream(bArr, 0, i), null);
    }

    @Override // l.InterfaceC12086
    /* JADX INFO: renamed from: ۙ */
    public final void mo30076(ByteBuffer byteBuffer) {
        this.f52920.m23259(byteBuffer);
    }

    @Override // l.InterfaceC12086
    /* JADX INFO: renamed from: ۙ */
    public final void mo30074(int i) {
        this.f52919.f40861.m5840(i);
    }

    @Override // l.InterfaceC12086
    /* JADX INFO: renamed from: ᩹ۙ */
    public final void mo30077() {
        this.f52919.f40865 = true;
    }

    @Override // l.InterfaceC5614
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo2357() {
        return this.f52919.f40861.m5824();
    }
}
