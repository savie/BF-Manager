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
import java.util.List;

/* JADX INFO: renamed from: l.ۜۚ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: O6KI */
/* JADX INFO: loaded from: classes2.dex */
public final class C6564 extends HorizontalScrollView {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f22108;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f22109;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ArrayList f22110;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6564(Context context, C18559 c18559, String str, final C12127 c12127) {
        super(context);
        List list = c18559.f59045;
        this.f22110 = new ArrayList();
        this.f22109 = true;
        setHorizontalScrollBarEnabled(false);
        setHorizontalFadingEdgeEnabled(true);
        setFadingEdgeLength(m17804(12));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setLayoutDirection(0);
        addView(linearLayout, new FrameLayout.LayoutParams(-2, -2));
        for (int i = 0; i < list.size(); i++) {
            final C17853 c17853 = (C17853) list.get(i);
            if (i > 0) {
                C22357 c22357M17809 = m17809("/");
                c22357M17809.setTextColor(C20368.f65988);
                c22357M17809.setPadding(m17804(3), 0, m17804(3), 0);
                c22357M17809.setImportantForAccessibility(2);
                linearLayout.addView(c22357M17809, new LinearLayout.LayoutParams(-2, -2));
            }
            C22357 c22357M178010 = m17809(c17853.m41443());
            c22357M178010.setPadding(m17804(8), m17804(4), m17804(8), m17804(4));
            c22357M178010.setTag(c17853.m41444());
            c22357M178010.setContentDescription(c17853.m41444());
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{R.attr.state_selected}, m17808((C20368.f65970 & 16777215) | Build.SUPPORT_SEND_MUSIC_VIDEO_MESSAGE));
            stateListDrawable.addState(new int[0], m17808(0));
            c22357M178010.setBackground(new RippleDrawable(ColorStateList.valueOf((C20368.f65970 & 16777215) | 855638016), stateListDrawable, m17808(-1)));
            c22357M178010.setOnClickListener(new View.OnClickListener() { // from class: l.ۘۚ᩹
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C6564.m17807(this.f13567, c17853, c12127);
                }
            });
            this.f22110.add(c22357M178010);
            linearLayout.addView(c22357M178010, new LinearLayout.LayoutParams(-2, -2));
        }
        m17806(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m17807(C6564 c6564, C17853 c17853, C12127 c12127) {
        c6564.m17806(c17853.m41444());
        c12127.n(c17853.m41444());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private C22357 m17809(String str) {
        C22357 c22357 = new C22357(getContext());
        c22357.setTextSize(14.0f);
        c22357.setTextColor(C20368.f66007);
        c22357.setIncludeFontPadding(false);
        c22357.setSingleLine(true);
        c22357.setText(str);
        return c22357;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private GradientDrawable m17808(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius(m17804(5));
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m17806(String str) {
        this.f22108 = str;
        for (TextView textView : this.f22110) {
            textView.setSelected(str.equals(textView.getTag()));
            if (textView.isSelected()) {
                m17805(textView, true);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m17805(TextView textView, boolean z) {
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
    public final String m17810() {
        return this.f22108;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m17804(int i) {
        return Math.round(i * getResources().getDisplayMetrics().density);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.f22109 || getWidth() <= 0) {
            return;
        }
        this.f22109 = false;
        for (TextView textView : this.f22110) {
            if (textView.isSelected()) {
                m17805(textView, false);
                return;
            }
        }
    }
}
