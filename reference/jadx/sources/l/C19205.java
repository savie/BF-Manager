package l;

import com.alipay.sdk.m.p.a;
import com.alipay.sdk.m.y.l;
import java.io.IOException;
import java.io.Reader;
import java.util.Map;
import org.simpleframework.xml.stream.DocumentReader;

/* JADX INFO: renamed from: l.ᩳܽۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: E5LS */
/* JADX INFO: loaded from: classes5.dex */
public final class C19205 {

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final Map f62086 = AbstractC17589.m41248();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f62088;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f62089;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f62090;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public Reader f62092;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f62094;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f62095;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f62097;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f62098;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f62100;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f62101;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public char[] f62103;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f62104;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public String f62105;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f62106;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f62107;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f62108;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f62110;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f62112;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f62113;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f62114;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public String f62116;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f62117;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String[] f62102 = new String[16];

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public String[] f62091 = new String[8];

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int[] f62115 = new int[4];

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public char[] f62109 = new char[128];

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String[] f62099 = new String[16];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C9508[] f62093 = new C9508[8];

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int[] f62111 = new int[2];

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C19327 f62096 = new C19327();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C9508 f62087 = new C9508();

    public C19205() {
        this.f62103 = new char[Runtime.getRuntime().freeMemory() >= 1048576 ? 8192 : 128];
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m44482(String str) throws C10254 {
        if (str.length() >= 100) {
            str = str.substring(0, 100) + "\n";
        }
        throw new C10254(str, this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44479(String str, C9508 c9508) throws C10254 {
        if (str.length() >= 100) {
            str = str.substring(0, 100) + "\n";
        }
        throw new C10254(str, c9508);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private int m44485() throws C10254, IOException {
        int iM44481 = m44481(0);
        if (iM44481 == -1) {
            int i = this.f62104;
            if (i == 0) {
                return 1;
            }
            m44482(C8947.m23910(new StringBuilder("expected: </"), this.f62102[((i - 1) << 2) + 3], ">"));
            throw null;
        }
        if (iM44481 == 38) {
            return 6;
        }
        if (iM44481 != 60) {
            return 4;
        }
        int iM44482 = m44481(1);
        if (iM44482 == 33) {
            return EnumC5810.f19979;
        }
        if (iM44482 == 47) {
            return 3;
        }
        if (iM44482 != 63) {
            return 2;
        }
        return EnumC5810.f19979;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private String m44483(int i) {
        int i2;
        char c;
        char[] cArr = this.f62109;
        int i3 = this.f62098 - i;
        if (i3 > 16) {
            return new String(cArr, i, i3);
        }
        if (i3 == 0) {
            return "";
        }
        if (i3 == 1) {
            i2 = i3 * 31;
            c = cArr[i];
        } else {
            i2 = ((i3 * 31) + cArr[i]) * 31;
            c = cArr[i + 1];
        }
        int i4 = i2 + c;
        C19327 c19327 = this.f62096;
        String str = (String) c19327.get(i4);
        if (str != null && str.length() == i3) {
            for (int i5 = 0; i5 < i3; i5++) {
                if (cArr[i5 + i] == str.charAt(i5)) {
                }
            }
            return str;
        }
        String str2 = new String(cArr, i, i3);
        c19327.mo13466(i4, str2);
        return str2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private String m44476(int i, int i2, String str) {
        int i3 = i2 - i;
        if (i3 == 0) {
            return "";
        }
        if (i == 0 && i2 == str.length()) {
            return str;
        }
        if (i3 == 7 && str.regionMatches(i, "android", 0, 7)) {
            return "android";
        }
        if (i3 > 16) {
            return str.substring(i, i2);
        }
        int iCharAt = str.charAt(i) + (i3 * 31);
        if (i3 > 1) {
            iCharAt = (iCharAt * 31) + str.charAt(i + 1);
        }
        C19327 c19327 = this.f62096;
        String str2 = (String) c19327.get(iCharAt);
        if (str2 != null && str2.length() == i3 && str.regionMatches(i, str2, 0, i3)) {
            return str2;
        }
        String strSubstring = str.substring(i, i2);
        c19327.mo13466(iCharAt, strSubstring);
        return strSubstring;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m44474(int i) {
        this.f62094 &= i <= 32;
        int i2 = this.f62098;
        char[] cArr = this.f62109;
        if (i2 == cArr.length) {
            char[] cArr2 = new char[C7376.m20246(i2, 4, 3, 4)];
            System.arraycopy(cArr, 0, cArr2, 0, i2);
            this.f62109 = cArr2;
        }
        char[] cArr3 = this.f62109;
        int i3 = this.f62098;
        this.f62098 = i3 + 1;
        cArr3[i3] = (char) i;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00cf  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m44480(boolean z) throws C10254, IOException {
        String strM44476;
        int i;
        String[] strArr;
        if (!z) {
            m44488();
        }
        C9508 c9508 = this.f62087;
        c9508.m24894(this);
        this.f62107 = m44475();
        c9508.m24887(this);
        int i2 = 0;
        this.f62113 = 0;
        while (true) {
            m44486();
            int iM44481 = m44481(i2);
            if (!z) {
                if (iM44481 == 47) {
                    this.f62110 = true;
                    m44488();
                    m44486();
                    m44477('>');
                    break;
                }
                if (iM44481 == 62) {
                    m44488();
                    break;
                }
            } else if (iM44481 == 63) {
                m44488();
                m44477('>');
                return;
            }
            if (iM44481 == -1) {
                m44482("Unexpected EOF");
                throw null;
            }
            int i3 = this.f62113;
            int i4 = i3 << 2;
            this.f62113 = i3 + 1;
            int i5 = i3 << 1;
            String[] strArr2 = this.f62099;
            if (strArr2.length < i4 + 4) {
                String[] strArr3 = new String[i4 + 20];
                System.arraycopy(strArr2, 0, strArr3, 0, strArr2.length);
                strArr2 = strArr3;
            }
            this.f62099 = strArr2;
            C9508[] c9508Arr = this.f62093;
            if (c9508Arr.length < i5 + 2) {
                C9508[] c9508Arr2 = new C9508[i5 + 10];
                System.arraycopy(c9508Arr, 0, c9508Arr2, 0, c9508Arr.length);
                c9508Arr = c9508Arr2;
            }
            this.f62093 = c9508Arr;
            C9508 c9509 = c9508Arr[i5];
            if (c9509 == null) {
                c9509 = new C9508();
                c9508Arr[i5] = c9509;
            }
            c9509.m24894(this);
            String strM44475 = m44475();
            c9509.m24887(this);
            if (strM44475.length() == 0) {
                m44482("attr name expected");
                throw null;
            }
            C9508[] c9508Arr3 = this.f62093;
            int i6 = i5 + 1;
            C9508 c95010 = c9508Arr3[i6];
            if (c95010 == null) {
                c95010 = new C9508();
                c9508Arr3[i6] = c95010;
            }
            String[] strArr4 = this.f62099;
            strArr4[i4] = "";
            int i7 = i4 + 2;
            strArr4[i4 + 1] = null;
            int i8 = i4 + 3;
            strArr4[i7] = strM44475;
            m44486();
            i2 = 0;
            if (m44481(0) != 61) {
                m44482("Attr.value missing f. ".concat(strM44475));
                throw null;
            }
            m44477(a.h);
            m44486();
            int iM44482 = m44481(0);
            if (iM44482 != 39 && iM44482 != 34) {
                m44482("attr value delimiter missing!");
                throw null;
            }
            m44488();
            c95010.m24894(this);
            int i9 = this.f62098;
            m44478(iM44482, true);
            c95010.m24887(this);
            this.f62099[i8] = m44483(i9);
            this.f62098 = i9;
            if (iM44482 != 32) {
                m44488();
            }
        }
        int i10 = this.f62104;
        this.f62104 = i10 + 1;
        int i11 = i10 << 2;
        String[] strArr5 = this.f62102;
        if (strArr5.length < i11 + 4) {
            String[] strArr6 = new String[i11 + 20];
            System.arraycopy(strArr5, i2, strArr6, i2, strArr5.length);
            strArr5 = strArr6;
        }
        this.f62102 = strArr5;
        strArr5[i11 + 3] = this.f62107;
        int i12 = this.f62104;
        int[] iArr = this.f62115;
        if (i12 >= iArr.length) {
            int[] iArr2 = new int[i12 + 4];
            System.arraycopy(iArr, i2, iArr2, i2, iArr.length);
            this.f62115 = iArr2;
        }
        int[] iArr3 = this.f62115;
        int i13 = this.f62104;
        iArr3[i13] = iArr3[i13 - 1];
        for (int i14 = 0; i14 < this.f62113; i14++) {
            int i15 = i14 << 2;
            int i16 = i14 << 1;
            String str = this.f62099[i15 + 2];
            int iIndexOf = str.indexOf(58);
            if (iIndexOf != -1) {
                if (iIndexOf == 5 && str.startsWith("xmlns:")) {
                    strM44476 = m44476(iIndexOf + 1, str.length(), str);
                    int[] iArr4 = this.f62115;
                    int i17 = this.f62104;
                    int i18 = iArr4[i17];
                    iArr4[i17] = i18 + 1;
                    i = i18 << 1;
                    strArr = this.f62091;
                    if (strArr.length < i + 2) {
                        String[] strArr7 = new String[i + 18];
                        System.arraycopy(strArr, i2, strArr7, i2, strArr.length);
                        strArr = strArr7;
                    }
                    this.f62091 = strArr;
                    strArr[i] = strM44476;
                    String[] strArr8 = this.f62099;
                    int i19 = i15 + 3;
                    strArr[i + 1] = strArr8[i19];
                    if (strM44476 != null && strArr8[i19].equals("")) {
                        m44479("illegal empty namespace", this.f62093[i16]);
                        throw null;
                    }
                }
            } else if (str.equals("xmlns")) {
                strM44476 = null;
                int[] iArr5 = this.f62115;
                int i110 = this.f62104;
                int i111 = iArr5[i110];
                iArr5[i110] = i111 + 1;
                i = i111 << 1;
                strArr = this.f62091;
                if (strArr.length < i + 2) {
                    String[] strArr9 = new String[i + 18];
                    System.arraycopy(strArr, i2, strArr9, i2, strArr.length);
                    strArr = strArr9;
                }
                this.f62091 = strArr;
                strArr[i] = strM44476;
                String[] strArr10 = this.f62099;
                int i112 = i15 + 3;
                strArr[i + 1] = strArr10[i112];
                if (strM44476 != null) {
                    continue;
                }
            } else {
                continue;
            }
        }
        int i20 = 0;
        while (i20 < this.f62113) {
            int i21 = i20 << 2;
            int i22 = i20 << 1;
            int i23 = i21 + 2;
            String str2 = this.f62099[i23];
            int iIndexOf2 = str2.indexOf(58);
            if (iIndexOf2 == 0) {
                m44479("illegal attribute name: ".concat(str2), this.f62093[i22]);
                throw null;
            }
            if (iIndexOf2 != -1) {
                String strM44477 = m44476(i2, iIndexOf2, str2);
                String strM44478 = m44476(iIndexOf2 + 1, str2.length(), str2);
                String strM44492 = m44492(strM44477);
                if (strM44492 == null) {
                    C9508 c9508M24896clone = this.f62093[i22].clone();
                    c9508M24896clone.m24889(c9508M24896clone.m24885() + iIndexOf2);
                    c9508M24896clone.m24892(c9508M24896clone.m24891() + iIndexOf2);
                    m44479("Undefined Prefix: " + strM44477, c9508M24896clone);
                    throw null;
                }
                String[] strArr11 = this.f62099;
                strArr11[i21] = strM44492;
                strArr11[i21 + 1] = strM44477;
                strArr11[i23] = strM44478;
            }
            i20++;
            i2 = 0;
        }
        int iIndexOf3 = this.f62107.indexOf(58);
        if (iIndexOf3 == 0) {
            m44479("illegal tag name: " + this.f62107, c9508);
            throw null;
        }
        if (iIndexOf3 != -1) {
            this.f62116 = m44476(0, iIndexOf3, this.f62107);
            String str3 = this.f62107;
            this.f62107 = m44476(iIndexOf3 + 1, str3.length(), str3);
        }
        String strM44493 = m44492(this.f62116);
        this.f62105 = strM44493;
        if (strM44493 == null) {
            if (this.f62116 != null) {
                C9508 c9508M24896clone2 = c9508.clone();
                c9508M24896clone2.m24889(c9508M24896clone2.m24885() + iIndexOf3);
                c9508M24896clone2.m24892(c9508M24896clone2.m24891() + iIndexOf3);
                m44479("undefined prefix: " + this.f62116, c9508M24896clone2);
                throw null;
            }
            this.f62105 = "";
        }
        String[] strArr12 = this.f62102;
        strArr12[i11] = this.f62105;
        strArr12[i11 + 1] = this.f62116;
        strArr12[i11 + 2] = this.f62107;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    private void m44484() throws C10254, IOException {
        m44474(m44488());
        int i = this.f62098;
        while (true) {
            int iM44488 = m44488();
            if (iM44488 == 59) {
                String strM44483 = m44483(i);
                this.f62098 = i - 1;
                if (strM44483.charAt(0) == '#') {
                    m44474(strM44483.charAt(1) == 'x' ? Integer.parseInt(strM44483.substring(2), 16) : Integer.parseInt(strM44483.substring(1)));
                    return;
                }
                String str = (String) f62086.get(strM44483);
                boolean z = str == null;
                this.f62097 = z;
                if (z) {
                    m44482(C14442.m34865("unresolved: &", strM44483, l.b));
                    throw null;
                }
                for (int i2 = 0; i2 < str.length(); i2++) {
                    m44474(str.charAt(i2));
                }
                return;
            }
            if (iM44488 < 128 && ((iM44488 < 48 || iM44488 > 57) && ((iM44488 < 97 || iM44488 > 122) && ((iM44488 < 65 || iM44488 > 90) && iM44488 != 95 && iM44488 != 45 && iM44488 != 35)))) {
                m44482("unterminated entity ref");
                throw null;
            }
            m44474(iM44488);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m44478(int i, boolean z) throws C10254, IOException {
        int iM44481 = m44481(0);
        int i2 = 0;
        while (iM44481 != -1 && iM44481 != i) {
            if (i == 32 && (iM44481 <= 32 || iM44481 == 62)) {
                return;
            }
            if (iM44481 != 38) {
                m44474(m44488());
            } else if (!z) {
                return;
            } else {
                m44484();
            }
            if (iM44481 == 62 && i2 >= 2 && i != 93) {
                m44482("Illegal: ]]>");
                throw null;
            }
            i2 = iM44481 == 93 ? i2 + 1 : 0;
            iM44481 = m44481(0);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m44477(char c) throws C10254, IOException {
        int iM44488 = m44488();
        if (iM44488 == c) {
            return;
        }
        m44482("expected: '" + c + "' actual: '" + ((char) iM44488) + "'");
        throw null;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private int m44488() throws IOException {
        int iM44481;
        if (this.f62101 == 0) {
            iM44481 = m44481(0);
        } else {
            int[] iArr = this.f62111;
            int i = iArr[0];
            iArr[0] = iArr[1];
            iM44481 = i;
        }
        this.f62101--;
        this.f62114++;
        this.f62095++;
        if (iM44481 == 10) {
            this.f62106++;
            this.f62114 = 1;
        }
        return iM44481;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private int m44481(int i) throws IOException {
        int i2;
        while (true) {
            int i3 = this.f62101;
            int[] iArr = this.f62111;
            if (i >= i3) {
                char[] cArr = this.f62103;
                if (cArr.length <= 1) {
                    i2 = this.f62092.read();
                } else {
                    int i4 = this.f62108;
                    if (i4 < this.f62112) {
                        this.f62108 = i4 + 1;
                        i2 = cArr[i4];
                    } else {
                        int i5 = this.f62092.read(cArr, 0, cArr.length);
                        this.f62112 = i5;
                        int i6 = i5 <= 0 ? -1 : cArr[0];
                        this.f62108 = 1;
                        i2 = i6;
                    }
                }
                if (i2 == 13) {
                    this.f62090 = true;
                    int i7 = this.f62101;
                    this.f62101 = i7 + 1;
                    iArr[i7] = 10;
                } else {
                    if (i2 == 10) {
                        if (!this.f62090) {
                            int i8 = this.f62101;
                            this.f62101 = i8 + 1;
                            iArr[i8] = 10;
                        }
                    } else {
                        int i9 = this.f62101;
                        this.f62101 = i9 + 1;
                        iArr[i9] = i2;
                    }
                    this.f62090 = false;
                }
            } else {
                return iArr[i];
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m44487(String str) {
        if (str.isEmpty()) {
            return false;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ((cCharAt < 'a' || cCharAt > 'z') && !((cCharAt >= 'A' && cCharAt <= 'Z') || cCharAt == '$' || cCharAt == '_' || cCharAt == ':' || cCharAt >= 183)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    private String m44475() throws C10254, IOException {
        int i = this.f62098;
        int iM44481 = m44481(0);
        if ((iM44481 < 97 || iM44481 > 122) && !((iM44481 >= 65 && iM44481 <= 90) || iM44481 == 36 || iM44481 == 95 || iM44481 == 58 || iM44481 >= 192)) {
            m44482("name expected");
            throw null;
        }
        while (true) {
            m44474(m44488());
            int iM44482 = m44481(0);
            if (iM44482 < 97 || iM44482 > 122) {
                if (iM44482 < 65 || iM44482 > 90) {
                    if (iM44482 < 48 || iM44482 > 57) {
                        if (iM44482 != 36 && iM44482 != 95 && iM44482 != 45 && iM44482 != 58 && iM44482 != 46 && iM44482 < 183) {
                            String strM44483 = m44483(i);
                            this.f62098 = i;
                            return strM44483;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private void m44486() throws IOException {
        while (true) {
            int iM44481 = m44481(0);
            if (iM44481 > 32 || iM44481 == -1) {
                return;
            } else {
                m44488();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44493(Reader reader) {
        this.f62092 = reader;
        this.f62106 = 1;
        this.f62114 = 0;
        this.f62095 = 0;
        this.f62088 = 0;
        this.f62107 = null;
        this.f62105 = null;
        this.f62110 = false;
        this.f62113 = -1;
        this.f62108 = 0;
        this.f62112 = 0;
        this.f62101 = 0;
        this.f62104 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m44492(String str) {
        if (DocumentReader.RESERVED.equals(str)) {
            return "http://www.w3.org/XML/1998/namespace";
        }
        if ("xmlns".equals(str)) {
            return "http://www.w3.org/2000/xmlns/";
        }
        int i = this.f62115[this.f62104] << 1;
        while (true) {
            i -= 2;
            if (i < 0) {
                return null;
            }
            if (str == null) {
                String[] strArr = this.f62091;
                if (strArr[i] == null) {
                    return strArr[i + 1];
                }
            } else if (str.equals(this.f62091[i])) {
                return this.f62091[i + 1];
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m44489() {
        return this.f62100;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m44494() {
        return this.f62089;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m44497() {
        return this.f62117;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m44495() {
        return this.f62106;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m44504() {
        return this.f62114;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m44506() {
        return this.f62095;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String m44508() {
        int i = this.f62088;
        if (i < 4) {
            return null;
        }
        if (i == 6 && this.f62097) {
            return null;
        }
        return m44483(0);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String m44498() {
        return this.f62105;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m44499() {
        return this.f62107;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m44490() {
        return this.f62113;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m44496(int i) {
        if (i >= this.f62113) {
            throw new IndexOutOfBoundsException();
        }
        return this.f62099[i << 2];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m44491(int i) {
        if (i >= this.f62113) {
            throw new IndexOutOfBoundsException();
        }
        return this.f62099[(i << 2) + 2];
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C9508 m44505(int i) {
        if (i >= this.f62113) {
            throw new IndexOutOfBoundsException();
        }
        return this.f62093[i << 1];
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m44507(int i) {
        if (i >= this.f62113) {
            throw new IndexOutOfBoundsException();
        }
        return this.f62099[(i << 2) + 1];
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String m44503(int i) {
        if (i >= this.f62113) {
            throw new IndexOutOfBoundsException();
        }
        return this.f62099[(i << 2) + 3];
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C9508 m44500(int i) {
        if (i >= this.f62113) {
            throw new IndexOutOfBoundsException();
        }
        return this.f62093[(i << 1) + 1];
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m44502() {
        return this.f62088;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0189 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:101:0x018b  */
    /* JADX WARN: Code duplicated, block: B:102:0x018e  */
    /* JADX WARN: Code duplicated, block: B:107:0x019a  */
    /* JADX WARN: Code duplicated, block: B:110:0x01a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:120:0x01ba A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:126:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:132:0x01db A[LOOP:1: B:8:0x0025->B:132:0x01db, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:178:0x0196 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x01f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x0281 A[EDGE_INSN: B:195:0x0281->B:154:0x0281 BREAK  A[LOOP:1: B:8:0x0025->B:132:0x01db], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x0192 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x0173 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0163 A[LOOP:2: B:83:0x015d->B:85:0x0163, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:88:0x0171  */
    /* JADX WARN: Code duplicated, block: B:91:0x0179  */
    /* JADX WARN: Code duplicated, block: B:93:0x017d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x017f  */
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m44501() throws C10254, IOException {
        String str;
        int i;
        int i2;
        int i3;
        String str2;
        boolean z;
        int i4;
        int i5;
        int i6;
        int iM44488;
        boolean z2;
        int i7;
        int iM44489;
        int i8;
        this.f62098 = 0;
        this.f62094 = true;
        this.f62100 = this.f62106;
        this.f62089 = this.f62114;
        this.f62117 = this.f62095;
        int i9 = 9999;
        while (this.f62092 != null) {
            int i10 = 3;
            if (this.f62088 == 3) {
                this.f62104--;
            }
            while (true) {
                this.f62113 = -1;
                if (this.f62110) {
                    this.f62110 = false;
                    this.f62088 = i10;
                    break;
                }
                this.f62116 = null;
                this.f62107 = null;
                this.f62105 = null;
                int iM44485 = m44485();
                this.f62088 = iM44485;
                if (iM44485 == 1) {
                    break;
                }
                if (iM44485 == 2) {
                    m44480(false);
                    break;
                }
                if (iM44485 == i10) {
                    m44488();
                    m44488();
                    this.f62107 = m44475();
                    m44486();
                    m44477('>');
                    int i11 = this.f62104;
                    int i12 = (i11 - 1) << 2;
                    if (i11 == 0) {
                        m44482("element stack empty");
                        throw null;
                    }
                    int i13 = i12 + 3;
                    if (this.f62107.equals(this.f62102[i13])) {
                        String[] strArr = this.f62102;
                        this.f62105 = strArr[i12];
                        this.f62116 = strArr[i12 + 1];
                        this.f62107 = strArr[i12 + 2];
                        break;
                    }
                    m44482("expected: /" + this.f62102[i13] + " read: " + this.f62107);
                    throw null;
                }
                if (iM44485 == 4) {
                    m44478(60, true);
                    if (this.f62104 != 0 || !this.f62094) {
                        break;
                        break;
                    }
                    this.f62100 = this.f62106;
                    this.f62089 = this.f62114;
                    this.f62117 = this.f62095;
                    this.f62088 = 7;
                    break;
                }
                if (iM44485 == 6) {
                    m44484();
                    break;
                }
                m44488();
                int iM444810 = m44488();
                if (iM444810 == 63) {
                    if ((m44481(0) == 120 || m44481(0) == 88) && (m44481(1) == 109 || m44481(1) == 77)) {
                        m44488();
                        m44488();
                        if ((m44481(0) == 108 || m44481(0) == 76) && m44481(1) <= 32) {
                            if (this.f62106 != 1 || this.f62114 > 4) {
                                m44482("PI must not start with xml");
                                throw null;
                            }
                            m44480(true);
                            if (this.f62113 < 1 || !"version".equals(this.f62099[2])) {
                                m44482("version expected");
                                throw null;
                            }
                            String[] strArr2 = this.f62099;
                            String str3 = strArr2[3];
                            if (1 >= this.f62113 || !"encoding".equals(strArr2[6])) {
                                i8 = 1;
                            } else {
                                String str4 = this.f62099[7];
                                i8 = 2;
                            }
                            if (i8 < this.f62113) {
                                int i14 = i8 * 4;
                                if ("standalone".equals(this.f62099[i14 + 2])) {
                                    String str5 = this.f62099[i14 + 3];
                                    if (!"yes".equals(str5) && !"no".equals(str5)) {
                                        m44482(C25272.m56409("illegal standalone value: ", str5));
                                        throw null;
                                    }
                                    i8++;
                                }
                            }
                            if (i8 != this.f62113) {
                                m44482("illegal xmldecl");
                                throw null;
                            }
                            this.f62094 = true;
                            this.f62098 = 0;
                            i4 = EnumC5810.f19955;
                        }
                        this.f62088 = i4;
                        if (i4 == 998) {
                            break;
                        }
                        this.f62100 = this.f62106;
                        this.f62089 = this.f62114;
                        this.f62117 = this.f62095;
                        i10 = 3;
                    }
                    str = "";
                    i = 8;
                    i2 = 63;
                } else {
                    if (iM444810 != 33) {
                        m44482(C13645.m33382(iM444810, "illegal: <"));
                        throw null;
                    }
                    if (m44481(0) != 45) {
                        if (m44481(0) == 91) {
                            i3 = 5;
                            str2 = "[CDATA[";
                            i2 = 93;
                            z = true;
                        } else {
                            str = "DOCTYPE";
                            i = 10;
                            i2 = -1;
                        }
                        for (i5 = 0; i5 < str2.length(); i5++) {
                            m44477(str2.charAt(i5));
                        }
                        if (i3 == 10) {
                            z2 = false;
                            i7 = 1;
                            while (true) {
                                iM44489 = m44488();
                                if (iM44489 != -1) {
                                    m44482("Unexpected EOF");
                                    throw null;
                                }
                                if (iM44489 != 39) {
                                    z2 = !z2;
                                } else if (iM44489 != 60) {
                                    if (iM44489 == 62 && !z2 && (i7 = i7 - 1) == 0) {
                                        break;
                                    }
                                } else if (!z2) {
                                    i7++;
                                }
                                if (z) {
                                    m44474(iM44489);
                                }
                            }
                        } else {
                            i6 = 0;
                            while (true) {
                                iM44488 = m44488();
                                if (iM44488 != -1) {
                                    m44482("Unexpected EOF");
                                    throw null;
                                }
                                if (z) {
                                    m44474(iM44488);
                                }
                                if ((i2 == 63 || iM44488 == i2) && m44481(0) == i2 && m44481(1) == 62) {
                                    if (i2 != 45 && i6 == 45) {
                                        m44482("illegal comment delimiter: --->");
                                        throw null;
                                    }
                                    m44488();
                                    m44488();
                                    if (!z || i2 == 63) {
                                        break;
                                        break;
                                    }
                                    this.f62098--;
                                    break;
                                }
                                i6 = iM44488;
                            }
                        }
                        i4 = i3;
                        this.f62088 = i4;
                        if (i4 == 998) {
                            break;
                            break;
                        }
                        this.f62100 = this.f62106;
                        this.f62089 = this.f62114;
                        this.f62117 = this.f62095;
                        i10 = 3;
                    } else {
                        i = 9;
                        str = "--";
                        i2 = 45;
                    }
                }
                z = false;
                int i15 = i;
                str2 = str;
                i3 = i15;
                while (i5 < str2.length()) {
                    m44477(str2.charAt(i5));
                }
                if (i3 == 10) {
                    z2 = false;
                    i7 = 1;
                    while (true) {
                        iM44489 = m44488();
                        if (iM44489 != -1) {
                            m44482("Unexpected EOF");
                            throw null;
                        }
                        if (iM44489 != 39) {
                            z2 = !z2;
                        } else if (iM44489 != 60) {
                            if (iM44489 == 62) {
                                break;
                                break;
                            }
                        } else if (!z2) {
                            i7++;
                        }
                        if (z) {
                            m44474(iM44489);
                        }
                    }
                } else {
                    i6 = 0;
                    while (true) {
                        iM44488 = m44488();
                        if (iM44488 != -1) {
                            m44482("Unexpected EOF");
                            throw null;
                        }
                        if (z) {
                            m44474(iM44488);
                        }
                        if (i2 == 63) {
                            if (i2 != 45) {
                            }
                            m44488();
                            m44488();
                            if (!z) {
                                break;
                            }
                            this.f62098--;
                            break;
                        }
                        if (i2 != 45) {
                        }
                        m44488();
                        m44488();
                        if (!z) {
                            break;
                        }
                        this.f62098--;
                        break;
                        this.f62088 = i4;
                        if (i4 == 998) {
                            break;
                            break;
                        }
                        this.f62100 = this.f62106;
                        this.f62089 = this.f62114;
                        this.f62117 = this.f62095;
                        i10 = 3;
                        i6 = iM44488;
                    }
                }
                i4 = i3;
                this.f62088 = i4;
                if (i4 == 998) {
                    break;
                    break;
                }
                this.f62100 = this.f62106;
                this.f62089 = this.f62114;
                this.f62117 = this.f62095;
                i10 = 3;
            }
            int i16 = this.f62088;
            if (i16 < i9) {
                i9 = i16;
            }
            if (i9 <= 6 && (i9 < 4 || m44485() < 4)) {
                this.f62088 = i9;
                if (i9 > 4) {
                    this.f62088 = 4;
                }
                return this.f62088;
            }
        }
        m44482("No Input specified");
        throw null;
    }
}
