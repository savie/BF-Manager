package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ᩴۖܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: MBG3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18471 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C19177 f58864;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16624 f58865;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C12391 f58866;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C1806 f58867;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C6559 f58868;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C17765 f58869;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ void m42838(C18471 c18471, String str) {
        c18471.m42835(str);
        throw null;
    }

    public C18471(C19177 c19177, C12391 c12391, C6559 c6559) {
        if (c6559 == null) {
            throw new NullPointerException("dexOptions == null");
        }
        this.f58864 = c19177;
        this.f58865 = c12391.m30822();
        this.f58866 = c12391;
        this.f58867 = c12391.m30820();
        this.f58869 = new C17765(this);
        this.f58868 = c6559;
        if (!c12391.m30826() || c6559.m17799(24)) {
            return;
        }
        m42841(String.format("defining a %s interface method requires --min-sdk-version >= %d (currently %d) for interface methods: %s.%s", c12391.m30827() ? "static" : "default", 24, Integer.valueOf(c6559.f22101), c12391.mo30828().mo2376(), c12391.mo30825().mo2376()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42843(C19446 c19446, C6040 c6040) {
        int iM44493 = c19446.m44493();
        C17765 c17765 = this.f58869;
        c17765.m41333(c6040);
        try {
            int iM44491 = c19446.m44491();
            while (iM44491 < iM44493) {
                int iM39089 = this.f58865.m39089(iM44491, c17765);
                c17765.m41332(iM44491);
                iM44491 += iM39089;
            }
        } catch (C21293 e) {
            c6040.m16387(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21293 m42834() {
        return new C21293("stack mismatch: illegal top-of-stack for opcode", null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3320 m42833(C3320 c3320, C3320 c3321) {
        C3320 c3322;
        C3320 c3323 = C3320.f12286;
        if (c3321 == c3323) {
            return c3320.m9829() ? c3323 : c3320.m9839();
        }
        if (c3320 == C3320.f12289 && c3321.m9838() && c3321.m9843().m9829()) {
            return c3321;
        }
        return (c3320 == C3320.f12258 && c3321 == (c3322 = C3320.f12293)) ? c3322 : c3320.m9839();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42839(C18471 c18471, AbstractC9901 abstractC9901) {
        C6559 c6559 = c18471.f58868;
        if (c6559.m17799(28)) {
            return;
        }
        c18471.m42835(String.format("invalid constant type %s requires --min-sdk-version >= %d (currently %d)", abstractC9901.mo2375(), 28, Integer.valueOf(c6559.f22101)));
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42836(C18471 c18471, int i) {
        C6559 c6559 = c18471.f58868;
        if (c6559.m17799(26)) {
            return;
        }
        c18471.m42835(String.format("invalid opcode %02x - invokedynamic requires --min-sdk-version >= %d (currently %d)", Integer.valueOf(i), 26, Integer.valueOf(c6559.f22101)));
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42837(C18471 c18471, int i, C20255 c20255) {
        C6559 c6559 = c18471.f58868;
        if (i == 185 || c6559.m17799(24)) {
            return;
        }
        boolean zM17799 = c6559.f22100;
        if (i == 184) {
            zM17799 &= c6559.m17799(21);
        }
        String str = i == 184 ? "static" : "default";
        if (zM17799) {
            c18471.m42841(String.format("invoking a %s interface method %s.%s strictly requires --min-sdk-version >= %d (experimental at current API level %d)", str, c20255.m47134().mo2376(), c20255.m47133().mo2376(), 24, Integer.valueOf(c6559.f22101)));
        } else {
            c18471.m42835(String.format("invoking a %s interface method %s.%s strictly requires --min-sdk-version >= %d (blocked at current API level %d)", str, c20255.m47134().mo2376(), c20255.m47133().mo2376(), 24, Integer.valueOf(c6559.f22101)));
            throw null;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m42842(C18471 c18471, int i) {
        C6559 c6559 = c18471.f58868;
        if (!c6559.m17799(26)) {
            c18471.m42835(String.format("invoking a signature-polymorphic requires --min-sdk-version >= %d (currently %d)", 26, Integer.valueOf(c6559.f22101)));
            throw null;
        }
        if (i == 182) {
            return;
        }
        c18471.m42835("Unsupported signature polymorphic invocation (" + C20857.m46881(i) + MotionUtils.EASING_TYPE_FORMAT_END);
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m42835(String str) {
        C12391 c12391 = this.f58866;
        StringBuilder sbM30515 = C12278.m30515("ERROR in ", c12391.mo30828().mo2376(), ".", c12391.mo30825().mo2376(), ": ");
        sbM30515.append(str);
        throw new C21293(sbM30515.toString(), null);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m42841(String str) {
        C12391 c12391 = this.f58866;
        StringBuilder sbM30515 = C12278.m30515("WARNING in ", c12391.mo30828().mo2376(), ".", c12391.mo30825().mo2376(), ": ");
        sbM30515.append(str);
        this.f58868.f22102.println(sbM30515.toString());
    }
}
