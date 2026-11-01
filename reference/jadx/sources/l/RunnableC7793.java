package l;

import android.widget.EditText;
import com.google.android.material.motion.MaterialBackOrchestrator;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: l.۟᩻ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC7793 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f25662;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f25663;

    public /* synthetic */ RunnableC7793(int i, Object obj) {
        this.f25662 = i;
        this.f25663 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f25662) {
            case 0:
                C6111.m16654((C6111) this.f25663);
                break;
            case 1:
                C7421.m19857((C7421) this.f25663);
                break;
            case 2:
                ((EditText) this.f25663).selectAll();
                break;
            case 3:
                ((MaterialBackOrchestrator) this.f25663).startListeningForBackCallbacksWithPriorityOverlay();
                break;
            default:
                ((TextInputLayout) this.f25663).lambda$onGlobalLayout$1();
                break;
        }
    }
}
