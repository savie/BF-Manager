package l;

import java.io.IOException;
import java.nio.ByteBuffer;
import net.sf.sevenzipjbinding.IInStream;
import net.sf.sevenzipjbinding.SevenZipException;

/* JADX INFO: renamed from: l.ᩳ֫۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 6B5Z */
/* JADX INFO: loaded from: classes5.dex */
public final class C17738 implements IInStream {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f56287;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC7739 f56288;

    public C17738(AbstractC20745 abstractC20745) {
        this.f56288 = abstractC20745.m46710("r");
    }

    public C17738(InterfaceC7739 interfaceC7739) {
        this.f56288 = interfaceC7739;
    }

    @Override // net.sf.sevenzipjbinding.ISeekableStream
    public final long seek(long j, int i) throws SevenZipException {
        InterfaceC7739 interfaceC7739 = this.f56288;
        try {
            if (i == 0) {
                interfaceC7739.seek(j + ((long) 0));
            } else if (i == 1) {
                interfaceC7739.seek(interfaceC7739.getFilePointer() + j);
            } else if (i == 2) {
                interfaceC7739.seek(interfaceC7739.length() + j);
            } else {
                throw new RuntimeException("Seek: unknown origin: " + i);
            }
            return interfaceC7739.getFilePointer() - ((long) 0);
        } catch (IOException e) {
            throw new SevenZipException("Error while seek operation", e);
        }
    }

    @Override // net.sf.sevenzipjbinding.ISequentialInStream
    public final int read(ByteBuffer byteBuffer) throws SevenZipException {
        try {
            int i = this.f56288.read(byteBuffer);
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
        if (this.f56287) {
            return;
        }
        this.f56288.close();
        this.f56287 = true;
    }
}
