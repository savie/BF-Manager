package l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.۟ۛܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1BES */
/* JADX INFO: loaded from: classes3.dex */
public final class C7697 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C14408 f25396;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C11204 f25397;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C2256 f25398;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C12696 f25399;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C9933 f25400;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C25377 f25401;

    public C7697(C2256 c2256, C12696 c12696) {
        if (c2256 == null) {
            throw new NullPointerException("unprocessedInsns == null");
        }
        this.f25398 = c2256;
        this.f25399 = c12696;
        this.f25396 = null;
        this.f25401 = null;
        this.f25397 = null;
        this.f25400 = null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m20967() {
        if (this.f25400 != null) {
            return;
        }
        C9933 c9933M7676 = this.f25398.m7676();
        this.f25400 = c9933M7676;
        this.f25401 = C25377.m56737(c9933M7676);
        C9933 c9933 = this.f25400;
        C11204 c11204 = C11204.f35346;
        int size = c9933.size();
        C22393 c22393 = new C22393(size);
        for (int i = 0; i < size; i++) {
            AbstractC18884 abstractC18884M31618get = c9933.m31618get(i);
            if (abstractC18884M31618get instanceof C23139) {
                c22393.m50469(abstractC18884M31618get.m43804(), ((C23139) abstractC18884M31618get).m52062());
            } else if (abstractC18884M31618get instanceof C20155) {
                c22393.m50471(abstractC18884M31618get.m43804(), ((C20155) abstractC18884M31618get).m46373());
            }
        }
        this.f25397 = c22393.m50468();
        this.f25396 = this.f25399.m31490();
        this.f25398 = null;
        this.f25399 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20970(InterfaceC0239 interfaceC0239) {
        this.f25398.m7678(interfaceC0239);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m20968() {
        return this.f25398.m7684();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m20971() {
        return this.f25398.m7681();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m20973() {
        return this.f25399.m31491();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashSet m20969() {
        return this.f25399.m31492();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final HashSet m20972() {
        return this.f25398.m7683();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C9933 m20977() {
        m20967();
        return this.f25400;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C14408 m20976() {
        m20967();
        return this.f25396;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C25377 m20974() {
        m20967();
        return this.f25401;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C11204 m20975() {
        m20967();
        return this.f25397;
    }
}
