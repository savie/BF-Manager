package l;

import bin.mt.plus.R;
import java.util.Collection;

/* JADX INFO: renamed from: l.֡᩶ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0670 extends AbstractC0057 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f2544;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC22957 f2545;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0670(ActivityC22957 activityC22957, ActivityC22957 activityC22958, boolean z) {
        super(R.layout.MT_Protector, activityC22958, "dex_search_type_constant");
        this.f2545 = activityC22957;
        this.f2544 = z;
    }

    @Override // l.AbstractC0057
    /* JADX INFO: renamed from: ۙ */
    public final void mo975(String str, String str2, boolean z) {
        C16989 c16989;
        AbstractC14294 abstractC14294;
        boolean z2;
        AbstractC14294 abstractC14295;
        ActivityC22957 activityC22957 = this.f2545;
        if (!activityC22957.f74569.f24321.isEmpty()) {
            ((C16989) activityC22957.f74569.f24321.peek()).f55524 = activityC22957.f74570.getFirstVisiblePosition();
        }
        Collection<C4072> collectionValues = this.f2544 ? ((C16989) activityC22957.f74569.f24321.peek()).f55522 : activityC22957.f74569.f24316.values();
        int i = 1;
        if (!z) {
            c16989 = new C16989();
            c16989.f55523 = str2;
            try {
                long j = Long.parseLong(str);
                for (C4072 c4072 : collectionValues) {
                    C6310 c6310M13154 = c4072.m13154();
                    if (c6310M13154 != null) {
                        C20480[] c20480ArrM18002 = c6310M13154.m18002();
                        AbstractC14294[] abstractC14294Arr = c4072.m13153().m39175().f75324;
                        int i2 = 0;
                        boolean z3 = false;
                        while (i2 < abstractC14294Arr.length) {
                            C20480 c20480 = c20480ArrM18002[i2];
                            if (c20480.m46984() && c20480.m46983() && (abstractC14294 = abstractC14294Arr[i2]) != null) {
                                int i3 = C25195.f81432[abstractC14294.mo1282().ordinal()];
                                if (i3 != i) {
                                    if (i3 != 2) {
                                        if (i3 == 3 && ((C9073) abstractC14294).f29500 == j) {
                                            c16989.f55522.add(c4072);
                                            z3 = true;
                                        }
                                    } else if (((C18770) abstractC14294).f60970 == j) {
                                        c16989.f55522.add(c4072);
                                        z3 = true;
                                    }
                                } else if (((C7583) abstractC14294).f25052 == j) {
                                    c16989.f55522.add(c4072);
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
                            for (C12275 c12275 : c6310M13154.m18016()) {
                                if (C17735.m41542(c12275, j)) {
                                    c16989.f55522.add(c4072);
                                    z3 = true;
                                    break;
                                }
                            }
                            if (!z3) {
                                for (C12275 c12276 : c6310M13154.m18012()) {
                                    if (C17735.m41542(c12276, j)) {
                                        c16989.f55522.add(c4072);
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
            c16989 = new C16989();
            c16989.f55523 = str2;
            String lowerCase = str.toLowerCase();
            for (C4072 c4073 : collectionValues) {
                C6310 c6310M13155 = c4073.m13154();
                if (c6310M13155 != null) {
                    C20480[] c20480ArrM18003 = c6310M13155.m18002();
                    AbstractC14294[] abstractC14294Arr2 = c4073.m13153().m39175().f75324;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= abstractC14294Arr2.length) {
                            z2 = false;
                            break;
                        }
                        C20480 c20481 = c20480ArrM18003[i4];
                        if (c20481.m46984() && c20481.m46983() && c20481.f65617.f43033.m46860().equals("Ljava/lang/String;") && (abstractC14295 = abstractC14294Arr2[i4]) != null && abstractC14295.mo1282() == EnumC6837.VALUE_STRING && ((C2362) abstractC14295).f7616.m10827().toLowerCase().contains(lowerCase)) {
                            c16989.f55522.add(c4073);
                            z2 = true;
                            break;
                        }
                        i4++;
                    }
                    if (!z2) {
                        for (C12275 c12277 : c6310M13155.m18016()) {
                            if (C17735.m41543(c12277, lowerCase)) {
                                c16989.f55522.add(c4073);
                                z2 = true;
                                break;
                            }
                        }
                        if (!z2) {
                            for (C12275 c12278 : c6310M13155.m18012()) {
                                if (C17735.m41543(c12278, lowerCase)) {
                                    c16989.f55522.add(c4073);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        activityC22957.f74569.f24321.push(c16989);
        activityC22957.f74569.f24314 = activityC22957.f74569.m20286();
    }

    @Override // l.AbstractC0057
    /* JADX INFO: renamed from: ۙ */
    public final void mo974() {
        ActivityC22957 activityC22957 = this.f2545;
        activityC22957.setTitle(((C16989) activityC22957.f74569.f24321.peek()).f55523);
        activityC22957.m51757(EnumC11022.SEARCH_RESULT_CLASS);
    }
}
