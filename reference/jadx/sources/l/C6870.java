package l;

import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* JADX INFO: renamed from: l.ۜܺᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public class C6870 extends C13221 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static boolean f23161;

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C23099.m51110("openSDK_LOG.SecureWebView", "-->dispatchKeyEvent, is device support: " + f23161);
        if (!f23161) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 4) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyCode == 66) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyCode == 67) {
                String str = C4172.f15221;
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getUnicodeChar() == 0) {
                return super.dispatchKeyEvent(keyEvent);
            }
            return super.dispatchKeyEvent(keyEvent);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.webkit.WebView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        C23099.m51110("openSDK_LOG.SecureWebView", "-->onKeyDown, is device support: " + f23161);
        if (!f23161) {
            return super.onKeyDown(i, keyEvent);
        }
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 4) {
                return super.onKeyDown(i, keyEvent);
            }
            if (keyCode == 66) {
                return super.onKeyDown(i, keyEvent);
            }
            if (keyCode == 67) {
                String str = C4172.f15221;
                return super.onKeyDown(i, keyEvent);
            }
            if (keyEvent.getUnicodeChar() == 0) {
                return super.onKeyDown(i, keyEvent);
            }
            return super.onKeyDown(i, keyEvent);
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.webkit.WebView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        C23099.m51113("openSDK_LOG.SecureWebView", "-->create input connection, is edit: false");
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C23099.m51107("openSDK_LOG.SecureWebView", "-->onCreateInputConnection, inputConn is " + inputConnectionOnCreateInputConnection);
        if (inputConnectionOnCreateInputConnection != null) {
            f23161 = true;
            return new C4172(super.onCreateInputConnection(editorInfo), false);
        }
        f23161 = false;
        return inputConnectionOnCreateInputConnection;
    }
}
