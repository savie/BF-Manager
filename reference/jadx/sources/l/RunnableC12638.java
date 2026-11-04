package l;

import android.widget.TextView;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۨ᩷᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: N1TT */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC12638 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnLayoutChangeListenerC6673 f40544;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f40545;

    public RunnableC12638(ViewOnLayoutChangeListenerC6673 viewOnLayoutChangeListenerC6673, TextView textView) {
        this.f40544 = viewOnLayoutChangeListenerC6673;
        this.f40545 = textView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewOnLayoutChangeListenerC6673 viewOnLayoutChangeListenerC6673 = this.f40544;
        if (viewOnLayoutChangeListenerC6673.f22251.getVisibility() == 8) {
            return;
        }
        TextView textView = this.f40545;
        int iIntValue = ((Integer) textView.getTag()).intValue();
        if (iIntValue == 0) {
            viewOnLayoutChangeListenerC6673.f22251.setVisibility(8);
            return;
        }
        textView.setText(C21576.m49088(R.string.MT_Protector) + " (" + iIntValue + MotionUtils.EASING_TYPE_FORMAT_END);
        textView.setTag(Integer.valueOf(iIntValue + (-1)));
        C21576.m49069(this, 1000L);
    }
}
