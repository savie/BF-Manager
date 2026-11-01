package l;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;

/* JADX INFO: renamed from: l.ۧᩳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: OAYY */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C11170 implements InterfaceC15456 {
    @Override // l.InterfaceC15456
    public final Object invoke(Object obj) {
        AbstractC12068 abstractC12068 = (AbstractC12068) obj;
        C13465.m32966(abstractC12068, "cfg");
        SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder(abstractC12068.getName()).append('\n');
        int length = spannableStringBuilderAppend.length();
        spannableStringBuilderAppend.append((CharSequence) abstractC12068.mo4705());
        int length2 = spannableStringBuilderAppend.length();
        spannableStringBuilderAppend.setSpan(new ForegroundColorSpan(C20368.f65988), length, length2, 17);
        spannableStringBuilderAppend.setSpan(new RelativeSizeSpan(0.66f), length, length2, 17);
        return spannableStringBuilderAppend;
    }
}
