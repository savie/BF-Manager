package l;

import com.google.android.material.motion.MotionUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: renamed from: l.۬ܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: YA21 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14014 extends AbstractRunnableC0066 implements InterfaceC4541 {

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC25186 f44383 = C16980.m40037(C14014.class);

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public InputStream f44385;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public long f44386;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public InterfaceC11097 f44388;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC8619 f44389;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final boolean f44390;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public InterfaceC10110 f44392;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23032 f44394;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public Socket f44395;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public int f44397;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public OutputStream f44399;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public boolean f44400 = false;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final AtomicLong f44398 = new AtomicLong();

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f44391 = new byte[1024];

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedList f44384 = new LinkedList();

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public String f44396 = null;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Semaphore f44387 = new Semaphore(1, true);

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public byte[] f44393 = new byte[64];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C8794 m34121(InterfaceC23032 interfaceC23032, String str, String str2) {
        InterfaceC25186 interfaceC25186 = f44383;
        if (interfaceC25186.mo13713()) {
            interfaceC25186.mo13717("Currently " + this.f44384.size() + " session(s) active for " + this);
        }
        if (str != null) {
            str = str.toLowerCase(Locale.ROOT);
        }
        if (str2 != null) {
            str2 = str2.toUpperCase(Locale.ROOT);
        }
        ListIterator listIterator = this.f44384.listIterator();
        while (listIterator.hasNext()) {
            C8794 c8794 = (C8794) listIterator.next();
            if (c8794.m23606(interfaceC23032, str, str2)) {
                InterfaceC25186 interfaceC25187 = f44383;
                if (interfaceC25187.mo13713()) {
                    interfaceC25187.mo13717("Reusing existing session " + c8794);
                }
                c8794.m23605();
                return c8794;
            }
            InterfaceC25186 interfaceC25188 = f44383;
            if (interfaceC25188.mo13713()) {
                interfaceC25188.mo13717("Existing session " + c8794 + " does not match " + interfaceC23032.mo22000());
            }
        }
        if (((C14826) interfaceC23032.mo2875()).m35707() > 0) {
            long j = this.f44386;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (j < jCurrentTimeMillis) {
                this.f44386 = ((long) ((C14826) interfaceC23032.mo2875()).m35707()) + jCurrentTimeMillis;
                ListIterator listIterator2 = this.f44384.listIterator();
                while (listIterator2.hasNext()) {
                    C8794 c8795 = (C8794) listIterator2.next();
                    if (c8795.m23610() != null && c8795.m23610().longValue() < jCurrentTimeMillis && !c8795.m23615()) {
                        InterfaceC25186 interfaceC25189 = f44383;
                        if (interfaceC25189.mo13707()) {
                            interfaceC25189.mo13721("Closing session after timeout " + c8795);
                        }
                        c8795.m23607(false, false);
                    }
                }
            }
        }
        C8794 c8796 = new C8794(interfaceC23032, str, str2, this);
        InterfaceC25186 interfaceC251810 = f44383;
        if (interfaceC251810.mo13707()) {
            interfaceC251810.mo13721("Establishing new session " + c8796 + " on " + this.f974);
        }
        this.f44384.add(c8796);
        return c8796;
    }

    @Override // l.AbstractRunnableC0066
    /* JADX INFO: renamed from: ᩷ */
    public final synchronized boolean mo1100(boolean z, boolean z2) {
        boolean zM23607;
        InterfaceC23032 interfaceC23032;
        ListIterator listIterator = this.f44384.listIterator();
        long jM1094 = m1094();
        if ((!z2 || jM1094 == 1) && (z2 || jM1094 <= 0)) {
            zM23607 = false;
        } else {
            f44383.mo13729("Disconnecting transport while still in use " + this + ": " + this.f44384);
            zM23607 = true;
        }
        InterfaceC25186 interfaceC25186 = f44383;
        if (interfaceC25186.mo13707()) {
            interfaceC25186.mo13721("Disconnecting transport " + this);
        }
        try {
            try {
                if (interfaceC25186.mo13713()) {
                    interfaceC25186.mo13717("Currently " + this.f44384.size() + " session(s) active for " + this);
                }
                while (listIterator.hasNext()) {
                    try {
                        try {
                            zM23607 |= ((C8794) listIterator.next()).m23607(z, false);
                        } catch (Throwable th) {
                            listIterator.remove();
                            throw th;
                        }
                    } catch (Exception e) {
                        f44383.mo13711("Failed to close session", e);
                    }
                    listIterator.remove();
                }
                Socket socket = this.f44395;
                if (socket != null) {
                    socket.shutdownOutput();
                    this.f44399.close();
                    this.f44385.close();
                    this.f44395.close();
                    f44383.mo13717("Socket closed");
                } else {
                    f44383.mo13717("Not yet initialized");
                }
                this.f44395 = null;
                this.f44392 = null;
                this.f44396 = null;
                interfaceC23032 = this.f44394;
            } catch (Exception e2) {
                f44383.mo13711("Exception in disconnect", e2);
                this.f44395 = null;
                this.f44392 = null;
                this.f44396 = null;
                interfaceC23032 = this.f44394;
            }
            ((C10506) interfaceC23032.mo2874()).m26969(this);
        } catch (Throwable th2) {
            this.f44395 = null;
            this.f44392 = null;
            this.f44396 = null;
            ((C10506) this.f44394.mo2874()).m26969(this);
            throw th2;
        }
        return zM23607;
    }

    public C14014(InterfaceC23032 interfaceC23032, InterfaceC11097 interfaceC11097, int i, boolean z) {
        boolean z2 = false;
        this.f44394 = interfaceC23032;
        if (z) {
            z2 = true;
        } else {
            interfaceC23032.mo2875().getClass();
        }
        this.f44390 = z2;
        this.f44386 = System.currentTimeMillis() + ((long) ((C14826) interfaceC23032.mo2875()).m35707());
        this.f44388 = interfaceC11097;
        this.f44397 = i;
    }

    @Override // l.AbstractRunnableC0066
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1097(InterfaceC21299 interfaceC21299) {
        if (interfaceC21299 != null) {
            interfaceC21299.getClass();
        }
        return ((C14826) this.f44394.mo2875()).m35713();
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC11097 m34116() {
        return this.f44388;
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final String m34129() {
        return this.f44396;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int m34134() {
        return this.f44384.size();
    }

    @Override // l.AbstractRunnableC0066
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo1093() {
        Socket socket = this.f44395;
        return super.mo1093() || socket == null || socket.isClosed();
    }

    @Override // l.AbstractRunnableC0066
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo1090() {
        Socket socket = this.f44395;
        return super.mo1090() || socket == null || socket.isClosed();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8619 m34131() throws C20728 {
        try {
            if (this.f44389 == null) {
                m1099(((C14826) this.f44394.mo2875()).m35713());
            }
            InterfaceC8619 interfaceC8619 = this.f44389;
            if (interfaceC8619 != null) {
                return interfaceC8619;
            }
            throw new C20728("Connection did not complete, failed to get negotiation response");
        } catch (IOException e) {
            throw new C20728(e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m34133() {
        return this.f44400 || (m34131() instanceof C3464);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34123(InterfaceC10110 interfaceC10110) {
        this.f44392 = interfaceC10110;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10110 m34118() {
        return this.f44392;
    }

    public final InterfaceC23032 getContext() {
        return this.f44394;
    }

    @Override // l.AbstractRunnableC0066
    /* JADX INFO: renamed from: ۙ */
    public final void mo1087(InterfaceC21299 interfaceC21299) {
        InterfaceC25186 interfaceC25186;
        byte[] bArrM18585 = this.f44394.mo2870().m18585();
        try {
            synchronized (this.f972) {
                int iMo10305 = interfaceC21299.mo10305(4, bArrM18585);
                C20203.m46469(65535 & iMo10305, 0, bArrM18585);
                if (f44383.mo13713()) {
                    do {
                        interfaceC25186 = f44383;
                        interfaceC25186.mo13717(interfaceC21299.toString());
                        if (!(interfaceC21299 instanceof AbstractC6209)) {
                            break;
                        } else {
                            interfaceC21299 = ((AbstractC6209) interfaceC21299).m17848();
                        }
                    } while (interfaceC21299 != null);
                    interfaceC25186.mo13717(C6033.m17504(bArrM18585, 4, iMo10305));
                }
                this.f44399.write(bArrM18585, 0, iMo10305 + 4);
                this.f44399.flush();
            }
            this.f44394.mo2870().m18584(bArrM18585);
        } catch (Throwable th) {
            this.f44394.mo2870().m18584(bArrM18585);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean m34130() throws C20728 {
        if (this.f44390) {
            return false;
        }
        InterfaceC8619 interfaceC8619M34131 = m34131();
        return interfaceC8619M34131.mo11410() && !interfaceC8619M34131.mo11413();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m34117() {
        if (this.f44390) {
            return true;
        }
        return m34131().mo11413();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4541 m34120(Class cls) {
        if (cls.isAssignableFrom(C14014.class)) {
            return this;
        }
        throw new ClassCastException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m34126(InterfaceC11097 interfaceC11097, int i, String str) {
        int i2;
        if (this.f969 == 5 || this.f969 == 6) {
            return false;
        }
        if (str == null) {
            str = interfaceC11097.mo28044();
        }
        String str2 = this.f44396;
        if ((str2 != null && !str.equalsIgnoreCase(str2)) || !interfaceC11097.equals(this.f44388)) {
            return false;
        }
        if (i == 0 || i == (i2 = this.f44397)) {
            return true;
        }
        return i == 445 && i2 == 139;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m34128() throws IOException {
        String strMo28042;
        InterfaceC23032 interfaceC23032 = this.f44394;
        InterfaceC5878 interfaceC5878Mo2875 = interfaceC23032.mo2875();
        InterfaceC11097 interfaceC11097 = this.f44388;
        C19126 c19126 = new C19126(interfaceC5878Mo2875, interfaceC11097.mo28045(), 32, null);
        do {
            Socket socket = new Socket();
            this.f44395 = socket;
            socket.connect(new InetSocketAddress(interfaceC11097.mo28041(), 139), ((C14826) interfaceC23032.mo2875()).m35732());
            this.f44395.setSoTimeout(((C14826) interfaceC23032.mo2875()).m35737());
            this.f44399 = this.f44395.getOutputStream();
            this.f44385 = this.f44395.getInputStream();
            C15594 c15594 = new C15594(interfaceC23032.mo2875(), c19126, ((RunnableC13904) interfaceC23032.mo2872()).m33873());
            OutputStream outputStream = this.f44399;
            byte[] bArr = this.f44391;
            outputStream.write(bArr, 0, c15594.m37326(bArr));
            int iM1078 = AbstractRunnableC0066.m1078(this.f44385, bArr, 0, 4);
            InterfaceC25186 interfaceC25186 = f44383;
            if (iM1078 < 4) {
                try {
                    this.f44395.close();
                } catch (IOException e) {
                    interfaceC25186.mo13711("Failed to close socket", e);
                }
                throw new C20728("EOF during NetBIOS session request");
            }
            int i = bArr[0] & 255;
            if (i == -1) {
                m1098();
                throw new C11119(-1);
            }
            if (i == 130) {
                if (interfaceC25186.mo13707()) {
                    interfaceC25186.mo13721("session established ok with " + interfaceC11097);
                    return;
                }
                return;
            }
            if (i == 131) {
                int i2 = this.f44385.read() & 255;
                if (i2 == 128 || i2 == 130) {
                    this.f44395.close();
                    strMo28042 = interfaceC11097.mo28042(interfaceC23032);
                    c19126.f61896 = strMo28042;
                } else {
                    m1098();
                    throw new C11119(i2);
                }
            } else {
                m1098();
                throw new C11119(0);
            }
        } while (strMo28042 != null);
        throw new IOException("Failed to establish session with " + interfaceC11097);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C9364 m34107(int i) {
        synchronized (this.f971) {
            try {
                if (i == 139) {
                    m34128();
                } else {
                    if (i == 0) {
                        i = 445;
                    }
                    Socket socket = new Socket();
                    this.f44395 = socket;
                    socket.connect(new InetSocketAddress(this.f44388.mo28041(), i), ((C14826) this.f44394.mo2875()).m35732());
                    this.f44395.setSoTimeout(((C14826) this.f44394.mo2875()).m35737());
                    this.f44399 = this.f44395.getOutputStream();
                    this.f44385 = this.f44395.getInputStream();
                }
                if (this.f44387.drainPermits() == 0) {
                    f44383.mo13721("It appears we previously lost some credits");
                }
                if (this.f44400) {
                    f44383.mo13721("Using SMB2 only negotiation");
                    return m34112((C3464) null);
                }
                this.f44394.mo2875().getClass();
                C13665 c13665 = new C13665(this.f44394.mo2875(), this.f44390);
                int iM34106 = m34106((InterfaceC21299) c13665, true);
                m34111();
                if (this.f44400) {
                    C3464 c3464 = new C3464(this.f44394.mo2875());
                    c3464.m10306(this.f44391, 4, false);
                    c3464.mo12752();
                    if (c3464.m11408() == 767) {
                        return m34112(c3464);
                    }
                    if (c3464.m11408() != 514) {
                        throw new C20048("Server returned invalid dialect verison in multi protocol negotiation");
                    }
                    int iM10340 = c3464.m10340();
                    if (iM10340 > 0) {
                        this.f44387.release(iM10340);
                    }
                    Arrays.fill(this.f44391, (byte) 0);
                    return new C9364(new C23602(this.f44394.mo2875(), this.f44390 ? 2 : 1), c3464, null, null);
                }
                if (((C14826) this.f44394.mo2875()).m35720().m56408()) {
                    throw new C20048("Server does not support SMB2");
                }
                C5242 c5242 = new C5242(this.f44394);
                c5242.decode(this.f44391);
                c5242.mo12752();
                InterfaceC25186 interfaceC25186 = f44383;
                if (interfaceC25186.mo13713()) {
                    interfaceC25186.mo13717(c5242.toString());
                    interfaceC25186.mo13717(C6033.m17504(this.f44391, 4, iM34106));
                }
                int iM15755 = c5242.m15755();
                if (iM15755 > 0) {
                    this.f44387.release(iM15755);
                }
                Arrays.fill(this.f44391, (byte) 0);
                return new C9364(c13665, c5242, null, null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m34106(InterfaceC21299 interfaceC21299, boolean z) throws IOException {
        if (z) {
            mo1091(interfaceC21299);
        } else {
            interfaceC21299.mo10309(0L);
            this.f44398.set(1L);
        }
        byte[] bArr = this.f44391;
        int iMo10305 = interfaceC21299.mo10305(4, bArr);
        C20203.m46469(65535 & iMo10305, 0, bArr);
        InterfaceC25186 interfaceC25186 = f44383;
        if (interfaceC25186.mo13713()) {
            interfaceC25186.mo13717(interfaceC21299.toString());
            interfaceC25186.mo13717(C6033.m17504(bArr, 4, iMo10305));
        }
        this.f44399.write(bArr, 0, iMo10305 + 4);
        this.f44399.flush();
        interfaceC25186.mo13717("Wrote negotiate request");
        return iMo10305;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private void m34111() throws IOException {
        InterfaceC23032 interfaceC23032 = this.f44394;
        try {
            this.f44395.setSoTimeout(((C14826) interfaceC23032.mo2875()).m35732());
            if (mo1096() == null) {
                throw new IOException("transport closed in negotiate");
            }
            this.f44395.setSoTimeout(((C14826) interfaceC23032.mo2875()).m35737());
            byte[] bArr = this.f44391;
            int iM46468 = C20203.m46468(2, bArr) & HPKE.aead_EXPORT_ONLY;
            if (iM46468 < 33 || iM46468 + 4 > bArr.length) {
                throw new IOException(C13645.m33382(iM46468, "Invalid payload size: "));
            }
            int i = this.f44400 ? 64 : 32;
            AbstractRunnableC0066.m1078(this.f44385, bArr, i + 4, iM46468 - i);
            f44383.mo13717("Read negotiate response");
        } catch (Throwable th) {
            this.f44395.setSoTimeout(((C14826) interfaceC23032.mo2875()).m35737());
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private C9364 m34112(C3464 c3464) throws Throwable {
        Throwable th;
        byte[] bArr;
        Semaphore semaphore = this.f44387;
        byte[] bArr2 = this.f44391;
        int iM34119 = m34119(c3464);
        InterfaceC23032 interfaceC23032 = this.f44394;
        C23602 c23602 = new C23602(interfaceC23032.mo2875(), iM34119);
        C3464 c3465 = null;
        byte[] bArr3 = null;
        try {
            c23602.m10316(Math.max(1, 512 - semaphore.availablePermits()));
            int iM34106 = m34106(c23602, c3464 != null);
            boolean zM56406 = ((C14826) interfaceC23032.mo2875()).m35734().m56406(EnumC25270.SMB311);
            if (zM56406) {
                bArr = new byte[iM34106];
                System.arraycopy(bArr2, 4, bArr, 0, iM34106);
            } else {
                bArr = null;
            }
            m34111();
            C3464 c3466 = (C3464) c23602.mo1726(interfaceC23032);
            try {
                int iM10306 = c3466.m10306(bArr2, 4, false);
                c3466.mo12752();
                if (zM56406) {
                    bArr3 = new byte[iM10306];
                    System.arraycopy(bArr2, 4, bArr3, 0, iM10306);
                } else {
                    bArr = null;
                }
                InterfaceC25186 interfaceC25186 = f44383;
                if (interfaceC25186.mo13713()) {
                    interfaceC25186.mo13717(c3466.toString());
                    interfaceC25186.mo13717(C6033.m17504(bArr2, 4, 0));
                }
                C9364 c9364 = new C9364(c23602, c3466, bArr, bArr3);
                int iM10340 = c3466.m10340();
                semaphore.release(iM10340 != 0 ? iM10340 : 1);
                Arrays.fill(bArr2, (byte) 0);
                return c9364;
            } catch (Throwable th2) {
                th = th2;
                c3465 = c3466;
                int iM10341 = c3465 != null ? c3465.m10340() : 0;
                semaphore.release(iM10341 != 0 ? iM10341 : 1);
                Arrays.fill(bArr2, (byte) 0);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m34136() {
        try {
            return m1099(((C14826) this.f44394.mo2875()).m35713());
        } catch (C7524 e) {
            throw new C20728("Failed to connect: " + this.f44388, e);
        }
    }

    @Override // l.AbstractRunnableC0066
    /* JADX INFO: renamed from: ۤ */
    public final void mo1092() throws IOException {
        InterfaceC25186 interfaceC25186 = f44383;
        if (interfaceC25186.mo13707()) {
            interfaceC25186.mo13721("Connecting in state " + this.f969 + " addr " + this.f44388.mo28041());
        }
        try {
            C9364 c9364M34107 = m34107(this.f44397);
            if (interfaceC25186.mo13707()) {
                interfaceC25186.mo13721("Negotiation response on " + this.f974 + " :" + c9364M34107);
            }
            if (!c9364M34107.m24673().mo11402(this.f44394, c9364M34107.m24672())) {
                throw new C20728("This client is not compatible with the server.");
            }
            boolean zMo11413 = c9364M34107.m24673().mo11413();
            boolean zMo11407 = c9364M34107.m24673().mo11407();
            if (interfaceC25186.mo13707()) {
                StringBuilder sb = new StringBuilder("Signature negotiation enforced ");
                sb.append(this.f44390);
                sb.append(" (server ");
                sb.append(zMo11413);
                sb.append(") enabled false (server ");
                this.f44394.mo2875().getClass();
                sb.append(zMo11407);
                sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
                interfaceC25186.mo13721(sb.toString());
            }
            this.f44396 = this.f44388.mo28044();
            this.f44389 = c9364M34107.m24673();
            if (c9364M34107.m24673().mo11409().m56406(EnumC25270.SMB311)) {
                byte[] bArrM24674 = c9364M34107.m24674();
                synchronized (this.f44393) {
                    this.f44393 = m34127(bArrM24674.length, bArrM24674, this.f44393);
                }
                m34114(c9364M34107.m24675());
                if (interfaceC25186.mo13707()) {
                    byte[] bArr = this.f44393;
                    interfaceC25186.mo13721("Preauth hash after negotiate ".concat(C6033.m17504(bArr, 0, bArr.length)));
                }
            }
        } catch (IOException e) {
            this.f44394.mo2875().getClass();
            throw e;
        }
    }

    @Override // l.AbstractRunnableC0066
    /* JADX INFO: renamed from: ۤ */
    public final long mo1091(InterfaceC21299 interfaceC21299) {
        long jIncrementAndGet = this.f44398.incrementAndGet() - 1;
        if (!this.f44400) {
            jIncrementAndGet %= 32000;
        }
        interfaceC21299.mo10309(jIncrementAndGet);
        return jIncrementAndGet;
    }

    @Override // l.AbstractRunnableC0066
    /* JADX INFO: renamed from: ܽ */
    public final Long mo1096() throws IOException {
        byte[] bArr;
        char c;
        do {
            InputStream inputStream = this.f44385;
            bArr = this.f44391;
            c = 4;
            if (AbstractRunnableC0066.m1078(inputStream, bArr, 0, 4) < 4) {
                return null;
            }
        } while (bArr[0] == -123);
        if (AbstractRunnableC0066.m1078(this.f44385, bArr, 4, 32) < 32) {
            return null;
        }
        InterfaceC25186 interfaceC25186 = f44383;
        if (interfaceC25186.mo13713()) {
            interfaceC25186.mo13717("New data read: " + this);
            interfaceC25186.mo13717(C6033.m17504(bArr, 4, 32));
        }
        while (true) {
            byte b = bArr[0];
            if (b == 0 && bArr[c] == -2 && bArr[5] == 83 && bArr[6] == 77 && bArr[7] == 66) {
                this.f44400 = true;
                if (AbstractRunnableC0066.m1078(this.f44385, bArr, 36, 32) < 32) {
                    return null;
                }
                return Long.valueOf((((long) C20203.m46474(28, bArr)) & 4294967295L) | ((((long) C20203.m46474(32, bArr)) & 4294967295L) << 32));
            }
            if (b != 0 || bArr[1] != 0 || bArr[4] != -1 || bArr[5] != 83 || bArr[6] != 77 || bArr[7] != 66) {
                int i = 0;
                while (i < 35) {
                    interfaceC25186.mo13729("Possibly out of phase, trying to resync ".concat(C6033.m17504(bArr, 0, 16)));
                    int i2 = i + 1;
                    bArr[i] = bArr[i2];
                    i = i2;
                }
                int i3 = this.f44385.read();
                if (i3 == -1) {
                    return null;
                }
                bArr[35] = (byte) i3;
                c = 4;
            } else {
                return Long.valueOf(((long) C20203.m46472(34, bArr)) & 65535);
            }
        }
    }

    @Override // l.AbstractRunnableC0066
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC18315 mo1083(InterfaceC21299 interfaceC21299, InterfaceC18315 interfaceC18315, Set set) throws IOException {
        InterfaceC21299 interfaceC21299Mo12774;
        int i;
        InterfaceC18315 interfaceC18315Mo1726 = interfaceC18315;
        if (interfaceC21299 instanceof InterfaceC0416) {
            if (interfaceC18315Mo1726 == null) {
                interfaceC18315Mo1726 = ((InterfaceC0416) interfaceC21299).mo1726(this.f44394);
            } else if (m34133()) {
                throw new IOException("Should not provide response argument for SMB2");
            }
        } else if ((interfaceC21299 instanceof AbstractC6209) && (interfaceC18315Mo1726 instanceof AbstractC6209)) {
            AbstractC6209 abstractC6209 = (AbstractC6209) interfaceC21299;
            InterfaceC18315 interfaceC18315M17848 = interfaceC18315Mo1726;
            while (true) {
                AbstractC6209 abstractC62010 = (AbstractC6209) interfaceC18315M17848;
                abstractC6209.mo12766((InterfaceC18315) abstractC62010);
                AbstractC3971 abstractC3971M17848 = abstractC6209.m17848();
                if (abstractC3971M17848 == null) {
                    break;
                }
                interfaceC18315M17848 = abstractC62010.m17848();
                abstractC3971M17848.mo12766((InterfaceC18315) abstractC3971M17848);
                if (!(abstractC3971M17848 instanceof AbstractC6209) || !(interfaceC18315M17848 instanceof AbstractC6209)) {
                    break;
                }
                abstractC6209 = (AbstractC6209) abstractC3971M17848;
            }
        } else {
            interfaceC21299.mo12766(interfaceC18315);
        }
        if (interfaceC18315Mo1726 != null) {
            int iM35703 = ((C14826) this.f44394.mo2875()).m35703();
            InterfaceC21299 interfaceC212910 = interfaceC21299;
            while (true) {
                if (interfaceC212910 == null) {
                    interfaceC18315Mo1726 = interfaceC18315Mo1726;
                    break;
                }
                int i2 = 0;
                int i3 = 0;
                InterfaceC21299 interfaceC212911 = null;
                InterfaceC21299 interfaceC212912 = interfaceC212910;
                while (true) {
                    if (interfaceC212912 != null) {
                        int i4 = i2 + 1;
                        int size = interfaceC212912.size();
                        InterfaceC21299 interfaceC21299Mo12790 = interfaceC212912.mo12790();
                        InterfaceC25186 interfaceC25186 = f44383;
                        if (interfaceC25186.mo13713()) {
                            interfaceC25186.mo13717(String.format("%s costs %d avail %d (%s)", interfaceC212912.getClass().getName(), 1, Integer.valueOf(this.f44387.availablePermits()), this.f974));
                        }
                        if ((interfaceC21299Mo12790 == null || interfaceC212912.mo12778(interfaceC21299Mo12790)) && (i = i3 + size) < iM35703 && this.f44387.tryAcquire(1)) {
                            i3 = i;
                            interfaceC212911 = interfaceC212912;
                            interfaceC212912 = interfaceC21299Mo12790;
                            i2 = i4;
                            interfaceC18315Mo1726 = interfaceC18315Mo1726;
                        } else {
                            if (interfaceC212911 == null && i3 + size > iM35703) {
                                throw new C20728(String.format("Request size %d exceeds allowable size %d: %s", Integer.valueOf(size), Integer.valueOf(iM35703), interfaceC212912));
                            }
                            if (interfaceC212911 == null) {
                                try {
                                    long jMo1097 = mo1097(interfaceC212912);
                                    if (set.contains(EnumC13269.NO_TIMEOUT)) {
                                        this.f44387.acquire(1);
                                    } else if (!this.f44387.tryAcquire(1, jMo1097, TimeUnit.MILLISECONDS)) {
                                        throw new C20728("Failed to acquire credits in time");
                                    }
                                    synchronized (interfaceC212912) {
                                        interfaceC21299Mo12774 = interfaceC212912.mo12774();
                                        if (interfaceC25186.mo13707() && interfaceC21299Mo12774 != null) {
                                            interfaceC25186.mo13721("Insufficient credits, send only first " + interfaceC212912 + " next is " + interfaceC21299Mo12774);
                                        }
                                    }
                                } catch (InterruptedException e) {
                                    InterruptedIOException interruptedIOException = new InterruptedIOException("Interrupted while acquiring credits");
                                    interruptedIOException.initCause(e);
                                    throw interruptedIOException;
                                }
                            } else {
                                if (interfaceC25186.mo13707()) {
                                    interfaceC25186.mo13721("Not enough credits, split at " + interfaceC212911);
                                }
                                synchronized (interfaceC212911) {
                                    interfaceC21299Mo12774 = interfaceC212911.mo12774();
                                }
                            }
                            i2 = i4;
                        }
                    } else {
                        interfaceC18315Mo1726 = interfaceC18315Mo1726;
                        interfaceC21299Mo12774 = null;
                    }
                    int iMax = Math.max(1, ((512 - this.f44387.availablePermits()) - i2) + 1);
                    InterfaceC25186 interfaceC25187 = f44383;
                    if (interfaceC25187.mo13713()) {
                        interfaceC25187.mo13717("Request credits " + iMax);
                    }
                    interfaceC21299.mo12763(iMax);
                    try {
                        InterfaceC18315 interfaceC18315Mo1727 = interfaceC212910.mo1727();
                        if (interfaceC25187.mo13713()) {
                            interfaceC25187.mo13717("Sending " + interfaceC212910);
                        }
                        InterfaceC18315 interfaceC18316 = (InterfaceC18315) mo1083(interfaceC212910, interfaceC18315Mo1727, set);
                        if (!m34115(interfaceC212910)) {
                            if (interfaceC25187.mo13707()) {
                                interfaceC25187.mo13721("Breaking on error " + interfaceC18316);
                            }
                            int iMo12756 = 0;
                            while (true) {
                                if (interfaceC212910.mo12789()) {
                                    f44383.mo13717("Async");
                                    break;
                                }
                                InterfaceC18315 interfaceC18315Mo1728 = interfaceC212910.mo1727();
                                if (interfaceC18315Mo1728 == null) {
                                    f44383.mo13729("Response not properly set up for" + interfaceC212910);
                                } else if (interfaceC18315Mo1728.mo12784()) {
                                    iMo12756 = interfaceC18315Mo1728.mo12756() + iMo12756;
                                }
                                InterfaceC21299 interfaceC21299Mo12791 = interfaceC212910.mo12790();
                                if (interfaceC21299Mo12791 == null) {
                                    break;
                                }
                                interfaceC212910 = interfaceC21299Mo12791;
                            }
                            if (!mo1093() && !interfaceC212910.mo12789() && !interfaceC212910.mo1727().mo12755() && !interfaceC212910.mo1727().mo12788() && iMo12756 == 0) {
                                if (this.f44387.availablePermits() > 0 || i2 > 0) {
                                    f44383.mo13721("Server " + this + " returned zero credits for " + interfaceC212910);
                                    break;
                                }
                                f44383.mo13729("Server " + this + " took away all our credits");
                                break;
                            }
                            if (!interfaceC212910.mo12789()) {
                                InterfaceC25186 interfaceC25188 = f44383;
                                if (interfaceC25188.mo13713()) {
                                    interfaceC25188.mo13717("Adding credits " + iMo12756);
                                }
                                this.f44387.release(iMo12756);
                                break;
                            }
                            break;
                        }
                        if (interfaceC21299Mo12774 != null) {
                            interfaceC18316.mo12767(interfaceC21299Mo12774);
                        }
                        int iMo12757 = 0;
                        while (true) {
                            if (interfaceC212910.mo12789()) {
                                f44383.mo13717("Async");
                                break;
                            }
                            InterfaceC18315 interfaceC18315Mo1729 = interfaceC212910.mo1727();
                            if (interfaceC18315Mo1729 == null) {
                                f44383.mo13729("Response not properly set up for" + interfaceC212910);
                            } else if (interfaceC18315Mo1729.mo12784()) {
                                iMo12757 = interfaceC18315Mo1729.mo12756() + iMo12757;
                            }
                            InterfaceC21299 interfaceC21299Mo12792 = interfaceC212910.mo12790();
                            if (interfaceC21299Mo12792 == null) {
                                break;
                            }
                            interfaceC212910 = interfaceC21299Mo12792;
                        }
                        if (!mo1093() && !interfaceC212910.mo12789() && !interfaceC212910.mo1727().mo12755() && !interfaceC212910.mo1727().mo12788() && iMo12757 == 0) {
                            if (this.f44387.availablePermits() > 0 || i2 > 0) {
                                f44383.mo13721("Server " + this + " returned zero credits for " + interfaceC212910);
                            } else {
                                f44383.mo13729("Server " + this + " took away all our credits");
                            }
                        } else if (!interfaceC212910.mo12789()) {
                            InterfaceC25186 interfaceC25189 = f44383;
                            if (interfaceC25189.mo13713()) {
                                interfaceC25189.mo13717("Adding credits " + iMo12757);
                            }
                            this.f44387.release(iMo12757);
                        }
                        interfaceC212910 = interfaceC21299Mo12774;
                        interfaceC18315Mo1726 = interfaceC18315Mo1726;
                    } catch (Throwable th) {
                        int iMo12758 = 0;
                        while (true) {
                            if (interfaceC212910.mo12789()) {
                                f44383.mo13717("Async");
                                break;
                            }
                            InterfaceC18315 interfaceC18315Mo17210 = interfaceC212910.mo1727();
                            if (interfaceC18315Mo17210 == null) {
                                f44383.mo13729("Response not properly set up for" + interfaceC212910);
                            } else if (interfaceC18315Mo17210.mo12784()) {
                                iMo12758 = interfaceC18315Mo17210.mo12756() + iMo12758;
                            }
                            InterfaceC21299 interfaceC21299Mo12793 = interfaceC212910.mo12790();
                            if (interfaceC21299Mo12793 == null) {
                                break;
                            }
                            interfaceC212910 = interfaceC21299Mo12793;
                        }
                        if (!mo1093() && !interfaceC212910.mo12789() && !interfaceC212910.mo1727().mo12755() && !interfaceC212910.mo1727().mo12788() && iMo12758 == 0) {
                            if (this.f44387.availablePermits() > 0 || i2 > 0) {
                                f44383.mo13721("Server " + this + " returned zero credits for " + interfaceC212910);
                            } else {
                                f44383.mo13729("Server " + this + " took away all our credits");
                            }
                        } else if (!interfaceC212910.mo12789()) {
                            InterfaceC25186 interfaceC251810 = f44383;
                            if (interfaceC251810.mo13713()) {
                                interfaceC251810.mo13717("Adding credits " + iMo12758);
                            }
                            this.f44387.release(iMo12758);
                        }
                        throw th;
                    }
                }
            }
            if (interfaceC18315Mo1726.mo12784()) {
                return interfaceC18315Mo1726;
            }
            throw new IOException("No response", interfaceC18315Mo1726.getException());
        }
        throw new IOException("Invalid response");
    }

    @Override // l.AbstractRunnableC0066
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1088(InterfaceC21299 interfaceC21299, InterfaceC17965 interfaceC17965) {
        if (!this.f44400) {
            return false;
        }
        AbstractC20313 abstractC20313 = (AbstractC20313) interfaceC21299;
        AbstractC12108 abstractC12108 = (AbstractC12108) interfaceC17965;
        synchronized (abstractC12108) {
            if (!abstractC12108.m10303() || abstractC12108.m30279() || abstractC12108.m10323() != 259 || abstractC12108.m10338() == 0) {
                return false;
            }
            abstractC12108.m30281();
            boolean zM10303 = abstractC20313.m10303();
            abstractC20313.m10320(abstractC12108.m10338());
            if (abstractC12108.mo12777() != null) {
                abstractC12108.mo12765(Long.valueOf(System.currentTimeMillis() + ((long) mo1097(interfaceC21299))));
            }
            InterfaceC25186 interfaceC25186 = f44383;
            if (interfaceC25186.mo13707()) {
                interfaceC25186.mo13721("Have intermediate reply " + interfaceC17965);
            }
            if (!zM10303) {
                int iM10340 = abstractC12108.m10340();
                if (interfaceC25186.mo13707()) {
                    interfaceC25186.mo13721("Credit from intermediate " + iM10340);
                }
                this.f44387.release(iM10340);
            }
            return true;
        }
    }

    @Override // l.AbstractRunnableC0066
    /* JADX INFO: renamed from: ۙ */
    public final void mo1086(InterfaceC17965 interfaceC17965) throws Exception {
        InterfaceC14585 interfaceC14585 = (InterfaceC14585) interfaceC17965;
        this.f44389.mo11400(interfaceC17965);
        try {
            if (this.f44400) {
                m34113(interfaceC14585);
            } else {
                m34108(interfaceC14585);
            }
        } catch (Exception e) {
            f44383.mo13702("Failure decoding message, disconnecting transport", (Throwable) e);
            interfaceC17965.mo12764(e);
            synchronized (interfaceC17965) {
                interfaceC17965.notifyAll();
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m34113(InterfaceC14585 interfaceC14585) throws IOException {
        int iM46474;
        byte[] bArr = this.f44391;
        int iM46468 = (C20203.m46468(2, bArr) & HPKE.aead_EXPORT_ONLY) | ((bArr[1] & 255) << 16);
        if (iM46468 < 65) {
            throw new IOException(C13645.m33382(iM46468, "Invalid payload size: "));
        }
        int i = 0;
        if (bArr[0] != 0 || bArr[4] != -2 || bArr[5] != 83 || bArr[6] != 77 || bArr[7] != 66) {
            throw new IOException("Houston we have a synchronization problem");
        }
        int iM46475 = C20203.m46474(24, bArr);
        InterfaceC23032 interfaceC23032 = this.f44394;
        int iM35703 = ((C14826) interfaceC23032.mo2875()).m35703();
        int i2 = iM46475 != 0 ? iM46475 : iM46468;
        if (i2 > iM35703) {
            throw new IOException(String.format("Message size %d exceeds maxiumum buffer size %d", Integer.valueOf(i2), Integer.valueOf(iM35703)));
        }
        AbstractC12108 abstractC12108 = (AbstractC12108) interfaceC14585;
        byte[] bArrM18585 = interfaceC23032.mo2870().m18585();
        int i3 = iM46475 != 0 ? iM46475 : iM46468;
        int i4 = 64;
        try {
            System.arraycopy(bArr, 4, bArrM18585, 0, 64);
            AbstractRunnableC0066.m1078(this.f44385, bArrM18585, 64, i3 - 64);
            abstractC12108.m10301(i3);
            int iM10306 = abstractC12108.m10306(bArrM18585, 0, false);
            if (iM10306 > i3) {
                throw new IOException(String.format("WHAT? ( read %d decoded %d ): %s", Integer.valueOf(i3), Integer.valueOf(iM10306), abstractC12108));
            }
            char c = 1;
            if (iM46475 != 0 && iM10306 > iM46475) {
                throw new IOException("Overlapping commands");
            }
            int i5 = iM46468 - i3;
            int i6 = 2;
            while (true) {
                if (i5 > 0 && iM46475 != 0) {
                    abstractC12108 = (AbstractC12108) abstractC12108.m10334();
                    InterfaceC25186 interfaceC25186 = f44383;
                    if (abstractC12108 != null) {
                        AbstractRunnableC0066.m1078(this.f44385, bArrM18585, i, i4);
                        iM46474 = C20203.m46474(20, bArrM18585);
                        if ((iM46474 != 0 && iM46474 > iM35703) || (iM46474 == 0 && i5 > iM35703)) {
                            break;
                        }
                        int i7 = iM46474 != 0 ? iM46474 : i5;
                        if (interfaceC25186.mo13707()) {
                            Integer numValueOf = Integer.valueOf(iM46474);
                            Integer numValueOf2 = Integer.valueOf(i7);
                            Integer numValueOf3 = Integer.valueOf(i5);
                            Object[] objArr = new Object[3];
                            objArr[0] = numValueOf;
                            objArr[c] = numValueOf2;
                            objArr[2] = numValueOf3;
                            interfaceC25186.mo13721(String.format("Compound next command %d read size %d remain %d", objArr));
                        }
                        abstractC12108.m10301(i7);
                        AbstractRunnableC0066.m1078(this.f44385, bArrM18585, 64, i7 - 64);
                        int iM10307 = abstractC12108.m10306(bArrM18585, 0, true);
                        if (iM10307 > i7) {
                            throw new IOException(String.format("WHAT? ( read %d decoded %d ): %s", Integer.valueOf(i7), Integer.valueOf(iM10307), abstractC12108));
                        }
                        if (iM46474 != 0 && iM10307 > iM46474) {
                            throw new IOException("Overlapping commands");
                        }
                        i5 -= i7;
                        i6 = 2;
                        i = 0;
                        iM46475 = iM46474;
                        i4 = 64;
                        c = 1;
                    } else {
                        interfaceC25186.mo13729("Response not properly set up");
                        this.f44385.skip(i5);
                    }
                }
                interfaceC23032.mo2870().m18584(bArrM18585);
                return;
            }
            if (iM46474 != 0) {
                i5 = iM46474;
            }
            Integer numValueOf4 = Integer.valueOf(i5);
            Integer numValueOf5 = Integer.valueOf(iM35703);
            Object[] objArr2 = new Object[i6];
            objArr2[i] = numValueOf4;
            objArr2[c] = numValueOf5;
            throw new IOException(String.format("Message size %d exceeds maxiumum buffer size %d", objArr2));
        } catch (Throwable th) {
            interfaceC23032.mo2870().m18584(bArrM18585);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m34108(InterfaceC14585 interfaceC14585) {
        InterfaceC23032 interfaceC23032 = this.f44394;
        byte[] bArrM18585 = interfaceC23032.mo2870().m18585();
        try {
            System.arraycopy(this.f44391, 0, bArrM18585, 0, 36);
            int iM46468 = C20203.m46468(2, bArrM18585) & HPKE.aead_EXPORT_ONLY;
            if (iM46468 < 33 || iM46468 + 4 > Math.min(65535, ((C14826) interfaceC23032.mo2875()).m35703())) {
                throw new IOException("Invalid payload size: " + iM46468);
            }
            int iM46474 = C20203.m46474(9, bArrM18585);
            if (interfaceC14585.mo10330() == 46 && (iM46474 == 0 || iM46474 == -2147483643)) {
                C13445 c13445 = (C13445) interfaceC14585;
                AbstractRunnableC0066.m1078(this.f44385, bArrM18585, 36, 27);
                interfaceC14585.decode(bArrM18585);
                int iM33087 = c13445.m33087() - 59;
                if (c13445.m12770() > 0 && iM33087 > 0 && iM33087 < 4) {
                    AbstractRunnableC0066.m1078(this.f44385, bArrM18585, 63, iM33087);
                }
                if (c13445.m33089() > 0) {
                    AbstractRunnableC0066.m1078(this.f44385, c13445.m33088(), c13445.m33090(), c13445.m33089());
                }
            } else {
                AbstractRunnableC0066.m1078(this.f44385, bArrM18585, 36, iM46468 - 32);
                interfaceC14585.decode(bArrM18585);
            }
            interfaceC23032.mo2870().m18584(bArrM18585);
        } catch (Throwable th) {
            interfaceC23032.mo2870().m18584(bArrM18585);
            throw th;
        }
    }

    @Override // l.AbstractRunnableC0066
    /* JADX INFO: renamed from: ۙ */
    public final void mo1085(Long l2) {
        synchronized (this.f971) {
            int iM46468 = C20203.m46468(2, this.f44391) & HPKE.aead_EXPORT_ONLY;
            if (iM46468 < 33 || iM46468 + 4 > ((C14826) this.f44394.mo2875()).m35714()) {
                f44383.mo13729("Flusing stream input");
                InputStream inputStream = this.f44385;
                inputStream.skip(inputStream.available());
            } else {
                InterfaceC23032 interfaceC23032 = this.f44394;
                byte[] bArr = this.f44391;
                InterfaceC17965 c9190 = null;
                if (this.f44400) {
                    if (l2.longValue() == -1 && (65535 & C20203.m46472(16, bArr)) == 18) {
                        c9190 = new C11667(interfaceC23032.mo2875());
                    }
                } else if (l2.longValue() == 65535 && bArr[8] == 36) {
                    c9190 = new C9190(interfaceC23032.mo2875());
                }
                if (c9190 != null) {
                    InterfaceC25186 interfaceC25186 = f44383;
                    interfaceC25186.mo13721("Parsing notification");
                    mo1086(c9190);
                    interfaceC25186.mo13709("Received notification " + c9190);
                    return;
                }
                f44383.mo13729("Skipping message " + l2);
                if (m34133()) {
                    this.f44385.skip(iM46468 - 64);
                } else {
                    this.f44385.skip(iM46468 - 32);
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:18:0x006c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0080  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m34125(AbstractC3971 abstractC3971, AbstractC3971 abstractC3972) throws C20728 {
        boolean z;
        if (abstractC3972.getErrorCode() == 196610) {
            abstractC3972.m12782(-1073741225);
        } else {
            abstractC3972.m12782(C20728.m47407(abstractC3972.getErrorCode()));
        }
        int errorCode = abstractC3972.getErrorCode();
        if (errorCode != 0) {
            switch (errorCode) {
                case -2147483643:
                case -1073741802:
                    z = false;
                    break;
                case -1073741790:
                case -1073741718:
                case -1073741428:
                case -1073741260:
                    throw new C16252(abstractC3972.getErrorCode());
                case -1073741662:
                case -1073741225:
                    m34109(abstractC3972, abstractC3971.getPath(), abstractC3971);
                    throw null;
                case -1073741637:
                    throw new C5287();
                case 0:
                    z = true;
                    break;
                default:
                    switch (errorCode) {
                        case -1073741715:
                        case -1073741714:
                        case -1073741713:
                        case -1073741712:
                        case -1073741711:
                        case -1073741710:
                            throw new C16252(abstractC3972.getErrorCode());
                        default:
                            InterfaceC25186 interfaceC25186 = f44383;
                            if (interfaceC25186.mo13707()) {
                                interfaceC25186.mo13721("Error code: 0x" + C6033.m17503(abstractC3972.getErrorCode(), 8) + " for " + abstractC3971.getClass().getSimpleName());
                            }
                            throw new C20728(abstractC3972.getErrorCode());
                    }
            }
        } else {
            z = true;
        }
        if (abstractC3972.mo12780()) {
            throw new C20728("Signature verification failed.");
        }
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m34109(InterfaceC18315 interfaceC18315, String str, InterfaceC7874 interfaceC7874) throws C20728 {
        InterfaceC23032 interfaceC23032 = this.f44394;
        interfaceC23032.mo2875().getClass();
        try {
            C13839 c13839M34122 = m34122(this.f44394, str, interfaceC7874.mo1462(), interfaceC7874.mo1471(), 1);
            InterfaceC25186 interfaceC25186 = f44383;
            if (c13839M34122 == null) {
                if (interfaceC25186.mo13707()) {
                    interfaceC25186.mo13721("Error code: 0x".concat(C6033.m17503(interfaceC18315.getErrorCode(), 8)));
                }
                throw new C20728(interfaceC18315.getErrorCode());
            }
            if (interfaceC7874.mo1471() != null) {
                interfaceC23032.mo2875().getClass();
            }
            if (interfaceC25186.mo13707()) {
                interfaceC25186.mo13721("Got referral " + c13839M34122);
            }
            ((C21562) interfaceC23032.mo2876()).m49038(interfaceC23032, str, c13839M34122);
            throw new C18578(c13839M34122);
        } catch (C20048 e) {
            throw new C20728("Failed to get DFS referral", e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34124(InterfaceC21299 interfaceC21299, AbstractC3971 abstractC3971) throws C20728 {
        m34135(interfaceC21299, abstractC3971, Collections.EMPTY_SET);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC18315 m34135(InterfaceC21299 interfaceC21299, InterfaceC18315 interfaceC18315, Set set) throws C20728 {
        m34136();
        boolean z = this.f44400;
        if (z && !(interfaceC21299 instanceof AbstractC3159)) {
            throw new C20728("Not an SMB2 request ".concat(interfaceC21299.getClass().getName()));
        }
        if (!z && !(interfaceC21299 instanceof AbstractC3971)) {
            throw new C20728("Not an SMB1 request");
        }
        this.f44389.mo11415(interfaceC21299);
        if (interfaceC18315 != null) {
            interfaceC21299.mo12766(interfaceC18315);
            interfaceC18315.mo10310(interfaceC21299.getDigest());
        }
        try {
            InterfaceC25186 interfaceC25186 = f44383;
            if (interfaceC25186.mo13713()) {
                interfaceC25186.mo13717("Sending " + interfaceC21299);
            }
            interfaceC21299.getClass();
            if (interfaceC21299 instanceof AbstractC10461) {
                m34110(interfaceC21299, interfaceC18315, set);
            } else {
                if (interfaceC18315 != null) {
                    interfaceC18315.mo10331(interfaceC21299.mo10330());
                }
                interfaceC18315 = mo1083(interfaceC21299, interfaceC18315, set);
            }
            if (interfaceC25186.mo13713()) {
                interfaceC25186.mo13717("Response is " + interfaceC18315);
            }
            m34115(interfaceC21299);
            return interfaceC18315;
        } catch (C20728 e) {
            throw e;
        } catch (IOException e2) {
            throw new C20728(e2.getMessage(), e2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x006b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x006e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x00c3 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private boolean m34115(InterfaceC21299 interfaceC21299) throws C20728 {
        InterfaceC14235 interfaceC14235;
        InterfaceC18315 interfaceC18315Mo1727;
        int iM51575;
        while (true) {
            boolean z = true;
            if (interfaceC21299 == null) {
                return true;
            }
            if (this.f44400) {
                interfaceC14235 = (AbstractC3159) interfaceC21299;
                interfaceC18315Mo1727 = interfaceC21299.mo1727();
                switch (interfaceC18315Mo1727.getErrorCode()) {
                    case -2147483643:
                        if (!(interfaceC18315Mo1727 instanceof C13599) && (!(interfaceC18315Mo1727 instanceof C22856) || ((iM51575 = ((C22856) interfaceC18315Mo1727).m51575()) != 1163287 && iM51575 != 1130508))) {
                        }
                        z = false;
                        if (interfaceC18315Mo1727.mo12780()) {
                            throw new C25204("Signature verification failed.");
                        }
                        if (!z) {
                            return false;
                        }
                        interfaceC21299 = interfaceC21299.mo12790();
                        break;
                    case -2147483642:
                    case 0:
                        if (interfaceC18315Mo1727.mo12780()) {
                            throw new C25204("Signature verification failed.");
                        }
                        if (!z) {
                            return false;
                        }
                        interfaceC21299 = interfaceC21299.mo12790();
                        break;
                        break;
                    case -1073741808:
                    case -1073741637:
                        throw new C5287();
                    case -1073741802:
                    case 259:
                    case 267:
                    case 268:
                        z = false;
                        if (interfaceC18315Mo1727.mo12780()) {
                            throw new C25204("Signature verification failed.");
                        }
                        if (!z) {
                            return false;
                        }
                        interfaceC21299 = interfaceC21299.mo12790();
                        break;
                        break;
                    case -1073741790:
                    case -1073741718:
                    case -1073741715:
                    case -1073741714:
                    case -1073741713:
                    case -1073741712:
                    case -1073741711:
                    case -1073741710:
                    case -1073741428:
                    case -1073741260:
                        throw new C16252(interfaceC18315Mo1727.getErrorCode());
                    case -1073741225:
                        if (!(interfaceC14235 instanceof InterfaceC7874)) {
                            throw new C20728("Invalid request for a DFS NT_STATUS_PATH_NOT_COVERED response ".concat(interfaceC14235.getClass().getName()));
                        }
                        InterfaceC7874 interfaceC7874 = (InterfaceC7874) interfaceC14235;
                        m34109(interfaceC18315Mo1727, interfaceC7874.mo1460(), interfaceC7874);
                        throw null;
                    default:
                        break;
                }
            } else {
                if (!m34125((AbstractC3971) interfaceC21299, (AbstractC3971) interfaceC21299.mo1727())) {
                    return false;
                }
                interfaceC21299 = interfaceC21299.mo12790();
            }
        }
        InterfaceC25186 interfaceC25186 = f44383;
        if (interfaceC25186.mo13707()) {
            interfaceC25186.mo13721("Error code: 0x" + C6033.m17503(interfaceC18315Mo1727.getErrorCode(), 8) + " for " + interfaceC14235.getClass().getSimpleName());
        }
        throw new C20728(interfaceC18315Mo1727.getErrorCode());
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m34110(InterfaceC21299 interfaceC21299, InterfaceC18315 interfaceC18315, Set set) {
        long jMo1091;
        interfaceC18315.mo10331(interfaceC21299.mo10330());
        AbstractC10461 abstractC10461 = (AbstractC10461) interfaceC21299;
        AbstractC1513 abstractC1513 = (AbstractC1513) interfaceC18315;
        abstractC1513.reset();
        try {
            try {
                abstractC10461.m26886(this.f44394.mo2870().m18585());
                abstractC10461.nextElement();
                if (abstractC10461.hasMoreElements()) {
                    AbstractC3971 c18141 = new C18141(this.f44394.mo2875());
                    mo1083((InterfaceC21299) abstractC10461, (InterfaceC18315) c18141, set);
                    if (c18141.getErrorCode() != 0) {
                        m34125((AbstractC3971) abstractC10461, c18141);
                    }
                    abstractC10461.nextElement();
                    jMo1091 = abstractC10461.mo12771();
                } else {
                    jMo1091 = mo1091(abstractC10461);
                }
                long j = jMo1091;
                try {
                    abstractC1513.mo12751();
                    long jMo1097 = mo1097((InterfaceC21299) abstractC10461);
                    if (set.contains(EnumC13269.NO_TIMEOUT)) {
                        abstractC1513.mo12765((Long) null);
                    } else {
                        abstractC1513.mo12765(Long.valueOf(System.currentTimeMillis() + jMo1097));
                    }
                    abstractC1513.m5373(this.f44394.mo2870().m18585());
                    this.f967.put(Long.valueOf(j), abstractC1513);
                    while (true) {
                        InterfaceC25186 interfaceC25186 = f44383;
                        try {
                            mo1087((InterfaceC21299) abstractC10461);
                            if (!abstractC10461.hasMoreElements()) {
                                break;
                            } else {
                                abstractC10461.nextElement();
                            }
                        } catch (IOException e) {
                            interfaceC25186.mo13702("send failed", (Throwable) e);
                            try {
                                m1098();
                            } catch (IOException e2) {
                                e.addSuppressed(e2);
                                interfaceC25186.mo13724("disconnect failed", (Throwable) e2);
                            }
                            throw e;
                        }
                    }
                    synchronized (abstractC1513) {
                        while (true) {
                            if (abstractC1513.mo12784() && !abstractC1513.hasMoreElements()) {
                            }
                            if (set.contains(EnumC13269.NO_TIMEOUT)) {
                                abstractC1513.wait();
                                InterfaceC25186 interfaceC25187 = f44383;
                                if (interfaceC25187.mo13713()) {
                                    interfaceC25187.mo13717("Wait returned " + mo1093());
                                }
                                if (mo1093()) {
                                    throw new EOFException("Transport closed while waiting for result");
                                }
                            } else {
                                abstractC1513.wait(jMo1097);
                                jMo1097 = abstractC1513.mo12777().longValue() - System.currentTimeMillis();
                                if (jMo1097 <= 0) {
                                    throw new C7524(this + " timedout waiting for response to " + abstractC10461);
                                }
                            }
                        }
                    }
                    if (!abstractC1513.mo12784()) {
                        throw new C7524("Failed to read response");
                    }
                    if (abstractC1513.getErrorCode() != 0) {
                        m34125((AbstractC3971) abstractC10461, (AbstractC3971) abstractC1513);
                    }
                    this.f967.remove(Long.valueOf(j));
                    this.f44394.mo2870().m18584(abstractC1513.m5371());
                    this.f44394.mo2870().m18584(abstractC10461.m26883());
                } catch (Throwable th) {
                    this.f967.remove(Long.valueOf(j));
                    this.f44394.mo2870().m18584(abstractC1513.m5371());
                    throw th;
                }
            } catch (InterruptedException e3) {
                throw new C7524(e3);
            }
        } catch (Throwable th2) {
            this.f44394.mo2870().m18584(abstractC10461.m26883());
            throw th2;
        }
    }

    @Override // l.AbstractRunnableC0066
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[");
        sb.append(this.f44388);
        sb.append(":");
        sb.append(this.f44397);
        sb.append(",state=");
        sb.append(this.f969);
        sb.append(",signingEnforced=");
        sb.append(this.f44390);
        sb.append(",usage=");
        return C2764.m9137(sb, m1094(), "]");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13839 m34122(InterfaceC23032 interfaceC23032, String str, String str2, String str3, int i) {
        C10682 c10682M16080;
        String str4 = str;
        int iM27231 = i;
        InterfaceC25186 interfaceC25186 = f44383;
        if (interfaceC25186.mo13707()) {
            interfaceC25186.mo13721("Resolving DFS path " + str4);
        }
        int i2 = 0;
        if (str.length() >= 2 && str4.charAt(0) == '\\' && str4.charAt(1) == '\\') {
            throw new C20728("Path must not start with double slash: ".concat(str4));
        }
        C8794 c8794M34121 = m34121(interfaceC23032, str2, str3);
        try {
            C14014 c14014M23613 = c8794M34121.m23613();
            try {
                C12744 c12744M23601 = c8794M34121.m23601("IPC$");
                try {
                    C21871 c21871 = new C21871(str4);
                    if (m34133()) {
                        C10921 c10921 = new C10921(interfaceC23032.mo2875(), 393620);
                        c10921.m27717();
                        c10921.m27716(c21871);
                        c10682M16080 = (C10682) ((C22856) c12744M23601.m31565(c10921, new EnumC13269[0])).m51576(C10682.class);
                    } else {
                        C5397 c5397 = new C5397(interfaceC23032.mo2875());
                        c12744M23601.m31567(new C12854(str4, interfaceC23032.mo2875()), c5397, Collections.EMPTY_SET);
                        c10682M16080 = c5397.m16080();
                    }
                    C13839 c13839 = null;
                    if (c10682M16080.m27231() == 0) {
                        c12744M23601.m31578();
                        c14014M23613.m1095();
                        c8794M34121.m23611();
                        return null;
                    }
                    if (iM27231 == 0 || c10682M16080.m27231() < iM27231) {
                        iM27231 = c10682M16080.m27231();
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis() + (((C14826) interfaceC23032.mo2875()).m35725() * 1000);
                    C22617[] c22617ArrM27233 = c10682M16080.m27233();
                    while (i2 < iM27231) {
                        C13839 c13839M33790 = C13839.m33790(c22617ArrM27233[i2], str4, jCurrentTimeMillis, c10682M16080.m27234());
                        c13839M33790.m33791(str3);
                        if ((c10682M16080.m27232() & 2) == 0 && (c13839M33790.m33794() & 2) == 0) {
                            interfaceC25186.mo13721("Non-root referral is not final " + c10682M16080);
                            c13839M33790.m33795();
                        }
                        if (c13839 != null) {
                            c13839.m33793(c13839M33790);
                        }
                        i2++;
                        str4 = str;
                        c13839 = c13839M33790;
                    }
                    if (interfaceC25186.mo13707()) {
                        interfaceC25186.mo13721("Got referral " + c13839);
                    }
                    c12744M23601.m31578();
                    c14014M23613.m1095();
                    c8794M34121.m23611();
                    return c13839;
                } catch (Throwable th) {
                    try {
                        c12744M23601.m31578();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                c14014M23613.m1095();
                throw th3;
            }
            try {
                c14014M23613.m1095();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        } catch (Throwable th5) {
            try {
                c8794M34121.m23611();
                throw th5;
            } catch (Throwable th6) {
                th5.addSuppressed(th6);
                throw th5;
            }
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final byte[] m34132() {
        return this.f44393;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m34114(byte[] bArr) {
        synchronized (this.f44393) {
            this.f44393 = m34127(bArr.length, bArr, this.f44393);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m34127(int i, byte[] bArr, byte[] bArr2) throws C5287 {
        InterfaceC8619 interfaceC8619;
        if (!this.f44400 || (interfaceC8619 = this.f44389) == null) {
            throw new C5287();
        }
        C3464 c3464 = (C3464) interfaceC8619;
        if (!c3464.mo11409().m56406(EnumC25270.SMB311)) {
            throw new C5287();
        }
        if (c3464.m11399() == 1) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(XMSSKeyParameters.SHA_512);
                if (bArr2 != null) {
                    messageDigest.update(bArr2);
                }
                messageDigest.update(bArr, 0, i);
                return messageDigest.digest();
            } catch (NoSuchAlgorithmException e) {
                throw new C15572(e);
            }
        }
        throw new C5287();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m34119(C3464 c3464) {
        if (this.f44390) {
            return 3;
        }
        return (c3464 == null || !c3464.mo11413()) ? 1 : 3;
    }
}
