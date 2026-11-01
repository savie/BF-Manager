package l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۧ᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: P2G3 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11315 extends FilterInputStream implements InterfaceC20818 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C2271 f38185;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C8550 f38186;

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    public AbstractC11315(InputStream inputStream, C16959 c16959) {
        super(inputStream);
        this.f38186 = new C8550();
        this.f38185 = InterfaceC10610.f36261;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo28314(int i) {
        this.f38185.getClass();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                m28315(e);
                throw null;
            } catch (Exception e2) {
                m28315(new IOException(e2));
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28315(IOException iOException) throws IOException {
        this.f38186.getClass();
        throw iOException;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        try {
            int i = ((FilterInputStream) this).in.read();
            mo28314(i != -1 ? 1 : -1);
            return i;
        } catch (IOException e) {
            m28315(e);
            throw null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            int i3 = ((FilterInputStream) this).in.read(bArr, i, i2);
            mo28314(i3);
            return i3;
        } catch (IOException e) {
            m28315(e);
            throw null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        try {
            return ((FilterInputStream) this).in.skip(j);
        } catch (IOException e) {
            m28315(e);
            throw null;
        }
    }
}
