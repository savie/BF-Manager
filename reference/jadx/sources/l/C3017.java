package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes2.dex */
public final class C3017 implements InterfaceC14225 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C9161 f11274;

    public C3017(LayoutInflaterFactory2C9161 layoutInflaterFactory2C9161) {
        this.f11274 = layoutInflaterFactory2C9161;
    }

    @Override // l.InterfaceC14225
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Context mo8980() {
        return this.f11274.m23574();
    }

    @Override // l.InterfaceC14225
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Drawable mo8983() {
        C1977 c1977M6352 = C1977.m6352(this.f11274.m23574(), (AttributeSet) null, new int[]{R.attr.MT_Protector});
        Drawable drawableM6370 = c1977M6352.m6370(0);
        c1977M6352.m6379();
        return drawableM6370;
    }

    @Override // l.InterfaceC14225
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean mo8984() {
        AbstractC10697 abstractC10697Mo23576 = this.f11274.mo23576();
        return (abstractC10697Mo23576 == null || (abstractC10697Mo23576.mo13894() & 4) == 0) ? false : true;
    }

    @Override // l.InterfaceC14225
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo8982(Drawable drawable, int i) {
        AbstractC10697 abstractC10697Mo23576 = this.f11274.mo23576();
        if (abstractC10697Mo23576 != null) {
            abstractC10697Mo23576.mo13888(drawable);
            abstractC10697Mo23576.mo13887(i);
        }
    }

    @Override // l.InterfaceC14225
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo8981(int i) {
        AbstractC10697 abstractC10697Mo23576 = this.f11274.mo23576();
        if (abstractC10697Mo23576 != null) {
            abstractC10697Mo23576.mo13887(0);
        }
    }
}
