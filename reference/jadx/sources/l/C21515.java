package l;

import com.alipay.sdk.app.OpenAuthTask;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.᩸ۤ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 1A1B */
/* JADX INFO: loaded from: classes4.dex */
public class C21515 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f69901 = 0;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final AtomicLong f69902;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public InterfaceC6698 f69903;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19067 f69904;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C8110 f69905;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public volatile boolean f69906;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C21515 f69907;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public volatile boolean f69908;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC4314 f69900 = C13488.m32997(C21515.class);

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final Random f69899 = new Random();

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private synchronized C8110 m48205() {
        C8110 c8110 = this.f69905;
        if (c8110 != null) {
            c8110.m21337();
            return c8110;
        }
        C21515 c21515 = this.f69907;
        if (c21515 == null) {
            return c8110;
        }
        C8110 c8110M48205 = c21515.m48205();
        this.f69905 = c8110M48205;
        return c8110M48205;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private synchronized C8110 m48209() {
        C8110 c8110 = this.f69905;
        if (c8110 != null) {
            return c8110;
        }
        C21515 c21515 = this.f69907;
        if (c21515 == null) {
            return null;
        }
        return c21515.m48209();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m48212() {
        C8110 c8110M48209;
        c8110M48209 = m48209();
        return c8110M48209 != null && c8110M48209.m21348();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C17987 m48215(C2464 c2464) {
        C1053 c1053M48213 = m48213();
        try {
            if (m48212()) {
                C3875 c3875M3985 = c1053M48213.m3985();
                try {
                    if (c3875M3985.mo9573() || c3875M3985.m11244() == null) {
                        f69900.mo12135("Disconnecting failed tree and session");
                        m48225();
                    }
                    c3875M3985.m9589();
                } catch (Throwable th) {
                    try {
                        c3875M3985.m9589();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            if (!m48212()) {
                C17987 c17987M48216 = m48216(c2464, c2464.m7562());
                if (c1053M48213 != null) {
                    c1053M48213.m3984();
                }
                return c17987M48216;
            }
            f69900.mo12127("Already connected");
            C17987 c17987 = new C17987(c2464, this);
            if (c1053M48213 != null) {
                c1053M48213.m3984();
            }
            return c17987;
        } catch (Throwable th3) {
            if (c1053M48213 != null) {
                try {
                    c1053M48213.m3984();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized void m48225() {
        C1053 c1053M48213 = m48213();
        if (c1053M48213 == null) {
            if (c1053M48213 != null) {
                c1053M48213.m3984();
            }
            return;
        }
        try {
            C3875 c3875M3985 = c1053M48213.m3985();
            try {
                synchronized (c3875M3985) {
                    C8110 c8110M48209 = m48209();
                    if (c8110M48209 != null) {
                        try {
                            c8110M48209.m21340(true, true);
                            this.f69905 = null;
                            this.f69908 = false;
                        } catch (Throwable th) {
                            this.f69905 = null;
                            this.f69908 = false;
                            throw th;
                        }
                    } else {
                        this.f69907.m48225();
                    }
                }
                c3875M3985.m9589();
                c1053M48213.m3984();
            } catch (Throwable th2) {
                try {
                    c3875M3985.m9589();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            try {
                c1053M48213.m3984();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private synchronized void m48208(C8110 c8110) {
        C8110 c8110M48205 = m48205();
        if (c8110M48205 == c8110) {
            if (c8110M48205 != null) {
                c8110M48205.m21347();
            }
            return;
        }
        try {
            boolean z = this.f69908;
            InterfaceC4314 interfaceC4314 = f69900;
            interfaceC4314.mo12135("Switching tree");
            interfaceC4314.mo12135("Acquired tree on switch " + c8110);
            c8110.m21337();
            this.f69908 = true;
            this.f69905 = c8110;
            if (c8110M48205 != null && z) {
                c8110M48205.m21347();
            }
            if (this.f69907 != null && this.f69906) {
                interfaceC4314.mo12135("Releasing delegate");
                this.f69906 = false;
                this.f69907.m48223();
            }
            if (c8110M48205 != null) {
                c8110M48205.m21347();
            }
        } catch (Throwable th) {
            if (c8110M48205 != null) {
                try {
                    c8110M48205.m21347();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public C21515(InterfaceC19067 interfaceC19067) {
        this.f69902 = new AtomicLong();
        this.f69904 = interfaceC19067;
        this.f69907 = null;
    }

    public C21515(C21515 c21515) {
        this.f69902 = new AtomicLong();
        this.f69904 = c21515.f69904;
        this.f69907 = c21515;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C21515 m48210(C21515 c21515) {
        c21515.f69904.mo29449().getClass();
        return new C21515(c21515);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10601 m48222() {
        return this.f69904.mo29449();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48219() {
        long jIncrementAndGet = this.f69902.incrementAndGet();
        InterfaceC4314 interfaceC4314 = f69900;
        if (interfaceC4314.mo12133()) {
            interfaceC4314.mo12127("Acquire tree connection " + jIncrementAndGet + " " + this);
        }
        if (jIncrementAndGet == 1) {
            synchronized (this) {
                C8110 c8110M48205 = m48205();
                if (c8110M48205 != null) {
                    try {
                        if (!this.f69908) {
                            if (interfaceC4314.mo12125()) {
                                interfaceC4314.mo12135("Acquire tree on first usage " + c8110M48205);
                            }
                            c8110M48205.m21337();
                            this.f69908 = true;
                        }
                    } catch (Throwable th) {
                        try {
                            c8110M48205.m21347();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (c8110M48205 != null) {
                    c8110M48205.m21347();
                }
                if (this.f69907 != null && !this.f69906) {
                    interfaceC4314.mo12135("Acquire delegate on first usage");
                    this.f69907.m48219();
                    this.f69906 = true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m48223() {
        long jDecrementAndGet = this.f69902.decrementAndGet();
        InterfaceC4314 interfaceC4314 = f69900;
        if (interfaceC4314.mo12133()) {
            interfaceC4314.mo12127("Release tree connection " + jDecrementAndGet + " " + this);
        }
        if (jDecrementAndGet != 0) {
            if (jDecrementAndGet >= 0) {
                return;
            }
            interfaceC4314.mo12119("Usage count dropped below zero " + this);
            throw new C17655("Usage count dropped below zero");
        }
        synchronized (this) {
            C8110 c8110M48205 = m48205();
            try {
                if (this.f69908 && c8110M48205 != null) {
                    if (interfaceC4314.mo12125()) {
                        interfaceC4314.mo12135("Tree connection no longer in use, release tree " + c8110M48205);
                    }
                    this.f69908 = false;
                    c8110M48205.m21347();
                }
                if (c8110M48205 != null) {
                    c8110M48205.m21347();
                }
                if (this.f69907 != null && this.f69906) {
                    this.f69906 = false;
                    this.f69907.m48223();
                }
            } catch (Throwable th) {
                if (c8110M48205 != null) {
                    try {
                        c8110M48205.m21347();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        Object obj = this.f69903;
        if (obj != null) {
            synchronized (this) {
                try {
                    interfaceC4314.mo12135("Disconnecting exclusive transport");
                    this.f69903 = null;
                    this.f69905 = null;
                    this.f69908 = false;
                    ((AbstractRunnableC3170) obj).m9589();
                    ((AbstractRunnableC3170) obj).m9582(false, false);
                } catch (Exception e) {
                    f69900.mo12138("Failed to close exclusive transport", (Throwable) e);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:51:0x0106  */
    /* JADX WARN: Code duplicated, block: B:70:0x0139  */
    /* JADX WARN: Code duplicated, block: B:72:0x013f  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x00d0 A[SYNTHETIC] */
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
    public final InterfaceC4913 m48214(C2464 c2464, InterfaceC3314 interfaceC3314, InterfaceC4913 interfaceC4913, EnumC19358... enumC19358Arr) throws Exception {
        InterfaceC4314 interfaceC4314;
        char c;
        Exception exc;
        C17987 c17987M48224;
        C21515 c21515 = this;
        EnumSet enumSetNoneOf = enumC19358Arr.length == 0 ? EnumSet.noneOf(EnumC19358.class) : EnumSet.copyOf((Collection) Arrays.asList(enumC19358Arr));
        InterfaceC11970 interfaceC11970 = interfaceC3314 instanceof InterfaceC11970 ? (InterfaceC11970) interfaceC3314 : null;
        String path = interfaceC11970 != null ? interfaceC11970.getPath() : null;
        String strMo12625 = interfaceC11970 != null ? interfaceC11970.mo12625() : null;
        String str = "\\" + c2464.m7556() + "\\" + c2464.m7570() + c2464.m7557();
        int iM25075 = ((C9895) c21515.f69904.mo29449()).m25075();
        String str2 = null;
        Exception exc2 = null;
        int i = 1;
        while (true) {
            interfaceC4314 = f69900;
            if (i > iM25075) {
                break;
            }
            if (interfaceC11970 != null) {
                interfaceC11970.mo12624(str2, str2, str);
            }
            try {
                return c21515.m48206(c2464, interfaceC3314, interfaceC4913, enumSetNoneOf);
            } catch (C12303 e) {
                C12303 c12303 = e;
                if (enumSetNoneOf.contains(EnumC19358.NO_RETRY) || (!(c12303.getCause() instanceof C4498) && c12303.m30561() != -1073741811)) {
                    interfaceC4314.mo12120("Not retrying", (Exception) c12303);
                    throw c12303;
                }
                c = 1;
                interfaceC4314.mo12120("send", (Exception) c12303);
                exc = c12303;
                if (interfaceC4314.mo12125()) {
                    Integer numValueOf = Integer.valueOf(i);
                    Integer numValueOf2 = Integer.valueOf(iM25075);
                    Object[] objArr = new Object[3];
                    objArr[0] = numValueOf;
                    objArr[c] = numValueOf2;
                    objArr[2] = interfaceC3314;
                    interfaceC4314.mo12135(String.format("Retrying (%d/%d) request %s", objArr));
                }
                interfaceC4314.mo12120("Disconnecting tree on send retry", exc);
                m48225();
                if (i >= iM25075) {
                    exc2 = exc;
                    if (exc2 != null) {
                        interfaceC4314.mo12120("All attempts have failed, last exception", exc2);
                        throw exc2;
                    }
                    throw new C12303("All attempts failed, but no exception");
                }
                if (i != 1) {
                    try {
                        Thread.sleep(f69899.nextInt(1000) + 500);
                    } catch (InterruptedException e2) {
                        interfaceC4314.mo12120("interrupted sleep in send", (Exception) e2);
                    }
                }
                if (interfaceC3314 != null) {
                    interfaceC4314.mo12135("Restting request");
                    interfaceC3314.reset();
                }
                if (interfaceC11970 != null) {
                    interfaceC11970.mo12623(path);
                    interfaceC11970.mo12624(interfaceC11970.mo12627(), interfaceC11970.mo12622(), strMo12625);
                }
                if (interfaceC4913 != null) {
                    interfaceC4913.reset();
                }
                try {
                    c17987M48224 = m48224(c2464);
                    try {
                        interfaceC4314.mo12135("Have new tree connection for retry");
                        c17987M48224.close();
                    } catch (Throwable th) {
                        try {
                            c17987M48224.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (C12303 e3) {
                    interfaceC4314.mo12120("Failed to connect tree on retry", (Exception) e3);
                    exc = e3;
                }
                i++;
                str2 = null;
                c21515 = this;
                exc2 = exc;
            } catch (C8484 e4) {
                C8484 c8484 = e4;
                interfaceC4314.mo12120("send", (Exception) c8484);
                c = 1;
                exc = c8484;
                if (interfaceC4314.mo12125()) {
                    Integer numValueOf3 = Integer.valueOf(i);
                    Integer numValueOf4 = Integer.valueOf(iM25075);
                    Object[] objArr2 = new Object[3];
                    objArr2[0] = numValueOf3;
                    objArr2[c] = numValueOf4;
                    objArr2[2] = interfaceC3314;
                    interfaceC4314.mo12135(String.format("Retrying (%d/%d) request %s", objArr2));
                }
                interfaceC4314.mo12120("Disconnecting tree on send retry", exc);
                m48225();
                if (i >= iM25075) {
                    exc2 = exc;
                    if (exc2 != null) {
                        interfaceC4314.mo12120("All attempts have failed, last exception", exc2);
                        throw exc2;
                    }
                    throw new C12303("All attempts failed, but no exception");
                }
                if (i != 1) {
                    Thread.sleep(f69899.nextInt(1000) + 500);
                }
                if (interfaceC3314 != null) {
                    interfaceC4314.mo12135("Restting request");
                    interfaceC3314.reset();
                }
                if (interfaceC11970 != null) {
                    interfaceC11970.mo12623(path);
                    interfaceC11970.mo12624(interfaceC11970.mo12627(), interfaceC11970.mo12622(), strMo12625);
                }
                if (interfaceC4913 != null) {
                    interfaceC4913.reset();
                }
                c17987M48224 = m48224(c2464);
                interfaceC4314.mo12135("Have new tree connection for retry");
                c17987M48224.close();
                i++;
                str2 = null;
                c21515 = this;
                exc2 = exc;
            }
            i++;
            str2 = null;
            c21515 = this;
            exc2 = exc;
        }
        if (exc2 != null) {
            interfaceC4314.mo12120("All attempts have failed, last exception", exc2);
            throw exc2;
        }
        throw new C12303("All attempts failed, but no exception");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private InterfaceC4913 m48206(C2464 c2464, InterfaceC3314 interfaceC3314, InterfaceC4913 interfaceC4913, EnumSet enumSet) throws C8484 {
        for (int i = 10; i > 0; i--) {
            if (interfaceC3314 instanceof InterfaceC11970) {
                m48218(c2464, (InterfaceC11970) interfaceC3314);
            }
            try {
                C8110 c8110M48205 = m48205();
                try {
                    if (c8110M48205 == null) {
                        throw new C8484("Failed to get tree connection");
                    }
                    InterfaceC4913 interfaceC4913M21335 = c8110M48205.m21335(interfaceC3314, interfaceC4913, enumSet);
                    c8110M48205.m21347();
                    return interfaceC4913M21335;
                } catch (Throwable th) {
                    if (c8110M48205 != null) {
                        try {
                            c8110M48205.m21347();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (C3438 e) {
                ((C23259) e.m10145()).mo37104();
                interfaceC3314.reset();
                f69900.mo12131("send0", e);
            }
        }
        throw new C8484("Loop in DFS referrals");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C17987 m48224(C2464 c2464) throws C12303 {
        try {
            return m48215(c2464);
        } catch (UnknownHostException e) {
            throw new C12303("Failed to connect to server", e);
        } catch (C12303 e2) {
            throw e2;
        } catch (IOException e3) {
            throw new C12303("Failed to connect to server", e3);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C17987 m48216(C2464 c2464, String str) {
        return m48217(c2464, str, null);
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00a7  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C17987 m48217(C2464 c2464, String str, InterfaceC15498 interfaceC15498) {
        String strM3982;
        InterfaceC15498 interfaceC15498M24899;
        String str2;
        String str3;
        C23259 next;
        Throwable th;
        C1053 c1053;
        C8110 c8110M48205 = m48205();
        String strM7557 = null;
        if (c8110M48205 != null) {
            try {
                InterfaceC4314 interfaceC4314 = f69900;
                if (interfaceC4314.mo12125()) {
                    interfaceC4314.mo12135("Tree is " + c8110M48205);
                }
                if (C13638.equals(c2464.m7570(), c8110M48205.m21333())) {
                    C1053 c1053M21342 = c8110M48205.m21342();
                    try {
                        strM3982 = c1053M21342.m3982();
                        if (!c1053M21342.m3980()) {
                            C3875 c3875M3985 = c1053M21342.m3985();
                            try {
                                C8110 c8110M48207 = m48207(c2464, str, c8110M48205.m21333(), c3875M3985, c8110M48205, null);
                                try {
                                    m48208(c8110M48207);
                                    C17987 c17987 = new C17987(c2464, this);
                                    c8110M48207.m21347();
                                    c3875M3985.m9589();
                                    c1053M21342.m3984();
                                    c8110M48205.m21347();
                                    return c17987;
                                } catch (Throwable th2) {
                                    try {
                                        c8110M48207.m21347();
                                        throw th2;
                                    } catch (Throwable th3) {
                                        th2.addSuppressed(th3);
                                        throw th2;
                                    }
                                }
                            } catch (Throwable th4) {
                                try {
                                    c3875M3985.m9589();
                                    throw th4;
                                } catch (Throwable th5) {
                                    th4.addSuppressed(th5);
                                    throw th4;
                                }
                            }
                        }
                        interfaceC4314.mo12135("Session no longer valid");
                        c1053M21342.m3984();
                    } catch (Throwable th6) {
                        try {
                            c1053M21342.m3984();
                            throw th6;
                        } catch (Throwable th7) {
                            th6.addSuppressed(th7);
                            throw th6;
                        }
                    }
                    try {
                        c8110M48205.m21347();
                        throw th;
                    } catch (Throwable th8) {
                        th.addSuppressed(th8);
                        throw th;
                    }
                }
                strM3982 = null;
            } catch (Throwable th9) {
                c8110M48205.m21347();
                throw th9;
            }
        } else {
            strM3982 = null;
        }
        if (c8110M48205 != null) {
            c8110M48205.m21347();
        }
        String strM7562 = c2464.m7562();
        if (c2464.m7566() != 8 && c2464.m7557() != null && !"\\".equals(c2464.m7557())) {
            strM7557 = c2464.m7557();
        }
        String strM7570 = c2464.m7570();
        if (interfaceC15498 != null) {
            interfaceC15498M24899 = interfaceC15498;
        } else {
            interfaceC15498M24899 = ((C9790) this.f69904.mo29447()).m24899(this.f69904, strM7562, c2464.m7570(), strM7557);
        }
        String str4 = strM3982;
        C2464 c2465 = c2464;
        InterfaceC15498 interfaceC15499 = interfaceC15498M24899;
        String str5 = str;
        while (true) {
            if (interfaceC15499 != null) {
                String strMo37102 = interfaceC15499.mo37102();
                String lowerCase = interfaceC15499.mo37098().toLowerCase(Locale.ROOT);
                strM7570 = interfaceC15499.mo37105();
                str3 = strMo37102;
                str2 = lowerCase;
            } else {
                str2 = str5;
                str3 = str4;
            }
            String str6 = strM7570;
            try {
                C3875 c3875 = (C3875) ((C15166) this.f69904.mo29452()).m36379(this.f69904, str2, c2465.m7565(), false, c2465.m7564());
                c3875.m11234(InterfaceC6698.class);
                try {
                    try {
                        C1053 c1053M11233 = c3875.m11233(this.f69904, str2, str3);
                        c1053M11233.m3983();
                        try {
                            C8110 c8110M3974 = c1053M11233.m3974(str6);
                            c8110M3974.m21344();
                            c1053 = c1053M11233;
                            try {
                                C8110 c8110M48208 = m48207(c2464, str2, str6, c3875, c8110M3974, interfaceC15499);
                                if (interfaceC15499 != null) {
                                    try {
                                        c8110M48208.m21338(interfaceC15499);
                                        if (interfaceC15499 != interfaceC15498M24899) {
                                            interfaceC15499.mo37104().mo37097();
                                        }
                                    } catch (Throwable th10) {
                                        try {
                                            c8110M48208.m21347();
                                        } catch (Throwable th11) {
                                            th10.addSuppressed(th11);
                                        }
                                        throw th10;
                                    }
                                }
                                m48208(c8110M48208);
                                C17987 c17988 = new C17987(c2464, this);
                                c8110M48208.m21347();
                                try {
                                    c8110M3974.m21347();
                                    c1053.m3984();
                                    try {
                                        c3875.m9589();
                                        return c17988;
                                    } catch (IOException e) {
                                        e = e;
                                        c2465 = c2464;
                                        f69900.mo12120("Referral failed, trying next", (Exception) e);
                                        interfaceC15499 = interfaceC15499;
                                        if (interfaceC15499 != null) {
                                            next = interfaceC15499.next();
                                        }
                                        if (interfaceC15499 == interfaceC15498M24899) {
                                            interfaceC15499 = next;
                                            throw e;
                                        }
                                        interfaceC15499 = next;
                                        str5 = str2;
                                        str4 = str3;
                                        strM7570 = str6;
                                    }
                                } catch (Throwable th12) {
                                    th = th12;
                                    Throwable th13 = th;
                                    try {
                                        c1053.m3984();
                                        throw th13;
                                    } catch (Throwable th14) {
                                        th13.addSuppressed(th14);
                                        throw th13;
                                    }
                                }
                            } catch (Throwable th15) {
                                try {
                                    c8110M3974.m21347();
                                } catch (Throwable th16) {
                                    th15.addSuppressed(th16);
                                }
                                throw th15;
                            }
                        } catch (Throwable th17) {
                            th = th17;
                            c1053 = c1053M11233;
                        }
                    } catch (Throwable th18) {
                        th = th18;
                        c2465 = c2464;
                        try {
                            c3875.m9589();
                        } catch (Throwable th19) {
                            th.addSuppressed(th19);
                        }
                        throw th;
                    }
                } catch (Throwable th20) {
                    th = th20;
                    c3875.m9589();
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
            }
            interfaceC15499 = next;
            str5 = str2;
            str4 = str3;
            strM7570 = str6;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C8110 m48207(C2464 c2464, String str, String str2, InterfaceC6698 interfaceC6698, C8110 c8110, InterfaceC15498 interfaceC15498) {
        InterfaceC4314 interfaceC4314 = f69900;
        boolean zMo12125 = interfaceC4314.mo12125();
        InterfaceC19067 interfaceC19067 = this.f69904;
        if (zMo12125 && ((C3875) interfaceC6698).m11231() && !c2464.m7567()) {
            interfaceC19067.mo29449().getClass();
            interfaceC4314.mo12135("Signatures for file enabled but not required " + this);
        }
        if (interfaceC15498 != null) {
            c8110.m21341();
        }
        try {
            if (interfaceC4314.mo12133()) {
                interfaceC4314.mo12127("doConnect: " + str);
            }
            c8110.m21334((InterfaceC3314) null, (InterfaceC4913) null);
            c8110.m21337();
            return c8110;
        } catch (C20064 e) {
            interfaceC4314.mo12120("Authentication failed", (Exception) e);
            C1053 c1053M21342 = c8110.m21342();
            try {
                if (c1053M21342.m3972().mo43144() || c1053M21342.m3972().mo43145()) {
                    try {
                        C1053 c1053M11233 = ((C3875) interfaceC6698).m11233(interfaceC19067.mo13095(), c1053M21342.m3989(), c1053M21342.m3982());
                        c1053M11233.m3983();
                        try {
                            C8110 c8110M3974 = c1053M11233.m3974(str2);
                            c8110M3974.m21344();
                            try {
                                c8110M3974.m21334((InterfaceC3314) null, (InterfaceC4913) null);
                                interfaceC4314.mo12135("Anonymous retry succeeded");
                                c8110M3974.m21337();
                                c8110M3974.m21347();
                                c1053M11233.m3984();
                                c1053M21342.m3984();
                                return c8110M3974;
                            } catch (Throwable th) {
                                try {
                                    c8110M3974.m21347();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            try {
                                c1053M11233.m3984();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    } catch (Exception e2) {
                        interfaceC4314.mo12120("Retry also failed", e2);
                        throw e;
                    }
                }
                c2464.m7563().toString();
                if (!interfaceC19067.mo13092()) {
                    throw e;
                }
                interfaceC4314.mo12135("Trying to renew credentials after auth error");
                C1053 c1053M11234 = ((C3875) interfaceC6698).m11233(interfaceC19067, c1053M21342.m3989(), c1053M21342.m3982());
                c1053M11234.m3983();
                try {
                    C8110 c8110M3975 = c1053M11234.m3974(str2);
                    c8110M3975.m21344();
                    if (interfaceC15498 != null) {
                        try {
                            c8110M3975.m21341();
                        } catch (Throwable th5) {
                            try {
                                c8110M3975.m21347();
                            } catch (Throwable th6) {
                                th5.addSuppressed(th6);
                            }
                            throw th5;
                        }
                    }
                    c8110M3975.m21334((InterfaceC3314) null, (InterfaceC4913) null);
                    c8110M3975.m21337();
                    c8110M3975.m21347();
                    c1053M11234.m3984();
                    c1053M21342.m3984();
                    return c8110M3975;
                } catch (Throwable th7) {
                    try {
                        c1053M11234.m3984();
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                    }
                    throw th7;
                }
            } catch (Throwable th9) {
                c1053M21342.m3984();
                throw th9;
            }
            try {
                c1053M21342.m3984();
            } catch (Throwable th10) {
                th9.addSuppressed(th10);
            }
            throw th9;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC24006 m48218(C2464 c2464, InterfaceC11970 interfaceC11970) {
        if (interfaceC11970 instanceof C4808) {
            return c2464;
        }
        for (int i = 0; i < ((C9895) this.f69904.mo29449()).m25075() + 1; i++) {
            try {
                return m48211(c2464, interfaceC11970);
            } catch (C12303 e) {
                if (e.m30561() != -1073741275 && !(e.getCause() instanceof C4498)) {
                    throw e;
                }
                InterfaceC4314 interfaceC4314 = f69900;
                interfaceC4314.mo12120("resolveDfs", (Exception) e);
                if (interfaceC4314.mo12125()) {
                    interfaceC4314.mo12135("Retrying (" + i + ") resolveDfs: " + interfaceC11970);
                }
                interfaceC4314.mo12135("Disconnecting tree on DFS retry");
                m48225();
                try {
                    Thread.sleep(f69899.nextInt(OpenAuthTask.Duplex) + 500);
                } catch (InterruptedException e2) {
                    interfaceC4314.mo12120("resolveDfs", (Exception) e2);
                }
                m48224(c2464).close();
            }
        }
        return c2464;
    }

    /* JADX WARN: Code duplicated, block: B:136:0x01ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:? A[Catch: all -> 0x01f7, SYNTHETIC, TRY_LEAVE, TryCatch #4 {all -> 0x01f7, blocks: (B:3:0x0014, B:56:0x013d, B:75:0x016b, B:92:0x01b6, B:30:0x009e, B:101:0x01c9, B:128:0x01f6, B:127:0x01f3, B:123:0x01ed, B:4:0x0018, B:55:0x013a, B:74:0x0168, B:91:0x01b3, B:29:0x009b, B:100:0x01c6, B:119:0x01e8, B:118:0x01e5), top: B:144:0x0014, inners: #0, #5 }] */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private InterfaceC24006 m48211(C2464 c2464, InterfaceC11970 interfaceC11970) throws C12303 {
        String strMo12625;
        InterfaceC19067 interfaceC19067 = this.f69904;
        C17987 c17987M48224 = m48224(c2464);
        try {
            C1053 c1053M41877 = c17987M48224.m41877();
            try {
                C3875 c3875M3985 = c1053M41877.m3985();
                try {
                    try {
                        C8110 c8110M48205 = m48205();
                        try {
                            c3875M3985.m11249();
                            String path = interfaceC11970 != null ? interfaceC11970.getPath() : c2464.m7557();
                            if (interfaceC11970 != null) {
                                strMo12625 = interfaceC11970.mo12625();
                            } else {
                                strMo12625 = "\\" + c2464.m7556() + '\\' + c2464.m7570() + c2464.m7557();
                            }
                            boolean zM21345 = c8110M48205.m21345();
                            InterfaceC4314 interfaceC4314 = f69900;
                            if (zM21345 || !c8110M48205.m21346()) {
                                if (!c8110M48205.m21345()) {
                                    interfaceC4314.mo12127("Not in DFS");
                                    c8110M48205.m21347();
                                    c3875M3985.m9589();
                                    c1053M41877.m3984();
                                    c17987M48224.close();
                                    return c2464;
                                }
                                InterfaceC15498 interfaceC15498M21332 = c8110M48205.m21332();
                                if (interfaceC15498M21332 != null) {
                                    if (interfaceC4314.mo12125()) {
                                        interfaceC4314.mo12135(String.format("Need to adjust request path %s (full: %s) -> %s", path, strMo12625, interfaceC15498M21332));
                                    }
                                    String strM7558 = c2464.m7558(interfaceC15498M21332, path);
                                    if (interfaceC11970 != null) {
                                        interfaceC11970.mo12623(strM7558);
                                    }
                                    c8110M48205.m21347();
                                    c3875M3985.m9589();
                                    c1053M41877.m3984();
                                    c17987M48224.close();
                                    return c2464;
                                }
                                interfaceC4314.mo12135("No tree referral but in DFS");
                            }
                            if (interfaceC11970 != null) {
                                interfaceC11970.mo12624(c1053M41877.m3982(), c1053M41877.m3989(), strMo12625);
                            }
                            InterfaceC15498 interfaceC15498M24899 = ((C9790) interfaceC19067.mo29447()).m24899(interfaceC19067, c2464.m7556(), c2464.m7570(), c2464.m7557());
                            if (interfaceC15498M24899 == null) {
                                if (!c8110M48205.m21345() || (interfaceC11970 instanceof C4808) || (interfaceC11970 instanceof C5514)) {
                                    interfaceC4314.mo12127("Not in DFS");
                                    c8110M48205.m21347();
                                    c3875M3985.m9589();
                                    c1053M41877.m3984();
                                    c17987M48224.close();
                                    return c2464;
                                }
                                if (interfaceC4314.mo12125()) {
                                    interfaceC4314.mo12135("No referral available for  " + strMo12625);
                                }
                                throw new C8484("No referral but in domain DFS " + strMo12625);
                            }
                            if (interfaceC4314.mo12125()) {
                                interfaceC4314.mo12135("Resolved " + strMo12625 + " -> " + interfaceC15498M24899);
                            }
                            String strM7559 = c2464.m7558(interfaceC15498M24899, path);
                            if (interfaceC11970 != null) {
                                interfaceC11970.mo12623(strM7559);
                            }
                            if (c8110M48205.m21333().equals(interfaceC15498M24899.mo37105())) {
                                c8110M48205.m21347();
                                c3875M3985.m9589();
                                c1053M41877.m3984();
                                c17987M48224.close();
                                return c2464;
                            }
                            InterfaceC15498 next = interfaceC15498M24899;
                            do {
                                if (interfaceC4314.mo12125()) {
                                    interfaceC4314.mo12135("Need to switch tree for " + next);
                                }
                                try {
                                    C17987 c17987M48217 = m48217(c2464, c1053M41877.m3989(), next);
                                    try {
                                        interfaceC4314.mo12135("Switched tree");
                                        c17987M48217.close();
                                        c8110M48205.m21347();
                                        c3875M3985.m9589();
                                        c1053M41877.m3984();
                                        c17987M48224.close();
                                        return c2464;
                                    } catch (Throwable th) {
                                        try {
                                            c17987M48217.close();
                                            throw th;
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                            throw th;
                                        }
                                    }
                                } catch (IOException e) {
                                    interfaceC4314.mo12120("Failed to connect tree", (Exception) e);
                                    next = next.next();
                                }
                            } while (next != interfaceC15498M24899);
                            throw new C8484("All referral tree connections failed", e);
                        } catch (Throwable th3) {
                            if (c8110M48205 == null) {
                                throw th3;
                            }
                            try {
                                c8110M48205.m21347();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                            if (c1053M41877 != null) {
                                throw th;
                            }
                            try {
                                c1053M41877.m3984();
                                throw th;
                            } catch (Throwable th5) {
                                th.addSuppressed(th5);
                                throw th;
                            }
                        }
                    } catch (Throwable th6) {
                        c3875M3985.m9589();
                        throw th6;
                    }
                    c3875M3985.m9589();
                    throw th6;
                } catch (Throwable th7) {
                    th6.addSuppressed(th7);
                    throw th6;
                }
            } catch (Throwable th8) {
                if (c1053M41877 != null) {
                    throw th8;
                }
                c1053M41877.m3984();
                throw th8;
            }
        } catch (Throwable th9) {
            try {
                c17987M48224.close();
                throw th9;
            } catch (Throwable th10) {
                th9.addSuppressed(th10);
                throw th9;
            }
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long m48221() {
        C8110 c8110M48209 = m48209();
        if (c8110M48209 == null) {
            return -1L;
        }
        return c8110M48209.m21349();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C1053 m48213() {
        C8110 c8110M48209 = m48209();
        if (c8110M48209 != null) {
            return c8110M48209.m21342();
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m48226() {
        C8110 c8110M48205 = m48205();
        try {
            int iM21343 = c8110M48205.m21343();
            c8110M48205.m21347();
            return iM21343;
        } catch (Throwable th) {
            if (c8110M48205 != null) {
                try {
                    c8110M48205.m21347();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m48220(C21515 c21515) {
        C8110 c8110M48205 = m48205();
        try {
            C8110 c8110M48206 = c21515.m48205();
            boolean z = c8110M48205 == c8110M48206;
            if (c8110M48206 != null) {
                c8110M48206.m21347();
            }
            if (c8110M48205 != null) {
                c8110M48205.m21347();
            }
            return z;
        } catch (Throwable th) {
            if (c8110M48205 != null) {
                try {
                    c8110M48205.m21347();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
