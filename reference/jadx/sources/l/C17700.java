package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.Collection;

/* JADX INFO: renamed from: l.ᩳ֡ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 34R9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17700 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC18406 f56197;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f56198;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f56199;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC3588 f56200;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C23229 f56201;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f56202;

    public C17700(AbstractC18406 abstractC18406, ActivityC3588 activityC3588, String str, String str2, int i) {
        this.f56197 = abstractC18406;
        this.f56200 = activityC3588;
        this.f56198 = str;
        this.f56202 = str2;
        this.f56199 = i;
        this.f56201 = C23229.m51233(activityC3588);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10246(this.f56200, R.string.MT_Protector);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        C19112 c19112;
        C19112 c19113;
        C2051 c2051 = (C2051) this.f56197;
        ActivityC3588 activityC3588 = c2051.f7630;
        if (!activityC3588.f13204.f7912.isEmpty()) {
            ((C19112) activityC3588.f13204.f7912.peek()).f61751 = activityC3588.f13206.getFirstVisiblePosition();
        }
        Collection<C13929> collectionValues = c2051.f7629 ? ((C19112) activityC3588.f13204.f7912.peek()).f61749 : activityC3588.f13204.f7902.values();
        String str = this.f56198;
        String str2 = this.f56202;
        int i = this.f56199;
        if (i != 0) {
            if (i != 1) {
                c19113 = null;
            } else {
                c19112 = new C19112();
                c19112.f61750 = C15489.m37076(str, str2);
                for (C13929 c13929 : collectionValues) {
                    C3489 c3489M33764 = c13929.m33764();
                    if (c3489M33764 != null) {
                        C2078[] c2078ArrM10237 = c3489M33764.m10237();
                        int length = c2078ArrM10237.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                for (C2078 c2078 : c3489M33764.m10233()) {
                                    if ((str.length() <= 0 || c2078.f7681.f61164.m35176().equals(str)) && (str2.length() <= 0 || c2078.f7681.f61160.m6314().equals(str2))) {
                                        c19112.f61749.add(c13929);
                                        break;
                                    }
                                }
                                break;
                            }
                            C2078 c2079 = c2078ArrM10237[i2];
                            if ((str.length() <= 0 || c2079.f7681.f61164.m35176().equals(str)) && (str2.length() <= 0 || c2079.f7681.f61160.m6314().equals(str2))) {
                                c19112.f61749.add(c13929);
                                break;
                            }
                            i2++;
                        }
                    }
                }
            }
            activityC3588.f13204.f7912.push(c19113);
            activityC3588.f13204.f7909 = activityC3588.f13204.m6777();
        }
        c19112 = new C19112();
        c19112.f61750 = C15489.m37076(str, str2);
        for (C13929 c139210 : collectionValues) {
            C3489 c3489M33765 = c139210.m33764();
            if (c3489M33765 != null) {
                C9841[] c9841ArrM10236 = c3489M33765.m10236();
                int length2 = c9841ArrM10236.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        for (C9841 c9841 : c3489M33765.m10232()) {
                            if ((str.length() <= 0 || c9841.f33621.f65771.m35176().equals(str)) && (str2.length() <= 0 || c9841.f33621.f65772.m40672().equals(str2))) {
                                c19112.f61749.add(c139210);
                                break;
                            }
                        }
                        break;
                    }
                    C9841 c9842 = c9841ArrM10236[i3];
                    if ((str.length() <= 0 || c9842.f33621.f65771.m35176().equals(str)) && (str2.length() <= 0 || c9842.f33621.f65772.m40672().equals(str2))) {
                        c19112.f61749.add(c139210);
                        break;
                    }
                    i3++;
                }
            }
        }
        c19113 = c19112;
        activityC3588.f13204.f7912.push(c19113);
        activityC3588.f13204.f7909 = activityC3588.f13204.m6777();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        if (this.f56201.m51236()) {
            ActivityC3588 activityC3588 = ((C2051) this.f56197).f7630;
            activityC3588.setTitle(((C19112) activityC3588.f13204.f7912.peek()).f61750);
            activityC3588.m10619(EnumC12762.SEARCH_RESULT_CLASS);
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        if (this.f56201.m51236()) {
            this.f56200.m31002(exc, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
    }
}
