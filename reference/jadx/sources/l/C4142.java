package l;

/* JADX INFO: renamed from: l.ۘۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: QBE0 */
/* JADX INFO: loaded from: classes2.dex */
public class C4142 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC1159 mo13268(C18312 c18312, int i, String str, int i2, int i3) {
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC5875 m13269(C18312 c18312, int i, int i2) {
        String str;
        if (c18312 == null) {
            throw new NullPointerException("cf == null");
        }
        if (i < 0 || i >= 4) {
            throw new IllegalArgumentException("bad context");
        }
        C9976 c9976 = null;
        try {
            C22460 c22460M42713 = c18312.m42713();
            C9230 c9230M42711 = c18312.m42711();
            int iM50641 = c22460M42713.m50641(i2);
            int iM50643 = c22460M42713.m50643(i2 + 2);
            C9976 c9977 = (C9976) c9230M42711.get(iM50641);
            try {
                return (AbstractC5875) mo13268(c18312, i, c9977.getString(), i2 + 6, iM50643);
            } catch (C7125 e) {
                e = e;
                c9976 = c9977;
                StringBuilder sb = new StringBuilder("...while parsing ");
                if (c9976 != null) {
                    str = c9976.mo1843() + " ";
                } else {
                    str = "";
                }
                sb.append(str);
                sb.append("attribute at offset ");
                sb.append(C5306.m15938(i2));
                e.m12508(sb.toString());
                throw e;
            }
        } catch (C7125 e2) {
            e = e2;
        }
    }
}
