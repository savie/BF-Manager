package l;

import android.os.Message;
import android.view.View;

/* JADX INFO: renamed from: l.ۙۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: I67T */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnClickListenerC4428 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17834 f15742;

    public ViewOnClickListenerC4428(C17834 c17834) {
        this.f15742 = c17834;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message messageObtain;
        Message message;
        Message message2;
        Message message3;
        C17834 c17834 = this.f15742;
        if (view == c17834.f56506 && (message3 = c17834.f56502) != null) {
            messageObtain = Message.obtain(message3);
        } else if (view == c17834.f56479 && (message2 = c17834.f56469) != null) {
            messageObtain = Message.obtain(message2);
        } else {
            messageObtain = (view != c17834.f56475 || (message = c17834.f56509) == null) ? null : Message.obtain(message);
        }
        if (messageObtain != null) {
            messageObtain.sendToTarget();
        }
        c17834.f56505.obtainMessage(1, c17834.f56483).sendToTarget();
    }
}
