package l;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.IOException;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: l.ۤᩴ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: M799 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11060 implements InterfaceC5095 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Context f34891;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C6044 f34892;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC5095 f34893;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C22823 f34894;

    public C11060(Context context, C6044 c6044, C22823 c22823) {
        this.f34891 = context;
        this.f34892 = c6044;
        this.f34894 = c22823;
    }

    @Override // l.InterfaceC5095
    /* JADX INFO: renamed from: ۙ */
    public final Bitmap mo15403(long j, int i, int i2, InterfaceC8911 interfaceC8911) throws InterruptedIOException {
        InterfaceC5095 interfaceC5095 = this.f34893;
        if (interfaceC5095 != null) {
            return interfaceC5095.mo15403(j, i, i2, interfaceC8911);
        }
        C22823 c22823 = this.f34894;
        if (c22823 != null) {
            try {
                return c22823.mo15403(j, i, i2, interfaceC8911);
            } catch (InterruptedIOException e) {
                throw e;
            } catch (IOException | RuntimeException unused) {
                interfaceC8911.mo23824();
            }
        }
        C22823 c22824 = this.f34894;
        this.f34894 = null;
        C15535.m37210(c22824);
        InterfaceC5095 interfaceC5095M50304 = C22249.m50304(this.f34891, this.f34892);
        this.f34893 = interfaceC5095M50304;
        return interfaceC5095M50304.mo15403(j, i, i2, interfaceC8911);
    }

    @Override // l.InterfaceC5095
    /* JADX INFO: renamed from: ᩸ */
    public final C13298 mo15407() {
        InterfaceC5095 interfaceC5095 = this.f34893;
        if (interfaceC5095 == null) {
            interfaceC5095 = this.f34894;
        }
        if (interfaceC5095 == null) {
            return null;
        }
        return interfaceC5095.mo15407();
    }

    @Override // l.InterfaceC5095
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo15406() {
        return this.f34894 != null;
    }

    @Override // l.InterfaceC5095
    /* JADX INFO: renamed from: ۤ */
    public final void mo15405() {
        C22823 c22823 = this.f34894;
        if (c22823 != null) {
            c22823.mo15405();
        }
    }

    @Override // l.InterfaceC5095
    /* JADX INFO: renamed from: ۙ */
    public final void mo15404() {
        C22823 c22823 = this.f34894;
        InterfaceC5095 interfaceC5095 = this.f34893;
        this.f34894 = null;
        this.f34893 = null;
        C15535.m37210(c22823);
        C15535.m37210(interfaceC5095);
    }
}
