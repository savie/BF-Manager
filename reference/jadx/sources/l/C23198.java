package l;

import android.os.SystemClock;

/* JADX INFO: renamed from: l.᩹֨ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8FL */
/* JADX INFO: loaded from: classes2.dex */
public final class C23198 implements InterfaceC3573 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean[] f75171;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f75172;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f75173;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9771 f75174;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f75175;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f75176 = false;

    @Override // l.InterfaceC23711
    /* JADX INFO: renamed from: ֫ۙ */
    public final /* synthetic */ void mo3465() {
        throw null;
    }

    public C23198(C9771 c9771, long j, int i, boolean[] zArr) {
        this.f75174 = c9771;
        this.f75175 = j;
        this.f75172 = i;
        this.f75171 = zArr;
    }

    @Override // l.InterfaceC3573
    /* JADX INFO: renamed from: ۙ */
    public final void mo3466(long j, long j2, long j3) {
        if (mo924()) {
            return;
        }
        C9771 c9771 = this.f75174;
        if (c9771.f31500 == null) {
            return;
        }
        int iM11075 = C3374.m11075(j2, j3);
        boolean z = this.f75176;
        int i = this.f75172;
        if (!z) {
            if (((int) (SystemClock.uptimeMillis() - this.f75175)) <= 500 || iM11075 >= 50) {
                return;
            }
            this.f75176 = true;
            C9771.m25463(c9771, i);
        }
        if (iM11075 != this.f75173) {
            this.f75173 = iM11075;
            C9771.m25447(c9771, i, iM11075);
        }
    }

    @Override // l.InterfaceC7509
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo924() {
        C9771 c9771 = this.f75174;
        boolean z = c9771.f31503 || !c9771.m25465(this.f75172);
        if (z) {
            this.f75171[0] = true;
        }
        return z;
    }
}
