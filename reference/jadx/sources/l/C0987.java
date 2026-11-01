package l;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.֨۠ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8AVI */
/* JADX INFO: loaded from: classes2.dex */
public final class C0987 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22155[] f4631;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f4632;

    public C0987() {
        throw null;
    }

    public C0987(InterfaceC22155... interfaceC22155Arr) {
        this(-9223372036854775807L, interfaceC22155Arr);
    }

    public C0987(long j, InterfaceC22155... interfaceC22155Arr) {
        this.f4632 = j;
        this.f4631 = interfaceC22155Arr;
    }

    public C0987(List list) {
        this((InterfaceC22155[]) list.toArray(new InterfaceC22155[0]));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m3789() {
        return this.f4631.length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22155 m3793(int i) {
        return this.f4631[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0987 m3791(C0987 c0987) {
        return c0987 == null ? this : m3792(c0987.f4631);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0987 m3792(InterfaceC22155... interfaceC22155Arr) {
        if (interfaceC22155Arr.length == 0) {
            return this;
        }
        String str = C17983.f57504;
        InterfaceC22155[] interfaceC22155Arr2 = this.f4631;
        Object[] objArrCopyOf = Arrays.copyOf(interfaceC22155Arr2, interfaceC22155Arr2.length + interfaceC22155Arr.length);
        System.arraycopy(interfaceC22155Arr, 0, objArrCopyOf, interfaceC22155Arr2.length, interfaceC22155Arr.length);
        return new C0987(this.f4632, (InterfaceC22155[]) objArrCopyOf);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0987 m3790(long j) {
        return this.f4632 == j ? this : new C0987(j, this.f4631);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0987.class == obj.getClass()) {
            C0987 c0987 = (C0987) obj;
            if (Arrays.equals(this.f4631, c0987.f4631) && this.f4632 == c0987.f4632) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C23390.m51532(this.f4632) + (Arrays.hashCode(this.f4631) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.f4631));
        long j = this.f4632;
        if (j == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j;
        }
        sb.append(str);
        return sb.toString();
    }
}
