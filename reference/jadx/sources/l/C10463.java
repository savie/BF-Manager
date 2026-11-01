package l;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.ۤᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: PAHH */
/* JADX INFO: loaded from: classes3.dex */
public final class C10463 extends ReentrantLock {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26425(Condition condition) {
        C0356.forEach(getWaitingThreads(condition), new C9052());
    }
}
