package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ᩴ᩶ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1TP */
/* JADX INFO: loaded from: classes4.dex */
public final class C18981 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public short f61440;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f61441;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long[] f61442;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f61443;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f61444;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public char[] f61445;

    public C18981(int i, long j) {
        this.f61441 = i;
        this.f61445 = new char[(int) (i * 1.5f)];
        this.f61442 = new long[i];
        m43683(j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43684(C18981 c18981, int i, int i2, int i3) {
        int codePoint;
        this.f61444 |= c18981.f61444;
        int iM43681 = c18981.m43681(i);
        int iM43682 = c18981.m43681(i2);
        boolean z = i > 0 && c18981.m43679(i + (-1));
        char[] cArrCopyOf = c18981.f61445;
        if (this == c18981) {
            cArrCopyOf = Arrays.copyOf(cArrCopyOf, cArrCopyOf.length);
        }
        int i4 = 0;
        while (iM43681 < iM43682) {
            char c = cArrCopyOf[iM43681];
            if (Character.isHighSurrogate(c)) {
                codePoint = c;
                iM43681++;
                codePoint = Character.toCodePoint(c, cArrCopyOf[iM43681]);
            }
            if (z) {
                codePoint = 32;
                z = false;
            }
            int iM31705 = C12757.m31705(codePoint);
            if (iM31705 > 0) {
                i3 += i4;
                i += i4;
                i4 = iM31705;
            }
            m43682(i3, codePoint, c18981.f61442[i]);
            iM43681++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m43680() {
        return this.f61440;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m43686() {
        short s = this.f61440;
        for (int i = 0; i < s; i++) {
            if (this.f61445[i] != ' ') {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m43681(int i) {
        if (i == this.f61441) {
            return this.f61440;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = i2 + 1;
            char c = this.f61445[i2];
            boolean zIsHighSurrogate = Character.isHighSurrogate(c);
            int i5 = c;
            if (zIsHighSurrogate) {
                int codePoint = Character.toCodePoint(c, this.f61445[i4]);
                i4 = i2 + 2;
                i5 = codePoint;
            }
            int iM31705 = C12757.m31705(i5);
            if (iM31705 > 0) {
                i3 += iM31705;
                if (i3 == i) {
                    while (i4 < this.f61440) {
                        if (Character.isHighSurrogate(this.f61445[i4])) {
                            char[] cArr = this.f61445;
                            if (C12757.m31705(Character.toCodePoint(cArr[i4], cArr[i4 + 1])) > 0) {
                                break;
                            }
                            i4 += 2;
                        } else {
                            if (C12757.m31705(this.f61445[i4]) > 0) {
                                break;
                            }
                            i4++;
                        }
                    }
                    return i4;
                }
                if (i3 > i) {
                    return i2;
                }
            }
            i2 = i4;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private boolean m43679(int i) {
        int codePoint;
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.f61440) {
            int i4 = i2 + 1;
            char c = this.f61445[i2];
            if (Character.isHighSurrogate(c)) {
                i2 += 2;
                codePoint = Character.toCodePoint(c, this.f61445[i4]);
            } else {
                i2 = i4;
                codePoint = c;
            }
            int iM31705 = C12757.m31705(codePoint);
            if (iM31705 > 0) {
                if (i3 == i && iM31705 == 2) {
                    return true;
                }
                i3 += iM31705;
                if (i3 > i) {
                    break;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43683(long j) {
        Arrays.fill(this.f61445, ' ');
        Arrays.fill(this.f61442, j);
        this.f61440 = (short) this.f61441;
        this.f61444 = false;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x0074  */
    /* JADX WARN: Code duplicated, block: B:36:0x0079  */
    /* JADX WARN: Code duplicated, block: B:39:0x0082  */
    /* JADX WARN: Code duplicated, block: B:42:0x008a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0092  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b6  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43682(int i, int i2, long j) {
        int i3;
        char[] cArr;
        int iM43681;
        char c;
        boolean zIsHighSurrogate;
        int codePoint;
        int iM31705;
        int i4;
        int i5;
        int iM43682;
        int i6;
        int iCharCount;
        int i7;
        int i8;
        int i9;
        short s;
        int i10;
        this.f61442[i] = j;
        int iM31706 = C12757.m31705(i2);
        if (!this.f61444) {
            if (i2 >= 65536 || iM31706 != 1) {
                this.f61444 = true;
            } else {
                this.f61445[i] = (char) i2;
                return;
            }
        }
        boolean z = iM31706 <= 0;
        boolean z2 = i > 0 && m43679(i + (-1));
        if (z) {
            if (z2) {
                i3 = i - 1;
            }
            cArr = this.f61445;
            iM43681 = m43681(i3);
            c = cArr[iM43681];
            zIsHighSurrogate = Character.isHighSurrogate(c);
            codePoint = c;
            if (zIsHighSurrogate) {
                codePoint = Character.toCodePoint(c, cArr[iM43681 + 1]);
            }
            iM31705 = C12757.m31705(codePoint);
            i4 = i3 + iM31705;
            i5 = this.f61441;
            if (i4 < i5) {
                iM43682 = m43681(i4);
            } else {
                iM43682 = this.f61440;
            }
            i6 = iM43682 - iM43681;
            iCharCount = Character.charCount(i2);
            if (z) {
                iCharCount += i6;
            }
            i7 = iM43681 + i6;
            i8 = iM43681 + iCharCount;
            i9 = iCharCount - i6;
            if (i9 > 0) {
                s = this.f61440;
                i10 = s - i7;
                if (s + i9 > cArr.length) {
                    char[] cArr2 = new char[cArr.length + i5];
                    System.arraycopy(cArr, 0, cArr2, 0, i7);
                    System.arraycopy(cArr, i7, cArr2, i8, i10);
                    this.f61445 = cArr2;
                    cArr = cArr2;
                } else {
                    System.arraycopy(cArr, i7, cArr, i8, i10);
                }
            } else if (i9 < 0) {
                System.arraycopy(cArr, i7, cArr, i8, this.f61440 - i7);
            }
            this.f61440 = (short) (this.f61440 + i9);
            if (!z) {
                i6 = 0;
            }
            Character.toChars(i2, cArr, iM43681 + i6);
            if (iM31705 != 2 && iM31706 == 1) {
                short s2 = this.f61440;
                if (s2 + 1 > cArr.length) {
                    char[] cArr3 = new char[cArr.length + i5];
                    System.arraycopy(cArr, 0, cArr3, 0, i8);
                    System.arraycopy(cArr, i8, cArr3, i8 + 1, this.f61440 - i8);
                    this.f61445 = cArr3;
                    cArr = cArr3;
                } else {
                    System.arraycopy(cArr, i8, cArr, i8 + 1, s2 - i8);
                }
                cArr[i8] = ' ';
                this.f61440 = (short) (this.f61440 + 1);
                return;
            }
            if (iM31705 == 1 || iM31706 != 2) {
            }
            if (i3 == i5 - 1) {
                throw new IllegalArgumentException();
            }
            if (i3 == i5 - 2) {
                this.f61440 = (short) i8;
                return;
            }
            int i11 = (Character.isHighSurrogate(this.f61445[i8]) ? 2 : 1) + i8;
            System.arraycopy(cArr, i11, cArr, i8, this.f61440 - i11);
            this.f61440 = (short) (this.f61440 - (i11 - i8));
            return;
        }
        if (z2) {
            m43682(i - 1, 32, j);
        }
        if (iM31706 == 2) {
            int i12 = i + 1;
            if (m43679(i12)) {
                m43682(i12, 32, j);
            }
        }
        i3 = i;
        cArr = this.f61445;
        iM43681 = m43681(i3);
        c = cArr[iM43681];
        zIsHighSurrogate = Character.isHighSurrogate(c);
        codePoint = c;
        if (zIsHighSurrogate) {
            codePoint = Character.toCodePoint(c, cArr[iM43681 + 1]);
        }
        iM31705 = C12757.m31705(codePoint);
        i4 = i3 + iM31705;
        i5 = this.f61441;
        if (i4 < i5) {
            iM43682 = m43681(i4);
        } else {
            iM43682 = this.f61440;
        }
        i6 = iM43682 - iM43681;
        iCharCount = Character.charCount(i2);
        if (z) {
            iCharCount += i6;
        }
        i7 = iM43681 + i6;
        i8 = iM43681 + iCharCount;
        i9 = iCharCount - i6;
        if (i9 > 0) {
            s = this.f61440;
            i10 = s - i7;
            if (s + i9 > cArr.length) {
                char[] cArr4 = new char[cArr.length + i5];
                System.arraycopy(cArr, 0, cArr4, 0, i7);
                System.arraycopy(cArr, i7, cArr4, i8, i10);
                this.f61445 = cArr4;
                cArr = cArr4;
            } else {
                System.arraycopy(cArr, i7, cArr, i8, i10);
            }
        } else if (i9 < 0) {
            System.arraycopy(cArr, i7, cArr, i8, this.f61440 - i7);
        }
        this.f61440 = (short) (this.f61440 + i9);
        if (!z) {
            i6 = 0;
        }
        Character.toChars(i2, cArr, iM43681 + i6);
        if (iM31705 != 2) {
        }
        if (iM31705 == 1) {
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long m43685(int i) {
        return this.f61442[i];
    }
}
