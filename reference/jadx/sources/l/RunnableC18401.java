package l;

import android.view.View;

/* JADX INFO: renamed from: l.ܿܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: NAVX */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC18401 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f59939;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f59940 = 0;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC7960 f59941;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19147 f59942;

    public RunnableC18401(C19147 c19147, View view, InterfaceC7960 interfaceC7960) {
        this.f59942 = c19147;
        this.f59939 = view;
        this.f59941 = interfaceC7960;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.f59939;
        if (view.isPressed()) {
            int i = this.f59940;
            this.f59940 = i + 1;
            if (i > 0) {
                view.performHapticFeedback(0);
            }
            this.f59942.f61964.f53761.mo11455(view, this.f59941);
            int i2 = this.f59940;
            if (i2 < 50) {
                C21576.m49069(this, (((50 - i2) * 130) / 50) + 20);
            } else {
                C21576.m49069(this, 20L);
            }
        }
    }
}
