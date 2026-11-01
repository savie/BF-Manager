package l;

/* JADX INFO: renamed from: l.ۙᩳۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: G67D */
/* JADX INFO: loaded from: classes3.dex */
public final class C4810 extends AbstractC23156 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC23156[] f16902;

    public C4810(AbstractC16579 abstractC16579, AbstractC23156[] abstractC23156Arr) {
        super(abstractC16579);
        this.f16902 = abstractC23156Arr;
    }

    public C4810(C8777 c8777, C21825 c21825) {
        super(c8777);
        this.f16902 = (AbstractC23156[]) c21825.toArray(new AbstractC23156[c21825.m48596()]);
    }

    @Override // l.AbstractC23156
    /* JADX INFO: renamed from: ۙ */
    public final void mo4166(InterfaceC6927 interfaceC6927) {
        interfaceC6927.mo7548(this);
    }

    @Override // l.InterfaceC11097
    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        AbstractC23156[] abstractC23156Arr = this.f16902;
        int length = abstractC23156Arr.length;
        boolean z = true;
        int i = 0;
        while (i < length) {
            AbstractC23156 abstractC23156 = abstractC23156Arr[i];
            if (!z) {
                sb.append(", ");
            }
            sb.append(abstractC23156);
            i++;
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // l.AbstractC23156, l.InterfaceC11097
    /* JADX INFO: renamed from: ۙ */
    public final Object mo8225(InterfaceC23797 interfaceC23797) {
        return interfaceC23797.mo2801(C21825.m48586((Object[]) this.f16902));
    }

    @Override // l.AbstractC23156
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C10935 mo13366() {
        AbstractC23156[] abstractC23156Arr = this.f16902;
        if (abstractC23156Arr.length != 0) {
            return abstractC23156Arr[0].mo13366();
        }
        return null;
    }
}
