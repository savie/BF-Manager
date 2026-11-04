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

/* JADX INFO: renamed from: l.᩺ۜۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7EM */
/* JADX INFO: loaded from: classes.dex */
public final class C24120 implements InterfaceC18152 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f77960;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f77961 = false;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public MessageDigest f77962 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C6220 f77959 = null;

    public C24120(String str) {
        this.f77960 = str;
    }

    @Override // l.InterfaceC18152
    public final String getName() {
        return this.f77960;
    }

    public final String toString() {
        return this.f77960;
    }

    @Override // l.InterfaceC18152
    /* JADX INFO: renamed from: ۙ */
    public final Collection mo30462() {
        return C3445.readAllLines(C14631.get(this.f77960, new String[0]));
    }

    @Override // l.InterfaceC18152
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC18152 mo30463(boolean z) {
        this.f77961 = z;
        return this;
    }

    @Override // l.InterfaceC18152
    /* JADX INFO: renamed from: ᩷ */
    public final MessageDigest mo30464() {
        return this.f77962;
    }

    @Override // l.InterfaceC18152
    public final int getSize() {
        C6220 c6220 = this.f77959;
        if (c6220 != null) {
            return c6220.size();
        }
        return 0;
    }

    @Override // l.InterfaceC18152
    /* JADX INFO: renamed from: ۙ */
    public final DataInputStream mo30461(C15867 c15867) throws IOException {
        String str = this.f77960;
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            if (this.f77961) {
                this.f77959 = new C6220(fileInputStream);
                this.f77962 = MessageDigest.getInstance(XMSSKeyParameters.SHA_256);
                return new DataInputStream(new DigestInputStream(this.f77959, this.f77962));
            }
            return new DataInputStream(fileInputStream);
        } catch (IOException e) {
            if (str.matches("^[A-Za-z]+:.*")) {
                try {
                    URLConnection uRLConnectionOpenConnection = new URI(str).toURL().openConnection();
                    uRLConnectionOpenConnection.setUseCaches(false);
                    return new DataInputStream(uRLConnectionOpenConnection.getInputStream());
                } catch (IOException | URISyntaxException e2) {
                    if (c15867.isPresent()) {
                        ((AbstractC12931) c15867.get()).mo4160("Cannot read {0}", str);
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
