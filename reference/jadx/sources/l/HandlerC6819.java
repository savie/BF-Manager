package l;

import android.animation.ObjectAnimator;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ۜܳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: YALU */
/* JADX INFO: loaded from: classes2.dex */
public final class HandlerC6819 extends Handler {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final WeakReference f22984;

    public HandlerC6819(TextView textView) {
        this.f22984 = new WeakReference(textView);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        View view = (View) this.f22984.get();
        if (view != null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
            objectAnimatorOfFloat.addListener(new C3996(view));
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }
    }
}
