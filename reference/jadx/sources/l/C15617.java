package l;

import android.os.Handler;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: l.ܳ᩷᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8T9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15617 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f50741;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f50742;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C8402 f50743;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37361(Handler handler, InterfaceC13380 interfaceC13380) {
        handler.getClass();
        C20093 c20093 = new C20093();
        c20093.f64573 = handler;
        c20093.f64574 = interfaceC13380;
        this.f50741.add(c20093);
    }

    public C15617() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    public C15617(CopyOnWriteArrayList copyOnWriteArrayList, int i, C8402 c8402) {
        this.f50741 = copyOnWriteArrayList;
        this.f50742 = i;
        this.f50743 = c8402;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15617 m37360(int i, C8402 c8402) {
        return new C15617(this.f50741, i, c8402);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37363(InterfaceC13380 interfaceC13380) {
        CopyOnWriteArrayList<C20093> copyOnWriteArrayList = this.f50741;
        for (C20093 c20093 : copyOnWriteArrayList) {
            if (c20093.f64574 == interfaceC13380) {
                copyOnWriteArrayList.remove(c20093);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37365(C14368 c14368, int i, int i2, C15648 c15648, int i3, Object obj, long j, long j2, int i4) {
        m37362(new C23077(this, c14368, new C9893(i, i2, c15648, i3, obj, C7116.m19506(j), C7116.m19506(j2)), i4));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m37367(C14368 c14368, int i, int i2, C15648 c15648, int i3, Object obj, long j, long j2) {
        m37362(new C11142(this, c14368, new C9893(i, i2, c15648, i3, obj, C7116.m19506(j), C7116.m19506(j2))));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37364(C14368 c14368, int i, int i2, C15648 c15648, int i3, Object obj, long j, long j2) {
        m37362(new C2570(this, c14368, new C9893(i, i2, c15648, i3, obj, C7116.m19506(j), C7116.m19506(j2))));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37366(C14368 c14368, int i, int i2, C15648 c15648, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
        m37362(new C22331(this, c14368, new C9893(i, i2, c15648, i3, obj, C7116.m19506(j), C7116.m19506(j2)), iOException, z));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37362(InterfaceC8103 interfaceC8103) {
        for (C20093 c20093 : this.f50741) {
            C7116.m19483(c20093.f64573, new RunnableC24122(1, interfaceC8103, c20093.f64574));
        }
    }
}
