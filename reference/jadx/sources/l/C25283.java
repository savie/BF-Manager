package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩻᩶ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes.dex */
public final class C25283 extends AbstractViewOnClickListenerC13260 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f81668;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC22957 f81669;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25283(ActivityC22957 activityC22957, ActivityC22957 activityC22958, boolean z) {
        super(activityC22958);
        this.f81669 = activityC22957;
        this.f81668 = z;
    }

    @Override // l.AbstractViewOnClickListenerC13260
    /* JADX INFO: renamed from: ۙ */
    public final void mo32809(final Pattern pattern, String str) {
        ActivityC22957 activityC22957 = this.f81669;
        if (!activityC22957.f74569.f24321.isEmpty()) {
            ((C16989) activityC22957.f74569.f24321.peek()).f55524 = activityC22957.f74570.getFirstVisiblePosition();
        }
        Collection collectionValues = this.f81668 ? ((C16989) activityC22957.f74569.f24321.peek()).f55522 : activityC22957.f74569.f24316.values();
        final C16989 c16989 = new C16989();
        c16989.f55523 = str;
        final ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue(collectionValues);
        Runnable runnable = new Runnable() { // from class: l.ۧ᩶ۤ
            @Override // java.lang.Runnable
            public final void run() {
                C4072 c4072;
                ConcurrentLinkedQueue concurrentLinkedQueue2 = concurrentLinkedQueue;
                Pattern pattern2 = pattern;
                C16989 c169810 = c16989;
                while (!concurrentLinkedQueue2.isEmpty() && (c4072 = (C4072) concurrentLinkedQueue2.poll()) != null) {
                    C6310 c6310M13154 = c4072.m13154();
                    if (c6310M13154 != null) {
                        C12275[] c12275ArrM18016 = c6310M13154.m18016();
                        int length = c12275ArrM18016.length;
                        int i = 0;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                C12275[] c12275ArrM18012 = c6310M13154.m18012();
                                int length2 = c12275ArrM18012.length;
                                while (true) {
                                    if (i >= length2) {
                                        continue;
                                    } else if (!C17735.m41544(c12275ArrM18012[i], pattern2)) {
                                        i++;
                                    }
                                }
                            } else if (!C17735.m41544(c12275ArrM18016[i2], pattern2)) {
                                i2++;
                            }
                            synchronized (c169810) {
                                c169810.f55522.add(c4072);
                            }
                        }
                    }
                }
            }
        };
        LinkedList linkedList = new LinkedList();
        int i = C11138.f35105 / 2;
        for (int i2 = 0; i2 < i; i2++) {
            Thread thread = new Thread(runnable);
            thread.start();
            linkedList.add(thread);
        }
        runnable.run();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            try {
                ((Thread) it.next()).join();
            } catch (InterruptedException unused) {
            }
        }
        activityC22957.f74569.f24321.push(c16989);
        activityC22957.f74569.f24314 = activityC22957.f74569.m20286();
    }

    @Override // l.AbstractViewOnClickListenerC13260
    /* JADX INFO: renamed from: ۙ */
    public final void mo32808() {
        ActivityC22957 activityC22957 = this.f81669;
        activityC22957.setTitle(((C16989) activityC22957.f74569.f24321.peek()).f55523);
        activityC22957.m51757(EnumC11022.SEARCH_RESULT_CLASS);
    }
}
