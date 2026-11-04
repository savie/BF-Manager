package l;

import bin.mt.plus.R;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩹᩶ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes.dex */
public final class C23791 extends AbstractDialogInterfaceOnClickListenerC8552 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f77064;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC22957 f77065;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f77066;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23791(ActivityC22957 activityC22957, ActivityC22957 activityC22958, String str, boolean z) {
        super(activityC22958, -1);
        this.f77065 = activityC22957;
        this.f77066 = str;
        this.f77064 = z;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܶ */
    public final void mo1877() {
        String strTrim = m22914().replace('.', '/').trim();
        if (strTrim.length() != 0) {
            String str = this.f77066;
            if (!strTrim.equals(str)) {
                ActivityC22957 activityC22957 = this.f77065;
                Iterator it = activityC22957.f74569.f24305.f71553.iterator();
                while (it.hasNext()) {
                    if (((String) it.next()).equals(strTrim)) {
                        m22925(String.format(activityC22957.getString(R.string.MT_Protector), strTrim));
                        return;
                    }
                }
                String strReplace = str.replace('.', '/');
                if (this.f77064) {
                    strTrim = strTrim.concat("/");
                    strReplace = C14483.m34972(strReplace, "/");
                }
                ActivityC22957.m51762(activityC22957, C8947.m23910(new StringBuilder(), activityC22957.f74569.f24305.f71549, strReplace), C8947.m23910(new StringBuilder(), activityC22957.f74569.f24305.f71549, strTrim));
                ActivityC22957.f74567 = true;
                activityC22957.f74569.f24316.clear();
                for (C4072 c4072 : activityC22957.f74569.f24317.f80105.m38078()) {
                    activityC22957.f74569.f24316.put(C1402.m5124(1, 1, c4072.m13151().m46860()), c4072);
                }
                activityC22957.f74569.f24310.m15303(activityC22957.f74569.f24316.keySet());
                activityC22957.m51774();
                m22951();
                return;
            }
        }
        m22951();
    }
}
