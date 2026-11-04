package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩻֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7IB */
/* JADX INFO: loaded from: classes.dex */
public final class C24722 extends AbstractC16474 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC3838 f80036;

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

    public C24722(ActivityC3838 activityC3838) {
        this.f80036 = activityC3838;
    }

    @Override // l.AbstractC16474
    /* JADX INFO: renamed from: ᩷ */
    public final int mo9678(AbstractC11800 abstractC11800) {
        AbstractC23230 abstractC23230 = (AbstractC23230) this.f80036.f13073.get(abstractC11800.getBindingAdapterPosition());
        abstractC23230.getClass();
        return abstractC23230 instanceof C3092 ? AbstractC16474.m39083(3, 0) : AbstractC16474.m39083(0, 0);
    }

    @Override // l.AbstractC16474
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo9676(C25227 c25227, AbstractC11800 abstractC11800, AbstractC11800 abstractC11801) {
        int bindingAdapterPosition = abstractC11800.getBindingAdapterPosition();
        int bindingAdapterPosition2 = abstractC11801.getBindingAdapterPosition();
        ActivityC3838 activityC3838 = this.f80036;
        AbstractC23230 abstractC23230 = (AbstractC23230) activityC3838.f13073.get(bindingAdapterPosition2);
        abstractC23230.getClass();
        if ((abstractC23230 instanceof C17262) && abstractC23230.mo40559().f56238 == 0) {
            return false;
        }
        C9911.m25734(bindingAdapterPosition, bindingAdapterPosition2, activityC3838.f13073);
        AbstractC12964 adapter = c25227.getAdapter();
        C17359.requireNonNull(adapter);
        adapter.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
        C5261.m15836(new Runnable() { // from class: l.ۧ֫ᩴ
            @Override // java.lang.Runnable
            public final void run() {
                ArrayList arrayList = new ArrayList();
                for (AbstractC23230 abstractC23231 : this.f35609.f80036.f13073) {
                    abstractC23231.getClass();
                    if (abstractC23231 instanceof C17262) {
                        int i = abstractC23231.mo40559().f56238;
                        if (i == 1) {
                            arrayList.add(C15024.f49062);
                        } else if (i == 2) {
                            arrayList.add(C21738.f69343);
                        }
                    } else if (abstractC23231 instanceof C3092) {
                        arrayList.add(abstractC23231.mo10067().f10018);
                    }
                }
                C5330.m15979(arrayList);
                C5330.m15981();
            }
        }, this, 1000L);
        return true;
    }
}
