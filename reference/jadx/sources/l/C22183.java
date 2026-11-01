package l;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩹ۡۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes.dex */
public final class C22183 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long[] f72551;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public ArrayList f72553;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f72554;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f72556;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final ArrayList f72550 = new ArrayList();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final ArrayList f72548 = new ArrayList();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f72557 = false;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f72555 = 0;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f72552 = -1;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f72549 = false;

    public C22183(int i) {
        this.f72554 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49204(int i, int i2) {
        this.f72555++;
        int iMax = Math.max(i, 0);
        int iMin = Math.min(i2, 65535);
        if (iMax <= iMin) {
            int i3 = iMin < 128 ? 2 : 1024;
            long[] jArr = this.f72551;
            if (jArr == null) {
                this.f72551 = new long[i3];
            } else if (jArr.length < i3 || this.f72556) {
                this.f72551 = Arrays.copyOf(jArr, Math.max(jArr.length, i3));
                this.f72556 = false;
            }
            int i4 = iMax >>> 6;
            int i5 = iMin >>> 6;
            long j = (-1) << iMax;
            long j2 = (-1) >>> (63 - (iMin & 63));
            if (i4 == i5) {
                long[] jArr2 = this.f72551;
                jArr2[i4] = jArr2[i4] | (j & j2);
            } else {
                long[] jArr3 = this.f72551;
                jArr3[i4] = j | jArr3[i4];
                Arrays.fill(jArr3, i4 + 1, i5, -1L);
                long[] jArr4 = this.f72551;
                jArr4[i5] = jArr4[i5] | j2;
            }
            this.f72552 = Math.max(this.f72552, iMin);
            if (iMax <= 57343 && iMin >= 55296) {
                this.f72549 = true;
            }
        }
        if (i2 >= 65536) {
            this.f72550.add(new int[]{Math.max(i, 65536), i2});
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49203(int i) {
        int i2 = this.f72554;
        if ((i2 & 2) == 0) {
            m49204(i, i);
            return;
        }
        if ((i2 & 64) != 0) {
            int iM30171 = C12123.m30171(i);
            m49204(iM30171, iM30171);
        } else {
            if (C20025.m45351(i)) {
                i = C20025.m45350(i);
            }
            m49204(i, i);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m49207(int i, int i2) {
        int i3 = this.f72554;
        if ((i3 & 2) == 0) {
            m49204(i, i2);
            return;
        }
        if ((i3 & 64) != 0) {
            if (this.f72553 == null) {
                this.f72553 = new ArrayList();
            }
            this.f72553.add(new int[]{i, i2});
            if (this.f72549 || i > 57343 || i2 < 55296) {
                return;
            }
            this.f72549 = true;
            return;
        }
        int iMax = Math.max(i, 65);
        int iMin = Math.min(i2, 90);
        if (iMax > iMin) {
            if (i <= i2) {
                m49204(i, i2);
            }
        } else {
            if (i < iMax) {
                m49204(i, iMax - 1);
            }
            m49204(C20025.m45350(iMax), C20025.m45350(iMin));
            if (iMin < i2) {
                m49204(iMin + 1, i2);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49205(InterfaceC13717 interfaceC13717) {
        this.f72548.add(interfaceC13717);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49206(boolean z) {
        this.f72557 = z;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m49208() {
        if (this.f72555 != 0 || !this.f72548.isEmpty()) {
            return false;
        }
        ArrayList arrayList = this.f72553;
        return arrayList == null || arrayList.isEmpty();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13717 m49202() {
        long[] jArrCopyOf;
        InterfaceC13717 c18655;
        InterfaceC13717 c21081;
        InterfaceC13717 interfaceC13717Mo1814;
        long[] jArrCopyOf2;
        int[] iArrM49201;
        ArrayList arrayList = this.f72553;
        ArrayList<InterfaceC13717> arrayList2 = this.f72548;
        if (arrayList != null && !arrayList.isEmpty()) {
            arrayList2.add(C9525.m24369(this.f72553, this.f72549));
        }
        if (this.f72555 == 0 && arrayList2.isEmpty()) {
            if (this.f72557) {
                return new C11600();
            }
            return new C2426();
        }
        if (this.f72555 == 0) {
            InterfaceC13717 interfaceC13717Negate = this.f72557 ? ((InterfaceC13717) arrayList2.get(0)).negate() : (InterfaceC13717) arrayList2.get(0);
            for (int i = 1; i < arrayList2.size(); i++) {
                interfaceC13717Negate = this.f72557 ? interfaceC13717Negate.mo1812(((InterfaceC13717) arrayList2.get(i)).negate()) : interfaceC13717Negate.mo1814((InterfaceC13717) arrayList2.get(i));
            }
            return interfaceC13717Negate;
        }
        if (this.f72551 == null) {
            this.f72551 = new long[1024];
        }
        if (!this.f72550.isEmpty()) {
            if (this.f72557) {
                long[] jArr = this.f72551;
                jArrCopyOf2 = new long[jArr.length];
                for (int i2 = 0; i2 < jArr.length; i2++) {
                    jArrCopyOf2[i2] = ~jArr[i2];
                }
                iArrM49201 = m49201();
            } else {
                jArrCopyOf2 = Arrays.copyOf(this.f72551, 1024);
                iArrM49201 = m49201();
            }
            c21081 = new C18655(jArrCopyOf2, iArrM49201, this.f72557);
        } else {
            boolean z = this.f72549;
            int i3 = this.f72554;
            if (z || this.f72557) {
                if (!this.f72557) {
                    jArrCopyOf = Arrays.copyOf(this.f72551, 1024);
                } else {
                    long[] jArr2 = this.f72551;
                    jArrCopyOf = new long[jArr2.length];
                    for (int i4 = 0; i4 < jArr2.length; i4++) {
                        jArrCopyOf[i4] = ~jArr2[i4];
                    }
                }
                if ((i3 & 2) == 0) {
                    c18655 = new C18655(jArrCopyOf, new int[0], this.f72557);
                } else if ((i3 & 64) != 0) {
                    c18655 = new C14464(jArrCopyOf, this.f72557);
                } else {
                    c18655 = new C8382(jArrCopyOf, this.f72557);
                }
                c21081 = c18655;
            } else {
                long[] jArr3 = this.f72551;
                this.f72556 = true;
                if ((i3 & 2) == 0) {
                    c21081 = new C21081(jArr3);
                } else if ((i3 & 64) != 0) {
                    c21081 = new C10936(jArr3);
                } else {
                    c21081 = new C18965(jArr3);
                }
            }
        }
        for (InterfaceC13717 interfaceC13717 : arrayList2) {
            if (this.f72557) {
                interfaceC13717Mo1814 = c21081.mo1812(interfaceC13717.negate());
            } else {
                interfaceC13717Mo1814 = c21081.mo1814(interfaceC13717);
            }
            c21081 = interfaceC13717Mo1814;
        }
        return c21081;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private int[] m49201() {
        ArrayList arrayList = this.f72550;
        if (arrayList.isEmpty()) {
            return new int[0];
        }
        C23846.sort(arrayList, new C5249());
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
