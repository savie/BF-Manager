package l;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۫ۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 36IP */
/* JADX INFO: loaded from: classes4.dex */
public final class C13005 extends ClickableSpan {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Consumer f41667;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f41668;

    public C13005(String str, Consumer consumer) {
        this.f41667 = consumer;
        this.f41668 = str;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.f41667.accept(this.f41668);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
