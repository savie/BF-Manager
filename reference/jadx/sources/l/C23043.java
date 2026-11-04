package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import com.google.android.material.motion.MotionUtils;
import com.umeng.commonsdk.internal.c;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩸᩶ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L6Y6 */
/* JADX INFO: loaded from: classes.dex */
public final class C23043 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C23742 f74780 = C23742.ofPattern("yyyy-MM-dd'T'HH:mm:ssXXX", Locale.ROOT);

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final long f74781 = TimeUnit.SECONDS.toNanos(30);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f74782;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C10792 f74783;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f74784;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C22209 f74785;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m51944(C23043 c23043, long j, C10164 c10164) {
        c23043.getClass();
        if (j - c10164.f32551 < f74781) {
            return false;
        }
        c23043.f74782 -= c10164.f32550.size();
        return true;
    }

    public C23043(C22209 c22209) {
        C10792 c10792 = new C10792();
        this.f74784 = new LinkedHashMap(16, 0.75f, true);
        this.f74785 = c22209;
        this.f74783 = c10792;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5143 m51948(String str, int i, String str2, boolean z) throws C10186 {
        C22209 c22209 = this.f74785;
        C9113 c9113M50227 = c22209.m50227();
        String strM2299 = C0470.m2299(c9113M50227, str, MotionUtils.EASING_TYPE_PATH, true);
        C13148 c13148M16717 = C5691.m16717(str2, strM2299, z, i, c9113M50227.f29602, "");
        c9113M50227.m24268(strM2299);
        C19225 c19225M50228 = c22209.m50228(strM2299);
        try {
            c22209.m50230(c22209.m50232(strM2299));
            C1907 c1907M50234 = c22209.m50234(strM2299);
            if (c1907M50234.m6567() == EnumC13093.MISSING) {
                throw C22209.m50225(strM2299);
            }
            if (c1907M50234.m6567() != EnumC13093.DIRECTORY) {
                throw C22209.m50223("FILE_NOT_DIRECTORY", "The requested path is not a directory.", strM2299, c1907M50234.m6567());
            }
            C2707 c2707 = new C2707(this, c1907M50234.m6565(), strM2299, z, c9113M50227, c13148M16717);
            ArrayList arrayList = new ArrayList(i);
            while (arrayList.size() < i && c2707.m8892()) {
                arrayList.add(C2707.m8895(c2707));
            }
            boolean zM8892 = c2707.m8892();
            String strM16715 = zM8892 ? C5691.m16715(strM2299, z, i, c9113M50227.f29602, new C13148(((C13893) arrayList.get(arrayList.size() - 1)).f44060, c13148M16717.f42068), "") : "";
            ArrayList arrayListM51940 = m51940(arrayList);
            arrayList.size();
            C5143 c5143 = new C5143(strM2299, arrayListM51940, zM8892, strM16715, z, i);
            c19225M50228.close();
            return c5143;
        } catch (Throwable th) {
            try {
                c19225M50228.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5143 m51949(String str, boolean z, String str2, int i, String str3, C13346 c13346) throws C10186 {
        C22209 c22209 = this.f74785;
        C9113 c9113M50227 = c22209.m50227();
        int i2 = 0;
        String strM2299 = C0470.m2299(c9113M50227, str, MotionUtils.EASING_TYPE_PATH, false);
        C13148 c13148M16717 = C5691.m16717(str2, strM2299, z, i, c9113M50227.f29602, str3);
        c9113M50227.m24268(strM2299);
        C19225 c19225M50228 = c22209.m50228(strM2299);
        try {
            c22209.m50230(c22209.m50232(strM2299));
            C1907 c1907M50234 = c22209.m50234(strM2299);
            if (c1907M50234.m6567() == EnumC13093.MISSING) {
                throw C22209.m50225(strM2299);
            }
            if (c1907M50234.m6567() != EnumC13093.DIRECTORY) {
                throw C22209.m50223("FILE_NOT_DIRECTORY", "The requested path is not a directory.", strM2299, c1907M50234.m6567());
            }
            C2707 c2707 = new C2707(this, c1907M50234.m6565(), strM2299, z, c9113M50227, c13148M16717, c13346, 0);
            ArrayList arrayList = new ArrayList();
            String str4 = c13148M16717.f42067;
            long jNanoTime = System.nanoTime();
            while (arrayList.size() < i && i2 < 2000 && c2707.m8892()) {
                C25281.m56458();
                C13893 c13893M8895 = C2707.m8895(c2707);
                String str5 = c13893M8895.f44060;
                i2++;
                if (c13346.m32926(c13893M8895.f44061)) {
                    arrayList.add(c13893M8895);
                }
                long j = jNanoTime;
                str4 = str5;
                if (System.nanoTime() - jNanoTime >= TimeUnit.SECONDS.toNanos(2L)) {
                    break;
                }
                jNanoTime = j;
            }
            boolean zM8897 = C2707.m8897(c2707);
            String strM16715 = zM8897 ? C5691.m16715(strM2299, z, i, c9113M50227.f29602, new C13148(str4, c13148M16717.f42068), str3) : "";
            ArrayList arrayListM51940 = m51940(arrayList);
            arrayList.size();
            C5143 c5143 = new C5143(strM2299, arrayListM51940, zM8897, strM16715, z, i);
            c19225M50228.close();
            return c5143;
        } catch (Throwable th) {
            try {
                c19225M50228.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11108 m51950(String str) throws C10186 {
        Long lValueOf;
        String strSubstring;
        String str2;
        C22209 c22209 = this.f74785;
        C9113 c9113M50227 = c22209.m50227();
        String strM50219 = C22209.m50219(str, c9113M50227, MotionUtils.EASING_TYPE_PATH);
        String str3 = c9113M50227.f29602;
        C19225 c19225M50228 = c22209.m50228(strM50219);
        try {
            c22209.m50230(c22209.m50232(strM50219));
            C1907 c1907M50234 = c22209.m50234(strM50219);
            if (c1907M50234.m6567() == EnumC13093.MISSING) {
                throw C22209.m50225(strM50219);
            }
            EnumC13093 enumC13093M6567 = c1907M50234.m6567();
            EnumC13093 enumC13093 = EnumC13093.REGULAR;
            if (enumC13093M6567 != enumC13093 || c1907M50234.m6566() < 0) {
                lValueOf = null;
            } else {
                long jM6566 = c1907M50234.m6566();
                if (jM6566 > 9007199254740991L) {
                    throw C10186.m26302("FILE_STORAGE_ERROR", "The file size exceeds the supported JSON integer range.", "warning", (JSONArray) null, C22121.m50076(MotionUtils.EASING_TYPE_PATH, strM50219, "policyRevision", str3).add("operation", c.h).add("backendReason", "size_out_of_range"));
                }
                lValueOf = Long.valueOf(jM6566);
            }
            if (c1907M50234.m6567() == enumC13093) {
                try {
                    AbstractC22044 abstractC22044M6565 = c1907M50234.m6565();
                    abstractC22044M6565.getClass();
                    MessageDigest messageDigestM36183 = C15022.m36183();
                    C15022.m36175(messageDigestM36183, abstractC22044M6565.mo4290());
                    strSubstring = C15022.m36182(messageDigestM36183.digest()).substring(0, 16);
                    C1907 c1907M50235 = c22209.m50234(strM50219);
                    if (c1907M50235.m6567() != enumC13093 || c1907M50234.m6566() != c1907M50235.m6566()) {
                        throw C10186.m26302("FILE_CHANGED_DURING_READ", "The file changed while its content version was being calculated.", "warning", (JSONArray) null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, strM50219).add("policyRevision", str3).add("operation", "stat_hash"));
                    }
                } catch (IOException e) {
                    throw C22209.m50221(strM50219, e);
                }
            } else {
                strSubstring = null;
            }
            long jM6568 = c1907M50234.m6568();
            String str4 = jM6568 <= 0 ? null : f74780.format(C0358.ofEpochMilli(jM6568).atZone(AbstractC22338.systemDefault()));
            int i = C19115.f61878[c1907M50234.m6567().ordinal()];
            if (i == 1) {
                str2 = "file";
            } else if (i == 2) {
                str2 = "directory";
            } else if (i == 3) {
                str2 = "link";
            } else {
                if (i != 4) {
                    if (i != 5) {
                        throw new IncompatibleClassChangeError();
                    }
                    throw new IllegalArgumentException("Missing node has no stat type");
                }
                str2 = "other";
            }
            C11108 c11108 = new C11108(strM50219, str2, lValueOf, str4, c9113M50227.m24267(strM50219).f31730.m20827(), strSubstring);
            c19225M50228.close();
            return c11108;
        } catch (Throwable th) {
            try {
                c19225M50228.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m51940(ArrayList arrayList) {
        String str;
        String str2;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C13893 c13893 = (C13893) it.next();
            StringBuilder sb = new StringBuilder();
            C1907 c1907 = c13893.f44061;
            int i = C19115.f61878[c1907.m6567().ordinal()];
            if (i == 1) {
                str = "f";
            } else if (i == 2) {
                str = "d";
            } else if (i == 3) {
                str = "l";
            } else {
                if (i != 4) {
                    if (i != 5) {
                        throw new IncompatibleClassChangeError();
                    }
                    throw new IllegalArgumentException("Missing node cannot be listed");
                }
                str = "o";
            }
            sb.append(str);
            sb.append(' ');
            if (c1907.m6567() == EnumC13093.REGULAR && c1907.m6566() >= 0) {
                sb.append(c1907.m6566());
            } else {
                sb.append('-');
            }
            sb.append(' ');
            long jM6568 = c1907.m6568();
            if (jM6568 <= 0) {
                str2 = null;
            } else {
                str2 = f74780.format(C0358.ofEpochMilli(jM6568).atZone(AbstractC22338.systemDefault()));
            }
            if (str2 == null) {
                str2 = "-";
            }
            sb.append(str2);
            sb.append(' ');
            sb.append(c13893.f44060);
            arrayList2.add(sb.toString());
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m51941(final C23043 c23043, C8673 c8673) {
        ArrayList arrayList;
        synchronized (c23043) {
            c23043.f74783.getClass();
            final long jNanoTime = System.nanoTime();
            C1170.removeIf(c23043.f74784.values(), new Predicate() { // from class: l.۟ܰۚ
                @Override // java.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return C19025.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* JADX INFO: renamed from: negate */
                public /* synthetic */ Predicate mo7134negate() {
                    return C19025.$default$negate(this);
                }

                public /* synthetic */ Predicate or(Predicate predicate) {
                    return C19025.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return C23043.m51944(this.f26350, jNanoTime, (C10164) obj);
                }
            });
            C10164 c10164 = (C10164) c23043.f74784.get(c8673);
            arrayList = c10164 == null ? null : c10164.f32550;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51943(C23043 c23043, C8673 c8673, ArrayList arrayList) {
        synchronized (c23043) {
            if (arrayList.size() > 20000) {
                return;
            }
            LinkedHashMap linkedHashMap = c23043.f74784;
            c23043.f74783.getClass();
            C10164 c10164 = (C10164) linkedHashMap.put(c8673, new C10164(arrayList, System.nanoTime()));
            c23043.f74782 = (arrayList.size() - (c10164 == null ? 0 : c10164.f32550.size())) + c23043.f74782;
            while (true) {
                if (c23043.f74784.size() <= 64 && c23043.f74782 <= 20000) {
                    return;
                }
                Iterator it = c23043.f74784.values().iterator();
                c23043.f74782 -= ((C10164) it.next()).f32550.size();
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m51946(String str, String str2) throws C10186 {
        try {
            String strM2304 = C0470.m2304(str2, "backendPath");
            m51945(str, strM2304);
            return strM2304;
        } catch (C10186 unused) {
            throw m51947(str);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String m51945(String str, String str2) throws C10186 {
        String strM34972 = "/".equals(str) ? "/" : C14483.m34972(str, "/");
        if (!str2.startsWith(strM34972)) {
            throw m51947(str);
        }
        String strSubstring = str2.substring(strM34972.length());
        if (strSubstring.isEmpty() || strSubstring.indexOf(47) >= 0 || ".".equals(strSubstring) || "..".equals(strSubstring)) {
            throw m51947(str);
        }
        return strSubstring;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C10186 m51947(String str) {
        return C10186.m26302("FILE_STORAGE_ERROR", "The file backend returned an invalid direct child path.", "warning", (JSONArray) null, C22121.m50076(MotionUtils.EASING_TYPE_PATH, str, "operation", "list").add("backendReason", "invalid_child_path"));
    }
}
