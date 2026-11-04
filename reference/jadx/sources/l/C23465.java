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

/* JADX INFO: renamed from: l.᩹ۢ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: M9Q4 */
/* JADX INFO: loaded from: classes.dex */
public final class C23465 implements InterfaceC20481 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final byte[] f75918 = new byte[524288];

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public HashMap f75919;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final InterfaceC17713 f75920;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f75921;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ArrayList f75922 = new ArrayList();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f75923;

    public C23465(InterfaceC17713 interfaceC17713) throws IOException {
        this.f75920 = interfaceC17713;
        int i = interfaceC17713.readInt();
        if (i != 1430352451) {
            throw new IOException(String.format("Incorrect magic: %08x", Integer.valueOf(i)));
        }
        long jReverseBytes = Long.reverseBytes(interfaceC17713.readLong());
        if (jReverseBytes != 2) {
            throw new IOException(C24770.m55292(jReverseBytes, "Unsupported payload version: "));
        }
        long jReverseBytes2 = Long.reverseBytes(interfaceC17713.readLong());
        if (jReverseBytes2 <= 0 || jReverseBytes2 > 2147483647L) {
            throw new IOException(C24770.m55292(jReverseBytes2, "Incorrect manifest length: "));
        }
        int iReverseBytes = Integer.reverseBytes(interfaceC17713.readInt());
        if (iReverseBytes <= 0) {
            throw new IOException(C13645.m33382(iReverseBytes, "Incorrect metadata signature length: "));
        }
        byte[] bArr = new byte[(int) jReverseBytes2];
        interfaceC17713.readFully(bArr);
        C17235 from = C17235.parseFrom(bArr);
        this.f75921 = jReverseBytes2 + 24 + ((long) iReverseBytes);
        int blockSize = from.getBlockSize();
        this.f75923 = blockSize;
        for (C24935 c24935 : from.getPartitionsList()) {
            if (c24935.hasPartitionName()) {
                Iterator it = c24935.getOperationsList().iterator();
                long numBlocks = 0;
                while (true) {
                    if (!it.hasNext()) {
                        this.f75922.add(new C4819(c24935, blockSize));
                        break;
                    }
                    C4797 c4797 = (C4797) it.next();
                    int i2 = C1836.f6214[c4797.getType().ordinal()];
                    if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4) {
                        if (c4797.getDstExtentsCount() == 1 && c4797.getDstExtents(0).getStartBlock() == numBlocks) {
                            numBlocks += c4797.getDstExtents(0).getNumBlocks();
                        }
                    } else if (i2 == 5) {
                        Iterator it2 = c4797.getDstExtentsList().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                C9776 c9776 = (C9776) it2.next();
                                if (c9776.getStartBlock() == numBlocks) {
                                    numBlocks += c9776.getNumBlocks();
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
            }
            System.out.println("check failed: " + c24935.getPartitionName());
        }
        if (this.f75922.isEmpty() && from.getPartitionsCount() > 0) {
            throw new IOException(C21576.m49088(R.string.MT_Protector));
        }
    }

    @Override // l.InterfaceC20481
    /* JADX INFO: renamed from: ܿ᩷ */
    public final List mo8645() {
        return this.f75922;
    }

    @Override // l.InterfaceC20481
    public final C4819 getEntry(String str) {
        HashMap map = this.f75919;
        if (map == null) {
            ArrayList<C4819> arrayList = this.f75922;
            map = new HashMap(arrayList.size());
            this.f75919 = map;
            for (C4819 c4819 : arrayList) {
                map.put(c4819.m14851(), c4819);
            }
        }
        return (C4819) map.get(str);
    }

    @Override // l.InterfaceC20481
    /* JADX INFO: renamed from: ֫ */
    public final C4819 mo8640(String str) throws IOException {
        C4819 entry = getEntry(str);
        if (entry != null) {
            return entry;
        }
        throw new IOException(C25272.m56409("Entry not found: ", str));
    }

    @Override // l.InterfaceC20481
    /* JADX INFO: renamed from: ۙ */
    public final C20177 mo8642(C4819 c4819) {
        return new C20177(new C13022(this, c4819.f16862.getOperationsList().iterator(), this.f75923, this.f75921));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m52675(C23465 c23465, InterfaceC24957 interfaceC24957, AtomicReference atomicReference, C4797 c4797, C13961 c13961, FileChannel fileChannel, C19735 c19735, C15259 c15259) {
        try {
            if (!interfaceC24957.mo13156() && atomicReference.get() == null) {
                c23465.m52672(c4797, c23465.f75920, c13961, fileChannel, interfaceC24957, (byte[]) c19735.get(), (byte[]) c15259.get());
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
    /* JADX WARN: Type inference failed for: r21v0, types: [l.ܳۢ۫] */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r22v0, types: [l.ᩴۢ۫] */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v2 */
    @Override // l.InterfaceC20481
    /* JADX INFO: renamed from: ۙ */
    public final void mo8643(C4819 c4819, C13961 c13961, final InterfaceC24957 interfaceC24957) throws IOException {
        C15237 c15237;
        final ?? r21;
        final ?? r22;
        C24935 c24935 = c4819.f16862;
        if (c24935.hasNewPartitionInfo()) {
            C15237 newPartitionInfo = c24935.getNewPartitionInfo();
            if (newPartitionInfo.hasSize() && newPartitionInfo.hasHash()) {
                if (newPartitionInfo.getSize() != c4819.m14850() || newPartitionInfo.getHash().size() != 32) {
                    throw new IOException("Invalid partition verification metadata: " + c4819.m14851());
                }
                c15237 = newPartitionInfo;
            } else {
                c15237 = null;
            }
        } else {
            c15237 = null;
        }
        c13961.setLength(0L);
        InterfaceC15475 interfaceC15475Mo34028 = c13961.mo34028();
        final FileChannel fileChannelMo7066 = interfaceC15475Mo34028.mo7066();
        boolean z = fileChannelMo7066 != null && interfaceC15475Mo34028.mo7067();
        int i = this.f75923;
        final C4100 c4100 = new C4100();
        ThreadLocal threadLocal = new ThreadLocal() { // from class: l.ᩴۢ۫
            @Override // java.lang.ThreadLocal
            public final Object initialValue() {
                c4100.getClass();
                return new byte[WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT];
            }
        };
        final C21973 c21973 = new C21973();
        ThreadLocal threadLocal2 = new ThreadLocal() { // from class: l.ܳۢ۫
            @Override // java.lang.ThreadLocal
            public final Object initialValue() {
                c21973.getClass();
                return new byte[524288];
            }
        };
        ExecutorService executorService = C5261.f18541;
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(C11138.f35105);
        final AtomicReference atomicReference = new AtomicReference();
        ArrayList arrayList = new ArrayList();
        C13961 c13962 = c13961;
        final C23465 c23465 = this;
        ?? r14 = threadLocal2;
        ?? r15 = threadLocal;
        for (final C4797 c4797 : c24935.getOperationsList()) {
            if (c4797.getType() == EnumC13506.ZERO) {
                arrayList.add(c4797);
                r21 = r14;
                r22 = r15;
            } else {
                r21 = r14;
                r22 = r15;
                final C13961 c13963 = c13962;
                executorServiceNewFixedThreadPool.submit(new Runnable() { // from class: l.ۤۢ۫
                    @Override // java.lang.Runnable
                    public final void run() {
                        C23465.m52675(this.f34226, interfaceC24957, atomicReference, c4797, c13963, fileChannelMo7066, r22, r21);
                    }
                });
                c13962 = c13961;
                c23465 = this;
            }
            arrayList = arrayList;
            r14 = r21;
            r15 = r22;
        }
        ArrayList arrayList2 = arrayList;
        C5261.m15837(executorServiceNewFixedThreadPool);
        if (interfaceC24957.mo13156()) {
            return;
        }
        if (atomicReference.get() != null) {
            IOException iOException = (IOException) atomicReference.get();
            C22327.m50389(iOException);
            throw iOException;
        }
        try {
            m52673(c4819, c13961, interfaceC24957, fileChannelMo7066, z, arrayList2, i);
            if (interfaceC24957.mo13156() || c15237 == null) {
                return;
            }
            long size = c15237.getSize();
            byte[] bArrM40222 = c15237.getHash().m40222();
            C3374 c3374 = new C3374(Math.max(size, 1L));
            c3374.m11078(new C25360(interfaceC24957));
            c3374.m11079(0);
            c13961.flush();
            long length = c13961.length();
            if (length != size) {
                StringBuilder sbM8289 = C2458.m8289("Extracted partition size mismatch: expected ", ", actual ", size);
                sbM8289.append(length);
                sbM8289.append(" (");
                sbM8289.append(c4819.m14851());
                sbM8289.append(')');
                throw new IOException(sbM8289.toString());
            }
            MessageDigest messageDigestM36179 = C15022.m36179();
            int i2 = 524288;
            byte[] bArr = new byte[524288];
            long j = 0;
            c13961.seek(0L);
            long j2 = size;
            while (j2 > j) {
                if (interfaceC24957.mo13156()) {
                    return;
                }
                int iMin = (int) Math.min(j2, i2);
                c13961.readFully(bArr, 0, iMin);
                messageDigestM36179.update(bArr, 0, iMin);
                j2 -= (long) iMin;
                c3374.m11079(iMin);
                j = 0;
                i2 = 524288;
            }
            if (size == 0) {
                c3374.m11079(1);
            }
            if (MessageDigest.isEqual(bArrM40222, messageDigestM36179.digest())) {
                return;
            }
            throw new IOException("Partition SHA-256 mismatch: " + c4819.m14851());
        } catch (IOException e) {
            throw e;
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52676(C4819 c4819, final C13961 c13961, InterfaceC24957 interfaceC24957, int i) {
        ArrayList arrayList;
        int i2;
        boolean z;
        long dataLength;
        int i3;
        if (i <= 0 || i > 16) {
            throw new IOException("Download thread count must be between 1 and 16");
        }
        c13961.setLength(0L);
        InterfaceC15475 interfaceC15475Mo34028 = c13961.mo34028();
        final FileChannel fileChannelMo7066 = interfaceC15475Mo34028.mo7066();
        boolean z2 = fileChannelMo7066 != null && interfaceC15475Mo34028.mo7067();
        int i4 = this.f75923;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        long j = 0;
        for (C4797 c4797 : c4819.f16862.getOperationsList()) {
            if (c4797.getType() == EnumC13506.ZERO) {
                arrayList3.add(c4797);
            } else {
                long dataLength2 = c4797.getDataLength();
                if (dataLength2 < 0 || j > C25227.FOREVER_NS - dataLength2) {
                    throw new IOException("Payload operation data length overflow");
                }
                j += dataLength2;
                arrayList2.add(c4797);
            }
        }
        C12884.sort(arrayList2, C2661.comparingLong(new C9262(1)));
        final AtomicReference atomicReference = new AtomicReference();
        final C11530 c11530 = new C11530();
        C5565 c5565 = new C5565(interfaceC24957, atomicReference);
        int iMin = Math.min(i, arrayList2.size());
        if (iMin > 0) {
            ThreadPoolExecutor threadPoolExecutorM15832 = C5261.m15832(iMin);
            long j2 = j;
            int i5 = 0;
            int i6 = 0;
            while (i5 < iMin) {
                ThreadPoolExecutor threadPoolExecutor = threadPoolExecutorM15832;
                int i7 = iMin - i5;
                int i8 = iMin;
                if (i7 == 1) {
                    int size = arrayList2.size();
                    long dataLength3 = 0;
                    for (int i9 = i6; i9 < size; i9++) {
                        dataLength3 = ((C4797) arrayList2.get(i9)).getDataLength() + dataLength3;
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
                        dataLength = ((C4797) arrayList2.get(i10)).getDataLength() + dataLength;
                        i10++;
                    }
                    i3 = i10;
                }
                final int i11 = i6;
                final ArrayList arrayList4 = arrayList2;
                final int i12 = i3;
                ArrayList arrayList5 = arrayList2;
                final InterfaceC24957 interfaceC24958 = c5565;
                threadPoolExecutor.submit(new Runnable() { // from class: l.᩸ۢ۫
                    @Override // java.lang.Runnable
                    public final void run() {
                        C23465.m52674(this.f73748, arrayList4, i11, i12, c13961, fileChannelMo7066, interfaceC24958, atomicReference, c11530);
                    }
                });
                j2 -= dataLength;
                i5++;
                c5565 = c5565;
                threadPoolExecutorM15832 = threadPoolExecutor;
                iMin = i8;
                i6 = i3;
                z2 = z2;
                arrayList3 = arrayList3;
                arrayList2 = arrayList5;
                i4 = i4;
            }
            ThreadPoolExecutor threadPoolExecutor2 = threadPoolExecutorM15832;
            C5565 c5566 = c5565;
            arrayList = arrayList3;
            i2 = i4;
            z = z2;
            threadPoolExecutor2.shutdown();
            while (!threadPoolExecutor2.awaitTermination(100L, TimeUnit.MILLISECONDS)) {
                try {
                    if (c5566.mo13156()) {
                        c11530.m29031();
                        threadPoolExecutor2.shutdownNow();
                    }
                } catch (InterruptedException e) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("Payload extraction was interrupted");
                    interruptedIOException.initCause(e);
                    while (!atomicReference.compareAndSet(null, interruptedIOException) && atomicReference.get() == null) {
                    }
                    c11530.m29031();
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
        if (interfaceC24957.mo13156()) {
            return;
        }
        IOException iOException = (IOException) atomicReference.get();
        if (iOException != null) {
            C22327.m50389(iOException);
            throw iOException;
        }
        try {
            m52673(c4819, c13961, interfaceC24957, fileChannelMo7066, z, arrayList, i2);
        } catch (IOException e2) {
            throw e2;
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    /* JADX WARN: Not initialized variable reg: 13, insn: 0x00e8: INVOKE (r2v0 ?? I:l.ۧۢ۫), (r13 I:l.ܽܽۤ) VIRTUAL call: l.ۧۢ۫.᩷(l.ܽܽۤ):void A[MD:(l.ܽܽۤ):void (m)] (LINE:580), block:B:86:0x00e8 */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x00eb: IF  (r13 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:145:?, block:B:87:0x00eb */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52674(C23465 c23465, ArrayList arrayList, int i, int i2, C13961 c13961, FileChannel fileChannel, InterfaceC24957 interfaceC24957, AtomicReference atomicReference, C11530 c11530) {
        C13961 c13961Mo34035;
        C13961 c13962;
        InterfaceC17713 interfaceC17713M29033;
        try {
            try {
                c13961Mo34035 = c23465.f75920.mo34035();
                try {
                    boolean zM29032 = c11530.m29032(c13961Mo34035);
                    if (zM29032) {
                        byte[] bArr = new byte[WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT];
                        byte[] bArr2 = new byte[524288];
                        int i3 = i;
                        while (i3 < i2 && !((C5565) interfaceC24957).mo13156()) {
                            int i4 = i3;
                            c23465.m52672((C4797) arrayList.get(i3), c13961Mo34035, c13961, fileChannel, interfaceC24957, bArr, bArr2);
                            i3 = i4 + 1;
                        }
                        if (zM29032) {
                            c11530.m29033(c13961Mo34035);
                        }
                        try {
                            c13961Mo34035.close();
                            return;
                        } catch (IOException e) {
                            while (!atomicReference.compareAndSet(null, e)) {
                                if (atomicReference.get() != null) {
                                    return;
                                }
                            }
                        }
                    } else {
                        if (zM29032) {
                            c11530.m29033(c13961Mo34035);
                        }
                        try {
                            c13961Mo34035.close();
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
                            c11530.m29031();
                            break;
                        }
                    } while (atomicReference.get() == null);
                    if (0 != 0) {
                        c11530.m29033(c13961Mo34035);
                    }
                    if (c13961Mo34035 == null) {
                        return;
                    }
                    try {
                        c13961Mo34035.close();
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
                            c11530.m29031();
                            break;
                        }
                    } while (atomicReference.get() == null);
                    if (0 != 0) {
                        c11530.m29033(c13961Mo34035);
                    }
                    if (c13961Mo34035 == null) {
                        return;
                    }
                    try {
                        c13961Mo34035.close();
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
                    c11530.m29033(interfaceC17713M29033);
                }
                if (c13962 == null) {
                    throw th2;
                }
                try {
                    c13962.close();
                    throw th2;
                } catch (IOException e6) {
                    while (!atomicReference.compareAndSet(null, e6)) {
                        if (atomicReference.get() != null) {
                            throw th2;
                        }
                    }
                    c11530.m29031();
                    throw th2;
                }
            }
        } catch (IOException e7) {
            e = e7;
            c13961Mo34035 = null;
        } catch (Throwable th3) {
            th = th3;
            c13961Mo34035 = null;
        }
        c11530.m29031();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m52672(C4797 c4797, InterfaceC17713 interfaceC17713, C13961 c13961, FileChannel fileChannel, InterfaceC24957 interfaceC24957, byte[] bArr, byte[] bArr2) throws IOException {
        OutputStream c16751;
        long dataLength = c4797.getDataLength();
        long dataOffset = c4797.getDataOffset() + this.f75921;
        long startBlock = c4797.getDstExtents(0).getStartBlock();
        long j = this.f75923;
        long j2 = startBlock * j;
        InputStream c17497 = new C17497(interfaceC17713, dataOffset, dataLength);
        int i = C1836.f6214[c4797.getType().ordinal()];
        if (i != 1) {
            if (i == 2) {
                c17497 = new C1024(new C7746(c17497, bArr));
            } else if (i == 3) {
                c17497 = C24653.m55007(new C7746(c17497, bArr));
            } else if (i == 4) {
                c17497 = new ZstdInputStreamNoFinalizer(c17497, RecyclingBufferPool.INSTANCE);
            } else {
                throw new IOException("Unsupported operation type: " + c4797.getType().getNumber());
            }
        }
        try {
            long numBlocks = c4797.getDstExtents(0).getNumBlocks() * j;
            if (fileChannel == null) {
                c16751 = new C16005(j2, c13961);
            } else {
                c16751 = new C16751(fileChannel, j2);
            }
            m52670(c17497, c16751, interfaceC24957, bArr2, numBlocks);
            c17497.close();
        } catch (Throwable th) {
            try {
                c17497.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52673(C4819 c4819, C13961 c13961, InterfaceC24957 interfaceC24957, FileChannel fileChannel, boolean z, ArrayList arrayList, int i) throws IOException {
        if (z) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Iterator it2 = ((C4797) it.next()).getDstExtentsList().iterator();
                while (it2.hasNext()) {
                    long numBlocks = ((C9776) it2.next()).getNumBlocks() * ((long) i);
                    while (numBlocks > 0) {
                        int iMin = (int) Math.min(numBlocks, 524288);
                        synchronized (interfaceC24957) {
                            interfaceC24957.mo13155(iMin);
                        }
                        numBlocks -= (long) iMin;
                        if (interfaceC24957.mo13156()) {
                            break;
                        }
                    }
                }
                if (interfaceC24957.mo13156()) {
                    return;
                }
            }
            if (fileChannel.size() > c4819.m14850()) {
                throw new IOException("Extracted data exceeds entry size");
            }
            c13961.setLength(c4819.m14850());
            return;
        }
        if (fileChannel != null) {
            c13961.setLength(fileChannel.size());
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            m52671((C4797) it3.next(), c13961, interfaceC24957, i);
            if (interfaceC24957.mo13156()) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52670(InputStream inputStream, OutputStream outputStream, InterfaceC24957 interfaceC24957, byte[] bArr, long j) throws IOException {
        long j2 = 0;
        do {
            int i = inputStream.read(bArr);
            if (i == -1) {
                if (j2 == j) {
                    return;
                }
                StringBuilder sbM8289 = C2458.m8289("Operation size mismatch: expected ", ", actual ", j);
                sbM8289.append(j2);
                throw new IOException(sbM8289.toString());
            }
            long j3 = i;
            if (j3 > j - j2) {
                throw new IOException("Operation data exceeds destination extent");
            }
            synchronized (interfaceC24957) {
                interfaceC24957.mo13155(i);
            }
            outputStream.write(bArr, 0, i);
            j2 += j3;
        } while (!interfaceC24957.mo13156());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52671(C4797 c4797, C13961 c13961, InterfaceC24957 interfaceC24957, int i) {
        for (C9776 c9776 : c4797.getDstExtentsList()) {
            long j = i;
            long numBlocks = c9776.getNumBlocks() * j;
            synchronized (c13961) {
                c13961.seek(c9776.getStartBlock() * j);
                while (numBlocks > 0) {
                    byte[] bArr = f75918;
                    int iMin = (int) Math.min(numBlocks, 524288);
                    synchronized (interfaceC24957) {
                        interfaceC24957.mo13155(iMin);
                    }
                    c13961.write(bArr, 0, iMin);
                    numBlocks -= (long) iMin;
                    if (interfaceC24957.mo13156()) {
                        return;
                    }
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f75920.close();
    }
}
