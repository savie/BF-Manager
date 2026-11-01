package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۙ᩶ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: O17J */
/* JADX INFO: loaded from: classes3.dex */
public final class C4868 extends AbstractC3810 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14042 f17119;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C5574 f17120;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4868(C14042 c14042, C14042 c14043, InterfaceC12984 interfaceC12984) {
        super(c14043, interfaceC12984);
        this.f17119 = c14042;
    }

    @Override // l.AbstractC3810
    /* JADX INFO: renamed from: ܰ */
    public final int mo11100() {
        C7817 c7817Mo8443 = this.f17119.mo8443();
        try {
            this.f17120 = c7817Mo8443.m20595(this.f14144.mo33986());
            return this.f17120.m15389();
        } finally {
            c7817Mo8443.f25728 = 0L;
        }
    }

    @Override // l.AbstractC3810
    /* JADX INFO: renamed from: ۙ */
    public final void mo11097(int i) {
        C7817 c7817Mo8443 = null;
        try {
            c7817Mo8443 = this.f17119.mo8443();
            c7817Mo8443.m20582(this.f14144.mo33986(), i, false, false);
            this.f17119.mo24648();
            c7817Mo8443.f25728 = 0L;
        } catch (IOException unused) {
            if (c7817Mo8443 != null) {
                c7817Mo8443.f25728 = 0L;
            }
        } catch (Throwable th) {
            if (c7817Mo8443 != null) {
                c7817Mo8443.f25728 = 0L;
            }
            throw th;
        }
    }

    @Override // l.AbstractC3810
    /* JADX INFO: renamed from: ۙ */
    public final long mo11096() {
        C5574 c5574 = this.f17120;
        if (c5574 == null) {
            return -1L;
        }
        return ((long) c5574.m15399()) | (((long) this.f17120.m15392()) << 32);
    }

    @Override // l.AbstractC3810
    /* JADX INFO: renamed from: ۙ */
    public final void mo11098(long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        C7817 c7817Mo8443 = null;
        try {
            c7817Mo8443 = this.f17119.mo8443();
            c7817Mo8443.m20581(this.f14144.mo33986(), i, i2, false, false);
            this.f17119.mo24648();
            c7817Mo8443.f25728 = 0L;
        } catch (IOException unused) {
            if (c7817Mo8443 != null) {
                c7817Mo8443.f25728 = 0L;
            }
        } catch (Throwable th) {
            if (c7817Mo8443 != null) {
                c7817Mo8443.f25728 = 0L;
            }
            throw th;
        }
    }
}
