package l;

import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;

/* JADX INFO: renamed from: l.ۛۜ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: U7IN */
/* JADX INFO: loaded from: classes2.dex */
public final class C5898 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m16136(ReadableByteChannel readableByteChannel, ReadableByteChannel readableByteChannel2) {
        if (C13638.equals(readableByteChannel, readableByteChannel2)) {
            return true;
        }
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(8192);
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(8192);
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (!z) {
                int iM16135 = m16135(readableByteChannel, byteBufferAllocateDirect);
                byteBufferAllocateDirect.clear();
                if (iM16135 == 0) {
                    i = iM16135;
                    z2 = true;
                } else {
                    i = iM16135;
                    z2 = false;
                }
            }
            if (!z2) {
                int iM16136 = m16135(readableByteChannel2, byteBufferAllocateDirect2);
                byteBufferAllocateDirect2.clear();
                if (iM16136 == 0) {
                    i2 = iM16136;
                    z = true;
                } else {
                    i2 = iM16136;
                    z = false;
                }
            }
            if (i == -1 && i2 == -1) {
                return byteBufferAllocateDirect.equals(byteBufferAllocateDirect2);
            }
            if (i == 0 || i2 == 0) {
                Thread.yield();
            } else if (i != i2 || !byteBufferAllocateDirect.equals(byteBufferAllocateDirect2)) {
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m16135(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer) {
        int i;
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException();
        }
        int i2 = 0;
        while (byteBuffer.hasRemaining() && (i = readableByteChannel.read(byteBuffer)) != -1) {
            if (i == 0) {
                Thread.yield();
            } else {
                i2 += i;
            }
        }
        if (i2 != 0) {
            return i2;
        }
        return -1;
    }
}
