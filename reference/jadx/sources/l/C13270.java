package l;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: renamed from: l.۬ᩳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: QB32 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C13270 implements InterfaceC10597 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f44055;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f44056;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f44057;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f44058;

    public /* synthetic */ C13270(Object obj, View view, View view2, int i) {
        this.f44056 = i;
        this.f44058 = obj;
        this.f44055 = view;
        this.f44057 = view2;
    }

    @Override // l.InterfaceC10597
    /* JADX INFO: renamed from: ۙ */
    public final void mo1473(Object obj) {
        switch (this.f44056) {
            case 0:
                C6919 c6919 = (C6919) this.f44058;
                ((C6111) this.f44055).m16854(this.f44057, ((Boolean) obj).booleanValue() && !c6919.f23270, c6919.f23279);
                break;
            default:
                AbstractC6301.m17384((AbstractC6301) this.f44058, (TextView) this.f44055, (TextView) this.f44057);
                break;
        }
    }
}
