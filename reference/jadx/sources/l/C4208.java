package l;

import com.google.android.material.color.MaterialColors;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۘܰܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2B08 */
/* JADX INFO: loaded from: classes2.dex */
public class C4208 implements Closeable {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int[] f15363;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f15366;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public long f15368;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public String[] f15369;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public int[] f15371;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f15372;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final StringReader f15374;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public boolean f15378;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public EnumC19805 f15376 = EnumC19805.LEGACY_STRICT;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f15370 = 255;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final char[] f15373 = new char[1024];

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public int f15365 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f15362 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f15377 = 0;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f15367 = 0;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f15375 = 0;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f15364 = 0;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public int f15379 = 1;

    public C4208(StringReader stringReader) {
        int[] iArr = new int[32];
        this.f15371 = iArr;
        iArr[0] = 6;
        this.f15369 = new String[32];
        this.f15363 = new int[32];
        this.f15374 = stringReader;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean m13439() {
        return this.f15376 == EnumC19805.LENIENT;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13442(EnumC19805 enumC19805) {
        C17359.requireNonNull(enumC19805);
        this.f15376 = enumC19805;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final EnumC19805 m13450() {
        return this.f15376;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m13441() throws IOException {
        int iM13446 = this.f15364;
        if (iM13446 == 0) {
            iM13446 = m13446();
        }
        if (iM13446 == 3) {
            m13430(1);
            this.f15363[this.f15379 - 1] = 0;
            this.f15364 = 0;
            return;
        }
        throw m13434("BEGIN_ARRAY");
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public void m13449() throws IOException {
        int iM13446 = this.f15364;
        if (iM13446 == 0) {
            iM13446 = m13446();
        }
        if (iM13446 == 4) {
            int i = this.f15379;
            this.f15379 = i - 1;
            int[] iArr = this.f15363;
            int i2 = i - 2;
            iArr[i2] = iArr[i2] + 1;
            this.f15364 = 0;
            return;
        }
        throw m13434("END_ARRAY");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void m13456() throws IOException {
        int iM13446 = this.f15364;
        if (iM13446 == 0) {
            iM13446 = m13446();
        }
        if (iM13446 == 1) {
            m13430(3);
            this.f15364 = 0;
            return;
        }
        throw m13434("BEGIN_OBJECT");
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public void m13447() throws IOException {
        int iM13446 = this.f15364;
        if (iM13446 == 0) {
            iM13446 = m13446();
        }
        if (iM13446 == 2) {
            int i = this.f15379;
            int i2 = i - 1;
            this.f15379 = i2;
            this.f15369[i2] = null;
            int[] iArr = this.f15363;
            int i3 = i - 2;
            iArr[i3] = iArr[i3] + 1;
            this.f15364 = 0;
            return;
        }
        throw m13434("END_OBJECT");
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean m13457() throws IOException {
        int iM13446 = this.f15364;
        if (iM13446 == 0) {
            iM13446 = m13446();
        }
        return (iM13446 == 2 || iM13446 == 4 || iM13446 == 17) ? false : true;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public EnumC14648 m13438() throws IOException {
        int iM13446 = this.f15364;
        if (iM13446 == 0) {
            iM13446 = m13446();
        }
        switch (iM13446) {
            case 1:
                return EnumC14648.BEGIN_OBJECT;
            case 2:
                return EnumC14648.END_OBJECT;
            case 3:
                return EnumC14648.BEGIN_ARRAY;
            case 4:
                return EnumC14648.END_ARRAY;
            case 5:
            case 6:
                return EnumC14648.BOOLEAN;
            case 7:
                return EnumC14648.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return EnumC14648.STRING;
            case 12:
            case 13:
            case 14:
                return EnumC14648.NAME;
            case 15:
            case 16:
                return EnumC14648.NUMBER;
            case 17:
                return EnumC14648.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0170  */
    /* JADX WARN: Code duplicated, block: B:112:0x0176  */
    /* JADX WARN: Code duplicated, block: B:115:0x0181  */
    /* JADX WARN: Code duplicated, block: B:116:0x0183  */
    /* JADX WARN: Code duplicated, block: B:119:0x018b  */
    /* JADX WARN: Code duplicated, block: B:121:0x0192  */
    /* JADX WARN: Code duplicated, block: B:124:0x019b  */
    /* JADX WARN: Code duplicated, block: B:132:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:134:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:139:0x01d6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:140:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:143:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:146:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:149:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:150:0x01fb A[PHI: r1 r2
      0x01fb: PHI (r1v55 int) = (r1v54 int), (r1v79 int) binds: [B:142:0x01e5, B:149:0x01f7] A[DONT_GENERATE, DONT_INLINE]
      0x01fb: PHI (r2v34 int) = (r2v33 int), (r2v35 int) binds: [B:142:0x01e5, B:149:0x01f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:152:0x0203  */
    /* JADX WARN: Code duplicated, block: B:154:0x0207  */
    /* JADX WARN: Code duplicated, block: B:194:0x026c  */
    /* JADX WARN: Code duplicated, block: B:195:0x026e  */
    /* JADX WARN: Code duplicated, block: B:206:0x028d A[DONT_INVERT, PHI: r1
      0x028d: PHI (r1v66 char) = (r1v65 char), (r1v70 char) binds: [B:193:0x026a, B:205:0x028c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:207:0x028f  */
    /* JADX WARN: Code duplicated, block: B:219:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:221:0x02af  */
    /* JADX WARN: Code duplicated, block: B:224:0x02b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:229:0x02c2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:230:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:232:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:234:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:257:0x02bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:258:0x01f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:265:0x02bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:276:0x01b1 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m13446() throws IOException {
        int iM13429;
        int i;
        String str;
        String str2;
        int i2;
        boolean z;
        int length;
        int i3;
        char c;
        int i4;
        int i5;
        char c2;
        int i6;
        boolean z2;
        char c3;
        int i7;
        char c4;
        int[] iArr = this.f15371;
        boolean z3 = true;
        int i8 = this.f15379 - 1;
        int i9 = iArr[i8];
        char[] cArr = this.f15373;
        switch (i9) {
            case 1:
                iArr[i8] = 2;
                break;
            case 2:
                int iM134210 = m13429(true);
                if (iM134210 != 44) {
                    if (iM134210 == 59) {
                        m13424();
                    } else {
                        if (iM134210 == 93) {
                            this.f15364 = 4;
                            return 4;
                        }
                        m13431("Unterminated array");
                        throw null;
                    }
                }
                break;
            case 3:
            case 5:
                iArr[i8] = 4;
                if (i9 == 5 && (iM13429 = m13429(true)) != 44) {
                    if (iM13429 != 59) {
                        if (iM13429 == 125) {
                            this.f15364 = 2;
                            return 2;
                        }
                        m13431("Unterminated object");
                        throw null;
                    }
                    m13424();
                }
                int iM134211 = m13429(true);
                if (iM134211 == 34) {
                    this.f15364 = 13;
                    return 13;
                }
                if (iM134211 == 39) {
                    m13424();
                    this.f15364 = 12;
                    return 12;
                }
                if (iM134211 == 125) {
                    if (i9 != 5) {
                        this.f15364 = 2;
                        return 2;
                    }
                    m13431("Expected name");
                    throw null;
                }
                m13424();
                this.f15365--;
                if (m13422((char) iM134211)) {
                    this.f15364 = 14;
                    return 14;
                }
                m13431("Expected name");
                throw null;
            case 4:
                iArr[i8] = 5;
                int iM134212 = m13429(true);
                if (iM134212 != 58) {
                    if (iM134212 == 61) {
                        m13424();
                        if (this.f15365 < this.f15362 || m13423(1)) {
                            int i10 = this.f15365;
                            if (cArr[i10] == '>') {
                                this.f15365 = i10 + 1;
                            }
                        }
                    } else {
                        m13431("Expected ':'");
                        throw null;
                    }
                }
                break;
            case 6:
                if (this.f15376 == EnumC19805.LENIENT) {
                    m13429(true);
                    int i11 = this.f15365;
                    this.f15365 = i11 - 1;
                    if (i11 + 4 <= this.f15362 || m13423(5)) {
                        int i12 = this.f15365;
                        if (cArr[i12] == ')' && cArr[i12 + 1] == ']' && cArr[i12 + 2] == '}' && cArr[i12 + 3] == '\'' && cArr[i12 + 4] == '\n') {
                            this.f15365 = i12 + 5;
                        }
                    }
                }
                this.f15371[this.f15379 - 1] = 7;
                break;
            case 7:
                if (m13429(false) == -1) {
                    this.f15364 = 17;
                    return 17;
                }
                m13424();
                this.f15365--;
                break;
                break;
            case 8:
                throw new IllegalStateException("JsonReader is closed");
            default:
                throw new AssertionError(i9);
        }
        int iM134213 = m13429(true);
        if (iM134213 == 34) {
            this.f15364 = 9;
            return 9;
        }
        if (iM134213 == 39) {
            m13424();
            this.f15364 = 8;
            return 8;
        }
        if (iM134213 == 44 || iM134213 == 59) {
            i = 1;
        } else {
            if (iM134213 == 91) {
                this.f15364 = 3;
                return 3;
            }
            if (iM134213 != 93) {
                if (iM134213 == 123) {
                    this.f15364 = 1;
                    return 1;
                }
                int i13 = this.f15365 - 1;
                this.f15365 = i13;
                char c5 = cArr[i13];
                if (c5 == 'F') {
                    str = "false";
                    str2 = "FALSE";
                    i2 = 6;
                    if (this.f15376 != EnumC19805.STRICT) {
                        z = true;
                    } else {
                        z = false;
                    }
                    length = str.length();
                    i3 = 0;
                    while (true) {
                        if (i3 < length) {
                            if ((this.f15365 + i3 >= this.f15362 || m13423(i3 + 1)) && ((c = cArr[this.f15365 + i3]) == str.charAt(i3) || (z && c == str2.charAt(i3)))) {
                            }
                        } else if ((this.f15365 + length < this.f15362 && !m13423(length + 1)) || !m13422(cArr[this.f15365 + length])) {
                            this.f15365 += length;
                            this.f15364 = i2;
                        }
                    }
                    if (i2 != 0) {
                        return i2;
                    }
                    i4 = this.f15365;
                    i5 = this.f15362;
                    c2 = 0;
                    long j = 0;
                    i6 = 0;
                    z2 = true;
                    boolean z4 = false;
                    while (true) {
                        if (i4 + i6 == i5) {
                            if (i6 != cArr.length) {
                                if (m13423(i6 + 1)) {
                                    i4 = this.f15365;
                                    i5 = this.f15362;
                                    c3 = cArr[i4 + i6];
                                    if (c3 != '+') {
                                        if (c3 != 'E') {
                                            if (c2 != 2) {
                                            }
                                            c2 = 5;
                                            i6++;
                                            z3 = true;
                                        } else {
                                            if (c2 != 2) {
                                            }
                                            c2 = 5;
                                            i6++;
                                            z3 = true;
                                        }
                                        if (i7 != 0) {
                                            return i7;
                                        }
                                        if (m13422(cArr[this.f15365])) {
                                            m13431("Expected value");
                                            throw null;
                                        }
                                        m13424();
                                        this.f15364 = 10;
                                        return 10;
                                    }
                                    if (c2 != 5) {
                                    }
                                    c2 = 6;
                                    i6++;
                                    z3 = true;
                                }
                                c4 = 2;
                                if (c2 != 2) {
                                    if (c2 != c4) {
                                    }
                                    this.f15366 = i6;
                                    i7 = 16;
                                    this.f15364 = 16;
                                } else {
                                    if (!z2) {
                                    }
                                    c4 = 2;
                                    if (c2 != c4) {
                                    }
                                    this.f15366 = i6;
                                    i7 = 16;
                                    this.f15364 = 16;
                                }
                                if (i7 != 0) {
                                    return i7;
                                }
                                if (m13422(cArr[this.f15365])) {
                                    m13431("Expected value");
                                    throw null;
                                }
                                m13424();
                                this.f15364 = 10;
                                return 10;
                            }
                        } else {
                            c3 = cArr[i4 + i6];
                            if (c3 != '+') {
                                if (c3 != 'E' || c3 == 'e') {
                                    if (c2 != 2 || c2 == 4) {
                                        c2 = 5;
                                        i6++;
                                        z3 = true;
                                    }
                                } else if (c3 == '-') {
                                    if (c2 == 0) {
                                        c2 = 1;
                                        z4 = true;
                                    } else {
                                        if (c2 != 5) {
                                        }
                                        c2 = 6;
                                    }
                                    i6++;
                                    z3 = true;
                                } else if (c3 != '.') {
                                    if (c3 >= '0' && c3 <= '9') {
                                        if (c2 == z3 || c2 == 0) {
                                            j = -(c3 - '0');
                                            c2 = 2;
                                        } else if (c2 == 2) {
                                            if (!z2 || j != 0) {
                                                long j2 = (10 * j) - ((long) (c3 - '0'));
                                                z2 &= j > -922337203685477580L || (j == -922337203685477580L && j2 < j);
                                                j = j2;
                                            }
                                        } else if (c2 == 3) {
                                            c2 = 4;
                                        } else if (c2 == 5 || c2 == 6) {
                                            c2 = 7;
                                        }
                                        i6++;
                                        z3 = true;
                                    } else if (!m13422(c3)) {
                                        c4 = 2;
                                        if (c2 != 2) {
                                            if (c2 != c4 || c2 == 4 || c2 == 7) {
                                                this.f15366 = i6;
                                                i7 = 16;
                                                this.f15364 = 16;
                                            }
                                        } else if (!z2 && ((j != Long.MIN_VALUE || z4) && (j != 0 || !z4))) {
                                            if (!z4) {
                                                j = -j;
                                            }
                                            this.f15368 = j;
                                            this.f15365 += i6;
                                            i7 = 15;
                                            this.f15364 = 15;
                                        } else {
                                            c4 = 2;
                                            if (c2 != c4) {
                                            }
                                            this.f15366 = i6;
                                            i7 = 16;
                                            this.f15364 = 16;
                                        }
                                    }
                                } else if (c2 == 2) {
                                    c2 = 3;
                                    i6++;
                                    z3 = true;
                                }
                                if (i7 != 0) {
                                    return i7;
                                }
                                if (m13422(cArr[this.f15365])) {
                                    m13431("Expected value");
                                    throw null;
                                }
                                m13424();
                                this.f15364 = 10;
                                return 10;
                            }
                            if (c2 != 5) {
                            }
                            c2 = 6;
                            i6++;
                            z3 = true;
                        }
                        i7 = 0;
                        if (i7 != 0) {
                            return i7;
                        }
                        if (m13422(cArr[this.f15365])) {
                            m13431("Expected value");
                            throw null;
                        }
                        m13424();
                        this.f15364 = 10;
                        return 10;
                    }
                }
                if (c5 == 'N') {
                    str = "null";
                    str2 = "NULL";
                    i2 = 7;
                    if (this.f15376 != EnumC19805.STRICT) {
                        z = true;
                    } else {
                        z = false;
                    }
                    length = str.length();
                    i3 = 0;
                    while (true) {
                        if (i3 < length) {
                            i3 = this.f15365 + i3 >= this.f15362 ? i3 + 1 : i3 + 1;
                        } else {
                            if (this.f15365 + length < this.f15362) {
                            }
                            this.f15365 += length;
                            this.f15364 = i2;
                        }
                    }
                    if (i2 != 0) {
                        return i2;
                    }
                    i4 = this.f15365;
                    i5 = this.f15362;
                    c2 = 0;
                    long j3 = 0;
                    i6 = 0;
                    z2 = true;
                    boolean z5 = false;
                    while (true) {
                        if (i4 + i6 == i5) {
                            if (i6 != cArr.length) {
                                if (m13423(i6 + 1)) {
                                    i4 = this.f15365;
                                    i5 = this.f15362;
                                    c3 = cArr[i4 + i6];
                                    if (c3 != '+') {
                                        if (c3 != 'E') {
                                            if (c2 != 2) {
                                            }
                                            c2 = 5;
                                            i6++;
                                            z3 = true;
                                        } else {
                                            if (c2 != 2) {
                                            }
                                            c2 = 5;
                                            i6++;
                                            z3 = true;
                                        }
                                        if (i7 != 0) {
                                            return i7;
                                        }
                                        if (m13422(cArr[this.f15365])) {
                                            m13431("Expected value");
                                            throw null;
                                        }
                                        m13424();
                                        this.f15364 = 10;
                                        return 10;
                                    }
                                    if (c2 != 5) {
                                    }
                                    c2 = 6;
                                    i6++;
                                    z3 = true;
                                }
                                c4 = 2;
                                if (c2 != 2) {
                                    if (c2 != c4) {
                                    }
                                    this.f15366 = i6;
                                    i7 = 16;
                                    this.f15364 = 16;
                                } else {
                                    if (!z2) {
                                    }
                                    c4 = 2;
                                    if (c2 != c4) {
                                    }
                                    this.f15366 = i6;
                                    i7 = 16;
                                    this.f15364 = 16;
                                }
                                if (i7 != 0) {
                                    return i7;
                                }
                                if (m13422(cArr[this.f15365])) {
                                    m13431("Expected value");
                                    throw null;
                                }
                                m13424();
                                this.f15364 = 10;
                                return 10;
                            }
                        } else {
                            c3 = cArr[i4 + i6];
                            if (c3 != '+') {
                                if (c3 != 'E') {
                                    if (c2 != 2) {
                                    }
                                    c2 = 5;
                                    i6++;
                                    z3 = true;
                                } else {
                                    if (c2 != 2) {
                                    }
                                    c2 = 5;
                                    i6++;
                                    z3 = true;
                                }
                                if (i7 != 0) {
                                    return i7;
                                }
                                if (m13422(cArr[this.f15365])) {
                                    m13431("Expected value");
                                    throw null;
                                }
                                m13424();
                                this.f15364 = 10;
                                return 10;
                            }
                            if (c2 != 5) {
                            }
                            c2 = 6;
                            i6++;
                            z3 = true;
                        }
                        i7 = 0;
                        if (i7 != 0) {
                            return i7;
                        }
                        if (m13422(cArr[this.f15365])) {
                            m13431("Expected value");
                            throw null;
                        }
                        m13424();
                        this.f15364 = 10;
                        return 10;
                    }
                }
                if (c5 != 'T') {
                    if (c5 == 'f') {
                        str = "false";
                        str2 = "FALSE";
                        i2 = 6;
                        if (this.f15376 != EnumC19805.STRICT) {
                            z = true;
                        } else {
                            z = false;
                        }
                        length = str.length();
                        i3 = 0;
                        while (true) {
                            if (i3 < length) {
                                if (this.f15365 + i3 >= this.f15362) {
                                }
                            } else {
                                if (this.f15365 + length < this.f15362) {
                                }
                                this.f15365 += length;
                                this.f15364 = i2;
                            }
                        }
                        if (i2 != 0) {
                            return i2;
                        }
                        i4 = this.f15365;
                        i5 = this.f15362;
                        c2 = 0;
                        long j4 = 0;
                        i6 = 0;
                        z2 = true;
                        boolean z6 = false;
                        while (true) {
                            if (i4 + i6 == i5) {
                                if (i6 != cArr.length) {
                                    if (m13423(i6 + 1)) {
                                        i4 = this.f15365;
                                        i5 = this.f15362;
                                        c3 = cArr[i4 + i6];
                                        if (c3 != '+') {
                                            if (c3 != 'E') {
                                                if (c2 != 2) {
                                                }
                                                c2 = 5;
                                                i6++;
                                                z3 = true;
                                            } else {
                                                if (c2 != 2) {
                                                }
                                                c2 = 5;
                                                i6++;
                                                z3 = true;
                                            }
                                            if (i7 != 0) {
                                                return i7;
                                            }
                                            if (m13422(cArr[this.f15365])) {
                                                m13431("Expected value");
                                                throw null;
                                            }
                                            m13424();
                                            this.f15364 = 10;
                                            return 10;
                                        }
                                        if (c2 != 5) {
                                        }
                                        c2 = 6;
                                        i6++;
                                        z3 = true;
                                    }
                                    c4 = 2;
                                    if (c2 != 2) {
                                        if (c2 != c4) {
                                        }
                                        this.f15366 = i6;
                                        i7 = 16;
                                        this.f15364 = 16;
                                    } else {
                                        if (!z2) {
                                        }
                                        c4 = 2;
                                        if (c2 != c4) {
                                        }
                                        this.f15366 = i6;
                                        i7 = 16;
                                        this.f15364 = 16;
                                    }
                                    if (i7 != 0) {
                                        return i7;
                                    }
                                    if (m13422(cArr[this.f15365])) {
                                        m13431("Expected value");
                                        throw null;
                                    }
                                    m13424();
                                    this.f15364 = 10;
                                    return 10;
                                }
                            } else {
                                c3 = cArr[i4 + i6];
                                if (c3 != '+') {
                                    if (c3 != 'E') {
                                        if (c2 != 2) {
                                        }
                                        c2 = 5;
                                        i6++;
                                        z3 = true;
                                    } else {
                                        if (c2 != 2) {
                                        }
                                        c2 = 5;
                                        i6++;
                                        z3 = true;
                                    }
                                    if (i7 != 0) {
                                        return i7;
                                    }
                                    if (m13422(cArr[this.f15365])) {
                                        m13431("Expected value");
                                        throw null;
                                    }
                                    m13424();
                                    this.f15364 = 10;
                                    return 10;
                                }
                                if (c2 != 5) {
                                }
                                c2 = 6;
                                i6++;
                                z3 = true;
                            }
                            i7 = 0;
                            if (i7 != 0) {
                                return i7;
                            }
                            if (m13422(cArr[this.f15365])) {
                                m13431("Expected value");
                                throw null;
                            }
                            m13424();
                            this.f15364 = 10;
                            return 10;
                        }
                    }
                    if (c5 != 'n') {
                        if (c5 != 't') {
                        }
                        if (i2 != 0) {
                            return i2;
                        }
                        i4 = this.f15365;
                        i5 = this.f15362;
                        c2 = 0;
                        long j5 = 0;
                        i6 = 0;
                        z2 = true;
                        boolean z7 = false;
                        while (true) {
                            if (i4 + i6 == i5) {
                                if (i6 != cArr.length) {
                                    if (m13423(i6 + 1)) {
                                        i4 = this.f15365;
                                        i5 = this.f15362;
                                        c3 = cArr[i4 + i6];
                                        if (c3 != '+') {
                                            if (c3 != 'E') {
                                                if (c2 != 2) {
                                                }
                                                c2 = 5;
                                                i6++;
                                                z3 = true;
                                            } else {
                                                if (c2 != 2) {
                                                }
                                                c2 = 5;
                                                i6++;
                                                z3 = true;
                                            }
                                            if (i7 != 0) {
                                                return i7;
                                            }
                                            if (m13422(cArr[this.f15365])) {
                                                m13431("Expected value");
                                                throw null;
                                            }
                                            m13424();
                                            this.f15364 = 10;
                                            return 10;
                                        }
                                        if (c2 != 5) {
                                        }
                                        c2 = 6;
                                        i6++;
                                        z3 = true;
                                    }
                                    c4 = 2;
                                    if (c2 != 2) {
                                        if (c2 != c4) {
                                        }
                                        this.f15366 = i6;
                                        i7 = 16;
                                        this.f15364 = 16;
                                    } else {
                                        if (!z2) {
                                        }
                                        c4 = 2;
                                        if (c2 != c4) {
                                        }
                                        this.f15366 = i6;
                                        i7 = 16;
                                        this.f15364 = 16;
                                    }
                                    if (i7 != 0) {
                                        return i7;
                                    }
                                    if (m13422(cArr[this.f15365])) {
                                        m13431("Expected value");
                                        throw null;
                                    }
                                    m13424();
                                    this.f15364 = 10;
                                    return 10;
                                }
                            } else {
                                c3 = cArr[i4 + i6];
                                if (c3 != '+') {
                                    if (c3 != 'E') {
                                        if (c2 != 2) {
                                        }
                                        c2 = 5;
                                        i6++;
                                        z3 = true;
                                    } else {
                                        if (c2 != 2) {
                                        }
                                        c2 = 5;
                                        i6++;
                                        z3 = true;
                                    }
                                    if (i7 != 0) {
                                        return i7;
                                    }
                                    if (m13422(cArr[this.f15365])) {
                                        m13431("Expected value");
                                        throw null;
                                    }
                                    m13424();
                                    this.f15364 = 10;
                                    return 10;
                                }
                                if (c2 != 5) {
                                }
                                c2 = 6;
                                i6++;
                                z3 = true;
                            }
                            i7 = 0;
                            if (i7 != 0) {
                                return i7;
                            }
                            if (m13422(cArr[this.f15365])) {
                                m13431("Expected value");
                                throw null;
                            }
                            m13424();
                            this.f15364 = 10;
                            return 10;
                        }
                    }
                    str = "null";
                    str2 = "NULL";
                    i2 = 7;
                    if (this.f15376 != EnumC19805.STRICT) {
                        z = true;
                    } else {
                        z = false;
                    }
                    length = str.length();
                    i3 = 0;
                    while (true) {
                        if (i3 < length) {
                            if (this.f15365 + i3 >= this.f15362) {
                            }
                        } else {
                            if (this.f15365 + length < this.f15362) {
                            }
                            this.f15365 += length;
                            this.f15364 = i2;
                        }
                    }
                    if (i2 != 0) {
                        return i2;
                    }
                    i4 = this.f15365;
                    i5 = this.f15362;
                    c2 = 0;
                    long j6 = 0;
                    i6 = 0;
                    z2 = true;
                    boolean z8 = false;
                    while (true) {
                        if (i4 + i6 == i5) {
                            if (i6 != cArr.length) {
                                if (m13423(i6 + 1)) {
                                    i4 = this.f15365;
                                    i5 = this.f15362;
                                    c3 = cArr[i4 + i6];
                                    if (c3 != '+') {
                                        if (c3 != 'E') {
                                            if (c2 != 2) {
                                            }
                                            c2 = 5;
                                            i6++;
                                            z3 = true;
                                        } else {
                                            if (c2 != 2) {
                                            }
                                            c2 = 5;
                                            i6++;
                                            z3 = true;
                                        }
                                        if (i7 != 0) {
                                            return i7;
                                        }
                                        if (m13422(cArr[this.f15365])) {
                                            m13431("Expected value");
                                            throw null;
                                        }
                                        m13424();
                                        this.f15364 = 10;
                                        return 10;
                                    }
                                    if (c2 != 5) {
                                    }
                                    c2 = 6;
                                    i6++;
                                    z3 = true;
                                }
                                c4 = 2;
                                if (c2 != 2) {
                                    if (c2 != c4) {
                                    }
                                    this.f15366 = i6;
                                    i7 = 16;
                                    this.f15364 = 16;
                                } else {
                                    if (!z2) {
                                    }
                                    c4 = 2;
                                    if (c2 != c4) {
                                    }
                                    this.f15366 = i6;
                                    i7 = 16;
                                    this.f15364 = 16;
                                }
                                if (i7 != 0) {
                                    return i7;
                                }
                                if (m13422(cArr[this.f15365])) {
                                    m13431("Expected value");
                                    throw null;
                                }
                                m13424();
                                this.f15364 = 10;
                                return 10;
                            }
                        } else {
                            c3 = cArr[i4 + i6];
                            if (c3 != '+') {
                                if (c3 != 'E') {
                                    if (c2 != 2) {
                                    }
                                    c2 = 5;
                                    i6++;
                                    z3 = true;
                                } else {
                                    if (c2 != 2) {
                                    }
                                    c2 = 5;
                                    i6++;
                                    z3 = true;
                                }
                                if (i7 != 0) {
                                    return i7;
                                }
                                if (m13422(cArr[this.f15365])) {
                                    m13431("Expected value");
                                    throw null;
                                }
                                m13424();
                                this.f15364 = 10;
                                return 10;
                            }
                            if (c2 != 5) {
                            }
                            c2 = 6;
                            i6++;
                            z3 = true;
                        }
                        i7 = 0;
                        if (i7 != 0) {
                            return i7;
                        }
                        if (m13422(cArr[this.f15365])) {
                            m13431("Expected value");
                            throw null;
                        }
                        m13424();
                        this.f15364 = 10;
                        return 10;
                    }
                }
                str = "true";
                str2 = "TRUE";
                i2 = 5;
                if (this.f15376 != EnumC19805.STRICT) {
                    z = true;
                } else {
                    z = false;
                }
                length = str.length();
                i3 = 0;
                while (true) {
                    if (i3 < length) {
                        if (this.f15365 + i3 >= this.f15362) {
                        }
                    } else {
                        if (this.f15365 + length < this.f15362) {
                        }
                        this.f15365 += length;
                        this.f15364 = i2;
                    }
                }
                if (i2 != 0) {
                    return i2;
                }
                i4 = this.f15365;
                i5 = this.f15362;
                c2 = 0;
                long j7 = 0;
                i6 = 0;
                z2 = true;
                boolean z9 = false;
                while (true) {
                    if (i4 + i6 == i5) {
                        if (i6 != cArr.length) {
                            if (m13423(i6 + 1)) {
                                i4 = this.f15365;
                                i5 = this.f15362;
                                c3 = cArr[i4 + i6];
                                if (c3 != '+') {
                                    if (c3 != 'E') {
                                        if (c2 != 2) {
                                        }
                                        c2 = 5;
                                        i6++;
                                        z3 = true;
                                    } else {
                                        if (c2 != 2) {
                                        }
                                        c2 = 5;
                                        i6++;
                                        z3 = true;
                                    }
                                    if (i7 != 0) {
                                        return i7;
                                    }
                                    if (m13422(cArr[this.f15365])) {
                                        m13431("Expected value");
                                        throw null;
                                    }
                                    m13424();
                                    this.f15364 = 10;
                                    return 10;
                                }
                                if (c2 != 5) {
                                }
                                c2 = 6;
                                i6++;
                                z3 = true;
                            }
                            c4 = 2;
                            if (c2 != 2) {
                                if (c2 != c4) {
                                }
                                this.f15366 = i6;
                                i7 = 16;
                                this.f15364 = 16;
                            } else {
                                if (!z2) {
                                }
                                c4 = 2;
                                if (c2 != c4) {
                                }
                                this.f15366 = i6;
                                i7 = 16;
                                this.f15364 = 16;
                            }
                            if (i7 != 0) {
                                return i7;
                            }
                            if (m13422(cArr[this.f15365])) {
                                m13431("Expected value");
                                throw null;
                            }
                            m13424();
                            this.f15364 = 10;
                            return 10;
                        }
                    } else {
                        c3 = cArr[i4 + i6];
                        if (c3 != '+') {
                            if (c3 != 'E') {
                                if (c2 != 2) {
                                }
                                c2 = 5;
                                i6++;
                                z3 = true;
                            } else {
                                if (c2 != 2) {
                                }
                                c2 = 5;
                                i6++;
                                z3 = true;
                            }
                            if (i7 != 0) {
                                return i7;
                            }
                            if (m13422(cArr[this.f15365])) {
                                m13431("Expected value");
                                throw null;
                            }
                            m13424();
                            this.f15364 = 10;
                            return 10;
                        }
                        if (c2 != 5) {
                        }
                        c2 = 6;
                        i6++;
                        z3 = true;
                    }
                    i7 = 0;
                    if (i7 != 0) {
                        return i7;
                    }
                    if (m13422(cArr[this.f15365])) {
                        m13431("Expected value");
                        throw null;
                    }
                    m13424();
                    this.f15364 = 10;
                    return 10;
                }
                i2 = 0;
                if (i2 != 0) {
                    return i2;
                }
                i4 = this.f15365;
                i5 = this.f15362;
                c2 = 0;
                long j8 = 0;
                i6 = 0;
                z2 = true;
                boolean z10 = false;
                while (true) {
                    if (i4 + i6 == i5) {
                        if (i6 != cArr.length) {
                            if (m13423(i6 + 1)) {
                                i4 = this.f15365;
                                i5 = this.f15362;
                                c3 = cArr[i4 + i6];
                                if (c3 != '+') {
                                    if (c3 != 'E') {
                                        if (c2 != 2) {
                                        }
                                        c2 = 5;
                                        i6++;
                                        z3 = true;
                                    } else {
                                        if (c2 != 2) {
                                        }
                                        c2 = 5;
                                        i6++;
                                        z3 = true;
                                    }
                                    if (i7 != 0) {
                                        return i7;
                                    }
                                    if (m13422(cArr[this.f15365])) {
                                        m13431("Expected value");
                                        throw null;
                                    }
                                    m13424();
                                    this.f15364 = 10;
                                    return 10;
                                }
                                if (c2 != 5) {
                                }
                                c2 = 6;
                                i6++;
                                z3 = true;
                            }
                            c4 = 2;
                            if (c2 != 2) {
                                if (c2 != c4) {
                                }
                                this.f15366 = i6;
                                i7 = 16;
                                this.f15364 = 16;
                            } else {
                                if (!z2) {
                                }
                                c4 = 2;
                                if (c2 != c4) {
                                }
                                this.f15366 = i6;
                                i7 = 16;
                                this.f15364 = 16;
                            }
                            if (i7 != 0) {
                                return i7;
                            }
                            if (m13422(cArr[this.f15365])) {
                                m13431("Expected value");
                                throw null;
                            }
                            m13424();
                            this.f15364 = 10;
                            return 10;
                        }
                    } else {
                        c3 = cArr[i4 + i6];
                        if (c3 != '+') {
                            if (c3 != 'E') {
                                if (c2 != 2) {
                                }
                                c2 = 5;
                                i6++;
                                z3 = true;
                            } else {
                                if (c2 != 2) {
                                }
                                c2 = 5;
                                i6++;
                                z3 = true;
                            }
                            if (i7 != 0) {
                                return i7;
                            }
                            if (m13422(cArr[this.f15365])) {
                                m13431("Expected value");
                                throw null;
                            }
                            m13424();
                            this.f15364 = 10;
                            return 10;
                        }
                        if (c2 != 5) {
                        }
                        c2 = 6;
                        i6++;
                        z3 = true;
                    }
                    i7 = 0;
                    if (i7 != 0) {
                        return i7;
                    }
                    if (m13422(cArr[this.f15365])) {
                        m13431("Expected value");
                        throw null;
                    }
                    m13424();
                    this.f15364 = 10;
                    return 10;
                }
            }
            i = 1;
            if (i9 == 1) {
                this.f15364 = 4;
                return 4;
            }
        }
        if (i9 == i || i9 == 2) {
            m13424();
            this.f15365 -= i;
            this.f15364 = 7;
            return 7;
        }
        m13431("Unexpected value");
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m13422(char c) throws C18378 {
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
        m13424();
        return false;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String m13437() throws IOException {
        String strM13425;
        int iM13446 = this.f15364;
        if (iM13446 == 0) {
            iM13446 = m13446();
        }
        switch (iM13446) {
            case 12:
                strM13425 = m13425('\'');
                break;
            case 13:
                strM13425 = m13425('\"');
                break;
            case 14:
                strM13425 = m13426();
                break;
            default:
                throw m13434("a name");
        }
        this.f15364 = 0;
        this.f15369[this.f15379 - 1] = strM13425;
        return strM13425;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m13421(String str) {
        if (this.f15378) {
            this.f15369[this.f15379 - 1] = str;
            this.f15378 = false;
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String m13453() throws IOException {
        String string;
        int iM13446 = this.f15364;
        if (iM13446 == 0) {
            iM13446 = m13446();
        }
        if (iM13446 == 15) {
            string = Long.toString(this.f15368);
        } else if (iM13446 != 16) {
            switch (iM13446) {
                case 8:
                    string = m13425('\'');
                    break;
                case 9:
                    string = m13425('\"');
                    break;
                case 10:
                    string = m13426();
                    break;
                case 11:
                    string = this.f15372;
                    this.f15372 = null;
                    break;
                default:
                    throw m13434("a string");
            }
        } else {
            string = new String(this.f15373, this.f15365, this.f15366);
            this.f15365 += this.f15366;
        }
        this.f15364 = 0;
        int[] iArr = this.f15363;
        int i = this.f15379 - 1;
        iArr[i] = iArr[i] + 1;
        m13421(string);
        return string;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean m13440() throws IOException {
        int iM13446 = this.f15364;
        if (iM13446 == 0) {
            iM13446 = m13446();
        }
        if (iM13446 == 5) {
            this.f15364 = 0;
            int[] iArr = this.f15363;
            int i = this.f15379 - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iM13446 == 6) {
            this.f15364 = 0;
            int[] iArr2 = this.f15363;
            int i2 = this.f15379 - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return false;
        }
        throw m13434("a boolean");
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public void m13444() throws IOException {
        int iM13446 = this.f15364;
        if (iM13446 == 0) {
            iM13446 = m13446();
        }
        if (iM13446 == 7) {
            this.f15364 = 0;
            int[] iArr = this.f15363;
            int i = this.f15379 - 1;
            iArr[i] = iArr[i] + 1;
            return;
        }
        throw m13434("null");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public double m13448() throws IOException {
        int iM13446 = this.f15364;
        if (iM13446 == 0) {
            iM13446 = m13446();
        }
        if (iM13446 == 15) {
            this.f15364 = 0;
            int[] iArr = this.f15363;
            int i = this.f15379 - 1;
            iArr[i] = iArr[i] + 1;
            return this.f15368;
        }
        if (iM13446 == 16) {
            this.f15372 = new String(this.f15373, this.f15365, this.f15366);
            this.f15365 += this.f15366;
        } else {
            switch (iM13446) {
                case 8:
                case 9:
                    this.f15372 = m13425(iM13446 == 8 ? '\'' : '\"');
                    break;
                case 10:
                    this.f15372 = m13426();
                    break;
                case 11:
                    break;
                default:
                    throw m13434("a double");
            }
        }
        this.f15364 = 11;
        try {
            double d = Double.parseDouble(this.f15372);
            if (this.f15376 != EnumC19805.LENIENT && (Double.isNaN(d) || Double.isInfinite(d))) {
                m13431("JSON forbids NaN and infinities: " + d);
                throw null;
            }
            String str = this.f15372;
            this.f15372 = null;
            this.f15364 = 0;
            int[] iArr2 = this.f15363;
            int i2 = this.f15379 - 1;
            iArr2[i2] = iArr2[i2] + 1;
            m13421(str);
            return d;
        } catch (NumberFormatException e) {
            NumberFormatException numberFormatException = new NumberFormatException("Expected a double but was " + this.f15372 + m13454());
            numberFormatException.initCause(e);
            throw numberFormatException;
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long m13452() throws IOException {
        int iM13446 = this.f15364;
        if (iM13446 == 0) {
            iM13446 = m13446();
        }
        if (iM13446 == 15) {
            this.f15364 = 0;
            int[] iArr = this.f15363;
            int i = this.f15379 - 1;
            iArr[i] = iArr[i] + 1;
            return this.f15368;
        }
        if (iM13446 == 16) {
            this.f15372 = new String(this.f15373, this.f15365, this.f15366);
            this.f15365 += this.f15366;
        } else {
            switch (iM13446) {
                case 8:
                case 9:
                case 10:
                    if (iM13446 == 10) {
                        this.f15372 = m13426();
                    } else {
                        this.f15372 = m13425(iM13446 == 8 ? '\'' : '\"');
                    }
                    String str = this.f15372;
                    int i2 = C17918.f58702;
                    for (int i3 = 0; i3 < str.length(); i3++) {
                        if (str.charAt(i3) > 127) {
                            m13431("String contains non-ASCII characters: ".concat(str));
                            throw null;
                        }
                    }
                    try {
                        long j = Long.parseLong(this.f15372);
                        this.f15364 = 0;
                        int[] iArr2 = this.f15363;
                        int i4 = this.f15379 - 1;
                        iArr2[i4] = iArr2[i4] + 1;
                        m13421(this.f15372);
                        return j;
                    } catch (NumberFormatException unused) {
                    }
                    break;
                default:
                    throw m13434("a long");
            }
        }
        this.f15364 = 11;
        try {
            double d = Double.parseDouble(this.f15372);
            long j2 = (long) d;
            if (j2 != d) {
                throw new NumberFormatException("Expected a long but was " + this.f15372 + m13454());
            }
            String str2 = this.f15372;
            this.f15372 = null;
            this.f15364 = 0;
            int[] iArr3 = this.f15363;
            int i5 = this.f15379 - 1;
            iArr3[i5] = iArr3[i5] + 1;
            m13421(str2);
            return j2;
        } catch (NumberFormatException e) {
            NumberFormatException numberFormatException = new NumberFormatException("Expected a long but was " + this.f15372 + m13454());
            numberFormatException.initCause(e);
            throw numberFormatException;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private String m13425(char c) throws C18378 {
        int i;
        char[] cArr;
        StringBuilder sb = null;
        do {
            int i2 = this.f15365;
            int i3 = this.f15362;
            while (true) {
                i = i2;
                while (true) {
                    cArr = this.f15373;
                    if (i < i3) {
                        int i4 = i + 1;
                        char c2 = cArr[i];
                        if (this.f15376 == EnumC19805.STRICT && c2 < ' ') {
                            m13431("Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode");
                            throw null;
                        }
                        if (c2 == c) {
                            this.f15365 = i4;
                            int i5 = (i4 - i2) - 1;
                            if (sb == null) {
                                return m13427(new String(cArr, i2, i5));
                            }
                            sb.append(cArr, i2, i5);
                            return m13427(sb.toString());
                        }
                        if (c2 == '\\') {
                            this.f15365 = i4;
                            int i6 = i4 - i2;
                            int i7 = i6 - 1;
                            if (sb == null) {
                                sb = new StringBuilder(Math.max(i6 * 2, 16));
                            }
                            sb.append(cArr, i2, i7);
                            sb.append(m13433());
                            i2 = this.f15365;
                            i3 = this.f15362;
                        } else {
                            if (c2 == '\n') {
                                this.f15367++;
                                this.f15375 = i4;
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
            this.f15365 = i;
        } while (m13423(1));
        m13431("Unterminated string");
        throw null;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private String m13427(String str) throws C18378 {
        if (this.f15376 != EnumC19805.STRICT) {
            return str;
        }
        int i = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (Character.isSurrogate(cCharAt) && (!Character.isHighSurrogate(cCharAt) || (i = i + 1) >= str.length() || !Character.isLowSurrogate(str.charAt(i)))) {
                m13431("Unpaired surrogate characters are not allowed in strict mode");
                throw null;
            }
            i++;
        }
        return str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private String m13426() throws C18378 {
        String string;
        StringBuilder sb = null;
        int i = 0;
        while (true) {
            int i2 = 0;
            while (true) {
                int i3 = this.f15365;
                int i4 = i3 + i2;
                int i5 = this.f15362;
                char[] cArr = this.f15373;
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
                        m13424();
                    }
                    i = i2;
                } else if (i2 < cArr.length) {
                    if (!m13423(i2 + 1)) {
                        i = i2;
                    }
                } else {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max(i2, 16));
                    }
                    sb.append(cArr, this.f15365, i2);
                    this.f15365 += i2;
                    if (!m13423(1)) {
                    }
                }
                if (sb == null) {
                    string = new String(cArr, this.f15365, i);
                } else {
                    sb.append(cArr, this.f15365, i);
                    string = sb.toString();
                }
                this.f15365 += i;
                return string;
            }
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m13435(char c) throws C18378 {
        do {
            int i = this.f15365;
            int i2 = this.f15362;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = this.f15373[i];
                if (c2 == c) {
                    this.f15365 = i3;
                    return;
                }
                if (c2 == '\\') {
                    this.f15365 = i3;
                    m13433();
                    i = this.f15365;
                    i2 = this.f15362;
                } else {
                    if (c2 == '\n') {
                        this.f15367++;
                        this.f15375 = i3;
                    }
                    i = i3;
                }
            }
            this.f15365 = i;
        } while (m13423(1));
        m13431("Unterminated string");
        throw null;
    }

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    private void m13428() throws C18378 {
        do {
            int i = 0;
            while (true) {
                int i2 = this.f15365;
                if (i2 + i < this.f15362) {
                    char c = this.f15373[i2 + i];
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
                        m13424();
                    }
                    this.f15365 += i;
                    return;
                }
                this.f15365 = i2 + i;
            }
        } while (m13423(1));
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int m13455() throws IOException {
        int iM13446 = this.f15364;
        if (iM13446 == 0) {
            iM13446 = m13446();
        }
        if (iM13446 == 15) {
            long j = this.f15368;
            int i = (int) j;
            if (j != i) {
                throw new NumberFormatException("Expected an int but was " + this.f15368 + m13454());
            }
            this.f15364 = 0;
            int[] iArr = this.f15363;
            int i2 = this.f15379 - 1;
            iArr[i2] = iArr[i2] + 1;
            return i;
        }
        if (iM13446 == 16) {
            this.f15372 = new String(this.f15373, this.f15365, this.f15366);
            this.f15365 += this.f15366;
        } else if (iM13446 == 8 || iM13446 == 9 || iM13446 == 10) {
            if (iM13446 == 10) {
                this.f15372 = m13426();
            } else {
                this.f15372 = m13425(iM13446 == 8 ? '\'' : '\"');
            }
            String str = this.f15372;
            int i3 = C17918.f58702;
            for (int i4 = 0; i4 < str.length(); i4++) {
                if (str.charAt(i4) > 127) {
                    m13431("String contains non-ASCII characters: ".concat(str));
                    throw null;
                }
            }
            try {
                int i5 = Integer.parseInt(this.f15372);
                this.f15364 = 0;
                int[] iArr2 = this.f15363;
                int i6 = this.f15379 - 1;
                iArr2[i6] = iArr2[i6] + 1;
                m13421(this.f15372);
                return i5;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw m13434("an int");
        }
        this.f15364 = 11;
        try {
            double d = Double.parseDouble(this.f15372);
            int i7 = (int) d;
            if (i7 != d) {
                throw new NumberFormatException("Expected an int but was " + this.f15372 + m13454());
            }
            String str2 = this.f15372;
            this.f15372 = null;
            this.f15364 = 0;
            int[] iArr3 = this.f15363;
            int i8 = this.f15379 - 1;
            iArr3[i8] = iArr3[i8] + 1;
            m13421(str2);
            return i7;
        } catch (NumberFormatException e) {
            NumberFormatException numberFormatException = new NumberFormatException("Expected an int but was " + this.f15372 + m13454());
            numberFormatException.initCause(e);
            throw numberFormatException;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f15364 = 0;
        this.f15371[0] = 8;
        this.f15379 = 1;
        this.f15374.close();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public void m13445() throws IOException {
        int i = 0;
        do {
            int iM13446 = this.f15364;
            if (iM13446 == 0) {
                iM13446 = m13446();
            }
            switch (iM13446) {
                case 1:
                    m13430(3);
                    i++;
                    this.f15364 = 0;
                    break;
                case 2:
                    if (i == 0) {
                        this.f15369[this.f15379 - 1] = null;
                    }
                    this.f15379--;
                    i--;
                    this.f15364 = 0;
                    break;
                case 3:
                    m13430(1);
                    i++;
                    this.f15364 = 0;
                    break;
                case 4:
                    this.f15379--;
                    i--;
                    this.f15364 = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.f15364 = 0;
                    break;
                case 8:
                    m13435('\'');
                    this.f15364 = 0;
                    break;
                case 9:
                    m13435('\"');
                    this.f15364 = 0;
                    break;
                case 10:
                    m13428();
                    this.f15364 = 0;
                    break;
                case 12:
                    m13435('\'');
                    if (i == 0) {
                        this.f15369[this.f15379 - 1] = "<skipped>";
                    }
                    this.f15364 = 0;
                    break;
                case 13:
                    m13435('\"');
                    if (i == 0) {
                        this.f15369[this.f15379 - 1] = "<skipped>";
                    }
                    this.f15364 = 0;
                    break;
                case 14:
                    m13428();
                    if (i == 0) {
                        this.f15369[this.f15379 - 1] = "<skipped>";
                    }
                    this.f15364 = 0;
                    break;
                case 16:
                    this.f15365 += this.f15366;
                    this.f15364 = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i > 0);
        int[] iArr = this.f15363;
        int i2 = this.f15379 - 1;
        iArr[i2] = iArr[i2] + 1;
        m13421("<skipped>");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m13430(int i) throws C18378 {
        int i2 = this.f15379;
        int i3 = i2 - 1;
        int i4 = this.f15370;
        if (i3 >= i4) {
            StringBuilder sbM12235 = C3769.m12235(i4, "Nesting limit ", " reached");
            sbM12235.append(m13454());
            throw new C18378(sbM12235.toString());
        }
        int[] iArr = this.f15371;
        if (i2 == iArr.length) {
            int i5 = i2 * 2;
            this.f15371 = Arrays.copyOf(iArr, i5);
            this.f15363 = Arrays.copyOf(this.f15363, i5);
            this.f15369 = (String[]) Arrays.copyOf(this.f15369, i5);
        }
        int[] iArr2 = this.f15371;
        int i6 = this.f15379;
        this.f15379 = i6 + 1;
        iArr2[i6] = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m13423(int i) throws IOException {
        int i2;
        int i3;
        int i4 = this.f15375;
        int i5 = this.f15365;
        this.f15375 = i4 - i5;
        this.f15377 += (long) i5;
        int i6 = this.f15362;
        char[] cArr = this.f15373;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.f15362 = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.f15362 = 0;
        }
        this.f15365 = 0;
        do {
            int i8 = this.f15362;
            int i9 = this.f15374.read(cArr, i8, cArr.length - i8);
            if (i9 == -1) {
                return false;
            }
            i2 = this.f15362 + i9;
            this.f15362 = i2;
            if (this.f15377 == 0 && (i3 = this.f15365) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.f15365 = i3 + 1;
                this.f15375++;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private int m13429(boolean z) throws IOException {
        int i = this.f15365;
        int i2 = this.f15362;
        while (true) {
            if (i == i2) {
                this.f15365 = i;
                if (!m13423(1)) {
                    if (!z) {
                        return -1;
                    }
                    throw new EOFException("End of input" + m13454());
                }
                i = this.f15365;
                i2 = this.f15362;
            }
            int i3 = i + 1;
            char[] cArr = this.f15373;
            char c = cArr[i];
            if (c == '\n') {
                this.f15367++;
                this.f15375 = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.f15365 = i3;
                    if (i3 == i2) {
                        this.f15365 = i;
                        boolean zM13423 = m13423(2);
                        this.f15365++;
                        if (!zM13423) {
                        }
                        return c;
                    }
                    m13424();
                    int i4 = this.f15365;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.f15365 = i4 + 1;
                        while (true) {
                            if (this.f15365 + 2 > this.f15362 && !m13423(2)) {
                                m13431("Unterminated comment");
                                throw null;
                            }
                            int i5 = this.f15365;
                            if (cArr[i5] != '\n') {
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= 2) {
                                        i = this.f15365 + 2;
                                        i2 = this.f15362;
                                        break;
                                    }
                                    if (cArr[this.f15365 + i6] != "*/".charAt(i6)) {
                                        break;
                                    }
                                    i6++;
                                }
                            } else {
                                this.f15367++;
                                this.f15375 = i5 + 1;
                            }
                            this.f15365++;
                        }
                    } else {
                        if (c2 != '/') {
                            return c;
                        }
                        this.f15365 = i4 + 1;
                        m13436();
                        i = this.f15365;
                        i2 = this.f15362;
                    }
                } else if (c == '#') {
                    this.f15365 = i3;
                    m13424();
                    m13436();
                    i = this.f15365;
                    i2 = this.f15362;
                } else {
                    this.f15365 = i3;
                    return c;
                }
            }
            i = i3;
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m13424() throws C18378 {
        if (this.f15376 == EnumC19805.LENIENT) {
            return;
        }
        m13431("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    private void m13436() {
        char c;
        do {
            if (this.f15365 >= this.f15362 && !m13423(1)) {
                return;
            }
            int i = this.f15365;
            int i2 = i + 1;
            this.f15365 = i2;
            c = this.f15373[i];
            if (c == '\n') {
                this.f15367++;
                this.f15375 = i2;
                return;
            }
        } while (c != '\r');
    }

    public String toString() {
        return getClass().getSimpleName() + m13454();
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final String m13454() {
        StringBuilder sbM5126 = C1402.m5126(" at line ", this.f15367 + 1, " column ", " path ", (this.f15365 - this.f15375) + 1);
        sbM5126.append(m13443());
        return sbM5126.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private String m13420(boolean z) {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i2 = this.f15379;
            if (i >= i2) {
                return sb.toString();
            }
            int i3 = this.f15371[i];
            switch (i3) {
                case 1:
                case 2:
                    int i4 = this.f15363[i];
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
                    String str = this.f15369[i];
                    if (str != null) {
                        sb.append(str);
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    throw new AssertionError(C13645.m33382(i3, "Unknown scope value: "));
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String m13443() {
        return m13420(false);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String m13451() {
        return m13420(true);
    }

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    private char m13433() throws C18378 {
        int i;
        if (this.f15365 == this.f15362 && !m13423(1)) {
            m13431("Unterminated escape sequence");
            throw null;
        }
        int i2 = this.f15365;
        int i3 = i2 + 1;
        this.f15365 = i3;
        char[] cArr = this.f15373;
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
                            if (i2 + 5 > this.f15362 && !m13423(4)) {
                                m13431("Unterminated escape sequence");
                                throw null;
                            }
                            int i4 = this.f15365;
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
                                        m13431("Malformed Unicode escape \\u".concat(new String(cArr, this.f15365, 4)));
                                        throw null;
                                    }
                                    i = c2 - '7';
                                }
                                i6 = i7 + i;
                                i4++;
                            }
                            this.f15365 += 4;
                            return (char) i6;
                        }
                        m13431("Invalid escape sequence");
                        throw null;
                    }
                }
            }
            return c;
        }
        if (this.f15376 == EnumC19805.STRICT) {
            m13431("Cannot escape a newline character in strict mode");
            throw null;
        }
        this.f15367++;
        this.f15375 = i3;
        if (this.f15376 == EnumC19805.STRICT) {
            m13431("Invalid escaped character \"'\" in strict mode");
            throw null;
        }
        return c;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m13431(String str) throws C18378 {
        StringBuilder sbM27333 = C10732.m27333(str);
        sbM27333.append(m13454());
        sbM27333.append("\nSee ");
        sbM27333.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("malformed-json"));
        throw new C18378(sbM27333.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public IllegalStateException m13434(String str) {
        String str2 = m13438() == EnumC14648.NULL ? "adapter-not-null-safe" : "unexpected-json-structure";
        StringBuilder sbM51387 = C22783.m51387("Expected ", str, " but was ");
        sbM51387.append(m13438());
        sbM51387.append(m13454());
        sbM51387.append("\nSee ");
        sbM51387.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str2));
        return new IllegalStateException(sbM51387.toString());
    }

    static {
        AbstractC10108.f32379 = new C24346();
    }
}
