package l;

import android.view.View;

/* JADX INFO: renamed from: l.ۙ᩷᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: N1TT */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC5181 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f18084;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f18085;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f18086;

    public /* synthetic */ ViewOnClickListenerC5181(AbstractActivityC17204 abstractActivityC17204, Object obj, int i) {
        this.f18084 = i;
        this.f18086 = abstractActivityC17204;
        this.f18085 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f18084;
        Object obj = this.f18085;
        AbstractActivityC17204 abstractActivityC17204 = this.f18086;
        switch (i) {
            case 0:
                ViewOnLayoutChangeListenerC6673.m18650((ViewOnLayoutChangeListenerC6673) abstractActivityC17204, (DialogInterfaceC8327) obj, view);
                break;
            default:
                ActivityC3786 activityC3786 = (ActivityC3786) abstractActivityC17204;
                int i2 = ActivityC3786.f12968;
                activityC3786.getClass();
                C17494.m41007(activityC3786, (C16748) obj);
                break;
        }
    }
}
