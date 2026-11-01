package l;

import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: l.֫ᩴۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: N7KG */
/* JADX INFO: loaded from: classes2.dex */
public final class C2008 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final C16576 f7502 = new C16576();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final EnumC11909 f7503;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C20414 f7504;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f7505;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final HashMap f7506;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C16826 f7507;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final HashSet f7508 = new HashSet();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f7509;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C16886 f7510;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2008 m6467(C12343 c12343) {
        C2008 c2008 = (C2008) c12343.m30656(f7502);
        return c2008 == null ? new C2008(c12343) : c2008;
    }

    public C2008(C12343 c12343) {
        c12343.m30659(f7502, this);
        C14770 c14770M35395 = C14770.m35395(c12343);
        this.f7505 = c14770M35395.m35408(EnumC19730.f63323);
        C20414 c20414M46161 = C20414.m46161(c12343);
        this.f7504 = c20414M46161;
        C16826 c16826M39463 = C16826.m39463(c12343);
        this.f7507 = c16826M39463;
        EnumC11909 enumC11909M29706 = EnumC11909.m29706(c12343);
        this.f7503 = enumC11909M29706;
        EnumC0597 enumC0597 = EnumC0597.PREVIEW;
        this.f7510 = new C16886(c20414M46161, enumC11909M29706, c16826M39463.m39467(enumC0597), "preview", enumC0597);
        this.f7509 = c14770M35395.m35407("forcePreview");
        HashMap map = new HashMap();
        for (EnumC14128 enumC14128 : EnumC14128.values()) {
            int i = enumC14128.f46388;
            EnumC11909 enumC11909M29705 = EnumC11909.m29705(enumC14128.f46387);
            if (enumC11909M29705 != null) {
                map.put(Integer.valueOf(i), enumC11909M29705);
            }
        }
        this.f7506 = map;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m6476() {
        this.f7508.add(this.f7504.m46184());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6472(InterfaceC12260 interfaceC12260, C14065 c14065) {
        this.f7510.m39552(interfaceC12260, c14065);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m6474(InterfaceC2173 interfaceC2173) {
        return this.f7508.contains(interfaceC2173);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6471(InterfaceC12260 interfaceC12260, EnumC14026 enumC14026) {
        C14065 c14065;
        C6171.m17176(this.f7505);
        C6171.m17176(m6478(enumC14026));
        if (this.f7507.m39468(EnumC0597.PREVIEW)) {
            return;
        }
        this.f7508.add(this.f7504.m46184());
        if (enumC14026.m33944()) {
            C14377 c14377M33946 = enumC14026.m33946();
            C14065 c14066 = C9768.f32836;
            c14065 = new C14065("compiler", "preview.feature.use.plural", c14377M33946);
        } else {
            C14377 c14377M33947 = enumC14026.m33946();
            C14065 c14067 = C9768.f32836;
            c14065 = new C14065("compiler", "preview.feature.use", c14377M33947);
        }
        this.f7510.m39552(interfaceC12260, c14065);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m6473() {
        return this.f7505;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m6477(InterfaceC2173 interfaceC2173, int i) {
        C6171.m17176(this.f7505);
        EnumC0597 enumC0597 = EnumC0597.PREVIEW;
        if (this.f7507.m39467(enumC0597)) {
            HashSet hashSet = this.f7508;
            C20414 c20414 = this.f7504;
            hashSet.add(c20414.m46184());
            String str = ((EnumC11909) this.f7506.get(Integer.valueOf(i))).f39974;
            C14065 c14065 = C9768.f32836;
            c20414.m48194(enumC0597, (InterfaceC12260) null, new C14065("compiler", "preview.feature.use.classfile", interfaceC2173, str));
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m6478(EnumC14026 enumC14026) {
        int i = C14710.f48122[enumC14026.ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        return this.f7509;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5909 m6469(EnumC14026 enumC14026) {
        C6171.m17176(!this.f7505);
        if (enumC14026.m33944()) {
            C14377 c14377M33946 = enumC14026.m33946();
            C5909 c5909 = C23879.f77204;
            return new C5909("compiler", "preview.feature.disabled.plural", c14377M33946);
        }
        C14377 c14377M33947 = enumC14026.m33946();
        C5909 c59010 = C23879.f77204;
        return new C5909("compiler", "preview.feature.disabled", c14377M33947);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5909 m6468(InterfaceC2173 interfaceC2173, int i) {
        C6171.m17176(!this.f7505);
        String str = ((EnumC11909) this.f7506.get(Integer.valueOf(i))).f39974;
        C5909 c5909 = C23879.f77204;
        return new C5909("compiler", "preview.feature.disabled.classfile", interfaceC2173, str);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m6475() {
        this.f7510.m39551();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6470(AbstractC5930 abstractC5930, EnumC14026 enumC14026) {
        boolean zM6478 = m6478(enumC14026);
        C20414 c20414 = this.f7504;
        boolean z = this.f7505;
        if (zM6478 && !z) {
            c20414.m48193(EnumC0264.SOURCE_LEVEL, abstractC5930, m6469(enumC14026));
            return;
        }
        EnumC11909 enumC11909 = this.f7503;
        if (!enumC14026.m33945(enumC11909)) {
            c20414.m48193(EnumC0264.SOURCE_LEVEL, abstractC5930, enumC14026.m33943(enumC11909.f39974));
        }
        if (z && m6478(enumC14026)) {
            m6471((InterfaceC12260) abstractC5930, enumC14026);
        }
    }
}
