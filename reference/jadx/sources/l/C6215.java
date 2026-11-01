package l;

import android.os.Build;

/* JADX INFO: renamed from: l.ۛᩳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5WY */
/* JADX INFO: loaded from: classes3.dex */
public final class C6215 extends AbstractC22629 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C22316 f21110;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int[] f21111 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17218(int... iArr) {
        this.f21111 = iArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17217(C22316 c22316) {
        this.f21110 = c22316;
    }

    @Override // l.AbstractC22629
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo17216(InterfaceC4989 interfaceC4989) {
        if (Build.VERSION.SDK_INT >= 34) {
            C12566.m31278(interfaceC4989.mo13816(), C12566.m31277(C17504.m40766(C12566.m31276(), null, 0, null, Boolean.FALSE), this.f21111, this.f21110));
        } else {
            C12566.m31278(interfaceC4989.mo13816(), C12566.m31277(C12566.m31276(), this.f21111, this.f21110));
        }
    }
}
