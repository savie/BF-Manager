package l;

import java.util.Date;
import java.util.UUID;

/* JADX INFO: renamed from: l.ۖۗܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 54F8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2387 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f7679;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f7680;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Date f7681;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C4250 f7682;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public AbstractC4625 f7683;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final UUID f7684;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f7685;

    public C2387() {
        throw null;
    }

    public C2387(AbstractC4625 abstractC4625, long j, UUID uuid, boolean z) {
        this.f7683 = abstractC4625;
        this.f7685 = j;
        this.f7684 = uuid;
        this.f7680 = z;
        this.f7681 = new Date();
        String strValueOf = String.valueOf(j);
        InterfaceC6488 interfaceC6488 = C12082.f38900;
        this.f7682 = new C4250(strValueOf);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m8117() {
        return this.f7679;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8119(long j) {
        this.f7679 = j;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C4250 m8123() {
        return this.f7682;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long m8120() {
        return this.f7685;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12453 m8118(InterfaceC20658 interfaceC20658) {
        C4250 c4250 = this.f7682;
        c4250.getClass();
        return new C12453(new C14690(c4250), interfaceC20658);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final UUID m8124() {
        return this.f7684;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Date m8122() {
        return this.f7681;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC4625 m8125() {
        return this.f7683;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m8121() {
        return this.f7680;
    }
}
