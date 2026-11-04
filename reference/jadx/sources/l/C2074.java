package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.Collection;

/* JADX INFO: renamed from: l.֫ܿۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 34R9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2074 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f6900;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC22957 f6901;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f6902;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC11768 f6903;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C11555 f6904;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f6905;

    public C2074(AbstractC11768 abstractC11768, ActivityC22957 activityC22957, String str, String str2, int i) {
        this.f6903 = abstractC11768;
        this.f6901 = activityC22957;
        this.f6900 = str;
        this.f6905 = str2;
        this.f6902 = i;
        this.f6904 = C11555.m29068(activityC22957);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8191(this.f6901, R.string.MT_Protector);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        C16989 c16989;
        C16989 c169810;
        C19315 c19315 = (C19315) this.f6903;
        ActivityC22957 activityC22957 = c19315.f62407;
        if (!activityC22957.f74569.f24321.isEmpty()) {
            ((C16989) activityC22957.f74569.f24321.peek()).f55524 = activityC22957.f74570.getFirstVisiblePosition();
        }
        Collection<C4072> collectionValues = c19315.f62408 ? ((C16989) activityC22957.f74569.f24321.peek()).f55522 : activityC22957.f74569.f24316.values();
        String str = this.f6900;
        String str2 = this.f6905;
        int i = this.f6902;
        if (i != 0) {
            if (i != 1) {
                c169810 = null;
            } else {
                c16989 = new C16989();
                c16989.f55523 = C14483.m34972(str, str2);
                for (C4072 c4072 : collectionValues) {
                    C6310 c6310M13154 = c4072.m13154();
                    if (c6310M13154 != null) {
                        C20480[] c20480ArrM18002 = c6310M13154.m18002();
                        int length = c20480ArrM18002.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                for (C20480 c20480 : c6310M13154.m18010()) {
                                    if ((str.length() <= 0 || c20480.f65617.f43034.m10827().equals(str)) && (str2.length() <= 0 || c20480.f65617.f43033.m46860().equals(str2))) {
                                        c16989.f55522.add(c4072);
                                        break;
                                    }
                                }
                                break;
                            }
                            C20480 c20481 = c20480ArrM18002[i2];
                            if ((str.length() <= 0 || c20481.f65617.f43034.m10827().equals(str)) && (str2.length() <= 0 || c20481.f65617.f43033.m46860().equals(str2))) {
                                c16989.f55522.add(c4072);
                                break;
                            }
                            i2++;
                        }
                    }
                }
            }
            activityC22957.f74569.f24321.push(c169810);
            activityC22957.f74569.f24314 = activityC22957.f74569.m20286();
        }
        c16989 = new C16989();
        c16989.f55523 = C14483.m34972(str, str2);
        for (C4072 c4073 : collectionValues) {
            C6310 c6310M13155 = c4073.m13154();
            if (c6310M13155 != null) {
                C12275[] c12275ArrM18016 = c6310M13155.m18016();
                int length2 = c12275ArrM18016.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        for (C12275 c12275 : c6310M13155.m18012()) {
                            if ((str.length() <= 0 || c12275.f39463.f19210.m10827().equals(str)) && (str2.length() <= 0 || c12275.f39463.f19208.m39476().equals(str2))) {
                                c16989.f55522.add(c4073);
                                break;
                            }
                        }
                        break;
                    }
                    C12275 c12276 = c12275ArrM18016[i3];
                    if ((str.length() <= 0 || c12276.f39463.f19210.m10827().equals(str)) && (str2.length() <= 0 || c12276.f39463.f19208.m39476().equals(str2))) {
                        c16989.f55522.add(c4073);
                        break;
                    }
                    i3++;
                }
            }
        }
        c169810 = c16989;
        activityC22957.f74569.f24321.push(c169810);
        activityC22957.f74569.f24314 = activityC22957.f74569.m20286();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        if (this.f6904.m29071()) {
            ActivityC22957 activityC22957 = ((C19315) this.f6903).f62407;
            activityC22957.setTitle(((C16989) activityC22957.f74569.f24321.peek()).f55523);
            activityC22957.m51757(EnumC11022.SEARCH_RESULT_CLASS);
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        if (this.f6904.m29071()) {
            this.f6901.m40401(exc, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
    }
}
