package l;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֡᩷۫, reason: contains not printable characters */
/* JADX INFO: compiled from: N7AP */
/* JADX INFO: loaded from: classes2.dex */
public final class C0695 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m3002(View view, C21578 c21578, C21578 c21579) {
        View viewFindViewById = view.findViewById(R.id.MT_Protector);
        TextView textView = (TextView) view.findViewById(R.id.MT_Protector);
        TextView textView2 = (TextView) view.findViewById(R.id.MT_Protector);
        boolean zM49098 = c21578.m49098();
        boolean zM49099 = c21579.m49098();
        if (!zM49098 && !zM49099) {
            viewFindViewById.setVisibility(8);
            textView.setText((CharSequence) null);
            textView.setVisibility(8);
            textView2.setText((CharSequence) null);
            textView2.setVisibility(8);
            return;
        }
        viewFindViewById.setVisibility(0);
        m3003(textView, R.string.MT_Protector, c21578);
        m3003(textView2, R.string.MT_Protector, c21579);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m3003(TextView textView, int i, C21578 c21578) {
        boolean z;
        if (c21578.m49098()) {
            SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder(textView.getContext().getString(i)).append((CharSequence) ": ");
            if (c21578.m49099()) {
                spannableStringBuilderAppend.append((CharSequence) C22482.m50713(c21578.m49100()));
                z = true;
            } else {
                z = false;
            }
            if (c21578.m49101()) {
                if (z) {
                    int length = spannableStringBuilderAppend.length();
                    spannableStringBuilderAppend.append((CharSequence) "·");
                    spannableStringBuilderAppend.setSpan(new C18594(), length, spannableStringBuilderAppend.length(), 33);
                }
                spannableStringBuilderAppend.append((CharSequence) C8311.m22393(c21578.m49097()));
            }
            textView.setText(spannableStringBuilderAppend);
            textView.setVisibility(0);
            return;
        }
        textView.setText((CharSequence) null);
        textView.setVisibility(8);
    }
}
