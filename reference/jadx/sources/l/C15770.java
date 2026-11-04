package l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܶ֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7IB */
/* JADX INFO: loaded from: classes5.dex */
public final class C15770 extends AbstractC23976 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public TextView f51347;

    public C15770(ActivityC3838 activityC3838, ViewGroup viewGroup) {
        super(LayoutInflater.from(activityC3838).inflate(R.layout.MT_Protector, viewGroup, false));
        this.itemView.findViewById(R.id.MT_Protector).setVisibility(8);
        ((ImageView) this.itemView.findViewById(R.id.drag)).setImageResource(R.drawable.MT_Protector);
        this.itemView.setFocusable(false);
        this.itemView.setClickable(false);
        TextView textView = (TextView) this.itemView.findViewById(R.id.MT_Protector);
        this.f51347 = textView;
        textView.setPadding(0, 0, 0, 0);
        textView.setTextSize(18.0f);
        textView.setTypeface(null, 1);
        this.itemView.findViewById(R.id.MT_Protector).setVisibility(8);
    }

    @Override // l.AbstractC23976
    /* JADX INFO: renamed from: ۙ */
    public final void mo17588(AbstractC23230 abstractC23230) {
        abstractC23230.getClass();
        if (abstractC23230 instanceof C17262) {
            this.f51347.setText(abstractC23230.mo40559().f56239);
        }
    }
}
