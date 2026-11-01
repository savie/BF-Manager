package l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۖܶ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: S2LM */
/* JADX INFO: loaded from: classes2.dex */
public final class C2617 extends OutputStream {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC19782 f10226;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f10227;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9199 f10228;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f10229;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f10230 = Integer.MAX_VALUE;

    public C2617(C8015 c8015, C3078 c3078) {
        this.f10226 = c8015;
        this.f10228 = c3078;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8089(int i) {
        if (this.f10229 || this.f10227 + ((long) i) <= this.f10230) {
            return;
        }
        this.f10229 = true;
        this.f10226.accept(this);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            flush();
        } catch (IOException unused) {
        }
        ((OutputStream) this.f10228.mo9261(this)).close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        ((OutputStream) this.f10228.mo9261(this)).flush();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        m8089(bArr.length);
        ((OutputStream) this.f10228.mo9261(this)).write(bArr);
        this.f10227 += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        m8089(i2);
        ((OutputStream) this.f10228.mo9261(this)).write(bArr, i, i2);
        this.f10227 += (long) i2;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        m8089(1);
        ((OutputStream) this.f10228.mo9261(this)).write(i);
        this.f10227++;
    }
}
