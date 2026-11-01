package l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩶֨ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7IB */
/* JADX INFO: loaded from: classes5.dex */
public final class C19833 extends AbstractC10661 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public TextView f63653;

    public C19833(ActivityC23361 activityC23361, ViewGroup viewGroup) {
        super(LayoutInflater.from(activityC23361).inflate(R.layout.MT_Protector, viewGroup, false));
        this.itemView.findViewById(R.id.MT_Protector).setVisibility(8);
        ((ImageView) this.itemView.findViewById(R.id.drag)).setImageResource(R.drawable.MT_Protector);
        this.itemView.setFocusable(false);
        this.itemView.setClickable(false);
        TextView textView = (TextView) this.itemView.findViewById(R.id.MT_Protector);
        this.f63653 = textView;
        textView.setPadding(0, 0, 0, 0);
        textView.setTextSize(18.0f);
        textView.setTypeface(null, 1);
        this.itemView.findViewById(R.id.MT_Protector).setVisibility(8);
    }

    @Override // l.AbstractC10661
    /* JADX INFO: renamed from: ۙ */
    public final void mo15777(AbstractC0076 abstractC0076) {
        abstractC0076.getClass();
        if (abstractC0076 instanceof C15600) {
            this.f63653.setText(abstractC0076.mo1009().f50731);
        }
    }
}
