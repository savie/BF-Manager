package l;

import android.content.DialogInterface;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩷֡ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 14V2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20523 extends AbstractDialogInterfaceOnClickListenerC17341 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC0061 f66501;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20523(ActivityC0061 activityC0061, ActivityC0061 activityC0062) {
        super(activityC0062, -1);
        this.f66501 = activityC0061;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1069() {
        ActivityC0061 activityC0061 = this.f66501;
        String strTrim = m40352().trim();
        if (strTrim.isEmpty()) {
            m40364();
            return;
        }
        if (strTrim.contains("\\") || strTrim.contains("/")) {
            m40365(R.string.MT_Protector);
            return;
        }
        AbstractC20745 abstractC20745M12969 = C4678.m12969(strTrim);
        if (abstractC20745M12969.mo33975()) {
            m40365(R.string.MT_Protector);
            return;
        }
        try {
            abstractC20745M12969.m46735("{\n  \"example1\"\n  \"例子1\"\n}\n{\n  \"example2\"\n  \"例子2\"\n}\n{\n  \"LineBreak\\nLineBreak\"\n  \"换行\\n换行\"\n}\n");
            ActivityC0061.m972(activityC0061);
            m40364();
        } catch (Exception e) {
            activityC0061.m31002(e, (DialogInterface.OnDismissListener) null);
        }
    }
}
