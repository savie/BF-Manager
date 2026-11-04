package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩷۠ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 26C0 */
/* JADX INFO: loaded from: classes.dex */
public final class C21922 implements InterfaceC11851 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List f70784;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ArrayList f70785;

    @Override // l.InterfaceC11851
    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ boolean mo1794() {
        return false;
    }

    @Override // l.InterfaceC11851
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ InterfaceC2157 mo1791() {
        return C11457.f36015;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21922 m49615(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4768 c4768 = (C4768) it.next();
            if (!arrayList.contains(c4768.m14718())) {
                arrayList.add(c4768.m14718());
            }
        }
        C12884.sort(arrayList, C2661.comparingInt(new C13542()));
        ArrayList arrayList2 = new ArrayList(list.size());
        for (Object obj : list) {
            C17359.requireNonNull(obj);
            arrayList2.add(obj);
        }
        return new C21922(arrayList, C4681.unmodifiableList(arrayList2));
    }

    @Override // l.InterfaceC11851
    /* JADX INFO: renamed from: ֡ */
    public final String mo1790() {
        return toString();
    }

    public C21922(ArrayList arrayList, List list) {
        this.f70785 = arrayList;
        this.f70784 = list;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List m49617() {
        return this.f70785;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m49616() {
        return this.f70784;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C21922) {
            return this.f70784.equals(((C21922) obj).f70784);
        }
        return false;
    }

    public final int hashCode() {
        return this.f70784.hashCode();
    }

    public final String toString() {
        return "Catch: " + C4123.m13221(this.f70785, ", ");
    }
}
