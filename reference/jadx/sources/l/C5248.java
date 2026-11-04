package l;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* JADX INFO: renamed from: l.ۙ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: FAZN */
/* JADX INFO: loaded from: classes2.dex */
public final class C5248 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11809 f18495;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final EditText f18496;

    public C5248(EditText editText) {
        this.f18496 = editText;
        this.f18495 = new C11809(editText);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15809(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.f18496.getContext().obtainStyledAttributes(attributeSet, C10401.f33068, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            m15810(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final KeyListener m15807(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        this.f18495.getClass();
        return C11809.m29651(keyListener);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15810(boolean z) {
        this.f18495.m29653(z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m15811() {
        return this.f18495.m29654();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InputConnection m15808(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.f18495.m29652(inputConnection, editorInfo);
    }
}
