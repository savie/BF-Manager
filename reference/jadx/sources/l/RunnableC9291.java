package l;

import android.view.View;

/* JADX INFO: renamed from: l.ۢۖۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: NAVX */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC9291 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC4433 f31561;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f31562 = 0;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f31563;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13607 f31564;

    public RunnableC9291(C13607 c13607, View view, InterfaceC4433 interfaceC4433) {
        this.f31564 = c13607;
        this.f31563 = view;
        this.f31561 = interfaceC4433;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.f31563;
        if (view.isPressed()) {
            int i = this.f31562;
            this.f31562 = i + 1;
            if (i > 0) {
                view.performHapticFeedback(0);
            }
            this.f31564.f44886.f68906.mo33247(view, this.f31561);
            int i2 = this.f31562;
            if (i2 < 50) {
                C16737.m39274(this, (((50 - i2) * 130) / 50) + 20);
            } else {
                C16737.m39274(this, 20L);
            }
        }
    }
}
