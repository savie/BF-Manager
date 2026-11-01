package l;

import android.widget.ProgressBar;

/* JADX INFO: renamed from: l.᩹ᩳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: QB32 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22442 implements InterfaceC10597 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f73230;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f73231;

    public /* synthetic */ C22442(int i, Object obj) {
        this.f73230 = i;
        this.f73231 = obj;
    }

    @Override // l.InterfaceC10597
    /* JADX INFO: renamed from: ۙ */
    public final void mo1473(Object obj) {
        switch (this.f73230) {
            case 0:
                ProgressBar progressBar = (ProgressBar) this.f73231;
                int i = ((Boolean) obj).booleanValue() ? 0 : 8;
                if (progressBar.getVisibility() != i) {
                    progressBar.setVisibility(i);
                }
                break;
            case 1:
                C8765.m22776((C8765) this.f73231);
                break;
            case 2:
                C9497.m24331((C9497) this.f73231, (C8229) obj);
                break;
            default:
                C15601.m37264((C15601) this.f73231, (C6094) obj);
                break;
        }
    }
}
