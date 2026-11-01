package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi;

/* JADX INFO: renamed from: l.۫ۧۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 48KN */
/* JADX INFO: loaded from: classes3.dex */
public final class C12361 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final byte[] f41332 = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, -43, -59, -9, 1, 19, 79, KeyFactorySpi.Ed25519_type, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, GCMSIVBlockCipher.MASK, -69, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final byte[] f41331 = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, KeyFactorySpi.Ed25519_type, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ByteBuffer f41335 = InterfaceC19664.f63118;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f41333 = 0;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f41334 = 2;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30765(C16033 c16033, List list) {
        int i;
        c16033.f51912.getClass();
        if (c16033.f51912.limit() - c16033.f51912.position() == 0) {
            return;
        }
        byte[] bArr = (this.f41334 == 2 && (list.size() == 1 || list.size() == 3)) ? (byte[]) list.get(0) : null;
        ByteBuffer byteBuffer = c16033.f51912;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i2 = iLimit - iPosition;
        int i3 = (i2 + 255) / 255;
        int i4 = i3 + 27 + i2;
        if (this.f41334 == 2) {
            int length = bArr != null ? bArr.length + 28 : 47;
            i4 += length + 44;
            i = length;
        } else {
            i = 0;
        }
        if (this.f41335.capacity() < i4) {
            this.f41335 = ByteBuffer.allocate(i4).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f41335.clear();
        }
        ByteBuffer byteBuffer2 = this.f41335;
        if (this.f41334 == 2) {
            if (bArr == null) {
                byteBuffer2.put(f41332);
            } else {
                m30763(byteBuffer2, 0L, 0, 1, true);
                byteBuffer2.put(C14218.m34325(bArr.length));
                byteBuffer2.put(bArr);
                byteBuffer2.putInt(22, C17983.m41818(byteBuffer2.arrayOffset(), byteBuffer2.array(), bArr.length + 28, 0));
                byteBuffer2.position(bArr.length + 28);
            }
            byteBuffer2.put(f41331);
        }
        int iM41465 = this.f41333 + C17874.m41465(byteBuffer);
        this.f41333 = iM41465;
        m30763(byteBuffer2, iM41465, this.f41334, i3, false);
        for (int i5 = 0; i5 < i3; i5++) {
            if (i2 >= 255) {
                byteBuffer2.put((byte) -1);
                i2 -= 255;
            } else {
                byteBuffer2.put((byte) i2);
                i2 = 0;
            }
        }
        while (iPosition < iLimit) {
            byteBuffer2.put(byteBuffer.get(iPosition));
            iPosition++;
        }
        byteBuffer.position(byteBuffer.limit());
        byteBuffer2.flip();
        if (this.f41334 == 2) {
            byteBuffer2.putInt(i + 66, C17983.m41818(byteBuffer2.arrayOffset() + i + 44, byteBuffer2.array(), byteBuffer2.limit() - byteBuffer2.position(), 0));
        } else {
            byteBuffer2.putInt(22, C17983.m41818(byteBuffer2.arrayOffset(), byteBuffer2.array(), byteBuffer2.limit() - byteBuffer2.position(), 0));
        }
        this.f41334++;
        this.f41335 = byteBuffer2;
        c16033.mo7();
        c16033.m38027(this.f41335.remaining());
        c16033.f51912.put(this.f41335);
        c16033.m38025();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30764() {
        this.f41335 = InterfaceC19664.f63118;
        this.f41333 = 0;
        this.f41334 = 2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30763(ByteBuffer byteBuffer, long j, int i, int i2, boolean z) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i);
        byteBuffer.putInt(0);
        byteBuffer.put(C14218.m34325(i2));
    }
}
