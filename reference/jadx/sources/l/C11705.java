package l;

import android.os.SystemClock;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ۧܶ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: GAHN */
/* JADX INFO: loaded from: classes4.dex */
public class C11705 extends AbstractC16610 {

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f37876 = 0;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC18881 f37880;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public AtomicReference f37879 = new AtomicReference();

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public AtomicReference f37877 = new AtomicReference(null);

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public AtomicInteger f37878 = new AtomicInteger(0);

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩺ */
    public final C11983 mo2534() {
        return C14620.f46050;
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ܶۙ */
    public final CharSequence mo2532() {
        return C21576.m49059(R.string.MT_Protector, m43850("deleteFrom"));
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ֫ */
    public final void mo2528() {
        m43868(R.string.MT_Protector);
        mo29447("...");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.֫ܶ۫] */
    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۧ */
    public final C12187 mo2531() throws Exception {
        String[] strArrM43831 = m43831("ARG_PATHS");
        this.f37880 = (AbstractC18881) m43838();
        final int iM43854 = m43854("minTotal");
        C2143 c2143 = new C2143(this.f37880, new InterfaceC7509() { // from class: l.ۚܶ۫
            @Override // l.InterfaceC7509
            /* JADX INFO: renamed from: ۫ */
            public final boolean mo924() {
                int i = C11705.f37876;
                C11705 c11705 = this.f19758;
                return c11705.mo924() || c11705.f37879.get() != null;
            }
        });
        c2143.m7403();
        c2143.m7406(strArrM43831, (C2011) new InterfaceC13329() { // from class: l.֫ܶ۫
            @Override // l.InterfaceC13329
            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public final void mo6894(C5872 c5872, int i, int i2) {
                C11705 c11705 = this.f6693;
                int i3 = iM43854;
                int i4 = C11705.f37876;
                c11705.m43862(i, Math.max(i2, i3));
                Object obj = c11705.f37877.get();
                if (obj == null) {
                    c11705.mo29447(c5872.f20146);
                    c11705.f37878.incrementAndGet();
                    try {
                        try {
                            c11705.f37880.mo35575(c5872.f20147, !c5872.f20145);
                            c11705.f37878.decrementAndGet();
                            return;
                        } catch (Throwable th) {
                            c11705.f37878.decrementAndGet();
                            throw th;
                        }
                    } catch (Exception e) {
                        if (!(e instanceof C14908)) {
                            AtomicReference atomicReference = c11705.f37879;
                            while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                            }
                            c11705.f37878.decrementAndGet();
                            return;
                        }
                        AtomicReference atomicReference2 = c11705.f37877;
                        Object obj2 = new Object();
                        while (!atomicReference2.compareAndSet(null, obj2) && atomicReference2.get() == null) {
                        }
                        obj = c11705.f37877.get();
                        SystemClock.sleep(1000L);
                        c11705.f37878.decrementAndGet();
                    }
                }
                synchronized (obj) {
                    while (c11705.f37878.get() != 0) {
                        SystemClock.sleep(100L);
                    }
                    c11705.mo29447(c5872.f20146);
                    try {
                        c11705.f37880.mo35575(c5872.f20147, !c5872.f20145);
                    } catch (Exception e2) {
                        if (e2 instanceof C14908) {
                            AtomicReference atomicReference3 = c11705.f37879;
                            Exception exc = (Exception) e2.getCause();
                            while (!atomicReference3.compareAndSet(null, exc) && atomicReference3.get() == null) {
                            }
                        } else {
                            AtomicReference atomicReference4 = c11705.f37879;
                            while (!atomicReference4.compareAndSet(null, e2) && atomicReference4.get() == null) {
                            }
                        }
                    }
                }
            }
        });
        if (mo924()) {
            return C12187.m30469();
        }
        AtomicReference atomicReference = this.f37879;
        if (atomicReference.get() != null) {
            Exception exc = (Exception) atomicReference.get();
            C22327.m50389(exc);
            throw exc;
        }
        return C12187.m30468();
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۙ */
    public final void mo2529(Main main, C8614 c8614, C8614 c8615, C12187 c12187) {
        if (c12187.m30474() && m43863(c8614)) {
            c8614.m23216();
            c8614.m23209();
        }
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2533(C12187 c12187) {
        C6331.m18054(this.f37880.mo35579());
    }
}
