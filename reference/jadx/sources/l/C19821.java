package l;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;

/* JADX INFO: renamed from: l.ᩴ۫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 77IH */
/* JADX INFO: loaded from: classes5.dex */
public class C19821 extends AbstractC11813 {
    public C19821(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public C19821(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public C19821(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C19821(Context context) {
        super(context);
    }

    @Override // l.AbstractC11813
    /* JADX INFO: renamed from: ۙ */
    public final void mo2388(AbstractActivityC17204 abstractActivityC17204) {
        abstractActivityC17204.startActivity(new Intent(abstractActivityC17204, (Class<?>) ActivityC3838.class));
    }
}
