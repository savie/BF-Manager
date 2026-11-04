package l;

import android.os.SystemClock;
import android.util.Log;
import android.util.SparseLongArray;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.Writer;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ۧۨۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q1K7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11594 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC17249 f36394;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20528 f36395;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C9378 f36396;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC17249 f36397;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public volatile boolean f36398;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C16503 f36399;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C9378 f36400;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C9378 f36403;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C9378 f36404;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C5629 f36405;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C20283 f36406;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f36401 = new AtomicInteger();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f36402 = new AtomicInteger();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f36407 = new AtomicInteger();

    public C11594(C20283 c20283) throws IOException {
        ConcurrentMapC17249 concurrentMapC17249 = new ConcurrentMapC17249();
        this.f36394 = concurrentMapC17249;
        C16503 c16503NewKeySet = ConcurrentMapC17249.newKeySet();
        this.f36399 = c16503NewKeySet;
        this.f36397 = new ConcurrentMapC17249();
        this.f36395 = new C20528();
        this.f36406 = c20283;
        C9378 c9378 = new C9378(c20283.m11158(), "smali");
        this.f36404 = c9378;
        if (c9378.m24699().mo4304()) {
            c9378.m24697();
        }
        c9378.m24699().m49853();
        C9378 c9379 = new C9378(c9378, "x");
        this.f36403 = c9379;
        C9378 c93710 = new C9378(c9378, "y");
        this.f36396 = c93710;
        this.f36400 = new C9378(c9378, "f");
        if (!C18121.m42239(c9378.m24699())) {
            m29139();
        } else {
            try {
                SparseLongArray sparseLongArray = new SparseLongArray();
                m29130(c9379, true, sparseLongArray);
                m29130(c93710, false, sparseLongArray);
                m29140();
                if (concurrentMapC17249.isEmpty() && c16503NewKeySet.isEmpty()) {
                    m29139();
                }
            } catch (IOException unused) {
                m29139();
            }
        }
        this.f36405 = new C5629(this);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m29140() throws IOException {
        C9378 c9378 = this.f36400;
        if (c9378.m24702()) {
            DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(c9378.m24703()));
            while (dataInputStream.available() > 0) {
                try {
                    this.f36399.add(C18121.m42237(dataInputStream));
                } catch (Throwable th) {
                    try {
                        dataInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            dataInputStream.close();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m29130(C9378 c9378, boolean z, SparseLongArray sparseLongArray) throws IOException {
        String strM42237;
        long jMo4285;
        if (c9378.m24702()) {
            DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(c9378.m24703()));
            while (dataInputStream.available() > 0) {
                try {
                    if (!z) {
                        strM42237 = C18121.m42237(dataInputStream);
                    } else {
                        strM42237 = dataInputStream.readUTF();
                    }
                    int unsignedShort = dataInputStream.readUnsignedShort();
                    int i = dataInputStream.readInt();
                    int i2 = dataInputStream.readInt();
                    int iIndexOfKey = sparseLongArray.indexOfKey(unsignedShort);
                    if (iIndexOfKey >= 0) {
                        jMo4285 = sparseLongArray.valueAt(iIndexOfKey);
                    } else {
                        AbstractC22044 abstractC22044M24694 = this.f36404.m24694(String.valueOf(unsignedShort));
                        if (!abstractC22044M24694.mo4304()) {
                            throw new IOException("Missing smali cache data file");
                        }
                        jMo4285 = abstractC22044M24694.mo4285();
                        sparseLongArray.put(unsignedShort, jMo4285);
                    }
                    if (i >= 0 && i2 > 0 && ((long) i) + ((long) i2) <= jMo4285) {
                        this.f36394.put(strM42237, new C1900(unsignedShort, i, i2));
                    } else {
                        throw new IOException("Invalid smali cache offset");
                    }
                } catch (Throwable th) {
                    try {
                        dataInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            dataInputStream.close();
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private void m29139() throws IOException {
        this.f36394.clear();
        this.f36399.clear();
        this.f36397.clear();
        C9378 c9378 = this.f36404;
        C9378[] c9378ArrM24698 = c9378.m24698();
        if (c9378ArrM24698 != null) {
            for (C9378 c9379 : c9378ArrM24698) {
                if (c9379.m24702() && !c9379.m24697()) {
                    throw new IOException("Unable to delete smali cache file");
                }
            }
        }
        C18121.m42242(c9378.m24699());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m29137(String str) {
        return (this.f36394.containsKey(str) || this.f36399.contains(str)) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29146(ActivityC0848 activityC0848) {
        AbstractC8585 lifecycle = activityC0848.getLifecycle();
        final AtomicReference atomicReference = activityC0848.f3192;
        if (lifecycle.mo23076() == EnumC2619.DESTROYED) {
            return;
        }
        lifecycle.mo23077(new C13086(this));
        this.f36405.m16613();
        this.f36398 = false;
        final int iIncrementAndGet = this.f36401.incrementAndGet();
        final C20168 c20168 = (C20168) lifecycle;
        Thread thread = new Thread(new Runnable() { // from class: l.ۤۨۧ
            @Override // java.lang.Runnable
            public final void run() {
                C11594.m29131(this.f34350, iIncrementAndGet, c20168, atomicReference);
            }
        });
        thread.setName("SmaliCache-1");
        thread.start();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m29131(final C11594 c11594, int i, C20168 c20168, AtomicReference atomicReference) {
        C5629 c5629 = c11594.f36405;
        System.out.println("SmaliCache prepare");
        AtomicInteger atomicInteger = c11594.f36402;
        atomicInteger.incrementAndGet();
        try {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            for (C19382 c19382 : c11594.f36406.m46608()) {
                if (c19382.f62624 != null) {
                    i2++;
                    if (c19382.f62623 == null && c11594.m29137(c19382.f62622)) {
                        arrayList.add(c19382);
                    }
                }
            }
            Collections.sort(arrayList, C19382.f62619);
            C3374 c3374 = new C3374(i2);
            c3374.m11078(new C22783());
            c3374.m11079(i2 - arrayList.size());
            final C19799 c19799 = new C19799(c11594, new AtomicInteger(), arrayList, i, c20168, atomicReference, c3374);
            int i3 = C11138.f35105 >= 4 ? 3 : 2;
            for (int i4 = 2; i4 <= i3; i4++) {
                final int i5 = i4 - 1;
                Thread thread = new Thread(new Runnable() { // from class: l.ܳۨۧ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C11594.m29133(this.f50061, c19799, i5);
                    }
                });
                thread.setName("SmaliCache-" + i4);
                thread.start();
            }
            c19799.accept(0);
        } finally {
            if (atomicInteger.decrementAndGet() == 0) {
                c5629.m16613();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29132(C11594 c11594, AtomicInteger atomicInteger, ArrayList arrayList, int i, C20168 c20168, AtomicReference atomicReference, C3374 c3374, int i2) {
        System.out.println(Thread.currentThread().getName() + " start");
        C21105 c21105 = new C21105();
        while (true) {
            int andIncrement = atomicInteger.getAndIncrement();
            if (andIncrement >= arrayList.size()) {
                System.out.println(Thread.currentThread().getName() + " finish");
                return;
            }
            C19382 c19382 = (C19382) arrayList.get(andIncrement);
            if (c11594.f36401.get() != i || c20168.mo23076() == EnumC2619.DESTROYED) {
                System.out.println(Thread.currentThread().getName() + " canceled");
                return;
            }
            if (c11594.f36398 || !c20168.mo23076().m8762(EnumC2619.RESUMED) || (i2 > 0 && atomicReference.get() != C13831.class)) {
                System.out.println(Thread.currentThread().getName() + " paused");
                c11594.f36407.incrementAndGet();
                while (true) {
                    if (!c11594.f36398 && c20168.mo23076().m8762(EnumC2619.RESUMED) && (i2 <= 0 || atomicReference.get() == C13831.class)) {
                        break;
                    }
                    if (c11594.f36401.get() != i || c20168.mo23076() == EnumC2619.DESTROYED) {
                        System.out.println(Thread.currentThread().getName() + " canceled");
                        return;
                    }
                    SystemClock.sleep(500L);
                }
                c11594.f36407.decrementAndGet();
                System.out.println(Thread.currentThread().getName() + " resumed");
            }
            if (i2 == 0 && atomicReference.get() != C13831.class) {
                long jFreeMemory = Runtime.getRuntime().freeMemory();
                if (jFreeMemory < 262144) {
                    SystemClock.sleep(250L);
                } else if (jFreeMemory < 524288) {
                    SystemClock.sleep(100L);
                } else if (jFreeMemory < 1048576) {
                    SystemClock.sleep(50L);
                } else if (jFreeMemory < 2097152) {
                    SystemClock.sleep(10L);
                }
            }
            if (c11594.m29137(c19382.f62622)) {
                try {
                    c11594.m29136(c19382, c21105);
                } catch (Throwable unused) {
                }
            }
            c3374.m11079(1);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m29133(C11594 c11594, C19799 c19799, int i) {
        C5629 c5629 = c11594.f36405;
        AtomicInteger atomicInteger = c11594.f36402;
        atomicInteger.incrementAndGet();
        try {
            c19799.accept(i);
        } finally {
            if (atomicInteger.decrementAndGet() == 0) {
                c5629.m16613();
            }
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x006b */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m29136(l.C19382 r5, l.C21105 r6) throws java.io.IOException {
        /*
            r4 = this;
            l.۟ܽۤ r0 = r6.m48177()
            r4.m29134(r5, r0)     // Catch: java.lang.Throwable -> L7e
            r0.close()
            java.lang.String r5 = r5.f62622
            boolean r0 = r4.m29137(r5)
            if (r0 != 0) goto L13
            goto L77
        L13:
            boolean r0 = r6.m48179()
            if (r0 == 0) goto L6e
            l.ۚۨۧ r6 = r4.f36405
            r0 = r6
            monitor-enter(r0)
            l.ۧۨۧ r1 = r6.f19466     // Catch: java.lang.Throwable -> L6b
            l.ܽ֫ۗ r1 = r1.f36394     // Catch: java.lang.Throwable -> L6b
            boolean r1 = r1.containsKey(r5)     // Catch: java.lang.Throwable -> L6b
            if (r1 != 0) goto L69
            l.ۧۨۧ r1 = r6.f19466     // Catch: java.lang.Throwable -> L6b
            l.ܺ֫ۗ r1 = r1.f36399     // Catch: java.lang.Throwable -> L6b
            boolean r1 = r1.contains(r5)     // Catch: java.lang.Throwable -> L6b
            if (r1 == 0) goto L32
            goto L69
        L32:
            l.ۛܽۤ r1 = r6.f19472     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L6b
            if (r1 != 0) goto L4a
            l.ۛܽۤ r1 = new l.ۛܽۤ     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L6b
            l.ۧۨۧ r2 = r6.f19466     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L6b
            l.ۡ۫ۧ r2 = r2.f36400     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L6b
            l.᩷ۨᩴ r2 = r2.m24699()     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L6b
            r3 = 1
            java.io.OutputStream r2 = r2.mo4289(r3)     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L6b
            r1.<init>(r2)     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L6b
            r6.f19472 = r1     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L6b
        L4a:
            l.ۛܽۤ r1 = r6.f19472     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L6b
            int r2 = l.C21443.m48759(r5)     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L6b
            l.C18121.m42238(r1, r2)     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L6b
            l.C21443.m48762(r1, r5)     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L6b
            l.ۛܽۤ r1 = r6.f19472     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L6b
            r1.flush()     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L6b
            l.ۧۨۧ r1 = r6.f19466     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L6b
            l.ܺ֫ۗ r1 = r1.f36399     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L6b
            r1.add(r5)     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L6b
            monitor-exit(r0)
            return
        L64:
            r5 = move-exception
            r6.m16613()     // Catch: java.lang.Throwable -> L6b
            throw r5     // Catch: java.lang.Throwable -> L6b
        L69:
            monitor-exit(r0)
            return
        L6b:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6b
            throw r5
        L6e:
            r6.m48172()
            boolean r0 = r4.m29137(r5)
            if (r0 != 0) goto L78
        L77:
            return
        L78:
            l.ۚۨۧ r0 = r4.f36405
            r0.m16612(r5, r6)
            return
        L7e:
            r5 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L83
            goto L87
        L83:
            r6 = move-exception
            r5.addSuppressed(r6)
        L87:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11594.m29136(l.ᩳ᩹ۧ, l.᩶ۚ᩸):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29147(C19382 c19382, C0560 c0560) {
        try {
            C1900 c1900 = (C1900) this.f36394.get(c19382.f62622);
            if (c1900 != null) {
                m29135(c19382, c1900, c0560);
                return;
            }
        } catch (IOException unused) {
        }
        try {
            m29134(c19382, (Writer) c0560);
        } catch (Throwable th) {
            c0560.m2567();
            c0560.append((CharSequence) Log.getStackTraceString(th));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m29135(C19382 c19382, C1900 c1900, C0560 c0560) throws IOException {
        int i;
        byte[] bArrM49865;
        String str = c19382.f62622;
        int i2 = c1900.f6397;
        Reference reference = (Reference) this.f36397.get(Integer.valueOf(i2));
        byte[] bArr = reference != null ? (byte[]) reference.get() : null;
        if (bArr == null) {
            synchronized (this.f36397) {
                Reference reference2 = (Reference) this.f36397.get(Integer.valueOf(i2));
                bArrM49865 = reference2 != null ? (byte[]) reference2.get() : null;
                if (bArrM49865 == null) {
                    try {
                        bArrM49865 = this.f36404.m24694(String.valueOf(i2)).m49865();
                        this.f36397.put(Integer.valueOf(i2), new SoftReference(bArrM49865));
                    } catch (IOException unused) {
                        bArr = new byte[0];
                    }
                }
            }
            bArr = bArrM49865;
        }
        int i3 = c1900.f6398;
        if (i3 < 0 || (i = c1900.f6399) <= 0 || ((long) i3) + ((long) i) > bArr.length) {
            throw new IOException("Smali cache data range is invalid");
        }
        C21105 c21105 = (C21105) this.f36395.m47061();
        if (c21105 == null) {
            c21105 = new C21105();
        }
        try {
            c21105.m48173(c1900.f6398, c1900.f6399, bArr);
            C21443.m48765(c21105.m48176(), c21105.m48175(), c0560);
        } finally {
            this.f36395.m47060(c21105);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m29134(C19382 c19382, Writer writer) throws IOException {
        String name = c19382.f62624.getName();
        C20283 c20283 = this.f36406;
        C22737 c22737 = new C22737(c20283.m46612(name), c19382.f62620, c19382.f62625);
        if (c20283.m46599()) {
            writer.write("# ");
            writer.write(c19382.f62621);
            writer.write(".dex\n\n");
        }
        C13021.m32450(writer, c22737, c20283.m46596(c19382.f62621));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m29143(C11594 c11594, int i) {
        c11594.f36397.remove(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC22044 m29129(C11594 c11594, int i) {
        return c11594.f36404.m24694(String.valueOf(i));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m29148() {
        this.f36401.incrementAndGet();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29145() {
        this.f36398 = true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m29150() {
        this.f36405.m16611();
        this.f36398 = false;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m29151() {
        while (true) {
            AtomicInteger atomicInteger = this.f36402;
            if (atomicInteger.get() <= 0 || this.f36407.get() >= atomicInteger.get()) {
                return;
            } else {
                SystemClock.sleep(100L);
            }
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m29149() {
        if (this.f36402.get() > 0) {
            SystemClock.sleep(100L);
        }
    }
}
