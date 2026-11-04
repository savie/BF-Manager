package l;

import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: l.ܰۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAMH */
/* JADX INFO: loaded from: classes5.dex */
public class C14417 extends C7706 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15777 f45419;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Window f45420;

    public C14417(Window window, C15777 c15777) {
        this.f45420 = window;
        this.f45419 = c15777;
    }

    @Override // l.C7706
    /* JADX INFO: renamed from: ۤ */
    public final void mo1731(int i) {
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                if (i2 == 1) {
                    m34848(4);
                    this.f45420.clearFlags(1024);
                } else if (i2 == 2) {
                    m34848(2);
                } else if (i2 == 8) {
                    this.f45419.m37714();
                }
            }
        }
    }

    @Override // l.C7706
    /* JADX INFO: renamed from: ۙ */
    public final void mo1728(int i) {
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                if (i2 == 1) {
                    m34849(4);
                } else if (i2 == 2) {
                    m34849(2);
                } else if (i2 == 8) {
                    this.f45419.m37713();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m34849(int i) {
        View decorView = this.f45420.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m34848(int i) {
        View decorView = this.f45420.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    @Override // l.C7706
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1732(int i) {
        if (i == 0) {
            m34848(6144);
            return;
        }
        if (i == 1) {
            m34848(4096);
            m34849(2048);
        } else {
            if (i != 2) {
                return;
            }
            m34848(2048);
            m34849(4096);
        }
    }
}
