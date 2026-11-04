package l;

import android.widget.CheckBox;

/* JADX INFO: renamed from: l.ۧۘ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC11364 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7941 f35775;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC18143 f35776;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CheckBox f35777;

    public /* synthetic */ RunnableC11364(C7941 c7941, CheckBox checkBox, ActivityC18143 activityC18143) {
        this.f35775 = c7941;
        this.f35777 = checkBox;
        this.f35776 = activityC18143;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7941 c7941 = this.f35775;
        c7941.getClass();
        boolean zIsChecked = this.f35777.isChecked();
        ActivityC18143 activityC18143 = this.f35776;
        if (!zIsChecked) {
            activityC18143.m42298(false);
        } else {
            c7941.m21618();
            activityC18143.m42306(false);
        }
    }
}
