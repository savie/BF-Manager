package l;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩶᩷۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 93Z4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20414 extends AbstractC21514 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final C16576 f66162 = new C16576();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C16576 f66163 = new C16576();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C16576 f66164 = new C16576();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public InterfaceC17615 f66165;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f66166;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public AbstractC10537 f66167;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f66168;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f66169;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public HashSet f66170;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f66171;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f66172;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public HashSet f66173;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public InterfaceC9810 f66174;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public HashSet f66175;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final EnumMap f66176;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f66177;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f66178;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f66179;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f66180;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C22531 f66181;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f66182;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f66183;

    public C20414() {
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20414 m46161(C12343 c12343) {
        C20414 c20414 = (C20414) c12343.m30656(f66162);
        return c20414 == null ? new C20414(c12343) : c20414;
    }

    public C20414(C12343 c12343) {
        EnumMap enumMapM46159;
        PrintWriter printWriter = (PrintWriter) c12343.m30656(f66163);
        PrintWriter printWriter2 = (PrintWriter) c12343.m30656(f66164);
        if (printWriter == null && printWriter2 == null) {
            enumMapM46159 = m46159(new PrintWriter((OutputStream) System.out, true), new PrintWriter((OutputStream) System.err, true));
        } else if (printWriter == null || printWriter2 == null) {
            printWriter = printWriter == null ? printWriter2 : printWriter;
            enumMapM46159 = m46159(printWriter, printWriter);
        } else {
            enumMapM46159 = m46159(printWriter, printWriter2);
        }
        this.f69896 = C23549.m51906(c12343);
        this.f69897 = new HashMap();
        this.f66177 = 0;
        this.f66179 = 0;
        this.f66178 = 0;
        this.f66171 = 0;
        this.f66173 = new HashSet();
        this.f66170 = new HashSet();
        c12343.m30659(f66162, this);
        this.f66176 = enumMapM46159;
        this.f66174 = (InterfaceC9810) c12343.m30655(InterfaceC9810.class);
        this.f66167 = new C19709(this);
        C22531 c22531M50048 = C22531.m50048(c12343);
        this.f66181 = c22531M50048;
        c22531M50048.m50055("com.sun.tools.javac.resources.javac");
        C14770 c14770M35395 = C14770.m35395(c12343);
        m46163(c14770M35395);
        c14770M35395.m35400(new RunnableC7979(5, this, c14770M35395));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumMap m46159(PrintWriter printWriter, PrintWriter printWriter2) {
        EnumMap enumMap = new EnumMap(EnumC16181.class);
        enumMap.put(EnumC16181.ERROR, printWriter2);
        enumMap.put(EnumC16181.WARNING, printWriter2);
        enumMap.put(EnumC16181.NOTICE, printWriter2);
        enumMap.put(EnumC16181.STDOUT, printWriter);
        enumMap.put(EnumC16181.STDERR, printWriter2);
        return enumMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m46163(C14770 c14770) {
        int i;
        InterfaceC17615 c8815;
        this.f66169 = c14770.m35408(EnumC19730.f63349);
        this.f66172 = c14770.m35408(EnumC19730.f63385);
        this.f66183 = c14770.m35409(EnumC19730.f63399, "none");
        this.f66180 = c14770.m35407("suppressNotes");
        String strM35398 = c14770.m35398(EnumC19730.f63322);
        int i2 = Integer.MAX_VALUE;
        if (strM35398 != null) {
            try {
                i = Integer.parseInt(strM35398);
                if (i <= 0) {
                    i = Integer.MAX_VALUE;
                }
            } catch (NumberFormatException unused) {
                i = 100;
            }
        } else {
            i = 100;
        }
        this.f66166 = i;
        String strM35399 = c14770.m35398(EnumC19730.f63366);
        if (strM35399 != null) {
            try {
                int i3 = Integer.parseInt(strM35399);
                if (i3 > 0) {
                    i2 = i3;
                }
            } catch (NumberFormatException unused2) {
                i2 = 100;
            }
        } else {
            i2 = 100;
        }
        this.f66168 = i2;
        if (c14770.m35407("rawDiagnostics")) {
            c8815 = new C5451(c14770);
        } else {
            c8815 = new C8815(c14770, this.f66181);
        }
        this.f66165 = c8815;
        String strM35397 = c14770.m35397("expectKeys");
        if (strM35397 != null) {
            this.f66175 = new HashSet(Arrays.asList(strM35397.split(", *")));
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m46181() {
        return this.f66174 != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46174(InterfaceC2173 interfaceC2173, InterfaceC4518 interfaceC4518) {
        C6171.m17171(interfaceC2173);
        C22137 c22137M48187 = m48187(interfaceC2173);
        InterfaceC4518 interfaceC4519 = c22137M48187.f71660;
        if (interfaceC4519 != null && interfaceC4519 != interfaceC4518) {
            throw new IllegalStateException("endPosTable already set");
        }
        c22137M48187.f71660 = interfaceC4518;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2173 m46184() {
        C22137 c22137 = this.f69898;
        if (c22137 == null) {
            return null;
        }
        return c22137.f71657;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17615 m46168() {
        return this.f66165;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46178(C21679 c21679) {
        this.f66165 = c21679;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final PrintWriter m46169(EnumC16181 enumC16181) {
        return (PrintWriter) this.f66176.get(enumC16181);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46172(PrintWriter printWriter) {
        for (EnumC16181 enumC16181 : EnumC16181.values()) {
            this.f66176.put(enumC16181, printWriter);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46175(AbstractC10537 abstractC10537) {
        C6171.m17176(this.f66167 == abstractC10537);
        this.f66167 = abstractC10537.f36079;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m46182() {
        Iterator it = this.f66176.values().iterator();
        while (it.hasNext()) {
            ((PrintWriter) it.next()).flush();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m46167(C20414 c20414, C11948 c11948) {
        HashSet hashSet = c20414.f66170;
        InterfaceC2173 interfaceC2173M29762 = c11948.m29762();
        if (interfaceC2173M29762 == null) {
            return true;
        }
        int iM29755 = c11948.m29755();
        HashSet hashSet2 = c20414.f66173;
        C2068 c2068 = new C2068(interfaceC2173M29762, Integer.valueOf(iM29755));
        boolean zContains = hashSet2.contains(c2068);
        if (!zContains) {
            hashSet2.add(c2068);
        }
        if (zContains) {
            return false;
        }
        if (!c11948.m29760(EnumC0264.SOURCE_LEVEL)) {
            return true;
        }
        C19003 c19003 = new C19003();
        m46164(c19003, c11948);
        C2068 c2069 = new C2068(interfaceC2173M29762, c19003.m43726());
        boolean zContains2 = hashSet.contains(c2069);
        boolean z = !zContains2;
        if (!zContains2) {
            hashSet.add(c2069);
        }
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46164(C19003 c19003, C11948 c11948) {
        c19003.m43723(c11948.mo29765());
        for (Object obj : c11948.m29763()) {
            if (obj instanceof C11948) {
                m46164(c19003, (C11948) obj);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m46180(AbstractC8774 abstractC8774) {
        C22137 c22137 = this.f69898;
        InterfaceC2173 interfaceC2173 = c22137 != null ? c22137.f71657 : null;
        if (interfaceC2173 != null) {
            return this.f66173.contains(new C2068(interfaceC2173, Integer.valueOf(abstractC8774.f30189)));
        }
        return false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m46185(String str, Object... objArr) {
        m46162((PrintWriter) this.f66176.get(EnumC16181.NOTICE), m46171(EnumC21119.COMPILER_MISC, str, objArr));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m46187(AbstractC16493 abstractC16493) {
        m46162((PrintWriter) this.f66176.get(EnumC16181.NOTICE), this.f66181.m50052(abstractC16493));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m46188(EnumC21119 enumC21119, String str, Object... objArr) {
        m46162((PrintWriter) this.f66176.get(EnumC16181.NOTICE), m46171(enumC21119, str, objArr));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46173(String str) {
        m46162((PrintWriter) this.f66176.get(EnumC16181.NOTICE), str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46177(EnumC16181 enumC16181, String str) {
        m46162(m46169(enumC16181), str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46162(PrintWriter printWriter, String str) {
        while (true) {
            int iIndexOf = str.indexOf(10);
            if (iIndexOf == -1) {
                break;
            }
            printWriter.println(str.substring(0, iIndexOf));
            str = str.substring(iIndexOf + 1);
        }
        if (str.length() != 0) {
            printWriter.println(str);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m46183(String str, Object... objArr) {
        m46162((PrintWriter) this.f66176.get(EnumC16181.NOTICE), m46171(EnumC21119.COMPILER_MISC, "verbose.".concat(str), objArr));
    }

    @Override // l.AbstractC21514
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo46179(Object... objArr) {
        PrintWriter printWriter = (PrintWriter) this.f66176.get(EnumC16181.ERROR);
        m46162(printWriter, m46171(EnumC21119.COMPILER_MISC, "source.unavailable", objArr));
        printWriter.flush();
    }

    @Override // l.AbstractC21514
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo46176(C11948 c11948) {
        this.f66167.mo20357(c11948);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m46186(C11948 c11948) {
        PrintWriter printWriter;
        int i;
        InterfaceC9810 interfaceC9810 = this.f66174;
        if (interfaceC9810 != null) {
            interfaceC9810.mo6550(c11948);
            return;
        }
        EnumC17198 enumC17198M29767 = c11948.m29767();
        int[] iArr = C8420.f29187;
        int i2 = iArr[enumC17198M29767.ordinal()];
        if (i2 != 1) {
            EnumMap enumMap = this.f66176;
            if (i2 == 2) {
                printWriter = (PrintWriter) enumMap.get(EnumC16181.NOTICE);
            } else if (i2 == 3) {
                printWriter = (PrintWriter) enumMap.get(EnumC16181.WARNING);
            } else if (i2 == 4) {
                printWriter = (PrintWriter) enumMap.get(EnumC16181.ERROR);
            } else {
                throw new Error();
            }
            m46162(printWriter, this.f66165.mo36374(c11948, this.f66181.m50053()));
            if (this.f66172 && (((i = iArr[c11948.m29767().ordinal()]) == 3 || i == 4) && this.f66172)) {
                System.err.println(m46171(EnumC21119.COMPILER_MISC, "resume.abort", new Object[0]));
                while (true) {
                    try {
                        int i3 = System.in.read();
                        if (i3 != 65) {
                            if (i3 == 82) {
                                break;
                            }
                            if (i3 != 88) {
                                if (i3 != 97) {
                                    if (i3 == 114) {
                                        break;
                                    } else if (i3 != 120) {
                                    }
                                }
                            }
                            throw new AssertionError("user abort");
                        }
                        System.exit(-1);
                        break;
                    } catch (IOException unused) {
                    }
                }
            }
            if (this.f66169) {
                new RuntimeException().printStackTrace(printWriter);
            }
            printWriter.flush();
            return;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static String m46158(String str, Object... objArr) {
        return C22531.m50049(EnumC21119.COMPILER_MISC.m47547(str), objArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m46170(AbstractC16493 abstractC16493) {
        return this.f66181.m50052(abstractC16493);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m46171(EnumC21119 enumC21119, String str, Object... objArr) {
        return this.f66181.m50050(enumC21119.m47547(str), objArr);
    }
}
