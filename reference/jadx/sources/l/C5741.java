package l;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Map;

/* JADX INFO: renamed from: l.ۚܶܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: W6DR */
/* JADX INFO: loaded from: classes3.dex */
public final class C5741 extends LinearLayout {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f19759;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final TextView f19760;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f19761;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final TextView f19762;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [l.۫ܶܳ] */
    public C5741(C2012 c2012) {
        super(c2012.getContext());
        setGravity(16);
        setPadding(0, c2012.m6905(4), 0, c2012.m6905(4));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        addView(linearLayout, new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView textViewM41488 = c2012.f6700.m41488(10, -5129275, "");
        this.f19762 = textViewM41488;
        linearLayout.addView(textViewM41488);
        TextView textViewM41489 = c2012.f6700.m41488(10, -920329, "");
        this.f19760 = textViewM41489;
        textViewM41489.setTypeface(Typeface.MONOSPACE);
        textViewM41489.setTextIsSelectable(true);
        linearLayout.addView(textViewM41489);
        c2012.f6700.m41491(this, (RunnableC13198) new Runnable() { // from class: l.۫ܶܳ
            @Override // java.lang.Runnable
            public final void run() {
                C21576.m49067((CharSequence) this.f42150.f19759);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16801(Map.Entry entry) {
        String str = entry.getValue() == null ? "" : (String) entry.getValue();
        this.f19759 = str;
        String str2 = str.isEmpty() ? "—" : this.f19759;
        TextView textView = this.f19762;
        boolean zEquals = TextUtils.equals(textView.getText(), (CharSequence) entry.getKey());
        TextView textView2 = this.f19760;
        if (zEquals && TextUtils.equals(textView2.getText(), str2)) {
            return;
        }
        textView2.clearFocus();
        textView.setText((CharSequence) entry.getKey());
        textView2.setText(str2);
        textView2.scrollTo(0, 0);
        this.f19761 = true;
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f19761 && isAttachedToWindow()) {
            this.f19761 = false;
            TextView textView = this.f19760;
            textView.setTextKeepState(textView.getText());
        }
        super.onMeasure(i, i2);
    }
}
