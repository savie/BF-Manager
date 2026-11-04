package l;

import android.util.Base64OutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܽۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964V */
/* JADX INFO: loaded from: classes4.dex */
public final class C17415 extends OutputStream {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7509 f56615;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Base64OutputStream f56616;

    public C17415(Base64OutputStream base64OutputStream, InterfaceC7509 interfaceC7509) {
        this.f56616 = base64OutputStream;
        this.f56615 = interfaceC7509;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        if (!this.f56615.mo924()) {
            this.f56616.write(i);
            return;
        }
        throw new C15923();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if (!this.f56615.mo924()) {
            this.f56616.write(bArr, i, i2);
            return;
        }
        throw new C15923();
    }
}
