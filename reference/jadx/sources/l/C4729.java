package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۙۜۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: G16V */
/* JADX INFO: loaded from: classes3.dex */
public final class C4729 extends AbstractDialogInterfaceOnClickListenerC8552 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC10694 f16654;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f16655;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4729(ActivityC10694 activityC10694, ActivityC10694 activityC10695, String str) {
        super(activityC10695, -1);
        this.f16654 = activityC10694;
        this.f16655 = str;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܶ */
    public final void mo1877() {
        ActivityC10694 activityC10694 = this.f16654;
        String strM22914 = m22914();
        if (strM22914.length() == 0) {
            m22951();
            return;
        }
        if (strM22914.contains("/") || strM22914.contains("\\")) {
            m22952(R.string.MT_Protector);
            return;
        }
        if (C16704.m39468(strM22914)) {
            m22952(R.string.MT_Protector);
            return;
        }
        try {
            C16704.m39464(this.f16655, strM22914);
        } catch (IOException e) {
            activityC10694.m40401(e, (DialogInterface.OnDismissListener) null);
        }
        activityC10694.f33934 = C16704.m39467();
        activityC10694.f33935.notifyDataSetChanged();
        m22951();
    }
}
