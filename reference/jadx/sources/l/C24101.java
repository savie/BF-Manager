package l;

import bin.mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.᩺ۛۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5G5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C24101 implements InterfaceC18133, InterfaceC2974 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ComponentCallbacksC11612 f77915;

    public /* synthetic */ C24101(ComponentCallbacksC11612 componentCallbacksC11612) {
        this.f77915 = componentCallbacksC11612;
    }

    @Override // l.InterfaceC2974
    /* JADX INFO: renamed from: ۙ */
    public void mo9690(List list, List list2, List list3, List list4) {
        C16332.m38774((C16332) this.f77915, list, list2, list3, list4);
    }

    @Override // l.InterfaceC18133
    /* JADX INFO: renamed from: ۙ */
    public void mo12699(String str, String str2, boolean z, boolean z2, boolean z3) {
        C1965 c1965 = (C1965) this.f77915;
        C17539 c17539 = new C17539();
        C4245 c4245Matcher = C3369.m11070(str, z2, z).matcher((CharSequence) "");
        for (C13591 c13591 : c1965.m6771()) {
            String strM11066 = C3369.m11066(c13591.m33319(), str2, c4245Matcher, z2, z3, c17539);
            if (strM11066 != null) {
                c13591.m33318(strM11066);
            }
        }
        c1965.m6774();
        c1965.m6772();
        c1965.m6773().notifyDataSetChanged();
        C22673.m51154((CharSequence) c1965.getString(R.string.MT_Protector, Integer.valueOf(c17539.f57015)));
    }
}
