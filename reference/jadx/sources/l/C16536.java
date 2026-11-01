package l;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ܽۡ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A9ZK */
/* JADX INFO: loaded from: classes4.dex */
public final class C16536 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC4314 f53120 = C13488.m32997(C16536.class);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15310 m38913(InterfaceC19067 interfaceC19067, InterfaceC24006 interfaceC24006, InterfaceC18361 interfaceC18361, String str) throws C6842 {
        C2464 c2464 = (C2464) interfaceC24006;
        String strM7556 = c2464.m7556();
        int iM7565 = c2464.m7565();
        if (iM7565 != 445) {
            strM7556 = strM7556 + ":" + iM7565;
        }
        String strM50267 = C22697.m50267(C12278.m30515("ncacn_np:", strM7556, "[endpoint=", str, ",address="), interfaceC18361.mo36917(), "]");
        int i = C15310.f49880;
        if (strM50267.startsWith("ncacn_np:")) {
            return new C15310(strM50267, interfaceC19067);
        }
        throw new C6842("DCERPC transport not supported: ".concat(strM50267));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC22180[] m38914(InterfaceC19067 interfaceC19067, InterfaceC24006 interfaceC24006, InterfaceC18361 interfaceC18361) throws C6842 {
        C15310 c15310M38913 = m38913(interfaceC19067, interfaceC24006, interfaceC18361, "\\PIPE\\netdfs");
        try {
            C18131 c18131 = new C18131(((C2464) interfaceC24006).m7556());
            c15310M38913.m36667(c18131);
            if (c18131.f57974 == 0) {
                C8960 c8960 = (C8960) c18131.f57977.f35541;
                C11886[] c11886Arr = new C11886[c8960.f30697];
                for (int i = 0; i < c8960.f30697; i++) {
                    c11886Arr[i] = new C11886(c8960.f30698[i].f68287);
                }
                c15310M38913.close();
                return c11886Arr;
            }
            throw new C12303(c18131.f57974, true);
        } catch (Throwable th) {
            try {
                c15310M38913.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static InterfaceC22180[] m38915(InterfaceC19067 interfaceC19067, InterfaceC24006 interfaceC24006, InterfaceC18361 interfaceC18361) throws C6842 {
        C15310 c15310M38913 = m38913(interfaceC19067, interfaceC24006, interfaceC18361, "\\PIPE\\srvsvc");
        try {
            C8254 c8254 = new C8254(((C2464) interfaceC24006).m7556());
            c15310M38913.m36667(c8254);
            if (c8254.f51839 != 0) {
                throw new C12303(c8254.f51839, true);
            }
            InterfaceC22180[] interfaceC22180ArrM21645 = c8254.m21645();
            c15310M38913.close();
            return interfaceC22180ArrM21645;
        } catch (Throwable th) {
            try {
                c15310M38913.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC9190 m38912(C17241 c17241) throws C8484 {
        InterfaceC22180[] interfaceC22180ArrM15240;
        C2464 c2464 = c17241.f54929;
        boolean zIsEmpty = c2464.m7563().getHost().isEmpty();
        InterfaceC4314 interfaceC4314 = f53120;
        if (zIsEmpty) {
            try {
                String strMo36917 = c2464.m7559().mo36917();
                if (strMo36917 != null) {
                    try {
                        if (strMo36917.length() != 0) {
                            C17241 c17242 = new C17241(c17241, strMo36917);
                            try {
                                C17987 c17987M40191 = c17242.m40191();
                                try {
                                    if (!c17987M40191.m41875()) {
                                        C6657 c6657 = new C6657(c17241, new C3834(c17241, c17987M40191));
                                        c17987M40191.close();
                                        c17242.close();
                                        return c6657;
                                    }
                                    throw new C19399();
                                } catch (Throwable th) {
                                    if (c17987M40191 != null) {
                                        try {
                                            c17987M40191.close();
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                try {
                                    c17242.close();
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                }
                                throw th3;
                            }
                        }
                    } catch (MalformedURLException | UnknownHostException e) {
                        throw new C12303("Failed to resolve child element", e);
                    }
                }
                throw new C12303("Name must not be empty");
            } catch (C8484 e2) {
                if (e2.getCause() instanceof UnknownHostException) {
                    interfaceC4314.mo12120("Failed to find master browser", (Exception) e2);
                    throw new C19399();
                }
                throw e2;
            }
        }
        if (c2464.m7566() == 2) {
            C17987 c17987M40192 = c17241.m40191();
            try {
                if (!c17987M40192.m41875()) {
                    C6657 c6658 = new C6657(c17241, new C3834(c17241, c17987M40192));
                    c17987M40192.close();
                    return c6658;
                }
                throw new C19399();
            } catch (Throwable th5) {
                if (c17987M40192 != null) {
                    try {
                        c17987M40192.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                }
                throw th5;
            }
        }
        if (c2464.m7570() == null && c2464.m7557().length() <= 1) {
            C2464 c2464Clone = c2464.clone();
            InterfaceC19067 context = c17241.getContext();
            URL urlM7563 = c2464Clone.m7563();
            if (urlM7563.getPath().lastIndexOf(47) != urlM7563.getPath().length() - 1) {
                throw new C12303(urlM7563.toString() + " directory must end with '/'");
            }
            if (c2464Clone.m7566() != 4) {
                throw new C12303("The requested list operations is invalid: " + urlM7563.toString());
            }
            HashSet hashSet = new HashSet();
            if (((C9790) context.mo29447()).m24901(c2464Clone.m7556(), context)) {
                try {
                    for (InterfaceC22180 interfaceC22180 : m38914(context, c2464Clone, c2464Clone.m7559())) {
                        if (!hashSet.contains(interfaceC22180)) {
                            hashSet.add(interfaceC22180);
                        }
                    }
                } catch (IOException e3) {
                    interfaceC4314.mo12120("DS enumeration failed", (Exception) e3);
                }
            }
            int i = C21515.f69901;
            context.mo29449().getClass();
            try {
                C17987 c17987M48216 = new C21515(context).m48216(c2464Clone, c2464Clone.m7562());
                try {
                    C1053 c1053M41877 = c17987M48216.m41877();
                    try {
                        C3875 c3875M3985 = c1053M41877.m3985();
                        try {
                            try {
                                interfaceC22180ArrM15240 = m38915(context, c2464Clone, c3875M3985.m11247());
                            } catch (IOException e4) {
                                if (c17987M48216.m41875()) {
                                    throw e4;
                                }
                                interfaceC4314.mo12120("doMsrpcShareEnum failed", (Exception) e4);
                                C4829 c4829 = new C4829(c17987M48216.m41882());
                                C14003 c14003 = new C14003(c17987M48216.m41882());
                                c17987M48216.m41868(c4829, c14003, new EnumC19358[0]);
                                if (c14003.m15238() != 0) {
                                    throw new C12303(c14003.m15238(), true);
                                }
                                interfaceC22180ArrM15240 = c14003.m15240();
                            }
                            for (InterfaceC22180 interfaceC22181 : interfaceC22180ArrM15240) {
                                if (!hashSet.contains(interfaceC22181)) {
                                    hashSet.add(interfaceC22181);
                                }
                            }
                            c3875M3985.m9589();
                            c1053M41877.m3984();
                            c17987M48216.close();
                            return new C15831(c17241, hashSet.iterator());
                        } catch (Throwable th7) {
                            try {
                                c3875M3985.m9589();
                            } catch (Throwable th8) {
                                th7.addSuppressed(th8);
                            }
                            throw th7;
                        }
                    } catch (Throwable th9) {
                        if (c1053M41877 != null) {
                            try {
                                c1053M41877.m3984();
                            } catch (Throwable th10) {
                                th9.addSuppressed(th10);
                            }
                        }
                        throw th9;
                    }
                } catch (Throwable th11) {
                    try {
                        c17987M48216.close();
                    } catch (Throwable th12) {
                        th11.addSuppressed(th12);
                    }
                    throw th11;
                }
            } catch (C12303 e5) {
                throw e5;
            } catch (IOException e6) {
                interfaceC4314.mo12120("doNetShareEnum failed", (Exception) e6);
                throw new C12303(urlM7563.toString(), e6);
            }
        }
        C17987 c17987M40193 = c17241.m40191();
        try {
            if (c17987M40193.m41875()) {
                C4540 c4540 = new C4540(c17241, new C11597(c17241, c17987M40193));
                c17987M40193.close();
                return c4540;
            }
            C4540 c4541 = new C4540(c17241, new C13714(c17241, c17987M40193));
            c17987M40193.close();
            return c4541;
        } catch (Throwable th13) {
            if (c17987M40193 != null) {
                try {
                    c17987M40193.close();
                } catch (Throwable th14) {
                    th13.addSuppressed(th14);
                }
            }
            throw th13;
        }
    }
}
