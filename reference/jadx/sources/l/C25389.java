package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩻᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7KX */
/* JADX INFO: loaded from: classes.dex */
public final class C25389 extends C7093 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17929 f81961;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C14769 f81962;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f81963;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25389(C17929 c17929, C24550 c24550, C14769 c14769) {
        super(c17929, c24550);
        this.f81961 = c17929;
        this.f81962 = c14769;
        this.f81963 = C1170.stream(c24550.m54835()).anyMatch(new C15165(5));
    }

    @Override // l.C7093, l.InterfaceC13804
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC22664 mo19436() {
        C17929 c17929;
        if (this.f23401 == null) {
            C18499 c18499 = new C18499();
            C14769 c14769 = this.f81962;
            C12510 c12510 = (C12510) c14769.last();
            Iterator it = c14769.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                c17929 = this.f81961;
                if (!zHasNext) {
                    break;
                }
                C12510 c12511 = (C12510) it.next();
                c18499.m43089((c12511 == c12510 && this.f81963) ? c17929.f58720.m55120(c12511.f40168.f38067) : c12511.f40168.f38067);
            }
            this.f23401 = new C23191(c18499.m43093(), c17929.f58739.f48251, C14769.m35543(), c17929.f58739.f48275);
        }
        return this.f23401;
    }

    @Override // l.C7093, l.InterfaceC13804
    /* JADX INFO: renamed from: ᩸ */
    public final C10377 mo19439() {
        C10377 c10377Mo19439 = super.mo19439();
        c10377Mo19439.f38071 |= 2251868533161984L;
        C18499 c18499 = new C18499();
        C14769<C12510> c14769 = this.f81962;
        C12510 c12510 = (C12510) c14769.last();
        for (C12510 c12511 : c14769) {
            c18499.m43089(new C5816(((c12511 == c12510 && this.f81963) ? 17179869184L : 0L) | 2305843017820405760L, c12511.f40164, c12511.f40168.f38067, c10377Mo19439));
        }
        c10377Mo19439.f33013 = c18499.m43093();
        c10377Mo19439.f38071 |= 2305843009213693952L;
        return c10377Mo19439;
    }

    @Override // l.C7093, l.InterfaceC13804
    /* JADX INFO: renamed from: ۙ */
    public final C6633 mo19435(C6633 c6633) {
        C14769 c14769M23492;
        C14769 c14769 = this.f81962;
        for (C12510 c12510 : c6633.f22145) {
            C22224 c22224M54828 = ((C24550) this.f23400).m54828(c12510.f40168);
            C15714 c15714 = this.f81961.f58722;
            c15714.f51040 = c12510.f26658;
            C8781 c8781 = new C8781(c15714);
            C4395 c4395 = c12510.f40170;
            if (!c22224M54828.m50283().isEmpty()) {
                c14769M23492 = c8781.m23492((Object) null, c22224M54828.m50283());
            } else {
                c14769M23492 = C14769.m35543();
            }
            c4395.f15824 = c14769M23492;
            c12510.f40166 = (AbstractC22295) c8781.mo23491(((C12510) c14769.f48335).f40166, (Object) null);
            c14769 = c14769.f48336;
        }
        return c6633;
    }
}
