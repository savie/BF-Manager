package l;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۬ܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: P7JT */
/* JADX INFO: loaded from: classes4.dex */
public class C13230 extends AbstractC18168 {
    public C13230(Context context) {
        super(context);
    }

    public C13230(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C13230(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public C13230(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // l.C4751
    /* JADX INFO: renamed from: ۧ */
    public final void mo4129() {
        super.mo4129();
        mo13141((CharSequence) String.valueOf(m42292().getInt(m13157(), 3)));
    }

    @Override // l.AbstractC18168
    /* JADX INFO: renamed from: ۙ */
    public final void mo950(AbstractActivityC12483 abstractActivityC12483) {
        View viewM30995 = abstractActivityC12483.m30995(R.layout.MT_Protector);
        SeekBar seekBar = (SeekBar) viewM30995.findViewById(R.id.MT_Protector);
        seekBar.setMax(8);
        TextView textView = (TextView) viewM30995.findViewById(R.id.textView);
        seekBar.setOnSeekBarChangeListener(new C1234(this, textView));
        int i = m42292().getInt(m13157(), 3);
        seekBar.setProgress(i - 2);
        textView.setText(String.valueOf(i));
        int i2 = DialogInterfaceC19356.f62401;
        C8067 c8067 = new C8067(abstractActivityC12483);
        c8067.m21277(m13158());
        c8067.m21258(viewM30995);
        c8067.m21251(R.string.MT_Protector, null);
        c8067.m21269();
    }
}
