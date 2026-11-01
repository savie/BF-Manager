package l;

import com.github.luben.zstd.Zstd;
import com.github.luben.zstd.ZstdInputStream;
import com.github.luben.zstd.ZstdOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: l.֨ܳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: F8CE */
/* JADX INFO: loaded from: classes2.dex */
public final class C1187 implements InterfaceC6832 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int[] f5282 = {-5, -1, 3, 19, 22};

    @Override // l.InterfaceC6832
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo4353(byte[] bArr, int i) {
        int i2;
        if (i >= 4) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 0, i);
            byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
            while (byteBufferWrap.remaining() >= 4) {
                int i3 = byteBufferWrap.getInt();
                if (i3 == -47205080) {
                    return true;
                }
                if (i3 != 407710288 || byteBufferWrap.remaining() < 4 || byteBufferWrap.remaining() < (i2 = byteBufferWrap.getInt())) {
                    break;
                }
                byteBufferWrap.position(byteBufferWrap.position() + i2);
            }
        }
        return false;
    }

    @Override // l.InterfaceC6832
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long mo4350(InterfaceC7739 interfaceC7739) {
        byte[] bArr = new byte[(int) Math.min(22L, interfaceC7739.length())];
        interfaceC7739.seek(0L);
        interfaceC7739.readFully(bArr);
        try {
            long frameContentSize = Zstd.getFrameContentSize(bArr);
            if (frameContentSize <= 0) {
                return -1L;
            }
            return frameContentSize;
        } catch (Exception unused) {
            return -1L;
        }
    }

    @Override // l.InterfaceC6832
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InputStream mo4351(InputStream inputStream) {
        return new ZstdInputStream(inputStream);
    }

    @Override // l.InterfaceC6832
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final OutputStream mo4352(OutputStream outputStream, int i, long j) {
        return new ZstdOutputStream(outputStream, f5282[i]);
    }
}
