package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩺ۢ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: D9E2 */
/* JADX INFO: loaded from: classes.dex */
public final class C22916 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC4314 f74489 = C13488.m32997(C22916.class);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f74490 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50694(C5982 c5982) throws C17271 {
        while (true) {
            AbstractC17043 abstractC17043M34326 = C14222.m34326(c5982);
            if (abstractC17043M34326.m39823() == EnumC12105.MsvAvEOL) {
                return;
            }
            f74489.mo12137("Read TargetInfo {} --> {}", abstractC17043M34326.m39823(), abstractC17043M34326.m39824());
            this.f74490.add(abstractC17043M34326);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m50696(C5982 c5982) {
        for (AbstractC17043 abstractC17043 : this.f74490) {
            f74489.mo12137("Writing TargetInfo {} --> {}", abstractC17043.m39823(), abstractC17043.m39824());
            abstractC17043.mo5290(c5982);
        }
        new C10694().mo5290(c5982);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22916 m50693() {
        C22916 c22916 = new C22916();
        c22916.f74490 = new ArrayList(this.f74490);
        return c22916;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC17043 m50692(EnumC12105 enumC12105) {
        for (AbstractC17043 abstractC17043 : this.f74490) {
            if (abstractC17043.m39823() == enumC12105) {
                return abstractC17043;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50695(AbstractC17043 abstractC17043) {
        for (AbstractC17043 abstractC17044 : this.f74490) {
            if (abstractC17044.m39823() == abstractC17043.m39823()) {
                this.f74490.remove(abstractC17044);
                break;
            }
        }
        this.f74490.add(abstractC17043);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m50697(EnumC12105 enumC12105) {
        Iterator it = this.f74490.iterator();
        while (it.hasNext()) {
            if (((AbstractC17043) it.next()).m39823() == enumC12105) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "TargetInfo{targetInfo=" + this.f74490 + '}';
    }
}
