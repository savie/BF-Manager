package l;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.᩹۟ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAJ9 */
/* JADX INFO: loaded from: classes.dex */
public final class C23401 extends AbstractC20970 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f75754;

    public C23401(long j, AbstractC22044 abstractC22044, String str) {
        super(str, j, Long.valueOf(j));
        this.f75754 = abstractC22044;
    }

    @Override // l.AbstractC20970
    /* JADX INFO: renamed from: ۙ */
    public final InputStream mo10654() throws IOException {
        AbstractC22044 abstractC22044 = this.f75754;
        try {
            return abstractC22044.mo4290();
        } catch (IOException e) {
            String strM49852 = abstractC22044.m49852();
            if (strM49852 != null) {
                return new ByteArrayInputStream(C14449.m34883(strM49852));
            }
            throw e;
        }
    }
}
