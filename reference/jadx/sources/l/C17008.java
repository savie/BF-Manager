package l;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import net.engio.mbassy.listener.MessageHandler;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: l.ܺᩳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8L1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17008 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f55568;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C23722 f55574;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C11787 f55567 = new C11787();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Random f55566 = new Random();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C11328 f55570 = new C11328();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C1634 f55572 = new C1634();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final HashMap f55571 = new HashMap();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public AbstractC24755 f55573 = AbstractC24755.f80138;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f55569 = -1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized String m40102() {
        return this.f55568;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized String m40103(AbstractC24755 abstractC24755, C8402 c8402) {
        return m40095(abstractC24755.mo15535(c8402.f27520, this.f55572).f5657, c8402).f81464;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m40104(C11041 c11041) {
        C23722 c23722;
        String str = this.f55568;
        if (str != null) {
            C25214 c25214 = (C25214) this.f55571.get(str);
            c25214.getClass();
            m40096(c25214);
        }
        Iterator it = this.f55571.values().iterator();
        while (it.hasNext()) {
            C25214 c25215 = (C25214) it.next();
            it.remove();
            if (c25215.f81459 && (c23722 = this.f55574) != null) {
                c23722.m52993(c11041, c25215.f81464);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m40105(C11041 c11041, int i) {
        this.f55574.getClass();
        boolean z = i == 0;
        Iterator it = this.f55571.values().iterator();
        while (it.hasNext()) {
            C25214 c25214 = (C25214) it.next();
            if (c25214.m56224(c11041)) {
                it.remove();
                if (c25214.f81459) {
                    boolean zEquals = c25214.f81464.equals(this.f55568);
                    if (z && zEquals) {
                        boolean unused = c25214.f81463;
                    }
                    if (zEquals) {
                        m40096(c25214);
                    }
                    this.f55574.m52993(c11041, c25214.f81464);
                }
            }
        }
        m40101(c11041);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final synchronized void m40107(C11041 c11041) {
        this.f55574.getClass();
        AbstractC24755 abstractC24755 = this.f55573;
        this.f55573 = c11041.f34846;
        Iterator it = this.f55571.values().iterator();
        while (it.hasNext()) {
            C25214 c25214 = (C25214) it.next();
            if (!c25214.m56225(abstractC24755, this.f55573) || c25214.m56224(c11041)) {
                it.remove();
                if (c25214.f81459) {
                    if (c25214.f81464.equals(this.f55568)) {
                        m40096(c25214);
                    }
                    this.f55574.m52993(c11041, c25214.f81464);
                }
            }
        }
        m40101(c11041);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized void m40108(C11041 c11041) {
        this.f55574.getClass();
        if (c11041.f34846.m55264()) {
            return;
        }
        C8402 c8402 = c11041.f34850;
        if (c8402 != null) {
            if (c8402.f27518 < m40097()) {
                return;
            }
            C25214 c25214 = (C25214) this.f55571.get(this.f55568);
            if (c25214 != null && c25214.f81460 == -1 && c25214.f81461 != c11041.f34848) {
                return;
            }
        }
        C25214 c25214M40095 = m40095(c11041.f34848, c11041.f34850);
        if (this.f55568 == null) {
            this.f55568 = c25214M40095.f81464;
        }
        C8402 c8403 = c11041.f34850;
        if (c8403 != null && c8403.m22581()) {
            C8402 c8404 = c11041.f34850;
            Object obj = c8404.f27520;
            C25214 c25214M40096 = m40095(c11041.f34848, new C8402(c8404.f27516, c8404.f27518, obj));
            if (!c25214M40096.f81459) {
                c25214M40096.f81459 = true;
                c11041.f34846.mo15535(c11041.f34850.f27520, this.f55572);
                this.f55572.m5787(c11041.f34850.f27516);
                Math.max(0L, C7116.m19506(0L) + C7116.m19506(this.f55572.f5659));
                this.f55574.getClass();
            }
        }
        if (!c25214M40095.f81459) {
            c25214M40095.f81459 = true;
            this.f55574.getClass();
        }
        if (c25214M40095.f81464.equals(this.f55568) && !c25214M40095.f81463) {
            c25214M40095.f81463 = true;
            this.f55574.m52992(c11041, c25214M40095.f81464);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40106(C23722 c23722) {
        this.f55574 = c23722;
    }

    @RequiresNonNull({MessageHandler.Properties.Listener})
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m40101(C11041 c11041) {
        AbstractC24755 abstractC24755 = c11041.f34846;
        int i = c11041.f34848;
        C8402 c8402 = c11041.f34850;
        boolean zM55264 = abstractC24755.m55264();
        HashMap map = this.f55571;
        if (zM55264) {
            String str = this.f55568;
            if (str != null) {
                C25214 c25214 = (C25214) map.get(str);
                c25214.getClass();
                m40096(c25214);
                return;
            }
            return;
        }
        C25214 c25215 = (C25214) map.get(this.f55568);
        this.f55568 = m40095(i, c8402).f81464;
        m40108(c11041);
        if (c8402 != null) {
            long j = c8402.f27518;
            if (c8402.m22581()) {
                if (c25215 != null && c25215.f81460 == j && c25215.f81458 != null && c25215.f81458.f27516 == c8402.f27516 && c25215.f81458.f27519 == c8402.f27519) {
                    return;
                }
                m40095(i, new C8402(j, c8402.f27520));
                this.f55574.getClass();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m40096(C25214 c25214) {
        if (c25214.f81460 != -1) {
            this.f55569 = c25214.f81460;
        }
        this.f55568 = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long m40097() {
        C25214 c25214 = (C25214) this.f55571.get(this.f55568);
        if (c25214 != null && c25214.f81460 != -1) {
            return c25214.f81460;
        }
        return this.f55569 + 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C25214 m40095(int i, C8402 c8402) {
        HashMap map = this.f55571;
        C25214 c25214 = null;
        long j = C25227.FOREVER_NS;
        for (C25214 c25215 : map.values()) {
            c25215.m56226(i, c8402);
            if (c25215.m56223(i, c8402)) {
                long j2 = c25215.f81460;
                if (j2 == -1 || j2 < j) {
                    c25214 = c25215;
                    j = j2;
                } else if (j2 == j) {
                    String str = C7116.f23455;
                    if (c25214.f81458 != null && c25215.f81458 != null) {
                        c25214 = c25215;
                    }
                }
            }
        }
        if (c25214 != null) {
            return c25214;
        }
        String strM40099 = m40099();
        C25214 c25216 = new C25214(this, strM40099, i, c8402);
        map.put(strM40099, c25216);
        return c25216;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m40099() {
        byte[] bArr = new byte[12];
        f55566.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }
}
