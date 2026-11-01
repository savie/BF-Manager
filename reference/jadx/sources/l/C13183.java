package l;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: l.۬ܳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: F8CE */
/* JADX INFO: loaded from: classes4.dex */
public final class C13183 implements InterfaceC6832 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int[] f43885 = {1, 5, 9, 13, 17};

    @Override // l.InterfaceC6832
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo4353(byte[] bArr, int i) {
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

    @Override // l.InterfaceC6832
    /* JADX INFO: renamed from: ۙ */
    public final long mo4350(InterfaceC7739 interfaceC7739) {
        try {
            interfaceC7739.seek(4L);
            if (C7527.m20050(interfaceC7739.readByte()).m20053(EnumC10350.CONTENT_SIZE)) {
                interfaceC7739.skipBytes(1);
                return interfaceC7739.readLong();
            }
        } catch (RuntimeException unused) {
        }
        return -1L;
    }

    @Override // l.InterfaceC6832
    /* JADX INFO: renamed from: ۙ */
    public final InputStream mo4351(InputStream inputStream) {
        return new C8233(inputStream);
    }

    @Override // l.InterfaceC6832
    /* JADX INFO: renamed from: ۙ */
    public final OutputStream mo4352(OutputStream outputStream, int i, long j) {
        return new C15995(outputStream, f43885[i], j);
    }
}
