package l;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۙۨۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes2.dex */
public final class C4882 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long[] f17056;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f17058;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f17059;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f17063;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f17055 = new ArrayList();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final ArrayList f17060 = new ArrayList();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f17061 = false;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f17057 = 0;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f17062 = -1;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f17064 = false;

    public C4882(int i) {
        this.f17058 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14977(int i, int i2) {
        this.f17057++;
        int iMax = Math.max(i, 0);
        int iMin = Math.min(i2, 65535);
        if (iMax <= iMin) {
            int i3 = iMin < 128 ? 2 : 1024;
            long[] jArr = this.f17056;
            if (jArr == null) {
                this.f17056 = new long[i3];
            } else if (jArr.length < i3 || this.f17063) {
                this.f17056 = Arrays.copyOf(jArr, Math.max(jArr.length, i3));
                this.f17063 = false;
            }
            int i4 = iMax >>> 6;
            int i5 = iMin >>> 6;
            long j = (-1) << iMax;
            long j2 = (-1) >>> (63 - (iMin & 63));
            if (i4 == i5) {
                long[] jArr2 = this.f17056;
                jArr2[i4] = jArr2[i4] | (j & j2);
            } else {
                long[] jArr3 = this.f17056;
                jArr3[i4] = j | jArr3[i4];
                Arrays.fill(jArr3, i4 + 1, i5, -1L);
                long[] jArr4 = this.f17056;
                jArr4[i5] = jArr4[i5] | j2;
            }
            this.f17062 = Math.max(this.f17062, iMin);
            if (iMax <= 57343 && iMin >= 55296) {
                this.f17064 = true;
            }
        }
        if (i2 >= 65536) {
            this.f17055.add(new int[]{Math.max(i, 65536), i2});
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14976(int i) {
        int i2 = this.f17058;
        if ((i2 & 2) == 0) {
            m14977(i, i);
            return;
        }
        if ((i2 & 64) != 0) {
            int iM41869 = C17933.m41869(i);
            m14977(iM41869, iM41869);
        } else {
            if (C12690.m31484(i)) {
                i = C12690.m31488(i);
            }
            m14977(i, i);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m14980(int i, int i2) {
        int i3 = this.f17058;
        if ((i3 & 2) == 0) {
            m14977(i, i2);
            return;
        }
        if ((i3 & 64) != 0) {
            if (this.f17059 == null) {
                this.f17059 = new ArrayList();
            }
            this.f17059.add(new int[]{i, i2});
            if (this.f17064 || i > 57343 || i2 < 55296) {
                return;
            }
            this.f17064 = true;
            return;
        }
        int iMax = Math.max(i, 65);
        int iMin = Math.min(i2, 90);
        if (iMax > iMin) {
            if (i <= i2) {
                m14977(i, i2);
            }
        } else {
            if (i < iMax) {
                m14977(i, iMax - 1);
            }
            m14977(C12690.m31488(iMax), C12690.m31488(iMin));
            if (iMin < i2) {
                m14977(iMin + 1, i2);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14978(InterfaceC2885 interfaceC2885) {
        this.f17060.add(interfaceC2885);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14979(boolean z) {
        this.f17061 = z;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m14981() {
        if (this.f17057 != 0 || !this.f17060.isEmpty()) {
            return false;
        }
        ArrayList arrayList = this.f17059;
        return arrayList == null || arrayList.isEmpty();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2885 m14975() {
        long[] jArrCopyOf;
        InterfaceC2885 c11593;
        InterfaceC2885 c3631;
        InterfaceC2885 interfaceC2885Mo1304;
        long[] jArrCopyOf2;
        int[] iArrM14974;
        ArrayList arrayList = this.f17059;
        ArrayList<InterfaceC2885> arrayList2 = this.f17060;
        if (arrayList != null && !arrayList.isEmpty()) {
            arrayList2.add(C9927.m25760(this.f17059, this.f17064));
        }
        if (this.f17057 == 0 && arrayList2.isEmpty()) {
            if (this.f17061) {
                return new C8851();
            }
            return new C7360();
        }
        if (this.f17057 == 0) {
            InterfaceC2885 interfaceC2885Negate = this.f17061 ? ((InterfaceC2885) arrayList2.get(0)).negate() : (InterfaceC2885) arrayList2.get(0);
            for (int i = 1; i < arrayList2.size(); i++) {
                interfaceC2885Negate = this.f17061 ? interfaceC2885Negate.mo1302(((InterfaceC2885) arrayList2.get(i)).negate()) : interfaceC2885Negate.mo1304((InterfaceC2885) arrayList2.get(i));
            }
            return interfaceC2885Negate;
        }
        if (this.f17056 == null) {
            this.f17056 = new long[1024];
        }
        if (!this.f17055.isEmpty()) {
            if (this.f17061) {
                long[] jArr = this.f17056;
                jArrCopyOf2 = new long[jArr.length];
                for (int i2 = 0; i2 < jArr.length; i2++) {
                    jArrCopyOf2[i2] = ~jArr[i2];
                }
                iArrM14974 = m14974();
            } else {
                jArrCopyOf2 = Arrays.copyOf(this.f17056, 1024);
                iArrM14974 = m14974();
            }
            c3631 = new C11593(jArrCopyOf2, iArrM14974, this.f17061);
        } else {
            boolean z = this.f17064;
            int i3 = this.f17058;
            if (z || this.f17061) {
                if (!this.f17061) {
                    jArrCopyOf = Arrays.copyOf(this.f17056, 1024);
                } else {
                    long[] jArr2 = this.f17056;
                    jArrCopyOf = new long[jArr2.length];
                    for (int i4 = 0; i4 < jArr2.length; i4++) {
                        jArrCopyOf[i4] = ~jArr2[i4];
                    }
                }
                if ((i3 & 2) == 0) {
                    c11593 = new C11593(jArrCopyOf, new int[0], this.f17061);
                } else if ((i3 & 64) != 0) {
                    c11593 = new C7691(jArrCopyOf, this.f17061);
                } else {
                    c11593 = new C25261(jArrCopyOf, this.f17061);
                }
                c3631 = c11593;
            } else {
                long[] jArr3 = this.f17056;
                this.f17063 = true;
                if ((i3 & 2) == 0) {
                    c3631 = new C3631(jArr3);
                } else if ((i3 & 64) != 0) {
                    c3631 = new C18132(jArr3);
                } else {
                    c3631 = new C11834(jArr3);
                }
            }
        }
        for (InterfaceC2885 interfaceC2885 : arrayList2) {
            if (this.f17061) {
                interfaceC2885Mo1304 = c3631.mo1302(interfaceC2885.negate());
            } else {
                interfaceC2885Mo1304 = c3631.mo1304(interfaceC2885);
            }
            c3631 = interfaceC2885Mo1304;
        }
        return c3631;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private int[] m14974() {
        ArrayList arrayList = this.f17055;
        if (arrayList.isEmpty()) {
            return new int[0];
        }
        C12884.sort(arrayList, new C14071());
        ArrayList arrayList2 = new ArrayList();
        int[] iArr = (int[]) ((int[]) arrayList.get(0)).clone();
        for (int i = 1; i < arrayList.size(); i++) {
            int[] iArr2 = (int[]) arrayList.get(i);
            int i2 = iArr2[0];
            int i3 = iArr[1];
            if (i2 <= i3 + 1) {
                iArr[1] = Math.max(i3, iArr2[1]);
            } else {
                arrayList2.add(iArr);
                iArr = (int[]) iArr2.clone();
            }
        }
        arrayList2.add(iArr);
        int[] iArr3 = new int[arrayList2.size() * 2];
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            int i5 = i4 * 2;
            iArr3[i5] = ((int[]) arrayList2.get(i4))[0];
            iArr3[i5 + 1] = ((int[]) arrayList2.get(i4))[1];
        }
        return iArr3;
    }
}
