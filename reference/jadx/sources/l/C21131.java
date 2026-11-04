package l;

import android.view.Window;

/* JADX INFO: renamed from: l.᩶ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAMH */
/* JADX INFO: loaded from: classes5.dex */
public class C21131 extends C14417 {
    @Override // l.C7706
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1733(boolean z) {
        if (z) {
            Window window = this.f45420;
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            m34849(8192);
            return;
        }
        m34848(8192);
    }

    @Override // l.C7706
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1730() {
        return (this.f45420.getDecorView().getSystemUiVisibility() & 8192) != 0;
    }
}
