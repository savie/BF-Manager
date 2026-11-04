package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.᩹᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: YB7L */
/* JADX INFO: loaded from: classes.dex */
public final class C23828 extends AbstractC17114 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC12639 f77171;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f77172;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC18606 f77173;

    public C23828(AbstractC12639 abstractC12639, String str, AbstractC18606 abstractC18606) {
        this.f77171 = abstractC12639;
        this.f77172 = str;
        this.f77173 = abstractC18606;
    }

    @Override // l.AbstractC17114
    /* JADX INFO: renamed from: ۙ */
    public final void mo4472(Object obj) throws Exception {
        AbstractC12639 abstractC12639 = this.f77171;
        HashMap map = abstractC12639.f40547;
        String str = this.f77172;
        Integer num = (Integer) map.get(str);
        AbstractC18606 abstractC18606 = this.f77173;
        if (num == null) {
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC18606 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }
        abstractC12639.f40552.add(str);
        try {
            abstractC12639.mo23777(num.intValue(), abstractC18606, obj);
        } catch (Exception e) {
            abstractC12639.f40552.remove(str);
            throw e;
        }
    }

    @Override // l.AbstractC17114
    /* JADX INFO: renamed from: ۙ */
    public final void mo4471() {
        this.f77171.m31424(this.f77172);
    }
}
