package l;

import java.io.IOException;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.ᩴۘ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: P7M1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19571 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C13477 f63105 = new C13477();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C19991 f63106;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11518 f63109;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AbstractC17425 f63110;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f63111;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C21566 f63112;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC16722 f63113;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C3163 f63115;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InterfaceC24928 f63116;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f63117;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C15252 f63118;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f63119;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C14764 f63121;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f63122;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC19728 f63123;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C11172 f63124;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f63125;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C7312 f63126;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public InterfaceC14852 f63107 = InterfaceC14852.f48554;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public InterfaceC15976 f63120 = null;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C17365 f63114 = new C17365(this);

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f63108 = true;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14852 m45170() {
        return this.f63114;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19571 m45162(C4747 c4747) {
        C19571 c19571 = (C19571) c4747.m14643(f63105);
        return c19571 == null ? new C19571(c4747) : c19571;
    }

    public C19571(C4747 c4747) {
        AbstractC19728 abstractC19728M51194;
        c4747.m14646(f63105, this);
        this.f63124 = C11172.m28112(c4747);
        C15252 c15252M36599 = C15252.m36599(c4747);
        this.f63118 = c15252M36599;
        this.f63121 = C14764.m35506(c4747);
        InterfaceC16722 interfaceC16722 = (InterfaceC16722) c4747.m14642(InterfaceC16722.class);
        this.f63113 = interfaceC16722;
        this.f63110 = AbstractC17425.m40916(c4747);
        if (interfaceC16722 == null) {
            throw new AssertionError("FileManager initialization error");
        }
        this.f63106 = C19991.m45972(c4747);
        C3163 c3163M10345 = C3163.m10345(c4747);
        this.f63115 = c3163M10345;
        this.f63126 = C7312.m20023(c4747);
        this.f63109 = C11518.m28979(c4747);
        C13015 c13015M32421 = C13015.m32421(c4747);
        this.f63125 = c13015M32421.m32433(EnumC7687.f25279);
        this.f63122 = c13015M32421.m32429("dev");
        this.f63117 = "source".equals(c13015M32421.m32422("-Xprefer"));
        this.f63111 = c13015M32421.m32433(EnumC7687.f25358);
        if (c13015M32421.m32432("failcomplete")) {
            abstractC19728M51194 = c15252M36599.f49864.m51194(c13015M32421.m32422("failcomplete"));
        } else {
            abstractC19728M51194 = null;
        }
        this.f63123 = abstractC19728M51194;
        EnumC5865.m17070(c4747);
        C21566 c21566 = new C21566(null, new C0771(), c3163M10345);
        this.f63112 = c21566;
        c21566.setStackTrace(new StackTraceElement[0]);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45167(final C19571 c19571, AbstractC11781 abstractC11781) {
        AbstractC17425 abstractC17425 = c19571.f63110;
        C11518 c11518 = c19571.f63109;
        EnumC13603 enumC13603 = abstractC11781.f38066;
        if (enumC13603 == EnumC13603.f43213) {
            try {
                C24550 c24550 = (C24550) abstractC11781;
                abstractC17425.mo39423(c24550, EnumC10712.CLASS_READER);
                c11518.m29004();
                c24550.f79576 = new C14654((AbstractC11781) c24550);
                m45163(c24550.f38069);
                c19571.m45168(c24550);
                c19571.m45173(c24550);
                c11518.m29002();
                abstractC17425.mo39422();
            } catch (Throwable th) {
                c11518.m29002();
                abstractC17425.mo39422();
                throw th;
            }
        } else if (enumC13603 == EnumC13603.f43219) {
            try {
                c19571.m45164((C14106) abstractC11781);
            } catch (IOException e) {
                C21566 c21566 = new C21566(abstractC11781, new Supplier() { // from class: l.ۡ᩺᩺
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        C19991 c19991 = this.f31356.f63106;
                        String localizedMessage = e.getLocalizedMessage();
                        C15515 c15515 = C19859.f63823;
                        return c19991.m45975(new C15515("compiler", "exception.message", localizedMessage));
                    }
                }, c19571.f63115);
                c21566.m49042(e);
                throw c21566;
            }
        }
        if (c19571.f63124.f35201) {
            return;
        }
        c11518.m29000();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45163(AbstractC11781 abstractC11781) {
        if (abstractC11781.f38066 != EnumC13603.f43219) {
            m45163(abstractC11781.f38069);
        }
        abstractC11781.mo29590();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m45168(C24550 c24550) {
        AbstractC11781 abstractC11781 = c24550.f38069;
        if (abstractC11781.f38066 == EnumC13603.f43219) {
            for (AbstractC19728 abstractC19728 : C21901.m49595(C21901.m49594(c24550.f38072))) {
                AbstractC11781 abstractC11781Mo7474 = abstractC11781.mo29571().mo7474(abstractC19728, (Predicate) null);
                if (abstractC11781Mo7474 == null) {
                    abstractC11781Mo7474 = this.f63121.m35523(c24550.m29564().f44618, AbstractC22970.m51842(abstractC19728, abstractC11781));
                }
                if (abstractC11781Mo7474 != null) {
                    abstractC11781Mo7474.mo29590();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.function.Supplier, l.۠᩺᩺] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45173(final C24550 c24550) {
        C11172 c11172 = this.f63124;
        AbstractC19728 abstractC19728 = c24550.f79577;
        C3163 c3163 = this.f63115;
        if (this.f63123 == abstractC19728) {
            throw new C21566(c24550, new Supplier() { // from class: l.ᩳ᩺᩺
                @Override // java.util.function.Supplier
                public final Object get() {
                    return this.f62754.f63106.m45975(C19859.f63816);
                }
            }, c3163);
        }
        InterfaceC15976 interfaceC15976 = c24550.f79575;
        if (interfaceC15976 != null) {
            InterfaceC15976 interfaceC15977 = this.f63120;
            AbstractC11781 abstractC11781 = c24550.f38069;
            try {
                try {
                    if (c11172.f35201) {
                        C11972.m30024("Filling " + interfaceC15976.toUri() + " during " + interfaceC15977);
                        throw null;
                    }
                    this.f63120 = interfaceC15976;
                    if (this.f63125) {
                        this.f63126.m20044("loading", interfaceC15976.getName());
                    }
                    if (interfaceC15976.mo10885() == EnumC17468.CLASS) {
                        c11172.m28129(c24550);
                        c24550.f38071 = c24550.f38071;
                    } else if (!this.f63107.mo11630()) {
                        this.f63107.mo11629(c24550);
                    } else {
                        throw new IllegalStateException("Source completer required to read " + interfaceC15976.toUri());
                    }
                    this.f63120 = interfaceC15977;
                    return;
                } catch (C10620 e) {
                    c24550.f38069 = abstractC11781;
                    AbstractC17836 abstractC17836 = c24550.f79576;
                    C10465 c10465 = new C10465();
                    abstractC17836.getClass();
                    C4937.forEach(abstractC17836.mo7472(c10465, EnumC13908.RECURSIVE), new C1517());
                    c24550.f79577 = abstractC19728;
                    c24550.f38072 = C21901.m49594(abstractC19728);
                    c24550.m54833();
                    throw e;
                }
            } catch (Throwable th) {
                this.f63120 = interfaceC15977;
                throw th;
            }
        }
        ?? r0 = new Supplier() { // from class: l.۠᩺᩺
            @Override // java.util.function.Supplier
            public final Object get() {
                C19991 c19991 = this.f29265.f63106;
                AbstractC19728 abstractC19729 = c24550.f79578;
                C15515 c15515 = C19859.f63823;
                return c19991.m45975(new C15515("compiler", "class.file.not.found", abstractC19729));
            }
        };
        if (!this.f63122) {
            throw new C21566(c24550, r0, c3163);
        }
        C21566 c21566 = this.f63112;
        c21566.f68881 = c24550;
        c21566.m49043((C8974) r0);
        throw c21566;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24550 m45172(final C2920 c2920, final AbstractC19728 abstractC19728) {
        C11972.m30021(c2920);
        AbstractC19728 abstractC19728M45429 = abstractC19728.m45429(0, abstractC19728.m45427((byte) 46));
        C14764 c14764 = this.f63121;
        C14106 c14106M35526 = c14764.m35526(c2920, abstractC19728M45429);
        C11972.m30022(c14106M35526.f44618, new Supplier() { // from class: l.۟᩺᩺
            @Override // java.util.function.Supplier
            public final Object get() {
                return "msym=" + c2920 + "; flatName=" + ((Object) abstractC19728);
            }
        });
        boolean z = c14764.m35523(c14106M35526.f44618, abstractC19728) == null;
        C24550 c24550M35517 = c14764.m35517(c14106M35526.f44618, abstractC19728);
        if (c24550M35517.f79576 != null) {
            return c24550M35517;
        }
        try {
            c24550M35517.mo29590();
            return c24550M35517;
        } catch (C21566 e) {
            if (z) {
                c14764.m35524(c14106M35526.f44618, abstractC19728);
                e.f68882.m10348(c24550M35517);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15976 m45171(InterfaceC15976 interfaceC15976, InterfaceC15976 interfaceC15977) {
        if (this.f63117) {
            return interfaceC15976.mo10885() == EnumC17468.SOURCE ? interfaceC15976 : interfaceC15977;
        }
        return interfaceC15976.mo10890() > interfaceC15977.mo10890() ? interfaceC15976 : interfaceC15977;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m45166(C14106 c14106, boolean z) {
        char c;
        EnumC17468 enumC17468 = EnumC17468.CLASS;
        EnumC17468 enumC17469 = EnumC17468.SOURCE;
        EnumSet enumSetOf = EnumSet.of(enumC17468, enumC17469);
        EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) enumSetOf);
        enumSetCopyOf.remove(enumC17469);
        boolean zIsEmpty = enumSetCopyOf.isEmpty();
        EnumSet enumSetCopyOf2 = EnumSet.copyOf((Collection) enumSetOf);
        enumSetCopyOf2.remove(enumC17468);
        boolean zIsEmpty2 = enumSetCopyOf2.isEmpty();
        InterfaceC16722 interfaceC16722 = this.f63113;
        boolean z2 = z && interfaceC16722.mo6989(EnumC6282.SOURCE_PATH);
        if (this.f63125 && this.f63108) {
            this.f63108 = false;
            if (interfaceC16722 instanceof InterfaceC20452) {
                InterfaceC20452 interfaceC20452 = (InterfaceC20452) interfaceC16722;
                C7312 c7312 = this.f63126;
                if (!z2 || zIsEmpty2) {
                    if (!zIsEmpty2) {
                        C14769 c14769M35543 = C14769.m35543();
                        Iterator it = interfaceC20452.mo6992(EnumC6282.CLASS_PATH).iterator();
                        while (it.hasNext()) {
                            c14769M35543 = c14769M35543.m35552((InterfaceC24329) it.next());
                        }
                        c7312.m20044("sourcepath", c14769M35543.m35554().m35545(","));
                    }
                    c = 0;
                } else {
                    C14769 c14769M35544 = C14769.m35543();
                    Iterator it2 = interfaceC20452.mo6992(EnumC6282.SOURCE_PATH).iterator();
                    while (it2.hasNext()) {
                        c14769M35544 = c14769M35544.m35552((InterfaceC24329) it2.next());
                    }
                    c = 0;
                    c7312.m20044("sourcepath", c14769M35544.m35554().m35545(","));
                }
                if (!zIsEmpty) {
                    C14769 c14769M35545 = C14769.m35543();
                    Iterator it3 = interfaceC20452.mo6992(EnumC6282.PLATFORM_CLASS_PATH).iterator();
                    while (it3.hasNext()) {
                        c14769M35545 = c14769M35545.m35552((InterfaceC24329) it3.next());
                    }
                    Iterator it4 = interfaceC20452.mo6992(EnumC6282.CLASS_PATH).iterator();
                    while (it4.hasNext()) {
                        c14769M35545 = c14769M35545.m35552((InterfaceC24329) it4.next());
                    }
                    Object[] objArr = new Object[1];
                    objArr[c] = c14769M35545.m35554().m35545(",");
                    c7312.m20044("classpath", objArr);
                }
            }
        }
        String string = c14106.f44619.toString();
        if (!zIsEmpty2 && !z2) {
            InterfaceC24928 interfaceC24928 = EnumC6282.CLASS_PATH;
            m45165(c14106, interfaceC24928, m45169(interfaceC24928, c14106, string, enumSetOf));
            return;
        }
        if (!zIsEmpty) {
            InterfaceC24928 interfaceC24929 = EnumC6282.CLASS_PATH;
            m45165(c14106, interfaceC24929, m45169(interfaceC24929, c14106, string, enumSetCopyOf));
        }
        if (zIsEmpty2) {
            return;
        }
        InterfaceC24928 interfaceC249210 = EnumC6282.SOURCE_PATH;
        m45165(c14106, interfaceC249210, m45169(interfaceC249210, c14106, string, enumSetCopyOf2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m45164(final C14106 c14106) {
        AbstractC17836 abstractC17836 = c14106.f44616;
        AbstractC19728 abstractC19728 = c14106.f44619;
        if (abstractC17836 == null) {
            c14106.f44616 = new C2175(c14106);
        }
        C2920 c2920 = c14106.f44618;
        C11972.m30022(c2920, new Supplier() { // from class: l.ۖ᩺᩺
            @Override // java.util.function.Supplier
            public final Object get() {
                return c14106.toString();
            }
        });
        c2920.mo29590();
        if (c2920 == this.f63121.f48278) {
            this.f63119 = false;
            if (this.f63111) {
                m45166(c14106, true);
                this.f63119 = true;
                InterfaceC24928 interfaceC24928 = EnumC6282.PLATFORM_CLASS_PATH;
                m45165(c14106, interfaceC24928, m45169(interfaceC24928, c14106, abstractC19728.toString(), EnumSet.of(EnumC17468.CLASS)));
                return;
            }
            InterfaceC24928 interfaceC24929 = EnumC6282.PLATFORM_CLASS_PATH;
            m45165(c14106, interfaceC24929, m45169(interfaceC24929, c14106, abstractC19728.toString(), EnumSet.of(EnumC17468.CLASS)));
            m45166(c14106, true);
            return;
        }
        if (c2920.f9548 != EnumC6282.CLASS_PATH) {
            EnumC17468 enumC17468 = EnumC17468.CLASS;
            EnumC17468 enumC17469 = EnumC17468.SOURCE;
            EnumSet enumSetOf = EnumSet.of(enumC17468, enumC17469);
            EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) enumSetOf);
            enumSetCopyOf.remove(enumC17469);
            boolean zIsEmpty = enumSetCopyOf.isEmpty();
            EnumSet enumSetCopyOf2 = EnumSet.copyOf((Collection) enumSetOf);
            enumSetCopyOf2.remove(enumC17468);
            boolean zIsEmpty2 = enumSetCopyOf2.isEmpty();
            String string = abstractC19728.toString();
            InterfaceC24928 interfaceC249210 = c2920.f9548;
            InterfaceC24928 interfaceC249211 = c2920.f9542;
            InterfaceC24928 interfaceC249212 = c2920.f9549;
            InterfaceC24928 interfaceC249213 = c2920.f9559;
            boolean z = this.f63119;
            try {
                this.f63119 = false;
                if (!zIsEmpty && interfaceC249213 != null) {
                    m45165(c14106, interfaceC249213, m45169(interfaceC249213, c14106, string, enumSetCopyOf));
                }
                if ((!zIsEmpty || !zIsEmpty2) && interfaceC249212 != null) {
                    EnumSet enumSetNoneOf = EnumSet.noneOf(EnumC17468.class);
                    enumSetNoneOf.addAll(enumSetCopyOf);
                    enumSetNoneOf.addAll(enumSetCopyOf2);
                    m45165(c14106, interfaceC249212, m45169(interfaceC249212, c14106, string, enumSetNoneOf));
                }
                this.f63119 = true;
                if (!zIsEmpty && interfaceC249210 != null) {
                    m45165(c14106, interfaceC249210, m45169(interfaceC249210, c14106, string, enumSetCopyOf));
                }
                if (!zIsEmpty2 && interfaceC249211 != null) {
                    m45165(c14106, interfaceC249211, m45169(interfaceC249211, c14106, string, enumSetCopyOf2));
                }
                return;
            } finally {
                this.f63119 = z;
            }
        }
        m45166(c14106, c2920.f9542 == EnumC6282.SOURCE_PATH);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m45165(C14106 c14106, InterfaceC24928 interfaceC24928, C7483 c7483) {
        C24550 c24550M35518;
        InterfaceC15976 interfaceC15976;
        this.f63116 = interfaceC24928;
        Iterator it = c7483.iterator();
        while (true) {
            C14194 c14194 = (C14194) it;
            if (!c14194.hasNext()) {
                return;
            }
            InterfaceC15976 interfaceC15977 = (InterfaceC15976) c14194.next();
            int i = C4655.f16455[interfaceC15977.mo10885().ordinal()];
            if (i == 2 || i == 3) {
                InterfaceC24928 interfaceC24929 = this.f63116;
                InterfaceC16722 interfaceC16722 = this.f63113;
                String strMo6978 = interfaceC16722.mo6978(interfaceC24929, interfaceC15977);
                String strSubstring = strMo6978.substring(strMo6978.lastIndexOf(".") + 1);
                if (EnumC21704.m49266(strSubstring) || strSubstring.equals("package-info")) {
                    if ((c14106.f38071 & X931RNG.BLOCK128_RESEED_MAX) == 0) {
                        for (AbstractC11781 abstractC11781 = c14106; abstractC11781 != null && abstractC11781.f38066 == EnumC13603.f43219; abstractC11781 = abstractC11781.f38069) {
                            abstractC11781.f38071 |= X931RNG.BLOCK128_RESEED_MAX;
                        }
                    }
                    int i2 = interfaceC15977.mo10885() == EnumC17468.CLASS ? 33554432 : 67108864;
                    String strMo6979 = interfaceC16722.mo6978(this.f63116, interfaceC15977);
                    String strSubstring2 = strMo6979.substring(strMo6979.lastIndexOf(".") + 1);
                    C15252 c15252 = this.f63118;
                    AbstractC19728 abstractC19728M51194 = c15252.f49864.m51194(strSubstring2);
                    boolean z = abstractC19728M51194 == c15252.f49860;
                    if (z) {
                        c24550M35518 = c14106.f44617;
                    } else {
                        c24550M35518 = (C24550) ((C2175) c14106.f44616).m7483(abstractC19728M51194, null).f15400;
                    }
                    if (c24550M35518 == null) {
                        c24550M35518 = this.f63121.m35518(c14106.f44618, abstractC19728M51194, c14106);
                        if (c24550M35518.f79575 == null) {
                            c24550M35518.f79575 = interfaceC15977;
                        }
                        if (z) {
                            c14106.f44617 = c24550M35518;
                        } else if (c24550M35518.f38069 == c14106) {
                            c14106.f44616.mo7481(c24550M35518);
                        }
                    } else if (!this.f63119 && (interfaceC15976 = c24550M35518.f79575) != null) {
                        long j = c24550M35518.f38071;
                        if ((((long) i2) & j) == 0 && (j & 100663296) != 0) {
                            c24550M35518.f79575 = m45171(interfaceC15977, interfaceC15976);
                        }
                    }
                    c24550M35518.f38071 = ((long) i2) | c24550M35518.f38071;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7483 m45169(InterfaceC24928 interfaceC24928, C14106 c14106, String str, EnumSet enumSet) {
        return new C7483(this, this.f63113.mo6977(interfaceC24928, str, (Set) EnumSet.allOf(EnumC17468.class), false), c14106, enumSet);
    }
}
