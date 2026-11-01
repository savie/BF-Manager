package l;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.۫ۜ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: K6XC */
/* JADX INFO: loaded from: classes3.dex */
public final class C12244 extends OutputStream {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final FilterOutputStream f40976;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f40977;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f40978 = true;

    public C12244(FilterOutputStream filterOutputStream) {
        this.f40976 = filterOutputStream;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        try {
            this.f40976.write(i);
            this.f40977++;
        } catch (IOException e) {
            this.f40978 = false;
            throw e;
        } catch (RuntimeException e2) {
            this.f40978 = false;
            throw e2;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        try {
            this.f40976.write(bArr, i, i2);
            this.f40977 += (long) i2;
        } catch (IOException e) {
            this.f40978 = false;
            throw e;
        } catch (RuntimeException e2) {
            this.f40978 = false;
            throw e2;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        try {
            this.f40976.flush();
        } catch (IOException e) {
            this.f40978 = false;
            throw e;
        } catch (RuntimeException e2) {
            this.f40978 = false;
            throw e2;
        }
    }
}
