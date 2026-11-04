package l;

/* JADX INFO: renamed from: l.᩵ۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: DAPN */
/* JADX INFO: loaded from: classes5.dex */
public final class C20290 implements InterfaceC5877 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12085 f65138;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5131 f65139;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5131 f65140;

    public C20290(C12085 c12085, C5131 c5131, C5131 c5132) {
        this.f65138 = c12085;
        this.f65140 = c5131;
        this.f65139 = c5132;
    }

    @Override // l.InterfaceC5877
    public final void beforeStart() {
        this.f65138.f38910.beforeStart();
    }

    @Override // l.InterfaceC5877
    public final void onStart() {
        this.f65138.f38910.onStart();
    }

    @Override // l.InterfaceC5877
    /* JADX INFO: renamed from: ۙ */
    public final String mo17103(String str) {
        return this.f65138.f38906.m27638(str, this.f65140.f17869.f43123, this.f65139.f17869.f43123);
    }

    @Override // l.InterfaceC5877
    public final void onFinish() {
        this.f65138.f38910.onFinish();
    }

    @Override // l.InterfaceC5877
    public final void afterFinish() {
        this.f65138.f38910.afterFinish();
    }

    @Override // l.InterfaceC5877
    public final boolean onError(Exception exc) {
        return this.f65138.f38910.onError(exc);
    }

    @Override // l.InterfaceC5877
    public final String getId() {
        StringBuilder sb = new StringBuilder();
        C12085 c12085 = this.f65138;
        sb.append(c12085.f38910.getClass());
        sb.append(":");
        sb.append(c12085.f38910.hashCode());
        sb.append(":");
        sb.append(this.f65140.f17869.f43123);
        sb.append(":");
        sb.append(this.f65139.f17869.f43123);
        return sb.toString();
    }
}
