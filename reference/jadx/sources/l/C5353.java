package l;

import android.view.View;
import java.util.List;

/* JADX INFO: renamed from: l.ۚ۫ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: K4ND */
/* JADX INFO: loaded from: classes2.dex */
public final class C5353 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f18485;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f18486;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f18487;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f18488;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f18489;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f18490;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f18491;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f18492;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f18493;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f18494;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f18495;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public List f18496;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final View m14852(C21726 c21726) {
        List list = this.f18496;
        if (list == null) {
            View viewM48485 = c21726.m48485(this.f18493);
            this.f18493 += this.f18489;
            return viewM48485;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = ((AbstractC12554) this.f18496.get(i)).itemView;
            C22432 c22432 = (C22432) view.getLayoutParams();
            if (!c22432.f73212.isRemoved() && this.f18493 == c22432.f73212.getLayoutPosition()) {
                m14853(view);
                return view;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14853(View view) {
        int layoutPosition;
        int size = this.f18496.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((AbstractC12554) this.f18496.get(i2)).itemView;
            C22432 c22432 = (C22432) view3.getLayoutParams();
            if (view3 != view && !c22432.f73212.isRemoved() && (layoutPosition = (c22432.f73212.getLayoutPosition() - this.f18493) * this.f18489) >= 0 && layoutPosition < i) {
                view2 = view3;
                if (layoutPosition == 0) {
                    break;
                } else {
                    i = layoutPosition;
                }
            }
        }
        if (view2 == null) {
            this.f18493 = -1;
        } else {
            this.f18493 = ((C22432) view2.getLayoutParams()).f73212.getLayoutPosition();
        }
    }
}
