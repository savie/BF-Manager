package l;

import android.view.View;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۛ۟᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: M5NX */
/* JADX INFO: loaded from: classes3.dex */
public final class C5921 extends AbstractViewOnLongClickListenerC22543 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C17210 f20181;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C23561 f20182;

    public C5921(Main main, View view, C23561 c23561) {
        super(main, view);
        this.f20182 = c23561;
    }

    @Override // l.AbstractViewOnLongClickListenerC22543, android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C17210 c17210;
        C6936 c6936M125;
        C23561 c23561 = this.f20182;
        if (c23561.f21343.m31494() || (c17210 = this.f20181) == null || (c6936M125 = c23561.f47137.m125()) == null || !c6936M125.m18652(c17210.mo27216())) {
            return false;
        }
        AbstractActivityC12483 abstractActivityC12483 = this.f73515;
        View view2 = this.f73513;
        C16195 c16195 = new C16195(abstractActivityC12483, view2, 8388611);
        C2995.m8960(view2);
        c16195.m38292();
        c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c16195.m38296(new C22862(this));
        c16195.m38297();
        return true;
    }
}
