package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֫᩹ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 89CO */
/* JADX INFO: loaded from: classes3.dex */
public final class C2108 extends AbstractC3603 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ImageView f7760;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public TextView f7761;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC6426 f7762;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2108(ActivityC6426 activityC6426, ViewGroup viewGroup) {
        super(LayoutInflater.from(activityC6426).inflate(R.layout.MT_Protector, viewGroup, false));
        this.f7762 = activityC6426;
        this.itemView.findViewById(R.id.MT_Protector).setVisibility(8);
        ((ImageView) this.itemView.findViewById(R.id.drag)).setImageResource(R.drawable.MT_Protector);
        this.itemView.setFocusable(false);
        this.itemView.setClickable(false);
        TextView textView = (TextView) this.itemView.findViewById(R.id.MT_Protector);
        this.f7761 = textView;
        textView.setPadding(0, 0, 0, 0);
        textView.setTextSize(18.0f);
        textView.setTypeface(null, 1);
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.MT_Protector);
        this.f7760 = imageView;
        imageView.setImageResource(R.drawable.MT_Protector);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: l.ܳ᩹ۚ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C8067 c8067BuildDialog = this.f48418.f7762.buildDialog();
                c8067BuildDialog.m21274(R.string.MT_Protector);
                c8067BuildDialog.m21253(R.string.MT_Protector);
                c8067BuildDialog.m21251(R.string.MT_Protector, null);
                c8067BuildDialog.m21269();
            }
        });
    }

    @Override // l.AbstractC3603
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo6660(AbstractC9871 abstractC9871) {
        abstractC9871.getClass();
        if (abstractC9871 instanceof C23982) {
            C23982 c23982Mo24966 = abstractC9871.mo24966();
            this.f7761.setText(c23982Mo24966.f77738);
            int i = c23982Mo24966.f77737;
            ImageView imageView = this.f7760;
            if (i == 1) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
    }
}
