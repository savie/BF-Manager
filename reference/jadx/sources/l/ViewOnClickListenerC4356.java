package l;

import android.view.View;

/* JADX INFO: renamed from: l.ۘᩴۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8AHX */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC4356 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f15733;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f15734;

    public /* synthetic */ ViewOnClickListenerC4356(int i, Object obj) {
        this.f15733 = i;
        this.f15734 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f15733;
        Object obj = this.f15734;
        switch (i) {
            case 0:
                C19272.m44611((C19272) obj);
                break;
            case 1:
                C3328.m10963((C3328) obj, view);
                break;
            case 2:
                C5258.m15821((C5258) obj);
                break;
            default:
                int i2 = ActivityC3041.f9847;
                ((ActivityC3041) obj).finish();
                break;
        }
    }
}
