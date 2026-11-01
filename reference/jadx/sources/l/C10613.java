package l;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

/* JADX INFO: renamed from: l.ۤ᩺᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: E7F1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10613 extends InputConnectionWrapper {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21195 f36275;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10613(C21195 c21195, InputConnection inputConnection) {
        super(inputConnection, false);
        this.f36275 = c21195;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        InterfaceC7790 interfaceC7790 = this.f36275.f68990;
        if (interfaceC7790 == null || !C1439.m5018((C1439) ((C3078) interfaceC7790).f11653, i)) {
            return super.performEditorAction(i);
        }
        return true;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        InterfaceC7790 interfaceC7790 = this.f36275.f68990;
        if (interfaceC7790 != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66 && C1439.m5018((C1439) ((C3078) interfaceC7790).f11653, 0)) {
            return true;
        }
        return super.sendKeyEvent(keyEvent);
    }
}
