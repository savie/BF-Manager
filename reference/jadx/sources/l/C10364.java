package l;

import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۢ᩶ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10364 extends AbstractC9781 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC22957 f32986;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10364(ActivityC22957 activityC22957) {
        super(activityC22957);
        this.f32986 = activityC22957;
        m25513(R.string.MT_Protector);
        m25512(R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m26664() {
        C23255 c23255M25509 = m25509(0);
        ActivityC22957 activityC22957 = this.f32986;
        c23255M25509.mo52335((CharSequence) EnumC6266.m17917(activityC22957.f74569.f24319.f13901));
        m25509(1).mo52335((CharSequence) activityC22957.f74569.f24319.f13905.m46860());
        m25509(2).mo52335((CharSequence) (activityC22957.f74569.f24319.f13902 != null ? activityC22957.f74569.f24319.f13902.m30518(" ") : ""));
        m25509(3).mo52335((CharSequence) (activityC22957.f74569.f24319.f13906 != null ? activityC22957.f74569.f24319.f13906.m10827() : ""));
        m25517();
    }

    @Override // l.AbstractC9781
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo5156() {
        int value;
        String[] strArrSplit;
        String[] strArrSplit2;
        ActivityC22957 activityC22957 = this.f32986;
        try {
            String string = m25509(0).m54021().toString();
            if (string.equals("") || (strArrSplit2 = ActivityC22957.f74566.split(string)) == null) {
                value = 0;
            } else {
                value = 0;
                for (String str : strArrSplit2) {
                    value |= EnumC6266.m17919(str).getValue();
                }
            }
            activityC22957.f74569.f24319.f13901 = value;
            activityC22957.f74569.f24319.f13905 = C20436.m46859(m25509(1).m54021().toString(), activityC22957.f74569.f24317);
            ArrayList arrayList = new ArrayList();
            String string2 = m25509(2).m54021().toString();
            if (!string2.equals("") && (strArrSplit = ActivityC22957.f74566.split(string2)) != null) {
                for (String str2 : strArrSplit) {
                    if (!str2.equals("")) {
                        arrayList.add(C20436.m46859(str2, activityC22957.f74569.f24317));
                    }
                }
            }
            activityC22957.f74569.f24319.f13902 = arrayList.size() > 0 ? C12231.m30516(activityC22957.f74569.f24317, arrayList) : null;
            String strTrim = m25509(3).m54021().toString().trim();
            if (!strTrim.equals("")) {
                activityC22957.f74569.f24319.f13906 = C3282.m10820(strTrim, activityC22957.f74569.f24317);
            } else {
                activityC22957.f74569.f24319.f13906 = null;
            }
            ActivityC22957.f74567 = true;
            C22673.m51152(R.string.MT_Protector);
            return true;
        } catch (Exception unused) {
            C22673.m51152(R.string.MT_Protector);
            return false;
        }
    }
}
