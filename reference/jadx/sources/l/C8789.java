package l;

import java.io.FilterOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۡۢ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: P77N */
/* JADX INFO: loaded from: classes3.dex */
public final class C8789 extends FilterOutputStream {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f30211;

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public final void flush() throws C3661 {
        try {
            ((FilterOutputStream) this).out.flush();
        } catch (IOException e) {
            throw m22863(e);
        } catch (RuntimeException e2) {
            throw m22862(e2);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } catch (IOException e) {
            throw m22863(e);
        } catch (RuntimeException e2) {
            throw m22862(e2);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws C3661, C0839 {
        if (this.f30211 <= 9007199254740991L - ((long) 1)) {
            try {
                ((FilterOutputStream) this).out.write(i);
                this.f30211++;
                return;
            } catch (IOException e) {
                throw m22863(e);
            } catch (RuntimeException e2) {
                throw m22862(e2);
            }
        }
        throw new C0839("Workspace ZIP entry is too large");
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws C3661, C0839 {
        if (i2 >= 0) {
            long j = i2;
            if (this.f30211 <= 9007199254740991L - j) {
                try {
                    ((FilterOutputStream) this).out.write(bArr, i, i2);
                    this.f30211 += j;
                    return;
                } catch (IOException e) {
                    throw m22863(e);
                } catch (RuntimeException e2) {
                    throw m22862(e2);
                }
            }
        }
        throw new C0839("Workspace ZIP entry is too large");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3661 m22863(IOException iOException) {
        if (iOException instanceof C3661) {
            return (C3661) iOException;
        }
        return new C3661(iOException);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static RuntimeException m22862(RuntimeException runtimeException) {
        return ((runtimeException instanceof C6484) || !C14952.m35848(runtimeException)) ? runtimeException : new C6484(runtimeException);
    }
}
