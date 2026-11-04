package l;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.۠֨֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AY4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8277 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f27227;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC11499 f27229;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f27230;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public volatile boolean f27231;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f27232;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f27228 = new AtomicInteger(0);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Object f27233 = new Object();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22359(String str) {
        C15243.m36590(str, "name");
        ViewOnClickListenerC11499 viewOnClickListenerC11499 = this.f27229;
        Iterator it = viewOnClickListenerC11499.f36195.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else if (C15243.m36589((Object) ((InterfaceC2386) it.next()).getName(), (Object) str)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1) {
            return;
        }
        ((InterfaceC2386) viewOnClickListenerC11499.f36195.get(i2)).mo8111(true);
        C3802 c3802 = viewOnClickListenerC11499.f36194;
        if (c3802 == null) {
            C15243.m36592("adapter");
            throw null;
        }
        c3802.notifyItemChanged(i2);
        int iM22356 = m22356();
        C5817 c5817 = viewOnClickListenerC11499.f36192;
        if (c5817 == null) {
            C15243.m36592("recyclerView");
            throw null;
        }
        int iM16964 = c5817.m16964() - 1;
        if (5 >= iM16964) {
            iM16964 = 5;
        }
        if (i2 >= iM22356 && iM22356 + iM16964 > i2) {
            i = iM22356;
        } else if (i2 >= iM16964) {
            i = i2;
        }
        m22357(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22361(ViewOnClickListenerC14242 viewOnClickListenerC14242) {
        C15243.m36590(viewOnClickListenerC14242, "holder");
        if (System.currentTimeMillis() - this.f27230 < 300) {
            viewOnClickListenerC14242.itemView.setAlpha(0.0f);
            C12060.m30238(viewOnClickListenerC14242.itemView, 0.0f, 1.0f).m28879();
        }
        String str = this.f27227;
        if (str != null && System.currentTimeMillis() - this.f27232 > 800) {
            str = null;
        }
        if (str != null) {
            if (str.equals(viewOnClickListenerC14242.m34569().getName())) {
                TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{new ColorDrawable(C3296.f10758 & C3296.m10871(553648127, 620756991)), new ColorDrawable(0)});
                transitionDrawable.setCrossFadeEnabled(true);
                viewOnClickListenerC14242.m34565().setBackground(transitionDrawable);
                transitionDrawable.startTransition(EnumC5810.f19974);
                this.f27227 = null;
                return;
            }
            if (viewOnClickListenerC14242.m34565().getBackground() != null) {
                viewOnClickListenerC14242.m34565().setBackground(null);
            }
        }
    }

    public C8277(ViewOnClickListenerC11499 viewOnClickListenerC11499) {
        this.f27229 = viewOnClickListenerC11499;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m22356() {
        C5817 c5817 = this.f27229.f36192;
        if (c5817 != null) {
            return c5817.m16963();
        }
        C15243.m36592("recyclerView");
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22357(int i) {
        C5817 c5817 = this.f27229.f36192;
        if (c5817 != null) {
            c5817.m16970(i);
        } else {
            C15243.m36592("recyclerView");
            throw null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22355(ViewOnClickListenerC11499 viewOnClickListenerC11499, final C8277 c8277) {
        AbstractC8585 lifecycle = viewOnClickListenerC11499.getLifecycle();
        C15243.m36591(lifecycle, "<get-lifecycle>(...)");
        C13461 c13461 = C13461.f42854;
        while (lifecycle.mo23076() != EnumC2619.DESTROYED) {
            try {
                C5817 c5817 = viewOnClickListenerC11499.f36192;
                if (c5817 == null) {
                    C15243.m36592("recyclerView");
                    throw null;
                }
                if (!c5817.m16968() && !c8277.f27231 && lifecycle.mo23076().m8762(EnumC2619.STARTED)) {
                    C5817 c5818 = viewOnClickListenerC11499.f36192;
                    if (c5818 != null) {
                        int iM16963 = c5818.m16963();
                        List list = viewOnClickListenerC11499.f36195;
                        int i = c8277.f27228.get();
                        if (iM16963 < 0 || iM16963 >= list.size()) {
                            SystemClock.sleep(50L);
                        } else {
                            int size = list.size();
                            int i2 = iM16963;
                            while (true) {
                                if (i2 >= size) {
                                    int i3 = 0;
                                    while (true) {
                                        if (i3 < iM16963) {
                                            C5817 c5819 = viewOnClickListenerC11499.f36192;
                                            if (c5819 == null) {
                                                C15243.m36592("recyclerView");
                                                throw null;
                                            }
                                            if (c5819.m16968() || c8277.f27231 || i != c8277.f27228.get()) {
                                                break;
                                                break;
                                                break;
                                            }
                                            C5817 c58110 = viewOnClickListenerC11499.f36192;
                                            if (c58110 == null) {
                                                C15243.m36592("recyclerView");
                                                throw null;
                                            }
                                            if (iM16963 != c58110.m16963()) {
                                                break;
                                            }
                                            final InterfaceC2386 interfaceC2386 = (InterfaceC2386) list.get(i3);
                                            int iMo8108 = interfaceC2386.mo8108();
                                            if (iMo8108 != 0) {
                                                C11983 c11983Mo2785 = c13461.mo2785((AbstractC7364) null, interfaceC2386, iMo8108);
                                                C15243.m36591(c11983Mo2785, "loadDataIcon(...)");
                                                interfaceC2386.mo8094(c11983Mo2785);
                                                C5817 c58111 = viewOnClickListenerC11499.f36192;
                                                if (c58111 == null) {
                                                    C15243.m36592("recyclerView");
                                                    throw null;
                                                }
                                                c58111.post(new Runnable() { // from class: l.ۖ֨֫
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        this.f7475.m22360(interfaceC2386);
                                                    }
                                                });
                                            }
                                            if (lifecycle.mo23076() == EnumC2619.DESTROYED) {
                                                return;
                                            } else {
                                                i3++;
                                            }
                                        } else {
                                            while (i == c8277.f27228.get()) {
                                                synchronized (c8277.f27233) {
                                                    c8277.f27233.wait(1000L);
                                                    C11471 c11471 = C11471.f36082;
                                                }
                                                if (lifecycle.mo23076() == EnumC2619.DESTROYED) {
                                                    return;
                                                }
                                            }
                                            break;
                                        }
                                    }
                                } else {
                                    C5817 c58112 = viewOnClickListenerC11499.f36192;
                                    if (c58112 == null) {
                                        C15243.m36592("recyclerView");
                                        throw null;
                                    }
                                    if (c58112.m16968() || c8277.f27231 || i != c8277.f27228.get()) {
                                        break;
                                        break;
                                        break;
                                    }
                                    C5817 c58113 = viewOnClickListenerC11499.f36192;
                                    if (c58113 == null) {
                                        C15243.m36592("recyclerView");
                                        throw null;
                                    }
                                    if (iM16963 != c58113.m16963()) {
                                        break;
                                    }
                                    InterfaceC2386 interfaceC2387 = (InterfaceC2386) list.get(i2);
                                    int iMo8109 = interfaceC2387.mo8108();
                                    if (iMo8109 != 0) {
                                        C11983 c11983Mo2786 = c13461.mo2785((AbstractC7364) null, interfaceC2387, iMo8109);
                                        C15243.m36591(c11983Mo2786, "loadDataIcon(...)");
                                        interfaceC2387.mo8094(c11983Mo2786);
                                        C5817 c58114 = viewOnClickListenerC11499.f36192;
                                        if (c58114 == null) {
                                            C15243.m36592("recyclerView");
                                            throw null;
                                        }
                                        c58114.post(new RunnableC3232(1, c8277, interfaceC2387));
                                    }
                                    if (lifecycle.mo23076() == EnumC2619.DESTROYED) {
                                        return;
                                    } else {
                                        i2++;
                                    }
                                }
                            }
                        }
                    } else {
                        C15243.m36592("recyclerView");
                        throw null;
                    }
                } else {
                    SystemClock.sleep(50L);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22360(InterfaceC2386 interfaceC2386) {
        ViewOnClickListenerC11499 viewOnClickListenerC11499 = this.f27229;
        C5817 c5817 = viewOnClickListenerC11499.f36192;
        if (c5817 == null) {
            C15243.m36592("recyclerView");
            throw null;
        }
        int childCount = c5817.getChildCount();
        for (int i = 0; i < childCount; i++) {
            C5817 c5818 = viewOnClickListenerC11499.f36192;
            if (c5818 == null) {
                C15243.m36592("recyclerView");
                throw null;
            }
            View childAt = c5818.getChildAt(i);
            if (childAt != null) {
                C5817 c5819 = viewOnClickListenerC11499.f36192;
                if (c5819 == null) {
                    C15243.m36592("recyclerView");
                    throw null;
                }
                AbstractC11800 childViewHolder = c5819.getChildViewHolder(childAt);
                C15243.m36587((Object) childViewHolder, "null cannot be cast to non-null type bin.mt.plus.FilePickerActivity.FileListHolder");
                ViewOnClickListenerC14242 viewOnClickListenerC14242 = (ViewOnClickListenerC14242) childViewHolder;
                C11983 icon = interfaceC2386.getIcon();
                if (viewOnClickListenerC14242.m34569() == interfaceC2386 && icon != null) {
                    ImageView imageViewM34566 = viewOnClickListenerC14242.m34566();
                    Drawable drawable = imageViewM34566.getDrawable();
                    if (drawable == null) {
                        drawable = new ColorDrawable(0);
                    }
                    TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable, icon.m30080()});
                    transitionDrawable.setCrossFadeEnabled(true);
                    imageViewM34566.setImageDrawable(transitionDrawable);
                    transitionDrawable.startTransition(300);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22362(boolean z) {
        this.f27231 = true;
        this.f27228.incrementAndGet();
        C13461 c13461 = C13461.f42854;
        for (InterfaceC2386 interfaceC2386 : this.f27229.f36195) {
            if (interfaceC2386.getIcon() == null) {
                interfaceC2386.mo8095(c13461.mo3626(interfaceC2386));
                int iMo2786 = c13461.mo2786(interfaceC2386);
                if (iMo2786 != 0) {
                    interfaceC2386.mo8109(iMo2786);
                }
            }
        }
        if (z) {
            this.f27230 = System.currentTimeMillis();
        }
        C3802 c3802 = this.f27229.f36194;
        if (c3802 == null) {
            C15243.m36592("adapter");
            throw null;
        }
        c3802.notifyDataSetChanged();
        this.f27231 = false;
        synchronized (this.f27233) {
            this.f27233.notifyAll();
            C11471 c11471 = C11471.f36082;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0087  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22358(Integer num, String str) {
        Object next;
        if (str != null) {
            ViewOnClickListenerC11499 viewOnClickListenerC11499 = this.f27229;
            List list = viewOnClickListenerC11499.f36195;
            C15243.m36590(list, "<this>");
            Iterator it = new C15528(new C6997(list)).iterator();
            while (true) {
                C13291 c13291 = (C13291) it;
                if (!c13291.hasNext()) {
                    next = null;
                    break;
                }
                next = c13291.next();
                InterfaceC2386 interfaceC2386 = (InterfaceC2386) ((C20004) next).m46013();
                if (interfaceC2386.isDirectory() && C15243.m36589((Object) interfaceC2386.getName(), (Object) str)) {
                    break;
                }
            }
            C20004 c20004 = (C20004) next;
            int iM46014 = c20004 != null ? c20004.m46014() : 0;
            C5817 c5817 = viewOnClickListenerC11499.f36192;
            if (c5817 == null) {
                C15243.m36592("recyclerView");
                throw null;
            }
            int iM16964 = c5817.m16964() - 1;
            if (5 >= iM16964) {
                iM16964 = 5;
            }
            if (num == null) {
                num = Integer.valueOf(iM46014);
                if (iM46014 < iM16964) {
                    num = 0;
                }
            } else if (iM46014 < num.intValue() || num.intValue() + iM16964 <= iM46014) {
                num = Integer.valueOf(iM46014);
                if (iM46014 < iM16964) {
                    num = 0;
                }
            }
        } else if (num == null) {
            num = 0;
        }
        m22357(num.intValue());
        if (str != null) {
            this.f27227 = str;
            this.f27232 = System.currentTimeMillis();
        }
    }
}
