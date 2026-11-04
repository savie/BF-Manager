package l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ܶܿ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 843X */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C16256 implements Supplier {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f52816;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC11781 f52817;

    public /* synthetic */ C16256(int i, AbstractC11781 abstractC11781) {
        this.f52816 = i;
        this.f52817 = abstractC11781;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f52816) {
            case 0:
                return "rootPackage missing!; currModule: " + ((C2920) this.f52817);
            default:
                return this.f52817.m29573();
        }
    }
}
