package l;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܰۘۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6XC */
/* JADX INFO: loaded from: classes4.dex */
public final class C14334 extends OutputStream {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f45212;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final FilterOutputStream f45213;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f45214 = true;

    public C14334(FilterOutputStream filterOutputStream) {
        this.f45213 = filterOutputStream;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        try {
            this.f45213.write(i);
            this.f45212++;
        } catch (IOException e) {
            this.f45214 = false;
            throw e;
        } catch (RuntimeException e2) {
            this.f45214 = false;
            throw e2;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        try {
            this.f45213.write(bArr, i, i2);
            this.f45212 += (long) i2;
        } catch (IOException e) {
            this.f45214 = false;
            throw e;
        } catch (RuntimeException e2) {
            this.f45214 = false;
            throw e2;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        try {
            this.f45213.flush();
        } catch (IOException e) {
            this.f45214 = false;
            throw e;
        } catch (RuntimeException e2) {
            this.f45214 = false;
            throw e2;
        }
    }
}
