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

/* JADX INFO: renamed from: l.֨۫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6LU */
/* JADX INFO: loaded from: classes3.dex */
public class C1110 extends AbstractC18168 {
    public C1110(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // l.C4751
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo4129() {
        super.mo4129();
        m4128(Math.round(SharedPreferencesOnSharedPreferenceChangeListenerC15618.m37285() * 100.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public void m4128(int i) {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(i, 2);
        mo13141((CharSequence) m13133().getString(R.string.MT_Protector, (bigDecimalValueOf.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalValueOf.stripTrailingZeros()).toPlainString()));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static int m4127(String str) {
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

    @Override // l.AbstractC18168
    /* JADX INFO: renamed from: ۙ */
    public final void mo950(AbstractActivityC12483 abstractActivityC12483) {
        int i;
        int iRound = Math.round(SharedPreferencesOnSharedPreferenceChangeListenerC15618.m37285() * 100.0f);
        C10948 c10948 = new C10948(abstractActivityC12483);
        c10948.m27476(false);
        c10948.m17065(true);
        c10948.m17030(false);
        c10948.setFocusable(false);
        c10948.setOnTouchListener(new ViewOnTouchListenerC11695());
        try {
            i = Integer.parseInt(m42292().getString(abstractActivityC12483 instanceof ActivityC21405 ? "diff_text_font_size" : "edit_text_font_size", abstractActivityC12483 instanceof ActivityC21405 ? "12" : "15"));
        } catch (RuntimeException unused) {
            i = 15;
        }
        c10948.m16850(i, SharedPreferencesOnSharedPreferenceChangeListenerC15618.m37288());
        float f = iRound / 100.0f;
        c10948.m16849(f);
        c10948.setContentDescription(m13133().getString(R.string.MT_Protector));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(C20368.m45983(-13619152, -657931));
        gradientDrawable.setCornerRadius(C13932.m33769(8.0f));
        c10948.setBackground(gradientDrawable);
        int iM33769 = C13932.m33769(12.0f);
        c10948.setPadding(iM33769, iM33769, iM33769, iM33769);
        C15532 c15532 = new C15532(abstractActivityC12483, null);
        c15532.setMinimumHeight(C13932.m33769(48.0f));
        c15532.setMax(24);
        c15532.setProgress(Math.round((iRound - 80) / 5.0f));
        c15532.setContentDescription(m13158());
        LinearLayout linearLayout = new LinearLayout(abstractActivityC12483);
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, c10948.getPaddingBottom() + c10948.getPaddingTop() + ((int) Math.ceil((c10948.m16939() / f) * 6.0f)));
        layoutParams.topMargin = C13932.m33769(12.0f);
        linearLayout.addView(c10948, layoutParams);
        c10948.mo16989((CharSequence) m13133().getString(R.string.MT_Protector));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = C13932.m33769(16.0f);
        linearLayout.addView(c15532, layoutParams2);
        C2521 c2521 = new C2521(this, abstractActivityC12483);
        c2521.m40366(m13158());
        c2521.m40350(o.a.r);
        c2521.m40346((CharSequence) String.format(Locale.ROOT, "%.2f", Float.valueOf(f)));
        c2521.m40340();
        c2521.m40343(R.string.MT_Protector, new ViewOnClickListenerC8105(3, c2521), (ViewOnLongClickListenerC0856) null);
        c2521.m40333().addView(linearLayout);
        c2521.m40333().setVisibility(0);
        c2521.m40345(new C5344(c15532, c10948));
        c15532.setOnSeekBarChangeListener(new C22278(c2521));
        c2521.m40368(false);
    }
}
