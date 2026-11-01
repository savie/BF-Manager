package l;

import android.os.SystemClock;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.۠ۚ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: GAHN */
/* JADX INFO: loaded from: classes4.dex */
public class C7958 extends AbstractC23941 {

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f26145 = 0;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public AbstractC12233 f26148;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public AtomicReference f26149 = new AtomicReference();

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public AtomicReference f26147 = new AtomicReference(null);

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public AtomicInteger f26146 = new AtomicInteger(0);

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۟ */
    public final C14600 mo3078() {
        return C1362.f5712;
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ᩳۙ */
    public final CharSequence mo3080() {
        return C16737.m39264(R.string.MT_Protector, m41567("deleteFrom"));
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۘ */
    public final void mo3075() {
        m41591(R.string.MT_Protector);
        mo41554("...");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.ᩴۚ֨] */
    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۜ */
    public final C5202 mo3077() throws Exception {
        String[] strArrM41566 = m41566("ARG_PATHS");
        this.f26148 = (AbstractC12233) m41560();
        final int iM41581 = m41581("minTotal");
        C3950 c3950 = new C3950(this.f26148, new InterfaceC5614() { // from class: l.ᩳۚ֨
            @Override // l.InterfaceC5614
            /* JADX INFO: renamed from: ֨ */
            public final boolean mo2357() {
                int i = C7958.f26145;
                C7958 c7958 = this.f56511;
                return c7958.mo2357() || c7958.f26149.get() != null;
            }
        });
        c3950.m11437();
        c3950.m11440(strArrM41566, (C18541) new InterfaceC1128() { // from class: l.ᩴۚ֨
            @Override // l.InterfaceC1128
            /* JADX INFO: renamed from: ۙ */
            public final void mo2212(C13124 c13124, int i, int i2) {
                C7958 c7958 = this.f59007;
                int i3 = iM41581;
                int i4 = C7958.f26145;
                c7958.m41578(i, Math.max(i2, i3));
                Object obj = c7958.f26147.get();
                if (obj == null) {
                    c7958.mo41554(c13124.f43706);
                    c7958.f26146.incrementAndGet();
                    try {
                        try {
                            c7958.f26148.mo10270(c13124.f43707, !c13124.f43705);
                            c7958.f26146.decrementAndGet();
                            return;
                        } catch (Throwable th) {
                            c7958.f26146.decrementAndGet();
                            throw th;
                        }
                    } catch (Exception e) {
                        if (!(e instanceof C11278)) {
                            AtomicReference atomicReference = c7958.f26149;
                            while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                            }
                            c7958.f26146.decrementAndGet();
                            return;
                        }
                        AtomicReference atomicReference2 = c7958.f26147;
                        Object obj2 = new Object();
                        while (!atomicReference2.compareAndSet(null, obj2) && atomicReference2.get() == null) {
                        }
                        obj = c7958.f26147.get();
                        SystemClock.sleep(1000L);
                        c7958.f26146.decrementAndGet();
                    }
                }
                synchronized (obj) {
                    while (c7958.f26146.get() != 0) {
                        SystemClock.sleep(100L);
                    }
                    c7958.mo41554(c13124.f43706);
                    try {
                        c7958.f26148.mo10270(c13124.f43707, !c13124.f43705);
                    } catch (Exception e2) {
                        if (e2 instanceof C11278) {
                            AtomicReference atomicReference3 = c7958.f26149;
                            Exception exc = (Exception) e2.getCause();
                            while (!atomicReference3.compareAndSet(null, exc) && atomicReference3.get() == null) {
                            }
                        } else {
                            AtomicReference atomicReference4 = c7958.f26149;
                            while (!atomicReference4.compareAndSet(null, e2) && atomicReference4.get() == null) {
                            }
                        }
                    }
                }
            }
        });
        if (mo2357()) {
            return C5202.m14378();
        }
        AtomicReference atomicReference = this.f26149;
        if (atomicReference.get() != null) {
            throw ((Exception) atomicReference.get());
        }
        return C5202.m14379();
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۙ */
    public final void mo3076(Main main, C11545 c11545, C11545 c11546, C5202 c5202) {
        if (c5202.m14380() && m41579(c11545)) {
            c11545.m28830();
            c11545.m28831();
        }
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ܰ */
    public final void mo3079(C5202 c5202) {
        C21094.m47529(this.f26148.mo10276());
    }
}
