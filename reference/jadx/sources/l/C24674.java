package l;

import android.view.View;

/* JADX INFO: renamed from: l.᩻֡ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 715M */
/* JADX INFO: loaded from: classes.dex */
public class C24674 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f79845;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final View[] f79846;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f79847;

    public C24674(View... viewArr) {
        this.f79846 = viewArr;
    }

    @InterfaceC19352
    public void setAlpha(float f) {
        for (View view : this.f79846) {
            view.setAlpha(f);
        }
        if (f == 0.0f) {
            if (this.f79845) {
                m55018(8);
            } else if (this.f79847) {
                m55018(4);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55018(int i) {
        for (View view : this.f79846) {
            view.setVisibility(i);
        }
    }
}
