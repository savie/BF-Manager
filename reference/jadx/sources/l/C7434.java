package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۜ᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6R3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7434 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final int f24471 = Math.min(4, Math.max(1, C11138.f35105 - 1));

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final BooleanSupplier f24472;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f24473;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final List f24475;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C6909[] f24476;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Supplier f24477;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final CountDownLatch f24478;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f24479 = new AtomicInteger();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f24474 = new AtomicBoolean();

    public C7434(Supplier supplier, List list, BooleanSupplier booleanSupplier) {
        this.f24477 = supplier;
        this.f24475 = list;
        this.f24472 = booleanSupplier;
        this.f24476 = new C6909[list.size()];
        int iMin = Math.min(f24471, list.size());
        this.f24473 = iMin;
        this.f24478 = new CountDownLatch(iMin);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6909 m20371(Supplier supplier, List list, BooleanSupplier booleanSupplier) {
        C7434 c7434 = new C7434(supplier, list, booleanSupplier);
        CountDownLatch countDownLatch = c7434.f24478;
        AtomicBoolean atomicBoolean = c7434.f24474;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < c7434.f24473; i2++) {
            arrayList.add(new CallableC8925(c7434));
        }
        try {
            try {
                Iterator it = C5261.m15831(C5261.f18537, arrayList).iterator();
                while (it.hasNext()) {
                    ((Future) it.next()).get();
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((CallableC8925) it2.next()).m23833();
                }
                boolean z = false;
                while (true) {
                    try {
                        countDownLatch.await();
                        break;
                    } catch (InterruptedException unused) {
                        atomicBoolean.set(true);
                        z = true;
                    }
                }
                if (z) {
                    Thread.currentThread().interrupt();
                }
                if (atomicBoolean.get() || c7434.f24472.getAsBoolean()) {
                    return null;
                }
                C6909 c6909 = new C6909();
                C6909[] c6909Arr = c7434.f24476;
                int length = c6909Arr.length;
                while (i < length) {
                    C6909 c69010 = c6909Arr[i];
                    if (c69010 == null) {
                        throw new IllegalStateException("Missing wrap batch result");
                    }
                    c6909.m19172(c69010);
                    i++;
                }
                return c6909;
            } catch (Throwable th) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    ((CallableC8925) it3.next()).m23833();
                }
                while (true) {
                    try {
                        countDownLatch.await();
                        break;
                    } catch (InterruptedException unused2) {
                        atomicBoolean.set(true);
                        i = 1;
                    }
                }
                if (i != 0) {
                    Thread.currentThread().interrupt();
                    throw th;
                }
                throw th;
            }
        } catch (Error | Exception e) {
            atomicBoolean.set(true);
            boolean z2 = e instanceof InterruptedException;
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6909 m20372(C20859 c20859, ArrayList arrayList, C23843 c23843) {
        C6909 c6909 = new C6909();
        C15508 c15508M33642 = ((C9670) c20859.f66764).m33642();
        try {
            C19984 c19984M37176 = c15508M33642.m37176();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                InterfaceC2959 interfaceC2959 = (InterfaceC2959) it.next();
                if (!c23843.getAsBoolean()) {
                    c6909.m19172(interfaceC2959.mo3042(c19984M37176));
                } else {
                    c15508M33642.close();
                    return null;
                }
            }
            c15508M33642.close();
            if (c23843.getAsBoolean()) {
                return null;
            }
            return c6909;
        } catch (Throwable th) {
            try {
                c15508M33642.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static boolean m20374(C7434 c7434) {
        return c7434.f24474.get() || c7434.f24472.getAsBoolean();
    }
}
