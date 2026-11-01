package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۟֨ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7IB */
/* JADX INFO: loaded from: classes3.dex */
public final class C7132 extends AbstractC11123 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC23361 f23841;

    @Override // l.AbstractC11123
    /* JADX INFO: renamed from: ۨ */
    public final void mo8536(AbstractC12554 abstractC12554) {
    }

    @Override // l.AbstractC11123
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo8537() {
        return false;
    }

    @Override // l.AbstractC11123
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo8539() {
        return false;
    }

    public C7132(ActivityC23361 activityC23361) {
        this.f23841 = activityC23361;
    }

    @Override // l.AbstractC11123
    /* JADX INFO: renamed from: ܰ */
    public final int mo8538(AbstractC12554 abstractC12554) {
        AbstractC0076 abstractC0076 = (AbstractC0076) this.f23841.f75683.get(abstractC12554.getBindingAdapterPosition());
        abstractC0076.getClass();
        return abstractC0076 instanceof C16305 ? AbstractC11123.m28050(3, 0) : AbstractC11123.m28050(0, 0);
    }

    @Override // l.AbstractC11123
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo8535(C17492 c17492, AbstractC12554 abstractC12554, AbstractC12554 abstractC12555) {
        int bindingAdapterPosition = abstractC12554.getBindingAdapterPosition();
        int bindingAdapterPosition2 = abstractC12555.getBindingAdapterPosition();
        ActivityC23361 activityC23361 = this.f23841;
        AbstractC0076 abstractC0076 = (AbstractC0076) activityC23361.f75683.get(bindingAdapterPosition2);
        abstractC0076.getClass();
        if ((abstractC0076 instanceof C15600) && abstractC0076.mo1009().f50730 == 0) {
            return false;
        }
        C23520.m51798(bindingAdapterPosition, bindingAdapterPosition2, activityC23361.f75683);
        AbstractC0414 adapter = c17492.getAdapter();
        C13638.requireNonNull(adapter);
        adapter.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
        C4716.m13051(new Runnable() { // from class: l.ۤ֨ۚ
            @Override // java.lang.Runnable
            public final void run() {
                ArrayList arrayList = new ArrayList();
                for (AbstractC0076 abstractC0077 : this.f34022.f23841.f75683) {
                    abstractC0077.getClass();
                    if (abstractC0077 instanceof C15600) {
                        int i = abstractC0077.mo1009().f50730;
                        if (i == 1) {
                            arrayList.add(C18421.f58739);
                        } else if (i == 2) {
                            arrayList.add(C22655.f73802);
                        }
                    } else if (abstractC0077 instanceof C16305) {
                        arrayList.add(abstractC0077.mo1011().f52509);
                    }
                }
                C19127.m43948(arrayList);
                C19127.m43949();
            }
        }, this, 1000L);
        return true;
    }
}
