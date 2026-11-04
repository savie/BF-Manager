package l;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

/* JADX INFO: renamed from: l.᩻֡᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: E7F1 */
/* JADX INFO: loaded from: classes.dex */
public final class C24684 extends InputConnectionWrapper {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17224 f79870;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24684(C17224 c17224, InputConnection inputConnection) {
        super(inputConnection, false);
        this.f79870 = c17224;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        C17224 c17224 = this.f79870;
        InterfaceC16478 interfaceC16478 = c17224.f56125;
        if (interfaceC16478 == null || !interfaceC16478.mo24198(c17224, i, null)) {
            return super.performEditorAction(i);
        }
        return true;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        C17224 c17224 = this.f79870;
        InterfaceC16478 interfaceC16478 = c17224.f56125;
        if (interfaceC16478 != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66 && interfaceC16478.mo24198(c17224, 0, keyEvent)) {
            return true;
        }
        return super.sendKeyEvent(keyEvent);
    }
}
