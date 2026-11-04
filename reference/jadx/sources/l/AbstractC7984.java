package l;

import java.util.List;

/* JADX INFO: renamed from: l.۟ܶ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Y8JY */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7984 extends AbstractC11655 implements InterfaceC24393 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public long f26522;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC24393 f26523;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21770(long j, InterfaceC24393 interfaceC24393, long j2) {
        this.f37777 = j;
        this.f26523 = interfaceC24393;
        if (j2 != C25227.FOREVER_NS) {
            j = j2;
        }
        this.f26522 = j;
    }

    @Override // l.InterfaceC24393
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo21767() {
        InterfaceC24393 interfaceC24393 = this.f26523;
        interfaceC24393.getClass();
        return interfaceC24393.mo21767();
    }

    @Override // l.InterfaceC24393
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long mo21769(int i) {
        InterfaceC24393 interfaceC24393 = this.f26523;
        interfaceC24393.getClass();
        return interfaceC24393.mo21769(i) + this.f26522;
    }

    @Override // l.InterfaceC24393
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo21768(long j) {
        InterfaceC24393 interfaceC24393 = this.f26523;
        interfaceC24393.getClass();
        return interfaceC24393.mo21768(j - this.f26522);
    }

    @Override // l.InterfaceC24393
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final List mo21771(long j) {
        InterfaceC24393 interfaceC24393 = this.f26523;
        interfaceC24393.getClass();
        return interfaceC24393.mo21771(j - this.f26522);
    }

    @Override // l.AbstractC11655, l.AbstractC13587
    /* JADX INFO: renamed from: ᩸ */
    public final void mo7() {
        super.mo7();
        this.f26523 = null;
    }
}
