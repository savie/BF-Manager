package l;

/* JADX INFO: renamed from: l.ᩳ᩵ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7BDK */
/* JADX INFO: loaded from: classes5.dex */
public final class C19299 implements InterfaceC8616 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18050 f62372;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C2891 f62373;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8616 f62374;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C18312 f62375;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C7366 f62376;

    public C19299(InterfaceC8616 interfaceC8616, C18312 c18312, boolean z) {
        this.f62374 = interfaceC8616;
        this.f62375 = c18312;
        C18050 c18050 = (C18050) interfaceC8616.getAttributes().m33788("Code");
        this.f62372 = c18050;
        C13836 c13836M42070 = c18050.m42070();
        C2891 c2891M9514 = C2891.f9479;
        for (C9099 c9099 = (C9099) c13836M42070.m33788("LineNumberTable"); c9099 != null; c9099 = (C9099) c13836M42070.m33786(c9099)) {
            c2891M9514 = C2891.m9514(c2891M9514, c9099.m24249());
        }
        this.f62373 = c2891M9514;
        C7366 c7366M20228 = C7366.f24238;
        if (z) {
            for (C2388 c2388 = (C2388) c13836M42070.m33788("LocalVariableTable"); c2388 != null; c2388 = (C2388) c13836M42070.m33786(c2388)) {
                c7366M20228 = C7366.m20227(c7366M20228, c2388.m7410());
            }
            C7366 c7366M20227 = C7366.f24238;
            for (C8354 c8354 = (C8354) c13836M42070.m33788("LocalVariableTypeTable"); c8354 != null; c8354 = (C8354) c13836M42070.m33786(c8354)) {
                c7366M20227 = C7366.m20227(c7366M20227, c8354.m7410());
            }
            if (c7366M20227.size() != 0) {
                c7366M20228 = C7366.m20228(c7366M20228, c7366M20227);
            }
        }
        this.f62376 = c7366M20228;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m44665() {
        return ((this.f62375.m42701() & 512) == 0 || this.f62374.mo8780().m1847()) ? false : true;
    }

    @Override // l.InterfaceC2650
    /* JADX INFO: renamed from: ۚ */
    public final C0282 mo8780() {
        return this.f62374.mo8780();
    }

    @Override // l.InterfaceC2650
    public final C9976 getName() {
        return this.f62374.getName();
    }

    @Override // l.InterfaceC2650
    /* JADX INFO: renamed from: ۫ */
    public final C9976 mo8781() {
        return this.f62374.mo8781();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m44666() {
        return (this.f62374.mo8783() & 8) != 0;
    }

    @Override // l.InterfaceC2650
    /* JADX INFO: renamed from: ᩷ */
    public final int mo8783() {
        return this.f62374.mo8783();
    }

    @Override // l.InterfaceC2650
    public final C13836 getAttributes() {
        return this.f62374.getAttributes();
    }

    @Override // l.InterfaceC2650
    /* JADX INFO: renamed from: ܳ */
    public final C1028 mo8782() {
        return this.f62374.mo8782();
    }

    @Override // l.InterfaceC8616
    /* JADX INFO: renamed from: ۙ */
    public final C6994 mo23245() {
        return this.f62374.mo23245();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m44669() {
        return this.f62372.m42068();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m44664() {
        return this.f62372.m42069();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C8112 m44667() {
        return this.f62372.m42071();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C4383 m44668() {
        return this.f62372.m42067();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7366 m44662() {
        return this.f62376;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9012 m44663(int i) {
        return new C9012(this.f62375.m42714(), i, this.f62373.m9516(i));
    }
}
