package l;

import bin.mt.plus.R;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۫۬֨, reason: contains not printable characters */
/* JADX INFO: compiled from: B7T7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12419 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C11545 f41450;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f41451;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public List f41452;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C23708 f41453;

    public C12419(C11545 c11545, List list) {
        boolean z;
        this.f41450 = c11545;
        this.f41452 = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC2557 interfaceC2557 = (InterfaceC2557) it.next();
            if (interfaceC2557.isDirectory() && !interfaceC2557.mo7986()) {
                z = true;
                this.f41451 = z;
            }
        }
        z = false;
        this.f41451 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30884(final RunnableC3681 runnableC3681) {
        C11545 c11545 = this.f41450;
        final AbstractC12233 abstractC12233 = (AbstractC12233) c11545.m28817().mo13029();
        List list = this.f41452;
        if (list.size() == 1) {
            AbstractC5362 abstractC5362 = (AbstractC5362) list.get(0);
            C11731 c11731Mo7971 = abstractC5362.mo7971();
            C23708 c23708 = new C23708(c11545.m28824(), abstractC12233, c11731Mo7971.m29326(), c11731Mo7971.m29320(), this.f41451, new Runnable() { // from class: l.᩷۬֨
                @Override // java.lang.Runnable
                public final void run() {
                    C12419.m30880(this.f67826, abstractC12233, runnableC3681);
                }
            });
            c23708.m52197(abstractC5362.getName());
            this.f41453 = c23708;
            return;
        }
        C23708 c23709 = new C23708(c11545.m28824(), abstractC12233, null, null, this.f41451, new Runnable() { // from class: l.ܺ۬֨
            @Override // java.lang.Runnable
            public final void run() {
                C12419.m30883(this.f51653, abstractC12233, runnableC3681);
            }
        });
        c23709.m52197(C16737.m39264(R.string.MT_Protector, Integer.valueOf(list.size())));
        this.f41453 = c23709;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30880(C12419 c12419, AbstractC12233 abstractC12233, RunnableC3681 runnableC3681) {
        if (c12419.f41453.m52194()) {
            new C16652(c12419, abstractC12233, c12419.f41453.m52198(), c12419.f41453.m52201(), runnableC3681).m10243();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m30883(C12419 c12419, AbstractC12233 abstractC12233, RunnableC3681 runnableC3681) {
        new C16652(c12419, abstractC12233, c12419.f41453.m52198(), c12419.f41453.m52201(), runnableC3681).m10243();
    }
}
