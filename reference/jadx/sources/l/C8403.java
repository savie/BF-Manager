package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.۠᩶ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8403 extends AbstractViewOnClickListenerC14879 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC3588 f29150;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f29151;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8403(ActivityC3588 activityC3588, ActivityC3588 activityC3589, boolean z) {
        super(activityC3589);
        this.f29150 = activityC3588;
        this.f29151 = z;
    }

    @Override // l.AbstractViewOnClickListenerC14879
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo22037(Pattern pattern, String str) {
        ActivityC3588 activityC3588 = this.f29150;
        if (!activityC3588.f13204.f7912.isEmpty()) {
            ((C19112) activityC3588.f13204.f7912.peek()).f61751 = activityC3588.f13206.getFirstVisiblePosition();
        }
        Collection collectionValues = this.f29151 ? ((C19112) activityC3588.f13204.f7912.peek()).f61749 : activityC3588.f13204.f7902.values();
        C19112 c19112 = new C19112();
        c19112.f61750 = str;
        RunnableC18986 runnableC18986 = new RunnableC18986(new ConcurrentLinkedQueue(collectionValues), pattern, c19112, 0);
        LinkedList linkedList = new LinkedList();
        int i = C5464.f18831 / 2;
        for (int i2 = 0; i2 < i; i2++) {
            Thread thread = new Thread(runnableC18986);
            thread.start();
            linkedList.add(thread);
        }
        runnableC18986.run();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            try {
                ((Thread) it.next()).join();
            } catch (InterruptedException unused) {
            }
        }
        activityC3588.f13204.f7912.push(c19112);
        activityC3588.f13204.f7909 = activityC3588.f13204.m6777();
    }

    @Override // l.AbstractViewOnClickListenerC14879
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo22036() {
        ActivityC3588 activityC3588 = this.f29150;
        activityC3588.setTitle(((C19112) activityC3588.f13204.f7912.peek()).f61750);
        activityC3588.m10619(EnumC12762.SEARCH_RESULT_CLASS);
    }
}
