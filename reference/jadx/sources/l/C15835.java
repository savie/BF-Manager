package l;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/* JADX INFO: renamed from: l.ܶۘܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes5.dex */
public class C15835 extends AbstractC17567 {
    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final void mo3723(C21362 c21362, Object obj) throws IOException {
        URI uri = (URI) obj;
        c21362.m48602(uri == null ? null : uri.toString());
    }

    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3722(C4208 c4208) throws IOException {
        if (c4208.m13438() == EnumC14648.NULL) {
            c4208.m13444();
            return null;
        }
        String strM13453 = c4208.m13453();
        if (strM13453.equals("null")) {
            return null;
        }
        try {
            return new URI(strM13453);
        } catch (URISyntaxException e) {
            StringBuilder sbM51387 = C22783.m51387("Failed parsing '", strM13453, "' as URI; at path ");
            sbM51387.append(c4208.m13451());
            throw new C7367(sbM51387.toString(), e);
        }
    }
}
