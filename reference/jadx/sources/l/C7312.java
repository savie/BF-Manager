package l;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۜᩳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 93Z4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7312 extends AbstractC14222 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC1346 f24069;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f24070;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f24071;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public InterfaceC1807 f24072;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public HashSet f24073;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f24074;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f24075;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public InterfaceC20162 f24076;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final EnumMap f24077;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f24078;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f24079;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public HashSet f24080;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C23721 f24081;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f24082;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f24083;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f24084;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f24085;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public HashSet f24086;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f24087;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C13477 f24067 = new C13477();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final C13477 f24066 = new C13477();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C13477 f24068 = new C13477();

    public C7312() {
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7312 m20023(C4747 c4747) {
        C7312 c7312 = (C7312) c4747.m14643(f24067);
        return c7312 == null ? new C7312(c4747) : c7312;
    }

    public C7312(C4747 c4747) {
        EnumMap enumMapM20021;
        PrintWriter printWriter = (PrintWriter) c4747.m14643(f24066);
        PrintWriter printWriter2 = (PrintWriter) c4747.m14643(f24068);
        if (printWriter == null && printWriter2 == null) {
            enumMapM20021 = m20021(new PrintWriter((OutputStream) System.out, true), new PrintWriter((OutputStream) System.err, true));
        } else if (printWriter == null || printWriter2 == null) {
            printWriter = printWriter == null ? printWriter2 : printWriter;
            enumMapM20021 = m20021(printWriter, printWriter);
        } else {
            enumMapM20021 = m20021(printWriter, printWriter2);
        }
        this.f44939 = C19991.m45972(c4747);
        this.f44940 = new HashMap();
        this.f24079 = 0;
        this.f24083 = 0;
        this.f24085 = 0;
        this.f24070 = 0;
        this.f24073 = new HashSet();
        this.f24086 = new HashSet();
        c4747.m14646(f24067, this);
        this.f24077 = enumMapM20021;
        this.f24072 = (InterfaceC1807) c4747.m14642(InterfaceC1807.class);
        this.f24069 = new C19245(this);
        C23721 c23721M52973 = C23721.m52973(c4747);
        this.f24081 = c23721M52973;
        c23721M52973.m52980("com.sun.tools.javac.resources.javac");
        final C13015 c13015M32421 = C13015.m32421(c4747);
        m20027(c13015M32421);
        c13015M32421.m32425(new Runnable() { // from class: l.֡ᩳۘ
            @Override // java.lang.Runnable
            public final void run() {
                this.f2394.m20027(c13015M32421);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumMap m20021(PrintWriter printWriter, PrintWriter printWriter2) {
        EnumMap enumMap = new EnumMap(EnumC8803.class);
        enumMap.put(EnumC8803.ERROR, printWriter2);
        enumMap.put(EnumC8803.WARNING, printWriter2);
        enumMap.put(EnumC8803.NOTICE, printWriter2);
        enumMap.put(EnumC8803.STDOUT, printWriter);
        enumMap.put(EnumC8803.STDERR, printWriter2);
        return enumMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m20027(C13015 c13015) {
        int i;
        InterfaceC20162 c18698;
        this.f24074 = c13015.m32433(EnumC7687.f25288);
        this.f24075 = c13015.m32433(EnumC7687.f25333);
        this.f24087 = c13015.m32434(EnumC7687.f25329, "none");
        this.f24071 = c13015.m32432("suppressNotes");
        String strM32423 = c13015.m32423(EnumC7687.f25321);
        int i2 = Integer.MAX_VALUE;
        if (strM32423 != null) {
            try {
                i = Integer.parseInt(strM32423);
                if (i <= 0) {
                    i = Integer.MAX_VALUE;
                }
            } catch (NumberFormatException unused) {
                i = 100;
            }
        } else {
            i = 100;
        }
        this.f24084 = i;
        String strM32424 = c13015.m32423(EnumC7687.f25296);
        if (strM32424 != null) {
            try {
                int i3 = Integer.parseInt(strM32424);
                if (i3 > 0) {
                    i2 = i3;
                }
            } catch (NumberFormatException unused2) {
                i2 = 100;
            }
        } else {
            i2 = 100;
        }
        this.f24082 = i2;
        if (c13015.m32432("rawDiagnostics")) {
            c18698 = new C23458(c13015);
        } else {
            c18698 = new C18698(c13015, this.f24081);
        }
        this.f24076 = c18698;
        String strM32422 = c13015.m32422("expectKeys");
        if (strM32422 != null) {
            this.f24080 = new HashSet(Arrays.asList(strM32422.split(", *")));
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m20045() {
        return this.f24072 != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20038(InterfaceC15976 interfaceC15976, InterfaceC1960 interfaceC1960) {
        C11972.m30021(interfaceC15976);
        C23393 c23393M34515 = m34515(interfaceC15976);
        InterfaceC1960 interfaceC1961 = c23393M34515.f75732;
        if (interfaceC1961 != null && interfaceC1961 != interfaceC1960) {
            throw new IllegalStateException("endPosTable already set");
        }
        c23393M34515.f75732 = interfaceC1960;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC15976 m20046() {
        C23393 c23393 = this.f44941;
        if (c23393 == null) {
            return null;
        }
        return c23393.f75737;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC20162 m20051() {
        return this.f24076;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20040(C21220 c21220) {
        this.f24076 = c21220;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final PrintWriter m20031(EnumC8803 enumC8803) {
        return (PrintWriter) this.f24077.get(enumC8803);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20034(PrintWriter printWriter) {
        for (EnumC8803 enumC8803 : EnumC8803.values()) {
            this.f24077.put(enumC8803, printWriter);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20036(AbstractC1346 abstractC1346) {
        C11972.m30026(this.f24069 == abstractC1346);
        this.f24069 = abstractC1346.f4810;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m20043() {
        Iterator it = this.f24077.values().iterator();
        while (it.hasNext()) {
            ((PrintWriter) it.next()).flush();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m20029(C7312 c7312, C17007 c17007) {
        HashSet hashSet = c7312.f24086;
        InterfaceC15976 interfaceC15976M40086 = c17007.m40086();
        if (interfaceC15976M40086 == null) {
            return true;
        }
        int iM40087 = c17007.m40087();
        HashSet hashSet2 = c7312.f24073;
        C5558 c5558 = new C5558(interfaceC15976M40086, Integer.valueOf(iM40087));
        boolean zContains = hashSet2.contains(c5558);
        if (!zContains) {
            hashSet2.add(c5558);
        }
        if (zContains) {
            return false;
        }
        if (!c17007.m40083(EnumC6984.SOURCE_LEVEL)) {
            return true;
        }
        C18499 c18499 = new C18499();
        m20028(c18499, c17007);
        C5558 c5559 = new C5558(interfaceC15976M40086, c18499.m43093());
        boolean zContains2 = hashSet.contains(c5559);
        boolean z = !zContains2;
        if (!zContains2) {
            hashSet.add(c5559);
        }
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20028(C18499 c18499, C17007 c17007) {
        c18499.m43089(c17007.mo32405());
        for (Object obj : c17007.m40085()) {
            if (obj instanceof C17007) {
                m20028(c18499, (C17007) obj);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m20042(AbstractC8036 abstractC8036) {
        C23393 c23393 = this.f44941;
        InterfaceC15976 interfaceC15976 = c23393 != null ? c23393.f75737 : null;
        if (interfaceC15976 != null) {
            return this.f24073.contains(new C5558(interfaceC15976, Integer.valueOf(abstractC8036.f26658)));
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m20047(String str, Object... objArr) {
        m20024((PrintWriter) this.f24077.get(EnumC8803.NOTICE), m20032(EnumC2837.COMPILER_MISC, str, objArr));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m20049(AbstractC13695 abstractC13695) {
        m20024((PrintWriter) this.f24077.get(EnumC8803.NOTICE), this.f24081.m52977(abstractC13695));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m20048(EnumC2837 enumC2837, String str, Object... objArr) {
        m20024((PrintWriter) this.f24077.get(EnumC8803.NOTICE), m20032(enumC2837, str, objArr));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20035(String str) {
        m20024((PrintWriter) this.f24077.get(EnumC8803.NOTICE), str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20037(EnumC8803 enumC8803, String str) {
        m20024(m20031(enumC8803), str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20024(PrintWriter printWriter, String str) {
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

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m20044(String str, Object... objArr) {
        m20024((PrintWriter) this.f24077.get(EnumC8803.NOTICE), m20032(EnumC2837.COMPILER_MISC, "verbose.".concat(str), objArr));
    }

    @Override // l.AbstractC14222
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo20041(Object... objArr) {
        PrintWriter printWriter = (PrintWriter) this.f24077.get(EnumC8803.ERROR);
        m20024(printWriter, m20032(EnumC2837.COMPILER_MISC, "source.unavailable", objArr));
        printWriter.flush();
    }

    @Override // l.AbstractC14222
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo20039(C17007 c17007) {
        this.f24069.mo4974(c17007);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m20050(C17007 c17007) {
        PrintWriter printWriter;
        int i;
        InterfaceC1807 interfaceC1807 = this.f24072;
        if (interfaceC1807 != null) {
            interfaceC1807.mo6284(c17007);
            return;
        }
        EnumC22229 enumC22229M40089 = c17007.m40089();
        int[] iArr = C8058.f26685;
        int i2 = iArr[enumC22229M40089.ordinal()];
        if (i2 != 1) {
            EnumMap enumMap = this.f24077;
            if (i2 == 2) {
                printWriter = (PrintWriter) enumMap.get(EnumC8803.NOTICE);
            } else if (i2 == 3) {
                printWriter = (PrintWriter) enumMap.get(EnumC8803.WARNING);
            } else if (i2 == 4) {
                printWriter = (PrintWriter) enumMap.get(EnumC8803.ERROR);
            } else {
                throw new Error();
            }
            m20024(printWriter, this.f24076.mo12290(c17007, this.f24081.m52978()));
            if (this.f24075 && (((i = iArr[c17007.m40089().ordinal()]) == 3 || i == 4) && this.f24075)) {
                System.err.println(m20032(EnumC2837.COMPILER_MISC, "resume.abort", new Object[0]));
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
            if (this.f24074) {
                new RuntimeException().printStackTrace(printWriter);
            }
            printWriter.flush();
            return;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static String m20030(String str, Object... objArr) {
        return C23721.m52974(EnumC2837.COMPILER_MISC.m9351(str), objArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m20033(AbstractC13695 abstractC13695) {
        return this.f24081.m52977(abstractC13695);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m20032(EnumC2837 enumC2837, String str, Object... objArr) {
        return this.f24081.m52975(enumC2837.m9351(str), objArr);
    }
}
