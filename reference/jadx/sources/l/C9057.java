package l;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۡᩴ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R7TL */
/* JADX INFO: loaded from: classes3.dex */
public final class C9057 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C3073 f30906;

    public C9057(C4670 c4670) {
        this.f30906 = c4670.m20728();
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
    public final C19640 m23392() {
        int iHashCode;
        C15610 c15610 = (C15610) this.f30906.m9246("exec");
        c15610.m37279();
        c15610.mo19045(0);
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(c15610.m20743()));
            C19640 c19640 = new C19640();
            c19640.f63064 = false;
            c19640.f63063 = new HashMap();
            c19640.f63062 = new HashMap();
            String str = "";
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    return c19640;
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
                                        m23390(line, c19640);
                                    }
                                } else if (str.equals("SYSTEM_TYPE")) {
                                    c19640.f63064 = "Darwin".equals(line.trim());
                                }
                            } else if (str.equals("USER_LIST")) {
                                m23391(line, c19640);
                            }
                        }
                    } else if (line.equals("===SYSTEM_TYPE===")) {
                        str = "SYSTEM_TYPE";
                    } else {
                        iHashCode = str.hashCode();
                        if (iHashCode != -1139530606) {
                            if (iHashCode != 647389002) {
                                if (iHashCode != 1796900478) {
                                    m23390(line, c19640);
                                }
                            } else if (str.equals("SYSTEM_TYPE")) {
                                c19640.f63064 = "Darwin".equals(line.trim());
                            }
                        } else if (str.equals("USER_LIST")) {
                            m23391(line, c19640);
                        }
                    }
                } else if (line.equals("===GROUP_LIST===")) {
                    str = "GROUP_LIST";
                } else {
                    iHashCode = str.hashCode();
                    if (iHashCode != -1139530606) {
                        if (iHashCode != 647389002) {
                            if (iHashCode != 1796900478) {
                                m23390(line, c19640);
                            }
                        } else if (str.equals("SYSTEM_TYPE")) {
                            c19640.f63064 = "Darwin".equals(line.trim());
                        }
                    } else if (str.equals("USER_LIST")) {
                        m23391(line, c19640);
                    }
                }
            }
        } finally {
            c15610.m20737();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m23391(String str, C19640 c19640) {
        String strTrim = str.trim();
        if (strTrim.isEmpty() || strTrim.startsWith("#")) {
            return;
        }
        try {
            boolean z = c19640.f63064;
            HashMap map = c19640.f63063;
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
    public static void m23390(String str, C19640 c19640) {
        if (str.trim().isEmpty()) {
            return;
        }
        try {
            boolean z = c19640.f63064;
            HashMap map = c19640.f63062;
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
