package l;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܶᩳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 5BM7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16279 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f52870;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f52871;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f52872 = new ArrayList();

    public C16279(String str) {
        this.f52871 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38615(String str, String str2) {
        InterfaceC9801 interfaceC9801 = ApplicationC17729.f58258;
        m38621();
        if (interfaceC9801.getBoolean(str + "_empty", false)) {
            this.f52870 = "";
        } else if (!this.f52872.isEmpty()) {
            this.f52870 = (String) this.f52872.get(0);
        } else {
            this.f52870 = str2;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m38621() {
        String[] strArrMo7905 = ApplicationC17729.f58258.mo7905(this.f52871, (String[]) null);
        this.f52872 = strArrMo7905 == null ? new ArrayList() : new ArrayList(Arrays.asList(strArrMo7905));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m38611() {
        String str = this.f52870;
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m38618(String str) {
        this.f52870 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38616(boolean z) {
        String str = this.f52871;
        if (str.isEmpty()) {
            return;
        }
        InterfaceC9801 interfaceC9801 = ApplicationC17729.f58258;
        String strConcat = str.concat("_empty");
        if (interfaceC9801.getBoolean(strConcat, false) != z) {
            C6421.m18184(interfaceC9801, strConcat, z);
        }
        if (z) {
            this.f52870 = null;
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m38623() {
        String str = this.f52871;
        if (str.isEmpty()) {
            return;
        }
        if (this.f52872.isEmpty()) {
            ApplicationC17729.f58258.edit().remove(str).apply();
        } else {
            ApplicationC17729.f58258.edit().mo3490(str, (String[]) this.f52872.toArray(new String[0])).apply();
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m38619() {
        return this.f52872.size();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m38612(int i) {
        return (String) this.f52872.get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38614(String str) {
        this.f52872.add(0, str);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m38617() {
        ArrayList arrayList = this.f52872;
        arrayList.remove(arrayList.size() - 1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m38613(int i, String str) {
        return (String) this.f52872.set(i, str);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m38622(int i) {
        this.f52872.remove(i);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m38620(String str) {
        return this.f52872.indexOf(str);
    }
}
