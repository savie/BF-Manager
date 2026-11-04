package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۬ۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 313O */
/* JADX INFO: loaded from: classes4.dex */
public final class C13598 extends C19655 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C25093 f43190;

    public C13598(C25093 c25093) {
        this.f43190 = c25093;
    }

    @Override // l.InterfaceC4739
    public final void onPageSelected(int i) {
        ((C1972) ((ArrayList) this.f43190.f81141).get(i)).m6791();
    }

    @Override // l.InterfaceC4739
    public final void onPageScrollStateChanged(int i) {
        C25093 c25093 = this.f43190;
        c25093.f81136 = i;
        if (i == 0) {
            C25093.m55929(c25093);
        }
    }
}
