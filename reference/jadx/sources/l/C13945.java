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

/* JADX INFO: renamed from: l.۬ܶܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2AUQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C13945 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final boolean[] f44197;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final char[] f44198;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final boolean[] f44199;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final int[] f44200;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final int[] f44201;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f44202;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static boolean f44203;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f44204;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f44205;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f44206;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f44207;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public TimeZone f44208;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public char f44209;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f44210;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f44211;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f44212;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f44213;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f44214;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f44215;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f44216;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f44217;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public String f44218;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Calendar f44219;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f44220;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public char[] f44221;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f44222;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public Locale f44223;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m33929(char c, char c2, char c3, char c4, char c5, char c6, int i, int i2) {
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

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m33933(char c, char c2, char c3, char c4, char c5, char c6) {
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
                boolean[] zArr = f44197;
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
                boolean[] zArr2 = f44199;
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
        f44203 = i >= 23;
        f44202 = new ThreadLocal();
        f44201 = new int[IShizukuService.Stub.TRANSACTION_dispatchPackageChanged];
        for (int i2 = 48; i2 <= 57; i2++) {
            f44201[i2] = i2 - 48;
        }
        for (int i3 = 97; i3 <= 102; i3++) {
            f44201[i3] = i3 - 87;
        }
        for (int i4 = 65; i4 <= 70; i4++) {
            f44201[i4] = i4 - 55;
        }
        char[] charArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
        f44198 = charArray;
        int[] iArr = new int[256];
        f44200 = iArr;
        Arrays.fill(iArr, -1);
        int length = charArray.length;
        for (int i5 = 0; i5 < length; i5++) {
            f44200[f44198[i5]] = i5;
        }
        f44200[61] = 0;
        f44197 = new boolean[256];
        c2 = 0;
        f44199 = new boolean[256];
    }

    public C13945(String str) {
        this(str, AbstractC12454.f40027);
    }

    public C13945(String str, int i) {
        this.f44213 = AbstractC12454.f40027;
        this.f44217 = false;
        this.f44204 = false;
        this.f44208 = AbstractC12454.f40024;
        this.f44223 = AbstractC12454.f40023;
        this.f44219 = null;
        this.f44215 = 0;
        char[] cArr = (char[]) f44202.get();
        this.f44221 = cArr;
        if (cArr == null) {
            this.f44221 = new char[512];
        }
        this.f44213 = i;
        this.f44211 = str;
        int length = str.length();
        this.f44210 = length;
        int i2 = (-1) + 1;
        this.f44206 = i2;
        char cCharAt = i2 >= length ? (char) 26 : str.charAt(i2);
        this.f44209 = cCharAt;
        if (cCharAt == 65279) {
            m33935();
        }
        this.f44218 = (EnumC7234.InitStringFieldAsEmpty.f23858 & i) != 0 ? "" : null;
        this.f44220 = (EnumC7234.DisableCircularReferenceDetect.f23858 & i) != 0;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int m33938() {
        return this.f44222;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m33972() {
        char[] cArr = this.f44221;
        if (cArr.length <= 8196) {
            f44202.set(cArr);
        }
        this.f44221 = null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final char m33935() {
        int i = this.f44206 + 1;
        this.f44206 = i;
        char cCharAt = i >= this.f44210 ? (char) 26 : this.f44211.charAt(i);
        this.f44209 = cCharAt;
        return cCharAt;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m33947(EnumC7234 enumC7234) {
        return (enumC7234.f23858 & this.f44213) != 0;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m33980() {
        this.f44205 = 0;
        while (true) {
            char c = this.f44209;
            if (c == ':') {
                int i = this.f44206 + 1;
                this.f44206 = i;
                this.f44209 = i >= this.f44210 ? (char) 26 : this.f44211.charAt(i);
                m33956();
                return;
            }
            if (c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == '\f' || c == '\b') {
                m33935();
            } else {
                throw new C4251("not match : - " + this.f44209);
            }
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String m33965() {
        char cCharAt = this.f44211.charAt((this.f44216 + this.f44205) - 1);
        int i = this.f44205;
        if (cCharAt == 'L' || cCharAt == 'S' || cCharAt == 'B' || cCharAt == 'F' || cCharAt == 'D') {
            i--;
        }
        return m33932(this.f44216, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final char m33939(int i) {
        if (i >= this.f44210) {
            return (char) 26;
        }
        return this.f44211.charAt(i);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m33956() {
        int i = 0;
        this.f44205 = 0;
        while (true) {
            int i2 = this.f44206;
            this.f44214 = i2;
            char c = this.f44209;
            if (c == '/') {
                m33957();
            } else {
                if (c == '\"') {
                    m33937();
                    return;
                }
                if ((c >= '0' && c <= '9') || c == '-') {
                    m33963();
                    return;
                }
                if (c == ',') {
                    m33935();
                    this.f44222 = 16;
                    return;
                }
                if (c != '\f' && c != '\r' && c != ' ') {
                    if (c == ':') {
                        m33935();
                        this.f44222 = 17;
                        return;
                    }
                    int i3 = this.f44210;
                    String str = this.f44211;
                    if (c == '[') {
                        int i4 = i2 + 1;
                        this.f44206 = i4;
                        this.f44209 = i4 < i3 ? str.charAt(i4) : (char) 26;
                        this.f44222 = 14;
                        return;
                    }
                    if (c == ']') {
                        m33935();
                        this.f44222 = 15;
                        return;
                    }
                    if (c == 'f') {
                        if (str.startsWith("false", i2)) {
                            int i5 = this.f44206 + 5;
                            this.f44206 = i5;
                            char cM33939 = m33939(i5);
                            this.f44209 = cM33939;
                            if (cM33939 == ' ' || cM33939 == ',' || cM33939 == '}' || cM33939 == ']' || cM33939 == '\n' || cM33939 == '\r' || cM33939 == '\t' || cM33939 == 26 || cM33939 == '\f' || cM33939 == '\b' || cM33939 == ':') {
                                this.f44222 = 7;
                                return;
                            }
                        }
                        throw new C4251("scan false error");
                    }
                    if (c == 'n') {
                        if (str.startsWith("null", i2)) {
                            this.f44206 += 4;
                            i = 8;
                        } else if (str.startsWith("new", this.f44206)) {
                            this.f44206 += 3;
                            i = 9;
                        }
                        if (i != 0) {
                            char cM339310 = m33939(this.f44206);
                            this.f44209 = cM339310;
                            if (cM339310 == ' ' || cM339310 == ',' || cM339310 == '}' || cM339310 == ']' || cM339310 == '\n' || cM339310 == '\r' || cM339310 == '\t' || cM339310 == 26 || cM339310 == '\f' || cM339310 == '\b') {
                                this.f44222 = i;
                                return;
                            }
                        }
                        throw new C4251("scan null/new error");
                    }
                    if (c == '{') {
                        int i6 = i2 + 1;
                        this.f44206 = i6;
                        this.f44209 = i6 < i3 ? str.charAt(i6) : (char) 26;
                        this.f44222 = 12;
                        return;
                    }
                    if (c == '}') {
                        int i7 = i2 + 1;
                        this.f44206 = i7;
                        this.f44209 = i7 < i3 ? str.charAt(i7) : (char) 26;
                        this.f44222 = 13;
                        return;
                    }
                    if (c != 'S' && c != 'T') {
                        if (c == 't') {
                            if (str.startsWith("true", i2)) {
                                int i8 = this.f44206 + 4;
                                this.f44206 = i8;
                                char cM339311 = m33939(i8);
                                this.f44209 = cM339311;
                                if (cM339311 == ' ' || cM339311 == ',' || cM339311 == '}' || cM339311 == ']' || cM339311 == '\n' || cM339311 == '\r' || cM339311 == '\t' || cM339311 == 26 || cM339311 == '\f' || cM339311 == '\b' || cM339311 == ':') {
                                    this.f44222 = 6;
                                    return;
                                }
                            }
                            throw new C4251("scan true error");
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
                                            m33937();
                                            return;
                                        case '(':
                                            m33935();
                                            this.f44222 = 10;
                                            return;
                                        case ')':
                                            m33935();
                                            this.f44222 = 11;
                                            return;
                                        default:
                                            if (i2 == i3 || (c == 26 && i2 + 1 == i3)) {
                                                if (this.f44222 == 20) {
                                                    throw new C4251("EOF error");
                                                }
                                                this.f44222 = 20;
                                                this.f44206 = 0;
                                                this.f44214 = 0;
                                                return;
                                            }
                                            if (c > 31 && c != 127) {
                                                this.f44222 = 1;
                                                m33935();
                                                return;
                                            } else {
                                                m33935();
                                                continue;
                                            }
                                            break;
                                    }
                                    break;
                            }
                        }
                    }
                    m33931();
                    return;
                }
                m33935();
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:143:0x009d A[SYNTHETIC] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m33973(int i) {
        char c;
        this.f44205 = 0;
        while (true) {
            if (i != 2) {
                String str = this.f44211;
                int i2 = this.f44210;
                if (i == 4) {
                    char c2 = this.f44209;
                    if (c2 == '\"') {
                        this.f44214 = this.f44206;
                        m33937();
                        return;
                    } else if (c2 >= '0' && c2 <= '9') {
                        this.f44214 = this.f44206;
                        m33963();
                        return;
                    } else if (c2 == '{') {
                        this.f44222 = 12;
                        int i3 = this.f44206 + 1;
                        this.f44206 = i3;
                        this.f44209 = i3 < i2 ? str.charAt(i3) : (char) 26;
                        return;
                    }
                } else if (i == 12) {
                    char c3 = this.f44209;
                    if (c3 == '{') {
                        this.f44222 = 12;
                        int i4 = this.f44206 + 1;
                        this.f44206 = i4;
                        this.f44209 = i4 < i2 ? str.charAt(i4) : (char) 26;
                        return;
                    }
                    if (c3 == '[') {
                        this.f44222 = 14;
                        int i5 = this.f44206 + 1;
                        this.f44206 = i5;
                        this.f44209 = i5 < i2 ? str.charAt(i5) : (char) 26;
                        return;
                    }
                } else {
                    if (i == 18) {
                        while (true) {
                            c = this.f44209;
                            if (c <= ' ' && (c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == '\f' || c == '\b')) {
                                m33935();
                            }
                        }
                        if (c == '_' || Character.isLetter(c)) {
                            m33931();
                            return;
                        } else {
                            m33956();
                            return;
                        }
                    }
                    if (i != 20) {
                        switch (i) {
                            case 14:
                                char c4 = this.f44209;
                                if (c4 == '[') {
                                    this.f44222 = 14;
                                    m33935();
                                } else if (c4 == '{') {
                                    this.f44222 = 12;
                                    m33935();
                                }
                                break;
                            case 15:
                                if (this.f44209 == ']') {
                                    this.f44222 = 15;
                                    m33935();
                                }
                                if (this.f44209 == 26) {
                                    this.f44222 = 20;
                                }
                                break;
                            case 16:
                                char c5 = this.f44209;
                                if (c5 == ',') {
                                    this.f44222 = 16;
                                    int i6 = this.f44206 + 1;
                                    this.f44206 = i6;
                                    this.f44209 = i6 < i2 ? str.charAt(i6) : (char) 26;
                                } else if (c5 == '}') {
                                    this.f44222 = 13;
                                    int i7 = this.f44206 + 1;
                                    this.f44206 = i7;
                                    this.f44209 = i7 < i2 ? str.charAt(i7) : (char) 26;
                                } else if (c5 == ']') {
                                    this.f44222 = 15;
                                    int i8 = this.f44206 + 1;
                                    this.f44206 = i8;
                                    this.f44209 = i8 < i2 ? str.charAt(i8) : (char) 26;
                                } else if (c5 == 26) {
                                    this.f44222 = 20;
                                }
                                break;
                        }
                        return;
                    }
                    if (this.f44209 == 26) {
                        this.f44222 = 20;
                        return;
                    }
                }
            } else {
                char c6 = this.f44209;
                if (c6 >= '0' && c6 <= '9') {
                    this.f44214 = this.f44206;
                    m33963();
                    return;
                }
                if (c6 == '\"') {
                    this.f44214 = this.f44206;
                    m33937();
                    return;
                } else if (c6 == '[') {
                    this.f44222 = 14;
                    m33935();
                    return;
                } else if (c6 == '{') {
                    this.f44222 = 12;
                    m33935();
                    return;
                }
            }
            char c7 = this.f44209;
            if (c7 == ' ' || c7 == '\n' || c7 == '\r' || c7 == '\t' || c7 == '\f' || c7 == '\b') {
                m33935();
            } else {
                m33956();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Number m33960() {
        char c;
        boolean z;
        long j;
        int i;
        long j2;
        int i2 = this.f44216;
        int i3 = this.f44205 + i2;
        int i4 = i3 - 1;
        String str = this.f44211;
        int i5 = this.f44210;
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
        int i6 = this.f44216;
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
                return new BigInteger(m33965());
            }
            long j3 = j2 * 10;
            long j4 = iCharAt;
            if (j3 < j + j4) {
                return new BigInteger(m33965());
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
        if (i2 <= this.f44216 + i) {
            throw new NumberFormatException(m33965());
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
    public final String m33941(C11928 c11928) {
        char c;
        while (true) {
            c = this.f44209;
            if (c != ' ' && c != '\n' && c != '\r' && c != '\t' && c != '\f' && c != '\b') {
                break;
            }
            m33935();
        }
        if (c == '\"') {
            return m33942(c11928, '\"');
        }
        if (c == '\'') {
            return m33942(c11928, '\'');
        }
        if (c == '}') {
            m33935();
            this.f44222 = 13;
            return null;
        }
        if (c == ',') {
            m33935();
            this.f44222 = 16;
            return null;
        }
        if (c == 26) {
            this.f44222 = 20;
            return null;
        }
        return m33971(c11928);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m33942(C11928 c11928, char c) {
        String strM33927;
        int i = this.f44206 + 1;
        String str = this.f44211;
        int iIndexOf = str.indexOf(c, i);
        if (iIndexOf == -1) {
            throw new C4251("unclosed str, " + m33977());
        }
        int i2 = iIndexOf - i;
        char[] cArrM33949 = m33949(this.f44206 + 1, i2);
        boolean z = false;
        while (i2 > 0 && cArrM33949[i2 - 1] == '\\') {
            int i3 = 1;
            for (int i4 = i2 - 2; i4 >= 0 && cArrM33949[i4] == '\\'; i4--) {
                i3++;
            }
            if (i3 % 2 == 0) {
                break;
            }
            int iIndexOf2 = str.indexOf(c, iIndexOf + 1);
            int i5 = (iIndexOf2 - iIndexOf) + i2;
            if (i5 >= cArrM33949.length) {
                int length = (cArrM33949.length * 3) / 2;
                if (length < i5) {
                    length = i5;
                }
                char[] cArr = new char[length];
                System.arraycopy(cArrM33949, 0, cArr, 0, cArrM33949.length);
                cArrM33949 = cArr;
            }
            str.getChars(iIndexOf, iIndexOf2, cArrM33949, i2);
            iIndexOf = iIndexOf2;
            i2 = i5;
            z = true;
        }
        if (z) {
            strM33927 = m33927(cArrM33949, i2);
        } else {
            int i6 = 0;
            for (int i7 = 0; i7 < i2; i7++) {
                char c2 = cArrM33949[i7];
                i6 = (i6 * 31) + c2;
                if (c2 == '\\') {
                    z = true;
                }
            }
            if (z) {
                strM33927 = m33927(cArrM33949, i2);
            } else {
                strM33927 = i2 < 20 ? c11928.m29885(cArrM33949, i2, i6) : new String(cArrM33949, 0, i2);
            }
        }
        int i8 = iIndexOf + 1;
        this.f44206 = i8;
        this.f44209 = i8 >= this.f44210 ? (char) 26 : str.charAt(i8);
        return strM33927;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00f5  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m33927(char[] cArr, int i) {
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
                                        throw new C4251("unclosed.str.lit");
                                }
                                break;
                        }
                    } else {
                        i3 = i5 + 1;
                        char c6 = cArr[i4 + 2];
                        int[] iArr = f44201;
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

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m33977() {
        StringBuilder sb = new StringBuilder("pos ");
        sb.append(this.f44206);
        sb.append(", json : ");
        String strSubstring = this.f44211;
        if (this.f44210 >= 65536) {
            strSubstring = strSubstring.substring(0, 65536);
        }
        sb.append(strSubstring);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m33957() {
        m33935();
        char c = this.f44209;
        if (c == '/') {
            do {
                m33935();
            } while (this.f44209 != '\n');
            m33935();
        } else if (c == '*') {
            m33935();
            while (true) {
                char c2 = this.f44209;
                if (c2 == 26) {
                    return;
                }
                if (c2 == '*') {
                    m33935();
                    if (this.f44209 == '/') {
                        m33935();
                        return;
                    }
                } else {
                    m33935();
                }
            }
        } else {
            throw new C4251("invalid comment");
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m33971(C11928 c11928) {
        int i = this.f44209;
        boolean[] zArr = f44197;
        if (i < zArr.length && !zArr[i]) {
            throw new C4251("illegal identifier : " + this.f44209 + ", " + m33977());
        }
        this.f44216 = this.f44206;
        this.f44205 = 1;
        while (true) {
            char cM33935 = m33935();
            boolean[] zArr2 = f44199;
            if (cM33935 < zArr2.length && !zArr2[cM33935]) {
                break;
            }
            i = (i * 31) + cM33935;
            this.f44205++;
        }
        this.f44209 = m33939(this.f44206);
        this.f44222 = 18;
        int i2 = this.f44205;
        String str = this.f44211;
        if (i2 == 4 && str.startsWith("null", this.f44216)) {
            return null;
        }
        return c11928.m29884(this.f44216, this.f44205, i, str);
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final void m33937() {
        char c = this.f44209;
        int i = this.f44206 + 1;
        String str = this.f44211;
        int iIndexOf = str.indexOf(c, i);
        if (iIndexOf == -1) {
            throw new C4251("unclosed str, " + m33977());
        }
        int i2 = iIndexOf - i;
        char[] cArrM33949 = m33949(this.f44206 + 1, i2);
        boolean z = false;
        while (i2 > 0 && cArrM33949[i2 - 1] == '\\') {
            int i3 = 1;
            for (int i4 = i2 - 2; i4 >= 0 && cArrM33949[i4] == '\\'; i4--) {
                i3++;
            }
            if (i3 % 2 == 0) {
                break;
            }
            int iIndexOf2 = str.indexOf(c, iIndexOf + 1);
            int i5 = (iIndexOf2 - iIndexOf) + i2;
            if (i5 >= cArrM33949.length) {
                int length = (cArrM33949.length * 3) / 2;
                if (length < i5) {
                    length = i5;
                }
                char[] cArr = new char[length];
                System.arraycopy(cArrM33949, 0, cArr, 0, cArrM33949.length);
                cArrM33949 = cArr;
            }
            str.getChars(iIndexOf, iIndexOf2, cArrM33949, i2);
            iIndexOf = iIndexOf2;
            i2 = i5;
            z = true;
        }
        if (!z) {
            for (int i6 = 0; i6 < i2; i6++) {
                if (cArrM33949[i6] == '\\') {
                    z = true;
                }
            }
        }
        this.f44221 = cArrM33949;
        this.f44205 = i2;
        this.f44216 = this.f44206;
        this.f44207 = z;
        int i7 = iIndexOf + 1;
        this.f44206 = i7;
        this.f44209 = i7 >= this.f44210 ? (char) 26 : str.charAt(i7);
        this.f44222 = 4;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final String m33970() {
        String str;
        int i = this.f44206 + 1;
        String str2 = this.f44211;
        int iIndexOf = str2.indexOf(34, i);
        if (iIndexOf == -1) {
            throw new C4251("unclosed str, " + m33977());
        }
        if (f44203) {
            str = str2.substring(i, iIndexOf);
        } else {
            int i2 = iIndexOf - i;
            str = new String(m33949(this.f44206 + 1, i2), 0, i2);
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
            str = m33927(m33949(this.f44206 + 1, i5), i5);
        }
        int i6 = iIndexOf + 1;
        this.f44206 = i6;
        this.f44209 = i6 >= this.f44210 ? (char) 26 : str2.charAt(i6);
        return str;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m33968() {
        int i;
        boolean z;
        int i2 = this.f44216;
        int i3 = this.f44205 + i2;
        String str = this.f44211;
        int i4 = this.f44210;
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
                throw new NumberFormatException(m33965());
            }
            int i9 = i5 * 10;
            if (i9 < i + i8) {
                throw new NumberFormatException(m33965());
            }
            i5 = i9 - i8;
            i2 = i7;
        }
        if (!z) {
            return -i5;
        }
        if (i2 > this.f44216 + 1) {
            return i5;
        }
        throw new NumberFormatException(m33965());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m33948() {
        return m33930(this.f44216 + 1, this.f44205, this.f44211);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m33931() {
        this.f44216 = this.f44206 - 1;
        this.f44207 = false;
        do {
            this.f44205++;
            m33935();
        } while (Character.isLetterOrDigit(this.f44209));
        String strM33979 = m33979();
        if (strM33979.equals("null")) {
            this.f44222 = 8;
            return;
        }
        if (strM33979.equals("true")) {
            this.f44222 = 6;
            return;
        }
        if (strM33979.equals("false")) {
            this.f44222 = 7;
            return;
        }
        if (strM33979.equals("new")) {
            this.f44222 = 9;
            return;
        }
        if (strM33979.equals("undefined")) {
            this.f44222 = 23;
            return;
        }
        if (strM33979.equals("Set")) {
            this.f44222 = 21;
        } else if (strM33979.equals("TreeSet")) {
            this.f44222 = 22;
        } else {
            this.f44222 = 18;
        }
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final String m33979() {
        if (this.f44207) {
            return m33927(this.f44221, this.f44205);
        }
        return m33932(this.f44216 + 1, this.f44205);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private final String m33932(int i, int i2) {
        char[] cArr = this.f44221;
        int length = cArr.length;
        String str = this.f44211;
        if (i2 < length) {
            str.getChars(i, i + i2, cArr, 0);
            return new String(this.f44221, 0, i2);
        }
        char[] cArr2 = new char[i2];
        str.getChars(i, i2 + i, cArr2, 0);
        return new String(cArr2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final char[] m33949(int i, int i2) {
        char[] cArr = this.f44221;
        int length = cArr.length;
        String str = this.f44211;
        if (i2 < length) {
            str.getChars(i, i2 + i, cArr, 0);
            return this.f44221;
        }
        char[] cArr2 = new char[i2];
        this.f44221 = cArr2;
        str.getChars(i, i2 + i, cArr2, 0);
        return cArr2;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m33959() {
        int i = 0;
        while (true) {
            char cM33939 = m33939(i);
            if (cM33939 == 26) {
                return true;
            }
            if (cM33939 > ' ' || !(cM33939 == ' ' || cM33939 == '\n' || cM33939 == '\r' || cM33939 == '\t' || cM33939 == '\f' || cM33939 == '\b')) {
                return false;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final void m33952() {
        while (true) {
            char c = this.f44209;
            if (c > '/') {
                return;
            }
            if (c == ' ' || c == '\r' || c == '\n' || c == '\t' || c == '\f' || c == '\b') {
                m33935();
            } else if (c != '/') {
                return;
            } else {
                m33957();
            }
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m33963() {
        char c;
        char c2;
        int i = this.f44206;
        this.f44216 = i;
        this.f44217 = false;
        char c3 = this.f44209;
        String str = this.f44211;
        int i2 = this.f44210;
        if (c3 == '-') {
            this.f44205++;
            int i3 = i + 1;
            this.f44206 = i3;
            this.f44209 = i3 >= i2 ? (char) 26 : str.charAt(i3);
        }
        while (true) {
            c = this.f44209;
            if (c < '0' || c > '9') {
                break;
            }
            this.f44205++;
            int i4 = this.f44206 + 1;
            this.f44206 = i4;
            this.f44209 = i4 >= i2 ? (char) 26 : str.charAt(i4);
        }
        this.f44204 = false;
        if (c == '.') {
            this.f44205++;
            int i5 = this.f44206 + 1;
            this.f44206 = i5;
            this.f44209 = i5 >= i2 ? (char) 26 : str.charAt(i5);
            this.f44204 = true;
            while (true) {
                char c4 = this.f44209;
                if (c4 < '0' || c4 > '9') {
                    break;
                }
                this.f44205++;
                int i6 = this.f44206 + 1;
                this.f44206 = i6;
                this.f44209 = i6 >= i2 ? (char) 26 : str.charAt(i6);
            }
        }
        char c5 = this.f44209;
        if (c5 == 'L' || c5 == 'S' || c5 == 'B') {
            this.f44205++;
            m33935();
        } else if (c5 == 'F' || c5 == 'D') {
            this.f44205++;
            m33935();
            this.f44204 = true;
        } else if (c5 == 'e' || c5 == 'E') {
            this.f44205++;
            int i7 = this.f44206 + 1;
            this.f44206 = i7;
            char cCharAt = i7 >= i2 ? (char) 26 : str.charAt(i7);
            this.f44209 = cCharAt;
            if (cCharAt == '+' || cCharAt == '-') {
                this.f44205++;
                int i8 = this.f44206 + 1;
                this.f44206 = i8;
                this.f44209 = i8 >= i2 ? (char) 26 : str.charAt(i8);
            }
            while (true) {
                c2 = this.f44209;
                if (c2 < '0' || c2 > '9') {
                    break;
                }
                this.f44205++;
                int i9 = this.f44206 + 1;
                this.f44206 = i9;
                this.f44209 = i9 >= i2 ? (char) 26 : str.charAt(i9);
            }
            if (c2 == 'D' || c2 == 'F') {
                this.f44205++;
                m33935();
            }
            this.f44217 = true;
            this.f44204 = true;
        }
        if (this.f44204) {
            this.f44222 = 3;
        } else {
            this.f44222 = 2;
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Number m33978() {
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
        int i5 = this.f44206;
        this.f44216 = 0;
        char c4 = this.f44209;
        int i6 = this.f44210;
        String str = this.f44211;
        if (c4 == '-') {
            this.f44216 = 1;
            int i7 = i5 + 1;
            this.f44206 = i7;
            this.f44209 = i7 >= i6 ? (char) 26 : str.charAt(i7);
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
            c = this.f44209;
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
            this.f44216++;
            int i10 = this.f44206 + 1;
            this.f44206 = i10;
            this.f44209 = i10 >= i6 ? (char) 26 : str.charAt(i10);
            i8++;
        }
        Number numberValueOf = null;
        if (c == '.') {
            this.f44216++;
            int i11 = this.f44206 + 1;
            this.f44206 = i11;
            this.f44209 = i11 >= i6 ? (char) 26 : str.charAt(i11);
            i2 = 0;
            char c5 = '9';
            while (true) {
                c3 = this.f44209;
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
                this.f44216++;
                int i13 = this.f44206 + 1;
                this.f44206 = i13;
                this.f44209 = i13 >= i6 ? (char) 26 : str.charAt(i13);
                i8++;
                c5 = '9';
                i = 18;
            }
            if (!z) {
                j6 = -j6;
            }
            if (c3 == 'F' || c3 == 'D') {
                this.f44216++;
                m33935();
            }
            z2 = true;
        } else {
            if (!z) {
                j6 = -j6;
            }
            if (c == 'L') {
                this.f44216++;
                m33935();
                numberValueOf = Long.valueOf(j6);
            } else if (c == 'S') {
                this.f44216++;
                m33935();
                numberValueOf = Short.valueOf((short) j6);
            } else if (c == 'B') {
                this.f44216++;
                m33935();
                numberValueOf = Byte.valueOf((byte) j6);
            } else if (c == 'F') {
                this.f44216++;
                m33935();
                numberValueOf = Float.valueOf(j6);
            } else if (c == 'D') {
                this.f44216++;
                m33935();
                numberValueOf = Double.valueOf(j6);
            }
            z2 = false;
            i2 = 0;
        }
        char c6 = this.f44209;
        if (c6 == 'e' || c6 == 'E') {
            this.f44216++;
            int i14 = this.f44206 + 1;
            this.f44206 = i14;
            char cCharAt = i14 >= i6 ? (char) 26 : str.charAt(i14);
            this.f44209 = cCharAt;
            if (cCharAt == '+' || cCharAt == '-') {
                this.f44216++;
                int i15 = this.f44206 + 1;
                this.f44206 = i15;
                this.f44209 = i15 >= i6 ? (char) 26 : str.charAt(i15);
            }
            while (true) {
                c2 = this.f44209;
                if (c2 < '0' || c2 > '9') {
                    break;
                }
                this.f44216++;
                int i16 = this.f44206 + 1;
                this.f44206 = i16;
                this.f44209 = i16 >= i6 ? (char) 26 : str.charAt(i16);
            }
            if (c2 == 'D' || c2 == 'F') {
                this.f44216++;
                m33935();
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
                int i17 = this.f44206;
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
        int i18 = this.f44206 - i5;
        if (c2 != 0) {
            i18--;
        }
        if (!z3 && (EnumC7234.UseBigDecimal.f23858 & this.f44213) != 0) {
            if (!z4) {
                return BigDecimal.valueOf(j6, i2);
            }
            char[] cArr4 = this.f44221;
            if (i18 < cArr4.length) {
                i4 = 0;
                str.getChars(i5, i5 + i18, cArr4, 0);
                cArr2 = this.f44221;
            } else {
                i4 = 0;
                char[] cArr5 = new char[i18];
                str.getChars(i5, i5 + i18, cArr5, 0);
                cArr2 = cArr5;
            }
            return new BigDecimal(cArr2, i4, i18);
        }
        char[] cArr6 = this.f44221;
        if (i18 < cArr6.length) {
            str.getChars(i5, i5 + i18, cArr6, 0);
            cArr = this.f44221;
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
            throw new C4251(e.getMessage() + ", " + m33977(), (Throwable) e);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m33966() {
        long j;
        boolean z = false;
        this.f44216 = 0;
        char c = this.f44209;
        String str = this.f44211;
        int i = this.f44210;
        if (c == '-') {
            this.f44216 = 1;
            int i2 = this.f44206 + 1;
            this.f44206 = i2;
            if (i2 >= i) {
                throw new C4251("syntax error, " + m33977());
            }
            this.f44209 = str.charAt(i2);
            j = Long.MIN_VALUE;
            z = true;
        } else {
            j = -9223372036854775807L;
        }
        long j2 = 0;
        while (true) {
            char c2 = this.f44209;
            if (c2 < '0' || c2 > '9') {
                break;
            }
            int i3 = c2 - '0';
            if (j2 < -922337203685477580L) {
                StringBuilder sbM8289 = C2458.m8289("error long value, ", ", ", j2);
                sbM8289.append(m33977());
                throw new C4251(sbM8289.toString());
            }
            long j3 = j2 * 10;
            long j4 = i3;
            if (j3 < j + j4) {
                StringBuilder sbM82810 = C2458.m8289("error long value, ", ", ", j3);
                sbM82810.append(m33977());
                throw new C4251(sbM82810.toString());
            }
            j2 = j3 - j4;
            this.f44216++;
            int i4 = this.f44206 + 1;
            this.f44206 = i4;
            this.f44209 = i4 >= i ? (char) 26 : str.charAt(i4);
        }
        return !z ? -j2 : j2;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long m33950() {
        boolean z;
        long j;
        long j2;
        int i = this.f44216;
        int i2 = this.f44205 + i;
        if (m33939(i) == '-') {
            i++;
            j = Long.MIN_VALUE;
            z = true;
        } else {
            z = false;
            j = -9223372036854775807L;
        }
        if (i < i2) {
            long j3 = -(m33939(i) - '0');
            i++;
            j2 = j3;
        } else {
            j2 = 0;
        }
        while (i < i2) {
            int i3 = i + 1;
            char cCharAt = i >= this.f44210 ? (char) 26 : this.f44211.charAt(i);
            if (cCharAt == 'L' || cCharAt == 'S' || cCharAt == 'B') {
                i = i3;
                break;
            }
            int i4 = cCharAt - '0';
            if (j2 < -922337203685477580L) {
                throw new NumberFormatException(m33965());
            }
            long j4 = j2 * 10;
            long j5 = i4;
            if (j4 < j + j5) {
                throw new NumberFormatException(m33965());
            }
            j2 = j4 - j5;
            i = i3;
        }
        if (!z) {
            return -j2;
        }
        if (i > this.f44216 + 1) {
            return j2;
        }
        throw new NumberFormatException(m33965());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Number m33940(boolean z) {
        char[] cArr;
        boolean z2;
        int i = (this.f44216 + this.f44205) - 1;
        int i2 = this.f44210;
        String str = this.f44211;
        char cCharAt = i >= i2 ? (char) 26 : str.charAt(i);
        try {
            if (cCharAt == 'F') {
                return Float.valueOf(Float.parseFloat(m33965()));
            }
            if (cCharAt == 'D') {
                return Double.valueOf(Double.parseDouble(m33965()));
            }
            if (z) {
                return m33953();
            }
            char cCharAt2 = str.charAt((this.f44216 + this.f44205) - 1);
            int i3 = this.f44205;
            if (cCharAt2 == 'L' || cCharAt2 == 'S' || cCharAt2 == 'B' || cCharAt2 == 'F' || cCharAt2 == 'D') {
                i3--;
            }
            int i4 = this.f44216;
            char[] cArr2 = this.f44221;
            int i5 = 0;
            if (i3 < cArr2.length) {
                str.getChars(i4, i4 + i3, cArr2, 0);
                cArr = this.f44221;
            } else {
                char[] cArr3 = new char[i3];
                str.getChars(i4, i4 + i3, cArr3, 0);
                cArr = cArr3;
            }
            if (i3 <= 9 && !this.f44217) {
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
            throw new C4251(e.getMessage() + ", " + m33977());
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final BigDecimal m33953() {
        int i = (this.f44216 + this.f44205) - 1;
        String str = this.f44211;
        char cCharAt = str.charAt(i);
        int i2 = this.f44205;
        if (cCharAt == 'L' || cCharAt == 'S' || cCharAt == 'B' || cCharAt == 'F' || cCharAt == 'D') {
            i2--;
        }
        int i3 = this.f44216;
        char[] cArr = this.f44221;
        if (i2 < cArr.length) {
            str.getChars(i3, i3 + i2, cArr, 0);
            return new BigDecimal(this.f44221, 0, i2);
        }
        char[] cArr2 = new char[i2];
        str.getChars(i3, i2 + i3, cArr2, 0);
        return new BigDecimal(cArr2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m33946(long j) {
        char cCharAt = this.f44209;
        int i = this.f44206 + 1;
        int i2 = 1;
        while (true) {
            String str = this.f44211;
            int i3 = this.f44210;
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
                    this.f44215 = -2;
                    this.f44212 = j2;
                    return false;
                }
                int i5 = i2 + 1;
                int i6 = this.f44206 + i2;
                char cCharAt3 = i6 >= i3 ? (char) 26 : str.charAt(i6);
                while (cCharAt3 != ':') {
                    if (cCharAt3 <= ' ' && (cCharAt3 == ' ' || cCharAt3 == '\n' || cCharAt3 == '\r' || cCharAt3 == '\t' || cCharAt3 == '\f' || cCharAt3 == '\b')) {
                        int i7 = i5 + 1;
                        int i8 = this.f44206 + i5;
                        cCharAt3 = i8 >= i3 ? (char) 26 : str.charAt(i8);
                        i5 = i7;
                    } else {
                        throw new C4251("match feild error expect ':'");
                    }
                }
                int i9 = this.f44206 + i5;
                char cCharAt4 = i9 >= i3 ? (char) 26 : str.charAt(i9);
                if (cCharAt4 == '{') {
                    int i10 = i9 + 1;
                    this.f44206 = i10;
                    this.f44209 = i10 < i3 ? str.charAt(i10) : (char) 26;
                    this.f44222 = 12;
                } else if (cCharAt4 == '[') {
                    int i11 = i9 + 1;
                    this.f44206 = i11;
                    this.f44209 = i11 < i3 ? str.charAt(i11) : (char) 26;
                    this.f44222 = 14;
                } else {
                    this.f44206 = i9;
                    this.f44209 = i9 < i3 ? str.charAt(i9) : (char) 26;
                    m33956();
                }
                return true;
            }
            if (cCharAt > ' ' || !(cCharAt == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t' || cCharAt == '\f' || cCharAt == '\b')) {
                break;
            }
            int i12 = i2 + 1;
            int i13 = this.f44206 + i2;
            cCharAt = i13 >= i3 ? (char) 26 : str.charAt(i13);
            i2 = i12;
        }
        this.f44212 = 0L;
        this.f44215 = -2;
        return false;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private int m33934(long j) {
        String str;
        int i;
        char cCharAt = this.f44209;
        int i2 = 1;
        while (true) {
            str = this.f44211;
            i = this.f44210;
            if (cCharAt == '\"' || cCharAt == '\'') {
                break;
            }
            if (cCharAt == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t' || cCharAt == '\f' || cCharAt == '\b') {
                int i3 = i2 + 1;
                int i4 = this.f44206 + i2;
                cCharAt = i4 >= i ? (char) 26 : str.charAt(i4);
                i2 = i3;
            } else {
                this.f44212 = 0L;
                this.f44215 = -2;
                return 0;
            }
        }
        long j2 = -3750763034362895579L;
        for (int i5 = this.f44206 + i2; i5 < i; i5++) {
            char cCharAt2 = str.charAt(i5);
            if (cCharAt2 == cCharAt) {
                i2 += (i5 - this.f44206) - i2;
                break;
            }
            j2 = (j2 ^ ((long) cCharAt2)) * 1099511628211L;
        }
        if (j2 != j) {
            this.f44212 = j2;
            this.f44215 = -2;
            return 0;
        }
        int i6 = i2 + 1;
        int i7 = this.f44206 + i6;
        char cCharAt3 = i7 >= i ? (char) 26 : str.charAt(i7);
        while (cCharAt3 != ':') {
            if (cCharAt3 <= ' ' && (cCharAt3 == ' ' || cCharAt3 == '\n' || cCharAt3 == '\r' || cCharAt3 == '\t' || cCharAt3 == '\f' || cCharAt3 == '\b')) {
                int i8 = i6 + 1;
                int i9 = this.f44206 + i6;
                cCharAt3 = i9 >= i ? (char) 26 : str.charAt(i9);
                i6 = i8;
            } else {
                throw new C4251("match feild error expect ':'");
            }
        }
        return i6 + 1;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m33955(long j) {
        int i;
        char cCharAt;
        this.f44215 = 0;
        int iM33934 = m33934(j);
        if (iM33934 == 0) {
            return 0;
        }
        int i2 = iM33934 + 1;
        int i3 = this.f44206 + iM33934;
        String str = this.f44211;
        int i4 = this.f44210;
        char cCharAt2 = i3 >= i4 ? (char) 26 : str.charAt(i3);
        boolean z = cCharAt2 == '\"';
        if (z) {
            int i5 = iM33934 + 2;
            int i6 = this.f44206 + i2;
            cCharAt2 = i6 >= i4 ? (char) 26 : str.charAt(i6);
            z = true;
            i2 = i5;
        }
        boolean z2 = cCharAt2 == '-';
        if (z2) {
            int i7 = i2 + 1;
            int i8 = this.f44206 + i2;
            cCharAt2 = i8 >= i4 ? (char) 26 : str.charAt(i8);
            i2 = i7;
        }
        if (cCharAt2 < '0' || cCharAt2 > '9') {
            this.f44215 = -1;
            return 0;
        }
        int i9 = cCharAt2 - '0';
        while (true) {
            i = i2 + 1;
            int i10 = this.f44206 + i2;
            cCharAt = i10 >= i4 ? (char) 26 : str.charAt(i10);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            i9 = (i9 * 10) + (cCharAt - '0');
            i2 = i;
        }
        if (cCharAt == '.') {
            this.f44215 = -1;
            return 0;
        }
        if (cCharAt == '\"') {
            if (!z) {
                this.f44215 = -1;
                return 0;
            }
            int i11 = i2 + 2;
            int i12 = this.f44206 + i;
            cCharAt = i12 >= i4 ? (char) 26 : str.charAt(i12);
            i = i11;
        }
        if (i9 < 0) {
            this.f44215 = -1;
            return 0;
        }
        while (cCharAt != ',') {
            if (cCharAt > ' ' || !(cCharAt == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t' || cCharAt == '\f' || cCharAt == '\b')) {
                if (cCharAt == '}') {
                    char cM33939 = m33939(this.f44206 + i);
                    if (cM33939 == ',') {
                        this.f44222 = 16;
                        int i13 = this.f44206 + i + 1;
                        this.f44206 = i13;
                        this.f44209 = i13 < i4 ? str.charAt(i13) : (char) 26;
                    } else if (cM33939 == ']') {
                        this.f44222 = 15;
                        int i14 = this.f44206 + i + 1;
                        this.f44206 = i14;
                        this.f44209 = i14 < i4 ? str.charAt(i14) : (char) 26;
                    } else if (cM33939 == '}') {
                        this.f44222 = 13;
                        int i15 = this.f44206 + i + 1;
                        this.f44206 = i15;
                        this.f44209 = i15 < i4 ? str.charAt(i15) : (char) 26;
                    } else if (cM33939 == 26) {
                        this.f44222 = 20;
                        this.f44206 += i;
                        this.f44209 = (char) 26;
                    } else {
                        this.f44215 = -1;
                        return 0;
                    }
                    this.f44215 = 4;
                    if (z2) {
                        return -i9;
                    }
                    return i9;
                }
                this.f44215 = -1;
                return 0;
            }
            int i16 = i + 1;
            int i17 = this.f44206 + i;
            cCharAt = i17 >= i4 ? (char) 26 : str.charAt(i17);
            i = i16;
        }
        int i18 = (i - 1) + this.f44206 + 1;
        this.f44206 = i18;
        this.f44209 = i18 < i4 ? str.charAt(i18) : (char) 26;
        this.f44215 = 3;
        this.f44222 = 16;
        if (z2) {
            return -i9;
        }
        return i9;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int[] m33981(long j) {
        int i;
        boolean z;
        int i2;
        char cCharAt;
        char cCharAt2;
        int i3;
        int i4;
        int[] iArr;
        this.f44215 = 0;
        int iM33934 = m33934(j);
        int[] iArr2 = null;
        if (iM33934 == 0) {
            return null;
        }
        int i5 = iM33934 + 1;
        int i6 = this.f44206 + iM33934;
        String str = this.f44211;
        int i7 = this.f44210;
        if ((i6 >= i7 ? (char) 26 : str.charAt(i6)) != '[') {
            this.f44215 = -1;
            return null;
        }
        int i8 = iM33934 + 2;
        int i9 = this.f44206 + i5;
        char cCharAt3 = i9 >= i7 ? (char) 26 : str.charAt(i9);
        int[] iArr3 = new int[16];
        if (cCharAt3 == ']') {
            i3 = iM33934 + 3;
            int i10 = this.f44206 + i8;
            cCharAt2 = i10 >= i7 ? (char) 26 : str.charAt(i10);
            i4 = 0;
        } else {
            int i11 = 0;
            while (true) {
                if (cCharAt3 == '-') {
                    i = i8 + 1;
                    int i12 = this.f44206 + i8;
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
                        int i14 = this.f44206 + i;
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
                        int i17 = this.f44206 + i2;
                        cCharAt3 = i17 >= i7 ? (char) 26 : str.charAt(i17);
                        i8 = i16;
                        iArr = null;
                    } else {
                        if (cCharAt == ']') {
                            int i18 = i + 2;
                            int i19 = this.f44206 + i2;
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
                    this.f44215 = -1;
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
            this.f44206 = (i3 - 1) + this.f44206;
            m33935();
            this.f44215 = 3;
            this.f44222 = 16;
            return iArr3;
        }
        if (cCharAt2 == '}') {
            char cM33939 = m33939(this.f44206 + i3);
            if (cM33939 == ',') {
                this.f44222 = 16;
                this.f44206 += i3;
                m33935();
            } else if (cM33939 == ']') {
                this.f44222 = 15;
                this.f44206 += i3;
                m33935();
            } else if (cM33939 == '}') {
                this.f44222 = 13;
                this.f44206 += i3;
                m33935();
            } else if (cM33939 == 26) {
                this.f44206 += i3;
                this.f44222 = 20;
                this.f44209 = (char) 26;
            } else {
                this.f44215 = -1;
                return null;
            }
            this.f44215 = 4;
            return iArr3;
        }
        this.f44215 = -1;
        return null;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final long m33964(long j) {
        int i;
        char cCharAt;
        this.f44215 = 0;
        int iM33934 = m33934(j);
        if (iM33934 == 0) {
            return 0L;
        }
        int i2 = iM33934 + 1;
        int i3 = this.f44206 + iM33934;
        String str = this.f44211;
        int i4 = this.f44210;
        char cCharAt2 = i3 >= i4 ? (char) 26 : str.charAt(i3);
        boolean z = cCharAt2 == '\"';
        if (z) {
            int i5 = iM33934 + 2;
            int i6 = this.f44206 + i2;
            cCharAt2 = i6 >= i4 ? (char) 26 : str.charAt(i6);
            i2 = i5;
        }
        boolean z2 = cCharAt2 == '-';
        if (z2) {
            int i7 = i2 + 1;
            int i8 = this.f44206 + i2;
            i2 = i7;
            cCharAt2 = i8 >= i4 ? (char) 26 : str.charAt(i8);
        }
        if (cCharAt2 < '0' || cCharAt2 > '9') {
            this.f44215 = -1;
            return 0L;
        }
        long j2 = cCharAt2 - '0';
        while (true) {
            i = i2 + 1;
            int i9 = this.f44206 + i2;
            cCharAt = i9 >= i4 ? (char) 26 : str.charAt(i9);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            j2 = (j2 * 10) + ((long) (cCharAt - '0'));
            i2 = i;
        }
        if (cCharAt == '.') {
            this.f44215 = -1;
            return 0L;
        }
        if (cCharAt == '\"') {
            if (!z) {
                this.f44215 = -1;
                return 0L;
            }
            int i10 = i2 + 2;
            int i11 = this.f44206 + i;
            cCharAt = i11 >= i4 ? (char) 26 : str.charAt(i11);
            i = i10;
        }
        if (j2 < 0) {
            this.f44215 = -1;
            return 0L;
        }
        if (cCharAt == ',') {
            int i12 = (i - 1) + this.f44206 + 1;
            this.f44206 = i12;
            this.f44209 = i12 < i4 ? str.charAt(i12) : (char) 26;
            this.f44215 = 3;
            this.f44222 = 16;
            if (z2) {
                return -j2;
            }
        } else if (cCharAt == '}') {
            char cM33939 = m33939(this.f44206 + i);
            if (cM33939 == ',') {
                this.f44222 = 16;
                int i13 = this.f44206 + i + 1;
                this.f44206 = i13;
                this.f44209 = i13 < i4 ? str.charAt(i13) : (char) 26;
            } else if (cM33939 == ']') {
                this.f44222 = 15;
                int i14 = this.f44206 + i + 1;
                this.f44206 = i14;
                this.f44209 = i14 < i4 ? str.charAt(i14) : (char) 26;
            } else if (cM33939 == '}') {
                this.f44222 = 13;
                int i15 = this.f44206 + i + 1;
                this.f44206 = i15;
                this.f44209 = i15 < i4 ? str.charAt(i15) : (char) 26;
            } else if (cM33939 == 26) {
                this.f44222 = 20;
                this.f44206 += i;
                this.f44209 = (char) 26;
            } else {
                this.f44215 = -1;
                return 0L;
            }
            this.f44215 = 4;
            if (z2) {
                return -j2;
            }
        } else {
            this.f44215 = -1;
            return 0L;
        }
        return j2;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m33967(long j) {
        String str;
        this.f44215 = 0;
        int iM33934 = m33934(j);
        if (iM33934 == 0) {
            return null;
        }
        int i = iM33934 + 1;
        int i2 = this.f44206 + iM33934;
        int i3 = this.f44210;
        if (i2 >= i3) {
            throw new C4251("unclosed str, " + m33977());
        }
        String str2 = this.f44211;
        char cCharAt = str2.charAt(i2);
        String str3 = this.f44218;
        if (cCharAt != '\"') {
            this.f44215 = -1;
            return str3;
        }
        int i4 = this.f44206 + i;
        int iIndexOf = str2.indexOf(34, i4);
        if (iIndexOf == -1) {
            throw new C4251("unclosed str, " + m33977());
        }
        if (f44203) {
            str = str2.substring(i4, iIndexOf);
        } else {
            int i5 = iIndexOf - i4;
            str = new String(m33949(this.f44206 + i, i5), 0, i5);
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
            char[] cArrM33949 = m33949(this.f44206 + i, i8);
            if (z) {
                str = m33927(cArrM33949, i8);
            } else {
                str = new String(cArrM33949, 0, i8);
                if (str.indexOf(92) != -1) {
                    str = m33927(cArrM33949, i8);
                }
            }
        }
        int i9 = iIndexOf + 1;
        char cCharAt2 = i9 >= i3 ? (char) 26 : str2.charAt(i9);
        if (cCharAt2 == ',') {
            int i10 = iIndexOf + 2;
            this.f44206 = i10;
            this.f44209 = i10 < i3 ? str2.charAt(i10) : (char) 26;
            this.f44215 = 3;
            this.f44222 = 16;
            return str;
        }
        if (cCharAt2 == '}') {
            int i11 = iIndexOf + 2;
            char cCharAt3 = i11 >= i3 ? (char) 26 : str2.charAt(i11);
            if (cCharAt3 == ',') {
                this.f44222 = 16;
                this.f44206 = i11;
                m33935();
            } else if (cCharAt3 == ']') {
                this.f44222 = 15;
                this.f44206 = i11;
                m33935();
            } else if (cCharAt3 == '}') {
                this.f44222 = 13;
                this.f44206 = i11;
                m33935();
            } else if (cCharAt3 == 26) {
                this.f44222 = 20;
                this.f44206 = i11;
                this.f44209 = (char) 26;
            } else {
                this.f44215 = -1;
                return str3;
            }
            this.f44215 = 4;
            return str;
        }
        this.f44215 = -1;
        return str3;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Date m33954(long j) {
        int i;
        char cCharAt;
        char cCharAt2;
        int i2;
        Date date;
        this.f44215 = 0;
        int iM33934 = m33934(j);
        if (iM33934 == 0) {
            return null;
        }
        int i3 = this.f44206;
        char c = this.f44209;
        int i4 = iM33934 + 1;
        int i5 = i3 + iM33934;
        int i6 = this.f44210;
        String str = this.f44211;
        char cCharAt3 = i5 >= i6 ? (char) 26 : str.charAt(i5);
        if (cCharAt3 == '\"') {
            int i7 = this.f44206;
            int i8 = i7 + i4;
            int i9 = iM33934 + 2;
            int i10 = i7 + i4;
            if (i10 < i6) {
                str.charAt(i10);
            }
            int iIndexOf = str.indexOf(34, this.f44206 + i9);
            if (iIndexOf == -1) {
                throw new C4251("unclosed str");
            }
            int i11 = iIndexOf - i8;
            this.f44206 = i8;
            if (m33945(i11, false)) {
                date = this.f44219.getTime();
                int i12 = i9 + i11;
                i2 = i12 + 1;
                cCharAt2 = m33939(i12 + i3);
                this.f44206 = i3;
            } else {
                this.f44206 = i3;
                this.f44215 = -1;
                return null;
            }
        } else {
            if (cCharAt3 < '0' || cCharAt3 > '9') {
                this.f44215 = -1;
                return null;
            }
            long j2 = cCharAt3 - '0';
            while (true) {
                i = i4 + 1;
                int i13 = this.f44206 + i4;
                cCharAt = i13 >= i6 ? (char) 26 : str.charAt(i13);
                if (cCharAt < '0' || cCharAt > '9') {
                    break;
                }
                j2 = (j2 * 10) + ((long) (cCharAt - '0'));
                i4 = i;
            }
            if (cCharAt == '.') {
                this.f44215 = -1;
                return null;
            }
            if (cCharAt == '\"') {
                i2 = i4 + 2;
                int i14 = this.f44206 + i;
                cCharAt2 = i14 >= i6 ? (char) 26 : str.charAt(i14);
            } else {
                cCharAt2 = cCharAt;
                i2 = i;
            }
            if (j2 < 0) {
                this.f44215 = -1;
                return null;
            }
            date = new Date(j2);
        }
        if (cCharAt2 == ',') {
            int i15 = (i2 - 1) + this.f44206 + 1;
            this.f44206 = i15;
            this.f44209 = i15 < i6 ? str.charAt(i15) : (char) 26;
            this.f44215 = 3;
            this.f44222 = 16;
            return date;
        }
        if (cCharAt2 == '}') {
            char cM33939 = m33939(this.f44206 + i2);
            if (cM33939 == ',') {
                this.f44222 = 16;
                int i16 = this.f44206 + i2 + 1;
                this.f44206 = i16;
                this.f44209 = i16 < i6 ? str.charAt(i16) : (char) 26;
            } else if (cM33939 == ']') {
                this.f44222 = 15;
                int i17 = this.f44206 + i2 + 1;
                this.f44206 = i17;
                this.f44209 = i17 < i6 ? str.charAt(i17) : (char) 26;
            } else if (cM33939 == '}') {
                this.f44222 = 13;
                int i18 = this.f44206 + i2 + 1;
                this.f44206 = i18;
                this.f44209 = i18 < i6 ? str.charAt(i18) : (char) 26;
            } else if (cM33939 == 26) {
                this.f44222 = 20;
                this.f44206 += i2;
                this.f44209 = (char) 26;
            } else {
                this.f44206 = i3;
                this.f44209 = c;
                this.f44215 = -1;
                return null;
            }
            this.f44215 = 4;
            return date;
        }
        this.f44206 = i3;
        this.f44209 = c;
        this.f44215 = -1;
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
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m33974(long j) {
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        char cCharAt;
        char cM33939;
        this.f44215 = 0;
        int iM33934 = m33934(j);
        if (iM33934 == 0) {
            return false;
        }
        int i5 = this.f44206 + iM33934;
        String str = this.f44211;
        if (!str.startsWith("false", i5)) {
            if (str.startsWith("true", this.f44206 + iM33934)) {
                i = iM33934 + 4;
            } else if (str.startsWith("\"false\"", this.f44206 + iM33934)) {
                i = iM33934 + 7;
            } else if (str.startsWith("\"true\"", this.f44206 + iM33934)) {
                i = iM33934 + 6;
            } else if (str.charAt(this.f44206 + iM33934) == '1') {
                i = iM33934 + 1;
            } else if (str.charAt(this.f44206 + iM33934) == '0') {
                i = iM33934 + 1;
            } else if (str.startsWith("\"1\"", this.f44206 + iM33934)) {
                i = iM33934 + 3;
            } else {
                if (!str.startsWith("\"0\"", this.f44206 + iM33934)) {
                    this.f44215 = -1;
                    return false;
                }
                i = iM33934 + 3;
            }
            z = true;
            i2 = i + 1;
            i3 = this.f44206 + i;
            i4 = this.f44210;
            if (i3 >= i4) {
                cCharAt = 26;
            } else {
                cCharAt = str.charAt(i3);
            }
            while (cCharAt != ',') {
                if (cCharAt != '}' || (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t' && cCharAt != '\f' && cCharAt != '\b')) {
                    break;
                    if (cCharAt == '}') {
                        cM33939 = m33939(this.f44206 + i2);
                        if (cM33939 == ',') {
                            this.f44222 = 16;
                            int i6 = this.f44206 + i2 + 1;
                            this.f44206 = i6;
                            this.f44209 = i6 < i4 ? str.charAt(i6) : (char) 26;
                        } else if (cM33939 == ']') {
                            this.f44222 = 15;
                            int i7 = this.f44206 + i2 + 1;
                            this.f44206 = i7;
                            this.f44209 = i7 < i4 ? str.charAt(i7) : (char) 26;
                        } else if (cM33939 == '}') {
                            this.f44222 = 13;
                            int i8 = this.f44206 + i2 + 1;
                            this.f44206 = i8;
                            this.f44209 = i8 < i4 ? str.charAt(i8) : (char) 26;
                        } else if (cM33939 == 26) {
                            this.f44222 = 20;
                            this.f44206 += i2;
                            this.f44209 = (char) 26;
                        } else {
                            this.f44215 = -1;
                            return false;
                        }
                        this.f44215 = 4;
                        return z;
                    }
                    this.f44215 = -1;
                    return false;
                }
                int i9 = i2 + 1;
                int i10 = this.f44206 + i2;
                cCharAt = i10 >= i4 ? (char) 26 : str.charAt(i10);
                i2 = i9;
            }
            int i11 = (i2 - 1) + this.f44206 + 1;
            this.f44206 = i11;
            this.f44209 = i11 < i4 ? str.charAt(i11) : (char) 26;
            this.f44215 = 3;
            this.f44222 = 16;
            return z;
        }
        i = iM33934 + 5;
        z = false;
        i2 = i + 1;
        i3 = this.f44206 + i;
        i4 = this.f44210;
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
            cM33939 = m33939(this.f44206 + i2);
            if (cM33939 == ',') {
                this.f44222 = 16;
                int i12 = this.f44206 + i2 + 1;
                this.f44206 = i12;
                this.f44209 = i12 < i4 ? str.charAt(i12) : (char) 26;
            } else if (cM33939 == ']') {
                this.f44222 = 15;
                int i13 = this.f44206 + i2 + 1;
                this.f44206 = i13;
                this.f44209 = i13 < i4 ? str.charAt(i13) : (char) 26;
            } else if (cM33939 == '}') {
                this.f44222 = 13;
                int i14 = this.f44206 + i2 + 1;
                this.f44206 = i14;
                this.f44209 = i14 < i4 ? str.charAt(i14) : (char) 26;
            } else if (cM33939 == 26) {
                this.f44222 = 20;
                this.f44206 += i2;
                this.f44209 = (char) 26;
            } else {
                this.f44215 = -1;
                return false;
            }
            this.f44215 = 4;
            return z;
        }
        this.f44215 = -1;
        return false;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final float m33958(long j) {
        int i;
        char cM33939;
        int i2;
        float f;
        float f2;
        this.f44215 = 0;
        int iM33934 = m33934(j);
        if (iM33934 == 0) {
            return 0.0f;
        }
        int i3 = iM33934 + 1;
        char cM339310 = m33939(this.f44206 + iM33934);
        int i4 = this.f44206;
        int i5 = (i4 + i3) - 1;
        boolean z = cM339310 == '-';
        if (z) {
            cM339310 = m33939(i4 + i3);
            i3 = iM33934 + 2;
        }
        if (cM339310 >= '0' && cM339310 <= '9') {
            int i6 = cM339310 - '0';
            while (true) {
                i = i3 + 1;
                cM33939 = m33939(this.f44206 + i3);
                if (cM33939 < '0' || cM33939 > '9') {
                    break;
                }
                i6 = (i6 * 10) + (cM33939 - '0');
                i3 = i;
            }
            if (cM33939 == '.') {
                int i7 = i3 + 2;
                char cM339311 = m33939(this.f44206 + i);
                if (cM339311 < '0' || cM339311 > '9') {
                    this.f44215 = -1;
                    return 0.0f;
                }
                i2 = 10;
                i6 = (cM339311 - '0') + (i6 * 10);
                while (true) {
                    i = i7 + 1;
                    cM33939 = m33939(this.f44206 + i7);
                    if (cM33939 < '0' || cM33939 > '9') {
                        break;
                    }
                    i6 = (i6 * 10) + (cM33939 - '0');
                    i2 *= 10;
                    i7 = i;
                }
            } else {
                i2 = 1;
            }
            boolean z2 = cM33939 == 'e' || cM33939 == 'E';
            if (z2) {
                int i8 = i + 1;
                char cM339312 = m33939(this.f44206 + i);
                f = 0.0f;
                if (cM339312 == '+' || cM339312 == '-') {
                    i += 2;
                    cM339312 = m33939(this.f44206 + i8);
                } else {
                    i = i8;
                }
                cM33939 = cM339312;
                while (cM33939 >= '0' && cM33939 <= '9') {
                    cM33939 = m33939(this.f44206 + i);
                    i++;
                }
            } else {
                f = 0.0f;
            }
            int i9 = ((this.f44206 + i) - i5) - 1;
            if (z2 || i9 >= 10) {
                f2 = Float.parseFloat(m33932(i5, i9));
            } else {
                f2 = i6 / i2;
                if (z) {
                    f2 = -f2;
                }
            }
            if (cM33939 == ',') {
                this.f44206 = (i - 1) + this.f44206;
                m33935();
                this.f44215 = 3;
                this.f44222 = 16;
                return f2;
            }
            if (cM33939 == '}') {
                char cM339313 = m33939(this.f44206 + i);
                if (cM339313 == ',') {
                    this.f44222 = 16;
                    this.f44206 += i;
                    m33935();
                } else if (cM339313 == ']') {
                    this.f44222 = 15;
                    this.f44206 += i;
                    m33935();
                } else if (cM339313 == '}') {
                    this.f44222 = 13;
                    this.f44206 += i;
                    m33935();
                } else if (cM339313 == 26) {
                    this.f44206 += i;
                    this.f44222 = 20;
                    this.f44209 = (char) 26;
                } else {
                    this.f44215 = -1;
                    return f;
                }
                this.f44215 = 4;
                return f2;
            }
            this.f44215 = -1;
            return f;
        }
        this.f44215 = -1;
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final float[] m33951(long j) {
        int i;
        char cCharAt;
        int i2;
        int i3;
        float f;
        char c;
        this.f44215 = 0;
        int iM33934 = m33934(j);
        if (iM33934 == 0) {
            return null;
        }
        int i4 = iM33934 + 1;
        int i5 = this.f44206 + iM33934;
        String str = this.f44211;
        int i6 = this.f44210;
        int i7 = -1;
        if ((i5 >= i6 ? (char) 26 : str.charAt(i5)) != '[') {
            this.f44215 = -1;
            return null;
        }
        int i8 = iM33934 + 2;
        int i9 = this.f44206 + i4;
        char cCharAt2 = i9 >= i6 ? (char) 26 : str.charAt(i9);
        float[] fArr = new float[16];
        int i10 = 0;
        while (true) {
            int i11 = this.f44206;
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
                int i16 = this.f44206 + i8;
                cCharAt = i16 >= i6 ? (char) 26 : str.charAt(i16);
                if (cCharAt < '0' || cCharAt > '9') {
                    break;
                }
                i15 = (i15 * 10) + (cCharAt - '0');
                i8 = i;
            }
            if (cCharAt == '.') {
                int i17 = i8 + 2;
                int i18 = this.f44206 + i;
                char cCharAt3 = i18 >= i6 ? (char) 26 : str.charAt(i18);
                if (cCharAt3 < '0' || cCharAt3 > '9') {
                    this.f44215 = i7;
                    return null;
                }
                i15 = (cCharAt3 - '0') + (i15 * 10);
                i2 = 10;
                while (true) {
                    i = i17 + 1;
                    int i19 = this.f44206 + i17;
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
                int i21 = this.f44206 + i;
                cCharAt = i21 >= i6 ? (char) 26 : str.charAt(i21);
                if (cCharAt == '+' || cCharAt == '-') {
                    i += 2;
                    int i22 = this.f44206 + i20;
                    cCharAt = i22 >= i6 ? (char) 26 : str.charAt(i22);
                    c = '9';
                    z2 = z2;
                } else {
                    i = i20;
                    c = '9';
                }
                while (cCharAt >= '0' && cCharAt <= c) {
                    int i23 = i + 1;
                    int i24 = this.f44206 + i;
                    i = i23;
                    cCharAt = i24 >= i6 ? (char) 26 : str.charAt(i24);
                    c = c;
                    z2 = z2;
                }
                i3 = 10;
            } else {
                i3 = 10;
            }
            int i25 = ((this.f44206 + i) - i12) - 1;
            if (z2 || i25 >= i3) {
                f = Float.parseFloat(m33932(i12, i25));
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
                int i28 = this.f44206 + i;
                cCharAt = i28 >= i6 ? (char) 26 : str.charAt(i28);
                i8 = i27;
            } else {
                if (cCharAt == ']') {
                    int i29 = i + 1;
                    int i30 = this.f44206 + i;
                    char cCharAt4 = i30 >= i6 ? (char) 26 : str.charAt(i30);
                    if (i26 != fArr.length) {
                        float[] fArr3 = new float[i26];
                        System.arraycopy(fArr, 0, fArr3, 0, i26);
                        fArr = fArr3;
                    }
                    if (cCharAt4 == ',') {
                        this.f44206 += i;
                        m33935();
                        this.f44215 = 3;
                        this.f44222 = 16;
                        return fArr;
                    }
                    if (cCharAt4 == '}') {
                        int i31 = this.f44206 + i29;
                        char cCharAt5 = i31 >= i6 ? (char) 26 : str.charAt(i31);
                        if (cCharAt5 == ',') {
                            this.f44222 = 16;
                            this.f44206 = i + 1 + this.f44206;
                            m33935();
                        } else if (cCharAt5 == ']') {
                            this.f44222 = 15;
                            this.f44206 = i + 1 + this.f44206;
                            m33935();
                        } else if (cCharAt5 == '}') {
                            this.f44222 = 13;
                            this.f44206 = i + 1 + this.f44206;
                            m33935();
                        } else if (cCharAt5 == 26) {
                            this.f44206 = i + 1 + this.f44206;
                            this.f44222 = 20;
                            this.f44209 = (char) 26;
                        } else {
                            this.f44215 = -1;
                            return null;
                        }
                        this.f44215 = 4;
                        return fArr;
                    }
                    this.f44215 = -1;
                    return null;
                }
                i8 = i;
            }
            i7 = -1;
            i10 = i26;
            cCharAt2 = cCharAt;
        }
        this.f44215 = -1;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:96:0x0123  */
    /* JADX WARN: Code duplicated, block: B:97:0x0126  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float[][] m33936(long j) {
        int i;
        char cCharAt;
        int i2;
        float f;
        int i3;
        int i4;
        char cCharAt2;
        this.f44215 = 0;
        int iM33934 = m33934(j);
        if (iM33934 == 0) {
            return null;
        }
        int i5 = iM33934 + 1;
        int i6 = this.f44206 + iM33934;
        String str = this.f44211;
        int i7 = this.f44210;
        char c = '[';
        int i8 = -1;
        if ((i6 >= i7 ? (char) 26 : str.charAt(i6)) != '[') {
            this.f44215 = -1;
            return null;
        }
        int i9 = iM33934 + 2;
        int i10 = this.f44206 + i5;
        char cCharAt3 = i10 >= i7 ? (char) 26 : str.charAt(i10);
        int i11 = 16;
        float[][] fArr = new float[16][];
        int i12 = 0;
        loop0: while (true) {
            if (cCharAt3 == c) {
                int i13 = i9 + 1;
                int i14 = this.f44206 + i9;
                char cCharAt4 = i14 >= i7 ? (char) 26 : str.charAt(i14);
                float[] fArr2 = new float[i11];
                int i15 = 0;
                while (true) {
                    int i16 = this.f44206;
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
                        int i20 = this.f44206 + i13;
                        cCharAt = i20 >= i7 ? (char) 26 : str.charAt(i20);
                        if (cCharAt < '0' || cCharAt > '9') {
                            break;
                        }
                        i19 = (i19 * 10) + (cCharAt - '0');
                        i13 = i;
                    }
                    if (cCharAt == '.') {
                        int i21 = i13 + 2;
                        int i22 = this.f44206 + i;
                        char cCharAt5 = i22 >= i7 ? (char) 26 : str.charAt(i22);
                        if (cCharAt5 < '0' || cCharAt5 > '9') {
                            this.f44215 = i8;
                            return null;
                        }
                        i19 = (cCharAt5 - '0') + (i19 * 10);
                        i2 = 10;
                        while (true) {
                            i = i21 + 1;
                            int i23 = this.f44206 + i21;
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
                        int i25 = this.f44206 + i;
                        char cCharAt6 = i25 >= i7 ? (char) 26 : str.charAt(i25);
                        if (cCharAt6 == '+' || cCharAt6 == '-') {
                            i += 2;
                            int i26 = this.f44206 + i24;
                            if (i26 >= i7) {
                                cCharAt = 26;
                            } else {
                                cCharAt6 = str.charAt(i26);
                            }
                            while (cCharAt >= '0' && cCharAt <= '9') {
                                int i27 = i + 1;
                                i4 = this.f44206 + i;
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
                            i4 = this.f44206 + i;
                            if (i4 >= i7) {
                                cCharAt2 = 26;
                            } else {
                                cCharAt2 = str.charAt(i4);
                            }
                            i = i28;
                            cCharAt = cCharAt2;
                        }
                    }
                    int i29 = ((this.f44206 + i) - i17) - 1;
                    if (z2 || i29 >= 10) {
                        f = Float.parseFloat(m33932(i17, i29));
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
                        int i32 = this.f44206 + i;
                        cCharAt4 = i32 >= i7 ? (char) 26 : str.charAt(i32);
                        i13 = i31;
                    } else {
                        if (cCharAt == ']') {
                            int i33 = i + 1;
                            int i34 = this.f44206 + i;
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
                                int i37 = this.f44206 + i33;
                                cCharAt3 = i37 >= i7 ? (char) 26 : str.charAt(i37);
                                i9 = i36;
                            } else {
                                if (cCharAt7 == ']') {
                                    int i38 = i + 2;
                                    int i39 = this.f44206 + i33;
                                    char cCharAt8 = i39 >= i7 ? (char) 26 : str.charAt(i39);
                                    if (i35 != fArr.length) {
                                        float[][] fArr5 = new float[i35][];
                                        System.arraycopy(fArr, 0, fArr5, 0, i35);
                                        fArr = fArr5;
                                    }
                                    if (cCharAt8 == ',') {
                                        this.f44206 = i + 1 + this.f44206;
                                        m33935();
                                        this.f44215 = 3;
                                        this.f44222 = 16;
                                        return fArr;
                                    }
                                    if (cCharAt8 == '}') {
                                        char cM33939 = m33939(this.f44206 + i38);
                                        if (cM33939 == ',') {
                                            this.f44222 = 16;
                                            this.f44206 = i + 2 + this.f44206;
                                            m33935();
                                        } else if (cM33939 == ']') {
                                            this.f44222 = 15;
                                            this.f44206 = i + 2 + this.f44206;
                                            m33935();
                                        } else if (cM33939 == '}') {
                                            this.f44222 = 13;
                                            this.f44206 = i + 2 + this.f44206;
                                            m33935();
                                        } else if (cM33939 == 26) {
                                            this.f44206 = i + 2 + this.f44206;
                                            this.f44222 = 20;
                                            this.f44209 = (char) 26;
                                        } else {
                                            this.f44215 = -1;
                                            return null;
                                        }
                                        this.f44215 = 4;
                                        return fArr;
                                    }
                                    this.f44215 = -1;
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
        this.f44215 = i8;
        return null;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final double m33976(long j) {
        int i;
        char cM33939;
        int i2;
        double d;
        int i3;
        char cM339310;
        this.f44215 = 0;
        int iM33934 = m33934(j);
        if (iM33934 == 0) {
            return 0.0d;
        }
        int i4 = iM33934 + 1;
        char cM339311 = m33939(this.f44206 + iM33934);
        int i5 = this.f44206;
        int i6 = (i5 + i4) - 1;
        boolean z = cM339311 == '-';
        if (z) {
            cM339311 = m33939(i5 + i4);
            i4 = iM33934 + 2;
        }
        if (cM339311 >= '0' && cM339311 <= '9') {
            int i7 = cM339311 - '0';
            while (true) {
                i = i4 + 1;
                cM33939 = m33939(this.f44206 + i4);
                if (cM33939 < '0' || cM33939 > '9') {
                    break;
                }
                i7 = (i7 * 10) + (cM33939 - '0');
                i4 = i;
            }
            if (cM33939 == '.') {
                int i8 = i4 + 2;
                char cM339312 = m33939(this.f44206 + i);
                if (cM339312 < '0' || cM339312 > '9') {
                    this.f44215 = -1;
                    return 0.0d;
                }
                int i9 = (cM339312 - '0') + (i7 * 10);
                int i10 = 10;
                while (true) {
                    i3 = i8 + 1;
                    cM339310 = m33939(this.f44206 + i8);
                    if (cM339310 < '0' || cM339310 > '9') {
                        break;
                    }
                    i9 = (i9 * 10) + (cM339310 - '0');
                    i10 *= 10;
                    i8 = i3;
                }
                i = i3;
                i2 = i10;
                i7 = i9;
                cM33939 = cM339310;
            } else {
                i2 = 1;
            }
            boolean z2 = cM33939 == 'e' || cM33939 == 'E';
            if (z2) {
                int i11 = i + 1;
                cM33939 = m33939(this.f44206 + i);
                if (cM33939 == '+' || cM33939 == '-') {
                    i += 2;
                    cM33939 = m33939(this.f44206 + i11);
                } else {
                    i = i11;
                }
                while (cM33939 >= '0' && cM33939 <= '9') {
                    cM33939 = m33939(this.f44206 + i);
                    i++;
                }
            }
            int i12 = ((this.f44206 + i) - i6) - 1;
            if (z2 || i12 >= 10) {
                d = Double.parseDouble(m33932(i6, i12));
            } else {
                d = ((double) i7) / ((double) i2);
                if (z) {
                    d = -d;
                }
            }
            if (cM33939 == ',') {
                this.f44206 = (i - 1) + this.f44206;
                m33935();
                this.f44215 = 3;
                this.f44222 = 16;
                return d;
            }
            if (cM33939 == '}') {
                char cM339313 = m33939(this.f44206 + i);
                if (cM339313 == ',') {
                    this.f44222 = 16;
                    this.f44206 += i;
                    m33935();
                } else if (cM339313 == ']') {
                    this.f44222 = 15;
                    this.f44206 += i;
                    m33935();
                } else if (cM339313 == '}') {
                    this.f44222 = 13;
                    this.f44206 += i;
                    m33935();
                } else if (cM339313 == 26) {
                    this.f44206 += i;
                    this.f44222 = 20;
                    this.f44209 = (char) 26;
                } else {
                    this.f44215 = -1;
                    return 0.0d;
                }
                this.f44215 = 4;
                return d;
            }
            this.f44215 = -1;
            return 0.0d;
        }
        this.f44215 = -1;
        return 0.0d;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final double[] m33969(long j) {
        int i;
        char cCharAt;
        int i2;
        int i3;
        double[] dArr;
        double d;
        char c;
        this.f44215 = 0;
        int iM33934 = m33934(j);
        double[] dArr2 = null;
        if (iM33934 == 0) {
            return null;
        }
        int i4 = iM33934 + 1;
        int i5 = this.f44206 + iM33934;
        String str = this.f44211;
        int i6 = this.f44210;
        int i7 = -1;
        if ((i5 >= i6 ? (char) 26 : str.charAt(i5)) != '[') {
            this.f44215 = -1;
            return null;
        }
        int i8 = iM33934 + 2;
        int i9 = this.f44206 + i4;
        char cCharAt2 = i9 >= i6 ? (char) 26 : str.charAt(i9);
        double[] dArr3 = new double[16];
        int i10 = 0;
        while (true) {
            int i11 = this.f44206;
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
                int i16 = this.f44206 + i8;
                cCharAt = i16 >= i6 ? (char) 26 : str.charAt(i16);
                if (cCharAt < '0' || cCharAt > '9') {
                    break;
                }
                i15 = (i15 * 10) + (cCharAt - '0');
                i8 = i;
            }
            if (cCharAt == '.') {
                int i17 = i8 + 2;
                int i18 = this.f44206 + i;
                char cCharAt3 = i18 >= i6 ? (char) 26 : str.charAt(i18);
                if (cCharAt3 < '0' || cCharAt3 > '9') {
                    this.f44215 = i7;
                    return dArr2;
                }
                i15 = (cCharAt3 - '0') + (i15 * 10);
                i2 = 10;
                while (true) {
                    i = i17 + 1;
                    int i19 = this.f44206 + i17;
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
                int i21 = this.f44206 + i;
                cCharAt = i21 >= i6 ? (char) 26 : str.charAt(i21);
                if (cCharAt == '+' || cCharAt == '-') {
                    i += 2;
                    int i22 = this.f44206 + i20;
                    cCharAt = i22 >= i6 ? (char) 26 : str.charAt(i22);
                    c = '9';
                    z2 = z2;
                } else {
                    i = i20;
                    c = '9';
                }
                while (cCharAt >= '0' && cCharAt <= c) {
                    int i23 = i + 1;
                    int i24 = this.f44206 + i;
                    i = i23;
                    cCharAt = i24 >= i6 ? (char) 26 : str.charAt(i24);
                    c = c;
                    z2 = z2;
                }
                i3 = 10;
            } else {
                i3 = 10;
            }
            int i25 = ((this.f44206 + i) - i12) - 1;
            if (z2 || i25 >= i3) {
                dArr = dArr2;
                d = Double.parseDouble(m33932(i12, i25));
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
                int i28 = this.f44206 + i;
                i = i27;
                cCharAt2 = i28 >= i6 ? (char) 26 : str.charAt(i28);
            } else {
                if (cCharAt == ']') {
                    int i29 = i + 1;
                    int i30 = this.f44206 + i;
                    char cCharAt4 = i30 >= i6 ? (char) 26 : str.charAt(i30);
                    if (i26 != dArr3.length) {
                        double[] dArr5 = new double[i26];
                        System.arraycopy(dArr3, 0, dArr5, 0, i26);
                        dArr3 = dArr5;
                    }
                    if (cCharAt4 == ',') {
                        this.f44206 += i;
                        m33935();
                        this.f44215 = 3;
                        this.f44222 = 16;
                        return dArr3;
                    }
                    if (cCharAt4 == '}') {
                        int i31 = this.f44206 + i29;
                        char cCharAt5 = i31 >= i6 ? (char) 26 : str.charAt(i31);
                        if (cCharAt5 == ',') {
                            this.f44222 = 16;
                            this.f44206 = i + 1 + this.f44206;
                            m33935();
                        } else if (cCharAt5 == ']') {
                            this.f44222 = 15;
                            this.f44206 = i + 1 + this.f44206;
                            m33935();
                        } else if (cCharAt5 == '}') {
                            this.f44222 = 13;
                            this.f44206 = i + 1 + this.f44206;
                            m33935();
                        } else if (cCharAt5 == 26) {
                            this.f44206 = i + 1 + this.f44206;
                            this.f44222 = 20;
                            this.f44209 = (char) 26;
                        } else {
                            this.f44215 = -1;
                            return dArr;
                        }
                        this.f44215 = 4;
                        return dArr3;
                    }
                    this.f44215 = -1;
                    return dArr;
                }
                cCharAt2 = cCharAt;
            }
            i7 = -1;
            dArr2 = dArr;
            i10 = i26;
            i8 = i;
        }
        this.f44215 = -1;
        return dArr2;
    }

    /* JADX WARN: Code duplicated, block: B:96:0x0123  */
    /* JADX WARN: Code duplicated, block: B:97:0x0126  */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final double[][] m33961(long j) {
        int i;
        char cCharAt;
        int i2;
        double d;
        int i3;
        int i4;
        int i5;
        char cCharAt2;
        this.f44215 = 0;
        int iM33934 = m33934(j);
        if (iM33934 == 0) {
            return null;
        }
        int i6 = iM33934 + 1;
        int i7 = this.f44206 + iM33934;
        String str = this.f44211;
        int i8 = this.f44210;
        char c = '[';
        int i9 = -1;
        if ((i7 >= i8 ? (char) 26 : str.charAt(i7)) != '[') {
            this.f44215 = -1;
            return null;
        }
        int i10 = iM33934 + 2;
        int i11 = this.f44206 + i6;
        char cCharAt3 = i11 >= i8 ? (char) 26 : str.charAt(i11);
        int i12 = 16;
        double[][] dArr = new double[16][];
        int i13 = 0;
        loop0: while (true) {
            if (cCharAt3 == c) {
                int i14 = i10 + 1;
                int i15 = this.f44206 + i10;
                char cCharAt4 = i15 >= i8 ? (char) 26 : str.charAt(i15);
                double[] dArr2 = new double[i12];
                int i16 = 0;
                while (true) {
                    int i17 = this.f44206;
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
                        int i21 = this.f44206 + i14;
                        cCharAt = i21 >= i8 ? (char) 26 : str.charAt(i21);
                        if (cCharAt < '0' || cCharAt > '9') {
                            break;
                        }
                        i20 = (i20 * 10) + (cCharAt - '0');
                        i14 = i;
                    }
                    if (cCharAt == '.') {
                        int i22 = i14 + 2;
                        int i23 = this.f44206 + i;
                        char cCharAt5 = i23 >= i8 ? (char) 26 : str.charAt(i23);
                        if (cCharAt5 < '0' || cCharAt5 > '9') {
                            this.f44215 = i9;
                            return null;
                        }
                        i20 = (cCharAt5 - '0') + (i20 * 10);
                        i2 = 10;
                        while (true) {
                            i = i22 + 1;
                            int i24 = this.f44206 + i22;
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
                        int i26 = this.f44206 + i;
                        char cCharAt6 = i26 >= i8 ? (char) 26 : str.charAt(i26);
                        if (cCharAt6 == '+' || cCharAt6 == '-') {
                            i += 2;
                            int i27 = this.f44206 + i25;
                            if (i27 >= i8) {
                                cCharAt = 26;
                            } else {
                                cCharAt6 = str.charAt(i27);
                            }
                            while (cCharAt >= '0' && cCharAt <= '9') {
                                int i28 = i + 1;
                                i5 = this.f44206 + i;
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
                            i5 = this.f44206 + i;
                            if (i5 >= i8) {
                                cCharAt2 = 26;
                            } else {
                                cCharAt2 = str.charAt(i5);
                            }
                            i = i29;
                            cCharAt = cCharAt2;
                        }
                    }
                    int i30 = ((this.f44206 + i) - i18) - 1;
                    if (z2 || i30 >= 10) {
                        d = Double.parseDouble(m33932(i18, i30));
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
                        int i33 = this.f44206 + i;
                        cCharAt = i33 >= i8 ? (char) 26 : str.charAt(i33);
                        i14 = i32;
                    } else {
                        if (cCharAt == ']') {
                            int i34 = i + 1;
                            int i35 = this.f44206 + i;
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
                                int i37 = this.f44206 + i34;
                                cCharAt3 = i37 >= i8 ? (char) 26 : str.charAt(i37);
                            } else {
                                if (cCharAt7 == ']') {
                                    int i38 = i + 2;
                                    int i39 = this.f44206 + i34;
                                    char cCharAt8 = i39 >= i8 ? (char) 26 : str.charAt(i39);
                                    if (i36 != dArr.length) {
                                        double[][] dArr5 = new double[i36][];
                                        System.arraycopy(dArr, 0, dArr5, 0, i36);
                                        dArr = dArr5;
                                    }
                                    if (cCharAt8 == ',') {
                                        this.f44206 = i + 1 + this.f44206;
                                        m33935();
                                        this.f44215 = 3;
                                        this.f44222 = 16;
                                        return dArr;
                                    }
                                    if (cCharAt8 == '}') {
                                        char cM33939 = m33939(this.f44206 + i38);
                                        if (cM33939 == ',') {
                                            this.f44222 = 16;
                                            this.f44206 = i + 2 + this.f44206;
                                            m33935();
                                        } else if (cM33939 == ']') {
                                            this.f44222 = 15;
                                            this.f44206 = i + 2 + this.f44206;
                                            m33935();
                                        } else if (cM33939 == '}') {
                                            this.f44222 = 13;
                                            this.f44206 = i + 2 + this.f44206;
                                            m33935();
                                        } else if (cM33939 == 26) {
                                            this.f44206 = i + 2 + this.f44206;
                                            this.f44222 = 20;
                                            this.f44209 = (char) 26;
                                        } else {
                                            this.f44215 = -1;
                                            return null;
                                        }
                                        this.f44215 = 4;
                                        return dArr;
                                    }
                                    this.f44215 = -1;
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
        this.f44215 = i9;
        return null;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final long m33962(long j) {
        this.f44215 = 0;
        int iM33934 = m33934(j);
        if (iM33934 == 0) {
            return 0L;
        }
        int i = iM33934 + 1;
        int i2 = this.f44206 + iM33934;
        String str = this.f44211;
        int i3 = this.f44210;
        if ((i2 >= i3 ? (char) 26 : str.charAt(i2)) != '\"') {
            this.f44215 = -1;
            return 0L;
        }
        long j2 = -3750763034362895579L;
        while (true) {
            int i4 = i + 1;
            int i5 = this.f44206 + i;
            char cCharAt = i5 >= i3 ? (char) 26 : str.charAt(i5);
            if (cCharAt == '\"') {
                int i6 = i + 2;
                int i7 = this.f44206 + i4;
                char cCharAt2 = i7 >= i3 ? (char) 26 : str.charAt(i7);
                if (cCharAt2 == ',') {
                    int iM54897 = C24579.m54897(i, 1, this.f44206, 1);
                    this.f44206 = iM54897;
                    this.f44209 = iM54897 < i3 ? str.charAt(iM54897) : (char) 26;
                    this.f44215 = 3;
                    return j2;
                }
                if (cCharAt2 == '}') {
                    int i8 = this.f44206 + i6;
                    char cCharAt3 = i8 >= i3 ? (char) 26 : str.charAt(i8);
                    if (cCharAt3 == ',') {
                        this.f44222 = 16;
                        this.f44206 = i + 2 + this.f44206;
                        m33935();
                    } else if (cCharAt3 == ']') {
                        this.f44222 = 15;
                        this.f44206 = i + 2 + this.f44206;
                        m33935();
                    } else if (cCharAt3 == '}') {
                        this.f44222 = 13;
                        this.f44206 = i + 2 + this.f44206;
                        m33935();
                    } else if (cCharAt3 == 26) {
                        this.f44222 = 20;
                        this.f44206 = i + 2 + this.f44206;
                        this.f44209 = (char) 26;
                    } else {
                        this.f44215 = -1;
                        return 0L;
                    }
                    this.f44215 = 4;
                    return j2;
                }
                this.f44215 = -1;
                return 0L;
            }
            j2 = (j2 ^ ((long) cCharAt)) * 1099511628211L;
            if (cCharAt == '\\') {
                this.f44215 = -1;
                return 0L;
            }
            i = i4;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m33975(boolean z) {
        return m33945(this.f44210 - this.f44206, z);
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
    public final boolean m33945(int i, boolean z) {
        char cM33939;
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
        char cM339310;
        int i9;
        char cM339311;
        char cM339312;
        char cM339313;
        char cM339314;
        char cM339315;
        char cM339316;
        char cM339317;
        int i10;
        char cM339318;
        int i11;
        int i12;
        char cM339319;
        char cM339320;
        char cM339321;
        int i13;
        int i14;
        int i15;
        char cM339322;
        char cM339323;
        char cM339324;
        char cM339325;
        if (!z && i > 13) {
            char cM339326 = m33939(this.f44206);
            char cM339327 = m33939(this.f44206 + 1);
            char cM339328 = m33939(this.f44206 + 2);
            char cM339329 = m33939(this.f44206 + 3);
            char cM339330 = m33939(this.f44206 + 4);
            char cM339331 = m33939(this.f44206 + 5);
            char cM339332 = m33939((this.f44206 + i) - 1);
            char cM339333 = m33939((this.f44206 + i) - 2);
            if (cM339326 == '/' && cM339327 == 'D' && cM339328 == 'a' && cM339329 == 't' && cM339330 == 'e' && cM339331 == '(' && cM339332 == '/' && cM339333 == ')') {
                int i16 = -1;
                for (int i17 = 6; i17 < i; i17++) {
                    char cM339334 = m33939(this.f44206 + i17);
                    if (cM339334 != '+') {
                        if (cM339334 < '0' || cM339334 > '9') {
                            break;
                        }
                    } else {
                        i16 = i17;
                    }
                }
                if (i16 == -1) {
                    return false;
                }
                int i18 = this.f44206 + 6;
                long j = Long.parseLong(m33932(i18, i16 - i18));
                Calendar calendar = Calendar.getInstance(this.f44208, this.f44223);
                this.f44219 = calendar;
                calendar.setTimeInMillis(j);
                this.f44222 = 5;
                return true;
            }
        }
        if (i == 8 || i == 14 || ((i == 16 && ((cM339325 = m33939(this.f44206 + 10)) == 'T' || cM339325 == ' ')) || (i == 17 && m33939(this.f44206 + 6) != '-'))) {
            if (z) {
                return false;
            }
            char cM339335 = m33939(this.f44206);
            char cM339336 = m33939(this.f44206 + 1);
            char cM339337 = m33939(this.f44206 + 2);
            char cM339338 = m33939(this.f44206 + 3);
            char cM339339 = m33939(this.f44206 + 4);
            char cM339340 = m33939(this.f44206 + 5);
            char cM339341 = m33939(this.f44206 + 6);
            char cM339342 = m33939(this.f44206 + 7);
            char cM339343 = m33939(this.f44206 + 8);
            boolean z2 = cM339339 == '-' && cM339342 == '-';
            boolean z3 = z2 && i == 16;
            boolean z4 = z2 && i == 17;
            if (z4 || z3) {
                cM33939 = m33939(this.f44206 + 9);
                c = cM339343;
            } else {
                cM33939 = cM339342;
                c = cM339341;
                cM339341 = cM339340;
                cM339340 = cM339339;
            }
            if (!m33929(cM339335, cM339336, cM339337, cM339338, cM339340, cM339341, (int) c, (int) cM33939)) {
                return false;
            }
            m33928(cM339335, cM339336, cM339337, cM339338, cM339340, cM339341, c, cM33939);
            if (i != 8) {
                char cM339344 = m33939(this.f44206 + 9);
                char cM339345 = m33939(this.f44206 + 10);
                char cM339346 = m33939(this.f44206 + 11);
                char cM339347 = m33939(this.f44206 + 12);
                char cM339348 = m33939(this.f44206 + 13);
                if ((z4 && cM339345 == 'T' && cM339348 == ':' && m33939(this.f44206 + 16) == 'Z') || (z3 && ((cM339345 == ' ' || cM339345 == 'T') && cM339348 == ':'))) {
                    cM339345 = m33939(this.f44206 + 14);
                    cM339343 = cM339346;
                    cM339348 = '0';
                    cM339346 = m33939(this.f44206 + 15);
                    cM339344 = cM339347;
                    cM339347 = '0';
                }
                if (!m33933(cM339343, cM339344, cM339345, cM339346, cM339347, cM339348)) {
                    return false;
                }
                if (i != 17 || z4) {
                    i2 = 0;
                } else {
                    char cM339349 = m33939(this.f44206 + 14);
                    char cM339350 = m33939(this.f44206 + 15);
                    char cM339351 = m33939(this.f44206 + 16);
                    if (cM339349 < '0' || cM339349 > '9' || cM339350 < '0' || cM339350 > '9' || cM339351 < '0' || cM339351 > '9') {
                        return false;
                    }
                    i2 = (cM339351 - '0') + ((cM339350 - '0') * 10) + ((cM339349 - '0') * 100);
                }
                i5 = (cM339344 - '0') + ((cM339343 - '0') * 10);
                i3 = (cM339346 - '0') + ((cM339345 - '0') * 10);
                i4 = (cM339348 - '0') + ((cM339347 - '0') * 10);
            } else {
                i2 = 0;
                i3 = 0;
                i4 = 0;
                i5 = 0;
            }
            this.f44219.set(11, i5);
            this.f44219.set(12, i3);
            this.f44219.set(13, i4);
            this.f44219.set(14, i2);
            this.f44222 = 5;
            return true;
        }
        if (i < 9) {
            return false;
        }
        char cM339352 = m33939(this.f44206);
        char cM339353 = m33939(this.f44206 + 1);
        char cM339354 = m33939(this.f44206 + 2);
        char cM339355 = m33939(this.f44206 + 3);
        char cM339356 = m33939(this.f44206 + 4);
        char cM339357 = m33939(this.f44206 + 5);
        char cM339358 = m33939(this.f44206 + 6);
        char cM339359 = m33939(this.f44206 + 7);
        char cM339360 = m33939(this.f44206 + 8);
        char cM339361 = m33939(this.f44206 + 9);
        if ((cM339356 != '-' || cM339359 != '-') && (cM339356 != '/' || cM339359 != '/')) {
            if (cM339356 == '-' && cM339358 == '-') {
                if (cM339360 == ' ') {
                    i6 = 8;
                    cM339358 = cM339357;
                    cM339357 = '0';
                    c7 = cM339353;
                    c8 = cM339354;
                    c2 = cM339355;
                    c3 = cM339357;
                    c4 = cM339358;
                    c6 = cM339359;
                    c5 = '0';
                    i7 = i6;
                    cM339358 = cM339352;
                } else {
                    i8 = 9;
                    cM339358 = cM339352;
                    c8 = cM339354;
                    c2 = cM339355;
                    c4 = cM339357;
                    c5 = cM339359;
                    c6 = cM339360;
                    c3 = '0';
                    i7 = i8;
                    c7 = cM339353;
                }
            } else if ((cM339354 == '.' && cM339357 == '.') || (cM339354 == '-' && cM339357 == '-')) {
                cM339357 = cM339355;
                cM339354 = cM339360;
                cM339355 = cM339361;
            } else {
                if (cM339356 != 24180 && cM339356 != 45380) {
                    return false;
                }
                if (cM339359 != 26376 && cM339359 != 50900) {
                    if (cM339358 != 26376 && cM339358 != 50900) {
                        return false;
                    }
                    if (cM339360 == 26085 || cM339360 == 51068) {
                        i6 = 10;
                        cM339358 = cM339357;
                        cM339357 = '0';
                        c7 = cM339353;
                        c8 = cM339354;
                        c2 = cM339355;
                        c3 = cM339357;
                        c4 = cM339358;
                        c6 = cM339359;
                        c5 = '0';
                        i7 = i6;
                        cM339358 = cM339352;
                    } else {
                        if (cM339361 != 26085 && cM339361 != 51068) {
                            return false;
                        }
                        i8 = 10;
                        cM339358 = cM339352;
                        c8 = cM339354;
                        c2 = cM339355;
                        c4 = cM339357;
                        c5 = cM339359;
                        c6 = cM339360;
                        c3 = '0';
                        i7 = i8;
                        c7 = cM339353;
                    }
                } else if (cM339361 == 26085 || cM339361 == 51068) {
                    i6 = 10;
                    cM339359 = cM339360;
                    c7 = cM339353;
                    c8 = cM339354;
                    c2 = cM339355;
                    c3 = cM339357;
                    c4 = cM339358;
                    c6 = cM339359;
                    c5 = '0';
                    i7 = i6;
                    cM339358 = cM339352;
                } else {
                    if (m33939(this.f44206 + 10) != 26085 && m33939(this.f44206 + 10) != 51068) {
                        return false;
                    }
                    c2 = cM339355;
                    c3 = cM339357;
                    c4 = cM339358;
                    c5 = cM339360;
                    c6 = cM339361;
                    i7 = 11;
                    cM339358 = cM339352;
                    c7 = cM339353;
                    c8 = cM339354;
                }
            }
            if (!m33929(cM339358, c7, c8, c2, c3, c4, (int) c5, (int) c6)) {
                return false;
            }
            m33928(cM339358, c7, c8, c2, c3, c4, c5, c6);
            cM339310 = m33939(this.f44206 + i7);
            if (cM339310 == 'T' && (cM339310 != ' ' || z)) {
                if (cM339310 == '\"' || cM339310 == 26 || cM339310 == 26085 || cM339310 == 51068) {
                    this.f44219.set(11, 0);
                    this.f44219.set(12, 0);
                    this.f44219.set(13, 0);
                    this.f44219.set(14, 0);
                    int i19 = this.f44206 + i7;
                    this.f44206 = i19;
                    this.f44209 = m33939(i19);
                    this.f44222 = 5;
                    return true;
                }
                if (cM339310 != '+' && cM339310 != '-') {
                    return false;
                }
                if (this.f44210 != i7 + 6 || m33939(this.f44206 + i7 + 3) != ':' || m33939(this.f44206 + i7 + 4) != '0' || m33939(this.f44206 + i7 + 5) != '0') {
                    return false;
                }
                m33944('0', '0', '0', '0', '0', '0');
                this.f44219.set(14, 0);
                m33943(cM339310, m33939(this.f44206 + i7 + 1), m33939(this.f44206 + i7 + 2));
                return true;
            }
            i9 = i7 + 9;
            if (i >= i9 || m33939(this.f44206 + i7 + 3) != ':' || m33939(this.f44206 + i7 + 6) != ':') {
                return false;
            }
            cM339311 = m33939(this.f44206 + i7 + 1);
            cM339312 = m33939(this.f44206 + i7 + 2);
            cM339313 = m33939(this.f44206 + i7 + 4);
            cM339314 = m33939(this.f44206 + i7 + 5);
            cM339315 = m33939(this.f44206 + i7 + 7);
            cM339316 = m33939(this.f44206 + i7 + 8);
            if (!m33933(cM339311, cM339312, cM339313, cM339314, cM339315, cM339316)) {
                return false;
            }
            m33944(cM339311, cM339312, cM339313, cM339314, cM339315, cM339316);
            cM339317 = m33939(this.f44206 + i7 + 9);
            if (cM339317 == '.') {
                this.f44219.set(14, 0);
                int i20 = this.f44206 + i9;
                this.f44206 = i20;
                this.f44209 = m33939(i20);
                this.f44222 = 5;
                if (cM339317 != 'Z' && this.f44219.getTimeZone().getRawOffset() != 0) {
                    String[] availableIDs = TimeZone.getAvailableIDs(0);
                    if (availableIDs.length <= 0) {
                        return true;
                    }
                    this.f44219.setTimeZone(C10646.getTimeZone(availableIDs[0]));
                    return true;
                }
            }
            i10 = i7 + 11;
            if (i >= i10 || (cM339318 = m33939(this.f44206 + i7 + 10)) < '0' || cM339318 > '9') {
                return false;
            }
            i11 = cM339318 - '0';
            if (i > i10 || (cM339324 = m33939(this.f44206 + i7 + 11)) < '0' || cM339324 > '9') {
                i12 = 1;
            } else {
                i11 = (i11 * 10) + (cM339324 - '0');
                i12 = 2;
            }
            if (i12 == 2 && (cM339323 = m33939(this.f44206 + i7 + 12)) >= '0' && cM339323 <= '9') {
                i11 = (i11 * 10) + (cM339323 - '0');
                i12 = 3;
            }
            this.f44219.set(14, i11);
            cM339319 = m33939(C24579.m54897(this.f44206, i7, 10, i12));
            if (cM339319 != '+' || cM339319 == '-') {
                cM339320 = m33939(this.f44206 + i7 + 10 + i12 + 1);
                if (cM339320 >= '0' || cM339320 > '1' || (cM339321 = m33939(this.f44206 + i7 + 10 + i12 + 2)) < '0' || cM339321 > '9') {
                    return false;
                }
                char cM339362 = m33939(this.f44206 + i7 + 10 + i12 + 3);
                if (cM339362 == ':') {
                    if (m33939(this.f44206 + i7 + 10 + i12 + 4) != '0' || m33939(this.f44206 + i7 + 10 + i12 + 5) != '0') {
                        return false;
                    }
                    i13 = 6;
                } else if (cM339362 != '0') {
                    i13 = 3;
                } else {
                    if (m33939(this.f44206 + i7 + 10 + i12 + 4) != '0') {
                        return false;
                    }
                    i13 = 5;
                }
                m33943(cM339319, cM339320, cM339321);
                i14 = i13;
                i15 = 10;
            } else if (cM339319 == 'Z') {
                if (this.f44219.getTimeZone().getRawOffset() != 0) {
                    String[] availableIDs2 = TimeZone.getAvailableIDs(0);
                    if (availableIDs2.length > 0) {
                        this.f44219.setTimeZone(C10646.getTimeZone(availableIDs2[0]));
                    }
                }
                i15 = 10;
                i14 = 1;
            } else {
                i15 = 10;
                i14 = 0;
            }
            int i21 = this.f44206;
            int iM54897 = C24579.m54897(i7, i15, i12, i14);
            cM339322 = m33939(i21 + iM54897);
            if (cM339322 == 26 && cM339322 != '\"') {
                return false;
            }
            int i22 = this.f44206 + iM54897;
            this.f44206 = i22;
            this.f44209 = m33939(i22);
            this.f44222 = 5;
            return true;
        }
        cM339359 = cM339353;
        cM339356 = cM339358;
        cM339353 = cM339361;
        cM339358 = cM339352;
        cM339352 = cM339360;
        c5 = cM339352;
        c6 = cM339353;
        c8 = cM339354;
        c2 = cM339355;
        c4 = cM339356;
        c3 = cM339357;
        c7 = cM339359;
        i7 = 10;
        if (!m33929(cM339358, c7, c8, c2, c3, c4, (int) c5, (int) c6)) {
            return false;
        }
        m33928(cM339358, c7, c8, c2, c3, c4, c5, c6);
        cM339310 = m33939(this.f44206 + i7);
        if (cM339310 == 'T') {
        }
        i9 = i7 + 9;
        if (i >= i9) {
            return false;
        }
        cM339311 = m33939(this.f44206 + i7 + 1);
        cM339312 = m33939(this.f44206 + i7 + 2);
        cM339313 = m33939(this.f44206 + i7 + 4);
        cM339314 = m33939(this.f44206 + i7 + 5);
        cM339315 = m33939(this.f44206 + i7 + 7);
        cM339316 = m33939(this.f44206 + i7 + 8);
        if (!m33933(cM339311, cM339312, cM339313, cM339314, cM339315, cM339316)) {
            return false;
        }
        m33944(cM339311, cM339312, cM339313, cM339314, cM339315, cM339316);
        cM339317 = m33939(this.f44206 + i7 + 9);
        if (cM339317 == '.') {
            this.f44219.set(14, 0);
            int i23 = this.f44206 + i9;
            this.f44206 = i23;
            this.f44209 = m33939(i23);
            this.f44222 = 5;
            return cM339317 != 'Z' ? true : true;
        }
        i10 = i7 + 11;
        if (i >= i10) {
            return false;
        }
        i11 = cM339318 - '0';
        if (i > i10) {
            i12 = 1;
        } else {
            i12 = 1;
        }
        if (i12 == 2) {
            i11 = (i11 * 10) + (cM339323 - '0');
            i12 = 3;
        }
        this.f44219.set(14, i11);
        cM339319 = m33939(C24579.m54897(this.f44206, i7, 10, i12));
        if (cM339319 != '+') {
            cM339320 = m33939(this.f44206 + i7 + 10 + i12 + 1);
            if (cM339320 >= '0') {
                return false;
            }
            return false;
        }
        cM339320 = m33939(this.f44206 + i7 + 10 + i12 + 1);
        if (cM339320 >= '0') {
            return false;
        }
        return false;
        int i24 = this.f44206;
        int iM54898 = C24579.m54897(i7, i15, i12, i14);
        cM339322 = m33939(i24 + iM54898);
        if (cM339322 == 26) {
        }
        int i25 = this.f44206 + iM54898;
        this.f44206 = i25;
        this.f44209 = m33939(i25);
        this.f44222 = 5;
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33944(char c, char c2, char c3, char c4, char c5, char c6) {
        this.f44219.set(11, (c2 - '0') + ((c - '0') * 10));
        this.f44219.set(12, (c4 - '0') + ((c3 - '0') * 10));
        this.f44219.set(13, (c6 - '0') + ((c5 - '0') * 10));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33943(char c, char c2, char c3) {
        int i = ((c3 - '0') + ((c2 - '0') * 10)) * 3600000;
        if (c == '-') {
            i = -i;
        }
        if (this.f44219.getTimeZone().getRawOffset() != i) {
            String[] availableIDs = TimeZone.getAvailableIDs(i);
            if (availableIDs.length > 0) {
                this.f44219.setTimeZone(C10646.getTimeZone(availableIDs[0]));
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m33928(char c, char c2, char c3, char c4, char c5, char c6, char c7, char c8) {
        Calendar calendar = Calendar.getInstance(this.f44208, this.f44223);
        this.f44219 = calendar;
        int i = c4 - '0';
        calendar.set(1, i + ((c3 - '0') * 10) + ((c2 - '0') * 100) + ((c - '0') * 1000));
        this.f44219.set(2, ((c6 - '0') + ((c5 - '0') * 10)) - 1);
        this.f44219.set(5, (c8 - '0') + ((c7 - '0') * 10));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final byte[] m33930(int i, int i2, String str) {
        int[] iArr;
        int i3;
        int i4;
        if (i2 == 0) {
            return new byte[0];
        }
        int i5 = (i + i2) - 1;
        while (true) {
            iArr = f44200;
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
