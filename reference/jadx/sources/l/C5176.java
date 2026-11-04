package l;

import bin.mt.plus.R;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۙ᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6FB */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5176 implements Consumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f18078 = 0;

    public /* synthetic */ C5176() {
    }

    public /* synthetic */ C5176(C1101 c1101) {
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        switch (this.f18078) {
            case 0:
                C21943 c21943 = (C21943) obj;
                C4937.forEach(c21943.m49646(), new C21747(c21943, 1));
                break;
            default:
                AbstractActivityC17204 abstractActivityC17204 = (AbstractActivityC17204) obj;
                C15243.m36590(abstractActivityC17204, "activity");
                int i = C1101.f3914;
                C13511 c13511 = new C13511(abstractActivityC17204, R.string.MT_Protector);
                c13511.m33192();
                C18136 c18136 = new C18136(c13511);
                ReentrantLock reentrantLock = C11650.f37690;
                new Thread(new RunnableC11879(4, abstractActivityC17204, c18136)).start();
                break;
        }
    }
}
