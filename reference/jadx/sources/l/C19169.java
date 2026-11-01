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

/* JADX INFO: renamed from: l.᩵ۖۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q1K7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19169 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C4609 f61897;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C6094 f61898;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC13783 f61899;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19805 f61900;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C13626 f61901;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public volatile boolean f61902;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC13783 f61903;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C13626 f61904;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C18463 f61905;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C13626 f61908;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C13626 f61909;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f61907 = new AtomicInteger();

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f61906 = new AtomicInteger();

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f61910 = new AtomicInteger();

    public C19169(C6094 c6094) throws IOException {
        ConcurrentMapC13783 concurrentMapC13783 = new ConcurrentMapC13783();
        this.f61899 = concurrentMapC13783;
        C4609 c4609NewKeySet = ConcurrentMapC13783.newKeySet();
        this.f61897 = c4609NewKeySet;
        this.f61903 = new ConcurrentMapC13783();
        this.f61900 = new C19805();
        this.f61898 = c6094;
        C13626 c13626 = new C13626(c6094.m47184(), "smali");
        this.f61901 = c13626;
        if (c13626.m33318().mo33971()) {
            c13626.m33323();
        }
        c13626.m33318().m46739();
        C13626 c13627 = new C13626(c13626, "x");
        this.f61908 = c13627;
        C13626 c13628 = new C13626(c13626, "y");
        this.f61904 = c13628;
        this.f61909 = new C13626(c13626, "f");
        if (!C6069.m16469(c13626.m33318())) {
            m43978();
        } else {
            try {
                SparseLongArray sparseLongArray = new SparseLongArray();
                m43985(c13627, true, sparseLongArray);
                m43985(c13628, false, sparseLongArray);
                m43994();
                if (concurrentMapC13783.isEmpty() && c4609NewKeySet.isEmpty()) {
                    m43978();
                }
            } catch (IOException unused) {
                m43978();
            }
        }
        this.f61905 = new C18463(this);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m43994() throws IOException {
        C13626 c13626 = this.f61909;
        if (c13626.m33326()) {
            DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(c13626.m33328()));
            while (dataInputStream.available() > 0) {
                try {
                    this.f61897.add(C6069.m16467(dataInputStream));
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
    private void m43985(C13626 c13626, boolean z, SparseLongArray sparseLongArray) throws IOException {
        String strM16467;
        long jMo33964;
        if (c13626.m33326()) {
            DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(c13626.m33328()));
            while (dataInputStream.available() > 0) {
                try {
                    if (!z) {
                        strM16467 = C6069.m16467(dataInputStream);
                    } else {
                        strM16467 = dataInputStream.readUTF();
                    }
                    int unsignedShort = dataInputStream.readUnsignedShort();
                    int i = dataInputStream.readInt();
                    int i2 = dataInputStream.readInt();
                    int iIndexOfKey = sparseLongArray.indexOfKey(unsignedShort);
                    if (iIndexOfKey >= 0) {
                        jMo33964 = sparseLongArray.valueAt(iIndexOfKey);
                    } else {
                        AbstractC20745 abstractC20745M33320 = this.f61901.m33320(String.valueOf(unsignedShort));
                        if (!abstractC20745M33320.mo33971()) {
                            throw new IOException("Missing smali cache data file");
                        }
                        jMo33964 = abstractC20745M33320.mo33964();
                        sparseLongArray.put(unsignedShort, jMo33964);
                    }
                    if (i >= 0 && i2 > 0 && ((long) i) + ((long) i2) <= jMo33964) {
                        this.f61899.put(strM16467, new C7880(unsignedShort, i, i2));
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

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private void m43978() throws IOException {
        this.f61899.clear();
        this.f61897.clear();
        this.f61903.clear();
        C13626 c13626 = this.f61901;
        C13626[] c13626ArrM33325 = c13626.m33325();
        if (c13626ArrM33325 != null) {
            for (C13626 c13627 : c13626ArrM33325) {
                if (c13627.m33326() && !c13627.m33323()) {
                    throw new IOException("Unable to delete smali cache file");
                }
            }
        }
        C6069.m16472(c13626.m33318());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m43989(String str) {
        return (this.f61899.containsKey(str) || this.f61897.contains(str)) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43998(ActivityC5677 activityC5677) {
        AbstractC3062 lifecycle = activityC5677.getLifecycle();
        final AtomicReference atomicReference = activityC5677.f19361;
        if (lifecycle.mo9170() == EnumC9414.DESTROYED) {
            return;
        }
        lifecycle.mo9171(new C17757(this));
        this.f61905.m42825();
        this.f61902 = false;
        final int iIncrementAndGet = this.f61907.incrementAndGet();
        final C4245 c4245 = (C4245) lifecycle;
        Thread thread = new Thread(new Runnable() { // from class: l.ۜۖۜ
            @Override // java.lang.Runnable
            public final void run() {
                C19169.m43986(this.f21840, iIncrementAndGet, c4245, atomicReference);
            }
        });
        thread.setName("SmaliCache-1");
        thread.start();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m43986(final C19169 c19169, int i, C4245 c4245, AtomicReference atomicReference) {
        C18463 c18463 = c19169.f61905;
        System.out.println("SmaliCache prepare");
        AtomicInteger atomicInteger = c19169.f61906;
        atomicInteger.incrementAndGet();
        try {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            for (C2565 c2565 : c19169.f61898.m16565()) {
                if (c2565.f10123 != null) {
                    i2++;
                    if (c2565.f10121 == null && c19169.m43989(c2565.f10124)) {
                        arrayList.add(c2565);
                    }
                }
            }
            Collections.sort(arrayList, C2565.f10117);
            C8516 c8516 = new C8516(i2);
            c8516.m22241(new C22697());
            c8516.m22242(i2 - arrayList.size());
            final C14936 c14936 = new C14936(c19169, new AtomicInteger(), arrayList, i, c4245, atomicReference, c8516);
            int i3 = C5464.f18831 >= 4 ? 3 : 2;
            for (int i4 = 2; i4 <= i3; i4++) {
                final int i5 = i4 - 1;
                Thread thread = new Thread(new Runnable() { // from class: l.᩸ۖۜ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C19169.m43988(this.f69281, c14936, i5);
                    }
                });
                thread.setName("SmaliCache-" + i4);
                thread.start();
            }
            c14936.accept(0);
        } finally {
            if (atomicInteger.decrementAndGet() == 0) {
                c18463.m42825();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43987(C19169 c19169, AtomicInteger atomicInteger, ArrayList arrayList, int i, C4245 c4245, AtomicReference atomicReference, C8516 c8516, int i2) {
        System.out.println(Thread.currentThread().getName() + " start");
        C17358 c17358 = new C17358();
        while (true) {
            int andIncrement = atomicInteger.getAndIncrement();
            if (andIncrement >= arrayList.size()) {
                System.out.println(Thread.currentThread().getName() + " finish");
                return;
            }
            C2565 c2565 = (C2565) arrayList.get(andIncrement);
            if (c19169.f61907.get() != i || c4245.mo9170() == EnumC9414.DESTROYED) {
                System.out.println(Thread.currentThread().getName() + " canceled");
                return;
            }
            if (c19169.f61902 || !c4245.mo9170().m24173(EnumC9414.RESUMED) || (i2 > 0 && atomicReference.get() != C0906.class)) {
                System.out.println(Thread.currentThread().getName() + " paused");
                c19169.f61910.incrementAndGet();
                while (true) {
                    if (!c19169.f61902 && c4245.mo9170().m24173(EnumC9414.RESUMED) && (i2 <= 0 || atomicReference.get() == C0906.class)) {
                        break;
                    }
                    if (c19169.f61907.get() != i || c4245.mo9170() == EnumC9414.DESTROYED) {
                        System.out.println(Thread.currentThread().getName() + " canceled");
                        return;
                    }
                    SystemClock.sleep(500L);
                }
                c19169.f61910.decrementAndGet();
                System.out.println(Thread.currentThread().getName() + " resumed");
            }
            if (i2 == 0 && atomicReference.get() != C0906.class) {
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
            if (c19169.m43989(c2565.f10124)) {
                try {
                    c19169.m43984(c2565, c17358);
                } catch (Throwable unused) {
                }
            }
            c8516.m22242(1);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m43988(C19169 c19169, C14936 c14936, int i) {
        C18463 c18463 = c19169.f61905;
        AtomicInteger atomicInteger = c19169.f61906;
        atomicInteger.incrementAndGet();
        try {
            c14936.accept(i);
        } finally {
            if (atomicInteger.decrementAndGet() == 0) {
                c18463.m42825();
            }
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x006b */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m43984(l.C2565 r5, l.C17358 r6) throws java.io.IOException {
        /*
            r4 = this;
            l.ۢ᩸ۨ r0 = r6.m40393()
            r4.m43982(r5, r0)     // Catch: java.lang.Throwable -> L7e
            r0.close()
            java.lang.String r5 = r5.f10124
            boolean r0 = r4.m43989(r5)
            if (r0 != 0) goto L13
            goto L77
        L13:
            boolean r0 = r6.m40390()
            if (r0 == 0) goto L6e
            l.ᩴۖۜ r6 = r4.f61905
            r0 = r6
            monitor-enter(r0)
            l.᩵ۖۜ r1 = r6.f58838     // Catch: java.lang.Throwable -> L6b
            l.ܰۧᩴ r1 = r1.f61899     // Catch: java.lang.Throwable -> L6b
            boolean r1 = r1.containsKey(r5)     // Catch: java.lang.Throwable -> L6b
            if (r1 != 0) goto L69
            l.᩵ۖۜ r1 = r6.f58838     // Catch: java.lang.Throwable -> L6b
            l.ۙۧᩴ r1 = r1.f61897     // Catch: java.lang.Throwable -> L6b
            boolean r1 = r1.contains(r5)     // Catch: java.lang.Throwable -> L6b
            if (r1 == 0) goto L32
            goto L69
        L32:
            l.۫᩸ۨ r1 = r6.f58834     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L6b
            if (r1 != 0) goto L4a
            l.۫᩸ۨ r1 = new l.۫᩸ۨ     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L6b
            l.᩵ۖۜ r2 = r6.f58838     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L6b
            l.ܰۛۘ r2 = r2.f61909     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L6b
            l.᩷۠ۚ r2 = r2.m33318()     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L6b
            r3 = 1
            java.io.OutputStream r2 = r2.mo33976(r3)     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L6b
            r1.<init>(r2)     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L6b
            r6.f58834 = r1     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L6b
        L4a:
            l.۫᩸ۨ r1 = r6.f58834     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L6b
            int r2 = l.C23967.m52794(r5)     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L6b
            l.C6069.m16468(r1, r2)     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L6b
            l.C23967.m52797(r1, r5)     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L6b
            l.۫᩸ۨ r1 = r6.f58834     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L6b
            r1.flush()     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L6b
            l.᩵ۖۜ r1 = r6.f58838     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L6b
            l.ۙۧᩴ r1 = r1.f61897     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L6b
            r1.add(r5)     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L6b
            monitor-exit(r0)
            return
        L64:
            r5 = move-exception
            r6.m42825()     // Catch: java.lang.Throwable -> L6b
            throw r5     // Catch: java.lang.Throwable -> L6b
        L69:
            monitor-exit(r0)
            return
        L6b:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6b
            throw r5
        L6e:
            r6.m40391()
            boolean r0 = r4.m43989(r5)
            if (r0 != 0) goto L78
        L77:
            return
        L78:
            l.ᩴۖۜ r0 = r4.f61905
            r0.m42824(r5, r6)
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
        throw new UnsupportedOperationException("Method not decompiled: l.C19169.m43984(l.ۖܰۜ, l.ܿ۬ۖ):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43997(C2565 c2565, C2093 c2093) {
        try {
            C7880 c7880 = (C7880) this.f61899.get(c2565.f10124);
            if (c7880 != null) {
                m43983(c2565, c7880, c2093);
                return;
            }
        } catch (IOException unused) {
        }
        try {
            m43982(c2565, (Writer) c2093);
        } catch (Throwable th) {
            c2093.m6636();
            c2093.append((CharSequence) Log.getStackTraceString(th));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m43983(C2565 c2565, C7880 c7880, C2093 c2093) throws IOException {
        int i;
        byte[] bArrM46727;
        String str = c2565.f10124;
        int i2 = c7880.f25913;
        Reference reference = (Reference) this.f61903.get(Integer.valueOf(i2));
        byte[] bArr = reference != null ? (byte[]) reference.get() : null;
        if (bArr == null) {
            synchronized (this.f61903) {
                try {
                    Reference reference2 = (Reference) this.f61903.get(Integer.valueOf(i2));
                    bArrM46727 = reference2 != null ? (byte[]) reference2.get() : null;
                    if (bArrM46727 == null) {
                        try {
                            bArrM46727 = this.f61901.m33320(String.valueOf(i2)).m46727();
                            this.f61903.put(Integer.valueOf(i2), new SoftReference(bArrM46727));
                        } catch (IOException unused) {
                            bArr = new byte[0];
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            bArr = bArrM46727;
        }
        int i3 = c7880.f25914;
        if (i3 < 0 || (i = c7880.f25915) <= 0 || ((long) i3) + ((long) i) > bArr.length) {
            throw new IOException("Smali cache data range is invalid");
        }
        C17358 c17358 = (C17358) this.f61900.m45009();
        if (c17358 == null) {
            c17358 = new C17358();
        }
        try {
            c17358.m40392(c7880.f25914, c7880.f25915, bArr);
            C23967.m52800(c17358.m40396(), c17358.m40389(), c2093);
        } finally {
            this.f61900.m45011(c17358);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m43982(C2565 c2565, Writer writer) throws IOException {
        String name = c2565.f10123.getName();
        C6094 c6094 = this.f61898;
        C7807 c7807 = new C7807(c6094.m16550(name), c2565.f10120, c2565.f10119);
        if (c6094.m16556()) {
            writer.write("# ");
            writer.write(c2565.f10122);
            writer.write(".dex\n\n");
        }
        C16191.m38283(writer, c7807, c6094.m16558(c2565.f10122));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m43993(C19169 c19169, int i) {
        c19169.f61903.remove(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC20745 m43981(C19169 c19169, int i) {
        return c19169.f61901.m33320(String.valueOf(i));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m44000() {
        this.f61907.incrementAndGet();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43996() {
        this.f61902 = true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m44001() {
        this.f61905.m42823();
        this.f61902 = false;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m43995() {
        while (true) {
            AtomicInteger atomicInteger = this.f61906;
            if (atomicInteger.get() <= 0 || this.f61910.get() >= atomicInteger.get()) {
                return;
            } else {
                SystemClock.sleep(100L);
            }
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m43999() {
        if (this.f61906.get() > 0) {
            SystemClock.sleep(100L);
        }
    }
}
