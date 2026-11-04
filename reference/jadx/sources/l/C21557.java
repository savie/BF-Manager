package l;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;

/* JADX INFO: renamed from: l.᩶᩶ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAYY */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C21557 implements InterfaceC3071 {
    @Override // l.InterfaceC3071
    public final Object invoke(Object obj) {
        AbstractC0148 abstractC0148 = (AbstractC0148) obj;
        C15243.m36590(abstractC0148, "cfg");
        SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder(abstractC0148.getName()).append('\n');
        int length = spannableStringBuilderAppend.length();
        spannableStringBuilderAppend.append((CharSequence) abstractC0148.mo1333());
        int length2 = spannableStringBuilderAppend.length();
        spannableStringBuilderAppend.setSpan(new ForegroundColorSpan(C3296.f10741), length, length2, 17);
        spannableStringBuilderAppend.setSpan(new RelativeSizeSpan(0.66f), length, length2, 17);
        return spannableStringBuilderAppend;
    }
}
