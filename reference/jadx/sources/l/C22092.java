package l;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: renamed from: l.᩹ۛۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22092 implements InterfaceC10597 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f71559;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f71560;

    public /* synthetic */ C22092(int i, View view) {
        this.f71559 = i;
        this.f71560 = view;
    }

    @Override // l.InterfaceC10597
    /* JADX INFO: renamed from: ۙ */
    public final void mo1473(Object obj) {
        switch (this.f71559) {
            case 0:
                ((C6938) this.f71560).setTitle((String) obj);
                break;
            default:
                ((TextView) this.f71560).setText((String) obj);
                break;
        }
    }
}
