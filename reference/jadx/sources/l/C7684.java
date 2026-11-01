package l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.۟᩵᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: XAJ9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7684 extends AbstractC19603 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final IOException f25449;

    public C7684(String str, IOException iOException) {
        super(str, 0L, new Object());
        this.f25449 = iOException;
    }

    @Override // l.AbstractC19603
    /* JADX INFO: renamed from: ۙ */
    public final InputStream mo2898() throws IOException {
        throw this.f25449;
    }
}
