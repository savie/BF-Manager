package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.᩵ܽۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17JK */
/* JADX INFO: loaded from: classes5.dex */
public final class C20697 implements InterfaceC15475 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f66328;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean f66329;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long f66330;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final String f66331;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public long f66332;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public IOException f66333;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f66334 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f66335 = false;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3543 f66336;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Map f66337;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C21982 f66338;

    @Override // l.InterfaceC15475
    /* JADX INFO: renamed from: ۙۤ */
    public final /* synthetic */ FileChannel mo7066() {
        return null;
    }

    @Override // l.InterfaceC15475
    /* JADX INFO: renamed from: ۚۤ */
    public final /* synthetic */ boolean mo7067() {
        return false;
    }

    @Override // l.InterfaceC15475
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC15475 mo7070(long j, long j2) {
        return new C22189(mo7071(), j, j2);
    }

    @Override // l.InterfaceC15475
    /* JADX INFO: renamed from: ۤ */
    public final InterfaceC15475 mo7068(long j, long j2) {
        return new C22189(this, j, j2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20697 m47332(String str, long[] jArr, InterfaceC3543 interfaceC3543) {
        return new C20697(str, true, -1L, jArr, interfaceC3543);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20697 m47331(String str, long j, InterfaceC3543 interfaceC3543) {
        return new C20697(str, false, j, null, interfaceC3543);
    }

    public C20697(String str, boolean z, long j, long[] jArr, InterfaceC3543 interfaceC3543) {
        this.f66332 = 0L;
        C21982 c21982 = new C21982();
        this.f66338 = c21982;
        this.f66328 = 0;
        if (str == null) {
            throw new IllegalArgumentException("name cannot be null");
        }
        if (!z && j <= 0) {
            throw new IllegalArgumentException(C24770.m55292(j, "splitSize must be positive: "));
        }
        if (interfaceC3543 == null) {
            throw new IllegalArgumentException("factory cannot be null");
        }
        this.f66331 = str;
        this.f66329 = z;
        this.f66330 = z ? -1L : j;
        this.f66336 = interfaceC3543;
        if (jArr != null) {
            long j2 = 0;
            for (long j3 : jArr) {
                if (j3 < 0) {
                    throw new IllegalArgumentException(C24770.m55292(j3, "Negative length: "));
                }
                j2 += j3;
                this.f66338.add(j2);
            }
            this.f66332 = j2;
        } else {
            c21982.add(0L);
        }
        this.f66337 = new C23681(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47338(int i, InterfaceC15475 interfaceC15475) {
        C21982 c21982 = this.f66338;
        if (i < 0 || i >= c21982.size()) {
            StringBuilder sbM12235 = C3769.m12235(i, "index = ", ", size = ");
            sbM12235.append(c21982.size());
            throw new IndexOutOfBoundsException(sbM12235.toString());
        }
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = (HashMap) this.f66337;
        if (map.containsKey(numValueOf)) {
            throw new IllegalStateException();
        }
        if (interfaceC15475.isClosed()) {
            throw new IllegalArgumentException("Data is closed");
        }
        map.put(numValueOf, interfaceC15475);
    }

    @Override // l.InterfaceC15475
    public final void seek(long j) throws IOException {
        if (this.f66335) {
            throw new IOException("Closed");
        }
        if (j < 0) {
            throw new IOException(C24770.m55292(j, "Negative position: "));
        }
        if (j <= this.f66332) {
            this.f66334 = j;
        } else {
            StringBuilder sbM8289 = C2458.m8289("Cannot seek beyond total length: ", " > ", j);
            sbM8289.append(this.f66332);
            throw new IOException(sbM8289.toString());
        }
    }

    @Override // l.InterfaceC15475
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f66335) {
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
        long j = this.f66334;
        long j2 = this.f66332;
        if (j == j2) {
            return -1;
        }
        if (j > j2) {
            StringBuilder sb = new StringBuilder("Invalid position: ");
            sb.append(this.f66334);
            sb.append(" (exceeds length ");
            throw new IOException(C2764.m9137(sb, this.f66332, MotionUtils.EASING_TYPE_FORMAT_END));
        }
        int iMin = (int) Math.min(i2, j2 - j);
        int iM47335 = m47335(this.f66334);
        int size = this.f66338.size();
        while (i3 < iMin) {
            long jM47339 = m47339(iM47335);
            long jM47336 = m47336(iM47335) - this.f66334;
            if (jM47336 == 0) {
                iM47335++;
                if (iM47335 >= size) {
                    break;
                }
                this.f66328 = iM47335;
            } else {
                int iMin2 = (int) Math.min(iMin - i3, jM47336);
                InterfaceC15475 interfaceC15475M47334 = m47334(iM47335);
                interfaceC15475M47334.seek(this.f66334 - jM47339);
                int i4 = interfaceC15475M47334.read(bArr, i, iMin2);
                if (i4 <= 0) {
                    break;
                }
                i3 += i4;
                i += i4;
                this.f66334 += (long) i4;
                if (i4 != iMin2) {
                    continue;
                } else {
                    iM47335++;
                    if (iM47335 >= size) {
                        break;
                    }
                    this.f66328 = iM47335;
                }
            }
        }
        if (i3 > 0) {
            return i3;
        }
        return -1;
    }

    @Override // l.InterfaceC15475
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if (this.f66335) {
            throw new IOException("Closed");
        }
        if (this.f66329) {
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
        int iM47335 = m47335(this.f66334);
        while (true) {
            long jM47339 = m47339(iM47335);
            long jM47336 = m47336(iM47335);
            long j = this.f66334 - jM47339;
            long j2 = jM47336 - jM47339;
            C21982 c21982 = this.f66338;
            if (iM47335 == c21982.size() - 1) {
                long j3 = this.f66330;
                if (j2 < j3) {
                    j2 = j3;
                }
            }
            int iMin = (int) Math.min(i2, j2 - j);
            if (iMin <= 0) {
                iM47335++;
                if (iM47335 == c21982.size()) {
                    long j4 = this.f66334;
                    if (j4 != this.f66332) {
                        throw new IllegalStateException();
                    }
                    c21982.add(j4);
                }
                this.f66328 = iM47335;
            } else {
                InterfaceC15475 interfaceC15475M47334 = m47334(iM47335);
                interfaceC15475M47334.seek(j);
                interfaceC15475M47334.write(bArr, i, iMin);
                long j5 = this.f66334 + ((long) iMin);
                this.f66334 = j5;
                i += iMin;
                i2 -= iMin;
                if (j5 > this.f66332) {
                    this.f66332 = j5;
                    if (iM47335 != c21982.size() - 1) {
                        throw new IllegalStateException("???");
                    }
                    c21982.set(iM47335, this.f66334);
                }
                if (i2 <= 0) {
                    return;
                }
                iM47335++;
                if (iM47335 == c21982.size()) {
                    long j6 = this.f66334;
                    if (j6 != this.f66332) {
                        throw new IllegalStateException();
                    }
                    c21982.add(j6);
                }
                this.f66328 = iM47335;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47337() {
        if (this.f66335) {
            throw new IOException("Closed");
        }
        if (this.f66334 != this.f66332) {
            throw new IOException("Can only break at the end: pos=" + this.f66334 + ", totalLength=" + this.f66332);
        }
        C21982 c21982 = this.f66338;
        int size = c21982.size();
        int i = size - 1;
        if (i < 0 || i >= c21982.size()) {
            StringBuilder sbM12235 = C3769.m12235(i, "Fragment index out of bounds: index = ", ", size = ");
            sbM12235.append(c21982.size());
            throw new IndexOutOfBoundsException(sbM12235.toString());
        }
        if ((i == 0 ? c21982.getLong(0) : c21982.getLong(i) - c21982.getLong(size - 2)) == 0) {
            return;
        }
        c21982.add(this.f66334);
        this.f66328 = c21982.size() - 1;
    }

    @Override // l.InterfaceC15475
    public final long length() throws IOException {
        if (this.f66335) {
            throw new IOException("Closed");
        }
        return this.f66332;
    }

    @Override // l.InterfaceC15475
    public final void setLength(long j) throws IOException {
        if (this.f66335) {
            throw new IOException("Closed");
        }
        if (this.f66329) {
            throw new IOException("Read only");
        }
        if (j < 0) {
            throw new IOException(C24770.m55292(j, "Negative length: "));
        }
        long j2 = this.f66332;
        if (j == j2) {
            return;
        }
        C21982 c21982 = this.f66338;
        if (j < j2) {
            int i = 0;
            while (true) {
                if (i >= c21982.size()) {
                    i = -1;
                    break;
                } else if (j <= c21982.getLong(i)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                throw new IllegalStateException(C24770.m55292(j, "Cannot find fragment for new length: "));
            }
            m47334(i).setLength(j - m47339(i));
            c21982.set(i, j);
            int size = c21982.size();
            while (true) {
                size--;
                if (size <= i) {
                    break;
                }
                Integer numValueOf = Integer.valueOf(size);
                Map map = this.f66337;
                InterfaceC15475 interfaceC15475 = (InterfaceC15475) ((LinkedHashMap) map).get(numValueOf);
                if (interfaceC15475 != null) {
                    interfaceC15475.setLength(0L);
                    ((HashMap) map).remove(numValueOf);
                    interfaceC15475.close();
                } else {
                    try {
                        InterfaceC15475 interfaceC15475Mo1860 = this.f66336.mo1860(size);
                        if (interfaceC15475Mo1860 != null) {
                            interfaceC15475Mo1860.setLength(0L);
                            interfaceC15475Mo1860.close();
                        }
                    } catch (IOException unused) {
                    }
                }
                c21982.mo37196(size);
            }
            if (this.f66328 > i) {
                this.f66328 = i;
            }
        } else {
            long j3 = j - j2;
            int size2 = c21982.size() - 1;
            long jM47339 = m47339(size2);
            long jM47336 = m47336(size2);
            long j4 = jM47336 - jM47339;
            long j5 = this.f66330;
            long j6 = j5 - j4;
            if (j3 <= j6) {
                m47334(size2).setLength(j4 + j3);
                c21982.set(size2, j);
            } else {
                if (j6 > 0) {
                    m47334(size2).setLength(j5);
                    c21982.set(size2, jM47336 + j6);
                    j3 -= j6;
                }
                while (j3 > 0) {
                    long j7 = c21982.getLong(c21982.size() - 1);
                    long jMin = Math.min(j3, j5);
                    c21982.add(j7 + jMin);
                    m47334(c21982.size() - 1).setLength(jMin);
                    j3 -= jMin;
                }
            }
        }
        this.f66332 = j;
        if (this.f66334 > j) {
            this.f66334 = j;
        }
    }

    @Override // l.InterfaceC15475
    public final long position() throws IOException {
        if (this.f66335) {
            throw new IOException("Closed");
        }
        return this.f66334;
    }

    @Override // l.InterfaceC15475
    /* JADX INFO: renamed from: ܺ */
    public final void mo7069() throws IOException {
        if (this.f66335) {
            throw new IOException("Closed");
        }
        Iterator it = ((LinkedHashMap) this.f66337).values().iterator();
        while (it.hasNext()) {
            ((InterfaceC15475) it.next()).mo7069();
        }
    }

    @Override // l.InterfaceC15475
    public final String getName() {
        return this.f66331;
    }

    @Override // l.InterfaceC15475
    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC15475 mo7071() throws IOException {
        if (!this.f66329) {
            throw new IOException("Unsupported");
        }
        C20697 c20697 = new C20697(this.f66331, true, -1L, null, this.f66336);
        C21982 c21982 = c20697.f66338;
        c21982.clear();
        c21982.mo37195(c21982.size(), (InterfaceC18252) this.f66338);
        c20697.f66332 = this.f66332;
        return c20697;
    }

    @Override // l.InterfaceC15475
    public final boolean isClosed() {
        return this.f66335;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f66335) {
            return;
        }
        this.f66335 = true;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f66337;
        Iterator it = linkedHashMap.values().iterator();
        IOException iOException = null;
        while (it.hasNext()) {
            try {
                ((InterfaceC15475) it.next()).close();
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

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private int m47335(long j) {
        int i = this.f66328;
        C21982 c21982 = this.f66338;
        int size = c21982.size();
        if (i >= 0 && i < size) {
            long jM47339 = m47339(i);
            long jM47336 = m47336(i);
            if (jM47339 <= j && j < jM47336) {
                return i;
            }
            int i2 = i + 1;
            if (i2 < size) {
                long jM473310 = m47339(i2);
                long jM47337 = m47336(i2);
                if (jM473310 <= j && j < jM47337) {
                    this.f66328 = i2;
                    return i2;
                }
            }
        }
        for (int i3 = 0; i3 < size; i3++) {
            if (j < c21982.getLong(i3)) {
                this.f66328 = i3;
                return i3;
            }
        }
        int i4 = size - 1;
        this.f66328 = i4;
        return i4;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m47339(int i) {
        C21982 c21982 = this.f66338;
        if (i < 0 || i >= c21982.size()) {
            StringBuilder sbM12235 = C3769.m12235(i, "Fragment index out of bounds: index = ", ", size = ");
            sbM12235.append(c21982.size());
            throw new IndexOutOfBoundsException(sbM12235.toString());
        }
        if (i == 0) {
            return 0L;
        }
        return c21982.getLong(i - 1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m47336(int i) {
        C21982 c21982 = this.f66338;
        if (i >= 0 && i < c21982.size()) {
            return c21982.getLong(i);
        }
        StringBuilder sbM12235 = C3769.m12235(i, "Fragment index out of bounds: index = ", ", size = ");
        sbM12235.append(c21982.size());
        throw new IndexOutOfBoundsException(sbM12235.toString());
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private InterfaceC15475 m47334(int i) throws IOException {
        Integer numValueOf = Integer.valueOf(i);
        Map map = this.f66337;
        InterfaceC15475 interfaceC15475 = (InterfaceC15475) ((LinkedHashMap) map).get(numValueOf);
        if (interfaceC15475 != null) {
            return interfaceC15475;
        }
        if (this.f66335) {
            throw new IOException("Closed");
        }
        InterfaceC15475 interfaceC15475Mo1860 = this.f66336.mo1860(i);
        if (interfaceC15475Mo1860 == null) {
            throw new IOException(C13645.m33382(i, "Failed to create fragment at index: "));
        }
        ((HashMap) map).put(Integer.valueOf(i), interfaceC15475Mo1860);
        IOException iOException = this.f66333;
        if (iOException == null) {
            return interfaceC15475Mo1860;
        }
        this.f66333 = null;
        throw iOException;
    }
}
