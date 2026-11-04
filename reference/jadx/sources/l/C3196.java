package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ۗۚۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 04FP */
/* JADX INFO: loaded from: classes2.dex */
public final class C3196 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final InterfaceC25000 f10431;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList f10437 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C23334[] f10430 = new C23334[8];

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f10433 = 7;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f10432 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f10436 = 0;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f10435 = 4096;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f10434 = 4096;

    public C3196(InterfaceC13810 interfaceC13810) {
        this.f10431 = C14556.m35108(interfaceC13810);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m10519(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.f10430.length;
            while (true) {
                length--;
                i2 = this.f10433;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.f10430[length].f75576;
                i -= i4;
                this.f10436 -= i4;
                this.f10432--;
                i3++;
            }
            C23334[] c23334Arr = this.f10430;
            System.arraycopy(c23334Arr, i2 + 1, c23334Arr, i2 + 1 + i3, this.f10432);
            this.f10433 += i3;
        }
        return i3;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m10524() {
        while (true) {
            InterfaceC25000 interfaceC25000 = this.f10431;
            if (interfaceC25000.mo4182()) {
                return;
            }
            byte b = interfaceC25000.readByte();
            int i = b & 255;
            if (i == 128) {
                throw new IOException("index == 0");
            }
            int i2 = b & GCMSIVBlockCipher.MASK;
            ArrayList arrayList = this.f10437;
            if (i2 == 128) {
                int iM10522 = m10522(i, 127);
                int i3 = iM10522 - 1;
                if (i3 >= 0) {
                    C23334[] c23334Arr = C12145.f39054;
                    if (i3 <= c23334Arr.length - 1) {
                        arrayList.add(c23334Arr[i3]);
                    }
                }
                int length = this.f10433 + 1 + (i3 - C12145.f39054.length);
                if (length >= 0) {
                    C23334[] c23334Arr2 = this.f10430;
                    if (length < c23334Arr2.length) {
                        arrayList.add(c23334Arr2[length]);
                    }
                }
                throw new IOException(C13645.m33382(iM10522, "Header index too large "));
            }
            if (i == 64) {
                C16794 c16794M10525 = m10525();
                C12145.m30352(c16794M10525);
                m10520(new C23334(c16794M10525, m10525()));
            } else if ((b & 64) == 64) {
                m10520(new C23334(m10521(m10522(i, 63) - 1), m10525()));
            } else if ((b & UTF8.S_CS3) == 32) {
                int iM10523 = m10522(i, 31);
                this.f10434 = iM10523;
                if (iM10523 < 0 || iM10523 > this.f10435) {
                    throw new IOException("Invalid dynamic table size update " + this.f10434);
                }
                int i4 = this.f10436;
                if (iM10523 < i4) {
                    if (iM10523 == 0) {
                        Arrays.fill(this.f10430, (Object) null);
                        this.f10433 = this.f10430.length - 1;
                        this.f10432 = 0;
                        this.f10436 = 0;
                    } else {
                        m10519(i4 - iM10523);
                    }
                }
            } else if (i == 16 || i == 0) {
                C16794 c16794M10526 = m10525();
                C12145.m30352(c16794M10526);
                arrayList.add(new C23334(c16794M10526, m10525()));
            } else {
                arrayList.add(new C23334(m10521(m10522(i, 15) - 1), m10525()));
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m10523() {
        ArrayList arrayList = this.f10437;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        return arrayList2;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private C16794 m10521(int i) throws IOException {
        if (i >= 0) {
            C23334[] c23334Arr = C12145.f39054;
            if (i <= c23334Arr.length - 1) {
                return c23334Arr[i].f75578;
            }
        }
        int length = this.f10433 + 1 + (i - C12145.f39054.length);
        if (length >= 0) {
            C23334[] c23334Arr2 = this.f10430;
            if (length < c23334Arr2.length) {
                return c23334Arr2[length].f75578;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m10520(C23334 c23334) {
        this.f10437.add(c23334);
        int i = c23334.f75576;
        int i2 = this.f10434;
        if (i > i2) {
            Arrays.fill(this.f10430, (Object) null);
            this.f10433 = this.f10430.length - 1;
            this.f10432 = 0;
            this.f10436 = 0;
            return;
        }
        m10519((this.f10436 + i) - i2);
        int i3 = this.f10432 + 1;
        C23334[] c23334Arr = this.f10430;
        if (i3 > c23334Arr.length) {
            C23334[] c23334Arr2 = new C23334[c23334Arr.length * 2];
            System.arraycopy(c23334Arr, 0, c23334Arr2, c23334Arr.length, c23334Arr.length);
            this.f10433 = this.f10430.length - 1;
            this.f10430 = c23334Arr2;
        }
        int i4 = this.f10433;
        this.f10433 = i4 - 1;
        this.f10430[i4] = c23334;
        this.f10432++;
        this.f10436 += i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m10522(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte b = this.f10431.readByte();
            int i5 = b & 255;
            if ((b & GCMSIVBlockCipher.MASK) == 0) {
                return i2 + (i5 << i4);
            }
            i2 += (b & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << i4;
            i4 += 7;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C16794 m10525() {
        InterfaceC25000 interfaceC25000 = this.f10431;
        byte b = interfaceC25000.readByte();
        int i = b & 255;
        boolean z = (b & GCMSIVBlockCipher.MASK) == 128;
        int iM10522 = m10522(i, 127);
        if (z) {
            return C16794.m39649(C17256.m40515().m40517(interfaceC25000.mo4180(iM10522)));
        }
        return interfaceC25000.mo4178(iM10522);
    }
}
