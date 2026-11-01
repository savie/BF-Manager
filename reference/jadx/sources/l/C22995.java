package l;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;

/* JADX INFO: renamed from: l.᩺۫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y8ZG */
/* JADX INFO: loaded from: classes.dex */
public final class C22995 extends URLSpan {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C17474 f74734;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String f74735;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC3592 f74736;

    public C22995(C17474 c17474, String str, InterfaceC3592 interfaceC3592) {
        super(str);
        this.f74734 = c17474;
        this.f74735 = str;
        this.f74736 = interfaceC3592;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.f74736.mo10671(view, this.f74735);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        this.f74734.m40665(textPaint);
    }
}
