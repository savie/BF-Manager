package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.nio.ByteBuffer;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* JADX INFO: renamed from: l.ܿۧۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y8J8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17299 extends AbstractC10492 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f55060;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public byte[] f55061;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f55067;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f55071;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public byte[] f55072;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f55073;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f55064 = 0;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f55069 = 0;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f55068 = 0;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final long f55070 = 100000;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final float f55065 = 0.2f;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final long f55066 = 2000000;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final int f55063 = 10;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final short f55062 = 1024;

    public C17299() {
        byte[] bArr = C17983.f57507;
        this.f55072 = bArr;
        this.f55061 = bArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40267(boolean z) {
        this.f55073 = z;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final long m40266() {
        return this.f55071;
    }

    @Override // l.AbstractC10492
    /* JADX INFO: renamed from: ܰ */
    public final C18958 mo16318(C18958 c18958) throws C8375 {
        if (c18958.f61391 == 2) {
            return c18958.f61389 == -1 ? C18958.f61388 : c18958;
        }
        throw new C8375(c18958);
    }

    @Override // l.AbstractC10492, l.InterfaceC19664
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo26629() {
        return super.mo26629() && this.f55073;
    }

    @Override // l.InterfaceC19664
    /* JADX INFO: renamed from: ۙ */
    public final void mo16317(ByteBuffer byteBuffer) {
        int iLimit;
        int iPosition;
        while (byteBuffer.hasRemaining() && !m26627()) {
            int i = this.f55067;
            short s = this.f55062;
            if (i == 0) {
                int iLimit2 = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit2, byteBuffer.position() + this.f55072.length));
                int iLimit3 = byteBuffer.limit() - 1;
                while (true) {
                    if (iLimit3 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iLimit3) << 8) | (byteBuffer.get(iLimit3 - 1) & 255)) > s) {
                        int i2 = this.f55060;
                        iPosition = ((iLimit3 / i2) * i2) + i2;
                        break;
                    }
                    iLimit3 -= 2;
                }
                if (iPosition == byteBuffer.position()) {
                    this.f55067 = 1;
                } else {
                    byteBuffer.limit(Math.min(iPosition, byteBuffer.capacity()));
                    m26625(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(iLimit2);
            } else {
                if (i != 1) {
                    throw new IllegalStateException();
                }
                C2023.m6510(this.f55069 < this.f55072.length);
                int iLimit4 = byteBuffer.limit();
                int iPosition2 = byteBuffer.position() + 1;
                while (true) {
                    if (iPosition2 >= byteBuffer.limit()) {
                        iLimit = byteBuffer.limit();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iPosition2) << 8) | (byteBuffer.get(iPosition2 - 1) & 255)) > s) {
                        int i3 = this.f55060;
                        iLimit = (iPosition2 / i3) * i3;
                        break;
                    }
                    iPosition2 += 2;
                }
                int iPosition3 = iLimit - byteBuffer.position();
                int length = this.f55069;
                int i4 = this.f55068;
                int length2 = length + i4;
                byte[] bArr = this.f55072;
                if (length2 < bArr.length) {
                    length = bArr.length;
                } else {
                    length2 = i4 - (bArr.length - length);
                }
                int i5 = length - length2;
                boolean z = iLimit < iLimit4;
                int iMin = Math.min(iPosition3, i5);
                byteBuffer.limit(byteBuffer.position() + iMin);
                byteBuffer.get(this.f55072, length2, iMin);
                int i6 = this.f55068 + iMin;
                this.f55068 = i6;
                C2023.m6510(i6 <= this.f55072.length);
                boolean z2 = z && iPosition3 < i5;
                m40265(z2);
                if (z2) {
                    this.f55067 = 0;
                    this.f55064 = 0;
                }
                byteBuffer.limit(iLimit4);
            }
        }
    }

    @Override // l.AbstractC10492
    /* JADX INFO: renamed from: ֨ */
    public final void mo26623() {
        if (this.f55068 > 0) {
            m40265(true);
            this.f55064 = 0;
        }
    }

    @Override // l.AbstractC10492
    /* JADX INFO: renamed from: ᩹ */
    public final void mo26632() {
        if (mo26629()) {
            C18958 c18958 = this.f35950;
            int i = c18958.f61392 * 2;
            this.f55060 = i;
            int i2 = ((((int) ((this.f55070 * ((long) c18958.f61389)) / 1000000)) / 2) / i) * i * 2;
            if (this.f55072.length != i2) {
                this.f55072 = new byte[i2];
                this.f55061 = new byte[i2];
            }
        }
        this.f55067 = 0;
        this.f55071 = 0L;
        this.f55064 = 0;
        this.f55069 = 0;
        this.f55068 = 0;
    }

    @Override // l.AbstractC10492
    /* JADX INFO: renamed from: ۬ */
    public final void mo26630() {
        this.f55073 = false;
        byte[] bArr = C17983.f57507;
        this.f55072 = bArr;
        this.f55061 = bArr;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m40265(boolean z) {
        int length;
        int iM40264;
        int i = this.f55068;
        byte[] bArr = this.f55072;
        if (i == bArr.length || z) {
            if (this.f55064 == 0) {
                if (z) {
                    m40263(i, 3);
                    length = i;
                } else {
                    C2023.m6510(i >= bArr.length / 2);
                    length = this.f55072.length / 2;
                    m40263(length, 0);
                }
                iM40264 = length;
            } else if (z) {
                int length2 = i - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int iM40265 = m40264(length2) + (this.f55072.length / 2);
                m40263(iM40265, 2);
                iM40264 = iM40265;
                length = length3;
            } else {
                length = i - (bArr.length / 2);
                iM40264 = m40264(length);
                m40263(iM40264, 1);
            }
            C2023.m6509("bytesConsumed is not aligned to frame size: %s" + length, length % this.f55060 == 0);
            C2023.m6510(i >= iM40264);
            this.f55068 -= length;
            int i2 = this.f55069 + length;
            this.f55069 = i2;
            this.f55069 = i2 % this.f55072.length;
            int i3 = this.f55064;
            int i4 = this.f55060;
            this.f55064 = (iM40264 / i4) + i3;
            this.f55071 += (long) ((length - iM40264) / i4);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m40263(int i, int i2) {
        if (i == 0) {
            return;
        }
        C2023.m6507(this.f55068 >= i);
        if (i2 == 2) {
            int i3 = this.f55069;
            int i4 = this.f55068;
            int i5 = i3 + i4;
            byte[] bArr = this.f55072;
            if (i5 <= bArr.length) {
                System.arraycopy(bArr, i5 - i, this.f55061, 0, i);
            } else {
                int length = i4 - (bArr.length - i3);
                if (length >= i) {
                    System.arraycopy(bArr, length - i, this.f55061, 0, i);
                } else {
                    int i6 = i - length;
                    System.arraycopy(bArr, bArr.length - i6, this.f55061, 0, i6);
                    System.arraycopy(this.f55072, 0, this.f55061, i6, length);
                }
            }
        } else {
            int i7 = this.f55069;
            int i8 = i7 + i;
            byte[] bArr2 = this.f55072;
            if (i8 <= bArr2.length) {
                System.arraycopy(bArr2, i7, this.f55061, 0, i);
            } else {
                int length2 = bArr2.length - i7;
                System.arraycopy(bArr2, i7, this.f55061, 0, length2);
                System.arraycopy(this.f55072, 0, this.f55061, length2, i - length2);
            }
        }
        C2023.m6506("sizeToOutput is not aligned to frame size: " + i, i % this.f55060 == 0);
        C2023.m6510(this.f55069 < this.f55072.length);
        byte[] bArr3 = this.f55061;
        C2023.m6506("byteOutput size is not aligned to frame size " + i, i % this.f55060 == 0);
        if (i2 != 3) {
            for (int i9 = 0; i9 < i; i9 += 2) {
                int i10 = i9 + 1;
                int i11 = (bArr3[i10] << 8) | (bArr3[i9] & 255);
                int i12 = this.f55063;
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
        m26625(i).put(bArr3, 0, i).flip();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private int m40264(int i) {
        int length = ((((int) ((this.f55066 * ((long) this.f35950.f61389)) / 1000000)) - this.f55064) * this.f55060) - (this.f55072.length / 2);
        C2023.m6510(length >= 0);
        int iMin = (int) Math.min((i * this.f55065) + 0.5f, length);
        int i2 = this.f55060;
        return (iMin / i2) * i2;
    }
}
