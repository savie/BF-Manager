package l;

import java.io.FilterOutputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩺ۘۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6XC */
/* JADX INFO: loaded from: classes.dex */
public final class C24032 implements InterfaceC5626 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3894 f77754;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6547 f77755;

    public C24032(C6547 c6547, C3894 c3894) {
        this.f77755 = c6547;
        this.f77754 = c3894;
    }

    @Override // l.InterfaceC5626
    /* JADX INFO: renamed from: ۙ */
    public final long mo16609(OutputStream outputStream) {
        C3894 c3894 = this.f77754;
        C14334 c14334 = new C14334((FilterOutputStream) outputStream);
        try {
            long jM18441 = this.f77755.m18441(c14334);
            if (jM18441 != c14334.f45212) {
                throw C18064.m42095("Local source byte count does not match bytes written.");
            }
            C3894.m12537(c3894, c14334);
            return jM18441;
        } catch (Throwable th) {
            C3894.m12537(c3894, c14334);
            throw th;
        }
    }

    @Override // l.InterfaceC5626
    /* JADX INFO: renamed from: ۙ */
    public final void mo16610(long j) throws C10186 {
        this.f77755.m18442(j);
    }
}
