package l;

import java.io.File;
import java.util.ArrayList;
import java.util.TreeSet;

/* JADX INFO: renamed from: l.ۙܺۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: A734 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4742 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C13210 f16687;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f16688;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f16689;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final TreeSet f16686 = new TreeSet();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ArrayList f16685 = new ArrayList();

    public C4742(int i, String str, C13210 c13210) {
        this.f16689 = i;
        this.f16688 = str;
        this.f16687 = c13210;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C21676 m13118(long j, long j2) {
        long j3;
        C21676 c21676 = new C21676(this.f16688, j, -1L, -9223372036854775807L, null);
        TreeSet treeSet = this.f16686;
        C21676 c21677 = (C21676) treeSet.floor(c21676);
        if (c21677 != null && c21677.f7660 + c21677.f7657 > j) {
            return c21677;
        }
        C21676 c21678 = (C21676) treeSet.ceiling(c21676);
        if (c21678 != null) {
            long j4 = c21678.f7660 - j;
            if (j2 == -1) {
                j3 = j4;
            } else {
                j2 = Math.min(j4, j2);
                j3 = j2;
            }
        } else {
            j3 = j2;
        }
        return new C21676(this.f16688, j, j3, -9223372036854775807L, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13210 m13109() {
        return this.f16687;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m13113(C1214 c1214) {
        C13210 c13210 = this.f16687;
        C13210 c13210M32697 = c13210.m32697(c1214);
        this.f16687 = c13210M32697;
        return !c13210M32697.equals(c13210);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m13106() {
        return this.f16685.isEmpty();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m13116(long j, long j2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f16685;
            if (i >= arrayList.size()) {
                return false;
            }
            C3476 c3476 = (C3476) arrayList.get(i);
            long j3 = c3476.f12764;
            long j4 = c3476.f12763;
            if (j4 == -1) {
                if (j >= j3) {
                    return true;
                }
            } else if (j2 != -1 && j3 <= j && j + j2 <= j3 + j4) {
                return true;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m13107(long j, long j2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f16685;
            if (i < arrayList.size()) {
                C3476 c3476 = (C3476) arrayList.get(i);
                long j3 = c3476.f12764;
                if (j3 <= j) {
                    long j4 = c3476.f12763;
                    if (j4 == -1 || j3 + j4 > j) {
                        return false;
                    }
                    i++;
                } else {
                    if (j2 == -1 || j + j2 > j3) {
                        return false;
                    }
                    i++;
                }
            } else {
                arrayList.add(new C3476(j, j2));
                return true;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13111(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f16685;
            if (i >= arrayList.size()) {
                throw new IllegalStateException();
            }
            if (((C3476) arrayList.get(i)).f12764 == j) {
                arrayList.remove(i);
                return;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13112(C21676 c21676) {
        this.f16686.add(c21676);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final TreeSet m13117() {
        return this.f16686;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m13108(long j, long j2) {
        C2023.m6507(j >= 0);
        C2023.m6507(j2 >= 0);
        C21676 c21676M13118 = m13118(j, j2);
        long j3 = c21676M13118.f7657;
        boolean z = c21676M13118.f7661;
        long j4 = C17492.FOREVER_NS;
        if (!z) {
            if (j3 == -1) {
                j3 = Long.MAX_VALUE;
            }
            return -Math.min(j3, j2);
        }
        long j5 = j + j2;
        if (j5 >= 0) {
            j4 = j5;
        }
        long jMax = c21676M13118.f7660 + j3;
        if (jMax < j4) {
            for (C21676 c21676 : this.f16686.tailSet(c21676M13118, false)) {
                long j6 = c21676.f7660;
                if (j6 > jMax) {
                    break;
                }
                jMax = Math.max(jMax, j6 + c21676.f7657);
                if (jMax >= j4) {
                    break;
                }
            }
        }
        return Math.min(jMax - j, j2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21676 m13110(C21676 c21676, long j, boolean z) {
        File file;
        TreeSet treeSet = this.f16686;
        C2023.m6510(treeSet.remove(c21676));
        File file2 = c21676.f7658;
        file2.getClass();
        if (z) {
            File parentFile = file2.getParentFile();
            parentFile.getClass();
            File fileM48409 = C21676.m48409(parentFile, this.f16689, c21676.f7660, j);
            if (file2.renameTo(fileM48409)) {
                file = fileM48409;
            } else {
                C0303.m1848("Failed to rename " + file2 + " to " + fileM48409);
                file = file2;
            }
        } else {
            file = file2;
        }
        C2023.m6510(c21676.f7661);
        C21676 c21677 = new C21676(c21676.f7656, c21676.f7660, c21676.f7657, j, file);
        treeSet.add(c21677);
        return c21677;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m13115() {
        return this.f16686.isEmpty();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m13114(C2065 c2065) {
        if (!this.f16686.remove(c2065)) {
            return false;
        }
        File file = c2065.f7658;
        if (file == null) {
            return true;
        }
        file.delete();
        return true;
    }

    public final int hashCode() {
        return this.f16687.hashCode() + C13958.m33812(this.f16689 * 31, 31, this.f16688);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4742.class == obj.getClass()) {
            C4742 c4742 = (C4742) obj;
            if (this.f16689 == c4742.f16689 && this.f16688.equals(c4742.f16688) && this.f16686.equals(c4742.f16686) && this.f16687.equals(c4742.f16687)) {
                return true;
            }
        }
        return false;
    }
}
