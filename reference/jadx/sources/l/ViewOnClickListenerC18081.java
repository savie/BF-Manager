package l;

import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩳ۬᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: T8WR */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnClickListenerC18081 extends AbstractC12554 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C21609 f57844;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public TextView f57845;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC12483 f57846;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC14883 f57847;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public TextView[] f57848;

    public ViewOnClickListenerC18081(AbstractActivityC12483 abstractActivityC12483, AbstractC14883 abstractC14883, View view) {
        super(view);
        TextView[] textViewArr = {(TextView) view.findViewById(R.id.MT_Protector), (TextView) view.findViewById(R.id.button1), (TextView) view.findViewById(R.id.button2), (TextView) view.findViewById(R.id.MT_Protector)};
        this.f57848 = textViewArr;
        this.f57846 = abstractActivityC12483;
        this.f57847 = abstractC14883;
        this.f57845 = (TextView) view.findViewById(R.id.text);
        textViewArr[0].setOnClickListener(this);
        textViewArr[1].setOnClickListener(this);
        textViewArr[2].setOnClickListener(this);
        textViewArr[3].setOnClickListener(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42076(C21609 c21609) {
        this.f57844 = c21609;
        String strM48319 = c21609.m48319();
        AbstractC14883 abstractC14883 = this.f57847;
        TextView textView = this.f57845;
        abstractC14883.mo20653(textView, strM48319);
        int iM48317 = c21609.m48317();
        TextView[] textViewArr = this.f57848;
        int length = textViewArr.length;
        for (int i = 0; i < length; i++) {
            TextView textView2 = textViewArr[i];
            if (i < iM48317) {
                textView2.setVisibility(0);
                textView2.setText(c21609.m48320(i));
                if (c21609.m48318(i).m36536() != 0) {
                    textView2.setTextColor(C20368.f65970);
                    textView2.setEnabled(true);
                } else {
                    textView2.setTextColor(C20368.f66009);
                    textView2.setEnabled(false);
                }
            } else {
                textView2.setVisibility(8);
            }
        }
        textView.setTextIsSelectable(false);
        C16737.m39267(200L, new RunnableC12027(2, this, c21609));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m42075(ViewOnClickListenerC18081 viewOnClickListenerC18081, C21609 c21609) {
        TextView textView = viewOnClickListenerC18081.f57845;
        if (viewOnClickListenerC18081.f57844 != c21609 || textView.isTextSelectable()) {
            return;
        }
        textView.setTextIsSelectable(true);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int iM48317 = this.f57844.m48317();
        TextView[] textViewArr = this.f57848;
        int iMin = Math.min(iM48317, textViewArr.length);
        for (int i = 0; i < iMin; i++) {
            if (view == textViewArr[i]) {
                this.f57844.m48318(i).mo4217(this.f57846);
            }
        }
    }
}
