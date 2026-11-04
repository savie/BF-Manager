package l;

import android.view.View;

/* JADX INFO: renamed from: l.ۛۛܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I29D */
/* JADX INFO: loaded from: classes3.dex */
public final class C6204 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f21116;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3966 f21117;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f21118;

    public C6204(C3966 c3966) {
        this.f21117 = c3966;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m17842(int i) {
        if (!this.f21118) {
            C3966 c3966 = this.f21117;
            int paddingTop = c3966.f13559.getPaddingTop();
            int height = (c3966.f13559.getHeight() - paddingTop) - c3966.f13559.getPaddingBottom();
            if (height <= 0) {
                return false;
            }
            View childAt = c3966.f13559.getChildAt(i - c3966.f13559.getFirstVisiblePosition());
            if (!this.f21116 && (childAt == null || childAt.getBottom() <= paddingTop || childAt.getTop() >= paddingTop + height)) {
                this.f21116 = true;
                c3966.f13559.setSelection(i);
                return false;
            }
            this.f21118 = true;
            if (childAt != null) {
                if (this.f21116) {
                    c3966.f13559.setSelectionFromTop(i, Math.max(0, (height - childAt.getHeight()) / 2));
                    return false;
                }
                if (childAt.getTop() < paddingTop || childAt.getBottom() > paddingTop + height) {
                    c3966.f13559.setSelectionFromTop(i, childAt.getTop() < paddingTop ? 0 : Math.max(0, height - childAt.getHeight()));
                    return false;
                }
            }
        }
        return true;
    }
}
