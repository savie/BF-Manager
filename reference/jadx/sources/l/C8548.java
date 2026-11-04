package l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.۠ۢܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 98EM */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C8548 implements InterfaceC19795, InterfaceC10523 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f27909;

    public /* synthetic */ C8548(int i) {
        this.f27909 = i;
    }

    @Override // l.InterfaceC10523
    public void accept(TextView textView) {
        textView.setText(this.f27909);
    }

    @Override // l.InterfaceC19795
    public void invoke(Object obj) {
        ((InterfaceC10582) obj).mo7263(this.f27909);
    }
}
