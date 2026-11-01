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

/* JADX INFO: renamed from: l.ۖ᩵ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AY4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2728 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC8374 f10499;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f10501;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public volatile boolean f10502;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f10504;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f10505;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f10503 = new AtomicInteger(0);

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Object f10500 = new Object();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8336(String str) {
        C13465.m32966(str, "name");
        ViewOnClickListenerC8374 viewOnClickListenerC8374 = this.f10499;
        Iterator it = viewOnClickListenerC8374.f29058.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else if (C13465.m32965((Object) ((InterfaceC2557) it.next()).getName(), (Object) str)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1) {
            return;
        }
        ((InterfaceC2557) viewOnClickListenerC8374.f29058.get(i2)).mo7977(true);
        C5926 c5926 = viewOnClickListenerC8374.f29052;
        if (c5926 == null) {
            C13465.m32968("adapter");
            throw null;
        }
        c5926.notifyItemChanged(i2);
        int iM8333 = m8333();
        C21423 c21423 = viewOnClickListenerC8374.f29073;
        if (c21423 == null) {
            C13465.m32968("recyclerView");
            throw null;
        }
        int iM47988 = c21423.m47988() - 1;
        if (5 >= iM47988) {
            iM47988 = 5;
        }
        if (i2 >= iM8333 && iM8333 + iM47988 > i2) {
            i = iM8333;
        } else if (i2 >= iM47988) {
            i = i2;
        }
        m8334(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8338(ViewOnClickListenerC10866 viewOnClickListenerC10866) {
        C13465.m32966(viewOnClickListenerC10866, "holder");
        if (System.currentTimeMillis() - this.f10505 < 300) {
            viewOnClickListenerC10866.itemView.setAlpha(0.0f);
            C5563.m15349(viewOnClickListenerC10866.itemView, 0.0f, 1.0f).m35318();
        }
        String str = this.f10501;
        if (str != null && System.currentTimeMillis() - this.f10504 > 800) {
            str = null;
        }
        if (str != null) {
            if (str.equals(viewOnClickListenerC10866.m27224().getName())) {
                TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{new ColorDrawable(C20368.f66007 & C20368.m45983(553648127, 620756991)), new ColorDrawable(0)});
                transitionDrawable.setCrossFadeEnabled(true);
                viewOnClickListenerC10866.m27221().setBackground(transitionDrawable);
                transitionDrawable.startTransition(EnumC12167.f40710);
                this.f10501 = null;
                return;
            }
            if (viewOnClickListenerC10866.m27221().getBackground() != null) {
                viewOnClickListenerC10866.m27221().setBackground(null);
            }
        }
    }

    public C2728(ViewOnClickListenerC8374 viewOnClickListenerC8374) {
        this.f10499 = viewOnClickListenerC8374;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m8333() {
        C21423 c21423 = this.f10499.f29073;
        if (c21423 != null) {
            return c21423.m47986();
        }
        C13465.m32968("recyclerView");
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8334(int i) {
        C21423 c21423 = this.f10499.f29073;
        if (c21423 != null) {
            c21423.m47991(i);
        } else {
            C13465.m32968("recyclerView");
            throw null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8332(ViewOnClickListenerC8374 viewOnClickListenerC8374, final C2728 c2728) {
        AbstractC3062 lifecycle = viewOnClickListenerC8374.getLifecycle();
        C13465.m32967(lifecycle, "<get-lifecycle>(...)");
        C3971 c3971 = C3971.f14739;
        while (lifecycle.mo9170() != EnumC9414.DESTROYED) {
            try {
                C21423 c21423 = viewOnClickListenerC8374.f29073;
                if (c21423 == null) {
                    C13465.m32968("recyclerView");
                    throw null;
                }
                if (!c21423.m47987() && !c2728.f10502 && lifecycle.mo9170().m24173(EnumC9414.STARTED)) {
                    C21423 c21424 = viewOnClickListenerC8374.f29073;
                    if (c21424 != null) {
                        int iM47986 = c21424.m47986();
                        List list = viewOnClickListenerC8374.f29058;
                        int i = c2728.f10503.get();
                        if (iM47986 < 0 || iM47986 >= list.size()) {
                            SystemClock.sleep(50L);
                        } else {
                            int size = list.size();
                            int i2 = iM47986;
                            while (true) {
                                if (i2 >= size) {
                                    int i3 = 0;
                                    while (true) {
                                        if (i3 < iM47986) {
                                            C21423 c21425 = viewOnClickListenerC8374.f29073;
                                            if (c21425 == null) {
                                                C13465.m32968("recyclerView");
                                                throw null;
                                            }
                                            if (c21425.m47987() || c2728.f10502 || i != c2728.f10503.get()) {
                                                break;
                                                break;
                                                break;
                                            }
                                            C21423 c21426 = viewOnClickListenerC8374.f29073;
                                            if (c21426 == null) {
                                                C13465.m32968("recyclerView");
                                                throw null;
                                            }
                                            if (iM47986 != c21426.m47986()) {
                                                break;
                                            }
                                            InterfaceC2557 interfaceC2557 = (InterfaceC2557) list.get(i3);
                                            int iMo7988 = interfaceC2557.mo7988();
                                            if (iMo7988 != 0) {
                                                C14600 c14600Mo7925 = c3971.mo7925((AbstractC11462) null, interfaceC2557, iMo7988);
                                                C13465.m32967(c14600Mo7925, "loadDataIcon(...)");
                                                interfaceC2557.mo7966(c14600Mo7925);
                                                C21423 c21427 = viewOnClickListenerC8374.f29073;
                                                if (c21427 == null) {
                                                    C13465.m32968("recyclerView");
                                                    throw null;
                                                }
                                                c21427.post(new RunnableC1713(c2728, interfaceC2557, 1));
                                            }
                                            if (lifecycle.mo9170() == EnumC9414.DESTROYED) {
                                                return;
                                            } else {
                                                i3++;
                                            }
                                        } else {
                                            while (i == c2728.f10503.get()) {
                                                synchronized (c2728.f10500) {
                                                    c2728.f10500.wait(1000L);
                                                    C7321 c7321 = C7321.f24318;
                                                }
                                                if (lifecycle.mo9170() == EnumC9414.DESTROYED) {
                                                    return;
                                                }
                                            }
                                            break;
                                        }
                                    }
                                } else {
                                    C21423 c21428 = viewOnClickListenerC8374.f29073;
                                    if (c21428 == null) {
                                        C13465.m32968("recyclerView");
                                        throw null;
                                    }
                                    if (c21428.m47987() || c2728.f10502 || i != c2728.f10503.get()) {
                                        break;
                                        break;
                                        break;
                                    }
                                    C21423 c21429 = viewOnClickListenerC8374.f29073;
                                    if (c21429 == null) {
                                        C13465.m32968("recyclerView");
                                        throw null;
                                    }
                                    if (iM47986 != c21429.m47986()) {
                                        break;
                                    }
                                    final InterfaceC2557 interfaceC2558 = (InterfaceC2557) list.get(i2);
                                    int iMo7989 = interfaceC2558.mo7988();
                                    if (iMo7989 != 0) {
                                        C14600 c14600Mo7926 = c3971.mo7925((AbstractC11462) null, interfaceC2558, iMo7989);
                                        C13465.m32967(c14600Mo7926, "loadDataIcon(...)");
                                        interfaceC2558.mo7966(c14600Mo7926);
                                        C21423 c214210 = viewOnClickListenerC8374.f29073;
                                        if (c214210 == null) {
                                            C13465.m32968("recyclerView");
                                            throw null;
                                        }
                                        c214210.post(new Runnable() { // from class: l.ۨ᩵ۘ
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                this.f39932.m8337(interfaceC2558);
                                            }
                                        });
                                    }
                                    if (lifecycle.mo9170() == EnumC9414.DESTROYED) {
                                        return;
                                    } else {
                                        i2++;
                                    }
                                }
                            }
                        }
                    } else {
                        C13465.m32968("recyclerView");
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
    public final void m8337(InterfaceC2557 interfaceC2557) {
        ViewOnClickListenerC8374 viewOnClickListenerC8374 = this.f10499;
        C21423 c21423 = viewOnClickListenerC8374.f29073;
        if (c21423 == null) {
            C13465.m32968("recyclerView");
            throw null;
        }
        int childCount = c21423.getChildCount();
        for (int i = 0; i < childCount; i++) {
            C21423 c21424 = viewOnClickListenerC8374.f29073;
            if (c21424 == null) {
                C13465.m32968("recyclerView");
                throw null;
            }
            View childAt = c21424.getChildAt(i);
            if (childAt != null) {
                C21423 c21425 = viewOnClickListenerC8374.f29073;
                if (c21425 == null) {
                    C13465.m32968("recyclerView");
                    throw null;
                }
                AbstractC12554 childViewHolder = c21425.getChildViewHolder(childAt);
                C13465.m32963((Object) childViewHolder, "null cannot be cast to non-null type bin.mt.plus.FilePickerActivity.FileListHolder");
                ViewOnClickListenerC10866 viewOnClickListenerC10866 = (ViewOnClickListenerC10866) childViewHolder;
                C14600 icon = interfaceC2557.getIcon();
                if (viewOnClickListenerC10866.m27224() == interfaceC2557 && icon != null) {
                    ImageView imageViewM27223 = viewOnClickListenerC10866.m27223();
                    Drawable drawable = imageViewM27223.getDrawable();
                    if (drawable == null) {
                        drawable = new ColorDrawable(0);
                    }
                    TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable, icon.m35074()});
                    transitionDrawable.setCrossFadeEnabled(true);
                    imageViewM27223.setImageDrawable(transitionDrawable);
                    transitionDrawable.startTransition(300);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8339(boolean z) {
        this.f10502 = true;
        this.f10503.incrementAndGet();
        C3971 c3971 = C3971.f14739;
        for (InterfaceC2557 interfaceC2557 : this.f10499.f29058) {
            if (interfaceC2557.getIcon() == null) {
                interfaceC2557.mo7964(c3971.mo7924(interfaceC2557));
                int iMo7926 = c3971.mo7926(interfaceC2557);
                if (iMo7926 != 0) {
                    interfaceC2557.mo7975(iMo7926);
                }
            }
        }
        if (z) {
            this.f10505 = System.currentTimeMillis();
        }
        C5926 c5926 = this.f10499.f29052;
        if (c5926 == null) {
            C13465.m32968("adapter");
            throw null;
        }
        c5926.notifyDataSetChanged();
        this.f10502 = false;
        synchronized (this.f10500) {
            this.f10500.notifyAll();
            C7321 c7321 = C7321.f24318;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0087  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8335(Integer num, String str) {
        Object next;
        if (str != null) {
            ViewOnClickListenerC8374 viewOnClickListenerC8374 = this.f10499;
            List list = viewOnClickListenerC8374.f29058;
            C13465.m32966(list, "<this>");
            Iterator it = new C19004(new C13360(list)).iterator();
            while (true) {
                C8421 c8421 = (C8421) it;
                if (!c8421.hasNext()) {
                    next = null;
                    break;
                }
                next = c8421.next();
                InterfaceC2557 interfaceC2557 = (InterfaceC2557) ((C18298) next).m42507();
                if (interfaceC2557.isDirectory() && C13465.m32965((Object) interfaceC2557.getName(), (Object) str)) {
                    break;
                }
            }
            C18298 c18298 = (C18298) next;
            int iM42508 = c18298 != null ? c18298.m42508() : 0;
            C21423 c21423 = viewOnClickListenerC8374.f29073;
            if (c21423 == null) {
                C13465.m32968("recyclerView");
                throw null;
            }
            int iM47988 = c21423.m47988() - 1;
            if (5 >= iM47988) {
                iM47988 = 5;
            }
            if (num == null) {
                num = Integer.valueOf(iM42508);
                if (iM42508 < iM47988) {
                    num = 0;
                }
            } else if (iM42508 < num.intValue() || num.intValue() + iM47988 <= iM42508) {
                num = Integer.valueOf(iM42508);
                if (iM42508 < iM47988) {
                    num = 0;
                }
            }
        } else if (num == null) {
            num = 0;
        }
        m8334(num.intValue());
        if (str != null) {
            this.f10501 = str;
            this.f10504 = System.currentTimeMillis();
        }
    }
}
