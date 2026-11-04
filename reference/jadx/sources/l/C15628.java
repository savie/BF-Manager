package l;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.ܳ᩸ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: T65P */
/* JADX INFO: loaded from: classes4.dex */
public final class C15628 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f50759;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3696 f50760;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f50761;

    public C15628(C3696 c3696, int i) {
        this.f50760 = c3696;
        this.f50759 = i;
        if (m37378() >= 225) {
            this.f50761 = 68;
            return;
        }
        if (m37378() >= 190) {
            this.f50761 = 64;
            return;
        }
        if (m37378() >= 180) {
            this.f50761 = 60;
            return;
        }
        if (m37378() >= 170) {
            this.f50761 = 56;
            return;
        }
        if (m37378() >= 166) {
            this.f50761 = 64;
            return;
        }
        if (m37378() >= 162) {
            this.f50761 = 68;
        } else if (m37378() >= 127) {
            this.f50761 = 76;
        } else {
            this.f50761 = 72;
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m37380() {
        int i = 0;
        while (true) {
            int i2 = this.f50759;
            C3696 c3696 = this.f50760;
            if (i >= 4) {
                for (int i3 = 4; i3 < 7; i3++) {
                    int i4 = i2 + i3;
                    if (c3696.mo8717(i4) < 48 || c3696.mo8717(i4) > 57) {
                        return false;
                    }
                }
                return c3696.mo8717(i2 + 7) == 0;
            }
            if (c3696.mo8717(i2 + i) != C3696.f12701[i]) {
                return false;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m37378() {
        int i = this.f50759 + 4;
        C3696 c3696 = this.f50760;
        c3696.getClass();
        return Integer.parseInt(c3696.m11964(i, 3, Charset.defaultCharset()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m37377() {
        return this.f50760.mo8719(this.f50759 + 20);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m37379() {
        int iM37378 = m37378();
        C3696 c3696 = this.f50760;
        int i = this.f50759;
        if (iM37378 < 127) {
            if (m37378() >= 56) {
                if (m37378() < 56) {
                    throw new IllegalStateException("Unsupported oat version");
                }
                int i2 = this.f50761;
                return c3696.mo8719((i2 - 4) + i) + i2 + i;
            }
            throw new IllegalStateException("Unsupported oat version");
        }
        return c3696.mo8719(i + 24) + i;
    }
}
