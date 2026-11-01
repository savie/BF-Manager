package l;

import android.content.res.Configuration;

/* JADX INFO: renamed from: l.᩻֨ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5NM */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23360 implements InterfaceC17295 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f75679;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f75680;

    public /* synthetic */ C23360(int i, Object obj) {
        this.f75679 = i;
        this.f75680 = obj;
    }

    @Override // l.InterfaceC17295
    public final void accept(Object obj) {
        switch (this.f75679) {
            case 0:
                AbstractC8894.m23054((AbstractC8894) this.f75680, (Configuration) obj);
                break;
            default:
                ((C2392) obj).m7265().setText(((C11731) this.f75680).m29324());
                break;
        }
    }
}
