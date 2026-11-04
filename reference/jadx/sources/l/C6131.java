package l;

import java.io.File;
import java.util.ArrayList;
import java.util.TreeSet;

/* JADX INFO: renamed from: l.ۛۘۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: A734 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6131 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f20939;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C18809 f20940;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f20941;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final TreeSet f20938 = new TreeSet();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList f20942 = new ArrayList();

    public C6131(int i, String str, C18809 c18809) {
        this.f20941 = i;
        this.f20939 = str;
        this.f20940 = c18809;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C6876 m17734(long j, long j2) {
        long j3;
        C6876 c6876 = new C6876(this.f20939, j, -1L, -9223372036854775807L, null);
        TreeSet treeSet = this.f20938;
        C6876 c6877 = (C6876) treeSet.floor(c6876);
        if (c6877 != null && c6877.f10209 + c6877.f10206 > j) {
            return c6877;
        }
        C6876 c6878 = (C6876) treeSet.ceiling(c6876);
        if (c6878 != null) {
            long j4 = c6878.f10209 - j;
            if (j2 == -1) {
                j3 = j4;
            } else {
                j2 = Math.min(j4, j2);
                j3 = j2;
            }
        } else {
            j3 = j2;
        }
        return new C6876(this.f20939, j, j3, -9223372036854775807L, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18809 m17726() {
        return this.f20940;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m17730(C7622 c7622) {
        C18809 c18809 = this.f20940;
        C18809 c18809M43652 = c18809.m43652(c7622);
        this.f20940 = c18809M43652;
        return !c18809M43652.equals(c18809);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m17735() {
        return this.f20942.isEmpty();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m17732(long j, long j2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f20942;
            if (i >= arrayList.size()) {
                return false;
            }
            C12096 c12096 = (C12096) arrayList.get(i);
            long j3 = c12096.f38942;
            long j4 = c12096.f38941;
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

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m17736(long j, long j2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f20942;
            if (i < arrayList.size()) {
                C12096 c12096 = (C12096) arrayList.get(i);
                long j3 = c12096.f38942;
                if (j3 <= j) {
                    long j4 = c12096.f38941;
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
                arrayList.add(new C12096(j, j2));
                return true;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17727(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f20942;
            if (i >= arrayList.size()) {
                throw new IllegalStateException();
            }
            if (((C12096) arrayList.get(i)).f38942 == j) {
                arrayList.remove(i);
                return;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17728(C6876 c6876) {
        this.f20938.add(c6876);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final TreeSet m17733() {
        return this.f20938;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m17724(long j, long j2) {
        C20782.m47565(j >= 0);
        C20782.m47565(j2 >= 0);
        C6876 c6876M17734 = m17734(j, j2);
        long j3 = c6876M17734.f10206;
        boolean z = c6876M17734.f10210;
        long j4 = C25227.FOREVER_NS;
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
        long jMax = c6876M17734.f10209 + j3;
        if (jMax < j4) {
            for (C6876 c6876 : this.f20938.tailSet(c6876M17734, false)) {
                long j6 = c6876.f10209;
                if (j6 > jMax) {
                    break;
                }
                jMax = Math.max(jMax, j6 + c6876.f10206);
                if (jMax >= j4) {
                    break;
                }
            }
        }
        return Math.min(jMax - j, j2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6876 m17725(C6876 c6876, long j, boolean z) {
        File file;
        TreeSet treeSet = this.f20938;
        C20782.m47568(treeSet.remove(c6876));
        File file2 = c6876.f10207;
        file2.getClass();
        if (z) {
            File parentFile = file2.getParentFile();
            parentFile.getClass();
            File fileM19139 = C6876.m19139(parentFile, this.f20941, c6876.f10209, j);
            if (file2.renameTo(fileM19139)) {
                file = fileM19139;
            } else {
                C1896.m6517("Failed to rename " + file2 + " to " + fileM19139);
                file = file2;
            }
        } else {
            file = file2;
        }
        C20782.m47568(c6876.f10210);
        C6876 c6877 = new C6876(c6876.f10208, c6876.f10209, c6876.f10206, j, file);
        treeSet.add(c6877);
        return c6877;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m17731() {
        return this.f20938.isEmpty();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m17729(C3147 c3147) {
        if (!this.f20938.remove(c3147)) {
            return false;
        }
        File file = c3147.f10207;
        if (file == null) {
            return true;
        }
        file.delete();
        return true;
    }

    public final int hashCode() {
        return this.f20940.hashCode() + C12351.m30817(this.f20941 * 31, 31, this.f20939);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C6131.class == obj.getClass()) {
            C6131 c6131 = (C6131) obj;
            if (this.f20941 == c6131.f20941 && this.f20939.equals(c6131.f20939) && this.f20938.equals(c6131.f20938) && this.f20940.equals(c6131.f20940)) {
                return true;
            }
        }
        return false;
    }
}
