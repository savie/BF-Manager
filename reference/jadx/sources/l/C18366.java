package l;

/* JADX INFO: renamed from: l.ܿܰۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: E5S4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18366 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m42831(int i, int i2) {
        return (i & i2) != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m42830(int i, EnumC0467 enumC0467) {
        StringBuilder sb = new StringBuilder();
        if (m42831(i, 1)) {
            sb.append("public ");
        }
        if (m42831(i, 2)) {
            sb.append("private ");
        }
        if (m42831(i, 4)) {
            sb.append("protected ");
        }
        if (m42831(i, 8)) {
            sb.append("static ");
        }
        if (m42831(i, 16)) {
            sb.append("final ");
        }
        if (m42831(i, 1024)) {
            sb.append("abstract ");
        }
        if (m42831(i, 256)) {
            sb.append("native ");
        }
        int i2 = C21350.f68004[enumC0467.ordinal()];
        if (i2 == 1) {
            if (m42831(i, 32)) {
                sb.append("synchronized ");
            }
            if (m42831(i, 64)) {
                sb.append("bridge ");
            }
            if (m42831(i, 128)) {
                sb.append("varargs ");
            }
        } else if (i2 == 2) {
            if (m42831(i, 64)) {
                sb.append("volatile ");
            }
            if (m42831(i, 128)) {
                sb.append("transient ");
            }
        } else if (i2 == 3) {
            if (m42831(i, 32768)) {
                sb.append("module ");
            }
            if (m42831(i, 2048)) {
                sb.append("strict ");
            }
            if (m42831(i, 32)) {
                sb.append("super ");
            }
            if (m42831(i, 16384)) {
                sb.append("enum ");
            }
            if (m42831(i, 262144)) {
                sb.append("data ");
            }
        }
        if (m42831(i, 4096)) {
            sb.append("synthetic ");
        }
        return sb.toString();
    }
}
