package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩺۠ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 164Z */
/* JADX INFO: loaded from: classes.dex */
public final class C24168 extends AbstractC16474 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13724 f78197;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f78198;

    @Override // l.AbstractC16474
    /* JADX INFO: renamed from: ۤ */
    public final void mo9677(AbstractC11800 abstractC11800) {
    }

    @Override // l.AbstractC16474
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo17826() {
        return false;
    }

    @Override // l.AbstractC16474
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo17827() {
        return false;
    }

    public C24168(C13724 c13724, ArrayList arrayList) {
        this.f78197 = c13724;
        this.f78198 = arrayList;
    }

    @Override // l.AbstractC16474
    /* JADX INFO: renamed from: ᩷ */
    public final int mo9678(AbstractC11800 abstractC11800) {
        return AbstractC16474.m39083(this.f78197.m33536() ? 3 : 0, 0);
    }

    @Override // l.AbstractC16474
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo9676(C25227 c25227, AbstractC11800 abstractC11800, AbstractC11800 abstractC11801) {
        int bindingAdapterPosition = abstractC11800.getBindingAdapterPosition();
        int bindingAdapterPosition2 = abstractC11801.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1 || bindingAdapterPosition2 == -1) {
            return false;
        }
        ArrayList arrayList = this.f78198;
        C9911.m25734(bindingAdapterPosition, bindingAdapterPosition2, arrayList);
        this.f78197.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
        C1750.m6172(arrayList);
        return true;
    }
}
