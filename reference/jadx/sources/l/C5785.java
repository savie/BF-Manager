package l;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۛۗ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 54FE */
/* JADX INFO: loaded from: classes2.dex */
public final class C5785 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final long f19639;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public Date f19640;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C22719 f19641;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f19642;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public Date f19643;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f19644;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f19645;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f19646;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C18485 f19647;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public String f19648;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f19649;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public Date f19650;

    public C5785(long j, C22719 c22719, C18485 c18485) {
        this.f19642 = -1;
        this.f19639 = j;
        this.f19641 = c22719;
        this.f19647 = c18485;
        if (c18485 != null) {
            this.f19644 = c18485.m42867();
            this.f19646 = c18485.m42861();
            C10912 c10912M42857 = c18485.m42857();
            int iM27347 = c10912M42857.m27347();
            for (int i = 0; i < iM27347; i++) {
                String strM27344 = c10912M42857.m27344(i);
                String strM27348 = c10912M42857.m27348(i);
                if ("Date".equalsIgnoreCase(strM27344)) {
                    this.f19650 = C8659.m22461(strM27348);
                    this.f19648 = strM27348;
                } else if ("Expires".equalsIgnoreCase(strM27344)) {
                    this.f19640 = C8659.m22461(strM27348);
                } else if ("Last-Modified".equalsIgnoreCase(strM27344)) {
                    this.f19643 = C8659.m22461(strM27348);
                    this.f19649 = strM27348;
                } else if ("ETag".equalsIgnoreCase(strM27344)) {
                    this.f19645 = strM27348;
                } else if ("Age".equalsIgnoreCase(strM27344)) {
                    this.f19642 = C10070.m25479(-1, strM27348);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:53:0x0104  */
    /* JADX WARN: Code duplicated, block: B:54:0x0110  */
    /* JADX WARN: Code duplicated, block: B:57:0x0118  */
    /* JADX WARN: Code duplicated, block: B:62:0x0131  */
    /* JADX WARN: Code duplicated, block: B:64:0x0138  */
    /* JADX WARN: Code duplicated, block: B:66:0x0140  */
    /* JADX WARN: Code duplicated, block: B:69:0x014c  */
    /* JADX WARN: Code duplicated, block: B:74:0x016a  */
    /* JADX WARN: Code duplicated, block: B:76:0x016e  */
    /* JADX WARN: Code duplicated, block: B:77:0x0171 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x0173  */
    /* JADX WARN: Code duplicated, block: B:79:0x0176 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x0178  */
    /* JADX WARN: Code duplicated, block: B:83:0x019f  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16, types: [l.ᩴۗ۠, l.᩺ۗ۠] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10725 m15918() {
        C10725 c10725;
        long millis;
        long time;
        long millis2;
        String str;
        String str2;
        long j;
        C17779 c17779M42864;
        ?? r1 = 0;
        r1 = 0;
        r1 = 0;
        r1 = 0;
        C22719 c22719 = this.f19641;
        C18485 c18485 = this.f19647;
        if (c18485 == null) {
            c10725 = new C10725(c22719, null);
        } else if ((c22719.m50356() && c18485.m42869() == null) || !C10725.m26950(c22719, c18485)) {
            c10725 = new C10725(c22719, null);
        } else {
            C13734 c13734M50361 = c22719.m50361();
            if (c13734M50361.m33477() || c22719.m50357("If-Modified-Since") != null || c22719.m50357("If-None-Match") != null) {
                c10725 = new C10725(c22719, null);
            } else {
                C13734 c13734M42862 = c18485.m42862();
                long j2 = this.f19646;
                Date date = this.f19650;
                long jMax = date != null ? Math.max(0L, j2 - date.getTime()) : 0L;
                int i = this.f19642;
                if (i != -1) {
                    jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i));
                }
                long time2 = this.f19644;
                long j3 = jMax + (j2 - time2) + (this.f19639 - j2);
                C13734 c13734M42863 = c18485.m42862();
                int iM33482 = c13734M42863.m33482();
                Date date2 = this.f19640;
                long time3 = j2;
                Date date3 = this.f19643;
                if (iM33482 == -1) {
                    if (date2 != null) {
                        if (date != null) {
                            time3 = date.getTime();
                        }
                        time = date2.getTime() - time3;
                        if (time > 0) {
                        }
                        if (c13734M50361.m33482() != -1) {
                            time = Math.min(time, TimeUnit.SECONDS.toMillis(c13734M50361.m33482()));
                        }
                        if (c13734M50361.m33481() != -1) {
                            millis2 = TimeUnit.SECONDS.toMillis(c13734M50361.m33481());
                        } else {
                            millis2 = millis;
                        }
                        if (!c13734M42862.m33485() && c13734M50361.m33478() != -1) {
                            millis = TimeUnit.SECONDS.toMillis(c13734M50361.m33478());
                        }
                        if (c13734M42862.m33477()) {
                            str = this.f19645;
                            if (str != null) {
                                str2 = "If-None-Match";
                            } else {
                                if (date3 != null) {
                                    str = this.f19649;
                                } else if (date != null) {
                                    str = this.f19648;
                                } else {
                                    r1 = 0;
                                    c10725 = new C10725(c22719, null);
                                }
                                str2 = "If-Modified-Since";
                            }
                            C5972 c5972M27346 = c22719.m50360().m27346();
                            AbstractC7196.f24003.mo19138(c5972M27346, str2, str);
                            C6490 c6490M50362 = c22719.m50362();
                            c6490M50362.m17682(c5972M27346.m16265());
                            C10725 c10726 = new C10725(c6490M50362.m17678(), c18485);
                            r1 = 0;
                            c10725 = c10726;
                        } else {
                            j = millis2 + j3;
                            if (j < time + millis) {
                                c17779M42864 = c18485.m42864();
                                if (j >= time) {
                                    c17779M42864.m41343("110 HttpURLConnection \"Response is stale\"");
                                }
                                if (j3 > 86400000 && c18485.m42862().m33482() == -1 && date2 == null) {
                                    c17779M42864.m41343("113 HttpURLConnection \"Heuristic expiration\"");
                                }
                                c10725 = new C10725(null, c17779M42864.m41340());
                                r1 = 0;
                            } else {
                                str = this.f19645;
                                if (str != null) {
                                    str2 = "If-None-Match";
                                } else {
                                    if (date3 != null) {
                                        str = this.f19649;
                                    } else if (date != null) {
                                        str = this.f19648;
                                    } else {
                                        r1 = 0;
                                        c10725 = new C10725(c22719, null);
                                    }
                                    str2 = "If-Modified-Since";
                                }
                                C5972 c5972M27347 = c22719.m50360().m27346();
                                AbstractC7196.f24003.mo19138(c5972M27347, str2, str);
                                C6490 c6490M50363 = c22719.m50362();
                                c6490M50363.m17682(c5972M27347.m16265());
                                C10725 c10727 = new C10725(c6490M50363.m17678(), c18485);
                                r1 = 0;
                                c10725 = c10727;
                            }
                        }
                    } else {
                        if (date3 != null && c18485.m42866().m50355().m34749() == null) {
                            if (date != null) {
                                time2 = date.getTime();
                            }
                            long time4 = time2 - date3.getTime();
                            millis = 0;
                            if (time4 > 0) {
                                time = time4 / 10;
                            }
                            if (c13734M50361.m33482() != -1) {
                                time = Math.min(time, TimeUnit.SECONDS.toMillis(c13734M50361.m33482()));
                            }
                            if (c13734M50361.m33481() != -1) {
                                millis2 = TimeUnit.SECONDS.toMillis(c13734M50361.m33481());
                            } else {
                                millis2 = millis;
                            }
                            if (!c13734M42862.m33485()) {
                                millis = TimeUnit.SECONDS.toMillis(c13734M50361.m33478());
                            }
                            if (c13734M42862.m33477()) {
                                j = millis2 + j3;
                                if (j < time + millis) {
                                    c17779M42864 = c18485.m42864();
                                    if (j >= time) {
                                        c17779M42864.m41343("110 HttpURLConnection \"Response is stale\"");
                                    }
                                    if (j3 > 86400000) {
                                        c17779M42864.m41343("113 HttpURLConnection \"Heuristic expiration\"");
                                    }
                                    c10725 = new C10725(null, c17779M42864.m41340());
                                    r1 = 0;
                                } else {
                                    str = this.f19645;
                                    if (str != null) {
                                        str2 = "If-None-Match";
                                    } else {
                                        if (date3 != null) {
                                            str = this.f19649;
                                        } else if (date != null) {
                                            str = this.f19648;
                                        } else {
                                            r1 = 0;
                                            c10725 = new C10725(c22719, null);
                                        }
                                        str2 = "If-Modified-Since";
                                    }
                                    C5972 c5972M27348 = c22719.m50360().m27346();
                                    AbstractC7196.f24003.mo19138(c5972M27348, str2, str);
                                    C6490 c6490M50364 = c22719.m50362();
                                    c6490M50364.m17682(c5972M27348.m16265());
                                    C10725 c10728 = new C10725(c6490M50364.m17678(), c18485);
                                    r1 = 0;
                                    c10725 = c10728;
                                }
                            } else {
                                str = this.f19645;
                                if (str != null) {
                                    str2 = "If-None-Match";
                                } else {
                                    if (date3 != null) {
                                        str = this.f19649;
                                    } else if (date != null) {
                                        str = this.f19648;
                                    } else {
                                        r1 = 0;
                                        c10725 = new C10725(c22719, null);
                                    }
                                    str2 = "If-Modified-Since";
                                }
                                C5972 c5972M27349 = c22719.m50360().m27346();
                                AbstractC7196.f24003.mo19138(c5972M27349, str2, str);
                                C6490 c6490M50365 = c22719.m50362();
                                c6490M50365.m17682(c5972M27349.m16265());
                                C10725 c10729 = new C10725(c6490M50365.m17678(), c18485);
                                r1 = 0;
                                c10725 = c10729;
                            }
                        }
                        time = millis;
                        if (c13734M50361.m33482() != -1) {
                            time = Math.min(time, TimeUnit.SECONDS.toMillis(c13734M50361.m33482()));
                        }
                        if (c13734M50361.m33481() != -1) {
                            millis2 = TimeUnit.SECONDS.toMillis(c13734M50361.m33481());
                        } else {
                            millis2 = millis;
                        }
                        if (!c13734M42862.m33485()) {
                            millis = TimeUnit.SECONDS.toMillis(c13734M50361.m33478());
                        }
                        if (c13734M42862.m33477()) {
                            j = millis2 + j3;
                            if (j < time + millis) {
                                c17779M42864 = c18485.m42864();
                                if (j >= time) {
                                    c17779M42864.m41343("110 HttpURLConnection \"Response is stale\"");
                                }
                                if (j3 > 86400000) {
                                    c17779M42864.m41343("113 HttpURLConnection \"Heuristic expiration\"");
                                }
                                c10725 = new C10725(null, c17779M42864.m41340());
                                r1 = 0;
                            } else {
                                str = this.f19645;
                                if (str != null) {
                                    str2 = "If-None-Match";
                                } else {
                                    if (date3 != null) {
                                        str = this.f19649;
                                    } else if (date != null) {
                                        str = this.f19648;
                                    } else {
                                        r1 = 0;
                                        c10725 = new C10725(c22719, null);
                                    }
                                    str2 = "If-Modified-Since";
                                }
                                C5972 c5972M273410 = c22719.m50360().m27346();
                                AbstractC7196.f24003.mo19138(c5972M273410, str2, str);
                                C6490 c6490M50366 = c22719.m50362();
                                c6490M50366.m17682(c5972M273410.m16265());
                                C10725 c107210 = new C10725(c6490M50366.m17678(), c18485);
                                r1 = 0;
                                c10725 = c107210;
                            }
                        } else {
                            str = this.f19645;
                            if (str != null) {
                                str2 = "If-None-Match";
                            } else {
                                if (date3 != null) {
                                    str = this.f19649;
                                } else if (date != null) {
                                    str = this.f19648;
                                } else {
                                    r1 = 0;
                                    c10725 = new C10725(c22719, null);
                                }
                                str2 = "If-Modified-Since";
                            }
                            C5972 c5972M273411 = c22719.m50360().m27346();
                            AbstractC7196.f24003.mo19138(c5972M273411, str2, str);
                            C6490 c6490M50367 = c22719.m50362();
                            c6490M50367.m17682(c5972M273411.m16265());
                            C10725 c107211 = new C10725(c6490M50367.m17678(), c18485);
                            r1 = 0;
                            c10725 = c107211;
                        }
                    }
                    millis = 0;
                    time = millis;
                    if (c13734M50361.m33482() != -1) {
                        time = Math.min(time, TimeUnit.SECONDS.toMillis(c13734M50361.m33482()));
                    }
                    if (c13734M50361.m33481() != -1) {
                        millis2 = TimeUnit.SECONDS.toMillis(c13734M50361.m33481());
                    } else {
                        millis2 = millis;
                    }
                    if (!c13734M42862.m33485()) {
                        millis = TimeUnit.SECONDS.toMillis(c13734M50361.m33478());
                    }
                    if (c13734M42862.m33477()) {
                        j = millis2 + j3;
                        if (j < time + millis) {
                            c17779M42864 = c18485.m42864();
                            if (j >= time) {
                                c17779M42864.m41343("110 HttpURLConnection \"Response is stale\"");
                            }
                            if (j3 > 86400000) {
                                c17779M42864.m41343("113 HttpURLConnection \"Heuristic expiration\"");
                            }
                            c10725 = new C10725(null, c17779M42864.m41340());
                            r1 = 0;
                        } else {
                            str = this.f19645;
                            if (str != null) {
                                str2 = "If-None-Match";
                            } else {
                                if (date3 != null) {
                                    str = this.f19649;
                                } else if (date != null) {
                                    str = this.f19648;
                                } else {
                                    r1 = 0;
                                    c10725 = new C10725(c22719, null);
                                }
                                str2 = "If-Modified-Since";
                            }
                            C5972 c5972M273412 = c22719.m50360().m27346();
                            AbstractC7196.f24003.mo19138(c5972M273412, str2, str);
                            C6490 c6490M50368 = c22719.m50362();
                            c6490M50368.m17682(c5972M273412.m16265());
                            C10725 c107212 = new C10725(c6490M50368.m17678(), c18485);
                            r1 = 0;
                            c10725 = c107212;
                        }
                    } else {
                        str = this.f19645;
                        if (str != null) {
                            str2 = "If-None-Match";
                        } else {
                            if (date3 != null) {
                                str = this.f19649;
                            } else if (date != null) {
                                str = this.f19648;
                            } else {
                                r1 = 0;
                                c10725 = new C10725(c22719, null);
                            }
                            str2 = "If-Modified-Since";
                        }
                        C5972 c5972M273413 = c22719.m50360().m27346();
                        AbstractC7196.f24003.mo19138(c5972M273413, str2, str);
                        C6490 c6490M50369 = c22719.m50362();
                        c6490M50369.m17682(c5972M273413.m16265());
                        C10725 c107213 = new C10725(c6490M50369.m17678(), c18485);
                        r1 = 0;
                        c10725 = c107213;
                    }
                } else {
                    time = TimeUnit.SECONDS.toMillis(c13734M42863.m33482());
                }
                millis = 0;
                if (c13734M50361.m33482() != -1) {
                    time = Math.min(time, TimeUnit.SECONDS.toMillis(c13734M50361.m33482()));
                }
                if (c13734M50361.m33481() != -1) {
                    millis2 = TimeUnit.SECONDS.toMillis(c13734M50361.m33481());
                } else {
                    millis2 = millis;
                }
                if (!c13734M42862.m33485()) {
                    millis = TimeUnit.SECONDS.toMillis(c13734M50361.m33478());
                }
                if (c13734M42862.m33477()) {
                    j = millis2 + j3;
                    if (j < time + millis) {
                        c17779M42864 = c18485.m42864();
                        if (j >= time) {
                            c17779M42864.m41343("110 HttpURLConnection \"Response is stale\"");
                        }
                        if (j3 > 86400000) {
                            c17779M42864.m41343("113 HttpURLConnection \"Heuristic expiration\"");
                        }
                        c10725 = new C10725(null, c17779M42864.m41340());
                        r1 = 0;
                    } else {
                        str = this.f19645;
                        if (str != null) {
                            str2 = "If-None-Match";
                        } else {
                            if (date3 != null) {
                                str = this.f19649;
                            } else if (date != null) {
                                str = this.f19648;
                            } else {
                                r1 = 0;
                                c10725 = new C10725(c22719, null);
                            }
                            str2 = "If-Modified-Since";
                        }
                        C5972 c5972M273414 = c22719.m50360().m27346();
                        AbstractC7196.f24003.mo19138(c5972M273414, str2, str);
                        C6490 c6490M503610 = c22719.m50362();
                        c6490M503610.m17682(c5972M273414.m16265());
                        C10725 c107214 = new C10725(c6490M503610.m17678(), c18485);
                        r1 = 0;
                        c10725 = c107214;
                    }
                } else {
                    str = this.f19645;
                    if (str != null) {
                        str2 = "If-None-Match";
                    } else {
                        if (date3 != null) {
                            str = this.f19649;
                        } else if (date != null) {
                            str = this.f19648;
                        } else {
                            r1 = 0;
                            c10725 = new C10725(c22719, null);
                        }
                        str2 = "If-Modified-Since";
                    }
                    C5972 c5972M273415 = c22719.m50360().m27346();
                    AbstractC7196.f24003.mo19138(c5972M273415, str2, str);
                    C6490 c6490M503611 = c22719.m50362();
                    c6490M503611.m17682(c5972M273415.m16265());
                    C10725 c107215 = new C10725(c6490M503611.m17678(), c18485);
                    r1 = 0;
                    c10725 = c107215;
                }
            }
        }
        return (c10725.f36562 == null || !c22719.m50361().m33479()) ? c10725 : new C10725(r1, r1);
    }
}
