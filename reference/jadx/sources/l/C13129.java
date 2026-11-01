package l;

import android.os.SystemClock;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: l.۬۬ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C13129 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C1777 f43720;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f43721;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20890 f43722;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public ArrayList f43723;

    public C13129(C20890 c20890, int i) {
        this.f43722 = c20890;
        this.f43721 = i;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        C20890 c20890 = this.f43722;
        C1777 c1777 = new C1777((AbstractActivityC12483) c20890.requireActivity());
        c1777.m5837(this.f43721);
        c1777.mo5828((Runnable) null);
        c1777.mo5843();
        this.f43720 = c1777;
        if (c20890.f67864 != null) {
            c20890.f67864 = null;
            c20890.f67870.notifyDataSetChanged();
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        C20890 c20890;
        while (true) {
            c20890 = this.f43722;
            if (c20890.f67871 != null) {
                break;
            } else {
                SystemClock.sleep(10L);
            }
        }
        c20890.f67871.m16553();
        C6094 c6094 = c20890.f67871;
        final C1133 c1133 = new C1133(this);
        c6094.getClass();
        final Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentMapC13783());
        ArrayList<InterfaceC9354> arrayListM16559 = c6094.m16559();
        final C8516 c8516 = new C8516(arrayListM16559.size());
        c8516.m22241(c1133);
        ExecutorService executorService = C4716.f16632;
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(C5464.f18831);
        for (final InterfaceC9354 interfaceC9354 : arrayListM16559) {
            executorServiceNewFixedThreadPool.submit(new Runnable() { // from class: l.֡ܰۜ
                @Override // java.lang.Runnable
                public final void run() {
                    C6094.m16513(c1133, c8516, interfaceC9354, setNewSetFromMap);
                }
            });
        }
        C4716.m13052(executorServiceNewFixedThreadPool);
        C16737.m39273(new Runnable() { // from class: l.ۚ۬ۜ
            @Override // java.lang.Runnable
            public final void run() {
                C13129 c13129 = this.f18536;
                c13129.f43720.m5836();
                c13129.f43720.m5837(R.string.MT_Protector);
                c13129.f43720.m5833(true);
            }
        });
        ArrayList arrayList = new ArrayList(setNewSetFromMap.size());
        this.f43723 = arrayList;
        Iterator it = setNewSetFromMap.iterator();
        while (it.hasNext()) {
            arrayList.add(new C15246((String) it.next()));
        }
        Collections.sort(arrayList, new C22301());
        c20890.f67867 = false;
        c20890.f67873 = false;
        c20890.m46974(arrayList);
        C20890.m46991(c20890);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        ArrayList arrayList = this.f43723;
        C20890 c20890 = this.f43722;
        c20890.f67864 = arrayList;
        c20890.f67870.notifyDataSetChanged();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f43722.f67865.m42627((Throwable) exc);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        this.f43722.f67871.m16573();
        this.f43720.m5825();
    }
}
