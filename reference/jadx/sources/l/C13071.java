package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۫ۧᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5ATX */
/* JADX INFO: loaded from: classes4.dex */
public final class C13071 implements Comparable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C5614 f41812;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f41813;

    public /* synthetic */ C13071(String str, int i) {
        this(str);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f41813.compareTo(((C13071) obj).f41813);
    }

    public C13071(String str) {
        this.f41813 = str;
        this.f41812 = new C5614();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32551(ArrayList arrayList, int i) {
        int i2 = i + 1;
        String str = (String) arrayList.get(i);
        C5614 c5614 = this.f41812;
        C13071 c13071 = (C13071) c5614.get(str);
        if (c13071 == null) {
            c13071 = new C13071(str);
            c5614.put(str, c13071);
        }
        if (i2 != arrayList.size()) {
            c13071.m32551(arrayList, i2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m32550() {
        return this.f41813 + this.f41812.m16594();
    }
}
