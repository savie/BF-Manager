package l;

import bin.mt.plus.R;
import java.io.UncheckedIOException;
import java.util.concurrent.CancellationException;
import java.util.function.BooleanSupplier;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: renamed from: l.ۤܰۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 44TS */
/* JADX INFO: loaded from: classes3.dex */
public final class C10327 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C17069 f35399;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC12483 f35400;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f35401;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C9268 f35402;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public String f35403;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public InterfaceC21615 f35404;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public InterfaceC2916 f35405;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f35406;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f35407;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC18087 f35408;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public InterfaceC2916 f35410;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C6111 f35412;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public volatile C8916 f35414;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f35415;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f35416;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f35418;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public PatternSyntaxException f35421;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f35422;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f35423;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f35424;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f35425;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f35411 = -1;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f35397 = -1;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C6222 f35417 = null;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f35419 = -1;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C8210 f35420 = new C8210();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public volatile int f35396 = -1;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f35409 = false;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C22959 f35413 = C22959.m50799(150);

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f35398 = true;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private synchronized void m26171(final boolean z, final boolean z2) {
        C8916 c8916 = this.f35414;
        if (c8916 != null && !c8916.m23206()) {
            c8916.m23207();
        }
        C6222 c6222 = this.f35417;
        if (c6222 == null) {
            this.f35409 = false;
            this.f35397 = -1;
            this.f35396 = -1;
            this.f35410 = null;
            PatternSyntaxException patternSyntaxException = this.f35421;
            if (patternSyntaxException != null) {
                m26160(patternSyntaxException);
            }
            return;
        }
        if (c8916 != null && c8916.f30596 == c6222 && !c8916.f30588) {
            m26170(this.f35417.pattern());
        }
        final C8916 c8917 = new C8916(this);
        this.f35414 = c8917;
        this.f35409 = false;
        this.f35397 = -1;
        c8917.m23208(C4716.f16636.submit(new Runnable() { // from class: l.ۨܰۚ
            @Override // java.lang.Runnable
            public final void run() {
                C10327.m26169(this.f39464, c8917, z, z2);
            }
        }));
    }

    public C10327(AbstractActivityC12483 abstractActivityC12483, C6111 c6111) {
        this.f35400 = abstractActivityC12483;
        this.f35412 = c6111;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26200(InterfaceC21615 interfaceC21615) {
        if (this.f35404 != interfaceC21615) {
            m26156();
        }
        this.f35404 = interfaceC21615;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m26203() {
        return this.f35407;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m26205(boolean z) {
        if (this.f35407 != z) {
            m26156();
        }
        this.f35407 = z;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private boolean m26155(String str) {
        String str2;
        if (!m26178()) {
            return false;
        }
        int i = this.f35411;
        C6111 c6111 = this.f35412;
        return i == c6111.f20745 && (str2 = this.f35403) != null && str2.equals(str) && C13638.equals(this.f35399, c6111.m16807()) && this.f35423 == this.f35416 && this.f35424 == this.f35425 && this.f35401 == this.f35422;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26196(byte b) {
        boolean z = (b & 1) != 0;
        boolean z2 = (b & 2) != 0;
        boolean z3 = (b & 4) != 0;
        m26205((b & 8) != 0);
        boolean z4 = (b & 16) != 0;
        m26193(z);
        m26202(z2);
        m26201(z3);
        this.f35406 = z4;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m26193(boolean z) {
        if (this.f35416 != z) {
            m26207();
        }
        this.f35416 = z;
        InterfaceC18087 interfaceC18087 = this.f35408;
        if (interfaceC18087 != null) {
            interfaceC18087.mo18153(z);
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m26202(boolean z) {
        if (this.f35425 != z) {
            m26207();
        }
        this.f35425 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26201(boolean z) {
        if (this.f35422 != z) {
            m26207();
        }
        this.f35422 = z;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m26211(boolean z) {
        this.f35406 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte m26195() {
        byte b = this.f35416 ? (byte) 1 : (byte) 0;
        if (this.f35425) {
            b = (byte) (b | 2);
        }
        if (this.f35422) {
            b = (byte) (b | 4);
        }
        if (this.f35407) {
            b = (byte) (b | 8);
        }
        return this.f35406 ? (byte) (b | 16) : b;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m26212() {
        return this.f35416;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m26192() {
        return this.f35425;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m26206() {
        return this.f35422;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m26194() {
        return this.f35406;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m26208() {
        boolean z = this.f35416;
        boolean z2 = this.f35422;
        boolean z3 = this.f35425;
        int i = z ? 8 : 16;
        if (!z2) {
            i |= 66;
        }
        return z3 ? i | 512 : i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26197(String str) {
        if (this.f35413.m50803() || this.f35412.f20764.mo14804()) {
            return;
        }
        this.f35398 = true;
        if (!m26155(str)) {
            m26159(str, true, false);
        } else {
            m26171(true, false);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m26209(String str) {
        if (this.f35413.m50803() || this.f35412.f20764.mo14804()) {
            return;
        }
        this.f35398 = false;
        if (!m26155(str)) {
            m26159(str, false, false);
        } else {
            m26171(false, false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m26159(String str, boolean z, boolean z2) {
        this.f35409 = false;
        this.f35423 = this.f35416;
        this.f35424 = this.f35425;
        this.f35403 = str;
        C6111 c6111 = this.f35412;
        this.f35399 = c6111.m16807();
        this.f35401 = this.f35422;
        int i = c6111.f20745;
        this.f35397 = i;
        this.f35411 = i;
        this.f35417 = null;
        if (str.isEmpty()) {
            m26156();
            return;
        }
        try {
            C14690 c14690M35218 = C14690.m35218(m26208(), str);
            this.f35421 = null;
            m26170(c14690M35218);
            InterfaceC18087 interfaceC18087 = this.f35408;
            if (interfaceC18087 != null) {
                interfaceC18087.mo18152();
            }
            m26171(z, z2);
        } catch (PatternSyntaxException e) {
            m26160(e);
            this.f35421 = e;
            m26156();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m26204(String str) {
        if (!C13638.equals(this.f35403, str)) {
            m26156();
        }
        C6111 c6111 = this.f35412;
        C12880 c12880 = c6111.f20825;
        if (str.isEmpty()) {
            c12880.m31933();
            c6111.m16984();
        } else {
            try {
                c12880.m31937(c6111.m17000(), C14690.m35218(m26208(), str));
            } catch (PatternSyntaxException unused) {
                c12880.m31938();
            }
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m26207() {
        m26156();
        C9268 c9268 = this.f35402;
        if (c9268 != null) {
            c9268.m23810();
        }
        this.f35412.f20825.m31933();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m26172(C6222 c6222, int i, boolean z) {
        if (C5780.m15914(c6222, i)) {
            return z || c6222.start() != i || c6222.end() != i || C5780.m15915(c6222);
        }
        return false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m26183(C10327 c10327, int i) {
        if (c10327.f35420.m21501() == null || c10327.f35417 == null || c10327.f35420.m21501() != c10327.f35417.pattern() || c10327.f35410 == null) {
            return false;
        }
        int i2 = c10327.f35396;
        C6111 c6111 = c10327.f35412;
        return i2 == c6111.f20745 && c10327.f35410 == c6111.m17000() && c10327.f35415 == c10327.f35410.mo2395() && c10327.f35420.m21500() == i && c10327.f35420.m21498() == i && c10327.f35412.m16916() == i && c10327.f35412.m17020() == i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m26170(C14690 c14690) {
        InterfaceC2916 interfaceC2916M17000 = this.f35412.m17000();
        this.f35405 = interfaceC2916M17000;
        this.f35418 = interfaceC2916M17000.mo2395();
        this.f35419 = this.f35412.f20745;
        C8916 c8916 = this.f35414;
        C6222 c6222 = this.f35417;
        if (c6222 == null || c6222.pattern() != c14690 || (c8916 != null && c8916.f30596 == this.f35417 && !c8916.f30588)) {
            C6222 c6222Matcher = c14690.matcher("");
            c6222Matcher.m17274();
            this.f35417 = c6222Matcher;
        } else {
            C6222 c6223 = this.f35417;
            c6223.m17276reset((CharSequence) "");
            c6223.m17274();
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private boolean m26178() {
        InterfaceC2916 interfaceC2916;
        if (this.f35417 == null) {
            return false;
        }
        InterfaceC2916 interfaceC2917 = this.f35405;
        C6111 c6111 = this.f35412;
        return interfaceC2917 == c6111.m17000() && (interfaceC2916 = this.f35405) != null && this.f35418 == interfaceC2916.mo2395() && this.f35419 == c6111.f20745;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private void m26156() {
        C8916 c8916 = this.f35414;
        this.f35414 = null;
        if (c8916 != null) {
            c8916.m23207();
            c8916.m23211();
        }
        this.f35409 = false;
        this.f35397 = -1;
        this.f35396 = -1;
        this.f35410 = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean m26182(C8916 c8916) {
        return this.f35414 == c8916 && !c8916.m23210() && this.f35417 == c8916.f30596 && C13638.equals(this.f35403, c8916.f30583) && m26208() == c8916.f30579 && C13638.equals(this.f35412.m16807(), c8916.f30597) && this.f35404 == c8916.f30580 && this.f35407 == c8916.f30589;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m26173(C8916 c8916) {
        if (!m26182(c8916)) {
            return false;
        }
        InterfaceC2916 interfaceC2916 = c8916.f30594;
        C6111 c6111 = this.f35412;
        return interfaceC2916 == c6111.m17000() && c8916.f30578 == c8916.f30594.mo2395() && c8916.f30587 == c6111.f20745;
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
    public static /* synthetic */ void m26169(final C10327 c10327, final C8916 c8916, boolean z, final boolean z2) {
        Runnable runnable;
        final C22356 e;
        final RuntimeException e2;
        RunnableC5387 runnableC5387;
        RunnableC5387 runnableC5388;
        final boolean z3;
        c8916.m23209();
        int i = c8916.f30586;
        C9268 c9268 = c8916.f30592;
        C6222 c6222 = c8916.f30596;
        final C8210 c8210 = new C8210();
        try {
            try {
                c9268.m23807();
                if (c10327.m26173(c8916)) {
                    RunnableC7856 runnableC7856 = new RunnableC7856(0, c9268);
                    C3329 c3329Mo2399 = c8916.f30594.mo2399();
                    try {
                        c3329Mo2399.m9894(runnableC7856);
                        if (c10327.m26173(c8916) && c3329Mo2399.m9896() == c8916.f30578 && c3329Mo2399.length() == i) {
                            c6222.m17263(runnableC7856);
                            c6222.m17276reset((CharSequence) c3329Mo2399);
                            c6222.m17275region(c8916.f30595, c8916.f30591);
                            boolean z4 = false;
                            if (z) {
                                int iRegionStart = c6222.regionStart();
                                int iMax = Math.max(iRegionStart, c8916.f30593);
                                try {
                                    if (m26172(c6222, iMax, c8916.f30581)) {
                                        c8210.m21499(c6222);
                                    } else if (z2 || !c10327.m26174(c8916, true)) {
                                        if (c10327.m26173(c8916) && iMax > iRegionStart && m26172(c6222, iRegionStart, true)) {
                                            c8210.m21499(c6222);
                                        }
                                        z3 = z4;
                                        runnable = new Runnable() { // from class: l.۬ܰۚ
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                C10327.m26168(this.f43781, c8916, z3, c8210, z2);
                                            }
                                        };
                                        c3329Mo2399.close();
                                        c6222.m17263((Runnable) null);
                                        c6222.m17276reset((CharSequence) "");
                                        c8916.f30588 = true;
                                        runnableC5387 = new RunnableC5387(0, c8916);
                                    } else {
                                        c3329Mo2399.close();
                                        c6222.m17263((Runnable) null);
                                        c6222.m17276reset((CharSequence) "");
                                        c8916.f30588 = true;
                                        runnableC5388 = new RunnableC5387(0, c8916);
                                    }
                                    c3329Mo2399.close();
                                    c6222.m17263((Runnable) null);
                                    c6222.m17276reset((CharSequence) "");
                                    c8916.f30588 = true;
                                    runnableC5387 = new RunnableC5387(0, c8916);
                                } catch (UncheckedIOException e3) {
                                    e2 = e3;
                                    C16737.m39273(new Runnable() { // from class: l.ۘܰۚ
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            C10327.m26165(this.f14749, c8916, e2);
                                        }
                                    });
                                    c6222.m17263((Runnable) null);
                                    c6222.m17276reset((CharSequence) "");
                                    c8916.f30588 = true;
                                    runnableC5387 = new RunnableC5387(0, c8916);
                                } catch (CancellationException unused) {
                                    c6222.m17263((Runnable) null);
                                    c6222.m17276reset((CharSequence) "");
                                    c8916.f30588 = true;
                                    runnableC5387 = new RunnableC5387(0, c8916);
                                } catch (C18188 e4) {
                                    e2 = e4;
                                    C16737.m39273(new Runnable() { // from class: l.ۘܰۚ
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            C10327.m26165(this.f14749, c8916, e2);
                                        }
                                    });
                                    c6222.m17263((Runnable) null);
                                    c6222.m17276reset((CharSequence) "");
                                    c8916.f30588 = true;
                                    runnableC5387 = new RunnableC5387(0, c8916);
                                } catch (C22356 e5) {
                                    e = e5;
                                    C16737.m39273(new Runnable() { // from class: l.᩹ܰۚ
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            C10327.m26167(this.f72891, c8916, e);
                                        }
                                    });
                                    c6222.m17263((Runnable) null);
                                    c6222.m17276reset((CharSequence) "");
                                    c8916.f30588 = true;
                                    runnableC5387 = new RunnableC5387(0, c8916);
                                } catch (Throwable unused2) {
                                    C16737.m39273(new Runnable() { // from class: l.֨ܰۚ
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            C10327.m26163(this.f5172, c8916);
                                        }
                                    });
                                    c6222.m17263((Runnable) null);
                                    c6222.m17276reset((CharSequence) "");
                                    c8916.f30588 = true;
                                    runnableC5387 = new RunnableC5387(0, c8916);
                                }
                                z4 = true;
                                z3 = z4;
                                runnable = new Runnable() { // from class: l.۬ܰۚ
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C10327.m26168(this.f43781, c8916, z3, c8210, z2);
                                    }
                                };
                            } else if (m26172(c6222, c6222.regionStart(), true)) {
                                c8210.m21499(c6222);
                                int iStart = c6222.start();
                                int i2 = c8916.f30585;
                                if (iStart < i2) {
                                    i = i2;
                                } else if (!z2 && c10327.m26174(c8916, false)) {
                                    c3329Mo2399.close();
                                    c6222.m17263((Runnable) null);
                                    c6222.m17276reset((CharSequence) "");
                                    c8916.f30588 = true;
                                    runnableC5388 = new RunnableC5387(0, c8916);
                                }
                                while (C5780.m15915(c6222) && c6222.start() < i) {
                                    c8210.m21499(c6222);
                                }
                                z3 = true;
                                runnable = new Runnable() { // from class: l.۬ܰۚ
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C10327.m26168(this.f43781, c8916, z3, c8210, z2);
                                    }
                                };
                                c3329Mo2399.close();
                                c6222.m17263((Runnable) null);
                                c6222.m17276reset((CharSequence) "");
                                c8916.f30588 = true;
                                runnableC5387 = new RunnableC5387(0, c8916);
                            } else if (z2 || !c10327.m26174(c8916, false)) {
                                z3 = false;
                                runnable = new Runnable() { // from class: l.۬ܰۚ
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C10327.m26168(this.f43781, c8916, z3, c8210, z2);
                                    }
                                };
                                c3329Mo2399.close();
                                c6222.m17263((Runnable) null);
                                c6222.m17276reset((CharSequence) "");
                                c8916.f30588 = true;
                                runnableC5387 = new RunnableC5387(0, c8916);
                            } else {
                                c3329Mo2399.close();
                                c6222.m17263((Runnable) null);
                                c6222.m17276reset((CharSequence) "");
                                c8916.f30588 = true;
                                runnableC5388 = new RunnableC5387(0, c8916);
                            }
                            C16737.m39273(runnableC5387);
                            if (runnable != null) {
                                C16737.m39273(runnable);
                            }
                        }
                        c3329Mo2399.close();
                        c6222.m17263((Runnable) null);
                        c6222.m17276reset((CharSequence) "");
                        c8916.f30588 = true;
                        runnableC5388 = new RunnableC5387(0, c8916);
                    } catch (Throwable th) {
                        try {
                            c3329Mo2399.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } else {
                    c6222.m17263((Runnable) null);
                    c6222.m17276reset((CharSequence) "");
                    c8916.f30588 = true;
                    runnableC5388 = new RunnableC5387(0, c8916);
                }
                C16737.m39273(runnableC5388);
            } catch (Throwable th3) {
                c6222.m17263((Runnable) null);
                c6222.m17276reset((CharSequence) "");
                c8916.f30588 = true;
                C16737.m39273(new RunnableC5387(0, c8916));
                throw th3;
            }
        } catch (UncheckedIOException e6) {
            e = e6;
            e2 = e;
            runnable = null;
            C16737.m39273(new Runnable() { // from class: l.ۘܰۚ
                @Override // java.lang.Runnable
                public final void run() {
                    C10327.m26165(this.f14749, c8916, e2);
                }
            });
            c6222.m17263((Runnable) null);
            c6222.m17276reset((CharSequence) "");
            c8916.f30588 = true;
            runnableC5387 = new RunnableC5387(0, c8916);
            C16737.m39273(runnableC5387);
            if (runnable != null) {
                C16737.m39273(runnable);
            }
        } catch (CancellationException unused3) {
            runnable = null;
        } catch (C18188 e7) {
            e = e7;
            e2 = e;
            runnable = null;
            C16737.m39273(new Runnable() { // from class: l.ۘܰۚ
                @Override // java.lang.Runnable
                public final void run() {
                    C10327.m26165(this.f14749, c8916, e2);
                }
            });
            c6222.m17263((Runnable) null);
            c6222.m17276reset((CharSequence) "");
            c8916.f30588 = true;
            runnableC5387 = new RunnableC5387(0, c8916);
            C16737.m39273(runnableC5387);
            if (runnable != null) {
                C16737.m39273(runnable);
            }
        } catch (C22356 e8) {
            e = e8;
            runnable = null;
        } catch (Throwable unused4) {
            runnable = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m26168(C10327 c10327, C8916 c8916, boolean z, C8210 c8210, boolean z2) {
        if (c10327.m26173(c8916) && c8916.f30592.m23806()) {
            c10327.f35409 = z;
            int i = c8916.f30587;
            c10327.f35397 = i;
            if (z) {
                c10327.f35420 = c8210;
                c10327.f35396 = i;
                c10327.f35410 = c8916.f30594;
                c10327.f35415 = c8916.f30578;
                c10327.f35412.requestFocus();
                c10327.f35412.mo16839(c8210.m21500(), c8210.m21498());
                c10327.f35412.m16992(false);
                return;
            }
            c10327.m26190(z2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m26165(C10327 c10327, C8916 c8916, RuntimeException runtimeException) {
        if (c10327.m26173(c8916) && c8916.f30592.m23806()) {
            c10327.f35412.m16894(c8916.f30594, runtimeException);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m26167(C10327 c10327, C8916 c8916, C22356 c22356) {
        if (c10327.m26173(c8916) && c8916.f30592.m23806()) {
            C15829.m37619(c22356.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m26163(C10327 c10327, C8916 c8916) {
        if (c10327.m26173(c8916) && c8916.f30592.m23806()) {
            C15829.m37618(R.string.MT_Protector);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00ac */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m26174(final l.C8916 r17, boolean r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10327.m26174(l.ۡܰۚ, boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.᩺ܰۚ] */
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
    public static /* synthetic */ void m26164(C10327 c10327, final C8916 c8916, int i, final C8210 c8210) {
        if (c10327.m26173(c8916) && c8916.f30592.m23806()) {
            c8916.m23211();
            c8916.f30580.mo29748(i, new Runnable() { // from class: l.᩺ܰۚ
                @Override // java.lang.Runnable
                public final void run() {
                    C10327.m26166(this.f74832, c8916, c8210);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m26166(C10327 c10327, C8916 c8916, C8210 c8210) {
        if (C13638.equals(c10327.f35403, c8916.f30583) && c10327.m26208() == c8916.f30579 && c10327.f35407) {
            c10327.m26170(c8916.f30596.pattern());
            int i = c10327.f35412.f20745;
            c10327.f35397 = i;
            c10327.f35411 = i;
            c10327.f35399 = null;
            c10327.f35420 = c8210;
            c10327.f35409 = true;
            c10327.f35396 = i;
            InterfaceC2916 interfaceC2916M17000 = c10327.f35412.m17000();
            c10327.f35410 = interfaceC2916M17000;
            c10327.f35415 = interfaceC2916M17000.mo2395();
            c10327.f35412.requestFocus();
            c10327.f35412.mo16839(c8210.m21500(), c8210.m21498());
            c10327.f35412.m16992(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0118  */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26198(String str, String str2) {
        String str3;
        if (this.f35413.m50803()) {
            return;
        }
        C6111 c6111 = this.f35412;
        if (c6111.m17004() || c6111.f20764.mo14804()) {
            return;
        }
        if (!m26178() || this.f35397 != c6111.f20745 || ((this.f35409 && (this.f35410 != this.f35405 || this.f35415 != this.f35418)) || (str3 = this.f35403) == null || !str3.equals(str) || !C13638.equals(this.f35399, c6111.m16807()) || this.f35423 != this.f35416 || this.f35424 != this.f35425 || this.f35401 != this.f35422)) {
            if (m26155(str)) {
                m26171(this.f35398, true);
                return;
            } else {
                m26159(str, this.f35398, true);
                return;
            }
        }
        if (!this.f35409) {
            m26190(true);
            return;
        }
        if (c6111.m16916() != this.f35420.m21500() || c6111.m17020() != this.f35420.m21498()) {
            m26171(this.f35398, true);
            return;
        }
        int iM21500 = this.f35420.m21500();
        int iM21498 = this.f35420.m21498();
        InterfaceC2916 interfaceC2916M17000 = c6111.m17000();
        try {
            if (this.f35416) {
                C3329 c3329Mo2399 = interfaceC2916M17000.mo2399();
                try {
                    if (c3329Mo2399.m9896() != this.f35415) {
                        m26159(str, this.f35398, true);
                        c3329Mo2399.close();
                        return;
                    } else {
                        C8210 c8210 = this.f35420;
                        StringBuilder sb = new StringBuilder();
                        C9751.m24731(new C18793(c8210, c3329Mo2399), sb, str2);
                        str2 = sb.toString();
                        c3329Mo2399.close();
                    }
                } catch (Throwable th) {
                    try {
                        c3329Mo2399.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            InterfaceC18087 interfaceC18087 = this.f35408;
            if (interfaceC18087 != null) {
                interfaceC18087.mo18148();
            }
            interfaceC2916M17000.replace(iM21500, iM21498, str2);
            c6111.m16827(false);
            this.f35411 = -1;
            this.f35397 = c6111.f20745;
            c6111.requestFocus();
            if (this.f35399 != null) {
                this.f35399 = c6111.m16807();
            }
            m26170(this.f35417.pattern());
            if (this.f35406) {
                return;
            }
            m26171(this.f35398, true);
            if (this.f35409) {
                return;
            }
            c6111.mo17029(str2.length() + iM21500);
        } catch (UncheckedIOException e) {
            e = e;
            if (c6111.m16894(interfaceC2916M17000, e)) {
                throw e;
            }
        } catch (PatternSyntaxException e2) {
            m26160(e2);
        } catch (C18188 e3) {
            e = e3;
            if (c6111.m16894(interfaceC2916M17000, e)) {
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m26210(String str, String str2) {
        if (this.f35402 == null && !this.f35413.m50803()) {
            C6111 c6111 = this.f35412;
            if (c6111.m17004() || c6111.f20764.mo14804()) {
                return;
            }
            this.f35397 = -1;
            this.f35411 = -1;
            if (str.length() == 0) {
                return;
            }
            try {
                C14690 c14690M35218 = C14690.m35218(m26208(), str);
                if (this.f35416) {
                    try {
                        C9751.m24733(c14690M35218, str2);
                    } catch (PatternSyntaxException e) {
                        m26160(e);
                        return;
                    }
                }
                InterfaceC18087 interfaceC18087 = this.f35408;
                if (interfaceC18087 != null) {
                    interfaceC18087.mo18152();
                }
                InterfaceC18087 interfaceC18088 = this.f35408;
                if (interfaceC18088 != null) {
                    interfaceC18088.mo18148();
                }
                InterfaceC2916 interfaceC2916M17000 = c6111.m17000();
                int iMo2395 = interfaceC2916M17000.mo2395();
                final C17069 c17069M16807 = c6111.m16807();
                boolean z = this.f35416;
                m26156();
                C9268 c9268 = new C9268(c6111, this.f35400, R.string.MT_Protector, new BooleanSupplier() { // from class: l.ۖܰۚ
                    @Override // java.util.function.BooleanSupplier
                    public final boolean getAsBoolean() {
                        return C13638.equals(c17069M16807, this.f10115.f35412.m16807());
                    }
                });
                this.f35402 = c9268;
                new C15266(this, c9268, interfaceC2916M17000, iMo2395, c14690M35218, c17069M16807, str2, z, C7412.toPath(c6111.getContext().getCacheDir()).resolve("replace-output")).m10243();
            } catch (PatternSyntaxException e2) {
                m26160(e2);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26199(InterfaceC18087 interfaceC18087) {
        this.f35408 = interfaceC18087;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m26186(C10327 c10327) {
        InterfaceC18087 interfaceC18087 = c10327.f35408;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m26188(C10327 c10327) {
        InterfaceC18087 interfaceC18087 = c10327.f35408;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public void m26190(boolean z) {
        this.f35408.mo18151(this.f35399 == null && this.f35404 != null && (!this.f35407 || z));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m26161(C10327 c10327, int i) {
        InterfaceC18087 interfaceC18087 = c10327.f35408;
        if (interfaceC18087 != null) {
            interfaceC18087.mo18149(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m26160(PatternSyntaxException patternSyntaxException) {
        InterfaceC18087 interfaceC18087 = this.f35408;
        if (interfaceC18087 != null) {
            interfaceC18087.mo18150(patternSyntaxException);
        }
    }
}
