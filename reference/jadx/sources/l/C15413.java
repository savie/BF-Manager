package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܶᩴ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 640U */
/* JADX INFO: loaded from: classes4.dex */
public final class C15413 implements Iterable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10474 f50248;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public ArrayList f50249 = new ArrayList();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Iterator f50250;

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C23174(this, this);
    }

    public C15413(C10474 c10474, Iterator it) {
        this.f50248 = c10474;
        this.f50250 = it;
    }
}
