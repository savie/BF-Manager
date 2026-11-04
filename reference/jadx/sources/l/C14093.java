package l;

import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۬᩶ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14093 extends AbstractC9781 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC22957 f44603;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f44604;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C12275 f44605;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14093(ActivityC22957 activityC22957) {
        super(activityC22957);
        this.f44603 = activityC22957;
        m25512(R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector);
        m25509(3).m52326(2);
        m25513(R.string.MT_Protector);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34253(int i, C12275 c12275) {
        this.f44604 = i;
        this.f44605 = c12275;
        m25509(0).mo52335((CharSequence) EnumC6266.m17925(c12275.f39462));
        C23255 c23255M25509 = m25509(1);
        C5520 c5520 = c12275.f39463;
        c23255M25509.mo52335((CharSequence) c5520.f19210.m10827());
        m25509(2).mo52335((CharSequence) c5520.f19208.m39476());
        C7033 c7033 = c12275.f39464;
        if (c7033 != null) {
            m25509(3).mo52335((CharSequence) String.valueOf(c7033.f23204));
        } else {
            m25516(3).setVisibility(8);
        }
        m25517();
        m25515().setText(R.string.MT_Protector);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m34254() {
        this.f44604 = -1;
        this.f44605 = null;
        m25509(0).mo52335("public");
        m25509(1).mo52335("newMethod");
        m25509(2).mo52335("()V");
        m25509(3).mo52335("0");
        m25517();
        m25515().setText(R.string.MT_Protector);
    }

    @Override // l.AbstractC9781
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo5156() {
        int value;
        String[] strArrSplit;
        int value2;
        String[] strArrSplit2;
        int i = this.f44604;
        ActivityC22957 activityC22957 = this.f44603;
        if (i == -1) {
            String strTrim = m25509(0).m54021().toString().trim();
            try {
                if (strTrim.equals("") || (strArrSplit = ActivityC22957.f74566.split(strTrim)) == null) {
                    value = 0;
                } else {
                    value = 0;
                    for (String str : strArrSplit) {
                        value |= EnumC6266.m17919(str).getValue();
                    }
                }
                String[] strArrSplit3 = ActivityC22957.f74568.split(m25509(2).m54021().toString());
                if (strArrSplit3[strArrSplit3.length - 1].equals("")) {
                    C22673.m51154((CharSequence) "No Return Type Exception");
                    return false;
                }
                C5520 c5520M16434 = C5520.m16434(activityC22957.f74569.f24317, activityC22957.f74569.f24319.m13151(), C16706.m39473(activityC22957.f74569.f24317, C20436.m46859(strArrSplit3[strArrSplit3.length - 1], activityC22957.f74569.f24317), C18481.m43065(strArrSplit3[strArrSplit3.length - 2], activityC22957.f74569.f24317)), C3282.m10820(m25509(1).m54021().toString(), activityC22957.f74569.f24317));
                int i2 = Integer.parseInt(m25509(3).m54021().toString().trim());
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C9291(EnumC7779.f25668));
                activityC22957.f74569.f24319.m13154().m18008(new C12275(c5520M16434, value, ((activityC22957.f74569.f24319.f13901 & EnumC6266.INTERFACE.getValue()) == 0 && (EnumC6266.ABSTRACT.getValue() & value) == 0) ? C7033.m19356(activityC22957.f74569.f24317, i2, arrayList) : null));
                activityC22957.m51776();
            } catch (Exception unused) {
                C22673.m51152(R.string.MT_Protector);
                return false;
            }
        } else {
            boolean zM30654 = this.f44605.m30654();
            String strTrim2 = m25509(0).m54021().toString().trim();
            if (zM30654) {
                if (!strTrim2.contains("static")) {
                    strTrim2 = "static ".concat(strTrim2);
                }
            } else if (strTrim2.contains("static")) {
                strTrim2 = strTrim2.replace("static", "").replace(EnumC7687.f25319, " ").trim();
            }
            try {
                if (strTrim2.equals("") || (strArrSplit2 = ActivityC22957.f74566.split(strTrim2)) == null) {
                    value2 = 0;
                } else {
                    value2 = 0;
                    for (String str2 : strArrSplit2) {
                        value2 |= EnumC6266.m17919(str2).getValue();
                    }
                }
                String[] strArrSplit4 = ActivityC22957.f74568.split(m25509(2).m54021().toString());
                if (strArrSplit4[strArrSplit4.length - 1].equals("")) {
                    C22673.m51154((CharSequence) "No Return Type Exception");
                    return false;
                }
                try {
                    this.f44605 = new C12275(C5520.m16434(activityC22957.f74569.f24317, activityC22957.f74569.f24319.m13151(), C16706.m39473(activityC22957.f74569.f24317, C20436.m46859(strArrSplit4[strArrSplit4.length - 1], activityC22957.f74569.f24317), C18481.m43065(strArrSplit4[strArrSplit4.length - 2], activityC22957.f74569.f24317)), C3282.m10820(m25509(1).m54021().toString(), activityC22957.f74569.f24317)), value2, this.f44605.f39464);
                    if (zM30654) {
                        activityC22957.f74569.f24319.m13154().m18004(this.f44604, this.f44605);
                        activityC22957.f74569.f24311.set(this.f44604, this.f44605);
                    } else {
                        activityC22957.f74569.f24319.m13154().m18015(this.f44604, this.f44605);
                        activityC22957.f74569.f24320.set(this.f44604, this.f44605);
                    }
                    try {
                        C7033 c7033 = this.f44605.f39464;
                        if (c7033 != null) {
                            c7033.f23204 = Integer.parseInt(m25509(3).m54021().toString().trim());
                        }
                        ActivityC22957.f74567 = true;
                    } catch (Exception unused2) {
                        C22673.m51154((CharSequence) "Register Count Error");
                        return false;
                    }
                } catch (Exception unused3) {
                    C22673.m51154((CharSequence) "Method Name Or Descriptor Error");
                }
            } catch (Exception unused4) {
                C22673.m51152(R.string.MT_Protector);
            }
        }
        activityC22957.f74574.notifyDataSetChanged();
        return true;
    }
}
