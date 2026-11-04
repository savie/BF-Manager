package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import bin.mt.plus.R;
import org.bouncycastle.crypto.params.DHParameters;

/* JADX INFO: renamed from: l.ܶ᩹ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E6CW */
/* JADX INFO: loaded from: classes4.dex */
public final class C16401 extends LinearLayout {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f53219;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f53220;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f53221;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final TextView f53222;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f53223;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final TextView f53224;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f53225;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C17893 f53226;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final TextView f53227;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f53228;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f53229;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f53230;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final GradientDrawable f53231;

    public C16401(Context context) {
        super(context);
        setGravity(16);
        setPadding(m38951(4), 0, m38951(4), 0);
        setMinimumHeight(m38951(34));
        C17717 c17717 = new C17717(context);
        GradientDrawable gradientDrawableM41483 = c17717.m41483(0, 3, 0);
        this.f53231 = gradientDrawableM41483;
        setBackground(new RippleDrawable(ColorStateList.valueOf(587202559), gradientDrawableM41483, c17717.m41483(-1, 3, 0)));
        C17893 c17893 = new C17893(this, context);
        this.f53226 = c17893;
        addView(c17893, new LinearLayout.LayoutParams(m38951(24), -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(16);
        linearLayout.setPadding(0, m38951(4), 0, m38951(4));
        addView(linearLayout, new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView textViewM41488 = c17717.m41488(11, -920329, "");
        this.f53224 = textViewM41488;
        Typeface typeface = Typeface.MONOSPACE;
        textViewM41488.setTypeface(typeface);
        textViewM41488.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textViewM41488.setEllipsize(truncateAt);
        textViewM41488.setIncludeFontPadding(false);
        linearLayout.addView(textViewM41488, new LinearLayout.LayoutParams(-1, -2));
        TextView textViewM41489 = c17717.m41488(9, -5129275, "");
        this.f53227 = textViewM41489;
        textViewM41489.setSingleLine();
        textViewM41489.setEllipsize(truncateAt);
        textViewM41489.setIncludeFontPadding(false);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = m38951(2);
        linearLayout.addView(textViewM41489, layoutParams);
        TextView textViewM414810 = c17717.m41488(11, -5129275, "");
        this.f53222 = textViewM414810;
        textViewM414810.setTypeface(typeface);
        textViewM414810.setGravity(8388613);
        textViewM414810.setIncludeFontPadding(false);
        textViewM414810.setPadding(m38951(8), 0, 0, 0);
        addView(textViewM414810);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38961(int i, String str, String str2, C23861 c23861, boolean z, RunnableC4995 runnableC4995, RunnableC22149 runnableC22149) {
        int[] iArr = c23861.f77253;
        int i2 = iArr[i];
        this.f53219 = i2;
        this.f53228 = c23861.f77247[i];
        int[] iArr2 = c23861.f77250;
        int i3 = iArr2[i];
        boolean z2 = i3 >= 0;
        this.f53220 = z2;
        this.f53225 = z2 && i2 > iArr[i3];
        this.f53221 = c23861.m53209(i);
        int i4 = i + 1;
        this.f53229 = i4 < iArr2.length && iArr2[i4] == i;
        this.f53223 = !c23861.m53207(i);
        this.f53230 = z ? -13058049 : -5129275;
        this.f53224.setText(str);
        String strM44060 = C18969.m44060(DHParameters.DEFAULT_MINIMUM_LENGTH, str2);
        TextView textView = this.f53227;
        textView.setText(strM44060);
        textView.setVisibility((str2 == null || str2.isEmpty()) ? 8 : 0);
        TextView textView2 = this.f53222;
        textView2.setText("#" + i);
        textView2.setTextColor(this.f53230);
        setSelected(z);
        this.f53231.setColor(z ? -14464680 : 0);
        setOnClickListener(new ViewOnClickListenerC15533(4, runnableC4995));
        C17893 c17893 = this.f53226;
        c17893.getLayoutParams().width = m38951((this.f53219 * 16) + 24);
        c17893.requestLayout();
        String string = null;
        c17893.setOnClickListener(this.f53229 ? new ViewOnClickListenerC25177(2, runnableC22149) : null);
        c17893.setClickable(this.f53229);
        if (this.f53229) {
            string = getContext().getString(this.f53223 ? R.string.MT_Protector : R.string.MT_Protector, str);
        }
        c17893.setContentDescription(string);
        c17893.setImportantForAccessibility(this.f53229 ? 0 : 2);
        c17893.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int m38951(int i) {
        return Math.round(i * getResources().getDisplayMetrics().density);
    }
}
