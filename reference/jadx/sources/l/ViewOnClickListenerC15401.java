package l;

import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܳܰ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: T8WR */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnClickListenerC15401 extends AbstractC11800 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final AbstractC0726 f50209;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public TextView f50210;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC17204 f50211;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C22861 f50212;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public TextView[] f50213;

    public ViewOnClickListenerC15401(AbstractActivityC17204 abstractActivityC17204, AbstractC0726 abstractC0726, View view) {
        super(view);
        TextView[] textViewArr = {(TextView) view.findViewById(R.id.MT_Protector), (TextView) view.findViewById(R.id.button1), (TextView) view.findViewById(R.id.button2), (TextView) view.findViewById(R.id.MT_Protector)};
        this.f50213 = textViewArr;
        this.f50211 = abstractActivityC17204;
        this.f50209 = abstractC0726;
        this.f50210 = (TextView) view.findViewById(R.id.text);
        textViewArr[0].setOnClickListener(this);
        textViewArr[1].setOnClickListener(this);
        textViewArr[2].setOnClickListener(this);
        textViewArr[3].setOnClickListener(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36881(C22861 c22861) {
        this.f50212 = c22861;
        String strM51583 = c22861.m51583();
        AbstractC0726 abstractC0726 = this.f50209;
        TextView textView = this.f50210;
        abstractC0726.mo3052(textView, strM51583);
        int iM51581 = c22861.m51581();
        TextView[] textViewArr = this.f50213;
        int length = textViewArr.length;
        for (int i = 0; i < length; i++) {
            TextView textView2 = textViewArr[i];
            if (i < iM51581) {
                textView2.setVisibility(0);
                textView2.setText(c22861.m51584(i));
                if (c22861.m51582(i).m27729() != 0) {
                    textView2.setTextColor(C3296.f10738);
                    textView2.setEnabled(true);
                } else {
                    textView2.setTextColor(C3296.f10779);
                    textView2.setEnabled(false);
                }
            } else {
                textView2.setVisibility(8);
            }
        }
        textView.setTextIsSelectable(false);
        C21576.m49062(200L, new RunnableC19877(0, this, c22861));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m36880(ViewOnClickListenerC15401 viewOnClickListenerC15401, C22861 c22861) {
        TextView textView = viewOnClickListenerC15401.f50210;
        if (viewOnClickListenerC15401.f50212 != c22861 || textView.isTextSelectable()) {
            return;
        }
        textView.setTextIsSelectable(true);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int iM51581 = this.f50212.m51581();
        TextView[] textViewArr = this.f50213;
        int iMin = Math.min(iM51581, textViewArr.length);
        for (int i = 0; i < iMin; i++) {
            if (view == textViewArr[i]) {
                this.f50212.m51582(i).mo1477(this.f50211);
            }
        }
    }
}
