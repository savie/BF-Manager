package l;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.۫ۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L78I */
/* JADX INFO: loaded from: classes4.dex */
public final class C12887 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C2446 f41217;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31929(C2446 c2446) {
        this.f41217 = c2446;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8412 m31926(C14069 c14069, String str, boolean z, C4156 c4156) throws C10186 {
        C23330 c23330 = (C23330) c14069.f44552.get(C3192.m10507(str));
        if (c23330 == null) {
            throw C18723.m43532(c14069.f44556, "");
        }
        C21092 c21092M20896 = c14069.f44543.m20896(c23330.f75565, c4156.m13310());
        String strM31667 = c21092M20896.f67377;
        if (c21092M20896.f67376) {
            m31930(c14069);
        }
        if (!z && strM31667 != null) {
            return new C8412(strM31667, new LinkedHashMap(), new LinkedHashMap());
        }
        try {
            C22737 c22737M31924 = m31924(c14069, c23330);
            if (strM31667 == null) {
                strM31667 = C12777.m31667(c22737M31924);
            }
            return new C8412(strM31667, z ? C12777.m31668(c22737M31924) : new LinkedHashMap(), z ? C12777.m31665(c22737M31924) : new LinkedHashMap());
        } catch (C10186 e) {
            throw e;
        } catch (Exception e2) {
            throw C10186.m26305("SMALI_READ_FAILED", e2.getMessage() == null ? "Failed to disassemble class" : e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22737 m31924(C14069 c14069, C23330 c23330) {
        return new C22737(c14069.m34232(c23330.f75564), c23330.f75563, c23330.f75566);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22737 m31928(C14069 c14069, C23330 c23330, C4156 c4156) {
        if (c4156 == null) {
            return m31924(c14069, c23330);
        }
        return new C22737(c4156.m13311(c14069.f44556, c23330.f75564, new C19600(this, c14069)), c23330.f75563, c23330.f75566);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22737 m31925(C14069 c14069, C23330 c23330, C24975 c24975) throws C10186 {
        try {
            C22737 c22737 = new C22737(c24975, c23330.f75563, c23330.f75566);
            if (C3192.m10509(c23330.f75565).equals(c22737.getType())) {
                return c22737;
            }
            throw C18723.m43535(c14069.f44548, c14069.f44531);
        } catch (C10186 e) {
            throw e;
        } catch (Exception unused) {
            throw C18723.m43535(c14069.f44548, c14069.f44531);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15124 m31927(C14069 c14069, C23330 c23330, C0560 c0560, C21105 c21105, C3938 c3938, C21617 c21617) {
        c0560.m2567();
        C21092 c21092M20895 = c14069.f44543.m20895(c23330.f75565, c0560, c21105, c3938);
        boolean z = c21092M20895.f67376;
        if (c21092M20895.f67378) {
            return new C15124(z, false, null);
        }
        try {
            C12777.m31666(m31925(c14069, c23330, c21617.m49140(c23330.f75564)), c0560);
            return new C15124(z, true, null);
        } catch (C10186 e) {
            return new C15124(z, false, e);
        } catch (Exception e2) {
            return new C15124(z, false, C10186.m26305("SMALI_READ_FAILED", e2.getMessage() == null ? "Failed to disassemble class" : e2.getMessage()));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31930(C14069 c14069) {
        C2446 c2446 = this.f41217;
        if (c2446 != null) {
            c2446.m8268(c14069);
        }
    }
}
