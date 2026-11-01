package l;

import android.widget.TextView;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۢܺۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1TT */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC9685 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnLayoutChangeListenerC3333 f32653;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f32654;

    public RunnableC9685(ViewOnLayoutChangeListenerC3333 viewOnLayoutChangeListenerC3333, TextView textView) {
        this.f32653 = viewOnLayoutChangeListenerC3333;
        this.f32654 = textView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewOnLayoutChangeListenerC3333 viewOnLayoutChangeListenerC3333 = this.f32653;
        if (viewOnLayoutChangeListenerC3333.f12358.getVisibility() == 8) {
            return;
        }
        TextView textView = this.f32654;
        int iIntValue = ((Integer) textView.getTag()).intValue();
        if (iIntValue == 0) {
            viewOnLayoutChangeListenerC3333.f12358.setVisibility(8);
            return;
        }
        textView.setText(C16737.m39288(R.string.MT_Protector) + " (" + iIntValue + MotionUtils.EASING_TYPE_FORMAT_END);
        textView.setTag(Integer.valueOf(iIntValue + (-1)));
        C16737.m39274(this, 1000L);
    }
}
