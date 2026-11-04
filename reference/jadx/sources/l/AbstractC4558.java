package l;

import android.view.View;

/* JADX INFO: renamed from: l.ۙ֨ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 98EM */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4558 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final View[] f16177;

    public AbstractC4558(View... viewArr) {
        this.f16177 = viewArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14309() {
        for (View view : this.f16177) {
            view.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m14310() {
        for (View view : this.f16177) {
            view.setVisibility(0);
        }
    }
}
