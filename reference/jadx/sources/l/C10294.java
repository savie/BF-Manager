package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۤ۫ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4RA */
/* JADX INFO: loaded from: classes3.dex */
public final class C10294 extends AbstractC15939 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterable f35046;

    public C10294(Iterable iterable) {
        this.f35046 = iterable;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C8697(new C18574(((C3756) this.f35046).iterator(), new C15489(8)));
    }
}
