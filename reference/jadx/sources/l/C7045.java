package l;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ۜ᩹ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: KAZL */
/* JADX INFO: loaded from: classes2.dex */
public final class C7045 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m18897(ByteBuffer byteBuffer) throws C4222 {
        if (byteBuffer.remaining() < 4) {
            throw new C4222("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer.remaining());
        }
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i > byteBuffer.remaining()) {
            StringBuilder sbM40153 = C17214.m40153(i, "Length-prefixed field longer than remaining buffer. Field length: ", ", remaining: ");
            sbM40153.append(byteBuffer.remaining());
            throw new C4222(sbM40153.toString());
        }
        if (i < 0) {
            throw new IllegalArgumentException(C8479.m22141(i, "size: "));
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

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static byte[] m18898(ByteBuffer byteBuffer) throws C4222 {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new C4222("Negative length");
        }
        if (i <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return bArr;
        }
        StringBuilder sbM40153 = C17214.m40153(i, "Underflow while reading length-prefixed value. Length: ", ", available: ");
        sbM40153.append(byteBuffer.remaining());
        throw new C4222(sbM40153.toString());
    }
}
