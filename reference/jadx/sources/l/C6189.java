package l;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.SystemClock;
import android.widget.ImageView;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: l.ۛܽ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4UF */
/* JADX INFO: loaded from: classes2.dex */
public final class C6189 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f21064;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f21065;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final LinkedList f21066 = new LinkedList();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC2557 f21067;

    public C6189(InterfaceC2557 interfaceC2557, String str) {
        this.f21067 = interfaceC2557;
        this.f21064 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2557 m17194() {
        return this.f21067;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17195(C6794 c6794) {
        this.f21067 = c6794;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m17197() {
        return this.f21064;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m17193() {
        return C6730.m18162(this.f21064, this.f21067.getName());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m17198() {
        return this.f21067.getName();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17196(final AbstractC11462 abstractC11462, ImageView imageView, ExecutorService executorService, final C6606 c6606) {
        imageView.setTag(this);
        synchronized (this.f21066) {
            this.f21066.add(imageView);
        }
        final InterfaceC13848 interfaceC13848Mo23624 = abstractC11462.mo23624();
        if (this.f21067.getIcon() != null) {
            imageView.setImageDrawable(this.f21067.getIcon().m35074());
            return;
        }
        final C14600 c14600 = interfaceC13848Mo23624.mo7924(this.f21067).f2943;
        imageView.setImageDrawable(c14600.m35074());
        final int iMo7926 = interfaceC13848Mo23624.mo7926(this.f21067);
        if (iMo7926 == 0) {
            this.f21067.mo7966(c14600);
        } else {
            executorService.execute(new Runnable() { // from class: l.ܽܽ᩹
                @Override // java.lang.Runnable
                public final void run() {
                    C6189.m17190(this.f53682, c6606, interfaceC13848Mo23624, abstractC11462, iMo7926, c14600);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m17190(C6189 c6189, C6606 c6606, InterfaceC13848 interfaceC13848, AbstractC11462 abstractC11462, int i, C14600 c14600) {
        while (c6606.m17934()) {
            SystemClock.sleep(10L);
            if (!c6189.m17191()) {
                return;
            }
            int i2 = C5031.f17539;
            if (!c6606.isAttachedToWindow()) {
                return;
            }
        }
        C14600 c14600Mo7925 = interfaceC13848.mo7925(abstractC11462, c6189.f21067, i);
        c6189.f21067.mo7966(c14600Mo7925);
        if (c14600Mo7925 == c14600 || !c6189.m17191()) {
            return;
        }
        final C17478 c17478 = new C17478();
        c17478.f55615 = c6189;
        C16737.m39273(new Runnable() { // from class: l.۫ܽ᩹
            @Override // java.lang.Runnable
            public final void run() {
                C17478 c17479 = c17478;
                if (c17479.f55615.m17191()) {
                    synchronized (c17479.f55615.f21066) {
                        for (ImageView imageView : c17479.f55615.f21066) {
                            Drawable drawable = imageView.getDrawable();
                            if (drawable == null) {
                                drawable = new ColorDrawable(0);
                            }
                            TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable, c17479.f55615.m17194().getIcon().m35074()});
                            transitionDrawable.setCrossFadeEnabled(true);
                            imageView.setImageDrawable(transitionDrawable);
                            transitionDrawable.startTransition(300);
                        }
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean m17191() {
        if (this.f21066.isEmpty()) {
            return false;
        }
        synchronized (this.f21066) {
            ListIterator listIterator = this.f21066.listIterator();
            while (listIterator.hasNext()) {
                if (((ImageView) listIterator.next()).getTag() != this) {
                    listIterator.remove();
                }
            }
        }
        return !this.f21066.isEmpty();
    }
}
