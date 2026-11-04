package l;

import com.alipay.sdk.m.n.a;
import com.alipay.sdk.m.n.b;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: renamed from: l.ۨܺ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: J8X0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12482 extends AbstractC13228 {
    @Override // l.AbstractC13228
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8995 mo31020(String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode < 200 || responseCode >= 300) {
                throw new IOException("Bad response code: " + responseCode + ", url: " + str);
            }
            String headerField = httpURLConnection.getHeaderField("Content-Type");
            if (headerField == null) {
                headerField = null;
            } else {
                int iIndexOf = headerField.indexOf(59);
                if (iIndexOf > -1) {
                    headerField = headerField.substring(0, iIndexOf);
                }
            }
            return AbstractC7504.m20557(new BufferedInputStream(httpURLConnection.getInputStream()), headerField);
        } catch (IOException e) {
            throw new IllegalStateException(C25272.m56409("Exception obtaining network resource: ", str), e);
        }
    }

    @Override // l.AbstractC13228
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Collection mo31019() {
        return Arrays.asList(a.s, b.a);
    }
}
