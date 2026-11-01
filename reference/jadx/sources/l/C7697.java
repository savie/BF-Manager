package l;

import bin.mt.plus.R;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۟᩶ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7697 extends AbstractDialogInterfaceOnClickListenerC17341 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC3588 f25477;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f25478;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f25479;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7697(ActivityC3588 activityC3588, ActivityC3588 activityC3589, String str, boolean z) {
        super(activityC3589, -1);
        this.f25477 = activityC3588;
        this.f25478 = str;
        this.f25479 = z;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1069() {
        String strTrim = m40352().replace('.', '/').trim();
        if (strTrim.length() != 0) {
            String str = this.f25478;
            if (!strTrim.equals(str)) {
                ActivityC3588 activityC3588 = this.f25477;
                Iterator it = activityC3588.f13204.f7897.f3087.iterator();
                while (it.hasNext()) {
                    if (((String) it.next()).equals(strTrim)) {
                        m40347(String.format(activityC3588.getString(R.string.MT_Protector), strTrim));
                        return;
                    }
                }
                String strReplace = str.replace('.', '/');
                if (this.f25479) {
                    strTrim = strTrim.concat("/");
                    strReplace = C15489.m37076(strReplace, "/");
                }
                ActivityC3588.m10612(activityC3588, C22697.m50267(new StringBuilder(), activityC3588.f13204.f7897.f3083, strReplace), C22697.m50267(new StringBuilder(), activityC3588.f13204.f7897.f3083, strTrim));
                ActivityC3588.f13200 = true;
                activityC3588.f13204.f7902.clear();
                for (C13929 c13929 : activityC3588.f13204.f7900.f40371.m28059()) {
                    activityC3588.f13204.f7902.put(C20630.m46498(1, 1, c13929.m33765().m6314()), c13929);
                }
                activityC3588.f13204.f7906.m48752(activityC3588.f13204.f7902.keySet());
                activityC3588.m10621();
                m40364();
                return;
            }
        }
        m40364();
    }
}
