package l;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۤ᩷ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: D7B1 */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC11130 extends AbstractC11800 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final TextView f35083;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C12359 f35084;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f35085;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23065 f35086;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final TextView f35087;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC11130(C23065 c23065, View view) {
        super(view);
        this.f35086 = c23065;
        this.f35083 = (TextView) view.findViewById(R.id.title);
        this.f35087 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f35085 = C23065.m51979(view);
        view.setOnClickListener(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28093(C12359 c12359) {
        CharSequence charSequence;
        this.f35084 = c12359;
        String str = c12359.f39696;
        C23065 c23065 = this.f35086;
        TextView textView = this.f35083;
        if (str != null) {
            textView.setText(str);
            textView.setTextColor(C7508.m20558(c23065.f74817, R.color.MT_Protector));
        } else {
            String str2 = c12359.f39694;
            boolean z = c12359.f39693;
            String string = c23065.f74817.getString(R.string.MT_Protector);
            if (z) {
                charSequence = str2;
                SpannableString spannableString = new SpannableString(C14483.m34972(str2, string));
                spannableString.setSpan(new ForegroundColorSpan(C3296.f10741), str2.length(), spannableString.length(), 33);
                charSequence = spannableString;
            }
            charSequence = str2;
            textView.setText(charSequence);
            textView.setTextColor(this.f35085);
        }
        this.f35087.setText(c23065.f74817.getString(R.string.MT_Protector, C8311.m22393(c12359.f39701), C22482.m50713(c12359.f39699)));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C12359 c12359 = this.f35084;
        if (c12359 != null) {
            C23065.m51976(this.f35086, c12359);
        }
    }
}
