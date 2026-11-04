package l;

import android.os.Message;
import android.view.View;

/* JADX INFO: renamed from: l.ۤᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: I67T */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC11059 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3602 f34890;

    public ViewOnClickListenerC11059(C3602 c3602) {
        this.f34890 = c3602;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message messageObtain;
        Message message;
        Message message2;
        Message message3;
        C3602 c3602 = this.f34890;
        if (view == c3602.f12338 && (message3 = c3602.f12349) != null) {
            messageObtain = Message.obtain(message3);
        } else if (view == c3602.f12341 && (message2 = c3602.f12330) != null) {
            messageObtain = Message.obtain(message2);
        } else {
            messageObtain = (view != c3602.f12311 || (message = c3602.f12351) == null) ? null : Message.obtain(message);
        }
        if (messageObtain != null) {
            messageObtain.sendToTarget();
        }
        c3602.f12315.obtainMessage(1, c3602.f12350).sendToTarget();
    }
}
