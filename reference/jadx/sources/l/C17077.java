package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ܺ᩶ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17077 extends AbstractViewOnClickListenerC13260 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f55756;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC22957 f55757;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17077(ActivityC22957 activityC22957, ActivityC22957 activityC22958, boolean z) {
        super(activityC22958);
        this.f55757 = activityC22957;
        this.f55756 = z;
    }

    @Override // l.AbstractViewOnClickListenerC13260
    /* JADX INFO: renamed from: ۙ */
    public final void mo32809(Pattern pattern, String str) {
        ArrayList<C12275> arrayList;
        ActivityC22957 activityC22957 = this.f55757;
        if (!activityC22957.f74569.f24318.isEmpty()) {
            ((C16989) activityC22957.f74569.f24318.peek()).f55524 = activityC22957.f74570.getFirstVisiblePosition();
        }
        if (this.f55756) {
            arrayList = ((C16989) activityC22957.f74569.f24318.peek()).f55522;
        } else {
            arrayList = new ArrayList();
            C6310 c6310M13154 = activityC22957.f74569.f24319.m13154();
            if (c6310M13154 != null) {
                Collections.addAll(arrayList, c6310M13154.m18016());
                Collections.addAll(arrayList, c6310M13154.m18012());
            }
        }
        C16989 c16989 = new C16989();
        c16989.f55523 = str;
        for (C12275 c12275 : arrayList) {
            if (C17735.m41544(c12275, pattern)) {
                c16989.f55522.add(c12275);
            }
        }
        activityC22957.f74569.f24318.push(c16989);
        activityC22957.f74569.f24315 = activityC22957.f74569.m20286();
    }

    @Override // l.AbstractViewOnClickListenerC13260
    /* JADX INFO: renamed from: ۙ */
    public final void mo32808() {
        ActivityC22957 activityC22957 = this.f55757;
        activityC22957.setTitle(((C16989) activityC22957.f74569.f24318.peek()).f55523);
        activityC22957.m51757(EnumC11022.SEARCH_RESULT_METHOD);
    }
}
