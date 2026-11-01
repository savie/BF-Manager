package l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.ۜ᩶۬, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZN */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6992 implements InterfaceC10597 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f23520;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f23521;

    public /* synthetic */ C6992(int i, Object obj) {
        this.f23520 = i;
        this.f23521 = obj;
    }

    @Override // l.InterfaceC10597
    /* JADX INFO: renamed from: ۙ */
    public final void mo1473(Object obj) {
        switch (this.f23520) {
            case 0:
                ((TextView) this.f23521).setText(C3589.m10660(((Integer) obj).intValue()));
                break;
            default:
                C4184.m11832((C4184) this.f23521, (Iterable) obj);
                break;
        }
    }
}
