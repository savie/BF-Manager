package l;

import com.google.android.material.slider.BaseSlider;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.bouncycastle.math.ec.custom.sec.SecP160R1Field;

/* JADX INFO: renamed from: l.ۗۗ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 2AUQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C2974 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final int[] f11117;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final boolean[] f11118;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final int[] f11119;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final boolean[] f11120;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f11121;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static boolean f11122;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final char[] f11123;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long f11124;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f11125;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f11126;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f11127;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f11128;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f11129;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f11130;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f11131;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final String f11132;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public TimeZone f11133;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public char f11134;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f11135;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Calendar f11136;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f11137;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f11138;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public char[] f11139;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public String f11140;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f11141;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f11142;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public Locale f11143;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m8813(char c, char c2, char c3, char c4, char c5, char c6, int i, int i2) {
        if (c >= '1' && c <= '3' && c2 >= '0' && c2 <= '9' && c3 >= '0' && c3 <= '9' && c4 >= '0' && c4 <= '9') {
            if (c5 == '0') {
                if (c6 < '1' || c6 > '9') {
                    return false;
                }
            } else if (c5 != '1' || (c6 != '0' && c6 != '1' && c6 != '2')) {
                return false;
            }
            if (i == 48) {
                return i2 >= 49 && i2 <= 57;
            }
            if (i != 49 && i != 50) {
                return i == 51 && (i2 == 48 || i2 == 49);
            }
            if (i2 >= 48 && i2 <= 57) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m8816(char c, char c2, char c3, char c4, char c5, char c6) {
        if (c == '0') {
            if (c2 < '0' || c2 > '9') {
                return false;
            }
        } else {
            if (c != '1') {
                if (c == '2' && c2 >= '0' && c2 <= '4') {
                }
                return false;
            }
            if (c2 < '0' || c2 > '9') {
                return false;
            }
        }
        if (c3 < '0' || c3 > '5') {
            if (c3 != '6' || c4 != '0') {
                return false;
            }
        } else if (c4 < '0' || c4 > '9') {
            return false;
        }
        if (c5 < '0' || c5 > '5') {
            return c5 == '6' && c6 == '0';
        }
        return c6 >= '0' && c6 <= '9';
    }

    static {
        int i;
        char c;
        char c2;
        try {
            i = Class.forName("android.os.Build$VERSION").getField("SDK_INT").getInt(null);
            while (true) {
                boolean[] zArr = f11120;
                if (c2 >= zArr.length) {
                    break;
                }
                if (c2 >= 'A' && c2 <= 'Z') {
                    zArr[c2] = true;
                } else if (c2 >= 'a' && c2 <= 'z') {
                    zArr[c2] = true;
                } else if (c2 == '_') {
                    zArr[c2] = true;
                }
                c2 = (char) (c2 + 1);
            }
            while (true) {
                boolean[] zArr2 = f11118;
                if (c >= zArr2.length) {
                    return;
                }
                if (c >= 'A' && c <= 'Z') {
                    zArr2[c] = true;
                } else if (c >= 'a' && c <= 'z') {
                    zArr2[c] = true;
                } else if (c == '_') {
                    zArr2[c] = true;
                } else if (c >= '0' && c <= '9') {
                    zArr2[c] = true;
                }
                c = (char) (c + 1);
            }
        } catch (Exception unused) {
            i = -1;
        }
        c = 0;
        f11122 = i >= 23;
        f11121 = new ThreadLocal();
        f11117 = new int[IShizukuService.Stub.TRANSACTION_dispatchPackageChanged];
        for (int i2 = 48; i2 <= 57; i2++) {
            f11117[i2] = i2 - 48;
        }
        for (int i3 = 97; i3 <= 102; i3++) {
            f11117[i3] = i3 - 87;
        }
        for (int i4 = 65; i4 <= 70; i4++) {
            f11117[i4] = i4 - 55;
        }
        char[] charArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
        f11123 = charArray;
        int[] iArr = new int[256];
        f11119 = iArr;
        Arrays.fill(iArr, -1);
        int length = charArray.length;
        for (int i5 = 0; i5 < length; i5++) {
            f11119[f11123[i5]] = i5;
        }
        f11119[61] = 0;
        f11120 = new boolean[256];
        c2 = 0;
        f11118 = new boolean[256];
    }

    public C2974(String str) {
        this(str, AbstractC8620.f29749);
    }

    public C2974(String str, int i) {
        this.f11142 = AbstractC8620.f29749;
        this.f11128 = false;
        this.f11126 = false;
        this.f11133 = AbstractC8620.f29746;
        this.f11143 = AbstractC8620.f29748;
        this.f11136 = null;
        this.f11137 = 0;
        char[] cArr = (char[]) f11121.get();
        this.f11139 = cArr;
        if (cArr == null) {
            this.f11139 = new char[512];
        }
        this.f11142 = i;
        this.f11132 = str;
        int length = str.length();
        this.f11129 = length;
        int i2 = (-1) + 1;
        this.f11127 = i2;
        char cCharAt = i2 >= length ? (char) 26 : str.charAt(i2);
        this.f11134 = cCharAt;
        if (cCharAt == 65279) {
            m8823();
        }
        this.f11140 = (EnumC9326.InitStringFieldAsEmpty.f31669 & i) != 0 ? "" : null;
        this.f11125 = (EnumC9326.DisableCircularReferenceDetect.f31669 & i) != 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m8859() {
        return this.f11130;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m8849() {
        char[] cArr = this.f11139;
        if (cArr.length <= 8196) {
            f11121.set(cArr);
        }
        this.f11139 = null;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final char m8823() {
        int i = this.f11127 + 1;
        this.f11127 = i;
        char cCharAt = i >= this.f11129 ? (char) 26 : this.f11132.charAt(i);
        this.f11134 = cCharAt;
        return cCharAt;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m8833(EnumC9326 enumC9326) {
        return (enumC9326.f31669 & this.f11142) != 0;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m8864() {
        this.f11131 = 0;
        while (true) {
            char c = this.f11134;
            if (c == ':') {
                int i = this.f11127 + 1;
                this.f11127 = i;
                this.f11134 = i >= this.f11129 ? (char) 26 : this.f11132.charAt(i);
                m8839();
                return;
            }
            if (c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == '\f' || c == '\b') {
                m8823();
            } else {
                throw new C20614("not match : - " + this.f11134);
            }
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final String m8854() {
        char cCharAt = this.f11132.charAt((this.f11141 + this.f11131) - 1);
        int i = this.f11131;
        if (cCharAt == 'L' || cCharAt == 'S' || cCharAt == 'B' || cCharAt == 'F' || cCharAt == 'D') {
            i--;
        }
        return m8815(this.f11141, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final char m8825(int i) {
        if (i >= this.f11129) {
            return (char) 26;
        }
        return this.f11132.charAt(i);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m8839() {
        int i = 0;
        this.f11131 = 0;
        while (true) {
            int i2 = this.f11127;
            this.f11138 = i2;
            char c = this.f11134;
            if (c == '/') {
                m8842();
            } else {
                if (c == '\"') {
                    m8841();
                    return;
                }
                if ((c >= '0' && c <= '9') || c == '-') {
                    m8856();
                    return;
                }
                if (c == ',') {
                    m8823();
                    this.f11130 = 16;
                    return;
                }
                if (c != '\f' && c != '\r' && c != ' ') {
                    if (c == ':') {
                        m8823();
                        this.f11130 = 17;
                        return;
                    }
                    int i3 = this.f11129;
                    String str = this.f11132;
                    if (c == '[') {
                        int i4 = i2 + 1;
                        this.f11127 = i4;
                        this.f11134 = i4 < i3 ? str.charAt(i4) : (char) 26;
                        this.f11130 = 14;
                        return;
                    }
                    if (c == ']') {
                        m8823();
                        this.f11130 = 15;
                        return;
                    }
                    if (c == 'f') {
                        if (str.startsWith("false", i2)) {
                            int i5 = this.f11127 + 5;
                            this.f11127 = i5;
                            char cM8825 = m8825(i5);
                            this.f11134 = cM8825;
                            if (cM8825 == ' ' || cM8825 == ',' || cM8825 == '}' || cM8825 == ']' || cM8825 == '\n' || cM8825 == '\r' || cM8825 == '\t' || cM8825 == 26 || cM8825 == '\f' || cM8825 == '\b' || cM8825 == ':') {
                                this.f11130 = 7;
                                return;
                            }
                        }
                        throw new C20614("scan false error");
                    }
                    if (c == 'n') {
                        if (str.startsWith("null", i2)) {
                            this.f11127 += 4;
                            i = 8;
                        } else if (str.startsWith("new", this.f11127)) {
                            this.f11127 += 3;
                            i = 9;
                        }
                        if (i != 0) {
                            char cM8826 = m8825(this.f11127);
                            this.f11134 = cM8826;
                            if (cM8826 == ' ' || cM8826 == ',' || cM8826 == '}' || cM8826 == ']' || cM8826 == '\n' || cM8826 == '\r' || cM8826 == '\t' || cM8826 == 26 || cM8826 == '\f' || cM8826 == '\b') {
                                this.f11130 = i;
                                return;
                            }
                        }
                        throw new C20614("scan null/new error");
                    }
                    if (c == '{') {
                        int i6 = i2 + 1;
                        this.f11127 = i6;
                        this.f11134 = i6 < i3 ? str.charAt(i6) : (char) 26;
                        this.f11130 = 12;
                        return;
                    }
                    if (c == '}') {
                        int i7 = i2 + 1;
                        this.f11127 = i7;
                        this.f11134 = i7 < i3 ? str.charAt(i7) : (char) 26;
                        this.f11130 = 13;
                        return;
                    }
                    if (c != 'S' && c != 'T') {
                        if (c == 't') {
                            if (str.startsWith("true", i2)) {
                                int i8 = this.f11127 + 4;
                                this.f11127 = i8;
                                char cM8827 = m8825(i8);
                                this.f11134 = cM8827;
                                if (cM8827 == ' ' || cM8827 == ',' || cM8827 == '}' || cM8827 == ']' || cM8827 == '\n' || cM8827 == '\r' || cM8827 == '\t' || cM8827 == 26 || cM8827 == '\f' || cM8827 == '\b' || cM8827 == ':') {
                                    this.f11130 = 6;
                                    return;
                                }
                            }
                            throw new C20614("scan true error");
                        }
                        if (c != 'u') {
                            switch (c) {
                                case '\b':
                                case '\t':
                                case '\n':
                                    break;
                                default:
                                    switch (c) {
                                        case '\'':
                                            m8841();
                                            return;
                                        case '(':
                                            m8823();
                                            this.f11130 = 10;
                                            return;
                                        case ')':
                                            m8823();
                                            this.f11130 = 11;
                                            return;
                                        default:
                                            if (i2 == i3 || (c == 26 && i2 + 1 == i3)) {
                                                if (this.f11130 == 20) {
                                                    throw new C20614("EOF error");
                                                }
                                                this.f11130 = 20;
                                                this.f11127 = 0;
                                                this.f11138 = 0;
                                                return;
                                            }
                                            if (c > 31 && c != 127) {
                                                this.f11130 = 1;
                                                m8823();
                                                return;
                                            } else {
                                                m8823();
                                                continue;
                                            }
                                            break;
                                    }
                                    break;
                            }
                        }
                    }
                    m8817();
                    return;
                }
                m8823();
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:143:0x009d A[SYNTHETIC] */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m8850(int i) {
        char c;
        this.f11131 = 0;
        while (true) {
            if (i != 2) {
                String str = this.f11132;
                int i2 = this.f11129;
                if (i == 4) {
                    char c2 = this.f11134;
                    if (c2 == '\"') {
                        this.f11138 = this.f11127;
                        m8841();
                        return;
                    } else if (c2 >= '0' && c2 <= '9') {
                        this.f11138 = this.f11127;
                        m8856();
                        return;
                    } else if (c2 == '{') {
                        this.f11130 = 12;
                        int i3 = this.f11127 + 1;
                        this.f11127 = i3;
                        this.f11134 = i3 < i2 ? str.charAt(i3) : (char) 26;
                        return;
                    }
                } else if (i == 12) {
                    char c3 = this.f11134;
                    if (c3 == '{') {
                        this.f11130 = 12;
                        int i4 = this.f11127 + 1;
                        this.f11127 = i4;
                        this.f11134 = i4 < i2 ? str.charAt(i4) : (char) 26;
                        return;
                    }
                    if (c3 == '[') {
                        this.f11130 = 14;
                        int i5 = this.f11127 + 1;
                        this.f11127 = i5;
                        this.f11134 = i5 < i2 ? str.charAt(i5) : (char) 26;
                        return;
                    }
                } else {
                    if (i == 18) {
                        while (true) {
                            c = this.f11134;
                            if (c <= ' ' && (c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == '\f' || c == '\b')) {
                                m8823();
                            }
                        }
                        if (c == '_' || Character.isLetter(c)) {
                            m8817();
                            return;
                        } else {
                            m8839();
                            return;
                        }
                    }
                    if (i != 20) {
                        switch (i) {
                            case 14:
                                char c4 = this.f11134;
                                if (c4 == '[') {
                                    this.f11130 = 14;
                                    m8823();
                                } else if (c4 == '{') {
                                    this.f11130 = 12;
                                    m8823();
                                }
                                break;
                            case 15:
                                if (this.f11134 == ']') {
                                    this.f11130 = 15;
                                    m8823();
                                }
                                if (this.f11134 == 26) {
                                    this.f11130 = 20;
                                }
                                break;
                            case 16:
                                char c5 = this.f11134;
                                if (c5 == ',') {
                                    this.f11130 = 16;
                                    int i6 = this.f11127 + 1;
                                    this.f11127 = i6;
                                    this.f11134 = i6 < i2 ? str.charAt(i6) : (char) 26;
                                } else if (c5 == '}') {
                                    this.f11130 = 13;
                                    int i7 = this.f11127 + 1;
                                    this.f11127 = i7;
                                    this.f11134 = i7 < i2 ? str.charAt(i7) : (char) 26;
                                } else if (c5 == ']') {
                                    this.f11130 = 15;
                                    int i8 = this.f11127 + 1;
                                    this.f11127 = i8;
                                    this.f11134 = i8 < i2 ? str.charAt(i8) : (char) 26;
                                } else if (c5 == 26) {
                                    this.f11130 = 20;
                                }
                                break;
                        }
                        return;
                    }
                    if (this.f11134 == 26) {
                        this.f11130 = 20;
                        return;
                    }
                }
            } else {
                char c6 = this.f11134;
                if (c6 >= '0' && c6 <= '9') {
                    this.f11138 = this.f11127;
                    m8856();
                    return;
                }
                if (c6 == '\"') {
                    this.f11138 = this.f11127;
                    m8841();
                    return;
                } else if (c6 == '[') {
                    this.f11130 = 14;
                    m8823();
                    return;
                } else if (c6 == '{') {
                    this.f11130 = 12;
                    m8823();
                    return;
                }
            }
            char c7 = this.f11134;
            if (c7 == ' ' || c7 == '\n' || c7 == '\r' || c7 == '\t' || c7 == '\f' || c7 == '\b') {
                m8823();
            } else {
                m8839();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Number m8862() {
        char c;
        boolean z;
        long j;
        int i;
        long j2;
        int i2 = this.f11141;
        int i3 = this.f11131 + i2;
        int i4 = i3 - 1;
        String str = this.f11132;
        int i5 = this.f11129;
        char cCharAt = i4 >= i5 ? (char) 26 : str.charAt(i4);
        if (cCharAt == 'B') {
            i3--;
            c = 'B';
        } else if (cCharAt == 'L') {
            i3--;
            c = 'L';
        } else if (cCharAt != 'S') {
            c = ' ';
        } else {
            i3--;
            c = 'S';
        }
        int i6 = this.f11141;
        if ((i6 >= i5 ? (char) 26 : str.charAt(i6)) == '-') {
            i2++;
            j = Long.MIN_VALUE;
            z = true;
        } else {
            z = false;
            j = -9223372036854775807L;
        }
        if (i2 < i3) {
            int i7 = i2 + 1;
            i = 1;
            j2 = -((i2 >= i5 ? (char) 26 : str.charAt(i2)) - '0');
            i2 = i7;
        } else {
            i = 1;
            j2 = 0;
        }
        while (i2 < i3) {
            int i8 = i2 + 1;
            int iCharAt = (i2 >= i5 ? (char) 26 : str.charAt(i2)) - '0';
            if (j2 < -922337203685477580L) {
                return new BigInteger(m8854());
            }
            long j3 = j2 * 10;
            long j4 = iCharAt;
            if (j3 < j + j4) {
                return new BigInteger(m8854());
            }
            j2 = j3 - j4;
            i2 = i8;
        }
        if (!z) {
            long j5 = -j2;
            if (j5 > 2147483647L || c == 'L') {
                return Long.valueOf(j5);
            }
            if (c == 'S') {
                return Short.valueOf((short) j5);
            }
            if (c == 'B') {
                return Byte.valueOf((byte) j5);
            }
            return Integer.valueOf((int) j5);
        }
        if (i2 <= this.f11141 + i) {
            throw new NumberFormatException(m8854());
        }
        if (j2 < -2147483648L || c == 'L') {
            return Long.valueOf(j2);
        }
        if (c == 'S') {
            return Short.valueOf((short) j2);
        }
        if (c == 'B') {
            return Byte.valueOf((byte) j2);
        }
        return Integer.valueOf((int) j2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m8827(C6538 c6538) {
        char c;
        while (true) {
            c = this.f11134;
            if (c != ' ' && c != '\n' && c != '\r' && c != '\t' && c != '\f' && c != '\b') {
                break;
            }
            m8823();
        }
        if (c == '\"') {
            return m8828(c6538, '\"');
        }
        if (c == '\'') {
            return m8828(c6538, '\'');
        }
        if (c == '}') {
            m8823();
            this.f11130 = 13;
            return null;
        }
        if (c == ',') {
            m8823();
            this.f11130 = 16;
            return null;
        }
        if (c == 26) {
            this.f11130 = 20;
            return null;
        }
        return m8848(c6538);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m8828(C6538 c6538, char c) {
        String strM8811;
        int i = this.f11127 + 1;
        String str = this.f11132;
        int iIndexOf = str.indexOf(c, i);
        if (iIndexOf == -1) {
            throw new C20614("unclosed str, " + m8822());
        }
        int i2 = iIndexOf - i;
        char[] cArrM8835 = m8835(this.f11127 + 1, i2);
        boolean z = false;
        while (i2 > 0 && cArrM8835[i2 - 1] == '\\') {
            int i3 = 1;
            for (int i4 = i2 - 2; i4 >= 0 && cArrM8835[i4] == '\\'; i4--) {
                i3++;
            }
            if (i3 % 2 == 0) {
                break;
            }
            int iIndexOf2 = str.indexOf(c, iIndexOf + 1);
            int i5 = (iIndexOf2 - iIndexOf) + i2;
            if (i5 >= cArrM8835.length) {
                int length = (cArrM8835.length * 3) / 2;
                if (length < i5) {
                    length = i5;
                }
                char[] cArr = new char[length];
                System.arraycopy(cArrM8835, 0, cArr, 0, cArrM8835.length);
                cArrM8835 = cArr;
            }
            str.getChars(iIndexOf, iIndexOf2, cArrM8835, i2);
            iIndexOf = iIndexOf2;
            i2 = i5;
            z = true;
        }
        if (z) {
            strM8811 = m8811(cArrM8835, i2);
        } else {
            int i6 = 0;
            for (int i7 = 0; i7 < i2; i7++) {
                char c2 = cArrM8835[i7];
                i6 = (i6 * 31) + c2;
                if (c2 == '\\') {
                    z = true;
                }
            }
            if (z) {
                strM8811 = m8811(cArrM8835, i2);
            } else {
                strM8811 = i2 < 20 ? c6538.m17771(cArrM8835, i2, i6) : new String(cArrM8835, 0, i2);
            }
        }
        int i8 = iIndexOf + 1;
        this.f11127 = i8;
        this.f11134 = i8 >= this.f11129 ? (char) 26 : str.charAt(i8);
        return strM8811;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00f5  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m8811(char[] cArr, int i) {
        int i2;
        int i3;
        char[] cArr2 = new char[i];
        int i4 = 0;
        int i5 = 0;
        while (i4 < i) {
            char c = cArr[i4];
            if (c != '\\') {
                cArr2[i5] = c;
                i5++;
            } else {
                int i6 = i4 + 1;
                char c2 = cArr[i6];
                if (c2 == '\"') {
                    i2 = i5 + 1;
                    cArr2[i5] = '\"';
                } else if (c2 == '\'') {
                    i2 = i5 + 1;
                    cArr2[i5] = '\'';
                } else if (c2 == 'F') {
                    i2 = i5 + 1;
                    cArr2[i5] = '\f';
                } else if (c2 == '\\') {
                    i2 = i5 + 1;
                    cArr2[i5] = '\\';
                } else if (c2 == 'b') {
                    i2 = i5 + 1;
                    cArr2[i5] = '\b';
                } else if (c2 == 'f') {
                    i2 = i5 + 1;
                    cArr2[i5] = '\f';
                } else if (c2 == 'n') {
                    i2 = i5 + 1;
                    cArr2[i5] = '\n';
                } else if (c2 != 'r') {
                    if (c2 != 'x') {
                        switch (c2) {
                            case '/':
                                i2 = i5 + 1;
                                cArr2[i5] = '/';
                                break;
                            case '0':
                                i2 = i5 + 1;
                                cArr2[i5] = 0;
                                break;
                            case '1':
                                i2 = i5 + 1;
                                cArr2[i5] = 1;
                                break;
                            case '2':
                                i2 = i5 + 1;
                                cArr2[i5] = 2;
                                break;
                            case '3':
                                i2 = i5 + 1;
                                cArr2[i5] = 3;
                                break;
                            case '4':
                                i2 = i5 + 1;
                                cArr2[i5] = 4;
                                break;
                            case '5':
                                i2 = i5 + 1;
                                cArr2[i5] = 5;
                                break;
                            case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                                i2 = i5 + 1;
                                cArr2[i5] = 6;
                                break;
                            case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                                i2 = i5 + 1;
                                cArr2[i5] = 7;
                                break;
                            default:
                                switch (c2) {
                                    case 't':
                                        i2 = i5 + 1;
                                        cArr2[i5] = '\t';
                                        break;
                                    case BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION /* 117 */:
                                        i3 = i5 + 1;
                                        char c3 = cArr[i4 + 2];
                                        char c4 = cArr[i4 + 3];
                                        char c5 = cArr[i4 + 4];
                                        i4 += 5;
                                        cArr2[i5] = (char) Integer.parseInt(new String(new char[]{c3, c4, c5, cArr[i4]}), 16);
                                        break;
                                    case 'v':
                                        i2 = i5 + 1;
                                        cArr2[i5] = 11;
                                        break;
                                    default:
                                        throw new C20614("unclosed.str.lit");
                                }
                                break;
                        }
                    } else {
                        i3 = i5 + 1;
                        char c6 = cArr[i4 + 2];
                        int[] iArr = f11117;
                        i4 += 3;
                        cArr2[i5] = (char) ((iArr[c6] * 16) + iArr[cArr[i4]]);
                    }
                    i5 = i3;
                } else {
                    i2 = i5 + 1;
                    cArr2[i5] = '\r';
                }
                i5 = i2;
                i4 = i6;
            }
            i4++;
        }
        return new String(cArr2, 0, i5);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m8822() {
        StringBuilder sb = new StringBuilder("pos ");
        sb.append(this.f11127);
        sb.append(", json : ");
        String strSubstring = this.f11132;
        if (this.f11129 >= 65536) {
            strSubstring = strSubstring.substring(0, 65536);
        }
        sb.append(strSubstring);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m8842() {
        m8823();
        char c = this.f11134;
        if (c == '/') {
            do {
                m8823();
            } while (this.f11134 != '\n');
            m8823();
        } else if (c == '*') {
            m8823();
            while (true) {
                char c2 = this.f11134;
                if (c2 == 26) {
                    return;
                }
                if (c2 == '*') {
                    m8823();
                    if (this.f11134 == '/') {
                        m8823();
                        return;
                    }
                } else {
                    m8823();
                }
            }
        } else {
            throw new C20614("invalid comment");
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m8848(C6538 c6538) {
        int i = this.f11134;
        boolean[] zArr = f11120;
        if (i < zArr.length && !zArr[i]) {
            throw new C20614("illegal identifier : " + this.f11134 + ", " + m8822());
        }
        this.f11141 = this.f11127;
        this.f11131 = 1;
        while (true) {
            char cM8823 = m8823();
            boolean[] zArr2 = f11118;
            if (cM8823 < zArr2.length && !zArr2[cM8823]) {
                break;
            }
            i = (i * 31) + cM8823;
            this.f11131++;
        }
        this.f11134 = m8825(this.f11127);
        this.f11130 = 18;
        int i2 = this.f11131;
        String str = this.f11132;
        if (i2 == 4 && str.startsWith("null", this.f11141)) {
            return null;
        }
        return c6538.m17770(this.f11141, this.f11131, i, str);
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final void m8841() {
        char c = this.f11134;
        int i = this.f11127 + 1;
        String str = this.f11132;
        int iIndexOf = str.indexOf(c, i);
        if (iIndexOf == -1) {
            throw new C20614("unclosed str, " + m8822());
        }
        int i2 = iIndexOf - i;
        char[] cArrM8835 = m8835(this.f11127 + 1, i2);
        boolean z = false;
        while (i2 > 0 && cArrM8835[i2 - 1] == '\\') {
            int i3 = 1;
            for (int i4 = i2 - 2; i4 >= 0 && cArrM8835[i4] == '\\'; i4--) {
                i3++;
            }
            if (i3 % 2 == 0) {
                break;
            }
            int iIndexOf2 = str.indexOf(c, iIndexOf + 1);
            int i5 = (iIndexOf2 - iIndexOf) + i2;
            if (i5 >= cArrM8835.length) {
                int length = (cArrM8835.length * 3) / 2;
                if (length < i5) {
                    length = i5;
                }
                char[] cArr = new char[length];
                System.arraycopy(cArrM8835, 0, cArr, 0, cArrM8835.length);
                cArrM8835 = cArr;
            }
            str.getChars(iIndexOf, iIndexOf2, cArrM8835, i2);
            iIndexOf = iIndexOf2;
            i2 = i5;
            z = true;
        }
        if (!z) {
            for (int i6 = 0; i6 < i2; i6++) {
                if (cArrM8835[i6] == '\\') {
                    z = true;
                }
            }
        }
        this.f11139 = cArrM8835;
        this.f11131 = i2;
        this.f11141 = this.f11127;
        this.f11135 = z;
        int i7 = iIndexOf + 1;
        this.f11127 = i7;
        this.f11134 = i7 >= this.f11129 ? (char) 26 : str.charAt(i7);
        this.f11130 = 4;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final String m8858() {
        String str;
        int i = this.f11127 + 1;
        String str2 = this.f11132;
        int iIndexOf = str2.indexOf(34, i);
        if (iIndexOf == -1) {
            throw new C20614("unclosed str, " + m8822());
        }
        if (f11122) {
            str = str2.substring(i, iIndexOf);
        } else {
            int i2 = iIndexOf - i;
            str = new String(m8835(this.f11127 + 1, i2), 0, i2);
        }
        if (str.indexOf(92) != -1) {
            while (true) {
                int i3 = 0;
                for (int i4 = iIndexOf - 1; i4 >= 0 && str2.charAt(i4) == '\\'; i4--) {
                    i3++;
                }
                if (i3 % 2 == 0) {
                    break;
                }
                iIndexOf = str2.indexOf(34, iIndexOf + 1);
            }
            int i5 = iIndexOf - i;
            str = m8811(m8835(this.f11127 + 1, i5), i5);
        }
        int i6 = iIndexOf + 1;
        this.f11127 = i6;
        this.f11134 = i6 >= this.f11129 ? (char) 26 : str2.charAt(i6);
        return str;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m8836() {
        int i;
        boolean z;
        int i2 = this.f11141;
        int i3 = this.f11131 + i2;
        String str = this.f11132;
        int i4 = this.f11129;
        int i5 = 0;
        if ((i2 >= i4 ? (char) 26 : str.charAt(i2)) == '-') {
            i2++;
            i = Integer.MIN_VALUE;
            z = true;
        } else {
            i = SecP160R1Field.PInv;
            z = false;
        }
        if (i2 < i3) {
            int i6 = i2 + 1;
            i5 = -((i2 >= i4 ? (char) 26 : str.charAt(i2)) - '0');
            i2 = i6;
        }
        while (i2 < i3) {
            int i7 = i2 + 1;
            char cCharAt = i2 >= i4 ? (char) 26 : str.charAt(i2);
            if (cCharAt == 'L' || cCharAt == 'S' || cCharAt == 'B') {
                i2 = i7;
                break;
            }
            int i8 = cCharAt - '0';
            if (i5 < -214748364) {
                throw new NumberFormatException(m8854());
            }
            int i9 = i5 * 10;
            if (i9 < i + i8) {
                throw new NumberFormatException(m8854());
            }
            i5 = i9 - i8;
            i2 = i7;
        }
        if (!z) {
            return -i5;
        }
        if (i2 > this.f11141 + 1) {
            return i5;
        }
        throw new NumberFormatException(m8854());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m8834() {
        return m8814(this.f11141 + 1, this.f11131, this.f11132);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private void m8817() {
        this.f11141 = this.f11127 - 1;
        this.f11135 = false;
        do {
            this.f11131++;
            m8823();
        } while (Character.isLetterOrDigit(this.f11134));
        String strM8840 = m8840();
        if (strM8840.equals("null")) {
            this.f11130 = 8;
            return;
        }
        if (strM8840.equals("true")) {
            this.f11130 = 6;
            return;
        }
        if (strM8840.equals("false")) {
            this.f11130 = 7;
            return;
        }
        if (strM8840.equals("new")) {
            this.f11130 = 9;
            return;
        }
        if (strM8840.equals("undefined")) {
            this.f11130 = 23;
            return;
        }
        if (strM8840.equals("Set")) {
            this.f11130 = 21;
        } else if (strM8840.equals("TreeSet")) {
            this.f11130 = 22;
        } else {
            this.f11130 = 18;
        }
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final String m8840() {
        if (this.f11135) {
            return m8811(this.f11139, this.f11131);
        }
        return m8815(this.f11141 + 1, this.f11131);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private final String m8815(int i, int i2) {
        char[] cArr = this.f11139;
        int length = cArr.length;
        String str = this.f11132;
        if (i2 < length) {
            str.getChars(i, i + i2, cArr, 0);
            return new String(this.f11139, 0, i2);
        }
        char[] cArr2 = new char[i2];
        str.getChars(i, i2 + i, cArr2, 0);
        return new String(cArr2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final char[] m8835(int i, int i2) {
        char[] cArr = this.f11139;
        int length = cArr.length;
        String str = this.f11132;
        if (i2 < length) {
            str.getChars(i, i2 + i, cArr, 0);
            return this.f11139;
        }
        char[] cArr2 = new char[i2];
        this.f11139 = cArr2;
        str.getChars(i, i2 + i, cArr2, 0);
        return cArr2;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m8820() {
        int i = 0;
        while (true) {
            char cM8825 = m8825(i);
            if (cM8825 == 26) {
                return true;
            }
            if (cM8825 > ' ' || !(cM8825 == ' ' || cM8825 == '\n' || cM8825 == '\r' || cM8825 == '\t' || cM8825 == '\f' || cM8825 == '\b')) {
                return false;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m8843() {
        while (true) {
            char c = this.f11134;
            if (c > '/') {
                return;
            }
            if (c == ' ' || c == '\r' || c == '\n' || c == '\t' || c == '\f' || c == '\b') {
                m8823();
            } else if (c != '/') {
                return;
            } else {
                m8842();
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m8856() {
        char c;
        char c2;
        int i = this.f11127;
        this.f11141 = i;
        this.f11128 = false;
        char c3 = this.f11134;
        String str = this.f11132;
        int i2 = this.f11129;
        if (c3 == '-') {
            this.f11131++;
            int i3 = i + 1;
            this.f11127 = i3;
            this.f11134 = i3 >= i2 ? (char) 26 : str.charAt(i3);
        }
        while (true) {
            c = this.f11134;
            if (c < '0' || c > '9') {
                break;
            }
            this.f11131++;
            int i4 = this.f11127 + 1;
            this.f11127 = i4;
            this.f11134 = i4 >= i2 ? (char) 26 : str.charAt(i4);
        }
        this.f11126 = false;
        if (c == '.') {
            this.f11131++;
            int i5 = this.f11127 + 1;
            this.f11127 = i5;
            this.f11134 = i5 >= i2 ? (char) 26 : str.charAt(i5);
            this.f11126 = true;
            while (true) {
                char c4 = this.f11134;
                if (c4 < '0' || c4 > '9') {
                    break;
                }
                this.f11131++;
                int i6 = this.f11127 + 1;
                this.f11127 = i6;
                this.f11134 = i6 >= i2 ? (char) 26 : str.charAt(i6);
            }
        }
        char c5 = this.f11134;
        if (c5 == 'L' || c5 == 'S' || c5 == 'B') {
            this.f11131++;
            m8823();
        } else if (c5 == 'F' || c5 == 'D') {
            this.f11131++;
            m8823();
            this.f11126 = true;
        } else if (c5 == 'e' || c5 == 'E') {
            this.f11131++;
            int i7 = this.f11127 + 1;
            this.f11127 = i7;
            char cCharAt = i7 >= i2 ? (char) 26 : str.charAt(i7);
            this.f11134 = cCharAt;
            if (cCharAt == '+' || cCharAt == '-') {
                this.f11131++;
                int i8 = this.f11127 + 1;
                this.f11127 = i8;
                this.f11134 = i8 >= i2 ? (char) 26 : str.charAt(i8);
            }
            while (true) {
                c2 = this.f11134;
                if (c2 < '0' || c2 > '9') {
                    break;
                }
                this.f11131++;
                int i9 = this.f11127 + 1;
                this.f11127 = i9;
                this.f11134 = i9 >= i2 ? (char) 26 : str.charAt(i9);
            }
            if (c2 == 'D' || c2 == 'F') {
                this.f11131++;
                m8823();
            }
            this.f11128 = true;
            this.f11126 = true;
        }
        if (this.f11126) {
            this.f11130 = 3;
        } else {
            this.f11130 = 2;
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Number m8857() {
        long j;
        boolean z;
        char c;
        int i;
        boolean z2;
        int i2;
        char c2;
        boolean z3;
        char[] cArr;
        int i3;
        int i4;
        char[] cArr2;
        char c3;
        long j2;
        long j3;
        long j4;
        long j5;
        int i5 = this.f11127;
        this.f11141 = 0;
        char c4 = this.f11134;
        int i6 = this.f11129;
        String str = this.f11132;
        if (c4 == '-') {
            this.f11141 = 1;
            int i7 = i5 + 1;
            this.f11127 = i7;
            this.f11134 = i7 >= i6 ? (char) 26 : str.charAt(i7);
            j = Long.MIN_VALUE;
            z = true;
        } else {
            j = -9223372036854775807L;
            z = false;
        }
        long j6 = 0;
        int i8 = 1;
        boolean z4 = false;
        while (true) {
            c = this.f11134;
            i = 18;
            if (c < '0' || c > '9') {
                break;
            }
            int i9 = c - '0';
            if (i8 < 18) {
                j4 = j6 * 10;
                j5 = i9;
            } else {
                if (j6 < -922337203685477580L) {
                    z4 = true;
                }
                j4 = j6 * 10;
                j5 = i9;
                if (j4 < j + j5) {
                    z4 = true;
                }
            }
            j6 = j4 - j5;
            this.f11141++;
            int i10 = this.f11127 + 1;
            this.f11127 = i10;
            this.f11134 = i10 >= i6 ? (char) 26 : str.charAt(i10);
            i8++;
        }
        Number numberValueOf = null;
        if (c == '.') {
            this.f11141++;
            int i11 = this.f11127 + 1;
            this.f11127 = i11;
            this.f11134 = i11 >= i6 ? (char) 26 : str.charAt(i11);
            i2 = 0;
            char c5 = '9';
            while (true) {
                c3 = this.f11134;
                if (c3 < '0' || c3 > c5) {
                    break;
                }
                i2++;
                int i12 = c3 - '0';
                if (i8 < i) {
                    j2 = j6 * 10;
                    j3 = i12;
                } else {
                    if (j6 < -922337203685477580L) {
                        z4 = true;
                    }
                    j2 = j6 * 10;
                    j3 = i12;
                    if (j2 < j + j3) {
                        z4 = true;
                    }
                }
                j6 = j2 - j3;
                this.f11141++;
                int i13 = this.f11127 + 1;
                this.f11127 = i13;
                this.f11134 = i13 >= i6 ? (char) 26 : str.charAt(i13);
                i8++;
                c5 = '9';
                i = 18;
            }
            if (!z) {
                j6 = -j6;
            }
            if (c3 == 'F' || c3 == 'D') {
                this.f11141++;
                m8823();
            }
            z2 = true;
        } else {
            if (!z) {
                j6 = -j6;
            }
            if (c == 'L') {
                this.f11141++;
                m8823();
                numberValueOf = Long.valueOf(j6);
            } else if (c == 'S') {
                this.f11141++;
                m8823();
                numberValueOf = Short.valueOf((short) j6);
            } else if (c == 'B') {
                this.f11141++;
                m8823();
                numberValueOf = Byte.valueOf((byte) j6);
            } else if (c == 'F') {
                this.f11141++;
                m8823();
                numberValueOf = Float.valueOf(j6);
            } else if (c == 'D') {
                this.f11141++;
                m8823();
                numberValueOf = Double.valueOf(j6);
            }
            z2 = false;
            i2 = 0;
        }
        char c6 = this.f11134;
        if (c6 == 'e' || c6 == 'E') {
            this.f11141++;
            int i14 = this.f11127 + 1;
            this.f11127 = i14;
            char cCharAt = i14 >= i6 ? (char) 26 : str.charAt(i14);
            this.f11134 = cCharAt;
            if (cCharAt == '+' || cCharAt == '-') {
                this.f11141++;
                int i15 = this.f11127 + 1;
                this.f11127 = i15;
                this.f11134 = i15 >= i6 ? (char) 26 : str.charAt(i15);
            }
            while (true) {
                c2 = this.f11134;
                if (c2 < '0' || c2 > '9') {
                    break;
                }
                this.f11141++;
                int i16 = this.f11127 + 1;
                this.f11127 = i16;
                this.f11134 = i16 >= i6 ? (char) 26 : str.charAt(i16);
            }
            if (c2 == 'D' || c2 == 'F') {
                this.f11141++;
                m8823();
            } else {
                c2 = 0;
            }
            z3 = true;
        } else {
            z3 = false;
            c2 = 0;
        }
        if (!z2 && !z3) {
            if (z4) {
                int i17 = this.f11127;
                char[] cArr3 = new char[i17 - i5];
                str.getChars(i5, i17, cArr3, 0);
                numberValueOf = new BigInteger(new String(cArr3));
            }
            if (numberValueOf != null) {
                return numberValueOf;
            }
            if (j6 > -2147483648L && j6 < 2147483647L) {
                return Integer.valueOf((int) j6);
            }
            return Long.valueOf(j6);
        }
        int i18 = this.f11127 - i5;
        if (c2 != 0) {
            i18--;
        }
        if (!z3 && (EnumC9326.UseBigDecimal.f31669 & this.f11142) != 0) {
            if (!z4) {
                return BigDecimal.valueOf(j6, i2);
            }
            char[] cArr4 = this.f11139;
            if (i18 < cArr4.length) {
                i4 = 0;
                str.getChars(i5, i5 + i18, cArr4, 0);
                cArr2 = this.f11139;
            } else {
                i4 = 0;
                char[] cArr5 = new char[i18];
                str.getChars(i5, i5 + i18, cArr5, 0);
                cArr2 = cArr5;
            }
            return new BigDecimal(cArr2, i4, i18);
        }
        char[] cArr6 = this.f11139;
        if (i18 < cArr6.length) {
            str.getChars(i5, i5 + i18, cArr6, 0);
            cArr = this.f11139;
        } else {
            char[] cArr7 = new char[i18];
            str.getChars(i5, i5 + i18, cArr7, 0);
            cArr = cArr7;
        }
        try {
            if (i18 <= 9 && !z3) {
                char c7 = cArr[0];
                if (c7 == '-' || c7 == '+') {
                    c7 = cArr[1];
                    i3 = 2;
                } else {
                    i3 = 1;
                }
                int i19 = c7 - '0';
                int i20 = 0;
                while (i3 < i18) {
                    char c8 = cArr[i3];
                    if (c8 == '.') {
                        i20 = 1;
                    } else {
                        i19 = (i19 * 10) + (c8 - '0');
                        if (i20 != 0) {
                            i20 *= 10;
                        }
                    }
                    i3++;
                }
                if (c2 == 'F') {
                    float f = i19 / i20;
                    if (z) {
                        f = -f;
                    }
                    return Float.valueOf(f);
                }
                double d = ((double) i19) / ((double) i20);
                if (z) {
                    d = -d;
                }
                return Double.valueOf(d);
            }
            String str2 = new String(cArr, 0, i18);
            if (c2 == 'F') {
                return Float.valueOf(str2);
            }
            return Double.valueOf(Double.parseDouble(str2));
        } catch (NumberFormatException e) {
            throw new C20614(e.getMessage() + ", " + m8822(), (Throwable) e);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long m8860() {
        long j;
        boolean z = false;
        this.f11141 = 0;
        char c = this.f11134;
        String str = this.f11132;
        int i = this.f11129;
        if (c == '-') {
            this.f11141 = 1;
            int i2 = this.f11127 + 1;
            this.f11127 = i2;
            if (i2 >= i) {
                throw new C20614("syntax error, " + m8822());
            }
            this.f11134 = str.charAt(i2);
            j = Long.MIN_VALUE;
            z = true;
        } else {
            j = -9223372036854775807L;
        }
        long j2 = 0;
        while (true) {
            char c2 = this.f11134;
            if (c2 < '0' || c2 > '9') {
                break;
            }
            int i3 = c2 - '0';
            if (j2 < -922337203685477580L) {
                StringBuilder sbM39970 = C17114.m39970("error long value, ", ", ", j2);
                sbM39970.append(m8822());
                throw new C20614(sbM39970.toString());
            }
            long j3 = j2 * 10;
            long j4 = i3;
            if (j3 < j + j4) {
                StringBuilder sbM39971 = C17114.m39970("error long value, ", ", ", j3);
                sbM39971.append(m8822());
                throw new C20614(sbM39971.toString());
            }
            j2 = j3 - j4;
            this.f11141++;
            int i4 = this.f11127 + 1;
            this.f11127 = i4;
            this.f11134 = i4 >= i ? (char) 26 : str.charAt(i4);
        }
        return !z ? -j2 : j2;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final long m8846() {
        boolean z;
        long j;
        long j2;
        int i = this.f11141;
        int i2 = this.f11131 + i;
        if (m8825(i) == '-') {
            i++;
            j = Long.MIN_VALUE;
            z = true;
        } else {
            z = false;
            j = -9223372036854775807L;
        }
        if (i < i2) {
            long j3 = -(m8825(i) - '0');
            i++;
            j2 = j3;
        } else {
            j2 = 0;
        }
        while (i < i2) {
            int i3 = i + 1;
            char cCharAt = i >= this.f11129 ? (char) 26 : this.f11132.charAt(i);
            if (cCharAt == 'L' || cCharAt == 'S' || cCharAt == 'B') {
                i = i3;
                break;
            }
            int i4 = cCharAt - '0';
            if (j2 < -922337203685477580L) {
                throw new NumberFormatException(m8854());
            }
            long j4 = j2 * 10;
            long j5 = i4;
            if (j4 < j + j5) {
                throw new NumberFormatException(m8854());
            }
            j2 = j4 - j5;
            i = i3;
        }
        if (!z) {
            return -j2;
        }
        if (i > this.f11141 + 1) {
            return j2;
        }
        throw new NumberFormatException(m8854());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Number m8826(boolean z) {
        char[] cArr;
        boolean z2;
        int i = (this.f11141 + this.f11131) - 1;
        int i2 = this.f11129;
        String str = this.f11132;
        char cCharAt = i >= i2 ? (char) 26 : str.charAt(i);
        try {
            if (cCharAt == 'F') {
                return Float.valueOf(Float.parseFloat(m8854()));
            }
            if (cCharAt == 'D') {
                return Double.valueOf(Double.parseDouble(m8854()));
            }
            if (z) {
                return m8844();
            }
            char cCharAt2 = str.charAt((this.f11141 + this.f11131) - 1);
            int i3 = this.f11131;
            if (cCharAt2 == 'L' || cCharAt2 == 'S' || cCharAt2 == 'B' || cCharAt2 == 'F' || cCharAt2 == 'D') {
                i3--;
            }
            int i4 = this.f11141;
            char[] cArr2 = this.f11139;
            int i5 = 0;
            if (i3 < cArr2.length) {
                str.getChars(i4, i4 + i3, cArr2, 0);
                cArr = this.f11139;
            } else {
                char[] cArr3 = new char[i3];
                str.getChars(i4, i4 + i3, cArr3, 0);
                cArr = cArr3;
            }
            if (i3 <= 9 && !this.f11128) {
                char c = cArr[0];
                int i6 = 2;
                if (c == '-') {
                    c = cArr[1];
                    z2 = true;
                } else if (c == '+') {
                    c = cArr[1];
                    z2 = false;
                } else {
                    z2 = false;
                    i6 = 1;
                }
                int i7 = c - '0';
                while (i6 < i3) {
                    char c2 = cArr[i6];
                    if (c2 == '.') {
                        i5 = 1;
                    } else {
                        i7 = (i7 * 10) + (c2 - '0');
                        if (i5 != 0) {
                            i5 *= 10;
                        }
                    }
                    i6++;
                }
                double d = ((double) i7) / ((double) i5);
                if (z2) {
                    d = -d;
                }
                return Double.valueOf(d);
            }
            return Double.valueOf(Double.parseDouble(new String(cArr, 0, i3)));
        } catch (NumberFormatException e) {
            throw new C20614(e.getMessage() + ", " + m8822());
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final BigDecimal m8844() {
        int i = (this.f11141 + this.f11131) - 1;
        String str = this.f11132;
        char cCharAt = str.charAt(i);
        int i2 = this.f11131;
        if (cCharAt == 'L' || cCharAt == 'S' || cCharAt == 'B' || cCharAt == 'F' || cCharAt == 'D') {
            i2--;
        }
        int i3 = this.f11141;
        char[] cArr = this.f11139;
        if (i2 < cArr.length) {
            str.getChars(i3, i3 + i2, cArr, 0);
            return new BigDecimal(this.f11139, 0, i2);
        }
        char[] cArr2 = new char[i2];
        str.getChars(i3, i2 + i3, cArr2, 0);
        return new BigDecimal(cArr2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m8832(long j) {
        char cCharAt = this.f11134;
        int i = this.f11127 + 1;
        int i2 = 1;
        while (true) {
            String str = this.f11132;
            int i3 = this.f11129;
            if (cCharAt == '\"' || cCharAt == '\'') {
                long j2 = -3750763034362895579L;
                for (int i4 = i; i4 < i3; i4++) {
                    char cCharAt2 = str.charAt(i4);
                    if (cCharAt2 == cCharAt) {
                        i2 += (i4 - i) + 1;
                        break;
                    }
                    j2 = (j2 ^ ((long) cCharAt2)) * 1099511628211L;
                }
                if (j2 != j) {
                    this.f11137 = -2;
                    this.f11124 = j2;
                    return false;
                }
                int i5 = i2 + 1;
                int i6 = this.f11127 + i2;
                char cCharAt3 = i6 >= i3 ? (char) 26 : str.charAt(i6);
                while (cCharAt3 != ':') {
                    if (cCharAt3 <= ' ' && (cCharAt3 == ' ' || cCharAt3 == '\n' || cCharAt3 == '\r' || cCharAt3 == '\t' || cCharAt3 == '\f' || cCharAt3 == '\b')) {
                        int i7 = i5 + 1;
                        int i8 = this.f11127 + i5;
                        cCharAt3 = i8 >= i3 ? (char) 26 : str.charAt(i8);
                        i5 = i7;
                    } else {
                        throw new C20614("match feild error expect ':'");
                    }
                }
                int i9 = this.f11127 + i5;
                char cCharAt4 = i9 >= i3 ? (char) 26 : str.charAt(i9);
                if (cCharAt4 == '{') {
                    int i10 = i9 + 1;
                    this.f11127 = i10;
                    this.f11134 = i10 < i3 ? str.charAt(i10) : (char) 26;
                    this.f11130 = 12;
                } else if (cCharAt4 == '[') {
                    int i11 = i9 + 1;
                    this.f11127 = i11;
                    this.f11134 = i11 < i3 ? str.charAt(i11) : (char) 26;
                    this.f11130 = 14;
                } else {
                    this.f11127 = i9;
                    this.f11134 = i9 < i3 ? str.charAt(i9) : (char) 26;
                    m8839();
                }
                return true;
            }
            if (cCharAt > ' ' || !(cCharAt == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t' || cCharAt == '\f' || cCharAt == '\b')) {
                break;
            }
            int i12 = i2 + 1;
            int i13 = this.f11127 + i2;
            cCharAt = i13 >= i3 ? (char) 26 : str.charAt(i13);
            i2 = i12;
        }
        this.f11124 = 0L;
        this.f11137 = -2;
        return false;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private int m8818(long j) {
        String str;
        int i;
        char cCharAt = this.f11134;
        int i2 = 1;
        while (true) {
            str = this.f11132;
            i = this.f11129;
            if (cCharAt == '\"' || cCharAt == '\'') {
                break;
            }
            if (cCharAt == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t' || cCharAt == '\f' || cCharAt == '\b') {
                int i3 = i2 + 1;
                int i4 = this.f11127 + i2;
                cCharAt = i4 >= i ? (char) 26 : str.charAt(i4);
                i2 = i3;
            } else {
                this.f11124 = 0L;
                this.f11137 = -2;
                return 0;
            }
        }
        long j2 = -3750763034362895579L;
        for (int i5 = this.f11127 + i2; i5 < i; i5++) {
            char cCharAt2 = str.charAt(i5);
            if (cCharAt2 == cCharAt) {
                i2 += (i5 - this.f11127) - i2;
                break;
            }
            j2 = (j2 ^ ((long) cCharAt2)) * 1099511628211L;
        }
        if (j2 != j) {
            this.f11124 = j2;
            this.f11137 = -2;
            return 0;
        }
        int i6 = i2 + 1;
        int i7 = this.f11127 + i6;
        char cCharAt3 = i7 >= i ? (char) 26 : str.charAt(i7);
        while (cCharAt3 != ':') {
            if (cCharAt3 <= ' ' && (cCharAt3 == ' ' || cCharAt3 == '\n' || cCharAt3 == '\r' || cCharAt3 == '\t' || cCharAt3 == '\f' || cCharAt3 == '\b')) {
                int i8 = i6 + 1;
                int i9 = this.f11127 + i6;
                cCharAt3 = i9 >= i ? (char) 26 : str.charAt(i9);
                i6 = i8;
            } else {
                throw new C20614("match feild error expect ':'");
            }
        }
        return i6 + 1;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m8838(long j) {
        int i;
        char cCharAt;
        this.f11137 = 0;
        int iM8818 = m8818(j);
        if (iM8818 == 0) {
            return 0;
        }
        int i2 = iM8818 + 1;
        int i3 = this.f11127 + iM8818;
        String str = this.f11132;
        int i4 = this.f11129;
        char cCharAt2 = i3 >= i4 ? (char) 26 : str.charAt(i3);
        boolean z = cCharAt2 == '\"';
        if (z) {
            int i5 = iM8818 + 2;
            int i6 = this.f11127 + i2;
            cCharAt2 = i6 >= i4 ? (char) 26 : str.charAt(i6);
            z = true;
            i2 = i5;
        }
        boolean z2 = cCharAt2 == '-';
        if (z2) {
            int i7 = i2 + 1;
            int i8 = this.f11127 + i2;
            cCharAt2 = i8 >= i4 ? (char) 26 : str.charAt(i8);
            i2 = i7;
        }
        if (cCharAt2 < '0' || cCharAt2 > '9') {
            this.f11137 = -1;
            return 0;
        }
        int i9 = cCharAt2 - '0';
        while (true) {
            i = i2 + 1;
            int i10 = this.f11127 + i2;
            cCharAt = i10 >= i4 ? (char) 26 : str.charAt(i10);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            i9 = (i9 * 10) + (cCharAt - '0');
            i2 = i;
        }
        if (cCharAt == '.') {
            this.f11137 = -1;
            return 0;
        }
        if (cCharAt == '\"') {
            if (!z) {
                this.f11137 = -1;
                return 0;
            }
            int i11 = i2 + 2;
            int i12 = this.f11127 + i;
            cCharAt = i12 >= i4 ? (char) 26 : str.charAt(i12);
            i = i11;
        }
        if (i9 < 0) {
            this.f11137 = -1;
            return 0;
        }
        while (cCharAt != ',') {
            if (cCharAt > ' ' || !(cCharAt == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t' || cCharAt == '\f' || cCharAt == '\b')) {
                if (cCharAt == '}') {
                    char cM8825 = m8825(this.f11127 + i);
                    if (cM8825 == ',') {
                        this.f11130 = 16;
                        int i13 = this.f11127 + i + 1;
                        this.f11127 = i13;
                        this.f11134 = i13 < i4 ? str.charAt(i13) : (char) 26;
                    } else if (cM8825 == ']') {
                        this.f11130 = 15;
                        int i14 = this.f11127 + i + 1;
                        this.f11127 = i14;
                        this.f11134 = i14 < i4 ? str.charAt(i14) : (char) 26;
                    } else if (cM8825 == '}') {
                        this.f11130 = 13;
                        int i15 = this.f11127 + i + 1;
                        this.f11127 = i15;
                        this.f11134 = i15 < i4 ? str.charAt(i15) : (char) 26;
                    } else if (cM8825 == 26) {
                        this.f11130 = 20;
                        this.f11127 += i;
                        this.f11134 = (char) 26;
                    } else {
                        this.f11137 = -1;
                        return 0;
                    }
                    this.f11137 = 4;
                    if (z2) {
                        return -i9;
                    }
                    return i9;
                }
                this.f11137 = -1;
                return 0;
            }
            int i16 = i + 1;
            int i17 = this.f11127 + i;
            cCharAt = i17 >= i4 ? (char) 26 : str.charAt(i17);
            i = i16;
        }
        int i18 = (i - 1) + this.f11127 + 1;
        this.f11127 = i18;
        this.f11134 = i18 < i4 ? str.charAt(i18) : (char) 26;
        this.f11137 = 3;
        this.f11130 = 16;
        if (z2) {
            return -i9;
        }
        return i9;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int[] m8865(long j) {
        int i;
        boolean z;
        int i2;
        char cCharAt;
        char cCharAt2;
        int i3;
        int i4;
        int[] iArr;
        this.f11137 = 0;
        int iM8818 = m8818(j);
        int[] iArr2 = null;
        if (iM8818 == 0) {
            return null;
        }
        int i5 = iM8818 + 1;
        int i6 = this.f11127 + iM8818;
        String str = this.f11132;
        int i7 = this.f11129;
        if ((i6 >= i7 ? (char) 26 : str.charAt(i6)) != '[') {
            this.f11137 = -1;
            return null;
        }
        int i8 = iM8818 + 2;
        int i9 = this.f11127 + i5;
        char cCharAt3 = i9 >= i7 ? (char) 26 : str.charAt(i9);
        int[] iArr3 = new int[16];
        if (cCharAt3 == ']') {
            i3 = iM8818 + 3;
            int i10 = this.f11127 + i8;
            cCharAt2 = i10 >= i7 ? (char) 26 : str.charAt(i10);
            i4 = 0;
        } else {
            int i11 = 0;
            while (true) {
                if (cCharAt3 == '-') {
                    i = i8 + 1;
                    int i12 = this.f11127 + i8;
                    cCharAt3 = i12 >= i7 ? (char) 26 : str.charAt(i12);
                    z = true;
                } else {
                    i = i8;
                    z = false;
                }
                if (cCharAt3 >= '0' && cCharAt3 <= '9') {
                    int i13 = cCharAt3 - '0';
                    while (true) {
                        i2 = i + 1;
                        int i14 = this.f11127 + i;
                        cCharAt = i14 >= i7 ? (char) 26 : str.charAt(i14);
                        if (cCharAt < '0' || cCharAt > '9') {
                            break;
                        }
                        i13 = (i13 * 10) + (cCharAt - '0');
                        i = i2;
                    }
                    if (i11 >= iArr3.length) {
                        int[] iArr4 = new int[(iArr3.length * 3) / 2];
                        System.arraycopy(iArr3, 0, iArr4, 0, i11);
                        iArr3 = iArr4;
                    }
                    int i15 = i11 + 1;
                    if (z) {
                        i13 = -i13;
                    }
                    iArr3[i11] = i13;
                    if (cCharAt == ',') {
                        int i16 = i + 2;
                        int i17 = this.f11127 + i2;
                        cCharAt3 = i17 >= i7 ? (char) 26 : str.charAt(i17);
                        i8 = i16;
                        iArr = null;
                    } else {
                        if (cCharAt == ']') {
                            int i18 = i + 2;
                            int i19 = this.f11127 + i2;
                            cCharAt2 = i19 >= i7 ? (char) 26 : str.charAt(i19);
                            i3 = i18;
                            i4 = i15;
                            break;
                        }
                        iArr = null;
                        cCharAt3 = cCharAt;
                        i8 = i2;
                    }
                    iArr2 = iArr;
                    i11 = i15;
                } else {
                    int[] iArr5 = iArr2;
                    this.f11137 = -1;
                    return iArr5;
                }
            }
        }
        if (i4 != iArr3.length) {
            int[] iArr6 = new int[i4];
            System.arraycopy(iArr3, 0, iArr6, 0, i4);
            iArr3 = iArr6;
        }
        if (cCharAt2 == ',') {
            this.f11127 = (i3 - 1) + this.f11127;
            m8823();
            this.f11137 = 3;
            this.f11130 = 16;
            return iArr3;
        }
        if (cCharAt2 == '}') {
            char cM8825 = m8825(this.f11127 + i3);
            if (cM8825 == ',') {
                this.f11130 = 16;
                this.f11127 += i3;
                m8823();
            } else if (cM8825 == ']') {
                this.f11130 = 15;
                this.f11127 += i3;
                m8823();
            } else if (cM8825 == '}') {
                this.f11130 = 13;
                this.f11127 += i3;
                m8823();
            } else if (cM8825 == 26) {
                this.f11127 += i3;
                this.f11130 = 20;
                this.f11134 = (char) 26;
            } else {
                this.f11137 = -1;
                return null;
            }
            this.f11137 = 4;
            return iArr3;
        }
        this.f11137 = -1;
        return null;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final long m8853(long j) {
        int i;
        char cCharAt;
        this.f11137 = 0;
        int iM8818 = m8818(j);
        if (iM8818 == 0) {
            return 0L;
        }
        int i2 = iM8818 + 1;
        int i3 = this.f11127 + iM8818;
        String str = this.f11132;
        int i4 = this.f11129;
        char cCharAt2 = i3 >= i4 ? (char) 26 : str.charAt(i3);
        boolean z = cCharAt2 == '\"';
        if (z) {
            int i5 = iM8818 + 2;
            int i6 = this.f11127 + i2;
            cCharAt2 = i6 >= i4 ? (char) 26 : str.charAt(i6);
            i2 = i5;
        }
        boolean z2 = cCharAt2 == '-';
        if (z2) {
            int i7 = i2 + 1;
            int i8 = this.f11127 + i2;
            i2 = i7;
            cCharAt2 = i8 >= i4 ? (char) 26 : str.charAt(i8);
        }
        if (cCharAt2 < '0' || cCharAt2 > '9') {
            this.f11137 = -1;
            return 0L;
        }
        long j2 = cCharAt2 - '0';
        while (true) {
            i = i2 + 1;
            int i9 = this.f11127 + i2;
            cCharAt = i9 >= i4 ? (char) 26 : str.charAt(i9);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            j2 = (j2 * 10) + ((long) (cCharAt - '0'));
            i2 = i;
        }
        if (cCharAt == '.') {
            this.f11137 = -1;
            return 0L;
        }
        if (cCharAt == '\"') {
            if (!z) {
                this.f11137 = -1;
                return 0L;
            }
            int i10 = i2 + 2;
            int i11 = this.f11127 + i;
            cCharAt = i11 >= i4 ? (char) 26 : str.charAt(i11);
            i = i10;
        }
        if (j2 < 0) {
            this.f11137 = -1;
            return 0L;
        }
        if (cCharAt == ',') {
            int i12 = (i - 1) + this.f11127 + 1;
            this.f11127 = i12;
            this.f11134 = i12 < i4 ? str.charAt(i12) : (char) 26;
            this.f11137 = 3;
            this.f11130 = 16;
            if (z2) {
                return -j2;
            }
        } else if (cCharAt == '}') {
            char cM8825 = m8825(this.f11127 + i);
            if (cM8825 == ',') {
                this.f11130 = 16;
                int i13 = this.f11127 + i + 1;
                this.f11127 = i13;
                this.f11134 = i13 < i4 ? str.charAt(i13) : (char) 26;
            } else if (cM8825 == ']') {
                this.f11130 = 15;
                int i14 = this.f11127 + i + 1;
                this.f11127 = i14;
                this.f11134 = i14 < i4 ? str.charAt(i14) : (char) 26;
            } else if (cM8825 == '}') {
                this.f11130 = 13;
                int i15 = this.f11127 + i + 1;
                this.f11127 = i15;
                this.f11134 = i15 < i4 ? str.charAt(i15) : (char) 26;
            } else if (cM8825 == 26) {
                this.f11130 = 20;
                this.f11127 += i;
                this.f11134 = (char) 26;
            } else {
                this.f11137 = -1;
                return 0L;
            }
            this.f11137 = 4;
            if (z2) {
                return -j2;
            }
        } else {
            this.f11137 = -1;
            return 0L;
        }
        return j2;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m8861(long j) {
        String str;
        this.f11137 = 0;
        int iM8818 = m8818(j);
        if (iM8818 == 0) {
            return null;
        }
        int i = iM8818 + 1;
        int i2 = this.f11127 + iM8818;
        int i3 = this.f11129;
        if (i2 >= i3) {
            throw new C20614("unclosed str, " + m8822());
        }
        String str2 = this.f11132;
        char cCharAt = str2.charAt(i2);
        String str3 = this.f11140;
        if (cCharAt != '\"') {
            this.f11137 = -1;
            return str3;
        }
        int i4 = this.f11127 + i;
        int iIndexOf = str2.indexOf(34, i4);
        if (iIndexOf == -1) {
            throw new C20614("unclosed str, " + m8822());
        }
        if (f11122) {
            str = str2.substring(i4, iIndexOf);
        } else {
            int i5 = iIndexOf - i4;
            str = new String(m8835(this.f11127 + i, i5), 0, i5);
        }
        if (str.indexOf(92) != -1) {
            boolean z = false;
            while (true) {
                int i6 = iIndexOf - 1;
                int i7 = 0;
                while (i6 >= 0 && str2.charAt(i6) == '\\') {
                    i7++;
                    i6--;
                    z = true;
                }
                if (i7 % 2 == 0) {
                    break;
                }
                iIndexOf = str2.indexOf(34, iIndexOf + 1);
            }
            int i8 = iIndexOf - i4;
            char[] cArrM8835 = m8835(this.f11127 + i, i8);
            if (z) {
                str = m8811(cArrM8835, i8);
            } else {
                str = new String(cArrM8835, 0, i8);
                if (str.indexOf(92) != -1) {
                    str = m8811(cArrM8835, i8);
                }
            }
        }
        int i9 = iIndexOf + 1;
        char cCharAt2 = i9 >= i3 ? (char) 26 : str2.charAt(i9);
        if (cCharAt2 == ',') {
            int i10 = iIndexOf + 2;
            this.f11127 = i10;
            this.f11134 = i10 < i3 ? str2.charAt(i10) : (char) 26;
            this.f11137 = 3;
            this.f11130 = 16;
            return str;
        }
        if (cCharAt2 == '}') {
            int i11 = iIndexOf + 2;
            char cCharAt3 = i11 >= i3 ? (char) 26 : str2.charAt(i11);
            if (cCharAt3 == ',') {
                this.f11130 = 16;
                this.f11127 = i11;
                m8823();
            } else if (cCharAt3 == ']') {
                this.f11130 = 15;
                this.f11127 = i11;
                m8823();
            } else if (cCharAt3 == '}') {
                this.f11130 = 13;
                this.f11127 = i11;
                m8823();
            } else if (cCharAt3 == 26) {
                this.f11130 = 20;
                this.f11127 = i11;
                this.f11134 = (char) 26;
            } else {
                this.f11137 = -1;
                return str3;
            }
            this.f11137 = 4;
            return str;
        }
        this.f11137 = -1;
        return str3;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Date m8845(long j) {
        int i;
        char cCharAt;
        char cCharAt2;
        int i2;
        Date date;
        this.f11137 = 0;
        int iM8818 = m8818(j);
        if (iM8818 == 0) {
            return null;
        }
        int i3 = this.f11127;
        char c = this.f11134;
        int i4 = iM8818 + 1;
        int i5 = i3 + iM8818;
        int i6 = this.f11129;
        String str = this.f11132;
        char cCharAt3 = i5 >= i6 ? (char) 26 : str.charAt(i5);
        if (cCharAt3 == '\"') {
            int i7 = this.f11127;
            int i8 = i7 + i4;
            int i9 = iM8818 + 2;
            int i10 = i7 + i4;
            if (i10 < i6) {
                str.charAt(i10);
            }
            int iIndexOf = str.indexOf(34, this.f11127 + i9);
            if (iIndexOf == -1) {
                throw new C20614("unclosed str");
            }
            int i11 = iIndexOf - i8;
            this.f11127 = i8;
            if (m8831(i11, false)) {
                date = this.f11136.getTime();
                int i12 = i9 + i11;
                i2 = i12 + 1;
                cCharAt2 = m8825(i12 + i3);
                this.f11127 = i3;
            } else {
                this.f11127 = i3;
                this.f11137 = -1;
                return null;
            }
        } else {
            if (cCharAt3 < '0' || cCharAt3 > '9') {
                this.f11137 = -1;
                return null;
            }
            long j2 = cCharAt3 - '0';
            while (true) {
                i = i4 + 1;
                int i13 = this.f11127 + i4;
                cCharAt = i13 >= i6 ? (char) 26 : str.charAt(i13);
                if (cCharAt < '0' || cCharAt > '9') {
                    break;
                }
                j2 = (j2 * 10) + ((long) (cCharAt - '0'));
                i4 = i;
            }
            if (cCharAt == '.') {
                this.f11137 = -1;
                return null;
            }
            if (cCharAt == '\"') {
                i2 = i4 + 2;
                int i14 = this.f11127 + i;
                cCharAt2 = i14 >= i6 ? (char) 26 : str.charAt(i14);
            } else {
                cCharAt2 = cCharAt;
                i2 = i;
            }
            if (j2 < 0) {
                this.f11137 = -1;
                return null;
            }
            date = new Date(j2);
        }
        if (cCharAt2 == ',') {
            int i15 = (i2 - 1) + this.f11127 + 1;
            this.f11127 = i15;
            this.f11134 = i15 < i6 ? str.charAt(i15) : (char) 26;
            this.f11137 = 3;
            this.f11130 = 16;
            return date;
        }
        if (cCharAt2 == '}') {
            char cM8825 = m8825(this.f11127 + i2);
            if (cM8825 == ',') {
                this.f11130 = 16;
                int i16 = this.f11127 + i2 + 1;
                this.f11127 = i16;
                this.f11134 = i16 < i6 ? str.charAt(i16) : (char) 26;
            } else if (cM8825 == ']') {
                this.f11130 = 15;
                int i17 = this.f11127 + i2 + 1;
                this.f11127 = i17;
                this.f11134 = i17 < i6 ? str.charAt(i17) : (char) 26;
            } else if (cM8825 == '}') {
                this.f11130 = 13;
                int i18 = this.f11127 + i2 + 1;
                this.f11127 = i18;
                this.f11134 = i18 < i6 ? str.charAt(i18) : (char) 26;
            } else if (cM8825 == 26) {
                this.f11130 = 20;
                this.f11127 += i2;
                this.f11134 = (char) 26;
            } else {
                this.f11127 = i3;
                this.f11134 = c;
                this.f11137 = -1;
                return null;
            }
            this.f11137 = 4;
            return date;
        }
        this.f11127 = i3;
        this.f11134 = c;
        this.f11137 = -1;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0088  */
    /* JADX WARN: Code duplicated, block: B:34:0x008b  */
    /* JADX WARN: Code duplicated, block: B:62:0x00db  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:74:0x0109  */
    /* JADX WARN: Code duplicated, block: B:76:0x0110 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x0112  */
    /* JADX WARN: Code duplicated, block: B:80:0x011e  */
    /* JADX WARN: Code duplicated, block: B:82:0x0125 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x0127  */
    /* JADX WARN: Code duplicated, block: B:86:0x0135  */
    /* JADX WARN: Code duplicated, block: B:88:0x0138  */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m8851(long j) {
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        char cCharAt;
        char cM8825;
        this.f11137 = 0;
        int iM8818 = m8818(j);
        if (iM8818 == 0) {
            return false;
        }
        int i5 = this.f11127 + iM8818;
        String str = this.f11132;
        if (!str.startsWith("false", i5)) {
            if (str.startsWith("true", this.f11127 + iM8818)) {
                i = iM8818 + 4;
            } else if (str.startsWith("\"false\"", this.f11127 + iM8818)) {
                i = iM8818 + 7;
            } else if (str.startsWith("\"true\"", this.f11127 + iM8818)) {
                i = iM8818 + 6;
            } else if (str.charAt(this.f11127 + iM8818) == '1') {
                i = iM8818 + 1;
            } else if (str.charAt(this.f11127 + iM8818) == '0') {
                i = iM8818 + 1;
            } else if (str.startsWith("\"1\"", this.f11127 + iM8818)) {
                i = iM8818 + 3;
            } else {
                if (!str.startsWith("\"0\"", this.f11127 + iM8818)) {
                    this.f11137 = -1;
                    return false;
                }
                i = iM8818 + 3;
            }
            z = true;
            i2 = i + 1;
            i3 = this.f11127 + i;
            i4 = this.f11129;
            if (i3 >= i4) {
                cCharAt = 26;
            } else {
                cCharAt = str.charAt(i3);
            }
            while (cCharAt != ',') {
                if (cCharAt != '}' || (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t' && cCharAt != '\f' && cCharAt != '\b')) {
                    break;
                    if (cCharAt == '}') {
                        cM8825 = m8825(this.f11127 + i2);
                        if (cM8825 == ',') {
                            this.f11130 = 16;
                            int i6 = this.f11127 + i2 + 1;
                            this.f11127 = i6;
                            this.f11134 = i6 < i4 ? str.charAt(i6) : (char) 26;
                        } else if (cM8825 == ']') {
                            this.f11130 = 15;
                            int i7 = this.f11127 + i2 + 1;
                            this.f11127 = i7;
                            this.f11134 = i7 < i4 ? str.charAt(i7) : (char) 26;
                        } else if (cM8825 == '}') {
                            this.f11130 = 13;
                            int i8 = this.f11127 + i2 + 1;
                            this.f11127 = i8;
                            this.f11134 = i8 < i4 ? str.charAt(i8) : (char) 26;
                        } else if (cM8825 == 26) {
                            this.f11130 = 20;
                            this.f11127 += i2;
                            this.f11134 = (char) 26;
                        } else {
                            this.f11137 = -1;
                            return false;
                        }
                        this.f11137 = 4;
                        return z;
                    }
                    this.f11137 = -1;
                    return false;
                }
                int i9 = i2 + 1;
                int i10 = this.f11127 + i2;
                cCharAt = i10 >= i4 ? (char) 26 : str.charAt(i10);
                i2 = i9;
            }
            int i11 = (i2 - 1) + this.f11127 + 1;
            this.f11127 = i11;
            this.f11134 = i11 < i4 ? str.charAt(i11) : (char) 26;
            this.f11137 = 3;
            this.f11130 = 16;
            return z;
        }
        i = iM8818 + 5;
        z = false;
        i2 = i + 1;
        i3 = this.f11127 + i;
        i4 = this.f11129;
        if (i3 >= i4) {
            cCharAt = 26;
        } else {
            cCharAt = str.charAt(i3);
        }
        while (true) {
            if (cCharAt != '}') {
                break;
            }
            i2 = i9;
        }
        if (cCharAt == '}') {
            cM8825 = m8825(this.f11127 + i2);
            if (cM8825 == ',') {
                this.f11130 = 16;
                int i12 = this.f11127 + i2 + 1;
                this.f11127 = i12;
                this.f11134 = i12 < i4 ? str.charAt(i12) : (char) 26;
            } else if (cM8825 == ']') {
                this.f11130 = 15;
                int i13 = this.f11127 + i2 + 1;
                this.f11127 = i13;
                this.f11134 = i13 < i4 ? str.charAt(i13) : (char) 26;
            } else if (cM8825 == '}') {
                this.f11130 = 13;
                int i14 = this.f11127 + i2 + 1;
                this.f11127 = i14;
                this.f11134 = i14 < i4 ? str.charAt(i14) : (char) 26;
            } else if (cM8825 == 26) {
                this.f11130 = 20;
                this.f11127 += i2;
                this.f11134 = (char) 26;
            } else {
                this.f11137 = -1;
                return false;
            }
            this.f11137 = 4;
            return z;
        }
        this.f11137 = -1;
        return false;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final float m8819(long j) {
        int i;
        char cM8825;
        int i2;
        float f;
        float f2;
        this.f11137 = 0;
        int iM8818 = m8818(j);
        if (iM8818 == 0) {
            return 0.0f;
        }
        int i3 = iM8818 + 1;
        char cM8826 = m8825(this.f11127 + iM8818);
        int i4 = this.f11127;
        int i5 = (i4 + i3) - 1;
        boolean z = cM8826 == '-';
        if (z) {
            cM8826 = m8825(i4 + i3);
            i3 = iM8818 + 2;
        }
        if (cM8826 >= '0' && cM8826 <= '9') {
            int i6 = cM8826 - '0';
            while (true) {
                i = i3 + 1;
                cM8825 = m8825(this.f11127 + i3);
                if (cM8825 < '0' || cM8825 > '9') {
                    break;
                }
                i6 = (i6 * 10) + (cM8825 - '0');
                i3 = i;
            }
            if (cM8825 == '.') {
                int i7 = i3 + 2;
                char cM8827 = m8825(this.f11127 + i);
                if (cM8827 < '0' || cM8827 > '9') {
                    this.f11137 = -1;
                    return 0.0f;
                }
                i2 = 10;
                i6 = (cM8827 - '0') + (i6 * 10);
                while (true) {
                    i = i7 + 1;
                    cM8825 = m8825(this.f11127 + i7);
                    if (cM8825 < '0' || cM8825 > '9') {
                        break;
                    }
                    i6 = (i6 * 10) + (cM8825 - '0');
                    i2 *= 10;
                    i7 = i;
                }
            } else {
                i2 = 1;
            }
            boolean z2 = cM8825 == 'e' || cM8825 == 'E';
            if (z2) {
                int i8 = i + 1;
                char cM8828 = m8825(this.f11127 + i);
                f = 0.0f;
                if (cM8828 == '+' || cM8828 == '-') {
                    i += 2;
                    cM8828 = m8825(this.f11127 + i8);
                } else {
                    i = i8;
                }
                cM8825 = cM8828;
                while (cM8825 >= '0' && cM8825 <= '9') {
                    cM8825 = m8825(this.f11127 + i);
                    i++;
                }
            } else {
                f = 0.0f;
            }
            int i9 = ((this.f11127 + i) - i5) - 1;
            if (z2 || i9 >= 10) {
                f2 = Float.parseFloat(m8815(i5, i9));
            } else {
                f2 = i6 / i2;
                if (z) {
                    f2 = -f2;
                }
            }
            if (cM8825 == ',') {
                this.f11127 = (i - 1) + this.f11127;
                m8823();
                this.f11137 = 3;
                this.f11130 = 16;
                return f2;
            }
            if (cM8825 == '}') {
                char cM8829 = m8825(this.f11127 + i);
                if (cM8829 == ',') {
                    this.f11130 = 16;
                    this.f11127 += i;
                    m8823();
                } else if (cM8829 == ']') {
                    this.f11130 = 15;
                    this.f11127 += i;
                    m8823();
                } else if (cM8829 == '}') {
                    this.f11130 = 13;
                    this.f11127 += i;
                    m8823();
                } else if (cM8829 == 26) {
                    this.f11127 += i;
                    this.f11130 = 20;
                    this.f11134 = (char) 26;
                } else {
                    this.f11137 = -1;
                    return f;
                }
                this.f11137 = 4;
                return f2;
            }
            this.f11137 = -1;
            return f;
        }
        this.f11137 = -1;
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final float[] m8847(long j) {
        int i;
        char cCharAt;
        int i2;
        int i3;
        float f;
        char c;
        this.f11137 = 0;
        int iM8818 = m8818(j);
        if (iM8818 == 0) {
            return null;
        }
        int i4 = iM8818 + 1;
        int i5 = this.f11127 + iM8818;
        String str = this.f11132;
        int i6 = this.f11129;
        int i7 = -1;
        if ((i5 >= i6 ? (char) 26 : str.charAt(i5)) != '[') {
            this.f11137 = -1;
            return null;
        }
        int i8 = iM8818 + 2;
        int i9 = this.f11127 + i4;
        char cCharAt2 = i9 >= i6 ? (char) 26 : str.charAt(i9);
        float[] fArr = new float[16];
        int i10 = 0;
        while (true) {
            int i11 = this.f11127;
            int i12 = (i11 + i8) - 1;
            boolean z = cCharAt2 == '-';
            if (z) {
                int i13 = i8 + 1;
                int i14 = i11 + i8;
                cCharAt2 = i14 >= i6 ? (char) 26 : str.charAt(i14);
                i8 = i13;
            }
            if (cCharAt2 < '0' || cCharAt2 > '9') {
                break;
            }
            int i15 = cCharAt2 - '0';
            while (true) {
                i = i8 + 1;
                int i16 = this.f11127 + i8;
                cCharAt = i16 >= i6 ? (char) 26 : str.charAt(i16);
                if (cCharAt < '0' || cCharAt > '9') {
                    break;
                }
                i15 = (i15 * 10) + (cCharAt - '0');
                i8 = i;
            }
            if (cCharAt == '.') {
                int i17 = i8 + 2;
                int i18 = this.f11127 + i;
                char cCharAt3 = i18 >= i6 ? (char) 26 : str.charAt(i18);
                if (cCharAt3 < '0' || cCharAt3 > '9') {
                    this.f11137 = i7;
                    return null;
                }
                i15 = (cCharAt3 - '0') + (i15 * 10);
                i2 = 10;
                while (true) {
                    i = i17 + 1;
                    int i19 = this.f11127 + i17;
                    cCharAt = i19 >= i6 ? (char) 26 : str.charAt(i19);
                    if (cCharAt < '0' || cCharAt > '9') {
                        break;
                    }
                    i15 = (i15 * 10) + (cCharAt - '0');
                    i2 *= 10;
                    i17 = i;
                }
            } else {
                i2 = 1;
            }
            boolean z2 = cCharAt == 'e' || cCharAt == 'E';
            if (z2) {
                int i20 = i + 1;
                int i21 = this.f11127 + i;
                cCharAt = i21 >= i6 ? (char) 26 : str.charAt(i21);
                if (cCharAt == '+' || cCharAt == '-') {
                    i += 2;
                    int i22 = this.f11127 + i20;
                    cCharAt = i22 >= i6 ? (char) 26 : str.charAt(i22);
                    c = '9';
                    z2 = z2;
                } else {
                    i = i20;
                    c = '9';
                }
                while (cCharAt >= '0' && cCharAt <= c) {
                    int i23 = i + 1;
                    int i24 = this.f11127 + i;
                    i = i23;
                    cCharAt = i24 >= i6 ? (char) 26 : str.charAt(i24);
                    c = c;
                    z2 = z2;
                }
                i3 = 10;
            } else {
                i3 = 10;
            }
            int i25 = ((this.f11127 + i) - i12) - 1;
            if (z2 || i25 >= i3) {
                f = Float.parseFloat(m8815(i12, i25));
            } else {
                f = i15 / i2;
                if (z) {
                    f = -f;
                }
            }
            if (i10 >= fArr.length) {
                float[] fArr2 = new float[(fArr.length * 3) / 2];
                System.arraycopy(fArr, 0, fArr2, 0, i10);
                fArr = fArr2;
            }
            int i26 = i10 + 1;
            fArr[i10] = f;
            if (cCharAt == ',') {
                int i27 = i + 1;
                int i28 = this.f11127 + i;
                cCharAt = i28 >= i6 ? (char) 26 : str.charAt(i28);
                i8 = i27;
            } else {
                if (cCharAt == ']') {
                    int i29 = i + 1;
                    int i30 = this.f11127 + i;
                    char cCharAt4 = i30 >= i6 ? (char) 26 : str.charAt(i30);
                    if (i26 != fArr.length) {
                        float[] fArr3 = new float[i26];
                        System.arraycopy(fArr, 0, fArr3, 0, i26);
                        fArr = fArr3;
                    }
                    if (cCharAt4 == ',') {
                        this.f11127 += i;
                        m8823();
                        this.f11137 = 3;
                        this.f11130 = 16;
                        return fArr;
                    }
                    if (cCharAt4 == '}') {
                        int i31 = this.f11127 + i29;
                        char cCharAt5 = i31 >= i6 ? (char) 26 : str.charAt(i31);
                        if (cCharAt5 == ',') {
                            this.f11130 = 16;
                            this.f11127 = i + 1 + this.f11127;
                            m8823();
                        } else if (cCharAt5 == ']') {
                            this.f11130 = 15;
                            this.f11127 = i + 1 + this.f11127;
                            m8823();
                        } else if (cCharAt5 == '}') {
                            this.f11130 = 13;
                            this.f11127 = i + 1 + this.f11127;
                            m8823();
                        } else if (cCharAt5 == 26) {
                            this.f11127 = i + 1 + this.f11127;
                            this.f11130 = 20;
                            this.f11134 = (char) 26;
                        } else {
                            this.f11137 = -1;
                            return null;
                        }
                        this.f11137 = 4;
                        return fArr;
                    }
                    this.f11137 = -1;
                    return null;
                }
                i8 = i;
            }
            i7 = -1;
            i10 = i26;
            cCharAt2 = cCharAt;
        }
        this.f11137 = -1;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:96:0x0123  */
    /* JADX WARN: Code duplicated, block: B:97:0x0126  */
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final float[][] m8824(long j) {
        int i;
        char cCharAt;
        int i2;
        float f;
        int i3;
        int i4;
        char cCharAt2;
        this.f11137 = 0;
        int iM8818 = m8818(j);
        if (iM8818 == 0) {
            return null;
        }
        int i5 = iM8818 + 1;
        int i6 = this.f11127 + iM8818;
        String str = this.f11132;
        int i7 = this.f11129;
        char c = '[';
        int i8 = -1;
        if ((i6 >= i7 ? (char) 26 : str.charAt(i6)) != '[') {
            this.f11137 = -1;
            return null;
        }
        int i9 = iM8818 + 2;
        int i10 = this.f11127 + i5;
        char cCharAt3 = i10 >= i7 ? (char) 26 : str.charAt(i10);
        int i11 = 16;
        float[][] fArr = new float[16][];
        int i12 = 0;
        loop0: while (true) {
            if (cCharAt3 == c) {
                int i13 = i9 + 1;
                int i14 = this.f11127 + i9;
                char cCharAt4 = i14 >= i7 ? (char) 26 : str.charAt(i14);
                float[] fArr2 = new float[i11];
                int i15 = 0;
                while (true) {
                    int i16 = this.f11127;
                    int i17 = (i16 + i13) - 1;
                    boolean z = cCharAt4 == '-';
                    if (z) {
                        int i18 = i16 + i13;
                        i13++;
                        cCharAt4 = i18 >= i7 ? (char) 26 : str.charAt(i18);
                    }
                    if (cCharAt4 < '0' || cCharAt4 > '9') {
                        break loop0;
                    }
                    int i19 = cCharAt4 - '0';
                    while (true) {
                        i = i13 + 1;
                        int i20 = this.f11127 + i13;
                        cCharAt = i20 >= i7 ? (char) 26 : str.charAt(i20);
                        if (cCharAt < '0' || cCharAt > '9') {
                            break;
                        }
                        i19 = (i19 * 10) + (cCharAt - '0');
                        i13 = i;
                    }
                    if (cCharAt == '.') {
                        int i21 = i13 + 2;
                        int i22 = this.f11127 + i;
                        char cCharAt5 = i22 >= i7 ? (char) 26 : str.charAt(i22);
                        if (cCharAt5 < '0' || cCharAt5 > '9') {
                            this.f11137 = i8;
                            return null;
                        }
                        i19 = (cCharAt5 - '0') + (i19 * 10);
                        i2 = 10;
                        while (true) {
                            i = i21 + 1;
                            int i23 = this.f11127 + i21;
                            cCharAt = i23 >= i7 ? (char) 26 : str.charAt(i23);
                            if (cCharAt < '0' || cCharAt > '9') {
                                break;
                            }
                            i19 = (i19 * 10) + (cCharAt - '0');
                            i2 *= 10;
                            i21 = i;
                        }
                    } else {
                        i2 = 1;
                    }
                    boolean z2 = cCharAt == 'e' || cCharAt == 'E';
                    if (z2) {
                        int i24 = i + 1;
                        int i25 = this.f11127 + i;
                        char cCharAt6 = i25 >= i7 ? (char) 26 : str.charAt(i25);
                        if (cCharAt6 == '+' || cCharAt6 == '-') {
                            i += 2;
                            int i26 = this.f11127 + i24;
                            if (i26 >= i7) {
                                cCharAt = 26;
                            } else {
                                cCharAt6 = str.charAt(i26);
                            }
                            while (cCharAt >= '0' && cCharAt <= '9') {
                                int i27 = i + 1;
                                i4 = this.f11127 + i;
                                if (i4 >= i7) {
                                    cCharAt2 = 26;
                                } else {
                                    cCharAt2 = str.charAt(i4);
                                }
                                i = i27;
                                cCharAt = cCharAt2;
                            }
                        } else {
                            i = i24;
                        }
                        cCharAt = cCharAt6;
                        while (cCharAt >= '0') {
                            int i28 = i + 1;
                            i4 = this.f11127 + i;
                            if (i4 >= i7) {
                                cCharAt2 = 26;
                            } else {
                                cCharAt2 = str.charAt(i4);
                            }
                            i = i28;
                            cCharAt = cCharAt2;
                        }
                    }
                    int i29 = ((this.f11127 + i) - i17) - 1;
                    if (z2 || i29 >= 10) {
                        f = Float.parseFloat(m8815(i17, i29));
                    } else {
                        f = i19 / i2;
                        if (z) {
                            f = -f;
                        }
                    }
                    if (i15 >= fArr2.length) {
                        float[] fArr3 = new float[(fArr2.length * 3) / 2];
                        System.arraycopy(fArr2, 0, fArr3, 0, i15);
                        fArr2 = fArr3;
                    }
                    int i30 = i15 + 1;
                    fArr2[i15] = f;
                    if (cCharAt == ',') {
                        int i31 = i + 1;
                        int i32 = this.f11127 + i;
                        cCharAt4 = i32 >= i7 ? (char) 26 : str.charAt(i32);
                        i13 = i31;
                    } else {
                        if (cCharAt == ']') {
                            int i33 = i + 1;
                            int i34 = this.f11127 + i;
                            char cCharAt7 = i34 >= i7 ? (char) 26 : str.charAt(i34);
                            if (i30 != fArr2.length) {
                                float[] fArr4 = new float[i30];
                                i3 = 0;
                                System.arraycopy(fArr2, 0, fArr4, 0, i30);
                                fArr2 = fArr4;
                            } else {
                                i3 = 0;
                            }
                            if (i12 >= fArr.length) {
                                fArr = new float[(fArr.length * 3) / 2][];
                                System.arraycopy(fArr2, i3, fArr, i3, i30);
                            }
                            int i35 = i12 + 1;
                            fArr[i12] = fArr2;
                            if (cCharAt7 == ',') {
                                int i36 = i + 2;
                                int i37 = this.f11127 + i33;
                                cCharAt3 = i37 >= i7 ? (char) 26 : str.charAt(i37);
                                i9 = i36;
                            } else {
                                if (cCharAt7 == ']') {
                                    int i38 = i + 2;
                                    int i39 = this.f11127 + i33;
                                    char cCharAt8 = i39 >= i7 ? (char) 26 : str.charAt(i39);
                                    if (i35 != fArr.length) {
                                        float[][] fArr5 = new float[i35][];
                                        System.arraycopy(fArr, 0, fArr5, 0, i35);
                                        fArr = fArr5;
                                    }
                                    if (cCharAt8 == ',') {
                                        this.f11127 = i + 1 + this.f11127;
                                        m8823();
                                        this.f11137 = 3;
                                        this.f11130 = 16;
                                        return fArr;
                                    }
                                    if (cCharAt8 == '}') {
                                        char cM8825 = m8825(this.f11127 + i38);
                                        if (cM8825 == ',') {
                                            this.f11130 = 16;
                                            this.f11127 = i + 2 + this.f11127;
                                            m8823();
                                        } else if (cM8825 == ']') {
                                            this.f11130 = 15;
                                            this.f11127 = i + 2 + this.f11127;
                                            m8823();
                                        } else if (cM8825 == '}') {
                                            this.f11130 = 13;
                                            this.f11127 = i + 2 + this.f11127;
                                            m8823();
                                        } else if (cM8825 == 26) {
                                            this.f11127 = i + 2 + this.f11127;
                                            this.f11130 = 20;
                                            this.f11134 = (char) 26;
                                        } else {
                                            this.f11137 = -1;
                                            return null;
                                        }
                                        this.f11137 = 4;
                                        return fArr;
                                    }
                                    this.f11137 = -1;
                                    return null;
                                }
                                cCharAt3 = cCharAt7;
                                i9 = i33;
                            }
                            i8 = -1;
                            i11 = 16;
                            c = '[';
                            i12 = i35;
                            break;
                        }
                        cCharAt4 = cCharAt;
                        i13 = i;
                    }
                    i8 = -1;
                    i15 = i30;
                }
            }
        }
        this.f11137 = i8;
        return null;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final double m8821(long j) {
        int i;
        char cM8825;
        int i2;
        double d;
        int i3;
        char cM8826;
        this.f11137 = 0;
        int iM8818 = m8818(j);
        if (iM8818 == 0) {
            return 0.0d;
        }
        int i4 = iM8818 + 1;
        char cM8827 = m8825(this.f11127 + iM8818);
        int i5 = this.f11127;
        int i6 = (i5 + i4) - 1;
        boolean z = cM8827 == '-';
        if (z) {
            cM8827 = m8825(i5 + i4);
            i4 = iM8818 + 2;
        }
        if (cM8827 >= '0' && cM8827 <= '9') {
            int i7 = cM8827 - '0';
            while (true) {
                i = i4 + 1;
                cM8825 = m8825(this.f11127 + i4);
                if (cM8825 < '0' || cM8825 > '9') {
                    break;
                }
                i7 = (i7 * 10) + (cM8825 - '0');
                i4 = i;
            }
            if (cM8825 == '.') {
                int i8 = i4 + 2;
                char cM8828 = m8825(this.f11127 + i);
                if (cM8828 < '0' || cM8828 > '9') {
                    this.f11137 = -1;
                    return 0.0d;
                }
                int i9 = (cM8828 - '0') + (i7 * 10);
                int i10 = 10;
                while (true) {
                    i3 = i8 + 1;
                    cM8826 = m8825(this.f11127 + i8);
                    if (cM8826 < '0' || cM8826 > '9') {
                        break;
                    }
                    i9 = (i9 * 10) + (cM8826 - '0');
                    i10 *= 10;
                    i8 = i3;
                }
                i = i3;
                i2 = i10;
                i7 = i9;
                cM8825 = cM8826;
            } else {
                i2 = 1;
            }
            boolean z2 = cM8825 == 'e' || cM8825 == 'E';
            if (z2) {
                int i11 = i + 1;
                cM8825 = m8825(this.f11127 + i);
                if (cM8825 == '+' || cM8825 == '-') {
                    i += 2;
                    cM8825 = m8825(this.f11127 + i11);
                } else {
                    i = i11;
                }
                while (cM8825 >= '0' && cM8825 <= '9') {
                    cM8825 = m8825(this.f11127 + i);
                    i++;
                }
            }
            int i12 = ((this.f11127 + i) - i6) - 1;
            if (z2 || i12 >= 10) {
                d = Double.parseDouble(m8815(i6, i12));
            } else {
                d = ((double) i7) / ((double) i2);
                if (z) {
                    d = -d;
                }
            }
            if (cM8825 == ',') {
                this.f11127 = (i - 1) + this.f11127;
                m8823();
                this.f11137 = 3;
                this.f11130 = 16;
                return d;
            }
            if (cM8825 == '}') {
                char cM8829 = m8825(this.f11127 + i);
                if (cM8829 == ',') {
                    this.f11130 = 16;
                    this.f11127 += i;
                    m8823();
                } else if (cM8829 == ']') {
                    this.f11130 = 15;
                    this.f11127 += i;
                    m8823();
                } else if (cM8829 == '}') {
                    this.f11130 = 13;
                    this.f11127 += i;
                    m8823();
                } else if (cM8829 == 26) {
                    this.f11127 += i;
                    this.f11130 = 20;
                    this.f11134 = (char) 26;
                } else {
                    this.f11137 = -1;
                    return 0.0d;
                }
                this.f11137 = 4;
                return d;
            }
            this.f11137 = -1;
            return 0.0d;
        }
        this.f11137 = -1;
        return 0.0d;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final double[] m8837(long j) {
        int i;
        char cCharAt;
        int i2;
        int i3;
        double[] dArr;
        double d;
        char c;
        this.f11137 = 0;
        int iM8818 = m8818(j);
        double[] dArr2 = null;
        if (iM8818 == 0) {
            return null;
        }
        int i4 = iM8818 + 1;
        int i5 = this.f11127 + iM8818;
        String str = this.f11132;
        int i6 = this.f11129;
        int i7 = -1;
        if ((i5 >= i6 ? (char) 26 : str.charAt(i5)) != '[') {
            this.f11137 = -1;
            return null;
        }
        int i8 = iM8818 + 2;
        int i9 = this.f11127 + i4;
        char cCharAt2 = i9 >= i6 ? (char) 26 : str.charAt(i9);
        double[] dArr3 = new double[16];
        int i10 = 0;
        while (true) {
            int i11 = this.f11127;
            int i12 = (i11 + i8) - 1;
            boolean z = cCharAt2 == '-';
            if (z) {
                int i13 = i8 + 1;
                int i14 = i11 + i8;
                cCharAt2 = i14 >= i6 ? (char) 26 : str.charAt(i14);
                i8 = i13;
            }
            if (cCharAt2 < '0' || cCharAt2 > '9') {
                break;
            }
            int i15 = cCharAt2 - '0';
            while (true) {
                i = i8 + 1;
                int i16 = this.f11127 + i8;
                cCharAt = i16 >= i6 ? (char) 26 : str.charAt(i16);
                if (cCharAt < '0' || cCharAt > '9') {
                    break;
                }
                i15 = (i15 * 10) + (cCharAt - '0');
                i8 = i;
            }
            if (cCharAt == '.') {
                int i17 = i8 + 2;
                int i18 = this.f11127 + i;
                char cCharAt3 = i18 >= i6 ? (char) 26 : str.charAt(i18);
                if (cCharAt3 < '0' || cCharAt3 > '9') {
                    this.f11137 = i7;
                    return dArr2;
                }
                i15 = (cCharAt3 - '0') + (i15 * 10);
                i2 = 10;
                while (true) {
                    i = i17 + 1;
                    int i19 = this.f11127 + i17;
                    cCharAt = i19 >= i6 ? (char) 26 : str.charAt(i19);
                    if (cCharAt < '0' || cCharAt > '9') {
                        break;
                    }
                    i15 = (i15 * 10) + (cCharAt - '0');
                    i2 *= 10;
                    i17 = i;
                }
            } else {
                i2 = 1;
            }
            boolean z2 = cCharAt == 'e' || cCharAt == 'E';
            if (z2) {
                int i20 = i + 1;
                int i21 = this.f11127 + i;
                cCharAt = i21 >= i6 ? (char) 26 : str.charAt(i21);
                if (cCharAt == '+' || cCharAt == '-') {
                    i += 2;
                    int i22 = this.f11127 + i20;
                    cCharAt = i22 >= i6 ? (char) 26 : str.charAt(i22);
                    c = '9';
                    z2 = z2;
                } else {
                    i = i20;
                    c = '9';
                }
                while (cCharAt >= '0' && cCharAt <= c) {
                    int i23 = i + 1;
                    int i24 = this.f11127 + i;
                    i = i23;
                    cCharAt = i24 >= i6 ? (char) 26 : str.charAt(i24);
                    c = c;
                    z2 = z2;
                }
                i3 = 10;
            } else {
                i3 = 10;
            }
            int i25 = ((this.f11127 + i) - i12) - 1;
            if (z2 || i25 >= i3) {
                dArr = dArr2;
                d = Double.parseDouble(m8815(i12, i25));
            } else {
                dArr = dArr2;
                d = ((double) i15) / ((double) i2);
                if (z) {
                    d = -d;
                }
            }
            if (i10 >= dArr3.length) {
                double[] dArr4 = new double[(dArr3.length * 3) / 2];
                System.arraycopy(dArr3, 0, dArr4, 0, i10);
                dArr3 = dArr4;
            }
            int i26 = i10 + 1;
            dArr3[i10] = d;
            if (cCharAt == ',') {
                int i27 = i + 1;
                int i28 = this.f11127 + i;
                i = i27;
                cCharAt2 = i28 >= i6 ? (char) 26 : str.charAt(i28);
            } else {
                if (cCharAt == ']') {
                    int i29 = i + 1;
                    int i30 = this.f11127 + i;
                    char cCharAt4 = i30 >= i6 ? (char) 26 : str.charAt(i30);
                    if (i26 != dArr3.length) {
                        double[] dArr5 = new double[i26];
                        System.arraycopy(dArr3, 0, dArr5, 0, i26);
                        dArr3 = dArr5;
                    }
                    if (cCharAt4 == ',') {
                        this.f11127 += i;
                        m8823();
                        this.f11137 = 3;
                        this.f11130 = 16;
                        return dArr3;
                    }
                    if (cCharAt4 == '}') {
                        int i31 = this.f11127 + i29;
                        char cCharAt5 = i31 >= i6 ? (char) 26 : str.charAt(i31);
                        if (cCharAt5 == ',') {
                            this.f11130 = 16;
                            this.f11127 = i + 1 + this.f11127;
                            m8823();
                        } else if (cCharAt5 == ']') {
                            this.f11130 = 15;
                            this.f11127 = i + 1 + this.f11127;
                            m8823();
                        } else if (cCharAt5 == '}') {
                            this.f11130 = 13;
                            this.f11127 = i + 1 + this.f11127;
                            m8823();
                        } else if (cCharAt5 == 26) {
                            this.f11127 = i + 1 + this.f11127;
                            this.f11130 = 20;
                            this.f11134 = (char) 26;
                        } else {
                            this.f11137 = -1;
                            return dArr;
                        }
                        this.f11137 = 4;
                        return dArr3;
                    }
                    this.f11137 = -1;
                    return dArr;
                }
                cCharAt2 = cCharAt;
            }
            i7 = -1;
            dArr2 = dArr;
            i10 = i26;
            i8 = i;
        }
        this.f11137 = -1;
        return dArr2;
    }

    /* JADX WARN: Code duplicated, block: B:96:0x0123  */
    /* JADX WARN: Code duplicated, block: B:97:0x0126  */
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final double[][] m8863(long j) {
        int i;
        char cCharAt;
        int i2;
        double d;
        int i3;
        int i4;
        int i5;
        char cCharAt2;
        this.f11137 = 0;
        int iM8818 = m8818(j);
        if (iM8818 == 0) {
            return null;
        }
        int i6 = iM8818 + 1;
        int i7 = this.f11127 + iM8818;
        String str = this.f11132;
        int i8 = this.f11129;
        char c = '[';
        int i9 = -1;
        if ((i7 >= i8 ? (char) 26 : str.charAt(i7)) != '[') {
            this.f11137 = -1;
            return null;
        }
        int i10 = iM8818 + 2;
        int i11 = this.f11127 + i6;
        char cCharAt3 = i11 >= i8 ? (char) 26 : str.charAt(i11);
        int i12 = 16;
        double[][] dArr = new double[16][];
        int i13 = 0;
        loop0: while (true) {
            if (cCharAt3 == c) {
                int i14 = i10 + 1;
                int i15 = this.f11127 + i10;
                char cCharAt4 = i15 >= i8 ? (char) 26 : str.charAt(i15);
                double[] dArr2 = new double[i12];
                int i16 = 0;
                while (true) {
                    int i17 = this.f11127;
                    int i18 = (i17 + i14) - 1;
                    boolean z = cCharAt4 == '-';
                    if (z) {
                        int i19 = i17 + i14;
                        i14++;
                        cCharAt4 = i19 >= i8 ? (char) 26 : str.charAt(i19);
                    }
                    if (cCharAt4 < '0' || cCharAt4 > '9') {
                        break loop0;
                    }
                    int i20 = cCharAt4 - '0';
                    while (true) {
                        i = i14 + 1;
                        int i21 = this.f11127 + i14;
                        cCharAt = i21 >= i8 ? (char) 26 : str.charAt(i21);
                        if (cCharAt < '0' || cCharAt > '9') {
                            break;
                        }
                        i20 = (i20 * 10) + (cCharAt - '0');
                        i14 = i;
                    }
                    if (cCharAt == '.') {
                        int i22 = i14 + 2;
                        int i23 = this.f11127 + i;
                        char cCharAt5 = i23 >= i8 ? (char) 26 : str.charAt(i23);
                        if (cCharAt5 < '0' || cCharAt5 > '9') {
                            this.f11137 = i9;
                            return null;
                        }
                        i20 = (cCharAt5 - '0') + (i20 * 10);
                        i2 = 10;
                        while (true) {
                            i = i22 + 1;
                            int i24 = this.f11127 + i22;
                            cCharAt = i24 >= i8 ? (char) 26 : str.charAt(i24);
                            if (cCharAt < '0' || cCharAt > '9') {
                                break;
                            }
                            i20 = (i20 * 10) + (cCharAt - '0');
                            i2 *= 10;
                            i22 = i;
                        }
                    } else {
                        i2 = 1;
                    }
                    boolean z2 = cCharAt == 'e' || cCharAt == 'E';
                    if (z2) {
                        int i25 = i + 1;
                        int i26 = this.f11127 + i;
                        char cCharAt6 = i26 >= i8 ? (char) 26 : str.charAt(i26);
                        if (cCharAt6 == '+' || cCharAt6 == '-') {
                            i += 2;
                            int i27 = this.f11127 + i25;
                            if (i27 >= i8) {
                                cCharAt = 26;
                            } else {
                                cCharAt6 = str.charAt(i27);
                            }
                            while (cCharAt >= '0' && cCharAt <= '9') {
                                int i28 = i + 1;
                                i5 = this.f11127 + i;
                                if (i5 >= i8) {
                                    cCharAt2 = 26;
                                } else {
                                    cCharAt2 = str.charAt(i5);
                                }
                                i = i28;
                                cCharAt = cCharAt2;
                            }
                        } else {
                            i = i25;
                        }
                        cCharAt = cCharAt6;
                        while (cCharAt >= '0') {
                            int i29 = i + 1;
                            i5 = this.f11127 + i;
                            if (i5 >= i8) {
                                cCharAt2 = 26;
                            } else {
                                cCharAt2 = str.charAt(i5);
                            }
                            i = i29;
                            cCharAt = cCharAt2;
                        }
                    }
                    int i30 = ((this.f11127 + i) - i18) - 1;
                    if (z2 || i30 >= 10) {
                        d = Double.parseDouble(m8815(i18, i30));
                    } else {
                        d = ((double) i20) / ((double) i2);
                        if (z) {
                            d = -d;
                        }
                    }
                    if (i16 >= dArr2.length) {
                        double[] dArr3 = new double[(dArr2.length * 3) / 2];
                        System.arraycopy(dArr2, 0, dArr3, 0, i16);
                        dArr2 = dArr3;
                    }
                    int i31 = i16 + 1;
                    dArr2[i16] = d;
                    if (cCharAt == ',') {
                        int i32 = i + 1;
                        int i33 = this.f11127 + i;
                        cCharAt = i33 >= i8 ? (char) 26 : str.charAt(i33);
                        i14 = i32;
                    } else {
                        if (cCharAt == ']') {
                            int i34 = i + 1;
                            int i35 = this.f11127 + i;
                            char cCharAt7 = i35 >= i8 ? (char) 26 : str.charAt(i35);
                            if (i31 != dArr2.length) {
                                double[] dArr4 = new double[i31];
                                i3 = 0;
                                System.arraycopy(dArr2, 0, dArr4, 0, i31);
                                dArr2 = dArr4;
                            } else {
                                i3 = 0;
                            }
                            if (i13 >= dArr.length) {
                                dArr = new double[(dArr.length * 3) / 2][];
                                System.arraycopy(dArr2, i3, dArr, i3, i31);
                            }
                            int i36 = i13 + 1;
                            dArr[i13] = dArr2;
                            if (cCharAt7 == ',') {
                                i4 = i + 2;
                                int i37 = this.f11127 + i34;
                                cCharAt3 = i37 >= i8 ? (char) 26 : str.charAt(i37);
                            } else {
                                if (cCharAt7 == ']') {
                                    int i38 = i + 2;
                                    int i39 = this.f11127 + i34;
                                    char cCharAt8 = i39 >= i8 ? (char) 26 : str.charAt(i39);
                                    if (i36 != dArr.length) {
                                        double[][] dArr5 = new double[i36][];
                                        System.arraycopy(dArr, 0, dArr5, 0, i36);
                                        dArr = dArr5;
                                    }
                                    if (cCharAt8 == ',') {
                                        this.f11127 = i + 1 + this.f11127;
                                        m8823();
                                        this.f11137 = 3;
                                        this.f11130 = 16;
                                        return dArr;
                                    }
                                    if (cCharAt8 == '}') {
                                        char cM8825 = m8825(this.f11127 + i38);
                                        if (cM8825 == ',') {
                                            this.f11130 = 16;
                                            this.f11127 = i + 2 + this.f11127;
                                            m8823();
                                        } else if (cM8825 == ']') {
                                            this.f11130 = 15;
                                            this.f11127 = i + 2 + this.f11127;
                                            m8823();
                                        } else if (cM8825 == '}') {
                                            this.f11130 = 13;
                                            this.f11127 = i + 2 + this.f11127;
                                            m8823();
                                        } else if (cM8825 == 26) {
                                            this.f11127 = i + 2 + this.f11127;
                                            this.f11130 = 20;
                                            this.f11134 = (char) 26;
                                        } else {
                                            this.f11137 = -1;
                                            return null;
                                        }
                                        this.f11137 = 4;
                                        return dArr;
                                    }
                                    this.f11137 = -1;
                                    return null;
                                }
                                cCharAt3 = cCharAt7;
                                i4 = i34;
                            }
                            i9 = -1;
                            i12 = 16;
                            c = '[';
                            i13 = i36;
                            i10 = i4;
                            break;
                        }
                        i14 = i;
                    }
                    i9 = -1;
                    i16 = i31;
                    cCharAt4 = cCharAt;
                }
            }
        }
        this.f11137 = i9;
        return null;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long m8855(long j) {
        this.f11137 = 0;
        int iM8818 = m8818(j);
        if (iM8818 == 0) {
            return 0L;
        }
        int i = iM8818 + 1;
        int i2 = this.f11127 + iM8818;
        String str = this.f11132;
        int i3 = this.f11129;
        if ((i2 >= i3 ? (char) 26 : str.charAt(i2)) != '\"') {
            this.f11137 = -1;
            return 0L;
        }
        long j2 = -3750763034362895579L;
        while (true) {
            int i4 = i + 1;
            int i5 = this.f11127 + i;
            char cCharAt = i5 >= i3 ? (char) 26 : str.charAt(i5);
            if (cCharAt == '\"') {
                int i6 = i + 2;
                int i7 = this.f11127 + i4;
                char cCharAt2 = i7 >= i3 ? (char) 26 : str.charAt(i7);
                if (cCharAt2 == ',') {
                    int iM21118 = C8015.m21118(i, 1, this.f11127, 1);
                    this.f11127 = iM21118;
                    this.f11134 = iM21118 < i3 ? str.charAt(iM21118) : (char) 26;
                    this.f11137 = 3;
                    return j2;
                }
                if (cCharAt2 == '}') {
                    int i8 = this.f11127 + i6;
                    char cCharAt3 = i8 >= i3 ? (char) 26 : str.charAt(i8);
                    if (cCharAt3 == ',') {
                        this.f11130 = 16;
                        this.f11127 = i + 2 + this.f11127;
                        m8823();
                    } else if (cCharAt3 == ']') {
                        this.f11130 = 15;
                        this.f11127 = i + 2 + this.f11127;
                        m8823();
                    } else if (cCharAt3 == '}') {
                        this.f11130 = 13;
                        this.f11127 = i + 2 + this.f11127;
                        m8823();
                    } else if (cCharAt3 == 26) {
                        this.f11130 = 20;
                        this.f11127 = i + 2 + this.f11127;
                        this.f11134 = (char) 26;
                    } else {
                        this.f11137 = -1;
                        return 0L;
                    }
                    this.f11137 = 4;
                    return j2;
                }
                this.f11137 = -1;
                return 0L;
            }
            j2 = (j2 ^ ((long) cCharAt)) * 1099511628211L;
            if (cCharAt == '\\') {
                this.f11137 = -1;
                return 0L;
            }
            i = i4;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m8852(boolean z) {
        return m8831(this.f11129 - this.f11127, z);
    }

    /* JADX WARN: Code duplicated, block: B:138:0x0331  */
    /* JADX WARN: Code duplicated, block: B:140:0x0352  */
    /* JADX WARN: Code duplicated, block: B:154:0x0381  */
    /* JADX WARN: Code duplicated, block: B:175:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:177:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:207:0x0476  */
    /* JADX WARN: Code duplicated, block: B:297:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:304:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:309:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x01fa  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m8831(int i, boolean z) {
        char cM8825;
        char c;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        char c2;
        char c3;
        char c4;
        char c5;
        char c6;
        int i7;
        char c7;
        char c8;
        int i8;
        char cM8826;
        int i9;
        char cM8827;
        char cM8828;
        char cM8829;
        char cM88210;
        char cM88211;
        char cM88212;
        char cM88213;
        int i10;
        char cM88214;
        int i11;
        int i12;
        char cM88215;
        char cM88216;
        char cM88217;
        int i13;
        int i14;
        int i15;
        char cM88218;
        char cM88219;
        char cM88220;
        char cM88221;
        if (!z && i > 13) {
            char cM88222 = m8825(this.f11127);
            char cM88223 = m8825(this.f11127 + 1);
            char cM88224 = m8825(this.f11127 + 2);
            char cM88225 = m8825(this.f11127 + 3);
            char cM88226 = m8825(this.f11127 + 4);
            char cM88227 = m8825(this.f11127 + 5);
            char cM88228 = m8825((this.f11127 + i) - 1);
            char cM88229 = m8825((this.f11127 + i) - 2);
            if (cM88222 == '/' && cM88223 == 'D' && cM88224 == 'a' && cM88225 == 't' && cM88226 == 'e' && cM88227 == '(' && cM88228 == '/' && cM88229 == ')') {
                int i16 = -1;
                for (int i17 = 6; i17 < i; i17++) {
                    char cM88230 = m8825(this.f11127 + i17);
                    if (cM88230 != '+') {
                        if (cM88230 < '0' || cM88230 > '9') {
                            break;
                        }
                    } else {
                        i16 = i17;
                    }
                }
                if (i16 == -1) {
                    return false;
                }
                int i18 = this.f11127 + 6;
                long j = Long.parseLong(m8815(i18, i16 - i18));
                Calendar calendar = Calendar.getInstance(this.f11133, this.f11143);
                this.f11136 = calendar;
                calendar.setTimeInMillis(j);
                this.f11130 = 5;
                return true;
            }
        }
        if (i == 8 || i == 14 || ((i == 16 && ((cM88221 = m8825(this.f11127 + 10)) == 'T' || cM88221 == ' ')) || (i == 17 && m8825(this.f11127 + 6) != '-'))) {
            if (z) {
                return false;
            }
            char cM88231 = m8825(this.f11127);
            char cM88232 = m8825(this.f11127 + 1);
            char cM88233 = m8825(this.f11127 + 2);
            char cM88234 = m8825(this.f11127 + 3);
            char cM88235 = m8825(this.f11127 + 4);
            char cM88236 = m8825(this.f11127 + 5);
            char cM88237 = m8825(this.f11127 + 6);
            char cM88238 = m8825(this.f11127 + 7);
            char cM88239 = m8825(this.f11127 + 8);
            boolean z2 = cM88235 == '-' && cM88238 == '-';
            boolean z3 = z2 && i == 16;
            boolean z4 = z2 && i == 17;
            if (z4 || z3) {
                cM8825 = m8825(this.f11127 + 9);
                c = cM88239;
            } else {
                cM8825 = cM88238;
                c = cM88237;
                cM88237 = cM88236;
                cM88236 = cM88235;
            }
            if (!m8813(cM88231, cM88232, cM88233, cM88234, cM88236, cM88237, (int) c, (int) cM8825)) {
                return false;
            }
            m8812(cM88231, cM88232, cM88233, cM88234, cM88236, cM88237, c, cM8825);
            if (i != 8) {
                char cM88240 = m8825(this.f11127 + 9);
                char cM88241 = m8825(this.f11127 + 10);
                char cM88242 = m8825(this.f11127 + 11);
                char cM88243 = m8825(this.f11127 + 12);
                char cM88244 = m8825(this.f11127 + 13);
                if ((z4 && cM88241 == 'T' && cM88244 == ':' && m8825(this.f11127 + 16) == 'Z') || (z3 && ((cM88241 == ' ' || cM88241 == 'T') && cM88244 == ':'))) {
                    cM88241 = m8825(this.f11127 + 14);
                    cM88239 = cM88242;
                    cM88244 = '0';
                    cM88242 = m8825(this.f11127 + 15);
                    cM88240 = cM88243;
                    cM88243 = '0';
                }
                if (!m8816(cM88239, cM88240, cM88241, cM88242, cM88243, cM88244)) {
                    return false;
                }
                if (i != 17 || z4) {
                    i2 = 0;
                } else {
                    char cM88245 = m8825(this.f11127 + 14);
                    char cM88246 = m8825(this.f11127 + 15);
                    char cM88247 = m8825(this.f11127 + 16);
                    if (cM88245 < '0' || cM88245 > '9' || cM88246 < '0' || cM88246 > '9' || cM88247 < '0' || cM88247 > '9') {
                        return false;
                    }
                    i2 = (cM88247 - '0') + ((cM88246 - '0') * 10) + ((cM88245 - '0') * 100);
                }
                i5 = (cM88240 - '0') + ((cM88239 - '0') * 10);
                i3 = (cM88242 - '0') + ((cM88241 - '0') * 10);
                i4 = (cM88244 - '0') + ((cM88243 - '0') * 10);
            } else {
                i2 = 0;
                i3 = 0;
                i4 = 0;
                i5 = 0;
            }
            this.f11136.set(11, i5);
            this.f11136.set(12, i3);
            this.f11136.set(13, i4);
            this.f11136.set(14, i2);
            this.f11130 = 5;
            return true;
        }
        if (i < 9) {
            return false;
        }
        char cM88248 = m8825(this.f11127);
        char cM88249 = m8825(this.f11127 + 1);
        char cM88250 = m8825(this.f11127 + 2);
        char cM88251 = m8825(this.f11127 + 3);
        char cM88252 = m8825(this.f11127 + 4);
        char cM88253 = m8825(this.f11127 + 5);
        char cM88254 = m8825(this.f11127 + 6);
        char cM88255 = m8825(this.f11127 + 7);
        char cM88256 = m8825(this.f11127 + 8);
        char cM88257 = m8825(this.f11127 + 9);
        if ((cM88252 != '-' || cM88255 != '-') && (cM88252 != '/' || cM88255 != '/')) {
            if (cM88252 == '-' && cM88254 == '-') {
                if (cM88256 == ' ') {
                    i6 = 8;
                    cM88254 = cM88253;
                    cM88253 = '0';
                    c7 = cM88249;
                    c8 = cM88250;
                    c2 = cM88251;
                    c3 = cM88253;
                    c4 = cM88254;
                    c6 = cM88255;
                    c5 = '0';
                    i7 = i6;
                    cM88254 = cM88248;
                } else {
                    i8 = 9;
                    cM88254 = cM88248;
                    c8 = cM88250;
                    c2 = cM88251;
                    c4 = cM88253;
                    c5 = cM88255;
                    c6 = cM88256;
                    c3 = '0';
                    i7 = i8;
                    c7 = cM88249;
                }
            } else if ((cM88250 == '.' && cM88253 == '.') || (cM88250 == '-' && cM88253 == '-')) {
                cM88253 = cM88251;
                cM88250 = cM88256;
                cM88251 = cM88257;
            } else {
                if (cM88252 != 24180 && cM88252 != 45380) {
                    return false;
                }
                if (cM88255 != 26376 && cM88255 != 50900) {
                    if (cM88254 != 26376 && cM88254 != 50900) {
                        return false;
                    }
                    if (cM88256 == 26085 || cM88256 == 51068) {
                        i6 = 10;
                        cM88254 = cM88253;
                        cM88253 = '0';
                        c7 = cM88249;
                        c8 = cM88250;
                        c2 = cM88251;
                        c3 = cM88253;
                        c4 = cM88254;
                        c6 = cM88255;
                        c5 = '0';
                        i7 = i6;
                        cM88254 = cM88248;
                    } else {
                        if (cM88257 != 26085 && cM88257 != 51068) {
                            return false;
                        }
                        i8 = 10;
                        cM88254 = cM88248;
                        c8 = cM88250;
                        c2 = cM88251;
                        c4 = cM88253;
                        c5 = cM88255;
                        c6 = cM88256;
                        c3 = '0';
                        i7 = i8;
                        c7 = cM88249;
                    }
                } else if (cM88257 == 26085 || cM88257 == 51068) {
                    i6 = 10;
                    cM88255 = cM88256;
                    c7 = cM88249;
                    c8 = cM88250;
                    c2 = cM88251;
                    c3 = cM88253;
                    c4 = cM88254;
                    c6 = cM88255;
                    c5 = '0';
                    i7 = i6;
                    cM88254 = cM88248;
                } else {
                    if (m8825(this.f11127 + 10) != 26085 && m8825(this.f11127 + 10) != 51068) {
                        return false;
                    }
                    c2 = cM88251;
                    c3 = cM88253;
                    c4 = cM88254;
                    c5 = cM88256;
                    c6 = cM88257;
                    i7 = 11;
                    cM88254 = cM88248;
                    c7 = cM88249;
                    c8 = cM88250;
                }
            }
            if (!m8813(cM88254, c7, c8, c2, c3, c4, (int) c5, (int) c6)) {
                return false;
            }
            m8812(cM88254, c7, c8, c2, c3, c4, c5, c6);
            cM8826 = m8825(this.f11127 + i7);
            if (cM8826 == 'T' && (cM8826 != ' ' || z)) {
                if (cM8826 == '\"' || cM8826 == 26 || cM8826 == 26085 || cM8826 == 51068) {
                    this.f11136.set(11, 0);
                    this.f11136.set(12, 0);
                    this.f11136.set(13, 0);
                    this.f11136.set(14, 0);
                    int i19 = this.f11127 + i7;
                    this.f11127 = i19;
                    this.f11134 = m8825(i19);
                    this.f11130 = 5;
                    return true;
                }
                if (cM8826 != '+' && cM8826 != '-') {
                    return false;
                }
                if (this.f11129 != i7 + 6 || m8825(this.f11127 + i7 + 3) != ':' || m8825(this.f11127 + i7 + 4) != '0' || m8825(this.f11127 + i7 + 5) != '0') {
                    return false;
                }
                m8830('0', '0', '0', '0', '0', '0');
                this.f11136.set(14, 0);
                m8829(cM8826, m8825(this.f11127 + i7 + 1), m8825(this.f11127 + i7 + 2));
                return true;
            }
            i9 = i7 + 9;
            if (i >= i9 || m8825(this.f11127 + i7 + 3) != ':' || m8825(this.f11127 + i7 + 6) != ':') {
                return false;
            }
            cM8827 = m8825(this.f11127 + i7 + 1);
            cM8828 = m8825(this.f11127 + i7 + 2);
            cM8829 = m8825(this.f11127 + i7 + 4);
            cM88210 = m8825(this.f11127 + i7 + 5);
            cM88211 = m8825(this.f11127 + i7 + 7);
            cM88212 = m8825(this.f11127 + i7 + 8);
            if (!m8816(cM8827, cM8828, cM8829, cM88210, cM88211, cM88212)) {
                return false;
            }
            m8830(cM8827, cM8828, cM8829, cM88210, cM88211, cM88212);
            cM88213 = m8825(this.f11127 + i7 + 9);
            if (cM88213 == '.') {
                this.f11136.set(14, 0);
                int i20 = this.f11127 + i9;
                this.f11127 = i20;
                this.f11134 = m8825(i20);
                this.f11130 = 5;
                if (cM88213 != 'Z' && this.f11136.getTimeZone().getRawOffset() != 0) {
                    String[] availableIDs = TimeZone.getAvailableIDs(0);
                    if (availableIDs.length <= 0) {
                        return true;
                    }
                    this.f11136.setTimeZone(C12557.getTimeZone(availableIDs[0]));
                    return true;
                }
            }
            i10 = i7 + 11;
            if (i >= i10 || (cM88214 = m8825(this.f11127 + i7 + 10)) < '0' || cM88214 > '9') {
                return false;
            }
            i11 = cM88214 - '0';
            if (i > i10 || (cM88220 = m8825(this.f11127 + i7 + 11)) < '0' || cM88220 > '9') {
                i12 = 1;
            } else {
                i11 = (i11 * 10) + (cM88220 - '0');
                i12 = 2;
            }
            if (i12 == 2 && (cM88219 = m8825(this.f11127 + i7 + 12)) >= '0' && cM88219 <= '9') {
                i11 = (i11 * 10) + (cM88219 - '0');
                i12 = 3;
            }
            this.f11136.set(14, i11);
            cM88215 = m8825(C8015.m21118(this.f11127, i7, 10, i12));
            if (cM88215 != '+' || cM88215 == '-') {
                cM88216 = m8825(this.f11127 + i7 + 10 + i12 + 1);
                if (cM88216 >= '0' || cM88216 > '1' || (cM88217 = m8825(this.f11127 + i7 + 10 + i12 + 2)) < '0' || cM88217 > '9') {
                    return false;
                }
                char cM88258 = m8825(this.f11127 + i7 + 10 + i12 + 3);
                if (cM88258 == ':') {
                    if (m8825(this.f11127 + i7 + 10 + i12 + 4) != '0' || m8825(this.f11127 + i7 + 10 + i12 + 5) != '0') {
                        return false;
                    }
                    i13 = 6;
                } else if (cM88258 != '0') {
                    i13 = 3;
                } else {
                    if (m8825(this.f11127 + i7 + 10 + i12 + 4) != '0') {
                        return false;
                    }
                    i13 = 5;
                }
                m8829(cM88215, cM88216, cM88217);
                i14 = i13;
                i15 = 10;
            } else if (cM88215 == 'Z') {
                if (this.f11136.getTimeZone().getRawOffset() != 0) {
                    String[] availableIDs2 = TimeZone.getAvailableIDs(0);
                    if (availableIDs2.length > 0) {
                        this.f11136.setTimeZone(C12557.getTimeZone(availableIDs2[0]));
                    }
                }
                i15 = 10;
                i14 = 1;
            } else {
                i15 = 10;
                i14 = 0;
            }
            int i21 = this.f11127;
            int iM21118 = C8015.m21118(i7, i15, i12, i14);
            cM88218 = m8825(i21 + iM21118);
            if (cM88218 == 26 && cM88218 != '\"') {
                return false;
            }
            int i22 = this.f11127 + iM21118;
            this.f11127 = i22;
            this.f11134 = m8825(i22);
            this.f11130 = 5;
            return true;
        }
        cM88255 = cM88249;
        cM88252 = cM88254;
        cM88249 = cM88257;
        cM88254 = cM88248;
        cM88248 = cM88256;
        c5 = cM88248;
        c6 = cM88249;
        c8 = cM88250;
        c2 = cM88251;
        c4 = cM88252;
        c3 = cM88253;
        c7 = cM88255;
        i7 = 10;
        if (!m8813(cM88254, c7, c8, c2, c3, c4, (int) c5, (int) c6)) {
            return false;
        }
        m8812(cM88254, c7, c8, c2, c3, c4, c5, c6);
        cM8826 = m8825(this.f11127 + i7);
        if (cM8826 == 'T') {
        }
        i9 = i7 + 9;
        if (i >= i9) {
            return false;
        }
        cM8827 = m8825(this.f11127 + i7 + 1);
        cM8828 = m8825(this.f11127 + i7 + 2);
        cM8829 = m8825(this.f11127 + i7 + 4);
        cM88210 = m8825(this.f11127 + i7 + 5);
        cM88211 = m8825(this.f11127 + i7 + 7);
        cM88212 = m8825(this.f11127 + i7 + 8);
        if (!m8816(cM8827, cM8828, cM8829, cM88210, cM88211, cM88212)) {
            return false;
        }
        m8830(cM8827, cM8828, cM8829, cM88210, cM88211, cM88212);
        cM88213 = m8825(this.f11127 + i7 + 9);
        if (cM88213 == '.') {
            this.f11136.set(14, 0);
            int i23 = this.f11127 + i9;
            this.f11127 = i23;
            this.f11134 = m8825(i23);
            this.f11130 = 5;
            return cM88213 != 'Z' ? true : true;
        }
        i10 = i7 + 11;
        if (i >= i10) {
            return false;
        }
        i11 = cM88214 - '0';
        if (i > i10) {
            i12 = 1;
        } else {
            i12 = 1;
        }
        if (i12 == 2) {
            i11 = (i11 * 10) + (cM88219 - '0');
            i12 = 3;
        }
        this.f11136.set(14, i11);
        cM88215 = m8825(C8015.m21118(this.f11127, i7, 10, i12));
        if (cM88215 != '+') {
            cM88216 = m8825(this.f11127 + i7 + 10 + i12 + 1);
            if (cM88216 >= '0') {
                return false;
            }
            return false;
        }
        cM88216 = m8825(this.f11127 + i7 + 10 + i12 + 1);
        if (cM88216 >= '0') {
            return false;
        }
        return false;
        int i24 = this.f11127;
        int iM21119 = C8015.m21118(i7, i15, i12, i14);
        cM88218 = m8825(i24 + iM21119);
        if (cM88218 == 26) {
        }
        int i25 = this.f11127 + iM21119;
        this.f11127 = i25;
        this.f11134 = m8825(i25);
        this.f11130 = 5;
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8830(char c, char c2, char c3, char c4, char c5, char c6) {
        this.f11136.set(11, (c2 - '0') + ((c - '0') * 10));
        this.f11136.set(12, (c4 - '0') + ((c3 - '0') * 10));
        this.f11136.set(13, (c6 - '0') + ((c5 - '0') * 10));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8829(char c, char c2, char c3) {
        int i = ((c3 - '0') + ((c2 - '0') * 10)) * 3600000;
        if (c == '-') {
            i = -i;
        }
        if (this.f11136.getTimeZone().getRawOffset() != i) {
            String[] availableIDs = TimeZone.getAvailableIDs(i);
            if (availableIDs.length > 0) {
                this.f11136.setTimeZone(C12557.getTimeZone(availableIDs[0]));
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m8812(char c, char c2, char c3, char c4, char c5, char c6, char c7, char c8) {
        Calendar calendar = Calendar.getInstance(this.f11133, this.f11143);
        this.f11136 = calendar;
        int i = c4 - '0';
        calendar.set(1, i + ((c3 - '0') * 10) + ((c2 - '0') * 100) + ((c - '0') * 1000));
        this.f11136.set(2, ((c6 - '0') + ((c5 - '0') * 10)) - 1);
        this.f11136.set(5, (c8 - '0') + ((c7 - '0') * 10));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final byte[] m8814(int i, int i2, String str) {
        int[] iArr;
        int i3;
        int i4;
        if (i2 == 0) {
            return new byte[0];
        }
        int i5 = (i + i2) - 1;
        while (true) {
            iArr = f11119;
            if (i >= i5 || iArr[str.charAt(i)] >= 0) {
                break;
            }
            i++;
        }
        while (i5 > 0 && iArr[str.charAt(i5)] < 0) {
            i5--;
        }
        if (str.charAt(i5) == '=') {
            i3 = str.charAt(i5 + (-1)) == '=' ? 2 : 1;
        } else {
            i3 = 0;
        }
        int i6 = (i5 - i) + 1;
        if (i2 > 76) {
            i4 = (str.charAt(76) == '\r' ? i6 / 78 : 0) << 1;
        } else {
            i4 = 0;
        }
        int i7 = (((i6 - i4) * 6) >> 3) - i3;
        byte[] bArr = new byte[i7];
        int i8 = (i7 / 3) * 3;
        int i9 = 0;
        loop2: while (true) {
            int i10 = 0;
            while (true) {
                if (i9 >= i8) {
                    break loop2;
                }
                int i11 = i + 4;
                int i12 = (iArr[str.charAt(i + 1)] << 12) | (iArr[str.charAt(i)] << 18) | (iArr[str.charAt(i + 2)] << 6) | iArr[str.charAt(i + 3)];
                bArr[i9] = (byte) (i12 >> 16);
                int i13 = i9 + 2;
                bArr[i9 + 1] = (byte) (i12 >> 8);
                i9 += 3;
                bArr[i13] = (byte) i12;
                if (i4 <= 0 || (i10 = i10 + 1) != 19) {
                    i = i11;
                }
            }
            i += 6;
        }
        if (i9 < i7) {
            int i14 = 0;
            int i15 = 0;
            while (i <= i5 - i3) {
                i14 |= iArr[str.charAt(i)] << (18 - (i15 * 6));
                i15++;
                i++;
            }
            int i16 = 16;
            while (i9 < i7) {
                bArr[i9] = (byte) (i14 >> i16);
                i16 -= 8;
                i9++;
            }
        }
        return bArr;
    }
}
