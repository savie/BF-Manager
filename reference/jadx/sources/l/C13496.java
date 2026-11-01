package l;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/* JADX INFO: renamed from: l.ܰ֨᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes4.dex */
public class C13496 extends AbstractC7186 {
    @Override // l.AbstractC7186
    /* JADX INFO: renamed from: ۙ */
    public final void mo1572(C1145 c1145, Object obj) throws IOException {
        URI uri = (URI) obj;
        c1145.m4212(uri == null ? null : uri.toASCIIString());
    }

    @Override // l.AbstractC7186
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1571(C5379 c5379) throws IOException {
        if (c5379.m14916() == EnumC22313.NULL) {
            c5379.m14918();
            return null;
        }
        try {
            String strM14922 = c5379.m14922();
            if (strM14922.equals("null")) {
                return null;
            }
            return new URI(strM14922);
        } catch (URISyntaxException e) {
            throw new C9573(e);
        }
    }
}
