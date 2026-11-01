package l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ᩳ۟ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C17906 implements Supplier {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f56712;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f56713;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f56714;

    public /* synthetic */ C17906(int i, Object obj, Object obj2) {
        this.f56713 = i;
        this.f56714 = obj;
        this.f56712 = obj2;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        int i = this.f56713;
        Object obj = this.f56712;
        Object obj2 = this.f56714;
        switch (i) {
            case 0:
                C23800 c23800 = (C23800) obj2;
                c23800.getClass();
                return new C9129(c23800, (C13445) obj);
            default:
                C23549 c23549 = ((C0576) obj2).f2503;
                AbstractC11242 abstractC11242 = ((C22492) obj).f73414;
                C14377 c14377 = C14707.f48054;
                return c23549.m51910(new C14377("compiler", "class.file.not.found", abstractC11242));
        }
    }
}
