package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩵᩶ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19692 extends AbstractViewOnClickListenerC14879 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC3588 f63236;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f63237;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19692(ActivityC3588 activityC3588, ActivityC3588 activityC3589, boolean z) {
        super(activityC3589);
        this.f63236 = activityC3588;
        this.f63237 = z;
    }

    @Override // l.AbstractViewOnClickListenerC14879
    /* JADX INFO: renamed from: ۙ */
    public final void mo22037(Pattern pattern, String str) {
        ArrayList<C9841> arrayList;
        ActivityC3588 activityC3588 = this.f63236;
        if (!activityC3588.f13204.f7890.isEmpty()) {
            ((C19112) activityC3588.f13204.f7890.peek()).f61751 = activityC3588.f13206.getFirstVisiblePosition();
        }
        if (this.f63237) {
            arrayList = ((C19112) activityC3588.f13204.f7890.peek()).f61749;
        } else {
            arrayList = new ArrayList();
            C3489 c3489M33764 = activityC3588.f13204.f7907.m33764();
            if (c3489M33764 != null) {
                Collections.addAll(arrayList, c3489M33764.m10236());
                Collections.addAll(arrayList, c3489M33764.m10232());
            }
        }
        C19112 c19112 = new C19112();
        c19112.f61750 = str;
        for (C9841 c9841 : arrayList) {
            if (C8529.m22288(c9841, pattern)) {
                c19112.f61749.add(c9841);
            }
        }
        activityC3588.f13204.f7890.push(c19112);
        activityC3588.f13204.f7910 = activityC3588.f13204.m6777();
    }

    @Override // l.AbstractViewOnClickListenerC14879
    /* JADX INFO: renamed from: ۙ */
    public final void mo22036() {
        ActivityC3588 activityC3588 = this.f63236;
        activityC3588.setTitle(((C19112) activityC3588.f13204.f7890.peek()).f61750);
        activityC3588.m10619(EnumC12762.SEARCH_RESULT_METHOD);
    }
}
