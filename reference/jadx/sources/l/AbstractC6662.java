package l;

import java.util.Iterator;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: l.ۛ᩷۫, reason: contains not printable characters */
/* JADX INFO: compiled from: D4TJ */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6662 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f22201;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public String f22202;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f22203;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C6623 f22204;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f22205;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f22206;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f22207;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f22208;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public CountDownLatch f22209;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f22210;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f22211;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Object f22212 = null;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public CountDownLatch f22213;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public long f22214;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f22215;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f22216;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f22217;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f22218;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract C20832 mo18607();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public abstract C12627 mo18632();

    public AbstractC6662(boolean z) {
        this.f22203 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18612(C20617 c20617, boolean z) {
        if (this.f22203) {
            if (z) {
                c20617.m47238(m18615());
            }
            c20617.m47238(m18641());
            Iterator it = mo18607().m47638().iterator();
            while (it.hasNext()) {
                ((AbstractC6662) it.next()).m18612(c20617, z);
            }
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m18625() {
        return this.f22203;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m18627() {
        return this.f22214;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m18633(long j) {
        this.f22214 = j;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final long m18622() {
        return this.f22206;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18608(long j) {
        this.f22206 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18614(boolean z) {
        this.f22215 = z;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean m18605() {
        return this.f22215;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18609(String str) {
        this.f22216 = str;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m18637() {
        return this.f22216;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m18604() {
        String str = this.f22211;
        if (str != null) {
            return str;
        }
        AbstractC22044 abstractC22044 = this.f22218;
        C17359.requireNonNull(abstractC22044);
        return abstractC22044.mo4294();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 m18615() {
        AbstractC22044 abstractC22044 = this.f22218;
        if (abstractC22044 != null) {
            return abstractC22044;
        }
        String str = this.f22211;
        C17359.requireNonNull(str);
        AbstractC22044 abstractC22044M35193 = C14584.m35193(str, new String[0]);
        this.f22218 = abstractC22044M35193;
        return abstractC22044M35193;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18613(AbstractC22044 abstractC22044) {
        this.f22218 = abstractC22044;
        this.f22211 = null;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m18618(String str) {
        this.f22211 = str;
        this.f22218 = null;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String m18626() {
        String str = this.f22202;
        if (str != null) {
            return str;
        }
        AbstractC22044 abstractC22044 = this.f22217;
        C17359.requireNonNull(abstractC22044);
        return abstractC22044.mo4294();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 m18641() {
        AbstractC22044 abstractC22044 = this.f22217;
        if (abstractC22044 != null) {
            return abstractC22044;
        }
        String str = this.f22202;
        C17359.requireNonNull(str);
        AbstractC22044 abstractC22044M35193 = C14584.m35193(str, new String[0]);
        this.f22217 = abstractC22044M35193;
        return abstractC22044M35193;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m18635(AbstractC22044 abstractC22044) {
        this.f22217 = abstractC22044;
        this.f22202 = null;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m18629(String str) {
        this.f22202 = str;
        this.f22217 = null;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m18624() {
        return this.f22201;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m18634(String str) {
        this.f22201 = str;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m18630() {
        return this.f22210;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m18619(boolean z) {
        this.f22210 = z;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m18639() {
        return this.f22205;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m18623() {
        this.f22205 = true;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean m18616() {
        return this.f22208;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m18636(boolean z) {
        this.f22208 = z;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m18621() {
        return this.f22207;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final void m18631() {
        this.f22207 = true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object m18620() {
        return this.f22212;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m18638(String str) {
        this.f22212 = str;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C6623 m18628() {
        return this.f22204;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C24523 m18617() {
        C6623 c6623 = this.f22204;
        if (c6623 == null) {
            return null;
        }
        return new C24523(c6623);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18611(C6623 c6623) {
        this.f22204 = c6623;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo18610(CountDownLatch countDownLatch) {
        this.f22209 = countDownLatch;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m18606() {
        CountDownLatch countDownLatch = this.f22209;
        if (countDownLatch != null) {
            try {
                countDownLatch.await();
            } catch (InterruptedException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m18640() {
        CountDownLatch countDownLatch = this.f22213;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }
}
