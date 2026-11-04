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

/* JADX INFO: renamed from: l.۬᩹ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: V8EI */
/* JADX INFO: loaded from: classes4.dex */
public final class C14161 extends AbstractC2975 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f44773;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long f44774;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public HashMap f44775;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f44776;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final byte[] f44777;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C7450 f44778;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final ArrayList f44779;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public long f44780;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f44781;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC24760 f44782;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final byte[] f44783;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f44784;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f44785;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public boolean f44786;

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

    public C14161(InputStream inputStream, int i, String str) {
        super(inputStream, str);
        this.f44783 = new byte[256];
        this.f44775 = new HashMap();
        this.f44779 = new ArrayList();
        this.f44782 = AbstractC16554.m39195(str);
        this.f44777 = new byte[512];
        this.f44773 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34394(boolean z) {
        this.f44786 = z;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        if (isDirectory()) {
            return 0;
        }
        long jM20449 = this.f44778.m20449() - this.f44774;
        if (jM20449 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) jM20449;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m34390() throws IOException {
        this.f44785 = -1;
        this.f44776 = new ArrayList();
        List<C19538> listM20419 = this.f44778.m20419();
        C22522 c22522 = new C22522();
        long jM45070 = 0;
        for (C19538 c19538 : listM20419) {
            long jM45071 = c19538.m45070() - jM45070;
            if (jM45071 < 0) {
                throw new IOException("Corrupted struct sparse detected");
            }
            if (jM45071 > 0) {
                this.f44776.add(new C23268(c19538.m45070() - jM45070, c22522));
            }
            if (c19538.m45069() > 0) {
                this.f44776.add(new C23268(c19538.m45069(), ((FilterInputStream) this).in));
            }
            jM45070 = c19538.m45070() + c19538.m45069();
        }
        if (this.f44776.isEmpty()) {
            return;
        }
        this.f44785 = 0;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ArrayList arrayList = this.f44776;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InputStream) it.next()).close();
            }
        }
        ((FilterInputStream) this).in.close();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C7450 m34398() {
        return this.f44778;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final byte[] m34395() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            byte[] bArr = this.f44783;
            int i = read(bArr);
            if (i < 0) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
        m34397();
        if (this.f44778 == null) {
            return null;
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        while (length > 0 && byteArray[length - 1] == 0) {
            length--;
        }
        return length != byteArray.length ? Arrays.copyOf(byteArray, length) : byteArray;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private byte[] m34392() throws IOException {
        boolean z;
        byte[] bArrM34396 = m34396();
        boolean z2 = false;
        if (bArrM34396 == null) {
            z = true;
            break;
        }
        int length = this.f44777.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = true;
                break;
            }
            if (bArrM34396[i] != 0) {
                z = false;
                break;
            }
            i++;
        }
        this.f44784 = z;
        if (!z || bArrM34396 == null) {
            return bArrM34396;
        }
        this.f44781 = true;
        boolean zMarkSupported = ((FilterInputStream) this).in.markSupported();
        if (zMarkSupported) {
            ((FilterInputStream) this).in.mark(this.f44777.length);
        }
        try {
            byte[] bArrM34397 = m34396();
            if (bArrM34397 == null) {
                z2 = true;
                break;
            }
            int length2 = this.f44777.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    z2 = true;
                    break;
                }
                if (bArrM34397[i2] != 0) {
                    break;
                }
                i2++;
            }
            if (!z2 && zMarkSupported) {
                m9694(this.f44777.length);
                ((FilterInputStream) this).in.reset();
            }
            long jM9691 = m9691() % ((long) this.f44773);
            if (jM9691 <= 0) {
                return null;
            }
            m9693(C5125.m15488(((long) this.f44773) - jM9691, ((FilterInputStream) this).in));
            return null;
        } catch (Throwable th) {
            if (zMarkSupported) {
                m9694(this.f44777.length);
                ((FilterInputStream) this).in.reset();
            }
            throw th;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int iM34393;
        if (i2 == 0) {
            return 0;
        }
        if (!this.f44784 && !isDirectory()) {
            C7450 c7450 = this.f44778;
            if (c7450 == null) {
                throw new IllegalStateException("No current tar entry");
            }
            if (this.f44774 < c7450.m20449()) {
                int iMin = Math.min(i2, available());
                if (this.f44778.m20433()) {
                    iM34393 = m34393(i, iMin, bArr);
                } else {
                    iM34393 = ((FilterInputStream) this).in.read(bArr, i, iMin);
                }
                if (iM34393 != -1) {
                    m9692(iM34393);
                    this.f44774 += (long) iM34393;
                    return iM34393;
                }
                if (iMin > 0) {
                    throw new IOException("Truncated TAR archive");
                }
                this.f44784 = true;
                return iM34393;
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
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C7450 m34397() throws IOException {
        byte[] bArrM34392;
        C10587 c10587;
        byte[] bArrM34395;
        String strMo28621;
        if (!this.f44784) {
            if (this.f44778 != null) {
                C5125.m15488(C25227.FOREVER_NS, this);
                if (!isDirectory()) {
                    long j = this.f44780;
                    if (j > 0 && j % ((long) this.f44777.length) != 0) {
                        long jAvailable = ((FilterInputStream) this).in.available();
                        long j2 = this.f44780;
                        byte[] bArr = this.f44777;
                        long length = (((j2 / ((long) bArr.length)) + 1) * ((long) bArr.length)) - j2;
                        long jM15488 = C5125.m15488(length, ((FilterInputStream) this).in);
                        if (((FilterInputStream) this).in instanceof FileInputStream) {
                            jM15488 = Math.min(jM15488, jAvailable);
                        }
                        if (jM15488 != length) {
                            throw new IOException("Truncated TAR archive");
                        }
                        m9693(jM15488);
                    }
                }
            }
            byte[] bArrM34393 = m34392();
            if (bArrM34393 == null) {
                if (this.f44786 && !this.f44781) {
                    throw new IOException("Missing TAR end marker");
                }
                this.f44778 = null;
                return null;
            }
            try {
                C7450 c7450 = new C7450(this.f44775, bArrM34393, this.f44782);
                this.f44778 = c7450;
                if (this.f44786 && !c7450.m20441()) {
                    throw new IOException("Invalid TAR header checksum (" + this.f44778.m20456() + MotionUtils.EASING_TYPE_FORMAT_END);
                }
                this.f44774 = 0L;
                this.f44780 = this.f44778.m20439();
                if (this.f44778.m20432()) {
                    byte[] bArrM34396 = m34395();
                    if (bArrM34396 == null) {
                        if (this.f44786) {
                            throw new IOException("Missing TAR entry after GNU long link header");
                        }
                    } else {
                        this.f44778.m20453(this.f44782.mo28621(0, bArrM34396.length, bArrM34396));
                        if (this.f44778.m20447()) {
                            bArrM34395 = m34395();
                            if (bArrM34395 == null) {
                                if (this.f44786) {
                                    throw new IOException("Missing TAR entry after GNU long name header");
                                }
                            } else {
                                strMo28621 = this.f44782.mo28621(0, bArrM34395.length, bArrM34395);
                                this.f44778.m20437(strMo28621);
                                if (this.f44778.m20450()) {
                                    this.f44778.m20437(strMo28621.concat("/"));
                                }
                            }
                        }
                        if (this.f44778.m20435()) {
                            this.f44775 = C1639.m5799(this, this.f44779, this.f44775, this.f44780);
                            m34397();
                            if (this.f44778 == null) {
                                throw new IOException("Error detected parsing the pax header");
                            }
                        }
                        if (this.f44778.m20418()) {
                            m34391();
                        } else if (!this.f44775.isEmpty()) {
                            HashMap map = this.f44775;
                            ArrayList arrayList = this.f44779;
                            this.f44778.m20426(map);
                            this.f44778.m20425(arrayList);
                        }
                        if (this.f44778.m20416()) {
                            if (this.f44778.m20446()) {
                                do {
                                    bArrM34392 = m34392();
                                    if (bArrM34392 != null) {
                                        throw new IOException("premature end of tar archive. Didn't find extended_header after header with extended flag.");
                                    }
                                    c10587 = new C10587(bArrM34392);
                                    this.f44778.m20430().addAll(c10587.m27035());
                                } while (c10587.m27036());
                            }
                            m34390();
                        }
                        this.f44780 = this.f44778.m20439();
                        return this.f44778;
                    }
                } else {
                    if (this.f44778.m20447()) {
                        bArrM34395 = m34395();
                        if (bArrM34395 == null) {
                            if (this.f44786) {
                                throw new IOException("Missing TAR entry after GNU long name header");
                            }
                        } else {
                            strMo28621 = this.f44782.mo28621(0, bArrM34395.length, bArrM34395);
                            this.f44778.m20437(strMo28621);
                            if (this.f44778.m20450() && !strMo28621.endsWith("/")) {
                                this.f44778.m20437(strMo28621.concat("/"));
                            }
                        }
                    }
                    if (this.f44778.m20435()) {
                        this.f44775 = C1639.m5799(this, this.f44779, this.f44775, this.f44780);
                        m34397();
                        if (this.f44778 == null) {
                            throw new IOException("Error detected parsing the pax header");
                        }
                    }
                    try {
                        if (this.f44778.m20418()) {
                            m34391();
                        } else if (!this.f44775.isEmpty()) {
                            HashMap map2 = this.f44775;
                            ArrayList arrayList2 = this.f44779;
                            this.f44778.m20426(map2);
                            this.f44778.m20425(arrayList2);
                        }
                        if (this.f44778.m20416()) {
                            if (this.f44778.m20446()) {
                                do {
                                    bArrM34392 = m34392();
                                    if (bArrM34392 != null) {
                                        throw new IOException("premature end of tar archive. Didn't find extended_header after header with extended flag.");
                                    }
                                    c10587 = new C10587(bArrM34392);
                                    this.f44778.m20430().addAll(c10587.m27035());
                                } while (c10587.m27036());
                            }
                            m34390();
                        }
                        this.f44780 = this.f44778.m20439();
                        return this.f44778;
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
        C7450 c7450 = this.f44778;
        return c7450 != null && c7450.m20450();
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    private void m34391() throws IOException {
        ArrayList arrayList = new ArrayList();
        HashMap mapM5799 = C1639.m5799(this, arrayList, this.f44775, this.f44780);
        if (mapM5799.containsKey("GNU.sparse.map")) {
            arrayList = new ArrayList(C1639.m5800((String) mapM5799.get("GNU.sparse.map")));
        }
        m34397();
        C7450 c7450 = this.f44778;
        if (c7450 != null) {
            c7450.m20426(mapM5799);
            this.f44778.m20425(arrayList);
            if (this.f44778.m20434()) {
                this.f44778.m20425(C1639.m5798(((FilterInputStream) this).in, this.f44777.length));
            }
            m34390();
            return;
        }
        throw new IOException("premature end of tar archive. Didn't find any entry after PAX header.");
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final byte[] m34396() throws IOException {
        InputStream inputStream = ((FilterInputStream) this).in;
        byte[] bArr = this.f44777;
        int length = bArr.length;
        if (length < 0 || length > bArr.length || length < 0) {
            throw new IndexOutOfBoundsException();
        }
        int iM15487 = C5125.m15487(inputStream, bArr, 0, length);
        m9692(iM15487);
        byte[] bArr2 = this.f44777;
        if (iM15487 == bArr2.length) {
            return bArr2;
        }
        if (!this.f44786) {
            return null;
        }
        if (iM15487 > 0 || m9691() == 0) {
            throw new IOException("Truncated TAR archive");
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private int m34393(int i, int i2, byte[] bArr) throws IOException {
        ArrayList arrayList = this.f44776;
        if (arrayList == null || arrayList.isEmpty()) {
            return ((FilterInputStream) this).in.read(bArr, i, i2);
        }
        if (this.f44785 >= this.f44776.size()) {
            return -1;
        }
        int i3 = ((InputStream) this.f44776.get(this.f44785)).read(bArr, i, i2);
        if (this.f44785 == this.f44776.size() - 1) {
            return i3;
        }
        if (i3 == -1) {
            this.f44785++;
            return m34393(i, i2, bArr);
        }
        if (i3 >= i2) {
            return i3;
        }
        this.f44785++;
        int iM34393 = m34393(i + i3, i2 - i3, bArr);
        return iM34393 == -1 ? i3 : i3 + iM34393;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jSkip = 0;
        if (j > 0 && !isDirectory()) {
            long jAvailable = ((FilterInputStream) this).in.available();
            long jMin = Math.min(j, this.f44778.m20449() - this.f44774);
            if (!this.f44778.m20433()) {
                jSkip = C5125.m15488(jMin, ((FilterInputStream) this).in);
                if (((FilterInputStream) this).in instanceof FileInputStream) {
                    jSkip = Math.min(jSkip, jAvailable);
                }
                if (jSkip != jMin) {
                    throw new IOException("Truncated TAR archive");
                }
            } else {
                ArrayList arrayList = this.f44776;
                if (arrayList == null || arrayList.isEmpty()) {
                    jSkip = ((FilterInputStream) this).in.skip(jMin);
                } else {
                    while (jSkip < jMin && this.f44785 < this.f44776.size()) {
                        jSkip += ((InputStream) this.f44776.get(this.f44785)).skip(jMin - jSkip);
                        if (jSkip < jMin) {
                            this.f44785++;
                        }
                    }
                }
            }
            m9693(jSkip);
            this.f44774 += jSkip;
        }
        return jSkip;
    }
}
