package l;

import android.os.SystemClock;
import android.text.TextUtils;
import bin.mt.plus.R;
import com.alipay.sdk.m.n.c;
import com.alipay.sdk.m.y.k;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.timepicker.RadialViewGroup;
import com.umeng.analytics.pro.d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۨۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: I7BH */
/* JADX INFO: loaded from: classes3.dex */
public final class C12252 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AtomicLong f39412 = new AtomicLong(1);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC17249 f39413 = new ConcurrentMapC17249();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final Pattern f39411 = Pattern.compile("(.*) \\((\\d+)\\)");

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final C12252 f39410 = new C12252();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C15235 f39409 = new C15235();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12252 m30594() {
        return f39410;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30623(String str, String str2, String str3, boolean z, boolean z2) {
        C20457 c20457 = (C20457) this.f39413.get(str);
        if (c20457 == null) {
            return;
        }
        synchronized (c20457) {
            m30597(c20457, SystemClock.elapsedRealtime());
            if (!c20457.f65516 && !c20457.f65534.contains(str2)) {
                C15981 c15981 = c20457.f65528;
                if (c15981 != null && TextUtils.equals(c15981.f51889, str2)) {
                    C3303 c3303 = (C3303) c20457.f65509.get(c15981.f51887);
                    if (c3303 == null) {
                        m30614(c20457);
                        m30607(c20457);
                        return;
                    }
                    boolean z3 = "replace".equals(str3) && z2 && c15981.f51888;
                    c20457.f65534.add(str2);
                    c20457.f65541 = str3;
                    c20457.f65512 = z3;
                    if (c15981.f51892) {
                        c3303.f10791 = "pending";
                        if (z) {
                            c20457.f65514 = true;
                            c20457.f65535 = str3;
                            c20457.f65536 = z3;
                            c20457.f65519 = null;
                        } else {
                            String unused = c15981.f51889;
                            c20457.f65519 = new C17473(c15981.f51887, c15981.f51889, str3, z3);
                        }
                        m30614(c20457);
                    } else if (z) {
                        c20457.f65514 = true;
                        c20457.f65535 = str3;
                        c20457.f65536 = z3;
                        for (C3303 c3304 : c20457.f65509.values()) {
                            if (c3304.f10796) {
                                m30600(c20457, c3304, str3, z3);
                            }
                        }
                        m30614(c20457);
                    } else {
                        m30600(c20457, c3303, str3, z3);
                        m30614(c20457);
                        m30591(c20457);
                    }
                    m30607(c20457);
                    return;
                }
                m30607(c20457);
                return;
            }
            m30607(c20457);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m30626(String str) {
        C20457 c20457 = (C20457) this.f39413.get(str);
        if (c20457 == null) {
            return false;
        }
        synchronized (c20457) {
            if (c20457.f65516) {
                return true;
            }
            m30597(c20457, SystemClock.elapsedRealtime());
            c20457.f65539 = true;
            m30614(c20457);
            if (!(c20457.f65542 || c20457.f65532)) {
                m30610(c20457);
            } else {
                m30607(c20457);
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap m30624(String str) {
        LinkedHashMap linkedHashMapM30618;
        LinkedHashMap linkedHashMapM30619;
        C20457 c20457 = (C20457) this.f39413.get(str);
        if (c20457 == null) {
            return null;
        }
        synchronized (c20457) {
            m30597(c20457, SystemClock.elapsedRealtime());
            if (!c20457.f65516 && !c20457.f65537 && c20457.f65528 == null) {
                Iterator it = c20457.f65509.values().iterator();
                do {
                    if (!it.hasNext()) {
                        c20457.f65542 = true;
                        m30605(c20457);
                        ArrayList<C3303> arrayListM30617 = m30617(c20457);
                        try {
                            try {
                                for (C3303 c3303 : arrayListM30617) {
                                    synchronized (c20457) {
                                        if (c20457.f65516) {
                                            LinkedHashMap linkedHashMapM306110 = m30618(c20457);
                                            synchronized (c20457) {
                                                c20457.f65542 = false;
                                                if (!c20457.f65516) {
                                                    if (c20457.f65539) {
                                                        m30610(c20457);
                                                    } else {
                                                        c20457.f65537 = true;
                                                        m30607(c20457);
                                                    }
                                                }
                                            }
                                            return linkedHashMapM306110;
                                        }
                                        if (c20457.f65539) {
                                            m30610(c20457);
                                            LinkedHashMap linkedHashMapM306111 = m30618(c20457);
                                            synchronized (c20457) {
                                                c20457.f65542 = false;
                                                if (!c20457.f65516) {
                                                    if (c20457.f65539) {
                                                        m30610(c20457);
                                                    } else {
                                                        c20457.f65537 = true;
                                                        m30607(c20457);
                                                    }
                                                }
                                            }
                                            return linkedHashMapM306111;
                                        }
                                        c20457.f65518 = c3303.f10797;
                                        AbstractC22044 abstractC22044M30595 = m30595(c20457, c3303);
                                        try {
                                            C6265.m17913(abstractC22044M30595, EnumC12230.MODIFY_FILE);
                                            if (abstractC22044M30595.mo2934() && !abstractC22044M30595.mo4281()) {
                                                synchronized (c20457) {
                                                    m30615(c20457, m30612(abstractC22044M30595.mo4294()));
                                                    linkedHashMapM30619 = m30618(c20457);
                                                }
                                                synchronized (c20457) {
                                                    c20457.f65542 = false;
                                                    if (!c20457.f65516) {
                                                        if (c20457.f65539) {
                                                            m30610(c20457);
                                                        } else {
                                                            c20457.f65537 = true;
                                                            m30607(c20457);
                                                        }
                                                    }
                                                }
                                                return linkedHashMapM30619;
                                            }
                                            if (!abstractC22044M30595.mo2934()) {
                                                abstractC22044M30595.m49853();
                                                C20108.m46233(abstractC22044M30595.mo4294(), true);
                                            }
                                            synchronized (c20457) {
                                                if (!m30611(c3303.f10791)) {
                                                    c3303.f10791 = "success";
                                                    String strM22373 = C8284.m22373(abstractC22044M30595.mo4294());
                                                    if (!TextUtils.isEmpty(strM22373) && !"/".equals(strM22373)) {
                                                        strM22373 = strM22373.concat("/");
                                                    }
                                                    c3303.f10803 = strM22373;
                                                    c20457.f65507++;
                                                    if (c3303.f10800) {
                                                        c20457.f65546.add(c3303.f10803);
                                                    }
                                                    m30607(c20457);
                                                }
                                            }
                                        } catch (C4866 e) {
                                            throw new IOException(e);
                                        }
                                    }
                                }
                                synchronized (c20457) {
                                    c20457.f65542 = false;
                                    if (!c20457.f65516) {
                                        if (c20457.f65539) {
                                            m30610(c20457);
                                        } else {
                                            c20457.f65537 = true;
                                            m30607(c20457);
                                        }
                                    }
                                }
                                synchronized (c20457) {
                                    linkedHashMapM30618 = m30618(c20457);
                                }
                                return linkedHashMapM30618;
                            } catch (IOException e2) {
                                synchronized (c20457) {
                                    if (!c20457.f65516) {
                                        m30615(c20457, m30608(e2.getMessage()));
                                    }
                                    throw e2;
                                }
                            }
                        } catch (Throwable th) {
                            synchronized (c20457) {
                                c20457.f65542 = false;
                                if (!c20457.f65516) {
                                    if (c20457.f65539) {
                                        m30610(c20457);
                                    } else {
                                        c20457.f65537 = true;
                                        m30607(c20457);
                                    }
                                }
                                throw th;
                            }
                        }
                    }
                } while (!((C3303) it.next()).f10796);
            }
            m30607(c20457);
            return m30618(c20457);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap m30621(String str, String str2) {
        C20457 c20457 = (C20457) this.f39413.get(str);
        if (c20457 == null) {
            return null;
        }
        synchronized (c20457) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            m30597(c20457, jElapsedRealtime);
            if (!c20457.f65516 && !c20457.f65539 && c20457.f65528 == null && c20457.f65537) {
                String strM30613 = m30613(c20457);
                if (!TextUtils.isEmpty(strM30613) && TextUtils.equals(strM30613, str2)) {
                    C3303 c3303 = (C3303) c20457.f65509.get(str2);
                    if (c3303 != null && C3303.m10905(c3303)) {
                        if (TextUtils.equals(c20457.f65545, str2) && TextUtils.equals(c3303.f10791, "armed") && jElapsedRealtime - c20457.f65524 <= 60000) {
                            m30605(c20457);
                            m30607(c20457);
                            return m30618(c20457);
                        }
                        AbstractC22044 abstractC22044M30595 = m30595(c20457, c3303);
                        if (c3303.f10804) {
                            if (abstractC22044M30595.mo2934() && abstractC22044M30595.mo4281()) {
                                m30615(c20457, m30612(abstractC22044M30595.mo4294()));
                                return m30618(c20457);
                            }
                        } else if (abstractC22044M30595.mo2934()) {
                            if (abstractC22044M30595.mo4281()) {
                                m30615(c20457, m30612(abstractC22044M30595.mo4294()));
                                return m30618(c20457);
                            }
                            if (!m30616(c20457, c3303) && !c20457.f65514) {
                                m30601(c20457, c3303, abstractC22044M30595);
                                m30607(c20457);
                                return m30618(c20457);
                            }
                        } else {
                            m30598(c20457, c3303.f10797);
                        }
                        c3303.f10791 = "armed";
                        c20457.f65545 = c3303.f10797;
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append("-a");
                        long j = c20457.f65548;
                        c20457.f65548 = 1 + j;
                        sb.append(j);
                        c20457.f65543 = sb.toString();
                        c20457.f65524 = jElapsedRealtime;
                        c20457.f65518 = c3303.f10797;
                        m30605(c20457);
                        m30607(c20457);
                        return m30618(c20457);
                    }
                    m30606(c20457, strM30613);
                    m30607(c20457);
                    return m30618(c20457);
                }
                m30606(c20457, strM30613);
                m30607(c20457);
                return m30618(c20457);
            }
            m30607(c20457);
            return m30618(c20457);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0281 */
    /* JADX WARN: Code duplicated, block: B:155:0x023b  */
    /* JADX WARN: Code duplicated, block: B:158:0x024a A[Catch: all -> 0x027e, TryCatch #11 {all -> 0x027e, blocks: (B:156:0x023c, B:158:0x024a, B:166:0x0278, B:167:0x027c, B:159:0x024e, B:165:0x026d, B:162:0x0259, B:164:0x0266), top: B:236:0x023c, outer: #12 }] */
    /* JADX WARN: Code duplicated, block: B:159:0x024e A[Catch: all -> 0x027e, TryCatch #11 {all -> 0x027e, blocks: (B:156:0x023c, B:158:0x024a, B:166:0x0278, B:167:0x027c, B:159:0x024e, B:165:0x026d, B:162:0x0259, B:164:0x0266), top: B:236:0x023c, outer: #12 }] */
    /* JADX WARN: Code duplicated, block: B:197:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:199:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:249:0x0210 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:261:? A[Catch: all -> 0x021a, IOException -> 0x022b, CancellationException -> 0x0283, SYNTHETIC, TryCatch #21 {all -> 0x021a, blocks: (B:31:0x008f, B:32:0x0094, B:68:0x010c, B:71:0x0119, B:93:0x016b, B:94:0x0178, B:111:0x01d6, B:175:0x0285, B:177:0x028b, B:179:0x0290, B:194:0x02b5, B:120:0x01e5, B:121:0x01e6, B:122:0x01fe, B:137:0x0219, B:136:0x0216, B:145:0x0224, B:146:0x022a, B:181:0x0292, B:182:0x02a1), top: B:253:0x008e, inners: #7 }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.LinkedHashMap m30622(java.lang.String r20, java.lang.String r21, java.lang.String r22, long r23, java.io.InputStream r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 772
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12252.m30622(java.lang.String, java.lang.String, java.lang.String, long, java.io.InputStream):java.util.LinkedHashMap");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap m30620(String str) {
        C20457 c20457 = (C20457) this.f39413.get(str);
        if (c20457 == null) {
            return null;
        }
        synchronized (c20457) {
            m30597(c20457, SystemClock.elapsedRealtime());
            if (c20457.f65516) {
                return m30618(c20457);
            }
            boolean z = true;
            if (c20457.f65539) {
                if (!(c20457.f65542 || c20457.f65532)) {
                    m30610(c20457);
                    return m30618(c20457);
                }
            }
            if (c20457.f65537 && c20457.f65528 == null) {
                if (!c20457.f65542 && !c20457.f65532) {
                    z = false;
                }
                if (!z) {
                    Iterator it = c20457.f65509.values().iterator();
                    while (it.hasNext()) {
                        if (!m30611(((C3303) it.next()).f10791)) {
                            m30607(c20457);
                            return m30618(c20457);
                        }
                    }
                    m30609(c20457);
                    return m30618(c20457);
                }
            }
            m30607(c20457);
            return m30618(c20457);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0090  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30599(C20457 c20457, List list) throws IOException {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C23441 c23441 = (C23441) it.next();
            if (c23441 == null) {
                throw new IOException(C21576.m49088(R.string.MT_Protector));
            }
            String str2 = c23441.f75874;
            if (TextUtils.isEmpty(str2)) {
                str = "";
                break;
            }
            String strReplace = str2.replace('\\', '/');
            while (strReplace.startsWith("./")) {
                strReplace = strReplace.substring(2);
            }
            while (strReplace.startsWith("/")) {
                strReplace = strReplace.substring(1);
            }
            while (strReplace.endsWith("/") && strReplace.length() > 1) {
                strReplace = C1402.m5124(1, 0, strReplace);
            }
            if (TextUtils.isEmpty(strReplace) || ".".equals(strReplace)) {
                str = "";
                break;
            }
            String[] strArrSplit = strReplace.split("/");
            int length = strArrSplit.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    str = strReplace;
                    break;
                }
                String str3 = strArrSplit[i];
                if (TextUtils.isEmpty(str3) || ".".equals(str3) || "..".equals(str3)) {
                    str = "";
                    break;
                }
                i++;
            }
            if (TextUtils.isEmpty(str)) {
                throw new IOException(C21576.m49088(R.string.MT_Protector));
            }
            String str4 = c23441.f75876;
            if (!TextUtils.equals("file", str4) && !TextUtils.equals("directory", str4)) {
                throw new IOException(C21576.m49059(R.string.MT_Protector, str4));
            }
            C3303 c3303 = new C3303(str, str4, Math.max(c23441.f75877, 0L), Math.max(c23441.f75875, 0L), c23441.f75878);
            C3303 c3304 = (C3303) linkedHashMap.get(c3303.f10797);
            if (c3304 != null && !TextUtils.equals(c3304.f10798, c3303.f10798)) {
                throw new IOException(C21576.m49059(R.string.MT_Protector, c3303.f10797));
            }
            if (c3304 != null) {
                linkedHashMap.remove(c3303.f10797);
            }
            linkedHashMap.put(c3303.f10797, c3303);
        }
        c20457.f65509.clear();
        c20457.f65509.putAll(linkedHashMap);
        c20457.f65517 = c20457.f65509.size();
        c20457.f65510 = 0L;
        for (C3303 c3305 : c20457.f65509.values()) {
            if (C3303.m10905(c3305)) {
                c20457.f65510 = Math.max(c3305.f10793, 0L) + c20457.f65510;
            }
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static void m30603(C20457 c20457) throws IOException {
        for (C3303 c3303 : c20457.f65509.values()) {
            AbstractC22044 abstractC22044M30595 = m30595(c20457, c3303);
            if (C3303.m10912(c3303)) {
                if (!abstractC22044M30595.mo2934()) {
                    continue;
                } else {
                    if (!abstractC22044M30595.mo4281()) {
                        throw new IOException(m30612(abstractC22044M30595.mo4294()));
                    }
                    c3303.f10804 = true;
                }
            } else if (!abstractC22044M30595.mo2934()) {
                continue;
            } else {
                if (abstractC22044M30595.mo4281()) {
                    throw new IOException(m30612(abstractC22044M30595.mo4294()));
                }
                c3303.f10804 = true;
                c3303.f10795 = C8284.m22372(abstractC22044M30595);
                c3303.f10796 = true;
            }
        }
        m30591(c20457);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m30591(C20457 c20457) {
        for (C3303 c3303 : c20457.f65509.values()) {
            if (c3303.f10796) {
                StringBuilder sb = new StringBuilder();
                sb.append(c20457.f65533);
                sb.append("-c");
                long j = c20457.f65513;
                c20457.f65513 = 1 + j;
                sb.append(j);
                String string = sb.toString();
                AbstractC22044 abstractC22044M30595 = m30595(c20457, c3303);
                c3303.f10791 = "waiting_conflict";
                c20457.f65528 = new C15981(string, c3303.f10797, abstractC22044M30595.mo4294(), C21578.m49094(c3303.f10793, c3303.f10799), C21578.m49096(abstractC22044M30595), c20457.f65541, "replace".equals(c20457.f65541) && c3303.f10795 && c20457.f65512, c3303.f10795, false);
                c20457.f65525 = "waiting_conflict";
                String str = c3303.f10797;
                c20457.f65511 = "resolve_conflict";
                c20457.f65521 = m30608(str);
                return;
            }
        }
        m30614(c20457);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30600(C20457 c20457, C3303 c3303, String str, boolean z) {
        boolean z2 = false;
        c3303.f10796 = false;
        if (RadialViewGroup.SKIP_TAG.equals(str)) {
            c3303.f10791 = "skipped";
            if (c3303.f10802) {
                c3303.f10802 = false;
                c20457.f65517--;
                c20457.f65510 -= c3303.f10793;
                return;
            }
            return;
        }
        c3303.f10791 = "pending";
        c3303.f10794 = str;
        if ("replace".equals(str) && z && c3303.f10795) {
            z2 = true;
        }
        c3303.f10801 = z2;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static ArrayList m30617(C20457 c20457) {
        ArrayList arrayList = new ArrayList();
        for (C3303 c3303 : c20457.f65509.values()) {
            if (C3303.m10912(c3303) && !m30611(c3303.f10791)) {
                arrayList.add(c3303);
            }
        }
        C12884.sort(arrayList, C8627.thenComparing(C2661.comparingInt(new C5541()), new C1812()));
        return arrayList;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C24933 m30604(C20457 c20457, C3303 c3303) {
        int i;
        String strM30613 = m30613(c20457);
        if (!TextUtils.equals(strM30613, c3303.f10797)) {
            m30606(c20457, strM30613);
            return C24933.m55586();
        }
        AbstractC22044 abstractC22044M30595 = m30595(c20457, c3303);
        if (c3303.f10804 && abstractC22044M30595.mo2934() && abstractC22044M30595.mo4281()) {
            m30615(c20457, m30612(abstractC22044M30595.mo4294()));
            return C24933.m55586();
        }
        if (!c3303.f10804 && abstractC22044M30595.mo2934() && abstractC22044M30595.mo4281()) {
            m30615(c20457, m30612(abstractC22044M30595.mo4294()));
            return C24933.m55586();
        }
        String str = c3303.f10794;
        boolean z = c3303.f10801;
        if (!c3303.f10804 && abstractC22044M30595.mo2934()) {
            if (m30616(c20457, c3303)) {
                str = c20457.f65519.f56807;
                z = c20457.f65519.f56808;
                c20457.f65519 = null;
            } else if (c20457.f65514) {
                str = c20457.f65535;
                z = "replace".equals(str) && c20457.f65536 && C8284.m22372(abstractC22044M30595);
                m30598(c20457, c3303.f10797);
            } else {
                m30601(c20457, c3303, abstractC22044M30595);
                return C24933.m55586();
            }
        } else {
            m30598(c20457, c3303.f10797);
        }
        if (RadialViewGroup.SKIP_TAG.equals(str)) {
            c3303.f10791 = "skipped";
            c3303.f10792 = "";
            if (c3303.f10802) {
                c20457.f65507++;
                c20457.f65510 -= c3303.f10793;
                c3303.f10802 = false;
            }
            m30596(c20457);
            m30605(c20457);
            m30607(c20457);
            return C24933.m55586();
        }
        if ("keep_both".equals(str)) {
            while (true) {
                String strM22373 = C8284.m22373(abstractC22044M30595.mo4294());
                if (!abstractC22044M30595.mo2934() && !c20457.f65522.contains(strM22373)) {
                    break;
                }
                AbstractC22044 abstractC22044M49839 = abstractC22044M30595.m49839(true);
                if (TextUtils.equals(abstractC22044M49839.mo4294(), abstractC22044M30595.mo4294())) {
                    String parent = abstractC22044M30595.getParent();
                    if (!TextUtils.isEmpty(parent)) {
                        String name = abstractC22044M30595.getName();
                        String strM49864 = abstractC22044M30595.m49864();
                        String strSubstring = name.substring(0, name.length() - strM49864.length());
                        Matcher matcher = f39411.matcher(strSubstring);
                        if (matcher.matches()) {
                            try {
                                i = Integer.parseInt(matcher.group(2));
                                try {
                                    strSubstring = matcher.group(1);
                                } catch (Exception unused) {
                                }
                            } catch (Exception unused2) {
                                i = 0;
                            }
                        } else {
                            i = 0;
                        }
                        abstractC22044M30595 = C14584.m35193(parent, strSubstring + " (" + (i + 1) + MotionUtils.EASING_TYPE_FORMAT_END + strM49864);
                    }
                } else {
                    abstractC22044M30595 = abstractC22044M49839;
                }
            }
        }
        String strM22374 = C8284.m22373(abstractC22044M30595.mo4294());
        c20457.f65522.add(strM22374);
        m30596(c20457);
        m30605(c20457);
        c3303.f10791 = "uploading";
        c3303.f10803 = strM22374;
        c3303.f10792 = "";
        boolean zMo2934 = abstractC22044M30595.mo2934();
        AbstractC22044 abstractC22044M49862 = abstractC22044M30595.m49862(".web_upload");
        c20457.f65518 = c3303.f10797;
        m30607(c20457);
        return C24933.m55587(abstractC22044M30595, abstractC22044M49862, z, zMo2934);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30601(C20457 c20457, C3303 c3303, AbstractC22044 abstractC22044) {
        StringBuilder sb = new StringBuilder();
        sb.append(c20457.f65533);
        sb.append("-c");
        long j = c20457.f65513;
        c20457.f65513 = 1 + j;
        sb.append(j);
        String string = sb.toString();
        boolean zM22372 = C8284.m22372(abstractC22044);
        c3303.f10795 = zM22372;
        c3303.f10791 = "waiting_conflict";
        c3303.f10792 = string;
        c20457.f65528 = new C15981(string, c3303.f10797, abstractC22044.mo4294(), C21578.m49094(c3303.f10793, c3303.f10799), C21578.m49096(abstractC22044), c20457.f65541, "replace".equals(c20457.f65541) && zM22372 && c20457.f65512, zM22372, true);
        c20457.f65525 = "waiting_conflict";
        String str = c3303.f10797;
        c20457.f65511 = "resolve_conflict";
        c20457.f65521 = m30608(str);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m30616(C20457 c20457, C3303 c3303) {
        return c20457.f65519 != null && TextUtils.equals(c20457.f65519.f56810, c3303.f10797) && TextUtils.equals(c20457.f65519.f56809, c3303.f10792);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30598(C20457 c20457, String str) {
        if (c20457.f65519 != null && TextUtils.equals(c20457.f65519.f56810, str)) {
            c20457.f65519 = null;
        }
        C3303 c3303 = (C3303) c20457.f65509.get(str);
        if (c3303 != null) {
            c3303.f10792 = "";
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30597(C20457 c20457, long j) {
        if (TextUtils.isEmpty(c20457.f65545) || j - c20457.f65524 <= 60000) {
            return;
        }
        C3303 c3303 = (C3303) c20457.f65509.get(c20457.f65545);
        if (c3303 != null && TextUtils.equals(c3303.f10791, "armed")) {
            c3303.f10791 = "pending";
            m30598(c20457, c3303.f10797);
        }
        m30596(c20457);
        m30606(c20457, m30613(c20457));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m30606(C20457 c20457, String str) {
        c20457.f65511 = "restart_begin";
        c20457.f65521 = m30608(str);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m30605(C20457 c20457) {
        c20457.f65511 = "none";
        c20457.f65521 = "";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30596(C20457 c20457) {
        c20457.f65545 = "";
        c20457.f65543 = "";
        c20457.f65524 = 0L;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m30614(C20457 c20457) {
        c20457.f65528 = null;
        if (c20457.f65516) {
            return;
        }
        c20457.f65525 = "running";
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static String m30613(C20457 c20457) {
        ArrayList arrayList = new ArrayList();
        for (C3303 c3303 : c20457.f65509.values()) {
            if (C3303.m10905(c3303) && c3303.f10802 && !m30611(c3303.f10791) && !c3303.f10796) {
                arrayList.add(c3303);
            }
        }
        C12884.sort(arrayList, f39409);
        Iterator it = arrayList.iterator();
        return it.hasNext() ? ((C3303) it.next()).f10797 : "";
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m30607(C20457 c20457) {
        if (c20457.f65516) {
            if (c20457.f65510 == 0 && "success".equals(c20457.f65525)) {
                c20457.f65538 = 100;
            }
        } else if (c20457.f65510 > 0) {
            c20457.f65538 = (int) Math.max(0L, Math.min(100L, (c20457.f65520 * 100) / Math.max(c20457.f65510, 1L)));
        } else {
            c20457.f65538 = 0;
        }
        int iMax = Math.max(c20457.f65517 - c20457.f65507, 0);
        long jMax = Math.max(c20457.f65510 - c20457.f65520, 0L);
        if (c20457.f65517 <= 1) {
            c20457.f65508 = C8311.m22390(jMax) + "/" + C8311.m22390(Math.max(c20457.f65510, 0L));
        } else {
            c20457.f65508 = iMax + " (" + C8311.m22390(jMax) + "/" + C8311.m22390(Math.max(c20457.f65510, 0L)) + MotionUtils.EASING_TYPE_FORMAT_END;
        }
        if (c20457.f65516) {
            m30605(c20457);
            m30596(c20457);
            m30614(c20457);
        } else if (c20457.f65528 == null) {
            c20457.f65525 = "running";
        }
        c20457.f65531 = m30613(c20457);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static void m30609(C20457 c20457) {
        c20457.f65516 = true;
        c20457.f65525 = "success";
        c20457.f65549 = SystemClock.elapsedRealtime();
        c20457.f65538 = c20457.f65510 == 0 ? 100 : c20457.f65538;
        c20457.f65523 = Collections.singletonList(c20457.f65540);
        List list = Collections.EMPTY_LIST;
        c20457.f65547 = Collections.EMPTY_LIST;
        c20457.f65527 = new ArrayList(c20457.f65546);
        c20457.f65530 = 0L;
        m30605(c20457);
        m30596(c20457);
        m30614(c20457);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m30610(C20457 c20457) {
        for (C3303 c3303 : c20457.f65509.values()) {
            if (!m30611(c3303.f10791)) {
                c3303.f10791 = "cancelled";
            }
        }
        c20457.f65516 = true;
        c20457.f65525 = "cancelled";
        c20457.f65526 = "";
        c20457.f65549 = SystemClock.elapsedRealtime();
        c20457.f65523 = Collections.singletonList(c20457.f65540);
        List list = Collections.EMPTY_LIST;
        c20457.f65547 = Collections.EMPTY_LIST;
        c20457.f65527 = list;
        c20457.f65530 = 0L;
        m30605(c20457);
        m30596(c20457);
        m30614(c20457);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m30615(C20457 c20457, String str) {
        for (C3303 c3303 : c20457.f65509.values()) {
            if (!m30611(c3303.f10791)) {
                c3303.f10791 = k.j;
            }
        }
        c20457.f65516 = true;
        c20457.f65525 = "failure";
        c20457.f65526 = m30608(str);
        c20457.f65549 = SystemClock.elapsedRealtime();
        c20457.f65523 = Collections.singletonList(c20457.f65540);
        List list = Collections.EMPTY_LIST;
        c20457.f65547 = Collections.EMPTY_LIST;
        c20457.f65527 = list;
        c20457.f65530 = 0L;
        m30605(c20457);
        m30596(c20457);
        m30614(c20457);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30602(AbstractC22044 abstractC22044, AbstractC22044 abstractC22045, boolean z, boolean z2, C20457 c20457) throws IOException {
        if (c20457.f65539) {
            throw new CancellationException();
        }
        try {
            C6265.m17913(abstractC22044, EnumC12230.MODIFY_FILE);
            if (!z2 && abstractC22044.mo2934()) {
                throw new IOException(C21576.m49059(R.string.MT_Protector, abstractC22044.mo4294()));
            }
            if (z && abstractC22044.mo2934() && abstractC22044.mo4292()) {
                abstractC22044.mo4300(new C11506(c20457));
                abstractC22045.m49845(abstractC22044, (Runnable) null);
            } else {
                abstractC22045.m49848(abstractC22044, false, true, null);
            }
        } catch (C4866 e) {
            throw new IOException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m30592(C20457 c20457, int i) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (c20457.f65544 == 0) {
            c20457.f65544 = jElapsedRealtime;
        }
        c20457.f65515 += (long) i;
        long j = jElapsedRealtime - c20457.f65544;
        if (j < 200) {
            return c20457.f65530;
        }
        c20457.f65530 = Math.max((c20457.f65515 * 1000) / Math.max(j, 1L), 0L);
        c20457.f65544 = jElapsedRealtime;
        c20457.f65515 = 0L;
        return c20457.f65530;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static String m30612(String str) {
        return C21576.m49059(R.string.MT_Protector, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m30619(String str, List list) {
        C1170.removeIf(this.f39413.entrySet(), new C12998(SystemClock.elapsedRealtime()));
        String str2 = "fu-" + this.f39412.getAndIncrement();
        C20457 c20457 = new C20457(str2, str);
        this.f39413.put(str2, c20457);
        synchronized (c20457) {
            try {
                m30599(c20457, list);
                m30603(c20457);
                m30607(c20457);
            } catch (IOException e) {
                m30615(c20457, m30608(e.getMessage()));
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap m30625(String str) {
        LinkedHashMap linkedHashMapM30618;
        C1170.removeIf(this.f39413.entrySet(), new C12998(SystemClock.elapsedRealtime()));
        C20457 c20457 = (C20457) this.f39413.get(str);
        if (c20457 == null) {
            return null;
        }
        synchronized (c20457) {
            m30597(c20457, SystemClock.elapsedRealtime());
            m30607(c20457);
            linkedHashMapM30618 = m30618(c20457);
        }
        return linkedHashMapM30618;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static String m30608(String str) {
        return str == null ? "" : str.toString();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static boolean m30611(String str) {
        return TextUtils.equals(str, "success") || TextUtils.equals(str, "skipped") || TextUtils.equals(str, k.j) || TextUtils.equals(str, "cancelled");
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static LinkedHashMap m30618(C20457 c20457) {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("taskId", c20457.f65533);
        linkedHashMap2.put("type", "upload");
        linkedHashMap2.put("done", Boolean.valueOf(c20457.f65516));
        linkedHashMap2.put(c.a, c20457.f65525);
        linkedHashMap2.put("title", c20457.f65529);
        linkedHashMap2.put("name", c20457.f65518);
        linkedHashMap2.put("progress", Integer.valueOf(c20457.f65538));
        linkedHashMap2.put("remaining", c20457.f65508);
        linkedHashMap2.put("speed", Long.valueOf(c20457.f65530));
        linkedHashMap2.put(d.O, c20457.f65526);
        linkedHashMap2.put("refreshDirectories", c20457.f65523);
        linkedHashMap2.put("invalidatePrefixes", c20457.f65547);
        linkedHashMap2.put("pathMoves", Collections.EMPTY_LIST);
        linkedHashMap2.put("markedPaths", c20457.f65527);
        if (c20457.f65528 == null) {
            linkedHashMap = null;
        } else {
            linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("id", c20457.f65528.f51889);
            linkedHashMap.put(MotionUtils.EASING_TYPE_PATH, c20457.f65528.f51886);
            linkedHashMap.put("incoming", m30593(c20457.f65528.f51894));
            linkedHashMap.put("existing", m30593(c20457.f65528.f51893));
            linkedHashMap.put("selectedAction", c20457.f65528.f51890);
            linkedHashMap.put("recyclable", Boolean.valueOf(c20457.f65528.f51888));
            linkedHashMap.put("moveToRecycleBin", Boolean.valueOf(c20457.f65528.f51891));
        }
        linkedHashMap2.put("conflict", linkedHashMap);
        linkedHashMap2.put("resumeAction", c20457.f65511);
        linkedHashMap2.put("resumePath", c20457.f65521);
        linkedHashMap2.put("nextUploadPath", c20457.f65531);
        linkedHashMap2.put("armedPath", c20457.f65545);
        linkedHashMap2.put("armToken", c20457.f65543);
        linkedHashMap2.put("cancelRequested", Boolean.valueOf(c20457.f65539));
        return linkedHashMap2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC22044 m30595(C20457 c20457, C3303 c3303) {
        return C14584.m35193(C8284.m22373(c20457.f65540 + "/" + c3303.f10797), new String[0]);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static LinkedHashMap m30593(C21578 c21578) {
        if (c21578 == null || !c21578.m49098()) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("size", Long.valueOf(c21578.m49097()));
        linkedHashMap.put("time", Long.valueOf(c21578.m49100()));
        return linkedHashMap;
    }
}
