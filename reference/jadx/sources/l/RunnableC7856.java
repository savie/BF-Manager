package l;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import bin.mt.plugin.api.util.AsyncTask;

/* JADX INFO: renamed from: l.۠֫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: G4ML */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC7856 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f25838;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f25839;

    public /* synthetic */ RunnableC7856(int i, Object obj) {
        this.f25838 = i;
        this.f25839 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f25838;
        Object obj = this.f25839;
        switch (i) {
            case 0:
                ((C9268) obj).m23807();
                break;
            case 1:
                AbstractC17129.m40003((Context) obj);
                break;
            case 2:
                View view = (View) obj;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                break;
            case 3:
                int i2 = C2294.f8171;
                ((C2294) obj).setVisibility(8);
                break;
            case 4:
                C12713.m31560((C12713) obj);
                break;
            case 5:
                C12563.m31272(((C18934) obj).f61255);
                break;
            case 6:
                ((AsyncTask) obj).lambda$start$1();
                break;
            default:
                AbstractC16584.m39011((AbstractC16584) obj);
                break;
        }
    }
}
