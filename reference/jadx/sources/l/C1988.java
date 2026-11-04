package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.֫ܳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 44FR */
/* JADX INFO: loaded from: classes2.dex */
public final class C1988 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f6650 = new ArrayList(20);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6810(String str) {
        int iIndexOf = str.indexOf(":", 1);
        if (iIndexOf != -1) {
            m6814(str.substring(0, iIndexOf), str.substring(iIndexOf + 1));
        } else if (str.startsWith(":")) {
            m6814("", str.substring(1));
        } else {
            m6814("", str);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6811(String str, String str2) {
        C11682.m29359(str);
        C11682.m29357(str2, str);
        m6814(str, str2);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m6814(String str, String str2) {
        ArrayList arrayList = this.f6650;
        arrayList.add(str);
        arrayList.add(str2.trim());
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m6812(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f6650;
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

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m6813(String str) {
        ArrayList arrayList = this.f6650;
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
    public final C11682 m6809() {
        return new C11682(this);
    }
}
