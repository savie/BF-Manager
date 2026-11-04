package l;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: l.۫ܳ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: F8CE */
/* JADX INFO: loaded from: classes4.dex */
public final class C13175 implements InterfaceC1989 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int[] f42105 = {1, 5, 9, 13, 17};

    @Override // l.InterfaceC1989
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo6818(byte[] bArr, int i) {
        int i2;
        if (i >= 4) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 0, i);
            byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
            while (byteBufferWrap.remaining() >= 4) {
                int i3 = byteBufferWrap.getInt();
                if (i3 == 407708164) {
                    return true;
                }
                if ((i3 >>> 4) != 25481893 || byteBufferWrap.remaining() < 4 || byteBufferWrap.remaining() < (i2 = byteBufferWrap.getInt())) {
                    break;
                }
                byteBufferWrap.position(byteBufferWrap.position() + i2);
            }
        }
        return false;
    }

    @Override // l.InterfaceC1989
    /* JADX INFO: renamed from: ۙ */
    public final long mo6815(InterfaceC17713 interfaceC17713) {
        try {
            interfaceC17713.seek(4L);
            if (C11156.m28103(interfaceC17713.readByte()).m28106(EnumC22345.CONTENT_SIZE)) {
                interfaceC17713.skipBytes(1);
                return interfaceC17713.readLong();
            }
        } catch (RuntimeException unused) {
        }
        return -1L;
    }

    @Override // l.InterfaceC1989
    /* JADX INFO: renamed from: ۙ */
    public final InputStream mo6816(InputStream inputStream) {
        return new C7077(inputStream);
    }

    @Override // l.InterfaceC1989
    /* JADX INFO: renamed from: ۙ */
    public final OutputStream mo6817(OutputStream outputStream, int i, long j) {
        return new C20107(outputStream, f42105[i], j);
    }
}
