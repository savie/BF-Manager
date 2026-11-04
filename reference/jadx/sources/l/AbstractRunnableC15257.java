package l;

import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܳۢۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 94WG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractRunnableC15257 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static C3588[] f49893 = {new C3588("SYST", RunnableC14028.class), new C3588("USER", RunnableC21971.class), new C3588("PASS", RunnableC24472.class), new C3588("TYPE", RunnableC4817.class), new C3588("CWD", RunnableC15520.class), new C3588("PWD", RunnableC21488.class), new C3588("LIST", RunnableC11791.class), new C3588("PASV", RunnableC4334.class), new C3588("RETR", RunnableC19250.class), new C3588("NLST", RunnableC20742.class), new C3588("NOOP", RunnableC12537.class), new C3588("STOR", RunnableC7317.class), new C3588("DELE", RunnableC13283.class), new C3588("RNFR", RunnableC1351.class), new C3588("RNTO", RunnableC9553.class), new C3588("RMD", RunnableC10299.class), new C3588("MKD", RunnableC17758.class), new C3588("OPTS", RunnableC6572.class), new C3588("PORT", RunnableC14774.class), new C3588("QUIT", RunnableC18504.class), new C3588("FEAT", RunnableC5826.class), new C3588("SIZE", C8808.class), new C3588("CDUP", RunnableC19996.class), new C3588("APPE", RunnableC5080.class), new C3588("XCUP", RunnableC19996.class), new C3588("XPWD", RunnableC21488.class), new C3588("XMKD", RunnableC17758.class), new C3588("XRMD", RunnableC10299.class), new C3588("MDTM", RunnableC25218.class), new C3588("MFMT", RunnableC17012.class), new C3588("REST", RunnableC8063.class), new C3588("SITE", RunnableC2842.class), new C3588("MLST", RunnableC23726.class), new C3588("MLSD", RunnableC16266.class), new C3588("HASH", RunnableC2097.class), new C3588("RANG", RunnableC0605.class)};

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C5563 f49894;

    public AbstractRunnableC15257(C5563 c5563) {
        this.f49894 = c5563;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36604(C5563 c5563, String str) {
        String[] strArrSplit = str.split(" ");
        if (strArrSplit.length < 1) {
            c5563.m16486("502 Command not recognized\r\n");
            return;
        }
        String str2 = strArrSplit[0];
        if (str2.length() < 1) {
            c5563.m16486("502 Command not recognized\r\n");
            return;
        }
        String upperCase = str2.trim().toUpperCase();
        AbstractRunnableC15257 abstractRunnableC15257 = null;
        for (int i = 0; i < 36; i++) {
            C3588 c3588 = f49893[i];
            if (c3588.f12285.equals(upperCase)) {
                try {
                    try {
                        abstractRunnableC15257 = (AbstractRunnableC15257) c3588.f12284.getConstructor(C5563.class, String.class).newInstance(c5563, str);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                } catch (NoSuchMethodException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
        if (abstractRunnableC15257 == null) {
            c5563.m16486("502 Command not recognized\r\n");
            return;
        }
        if (c5563.m16492()) {
            abstractRunnableC15257.run();
            return;
        }
        if (c5563.m16500()) {
            abstractRunnableC15257.run();
        } else if (abstractRunnableC15257.getClass().equals(RunnableC21971.class) || abstractRunnableC15257.getClass().equals(RunnableC24472.class) || abstractRunnableC15257.getClass().equals(RunnableC18504.class)) {
            abstractRunnableC15257.run();
        } else {
            c5563.m16486("530 Login first with USER and PASS, or QUIT\r\n");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m36601(String str) {
        int iIndexOf;
        return (str == null || (iIndexOf = str.indexOf(32)) == -1) ? "" : str.substring(iIndexOf + 1).replaceAll("\\s+$", "");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static AbstractC22044 m36607(C5563 c5563, String str) {
        String strM36603;
        AbstractC22044 abstractC22044M16488 = c5563.m16488();
        AbstractC22044 abstractC22044M16487 = c5563.m16487();
        if (str == null) {
            str = "";
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        if (str.startsWith("/") || ((strM36603 = m36603(abstractC22044M16488, abstractC22044M16487)) != null && m36605(arrayDeque, strM36603))) {
            if (m36605(arrayDeque, str)) {
                return arrayDeque.isEmpty() ? abstractC22044M16488 : abstractC22044M16488.m49876(m36602(arrayDeque));
            }
            AbstractC22044 abstractC22044M49858 = abstractC22044M16488.m49858();
            return abstractC22044M49858 != null ? abstractC22044M49858 : abstractC22044M16488;
        }
        AbstractC22044 abstractC22044M49859 = abstractC22044M16488.m49858();
        return abstractC22044M49859 != null ? abstractC22044M49859 : abstractC22044M16488;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m36609(AbstractC22044 abstractC22044) {
        return !(m36603(this.f49894.m16488(), abstractC22044) != null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m36605(ArrayDeque arrayDeque, String str) {
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
    public static String m36603(AbstractC22044 abstractC22044, AbstractC22044 abstractC22045) {
        String strM36606 = m36606(abstractC22044.mo4278());
        String strM36607 = m36606(abstractC22045.mo4278());
        if (strM36606.equalsIgnoreCase(strM36607)) {
            return "";
        }
        if (!strM36606.endsWith("/")) {
            strM36606 = strM36606.concat("/");
        }
        if (strM36607.regionMatches(true, 0, strM36606, 0, strM36606.length())) {
            return strM36607.substring(strM36606.length());
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m36606(String str) {
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
        String strM36602 = m36602(arrayDeque);
        if (zStartsWith) {
            return strM36602.isEmpty() ? "/" : "/".concat(strM36602);
        }
        return strM36602;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m36608(AbstractC22044 abstractC22044, AbstractC22044 abstractC22045) {
        return m36606(abstractC22044.mo4278()).equalsIgnoreCase(m36606(abstractC22045.mo4278()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m36602(ArrayDeque arrayDeque) {
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
