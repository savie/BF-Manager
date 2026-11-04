package l;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: renamed from: l.ܽۘܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes5.dex */
public class C17327 extends AbstractC17567 {
    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final void mo3723(C21362 c21362, Object obj) throws IOException {
        URL url = (URL) obj;
        c21362.m48602(url == null ? null : url.toExternalForm());
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
            return new URL(strM13453);
        } catch (MalformedURLException e) {
            StringBuilder sbM51387 = C22783.m51387("Failed parsing '", strM13453, "' as URL; at path ");
            sbM51387.append(c4208.m13451());
            throw new C7367(sbM51387.toString(), e);
        }
    }
}
