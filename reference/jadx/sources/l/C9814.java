package l;

import android.widget.EditText;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۢ᩶ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9814 extends AbstractC21013 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC3588 f33562;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9814(ActivityC3588 activityC3588) {
        super(activityC3588);
        this.f33562 = activityC3588;
        m47198(R.string.MT_Protector);
        m47196(R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m24917() {
        EditText editTextM47193 = m47193(0);
        ActivityC3588 activityC3588 = this.f33562;
        editTextM47193.setText(EnumC3364.m10017(activityC3588.f13204.f7907.f45868));
        m47193(1).setText(activityC3588.f13204.f7907.f45863.m6314());
        m47193(2).setText(activityC3588.f13204.f7907.f45865 != null ? activityC3588.f13204.f7907.f45865.m24674(" ") : "");
        m47193(3).setText(activityC3588.f13204.f7907.f45870 != null ? activityC3588.f13204.f7907.f45870.m35176() : "");
        m47192();
    }

    @Override // l.AbstractC21013
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo13875() {
        int value;
        String[] strArrSplit;
        String[] strArrSplit2;
        ActivityC3588 activityC3588 = this.f33562;
        try {
            String string = m47193(0).getText().toString();
            if (string.equals("") || (strArrSplit2 = ActivityC3588.f13199.split(string)) == null) {
                value = 0;
            } else {
                value = 0;
                for (String str : strArrSplit2) {
                    value |= EnumC3364.m10019(str).getValue();
                }
            }
            activityC3588.f13204.f7907.f45868 = value;
            activityC3588.f13204.f7907.f45863 = C1953.m6312(m47193(1).getText().toString(), activityC3588.f13204.f7900);
            ArrayList arrayList = new ArrayList();
            String string2 = m47193(2).getText().toString();
            if (!string2.equals("") && (strArrSplit = ActivityC3588.f13199.split(string2)) != null) {
                for (String str2 : strArrSplit) {
                    if (!str2.equals("")) {
                        arrayList.add(C1953.m6312(str2, activityC3588.f13204.f7900));
                    }
                }
            }
            activityC3588.f13204.f7907.f45865 = arrayList.size() > 0 ? C9716.m24672(activityC3588.f13204.f7900, arrayList) : null;
            String strTrim = m47193(3).getText().toString().trim();
            if (!strTrim.equals("")) {
                activityC3588.f13204.f7907.f45870 = C14655.m35175(strTrim, activityC3588.f13204.f7900);
            } else {
                activityC3588.f13204.f7907.f45870 = null;
            }
            ActivityC3588.f13200 = true;
            C15829.m37611(R.string.MT_Protector);
            return true;
        } catch (Exception unused) {
            C15829.m37611(R.string.MT_Protector);
            return false;
        }
    }
}
