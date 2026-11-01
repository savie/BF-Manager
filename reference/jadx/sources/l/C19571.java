package l;

import java.io.FileWriter;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.᩵ܺᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class C19571 implements Iterable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public ConcurrentLinkedQueue f62882;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AtomicInteger f62883;

    public C19571() {
        this.f62882 = null;
        this.f62883 = null;
        this.f62882 = new ConcurrentLinkedQueue();
        this.f62883 = new AtomicInteger(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44675(String str) {
        int length = str.length();
        this.f62882.add(str);
        this.f62883.addAndGet(length);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44674(FileWriter fileWriter, char[] cArr) {
        if (fileWriter == null || cArr == null || cArr.length == 0) {
            return;
        }
        int length = cArr.length;
        int i = 0;
        int i2 = length;
        for (String str : this.f62882) {
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

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m44677() {
        return this.f62883.get();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m44676() {
        this.f62882.clear();
        this.f62883.set(0);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f62882.iterator();
    }
}
