package l;

import android.view.View;
import android.widget.EditText;

/* JADX INFO: renamed from: l.֡᩷ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: MB7O */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC0661 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f2795;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f2796;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f2797;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f2798;

    public /* synthetic */ ViewOnClickListenerC0661(Object obj, Object obj2, Object obj3, int i) {
        this.f2796 = i;
        this.f2798 = obj;
        this.f2795 = obj2;
        this.f2797 = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f2796) {
            case 0:
                C3246 c3246 = (C3246) this.f2798;
                EditText editText = (EditText) this.f2795;
                EditText editText2 = (EditText) this.f2797;
                c3246.m9718();
                C4388.m12238(c3246.f12072, c3246.f12075, editText, editText2);
                break;
            default:
                C23519.m51786((boolean[]) this.f2798, (DialogInterfaceC19356) this.f2795, (Runnable) this.f2797);
                break;
        }
    }
}
