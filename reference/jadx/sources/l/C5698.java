package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.InputStream;
import java.io.PipedOutputStream;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Vector;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ۚܰܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: F7ZZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C5698 extends AbstractC8375 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static Vector f19673 = new Vector();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Socket f19675 = null;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public InterfaceRunnableC10369 f19674 = null;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public AbstractC19868 f19676 = null;

    public C5698() {
        this.f27468 = WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
        this.f27471 = WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
        this.f27475 = 16384;
        this.f27476 = new C8878();
        this.f27472 = true;
    }

    @Override // l.AbstractC8375
    /* JADX INFO: renamed from: ᩻ */
    public final void mo6777() {
        C8878 c8878;
        InputStream inputStream;
        try {
            AbstractC19868 abstractC19868 = this.f19676;
            if (abstractC19868 instanceof C15392) {
                this.f19674 = (InterfaceRunnableC10369) Class.forName(null).asSubclass(InterfaceRunnableC10369.class).getDeclaredConstructor(null).newInstance(null);
                PipedOutputStream pipedOutputStream = new PipedOutputStream();
                C8878 c8879 = this.f27476;
                C9120 c9120 = new C9120(pipedOutputStream, 32768);
                c9120.f29614 = pipedOutputStream;
                c8879.f29002 = c9120;
                InterfaceRunnableC10369 interfaceRunnableC10369 = this.f19674;
                m22543();
                interfaceRunnableC10369.m26673();
                this.f19674.m26674();
                ThreadFactoryC11248 threadFactoryC11248M37621 = m22542().m37621();
                InterfaceRunnableC10369 interfaceRunnableC103610 = this.f19674;
                threadFactoryC11248M37621.getClass();
                new Thread(interfaceRunnableC103610).start();
            } else {
                ((C13155) abstractC19868).getClass();
                Socket socketM24052 = C9011.m24052(0, 10000, (String) null);
                this.f19675 = socketM24052;
                socketM24052.setTcpNoDelay(true);
                this.f27476.f29002 = this.f19675.getInputStream();
                this.f27476.f29003 = this.f19675.getOutputStream();
            }
            m22546();
            this.f27481 = Thread.currentThread();
            C9866 c9866 = new C9866(this.f27477);
            C14010 c14010 = new C14010(c9866);
            try {
                C15723 c15723M22542 = m22542();
                while (this.f27481 != null && (c8878 = this.f27476) != null && (inputStream = c8878.f29002) != null) {
                    byte[] bArr = c9866.f31750;
                    int i = inputStream.read(bArr, 14, (bArr.length - 14) - c15723M22542.m37618());
                    if (i <= 0) {
                        m22540();
                        break;
                    }
                    c14010.m34100();
                    c9866.m25651((byte) 94);
                    c9866.m25669(this.f27478);
                    c9866.m25669(i);
                    c9866.m25659(i);
                    synchronized (this) {
                        if (!this.f27470) {
                            c15723M22542.m37615(c14010, this, i);
                        }
                    }
                    break;
                }
            } catch (Exception unused) {
            }
            m22548();
        } catch (Exception unused2) {
            m22544();
            this.f27470 = true;
            m22548();
        }
    }

    @Override // l.AbstractC8375
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo16726(C9866 c9866) {
        C15723 c15723M22542;
        m22549(c9866.m25658());
        m22550(c9866.m25662());
        this.f27477 = c9866.m25658();
        byte[] bArrM25649 = c9866.m25649();
        int iM25658 = c9866.m25658();
        c9866.m25649();
        c9866.m25658();
        try {
            c15723M22542 = m22542();
        } catch (C2079 unused) {
            c15723M22542 = null;
        }
        byte[] bArr = C9011.f29358;
        AbstractC19868 abstractC19868M16723 = m16723(c15723M22542, new String(bArrM25649, 0, bArrM25649.length, StandardCharsets.UTF_8), iM25658);
        this.f19676 = abstractC19868M16723;
        if (abstractC19868M16723 == null) {
            this.f19676 = m16723(c15723M22542, (String) null, iM25658);
        }
        if (this.f19676 == null) {
            c15723M22542.f51127.m45899().getClass();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC19868 m16723(C15723 c15723, String str, int i) {
        synchronized (f19673) {
            int i2 = 0;
            while (true) {
                Vector vector = f19673;
                if (i2 >= vector.size()) {
                    return null;
                }
                AbstractC19868 abstractC19868 = (AbstractC19868) vector.elementAt(i2);
                abstractC19868.getClass();
                if (c15723 == null && (i == 0 || i == 0)) {
                    if (str == null) {
                        return abstractC19868;
                    }
                    throw null;
                }
                i2++;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m16725(C15723 c15723, int i) {
        Vector vector = f19673;
        synchronized (vector) {
            AbstractC19868 abstractC19868M16723 = m16723(c15723, "localhost", i);
            if (abstractC19868M16723 == null) {
                abstractC19868M16723 = m16723(c15723, (String) null, i);
            }
            if (abstractC19868M16723 == null) {
                return;
            }
            vector.removeElement(abstractC19868M16723);
            C9866 c9866 = new C9866(200);
            C14010 c14010 = new C14010(c9866);
            try {
                c14010.m34100();
                c9866.m25651(UTF8.S_P4A);
                byte[] bArr = C9011.f29358;
                Charset charset = StandardCharsets.UTF_8;
                c9866.m25673("cancel-tcpip-forward".getBytes(charset));
                c9866.m25651((byte) 0);
                c9866.m25673(C9011.m24055("0.0.0.0", charset));
                c9866.m25669(i);
                c15723.m37627(c14010);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m16724(C15723 c15723) {
        int[] iArr;
        int i;
        Vector vector = f19673;
        synchronized (vector) {
            iArr = new int[vector.size()];
            int i2 = 0;
            while (true) {
                Vector vector2 = f19673;
                if (i2 >= vector2.size()) {
                    break;
                }
                ((AbstractC19868) vector2.elementAt(i2)).getClass();
                i2++;
            }
        }
        for (i = 0; i < 0; i++) {
            m16725(c15723, iArr[i]);
        }
    }
}
