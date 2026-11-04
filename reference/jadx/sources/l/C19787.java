package l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.ᩴۧ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: U8VQ */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19787 implements InterfaceC16438 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f63652;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f63653;

    public /* synthetic */ C19787(int i, Object obj) {
        this.f63652 = i;
        this.f63653 = obj;
    }

    @Override // l.InterfaceC16438
    /* JADX INFO: renamed from: ۙ */
    public final void mo1486(Object obj) {
        switch (this.f63652) {
            case 0:
                ((TextView) this.f63653).setText((String) obj);
                break;
            default:
                C19206.m44514((C19206) this.f63653, (C11967) obj);
                break;
        }
    }
}
