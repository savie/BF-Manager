package l;

import android.view.View;

/* JADX INFO: renamed from: l.۫ۜ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: I29D */
/* JADX INFO: loaded from: classes3.dex */
public final class C12251 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f40992;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5900 f40993;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f40994;

    public C12251(C5900 c5900) {
        this.f40993 = c5900;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m30458(int i) {
        if (!this.f40994) {
            C5900 c5900 = this.f40993;
            int paddingTop = c5900.f20120.getPaddingTop();
            int height = (c5900.f20120.getHeight() - paddingTop) - c5900.f20120.getPaddingBottom();
            if (height <= 0) {
                return false;
            }
            View childAt = c5900.f20120.getChildAt(i - c5900.f20120.getFirstVisiblePosition());
            if (!this.f40992 && (childAt == null || childAt.getBottom() <= paddingTop || childAt.getTop() >= paddingTop + height)) {
                this.f40992 = true;
                c5900.f20120.setSelection(i);
                return false;
            }
            this.f40994 = true;
            if (childAt != null) {
                if (this.f40992) {
                    c5900.f20120.setSelectionFromTop(i, Math.max(0, (height - childAt.getHeight()) / 2));
                    return false;
                }
                if (childAt.getTop() < paddingTop || childAt.getBottom() > paddingTop + height) {
                    c5900.f20120.setSelectionFromTop(i, childAt.getTop() < paddingTop ? 0 : Math.max(0, height - childAt.getHeight()));
                    return false;
                }
            }
        }
        return true;
    }
}
