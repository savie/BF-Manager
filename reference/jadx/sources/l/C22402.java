package l;

import android.content.Context;
import android.util.AttributeSet;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩹ܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8VV */
/* JADX INFO: loaded from: classes.dex */
public class C22402 extends AbstractC18168 {

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public C13188 f73118;

    public C22402(Context context) {
        super(context);
        m49684();
    }

    public C22402(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m49684();
    }

    public C22402(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m49684();
    }

    public C22402(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m49684();
    }

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    private void m49684() {
        mo13141((CharSequence) C16737.m39288(R.string.MT_Protector).concat(" mt.cc"));
    }

    @Override // l.AbstractC18168
    /* JADX INFO: renamed from: ۙ */
    public final void mo950(AbstractActivityC12483 abstractActivityC12483) {
        if (this.f73118 == null) {
            this.f73118 = new C13188(abstractActivityC12483);
        }
        this.f73118.m32614(false, new RunnableC19683());
    }
}
