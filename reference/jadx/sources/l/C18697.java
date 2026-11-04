package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ᩳ֡ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: C6CM */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C18697 implements Consumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f60775 = 0;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f60776;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2551 f60777;

    public /* synthetic */ C18697(C2551 c2551, EnumC17315 enumC17315) {
        this.f60777 = c2551;
        this.f60776 = enumC17315;
    }

    public /* synthetic */ C18697(C10878 c10878, C2551 c2551) {
        this.f60776 = c10878;
        this.f60777 = c2551;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        switch (this.f60775) {
            case 0:
                C19990.m45969(this.f60777, (EnumC17315) this.f60776, (String) obj);
                break;
            default:
                C10878.m27620((C10878) this.f60776, this.f60777, (C17973) obj);
                break;
        }
    }
}
