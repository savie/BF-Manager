package l;

import com.umeng.analytics.pro.d;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.MissingResourceException;
import java.util.Queue;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ܽ᩺۟, reason: contains not printable characters */
/* JADX INFO: compiled from: D445 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16949 {

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public static ResourceBundle f54184;

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public boolean f54187;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public EnumC20477 f54188;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C1512 f54190;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C6761 f54191;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public C15392 f54192;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C23882 f54193;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final AbstractC11242 f54194;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public C0429 f54195;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C18279 f54196;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public C12325 f54197;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C21017 f54198;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public C2008 f54199;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C22822 f54200;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C12343 f54201;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public C21825 f54202;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C0576 f54203;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public C16617 f54204;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C23549 f54205;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public boolean f54206;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public C3836 f54208;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C5286 f54209;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public InterfaceC13464 f54210;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public C2092 f54211;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f54213;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public C14770 f54214;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public EnumC0720 f54215;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public C11450 f54216;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C20312 f54217;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public boolean f54218;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C17573 f54219;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public C23942 f54220;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C20414 f54221;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C9126 f54222;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public EnumC16079 f54223;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C17094 f54224;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public C23800 f54225;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f54226;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public boolean f54227;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f54229;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public EnumC11909 f54230;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C23549 f54231;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C9399 f54233;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f54235;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public boolean f54236;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C10955 f54237;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public C13526 f54238;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC23903 f54240;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C21825 f54241;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C4831 f54243;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public EnumC16079 f54244;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f54245;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public static final C16576 f54183 = new C16576();

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC20477 f54185 = EnumC20477.f66419;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final C8521 f54232 = new C8521(this);

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f54207 = false;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public HashSet f54228 = new HashSet();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f54212 = false;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f54186 = false;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public long f54234 = 0;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public boolean f54189 = false;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public C10474 f54242 = null;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public HashMap f54239 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16949 m39706(C12343 c12343) {
        C16949 c16949 = (C16949) c12343.m30656(f54183);
        return c16949 == null ? new C16949(c12343) : c16949;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static String m39709() {
        return m39710("release");
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static String m39703() {
        return m39710("full");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m39710(String str) {
        if (f54184 == null) {
            try {
                f54184 = ResourceBundle.getBundle("com.sun.tools.javac.resources.version");
            } catch (MissingResourceException unused) {
                return C20414.m46158("version.not.available", new Object[0]);
            }
        }
        try {
            return f54184.getString(str);
        } catch (MissingResourceException unused2) {
            return C20414.m46158("version.not.available", new Object[0]);
        }
    }

    public C16949(C12343 c12343) {
        EnumC16079 enumC16079ValueOf;
        EnumC16079 enumC16079ValueOf2;
        this.f54241 = C21825.m48588();
        this.f54201 = c12343;
        c12343.m30659(f54183, this);
        if (c12343.m30655(InterfaceC13464.class) == null) {
            int i = C14315.f46886;
            c12343.m30658(InterfaceC13464.class, (InterfaceC0347) new C17841());
        }
        this.f54220 = C23942.m52776(c12343);
        this.f54221 = C20414.m46161(c12343);
        this.f54231 = C23549.m51906(c12343);
        this.f54203 = C0576.m2728(c12343);
        this.f54195 = C0429.m2220(c12343);
        this.f54209 = C5286.m14576(c12343);
        this.f54216 = C11450.m28569(c12343);
        this.f54200 = C22822.m50514(c12343);
        this.f54233 = C9399.m24138(c12343);
        this.f54204 = C16617.m39076(c12343);
        this.f54210 = (InterfaceC13464) c12343.m30655(InterfaceC13464.class);
        this.f54192 = C15392.m36825(c12343);
        this.f54217 = C20312.m45852(c12343);
        try {
            this.f54208 = C3836.m11131(c12343);
        } catch (C4146 e) {
            C20414 c20414 = this.f54221;
            AbstractC23903 abstractC23903 = e.f15170;
            C11948 c11948M11788 = e.m11788();
            C5909 c5909 = C23879.f77204;
            c20414.m48197(new C5909("compiler", "cant.access", abstractC23903, c11948M11788));
        }
        this.f54230 = EnumC11909.m29706(c12343);
        this.f54199 = C2008.m6467(c12343);
        this.f54191 = C6761.m18268(c12343);
        this.f54196 = C18279.m42467(c12343);
        this.f54198 = C21017.m47211(c12343);
        this.f54224 = C17094.m39878(c12343);
        this.f54237 = C10955.m27495(c12343);
        this.f54238 = C13526.m33043(c12343);
        this.f54190 = C1512.m5224(c12343);
        this.f54219 = C17573.m40852(c12343);
        this.f54225 = C23800.m52336(c12343);
        this.f54211 = C2092.m6631(c12343);
        C12325 c12325M30599 = C12325.m30599(c12343);
        this.f54197 = c12325M30599;
        C23882 c23882M52634 = C23882.m52634(c12343);
        this.f54193 = c23882M52634;
        this.f54205 = C23549.m51906(c12343);
        this.f54243 = C4831.m13414(c12343);
        this.f54203.f2508 = this.f54232;
        c12325M30599.f41191 = new C9285(this);
        c23882M52634.f77361 = new C9285(this);
        C14770 c14770M35395 = C14770.m35395(c12343);
        this.f54214 = c14770M35395;
        this.f54236 = c14770M35395.m35408(EnumC19730.f63380);
        this.f54206 = c14770M35395.m35408(EnumC19730.f63367);
        EnumC19730 enumC19730 = EnumC19730.f63377;
        this.f54245 = c14770M35395.m35405(enumC19730) || c14770M35395.m35402(enumC19730, "lines");
        this.f54235 = c14770M35395.m35408(EnumC19730.f63328) || c12343.m30655(InterfaceC9810.class) != null;
        this.f54229 = c14770M35395.m35407("dev");
        this.f54218 = c14770M35395.m35407("process.packages");
        this.f54227 = c14770M35395.m35408(EnumC19730.f63343);
        this.f54187 = c14770M35395.m35407("verboseCompilePolicy");
        this.f54188 = EnumC20477.m46284(c14770M35395.m35397("compilePolicy"));
        this.f54215 = EnumC0720.m3140(c14770M35395.m35397("-implicit"));
        this.f54194 = c14770M35395.m35407("failcomplete") ? this.f54220.f77631.m17389(c14770M35395.m35397("failcomplete")) : null;
        if (c14770M35395.m35407("should-stop.at")) {
            enumC16079ValueOf = EnumC16079.valueOf(c14770M35395.m35397("should-stop.at"));
        } else if (c14770M35395.m35407("should-stop.ifError")) {
            enumC16079ValueOf = EnumC16079.valueOf(c14770M35395.m35397("should-stop.ifError"));
        } else {
            enumC16079ValueOf = EnumC16079.INIT;
        }
        this.f54244 = enumC16079ValueOf;
        if (c14770M35395.m35407("should-stop.ifNoError")) {
            enumC16079ValueOf2 = EnumC16079.valueOf(c14770M35395.m35397("should-stop.ifNoError"));
        } else {
            enumC16079ValueOf2 = EnumC16079.GENERATE;
        }
        this.f54223 = enumC16079ValueOf2;
        if (c14770M35395.m35404("diags.legacy")) {
            this.f54221.m46178(C21679.m48420(c12343));
        }
        InterfaceC23858 interfaceC23858 = (InterfaceC23858) c12343.m30655(InterfaceC23858.class);
        if (interfaceC23858 != null) {
            this.f54241 = this.f54241.m48597(interfaceC23858);
        }
        this.f54240 = new C21182(EnumC10477.f35872, 0L, this.f54220.f77594, AbstractC16579.f53219, this.f54208.f14227);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m39729(EnumC16079 enumC16079) {
        EnumC16079 enumC160710;
        if (m39731() > 0) {
            enumC160710 = this.f54244;
        } else {
            C9126 c9126 = this.f54222;
            if (c9126 != null) {
                Iterator it = ((C19003) c9126.m23454()).iterator();
                while (true) {
                    if (it.hasNext()) {
                        C11948 c11948 = (C11948) it.next();
                        if (c11948.mo29759() == EnumC23921.ERROR && !c11948.m29760(EnumC0264.RECOVERABLE)) {
                            enumC160710 = this.f54244;
                        }
                    }
                }
            }
            enumC160710 = this.f54223;
        }
        return enumC16079.m38107(enumC160710);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m39731() {
        boolean z = this.f54227;
        C20414 c20414 = this.f54221;
        if (z && c20414.f66177 == 0 && c20414.f66179 > 0) {
            c20414.m48197(C23879.f77316);
        }
        return c20414.f66177;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC23903 m39719(String str) {
        C19670 c19670M30637;
        AbstractC23903 abstractC23903M18312;
        int iIndexOf = str.indexOf(47);
        C20414 c20414 = this.f54221;
        if (iIndexOf == -1) {
            c19670M30637 = this.f54197.m30637();
        } else {
            if (!EnumC14026.f46096.m33945(this.f54230)) {
                C5909 c5909 = C23879.f77204;
                c20414.m48197(new C5909("compiler", "invalid.module.specifier", str));
                return this.f54240;
            }
            C19670 c19670M52639 = this.f54193.m52639(this.f54220.f77631.m17389(str.substring(0, iIndexOf)));
            str = str.substring(iIndexOf + 1);
            c19670M30637 = c19670M52639;
        }
        try {
            return this.f54203.m2738(c19670M30637, this.f54220.f77631.m17389(str.replace("/", ".")));
        } catch (C4146 unused) {
            if (str.equals("")) {
                return this.f54208.f14276;
            }
            AbstractC5930 abstractC5930M14639 = null;
            InterfaceC2173 interfaceC2173M48202 = c20414.m48202((InterfaceC2173) null);
            try {
                for (String str2 : str.split("\\.", -1)) {
                    if (!EnumC12508.m31065(str2)) {
                        abstractC23903M18312 = this.f54208.f14276;
                        return abstractC23903M18312;
                    }
                    abstractC5930M14639 = abstractC5930M14639 == null ? this.f54209.m14639(this.f54220.f77631.m17389(str2)) : this.f54209.m14625(abstractC5930M14639, this.f54220.f77631.m17389(str2));
                }
                C10164 c10164M14579 = this.f54209.m14579(C21825.m48588());
                c10164M14579.f34730 = c19670M30637;
                c10164M14579.f34721 = c19670M30637.f63141;
                abstractC23903M18312 = this.f54191.m18312(abstractC5930M14639, c10164M14579);
                return abstractC23903M18312;
            } finally {
                c20414.m48202(interfaceC2173M48202);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2173 m39715(C4603 c4603, C8753 c8753) {
        C20414 c20414 = this.f54221;
        try {
            if (this.f54224.m39912(c4603, c8753) && m39731() == 0) {
                return this.f54216.m28582(c8753.f30086);
            }
            return null;
        } catch (C4146 e) {
            C21017 c21017 = this.f54198;
            c8753.getClass();
            c21017.m47261(c8753, e);
            return null;
        } catch (C11014 unused) {
            c8753.getClass();
            c20414.m48199(c8753, C23879.f77220);
            return null;
        } catch (C13567 e2) {
            c8753.getClass();
            String strSubstring = e2.f44757.substring(0, 20);
            C5909 c5909 = C23879.f77204;
            c20414.m48199(c8753, new C5909("compiler", "limit.string.overflow", strSubstring));
            return null;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2173 m39732(C4603 c4603, C8753 c8753) throws IOException {
        InterfaceC2173 interfaceC2173Mo32951 = this.f54210.mo32951(EnumC3584.CLASS_OUTPUT, c8753.f30086.f73414.toString(), EnumC11347.SOURCE, (InterfaceC3458) null);
        boolean zContains = this.f54228.contains(interfaceC2173Mo32951);
        C20414 c20414 = this.f54221;
        if (zContains) {
            C5909 c5909 = C23879.f77204;
            c20414.m48199(c8753, new C5909("compiler", "source.cant.overwrite.input.file", interfaceC2173Mo32951));
            return null;
        }
        BufferedWriter bufferedWriter = new BufferedWriter(interfaceC2173Mo32951.mo10166());
        try {
            new C15830(bufferedWriter, true).m37632(c4603.f16295, c8753);
            if (this.f54236) {
                c20414.m46183("wrote.file", interfaceC2173Mo32951.getName());
            }
            bufferedWriter.close();
            return interfaceC2173Mo32951;
        } catch (Throwable th) {
            try {
                bufferedWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39726(C10164 c10164, C22492 c22492) {
        boolean z;
        AbstractC11242 abstractC11242 = this.f54194;
        AbstractC11242 abstractC11243 = c22492.f73419;
        C4831 c4831 = this.f54243;
        if (abstractC11242 == abstractC11243) {
            throw new C4146(c22492, new Supplier() { // from class: l.ۡ᩺۟
                @Override // java.util.function.Supplier
                public final Object get() {
                    return this.f31269.f54231.m51910(C14707.f48053);
                }
            }, c4831);
        }
        InterfaceC2173 interfaceC2173 = c22492.f73422;
        C20414 c20414 = this.f54221;
        InterfaceC2173 interfaceC2173M48202 = c20414.m48202(interfaceC2173);
        if (c10164 == null) {
            try {
                try {
                    c10164 = m39717(interfaceC2173, interfaceC2173.mo10164(false));
                } catch (IOException e) {
                    int i = C14315.f46886;
                    String localizedMessage = e.getLocalizedMessage();
                    if (localizedMessage == null && (localizedMessage = e.getMessage()) == null) {
                        localizedMessage = e.toString();
                    }
                    C5909 c5909 = C23879.f77204;
                    c20414.m48197(new C5909("compiler", "error.reading.file", interfaceC2173, localizedMessage));
                    c10164 = this.f54209.m14579(C21825.m48588());
                }
                c20414.m48202(interfaceC2173M48202);
            } catch (Throwable th) {
                c20414.m48202(interfaceC2173M48202);
                throw th;
            }
        }
        C2092 c2092 = this.f54211;
        if (!c2092.m6633()) {
            c2092.m6634(new C4209(EnumC13383.ENTER, c10164));
        }
        if (!this.f54197.m30634(c22492, C21825.of((Object) c10164))) {
            throw new C4146(c22492, new Supplier() { // from class: l.ۤ᩺۟
                @Override // java.util.function.Supplier
                public final Object get() {
                    return this.f36254.f54205.m51910(C14707.f48113);
                }
            }, c4831);
        }
        this.f54233.m24144(c22492, C21825.of((Object) c10164));
        if (!c2092.m6633()) {
            c2092.m6632(new C4209(EnumC13383.ENTER, c10164));
        }
        if (this.f54233.m24141(c22492) == null) {
            InterfaceC2173 interfaceC2174 = c10164.f34725;
            EnumC11347 enumC11347 = EnumC11347.SOURCE;
            boolean zMo6761 = interfaceC2174.mo6761("package-info", enumC11347);
            boolean zMo6762 = c10164.f34725.mo6761("module-info", enumC11347);
            C23549 c23549 = this.f54231;
            if (zMo6762) {
                if (this.f54233.m24141(c10164.f34730) == null) {
                    throw new C16100(c22492, interfaceC2173, c23549.m51910(C14707.f48083), this.f54231, this.f54243);
                }
                z = true;
            } else {
                z = true;
                if (zMo6761) {
                    if (this.f54233.m24141(c10164.f34721) == null) {
                        AbstractC23903 abstractC23903M52708 = c22492.m52708();
                        C14377 c14377 = C14707.f48054;
                        throw new C16100(c22492, interfaceC2173, c23549.m51910(new C14377("compiler", "file.does.not.contain.package", abstractC23903M52708)), this.f54231, this.f54243);
                    }
                } else {
                    AbstractC11242 abstractC11244 = c22492.f73419;
                    C14377 c14378 = C14707.f48054;
                    throw new C16100(c22492, interfaceC2173, c23549.m51910(new C14377("compiler", "file.doesnt.contain.class", abstractC11244)), this.f54231, this.f54243);
                }
            }
        } else {
            z = true;
        }
        this.f54226 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39723(Set set, LinkedHashSet linkedHashSet, Collection collection) {
        C12325 c12325;
        boolean z = this.f54236;
        C20414 c20414 = this.f54221;
        C2092 c2092 = this.f54211;
        if (!c2092.m6633()) {
            c2092.m6634(new C4209(EnumC13383.COMPILATION));
        }
        if (this.f54186) {
            throw new AssertionError("attempt to reuse JavaCompiler");
        }
        this.f54186 = true;
        StringBuilder sb = new StringBuilder();
        EnumC19730 enumC19730 = EnumC19730.f63399;
        sb.append(enumC19730.f63414);
        sb.append("-");
        EnumC0597 enumC0597 = EnumC0597.OPTIONS;
        sb.append(enumC0597.f2616);
        String string = sb.toString();
        C14770 c14770 = this.f54214;
        c14770.m35401(string, "true");
        c14770.m35396(enumC19730.f63414 + enumC0597.f2616);
        this.f54234 = System.currentTimeMillis();
        try {
            try {
                m39722(set, linkedHashSet);
                Iterator it = linkedHashSet.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    c12325 = this.f54197;
                    if (!zHasNext) {
                        break;
                    }
                    String str = (String) it.next();
                    int iIndexOf = str.indexOf(47);
                    if (iIndexOf != -1) {
                        c12325.m30632(str.substring(0, iIndexOf));
                    }
                }
                Iterator it2 = ((C21825) collection).iterator();
                while (it2.hasNext()) {
                    c12325.m30632((String) it2.next());
                }
                EnumC16079 enumC16079 = EnumC16079.ENTER;
                C21825 c21825M39718 = m39718(set, false);
                if (m39729(enumC16079)) {
                    c21825M39718 = C21825.m48588();
                }
                m39734(c21825M39718);
                if (m39729(enumC16079)) {
                    c21825M39718 = C21825.m48588();
                }
                m39727(c21825M39718);
                m39728(c21825M39718, (Collection) linkedHashSet);
                if (c2092.m6633() && this.f54215 == EnumC0720.NONE) {
                    this.f54204.m39079(this.f54228);
                }
                if (!EnumC16079.ATTR.m38107(this.f54223)) {
                    int iOrdinal = this.f54188.ordinal();
                    if (iOrdinal == 0) {
                        C16617 c16617 = this.f54204;
                        C19003 c19003 = new C19003();
                        while (!c16617.isEmpty()) {
                            c19003.m43723(m39716((C4603) c16617.remove()));
                        }
                        if (m39729(EnumC16079.ATTR)) {
                            c19003 = new C19003();
                        }
                        C19003 c19004 = new C19003();
                        Iterator it3 = c19003.iterator();
                        while (it3.hasNext()) {
                            m39724((C4603) it3.next(), c19004);
                        }
                        if (m39729(EnumC16079.FLOW)) {
                            c19004 = new C19003();
                        }
                        m39733(m39714(c19004));
                    } else if (iOrdinal == 1) {
                        LinkedList linkedListM39080 = this.f54204.m39080();
                        while (!linkedListM39080.isEmpty() && !m39729(EnumC16079.ATTR)) {
                            Queue queue = (Queue) linkedListM39080.remove();
                            C19003 c19005 = new C19003();
                            while (!queue.isEmpty()) {
                                c19005.m43723(m39716((C4603) queue.remove()));
                            }
                            if (m39729(EnumC16079.ATTR)) {
                                c19005 = new C19003();
                            }
                            C19003 c19006 = new C19003();
                            Iterator it4 = c19005.iterator();
                            while (it4.hasNext()) {
                                m39724((C4603) it4.next(), c19006);
                            }
                            if (m39729(EnumC16079.FLOW)) {
                                c19006 = new C19003();
                            }
                            m39733(m39714(c19006));
                        }
                    } else {
                        if (iOrdinal != 2) {
                            C6171.m17174("unknown compile policy");
                            throw null;
                        }
                        while (!this.f54204.isEmpty()) {
                            C4603 c4603M39716 = m39716((C4603) this.f54204.remove());
                            C19003 c19007 = new C19003();
                            m39724(c4603M39716, c19007);
                            if (m39729(EnumC16079.FLOW)) {
                                c19007 = new C19003();
                            }
                            m39733(m39714(c19007));
                        }
                    }
                }
                if (z) {
                    c20414.m46183("total", Long.toString(System.currentTimeMillis() - this.f54234));
                }
                m39730();
                if (!c20414.m46181()) {
                    m39721(m39731(), d.O);
                    m39721(c20414.f66179, "warn");
                    m39707(m39731(), c20414.f66178, "count.error.recompile");
                    m39707(c20414.f66179, c20414.f66171, "count.warn.recompile");
                }
                if (!c2092.m6633()) {
                    c2092.m6632(new C4209(EnumC13383.COMPILATION));
                }
                m39720();
                C10474 c10474 = this.f54242;
                if (c10474 != null) {
                    c10474.close();
                }
            } catch (C13048 e) {
                if (this.f54229) {
                    e.printStackTrace(System.err);
                }
                if (z) {
                    c20414.m46183("total", Long.toString(System.currentTimeMillis() - this.f54234));
                }
                m39730();
                if (!c20414.m46181()) {
                    m39721(m39731(), d.O);
                    m39721(c20414.f66179, "warn");
                    m39707(m39731(), c20414.f66178, "count.error.recompile");
                    m39707(c20414.f66179, c20414.f66171, "count.warn.recompile");
                }
                if (!c2092.m6633()) {
                    c2092.m6632(new C4209(EnumC13383.COMPILATION));
                }
                m39720();
                C10474 c10475 = this.f54242;
                if (c10475 != null) {
                    c10475.close();
                }
            }
        } catch (Throwable th) {
            if (z) {
                c20414.m46183("total", Long.toString(System.currentTimeMillis() - this.f54234));
            }
            m39730();
            if (!c20414.m46181()) {
                m39721(m39731(), d.O);
                m39721(c20414.f66179, "warn");
                m39707(m39731(), c20414.f66178, "count.error.recompile");
                m39707(c20414.f66179, c20414.f66171, "count.warn.recompile");
            }
            if (!c2092.m6633()) {
                c2092.m6632(new C4209(EnumC13383.COMPILATION));
            }
            m39720();
            C10474 c10476 = this.f54242;
            if (c10476 != null) {
                c10476.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21825 m39718(Set set, boolean z) {
        CharSequence charSequenceMo10164;
        if (!z && m39729(EnumC16079.PARSE)) {
            return C21825.m48588();
        }
        C19003 c19003 = new C19003();
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            InterfaceC2173 interfaceC2173 = (InterfaceC2173) it.next();
            if (!hashSet.contains(interfaceC2173)) {
                hashSet.add(interfaceC2173);
                C20414 c20414 = this.f54221;
                InterfaceC2173 interfaceC2173M48202 = c20414.m48202(interfaceC2173);
                try {
                    try {
                        this.f54228.add(interfaceC2173);
                        charSequenceMo10164 = interfaceC2173.mo10164(false);
                    } catch (IOException e) {
                        int i = C14315.f46886;
                        String localizedMessage = e.getLocalizedMessage();
                        if (localizedMessage == null && (localizedMessage = e.getMessage()) == null) {
                            localizedMessage = e.toString();
                        }
                        C5909 c5909 = C23879.f77204;
                        c20414.m48197(new C5909("compiler", "error.reading.file", interfaceC2173, localizedMessage));
                        charSequenceMo10164 = null;
                    }
                    C10164 c10164M39717 = m39717(interfaceC2173, charSequenceMo10164);
                    AbstractC6323 abstractC6323 = c10164M39717.f34724;
                    if (abstractC6323 != null) {
                        c20414.m46174(interfaceC2173, abstractC6323);
                    }
                    c20414.m48202(interfaceC2173M48202);
                    c19003.m43723(c10164M39717);
                } catch (Throwable th) {
                    c20414.m48202(interfaceC2173M48202);
                    throw th;
                }
            }
        }
        return c19003.m43726();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m39735() {
        return !m39729(EnumC16079.ATTR);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m39734(C21825 c21825) {
        this.f54197.m30631(c21825);
        if (c21825.isEmpty()) {
            this.f54219.m40873();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39727(C21825 c21825) {
        C2092 c2092 = this.f54211;
        if (!c2092.m6633()) {
            Iterator it = c21825.iterator();
            while (it.hasNext()) {
                c2092.m6634(new C4209(EnumC13383.ENTER, (C10164) it.next()));
            }
        }
        this.f54233.m24144((C22492) null, c21825);
        this.f54219.m40873();
        if (!c2092.m6633()) {
            Iterator it2 = c21825.iterator();
            while (it2.hasNext()) {
                c2092.m6632(new C4209(EnumC13383.ENTER, (C10164) it2.next()));
            }
        }
        if (this.f54206) {
            C19003 c19003 = new C19003();
            Iterator it3 = c21825.iterator();
            while (it3.hasNext()) {
                for (C21825 c21826 = ((C10164) it3.next()).f34727; c21826.m48595(); c21826 = c21826.f70877) {
                    Object obj = c21826.f70876;
                    if (obj instanceof C8753) {
                        c19003.m43723((C8753) obj);
                    }
                }
            }
            this.f54202 = c19003.m43726();
        }
        Iterator it4 = c21825.iterator();
        while (it4.hasNext()) {
            this.f54228.add(((C10164) it4.next()).f34725);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39722(Collection collection, Collection collection2) {
        EnumC19730 enumC19730 = EnumC19730.f63335;
        C14770 c14770 = this.f54214;
        if (c14770.m35402(enumC19730, "none")) {
            this.f54189 = false;
            return;
        }
        if (this.f54242 == null) {
            C10474 c10474M26540 = C10474.m26540(this.f54201);
            this.f54242 = c10474M26540;
            c10474M26540.m26573();
            boolean zM26569 = this.f54242.m26569();
            this.f54189 = zM26569;
            if (zM26569) {
                c14770.m35401("parameters", "parameters");
                this.f54195.f1953 = true;
                this.f54212 = true;
                this.f54235 = true;
                C2092 c2092 = this.f54211;
                if (!c2092.m6633()) {
                    c2092.m6634(new C4209(EnumC13383.ANNOTATION_PROCESSING));
                }
                this.f54222 = new C9126(this.f54221, null);
                this.f54242.m26574().m29644(collection, collection2);
                return;
            }
            this.f54242.close();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39728(C21825 c21825, Collection collection) {
        EnumC10477 enumC10477;
        EnumC10477 enumC10478;
        boolean zM39729 = m39729(EnumC16079.PROCESS);
        int i = 1;
        C20414 c20414 = this.f54221;
        if (zM39729 && this.f54189) {
            this.f54222.m23455(new C22285(i));
            c20414.m46175(this.f54222);
            return;
        }
        boolean z = this.f54189;
        C14770 c14770 = this.f54214;
        if (!z) {
            if (c14770.m35402(EnumC19730.f63335, "only")) {
                c20414.m48201(C9768.f32840);
                this.f54204.clear();
            }
            if (!collection.isEmpty()) {
                C5909 c5909 = C23879.f77204;
                c20414.m48197(new C5909("compiler", "proc.no.explicit.annotation.processing.requested", collection));
            }
            C6171.m17178(this.f54222);
            return;
        }
        C6171.m17171(this.f54222);
        try {
            C21825 c21825M48588 = C21825.m48588();
            C21825 c21825M48589 = C21825.m48588();
            if (!collection.isEmpty()) {
                if (!(this.f54207 || m39708(c14770))) {
                    C5909 c59010 = C23879.f77204;
                    c20414.m48197(new C5909("compiler", "proc.no.explicit.annotation.processing.requested", collection));
                    this.f54222.m23455(new C22285(i));
                    c20414.m46175(this.f54222);
                    return;
                }
                Iterator it = collection.iterator();
                boolean z2 = false;
                while (it.hasNext()) {
                    String str = (String) it.next();
                    AbstractC23903 abstractC23903M39719 = m39719(str);
                    if (abstractC23903M39719 == null || (((enumC10477 = abstractC23903M39719.f77452) == (enumC10478 = EnumC10477.f35867) && !this.f54218) || enumC10477 == EnumC10477.f35872)) {
                        if (abstractC23903M39719 != this.f54240) {
                            C5909 c59011 = C23879.f77204;
                            c20414.m48197(new C5909("compiler", "proc.cant.find.class", str));
                        }
                        z2 = true;
                    } else {
                        if (enumC10477 == enumC10478) {
                            try {
                                abstractC23903M39719.mo49994();
                            } catch (C4146 unused) {
                                C5909 c59012 = C23879.f77204;
                                c20414.m48197(new C5909("compiler", "proc.cant.find.class", str));
                                z2 = true;
                            }
                        }
                        if (!abstractC23903M39719.mo20273()) {
                            C6171.m17176(abstractC23903M39719.f77452 == enumC10478);
                            C14065 c14065 = C9768.f32836;
                            c20414.m48201(new C14065("compiler", "proc.package.does.not.exist", str));
                            c21825M48589 = c21825M48589.m48597((C7675) abstractC23903M39719);
                        } else if (abstractC23903M39719.f77452 == enumC10478) {
                            c21825M48589 = c21825M48589.m48597((C7675) abstractC23903M39719);
                        } else {
                            c21825M48588 = c21825M48588.m48597((C22492) abstractC23903M39719);
                        }
                    }
                }
                if (z2) {
                    this.f54222.m23455(new C22285(i));
                    c20414.m46175(this.f54222);
                    return;
                }
            }
            try {
                this.f54242.m26568(c21825, c21825M48588, c21825M48589, this.f54222);
                this.f54213 = true;
            } finally {
                this.f54242.close();
            }
        } catch (C4146 e) {
            AbstractC23903 abstractC23903 = e.f15170;
            C11948 c11948M11788 = e.m11788();
            C5909 c59013 = C23879.f77204;
            c20414.m48197(new C5909("compiler", "cant.access", abstractC23903, c11948M11788));
            C9126 c9126 = this.f54222;
            if (c9126 != null) {
                c9126.m23455(new C22285(i));
                c20414.m46175(this.f54222);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m39708(C14770 c14770) {
        if (c14770.m35408(EnumC19730.f63346) || c14770.m35408(EnumC19730.f63376) || c14770.m35408(EnumC19730.f63403)) {
            return true;
        }
        EnumC19730 enumC19730 = EnumC19730.f63335;
        return c14770.m35402(enumC19730, "only") || c14770.m35402(enumC19730, "full") || c14770.m35408(EnumC19730.f63324) || c14770.m35408(EnumC19730.f63402);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39725(C9126 c9126) {
        this.f54222 = c9126;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4603 m39716(C4603 c4603) {
        EnumC16079 enumC16079 = EnumC16079.ATTR;
        C20312 c20312 = this.f54217;
        if (c20312.m45853(c4603, enumC16079)) {
            return c4603;
        }
        boolean z = this.f54187;
        C20414 c20414 = this.f54221;
        if (z) {
            c20414.m46177(EnumC16181.NOTICE, "[attribute " + c4603.f16301.f30086 + "]");
        }
        if (this.f54236) {
            c20414.m46183("checking.attribution", c4603.f16301.f30086);
        }
        C2092 c2092 = this.f54211;
        if (!c2092.m6633()) {
            c2092.m6634(new C4209(EnumC13383.ANALYZE, c4603.f16295, c4603.f16301.f30086));
        }
        InterfaceC2173 interfaceC2173 = c4603.f16301.f30086.f73415;
        if (interfaceC2173 == null) {
            interfaceC2173 = c4603.f16295.f34725;
        }
        InterfaceC2173 interfaceC2173M48202 = c20414.m48202(interfaceC2173);
        try {
            this.f54191.m18313(c4603);
            if (m39731() > 0 && !m39729(enumC16079)) {
                this.f54191.m18328(c4603.f16296);
            }
            c20312.put(c4603, enumC16079);
            return c4603;
        } finally {
            c20414.m48202(interfaceC2173M48202);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39724(C4603 c4603, C19003 c19003) {
        C4209 c4209;
        C2092 c2092 = this.f54211;
        EnumC16079 enumC16079 = EnumC16079.FLOW;
        C20312 c20312 = this.f54217;
        if (c20312.m45853(c4603, enumC16079)) {
            c19003.m43723(c4603);
            return;
        }
        try {
            if (!m39729(enumC16079)) {
                boolean z = this.f54187;
                C20414 c20414 = this.f54221;
                if (z) {
                    c20414.m46177(EnumC16181.NOTICE, "[flow " + c4603.f16301.f30086 + "]");
                }
                InterfaceC2173 interfaceC2173 = c4603.f16301.f30086.f73415;
                if (interfaceC2173 == null) {
                    interfaceC2173 = c4603.f16295.f34725;
                }
                InterfaceC2173 interfaceC2173M48202 = c20414.m48202(interfaceC2173);
                try {
                    C5286 c5286 = this.f54209;
                    c5286.f18294 = 0;
                    this.f54237.m27508(c4603, c5286.m14592(c4603.f16295));
                    c20312.put(c4603, enumC16079);
                    if (m39729(enumC16079)) {
                        c20414.m48202(interfaceC2173M48202);
                        if (c2092.m6633()) {
                            return;
                        } else {
                            c4209 = new C4209(EnumC13383.ANALYZE, c4603.f16295, c4603.f16301.f30086);
                        }
                    } else {
                        this.f54196.m42469(c4603);
                        c19003.m43723(c4603);
                        c20414.m48202(interfaceC2173M48202);
                        if (c2092.m6633()) {
                            return;
                        } else {
                            c4209 = new C4209(EnumC13383.ANALYZE, c4603.f16295, c4603.f16301.f30086);
                        }
                    }
                } catch (Throwable th) {
                    c20414.m48202(interfaceC2173M48202);
                    throw th;
                }
            } else if (c2092.m6633()) {
                return;
            } else {
                c4209 = new C4209(EnumC13383.ANALYZE, c4603.f16295, c4603.f16301.f30086);
            }
            c2092.m6632(c4209);
        } catch (Throwable th2) {
            if (!c2092.m6633()) {
                c2092.m6632(new C4209(EnumC13383.ANALYZE, c4603.f16295, c4603.f16301.f30086));
            }
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x015b  */
    /* JADX WARN: Code duplicated, block: B:64:0x015d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x015f A[Catch: all -> 0x01d0, TryCatch #0 {all -> 0x01d0, blocks: (B:41:0x00da, B:44:0x00f3, B:47:0x00ff, B:50:0x0107, B:53:0x011e, B:55:0x0136, B:57:0x013a, B:60:0x0144, B:61:0x0153, B:65:0x015f, B:67:0x0167, B:69:0x0171, B:70:0x0176, B:71:0x017a, B:74:0x018c, B:76:0x0192, B:78:0x01a3, B:81:0x01ac, B:83:0x01b8), top: B:94:0x00da }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0167 A[Catch: all -> 0x01d0, TryCatch #0 {all -> 0x01d0, blocks: (B:41:0x00da, B:44:0x00f3, B:47:0x00ff, B:50:0x0107, B:53:0x011e, B:55:0x0136, B:57:0x013a, B:60:0x0144, B:61:0x0153, B:65:0x015f, B:67:0x0167, B:69:0x0171, B:70:0x0176, B:71:0x017a, B:74:0x018c, B:76:0x0192, B:78:0x01a3, B:81:0x01ac, B:83:0x01b8), top: B:94:0x00da }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0171 A[Catch: all -> 0x01d0, TryCatch #0 {all -> 0x01d0, blocks: (B:41:0x00da, B:44:0x00f3, B:47:0x00ff, B:50:0x0107, B:53:0x011e, B:55:0x0136, B:57:0x013a, B:60:0x0144, B:61:0x0153, B:65:0x015f, B:67:0x0167, B:69:0x0171, B:70:0x0176, B:71:0x017a, B:74:0x018c, B:76:0x0192, B:78:0x01a3, B:81:0x01ac, B:83:0x01b8), top: B:94:0x00da }] */
    /* JADX WARN: Code duplicated, block: B:71:0x017a A[Catch: all -> 0x01d0, TryCatch #0 {all -> 0x01d0, blocks: (B:41:0x00da, B:44:0x00f3, B:47:0x00ff, B:50:0x0107, B:53:0x011e, B:55:0x0136, B:57:0x013a, B:60:0x0144, B:61:0x0153, B:65:0x015f, B:67:0x0167, B:69:0x0171, B:70:0x0176, B:71:0x017a, B:74:0x018c, B:76:0x0192, B:78:0x01a3, B:81:0x01ac, B:83:0x01b8), top: B:94:0x00da }] */
    /* JADX WARN: Code duplicated, block: B:73:0x018b  */
    /* JADX WARN: Code duplicated, block: B:74:0x018c A[Catch: all -> 0x01d0, LOOP:2: B:74:0x018c->B:76:0x0192, LOOP_START, PHI: r3
      0x018c: PHI (r3v16 l.᩸᩷۟) = (r3v15 l.᩸᩷۟), (r3v17 l.᩸᩷۟) binds: [B:72:0x0189, B:76:0x0192] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x01d0, blocks: (B:41:0x00da, B:44:0x00f3, B:47:0x00ff, B:50:0x0107, B:53:0x011e, B:55:0x0136, B:57:0x013a, B:60:0x0144, B:61:0x0153, B:65:0x015f, B:67:0x0167, B:69:0x0171, B:70:0x0176, B:71:0x017a, B:74:0x018c, B:76:0x0192, B:78:0x01a3, B:81:0x01ac, B:83:0x01b8), top: B:94:0x00da }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0192 A[Catch: all -> 0x01d0, LOOP:2: B:74:0x018c->B:76:0x0192, LOOP_END, TryCatch #0 {all -> 0x01d0, blocks: (B:41:0x00da, B:44:0x00f3, B:47:0x00ff, B:50:0x0107, B:53:0x011e, B:55:0x0136, B:57:0x013a, B:60:0x0144, B:61:0x0153, B:65:0x015f, B:67:0x0167, B:69:0x0171, B:70:0x0176, B:71:0x017a, B:74:0x018c, B:76:0x0192, B:78:0x01a3, B:81:0x01ac, B:83:0x01b8), top: B:94:0x00da }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Queue m39714(Queue queue) {
        C2068 c2068;
        EnumC16079 enumC16079;
        C21825 c21825M5271;
        C8753 c8753;
        C19003 c19003 = new C19003();
        Iterator it = queue.iterator();
        while (it.hasNext()) {
            C4603 c4603 = (C4603) it.next();
            C12343 c12343 = this.f54201;
            if (!m39729(EnumC16079.TRANSTYPES)) {
                if (this.f54215 == EnumC0720.NONE) {
                    if (!this.f54228.contains(c4603.f16295.f34725)) {
                        continue;
                    }
                }
                C12325 c12325 = this.f54197;
                if (c12325.f41203 || c4603.f16295.f34730 == c12325.m30637()) {
                    EnumC16079 enumC160710 = EnumC16079.LOWER;
                    C20312 c20312 = this.f54217;
                    boolean zM45853 = c20312.m45853(c4603, enumC160710);
                    HashMap map = this.f54239;
                    if (zM45853) {
                        c19003.addAll((Collection) map.get(c4603));
                    } else {
                        C16244 c16244 = new C16244(this, c4603);
                        c16244.mo7248(c4603.f16296);
                        for (C4603 c4604 : c16244.f52388) {
                            EnumC16079 enumC160711 = EnumC16079.FLOW;
                            if (!c20312.m45853(c4604, enumC160711)) {
                                C4603 c4603M39716 = m39716(c4604);
                                C19003 c19004 = new C19003();
                                m39724(c4603M39716, c19004);
                                if (m39729(enumC160711)) {
                                    c19004 = new C19003();
                                }
                                map.put(c4604, m39714(c19004));
                            }
                        }
                        EnumC16079 enumC160712 = EnumC16079.TRANSTYPES;
                        if (m39729(enumC160712)) {
                            continue;
                        } else {
                            boolean z = this.f54187;
                            C20414 c20414 = this.f54221;
                            if (z) {
                                c20414.m46177(EnumC16181.NOTICE, "[desugar " + c4603.f16301.f30086 + "]");
                            }
                            InterfaceC2173 interfaceC2173 = c4603.f16301.f30086.f73415;
                            if (interfaceC2173 == null) {
                                interfaceC2173 = c4603.f16295.f34725;
                            }
                            InterfaceC2173 interfaceC2173M48202 = c20414.m48202(interfaceC2173);
                            try {
                                AbstractC8774 abstractC8774 = c4603.f16296;
                                C5286 c5286 = this.f54209;
                                c5286.f18294 = 0;
                                C5286 c5286M14592 = c5286.m14592(c4603.f16295);
                                boolean zM22847 = c4603.f16296.m22847(EnumC18651.f60503);
                                boolean z2 = this.f54206;
                                if (zM22847 || c4603.f16296.m22847(EnumC18651.f60488)) {
                                    if (!z2 && !m39729(EnumC16079.LOWER)) {
                                        C21825 c21825M5272 = this.f54190.m5271(c4603, c4603.f16296, c5286M14592);
                                        if (c21825M5272.f70876 != null) {
                                            C6171.m17176(c21825M5272.f70877.isEmpty());
                                            c2068 = new C2068(c4603, (C8753) c21825M5272.f70876);
                                            c19003.m43723(c2068);
                                        }
                                    }
                                } else if (!m39729(enumC160712)) {
                                    c4603.f16296 = this.f54238.m33047(c4603.f16296, c5286M14592);
                                    c20312.put(c4603, enumC160712);
                                    EnumC16079 enumC160713 = EnumC16079.TRANSPATTERNS;
                                    if (!m39729(enumC160713)) {
                                        C4352 c4352M12187 = C4352.m12187(c12343);
                                        AbstractC8774 abstractC8775 = c4603.f16296;
                                        c4352M12187.m12194(c4603, abstractC8775, c5286M14592);
                                        c4603.f16296 = abstractC8775;
                                        c20312.put(c4603, enumC160713);
                                        if (EnumC14026.f46098.m33945(this.f54230) && c16244.f52390) {
                                            EnumC16079 enumC160714 = EnumC16079.UNLAMBDA;
                                            if (!m39729(enumC160714)) {
                                                c4603.f16296 = C22680.m50219(c12343).m50237(c4603, c4603.f16296, c5286M14592);
                                                c20312.put(c4603, enumC160714);
                                                enumC16079 = EnumC16079.LOWER;
                                                if (!m39729(enumC16079)) {
                                                    if (z2) {
                                                        c8753 = (C8753) c4603.f16296;
                                                        if (abstractC8774 instanceof C8753) {
                                                            if (this.f54202.contains((C8753) abstractC8774)) {
                                                                c2068 = new C2068(c4603, c8753);
                                                                c19003.m43723(c2068);
                                                            }
                                                        }
                                                    } else {
                                                        c20312.put(c4603, enumC16079);
                                                        if (m39729(enumC16079)) {
                                                            for (c21825M5271 = this.f54190.m5271(c4603, c4603.f16296, c5286M14592); c21825M5271.m48595(); c21825M5271 = c21825M5271.f70877) {
                                                                c19003.m43723(new C2068(c4603, (C8753) c21825M5271.f70876));
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            enumC16079 = EnumC16079.LOWER;
                                            if (!m39729(enumC16079)) {
                                                if (z2) {
                                                    c8753 = (C8753) c4603.f16296;
                                                    if (abstractC8774 instanceof C8753) {
                                                        if (this.f54202.contains((C8753) abstractC8774)) {
                                                            c2068 = new C2068(c4603, c8753);
                                                            c19003.m43723(c2068);
                                                        }
                                                    }
                                                } else {
                                                    c20312.put(c4603, enumC16079);
                                                    if (m39729(enumC16079)) {
                                                        while (c21825M5271.m48595()) {
                                                            c19003.m43723(new C2068(c4603, (C8753) c21825M5271.f70876));
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                c20414.m48202(interfaceC2173M48202);
                            } catch (Throwable th) {
                                c20414.m48202(interfaceC2173M48202);
                                throw th;
                            }
                        }
                    }
                }
            }
        }
        return m39729(EnumC16079.FLOW) ? new C19003() : c19003;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m39733(Queue queue) {
        C22822 c22822 = this.f54200;
        if (m39729(EnumC16079.GENERATE)) {
            return;
        }
        Iterator it = queue.iterator();
        while (it.hasNext()) {
            C2068 c2068 = (C2068) it.next();
            C4603 c4603 = (C4603) c2068.f7664;
            C8753 c8753 = (C8753) c2068.f7665;
            boolean z = this.f54187;
            boolean z2 = this.f54206;
            C20414 c20414 = this.f54221;
            if (z) {
                StringBuilder sb = new StringBuilder("[generate ");
                sb.append(z2 ? " source" : "code");
                sb.append(" ");
                sb.append(c8753.f30086);
                sb.append("]");
                c20414.m46177(EnumC16181.NOTICE, sb.toString());
            }
            C2092 c2092 = this.f54211;
            if (!c2092.m6633()) {
                c2092.m6634(new C4209(EnumC13383.GENERATE, c4603.f16295, c8753.f30086));
            }
            InterfaceC2173 interfaceC2173 = c4603.f16301.f30086.f73415;
            if (interfaceC2173 == null) {
                interfaceC2173 = c4603.f16295.f34725;
            }
            InterfaceC2173 interfaceC2173M48202 = c20414.m48202(interfaceC2173);
            if (z2) {
                try {
                    try {
                        m39732(c4603, c8753);
                    } catch (IOException e) {
                        c8753.getClass();
                        C22492 c22492 = c8753.f30086;
                        String message = e.getMessage();
                        C5909 c5909 = C23879.f77204;
                        c20414.m48199(c8753, new C5909("compiler", "class.cant.write", c22492, message));
                        c20414.m48202(interfaceC2173M48202);
                        return;
                    }
                } catch (Throwable th) {
                    c20414.m48202(interfaceC2173M48202);
                    throw th;
                }
            } else {
                if (this.f54210.mo32953(EnumC3584.NATIVE_HEADER_OUTPUT) && c22822.m50519(c8753.f30086)) {
                    c22822.m50520(c8753.f30086);
                }
                m39715(c4603, c8753);
            }
            c20414.m48202(interfaceC2173M48202);
            if (!c2092.m6633()) {
                c2092.m6632(new C4209(EnumC13383.GENERATE, c4603.f16295, c8753.f30086));
            }
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m39730() {
        int iM39731 = m39731();
        C20414 c20414 = this.f54221;
        if (iM39731 == 0 && this.f54213 && this.f54226 && this.f54215 == EnumC0720.UNSET) {
            if (this.f54207 || m39708(this.f54214)) {
                c20414.m48201(C9768.f32850);
            } else {
                c20414.m48201(C9768.f32841);
            }
        }
        this.f54198.m47342();
        this.f54199.m6475();
        if (c20414.f66182) {
            c20414.m48196((InterfaceC2173) null, C2005.f7500);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static AbstractC11242 m39711(C16949 c16949, InterfaceC2173 interfaceC2173) {
        return c16949.m39704(interfaceC2173, new C7777(0));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC11242 m39705(C16949 c16949, InterfaceC2173 interfaceC2173) {
        return c16949.m39704(interfaceC2173, new C21745(10));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC11242 m39704(InterfaceC2173 interfaceC2173, Function function) {
        C20414 c20414 = this.f54221;
        C7714 c7714 = new C7714(c20414);
        InterfaceC2173 interfaceC2173M48202 = c20414.m48202(interfaceC2173);
        try {
            return (AbstractC11242) function.apply(m39717(interfaceC2173, interfaceC2173.mo10164(false)));
        } catch (IOException unused) {
            return null;
        } finally {
            c20414.m46175(c7714);
            c20414.m48202(interfaceC2173M48202);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39720() {
        C23549 c23549 = this.f54231;
        C0969 c0969 = null;
        this.f54202 = null;
        this.f54203 = null;
        this.f54195 = null;
        this.f54209 = null;
        this.f54216 = null;
        this.f54233 = null;
        C16617 c16617 = this.f54204;
        if (c16617 != null) {
            c16617.clear();
        }
        this.f54204 = null;
        this.f54192 = null;
        this.f54208 = null;
        this.f54230 = null;
        this.f54191 = null;
        this.f54198 = null;
        this.f54224 = null;
        this.f54237 = null;
        this.f54238 = null;
        this.f54190 = null;
        this.f54219 = null;
        this.f54225 = null;
        this.f54221.m46182();
        try {
            try {
                this.f54210.flush();
                C23942 c23942 = this.f54220;
                if (c23942 != null) {
                    c23942.f77631.mo17391();
                }
                this.f54220 = null;
                Iterator it = this.f54241.iterator();
                while (it.hasNext()) {
                    try {
                        ((Closeable) it.next()).close();
                    } catch (IOException e) {
                        if (c0969 == null) {
                            c0969 = new C0969(c23549.m51910(C14707.f48100).toString(), e);
                        } else {
                            c0969.addSuppressed(e);
                        }
                    }
                }
                if (c0969 != null) {
                    throw c0969;
                }
                this.f54241 = C21825.m48588();
            } catch (IOException e2) {
                throw new C13048(e2);
            }
        } catch (Throwable th) {
            C23942 c23943 = this.f54220;
            if (c23943 != null) {
                c23943.f77631.mo17391();
            }
            this.f54220 = null;
            Iterator it2 = this.f54241.iterator();
            while (it2.hasNext()) {
                try {
                    ((Closeable) it2.next()).close();
                } catch (IOException e3) {
                    if (c0969 == null) {
                        c0969 = new C0969(c23549.m51910(C14707.f48100).toString(), e3);
                    } else {
                        c0969.addSuppressed(e3);
                    }
                }
            }
            if (c0969 != null) {
                throw c0969;
            }
            this.f54241 = C21825.m48588();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39721(int i, String str) {
        if (i != 0) {
            String strConcat = i == 1 ? "count.".concat(str) : C16523.m38890("count.", str, ".plural");
            EnumC16181 enumC16181 = EnumC16181.ERROR;
            Object[] objArr = {String.valueOf(i)};
            C20414 c20414 = this.f54221;
            C20414.m46162(c20414.m46169(enumC16181), c20414.m46171(EnumC21119.COMPILER_MISC, strConcat, objArr));
            c20414.m46169(enumC16181).flush();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m39707(int i, int i2, String str) {
        if (i2 > 0) {
            EnumC16181 enumC16181 = EnumC16181.ERROR;
            Object[] objArr = {String.valueOf(i), String.valueOf(i2 + i)};
            C20414 c20414 = this.f54221;
            C20414.m46162(c20414.m46169(enumC16181), c20414.m46171(EnumC21119.COMPILER_MISC, str, objArr));
            c20414.m46169(enumC16181).flush();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10164 m39717(InterfaceC2173 interfaceC2173, CharSequence charSequence) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C10164 c10164M14579 = this.f54209.m14579(C21825.m48588());
        C2092 c2092 = this.f54211;
        if (charSequence != null) {
            C20414 c20414 = this.f54221;
            boolean z = this.f54236;
            if (z) {
                c20414.m46183("parsing.started", interfaceC2173);
            }
            if (!c2092.m6633()) {
                c2092.m6634(new C4209(EnumC13383.PARSE, interfaceC2173));
                this.f54212 = true;
                this.f54235 = true;
            }
            c10164M14579 = this.f54192.m36826(charSequence, this.f54212 || this.f54206, this.f54235, this.f54245, interfaceC2173.mo6761("module-info", EnumC11347.SOURCE)).m49922();
            if (z) {
                c20414.m46183("parsing.done", Long.toString(System.currentTimeMillis() - jCurrentTimeMillis));
            }
        }
        c10164M14579.f34725 = interfaceC2173;
        if (charSequence != null && !c2092.m6633()) {
            c2092.m6632(new C4209(EnumC13383.PARSE, c10164M14579));
        }
        return c10164M14579;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m39713() {
        this.f54228.clear();
        this.f54204.clear();
    }
}
