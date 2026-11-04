package l;

import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.᩶ۤ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: J4L7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21249 implements InterfaceC6116 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18265 f67802;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C25151 f67803;

    public C21249(C18265 c18265, C25151 c25151) {
        this.f67802 = c18265;
        this.f67803 = c25151;
    }

    @Override // l.InterfaceC6116
    /* JADX INFO: renamed from: ۙ */
    public final void mo17644(int i, byte[] bArr) {
        this.f67803.m56054(new ByteArrayInputStream(bArr, 0, i), null);
    }

    @Override // l.InterfaceC6116
    /* JADX INFO: renamed from: ۙ */
    public final void mo17645(ByteBuffer byteBuffer) {
        this.f67803.m56055(byteBuffer);
    }

    @Override // l.InterfaceC6116
    /* JADX INFO: renamed from: ۙ */
    public final void mo17643(int i) {
        this.f67802.f59602.m27403(i);
    }

    @Override // l.InterfaceC6116
    /* JADX INFO: renamed from: ܳۙ */
    public final void mo17646() {
        this.f67802.f59603 = true;
    }

    @Override // l.InterfaceC7509
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo924() {
        return this.f67802.f59602.m27399();
    }
}
