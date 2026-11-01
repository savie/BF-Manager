package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.۠ۤ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: E9W1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8110 implements InterfaceC2132 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public volatile boolean f28391;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC15498 f28392;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f28395;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String f28396;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public volatile long f28397;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C1053 f28400;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile boolean f28401;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC4314 f28390 = C13488.m32997(C8110.class);

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static AtomicLong f28389 = new AtomicLong();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f28398 = new AtomicInteger();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public volatile int f28402 = -1;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public volatile String f28399 = "?????";

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final AtomicLong f28394 = new AtomicLong(0);

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f28393 = new AtomicBoolean(true);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2132 m21344() {
        if (C8110.class.isAssignableFrom(C8110.class)) {
            return this;
        }
        throw new ClassCastException();
    }

    public C8110(C1053 c1053, String str) {
        c1053.m3977();
        this.f28400 = c1053;
        this.f28395 = str.toUpperCase();
        this.f28396 = this.f28399;
        c1053.m3981().getClass();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m21339(String str, String str2) {
        if (this.f28395.equalsIgnoreCase(str)) {
            return str2 == null || str2.startsWith("??") || this.f28399.equalsIgnoreCase(str2);
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8110)) {
            return false;
        }
        C8110 c8110 = (C8110) obj;
        return m21339(c8110.f28395, c8110.f28399);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21337() {
        long jIncrementAndGet = this.f28394.incrementAndGet();
        InterfaceC4314 interfaceC4314 = f28390;
        if (interfaceC4314.mo12133()) {
            interfaceC4314.mo12127("Acquire tree " + jIncrementAndGet + " " + this);
        }
        if (jIncrementAndGet == 1) {
            synchronized (this) {
                if (this.f28393.compareAndSet(false, true)) {
                    interfaceC4314.mo12135("Reacquire session");
                    this.f28400.m3977();
                }
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        m21347();
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m21347() {
        long jDecrementAndGet = this.f28394.decrementAndGet();
        InterfaceC4314 interfaceC4314 = f28390;
        if (interfaceC4314.mo12133()) {
            interfaceC4314.mo12127("Release tree " + jDecrementAndGet + " " + this);
        }
        if (jDecrementAndGet == 0) {
            synchronized (this) {
                interfaceC4314.mo12135("Usage dropped to zero, release session");
                if (this.f28393.compareAndSet(true, false)) {
                    this.f28400.m3984();
                }
            }
            return;
        }
        if (jDecrementAndGet >= 0) {
            return;
        }
        interfaceC4314.mo12119("Usage count dropped below zero " + this);
        throw new C17655("Usage count dropped below zero");
    }

    public final void finalize() {
        if (!m21348() || this.f28394.get() == 0) {
            return;
        }
        f28390.mo12116("Tree was not properly released");
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m21348() {
        return this.f28402 != -1 && this.f28400.m3986() && this.f28398.get() == 2;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int m21343() {
        String str = this.f28399;
        if ("LPT1:".equals(str)) {
            return 32;
        }
        return "COMM".equals(str) ? 64 : 8;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m21333() {
        return this.f28395;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final void m21341() {
        this.f28391 = true;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m21345() {
        return this.f28391;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21338(InterfaceC15498 interfaceC15498) {
        this.f28392 = interfaceC15498;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final InterfaceC15498 m21332() {
        return this.f28392;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m21346() {
        if (this.f28398.get() == 2) {
            return this.f28401;
        }
        C3875 c3875M3985 = this.f28400.m3985();
        try {
            boolean zMo11868 = c3875M3985.m11246().mo11868();
            c3875M3985.m9589();
            return zMo11868;
        } catch (Throwable th) {
            try {
                c3875M3985.m9589();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4913 m21334(InterfaceC3314 interfaceC3314, InterfaceC4913 interfaceC4913) {
        InterfaceC4913 c12570;
        InterfaceC3314 c16803;
        C1053 c1053 = this.f28400;
        c1053.m3977();
        try {
            C3875 c3875M3985 = c1053.m3985();
            try {
                synchronized (c3875M3985) {
                    c3875M3985.m11249();
                    InterfaceC3314 interfaceC3315 = null;
                    if (m21328(c3875M3985) == 2) {
                        c3875M3985.m9589();
                        c1053.m3984();
                        return null;
                    }
                    int andSet = this.f28398.getAndSet(1);
                    if (andSet == 1) {
                        if (m21328(c3875M3985) != 2) {
                            throw new C12303("Tree disconnected while waiting for connection");
                        }
                        c3875M3985.m9589();
                        c1053.m3984();
                        return null;
                    }
                    if (andSet == 2) {
                        c3875M3985.m9589();
                        c1053.m3984();
                        return null;
                    }
                    InterfaceC4314 interfaceC4314 = f28390;
                    if (interfaceC4314.mo12125()) {
                        interfaceC4314.mo12135("Connection state was " + andSet);
                    }
                    try {
                        try {
                            String strM3989 = c1053.m3989();
                            if (strM3989 == null) {
                                throw new C12303("Transport disconnected while waiting for connection");
                            }
                            InterfaceC4207 interfaceC4207M11246 = c3875M3985.m11246();
                            String str = "\\\\" + strM3989 + '\\' + this.f28395;
                            String str2 = this.f28396;
                            if (interfaceC4314.mo12125()) {
                                interfaceC4314.mo12135("treeConnect: unc=" + str + ",service=" + str2);
                            }
                            if (c3875M3985.m11248()) {
                                C14399 c14399 = new C14399(str, c1053.m3981());
                                if (interfaceC3314 != 0) {
                                    c14399.mo27236((AbstractC12591) interfaceC3314);
                                }
                                c16803 = c14399;
                                c12570 = null;
                            } else {
                                c12570 = new C12570(c1053.m3981(), (AbstractC14792) interfaceC4913);
                                c16803 = new C16803(c1053.getContext(), ((C23154) interfaceC4207M11246).m51147(), str, str2, (AbstractC14792) interfaceC3314);
                            }
                            try {
                                InterfaceC7030 interfaceC7030 = (InterfaceC7030) c1053.m3973(c16803, c12570, Collections.EMPTY_SET);
                                m21330(c3875M3985, c1053, interfaceC7030);
                                if (interfaceC4913 != null && interfaceC4913.mo17295()) {
                                    c3875M3985.notifyAll();
                                    c3875M3985.m9589();
                                    c1053.m3984();
                                    return interfaceC4913;
                                }
                                if (!c3875M3985.m11248()) {
                                    c3875M3985.notifyAll();
                                    c3875M3985.m9589();
                                    c1053.m3984();
                                    return null;
                                }
                                InterfaceC4913 interfaceC4913Mo13671 = interfaceC7030.mo13671();
                                c3875M3985.notifyAll();
                                c3875M3985.m9589();
                                c1053.m3984();
                                return interfaceC4913Mo13671;
                            } catch (IOException e) {
                                e = e;
                                interfaceC3315 = c16803;
                                if (interfaceC3315 != null && interfaceC3315.mo9821() != null) {
                                    InterfaceC7030 interfaceC7031 = (InterfaceC7030) interfaceC3315.mo9821();
                                    if (interfaceC7031.mo17295() && !interfaceC7031.mo17304() && interfaceC7031.getErrorCode() == 0) {
                                        if (!c3875M3985.mo9573()) {
                                            m21330(c3875M3985, c1053, interfaceC7031);
                                        }
                                        throw e;
                                    }
                                }
                                try {
                                    f28390.mo12120("Disconnect tree on treeConnectFailure", (Exception) e);
                                    m21340(true, true);
                                    throw e;
                                } finally {
                                    this.f28398.set(0);
                                }
                            }
                        } catch (IOException e2) {
                            e = e2;
                        }
                    } catch (Throwable th) {
                        c3875M3985.notifyAll();
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                try {
                    c3875M3985.m9589();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        } catch (Throwable th4) {
            try {
                c1053.m3984();
                throw th4;
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4913 m21335(InterfaceC3314 interfaceC3314, InterfaceC4913 interfaceC4913, Set set) {
        C1053 c1053 = this.f28400;
        c1053.m3977();
        try {
            C3875 c3875M3985 = c1053.m3985();
            if (interfaceC4913 != null) {
                try {
                    interfaceC4913.mo17301();
                } catch (Throwable th) {
                    try {
                        c3875M3985.m9589();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            String str = null;
            InterfaceC4913 interfaceC4913M21334 = ((interfaceC3314 instanceof C17508) || (interfaceC3314 instanceof C9460)) ? null : m21334(interfaceC3314, interfaceC4913);
            if (interfaceC3314 != null && (interfaceC4913M21334 == null || !interfaceC4913M21334.mo17295())) {
                interfaceC3314.mo9816(this.f28402);
                if (!c3875M3985.m11248()) {
                    AbstractC14792 abstractC14792 = (AbstractC14792) interfaceC3314;
                    str = this.f28399;
                    if (str == null) {
                        throw new C12303("Service is null in state " + this.f28398.get());
                    }
                    m21331(abstractC14792, str);
                }
                if (this.f28401 && !"IPC".equals(str) && !"IPC$".equals(this.f28395) && (interfaceC3314 instanceof InterfaceC11970)) {
                    InterfaceC11970 interfaceC11970 = (InterfaceC11970) interfaceC3314;
                    if (interfaceC11970.getPath() != null && interfaceC11970.getPath().length() > 0) {
                        InterfaceC4314 interfaceC4314 = f28390;
                        if (interfaceC4314.mo12125()) {
                            interfaceC4314.mo12135("Setting DFS request path from " + interfaceC11970.getPath() + " to " + interfaceC11970.mo12625());
                        }
                        interfaceC11970.mo12632();
                        interfaceC11970.mo12623(interfaceC11970.mo12625());
                    }
                }
                try {
                    InterfaceC4913 interfaceC4913M3973 = c1053.m3973(interfaceC3314, interfaceC4913, set);
                    c3875M3985.m9589();
                    c1053.m3984();
                    return interfaceC4913M3973;
                } catch (C12303 e) {
                    if (e.m30561() == -1073741623) {
                        f28390.mo12135("Disconnect tree on NT_STATUS_NETWORK_NAME_DELETED");
                        m21340(true, true);
                    }
                    throw e;
                }
            }
            c3875M3985.m9589();
            c1053.m3984();
            return interfaceC4913M21334;
        } catch (Throwable th3) {
            try {
                c1053.m3984();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m21340(boolean z, boolean z2) {
        boolean z3;
        C1053 c1053 = this.f28400;
        c1053.m3977();
        try {
            C3875 c3875M3985 = c1053.m3985();
            try {
                synchronized (c3875M3985) {
                    if (this.f28398.getAndSet(3) == 2) {
                        long j = this.f28394.get();
                        if ((!z2 || j == 1) && (z2 || j <= 0)) {
                            z3 = false;
                        } else {
                            f28390.mo12116("Disconnected tree while still in use " + this);
                            c1053.m3981().getClass();
                            z3 = true;
                        }
                        if (!z && this.f28402 != -1) {
                            try {
                                if (!c3875M3985.m11248()) {
                                    m21335(new C17508(c1053.m3981()), new C3501(c1053.m3981()), Collections.EMPTY_SET);
                                } else {
                                    m21336(new C9460(c1053.m3981(), 4), new EnumC19358[0]);
                                }
                            } catch (C8484 e) {
                                f28390.mo12138("Tree disconnect failed", (Throwable) e);
                            }
                        }
                        throw th;
                    }
                    z3 = false;
                    this.f28401 = false;
                    this.f28391 = false;
                    this.f28398.set(0);
                    c3875M3985.notifyAll();
                }
                c3875M3985.m9589();
                c1053.m3984();
                return z3;
            } catch (Throwable th) {
                try {
                    c3875M3985.m9589();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                c1053.m3984();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C1053 m21342() {
        C1053 c1053 = this.f28400;
        c1053.m3977();
        return c1053;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long m21349() {
        return this.f28397;
    }

    public final int hashCode() {
        return (this.f28399.hashCode() * 7) + this.f28395.hashCode();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4913 m21336(AbstractC17529 abstractC17529, EnumC19358... enumC19358Arr) {
        return m21335(abstractC17529, abstractC17529.mo9821(), enumC19358Arr.length > 0 ? EnumSet.copyOf((Collection) Arrays.asList(enumC19358Arr)) : EnumSet.noneOf(EnumC19358.class));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21331(AbstractC14792 abstractC14792, String str) throws C12303 {
        int iMo24564;
        if ("A:".equals(str) || (iMo24564 = abstractC14792.mo24564()) == -94 || iMo24564 == 4) {
            return;
        }
        if (iMo24564 != 37 && iMo24564 != 50) {
            if (iMo24564 != 113) {
                switch (iMo24564) {
                    case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                    case 46:
                    case 47:
                        return;
                    default:
                        throw new C12303("Invalid operation for " + str + " service" + abstractC14792);
                }
            }
            return;
        }
        int iM8267 = ((AbstractC2712) abstractC14792).m8267() & 255;
        if (iM8267 == -41 || iM8267 == 0 || iM8267 == 16 || iM8267 == 35 || iM8267 == 38 || iM8267 == 104 || iM8267 == 83 || iM8267 == 84) {
            return;
        }
        throw new C12303("Invalid operation for " + str + " service: " + abstractC14792);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m21330(C3875 c3875, C1053 c1053, InterfaceC7030 interfaceC7030) throws C8484 {
        if (!interfaceC7030.mo5636()) {
            throw new C12303("TreeID is invalid");
        }
        this.f28402 = interfaceC7030.m18869();
        String strMo5638 = interfaceC7030.mo5638();
        if (strMo5638 == null && !c3875.m11248()) {
            throw new C12303("Service is NULL");
        }
        if (((C9895) c3875.getContext().mo29449()).m25066() && (("IPC$".equals(this.f28395) || "IPC".equals(strMo5638)) && !c1053.m3972().mo43144() && c1053.m3990() == null)) {
            throw new C12303("IPC signing is enforced, but no signing is available");
        }
        this.f28399 = strMo5638;
        this.f28401 = interfaceC7030.mo5637();
        this.f28397 = f28389.incrementAndGet();
        this.f28398.set(2);
        try {
            m21329(c3875, c1053);
        } catch (C8484 e) {
            try {
                c3875.m9584();
            } catch (IOException e2) {
                f28390.mo12122("Failed to disconnect transport", (Throwable) e2);
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m21329(C3875 c3875, C1053 c1053) throws C8484 {
        boolean zM11248 = c3875.m11248();
        InterfaceC4314 interfaceC4314 = f28390;
        if (!zM11248 || c3875.m11241() == null || !((C9895) c1053.m3981()).m25047()) {
            interfaceC4314.mo12135("Secure negotiation does not apply");
            return;
        }
        C12282 c12282 = (C12282) c3875.m11246();
        if (c12282.mo11862().m38366(EnumC16245.SMB311)) {
            interfaceC4314.mo12135("Secure negotiation does not apply, is SMB3.1");
            return;
        }
        C16515 c16515 = new C16515(c1053.m3981(), c3875.m11232(c12282));
        interfaceC4314.mo12135("Sending VALIDATE_NEGOTIATE_INFO");
        C21453 c21453 = new C21453(c1053.m3981(), 1311236);
        c21453.m48077();
        c21453.m48075(new C8754(c16515.m38832(), c16515.m38833(), (short) c16515.m38831(), c16515.m38830()));
        try {
            C10165 c10165 = (C10165) ((C17925) m21336(c21453, EnumC19358.NO_RETRY)).m41617(C10165.class);
            if (c12282.m30518() != c10165.m25903() || c12282.m30519() != c10165.m25902() || c12282.m30520() != c10165.m25901() || !Arrays.equals(c12282.m30522(), c10165.m25900())) {
                interfaceC4314.mo12135("Secure negotiation failure");
                throw new C8484("Mismatched attributes validating negotiate info");
            }
            interfaceC4314.mo12135("Secure negotiation OK");
        } catch (C7363 e) {
            throw new C10186("Signature error during negotiate validation", e);
        } catch (C12303 e2) {
            if (interfaceC4314.mo12125()) {
                interfaceC4314.mo12135(String.format("VALIDATE_NEGOTIATE_INFO response code 0x%x", Integer.valueOf(e2.m30561())));
            }
            interfaceC4314.mo12131("VALIDATE_NEGOTIATE_INFO returned error", e2);
            if ((((C17925) c21453.mo9821()).mo17295() && ((C17925) c21453.mo9821()).mo17300()) || e2.m30561() == -1073741790) {
                throw new C10186("Signature error during negotiate validation", e2);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m21328(C3875 c3875) throws C12303 {
        int i;
        while (true) {
            i = this.f28398.get();
            if (i == 0 || i == 2) {
                break;
            }
            if (i == 3) {
                throw new C12303("Disconnecting during tree connect");
            }
            try {
                f28390.mo12135("Waiting for transport");
                c3875.wait();
            } catch (InterruptedException e) {
                throw new C12303(e.getMessage(), e);
            }
        }
        return i;
    }

    public final String toString() {
        return "SmbTree[share=" + this.f28395 + ",service=" + this.f28399 + ",tid=" + this.f28402 + ",inDfs=" + this.f28401 + ",inDomainDfs=" + this.f28391 + ",connectionState=" + this.f28398 + ",usage=" + this.f28394.get() + "]";
    }
}
