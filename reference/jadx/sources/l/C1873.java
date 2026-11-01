package l;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.֫ܰ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes2.dex */
public final class C1873 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long f7096;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final RandomAccessFile f7097;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f7098;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C5339 f7100;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final FileChannel f7101;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final TreeMap f7099 = new TreeMap();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public volatile boolean f7102 = true;

    public C1873(RandomAccessFile randomAccessFile, C5339 c5339) {
        this.f7097 = randomAccessFile;
        this.f7101 = C6001.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel());
        this.f7100 = c5339;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1873 m6071(File file) throws Throwable {
        C5339 c5339;
        if (!file.isDirectory()) {
            throw new IOException("Hex clipboard cache directory is unavailable");
        }
        File fileCreateTempFile = File.createTempFile("hex-clipboard-arena-", ".tmp", file);
        RandomAccessFile randomAccessFile = null;
        try {
            C5339 c5339M49439 = C22273.m49439();
            try {
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(fileCreateTempFile, "rw");
                try {
                    if (!fileCreateTempFile.delete()) {
                        throw new IOException("Could not unlink hex clipboard arena file");
                    }
                    return new C1873(randomAccessFile2, c5339M49439);
                } catch (IOException | Error | RuntimeException e) {
                    e = e;
                    randomAccessFile = randomAccessFile2;
                    c5339 = c5339M49439;
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (IOException e2) {
                            e.addSuppressed(e2);
                        }
                    }
                    if (c5339 != null) {
                        c5339.close();
                    }
                    if (fileCreateTempFile.exists() && !fileCreateTempFile.delete()) {
                        e.addSuppressed(new IOException("Could not delete hex clipboard arena file"));
                        throw e;
                    }
                    throw e;
                }
            } catch (IOException | Error | RuntimeException e3) {
                c5339 = c5339M49439;
                e = e3;
            }
        } catch (IOException | Error | RuntimeException e4) {
            e = e4;
            c5339 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21629 m6078(int i) throws IOException {
        Map.Entry entry;
        m6075();
        m6077();
        Iterator it = this.f7099.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                entry = null;
                break;
            }
            entry = (Map.Entry) it.next();
        } while (((Long) entry.getValue()).longValue() < i);
        if (entry != null) {
            return m6072(entry, i);
        }
        long j = this.f7096;
        long j2 = i;
        long j3 = j + j2;
        if (!((j2 ^ j) < 0) && !((j ^ j3) >= 0)) {
            try {
                throw new ArithmeticException();
            } catch (ArithmeticException e) {
                throw new IOException("Hex clipboard arena offset overflow", e);
            }
        }
        if (j3 > 2348810239L) {
            throw new IOException("Hex clipboard shared arena exceeds storage limit");
        }
        this.f7096 = j3;
        int i2 = this.f7098;
        if (i2 == Integer.MAX_VALUE) {
            throw new ArithmeticException();
        }
        this.f7098 = i2 + 1;
        return new C21629(i, j, this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21629 m6079(int i, long j) throws ClosedChannelException {
        m6075();
        m6077();
        for (Map.Entry entry : this.f7099.entrySet()) {
            if (((Long) entry.getKey()).longValue() >= j) {
                return null;
            }
            if (((Long) entry.getValue()).longValue() >= i) {
                return m6072(entry, i);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m6084(int i, long j) {
        m6075();
        if (!this.f7102) {
            return false;
        }
        for (Map.Entry entry : this.f7099.entrySet()) {
            if (((Long) entry.getKey()).longValue() >= j) {
                return false;
            }
            if (((Long) entry.getValue()).longValue() >= i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m6081() {
        m6075();
        Iterator it = this.f7099.values().iterator();
        long jM6676 = 0;
        while (it.hasNext()) {
            jM6676 = C2124.m6676(jM6676, ((Long) it.next()).longValue());
            if (jM6676 > 33554432) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C21629 m6072(Map.Entry entry, int i) {
        Long l2 = (Long) entry.getKey();
        long jLongValue = l2.longValue();
        long jLongValue2 = ((Long) entry.getValue()).longValue();
        TreeMap treeMap = this.f7099;
        treeMap.remove(l2);
        long j = i;
        if (jLongValue2 > j) {
            treeMap.put(Long.valueOf(jLongValue + j), Long.valueOf(jLongValue2 - j));
        }
        int i2 = this.f7098;
        if (i2 == Integer.MAX_VALUE) {
            throw new ArithmeticException();
        }
        this.f7098 = i2 + 1;
        return new C21629(i, jLongValue, this);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m6082(int i, long j) {
        synchronized (C2516.f9975) {
            m6077();
            int i2 = this.f7098;
            if (i2 <= 0) {
                throw new IllegalStateException("Hex clipboard arena allocation underflow");
            }
            int i3 = i2 - 1;
            this.f7098 = i3;
            if (i3 == 0) {
                this.f7102 = false;
                this.f7099.clear();
                this.f7096 = 0L;
                if (C2516.f9973 == this) {
                    C2516.f9973 = null;
                }
                C5339 c5339 = this.f7100;
                try {
                    this.f7097.close();
                    c5339.close();
                    return;
                } catch (Throwable th) {
                    c5339.close();
                    throw th;
                }
            }
            m6073(j, i);
            m6070();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m6083(long j, byte[] bArr, int i, int i2) throws IOException {
        m6077();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i, i2);
        while (byteBufferWrap.hasRemaining()) {
            int iWrite = this.f7101.write(byteBufferWrap, j);
            if (iWrite == 0) {
                Thread.yield();
            } else {
                j += (long) iWrite;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6080(long j, byte[] bArr, int i, int i2) throws IOException {
        m6077();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i, i2);
        while (byteBufferWrap.hasRemaining()) {
            int i3 = this.f7101.read(byteBufferWrap, j);
            if (i3 < 0) {
                throw new EOFException("Unexpected end of hex clipboard arena");
            }
            if (i3 == 0) {
                Thread.yield();
            } else {
                j += (long) i3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0077  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m6073(long j, long j2) {
        long jLongValue;
        long j3 = j + j2;
        if (!((j ^ j2) < 0) && !((j ^ j3) >= 0)) {
            throw new ArithmeticException();
        }
        Long lValueOf = Long.valueOf(j);
        TreeMap treeMap = this.f7099;
        Map.Entry entryFloorEntry = treeMap.floorEntry(lValueOf);
        if (entryFloorEntry != null) {
            long jLongValue2 = ((Long) entryFloorEntry.getKey()).longValue();
            long jLongValue3 = ((Long) entryFloorEntry.getValue()).longValue();
            long j4 = jLongValue2 + jLongValue3;
            if (!((jLongValue2 ^ j4) >= 0) && !(((jLongValue3 ^ jLongValue2) > 0 ? 1 : ((jLongValue3 ^ jLongValue2) == 0 ? 0 : -1)) < 0)) {
                throw new ArithmeticException();
            }
            if (j4 > j) {
                throw new IllegalStateException("Overlapping hex clipboard free block");
            }
            if (j4 == j) {
                jLongValue = ((Long) entryFloorEntry.getKey()).longValue();
                treeMap.remove(entryFloorEntry.getKey());
            } else {
                jLongValue = j;
            }
        } else {
            jLongValue = j;
        }
        Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Long.valueOf(jLongValue));
        if (entryCeilingEntry != null) {
            if (((Long) entryCeilingEntry.getKey()).longValue() < j3) {
                throw new IllegalStateException("Overlapping hex clipboard free block");
            }
            if (((Long) entryCeilingEntry.getKey()).longValue() == j3) {
                long jLongValue4 = ((Long) entryCeilingEntry.getKey()).longValue();
                long jLongValue5 = ((Long) entryCeilingEntry.getValue()).longValue();
                long j5 = jLongValue4 + jLongValue5;
                if (!((jLongValue5 ^ jLongValue4) < 0) && !((jLongValue4 ^ j5) >= 0)) {
                    throw new ArithmeticException();
                }
                treeMap.remove(entryCeilingEntry.getKey());
                j3 = j5;
            }
        }
        treeMap.put(Long.valueOf(jLongValue), Long.valueOf(j3 - jLongValue));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m6070() throws IOException {
        TreeMap treeMap;
        long jLongValue = this.f7096;
        ArrayList arrayList = new ArrayList();
        while (true) {
            Long lValueOf = Long.valueOf(1 + jLongValue);
            treeMap = this.f7099;
            Map.Entry entryLowerEntry = treeMap.lowerEntry(lValueOf);
            if (entryLowerEntry == null) {
                break;
            }
            if (((Long) entryLowerEntry.getValue()).longValue() + ((Long) entryLowerEntry.getKey()).longValue() != jLongValue) {
                break;
            }
            arrayList.add((Long) entryLowerEntry.getKey());
            jLongValue = ((Long) entryLowerEntry.getKey()).longValue();
        }
        if (jLongValue == this.f7096) {
            return;
        }
        this.f7101.truncate(jLongValue);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            treeMap.remove((Long) it.next());
        }
        this.f7096 = jLongValue;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m6077() throws ClosedChannelException {
        if (!this.f7102) {
            throw new ClosedChannelException();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m6075() {
        if (!Thread.holdsLock(C2516.f9975)) {
            throw new IllegalStateException("Hex clipboard arena lock is not held");
        }
    }
}
