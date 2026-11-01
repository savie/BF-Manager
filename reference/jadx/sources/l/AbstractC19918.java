package l;

import java.net.InetAddress;
import java.util.Random;

/* JADX INFO: renamed from: l.᩶ۘ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: C9Z9 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19918 extends AbstractC9604 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static InterfaceC4314 f63838 = C13488.m32998(AbstractC19918.class.getName());

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f63839;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f63840;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f63841;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f63842;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public InetAddress f63843;

    /* JADX INFO: renamed from: ۙ */
    public abstract C0244 mo19176(boolean z);

    /* JADX INFO: renamed from: ۙ */
    public abstract C20706 mo19177(C22823 c22823);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo19179(C5100 c5100);

    /* JADX INFO: renamed from: ۨ */
    public abstract boolean mo19182(AbstractC19918 abstractC19918);

    /* JADX INFO: renamed from: ۨ */
    public abstract boolean mo19183(C22823 c22823);

    /* JADX INFO: renamed from: ܰ */
    public abstract boolean mo19184(C22823 c22823);

    /* JADX INFO: renamed from: ᩴ */
    public abstract boolean mo19185();

    public AbstractC19918(String str, EnumC14357 enumC14357, EnumC23529 enumC23529, boolean z, int i) {
        super(str, enumC14357, enumC23529, z);
        this.f63842 = i;
        this.f63841 = System.currentTimeMillis();
        int iNextInt = new Random().nextInt(3);
        this.f63840 = iNextInt;
        this.f63839 = iNextInt + 80;
    }

    @Override // l.AbstractC9604
    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC19918) && super.equals(obj) && mo19182((AbstractC19918) obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m45204(C13568 c13568) {
        try {
            for (AbstractC19918 abstractC19918 : c13568.m6976()) {
                if (equals(abstractC19918) && abstractC19918.f63842 > this.f63842 / 2) {
                    return true;
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException e) {
            f63838.mo12122("suppressedBy() message " + c13568 + " exception ", (Throwable) e);
            return false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m45202(int i) {
        return (((long) i) * ((long) this.f63842) * 10) + this.f63841;
    }

    @Override // l.AbstractC9604
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo24471(long j) {
        return m45202(100) <= j;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m45207(long j) {
        return m45202(50) <= j;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m45205(long j) {
        return m45202(this.f63839) <= j;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m45209() {
        int i = this.f63839 + 5;
        this.f63839 = i;
        if (i > 100) {
            this.f63839 = 100;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m45206(AbstractC19918 abstractC19918) {
        this.f63841 = abstractC19918.f63841;
        this.f63842 = abstractC19918.f63842;
        this.f63839 = this.f63840 + 80;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m45201(long j) {
        this.f63841 = j;
        this.f63842 = 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45203(InetAddress inetAddress) {
        this.f63843 = inetAddress;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final InetAddress m45208() {
        return this.f63843;
    }

    @Override // l.AbstractC9604
    /* JADX INFO: renamed from: ۙ */
    public void mo19178(StringBuilder sb) {
        int iMax = (int) Math.max(0L, (m45202(100) - System.currentTimeMillis()) / 1000);
        sb.append(" ttl: '");
        sb.append(iMax);
        sb.append('/');
        sb.append(this.f63842);
        sb.append('\'');
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m45210() {
        return this.f63842;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final long m45211() {
        return this.f63841;
    }
}
