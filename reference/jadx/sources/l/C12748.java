package l;

import bin.mt.plus.R;
import java.io.IOException;
import java.util.function.Consumer;
import net.sf.sevenzipjbinding.IInArchive;

/* JADX INFO: renamed from: l.۫᩻᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: NB79 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12748 extends C18225 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f42499;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC13783 f42500;

    public C12748(final C21920 c21920) {
        ConcurrentMapC13783 concurrentMapC13783 = new ConcurrentMapC13783();
        this.f42500 = concurrentMapC13783;
        C9030.stream(c21920.m48733()).map(new C7809()).filter(new C21214()).forEach(new Consumer() { // from class: l.ܺ᩻᩹
            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void n(Object obj) {
                C16981 c16981 = (C16981) obj;
                this.f52438.f42500.put(Integer.valueOf(c16981.f54318), c16981);
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C1455.$default$andThen(this, consumer);
            }
        });
        if (concurrentMapC13783.isEmpty()) {
            return;
        }
        C4716.f16636.submit(new Runnable() { // from class: l.᩶᩻᩹
            @Override // java.lang.Runnable
            public final void run() {
                C12748.m31683(this.f66484, c21920);
            }
        });
    }

    @Override // l.C18225
    /* JADX INFO: renamed from: ۙ */
    public final String mo7923(InterfaceC2557 interfaceC2557, int i) {
        return C6024.m16342(((C10964) interfaceC2557).m27721());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m31683(C12748 c12748, C21920 c21920) {
        for (int i : C9030.stream(c12748.f42500.keySet()).mapToInt(new C6339()).toArray()) {
            C16981 c16981 = (C16981) c12748.f42500.get(Integer.valueOf(i));
            if (c16981 != null && C18225.m42375(c16981.f54316)) {
                c12748.f42500.remove(Integer.valueOf(i));
                synchronized (c16981) {
                    c16981.notifyAll();
                }
            }
        }
        if (c12748.f42500.isEmpty()) {
            return;
        }
        int[] array = C9030.stream(c12748.f42500.keySet()).mapToInt(new C6339()).toArray();
        IInArchive iInArchiveM48741 = null;
        try {
            iInArchiveM48741 = c21920.m48741();
            iInArchiveM48741.extract(array, false, new C0752(c12748, iInArchiveM48741));
        } catch (IOException unused) {
        } finally {
            c12748.f42500.clear();
            C19431.m44468(iInArchiveM48741);
        }
    }

    @Override // l.C18225, l.InterfaceC13848
    /* JADX INFO: renamed from: ܰ */
    public final int mo7926(InterfaceC2557 interfaceC2557) {
        if (interfaceC2557.mo7985()) {
            return C6024.m16343(((C10964) interfaceC2557).m27721());
        }
        return 0;
    }

    @Override // l.C18225, l.InterfaceC13848
    /* JADX INFO: renamed from: ۙ */
    public final C14600 mo7925(AbstractC11462 abstractC11462, InterfaceC2557 interfaceC2557, int i) {
        C18334 c18334M27721 = ((C10964) interfaceC2557).m27721();
        int iM42575 = c18334M27721.m42575();
        C16981 c16981 = (C16981) this.f42500.get(Integer.valueOf(iM42575));
        if (c16981 != null) {
            do {
                synchronized (c16981) {
                    try {
                        c16981.wait(1000L);
                    } catch (InterruptedException unused) {
                    }
                }
            } while (this.f42500.containsKey(Integer.valueOf(iM42575)));
        }
        String strM16342 = C6024.m16342(c18334M27721);
        if (i == 1) {
            return m31681(strM16342, C0690.f2906, C0690.f2920);
        }
        if (i == 2) {
            return m31681(strM16342, C0690.f2906, C0690.f2920);
        }
        if (i == 3) {
            C0690 c0690 = C0690.f2939;
            C14600 c14600M31681 = m31681(strM16342, c0690, c0690);
            if (c14600M31681 != c0690.f2943) {
                interfaceC2557.mo7976(R.id.MT_Protector, Boolean.TRUE);
            }
            return c14600M31681;
        }
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14600 m31681(String str, C0690 c0690, C0690 c0691) {
        if (C18225.m42378(str)) {
            return c0691.f2943;
        }
        C14600 c14600M35070 = C14600.m35070(C17169.m40091(str));
        return c14600M35070 == null ? c0690.f2943 : c14600M35070;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m31687() {
        this.f42499 = true;
    }
}
