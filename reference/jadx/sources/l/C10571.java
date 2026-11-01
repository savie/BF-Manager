package l;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۤ᩸᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 5BM7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10571 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f36174;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f36175;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f36176 = new ArrayList();

    public C10571(String str) {
        this.f36175 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26734(String str, String str2) {
        InterfaceC6025 interfaceC6025 = ApplicationC0716.f2992;
        m26740();
        if (interfaceC6025.getBoolean(str + "_empty", false)) {
            this.f36174 = "";
        } else if (!this.f36176.isEmpty()) {
            this.f36174 = (String) this.f36176.get(0);
        } else {
            this.f36174 = str2;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m26740() {
        String[] strArrMo16349 = ApplicationC0716.f2992.mo16349(this.f36175, (String[]) null);
        this.f36176 = strArrMo16349 == null ? new ArrayList() : new ArrayList(Arrays.asList(strArrMo16349));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m26730() {
        String str = this.f36174;
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m26738(String str) {
        this.f36174 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26735(boolean z) {
        String str = this.f36175;
        if (str.isEmpty()) {
            return;
        }
        InterfaceC6025 interfaceC6025 = ApplicationC0716.f2992;
        String strConcat = str.concat("_empty");
        if (interfaceC6025.getBoolean(strConcat, false) != z) {
            C1679.m5597(interfaceC6025, strConcat, z);
        }
        if (z) {
            this.f36174 = null;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m26729() {
        String str = this.f36175;
        if (str.isEmpty()) {
            return;
        }
        if (this.f36176.isEmpty()) {
            ApplicationC0716.f2992.edit().remove(str).apply();
        } else {
            ApplicationC0716.f2992.edit().mo4069(str, (String[]) this.f36176.toArray(new String[0])).apply();
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m26736() {
        return this.f36176.size();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m26731(int i) {
        return (String) this.f36176.get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26733(String str) {
        this.f36176.add(0, str);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m26737() {
        ArrayList arrayList = this.f36176;
        arrayList.remove(arrayList.size() - 1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m26732(int i, String str) {
        return (String) this.f36176.set(i, str);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m26741(int i) {
        this.f36176.remove(i);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m26739(String str) {
        return this.f36176.indexOf(str);
    }
}
