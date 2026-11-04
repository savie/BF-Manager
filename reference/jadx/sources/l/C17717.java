package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܽܽܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6H8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17717 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Context f58224;

    public C17717(Context context) {
        this.f58224 = context;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final TextView m41488(int i, int i2, String str) {
        TextView textView = new TextView(this.f58224);
        textView.setText(str);
        textView.setTextSize(1, i);
        textView.setTextColor(i2);
        return textView;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinearLayout m41487(LinearLayout linearLayout) {
        LinearLayout linearLayout2 = new LinearLayout(this.f58224);
        linearLayout2.setGravity(16);
        linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(-1, -2));
        return linearLayout2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final TextView m41489(LinearLayout linearLayout, int i, Runnable runnable) {
        TextView textViewM41488 = m41488(11, -920329, this.f58224.getString(i));
        m41482(linearLayout, textViewM41488, runnable);
        return textViewM41488;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5752 m41490(LinearLayout linearLayout, RunnableC12350 runnableC12350) {
        C5752 c5752 = new C5752(this.f58224);
        c5752.setText(R.string.MT_Protector);
        c5752.setTextSize(1, 11.0f);
        c5752.setTextColor(-920329);
        c5752.setMaxLines(1);
        c5752.setHorizontallyScrolling(false);
        m41482(linearLayout, c5752, runnableC12350);
        int iMax = Math.max(2, Math.round(c5752.getTextSize()));
        Paint.FontMetricsInt fontMetricsInt = c5752.getPaint().getFontMetricsInt();
        c5752.setMinHeight(c5752.getCompoundPaddingBottom() + c5752.getCompoundPaddingTop() + (fontMetricsInt.bottom - fontMetricsInt.top));
        C18085.m42119(c5752, iMax);
        return c5752;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m41482(LinearLayout linearLayout, TextView textView, Runnable runnable) {
        textView.setGravity(17);
        textView.setPadding(m41480(4), m41480(7), m41480(4), m41480(7));
        textView.setBackground(new RippleDrawable(ColorStateList.valueOf(859882751), m41483(-13485242, 5, 0), null));
        textView.setOnClickListener(new ViewOnClickListenerC25177(0, runnable));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams.setMargins(m41480(2), m41480(2), m41480(2), m41480(2));
        linearLayout.addView(textView, layoutParams);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41491(LinearLayout linearLayout, RunnableC13198 runnableC13198) {
        m41481(linearLayout, R.drawable.MT_Protector, R.string.MT_Protector, runnableC13198, -5129275, 34);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ImageView m41485(LinearLayout linearLayout, int i, int i2, Runnable runnable, int i3) {
        return m41481(linearLayout, i, i2, runnable, i3, 32);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ImageView m41486(LinearLayout linearLayout, Runnable runnable, boolean z) {
        ImageView imageViewM41481 = m41481(linearLayout, R.drawable.MT_Protector, R.string.MT_Protector, runnable, -5129275, 32);
        imageViewM41481.setImageTintList(new ColorStateList(new int[][]{new int[]{android.R.attr.state_selected}, new int[0]}, new int[]{-13058049, -5129275}));
        imageViewM41481.setSelected(z);
        return imageViewM41481;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private ImageView m41481(LinearLayout linearLayout, int i, int i2, Runnable runnable, int i3, int i4) {
        Context context = this.f58224;
        ImageView imageView = new ImageView(context);
        Drawable drawableM55517 = C24920.m55517(context.getResources(), i, context.getTheme());
        if (drawableM55517 != null) {
            drawableM55517 = C0597.m2697(drawableM55517).mutate();
            C0597.m2700(drawableM55517, i3);
        }
        imageView.setImageDrawable(drawableM55517);
        imageView.setContentDescription(context.getString(i2));
        imageView.setPadding(m41480(8), m41480(8), m41480(8), m41480(8));
        imageView.setBackground(new RippleDrawable(ColorStateList.valueOf(859882751), null, m41483(-1, 5, 0)));
        imageView.setOnClickListener(new ViewOnClickListenerC16971(0, runnable));
        linearLayout.addView(imageView, new LinearLayout.LayoutParams(m41480(i4), m41480(i4)));
        return imageView;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final View m41484(C2012 c2012) {
        View view = new View(this.f58224);
        view.setBackgroundColor(-12367019);
        c2012.addView(view, new LinearLayout.LayoutParams(-1, m41480(1)));
        return view;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final GradientDrawable m41483(int i, int i2, int i3) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius(m41480(i2));
        if (i3 != 0) {
            gradientDrawable.setStroke(m41480(1), i3);
        }
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m41480(int i) {
        return Math.round(i * this.f58224.getResources().getDisplayMetrics().density);
    }
}
