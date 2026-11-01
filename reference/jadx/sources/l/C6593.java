package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۜۜ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 07RX */
/* JADX INFO: loaded from: classes3.dex */
public final class C6593 extends C3770 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean f22213;

    @Override // l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1768(C0309 c0309, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        String strReplace = (this.f22213 ? c0309.f53222.mo50003().toString() : c0309.f53222.mo20270().toString()).replace('.', '/');
        sb.append("L");
        sb.append(strReplace);
        sb.append(l.b);
        return null;
    }

    @Override // l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo6580(C8777 c8777, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        sb.append("[");
        return (AbstractC16579) c8777.f30194.mo1928(this, sb);
    }

    @Override // l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final AbstractC16579 mo1767(AbstractC16579 abstractC16579, StringBuilder sb) {
        String str;
        if (!abstractC16579.mo9482()) {
            return (AbstractC16579) abstractC16579.mo1928(this, sb);
        }
        int i = C0948.f3761[abstractC16579.mo1931().ordinal()];
        if (i != 11) {
            switch (i) {
                case 1:
                    str = "Z";
                    break;
                case 2:
                    str = "B";
                    break;
                case 3:
                    str = "S";
                    break;
                case 4:
                    str = "I";
                    break;
                case 5:
                    str = "J";
                    break;
                case 6:
                    str = "C";
                    break;
                case 7:
                    str = "F";
                    break;
                case 8:
                    str = "D";
                    break;
                default:
                    C6171.m17174("unknown type: should not happen");
                    throw null;
            }
        } else {
            str = "V";
        }
        sb.append(str);
        return null;
    }

    public C6593(boolean z) {
        this.f22213 = z;
    }
}
