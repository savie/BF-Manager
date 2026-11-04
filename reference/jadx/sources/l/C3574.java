package l;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ۗܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A9ZK */
/* JADX INFO: loaded from: classes2.dex */
public final class C3574 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f12237 = C16980.m40037(C3574.class);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4891 m11623(InterfaceC23032 interfaceC23032, InterfaceC6624 interfaceC6624, InterfaceC11097 interfaceC11097, String str) throws C7369 {
        C1337 c1337 = (C1337) interfaceC6624;
        String strM4921 = c1337.m4921();
        int iM4928 = c1337.m4928();
        if (iM4928 != 445) {
            strM4921 = strM4921 + ":" + iM4928;
        }
        String strM23910 = C8947.m23910(C3188.m10406("ncacn_np:", strM4921, "[endpoint=", str, ",address="), interfaceC11097.mo28041(), "]");
        int i = C4891.f17088;
        if (strM23910.startsWith("ncacn_np:")) {
            return new C4891(strM23910, interfaceC23032);
        }
        throw new C7369("DCERPC transport not supported: ".concat(strM23910));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC9627[] m11625(InterfaceC23032 interfaceC23032, InterfaceC6624 interfaceC6624, InterfaceC11097 interfaceC11097) throws C7369 {
        C4891 c4891M11623 = m11623(interfaceC23032, interfaceC6624, interfaceC11097, "\\PIPE\\netdfs");
        try {
            C10856 c10856 = new C10856(((C1337) interfaceC6624).m4921());
            c4891M11623.m15015(c10856);
            if (c10856.f34393 == 0) {
                C13094 c13094 = (C13094) c10856.f34390.f19493;
                C19412[] c19412Arr = new C19412[c13094.f41839];
                for (int i = 0; i < c13094.f41839; i++) {
                    c19412Arr[i] = new C19412(c13094.f41840[i].f36429);
                }
                c4891M11623.close();
                return c19412Arr;
            }
            throw new C20728(c10856.f34393, true);
        } catch (Throwable th) {
            try {
                c4891M11623.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static InterfaceC9627[] m11626(InterfaceC23032 interfaceC23032, InterfaceC6624 interfaceC6624, InterfaceC11097 interfaceC11097) throws C7369 {
        C4891 c4891M11623 = m11623(interfaceC23032, interfaceC6624, interfaceC11097, "\\PIPE\\srvsvc");
        try {
            C19807 c19807 = new C19807(((C1337) interfaceC6624).m4921());
            c4891M11623.m15015(c19807);
            if (c19807.f80988 != 0) {
                throw new C20728(c19807.f80988, true);
            }
            InterfaceC9627[] interfaceC9627ArrM45580 = c19807.m45580();
            c4891M11623.close();
            return interfaceC9627ArrM45580;
        } catch (Throwable th) {
            try {
                c4891M11623.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC13335 m11624(C12523 c12523) throws C20048 {
        InterfaceC9627[] interfaceC9627ArrM5377;
        C1337 c1337 = c12523.f40200;
        boolean zIsEmpty = c1337.m4922().getHost().isEmpty();
        InterfaceC25186 interfaceC25186 = f12237;
        if (zIsEmpty) {
            try {
                String strMo28041 = c1337.m4917().mo28041();
                if (strMo28041 != null) {
                    try {
                        if (strMo28041.length() != 0) {
                            C12523 c12524 = new C12523(c12523, strMo28041);
                            try {
                                C19457 c19457M31099 = c12524.m31099();
                                try {
                                    if (!c19457M31099.m44978()) {
                                        C14102 c14102 = new C14102(c12523, new C7391(c12523, c19457M31099));
                                        c19457M31099.close();
                                        c12524.close();
                                        return c14102;
                                    }
                                    throw new C5287();
                                } catch (Throwable th) {
                                    if (c19457M31099 != null) {
                                        try {
                                            c19457M31099.close();
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                try {
                                    c12524.close();
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                }
                                throw th3;
                            }
                        }
                    } catch (MalformedURLException | UnknownHostException e) {
                        throw new C20728("Failed to resolve child element", e);
                    }
                }
                throw new C20728("Name must not be empty");
            } catch (C20048 e2) {
                if (e2.getCause() instanceof UnknownHostException) {
                    interfaceC25186.mo13711("Failed to find master browser", e2);
                    throw new C5287();
                }
                throw e2;
            }
        }
        if (c1337.m4920() == 2) {
            C19457 c19457M310910 = c12523.m31099();
            try {
                if (!c19457M310910.m44978()) {
                    C14102 c14103 = new C14102(c12523, new C7391(c12523, c19457M310910));
                    c19457M310910.close();
                    return c14103;
                }
                throw new C5287();
            } catch (Throwable th5) {
                if (c19457M310910 != null) {
                    try {
                        c19457M310910.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                }
                throw th5;
            }
        }
        if (c1337.m4923() == null && c1337.m4914().length() <= 1) {
            C1337 c1337Clone = c1337.clone();
            InterfaceC23032 context = c12523.getContext();
            URL urlM4922 = c1337Clone.m4922();
            if (urlM4922.getPath().lastIndexOf(47) != urlM4922.getPath().length() - 1) {
                throw new C20728(urlM4922.toString() + " directory must end with '/'");
            }
            if (c1337Clone.m4920() != 4) {
                throw new C20728("The requested list operations is invalid: " + urlM4922.toString());
            }
            HashSet hashSet = new HashSet();
            if (((C21562) context.mo2876()).m49039(c1337Clone.m4921(), context)) {
                try {
                    for (InterfaceC9627 interfaceC9627 : m11625(context, c1337Clone, c1337Clone.m4917())) {
                        if (!hashSet.contains(interfaceC9627)) {
                            hashSet.add(interfaceC9627);
                        }
                    }
                } catch (IOException e3) {
                    interfaceC25186.mo13711("DS enumeration failed", e3);
                }
            }
            int i = C22441.f72644;
            context.mo2875().getClass();
            try {
                C19457 c19457M50607 = new C22441(context).m50607(c1337Clone, c1337Clone.m4927());
                try {
                    C8794 c8794M44985 = c19457M50607.m44985();
                    try {
                        C14014 c14014M23613 = c8794M44985.m23613();
                        try {
                            try {
                                interfaceC9627ArrM5377 = m11626(context, c1337Clone, c14014M23613.m34116());
                            } catch (IOException e4) {
                                if (c19457M50607.m44978()) {
                                    throw e4;
                                }
                                interfaceC25186.mo13711("doMsrpcShareEnum failed", e4);
                                C0767 c0767 = new C0767(c19457M50607.m44979());
                                C8225 c8225 = new C8225(c19457M50607.m44979());
                                c19457M50607.m44971(c0767, c8225, new EnumC13269[0]);
                                if (c8225.m5375() != 0) {
                                    throw new C20728(c8225.m5375(), true);
                                }
                                interfaceC9627ArrM5377 = c8225.m5377();
                            }
                            for (InterfaceC9627 interfaceC9628 : interfaceC9627ArrM5377) {
                                if (!hashSet.contains(interfaceC9628)) {
                                    hashSet.add(interfaceC9628);
                                }
                            }
                            c14014M23613.m1095();
                            c8794M44985.m23611();
                            c19457M50607.close();
                            return new C17744(c12523, hashSet.iterator());
                        } catch (Throwable th7) {
                            try {
                                c14014M23613.m1095();
                            } catch (Throwable th8) {
                                th7.addSuppressed(th8);
                            }
                            throw th7;
                        }
                    } catch (Throwable th9) {
                        if (c8794M44985 != null) {
                            try {
                                c8794M44985.m23611();
                            } catch (Throwable th10) {
                                th9.addSuppressed(th10);
                            }
                        }
                        throw th9;
                    }
                } catch (Throwable th11) {
                    try {
                        c19457M50607.close();
                    } catch (Throwable th12) {
                        th11.addSuppressed(th12);
                    }
                    throw th11;
                }
            } catch (C20728 e5) {
                throw e5;
            } catch (IOException e6) {
                interfaceC25186.mo13711("doNetShareEnum failed", e6);
                throw new C20728(urlM4922.toString(), e6);
            }
        }
        C19457 c19457M310911 = c12523.m31099();
        try {
            if (c19457M310911.m44978()) {
                C0679 c0679 = new C0679(c12523, new C19324(c12523, c19457M310911));
                c19457M310911.close();
                return c0679;
            }
            C0679 c06710 = new C0679(c12523, new C8137(c12523, c19457M310911));
            c19457M310911.close();
            return c06710;
        } catch (Throwable th13) {
            if (c19457M310911 != null) {
                try {
                    c19457M310911.close();
                } catch (Throwable th14) {
                    th13.addSuppressed(th14);
                }
            }
            throw th13;
        }
    }
}
