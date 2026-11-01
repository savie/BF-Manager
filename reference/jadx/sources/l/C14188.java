package l;

/* JADX INFO: renamed from: l.ܳ֨ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5NM */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C14188 implements InterfaceC17295 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f46540;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f46541;

    public /* synthetic */ C14188(int i, Object obj) {
        this.f46540 = i;
        this.f46541 = obj;
    }

    @Override // l.InterfaceC17295
    public final void accept(Object obj) {
        switch (this.f46540) {
            case 0:
                AbstractC8894.m23055((AbstractC8894) this.f46541, (Integer) obj);
                break;
            case 1:
                C11731 c11731 = (C11731) this.f46541;
                C13683 c13683 = (C13683) obj;
                c13683.m33389().setText(c11731.m29326());
                c13683.m33387().setText(c11731.m29320());
                break;
            default:
                C16053.m38048((C16053) this.f46541, (String) obj);
                break;
        }
    }
}
