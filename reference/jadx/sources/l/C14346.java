package l;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܰۘ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5Y0 */
/* JADX INFO: loaded from: classes5.dex */
public class C14346 extends AbstractC16889 {
    @Override // l.C3906
    /* JADX INFO: renamed from: ᩶ */
    public final boolean mo12598() {
        return false;
    }

    public C14346(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public C14346(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public C14346(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2506.m8385(context, R.attr.MT_Protector, android.R.attr.preferenceCategoryStyle));
    }

    public C14346(Context context) {
        this(context, null);
    }

    @Override // l.C3906
    /* JADX INFO: renamed from: ۤۙ */
    public final boolean mo12584() {
        return !super.mo12598();
    }

    @Override // l.C3906
    /* JADX INFO: renamed from: ۙ */
    public final void mo12570(C1228 c1228) {
        super.mo12570(c1228);
        if (Build.VERSION.SDK_INT >= 28) {
            c1228.itemView.setAccessibilityHeading(true);
        }
    }
}
