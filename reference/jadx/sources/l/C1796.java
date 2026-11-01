package l;

import android.os.Build;
import android.view.inputmethod.EditorInfo;
import java.util.Set;

/* JADX INFO: renamed from: l.֫ۨۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: DB30 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1796 extends C9559 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public volatile C15640 f6946;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile C1527 f6947;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5878(C1527 c1527) {
        Set setM43977;
        this.f6947 = c1527;
        C1527 c1528 = this.f6947;
        C4349 c4349 = this.f32265.f42677;
        InterfaceC13523 interfaceC13523 = this.f32265.f42678;
        if (Build.VERSION.SDK_INT >= 34) {
            setM43977 = C7878.m20788();
        } else {
            setM43977 = C19167.m43977();
        }
        this.f6946 = new C15640(c1528, c4349, interfaceC13523, setM43977);
        this.f32265.m31819();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence m5876(CharSequence charSequence, int i, int i2, boolean z) {
        return this.f6946.m37319(charSequence, i, i2, z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5877(EditorInfo editorInfo) {
        editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f6947.m5301());
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
