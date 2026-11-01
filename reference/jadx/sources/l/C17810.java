package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ᩳۘ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: M9PM */
/* JADX INFO: loaded from: classes4.dex */
public final class C17810 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C17560[] f56435 = new C17560[2];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17560 m41397(Class cls, C21151 c21151) {
        int iM47595 = c21151.m47595();
        C17560[] c17560Arr = this.f56435;
        if (iM47595 >= c17560Arr.length) {
            this.f56435 = (C17560[]) Arrays.copyOf(c17560Arr, iM47595 * 2);
        }
        C17560 c17560 = this.f56435[iM47595];
        if (c17560 != null) {
            return c17560;
        }
        String strM42905 = C18516.m42905(c21151.getName());
        C17560 c17561 = new C17560(C18516.m42911(cls, C15489.m37076(strM42905, "Case_")), C18516.m42911(cls, C15489.m37076(strM42905, "_")));
        this.f56435[iM47595] = c17561;
        return c17561;
    }
}
