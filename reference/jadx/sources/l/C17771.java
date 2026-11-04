package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.ListView;
import bin.mt.plugin.api.ui.PluginEditText;
import bin.mt.plus.R;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ܽᩳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: W5L3 */
/* JADX INFO: loaded from: classes4.dex */
public class C17771 extends LinearLayout {

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f58342 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public List f58343;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f58344;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C23739 f58345;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C16214 f58346;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C15688 f58347;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C16279 f58348;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C17025 f58349;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f58350;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public RunnableC3340 f58351;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C23255 f58352;

    public C17771(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z = false;
        this.f58350 = false;
        if (!isInEditMode() && ApplicationC17729.f58262.getBoolean("show_input_fav", true)) {
            z = true;
        }
        this.f58344 = z;
        this.f58343 = isInEditMode() ? Collections.EMPTY_LIST : C1036.m3941();
        this.f58348 = new C16279("");
        this.f58349 = new C17025(this);
        m41580(context, attributeSet);
    }

    public C17771(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        boolean z = false;
        this.f58350 = false;
        if (!isInEditMode() && ApplicationC17729.f58262.getBoolean("show_input_fav", true)) {
            z = true;
        }
        this.f58344 = z;
        this.f58343 = isInEditMode() ? Collections.EMPTY_LIST : C1036.m3941();
        this.f58348 = new C16279("");
        this.f58349 = new C17025(this);
        m41580(context, attributeSet);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m41580(Context context, AttributeSet attributeSet) {
        float f = getResources().getDisplayMetrics().density;
        C23255 c23255 = new C23255(context);
        this.f58352 = c23255;
        c23255.m52310(3);
        C15688 c15688 = new C15688(context);
        this.f58347 = c15688;
        c15688.setImageResource(R.drawable.MT_Protector);
        this.f58347.setClickable(true);
        this.f58347.setBackground(C17423.m40913(context));
        int i = (int) ((3.0f * f) + 0.5f);
        this.f58347.setPadding(i, 0, i, 0);
        setOrientation(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        int i2 = (int) ((f * 2.0f) + 0.5f);
        layoutParams.bottomMargin = i2;
        layoutParams.topMargin = i2;
        addView(this.f58352, layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 16;
        addView(this.f58347, layoutParams2);
        C16214 c16214 = new C16214(context, null, R.attr.MT_Protector);
        this.f58346 = c16214;
        c16214.m39944(this.f58352);
        this.f58346.m39956();
        this.f58346.m39955();
        this.f58346.mo18835(this.f58349);
        this.f58346.m38522(C6907.m19160(280.0f));
        this.f58346.m39945(new C20009());
        this.f58347.setOnClickListener(new ViewOnClickListenerC15533(0, this));
        if (!isInEditMode()) {
            ActivityC4348 activityC4348 = (ActivityC4348) C3200.m10534(context);
            C17359.requireNonNull(activityC4348);
            this.f58345 = (C23739) new C16196(activityC4348).m38422(C23739.class);
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C3676.f12645);
        if (typedArrayObtainStyledAttributes.getBoolean(1, false)) {
            this.f58352.m52296(false);
        }
        if (!isInEditMode()) {
            String string = typedArrayObtainStyledAttributes.getString(2);
            if (string != null && string.length() > 0) {
                m41595(string, typedArrayObtainStyledAttributes.getString(0));
            } else {
                m41586();
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m41581(C17771 c17771) {
        c17771.f58350 = false;
        c17771.f58349.notifyDataSetChanged();
        c17771.f58346.show();
        ListView listViewMo39127 = c17771.f58346.mo39127();
        C17359.requireNonNull(listViewMo39127);
        listViewMo39127.setOnItemLongClickListener(new C13296());
        if (c17771.f58352.hasFocus()) {
            return;
        }
        c17771.f58352.requestFocus();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41591() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f58352.getLayoutParams();
        layoutParams.topMargin = 0;
        this.f58352.setLayoutParams(layoutParams);
        C0385.m2188(this.f58352, -1, C6907.m19160(4.0f), -1, -1);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C23255 m41605() {
        return this.f58352;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (getVisibility() != 0 || this.f58352.m54021() == null) {
            return;
        }
        this.f58348.m38618(this.f58352.m54021().toString());
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19106 m41599() {
        return this.f58352.m54021();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41594(CharSequence charSequence) {
        this.f58352.mo52335(charSequence);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m41601() {
        this.f58352.mo52339(0);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m41607() {
        return this.f58352.m54099();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41590() {
        this.f58352.m52289();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41592(int i) {
        this.f58352.m52326(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41597(boolean z) {
        this.f58352.m52296(!z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41593(TextWatcher textWatcher) {
        this.f58352.m53899(textWatcher);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41596(RunnableC3340 runnableC3340) {
        this.f58351 = runnableC3340;
        runnableC3340.run();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m41602() {
        this.f58348.m38621();
        RunnableC3340 runnableC3340 = this.f58351;
        if (runnableC3340 != null) {
            runnableC3340.run();
        }
        m41604();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m41579(C17771 c17771) {
        RunnableC3340 runnableC3340 = c17771.f58351;
        if (runnableC3340 != null) {
            runnableC3340.run();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41595(String str, String str2) {
        if (isInEditMode()) {
            return;
        }
        C16279 c16279M53007 = this.f58345.m53007(str, str2);
        this.f58348 = c16279M53007;
        this.f58352.mo52335((CharSequence) c16279M53007.m38611());
        C23255 c23255 = this.f58352;
        c23255.mo52316(0, c23255.m54099());
        m41604();
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private void m41586() {
        if (this.f58344) {
            if (this.f58347.isEnabled()) {
                return;
            }
            this.f58347.setEnabled(true);
            this.f58347.setAlpha(1.0f);
            return;
        }
        if (this.f58348.m38619() == 0) {
            if (this.f58347.isEnabled()) {
                this.f58347.setEnabled(false);
                this.f58347.setAlpha(0.8f);
                return;
            }
            return;
        }
        if (this.f58347.isEnabled()) {
            return;
        }
        this.f58347.setEnabled(true);
        this.f58347.setAlpha(1.0f);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m41598() {
        m41594(this.f58348.m38611());
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m41603() {
        InterfaceC19106 interfaceC19106M54021 = this.f58352.m54021();
        if (interfaceC19106M54021 != null) {
            String string = interfaceC19106M54021.toString();
            if (string == null || string.isEmpty() || string.length() > 2000) {
                this.f58348.m38616(true);
                return;
            }
            this.f58348.m38616(false);
            this.f58348.m38618(string);
            int iM38620 = this.f58348.m38620(string);
            if (iM38620 == -1) {
                if (this.f58348.m38619() >= 100) {
                    this.f58348.m38617();
                }
                this.f58348.m38614(string);
            } else if (iM38620 != 0) {
                for (int i = 0; i <= iM38620; i++) {
                    string = this.f58348.m38613(i, string);
                }
            }
            this.f58348.m38623();
            RunnableC3340 runnableC3340 = this.f58351;
            if (runnableC3340 != null) {
                runnableC3340.run();
            }
            m41604();
            return;
        }
        this.f58348.m38616(true);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m41604() {
        boolean zIsShowing = this.f58346.isShowing();
        C17025 c17025 = this.f58349;
        if (zIsShowing && c17025.getCount() == 0) {
            this.f58346.dismiss();
        }
        c17025.notifyDataSetChanged();
        m41586();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m41606(boolean z) {
        C23255 c23255;
        String str;
        if (z) {
            c23255 = this.f58352;
            str = PluginEditText.SYNTAX_REGEX;
        } else {
            c23255 = this.f58352;
            str = null;
        }
        c23255.m53903(str, true);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m41608() {
        if (this.f58344) {
            this.f58344 = false;
            this.f58350 = false;
            m41604();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m41600(boolean z) {
        C23255 c23255;
        String str;
        if (z) {
            c23255 = this.f58352;
            str = PluginEditText.SYNTAX_REGEX_REPLACEMENT;
        } else {
            c23255 = this.f58352;
            str = null;
        }
        c23255.m53903(str, true);
    }
}
