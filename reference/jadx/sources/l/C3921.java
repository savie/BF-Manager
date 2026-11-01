package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* JADX INFO: renamed from: l.ۘۨܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: N8PX */
/* JADX INFO: loaded from: classes2.dex */
public final class C3921 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C13095 f14619;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C13095 f14620;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f14621;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C2460 f14622;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C13095 f14623;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15732 f14624;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f14625;

    public C3921(InterfaceC15732 interfaceC15732) {
        this.f14624 = interfaceC15732;
        int iM16066 = ((C5853) interfaceC15732).m16066();
        this.f14621 = iM16066;
        this.f14622 = new C2460(32);
        C13095 c13095 = new C13095(iM16066, 0L);
        this.f14623 = c13095;
        this.f14620 = c13095;
        this.f14619 = c13095;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m11379() {
        C13095 c13095 = this.f14623;
        C7264 c7264 = c13095.f43604;
        InterfaceC15732 interfaceC15732 = this.f14624;
        if (c7264 != null) {
            ((C5853) interfaceC15732).m16063(c13095);
            c13095.f43604 = null;
            c13095.f43605 = null;
        }
        C13095 c13096 = this.f14623;
        C2023.m6510(c13096.f43604 == null);
        c13096.f43603 = 0L;
        c13096.f43606 = this.f14621;
        C13095 c13097 = this.f14623;
        this.f14620 = c13097;
        this.f14619 = c13097;
        this.f14625 = 0L;
        ((C5853) interfaceC15732).m16064();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m11380(long j) {
        C2023.m6507(j <= this.f14625);
        this.f14625 = j;
        InterfaceC15732 interfaceC15732 = this.f14624;
        int i = this.f14621;
        if (j != 0) {
            C13095 c13095 = this.f14623;
            if (j != c13095.f43603) {
                while (this.f14625 > c13095.f43606) {
                    c13095 = c13095.f43605;
                }
                C13095 c13096 = c13095.f43605;
                c13096.getClass();
                if (c13096.f43604 != null) {
                    ((C5853) interfaceC15732).m16063(c13096);
                    c13096.f43604 = null;
                    c13096.f43605 = null;
                }
                C13095 c13097 = new C13095(i, c13095.f43606);
                c13095.f43605 = c13097;
                if (this.f14625 == c13095.f43606) {
                    c13095 = c13097;
                }
                this.f14619 = c13095;
                if (this.f14620 == c13096) {
                    this.f14620 = c13097;
                    return;
                }
                return;
            }
        }
        C13095 c13098 = this.f14623;
        if (c13098.f43604 != null) {
            ((C5853) interfaceC15732).m16063(c13098);
            c13098.f43604 = null;
            c13098.f43605 = null;
        }
        C13095 c13099 = new C13095(i, this.f14625);
        this.f14623 = c13099;
        this.f14620 = c13099;
        this.f14619 = c13099;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m11378() {
        this.f14620 = this.f14623;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m11381(C16033 c16033, C22973 c22973) {
        this.f14620 = m11372(this.f14620, c16033, c22973, this.f14622);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11377(C16033 c16033, C22973 c22973) {
        m11372(this.f14620, c16033, c22973, this.f14622);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11376(long j) {
        C13095 c13095;
        if (j == -1) {
            return;
        }
        while (true) {
            c13095 = this.f14623;
            if (j < c13095.f43606) {
                break;
            }
            ((C5853) this.f14624).m16062(c13095.f43604);
            C13095 c13096 = this.f14623;
            c13096.f43604 = null;
            C13095 c13097 = c13096.f43605;
            c13096.f43605 = null;
            this.f14623 = c13097;
        }
        if (this.f14620.f43603 < c13095.f43603) {
            this.f14620 = c13095;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m11374() {
        return this.f14625;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m11373(InterfaceC6942 interfaceC6942, int i, boolean z) throws EOFException {
        int iM11369 = m11369(i);
        C13095 c13095 = this.f14619;
        C7264 c7264 = c13095.f43604;
        int i2 = interfaceC6942.read(c7264.f24179, ((int) (this.f14625 - c13095.f43603)) + c7264.f24180, iM11369);
        if (i2 == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        long j = this.f14625 + ((long) i2);
        this.f14625 = j;
        C13095 c13096 = this.f14619;
        if (j == c13096.f43606) {
            this.f14619 = c13096.f43605;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11375(int i, C2460 c2460) {
        while (i > 0) {
            int iM11369 = m11369(i);
            C13095 c13095 = this.f14619;
            C7264 c7264 = c13095.f43604;
            c2460.m7507(((int) (this.f14625 - c13095.f43603)) + c7264.f24180, iM11369, c7264.f24179);
            i -= iM11369;
            long j = this.f14625 + ((long) iM11369);
            this.f14625 = j;
            C13095 c13096 = this.f14619;
            if (j == c13096.f43606) {
                this.f14619 = c13096.f43605;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m11369(int i) {
        C13095 c13095 = this.f14619;
        if (c13095.f43604 == null) {
            C7264 c7264M16060 = ((C5853) this.f14624).m16060();
            C13095 c13096 = new C13095(this.f14621, this.f14619.f43606);
            c13095.f43604 = c7264M16060;
            c13095.f43605 = c13096;
        }
        return Math.min(i, (int) (this.f14619.f43606 - this.f14625));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13095 m11372(C13095 c13095, C16033 c16033, C22973 c22973, C2460 c2460) {
        C13095 c13095M11371;
        int iM7519;
        if (c16033.m38026()) {
            long j = c22973.f74677;
            c2460.m7517(1);
            C13095 c13095M11372 = m11371(c13095, j, c2460.m7518(), 1);
            long j2 = j + 1;
            byte b = c2460.m7518()[0];
            boolean z = (b & GCMSIVBlockCipher.MASK) != 0;
            int i = b & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID;
            C8977 c8977 = c16033.f51908;
            byte[] bArr = c8977.f30736;
            if (bArr == null) {
                c8977.f30736 = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            c13095M11371 = m11371(c13095M11372, j2, c8977.f30736, i);
            long j3 = j2 + ((long) i);
            if (z) {
                c2460.m7517(2);
                c13095M11371 = m11371(c13095M11371, j3, c2460.m7518(), 2);
                j3 += 2;
                iM7519 = c2460.m7519();
            } else {
                iM7519 = 1;
            }
            int[] iArr = c8977.f30735;
            if (iArr == null || iArr.length < iM7519) {
                iArr = new int[iM7519];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = c8977.f30742;
            if (iArr3 == null || iArr3.length < iM7519) {
                iArr3 = new int[iM7519];
            }
            int[] iArr4 = iArr3;
            if (z) {
                int i2 = iM7519 * 6;
                c2460.m7517(i2);
                c13095M11371 = m11371(c13095M11371, j3, c2460.m7518(), i2);
                j3 += (long) i2;
                c2460.m7510(0);
                for (int i3 = 0; i3 < iM7519; i3++) {
                    iArr2[i3] = c2460.m7519();
                    iArr4[i3] = c2460.m7531();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = c22973.f74676 - ((int) (j3 - c22973.f74677));
            }
            C18594 c18594 = c22973.f74675;
            String str = C17983.f57504;
            c8977.m23289(iM7519, iArr2, iArr4, c18594.f59156, c8977.f30736, c18594.f59159, c18594.f59158, c18594.f59157);
            long j4 = c22973.f74677;
            int i4 = (int) (j3 - j4);
            c22973.f74677 = j4 + ((long) i4);
            c22973.f74676 -= i4;
        } else {
            c13095M11371 = c13095;
        }
        if (c16033.m42268()) {
            c2460.m7517(4);
            C13095 c13095M11373 = m11371(c13095M11371, c22973.f74677, c2460.m7518(), 4);
            int iM7531 = c2460.m7531();
            c22973.f74677 += 4;
            c22973.f74676 -= 4;
            c16033.m38027(iM7531);
            C13095 c13095M11370 = m11370(c13095M11373, c22973.f74677, c16033.f51912, iM7531);
            c22973.f74677 += (long) iM7531;
            int i5 = c22973.f74676 - iM7531;
            c22973.f74676 = i5;
            ByteBuffer byteBuffer = c16033.f51909;
            if (byteBuffer == null || byteBuffer.capacity() < i5) {
                c16033.f51909 = ByteBuffer.allocate(i5);
            } else {
                c16033.f51909.clear();
            }
            return m11370(c13095M11370, c22973.f74677, c16033.f51909, c22973.f74676);
        }
        c16033.m38027(c22973.f74676);
        return m11370(c13095M11371, c22973.f74677, c16033.f51912, c22973.f74676);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13095 m11370(C13095 c13095, long j, ByteBuffer byteBuffer, int i) {
        while (j >= c13095.f43606) {
            c13095 = c13095.f43605;
        }
        while (i > 0) {
            int iMin = Math.min(i, (int) (c13095.f43606 - j));
            C7264 c7264 = c13095.f43604;
            byteBuffer.put(c7264.f24179, ((int) (j - c13095.f43603)) + c7264.f24180, iMin);
            i -= iMin;
            j += (long) iMin;
            if (j == c13095.f43606) {
                c13095 = c13095.f43605;
            }
        }
        return c13095;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13095 m11371(C13095 c13095, long j, byte[] bArr, int i) {
        while (j >= c13095.f43606) {
            c13095 = c13095.f43605;
        }
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (c13095.f43606 - j));
            C7264 c7264 = c13095.f43604;
            System.arraycopy(c7264.f24179, ((int) (j - c13095.f43603)) + c7264.f24180, bArr, i - i2, iMin);
            i2 -= iMin;
            j += (long) iMin;
            if (j == c13095.f43606) {
                c13095 = c13095.f43605;
            }
        }
        return c13095;
    }
}
