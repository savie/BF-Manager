package l;

import android.os.SystemClock;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: l.ۡۘۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C9116 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f29607;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1965 f29608;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C10745 f29609;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public ArrayList f29610;

    public C9116(C1965 c1965, int i) {
        this.f29608 = c1965;
        this.f29607 = i;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        C1965 c1965 = this.f29608;
        C10745 c10745 = new C10745((AbstractActivityC17204) c1965.requireActivity());
        c10745.m27397(this.f29607);
        c10745.mo25916((Runnable) null);
        c10745.mo25931();
        this.f29609 = c10745;
        if (c1965.f6596 != null) {
            c1965.f6596 = null;
            c1965.f6595.notifyDataSetChanged();
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        C1965 c1965;
        while (true) {
            c1965 = this.f29608;
            if (c1965.f6588 != null) {
                break;
            } else {
                SystemClock.sleep(10L);
            }
        }
        c1965.f6588.m46621();
        C20283 c20283 = c1965.f6588;
        C0914 c0914 = new C0914(this);
        c20283.getClass();
        Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentMapC17249());
        ArrayList arrayListM46593 = c20283.m46593();
        C3374 c3374 = new C3374(arrayListM46593.size());
        c3374.m11078(c0914);
        ExecutorService executorService = C5261.f18541;
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(C11138.f35105);
        Iterator it = arrayListM46593.iterator();
        while (it.hasNext()) {
            executorServiceNewFixedThreadPool.submit(new RunnableC20899(c0914, c3374, (InterfaceC14906) it.next(), setNewSetFromMap, 1));
        }
        C5261.m15837(executorServiceNewFixedThreadPool);
        C21576.m49068(new Runnable() { // from class: l.ᩳۘۧ
            @Override // java.lang.Runnable
            public final void run() {
                C9116 c9116 = this.f61136;
                c9116.f29609.m27396();
                c9116.f29609.m27397(R.string.MT_Protector);
                c9116.f29609.m27394(true);
            }
        });
        ArrayList arrayList = new ArrayList(setNewSetFromMap.size());
        this.f29610 = arrayList;
        Iterator it2 = setNewSetFromMap.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C13591((String) it2.next()));
        }
        Collections.sort(arrayList, new C9862());
        c1965.f6589 = false;
        c1965.f6598 = false;
        c1965.m6748(arrayList);
        C1965.m6764(c1965);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        ArrayList arrayList = this.f29610;
        C1965 c1965 = this.f29608;
        c1965.f6596 = arrayList;
        c1965.f6595.notifyDataSetChanged();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f29608.f6592.m51299(exc);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        this.f29608.f6588.m46573();
        this.f29609.m27405();
    }
}
