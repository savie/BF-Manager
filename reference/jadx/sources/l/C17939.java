package l;

import android.graphics.Typeface;

/* JADX INFO: renamed from: l.ܽ᩻ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAIZ */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C17939 implements InterfaceC19479 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f58773;

    public /* synthetic */ C17939(int i) {
        this.f58773 = i;
    }

    @Override // l.InterfaceC19479
    /* JADX INFO: renamed from: ۙ */
    public final Object mo4064() {
        switch (this.f58773) {
            case 0:
                return C23907.m53407();
            case 1:
                return Typeface.createFromAsset(C21576.m49084().getAssets(), "Mono.ttf");
            default:
                C10069.m26035();
                return C10069.m26034(C21576.m49084().getApplicationContext());
        }
    }
}
