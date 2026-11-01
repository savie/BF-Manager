package l;

import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: l.ܳ᩶ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14753 extends AbstractC17470 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC3588 f48257;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f48258;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14753(ActivityC3588 activityC3588, ActivityC3588 activityC3589, boolean z) {
        super(R.layout.MT_Protector, activityC3589, "dex_search_type_constant");
        this.f48257 = activityC3588;
        this.f48258 = z;
    }

    @Override // l.AbstractC17470
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo35373(String str, String str2, boolean z) {
        ArrayList<C9841> arrayList;
        C19112 c19112;
        ActivityC3588 activityC3588 = this.f48257;
        if (!activityC3588.f13204.f7890.isEmpty()) {
            ((C19112) activityC3588.f13204.f7890.peek()).f61751 = activityC3588.f13206.getFirstVisiblePosition();
        }
        if (this.f48258) {
            arrayList = ((C19112) activityC3588.f13204.f7890.peek()).f61749;
        } else {
            arrayList = new ArrayList();
            C3489 c3489M33764 = activityC3588.f13204.f7907.m33764();
            if (c3489M33764 != null) {
                Collections.addAll(arrayList, c3489M33764.m10236());
                Collections.addAll(arrayList, c3489M33764.m10232());
            }
        }
        if (!z) {
            c19112 = new C19112();
            c19112.f61750 = str2;
            try {
                long j = Long.parseLong(str);
                for (C9841 c9841 : arrayList) {
                    if (C8529.m22286(c9841, j)) {
                        c19112.f61749.add(c9841);
                    }
                }
            } catch (NumberFormatException unused) {
            }
        } else {
            c19112 = new C19112();
            c19112.f61750 = str2;
            String lowerCase = str.toLowerCase();
            for (C9841 c9842 : arrayList) {
                if (C8529.m22287(c9842, lowerCase)) {
                    c19112.f61749.add(c9842);
                }
            }
        }
        activityC3588.f13204.f7890.push(c19112);
        activityC3588.f13204.f7910 = activityC3588.f13204.m6777();
    }

    @Override // l.AbstractC17470
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo35372() {
        ActivityC3588 activityC3588 = this.f48257;
        activityC3588.setTitle(((C19112) activityC3588.f13204.f7890.peek()).f61750);
        activityC3588.m10619(EnumC12762.SEARCH_RESULT_METHOD);
    }
}
