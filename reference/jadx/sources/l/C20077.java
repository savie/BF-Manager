package l;

import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: l.᩶ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAMH */
/* JADX INFO: loaded from: classes5.dex */
public class C20077 extends C17254 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21631 f65221;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Window f65222;

    public C20077(Window window, C21631 c21631) {
        this.f65222 = window;
        this.f65221 = c21631;
    }

    @Override // l.C17254
    /* JADX INFO: renamed from: ۨ */
    public final void mo30576(int i) {
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                if (i2 == 1) {
                    m45448(4);
                    this.f65222.clearFlags(1024);
                } else if (i2 == 2) {
                    m45448(2);
                } else if (i2 == 8) {
                    this.f65221.m48346();
                }
            }
        }
    }

    @Override // l.C17254
    /* JADX INFO: renamed from: ۙ */
    public final void mo30574(int i) {
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                if (i2 == 1) {
                    m45447(4);
                } else if (i2 == 2) {
                    m45447(2);
                } else if (i2 == 8) {
                    this.f65221.m48345();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m45447(int i) {
        View decorView = this.f65222.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m45448(int i) {
        View decorView = this.f65222.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    @Override // l.C17254
    /* JADX INFO: renamed from: ܰ */
    public final void mo30577(int i) {
        if (i == 0) {
            m45448(6144);
            return;
        }
        if (i == 1) {
            m45448(4096);
            m45447(2048);
        } else {
            if (i != 2) {
                return;
            }
            m45448(2048);
            m45447(4096);
        }
    }
}
