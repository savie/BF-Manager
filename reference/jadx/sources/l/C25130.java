package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩻ܶۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1JS */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C25130 implements InterfaceC14708, InterfaceC14722 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ComponentCallbacksC11612 f81257;

    public /* synthetic */ C25130(ComponentCallbacksC11612 componentCallbacksC11612) {
        this.f81257 = componentCallbacksC11612;
    }

    @Override // l.InterfaceC14722
    /* JADX INFO: renamed from: ۙ */
    public void mo18051(C18452 c18452) {
        ((C21400) this.f81257).f68168.suppressLayout(false);
    }

    @Override // l.InterfaceC14708
    /* JADX INFO: renamed from: ۙ */
    public void mo35376(String str, String str2, boolean z, boolean z2, boolean z3) {
        C2009 c2009 = (C2009) this.f81257;
        C17539 c17539 = new C17539();
        C4245 c4245Matcher = C3369.m11070(str, z2, z).matcher((CharSequence) "");
        for (C13984 c13984 : c2009.m6890()) {
            String strM11066 = C3369.m11066(c13984.m34072(), str2, c4245Matcher, z2, z3, c17539);
            if (strM11066 != null) {
                c13984.m34071(strM11066);
            }
        }
        c2009.m6893();
        c2009.m6891();
        c2009.m6892().notifyDataSetChanged();
        C22673.m51154((CharSequence) c2009.getString(R.string.MT_Protector, Integer.valueOf(c17539.f57015)));
    }
}
