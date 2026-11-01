package l;

/* JADX INFO: renamed from: l.ܿ᩺ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: R8N3 */
/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public class C17660 implements InterfaceC22155 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f56116;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f56117;

    @Override // l.InterfaceC22155
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C7648 mo3145() {
        return null;
    }

    @Override // l.InterfaceC22155
    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ byte[] mo3147() {
        return null;
    }

    public C17660(String str, String str2) {
        this.f56116 = C20733.m46675(str);
        this.f56117 = str2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // l.InterfaceC22155
    /* JADX INFO: renamed from: ۙ */
    public final void mo3146(C2398 c2398) {
        String str = this.f56116;
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS")) {
                    b = 0;
                }
                break;
            case -215998278:
                if (str.equals("TOTALDISCS")) {
                    b = 1;
                }
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER")) {
                    b = 2;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    b = 3;
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    b = 4;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    b = 5;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    b = 6;
                }
                break;
            case 993300766:
                if (str.equals("DISCNUMBER")) {
                    b = 7;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    b = 8;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    b = 9;
                }
                break;
        }
        String str2 = this.f56117;
        switch (b) {
            case 0:
                Integer numM39819 = C17039.m39819(str2);
                if (numM39819 != null) {
                    c2398.m7307(numM39819);
                }
                break;
            case 1:
                Integer numM398110 = C17039.m39819(str2);
                if (numM398110 != null) {
                    c2398.m7320(numM398110);
                }
                break;
            case 2:
                Integer numM398111 = C17039.m39819(str2);
                if (numM398111 != null) {
                    c2398.m7316(numM398111);
                }
                break;
            case 3:
                c2398.m7321(str2);
                break;
            case 4:
                c2398.m7302(str2);
                break;
            case 5:
                c2398.m7306(str2);
                break;
            case 6:
                c2398.m7323(str2);
                break;
            case 7:
                Integer numM398112 = C17039.m39819(str2);
                if (numM398112 != null) {
                    c2398.m7311(numM398112);
                }
                break;
            case 8:
                c2398.m7310(str2);
                break;
            case 9:
                c2398.m7317(str2);
                break;
        }
    }

    public final String toString() {
        return "VC: " + this.f56116 + "=" + this.f56117;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C17660 c17660 = (C17660) obj;
            if (this.f56116.equals(c17660.f56116) && this.f56117.equals(c17660.f56117)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f56117.hashCode() + C13958.m33812(527, 31, this.f56116);
    }
}
