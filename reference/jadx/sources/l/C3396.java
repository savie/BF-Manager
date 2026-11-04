package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۗۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: MBG3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3396 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8112 f11047;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C7366 f11048;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C23534 f11049;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C19299 f11050;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C16646 f11051;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C12345 f11052;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ void m11121(C3396 c3396, String str) {
        c3396.m11118(str);
        throw null;
    }

    public C3396(C12345 c12345, C19299 c19299, C16646 c16646) {
        if (c16646 == null) {
            throw new NullPointerException("dexOptions == null");
        }
        this.f11052 = c12345;
        this.f11047 = c19299.m44667();
        this.f11050 = c19299;
        this.f11048 = c19299.m44662();
        this.f11049 = new C23534(this);
        this.f11051 = c16646;
        if (!c19299.m44665() || c16646.m39356(24)) {
            return;
        }
        m11124(String.format("defining a %s interface method requires --min-sdk-version >= %d (currently %d) for interface methods: %s.%s", c19299.m44666() ? "static" : "default", 24, Integer.valueOf(c16646.f53790), c19299.mo8782().mo1843(), c19299.mo8780().mo1843()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11126(C12586 c12586, C1400 c1400) {
        int iM31293 = c12586.m31293();
        C23534 c23534 = this.f11049;
        c23534.m52741(c1400);
        try {
            int iM31296 = c12586.m31296();
            while (iM31296 < iM31293) {
                int iM21998 = this.f11047.m21998(iM31296, c23534);
                c23534.m52740(iM31296);
                iM31296 += iM21998;
            }
        } catch (C16074 e) {
            c1400.m5117(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16074 m11117() {
        return new C16074("stack mismatch: illegal top-of-stack for opcode", null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5085 m11115(C5085 c5085, C5085 c5086) {
        C5085 c5087;
        C5085 c5088 = C5085.f17762;
        if (c5086 == c5088) {
            return c5085.m15374() ? c5088 : c5085.m15377();
        }
        if (c5085 == C5085.f17733 && c5086.m15369() && c5086.m15378().m15374()) {
            return c5086;
        }
        return (c5085 == C5085.f17740 && c5086 == (c5087 = C5085.f17742)) ? c5087 : c5085.m15377();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11122(C3396 c3396, AbstractC13487 abstractC13487) {
        C16646 c16646 = c3396.f11051;
        if (c16646.m39356(28)) {
            return;
        }
        c3396.m11118(String.format("invalid constant type %s requires --min-sdk-version >= %d (currently %d)", abstractC13487.mo1845(), 28, Integer.valueOf(c16646.f53790)));
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11119(C3396 c3396, int i) {
        C16646 c16646 = c3396.f11051;
        if (c16646.m39356(26)) {
            return;
        }
        c3396.m11118(String.format("invalid opcode %02x - invokedynamic requires --min-sdk-version >= %d (currently %d)", Integer.valueOf(i), 26, Integer.valueOf(c16646.f53790)));
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11120(C3396 c3396, int i, C18181 c18181) {
        C16646 c16646 = c3396.f11051;
        if (i == 185 || c16646.m39356(24)) {
            return;
        }
        boolean zM39356 = c16646.f53789;
        if (i == 184) {
            zM39356 &= c16646.m39356(21);
        }
        String str = i == 184 ? "static" : "default";
        if (zM39356) {
            c3396.m11124(String.format("invoking a %s interface method %s.%s strictly requires --min-sdk-version >= %d (experimental at current API level %d)", str, c18181.m34884().mo1843(), c18181.m34885().mo1843(), 24, Integer.valueOf(c16646.f53790)));
        } else {
            c3396.m11118(String.format("invoking a %s interface method %s.%s strictly requires --min-sdk-version >= %d (blocked at current API level %d)", str, c18181.m34884().mo1843(), c18181.m34885().mo1843(), 24, Integer.valueOf(c16646.f53790)));
            throw null;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m11125(C3396 c3396, int i) {
        C16646 c16646 = c3396.f11051;
        if (!c16646.m39356(26)) {
            c3396.m11118(String.format("invoking a signature-polymorphic requires --min-sdk-version >= %d (currently %d)", 26, Integer.valueOf(c16646.f53790)));
            throw null;
        }
        if (i == 182) {
            return;
        }
        c3396.m11118("Unsupported signature polymorphic invocation (" + C14823.m35694(i) + MotionUtils.EASING_TYPE_FORMAT_END);
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m11118(String str) {
        C19299 c19299 = this.f11050;
        StringBuilder sbM10406 = C3188.m10406("ERROR in ", c19299.mo8782().mo1843(), ".", c19299.mo8780().mo1843(), ": ");
        sbM10406.append(str);
        throw new C16074(sbM10406.toString(), null);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m11124(String str) {
        C19299 c19299 = this.f11050;
        StringBuilder sbM10406 = C3188.m10406("WARNING in ", c19299.mo8782().mo1843(), ".", c19299.mo8780().mo1843(), ": ");
        sbM10406.append(str);
        this.f11051.f53791.println(sbM10406.toString());
    }
}
