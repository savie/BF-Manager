package l;

import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۢۗ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A4DP */
/* JADX INFO: loaded from: classes3.dex */
public final class C9314 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean[] f31585;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f31586;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13598 f31587;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C2962 f31588;

    public C9314(C13598 c13598, C2962 c2962) {
        this.f31587 = c13598;
        this.f31588 = c2962;
        this.f31585 = c2962.f11098 ? null : new boolean[c13598.f44840];
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m23889() {
        C2962 c2962 = this.f31588;
        if (c2962.f11097 != this) {
            return;
        }
        int i = 0;
        while (true) {
            C13598 c13598 = this.f31587;
            if (i < c13598.f44840) {
                try {
                    c13598.f44855.mo7703(c2962.f11095[i]);
                } catch (IOException unused) {
                }
                i++;
            } else {
                c2962.f11097 = null;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8597 m23887(int i) {
        synchronized (this.f31587) {
            if (this.f31586) {
                throw new IllegalStateException();
            }
            C2962 c2962 = this.f31588;
            if (c2962.f11097 != this) {
                return C0834.m3432();
            }
            if (!c2962.f11098) {
                this.f31585[i] = true;
            }
            try {
                return new C1551(this, this.f31587.f44855.mo7710(c2962.f11095[i]));
            } catch (FileNotFoundException unused) {
                return C0834.m3432();
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m23890() {
        synchronized (this.f31587) {
            if (this.f31586) {
                throw new IllegalStateException();
            }
            if (this.f31588.f11097 == this) {
                this.f31587.m33232(this, true);
            }
            this.f31586 = true;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23888() {
        synchronized (this.f31587) {
            if (this.f31586) {
                throw new IllegalStateException();
            }
            if (this.f31588.f11097 == this) {
                this.f31587.m33232(this, false);
            }
            this.f31586 = true;
        }
    }
}
