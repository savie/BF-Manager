package l;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;

/* JADX INFO: renamed from: l.ܿܳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: Y8ZG */
/* JADX INFO: loaded from: classes4.dex */
public final class C18405 extends URLSpan {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f59965;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C15421 f59966;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC14895 f59967;

    public C18405(C15421 c15421, String str, InterfaceC14895 interfaceC14895) {
        super(str);
        this.f59966 = c15421;
        this.f59965 = str;
        this.f59967 = interfaceC14895;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.f59967.mo14510(view, this.f59965);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        this.f59966.m36929(textPaint);
    }
}
