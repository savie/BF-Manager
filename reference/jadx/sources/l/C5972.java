package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۛۢ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 44FR */
/* JADX INFO: loaded from: classes2.dex */
public final class C5972 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f20334 = new ArrayList(20);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16266(String str) {
        int iIndexOf = str.indexOf(":", 1);
        if (iIndexOf != -1) {
            m16270(str.substring(0, iIndexOf), str.substring(iIndexOf + 1));
        } else if (str.startsWith(":")) {
            m16270("", str.substring(1));
        } else {
            m16270("", str);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16267(String str, String str2) {
        C10912.m27343(str);
        C10912.m27341(str2, str);
        m16270(str, str2);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m16270(String str, String str2) {
        ArrayList arrayList = this.f20334;
        arrayList.add(str);
        arrayList.add(str2.trim());
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m16268(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f20334;
            if (i >= arrayList.size()) {
                return;
            }
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m16269(String str) {
        ArrayList arrayList = this.f20334;
        int size = arrayList.size();
        do {
            size -= 2;
            if (size < 0) {
                return null;
            }
        } while (!str.equalsIgnoreCase((String) arrayList.get(size)));
        return (String) arrayList.get(size + 1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10912 m16265() {
        return new C10912(this);
    }
}
