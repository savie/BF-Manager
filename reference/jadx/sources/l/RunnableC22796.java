package l;

import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: l.᩺ۛ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC22796 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f74180;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f74181;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f74182;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f74183;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f74184;

    public /* synthetic */ RunnableC22796(View view, Object obj, Object obj2, Object obj3, int i) {
        this.f74182 = i;
        this.f74184 = view;
        this.f74180 = obj;
        this.f74183 = obj2;
        this.f74181 = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f74182) {
            case 0:
                C5301.m14705((TextInputLayout) this.f74184, (EditText) this.f74180, (AbstractActivityC12483) this.f74183, (DialogInterfaceC19356) this.f74181);
                break;
            default:
                C6111.m16665((C6111) this.f74184, (InterfaceC2916) this.f74180, (C16408) this.f74183, (RuntimeException) this.f74181);
                break;
        }
    }
}
