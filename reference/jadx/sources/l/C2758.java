package l;

import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۖ᩶۬, reason: contains not printable characters */
/* JADX INFO: compiled from: O8UQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C2758 extends C2427 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C12763 f10572;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ArrayList f10573;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final float[] f10570 = {0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final String[] f10571 = {"x0.5", "x0.75", "x1.0", "x1.25", "x1.5", "x2.0"};

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final int[] f10569 = {15, 30, 45, 60, 90};

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static int m8414(int i) {
        if (i == 0) {
            return R.string.MT_Protector;
        }
        if (i == 1) {
            return R.string.MT_Protector;
        }
        if (i != 2) {
            return i != 3 ? R.string.MT_Protector : R.string.MT_Protector;
        }
        return R.string.MT_Protector;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8408(C2758 c2758, TextView textView, MenuItem menuItem) {
        c2758.getClass();
        int order = menuItem.getOrder();
        if (order < 0 || order >= 6) {
            throw new IllegalArgumentException();
        }
        ApplicationC0716.f2992.edit().mo4065(order, "mps").apply();
        textView.setText(f10571[order]);
        c2758.f10572.f42565.mo20299(f10570[order]);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8409(C2758 c2758, TextView textView, C16041 c16041, C16195[] c16195Arr, View view) {
        c2758.getClass();
        if (view.isAttachedToWindow()) {
            C16195 c16195 = new C16195(view.getContext(), view, 0);
            C12418 c12418M38298 = c16195.m38298();
            String[] strArr = f10571;
            c12418M38298.add(0, R.id.text0, 0, strArr[0]);
            c12418M38298.add(0, R.id.text1, 1, strArr[1]);
            c12418M38298.add(0, R.id.text2, 2, strArr[2]);
            c12418M38298.add(0, R.id.text3, 3, strArr[3]);
            c12418M38298.add(0, R.id.text4, 4, strArr[4]);
            c12418M38298.add(0, R.id.MT_Protector, 5, strArr[5]);
            c16195.m38296(new C23802(c2758, textView));
            c16195.m38295((InterfaceC7728) c16041);
            c16195Arr[0] = c16195;
            c16195.m38297();
        }
    }

    public C2758(C12763 c12763, List list, int i) {
        super(i, list);
        this.f10573 = new ArrayList();
        this.f10572 = c12763;
    }

    @Override // l.C2427
    /* JADX INFO: renamed from: ۜ */
    public final boolean mo7409() {
        return m8420() == 2;
    }

    @Override // l.C2427
    /* JADX INFO: renamed from: ܰ */
    public final void mo7412(int i, int i2) {
        if (i != i2) {
            C12763 c12763 = this.f10572;
            if (c12763 != null) {
                c12763.f42575 = -1;
                c12763.f42571 = false;
                c12763.f42569 = null;
            }
            Iterator it = this.f10573.iterator();
            while (it.hasNext()) {
                ((InterfaceC14049) it.next()).mo33995(i, i2);
            }
            if (c12763 == null || !c12763.f42564) {
                return;
            }
            C7118.m19006(c12763.f42573, i2);
        }
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static int m8420() {
        int i = ApplicationC0716.f2992.getInt("mpm", 0);
        if (i < 0 || i > 3) {
            return 0;
        }
        return i;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static int m8418() {
        int i = ApplicationC0716.f2992.getInt("mps", 2);
        if (i < 0 || i >= 6) {
            return 2;
        }
        return i;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static int m8419() {
        int iM8420 = m8420() + 1;
        if (iM8420 > 3) {
            iM8420 = 0;
        }
        ApplicationC0716.f2992.edit().mo4065(iM8420, "mpm").apply();
        C3589.f13212.mo23642(Integer.valueOf(iM8420));
        return iM8420;
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [l.ܿܺ۬] */
    /* JADX WARN: Type inference failed for: r4v1, types: [l.ۛܺ۬] */
    /* JADX WARN: Type inference failed for: r5v0, types: [l.ܽܺ۬] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final View m8421(final AbstractActivityC12483 abstractActivityC12483) {
        final C4875 c4875 = new C4875();
        View viewM30995 = abstractActivityC12483.m30995(R.layout.MT_Protector);
        final C16195[] c16195Arr = new C16195[1];
        final C16041 c16041 = new C16041(c16195Arr);
        C12562 c12562 = (C12562) viewM30995.findViewById(R.id.MT_Protector);
        c12562.setChecked(ApplicationC0716.f2992.getBoolean("mbp", false));
        c12562.setOnCheckedChangeListener(new C20274(0));
        final TextView textView = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        textView.setText(f10571[m8418()]);
        viewM30995.findViewById(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.֡ܺ۬
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C2758.m8409(this.f2207, textView, c16041, c16195Arr, view);
            }
        });
        final TextView textView2 = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        final RunnableC14630 runnableC14630 = new RunnableC14630(abstractActivityC12483, textView2);
        ?? r5 = new InterfaceC5707() { // from class: l.ܽܺ۬
            @Override // l.InterfaceC5707
            /* JADX INFO: renamed from: ۙ */
            public final void mo15742() {
                C2758.m8411(abstractActivityC12483, textView2, runnableC14630);
            }
        };
        m8417(abstractActivityC12483, textView2);
        viewM30995.findViewById(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.۫ܺ۬
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C2758.m8412(abstractActivityC12483, c4875, c16041, c16195Arr, view);
            }
        });
        final C21423 c21423 = (C21423) viewM30995.findViewById(R.id.MT_Protector);
        AbstractC1825 itemAnimator = c21423.getItemAnimator();
        itemAnimator.m5954(0L);
        itemAnimator.m5961(0L);
        itemAnimator.m5952(0L);
        itemAnimator.m5964(0L);
        final C3339 c3339 = new C3339(this);
        c21423.setAdapter(c3339);
        viewM30995.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1928(this, new InterfaceC14049() { // from class: l.ܿܺ۬
            @Override // l.InterfaceC14049
            /* JADX INFO: renamed from: ۙ */
            public final void mo33995(int i, int i2) {
                C3339 c33310 = c3339;
                c33310.notifyItemChanged(i);
                c33310.notifyItemChanged(i2);
                C21423 c21424 = c21423;
                if (c21424.m47987() || c21424.m47985()) {
                    return;
                }
                c21424.smoothScrollToPosition(i2);
            }
        }, C3589.f13219, new InterfaceC10597() { // from class: l.ۛܺ۬
            @Override // l.InterfaceC10597
            /* JADX INFO: renamed from: ۙ */
            public final void mo1473(Object obj) {
                c3339.notifyItemChanged(this.f21017.mo7403());
            }
        }, r5, runnableC14630, c16195Arr, c4875));
        c21423.scrollToPosition(mo7403());
        return viewM30995;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m8411(AbstractActivityC12483 abstractActivityC12483, TextView textView, Runnable runnable) {
        m8417(abstractActivityC12483, textView);
        m8416(runnable);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8412(final AbstractActivityC12483 abstractActivityC12483, final C4875 c4875, C16041 c16041, C16195[] c16195Arr, View view) {
        if (view.isAttachedToWindow()) {
            C16195 c16195 = new C16195(view.getContext(), view, 0);
            C12418 c12418M38298 = c16195.m38298();
            c12418M38298.add(0, 1, 0, R.string.MT_Protector);
            int i = 0;
            while (i < 5) {
                int i2 = f10569[i];
                int i3 = i + 100;
                i++;
                c12418M38298.add(0, i3, i, abstractActivityC12483.getString(R.string.MT_Protector, Integer.valueOf(i2)));
            }
            c12418M38298.add(0, 200, 6, R.string.MT_Protector);
            c16195.m38296(new InterfaceC21133() { // from class: l.ۧܺ۬
                @Override // l.InterfaceC21133
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    return C2758.m8413(abstractActivityC12483, c4875, menuItem);
                }
            });
            c16195.m38295((InterfaceC7728) c16041);
            c16195Arr[0] = c16195;
            c16195.m38297();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m8413(AbstractActivityC12483 abstractActivityC12483, C4875 c4875, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            C15586.m37239();
            return true;
        }
        if (itemId != 200) {
            int i = itemId - 100;
            if (i < 0 || i >= 5) {
                return false;
            }
            C15586.m37240(f10569[i]);
            return true;
        }
        C9691 c9691 = new C9691(abstractActivityC12483, c4875);
        c9691.m40376(R.string.MT_Protector);
        c9691.m40350(2);
        c9691.m40336(6);
        c9691.m40367(abstractActivityC12483.getString(R.string.MT_Protector));
        int iM37242 = C15586.m37242();
        if (iM37242 > 0) {
            c9691.m40346((CharSequence) String.valueOf(iM37242));
            c9691.m40355();
        }
        c4875.f17149 = c9691;
        c9691.m40368(true);
        return true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m8417(AbstractActivityC12483 abstractActivityC12483, TextView textView) {
        int iM37242 = C15586.m37242();
        if (iM37242 > 0) {
            textView.setText(abstractActivityC12483.getString(R.string.MT_Protector, Integer.valueOf(iM37242)));
        } else {
            textView.setText(R.string.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m8416(Runnable runnable) {
        C16737.m39278().removeCallbacks(runnable);
        long jM37243 = C15586.m37243();
        if (jM37243 <= 0) {
            return;
        }
        long j = jM37243 % 60000;
        C16737.m39278().postDelayed(runnable, j != 0 ? j : 60000L);
    }
}
