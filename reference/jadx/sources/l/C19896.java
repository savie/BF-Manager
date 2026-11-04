package l;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ᩴܳ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: KAZL */
/* JADX INFO: loaded from: classes5.dex */
public final class C19896 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m45803(ByteBuffer byteBuffer) throws C22880 {
        if (byteBuffer.remaining() < 4) {
            throw new C22880("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer.remaining());
        }
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i > byteBuffer.remaining()) {
            StringBuilder sbM12235 = C3769.m12235(i, "Length-prefixed field longer than remaining buffer. Field length: ", ", remaining: ");
            sbM12235.append(byteBuffer.remaining());
            throw new C22880(sbM12235.toString());
        }
        if (i < 0) {
            throw new IllegalArgumentException(C13645.m33382(i, "size: "));
        }
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i2 = i + iPosition;
        if (i2 < iPosition || i2 > iLimit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i2);
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i2);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static byte[] m45804(ByteBuffer byteBuffer) throws C22880 {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new C22880("Negative length");
        }
        if (i <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return bArr;
        }
        StringBuilder sbM12235 = C3769.m12235(i, "Underflow while reading length-prefixed value. Length: ", ", available: ");
        sbM12235.append(byteBuffer.remaining());
        throw new C22880(sbM12235.toString());
    }
}
