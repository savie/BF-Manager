package l;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۬ۤۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 78OY */
/* JADX INFO: loaded from: classes4.dex */
public final class C13045 implements InterfaceC8065 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final ArrayList f43494 = new ArrayList(50);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Handler f43495;

    public C13045(Handler handler) {
        this.f43495 = handler;
    }

    @Override // l.InterfaceC8065
    /* JADX INFO: renamed from: ۨ */
    public final Looper mo21245() {
        return this.f43495.getLooper();
    }

    @Override // l.InterfaceC8065
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo21241() {
        return this.f43495.hasMessages(1);
    }

    @Override // l.InterfaceC8065
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC18648 mo21237(int i) {
        C1049 c1049M32252 = m32252();
        c1049M32252.m3910(this.f43495.obtainMessage(i));
        return c1049M32252;
    }

    @Override // l.InterfaceC8065
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC18648 mo21240(int i, Object obj) {
        C1049 c1049M32252 = m32252();
        c1049M32252.m3910(this.f43495.obtainMessage(i, obj));
        return c1049M32252;
    }

    @Override // l.InterfaceC8065
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC18648 mo21238(int i, int i2, int i3) {
        C1049 c1049M32252 = m32252();
        c1049M32252.m3910(this.f43495.obtainMessage(i, i2, i3));
        return c1049M32252;
    }

    @Override // l.InterfaceC8065
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC18648 mo21239(int i, int i2, Object obj) {
        C1049 c1049M32252 = m32252();
        c1049M32252.m3910(this.f43495.obtainMessage(i, 0, i2, obj));
        return c1049M32252;
    }

    @Override // l.InterfaceC8065
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo21244(InterfaceC18648 interfaceC18648) {
        return ((C1049) interfaceC18648).m3911(this.f43495);
    }

    @Override // l.InterfaceC8065
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo21248(int i) {
        return this.f43495.sendEmptyMessage(i);
    }

    @Override // l.InterfaceC8065
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo21242(long j) {
        return this.f43495.sendEmptyMessageAtTime(2, j);
    }

    @Override // l.InterfaceC8065
    /* JADX INFO: renamed from: ۨ */
    public final void mo21246(int i) {
        C2023.m6507(i != 0);
        this.f43495.removeMessages(i);
    }

    @Override // l.InterfaceC8065
    /* JADX INFO: renamed from: ܰ */
    public final void mo21247() {
        this.f43495.removeCallbacksAndMessages(null);
    }

    @Override // l.InterfaceC8065
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo21243(Runnable runnable) {
        return this.f43495.post(runnable);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static C1049 m32252() {
        C1049 c1049;
        ArrayList arrayList = f43494;
        synchronized (arrayList) {
            if (arrayList.isEmpty()) {
                c1049 = new C1049(0);
            } else {
                c1049 = (C1049) arrayList.remove(arrayList.size() - 1);
            }
        }
        return c1049;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32253(C1049 c1049) {
        ArrayList arrayList = f43494;
        synchronized (arrayList) {
            if (arrayList.size() < 50) {
                arrayList.add(c1049);
            }
        }
    }
}
