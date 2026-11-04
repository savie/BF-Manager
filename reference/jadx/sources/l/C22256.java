package l;

import android.content.Context;
import android.util.AttributeSet;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩷ᩴۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8VV */
/* JADX INFO: loaded from: classes.dex */
public class C22256 extends AbstractC11813 {

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public C9524 f71668;

    public C22256(Context context) {
        super(context);
        m50309();
    }

    public C22256(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m50309();
    }

    public C22256(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m50309();
    }

    public C22256(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m50309();
    }

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    private void m50309() {
        mo12567((CharSequence) C21576.m49088(R.string.MT_Protector).concat(" mt.cc"));
    }

    @Override // l.AbstractC11813
    /* JADX INFO: renamed from: ۙ */
    public final void mo2388(AbstractActivityC17204 abstractActivityC17204) {
        if (this.f71668 == null) {
            this.f71668 = new C9524(abstractActivityC17204);
        }
        this.f71668.m24922(false, new RunnableC10858(1));
    }
}
