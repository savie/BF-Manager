package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: l.ᩴۧܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1PQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C19782 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f63640;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f63641;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C19782 f63643;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f63639 = new ArrayList();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f63642 = new ArrayList();

    public C19782(C19782 c19782, String str, String str2) {
        this.f63643 = c19782;
        this.f63640 = str;
        this.f63641 = str2;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m45562() {
        return this.f63640;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String m45560() {
        return this.f63641;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m45556() {
        return C4681.unmodifiableList(this.f63639);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List m45561() {
        return C4681.unmodifiableList(this.f63642);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ArrayList m45559() {
        return this.f63639;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22020 m45557(String str) {
        for (C22020 c22020 : this.f63642) {
            if (c22020.f71048.equals(str)) {
                return c22020;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45558(final Comparator comparator) {
        Comparator comparator2 = new Comparator() { // from class: l.ۤۧܺ
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return comparator.compare(((C19782) obj).f63640, ((C19782) obj2).f63640);
            }
        };
        ArrayList arrayList = this.f63639;
        Collections.sort(arrayList, comparator2);
        Collections.sort(this.f63642, new Comparator() { // from class: l.᩸ۧܺ
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return comparator.compare(((C22020) obj).f71048, ((C22020) obj2).f71048);
            }
        });
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C19782) arrayList.get(i)).m45558(comparator);
        }
    }
}
