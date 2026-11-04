package l;

import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;
import net.sf.sevenzipjbinding.IOutStream;
import net.sf.sevenzipjbinding.SevenZipException;

/* JADX INFO: renamed from: l.۠᩸ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: WB6R */
/* JADX INFO: loaded from: classes4.dex */
public final class C8919 implements IOutStream, Closeable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f29108;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C13961 f29109;

    public C8919(AbstractC22044 abstractC22044) {
        C13961 c13961M49855 = abstractC22044.m49855("rw");
        this.f29109 = c13961M49855;
        c13961M49855.setLength(0L);
    }

    public C8919(AbstractC22044 abstractC22044, long j, InterfaceC0818 interfaceC0818) {
        this.f29109 = C11746.m29495(C20697.m47331(abstractC22044.getName(), j, new C22244(abstractC22044, new C0594(), interfaceC0818)));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f29108) {
            return;
        }
        this.f29109.close();
        this.f29108 = true;
    }

    @Override // net.sf.sevenzipjbinding.IOutStream
    public final void setSize(long j) throws SevenZipException {
        if (this.f29108) {
            throw new SevenZipException("Closed");
        }
        try {
            this.f29109.setLength(j);
        } catch (IOException e) {
            throw new SevenZipException(e);
        }
    }

    @Override // net.sf.sevenzipjbinding.ISeekableStream
    public final long seek(long j, int i) throws SevenZipException {
        if (this.f29108) {
            throw new SevenZipException("Closed");
        }
        C13961 c13961 = this.f29109;
        try {
            if (i == 0) {
                c13961.seek(j);
            } else if (i == 1) {
                c13961.seek(c13961.getFilePointer() + j);
            } else if (i == 2) {
                c13961.seek(c13961.length() + j);
            } else {
                throw new RuntimeException("Seek: unknown origin: " + i);
            }
            return c13961.getFilePointer();
        } catch (IOException e) {
            throw new SevenZipException("Error while seek operation", e);
        }
    }

    @Override // net.sf.sevenzipjbinding.ISequentialOutStream
    public final int write(ByteBuffer byteBuffer) throws SevenZipException {
        if (this.f29108) {
            throw new SevenZipException("Closed");
        }
        try {
            return this.f29109.write(byteBuffer);
        } catch (IOException e) {
            throw new SevenZipException(e);
        }
    }
}
