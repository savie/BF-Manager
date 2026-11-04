package l;

import android.view.View;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۡ֨ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5NX */
/* JADX INFO: loaded from: classes4.dex */
public final class C9032 extends AbstractViewOnLongClickListenerC5544 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C0829 f29392;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C8287 f29393;

    public C9032(Main main, View view, C8287 c8287) {
        super(main, view);
        this.f29393 = c8287;
    }

    @Override // l.AbstractViewOnLongClickListenerC5544, android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C0829 c0829;
        C20065 c20065M117;
        C8287 c8287 = this.f29393;
        if (c8287.f27860.m24482() || (c0829 = this.f29392) == null || (c20065M117 = c8287.f22654.m117()) == null || !c20065M117.m46178(c0829.mo3321())) {
            return false;
        }
        AbstractActivityC17204 abstractActivityC17204 = this.f19264;
        View view2 = this.f19263;
        C18452 c18452 = new C18452(abstractActivityC17204, view2, 8388611);
        C10378.m26694(view2);
        c18452.m42997();
        c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c18452.m42994(new C0249(2, this));
        c18452.mo21878();
        return true;
    }
}
