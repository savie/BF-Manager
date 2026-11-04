package l;

import java.util.logging.Logger;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ܿ' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: l.ۙۤܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes2.dex */
public abstract class EnumC4845 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final EnumC4845 f16918;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final EnumC4845 f16919;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final int f16920 = 4;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final int f16921 = 2;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final EnumC4845 f16922;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final EnumC4845 f16923;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final EnumC4845 f16924;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final EnumC4845 f16925;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final EnumC4845[] f16926;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC4845[] f16927;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC4845 f16928;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC4845 f16929;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final int f16930 = 1;

    /* JADX INFO: renamed from: ۙ */
    public abstract InterfaceC2213 mo5196(C3353 c3353, Object obj, int i, InterfaceC2213 interfaceC2213);

    public EnumC4845(String str, int i) {
        super(str, i);
    }

    public /* synthetic */ EnumC4845(String str, int i, C24566 c24566) {
        this(str, i);
    }

    public static EnumC4845 valueOf(String str) {
        return (EnumC4845) Enum.valueOf(EnumC4845.class, str);
    }

    public static EnumC4845[] values() {
        return (EnumC4845[]) f16927.clone();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC4845[] m14882() {
        return new EnumC4845[]{f16928, f16918, f16929, f16922, f16925, f16919, f16923, f16924};
    }

    static {
        final String str = "STRONG";
        final int i = 0;
        EnumC4845 enumC4845 = new EnumC4845(str, i) { // from class: l.ᩳ᩷ܽ
            {
                C24566 c24566 = null;
            }

            @Override // l.EnumC4845
            /* JADX INFO: renamed from: ۙ */
            public InterfaceC2213 mo5196(C3353 c3353, Object obj, int i2, InterfaceC2213 interfaceC2213) {
                return new C18269(obj, i2, interfaceC2213);
            }
        };
        f16928 = enumC4845;
        final String str2 = "STRONG_ACCESS";
        final int i2 = 1;
        EnumC4845 enumC4846 = new EnumC4845(str2, i2) { // from class: l.ۢ᩷ܽ
            {
                C24566 c24566 = null;
            }

            @Override // l.EnumC4845
            /* JADX INFO: renamed from: ۙ */
            public InterfaceC2213 mo5196(C3353 c3353, Object obj, int i3, InterfaceC2213 interfaceC2213) {
                C14539 c14539 = new C14539(obj, i3, interfaceC2213);
                c14539.f45738 = C25227.FOREVER_NS;
                EnumC16031 enumC16031 = EnumC16031.INSTANCE;
                c14539.f45740 = enumC16031;
                c14539.f45739 = enumC16031;
                return c14539;
            }

            @Override // l.EnumC4845
            /* JADX INFO: renamed from: ۙ */
            public InterfaceC2213 mo5197(C3353 c3353, InterfaceC2213 interfaceC2213, InterfaceC2213 interfaceC2214, Object obj) {
                InterfaceC2213 interfaceC2213Mo5197 = super.mo5197(c3353, interfaceC2213, interfaceC2214, obj);
                m14883(interfaceC2213, interfaceC2213Mo5197);
                return interfaceC2213Mo5197;
            }
        };
        f16918 = enumC4846;
        final String str3 = "STRONG_WRITE";
        final int i3 = 2;
        EnumC4845 enumC4847 = new EnumC4845(str3, i3) { // from class: l.֨᩷ܽ
            {
                C24566 c24566 = null;
            }

            @Override // l.EnumC4845
            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public InterfaceC2213 mo5196(C3353 c3353, Object obj, int i4, InterfaceC2213 interfaceC2213) {
                C7828 c7828 = new C7828(obj, i4, interfaceC2213);
                c7828.f26097 = C25227.FOREVER_NS;
                EnumC16031 enumC16031 = EnumC16031.INSTANCE;
                c7828.f26096 = enumC16031;
                c7828.f26098 = enumC16031;
                return c7828;
            }

            @Override // l.EnumC4845
            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public InterfaceC2213 mo5197(C3353 c3353, InterfaceC2213 interfaceC2213, InterfaceC2213 interfaceC2214, Object obj) {
                InterfaceC2213 interfaceC2213Mo5197 = super.mo5197(c3353, interfaceC2213, interfaceC2214, obj);
                m14884(interfaceC2213, interfaceC2213Mo5197);
                return interfaceC2213Mo5197;
            }
        };
        f16929 = enumC4847;
        final String str4 = "STRONG_ACCESS_WRITE";
        final int i4 = 3;
        EnumC4845 enumC4848 = new EnumC4845(str4, i4) { // from class: l.ۡ᩷ܽ
            {
                C24566 c24566 = null;
            }

            @Override // l.EnumC4845
            /* JADX INFO: renamed from: ۙ */
            public InterfaceC2213 mo5196(C3353 c3353, Object obj, int i5, InterfaceC2213 interfaceC2213) {
                C21253 c21253 = new C21253(obj, i5, interfaceC2213);
                c21253.f67808 = C25227.FOREVER_NS;
                EnumC16031 enumC16031 = EnumC16031.INSTANCE;
                c21253.f67811 = enumC16031;
                c21253.f67806 = enumC16031;
                c21253.f67807 = C25227.FOREVER_NS;
                c21253.f67810 = enumC16031;
                c21253.f67809 = enumC16031;
                return c21253;
            }

            @Override // l.EnumC4845
            /* JADX INFO: renamed from: ۙ */
            public InterfaceC2213 mo5197(C3353 c3353, InterfaceC2213 interfaceC2213, InterfaceC2213 interfaceC2214, Object obj) {
                InterfaceC2213 interfaceC2213Mo5197 = super.mo5197(c3353, interfaceC2213, interfaceC2214, obj);
                m14883(interfaceC2213, interfaceC2213Mo5197);
                m14884(interfaceC2213, interfaceC2213Mo5197);
                return interfaceC2213Mo5197;
            }
        };
        f16922 = enumC4848;
        final String str5 = "WEAK";
        final int i5 = 4;
        EnumC4845 enumC4849 = new EnumC4845(str5, i5) { // from class: l.ۖ᩷ܽ
            {
                C24566 c24566 = null;
            }

            @Override // l.EnumC4845
            /* JADX INFO: renamed from: ۙ */
            public InterfaceC2213 mo5196(C3353 c3353, Object obj, int i6, InterfaceC2213 interfaceC2213) {
                return new C8573(i6, interfaceC2213, obj, c3353.f10951);
            }
        };
        f16925 = enumC4849;
        final String str6 = "WEAK_ACCESS";
        final int i6 = 5;
        EnumC4845 enumC48410 = new EnumC4845(str6, i6) { // from class: l.۠᩷ܽ
            {
                C24566 c24566 = null;
            }

            @Override // l.EnumC4845
            /* JADX INFO: renamed from: ۙ */
            public InterfaceC2213 mo5196(C3353 c3353, Object obj, int i7, InterfaceC2213 interfaceC2213) {
                C9318 c9318 = new C9318(i7, interfaceC2213, obj, c3353.f10951);
                c9318.f30282 = C25227.FOREVER_NS;
                EnumC16031 enumC16031 = EnumC16031.INSTANCE;
                c9318.f30283 = enumC16031;
                c9318.f30284 = enumC16031;
                return c9318;
            }

            @Override // l.EnumC4845
            /* JADX INFO: renamed from: ۙ */
            public InterfaceC2213 mo5197(C3353 c3353, InterfaceC2213 interfaceC2213, InterfaceC2213 interfaceC2214, Object obj) {
                InterfaceC2213 interfaceC2213Mo5197 = super.mo5197(c3353, interfaceC2213, interfaceC2214, obj);
                m14883(interfaceC2213, interfaceC2213Mo5197);
                return interfaceC2213Mo5197;
            }
        };
        f16919 = enumC48410;
        final String str7 = "WEAK_WRITE";
        final int i7 = 6;
        EnumC4845 enumC48411 = new EnumC4845(str7, i7) { // from class: l.ۜ᩷ܽ
            {
                C24566 c24566 = null;
            }

            @Override // l.EnumC4845
            /* JADX INFO: renamed from: ۙ */
            public InterfaceC2213 mo5196(C3353 c3353, Object obj, int i8, InterfaceC2213 interfaceC2213) {
                C13793 c13793 = new C13793(i8, interfaceC2213, obj, c3353.f10951);
                c13793.f43762 = C25227.FOREVER_NS;
                EnumC16031 enumC16031 = EnumC16031.INSTANCE;
                c13793.f43760 = enumC16031;
                c13793.f43761 = enumC16031;
                return c13793;
            }

            @Override // l.EnumC4845
            /* JADX INFO: renamed from: ۙ */
            public InterfaceC2213 mo5197(C3353 c3353, InterfaceC2213 interfaceC2213, InterfaceC2213 interfaceC2214, Object obj) {
                InterfaceC2213 interfaceC2213Mo5197 = super.mo5197(c3353, interfaceC2213, interfaceC2214, obj);
                m14884(interfaceC2213, interfaceC2213Mo5197);
                return interfaceC2213Mo5197;
            }
        };
        f16923 = enumC48411;
        final String str8 = "WEAK_ACCESS_WRITE";
        final int i8 = 7;
        EnumC4845 enumC48412 = new EnumC4845(str8, i8) { // from class: l.۬᩷ܽ
            {
                C24566 c24566 = null;
            }

            @Override // l.EnumC4845
            /* JADX INFO: renamed from: ۙ */
            public InterfaceC2213 mo5196(C3353 c3353, Object obj, int i9, InterfaceC2213 interfaceC2213) {
                C2607 c2607 = new C2607(i9, interfaceC2213, obj, c3353.f10951);
                c2607.f8372 = C25227.FOREVER_NS;
                EnumC16031 enumC16031 = EnumC16031.INSTANCE;
                c2607.f8374 = enumC16031;
                c2607.f8376 = enumC16031;
                c2607.f8375 = C25227.FOREVER_NS;
                c2607.f8377 = enumC16031;
                c2607.f8373 = enumC16031;
                return c2607;
            }

            @Override // l.EnumC4845
            /* JADX INFO: renamed from: ۙ */
            public InterfaceC2213 mo5197(C3353 c3353, InterfaceC2213 interfaceC2213, InterfaceC2213 interfaceC2214, Object obj) {
                InterfaceC2213 interfaceC2213Mo5197 = super.mo5197(c3353, interfaceC2213, interfaceC2214, obj);
                m14883(interfaceC2213, interfaceC2213Mo5197);
                m14884(interfaceC2213, interfaceC2213Mo5197);
                return interfaceC2213Mo5197;
            }
        };
        f16924 = enumC48412;
        f16927 = m14882();
        f16926 = new EnumC4845[]{enumC4845, enumC4846, enumC4847, enumC4848, enumC4849, enumC48410, enumC48411, enumC48412};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC4845 m14881(EnumC4099 enumC4099, boolean z, boolean z2) {
        return f16926[((enumC4099 == EnumC4099.f13961 ? (char) 4 : (char) 0) | (z ? 1 : 0) ? 1 : 0) | (z2 ? 2 : 0)];
    }

    /* JADX INFO: renamed from: ۙ */
    public InterfaceC2213 mo5197(C3353 c3353, InterfaceC2213 interfaceC2213, InterfaceC2213 interfaceC2214, Object obj) {
        return mo5196(c3353, obj, interfaceC2213.getHash(), interfaceC2214);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m14883(InterfaceC2213 interfaceC2213, InterfaceC2213 interfaceC2214) {
        interfaceC2214.mo7545(interfaceC2213.mo7556());
        InterfaceC2213 interfaceC2213Mo7544 = interfaceC2213.mo7544();
        Logger logger = ConcurrentMapC5942.f20333;
        interfaceC2213Mo7544.mo7553(interfaceC2214);
        interfaceC2214.mo7546(interfaceC2213Mo7544);
        InterfaceC2213 interfaceC2213Mo7551 = interfaceC2213.mo7551();
        interfaceC2214.mo7553(interfaceC2213Mo7551);
        interfaceC2213Mo7551.mo7546(interfaceC2214);
        EnumC16031 enumC16031 = EnumC16031.INSTANCE;
        interfaceC2213.mo7553(enumC16031);
        interfaceC2213.mo7546(enumC16031);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void m14884(InterfaceC2213 interfaceC2213, InterfaceC2213 interfaceC2214) {
        interfaceC2214.mo7548(interfaceC2213.mo7550());
        InterfaceC2213 interfaceC2213Mo7543 = interfaceC2213.mo7543();
        Logger logger = ConcurrentMapC5942.f20333;
        interfaceC2213Mo7543.mo7549(interfaceC2214);
        interfaceC2214.mo7555(interfaceC2213Mo7543);
        InterfaceC2213 interfaceC2213Mo7554 = interfaceC2213.mo7554();
        interfaceC2214.mo7549(interfaceC2213Mo7554);
        interfaceC2213Mo7554.mo7555(interfaceC2214);
        EnumC16031 enumC16031 = EnumC16031.INSTANCE;
        interfaceC2213.mo7549(enumC16031);
        interfaceC2213.mo7555(enumC16031);
    }
}
