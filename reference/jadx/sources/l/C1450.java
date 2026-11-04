package l;

import java.io.FileWriter;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.֨᩷᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes2.dex */
public final class C1450 implements Iterable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ConcurrentLinkedQueue f5075;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AtomicInteger f5076;

    public C1450() {
        this.f5075 = null;
        this.f5076 = null;
        this.f5075 = new ConcurrentLinkedQueue();
        this.f5076 = new AtomicInteger(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5223(String str) {
        int length = str.length();
        this.f5075.add(str);
        this.f5076.addAndGet(length);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5222(FileWriter fileWriter, char[] cArr) {
        if (fileWriter == null || cArr == null || cArr.length == 0) {
            return;
        }
        int length = cArr.length;
        int i = 0;
        int i2 = length;
        for (String str : this.f5075) {
            int length2 = str.length();
            int i3 = 0;
            while (length2 > 0) {
                int i4 = i2 > length2 ? length2 : i2;
                int i5 = i3 + i4;
                str.getChars(i3, i5, cArr, i);
                i2 -= i4;
                i += i4;
                length2 -= i4;
                if (i2 == 0) {
                    try {
                        fileWriter.write(cArr, 0, length);
                    } catch (Exception unused) {
                    }
                    i = 0;
                    i2 = length;
                }
                i3 = i5;
            }
        }
        if (i > 0) {
            try {
                fileWriter.write(cArr, 0, i);
            } catch (Exception unused2) {
            }
        }
        try {
            fileWriter.flush();
        } catch (Exception unused3) {
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m5225() {
        return this.f5076.get();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m5224() {
        this.f5075.clear();
        this.f5076.set(0);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f5075.iterator();
    }
}
