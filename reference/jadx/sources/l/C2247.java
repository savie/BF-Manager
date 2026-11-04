package l;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.֫᩺ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: K8MX */
/* JADX INFO: loaded from: classes3.dex */
public final class C2247 extends InputStream implements InterfaceC8469 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C25368 f7347;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC13433 f7348;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f7344 = false;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f7346 = false;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final byte[] f7345 = new byte[1];

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    public C2247(InterfaceC13433 interfaceC13433, C25368 c25368) {
        this.f7348 = interfaceC13433;
        this.f7347 = c25368;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f7345;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        C20782.m47568(!this.f7346);
        boolean z = this.f7344;
        InterfaceC13433 interfaceC13433 = this.f7348;
        if (!z) {
            interfaceC13433.mo8326(this.f7347);
            this.f7344 = true;
        }
        int i3 = interfaceC13433.read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        return i3;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f7346) {
            return;
        }
        this.f7348.close();
        this.f7346 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7664() {
        if (this.f7344) {
            return;
        }
        this.f7348.mo8326(this.f7347);
        this.f7344 = true;
    }
}
