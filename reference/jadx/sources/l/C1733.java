package l;

import java.util.ConcurrentModificationException;

/* JADX INFO: renamed from: l.֫ۢۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6N8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1733 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C3144 f6841;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C3144 f6842;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13542 f6843;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f6844;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f6845;

    public C1733(C13542 c13542) {
        this.f6843 = c13542;
        this.f6844 = c13542.f44700;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5745(C14435 c14435) {
        if (this.f6845) {
            throw new IllegalStateException("Line builder is finished");
        }
        C3144 c3144 = this.f6841;
        if (c3144 != null && c3144.f11872 == 1024 && c3144 != null) {
            this.f6842 = C13542.m33097(this.f6842, c3144);
            this.f6841 = null;
        }
        if (this.f6841 == null) {
            this.f6841 = new C3144(8);
        }
        this.f6841.m9535(c14435);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m5746() {
        C13542 c13542 = this.f6843;
        if (this.f6845) {
            return false;
        }
        this.f6845 = true;
        try {
            if (this.f6844 == c13542.f44700) {
                C3144 c3144 = this.f6841;
                if (c3144 != null) {
                    this.f6842 = C13542.m33097(this.f6842, c3144);
                    this.f6841 = null;
                }
                if (this.f6842 != null) {
                    c13542.f44699 = C13542.m33110(c13542.f44699, this.f6842);
                    c13542.f44700++;
                    this.f6841 = null;
                    this.f6842 = null;
                    return true;
                }
                this.f6841 = null;
                this.f6842 = null;
                return false;
            }
            throw new ConcurrentModificationException("Line table changed while building");
        } catch (Throwable th) {
            this.f6841 = null;
            this.f6842 = null;
            throw th;
        }
    }
}
