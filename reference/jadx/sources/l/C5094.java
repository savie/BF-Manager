package l;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 43T5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5094 implements InterfaceC7419 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence f17790;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C16390 f17791;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Drawable f17792;

    @Override // l.InterfaceC7419
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean mo15402() {
        return true;
    }

    public C5094(C16390 c16390) {
        this.f17791 = c16390;
        this.f17792 = c16390.getNavigationIcon();
        this.f17790 = c16390.getNavigationContentDescription();
    }

    @Override // l.InterfaceC7419
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo15400(Drawable drawable, int i) {
        this.f17791.setNavigationIcon(drawable);
        mo15399(i);
    }

    @Override // l.InterfaceC7419
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo15399(int i) {
        C16390 c16390 = this.f17791;
        if (i == 0) {
            c16390.setNavigationContentDescription(this.f17790);
        } else {
            c16390.setNavigationContentDescription(i);
        }
    }

    @Override // l.InterfaceC7419
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Drawable mo15401() {
        return this.f17792;
    }

    @Override // l.InterfaceC7419
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Context mo15398() {
        return this.f17791.getContext();
    }
}
