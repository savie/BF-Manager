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

/* JADX INFO: renamed from: l.ۘۤ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: YA21 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3875 extends AbstractRunnableC3170 implements InterfaceC6698 {

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC4314 f14483 = C13488.m32997(C3875.class);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC18361 f14485;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public OutputStream f14486;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public InterfaceC5619 f14487;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public InputStream f14489;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public int f14490;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public final boolean f14491;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC4207 f14493;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public long f14494;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public Socket f14496;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19067 f14497;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public boolean f14500 = false;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final AtomicLong f14495 = new AtomicLong();

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f14484 = new byte[1024];

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final LinkedList f14488 = new LinkedList();

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public String f14498 = null;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final Semaphore f14492 = new Semaphore(1, true);

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f14499 = new byte[64];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C1053 m11233(InterfaceC19067 interfaceC19067, String str, String str2) {
        InterfaceC4314 interfaceC4314 = f14483;
        if (interfaceC4314.mo12133()) {
            interfaceC4314.mo12127("Currently " + this.f14488.size() + " session(s) active for " + this);
        }
        if (str != null) {
            str = str.toLowerCase(Locale.ROOT);
        }
        if (str2 != null) {
            str2 = str2.toUpperCase(Locale.ROOT);
        }
        ListIterator listIterator = this.f14488.listIterator();
        while (listIterator.hasNext()) {
            C1053 c1053 = (C1053) listIterator.next();
            if (c1053.m3978(interfaceC19067, str, str2)) {
                InterfaceC4314 interfaceC4315 = f14483;
                if (interfaceC4315.mo12133()) {
                    interfaceC4315.mo12127("Reusing existing session " + c1053);
                }
                c1053.m3977();
                return c1053;
            }
            InterfaceC4314 interfaceC4316 = f14483;
            if (interfaceC4316.mo12133()) {
                interfaceC4316.mo12127("Existing session " + c1053 + " does not match " + interfaceC19067.mo13093());
            }
        }
        if (((C9895) interfaceC19067.mo29449()).m25050() > 0) {
            long j = this.f14494;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (j < jCurrentTimeMillis) {
                this.f14494 = ((long) ((C9895) interfaceC19067.mo29449()).m25050()) + jCurrentTimeMillis;
                ListIterator listIterator2 = this.f14488.listIterator();
                while (listIterator2.hasNext()) {
                    C1053 c1054 = (C1053) listIterator2.next();
                    if (c1054.m3971() != null && c1054.m3971().longValue() < jCurrentTimeMillis && !c1054.m3987()) {
                        InterfaceC4314 interfaceC4317 = f14483;
                        if (interfaceC4317.mo12125()) {
                            interfaceC4317.mo12135("Closing session after timeout " + c1054);
                        }
                        c1054.m3979(false, false);
                    }
                }
            }
        }
        C1053 c1055 = new C1053(interfaceC19067, str, str2, this);
        InterfaceC4314 interfaceC4318 = f14483;
        if (interfaceC4318.mo12125()) {
            interfaceC4318.mo12135("Establishing new session " + c1055 + " on " + this.f11929);
        }
        this.f14488.add(c1055);
        return c1055;
    }

    @Override // l.AbstractRunnableC3170
    /* JADX INFO: renamed from: ܰ */
    public final synchronized boolean mo9588(boolean z, boolean z2) {
        boolean zM3979;
        InterfaceC19067 interfaceC19067;
        ListIterator listIterator = this.f14488.listIterator();
        long jM9591 = m9591();
        if ((!z2 || jM9591 == 1) && (z2 || jM9591 <= 0)) {
            zM3979 = false;
        } else {
            f14483.mo12116("Disconnecting transport while still in use " + this + ": " + this.f14488);
            zM3979 = true;
        }
        InterfaceC4314 interfaceC4314 = f14483;
        if (interfaceC4314.mo12125()) {
            interfaceC4314.mo12135("Disconnecting transport " + this);
        }
        try {
            try {
                if (interfaceC4314.mo12133()) {
                    interfaceC4314.mo12127("Currently " + this.f14488.size() + " session(s) active for " + this);
                }
                while (listIterator.hasNext()) {
                    try {
                        try {
                            zM3979 |= ((C1053) listIterator.next()).m3979(z, false);
                        } catch (Throwable th) {
                            listIterator.remove();
                            throw th;
                        }
                    } catch (Exception e) {
                        f14483.mo12120("Failed to close session", e);
                    }
                    listIterator.remove();
                }
                Socket socket = this.f14496;
                if (socket != null) {
                    socket.shutdownOutput();
                    this.f14486.close();
                    this.f14489.close();
                    this.f14496.close();
                    f14483.mo12127("Socket closed");
                } else {
                    f14483.mo12127("Not yet initialized");
                }
                this.f14496 = null;
                this.f14487 = null;
                this.f14498 = null;
                interfaceC19067 = this.f14497;
            } catch (Exception e2) {
                f14483.mo12120("Exception in disconnect", e2);
                this.f14496 = null;
                this.f14487 = null;
                this.f14498 = null;
                interfaceC19067 = this.f14497;
            }
            ((C15166) interfaceC19067.mo29452()).m36380(this);
        } catch (Throwable th2) {
            this.f14496 = null;
            this.f14487 = null;
            this.f14498 = null;
            ((C15166) this.f14497.mo29452()).m36380(this);
            throw th2;
        }
        return zM3979;
    }

    public C3875(InterfaceC19067 interfaceC19067, InterfaceC18361 interfaceC18361, int i, boolean z) {
        boolean z2 = false;
        this.f14497 = interfaceC19067;
        if (z) {
            z2 = true;
        } else {
            interfaceC19067.mo29449().getClass();
        }
        this.f14491 = z2;
        this.f14494 = System.currentTimeMillis() + ((long) ((C9895) interfaceC19067.mo29449()).m25050());
        this.f14485 = interfaceC18361;
        this.f14490 = i;
    }

    @Override // l.AbstractRunnableC3170
    /* JADX INFO: renamed from: ܰ */
    public final int mo9586(InterfaceC3314 interfaceC3314) {
        if (interfaceC3314 != null) {
            interfaceC3314.getClass();
        }
        return ((C9895) this.f14497.mo29449()).m25042();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18361 m11247() {
        return this.f14485;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String m11244() {
        return this.f14498;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int m11250() {
        return this.f14488.size();
    }

    @Override // l.AbstractRunnableC3170
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo9573() {
        Socket socket = this.f14496;
        return super.mo9573() || socket == null || socket.isClosed();
    }

    @Override // l.AbstractRunnableC3170
    /* JADX INFO: renamed from: ۬ */
    public final boolean mo9585() {
        Socket socket = this.f14496;
        return super.mo9585() || socket == null || socket.isClosed();
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4207 m11246() throws C12303 {
        try {
            if (this.f14493 == null) {
                m9587(((C9895) this.f14497.mo29449()).m25042());
            }
            InterfaceC4207 interfaceC4207 = this.f14493;
            if (interfaceC4207 != null) {
                return interfaceC4207;
            }
            throw new C12303("Connection did not complete, failed to get negotiation response");
        } catch (IOException e) {
            throw new C12303(e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m11248() {
        return this.f14500 || (m11246() instanceof C12282);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11237(InterfaceC5619 interfaceC5619) {
        this.f14487 = interfaceC5619;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final InterfaceC5619 m11241() {
        return this.f14487;
    }

    public final InterfaceC19067 getContext() {
        return this.f14497;
    }

    @Override // l.AbstractRunnableC3170
    /* JADX INFO: renamed from: ۙ */
    public final void mo9579(InterfaceC3314 interfaceC3314) {
        InterfaceC4314 interfaceC4314;
        byte[] bArrM28137 = this.f14497.mo29448().m28137();
        try {
            synchronized (this.f11922) {
                int iMo24565 = interfaceC3314.mo24565(4, bArrM28137);
                C12344.m30664(65535 & iMo24565, 0, bArrM28137);
                if (f14483.mo12133()) {
                    do {
                        interfaceC4314 = f14483;
                        interfaceC4314.mo12127(interfaceC3314.toString());
                        if (!(interfaceC3314 instanceof AbstractC11264)) {
                            break;
                        } else {
                            interfaceC3314 = ((AbstractC11264) interfaceC3314).m28229();
                        }
                    } while (interfaceC3314 != null);
                    interfaceC4314.mo12127(C5993.m16281(bArrM28137, 4, iMo24565));
                }
                this.f14486.write(bArrM28137, 0, iMo24565 + 4);
                this.f14486.flush();
            }
            this.f14497.mo29448().m28136(bArrM28137);
        } catch (Throwable th) {
            this.f14497.mo29448().m28136(bArrM28137);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m11231() throws C12303 {
        if (this.f14491) {
            return false;
        }
        InterfaceC4207 interfaceC4207M11246 = m11246();
        return interfaceC4207M11246.mo11872() && !interfaceC4207M11246.mo11873();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m11243() {
        if (this.f14491) {
            return true;
        }
        return m11246().mo11873();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6698 m11234(Class cls) {
        if (cls.isAssignableFrom(C3875.class)) {
            return this;
        }
        throw new ClassCastException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m11239(InterfaceC18361 interfaceC18361, int i, String str) {
        int i2;
        if (this.f11925 == 5 || this.f11925 == 6) {
            return false;
        }
        if (str == null) {
            str = interfaceC18361.mo36921();
        }
        String str2 = this.f14498;
        if ((str2 != null && !str.equalsIgnoreCase(str2)) || !interfaceC18361.equals(this.f14485)) {
            return false;
        }
        if (i == 0 || i == (i2 = this.f14490)) {
            return true;
        }
        return i == 445 && i2 == 139;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m11242() throws IOException {
        String strMo36918;
        InterfaceC19067 interfaceC19067 = this.f14497;
        InterfaceC10601 interfaceC10601Mo29449 = interfaceC19067.mo29449();
        InterfaceC18361 interfaceC18361 = this.f14485;
        C11907 c11907 = new C11907(interfaceC10601Mo29449, interfaceC18361.mo36916(), 32, null);
        do {
            Socket socket = new Socket();
            this.f14496 = socket;
            socket.connect(new InetSocketAddress(interfaceC18361.mo36917(), 139), ((C9895) interfaceC19067.mo29449()).m25051());
            this.f14496.setSoTimeout(((C9895) interfaceC19067.mo29449()).m25068());
            this.f14486 = this.f14496.getOutputStream();
            this.f14489 = this.f14496.getInputStream();
            C8379 c8379 = new C8379(interfaceC19067.mo29449(), c11907, ((RunnableC6967) interfaceC19067.mo29450()).m18720());
            OutputStream outputStream = this.f14486;
            byte[] bArr = this.f14484;
            outputStream.write(bArr, 0, c8379.m22008(bArr));
            int iM9570 = AbstractRunnableC3170.m9570(this.f14489, bArr, 0, 4);
            InterfaceC4314 interfaceC4314 = f14483;
            if (iM9570 < 4) {
                try {
                    this.f14496.close();
                } catch (IOException e) {
                    interfaceC4314.mo12120("Failed to close socket", (Exception) e);
                }
                throw new C12303("EOF during NetBIOS session request");
            }
            int i = bArr[0] & 255;
            if (i == -1) {
                m9584();
                throw new C21784(-1);
            }
            if (i == 130) {
                if (interfaceC4314.mo12125()) {
                    interfaceC4314.mo12135("session established ok with " + interfaceC18361);
                    return;
                }
                return;
            }
            if (i == 131) {
                int i2 = this.f14489.read() & 255;
                if (i2 == 128 || i2 == 130) {
                    this.f14496.close();
                    strMo36918 = interfaceC18361.mo36918(interfaceC19067);
                    c11907.f39950 = strMo36918;
                } else {
                    m9584();
                    throw new C21784(i2);
                }
            } else {
                m9584();
                throw new C21784(0);
            }
        } while (strMo36918 != null);
        throw new IOException("Failed to establish session with " + interfaceC18361);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C1385 m11223(int i) {
        synchronized (this.f11926) {
            try {
                if (i == 139) {
                    m11242();
                } else {
                    if (i == 0) {
                        i = 445;
                    }
                    Socket socket = new Socket();
                    this.f14496 = socket;
                    socket.connect(new InetSocketAddress(this.f14485.mo36917(), i), ((C9895) this.f14497.mo29449()).m25051());
                    this.f14496.setSoTimeout(((C9895) this.f14497.mo29449()).m25068());
                    this.f14486 = this.f14496.getOutputStream();
                    this.f14489 = this.f14496.getInputStream();
                }
                if (this.f14492.drainPermits() == 0) {
                    f14483.mo12135("It appears we previously lost some credits");
                }
                if (this.f14500) {
                    f14483.mo12135("Using SMB2 only negotiation");
                    return m11227((C12282) null);
                }
                this.f14497.mo29449().getClass();
                C6925 c6925 = new C6925(this.f14497.mo29449(), this.f14491);
                int iM11222 = m11222((InterfaceC3314) c6925, true);
                m11221();
                if (this.f14500) {
                    C12282 c12282 = new C12282(this.f14497.mo29449());
                    c12282.m31345(this.f14484, 4, false);
                    c12282.mo17296();
                    if (c12282.m30520() == 767) {
                        return m11227(c12282);
                    }
                    if (c12282.m30520() != 514) {
                        throw new C8484("Server returned invalid dialect verison in multi protocol negotiation");
                    }
                    int iM31342 = c12282.m31342();
                    if (iM31342 > 0) {
                        this.f14492.release(iM31342);
                    }
                    Arrays.fill(this.f14484, (byte) 0);
                    return new C1385(new C16515(this.f14497.mo29449(), this.f14491 ? 2 : 1), c12282, null, null);
                }
                if (((C9895) this.f14497.mo29449()).m25058().m38367()) {
                    throw new C8484("Server does not support SMB2");
                }
                C23154 c23154 = new C23154(this.f14497);
                c23154.decode(this.f14484);
                c23154.mo17296();
                InterfaceC4314 interfaceC4314 = f14483;
                if (interfaceC4314.mo12133()) {
                    interfaceC4314.mo12127(c23154.toString());
                    interfaceC4314.mo12127(C5993.m16281(this.f14484, 4, iM11222));
                }
                int iM51152 = c23154.m51152();
                if (iM51152 > 0) {
                    this.f14492.release(iM51152);
                }
                Arrays.fill(this.f14484, (byte) 0);
                return new C1385(c6925, c23154, null, null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m11222(InterfaceC3314 interfaceC3314, boolean z) throws IOException {
        if (z) {
            mo9583(interfaceC3314);
        } else {
            interfaceC3314.mo24566(0L);
            this.f14495.set(1L);
        }
        byte[] bArr = this.f14484;
        int iMo24565 = interfaceC3314.mo24565(4, bArr);
        C12344.m30664(65535 & iMo24565, 0, bArr);
        InterfaceC4314 interfaceC4314 = f14483;
        if (interfaceC4314.mo12133()) {
            interfaceC4314.mo12127(interfaceC3314.toString());
            interfaceC4314.mo12127(C5993.m16281(bArr, 4, iMo24565));
        }
        this.f14486.write(bArr, 0, iMo24565 + 4);
        this.f14486.flush();
        interfaceC4314.mo12127("Wrote negotiate request");
        return iMo24565;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    private void m11221() throws IOException {
        InterfaceC19067 interfaceC19067 = this.f14497;
        try {
            this.f14496.setSoTimeout(((C9895) interfaceC19067.mo29449()).m25051());
            if (mo9590() == null) {
                throw new IOException("transport closed in negotiate");
            }
            this.f14496.setSoTimeout(((C9895) interfaceC19067.mo29449()).m25068());
            byte[] bArr = this.f14484;
            int iM30663 = C12344.m30663(2, bArr) & HPKE.aead_EXPORT_ONLY;
            if (iM30663 < 33 || iM30663 + 4 > bArr.length) {
                throw new IOException(C8479.m22141(iM30663, "Invalid payload size: "));
            }
            int i = this.f14500 ? 64 : 32;
            AbstractRunnableC3170.m9570(this.f14489, bArr, i + 4, iM30663 - i);
            f14483.mo12127("Read negotiate response");
        } catch (Throwable th) {
            this.f14496.setSoTimeout(((C9895) interfaceC19067.mo29449()).m25068());
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private C1385 m11227(C12282 c12282) throws Throwable {
        Throwable th;
        byte[] bArr;
        Semaphore semaphore = this.f14492;
        byte[] bArr2 = this.f14484;
        int iM11232 = m11232(c12282);
        InterfaceC19067 interfaceC19067 = this.f14497;
        C16515 c16515 = new C16515(interfaceC19067.mo29449(), iM11232);
        C12282 c12283 = null;
        byte[] bArr3 = null;
        try {
            c16515.m31356(Math.max(1, 512 - semaphore.availablePermits()));
            int iM11222 = m11222(c16515, c12282 != null);
            boolean zM38366 = ((C9895) interfaceC19067.mo29449()).m25076().m38366(EnumC16245.SMB311);
            if (zM38366) {
                bArr = new byte[iM11222];
                System.arraycopy(bArr2, 4, bArr, 0, iM11222);
            } else {
                bArr = null;
            }
            m11221();
            C12282 c12284 = (C12282) c16515.mo13364(interfaceC19067);
            try {
                int iM31345 = c12284.m31345(bArr2, 4, false);
                c12284.mo17296();
                if (zM38366) {
                    bArr3 = new byte[iM31345];
                    System.arraycopy(bArr2, 4, bArr3, 0, iM31345);
                } else {
                    bArr = null;
                }
                InterfaceC4314 interfaceC4314 = f14483;
                if (interfaceC4314.mo12133()) {
                    interfaceC4314.mo12127(c12284.toString());
                    interfaceC4314.mo12127(C5993.m16281(bArr2, 4, 0));
                }
                C1385 c1385 = new C1385(c16515, c12284, bArr, bArr3);
                int iM31342 = c12284.m31342();
                semaphore.release(iM31342 != 0 ? iM31342 : 1);
                Arrays.fill(bArr2, (byte) 0);
                return c1385;
            } catch (Throwable th2) {
                th = th2;
                c12283 = c12284;
                int iM31343 = c12283 != null ? c12283.m31342() : 0;
                semaphore.release(iM31343 != 0 ? iM31343 : 1);
                Arrays.fill(bArr2, (byte) 0);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m11249() {
        try {
            return m9587(((C9895) this.f14497.mo29449()).m25042());
        } catch (C4498 e) {
            throw new C12303("Failed to connect: " + this.f14485, e);
        }
    }

    @Override // l.AbstractRunnableC3170
    /* JADX INFO: renamed from: ۖ */
    public final void mo9574() throws IOException {
        InterfaceC4314 interfaceC4314 = f14483;
        if (interfaceC4314.mo12125()) {
            interfaceC4314.mo12135("Connecting in state " + this.f11925 + " addr " + this.f14485.mo36917());
        }
        try {
            C1385 c1385M11223 = m11223(this.f14490);
            if (interfaceC4314.mo12125()) {
                interfaceC4314.mo12135("Negotiation response on " + this.f11929 + " :" + c1385M11223);
            }
            if (!c1385M11223.m4856().mo11865(this.f14497, c1385M11223.m4857())) {
                throw new C12303("This client is not compatible with the server.");
            }
            boolean zMo11873 = c1385M11223.m4856().mo11873();
            boolean zMo11867 = c1385M11223.m4856().mo11867();
            if (interfaceC4314.mo12125()) {
                StringBuilder sb = new StringBuilder("Signature negotiation enforced ");
                sb.append(this.f14491);
                sb.append(" (server ");
                sb.append(zMo11873);
                sb.append(") enabled false (server ");
                this.f14497.mo29449().getClass();
                sb.append(zMo11867);
                sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
                interfaceC4314.mo12135(sb.toString());
            }
            this.f14498 = this.f14485.mo36921();
            this.f14493 = c1385M11223.m4856();
            if (c1385M11223.m4856().mo11862().m38366(EnumC16245.SMB311)) {
                byte[] bArrM4850 = c1385M11223.m4850();
                synchronized (this.f14499) {
                    this.f14499 = m11240(bArrM4850.length, bArrM4850, this.f14499);
                }
                m11229(c1385M11223.m4860());
                if (interfaceC4314.mo12125()) {
                    byte[] bArr = this.f14499;
                    interfaceC4314.mo12135("Preauth hash after negotiate ".concat(C5993.m16281(bArr, 0, bArr.length)));
                }
            }
        } catch (IOException e) {
            this.f14497.mo29449().getClass();
            throw e;
        }
    }

    @Override // l.AbstractRunnableC3170
    /* JADX INFO: renamed from: ۨ */
    public final long mo9583(InterfaceC3314 interfaceC3314) {
        long jIncrementAndGet = this.f14495.incrementAndGet() - 1;
        if (!this.f14500) {
            jIncrementAndGet %= 32000;
        }
        interfaceC3314.mo24566(jIncrementAndGet);
        return jIncrementAndGet;
    }

    @Override // l.AbstractRunnableC3170
    /* JADX INFO: renamed from: ᩸ */
    public final Long mo9590() throws IOException {
        byte[] bArr;
        char c;
        do {
            InputStream inputStream = this.f14489;
            bArr = this.f14484;
            c = 4;
            if (AbstractRunnableC3170.m9570(inputStream, bArr, 0, 4) < 4) {
                return null;
            }
        } while (bArr[0] == -123);
        if (AbstractRunnableC3170.m9570(this.f14489, bArr, 4, 32) < 32) {
            return null;
        }
        InterfaceC4314 interfaceC4314 = f14483;
        if (interfaceC4314.mo12133()) {
            interfaceC4314.mo12127("New data read: " + this);
            interfaceC4314.mo12127(C5993.m16281(bArr, 4, 32));
        }
        while (true) {
            byte b = bArr[0];
            if (b == 0 && bArr[c] == -2 && bArr[5] == 83 && bArr[6] == 77 && bArr[7] == 66) {
                this.f14500 = true;
                if (AbstractRunnableC3170.m9570(this.f14489, bArr, 36, 32) < 32) {
                    return null;
                }
                return Long.valueOf((((long) C12344.m30662(28, bArr)) & 4294967295L) | ((((long) C12344.m30662(32, bArr)) & 4294967295L) << 32));
            }
            if (b != 0 || bArr[1] != 0 || bArr[4] != -1 || bArr[5] != 83 || bArr[6] != 77 || bArr[7] != 66) {
                int i = 0;
                while (i < 35) {
                    interfaceC4314.mo12116("Possibly out of phase, trying to resync ".concat(C5993.m16281(bArr, 0, 16)));
                    int i2 = i + 1;
                    bArr[i] = bArr[i2];
                    i = i2;
                }
                int i3 = this.f14489.read();
                if (i3 == -1) {
                    return null;
                }
                bArr[35] = (byte) i3;
                c = 4;
            } else {
                return Long.valueOf(((long) C12344.m30667(34, bArr)) & 65535);
            }
        }
    }

    @Override // l.AbstractRunnableC3170
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC4913 mo9576(InterfaceC3314 interfaceC3314, InterfaceC4913 interfaceC4913, Set set) throws IOException {
        InterfaceC3314 interfaceC3314Mo9819;
        int i;
        InterfaceC4913 interfaceC4913Mo13364 = interfaceC4913;
        if (interfaceC3314 instanceof InterfaceC14087) {
            if (interfaceC4913Mo13364 == null) {
                interfaceC4913Mo13364 = ((InterfaceC14087) interfaceC3314).mo13364(this.f14497);
            } else if (m11248()) {
                throw new IOException("Should not provide response argument for SMB2");
            }
        } else if ((interfaceC3314 instanceof AbstractC11264) && (interfaceC4913Mo13364 instanceof AbstractC11264)) {
            AbstractC11264 abstractC11264 = (AbstractC11264) interfaceC3314;
            InterfaceC4913 interfaceC4913M28229 = interfaceC4913Mo13364;
            while (true) {
                AbstractC11264 abstractC11265 = (AbstractC11264) interfaceC4913M28229;
                abstractC11264.mo24567((InterfaceC4913) abstractC11265);
                AbstractC14792 abstractC14792M28229 = abstractC11264.m28229();
                if (abstractC14792M28229 == null) {
                    break;
                }
                interfaceC4913M28229 = abstractC11265.m28229();
                abstractC14792M28229.mo24567((InterfaceC4913) abstractC14792M28229);
                if (!(abstractC14792M28229 instanceof AbstractC11264) || !(interfaceC4913M28229 instanceof AbstractC11264)) {
                    break;
                }
                abstractC11264 = (AbstractC11264) abstractC14792M28229;
            }
        } else {
            interfaceC3314.mo24567(interfaceC4913);
        }
        if (interfaceC4913Mo13364 != null) {
            int iM25057 = ((C9895) this.f14497.mo29449()).m25057();
            InterfaceC3314 interfaceC3315 = interfaceC3314;
            while (true) {
                if (interfaceC3315 == null) {
                    interfaceC4913Mo13364 = interfaceC4913Mo13364;
                    break;
                }
                int i2 = 0;
                int i3 = 0;
                InterfaceC3314 interfaceC3316 = null;
                InterfaceC3314 interfaceC3317 = interfaceC3315;
                while (true) {
                    if (interfaceC3317 != null) {
                        int i4 = i2 + 1;
                        int size = interfaceC3317.size();
                        InterfaceC3314 interfaceC3314Mo9818 = interfaceC3317.mo9818();
                        InterfaceC4314 interfaceC4314 = f14483;
                        if (interfaceC4314.mo12133()) {
                            interfaceC4314.mo12127(String.format("%s costs %d avail %d (%s)", interfaceC3317.getClass().getName(), 1, Integer.valueOf(this.f14492.availablePermits()), this.f11929));
                        }
                        if ((interfaceC3314Mo9818 == null || interfaceC3317.mo9820(interfaceC3314Mo9818)) && (i = i3 + size) < iM25057 && this.f14492.tryAcquire(1)) {
                            i3 = i;
                            interfaceC3316 = interfaceC3317;
                            interfaceC3317 = interfaceC3314Mo9818;
                            i2 = i4;
                            interfaceC4913Mo13364 = interfaceC4913Mo13364;
                        } else {
                            if (interfaceC3316 == null && i3 + size > iM25057) {
                                throw new C12303(String.format("Request size %d exceeds allowable size %d: %s", Integer.valueOf(size), Integer.valueOf(iM25057), interfaceC3317));
                            }
                            if (interfaceC3316 == null) {
                                try {
                                    long jMo9586 = mo9586(interfaceC3317);
                                    if (set.contains(EnumC19358.NO_TIMEOUT)) {
                                        this.f14492.acquire(1);
                                    } else if (!this.f14492.tryAcquire(1, jMo9586, TimeUnit.MILLISECONDS)) {
                                        throw new C12303("Failed to acquire credits in time");
                                    }
                                    synchronized (interfaceC3317) {
                                        interfaceC3314Mo9819 = interfaceC3317.mo9819();
                                        if (interfaceC4314.mo12125() && interfaceC3314Mo9819 != null) {
                                            interfaceC4314.mo12135("Insufficient credits, send only first " + interfaceC3317 + " next is " + interfaceC3314Mo9819);
                                        }
                                    }
                                } catch (InterruptedException e) {
                                    InterruptedIOException interruptedIOException = new InterruptedIOException("Interrupted while acquiring credits");
                                    interruptedIOException.initCause(e);
                                    throw interruptedIOException;
                                }
                            } else {
                                if (interfaceC4314.mo12125()) {
                                    interfaceC4314.mo12135("Not enough credits, split at " + interfaceC3316);
                                }
                                synchronized (interfaceC3316) {
                                    interfaceC3314Mo9819 = interfaceC3316.mo9819();
                                }
                            }
                            i2 = i4;
                        }
                    } else {
                        interfaceC4913Mo13364 = interfaceC4913Mo13364;
                        interfaceC3314Mo9819 = null;
                    }
                    int iMax = Math.max(1, ((512 - this.f14492.availablePermits()) - i2) + 1);
                    InterfaceC4314 interfaceC4315 = f14483;
                    if (interfaceC4315.mo12133()) {
                        interfaceC4315.mo12127("Request credits " + iMax);
                    }
                    interfaceC3314.mo9817(iMax);
                    try {
                        InterfaceC4913 interfaceC4913Mo9821 = interfaceC3315.mo9821();
                        if (interfaceC4315.mo12133()) {
                            interfaceC4315.mo12127("Sending " + interfaceC3315);
                        }
                        InterfaceC4913 interfaceC4914 = (InterfaceC4913) mo9576(interfaceC3315, interfaceC4913Mo9821, set);
                        if (!m11220(interfaceC3315)) {
                            if (interfaceC4315.mo12125()) {
                                interfaceC4315.mo12135("Breaking on error " + interfaceC4914);
                            }
                            int iMo24368 = 0;
                            while (true) {
                                if (interfaceC3315.mo9822()) {
                                    f14483.mo12127("Async");
                                    break;
                                }
                                InterfaceC4913 interfaceC4913Mo9822 = interfaceC3315.mo9821();
                                if (interfaceC4913Mo9822 == null) {
                                    f14483.mo12116("Response not properly set up for" + interfaceC3315);
                                } else if (interfaceC4913Mo9822.mo17295()) {
                                    iMo24368 = interfaceC4913Mo9822.mo24368() + iMo24368;
                                }
                                InterfaceC3314 interfaceC3314Mo98110 = interfaceC3315.mo9818();
                                if (interfaceC3314Mo98110 == null) {
                                    break;
                                }
                                interfaceC3315 = interfaceC3314Mo98110;
                            }
                            if (!mo9573() && !interfaceC3315.mo9822() && !interfaceC3315.mo9821().mo13670() && !interfaceC3315.mo9821().mo17304() && iMo24368 == 0) {
                                if (this.f14492.availablePermits() > 0 || i2 > 0) {
                                    f14483.mo12135("Server " + this + " returned zero credits for " + interfaceC3315);
                                    break;
                                }
                                f14483.mo12116("Server " + this + " took away all our credits");
                                break;
                            }
                            if (!interfaceC3315.mo9822()) {
                                InterfaceC4314 interfaceC4316 = f14483;
                                if (interfaceC4316.mo12133()) {
                                    interfaceC4316.mo12127("Adding credits " + iMo24368);
                                }
                                this.f14492.release(iMo24368);
                                break;
                            }
                            break;
                        }
                        if (interfaceC3314Mo9819 != null) {
                            interfaceC4914.mo5635(interfaceC3314Mo9819);
                        }
                        int iMo24369 = 0;
                        while (true) {
                            if (interfaceC3315.mo9822()) {
                                f14483.mo12127("Async");
                                break;
                            }
                            InterfaceC4913 interfaceC4913Mo9823 = interfaceC3315.mo9821();
                            if (interfaceC4913Mo9823 == null) {
                                f14483.mo12116("Response not properly set up for" + interfaceC3315);
                            } else if (interfaceC4913Mo9823.mo17295()) {
                                iMo24369 = interfaceC4913Mo9823.mo24368() + iMo24369;
                            }
                            InterfaceC3314 interfaceC3314Mo98111 = interfaceC3315.mo9818();
                            if (interfaceC3314Mo98111 == null) {
                                break;
                            }
                            interfaceC3315 = interfaceC3314Mo98111;
                        }
                        if (!mo9573() && !interfaceC3315.mo9822() && !interfaceC3315.mo9821().mo13670() && !interfaceC3315.mo9821().mo17304() && iMo24369 == 0) {
                            if (this.f14492.availablePermits() > 0 || i2 > 0) {
                                f14483.mo12135("Server " + this + " returned zero credits for " + interfaceC3315);
                            } else {
                                f14483.mo12116("Server " + this + " took away all our credits");
                            }
                        } else if (!interfaceC3315.mo9822()) {
                            InterfaceC4314 interfaceC4317 = f14483;
                            if (interfaceC4317.mo12133()) {
                                interfaceC4317.mo12127("Adding credits " + iMo24369);
                            }
                            this.f14492.release(iMo24369);
                        }
                        interfaceC3315 = interfaceC3314Mo9819;
                        interfaceC4913Mo13364 = interfaceC4913Mo13364;
                    } catch (Throwable th) {
                        int iMo243610 = 0;
                        while (true) {
                            if (interfaceC3315.mo9822()) {
                                f14483.mo12127("Async");
                                break;
                            }
                            InterfaceC4913 interfaceC4913Mo9824 = interfaceC3315.mo9821();
                            if (interfaceC4913Mo9824 == null) {
                                f14483.mo12116("Response not properly set up for" + interfaceC3315);
                            } else if (interfaceC4913Mo9824.mo17295()) {
                                iMo243610 = interfaceC4913Mo9824.mo24368() + iMo243610;
                            }
                            InterfaceC3314 interfaceC3314Mo98112 = interfaceC3315.mo9818();
                            if (interfaceC3314Mo98112 == null) {
                                break;
                            }
                            interfaceC3315 = interfaceC3314Mo98112;
                        }
                        if (!mo9573() && !interfaceC3315.mo9822() && !interfaceC3315.mo9821().mo13670() && !interfaceC3315.mo9821().mo17304() && iMo243610 == 0) {
                            if (this.f14492.availablePermits() > 0 || i2 > 0) {
                                f14483.mo12135("Server " + this + " returned zero credits for " + interfaceC3315);
                            } else {
                                f14483.mo12116("Server " + this + " took away all our credits");
                            }
                        } else if (!interfaceC3315.mo9822()) {
                            InterfaceC4314 interfaceC4318 = f14483;
                            if (interfaceC4318.mo12133()) {
                                interfaceC4318.mo12127("Adding credits " + iMo243610);
                            }
                            this.f14492.release(iMo243610);
                        }
                        throw th;
                    }
                }
            }
            if (interfaceC4913Mo13364.mo17295()) {
                return interfaceC4913Mo13364;
            }
            throw new IOException("No response", interfaceC4913Mo13364.getException());
        }
        throw new IOException("Invalid response");
    }

    @Override // l.AbstractRunnableC3170
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo9581(InterfaceC3314 interfaceC3314, InterfaceC9522 interfaceC9522) {
        if (!this.f14500) {
            return false;
        }
        AbstractC17529 abstractC17529 = (AbstractC17529) interfaceC3314;
        AbstractC6240 abstractC6240 = (AbstractC6240) interfaceC9522;
        synchronized (abstractC6240) {
            if (!abstractC6240.m31360() || abstractC6240.m17305() || abstractC6240.m31351() != 259 || abstractC6240.m31359() == 0) {
                return false;
            }
            abstractC6240.m17306();
            boolean zM31360 = abstractC17529.m31360();
            abstractC17529.m31353(abstractC6240.m31359());
            if (abstractC6240.mo17294() != null) {
                abstractC6240.mo17299(Long.valueOf(System.currentTimeMillis() + ((long) mo9586(interfaceC3314))));
            }
            InterfaceC4314 interfaceC4314 = f14483;
            if (interfaceC4314.mo12125()) {
                interfaceC4314.mo12135("Have intermediate reply " + interfaceC9522);
            }
            if (!zM31360) {
                int iM31342 = abstractC6240.m31342();
                if (interfaceC4314.mo12125()) {
                    interfaceC4314.mo12135("Credit from intermediate " + iM31342);
                }
                this.f14492.release(iM31342);
            }
            return true;
        }
    }

    @Override // l.AbstractRunnableC3170
    /* JADX INFO: renamed from: ۙ */
    public final void mo9580(InterfaceC9522 interfaceC9522) throws Exception {
        InterfaceC9666 interfaceC9666 = (InterfaceC9666) interfaceC9522;
        this.f14493.mo11863(interfaceC9522);
        try {
            if (this.f14500) {
                m11228(interfaceC9666);
            } else {
                m11225(interfaceC9666);
            }
        } catch (Exception e) {
            f14483.mo12122("Failure decoding message, disconnecting transport", (Throwable) e);
            interfaceC9522.mo17298(e);
            synchronized (interfaceC9522) {
                interfaceC9522.notifyAll();
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m11228(InterfaceC9666 interfaceC9666) throws IOException {
        int iM30662;
        byte[] bArr = this.f14484;
        int iM30663 = (C12344.m30663(2, bArr) & HPKE.aead_EXPORT_ONLY) | ((bArr[1] & 255) << 16);
        if (iM30663 < 65) {
            throw new IOException(C8479.m22141(iM30663, "Invalid payload size: "));
        }
        int i = 0;
        if (bArr[0] != 0 || bArr[4] != -2 || bArr[5] != 83 || bArr[6] != 77 || bArr[7] != 66) {
            throw new IOException("Houston we have a synchronization problem");
        }
        int iM30664 = C12344.m30662(24, bArr);
        InterfaceC19067 interfaceC19067 = this.f14497;
        int iM25057 = ((C9895) interfaceC19067.mo29449()).m25057();
        int i2 = iM30664 != 0 ? iM30664 : iM30663;
        if (i2 > iM25057) {
            throw new IOException(String.format("Message size %d exceeds maxiumum buffer size %d", Integer.valueOf(i2), Integer.valueOf(iM25057)));
        }
        AbstractC6240 abstractC6240 = (AbstractC6240) interfaceC9666;
        byte[] bArrM28137 = interfaceC19067.mo29448().m28137();
        int i3 = iM30664 != 0 ? iM30664 : iM30663;
        int i4 = 64;
        try {
            System.arraycopy(bArr, 4, bArrM28137, 0, 64);
            AbstractRunnableC3170.m9570(this.f14489, bArrM28137, 64, i3 - 64);
            abstractC6240.m31343(i3);
            int iM31345 = abstractC6240.m31345(bArrM28137, 0, false);
            if (iM31345 > i3) {
                throw new IOException(String.format("WHAT? ( read %d decoded %d ): %s", Integer.valueOf(i3), Integer.valueOf(iM31345), abstractC6240));
            }
            char c = 1;
            if (iM30664 != 0 && iM31345 > iM30664) {
                throw new IOException("Overlapping commands");
            }
            int i5 = iM30663 - i3;
            int i6 = 2;
            while (true) {
                if (i5 > 0 && iM30664 != 0) {
                    abstractC6240 = (AbstractC6240) abstractC6240.m31362();
                    InterfaceC4314 interfaceC4314 = f14483;
                    if (abstractC6240 != null) {
                        AbstractRunnableC3170.m9570(this.f14489, bArrM28137, i, i4);
                        iM30662 = C12344.m30662(20, bArrM28137);
                        if ((iM30662 != 0 && iM30662 > iM25057) || (iM30662 == 0 && i5 > iM25057)) {
                            break;
                        }
                        int i7 = iM30662 != 0 ? iM30662 : i5;
                        if (interfaceC4314.mo12125()) {
                            Integer numValueOf = Integer.valueOf(iM30662);
                            Integer numValueOf2 = Integer.valueOf(i7);
                            Integer numValueOf3 = Integer.valueOf(i5);
                            Object[] objArr = new Object[3];
                            objArr[0] = numValueOf;
                            objArr[c] = numValueOf2;
                            objArr[2] = numValueOf3;
                            interfaceC4314.mo12135(String.format("Compound next command %d read size %d remain %d", objArr));
                        }
                        abstractC6240.m31343(i7);
                        AbstractRunnableC3170.m9570(this.f14489, bArrM28137, 64, i7 - 64);
                        int iM31346 = abstractC6240.m31345(bArrM28137, 0, true);
                        if (iM31346 > i7) {
                            throw new IOException(String.format("WHAT? ( read %d decoded %d ): %s", Integer.valueOf(i7), Integer.valueOf(iM31346), abstractC6240));
                        }
                        if (iM30662 != 0 && iM31346 > iM30662) {
                            throw new IOException("Overlapping commands");
                        }
                        i5 -= i7;
                        i6 = 2;
                        i = 0;
                        iM30664 = iM30662;
                        i4 = 64;
                        c = 1;
                    } else {
                        interfaceC4314.mo12116("Response not properly set up");
                        this.f14489.skip(i5);
                    }
                }
                interfaceC19067.mo29448().m28136(bArrM28137);
                return;
            }
            if (iM30662 != 0) {
                i5 = iM30662;
            }
            Integer numValueOf4 = Integer.valueOf(i5);
            Integer numValueOf5 = Integer.valueOf(iM25057);
            Object[] objArr2 = new Object[i6];
            objArr2[i] = numValueOf4;
            objArr2[c] = numValueOf5;
            throw new IOException(String.format("Message size %d exceeds maxiumum buffer size %d", objArr2));
        } catch (Throwable th) {
            interfaceC19067.mo29448().m28136(bArrM28137);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m11225(InterfaceC9666 interfaceC9666) {
        InterfaceC19067 interfaceC19067 = this.f14497;
        byte[] bArrM28137 = interfaceC19067.mo29448().m28137();
        try {
            System.arraycopy(this.f14484, 0, bArrM28137, 0, 36);
            int iM30663 = C12344.m30663(2, bArrM28137) & HPKE.aead_EXPORT_ONLY;
            if (iM30663 < 33 || iM30663 + 4 > Math.min(65535, ((C9895) interfaceC19067.mo29449()).m25057())) {
                throw new IOException("Invalid payload size: " + iM30663);
            }
            int iM30662 = C12344.m30662(9, bArrM28137);
            if (interfaceC9666.mo24564() == 46 && (iM30662 == 0 || iM30662 == -2147483643)) {
                C19626 c19626 = (C19626) interfaceC9666;
                AbstractRunnableC3170.m9570(this.f14489, bArrM28137, 36, 27);
                interfaceC9666.decode(bArrM28137);
                int iM44718 = c19626.m44718() - 59;
                if (c19626.m35447() > 0 && iM44718 > 0 && iM44718 < 4) {
                    AbstractRunnableC3170.m9570(this.f14489, bArrM28137, 63, iM44718);
                }
                if (c19626.m44720() > 0) {
                    AbstractRunnableC3170.m9570(this.f14489, c19626.m44717(), c19626.m44719(), c19626.m44720());
                }
            } else {
                AbstractRunnableC3170.m9570(this.f14489, bArrM28137, 36, iM30663 - 32);
                interfaceC9666.decode(bArrM28137);
            }
            interfaceC19067.mo29448().m28136(bArrM28137);
        } catch (Throwable th) {
            interfaceC19067.mo29448().m28136(bArrM28137);
            throw th;
        }
    }

    @Override // l.AbstractRunnableC3170
    /* JADX INFO: renamed from: ۙ */
    public final void mo9578(Long l2) {
        synchronized (this.f11926) {
            int iM30663 = C12344.m30663(2, this.f14484) & HPKE.aead_EXPORT_ONLY;
            if (iM30663 < 33 || iM30663 + 4 > ((C9895) this.f14497.mo29449()).m25084()) {
                f14483.mo12116("Flusing stream input");
                InputStream inputStream = this.f14489;
                inputStream.skip(inputStream.available());
            } else {
                InterfaceC19067 interfaceC19067 = this.f14497;
                byte[] bArr = this.f14484;
                InterfaceC9522 c22448 = null;
                if (this.f14500) {
                    if (l2.longValue() == -1 && (65535 & C12344.m30667(16, bArr)) == 18) {
                        c22448 = new C7342(interfaceC19067.mo29449());
                    }
                } else if (l2.longValue() == 65535 && bArr[8] == 36) {
                    c22448 = new C22448(interfaceC19067.mo29449());
                }
                if (c22448 != null) {
                    InterfaceC4314 interfaceC4314 = f14483;
                    interfaceC4314.mo12135("Parsing notification");
                    mo9580(c22448);
                    interfaceC4314.mo12130("Received notification " + c22448);
                    return;
                }
                f14483.mo12116("Skipping message " + l2);
                if (m11248()) {
                    this.f14489.skip(iM30663 - 64);
                } else {
                    this.f14489.skip(iM30663 - 32);
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:18:0x006c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0080  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m11238(AbstractC14792 abstractC14792, AbstractC14792 abstractC14793) throws C12303 {
        boolean z;
        if (abstractC14793.getErrorCode() == 196610) {
            abstractC14793.m35433(-1073741225);
        } else {
            abstractC14793.m35433(C12303.m30560(abstractC14793.getErrorCode()));
        }
        int errorCode = abstractC14793.getErrorCode();
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
                    throw new C20064(abstractC14793.getErrorCode());
                case -1073741662:
                case -1073741225:
                    m11224(abstractC14793, abstractC14792.getPath(), abstractC14792);
                    throw null;
                case -1073741637:
                    throw new C19399();
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
                            throw new C20064(abstractC14793.getErrorCode());
                        default:
                            InterfaceC4314 interfaceC4314 = f14483;
                            if (interfaceC4314.mo12125()) {
                                interfaceC4314.mo12135("Error code: 0x" + C5993.m16280(abstractC14793.getErrorCode(), 8) + " for " + abstractC14792.getClass().getSimpleName());
                            }
                            throw new C12303(abstractC14793.getErrorCode());
                    }
            }
        } else {
            z = true;
        }
        if (abstractC14793.mo17300()) {
            throw new C12303("Signature verification failed.");
        }
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m11224(InterfaceC4913 interfaceC4913, String str, InterfaceC11970 interfaceC11970) throws C12303 {
        InterfaceC19067 interfaceC19067 = this.f14497;
        interfaceC19067.mo29449().getClass();
        try {
            C23259 c23259M11235 = m11235(this.f14497, str, interfaceC11970.mo12622(), interfaceC11970.mo12627(), 1);
            InterfaceC4314 interfaceC4314 = f14483;
            if (c23259M11235 == null) {
                if (interfaceC4314.mo12125()) {
                    interfaceC4314.mo12135("Error code: 0x".concat(C5993.m16280(interfaceC4913.getErrorCode(), 8)));
                }
                throw new C12303(interfaceC4913.getErrorCode());
            }
            if (interfaceC11970.mo12627() != null) {
                interfaceC19067.mo29449().getClass();
            }
            if (interfaceC4314.mo12125()) {
                interfaceC4314.mo12135("Got referral " + c23259M11235);
            }
            ((C9790) interfaceC19067.mo29447()).m24900(interfaceC19067, str, c23259M11235);
            throw new C3438(c23259M11235);
        } catch (C8484 e) {
            throw new C12303("Failed to get DFS referral", e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11236(InterfaceC3314 interfaceC3314, AbstractC14792 abstractC14792) throws C12303 {
        m11245(interfaceC3314, abstractC14792, Collections.EMPTY_SET);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4913 m11245(InterfaceC3314 interfaceC3314, InterfaceC4913 interfaceC4913, Set set) throws C12303 {
        m11249();
        boolean z = this.f14500;
        if (z && !(interfaceC3314 instanceof AbstractC12591)) {
            throw new C12303("Not an SMB2 request ".concat(interfaceC3314.getClass().getName()));
        }
        if (!z && !(interfaceC3314 instanceof AbstractC14792)) {
            throw new C12303("Not an SMB1 request");
        }
        this.f14493.mo11870(interfaceC3314);
        if (interfaceC4913 != null) {
            interfaceC3314.mo24567(interfaceC4913);
            interfaceC4913.mo24568(interfaceC3314.getDigest());
        }
        try {
            InterfaceC4314 interfaceC4314 = f14483;
            if (interfaceC4314.mo12133()) {
                interfaceC4314.mo12127("Sending " + interfaceC3314);
            }
            interfaceC3314.getClass();
            if (interfaceC3314 instanceof AbstractC2712) {
                m11226(interfaceC3314, interfaceC4913, set);
            } else {
                if (interfaceC4913 != null) {
                    interfaceC4913.mo24570(interfaceC3314.mo24564());
                }
                interfaceC4913 = mo9576(interfaceC3314, interfaceC4913, set);
            }
            if (interfaceC4314.mo12133()) {
                interfaceC4314.mo12127("Response is " + interfaceC4913);
            }
            m11220(interfaceC3314);
            return interfaceC4913;
        } catch (C12303 e) {
            throw e;
        } catch (IOException e2) {
            throw new C12303(e2.getMessage(), e2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x006b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x006e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x00c3 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private boolean m11220(InterfaceC3314 interfaceC3314) throws C12303 {
        Object obj;
        InterfaceC4913 interfaceC4913Mo9821;
        int iM41618;
        while (true) {
            boolean z = true;
            if (interfaceC3314 == null) {
                return true;
            }
            if (this.f14500) {
                obj = (AbstractC12591) interfaceC3314;
                interfaceC4913Mo9821 = interfaceC3314.mo9821();
                switch (interfaceC4913Mo9821.getErrorCode()) {
                    case -2147483643:
                        if (!(interfaceC4913Mo9821 instanceof C6636) && (!(interfaceC4913Mo9821 instanceof C17925) || ((iM41618 = ((C17925) interfaceC4913Mo9821).m41618()) != 1163287 && iM41618 != 1130508))) {
                        }
                        z = false;
                        if (interfaceC4913Mo9821.mo17300()) {
                            throw new C7363("Signature verification failed.");
                        }
                        if (!z) {
                            return false;
                        }
                        interfaceC3314 = interfaceC3314.mo9818();
                        break;
                    case -2147483642:
                    case 0:
                        if (interfaceC4913Mo9821.mo17300()) {
                            throw new C7363("Signature verification failed.");
                        }
                        if (!z) {
                            return false;
                        }
                        interfaceC3314 = interfaceC3314.mo9818();
                        break;
                        break;
                    case -1073741808:
                    case -1073741637:
                        throw new C19399();
                    case -1073741802:
                    case 259:
                    case 267:
                    case 268:
                        z = false;
                        if (interfaceC4913Mo9821.mo17300()) {
                            throw new C7363("Signature verification failed.");
                        }
                        if (!z) {
                            return false;
                        }
                        interfaceC3314 = interfaceC3314.mo9818();
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
                        throw new C20064(interfaceC4913Mo9821.getErrorCode());
                    case -1073741225:
                        if (!(obj instanceof InterfaceC11970)) {
                            throw new C12303("Invalid request for a DFS NT_STATUS_PATH_NOT_COVERED response ".concat(obj.getClass().getName()));
                        }
                        InterfaceC11970 interfaceC11970 = (InterfaceC11970) obj;
                        m11224(interfaceC4913Mo9821, interfaceC11970.mo12625(), interfaceC11970);
                        throw null;
                    default:
                        break;
                }
            } else {
                if (!m11238((AbstractC14792) interfaceC3314, (AbstractC14792) interfaceC3314.mo9821())) {
                    return false;
                }
                interfaceC3314 = interfaceC3314.mo9818();
            }
        }
        InterfaceC4314 interfaceC4314 = f14483;
        if (interfaceC4314.mo12125()) {
            interfaceC4314.mo12135("Error code: 0x" + C5993.m16280(interfaceC4913Mo9821.getErrorCode(), 8) + " for " + obj.getClass().getSimpleName());
        }
        throw new C12303(interfaceC4913Mo9821.getErrorCode());
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m11226(InterfaceC3314 interfaceC3314, InterfaceC4913 interfaceC4913, Set set) {
        long jMo9583;
        interfaceC4913.mo24570(interfaceC3314.mo24564());
        AbstractC2712 abstractC2712 = (AbstractC2712) interfaceC3314;
        AbstractC5535 abstractC5535 = (AbstractC5535) interfaceC4913;
        abstractC5535.reset();
        try {
            try {
                abstractC2712.m8264(this.f14497.mo29448().m28137());
                abstractC2712.nextElement();
                if (abstractC2712.hasMoreElements()) {
                    AbstractC14792 c3501 = new C3501(this.f14497.mo29449());
                    mo9576((InterfaceC3314) abstractC2712, (InterfaceC4913) c3501, set);
                    if (c3501.getErrorCode() != 0) {
                        m11238((AbstractC14792) abstractC2712, c3501);
                    }
                    abstractC2712.nextElement();
                    jMo9583 = abstractC2712.mo24367();
                } else {
                    jMo9583 = mo9583(abstractC2712);
                }
                long j = jMo9583;
                try {
                    abstractC5535.mo17301();
                    long jMo9586 = mo9586((InterfaceC3314) abstractC2712);
                    if (set.contains(EnumC19358.NO_TIMEOUT)) {
                        abstractC5535.mo17299((Long) null);
                    } else {
                        abstractC5535.mo17299(Long.valueOf(System.currentTimeMillis() + jMo9586));
                    }
                    abstractC5535.m15235(this.f14497.mo29448().m28137());
                    this.f11927.put(Long.valueOf(j), abstractC5535);
                    while (true) {
                        InterfaceC4314 interfaceC4314 = f14483;
                        try {
                            mo9579((InterfaceC3314) abstractC2712);
                            if (!abstractC2712.hasMoreElements()) {
                                break;
                            } else {
                                abstractC2712.nextElement();
                            }
                        } catch (IOException e) {
                            interfaceC4314.mo12122("send failed", (Throwable) e);
                            try {
                                m9584();
                            } catch (IOException e2) {
                                e.addSuppressed(e2);
                                interfaceC4314.mo12138("disconnect failed", (Throwable) e2);
                            }
                            throw e;
                        }
                    }
                    synchronized (abstractC5535) {
                        while (true) {
                            if (abstractC5535.mo17295() && !abstractC5535.hasMoreElements()) {
                            }
                            if (set.contains(EnumC19358.NO_TIMEOUT)) {
                                abstractC5535.wait();
                                InterfaceC4314 interfaceC4315 = f14483;
                                if (interfaceC4315.mo12133()) {
                                    interfaceC4315.mo12127("Wait returned " + mo9573());
                                }
                                if (mo9573()) {
                                    throw new EOFException("Transport closed while waiting for result");
                                }
                            } else {
                                abstractC5535.wait(jMo9586);
                                jMo9586 = abstractC5535.mo17294().longValue() - System.currentTimeMillis();
                                if (jMo9586 <= 0) {
                                    throw new C4498(this + " timedout waiting for response to " + abstractC2712);
                                }
                            }
                        }
                    }
                    if (!abstractC5535.mo17295()) {
                        throw new C4498("Failed to read response");
                    }
                    if (abstractC5535.getErrorCode() != 0) {
                        m11238((AbstractC14792) abstractC2712, (AbstractC14792) abstractC5535);
                    }
                    this.f11927.remove(Long.valueOf(j));
                    this.f14497.mo29448().m28136(abstractC5535.m15234());
                    this.f14497.mo29448().m28136(abstractC2712.m8265());
                } catch (Throwable th) {
                    this.f11927.remove(Long.valueOf(j));
                    this.f14497.mo29448().m28136(abstractC5535.m15234());
                    throw th;
                }
            } catch (InterruptedException e3) {
                throw new C4498(e3);
            }
        } catch (Throwable th2) {
            this.f14497.mo29448().m28136(abstractC2712.m8265());
            throw th2;
        }
    }

    @Override // l.AbstractRunnableC3170
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[");
        sb.append(this.f14485);
        sb.append(":");
        sb.append(this.f14490);
        sb.append(",state=");
        sb.append(this.f11925);
        sb.append(",signingEnforced=");
        sb.append(this.f14491);
        sb.append(",usage=");
        return C15037.m36023(sb, m9591(), "]");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23259 m11235(InterfaceC19067 interfaceC19067, String str, String str2, String str3, int i) {
        C21847 c21847M23400;
        String str4 = str;
        int iM48626 = i;
        InterfaceC4314 interfaceC4314 = f14483;
        if (interfaceC4314.mo12125()) {
            interfaceC4314.mo12135("Resolving DFS path " + str4);
        }
        int i2 = 0;
        if (str.length() >= 2 && str4.charAt(0) == '\\' && str4.charAt(1) == '\\') {
            throw new C12303("Path must not start with double slash: ".concat(str4));
        }
        C1053 c1053M11233 = m11233(interfaceC19067, str2, str3);
        try {
            C3875 c3875M3985 = c1053M11233.m3985();
            try {
                C8110 c8110M3974 = c1053M11233.m3974("IPC$");
                try {
                    C5124 c5124 = new C5124(str4);
                    if (m11248()) {
                        C21453 c21453 = new C21453(interfaceC19067.mo29449(), 393620);
                        c21453.m48077();
                        c21453.m48075(c5124);
                        c21847M23400 = (C21847) ((C17925) c8110M3974.m21336(c21453, new EnumC19358[0])).m41617(C21847.class);
                    } else {
                        C9064 c9064 = new C9064(interfaceC19067.mo29449());
                        c8110M3974.m21335(new C19647(str4, interfaceC19067.mo29449()), c9064, Collections.EMPTY_SET);
                        c21847M23400 = c9064.m23400();
                    }
                    C23259 c23259 = null;
                    if (c21847M23400.m48626() == 0) {
                        c8110M3974.m21347();
                        c3875M3985.m9589();
                        c1053M11233.m3984();
                        return null;
                    }
                    if (iM48626 == 0 || c21847M23400.m48626() < iM48626) {
                        iM48626 = c21847M23400.m48626();
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis() + (((C9895) interfaceC19067.mo29449()).m25080() * 1000);
                    C18319[] c18319ArrM48627 = c21847M23400.m48627();
                    while (i2 < iM48626) {
                        C23259 c23259M51330 = C23259.m51330(c18319ArrM48627[i2], str4, jCurrentTimeMillis, c21847M23400.m48625());
                        c23259M51330.m51331(str3);
                        if ((c21847M23400.m48624() & 2) == 0 && (c23259M51330.m51336() & 2) == 0) {
                            interfaceC4314.mo12135("Non-root referral is not final " + c21847M23400);
                            c23259M51330.m51337();
                        }
                        if (c23259 != null) {
                            c23259.m51333(c23259M51330);
                        }
                        i2++;
                        str4 = str;
                        c23259 = c23259M51330;
                    }
                    if (interfaceC4314.mo12125()) {
                        interfaceC4314.mo12135("Got referral " + c23259);
                    }
                    c8110M3974.m21347();
                    c3875M3985.m9589();
                    c1053M11233.m3984();
                    return c23259;
                } catch (Throwable th) {
                    try {
                        c8110M3974.m21347();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                c3875M3985.m9589();
                throw th3;
            }
            try {
                c3875M3985.m9589();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        } catch (Throwable th5) {
            try {
                c1053M11233.m3984();
                throw th5;
            } catch (Throwable th6) {
                th5.addSuppressed(th6);
                throw th5;
            }
        }
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final byte[] m11230() {
        return this.f14499;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m11229(byte[] bArr) {
        synchronized (this.f14499) {
            this.f14499 = m11240(bArr.length, bArr, this.f14499);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m11240(int i, byte[] bArr, byte[] bArr2) throws C19399 {
        InterfaceC4207 interfaceC4207;
        if (!this.f14500 || (interfaceC4207 = this.f14493) == null) {
            throw new C19399();
        }
        C12282 c12282 = (C12282) interfaceC4207;
        if (!c12282.mo11862().m38366(EnumC16245.SMB311)) {
            throw new C19399();
        }
        if (c12282.m30524() == 1) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(XMSSKeyParameters.SHA_512);
                if (bArr2 != null) {
                    messageDigest.update(bArr2);
                }
                messageDigest.update(bArr, 0, i);
                return messageDigest.digest();
            } catch (NoSuchAlgorithmException e) {
                throw new C19773(e);
            }
        }
        throw new C19399();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m11232(C12282 c12282) {
        if (this.f14491) {
            return 3;
        }
        return (c12282 == null || !c12282.mo11873()) ? 1 : 3;
    }
}
