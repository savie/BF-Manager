package l;

/* JADX INFO: renamed from: l.ᩴܰ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: P764 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18800 {
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
    public static boolean m43360(C0870 c0870) {
        boolean z;
        boolean zM43361;
        long j;
        boolean z2;
        boolean zM43362;
        String strConcat;
        C4440 c4440;
        String str = c0870.f3534;
        C16663 c16663 = c0870.f3541;
        String str2 = c0870.f3539;
        if ("native_symbol".equals(str2)) {
            if (c16663 != null) {
                long j2 = c16663.f53423;
                long j3 = c16663.f53420;
                String str3 = c16663.f53426;
                String str4 = c16663.f53425;
                String str5 = c16663.f53421;
                if (!str3.isEmpty() && j3 >= 0 && str4.length() <= 4096 && ("imports".equals(str5) || "symbols".equals(str5) || "entries".equals(str5) || "relocations".equals(str5))) {
                    int i = c16663.f53417;
                    if (j2 < 0 || j2 > 2147483647L) {
                        z = true;
                        if (i < 0) {
                            j = c16663.f53424;
                            z2 = c16663.f53418;
                            if ("imports".equals(str5)) {
                                if (!z2 && j3 == 0 && m43361(c16663)) {
                                    zM43362 = true;
                                } else {
                                    zM43362 = false;
                                }
                            } else if ("relocations".equals(str5)) {
                                if (z2 && j3 == 0 && (j < 0 ? m43361(c16663) : m43362(c16663, "virtual", j))) {
                                    zM43362 = true;
                                } else {
                                    zM43362 = false;
                                }
                            } else if (z2) {
                                zM43362 = m43361(c16663);
                            } else if (j >= 0) {
                                zM43362 = m43362(c16663, "virtual", j);
                            } else if (j2 >= 0) {
                                zM43362 = m43362(c16663, "file_offset", j2);
                            } else {
                                zM43362 = m43361(c16663);
                            }
                            if (zM43362) {
                                strConcat = str5.concat(".name");
                                String strConcat2 = str5.concat(".demangledName");
                                if (!strConcat.equals(str)) {
                                    if (!"entries".equals(str5) && strConcat2.equals(str) && !str4.isEmpty()) {
                                        str3 = str4;
                                    }
                                }
                                if (("entries".equals(str5) || str4.isEmpty()) && ((c4440 = c0870.f3537) == null || str3.equals(c4440.f15811))) {
                                }
                            }
                        }
                    } else {
                        z = true;
                        if (i == ((int) j2)) {
                            j = c16663.f53424;
                            z2 = c16663.f53418;
                            if ("imports".equals(str5)) {
                                if (!z2) {
                                }
                                zM43362 = false;
                            } else if ("relocations".equals(str5)) {
                                if (z2) {
                                }
                                zM43362 = false;
                            } else if (z2) {
                                zM43362 = m43361(c16663);
                            } else if (j >= 0) {
                                zM43362 = m43362(c16663, "virtual", j);
                            } else if (j2 >= 0) {
                                zM43362 = m43362(c16663, "file_offset", j2);
                            } else {
                                zM43362 = m43361(c16663);
                            }
                            if (zM43362) {
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
            if (c16663 == null || !"strings.text".equals(str) || c16663.f53420 < 0) {
                return false;
            }
            long j4 = c16663.f53423;
            int i2 = c16663.f53417;
            if (!(j4 < 0 || j4 > 2147483647L ? i2 < 0 : i2 == ((int) j4))) {
                return false;
            }
            if (j4 >= 0) {
                zM43361 = m43362(c16663, "file_offset", j4);
            } else {
                long j5 = c16663.f53424;
                if (j5 >= 0) {
                    zM43361 = m43362(c16663, "virtual", j5);
                } else {
                    zM43361 = m43361(c16663);
                }
            }
            if (!zM43361) {
                return false;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m43361(C16663 c16663) {
        return c16663.f53422 == null && c16663.f53419 < 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m43362(C16663 c16663, String str, long j) {
        return str.equals(c16663.f53422) && c16663.f53419 == j;
    }
}
