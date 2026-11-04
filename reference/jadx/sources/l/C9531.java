package l;

import android.graphics.Bitmap;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۡܿۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31PG */
/* JADX INFO: loaded from: classes4.dex */
public final class C9531 extends AbstractC12964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC3041 f30868;

    public C9531(ActivityC3041 activityC3041) {
        this.f30868 = activityC3041;
    }

    @Override // l.AbstractC12964
    public final void onBindViewHolder(AbstractC11800 abstractC11800, int i) {
        C6025 c6025;
        ViewOnClickListenerC23179 viewOnClickListenerC23179 = (ViewOnClickListenerC23179) abstractC11800;
        ActivityC3041 activityC3041 = this.f30868;
        if (i >= activityC3041.f9848.size()) {
            c6025 = (C6025) activityC3041.f9853.get(i - activityC3041.f9848.size());
        } else {
            c6025 = (C6025) activityC3041.f9848.get(i);
        }
        viewOnClickListenerC23179.f75111 = c6025;
        TextView textView = viewOnClickListenerC23179.f75110;
        ImageView imageView = viewOnClickListenerC23179.f75116;
        Bitmap bitmap = c6025.f20614;
        if (bitmap == null) {
            imageView.setImageResource(R.drawable.MT_Protector);
        } else {
            imageView.setImageBitmap(bitmap);
        }
        SpannableString spannableString = new SpannableString(c6025.f20613 + EnumC7687.f25319 + c6025.f20610);
        int length = c6025.f20613.length() + 2;
        int length2 = spannableString.length();
        spannableString.setSpan(new ForegroundColorSpan(C3296.f10741), length, length2, 17);
        spannableString.setSpan(new RelativeSizeSpan(0.8f), length, length2, 17);
        viewOnClickListenerC23179.f75113.setText(spannableString);
        viewOnClickListenerC23179.f75114.setText(c6025.f20615);
        viewOnClickListenerC23179.f75112.setText(C15701.m37478(c6025.f20611));
        ActivityC3041.m9882(activityC3041, c6025, textView);
        textView.setTag(c6025.f20607);
    }

    @Override // l.AbstractC12964
    public final AbstractC11800 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewOnClickListenerC23179(this.f30868, viewGroup);
    }

    @Override // l.AbstractC12964
    public final int getItemCount() {
        ActivityC3041 activityC3041 = this.f30868;
        return activityC3041.f9853.size() + activityC3041.f9848.size();
    }
}
