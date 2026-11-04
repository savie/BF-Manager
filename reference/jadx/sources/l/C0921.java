package l;

import android.view.View;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֨ۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 313O */
/* JADX INFO: loaded from: classes3.dex */
public final class C0921 implements InterfaceC15395 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Main f3430;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC22044 f3431;

    public C0921(AbstractC22044 abstractC22044, Main main) {
        this.f3431 = abstractC22044;
        this.f3430 = main;
    }

    @Override // l.InterfaceC15395
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3725(C20312 c20312, InterfaceC16648 interfaceC16648, C1512 c1512) {
        c20312.m46658(interfaceC16648, this.f3431, true);
    }

    @Override // l.InterfaceC15395
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3724(View view, C20312 c20312, InterfaceC16648 interfaceC16648, C1512 c1512) {
        C18452 c18452 = new C18452(this.f3430, view, 0);
        C9898 c9898M42995 = c18452.m42995();
        c9898M42995.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c9898M42995.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c18452.m42994(new C9869(interfaceC16648, c20312));
        c18452.mo21878();
    }
}
