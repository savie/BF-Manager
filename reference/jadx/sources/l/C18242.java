package l;

/* JADX INFO: renamed from: l.ᩳᩴᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: V8DC */
/* JADX INFO: loaded from: classes5.dex */
public final class C18242 extends AbstractC4130 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18948 f58231;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18242(C18948 c18948, AbstractC21803 abstractC21803, int i, int i2) {
        super(c18948);
        this.f58231 = c18948;
        int i3 = i + i2;
        if (i3 > abstractC21803.mo31295()) {
            throw new IllegalArgumentException(C8479.m22141(i3, "tried to queue past end of data, "));
        }
        if (i < 0) {
            throw new IllegalArgumentException(C8479.m22141(i, "tried to queue before start of data, "));
        }
        this.f15132 = abstractC21803;
        new C23182(3);
        this.f23377 = i;
        this.f23378 = i2;
    }

    @Override // l.InterfaceC7411
    public final void run() {
        synchronized (this.f58231.f61360) {
            if (this.f58231.f61360.size() > 0) {
                ((C6953) this.f58231.f61360.getLast()).getClass();
            }
            this.f58231.f61360.add(this);
        }
    }
}
