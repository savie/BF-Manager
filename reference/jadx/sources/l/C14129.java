package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.۬᩷᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: H1TP */
/* JADX INFO: loaded from: classes4.dex */
public final class C14129 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f44695;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f44696;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public char[] f44697;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long[] f44698;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f44699;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public short f44700;

    public C14129(int i, long j) {
        this.f44695 = i;
        this.f44697 = new char[(int) (i * 1.5f)];
        this.f44698 = new long[i];
        m34344(j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34345(C14129 c14129, int i, int i2, int i3) {
        int codePoint;
        this.f44699 |= c14129.f44699;
        int iM34342 = c14129.m34342(i);
        int iM34343 = c14129.m34342(i2);
        boolean z = i > 0 && c14129.m34340(i + (-1));
        char[] cArrCopyOf = c14129.f44697;
        if (this == c14129) {
            cArrCopyOf = Arrays.copyOf(cArrCopyOf, cArrCopyOf.length);
        }
        int i4 = 0;
        while (iM34342 < iM34343) {
            char c = cArrCopyOf[iM34342];
            if (Character.isHighSurrogate(c)) {
                codePoint = c;
                iM34342++;
                codePoint = Character.toCodePoint(c, cArrCopyOf[iM34342]);
            }
            if (z) {
                codePoint = 32;
                z = false;
            }
            int iM48443 = C21260.m48443(codePoint);
            if (iM48443 > 0) {
                i3 += i4;
                i += i4;
                i4 = iM48443;
            }
            m34343(i3, codePoint, c14129.f44698[i]);
            iM34342++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m34341() {
        return this.f44700;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m34347() {
        short s = this.f44700;
        for (int i = 0; i < s; i++) {
            if (this.f44697[i] != ' ') {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m34342(int i) {
        if (i == this.f44695) {
            return this.f44700;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = i2 + 1;
            char c = this.f44697[i2];
            boolean zIsHighSurrogate = Character.isHighSurrogate(c);
            int i5 = c;
            if (zIsHighSurrogate) {
                int codePoint = Character.toCodePoint(c, this.f44697[i4]);
                i4 = i2 + 2;
                i5 = codePoint;
            }
            int iM48443 = C21260.m48443(i5);
            if (iM48443 > 0) {
                i3 += iM48443;
                if (i3 == i) {
                    while (i4 < this.f44700) {
                        if (Character.isHighSurrogate(this.f44697[i4])) {
                            char[] cArr = this.f44697;
                            if (C21260.m48443(Character.toCodePoint(cArr[i4], cArr[i4 + 1])) > 0) {
                                break;
                            }
                            i4 += 2;
                        } else {
                            if (C21260.m48443(this.f44697[i4]) > 0) {
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

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private boolean m34340(int i) {
        int codePoint;
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.f44700) {
            int i4 = i2 + 1;
            char c = this.f44697[i2];
            if (Character.isHighSurrogate(c)) {
                i2 += 2;
                codePoint = Character.toCodePoint(c, this.f44697[i4]);
            } else {
                i2 = i4;
                codePoint = c;
            }
            int iM48443 = C21260.m48443(codePoint);
            if (iM48443 > 0) {
                if (i3 == i && iM48443 == 2) {
                    return true;
                }
                i3 += iM48443;
                if (i3 > i) {
                    break;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34344(long j) {
        Arrays.fill(this.f44697, ' ');
        Arrays.fill(this.f44698, j);
        this.f44700 = (short) this.f44695;
        this.f44699 = false;
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
    public final void m34343(int i, int i2, long j) {
        int i3;
        char[] cArr;
        int iM34342;
        char c;
        boolean zIsHighSurrogate;
        int codePoint;
        int iM48443;
        int i4;
        int i5;
        int iM34343;
        int i6;
        int iCharCount;
        int i7;
        int i8;
        int i9;
        short s;
        int i10;
        this.f44698[i] = j;
        int iM48444 = C21260.m48443(i2);
        if (!this.f44699) {
            if (i2 >= 65536 || iM48444 != 1) {
                this.f44699 = true;
            } else {
                this.f44697[i] = (char) i2;
                return;
            }
        }
        boolean z = iM48444 <= 0;
        boolean z2 = i > 0 && m34340(i + (-1));
        if (z) {
            if (z2) {
                i3 = i - 1;
            }
            cArr = this.f44697;
            iM34342 = m34342(i3);
            c = cArr[iM34342];
            zIsHighSurrogate = Character.isHighSurrogate(c);
            codePoint = c;
            if (zIsHighSurrogate) {
                codePoint = Character.toCodePoint(c, cArr[iM34342 + 1]);
            }
            iM48443 = C21260.m48443(codePoint);
            i4 = i3 + iM48443;
            i5 = this.f44695;
            if (i4 < i5) {
                iM34343 = m34342(i4);
            } else {
                iM34343 = this.f44700;
            }
            i6 = iM34343 - iM34342;
            iCharCount = Character.charCount(i2);
            if (z) {
                iCharCount += i6;
            }
            i7 = iM34342 + i6;
            i8 = iM34342 + iCharCount;
            i9 = iCharCount - i6;
            if (i9 > 0) {
                s = this.f44700;
                i10 = s - i7;
                if (s + i9 > cArr.length) {
                    char[] cArr2 = new char[cArr.length + i5];
                    System.arraycopy(cArr, 0, cArr2, 0, i7);
                    System.arraycopy(cArr, i7, cArr2, i8, i10);
                    this.f44697 = cArr2;
                    cArr = cArr2;
                } else {
                    System.arraycopy(cArr, i7, cArr, i8, i10);
                }
            } else if (i9 < 0) {
                System.arraycopy(cArr, i7, cArr, i8, this.f44700 - i7);
            }
            this.f44700 = (short) (this.f44700 + i9);
            if (!z) {
                i6 = 0;
            }
            Character.toChars(i2, cArr, iM34342 + i6);
            if (iM48443 != 2 && iM48444 == 1) {
                short s2 = this.f44700;
                if (s2 + 1 > cArr.length) {
                    char[] cArr3 = new char[cArr.length + i5];
                    System.arraycopy(cArr, 0, cArr3, 0, i8);
                    System.arraycopy(cArr, i8, cArr3, i8 + 1, this.f44700 - i8);
                    this.f44697 = cArr3;
                    cArr = cArr3;
                } else {
                    System.arraycopy(cArr, i8, cArr, i8 + 1, s2 - i8);
                }
                cArr[i8] = ' ';
                this.f44700 = (short) (this.f44700 + 1);
                return;
            }
            if (iM48443 == 1 || iM48444 != 2) {
            }
            if (i3 == i5 - 1) {
                throw new IllegalArgumentException();
            }
            if (i3 == i5 - 2) {
                this.f44700 = (short) i8;
                return;
            }
            int i11 = (Character.isHighSurrogate(this.f44697[i8]) ? 2 : 1) + i8;
            System.arraycopy(cArr, i11, cArr, i8, this.f44700 - i11);
            this.f44700 = (short) (this.f44700 - (i11 - i8));
            return;
        }
        if (z2) {
            m34343(i - 1, 32, j);
        }
        if (iM48444 == 2) {
            int i12 = i + 1;
            if (m34340(i12)) {
                m34343(i12, 32, j);
            }
        }
        i3 = i;
        cArr = this.f44697;
        iM34342 = m34342(i3);
        c = cArr[iM34342];
        zIsHighSurrogate = Character.isHighSurrogate(c);
        codePoint = c;
        if (zIsHighSurrogate) {
            codePoint = Character.toCodePoint(c, cArr[iM34342 + 1]);
        }
        iM48443 = C21260.m48443(codePoint);
        i4 = i3 + iM48443;
        i5 = this.f44695;
        if (i4 < i5) {
            iM34343 = m34342(i4);
        } else {
            iM34343 = this.f44700;
        }
        i6 = iM34343 - iM34342;
        iCharCount = Character.charCount(i2);
        if (z) {
            iCharCount += i6;
        }
        i7 = iM34342 + i6;
        i8 = iM34342 + iCharCount;
        i9 = iCharCount - i6;
        if (i9 > 0) {
            s = this.f44700;
            i10 = s - i7;
            if (s + i9 > cArr.length) {
                char[] cArr4 = new char[cArr.length + i5];
                System.arraycopy(cArr, 0, cArr4, 0, i7);
                System.arraycopy(cArr, i7, cArr4, i8, i10);
                this.f44697 = cArr4;
                cArr = cArr4;
            } else {
                System.arraycopy(cArr, i7, cArr, i8, i10);
            }
        } else if (i9 < 0) {
            System.arraycopy(cArr, i7, cArr, i8, this.f44700 - i7);
        }
        this.f44700 = (short) (this.f44700 + i9);
        if (!z) {
            i6 = 0;
        }
        Character.toChars(i2, cArr, iM34342 + i6);
        if (iM48443 != 2) {
        }
        if (iM48443 == 1) {
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m34346(int i) {
        return this.f44698[i];
    }
}
