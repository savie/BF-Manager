package l;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import net.engio.mbassy.listener.MessageHandler;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: l.ܿܿۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8L1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17484 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C14663 f55625;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f55626;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final C16779 f55623 = new C16779();

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final Random f55622 = new Random();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C0282 f55624 = new C0282();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C20039 f55627 = new C20039();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final HashMap f55630 = new HashMap();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC16511 f55629 = AbstractC16511.f53035;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f55628 = -1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized String m40683() {
        return this.f55626;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized String m40684(AbstractC16511 abstractC16511, C15274 c15274) {
        return m40676(abstractC16511.mo38826(c15274.f49778, this.f55627).f64168, c15274).f41998;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m40686(C19602 c19602) {
        C14663 c14663;
        String str = this.f55626;
        if (str != null) {
            C12546 c12546 = (C12546) this.f55630.get(str);
            c12546.getClass();
            m40678(c12546);
        }
        Iterator it = this.f55630.values().iterator();
        while (it.hasNext()) {
            C12546 c12547 = (C12546) it.next();
            it.remove();
            if (c12547.f42001 && (c14663 = this.f55625) != null) {
                c14663.m35191(c19602, c12547.f41998);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m40687(C19602 c19602, int i) {
        this.f55625.getClass();
        boolean z = i == 0;
        Iterator it = this.f55630.values().iterator();
        while (it.hasNext()) {
            C12546 c12546 = (C12546) it.next();
            if (c12546.m31215(c19602)) {
                it.remove();
                if (c12546.f42001) {
                    boolean zEquals = c12546.f41998.equals(this.f55626);
                    if (z && zEquals) {
                        boolean unused = c12546.f42002;
                    }
                    if (zEquals) {
                        m40678(c12546);
                    }
                    this.f55625.m35191(c19602, c12546.f41998);
                }
            }
        }
        m40675(c19602);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final synchronized void m40688(C19602 c19602) {
        this.f55625.getClass();
        AbstractC16511 abstractC16511 = this.f55629;
        this.f55629 = c19602.f62945;
        Iterator it = this.f55630.values().iterator();
        while (it.hasNext()) {
            C12546 c12546 = (C12546) it.next();
            if (!c12546.m31214(abstractC16511, this.f55629) || c12546.m31215(c19602)) {
                it.remove();
                if (c12546.f42001) {
                    if (c12546.f41998.equals(this.f55626)) {
                        m40678(c12546);
                    }
                    this.f55625.m35191(c19602, c12546.f41998);
                }
            }
        }
        m40675(c19602);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized void m40689(C19602 c19602) {
        this.f55625.getClass();
        if (c19602.f62945.m38828()) {
            return;
        }
        C15274 c15274 = c19602.f62947;
        if (c15274 != null) {
            if (c15274.f49780 < m40679()) {
                return;
            }
            C12546 c12546 = (C12546) this.f55630.get(this.f55626);
            if (c12546 != null && c12546.f41997 == -1 && c12546.f42003 != c19602.f62943) {
                return;
            }
        }
        C12546 c12546M40676 = m40676(c19602.f62943, c19602.f62947);
        if (this.f55626 == null) {
            this.f55626 = c12546M40676.f41998;
        }
        C15274 c15275 = c19602.f62947;
        if (c15275 != null && c15275.m36576()) {
            C15274 c15276 = c19602.f62947;
            Object obj = c15276.f49778;
            C12546 c12546M40677 = m40676(c19602.f62943, new C15274(c15276.f49779, c15276.f49780, obj));
            if (!c12546M40677.f42001) {
                c12546M40677.f42001 = true;
                c19602.f62945.mo38826(c19602.f62947.f49778, this.f55627);
                this.f55627.m45386(c19602.f62947.f49779);
                Math.max(0L, C17983.m41856(0L) + C17983.m41856(this.f55627.f64171));
                this.f55625.getClass();
            }
        }
        if (!c12546M40676.f42001) {
            c12546M40676.f42001 = true;
            this.f55625.getClass();
        }
        if (c12546M40676.f41998.equals(this.f55626) && !c12546M40676.f42002) {
            c12546M40676.f42002 = true;
            this.f55625.m35190(c19602, c12546M40676.f41998);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40685(C14663 c14663) {
        this.f55625 = c14663;
    }

    @RequiresNonNull({MessageHandler.Properties.Listener})
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m40675(C19602 c19602) {
        AbstractC16511 abstractC16511 = c19602.f62945;
        int i = c19602.f62943;
        C15274 c15274 = c19602.f62947;
        boolean zM38828 = abstractC16511.m38828();
        HashMap map = this.f55630;
        if (zM38828) {
            String str = this.f55626;
            if (str != null) {
                C12546 c12546 = (C12546) map.get(str);
                c12546.getClass();
                m40678(c12546);
                return;
            }
            return;
        }
        C12546 c12547 = (C12546) map.get(this.f55626);
        this.f55626 = m40676(i, c15274).f41998;
        m40689(c19602);
        if (c15274 != null) {
            long j = c15274.f49780;
            if (c15274.m36576()) {
                if (c12547 != null && c12547.f41997 == j && c12547.f41999 != null && c12547.f41999.f49779 == c15274.f49779 && c12547.f41999.f49782 == c15274.f49782) {
                    return;
                }
                m40676(i, new C15274(j, c15274.f49778));
                this.f55625.getClass();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m40678(C12546 c12546) {
        if (c12546.f41997 != -1) {
            this.f55628 = c12546.f41997;
        }
        this.f55626 = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long m40679() {
        C12546 c12546 = (C12546) this.f55630.get(this.f55626);
        if (c12546 != null && c12546.f41997 != -1) {
            return c12546.f41997;
        }
        return this.f55628 + 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C12546 m40676(int i, C15274 c15274) {
        HashMap map = this.f55630;
        C12546 c12546 = null;
        long j = C17492.FOREVER_NS;
        for (C12546 c12547 : map.values()) {
            c12547.m31216(i, c15274);
            if (c12547.m31213(i, c15274)) {
                long j2 = c12547.f41997;
                if (j2 == -1 || j2 < j) {
                    c12546 = c12547;
                    j = j2;
                } else if (j2 == j) {
                    String str = C17983.f57504;
                    if (c12546.f41999 != null && c12547.f41999 != null) {
                        c12546 = c12547;
                    }
                }
            }
        }
        if (c12546 != null) {
            return c12546;
        }
        String strM40681 = m40681();
        C12546 c12548 = new C12546(this, strM40681, i, c15274);
        map.put(strM40681, c12548);
        return c12548;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m40681() {
        byte[] bArr = new byte[12];
        f55622.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }
}
