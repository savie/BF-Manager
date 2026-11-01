package l;

import android.animation.ObjectAnimator;
import android.text.TextUtils;
import android.widget.TextView;
import com.alipay.sdk.app.OpenAuthTask;

/* JADX INFO: renamed from: l.᩶ܰۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: N988 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20205 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final TextView f65564;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HandlerC15972 f65565 = new HandlerC15972(this);

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ObjectAnimator f65566;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ObjectAnimator f65567;

    public C20205(TextView textView) {
        this.f65564 = textView;
        textView.setVisibility(8);
        ObjectAnimator duration = ObjectAnimator.ofFloat(textView, "alpha", 0.0f, 1.0f).setDuration(200L);
        this.f65566 = duration;
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(textView, "alpha", 1.0f, 0.0f).setDuration(200L);
        this.f65567 = duration2;
        duration.addListener(new C7504(textView));
        duration2.addListener(new C20910(textView));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45661(int i) {
        m45662(i, 1000);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45662(int i, int i2) {
        TextView textView = this.f65564;
        CharSequence text = textView.getText();
        textView.setText(i);
        m45660(TextUtils.equals(text, textView.getText()));
        HandlerC15972 handlerC15972 = this.f65565;
        handlerC15972.removeMessages(0);
        handlerC15972.sendEmptyMessageDelayed(0, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45663(String str) {
        TextView textView = this.f65564;
        CharSequence text = textView.getText();
        textView.setText(str);
        m45660(TextUtils.equals(text, str));
        HandlerC15972 handlerC15972 = this.f65565;
        handlerC15972.removeMessages(0);
        handlerC15972.sendEmptyMessageDelayed(0, OpenAuthTask.Duplex);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m45660(boolean z) {
        ObjectAnimator objectAnimator = this.f65567;
        if (objectAnimator.isRunning()) {
            objectAnimator.cancel();
        }
        ObjectAnimator objectAnimator2 = this.f65566;
        if (objectAnimator2.isRunning()) {
            return;
        }
        if (z || this.f65564.getVisibility() == 8) {
            objectAnimator2.start();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45659(C20205 c20205) {
        ObjectAnimator objectAnimator = c20205.f65567;
        ObjectAnimator objectAnimator2 = c20205.f65566;
        if (objectAnimator2.isRunning()) {
            objectAnimator2.cancel();
        }
        if (objectAnimator.isRunning() || c20205.f65564.getVisibility() != 0) {
            return;
        }
        objectAnimator.start();
    }
}
