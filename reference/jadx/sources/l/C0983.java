package l;

import android.content.Context;
import android.content.res.ColorStateList;

/* JADX INFO: renamed from: l.֨۠, reason: contains not printable characters */
/* JADX INFO: compiled from: U3Z2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0983 implements InterfaceC3805 {
    @Override // l.InterfaceC3805
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3773(C5217 c5217, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        c5217.m14398(new C6628(f, colorStateList));
        C22151 c22151 = c5217.f18068;
        c22151.setClipToOutline(true);
        c22151.setElevation(f2);
        mo3778(c5217, f3);
    }

    @Override // l.InterfaceC3805
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3774(InterfaceC12979 interfaceC12979, float f) {
        m3768(interfaceC12979).m17969(f);
    }

    @Override // l.InterfaceC3805
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo3778(InterfaceC12979 interfaceC12979, float f) {
        C5217 c5217 = (C5217) interfaceC12979;
        m3768(interfaceC12979).m17970(f, c5217.f18068.getUseCompatPadding(), c5217.f18068.getPreventCornerOverlap());
        mo3779(interfaceC12979);
    }

    @Override // l.InterfaceC3805
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final float mo3780(InterfaceC12979 interfaceC12979) {
        return m3768(interfaceC12979).m17973();
    }

    @Override // l.InterfaceC3805
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final float mo3771(InterfaceC12979 interfaceC12979) {
        return mo3772(interfaceC12979) * 2.0f;
    }

    @Override // l.InterfaceC3805
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final float mo3770(InterfaceC12979 interfaceC12979) {
        return mo3772(interfaceC12979) * 2.0f;
    }

    @Override // l.InterfaceC3805
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float mo3772(InterfaceC12979 interfaceC12979) {
        return m3768(interfaceC12979).m17972();
    }

    @Override // l.InterfaceC3805
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo3781(InterfaceC12979 interfaceC12979, float f) {
        ((C5217) interfaceC12979).f18068.setElevation(f);
    }

    @Override // l.InterfaceC3805
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final float mo3782(InterfaceC12979 interfaceC12979) {
        return ((C5217) interfaceC12979).f18068.getElevation();
    }

    @Override // l.InterfaceC3805
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void mo3779(InterfaceC12979 interfaceC12979) {
        if (!((C5217) interfaceC12979).f18068.getUseCompatPadding()) {
            ((C5217) interfaceC12979).m14397(0, 0, 0, 0);
            return;
        }
        float fMo3780 = mo3780(interfaceC12979);
        float fMo3772 = mo3772(interfaceC12979);
        C5217 c5217 = (C5217) interfaceC12979;
        C22151 c22151 = c5217.f18068;
        int iCeil = (int) Math.ceil(C22857.m50606(fMo3780, fMo3772, c22151.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(C22857.m50607(fMo3780, fMo3772, c22151.getPreventCornerOverlap()));
        c5217.m14397(iCeil, iCeil2, iCeil, iCeil2);
    }

    @Override // l.InterfaceC3805
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void mo3769(InterfaceC12979 interfaceC12979) {
        mo3778(interfaceC12979, mo3780(interfaceC12979));
    }

    @Override // l.InterfaceC3805
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void mo3776(InterfaceC12979 interfaceC12979) {
        mo3778(interfaceC12979, mo3780(interfaceC12979));
    }

    @Override // l.InterfaceC3805
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3775(InterfaceC12979 interfaceC12979, ColorStateList colorStateList) {
        m3768(interfaceC12979).m17971(colorStateList);
    }

    @Override // l.InterfaceC3805
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ColorStateList mo3777(InterfaceC12979 interfaceC12979) {
        return m3768(interfaceC12979).m17968();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static C6628 m3768(InterfaceC12979 interfaceC12979) {
        return (C6628) ((C5217) interfaceC12979).m14396();
    }
}
