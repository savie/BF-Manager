package l;

import android.content.Context;
import android.content.res.ColorStateList;

/* JADX INFO: renamed from: l.᩻ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: U3Z2 */
/* JADX INFO: loaded from: classes.dex */
public final class C24751 implements InterfaceC17291 {
    @Override // l.InterfaceC17291
    /* JADX INFO: renamed from: ۙ */
    public final void mo40611(C1630 c1630, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        c1630.m5776(new C15799(f, colorStateList));
        C11324 c11324 = c1630.f5648;
        c11324.setClipToOutline(true);
        c11324.setElevation(f2);
        mo40616(c1630, f3);
    }

    @Override // l.InterfaceC17291
    /* JADX INFO: renamed from: ۙ */
    public final void mo40612(InterfaceC16545 interfaceC16545, float f) {
        m55257(interfaceC16545).m37727(f);
    }

    @Override // l.InterfaceC17291
    /* JADX INFO: renamed from: ۤ */
    public final void mo40616(InterfaceC16545 interfaceC16545, float f) {
        C1630 c1630 = (C1630) interfaceC16545;
        m55257(interfaceC16545).m37728(f, c1630.f5648.getUseCompatPadding(), c1630.f5648.getPreventCornerOverlap());
        mo40614(interfaceC16545);
    }

    @Override // l.InterfaceC17291
    /* JADX INFO: renamed from: ᩷ */
    public final float mo40620(InterfaceC16545 interfaceC16545) {
        return m55257(interfaceC16545).m37731();
    }

    @Override // l.InterfaceC17291
    /* JADX INFO: renamed from: ֫ */
    public final float mo40609(InterfaceC16545 interfaceC16545) {
        return mo40610(interfaceC16545) * 2.0f;
    }

    @Override // l.InterfaceC17291
    /* JADX INFO: renamed from: ᩸ */
    public final float mo40622(InterfaceC16545 interfaceC16545) {
        return mo40610(interfaceC16545) * 2.0f;
    }

    @Override // l.InterfaceC17291
    /* JADX INFO: renamed from: ۙ */
    public final float mo40610(InterfaceC16545 interfaceC16545) {
        return m55257(interfaceC16545).m37730();
    }

    @Override // l.InterfaceC17291
    /* JADX INFO: renamed from: ᩷ */
    public final void mo40621(InterfaceC16545 interfaceC16545, float f) {
        ((C1630) interfaceC16545).f5648.setElevation(f);
    }

    @Override // l.InterfaceC17291
    /* JADX INFO: renamed from: ܳ */
    public final float mo40618(InterfaceC16545 interfaceC16545) {
        return ((C1630) interfaceC16545).f5648.getElevation();
    }

    @Override // l.InterfaceC17291
    /* JADX INFO: renamed from: ۚ */
    public final void mo40614(InterfaceC16545 interfaceC16545) {
        if (!((C1630) interfaceC16545).f5648.getUseCompatPadding()) {
            ((C1630) interfaceC16545).m5775(0, 0, 0, 0);
            return;
        }
        float fMo40620 = mo40620(interfaceC16545);
        float fMo40610 = mo40610(interfaceC16545);
        C1630 c1630 = (C1630) interfaceC16545;
        C11324 c11324 = c1630.f5648;
        int iCeil = (int) Math.ceil(C23259.m52344(fMo40620, fMo40610, c11324.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(C23259.m52345(fMo40620, fMo40610, c11324.getPreventCornerOverlap()));
        c1630.m5775(iCeil, iCeil2, iCeil, iCeil2);
    }

    @Override // l.InterfaceC17291
    /* JADX INFO: renamed from: ۫ */
    public final void mo40617(InterfaceC16545 interfaceC16545) {
        mo40616(interfaceC16545, mo40620(interfaceC16545));
    }

    @Override // l.InterfaceC17291
    /* JADX INFO: renamed from: ᩴ */
    public final void mo40619(InterfaceC16545 interfaceC16545) {
        mo40616(interfaceC16545, mo40620(interfaceC16545));
    }

    @Override // l.InterfaceC17291
    /* JADX INFO: renamed from: ۙ */
    public final void mo40613(InterfaceC16545 interfaceC16545, ColorStateList colorStateList) {
        m55257(interfaceC16545).m37729(colorStateList);
    }

    @Override // l.InterfaceC17291
    /* JADX INFO: renamed from: ۤ */
    public final ColorStateList mo40615(InterfaceC16545 interfaceC16545) {
        return m55257(interfaceC16545).m37726();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C15799 m55257(InterfaceC16545 interfaceC16545) {
        return (C15799) ((C1630) interfaceC16545).m5774();
    }
}
