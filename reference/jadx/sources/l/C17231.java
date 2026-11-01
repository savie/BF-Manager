package l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܿ۠᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 473S */
/* JADX INFO: loaded from: classes4.dex */
public final class C17231 extends FilterInputStream implements InterfaceC20818 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final long f54904;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C10197 f54905;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f54906;

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    public C17231(InputStream inputStream, long j, C10197 c10197) {
        super(inputStream);
        this.f54904 = Math.max(1L, j);
        this.f54905 = c10197;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws C11918, C3119 {
        try {
            int i = super.read();
            if (i != -1) {
                m40170(1);
            }
            return i;
        } catch (IOException e) {
            throw new C3119(e);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws C11918, C3119 {
        try {
            int i3 = super.read(bArr, i, i2);
            if (i3 > 0) {
                m40170(i3);
            }
            return i3;
        } catch (IOException e) {
            throw new C3119(e);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } catch (IOException e) {
            throw new C3119(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m40170(int i) throws C11918 {
        C10197 c10197 = this.f54905;
        if (c10197.m25972()) {
            throw new C11918();
        }
        long j = this.f54906 + ((long) i);
        this.f54906 = j;
        long j2 = this.f54904;
        c10197.m41578(Math.min(j, j2), j2);
    }
}
