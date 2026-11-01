package l;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۙܿ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: D7B1 */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC4781 extends AbstractC12554 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13955 f16808;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C3992 f16809;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f16810;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final TextView f16811;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final TextView f16812;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC4781(C13955 c13955, View view) {
        super(view);
        this.f16808 = c13955;
        this.f16811 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f16812 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f16810 = C13955.m33808(view);
        view.setOnClickListener(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13252(C3992 c3992) {
        CharSequence charSequence;
        this.f16809 = c3992;
        String str = c3992.f14830;
        C13955 c13955 = this.f16808;
        TextView textView = this.f16811;
        if (str != null) {
            textView.setText(str);
            textView.setTextColor(C10405.m26299(c13955.f45918, R.color.MT_Protector));
        } else {
            String str2 = c3992.f14828;
            boolean z = c3992.f14827;
            String string = c13955.f45918.getString(R.string.MT_Protector);
            if (z) {
                charSequence = str2;
                SpannableString spannableString = new SpannableString(C15489.m37076(str2, string));
                spannableString.setSpan(new ForegroundColorSpan(C20368.f65988), str2.length(), spannableString.length(), 33);
                charSequence = spannableString;
            }
            charSequence = str2;
            textView.setText(charSequence);
            textView.setTextColor(this.f16810);
        }
        this.f16812.setText(c13955.f45918.getString(R.string.MT_Protector, C1791.m5873(c3992.f14826), C5319.m14739(c3992.f14829)));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C3992 c3992 = this.f16809;
        if (c3992 != null) {
            C13955.m33803(this.f16808, c3992);
        }
    }
}
