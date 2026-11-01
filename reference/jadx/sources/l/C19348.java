package l;

import android.view.View;

/* JADX INFO: renamed from: l.᩵۠᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 715M */
/* JADX INFO: loaded from: classes4.dex */
public class C19348 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f62385;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final View[] f62386;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f62387;

    public C19348(View... viewArr) {
        this.f62386 = viewArr;
    }

    @InterfaceC16341
    public void setAlpha(float f) {
        for (View view : this.f62386) {
            view.setAlpha(f);
        }
        if (f == 0.0f) {
            if (this.f62385) {
                m44354(8);
            } else if (this.f62387) {
                m44354(4);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44354(int i) {
        for (View view : this.f62386) {
            view.setVisibility(i);
        }
    }
}
