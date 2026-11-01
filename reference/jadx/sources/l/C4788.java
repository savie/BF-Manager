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

/* JADX INFO: renamed from: l.ۙܿۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: EBHF */
/* JADX INFO: loaded from: classes3.dex */
public class C4788 implements InterfaceC1260 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f16839;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f16841 = false;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public MessageDigest f16840 = null;

    @Override // l.InterfaceC1260
    public String getName() {
        return "bytes/bytes";
    }

    /* JADX INFO: renamed from: ۨ */
    public void mo8216() {
    }

    public C4788(byte[] bArr) {
        this.f16839 = bArr;
    }

    public C4788() {
    }

    @Override // l.InterfaceC1260
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC1260 mo4571(boolean z) {
        this.f16841 = z;
        return this;
    }

    @Override // l.InterfaceC1260
    /* JADX INFO: renamed from: ܰ */
    public final MessageDigest mo4572() {
        return this.f16840;
    }

    @Override // l.InterfaceC1260
    public final int getSize() {
        return this.f16839.length;
    }

    public final String toString() {
        return getName();
    }

    @Override // l.InterfaceC1260
    /* JADX INFO: renamed from: ۙ */
    public final DataInputStream mo4569(C11521 c11521) {
        mo8216();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.f16839);
            if (this.f16841) {
                this.f16840 = MessageDigest.getInstance(XMSSKeyParameters.SHA_256);
                return new DataInputStream(new DigestInputStream(byteArrayInputStream, this.f16840));
            }
            return new DataInputStream(byteArrayInputStream);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // l.InterfaceC1260
    /* JADX INFO: renamed from: ۙ */
    public final Collection mo4570() throws IOException {
        mo8216();
        ArrayList arrayList = new ArrayList();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(this.f16839), "utf-8"));
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
