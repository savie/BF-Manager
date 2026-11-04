package l;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩸ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: B54W */
/* JADX INFO: loaded from: classes.dex */
public final class C22579 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public Interpolator f73011;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public InterfaceC4020 f73013;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f73015;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f73014 = -1;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C5596 f73012 = new C10644(this);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f73010 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50901(C24158 c24158) {
        if (this.f73015) {
            return;
        }
        this.f73010.add(c24158);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50902(C24158 c24158, C24158 c24159) {
        ArrayList arrayList = this.f73010;
        arrayList.add(c24158);
        c24159.m54128(c24158.m54126());
        arrayList.add(c24159);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m50905() {
        if (this.f73015) {
            return;
        }
        for (C24158 c24158 : this.f73010) {
            long j = this.f73014;
            if (j >= 0) {
                c24158.m54121(j);
            }
            Interpolator interpolator = this.f73011;
            if (interpolator != null) {
                c24158.m54122(interpolator);
            }
            if (this.f73013 != null) {
                c24158.m54123(this.f73012);
            }
            c24158.m54125();
        }
        this.f73015 = true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m50904() {
        this.f73015 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50898() {
        if (this.f73015) {
            Iterator it = this.f73010.iterator();
            while (it.hasNext()) {
                ((C24158) it.next()).m54119();
            }
            this.f73015 = false;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m50903() {
        if (this.f73015) {
            return;
        }
        this.f73014 = 250L;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50899(Interpolator interpolator) {
        if (this.f73015) {
            return;
        }
        this.f73011 = interpolator;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50900(C5596 c5596) {
        if (this.f73015) {
            return;
        }
        this.f73013 = c5596;
    }
}
