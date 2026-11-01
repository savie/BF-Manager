package l;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLConnection;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: renamed from: l.ۨܿۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7EM */
/* JADX INFO: loaded from: classes4.dex */
public final class C11845 implements InterfaceC1260 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f39753;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f39754 = false;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public MessageDigest f39751 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C13962 f39752 = null;

    public C11845(String str) {
        this.f39753 = str;
    }

    @Override // l.InterfaceC1260
    public final String getName() {
        return this.f39753;
    }

    public final String toString() {
        return this.f39753;
    }

    @Override // l.InterfaceC1260
    /* JADX INFO: renamed from: ۙ */
    public final Collection mo4570() {
        return C5212.readAllLines(C22852.get(this.f39753, new String[0]));
    }

    @Override // l.InterfaceC1260
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC1260 mo4571(boolean z) {
        this.f39754 = z;
        return this;
    }

    @Override // l.InterfaceC1260
    /* JADX INFO: renamed from: ܰ */
    public final MessageDigest mo4572() {
        return this.f39751;
    }

    @Override // l.InterfaceC1260
    public final int getSize() {
        C13962 c13962 = this.f39752;
        if (c13962 != null) {
            return c13962.size();
        }
        return 0;
    }

    @Override // l.InterfaceC1260
    /* JADX INFO: renamed from: ۙ */
    public final DataInputStream mo4569(C11521 c11521) throws IOException {
        String str = this.f39753;
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            if (this.f39754) {
                this.f39752 = new C13962(fileInputStream);
                this.f39751 = MessageDigest.getInstance(XMSSKeyParameters.SHA_256);
                return new DataInputStream(new DigestInputStream(this.f39752, this.f39751));
            }
            return new DataInputStream(fileInputStream);
        } catch (IOException e) {
            if (str.matches("^[A-Za-z]+:.*")) {
                try {
                    URLConnection uRLConnectionOpenConnection = new URI(str).toURL().openConnection();
                    uRLConnectionOpenConnection.setUseCaches(false);
                    return new DataInputStream(uRLConnectionOpenConnection.getInputStream());
                } catch (IOException | URISyntaxException e2) {
                    if (c11521.isPresent()) {
                        ((AbstractC0410) c11521.get()).mo2150("Cannot read {0}", str);
                    }
                    throw e2;
                }
            }
            throw e;
        } catch (NoSuchAlgorithmException e3) {
            throw new RuntimeException(e3);
        }
    }
}
