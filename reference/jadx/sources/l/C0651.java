package l;

import bin.mt.plus.R;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֡᩵۫, reason: contains not printable characters */
/* JADX INFO: compiled from: B7T7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0651 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f2514;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public List f2515;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C1397 f2516;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C8614 f2517;

    public C0651(C8614 c8614, List list) {
        boolean z;
        this.f2517 = c8614;
        this.f2515 = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC2386 interfaceC2386 = (InterfaceC2386) it.next();
            if (interfaceC2386.isDirectory() && !interfaceC2386.mo8107()) {
                z = true;
                this.f2514 = z;
            }
        }
        z = false;
        this.f2514 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2854(final RunnableC5631 runnableC5631) {
        C8614 c8614 = this.f2517;
        final AbstractC18881 abstractC18881 = (AbstractC18881) c8614.m23213().mo10174();
        List list = this.f2515;
        if (list.size() == 1) {
            AbstractC20042 abstractC20042 = (AbstractC20042) list.get(0);
            C9097 c9097Mo5155 = abstractC20042.mo5155();
            C1397 c1397 = new C1397(c8614.m23233(), abstractC18881, c9097Mo5155.m24241(), c9097Mo5155.m24237(), this.f2514, new Runnable() { // from class: l.᩺᩵۫
                @Override // java.lang.Runnable
                public final void run() {
                    C0651.m2850(this.f79505, abstractC18881, runnableC5631);
                }
            });
            c1397.m5100(abstractC20042.getName());
            this.f2516 = c1397;
            return;
        }
        C1397 c1398 = new C1397(c8614.m23233(), abstractC18881, null, null, this.f2514, new Runnable() { // from class: l.ۘ᩵۫
            @Override // java.lang.Runnable
            public final void run() {
                C0651.m2853(this.f15785, abstractC18881, runnableC5631);
            }
        });
        c1398.m5100(C21576.m49059(R.string.MT_Protector, Integer.valueOf(list.size())));
        this.f2516 = c1398;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m2850(C0651 c0651, AbstractC18881 abstractC18881, RunnableC5631 runnableC5631) {
        if (c0651.f2516.m5102()) {
            new C18550(c0651, abstractC18881, c0651.f2516.m5104(), c0651.f2516.m5103(), runnableC5631).m8197();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m2853(C0651 c0651, AbstractC18881 abstractC18881, RunnableC5631 runnableC5631) {
        new C18550(c0651, abstractC18881, c0651.f2516.m5104(), c0651.f2516.m5103(), runnableC5631).m8197();
    }
}
