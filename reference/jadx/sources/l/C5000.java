package l;

import android.widget.EditText;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۚ֡ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5000 extends AbstractC21013 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C9841 f17405;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC3588 f17406;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f17407;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5000(ActivityC3588 activityC3588) {
        super(activityC3588);
        this.f17406 = activityC3588;
        m47196(R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector);
        m47193(3).setInputType(2);
        m47198(R.string.MT_Protector);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13874(int i, C9841 c9841) {
        this.f17407 = i;
        this.f17405 = c9841;
        m47193(0).setText(EnumC3364.m10016(c9841.f33622));
        EditText editTextM47193 = m47193(1);
        C20299 c20299 = c9841.f33621;
        editTextM47193.setText(c20299.f65771.m35176());
        m47193(2).setText(c20299.f65772.m40672());
        C17706 c17706 = c9841.f33623;
        if (c17706 != null) {
            m47193(3).setText(String.valueOf(c17706.f56225));
        } else {
            m47200(3).setVisibility(8);
        }
        m47192();
        m47199().setText(R.string.MT_Protector);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m13876() {
        this.f17407 = -1;
        this.f17405 = null;
        m47193(0).setText("public");
        m47193(1).setText("newMethod");
        m47193(2).setText("()V");
        m47193(3).setText("0");
        m47192();
        m47199().setText(R.string.MT_Protector);
    }

    @Override // l.AbstractC21013
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean mo13875() {
        int value;
        String[] strArrSplit;
        int value2;
        String[] strArrSplit2;
        int i = this.f17407;
        ActivityC3588 activityC3588 = this.f17406;
        if (i == -1) {
            String strTrim = m47193(0).getText().toString().trim();
            try {
                if (strTrim.equals("") || (strArrSplit = ActivityC3588.f13199.split(strTrim)) == null) {
                    value = 0;
                } else {
                    value = 0;
                    for (String str : strArrSplit) {
                        value |= EnumC3364.m10019(str).getValue();
                    }
                }
                String[] strArrSplit3 = ActivityC3588.f13201.split(m47193(2).getText().toString());
                if (strArrSplit3[strArrSplit3.length - 1].equals("")) {
                    C15829.m37613((CharSequence) "No Return Type Exception");
                    return false;
                }
                C20299 c20299M45809 = C20299.m45809(activityC3588.f13204.f7900, activityC3588.f13204.f7907.m33765(), C17476.m40671(activityC3588.f13204.f7900, C1953.m6312(strArrSplit3[strArrSplit3.length - 1], activityC3588.f13204.f7900), C5706.m15739(strArrSplit3[strArrSplit3.length - 2], activityC3588.f13204.f7900)), C14655.m35175(m47193(1).getText().toString(), activityC3588.f13204.f7900));
                int i2 = Integer.parseInt(m47193(3).getText().toString().trim());
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C23101(EnumC0772.f3223));
                activityC3588.f13204.f7907.m33764().m10229(new C9841(c20299M45809, value, ((activityC3588.f13204.f7907.f45868 & EnumC3364.INTERFACE.getValue()) == 0 && (EnumC3364.ABSTRACT.getValue() & value) == 0) ? C17706.m41250(activityC3588.f13204.f7900, i2, arrayList) : null));
                activityC3588.m10607();
            } catch (Exception unused) {
                C15829.m37611(R.string.MT_Protector);
                return false;
            }
        } else {
            boolean zM24947 = this.f17405.m24947();
            String strTrim2 = m47193(0).getText().toString().trim();
            if (zM24947) {
                if (!strTrim2.contains("static")) {
                    strTrim2 = "static ".concat(strTrim2);
                }
            } else if (strTrim2.contains("static")) {
                strTrim2 = strTrim2.replace("static", "").replace(EnumC19730.f63352, " ").trim();
            }
            try {
                if (strTrim2.equals("") || (strArrSplit2 = ActivityC3588.f13199.split(strTrim2)) == null) {
                    value2 = 0;
                } else {
                    value2 = 0;
                    for (String str2 : strArrSplit2) {
                        value2 |= EnumC3364.m10019(str2).getValue();
                    }
                }
                String[] strArrSplit4 = ActivityC3588.f13201.split(m47193(2).getText().toString());
                if (strArrSplit4[strArrSplit4.length - 1].equals("")) {
                    C15829.m37613((CharSequence) "No Return Type Exception");
                    return false;
                }
                try {
                    this.f17405 = new C9841(C20299.m45809(activityC3588.f13204.f7900, activityC3588.f13204.f7907.m33765(), C17476.m40671(activityC3588.f13204.f7900, C1953.m6312(strArrSplit4[strArrSplit4.length - 1], activityC3588.f13204.f7900), C5706.m15739(strArrSplit4[strArrSplit4.length - 2], activityC3588.f13204.f7900)), C14655.m35175(m47193(1).getText().toString(), activityC3588.f13204.f7900)), value2, this.f17405.f33623);
                    if (zM24947) {
                        activityC3588.f13204.f7907.m33764().m10227(this.f17407, this.f17405);
                        activityC3588.f13204.f7894.set(this.f17407, this.f17405);
                    } else {
                        activityC3588.f13204.f7907.m33764().m10235(this.f17407, this.f17405);
                        activityC3588.f13204.f7892.set(this.f17407, this.f17405);
                    }
                    try {
                        C17706 c17706 = this.f17405.f33623;
                        if (c17706 != null) {
                            c17706.f56225 = Integer.parseInt(m47193(3).getText().toString().trim());
                        }
                        ActivityC3588.f13200 = true;
                    } catch (Exception unused2) {
                        C15829.m37613((CharSequence) "Register Count Error");
                        return false;
                    }
                } catch (Exception unused3) {
                    C15829.m37613((CharSequence) "Method Name Or Descriptor Error");
                }
            } catch (Exception unused4) {
                C15829.m37611(R.string.MT_Protector);
            }
        }
        activityC3588.f13203.notifyDataSetChanged();
        return true;
    }
}
