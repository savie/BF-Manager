package l;

import java.util.logging.Logger;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field '֡' uses external variables
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
/* JADX INFO: renamed from: l.ۢܺܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes3.dex */
public abstract class EnumC9693 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final EnumC9693 f32659;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC9693 f32660;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final EnumC9693[] f32661;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final EnumC9693 f32662;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final int f32663 = 2;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC9693 f32664;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC9693 f32665;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final int f32666 = 4;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC9693[] f32667;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC9693 f32668;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC9693 f32669;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final int f32670 = 1;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final EnumC9693 f32671;

    /* JADX INFO: renamed from: ۙ */
    public abstract InterfaceC0769 mo6265(C18283 c18283, Object obj, int i, InterfaceC0769 interfaceC0769);

    public EnumC9693(String str, int i) {
        super(str, i);
    }

    public /* synthetic */ EnumC9693(String str, int i, C8987 c8987) {
        this(str, i);
    }

    public static EnumC9693 valueOf(String str) {
        return (EnumC9693) Enum.valueOf(EnumC9693.class, str);
    }

    public static EnumC9693[] values() {
        return (EnumC9693[]) f32667.clone();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC9693[] m24657() {
        return new EnumC9693[]{f32659, f32668, f32669, f32665, f32662, f32664, f32660, f32671};
    }

    static {
        final String str = "STRONG";
        final int i = 0;
        EnumC9693 enumC9693 = new EnumC9693(str, i) { // from class: l.ܽܺܶ
            {
                C8987 c8987 = null;
            }

            @Override // l.EnumC9693
            /* JADX INFO: renamed from: ۙ */
            public InterfaceC0769 mo6265(C18283 c18283, Object obj, int i2, InterfaceC0769 interfaceC0769) {
                return new C16167(obj, i2, interfaceC0769);
            }
        };
        f32659 = enumC9693;
        final String str2 = "STRONG_ACCESS";
        final int i2 = 1;
        EnumC9693 enumC9694 = new EnumC9693(str2, i2) { // from class: l.۫ܺܶ
            {
                C8987 c8987 = null;
            }

            @Override // l.EnumC9693
            /* JADX INFO: renamed from: ۙ */
            public InterfaceC0769 mo6265(C18283 c18283, Object obj, int i3, InterfaceC0769 interfaceC0769) {
                C7700 c7700 = new C7700(obj, i3, interfaceC0769);
                c7700.f25481 = C17492.FOREVER_NS;
                EnumC15462 enumC15462 = EnumC15462.INSTANCE;
                c7700.f25482 = enumC15462;
                c7700.f25480 = enumC15462;
                return c7700;
            }

            @Override // l.EnumC9693
            /* JADX INFO: renamed from: ۙ */
            public InterfaceC0769 mo6266(C18283 c18283, InterfaceC0769 interfaceC0769, InterfaceC0769 interfaceC07610, Object obj) {
                InterfaceC0769 interfaceC0769Mo6266 = super.mo6266(c18283, interfaceC0769, interfaceC07610, obj);
                m24658(interfaceC0769, interfaceC0769Mo6266);
                return interfaceC0769Mo6266;
            }
        };
        f32668 = enumC9694;
        final String str3 = "STRONG_WRITE";
        final int i3 = 2;
        EnumC9693 enumC9695 = new EnumC9693(str3, i3) { // from class: l.ܿܺܶ
            {
                C8987 c8987 = null;
            }

            @Override // l.EnumC9693
            /* JADX INFO: renamed from: ۙ */
            public InterfaceC0769 mo6265(C18283 c18283, Object obj, int i4, InterfaceC0769 interfaceC0769) {
                C0643 c0643 = new C0643(obj, i4, interfaceC0769);
                c0643.f2756 = C17492.FOREVER_NS;
                EnumC15462 enumC15462 = EnumC15462.INSTANCE;
                c0643.f2757 = enumC15462;
                c0643.f2758 = enumC15462;
                return c0643;
            }

            @Override // l.EnumC9693
            /* JADX INFO: renamed from: ۙ */
            public InterfaceC0769 mo6266(C18283 c18283, InterfaceC0769 interfaceC0769, InterfaceC0769 interfaceC07610, Object obj) {
                InterfaceC0769 interfaceC0769Mo6266 = super.mo6266(c18283, interfaceC0769, interfaceC07610, obj);
                m24659(interfaceC0769, interfaceC0769Mo6266);
                return interfaceC0769Mo6266;
            }
        };
        f32669 = enumC9695;
        final String str4 = "STRONG_ACCESS_WRITE";
        final int i4 = 3;
        EnumC9693 enumC9696 = new EnumC9693(str4, i4) { // from class: l.ۛܺܶ
            {
                C8987 c8987 = null;
            }

            @Override // l.EnumC9693
            /* JADX INFO: renamed from: ۙ */
            public InterfaceC0769 mo6265(C18283 c18283, Object obj, int i5, InterfaceC0769 interfaceC0769) {
                C21105 c21105 = new C21105(obj, i5, interfaceC0769);
                c21105.f68748 = C17492.FOREVER_NS;
                EnumC15462 enumC15462 = EnumC15462.INSTANCE;
                c21105.f68750 = enumC15462;
                c21105.f68747 = enumC15462;
                c21105.f68749 = C17492.FOREVER_NS;
                c21105.f68746 = enumC15462;
                c21105.f68751 = enumC15462;
                return c21105;
            }

            @Override // l.EnumC9693
            /* JADX INFO: renamed from: ۙ */
            public InterfaceC0769 mo6266(C18283 c18283, InterfaceC0769 interfaceC0769, InterfaceC0769 interfaceC07610, Object obj) {
                InterfaceC0769 interfaceC0769Mo6266 = super.mo6266(c18283, interfaceC0769, interfaceC07610, obj);
                m24658(interfaceC0769, interfaceC0769Mo6266);
                m24659(interfaceC0769, interfaceC0769Mo6266);
                return interfaceC0769Mo6266;
            }
        };
        f32665 = enumC9696;
        final String str5 = "WEAK";
        final int i5 = 4;
        EnumC9693 enumC9697 = new EnumC9693(str5, i5) { // from class: l.ۧܺܶ
            {
                C8987 c8987 = null;
            }

            @Override // l.EnumC9693
            /* JADX INFO: renamed from: ۙ */
            public InterfaceC0769 mo6265(C18283 c18283, Object obj, int i6, InterfaceC0769 interfaceC0769) {
                return new C23928(i6, interfaceC0769, obj, c18283.f58333);
            }
        };
        f32662 = enumC9697;
        final String str6 = "WEAK_ACCESS";
        final int i6 = 5;
        EnumC9693 enumC9698 = new EnumC9693(str6, i6) { // from class: l.᩻ܺܶ
            {
                C8987 c8987 = null;
            }

            @Override // l.EnumC9693
            /* JADX INFO: renamed from: ۙ */
            public InterfaceC0769 mo6265(C18283 c18283, Object obj, int i7, InterfaceC0769 interfaceC0769) {
                C6288 c6288 = new C6288(i7, interfaceC0769, obj, c18283.f58333);
                c6288.f21293 = C17492.FOREVER_NS;
                EnumC15462 enumC15462 = EnumC15462.INSTANCE;
                c6288.f21292 = enumC15462;
                c6288.f21294 = enumC15462;
                return c6288;
            }

            @Override // l.EnumC9693
            /* JADX INFO: renamed from: ۙ */
            public InterfaceC0769 mo6266(C18283 c18283, InterfaceC0769 interfaceC0769, InterfaceC0769 interfaceC07610, Object obj) {
                InterfaceC0769 interfaceC0769Mo6266 = super.mo6266(c18283, interfaceC0769, interfaceC07610, obj);
                m24658(interfaceC0769, interfaceC0769Mo6266);
                return interfaceC0769Mo6266;
            }
        };
        f32664 = enumC9698;
        final String str7 = "WEAK_WRITE";
        final int i7 = 6;
        EnumC9693 enumC9699 = new EnumC9693(str7, i7) { // from class: l.ܳܺܶ
            {
                C8987 c8987 = null;
            }

            @Override // l.EnumC9693
            /* JADX INFO: renamed from: ۙ */
            public InterfaceC0769 mo6265(C18283 c18283, Object obj, int i8, InterfaceC0769 interfaceC0769) {
                C2054 c2054 = new C2054(i8, interfaceC0769, obj, c18283.f58333);
                c2054.f7634 = C17492.FOREVER_NS;
                EnumC15462 enumC15462 = EnumC15462.INSTANCE;
                c2054.f7633 = enumC15462;
                c2054.f7632 = enumC15462;
                return c2054;
            }

            @Override // l.EnumC9693
            /* JADX INFO: renamed from: ۙ */
            public InterfaceC0769 mo6266(C18283 c18283, InterfaceC0769 interfaceC0769, InterfaceC0769 interfaceC07610, Object obj) {
                InterfaceC0769 interfaceC0769Mo6266 = super.mo6266(c18283, interfaceC0769, interfaceC07610, obj);
                m24659(interfaceC0769, interfaceC0769Mo6266);
                return interfaceC0769Mo6266;
            }
        };
        f32660 = enumC9699;
        final String str8 = "WEAK_ACCESS_WRITE";
        final int i8 = 7;
        EnumC9693 enumC96910 = new EnumC9693(str8, i8) { // from class: l.֫ܺܶ
            {
                C8987 c8987 = null;
            }

            @Override // l.EnumC9693
            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public InterfaceC0769 mo6265(C18283 c18283, Object obj, int i9, InterfaceC0769 interfaceC0769) {
                C11228 c11228 = new C11228(i9, interfaceC0769, obj, c18283.f58333);
                c11228.f37997 = C17492.FOREVER_NS;
                EnumC15462 enumC15462 = EnumC15462.INSTANCE;
                c11228.f37996 = enumC15462;
                c11228.f37994 = enumC15462;
                c11228.f37999 = C17492.FOREVER_NS;
                c11228.f37998 = enumC15462;
                c11228.f37995 = enumC15462;
                return c11228;
            }

            @Override // l.EnumC9693
            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public InterfaceC0769 mo6266(C18283 c18283, InterfaceC0769 interfaceC0769, InterfaceC0769 interfaceC07610, Object obj) {
                InterfaceC0769 interfaceC0769Mo6266 = super.mo6266(c18283, interfaceC0769, interfaceC07610, obj);
                m24658(interfaceC0769, interfaceC0769Mo6266);
                m24659(interfaceC0769, interfaceC0769Mo6266);
                return interfaceC0769Mo6266;
            }
        };
        f32671 = enumC96910;
        f32667 = m24657();
        f32661 = new EnumC9693[]{enumC9693, enumC9694, enumC9695, enumC9696, enumC9697, enumC9698, enumC9699, enumC96910};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC9693 m24656(EnumC10523 enumC10523, boolean z, boolean z2) {
        return f32661[((enumC10523 == EnumC10523.f36021 ? (char) 4 : (char) 0) | (z ? 1 : 0) ? 1 : 0) | (z2 ? 2 : 0)];
    }

    /* JADX INFO: renamed from: ۙ */
    public InterfaceC0769 mo6266(C18283 c18283, InterfaceC0769 interfaceC0769, InterfaceC0769 interfaceC07610, Object obj) {
        return mo6265(c18283, obj, interfaceC0769.getHash(), interfaceC07610);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m24658(InterfaceC0769 interfaceC0769, InterfaceC0769 interfaceC07610) {
        interfaceC07610.mo3301(interfaceC0769.mo3306());
        InterfaceC0769 interfaceC0769Mo3300 = interfaceC0769.mo3300();
        Logger logger = ConcurrentMapC21937.f71142;
        interfaceC0769Mo3300.mo3305(interfaceC07610);
        interfaceC07610.mo3302(interfaceC0769Mo3300);
        InterfaceC0769 interfaceC0769Mo3299 = interfaceC0769.mo3299();
        interfaceC07610.mo3305(interfaceC0769Mo3299);
        interfaceC0769Mo3299.mo3302(interfaceC07610);
        EnumC15462 enumC15462 = EnumC15462.INSTANCE;
        interfaceC0769.mo3305(enumC15462);
        interfaceC0769.mo3302(enumC15462);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void m24659(InterfaceC0769 interfaceC0769, InterfaceC0769 interfaceC07610) {
        interfaceC07610.mo2937(interfaceC0769.mo2936());
        InterfaceC0769 interfaceC0769Mo2935 = interfaceC0769.mo2935();
        Logger logger = ConcurrentMapC21937.f71142;
        interfaceC0769Mo2935.mo2938(interfaceC07610);
        interfaceC07610.mo2934(interfaceC0769Mo2935);
        InterfaceC0769 interfaceC0769Mo2939 = interfaceC0769.mo2939();
        interfaceC07610.mo2938(interfaceC0769Mo2939);
        interfaceC0769Mo2939.mo2934(interfaceC07610);
        EnumC15462 enumC15462 = EnumC15462.INSTANCE;
        interfaceC0769.mo2938(enumC15462);
        interfaceC0769.mo2934(enumC15462);
    }
}
