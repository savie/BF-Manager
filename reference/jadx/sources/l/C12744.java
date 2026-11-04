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

/* JADX INFO: renamed from: l.۫֡᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: E9W1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12744 implements InterfaceC4386 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f40793 = C16980.m40037(C12744.class);

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static AtomicLong f40794 = new AtomicLong();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String f40796;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public volatile long f40797;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final String f40799;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public InterfaceC4717 f40800;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public volatile boolean f40804;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C8794 f40805;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile boolean f40806;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f40803 = new AtomicInteger();

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public volatile int f40801 = -1;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public volatile String f40795 = "?????";

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final AtomicLong f40798 = new AtomicLong(0);

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f40802 = new AtomicBoolean(true);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC4386 m31580() {
        if (C12744.class.isAssignableFrom(C12744.class)) {
            return this;
        }
        throw new ClassCastException();
    }

    public C12744(C8794 c8794, String str) {
        c8794.m23605();
        this.f40805 = c8794;
        this.f40796 = str.toUpperCase();
        this.f40799 = this.f40795;
        c8794.m23616().getClass();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m31570(String str, String str2) {
        if (this.f40796.equalsIgnoreCase(str)) {
            return str2 == null || str2.startsWith("??") || this.f40795.equalsIgnoreCase(str2);
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12744)) {
            return false;
        }
        C12744 c12744 = (C12744) obj;
        return m31570(c12744.f40796, c12744.f40795);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31568() {
        long jIncrementAndGet = this.f40798.incrementAndGet();
        InterfaceC25186 interfaceC25186 = f40793;
        if (interfaceC25186.mo13713()) {
            interfaceC25186.mo13717("Acquire tree " + jIncrementAndGet + " " + this);
        }
        if (jIncrementAndGet == 1) {
            synchronized (this) {
                if (this.f40802.compareAndSet(false, true)) {
                    interfaceC25186.mo13721("Reacquire session");
                    this.f40805.m23605();
                }
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        m31578();
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m31578() {
        long jDecrementAndGet = this.f40798.decrementAndGet();
        InterfaceC25186 interfaceC25186 = f40793;
        if (interfaceC25186.mo13713()) {
            interfaceC25186.mo13717("Release tree " + jDecrementAndGet + " " + this);
        }
        if (jDecrementAndGet == 0) {
            synchronized (this) {
                interfaceC25186.mo13721("Usage dropped to zero, release session");
                if (this.f40802.compareAndSet(true, false)) {
                    this.f40805.m23611();
                }
            }
            return;
        }
        if (jDecrementAndGet >= 0) {
            return;
        }
        interfaceC25186.mo13699("Usage count dropped below zero " + this);
        throw new C3640("Usage count dropped below zero");
    }

    public final void finalize() {
        if (!m31577() || this.f40798.get() == 0) {
            return;
        }
        f40793.mo13729("Tree was not properly released");
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m31577() {
        return this.f40801 != -1 && this.f40805.m23618() && this.f40803.get() == 2;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m31572() {
        String str = this.f40795;
        if ("LPT1:".equals(str)) {
            return 32;
        }
        return "COMM".equals(str) ? 64 : 8;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m31573() {
        return this.f40796;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final void m31564() {
        this.f40804 = true;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m31576() {
        return this.f40804;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31569(InterfaceC4717 interfaceC4717) {
        this.f40800 = interfaceC4717;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC4717 m31574() {
        return this.f40800;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m31581() {
        if (this.f40803.get() == 2) {
            return this.f40806;
        }
        C14014 c14014M23613 = this.f40805.m23613();
        try {
            boolean zMo11404 = c14014M23613.m34131().mo11404();
            c14014M23613.m1095();
            return zMo11404;
        } catch (Throwable th) {
            try {
                c14014M23613.m1095();
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
    public final InterfaceC18315 m31566(InterfaceC21299 interfaceC21299, InterfaceC18315 interfaceC18315) {
        InterfaceC18315 c3750;
        InterfaceC21299 c23888;
        C8794 c8794 = this.f40805;
        c8794.m23605();
        try {
            C14014 c14014M23613 = c8794.m23613();
            try {
                synchronized (c14014M23613) {
                    c14014M23613.m34136();
                    InterfaceC21299 interfaceC212910 = null;
                    if (m31560(c14014M23613) == 2) {
                        c14014M23613.m1095();
                        c8794.m23611();
                        return null;
                    }
                    int andSet = this.f40803.getAndSet(1);
                    if (andSet == 1) {
                        if (m31560(c14014M23613) != 2) {
                            throw new C20728("Tree disconnected while waiting for connection");
                        }
                        c14014M23613.m1095();
                        c8794.m23611();
                        return null;
                    }
                    if (andSet == 2) {
                        c14014M23613.m1095();
                        c8794.m23611();
                        return null;
                    }
                    InterfaceC25186 interfaceC25186 = f40793;
                    if (interfaceC25186.mo13707()) {
                        interfaceC25186.mo13721("Connection state was " + andSet);
                    }
                    try {
                        try {
                            String strM23614 = c8794.m23614();
                            if (strM23614 == null) {
                                throw new C20728("Transport disconnected while waiting for connection");
                            }
                            InterfaceC8619 interfaceC8619M34131 = c14014M23613.m34131();
                            String str = "\\\\" + strM23614 + '\\' + this.f40796;
                            String str2 = this.f40799;
                            if (interfaceC25186.mo13707()) {
                                interfaceC25186.mo13721("treeConnect: unc=" + str + ",service=" + str2);
                            }
                            if (c14014M23613.m34133()) {
                                C4210 c4210 = new C4210(str, c8794.m23616());
                                if (interfaceC21299 != 0) {
                                    c4210.mo10313((AbstractC3159) interfaceC21299);
                                }
                                c23888 = c4210;
                                c3750 = null;
                            } else {
                                c3750 = new C3750(c8794.m23616(), (AbstractC3971) interfaceC18315);
                                c23888 = new C23888(c8794.getContext(), ((C5242) interfaceC8619M34131).m15750(), str, str2, (AbstractC3971) interfaceC21299);
                            }
                            try {
                                InterfaceC7128 interfaceC7128 = (InterfaceC7128) c8794.m23604(c23888, c3750, Collections.EMPTY_SET);
                                m31563(c14014M23613, c8794, interfaceC7128);
                                if (interfaceC18315 != null && interfaceC18315.mo12784()) {
                                    c14014M23613.notifyAll();
                                    c14014M23613.m1095();
                                    c8794.m23611();
                                    return interfaceC18315;
                                }
                                if (!c14014M23613.m34133()) {
                                    c14014M23613.notifyAll();
                                    c14014M23613.m1095();
                                    c8794.m23611();
                                    return null;
                                }
                                InterfaceC18315 interfaceC18315Mo17847 = interfaceC7128.mo17847();
                                c14014M23613.notifyAll();
                                c14014M23613.m1095();
                                c8794.m23611();
                                return interfaceC18315Mo17847;
                            } catch (IOException e) {
                                e = e;
                                interfaceC212910 = c23888;
                                if (interfaceC212910 != null && interfaceC212910.mo1727() != null) {
                                    InterfaceC7128 interfaceC7129 = (InterfaceC7128) interfaceC212910.mo1727();
                                    if (interfaceC7129.mo12784() && !interfaceC7129.mo12788() && interfaceC7129.getErrorCode() == 0) {
                                        if (!c14014M23613.mo1093()) {
                                            m31563(c14014M23613, c8794, interfaceC7129);
                                        }
                                        throw e;
                                    }
                                }
                                try {
                                    f40793.mo13711("Disconnect tree on treeConnectFailure", e);
                                    m31571(true, true);
                                    throw e;
                                } finally {
                                    this.f40803.set(0);
                                }
                            }
                        } catch (IOException e2) {
                            e = e2;
                        }
                    } catch (Throwable th) {
                        c14014M23613.notifyAll();
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                try {
                    c14014M23613.m1095();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        } catch (Throwable th4) {
            try {
                c8794.m23611();
                throw th4;
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18315 m31567(InterfaceC21299 interfaceC21299, InterfaceC18315 interfaceC18315, Set set) {
        C8794 c8794 = this.f40805;
        c8794.m23605();
        try {
            C14014 c14014M23613 = c8794.m23613();
            if (interfaceC18315 != null) {
                try {
                    interfaceC18315.mo12751();
                } catch (Throwable th) {
                    try {
                        c14014M23613.m1095();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            String str = null;
            InterfaceC18315 interfaceC18315M31566 = ((interfaceC21299 instanceof C20904) || (interfaceC21299 instanceof C21364)) ? null : m31566(interfaceC21299, interfaceC18315);
            if (interfaceC21299 != null && (interfaceC18315M31566 == null || !interfaceC18315M31566.mo12784())) {
                interfaceC21299.mo12795(this.f40801);
                if (!c14014M23613.m34133()) {
                    AbstractC3971 abstractC3971 = (AbstractC3971) interfaceC21299;
                    str = this.f40795;
                    if (str == null) {
                        throw new C20728("Service is null in state " + this.f40803.get());
                    }
                    m31561(abstractC3971, str);
                }
                if (this.f40806 && !"IPC".equals(str) && !"IPC$".equals(this.f40796) && (interfaceC21299 instanceof InterfaceC7874)) {
                    InterfaceC7874 interfaceC7874 = (InterfaceC7874) interfaceC21299;
                    if (interfaceC7874.getPath() != null && interfaceC7874.getPath().length() > 0) {
                        InterfaceC25186 interfaceC25186 = f40793;
                        if (interfaceC25186.mo13707()) {
                            interfaceC25186.mo13721("Setting DFS request path from " + interfaceC7874.getPath() + " to " + interfaceC7874.mo1460());
                        }
                        interfaceC7874.mo1466();
                        interfaceC7874.mo1463(interfaceC7874.mo1460());
                    }
                }
                try {
                    InterfaceC18315 interfaceC18315M23604 = c8794.m23604(interfaceC21299, interfaceC18315, set);
                    c14014M23613.m1095();
                    c8794.m23611();
                    return interfaceC18315M23604;
                } catch (C20728 e) {
                    if (e.m47408() == -1073741623) {
                        f40793.mo13721("Disconnect tree on NT_STATUS_NETWORK_NAME_DELETED");
                        m31571(true, true);
                    }
                    throw e;
                }
            }
            c14014M23613.m1095();
            c8794.m23611();
            return interfaceC18315M31566;
        } catch (Throwable th3) {
            try {
                c8794.m23611();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m31571(boolean z, boolean z2) {
        boolean z3;
        C8794 c8794 = this.f40805;
        c8794.m23605();
        try {
            C14014 c14014M23613 = c8794.m23613();
            try {
                synchronized (c14014M23613) {
                    if (this.f40803.getAndSet(3) == 2) {
                        long j = this.f40798.get();
                        if ((!z2 || j == 1) && (z2 || j <= 0)) {
                            z3 = false;
                        } else {
                            f40793.mo13729("Disconnected tree while still in use " + this);
                            c8794.m23616().getClass();
                            z3 = true;
                        }
                        if (!z && this.f40801 != -1) {
                            try {
                                if (!c14014M23613.m34133()) {
                                    m31567(new C20904(c8794.m23616()), new C18141(c8794.m23616()), Collections.EMPTY_SET);
                                } else {
                                    m31565(new C21364(c8794.m23616(), 4), new EnumC13269[0]);
                                }
                            } catch (C20048 e) {
                                f40793.mo13724("Tree disconnect failed", (Throwable) e);
                            }
                        }
                        throw th;
                    }
                    z3 = false;
                    this.f40806 = false;
                    this.f40804 = false;
                    this.f40803.set(0);
                    c14014M23613.notifyAll();
                }
                c14014M23613.m1095();
                c8794.m23611();
                return z3;
            } catch (Throwable th) {
                try {
                    c14014M23613.m1095();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                c8794.m23611();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C8794 m31579() {
        C8794 c8794 = this.f40805;
        c8794.m23605();
        return c8794;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long m31575() {
        return this.f40797;
    }

    public final int hashCode() {
        return (this.f40795.hashCode() * 7) + this.f40796.hashCode();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18315 m31565(AbstractC20313 abstractC20313, EnumC13269... enumC13269Arr) {
        return m31567(abstractC20313, abstractC20313.mo1727(), enumC13269Arr.length > 0 ? EnumSet.copyOf((Collection) Arrays.asList(enumC13269Arr)) : EnumSet.noneOf(EnumC13269.class));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31561(AbstractC3971 abstractC3971, String str) throws C20728 {
        int iMo10330;
        if ("A:".equals(str) || (iMo10330 = abstractC3971.mo10330()) == -94 || iMo10330 == 4) {
            return;
        }
        if (iMo10330 != 37 && iMo10330 != 50) {
            if (iMo10330 != 113) {
                switch (iMo10330) {
                    case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                    case 46:
                    case 47:
                        return;
                    default:
                        throw new C20728("Invalid operation for " + str + " service" + abstractC3971);
                }
            }
            return;
        }
        int iM26887 = ((AbstractC10461) abstractC3971).m26887() & 255;
        if (iM26887 == -41 || iM26887 == 0 || iM26887 == 16 || iM26887 == 35 || iM26887 == 38 || iM26887 == 104 || iM26887 == 83 || iM26887 == 84) {
            return;
        }
        throw new C20728("Invalid operation for " + str + " service: " + abstractC3971);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m31563(C14014 c14014, C8794 c8794, InterfaceC7128 interfaceC7128) throws C20048 {
        if (!interfaceC7128.mo12182()) {
            throw new C20728("TreeID is invalid");
        }
        this.f40801 = interfaceC7128.m19525();
        String strMo12184 = interfaceC7128.mo12184();
        if (strMo12184 == null && !c14014.m34133()) {
            throw new C20728("Service is NULL");
        }
        if (((C14826) c14014.getContext().mo2875()).m35709() && (("IPC$".equals(this.f40796) || "IPC".equals(strMo12184)) && !c8794.m23609().mo45913() && c8794.m23612() == null)) {
            throw new C20728("IPC signing is enforced, but no signing is available");
        }
        this.f40795 = strMo12184;
        this.f40806 = interfaceC7128.mo12183();
        this.f40797 = f40794.incrementAndGet();
        this.f40803.set(2);
        try {
            m31562(c14014, c8794);
        } catch (C20048 e) {
            try {
                c14014.m1098();
            } catch (IOException e2) {
                f40793.mo13702("Failed to disconnect transport", (Throwable) e2);
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m31562(C14014 c14014, C8794 c8794) throws C20048 {
        boolean zM34133 = c14014.m34133();
        InterfaceC25186 interfaceC25186 = f40793;
        if (!zM34133 || c14014.m34118() == null || !((C14826) c8794.m23616()).m35701()) {
            interfaceC25186.mo13721("Secure negotiation does not apply");
            return;
        }
        C3464 c3464 = (C3464) c14014.m34131();
        if (c3464.mo11409().m56406(EnumC25270.SMB311)) {
            interfaceC25186.mo13721("Secure negotiation does not apply, is SMB3.1");
            return;
        }
        C23602 c23602 = new C23602(c8794.m23616(), c14014.m34119(c3464));
        interfaceC25186.mo13721("Sending VALIDATE_NEGOTIATE_INFO");
        C10921 c10921 = new C10921(c8794.m23616(), 1311236);
        c10921.m27717();
        c10921.m27716(new C5702(c23602.m52846(), c23602.m52848(), (short) c23602.m52845(), c23602.m52844()));
        try {
            C1973 c1973 = (C1973) ((C22856) m31565(c10921, EnumC13269.NO_RETRY)).m51576(C1973.class);
            if (c3464.m11416() != c1973.m6795() || c3464.m11398() != c1973.m6793() || c3464.m11408() != c1973.m6796() || !Arrays.equals(c3464.m11411(), c1973.m6794())) {
                interfaceC25186.mo13721("Secure negotiation failure");
                throw new C20048("Mismatched attributes validating negotiate info");
            }
            interfaceC25186.mo13721("Secure negotiation OK");
        } catch (C25204 e) {
            throw new C11777("Signature error during negotiate validation", e);
        } catch (C20728 e2) {
            if (interfaceC25186.mo13707()) {
                interfaceC25186.mo13721(String.format("VALIDATE_NEGOTIATE_INFO response code 0x%x", Integer.valueOf(e2.m47408())));
            }
            interfaceC25186.mo13722("VALIDATE_NEGOTIATE_INFO returned error", (Exception) e2);
            if ((((C22856) c10921.mo1727()).mo12784() && ((C22856) c10921.mo1727()).mo12780()) || e2.m47408() == -1073741790) {
                throw new C11777("Signature error during negotiate validation", e2);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m31560(C14014 c14014) throws C20728 {
        int i;
        while (true) {
            i = this.f40803.get();
            if (i == 0 || i == 2) {
                break;
            }
            if (i == 3) {
                throw new C20728("Disconnecting during tree connect");
            }
            try {
                f40793.mo13721("Waiting for transport");
                c14014.wait();
            } catch (InterruptedException e) {
                throw new C20728(e.getMessage(), e);
            }
        }
        return i;
    }

    public final String toString() {
        return "SmbTree[share=" + this.f40796 + ",service=" + this.f40795 + ",tid=" + this.f40801 + ",inDfs=" + this.f40806 + ",inDomainDfs=" + this.f40804 + ",connectionState=" + this.f40803 + ",usage=" + this.f40798.get() + "]";
    }
}
