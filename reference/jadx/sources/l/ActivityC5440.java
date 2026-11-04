package l;

import android.animation.ObjectAnimator;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۚۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AWI */
/* JADX INFO: loaded from: classes.dex */
public class ActivityC5440 extends AbstractActivityC17204 {

    /* JADX INFO: renamed from: ۖᩴۜ, reason: not valid java name and contains not printable characters */
    private static final short[] f18992;

    /* JADX INFO: renamed from: ۛ᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f18993 = 0;

    /* JADX INFO: renamed from: ֫᩷, reason: not valid java name and contains not printable characters */
    public View f18994;

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public View f18996;

    /* JADX INFO: renamed from: ۧ᩷, reason: not valid java name and contains not printable characters */
    public View f18997;

    /* JADX INFO: renamed from: ۨ᩷, reason: not valid java name and contains not printable characters */
    public C14019 f18998;

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public C23940 f18999;

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public View f19000;

    /* JADX INFO: renamed from: ܺ᩷, reason: not valid java name and contains not printable characters */
    public C19610 f19002;

    /* JADX INFO: renamed from: ᩵᩷, reason: not valid java name and contains not printable characters */
    public TabLayout f19005;

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public boolean f19006;

    /* JADX INFO: renamed from: ᩹᩷, reason: not valid java name and contains not printable characters */
    public View f19007;

    /* JADX INFO: renamed from: ᩻᩷, reason: not valid java name and contains not printable characters */
    public View f19008;

    /* JADX INFO: renamed from: ܽ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f19003 = new ArrayList();

    /* JADX INFO: renamed from: ܶ᩷, reason: not valid java name and contains not printable characters */
    public final C17930 f19001 = new C17930(0);

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public final C17930 f19004 = new C17930(Boolean.FALSE);

