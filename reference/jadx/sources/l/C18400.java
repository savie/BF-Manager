package l;

import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ᩴ֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: N17O */
/* JADX INFO: loaded from: classes4.dex */
public final class C18400 extends FilterOutputStream {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7817 f58646;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18400(C7817 c7817, BufferedOutputStream bufferedOutputStream) {
        super(bufferedOutputStream);
        this.f58646 = c7817;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        try {
            ((FilterOutputStream) this).out.write(i);
        } catch (IOException e) {
            this.f58646.m20531(e);
            throw e;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        try {
            ((FilterOutputStream) this).out.write(bArr);
        } catch (IOException e) {
            this.f58646.m20531(e);
            throw e;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        try {
            ((FilterOutputStream) this).out.write(bArr, i, i2);
        } catch (IOException e) {
            this.f58646.m20531(e);
            throw e;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        try {
            ((FilterOutputStream) this).out.flush();
        } catch (IOException e) {
            this.f58646.m20531(e);
            throw e;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        C7817 c7817 = this.f58646;
        c7817.m20592();
        c7817.f25723.set(false);
        ((FilterOutputStream) this).out.close();
    }
}
