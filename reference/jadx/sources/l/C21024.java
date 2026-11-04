package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩶ۗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 07RX */
/* JADX INFO: loaded from: classes5.dex */
public final class C21024 extends C14310 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f67193;

    @Override // l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1767(C2832 c2832, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        sb.append("[");
        return (AbstractC22664) c2832.f9333.mo9324(this, sb);
    }

    @Override // l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1768(C10510 c10510, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        String strReplace = (this.f67193 ? c10510.f73596.mo29575().toString() : c10510.f73596.mo29582().toString()).replace('.', '/');
        sb.append("L");
        sb.append(strReplace);
        sb.append(l.b);
        return null;
    }

    @Override // l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final AbstractC22664 mo1766(AbstractC22664 abstractC22664, StringBuilder sb) {
        String str;
        if (!abstractC22664.mo40456()) {
            return (AbstractC22664) abstractC22664.mo9324(this, sb);
        }
        int i = C24008.f77658[abstractC22664.mo5501().ordinal()];
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
                    C11972.m30024("unknown type: should not happen");
                    throw null;
            }
        } else {
            str = "V";
        }
        sb.append(str);
        return null;
    }

    public C21024(boolean z) {
        this.f67193 = z;
    }
}
