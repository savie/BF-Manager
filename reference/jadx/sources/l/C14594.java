package l;

/* JADX INFO: renamed from: l.ܰ۫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14594 extends AbstractC17996 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22010 f45977;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14594(C22010 c22010) {
        super(c22010);
        this.f45977 = c22010;
    }

    @Override // l.AbstractC17996
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0843 mo35219(C0843 c0843) {
        if (!c0843.m3348() || c0843.m3347(EnumC9791.NON_STATIC)) {
            return c0843;
        }
        return C0843.m3345(new C15868(this.f45977, c0843.f3164, false));
    }

    @Override // l.AbstractC17996
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0843 mo35220(C0843 c0843, C0843 c0844) {
        boolean zM3348 = c0843.m3348();
        AbstractC11781 abstractC11781 = c0843.f3164;
        if (!zM3348 || !abstractC11781.mo7874() || (c0844.m3348() && !c0844.m3347(EnumC9791.STATIC))) {
            boolean zM3349 = c0844.m3348();
            AbstractC11781 abstractC11782 = c0844.f3164;
            if (!zM3349 || abstractC11782.mo7874() || (c0843.m3348() && !c0843.m3347(EnumC9791.NON_STATIC))) {
                boolean zM33410 = c0843.m3348();
                C22010 c22010 = this.f45977;
                if (zM33410 && c0844.m3348()) {
                    return C0843.m3345(c22010.m49779(abstractC11781, abstractC11782));
                }
                if (c0843.m3348() || c0844.m3348()) {
                    if (!c0843.m3348()) {
                        abstractC11781 = abstractC11782;
                    }
                    return C0843.m3345(new C15868(c22010, abstractC11781, true));
                }
                if (!c0843.m3346() || c0844.m3346()) {
                }
            }
            return c0844;
        }
        return c0843;
    }
}
