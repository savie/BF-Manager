package l;

import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۟᩵ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5P7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7668 extends AbstractDialogInterfaceOnClickListenerC17341 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC21073 f25359;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7668(ActivityC21073 activityC21073, ActivityC21073 activityC21074) {
        super(activityC21074, -1);
        this.f25359 = activityC21073;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1069() {
        String strM40352 = m40352();
        boolean zIsEmpty = strM40352.isEmpty();
        ActivityC21073 activityC21073 = this.f25359;
        if (zIsEmpty) {
            strM40352 = activityC21073.getString(R.string.MT_Protector);
        }
        activityC21073.f68635 = strM40352;
        for (TextView textView : activityC21073.f68633) {
            textView.setText(strM40352);
        }
        ApplicationC0716.f2992.edit().putString("font_viewer_displayed_text", activityC21073.f68635).apply();
        m40364();
    }
}
