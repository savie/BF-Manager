package l;

import android.content.DialogInterface;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩵ܿۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 14V2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20719 extends AbstractDialogInterfaceOnClickListenerC8552 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC24449 f66400;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20719(ActivityC24449 activityC24449, ActivityC24449 activityC244410) {
        super(activityC244410, -1);
        this.f66400 = activityC24449;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܶ */
    public final void mo1877() {
        ActivityC24449 activityC24449 = this.f66400;
        String strTrim = m22914().trim();
        if (strTrim.isEmpty()) {
            m22951();
            return;
        }
        if (strTrim.contains("\\") || strTrim.contains("/")) {
            m22952(R.string.MT_Protector);
            return;
        }
        AbstractC22044 abstractC22044M19191 = C6912.m19191(strTrim);
        if (abstractC22044M19191.mo2934()) {
            m22952(R.string.MT_Protector);
            return;
        }
        try {
            abstractC22044M19191.m49879("{\n  \"example1\"\n  \"例子1\"\n}\n{\n  \"example2\"\n  \"例子2\"\n}\n{\n  \"LineBreak\\nLineBreak\"\n  \"换行\\n换行\"\n}\n");
            ActivityC24449.m54696(activityC24449);
            m22951();
        } catch (Exception e) {
            activityC24449.m40401(e, (DialogInterface.OnDismissListener) null);
        }
    }
}
