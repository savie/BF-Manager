package l;

import android.content.Context;
import android.graphics.RectF;
import android.widget.ImageView;

/* JADX INFO: renamed from: l.ᩳܽ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: T5PO */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC18172 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C7589 f58066;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f58067;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnTouchListenerC18878 f58068;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f58069;

    public RunnableC18172(Context context, ViewOnTouchListenerC18878 viewOnTouchListenerC18878) {
        this.f58068 = viewOnTouchListenerC18878;
        this.f58066 = new C7589(context);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42294() {
        this.f58066.m20122();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42295(int i, int i2, int i3, int i4) {
        int i5;
        int iRound;
        int i6;
        int iRound2;
        RectF rectFM43551 = this.f58068.m43551();
        if (rectFM43551 == null) {
            return;
        }
        int iRound3 = Math.round(-rectFM43551.left);
        float f = i;
        if (f < rectFM43551.width()) {
            iRound = Math.round(rectFM43551.width() - f);
            i5 = 0;
        } else {
            i5 = iRound3;
            iRound = i5;
        }
        int iRound4 = Math.round(-rectFM43551.top);
        float f2 = i2;
        if (f2 < rectFM43551.height()) {
            iRound2 = Math.round(rectFM43551.height() - f2);
            i6 = 0;
        } else {
            i6 = iRound4;
            iRound2 = i6;
        }
        this.f58067 = iRound3;
        this.f58069 = iRound4;
        if (iRound3 == iRound && iRound4 == iRound2) {
            return;
        }
        this.f58066.m20118(iRound3, iRound4, i3, i4, i5, iRound, i6, iRound2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewOnTouchListenerC18878 viewOnTouchListenerC18878;
        ImageView imageViewM43539;
        C7589 c7589 = this.f58066;
        if (c7589.m20120() || (imageViewM43539 = (viewOnTouchListenerC18878 = this.f58068).m43539()) == null || !c7589.m20119()) {
            return;
        }
        int iM20121 = c7589.m20121();
        int iM20117 = c7589.m20117();
        viewOnTouchListenerC18878.f61141.postTranslate(this.f58067 - iM20121, this.f58069 - iM20117);
        viewOnTouchListenerC18878.m43536(viewOnTouchListenerC18878.m43548());
        this.f58067 = iM20121;
        this.f58069 = iM20117;
        imageViewM43539.postOnAnimation(this);
    }
}
