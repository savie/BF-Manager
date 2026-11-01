package l;

import java.util.regex.Matcher;

/* JADX INFO: renamed from: l.ܺ᩷ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3OZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C16188 extends AbstractC0664 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22538 f52282;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16188(C12660 c12660, CharSequence charSequence, C22538 c22538) {
        super(c12660, charSequence);
        this.f52282 = c22538;
    }

    @Override // l.AbstractC0664
    /* JADX INFO: renamed from: ۨ */
    public final int mo2987(int i) {
        Matcher matcher = this.f52282.f73508;
        if (matcher.find(i)) {
            return matcher.start();
        }
        return -1;
    }

    @Override // l.AbstractC0664
    /* JADX INFO: renamed from: ܰ */
    public final int mo2988(int i) {
        return this.f52282.f73508.end();
    }
}
