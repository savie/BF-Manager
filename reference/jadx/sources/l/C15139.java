package l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܶۢ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: P77N */
/* JADX INFO: loaded from: classes4.dex */
public final class C15139 extends FilterInputStream implements InterfaceC20818 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public IOException f49462;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Error f49463;

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    public C15139(InputStream inputStream) {
        super(inputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        try {
            return super.read();
        } catch (IOException e) {
            m36304(e);
            throw e;
        } catch (Error e2) {
            if (this.f49463 == null) {
                this.f49463 = e2;
            }
            throw e2;
        } catch (RuntimeException e3) {
            m36304(new IOException("Workspace entry input failed", e3));
            throw e3;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return super.read(bArr, i, i2);
        } catch (IOException e) {
            m36304(e);
            throw e;
        } catch (Error e2) {
            if (this.f49463 == null) {
                this.f49463 = e2;
            }
            throw e2;
        } catch (RuntimeException e3) {
            m36304(new IOException("Workspace entry input failed", e3));
            throw e3;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        try {
            return super.skip(j);
        } catch (IOException e) {
            m36304(e);
            throw e;
        } catch (Error e2) {
            if (this.f49463 == null) {
                this.f49463 = e2;
            }
            throw e2;
        } catch (RuntimeException e3) {
            m36304(new IOException("Workspace entry input failed", e3));
            throw e3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m36304(IOException iOException) {
        if (this.f49462 == null) {
            this.f49462 = iOException;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36305(C15139 c15139) throws IOException {
        Error error = c15139.f49463;
        if (error != null) {
            throw error;
        }
        IOException iOException = c15139.f49462;
        if (iOException != null) {
            throw iOException;
        }
    }
}
