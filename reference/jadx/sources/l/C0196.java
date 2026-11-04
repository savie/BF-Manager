package l;

import java.util.regex.Matcher;

/* JADX INFO: renamed from: l.֡ۙܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3OZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C0196 extends AbstractC18841 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24809 f1316;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0196(C0942 c0942, CharSequence charSequence, C24809 c24809) {
        super(c0942, charSequence);
        this.f1316 = c24809;
    }

    @Override // l.AbstractC18841
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int mo1564(int i) {
        Matcher matcher = this.f1316.f80276;
        if (matcher.find(i)) {
            return matcher.start();
        }
        return -1;
    }

    @Override // l.AbstractC18841
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int mo1565(int i) {
        return this.f1316.f80276.end();
    }
}
