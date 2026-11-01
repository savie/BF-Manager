package l;

/* JADX INFO: renamed from: l.֨᩺ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 71Y3 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1421 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5655 f5864;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8706 f5865;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract String mo4983();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract boolean mo4984(InterfaceC3183 interfaceC3183);

    public AbstractC1421(C5655 c5655, InterfaceC8706 interfaceC8706) {
        this.f5864 = c5655;
        this.f5865 = interfaceC8706;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m4982(String str) {
        return !str.startsWith("L") ? str : str.substring(1, str.length() - 1).replace('/', '.');
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10124 m4980(C5655 c5655, InterfaceC8858 interfaceC8858) {
        InterfaceC22762 interfaceC22762 = (InterfaceC22762) c5655.f19322.get(interfaceC8858.mo9700());
        if (interfaceC22762 == null || !EnumC15236.PUBLIC.m36501(interfaceC22762.mo20491())) {
            return null;
        }
        for (InterfaceC18528 interfaceC18528 : interfaceC22762.getMethods()) {
            if (interfaceC18528.equals(interfaceC8858)) {
                if (EnumC15236.PUBLIC.m36501(interfaceC18528.mo25750())) {
                    return (C10124) interfaceC18528;
                }
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m4981(InterfaceC8858 interfaceC8858, InterfaceC8858 interfaceC8859) {
        return interfaceC8858.mo9698().equals(interfaceC8859.mo9698()) && C10166.m25904(interfaceC8858.mo9699(), interfaceC8859.mo9699());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6222 m4979(String str) {
        if (str.indexOf(42) == -1) {
            return C14690.m35218(16, str).matcher((CharSequence) "");
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '*') {
                sb.append(".+");
            } else if (".^$[]*+?|(){}\\".indexOf(cCharAt) != -1) {
                sb.append('\\');
                sb.append(cCharAt);
            } else {
                sb.append(cCharAt);
            }
        }
        return C14690.m35219(sb.toString()).matcher((CharSequence) "");
    }
}
