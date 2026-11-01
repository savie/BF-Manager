package l;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܰܺܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5Y0 */
/* JADX INFO: loaded from: classes4.dex */
public class C13925 extends AbstractC12514 {
    @Override // l.C4751
    /* JADX INFO: renamed from: ֡ */
    public final boolean mo13125() {
        return false;
    }

    public C13925(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public C13925(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public C13925(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C12398.m30832(context, R.attr.MT_Protector, android.R.attr.preferenceCategoryStyle));
    }

    public C13925(Context context) {
        this(context, null);
    }

    @Override // l.C4751
    /* JADX INFO: renamed from: ۚۙ */
    public final boolean mo13155() {
        return !super.mo13125();
    }

    @Override // l.C4751
    /* JADX INFO: renamed from: ۙ */
    public final void mo8452(C4170 c4170) {
        super.mo8452(c4170);
        if (Build.VERSION.SDK_INT >= 28) {
            c4170.itemView.setAccessibilityHeading(true);
        }
    }
}
