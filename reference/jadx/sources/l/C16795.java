package l;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ܽᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: V51X */
/* JADX INFO: loaded from: classes4.dex */
public final class C16795 extends AbstractC11406 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final WeakReference f53782;

    public C16795(C12562 c12562) {
        this.f53782 = new WeakReference(c12562);
    }

    @Override // l.AbstractC11406
    /* JADX INFO: renamed from: ܰ */
    public final void mo28510() {
        C12562 c12562 = (C12562) this.f53782.get();
        if (c12562 != null) {
            c12562.onEmojiCompatInitializedForSwitchText();
        }
    }

    @Override // l.AbstractC11406
    /* JADX INFO: renamed from: ۙ */
    public final void mo28509() {
        C12562 c12562 = (C12562) this.f53782.get();
        if (c12562 != null) {
            c12562.onEmojiCompatInitializedForSwitchText();
        }
    }
}
