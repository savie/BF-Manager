package l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩺֡ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 473S */
/* JADX INFO: loaded from: classes.dex */
public final class C23928 extends FilterInputStream implements InterfaceC8469 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C16269 f77465;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f77466;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f77467;

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    public C23928(InputStream inputStream, long j, C16269 c16269) {
        super(inputStream);
        this.f77466 = Math.max(1L, j);
        this.f77465 = c16269;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws C9010, C18706 {
        try {
            int i = super.read();
            if (i != -1) {
                m53444(1);
            }
            return i;
        } catch (IOException e) {
            throw new C18706(e);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws C9010, C18706 {
        try {
            int i3 = super.read(bArr, i, i2);
            if (i3 > 0) {
                m53444(i3);
            }
            return i3;
        } catch (IOException e) {
            throw new C18706(e);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } catch (IOException e) {
            throw new C18706(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m53444(int i) throws C9010 {
        C16269 c16269 = this.f77465;
        if (c16269.m38601()) {
            throw new C9010();
        }
        long j = this.f77467 + ((long) i);
        this.f77467 = j;
        long j2 = this.f77466;
        c16269.m43862(Math.min(j, j2), j2);
    }
}
