package l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ܽ۟ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAJ9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17433 extends AbstractC20970 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final IOException f56696;

    public C17433(String str, IOException iOException) {
        super(str, 0L, new Object());
        this.f56696 = iOException;
    }

    @Override // l.AbstractC20970
    /* JADX INFO: renamed from: ۙ */
    public final InputStream mo10654() throws IOException {
        throw this.f56696;
    }
}
