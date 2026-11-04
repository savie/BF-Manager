package l;

/* JADX INFO: renamed from: l.᩸᩻᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 71Y3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23166 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22420 f75089;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC23517 f75090;

    /* JADX INFO: renamed from: ۙ */
    public abstract String mo7731();

    /* JADX INFO: renamed from: ۙ */
    public abstract boolean mo33725(InterfaceC4787 interfaceC4787);

    public AbstractC23166(C22420 c22420, InterfaceC23517 interfaceC23517) {
        this.f75089 = c22420;
        this.f75090 = interfaceC23517;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m52090(String str) {
        return !str.startsWith("L") ? str : str.substring(1, str.length() - 1).replace('/', '.');
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5122 m52088(C22420 c22420, InterfaceC4859 interfaceC4859) {
        InterfaceC10122 interfaceC10122 = (InterfaceC10122) c22420.f72611.get(interfaceC4859.mo6804());
        if (interfaceC10122 == null || !EnumC2536.PUBLIC.m8459(interfaceC10122.mo20404())) {
            return null;
        }
        for (InterfaceC8631 interfaceC8631 : interfaceC10122.getMethods()) {
            if (interfaceC8631.equals(interfaceC4859)) {
                if (EnumC2536.PUBLIC.m8459(interfaceC8631.mo13184())) {
                    return (C5122) interfaceC8631;
                }
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m52089(InterfaceC4859 interfaceC4859, InterfaceC4859 interfaceC48510) {
        return interfaceC4859.mo6802().equals(interfaceC48510.mo6802()) && C22298.m50356(interfaceC4859.mo6805(), interfaceC48510.mo6805());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4245 m52087(String str) {
        if (str.indexOf(42) == -1) {
            return C18415.m42924(16, str).matcher((CharSequence) "");
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
        return C18415.m42925(sb.toString()).matcher((CharSequence) "");
    }
}
