package l;

import java.io.DataInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;

/* JADX INFO: renamed from: l.ܿ۬ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1T9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17366 extends AbstractC16661 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public AbstractC8900 f55259;

    public C17366() {
        super(new C19838());
        try {
            this.f55259 = new C7488();
        } catch (NoSuchAlgorithmException unused) {
            this.f55259 = new C8194();
        }
    }

    @Override // l.AbstractC16661
    /* JADX INFO: renamed from: ۨ */
    public final long mo30887() {
        return m39126() + this.f53413 + 12 + 12;
    }

    @Override // l.AbstractC16661
    /* JADX INFO: renamed from: ۙ */
    public final void mo30885(long j, long j2) {
        super.mo30885(j, j2);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
        byteBufferAllocate.putLong(j);
        byteBufferAllocate.putLong(j2);
        byte[] bArrArray = byteBufferAllocate.array();
        AbstractC8900 abstractC8900 = this.f55259;
        abstractC8900.getClass();
        abstractC8900.mo19985(bArrArray, 0, bArrArray.length);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40439(InputStream inputStream) {
        CRC32 crc32 = new CRC32();
        crc32.update(0);
        CheckedInputStream checkedInputStream = new CheckedInputStream(inputStream, crc32);
        if (C20894.m47000(checkedInputStream) != this.f53412) {
            throw new C19838("XZ Block Header or the start of XZ Index is corrupt");
        }
        C17366 c17366 = new C17366();
        for (long j = 0; j < this.f53412; j++) {
            try {
                c17366.mo30885(C20894.m47000(checkedInputStream), C20894.m47000(checkedInputStream));
                if (c17366.f53413 > this.f53413 || c17366.f53414 > this.f53414 || c17366.f53416 > this.f53416) {
                    throw new C19838("XZ Index is corrupt");
                }
            } catch (C21599 unused) {
                throw new C19838("XZ Index is corrupt");
            }
        }
        if (c17366.f53413 != this.f53413 || c17366.f53414 != this.f53414 || c17366.f53416 != this.f53416 || !Arrays.equals(c17366.f55259.mo19986(), this.f55259.mo19986())) {
            throw new C19838("XZ Index is corrupt");
        }
        DataInputStream dataInputStream = new DataInputStream(checkedInputStream);
        for (int iM39125 = m39125(); iM39125 > 0; iM39125--) {
            if (dataInputStream.readUnsignedByte() != 0) {
                throw new C19838("XZ Index is corrupt");
            }
        }
        long value = crc32.getValue();
        for (int i = 0; i < 4; i++) {
            if (((value >>> (i * 8)) & 255) != dataInputStream.readUnsignedByte()) {
                throw new C19838("XZ Index is corrupt");
            }
        }
    }
}
