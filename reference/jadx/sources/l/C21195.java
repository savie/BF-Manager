package l;

import android.content.Context;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* JADX INFO: renamed from: l.᩷᩺᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: E7F1 */
/* JADX INFO: loaded from: classes5.dex */
public class C21195 extends C10948 {

    /* JADX INFO: renamed from: ᩷ۚ, reason: not valid java name and contains not printable characters */
    public C3078 f68990;

    @Override // l.C10948, l.C6111
    /* JADX INFO: renamed from: ܿܰ */
    public final boolean mo17022() {
        return false;
    }

    public C21195(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C1590 c1590 = this.f20794;
        c1590.m5432();
        c1590.m5429(1728053247 & C20368.f65970);
    }

    public C21195(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C1590 c1590 = this.f20794;
        c1590.m5432();
        c1590.m5429(1728053247 & C20368.f65970);
    }

    @Override // l.C10948, l.C6111
    /* JADX INFO: renamed from: ۨ */
    public final void mo16959() {
        super.mo16959();
        this.f20794.m5429(1728053247 & C20368.f65970);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47653(C3078 c3078) {
        this.f68990 = c3078;
    }

    @Override // l.C6111, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection == null) {
            return null;
        }
        return new C10613(this, inputConnectionOnCreateInputConnection);
    }
}
