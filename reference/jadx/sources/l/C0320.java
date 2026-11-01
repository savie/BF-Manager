package l;

import android.view.Window;

/* JADX INFO: renamed from: l.֡ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAMH */
/* JADX INFO: loaded from: classes3.dex */
public class C0320 extends C20077 {
    @Override // l.C17254
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo1964(boolean z) {
        if (z) {
            Window window = this.f65222;
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            m45447(8192);
            return;
        }
        m45448(8192);
    }

    @Override // l.C17254
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo1963() {
        return (this.f65222.getDecorView().getSystemUiVisibility() & 8192) != 0;
    }
}
