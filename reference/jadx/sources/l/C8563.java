package l;

import android.os.Build;
import android.view.inputmethod.EditorInfo;
import java.util.Set;

/* JADX INFO: renamed from: l.۠ۤۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: DB30 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8563 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2203 f27953;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public volatile C14880 f27954;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public volatile C8914 f27955;

    public C8563(C2203 c2203) {
        this.f27953 = c2203;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22976() {
        C2203 c2203 = this.f27953;
        try {
            c2203.f7237.mo22081(new C2597(this));
        } catch (Throwable th) {
            c2203.m7524(th);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22978(C8914 c8914) {
        Set setM47677;
        this.f27955 = c8914;
        C8914 c8915 = this.f27955;
        C13783 c13783 = this.f27953.f7235;
        InterfaceC5186 interfaceC5186 = this.f27953.f7234;
        if (Build.VERSION.SDK_INT < 34) {
            setM47677 = C20848.m47677();
        } else {
            setM47677 = C20848.m47677();
        }
        this.f27954 = new C14880(c8915, c13783, interfaceC5186, setM47677);
        this.f27953.m7526();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence m22975(CharSequence charSequence, int i, int i2, boolean z) {
        return this.f27954.m35826(charSequence, i, i2, z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22977(EditorInfo editorInfo) {
        editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f27955.m23827());
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
