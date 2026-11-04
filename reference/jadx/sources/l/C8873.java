package l;

import bin.mt.plus.R;
import java.util.HashSet;

/* JADX INFO: renamed from: l.۠᩶ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8873 extends AbstractC9781 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f28985;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f28986;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f28987;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f28988;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f28989;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f28990;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public HashSet f28991;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC22957 f28992;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8873(ActivityC22957 activityC22957) {
        super(activityC22957);
        this.f28992 = activityC22957;
        HashSet hashSet = new HashSet();
        this.f28991 = hashSet;
        this.f28988 = false;
        this.f28990 = false;
        this.f28989 = true;
        this.f28985 = true;
        m25512(R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector);
        hashSet.add("Ljava/lang/String;");
        hashSet.add("C");
        hashSet.add("Z");
        hashSet.add("B");
        hashSet.add("I");
        hashSet.add("S");
        hashSet.add("J");
        hashSet.add("D");
        hashSet.add("F");
        m25513(R.string.MT_Protector);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23751(int i, C20480 c20480) {
        if (this.f28985) {
            this.f28985 = false;
            m25509(0).m53899(new C9618(this));
            m25509(2).m53899(new C2907(this));
        }
        this.f28987 = i;
        boolean zM46984 = c20480.m46984();
        C13548 c13548 = c20480.f65617;
        this.f28986 = zM46984;
        m25509(0).mo52335((CharSequence) EnumC6266.m17924(c20480.f65616));
        m25509(1).mo52335((CharSequence) c13548.f43034.m10827());
        m25509(2).mo52335((CharSequence) c13548.f43033.m46860());
        String strValueOf = null;
        if (this.f28986 && c20480.m46983()) {
            AbstractC14294[] abstractC14294Arr = this.f28992.f74569.f24319.m13153().m39175().f75324;
            AbstractC14294 abstractC14294 = i < abstractC14294Arr.length ? abstractC14294Arr[i] : null;
            if (abstractC14294 == null) {
                m25516(3).setVisibility(8);
            } else {
                C23255 c23255M25509 = m25509(3);
                switch (C3653.f12497[abstractC14294.mo1282().ordinal()]) {
                    case 1:
                        strValueOf = !((C20262) abstractC14294).f65068 ? "false" : "true";
                        break;
                    case 2:
                        strValueOf = String.valueOf((int) ((C12057) abstractC14294).f38840);
                        break;
                    case 3:
                        strValueOf = String.valueOf(((C6092) abstractC14294).f20821);
                        break;
                    case 4:
                        strValueOf = String.valueOf(((C23992) abstractC14294).f77637);
                        break;
                    case 5:
                        strValueOf = String.valueOf(((C0125) abstractC14294).f1078);
                        break;
                    case 6:
                        strValueOf = String.valueOf(((C7583) abstractC14294).f25052);
                        break;
                    case 7:
                        strValueOf = String.valueOf(((C18770) abstractC14294).f60970);
                        break;
                    case 8:
                        strValueOf = String.valueOf((int) ((C9073) abstractC14294).f29500);
                        break;
                    case 9:
                        strValueOf = ((C2362) abstractC14294).f7616.m10827();
                        break;
                }
                c23255M25509.mo52335((CharSequence) strValueOf);
                m25516(3).setVisibility(0);
            }
        } else {
            m25509(3).mo52335((CharSequence) null);
            m25516(3).setVisibility(8);
        }
        m25517();
        m25515().setText(R.string.MT_Protector);
    }

    @Override // l.AbstractC9781
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo5156() {
        String[] strArrSplit;
        String[] strArrSplit2;
        int i = this.f28987;
        int i2 = 0;
        ActivityC22957 activityC22957 = this.f28992;
        if (i == -1) {
            String strTrim = m25509(0).m54021().toString().trim();
            try {
                if (!strTrim.equals("") && (strArrSplit = ActivityC22957.f74566.split(strTrim)) != null) {
                    int value = 0;
                    for (String str : strArrSplit) {
                        value |= EnumC6266.m17919(str).getValue();
                    }
                    i2 = value;
                }
                activityC22957.f74569.f24319.m13154().m18009(new C20480(C13548.m33264(activityC22957.f74569.f24317, activityC22957.f74569.f24319.m13151(), C20436.m46859(m25509(2).m54021().toString().trim(), activityC22957.f74569.f24317), C3282.m10820(m25509(1).m54021().toString(), activityC22957.f74569.f24317)), i2));
                ActivityC22957.f74567 = true;
                activityC22957.m51782();
            } catch (Exception unused) {
                C22673.m51152(R.string.MT_Protector);
                return false;
            }
        } else {
            boolean z = this.f28986;
            String strTrim2 = m25509(0).m54021().toString().trim();
            if (z) {
                if (!strTrim2.contains("static")) {
                    strTrim2 = "static ".concat(strTrim2);
                }
            } else if (strTrim2.contains("static")) {
                strTrim2 = strTrim2.replace("static", "").replace(EnumC7687.f25319, " ").trim();
            }
            try {
                if (!strTrim2.equals("") && (strArrSplit2 = ActivityC22957.f74566.split(strTrim2)) != null) {
                    int value2 = 0;
                    for (String str2 : strArrSplit2) {
                        value2 |= EnumC6266.m17919(str2).getValue();
                    }
                    i2 = value2;
                }
                C20480 c20480 = new C20480(C13548.m33264(activityC22957.f74569.f24317, activityC22957.f74569.f24319.m13151(), C20436.m46859(m25509(2).m54021().toString().trim(), activityC22957.f74569.f24317), C3282.m10820(m25509(1).m54021().toString(), activityC22957.f74569.f24317)), i2);
                if (z) {
                    activityC22957.f74569.f24319.m13154().m18006(this.f28987, c20480, m25509(3).m54021().toString());
                    activityC22957.f74569.f24313.set(this.f28987, c20480);
                } else {
                    activityC22957.f74569.f24319.m13154().m18005(this.f28987, c20480);
                    activityC22957.f74569.f24308.set(this.f28987, c20480);
                }
                ActivityC22957.f74567 = true;
            } catch (Exception unused2) {
                C22673.m51152(R.string.MT_Protector);
                return false;
            }
        }
        activityC22957.f74574.notifyDataSetChanged();
        return true;
    }
}
