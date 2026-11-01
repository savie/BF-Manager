package l;

import com.google.android.material.motion.MotionUtils;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۟ۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: V8EI */
/* JADX INFO: loaded from: classes4.dex */
public final class C7226 extends AbstractC7932 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f24058;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f24059;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final byte[] f24060;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f24061;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f24062;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final byte[] f24063;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f24064;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1581 f24065;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C10049 f24066;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public boolean f24067;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public HashMap f24068;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f24069;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f24070;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f24071;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
    }

    public C7226(InputStream inputStream, int i, String str) {
        super(inputStream, str);
        this.f24060 = new byte[256];
        this.f24068 = new HashMap();
        this.f24059 = new ArrayList();
        this.f24065 = AbstractC9344.m23995(str);
        this.f24063 = new byte[512];
        this.f24069 = i;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m19247() {
        this.f24067 = true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        if (isDirectory()) {
            return 0;
        }
        long jM25417 = this.f24066.m25417() - this.f24064;
        if (jM25417 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) jM25417;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m19243() throws IOException {
        this.f24070 = -1;
        this.f24061 = new ArrayList();
        List<C16399> listM25434 = this.f24066.m25434();
        C0170 c0170 = new C0170();
        long jM38605 = 0;
        for (C16399 c16399 : listM25434) {
            long jM38606 = c16399.m38605() - jM38605;
            if (jM38606 < 0) {
                throw new IOException("Corrupted struct sparse detected");
            }
            if (jM38606 > 0) {
                this.f24061.add(new C13660(c16399.m38605() - jM38605, c0170));
            }
            if (c16399.m38604() > 0) {
                this.f24061.add(new C13660(c16399.m38604(), ((FilterInputStream) this).in));
            }
            jM38605 = c16399.m38605() + c16399.m38604();
        }
        if (this.f24061.isEmpty()) {
            return;
        }
        this.f24070 = 0;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ArrayList arrayList = this.f24061;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InputStream) it.next()).close();
            }
        }
        ((FilterInputStream) this).in.close();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C10049 m19246() {
        return this.f24066;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final byte[] m19245() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            byte[] bArr = this.f24060;
            int i = read(bArr);
            if (i < 0) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
        m19248();
        if (this.f24066 == null) {
            return null;
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        while (length > 0 && byteArray[length - 1] == 0) {
            length--;
        }
        return length != byteArray.length ? Arrays.copyOf(byteArray, length) : byteArray;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private byte[] m19241() throws IOException {
        boolean z;
        byte[] bArrM19244 = m19244();
        boolean z2 = false;
        if (bArrM19244 == null) {
            z = true;
            break;
        }
        int length = this.f24063.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = true;
                break;
            }
            if (bArrM19244[i] != 0) {
                z = false;
                break;
            }
            i++;
        }
        this.f24058 = z;
        if (!z || bArrM19244 == null) {
            return bArrM19244;
        }
        this.f24062 = true;
        boolean zMarkSupported = ((FilterInputStream) this).in.markSupported();
        if (zMarkSupported) {
            ((FilterInputStream) this).in.mark(this.f24063.length);
        }
        try {
            byte[] bArrM19245 = m19244();
            if (bArrM19245 == null) {
                z2 = true;
                break;
            }
            int length2 = this.f24063.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    z2 = true;
                    break;
                }
                if (bArrM19245[i2] != 0) {
                    break;
                }
                i2++;
            }
            if (!z2 && zMarkSupported) {
                m20946(this.f24063.length);
                ((FilterInputStream) this).in.reset();
            }
            long jM20947 = m20947() % ((long) this.f24069);
            if (jM20947 <= 0) {
                return null;
            }
            m20949(C20010.m45294(((long) this.f24069) - jM20947, ((FilterInputStream) this).in));
            return null;
        } catch (Throwable th) {
            if (zMarkSupported) {
                m20946(this.f24063.length);
                ((FilterInputStream) this).in.reset();
            }
            throw th;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int iM19240;
        if (i2 == 0) {
            return 0;
        }
        if (!this.f24058 && !isDirectory()) {
            C10049 c10049 = this.f24066;
            if (c10049 == null) {
                throw new IllegalStateException("No current tar entry");
            }
            if (this.f24064 < c10049.m25417()) {
                int iMin = Math.min(i2, available());
                if (this.f24066.m25428()) {
                    iM19240 = m19240(i, iMin, bArr);
                } else {
                    iM19240 = ((FilterInputStream) this).in.read(bArr, i, iMin);
                }
                if (iM19240 != -1) {
                    m20948(iM19240);
                    this.f24064 += (long) iM19240;
                    return iM19240;
                }
                if (iMin > 0) {
                    throw new IOException("Truncated TAR archive");
                }
                this.f24058 = true;
                return iM19240;
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0197 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:66:0x012c  */
    /* JADX WARN: Code duplicated, block: B:69:0x0140  */
    /* JADX WARN: Code duplicated, block: B:73:0x014e A[Catch: NumberFormatException -> 0x01ad, TryCatch #1 {NumberFormatException -> 0x01ad, blocks: (B:71:0x0146, B:73:0x014e, B:74:0x0152, B:76:0x015a), top: B:99:0x0146 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0152 A[Catch: NumberFormatException -> 0x01ad, TryCatch #1 {NumberFormatException -> 0x01ad, blocks: (B:71:0x0146, B:73:0x014e, B:74:0x0152, B:76:0x015a), top: B:99:0x0146 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x015a A[Catch: NumberFormatException -> 0x01ad, TRY_LEAVE, TryCatch #1 {NumberFormatException -> 0x01ad, blocks: (B:71:0x0146, B:73:0x014e, B:74:0x0152, B:76:0x015a), top: B:99:0x0146 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0170  */
    /* JADX WARN: Code duplicated, block: B:81:0x0178 A[LOOP:0: B:81:0x0178->B:102:?, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:83:0x017e  */
    @Deprecated
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C10049 m19248() throws IOException {
        byte[] bArrM19241;
        C19927 c19927;
        byte[] bArrM19245;
        String strMo5388;
        if (!this.f24058) {
            if (this.f24066 != null) {
                C20010.m45294(C17492.FOREVER_NS, this);
                if (!isDirectory()) {
                    long j = this.f24071;
                    if (j > 0 && j % ((long) this.f24063.length) != 0) {
                        long jAvailable = ((FilterInputStream) this).in.available();
                        long j2 = this.f24071;
                        byte[] bArr = this.f24063;
                        long length = (((j2 / ((long) bArr.length)) + 1) * ((long) bArr.length)) - j2;
                        long jM45294 = C20010.m45294(length, ((FilterInputStream) this).in);
                        if (((FilterInputStream) this).in instanceof FileInputStream) {
                            jM45294 = Math.min(jM45294, jAvailable);
                        }
                        if (jM45294 != length) {
                            throw new IOException("Truncated TAR archive");
                        }
                        m20949(jM45294);
                    }
                }
            }
            byte[] bArrM19242 = m19241();
            if (bArrM19242 == null) {
                if (this.f24067 && !this.f24062) {
                    throw new IOException("Missing TAR end marker");
                }
                this.f24066 = null;
                return null;
            }
            try {
                C10049 c10049 = new C10049(this.f24068, bArrM19242, this.f24065);
                this.f24066 = c10049;
                if (this.f24067 && !c10049.m25437()) {
                    throw new IOException("Invalid TAR header checksum (" + this.f24066.m25433() + MotionUtils.EASING_TYPE_FORMAT_END);
                }
                this.f24064 = 0L;
                this.f24071 = this.f24066.m25435();
                if (this.f24066.m25431()) {
                    byte[] bArrM19246 = m19245();
                    if (bArrM19246 == null) {
                        if (this.f24067) {
                            throw new IOException("Missing TAR entry after GNU long link header");
                        }
                    } else {
                        this.f24066.m25427(this.f24065.mo5388(0, bArrM19246.length, bArrM19246));
                        if (this.f24066.m25423()) {
                            bArrM19245 = m19245();
                            if (bArrM19245 == null) {
                                if (this.f24067) {
                                    throw new IOException("Missing TAR entry after GNU long name header");
                                }
                            } else {
                                strMo5388 = this.f24065.mo5388(0, bArrM19245.length, bArrM19245);
                                this.f24066.m25422(strMo5388);
                                if (this.f24066.m25430()) {
                                    this.f24066.m25422(strMo5388.concat("/"));
                                }
                            }
                        }
                        if (this.f24066.m25432()) {
                            this.f24068 = C23455.m51695(this, this.f24059, this.f24068, this.f24071);
                            m19248();
                            if (this.f24066 == null) {
                                throw new IOException("Error detected parsing the pax header");
                            }
                        }
                        if (this.f24066.m25441()) {
                            m19242();
                        } else if (!this.f24068.isEmpty()) {
                            HashMap map = this.f24068;
                            ArrayList arrayList = this.f24059;
                            this.f24066.m25410(map);
                            this.f24066.m25409(arrayList);
                        }
                        if (this.f24066.m25414()) {
                            if (this.f24066.m25436()) {
                                do {
                                    bArrM19241 = m19241();
                                    if (bArrM19241 != null) {
                                        throw new IOException("premature end of tar archive. Didn't find extended_header after header with extended flag.");
                                    }
                                    c19927 = new C19927(bArrM19241);
                                    this.f24066.m25418().addAll(c19927.m45220());
                                } while (c19927.m45221());
                            }
                            m19243();
                        }
                        this.f24071 = this.f24066.m25435();
                        return this.f24066;
                    }
                } else {
                    if (this.f24066.m25423()) {
                        bArrM19245 = m19245();
                        if (bArrM19245 == null) {
                            if (this.f24067) {
                                throw new IOException("Missing TAR entry after GNU long name header");
                            }
                        } else {
                            strMo5388 = this.f24065.mo5388(0, bArrM19245.length, bArrM19245);
                            this.f24066.m25422(strMo5388);
                            if (this.f24066.m25430() && !strMo5388.endsWith("/")) {
                                this.f24066.m25422(strMo5388.concat("/"));
                            }
                        }
                    }
                    if (this.f24066.m25432()) {
                        this.f24068 = C23455.m51695(this, this.f24059, this.f24068, this.f24071);
                        m19248();
                        if (this.f24066 == null) {
                            throw new IOException("Error detected parsing the pax header");
                        }
                    }
                    try {
                        if (this.f24066.m25441()) {
                            m19242();
                        } else if (!this.f24068.isEmpty()) {
                            HashMap map2 = this.f24068;
                            ArrayList arrayList2 = this.f24059;
                            this.f24066.m25410(map2);
                            this.f24066.m25409(arrayList2);
                        }
                        if (this.f24066.m25414()) {
                            if (this.f24066.m25436()) {
                                do {
                                    bArrM19241 = m19241();
                                    if (bArrM19241 != null) {
                                        throw new IOException("premature end of tar archive. Didn't find extended_header after header with extended flag.");
                                    }
                                    c19927 = new C19927(bArrM19241);
                                    this.f24066.m25418().addAll(c19927.m45220());
                                } while (c19927.m45221());
                            }
                            m19243();
                        }
                        this.f24071 = this.f24066.m25435();
                        return this.f24066;
                    } catch (NumberFormatException e) {
                        throw new IOException("Error detected parsing the pax header", e);
                    }
                }
            } catch (IllegalArgumentException e2) {
                throw new IOException("Error detected parsing the header", e2);
            }
        }
        return null;
    }

    private boolean isDirectory() {
        C10049 c10049 = this.f24066;
        return c10049 != null && c10049.m25430();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m19242() throws IOException {
        ArrayList arrayList = new ArrayList();
        HashMap mapM51695 = C23455.m51695(this, arrayList, this.f24068, this.f24071);
        if (mapM51695.containsKey("GNU.sparse.map")) {
            arrayList = new ArrayList(C23455.m51696((String) mapM51695.get("GNU.sparse.map")));
        }
        m19248();
        C10049 c10049 = this.f24066;
        if (c10049 != null) {
            c10049.m25410(mapM51695);
            this.f24066.m25409(arrayList);
            if (this.f24066.m25420()) {
                this.f24066.m25409(C23455.m51694(((FilterInputStream) this).in, this.f24063.length));
            }
            m19243();
            return;
        }
        throw new IOException("premature end of tar archive. Didn't find any entry after PAX header.");
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final byte[] m19244() throws IOException {
        InputStream inputStream = ((FilterInputStream) this).in;
        byte[] bArr = this.f24063;
        int length = bArr.length;
        if (length < 0 || length > bArr.length || length < 0) {
            throw new IndexOutOfBoundsException();
        }
        int iM45293 = C20010.m45293(inputStream, bArr, length);
        m20948(iM45293);
        byte[] bArr2 = this.f24063;
        if (iM45293 == bArr2.length) {
            return bArr2;
        }
        if (!this.f24067) {
            return null;
        }
        if (iM45293 > 0 || m20947() == 0) {
            throw new IOException("Truncated TAR archive");
        }
        return null;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private int m19240(int i, int i2, byte[] bArr) throws IOException {
        ArrayList arrayList = this.f24061;
        if (arrayList == null || arrayList.isEmpty()) {
            return ((FilterInputStream) this).in.read(bArr, i, i2);
        }
        if (this.f24070 >= this.f24061.size()) {
            return -1;
        }
        int i3 = ((InputStream) this.f24061.get(this.f24070)).read(bArr, i, i2);
        if (this.f24070 == this.f24061.size() - 1) {
            return i3;
        }
        if (i3 == -1) {
            this.f24070++;
            return m19240(i, i2, bArr);
        }
        if (i3 >= i2) {
            return i3;
        }
        this.f24070++;
        int iM19240 = m19240(i + i3, i2 - i3, bArr);
        return iM19240 == -1 ? i3 : i3 + iM19240;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jSkip = 0;
        if (j > 0 && !isDirectory()) {
            long jAvailable = ((FilterInputStream) this).in.available();
            long jMin = Math.min(j, this.f24066.m25417() - this.f24064);
            if (!this.f24066.m25428()) {
                jSkip = C20010.m45294(jMin, ((FilterInputStream) this).in);
                if (((FilterInputStream) this).in instanceof FileInputStream) {
                    jSkip = Math.min(jSkip, jAvailable);
                }
                if (jSkip != jMin) {
                    throw new IOException("Truncated TAR archive");
                }
            } else {
                ArrayList arrayList = this.f24061;
                if (arrayList == null || arrayList.isEmpty()) {
                    jSkip = ((FilterInputStream) this).in.skip(jMin);
                } else {
                    while (jSkip < jMin && this.f24070 < this.f24061.size()) {
                        jSkip += ((InputStream) this.f24061.get(this.f24070)).skip(jMin - jSkip);
                        if (jSkip < jMin) {
                            this.f24070++;
                        }
                    }
                }
            }
            m20949(jSkip);
            this.f24064 += jSkip;
        }
        return jSkip;
    }
}
