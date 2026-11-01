package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.֡᩸ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17JK */
/* JADX INFO: loaded from: classes2.dex */
public final class C0682 implements InterfaceC21850 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC20439 f2847;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f2848;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f2850;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String f2851;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long f2852;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f2854;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Map f2855;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C16916 f2856;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public IOException f2857;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public long f2849 = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f2853 = false;

    @Override // l.InterfaceC21850
    /* JADX INFO: renamed from: ֨ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean mo3051() {
        return false;
    }

    @Override // l.InterfaceC21850
    /* JADX INFO: renamed from: ۙۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ FileChannel mo3055() {
        return null;
    }

    @Override // l.InterfaceC21850
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21850 mo3058(long j, long j2) {
        return new C4210(mo3060(), j, j2);
    }

    @Override // l.InterfaceC21850
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21850 mo3056(long j, long j2) {
        return new C4210(this, j, j2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0682 m3047(String str, long[] jArr, InterfaceC20439 interfaceC20439) {
        return new C0682(str, true, -1L, jArr, interfaceC20439);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0682 m3046(String str, long j, InterfaceC20439 interfaceC20439) {
        return new C0682(str, false, j, null, interfaceC20439);
    }

    public C0682(String str, boolean z, long j, long[] jArr, InterfaceC20439 interfaceC20439) {
        this.f2848 = 0L;
        C16916 c16916 = new C16916();
        this.f2856 = c16916;
        this.f2854 = 0;
        if (str == null) {
            throw new IllegalArgumentException("name cannot be null");
        }
        if (!z && j <= 0) {
            throw new IllegalArgumentException(C15489.m37074(j, "splitSize must be positive: "));
        }
        if (interfaceC20439 == null) {
            throw new IllegalArgumentException("factory cannot be null");
        }
        this.f2851 = str;
        this.f2850 = z;
        this.f2852 = z ? -1L : j;
        this.f2847 = interfaceC20439;
        if (jArr != null) {
            long j2 = 0;
            for (long j3 : jArr) {
                if (j3 < 0) {
                    throw new IllegalArgumentException(C15489.m37074(j3, "Negative length: "));
                }
                j2 += j3;
                this.f2856.add(j2);
            }
            this.f2848 = j2;
        } else {
            c16916.add(0L);
        }
        this.f2855 = new C16206(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3054(int i, InterfaceC21850 interfaceC21850) {
        C16916 c16916 = this.f2856;
        if (i < 0 || i >= c16916.size()) {
            StringBuilder sbM40153 = C17214.m40153(i, "index = ", ", size = ");
            sbM40153.append(c16916.size());
            throw new IndexOutOfBoundsException(sbM40153.toString());
        }
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = (HashMap) this.f2855;
        if (map.containsKey(numValueOf)) {
            throw new IllegalStateException();
        }
        if (interfaceC21850.isClosed()) {
            throw new IllegalArgumentException("Data is closed");
        }
        map.put(numValueOf, interfaceC21850);
    }

    @Override // l.InterfaceC21850
    public final void seek(long j) throws IOException {
        if (this.f2853) {
            throw new IOException("Closed");
        }
        if (j < 0) {
            throw new IOException(C15489.m37074(j, "Negative position: "));
        }
        if (j <= this.f2848) {
            this.f2849 = j;
        } else {
            StringBuilder sbM39970 = C17114.m39970("Cannot seek beyond total length: ", " > ", j);
            sbM39970.append(this.f2848);
            throw new IOException(sbM39970.toString());
        }
    }

    @Override // l.InterfaceC21850
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f2853) {
            throw new IOException("Closed");
        }
        if (bArr == null) {
            throw new NullPointerException("data is null");
        }
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = 0;
        if (i2 == 0) {
            return 0;
        }
        long j = this.f2849;
        long j2 = this.f2848;
        if (j == j2) {
            return -1;
        }
        if (j > j2) {
            StringBuilder sb = new StringBuilder("Invalid position: ");
            sb.append(this.f2849);
            sb.append(" (exceeds length ");
            throw new IOException(C15037.m36023(sb, this.f2848, MotionUtils.EASING_TYPE_FORMAT_END));
        }
        int iMin = (int) Math.min(i2, j2 - j);
        int iM3050 = m3050(this.f2849);
        int size = this.f2856.size();
        while (i3 < iMin) {
            long jM3057 = m3057(iM3050);
            long jM3052 = m3052(iM3050) - this.f2849;
            if (jM3052 == 0) {
                iM3050++;
                if (iM3050 >= size) {
                    break;
                }
                this.f2854 = iM3050;
            } else {
                int iMin2 = (int) Math.min(iMin - i3, jM3052);
                InterfaceC21850 interfaceC21850M3049 = m3049(iM3050);
                interfaceC21850M3049.seek(this.f2849 - jM3057);
                int i4 = interfaceC21850M3049.read(bArr, i, iMin2);
                if (i4 <= 0) {
                    break;
                }
                i3 += i4;
                i += i4;
                this.f2849 += (long) i4;
                if (i4 != iMin2) {
                    continue;
                } else {
                    iM3050++;
                    if (iM3050 >= size) {
                        break;
                    }
                    this.f2854 = iM3050;
                }
            }
        }
        if (i3 > 0) {
            return i3;
        }
        return -1;
    }

    @Override // l.InterfaceC21850
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if (this.f2853) {
            throw new IOException("Closed");
        }
        if (this.f2850) {
            throw new IOException("Read only");
        }
        if (bArr == null) {
            throw new NullPointerException("data is null");
        }
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return;
        }
        int iM3050 = m3050(this.f2849);
        while (true) {
            long jM3057 = m3057(iM3050);
            long jM3052 = m3052(iM3050);
            long j = this.f2849 - jM3057;
            long j2 = jM3052 - jM3057;
            C16916 c16916 = this.f2856;
            if (iM3050 == c16916.size() - 1) {
                long j3 = this.f2852;
                if (j2 < j3) {
                    j2 = j3;
                }
            }
            int iMin = (int) Math.min(i2, j2 - j);
            if (iMin <= 0) {
                iM3050++;
                if (iM3050 == c16916.size()) {
                    long j4 = this.f2849;
                    if (j4 != this.f2848) {
                        throw new IllegalStateException();
                    }
                    c16916.add(j4);
                }
                this.f2854 = iM3050;
            } else {
                InterfaceC21850 interfaceC21850M3049 = m3049(iM3050);
                interfaceC21850M3049.seek(j);
                interfaceC21850M3049.write(bArr, i, iMin);
                long j5 = this.f2849 + ((long) iMin);
                this.f2849 = j5;
                i += iMin;
                i2 -= iMin;
                if (j5 > this.f2848) {
                    this.f2848 = j5;
                    if (iM3050 != c16916.size() - 1) {
                        throw new IllegalStateException("???");
                    }
                    c16916.set(iM3050, this.f2849);
                }
                if (i2 <= 0) {
                    return;
                }
                iM3050++;
                if (iM3050 == c16916.size()) {
                    long j6 = this.f2849;
                    if (j6 != this.f2848) {
                        throw new IllegalStateException();
                    }
                    c16916.add(j6);
                }
                this.f2854 = iM3050;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3053() throws IOException {
        if (this.f2853) {
            throw new IOException("Closed");
        }
        if (this.f2849 != this.f2848) {
            throw new IOException("Can only break at the end: pos=" + this.f2849 + ", totalLength=" + this.f2848);
        }
        C16916 c16916 = this.f2856;
        int size = c16916.size();
        int i = size - 1;
        if (i < 0 || i >= c16916.size()) {
            StringBuilder sbM40153 = C17214.m40153(i, "Fragment index out of bounds: index = ", ", size = ");
            sbM40153.append(c16916.size());
            throw new IndexOutOfBoundsException(sbM40153.toString());
        }
        if ((i == 0 ? c16916.getLong(0) : c16916.getLong(i) - c16916.getLong(size - 2)) == 0) {
            return;
        }
        c16916.add(this.f2849);
        this.f2854 = c16916.size() - 1;
    }

    @Override // l.InterfaceC21850
    public final long length() throws IOException {
        if (this.f2853) {
            throw new IOException("Closed");
        }
        return this.f2848;
    }

    @Override // l.InterfaceC21850
    public final void setLength(long j) throws IOException {
        if (this.f2853) {
            throw new IOException("Closed");
        }
        if (this.f2850) {
            throw new IOException("Read only");
        }
        if (j < 0) {
            throw new IOException(C15489.m37074(j, "Negative length: "));
        }
        long j2 = this.f2848;
        if (j == j2) {
            return;
        }
        C16916 c16916 = this.f2856;
        if (j < j2) {
            int i = 0;
            while (true) {
                if (i >= c16916.size()) {
                    i = -1;
                    break;
                } else if (j <= c16916.getLong(i)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                throw new IllegalStateException(C15489.m37074(j, "Cannot find fragment for new length: "));
            }
            m3049(i).setLength(j - m3057(i));
            c16916.set(i, j);
            int size = c16916.size();
            while (true) {
                size--;
                if (size <= i) {
                    break;
                }
                Integer numValueOf = Integer.valueOf(size);
                Map map = this.f2855;
                InterfaceC21850 interfaceC21850 = (InterfaceC21850) ((LinkedHashMap) map).get(numValueOf);
                if (interfaceC21850 != null) {
                    interfaceC21850.setLength(0L);
                    ((HashMap) map).remove(numValueOf);
                    interfaceC21850.close();
                } else {
                    try {
                        InterfaceC21850 interfaceC21850Mo23828 = this.f2847.mo23828(size);
                        if (interfaceC21850Mo23828 != null) {
                            interfaceC21850Mo23828.setLength(0L);
                            interfaceC21850Mo23828.close();
                        }
                    } catch (IOException unused) {
                    }
                }
                c16916.mo27941(size);
            }
            if (this.f2854 > i) {
                this.f2854 = i;
            }
        } else {
            long j3 = j - j2;
            int size2 = c16916.size() - 1;
            long jM3057 = m3057(size2);
            long jM3052 = m3052(size2);
            long j4 = jM3052 - jM3057;
            long j5 = this.f2852;
            long j6 = j5 - j4;
            if (j3 <= j6) {
                m3049(size2).setLength(j4 + j3);
                c16916.set(size2, j);
            } else {
                if (j6 > 0) {
                    m3049(size2).setLength(j5);
                    c16916.set(size2, jM3052 + j6);
                    j3 -= j6;
                }
                while (j3 > 0) {
                    long j7 = c16916.getLong(c16916.size() - 1);
                    long jMin = Math.min(j3, j5);
                    c16916.add(j7 + jMin);
                    m3049(c16916.size() - 1).setLength(jMin);
                    j3 -= jMin;
                }
            }
        }
        this.f2848 = j;
        if (this.f2849 > j) {
            this.f2849 = j;
        }
    }

    @Override // l.InterfaceC21850
    public final long position() throws IOException {
        if (this.f2853) {
            throw new IOException("Closed");
        }
        return this.f2849;
    }

    @Override // l.InterfaceC21850
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void mo3059() throws IOException {
        if (this.f2853) {
            throw new IOException("Closed");
        }
        Iterator it = ((LinkedHashMap) this.f2855).values().iterator();
        while (it.hasNext()) {
            ((InterfaceC21850) it.next()).mo3059();
        }
    }

    @Override // l.InterfaceC21850
    public final String getName() {
        return this.f2851;
    }

    @Override // l.InterfaceC21850
    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final InterfaceC21850 mo3060() throws IOException {
        if (!this.f2850) {
            throw new IOException("Unsupported");
        }
        C0682 c0682 = new C0682(this.f2851, true, -1L, null, this.f2847);
        C16916 c16916 = c0682.f2856;
        c16916.clear();
        c16916.mo27940(c16916.size(), (InterfaceC21750) this.f2856);
        c0682.f2848 = this.f2848;
        return c0682;
    }

    @Override // l.InterfaceC21850
    public final boolean isClosed() {
        return this.f2853;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f2853) {
            return;
        }
        this.f2853 = true;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f2855;
        Iterator it = linkedHashMap.values().iterator();
        IOException iOException = null;
        while (it.hasNext()) {
            try {
                ((InterfaceC21850) it.next()).close();
            } catch (IOException e) {
                if (iOException == null) {
                    iOException = e;
                } else {
                    iOException.addSuppressed(e);
                }
            }
        }
        linkedHashMap.clear();
        if (iOException != null) {
            throw iOException;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private int m3050(long j) {
        int i = this.f2854;
        C16916 c16916 = this.f2856;
        int size = c16916.size();
        if (i >= 0 && i < size) {
            long jM3057 = m3057(i);
            long jM3052 = m3052(i);
            if (jM3057 <= j && j < jM3052) {
                return i;
            }
            int i2 = i + 1;
            if (i2 < size) {
                long jM3058 = m3057(i2);
                long jM3053 = m3052(i2);
                if (jM3058 <= j && j < jM3053) {
                    this.f2854 = i2;
                    return i2;
                }
            }
        }
        for (int i3 = 0; i3 < size; i3++) {
            if (j < c16916.getLong(i3)) {
                this.f2854 = i3;
                return i3;
            }
        }
        int i4 = size - 1;
        this.f2854 = i4;
        return i4;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long m3057(int i) {
        C16916 c16916 = this.f2856;
        if (i < 0 || i >= c16916.size()) {
            StringBuilder sbM40153 = C17214.m40153(i, "Fragment index out of bounds: index = ", ", size = ");
            sbM40153.append(c16916.size());
            throw new IndexOutOfBoundsException(sbM40153.toString());
        }
        if (i == 0) {
            return 0L;
        }
        return c16916.getLong(i - 1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m3052(int i) {
        C16916 c16916 = this.f2856;
        if (i >= 0 && i < c16916.size()) {
            return c16916.getLong(i);
        }
        StringBuilder sbM40153 = C17214.m40153(i, "Fragment index out of bounds: index = ", ", size = ");
        sbM40153.append(c16916.size());
        throw new IndexOutOfBoundsException(sbM40153.toString());
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private InterfaceC21850 m3049(int i) throws IOException {
        Integer numValueOf = Integer.valueOf(i);
        Map map = this.f2855;
        InterfaceC21850 interfaceC21850 = (InterfaceC21850) ((LinkedHashMap) map).get(numValueOf);
        if (interfaceC21850 != null) {
            return interfaceC21850;
        }
        if (this.f2853) {
            throw new IOException("Closed");
        }
        InterfaceC21850 interfaceC21850Mo23828 = this.f2847.mo23828(i);
        if (interfaceC21850Mo23828 == null) {
            throw new IOException(C8479.m22141(i, "Failed to create fragment at index: "));
        }
        ((HashMap) map).put(Integer.valueOf(i), interfaceC21850Mo23828);
        IOException iOException = this.f2857;
        if (iOException == null) {
            return interfaceC21850Mo23828;
        }
        this.f2857 = null;
        throw iOException;
    }
}
