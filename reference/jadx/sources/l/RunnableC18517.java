package l;

import android.view.View;
import bin.mt.plugin.api.ui.dialog.DualProgressDialog;
import com.google.android.material.internal.ViewUtils;

/* JADX INFO: renamed from: l.ᩴۘ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 123V */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC18517 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f58971;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f58972;

    public /* synthetic */ RunnableC18517(int i, Object obj) {
        this.f58971 = i;
        this.f58972 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f58971) {
            case 0:
                ((C11545) this.f58972).m28823();
                break;
            case 1:
                C0435.m2255((C0435) this.f58972);
                break;
            case 2:
                C9246.m23768((C9246) this.f58972);
                break;
            case 3:
                ((C0103) this.f58972).m1093();
                break;
            case 4:
                ((DualProgressDialog) this.f58972).lambda$dismiss$3();
                break;
            case 5:
                ((InterfaceC16966) this.f58972).mo16480();
                break;
            default:
                ViewUtils.requestFocusAndShowKeyboard((View) this.f58972, false);
                break;
        }
    }
}
