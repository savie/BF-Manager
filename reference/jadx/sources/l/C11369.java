package l;

import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۧۙ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: O8UQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C11369 extends C0823 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C23807 f35784;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f35785;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final float[] f35782 = {0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final String[] f35783 = {"x0.5", "x0.75", "x1.0", "x1.25", "x1.5", "x2.0"};

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final int[] f35781 = {15, 30, 45, 60, 90};

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static int m28684(int i) {
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
    public static void m28676(C11369 c11369, TextView textView, MenuItem menuItem) {
        c11369.getClass();
        int order = menuItem.getOrder();
        if (order < 0 || order >= 6) {
            throw new IllegalArgumentException();
        }
        ApplicationC17729.f58258.edit().mo3486(order, "mps").apply();
        textView.setText(f35783[order]);
        c11369.f35784.f77115.mo2978(f35782[order]);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28677(C11369 c11369, TextView textView, C10142 c10142, C18452[] c18452Arr, View view) {
        c11369.getClass();
        if (view.isAttachedToWindow()) {
            C18452 c18452 = new C18452(view.getContext(), view, 0);
            C9898 c9898M42995 = c18452.m42995();
            String[] strArr = f35783;
            c9898M42995.add(0, R.id.text0, 0, strArr[0]);
            c9898M42995.add(0, R.id.text1, 1, strArr[1]);
            c9898M42995.add(0, R.id.text2, 2, strArr[2]);
            c9898M42995.add(0, R.id.text3, 3, strArr[3]);
            c9898M42995.add(0, R.id.text4, 4, strArr[4]);
            c9898M42995.add(0, R.id.MT_Protector, 5, strArr[5]);
            c18452.m42994(new C21812(c11369, textView));
            c18452.m42993(c10142);
            c18452Arr[0] = c18452;
            c18452.mo21878();
        }
    }

    public C11369(C23807 c23807, List list, int i) {
        super(i, list);
        this.f35785 = new ArrayList();
        this.f35784 = c23807;
    }

    @Override // l.C0823
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo3300() {
        return m28688() == 2;
    }

    @Override // l.C0823
    /* JADX INFO: renamed from: ᩷ */
    public final void mo3304(int i, int i2) {
        if (i != i2) {
            C23807 c23807 = this.f35784;
            if (c23807 != null) {
                c23807.f77127 = -1;
                c23807.f77125 = false;
                c23807.f77118 = null;
            }
            Iterator it = this.f35785.iterator();
            while (it.hasNext()) {
                ((InterfaceC5404) it.next()).mo16082(i, i2);
            }
            if (c23807 == null || !c23807.f77126) {
                return;
            }
            C19331.m44717(c23807.f77123, i2);
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static int m28688() {
        int i = ApplicationC17729.f58258.getInt("mpm", 0);
        if (i < 0 || i > 3) {
            return 0;
        }
        return i;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static int m28682() {
        int i = ApplicationC17729.f58258.getInt("mps", 2);
        if (i < 0 || i >= 6) {
            return 2;
        }
        return i;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m28683() {
        int iM28688 = m28688() + 1;
        if (iM28688 > 3) {
            iM28688 = 0;
        }
        ApplicationC17729.f58258.edit().mo3486(iM28688, "mpm").apply();
        C3669.f12626.mo40353(Integer.valueOf(iM28688));
        return iM28688;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l.ۢ۬ۚ] */
    /* JADX WARN: Type inference failed for: r2v8, types: [l.ۜ۬ۚ] */
    /* JADX WARN: Type inference failed for: r4v1, types: [l.۬۬ۚ] */
    /* JADX WARN: Type inference failed for: r5v0, types: [l.ۖ۬ۚ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final View m28689(final AbstractActivityC17204 abstractActivityC17204) {
        final C12861 c12861 = new C12861();
        View viewM40395 = abstractActivityC17204.m40395(R.layout.MT_Protector);
        final C18452[] c18452Arr = new C18452[1];
        final ?? r0 = new InterfaceC14722() { // from class: l.ۢ۬ۚ
            @Override // l.InterfaceC14722
            /* JADX INFO: renamed from: ۙ */
            public final void mo18051(C18452 c18452) {
                C18452[] c18452Arr2 = c18452Arr;
                if (c18452Arr2[0] == c18452) {
                    c18452Arr2[0] = null;
                }
            }
        };
        C1255 c1255 = (C1255) viewM40395.findViewById(R.id.MT_Protector);
        c1255.setChecked(ApplicationC17729.f58258.getBoolean("mbp", false));
        c1255.setOnCheckedChangeListener(new C1194());
        final TextView textView = (TextView) viewM40395.findViewById(R.id.MT_Protector);
        textView.setText(f35783[m28682()]);
        viewM40395.findViewById(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.ۡ۬ۚ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C11369.m28677(this.f30499, textView, r0, c18452Arr, view);
            }
        });
        final TextView textView2 = (TextView) viewM40395.findViewById(R.id.MT_Protector);
        final RunnableC10623 runnableC10623 = new RunnableC10623(abstractActivityC17204, textView2);
        ?? r5 = new InterfaceC4832() { // from class: l.ۖ۬ۚ
            @Override // l.InterfaceC4832
            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public final void mo8856() {
                C11369.m28679(abstractActivityC17204, textView2, runnableC10623);
            }
        };
        m28687(abstractActivityC17204, textView2);
        viewM40395.findViewById(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.۠۬ۚ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C11369.m28680(abstractActivityC17204, c12861, r0, c18452Arr, view);
            }
        });
        final C5817 c5817 = (C5817) viewM40395.findViewById(R.id.MT_Protector);
        AbstractC3269 itemAnimator = c5817.getItemAnimator();
        itemAnimator.m10754(0L);
        itemAnimator.m10761(0L);
        itemAnimator.m10769(0L);
        itemAnimator.m10766(0L);
        final C15098 c15098 = new C15098(this);
        c5817.setAdapter(c15098);
        viewM40395.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC22558(this, new InterfaceC5404() { // from class: l.ۜ۬ۚ
            @Override // l.InterfaceC5404
            /* JADX INFO: renamed from: ۙ */
            public final void mo16082(int i, int i2) {
                C15098 c15099 = c15098;
                c15099.notifyItemChanged(i);
                c15099.notifyItemChanged(i2);
                C5817 c5818 = c5817;
                if (c5818.m16968() || c5818.m16971()) {
                    return;
                }
                c5818.smoothScrollToPosition(i2);
            }
        }, C3669.f12621, new InterfaceC16438() { // from class: l.۬۬ۚ
            @Override // l.InterfaceC16438
            /* JADX INFO: renamed from: ۙ */
            public final void mo1486(Object obj) {
                c15098.notifyItemChanged(this.f44000.mo3299());
            }
        }, r5, runnableC10623, c18452Arr, c12861));
        c5817.scrollToPosition(mo3299());
        return viewM40395;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m28679(AbstractActivityC17204 abstractActivityC17204, TextView textView, Runnable runnable) {
        m28687(abstractActivityC17204, textView);
        m28686(runnable);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28680(AbstractActivityC17204 abstractActivityC17204, C12861 c12861, C10142 c10142, C18452[] c18452Arr, View view) {
        if (view.isAttachedToWindow()) {
            C18452 c18452 = new C18452(view.getContext(), view, 0);
            C9898 c9898M42995 = c18452.m42995();
            c9898M42995.add(0, 1, 0, R.string.MT_Protector);
            int i = 0;
            while (i < 5) {
                int i2 = f35781[i];
                int i3 = i + 100;
                i++;
                c9898M42995.add(0, i3, i, abstractActivityC17204.getString(R.string.MT_Protector, Integer.valueOf(i2)));
            }
            c9898M42995.add(0, 200, 6, R.string.MT_Protector);
            c18452.m42994(new C4658(abstractActivityC17204, c12861));
            c18452.m42993(c10142);
            c18452Arr[0] = c18452;
            c18452.mo21878();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m28681(AbstractActivityC17204 abstractActivityC17204, C12861 c12861, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            C1432.m5166();
            return true;
        }
        if (itemId != 200) {
            int i = itemId - 100;
            if (i < 0 || i >= 5) {
                return false;
            }
            C1432.m5167(f35781[i]);
            return true;
        }
        C19574 c19574 = new C19574(abstractActivityC17204, c12861);
        c19574.m22945(R.string.MT_Protector);
        c19574.m22948(2);
        c19574.m22957(6);
        c19574.m22933(abstractActivityC17204.getString(R.string.MT_Protector));
        int iM5169 = C1432.m5169();
        if (iM5169 > 0) {
            c19574.m22924((CharSequence) String.valueOf(iM5169));
            c19574.m22959();
        }
        c12861.f41170 = c19574;
        c19574.m22955(true);
        return true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m28687(AbstractActivityC17204 abstractActivityC17204, TextView textView) {
        int iM5169 = C1432.m5169();
        if (iM5169 > 0) {
            textView.setText(abstractActivityC17204.getString(R.string.MT_Protector, Integer.valueOf(iM5169)));
        } else {
            textView.setText(R.string.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m28686(Runnable runnable) {
        C21576.m49077().removeCallbacks(runnable);
        long jM5170 = C1432.m5170();
        if (jM5170 <= 0) {
            return;
        }
        long j = jM5170 % 60000;
        C21576.m49077().postDelayed(runnable, j != 0 ? j : 60000L);
    }
}
