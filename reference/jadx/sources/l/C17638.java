package l;

import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ܽܰ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: N7KG */
/* JADX INFO: loaded from: classes4.dex */
public final class C17638 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C13477 f57986 = new C13477();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f57987;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final HashSet f57988 = new HashSet();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C15400 f57989;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final EnumC20820 f57990;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C4812 f57991;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final HashMap f57992;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f57993;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C7312 f57994;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17638 m41289(C4747 c4747) {
        C17638 c17638 = (C17638) c4747.m14643(f57986);
        return c17638 == null ? new C17638(c4747) : c17638;
    }

    public C17638(C4747 c4747) {
        c4747.m14646(f57986, this);
        C13015 c13015M32421 = C13015.m32421(c4747);
        this.f57987 = c13015M32421.m32433(EnumC7687.f25322);
        C7312 c7312M20023 = C7312.m20023(c4747);
        this.f57994 = c7312M20023;
        C15400 c15400M36873 = C15400.m36873(c4747);
        this.f57989 = c15400M36873;
        EnumC20820 enumC20820M47625 = EnumC20820.m47625(c4747);
        this.f57990 = enumC20820M47625;
        EnumC19876 enumC19876 = EnumC19876.PREVIEW;
        this.f57991 = new C4812(c7312M20023, enumC20820M47625, c15400M36873.m36878(enumC19876), "preview", enumC19876);
        this.f57993 = c13015M32421.m32432("forcePreview");
        HashMap map = new HashMap();
        for (EnumC16305 enumC16305 : EnumC16305.values()) {
            int i = enumC16305.f52943;
            EnumC20820 enumC20820M47624 = EnumC20820.m47624(enumC16305.f52944);
            if (enumC20820M47624 != null) {
                map.put(Integer.valueOf(i), enumC20820M47624);
            }
        }
        this.f57992 = map;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m41298() {
        this.f57988.add(this.f57994.m20046());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41293(InterfaceC5075 interfaceC5075, C25213 c25213) {
        this.f57991.m14840(interfaceC5075, c25213);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m41296(InterfaceC15976 interfaceC15976) {
        return this.f57988.contains(interfaceC15976);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41292(InterfaceC5075 interfaceC5075, EnumC3666 enumC3666) {
        C25213 c25213;
        C11972.m30026(this.f57987);
        C11972.m30026(m41300(enumC3666));
        if (this.f57989.m36879(EnumC19876.PREVIEW)) {
            return;
        }
        this.f57988.add(this.f57994.m20046());
        if (enumC3666.m11914()) {
            C15515 c15515M11917 = enumC3666.m11917();
            C25213 c25214 = C13146.f42046;
            c25213 = new C25213("compiler", "preview.feature.use.plural", c15515M11917);
        } else {
            C15515 c15515M11918 = enumC3666.m11917();
            C25213 c25215 = C13146.f42046;
            c25213 = new C25213("compiler", "preview.feature.use", c15515M11918);
        }
        this.f57991.m14840(interfaceC5075, c25213);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m41295() {
        return this.f57987;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m41299(InterfaceC15976 interfaceC15976, int i) {
        C11972.m30026(this.f57987);
        EnumC19876 enumC19876 = EnumC19876.PREVIEW;
        if (this.f57989.m36878(enumC19876)) {
            HashSet hashSet = this.f57988;
            C7312 c7312 = this.f57994;
            hashSet.add(c7312.m20046());
            String str = ((EnumC20820) this.f57992.get(Integer.valueOf(i))).f66685;
            C25213 c25213 = C13146.f42046;
            c7312.m34527(enumC19876, (InterfaceC5075) null, new C25213("compiler", "preview.feature.use.classfile", interfaceC15976, str));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m41300(EnumC3666 enumC3666) {
        int i = C16892.f55247[enumC3666.ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        return this.f57993;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11040 m41290(EnumC3666 enumC3666) {
        C11972.m30026(!this.f57987);
        if (enumC3666.m11914()) {
            C15515 c15515M11917 = enumC3666.m11917();
            C11040 c11040 = C22843.f74058;
            return new C11040("compiler", "preview.feature.disabled.plural", c15515M11917);
        }
        C15515 c15515M11918 = enumC3666.m11917();
        C11040 c11041 = C22843.f74058;
        return new C11040("compiler", "preview.feature.disabled", c15515M11918);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11040 m41291(InterfaceC15976 interfaceC15976, int i) {
        C11972.m30026(!this.f57987);
        String str = ((EnumC20820) this.f57992.get(Integer.valueOf(i))).f66685;
        C11040 c11040 = C22843.f74058;
        return new C11040("compiler", "preview.feature.disabled.classfile", interfaceC15976, str);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m41297() {
        this.f57991.m14839();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41294(AbstractC22295 abstractC22295, EnumC3666 enumC3666) {
        boolean zM41300 = m41300(enumC3666);
        C7312 c7312 = this.f57994;
        boolean z = this.f57987;
        if (zM41300 && !z) {
            c7312.m34523(EnumC6984.SOURCE_LEVEL, abstractC22295, m41290(enumC3666));
            return;
        }
        EnumC20820 enumC20820 = this.f57990;
        if (!enumC3666.m11915(enumC20820)) {
            c7312.m34523(EnumC6984.SOURCE_LEVEL, abstractC22295, enumC3666.m11913(enumC20820.f66685));
        }
        if (z && m41300(enumC3666)) {
            m41292((InterfaceC5075) abstractC22295, enumC3666);
        }
    }
}
