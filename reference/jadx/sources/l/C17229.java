package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.nio.ByteBuffer;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* JADX INFO: renamed from: l.ܽ֨ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y8J8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17229 extends AbstractC23020 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f56137;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public long f56139;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public byte[] f56141;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f56143;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public byte[] f56146;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f56150;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f56142 = 0;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f56148 = 0;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f56144 = 0;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final long f56147 = 100000;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final float f56140 = 0.2f;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final long f56145 = 2000000;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f56138 = 10;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final short f56149 = 1024;

    public C17229() {
        byte[] bArr = C7116.f23453;
        this.f56146 = bArr;
        this.f56141 = bArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40468(boolean z) {
        this.f56150 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m40467() {
        return this.f56139;
    }

    @Override // l.AbstractC23020
    /* JADX INFO: renamed from: ᩷ */
    public final C13565 mo32891(C13565 c13565) throws C5120 {
        if (c13565.f43064 == 2) {
            return c13565.f43066 == -1 ? C13565.f43062 : c13565;
        }
        throw new C5120(c13565);
    }

    @Override // l.AbstractC23020, l.InterfaceC22274
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo37280() {
        return super.mo37280() && this.f56150;
    }

    @Override // l.InterfaceC22274
    /* JADX INFO: renamed from: ۙ */
    public final void mo32890(ByteBuffer byteBuffer) {
        int iLimit;
        int iPosition;
        while (byteBuffer.hasRemaining() && !m51916()) {
            int i = this.f56143;
            short s = this.f56149;
            if (i == 0) {
                int iLimit2 = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit2, byteBuffer.position() + this.f56146.length));
                int iLimit3 = byteBuffer.limit() - 1;
                while (true) {
                    if (iLimit3 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iLimit3) << 8) | (byteBuffer.get(iLimit3 - 1) & 255)) > s) {
                        int i2 = this.f56137;
                        iPosition = ((iLimit3 / i2) * i2) + i2;
                        break;
                    }
                    iLimit3 -= 2;
                }
                if (iPosition == byteBuffer.position()) {
                    this.f56143 = 1;
                } else {
                    byteBuffer.limit(Math.min(iPosition, byteBuffer.capacity()));
                    m51915(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(iLimit2);
            } else {
                if (i != 1) {
                    throw new IllegalStateException();
                }
                C20782.m47568(this.f56148 < this.f56146.length);
                int iLimit4 = byteBuffer.limit();
                int iPosition2 = byteBuffer.position() + 1;
                while (true) {
                    if (iPosition2 >= byteBuffer.limit()) {
                        iLimit = byteBuffer.limit();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iPosition2) << 8) | (byteBuffer.get(iPosition2 - 1) & 255)) > s) {
                        int i3 = this.f56137;
                        iLimit = (iPosition2 / i3) * i3;
                        break;
                    }
                    iPosition2 += 2;
                }
                int iPosition3 = iLimit - byteBuffer.position();
                int length = this.f56148;
                int i4 = this.f56144;
                int length2 = length + i4;
                byte[] bArr = this.f56146;
                if (length2 < bArr.length) {
                    length = bArr.length;
                } else {
                    length2 = i4 - (bArr.length - length);
                }
                int i5 = length - length2;
                boolean z = iLimit < iLimit4;
                int iMin = Math.min(iPosition3, i5);
                byteBuffer.limit(byteBuffer.position() + iMin);
                byteBuffer.get(this.f56146, length2, iMin);
                int i6 = this.f56144 + iMin;
                this.f56144 = i6;
                C20782.m47568(i6 <= this.f56146.length);
                boolean z2 = z && iPosition3 < i5;
                m40466(z2);
                if (z2) {
                    this.f56143 = 0;
                    this.f56142 = 0;
                }
                byteBuffer.limit(iLimit4);
            }
        }
    }

    @Override // l.AbstractC23020
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void mo40470() {
        if (this.f56144 > 0) {
            m40466(true);
            this.f56142 = 0;
        }
    }

    @Override // l.AbstractC23020
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void mo40471() {
        if (mo37280()) {
            C13565 c13565 = this.f74705;
            int i = c13565.f43065 * 2;
            this.f56137 = i;
            int i2 = ((((int) ((this.f56147 * ((long) c13565.f43066)) / 1000000)) / 2) / i) * i * 2;
            if (this.f56146.length != i2) {
                this.f56146 = new byte[i2];
                this.f56141 = new byte[i2];
            }
        }
        this.f56143 = 0;
        this.f56139 = 0L;
        this.f56142 = 0;
        this.f56148 = 0;
        this.f56144 = 0;
    }

    @Override // l.AbstractC23020
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void mo40469() {
        this.f56150 = false;
        byte[] bArr = C7116.f23453;
        this.f56146 = bArr;
        this.f56141 = bArr;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m40466(boolean z) {
        int length;
        int iM40465;
        int i = this.f56144;
        byte[] bArr = this.f56146;
        if (i == bArr.length || z) {
            if (this.f56142 == 0) {
                if (z) {
                    m40464(i, 3);
                    length = i;
                } else {
                    C20782.m47568(i >= bArr.length / 2);
                    length = this.f56146.length / 2;
                    m40464(length, 0);
                }
                iM40465 = length;
            } else if (z) {
                int length2 = i - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int iM40466 = m40465(length2) + (this.f56146.length / 2);
                m40464(iM40466, 2);
                iM40465 = iM40466;
                length = length3;
            } else {
                length = i - (bArr.length / 2);
                iM40465 = m40465(length);
                m40464(iM40465, 1);
            }
            C20782.m47567("bytesConsumed is not aligned to frame size: %s" + length, length % this.f56137 == 0);
            C20782.m47568(i >= iM40465);
            this.f56144 -= length;
            int i2 = this.f56148 + length;
            this.f56148 = i2;
            this.f56148 = i2 % this.f56146.length;
            int i3 = this.f56142;
            int i4 = this.f56137;
            this.f56142 = (iM40465 / i4) + i3;
            this.f56139 += (long) ((length - iM40465) / i4);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m40464(int i, int i2) {
        if (i == 0) {
            return;
        }
        C20782.m47565(this.f56144 >= i);
        if (i2 == 2) {
            int i3 = this.f56148;
            int i4 = this.f56144;
            int i5 = i3 + i4;
            byte[] bArr = this.f56146;
            if (i5 <= bArr.length) {
                System.arraycopy(bArr, i5 - i, this.f56141, 0, i);
            } else {
                int length = i4 - (bArr.length - i3);
                if (length >= i) {
                    System.arraycopy(bArr, length - i, this.f56141, 0, i);
                } else {
                    int i6 = i - length;
                    System.arraycopy(bArr, bArr.length - i6, this.f56141, 0, i6);
                    System.arraycopy(this.f56146, 0, this.f56141, i6, length);
                }
            }
        } else {
            int i7 = this.f56148;
            int i8 = i7 + i;
            byte[] bArr2 = this.f56146;
            if (i8 <= bArr2.length) {
                System.arraycopy(bArr2, i7, this.f56141, 0, i);
            } else {
                int length2 = bArr2.length - i7;
                System.arraycopy(bArr2, i7, this.f56141, 0, length2);
                System.arraycopy(this.f56146, 0, this.f56141, length2, i - length2);
            }
        }
        C20782.m47564("sizeToOutput is not aligned to frame size: " + i, i % this.f56137 == 0);
        C20782.m47568(this.f56148 < this.f56146.length);
        byte[] bArr3 = this.f56141;
        C20782.m47564("byteOutput size is not aligned to frame size " + i, i % this.f56137 == 0);
        if (i2 != 3) {
            for (int i9 = 0; i9 < i; i9 += 2) {
                int i10 = i9 + 1;
                int i11 = (bArr3[i10] << 8) | (bArr3[i9] & 255);
                int i12 = this.f56138;
                if (i2 == 0) {
                    i12 = ((((i9 * 1000) / (i - 1)) * (i12 - 100)) / 1000) + 100;
                } else if (i2 == 2) {
                    i12 += (((i9 * 1000) * (100 - i12)) / (i - 1)) / 1000;
                }
                int i13 = (i11 * i12) / 100;
                if (i13 >= 32767) {
                    bArr3[i9] = -1;
                    bArr3[i10] = ColorResourcesTableCreator.APPLICATION_PACKAGE_ID;
                } else if (i13 <= -32768) {
                    bArr3[i9] = 0;
                    bArr3[i10] = GCMSIVBlockCipher.MASK;
                } else {
                    bArr3[i9] = (byte) (i13 & 255);
                    bArr3[i10] = (byte) (i13 >> 8);
                }
            }
        }
        m51915(i).put(bArr3, 0, i).flip();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private int m40465(int i) {
        int length = ((((int) ((this.f56145 * ((long) this.f74705.f43066)) / 1000000)) - this.f56142) * this.f56137) - (this.f56146.length / 2);
        C20782.m47568(length >= 0);
        int iMin = (int) Math.min((i * this.f56140) + 0.5f, length);
        int i2 = this.f56137;
        return (iMin / i2) * i2;
    }
}
