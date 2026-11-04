package l;

import android.system.ErrnoException;
import android.system.Os;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۢۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: A16O */
/* JADX INFO: loaded from: classes4.dex */
public final class C10109 extends AbstractC18555 {
    @Override // l.AbstractC18555
    /* JADX INFO: renamed from: ۙ */
    public final long mo23590() {
        return -1L;
    }

    @Override // l.AbstractC18555
    /* JADX INFO: renamed from: ۙ */
    public final void mo23592(long j) {
    }

    @Override // l.AbstractC18555
    /* JADX INFO: renamed from: ᩷ */
    public final int mo23593() throws IOException {
        try {
            return Os.lstat(this.f60285.mo4278()).st_mode & 4095;
        } catch (ErrnoException e) {
            throw new IOException(e);
        }
    }

    @Override // l.AbstractC18555
    /* JADX INFO: renamed from: ۙ */
    public final void mo23591(int i) {
        try {
            Os.chmod(this.f60285.mo4278(), i);
        } catch (ErrnoException unused) {
        }
    }
}
