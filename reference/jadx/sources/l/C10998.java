package l;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.IOException;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: l.ۧ۫۬, reason: contains not printable characters */
/* JADX INFO: compiled from: M799 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10998 implements InterfaceC17347 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C2073 f37424;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Context f37425;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C6265 f37426;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC17347 f37427;

    public C10998(Context context, C6265 c6265, C2073 c2073) {
        this.f37425 = context;
        this.f37426 = c6265;
        this.f37424 = c2073;
    }

    @Override // l.InterfaceC17347
    /* JADX INFO: renamed from: ۙ */
    public final Bitmap mo6591(long j, int i, int i2, InterfaceC0413 interfaceC0413) throws InterruptedIOException {
        InterfaceC17347 interfaceC17347 = this.f37427;
        if (interfaceC17347 != null) {
            return interfaceC17347.mo6591(j, i, i2, interfaceC0413);
        }
        C2073 c2073 = this.f37424;
        if (c2073 != null) {
            try {
                return c2073.mo6591(j, i, i2, interfaceC0413);
            } catch (InterruptedIOException e) {
                throw e;
            } catch (IOException | RuntimeException unused) {
                interfaceC0413.mo2170();
            }
        }
        C2073 c2074 = this.f37424;
        this.f37424 = null;
        C1824.m5943(c2074);
        InterfaceC17347 interfaceC17347M16456 = C6058.m16456(this.f37425, this.f37426);
        this.f37427 = interfaceC17347M16456;
        return interfaceC17347M16456.mo6591(j, i, i2, interfaceC0413);
    }

    @Override // l.InterfaceC17347
    /* JADX INFO: renamed from: ۖ */
    public final C9587 mo6590() {
        InterfaceC17347 interfaceC17347 = this.f37427;
        if (interfaceC17347 == null) {
            interfaceC17347 = this.f37424;
        }
        if (interfaceC17347 == null) {
            return null;
        }
        return interfaceC17347.mo6590();
    }

    @Override // l.InterfaceC17347
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo6594() {
        return this.f37424 != null;
    }

    @Override // l.InterfaceC17347
    /* JADX INFO: renamed from: ۨ */
    public final void mo6593() {
        C2073 c2073 = this.f37424;
        if (c2073 != null) {
            c2073.mo6593();
        }
    }

    @Override // l.InterfaceC17347
    /* JADX INFO: renamed from: ۙ */
    public final void mo6592() {
        C2073 c2073 = this.f37424;
        InterfaceC17347 interfaceC17347 = this.f37427;
        this.f37424 = null;
        this.f37427 = null;
        C1824.m5943(c2073);
        C1824.m5943(interfaceC17347);
    }
}
