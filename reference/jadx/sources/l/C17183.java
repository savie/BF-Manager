package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܺ᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7KX */
/* JADX INFO: loaded from: classes5.dex */
public final class C17183 extends AbstractC2618 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17929 f55998;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17183(C17929 c17929) {
        super(c17929, EnumC10712.RECORD_PHASE, new C5997(c17929));
        this.f55998 = c17929;
    }

    @Override // l.AbstractC11962
    /* JADX INFO: renamed from: ۙ */
    public final void mo7699(C3168 c3168) {
        C17929 c17929;
        C14769 c14769M23492;
        C7926 c7926 = c3168.f10279;
        C24550 c24550 = c7926.f26345;
        if ((c24550.f38071 & 2305843009213693952L) != 0) {
            Iterator it = C11239.m28326(c7926).iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                c17929 = this.f55998;
                if (!zHasNext) {
                    break;
                }
                C12510 c12510 = (C12510) it.next();
                C22224 c22224M54829 = c24550.m54829(c12510);
                if (c22224M54829 != null && c22224M54829.m50283().m35551() != c12510.f40170.f15824.m35551()) {
                    C15714 c15714 = c17929.f58722;
                    c15714.f51040 = c12510.f26658;
                    c12510.f40170.f15824 = new C8781(c15714).m23492((Object) null, c22224M54829.m50283());
                }
                c17929.f58738.m11696((AbstractC8036) c12510, c3168);
                if (!c12510.f40170.f15824.isEmpty()) {
                    C15714 c15715 = c17929.f58722;
                    c15715.f51040 = c12510.f26658;
                    c14769M23492 = new C8781(c15715).m23492((Object) null, c12510.f40170.f15824);
                } else {
                    c14769M23492 = C14769.m35543();
                }
                c24550.m54831(c22224M54829, c12510, c14769M23492);
            }
            m8758(c24550, c3168);
            for (AbstractC8036 abstractC8036 : c7926.f26344) {
                if (C11239.m28348(abstractC8036)) {
                    c17929.f58738.m11696(abstractC8036, c3168);
                }
            }
        }
    }
}
