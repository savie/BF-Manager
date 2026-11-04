package l;

import java.net.InetAddress;
import java.util.Random;

/* JADX INFO: renamed from: l.ܺ᩹᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: C9Z9 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC17152 extends AbstractC14694 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static InterfaceC25186 f55913 = C16980.m40038(AbstractC17152.class.getName());

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f55914;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f55915;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f55916;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f55917;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public InetAddress f55918;

    /* JADX INFO: renamed from: ۙ */
    public abstract C11340 mo7632(C14168 c14168);

    /* JADX INFO: renamed from: ۙ */
    public abstract C17307 mo7633(boolean z);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo7635(C10219 c10219);

    /* JADX INFO: renamed from: ۤ */
    public abstract boolean mo7637(C14168 c14168);

    /* JADX INFO: renamed from: ۤ */
    public abstract boolean mo7638(AbstractC17152 abstractC17152);

    /* JADX INFO: renamed from: ᩷ */
    public abstract boolean mo7639(C14168 c14168);

    /* JADX INFO: renamed from: ᩹ */
    public abstract boolean mo7640();

    public AbstractC17152(String str, EnumC24021 enumC24021, EnumC6121 enumC6121, boolean z, int i) {
        super(str, enumC24021, enumC6121, z);
        this.f55917 = i;
        this.f55915 = System.currentTimeMillis();
        int iNextInt = new Random().nextInt(3);
        this.f55916 = iNextInt;
        this.f55914 = iNextInt + 80;
    }

    @Override // l.AbstractC14694
    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC17152) && super.equals(obj) && mo7638((AbstractC17152) obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m40297(C0525 c0525) {
        try {
            for (AbstractC17152 abstractC17152 : c0525.m44424()) {
                if (equals(abstractC17152) && abstractC17152.f55917 > this.f55917 / 2) {
                    return true;
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException e) {
            f55913.mo13702("suppressedBy() message " + c0525 + " exception ", (Throwable) e);
            return false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m40295(int i) {
        return (((long) i) * ((long) this.f55917) * 10) + this.f55915;
    }

    @Override // l.AbstractC14694
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo35351(long j) {
        return m40295(100) <= j;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m40303(long j) {
        return m40295(50) <= j;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m40298(long j) {
        return m40295(this.f55914) <= j;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m40299() {
        int i = this.f55914 + 5;
        this.f55914 = i;
        if (i > 100) {
            this.f55914 = 100;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m40302(AbstractC17152 abstractC17152) {
        this.f55915 = abstractC17152.f55915;
        this.f55917 = abstractC17152.f55917;
        this.f55914 = this.f55916 + 80;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m40304(long j) {
        this.f55915 = j;
        this.f55917 = 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40296(InetAddress inetAddress) {
        this.f55918 = inetAddress;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InetAddress m40300() {
        return this.f55918;
    }

    @Override // l.AbstractC14694
    /* JADX INFO: renamed from: ۙ */
    public void mo7634(StringBuilder sb) {
        int iMax = (int) Math.max(0L, (m40295(100) - System.currentTimeMillis()) / 1000);
        sb.append(" ttl: '");
        sb.append(iMax);
        sb.append('/');
        sb.append(this.f55917);
        sb.append('\'');
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m40301() {
        return this.f55917;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final long m40305() {
        return this.f55915;
    }
}
