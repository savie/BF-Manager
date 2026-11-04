package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩹ۢۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: R5FO */
/* JADX INFO: loaded from: classes.dex */
public final class C23464 extends AbstractC10739 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C16004[] f75916;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f75917;

    public C23464(C24738 c24738) {
        super(c24738);
        this.f75917 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23464 m52668(C24738 c24738) {
        ArrayList arrayList = new ArrayList(this.f75916.length);
        for (C16004 c16004 : this.f75916) {
            if (c16004 != null) {
                arrayList.add(c16004.m38138(c24738));
            }
        }
        C16004[] c16004Arr = new C16004[arrayList.size()];
        arrayList.toArray(c16004Arr);
        C23464 c23464 = new C23464(c24738);
        c23464.f75917 = 0;
        c23464.f75916 = c16004Arr;
        return (C23464) c24738.f80114.m38079(c23464);
    }

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final void mo10825(C4028 c4028, C17452 c17452) {
        this.f75916 = new C16004[c4028.m12995()];
        int i = 0;
        while (true) {
            C16004[] c16004Arr = this.f75916;
            if (i >= c16004Arr.length) {
                return;
            }
            c16004Arr[i] = (C16004) c17452.m40955(EnumC15214.TYPE_ANNOTATION_SET_ITEM, c4028.m12995());
            i++;
        }
    }

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final int mo10821(int i) {
        return (this.f75916.length * 4) + i + 4;
    }

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final void mo10826(C24166 c24166) {
        c24166.m54134(this.f75916.length);
        for (C16004 c16004 : this.f75916) {
            c24166.m54134(c16004.f34103);
        }
    }

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final String mo10823() {
        return C4791.m14766(new StringBuilder("annotation_set_item @0x"), this.f34103);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C23464 c23464) {
        int length = this.f75916.length - c23464.f75916.length;
        if (length != 0) {
            return length;
        }
        int i = 0;
        while (true) {
            C16004[] c16004Arr = this.f75916;
            if (i >= c16004Arr.length) {
                return length;
            }
            length = c16004Arr[i].compareTo(c23464.f75916[i]);
            if (length != 0) {
                return length;
            }
            i++;
        }
    }

    public final int hashCode() {
        if (this.f75917 == 0) {
            this.f75917 = 0;
            for (C16004 c16004 : this.f75916) {
                this.f75917 = c16004.hashCode() + (this.f75917 * 31);
            }
        }
        return this.f75917;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C23464.class.equals(obj.getClass()) && compareTo((C23464) obj) == 0;
    }
}
