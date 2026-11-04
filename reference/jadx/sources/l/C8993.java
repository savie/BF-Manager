package l;

import com.umeng.analytics.pro.cb;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: l.۠᩻᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: G8O0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8993 extends AbstractC19435 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC1928 f29298;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f29299;

    /* JADX WARN: Multi-variable type inference failed */
    public C8993(String str, String str2, List list) {
        super(str);
        C20782.m47565(!((AbstractCollection) list).isEmpty());
        this.f29299 = str2;
        AbstractC1928 abstractC1928CopyOf = AbstractC1928.copyOf((Collection) list);
        this.f29298 = abstractC1928CopyOf;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:97:0x013b  */
    @Override // l.AbstractC19435, l.InterfaceC8191
    /* JADX INFO: renamed from: ۙ */
    public final void mo12246(C18632 c18632) {
        byte b;
        switch (this.f62806) {
            case "TAL":
                b = 0;
                break;
            case "TCM":
                b = 1;
                break;
            case "TDA":
                b = 2;
                break;
            case "TP1":
                b = 3;
                break;
            case "TP2":
                b = 4;
                break;
            case "TP3":
                b = 5;
                break;
            case "TRK":
                b = 6;
                break;
            case "TT2":
                b = 7;
                break;
            case "TXT":
                b = 8;
                break;
            case "TYE":
                b = 9;
                break;
            case "TALB":
                b = 10;
                break;
            case "TCOM":
                b = 11;
                break;
            case "TCON":
                b = 12;
                break;
            case "TDAT":
                b = cb.k;
                break;
            case "TDRC":
                b = cb.f82047l;
                break;
            case "TDRL":
                b = 15;
                break;
            case "TEXT":
                b = 16;
                break;
            case "TIT2":
                b = 17;
                break;
            case "TPE1":
                b = 18;
                break;
            case "TPE2":
                b = 19;
                break;
            case "TPE3":
                b = 20;
                break;
            case "TRCK":
                b = 21;
                break;
            case "TYER":
                b = 22;
                break;
            default:
                b = -1;
                break;
        }
        AbstractC1928 abstractC1928 = this.f29298;
        try {
            switch (b) {
                case 0:
                case 10:
                    c18632.m43386((CharSequence) abstractC1928.get(0));
                    break;
                case 1:
                case 11:
                    c18632.m43388((CharSequence) abstractC1928.get(0));
                    break;
                case 2:
                case 13:
                    String str = (String) abstractC1928.get(0);
                    int i = Integer.parseInt(str.substring(2, 4));
                    int i2 = Integer.parseInt(str.substring(0, 2));
                    c18632.m43377(Integer.valueOf(i));
                    c18632.m43387(Integer.valueOf(i2));
                    break;
                case 3:
                case 18:
                    c18632.m43376((CharSequence) abstractC1928.get(0));
                    break;
                case 4:
                case 19:
                    c18632.m43371((CharSequence) abstractC1928.get(0));
                    break;
                case 5:
                case 20:
                    c18632.m43384((CharSequence) abstractC1928.get(0));
                    break;
                case 6:
                case 21:
                    String str2 = (String) abstractC1928.get(0);
                    String str3 = C7116.f23455;
                    String[] strArrSplit = str2.split("/", -1);
                    int i3 = Integer.parseInt(strArrSplit[0]);
                    Integer numValueOf = strArrSplit.length > 1 ? Integer.valueOf(Integer.parseInt(strArrSplit[1])) : null;
                    c18632.m43379(Integer.valueOf(i3));
                    c18632.m43368(numValueOf);
                    break;
                case 7:
                case 17:
                    c18632.m43367((CharSequence) abstractC1928.get(0));
                    break;
                case 8:
                case 16:
                    c18632.m43378((CharSequence) abstractC1928.get(0));
                    break;
                case 9:
                case 22:
                    c18632.m43389(Integer.valueOf(Integer.parseInt((String) abstractC1928.get(0))));
                    break;
                case 12:
                    Integer numM42971 = C18444.m42971((String) abstractC1928.get(0));
                    if (numM42971 == null) {
                        c18632.m43380((CharSequence) abstractC1928.get(0));
                    } else {
                        String strM26950 = C10484.m26950(numM42971.intValue());
                        if (strM26950 != null) {
                            c18632.m43380(strM26950);
                        }
                    }
                    break;
                case 14:
                    ArrayList arrayListM23990 = m23990((String) abstractC1928.get(0));
                    int size = arrayListM23990.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                c18632.m43387((Integer) arrayListM23990.get(2));
                            }
                        }
                        c18632.m43377((Integer) arrayListM23990.get(1));
                    }
                    c18632.m43389((Integer) arrayListM23990.get(0));
                    break;
                case 15:
                    ArrayList arrayListM23991 = m23990((String) abstractC1928.get(0));
                    int size2 = arrayListM23991.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                c18632.m43385((Integer) arrayListM23991.get(2));
                            }
                        }
                        c18632.m43383((Integer) arrayListM23991.get(1));
                    }
                    c18632.m43381((Integer) arrayListM23991.get(0));
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C8993.class == obj.getClass()) {
            C8993 c8993 = (C8993) obj;
            if (C17359.equals(this.f62806, c8993.f62806) && C17359.equals(this.f29299, c8993.f29299) && this.f29298.equals(c8993.f29298)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM30817 = C12351.m30817(527, 31, this.f62806);
        String str = this.f29299;
        return this.f29298.hashCode() + ((iM30817 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // l.AbstractC19435
    public final String toString() {
        return this.f62806 + ": description=" + this.f29299 + ": values=" + this.f29298;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m23990(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }
}
