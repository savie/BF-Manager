package l;

import com.tencent.mm.opensdk.modelmsg.WXNativeGamePageObject;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ۢܶ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: PAJ1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9677 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f32622;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean mo24615() {
        return false;
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract InputStream mo15073(AbstractActivityC12483 abstractActivityC12483, InterfaceC2557 interfaceC2557);

    /* JADX INFO: renamed from: ۙ */
    public abstract ArrayList mo10263(String str, boolean z);

    /* JADX INFO: renamed from: ۙ */
    public abstract InterfaceC2557 mo10264(String str);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo15074(MessageDigest messageDigest);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo15075(C11018 c11018);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo10267(boolean z);

    /* JADX INFO: renamed from: ۨ */
    public abstract String mo15077();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean mo24621() {
        return false;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m24614() {
        return this.f32622;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m24619() {
        C11018 c11018 = new C11018();
        c11018.m27786(mo15077());
        mo15075(c11018);
        return c11018.m27773();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C8141 mo24616(InterfaceC2557 interfaceC2557) {
        InputStream inputStreamMo15073 = mo15073((AbstractActivityC12483) null, interfaceC2557);
        if (inputStreamMo15073 == null) {
            return null;
        }
        return new C8141(inputStreamMo15073, new C8516(interfaceC2557.getSize()), true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo24617(Set set, InterfaceC1914 interfaceC1914) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            InterfaceC2557 interfaceC2557 = (InterfaceC2557) it.next();
            try {
                if (interfaceC2557.isDirectory()) {
                    interfaceC1914.mo6226(interfaceC2557, null);
                } else {
                    interfaceC1914.mo6226(interfaceC2557, mo15073((AbstractActivityC12483) null, interfaceC2557));
                }
            } catch (IOException e) {
                if (!interfaceC1914.mo6227(e)) {
                    return;
                }
            }
            if (interfaceC1914.mo2357()) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo24618(AbstractActivityC12483 abstractActivityC12483, InterfaceC2557 interfaceC2557, InterfaceC12086 interfaceC12086) throws IOException {
        InputStream inputStreamMo15073 = mo15073(abstractActivityC12483, interfaceC2557);
        try {
            if (inputStreamMo15073 == null) {
                interfaceC12086.mo30077();
                if (inputStreamMo15073 != null) {
                    inputStreamMo15073.close();
                    return;
                }
                return;
            }
            C8516 c8516 = new C8516(interfaceC2557.getSize());
            c8516.m22241(new C2849(interfaceC12086));
            byte[] bArr = new byte[WXNativeGamePageObject.LENGTH_LIMIT];
            do {
                int i = inputStreamMo15073.read(bArr);
                if (i == -1) {
                    inputStreamMo15073.close();
                    return;
                } else {
                    interfaceC12086.mo30075(i, bArr);
                    c8516.m22242(i);
                }
            } while (!interfaceC12086.mo2357());
            inputStreamMo15073.close();
        } catch (Throwable th) {
            if (inputStreamMo15073 != null) {
                try {
                    inputStreamMo15073.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2557 m24620(String str) {
        InterfaceC2557 interfaceC2557Mo10264 = mo10264(str);
        if (interfaceC2557Mo10264 != null) {
            return interfaceC2557Mo10264;
        }
        throw new IOException(C0252.m1693("Failed to get file item: ", str));
    }
}
