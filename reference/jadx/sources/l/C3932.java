package l;

import android.content.Context;
import android.util.AttributeSet;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۘ۫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y16E */
/* JADX INFO: loaded from: classes3.dex */
public class C3932 extends AbstractC18168 {
    public C3932(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m13145((InterfaceC3485) new C4328(this));
    }

    public C3932(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m13145((InterfaceC3485) new C4328(this));
    }

    public C3932(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m13145((InterfaceC3485) new C4328(this));
    }

    public C3932(Context context) {
        super(context);
        m13145((InterfaceC3485) new C4328(this));
    }

    @Override // l.AbstractC18168
    /* JADX INFO: renamed from: ۙ */
    public final void mo950(AbstractActivityC12483 abstractActivityC12483) {
        C15532 c15532 = new C15532(abstractActivityC12483, null);
        c15532.setMax(22);
        c15532.setPadding(c15532.getPaddingLeft(), C13932.m33769(20.0f) + c15532.getPaddingTop(), c15532.getPaddingRight(), c15532.getPaddingBottom());
        c15532.setProgress(m42292().getInt(m13157(), 12) - 6);
        String str = abstractActivityC12483.getString(R.string.MT_Protector) + " (";
        C8067 c8067BuildDialog = abstractActivityC12483.buildDialog();
        StringBuilder sbM23356 = C9023.m23356(str);
        sbM23356.append(c15532.getProgress() + 6);
        sbM23356.append("dp)");
        c8067BuildDialog.m21277(sbM23356.toString());
        c8067BuildDialog.m21258(c15532);
        c8067BuildDialog.m21251(R.string.MT_Protector, null);
        c15532.setOnSeekBarChangeListener(new C13106(this, c8067BuildDialog.m21269(), str));
    }
}
