package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi;

/* JADX INFO: renamed from: l.ܺ֨ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 48KN */
/* JADX INFO: loaded from: classes4.dex */
public final class C16483 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final byte[] f53444 = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, -43, -59, -9, 1, 19, 79, KeyFactorySpi.Ed25519_type, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, GCMSIVBlockCipher.MASK, -69, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final byte[] f53445 = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, KeyFactorySpi.Ed25519_type, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ByteBuffer f53448 = InterfaceC22274.f72135;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f53446 = 0;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f53447 = 2;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39125(C5690 c5690, List list) {
        int i;
        c5690.f19651.getClass();
        if (c5690.f19651.limit() - c5690.f19651.position() == 0) {
            return;
        }
        byte[] bArr = (this.f53447 == 2 && (list.size() == 1 || list.size() == 3)) ? (byte[]) list.get(0) : null;
        ByteBuffer byteBuffer = c5690.f19651;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i2 = iLimit - iPosition;
        int i3 = (i2 + 255) / 255;
        int i4 = i3 + 27 + i2;
        if (this.f53447 == 2) {
            int length = bArr != null ? bArr.length + 28 : 47;
            i4 += length + 44;
            i = length;
        } else {
            i = 0;
        }
        if (this.f53448.capacity() < i4) {
            this.f53448 = ByteBuffer.allocate(i4).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f53448.clear();
        }
        ByteBuffer byteBuffer2 = this.f53448;
        if (this.f53447 == 2) {
            if (bArr == null) {
                byteBuffer2.put(f53444);
            } else {
                m39123(byteBuffer2, 0L, 0, 1, true);
                byteBuffer2.put(C10239.m26373(bArr.length));
                byteBuffer2.put(bArr);
                byteBuffer2.putInt(22, C7116.m19465(byteBuffer2.arrayOffset(), byteBuffer2.array(), bArr.length + 28, 0));
                byteBuffer2.position(bArr.length + 28);
            }
            byteBuffer2.put(f53445);
        }
        int iM20687 = this.f53446 + C7569.m20687(byteBuffer);
        this.f53446 = iM20687;
        m39123(byteBuffer2, iM20687, this.f53447, i3, false);
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
        if (this.f53447 == 2) {
            byteBuffer2.putInt(i + 66, C7116.m19465(byteBuffer2.arrayOffset() + i + 44, byteBuffer2.array(), byteBuffer2.limit() - byteBuffer2.position(), 0));
        } else {
            byteBuffer2.putInt(22, C7116.m19465(byteBuffer2.arrayOffset(), byteBuffer2.array(), byteBuffer2.limit() - byteBuffer2.position(), 0));
        }
        this.f53447++;
        this.f53448 = byteBuffer2;
        c5690.mo7();
        c5690.m16711(this.f53448.remaining());
        c5690.f19651.put(this.f53448);
        c5690.m16713();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39124() {
        this.f53448 = InterfaceC22274.f72135;
        this.f53446 = 0;
        this.f53447 = 2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39123(ByteBuffer byteBuffer, long j, int i, int i2, boolean z) {
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
        byteBuffer.put(C10239.m26373(i2));
    }
}
