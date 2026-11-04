package l;

import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: l.۟᩶ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8128 extends AbstractC0057 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f26821;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC22957 f26822;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8128(ActivityC22957 activityC22957, ActivityC22957 activityC22958, boolean z) {
        super(R.layout.MT_Protector, activityC22958, "dex_search_type_constant");
        this.f26822 = activityC22957;
        this.f26821 = z;
    }

    @Override // l.AbstractC0057
    /* JADX INFO: renamed from: ۙ */
    public final void mo975(String str, String str2, boolean z) {
        ArrayList<C12275> arrayList;
        C16989 c16989;
        ActivityC22957 activityC22957 = this.f26822;
        if (!activityC22957.f74569.f24318.isEmpty()) {
            ((C16989) activityC22957.f74569.f24318.peek()).f55524 = activityC22957.f74570.getFirstVisiblePosition();
        }
        if (this.f26821) {
            arrayList = ((C16989) activityC22957.f74569.f24318.peek()).f55522;
        } else {
            arrayList = new ArrayList();
            C6310 c6310M13154 = activityC22957.f74569.f24319.m13154();
            if (c6310M13154 != null) {
                Collections.addAll(arrayList, c6310M13154.m18016());
                Collections.addAll(arrayList, c6310M13154.m18012());
            }
        }
        if (!z) {
            c16989 = new C16989();
            c16989.f55523 = str2;
            try {
                long j = Long.parseLong(str);
                for (C12275 c12275 : arrayList) {
                    if (C17735.m41542(c12275, j)) {
                        c16989.f55522.add(c12275);
                    }
                }
            } catch (NumberFormatException unused) {
            }
        } else {
            c16989 = new C16989();
            c16989.f55523 = str2;
            String lowerCase = str.toLowerCase();
            for (C12275 c12276 : arrayList) {
                if (C17735.m41543(c12276, lowerCase)) {
                    c16989.f55522.add(c12276);
                }
            }
        }
        activityC22957.f74569.f24318.push(c16989);
        activityC22957.f74569.f24315 = activityC22957.f74569.m20286();
    }

    @Override // l.AbstractC0057
    /* JADX INFO: renamed from: ۙ */
    public final void mo974() {
        ActivityC22957 activityC22957 = this.f26822;
        activityC22957.setTitle(((C16989) activityC22957.f74569.f24318.peek()).f55523);
        activityC22957.m51757(EnumC11022.SEARCH_RESULT_METHOD);
    }
}
