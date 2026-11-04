package l;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import bin.mt.plus.R;
import com.umeng.analytics.pro.o;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Locale;

/* JADX INFO: renamed from: l.᩷ܳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6LU */
/* JADX INFO: loaded from: classes.dex */
public class C22124 extends AbstractC11813 {
    public C22124(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // l.C3906
    /* JADX INFO: renamed from: ۢ */
    public final void mo12582() {
        super.mo12582();
        m50084(Math.round(SharedPreferencesOnSharedPreferenceChangeListenerC3444.m11216() * 100.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public void m50084(int i) {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(i, 2);
        mo12567((CharSequence) m12560().getString(R.string.MT_Protector, (bigDecimalValueOf.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalValueOf.stripTrailingZeros()).toPlainString()));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static int m50083(String str) {
        String strReplace = str.trim().replace(',', '.');
        if (strReplace.isEmpty()) {
            throw new IllegalArgumentException("Empty line spacing");
        }
        for (int i = 0; i < strReplace.length(); i++) {
            char cCharAt = strReplace.charAt(i);
            if (cCharAt != '.' && (cCharAt < '0' || cCharAt > '9')) {
                throw new IllegalArgumentException("Invalid line spacing");
            }
        }
        BigDecimal bigDecimal = new BigDecimal(strReplace);
        if (bigDecimal.scale() > 2) {
            throw new IllegalArgumentException("Too many decimal places");
        }
        int iIntValueExact = bigDecimal.movePointRight(2).intValueExact();
        if (iIntValueExact < 80 || iIntValueExact > 200) {
            throw new IllegalArgumentException("Line spacing out of range");
        }
        return iIntValueExact;
    }

    @Override // l.AbstractC11813
    /* JADX INFO: renamed from: ۙ */
    public final void mo2388(AbstractActivityC17204 abstractActivityC17204) {
        int i;
        int iRound = Math.round(SharedPreferencesOnSharedPreferenceChangeListenerC3444.m11216() * 100.0f);
        C23255 c23255 = new C23255(abstractActivityC17204);
        c23255.m52296(false);
        int i2 = 1;
        c23255.m54107(true);
        c23255.m54096(false);
        c23255.setFocusable(false);
        c23255.setOnTouchListener(new ViewOnTouchListenerC8830());
        try {
            i = Integer.parseInt(m29658().getString(abstractActivityC17204 instanceof ActivityC11582 ? "diff_text_font_size" : "edit_text_font_size", abstractActivityC17204 instanceof ActivityC11582 ? "12" : "15"));
        } catch (RuntimeException unused) {
            i = 15;
        }
        c23255.m53897(i, SharedPreferencesOnSharedPreferenceChangeListenerC3444.m11217());
        float f = iRound / 100.0f;
        c23255.m53896(f);
        c23255.setContentDescription(m12560().getString(R.string.MT_Protector));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(C3296.m10871(-13619152, -657931));
        gradientDrawable.setCornerRadius(C6907.m19160(8.0f));
        c23255.setBackground(gradientDrawable);
        int iM19160 = C6907.m19160(12.0f);
        c23255.setPadding(iM19160, iM19160, iM19160, iM19160);
        C16434 c16434 = new C16434(abstractActivityC17204, null);
        c16434.setMinimumHeight(C6907.m19160(48.0f));
        c16434.setMax(24);
        c16434.setProgress(Math.round((iRound - 80) / 5.0f));
        c16434.setContentDescription(m12578());
        LinearLayout linearLayout = new LinearLayout(abstractActivityC17204);
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, c23255.getPaddingBottom() + c23255.getPaddingTop() + ((int) Math.ceil((c23255.m54013() / f) * 6.0f)));
        layoutParams.topMargin = C6907.m19160(12.0f);
        linearLayout.addView(c23255, layoutParams);
        c23255.mo52335((CharSequence) m12560().getString(R.string.MT_Protector));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = C6907.m19160(16.0f);
        linearLayout.addView(c16434, layoutParams2);
        C7339 c7339 = new C7339(this, abstractActivityC17204);
        c7339.m22953(m12578());
        c7339.m22948(o.a.r);
        c7339.m22924((CharSequence) String.format(Locale.ROOT, "%.2f", Float.valueOf(f)));
        c7339.m22918();
        c7339.m22921(R.string.MT_Protector, new ViewOnClickListenerC6278(i2, c7339), (ViewOnLongClickListenerC1596) null);
        c7339.m22941().addView(linearLayout);
        c7339.m22941().setVisibility(0);
        c7339.m22923(new C14050(c16434, c23255));
        c16434.setOnSeekBarChangeListener(new C4970(c7339));
        c7339.m22955(false);
    }
}
