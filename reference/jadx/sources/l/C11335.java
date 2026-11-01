package l;

import java.io.Writer;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: renamed from: l.ۧ᩻᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 74H5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11335 extends AbstractC15381 implements InterfaceC17822 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C7807 f38238;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int f38239;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10975 f38240;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f38241;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f38242;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C17684 f38243;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f38244;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f38245;

    public C11335(C17684 c17684, C18825 c18825, C7807 c7807, int i, InterfaceC9510 interfaceC9510, int i2) {
        this.f38243 = c17684;
        this.f38238 = c7807;
        c18825.getClass();
        int iM43441 = c18825.m43441() + i;
        this.f38244 = iM43441;
        this.f38242 = c18825.m43449();
        this.f38245 = interfaceC9510.seekTo(iM43441);
        this.f38240 = null;
        this.f38239 = i2;
    }

    public C11335(C17684 c17684, C18825 c18825, C7807 c7807, int i, AbstractC14967 abstractC14967, InterfaceC9510 interfaceC9510, int i2) {
        this.f38243 = c17684;
        this.f38238 = c7807;
        c18825.getClass();
        int iM43441 = c18825.m43441() + i;
        this.f38244 = iM43441;
        this.f38242 = c18825.m43449();
        this.f38245 = interfaceC9510.seekTo(iM43441);
        abstractC14967.mo17702();
        this.f38240 = abstractC14967.mo17703();
        this.f38239 = i2;
    }

    @Override // l.InterfaceC18735
    public final String getName() {
        C17684 c17684 = this.f38243;
        return c17684.m41168(c17684.m41166().mo9809(m28395() + 4));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28396(Writer writer) {
        C17684 c17684 = this.f38243;
        c17684.m41171(c17684.m41166().mo9809(m28395() + 4), writer, false);
    }

    @Override // l.InterfaceC18735
    public final String getType() {
        C17684 c17684 = this.f38243;
        return c17684.m41204(c17684.m41166().m42183(m28395() + 2));
    }

    @Override // l.InterfaceC18735
    /* JADX INFO: renamed from: ᩹ */
    public final String mo1183() {
        return this.f38238.getType();
    }

    @Override // l.InterfaceC17822
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int mo28400() {
        return this.f38242;
    }

    @Override // l.InterfaceC17822
    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10975 mo28399() {
        return this.f38240;
    }

    @Override // l.InterfaceC17822
    public final Set getAnnotations() {
        return AbstractC13556.m33143(this.f38243, this.f38245);
    }

    @Override // l.InterfaceC17822
    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final Set mo28398() {
        int i = this.f38239;
        if (i == 7) {
            return AbstractC23844.of();
        }
        return EnumSet.copyOf((Collection) EnumC18763.m43321(i));
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private int m28395() {
        if (this.f38241 == 0) {
            this.f38241 = this.f38243.m41190(this.f38244);
        }
        return this.f38241;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m28397(C11335 c11335, boolean z) {
        String type = getType();
        if (!this.f38238.getType().equals(c11335.f38238.getType()) || !getName().equals(c11335.getName()) || !type.equals(c11335.getType())) {
            return false;
        }
        int i = c11335.f38242;
        int i2 = this.f38242;
        if (i2 != i) {
            return false;
        }
        if ((this.f38245 != 0 || c11335.f38245 != 0) && !C12076.m30044(getAnnotations(), c11335.getAnnotations())) {
            return false;
        }
        if ((this.f38239 != 7 || c11335.f38239 != 7) && !C12076.m30044(mo28398(), c11335.mo28398())) {
            return false;
        }
        InterfaceC10975 interfaceC10975 = c11335.f38240;
        InterfaceC10975 interfaceC10976 = this.f38240;
        if (C13638.equals(interfaceC10976, interfaceC10975)) {
            return true;
        }
        if (interfaceC10976 == null) {
            return C0909.m3625(type).equals(interfaceC10975);
        }
        if (interfaceC10975 == null) {
            return C0909.m3625(type).equals(interfaceC10976);
        }
        return z && EnumC15236.STATIC.m36501(i2) && (interfaceC10976 instanceof InterfaceC9564) && (((InterfaceC9564) interfaceC10976).getValue() >>> 24) == 127 && (interfaceC10975 instanceof InterfaceC9564) && (((InterfaceC9564) interfaceC10975).getValue() >>> 24) == 127;
    }
}
