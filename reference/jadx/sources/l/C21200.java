package l;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: l.᩷᩻ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 38V0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21200 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f68999;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f69000;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C15274 f69001;

    public C21200() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    public C21200(CopyOnWriteArrayList copyOnWriteArrayList, int i, C15274 c15274) {
        this.f68999 = copyOnWriteArrayList;
        this.f69000 = i;
        this.f69001 = c15274;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21200 m47656(int i, C15274 c15274) {
        return new C21200(this.f68999, i, c15274);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47661(InterfaceC16262 interfaceC16262) {
        CopyOnWriteArrayList<C7795> copyOnWriteArrayList = this.f68999;
        for (C7795 c7795 : copyOnWriteArrayList) {
            if (c7795.f25665 == interfaceC16262) {
                copyOnWriteArrayList.remove(c7795);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47659(Handler handler, InterfaceC16262 interfaceC16262) {
        handler.getClass();
        C7795 c7795 = new C7795();
        c7795.f25664 = handler;
        c7795.f25665 = interfaceC16262;
        this.f68999.add(c7795);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, l.ܺ᩻ۙ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47658(final int i) {
        for (C7795 c7795 : this.f68999) {
            final ?? r2 = c7795.f25665;
            C17983.m41836(c7795.f25664, new Runnable() { // from class: l.ۡ᩻ۙ
                /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, l.ܺ᩻ۙ] */
                @Override // java.lang.Runnable
                public final void run() {
                    C21200 c21200 = this.f31294;
                    r2.mo2582(c21200.f69000, c21200.f69001, i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47657() {
        for (C7795 c7795 : this.f68999) {
            C17983.m41836(c7795.f25664, new RunnableC12217(1, this, c7795.f25665));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, l.ܺ᩻ۙ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47660(final Exception exc) {
        for (C7795 c7795 : this.f68999) {
            final ?? r2 = c7795.f25665;
            C17983.m41836(c7795.f25664, new Runnable() { // from class: l.ۤ᩻ۙ
                /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, l.ܺ᩻ۙ] */
                @Override // java.lang.Runnable
                public final void run() {
                    C21200 c21200 = this.f36286;
                    r2.mo2583(c21200.f69000, c21200.f69001, exc);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m47663() {
        for (C7795 c7795 : this.f68999) {
            C17983.m41836(c7795.f25664, new RunnableC5824(1, this, c7795.f25665));
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m47662() {
        for (C7795 c7795 : this.f68999) {
            C17983.m41836(c7795.f25664, new RunnableC10945(2, this, c7795.f25665));
        }
    }
}
