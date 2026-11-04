package l;

import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩻ᩳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: W5L3 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC25231 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f81490;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17771 f81491;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f81492;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final TextView f81493;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final View f81494;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ImageView f81495;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f81496;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C9984 f81497;

    public ViewOnClickListenerC25231(C17771 c17771, View view) {
        this.f81491 = c17771;
        this.f81493 = (TextView) view.findViewById(R.id.textView1);
        View viewFindViewById = view.findViewById(R.id.MT_Protector);
        this.f81494 = viewFindViewById;
        this.f81495 = (ImageView) view.findViewById(R.id.MT_Protector);
        viewFindViewById.setOnClickListener(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m56296(int i, String str) {
        this.f81490 = 0;
        this.f81492 = i;
        this.f81496 = str;
        ImageView imageView = this.f81495;
        imageView.setImageResource(R.drawable.MT_Protector);
        View view = this.f81494;
        view.setVisibility(0);
        view.setClickable(true);
        if (str.length() > 200) {
            str = str.substring(0, 200);
        }
        TextView textView = this.f81493;
        textView.setText(str);
        textView.setTextColor(C3296.f10751);
        imageView.setColorFilter(C3296.f10758);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m56295(int i) {
        this.f81490 = i;
        TextView textView = this.f81493;
        ImageView imageView = this.f81495;
        if (i == 3) {
            imageView.setImageResource(R.drawable.MT_Protector);
            SpannableString spannableString = new SpannableString(C21576.m49088(R.string.MT_Protector));
            spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            textView.setText(spannableString);
            textView.setTextColor(C3296.f10751);
            imageView.setColorFilter(C3296.f10758);
        } else if (i == 2) {
            imageView.setImageResource(R.drawable.MT_Protector);
            textView.setText(R.string.MT_Protector);
            textView.setTextColor(C3296.f10738);
            imageView.setColorFilter(C3296.f10738);
        } else if (i == 5) {
            imageView.setImageResource(R.drawable.MT_Protector);
            textView.setText(R.string.MT_Protector);
            textView.setTextColor(C3296.f10760);
            imageView.setColorFilter(C3296.f10760);
        } else {
            throw new IllegalArgumentException();
        }
        View view = this.f81494;
        view.setVisibility(0);
        view.setClickable(false);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f81490 == 0) {
            C17771 c17771 = this.f81491;
            c17771.f58348.m38622(this.f81492);
            c17771.f58348.m38623();
            C17771.m41579(c17771);
            c17771.m41604();
        }
    }
}
