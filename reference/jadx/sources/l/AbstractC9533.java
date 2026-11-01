package l;

import android.view.View;

/* JADX INFO: renamed from: l.ۢۤ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 98EM */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9533 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final View[] f32221;

    public AbstractC9533(View... viewArr) {
        this.f32221 = viewArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24378() {
        for (View view : this.f32221) {
            view.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m24379() {
        for (View view : this.f32221) {
            view.setVisibility(0);
        }
    }
}
