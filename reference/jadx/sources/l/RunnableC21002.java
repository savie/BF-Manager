package l;

import android.content.Context;
import android.graphics.RectF;
import android.widget.ImageView;

/* JADX INFO: renamed from: l.᩶ۖۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5PO */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC21002 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnTouchListenerC18018 f67162;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f67163;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C0865 f67164;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f67165;

    public RunnableC21002(Context context, ViewOnTouchListenerC18018 viewOnTouchListenerC18018) {
        this.f67162 = viewOnTouchListenerC18018;
        this.f67164 = new C0865(context);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48018() {
        this.f67164.m3529();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48019(int i, int i2, int i3, int i4) {
        int i5;
        int iRound;
        int i6;
        int iRound2;
        RectF rectFM42019 = this.f67162.m42019();
        if (rectFM42019 == null) {
            return;
        }
        int iRound3 = Math.round(-rectFM42019.left);
        float f = i;
        if (f < rectFM42019.width()) {
            iRound = Math.round(rectFM42019.width() - f);
            i5 = 0;
        } else {
            i5 = iRound3;
            iRound = i5;
        }
        int iRound4 = Math.round(-rectFM42019.top);
        float f2 = i2;
        if (f2 < rectFM42019.height()) {
            iRound2 = Math.round(rectFM42019.height() - f2);
            i6 = 0;
        } else {
            i6 = iRound4;
            iRound2 = i6;
        }
        this.f67163 = iRound3;
        this.f67165 = iRound4;
        if (iRound3 == iRound && iRound4 == iRound2) {
            return;
        }
        this.f67164.m3525(iRound3, iRound4, i3, i4, i5, iRound, i6, iRound2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewOnTouchListenerC18018 viewOnTouchListenerC18018;
        ImageView imageViewM42022;
        C0865 c0865 = this.f67164;
        if (c0865.m3528() || (imageViewM42022 = (viewOnTouchListenerC18018 = this.f67162).m42022()) == null || !c0865.m3526()) {
            return;
        }
        int iM3527 = c0865.m3527();
        int iM3530 = c0865.m3530();
        viewOnTouchListenerC18018.f58996.postTranslate(this.f67163 - iM3527, this.f67165 - iM3530);
        viewOnTouchListenerC18018.m42009(viewOnTouchListenerC18018.m42015());
        this.f67163 = iM3527;
        this.f67165 = iM3530;
        imageViewM42022.postOnAnimation(this);
    }
}
