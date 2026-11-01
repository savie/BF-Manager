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

/* JADX INFO: renamed from: l.ۘ֨֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 07HC */
/* JADX INFO: loaded from: classes2.dex */
public final class C3599 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C4516 f13239;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public InterfaceC0777 f13240;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public CountDownLatch f13244;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f13245;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C19994 f13247;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AbstractC12233 f13249;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f13250;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f13242 = new AtomicInteger(0);

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final LinkedBlockingQueue f13243 = new LinkedBlockingQueue();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List f13241 = C11445.m28558();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC13783 f13251 = new ConcurrentMapC13783();

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f13252 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final AtomicReference f13238 = new AtomicReference();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Object f13248 = new Object();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ThreadLocal f13246 = new ThreadLocal();

    public C3599(AbstractC12233 abstractC12233, InterfaceC8978 interfaceC8978) {
        boolean z;
        int i;
        boolean zMo19632 = false;
        this.f13249 = abstractC12233;
        this.f13245 = abstractC12233.m30349();
        String strMo10279 = abstractC12233.mo10279();
        String str = null;
        if (strMo10279 != null) {
            String strTrim = strMo10279.trim();
            String lowerCase = (strTrim.endsWith(".") ? C20630.m46498(1, 0, strTrim) : strTrim).toLowerCase(Locale.ROOT);
            if (lowerCase.startsWith("[") && lowerCase.endsWith("]") && lowerCase.length() > 2) {
                lowerCase = C20630.m46498(1, 1, lowerCase);
            }
            if (!lowerCase.isEmpty()) {
                str = lowerCase;
            }
        }
        if (str != null && !str.contains("://") && str.indexOf(47) < 0 && str.indexOf(63) < 0 && str.indexOf(35) < 0) {
            if (!str.endsWith(".local")) {
                if (str.contains(":")) {
                    if (str.indexOf(37) < 0 && C19862.m45114(str)) {
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
        this.f13247 = new C19994(z, z ? 500L : 1000L, z ? 2L : 5L, strMo10279);
        this.f13239 = new C5011(this, C4516.m12618(interfaceC8978));
        try {
            zMo19632 = abstractC12233.mo19632();
        } catch (IOException unused2) {
        }
        this.f13250 = zMo19632;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10682(InterfaceC0777 interfaceC0777) {
        this.f13240 = interfaceC0777;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10681(String str, String str2, AbstractC20745 abstractC20745, long j, long j2, String str3, C5222 c5222, boolean z, boolean z2) {
        this.f13243.add(new C21945(str, str2, abstractC20745, j, j2, str3, c5222, z, z2));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m10684() {
        C4516 c4516;
        if (this.f13243.isEmpty()) {
            return;
        }
        int i = this.f13245;
        this.f13244 = new CountDownLatch(i);
        for (final int i2 = 0; i2 < i; i2++) {
            C4716.f16636.submit(new Runnable(i2) { // from class: l.ۖ֨֨
                @Override // java.lang.Runnable
                public final void run() {
                    C3599.m10678(this.f7931);
                }
            });
        }
        while (true) {
            boolean zAwait = this.f13244.await(500L, TimeUnit.MILLISECONDS);
            c4516 = this.f13239;
            if (!zAwait) {
                if (c4516.mo2357()) {
                    m10685();
                    break;
                }
            } else {
                break;
            }
        }
        c4516.mo10128();
        Exception exc = (Exception) this.f13238.get();
        if (exc != null) {
            throw exc;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m10685() {
        this.f13252.set(true);
        for (C21239 c21239 : this.f13251.values()) {
            synchronized (c21239) {
                if (!c21239.f69173) {
                    c21239.f69173 = true;
                    synchronized (c21239.f69185) {
                        C19431.m44468(c21239.f69185);
                    }
                    c21239.f69176.mo24647();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m10683() {
        return this.f13252.get();
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
    
        r3 = (l.C21239) r7.f13251.get(r2.f73788);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0038, code lost:
    
        if (r3 != null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003a, code lost:
    
        r0 = r7.f13248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003c, code lost:
    
        monitor-enter(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003d, code lost:
    
        r7.f13241.remove(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
    
        monitor-exit(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0047, code lost:
    
        r3.f69175.incrementAndGet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004c, code lost:
    
        r2.m50184(r7.f13249, r3, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0051, code lost:
    
        r0 = r7.f13248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0053, code lost:
    
        monitor-enter(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0054, code lost:
    
        r7.f13241.remove(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0059, code lost:
    
        monitor-exit(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005a, code lost:
    
        r3.m47721(r2, r1.mo2357());
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0063, code lost:
    
        if (r3.f69173 == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x006b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x006e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x006f, code lost:
    
        r4 = r3.f69172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x007f, code lost:
    
        r4 = r7.f13238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0090, code lost:
    
        monitor-enter(r7.f13248);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0091, code lost:
    
        r7.f13241.remove(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0097, code lost:
    
        r3.m47721(r2, r1.mo2357());
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a0, code lost:
    
        if (r3.f69173 != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00a3, code lost:
    
        r7.f13251.remove(r2.f73788);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00af, code lost:
    
        monitor-enter(r7.f13248);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00b0, code lost:
    
        r7.f13241.remove(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00b6, code lost:
    
        r3.m47721(r2, r1.mo2357());
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00bf, code lost:
    
        if (r3.f69173 != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00c1, code lost:
    
        r7.f13251.remove(r2.f73788);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00c8, code lost:
    
        throw r0;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m10678(l.C3599 r7) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3599.m10678(l.ۘ֨֨):void");
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private C22651 m10677() {
        C12773 c12773;
        int size;
        C21945 c21945 = (C21945) this.f13243.poll();
        if (c21945 != null) {
            try {
                int iIncrementAndGet = this.f13242.incrementAndGet();
                String strSubstring = c21945.f71183;
                AbstractC20745 abstractC20745 = c21945.f71185;
                int iLastIndexOf = strSubstring.lastIndexOf(47);
                if (iLastIndexOf >= 0) {
                    strSubstring = strSubstring.substring(iLastIndexOf + 1);
                }
                String str = strSubstring;
                abstractC20745.mo46720();
                boolean zMo33975 = abstractC20745.mo33975();
                AbstractC20745 abstractC20745M46693 = zMo33975 ? abstractC20745.m46706(str + ".downloading").m46693(true) : abstractC20745;
                C1388 c1388M46710 = abstractC20745M46693.m46710("rw");
                c1388M46710.setLength(c21945.f71186);
                C21239 c21239 = new C21239(iIncrementAndGet, c21945.f71191, str, c21945.f71183, c21945.f71185, abstractC20745M46693, zMo33975, c1388M46710, c21945.f71186, c21945.f71190, c21945.f71189, c21945.f71187, c21945.f71184, c21945.f71188, this.f13246, this.f13240);
                this.f13251.put(c21945.f71183, c21239);
                int iIncrementAndGet2 = c21239.f69188.incrementAndGet();
                String str2 = c21945.f71183;
                long j = c21945.f71186;
                C22651 c22651 = new C22651(iIncrementAndGet, str, iIncrementAndGet2, str2, j, 0L, j, c1388M46710);
                this.f13241.add(c22651);
                return c22651;
            } catch (IOException e) {
                AtomicReference atomicReference = this.f13238;
                while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                }
                return null;
            }
        }
        if (!this.f13250) {
            return null;
        }
        synchronized (this.f13241) {
            ArrayList<C12773> arrayList = new ArrayList();
            double d = 0.0d;
            long j2 = 0;
            for (C22651 c22652 : this.f13241) {
                C21239 c212310 = (C21239) this.f13251.get(c22652.f73788);
                if (c212310 != null) {
                    if (c212310.f69172.get() != null) {
                    }
                }
                long j3 = c22652.f73796 - c22652.f73791.get();
                long jM39496 = c22652.f73795.m39496();
                double d2 = j3;
                double d3 = d2 / 1048576.0d;
                if (jM39496 > 0) {
                    d3 = d2 / jM39496;
                } else if (j3 <= 52428800) {
                    d3 = -1.0d;
                }
                if (d3 >= 0.0d) {
                    arrayList.add(new C12773(c22652, c212310, j3, d3));
                    d += d3;
                    j2 += j3;
                }
            }
            double d4 = 0.0d;
            if (d <= 0.0d || j2 <= 0) {
                c12773 = null;
            } else {
                c12773 = null;
                for (C12773 c12774 : arrayList) {
                    double d5 = d;
                    C12773 c12775 = c12773;
                    double d6 = ((c12774.f42589 / j2) * 0.3d) + ((c12774.f42591 / d) * 0.7d);
                    if (d6 > d4) {
                        d4 = d6;
                        c12773 = c12774;
                    } else {
                        c12773 = c12775;
                    }
                    d = d5;
                }
            }
        }
        if (c12773 == null || (size = this.f13245 - this.f13241.size()) <= 0) {
            return null;
        }
        C22651 c22651M50183 = c12773.f42590.m50183(c12773.f42588, size, this.f13247);
        if (c22651M50183 != null) {
            this.f13241.add(c22651M50183);
        }
        return c22651M50183;
    }
}
