package l;

import java.util.ConcurrentModificationException;

/* JADX INFO: renamed from: l.᩶ۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6N8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21080 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C0197 f67349;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f67350;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18842 f67351;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f67352;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C0197 f67353;

    public C21080(C18842 c18842) {
        this.f67351 = c18842;
        this.f67350 = c18842.f61208;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48139(C14366 c14366) {
        if (this.f67352) {
            throw new IllegalStateException("Line builder is finished");
        }
        C0197 c0197 = this.f67353;
        if (c0197 != null && c0197.f1330 == 1024 && c0197 != null) {
            this.f67349 = C18842.m43725(this.f67349, c0197);
            this.f67353 = null;
        }
        if (this.f67353 == null) {
            this.f67353 = new C0197(8);
        }
        this.f67353.m1579(c14366);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m48140() {
        C18842 c18842 = this.f67351;
        if (this.f67352) {
            return false;
        }
        this.f67352 = true;
        try {
            if (this.f67350 == c18842.f61208) {
                C0197 c0197 = this.f67353;
                if (c0197 != null) {
                    this.f67349 = C18842.m43725(this.f67349, c0197);
                    this.f67353 = null;
                }
                if (this.f67349 != null) {
                    c18842.f61207 = C18842.m43716(c18842.f61207, this.f67349);
                    c18842.f61208++;
                    this.f67353 = null;
                    this.f67349 = null;
                    return true;
                }
                this.f67353 = null;
                this.f67349 = null;
                return false;
            }
            throw new ConcurrentModificationException("Line table changed while building");
        } catch (Throwable th) {
            this.f67353 = null;
            this.f67349 = null;
            throw th;
        }
    }
}
