package l;

import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۘ۬᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: H6NE */
/* JADX INFO: loaded from: classes2.dex */
public final class C4190 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f15316;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long f15317;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C2830 f15318;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C15508 f15319;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final Runnable f15320;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C18360 f15321;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final Supplier f15322;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f15323;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f15324;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public StringBuilder f15325;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f15326;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final char[] f15327 = new char[256];

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f15328;

    public C4190(C18360 c18360, C15508 c15508, Runnable runnable, Supplier supplier) {
        this.f15321 = c18360;
        this.f15319 = c15508;
        this.f15320 = runnable;
        this.f15322 = supplier;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13372(int i, int i2, CharSequence charSequence) {
        C18360 c18360 = this.f15321;
        if (c18360.f59846 == 0) {
            c18360.f59839 = i;
        }
        c18360.f59846++;
        c18360.f59841 = i2;
        c18360.f59844 = (((long) charSequence.length()) - ((long) (i2 - i))) + c18360.f59844;
        if (i == i2 && charSequence.length() == 0) {
            return;
        }
        this.f15317 = (((long) i2) - ((long) i)) + ((long) charSequence.length()) + this.f15317;
        if (!c18360.f59845 && c18360.f59846 <= 128 && this.f15317 <= 65536) {
            c18360.f59840.add(new C21344(i, i2, charSequence.toString()));
            return;
        }
        if (!c18360.f59845) {
            c18360.f59845 = true;
            ArrayList<C21344> arrayList = new ArrayList(c18360.f59840);
            c18360.f59840.clear();
            for (C21344 c21344 : arrayList) {
                m13374(c21344.f67998, c21344.f67994, c21344.f67996);
            }
        }
        m13374(i, i2, charSequence);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0052  */
    /* JADX WARN: Code duplicated, block: B:19:0x0057  */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m13374(int i, int i2, CharSequence charSequence) {
        StringBuilder sb;
        this.f15320.run();
        int i3 = this.f15325 == null ? 0 : i - this.f15328;
        long j = i2;
        long length = (j - ((long) i)) + ((long) charSequence.length());
        StringBuilder sb2 = this.f15325;
        if (sb2 != null) {
            if (i3 > 256 || j - ((long) this.f15326) > 65536) {
                sb = this.f15325;
                if (sb != null) {
                    m13373(new C21344(this.f15326, this.f15328, sb.toString()));
                    this.f15325 = null;
                }
            } else {
                long j2 = i3;
                if (((long) sb2.length()) + j2 + ((long) charSequence.length()) > 65536 || this.f15323 + j2 > (this.f15316 + length) * 4) {
                    sb = this.f15325;
                    if (sb != null) {
                        m13373(new C21344(this.f15326, this.f15328, sb.toString()));
                        this.f15325 = null;
                    }
                }
            }
        }
        if (this.f15325 == null) {
            if (i2 - i > 65536 || charSequence.length() > 65536) {
                m13373(new C21344(i, i2, charSequence.toString()));
                return;
            }
            this.f15325 = new StringBuilder();
            this.f15326 = i;
            this.f15328 = i;
            this.f15316 = 0L;
            this.f15323 = 0L;
        }
        int i4 = this.f15328;
        int i5 = i - i4;
        if (i5 != 0) {
            C15508 c15508 = this.f15319;
            char[] cArr = this.f15327;
            c15508.getChars(i4, i, cArr, 0);
            this.f15325.append(cArr, 0, i5);
        }
        this.f15325.append(charSequence);
        this.f15323 += (long) i5;
        this.f15316 += length;
        this.f15328 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13373(C21344 c21344) {
        long j = this.f15324;
        int i = c21344.f67997;
        long j2 = j + ((long) i);
        this.f15324 = j2;
        C2830 c2830 = this.f15318;
        C18360 c18360 = this.f15321;
        if (c2830 == null && j2 > 524288) {
            this.f15318 = (C2830) this.f15322.get();
            for (C21344 c21345 : c18360.f59840) {
                c21345.f67995 = this.f15318.length();
                m13371(this.f15318, c21345.f67996, 0, c21345.f67997);
                c21345.f67996 = null;
            }
        }
        C2830 c2831 = this.f15318;
        if (c2831 != null) {
            c21344.f67995 = c2831.length();
            m13371(this.f15318, c21344.f67996, 0, i);
            c21344.f67996 = null;
        }
        c18360.f59840.add(c21344);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m13371(C2830 c2830, CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            this.f15320.run();
            int iMin = Math.min(8192, i2 - i) + i;
            c2830.append(charSequence, i, iMin);
            i = iMin;
        }
    }

    public final void finish() {
        int i;
        long j;
        int i2;
        long j2;
        C21344 c21344;
        C15508 c15508 = this.f15319;
        long length = c15508.length();
        C18360 c18360 = this.f15321;
        long j3 = length + c18360.f59844;
        if (j3 < 0 || j3 > 2147483647L) {
            throw new IllegalArgumentException("Replacement result is too large");
        }
        StringBuilder sb = this.f15325;
        if (sb != null) {
            m13373(new C21344(this.f15326, this.f15328, sb.toString()));
            this.f15325 = null;
        }
        C2830 c2830 = this.f15318;
        if (c2830 != null) {
            c18360.f59842 = c2830.finish();
        }
        if (c18360.f59840.size() > 512) {
            Runnable runnable = this.f15320;
            runnable.run();
            ArrayList arrayList = c18360.f59840;
            int length2 = 0;
            long j4 = ((C21344) arrayList.get(0)).f67998;
            long jMax = Math.max(65536L, (((((long) ((C21344) j$$ExternalSyntheticOutline0.m(arrayList, 1)).f67994) - j4) + this.f15324) + 511) / 512);
            ArrayList arrayList2 = new ArrayList(512);
            CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
            C2830 c2831 = (C2830) this.f15322.get();
            try {
                Iterator it = arrayList.iterator();
                long j5 = -1;
                long j6 = 0;
                int i3 = 0;
                int i4 = 0;
                while (it.hasNext()) {
                    C21344 c21345 = (C21344) it.next();
                    runnable.run();
                    int i5 = c21345.f67998;
                    Iterator it2 = it;
                    int i6 = c21345.f67997;
                    C18360 c18361 = c18360;
                    long j7 = ((((long) i5) - j4) + j6) / jMax;
                    if (j7 != j5) {
                        j = 0;
                        if (j5 >= 0) {
                            long j8 = jMax;
                            int i7 = i3;
                            j2 = j8;
                            arrayList2.add(new C21344(i7, i4, length2, c2831.length() - length2));
                        } else {
                            j2 = jMax;
                        }
                        length2 = c2831.length();
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
                        c15508.getChars(i, iMin, charBufferAllocate.array(), 0);
                        c2831.append((CharSequence) charBufferAllocate, 0, iMin - i);
                        i = iMin;
                        i5 = i5;
                    }
                    if (c18361.f59842 == null) {
                        c21344 = c21345;
                        m13371(c2831, c21344.f67996, 0, i6);
                    } else {
                        c21344 = c21345;
                        CharSequence charSequence = c18361.f59842;
                        int i8 = c21344.f67995;
                        m13371(c2831, charSequence, i8, i8 + i6);
                    }
                    j6 += (long) i6;
                    it = it2;
                    long j10 = j2;
                    i4 = c21344.f67994;
                    i3 = i2;
                    jMax = j10;
                    c18360 = c18361;
                }
                C18360 c18362 = c18360;
                arrayList2.add(new C21344(i3, i4, length2, c2831.length() - length2));
                runnable.run();
                C8796 c8796 = c18362.f59842;
                c18362.f59842 = c2831.finish();
                c18362.f59840 = arrayList2;
                if (c8796 != null) {
                    c8796.close();
                }
                c2831.close();
            } catch (Throwable th) {
                if (c2831 == null) {
                    throw th;
                }
                try {
                    c2831.close();
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
        C2830 c2830 = this.f15318;
        if (c2830 != null) {
            c2830.close();
        }
    }
}
