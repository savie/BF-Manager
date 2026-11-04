package l;

import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.tencent.open.TDialog;

/* JADX INFO: renamed from: l.ܿۙ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC18100 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TDialog f59237;

    public RunnableC18100(TDialog tDialog) {
        this.f59237 = tDialog;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View decorView;
        View childAt;
        Window window = this.f59237.getWindow();
        if (window == null || (decorView = window.getDecorView()) == null || (childAt = ((ViewGroup) decorView).getChildAt(0)) == null) {
            return;
        }
        childAt.setPadding(0, 0, 0, 0);
    }
}
