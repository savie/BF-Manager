package l;

import android.util.Base64OutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܰ֫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964V */
/* JADX INFO: loaded from: classes3.dex */
public final class C13504 extends OutputStream {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5614 f44607;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Base64OutputStream f44608;

    public C13504(Base64OutputStream base64OutputStream, InterfaceC5614 interfaceC5614) {
        this.f44608 = base64OutputStream;
        this.f44607 = interfaceC5614;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        if (!this.f44607.mo2357()) {
            this.f44608.write(i);
            return;
        }
        throw new C11387();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if (!this.f44607.mo2357()) {
            this.f44608.write(bArr, i, i2);
            return;
        }
        throw new C11387();
    }
}
