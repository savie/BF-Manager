package l;

import android.util.Base64;
import com.alipay.sdk.m.p.a;
import com.alipay.sdk.m.y.l;
import java.io.IOException;
import java.io.Reader;
import java.util.Map;
import org.simpleframework.xml.stream.DocumentReader;

/* JADX INFO: renamed from: l.ۗ᩸ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: E5LS */
/* JADX INFO: loaded from: classes2.dex */
public final class C3504 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final Map f12823 = AbstractC6910.m18531();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f12824;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f12826;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f12827;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f12828;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f12830;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f12832;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f12833;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f12836;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f12837;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Boolean f12840;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f12841;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f12842;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f12843;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Reader f12844;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f12845;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f12847;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f12848;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public char[] f12850;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f12851;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f12852;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f12853;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f12854;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f12855;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public String[] f12825 = new String[16];

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public String[] f12849 = new String[8];

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int[] f12834 = new int[4];

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public char[] f12831 = new char[128];

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String[] f12838 = new String[16];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C11868[] f12829 = new C11868[8];

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int[] f12835 = new int[2];

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C7931 f12846 = new C7931();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C11868 f12839 = new C11868();

    public C3504() {
        this.f12850 = new char[Runtime.getRuntime().freeMemory() >= 1048576 ? 8192 : 128];
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m10304(String str) throws C4811 {
        if (str.length() >= 100) {
            str = str.substring(0, 100) + "\n";
        }
        throw new C4811(str, this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m10300(String str, C11868 c11868) throws C4811 {
        if (str.length() >= 100) {
            str = str.substring(0, 100) + "\n";
        }
        throw new C4811(str, c11868);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private int m10307() throws IOException, C4811 {
        int iM10305 = m10305(0);
        if (iM10305 == -1) {
            int i = this.f12853;
            if (i == 0) {
                return 1;
            }
            m10304(C22697.m50267(new StringBuilder("expected: </"), this.f12825[((i - 1) << 2) + 3], ">"));
            throw null;
        }
        if (iM10305 == 38) {
            return 6;
        }
        if (iM10305 != 60) {
            return 4;
        }
        int iM10306 = m10305(1);
        if (iM10306 == 33) {
            return EnumC12167.f40728;
        }
        if (iM10306 == 47) {
            return 3;
        }
        if (iM10306 != 63) {
            return 2;
        }
        return EnumC12167.f40728;
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
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private String m10296(int i) {
        int i2;
        char c;
        char[] cArr = this.f12831;
        int i3 = this.f12837 - i;
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
        C7931 c7931 = this.f12846;
        String str = (String) c7931.get(i4);
        if (str != null && str.length() == i3) {
            for (int i5 = 0; i5 < i3; i5++) {
                if (cArr[i5 + i] == str.charAt(i5)) {
                }
            }
            return str;
        }
        String str2 = new String(cArr, i, i3);
        c7931.mo8944(i4, str2);
        return str2;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private void m10297(int i) {
        this.f12828 &= i <= 32;
        int i2 = this.f12837;
        char[] cArr = this.f12831;
        if (i2 == cArr.length) {
            char[] cArr2 = new char[C0833.m3428(i2, 4, 3, 4)];
            System.arraycopy(cArr, 0, cArr2, 0, i2);
            this.f12831 = cArr2;
        }
        char[] cArr3 = this.f12831;
        int i3 = this.f12837;
        this.f12837 = i3 + 1;
        cArr3[i3] = (char) i;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C11868 m10330() {
        return this.f12839;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m10301(boolean z) throws IOException, C4811 {
        String strSubstring;
        if (!z) {
            m10302();
        }
        C11868 c11868 = this.f12839;
        c11868.m29587(this);
        this.f12847 = m10309();
        c11868.m29582(this);
        this.f12841 = 0;
        if (this.f12840 == null) {
            try {
                ClassLoader classLoader = C3504.class.getClassLoader();
                C13638.requireNonNull(classLoader);
                if (classLoader.loadClass(new String(Base64.decode("YW5kcm9pZC5zdXBwb3J0LmNvbXBhdC5S", 0))) != null || classLoader.loadClass(new String(Base64.decode("bmV0LmRvbmdsaXUuYXBrLnBhcnNlci5wYXJzZXIuWG1sVHJhbnNsYXRvcg==", 0))) != null) {
                    this.f12840 = Boolean.TRUE;
                } else {
                    this.f12840 = Boolean.FALSE;
                }
            } catch (Throwable unused) {
                this.f12840 = Boolean.FALSE;
            }
        }
        boolean z2 = ((this.f12852 + this.f12827) % 4 == 0 && this.f12840.booleanValue()) ? false : true;
        while (true) {
            m10303();
            int iM10305 = m10305(0);
            if (!z) {
                if (iM10305 == 47) {
                    this.f12830 = true;
                    m10302();
                    m10303();
                    m10298('>');
                    break;
                }
                if (iM10305 == 62) {
                    m10302();
                    break;
                }
            } else if (iM10305 == 63) {
                m10302();
                m10298('>');
                return;
            }
            if (iM10305 == -1) {
                m10304("Unexpected EOF");
                throw null;
            }
            int i = this.f12841;
            int i2 = i << 2;
            int i3 = i + 1;
            this.f12841 = i3;
            int i4 = i << 1;
            if (!z2 && (i3 & (-2)) != 0) {
                this.f12841 = (i3 & 1) + 1;
            }
            String[] strArr = this.f12838;
            if (strArr.length < i2 + 4) {
                String[] strArr2 = new String[i2 + 20];
                System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
                strArr = strArr2;
            }
            this.f12838 = strArr;
            C11868[] c11868Arr = this.f12829;
            if (c11868Arr.length < i4 + 2) {
                C11868[] c11868Arr2 = new C11868[i4 + 10];
                System.arraycopy(c11868Arr, 0, c11868Arr2, 0, c11868Arr.length);
                c11868Arr = c11868Arr2;
            }
            this.f12829 = c11868Arr;
            C11868 c11869 = c11868Arr[i4];
            if (c11869 == null) {
                c11869 = new C11868();
                c11868Arr[i4] = c11869;
            }
            c11869.m29587(this);
            String strM10309 = m10309();
            c11869.m29582(this);
            if (strM10309.length() == 0) {
                m10304("attr name expected");
                throw null;
            }
            C11868[] c11868Arr3 = this.f12829;
            int i5 = i4 + 1;
            C11868 c118610 = c11868Arr3[i5];
            if (c118610 == null) {
                c118610 = new C11868();
                c11868Arr3[i5] = c118610;
            }
            String[] strArr3 = this.f12838;
            strArr3[i2] = "";
            int i6 = i2 + 2;
            strArr3[i2 + 1] = null;
            int i7 = i2 + 3;
            strArr3[i6] = strM10309;
            m10303();
            if (m10305(0) != 61) {
                m10304("Attr.value missing f. ".concat(strM10309));
                throw null;
            }
            m10298(a.h);
            m10303();
            int iM10306 = m10305(0);
            if (iM10306 != 39 && iM10306 != 34) {
                m10304("attr value delimiter missing!");
                throw null;
            }
            m10302();
            c118610.m29587(this);
            int i8 = this.f12837;
            m10299(iM10306, true);
            c118610.m29582(this);
            this.f12838[i7] = m10296(i8);
            this.f12837 = i8;
            if (iM10306 != 32) {
                m10302();
            }
        }
        int i9 = this.f12853;
        this.f12853 = i9 + 1;
        int i10 = i9 << 2;
        String[] strArr4 = this.f12825;
        if (strArr4.length < i10 + 4) {
            String[] strArr5 = new String[i10 + 20];
            System.arraycopy(strArr4, 0, strArr5, 0, strArr4.length);
            strArr4 = strArr5;
        }
        this.f12825 = strArr4;
        strArr4[i10 + 3] = this.f12847;
        int i11 = this.f12853;
        int[] iArr = this.f12834;
        if (i11 >= iArr.length) {
            int[] iArr2 = new int[i11 + 4];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f12834 = iArr2;
        }
        int[] iArr3 = this.f12834;
        int i12 = this.f12853;
        iArr3[i12] = iArr3[i12 - 1];
        for (int i13 = 0; i13 < this.f12841; i13++) {
            int i14 = i13 << 2;
            int i15 = i13 << 1;
            String str = this.f12838[i14 + 2];
            int iIndexOf = str.indexOf(58);
            if (iIndexOf != -1) {
                String strSubstring2 = str.substring(0, iIndexOf);
                strSubstring = str.substring(iIndexOf + 1);
                str = strSubstring2;
            } else {
                if (str.equals("xmlns")) {
                    strSubstring = null;
                } else {
                    continue;
                }
            }
            if (str.equals("xmlns")) {
                int[] iArr4 = this.f12834;
                int i16 = this.f12853;
                int i17 = iArr4[i16];
                iArr4[i16] = i17 + 1;
                int i18 = i17 << 1;
                String[] strArr6 = this.f12849;
                if (strArr6.length < i18 + 2) {
                    String[] strArr7 = new String[i18 + 18];
                    System.arraycopy(strArr6, 0, strArr7, 0, strArr6.length);
                    strArr6 = strArr7;
                }
                this.f12849 = strArr6;
                strArr6[i18] = strSubstring;
                String[] strArr8 = this.f12838;
                int i19 = i14 + 3;
                strArr6[i18 + 1] = strArr8[i19];
                if (strSubstring != null && strArr8[i19].equals("")) {
                    m10300("illegal empty namespace", this.f12829[i15]);
                    throw null;
                }
            } else {
                continue;
            }
        }
        for (int i20 = 0; i20 < this.f12841; i20++) {
            int i21 = i20 << 2;
            int i22 = i20 << 1;
            int i23 = i21 + 2;
            String str2 = this.f12838[i23];
            int iIndexOf2 = str2.indexOf(58);
            if (iIndexOf2 == 0) {
                m10300("illegal attribute name: ".concat(str2), this.f12829[i22]);
                throw null;
            }
            if (iIndexOf2 != -1) {
                String strSubstring3 = str2.substring(0, iIndexOf2);
                String strSubstring4 = str2.substring(iIndexOf2 + 1);
                String strM10316 = m10316(strSubstring3);
                if (strM10316 == null) {
                    C11868 c11868M29589clone = this.f12829[i22].clone();
                    c11868M29589clone.m29586(c11868M29589clone.m29580() + iIndexOf2);
                    c11868M29589clone.m29584(c11868M29589clone.m29583() + iIndexOf2);
                    m10300("Undefined Prefix: " + strSubstring3, c11868M29589clone);
                    throw null;
                }
                String[] strArr9 = this.f12838;
                strArr9[i21] = strM10316;
                strArr9[i21 + 1] = strSubstring3;
                strArr9[i23] = strSubstring4;
            }
        }
        int iIndexOf3 = this.f12847.indexOf(58);
        if (iIndexOf3 == 0) {
            m10300("illegal tag name: " + this.f12847, c11868);
            throw null;
        }
        if (iIndexOf3 != -1) {
            this.f12851 = this.f12847.substring(0, iIndexOf3);
            this.f12847 = this.f12847.substring(iIndexOf3 + 1);
        }
        String strM10317 = m10316(this.f12851);
        this.f12848 = strM10317;
        if (strM10317 == null) {
            if (this.f12851 != null) {
                C11868 c11868M29589clone2 = c11868.clone();
                c11868M29589clone2.m29586(c11868M29589clone2.m29580() + iIndexOf3);
                c11868M29589clone2.m29584(c11868M29589clone2.m29583() + iIndexOf3);
                m10300("undefined prefix: " + this.f12851, c11868M29589clone2);
                throw null;
            }
            this.f12848 = "";
        }
        String[] strArr10 = this.f12825;
        strArr10[i10] = this.f12848;
        strArr10[i10 + 1] = this.f12851;
        strArr10[i10 + 2] = this.f12847;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m10308() throws IOException, C4811 {
        m10297(m10302());
        int i = this.f12837;
        while (true) {
            int iM10302 = m10302();
            if (iM10302 == 59) {
                String strM10296 = m10296(i);
                this.f12837 = i - 1;
                if (strM10296.charAt(0) == '#') {
                    m10297(strM10296.charAt(1) == 'x' ? Integer.parseInt(strM10296.substring(2), 16) : Integer.parseInt(strM10296.substring(1)));
                    return;
                }
                String str = (String) f12823.get(strM10296);
                boolean z = str == null;
                this.f12842 = z;
                if (z) {
                    m10304(C16523.m38890("unresolved: &", strM10296, l.b));
                    throw null;
                }
                for (int i2 = 0; i2 < str.length(); i2++) {
                    m10297(str.charAt(i2));
                }
                return;
            }
            if (iM10302 < 128 && ((iM10302 < 48 || iM10302 > 57) && ((iM10302 < 97 || iM10302 > 122) && ((iM10302 < 65 || iM10302 > 90) && iM10302 != 95 && iM10302 != 45 && iM10302 != 35)))) {
                m10304("unterminated entity ref");
                throw null;
            }
            m10297(iM10302);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m10299(int i, boolean z) throws IOException, C4811 {
        int iM10305 = m10305(0);
        int i2 = 0;
        while (iM10305 != -1 && iM10305 != i) {
            if (i == 32 && (iM10305 <= 32 || iM10305 == 62)) {
                return;
            }
            if (iM10305 != 38) {
                m10297(m10302());
            } else if (!z) {
                return;
            } else {
                m10308();
            }
            if (iM10305 == 62 && i2 >= 2 && i != 93) {
                m10304("Illegal: ]]>");
                throw null;
            }
            i2 = iM10305 == 93 ? i2 + 1 : 0;
            iM10305 = m10305(0);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m10298(char c) throws IOException, C4811 {
        int iM10302 = m10302();
        if (iM10302 == c) {
            return;
        }
        m10304("expected: '" + c + "' actual: '" + ((char) iM10302) + "'");
        throw null;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    private int m10302() throws IOException {
        int iM10305;
        if (this.f12836 == 0) {
            iM10305 = m10305(0);
        } else {
            int[] iArr = this.f12835;
            int i = iArr[0];
            iArr[0] = iArr[1];
            iM10305 = i;
        }
        this.f12836--;
        this.f12827++;
        this.f12833++;
        if (iM10305 == 10) {
            this.f12852++;
            this.f12827 = 1;
        }
        return iM10305;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private int m10305(int i) throws IOException {
        int i2;
        while (true) {
            int i3 = this.f12836;
            int[] iArr = this.f12835;
            if (i >= i3) {
                char[] cArr = this.f12850;
                if (cArr.length <= 1) {
                    i2 = this.f12844.read();
                } else {
                    int i4 = this.f12845;
                    if (i4 < this.f12824) {
                        this.f12845 = i4 + 1;
                        i2 = cArr[i4];
                    } else {
                        int i5 = this.f12844.read(cArr, 0, cArr.length);
                        this.f12824 = i5;
                        int i6 = i5 <= 0 ? -1 : cArr[0];
                        this.f12845 = 1;
                        i2 = i6;
                    }
                }
                if (i2 == 13) {
                    this.f12826 = true;
                    int i7 = this.f12836;
                    this.f12836 = i7 + 1;
                    iArr[i7] = 10;
                } else {
                    if (i2 == 10) {
                        if (!this.f12826) {
                            int i8 = this.f12836;
                            this.f12836 = i8 + 1;
                            iArr[i8] = 10;
                        }
                    } else {
                        int i9 = this.f12836;
                        this.f12836 = i9 + 1;
                        iArr[i9] = i2;
                    }
                    this.f12826 = false;
                }
            } else {
                return iArr[i];
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m10306(String str) {
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

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private String m10309() throws IOException, C4811 {
        int i = this.f12837;
        int iM10305 = m10305(0);
        if ((iM10305 < 97 || iM10305 > 122) && !((iM10305 >= 65 && iM10305 <= 90) || iM10305 == 36 || iM10305 == 95 || iM10305 == 58 || iM10305 >= 192)) {
            m10304("name expected");
            throw null;
        }
        while (true) {
            m10297(m10302());
            int iM10306 = m10305(0);
            if (iM10306 < 97 || iM10306 > 122) {
                if (iM10306 < 65 || iM10306 > 90) {
                    if (iM10306 < 48 || iM10306 > 57) {
                        if (iM10306 != 36 && iM10306 != 95 && iM10306 != 45 && iM10306 != 58 && iM10306 != 46 && iM10306 < 183) {
                            String strM10296 = m10296(i);
                            this.f12837 = i;
                            return strM10296;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    private void m10303() throws IOException {
        while (true) {
            int iM10305 = m10305(0);
            if (iM10305 > 32 || iM10305 == -1) {
                return;
            } else {
                m10302();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10317(Reader reader) {
        this.f12844 = reader;
        this.f12852 = 1;
        this.f12827 = 0;
        this.f12833 = 0;
        this.f12855 = 0;
        this.f12847 = null;
        this.f12848 = null;
        this.f12830 = false;
        this.f12841 = -1;
        this.f12845 = 0;
        this.f12824 = 0;
        this.f12836 = 0;
        this.f12853 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m10316(String str) {
        if (DocumentReader.RESERVED.equals(str)) {
            return "http://www.w3.org/XML/1998/namespace";
        }
        if ("xmlns".equals(str)) {
            return "http://www.w3.org/2000/xmlns/";
        }
        int i = this.f12834[this.f12853] << 1;
        while (true) {
            i -= 2;
            if (i < 0) {
                return null;
            }
            if (str == null) {
                String[] strArr = this.f12849;
                if (strArr[i] == null) {
                    return strArr[i + 1];
                }
            } else if (str.equals(this.f12849[i])) {
                return this.f12849[i + 1];
            }
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int m10313() {
        return this.f12854;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int m10323() {
        return this.f12832;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m10320() {
        return this.f12843;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m10321() {
        return this.f12852;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m10324() {
        return this.f12827;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m10311() {
        return this.f12833;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final String m10326() {
        int i = this.f12855;
        if (i < 4) {
            return null;
        }
        if (i == 6 && this.f12842) {
            return null;
        }
        return m10296(0);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String m10310() {
        return this.f12848;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String m10328() {
        return this.f12847;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m10314() {
        return this.f12841;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m10322(int i) {
        if (i >= this.f12841) {
            throw new IndexOutOfBoundsException();
        }
        return this.f12838[i << 2];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m10315(int i) {
        if (i >= this.f12841) {
            throw new IndexOutOfBoundsException();
        }
        return this.f12838[(i << 2) + 2];
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C11868 m10325(int i) {
        if (i >= this.f12841) {
            throw new IndexOutOfBoundsException();
        }
        return this.f12829[i << 1];
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m10312(int i) {
        if (i >= this.f12841) {
            throw new IndexOutOfBoundsException();
        }
        return this.f12838[(i << 2) + 1];
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m10319(int i) {
        if (i >= this.f12841) {
            throw new IndexOutOfBoundsException();
        }
        return this.f12838[(i << 2) + 3];
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C11868 m10329(int i) {
        if (i >= this.f12841) {
            throw new IndexOutOfBoundsException();
        }
        return this.f12829[(i << 1) + 1];
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m10318() {
        return this.f12855;
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
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m10327() throws IOException, C4811 {
        String str;
        int i;
        int i2;
        int i3;
        String str2;
        boolean z;
        int i4;
        int i5;
        int i6;
        int iM10302;
        boolean z2;
        int i7;
        int iM10303;
        int i8;
        this.f12837 = 0;
        this.f12828 = true;
        this.f12854 = this.f12852;
        this.f12832 = this.f12827;
        this.f12843 = this.f12833;
        int i9 = 9999;
        while (this.f12844 != null) {
            int i10 = 3;
            if (this.f12855 == 3) {
                this.f12853--;
            }
            while (true) {
                this.f12841 = -1;
                if (this.f12830) {
                    this.f12830 = false;
                    this.f12855 = i10;
                    break;
                }
                this.f12851 = null;
                this.f12847 = null;
                this.f12848 = null;
                int iM10307 = m10307();
                this.f12855 = iM10307;
                if (iM10307 == 1) {
                    break;
                }
                if (iM10307 == 2) {
                    m10301(false);
                    break;
                }
                if (iM10307 == i10) {
                    m10302();
                    m10302();
                    this.f12847 = m10309();
                    m10303();
                    m10298('>');
                    int i11 = this.f12853;
                    int i12 = (i11 - 1) << 2;
                    if (i11 == 0) {
                        m10304("element stack empty");
                        throw null;
                    }
                    int i13 = i12 + 3;
                    if (this.f12847.equals(this.f12825[i13])) {
                        String[] strArr = this.f12825;
                        this.f12848 = strArr[i12];
                        this.f12851 = strArr[i12 + 1];
                        this.f12847 = strArr[i12 + 2];
                        break;
                    }
                    m10304("expected: /" + this.f12825[i13] + " read: " + this.f12847);
                    throw null;
                }
                if (iM10307 == 4) {
                    m10299(60, true);
                    if (this.f12853 != 0 || !this.f12828) {
                        break;
                        break;
                    }
                    this.f12854 = this.f12852;
                    this.f12832 = this.f12827;
                    this.f12843 = this.f12833;
                    this.f12855 = 7;
                    break;
                }
                if (iM10307 == 6) {
                    m10308();
                    break;
                }
                m10302();
                int iM10304 = m10302();
                if (iM10304 == 63) {
                    if ((m10305(0) == 120 || m10305(0) == 88) && (m10305(1) == 109 || m10305(1) == 77)) {
                        m10302();
                        m10302();
                        if ((m10305(0) == 108 || m10305(0) == 76) && m10305(1) <= 32) {
                            if (this.f12852 != 1 || this.f12827 > 4) {
                                m10304("PI must not start with xml");
                                throw null;
                            }
                            m10301(true);
                            if (this.f12841 < 1 || !"version".equals(this.f12838[2])) {
                                m10304("version expected");
                                throw null;
                            }
                            String[] strArr2 = this.f12838;
                            String str3 = strArr2[3];
                            if (1 >= this.f12841 || !"encoding".equals(strArr2[6])) {
                                i8 = 1;
                            } else {
                                String str4 = this.f12838[7];
                                i8 = 2;
                            }
                            if (i8 < this.f12841) {
                                int i14 = i8 * 4;
                                if ("standalone".equals(this.f12838[i14 + 2])) {
                                    String str5 = this.f12838[i14 + 3];
                                    if (!"yes".equals(str5) && !"no".equals(str5)) {
                                        m10304(C0252.m1693("illegal standalone value: ", str5));
                                        throw null;
                                    }
                                    i8++;
                                }
                            }
                            if (i8 != this.f12841) {
                                m10304("illegal xmldecl");
                                throw null;
                            }
                            this.f12828 = true;
                            this.f12837 = 0;
                            i4 = EnumC12167.f40708;
                        }
                        this.f12855 = i4;
                        if (i4 == 998) {
                            break;
                        }
                        this.f12854 = this.f12852;
                        this.f12832 = this.f12827;
                        this.f12843 = this.f12833;
                        i10 = 3;
                    }
                    str = "";
                    i = 8;
                    i2 = 63;
                } else {
                    if (iM10304 != 33) {
                        m10304(C8479.m22141(iM10304, "illegal: <"));
                        throw null;
                    }
                    if (m10305(0) != 45) {
                        if (m10305(0) == 91) {
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
                            m10298(str2.charAt(i5));
                        }
                        if (i3 == 10) {
                            z2 = false;
                            i7 = 1;
                            while (true) {
                                iM10303 = m10302();
                                if (iM10303 != -1) {
                                    m10304("Unexpected EOF");
                                    throw null;
                                }
                                if (iM10303 != 39) {
                                    z2 = !z2;
                                } else if (iM10303 != 60) {
                                    if (iM10303 == 62 && !z2 && (i7 = i7 - 1) == 0) {
                                        break;
                                    }
                                } else if (!z2) {
                                    i7++;
                                }
                                if (z) {
                                    m10297(iM10303);
                                }
                            }
                        } else {
                            i6 = 0;
                            while (true) {
                                iM10302 = m10302();
                                if (iM10302 != -1) {
                                    m10304("Unexpected EOF");
                                    throw null;
                                }
                                if (z) {
                                    m10297(iM10302);
                                }
                                if ((i2 == 63 || iM10302 == i2) && m10305(0) == i2 && m10305(1) == 62) {
                                    if (i2 != 45 && i6 == 45) {
                                        m10304("illegal comment delimiter: --->");
                                        throw null;
                                    }
                                    m10302();
                                    m10302();
                                    if (!z || i2 == 63) {
                                        break;
                                        break;
                                    }
                                    this.f12837--;
                                    break;
                                }
                                i6 = iM10302;
                            }
                        }
                        i4 = i3;
                        this.f12855 = i4;
                        if (i4 == 998) {
                            break;
                            break;
                        }
                        this.f12854 = this.f12852;
                        this.f12832 = this.f12827;
                        this.f12843 = this.f12833;
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
                    m10298(str2.charAt(i5));
                }
                if (i3 == 10) {
                    z2 = false;
                    i7 = 1;
                    while (true) {
                        iM10303 = m10302();
                        if (iM10303 != -1) {
                            m10304("Unexpected EOF");
                            throw null;
                        }
                        if (iM10303 != 39) {
                            z2 = !z2;
                        } else if (iM10303 != 60) {
                            if (iM10303 == 62) {
                                break;
                                break;
                            }
                        } else if (!z2) {
                            i7++;
                        }
                        if (z) {
                            m10297(iM10303);
                        }
                    }
                } else {
                    i6 = 0;
                    while (true) {
                        iM10302 = m10302();
                        if (iM10302 != -1) {
                            m10304("Unexpected EOF");
                            throw null;
                        }
                        if (z) {
                            m10297(iM10302);
                        }
                        if (i2 == 63) {
                            if (i2 != 45) {
                            }
                            m10302();
                            m10302();
                            if (!z) {
                                break;
                            }
                            this.f12837--;
                            break;
                        }
                        if (i2 != 45) {
                        }
                        m10302();
                        m10302();
                        if (!z) {
                            break;
                        }
                        this.f12837--;
                        break;
                        this.f12855 = i4;
                        if (i4 == 998) {
                            break;
                            break;
                        }
                        this.f12854 = this.f12852;
                        this.f12832 = this.f12827;
                        this.f12843 = this.f12833;
                        i10 = 3;
                        i6 = iM10302;
                    }
                }
                i4 = i3;
                this.f12855 = i4;
                if (i4 == 998) {
                    break;
                    break;
                }
                this.f12854 = this.f12852;
                this.f12832 = this.f12827;
                this.f12843 = this.f12833;
                i10 = 3;
            }
            int i16 = this.f12855;
            if (i16 < i9) {
                i9 = i16;
            }
            if (i9 <= 6 && (i9 < 4 || m10307() < 4)) {
                this.f12855 = i9;
                if (i9 > 4) {
                    this.f12855 = 4;
                }
                return this.f12855;
            }
        }
        m10304("No Input specified");
        throw null;
    }
}
