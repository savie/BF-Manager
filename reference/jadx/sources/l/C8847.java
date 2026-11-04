package l;

import java.util.LinkedHashSet;

/* JADX INFO: renamed from: l.۠᩵ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: D445 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8847 extends C23174 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public LinkedHashSet f28915 = new LinkedHashSet();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4878 f28916;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f28917;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3168 f28918;

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1505(C7926 c7926) {
        C4878 c4878 = this.f28916;
        boolean z = false;
        for (AbstractC22664 abstractC22664M55137 = c4878.f17025.m55137(c7926.f26345.f38067); !z && abstractC22664M55137.m51067(EnumC21172.CLASS); abstractC22664M55137 = c4878.f17025.m55137(abstractC22664M55137)) {
            C3168 c3168M37793 = c4878.f17039.m37793(abstractC22664M55137.f73596.mo9564());
            if (c3168M37793 != null && this.f28918 != c3168M37793) {
                if (this.f28915.add(c3168M37793)) {
                    boolean z2 = this.f28917;
                    try {
                        mo5474(c3168M37793.f10273);
                        this.f28917 = z2;
                    } catch (Throwable th) {
                        this.f28917 = z2;
                        throw th;
                    }
                }
                z = true;
            }
        }
        super.mo1505(c7926);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1518(C16327 c16327) {
        this.f28917 = true;
        super.mo1518(c16327);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1954(C12598 c12598) {
        this.f28917 = true;
        super.mo1954(c12598);
    }

    public C8847(C4878 c4878, C3168 c3168) {
        this.f28916 = c4878;
        this.f28918 = c3168;
    }
}
