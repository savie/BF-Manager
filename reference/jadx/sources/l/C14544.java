package l;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnectionWrapper;

/* JADX INFO: renamed from: l.ܰۤ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class C14544 extends InputConnectionWrapper {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String f45831;

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        f45831 = charSequence.toString();
        C21587.m49118("openSDK_LOG.CaptureInputConnection", "-->setComposingText: " + charSequence.toString());
        return super.setComposingText(charSequence, i);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        f45831 = charSequence.toString();
        C21587.m49118("openSDK_LOG.CaptureInputConnection", "-->commitText: " + charSequence.toString());
        return super.commitText(charSequence, i);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            C21587.m49113("openSDK_LOG.CaptureInputConnection", "sendKeyEvent");
            f45831 = String.valueOf((char) keyEvent.getUnicodeChar());
            C21587.m49111("openSDK_LOG.CaptureInputConnection", "s: " + f45831);
        }
        C21587.m49111("openSDK_LOG.CaptureInputConnection", "-->sendKeyEvent: " + f45831);
        return super.sendKeyEvent(keyEvent);
    }
}
