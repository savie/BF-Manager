package l;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: renamed from: l.᩸۟᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 052E */
/* JADX INFO: loaded from: classes4.dex */
public final class C21443 extends ClickableSpan {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC12977 f69713;

    public C21443(RunnableC12977 runnableC12977) {
        this.f69713 = runnableC12977;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.f69713.run();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
