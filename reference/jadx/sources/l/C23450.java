package l;

import java.util.List;

/* JADX INFO: renamed from: l.᩻ۘ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: A797 */
/* JADX INFO: loaded from: classes.dex */
public final class C23450 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f75943;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f75944;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public byte f75945;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f75946;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public byte f75947;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String[] f75942 = C2987.f11198;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f75941 = true;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m51672(int i) {
        int i2;
        return (i & (-32)) == 0 && ((i & 8) == 0 || (i & 16) == 0) && (i2 = i & 7) >= 0 && i2 <= 4 && (i2 != 0 || (i & (-8)) == 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23450 m51669(C7807 c7807, String str) {
        C23450 c23450 = new C23450();
        c23450.f75944 = c7807.mo20494();
        List listMo20500 = c7807.mo20500();
        if (!listMo20500.isEmpty()) {
            c23450.f75942 = (String[]) listMo20500.toArray(new String[listMo20500.size()]);
        }
        if (EnumC15236.INTERFACE.m36501(c7807.mo20491())) {
            c23450.f75945 = (byte) 1;
        }
        for (InterfaceC18528 interfaceC18528 : c7807.m20492(true)) {
            if (C20627.m46497(interfaceC18528, str)) {
                c23450.m51671(interfaceC18528.mo25750(), false, C2987.m8918(interfaceC18528));
            }
        }
        for (InterfaceC18528 interfaceC18529 : c7807.m20499(true)) {
            if (C20627.m46497(interfaceC18529, str)) {
                c23450.m51671(interfaceC18529.mo25750(), true, C2987.m8918(interfaceC18529));
            }
        }
        return c23450;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23450 m51670(C13655 c13655) {
        C23450 c23450 = new C23450();
        c23450.f75944 = c13655.f45024;
        String[] strArr = (String[]) c13655.f45025.clone();
        if (strArr.length == 0) {
            strArr = C2987.f11198;
        }
        c23450.f75942 = strArr;
        int i = c13655.f45022;
        if ((i & (-2)) != 0) {
            throw new IllegalArgumentException("Invalid class flags");
        }
        c23450.f75945 = (byte) i;
        int i2 = c13655.f45021;
        if (!m51672(i2)) {
            throw new IllegalArgumentException("Invalid target method flags");
        }
        c23450.f75947 = (byte) i2;
        c23450.f75946 = true;
        c23450.f75941 = c13655.f45023;
        return c23450;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m51671(int i, boolean z, boolean z2) {
        int i2;
        int i3;
        if (z) {
            i2 = z2 ? 2 : 1;
        } else {
            i2 = z2 ? 4 : 3;
        }
        if (EnumC15236.PUBLIC.m36501(i)) {
            i3 = 8;
        } else {
            i3 = EnumC15236.PROTECTED.m36501(i) ? 16 : 0;
        }
        this.f75947 = (byte) (i3 | i2);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m51682() {
        return (this.f75945 & 1) != 0;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m51678() {
        return this.f75946;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m51676() {
        return this.f75946 && !this.f75941;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m51681() {
        int i = this.f75947 & 7;
        return i == 1 || i == 2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m51677() {
        int i = this.f75947 & 7;
        return i == 3 || i == 4;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m51679() {
        int i = this.f75947 & 7;
        return i == 2 || i == 4;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m51680() {
        return (this.f75947 & 8) != 0;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m51675() {
        return (this.f75947 & 16) != 0;
    }
}
