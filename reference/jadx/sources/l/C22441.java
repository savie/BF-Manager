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

/* JADX INFO: renamed from: l.᩸֡᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 1A1B */
/* JADX INFO: loaded from: classes.dex */
public class C22441 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f72644 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23032 f72646;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public volatile boolean f72647;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AtomicLong f72648;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public volatile boolean f72649;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C12744 f72650;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C22441 f72651;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC4541 f72652;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f72645 = C16980.m40037(C22441.class);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Random f72643 = new Random();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private synchronized C12744 m50597() {
        C12744 c12744 = this.f72650;
        if (c12744 != null) {
            c12744.m31568();
            return c12744;
        }
        C22441 c22441 = this.f72651;
        if (c22441 == null) {
            return c12744;
        }
        C12744 c12744M50597 = c22441.m50597();
        this.f72650 = c12744M50597;
        return c12744M50597;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private synchronized C12744 m50601() {
        C12744 c12744 = this.f72650;
        if (c12744 != null) {
            return c12744;
        }
        C22441 c22441 = this.f72651;
        if (c22441 == null) {
            return null;
        }
        return c22441.m50601();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C19457 m50606(C1337 c1337) {
        C8794 c8794M50618 = m50618();
        try {
            if (m50613()) {
                C14014 c14014M23613 = c8794M50618.m23613();
                try {
                    if (c14014M23613.mo1093() || c14014M23613.m34129() == null) {
                        f72645.mo13721("Disconnecting failed tree and session");
                        m50617();
                    }
                    c14014M23613.m1095();
                } catch (Throwable th) {
                    try {
                        c14014M23613.m1095();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            if (!m50613()) {
                C19457 c19457M50607 = m50607(c1337, c1337.m4927());
                if (c8794M50618 != null) {
                    c8794M50618.m23611();
                }
                return c19457M50607;
            }
            f72645.mo13717("Already connected");
            C19457 c19457 = new C19457(c1337, this);
            if (c8794M50618 != null) {
                c8794M50618.m23611();
            }
            return c19457;
        } catch (Throwable th3) {
            if (c8794M50618 != null) {
                try {
                    c8794M50618.m23611();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m50613() {
        C12744 c12744M50601;
        c12744M50601 = m50601();
        return c12744M50601 != null && c12744M50601.m31577();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized void m50617() {
        C8794 c8794M50618 = m50618();
        if (c8794M50618 == null) {
            if (c8794M50618 != null) {
                c8794M50618.m23611();
            }
            return;
        }
        try {
            C14014 c14014M23613 = c8794M50618.m23613();
            try {
                synchronized (c14014M23613) {
                    C12744 c12744M50601 = m50601();
                    if (c12744M50601 != null) {
                        try {
                            c12744M50601.m31571(true, true);
                            this.f72650 = null;
                            this.f72649 = false;
                        } catch (Throwable th) {
                            this.f72650 = null;
                            this.f72649 = false;
                            throw th;
                        }
                    } else {
                        this.f72651.m50617();
                    }
                }
                c14014M23613.m1095();
                c8794M50618.m23611();
            } catch (Throwable th2) {
                try {
                    c14014M23613.m1095();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            try {
                c8794M50618.m23611();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private synchronized void m50600(C12744 c12744) {
        C12744 c12744M50597 = m50597();
        if (c12744M50597 == c12744) {
            if (c12744M50597 != null) {
                c12744M50597.m31578();
            }
            return;
        }
        try {
            boolean z = this.f72649;
            InterfaceC25186 interfaceC25186 = f72645;
            interfaceC25186.mo13721("Switching tree");
            interfaceC25186.mo13721("Acquired tree on switch " + c12744);
            c12744.m31568();
            this.f72649 = true;
            this.f72650 = c12744;
            if (c12744M50597 != null && z) {
                c12744M50597.m31578();
            }
            if (this.f72651 != null && this.f72647) {
                interfaceC25186.mo13721("Releasing delegate");
                this.f72647 = false;
                this.f72651.m50611();
            }
            if (c12744M50597 != null) {
                c12744M50597.m31578();
            }
        } catch (Throwable th) {
            if (c12744M50597 != null) {
                try {
                    c12744M50597.m31578();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public C22441(InterfaceC23032 interfaceC23032) {
        this.f72648 = new AtomicLong();
        this.f72646 = interfaceC23032;
        this.f72651 = null;
    }

    public C22441(C22441 c22441) {
        this.f72648 = new AtomicLong();
        this.f72646 = c22441.f72646;
        this.f72651 = c22441;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C22441 m50603(C22441 c22441) {
        c22441.f72646.mo2875().getClass();
        return new C22441(c22441);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5878 m50612() {
        return this.f72646.mo2875();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50609() {
        long jIncrementAndGet = this.f72648.incrementAndGet();
        InterfaceC25186 interfaceC25186 = f72645;
        if (interfaceC25186.mo13713()) {
            interfaceC25186.mo13717("Acquire tree connection " + jIncrementAndGet + " " + this);
        }
        if (jIncrementAndGet == 1) {
            synchronized (this) {
                C12744 c12744M50597 = m50597();
                if (c12744M50597 != null) {
                    try {
                        if (!this.f72649) {
                            if (interfaceC25186.mo13707()) {
                                interfaceC25186.mo13721("Acquire tree on first usage " + c12744M50597);
                            }
                            c12744M50597.m31568();
                            this.f72649 = true;
                        }
                    } catch (Throwable th) {
                        try {
                            c12744M50597.m31578();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (c12744M50597 != null) {
                    c12744M50597.m31578();
                }
                if (this.f72651 != null && !this.f72647) {
                    interfaceC25186.mo13721("Acquire delegate on first usage");
                    this.f72651.m50609();
                    this.f72647 = true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m50611() {
        long jDecrementAndGet = this.f72648.decrementAndGet();
        InterfaceC25186 interfaceC25186 = f72645;
        if (interfaceC25186.mo13713()) {
            interfaceC25186.mo13717("Release tree connection " + jDecrementAndGet + " " + this);
        }
        if (jDecrementAndGet != 0) {
            if (jDecrementAndGet >= 0) {
                return;
            }
            interfaceC25186.mo13699("Usage count dropped below zero " + this);
            throw new C3640("Usage count dropped below zero");
        }
        synchronized (this) {
            C12744 c12744M50597 = m50597();
            try {
                if (this.f72649 && c12744M50597 != null) {
                    if (interfaceC25186.mo13707()) {
                        interfaceC25186.mo13721("Tree connection no longer in use, release tree " + c12744M50597);
                    }
                    this.f72649 = false;
                    c12744M50597.m31578();
                }
                if (c12744M50597 != null) {
                    c12744M50597.m31578();
                }
                if (this.f72651 != null && this.f72647) {
                    this.f72647 = false;
                    this.f72651.m50611();
                }
            } catch (Throwable th) {
                if (c12744M50597 != null) {
                    try {
                        c12744M50597.m31578();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        Object obj = this.f72652;
        if (obj != null) {
            synchronized (this) {
                try {
                    interfaceC25186.mo13721("Disconnecting exclusive transport");
                    this.f72652 = null;
                    this.f72650 = null;
                    this.f72649 = false;
                    ((AbstractRunnableC0066) obj).m1095();
                    ((AbstractRunnableC0066) obj).m1089(false, false);
                } catch (Exception e) {
                    f72645.mo13724("Failed to close exclusive transport", (Throwable) e);
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
    public final InterfaceC18315 m50605(C1337 c1337, InterfaceC21299 interfaceC21299, InterfaceC18315 interfaceC18315, EnumC13269... enumC13269Arr) throws Throwable {
        InterfaceC25186 interfaceC25186;
        char c;
        Throwable th;
        C19457 c19457M50616;
        C22441 c22441 = this;
        EnumSet enumSetNoneOf = enumC13269Arr.length == 0 ? EnumSet.noneOf(EnumC13269.class) : EnumSet.copyOf((Collection) Arrays.asList(enumC13269Arr));
        InterfaceC7874 interfaceC7874 = interfaceC21299 instanceof InterfaceC7874 ? (InterfaceC7874) interfaceC21299 : null;
        String path = interfaceC7874 != null ? interfaceC7874.getPath() : null;
        String strMo1460 = interfaceC7874 != null ? interfaceC7874.mo1460() : null;
        String str = "\\" + c1337.m4921() + "\\" + c1337.m4923() + c1337.m4914();
        int iM35740 = ((C14826) c22441.f72646.mo2875()).m35740();
        String str2 = null;
        Throwable th2 = null;
        int i = 1;
        while (true) {
            interfaceC25186 = f72645;
            if (i > iM35740) {
                break;
            }
            if (interfaceC7874 != null) {
                interfaceC7874.mo1464(str2, str2, str);
            }
            try {
                return c22441.m50599(c1337, interfaceC21299, interfaceC18315, enumSetNoneOf);
            } catch (C20728 e) {
                C20728 c20728 = e;
                if (enumSetNoneOf.contains(EnumC13269.NO_RETRY) || (!(c20728.getCause() instanceof C7524) && c20728.m47408() != -1073741811)) {
                    interfaceC25186.mo13711("Not retrying", c20728);
                    throw c20728;
                }
                c = 1;
                interfaceC25186.mo13711("send", c20728);
                th = c20728;
                if (interfaceC25186.mo13707()) {
                    Integer numValueOf = Integer.valueOf(i);
                    Integer numValueOf2 = Integer.valueOf(iM35740);
                    Object[] objArr = new Object[3];
                    objArr[0] = numValueOf;
                    objArr[c] = numValueOf2;
                    objArr[2] = interfaceC21299;
                    interfaceC25186.mo13721(String.format("Retrying (%d/%d) request %s", objArr));
                }
                interfaceC25186.mo13711("Disconnecting tree on send retry", th);
                m50617();
                if (i >= iM35740) {
                    th2 = th;
                    if (th2 != null) {
                        interfaceC25186.mo13711("All attempts have failed, last exception", th2);
                        throw th2;
                    }
                    throw new C20728("All attempts failed, but no exception");
                }
                if (i != 1) {
                    try {
                        Thread.sleep(f72643.nextInt(1000) + 500);
                    } catch (InterruptedException e2) {
                        interfaceC25186.mo13711("interrupted sleep in send", e2);
                    }
                }
                if (interfaceC21299 != null) {
                    interfaceC25186.mo13721("Restting request");
                    interfaceC21299.reset();
                }
                if (interfaceC7874 != null) {
                    interfaceC7874.mo1463(path);
                    interfaceC7874.mo1464(interfaceC7874.mo1471(), interfaceC7874.mo1462(), strMo1460);
                }
                if (interfaceC18315 != null) {
                    interfaceC18315.reset();
                }
                try {
                    c19457M50616 = m50616(c1337);
                    try {
                        interfaceC25186.mo13721("Have new tree connection for retry");
                        c19457M50616.close();
                    } catch (Throwable th3) {
                        try {
                            c19457M50616.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (C20728 e3) {
                    interfaceC25186.mo13711("Failed to connect tree on retry", e3);
                    th = e3;
                }
                i++;
                str2 = null;
                c22441 = this;
                th2 = th;
            } catch (C20048 e4) {
                C20048 c20048 = e4;
                interfaceC25186.mo13711("send", c20048);
                c = 1;
                th = c20048;
                if (interfaceC25186.mo13707()) {
                    Integer numValueOf3 = Integer.valueOf(i);
                    Integer numValueOf4 = Integer.valueOf(iM35740);
                    Object[] objArr2 = new Object[3];
                    objArr2[0] = numValueOf3;
                    objArr2[c] = numValueOf4;
                    objArr2[2] = interfaceC21299;
                    interfaceC25186.mo13721(String.format("Retrying (%d/%d) request %s", objArr2));
                }
                interfaceC25186.mo13711("Disconnecting tree on send retry", th);
                m50617();
                if (i >= iM35740) {
                    th2 = th;
                    if (th2 != null) {
                        interfaceC25186.mo13711("All attempts have failed, last exception", th2);
                        throw th2;
                    }
                    throw new C20728("All attempts failed, but no exception");
                }
                if (i != 1) {
                    Thread.sleep(f72643.nextInt(1000) + 500);
                }
                if (interfaceC21299 != null) {
                    interfaceC25186.mo13721("Restting request");
                    interfaceC21299.reset();
                }
                if (interfaceC7874 != null) {
                    interfaceC7874.mo1463(path);
                    interfaceC7874.mo1464(interfaceC7874.mo1471(), interfaceC7874.mo1462(), strMo1460);
                }
                if (interfaceC18315 != null) {
                    interfaceC18315.reset();
                }
                c19457M50616 = m50616(c1337);
                interfaceC25186.mo13721("Have new tree connection for retry");
                c19457M50616.close();
                i++;
                str2 = null;
                c22441 = this;
                th2 = th;
            }
            i++;
            str2 = null;
            c22441 = this;
            th2 = th;
        }
        if (th2 != null) {
            interfaceC25186.mo13711("All attempts have failed, last exception", th2);
            throw th2;
        }
        throw new C20728("All attempts failed, but no exception");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private InterfaceC18315 m50599(C1337 c1337, InterfaceC21299 interfaceC21299, InterfaceC18315 interfaceC18315, EnumSet enumSet) throws C20048 {
        for (int i = 10; i > 0; i--) {
            if (interfaceC21299 instanceof InterfaceC7874) {
                m50604(c1337, (InterfaceC7874) interfaceC21299);
            }
            try {
                C12744 c12744M50597 = m50597();
                try {
                    if (c12744M50597 == null) {
                        throw new C20048("Failed to get tree connection");
                    }
                    InterfaceC18315 interfaceC18315M31567 = c12744M50597.m31567(interfaceC21299, interfaceC18315, enumSet);
                    c12744M50597.m31578();
                    return interfaceC18315M31567;
                } catch (Throwable th) {
                    if (c12744M50597 != null) {
                        try {
                            c12744M50597.m31578();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (C18578 e) {
                ((C13839) e.m43158()).mo14618();
                interfaceC21299.reset();
                f72645.mo13722("send0", (Exception) e);
            }
        }
        throw new C20048("Loop in DFS referrals");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C19457 m50616(C1337 c1337) throws C20728 {
        try {
            return m50606(c1337);
        } catch (UnknownHostException e) {
            throw new C20728("Failed to connect to server", e);
        } catch (C20728 e2) {
            throw e2;
        } catch (IOException e3) {
            throw new C20728("Failed to connect to server", e3);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C19457 m50607(C1337 c1337, String str) {
        return m50608(c1337, str, null);
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00a7  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C19457 m50608(C1337 c1337, String str, InterfaceC4717 interfaceC4717) {
        String strM23608;
        InterfaceC4717 interfaceC4717M49037;
        String str2;
        String str3;
        C13839 next;
        Throwable th;
        C8794 c8794;
        C12744 c12744M50597 = m50597();
        String strM4914 = null;
        if (c12744M50597 != null) {
            try {
                InterfaceC25186 interfaceC25186 = f72645;
                if (interfaceC25186.mo13707()) {
                    interfaceC25186.mo13721("Tree is " + c12744M50597);
                }
                if (C17359.equals(c1337.m4923(), c12744M50597.m31573())) {
                    C8794 c8794M31579 = c12744M50597.m31579();
                    try {
                        strM23608 = c8794M31579.m23608();
                        if (!c8794M31579.m23599()) {
                            C14014 c14014M23613 = c8794M31579.m23613();
                            try {
                                C12744 c12744M50598 = m50598(c1337, str, c12744M50597.m31573(), c14014M23613, c12744M50597, null);
                                try {
                                    m50600(c12744M50598);
                                    C19457 c19457 = new C19457(c1337, this);
                                    c12744M50598.m31578();
                                    c14014M23613.m1095();
                                    c8794M31579.m23611();
                                    c12744M50597.m31578();
                                    return c19457;
                                } catch (Throwable th2) {
                                    try {
                                        c12744M50598.m31578();
                                        throw th2;
                                    } catch (Throwable th3) {
                                        th2.addSuppressed(th3);
                                        throw th2;
                                    }
                                }
                            } catch (Throwable th4) {
                                try {
                                    c14014M23613.m1095();
                                    throw th4;
                                } catch (Throwable th5) {
                                    th4.addSuppressed(th5);
                                    throw th4;
                                }
                            }
                        }
                        interfaceC25186.mo13721("Session no longer valid");
                        c8794M31579.m23611();
                    } catch (Throwable th6) {
                        try {
                            c8794M31579.m23611();
                            throw th6;
                        } catch (Throwable th7) {
                            th6.addSuppressed(th7);
                            throw th6;
                        }
                    }
                    try {
                        c12744M50597.m31578();
                        throw th;
                    } catch (Throwable th8) {
                        th.addSuppressed(th8);
                        throw th;
                    }
                }
                strM23608 = null;
            } catch (Throwable th9) {
                c12744M50597.m31578();
                throw th9;
            }
        } else {
            strM23608 = null;
        }
        if (c12744M50597 != null) {
            c12744M50597.m31578();
        }
        String strM4927 = c1337.m4927();
        if (c1337.m4920() != 8 && c1337.m4914() != null && !"\\".equals(c1337.m4914())) {
            strM4914 = c1337.m4914();
        }
        String strM4923 = c1337.m4923();
        if (interfaceC4717 != null) {
            interfaceC4717M49037 = interfaceC4717;
        } else {
            interfaceC4717M49037 = ((C21562) this.f72646.mo2876()).m49037(this.f72646, strM4927, c1337.m4923(), strM4914);
        }
        String str4 = strM23608;
        C1337 c1338 = c1337;
        InterfaceC4717 interfaceC4718 = interfaceC4717M49037;
        String str5 = str;
        while (true) {
            if (interfaceC4718 != null) {
                String strMo14617 = interfaceC4718.mo14617();
                String lowerCase = interfaceC4718.mo14609().toLowerCase(Locale.ROOT);
                strM4923 = interfaceC4718.mo14615();
                str3 = strMo14617;
                str2 = lowerCase;
            } else {
                str2 = str5;
                str3 = str4;
            }
            String str6 = strM4923;
            try {
                C14014 c14014 = (C14014) ((C10506) this.f72646.mo2874()).m26967(this.f72646, str2, c1338.m4928(), false, c1338.m4915());
                c14014.m34120(InterfaceC4541.class);
                try {
                    try {
                        C8794 c8794M34121 = c14014.m34121(this.f72646, str2, str3);
                        c8794M34121.m23617();
                        try {
                            C12744 c12744M23601 = c8794M34121.m23601(str6);
                            c12744M23601.m31580();
                            c8794 = c8794M34121;
                            try {
                                C12744 c12744M50599 = m50598(c1337, str2, str6, c14014, c12744M23601, interfaceC4718);
                                if (interfaceC4718 != null) {
                                    try {
                                        c12744M50599.m31569(interfaceC4718);
                                        if (interfaceC4718 != interfaceC4717M49037) {
                                            interfaceC4718.mo14618().mo14608();
                                        }
                                    } catch (Throwable th10) {
                                        try {
                                            c12744M50599.m31578();
                                        } catch (Throwable th11) {
                                            th10.addSuppressed(th11);
                                        }
                                        throw th10;
                                    }
                                }
                                m50600(c12744M50599);
                                C19457 c19458 = new C19457(c1337, this);
                                c12744M50599.m31578();
                                try {
                                    c12744M23601.m31578();
                                    c8794.m23611();
                                    try {
                                        c14014.m1095();
                                        return c19458;
                                    } catch (IOException e) {
                                        e = e;
                                        c1338 = c1337;
                                        f72645.mo13711("Referral failed, trying next", e);
                                        interfaceC4718 = interfaceC4718;
                                        if (interfaceC4718 != null) {
                                            next = interfaceC4718.next();
                                        }
                                        if (interfaceC4718 == interfaceC4717M49037) {
                                            interfaceC4718 = next;
                                            throw e;
                                        }
                                        interfaceC4718 = next;
                                        str5 = str2;
                                        str4 = str3;
                                        strM4923 = str6;
                                    }
                                } catch (Throwable th12) {
                                    th = th12;
                                    Throwable th13 = th;
                                    try {
                                        c8794.m23611();
                                        throw th13;
                                    } catch (Throwable th14) {
                                        th13.addSuppressed(th14);
                                        throw th13;
                                    }
                                }
                            } catch (Throwable th15) {
                                try {
                                    c12744M23601.m31578();
                                } catch (Throwable th16) {
                                    th15.addSuppressed(th16);
                                }
                                throw th15;
                            }
                        } catch (Throwable th17) {
                            th = th17;
                            c8794 = c8794M34121;
                        }
                    } catch (Throwable th18) {
                        th = th18;
                        c1338 = c1337;
                        try {
                            c14014.m1095();
                        } catch (Throwable th19) {
                            th.addSuppressed(th19);
                        }
                        throw th;
                    }
                } catch (Throwable th20) {
                    th = th20;
                    c14014.m1095();
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
            }
            interfaceC4718 = next;
            str5 = str2;
            str4 = str3;
            strM4923 = str6;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C12744 m50598(C1337 c1337, String str, String str2, InterfaceC4541 interfaceC4541, C12744 c12744, InterfaceC4717 interfaceC4717) {
        InterfaceC25186 interfaceC25186 = f72645;
        boolean zMo13707 = interfaceC25186.mo13707();
        InterfaceC23032 interfaceC23032 = this.f72646;
        if (zMo13707 && ((C14014) interfaceC4541).m34130() && !c1337.m4925()) {
            interfaceC23032.mo2875().getClass();
            interfaceC25186.mo13721("Signatures for file enabled but not required " + this);
        }
        if (interfaceC4717 != null) {
            c12744.m31564();
        }
        try {
            if (interfaceC25186.mo13713()) {
                interfaceC25186.mo13717("doConnect: " + str);
            }
            c12744.m31566((InterfaceC21299) null, (InterfaceC18315) null);
            c12744.m31568();
            return c12744;
        } catch (C16252 e) {
            interfaceC25186.mo13711("Authentication failed", e);
            C8794 c8794M31579 = c12744.m31579();
            try {
                if (c8794M31579.m23609().mo45913() || c8794M31579.m23609().mo45914()) {
                    try {
                        C8794 c8794M34121 = ((C14014) interfaceC4541).m34121(interfaceC23032.mo22002(), c8794M31579.m23614(), c8794M31579.m23608());
                        c8794M34121.m23617();
                        try {
                            C12744 c12744M23601 = c8794M34121.m23601(str2);
                            c12744M23601.m31580();
                            try {
                                c12744M23601.m31566((InterfaceC21299) null, (InterfaceC18315) null);
                                interfaceC25186.mo13721("Anonymous retry succeeded");
                                c12744M23601.m31568();
                                c12744M23601.m31578();
                                c8794M34121.m23611();
                                c8794M31579.m23611();
                                return c12744M23601;
                            } catch (Throwable th) {
                                try {
                                    c12744M23601.m31578();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            try {
                                c8794M34121.m23611();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    } catch (Exception e2) {
                        interfaceC25186.mo13711("Retry also failed", e2);
                        throw e;
                    }
                }
                c1337.m4922().toString();
                if (!interfaceC23032.mo22001()) {
                    throw e;
                }
                interfaceC25186.mo13721("Trying to renew credentials after auth error");
                C8794 c8794M34122 = ((C14014) interfaceC4541).m34121(interfaceC23032, c8794M31579.m23614(), c8794M31579.m23608());
                c8794M34122.m23617();
                try {
                    C12744 c12744M23602 = c8794M34122.m23601(str2);
                    c12744M23602.m31580();
                    if (interfaceC4717 != null) {
                        try {
                            c12744M23602.m31564();
                        } catch (Throwable th5) {
                            try {
                                c12744M23602.m31578();
                            } catch (Throwable th6) {
                                th5.addSuppressed(th6);
                            }
                            throw th5;
                        }
                    }
                    c12744M23602.m31566((InterfaceC21299) null, (InterfaceC18315) null);
                    c12744M23602.m31568();
                    c12744M23602.m31578();
                    c8794M34122.m23611();
                    c8794M31579.m23611();
                    return c12744M23602;
                } catch (Throwable th7) {
                    try {
                        c8794M34122.m23611();
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                    }
                    throw th7;
                }
            } catch (Throwable th9) {
                c8794M31579.m23611();
                throw th9;
            }
            try {
                c8794M31579.m23611();
            } catch (Throwable th10) {
                th9.addSuppressed(th10);
            }
            throw th9;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6624 m50604(C1337 c1337, InterfaceC7874 interfaceC7874) {
        if (interfaceC7874 instanceof C0242) {
            return c1337;
        }
        for (int i = 0; i < ((C14826) this.f72646.mo2875()).m35740() + 1; i++) {
            try {
                return m50602(c1337, interfaceC7874);
            } catch (C20728 e) {
                if (e.m47408() != -1073741275 && !(e.getCause() instanceof C7524)) {
                    throw e;
                }
                InterfaceC25186 interfaceC25186 = f72645;
                interfaceC25186.mo13711("resolveDfs", e);
                if (interfaceC25186.mo13707()) {
                    interfaceC25186.mo13721("Retrying (" + i + ") resolveDfs: " + interfaceC7874);
                }
                interfaceC25186.mo13721("Disconnecting tree on DFS retry");
                m50617();
                try {
                    Thread.sleep(f72643.nextInt(OpenAuthTask.Duplex) + 500);
                } catch (InterruptedException e2) {
                    interfaceC25186.mo13711("resolveDfs", e2);
                }
                m50616(c1337).close();
            }
        }
        return c1337;
    }

    /* JADX WARN: Code duplicated, block: B:136:0x01ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:? A[Catch: all -> 0x01f7, SYNTHETIC, TRY_LEAVE, TryCatch #4 {all -> 0x01f7, blocks: (B:3:0x0014, B:56:0x013d, B:75:0x016b, B:92:0x01b6, B:30:0x009e, B:101:0x01c9, B:128:0x01f6, B:127:0x01f3, B:123:0x01ed, B:4:0x0018, B:55:0x013a, B:74:0x0168, B:91:0x01b3, B:29:0x009b, B:100:0x01c6, B:119:0x01e8, B:118:0x01e5), top: B:144:0x0014, inners: #0, #5 }] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private InterfaceC6624 m50602(C1337 c1337, InterfaceC7874 interfaceC7874) throws C20728 {
        String strMo1460;
        InterfaceC23032 interfaceC23032 = this.f72646;
        C19457 c19457M50616 = m50616(c1337);
        try {
            C8794 c8794M44985 = c19457M50616.m44985();
            try {
                C14014 c14014M23613 = c8794M44985.m23613();
                try {
                    try {
                        C12744 c12744M50597 = m50597();
                        try {
                            c14014M23613.m34136();
                            String path = interfaceC7874 != null ? interfaceC7874.getPath() : c1337.m4914();
                            if (interfaceC7874 != null) {
                                strMo1460 = interfaceC7874.mo1460();
                            } else {
                                strMo1460 = "\\" + c1337.m4921() + '\\' + c1337.m4923() + c1337.m4914();
                            }
                            boolean zM31576 = c12744M50597.m31576();
                            InterfaceC25186 interfaceC25186 = f72645;
                            if (zM31576 || !c12744M50597.m31581()) {
                                if (!c12744M50597.m31576()) {
                                    interfaceC25186.mo13717("Not in DFS");
                                    c12744M50597.m31578();
                                    c14014M23613.m1095();
                                    c8794M44985.m23611();
                                    c19457M50616.close();
                                    return c1337;
                                }
                                InterfaceC4717 interfaceC4717M31574 = c12744M50597.m31574();
                                if (interfaceC4717M31574 != null) {
                                    if (interfaceC25186.mo13707()) {
                                        interfaceC25186.mo13721(String.format("Need to adjust request path %s (full: %s) -> %s", path, strMo1460, interfaceC4717M31574));
                                    }
                                    String strM4916 = c1337.m4916(interfaceC4717M31574, path);
                                    if (interfaceC7874 != null) {
                                        interfaceC7874.mo1463(strM4916);
                                    }
                                    c12744M50597.m31578();
                                    c14014M23613.m1095();
                                    c8794M44985.m23611();
                                    c19457M50616.close();
                                    return c1337;
                                }
                                interfaceC25186.mo13721("No tree referral but in DFS");
                            }
                            if (interfaceC7874 != null) {
                                interfaceC7874.mo1464(c8794M44985.m23608(), c8794M44985.m23614(), strMo1460);
                            }
                            InterfaceC4717 interfaceC4717M49037 = ((C21562) interfaceC23032.mo2876()).m49037(interfaceC23032, c1337.m4921(), c1337.m4923(), c1337.m4914());
                            if (interfaceC4717M49037 == null) {
                                if (!c12744M50597.m31576() || (interfaceC7874 instanceof C0242) || (interfaceC7874 instanceof C0988)) {
                                    interfaceC25186.mo13717("Not in DFS");
                                    c12744M50597.m31578();
                                    c14014M23613.m1095();
                                    c8794M44985.m23611();
                                    c19457M50616.close();
                                    return c1337;
                                }
                                if (interfaceC25186.mo13707()) {
                                    interfaceC25186.mo13721("No referral available for  " + strMo1460);
                                }
                                throw new C20048("No referral but in domain DFS " + strMo1460);
                            }
                            if (interfaceC25186.mo13707()) {
                                interfaceC25186.mo13721("Resolved " + strMo1460 + " -> " + interfaceC4717M49037);
                            }
                            String strM4917 = c1337.m4916(interfaceC4717M49037, path);
                            if (interfaceC7874 != null) {
                                interfaceC7874.mo1463(strM4917);
                            }
                            if (c12744M50597.m31573().equals(interfaceC4717M49037.mo14615())) {
                                c12744M50597.m31578();
                                c14014M23613.m1095();
                                c8794M44985.m23611();
                                c19457M50616.close();
                                return c1337;
                            }
                            InterfaceC4717 next = interfaceC4717M49037;
                            do {
                                if (interfaceC25186.mo13707()) {
                                    interfaceC25186.mo13721("Need to switch tree for " + next);
                                }
                                try {
                                    C19457 c19457M50608 = m50608(c1337, c8794M44985.m23614(), next);
                                    try {
                                        interfaceC25186.mo13721("Switched tree");
                                        c19457M50608.close();
                                        c12744M50597.m31578();
                                        c14014M23613.m1095();
                                        c8794M44985.m23611();
                                        c19457M50616.close();
                                        return c1337;
                                    } catch (Throwable th) {
                                        try {
                                            c19457M50608.close();
                                            throw th;
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                            throw th;
                                        }
                                    }
                                } catch (IOException e) {
                                    interfaceC25186.mo13711("Failed to connect tree", e);
                                    next = next.next();
                                }
                            } while (next != interfaceC4717M49037);
                            throw new C20048("All referral tree connections failed", e);
                        } catch (Throwable th3) {
                            if (c12744M50597 == null) {
                                throw th3;
                            }
                            try {
                                c12744M50597.m31578();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                            if (c8794M44985 != null) {
                                throw th;
                            }
                            try {
                                c8794M44985.m23611();
                                throw th;
                            } catch (Throwable th5) {
                                th.addSuppressed(th5);
                                throw th;
                            }
                        }
                    } catch (Throwable th6) {
                        c14014M23613.m1095();
                        throw th6;
                    }
                    c14014M23613.m1095();
                    throw th6;
                } catch (Throwable th7) {
                    th6.addSuppressed(th7);
                    throw th6;
                }
            } catch (Throwable th8) {
                if (c8794M44985 != null) {
                    throw th8;
                }
                c8794M44985.m23611();
                throw th8;
            }
        } catch (Throwable th9) {
            try {
                c19457M50616.close();
                throw th9;
            } catch (Throwable th10) {
                th9.addSuppressed(th10);
                throw th9;
            }
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long m50615() {
        C12744 c12744M50601 = m50601();
        if (c12744M50601 == null) {
            return -1L;
        }
        return c12744M50601.m31575();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C8794 m50618() {
        C12744 c12744M50601 = m50601();
        if (c12744M50601 != null) {
            return c12744M50601.m31579();
        }
        return null;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m50614() {
        C12744 c12744M50597 = m50597();
        try {
            int iM31572 = c12744M50597.m31572();
            c12744M50597.m31578();
            return iM31572;
        } catch (Throwable th) {
            if (c12744M50597 != null) {
                try {
                    c12744M50597.m31578();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m50610(C22441 c22441) {
        C12744 c12744M50597 = m50597();
        try {
            C12744 c12744M50598 = c22441.m50597();
            boolean z = c12744M50597 == c12744M50598;
            if (c12744M50598 != null) {
                c12744M50598.m31578();
            }
            if (c12744M50597 != null) {
                c12744M50597.m31578();
            }
            return z;
        } catch (Throwable th) {
            if (c12744M50597 != null) {
                try {
                    c12744M50597.m31578();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
