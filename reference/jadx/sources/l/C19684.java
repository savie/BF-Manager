package l;

import java.util.ArrayList;
import java.util.Iterator;
import org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission;

/* JADX INFO: renamed from: l.ᩴ۠ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75CE */
/* JADX INFO: loaded from: classes5.dex */
public final class C19684 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f63380 = C16980.m40037(C19684.class);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C12971 f63381;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC16481 f63382;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f63385;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C12050 f63386;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f63387;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C21943 f63389;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ArrayList f63384 = new ArrayList(1);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f63388 = new ArrayList();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f63383 = false;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19684 m45356(C2551 c2551, int i, C1345 c1345) {
        C19684 c19684 = new C19684(i);
        c19684.m45359(c2551, c1345);
        return c19684;
    }

    public C19684(int i) {
        this.f63387 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45359(C2551 c2551, C1345 c1345) {
        ArrayList arrayList = this.f63384;
        if (c1345 != null) {
            if (arrayList.contains(c1345)) {
                return;
            }
            arrayList.add(c1345);
        } else {
            if (arrayList.isEmpty()) {
                return;
            }
            StringBuilder sb = new StringBuilder("Throwable added to exception handler: '");
            sb.append(arrayList.isEmpty() ? ProviderConfigurationPermission.ALL_STR : C4123.m13222(arrayList, " | ", new C3398(6)));
            sb.append("', keep only Throwable");
            c2551.m31133(sb.toString());
            arrayList.clear();
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final ArrayList m45372() {
        return this.f63384;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC1566 m45373() {
        if (m45366()) {
            return AbstractC1566.f5432;
        }
        ArrayList arrayList = this.f63384;
        if (arrayList.size() == 1) {
            return ((C1345) arrayList.iterator().next()).getType();
        }
        return AbstractC1566.f5432;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m45366() {
        ArrayList arrayList = this.f63384;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((C1345) it.next()).m4957().equals("java.lang.Throwable")) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m45367() {
        return this.f63387;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C21943 m45368() {
        return this.f63389;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m45374(C21943 c21943) {
        this.f63389 = c21943;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ArrayList m45365() {
        return this.f63388;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45363(C21943 c21943) {
        this.f63388.add(c21943);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18213 m45364() {
        return this.f63386;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45360(C12050 c12050) {
        this.f63386 = c12050;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16481 m45358() {
        return this.f63382;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45362(AbstractC16481 abstractC16481) {
        this.f63382 = abstractC16481;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45361(C12971 c12971) {
        this.f63381 = c12971;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12971 m45357() {
        return this.f63381;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C21943 m45375() {
        C12971 c12971 = this.f63381;
        C21943 c21943 = null;
        if (c12971.m32374().size() > 1) {
            f63380.mo13729("No support yet for finding bottom block of try body with multipe inner trys");
            return null;
        }
        if (!c12971.m32374().isEmpty()) {
            c12971 = (C12971) C4123.m13219(c12971.m32374());
        }
        for (C21943 c21944 : this.f63389.m49643()) {
            if (c21944.mo17865(EnumC1763.EXC_BOTTOM_SPLITTER)) {
                Iterator it = c21944.m49643().iterator();
                while (it.hasNext()) {
                    if (((C12971) ((C21943) it.next()).mo17862((InterfaceC2157) C11457.f36033)) == c12971) {
                        c21943 = c21944;
                        break;
                    }
                }
                if (c21943 != null) {
                    break;
                }
            }
        }
        return c21943;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m45376() {
        return this.f63385;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m45369() {
        this.f63385 = true;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m45370() {
        return this.f63383;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m45371() {
        this.f63383 = true;
        C4937.forEach(this.f63388, new C22668());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19684.class != obj.getClass()) {
            return false;
        }
        C19684 c19684 = (C19684) obj;
        return this.f63387 == c19684.f63387 && this.f63384.equals(c19684.f63384) && C17359.equals(this.f63381, c19684.f63381);
    }

    public final int hashCode() {
        return C17359.hash(this.f63384, Integer.valueOf(this.f63387));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = this.f63384;
        sb.append(arrayList.isEmpty() ? ProviderConfigurationPermission.ALL_STR : C4123.m13222(arrayList, " | ", new C3398(6)));
        sb.append(" -> ");
        sb.append(C8314.m22396(this.f63387));
        return sb.toString();
    }
}
