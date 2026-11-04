package l;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܶۢۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5E8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16004 extends AbstractC10739 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C16750[] f51942;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f51943;

    public C16004(C24738 c24738) {
        super(c24738);
        this.f51943 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16004 m38138(C24738 c24738) {
        ArrayList arrayList = new ArrayList(this.f51942.length);
        for (C16750 c16750 : this.f51942) {
            arrayList.add(c16750.m39525(c24738));
        }
        C16750[] c16750Arr = new C16750[arrayList.size()];
        arrayList.toArray(c16750Arr);
        C16004 c16004 = new C16004(c24738);
        c16004.f51943 = 0;
        c16004.f51942 = c16750Arr;
        return (C16004) c24738.f80100.m38079(c16004);
    }

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final void mo10825(C4028 c4028, C17452 c17452) {
        this.f51942 = new C16750[c4028.m12995()];
        int i = 0;
        while (true) {
            C16750[] c16750Arr = this.f51942;
            if (i >= c16750Arr.length) {
                return;
            }
            c16750Arr[i] = (C16750) c17452.m40951(EnumC15214.TYPE_ANNOTATION_ITEM, c4028.m12995());
            i++;
        }
    }

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final int mo10821(int i) {
        return (this.f51942.length * 4) + i + 4;
    }

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final void mo10826(C24166 c24166) {
        Arrays.sort(this.f51942, new C17496());
        c24166.m54134(this.f51942.length);
        for (C16750 c16750 : this.f51942) {
            c24166.m54134(c16750.f34103);
        }
    }

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final String mo10823() {
        return C4791.m14766(new StringBuilder("annotation_set_item @0x"), this.f34103);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C16004 c16004) {
        if (c16004 == null) {
            return 1;
        }
        int length = this.f51942.length - c16004.f51942.length;
        if (length == 0) {
            int i = 0;
            while (true) {
                C16750[] c16750Arr = this.f51942;
                if (i >= c16750Arr.length) {
                    break;
                }
                length = c16750Arr[i].compareTo(c16004.f51942[i]);
                if (length != 0) {
                    return length;
                }
                i++;
            }
        }
        return length;
    }

    public final int hashCode() {
        if (this.f51943 == 0) {
            this.f51943 = 0;
            for (C16750 c16750 : this.f51942) {
                this.f51943 = c16750.hashCode() + (this.f51943 * 31);
            }
        }
        return this.f51943;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C16004.class.equals(obj.getClass()) && compareTo((C16004) obj) == 0;
    }
}
