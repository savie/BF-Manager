package l;

import java.io.DataInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;

/* JADX INFO: renamed from: l.ᩴ᩹᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: M1T9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20140 extends AbstractC11189 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public AbstractC1275 f64719;

    public C20140() {
        super(new C13996());
        try {
            this.f64719 = new C2766();
        } catch (NoSuchAlgorithmException unused) {
            this.f64719 = new C19174();
        }
    }

    @Override // l.AbstractC11189
    /* JADX INFO: renamed from: ۤ */
    public final long mo28194() {
        return m28195() + this.f35289 + 12 + 12;
    }

    @Override // l.AbstractC11189
    /* JADX INFO: renamed from: ۙ */
    public final void mo28193(long j, long j2) throws C18428 {
        super.mo28193(j, j2);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
        byteBufferAllocate.putLong(j);
        byteBufferAllocate.putLong(j2);
        byte[] bArrArray = byteBufferAllocate.array();
        AbstractC1275 abstractC1275 = this.f64719;
        abstractC1275.getClass();
        abstractC1275.mo4663(bArrArray, 0, bArrArray.length);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46367(InputStream inputStream) throws C13996 {
        CRC32 crc32 = new CRC32();
        crc32.update(0);
        CheckedInputStream checkedInputStream = new CheckedInputStream(inputStream, crc32);
        if (C8732.m23412(checkedInputStream) != this.f35293) {
            throw new C13996("XZ Block Header or the start of XZ Index is corrupt");
        }
        C20140 c20140 = new C20140();
        for (long j = 0; j < this.f35293; j++) {
            try {
                c20140.mo28193(C8732.m23412(checkedInputStream), C8732.m23412(checkedInputStream));
                if (c20140.f35289 > this.f35289 || c20140.f35291 > this.f35291 || c20140.f35292 > this.f35292) {
                    throw new C13996("XZ Index is corrupt");
                }
            } catch (C18428 unused) {
                throw new C13996("XZ Index is corrupt");
            }
        }
        if (c20140.f35289 != this.f35289 || c20140.f35291 != this.f35291 || c20140.f35292 != this.f35292 || !Arrays.equals(c20140.f64719.mo4664(), this.f64719.mo4664())) {
            throw new C13996("XZ Index is corrupt");
        }
        DataInputStream dataInputStream = new DataInputStream(checkedInputStream);
        for (int iM28192 = m28192(); iM28192 > 0; iM28192--) {
            if (dataInputStream.readUnsignedByte() != 0) {
                throw new C13996("XZ Index is corrupt");
            }
        }
        long value = crc32.getValue();
        for (int i = 0; i < 4; i++) {
            if (((value >>> (i * 8)) & 255) != dataInputStream.readUnsignedByte()) {
                throw new C13996("XZ Index is corrupt");
            }
        }
    }
}
