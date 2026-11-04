package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܽ۟᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: K6TZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C17440 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21498 f56727;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C12219 f56728;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C20489 f56729;

    public C17440(C12219 c12219, C20489 c20489, boolean z) {
        Object objLast;
        C21498 c21498;
        C20424 c20424 = c20489.f65630;
        this.f56728 = c12219;
        this.f56729 = c20489;
        if (!z) {
            objLast = c20424.last();
        } else {
            objLast = c20424.get(0);
        }
        C10727 c10727 = (C10727) objLast;
        if (!z && !c10727.m27316()) {
            int iM49259 = c10727.f34064.m49259() + c10727.f34065;
            c21498 = new C21498(iM49259, iM49259);
        } else {
            c21498 = c10727.f34067;
        }
        this.f56727 = c21498;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17440 m40939(C12219 c12219, boolean z) {
        C20489 c20489M10991;
        C3335 c3335 = c12219.f39261;
        if (z) {
            C20424 c20424 = c3335.f10906;
            c20489M10991 = !c20424.isEmpty() ? (C20489) c20424.last() : null;
        } else {
            c20489M10991 = c3335.m10991();
        }
        if (c20489M10991 == null) {
            return null;
        }
        return new C17440(c12219, c20489M10991, z);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m40941() {
        return !this.f56727.equals(this.f56728.f39260);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m40940() {
        Iterator it = this.f56729.f65630.iterator();
        int i = 0;
        while (true) {
            C15948 c15948 = (C15948) it;
            if (!c15948.hasNext()) {
                return false;
            }
            if (!((C10727) c15948.next()).m27316() && (i = i + 1) >= 64) {
                return true;
            }
        }
    }
}
