package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۡ۬ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5ATX */
/* JADX INFO: loaded from: classes3.dex */
public final class C8895 implements Comparable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C10306 f30523;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f30524;

    public /* synthetic */ C8895(String str, int i) {
        this(str);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f30524.compareTo(((C8895) obj).f30524);
    }

    public C8895(String str) {
        this.f30524 = str;
        this.f30523 = new C10306();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23146(ArrayList arrayList, int i) {
        int i2 = i + 1;
        String str = (String) arrayList.get(i);
        C10306 c10306 = this.f30523;
        C8895 c8895 = (C8895) c10306.get(str);
        if (c8895 == null) {
            c8895 = new C8895(str);
            c10306.put(str, c8895);
        }
        if (i2 != arrayList.size()) {
            c8895.m23146(arrayList, i2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m23145() {
        return this.f30524 + this.f30523.m26121();
    }
}
