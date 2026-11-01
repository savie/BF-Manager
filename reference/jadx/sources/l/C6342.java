package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۛ᩹ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 89CO */
/* JADX INFO: loaded from: classes3.dex */
public final class C6342 extends AbstractC11123 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC6426 f21395;

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

    public C6342(ActivityC6426 activityC6426) {
        this.f21395 = activityC6426;
    }

    @Override // l.AbstractC11123
    /* JADX INFO: renamed from: ܰ */
    public final int mo8538(AbstractC12554 abstractC12554) {
        AbstractC9871 abstractC9871 = (AbstractC9871) this.f21395.f21767.get(abstractC12554.getBindingAdapterPosition());
        abstractC9871.getClass();
        return abstractC9871 instanceof C3519 ? AbstractC11123.m28050(3, 0) : AbstractC11123.m28050(0, 0);
    }

    @Override // l.AbstractC11123
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo8535(C17492 c17492, AbstractC12554 abstractC12554, AbstractC12554 abstractC12555) {
        int bindingAdapterPosition = abstractC12554.getBindingAdapterPosition();
        int bindingAdapterPosition2 = abstractC12555.getBindingAdapterPosition();
        ActivityC6426 activityC6426 = this.f21395;
        AbstractC9871 abstractC9871 = (AbstractC9871) activityC6426.f21767.get(bindingAdapterPosition2);
        abstractC9871.getClass();
        if (abstractC9871 instanceof C5015) {
            return false;
        }
        if ((abstractC9871 instanceof C23982) && abstractC9871.mo24966().f77737 == 0) {
            return false;
        }
        C23520.m51798(bindingAdapterPosition, bindingAdapterPosition2, activityC6426.f21767);
        AbstractC0414 adapter = c17492.getAdapter();
        C13638.requireNonNull(adapter);
        adapter.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
        C4716.m13051(new Runnable() { // from class: l.ܿ᩹ۚ
            @Override // java.lang.Runnable
            public final void run() {
                ArrayList arrayList = new ArrayList();
                for (AbstractC9871 abstractC9872 : this.f56037.f21395.f21767) {
                    abstractC9872.getClass();
                    if (abstractC9872 instanceof C23982) {
                        int i = abstractC9872.mo24966().f77737;
                        if (i == 1) {
                            arrayList.add(C18421.f58739);
                        } else if (i == 2) {
                            arrayList.add(C22655.f73802);
                        }
                    } else if (abstractC9872 instanceof C3519) {
                        arrayList.add(abstractC9872.mo10352().f12877);
                    }
                }
                int i2 = -1;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    String strMo20676 = ((AbstractC21243) arrayList.get(i3)).mo20676();
                    strMo20676.getClass();
                    if (strMo20676.equals("builtin:systemTranslate")) {
                        C16926.m39618(arrayList);
                        C16926.m39622();
                    } else {
                        if (strMo20676.equals("builtin:translate")) {
                            i2 = i3;
                        }
                    }
                }
                arrayList.add(i2 + 1, new C20454(12));
                C16926.m39618(arrayList);
                C16926.m39622();
            }
        }, this, 1000L);
        return true;
    }
}
