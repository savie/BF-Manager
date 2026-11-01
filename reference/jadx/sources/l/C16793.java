package l;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܽܿ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: N7AP */
/* JADX INFO: loaded from: classes4.dex */
public final class C16793 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39443(View view, C20321 c20321, C20321 c20322) {
        View viewFindViewById = view.findViewById(R.id.MT_Protector);
        TextView textView = (TextView) view.findViewById(R.id.MT_Protector);
        TextView textView2 = (TextView) view.findViewById(R.id.MT_Protector);
        boolean zM45860 = c20321.m45860();
        boolean zM45861 = c20322.m45860();
        if (!zM45860 && !zM45861) {
            viewFindViewById.setVisibility(8);
            textView.setText((CharSequence) null);
            textView.setVisibility(8);
            textView2.setText((CharSequence) null);
            textView2.setVisibility(8);
            return;
        }
        viewFindViewById.setVisibility(0);
        m39444(textView, R.string.MT_Protector, c20321);
        m39444(textView2, R.string.MT_Protector, c20322);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39444(TextView textView, int i, C20321 c20321) {
        boolean z;
        if (c20321.m45860()) {
            SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder(textView.getContext().getString(i)).append((CharSequence) ": ");
            if (c20321.m45859()) {
                spannableStringBuilderAppend.append((CharSequence) C5319.m14739(c20321.m45861()));
                z = true;
            } else {
                z = false;
            }
            if (c20321.m45857()) {
                if (z) {
                    int length = spannableStringBuilderAppend.length();
                    spannableStringBuilderAppend.append((CharSequence) "·");
                    spannableStringBuilderAppend.setSpan(new C0564(), length, spannableStringBuilderAppend.length(), 33);
                }
                spannableStringBuilderAppend.append((CharSequence) C1791.m5873(c20321.m45858()));
            }
            textView.setText(spannableStringBuilderAppend);
            textView.setVisibility(0);
            return;
        }
        textView.setText((CharSequence) null);
        textView.setVisibility(8);
    }
}
