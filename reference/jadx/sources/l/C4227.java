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

/* JADX INFO: renamed from: l.ۘܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes2.dex */
public final class C4227 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f15419;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C10192 f15420;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f15421;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final FileChannel f15424;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final RandomAccessFile f15425;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final TreeMap f15423 = new TreeMap();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public volatile boolean f15422 = true;

    public C4227(RandomAccessFile randomAccessFile, C10192 c10192) {
        this.f15425 = randomAccessFile;
        this.f15424 = C19853.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel());
        this.f15420 = c10192;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4227 m13486(File file) throws Throwable {
        C10192 c10192;
        if (!file.isDirectory()) {
            throw new IOException("Hex clipboard cache directory is unavailable");
        }
        File fileCreateTempFile = File.createTempFile("hex-clipboard-arena-", ".tmp", file);
        RandomAccessFile randomAccessFile = null;
        try {
            C10192 c10192M4496 = C1244.m4496();
            try {
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(fileCreateTempFile, "rw");
                try {
                    if (!fileCreateTempFile.delete()) {
                        throw new IOException("Could not unlink hex clipboard arena file");
                    }
                    return new C4227(randomAccessFile2, c10192M4496);
                } catch (IOException | Error | RuntimeException e) {
                    e = e;
                    randomAccessFile = randomAccessFile2;
                    c10192 = c10192M4496;
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (IOException e2) {
                            e.addSuppressed(e2);
                        }
                    }
                    if (c10192 != null) {
                        c10192.close();
                    }
                    if (fileCreateTempFile.exists() && !fileCreateTempFile.delete()) {
                        e.addSuppressed(new IOException("Could not delete hex clipboard arena file"));
                        throw e;
                    }
                    throw e;
                }
            } catch (IOException | Error | RuntimeException e3) {
                c10192 = c10192M4496;
                e = e3;
            }
        } catch (IOException | Error | RuntimeException e4) {
            e = e4;
            c10192 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22127 m13494(int i) throws IOException {
        Map.Entry entry;
        m13490();
        m13492();
        Iterator it = this.f15423.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                entry = null;
                break;
            }
            entry = (Map.Entry) it.next();
        } while (((Long) entry.getValue()).longValue() < i);
        if (entry != null) {
            return m13487(entry, i);
        }
        long j = this.f15421;
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
        this.f15421 = j3;
        int i2 = this.f15419;
        if (i2 == Integer.MAX_VALUE) {
            throw new ArithmeticException();
        }
        this.f15419 = i2 + 1;
        return new C22127(i, j, this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22127 m13495(int i, long j) throws ClosedChannelException {
        m13490();
        m13492();
        for (Map.Entry entry : this.f15423.entrySet()) {
            if (((Long) entry.getKey()).longValue() >= j) {
                return null;
            }
            if (((Long) entry.getValue()).longValue() >= i) {
                return m13487(entry, i);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m13500(int i, long j) {
        m13490();
        if (!this.f15422) {
            return false;
        }
        for (Map.Entry entry : this.f15423.entrySet()) {
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
    public final boolean m13497() {
        m13490();
        Iterator it = this.f15423.values().iterator();
        long jM10044 = 0;
        while (it.hasNext()) {
            jM10044 = C3077.m10044(jM10044, ((Long) it.next()).longValue());
            if (jM10044 > 33554432) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C22127 m13487(Map.Entry entry, int i) {
        Long l2 = (Long) entry.getKey();
        long jLongValue = l2.longValue();
        long jLongValue2 = ((Long) entry.getValue()).longValue();
        TreeMap treeMap = this.f15423;
        treeMap.remove(l2);
        long j = i;
        if (jLongValue2 > j) {
            treeMap.put(Long.valueOf(jLongValue + j), Long.valueOf(jLongValue2 - j));
        }
        int i2 = this.f15419;
        if (i2 == Integer.MAX_VALUE) {
            throw new ArithmeticException();
        }
        this.f15419 = i2 + 1;
        return new C22127(i, jLongValue, this);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m13498(int i, long j) {
        synchronized (C19143.f61935) {
            m13492();
            int i2 = this.f15419;
            if (i2 <= 0) {
                throw new IllegalStateException("Hex clipboard arena allocation underflow");
            }
            int i3 = i2 - 1;
            this.f15419 = i3;
            if (i3 == 0) {
                this.f15422 = false;
                this.f15423.clear();
                this.f15421 = 0L;
                if (C19143.f61937 == this) {
                    C19143.f61937 = null;
                }
                C10192 c10192 = this.f15420;
                try {
                    this.f15425.close();
                    c10192.close();
                    return;
                } catch (Throwable th) {
                    c10192.close();
                    throw th;
                }
            }
            m13488(j, i);
            m13493();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m13499(long j, byte[] bArr, int i, int i2) throws IOException {
        m13492();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i, i2);
        while (byteBufferWrap.hasRemaining()) {
            int iWrite = this.f15424.write(byteBufferWrap, j);
            if (iWrite == 0) {
                Thread.yield();
            } else {
                j += (long) iWrite;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13496(long j, byte[] bArr, int i, int i2) throws IOException {
        m13492();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i, i2);
        while (byteBufferWrap.hasRemaining()) {
            int i3 = this.f15424.read(byteBufferWrap, j);
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
    private void m13488(long j, long j2) {
        long jLongValue;
        long j3 = j + j2;
        if (!((j ^ j2) < 0) && !((j ^ j3) >= 0)) {
            throw new ArithmeticException();
        }
        Long lValueOf = Long.valueOf(j);
        TreeMap treeMap = this.f15423;
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

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m13493() throws IOException {
        TreeMap treeMap;
        long jLongValue = this.f15421;
        ArrayList arrayList = new ArrayList();
        while (true) {
            Long lValueOf = Long.valueOf(1 + jLongValue);
            treeMap = this.f15423;
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
        if (jLongValue == this.f15421) {
            return;
        }
        this.f15424.truncate(jLongValue);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            treeMap.remove((Long) it.next());
        }
        this.f15421 = jLongValue;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m13492() throws ClosedChannelException {
        if (!this.f15422) {
            throw new ClosedChannelException();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m13490() {
        if (!Thread.holdsLock(C19143.f61935)) {
            throw new IllegalStateException("Hex clipboard arena lock is not held");
        }
    }
}
