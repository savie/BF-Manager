package l;

import android.text.TextUtils;
import java.io.IOException;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* JADX INFO: renamed from: l.ۙ᩵֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R9JP */
/* JADX INFO: loaded from: classes2.dex */
public final class C4843 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f17015 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C18724 f17016 = new C18724(new C5924(), new C23978());

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16418 m13438(boolean z, EnumC3101 enumC3101, EnumC14392 enumC14392) {
        EnumC3101 enumC3102 = EnumC3101.DEFAULT_SIGNED;
        if (enumC3101 != enumC3102 && enumC14392 != EnumC14392.SMB2_ONLY) {
            throw new IllegalArgumentException("Unsigned SMB mode requires SMB2 dialects");
        }
        C0189 c0189M38649 = C16418.m38649();
        c0189M38649.m1397();
        if (enumC14392 == EnumC14392.SMB2_ONLY) {
            c0189M38649.m1406(false);
            c0189M38649.m1407(EnumC20508.SMB_2_1, EnumC20508.SMB_2_0_2);
        } else {
            c0189M38649.m1406(true);
            if (enumC14392 == EnumC14392.SMB3_ONLY) {
                c0189M38649.m1407(EnumC20508.SMB_3_1_1, EnumC20508.SMB_3_0_2, EnumC20508.SMB_3_0);
            }
        }
        if (enumC3101 != enumC3102) {
            c0189M38649.m1410(false);
            c0189M38649.m1414();
            if (enumC3101 == EnumC3101.SMB2_GUEST_UNSIGNED_COMPAT) {
                c0189M38649.m1408();
            }
        }
        if (z) {
            c0189M38649.m1413(true);
        }
        return c0189M38649.m1398();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m13446(C6254 c6254) {
        for (EnumC14392 enumC14392 : EnumC14392.values()) {
            for (EnumC3101 enumC3101 : EnumC3101.values()) {
                if (enumC3101 == EnumC3101.DEFAULT_SIGNED || enumC14392 == EnumC14392.SMB2_ONLY) {
                    f17016.m43259(new C23564(c6254, enumC3101, enumC14392));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10864 m13434(C6254 c6254, EnumC14392 enumC14392, boolean z, boolean z2) {
        IOException e;
        C18724 c18724 = f17016;
        if (!z2 || enumC14392 == EnumC14392.SMB3_ONLY) {
            e = null;
        } else {
            try {
                return m13435(new C23564(c6254, EnumC3101.SMB2_GUEST_UNSIGNED_COMPAT, EnumC14392.SMB2_ONLY));
            } catch (IOException e2) {
                e = e2;
                c18724.m43259(new C23564(c6254, EnumC3101.SMB2_GUEST_UNSIGNED_COMPAT, EnumC14392.SMB2_ONLY));
            }
        }
        if (z && enumC14392 != EnumC14392.SMB3_ONLY) {
            try {
                return m13435(new C23564(c6254, EnumC3101.SMB2_UNSIGNED, EnumC14392.SMB2_ONLY));
            } catch (IOException unused) {
                c18724.m43259(new C23564(c6254, EnumC3101.SMB2_UNSIGNED, EnumC14392.SMB2_ONLY));
            }
        }
        try {
            return m13435(new C23564(c6254, EnumC3101.DEFAULT_SIGNED, enumC14392));
        } catch (IOException e3) {
            if (enumC14392 == EnumC14392.SMB3_ONLY || !m13444(c6254, e3)) {
                throw e3;
            }
            try {
                return m13435(new C23564(c6254, EnumC3101.SMB2_GUEST_UNSIGNED_COMPAT, EnumC14392.SMB2_ONLY));
            } catch (IOException e4) {
                m13439(e4, e3);
                if (e != null) {
                    m13439(e4, e);
                }
                throw e4;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10864 m13435(C23564 c23564) throws IOException {
        try {
            return (C10864) f17016.m43257(c23564);
        } catch (Exception e) {
            if (e instanceof IOException) {
                throw ((IOException) e);
            }
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            throw new IOException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13441(C6254 c6254, C12185 c12185, EnumC14392 enumC14392, C1359 c1359) throws Exception {
        try {
            m13440(c6254, c12185, EnumC3101.DEFAULT_SIGNED, enumC14392, c1359);
        } catch (Exception e) {
            if (enumC14392 == EnumC14392.SMB3_ONLY || !m13444(c6254, e)) {
                throw e;
            }
            try {
                m13440(c6254, c12185, EnumC3101.SMB2_GUEST_UNSIGNED_COMPAT, EnumC14392.SMB2_ONLY, c1359);
            } catch (Exception e2) {
                m13439(e2, e);
                throw e2;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13440(C6254 c6254, C12185 c12185, EnumC3101 enumC3101, EnumC14392 enumC14392, C1359 c1359) {
        C19946 c19946 = new C19946(m13438(false, enumC3101, enumC14392));
        C1163 c1163 = null;
        try {
            C1163 c1163M45243 = c19946.m45243(c6254.f21212, c6254.f21214);
            if ((enumC3101 == EnumC3101.SMB2_UNSIGNED) && c1163M45243.m4281().m32543()) {
                throw new IOException("SMB server requires signing");
            }
            new C12310(EnumC21522.f69924.m48246(c1163M45243.m4285(c12185))).m30572(((C6254) c1359.f5706).f21214);
            try {
                c1163M45243.m4288(true);
            } catch (IOException unused) {
            }
            C19431.m44468(c19946);
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    c1163.m4288(true);
                } catch (IOException unused2) {
                }
            }
            C19431.m44468(c19946);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13311 m13437(C6254 c6254, EnumC14392 enumC14392, boolean z, EnumC15428 enumC15428) {
        C9453 c9453M13433;
        C0219 c0219 = new C0219();
        C16418 c16418M13438 = m13438(z, EnumC3101.DEFAULT_SIGNED, enumC14392);
        try {
            C12185 c12185M13445 = m13445(c6254);
            try {
                c9453M13433 = m13433(c6254, c16418M13438, c12185M13445, c0219);
            } catch (Exception e) {
                if (enumC14392 == EnumC14392.SMB3_ONLY || !m13444(c6254, e)) {
                    throw e;
                }
                try {
                    c9453M13433 = m13433(c6254, m13438(false, EnumC3101.SMB2_GUEST_UNSIGNED_COMPAT, EnumC14392.SMB2_ONLY), c12185M13445, c0219);
                } catch (Exception e2) {
                    m13439(e2, e);
                    throw e2;
                }
            }
            EnumC15428 enumC15429 = EnumC15428.SMB3_ONLY;
            if (enumC15428 == enumC15429) {
                return new C13311(enumC15429, null, false);
            }
            return new C13311(EnumC15428.SMB2_ONLY, null, c9453M13433.m24211());
        } catch (Exception e3) {
            return C4137.m11765(e3);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9453 m13433(C6254 c6254, C16418 c16418, C12185 c12185, C0219 c0219) throws Exception {
        C19946 c19946 = new C19946(c16418);
        try {
            C1163 c1163M45243 = c19946.m45243(c6254.f21212, c6254.f21214);
            try {
                c1163M45243.m4285(c12185);
                C9453 c9453 = new C9453((c1163M45243.m4290().m11484().m46306() || c1163M45243.m4281().m32543()) ? false : true);
                try {
                    c1163M45243.m4288(true);
                } catch (IOException unused) {
                } finally {
                    C19431.m44468(c19946);
                }
                return c9453;
            } catch (Throwable th) {
                try {
                    try {
                        c1163M45243.m4288(true);
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                } catch (IOException unused2) {
                } finally {
                    C19431.m44468(c19946);
                }
                throw th;
            }
        } catch (Exception e) {
            C19431.m44468(c19946);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m13447(C10864 c10864) {
        try {
            f17016.m43260(c10864.f36943, c10864);
        } catch (IllegalStateException unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13442(C10864 c10864) {
        try {
            f17016.m43258(c10864.f36943, c10864);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m13444(C6254 c6254, Exception exc) {
        String str = c6254.f21210;
        String str2 = c6254.f21215;
        if (TextUtils.isEmpty(str)) {
            return (TextUtils.isEmpty(str2) || str2.equals("guest")) && m13443(exc, Collections.newSetFromMap(new IdentityHashMap()));
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m13443(Throwable th, Set set) {
        if (th == null || !set.add(th)) {
            return false;
        }
        if (th instanceof C10275) {
            return true;
        }
        for (Throwable th2 : th.getSuppressed()) {
            if (m13443(th2, set)) {
                return true;
            }
        }
        return m13443(th.getCause(), set);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13439(Throwable th, Throwable th2) {
        if (th != th2) {
            th.addSuppressed(th2);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C12185 m13445(C6254 c6254) {
        String str = c6254.f21215;
        String str2 = c6254.f21210;
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            return new C12185("", new char[0], null);
        }
        if (str.equals("guest") && TextUtils.isEmpty(str2)) {
            return new C12185("Guest", new char[0], null);
        }
        return new C12185(str, str2.toCharArray(), c6254.f21211);
    }
}
