package l;

import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ܿ֫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: H6NE */
/* JADX INFO: loaded from: classes4.dex */
public final class C17028 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f54392;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23379 f54393;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public long f54394;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public long f54395;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C3329 f54396;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f54397;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Runnable f54398;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C12627 f54399;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public StringBuilder f54400;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f54401;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final char[] f54402 = new char[256];

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f54403;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Supplier f54404;

    public C17028(C23379 c23379, C3329 c3329, Runnable runnable, Supplier supplier) {
        this.f54393 = c23379;
        this.f54396 = c3329;
        this.f54398 = runnable;
        this.f54404 = supplier;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39801(int i, int i2, CharSequence charSequence) {
        C23379 c23379 = this.f54393;
        if (c23379.f75739 == 0) {
            c23379.f75737 = i;
        }
        c23379.f75739++;
        c23379.f75735 = i2;
        c23379.f75732 = (((long) charSequence.length()) - ((long) (i2 - i))) + c23379.f75732;
        if (i == i2 && charSequence.length() == 0) {
            return;
        }
        this.f54397 = (((long) i2) - ((long) i)) + ((long) charSequence.length()) + this.f54397;
        if (!c23379.f75738 && c23379.f75739 <= 128 && this.f54397 <= 65536) {
            c23379.f75734.add(new C10679(i, i2, charSequence.toString()));
            return;
        }
        if (!c23379.f75738) {
            c23379.f75738 = true;
            ArrayList<C10679> arrayList = new ArrayList(c23379.f75734);
            c23379.f75734.clear();
            for (C10679 c10679 : arrayList) {
                m39803(c10679.f36436, c10679.f36437, c10679.f36438);
            }
        }
        m39803(i, i2, charSequence);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0052  */
    /* JADX WARN: Code duplicated, block: B:19:0x0057  */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m39803(int i, int i2, CharSequence charSequence) {
        StringBuilder sb;
        this.f54398.run();
        int i3 = this.f54400 == null ? 0 : i - this.f54403;
        long j = i2;
        long length = (j - ((long) i)) + ((long) charSequence.length());
        StringBuilder sb2 = this.f54400;
        if (sb2 != null) {
            if (i3 > 256 || j - ((long) this.f54392) > 65536) {
                sb = this.f54400;
                if (sb != null) {
                    m39802(new C10679(this.f54392, this.f54403, sb.toString()));
                    this.f54400 = null;
                }
            } else {
                long j2 = i3;
                if (((long) sb2.length()) + j2 + ((long) charSequence.length()) > 65536 || this.f54395 + j2 > (this.f54401 + length) * 4) {
                    sb = this.f54400;
                    if (sb != null) {
                        m39802(new C10679(this.f54392, this.f54403, sb.toString()));
                        this.f54400 = null;
                    }
                }
            }
        }
        if (this.f54400 == null) {
            if (i2 - i > 65536 || charSequence.length() > 65536) {
                m39802(new C10679(i, i2, charSequence.toString()));
                return;
            }
            this.f54400 = new StringBuilder();
            this.f54392 = i;
            this.f54403 = i;
            this.f54401 = 0L;
            this.f54395 = 0L;
        }
        int i4 = this.f54403;
        int i5 = i - i4;
        if (i5 != 0) {
            C3329 c3329 = this.f54396;
            char[] cArr = this.f54402;
            c3329.getChars(i4, i, cArr, 0);
            this.f54400.append(cArr, 0, i5);
        }
        this.f54400.append(charSequence);
        this.f54395 += (long) i5;
        this.f54401 += length;
        this.f54403 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39802(C10679 c10679) {
        long j = this.f54394;
        int i = c10679.f36440;
        long j2 = j + ((long) i);
        this.f54394 = j2;
        C12627 c12627 = this.f54399;
        C23379 c23379 = this.f54393;
        if (c12627 == null && j2 > 524288) {
            this.f54399 = (C12627) this.f54404.get();
            for (C10679 c106710 : c23379.f75734) {
                c106710.f36439 = this.f54399.length();
                m39800(this.f54399, c106710.f36438, 0, c106710.f36440);
                c106710.f36438 = null;
            }
        }
        C12627 c12628 = this.f54399;
        if (c12628 != null) {
            c10679.f36439 = c12628.length();
            m39800(this.f54399, c10679.f36438, 0, i);
            c10679.f36438 = null;
        }
        c23379.f75734.add(c10679);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m39800(C12627 c12627, CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            this.f54398.run();
            int iMin = Math.min(8192, i2 - i) + i;
            c12627.append(charSequence, i, iMin);
            i = iMin;
        }
    }

    public final void finish() {
        int i;
        long j;
        int i2;
        long j2;
        C10679 c10679;
        C3329 c3329 = this.f54396;
        long length = c3329.length();
        C23379 c23379 = this.f54393;
        long j3 = length + c23379.f75732;
        if (j3 < 0 || j3 > 2147483647L) {
            throw new IllegalArgumentException("Replacement result is too large");
        }
        StringBuilder sb = this.f54400;
        if (sb != null) {
            m39802(new C10679(this.f54392, this.f54403, sb.toString()));
            this.f54400 = null;
        }
        C12627 c12627 = this.f54399;
        if (c12627 != null) {
            c23379.f75733 = c12627.finish();
        }
        if (c23379.f75734.size() > 512) {
            Runnable runnable = this.f54398;
            runnable.run();
            ArrayList arrayList = c23379.f75734;
            int length2 = 0;
            long j4 = ((C10679) arrayList.get(0)).f36436;
            long jMax = Math.max(65536L, (((((long) ((C10679) C19084.m43861(arrayList, 1)).f36437) - j4) + this.f54394) + 511) / 512);
            ArrayList arrayList2 = new ArrayList(512);
            CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
            C12627 c12628 = (C12627) this.f54404.get();
            try {
                Iterator it = arrayList.iterator();
                long j5 = -1;
                long j6 = 0;
                int i3 = 0;
                int i4 = 0;
                while (it.hasNext()) {
                    C10679 c106710 = (C10679) it.next();
                    runnable.run();
                    int i5 = c106710.f36436;
                    Iterator it2 = it;
                    int i6 = c106710.f36440;
                    C23379 c233710 = c23379;
                    long j7 = ((((long) i5) - j4) + j6) / jMax;
                    if (j7 != j5) {
                        j = 0;
                        if (j5 >= 0) {
                            long j8 = jMax;
                            int i7 = i3;
                            j2 = j8;
                            arrayList2.add(new C10679(i7, i4, length2, c12628.length() - length2));
                        } else {
                            j2 = jMax;
                        }
                        length2 = c12628.length();
                        i = i5;
                        i2 = i;
                        j5 = j7;
                    } else {
                        i = i4;
                        j = 0;
                        long j9 = jMax;
                        i2 = i3;
                        j2 = j9;
                    }
                    while (i < i5) {
                        runnable.run();
                        int iMin = Math.min(charBufferAllocate.capacity(), i5 - i) + i;
                        c3329.getChars(i, iMin, charBufferAllocate.array(), 0);
                        c12628.append((CharSequence) charBufferAllocate, 0, iMin - i);
                        i = iMin;
                        i5 = i5;
                    }
                    if (c233710.f75733 == null) {
                        c10679 = c106710;
                        m39800(c12628, c10679.f36438, 0, i6);
                    } else {
                        c10679 = c106710;
                        CharSequence charSequence = c233710.f75733;
                        int i8 = c10679.f36439;
                        m39800(c12628, charSequence, i8, i8 + i6);
                    }
                    j6 += (long) i6;
                    it = it2;
                    long j10 = j2;
                    i4 = c10679.f36437;
                    i3 = i2;
                    jMax = j10;
                    c23379 = c233710;
                }
                C23379 c233711 = c23379;
                arrayList2.add(new C10679(i3, i4, length2, c12628.length() - length2));
                runnable.run();
                C17565 c17565 = c233711.f75733;
                c233711.f75733 = c12628.finish();
                c233711.f75734 = arrayList2;
                if (c17565 != null) {
                    c17565.close();
                }
                c12628.close();
            } catch (Throwable th) {
                if (c12628 == null) {
                    throw th;
                }
                try {
                    c12628.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C12627 c12627 = this.f54399;
        if (c12627 != null) {
            c12627.close();
        }
    }
}
