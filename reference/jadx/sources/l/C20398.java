package l;

/* JADX INFO: renamed from: l.᩵ۜܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: U9Q8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20398 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m46798(InterfaceC3244 interfaceC3244) {
        StringBuilder sb = new StringBuilder(interfaceC3244.size());
        for (int i = 0; i < interfaceC3244.size(); i++) {
            byte bMo10604 = interfaceC3244.mo10604(i);
            if (bMo10604 == 34) {
                sb.append("\\\"");
            } else if (bMo10604 == 39) {
                sb.append("\\'");
            } else if (bMo10604 != 92) {
                switch (bMo10604) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bMo10604 >= 32 && bMo10604 <= 126) {
                            sb.append((char) bMo10604);
                        } else {
                            sb.append('\\');
                            sb.append((char) (((bMo10604 >>> 6) & 3) + 48));
                            sb.append((char) (((bMo10604 >>> 3) & 7) + 48));
                            sb.append((char) ((bMo10604 & 7) + 48));
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m46799(AbstractC17084 abstractC17084) {
        return m46798(new C15922(abstractC17084));
    }
}
