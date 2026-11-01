package l;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۧۡۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75NJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C10886 extends AbstractC0414 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC11632 f37057;

    public C10886(ActivityC11632 activityC11632) {
        this.f37057 = activityC11632;
    }

    @Override // l.AbstractC0414
    public final void onBindViewHolder(AbstractC12554 abstractC12554, int i) {
        String strM32189;
        ViewOnClickListenerC13749 viewOnClickListenerC13749 = (ViewOnClickListenerC13749) abstractC12554;
        ActivityC11632 activityC11632 = this.f37057;
        C20409 c20409 = (C20409) activityC11632.f39080.get(i);
        Drawable drawableM13343 = c20409.m13343();
        CharSequence charSequenceM46149 = c20409.m46149();
        if (c20409.mo13352()) {
            SpannableString spannableString = new SpannableString(charSequenceM46149);
            spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 17);
            charSequenceM46149 = spannableString;
        }
        viewOnClickListenerC13749.f45326.setText(charSequenceM46149);
        if (activityC11632.f39064 == i) {
            viewOnClickListenerC13749.f45326.setTextColor(C20368.f65970);
            viewOnClickListenerC13749.f45327.setBackgroundColor(C20368.f65970 & 553648127);
            drawableM13343.setColorFilter(C20368.f65970, PorterDuff.Mode.SRC_IN);
        } else {
            viewOnClickListenerC13749.f45326.setTextColor(C20368.f65976);
            viewOnClickListenerC13749.f45327.setBackgroundColor(0);
            drawableM13343.setColorFilter(C20368.f66007, PorterDuff.Mode.SRC_IN);
        }
        viewOnClickListenerC13749.f45324.setImageDrawable(drawableM13343);
        try {
            strM32189 = C13012.m32189(150, c20409.m13346().f53983.mo33986());
        } catch (Exception unused) {
            strM32189 = null;
        }
        if (strM32189 == null) {
            viewOnClickListenerC13749.f45326.setTextSize(17.0f);
            viewOnClickListenerC13749.f45328.setVisibility(8);
        } else {
            viewOnClickListenerC13749.f45326.setTextSize(15.0f);
            viewOnClickListenerC13749.f45328.setVisibility(0);
            viewOnClickListenerC13749.f45328.setText(strM32189);
        }
        if (c20409.m13358()) {
            viewOnClickListenerC13749.itemView.setBackgroundColor(C20368.f65962);
        } else {
            viewOnClickListenerC13749.itemView.setBackgroundColor(0);
        }
        activityC11632.f39077.m28840(viewOnClickListenerC13749.f45330, true);
    }

    @Override // l.AbstractC0414
    public final AbstractC12554 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ActivityC11632 activityC11632 = this.f37057;
        return new ViewOnClickListenerC13749(activityC11632, LayoutInflater.from(activityC11632).inflate(R.layout.MT_Protector, viewGroup, false));
    }

    @Override // l.AbstractC0414
    public final int getItemCount() {
        return this.f37057.f39080.size();
    }
}
