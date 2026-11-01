package l;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.ܳܳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: L78I */
/* JADX INFO: loaded from: classes4.dex */
public final class C14578 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C7149 f47693;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35050(C7149 c7149) {
        this.f47693 = c7149;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20555 m35048(C21956 c21956, String str, boolean z, C15283 c15283) throws Throwable {
        C5032 c5032 = (C5032) c21956.f71233.get(C21966.m48796(str));
        if (c5032 == null) {
            throw C2664.m8197(c21956.f71244, "");
        }
        C14911 c14911M42770 = c21956.f71235.m42770(c5032.f17548, c15283.m36595());
        String string = c14911M42770.f48689;
        if (c14911M42770.f48688) {
            m35051(c21956);
        }
        if (!z && string != null) {
            return new C20555(string, new LinkedHashMap(), new LinkedHashMap());
        }
        try {
            C7807 c7807M35045 = m35045(c21956, c5032);
            if (string == null) {
                C20424 c20424 = new C20424();
                C14795 c14795 = new C14795();
                C16191.m38283(new C2093(c14795), c7807M35045, c20424);
                string = c14795.toString();
            }
            return new C20555(string, z ? C22851.m50591(c7807M35045) : new LinkedHashMap(), z ? C22851.m50580(c7807M35045) : new LinkedHashMap());
        } catch (C12731 e) {
            throw e;
        } catch (Exception e2) {
            throw C12731.m31630("SMALI_READ_FAILED", e2.getMessage() == null ? "Failed to disassemble class" : e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7807 m35045(C21956 c21956, C5032 c5032) {
        return new C7807(c21956.m48786(c5032.f17547), c5032.f17546, c5032.f17545);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7807 m35047(C21956 c21956, C5032 c5032, C15283 c15283) {
        if (c15283 == null) {
            return m35045(c21956, c5032);
        }
        return new C7807(c15283.m36596(c21956.f71244, c5032.f17547, new C19078(this, c21956)), c5032.f17546, c5032.f17545);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7807 m35046(C21956 c21956, C5032 c5032, C17684 c17684) throws C12731 {
        try {
            C7807 c7807 = new C7807(c17684, c5032.f17546, c5032.f17545);
            if (C21966.m48798(c5032.f17548).equals(c7807.getType())) {
                return c7807;
            }
            throw C2664.m8200(c21956.f71219, c21956.f71236);
        } catch (C12731 e) {
            throw e;
        } catch (Exception unused) {
            throw C2664.m8200(c21956.f71219, c21956.f71236);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23750 m35049(C21956 c21956, C5032 c5032, C2093 c2093, C17358 c17358, C6443 c6443, C5146 c5146) throws Throwable {
        c2093.m6636();
        C14911 c14911M42769 = c21956.f71235.m42769(c5032.f17548, c2093, c17358, c6443);
        boolean z = c14911M42769.f48688;
        if (!c14911M42769.f48690) {
            try {
                C16191.m38283(c2093, m35046(c21956, c5032, c5146.m14299(c5032.f17547)), new C20424());
                return new C23750(z, true, null);
            } catch (C12731 e) {
                return new C23750(z, false, e);
            } catch (Exception e2) {
                return new C23750(z, false, C12731.m31630("SMALI_READ_FAILED", e2.getMessage() == null ? "Failed to disassemble class" : e2.getMessage()));
            }
        }
        return new C23750(z, false, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35051(C21956 c21956) {
        C7149 c7149 = this.f47693;
        if (c7149 != null) {
            c7149.m19077(c21956);
        }
    }
}
