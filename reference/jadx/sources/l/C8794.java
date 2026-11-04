package l;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.PrivilegedActionException;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.Subject;

/* JADX INFO: renamed from: l.۠ܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: E9ZA */
/* JADX INFO: loaded from: classes4.dex */
public final class C8794 implements InterfaceC7303 {

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f28650 = C16980.m40037(C8794.class);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f28651;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long f28652;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f28653;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC23032 f28654;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C14014 f28655;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f28656;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final String f28657;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public byte[] f28658;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public byte[] f28659;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public int f28660;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC10110 f28663;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC24546 f28665;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f28666;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f28662 = new AtomicInteger();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f28664 = null;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final AtomicLong f28667 = new AtomicLong(1);

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f28661 = new AtomicBoolean(true);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC7303 m23617() {
        if (InterfaceC7303.class.isAssignableFrom(C8794.class)) {
            return this;
        }
        throw new ClassCastException();
    }

    public C8794(InterfaceC23032 interfaceC23032, String str, String str2, C14014 c14014) {
        this.f28654 = interfaceC23032;
        this.f28653 = str2;
        this.f28657 = str;
        c14014.m1084();
        this.f28655 = c14014;
        this.f28666 = new ArrayList();
        this.f28665 = interfaceC23032.mo22000().mo45917().clone();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC5878 m23616() {
        return this.f28654.mo2875();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m23608() {
        return this.f28653;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m23614() {
        return this.f28657;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m23615() {
        return this.f28667.get() > 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23605() {
        long jIncrementAndGet = this.f28667.incrementAndGet();
        InterfaceC25186 interfaceC25186 = f28650;
        if (interfaceC25186.mo13713()) {
            interfaceC25186.mo13717("Acquire session " + jIncrementAndGet + " " + this);
        }
        if (jIncrementAndGet == 1) {
            synchronized (this) {
                if (this.f28661.compareAndSet(false, true)) {
                    interfaceC25186.mo13721("Reacquire transport");
                    this.f28655.m1084();
                }
            }
        }
    }

    public final void finalize() {
        if (!m23618() || this.f28667.get() == 0) {
            return;
        }
        f28650.mo13729("Session was not properly released");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        m23611();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m23611() {
        long jDecrementAndGet = this.f28667.decrementAndGet();
        InterfaceC25186 interfaceC25186 = f28650;
        if (interfaceC25186.mo13713()) {
            interfaceC25186.mo13717("Release session " + jDecrementAndGet + " " + this);
        }
        if (jDecrementAndGet != 0) {
            if (jDecrementAndGet < 0) {
                throw new C3640("Usage count dropped below zero");
            }
            return;
        }
        if (interfaceC25186.mo13707()) {
            interfaceC25186.mo13721("Usage dropped to zero, release connection " + this.f28655);
        }
        synchronized (this) {
            if (this.f28661.compareAndSet(true, false)) {
                this.f28655.m1095();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12744 m23601(String str) {
        if (str == null) {
            str = "IPC$";
        }
        synchronized (this.f28666) {
            for (C12744 c12744 : this.f28666) {
                if (c12744.m31570(str, (String) null)) {
                    c12744.m31568();
                    return c12744;
                }
            }
            C12744 c12745 = new C12744(this, str);
            c12745.m31568();
            this.f28666.add(c12745);
            return c12745;
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C14014 m23613() {
        C14014 c14014 = this.f28655;
        c14014.m1084();
        return c14014;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m23600() {
        if (m23612() != null) {
            return false;
        }
        C14014 c14014 = this.f28655;
        if (c14014.m34117()) {
            return true;
        }
        return c14014.m34131().mo11410();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m23596(InterfaceC10110 interfaceC10110) {
        C14014 c14014 = this.f28655;
        if (c14014.m34133()) {
            this.f28663 = interfaceC10110;
        } else {
            c14014.m34123(interfaceC10110);
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10110 m23612() {
        InterfaceC10110 interfaceC10110 = this.f28663;
        return interfaceC10110 != null ? interfaceC10110 : this.f28655.m34118();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18315 m23604(InterfaceC21299 interfaceC21299, InterfaceC18315 interfaceC18315, Set set) {
        InterfaceC23032 interfaceC23032 = this.f28654;
        InterfaceC25186 interfaceC25186 = f28650;
        C14014 c14014 = this.f28655;
        c14014.m1084();
        if (interfaceC18315 != null) {
            try {
                interfaceC18315.mo12751();
                interfaceC18315.mo10312(this.f28656);
            } catch (Throwable th) {
                try {
                    c14014.m1095();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        try {
            if (set.contains(EnumC13269.NO_TIMEOUT)) {
                this.f28651 = -1L;
            } else {
                this.f28651 = System.currentTimeMillis() + ((long) ((C14826) interfaceC23032.mo2875()).m35737());
            }
            try {
                InterfaceC18315 interfaceC18316 = (InterfaceC18315) m23602(interfaceC21299, interfaceC18315);
                if (interfaceC18316 != null && interfaceC18316.mo12784()) {
                    interfaceC21299.mo10310((InterfaceC10110) null);
                    this.f28651 = System.currentTimeMillis() + ((long) ((C14826) interfaceC23032.mo2875()).m35737());
                    c14014.m1095();
                    return interfaceC18316;
                }
                if (interfaceC21299 instanceof C23888) {
                    C23888 c23888 = (C23888) interfaceC21299;
                    if (this.f28664 != null && c23888.getPath().endsWith("\\IPC$")) {
                        c23888.mo1463("\\\\" + this.f28664 + "\\IPC$");
                    }
                }
                interfaceC21299.mo10336(this.f28652);
                interfaceC21299.mo10335(this.f28660);
                if (interfaceC21299.getDigest() == null) {
                    interfaceC21299.mo10310(m23612());
                }
                boolean z = interfaceC21299 instanceof InterfaceC7874;
                String str = this.f28653;
                if (z) {
                    ((InterfaceC7874) interfaceC21299).mo1464(str, this.f28657, ((InterfaceC7874) interfaceC21299).mo1460());
                }
                try {
                    try {
                        if (interfaceC25186.mo13713()) {
                            interfaceC25186.mo13717("Request " + interfaceC21299);
                        }
                        try {
                            InterfaceC18315 interfaceC18315M34135 = c14014.m34135(interfaceC21299, interfaceC18315, set);
                            if (interfaceC25186.mo13713()) {
                                interfaceC25186.mo13717("Response " + interfaceC18315M34135);
                            }
                            interfaceC21299.mo10310((InterfaceC10110) null);
                            this.f28651 = System.currentTimeMillis() + ((long) ((C14826) interfaceC23032.mo2875()).m35737());
                            c14014.m1095();
                            return interfaceC18315M34135;
                        } catch (C20728 e) {
                            if ((e.m47408() != -1073740964 && e.m47408() != -1073741309) || !c14014.m34133()) {
                                throw e;
                            }
                            if (e.m47408() == -1073741309) {
                                try {
                                    interfaceC25186.mo13729("Got NT_STATUS_USER_SESSION_DELETED, disconnecting transport");
                                    c14014.m1098();
                                } catch (IOException e2) {
                                    interfaceC25186.mo13702("Got NT_STATUS_USER_SESSION_DELETED, disconnected transport with error", (Throwable) e2);
                                }
                            }
                            interfaceC25186.mo13711("Session expired, trying reauth", e);
                            InterfaceC18315 interfaceC18315M23595 = m23595(c14014, str, interfaceC21299, set);
                            interfaceC21299.mo10310((InterfaceC10110) null);
                            this.f28651 = System.currentTimeMillis() + ((long) ((C14826) interfaceC23032.mo2875()).m35737());
                            c14014.m1095();
                            return interfaceC18315M23595;
                        }
                    } catch (C18578 e3) {
                        if (interfaceC25186.mo13707()) {
                            interfaceC25186.mo13721("Have referral " + e3);
                        }
                        throw e3;
                    }
                } catch (C20728 e4) {
                    if (interfaceC25186.mo13713()) {
                        interfaceC25186.mo13722("Send failed", (Exception) e4);
                        interfaceC25186.mo13717("Request: " + interfaceC21299);
                        interfaceC25186.mo13717("Response: " + interfaceC18315);
                    }
                    throw e4;
                }
            } catch (GeneralSecurityException e5) {
                throw new C20728("Session setup failed", e5);
            }
        } catch (Throwable th3) {
            interfaceC21299.mo10310((InterfaceC10110) null);
            this.f28651 = System.currentTimeMillis() + ((long) ((C14826) interfaceC23032.mo2875()).m35737());
            throw th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r25v0, types: [l.۬ܿ᩵] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v6, types: [l.ܿۨ᩵] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private InterfaceC18315 m23594(C14014 c14014, String str) throws C20728 {
        Subject subject;
        InterfaceC24546 interfaceC24546;
        ?? r9;
        C24348 c24348;
        C3464 c3464 = (C3464) c14014.m34131();
        byte[] bArrM11403 = c3464.m11403();
        int i = ((c3464.m11416() & 2) != 0 || c14014.m34117()) ? 2 : 1;
        InterfaceC24546 interfaceC24547 = this.f28665;
        boolean zMo45913 = interfaceC24547.mo45913();
        boolean zM56406 = c3464.mo11409().m56406(EnumC25270.SMB311);
        ?? r15 = 0;
        byte[] bArrM34132 = zM56406 ? c14014.m34132() : null;
        this.f28659 = bArrM34132;
        InterfaceC25186 interfaceC25186 = f28650;
        if (bArrM34132 != null && interfaceC25186.mo13707()) {
            byte[] bArr = this.f28659;
            interfaceC25186.mo13721("Initial session preauth hash ".concat(C6033.m17504(bArr, 0, bArr.length)));
        }
        boolean z = zMo45913;
        long jM10302 = 0;
        InterfaceC16998 interfaceC16998M23603 = null;
        C24348 c24349 = null;
        C20728 c20728 = null;
        while (true) {
            if (interfaceC16998M23603 == null) {
                interfaceC16998M23603 = m23603(c14014, str, c3464, !z, null);
                subject = null;
            } else {
                subject = null;
            }
            byte[] bArrM23598 = m23598(interfaceC16998M23603, bArrM11403, subject);
            if (bArrM23598 != null) {
                InterfaceC23032 context = this.f28655.getContext();
                int iM11414 = c3464.m11414();
                long j = jM10302;
                interfaceC24546 = interfaceC24547;
                ?? r10 = r15;
                C6448 c6448 = new C6448(context, i, iM11414, 0L, bArrM23598);
                c6448.mo10336(j);
                c6448.mo10333();
                try {
                    c24348 = (C24348) c14014.m34135(c6448, r10, EnumSet.of(EnumC13269.RETAIN_PAYLOAD));
                    jM10302 = c24348.m10302();
                } catch (C16252 e) {
                    throw e;
                } catch (C20728 e2) {
                    C24348 c243410 = (C24348) c6448.mo1727();
                    if (e2.m47408() == -1073741811) {
                        throw new C16252("Login failed", e2);
                    }
                    if (!c243410.mo12784() || c243410.mo12788() || (c243410.m10323() != 0 && c243410.m10323() != -1073741802)) {
                        throw e2;
                    }
                    c20728 = e2;
                    c24348 = c243410;
                    jM10302 = j;
                }
                this.f28654.mo2875().getClass();
                if (c24348.m54387() && !interfaceC24546.mo45914() && !interfaceC24546.mo45913()) {
                    throw new C16252(-1073741715);
                }
                if (!interfaceC24546.mo45913() && c24348.m54387()) {
                    z = true;
                }
                if ((c24348.m54388() & 4) != 0) {
                    throw new C5287("Server requires encryption, not yet supported.");
                }
                if (zM56406) {
                    byte[] bArrM10317 = c6448.m10317();
                    this.f28659 = c14014.m34127(bArrM10317.length, bArrM10317, this.f28659);
                    if (c24348.m10323() == -1073741802) {
                        byte[] bArrM10318 = c24348.m10317();
                        this.f28659 = c14014.m34127(bArrM10318.length, bArrM10318, this.f28659);
                    }
                }
                c24349 = c24348;
                bArrM11403 = c24348.m54386();
                r9 = r10;
            } else {
                interfaceC24546 = interfaceC24547;
                r9 = r15;
                bArrM11403 = bArrM23598;
            }
            boolean z2 = z;
            if (interfaceC16998M23603.mo5496()) {
                interfaceC25186.mo13721("Context is established");
                this.f28664 = r9;
                byte[] bArrMo5498 = interfaceC16998M23603.mo5498();
                if (bArrMo5498 != null) {
                    byte[] bArr2 = new byte[16];
                    System.arraycopy(bArrMo5498, 0, bArr2, 0, Math.min(16, bArrMo5498.length));
                    this.f28658 = bArr2;
                }
                boolean z3 = (c24349 == null || (c24349.m10332() & 8) == 0) ? false : true;
                if (!z2 && (m23600() || z3)) {
                    if (interfaceC16998M23603.mo5498() != null && c24349 != null) {
                        if (this.f28659 != null && interfaceC25186.mo13707()) {
                            byte[] bArr3 = this.f28659;
                            interfaceC25186.mo13721("Final preauth integrity hash ".concat(C6033.m17504(bArr3, 0, bArr3.length)));
                        }
                        C24043 c24043 = new C24043(this.f28658, c3464.m11408(), this.f28659);
                        if (c3464.mo11409().m56406(EnumC25270.SMB300) || (c24349.m10332() & 8) != 0) {
                            c24349.mo10310(c24043);
                            byte[] bArrM10319 = c24349.m10317();
                            if (!c24349.m30280(0, bArrM10319.length, bArrM10319)) {
                                throw new C20728("Signature validation failed");
                            }
                        }
                        m23596(c24043);
                    } else {
                        c14014.getContext().mo2875().getClass();
                    }
                } else if (interfaceC25186.mo13707()) {
                    interfaceC25186.mo13721("No digest setup " + z2 + " B " + m23600());
                }
                this.f28656 = true;
                this.f28662.set(2);
                this.f28652 = c24349.m10302();
                if (c20728 != null) {
                    throw c20728;
                }
                return c24349.m10334();
            }
            z = z2;
            interfaceC24547 = interfaceC24546;
            interfaceC25186 = interfaceC25186;
            r15 = r9;
            c3464 = c3464;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m23598(InterfaceC16998 interfaceC16998, byte[] bArr, Subject subject) throws C20728 {
        if (subject == null) {
            return interfaceC16998.mo5497(bArr == null ? 0 : bArr.length, bArr);
        }
        try {
            return (byte[]) Subject.doAs(subject, new C9539(interfaceC16998, bArr));
        } catch (PrivilegedActionException e) {
            if (e.getException() instanceof C20728) {
                throw ((C20728) e.getException());
            }
            throw new C20728("Unexpected exception during context initialization", e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC16998 m23603(C14014 c14014, String str, C3464 c3464, boolean z, Subject subject) throws C20728 {
        InterfaceC25186 interfaceC25186 = f28650;
        String strMo28041 = this.f28657;
        if (strMo28041 == null) {
            strMo28041 = c14014.m34116().mo28041();
            try {
                strMo28041 = c14014.m34116().mo28044();
            } catch (Exception e) {
                interfaceC25186.mo13711("Failed to resolve host name", e);
            }
        }
        String str2 = strMo28041;
        if (interfaceC25186.mo13707()) {
            interfaceC25186.mo13721("Remote host is " + str2);
        }
        if (subject != null) {
            try {
                return (InterfaceC16998) Subject.doAs(subject, new C2828(this, str, str2, c3464, z));
            } catch (PrivilegedActionException e2) {
                if (e2.getException() instanceof C20728) {
                    throw ((C20728) e2.getException());
                }
                throw new C20728("Unexpected exception during context initialization", e2);
            }
        }
        return this.f28665.mo45910(this.f28655.getContext(), str2, c3464.m11403(), z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private InterfaceC18315 m23595(C14014 c14014, String str, InterfaceC21299 interfaceC21299, Set set) {
        C24348 c24348;
        C3464 c3464 = (C3464) c14014.m34131();
        byte[] bArrM11403 = c3464.m11403();
        boolean z = (c3464.m11416() == 0 || this.f28665.mo45913()) ? false : true;
        long j = this.f28652;
        synchronized (c14014) {
            this.f28665.getClass();
            this.f28665.getClass();
            InterfaceC16998 interfaceC16998M23603 = m23603(c14014, str, c3464, z, null);
            C24348 c24349 = null;
            C20728 c20728 = null;
            do {
                byte[] bArrM23598 = m23598(interfaceC16998M23603, bArrM11403, (Subject) null);
                if (bArrM23598 != null) {
                    C6448 c6448 = new C6448(this.f28655.getContext(), c3464.m11416(), c3464.m11414(), j, bArrM23598);
                    if (interfaceC21299 != 0) {
                        c6448.mo10313((AbstractC3159) interfaceC21299);
                    }
                    c6448.mo10310(this.f28663);
                    c6448.mo10336(j);
                    try {
                        try {
                            try {
                                c24348 = (C24348) c14014.m34135(c6448, null, EnumSet.of(EnumC13269.RETAIN_PAYLOAD));
                                if (c24348.m10302() != j) {
                                    throw new C16252("Server did not reauthenticate after expiration");
                                }
                            } catch (C20728 e) {
                                e = e;
                                C24348 c243410 = (C24348) c6448.mo1727();
                                if (!c243410.mo12784() || c243410.mo12788() || (c243410.m10323() != 0 && c243410.m10323() != -1073741802)) {
                                    throw e;
                                }
                                c20728 = e;
                                c24348 = c243410;
                            }
                        } catch (C20728 e2) {
                            e = e2;
                        }
                        this.f28654.mo2875().getClass();
                        if (c24348.m54387() && !this.f28665.mo45914() && !this.f28665.mo45913()) {
                            throw new C16252(-1073741715);
                        }
                        this.f28665.mo45913();
                        if (c6448.getDigest() != null) {
                            f28650.mo13721("Setting digest");
                            m23596(c6448.getDigest());
                        }
                        c24349 = c24348;
                        bArrM11403 = c24348.m54386();
                    } catch (C16252 e3) {
                        throw e3;
                    }
                } else {
                    bArrM11403 = bArrM23598;
                }
                if (c20728 != null) {
                    throw c20728;
                }
            } while (!interfaceC16998M23603.mo5496());
            this.f28656 = true;
            this.f28662.set(2);
            this.f28652 = c24349.m10302();
            InterfaceC18315 interfaceC18315M10334 = c24349.m10334();
            if (interfaceC18315M10334 != null && interfaceC18315M10334.mo12784()) {
                return interfaceC18315M10334;
            }
            if (interfaceC21299 != 0) {
                return this.f28655.m34135(interfaceC21299, null, set);
            }
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:176:0x0343 A[LOOP:0: B:3:0x001d->B:176:0x0343, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:206:0x0342 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m23597(C14014 c14014, String str, AbstractC3971 abstractC3971, AbstractC3971 abstractC3972) throws C20728 {
        C17174 c17174;
        byte[] bArr;
        C20728 c16252;
        String str2;
        C5242 c5242 = (C5242) c14014.m34131();
        InterfaceC24546 interfaceC24546 = this.f28665;
        int i = 10;
        InterfaceC16998 interfaceC16998Mo45910 = null;
        C20728 c20728 = null;
        InterfaceC21299 interfaceC21299 = null;
        C17174 c17175 = null;
        boolean zMo45913 = interfaceC24546.mo45913();
        byte[] bArrM40338 = new byte[0];
        while (true) {
            AtomicInteger atomicInteger = this.f28662;
            InterfaceC23032 interfaceC23032 = this.f28654;
            int i2 = 20;
            C14014 c14015 = this.f28655;
            C20728 c20729 = c20728;
            InterfaceC25186 interfaceC25186 = f28650;
            if (i == 10) {
                InterfaceC21299 interfaceC212910 = interfaceC21299;
                if (c14014.m34131().mo11406(Integer.MIN_VALUE)) {
                    interfaceC25186.mo13721("Extended security negotiated");
                    c20728 = c20729;
                    interfaceC21299 = interfaceC212910;
                } else {
                    c14015.getContext().mo2875().getClass();
                    interfaceC25186.mo13721("Performing legacy session setup");
                    if (!(interfaceC24546 instanceof C19982)) {
                        throw new C16252("Incompatible credentials");
                    }
                    C19982 c19982 = (C19982) interfaceC24546;
                    InterfaceC21299 c25380 = new C25380(c14015.getContext(), c5242, abstractC3971, interfaceC24546);
                    c25380.mo10310(m23612());
                    byte[] bArr2 = bArrM40338;
                    C17174 c17176 = new C17174(c14015.getContext().mo2875(), abstractC3972);
                    c17176.mo10312(false);
                    if (!zMo45913 && m23600()) {
                        InterfaceC23032 context = c14015.getContext();
                        if ((c19982 instanceof C11031) && ((C11031) c19982).m27890()) {
                            context.mo2875().getClass();
                        }
                        interfaceC25186.mo13721("Initialize signing");
                        InterfaceC23032 context2 = c14015.getContext();
                        byte[] bArr3 = c5242.m15750().f67493;
                        int iM35718 = ((C14826) context2.mo2875()).m35718();
                        if (iM35718 == 0 || iM35718 == 1 || iM35718 == 2) {
                            byte[] bArr4 = new byte[40];
                            c19982.m45911(context2, bArr3, bArr4);
                            System.arraycopy(c19982.m45916(context2, bArr3), 0, bArr4, 16, 24);
                            bArr = bArr4;
                        } else {
                            if (iM35718 == 3 || iM35718 == 4 || iM35718 == 5) {
                                throw new C20728("NTLMv2 requires extended security (jcifs.smb.client.useExtendedSecurity must be true if jcifs.smb.lmCompatibility >= 3)");
                            }
                            bArr = null;
                        }
                        if (bArr == null) {
                            throw new C20728("Need a signature key but the server did not provide one");
                        }
                        c25380.mo10310(new C24109(bArr, 0));
                    }
                    try {
                        c14014.m34124(c25380, (AbstractC3971) c17176);
                        c20728 = c20729;
                    } catch (C16252 e) {
                        throw e;
                    } catch (C20728 e2) {
                        c20728 = e2;
                    }
                    interfaceC23032.mo2875().getClass();
                    if (c17176.m40339() && c5242.m15750().f67485 != 0 && !interfaceC24546.mo45914() && !interfaceC24546.mo45913()) {
                        throw new C16252(-1073741715);
                    }
                    if (!interfaceC24546.mo45913() && c17176.m40339()) {
                        zMo45913 = true;
                    }
                    if (c20728 != null) {
                        throw c20728;
                    }
                    this.f28660 = c17176.m12791();
                    if (c25380.getDigest() != null) {
                        m23596(c25380.getDigest());
                    } else if (!zMo45913 && m23600()) {
                        throw new C20728("Signing required but no session key available");
                    }
                    this.f28656 = c17176.m12787();
                    atomicInteger.set(2);
                    c17174 = c17176;
                    bArrM40338 = bArr2;
                    interfaceC21299 = c25380;
                    i = 0;
                }
                if (i == 0) {
                    return;
                } else {
                    c17175 = c17174;
                }
            } else {
                if (i != 20) {
                    throw new C20728(C13645.m33382(i, "Unexpected session setup state: "));
                }
                boolean z = (zMo45913 || (c5242.m15753() & 4) == 0) ? false : true;
                if (interfaceC16998Mo45910 == null) {
                    String strMo28044 = this.f28657;
                    if (strMo28044 == null) {
                        String strMo28041 = c14014.m34116().mo28041();
                        try {
                            strMo28044 = c14014.m34116().mo28044();
                            str2 = strMo28044;
                        } catch (Exception e3) {
                            interfaceC25186.mo13711("Failed to resolve host name", e3);
                            str2 = strMo28041;
                        }
                    } else {
                        str2 = strMo28044;
                    }
                    if (interfaceC25186.mo13707()) {
                        interfaceC25186.mo13721("Remote host is " + str2);
                    }
                    interfaceC16998Mo45910 = interfaceC24546.mo45910(c14015.getContext(), str2, c5242.m15750().f67493, z);
                } else {
                    interfaceC21299 = interfaceC21299;
                }
                if (interfaceC25186.mo13713()) {
                    interfaceC25186.mo13717(interfaceC16998Mo45910.toString());
                }
                try {
                    byte[] bArrMo5497 = interfaceC16998Mo45910.mo5497(bArrM40338 == null ? 0 : bArrM40338.length, bArrM40338);
                    if (bArrMo5497 != null) {
                        InterfaceC21299 c25381 = new C25380(c14015.getContext(), c5242, null, bArrMo5497);
                        c25381.mo10310(m23612());
                        if (z && interfaceC16998Mo45910.mo5496() && m23600()) {
                            byte[] bArrMo5498 = interfaceC16998Mo45910.mo5498();
                            if (bArrMo5498 != null) {
                                c25381.mo10310(new C24109(bArrMo5498));
                            }
                            this.f28658 = bArrMo5498;
                        } else {
                            interfaceC25186.mo13717("Not yet initializing signing");
                        }
                        C17174 c17177 = new C17174(c14015.getContext().mo2875(), null);
                        c17177.mo10312(true);
                        c25381.mo10335(this.f28660);
                        this.f28660 = 0;
                        try {
                            c14014.m34124(c25381, (AbstractC3971) c17177);
                            c16252 = c20729;
                        } catch (C16252 e4) {
                            throw e4;
                        } catch (C20728 e5) {
                            c16252 = e5;
                            if (c16252.m47408() == -1073741811) {
                                c16252 = new C16252("Login failed", c16252);
                            }
                            try {
                                c14014.m1098();
                            } catch (Exception e6) {
                                interfaceC25186.mo13711("Failed to disconnect transport", e6);
                            }
                        }
                        interfaceC23032.mo2875().getClass();
                        if (c17177.m40339() && !interfaceC24546.mo45914() && !interfaceC24546.mo45913()) {
                            throw new C16252(-1073741715);
                        }
                        if (!interfaceC24546.mo45913() && c17177.m40339()) {
                            zMo45913 = true;
                        }
                        if (c16252 != null) {
                            throw c16252;
                        }
                        this.f28660 = c17177.m12791();
                        if (c25381.getDigest() != null) {
                            interfaceC25186.mo13721("Setting digest");
                            m23596(c25381.getDigest());
                        }
                        bArrM40338 = c17177.m40338();
                        c17174 = c17177;
                        interfaceC21299 = c25381;
                    } else {
                        bArrM40338 = bArrMo5497;
                        c17174 = c17175;
                        interfaceC21299 = interfaceC21299;
                        c16252 = c20729;
                    }
                    if (interfaceC16998Mo45910.mo5496()) {
                        interfaceC25186.mo13721("Context is established");
                        this.f28664 = null;
                        this.f28658 = interfaceC16998Mo45910.mo5498();
                        if (interfaceC21299 != null && interfaceC21299.getDigest() != null) {
                            m23596(interfaceC21299.getDigest());
                        } else if (!zMo45913 && m23600()) {
                            byte[] bArrMo5499 = interfaceC16998Mo45910.mo5498();
                            if (bArrMo5499 == null || c17174 == null) {
                                c14014.getContext().mo2875().getClass();
                            } else {
                                m23596(new C24109(bArrMo5499, (Object) null));
                            }
                            this.f28658 = bArrMo5499;
                        }
                        this.f28656 = c17174.m12787();
                        atomicInteger.set(2);
                        i2 = 0;
                        c20728 = c16252;
                        c17175 = c17174;
                    } else {
                        c20728 = c16252;
                    }
                    if (i == 0) {
                        return;
                    } else {
                        c17175 = c17174;
                    }
                } catch (C20728 e7) {
                    try {
                        interfaceC25186.mo13702("Exception during SSP authentication", (Throwable) e7);
                        c14014.m1098();
                    } catch (IOException unused) {
                        interfaceC25186.mo13721("Disconnect failed");
                    }
                    this.f28660 = 0;
                    throw e7;
                }
            }
            c17174 = c17175;
            i = i2;
            if (i == 0) {
                return;
            } else {
                c17175 = c17174;
            }
        }
    }

    public final String toString() {
        return "SmbSession[credentials=" + this.f28654.mo22000() + ",targetHost=" + this.f28657 + ",targetDomain=" + this.f28653 + ",uid=" + this.f28660 + ",connectionState=" + this.f28662 + ",usage=" + this.f28667.get() + "]";
    }

    public final InterfaceC23032 getContext() {
        return this.f28655.getContext();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14585 m23602(InterfaceC21299 interfaceC21299, InterfaceC18315 interfaceC18315) {
        C14014 c14014 = this.f28655;
        c14014.m1084();
        try {
            synchronized (c14014) {
                while (!this.f28662.compareAndSet(0, 1)) {
                    try {
                        int i = this.f28662.get();
                        if (i == 2 || i == 3) {
                            c14014.m1095();
                            return interfaceC18315;
                        }
                        try {
                            this.f28655.wait();
                        } catch (InterruptedException e) {
                            throw new C20728(e.getMessage(), e);
                        }
                    } catch (Throwable th) {
                        c14014.notifyAll();
                        throw th;
                    }
                }
                try {
                    c14014.m34136();
                    InterfaceC25186 interfaceC25186 = f28650;
                    if (interfaceC25186.mo13707()) {
                        interfaceC25186.mo13721("sessionSetup: " + this.f28665);
                    }
                    this.f28660 = 0;
                    if (!c14014.m34133()) {
                        m23597(c14014, this.f28653, (AbstractC3971) interfaceC21299, (AbstractC3971) interfaceC18315);
                        c14014.notifyAll();
                        c14014.m1095();
                        return interfaceC18315;
                    }
                    InterfaceC18315 interfaceC18315M23594 = m23594(c14014, this.f28653);
                    c14014.notifyAll();
                    c14014.m1095();
                    return interfaceC18315M23594;
                } catch (Exception e2) {
                    f28650.mo13711("Session setup failed", e2);
                    if (this.f28662.compareAndSet(1, 0)) {
                        m23607(true, true);
                    }
                    throw e2;
                }
            }
        } catch (Throwable th2) {
            try {
                c14014.m1095();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00de  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [l.۠ܿ᩵] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [l.۠ܿ᩵] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m23607(boolean z, boolean z2) throws Throwable {
        ?? r2;
        ?? r3 = "Logging off session while still in use ";
        try {
            try {
                try {
                    C14014 c14014 = this.f28655;
                    c14014.m1084();
                    try {
                        try {
                            synchronized (c14014) {
                                try {
                                    if (!this.f28662.compareAndSet(2, 3)) {
                                        c14014.m1095();
                                        this.f28662.set(0);
                                        this.f28663 = null;
                                        this.f28655.notifyAll();
                                        return false;
                                    }
                                    InterfaceC25186 interfaceC25186 = f28650;
                                    if (interfaceC25186.mo13707()) {
                                        interfaceC25186.mo13721("Logging off session on " + c14014);
                                    }
                                    this.f28664 = null;
                                    synchronized (this.f28666) {
                                        try {
                                            long j = this.f28667.get();
                                            if ((!z2 || j == 1) && (z2 || j <= 0)) {
                                                z2 = false;
                                            } else {
                                                interfaceC25186.mo13729("Logging off session while still in use " + this + ":" + this.f28666);
                                                z2 = true;
                                            }
                                            try {
                                                for (C12744 c12744 : this.f28666) {
                                                    try {
                                                        f28650.mo13721("Disconnect tree on logoff");
                                                        z2 |= c12744.m31571(z, false);
                                                    } catch (Exception e) {
                                                        f28650.mo13702("Failed to disconnect tree " + c12744, (Throwable) e);
                                                    }
                                                }
                                                if (z) {
                                                    if (!z) {
                                                        C2479 c2479 = new C2479(this.f28654.mo2875());
                                                        c2479.mo10310(m23612());
                                                        c2479.mo10335(this.f28660);
                                                        this.f28655.m34124((InterfaceC21299) c2479, (AbstractC3971) new C18141(this.f28654.mo2875()));
                                                        this.f28660 = 0;
                                                    }
                                                    c14014.m1095();
                                                    r2 = this;
                                                } else {
                                                    try {
                                                        if (c14014.m34133()) {
                                                            C20618 c20618 = new C20618(this.f28654.mo2875(), 2);
                                                            c20618.mo10310(m23612());
                                                            c20618.mo10336(this.f28652);
                                                            try {
                                                                this.f28655.m34124((InterfaceC21299) c20618, (AbstractC3971) null);
                                                            } catch (C20728 e2) {
                                                                f28650.mo13711("Smb2LogoffRequest failed", e2);
                                                            }
                                                        } else if (!z && ((C5242) c14014.m34131()).m15750().f67485 != 0) {
                                                            C2479 c24710 = new C2479(this.f28654.mo2875());
                                                            c24710.mo10310(m23612());
                                                            c24710.mo10335(this.f28660);
                                                            try {
                                                                this.f28655.m34124((InterfaceC21299) c24710, (AbstractC3971) new C18141(this.f28654.mo2875()));
                                                            } catch (C20728 e3) {
                                                                f28650.mo13711("SmbComLogoffAndX failed", e3);
                                                            }
                                                            this.f28660 = 0;
                                                        }
                                                        try {
                                                            c14014.m1095();
                                                            r2 = this;
                                                        } catch (C20728 e4) {
                                                            e = e4;
                                                            r3 = this;
                                                            f28650.mo13702("Error in logoff", (Throwable) e);
                                                            r2 = r3;
                                                        }
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        r3 = this;
                                                        try {
                                                            throw th;
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                            try {
                                                                c14014.m1095();
                                                            } catch (Throwable th3) {
                                                                try {
                                                                    th.addSuppressed(th3);
                                                                } catch (C20728 e5) {
                                                                    e = e5;
                                                                }
                                                            }
                                                            throw th;
                                                        }
                                                    }
                                                }
                                                r2.f28662.set(0);
                                                r2.f28663 = null;
                                                r2.f28655.notifyAll();
                                                return z2;
                                            } catch (Throwable th4) {
                                                th = th4;
                                                while (true) {
                                                    try {
                                                        throw th;
                                                    } catch (Throwable th5) {
                                                        th = th5;
                                                    }
                                                }
                                            }
                                        } catch (Throwable th6) {
                                            th = th6;
                                        }
                                    }
                                    r2.f28662.set(0);
                                    r2.f28663 = null;
                                    r2.f28655.notifyAll();
                                    return z2;
                                } catch (Throwable th7) {
                                    th = th7;
                                    z2 = false;
                                }
                                r3 = this;
                                f28650.mo13702("Error in logoff", (Throwable) e);
                                r2 = r3;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        z2 = false;
                        r3 = this;
                        c14014.m1095();
                        throw th;
                    }
                } catch (Throwable th10) {
                    th = th10;
                    r3.f28662.set(0);
                    r3.f28663 = null;
                    r3.f28655.notifyAll();
                    throw th;
                }
            } catch (Throwable th11) {
                th = th11;
                r3 = this;
                r3.f28662.set(0);
                r3.f28663 = null;
                r3.f28655.notifyAll();
                throw th;
            }
        } catch (C20728 e6) {
            e = e6;
            z2 = false;
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Long m23610() {
        long j = this.f28651;
        if (j > 0) {
            return Long.valueOf(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m23606(InterfaceC23032 interfaceC23032, String str, String str2) {
        return C17359.equals(this.f28665, interfaceC23032.mo22000()) && C17359.equals(this.f28657, str) && C17359.equals(this.f28653, str2);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC24546 m23609() {
        return this.f28665;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m23618() {
        return !this.f28655.mo1093() && this.f28662.get() == 2;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean m23599() {
        return this.f28655.mo1090();
    }
}
