package l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܿ֫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: P77N */
/* JADX INFO: loaded from: classes5.dex */
public final class C17998 extends FilterInputStream implements InterfaceC8469 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public IOException f58947;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Error f58948;

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    public C17998(InputStream inputStream) {
        super(inputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        try {
            return super.read();
        } catch (IOException e) {
            m41971(e);
            throw e;
        } catch (Error e2) {
            if (this.f58948 == null) {
                this.f58948 = e2;
            }
            throw e2;
        } catch (RuntimeException e3) {
            m41971(new IOException("Workspace entry input failed", e3));
            throw e3;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return super.read(bArr, i, i2);
        } catch (IOException e) {
            m41971(e);
            throw e;
        } catch (Error e2) {
            if (this.f58948 == null) {
                this.f58948 = e2;
            }
            throw e2;
        } catch (RuntimeException e3) {
            m41971(new IOException("Workspace entry input failed", e3));
            throw e3;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        try {
            return super.skip(j);
        } catch (IOException e) {
            m41971(e);
            throw e;
        } catch (Error e2) {
            if (this.f58948 == null) {
                this.f58948 = e2;
            }
            throw e2;
        } catch (RuntimeException e3) {
            m41971(new IOException("Workspace entry input failed", e3));
            throw e3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m41971(IOException iOException) {
        if (this.f58947 == null) {
            this.f58947 = iOException;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m41972(C17998 c17998) throws IOException {
        Error error = c17998.f58948;
        if (error != null) {
            throw error;
        }
        IOException iOException = c17998.f58947;
        if (iOException != null) {
            throw iOException;
        }
    }
}
