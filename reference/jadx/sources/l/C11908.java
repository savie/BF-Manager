package l;

import bin.mt.plus.R;
import java.io.UncheckedIOException;
import java.util.concurrent.CancellationException;
import java.util.function.BooleanSupplier;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: renamed from: l.ۧ᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 44TS */
/* JADX INFO: loaded from: classes3.dex */
public final class C11908 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f38345;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public InterfaceC20113 f38346;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C20837 f38347;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public InterfaceC19106 f38348;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public PatternSyntaxException f38349;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC17204 f38350;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f38352;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public InterfaceC19106 f38353;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f38354;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C7919 f38355;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f38357;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f38358;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile C2214 f38360;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f38361;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f38364;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f38366;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f38367;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C24132 f38370;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f38372;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public InterfaceC23097 f38373;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f38374;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f38351 = -1;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f38359 = -1;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C4245 f38362 = null;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f38368 = -1;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C13400 f38369 = new C13400();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public volatile int f38365 = -1;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f38356 = false;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C24720 f38363 = C24720.m55194(150);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f38371 = true;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private synchronized void m29804(final boolean z, final boolean z2) {
        C2214 c2214 = this.f38360;
        if (c2214 != null && !c2214.m7564()) {
            c2214.m7559();
        }
        C4245 c4245 = this.f38362;
        if (c4245 == null) {
            this.f38356 = false;
            this.f38359 = -1;
            this.f38365 = -1;
            this.f38353 = null;
            PatternSyntaxException patternSyntaxException = this.f38349;
            if (patternSyntaxException != null) {
                m29793(patternSyntaxException);
            }
            return;
        }
        if (c2214 != null && c2214.f7264 == c4245 && !c2214.f7260) {
            m29803(this.f38362.pattern());
        }
        final C2214 c2215 = new C2214(this);
        this.f38360 = c2215;
        this.f38356 = false;
        this.f38359 = -1;
        c2215.m7560(C5261.f18540.submit(new Runnable() { // from class: l.ᩳۤᩴ
            @Override // java.lang.Runnable
            public final void run() {
                C11908.m29802(this.f61613, c2215, z, z2);
            }
        }));
    }

    public C11908(AbstractActivityC17204 abstractActivityC17204, C24132 c24132) {
        this.f38350 = abstractActivityC17204;
        this.f38370 = c24132;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29833(InterfaceC23097 interfaceC23097) {
        if (this.f38373 != interfaceC23097) {
            m29789();
        }
        this.f38373 = interfaceC23097;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m29842() {
        return this.f38352;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m29837(boolean z) {
        if (this.f38352 != z) {
            m29789();
        }
        this.f38352 = z;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private boolean m29825(String str) {
        String str2;
        if (!m29812()) {
            return false;
        }
        int i = this.f38351;
        C24132 c24132 = this.f38370;
        return i == c24132.f78049 && (str2 = this.f38357) != null && str2.equals(str) && C17359.equals(this.f38347, c24132.m53974()) && this.f38361 == this.f38366 && this.f38374 == this.f38354 && this.f38367 == this.f38364;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29829(byte b) {
        boolean z = (b & 1) != 0;
        boolean z2 = (b & 2) != 0;
        boolean z3 = (b & 4) != 0;
        m29837((b & 8) != 0);
        boolean z4 = (b & 16) != 0;
        m29847(z);
        m29841(z2);
        m29834(z3);
        this.f38358 = z4;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m29847(boolean z) {
        if (this.f38366 != z) {
            m29835();
        }
        this.f38366 = z;
        InterfaceC20113 interfaceC20113 = this.f38346;
        if (interfaceC20113 != null) {
            interfaceC20113.mo32662(z);
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m29841(boolean z) {
        if (this.f38354 != z) {
            m29835();
        }
        this.f38354 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29834(boolean z) {
        if (this.f38364 != z) {
            m29835();
        }
        this.f38364 = z;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m29846(boolean z) {
        this.f38358 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte m29828() {
        byte b = this.f38366 ? (byte) 1 : (byte) 0;
        if (this.f38354) {
            b = (byte) (b | 2);
        }
        if (this.f38364) {
            b = (byte) (b | 4);
        }
        if (this.f38352) {
            b = (byte) (b | 8);
        }
        return this.f38358 ? (byte) (b | 16) : b;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m29840() {
        return this.f38366;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m29839() {
        return this.f38354;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m29838() {
        return this.f38364;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m29848() {
        return this.f38358;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m29843() {
        boolean z = this.f38366;
        boolean z2 = this.f38364;
        boolean z3 = this.f38354;
        int i = z ? 8 : 16;
        if (!z2) {
            i |= 66;
        }
        return z3 ? i | 512 : i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29830(String str) {
        if (this.f38363.m55200() || this.f38370.f78022.mo25237()) {
            return;
        }
        this.f38371 = true;
        if (!m29825(str)) {
            m29792(str, true, false);
        } else {
            m29804(true, false);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m29844(String str) {
        if (this.f38363.m55200() || this.f38370.f78022.mo25237()) {
            return;
        }
        this.f38371 = false;
        if (!m29825(str)) {
            m29792(str, false, false);
        } else {
            m29804(false, false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m29792(String str, boolean z, boolean z2) {
        this.f38356 = false;
        this.f38361 = this.f38366;
        this.f38374 = this.f38354;
        this.f38357 = str;
        C24132 c24132 = this.f38370;
        this.f38347 = c24132.m53974();
        this.f38367 = this.f38364;
        int i = c24132.f78049;
        this.f38359 = i;
        this.f38351 = i;
        this.f38362 = null;
        if (str.isEmpty()) {
            m29789();
            return;
        }
        try {
            C18415 c18415M42924 = C18415.m42924(m29843(), str);
            this.f38349 = null;
            m29803(c18415M42924);
            InterfaceC20113 interfaceC20113 = this.f38346;
            if (interfaceC20113 != null) {
                interfaceC20113.mo32661();
            }
            m29804(z, z2);
        } catch (PatternSyntaxException e) {
            m29793(e);
            this.f38349 = e;
            m29789();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m29836(String str) {
        if (!C17359.equals(this.f38357, str)) {
            m29789();
        }
        C24132 c24132 = this.f38370;
        C2937 c2937 = c24132.f78018;
        if (str.isEmpty()) {
            c2937.m9603();
            c24132.m54070();
        } else {
            try {
                c2937.m9607(c24132.m54021(), C18415.m42924(m29843(), str));
            } catch (PatternSyntaxException unused) {
                c2937.m9608();
            }
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m29835() {
        m29789();
        C7919 c7919 = this.f38355;
        if (c7919 != null) {
            c7919.m21463();
        }
        this.f38370.f78018.m9603();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m29807(C4245 c4245, int i, boolean z) {
        if (C12632.m31398(c4245, i)) {
            return z || c4245.start() != i || c4245.end() != i || C12632.m31399(c4245);
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m29822(C11908 c11908, int i) {
        if (c11908.f38369.m33041() == null || c11908.f38362 == null || c11908.f38369.m33041() != c11908.f38362.pattern() || c11908.f38353 == null) {
            return false;
        }
        int i2 = c11908.f38365;
        C24132 c24132 = c11908.f38370;
        return i2 == c24132.f78049 && c11908.f38353 == c24132.m54021() && c11908.f38345 == c11908.f38353.mo15344() && c11908.f38369.m33040() == i && c11908.f38369.m33038() == i && c11908.f38370.m53968() == i && c11908.f38370.m53882() == i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m29803(C18415 c18415) {
        InterfaceC19106 interfaceC19106M54021 = this.f38370.m54021();
        this.f38348 = interfaceC19106M54021;
        this.f38372 = interfaceC19106M54021.mo15344();
        this.f38368 = this.f38370.f78049;
        C2214 c2214 = this.f38360;
        C4245 c4245 = this.f38362;
        if (c4245 == null || c4245.pattern() != c18415 || (c2214 != null && c2214.f7264 == this.f38362 && !c2214.f7260)) {
            C4245 c4245Matcher = c18415.matcher("");
            c4245Matcher.m13565(false);
            this.f38362 = c4245Matcher;
        } else {
            C4245 c4246 = this.f38362;
            c4246.m13568reset((CharSequence) "");
            c4246.m13565(false);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m29812() {
        InterfaceC19106 interfaceC19106;
        if (this.f38362 == null) {
            return false;
        }
        InterfaceC19106 interfaceC19107 = this.f38348;
        C24132 c24132 = this.f38370;
        return interfaceC19107 == c24132.m54021() && (interfaceC19106 = this.f38348) != null && this.f38372 == interfaceC19106.mo15344() && this.f38368 == c24132.f78049;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m29789() {
        C2214 c2214 = this.f38360;
        this.f38360 = null;
        if (c2214 != null) {
            c2214.m7559();
            c2214.m7563();
        }
        this.f38356 = false;
        this.f38359 = -1;
        this.f38365 = -1;
        this.f38353 = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean m29821(C2214 c2214) {
        return this.f38360 == c2214 && !c2214.m7561() && this.f38362 == c2214.f7264 && C17359.equals(this.f38357, c2214.f7261) && m29843() == c2214.f7271 && C17359.equals(this.f38370.m53974(), c2214.f7274) && this.f38373 == c2214.f7255 && this.f38352 == c2214.f7258;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m29805(C2214 c2214) {
        if (!m29821(c2214)) {
            return false;
        }
        InterfaceC19106 interfaceC19106 = c2214.f7269;
        C24132 c24132 = this.f38370;
        return interfaceC19106 == c24132.m54021() && c2214.f7263 == c2214.f7269.mo15344() && c2214.f7259 == c24132.f78049;
    }

    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x01be  */
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
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m29802(final C11908 c11908, final C2214 c2214, boolean z, final boolean z2) {
        Runnable runnable;
        final C13464 e;
        Throwable e2;
        RunnableC1117 runnableC1117;
        RunnableC1117 runnableC1118;
        final boolean z3;
        c2214.m7562();
        int i = c2214.f7262;
        C7919 c7919 = c2214.f7265;
        C4245 c4245 = c2214.f7264;
        final C13400 c13400 = new C13400();
        try {
            try {
                c7919.m21468();
                if (c11908.m29805(c2214)) {
                    RunnableC1953 runnableC1953 = new RunnableC1953(c7919);
                    C15508 c15508Mo15350 = c2214.f7269.mo15350();
                    try {
                        c15508Mo15350.m37180(runnableC1953);
                        if (c11908.m29805(c2214) && c15508Mo15350.m37177() == c2214.f7263 && c15508Mo15350.length() == i) {
                            c4245.m13553(runnableC1953);
                            c4245.m13568reset((CharSequence) c15508Mo15350);
                            c4245.m13567region(c2214.f7267, c2214.f7266);
                            boolean z4 = false;
                            if (z) {
                                int iRegionStart = c4245.regionStart();
                                int iMax = Math.max(iRegionStart, c2214.f7272);
                                try {
                                    if (m29807(c4245, iMax, c2214.f7257)) {
                                        c13400.m33039(c4245);
                                    } else if (z2 || !c11908.m29806(c2214, true)) {
                                        if (c11908.m29805(c2214) && iMax > iRegionStart && m29807(c4245, iRegionStart, true)) {
                                            c13400.m33039(c4245);
                                        }
                                        z3 = z4;
                                        runnable = new Runnable() { // from class: l.۠ۤᩴ
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                C11908.m29801(this.f27990, c2214, z3, c13400, z2);
                                            }
                                        };
                                        c15508Mo15350.close();
                                        c4245.m13553((Runnable) null);
                                        c4245.m13568reset((CharSequence) "");
                                        c2214.f7260 = true;
                                        runnableC1117 = new RunnableC1117(0, c2214);
                                    } else {
                                        c15508Mo15350.close();
                                        c4245.m13553((Runnable) null);
                                        c4245.m13568reset((CharSequence) "");
                                        c2214.f7260 = true;
                                        runnableC1118 = new RunnableC1117(0, c2214);
                                    }
                                    c15508Mo15350.close();
                                    c4245.m13553((Runnable) null);
                                    c4245.m13568reset((CharSequence) "");
                                    c2214.f7260 = true;
                                    runnableC1117 = new RunnableC1117(0, c2214);
                                } catch (UncheckedIOException e3) {
                                    e2 = e3;
                                    C21576.m49068(new RunnableC7083(c11908, c2214, e2, 0));
                                    c4245.m13553((Runnable) null);
                                    c4245.m13568reset((CharSequence) "");
                                    c2214.f7260 = true;
                                    runnableC1117 = new RunnableC1117(0, c2214);
                                } catch (CancellationException unused) {
                                    c4245.m13553((Runnable) null);
                                    c4245.m13568reset((CharSequence) "");
                                    c2214.f7260 = true;
                                    runnableC1117 = new RunnableC1117(0, c2214);
                                } catch (C13464 e4) {
                                    e = e4;
                                    C21576.m49068(new Runnable() { // from class: l.ۡۤᩴ
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            C11908.m29800(this.f30285, c2214, e);
                                        }
                                    });
                                    c4245.m13553((Runnable) null);
                                    c4245.m13568reset((CharSequence) "");
                                    c2214.f7260 = true;
                                    runnableC1117 = new RunnableC1117(0, c2214);
                                } catch (C24219 e5) {
                                    e2 = e5;
                                    C21576.m49068(new RunnableC7083(c11908, c2214, e2, 0));
                                    c4245.m13553((Runnable) null);
                                    c4245.m13568reset((CharSequence) "");
                                    c2214.f7260 = true;
                                    runnableC1117 = new RunnableC1117(0, c2214);
                                } catch (Throwable unused2) {
                                    C21576.m49068(new Runnable() { // from class: l.ۖۤᩴ
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            C11908.m29796(this.f8378, c2214);
                                        }
                                    });
                                    c4245.m13553((Runnable) null);
                                    c4245.m13568reset((CharSequence) "");
                                    c2214.f7260 = true;
                                    runnableC1117 = new RunnableC1117(0, c2214);
                                }
                                z4 = true;
                                z3 = z4;
                                runnable = new Runnable() { // from class: l.۠ۤᩴ
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C11908.m29801(this.f27990, c2214, z3, c13400, z2);
                                    }
                                };
                            } else if (m29807(c4245, c4245.regionStart(), true)) {
                                c13400.m33039(c4245);
                                int iStart = c4245.start();
                                int i2 = c2214.f7256;
                                if (iStart < i2) {
                                    i = i2;
                                } else if (!z2 && c11908.m29806(c2214, false)) {
                                    c15508Mo15350.close();
                                    c4245.m13553((Runnable) null);
                                    c4245.m13568reset((CharSequence) "");
                                    c2214.f7260 = true;
                                    runnableC1118 = new RunnableC1117(0, c2214);
                                }
                                while (C12632.m31399(c4245) && c4245.start() < i) {
                                    c13400.m33039(c4245);
                                }
                                z3 = true;
                                runnable = new Runnable() { // from class: l.۠ۤᩴ
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C11908.m29801(this.f27990, c2214, z3, c13400, z2);
                                    }
                                };
                                c15508Mo15350.close();
                                c4245.m13553((Runnable) null);
                                c4245.m13568reset((CharSequence) "");
                                c2214.f7260 = true;
                                runnableC1117 = new RunnableC1117(0, c2214);
                            } else if (z2 || !c11908.m29806(c2214, false)) {
                                z3 = false;
                                runnable = new Runnable() { // from class: l.۠ۤᩴ
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C11908.m29801(this.f27990, c2214, z3, c13400, z2);
                                    }
                                };
                                c15508Mo15350.close();
                                c4245.m13553((Runnable) null);
                                c4245.m13568reset((CharSequence) "");
                                c2214.f7260 = true;
                                runnableC1117 = new RunnableC1117(0, c2214);
                            } else {
                                c15508Mo15350.close();
                                c4245.m13553((Runnable) null);
                                c4245.m13568reset((CharSequence) "");
                                c2214.f7260 = true;
                                runnableC1118 = new RunnableC1117(0, c2214);
                            }
                            C21576.m49068(runnableC1117);
                            if (runnable != null) {
                                C21576.m49068(runnable);
                            }
                        }
                        c15508Mo15350.close();
                        c4245.m13553((Runnable) null);
                        c4245.m13568reset((CharSequence) "");
                        c2214.f7260 = true;
                        runnableC1118 = new RunnableC1117(0, c2214);
                    } catch (Throwable th) {
                        try {
                            c15508Mo15350.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } else {
                    c4245.m13553((Runnable) null);
                    c4245.m13568reset((CharSequence) "");
                    c2214.f7260 = true;
                    runnableC1118 = new RunnableC1117(0, c2214);
                }
                C21576.m49068(runnableC1118);
            } catch (Throwable th3) {
                c4245.m13553((Runnable) null);
                c4245.m13568reset((CharSequence) "");
                c2214.f7260 = true;
                C21576.m49068(new RunnableC1117(0, c2214));
                throw th3;
            }
        } catch (UncheckedIOException e6) {
            e = e6;
            e2 = e;
            runnable = null;
            C21576.m49068(new RunnableC7083(c11908, c2214, e2, 0));
            c4245.m13553((Runnable) null);
            c4245.m13568reset((CharSequence) "");
            c2214.f7260 = true;
            runnableC1117 = new RunnableC1117(0, c2214);
            C21576.m49068(runnableC1117);
            if (runnable != null) {
                C21576.m49068(runnable);
            }
        } catch (CancellationException unused3) {
            runnable = null;
        } catch (C13464 e7) {
            e = e7;
            runnable = null;
        } catch (C24219 e8) {
            e = e8;
            e2 = e;
            runnable = null;
            C21576.m49068(new RunnableC7083(c11908, c2214, e2, 0));
            c4245.m13553((Runnable) null);
            c4245.m13568reset((CharSequence) "");
            c2214.f7260 = true;
            runnableC1117 = new RunnableC1117(0, c2214);
            C21576.m49068(runnableC1117);
            if (runnable != null) {
                C21576.m49068(runnable);
            }
        } catch (Throwable unused4) {
            runnable = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29801(C11908 c11908, C2214 c2214, boolean z, C13400 c13400, boolean z2) {
        if (c11908.m29805(c2214) && c2214.f7265.m21464()) {
            c11908.f38356 = z;
            int i = c2214.f7259;
            c11908.f38359 = i;
            if (z) {
                c11908.f38369 = c13400;
                c11908.f38365 = i;
                c11908.f38353 = c2214.f7269;
                c11908.f38345 = c2214.f7263;
                c11908.f38370.requestFocus();
                c11908.f38370.mo52316(c13400.m33040(), c13400.m33038());
                c11908.f38370.m54077(false);
                return;
            }
            c11908.m29815(z2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m29798(C11908 c11908, C2214 c2214, RuntimeException runtimeException) {
        if (c11908.m29805(c2214) && c2214.f7265.m21464()) {
            c11908.f38370.m53943(c2214.f7269, runtimeException);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m29800(C11908 c11908, C2214 c2214, C13464 c13464) {
        if (c11908.m29805(c2214) && c2214.f7265.m21464()) {
            C22673.m51160(c13464.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m29796(C11908 c11908, C2214 c2214) {
        if (c11908.m29805(c2214) && c2214.f7265.m21464()) {
            C22673.m51159(R.string.MT_Protector);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00a8 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m29806(final l.C2214 r16, boolean r17) throws java.lang.Throwable {
        /*
            r15 = this;
            r0 = r16
            l.᩸᩸ᩴ r1 = r0.f7255
            l.۟۬᩸ r2 = r0.f7265
            r3 = 0
            if (r1 == 0) goto Lc3
            boolean r4 = r0.f7258
            if (r4 == 0) goto Lc3
            l.᩵᩷ᩴ r4 = r0.f7274
            if (r4 != 0) goto Lc3
            boolean r4 = r15.m29805(r16)
            if (r4 != 0) goto L19
            goto Lc3
        L19:
            int r4 = r1.mo33335()
            int r5 = r1.mo33338()
            l.ۘܶۤ r6 = r0.f7264
            l.ܿܶۤ r6 = r6.pattern()
            java.lang.String r7 = ""
            l.ۘܶۤ r6 = r6.matcher(r7)
            r6.m13565(r3)
            l.C17359.requireNonNull(r2)
            l.֫۬᩸ r8 = new l.֫۬᩸
            r8.<init>(r2)
            r6.m13553(r8)
            r8 = 1
            r9 = 1
        L3d:
            r10 = 0
            if (r9 >= r4) goto Lbb
            r2.m21468()     // Catch: java.lang.Throwable -> Lb2
            boolean r11 = r15.m29805(r16)     // Catch: java.lang.Throwable -> Lb2
            if (r11 != 0) goto L4b
            goto Lbb
        L4b:
            if (r17 == 0) goto L4f
            r11 = r9
            goto L51
        L4f:
            int r11 = r4 - r9
        L51:
            int r11 = r11 + r5
            int r11 = r11 % r4
            l.۫᩸ᩴ r12 = new l.۫᩸ᩴ     // Catch: java.lang.Throwable -> Lb2
            r12.<init>()     // Catch: java.lang.Throwable -> Lb2
            l.ܳܿ᩸ r13 = r1.mo33336(r11)     // Catch: java.lang.Throwable -> Laa
            l.֫۬᩸ r14 = new l.֫۬᩸     // Catch: java.lang.Throwable -> L9b
            r14.<init>(r2)     // Catch: java.lang.Throwable -> L9b
            r13.m37180(r14)     // Catch: java.lang.Throwable -> L9b
            r6.m13568reset(r13)     // Catch: java.lang.Throwable -> L9b
            boolean r14 = m29807(r6, r3, r8)     // Catch: java.lang.Throwable -> L9b
            if (r14 != 0) goto L76
            r13.close()     // Catch: java.lang.Throwable -> Laa
            r6.m13568reset(r7)     // Catch: java.lang.Throwable -> Lb2
            int r9 = r9 + 1
            goto L3d
        L76:
            r12.m33039(r6)     // Catch: java.lang.Throwable -> L9b
            if (r17 != 0) goto L85
        L7b:
            boolean r1 = l.C12632.m31399(r6)     // Catch: java.lang.Throwable -> L9b
            if (r1 == 0) goto L85
            r12.m33039(r6)     // Catch: java.lang.Throwable -> L9b
            goto L7b
        L85:
            r13.close()     // Catch: java.lang.Throwable -> Laa
            r6.m13568reset(r7)     // Catch: java.lang.Throwable -> Lb2
            l.۬ۤᩴ r1 = new l.۬ۤᩴ     // Catch: java.lang.Throwable -> Lb2
            r2 = r15
            r1.<init>()     // Catch: java.lang.Throwable -> Lb0
            l.C21576.m49068(r1)     // Catch: java.lang.Throwable -> Lb0
            r6.m13553(r10)
            r6.m13568reset(r7)
            return r8
        L9b:
            r0 = move-exception
            r2 = r15
            r1 = r0
            r13.close()     // Catch: java.lang.Throwable -> La2
            goto La7
        La2:
            r0 = move-exception
            r3 = r0
            r1.addSuppressed(r3)     // Catch: java.lang.Throwable -> La8
        La7:
            throw r1     // Catch: java.lang.Throwable -> La8
        La8:
            r0 = move-exception
            goto Lac
        Laa:
            r0 = move-exception
            r2 = r15
        Lac:
            r6.m13568reset(r7)     // Catch: java.lang.Throwable -> Lb0
            throw r0     // Catch: java.lang.Throwable -> Lb0
        Lb0:
            r0 = move-exception
            goto Lb4
        Lb2:
            r0 = move-exception
            r2 = r15
        Lb4:
            r6.m13553(r10)
            r6.m13568reset(r7)
            throw r0
        Lbb:
            r2 = r15
            r6.m13553(r10)
            r6.m13568reset(r7)
            return r3
        Lc3:
            r2 = r15
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11908.m29806(l.֫᩸ᩴ, boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.ۙ᩸ᩴ] */
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
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m29797(C11908 c11908, final C2214 c2214, int i, final C13400 c13400) {
        if (c11908.m29805(c2214) && c2214.f7265.m21464()) {
            c2214.m7563();
            c2214.f7255.mo33337(i, new Runnable() { // from class: l.ۙ᩸ᩴ
                @Override // java.lang.Runnable
                public final void run() {
                    C11908.m29799(this.f18121, c2214, c13400);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29799(C11908 c11908, C2214 c2214, C13400 c13400) {
        if (C17359.equals(c11908.f38357, c2214.f7261) && c11908.m29843() == c2214.f7271 && c11908.f38352) {
            c11908.m29803(c2214.f7264.pattern());
            int i = c11908.f38370.f78049;
            c11908.f38359 = i;
            c11908.f38351 = i;
            c11908.f38347 = null;
            c11908.f38369 = c13400;
            c11908.f38356 = true;
            c11908.f38365 = i;
            InterfaceC19106 interfaceC19106M54021 = c11908.f38370.m54021();
            c11908.f38353 = interfaceC19106M54021;
            c11908.f38345 = interfaceC19106M54021.mo15344();
            c11908.f38370.requestFocus();
            c11908.f38370.mo52316(c13400.m33040(), c13400.m33038());
            c11908.f38370.m54077(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0118  */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29831(String str, String str2) {
        String str3;
        if (this.f38363.m55200()) {
            return;
        }
        C24132 c24132 = this.f38370;
        if (c24132.m54083() || c24132.f78022.mo25237()) {
            return;
        }
        if (!m29812() || this.f38359 != c24132.f78049 || ((this.f38356 && (this.f38353 != this.f38348 || this.f38345 != this.f38372)) || (str3 = this.f38357) == null || !str3.equals(str) || !C17359.equals(this.f38347, c24132.m53974()) || this.f38361 != this.f38366 || this.f38374 != this.f38354 || this.f38367 != this.f38364)) {
            if (m29825(str)) {
                m29804(this.f38371, true);
                return;
            } else {
                m29792(str, this.f38371, true);
                return;
            }
        }
        if (!this.f38356) {
            m29815(true);
            return;
        }
        if (c24132.m53968() != this.f38369.m33040() || c24132.m53882() != this.f38369.m33038()) {
            m29804(this.f38371, true);
            return;
        }
        int iM33040 = this.f38369.m33040();
        int iM33038 = this.f38369.m33038();
        InterfaceC19106 interfaceC19106M54021 = c24132.m54021();
        try {
            if (this.f38366) {
                C15508 c15508Mo15350 = interfaceC19106M54021.mo15350();
                try {
                    if (c15508Mo15350.m37177() != this.f38345) {
                        m29792(str, this.f38371, true);
                        c15508Mo15350.close();
                        return;
                    } else {
                        C13400 c13400 = this.f38369;
                        StringBuilder sb = new StringBuilder();
                        C7974.m21760(new C15637(c13400, c15508Mo15350), sb, str2);
                        str2 = sb.toString();
                        c15508Mo15350.close();
                    }
                } catch (Throwable th) {
                    try {
                        c15508Mo15350.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            InterfaceC20113 interfaceC20113 = this.f38346;
            if (interfaceC20113 != null) {
                interfaceC20113.mo32657();
            }
            interfaceC19106M54021.replace(iM33040, iM33038, str2);
            c24132.m54091(false);
            this.f38351 = -1;
            this.f38359 = c24132.f78049;
            c24132.requestFocus();
            if (this.f38347 != null) {
                this.f38347 = c24132.m53974();
            }
            m29803(this.f38362.pattern());
            if (this.f38358) {
                return;
            }
            m29804(this.f38371, true);
            if (this.f38356) {
                return;
            }
            c24132.mo52339(str2.length() + iM33040);
        } catch (UncheckedIOException e) {
            e = e;
            if (c24132.m53943(interfaceC19106M54021, e)) {
                throw e;
            }
        } catch (PatternSyntaxException e2) {
            m29793(e2);
        } catch (C24219 e3) {
            e = e3;
            if (c24132.m53943(interfaceC19106M54021, e)) {
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m29845(String str, String str2) {
        if (this.f38355 == null && !this.f38363.m55200()) {
            C24132 c24132 = this.f38370;
            if (c24132.m54083() || c24132.f78022.mo25237()) {
                return;
            }
            this.f38359 = -1;
            this.f38351 = -1;
            if (str.length() == 0) {
                return;
            }
            try {
                C18415 c18415M42924 = C18415.m42924(m29843(), str);
                if (this.f38366) {
                    try {
                        C7974.m21762(c18415M42924, str2);
                    } catch (PatternSyntaxException e) {
                        m29793(e);
                        return;
                    }
                }
                InterfaceC20113 interfaceC20113 = this.f38346;
                if (interfaceC20113 != null) {
                    interfaceC20113.mo32661();
                }
                InterfaceC20113 interfaceC20114 = this.f38346;
                if (interfaceC20114 != null) {
                    interfaceC20114.mo32657();
                }
                InterfaceC19106 interfaceC19106M54021 = c24132.m54021();
                int iMo15344 = interfaceC19106M54021.mo15344();
                final C20837 c20837M53974 = c24132.m53974();
                boolean z = this.f38366;
                m29789();
                C7919 c7919 = new C7919(c24132, this.f38350, R.string.MT_Protector, new BooleanSupplier() { // from class: l.ۢۤᩴ
                    @Override // java.util.function.BooleanSupplier
                    public final boolean getAsBoolean() {
                        return C17359.equals(c20837M53974, this.f32284.f38370.m53974());
                    }
                });
                this.f38355 = c7919;
                new C11162(this, c7919, interfaceC19106M54021, iMo15344, c18415M42924, c20837M53974, str2, z, C2503.toPath(c24132.getContext().getCacheDir()).resolve("replace-output")).m8197();
            } catch (PatternSyntaxException e2) {
                m29793(e2);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29832(InterfaceC20113 interfaceC20113) {
        this.f38346 = interfaceC20113;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static void m29816(C11908 c11908) {
        InterfaceC20113 interfaceC20113 = c11908.f38346;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m29818(C11908 c11908) {
        InterfaceC20113 interfaceC20113 = c11908.f38346;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public void m29815(boolean z) {
        this.f38346.mo32660(this.f38347 == null && this.f38373 != null && (!this.f38352 || z));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29794(C11908 c11908, int i) {
        InterfaceC20113 interfaceC20113 = c11908.f38346;
        if (interfaceC20113 != null) {
            interfaceC20113.mo32658(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m29793(PatternSyntaxException patternSyntaxException) {
        InterfaceC20113 interfaceC20113 = this.f38346;
        if (interfaceC20113 != null) {
            interfaceC20113.mo32659(patternSyntaxException);
        }
    }
}
