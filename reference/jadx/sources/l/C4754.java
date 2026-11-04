package l;

import android.text.TextUtils;
import java.io.IOException;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* JADX INFO: renamed from: l.ۙ۟۫, reason: contains not printable characters */
/* JADX INFO: compiled from: R9JP */
/* JADX INFO: loaded from: classes2.dex */
public final class C4754 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f16702 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C16378 f16703 = new C16378(new C9754(), new C21622());

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12828 m14660(boolean z, EnumC13484 enumC13484, EnumC2298 enumC2298) {
        EnumC13484 enumC13485 = EnumC13484.DEFAULT_SIGNED;
        if (enumC13484 != enumC13485 && enumC2298 != EnumC2298.SMB2_ONLY) {
            throw new IllegalArgumentException("Unsigned SMB mode requires SMB2 dialects");
        }
        C15065 c15065M31815 = C12828.m31815();
        c15065M31815.m36313();
        if (enumC2298 == EnumC2298.SMB2_ONLY) {
            c15065M31815.m36304(false);
            c15065M31815.m36305(EnumC15700.SMB_2_1, EnumC15700.SMB_2_0_2);
        } else {
            c15065M31815.m36304(true);
            if (enumC2298 == EnumC2298.SMB3_ONLY) {
                c15065M31815.m36305(EnumC15700.SMB_3_1_1, EnumC15700.SMB_3_0_2, EnumC15700.SMB_3_0);
            }
        }
        if (enumC13484 != enumC13485) {
            c15065M31815.m36307(false);
            c15065M31815.m36308();
            if (enumC13484 == EnumC13484.SMB2_GUEST_UNSIGNED_COMPAT) {
                c15065M31815.m36309();
            }
        }
        if (z) {
            c15065M31815.m36312(true);
        }
        return c15065M31815.m36296();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m14669(C9973 c9973) {
        for (EnumC2298 enumC2298 : EnumC2298.values()) {
            for (EnumC13484 enumC13484 : EnumC13484.values()) {
                if (enumC13484 == EnumC13484.DEFAULT_SIGNED || enumC2298 == EnumC2298.SMB2_ONLY) {
                    f16703.m38872(new C9009(c9973, enumC13484, enumC2298));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0806 m14656(C9973 c9973, EnumC2298 enumC2298, boolean z, boolean z2) {
        IOException e;
        C16378 c16378 = f16703;
        if (!z2 || enumC2298 == EnumC2298.SMB3_ONLY) {
            e = null;
        } else {
            try {
                return m14655(new C9009(c9973, EnumC13484.SMB2_GUEST_UNSIGNED_COMPAT, EnumC2298.SMB2_ONLY));
            } catch (IOException e2) {
                e = e2;
                c16378.m38872(new C9009(c9973, EnumC13484.SMB2_GUEST_UNSIGNED_COMPAT, EnumC2298.SMB2_ONLY));
            }
        }
        if (z && enumC2298 != EnumC2298.SMB3_ONLY) {
            try {
                return m14655(new C9009(c9973, EnumC13484.SMB2_UNSIGNED, EnumC2298.SMB2_ONLY));
            } catch (IOException unused) {
                c16378.m38872(new C9009(c9973, EnumC13484.SMB2_UNSIGNED, EnumC2298.SMB2_ONLY));
            }
        }
        try {
            return m14655(new C9009(c9973, EnumC13484.DEFAULT_SIGNED, enumC2298));
        } catch (IOException e3) {
            if (enumC2298 == EnumC2298.SMB3_ONLY || !m14666(c9973, e3)) {
                throw e3;
            }
            try {
                return m14655(new C9009(c9973, EnumC13484.SMB2_GUEST_UNSIGNED_COMPAT, EnumC2298.SMB2_ONLY));
            } catch (IOException e4) {
                m14661(e4, e3);
                if (e != null) {
                    m14661(e4, e);
                }
                throw e4;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0806 m14655(C9009 c9009) throws IOException {
        try {
            return (C0806) f16703.m38870(c9009);
        } catch (Exception e) {
            if (e instanceof IOException) {
                throw ((IOException) e);
            }
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                IOException iOException = (IOException) cause;
                C22327.m50389(iOException);
                throw iOException;
            }
            throw new IOException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14663(C9973 c9973, C1642 c1642, EnumC2298 enumC2298, C6259 c6259) throws Exception {
        try {
            m14664(c9973, c1642, EnumC13484.DEFAULT_SIGNED, enumC2298, c6259);
        } catch (Exception e) {
            if (enumC2298 == EnumC2298.SMB3_ONLY || !m14666(c9973, e)) {
                throw e;
            }
            try {
                m14664(c9973, c1642, EnumC13484.SMB2_GUEST_UNSIGNED_COMPAT, EnumC2298.SMB2_ONLY, c6259);
            } catch (Exception e2) {
                m14661(e2, e);
                throw e2;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14664(C9973 c9973, C1642 c1642, EnumC13484 enumC13484, EnumC2298 enumC2298, C6259 c6259) {
        C19541 c19541 = new C19541(m14660(false, enumC13484, enumC2298));
        C21033 c21033 = null;
        try {
            C21033 c21033M45076 = c19541.m45076(c9973.f32072, c9973.f32073);
            if ((enumC13484 == EnumC13484.SMB2_UNSIGNED) && c21033M45076.m48067().m42059()) {
                throw new IOException("SMB server requires signing");
            }
            new C19650(EnumC7717.f25429.m21000(c21033M45076.m48059(c1642))).m45299(((C9973) c6259.f21234).f32073);
            try {
                c21033M45076.m48064(true);
            } catch (IOException unused) {
            }
            C20244.m46520(c19541);
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    c21033.m48064(true);
                } catch (IOException unused2) {
                }
            }
            C20244.m46520(c19541);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5500 m14658(C9973 c9973, EnumC2298 enumC2298, boolean z, EnumC16686 enumC16686) {
        C6773 c6773M14659;
        C13921 c13921 = new C13921(1);
        C12828 c12828M14660 = m14660(z, EnumC13484.DEFAULT_SIGNED, enumC2298);
        try {
            C1642 c1642M14667 = m14667(c9973);
            try {
                c6773M14659 = m14659(c9973, c12828M14660, c1642M14667, c13921);
            } catch (Exception e) {
                if (enumC2298 == EnumC2298.SMB3_ONLY || !m14666(c9973, e)) {
                    throw e;
                }
                try {
                    c6773M14659 = m14659(c9973, m14660(false, EnumC13484.SMB2_GUEST_UNSIGNED_COMPAT, EnumC2298.SMB2_ONLY), c1642M14667, c13921);
                } catch (Exception e2) {
                    m14661(e2, e);
                    throw e2;
                }
            }
            EnumC16686 enumC16687 = EnumC16686.SMB3_ONLY;
            if (enumC16686 == enumC16687) {
                return new C5500(enumC16687, null, false);
            }
            return new C5500(EnumC16686.SMB2_ONLY, null, c6773M14659.m18895());
        } catch (Exception e3) {
            return C1771.m6224(e3);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6773 m14659(C9973 c9973, C12828 c12828, C1642 c1642, C13921 c13921) throws Exception {
        C19541 c19541 = new C19541(c12828);
        try {
            C21033 c21033M45076 = c19541.m45076(c9973.f32072, c9973.f32073);
            try {
                c21033M45076.m48059(c1642);
                C6773 c6773 = new C6773((c21033M45076.m48065().m1341().m37476() || c21033M45076.m48067().m42059()) ? false : true);
                try {
                    c21033M45076.m48064(true);
                } catch (IOException unused) {
                } finally {
                    C20244.m46520(c19541);
                }
                return c6773;
            } catch (Throwable th) {
                try {
                    try {
                        c21033M45076.m48064(true);
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                } catch (IOException unused2) {
                } finally {
                    C20244.m46520(c19541);
                }
                throw th;
            }
        } catch (Exception e) {
            C20244.m46520(c19541);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m14668(C0806 c0806) {
        try {
            f16703.m38873(c0806.f2860, c0806);
        } catch (IllegalStateException unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14662(C0806 c0806) {
        try {
            f16703.m38871(c0806.f2860, c0806);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m14666(C9973 c9973, Exception exc) {
        String str = c9973.f32074;
        String str2 = c9973.f32071;
        if (TextUtils.isEmpty(str)) {
            return (TextUtils.isEmpty(str2) || str2.equals("guest")) && m14665(exc, Collections.newSetFromMap(new IdentityHashMap()));
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m14665(Throwable th, Set set) {
        if (th == null || !set.add(th)) {
            return false;
        }
        if (th instanceof C4887) {
            return true;
        }
        for (Throwable th2 : th.getSuppressed()) {
            if (m14665(th2, set)) {
                return true;
            }
        }
        return m14665(th.getCause(), set);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14661(Throwable th, Throwable th2) {
        if (th != th2) {
            th.addSuppressed(th2);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C1642 m14667(C9973 c9973) {
        String str = c9973.f32071;
        String str2 = c9973.f32074;
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            return new C1642("", new char[0], null);
        }
        if (str.equals("guest") && TextUtils.isEmpty(str2)) {
            return new C1642("Guest", new char[0], null);
        }
        return new C1642(str, str2.toCharArray(), c9973.f32068);
    }
}
