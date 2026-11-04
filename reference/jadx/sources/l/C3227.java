package l;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۗۛ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 75NJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C3227 extends AbstractC12964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC18143 f10526;

    public C3227(ActivityC18143 activityC18143) {
        this.f10526 = activityC18143;
    }

    @Override // l.AbstractC12964
    public final void onBindViewHolder(AbstractC11800 abstractC11800, int i) {
        String strM44060;
        ViewOnClickListenerC21127 viewOnClickListenerC21127 = (ViewOnClickListenerC21127) abstractC11800;
        ActivityC18143 activityC18143 = this.f10526;
        C7941 c7941 = (C7941) activityC18143.f59346.get(i);
        Drawable drawableM19942 = c7941.m19942();
        CharSequence charSequenceM21637 = c7941.m21637();
        if (c7941.mo19940()) {
            SpannableString spannableString = new SpannableString(charSequenceM21637);
            spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 17);
            charSequenceM21637 = spannableString;
        }
        viewOnClickListenerC21127.f67500.setText(charSequenceM21637);
        if (activityC18143.f59340 == i) {
            viewOnClickListenerC21127.f67500.setTextColor(C3296.f10738);
            viewOnClickListenerC21127.f67502.setBackgroundColor(C3296.f10738 & 553648127);
            drawableM19942.setColorFilter(C3296.f10738, PorterDuff.Mode.SRC_IN);
        } else {
            viewOnClickListenerC21127.f67500.setTextColor(C3296.f10751);
            viewOnClickListenerC21127.f67502.setBackgroundColor(0);
            drawableM19942.setColorFilter(C3296.f10758, PorterDuff.Mode.SRC_IN);
        }
        viewOnClickListenerC21127.f67503.setImageDrawable(drawableM19942);
        try {
            strM44060 = C18969.m44060(150, c7941.m19934().f30601.mo4294());
        } catch (Exception unused) {
            strM44060 = null;
        }
        if (strM44060 == null) {
            viewOnClickListenerC21127.f67500.setTextSize(17.0f);
            viewOnClickListenerC21127.f67499.setVisibility(8);
        } else {
            viewOnClickListenerC21127.f67500.setTextSize(15.0f);
            viewOnClickListenerC21127.f67499.setVisibility(0);
            viewOnClickListenerC21127.f67499.setText(strM44060);
        }
        if (c7941.m19936()) {
            viewOnClickListenerC21127.itemView.setBackgroundColor(C3296.f10753);
        } else {
            viewOnClickListenerC21127.itemView.setBackgroundColor(0);
        }
        activityC18143.f59328.m23770(viewOnClickListenerC21127.f67505, true);
    }

    @Override // l.AbstractC12964
    public final AbstractC11800 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ActivityC18143 activityC18143 = this.f10526;
        return new ViewOnClickListenerC21127(activityC18143, LayoutInflater.from(activityC18143).inflate(R.layout.MT_Protector, viewGroup, false));
    }

    @Override // l.AbstractC12964
    public final int getItemCount() {
        return this.f10526.f59346.size();
    }
}
