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

/* JADX INFO: renamed from: l.֨ܶ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: L6Y6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1201 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C2800 f5313;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f5314;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C14517 f5315;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f5316;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C23351 f5312 = C23351.ofPattern("yyyy-MM-dd'T'HH:mm:ssXXX", Locale.ROOT);

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final long f5311 = TimeUnit.SECONDS.toNanos(30);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m4390(C1201 c1201, long j, C14838 c14838) {
        c1201.getClass();
        if (j - c14838.f48482 < f5311) {
            return false;
        }
        c1201.f5314 -= c14838.f48481.size();
        return true;
    }

    public C1201(C2800 c2800) {
        C14517 c14517 = new C14517();
        this.f5316 = new LinkedHashMap(16, 0.75f, true);
        this.f5313 = c2800;
        this.f5315 = c14517;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2612 m4394(String str, int i, String str2, boolean z) throws C12731 {
        C2800 c2800 = this.f5313;
        C3070 c3070M8504 = c2800.m8504();
        String strM17474 = C6370.m17474(c3070M8504, str, MotionUtils.EASING_TYPE_PATH, true);
        C4253 c4253M18948 = C7076.m18948(str2, strM17474, z, i, c3070M8504.f11560, "");
        c3070M8504.m9209(strM17474);
        C11268 c11268M8505 = c2800.m8505(strM17474);
        try {
            C5928 c5928M8503 = c2800.m8503(strM17474);
            if (c5928M8503.m16196() == EnumC12279.MISSING) {
                throw C2800.m8501(strM17474);
            }
            if (c5928M8503.m16196() != EnumC12279.DIRECTORY) {
                throw C2800.m8499("FILE_NOT_DIRECTORY", "The requested path is not a directory.", strM17474, c5928M8503.m16196());
            }
            C3547 c3547 = new C3547(this, c5928M8503.m16195(), strM17474, z, c3070M8504, c4253M18948);
            ArrayList arrayList = new ArrayList(i);
            while (arrayList.size() < i && c3547.m10462()) {
                arrayList.add(C3547.m10465(c3547));
            }
            boolean zM10462 = c3547.m10462();
            String strM18947 = zM10462 ? C7076.m18947(strM17474, z, i, c3070M8504.f11560, new C4253(((C11786) arrayList.get(arrayList.size() - 1)).f39580, c4253M18948.f15366), "") : "";
            ArrayList arrayListM4386 = m4386(arrayList);
            arrayList.size();
            C2612 c2612 = new C2612(strM17474, arrayListM4386, zM10462, strM18947, z, i);
            c11268M8505.close();
            return c2612;
        } catch (Throwable th) {
            try {
                c11268M8505.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2612 m4395(String str, boolean z, String str2, int i, String str3, C4023 c4023) throws C12731 {
        C2800 c2800 = this.f5313;
        C3070 c3070M8504 = c2800.m8504();
        int i2 = 0;
        String strM17474 = C6370.m17474(c3070M8504, str, MotionUtils.EASING_TYPE_PATH, false);
        C4253 c4253M18948 = C7076.m18948(str2, strM17474, z, i, c3070M8504.f11560, str3);
        c3070M8504.m9209(strM17474);
        C11268 c11268M8505 = c2800.m8505(strM17474);
        try {
            C5928 c5928M8503 = c2800.m8503(strM17474);
            if (c5928M8503.m16196() == EnumC12279.MISSING) {
                throw C2800.m8501(strM17474);
            }
            if (c5928M8503.m16196() != EnumC12279.DIRECTORY) {
                throw C2800.m8499("FILE_NOT_DIRECTORY", "The requested path is not a directory.", strM17474, c5928M8503.m16196());
            }
            C3547 c3547 = new C3547(this, c5928M8503.m16195(), strM17474, z, c3070M8504, c4253M18948, c4023, 0);
            ArrayList arrayList = new ArrayList();
            String str4 = c4253M18948.f15365;
            long jNanoTime = System.nanoTime();
            while (arrayList.size() < i && i2 < 2000 && c3547.m10462()) {
                C21663.m48393();
                C11786 c11786M10465 = C3547.m10465(c3547);
                String str5 = c11786M10465.f39580;
                i2++;
                if (c4023.m11529(c11786M10465.f39581)) {
                    arrayList.add(c11786M10465);
                }
                long j = jNanoTime;
                str4 = str5;
                if (System.nanoTime() - jNanoTime >= TimeUnit.SECONDS.toNanos(2L)) {
                    break;
                }
                jNanoTime = j;
            }
            boolean zM10467 = C3547.m10467(c3547);
            String strM18947 = zM10467 ? C7076.m18947(strM17474, z, i, c3070M8504.f11560, new C4253(str4, c4253M18948.f15366), str3) : "";
            ArrayList arrayListM4386 = m4386(arrayList);
            arrayList.size();
            C2612 c2612 = new C2612(strM17474, arrayListM4386, zM10467, strM18947, z, i);
            c11268M8505.close();
            return c2612;
        } catch (Throwable th) {
            try {
                c11268M8505.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22369 m4396(String str) throws C12731 {
        Long lValueOf;
        String strSubstring;
        String str2;
        C2800 c2800 = this.f5313;
        C3070 c3070M8504 = c2800.m8504();
        String strM8495 = C2800.m8495(str, c3070M8504, MotionUtils.EASING_TYPE_PATH);
        String str3 = c3070M8504.f11560;
        C11268 c11268M8505 = c2800.m8505(strM8495);
        try {
            C5928 c5928M8503 = c2800.m8503(strM8495);
            if (c5928M8503.m16196() == EnumC12279.MISSING) {
                throw C2800.m8501(strM8495);
            }
            EnumC12279 enumC12279M16196 = c5928M8503.m16196();
            EnumC12279 enumC12279 = EnumC12279.REGULAR;
            if (enumC12279M16196 != enumC12279 || c5928M8503.m16197() < 0) {
                lValueOf = null;
            } else {
                long jM16197 = c5928M8503.m16197();
                if (jM16197 > 9007199254740991L) {
                    throw C12731.m31627("FILE_STORAGE_ERROR", "The file size exceeds the supported JSON integer range.", "warning", (JSONArray) null, C3184.m9603(MotionUtils.EASING_TYPE_PATH, strM8495, "policyRevision", str3).add("operation", c.h).add("backendReason", "size_out_of_range"));
                }
                lValueOf = Long.valueOf(jM16197);
            }
            if (c5928M8503.m16196() == enumC12279) {
                try {
                    AbstractC20745 abstractC20745M16195 = c5928M8503.m16195();
                    abstractC20745M16195.getClass();
                    MessageDigest messageDigestM49425 = C22253.m49425();
                    C22253.m49417(messageDigestM49425, abstractC20745M16195.mo33970());
                    strSubstring = C22253.m49424(messageDigestM49425.digest()).substring(0, 16);
                    C5928 c5928M8504 = c2800.m8503(strM8495);
                    if (c5928M8504.m16196() != enumC12279 || c5928M8503.m16197() != c5928M8504.m16197()) {
                        throw C12731.m31627("FILE_CHANGED_DURING_READ", "The file changed while its content version was being calculated.", "warning", (JSONArray) null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, strM8495).add("policyRevision", str3).add("operation", "stat_hash"));
                    }
                } catch (IOException e) {
                    throw C2800.m8497(strM8495, e);
                }
            } else {
                strSubstring = null;
            }
            long jM16198 = c5928M8503.m16198();
            String str4 = jM16198 <= 0 ? null : f5312.format(C18285.ofEpochMilli(jM16198).atZone(AbstractC9114.systemDefault()));
            int i = C24010.f77803[c5928M8503.m16196().ordinal()];
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
            C22369 c22369 = new C22369(strM8495, str2, lValueOf, str4, c3070M8504.m9208(strM8495).f6625.m51849(), strSubstring);
            c11268M8505.close();
            return c22369;
        } catch (Throwable th) {
            try {
                c11268M8505.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m4386(ArrayList arrayList) {
        String str;
        String str2;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C11786 c11786 = (C11786) it.next();
            StringBuilder sb = new StringBuilder();
            C5928 c5928 = c11786.f39581;
            int i = C24010.f77803[c5928.m16196().ordinal()];
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
            if (c5928.m16196() == EnumC12279.REGULAR && c5928.m16197() >= 0) {
                sb.append(c5928.m16197());
            } else {
                sb.append('-');
            }
            sb.append(' ');
            long jM16198 = c5928.m16198();
            if (jM16198 <= 0) {
                str2 = null;
            } else {
                str2 = f5312.format(C18285.ofEpochMilli(jM16198).atZone(AbstractC9114.systemDefault()));
            }
            if (str2 == null) {
                str2 = "-";
            }
            sb.append(str2);
            sb.append(' ');
            sb.append(c11786.f39580);
            arrayList2.add(sb.toString());
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m4387(final C1201 c1201, C4729 c4729) {
        ArrayList arrayList;
        synchronized (c1201) {
            c1201.f5315.getClass();
            final long jNanoTime = System.nanoTime();
            C9030.removeIf(c1201.f5316.values(), new Predicate() { // from class: l.ۧ᩺۬
                @Override // java.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return C8512.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* JADX INFO: renamed from: negate */
                public /* synthetic */ Predicate mo9645negate() {
                    return C8512.$default$negate(this);
                }

                public /* synthetic */ Predicate or(Predicate predicate) {
                    return C8512.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return C1201.m4390(this.f38167, jNanoTime, (C14838) obj);
                }
            });
            C14838 c14838 = (C14838) c1201.f5316.get(c4729);
            arrayList = c14838 == null ? null : c14838.f48481;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m4389(C1201 c1201, C4729 c4729, ArrayList arrayList) {
        synchronized (c1201) {
            if (arrayList.size() > 20000) {
                return;
            }
            LinkedHashMap linkedHashMap = c1201.f5316;
            c1201.f5315.getClass();
            C14838 c14838 = (C14838) linkedHashMap.put(c4729, new C14838(arrayList, System.nanoTime()));
            c1201.f5314 = (arrayList.size() - (c14838 == null ? 0 : c14838.f48481.size())) + c1201.f5314;
            while (true) {
                if (c1201.f5316.size() <= 64 && c1201.f5314 <= 20000) {
                    return;
                }
                Iterator it = c1201.f5316.values().iterator();
                c1201.f5314 -= ((C14838) it.next()).f48481.size();
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m4392(String str, String str2) throws C12731 {
        try {
            String strM17479 = C6370.m17479(str2, "backendPath");
            m4391(str, strM17479);
            return strM17479;
        } catch (C12731 unused) {
            throw m4393(str);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String m4391(String str, String str2) throws C12731 {
        String strM37076 = "/".equals(str) ? "/" : C15489.m37076(str, "/");
        if (!str2.startsWith(strM37076)) {
            throw m4393(str);
        }
        String strSubstring = str2.substring(strM37076.length());
        if (strSubstring.isEmpty() || strSubstring.indexOf(47) >= 0 || ".".equals(strSubstring) || "..".equals(strSubstring)) {
            throw m4393(str);
        }
        return strSubstring;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C12731 m4393(String str) {
        return C12731.m31627("FILE_STORAGE_ERROR", "The file backend returned an invalid direct child path.", "warning", (JSONArray) null, C3184.m9603(MotionUtils.EASING_TYPE_PATH, str, "operation", "list").add("backendReason", "invalid_child_path"));
    }
}
