package l;

import com.tencent.mm.opensdk.modelmsg.WXNativeGamePageObject;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.۟ۘܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAJ1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7629 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f25172;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract InputStream mo20829(AbstractActivityC17204 abstractActivityC17204, InterfaceC2386 interfaceC2386);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract ArrayList mo20830(String str, boolean z);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract InterfaceC2386 mo20831(String str);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo20833(MessageDigest messageDigest);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo20835(C6178 c6178);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo20837(boolean z);

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean mo20839() {
        return false;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean mo20841() {
        return false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public abstract String mo20842();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m20840() {
        return this.f25172;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m20838() {
        C6178 c6178 = new C6178();
        c6178.m17800(mo20842());
        mo20835(c6178);
        return c6178.m17796();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C23838 mo20832(InterfaceC2386 interfaceC2386) {
        InputStream inputStreamMo20829 = mo20829((AbstractActivityC17204) null, interfaceC2386);
        if (inputStreamMo20829 == null) {
            return null;
        }
        return new C23838(inputStreamMo20829, new C3374(interfaceC2386.getSize()), true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo20834(Set set, InterfaceC0171 interfaceC0171) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            InterfaceC2386 interfaceC2386 = (InterfaceC2386) it.next();
            try {
                if (interfaceC2386.isDirectory()) {
                    interfaceC0171.mo1452(interfaceC2386, null);
                } else {
                    interfaceC0171.mo1452(interfaceC2386, mo20829((AbstractActivityC17204) null, interfaceC2386));
                }
            } catch (IOException e) {
                if (!interfaceC0171.mo1453(e)) {
                    return;
                }
            }
            if (interfaceC0171.mo924()) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo20836(AbstractActivityC17204 abstractActivityC17204, InterfaceC2386 interfaceC2386, InterfaceC6116 interfaceC6116) throws IOException {
        InputStream inputStreamMo20829 = mo20829(abstractActivityC17204, interfaceC2386);
        try {
            if (inputStreamMo20829 == null) {
                interfaceC6116.mo17646();
                if (inputStreamMo20829 != null) {
                    inputStreamMo20829.close();
                    return;
                }
                return;
            }
            C3374 c3374 = new C3374(interfaceC2386.getSize());
            c3374.m11078(new C5087(3, interfaceC6116));
            byte[] bArr = new byte[WXNativeGamePageObject.LENGTH_LIMIT];
            do {
                int i = inputStreamMo20829.read(bArr);
                if (i == -1) {
                    inputStreamMo20829.close();
                    return;
                } else {
                    interfaceC6116.mo17644(i, bArr);
                    c3374.m11079(i);
                }
            } while (!interfaceC6116.mo924());
            inputStreamMo20829.close();
        } catch (Throwable th) {
            if (inputStreamMo20829 != null) {
                try {
                    inputStreamMo20829.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC2386 m20843(String str) {
        InterfaceC2386 interfaceC2386Mo20831 = mo20831(str);
        if (interfaceC2386Mo20831 != null) {
            return interfaceC2386Mo20831;
        }
        throw new IOException(C25272.m56409("Failed to get file item: ", str));
    }
}
