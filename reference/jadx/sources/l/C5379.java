package l;

import com.google.android.material.color.MaterialColors;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۚ۬᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 2B08 */
/* JADX INFO: loaded from: classes2.dex */
public class C5379 implements Closeable {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f18579;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public int[] f18581;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int[] f18582;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String f18583;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String[] f18584;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f18588;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final StringReader f18592;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public EnumC14948 f18585 = EnumC14948.LEGACY_STRICT;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f18591 = 255;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final char[] f18589 = new char[1024];

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f18580 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f18578 = 0;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f18590 = 0;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f18586 = 0;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f18593 = 0;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public int f18587 = 1;

    public C5379(StringReader stringReader) {
        int[] iArr = new int[32];
        this.f18581 = iArr;
        iArr[0] = 6;
        this.f18584 = new String[32];
        this.f18582 = new int[32];
        this.f18592 = stringReader;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean m14915() {
        return this.f18585 == EnumC14948.LENIENT;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14914(EnumC14948 enumC14948) {
        C13638.requireNonNull(enumC14948);
        this.f18585 = enumC14948;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final EnumC14948 m14923() {
        return this.f18585;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m14913() throws IOException {
        int iM14912 = this.f18593;
        if (iM14912 == 0) {
            iM14912 = m14912();
        }
        if (iM14912 == 3) {
            m14906(1);
            this.f18582[this.f18587 - 1] = 0;
            this.f18593 = 0;
            return;
        }
        throw m14905("BEGIN_ARRAY");
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public void m14929() throws IOException {
        int iM14912 = this.f18593;
        if (iM14912 == 0) {
            iM14912 = m14912();
        }
        if (iM14912 == 4) {
            int i = this.f18587;
            this.f18587 = i - 1;
            int[] iArr = this.f18582;
            int i2 = i - 2;
            iArr[i2] = iArr[i2] + 1;
            this.f18593 = 0;
            return;
        }
        throw m14905("END_ARRAY");
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public void m14917() throws IOException {
        int iM14912 = this.f18593;
        if (iM14912 == 0) {
            iM14912 = m14912();
        }
        if (iM14912 == 1) {
            m14906(3);
            this.f18593 = 0;
            return;
        }
        throw m14905("BEGIN_OBJECT");
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public void m14910() throws IOException {
        int iM14912 = this.f18593;
        if (iM14912 == 0) {
            iM14912 = m14912();
        }
        if (iM14912 == 2) {
            int i = this.f18587;
            int i2 = i - 1;
            this.f18587 = i2;
            this.f18584[i2] = null;
            int[] iArr = this.f18582;
            int i3 = i - 2;
            iArr[i3] = iArr[i3] + 1;
            this.f18593 = 0;
            return;
        }
        throw m14905("END_OBJECT");
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean m14924() throws IOException {
        int iM14912 = this.f18593;
        if (iM14912 == 0) {
            iM14912 = m14912();
        }
        return (iM14912 == 2 || iM14912 == 4 || iM14912 == 17) ? false : true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public EnumC22313 m14916() throws IOException {
        int iM14912 = this.f18593;
        if (iM14912 == 0) {
            iM14912 = m14912();
        }
        switch (iM14912) {
            case 1:
                return EnumC22313.BEGIN_OBJECT;
            case 2:
                return EnumC22313.END_OBJECT;
            case 3:
                return EnumC22313.BEGIN_ARRAY;
            case 4:
                return EnumC22313.END_ARRAY;
            case 5:
            case 6:
                return EnumC22313.BOOLEAN;
            case 7:
                return EnumC22313.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return EnumC22313.STRING;
            case 12:
            case 13:
            case 14:
                return EnumC22313.NAME;
            case 15:
            case 16:
                return EnumC22313.NUMBER;
            case 17:
                return EnumC22313.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0184 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:117:0x0185  */
    /* JADX WARN: Code duplicated, block: B:120:0x0195  */
    /* JADX WARN: Code duplicated, block: B:123:0x019a  */
    /* JADX WARN: Code duplicated, block: B:126:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:127:0x01aa A[PHI: r1 r2
      0x01aa: PHI (r1v64 int) = (r1v63 int), (r1v88 int) binds: [B:119:0x0193, B:126:0x01a6] A[DONT_GENERATE, DONT_INLINE]
      0x01aa: PHI (r2v33 int) = (r2v32 int), (r2v34 int) binds: [B:119:0x0193, B:126:0x01a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:129:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:131:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:173:0x0222  */
    /* JADX WARN: Code duplicated, block: B:174:0x0224  */
    /* JADX WARN: Code duplicated, block: B:185:0x0244 A[DONT_INVERT, PHI: r1
      0x0244: PHI (r1v75 char) = (r1v74 char), (r1v79 char) binds: [B:172:0x0220, B:184:0x0243] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:186:0x0246  */
    /* JADX WARN: Code duplicated, block: B:198:0x0262  */
    /* JADX WARN: Code duplicated, block: B:200:0x0265  */
    /* JADX WARN: Code duplicated, block: B:203:0x026a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:208:0x0275 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:209:0x0276  */
    /* JADX WARN: Code duplicated, block: B:211:0x0280  */
    /* JADX WARN: Code duplicated, block: B:213:0x0288  */
    /* JADX WARN: Code duplicated, block: B:274:0x0272 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:275:0x0272 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:276:0x01a2 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m14912() throws IOException {
        int iM14904;
        String str;
        String str2;
        int i;
        char c;
        int i2;
        int i3;
        char c2;
        int i4;
        boolean z;
        char c3;
        int i5;
        int i6;
        char c4;
        int[] iArr = this.f18581;
        int i7 = this.f18587 - 1;
        int i8 = iArr[i7];
        char[] cArr = this.f18589;
        if (i8 == 1) {
            iArr[i7] = 2;
        } else if (i8 == 2) {
            int iM14905 = m14904(true);
            if (iM14905 != 44) {
                if (iM14905 != 59) {
                    if (iM14905 == 93) {
                        this.f18593 = 4;
                        return 4;
                    }
                    m14899("Unterminated array");
                    throw null;
                }
                m14902();
            }
        } else {
            if (i8 == 3 || i8 == 5) {
                iArr[i7] = 4;
                if (i8 == 5 && (iM14904 = m14904(true)) != 44) {
                    if (iM14904 != 59) {
                        if (iM14904 == 125) {
                            this.f18593 = 2;
                            return 2;
                        }
                        m14899("Unterminated object");
                        throw null;
                    }
                    m14902();
                }
                int iM14906 = m14904(true);
                if (iM14906 == 34) {
                    this.f18593 = 13;
                    return 13;
                }
                if (iM14906 == 39) {
                    m14902();
                    this.f18593 = 12;
                    return 12;
                }
                if (iM14906 == 125) {
                    if (i8 != 5) {
                        this.f18593 = 2;
                        return 2;
                    }
                    m14899("Expected name");
                    throw null;
                }
                m14902();
                this.f18580--;
                if (m14907((char) iM14906)) {
                    this.f18593 = 14;
                    return 14;
                }
                m14899("Expected name");
                throw null;
            }
            if (i8 == 4) {
                iArr[i7] = 5;
                int iM14907 = m14904(true);
                if (iM14907 != 58) {
                    if (iM14907 == 61) {
                        m14902();
                        if (this.f18580 < this.f18578 || m14900(1)) {
                            int i9 = this.f18580;
                            if (cArr[i9] == '>') {
                                this.f18580 = i9 + 1;
                            }
                        }
                    } else {
                        m14899("Expected ':'");
                        throw null;
                    }
                }
            } else if (i8 == 6) {
                if (this.f18585 == EnumC14948.LENIENT) {
                    m14904(true);
                    int i10 = this.f18580;
                    this.f18580 = i10 - 1;
                    if (i10 + 4 <= this.f18578 || m14900(5)) {
                        int i11 = this.f18580;
                        if (cArr[i11] == ')' && cArr[i11 + 1] == ']' && cArr[i11 + 2] == '}' && cArr[i11 + 3] == '\'' && cArr[i11 + 4] == '\n') {
                            this.f18580 = i11 + 5;
                        }
                    }
                }
                this.f18581[this.f18587 - 1] = 7;
            } else if (i8 == 7) {
                if (m14904(false) == -1) {
                    this.f18593 = 17;
                    return 17;
                }
                m14902();
                this.f18580--;
            } else if (i8 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iM14908 = m14904(true);
        if (iM14908 == 34) {
            this.f18593 = 9;
            return 9;
        }
        if (iM14908 == 39) {
            m14902();
            this.f18593 = 8;
            return 8;
        }
        if (iM14908 != 44 && iM14908 != 59) {
            if (iM14908 == 91) {
                this.f18593 = 3;
                return 3;
            }
            if (iM14908 != 93) {
                if (iM14908 == 123) {
                    this.f18593 = 1;
                    return 1;
                }
                int i12 = this.f18580 - 1;
                this.f18580 = i12;
                char c5 = cArr[i12];
                if (c5 == 't' || c5 == 'T') {
                    str = "true";
                    str2 = "TRUE";
                    i = 5;
                } else {
                    if (c5 != 'f' && c5 != 'F') {
                        if (c5 != 'n' && c5 != 'N') {
                            i = 0;
                            break;
                        }
                        str = "null";
                        str2 = "NULL";
                        i = 7;
                        if (i != 0) {
                            return i;
                        }
                        i2 = this.f18580;
                        i3 = this.f18578;
                        long j = 0;
                        c2 = 0;
                        i4 = 0;
                        z = true;
                        boolean z2 = false;
                        while (true) {
                            if (i2 + i4 != i3) {
                                if (i4 != cArr.length) {
                                    if (!m14900(i4 + 1)) {
                                        i2 = this.f18580;
                                        i3 = this.f18578;
                                        c3 = cArr[i2 + i4];
                                        if (c3 != '+') {
                                            if (c3 != 'E') {
                                                if (c2 != 2) {
                                                }
                                                c2 = 5;
                                                i4++;
                                            } else {
                                                if (c2 != 2) {
                                                }
                                                c2 = 5;
                                                i4++;
                                            }
                                            if (i6 != 0) {
                                                return i6;
                                            }
                                            if (m14907(cArr[this.f18580])) {
                                                m14899("Expected value");
                                                throw null;
                                            }
                                            m14902();
                                            this.f18593 = 10;
                                            return 10;
                                        }
                                        if (c2 != 5) {
                                        }
                                        c2 = 6;
                                        i4++;
                                    }
                                    c4 = 2;
                                    if (c2 != 2) {
                                        if (c2 != c4) {
                                        }
                                        this.f18579 = i4;
                                        i6 = 16;
                                        this.f18593 = 16;
                                    } else {
                                        if (!z) {
                                        }
                                        c4 = 2;
                                        if (c2 != c4) {
                                        }
                                        this.f18579 = i4;
                                        i6 = 16;
                                        this.f18593 = 16;
                                    }
                                    if (i6 != 0) {
                                        return i6;
                                    }
                                    if (m14907(cArr[this.f18580])) {
                                        m14899("Expected value");
                                        throw null;
                                    }
                                    m14902();
                                    this.f18593 = 10;
                                    return 10;
                                }
                            } else {
                                c3 = cArr[i2 + i4];
                                if (c3 != '+') {
                                    if (c3 != 'E' || c3 == 'e') {
                                        if (c2 != 2 || c2 == 4) {
                                            c2 = 5;
                                            i4++;
                                        }
                                    } else if (c3 == '-') {
                                        if (c2 == 0) {
                                            c2 = 1;
                                            z2 = true;
                                        } else {
                                            if (c2 != 5) {
                                            }
                                            c2 = 6;
                                        }
                                        i4++;
                                    } else if (c3 != '.') {
                                        if (c3 >= '0' && c3 <= '9') {
                                            if (c2 == 1 || c2 == 0) {
                                                i5 = i4;
                                                j = -(c3 - '0');
                                                c2 = 2;
                                            } else {
                                                if (c2 != 2) {
                                                    i5 = i4;
                                                    if (c2 == 3) {
                                                        c2 = 4;
                                                    } else if (c2 == 5 || c2 == 6) {
                                                        c2 = 7;
                                                    }
                                                } else if (j != 0) {
                                                    i5 = i4;
                                                    long j2 = (10 * j) - ((long) (c3 - '0'));
                                                    z = (j > -922337203685477580L || (j == -922337203685477580L && j2 < j)) & z;
                                                    j = j2;
                                                }
                                                i4 = i5;
                                                i4++;
                                            }
                                            i4 = i5;
                                            i4++;
                                        } else if (!m14907(c3)) {
                                            c4 = 2;
                                            if (c2 != 2) {
                                                if (c2 != c4 || c2 == 4 || c2 == 7) {
                                                    this.f18579 = i4;
                                                    i6 = 16;
                                                    this.f18593 = 16;
                                                }
                                            } else if (!z && ((j != Long.MIN_VALUE || z2) && (j != 0 || !z2))) {
                                                if (!z2) {
                                                    j = -j;
                                                }
                                                this.f18588 = j;
                                                this.f18580 += i4;
                                                i6 = 15;
                                                this.f18593 = 15;
                                            } else {
                                                c4 = 2;
                                                if (c2 != c4) {
                                                }
                                                this.f18579 = i4;
                                                i6 = 16;
                                                this.f18593 = 16;
                                            }
                                        }
                                    } else if (c2 == 2) {
                                        c2 = 3;
                                        i4++;
                                    }
                                    if (i6 != 0) {
                                        return i6;
                                    }
                                    if (m14907(cArr[this.f18580])) {
                                        m14899("Expected value");
                                        throw null;
                                    }
                                    m14902();
                                    this.f18593 = 10;
                                    return 10;
                                }
                                if (c2 != 5) {
                                }
                                c2 = 6;
                                i4++;
                            }
                            i6 = 0;
                            if (i6 != 0) {
                                return i6;
                            }
                            if (m14907(cArr[this.f18580])) {
                                m14899("Expected value");
                                throw null;
                            }
                            m14902();
                            this.f18593 = 10;
                            return 10;
                        }
                    }
                    str = "false";
                    str2 = "FALSE";
                    i = 6;
                }
                boolean z3 = this.f18585 != EnumC14948.STRICT;
                int length = str.length();
                int i13 = 0;
                while (true) {
                    if (i13 < length) {
                        if ((this.f18580 + i13 < this.f18578 || m14900(i13 + 1)) && ((c = cArr[this.f18580 + i13]) == str.charAt(i13) || (z3 && c == str2.charAt(i13)))) {
                            i13++;
                        }
                    } else {
                        if ((this.f18580 + length >= this.f18578 && !m14900(length + 1)) || !m14907(cArr[this.f18580 + length])) {
                            this.f18580 += length;
                            this.f18593 = i;
                            break;
                        }
                        break;
                    }
                    i = 0;
                    break;
                }
                if (i != 0) {
                    return i;
                }
                i2 = this.f18580;
                i3 = this.f18578;
                long j3 = 0;
                c2 = 0;
                i4 = 0;
                z = true;
                boolean z4 = false;
                while (true) {
                    if (i2 + i4 != i3) {
                        if (i4 != cArr.length) {
                            if (!m14900(i4 + 1)) {
                                i2 = this.f18580;
                                i3 = this.f18578;
                                c3 = cArr[i2 + i4];
                                if (c3 != '+') {
                                    if (c3 != 'E') {
                                        if (c2 != 2) {
                                        }
                                        c2 = 5;
                                        i4++;
                                    } else {
                                        if (c2 != 2) {
                                        }
                                        c2 = 5;
                                        i4++;
                                    }
                                    if (i6 != 0) {
                                        return i6;
                                    }
                                    if (m14907(cArr[this.f18580])) {
                                        m14899("Expected value");
                                        throw null;
                                    }
                                    m14902();
                                    this.f18593 = 10;
                                    return 10;
                                }
                                if (c2 != 5) {
                                }
                                c2 = 6;
                                i4++;
                            }
                            c4 = 2;
                            if (c2 != 2) {
                                if (c2 != c4) {
                                }
                                this.f18579 = i4;
                                i6 = 16;
                                this.f18593 = 16;
                            } else {
                                if (!z) {
                                }
                                c4 = 2;
                                if (c2 != c4) {
                                }
                                this.f18579 = i4;
                                i6 = 16;
                                this.f18593 = 16;
                            }
                            if (i6 != 0) {
                                return i6;
                            }
                            if (m14907(cArr[this.f18580])) {
                                m14899("Expected value");
                                throw null;
                            }
                            m14902();
                            this.f18593 = 10;
                            return 10;
                        }
                    } else {
                        c3 = cArr[i2 + i4];
                        if (c3 != '+') {
                            if (c3 != 'E') {
                                if (c2 != 2) {
                                }
                                c2 = 5;
                                i4++;
                            } else {
                                if (c2 != 2) {
                                }
                                c2 = 5;
                                i4++;
                            }
                            if (i6 != 0) {
                                return i6;
                            }
                            if (m14907(cArr[this.f18580])) {
                                m14899("Expected value");
                                throw null;
                            }
                            m14902();
                            this.f18593 = 10;
                            return 10;
                        }
                        if (c2 != 5) {
                        }
                        c2 = 6;
                        i4++;
                    }
                    i6 = 0;
                    if (i6 != 0) {
                        return i6;
                    }
                    if (m14907(cArr[this.f18580])) {
                        m14899("Expected value");
                        throw null;
                    }
                    m14902();
                    this.f18593 = 10;
                    return 10;
                }
            }
            if (i8 == 1) {
                this.f18593 = 4;
                return 4;
            }
        }
        if (i8 == 1 || i8 == 2) {
            m14902();
            this.f18580--;
            this.f18593 = 7;
            return 7;
        }
        m14899("Unexpected value");
        throw null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m14907(char c) throws C13141 {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m14902();
        return false;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String m14921() throws IOException {
        String strM14903;
        int iM14912 = this.f18593;
        if (iM14912 == 0) {
            iM14912 = m14912();
        }
        if (iM14912 == 14) {
            strM14903 = m14896();
        } else if (iM14912 == 12) {
            strM14903 = m14903('\'');
        } else if (iM14912 == 13) {
            strM14903 = m14903('\"');
        } else {
            throw m14905("a name");
        }
        this.f18593 = 0;
        this.f18584[this.f18587 - 1] = strM14903;
        return strM14903;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String m14922() throws IOException {
        String str;
        int iM14912 = this.f18593;
        if (iM14912 == 0) {
            iM14912 = m14912();
        }
        if (iM14912 == 10) {
            str = m14896();
        } else if (iM14912 == 8) {
            str = m14903('\'');
        } else if (iM14912 == 9) {
            str = m14903('\"');
        } else if (iM14912 == 11) {
            str = this.f18583;
            this.f18583 = null;
        } else if (iM14912 == 15) {
            str = Long.toString(this.f18588);
        } else if (iM14912 == 16) {
            str = new String(this.f18589, this.f18580, this.f18579);
            this.f18580 += this.f18579;
        } else {
            throw m14905("a string");
        }
        this.f18593 = 0;
        int[] iArr = this.f18582;
        int i = this.f18587 - 1;
        iArr[i] = iArr[i] + 1;
        return str;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean m14927() throws IOException {
        int iM14912 = this.f18593;
        if (iM14912 == 0) {
            iM14912 = m14912();
        }
        if (iM14912 == 5) {
            this.f18593 = 0;
            int[] iArr = this.f18582;
            int i = this.f18587 - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iM14912 == 6) {
            this.f18593 = 0;
            int[] iArr2 = this.f18582;
            int i2 = this.f18587 - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return false;
        }
        throw m14905("a boolean");
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public void m14918() throws IOException {
        int iM14912 = this.f18593;
        if (iM14912 == 0) {
            iM14912 = m14912();
        }
        if (iM14912 == 7) {
            this.f18593 = 0;
            int[] iArr = this.f18582;
            int i = this.f18587 - 1;
            iArr[i] = iArr[i] + 1;
            return;
        }
        throw m14905("null");
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public double m14920() throws IOException {
        int iM14912 = this.f18593;
        if (iM14912 == 0) {
            iM14912 = m14912();
        }
        if (iM14912 == 15) {
            this.f18593 = 0;
            int[] iArr = this.f18582;
            int i = this.f18587 - 1;
            iArr[i] = iArr[i] + 1;
            return this.f18588;
        }
        if (iM14912 == 16) {
            this.f18583 = new String(this.f18589, this.f18580, this.f18579);
            this.f18580 += this.f18579;
        } else if (iM14912 == 8 || iM14912 == 9) {
            this.f18583 = m14903(iM14912 == 8 ? '\'' : '\"');
        } else if (iM14912 == 10) {
            this.f18583 = m14896();
        } else if (iM14912 != 11) {
            throw m14905("a double");
        }
        this.f18593 = 11;
        double d = Double.parseDouble(this.f18583);
        if (this.f18585 != EnumC14948.LENIENT && (Double.isNaN(d) || Double.isInfinite(d))) {
            m14899("JSON forbids NaN and infinities: " + d);
            throw null;
        }
        this.f18583 = null;
        this.f18593 = 0;
        int[] iArr2 = this.f18582;
        int i2 = this.f18587 - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return d;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long m14909() throws IOException {
        int iM14912 = this.f18593;
        if (iM14912 == 0) {
            iM14912 = m14912();
        }
        if (iM14912 == 15) {
            this.f18593 = 0;
            int[] iArr = this.f18582;
            int i = this.f18587 - 1;
            iArr[i] = iArr[i] + 1;
            return this.f18588;
        }
        if (iM14912 == 16) {
            this.f18583 = new String(this.f18589, this.f18580, this.f18579);
            this.f18580 += this.f18579;
        } else if (iM14912 == 8 || iM14912 == 9 || iM14912 == 10) {
            if (iM14912 == 10) {
                this.f18583 = m14896();
            } else {
                this.f18583 = m14903(iM14912 == 8 ? '\'' : '\"');
            }
            try {
                long j = Long.parseLong(this.f18583);
                this.f18593 = 0;
                int[] iArr2 = this.f18582;
                int i2 = this.f18587 - 1;
                iArr2[i2] = iArr2[i2] + 1;
                return j;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw m14905("a long");
        }
        this.f18593 = 11;
        double d = Double.parseDouble(this.f18583);
        long j2 = (long) d;
        if (j2 != d) {
            throw new NumberFormatException("Expected a long but was " + this.f18583 + m14925());
        }
        this.f18583 = null;
        this.f18593 = 0;
        int[] iArr3 = this.f18582;
        int i3 = this.f18587 - 1;
        iArr3[i3] = iArr3[i3] + 1;
        return j2;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private String m14903(char c) throws C13141 {
        int i;
        char[] cArr;
        StringBuilder sb = null;
        do {
            int i2 = this.f18580;
            int i3 = this.f18578;
            while (true) {
                i = i2;
                while (true) {
                    cArr = this.f18589;
                    if (i < i3) {
                        int i4 = i + 1;
                        char c2 = cArr[i];
                        if (this.f18585 == EnumC14948.STRICT && c2 < ' ') {
                            m14899("Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode");
                            throw null;
                        }
                        if (c2 == c) {
                            this.f18580 = i4;
                            int i5 = (i4 - i2) - 1;
                            if (sb == null) {
                                return new String(cArr, i2, i5);
                            }
                            sb.append(cArr, i2, i5);
                            return sb.toString();
                        }
                        if (c2 == '\\') {
                            this.f18580 = i4;
                            int i6 = i4 - i2;
                            int i7 = i6 - 1;
                            if (sb == null) {
                                sb = new StringBuilder(Math.max(i6 * 2, 16));
                            }
                            sb.append(cArr, i2, i7);
                            sb.append(m14908());
                            i2 = this.f18580;
                            i3 = this.f18578;
                        } else {
                            if (c2 == '\n') {
                                this.f18590++;
                                this.f18586 = i4;
                            }
                            i = i4;
                        }
                    }
                }
            }
            if (sb == null) {
                sb = new StringBuilder(Math.max((i - i2) * 2, 16));
            }
            sb.append(cArr, i2, i - i2);
            this.f18580 = i;
        } while (m14900(1));
        m14899("Unterminated string");
        throw null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    private String m14896() throws C13141 {
        String string;
        StringBuilder sb = null;
        int i = 0;
        while (true) {
            int i2 = 0;
            while (true) {
                int i3 = this.f18580;
                int i4 = i3 + i2;
                int i5 = this.f18578;
                char[] cArr = this.f18589;
                if (i4 < i5) {
                    char c = cArr[i3 + i2];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                                                    break;
                                                default:
                                                    i2++;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        m14902();
                    }
                    i = i2;
                } else if (i2 < cArr.length) {
                    if (!m14900(i2 + 1)) {
                        i = i2;
                    }
                } else {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max(i2, 16));
                    }
                    sb.append(cArr, this.f18580, i2);
                    this.f18580 += i2;
                    if (!m14900(1)) {
                    }
                }
                if (sb == null) {
                    string = new String(cArr, this.f18580, i);
                } else {
                    sb.append(cArr, this.f18580, i);
                    string = sb.toString();
                }
                this.f18580 += i;
                return string;
            }
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m14894(char c) throws C13141 {
        do {
            int i = this.f18580;
            int i2 = this.f18578;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = this.f18589[i];
                if (c2 == c) {
                    this.f18580 = i3;
                    return;
                }
                if (c2 == '\\') {
                    this.f18580 = i3;
                    m14908();
                    i = this.f18580;
                    i2 = this.f18578;
                } else {
                    if (c2 == '\n') {
                        this.f18590++;
                        this.f18586 = i3;
                    }
                    i = i3;
                }
            }
            this.f18580 = i;
        } while (m14900(1));
        m14899("Unterminated string");
        throw null;
    }

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    private void m14901() throws C13141 {
        do {
            int i = 0;
            while (true) {
                int i2 = this.f18580;
                if (i2 + i < this.f18578) {
                    char c = this.f18589[i2 + i];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                                                    break;
                                                default:
                                                    i++;
                                                    break;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                        m14902();
                    }
                    this.f18580 += i;
                    return;
                }
                this.f18580 = i2 + i;
            }
        } while (m14900(1));
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int m14926() throws IOException {
        int iM14912 = this.f18593;
        if (iM14912 == 0) {
            iM14912 = m14912();
        }
        if (iM14912 == 15) {
            long j = this.f18588;
            int i = (int) j;
            if (j != i) {
                throw new NumberFormatException("Expected an int but was " + this.f18588 + m14925());
            }
            this.f18593 = 0;
            int[] iArr = this.f18582;
            int i2 = this.f18587 - 1;
            iArr[i2] = iArr[i2] + 1;
            return i;
        }
        if (iM14912 == 16) {
            this.f18583 = new String(this.f18589, this.f18580, this.f18579);
            this.f18580 += this.f18579;
        } else if (iM14912 == 8 || iM14912 == 9 || iM14912 == 10) {
            if (iM14912 == 10) {
                this.f18583 = m14896();
            } else {
                this.f18583 = m14903(iM14912 == 8 ? '\'' : '\"');
            }
            try {
                int i3 = Integer.parseInt(this.f18583);
                this.f18593 = 0;
                int[] iArr2 = this.f18582;
                int i4 = this.f18587 - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw m14905("an int");
        }
        this.f18593 = 11;
        double d = Double.parseDouble(this.f18583);
        int i5 = (int) d;
        if (i5 != d) {
            throw new NumberFormatException("Expected an int but was " + this.f18583 + m14925());
        }
        this.f18583 = null;
        this.f18593 = 0;
        int[] iArr3 = this.f18582;
        int i6 = this.f18587 - 1;
        iArr3[i6] = iArr3[i6] + 1;
        return i5;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f18593 = 0;
        this.f18581[0] = 8;
        this.f18587 = 1;
        this.f18592.close();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m14911() throws IOException {
        int i = 0;
        do {
            int iM14912 = this.f18593;
            if (iM14912 == 0) {
                iM14912 = m14912();
            }
            switch (iM14912) {
                case 1:
                    m14906(3);
                    i++;
                    this.f18593 = 0;
                    break;
                case 2:
                    if (i == 0) {
                        this.f18584[this.f18587 - 1] = null;
                    }
                    this.f18587--;
                    i--;
                    this.f18593 = 0;
                    break;
                case 3:
                    m14906(1);
                    i++;
                    this.f18593 = 0;
                    break;
                case 4:
                    this.f18587--;
                    i--;
                    this.f18593 = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.f18593 = 0;
                    break;
                case 8:
                    m14894('\'');
                    this.f18593 = 0;
                    break;
                case 9:
                    m14894('\"');
                    this.f18593 = 0;
                    break;
                case 10:
                    m14901();
                    this.f18593 = 0;
                    break;
                case 12:
                    m14894('\'');
                    if (i == 0) {
                        this.f18584[this.f18587 - 1] = "<skipped>";
                    }
                    this.f18593 = 0;
                    break;
                case 13:
                    m14894('\"');
                    if (i == 0) {
                        this.f18584[this.f18587 - 1] = "<skipped>";
                    }
                    this.f18593 = 0;
                    break;
                case 14:
                    m14901();
                    if (i == 0) {
                        this.f18584[this.f18587 - 1] = "<skipped>";
                    }
                    this.f18593 = 0;
                    break;
                case 16:
                    this.f18580 += this.f18579;
                    this.f18593 = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i > 0);
        int[] iArr = this.f18582;
        int i2 = this.f18587 - 1;
        iArr[i2] = iArr[i2] + 1;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m14906(int i) throws C13141 {
        int i2 = this.f18587;
        int i3 = i2 - 1;
        int i4 = this.f18591;
        if (i3 >= i4) {
            StringBuilder sbM40153 = C17214.m40153(i4, "Nesting limit ", " reached");
            sbM40153.append(m14925());
            throw new C13141(sbM40153.toString());
        }
        int[] iArr = this.f18581;
        if (i2 == iArr.length) {
            int i5 = i2 * 2;
            this.f18581 = Arrays.copyOf(iArr, i5);
            this.f18582 = Arrays.copyOf(this.f18582, i5);
            this.f18584 = (String[]) Arrays.copyOf(this.f18584, i5);
        }
        int[] iArr2 = this.f18581;
        int i6 = this.f18587;
        this.f18587 = i6 + 1;
        iArr2[i6] = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m14900(int i) throws IOException {
        int i2;
        int i3;
        int i4 = this.f18586;
        int i5 = this.f18580;
        this.f18586 = i4 - i5;
        int i6 = this.f18578;
        char[] cArr = this.f18589;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.f18578 = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.f18578 = 0;
        }
        this.f18580 = 0;
        do {
            int i8 = this.f18578;
            int i9 = this.f18592.read(cArr, i8, cArr.length - i8);
            if (i9 == -1) {
                return false;
            }
            i2 = this.f18578 + i9;
            this.f18578 = i2;
            if (this.f18590 == 0 && (i3 = this.f18586) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.f18580++;
                this.f18586 = i3 + 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private int m14904(boolean z) throws IOException {
        int i = this.f18580;
        int i2 = this.f18578;
        while (true) {
            if (i == i2) {
                this.f18580 = i;
                if (!m14900(1)) {
                    if (!z) {
                        return -1;
                    }
                    throw new EOFException("End of input" + m14925());
                }
                i = this.f18580;
                i2 = this.f18578;
            }
            int i3 = i + 1;
            char[] cArr = this.f18589;
            char c = cArr[i];
            if (c == '\n') {
                this.f18590++;
                this.f18586 = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.f18580 = i3;
                    if (i3 == i2) {
                        this.f18580 = i;
                        boolean zM14900 = m14900(2);
                        this.f18580++;
                        if (!zM14900) {
                        }
                        return c;
                    }
                    m14902();
                    int i4 = this.f18580;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.f18580 = i4 + 1;
                        while (true) {
                            if (this.f18580 + 2 > this.f18578 && !m14900(2)) {
                                m14899("Unterminated comment");
                                throw null;
                            }
                            int i5 = this.f18580;
                            if (cArr[i5] != '\n') {
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= 2) {
                                        i = this.f18580 + 2;
                                        i2 = this.f18578;
                                        break;
                                    }
                                    if (cArr[this.f18580 + i6] != "*/".charAt(i6)) {
                                        break;
                                    }
                                    i6++;
                                }
                            } else {
                                this.f18590++;
                                this.f18586 = i5 + 1;
                            }
                            this.f18580++;
                        }
                    } else {
                        if (c2 != '/') {
                            return c;
                        }
                        this.f18580 = i4 + 1;
                        m14895();
                        i = this.f18580;
                        i2 = this.f18578;
                    }
                } else if (c == '#') {
                    this.f18580 = i3;
                    m14902();
                    m14895();
                    i = this.f18580;
                    i2 = this.f18578;
                } else {
                    this.f18580 = i3;
                    return c;
                }
            }
            i = i3;
        }
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private void m14902() throws C13141 {
        if (this.f18585 == EnumC14948.LENIENT) {
            return;
        }
        m14899("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    private void m14895() {
        char c;
        do {
            if (this.f18580 >= this.f18578 && !m14900(1)) {
                return;
            }
            int i = this.f18580;
            int i2 = i + 1;
            this.f18580 = i2;
            c = this.f18589[i];
            if (c == '\n') {
                this.f18590++;
                this.f18586 = i2;
                return;
            }
        } while (c != '\r');
    }

    public String toString() {
        return getClass().getSimpleName() + m14925();
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final String m14925() {
        StringBuilder sbM2791 = C0589.m2791(" at line ", this.f18590 + 1, " column ", " path ", (this.f18580 - this.f18586) + 1);
        sbM2791.append(m14919());
        return sbM2791.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private String m14898(boolean z) {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i2 = this.f18587;
            if (i >= i2) {
                return sb.toString();
            }
            int i3 = this.f18581[i];
            switch (i3) {
                case 1:
                case 2:
                    int i4 = this.f18582[i];
                    if (z && i4 > 0 && i == i2 - 1) {
                        i4--;
                    }
                    sb.append('[');
                    sb.append(i4);
                    sb.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb.append('.');
                    String str = this.f18584[i];
                    if (str != null) {
                        sb.append(str);
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    throw new AssertionError(C8479.m22141(i3, "Unknown scope value: "));
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String m14919() {
        return m14898(false);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String m14928() {
        return m14898(true);
    }

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    private char m14908() throws C13141 {
        int i;
        if (this.f18580 == this.f18578 && !m14900(1)) {
            m14899("Unterminated escape sequence");
            throw null;
        }
        int i2 = this.f18580;
        int i3 = i2 + 1;
        this.f18580 = i3;
        char[] cArr = this.f18589;
        char c = cArr[i2];
        if (c != '\n') {
            if (c != '\"') {
                if (c != '\'') {
                    if (c != '/' && c != '\\') {
                        if (c == 'b') {
                            return '\b';
                        }
                        if (c == 'f') {
                            return '\f';
                        }
                        if (c == 'n') {
                            return '\n';
                        }
                        if (c == 'r') {
                            return '\r';
                        }
                        if (c == 't') {
                            return '\t';
                        }
                        if (c == 'u') {
                            if (i2 + 5 > this.f18578 && !m14900(4)) {
                                m14899("Unterminated escape sequence");
                                throw null;
                            }
                            int i4 = this.f18580;
                            int i5 = i4 + 4;
                            int i6 = 0;
                            while (i4 < i5) {
                                char c2 = cArr[i4];
                                int i7 = i6 << 4;
                                if (c2 >= '0' && c2 <= '9') {
                                    i = c2 - '0';
                                } else if (c2 >= 'a' && c2 <= 'f') {
                                    i = c2 - 'W';
                                } else {
                                    if (c2 < 'A' || c2 > 'F') {
                                        m14899("Malformed Unicode escape \\u".concat(new String(cArr, this.f18580, 4)));
                                        throw null;
                                    }
                                    i = c2 - '7';
                                }
                                i6 = i7 + i;
                                i4++;
                            }
                            this.f18580 += 4;
                            return (char) i6;
                        }
                        m14899("Invalid escape sequence");
                        throw null;
                    }
                }
            }
            return c;
        }
        if (this.f18585 == EnumC14948.STRICT) {
            m14899("Cannot escape a newline character in strict mode");
            throw null;
        }
        this.f18590++;
        this.f18586 = i3;
        if (this.f18585 == EnumC14948.STRICT) {
            m14899("Invalid escaped character \"'\" in strict mode");
            throw null;
        }
        return c;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m14899(String str) throws C13141 {
        StringBuilder sbM23356 = C9023.m23356(str);
        sbM23356.append(m14925());
        sbM23356.append("\nSee ");
        sbM23356.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("malformed-json"));
        throw new C13141(sbM23356.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public IllegalStateException m14905(String str) {
        String str2 = m14916() == EnumC22313.NULL ? "adapter-not-null-safe" : "unexpected-json-structure";
        StringBuilder sbM30914 = C12441.m30914("Expected ", str, " but was ");
        sbM30914.append(m14916());
        sbM30914.append(m14925());
        sbM30914.append("\nSee ");
        sbM30914.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str2));
        return new IllegalStateException(sbM30914.toString());
    }

    static {
        AbstractC1541.f6257 = new C2556();
    }
}
