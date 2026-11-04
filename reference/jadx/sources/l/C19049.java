package l;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩳۨۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 78OY */
/* JADX INFO: loaded from: classes5.dex */
public final class C19049 implements InterfaceC4879 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final ArrayList f61728 = new ArrayList(50);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Handler f61729;

    public C19049(Handler handler) {
        this.f61729 = handler;
    }

    @Override // l.InterfaceC4879
    /* JADX INFO: renamed from: ۤ */
    public final Looper mo14968() {
        return this.f61729.getLooper();
    }

    @Override // l.InterfaceC4879
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo14964() {
        return this.f61729.hasMessages(1);
    }

    @Override // l.InterfaceC4879
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC14068 mo14960(int i) {
        C7862 c7862M44160 = m44160();
        c7862M44160.m21396(this.f61729.obtainMessage(i));
        return c7862M44160;
    }

    @Override // l.InterfaceC4879
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC14068 mo14963(int i, Object obj) {
        C7862 c7862M44160 = m44160();
        c7862M44160.m21396(this.f61729.obtainMessage(i, obj));
        return c7862M44160;
    }

    @Override // l.InterfaceC4879
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC14068 mo14961(int i, int i2, int i3) {
        C7862 c7862M44160 = m44160();
        c7862M44160.m21396(this.f61729.obtainMessage(i, i2, i3));
        return c7862M44160;
    }

    @Override // l.InterfaceC4879
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC14068 mo14962(int i, int i2, Object obj) {
        C7862 c7862M44160 = m44160();
        c7862M44160.m21396(this.f61729.obtainMessage(i, 0, i2, obj));
        return c7862M44160;
    }

    @Override // l.InterfaceC4879
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo14967(InterfaceC14068 interfaceC14068) {
        return ((C7862) interfaceC14068).m21397(this.f61729);
    }

    @Override // l.InterfaceC4879
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo14971(int i) {
        return this.f61729.sendEmptyMessage(i);
    }

    @Override // l.InterfaceC4879
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo14965(long j) {
        return this.f61729.sendEmptyMessageAtTime(2, j);
    }

    @Override // l.InterfaceC4879
    /* JADX INFO: renamed from: ۤ */
    public final void mo14969(int i) {
        C20782.m47565(i != 0);
        this.f61729.removeMessages(i);
    }

    @Override // l.InterfaceC4879
    /* JADX INFO: renamed from: ᩷ */
    public final void mo14970() {
        this.f61729.removeCallbacksAndMessages(null);
    }

    @Override // l.InterfaceC4879
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo14966(Runnable runnable) {
        return this.f61729.post(runnable);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static C7862 m44160() {
        C7862 c7862;
        ArrayList arrayList = f61728;
        synchronized (arrayList) {
            if (arrayList.isEmpty()) {
                c7862 = new C7862(0);
            } else {
                c7862 = (C7862) arrayList.remove(arrayList.size() - 1);
            }
        }
        return c7862;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44159(C7862 c7862) {
        ArrayList arrayList = f61728;
        synchronized (arrayList) {
            if (arrayList.size() < 50) {
                arrayList.add(c7862);
            }
        }
    }
}
