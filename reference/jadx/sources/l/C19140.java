package l;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩳܳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: C2RI */
/* JADX INFO: loaded from: classes5.dex */
public class C19140 extends AbstractC11813 {
    public C19140(Context context) {
        super(context);
    }

    public C19140(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C19140(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public C19140(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // l.C3906
    /* JADX INFO: renamed from: ۢ */
    public final void mo12582() {
        super.mo12582();
        mo12567((CharSequence) String.valueOf(m29658().getInt(m12557(), 4)));
    }

    @Override // l.AbstractC11813
    /* JADX INFO: renamed from: ۙ */
    public final void mo2388(AbstractActivityC17204 abstractActivityC17204) {
        View viewM40395 = abstractActivityC17204.m40395(R.layout.MT_Protector);
        SeekBar seekBar = (SeekBar) viewM40395.findViewById(R.id.MT_Protector);
        TextView textView = (TextView) viewM40395.findViewById(R.id.textView);
        seekBar.setOnSeekBarChangeListener(new C7953(this, textView));
        int i = m29658().getInt(m12557(), 4);
        seekBar.setProgress(i - 1);
        textView.setText(String.valueOf(i));
        int i2 = DialogInterfaceC8327.f27315;
        C2361 c2361 = new C2361(abstractActivityC17204);
        c2361.m8024(m12578());
        c2361.m8005(viewM40395);
        c2361.m8026(R.string.MT_Protector, null);
        c2361.m8016();
    }
}
