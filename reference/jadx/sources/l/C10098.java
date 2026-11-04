package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۢۨۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 58QC */
/* JADX INFO: loaded from: classes3.dex */
public final class C10098 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f32346;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f32348;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long[] f32347 = new long[10];

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Object[] f32349 = new Object[10];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m26054() {
        this.f32346 = 0;
        this.f32348 = 0;
        Arrays.fill(this.f32349, (Object) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m26055(long j, Object obj) {
        int i = this.f32348;
        if (i > 0) {
            if (j <= this.f32347[((this.f32346 + i) - 1) % this.f32349.length]) {
                m26054();
            }
        }
        m26052();
        int i2 = this.f32346;
        int i3 = this.f32348;
        Object[] objArr = this.f32349;
        int length = (i2 + i3) % objArr.length;
        this.f32347[length] = j;
        objArr[length] = obj;
        this.f32348 = i3 + 1;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final synchronized int m26056() {
        return this.f32348;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized Object m26057() {
        return this.f32348 == 0 ? null : m26051();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized Object m26058(long j) {
        return m26050(j, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized Object m26053(long j) {
        return m26050(j, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Object m26050(long j, boolean z) {
        Object objM26051 = null;
        long j2 = C25227.FOREVER_NS;
        while (this.f32348 > 0) {
            long j3 = j - this.f32347[this.f32346];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            objM26051 = m26051();
            j2 = j3;
        }
        return objM26051;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private Object m26051() {
        C20782.m47568(this.f32348 > 0);
        Object[] objArr = this.f32349;
        int i = this.f32346;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f32346 = (i + 1) % objArr.length;
        this.f32348--;
        return obj;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m26052() {
        int length = this.f32349.length;
        if (this.f32348 < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        Object[] objArr = new Object[i];
        int i2 = this.f32346;
        int i3 = length - i2;
        System.arraycopy(this.f32347, i2, jArr, 0, i3);
        System.arraycopy(this.f32349, this.f32346, objArr, 0, i3);
        int i4 = this.f32346;
        if (i4 > 0) {
            System.arraycopy(this.f32347, 0, jArr, i3, i4);
            System.arraycopy(this.f32349, 0, objArr, i3, this.f32346);
        }
        this.f32347 = jArr;
        this.f32349 = objArr;
        this.f32346 = 0;
    }
}
