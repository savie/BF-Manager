package l;

import android.system.ErrnoException;
import android.system.Os;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩺᩵ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A16O */
/* JADX INFO: loaded from: classes.dex */
public final class C23193 extends AbstractC3810 {
    @Override // l.AbstractC3810
    /* JADX INFO: renamed from: ۙ */
    public final long mo11096() {
        return -1L;
    }

    @Override // l.AbstractC3810
    /* JADX INFO: renamed from: ۙ */
    public final void mo11098(long j) {
    }

    @Override // l.AbstractC3810
    /* JADX INFO: renamed from: ܰ */
    public final int mo11100() throws IOException {
        try {
            return Os.lstat(this.f14144.mo24643()).st_mode & 4095;
        } catch (ErrnoException e) {
            throw new IOException(e);
        }
    }

    @Override // l.AbstractC3810
    /* JADX INFO: renamed from: ۙ */
    public final void mo11097(int i) {
        try {
            Os.chmod(this.f14144.mo24643(), i);
        } catch (ErrnoException unused) {
        }
    }
}
