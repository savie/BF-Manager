package l;

import android.content.Context;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* JADX INFO: renamed from: l.ܽ֡᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: E7F1 */
/* JADX INFO: loaded from: classes5.dex */
public class C17224 extends C23255 {

    /* JADX INFO: renamed from: ᩷ܳ, reason: not valid java name and contains not printable characters */
    public InterfaceC16478 f56125;

    @Override // l.C23255, l.C24132
    /* JADX INFO: renamed from: ۠᩷, reason: not valid java name and contains not printable characters */
    public final boolean mo40459() {
        return false;
    }

    public C17224(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14540 c14540 = this.f78066;
        c14540.m35089();
        c14540.m35086(1728053247 & C3296.f10738);
    }

    public C17224(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14540 c14540 = this.f78066;
        c14540.m35089();
        c14540.m35086(1728053247 & C3296.f10738);
    }

    @Override // l.C23255, l.C24132
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo40460() {
        super.mo40460();
        this.f78066.m35086(1728053247 & C3296.f10738);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40458(InterfaceC16478 interfaceC16478) {
        this.f56125 = interfaceC16478;
    }

    @Override // l.C24132, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection == null) {
            return null;
        }
        return new C24684(this, inputConnectionOnCreateInputConnection);
    }
}
