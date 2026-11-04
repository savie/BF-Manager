package l;

import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܽۡ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: C5P7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17466 extends AbstractDialogInterfaceOnClickListenerC8552 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC15974 f56785;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17466(ActivityC15974 activityC15974, ActivityC15974 activityC15975) {
        super(activityC15975, -1);
        this.f56785 = activityC15974;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܶ */
    public final void mo1877() {
        String strM22914 = m22914();
        boolean zIsEmpty = strM22914.isEmpty();
        ActivityC15974 activityC15974 = this.f56785;
        if (zIsEmpty) {
            strM22914 = activityC15974.getString(R.string.MT_Protector);
        }
        activityC15974.f51860 = strM22914;
        for (TextView textView : activityC15974.f51858) {
            textView.setText(strM22914);
        }
        ApplicationC17729.f58258.edit().putString("font_viewer_displayed_text", activityC15974.f51860).apply();
        m22951();
    }
}
