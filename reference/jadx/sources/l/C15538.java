package l;

import android.graphics.Bitmap;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܶ᩺ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31PG */
/* JADX INFO: loaded from: classes4.dex */
public final class C15538 extends AbstractC0414 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC3541 f50574;

    public C15538(ActivityC3541 activityC3541) {
        this.f50574 = activityC3541;
    }

    @Override // l.AbstractC0414
    public final void onBindViewHolder(AbstractC12554 abstractC12554, int i) {
        C11780 c11780;
        ViewOnClickListenerC9893 viewOnClickListenerC9893 = (ViewOnClickListenerC9893) abstractC12554;
        ActivityC3541 activityC3541 = this.f50574;
        if (i >= activityC3541.f13040.size()) {
            c11780 = (C11780) activityC3541.f13045.get(i - activityC3541.f13040.size());
        } else {
            c11780 = (C11780) activityC3541.f13040.get(i);
        }
        viewOnClickListenerC9893.f33772 = c11780;
        TextView textView = viewOnClickListenerC9893.f33774;
        ImageView imageView = viewOnClickListenerC9893.f33776;
        Bitmap bitmap = c11780.f39564;
        if (bitmap == null) {
            imageView.setImageResource(R.drawable.MT_Protector);
        } else {
            imageView.setImageBitmap(bitmap);
        }
        SpannableString spannableString = new SpannableString(c11780.f39570 + EnumC19730.f63352 + c11780.f39565);
        int length = c11780.f39570.length() + 2;
        int length2 = spannableString.length();
        spannableString.setSpan(new ForegroundColorSpan(C20368.f65988), length, length2, 17);
        spannableString.setSpan(new RelativeSizeSpan(0.8f), length, length2, 17);
        viewOnClickListenerC9893.f33773.setText(spannableString);
        viewOnClickListenerC9893.f33770.setText(c11780.f39572);
        viewOnClickListenerC9893.f33771.setText(C5422.m14997(c11780.f39574));
        ActivityC3541.m10450(activityC3541, c11780, textView);
        textView.setTag(c11780.f39567);
    }

    @Override // l.AbstractC0414
    public final AbstractC12554 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewOnClickListenerC9893(this.f50574, viewGroup);
    }

    @Override // l.AbstractC0414
    public final int getItemCount() {
        ActivityC3541 activityC3541 = this.f50574;
        return activityC3541.f13045.size() + activityC3541.f13040.size();
    }
}
