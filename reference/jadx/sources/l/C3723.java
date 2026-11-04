package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۗ᩹ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6GY */
/* JADX INFO: loaded from: classes2.dex */
public final class C3723 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List f12796;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final List f12797;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final List f12798;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f12799;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String f12800;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List f12801;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final List f12802;

    public C3723(String str, List list, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f12799 = str;
        this.f12800 = list.isEmpty() ? null : (String) list.get(0);
        this.f12797 = C4681.unmodifiableList(new ArrayList(list.subList(!list.isEmpty() ? 1 : 0, list.size())));
        this.f12802 = C4681.unmodifiableList(arrayList);
        this.f12801 = C4681.unmodifiableList(arrayList2);
        this.f12796 = C4681.unmodifiableList(arrayList3);
        this.f12798 = C4681.unmodifiableList(arrayList4);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m12119() {
        return this.f12799;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String m12120() {
        return this.f12800;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final List m12117() {
        return this.f12797;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final List m12122() {
        return this.f12802;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List m12121() {
        return this.f12801;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m12116() {
        return this.f12796;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final List m12118() {
        return this.f12798;
    }
}
