package l;

/* JADX INFO: renamed from: l.᩺ۧ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M6WW */
/* JADX INFO: loaded from: classes.dex */
public final class C22941 extends AbstractC11123 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20824 f74571;

    @Override // l.AbstractC11123
    /* JADX INFO: renamed from: ۨ */
    public final void mo8536(AbstractC12554 abstractC12554) {
    }

    @Override // l.AbstractC11123
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo8537() {
        return false;
    }

    public C22941(C20824 c20824) {
        this.f74571 = c20824;
    }

    @Override // l.AbstractC11123
    /* JADX INFO: renamed from: ܰ */
    public final int mo8538(AbstractC12554 abstractC12554) {
        return AbstractC11123.m28050(C20824.m46846(this.f74571, abstractC12554.getBindingAdapterPosition()) ? 3 : 0, 0);
    }

    @Override // l.AbstractC11123
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo28057(AbstractC12554 abstractC12554) {
        return C20824.m46846(this.f74571, abstractC12554.getBindingAdapterPosition());
    }

    @Override // l.AbstractC11123
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo8535(C17492 c17492, AbstractC12554 abstractC12554, AbstractC12554 abstractC12555) {
        int bindingAdapterPosition = abstractC12554.getBindingAdapterPosition();
        int bindingAdapterPosition2 = abstractC12555.getBindingAdapterPosition();
        C20824 c20824 = this.f74571;
        if (!C20824.m46846(c20824, bindingAdapterPosition) || !C20824.m46846(c20824, bindingAdapterPosition2)) {
            return false;
        }
        int i = bindingAdapterPosition - 1;
        int i2 = bindingAdapterPosition2 - 1;
        C16259.m38415(((C9422) c20824.f67671.get(i)).f31925, ((C9422) c20824.f67671.get(i2)).f31925);
        C23520.m51798(i, i2, c20824.f67671);
        c20824.f67677.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
        return true;
    }
}
