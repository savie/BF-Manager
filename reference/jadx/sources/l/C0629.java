package l;

import bin.mt.plus.R;
import java.io.IOException;
import java.util.function.Consumer;
import net.sf.sevenzipjbinding.IInArchive;

/* JADX INFO: renamed from: l.֡ᩴ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: NB79 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0629 extends C2166 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC17249 f2471;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f2472;

    public C0629(final C17036 c17036) {
        ConcurrentMapC17249 concurrentMapC17249 = new ConcurrentMapC17249();
        this.f2471 = concurrentMapC17249;
        C1170.stream(c17036.m40142()).map(new C6596()).filter(new C24496()).forEach(new Consumer() { // from class: l.ۘᩴ۫
            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void n(Object obj) {
                C18528 c18528 = (C18528) obj;
                this.f15736.f2471.put(Integer.valueOf(c18528.f60224), c18528);
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C12312.$default$andThen(this, consumer);
            }
        });
        if (concurrentMapC17249.isEmpty()) {
            return;
        }
        C5261.f18540.submit(new Runnable() { // from class: l.ܰᩴ۫
            @Override // java.lang.Runnable
            public final void run() {
                C0629.m2779(this.f48412, c17036);
            }
        });
    }

    @Override // l.C2166
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo2784(InterfaceC2386 interfaceC2386, int i) {
        return C19362.m44774(((C10411) interfaceC2386).m26722());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m2779(C0629 c0629, C17036 c17036) {
        for (int i : C1170.stream(c0629.f2471.keySet()).mapToInt(new C7963()).toArray()) {
            C18528 c18528 = (C18528) c0629.f2471.get(Integer.valueOf(i));
            if (c18528 != null && C2166.m7450(c18528.f60223)) {
                c0629.f2471.remove(Integer.valueOf(i));
                synchronized (c18528) {
                    c18528.notifyAll();
                }
            }
        }
        if (c0629.f2471.isEmpty()) {
            return;
        }
        int[] array = C1170.stream(c0629.f2471.keySet()).mapToInt(new C7963()).toArray();
        IInArchive iInArchiveM40139 = null;
        try {
            iInArchiveM40139 = c17036.m40139();
            iInArchiveM40139.extract(array, false, new C21512(c0629, iInArchiveM40139));
        } catch (IOException unused) {
        } finally {
            c0629.f2471.clear();
            C20244.m46520(iInArchiveM40139);
        }
    }

    @Override // l.C2166, l.InterfaceC0895
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int mo2786(InterfaceC2386 interfaceC2386) {
        if (interfaceC2386.mo8090()) {
            return C19362.m44775(((C10411) interfaceC2386).m26722());
        }
        return 0;
    }

    @Override // l.C2166, l.InterfaceC0895
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11983 mo2785(AbstractC7364 abstractC7364, InterfaceC2386 interfaceC2386, int i) {
        C1997 c1997M26722 = ((C10411) interfaceC2386).m26722();
        int iM6835 = c1997M26722.m6835();
        C18528 c18528 = (C18528) this.f2471.get(Integer.valueOf(iM6835));
        if (c18528 != null) {
            do {
                synchronized (c18528) {
                    try {
                        c18528.wait(1000L);
                    } catch (InterruptedException unused) {
                    }
                }
            } while (this.f2471.containsKey(Integer.valueOf(iM6835)));
        }
        String strM44774 = C19362.m44774(c1997M26722);
        if (i == 1) {
            return m2778(strM44774, C20613.f66095, C20613.f66070);
        }
        if (i == 2) {
            return m2778(strM44774, C20613.f66095, C20613.f66070);
        }
        if (i == 3) {
            C20613 c20613 = C20613.f66051;
            C11983 c11983M2778 = m2778(strM44774, c20613, c20613);
            if (c11983M2778 != c20613.f66114) {
                interfaceC2386.mo8110(R.id.MT_Protector, Boolean.TRUE);
            }
            return c11983M2778;
        }
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11983 m2778(String str, C20613 c20613, C20613 c20614) {
        if (C2166.m7453(str)) {
            return c20614.f66114;
        }
        C11983 c11983M30076 = C11983.m30076(C0217.m1666(str));
        return c11983M30076 == null ? c20613.f66114 : c11983M30076;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m2787() {
        this.f2472 = true;
    }
}
