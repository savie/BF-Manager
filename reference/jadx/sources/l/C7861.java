package l;

import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;
import net.sf.sevenzipjbinding.IOutStream;
import net.sf.sevenzipjbinding.SevenZipException;

/* JADX INFO: renamed from: l.۠֫۠, reason: contains not printable characters */
/* JADX INFO: compiled from: WB6R */
/* JADX INFO: loaded from: classes4.dex */
public final class C7861 implements IOutStream, Closeable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f25868;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C1388 f25869;

    public C7861(AbstractC20745 abstractC20745) {
        C1388 c1388M46710 = abstractC20745.m46710("rw");
        this.f25869 = c1388M46710;
        c1388M46710.setLength(0L);
    }

    public C7861(final AbstractC20745 abstractC20745, long j, final InterfaceC17295 interfaceC17295) {
        final C18597 c18597 = new C18597();
        this.f25869 = C19734.m44887(C0682.m3046(abstractC20745.getName(), j, new InterfaceC20439() { // from class: l.ᩴ֫۠
            @Override // l.InterfaceC20439
            /* JADX INFO: renamed from: ܰ */
            public final InterfaceC21850 mo23828(int i) {
                StringBuilder sb = new StringBuilder(abstractC20745.mo33986());
                sb.append('.');
                int i2 = i + 1;
                if (i2 < 100) {
                    sb.append('0');
                }
                if (i2 < 10) {
                    sb.append('0');
                }
                sb.append(i2);
                AbstractC20745 abstractC20745M15313 = C5553.m15313(sb.toString(), new String[0]);
                InterfaceC21850 interfaceC21850Mo33966 = abstractC20745M15313.mo33966("rw");
                if (c18597.add(i2)) {
                    interfaceC21850Mo33966.setLength(0L);
                    interfaceC17295.accept(abstractC20745M15313);
                }
                return interfaceC21850Mo33966;
            }
        }));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f25868) {
            return;
        }
        this.f25869.close();
        this.f25868 = true;
    }

    @Override // net.sf.sevenzipjbinding.IOutStream
    public final void setSize(long j) throws SevenZipException {
        if (this.f25868) {
            throw new SevenZipException("Closed");
        }
        try {
            this.f25869.setLength(j);
        } catch (IOException e) {
            throw new SevenZipException(e);
        }
    }

    @Override // net.sf.sevenzipjbinding.ISeekableStream
    public final long seek(long j, int i) throws SevenZipException {
        if (this.f25868) {
            throw new SevenZipException("Closed");
        }
        C1388 c1388 = this.f25869;
        try {
            if (i == 0) {
                c1388.seek(j);
            } else if (i == 1) {
                c1388.seek(c1388.getFilePointer() + j);
            } else if (i == 2) {
                c1388.seek(c1388.length() + j);
            } else {
                throw new RuntimeException("Seek: unknown origin: " + i);
            }
            return c1388.getFilePointer();
        } catch (IOException e) {
            throw new SevenZipException("Error while seek operation", e);
        }
    }

    @Override // net.sf.sevenzipjbinding.ISequentialOutStream
    public final int write(ByteBuffer byteBuffer) throws SevenZipException {
        if (this.f25868) {
            throw new SevenZipException("Closed");
        }
        try {
            return this.f25869.write(byteBuffer);
        } catch (IOException e) {
            throw new SevenZipException(e);
        }
    }
}
