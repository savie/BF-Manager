package l;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: renamed from: l.ۨۜۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: EBHF */
/* JADX INFO: loaded from: classes4.dex */
public class C12185 implements InterfaceC18152 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f39174;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f39176 = false;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public MessageDigest f39175 = null;

    @Override // l.InterfaceC18152
    public String getName() {
        return "bytes/bytes";
    }

    /* JADX INFO: renamed from: ۤ */
    public void mo12836() {
    }

    public C12185(byte[] bArr) {
        this.f39174 = bArr;
    }

    public C12185() {
    }

    @Override // l.InterfaceC18152
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18152 mo30463(boolean z) {
        this.f39176 = z;
        return this;
    }

    @Override // l.InterfaceC18152
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final MessageDigest mo30464() {
        return this.f39175;
    }

    @Override // l.InterfaceC18152
    public final int getSize() {
        return this.f39174.length;
    }

    public final String toString() {
        return getName();
    }

    @Override // l.InterfaceC18152
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final DataInputStream mo30461(C15867 c15867) {
        mo12836();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.f39174);
            if (this.f39176) {
                this.f39175 = MessageDigest.getInstance(XMSSKeyParameters.SHA_256);
                return new DataInputStream(new DigestInputStream(byteArrayInputStream, this.f39175));
            }
            return new DataInputStream(byteArrayInputStream);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // l.InterfaceC18152
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Collection mo30462() throws IOException {
        mo12836();
        ArrayList arrayList = new ArrayList();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(this.f39174), "utf-8"));
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line != null) {
                    arrayList.add(line);
                } else {
                    bufferedReader.close();
                    return arrayList;
                }
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }
}
