package l;

import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.ۢܽ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 1B34 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9718 implements InterfaceC1914 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ LinkedHashMap f32715;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5359 f32716;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC4653 f32717;

    @Override // l.InterfaceC1914
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo6227(IOException iOException) {
        return true;
    }

    public C9718(C5359 c5359, LinkedHashMap linkedHashMap, AbstractC4653 abstractC4653) {
        this.f32716 = c5359;
        this.f32715 = linkedHashMap;
        this.f32717 = abstractC4653;
    }

    @Override // l.InterfaceC1914
    /* JADX INFO: renamed from: ۙ */
    public final void mo6226(InterfaceC2557 interfaceC2557, InputStream inputStream) {
        AbstractC4653 abstractC4653 = this.f32717;
        try {
            C6189 c6189 = (C6189) this.f32715.get(interfaceC2557);
            C13638.requireNonNull(c6189);
            abstractC4653.mo12845(c6189.m17193(), false);
            if (inputStream != null && this.f32716.m14861(C5359.m14854(inputStream))) {
                abstractC4653.m12846(c6189);
            }
        } finally {
            C19431.m44468(inputStream);
        }
    }

    @Override // l.InterfaceC5614
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo2357() {
        return this.f32716.f18518;
    }
}
