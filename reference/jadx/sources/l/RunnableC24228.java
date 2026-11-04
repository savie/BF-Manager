package l;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import bin.mt.plugin.api.util.AsyncTask;
import bin.mt.plus.Main;

/* JADX INFO: renamed from: l.᩺ۤۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC24228 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f78476;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f78477;

    public /* synthetic */ RunnableC24228(int i, Object obj) {
        this.f78476 = i;
        this.f78477 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f78476) {
            case 0:
                ((C1626) this.f78477).m5764((CharSequence) null);
                break;
            case 1:
                View view = (View) this.f78477;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                break;
            case 2:
                C14751.m35434((Main) this.f78477);
                break;
            case 3:
                ((AsyncTask) this.f78477).lambda$start$0();
                break;
            default:
                ((C14941) this.f78477).notifyDataSetChanged();
                break;
        }
    }
}
