package l;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.᩶ܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: T65P */
/* JADX INFO: loaded from: classes4.dex */
public final class C20237 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f65662;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9654 f65663;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f65664;

    public C20237(C9654 c9654, int i) {
        this.f65663 = c9654;
        this.f65662 = i;
        if (m45742() >= 225) {
            this.f65664 = 68;
            return;
        }
        if (m45742() >= 190) {
            this.f65664 = 64;
            return;
        }
        if (m45742() >= 180) {
            this.f65664 = 60;
            return;
        }
        if (m45742() >= 170) {
            this.f65664 = 56;
            return;
        }
        if (m45742() >= 166) {
            this.f65664 = 64;
            return;
        }
        if (m45742() >= 162) {
            this.f65664 = 68;
        } else if (m45742() >= 127) {
            this.f65664 = 76;
        } else {
            this.f65664 = 72;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m45740() {
        int i = 0;
        while (true) {
            int i2 = this.f65662;
            C9654 c9654 = this.f65663;
            if (i >= 4) {
                for (int i3 = 4; i3 < 7; i3++) {
                    int i4 = i2 + i3;
                    if (c9654.mo5855(i4) < 48 || c9654.mo5855(i4) > 57) {
                        return false;
                    }
                }
                return c9654.mo5855(i2 + 7) == 0;
            }
            if (c9654.mo5855(i2 + i) != C9654.f32456[i]) {
                return false;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m45742() {
        int i = this.f65662 + 4;
        C9654 c9654 = this.f65663;
        c9654.getClass();
        return Integer.parseInt(c9654.m5856(i, 3, Charset.defaultCharset()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m45741() {
        return this.f65663.mo9809(this.f65662 + 20);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m45743() {
        int iM45742 = m45742();
        C9654 c9654 = this.f65663;
        int i = this.f65662;
        if (iM45742 < 127) {
            if (m45742() >= 56) {
                if (m45742() < 56) {
                    throw new IllegalStateException("Unsupported oat version");
                }
                int i2 = this.f65664;
                return c9654.mo9809((i2 - 4) + i) + i2 + i;
            }
            throw new IllegalStateException("Unsupported oat version");
        }
        return c9654.mo9809(i + 24) + i;
    }
}
