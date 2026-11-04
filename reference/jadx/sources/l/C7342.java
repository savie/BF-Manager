package l;

import java.io.DataInput;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۜᩴܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes3.dex */
public final class C7342 implements AutoCloseable {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final DataInput f24170;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2867 f24173;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public long f24175;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C20570[] f24176;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f24178;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C19275 f24179;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C13111 f24180;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC9578 f24181;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C25111 f24182 = new C25111();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final ArrayList f24169 = new ArrayList();

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final ArrayList f24174 = new ArrayList();

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C13856[] f24177 = new C13856[0];

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public boolean[] f24172 = new boolean[0];

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C6465[] f24171 = new C6465[0];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ C25111 m20152(C7342 c7342) {
        return c7342.f24182;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ C6465[] m20153(C7342 c7342) {
        return c7342.f24171;
    }

    public C7342(C13111 c13111, DataInput dataInput, C20570[] c20570Arr, InterfaceC2867 interfaceC2867, C19275 c19275) {
        this.f24180 = c13111;
        this.f24170 = dataInput;
        this.f24176 = c20570Arr;
        this.f24173 = interfaceC2867;
        this.f24179 = c19275;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m20159() throws IOException {
        DataInput dataInput = this.f24170;
        int i = dataInput.readInt();
        if (i < 0 || i > 1048576) {
            throw C19143.m44341("Invalid delta table size");
        }
        long jM45204 = C19606.m45204(i);
        C19275 c19275 = this.f24179;
        c19275.m44622(jM45204);
        this.f24177 = new C13856[i];
        this.f24172 = new boolean[i];
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = dataInput.readInt();
            if (i3 <= 0) {
                throw C19143.m44341("Invalid delta table payload length");
            }
            C13856[] c13856Arr = this.f24177;
            int iMin = Math.min(65536, i3);
            byte[] bArr = new byte[iMin];
            C13856 c13856M45213 = null;
            InterfaceC2867 interfaceC2867 = this.f24173;
            if (interfaceC2867 == null) {
                long j = (((long) i3) + 65535) / 65536;
                if (j > 1) {
                    c19275.m44622(C19606.m45204(j - 1));
                }
                while (i3 > 0) {
                    int iMin2 = Math.min(iMin, i3);
                    dataInput.readFully(bArr, 0, iMin2);
                    c13856M45213 = C19606.m45249(c13856M45213, this.f24182.m55980(iMin2, bArr));
                    i3 -= iMin2;
                }
            } else {
                if (this.f24181 == null) {
                    this.f24181 = interfaceC2867.create();
                }
                InterfaceC10324 interfaceC10324Mo25017 = this.f24181.mo25017(i3);
                int i4 = i3;
                while (i4 > 0) {
                    int iMin3 = Math.min(iMin, i4);
                    dataInput.readFully(bArr, 0, iMin3);
                    interfaceC10324Mo25017.mo6387(iMin3, bArr);
                    i4 -= iMin3;
                }
                interfaceC10324Mo25017.finish();
                if (interfaceC10324Mo25017.position() != i3) {
                    throw C19143.m44341("Incomplete delta table payload");
                }
                InterfaceC22808 interfaceC22808Mo6386 = interfaceC10324Mo25017.mo6386();
                C17359.requireNonNull(interfaceC22808Mo6386, "checkpoint delta source");
                this.f24169.add(interfaceC22808Mo6386);
                c13856M45213 = C19606.m45213(new C8636(interfaceC22808Mo6386, 0, i3, null));
            }
            c13856Arr[i2] = c13856M45213;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m20158() throws IOException {
        DataInput dataInput = this.f24170;
        int i = dataInput.readInt();
        if (i >= 0) {
            int i2 = 1048576;
            if (i <= 1048576) {
                long j = ((long) i) * 24;
                C19275 c19275 = this.f24179;
                c19275.m44622(16 + j);
                ArrayList arrayList = this.f24174;
                arrayList.ensureCapacity(i);
                this.f24175 = j;
                String str = "Replacement recipe table exceeds memory limit";
                long j2 = 67108864;
                if (j > 67108864) {
                    throw C19143.m44341("Replacement recipe table exceeds memory limit");
                }
                this.f24171 = new C6465[i];
                int i3 = 0;
                while (i3 < i) {
                    int i4 = dataInput.readInt();
                    int i5 = dataInput.readInt();
                    int i6 = dataInput.readInt();
                    int i7 = dataInput.readInt();
                    if (i4 >= 0 && i5 > 0 && i6 > 0 && i7 >= 0) {
                        long j3 = i7;
                        if (j3 <= j2) {
                            ArrayList arrayList2 = arrayList;
                            String str2 = str;
                            long jM10044 = C3077.m10044(this.f24175, C3077.m10044(j3, 64L));
                            this.f24175 = jM10044;
                            if (jM10044 > 67108864) {
                                throw C19143.m44341(str2);
                            }
                            c19275.m44622(C3077.m10044(j3, 64L));
                            byte[] bArr = new byte[i7];
                            dataInput.readFully(bArr);
                            int i8 = dataInput.readInt();
                            if (i8 <= 0 || i8 > i2) {
                                throw C19143.m44341("Invalid replacement recipe index size");
                            }
                            c19275.m44622(C19143.m44280(i8));
                            AbstractC0433[] abstractC0433Arr = new AbstractC0433[i8];
                            long[] jArr = new long[i8];
                            long jM10045 = 0;
                            int iMo2249 = -1;
                            int i9 = 0;
                            long jM10046 = 0;
                            while (i9 < i8) {
                                int i10 = i;
                                byte[] bArr2 = bArr;
                                AbstractC0433 abstractC0433M2238 = AbstractC0433.m2238(dataInput, 0, c19275);
                                int iMo22410 = abstractC0433M2238.mo2249(0);
                                if (iMo22410 < 0 || (i9 != 0 && iMo22410 <= iMo2249)) {
                                    throw C19143.m44341("Replacement recipe starts are not sorted");
                                }
                                iMo2249 = abstractC0433M2238.mo2249(abstractC0433M2238.mo2248() - 1);
                                DataInput dataInput2 = dataInput;
                                jM10045 = C3077.m10044(jM10045, abstractC0433M2238.mo2241());
                                if (C19143.m44282(i8, jM10045) > 67108864) {
                                    throw C19143.m44341("Replacement recipe index exceeds memory limit");
                                }
                                jM10046 = C3077.m10044(jM10046, abstractC0433M2238.mo2248());
                                abstractC0433Arr[i9] = abstractC0433M2238;
                                jArr[i9] = jM10046;
                                i9++;
                                i = i10;
                                bArr = bArr2;
                                dataInput = dataInput2;
                            }
                            DataInput dataInput3 = dataInput;
                            int i11 = i;
                            byte[] bArr3 = bArr;
                            C3481 c3481 = new C3481(abstractC0433Arr, jArr, jM10046, C19143.m44282(i8, jM10045));
                            long jM10047 = C3077.m10044(this.f24175, c3481.m11436());
                            this.f24175 = jM10047;
                            if (jM10047 > 67108864) {
                                throw C19143.m44341(str2);
                            }
                            C6465 c6465 = new C6465(m20154(i4, dataInput3.readInt(), i3), i4, i5, i6, bArr3, c3481);
                            this.f24171[i3] = c6465;
                            arrayList2.add(c6465);
                            i3++;
                            i2 = 1048576;
                            j2 = 67108864;
                            str = str2;
                            i = i11;
                            arrayList = arrayList2;
                            dataInput = dataInput3;
                        }
                    }
                    throw C19143.m44341("Invalid replacement recipe header");
                }
                return;
            }
        }
        throw C19143.m44341("Invalid recipe table size");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13856 m20154(int i, int i2, int i3) throws IOException {
        long j;
        C6465 c6465;
        C13856 c13856M45213;
        int i4;
        int i5;
        C13856 c13856M45214;
        int i6 = i;
        int i7 = i2;
        if (i7 < 0 || (i6 != 0 ? i7 == 0 || i7 > i6 : i7 != 0)) {
            throw C19143.m44341("Invalid extent count");
        }
        if (C19606.m45204(i7) > 67108864) {
            throw C19143.m44341("Span structure exceeds memory limit");
        }
        C13856 c13856M45249 = null;
        long j2 = 0;
        int i8 = 0;
        while (i8 < i7) {
            DataInput dataInput = this.f24170;
            int unsignedByte = dataInput.readUnsignedByte();
            int i9 = (int) (((long) i6) - j2);
            C20570[] c20570Arr = this.f24176;
            C19275 c19275 = this.f24179;
            if (unsignedByte == 1) {
                int i10 = dataInput.readInt();
                i5 = dataInput.readInt();
                C19143.m44298(i5, i9);
                long j3 = ((long) i10) + ((long) i5);
                if (i10 >= 0) {
                    C13111 c13111 = this.f24180;
                    j = j2;
                    if (j3 <= c13111.length()) {
                        c19275.m44622(C19606.m45204(1L));
                        c13856M45214 = C19606.m45213(new C8636(c13111, i10, i5, C10127.m26099(dataInput, i10, i5, c20570Arr, c19275)));
                    }
                }
                throw C19143.m44341("BASE range is outside source");
            }
            j = j2;
            if (unsignedByte == 2) {
                int i11 = dataInput.readInt();
                if (i11 >= 0) {
                    C13856[] c13856Arr = this.f24177;
                    if (i11 < c13856Arr.length) {
                        c13856M45213 = c13856Arr[i11];
                        i4 = c13856M45213 == null ? 0 : c13856M45213.f43959;
                        C19143.m44298(i4, i9);
                        if (this.f24172[i11]) {
                            c19275.m44622(C19606.m45238(c13856M45213));
                        }
                        this.f24172[i11] = true;
                    }
                }
                throw C19143.m44341("Invalid delta identity");
            }
            if (unsignedByte == 3) {
                byte b = dataInput.readByte();
                i5 = dataInput.readInt();
                C19143.m44298(i5, i9);
                c19275.m44622(C19606.m45204(1L));
                c13856M45214 = C19606.m45220(new C17651(b, i5));
            } else if (unsignedByte == 5) {
                byte b2 = dataInput.readByte();
                i5 = dataInput.readInt();
                C19143.m44298(i5, i9);
                c19275.m44622(C19606.m45204(1L));
                C10127 c10127M26099 = C10127.m26099(dataInput, 0, i5, c20570Arr, c19275);
                if (c10127M26099 == null) {
                    throw C19143.m44341("Patched FILL has no patches");
                }
                c13856M45214 = C19606.m45213(new C8636(new C17651(b2, i5), 0, i5, c10127M26099));
            } else {
                if (unsignedByte != 4) {
                    throw C19143.m44341(C13645.m33382(unsignedByte, "Unknown extent tag "));
                }
                int i12 = dataInput.readInt();
                int i13 = dataInput.readInt();
                int i14 = dataInput.readInt();
                C19143.m44298(i14, i9);
                if (i12 < 0 || i12 >= i3 || (c6465 = this.f24171[i12]) == null || i13 < 0 || ((long) i13) + ((long) i14) > c6465.length()) {
                    throw C19143.m44341("Invalid replacement recipe extent");
                }
                C10127 c10127M260910 = C10127.m26099(dataInput, i13, i14, c20570Arr, c19275);
                c19275.m44622(C19606.m45204(1L));
                c13856M45213 = C19606.m45213(new C8636(this.f24171[i12], i13, i14, c10127M260910));
                i4 = i14;
            }
            c13856M45249 = C19606.m45249(c13856M45249, c13856M45213);
            j2 = j + ((long) i4);
            i8++;
            i6 = i;
            i7 = i2;
            c13856M45213 = c13856M45214;
            i4 = i5;
            c13856M45249 = C19606.m45249(c13856M45249, c13856M45213);
            j2 = j + ((long) i4);
            i8++;
            i6 = i;
            i7 = i2;
        }
        if (j2 == i6) {
            return c13856M45249;
        }
        throw C19143.m44341("Extent lengths do not match document length");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20156(C13856 c13856) throws IOException {
        ArrayList arrayList = new ArrayList();
        C19143.m44347(c13856, arrayList);
        IdentityHashMap identityHashMap = new IdentityHashMap();
        ArrayDeque arrayDeque = new ArrayDeque(arrayList);
        while (!arrayDeque.isEmpty()) {
            C6465 c6465 = (C6465) arrayDeque.pop();
            if (identityHashMap.put(c6465, Boolean.TRUE) == null) {
                arrayList.clear();
                C19143.m44347(c6465.f21761, arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayDeque.push((C6465) it.next());
                }
            }
        }
        if (identityHashMap.size() != this.f24171.length) {
            throw C19143.m44341("Unreachable replacement recipe definition");
        }
        for (boolean z : this.f24172) {
            if (!z) {
                throw C19143.m44341("Unreachable delta definition");
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20155() {
        InterfaceC9578 interfaceC9578 = this.f24181;
        if (interfaceC9578 != null) {
            interfaceC9578.finish();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20157(C19143 c19143) {
        if (this.f24178) {
            throw new IllegalStateException("Checkpoint sources already transferred");
        }
        ArrayList arrayList = this.f24169;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c19143.f61951.put((InterfaceC22808) it.next(), Boolean.TRUE);
        }
        ArrayList arrayList2 = this.f24174;
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            c19143.f61951.put((C6465) it2.next(), Boolean.TRUE);
        }
        InterfaceC9578 interfaceC9578 = this.f24181;
        if (interfaceC9578 != null) {
            interfaceC9578.mo25016();
        }
        arrayList.clear();
        arrayList2.clear();
        this.f24181 = null;
        this.f24178 = true;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f24178) {
            return;
        }
        ArrayList arrayList = this.f24174;
        Throwable th = null;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            try {
                ((C6465) arrayList.get(size)).close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else {
                    th.addSuppressed(th2);
                }
            }
        }
        arrayList.clear();
        this.f24169.clear();
        InterfaceC9578 interfaceC9578 = this.f24181;
        if (interfaceC9578 != null) {
            try {
                interfaceC9578.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                } else {
                    th.addSuppressed(th3);
                }
            }
            this.f24181 = null;
        }
        if (th == null) {
            return;
        }
        C19143.m44301(th);
        throw null;
    }
}
