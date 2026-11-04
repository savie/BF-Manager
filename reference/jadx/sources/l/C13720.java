package l;

import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۬۠ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: G16V */
/* JADX INFO: loaded from: classes4.dex */
public final class C13720 extends AbstractDialogInterfaceOnClickListenerC8552 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC10694 f43549;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f43550;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13720(ActivityC10694 activityC10694, ActivityC10694 activityC10695, String str) {
        super(activityC10695, -1);
        this.f43549 = activityC10694;
        this.f43550 = str;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܶ */
    public final void mo1877() {
        String strM22914 = m22914();
        if (strM22914.length() != 0) {
            String str = this.f43550;
            if (!strM22914.equals(str)) {
                if (strM22914.contains("/") || strM22914.contains("\\")) {
                    m22952(R.string.MT_Protector);
                    return;
                }
                if (!str.equalsIgnoreCase(strM22914) && C16704.m39468(strM22914)) {
                    m22952(R.string.MT_Protector);
                    return;
                }
                if (!C16704.m39469(str, strM22914)) {
                    C22673.m51152(R.string.MT_Protector);
                }
                ArrayList arrayListM39467 = C16704.m39467();
                ActivityC10694 activityC10694 = this.f43549;
                activityC10694.f33934 = arrayListM39467;
                activityC10694.f33935.notifyDataSetChanged();
                m22951();
                return;
            }
        }
        m22951();
    }
}
