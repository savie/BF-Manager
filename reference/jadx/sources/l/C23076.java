package l;

import com.umeng.analytics.pro.cb;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: l.᩺ܶܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: G8O0 */
/* JADX INFO: loaded from: classes.dex */
public final class C23076 extends AbstractC22370 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC22433 f74971;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f74972;

    /* JADX WARN: Multi-variable type inference failed */
    public C23076(String str, String str2, List list) {
        super(str);
        C2023.m6507(!((AbstractCollection) list).isEmpty());
        this.f74972 = str2;
        AbstractC22433 abstractC22433CopyOf = AbstractC22433.copyOf((Collection) list);
        this.f74971 = abstractC22433CopyOf;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:97:0x013b  */
    @Override // l.AbstractC22370, l.InterfaceC22155
    /* JADX INFO: renamed from: ۙ */
    public final void mo3146(C2398 c2398) {
        byte b;
        switch (this.f73049) {
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
                b = cb.f77931l;
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
        AbstractC22433 abstractC22433 = this.f74971;
        try {
            switch (b) {
                case 0:
                case 10:
                    c2398.m7321((CharSequence) abstractC22433.get(0));
                    break;
                case 1:
                case 11:
                    c2398.m7304((CharSequence) abstractC22433.get(0));
                    break;
                case 2:
                case 13:
                    String str = (String) abstractC22433.get(0);
                    int i = Integer.parseInt(str.substring(2, 4));
                    int i2 = Integer.parseInt(str.substring(0, 2));
                    c2398.m7318(Integer.valueOf(i));
                    c2398.m7322(Integer.valueOf(i2));
                    break;
                case 3:
                case 18:
                    c2398.m7317((CharSequence) abstractC22433.get(0));
                    break;
                case 4:
                case 19:
                    c2398.m7310((CharSequence) abstractC22433.get(0));
                    break;
                case 5:
                case 20:
                    c2398.m7313((CharSequence) abstractC22433.get(0));
                    break;
                case 6:
                case 21:
                    String str2 = (String) abstractC22433.get(0);
                    String str3 = C17983.f57504;
                    String[] strArrSplit = str2.split("/", -1);
                    int i3 = Integer.parseInt(strArrSplit[0]);
                    Integer numValueOf = strArrSplit.length > 1 ? Integer.valueOf(Integer.parseInt(strArrSplit[1])) : null;
                    c2398.m7316(Integer.valueOf(i3));
                    c2398.m7307(numValueOf);
                    break;
                case 7:
                case 17:
                    c2398.m7306((CharSequence) abstractC22433.get(0));
                    break;
                case 8:
                case 16:
                    c2398.m7315((CharSequence) abstractC22433.get(0));
                    break;
                case 9:
                case 22:
                    c2398.m7305(Integer.valueOf(Integer.parseInt((String) abstractC22433.get(0))));
                    break;
                case 12:
                    Integer numM39819 = C17039.m39819((String) abstractC22433.get(0));
                    if (numM39819 == null) {
                        c2398.m7302((CharSequence) abstractC22433.get(0));
                    } else {
                        String strM4397 = C1202.m4397(numM39819.intValue());
                        if (strM4397 != null) {
                            c2398.m7302(strM4397);
                        }
                    }
                    break;
                case 14:
                    ArrayList arrayListM51062 = m51062((String) abstractC22433.get(0));
                    int size = arrayListM51062.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                c2398.m7322((Integer) arrayListM51062.get(2));
                            }
                        }
                        c2398.m7318((Integer) arrayListM51062.get(1));
                    }
                    c2398.m7305((Integer) arrayListM51062.get(0));
                    break;
                case 15:
                    ArrayList arrayListM51063 = m51062((String) abstractC22433.get(0));
                    int size2 = arrayListM51063.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                c2398.m7314((Integer) arrayListM51063.get(2));
                            }
                        }
                        c2398.m7324((Integer) arrayListM51063.get(1));
                    }
                    c2398.m7303((Integer) arrayListM51063.get(0));
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C23076.class == obj.getClass()) {
            C23076 c23076 = (C23076) obj;
            if (C13638.equals(this.f73049, c23076.f73049) && C13638.equals(this.f74972, c23076.f74972) && this.f74971.equals(c23076.f74971)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM33812 = C13958.m33812(527, 31, this.f73049);
        String str = this.f74972;
        return this.f74971.hashCode() + ((iM33812 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // l.AbstractC22370
    public final String toString() {
        return this.f73049 + ": description=" + this.f74972 + ": values=" + this.f74971;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m51062(String str) {
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
