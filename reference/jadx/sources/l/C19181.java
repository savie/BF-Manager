package l;

/* JADX INFO: renamed from: l.ᩳܺۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: P764 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19181 {
    /* JADX WARN: Code duplicated, block: B:29:0x006c A[PHI: r17
      0x006c: PHI (r17v3 boolean) = (r17v2 boolean), (r17v5 boolean) binds: [B:28:0x006a, B:25:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x0076  */
    /* JADX WARN: Code duplicated, block: B:36:0x0081  */
    /* JADX WARN: Code duplicated, block: B:38:0x0087  */
    /* JADX WARN: Code duplicated, block: B:47:0x009e  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00af  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d7  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m44453(C23131 c23131) {
        boolean z;
        boolean zM44451;
        long j;
        boolean z2;
        boolean zM44452;
        String strConcat;
        C3717 c3717;
        String str = c23131.f74992;
        C14400 c14400 = c23131.f75004;
        String str2 = c23131.f74999;
        if ("native_symbol".equals(str2)) {
            if (c14400 != null) {
                long j2 = c14400.f45383;
                long j3 = c14400.f45381;
                String str3 = c14400.f45386;
                String str4 = c14400.f45388;
                String str5 = c14400.f45387;
                if (!str3.isEmpty() && j3 >= 0 && str4.length() <= 4096 && ("imports".equals(str5) || "symbols".equals(str5) || "entries".equals(str5) || "relocations".equals(str5))) {
                    int i = c14400.f45385;
                    if (j2 < 0 || j2 > 2147483647L) {
                        z = true;
                        if (i < 0) {
                            j = c14400.f45382;
                            z2 = c14400.f45389;
                            if ("imports".equals(str5)) {
                                if (!z2 && j3 == 0 && m44451(c14400)) {
                                    zM44452 = true;
                                } else {
                                    zM44452 = false;
                                }
                            } else if ("relocations".equals(str5)) {
                                if (z2 && j3 == 0 && (j < 0 ? m44451(c14400) : m44452(c14400, "virtual", j))) {
                                    zM44452 = true;
                                } else {
                                    zM44452 = false;
                                }
                            } else if (z2) {
                                zM44452 = m44451(c14400);
                            } else if (j >= 0) {
                                zM44452 = m44452(c14400, "virtual", j);
                            } else if (j2 >= 0) {
                                zM44452 = m44452(c14400, "file_offset", j2);
                            } else {
                                zM44452 = m44451(c14400);
                            }
                            if (zM44452) {
                                strConcat = str5.concat(".name");
                                String strConcat2 = str5.concat(".demangledName");
                                if (!strConcat.equals(str)) {
                                    if (!"entries".equals(str5) && strConcat2.equals(str) && !str4.isEmpty()) {
                                        str3 = str4;
                                    }
                                }
                                if (("entries".equals(str5) || str4.isEmpty()) && ((c3717 = c23131.f74997) == null || str3.equals(c3717.f12776))) {
                                }
                            }
                        }
                    } else {
                        z = true;
                        if (i == ((int) j2)) {
                            j = c14400.f45382;
                            z2 = c14400.f45389;
                            if ("imports".equals(str5)) {
                                if (!z2) {
                                }
                                zM44452 = false;
                            } else if ("relocations".equals(str5)) {
                                if (z2) {
                                }
                                zM44452 = false;
                            } else if (z2) {
                                zM44452 = m44451(c14400);
                            } else if (j >= 0) {
                                zM44452 = m44452(c14400, "virtual", j);
                            } else if (j2 >= 0) {
                                zM44452 = m44452(c14400, "file_offset", j2);
                            } else {
                                zM44452 = m44451(c14400);
                            }
                            if (zM44452) {
                                strConcat = str5.concat(".name");
                                String strConcat3 = str5.concat(".demangledName");
                                if (!strConcat.equals(str)) {
                                    if (!"entries".equals(str5)) {
                                        str3 = str4;
                                    }
                                }
                                if ("entries".equals(str5)) {
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        z = true;
        if ("native_string".equals(str2)) {
            if (c14400 == null || !"strings.text".equals(str) || c14400.f45381 < 0) {
                return false;
            }
            long j4 = c14400.f45383;
            int i2 = c14400.f45385;
            if (!(j4 < 0 || j4 > 2147483647L ? i2 < 0 : i2 == ((int) j4))) {
                return false;
            }
            if (j4 >= 0) {
                zM44451 = m44452(c14400, "file_offset", j4);
            } else {
                long j5 = c14400.f45382;
                if (j5 >= 0) {
                    zM44451 = m44452(c14400, "virtual", j5);
                } else {
                    zM44451 = m44451(c14400);
                }
            }
            if (!zM44451) {
                return false;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m44451(C14400 c14400) {
        return c14400.f45384 == null && c14400.f45380 < 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m44452(C14400 c14400, String str, long j) {
        return str.equals(c14400.f45384) && c14400.f45380 == j;
    }
}
