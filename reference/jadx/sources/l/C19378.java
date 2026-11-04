package l;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳ᩹ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8AVI */
/* JADX INFO: loaded from: classes5.dex */
public final class C19378 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8191[] f62610;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f62611;

    public C19378() {
        throw null;
    }

    public C19378(InterfaceC8191... interfaceC8191Arr) {
        this(-9223372036854775807L, interfaceC8191Arr);
    }

    public C19378(long j, InterfaceC8191... interfaceC8191Arr) {
        this.f62611 = j;
        this.f62610 = interfaceC8191Arr;
    }

    public C19378(List list) {
        this((InterfaceC8191[]) list.toArray(new InterfaceC8191[0]));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m44819() {
        return this.f62610.length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8191 m44820(int i) {
        return this.f62610[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19378 m44822(C19378 c19378) {
        return c19378 == null ? this : m44823(c19378.f62610);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19378 m44823(InterfaceC8191... interfaceC8191Arr) {
        if (interfaceC8191Arr.length == 0) {
            return this;
        }
        String str = C7116.f23455;
        InterfaceC8191[] interfaceC8191Arr2 = this.f62610;
        Object[] objArrCopyOf = Arrays.copyOf(interfaceC8191Arr2, interfaceC8191Arr2.length + interfaceC8191Arr.length);
        System.arraycopy(interfaceC8191Arr, 0, objArrCopyOf, interfaceC8191Arr2.length, interfaceC8191Arr.length);
        return new C19378(this.f62611, (InterfaceC8191[]) objArrCopyOf);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19378 m44821(long j) {
        return this.f62611 == j ? this : new C19378(j, this.f62610);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C19378.class == obj.getClass()) {
            C19378 c19378 = (C19378) obj;
            if (Arrays.equals(this.f62610, c19378.f62610) && this.f62611 == c19378.f62611) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C19190.m44461(this.f62611) + (Arrays.hashCode(this.f62610) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.f62610));
        long j = this.f62611;
        if (j == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j;
        }
        sb.append(str);
        return sb.toString();
    }
}
