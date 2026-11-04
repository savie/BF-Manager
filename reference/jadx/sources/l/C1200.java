package l;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.SystemClock;
import android.widget.ImageView;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: l.֨۬ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4UF */
/* JADX INFO: loaded from: classes2.dex */
public final class C1200 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f4366;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final LinkedList f4367 = new LinkedList();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC2386 f4368;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f4369;

    public C1200(InterfaceC2386 interfaceC2386, String str) {
        this.f4368 = interfaceC2386;
        this.f4369 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2386 m4414() {
        return this.f4368;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4415(C6004 c6004) {
        this.f4368 = c6004;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m4417() {
        return this.f4369;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m4418() {
        return this.f4368.getName();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m4419() {
        return C11293.m28549(this.f4369, this.f4368.getName());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4416(final AbstractC7364 abstractC7364, ImageView imageView, ExecutorService executorService, final C19987 c19987) {
        imageView.setTag(this);
        synchronized (this.f4367) {
            this.f4367.add(imageView);
        }
        final InterfaceC0895 interfaceC0895Mo10169 = abstractC7364.mo10169();
        if (this.f4368.getIcon() != null) {
            imageView.setImageDrawable(this.f4368.getIcon().m30080());
            return;
        }
        final C11983 c11983 = interfaceC0895Mo10169.mo3626(this.f4368).f66114;
        imageView.setImageDrawable(c11983.m30080());
        final int iMo2786 = interfaceC0895Mo10169.mo2786(this.f4368);
        if (iMo2786 == 0) {
            this.f4368.mo8094(c11983);
        } else {
            executorService.execute(new Runnable() { // from class: l.۟۬ܳ
                @Override // java.lang.Runnable
                public final void run() {
                    C1200.m4411(this.f26281, c19987, interfaceC0895Mo10169, abstractC7364, iMo2786, c11983);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m4411(C1200 c1200, C19987 c19987, InterfaceC0895 interfaceC0895, AbstractC7364 abstractC7364, int i, C11983 c11983) {
        while (c19987.m45949()) {
            SystemClock.sleep(10L);
            if (!c1200.m4412()) {
                return;
            }
            int i2 = C22666.f73603;
            if (!c19987.isAttachedToWindow()) {
                return;
            }
        }
        C11983 c11983Mo2785 = interfaceC0895.mo2785(abstractC7364, c1200.f4368, i);
        c1200.f4368.mo8094(c11983Mo2785);
        if (c11983Mo2785 == c11983 || !c1200.m4412()) {
            return;
        }
        final C10148 c10148 = new C10148();
        c10148.f32505 = c1200;
        C21576.m49068(new Runnable() { // from class: l.ᩳ۬ܳ
            @Override // java.lang.Runnable
            public final void run() {
                C10148 c10149 = c10148;
                if (c10149.f32505.m4412()) {
                    synchronized (c10149.f32505.f4367) {
                        for (ImageView imageView : c10149.f32505.f4367) {
                            Drawable drawable = imageView.getDrawable();
                            if (drawable == null) {
                                drawable = new ColorDrawable(0);
                            }
                            TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable, c10149.f32505.m4414().getIcon().m30080()});
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
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean m4412() {
        if (this.f4367.isEmpty()) {
            return false;
        }
        synchronized (this.f4367) {
            ListIterator listIterator = this.f4367.listIterator();
            while (listIterator.hasNext()) {
                if (((ImageView) listIterator.next()).getTag() != this) {
                    listIterator.remove();
                }
            }
        }
        return !this.f4367.isEmpty();
    }
}
