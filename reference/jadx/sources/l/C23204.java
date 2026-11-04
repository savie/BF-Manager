package l;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: renamed from: l.᩹֨ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 052E */
/* JADX INFO: loaded from: classes.dex */
public final class C23204 extends ClickableSpan {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC11269 f75186;

    public C23204(RunnableC11269 runnableC11269) {
        this.f75186 = runnableC11269;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.f75186.run();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
