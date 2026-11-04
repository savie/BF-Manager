package l;

import android.util.Base64;
import com.alipay.sdk.m.p.a;
import com.alipay.sdk.m.p.d;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܽ᩻ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 44KM */
/* JADX INFO: loaded from: classes5.dex */
public final class C17933 implements InterfaceC22760 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m41873(String str, byte[] bArr) {
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(d.a).generatePublic(new X509EncodedKeySpec(Base64.decode("MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCqlaL2//kwVLAAn+mac25arQOjgrRXVr4kl2nrcaoW05YzgdQzyPvADHD1zv3gg33fS+wQlzfnvKUHDSxOFGHubeW36Qkk85sNIZuBZk5ezJx00OdZafzdC6wUr7mreDUlylJWEGbfVALtP8osW8gS1c8H2i4jsHvamAWpwsYR0QIDAQAB", 0)));
            Signature signature = Signature.getInstance("SHA1WithRSA");
            signature.initVerify(publicKeyGeneratePublic);
            signature.update(bArr);
            return signature.verify(Base64.decode(str, 0));
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // l.InterfaceC22760
    /* JADX INFO: renamed from: ۙ */
    public void mo1200(C19929 c19929) {
        ((C14270) c19929.m45858()).toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m41870(InterfaceC13343 interfaceC13343, String str, EnumC23040 enumC23040, Integer num) {
        C15580 c15580;
        return (interfaceC13343.mo17112() == null || interfaceC13343.mo17112().isEmpty() || (c15580 = (C15580) interfaceC13343.mo17112().get(str)) == null || c15580.m37317() != enumC23040) ? num : c15580.m37318();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m41869(int i) {
        if (i < 65 || i > 90) {
            return ((i < 97 || i > 122) && (i & a.g) != 0) ? Character.toLowerCase(Character.toUpperCase(i)) : i;
        }
        return i + 32;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m41872(Throwable th, InterfaceC11536 interfaceC11536) {
        Throwable runtimeException;
        Iterator it = C2186.m7492().iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC1052) it.next()).mo3950(th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    C18856.m43744(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            C18856.m43744(th, new C11880(interfaceC11536));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m41871(InterfaceC13343 interfaceC13343, String str) {
        if (interfaceC13343.mo17112() == null || interfaceC13343.mo17112().isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        C15580 c15580 = (C15580) interfaceC13343.mo17112().get(str);
        if (c15580 == null || c15580.m37317() != EnumC23040.ENCODED_ARRAY) {
            return Collections.EMPTY_LIST;
        }
        return (List) c15580.m37318();
    }
}
