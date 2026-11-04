package l;

import java.io.IOException;
import java.nio.ByteBuffer;
import net.sf.sevenzipjbinding.IInStream;
import net.sf.sevenzipjbinding.SevenZipException;

/* JADX INFO: renamed from: l.ۖ᩸ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6B5Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C2953 implements IInStream {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f9640;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC17713 f9641;

    public C2953(AbstractC22044 abstractC22044) {
        this.f9641 = abstractC22044.m49855("r");
    }

    public C2953(InterfaceC17713 interfaceC17713) {
        this.f9641 = interfaceC17713;
    }

    @Override // net.sf.sevenzipjbinding.ISeekableStream
    public final long seek(long j, int i) throws SevenZipException {
        InterfaceC17713 interfaceC17713 = this.f9641;
        try {
            if (i == 0) {
                interfaceC17713.seek(j + ((long) 0));
            } else if (i == 1) {
                interfaceC17713.seek(interfaceC17713.getFilePointer() + j);
            } else if (i == 2) {
                interfaceC17713.seek(interfaceC17713.length() + j);
            } else {
                throw new RuntimeException("Seek: unknown origin: " + i);
            }
            return interfaceC17713.getFilePointer() - ((long) 0);
        } catch (IOException e) {
            throw new SevenZipException("Error while seek operation", e);
        }
    }

    @Override // net.sf.sevenzipjbinding.ISequentialInStream
    public final int read(ByteBuffer byteBuffer) throws SevenZipException {
        try {
            int i = this.f9641.read(byteBuffer);
            if (i == -1) {
                return 0;
            }
            return i;
        } catch (IOException e) {
            throw new SevenZipException(e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f9640) {
            return;
        }
        this.f9641.close();
        this.f9640 = true;
    }
}
