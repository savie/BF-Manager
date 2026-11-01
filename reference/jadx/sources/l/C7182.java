package l;

/* JADX INFO: renamed from: l.۟ۖܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: QBE0 */
/* JADX INFO: loaded from: classes3.dex */
public class C7182 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC5771 mo19115(C19883 c19883, int i, String str, int i2, int i3) {
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC1100 m19114(C19883 c19883, int i, int i2) {
        String str;
        if (c19883 == null) {
            throw new NullPointerException("cf == null");
        }
        if (i < 0 || i >= 4) {
            throw new IllegalArgumentException("bad context");
        }
        C17432 c17432 = null;
        try {
            C14009 c14009M45129 = c19883.m45129();
            C11083 c11083M45133 = c19883.m45133();
            int iM33871 = c14009M45129.m33871(i2);
            int iM33870 = c14009M45129.m33870(i2 + 2);
            C17432 c17433 = (C17432) c11083M45133.get(iM33871);
            try {
                return (AbstractC1100) mo19115(c19883, i, c17433.getString(), i2 + 6, iM33870);
            } catch (C1537 e) {
                e = e;
                c17432 = c17433;
                StringBuilder sb = new StringBuilder("...while parsing ");
                if (c17432 != null) {
                    str = c17432.mo2376() + " ";
                } else {
                    str = "";
                }
                sb.append(str);
                sb.append("attribute at offset ");
                sb.append(C22475.m49978(i2));
                e.m20021(sb.toString());
                throw e;
            }
        } catch (C1537 e2) {
            e = e2;
        }
    }
}
