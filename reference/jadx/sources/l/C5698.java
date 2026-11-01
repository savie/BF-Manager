package l;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۛ֡ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: V97Y */
/* JADX INFO: loaded from: classes3.dex */
public class C5698 extends C8426 {
    public C5698(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m15724();
    }

    public C5698(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m15724();
    }

    public C5698(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m15724();
    }

    public C5698(Context context) {
        super(context);
        m15724();
    }

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    private void m15724() {
        Resources resources = m13133().getResources();
        m22070(new CharSequence[]{resources.getString(R.string.MT_Protector), resources.getQuantityString(R.plurals.MT_Protector, 1, 1), resources.getQuantityString(R.plurals.MT_Protector, 3, 3), resources.getQuantityString(R.plurals.MT_Protector, 7, 7), resources.getQuantityString(R.plurals.MT_Protector, 14, 14), resources.getQuantityString(R.plurals.MT_Protector, 30, 30), resources.getQuantityString(R.plurals.MT_Protector, 60, 60), resources.getQuantityString(R.plurals.MT_Protector, 90, 90)});
        m22073(new CharSequence[]{"0", "1", "3", "7", "14", "30", "60", "90"});
    }
}
