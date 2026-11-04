package l;

import android.animation.ObjectAnimator;
import android.text.TextUtils;
import android.widget.TextView;
import com.alipay.sdk.app.OpenAuthTask;

/* JADX INFO: renamed from: l.ܶ᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N988 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16383 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HandlerC17875 f53173 = new HandlerC17875(this);

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ObjectAnimator f53174;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ObjectAnimator f53175;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final TextView f53176;

    public C16383(TextView textView) {
        this.f53176 = textView;
        textView.setVisibility(8);
        ObjectAnimator duration = ObjectAnimator.ofFloat(textView, "alpha", 0.0f, 1.0f).setDuration(200L);
        this.f53174 = duration;
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(textView, "alpha", 1.0f, 0.0f).setDuration(200L);
        this.f53175 = duration2;
        duration.addListener(new C25335(textView));
        duration2.addListener(new C17129(textView));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38881(int i) {
        m38882(i, 1000);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38882(int i, int i2) {
        TextView textView = this.f53176;
        CharSequence text = textView.getText();
        textView.setText(i);
        m38880(TextUtils.equals(text, textView.getText()));
        HandlerC17875 handlerC17875 = this.f53173;
        handlerC17875.removeMessages(0);
        handlerC17875.sendEmptyMessageDelayed(0, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38883(String str) {
        TextView textView = this.f53176;
        CharSequence text = textView.getText();
        textView.setText(str);
        m38880(TextUtils.equals(text, str));
        HandlerC17875 handlerC17875 = this.f53173;
        handlerC17875.removeMessages(0);
        handlerC17875.sendEmptyMessageDelayed(0, OpenAuthTask.Duplex);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m38880(boolean z) {
        ObjectAnimator objectAnimator = this.f53175;
        if (objectAnimator.isRunning()) {
            objectAnimator.cancel();
        }
        ObjectAnimator objectAnimator2 = this.f53174;
        if (objectAnimator2.isRunning()) {
            return;
        }
        if (z || this.f53176.getVisibility() == 8) {
            objectAnimator2.start();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38879(C16383 c16383) {
        ObjectAnimator objectAnimator = c16383.f53175;
        ObjectAnimator objectAnimator2 = c16383.f53174;
        if (objectAnimator2.isRunning()) {
            objectAnimator2.cancel();
        }
        if (objectAnimator.isRunning() || c16383.f53176.getVisibility() != 0) {
            return;
        }
        objectAnimator.start();
    }
}
