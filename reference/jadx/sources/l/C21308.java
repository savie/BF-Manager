package l;

/* JADX INFO: renamed from: l.᩶۫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21308 extends AbstractC17996 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22010 f67914;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21308(C22010 c22010) {
        super(c22010);
        this.f67914 = c22010;
    }

    @Override // l.AbstractC17996
    /* JADX INFO: renamed from: ۙ */
    public final C0843 mo35219(C0843 c0843) {
        if (!c0843.m3348() || !c0843.m3347(EnumC9791.STATIC)) {
            return c0843;
        }
        return C0843.m3345(new C15868(this.f67914, c0843.f3164, false));
    }

    @Override // l.AbstractC17996
    /* JADX INFO: renamed from: ۙ */
    public final C0843 mo35220(C0843 c0843, C0843 c0844) {
        if (!c0843.m3348() || c0843.m3347(EnumC9791.NON_STATIC)) {
            if (!c0844.m3348() || c0844.m3347(EnumC9791.STATIC)) {
                if (c0843.m3348() || c0844.m3348()) {
                    return C0843.m3345(new C15868(this.f67914, c0843.m3348() ? c0843.f3164 : c0844.f3164, true));
                }
                if (!c0843.m3346() || c0844.m3346()) {
                }
            }
            return c0844;
        }
        return c0843;
    }
}
