package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.۠ܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: O17J */
/* JADX INFO: loaded from: classes4.dex */
public final class C8793 extends AbstractC18555 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C21694 f28648;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7302 f28649;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8793(C7302 c7302, C7302 c7303, InterfaceC21539 interfaceC21539) {
        super(c7303, interfaceC21539);
        this.f28649 = c7302;
    }

    @Override // l.AbstractC18555
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int mo23593() {
        C15945 c15945Mo19986 = this.f28649.mo19986();
        try {
            this.f28648 = c15945Mo19986.m38034(this.f60285.mo4294());
            return this.f28648.m49237();
        } finally {
            c15945Mo19986.f51784 = 0L;
        }
    }

    @Override // l.AbstractC18555
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo23591(int i) {
        C15945 c15945Mo19986 = null;
        try {
            c15945Mo19986 = this.f28649.mo19986();
            c15945Mo19986.m38027(this.f60285.mo4294(), i, false, false);
            this.f28649.mo15568();
            c15945Mo19986.f51784 = 0L;
        } catch (IOException unused) {
            if (c15945Mo19986 != null) {
                c15945Mo19986.f51784 = 0L;
            }
        } catch (Throwable th) {
            if (c15945Mo19986 != null) {
                c15945Mo19986.f51784 = 0L;
            }
            throw th;
        }
    }

    @Override // l.AbstractC18555
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long mo23590() {
        C21694 c21694 = this.f28648;
        if (c21694 == null) {
            return -1L;
        }
        return ((long) c21694.m49242()) | (((long) this.f28648.m49233()) << 32);
    }

    @Override // l.AbstractC18555
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo23592(long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        C15945 c15945Mo19986 = null;
        try {
            c15945Mo19986 = this.f28649.mo19986();
            c15945Mo19986.m38026(this.f60285.mo4294(), i, i2, false, false);
            this.f28649.mo15568();
            c15945Mo19986.f51784 = 0L;
        } catch (IOException unused) {
            if (c15945Mo19986 != null) {
                c15945Mo19986.f51784 = 0L;
            }
        } catch (Throwable th) {
            if (c15945Mo19986 != null) {
                c15945Mo19986.f51784 = 0L;
            }
            throw th;
        }
    }
}
