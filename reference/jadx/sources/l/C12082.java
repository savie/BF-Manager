package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.InputStream;
import java.io.PipedOutputStream;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Vector;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.۫֨ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: F7ZZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C12082 extends AbstractC7848 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static Vector f40431 = new Vector();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Socket f40433 = null;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceRunnableC14986 f40434 = null;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public AbstractC19843 f40432 = null;

    public C12082() {
        this.f25812 = WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
        this.f25819 = WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
        this.f25810 = 16384;
        this.f25826 = new C7930();
        this.f25818 = true;
    }

    @Override // l.AbstractC7848
    /* JADX INFO: renamed from: ᩺ */
    public final void mo19047() {
        C7930 c7930;
        InputStream inputStream;
        try {
            AbstractC19843 abstractC19843 = this.f40432;
            if (abstractC19843 instanceof C0086) {
                this.f40434 = (InterfaceRunnableC14986) Class.forName(null).asSubclass(InterfaceRunnableC14986.class).getDeclaredConstructor(null).newInstance(null);
                PipedOutputStream pipedOutputStream = new PipedOutputStream();
                C7930 c7931 = this.f25826;
                C17725 c17725 = new C17725(pipedOutputStream, 32768);
                c17725.f56258 = pipedOutputStream;
                c7931.f26044 = c17725;
                InterfaceRunnableC14986 interfaceRunnableC14986 = this.f40434;
                m20743();
                interfaceRunnableC14986.m35964();
                this.f40434.m35963();
                ThreadFactoryC23536 threadFactoryC23536M9227 = m20728().m9227();
                InterfaceRunnableC14986 interfaceRunnableC14987 = this.f40434;
                threadFactoryC23536M9227.getClass();
                new Thread(interfaceRunnableC14987).start();
            } else {
                ((C16315) abstractC19843).getClass();
                Socket socketM22172 = C8491.m22172(0, 10000, (String) null);
                this.f40433 = socketM22172;
                socketM22172.setTcpNoDelay(true);
                this.f25826.f26044 = this.f40433.getInputStream();
                this.f25826.f26045 = this.f40433.getOutputStream();
            }
            m20742();
            this.f25824 = Thread.currentThread();
            C14904 c14904 = new C14904(this.f25822);
            C7307 c7307 = new C7307(c14904);
            try {
                C3073 c3073M20728 = m20728();
                while (this.f25824 != null && (c7930 = this.f25826) != null && (inputStream = c7930.f26044) != null) {
                    byte[] bArr = c14904.f48679;
                    int i = inputStream.read(bArr, 14, (bArr.length - 14) - c3073M20728.m9243());
                    if (i <= 0) {
                        m20736();
                        break;
                    }
                    c7307.m19501();
                    c14904.m35630((byte) 94);
                    c14904.m35644(this.f25821);
                    c14904.m35644(i);
                    c14904.m35639(i);
                    synchronized (this) {
                        if (!this.f25813) {
                            c3073M20728.m9237(c7307, this, i);
                        }
                    }
                    break;
                }
            } catch (Exception unused) {
            }
            m20737();
        } catch (Exception unused2) {
            m20741();
            this.f25813 = true;
            m20737();
        }
    }

    @Override // l.AbstractC7848
    /* JADX INFO: renamed from: ۙ */
    public final void mo20733(C14904 c14904) {
        C3073 c3073M20728;
        m20738(c14904.m35638());
        m20739(c14904.m35637());
        this.f25822 = c14904.m35638();
        byte[] bArrM35628 = c14904.m35628();
        int iM35638 = c14904.m35638();
        c14904.m35628();
        c14904.m35638();
        try {
            c3073M20728 = m20728();
        } catch (C5813 unused) {
            c3073M20728 = null;
        }
        byte[] bArr = C8491.f29422;
        AbstractC19843 abstractC19843M30068 = m30068(c3073M20728, new String(bArrM35628, 0, bArrM35628.length, StandardCharsets.UTF_8), iM35638);
        this.f40432 = abstractC19843M30068;
        if (abstractC19843M30068 == null) {
            this.f40432 = m30068(c3073M20728, (String) null, iM35638);
        }
        if (this.f40432 == null) {
            c3073M20728.f11634.m1333().getClass();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC19843 m30068(C3073 c3073, String str, int i) {
        synchronized (f40431) {
            int i2 = 0;
            while (true) {
                Vector vector = f40431;
                if (i2 >= vector.size()) {
                    return null;
                }
                AbstractC19843 abstractC19843 = (AbstractC19843) vector.elementAt(i2);
                abstractC19843.getClass();
                if (c3073 == null && (i == 0 || i == 0)) {
                    if (str == null) {
                        return abstractC19843;
                    }
                    throw null;
                }
                i2++;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30070(C3073 c3073, int i) {
        Vector vector = f40431;
        synchronized (vector) {
            AbstractC19843 abstractC19843M30068 = m30068(c3073, "localhost", i);
            if (abstractC19843M30068 == null) {
                abstractC19843M30068 = m30068(c3073, (String) null, i);
            }
            if (abstractC19843M30068 == null) {
                return;
            }
            vector.removeElement(abstractC19843M30068);
            C14904 c14904 = new C14904(200);
            C7307 c7307 = new C7307(c14904);
            try {
                c7307.m19501();
                c14904.m35630(UTF8.S_P4A);
                byte[] bArr = C8491.f29422;
                Charset charset = StandardCharsets.UTF_8;
                c14904.m35627("cancel-tcpip-forward".getBytes(charset));
                c14904.m35630((byte) 0);
                c14904.m35627(C8491.m22175("0.0.0.0", charset));
                c14904.m35644(i);
                c3073.m9249(c7307);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30069(C3073 c3073) {
        int[] iArr;
        int i;
        Vector vector = f40431;
        synchronized (vector) {
            iArr = new int[vector.size()];
            int i2 = 0;
            while (true) {
                Vector vector2 = f40431;
                if (i2 >= vector2.size()) {
                    break;
                }
                ((AbstractC19843) vector2.elementAt(i2)).getClass();
                i2++;
            }
        }
        for (i = 0; i < 0; i++) {
            m30070(c3073, iArr[i]);
        }
    }
}
