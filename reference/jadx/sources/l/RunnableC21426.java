package l;

import android.widget.CheckBox;

/* JADX INFO: renamed from: l.᩸۟ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC21426 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC11632 f69675;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20409 f69676;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CheckBox f69677;

    public /* synthetic */ RunnableC21426(C20409 c20409, CheckBox checkBox, ActivityC11632 activityC11632) {
        this.f69676 = c20409;
        this.f69677 = checkBox;
        this.f69675 = activityC11632;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C20409 c20409 = this.f69676;
        c20409.getClass();
        boolean zIsChecked = this.f69677.isChecked();
        ActivityC11632 activityC11632 = this.f69675;
        if (!zIsChecked) {
            activityC11632.m29024(false);
        } else {
            c20409.m46150();
            activityC11632.m29017(false);
        }
    }
}
