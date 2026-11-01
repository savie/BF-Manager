package l;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnectionWrapper;

/* JADX INFO: renamed from: l.ۘ᩶ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes2.dex */
public final class C4172 extends InputConnectionWrapper {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String f15221;

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        f15221 = charSequence.toString();
        C23099.m51107("openSDK_LOG.CaptureInputConnection", "-->setComposingText: " + charSequence.toString());
        return super.setComposingText(charSequence, i);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        f15221 = charSequence.toString();
        C23099.m51107("openSDK_LOG.CaptureInputConnection", "-->commitText: " + charSequence.toString());
        return super.commitText(charSequence, i);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            C23099.m51113("openSDK_LOG.CaptureInputConnection", "sendKeyEvent");
            f15221 = String.valueOf((char) keyEvent.getUnicodeChar());
            C23099.m51110("openSDK_LOG.CaptureInputConnection", "s: " + f15221);
        }
        C23099.m51110("openSDK_LOG.CaptureInputConnection", "-->sendKeyEvent: " + f15221);
        return super.sendKeyEvent(keyEvent);
    }
}
