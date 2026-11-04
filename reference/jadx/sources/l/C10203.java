package l;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ۢܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: V51X */
/* JADX INFO: loaded from: classes4.dex */
public final class C10203 extends AbstractC22340 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final WeakReference f32631;

    public C10203(C1255 c1255) {
        this.f32631 = new WeakReference(c1255);
    }

    @Override // l.AbstractC22340
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo26322() {
        C1255 c1255 = (C1255) this.f32631.get();
        if (c1255 != null) {
            c1255.onEmojiCompatInitializedForSwitchText();
        }
    }

    @Override // l.AbstractC22340
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo26321() {
        C1255 c1255 = (C1255) this.f32631.get();
        if (c1255 != null) {
            c1255.onEmojiCompatInitializedForSwitchText();
        }
    }
}
