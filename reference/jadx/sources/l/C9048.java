package l;

import java.io.FilterOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۡ֫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: P77N */
/* JADX INFO: loaded from: classes3.dex */
public final class C9048 extends FilterOutputStream {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f29438;

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public final void flush() throws C4112 {
        try {
            ((FilterOutputStream) this).out.flush();
        } catch (IOException e) {
            throw m24159(e);
        } catch (RuntimeException e2) {
            throw m24158(e2);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } catch (IOException e) {
            throw m24159(e);
        } catch (RuntimeException e2) {
            throw m24158(e2);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws C4112, C6350 {
        if (this.f29438 <= 9007199254740991L - ((long) 1)) {
            try {
                ((FilterOutputStream) this).out.write(i);
                this.f29438++;
                return;
            } catch (IOException e) {
                throw m24159(e);
            } catch (RuntimeException e2) {
                throw m24158(e2);
            }
        }
        throw new C6350("Workspace ZIP entry is too large");
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws C4112, C6350 {
        if (i2 >= 0) {
            long j = i2;
            if (this.f29438 <= 9007199254740991L - j) {
                try {
                    ((FilterOutputStream) this).out.write(bArr, i, i2);
                    this.f29438 += j;
                    return;
                } catch (IOException e) {
                    throw m24159(e);
                } catch (RuntimeException e2) {
                    throw m24158(e2);
                }
            }
        }
        throw new C6350("Workspace ZIP entry is too large");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4112 m24159(IOException iOException) {
        if (iOException instanceof C4112) {
            return (C4112) iOException;
        }
        return new C4112(iOException);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static RuntimeException m24158(RuntimeException runtimeException) {
        return ((runtimeException instanceof C14552) || !C18282.m42576(runtimeException)) ? runtimeException : new C14552(runtimeException);
    }
}
