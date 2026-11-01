package l;

import android.os.Looper;

/* JADX INFO: renamed from: l.ܰۡۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: I7U9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13710 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public Object f45209;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8065 f45210;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4536 f45211;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8065 f45212;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Object f45213;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f45214;

    public C13710(Object obj, Looper looper, Looper looper2, C22217 c22217, InterfaceC4536 interfaceC4536) {
        this.f45210 = c22217.mo28887(looper, null);
        this.f45212 = c22217.mo28887(looper2, null);
        this.f45209 = obj;
        this.f45213 = obj;
        this.f45211 = interfaceC4536;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33421(InterfaceC11955 interfaceC11955, InterfaceC11955 interfaceC11956) {
        C2023.m6510(Looper.myLooper() == this.f45212.mo21245());
        this.f45214++;
        m33420((Runnable) new RunnableC3850(1, this, interfaceC11956));
        Object objApply = interfaceC11955.apply(this.f45209);
        Object obj = this.f45209;
        this.f45209 = objApply;
        if (obj.equals(objApply)) {
            return;
        }
        this.f45211.mo12663(obj, objApply);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33417(C13710 c13710, InterfaceC11955 interfaceC11955) {
        Object objApply = interfaceC11955.apply(c13710.f45213);
        c13710.f45213 = objApply;
        RunnableC23506 runnableC23506 = new RunnableC23506(1, c13710, objApply);
        InterfaceC8065 interfaceC8065 = c13710.f45212;
        if (interfaceC8065.mo21245().getThread().isAlive()) {
            interfaceC8065.mo21243(runnableC23506);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m33418(C13710 c13710, Object obj) {
        int i = c13710.f45214 - 1;
        c13710.f45214 = i;
        if (i == 0) {
            Object obj2 = c13710.f45209;
            c13710.f45209 = obj;
            if (obj2.equals(obj)) {
                return;
            }
            c13710.f45211.mo12663(obj2, obj);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33419(Object obj) {
        this.f45213 = obj;
        RunnableC2503 runnableC2503 = new RunnableC2503(1, this, obj);
        InterfaceC8065 interfaceC8065 = this.f45212;
        if (interfaceC8065.mo21245().getThread().isAlive()) {
            interfaceC8065.mo21243(runnableC2503);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33416(C13710 c13710, Object obj) {
        if (c13710.f45214 == 0) {
            Object obj2 = c13710.f45209;
            c13710.f45209 = obj;
            if (obj2.equals(obj)) {
                return;
            }
            c13710.f45211.mo12663(obj2, obj);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33420(Runnable runnable) {
        InterfaceC8065 interfaceC8065 = this.f45210;
        if (interfaceC8065.mo21245().getThread().isAlive()) {
            interfaceC8065.mo21243(runnable);
        }
    }
}
