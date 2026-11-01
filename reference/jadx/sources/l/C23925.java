package l;

import bin.mt.plus.R;
import java.util.Collection;

/* JADX INFO: renamed from: l.᩻᩶ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes.dex */
public final class C23925 extends AbstractC17470 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC3588 f77500;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f77501;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23925(ActivityC3588 activityC3588, ActivityC3588 activityC3589, boolean z) {
        super(R.layout.MT_Protector, activityC3589, "dex_search_type_constant");
        this.f77500 = activityC3588;
        this.f77501 = z;
    }

    @Override // l.AbstractC17470
    /* JADX INFO: renamed from: ۙ */
    public final void mo35373(String str, String str2, boolean z) {
        C19112 c19112;
        AbstractC11833 abstractC11833;
        boolean z2;
        AbstractC11833 abstractC11834;
        ActivityC3588 activityC3588 = this.f77500;
        if (!activityC3588.f13204.f7912.isEmpty()) {
            ((C19112) activityC3588.f13204.f7912.peek()).f61751 = activityC3588.f13206.getFirstVisiblePosition();
        }
        Collection<C13929> collectionValues = this.f77501 ? ((C19112) activityC3588.f13204.f7912.peek()).f61749 : activityC3588.f13204.f7902.values();
        int i = 1;
        if (!z) {
            c19112 = new C19112();
            c19112.f61750 = str2;
            try {
                long j = Long.parseLong(str);
                for (C13929 c13929 : collectionValues) {
                    C3489 c3489M33764 = c13929.m33764();
                    if (c3489M33764 != null) {
                        C2078[] c2078ArrM10237 = c3489M33764.m10237();
                        AbstractC11833[] abstractC11833Arr = c13929.m33767().m39781().f75657;
                        int i2 = 0;
                        boolean z3 = false;
                        while (i2 < abstractC11833Arr.length) {
                            C2078 c2078 = c2078ArrM10237[i2];
                            if (c2078.m6598() && c2078.m6597() && (abstractC11833 = abstractC11833Arr[i2]) != null) {
                                int i3 = C7823.f25755[abstractC11833.mo4465().ordinal()];
                                if (i3 != i) {
                                    if (i3 != 2) {
                                        if (i3 == 3 && ((C23122) abstractC11833).f75091 == j) {
                                            c19112.f61749.add(c13929);
                                            z3 = true;
                                        }
                                    } else if (((C13244) abstractC11833).f44002 == j) {
                                        c19112.f61749.add(c13929);
                                        z3 = true;
                                    }
                                } else if (((C1248) abstractC11833).f5426 == j) {
                                    c19112.f61749.add(c13929);
                                    z3 = true;
                                }
                            }
                            if (z3) {
                                break;
                            }
                            i2++;
                            i = 1;
                        }
                        if (!z3) {
                            for (C9841 c9841 : c3489M33764.m10236()) {
                                if (C8529.m22286(c9841, j)) {
                                    c19112.f61749.add(c13929);
                                    z3 = true;
                                    break;
                                }
                            }
                            if (!z3) {
                                for (C9841 c9842 : c3489M33764.m10232()) {
                                    if (C8529.m22286(c9842, j)) {
                                        c19112.f61749.add(c13929);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    i = 1;
                }
            } catch (NumberFormatException unused) {
            }
        } else {
            c19112 = new C19112();
            c19112.f61750 = str2;
            String lowerCase = str.toLowerCase();
            for (C13929 c139210 : collectionValues) {
                C3489 c3489M33765 = c139210.m33764();
                if (c3489M33765 != null) {
                    C2078[] c2078ArrM10238 = c3489M33765.m10237();
                    AbstractC11833[] abstractC11833Arr2 = c139210.m33767().m39781().f75657;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= abstractC11833Arr2.length) {
                            z2 = false;
                            break;
                        }
                        C2078 c2079 = c2078ArrM10238[i4];
                        if (c2079.m6598() && c2079.m6597() && c2079.f7681.f61160.m6314().equals("Ljava/lang/String;") && (abstractC11834 = abstractC11833Arr2[i4]) != null && abstractC11834.mo4465() == EnumC18182.VALUE_STRING && ((C15361) abstractC11834).f50036.m35176().toLowerCase().contains(lowerCase)) {
                            c19112.f61749.add(c139210);
                            z2 = true;
                            break;
                        }
                        i4++;
                    }
                    if (!z2) {
                        for (C9841 c9843 : c3489M33765.m10236()) {
                            if (C8529.m22287(c9843, lowerCase)) {
                                c19112.f61749.add(c139210);
                                z2 = true;
                                break;
                            }
                        }
                        if (!z2) {
                            for (C9841 c9844 : c3489M33765.m10232()) {
                                if (C8529.m22287(c9844, lowerCase)) {
                                    c19112.f61749.add(c139210);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        activityC3588.f13204.f7912.push(c19112);
        activityC3588.f13204.f7909 = activityC3588.f13204.m6777();
    }

    @Override // l.AbstractC17470
    /* JADX INFO: renamed from: ۙ */
    public final void mo35372() {
        ActivityC3588 activityC3588 = this.f77500;
        activityC3588.setTitle(((C19112) activityC3588.f13204.f7912.peek()).f61750);
        activityC3588.m10619(EnumC12762.SEARCH_RESULT_CLASS);
    }
}
