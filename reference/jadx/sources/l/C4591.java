package l;

/* JADX INFO: renamed from: l.ۙۤ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: U9Q8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4591 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m12738(InterfaceC3139 interfaceC3139) {
        StringBuilder sb = new StringBuilder(interfaceC3139.size());
        for (int i = 0; i < interfaceC3139.size(); i++) {
            byte bMo5741 = interfaceC3139.mo5741(i);
            if (bMo5741 == 34) {
                sb.append("\\\"");
            } else if (bMo5741 == 39) {
                sb.append("\\'");
            } else if (bMo5741 != 92) {
                switch (bMo5741) {
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
                        if (bMo5741 >= 32 && bMo5741 <= 126) {
                            sb.append((char) bMo5741);
                        } else {
                            sb.append('\\');
                            sb.append((char) (((bMo5741 >>> 6) & 3) + 48));
                            sb.append((char) (((bMo5741 >>> 3) & 7) + 48));
                            sb.append((char) ((bMo5741 & 7) + 48));
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
    public static String m12739(AbstractC23725 abstractC23725) {
        return m12738(new C1728(abstractC23725));
    }
}
