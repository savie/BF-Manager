package l;

import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;
import java.util.HashMap;

/* JADX INFO: renamed from: l.֨۬ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: J4ZK */
/* JADX INFO: loaded from: classes2.dex */
public final class C1198 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C9400 f4363;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final HashMap f4364 = new HashMap();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C10628 f4365;

    public C1198(int i) {
        C10628 c10628 = new C10628(i);
        this.f4365 = c10628;
        this.f4363 = (C9400) c10628.f33712.get(0);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C10628 m4405() {
        return this.f4365;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4400(String str) {
        HashMap map = this.f4364;
        C21335 c21335 = (C21335) map.get(str);
        if (c21335 != null) {
            if (c21335.m35263()) {
                throw new IllegalArgumentException("There is already a label with that name.");
            }
            ((C7910) this.f4363.m24747()).add(c21335);
        } else {
            C9400 c9400 = this.f4363;
            c9400.getClass();
            C21335 c21336 = new C21335();
            ((C7910) c9400.m24747()).add(c21336);
            map.put(str, c21336);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C21335 m4407(String str) {
        HashMap map = this.f4364;
        C21335 c21335 = (C21335) map.get(str);
        if (c21335 != null) {
            return c21335;
        }
        C21335 c21336 = new C21335();
        map.put(str, c21336);
        return c21336;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4404(C21530 c21530, C21335 c21335, C21335 c21336, C21335 c21337) {
        this.f4365.m27111(c21530, c21335, c21336, c21337);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4403(C21335 c21335, C21335 c21336, C21335 c21337) {
        this.f4365.m27110(c21335, c21336, c21337);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m4409(int i) {
        ((C7910) this.f4363.m24748()).add(new C12866(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4399(int i, C3630 c3630, C21530 c21530, C3630 c3631) {
        ((C7910) this.f4363.m24748()).add(new C24801(i, c3630, c21530, c3631));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4398(int i) {
        ((C7910) this.f4363.m24748()).add(new C19579(i));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m4406(int i) {
        ((C7910) this.f4363.m24748()).add(new C1680(i));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m4408() {
        ((C7910) this.f4363.m24748()).add(new C5409());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4397() {
        ((C7910) this.f4363.m24748()).add(new C15103());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4401(C3630 c3630) {
        ((C7910) this.f4363.m24748()).add(new C11374(c3630));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4402(AbstractC12384 abstractC12384) {
        C10628 c10628 = this.f4365;
        c10628.m27109(abstractC12384);
        this.f4363 = (C9400) j$$ExternalSyntheticOutline0.m(c10628.f33712, 1);
    }
}
