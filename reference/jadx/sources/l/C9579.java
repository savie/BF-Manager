package l;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;

/* JADX INFO: renamed from: l.ۢ۫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7AVR */
/* JADX INFO: loaded from: classes4.dex */
public class C9579 extends AbstractC18168 {
    public C9579(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public C9579(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public C9579(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C9579(Context context) {
        super(context);
    }

    @Override // l.AbstractC18168
    /* JADX INFO: renamed from: ۙ */
    public final void mo950(AbstractActivityC12483 abstractActivityC12483) {
        abstractActivityC12483.startActivity(new Intent(abstractActivityC12483, (Class<?>) ActivityC19749.class));
    }
}
