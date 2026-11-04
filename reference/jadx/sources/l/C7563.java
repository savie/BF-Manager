package l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.opensdk.constants.Build;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۟֫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: O6KI */
/* JADX INFO: loaded from: classes3.dex */
public final class C7563 extends HorizontalScrollView {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f24932;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f24933;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ArrayList f24934;

    public C7563(Context context, C2343 c2343, String str, final C21098 c21098) {
        super(context);
        this.f24934 = new ArrayList();
        this.f24932 = true;
        setHorizontalScrollBarEnabled(false);
        setHorizontalFadingEdgeEnabled(true);
        setFadingEdgeLength(m20648(12));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setLayoutDirection(0);
        addView(linearLayout, new FrameLayout.LayoutParams(-2, -2));
        for (int i = 0; i < c2343.f7557.size(); i++) {
            final C9054 c9054 = (C9054) c2343.f7557.get(i);
            if (i > 0) {
                C5752 c5752M20653 = m20653("/");
                c5752M20653.setTextColor(C3296.f10741);
                c5752M20653.setPadding(m20648(3), 0, m20648(3), 0);
                c5752M20653.setImportantForAccessibility(2);
                linearLayout.addView(c5752M20653, new LinearLayout.LayoutParams(-2, -2));
            }
            C5752 c5752M20654 = m20653(c9054.m24188());
            c5752M20654.setPadding(m20648(8), m20648(4), m20648(8), m20648(4));
            c5752M20654.setTag(c9054.m24189());
            c5752M20654.setContentDescription(c9054.m24189());
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{R.attr.state_selected}, m20652((C3296.f10738 & 16777215) | Build.SUPPORT_SEND_MUSIC_VIDEO_MESSAGE));
            stateListDrawable.addState(new int[0], m20652(0));
            c5752M20654.setBackground(new RippleDrawable(ColorStateList.valueOf((C3296.f10738 & 16777215) | 855638016), stateListDrawable, m20652(-1)));
            c5752M20654.setOnClickListener(new View.OnClickListener() { // from class: l.֡֫ܳ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C7563.m20651(this.f1045, c9054, c21098);
                }
            });
            this.f24934.add(c5752M20654);
            linearLayout.addView(c5752M20654, new LinearLayout.LayoutParams(-2, -2));
        }
        m20650(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m20651(C7563 c7563, C9054 c9054, C21098 c21098) {
        c7563.m20650(c9054.m24189());
        c21098.n(c9054.m24189());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private C5752 m20653(String str) {
        C5752 c5752 = new C5752(getContext());
        c5752.setTextSize(14.0f);
        c5752.setTextColor(C3296.f10758);
        c5752.setIncludeFontPadding(false);
        c5752.setSingleLine(true);
        c5752.setText(str);
        return c5752;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private GradientDrawable m20652(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius(m20648(5));
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m20650(String str) {
        this.f24933 = str;
        for (TextView textView : this.f24934) {
            textView.setSelected(str.equals(textView.getTag()));
            if (textView.isSelected()) {
                m20649(textView, true);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m20649(TextView textView, boolean z) {
        if (getWidth() == 0) {
            return;
        }
        int iMax = Math.max(0, textView.getLeft() - Math.max(0, (getWidth() - textView.getWidth()) / 2));
        if (z) {
            smoothScrollTo(iMax, 0);
        } else {
            scrollTo(iMax, 0);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m20654() {
        return this.f24933;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m20648(int i) {
        return Math.round(i * getResources().getDisplayMetrics().density);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.f24932 || getWidth() <= 0) {
            return;
        }
        this.f24932 = false;
        for (TextView textView : this.f24934) {
            if (textView.isSelected()) {
                m20649(textView, false);
                return;
            }
        }
    }
}
