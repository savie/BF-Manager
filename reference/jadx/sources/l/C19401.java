package l;

import java.util.List;

/* JADX INFO: renamed from: l.ᩳ᩺ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A797 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19401 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f62694;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public byte f62695;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public byte f62697;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f62698;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f62699;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String[] f62700 = C2993.f9726;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f62696 = true;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m44859(int i) {
        int i2;
        return (i & (-32)) == 0 && ((i & 8) == 0 || (i & 16) == 0) && (i2 = i & 7) >= 0 && i2 <= 4 && (i2 != 0 || (i & (-8)) == 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19401 m44857(C22737 c22737, String str) {
        C19401 c19401 = new C19401();
        c19401.f62698 = c22737.mo20397();
        List listMo20402 = c22737.mo20402();
        if (!listMo20402.isEmpty()) {
            c19401.f62700 = (String[]) listMo20402.toArray(new String[listMo20402.size()]);
        }
        if (EnumC2536.INTERFACE.m8459(c22737.mo20404())) {
            c19401.f62695 = (byte) 1;
        }
        for (InterfaceC8631 interfaceC8631 : c22737.m51268(true)) {
            if (C12688.m31482(interfaceC8631, str)) {
                c19401.m44858(interfaceC8631.mo13184(), false, C2993.m9769(interfaceC8631));
            }
        }
        for (InterfaceC8631 interfaceC8632 : c22737.m51271(true)) {
            if (C12688.m31482(interfaceC8632, str)) {
                c19401.m44858(interfaceC8632.mo13184(), true, C2993.m9769(interfaceC8632));
            }
        }
        return c19401;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19401 m44856(C7468 c7468) {
        C19401 c19401 = new C19401();
        c19401.f62698 = c7468.f24721;
        String[] strArr = (String[]) c7468.f24723.clone();
        if (strArr.length == 0) {
            strArr = C2993.f9726;
        }
        c19401.f62700 = strArr;
        int i = c7468.f24720;
        if ((i & (-2)) != 0) {
            throw new IllegalArgumentException("Invalid class flags");
        }
        c19401.f62695 = (byte) i;
        int i2 = c7468.f24724;
        if (!m44859(i2)) {
            throw new IllegalArgumentException("Invalid target method flags");
        }
        c19401.f62697 = (byte) i2;
        c19401.f62699 = true;
        c19401.f62696 = c7468.f24722;
        return c19401;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m44858(int i, boolean z, boolean z2) {
        int i2;
        int i3;
        if (z) {
            i2 = z2 ? 2 : 1;
        } else {
            i2 = z2 ? 4 : 3;
        }
        if (EnumC2536.PUBLIC.m8459(i)) {
            i3 = 8;
        } else {
            i3 = EnumC2536.PROTECTED.m8459(i) ? 16 : 0;
        }
        this.f62697 = (byte) (i3 | i2);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m44866() {
        return (this.f62695 & 1) != 0;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m44867() {
        return this.f62699;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m44869() {
        return this.f62699 && !this.f62696;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m44868() {
        int i = this.f62697 & 7;
        return i == 1 || i == 2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m44862() {
        int i = this.f62697 & 7;
        return i == 3 || i == 4;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m44864() {
        int i = this.f62697 & 7;
        return i == 2 || i == 4;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m44863() {
        return (this.f62697 & 8) != 0;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m44865() {
        return (this.f62697 & 16) != 0;
    }
}
