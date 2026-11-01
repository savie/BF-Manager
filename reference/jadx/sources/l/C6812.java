package l;

import java.io.DataInput;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۜܰ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes2.dex */
public final class C6812 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C8868 f22962;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f22963;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f22964;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C15621 f22967;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final DataInput f22968;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C5401 f22971;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC13163 f22973;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C6045[] f22975;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C15986 f22974 = new C15986();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList f22972 = new ArrayList();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final ArrayList f22969 = new ArrayList();

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C22710[] f22966 = new C22710[0];

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public boolean[] f22965 = new boolean[0];

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C23747[] f22970 = new C23747[0];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ C15986 m18407(C6812 c6812) {
        return c6812.f22974;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ C23747[] m18408(C6812 c6812) {
        return c6812.f22970;
    }

    public C6812(C8868 c8868, DataInput dataInput, C6045[] c6045Arr, C15621 c15621, C5401 c5401) {
        this.f22962 = c8868;
        this.f22968 = dataInput;
        this.f22975 = c6045Arr;
        this.f22967 = c15621;
        this.f22971 = c5401;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m18414() throws IOException {
        DataInput dataInput = this.f22968;
        int i = dataInput.readInt();
        if (i < 0 || i > 1048576) {
            throw C2516.m7773("Invalid delta table size");
        }
        long jM20835 = C7893.m20835(i);
        C5401 c5401 = this.f22971;
        c5401.m14964(jM20835);
        this.f22966 = new C22710[i];
        this.f22965 = new boolean[i];
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = dataInput.readInt();
            if (i3 <= 0) {
                throw C2516.m7773("Invalid delta table payload length");
            }
            C22710[] c22710Arr = this.f22966;
            int iMin = Math.min(65536, i3);
            byte[] bArr = new byte[iMin];
            C22710 c22710M20844 = null;
            C15621 c15621 = this.f22967;
            if (c15621 == null) {
                long j = (((long) i3) + 65535) / 65536;
                if (j > 1) {
                    c5401.m14964(C7893.m20835(j - 1));
                }
                while (i3 > 0) {
                    int iMin2 = Math.min(iMin, i3);
                    dataInput.readFully(bArr, 0, iMin2);
                    c22710M20844 = C7893.m20831(c22710M20844, this.f22974.m37965(iMin2, bArr));
                    i3 -= iMin2;
                }
            } else {
                if (this.f22973 == null) {
                    this.f22973 = c15621.m37308();
                }
                InterfaceC22335 interfaceC22335Mo16263 = this.f22973.mo16263(i3);
                int i4 = i3;
                while (i4 > 0) {
                    int iMin3 = Math.min(iMin, i4);
                    dataInput.readFully(bArr, 0, iMin3);
                    interfaceC22335Mo16263.mo40225(iMin3, bArr);
                    i4 -= iMin3;
                }
                interfaceC22335Mo16263.finish();
                if (interfaceC22335Mo16263.position() != i3) {
                    throw C2516.m7773("Incomplete delta table payload");
                }
                InterfaceC18745 interfaceC18745Mo40224 = interfaceC22335Mo16263.mo40224();
                C13638.requireNonNull(interfaceC18745Mo40224, "checkpoint delta source");
                this.f22972.add(interfaceC18745Mo40224);
                c22710M20844 = C7893.m20844(new C3658(interfaceC18745Mo40224, 0, i3, null));
            }
            c22710Arr[i2] = c22710M20844;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m18409() throws IOException {
        DataInput dataInput = this.f22968;
        int i = dataInput.readInt();
        if (i >= 0) {
            int i2 = 1048576;
            if (i <= 1048576) {
                long j = ((long) i) * 24;
                C5401 c5401 = this.f22971;
                c5401.m14964(16 + j);
                ArrayList arrayList = this.f22969;
                arrayList.ensureCapacity(i);
                this.f22963 = j;
                String str = "Replacement recipe table exceeds memory limit";
                long j2 = 67108864;
                if (j > 67108864) {
                    throw C2516.m7773("Replacement recipe table exceeds memory limit");
                }
                this.f22970 = new C23747[i];
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
                            long jM6676 = C2124.m6676(this.f22963, C2124.m6676(j3, 64L));
                            this.f22963 = jM6676;
                            if (jM6676 > 67108864) {
                                throw C2516.m7773(str2);
                            }
                            c5401.m14964(C2124.m6676(j3, 64L));
                            byte[] bArr = new byte[i7];
                            dataInput.readFully(bArr);
                            int i8 = dataInput.readInt();
                            if (i8 <= 0 || i8 > i2) {
                                throw C2516.m7773("Invalid replacement recipe index size");
                            }
                            c5401.m14964(C2516.m7719(i8));
                            AbstractC13538[] abstractC13538Arr = new AbstractC13538[i8];
                            long[] jArr = new long[i8];
                            long jM6677 = 0;
                            int iMo19950 = -1;
                            int i9 = 0;
                            long jM6678 = 0;
                            while (i9 < i8) {
                                int i10 = i;
                                byte[] bArr2 = bArr;
                                AbstractC13538 abstractC13538M33083 = AbstractC13538.m33083(dataInput, 0, c5401);
                                int iMo19951 = abstractC13538M33083.mo19950(0);
                                if (iMo19951 < 0 || (i9 != 0 && iMo19951 <= iMo19950)) {
                                    throw C2516.m7773("Replacement recipe starts are not sorted");
                                }
                                iMo19950 = abstractC13538M33083.mo19950(abstractC13538M33083.mo19949() - 1);
                                DataInput dataInput2 = dataInput;
                                jM6677 = C2124.m6676(jM6677, abstractC13538M33083.mo19943());
                                if (C2516.m7721(i8, jM6677) > 67108864) {
                                    throw C2516.m7773("Replacement recipe index exceeds memory limit");
                                }
                                jM6678 = C2124.m6676(jM6678, abstractC13538M33083.mo19949());
                                abstractC13538Arr[i9] = abstractC13538M33083;
                                jArr[i9] = jM6678;
                                i9++;
                                i = i10;
                                bArr = bArr2;
                                dataInput = dataInput2;
                            }
                            DataInput dataInput3 = dataInput;
                            int i11 = i;
                            byte[] bArr3 = bArr;
                            C17396 c17396 = new C17396(abstractC13538Arr, jArr, jM6678, C2516.m7721(i8, jM6677));
                            long jM6679 = C2124.m6676(this.f22963, c17396.m40514());
                            this.f22963 = jM6679;
                            if (jM6679 > 67108864) {
                                throw C2516.m7773(str2);
                            }
                            C23747 c23747 = new C23747(m18410(i4, dataInput3.readInt(), i3), i4, i5, i6, bArr3, c17396);
                            this.f22970[i3] = c23747;
                            arrayList2.add(c23747);
                            i3++;
                            i2 = 1048576;
                            j2 = 67108864;
                            str = str2;
                            i = i11;
                            arrayList = arrayList2;
                            dataInput = dataInput3;
                        }
                    }
                    throw C2516.m7773("Invalid replacement recipe header");
                }
                return;
            }
        }
        throw C2516.m7773("Invalid recipe table size");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22710 m18410(int i, int i2, int i3) throws IOException {
        long j;
        C23747 c23747;
        C22710 c22710M20844;
        int i4;
        int i5;
        C22710 c22710M20845;
        int i6 = i;
        int i7 = i2;
        if (i7 < 0 || (i6 != 0 ? i7 == 0 || i7 > i6 : i7 != 0)) {
            throw C2516.m7773("Invalid extent count");
        }
        if (C7893.m20835(i7) > 67108864) {
            throw C2516.m7773("Span structure exceeds memory limit");
        }
        C22710 c22710M20831 = null;
        long j2 = 0;
        int i8 = 0;
        while (i8 < i7) {
            DataInput dataInput = this.f22968;
            int unsignedByte = dataInput.readUnsignedByte();
            int i9 = (int) (((long) i6) - j2);
            C6045[] c6045Arr = this.f22975;
            C5401 c5401 = this.f22971;
            if (unsignedByte == 1) {
                int i10 = dataInput.readInt();
                i5 = dataInput.readInt();
                C2516.m7737(i5, i9);
                long j3 = ((long) i10) + ((long) i5);
                if (i10 >= 0) {
                    C8868 c8868 = this.f22962;
                    j = j2;
                    if (j3 <= c8868.length()) {
                        c5401.m14964(C7893.m20835(1L));
                        c22710M20845 = C7893.m20844(new C3658(c8868, i10, i5, C5070.m14122(dataInput, i10, i5, c6045Arr, c5401)));
                    }
                }
                throw C2516.m7773("BASE range is outside source");
            }
            j = j2;
            if (unsignedByte == 2) {
                int i11 = dataInput.readInt();
                if (i11 >= 0) {
                    C22710[] c22710Arr = this.f22966;
                    if (i11 < c22710Arr.length) {
                        c22710M20844 = c22710Arr[i11];
                        i4 = c22710M20844 == null ? 0 : c22710M20844.f73964;
                        C2516.m7737(i4, i9);
                        if (this.f22965[i11]) {
                            c5401.m14964(C7893.m20875(c22710M20844));
                        }
                        this.f22965[i11] = true;
                    }
                }
                throw C2516.m7773("Invalid delta identity");
            }
            if (unsignedByte == 3) {
                byte b = dataInput.readByte();
                i5 = dataInput.readInt();
                C2516.m7737(i5, i9);
                c5401.m14964(C7893.m20835(1L));
                c22710M20845 = C7893.m20845(new C0462(b, i5));
            } else if (unsignedByte == 5) {
                byte b2 = dataInput.readByte();
                i5 = dataInput.readInt();
                C2516.m7737(i5, i9);
                c5401.m14964(C7893.m20835(1L));
                C5070 c5070M14122 = C5070.m14122(dataInput, 0, i5, c6045Arr, c5401);
                if (c5070M14122 == null) {
                    throw C2516.m7773("Patched FILL has no patches");
                }
                c22710M20845 = C7893.m20844(new C3658(new C0462(b2, i5), 0, i5, c5070M14122));
            } else {
                if (unsignedByte != 4) {
                    throw C2516.m7773(C8479.m22141(unsignedByte, "Unknown extent tag "));
                }
                int i12 = dataInput.readInt();
                int i13 = dataInput.readInt();
                int i14 = dataInput.readInt();
                C2516.m7737(i14, i9);
                if (i12 < 0 || i12 >= i3 || (c23747 = this.f22970[i12]) == null || i13 < 0 || ((long) i13) + ((long) i14) > c23747.length()) {
                    throw C2516.m7773("Invalid replacement recipe extent");
                }
                C5070 c5070M14123 = C5070.m14122(dataInput, i13, i14, c6045Arr, c5401);
                c5401.m14964(C7893.m20835(1L));
                c22710M20844 = C7893.m20844(new C3658(this.f22970[i12], i13, i14, c5070M14123));
                i4 = i14;
            }
            c22710M20831 = C7893.m20831(c22710M20831, c22710M20844);
            j2 = j + ((long) i4);
            i8++;
            i6 = i;
            i7 = i2;
            c22710M20844 = c22710M20845;
            i4 = i5;
            c22710M20831 = C7893.m20831(c22710M20831, c22710M20844);
            j2 = j + ((long) i4);
            i8++;
            i6 = i;
            i7 = i2;
        }
        if (j2 == i6) {
            return c22710M20831;
        }
        throw C2516.m7773("Extent lengths do not match document length");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18413(C22710 c22710) throws IOException {
        ArrayList arrayList = new ArrayList();
        C2516.m7778(c22710, arrayList);
        IdentityHashMap identityHashMap = new IdentityHashMap();
        ArrayDeque arrayDeque = new ArrayDeque(arrayList);
        while (!arrayDeque.isEmpty()) {
            C23747 c23747 = (C23747) arrayDeque.pop();
            if (identityHashMap.put(c23747, Boolean.TRUE) == null) {
                arrayList.clear();
                C2516.m7778(c23747.f76821, arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayDeque.push((C23747) it.next());
                }
            }
        }
        if (identityHashMap.size() != this.f22970.length) {
            throw C2516.m7773("Unreachable replacement recipe definition");
        }
        for (boolean z : this.f22965) {
            if (!z) {
                throw C2516.m7773("Unreachable delta definition");
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18411() {
        InterfaceC13163 interfaceC13163 = this.f22973;
        if (interfaceC13163 != null) {
            interfaceC13163.finish();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18412(C2516 c2516) {
        if (this.f22964) {
            throw new IllegalStateException("Checkpoint sources already transferred");
        }
        ArrayList arrayList = this.f22972;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c2516.f9984.put((InterfaceC18745) it.next(), Boolean.TRUE);
        }
        ArrayList arrayList2 = this.f22969;
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            c2516.f9984.put((C23747) it2.next(), Boolean.TRUE);
        }
        InterfaceC13163 interfaceC13163 = this.f22973;
        if (interfaceC13163 != null) {
            interfaceC13163.mo16264();
        }
        arrayList.clear();
        arrayList2.clear();
        this.f22973 = null;
        this.f22964 = true;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f22964) {
            return;
        }
        ArrayList arrayList = this.f22969;
        Throwable th = null;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            try {
                ((C23747) arrayList.get(size)).close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else {
                    th.addSuppressed(th2);
                }
            }
        }
        arrayList.clear();
        this.f22972.clear();
        InterfaceC13163 interfaceC13163 = this.f22973;
        if (interfaceC13163 != null) {
            try {
                interfaceC13163.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                } else {
                    th.addSuppressed(th3);
                }
            }
            this.f22973 = null;
        }
        if (th == null) {
            return;
        }
        C2516.m7740(th);
        throw null;
    }
}
