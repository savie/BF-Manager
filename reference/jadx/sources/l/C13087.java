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

/* JADX INFO: renamed from: l.۬ۨۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6R3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13087 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final int f43583 = Math.min(4, Math.max(1, C5464.f18831 - 1));

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final List f43584;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final BooleanSupplier f43586;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Supplier f43587;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f43589;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final CountDownLatch f43590;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C3662[] f43591;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f43585 = new AtomicInteger();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f43588 = new AtomicBoolean();

    public C13087(Supplier supplier, List list, BooleanSupplier booleanSupplier) {
        this.f43587 = supplier;
        this.f43584 = list;
        this.f43586 = booleanSupplier;
        this.f43591 = new C3662[list.size()];
        int iMin = Math.min(f43583, list.size());
        this.f43589 = iMin;
        this.f43590 = new CountDownLatch(iMin);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3662 m32305(Supplier supplier, List list, BooleanSupplier booleanSupplier) {
        C13087 c13087 = new C13087(supplier, list, booleanSupplier);
        CountDownLatch countDownLatch = c13087.f43590;
        AtomicBoolean atomicBoolean = c13087.f43588;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < c13087.f43589; i2++) {
            arrayList.add(new CallableC1091(c13087));
        }
        try {
            try {
                Iterator it = C4716.m13047(C4716.f16633, arrayList).iterator();
                while (it.hasNext()) {
                    ((Future) it.next()).get();
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((CallableC1091) it2.next()).m4091();
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
                if (atomicBoolean.get() || c13087.f43586.getAsBoolean()) {
                    return null;
                }
                C3662 c3662 = new C3662();
                C3662[] c3662Arr = c13087.f43591;
                int length = c3662Arr.length;
                while (i < length) {
                    C3662 c3663 = c3662Arr[i];
                    if (c3663 == null) {
                        throw new IllegalStateException("Missing wrap batch result");
                    }
                    c3662.m10809(c3663);
                    i++;
                }
                return c3662;
            } catch (Throwable th) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    ((CallableC1091) it3.next()).m4091();
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
    public static C3662 m32306(C12444 c12444, ArrayList arrayList, C0448 c0448) {
        C3662 c3662 = new C3662();
        C3329 c3329M30760 = c12444.f41505.m30760();
        try {
            C9681 c9681M9888 = c3329M30760.m9888();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                InterfaceC22259 interfaceC22259 = (InterfaceC22259) it.next();
                if (!c0448.getAsBoolean()) {
                    c3662.m10809(interfaceC22259.mo9751(c9681M9888));
                } else {
                    c3329M30760.close();
                    return null;
                }
            }
            c3329M30760.close();
            if (c0448.getAsBoolean()) {
                return null;
            }
            return c3662;
        } catch (Throwable th) {
            try {
                c3329M30760.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static boolean m32302(C13087 c13087) {
        return c13087.f43588.get() || c13087.f43586.getAsBoolean();
    }
}
