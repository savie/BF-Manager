package l;

import android.os.Looper;

/* JADX INFO: renamed from: l.ۘ᩵ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: I7U9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4374 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4879 f15758;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4879 f15759;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f15760;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final InterfaceC24512 f15761;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Object f15762;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Object f15763;

    public C4374(Object obj, Looper looper, Looper looper2, C0404 c0404, InterfaceC24512 interfaceC24512) {
        this.f15758 = c0404.mo2209(looper, null);
        this.f15759 = c0404.mo2209(looper2, null);
        this.f15763 = obj;
        this.f15762 = obj;
        this.f15761 = interfaceC24512;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13883(InterfaceC5417 interfaceC5417, InterfaceC5417 interfaceC5418) {
        C20782.m47568(Looper.myLooper() == this.f15759.mo14968());
        this.f15760++;
        m13882((Runnable) new RunnableC6528(1, this, interfaceC5418));
        Object objApply = interfaceC5417.apply(this.f15763);
        Object obj = this.f15763;
        this.f15763 = objApply;
        if (obj.equals(objApply)) {
            return;
        }
        this.f15761.mo7145(obj, objApply);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13879(C4374 c4374, InterfaceC5417 interfaceC5417) {
        Object objApply = interfaceC5417.apply(c4374.f15762);
        c4374.f15762 = objApply;
        RunnableC1493 runnableC1493 = new RunnableC1493(1, c4374, objApply);
        InterfaceC4879 interfaceC4879 = c4374.f15759;
        if (interfaceC4879.mo14968().getThread().isAlive()) {
            interfaceC4879.mo14966(runnableC1493);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m13880(C4374 c4374, Object obj) {
        int i = c4374.f15760 - 1;
        c4374.f15760 = i;
        if (i == 0) {
            Object obj2 = c4374.f15763;
            c4374.f15763 = obj;
            if (obj2.equals(obj)) {
                return;
            }
            c4374.f15761.mo7145(obj2, obj);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13881(Object obj) {
        this.f15762 = obj;
        RunnableC7592 runnableC7592 = new RunnableC7592(1, this, obj);
        InterfaceC4879 interfaceC4879 = this.f15759;
        if (interfaceC4879.mo14968().getThread().isAlive()) {
            interfaceC4879.mo14966(runnableC7592);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13878(C4374 c4374, Object obj) {
        if (c4374.f15760 == 0) {
            Object obj2 = c4374.f15763;
            c4374.f15763 = obj;
            if (obj2.equals(obj)) {
                return;
            }
            c4374.f15761.mo7145(obj2, obj);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13882(Runnable runnable) {
        InterfaceC4879 interfaceC4879 = this.f15758;
        if (interfaceC4879.mo14968().getThread().isAlive()) {
            interfaceC4879.mo14966(runnable);
        }
    }
}
