package l;

import android.os.Handler;
import android.widget.EditText;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ܰᩴۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: NB2C */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC14792 extends AbstractC22340 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final WeakReference f48401;

    @Override // l.AbstractC22340
    /* JADX INFO: renamed from: ᩷ */
    public final void mo26322() {
        Handler handler;
        EditText editText = (EditText) this.f48401.get();
        if (editText == null || (handler = editText.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C21506.m48915((EditText) this.f48401.get(), 1);
    }

    public RunnableC14792(EditText editText) {
        this.f48401 = new WeakReference(editText);
    }
}
