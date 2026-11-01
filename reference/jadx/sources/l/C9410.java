package l;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* JADX INFO: renamed from: l.ۢۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: FAZN */
/* JADX INFO: loaded from: classes3.dex */
public final class C9410 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21366 f31893;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final EditText f31894;

    public C9410(EditText editText) {
        this.f31894 = editText;
        this.f31893 = new C21366(editText);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24157(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.f31894.getContext().obtainStyledAttributes(attributeSet, C12108.f40518, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            m24158(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final KeyListener m24155(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener) ? this.f31893.m47896(keyListener) : keyListener;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24158(boolean z) {
        this.f31893.m47898(z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m24159() {
        return this.f31893.m47899();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InputConnection m24156(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.f31893.m47897(inputConnection, editorInfo);
    }
}
