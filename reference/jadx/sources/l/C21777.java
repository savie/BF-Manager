package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.᩷ۗ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 07HC */
/* JADX INFO: loaded from: classes.dex */
public final class C21777 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC14162 f69438;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f69440;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public CountDownLatch f69441;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C18135 f69446;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f69447;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C3639 f69450;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractC18881 f69451;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f69448 = new AtomicInteger(0);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final LinkedBlockingQueue f69442 = new LinkedBlockingQueue();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List f69439 = C1402.m5127();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC17249 f69444 = new ConcurrentMapC17249();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f69452 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AtomicReference f69443 = new AtomicReference();

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final Object f69445 = new Object();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ThreadLocal f69449 = new ThreadLocal();

    public C21777(AbstractC18881 abstractC18881, InterfaceC23711 interfaceC23711) {
        boolean z;
        int i;
        boolean zMo35568 = false;
        this.f69451 = abstractC18881;
        this.f69440 = abstractC18881.m43792();
        String strMo35580 = abstractC18881.mo35580();
        String str = null;
        if (strMo35580 != null) {
            String strTrim = strMo35580.trim();
            String lowerCase = (strTrim.endsWith(".") ? C1402.m5124(1, 0, strTrim) : strTrim).toLowerCase(Locale.ROOT);
            if (lowerCase.startsWith("[") && lowerCase.endsWith("]") && lowerCase.length() > 2) {
                lowerCase = C1402.m5124(1, 1, lowerCase);
            }
            if (!lowerCase.isEmpty()) {
                str = lowerCase;
            }
        }
        if (str != null && !str.contains("://") && str.indexOf(47) < 0 && str.indexOf(63) < 0 && str.indexOf(35) < 0) {
            if (!str.endsWith(".local")) {
                if (str.contains(":")) {
                    if (str.indexOf(37) < 0 && C24412.m54611(str)) {
                        if (!"::1".equals(str)) {
                            int iIndexOf = str.indexOf(58);
                            if (iIndexOf > 0 && iIndexOf <= 4) {
                                String strSubstring = str.substring(0, iIndexOf);
                                if (!strSubstring.isEmpty() && strSubstring.length() <= 4) {
                                    int i2 = 0;
                                    while (true) {
                                        if (i2 < strSubstring.length()) {
                                            char cCharAt = strSubstring.charAt(i2);
                                            if ((cCharAt >= '0' && cCharAt <= '9') || (cCharAt >= 'a' && cCharAt <= 'f')) {
                                                i2++;
                                            }
                                        } else {
                                            try {
                                                int i3 = Integer.parseInt(strSubstring, 16);
                                                if ((65024 & i3) == 64512 || (i3 & 65472) == 65152) {
                                                }
                                            } catch (NumberFormatException unused) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    z = false;
                } else {
                    String[] strArrSplit = str.split("\\.", -1);
                    if (strArrSplit.length == 4) {
                        int[] iArr = new int[4];
                        int i4 = 0;
                        while (true) {
                            if (i4 >= strArrSplit.length) {
                                int i5 = iArr[0];
                                if (i5 == 10 || i5 == 127 || ((i5 == 192 && iArr[1] == 168) || ((i5 == 172 && (i = iArr[1]) >= 16 && i <= 31) || (i5 == 169 && iArr[1] == 254)))) {
                                }
                            } else if (!strArrSplit[i4].isEmpty()) {
                                int i6 = 0;
                                int i7 = 0;
                                while (true) {
                                    if (i6 < strArrSplit[i4].length()) {
                                        char cCharAt2 = strArrSplit[i4].charAt(i6);
                                        if (cCharAt2 >= '0' && cCharAt2 <= '9' && (i7 = (i7 * 10) + (cCharAt2 - '0')) <= 255) {
                                            i6++;
                                        }
                                    } else {
                                        iArr[i4] = i7;
                                        i4++;
                                    }
                                }
                            }
                        }
                    }
                    z = false;
                }
            }
            z = true;
        } else {
            z = false;
        }
        this.f69446 = new C18135(z, z ? 500L : 1000L, z ? 2L : 5L, strMo35580);
        this.f69450 = new C8942(this, C3639.m11788(interfaceC23711));
        try {
            zMo35568 = abstractC18881.mo35568();
        } catch (IOException unused2) {
        }
        this.f69447 = zMo35568;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49385(InterfaceC14162 interfaceC14162) {
        this.f69438 = interfaceC14162;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49384(String str, String str2, AbstractC22044 abstractC22044, long j, long j2, String str3, C24523 c24523, boolean z, boolean z2) {
        this.f69442.add(new C7451(str, str2, abstractC22044, j, j2, str3, c24523, z, z2));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m49387() {
        C3639 c3639;
        if (this.f69442.isEmpty()) {
            return;
        }
        int i = this.f69440;
        this.f69441 = new CountDownLatch(i);
        for (final int i2 = 0; i2 < i; i2++) {
            C5261.f18540.submit(new Runnable(i2) { // from class: l.ۖ᩹۫
                @Override // java.lang.Runnable
                public final void run() {
                    C21777.m49380(this.f9669);
                }
            });
        }
        while (true) {
            boolean zAwait = this.f69441.await(500L, TimeUnit.MILLISECONDS);
            c3639 = this.f69450;
            if (!zAwait) {
                if (c3639.mo924()) {
                    m49388();
                    break;
                }
            } else {
                break;
            }
        }
        c3639.mo11791();
        Exception exc = (Exception) this.f69443.get();
        if (exc == null) {
            return;
        }
        C22327.m50389(exc);
        throw exc;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m49388() {
        this.f69452.set(true);
        for (C15063 c15063 : this.f69444.values()) {
            synchronized (c15063) {
                if (!c15063.f49188) {
                    c15063.f49188 = true;
                    synchronized (c15063.f49183) {
                        C20244.m46520(c15063.f49183);
                    }
                    c15063.f49185.mo4296();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m49386() {
        return this.f69452.get();
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0025, code lost:
    
        if (r2 != null) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0029, code lost:
    
        android.os.SystemClock.sleep(100);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002d, code lost:
    
        r3 = (l.C15063) r7.f69444.get(r2.f72859);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0038, code lost:
    
        if (r3 != null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003a, code lost:
    
        r0 = r7.f69445;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003c, code lost:
    
        monitor-enter(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003d, code lost:
    
        r7.f69439.remove(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
    
        monitor-exit(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0047, code lost:
    
        r3.f49174.incrementAndGet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004c, code lost:
    
        r2.m50749(r7.f69451, r3, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0051, code lost:
    
        r0 = r7.f69445;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0053, code lost:
    
        monitor-enter(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0054, code lost:
    
        r7.f69439.remove(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0059, code lost:
    
        monitor-exit(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005a, code lost:
    
        r3.m36295(r2, r1.mo924());
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0063, code lost:
    
        if (r3.f49188 == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x006b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x006e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x006f, code lost:
    
        r4 = r3.f49180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x007f, code lost:
    
        r4 = r7.f69443;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0090, code lost:
    
        monitor-enter(r7.f69445);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0091, code lost:
    
        r7.f69439.remove(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0097, code lost:
    
        r3.m36295(r2, r1.mo924());
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a0, code lost:
    
        if (r3.f49188 != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00a3, code lost:
    
        r7.f69444.remove(r2.f72859);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00af, code lost:
    
        monitor-enter(r7.f69445);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00b0, code lost:
    
        r7.f69439.remove(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00b6, code lost:
    
        r3.m36295(r2, r1.mo924());
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00bf, code lost:
    
        if (r3.f49188 != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00c1, code lost:
    
        r7.f69444.remove(r2.f72859);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00c8, code lost:
    
        throw r0;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m49380(l.C21777 r7) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21777.m49380(l.᩷ۗ۫):void");
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private C22523 m49383() {
        C4623 c4623;
        int size;
        C7451 c7451 = (C7451) this.f69442.poll();
        if (c7451 != null) {
            try {
                int iIncrementAndGet = this.f69448.incrementAndGet();
                String strSubstring = c7451.f24552;
                AbstractC22044 abstractC22044 = c7451.f24548;
                int iLastIndexOf = strSubstring.lastIndexOf(47);
                if (iLastIndexOf >= 0) {
                    strSubstring = strSubstring.substring(iLastIndexOf + 1);
                }
                String str = strSubstring;
                abstractC22044.mo49834();
                boolean zMo2934 = abstractC22044.mo2934();
                AbstractC22044 abstractC22044M49839 = zMo2934 ? abstractC22044.m49868(str + ".downloading").m49839(true) : abstractC22044;
                C13961 c13961M49855 = abstractC22044M49839.m49855("rw");
                c13961M49855.setLength(c7451.f24549);
                C15063 c15063 = new C15063(iIncrementAndGet, c7451.f24553, str, c7451.f24552, c7451.f24548, abstractC22044M49839, zMo2934, c13961M49855, c7451.f24549, c7451.f24555, c7451.f24550, c7451.f24554, c7451.f24556, c7451.f24551, this.f69449, this.f69438);
                this.f69444.put(c7451.f24552, c15063);
                int iIncrementAndGet2 = c15063.f49186.incrementAndGet();
                String str2 = c7451.f24552;
                long j = c7451.f24549;
                C22523 c22523 = new C22523(iIncrementAndGet, str, iIncrementAndGet2, str2, j, 0L, j, c13961M49855);
                this.f69439.add(c22523);
                return c22523;
            } catch (IOException e) {
                AtomicReference atomicReference = this.f69443;
                while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                }
                return null;
            }
        }
        if (!this.f69447) {
            return null;
        }
        synchronized (this.f69439) {
            ArrayList<C4623> arrayList = new ArrayList();
            double d = 0.0d;
            long j2 = 0;
            for (C22523 c22524 : this.f69439) {
                C15063 c15064 = (C15063) this.f69444.get(c22524.f72859);
                if (c15064 != null) {
                    if (c15064.f49180.get() != null) {
                    }
                }
                long j3 = c22524.f72862 - c22524.f72855.get();
                long jM31994 = c22524.f72856.m31994();
                double d2 = j3;
                double d3 = d2 / 1048576.0d;
                if (jM31994 > 0) {
                    d3 = d2 / jM31994;
                } else if (j3 <= 52428800) {
                    d3 = -1.0d;
                }
                if (d3 >= 0.0d) {
                    arrayList.add(new C4623(c22524, c15064, j3, d3));
                    d += d3;
                    j2 += j3;
                }
            }
            double d4 = 0.0d;
            if (d <= 0.0d || j2 <= 0) {
                c4623 = null;
            } else {
                c4623 = null;
                for (C4623 c4624 : arrayList) {
                    double d5 = d;
                    C4623 c4625 = c4623;
                    double d6 = ((c4624.f16378 / j2) * 0.3d) + ((c4624.f16380 / d) * 0.7d);
                    if (d6 > d4) {
                        d4 = d6;
                        c4623 = c4624;
                    } else {
                        c4623 = c4625;
                    }
                    d = d5;
                }
            }
        }
        if (c4623 == null || (size = this.f69440 - this.f69439.size()) <= 0) {
            return null;
        }
        C22523 c22523M50748 = c4623.f16379.m50748(c4623.f16381, size, this.f69446);
        if (c22523M50748 != null) {
            this.f69439.add(c22523M50748);
        }
        return c22523M50748;
    }
}
