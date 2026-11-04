package l;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.֫۫ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 54FE */
/* JADX INFO: loaded from: classes2.dex */
public final class C1923 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7954 f6456;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f6457;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f6458;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f6459;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f6460;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final long f6461;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f6462;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f6463;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public Date f6464;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C9444 f6465;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Date f6466;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public Date f6467;

    public C1923(long j, C7954 c7954, C9444 c9444) {
        this.f6457 = -1;
        this.f6461 = j;
        this.f6456 = c7954;
        this.f6465 = c9444;
        if (c9444 != null) {
            this.f6460 = c9444.m24816();
            this.f6458 = c9444.m24815();
            C11682 c11682M24822 = c9444.m24822();
            int iM29363 = c11682M24822.m29363();
            for (int i = 0; i < iM29363; i++) {
                String strM29360 = c11682M24822.m29360(i);
                String strM29364 = c11682M24822.m29364(i);
                if ("Date".equalsIgnoreCase(strM29360)) {
                    this.f6467 = C7143.m19709(strM29364);
                    this.f6463 = strM29364;
                } else if ("Expires".equalsIgnoreCase(strM29360)) {
                    this.f6466 = C7143.m19709(strM29364);
                } else if ("Last-Modified".equalsIgnoreCase(strM29360)) {
                    this.f6464 = C7143.m19709(strM29364);
                    this.f6462 = strM29364;
                } else if ("ETag".equalsIgnoreCase(strM29360)) {
                    this.f6459 = strM29364;
                } else if ("Age".equalsIgnoreCase(strM29360)) {
                    this.f6457 = C13854.m33798(-1, strM29364);
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
    /* JADX WARN: Type inference failed for: r1v16, types: [l.۟ܳۨ, l.ۡܳۨ] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11617 m6600() {
        C11617 c11617;
        long millis;
        long time;
        long millis2;
        String str;
        String str2;
        long j;
        C1242 c1242M24824;
        ?? r1 = 0;
        r1 = 0;
        r1 = 0;
        r1 = 0;
        C7954 c7954 = this.f6456;
        C9444 c9444 = this.f6465;
        if (c9444 == null) {
            c11617 = new C11617(c7954, null);
        } else if ((c7954.m21653() && c9444.m24823() == null) || !C11617.m29187(c7954, c9444)) {
            c11617 = new C11617(c7954, null);
        } else {
            C12560 c12560M21652 = c7954.m21652();
            if (c12560M21652.m31265() || c7954.m21646("If-Modified-Since") != null || c7954.m21646("If-None-Match") != null) {
                c11617 = new C11617(c7954, null);
            } else {
                C12560 c12560M24827 = c9444.m24827();
                long j2 = this.f6458;
                Date date = this.f6467;
                long jMax = date != null ? Math.max(0L, j2 - date.getTime()) : 0L;
                int i = this.f6457;
                if (i != -1) {
                    jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i));
                }
                long time2 = this.f6460;
                long j3 = jMax + (j2 - time2) + (this.f6461 - j2);
                C12560 c12560M24828 = c9444.m24827();
                int iM31264 = c12560M24828.m31264();
                Date date2 = this.f6466;
                long time3 = j2;
                Date date3 = this.f6464;
                if (iM31264 == -1) {
                    if (date2 != null) {
                        if (date != null) {
                            time3 = date.getTime();
                        }
                        time = date2.getTime() - time3;
                        if (time > 0) {
                        }
                        if (c12560M21652.m31264() != -1) {
                            time = Math.min(time, TimeUnit.SECONDS.toMillis(c12560M21652.m31264()));
                        }
                        if (c12560M21652.m31267() != -1) {
                            millis2 = TimeUnit.SECONDS.toMillis(c12560M21652.m31267());
                        } else {
                            millis2 = millis;
                        }
                        if (!c12560M24827.m31266() && c12560M21652.m31269() != -1) {
                            millis = TimeUnit.SECONDS.toMillis(c12560M21652.m31269());
                        }
                        if (c12560M24827.m31265()) {
                            str = this.f6459;
                            if (str != null) {
                                str2 = "If-None-Match";
                            } else {
                                if (date3 != null) {
                                    str = this.f6462;
                                } else if (date != null) {
                                    str = this.f6463;
                                } else {
                                    r1 = 0;
                                    c11617 = new C11617(c7954, null);
                                }
                                str2 = "If-Modified-Since";
                            }
                            C1988 c1988M29362 = c7954.m21648().m29362();
                            AbstractC4906.f17137.mo15057(c1988M29362, str2, str);
                            C0496 c0496M21650 = c7954.m21650();
                            c0496M21650.m2393(c1988M29362.m6809());
                            C11617 c11618 = new C11617(c0496M21650.m2389(), c9444);
                            r1 = 0;
                            c11617 = c11618;
                        } else {
                            j = millis2 + j3;
                            if (j < time + millis) {
                                c1242M24824 = c9444.m24824();
                                if (j >= time) {
                                    c1242M24824.m4482("110 HttpURLConnection \"Response is stale\"");
                                }
                                if (j3 > 86400000 && c9444.m24827().m31264() == -1 && date2 == null) {
                                    c1242M24824.m4482("113 HttpURLConnection \"Heuristic expiration\"");
                                }
                                c11617 = new C11617(null, c1242M24824.m4479());
                                r1 = 0;
                            } else {
                                str = this.f6459;
                                if (str != null) {
                                    str2 = "If-None-Match";
                                } else {
                                    if (date3 != null) {
                                        str = this.f6462;
                                    } else if (date != null) {
                                        str = this.f6463;
                                    } else {
                                        r1 = 0;
                                        c11617 = new C11617(c7954, null);
                                    }
                                    str2 = "If-Modified-Since";
                                }
                                C1988 c1988M29363 = c7954.m21648().m29362();
                                AbstractC4906.f17137.mo15057(c1988M29363, str2, str);
                                C0496 c0496M21651 = c7954.m21650();
                                c0496M21651.m2393(c1988M29363.m6809());
                                C11617 c11619 = new C11617(c0496M21651.m2389(), c9444);
                                r1 = 0;
                                c11617 = c11619;
                            }
                        }
                    } else {
                        if (date3 != null && c9444.m24826().m21649().m39874() == null) {
                            if (date != null) {
                                time2 = date.getTime();
                            }
                            long time4 = time2 - date3.getTime();
                            millis = 0;
                            if (time4 > 0) {
                                time = time4 / 10;
                            }
                            if (c12560M21652.m31264() != -1) {
                                time = Math.min(time, TimeUnit.SECONDS.toMillis(c12560M21652.m31264()));
                            }
                            if (c12560M21652.m31267() != -1) {
                                millis2 = TimeUnit.SECONDS.toMillis(c12560M21652.m31267());
                            } else {
                                millis2 = millis;
                            }
                            if (!c12560M24827.m31266()) {
                                millis = TimeUnit.SECONDS.toMillis(c12560M21652.m31269());
                            }
                            if (c12560M24827.m31265()) {
                                j = millis2 + j3;
                                if (j < time + millis) {
                                    c1242M24824 = c9444.m24824();
                                    if (j >= time) {
                                        c1242M24824.m4482("110 HttpURLConnection \"Response is stale\"");
                                    }
                                    if (j3 > 86400000) {
                                        c1242M24824.m4482("113 HttpURLConnection \"Heuristic expiration\"");
                                    }
                                    c11617 = new C11617(null, c1242M24824.m4479());
                                    r1 = 0;
                                } else {
                                    str = this.f6459;
                                    if (str != null) {
                                        str2 = "If-None-Match";
                                    } else {
                                        if (date3 != null) {
                                            str = this.f6462;
                                        } else if (date != null) {
                                            str = this.f6463;
                                        } else {
                                            r1 = 0;
                                            c11617 = new C11617(c7954, null);
                                        }
                                        str2 = "If-Modified-Since";
                                    }
                                    C1988 c1988M29364 = c7954.m21648().m29362();
                                    AbstractC4906.f17137.mo15057(c1988M29364, str2, str);
                                    C0496 c0496M21652 = c7954.m21650();
                                    c0496M21652.m2393(c1988M29364.m6809());
                                    C11617 c116110 = new C11617(c0496M21652.m2389(), c9444);
                                    r1 = 0;
                                    c11617 = c116110;
                                }
                            } else {
                                str = this.f6459;
                                if (str != null) {
                                    str2 = "If-None-Match";
                                } else {
                                    if (date3 != null) {
                                        str = this.f6462;
                                    } else if (date != null) {
                                        str = this.f6463;
                                    } else {
                                        r1 = 0;
                                        c11617 = new C11617(c7954, null);
                                    }
                                    str2 = "If-Modified-Since";
                                }
                                C1988 c1988M29365 = c7954.m21648().m29362();
                                AbstractC4906.f17137.mo15057(c1988M29365, str2, str);
                                C0496 c0496M21653 = c7954.m21650();
                                c0496M21653.m2393(c1988M29365.m6809());
                                C11617 c116111 = new C11617(c0496M21653.m2389(), c9444);
                                r1 = 0;
                                c11617 = c116111;
                            }
                        }
                        time = millis;
                        if (c12560M21652.m31264() != -1) {
                            time = Math.min(time, TimeUnit.SECONDS.toMillis(c12560M21652.m31264()));
                        }
                        if (c12560M21652.m31267() != -1) {
                            millis2 = TimeUnit.SECONDS.toMillis(c12560M21652.m31267());
                        } else {
                            millis2 = millis;
                        }
                        if (!c12560M24827.m31266()) {
                            millis = TimeUnit.SECONDS.toMillis(c12560M21652.m31269());
                        }
                        if (c12560M24827.m31265()) {
                            j = millis2 + j3;
                            if (j < time + millis) {
                                c1242M24824 = c9444.m24824();
                                if (j >= time) {
                                    c1242M24824.m4482("110 HttpURLConnection \"Response is stale\"");
                                }
                                if (j3 > 86400000) {
                                    c1242M24824.m4482("113 HttpURLConnection \"Heuristic expiration\"");
                                }
                                c11617 = new C11617(null, c1242M24824.m4479());
                                r1 = 0;
                            } else {
                                str = this.f6459;
                                if (str != null) {
                                    str2 = "If-None-Match";
                                } else {
                                    if (date3 != null) {
                                        str = this.f6462;
                                    } else if (date != null) {
                                        str = this.f6463;
                                    } else {
                                        r1 = 0;
                                        c11617 = new C11617(c7954, null);
                                    }
                                    str2 = "If-Modified-Since";
                                }
                                C1988 c1988M29366 = c7954.m21648().m29362();
                                AbstractC4906.f17137.mo15057(c1988M29366, str2, str);
                                C0496 c0496M21654 = c7954.m21650();
                                c0496M21654.m2393(c1988M29366.m6809());
                                C11617 c116112 = new C11617(c0496M21654.m2389(), c9444);
                                r1 = 0;
                                c11617 = c116112;
                            }
                        } else {
                            str = this.f6459;
                            if (str != null) {
                                str2 = "If-None-Match";
                            } else {
                                if (date3 != null) {
                                    str = this.f6462;
                                } else if (date != null) {
                                    str = this.f6463;
                                } else {
                                    r1 = 0;
                                    c11617 = new C11617(c7954, null);
                                }
                                str2 = "If-Modified-Since";
                            }
                            C1988 c1988M29367 = c7954.m21648().m29362();
                            AbstractC4906.f17137.mo15057(c1988M29367, str2, str);
                            C0496 c0496M21655 = c7954.m21650();
                            c0496M21655.m2393(c1988M29367.m6809());
                            C11617 c116113 = new C11617(c0496M21655.m2389(), c9444);
                            r1 = 0;
                            c11617 = c116113;
                        }
                    }
                    millis = 0;
                    time = millis;
                    if (c12560M21652.m31264() != -1) {
                        time = Math.min(time, TimeUnit.SECONDS.toMillis(c12560M21652.m31264()));
                    }
                    if (c12560M21652.m31267() != -1) {
                        millis2 = TimeUnit.SECONDS.toMillis(c12560M21652.m31267());
                    } else {
                        millis2 = millis;
                    }
                    if (!c12560M24827.m31266()) {
                        millis = TimeUnit.SECONDS.toMillis(c12560M21652.m31269());
                    }
                    if (c12560M24827.m31265()) {
                        j = millis2 + j3;
                        if (j < time + millis) {
                            c1242M24824 = c9444.m24824();
                            if (j >= time) {
                                c1242M24824.m4482("110 HttpURLConnection \"Response is stale\"");
                            }
                            if (j3 > 86400000) {
                                c1242M24824.m4482("113 HttpURLConnection \"Heuristic expiration\"");
                            }
                            c11617 = new C11617(null, c1242M24824.m4479());
                            r1 = 0;
                        } else {
                            str = this.f6459;
                            if (str != null) {
                                str2 = "If-None-Match";
                            } else {
                                if (date3 != null) {
                                    str = this.f6462;
                                } else if (date != null) {
                                    str = this.f6463;
                                } else {
                                    r1 = 0;
                                    c11617 = new C11617(c7954, null);
                                }
                                str2 = "If-Modified-Since";
                            }
                            C1988 c1988M29368 = c7954.m21648().m29362();
                            AbstractC4906.f17137.mo15057(c1988M29368, str2, str);
                            C0496 c0496M21656 = c7954.m21650();
                            c0496M21656.m2393(c1988M29368.m6809());
                            C11617 c116114 = new C11617(c0496M21656.m2389(), c9444);
                            r1 = 0;
                            c11617 = c116114;
                        }
                    } else {
                        str = this.f6459;
                        if (str != null) {
                            str2 = "If-None-Match";
                        } else {
                            if (date3 != null) {
                                str = this.f6462;
                            } else if (date != null) {
                                str = this.f6463;
                            } else {
                                r1 = 0;
                                c11617 = new C11617(c7954, null);
                            }
                            str2 = "If-Modified-Since";
                        }
                        C1988 c1988M29369 = c7954.m21648().m29362();
                        AbstractC4906.f17137.mo15057(c1988M29369, str2, str);
                        C0496 c0496M21657 = c7954.m21650();
                        c0496M21657.m2393(c1988M29369.m6809());
                        C11617 c116115 = new C11617(c0496M21657.m2389(), c9444);
                        r1 = 0;
                        c11617 = c116115;
                    }
                } else {
                    time = TimeUnit.SECONDS.toMillis(c12560M24828.m31264());
                }
                millis = 0;
                if (c12560M21652.m31264() != -1) {
                    time = Math.min(time, TimeUnit.SECONDS.toMillis(c12560M21652.m31264()));
                }
                if (c12560M21652.m31267() != -1) {
                    millis2 = TimeUnit.SECONDS.toMillis(c12560M21652.m31267());
                } else {
                    millis2 = millis;
                }
                if (!c12560M24827.m31266()) {
                    millis = TimeUnit.SECONDS.toMillis(c12560M21652.m31269());
                }
                if (c12560M24827.m31265()) {
                    j = millis2 + j3;
                    if (j < time + millis) {
                        c1242M24824 = c9444.m24824();
                        if (j >= time) {
                            c1242M24824.m4482("110 HttpURLConnection \"Response is stale\"");
                        }
                        if (j3 > 86400000) {
                            c1242M24824.m4482("113 HttpURLConnection \"Heuristic expiration\"");
                        }
                        c11617 = new C11617(null, c1242M24824.m4479());
                        r1 = 0;
                    } else {
                        str = this.f6459;
                        if (str != null) {
                            str2 = "If-None-Match";
                        } else {
                            if (date3 != null) {
                                str = this.f6462;
                            } else if (date != null) {
                                str = this.f6463;
                            } else {
                                r1 = 0;
                                c11617 = new C11617(c7954, null);
                            }
                            str2 = "If-Modified-Since";
                        }
                        C1988 c1988M293610 = c7954.m21648().m29362();
                        AbstractC4906.f17137.mo15057(c1988M293610, str2, str);
                        C0496 c0496M21658 = c7954.m21650();
                        c0496M21658.m2393(c1988M293610.m6809());
                        C11617 c116116 = new C11617(c0496M21658.m2389(), c9444);
                        r1 = 0;
                        c11617 = c116116;
                    }
                } else {
                    str = this.f6459;
                    if (str != null) {
                        str2 = "If-None-Match";
                    } else {
                        if (date3 != null) {
                            str = this.f6462;
                        } else if (date != null) {
                            str = this.f6463;
                        } else {
                            r1 = 0;
                            c11617 = new C11617(c7954, null);
                        }
                        str2 = "If-Modified-Since";
                    }
                    C1988 c1988M293611 = c7954.m21648().m29362();
                    AbstractC4906.f17137.mo15057(c1988M293611, str2, str);
                    C0496 c0496M21659 = c7954.m21650();
                    c0496M21659.m2393(c1988M293611.m6809());
                    C11617 c116117 = new C11617(c0496M21659.m2389(), c9444);
                    r1 = 0;
                    c11617 = c116117;
                }
            }
        }
        return (c11617.f36450 == null || !c7954.m21652().m31261()) ? c11617 : new C11617(r1, r1);
    }
}
