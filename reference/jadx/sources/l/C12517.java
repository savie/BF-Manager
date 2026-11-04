package l;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۨܿ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: R7TL */
/* JADX INFO: loaded from: classes4.dex */
public final class C12517 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C15723 f40182;

    public C12517(C20614 c20614) {
        this.f40182 = c20614.m22542();
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0087 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x007d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0036 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0036 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20722 m31073() throws C2079 {
        int iHashCode;
        C22852 c22852 = (C22852) this.f40182.m37624("exec");
        c22852.m51566();
        c22852.mo22538(0);
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(c22852.m22543()));
            C20722 c20722 = new C20722();
            c20722.f66405 = false;
            c20722.f66404 = new HashMap();
            c20722.f66403 = new HashMap();
            String str = "";
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    return c20722;
                }
                int iHashCode2 = line.hashCode();
                if (iHashCode2 != -1095948318) {
                    if (iHashCode2 != -696260880) {
                        if (iHashCode2 == -60387352 && line.equals("===USER_LIST===")) {
                            str = "USER_LIST";
                        } else {
                            iHashCode = str.hashCode();
                            if (iHashCode != -1139530606) {
                                if (iHashCode != 647389002) {
                                    if (iHashCode != 1796900478 && str.equals("GROUP_LIST")) {
                                        m31071(line, c20722);
                                    }
                                } else if (str.equals("SYSTEM_TYPE")) {
                                    c20722.f66405 = "Darwin".equals(line.trim());
                                }
                            } else if (str.equals("USER_LIST")) {
                                m31072(line, c20722);
                            }
                        }
                    } else if (line.equals("===SYSTEM_TYPE===")) {
                        str = "SYSTEM_TYPE";
                    } else {
                        iHashCode = str.hashCode();
                        if (iHashCode != -1139530606) {
                            if (iHashCode != 647389002) {
                                if (iHashCode != 1796900478) {
                                    m31071(line, c20722);
                                }
                            } else if (str.equals("SYSTEM_TYPE")) {
                                c20722.f66405 = "Darwin".equals(line.trim());
                            }
                        } else if (str.equals("USER_LIST")) {
                            m31072(line, c20722);
                        }
                    }
                } else if (line.equals("===GROUP_LIST===")) {
                    str = "GROUP_LIST";
                } else {
                    iHashCode = str.hashCode();
                    if (iHashCode != -1139530606) {
                        if (iHashCode != 647389002) {
                            if (iHashCode != 1796900478) {
                                m31071(line, c20722);
                            }
                        } else if (str.equals("SYSTEM_TYPE")) {
                            c20722.f66405 = "Darwin".equals(line.trim());
                        }
                    } else if (str.equals("USER_LIST")) {
                        m31072(line, c20722);
                    }
                }
            }
        } finally {
            c22852.m22548();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m31072(String str, C20722 c20722) {
        String strTrim = str.trim();
        if (strTrim.isEmpty() || strTrim.startsWith("#")) {
            return;
        }
        try {
            boolean z = c20722.f66405;
            HashMap map = c20722.f66404;
            if (z) {
                String[] strArrSplit = str.trim().split("\\s+");
                if (strArrSplit.length >= 2) {
                    map.put(strArrSplit[0], Integer.valueOf(Integer.parseInt(strArrSplit[1])));
                    return;
                }
                return;
            }
            String[] strArrSplit2 = str.split(":");
            if (strArrSplit2.length >= 3) {
                map.put(strArrSplit2[0], Integer.valueOf(Integer.parseInt(strArrSplit2[2])));
            }
        } catch (NumberFormatException unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31071(String str, C20722 c20722) {
        if (str.trim().isEmpty()) {
            return;
        }
        try {
            boolean z = c20722.f66405;
            HashMap map = c20722.f66403;
            if (z) {
                String[] strArrSplit = str.trim().split("\\s+");
                if (strArrSplit.length >= 2) {
                    map.put(strArrSplit[0], Integer.valueOf(Integer.parseInt(strArrSplit[1])));
                    return;
                }
                return;
            }
            String[] strArrSplit2 = str.split(":");
            if (strArrSplit2.length >= 3) {
                map.put(strArrSplit2[0], Integer.valueOf(Integer.parseInt(strArrSplit2[2])));
            }
        } catch (NumberFormatException unused) {
        }
    }
}
