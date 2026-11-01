package l;

import android.widget.EditText;
import bin.mt.plus.R;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ۨ֡ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11351 extends AbstractC21013 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f38294;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f38295;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f38296;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f38297;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f38298;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f38299;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public HashSet f38300;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC3588 f38301;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11351(ActivityC3588 activityC3588) {
        super(activityC3588);
        this.f38301 = activityC3588;
        HashSet hashSet = new HashSet();
        this.f38300 = hashSet;
        this.f38294 = false;
        this.f38298 = false;
        this.f38299 = true;
        this.f38295 = true;
        m47196(R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector);
        hashSet.add("Ljava/lang/String;");
        hashSet.add("C");
        hashSet.add("Z");
        hashSet.add("B");
        hashSet.add("I");
        hashSet.add("S");
        hashSet.add("J");
        hashSet.add("D");
        hashSet.add("F");
        m47198(R.string.MT_Protector);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28431(int i, C2078 c2078) {
        if (this.f38295) {
            this.f38295 = false;
            m47193(0).addTextChangedListener(new C4294(this));
            m47193(2).addTextChangedListener(new C13468(this));
        }
        this.f38296 = i;
        boolean zM6598 = c2078.m6598();
        C18888 c18888 = c2078.f7681;
        this.f38297 = zM6598;
        m47193(0).setText(EnumC3364.m10022(c2078.f7680));
        m47193(1).setText(c18888.f61164.m35176());
        m47193(2).setText(c18888.f61160.m6314());
        String strValueOf = null;
        if (this.f38297 && c2078.m6597()) {
            AbstractC11833[] abstractC11833Arr = this.f38301.f13204.f7907.m33767().m39781().f75657;
            AbstractC11833 abstractC11833 = i < abstractC11833Arr.length ? abstractC11833Arr[i] : null;
            if (abstractC11833 == null) {
                m47200(3).setVisibility(8);
            } else {
                EditText editTextM47193 = m47193(3);
                switch (C21102.f68740[abstractC11833.mo4465().ordinal()]) {
                    case 1:
                        strValueOf = !((C1478) abstractC11833).f6010 ? "false" : "true";
                        break;
                    case 2:
                        strValueOf = String.valueOf((int) ((C9241) abstractC11833).f31400);
                        break;
                    case 3:
                        strValueOf = String.valueOf(((C2889) abstractC11833).f10890);
                        break;
                    case 4:
                        strValueOf = String.valueOf(((C4776) abstractC11833).f16792);
                        break;
                    case 5:
                        strValueOf = String.valueOf(((C22416) abstractC11833).f73146);
                        break;
                    case 6:
                        strValueOf = String.valueOf(((C1248) abstractC11833).f5426);
                        break;
                    case 7:
                        strValueOf = String.valueOf(((C13244) abstractC11833).f44002);
                        break;
                    case 8:
                        strValueOf = String.valueOf((int) ((C23122) abstractC11833).f75091);
                        break;
                    case 9:
                        strValueOf = ((C15361) abstractC11833).f50036.m35176();
                        break;
                }
                editTextM47193.setText(strValueOf);
                m47200(3).setVisibility(0);
            }
        } else {
            m47193(3).setText((CharSequence) null);
            m47200(3).setVisibility(8);
        }
        m47192();
        m47199().setText(R.string.MT_Protector);
    }

    @Override // l.AbstractC21013
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo13875() {
        String[] strArrSplit;
        String[] strArrSplit2;
        int i = this.f38296;
        int i2 = 0;
        ActivityC3588 activityC3588 = this.f38301;
        if (i == -1) {
            String strTrim = m47193(0).getText().toString().trim();
            try {
                if (!strTrim.equals("") && (strArrSplit = ActivityC3588.f13199.split(strTrim)) != null) {
                    int value = 0;
                    for (String str : strArrSplit) {
                        value |= EnumC3364.m10019(str).getValue();
                    }
                    i2 = value;
                }
                activityC3588.f13204.f7907.m33764().m10228(new C2078(C18888.m43560(activityC3588.f13204.f7900, activityC3588.f13204.f7907.m33765(), C1953.m6312(m47193(2).getText().toString().trim(), activityC3588.f13204.f7900), C14655.m35175(m47193(1).getText().toString(), activityC3588.f13204.f7900)), i2));
                ActivityC3588.f13200 = true;
                activityC3588.m10624();
            } catch (Exception unused) {
                C15829.m37611(R.string.MT_Protector);
                return false;
            }
        } else {
            boolean z = this.f38297;
            String strTrim2 = m47193(0).getText().toString().trim();
            if (z) {
                if (!strTrim2.contains("static")) {
                    strTrim2 = "static ".concat(strTrim2);
                }
            } else if (strTrim2.contains("static")) {
                strTrim2 = strTrim2.replace("static", "").replace(EnumC19730.f63352, " ").trim();
            }
            try {
                if (!strTrim2.equals("") && (strArrSplit2 = ActivityC3588.f13199.split(strTrim2)) != null) {
                    int value2 = 0;
                    for (String str2 : strArrSplit2) {
                        value2 |= EnumC3364.m10019(str2).getValue();
                    }
                    i2 = value2;
                }
                C2078 c2078 = new C2078(C18888.m43560(activityC3588.f13204.f7900, activityC3588.f13204.f7907.m33765(), C1953.m6312(m47193(2).getText().toString().trim(), activityC3588.f13204.f7900), C14655.m35175(m47193(1).getText().toString(), activityC3588.f13204.f7900)), i2);
                if (z) {
                    activityC3588.f13204.f7907.m33764().m10226(this.f38296, c2078, m47193(3).getText().toString());
                    activityC3588.f13204.f7903.set(this.f38296, c2078);
                } else {
                    activityC3588.f13204.f7907.m33764().m10225(this.f38296, c2078);
                    activityC3588.f13204.f7914.set(this.f38296, c2078);
                }
                ActivityC3588.f13200 = true;
            } catch (Exception unused2) {
                C15829.m37611(R.string.MT_Protector);
                return false;
            }
        }
        activityC3588.f13203.notifyDataSetChanged();
        return true;
    }
}
