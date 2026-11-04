package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩶ۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 89CO */
/* JADX INFO: loaded from: classes5.dex */
public final class C21102 extends AbstractC13642 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ImageView f67391;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public TextView f67392;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC4584 f67393;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21102(ActivityC4584 activityC4584, ViewGroup viewGroup) {
        super(LayoutInflater.from(activityC4584).inflate(R.layout.MT_Protector, viewGroup, false));
        this.f67393 = activityC4584;
        this.itemView.findViewById(R.id.MT_Protector).setVisibility(8);
        ((ImageView) this.itemView.findViewById(R.id.drag)).setImageResource(R.drawable.MT_Protector);
        this.itemView.setFocusable(false);
        this.itemView.setClickable(false);
        TextView textView = (TextView) this.itemView.findViewById(R.id.MT_Protector);
        this.f67392 = textView;
        textView.setPadding(0, 0, 0, 0);
        textView.setTextSize(18.0f);
        textView.setTypeface(null, 1);
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.MT_Protector);
        this.f67391 = imageView;
        imageView.setImageResource(R.drawable.MT_Protector);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: l.ܰۚᩴ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C2361 c2361BuildDialog = this.f45344.f67393.buildDialog();
                c2361BuildDialog.m8021(R.string.MT_Protector);
                c2361BuildDialog.m8000(R.string.MT_Protector);
                c2361BuildDialog.m8026(R.string.MT_Protector, null);
                c2361BuildDialog.m8016();
            }
        });
    }

    @Override // l.AbstractC13642
    /* JADX INFO: renamed from: ۙ */
    public final void mo3834(AbstractC18118 abstractC18118) {
        abstractC18118.getClass();
        if (abstractC18118 instanceof C3948) {
            C3948 c3948Mo12659 = abstractC18118.mo12659();
            this.f67392.setText(c3948Mo12659.f13468);
            int i = c3948Mo12659.f13467;
            ImageView imageView = this.f67391;
            if (i == 1) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
    }
}
