package l;

import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.ۜ֫۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 18AW */
/* JADX INFO: loaded from: classes3.dex */
public final class C6817 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ReentrantLock f22681 = new ReentrantLock(true);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f22679 = new ArrayList(100);

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C21982 f22680 = new C21982(100);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18993(AbstractC22044 abstractC22044, long j) {
        this.f22679.add(abstractC22044);
        this.f22680.add(j);
        if (this.f22679.size() == 100) {
            C5261.f18540.execute(new RunnableC8308(this, this.f22679, this.f22680));
            this.f22679 = new ArrayList(100);
            this.f22680 = new C21982(100);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18992() {
        if (this.f22679.isEmpty()) {
            return;
        }
        try {
            C5261.f18540.submit(new RunnableC8308(this, this.f22679, this.f22680)).get();
        } catch (Exception unused) {
        }
    }
}