    /* JADX INFO: renamed from: ۗ᩷, reason: not valid java name and contains not printable characters */
    public final ViewOnLongClickListenerC16098 f18995 = new View.OnLongClickListener() { // from class: l.ܶ۫ᩴ
        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            return ActivityC5440.m16249(this.f52148, view);
        }
    };

    static {
        ApplicationC23172.m52091(61);
        f18992 = new short[]{8776, -12015, -1331, -1121, -12942, 12848, 10333, 13177, 12797, -10750, 12452, 9237, 15589, 15309, 16242, -13588, 10907, -2051, -3459, -13653, -12117, -15045, -1434, 14212, -12678, 13444, 8436, -1596, -11143, -9220, -6530, -22164, -22159, -22151, -22170, -22149, -22147, -22147, -22161, -22163, -22151, -22173, -22150, -22170, -22169, -13992, -10405, 14191};
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private native void m16236(MenuItem menuItem);

    @Override // l.AbstractActivityC17204
    /* JADX INFO: renamed from: ᩶ */
    public final String mo122() {
        return "TextFunctionBarEditActivity";
    }

    @Override // l.AbstractActivityC17204, l.ActivityC7405, l.ActivityC3409, l.ActivityC5577, l.ActivityC8866, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m40418(R.layout.MT_Protector);
        m40418(R.string.MT_Protector);
        C16390 c16390 = (C16390) m40418(R.id.MT_Protector);
        this.f56046 = c16390;
        m40407(c16390);
        m40393();
        int i = 1;
        this.f56046.setNavigationOnClickListener(new ViewOnClickListenerC16990(this, i));
        this.f19002 = new C19610(this);
        m16260();
        this.f19000 = m40418(R.id.done);
        this.f19008 = m40418(R.id.menuScrollView);
        this.f19007 = m40418(R.id.MT_Protector);
        this.f18996 = m40418(R.id.MT_Protector);
        this.f18997 = m40418(R.id.MT_Protector);
        this.f18994 = m40418(R.id.MT_Protector);
        this.f19000.setOnClickListener(new ViewOnClickListenerC21993(i, this));
        this.f19005 = (TabLayout) m40418(R.id.tabLayout);
        C14019 c14019 = (C14019) m40418(R.id.MT_Protector);
        this.f18998 = c14019;
        c14019.m36514(new C12897(this));
        this.f19005.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C3420(this));
        this.f19005.setupWithViewPager(this.f18998);
        TabLayout tabLayout = this.f19005;
        tabLayout.setTabIconTint(tabLayout.getTabTextColors());
        this.f18998.m36527(getIntent().getIntExtra("pageIndex", 0));
        final C17299 c17299 = new C17299(2, this);
        this.f18999 = new C23940(C12296.m30693(this, new InterfaceC16025() { // from class: l.ۗ֨֫
            @Override // l.InterfaceC16025
            /* JADX INFO: renamed from: ۙ */
            public final void mo8384(Intent intent, int i2) {
                String stringExtra;
                if (i2 == 0 || i2 != -1 || intent == null || (stringExtra = intent.getStringExtra(MotionUtils.EASING_TYPE_PATH)) == null) {
                    return;
                }
                Bundle bundleExtra = intent.getBundleExtra("extra");
                C15243.m36586(bundleExtra);
                c17299.mo16590(bundleExtra, stringExtra);
            }
        }));
        C7068 onBackPressedDispatcher = getOnBackPressedDispatcher();
        C20574 c20574 = new C20574(this);
        onBackPressedDispatcher.getClass();
        onBackPressedDispatcher.m19400(c20574);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m16244(ActivityC5440 activityC5440, AbstractC22044 abstractC22044, int[] iArr) {
        try {
            C24832.m55351(abstractC22044, iArr[0]);
            activityC5440.m16260();
            C22673.m51152(R.string.MT_Protector);
        } catch (Exception e) {
            activityC5440.m40401(e, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // l.ActivityC4348, android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        m16253();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public void m16252(boolean z) {
        if (z) {
            if (this.f18996.isClickable() && this.f18996.getAlpha() == 1.0f) {
                return;
            }
            this.f18996.setClickable(true);
            this.f18997.setClickable(true);
            this.f18994.setClickable(true);
            this.f18996.setAlpha(1.0f);
            this.f18997.setAlpha(1.0f);
            this.f18994.setAlpha(1.0f);
            return;
        }
        if (this.f18996.isClickable() || this.f18996.getAlpha() == 1.0f) {
            this.f18996.setClickable(false);
            this.f18997.setClickable(false);
            this.f18994.setClickable(false);
            this.f18996.setAlpha(0.5f);
            this.f18997.setAlpha(0.5f);
            this.f18994.setAlpha(0.5f);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m16257(final ActivityC5440 activityC5440, int i) {
        C17930 c17930 = activityC5440.f19004;
        activityC5440.f19006 = true;
        c17930.mo40353(Boolean.TRUE);
        final C8640 c8640 = (C8640) activityC5440.f19003.get(activityC5440.f18998.m36517());
        c8640.f28235 = i;
        c8640.f28228 = -2;
        BitSet bitSet = c8640.f28229;
        bitSet.clear();
        if (i != -1) {
            bitSet.set(i);
            c8640.f28234 = 1;
        } else {
            c8640.f28234 = 0;
        }
        c8640.f28227.notifyDataSetChanged();
        activityC5440.f18998.m34140(false);
        C24674 c24674 = new C24674(activityC5440.f19008, activityC5440.f19000, activityC5440.f19007);
        C24674 c24675 = new C24674(activityC5440.f19005);
        c24674.setAlpha(0.0f);
        c24674.m55018(0);
        c24675.f79847 = true;
        ObjectAnimator.ofFloat(c24674, "alpha", 0.0f, 1.0f).setDuration(200L).start();
        ObjectAnimator.ofFloat(c24675, "alpha", 1.0f, 0.0f).setDuration(200L).start();
        activityC5440.m16252(c8640.f28234 > 0);
        activityC5440.f18996.setOnClickListener(new View.OnClickListener() { // from class: l.ܳ۫ᩴ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityC5440.m16242(this.f50107, c8640);
            }
        });
        activityC5440.f18997.setOnClickListener(new View.OnClickListener() { // from class: l.۫۫ᩴ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityC5440.m16258(this.f41908, c8640);
            }
        });
        activityC5440.f18994.setOnClickListener(new View.OnClickListener() { // from class: l.ۚ۫ᩴ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = ActivityC5440.f18993;
                final C8640 c8641 = c8640;
                int i3 = c8641.f28234;
                if (i3 == 0) {
                    return;
                }
                final ActivityC5440 activityC5441 = this.f19541;
                if (i3 != 1) {
                    C2361 c2361BuildDialog = activityC5441.buildDialog();
                    c2361BuildDialog.m8021(R.string.MT_Protector);
                    c2361BuildDialog.m8008(activityC5441.getString(R.string.MT_Protector, Integer.valueOf(c8641.f28234)));
                    c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۧ۫ᩴ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i4) {
                            int i5 = ActivityC5440.f18993;
                            c8641.m23285(true);
                            C24832.m55356();
                            activityC5441.m16263(false);
                        }
                    });
                    c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                    c2361BuildDialog.m8016();
                    return;
                }
                int size = ((ArrayList) c8641.m23286()).size();
                final int i4 = 0;
                while (i4 < size) {
                    if (c8641.f28229.get(i4)) {
                        C16626 c16626 = (C16626) ((ArrayList) c8641.m23286()).get(i4);
                        C2361 c2361BuildDialog2 = activityC5441.buildDialog();
                        c2361BuildDialog2.m8021(R.string.MT_Protector);
                        c2361BuildDialog2.m8008(activityC5441.getString(R.string.MT_Protector, c16626.m39346()));
                        c2361BuildDialog2.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.֫۫ᩴ
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i5) {
                                int i6 = ActivityC5440.f18993;
                                C8640 c8642 = c8641;
                                ArrayList arrayList = (ArrayList) c8642.m23286();
                                int i7 = i4;
                                arrayList.remove(i7);
                                c8642.f28227.notifyItemRemoved(i7);
                                C24832.m55356();
                                activityC5441.m16263(false);
                            }
                        });
                        c2361BuildDialog2.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                        c2361BuildDialog2.m8016();
                    }
                    i4++;
                }
                i4 = -1;
                C16626 c16627 = (C16626) ((ArrayList) c8641.m23286()).get(i4);
                C2361 c2361BuildDialog3 = activityC5441.buildDialog();
                c2361BuildDialog3.m8021(R.string.MT_Protector);
                c2361BuildDialog3.m8008(activityC5441.getString(R.string.MT_Protector, c16627.m39346()));
                c2361BuildDialog3.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.֫۫ᩴ
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i5) {
                        int i6 = ActivityC5440.f18993;
                        C8640 c8642 = c8641;
                        ArrayList arrayList = (ArrayList) c8642.m23286();
                        int i7 = i4;
                        arrayList.remove(i7);
                        c8642.f28227.notifyItemRemoved(i7);
                        C24832.m55356();
                        activityC5441.m16263(false);
                    }
                });
                c2361BuildDialog3.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c2361BuildDialog3.m8016();
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m16242(ActivityC5440 activityC5440, final C8640 c8640) {
        if (c8640.f28234 == 0) {
            return;
        }
        activityC5440.m16235(R.string.MT_Protector, c8640.f28232, new InterfaceC21941() { // from class: l.ܺ۫ᩴ
            @Override // l.InterfaceC21941
            public final Object get() {
                int i = ActivityC5440.f18993;
                return c8640.m23285(false);
            }
        }, new RunnableC3003(1, activityC5440));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m16258(ActivityC5440 activityC5440, final C8640 c8640) {
        if (c8640.f28234 == 0) {
            return;
        }
        activityC5440.m16235(R.string.MT_Protector, c8640.f28232, new InterfaceC21941() { // from class: l.᩻۫ᩴ
            @Override // l.InterfaceC21941
            public final Object get() {
                int i = ActivityC5440.f18993;
                return c8640.m23285(true);
            }
        }, new RunnableC13368(1, activityC5440));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m16263(boolean z) {
        if (this.f19006) {
            this.f19006 = false;
            this.f19004.mo40353(Boolean.FALSE);
            C8640 c8640 = (C8640) this.f19003.get(this.f18998.m36517());
            if (z) {
                c8640.f28227.notifyDataSetChanged();
            }
            this.f18998.m34140(true);
            C24674 c24674 = new C24674(this.f19005);
            C24674 c24675 = new C24674(this.f19008, this.f19000, this.f19007);
            c24674.setAlpha(0.0f);
            c24674.m55018(0);
            c24675.f79845 = true;
            ObjectAnimator.ofFloat(c24674, "alpha", 0.0f, 1.0f).setDuration(200L).start();
            ObjectAnimator.ofFloat(c24675, "alpha", 1.0f, 0.0f).setDuration(200L).start();
            this.f18996.setOnClickListener(null);
            this.f18997.setOnClickListener(null);
            this.f18994.setOnClickListener(null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m16249(final ActivityC5440 activityC5440, View view) {
        final int iIntValue = ((Integer) view.getTag(R.id.tabLayout)).intValue();
        ArrayList arrayList = activityC5440.f19003;
        if (iIntValue == arrayList.size()) {
            return false;
        }
        view.getParent().requestDisallowInterceptTouchEvent(true);
        C18452 c18452 = new C18452(view.getContext(), view, 0);
        c18452.m42997();
        C9898 c9898M42995 = c18452.m42995();
        boolean z = iIntValue > 0;
        boolean z2 = iIntValue < arrayList.size() - 1;
        boolean z3 = arrayList.size() > 1;
        boolean z4 = arrayList.size() > 1;
        c9898M42995.add(0, 1, 0, R.string.MT_Protector).setEnabled(z).setIcon(R.drawable.MT_Protector);
        c9898M42995.add(0, 2, 0, R.string.MT_Protector).setEnabled(z2).setIcon(R.drawable.MT_Protector);
        c9898M42995.add(0, 6, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c9898M42995.add(0, 3, 0, R.string.MT_Protector).setEnabled(z3).setIcon(R.drawable.MT_Protector);
        c9898M42995.add(0, 4, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c9898M42995.add(0, 5, 0, R.string.MT_Protector).setEnabled(z4).setIcon(R.drawable.MT_Protector);
        c18452.m42994(new InterfaceC21436() { // from class: l.ۡܳᩴ
            @Override // l.InterfaceC21436
            public final boolean onMenuItemClick(MenuItem menuItem) {
                ActivityC5440.m16239(this.f30644, iIntValue, menuItem);
                return true;
            }
        });
        c18452.mo21878();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m16239(final ActivityC5440 activityC5440, final int i, MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 1:
                int i2 = i - 1;
                Collections.swap(C24832.m55353(), i, i2);
                C24832.m55356();
                activityC5440.m16260();
                activityC5440.f18998.m36527(i2);
                break;
            case 2:
                int i3 = i + 1;
                Collections.swap(C24832.m55353(), i, i3);
                C24832.m55356();
                activityC5440.m16260();
                activityC5440.f18998.m36527(i3);
                break;
            case 3:
                activityC5440.m16235(R.string.MT_Protector, i, new InterfaceC21941() { // from class: l.᩷۫ᩴ
                    @Override // l.InterfaceC21941
                    public final Object get() {
                        int i4 = ActivityC5440.f18993;
                        return ((C1711) ((ArrayList) C24832.m55353()).get(i)).m6080();
                    }
                }, (Runnable) null);
                break;
            case 4:
                C1711 c1711 = (C1711) ((ArrayList) C24832.m55353()).get(i);
                C12369 c12369 = new C12369(activityC5440, activityC5440, c1711);
                c12369.m22945(R.string.MT_Protector);
                c12369.m22924((CharSequence) c1711.m6082());
                c12369.m22959();
                c12369.m22918();
                c12369.m22955(true);
                break;
            case 5:
                String strM49059 = C21576.m49059(R.string.MT_Protector, ((C1711) ((ArrayList) C24832.m55353()).get(i)).m6082());
                C2361 c2361BuildDialog = activityC5440.buildDialog();
                c2361BuildDialog.m8021(R.string.MT_Protector);
                c2361BuildDialog.m8008(strM49059);
                c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۤ۫ᩴ
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i4) {
                        ActivityC5440.m16238(this.f34424, i);
                    }
                });
                c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c2361BuildDialog.m8016();
                break;
            case 6:
                C6404 c6404 = new C6404(activityC5440, activityC5440, i);
                c6404.m22945(R.string.MT_Protector);
                c6404.m22955(true);
                break;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m16238(ActivityC5440 activityC5440, int i) {
        ((ArrayList) C24832.m55353()).remove(i);
        C24832.m55356();
        int iM36517 = activityC5440.f18998.m36517();
        activityC5440.m16260();
        if (i <= 0 || iM36517 != i) {
            return;
        }
        activityC5440.f18998.m36527(i - 1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m16235(int i, final int i2, final InterfaceC21941 interfaceC21941, final Runnable runnable) {
        CharSequence[] charSequenceArr = (CharSequence[]) C1170.stream(C24832.m55353()).map(new C10210(1)).toArray(new C22812());
        SpannableString spannableString = new SpannableString(charSequenceArr[i2]);
        spannableString.setSpan(new ForegroundColorSpan(C3296.f10754), 0, spannableString.length(), 33);
        charSequenceArr[i2] = spannableString;
        final int[] iArr = {i2};
        C2361 c2361BuildDialog = buildDialog();
        c2361BuildDialog.m8021(i);
        c2361BuildDialog.m8013(charSequenceArr, i2, new DialogInterfaceOnClickListenerC6663(2, iArr));
        c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ᩴ۫ᩴ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                ActivityC5440.m16246(this.f63748, iArr, i2, interfaceC21941, runnable);
            }
        });
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8016();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m16246(ActivityC5440 activityC5440, int[] iArr, int i, InterfaceC21941 interfaceC21941, Runnable runnable) {
        int i2 = iArr[0];
        if (i2 != i) {
            List list = (List) interfaceC21941.get();
            if (!list.isEmpty()) {
                List listM6080 = ((C1711) ((ArrayList) C24832.m55353()).get(i2)).m6080();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((ArrayList) listM6080).add(C16626.m39341(((C16626) it.next()).m39344()));
                }
                ((C8640) activityC5440.f19003.get(i2)).f28227.notifyDataSetChanged();
                C24832.m55356();
            }
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public void m16253() {
        for (int i = 0; i < this.f19005.getTabCount(); i++) {
            TabLayout.Tab tabAt = this.f19005.getTabAt(i);
            if (tabAt != null) {
                TabLayout.TabView tabView = tabAt.view;
                tabView.setTag(R.id.tabLayout, Integer.valueOf(i));
                tabView.setOnLongClickListener(this.f18995);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public void m16260() {
        if (this.f19006) {
            m16263(true);
        }
        int size = ((ArrayList) C24832.m55353()).size();
        ArrayList arrayList = this.f19003;
        if (size == arrayList.size()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C8640) it.next()).f28227.notifyDataSetChanged();
            }
            AbstractC6274 abstractC6274M36524 = this.f18998.m36524();
            C17359.requireNonNull(abstractC6274M36524);
            abstractC6274M36524.m17946();
            return;
        }
        while (size > arrayList.size()) {
            arrayList.add(new C8640(this, arrayList.size()));
        }
        while (size < arrayList.size()) {
            C2764.m9138(arrayList, 1);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((C8640) it2.next()).f28227.notifyDataSetChanged();
        }
        C14019 c14019 = this.f18998;
        if (c14019 != null) {
            int iM36517 = c14019.m36517();
            this.f18998.m36514(new C12897(this));
            if (iM36517 >= 0 && iM36517 < size) {
                this.f18998.m36527(iM36517);
            } else if (iM36517 == size) {
                this.f18998.m36527(iM36517 - 1);
            }
            this.f18998.post(new RunnableC14793(1, this));
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.MT_Protector, menu);
        final MenuItem menuItemFindItem = menu.findItem(R.id.MT_Protector);
        final MenuItem menuItemFindItem2 = menu.findItem(R.id.more);
        this.f19001.m40350(this, new InterfaceC16438() { // from class: l.᩹۫ᩴ
            @Override // l.InterfaceC16438
            /* JADX INFO: renamed from: ۙ */
            public final void mo1486(Object obj) {
                ActivityC5440 activityC5440 = this.f76098;
                menuItemFindItem.setVisible((activityC5440.f19006 || ((Integer) obj).intValue() == activityC5440.f19003.size()) ? false : true);
            }
        });
        this.f19004.m40350(this, new InterfaceC16438() { // from class: l.֨ܳᩴ
            @Override // l.InterfaceC16438
            /* JADX INFO: renamed from: ۙ */
            public final void mo1486(Object obj) {
                ActivityC5440.m16240(this.f4509, menuItemFindItem, menuItemFindItem2, (Boolean) obj);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m16240(ActivityC5440 activityC5440, MenuItem menuItem, MenuItem menuItem2, Boolean bool) {
        menuItem.setVisible((bool.booleanValue() || activityC5440.f19005.getSelectedTabPosition() == activityC5440.f19003.size()) ? false : true);
        menuItem2.setVisible(!bool.booleanValue());
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        m16236(menuItem);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m16247(ActivityC5440 activityC5440, boolean[] zArr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < zArr.length; i++) {
            if (zArr[i]) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("export", true);
        bundle.putIntegerArrayList("indices", arrayList);
        String string = ApplicationC17729.f58258.getString("tfdp", null);
        String strMo4294 = string == null ? C6382.f21566.mo4294() : C11293.m28556(string);
        String strM28558 = string == null ? "TextFunctions.json" : C11293.m28558(string);
        C23940 c23940 = activityC5440.f18999;
        c23940.getClass();
        C23940.m53469(c23940, R.string.MT_Protector, bundle, strMo4294, strM28558, new String[]{"json"}, 32);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m16248(C16626 c16626, int i, boolean z, final InterfaceC0818 interfaceC0818) {
        C23255 c23255;
        View viewM40395 = m40395(R.layout.MT_Protector);
        ((TextView) viewM40395.findViewById(R.id.title)).setText(i);
        final C23255 c23256 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        final Spinner spinner = (Spinner) viewM40395.findViewById(R.id.spinner);
        final C23255 c23257 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        final Button button = (Button) viewM40395.findViewById(R.id.MT_Protector);
        final TextView textView = (TextView) viewM40395.findViewById(R.id.MT_Protector);
        button.setTag(R.id.MT_Protector, textView);
        final Spinner spinner2 = (Spinner) viewM40395.findViewById(R.id.spinner2);
        C23255 c23258 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        final Button button2 = (Button) viewM40395.findViewById(R.id.button2);
        final TextView textView2 = (TextView) viewM40395.findViewById(R.id.MT_Protector);
        button2.setTag(R.id.MT_Protector, textView2);
        RunnableC2739 runnableC2739 = new RunnableC2739(c23257, c23258, viewM40395.findViewById(R.id.MT_Protector));
        c23256.mo52335((CharSequence) c16626.m39346());
        C21917 c21917 = C19147.f61962;
        String[] strArr = new String[c21917.size()];
        C19147 c19147 = c16626.f53761;
        int iM44387 = c19147.m44387();
        int i2 = 0;
        for (int i3 = 0; i3 < c21917.size(); i3++) {
            int i4 = c21917.getInt(i3);
            strArr[i3] = C19147.m44385(i4);
            if (i4 == iM44387) {
                i2 = i3;
            }
        }
        spinner.setAdapter((SpinnerAdapter) new C3054(this, strArr));
        spinner.setSelection(i2);
        C19147.m44384(iM44387).mo2466(c23257, textView, button, c19147);
        C21917 c21918 = C19147.f61963;
        String[] strArr2 = new String[c21918.size() + 1];
        strArr2[0] = C21576.m49088(R.string.MT_Protector);
        C19147 c19148 = c16626.f53759;
        int iM44388 = c19148 == null ? -1 : c19148.m44387();
        int i5 = 0;
        int i6 = 0;
        while (i5 < c21918.size()) {
            int i7 = c21918.getInt(i5);
            i5++;
            strArr2[i5] = C19147.m44385(i7);
            if (i7 == iM44388) {
                i6 = i5;
            }
        }
        spinner2.setAdapter((SpinnerAdapter) new C3054(this, strArr2));
        spinner2.setSelection(i6);
        if (c19148 != null) {
            c23255 = c23258;
            C19147.m44384(iM44388).mo2466(c23255, textView2, button2, c19148);
        } else {
            c23255 = c23258;
            C19147.f61961.mo2465(c23255, textView2, button2);
        }
        runnableC2739.run();
        spinner.setOnItemSelectedListener(new C4166(c23257, textView, button, runnableC2739));
        spinner2.setOnItemSelectedListener(new C14606(c23255, textView2, button2, runnableC2739));
        button.setOnClickListener(new View.OnClickListener() { // from class: l.۠ܳᩴ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i8 = ActivityC5440.f18993;
                C19147.m44384(C19147.f61962.getInt(spinner.getSelectedItemPosition())).mo2464((Button) view, this.f28367);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() { // from class: l.ۜܳᩴ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i8 = ActivityC5440.f18993;
                C19147.m44384(C19147.f61963.getInt(spinner2.getSelectedItemPosition() - 1)).mo2464((Button) view, this.f23801);
            }
        });
        C2361 c2361BuildDialog = buildDialog();
        c2361BuildDialog.m8005(viewM40395);
        final DialogInterfaceC8327 dialogInterfaceC8327M34866 = C14442.m34866(c2361BuildDialog, R.string.MT_Protector, null, R.string.MT_Protector, null);
        if (z) {
            C21576.m49090(c23256);
        }
        final C23255 c23259 = c23255;
        dialogInterfaceC8327M34866.m22436().setOnClickListener(new View.OnClickListener(spinner, spinner2, c23257, textView, button, c23259, textView2, button2, interfaceC0818, dialogInterfaceC8327M34866) { // from class: l.۬ܳᩴ

            /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ Spinner f44147;

            /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ Button f44148;

            /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ C23255 f44149;

            /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ InterfaceC0818 f44150;

            /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ C23255 f44151;

            /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ DialogInterfaceC8327 f44153;

            /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ Button f44154;

            /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ Spinner f44155;

            {
                this.f44154 = button;
                this.f44151 = c23259;
                this.f44148 = button2;
                this.f44150 = interfaceC0818;
                this.f44153 = dialogInterfaceC8327M34866;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C19147 c19147Mo2463;
                int i8 = ActivityC5440.f18993;
                C23255 c232510 = this.f44152;
                String string = c232510.m54021().toString();
                if (string.isEmpty()) {
                    c232510.requestFocus();
                    C22673.m51152(R.string.MT_Protector);
                    return;
                }
                Spinner spinner3 = this.f44155;
                int selectedItemPosition = spinner3.getSelectedItemPosition();
                Spinner spinner4 = this.f44147;
                int selectedItemPosition2 = spinner4.getSelectedItemPosition();
                int i9 = C19147.f61962.getInt(selectedItemPosition);
                int i10 = selectedItemPosition2 == 0 ? -1 : C19147.f61963.getInt(selectedItemPosition2 - 1);
                C19147 c19147Mo2464 = C19147.m44384(i9).mo2463(i9, this.f44149, this.f44154);
                if (c19147Mo2464 == null) {
                    return;
                }
                if (i10 == -1) {
                    c19147Mo2463 = null;
                } else {
                    c19147Mo2463 = C19147.m44384(i10).mo2463(i10, this.f44151, this.f44148);
                    if (c19147Mo2463 == null) {
                        return;
                    }
                }
                if (c19147Mo2463 == null || !c19147Mo2463.m44388() || c19147Mo2464.mo11457()) {
                    this.f44150.accept(new C16626(string, c19147Mo2464, c19147Mo2463));
                    this.f44153.dismiss();
                } else {
                    C22673.m51152(R.string.MT_Protector);
                    ActivityC5440.m16262(spinner3);
                    ActivityC5440.m16262(spinner4);
                }
            }
        });
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m16262(View view) {
        ObjectAnimator.ofFloat(view, "translationX", 0.0f, -25.0f, 0.0f, 25.0f, 0.0f, -15.0f, 0.0f, 15.0f, 0.0f, -5.0f, 0.0f, 5.0f, 0.0f).setDuration(600L).start();
    }
}
