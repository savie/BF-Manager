package l;

import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩵᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: V16Z */
/* JADX INFO: loaded from: classes4.dex */
public final class C19702 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static int f63253;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f63255;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f63257;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public ArrayList f63256 = new ArrayList();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public ArrayList f63254 = null;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f63258 = -1;

    public C19702(int i) {
        int i2 = f63253;
        f63253 = i2 + 1;
        this.f63255 = i2;
        this.f63257 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m44827(C20719 c20719) {
        ArrayList arrayList = this.f63256;
        if (arrayList.contains(c20719)) {
            return false;
        }
        arrayList.add(c20719);
        return true;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        int i = this.f63257;
        if (i == 0) {
            str = "Horizontal";
        } else if (i == 1) {
            str = "Vertical";
        } else {
            str = i == 2 ? "Both" : "Unknown";
        }
        sb.append(str);
        sb.append(" [");
        String strM30911 = C12441.m30911(this.f63255, "] <", sb);
        for (C20719 c20719 : this.f63256) {
            StringBuilder sbM8976 = C3012.m8976(strM30911, " ");
            sbM8976.append(c20719.m46643());
            strM30911 = sbM8976.toString();
        }
        return C15489.m37076(strM30911, " >");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44825(int i, C19702 c19702) {
        int i2 = c19702.f63255;
        for (C20719 c20719 : this.f63256) {
            c19702.m44827(c20719);
            if (i == 0) {
                c20719.f67400 = i2;
            } else {
                c20719.f67435 = i2;
            }
        }
        this.f63258 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m44824(C5196 c5196, int i) {
        int iM14358;
        int iM14359;
        ArrayList arrayList = this.f63256;
        if (arrayList.size() == 0) {
            return 0;
        }
        C15781 c15781 = (C15781) ((C20719) arrayList.get(0)).f67433;
        c5196.m14370();
        c15781.mo1744(c5196, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((C20719) arrayList.get(i2)).mo1744(c5196, false);
        }
        if (i == 0 && c15781.f51110 > 0) {
            C17896.m41527(c15781, c5196, arrayList, 0);
        }
        if (i == 1 && c15781.f51118 > 0) {
            C17896.m41527(c15781, c5196, arrayList, 1);
        }
        try {
            c5196.m14361();
        } catch (Exception unused) {
        }
        this.f63254 = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            C20719 c20719 = (C20719) arrayList.get(i3);
            C8413 c8413 = new C8413();
            new WeakReference(c20719);
            C5196.m14358(c20719.f67385);
            C5196.m14358(c20719.f67392);
            C5196.m14358(c20719.f67421);
            C5196.m14358(c20719.f67387);
            C5196.m14358(c20719.f67404);
            this.f63254.add(c8413);
        }
        if (i == 0) {
            iM14358 = C5196.m14358(c15781.f67385);
            iM14359 = C5196.m14358(c15781.f67421);
            c5196.m14370();
        } else {
            iM14358 = C5196.m14358(c15781.f67392);
            iM14359 = C5196.m14358(c15781.f67387);
            c5196.m14370();
        }
        return iM14359 - iM14358;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44826(ArrayList arrayList) {
        int size = this.f63256.size();
        if (this.f63258 != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                C19702 c19702 = (C19702) arrayList.get(i);
                if (this.f63258 == c19702.f63255) {
                    m44825(this.f63257, c19702);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }
}
