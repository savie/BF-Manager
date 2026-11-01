package l;

import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܺᩳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 94WG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractRunnableC16096 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static C2088[] f52045 = {new C2088("SYST", RunnableC8335.class), new C2088("USER", RunnableC9041.class), new C2088("PASS", RunnableC13980.class), new C2088("TYPE", RunnableC19624.class), new C2088("CWD", RunnableC16201.class), new C2088("PWD", RunnableC5512.class), new C2088("LIST", RunnableC12673.class), new C2088("PASV", RunnableC11863.class), new C2088("RETR", RunnableC4100.class), new C2088("NLST", RunnableC9851.class), new C2088("NOOP", RunnableC3499.class), new C2088("STOR", RunnableC18918.class), new C2088("DELE", RunnableC20434.class), new C2088("RNFR", RunnableC23152.class), new C2088("RNTO", RunnableC15391.class), new C2088("RMD", RunnableC6923.class), new C2088("MKD", RunnableC11262.class), new C2088("OPTS", RunnableC4806.class), new C2088("PORT", RunnableC2689.class), new C2088("QUIT", RunnableC22446.class), new C2088("FEAT", RunnableC0677.class), new C2088("SIZE", C18212.class), new C2088("CDUP", RunnableC21139.class), new C2088("APPE", RunnableC9146.class), new C2088("XCUP", RunnableC21139.class), new C2088("XPWD", RunnableC5512.class), new C2088("XMKD", RunnableC11262.class), new C2088("XRMD", RunnableC6923.class), new C2088("MDTM", RunnableC17611.class), new C2088("MFMT", RunnableC6322.class), new C2088("REST", RunnableC13274.class), new C2088("SITE", RunnableC21740.class), new C2088("MLST", RunnableC14790.class), new C2088("MLSD", RunnableC23962.class), new C2088("HASH", RunnableC16906.class), new C2088("RANG", RunnableC1278.class)};

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C0572 f52046;

    public AbstractRunnableC16096(C0572 c0572) {
        this.f52046 = c0572;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38123(C0572 c0572, String str) {
        String[] strArrSplit = str.split(" ");
        if (strArrSplit.length < 1) {
            c0572.m2708("502 Command not recognized\r\n");
            return;
        }
        String str2 = strArrSplit[0];
        if (str2.length() < 1) {
            c0572.m2708("502 Command not recognized\r\n");
            return;
        }
        String upperCase = str2.trim().toUpperCase();
        AbstractRunnableC16096 abstractRunnableC16096 = null;
        for (int i = 0; i < 36; i++) {
            C2088 c2088 = f52045[i];
            if (c2088.f7719.equals(upperCase)) {
                try {
                    try {
                        abstractRunnableC16096 = (AbstractRunnableC16096) c2088.f7718.getConstructor(C0572.class, String.class).newInstance(c0572, str);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                } catch (NoSuchMethodException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
        if (abstractRunnableC16096 == null) {
            c0572.m2708("502 Command not recognized\r\n");
            return;
        }
        if (c0572.m2717()) {
            abstractRunnableC16096.run();
            return;
        }
        if (c0572.m2719()) {
            abstractRunnableC16096.run();
        } else if (abstractRunnableC16096.getClass().equals(RunnableC9041.class) || abstractRunnableC16096.getClass().equals(RunnableC13980.class) || abstractRunnableC16096.getClass().equals(RunnableC22446.class)) {
            abstractRunnableC16096.run();
        } else {
            c0572.m2708("530 Login first with USER and PASS, or QUIT\r\n");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m38120(String str) {
        int iIndexOf;
        return (str == null || (iIndexOf = str.indexOf(32)) == -1) ? "" : str.substring(iIndexOf + 1).replaceAll("\\s+$", "");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static AbstractC20745 m38126(C0572 c0572, String str) {
        String strM38122;
        AbstractC20745 abstractC20745M2694 = c0572.m2694();
        AbstractC20745 abstractC20745M2706 = c0572.m2706();
        if (str == null) {
            str = "";
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        if (str.startsWith("/") || ((strM38122 = m38122(abstractC20745M2694, abstractC20745M2706)) != null && m38124(arrayDeque, strM38122))) {
            if (m38124(arrayDeque, str)) {
                return arrayDeque.isEmpty() ? abstractC20745M2694 : abstractC20745M2694.m46690(m38121(arrayDeque));
            }
            AbstractC20745 abstractC20745M46689 = abstractC20745M2694.m46689();
            return abstractC20745M46689 != null ? abstractC20745M46689 : abstractC20745M2694;
        }
        AbstractC20745 abstractC20745M466810 = abstractC20745M2694.m46689();
        return abstractC20745M466810 != null ? abstractC20745M466810 : abstractC20745M2694;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m38128(AbstractC20745 abstractC20745) {
        return !(m38122(this.f52046.m2694(), abstractC20745) != null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m38124(ArrayDeque arrayDeque, String str) {
        if (str.isEmpty()) {
            return true;
        }
        for (String str2 : str.split("/")) {
            if (!str2.isEmpty() && !str2.equals(".")) {
                if (str2.equals("..")) {
                    if (arrayDeque.isEmpty()) {
                        return false;
                    }
                    arrayDeque.removeLast();
                } else {
                    arrayDeque.addLast(str2);
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m38122(AbstractC20745 abstractC20745, AbstractC20745 abstractC20746) {
        String strM38125 = m38125(abstractC20745.mo24643());
        String strM38126 = m38125(abstractC20746.mo24643());
        if (strM38125.equalsIgnoreCase(strM38126)) {
            return "";
        }
        if (!strM38125.endsWith("/")) {
            strM38125 = strM38125.concat("/");
        }
        if (strM38126.regionMatches(true, 0, strM38125, 0, strM38125.length())) {
            return strM38126.substring(strM38125.length());
        }
        return null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m38125(String str) {
        boolean zStartsWith = str.startsWith("/");
        ArrayDeque arrayDeque = new ArrayDeque();
        for (String str2 : str.split("/")) {
            if (!str2.isEmpty() && !str2.equals(".")) {
                if (str2.equals("..")) {
                    if (!arrayDeque.isEmpty()) {
                        arrayDeque.removeLast();
                    } else if (!zStartsWith) {
                        arrayDeque.addLast(str2);
                    }
                } else {
                    arrayDeque.addLast(str2);
                }
            }
        }
        String strM38121 = m38121(arrayDeque);
        if (zStartsWith) {
            return strM38121.isEmpty() ? "/" : "/".concat(strM38121);
        }
        return strM38121;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m38127(AbstractC20745 abstractC20745, AbstractC20745 abstractC20746) {
        return m38125(abstractC20745.mo24643()).equalsIgnoreCase(m38125(abstractC20746.mo24643()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m38121(ArrayDeque arrayDeque) {
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            if (sb.length() > 0) {
                sb.append('/');
            }
            sb.append((String) it.next());
        }
        return sb.toString();
    }
}
