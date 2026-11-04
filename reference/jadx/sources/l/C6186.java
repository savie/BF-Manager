package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۛۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 89CO */
/* JADX INFO: loaded from: classes3.dex */
public final class C6186 extends AbstractC16474 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC4584 f21074;

    @Override // l.AbstractC16474
    /* JADX INFO: renamed from: ۤ */
    public final void mo9677(AbstractC11800 abstractC11800) {
    }

    @Override // l.AbstractC16474
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean mo17826() {
        return false;
    }

    @Override // l.AbstractC16474
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean mo17827() {
        return false;
    }

    public C6186(ActivityC4584 activityC4584) {
        this.f21074 = activityC4584;
    }

    @Override // l.AbstractC16474
    /* JADX INFO: renamed from: ᩷ */
    public final int mo9678(AbstractC11800 abstractC11800) {
        AbstractC18118 abstractC18118 = (AbstractC18118) this.f21074.f16299.get(abstractC11800.getBindingAdapterPosition());
        abstractC18118.getClass();
        return abstractC18118 instanceof C0219 ? AbstractC16474.m39083(3, 0) : AbstractC16474.m39083(0, 0);
    }

    @Override // l.AbstractC16474
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo9676(C25227 c25227, AbstractC11800 abstractC11800, AbstractC11800 abstractC11801) {
        int bindingAdapterPosition = abstractC11800.getBindingAdapterPosition();
        int bindingAdapterPosition2 = abstractC11801.getBindingAdapterPosition();
        ActivityC4584 activityC4584 = this.f21074;
        AbstractC18118 abstractC18118 = (AbstractC18118) activityC4584.f16299.get(bindingAdapterPosition2);
        abstractC18118.getClass();
        if (abstractC18118 instanceof C9167) {
            return false;
        }
        if ((abstractC18118 instanceof C3948) && abstractC18118.mo12659().f13467 == 0) {
            return false;
        }
        C9911.m25734(bindingAdapterPosition, bindingAdapterPosition2, activityC4584.f16299);
        AbstractC12964 adapter = c25227.getAdapter();
        C17359.requireNonNull(adapter);
        adapter.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
        C5261.m15836(new Runnable() { // from class: l.ۨۚᩴ
            @Override // java.lang.Runnable
            public final void run() {
                ArrayList arrayList = new ArrayList();
                for (AbstractC18118 abstractC18119 : this.f39061.f21074.f16299) {
                    abstractC18119.getClass();
                    if (abstractC18119 instanceof C3948) {
                        int i = abstractC18119.mo12659().f13467;
                        if (i == 1) {
                            arrayList.add(C15024.f49062);
                        } else if (i == 2) {
                            arrayList.add(C21738.f69343);
                        }
                    } else if (abstractC18119 instanceof C0219) {
                        arrayList.add(abstractC18119.mo1672().f1423);
                    }
                }
                int i2 = -1;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    String strMo31674 = ((AbstractC22484) arrayList.get(i3)).mo31674();
                    strMo31674.getClass();
                    if (strMo31674.equals("builtin:systemTranslate")) {
                        C3202.m10539(arrayList);
                        C3202.m10541();
                    } else {
                        if (strMo31674.equals("builtin:translate")) {
                            i2 = i3;
                        }
                    }
                }
                arrayList.add(i2 + 1, new C15880(12));
                C3202.m10539(arrayList);
                C3202.m10541();
            }
        }, this, 1000L);
        return true;
    }
}
