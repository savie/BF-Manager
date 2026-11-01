package l;

import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۠᩸᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: W5L3 */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC8454 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final ImageView f29327;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final TextView f29328;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9160 f29329;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f29330;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final View f29331;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f29332;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f29333;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C3326 f29334;

    public ViewOnClickListenerC8454(C9160 c9160, View view) {
        this.f29329 = c9160;
        this.f29328 = (TextView) view.findViewById(R.id.textView1);
        View viewFindViewById = view.findViewById(R.id.MT_Protector);
        this.f29331 = viewFindViewById;
        this.f29327 = (ImageView) view.findViewById(R.id.MT_Protector);
        viewFindViewById.setOnClickListener(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22114(int i, String str) {
        this.f29332 = 0;
        this.f29330 = i;
        this.f29333 = str;
        ImageView imageView = this.f29327;
        imageView.setImageResource(R.drawable.MT_Protector);
        View view = this.f29331;
        view.setVisibility(0);
        view.setClickable(true);
        if (str.length() > 200) {
            str = str.substring(0, 200);
        }
        TextView textView = this.f29328;
        textView.setText(str);
        textView.setTextColor(C20368.f65976);
        imageView.setColorFilter(C20368.f66007);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22113(int i) {
        this.f29332 = i;
        TextView textView = this.f29328;
        ImageView imageView = this.f29327;
        if (i == 3) {
            imageView.setImageResource(R.drawable.MT_Protector);
            SpannableString spannableString = new SpannableString(C16737.m39288(R.string.MT_Protector));
            spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            textView.setText(spannableString);
            textView.setTextColor(C20368.f65976);
            imageView.setColorFilter(C20368.f66007);
        } else if (i == 2) {
            imageView.setImageResource(R.drawable.MT_Protector);
            textView.setText(R.string.MT_Protector);
            textView.setTextColor(C20368.f65970);
            imageView.setColorFilter(C20368.f65970);
        } else if (i == 5) {
            imageView.setImageResource(R.drawable.MT_Protector);
            textView.setText(R.string.MT_Protector);
            textView.setTextColor(C20368.f65998);
            imageView.setColorFilter(C20368.f65998);
        } else {
            throw new IllegalArgumentException();
        }
        View view = this.f29331;
        view.setVisibility(0);
        view.setClickable(false);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f29332 == 0) {
            C9160 c9160 = this.f29329;
            c9160.f31139.m26741(this.f29330);
            c9160.f31139.m26729();
            C9160.m23492(c9160);
            c9160.m23511();
        }
    }
}
