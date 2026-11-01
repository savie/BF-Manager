package l;

import bin.mt.plus.R;
import com.github.luben.zstd.RecyclingBufferPool;
import com.github.luben.zstd.ZstdInputStreamNoFinalizer;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ᩴۤ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M9Q4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18686 implements InterfaceC19392 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final byte[] f60640 = new byte[524288];

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final ArrayList f60641 = new ArrayList();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC7739 f60642;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final long f60643;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public HashMap f60644;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f60645;

    public C18686(InterfaceC7739 interfaceC7739) throws IOException {
        this.f60642 = interfaceC7739;
        int i = interfaceC7739.readInt();
        if (i != 1430352451) {
            throw new IOException(String.format("Incorrect magic: %08x", Integer.valueOf(i)));
        }
        long jReverseBytes = Long.reverseBytes(interfaceC7739.readLong());
        if (jReverseBytes != 2) {
            throw new IOException(C15489.m37074(jReverseBytes, "Unsupported payload version: "));
        }
        long jReverseBytes2 = Long.reverseBytes(interfaceC7739.readLong());
        if (jReverseBytes2 <= 0 || jReverseBytes2 > 2147483647L) {
            throw new IOException(C15489.m37074(jReverseBytes2, "Incorrect manifest length: "));
        }
        int iReverseBytes = Integer.reverseBytes(interfaceC7739.readInt());
        if (iReverseBytes <= 0) {
            throw new IOException(C8479.m22141(iReverseBytes, "Incorrect metadata signature length: "));
        }
        byte[] bArr = new byte[(int) jReverseBytes2];
        interfaceC7739.readFully(bArr);
        C21425 from = C21425.parseFrom(bArr);
        this.f60643 = jReverseBytes2 + 24 + ((long) iReverseBytes);
        int blockSize = from.getBlockSize();
        this.f60645 = blockSize;
        for (C23231 c23231 : from.getPartitionsList()) {
            if (c23231.hasPartitionName()) {
                Iterator it = c23231.getOperationsList().iterator();
                long numBlocks = 0;
                while (true) {
                    if (!it.hasNext()) {
                        this.f60641.add(new C9474(c23231, blockSize));
                        break;
                    }
                    C4885 c4885 = (C4885) it.next();
                    int i2 = C3868.f14459[c4885.getType().ordinal()];
                    if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4) {
                        if (c4885.getDstExtentsCount() == 1 && c4885.getDstExtents(0).getStartBlock() == numBlocks) {
                            numBlocks += c4885.getDstExtents(0).getNumBlocks();
                        }
                    } else if (i2 == 5) {
                        Iterator it2 = c4885.getDstExtentsList().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                C5903 c5903 = (C5903) it2.next();
                                if (c5903.getStartBlock() == numBlocks) {
                                    numBlocks += c5903.getNumBlocks();
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
            }
            System.out.println("check failed: " + c23231.getPartitionName());
        }
        if (this.f60641.isEmpty() && from.getPartitionsCount() > 0) {
            throw new IOException(C16737.m39288(R.string.MT_Protector));
        }
    }

    @Override // l.InterfaceC19392
    /* JADX INFO: renamed from: ֡ܰ */
    public final List mo34856() {
        return this.f60641;
    }

    @Override // l.InterfaceC19392
    public final C9474 getEntry(String str) {
        HashMap map = this.f60644;
        if (map == null) {
            ArrayList<C9474> arrayList = this.f60641;
            map = new HashMap(arrayList.size());
            this.f60644 = map;
            for (C9474 c9474 : arrayList) {
                map.put(c9474.m24284(), c9474);
            }
        }
        return (C9474) map.get(str);
    }

    @Override // l.InterfaceC19392
    /* JADX INFO: renamed from: ۘ */
    public final C9474 mo34857(String str) throws IOException {
        C9474 entry = getEntry(str);
        if (entry != null) {
            return entry;
        }
        throw new IOException(C0252.m1693("Entry not found: ", str));
    }

    @Override // l.InterfaceC19392
    /* JADX INFO: renamed from: ۙ */
    public final C2599 mo34858(C9474 c9474) {
        return new C2599(new C1046(this, c9474.f32063.getOperationsList().iterator(), this.f60645, this.f60643));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m43170(C18686 c18686, InterfaceC22920 interfaceC22920, AtomicReference atomicReference, C4885 c4885, C1388 c1388, FileChannel fileChannel, C5280 c5280, C22214 c22214) {
        try {
            if (!interfaceC22920.mo1827() && atomicReference.get() == null) {
                c18686.m43167(c4885, c18686.f60642, c1388, fileChannel, interfaceC22920, (byte[]) c5280.get(), (byte[]) c22214.get());
            }
        } catch (IOException e) {
            while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
            }
        } catch (Throwable th) {
            IOException iOException = new IOException(th);
            while (!atomicReference.compareAndSet(null, iOException) && atomicReference.get() == null) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r21v0, types: [l.᩹ۤ֨] */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r22v0, types: [l.ۚۤ֨] */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v2 */
    @Override // l.InterfaceC19392
    /* JADX INFO: renamed from: ۙ */
    public final void mo34860(C9474 c9474, C1388 c1388, final InterfaceC22920 interfaceC22920) throws IOException {
        C22525 c22525;
        final ?? r21;
        final ?? r22;
        C23231 c23231 = c9474.f32063;
        if (c23231.hasNewPartitionInfo()) {
            C22525 newPartitionInfo = c23231.getNewPartitionInfo();
            if (newPartitionInfo.hasSize() && newPartitionInfo.hasHash()) {
                if (newPartitionInfo.getSize() != c9474.m24283() || newPartitionInfo.getHash().size() != 32) {
                    throw new IOException("Invalid partition verification metadata: " + c9474.m24284());
                }
                c22525 = newPartitionInfo;
            } else {
                c22525 = null;
            }
        } else {
            c22525 = null;
        }
        c1388.setLength(0L);
        InterfaceC21850 interfaceC21850Mo4866 = c1388.mo4866();
        final FileChannel fileChannelMo3055 = interfaceC21850Mo4866.mo3055();
        boolean z = fileChannelMo3055 != null && interfaceC21850Mo4866.mo3051();
        int i = this.f60645;
        final C3122 c3122 = new C3122();
        ThreadLocal threadLocal = new ThreadLocal() { // from class: l.ۚۤ֨
            @Override // java.lang.ThreadLocal
            public final Object initialValue() {
                c3122.getClass();
                return new byte[WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT];
            }
        };
        final C4574 c4574 = new C4574();
        ThreadLocal threadLocal2 = new ThreadLocal() { // from class: l.᩹ۤ֨
            @Override // java.lang.ThreadLocal
            public final Object initialValue() {
                c4574.getClass();
                return new byte[524288];
            }
        };
        ExecutorService executorService = C4716.f16632;
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(C5464.f18831);
        final AtomicReference atomicReference = new AtomicReference();
        ArrayList arrayList = new ArrayList();
        C1388 c1389 = c1388;
        final C18686 c18686 = this;
        ?? r14 = threadLocal2;
        ?? r15 = threadLocal;
        for (final C4885 c4885 : c23231.getOperationsList()) {
            if (c4885.getType() == EnumC3080.ZERO) {
                arrayList.add(c4885);
                r21 = r14;
                r22 = r15;
            } else {
                r21 = r14;
                r22 = r15;
                final C1388 c13810 = c1389;
                executorServiceNewFixedThreadPool.submit(new Runnable() { // from class: l.ܰۤ֨
                    @Override // java.lang.Runnable
                    public final void run() {
                        C18686.m43170(this.f45320, interfaceC22920, atomicReference, c4885, c13810, fileChannelMo3055, r22, r21);
                    }
                });
                c1389 = c1388;
                c18686 = this;
            }
            arrayList = arrayList;
            r14 = r21;
            r15 = r22;
        }
        ArrayList arrayList2 = arrayList;
        C4716.m13052(executorServiceNewFixedThreadPool);
        if (interfaceC22920.mo1827()) {
            return;
        }
        if (atomicReference.get() != null) {
            throw ((IOException) atomicReference.get());
        }
        try {
            m43168(c9474, c1388, interfaceC22920, fileChannelMo3055, z, arrayList2, i);
            if (interfaceC22920.mo1827() || c22525 == null) {
                return;
            }
            long size = c22525.getSize();
            byte[] bArrM52259 = c22525.getHash().m52259();
            C8516 c8516 = new C8516(Math.max(size, 1L));
            c8516.m22241(new C1172(3, interfaceC22920));
            c8516.m22242(0);
            c1388.flush();
            long length = c1388.length();
            if (length != size) {
                StringBuilder sbM39970 = C17114.m39970("Extracted partition size mismatch: expected ", ", actual ", size);
                sbM39970.append(length);
                sbM39970.append(" (");
                sbM39970.append(c9474.m24284());
                sbM39970.append(')');
                throw new IOException(sbM39970.toString());
            }
            MessageDigest messageDigestM49421 = C22253.m49421();
            int i2 = 524288;
            byte[] bArr = new byte[524288];
            long j = 0;
            c1388.seek(0L);
            long j2 = size;
            while (j2 > j) {
                if (interfaceC22920.mo1827()) {
                    return;
                }
                int iMin = (int) Math.min(j2, i2);
                c1388.m4864(bArr, 0, iMin);
                messageDigestM49421.update(bArr, 0, iMin);
                j2 -= (long) iMin;
                c8516.m22242(iMin);
                j = 0;
                i2 = 524288;
            }
            if (size == 0) {
                c8516.m22242(1);
            }
            if (MessageDigest.isEqual(bArrM52259, messageDigestM49421.digest())) {
                return;
            }
            throw new IOException("Partition SHA-256 mismatch: " + c9474.m24284());
        } catch (IOException e) {
            throw e;
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43171(C9474 c9474, final C1388 c1388, InterfaceC22920 interfaceC22920, int i) {
        ArrayList arrayList;
        int i2;
        boolean z;
        long dataLength;
        int i3;
        if (i <= 0 || i > 16) {
            throw new IOException("Download thread count must be between 1 and 16");
        }
        c1388.setLength(0L);
        InterfaceC21850 interfaceC21850Mo4866 = c1388.mo4866();
        final FileChannel fileChannelMo3055 = interfaceC21850Mo4866.mo3055();
        boolean z2 = fileChannelMo3055 != null && interfaceC21850Mo4866.mo3051();
        int i4 = this.f60645;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        long j = 0;
        for (C4885 c4885 : c9474.f32063.getOperationsList()) {
            if (c4885.getType() == EnumC3080.ZERO) {
                arrayList3.add(c4885);
            } else {
                long dataLength2 = c4885.getDataLength();
                if (dataLength2 < 0 || j > C17492.FOREVER_NS - dataLength2) {
                    throw new IOException("Payload operation data length overflow");
                }
                j += dataLength2;
                arrayList2.add(c4885);
            }
        }
        C23846.sort(arrayList2, C7618.comparingLong(new C11631()));
        final AtomicReference atomicReference = new AtomicReference();
        final C6691 c6691 = new C6691();
        C13042 c13042 = new C13042(interfaceC22920, atomicReference);
        int iMin = Math.min(i, arrayList2.size());
        if (iMin > 0) {
            ThreadPoolExecutor threadPoolExecutorM13048 = C4716.m13048(iMin);
            long j2 = j;
            int i5 = 0;
            int i6 = 0;
            while (i5 < iMin) {
                ThreadPoolExecutor threadPoolExecutor = threadPoolExecutorM13048;
                int i7 = iMin - i5;
                int i8 = iMin;
                if (i7 == 1) {
                    int size = arrayList2.size();
                    long dataLength3 = 0;
                    for (int i9 = i6; i9 < size; i9++) {
                        dataLength3 = ((C4885) arrayList2.get(i9)).getDataLength() + dataLength3;
                    }
                    dataLength = dataLength3;
                    i3 = size;
                } else {
                    long j3 = i7;
                    long j4 = (j2 / j3) + ((long) (j2 % j3 == 0 ? 0 : 1));
                    int size2 = (arrayList2.size() - i7) + 1;
                    int i10 = i6;
                    dataLength = 0;
                    while (i10 < size2 && (i10 == i6 || dataLength < j4)) {
                        dataLength = ((C4885) arrayList2.get(i10)).getDataLength() + dataLength;
                        i10++;
                    }
                    i3 = i10;
                }
                final int i11 = i6;
                final ArrayList arrayList4 = arrayList2;
                final int i12 = i3;
                ArrayList arrayList5 = arrayList2;
                final InterfaceC22920 interfaceC22921 = c13042;
                threadPoolExecutor.submit(new Runnable() { // from class: l.ۖۤ֨
                    @Override // java.lang.Runnable
                    public final void run() {
                        C18686.m43169(this.f9790, arrayList4, i11, i12, c1388, fileChannelMo3055, interfaceC22921, atomicReference, c6691);
                    }
                });
                j2 -= dataLength;
                i5++;
                c13042 = c13042;
                threadPoolExecutorM13048 = threadPoolExecutor;
                iMin = i8;
                i6 = i3;
                z2 = z2;
                arrayList3 = arrayList3;
                arrayList2 = arrayList5;
                i4 = i4;
            }
            ThreadPoolExecutor threadPoolExecutor2 = threadPoolExecutorM13048;
            C13042 c13043 = c13042;
            arrayList = arrayList3;
            i2 = i4;
            z = z2;
            threadPoolExecutor2.shutdown();
            while (!threadPoolExecutor2.awaitTermination(100L, TimeUnit.MILLISECONDS)) {
                try {
                    if (c13043.mo1827()) {
                        c6691.m18066();
                        threadPoolExecutor2.shutdownNow();
                    }
                } catch (InterruptedException e) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("Payload extraction was interrupted");
                    interruptedIOException.initCause(e);
                    while (!atomicReference.compareAndSet(null, interruptedIOException) && atomicReference.get() == null) {
                    }
                    c6691.m18066();
                    threadPoolExecutor2.shutdownNow();
                    while (!threadPoolExecutor2.isTerminated()) {
                        try {
                            threadPoolExecutor2.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                        }
                    }
                    Thread.currentThread().interrupt();
                    throw interruptedIOException;
                }
            }
        } else {
            arrayList = arrayList3;
            i2 = i4;
            z = z2;
        }
        if (interfaceC22920.mo1827()) {
            return;
        }
        IOException iOException = (IOException) atomicReference.get();
        if (iOException != null) {
            throw iOException;
        }
        try {
            m43168(c9474, c1388, interfaceC22920, fileChannelMo3055, z, arrayList, i2);
        } catch (IOException e2) {
            throw e2;
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    /* JADX WARN: Not initialized variable reg: 13, insn: 0x00e8: INVOKE (r2v0 ?? I:l.ۜۤ֨), (r13 I:l.۟᩸ۨ) VIRTUAL call: l.ۜۤ֨.ܰ(l.۟᩸ۨ):void A[MD:(l.۟᩸ۨ):void (m)] (LINE:579), block:B:86:0x00e8 */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x00eb: IF  (r13 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:145:?, block:B:87:0x00eb */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43169(C18686 c18686, ArrayList arrayList, int i, int i2, C1388 c1388, FileChannel fileChannel, InterfaceC22920 interfaceC22920, AtomicReference atomicReference, C6691 c6691) {
        C1388 c1388Mo4870;
        C1388 c1389;
        InterfaceC7739 interfaceC7739M18068;
        try {
            try {
                c1388Mo4870 = c18686.f60642.mo4870();
                try {
                    boolean zM18067 = c6691.m18067(c1388Mo4870);
                    if (zM18067) {
                        byte[] bArr = new byte[WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT];
                        byte[] bArr2 = new byte[524288];
                        int i3 = i;
                        while (i3 < i2 && !((C13042) interfaceC22920).mo1827()) {
                            int i4 = i3;
                            c18686.m43167((C4885) arrayList.get(i3), c1388Mo4870, c1388, fileChannel, interfaceC22920, bArr, bArr2);
                            i3 = i4 + 1;
                        }
                        if (zM18067) {
                            c6691.m18068(c1388Mo4870);
                        }
                        try {
                            c1388Mo4870.close();
                            return;
                        } catch (IOException e) {
                            while (!atomicReference.compareAndSet(null, e)) {
                                if (atomicReference.get() != null) {
                                    return;
                                }
                            }
                        }
                    } else {
                        if (zM18067) {
                            c6691.m18068(c1388Mo4870);
                        }
                        try {
                            c1388Mo4870.close();
                            return;
                        } catch (IOException e2) {
                            while (!atomicReference.compareAndSet(null, e2)) {
                                if (atomicReference.get() != null) {
                                    return;
                                }
                            }
                        }
                    }
                } catch (IOException e3) {
                    e = e3;
                    do {
                        if (atomicReference.compareAndSet(null, e)) {
                            c6691.m18066();
                            break;
                        }
                    } while (atomicReference.get() == null);
                    if (0 != 0) {
                        c6691.m18068(c1388Mo4870);
                    }
                    if (c1388Mo4870 == null) {
                        return;
                    }
                    try {
                        c1388Mo4870.close();
                        return;
                    } catch (IOException e4) {
                        while (!atomicReference.compareAndSet(null, e4)) {
                            if (atomicReference.get() != null) {
                                return;
                            }
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    IOException iOException = new IOException(th);
                    do {
                        if (atomicReference.compareAndSet(null, iOException)) {
                            c6691.m18066();
                            break;
                        }
                    } while (atomicReference.get() == null);
                    if (0 != 0) {
                        c6691.m18068(c1388Mo4870);
                    }
                    if (c1388Mo4870 == null) {
                        return;
                    }
                    try {
                        c1388Mo4870.close();
                        return;
                    } catch (IOException e5) {
                        while (!atomicReference.compareAndSet(null, e5)) {
                            if (atomicReference.get() != null) {
                                return;
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                if (0 != 0) {
                    c6691.m18068(interfaceC7739M18068);
                }
                if (c1389 == null) {
                    throw th2;
                }
                try {
                    c1389.close();
                    throw th2;
                } catch (IOException e6) {
                    while (!atomicReference.compareAndSet(null, e6)) {
                        if (atomicReference.get() != null) {
                            throw th2;
                        }
                    }
                    c6691.m18066();
                    throw th2;
                }
            }
        } catch (IOException e7) {
            e = e7;
            c1388Mo4870 = null;
        } catch (Throwable th3) {
            th = th3;
            c1388Mo4870 = null;
        }
        c6691.m18066();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m43167(C4885 c4885, InterfaceC7739 interfaceC7739, C1388 c1388, FileChannel fileChannel, InterfaceC22920 interfaceC22920, byte[] bArr, byte[] bArr2) throws IOException {
        OutputStream c15159;
        long dataLength = c4885.getDataLength();
        long dataOffset = c4885.getDataOffset() + this.f60643;
        long startBlock = c4885.getDstExtents(0).getStartBlock();
        long j = this.f60645;
        long j2 = startBlock * j;
        InputStream c21508 = new C21508(interfaceC7739, dataOffset, dataLength);
        int i = C3868.f14459[c4885.getType().ordinal()];
        if (i != 1) {
            if (i == 2) {
                c21508 = new C6624(new C18845(c21508, bArr));
            } else if (i == 3) {
                c21508 = C10362.m26260(new C18845(c21508, bArr));
            } else if (i == 4) {
                c21508 = new ZstdInputStreamNoFinalizer(c21508, RecyclingBufferPool.INSTANCE);
            } else {
                throw new IOException("Unsupported operation type: " + c4885.getType().getNumber());
            }
        }
        try {
            long numBlocks = c4885.getDstExtents(0).getNumBlocks() * j;
            if (fileChannel == null) {
                c15159 = new C17980(j2, c1388);
            } else {
                c15159 = new C15159(fileChannel, j2);
            }
            m43165(c21508, c15159, interfaceC22920, bArr2, numBlocks);
            c21508.close();
        } catch (Throwable th) {
            try {
                c21508.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43168(C9474 c9474, C1388 c1388, InterfaceC22920 interfaceC22920, FileChannel fileChannel, boolean z, ArrayList arrayList, int i) throws IOException {
        if (z) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Iterator it2 = ((C4885) it.next()).getDstExtentsList().iterator();
                while (it2.hasNext()) {
                    long numBlocks = ((C5903) it2.next()).getNumBlocks() * ((long) i);
                    while (numBlocks > 0) {
                        int iMin = (int) Math.min(numBlocks, 524288);
                        synchronized (interfaceC22920) {
                            interfaceC22920.mo1828(iMin);
                        }
                        numBlocks -= (long) iMin;
                        if (interfaceC22920.mo1827()) {
                            break;
                        }
                    }
                }
                if (interfaceC22920.mo1827()) {
                    return;
                }
            }
            if (fileChannel.size() > c9474.m24283()) {
                throw new IOException("Extracted data exceeds entry size");
            }
            c1388.setLength(c9474.m24283());
            return;
        }
        if (fileChannel != null) {
            c1388.setLength(fileChannel.size());
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            m43166((C4885) it3.next(), c1388, interfaceC22920, i);
            if (interfaceC22920.mo1827()) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43165(InputStream inputStream, OutputStream outputStream, InterfaceC22920 interfaceC22920, byte[] bArr, long j) throws IOException {
        long j2 = 0;
        do {
            int i = inputStream.read(bArr);
            if (i == -1) {
                if (j2 == j) {
                    return;
                }
                StringBuilder sbM39970 = C17114.m39970("Operation size mismatch: expected ", ", actual ", j);
                sbM39970.append(j2);
                throw new IOException(sbM39970.toString());
            }
            long j3 = i;
            if (j3 > j - j2) {
                throw new IOException("Operation data exceeds destination extent");
            }
            synchronized (interfaceC22920) {
                interfaceC22920.mo1828(i);
            }
            outputStream.write(bArr, 0, i);
            j2 += j3;
        } while (!interfaceC22920.mo1827());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43166(C4885 c4885, C1388 c1388, InterfaceC22920 interfaceC22920, int i) {
        for (C5903 c5903 : c4885.getDstExtentsList()) {
            long j = i;
            long numBlocks = c5903.getNumBlocks() * j;
            synchronized (c1388) {
                c1388.seek(c5903.getStartBlock() * j);
                while (numBlocks > 0) {
                    byte[] bArr = f60640;
                    int iMin = (int) Math.min(numBlocks, 524288);
                    synchronized (interfaceC22920) {
                        interfaceC22920.mo1828(iMin);
                    }
                    c1388.write(bArr, 0, iMin);
                    numBlocks -= (long) iMin;
                    if (interfaceC22920.mo1827()) {
                        return;
                    }
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f60642.close();
    }
}
