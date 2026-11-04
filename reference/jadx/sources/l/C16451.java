package l;

/* JADX INFO: renamed from: l.ܶ᩻᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: R8N3 */
/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public class C16451 implements InterfaceC8191 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f53347;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f53348;

    @Override // l.InterfaceC8191
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C15648 mo12245() {
        return null;
    }

    @Override // l.InterfaceC8191
    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ byte[] mo12247() {
        return null;
    }

    public C16451(String str, String str2) {
        this.f53347 = C7914.m21456(str);
        this.f53348 = str2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // l.InterfaceC8191
    /* JADX INFO: renamed from: ۙ */
    public final void mo12246(C18632 c18632) {
        String str = this.f53347;
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
        String str2 = this.f53348;
        switch (b) {
            case 0:
                Integer numM42971 = C18444.m42971(str2);
                if (numM42971 != null) {
                    c18632.m43368(numM42971);
                }
                break;
            case 1:
                Integer numM42972 = C18444.m42971(str2);
                if (numM42972 != null) {
                    c18632.m43375(numM42972);
                }
                break;
            case 2:
                Integer numM42973 = C18444.m42971(str2);
                if (numM42973 != null) {
                    c18632.m43379(numM42973);
                }
                break;
            case 3:
                c18632.m43386(str2);
                break;
            case 4:
                c18632.m43380(str2);
                break;
            case 5:
                c18632.m43367(str2);
                break;
            case 6:
                c18632.m43382(str2);
                break;
            case 7:
                Integer numM42974 = C18444.m42971(str2);
                if (numM42974 != null) {
                    c18632.m43372(numM42974);
                }
                break;
            case 8:
                c18632.m43371(str2);
                break;
            case 9:
                c18632.m43376(str2);
                break;
        }
    }

    public final String toString() {
        return "VC: " + this.f53347 + "=" + this.f53348;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C16451 c16451 = (C16451) obj;
            if (this.f53347.equals(c16451.f53347) && this.f53348.equals(c16451.f53348)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f53348.hashCode() + C12351.m30817(527, 31, this.f53347);
    }
}
