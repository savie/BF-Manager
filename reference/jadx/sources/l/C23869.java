package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩹᩹᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 97L */
/* JADX INFO: loaded from: classes.dex */
public final class C23869 extends AbstractC21631 implements InterfaceC15224, InterfaceC19597 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19393 f77273;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C4477 f77274;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23869(C19393 c19393) {
        super(c19393);
        this.f77273 = c19393;
    }

    @Override // l.AbstractC21631
    /* JADX INFO: renamed from: ۙ */
    public final void mo3081(int i, Object obj) {
        C4477 c4477 = new C4477(this.f77273, i);
        this.f77274 = c4477;
        ((Consumer) obj).accept(c4477);
    }

    @Override // java.util.Iterator
    public final Object next() {
        C4477 c4477 = new C4477(this.f77273, m49168());
        this.f77274 = c4477;
        return c4477;
    }

    @Override // l.AbstractC21631, java.util.Iterator
    public final void remove() {
        super.remove();
        this.f77274.f16015 = -1;
    }
}
