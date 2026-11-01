package l;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۖᩴܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: J5T5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2718 implements InterfaceC23865 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public byte[] f10457;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f10458;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f10459;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f10460;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f10461;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f10462;

    public C2718(byte[] bArr) {
        this(bArr, false);
    }

    public C2718() {
        this(new byte[1000], true);
    }

    public C2718(byte[] bArr, boolean z) {
        if (bArr == null) {
            throw new NullPointerException("data == null");
        }
        this.f10462 = z;
        this.f10457 = bArr;
        this.f10460 = 0;
        this.f10461 = null;
        this.f10458 = 0;
        this.f10459 = 0;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final byte[] m8290() {
        return this.f10457;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final byte[] m8278() {
        int i = this.f10460;
        byte[] bArr = new byte[i];
        System.arraycopy(this.f10457, 0, bArr, 0, i);
        return bArr;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m8296() {
        return this.f10460;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m8295(int i) {
        if (this.f10460 == i) {
            return;
        }
        StringBuilder sbM40153 = C17214.m40153(i, "expected cursor ", "; actual value: ");
        sbM40153.append(this.f10460);
        throw new C7513(sbM40153.toString(), null);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m8280(int i) {
        int i2 = this.f10460;
        int i3 = i2 + 1;
        if (this.f10462) {
            m8275(i3);
        } else if (i3 > this.f10457.length) {
            m8276();
            throw null;
        }
        this.f10457[i2] = (byte) i;
        this.f10460 = i3;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m8297(int i) {
        int i2 = this.f10460;
        int i3 = i2 + 2;
        if (this.f10462) {
            m8275(i3);
        } else if (i3 > this.f10457.length) {
            m8276();
            throw null;
        }
        byte[] bArr = this.f10457;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        this.f10460 = i3;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m8289(int i) {
        int i2 = this.f10460;
        int i3 = i2 + 4;
        if (this.f10462) {
            m8275(i3);
        } else if (i3 > this.f10457.length) {
            m8276();
            throw null;
        }
        byte[] bArr = this.f10457;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
        this.f10460 = i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8284(long j) {
        int i = this.f10460;
        int i2 = i + 8;
        if (this.f10462) {
            m8275(i2);
        } else if (i2 > this.f10457.length) {
            m8276();
            throw null;
        }
        int i3 = (int) j;
        byte[] bArr = this.f10457;
        bArr[i] = (byte) i3;
        bArr[i + 1] = (byte) (i3 >> 8);
        bArr[i + 2] = (byte) (i3 >> 16);
        bArr[i + 3] = (byte) (i3 >> 24);
        int i4 = (int) (j >> 32);
        bArr[i + 4] = (byte) i4;
        bArr[i + 5] = (byte) (i4 >> 8);
        bArr[i + 6] = (byte) (i4 >> 16);
        bArr[i + 7] = (byte) (i4 >> 24);
        this.f10460 = i2;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int m8293(int i) {
        if (this.f10462) {
            m8275(this.f10460 + 5);
        }
        int i2 = this.f10460;
        while (true) {
            int i3 = i >>> 7;
            if (i3 != 0) {
                m8280((byte) ((i & 127) | 128));
                i = i3;
            } else {
                m8280((byte) (i & 127));
                return this.f10460 - i2;
            }
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m8277(int i) {
        if (this.f10462) {
            m8275(this.f10460 + 5);
        }
        int i2 = i >> 7;
        int i3 = (Integer.MIN_VALUE & i) == 0 ? 0 : -1;
        boolean z = true;
        while (true) {
            int i4 = i2;
            int i5 = i;
            i = i4;
            if (!z) {
                return;
            }
            z = (i == i3 && (i & 1) == ((i5 >> 6) & 1)) ? false : true;
            m8280((byte) ((i5 & 127) | (z ? 128 : 0)));
            i2 = i >> 7;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8286(C14009 c14009) {
        int iM33864 = c14009.m33864();
        int i = this.f10460;
        int i2 = iM33864 + i;
        if (this.f10462) {
            m8275(i2);
        } else if (i2 > this.f10457.length) {
            m8276();
            throw null;
        }
        c14009.m33867(i, this.f10457);
        this.f10460 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8287(byte[] bArr) {
        int length = bArr.length;
        int i = this.f10460;
        int i2 = i + length;
        if ((length | i2) < 0 || length > bArr.length) {
            throw new IndexOutOfBoundsException("bytes.length " + bArr.length + "; 0..!" + i2);
        }
        if (this.f10462) {
            m8275(i2);
        } else if (i2 > this.f10457.length) {
            m8276();
            throw null;
        }
        System.arraycopy(bArr, 0, this.f10457, i, length);
        this.f10460 = i2;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m8281(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("count < 0");
        }
        int i2 = this.f10460 + i;
        if (this.f10462) {
            m8275(i2);
        } else if (i2 > this.f10457.length) {
            m8276();
            throw null;
        }
        Arrays.fill(this.f10457, this.f10460, i2, (byte) 0);
        this.f10460 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8282(int i) {
        int i2 = i - 1;
        if (i < 0 || (i & i2) != 0) {
            throw new IllegalArgumentException("bogus alignment");
        }
        int i3 = (this.f10460 + i2) & (~i2);
        if (this.f10462) {
            m8275(i3);
        } else if (i3 > this.f10457.length) {
            m8276();
            throw null;
        }
        Arrays.fill(this.f10457, this.f10460, i3, (byte) 0);
        this.f10460 = i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m8288() {
        return this.f10461 != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8285(String str) {
        if (this.f10461 == null) {
            return;
        }
        m8294();
        this.f10461.add(new C11892(this.f10460, Integer.MAX_VALUE, str));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8283(int i, String str) {
        if (this.f10461 == null) {
            return;
        }
        m8294();
        int size = this.f10461.size();
        int iM29651 = size == 0 ? 0 : ((C11892) this.f10461.get(size - 1)).m29651();
        int i2 = this.f10460;
        if (iM29651 <= i2) {
            iM29651 = i2;
        }
        this.f10461.add(new C11892(iM29651, i + iM29651, str));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m8294() {
        int size;
        ArrayList arrayList = this.f10461;
        if (arrayList == null || (size = arrayList.size()) == 0) {
            return;
        }
        ((C11892) this.f10461.get(size - 1)).m29654(this.f10460);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m8279() {
        int i = this.f10459;
        return this.f10458 - ((i / 2) + ((i * 2) + 8));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m8292(int i) {
        if (this.f10461 != null || this.f10460 != 0) {
            throw new RuntimeException("cannot enable annotations");
        }
        if (i < 40) {
            throw new IllegalArgumentException("annotationWidth < 40");
        }
        int iM9602 = C3184.m9602(i, 7, 15, 1) & (-2);
        if (iM9602 < 6) {
            iM9602 = 6;
        } else if (iM9602 > 10) {
            iM9602 = 10;
        }
        this.f10461 = new ArrayList(1000);
        this.f10458 = i;
        this.f10459 = iM9602;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m8291() {
        m8294();
        ArrayList arrayList = this.f10461;
        if (arrayList != null) {
            for (int size = arrayList.size(); size > 0; size--) {
                int i = size - 1;
                C11892 c11892 = (C11892) this.f10461.get(i);
                if (c11892.m29653() > this.f10460) {
                    this.f10461.remove(i);
                } else {
                    int iM29651 = c11892.m29651();
                    int i2 = this.f10460;
                    if (iM29651 > i2) {
                        c11892.m29652(i2);
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static void m8276() {
        throw new IndexOutOfBoundsException("attempt to write past the end");
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m8275(int i) {
        byte[] bArr = this.f10457;
        if (bArr.length < i) {
            byte[] bArr2 = new byte[(i * 2) + 1000];
            System.arraycopy(bArr, 0, bArr2, 0, this.f10460);
            this.f10457 = bArr2;
        }
    }
}
