package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۜܶۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: W6LU */
/* JADX INFO: loaded from: classes4.dex */
public final class C7226 extends AbstractC16375 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final InterfaceC10869 f23824;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final ArrayList f23825;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f23826;

    public C7226(InterfaceC7206 interfaceC7206, InterfaceC10869 interfaceC10869, ArrayList arrayList) throws C10186 {
        super((AbstractC20105) interfaceC7206);
        this.f23825 = new ArrayList();
        this.f53163 = interfaceC10869.mo27606();
        this.f23824 = interfaceC10869;
        this.f53162 = interfaceC10869.mo27607();
        this.f53160 = interfaceC10869.getPackageName();
        this.f23826 = new ArrayList(interfaceC10869.mo19818());
        HashSet hashSet = new HashSet();
        for (InterfaceC15344 c13937 : interfaceC10869.mo19822()) {
            ArrayList arrayListM19816 = m19816(arrayList, c13937.mo35833());
            ArrayList arrayList2 = this.f23825;
            if (hashSet.add(Integer.valueOf(c13937.mo35833())) && !arrayListM19816.isEmpty()) {
                c13937 = new C13937(this, c13937, c13937.mo35833(), arrayListM19816);
            }
            arrayList2.add(c13937);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1260 c1260 = (C1260) it.next();
            int i = (c1260.f4547 >>> 16) & 255;
            if (i == 0) {
                throw C10186.m26305("RESOURCE_PATCH_CORRUPT", "Resource patch type ID is invalid.");
            }
            if (hashSet.add(Integer.valueOf(i))) {
                while (this.f23826.size() < i) {
                    this.f23826.add("?" + (this.f23826.size() + 1));
                }
                this.f23826.set(i - 1, c1260.f4553);
                this.f23825.add(new C13937(this, null, i, m19816(arrayList, i)));
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m19816(ArrayList arrayList, int i) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1260 c1260 = (C1260) it.next();
            if (((c1260.f4547 >>> 16) & 255) == i) {
                arrayList2.add(c1260);
            }
        }
        return arrayList2;
    }

    @Override // l.InterfaceC10869
    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int mo19820() {
        return this.f23825.size();
    }

    @Override // l.InterfaceC10869
    public final InterfaceC15344 getType(int i) {
        return (InterfaceC15344) this.f23825.get(i);
    }

    @Override // l.InterfaceC10869
    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public final List mo19818() {
        return this.f23826;
    }

    @Override // l.AbstractC16375, l.InterfaceC10869
    /* JADX INFO: renamed from: ܽ᩷, reason: not valid java name and contains not printable characters */
    public final Iterable mo19822() {
        return this.f23825;
    }

    @Override // l.InterfaceC10869
    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final int mo19827() {
        return this.f23824.mo19827();
    }

    @Override // l.InterfaceC10869
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13917 mo19821(int i) {
        return this.f23824.mo19821(i);
    }

    @Override // l.AbstractC16375, l.InterfaceC10869
    /* JADX INFO: renamed from: ᩺᩷, reason: not valid java name and contains not printable characters */
    public final Iterable mo19828() {
        return this.f23824.mo19828();
    }

    @Override // l.InterfaceC10869
    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int mo19823() {
        return this.f23824.mo19823();
    }

    @Override // l.InterfaceC10869
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC4904 mo19826(int i) {
        return this.f23824.mo19826(i);
    }

    @Override // l.AbstractC16375, l.InterfaceC10869
    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final Iterable mo19824() {
        return this.f23824.mo19824();
    }

    @Override // l.InterfaceC10869
    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public final int mo19819() {
        return this.f23824.mo19819();
    }

    @Override // l.InterfaceC10869
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22804 mo19817(int i) {
        return this.f23824.mo19817(i);
    }

    @Override // l.AbstractC16375, l.InterfaceC10869
    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Iterable mo19825() {
        return this.f23824.mo19825();
    }
}
