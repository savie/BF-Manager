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

/* JADX INFO: renamed from: l.֨ۤ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: E9ZA */
/* JADX INFO: loaded from: classes2.dex */
public final class C1053 implements InterfaceC13049 {

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC4314 f4872 = C13488.m32997(C1053.class);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public InterfaceC5619 f4873;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f4874;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC19067 f4877;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public byte[] f4878;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C3875 f4879;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f4880;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public int f4881;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f4882;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f4883;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f4884;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f4886;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC23901 f4888;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public byte[] f4889;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f4885 = new AtomicInteger();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f4887 = null;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final AtomicLong f4875 = new AtomicLong(1);

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f4876 = new AtomicBoolean(true);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13049 m3983() {
        if (InterfaceC13049.class.isAssignableFrom(C1053.class)) {
            return this;
        }
        throw new ClassCastException();
    }

    public C1053(InterfaceC19067 interfaceC19067, String str, String str2, C3875 c3875) {
        this.f4877 = interfaceC19067;
        this.f4884 = str2;
        this.f4874 = str;
        c3875.m9577();
        this.f4879 = c3875;
        this.f4883 = new ArrayList();
        this.f4888 = interfaceC19067.mo13093().mo43146().clone();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10601 m3981() {
        return this.f4877.mo29449();
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String m3982() {
        return this.f4884;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m3989() {
        return this.f4874;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m3987() {
        return this.f4875.get() > 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3977() {
        long jIncrementAndGet = this.f4875.incrementAndGet();
        InterfaceC4314 interfaceC4314 = f4872;
        if (interfaceC4314.mo12133()) {
            interfaceC4314.mo12127("Acquire session " + jIncrementAndGet + " " + this);
        }
        if (jIncrementAndGet == 1) {
            synchronized (this) {
                if (this.f4876.compareAndSet(false, true)) {
                    interfaceC4314.mo12135("Reacquire transport");
                    this.f4879.m9577();
                }
            }
        }
    }

    public final void finalize() {
        if (!m3986() || this.f4875.get() == 0) {
            return;
        }
        f4872.mo12116("Session was not properly released");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        m3984();
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m3984() {
        long jDecrementAndGet = this.f4875.decrementAndGet();
        InterfaceC4314 interfaceC4314 = f4872;
        if (interfaceC4314.mo12133()) {
            interfaceC4314.mo12127("Release session " + jDecrementAndGet + " " + this);
        }
        if (jDecrementAndGet != 0) {
            if (jDecrementAndGet < 0) {
                throw new C17655("Usage count dropped below zero");
            }
            return;
        }
        if (interfaceC4314.mo12125()) {
            interfaceC4314.mo12135("Usage dropped to zero, release connection " + this.f4879);
        }
        synchronized (this) {
            if (this.f4876.compareAndSet(true, false)) {
                this.f4879.m9589();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8110 m3974(String str) {
        if (str == null) {
            str = "IPC$";
        }
        synchronized (this.f4883) {
            for (C8110 c8110 : this.f4883) {
                if (c8110.m21339(str, (String) null)) {
                    c8110.m21337();
                    return c8110;
                }
            }
            C8110 c8111 = new C8110(this, str);
            c8111.m21337();
            this.f4883.add(c8111);
            return c8111;
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C3875 m3985() {
        C3875 c3875 = this.f4879;
        c3875.m9577();
        return c3875;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m3988() {
        if (m3990() != null) {
            return false;
        }
        C3875 c3875 = this.f4879;
        if (c3875.m11243()) {
            return true;
        }
        return c3875.m11246().mo11872();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m3969(InterfaceC5619 interfaceC5619) {
        C3875 c3875 = this.f4879;
        if (c3875.m11248()) {
            this.f4873 = interfaceC5619;
        } else {
            c3875.m11237(interfaceC5619);
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC5619 m3990() {
        InterfaceC5619 interfaceC5619 = this.f4873;
        return interfaceC5619 != null ? interfaceC5619 : this.f4879.m11241();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4913 m3973(InterfaceC3314 interfaceC3314, InterfaceC4913 interfaceC4913, Set set) {
        InterfaceC19067 interfaceC19067 = this.f4877;
        InterfaceC4314 interfaceC4314 = f4872;
        C3875 c3875 = this.f4879;
        c3875.m9577();
        if (interfaceC4913 != null) {
            try {
                interfaceC4913.mo17301();
                interfaceC4913.mo24569(this.f4882);
            } catch (Throwable th) {
                try {
                    c3875.m9589();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        try {
            if (set.contains(EnumC19358.NO_TIMEOUT)) {
                this.f4886 = -1L;
            } else {
                this.f4886 = System.currentTimeMillis() + ((long) ((C9895) interfaceC19067.mo29449()).m25068());
            }
            try {
                InterfaceC4913 interfaceC4914 = (InterfaceC4913) m3975(interfaceC3314, interfaceC4913);
                if (interfaceC4914 != null && interfaceC4914.mo17295()) {
                    interfaceC3314.mo24568((InterfaceC5619) null);
                    this.f4886 = System.currentTimeMillis() + ((long) ((C9895) interfaceC19067.mo29449()).m25068());
                    c3875.m9589();
                    return interfaceC4914;
                }
                if (interfaceC3314 instanceof C16803) {
                    C16803 c16803 = (C16803) interfaceC3314;
                    if (this.f4887 != null && c16803.getPath().endsWith("\\IPC$")) {
                        c16803.mo12623("\\\\" + this.f4887 + "\\IPC$");
                    }
                }
                interfaceC3314.mo24572(this.f4880);
                interfaceC3314.mo24571(this.f4881);
                if (interfaceC3314.getDigest() == null) {
                    interfaceC3314.mo24568(m3990());
                }
                boolean z = interfaceC3314 instanceof InterfaceC11970;
                String str = this.f4884;
                if (z) {
                    ((InterfaceC11970) interfaceC3314).mo12624(str, this.f4874, ((InterfaceC11970) interfaceC3314).mo12625());
                }
                try {
                    try {
                        if (interfaceC4314.mo12133()) {
                            interfaceC4314.mo12127("Request " + interfaceC3314);
                        }
                        try {
                            InterfaceC4913 interfaceC4913M11245 = c3875.m11245(interfaceC3314, interfaceC4913, set);
                            if (interfaceC4314.mo12133()) {
                                interfaceC4314.mo12127("Response " + interfaceC4913M11245);
                            }
                            interfaceC3314.mo24568((InterfaceC5619) null);
                            this.f4886 = System.currentTimeMillis() + ((long) ((C9895) interfaceC19067.mo29449()).m25068());
                            c3875.m9589();
                            return interfaceC4913M11245;
                        } catch (C12303 e) {
                            if ((e.m30561() != -1073740964 && e.m30561() != -1073741309) || !c3875.m11248()) {
                                throw e;
                            }
                            if (e.m30561() == -1073741309) {
                                try {
                                    interfaceC4314.mo12116("Got NT_STATUS_USER_SESSION_DELETED, disconnecting transport");
                                    c3875.m9584();
                                } catch (IOException e2) {
                                    interfaceC4314.mo12122("Got NT_STATUS_USER_SESSION_DELETED, disconnected transport with error", (Throwable) e2);
                                }
                            }
                            interfaceC4314.mo12120("Session expired, trying reauth", (Exception) e);
                            InterfaceC4913 interfaceC4913M3967 = m3967(c3875, str, interfaceC3314, set);
                            interfaceC3314.mo24568((InterfaceC5619) null);
                            this.f4886 = System.currentTimeMillis() + ((long) ((C9895) interfaceC19067.mo29449()).m25068());
                            c3875.m9589();
                            return interfaceC4913M3967;
                        }
                    } catch (C12303 e3) {
                        if (interfaceC4314.mo12133()) {
                            interfaceC4314.mo12131("Send failed", e3);
                            interfaceC4314.mo12127("Request: " + interfaceC3314);
                            interfaceC4314.mo12127("Response: " + interfaceC4913);
                        }
                        throw e3;
                    }
                } catch (C3438 e4) {
                    if (interfaceC4314.mo12125()) {
                        interfaceC4314.mo12135("Have referral " + e4);
                    }
                    throw e4;
                }
            } catch (GeneralSecurityException e5) {
                throw new C12303("Session setup failed", e5);
            }
        } catch (Throwable th3) {
            interfaceC3314.mo24568((InterfaceC5619) null);
            this.f4886 = System.currentTimeMillis() + ((long) ((C9895) interfaceC19067.mo29449()).m25068());
            throw th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r25v0, types: [l.ۘۤ۠] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v6, types: [l.ۙ᩸۠] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private InterfaceC4913 m3966(C3875 c3875, String str) throws C12303 {
        Subject subject;
        InterfaceC23901 interfaceC23901;
        ?? r9;
        C23571 c23571;
        C12282 c12282 = (C12282) c3875.m11246();
        byte[] bArrM30521 = c12282.m30521();
        int i = ((c12282.m30518() & 2) != 0 || c3875.m11243()) ? 2 : 1;
        InterfaceC23901 interfaceC23902 = this.f4888;
        boolean zMo43144 = interfaceC23902.mo43144();
        boolean zM38366 = c12282.mo11862().m38366(EnumC16245.SMB311);
        ?? r15 = 0;
        byte[] bArrM11230 = zM38366 ? c3875.m11230() : null;
        this.f4878 = bArrM11230;
        InterfaceC4314 interfaceC4314 = f4872;
        if (bArrM11230 != null && interfaceC4314.mo12125()) {
            byte[] bArr = this.f4878;
            interfaceC4314.mo12135("Initial session preauth hash ".concat(C5993.m16281(bArr, 0, bArr.length)));
        }
        boolean z = zMo43144;
        long jM31344 = 0;
        InterfaceC20769 interfaceC20769M3976 = null;
        C23571 c23572 = null;
        C12303 c12303 = null;
        while (true) {
            if (interfaceC20769M3976 == null) {
                interfaceC20769M3976 = m3976(c3875, str, c12282, !z, null);
                subject = null;
            } else {
                subject = null;
            }
            byte[] bArrM3970 = m3970(interfaceC20769M3976, bArrM30521, subject);
            if (bArrM3970 != null) {
                InterfaceC19067 context = this.f4879.getContext();
                int iM30523 = c12282.m30523();
                long j = jM31344;
                interfaceC23901 = interfaceC23902;
                ?? r10 = r15;
                C10871 c10871 = new C10871(context, i, iM30523, 0L, bArrM3970);
                c10871.mo24572(j);
                c10871.mo31361();
                try {
                    c23571 = (C23571) c3875.m11245(c10871, r10, EnumSet.of(EnumC19358.RETAIN_PAYLOAD));
                    jM31344 = c23571.m31344();
                } catch (C20064 e) {
                    throw e;
                } catch (C12303 e2) {
                    C23571 c23573 = (C23571) c10871.mo9821();
                    if (e2.m30561() == -1073741811) {
                        throw new C20064("Login failed", e2);
                    }
                    if (!c23573.mo17295() || c23573.mo17304() || (c23573.m31351() != 0 && c23573.m31351() != -1073741802)) {
                        throw e2;
                    }
                    c12303 = e2;
                    c23571 = c23573;
                    jM31344 = j;
                }
                this.f4877.mo29449().getClass();
                if (c23571.m52001() && !interfaceC23901.mo43145() && !interfaceC23901.mo43144()) {
                    throw new C20064(-1073741715);
                }
                if (!interfaceC23901.mo43144() && c23571.m52001()) {
                    z = true;
                }
                if ((c23571.m52002() & 4) != 0) {
                    throw new C19399("Server requires encryption, not yet supported.");
                }
                if (zM38366) {
                    byte[] bArrM31357 = c10871.m31357();
                    this.f4878 = c3875.m11240(bArrM31357.length, bArrM31357, this.f4878);
                    if (c23571.m31351() == -1073741802) {
                        byte[] bArrM31358 = c23571.m31357();
                        this.f4878 = c3875.m11240(bArrM31358.length, bArrM31358, this.f4878);
                    }
                }
                c23572 = c23571;
                bArrM30521 = c23571.m52000();
                r9 = r10;
            } else {
                interfaceC23901 = interfaceC23902;
                r9 = r15;
                bArrM30521 = bArrM3970;
            }
            boolean z2 = z;
            if (interfaceC20769M3976.mo22943()) {
                interfaceC4314.mo12135("Context is established");
                this.f4887 = r9;
                byte[] bArrMo22945 = interfaceC20769M3976.mo22945();
                if (bArrMo22945 != null) {
                    byte[] bArr2 = new byte[16];
                    System.arraycopy(bArrMo22945, 0, bArr2, 0, Math.min(16, bArrMo22945.length));
                    this.f4889 = bArr2;
                }
                boolean z3 = (c23572 == null || (c23572.m31349() & 8) == 0) ? false : true;
                if (!z2 && (m3988() || z3)) {
                    if (interfaceC20769M3976.mo22945() != null && c23572 != null) {
                        if (this.f4878 != null && interfaceC4314.mo12125()) {
                            byte[] bArr3 = this.f4878;
                            interfaceC4314.mo12135("Final preauth integrity hash ".concat(C5993.m16281(bArr3, 0, bArr3.length)));
                        }
                        C23880 c23880 = new C23880(this.f4889, c12282.m30520(), this.f4878);
                        if (c12282.mo11862().m38366(EnumC16245.SMB300) || (c23572.m31349() & 8) != 0) {
                            c23572.mo24568(c23880);
                            byte[] bArrM31359 = c23572.m31357();
                            if (!c23572.m17303(0, bArrM31359.length, bArrM31359)) {
                                throw new C12303("Signature validation failed");
                            }
                        }
                        m3969(c23880);
                    } else {
                        c3875.getContext().mo29449().getClass();
                    }
                } else if (interfaceC4314.mo12125()) {
                    interfaceC4314.mo12135("No digest setup " + z2 + " B " + m3988());
                }
                this.f4882 = true;
                this.f4885.set(2);
                this.f4880 = c23572.m31344();
                if (c12303 != null) {
                    throw c12303;
                }
                return c23572.m31362();
            }
            z = z2;
            interfaceC23902 = interfaceC23901;
            interfaceC4314 = interfaceC4314;
            r15 = r9;
            c12282 = c12282;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m3970(InterfaceC20769 interfaceC20769, byte[] bArr, Subject subject) throws C12303 {
        if (subject == null) {
            return interfaceC20769.mo22944(bArr == null ? 0 : bArr.length, bArr);
        }
        try {
            return (byte[]) Subject.doAs(subject, new C5287(interfaceC20769, bArr));
        } catch (PrivilegedActionException e) {
            if (e.getException() instanceof C12303) {
                throw ((C12303) e.getException());
            }
            throw new C12303("Unexpected exception during context initialization", e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20769 m3976(C3875 c3875, String str, C12282 c12282, boolean z, Subject subject) throws C12303 {
        InterfaceC4314 interfaceC4314 = f4872;
        String strMo36917 = this.f4874;
        if (strMo36917 == null) {
            strMo36917 = c3875.m11247().mo36917();
            try {
                strMo36917 = c3875.m11247().mo36921();
            } catch (Exception e) {
                interfaceC4314.mo12120("Failed to resolve host name", e);
            }
        }
        String str2 = strMo36917;
        if (interfaceC4314.mo12125()) {
            interfaceC4314.mo12135("Remote host is " + str2);
        }
        if (subject != null) {
            try {
                return (InterfaceC20769) Subject.doAs(subject, new C22221(this, str, str2, c12282, z));
            } catch (PrivilegedActionException e2) {
                if (e2.getException() instanceof C12303) {
                    throw ((C12303) e2.getException());
                }
                throw new C12303("Unexpected exception during context initialization", e2);
            }
        }
        return this.f4888.mo43141(this.f4879.getContext(), str2, c12282.m30521(), z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private InterfaceC4913 m3967(C3875 c3875, String str, InterfaceC3314 interfaceC3314, Set set) {
        C23571 c23571;
        C12282 c12282 = (C12282) c3875.m11246();
        byte[] bArrM30521 = c12282.m30521();
        boolean z = (c12282.m30518() == 0 || this.f4888.mo43144()) ? false : true;
        long j = this.f4880;
        synchronized (c3875) {
            this.f4888.getClass();
            this.f4888.getClass();
            InterfaceC20769 interfaceC20769M3976 = m3976(c3875, str, c12282, z, null);
            C23571 c23572 = null;
            C12303 c12303 = null;
            do {
                byte[] bArrM3970 = m3970(interfaceC20769M3976, bArrM30521, (Subject) null);
                if (bArrM3970 != null) {
                    C10871 c10871 = new C10871(this.f4879.getContext(), c12282.m30518(), c12282.m30523(), j, bArrM3970);
                    if (interfaceC3314 != 0) {
                        c10871.mo27236((AbstractC12591) interfaceC3314);
                    }
                    c10871.mo24568(this.f4873);
                    c10871.mo24572(j);
                    try {
                        try {
                            try {
                                c23571 = (C23571) c3875.m11245(c10871, null, EnumSet.of(EnumC19358.RETAIN_PAYLOAD));
                                if (c23571.m31344() != j) {
                                    throw new C20064("Server did not reauthenticate after expiration");
                                }
                            } catch (C12303 e) {
                                e = e;
                                C23571 c23573 = (C23571) c10871.mo9821();
                                if (!c23573.mo17295() || c23573.mo17304() || (c23573.m31351() != 0 && c23573.m31351() != -1073741802)) {
                                    throw e;
                                }
                                c12303 = e;
                                c23571 = c23573;
                            }
                        } catch (C20064 e2) {
                            throw e2;
                        }
                    } catch (C12303 e3) {
                        e = e3;
                    }
                    this.f4877.mo29449().getClass();
                    if (c23571.m52001() && !this.f4888.mo43145() && !this.f4888.mo43144()) {
                        throw new C20064(-1073741715);
                    }
                    this.f4888.mo43144();
                    if (c10871.getDigest() != null) {
                        f4872.mo12135("Setting digest");
                        m3969(c10871.getDigest());
                    }
                    c23572 = c23571;
                    bArrM30521 = c23571.m52000();
                } else {
                    bArrM30521 = bArrM3970;
                }
                if (c12303 != null) {
                    throw c12303;
                }
            } while (!interfaceC20769M3976.mo22943());
            this.f4882 = true;
            this.f4885.set(2);
            this.f4880 = c23572.m31344();
            InterfaceC4913 interfaceC4913M31362 = c23572.m31362();
            if (interfaceC4913M31362 != null && interfaceC4913M31362.mo17295()) {
                return interfaceC4913M31362;
            }
            if (interfaceC3314 != 0) {
                return this.f4879.m11245(interfaceC3314, null, set);
            }
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:176:0x0343 A[LOOP:0: B:3:0x001d->B:176:0x0343, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:206:0x0342 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m3968(C3875 c3875, String str, AbstractC14792 abstractC14792, AbstractC14792 abstractC14793) throws C12303 {
        C16098 c16098;
        byte[] bArr;
        C12303 c20064;
        String str2;
        C23154 c23154 = (C23154) c3875.m11246();
        InterfaceC23901 interfaceC23901 = this.f4888;
        int i = 10;
        InterfaceC20769 interfaceC20769Mo43141 = null;
        C12303 c12303 = null;
        InterfaceC3314 interfaceC3314 = null;
        C16098 c16099 = null;
        boolean zMo43144 = interfaceC23901.mo43144();
        byte[] bArrM38130 = new byte[0];
        while (true) {
            AtomicInteger atomicInteger = this.f4885;
            InterfaceC19067 interfaceC19067 = this.f4877;
            int i2 = 20;
            C3875 c3876 = this.f4879;
            C12303 c12304 = c12303;
            InterfaceC4314 interfaceC4314 = f4872;
            if (i == 10) {
                InterfaceC3314 interfaceC3315 = interfaceC3314;
                if (c3875.m11246().mo11869(Integer.MIN_VALUE)) {
                    interfaceC4314.mo12135("Extended security negotiated");
                    c12303 = c12304;
                    interfaceC3314 = interfaceC3315;
                } else {
                    c3876.getContext().mo29449().getClass();
                    interfaceC4314.mo12135("Performing legacy session setup");
                    if (!(interfaceC23901 instanceof C18652)) {
                        throw new C20064("Incompatible credentials");
                    }
                    C18652 c18652 = (C18652) interfaceC23901;
                    InterfaceC3314 c21036 = new C21036(c3876.getContext(), c23154, abstractC14792, interfaceC23901);
                    c21036.mo24568(m3990());
                    byte[] bArr2 = bArrM38130;
                    C16098 c160910 = new C16098(c3876.getContext().mo29449(), abstractC14793);
                    c160910.mo24569(false);
                    if (!zMo43144 && m3988()) {
                        InterfaceC19067 context = c3876.getContext();
                        if ((c18652 instanceof C21474) && ((C21474) c18652).m48092()) {
                            context.mo29449().getClass();
                        }
                        interfaceC4314.mo12135("Initialize signing");
                        InterfaceC19067 context2 = c3876.getContext();
                        byte[] bArr3 = c23154.m51147().f33652;
                        int iM25054 = ((C9895) context2.mo29449()).m25054();
                        if (iM25054 == 0 || iM25054 == 1 || iM25054 == 2) {
                            byte[] bArr4 = new byte[40];
                            c18652.m43142(context2, bArr3, bArr4);
                            System.arraycopy(c18652.m43147(context2, bArr3), 0, bArr4, 16, 24);
                            bArr = bArr4;
                        } else {
                            if (iM25054 == 3 || iM25054 == 4 || iM25054 == 5) {
                                throw new C12303("NTLMv2 requires extended security (jcifs.smb.client.useExtendedSecurity must be true if jcifs.smb.lmCompatibility >= 3)");
                            }
                            bArr = null;
                        }
                        if (bArr == null) {
                            throw new C12303("Need a signature key but the server did not provide one");
                        }
                        c21036.mo24568(new C23964(bArr, 0));
                    }
                    try {
                        c3875.m11236(c21036, (AbstractC14792) c160910);
                        c12303 = c12304;
                    } catch (C20064 e) {
                        throw e;
                    } catch (C12303 e2) {
                        c12303 = e2;
                    }
                    interfaceC19067.mo29449().getClass();
                    if (c160910.m38131() && c23154.m51147().f33648 != 0 && !interfaceC23901.mo43145() && !interfaceC23901.mo43144()) {
                        throw new C20064(-1073741715);
                    }
                    if (!interfaceC23901.mo43144() && c160910.m38131()) {
                        zMo43144 = true;
                    }
                    if (c12303 != null) {
                        throw c12303;
                    }
                    this.f4881 = c160910.m35448();
                    if (c21036.getDigest() != null) {
                        m3969(c21036.getDigest());
                    } else if (!zMo43144 && m3988()) {
                        throw new C12303("Signing required but no session key available");
                    }
                    this.f4882 = c160910.m35457();
                    atomicInteger.set(2);
                    c16098 = c160910;
                    bArrM38130 = bArr2;
                    interfaceC3314 = c21036;
                    i = 0;
                }
                if (i == 0) {
                    return;
                } else {
                    c16099 = c16098;
                }
            } else {
                if (i != 20) {
                    throw new C12303(C8479.m22141(i, "Unexpected session setup state: "));
                }
                boolean z = (zMo43144 || (c23154.m51151() & 4) == 0) ? false : true;
                if (interfaceC20769Mo43141 == null) {
                    String strMo36921 = this.f4874;
                    if (strMo36921 == null) {
                        String strMo36917 = c3875.m11247().mo36917();
                        try {
                            strMo36921 = c3875.m11247().mo36921();
                            str2 = strMo36921;
                        } catch (Exception e3) {
                            interfaceC4314.mo12120("Failed to resolve host name", e3);
                            str2 = strMo36917;
                        }
                    } else {
                        str2 = strMo36921;
                    }
                    if (interfaceC4314.mo12125()) {
                        interfaceC4314.mo12135("Remote host is " + str2);
                    }
                    interfaceC20769Mo43141 = interfaceC23901.mo43141(c3876.getContext(), str2, c23154.m51147().f33652, z);
                } else {
                    interfaceC3314 = interfaceC3314;
                }
                if (interfaceC4314.mo12133()) {
                    interfaceC4314.mo12127(interfaceC20769Mo43141.toString());
                }
                try {
                    byte[] bArrMo22944 = interfaceC20769Mo43141.mo22944(bArrM38130 == null ? 0 : bArrM38130.length, bArrM38130);
                    if (bArrMo22944 != null) {
                        InterfaceC3314 c21037 = new C21036(c3876.getContext(), c23154, null, bArrMo22944);
                        c21037.mo24568(m3990());
                        if (z && interfaceC20769Mo43141.mo22943() && m3988()) {
                            byte[] bArrMo22945 = interfaceC20769Mo43141.mo22945();
                            if (bArrMo22945 != null) {
                                c21037.mo24568(new C23964(bArrMo22945));
                            }
                            this.f4889 = bArrMo22945;
                        } else {
                            interfaceC4314.mo12127("Not yet initializing signing");
                        }
                        C16098 c160911 = new C16098(c3876.getContext().mo29449(), null);
                        c160911.mo24569(true);
                        c21037.mo24571(this.f4881);
                        this.f4881 = 0;
                        try {
                            c3875.m11236(c21037, (AbstractC14792) c160911);
                            c20064 = c12304;
                        } catch (C20064 e4) {
                            throw e4;
                        } catch (C12303 e5) {
                            c20064 = e5;
                            if (c20064.m30561() == -1073741811) {
                                c20064 = new C20064("Login failed", c20064);
                            }
                            try {
                                c3875.m9584();
                            } catch (Exception e6) {
                                interfaceC4314.mo12120("Failed to disconnect transport", e6);
                            }
                        }
                        interfaceC19067.mo29449().getClass();
                        if (c160911.m38131() && !interfaceC23901.mo43145() && !interfaceC23901.mo43144()) {
                            throw new C20064(-1073741715);
                        }
                        if (!interfaceC23901.mo43144() && c160911.m38131()) {
                            zMo43144 = true;
                        }
                        if (c20064 != null) {
                            throw c20064;
                        }
                        this.f4881 = c160911.m35448();
                        if (c21037.getDigest() != null) {
                            interfaceC4314.mo12135("Setting digest");
                            m3969(c21037.getDigest());
                        }
                        bArrM38130 = c160911.m38130();
                        c16098 = c160911;
                        interfaceC3314 = c21037;
                    } else {
                        bArrM38130 = bArrMo22944;
                        c16098 = c16099;
                        interfaceC3314 = interfaceC3314;
                        c20064 = c12304;
                    }
                    if (interfaceC20769Mo43141.mo22943()) {
                        interfaceC4314.mo12135("Context is established");
                        this.f4887 = null;
                        this.f4889 = interfaceC20769Mo43141.mo22945();
                        if (interfaceC3314 != null && interfaceC3314.getDigest() != null) {
                            m3969(interfaceC3314.getDigest());
                        } else if (!zMo43144 && m3988()) {
                            byte[] bArrMo22946 = interfaceC20769Mo43141.mo22945();
                            if (bArrMo22946 == null || c16098 == null) {
                                c3875.getContext().mo29449().getClass();
                            } else {
                                m3969(new C23964(bArrMo22946, (Object) null));
                            }
                            this.f4889 = bArrMo22946;
                        }
                        this.f4882 = c16098.m35457();
                        atomicInteger.set(2);
                        i2 = 0;
                        c12303 = c20064;
                        c16099 = c16098;
                    } else {
                        c12303 = c20064;
                    }
                    if (i == 0) {
                        return;
                    } else {
                        c16099 = c16098;
                    }
                } catch (C12303 e7) {
                    try {
                        interfaceC4314.mo12122("Exception during SSP authentication", (Throwable) e7);
                        c3875.m9584();
                    } catch (IOException unused) {
                        interfaceC4314.mo12135("Disconnect failed");
                    }
                    this.f4881 = 0;
                    throw e7;
                }
            }
            c16098 = c16099;
            i = i2;
            if (i == 0) {
                return;
            } else {
                c16099 = c16098;
            }
        }
    }

    public final String toString() {
        return "SmbSession[credentials=" + this.f4877.mo13093() + ",targetHost=" + this.f4874 + ",targetDomain=" + this.f4884 + ",uid=" + this.f4881 + ",connectionState=" + this.f4885 + ",usage=" + this.f4875.get() + "]";
    }

    public final InterfaceC19067 getContext() {
        return this.f4879.getContext();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9666 m3975(InterfaceC3314 interfaceC3314, InterfaceC4913 interfaceC4913) {
        C3875 c3875 = this.f4879;
        c3875.m9577();
        try {
            synchronized (c3875) {
                while (!this.f4885.compareAndSet(0, 1)) {
                    try {
                        int i = this.f4885.get();
                        if (i == 2 || i == 3) {
                            c3875.m9589();
                            return interfaceC4913;
                        }
                        try {
                            this.f4879.wait();
                        } catch (InterruptedException e) {
                            throw new C12303(e.getMessage(), e);
                        }
                    } catch (Throwable th) {
                        c3875.notifyAll();
                        throw th;
                    }
                }
                try {
                    c3875.m11249();
                    InterfaceC4314 interfaceC4314 = f4872;
                    if (interfaceC4314.mo12125()) {
                        interfaceC4314.mo12135("sessionSetup: " + this.f4888);
                    }
                    this.f4881 = 0;
                    if (!c3875.m11248()) {
                        m3968(c3875, this.f4884, (AbstractC14792) interfaceC3314, (AbstractC14792) interfaceC4913);
                        c3875.notifyAll();
                        c3875.m9589();
                        return interfaceC4913;
                    }
                    InterfaceC4913 interfaceC4913M3966 = m3966(c3875, this.f4884);
                    c3875.notifyAll();
                    c3875.m9589();
                    return interfaceC4913M3966;
                } catch (Exception e2) {
                    f4872.mo12120("Session setup failed", e2);
                    if (this.f4885.compareAndSet(1, 0)) {
                        m3979(true, true);
                    }
                    throw e2;
                }
            }
        } catch (Throwable th2) {
            try {
                c3875.m9589();
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
    /* JADX WARN: Type inference failed for: r2v2, types: [l.֨ۤ۠] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [l.֨ۤ۠] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m3979(boolean z, boolean z2) throws Throwable {
        ?? r2;
        ?? r3 = "Logging off session while still in use ";
        try {
            try {
                try {
                    C3875 c3875 = this.f4879;
                    c3875.m9577();
                    try {
                        try {
                            synchronized (c3875) {
                                try {
                                    if (!this.f4885.compareAndSet(2, 3)) {
                                        c3875.m9589();
                                        this.f4885.set(0);
                                        this.f4873 = null;
                                        this.f4879.notifyAll();
                                        return false;
                                    }
                                    InterfaceC4314 interfaceC4314 = f4872;
                                    if (interfaceC4314.mo12125()) {
                                        interfaceC4314.mo12135("Logging off session on " + c3875);
                                    }
                                    this.f4887 = null;
                                    synchronized (this.f4883) {
                                        try {
                                            long j = this.f4875.get();
                                            if ((!z2 || j == 1) && (z2 || j <= 0)) {
                                                z2 = false;
                                            } else {
                                                interfaceC4314.mo12116("Logging off session while still in use " + this + ":" + this.f4883);
                                                z2 = true;
                                            }
                                            try {
                                                for (C8110 c8110 : this.f4883) {
                                                    try {
                                                        f4872.mo12135("Disconnect tree on logoff");
                                                        z2 |= c8110.m21340(z, false);
                                                    } catch (Exception e) {
                                                        f4872.mo12122("Failed to disconnect tree " + c8110, (Throwable) e);
                                                    }
                                                }
                                                if (z) {
                                                    if (!z) {
                                                        C1280 c1280 = new C1280(this.f4877.mo29449());
                                                        c1280.mo24568(m3990());
                                                        c1280.mo24571(this.f4881);
                                                        this.f4879.m11236((InterfaceC3314) c1280, (AbstractC14792) new C3501(this.f4877.mo29449()));
                                                        this.f4881 = 0;
                                                    }
                                                    c3875.m9589();
                                                    r2 = this;
                                                } else {
                                                    try {
                                                        if (c3875.m11248()) {
                                                            C17220 c17220 = new C17220(this.f4877.mo29449(), 2);
                                                            c17220.mo24568(m3990());
                                                            c17220.mo24572(this.f4880);
                                                            try {
                                                                this.f4879.m11236((InterfaceC3314) c17220, (AbstractC14792) null);
                                                            } catch (C12303 e2) {
                                                                f4872.mo12120("Smb2LogoffRequest failed", (Exception) e2);
                                                            }
                                                        } else if (!z && ((C23154) c3875.m11246()).m51147().f33648 != 0) {
                                                            C1280 c1281 = new C1280(this.f4877.mo29449());
                                                            c1281.mo24568(m3990());
                                                            c1281.mo24571(this.f4881);
                                                            try {
                                                                this.f4879.m11236((InterfaceC3314) c1281, (AbstractC14792) new C3501(this.f4877.mo29449()));
                                                            } catch (C12303 e3) {
                                                                f4872.mo12120("SmbComLogoffAndX failed", (Exception) e3);
                                                            }
                                                            this.f4881 = 0;
                                                        }
                                                        try {
                                                            c3875.m9589();
                                                            r2 = this;
                                                        } catch (C12303 e4) {
                                                            e = e4;
                                                            r3 = this;
                                                            f4872.mo12122("Error in logoff", (Throwable) e);
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
                                                                c3875.m9589();
                                                            } catch (Throwable th3) {
                                                                try {
                                                                    th.addSuppressed(th3);
                                                                } catch (C12303 e5) {
                                                                    e = e5;
                                                                }
                                                            }
                                                            throw th;
                                                        }
                                                    }
                                                }
                                                r2.f4885.set(0);
                                                r2.f4873 = null;
                                                r2.f4879.notifyAll();
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
                                    r2.f4885.set(0);
                                    r2.f4873 = null;
                                    r2.f4879.notifyAll();
                                    return z2;
                                } catch (Throwable th7) {
                                    th = th7;
                                    z2 = false;
                                }
                                r3 = this;
                                f4872.mo12122("Error in logoff", (Throwable) e);
                                r2 = r3;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        z2 = false;
                        r3 = this;
                        c3875.m9589();
                        throw th;
                    }
                } catch (Throwable th10) {
                    th = th10;
                    r3.f4885.set(0);
                    r3.f4873 = null;
                    r3.f4879.notifyAll();
                    throw th;
                }
            } catch (Throwable th11) {
                th = th11;
                r3 = this;
                r3.f4885.set(0);
                r3.f4873 = null;
                r3.f4879.notifyAll();
                throw th;
            }
        } catch (C12303 e6) {
            e = e6;
            z2 = false;
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Long m3971() {
        long j = this.f4886;
        if (j > 0) {
            return Long.valueOf(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23901 m3972() {
        return this.f4888;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m3978(InterfaceC19067 interfaceC19067, String str, String str2) {
        return C13638.equals(this.f4888, interfaceC19067.mo13093()) && C13638.equals(this.f4874, str) && C13638.equals(this.f4884, str2);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m3986() {
        return !this.f4879.mo9573() && this.f4885.get() == 2;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean m3980() {
        return this.f4879.mo9585();
    }
}
