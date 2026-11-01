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

/* JADX INFO: renamed from: l.ۡ᩸᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: W5L3 */
/* JADX INFO: loaded from: classes3.dex */
public class C9160 extends LinearLayout {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f31137 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f31138;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C10571 f31139;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f31140;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C15490 f31141;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C7748 f31142;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C19743 f31143;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public List f31144;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public RunnableC4065 f31145;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C10948 f31146;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C2830 f31147;

    public C9160(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z = false;
        this.f31138 = false;
        if (!isInEditMode() && ApplicationC0716.f2988.getBoolean("show_input_fav", true)) {
            z = true;
        }
        this.f31140 = z;
        this.f31144 = isInEditMode() ? Collections.EMPTY_LIST : C4925.m13713();
        this.f31139 = new C10571("");
        this.f31143 = new C19743(this);
        m23493(context, attributeSet);
    }

    public C9160(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        boolean z = false;
        this.f31138 = false;
        if (!isInEditMode() && ApplicationC0716.f2988.getBoolean("show_input_fav", true)) {
            z = true;
        }
        this.f31140 = z;
        this.f31144 = isInEditMode() ? Collections.EMPTY_LIST : C4925.m13713();
        this.f31139 = new C10571("");
        this.f31143 = new C19743(this);
        m23493(context, attributeSet);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m23493(Context context, AttributeSet attributeSet) {
        float f = getResources().getDisplayMetrics().density;
        C10948 c10948 = new C10948(context);
        this.f31146 = c10948;
        c10948.m27482(3);
        C2830 c2830 = new C2830(context);
        this.f31147 = c2830;
        c2830.setImageResource(R.drawable.MT_Protector);
        this.f31147.setClickable(true);
        this.f31147.setBackground(C0674.m3029(context));
        int i = (int) ((3.0f * f) + 0.5f);
        this.f31147.setPadding(i, 0, i, 0);
        setOrientation(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        int i2 = (int) ((f * 2.0f) + 0.5f);
        layoutParams.bottomMargin = i2;
        layoutParams.topMargin = i2;
        addView(this.f31146, layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 16;
        addView(this.f31147, layoutParams2);
        C15490 c15490 = new C15490(context, null, R.attr.MT_Protector);
        this.f31141 = c15490;
        c15490.m18830(this.f31146);
        this.f31141.m18843();
        this.f31141.m18841();
        this.f31141.mo18833(this.f31143);
        this.f31141.m37079(C13932.m33769(280.0f));
        this.f31141.m18831(new C23271());
        this.f31147.setOnClickListener(new ViewOnClickListenerC6505(8, this));
        if (!isInEditMode()) {
            ActivityC10074 activityC10074 = (ActivityC10074) C8703.m22527(context);
            C13638.requireNonNull(activityC10074);
            this.f31142 = (C7748) new C16717(activityC10074).m39205(C7748.class);
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C8270.f28755);
        if (typedArrayObtainStyledAttributes.getBoolean(1, false)) {
            this.f31146.m27476(false);
        }
        if (!isInEditMode()) {
            String string = typedArrayObtainStyledAttributes.getString(2);
            if (string != null && string.length() > 0) {
                m23508(string, typedArrayObtainStyledAttributes.getString(0));
            } else {
                m23500();
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m23494(C9160 c9160) {
        c9160.f31138 = false;
        c9160.f31143.notifyDataSetChanged();
        c9160.f31141.show();
        ListView listViewMo17704 = c9160.f31141.mo17704();
        C13638.requireNonNull(listViewMo17704);
        listViewMo17704.setOnItemLongClickListener(new C15510());
        if (c9160.f31146.hasFocus()) {
            return;
        }
        c9160.f31146.requestFocus();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23504() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f31146.getLayoutParams();
        layoutParams.topMargin = 0;
        this.f31146.setLayoutParams(layoutParams);
        C7000.m18806(this.f31146, -1, C13932.m33769(4.0f), -1, -1);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C10948 m23516() {
        return this.f31146;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (getVisibility() != 0 || this.f31146.m17000() == null) {
            return;
        }
        this.f31139.m26738(this.f31146.m17000().toString());
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2916 m23513() {
        return this.f31146.m17000();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23507(CharSequence charSequence) {
        this.f31146.mo16989(charSequence);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m23517(int i) {
        this.f31146.mo17029(i);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m23502() {
        return this.f31146.m16842();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m23503() {
        this.f31146.m27486();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23505(int i) {
        this.f31146.m27484(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23510(boolean z) {
        this.f31146.m27476(!z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23506(TextWatcher textWatcher) {
        this.f31146.m16853(textWatcher);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23509(RunnableC4065 runnableC4065) {
        this.f31145 = runnableC4065;
        runnableC4065.run();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m23501() {
        this.f31139.m26740();
        RunnableC4065 runnableC4065 = this.f31145;
        if (runnableC4065 != null) {
            runnableC4065.run();
        }
        m23511();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static void m23492(C9160 c9160) {
        RunnableC4065 runnableC4065 = c9160.f31145;
        if (runnableC4065 != null) {
            runnableC4065.run();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23508(String str, String str2) {
        if (isInEditMode()) {
            return;
        }
        C10571 c10571M20397 = this.f31142.m20397(str, str2);
        this.f31139 = c10571M20397;
        this.f31146.mo16989((CharSequence) c10571M20397.m26730());
        C10948 c10948 = this.f31146;
        c10948.mo16839(0, c10948.m16842());
        m23511();
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    private void m23500() {
        if (this.f31140) {
            if (this.f31147.isEnabled()) {
                return;
            }
            this.f31147.setEnabled(true);
            this.f31147.setAlpha(1.0f);
            return;
        }
        if (this.f31139.m26736() == 0) {
            if (this.f31147.isEnabled()) {
                this.f31147.setEnabled(false);
                this.f31147.setAlpha(0.8f);
                return;
            }
            return;
        }
        if (this.f31147.isEnabled()) {
            return;
        }
        this.f31147.setEnabled(true);
        this.f31147.setAlpha(1.0f);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m23515() {
        m23507(this.f31139.m26730());
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m23519() {
        InterfaceC2916 interfaceC2916M17000 = this.f31146.m17000();
        if (interfaceC2916M17000 != null) {
            String string = interfaceC2916M17000.toString();
            if (string == null || string.isEmpty() || string.length() > 2000) {
                this.f31139.m26735(true);
                return;
            }
            this.f31139.m26735(false);
            this.f31139.m26738(string);
            int iM26739 = this.f31139.m26739(string);
            if (iM26739 == -1) {
                if (this.f31139.m26736() >= 100) {
                    this.f31139.m26737();
                }
                this.f31139.m26733(string);
            } else if (iM26739 != 0) {
                for (int i = 0; i <= iM26739; i++) {
                    string = this.f31139.m26732(i, string);
                }
            }
            this.f31139.m26729();
            RunnableC4065 runnableC4065 = this.f31145;
            if (runnableC4065 != null) {
                runnableC4065.run();
            }
            m23511();
            return;
        }
        this.f31139.m26735(true);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m23511() {
        boolean zIsShowing = this.f31141.isShowing();
        C19743 c19743 = this.f31143;
        if (zIsShowing && c19743.getCount() == 0) {
            this.f31141.dismiss();
        }
        c19743.notifyDataSetChanged();
        m23500();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m23518(boolean z) {
        C10948 c10948;
        String str;
        if (z) {
            c10948 = this.f31146;
            str = PluginEditText.SYNTAX_REGEX;
        } else {
            c10948 = this.f31146;
            str = null;
        }
        c10948.m16857(str, true);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m23512() {
        if (this.f31140) {
            this.f31140 = false;
            this.f31138 = false;
            m23511();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m23514(boolean z) {
        C10948 c10948;
        String str;
        if (z) {
            c10948 = this.f31146;
            str = PluginEditText.SYNTAX_REGEX_REPLACEMENT;
        } else {
            c10948 = this.f31146;
            str = null;
        }
        c10948.m16857(str, true);
    }
}
