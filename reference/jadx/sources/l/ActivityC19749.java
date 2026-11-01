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
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import bin.mt.plus.R;
import com.alipay.sdk.app.H5PayActivity$$ExternalSyntheticLambda0;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩵᩹ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AWI */
/* JADX INFO: loaded from: classes.dex */
public class ActivityC19749 extends AbstractActivityC12483 {

    /* JADX INFO: renamed from: ۜۚܽ, reason: not valid java name and contains not printable characters */
    private static final short[] f63456;

    /* JADX INFO: renamed from: ۤܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f63457 = 0;

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public C17215 f63458;

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public boolean f63459;

    /* JADX INFO: renamed from: ۘܰ, reason: not valid java name and contains not printable characters */
    public View f63460;

    /* JADX INFO: renamed from: ۜܰ, reason: not valid java name and contains not printable characters */
    public View f63462;

    /* JADX INFO: renamed from: ۡܰ, reason: not valid java name and contains not printable characters */
    public C13435 f63464;

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public View f63465;

    /* JADX INFO: renamed from: ܶܰ, reason: not valid java name and contains not printable characters */
    public C18337 f63466;

    /* JADX INFO: renamed from: ᩴܰ, reason: not valid java name and contains not printable characters */
    public View f63468;

    /* JADX INFO: renamed from: ᩵ܰ, reason: not valid java name and contains not printable characters */
    public TabLayout f63469;

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public View f63471;

    /* JADX INFO: renamed from: ᩺ܰ, reason: not valid java name and contains not printable characters */
    public View f63472;

    /* JADX INFO: renamed from: ᩸ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f63470 = new ArrayList();

    /* JADX INFO: renamed from: ᩳܰ, reason: not valid java name and contains not printable characters */
    public final C9186 f63467 = new C9186(0);

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public final C9186 f63461 = new C9186(Boolean.FALSE);

    /* JADX INFO: renamed from: ۠ܰ, reason: not valid java name and contains not printable characters */
    public final ViewOnLongClickListenerC19957 f63463 = new View.OnLongClickListener() { // from class: l.᩶ۚۚ
        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            return ActivityC19749.m44934(this.f63915, view);
        }
    };

    static {
        ApplicationC6132.m17119(147);
        f63456 = new short[]{839, 440, -4727, -2070, -5632, -2925, -7824, 10786, 8454, 6193, 8139, 1061, 7366, -5950, 2486, -1843, 4863, 12169, 1408, -5631, 7145, -5393, -4987, 10134, 11227, -2114, -5921, 3793, -6852, -4712, 8748, 30965, 30952, 30944, 30975, 30946, 30948, 30948, 30966, 30964, 30944, 30970, 30947, 30975, 30974, -1949, 8045, 885};
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private native void m44921(MenuItem menuItem);

    @Override // l.AbstractActivityC12483
    /* JADX INFO: renamed from: ۡ */
    public final String mo126() {
        return "TextFunctionBarEditActivity";
    }

    @Override // l.AbstractActivityC12483, l.ActivityC4866, l.ActivityC19126, l.ActivityC1086, l.ActivityC16858, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m31016(R.layout.MT_Protector);
        m31016(R.string.MT_Protector);
        C6938 c6938 = (C6938) m31016(R.id.MT_Protector);
        this.f41645 = c6938;
        m31004(c6938);
        m31017();
        int i = 1;
        this.f41645.setNavigationOnClickListener(new ViewOnClickListenerC7626(i, this));
        this.f63466 = new C18337(this);
        m44942();
        this.f63471 = m31016(R.id.done);
        this.f63472 = m31016(R.id.menuScrollView);
        this.f63468 = m31016(R.id.MT_Protector);
        this.f63465 = m31016(R.id.MT_Protector);
        this.f63462 = m31016(R.id.MT_Protector);
        this.f63460 = m31016(R.id.MT_Protector);
        this.f63471.setOnClickListener(new ViewOnClickListenerC17878(i, this));
        this.f63469 = (TabLayout) m31016(R.id.tabLayout);
        C13435 c13435 = (C13435) m31016(R.id.MT_Protector);
        this.f63464 = c13435;
        c13435.m44420(new C8460(this));
        this.f63469.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C16429(this));
        this.f63469.setupWithViewPager(this.f63464);
        TabLayout tabLayout = this.f63469;
        tabLayout.setTabIconTint(tabLayout.getTabTextColors());
        this.f63464.m44413(getIntent().getIntExtra("pageIndex", 0));
        final H5PayActivity$$ExternalSyntheticLambda0 h5PayActivity$$ExternalSyntheticLambda0 = new H5PayActivity$$ExternalSyntheticLambda0(this);
        this.f63458 = new C17215(C7689.m20320(this, new InterfaceC8395() { // from class: l.᩶۠ۘ
            @Override // l.InterfaceC8395
            /* JADX INFO: renamed from: ۙ */
            public final void mo1796(Intent intent, int i2) {
                String stringExtra;
                if (i2 == 0 || i2 != -1 || intent == null || (stringExtra = intent.getStringExtra(MotionUtils.EASING_TYPE_PATH)) == null) {
                    return;
                }
                Bundle bundleExtra = intent.getBundleExtra("extra");
                C13465.m32962(bundleExtra);
                h5PayActivity$$ExternalSyntheticLambda0.onGetPath(bundleExtra, stringExtra);
            }
        }));
        C14494 onBackPressedDispatcher = getOnBackPressedDispatcher();
        C12196 c12196 = new C12196(this);
        onBackPressedDispatcher.getClass();
        onBackPressedDispatcher.m34905(c12196);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44928(ActivityC19749 activityC19749, AbstractC20745 abstractC20745, int[] iArr) {
        try {
            C7754.m20406(abstractC20745, iArr[0]);
            activityC19749.m44942();
            C15829.m37611(R.string.MT_Protector);
        } catch (Exception e) {
            activityC19749.m31002(e, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // l.ActivityC10074, android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        m44917();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void m44940(boolean z) {
        if (z) {
            if (this.f63465.isClickable() && this.f63465.getAlpha() == 1.0f) {
                return;
            }
            this.f63465.setClickable(true);
            this.f63462.setClickable(true);
            this.f63460.setClickable(true);
            this.f63465.setAlpha(1.0f);
            this.f63462.setAlpha(1.0f);
            this.f63460.setAlpha(1.0f);
            return;
        }
        if (this.f63465.isClickable() || this.f63465.getAlpha() == 1.0f) {
            this.f63465.setClickable(false);
            this.f63462.setClickable(false);
            this.f63460.setClickable(false);
            this.f63465.setAlpha(0.5f);
            this.f63462.setAlpha(0.5f);
            this.f63460.setAlpha(0.5f);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m44938(final ActivityC19749 activityC19749, int i) {
        C9186 c9186 = activityC19749.f63461;
        activityC19749.f63459 = true;
        c9186.mo23642(Boolean.TRUE);
        final C1403 c1403 = (C1403) activityC19749.f63470.get(activityC19749.f63464.m44426());
        c1403.f5814 = i;
        c1403.f5820 = -2;
        BitSet bitSet = c1403.f5819;
        bitSet.clear();
        if (i != -1) {
            bitSet.set(i);
            c1403.f5821 = 1;
        } else {
            c1403.f5821 = 0;
        }
        c1403.f5816.notifyDataSetChanged();
        activityC19749.f63464.m32931(false);
        C19348 c19348 = new C19348(activityC19749.f63472, activityC19749.f63471, activityC19749.f63468);
        C19348 c19349 = new C19348(activityC19749.f63469);
        c19348.setAlpha(0.0f);
        c19348.m44354(0);
        c19349.f62387 = true;
        ObjectAnimator.ofFloat(c19348, "alpha", 0.0f, 1.0f).setDuration(200L).start();
        ObjectAnimator.ofFloat(c19349, "alpha", 1.0f, 0.0f).setDuration(200L).start();
        activityC19749.m44940(c1403.f5821 > 0);
        activityC19749.f63465.setOnClickListener(new View.OnClickListener() { // from class: l.ᩳۚۚ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityC19749.m44927(this.f56520, c1403);
            }
        });
        activityC19749.f63462.setOnClickListener(new View.OnClickListener() { // from class: l.ᩴۚۚ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityC19749.m44939(this.f59011, c1403);
            }
        });
        activityC19749.f63460.setOnClickListener(new View.OnClickListener() { // from class: l.۠ۚۚ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = ActivityC19749.f63457;
                final C1403 c1404 = c1403;
                int i3 = c1404.f5821;
                if (i3 == 0) {
                    return;
                }
                final ActivityC19749 activityC197410 = this.f26153;
                if (i3 != 1) {
                    C8067 c8067BuildDialog = activityC197410.buildDialog();
                    c8067BuildDialog.m21274(R.string.MT_Protector);
                    c8067BuildDialog.m21261(activityC197410.getString(R.string.MT_Protector, Integer.valueOf(c1404.f5821)));
                    c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۡۚۚ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i4) {
                            int i5 = ActivityC19749.f63457;
                            c1404.m4913(true);
                            C7754.m20408();
                            activityC197410.m44944(false);
                        }
                    });
                    c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                    c8067BuildDialog.m21269();
                    return;
                }
                int size = ((ArrayList) c1404.m4914()).size();
                final int i4 = 0;
                while (i4 < size) {
                    if (c1404.f5819.get(i4)) {
                        C21159 c21159 = (C21159) ((ArrayList) c1404.m4914()).get(i4);
                        C8067 c8067BuildDialog2 = activityC197410.buildDialog();
                        c8067BuildDialog2.m21274(R.string.MT_Protector);
                        c8067BuildDialog2.m21261(activityC197410.getString(R.string.MT_Protector, c21159.m47614()));
                        c8067BuildDialog2.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩵ۚۚ
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i5) {
                                int i6 = ActivityC19749.f63457;
                                C1403 c1405 = c1404;
                                ArrayList arrayList = (ArrayList) c1405.m4914();
                                int i7 = i4;
                                arrayList.remove(i7);
                                c1405.f5816.notifyItemRemoved(i7);
                                C7754.m20408();
                                activityC197410.m44944(false);
                            }
                        });
                        c8067BuildDialog2.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                        c8067BuildDialog2.m21269();
                    }
                    i4++;
                }
                i4 = -1;
                C21159 c211510 = (C21159) ((ArrayList) c1404.m4914()).get(i4);
                C8067 c8067BuildDialog3 = activityC197410.buildDialog();
                c8067BuildDialog3.m21274(R.string.MT_Protector);
                c8067BuildDialog3.m21261(activityC197410.getString(R.string.MT_Protector, c211510.m47614()));
                c8067BuildDialog3.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩵ۚۚ
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i5) {
                        int i6 = ActivityC19749.f63457;
                        C1403 c1405 = c1404;
                        ArrayList arrayList = (ArrayList) c1405.m4914();
                        int i7 = i4;
                        arrayList.remove(i7);
                        c1405.f5816.notifyItemRemoved(i7);
                        C7754.m20408();
                        activityC197410.m44944(false);
                    }
                });
                c8067BuildDialog3.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c8067BuildDialog3.m21269();
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m44927(ActivityC19749 activityC19749, final C1403 c1403) {
        if (c1403.f5821 == 0) {
            return;
        }
        activityC19749.m44920(R.string.MT_Protector, c1403.f5822, new InterfaceC4968() { // from class: l.᩷ۚۚ
            @Override // l.InterfaceC4968
            public final Object get() {
                int i = ActivityC19749.f63457;
                return c1403.m4913(false);
            }
        }, new RunnableC17794(2, activityC19749));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m44939(ActivityC19749 activityC19749, final C1403 c1403) {
        if (c1403.f5821 == 0) {
            return;
        }
        activityC19749.m44920(R.string.MT_Protector, c1403.f5822, new InterfaceC4968() { // from class: l.ۤۚۚ
            @Override // l.InterfaceC4968
            public final Object get() {
                int i = ActivityC19749.f63457;
                return c1403.m4913(true);
            }
        }, new RunnableC20410(1, activityC19749));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44944(boolean z) {
        if (this.f63459) {
            this.f63459 = false;
            this.f63461.mo23642(Boolean.FALSE);
            C1403 c1403 = (C1403) this.f63470.get(this.f63464.m44426());
            if (z) {
                c1403.f5816.notifyDataSetChanged();
            }
            this.f63464.m32931(true);
            C19348 c19348 = new C19348(this.f63469);
            C19348 c19349 = new C19348(this.f63472, this.f63471, this.f63468);
            c19348.setAlpha(0.0f);
            c19348.m44354(0);
            c19349.f62385 = true;
            ObjectAnimator.ofFloat(c19348, "alpha", 0.0f, 1.0f).setDuration(200L).start();
            ObjectAnimator.ofFloat(c19349, "alpha", 1.0f, 0.0f).setDuration(200L).start();
            this.f63465.setOnClickListener(null);
            this.f63462.setOnClickListener(null);
            this.f63460.setOnClickListener(null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m44934(final ActivityC19749 activityC19749, View view) {
        final int iIntValue = ((Integer) view.getTag(R.id.tabLayout)).intValue();
        ArrayList arrayList = activityC19749.f63470;
        if (iIntValue == arrayList.size()) {
            return false;
        }
        view.getParent().requestDisallowInterceptTouchEvent(true);
        C16195 c16195 = new C16195(view.getContext(), view, 0);
        c16195.m38292();
        C12418 c12418M38298 = c16195.m38298();
        boolean z = iIntValue > 0;
        boolean z2 = iIntValue < arrayList.size() - 1;
        boolean z3 = arrayList.size() > 1;
        boolean z4 = arrayList.size() > 1;
        c12418M38298.add(0, 1, 0, R.string.MT_Protector).setEnabled(z).setIcon(R.drawable.MT_Protector);
        c12418M38298.add(0, 2, 0, R.string.MT_Protector).setEnabled(z2).setIcon(R.drawable.MT_Protector);
        c12418M38298.add(0, 6, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c12418M38298.add(0, 3, 0, R.string.MT_Protector).setEnabled(z3).setIcon(R.drawable.MT_Protector);
        c12418M38298.add(0, 4, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c12418M38298.add(0, 5, 0, R.string.MT_Protector).setEnabled(z4).setIcon(R.drawable.MT_Protector);
        c16195.m38296(new InterfaceC21133() { // from class: l.ۚۚۚ
            @Override // l.InterfaceC21133
            public final boolean onMenuItemClick(MenuItem menuItem) {
                ActivityC19749.m44924(this.f17867, iIntValue, menuItem);
                return true;
            }
        });
        c16195.m38297();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44924(final ActivityC19749 activityC19749, final int i, MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 1:
                int i2 = i - 1;
                Collections.swap(C7754.m20409(), i, i2);
                C7754.m20408();
                activityC19749.m44942();
                activityC19749.f63464.m44413(i2);
                break;
            case 2:
                int i3 = i + 1;
                Collections.swap(C7754.m20409(), i, i3);
                C7754.m20408();
                activityC19749.m44942();
                activityC19749.f63464.m44413(i3);
                break;
            case 3:
                activityC19749.m44920(R.string.MT_Protector, i, new InterfaceC4968() { // from class: l.ۜۚۚ
                    @Override // l.InterfaceC4968
                    public final Object get() {
                        int i4 = ActivityC19749.f63457;
                        return ((C9166) ((ArrayList) C7754.m20409()).get(i)).m23579();
                    }
                }, (Runnable) null);
                break;
            case 4:
                C9166 c9166 = (C9166) ((ArrayList) C7754.m20409()).get(i);
                C17134 c17134 = new C17134(activityC19749, activityC19749, c9166);
                c17134.m40376(R.string.MT_Protector);
                c17134.m40346((CharSequence) c9166.m23581());
                c17134.m40355();
                c17134.m40340();
                c17134.m40368(true);
                break;
            case 5:
                String strM39264 = C16737.m39264(R.string.MT_Protector, ((C9166) ((ArrayList) C7754.m20409()).get(i)).m23581());
                C8067 c8067BuildDialog = activityC19749.buildDialog();
                c8067BuildDialog.m21274(R.string.MT_Protector);
                c8067BuildDialog.m21261(strM39264);
                c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩺ۚۚ
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i4) {
                        ActivityC19749.m44923(this.f74158, i);
                    }
                });
                c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c8067BuildDialog.m21269();
                break;
            case 6:
                C5845 c5845 = new C5845(activityC19749, activityC19749, i);
                c5845.m40376(R.string.MT_Protector);
                c5845.m40368(true);
                break;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m44923(ActivityC19749 activityC19749, int i) {
        ((ArrayList) C7754.m20409()).remove(i);
        C7754.m20408();
        int iM44426 = activityC19749.f63464.m44426();
        activityC19749.m44942();
        if (i <= 0 || iM44426 != i) {
            return;
        }
        activityC19749.f63464.m44413(i - 1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m44920(int i, final int i2, final InterfaceC4968 interfaceC4968, final Runnable runnable) {
        CharSequence[] charSequenceArr = (CharSequence[]) C9030.stream(C7754.m20409()).map(new C1443(1)).toArray(new C15018());
        SpannableString spannableString = new SpannableString(charSequenceArr[i2]);
        spannableString.setSpan(new ForegroundColorSpan(C20368.f65963), 0, spannableString.length(), 33);
        charSequenceArr[i2] = spannableString;
        final int[] iArr = {i2};
        C8067 c8067BuildDialog = buildDialog();
        c8067BuildDialog.m21274(i);
        c8067BuildDialog.m21266(charSequenceArr, i2, new DialogInterfaceOnClickListenerC19397(2, iArr));
        c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩸ۚۚ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                ActivityC19749.m44931(this.f69499, iArr, i2, interfaceC4968, runnable);
            }
        });
        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21269();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44931(ActivityC19749 activityC19749, int[] iArr, int i, InterfaceC4968 interfaceC4968, Runnable runnable) {
        int i2 = iArr[0];
        if (i2 != i) {
            List list = (List) interfaceC4968.get();
            if (!list.isEmpty()) {
                List listM23579 = ((C9166) ((ArrayList) C7754.m20409()).get(i2)).m23579();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((ArrayList) listM23579).add(C21159.m47613(((C21159) it.next()).m47616()));
                }
                ((C1403) activityC19749.f63470.get(i2)).f5816.notifyDataSetChanged();
                C7754.m20408();
            }
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m44917() {
        for (int i = 0; i < this.f63469.getTabCount(); i++) {
            TabLayout.Tab tabAt = this.f63469.getTabAt(i);
            if (tabAt != null) {
                TabLayout.TabView tabView = tabAt.view;
                tabView.setTag(R.id.tabLayout, Integer.valueOf(i));
                tabView.setOnLongClickListener(this.f63463);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public void m44942() {
        if (this.f63459) {
            m44944(true);
        }
        int size = ((ArrayList) C7754.m20409()).size();
        ArrayList arrayList = this.f63470;
        if (size == arrayList.size()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C1403) it.next()).f5816.notifyDataSetChanged();
            }
            AbstractC14217 abstractC14217M44430 = this.f63464.m44430();
            C13638.requireNonNull(abstractC14217M44430);
            abstractC14217M44430.m34322();
            return;
        }
        while (size > arrayList.size()) {
            arrayList.add(new C1403(this, arrayList.size()));
        }
        while (size < arrayList.size()) {
            C19028.m43762(arrayList, 1);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((C1403) it2.next()).f5816.notifyDataSetChanged();
        }
        C13435 c13435 = this.f63464;
        if (c13435 != null) {
            int iM44426 = c13435.m44426();
            this.f63464.m44420(new C8460(this));
            if (iM44426 >= 0 && iM44426 < size) {
                this.f63464.m44413(iM44426);
            } else if (iM44426 == size) {
                this.f63464.m44413(iM44426 - 1);
            }
            this.f63464.post(new RunnableC4263(3, this));
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.MT_Protector, menu);
        final MenuItem menuItemFindItem = menu.findItem(R.id.MT_Protector);
        final MenuItem menuItemFindItem2 = menu.findItem(R.id.more);
        this.f63467.m44959(this, new InterfaceC10597() { // from class: l.֡ۚۚ
            @Override // l.InterfaceC10597
            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public final void mo1473(Object obj) {
                ActivityC19749 activityC19749 = this.f1335;
                menuItemFindItem.setVisible((activityC19749.f63459 || ((Integer) obj).intValue() == activityC19749.f63470.size()) ? false : true);
            }
        });
        this.f63461.m44959(this, new InterfaceC10597() { // from class: l.ۖۚۚ
            @Override // l.InterfaceC10597
            /* JADX INFO: renamed from: ۙ */
            public final void mo1473(Object obj) {
                ActivityC19749.m44925(this.f8237, menuItemFindItem, menuItemFindItem2, (Boolean) obj);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m44925(ActivityC19749 activityC19749, MenuItem menuItem, MenuItem menuItem2, Boolean bool) {
        menuItem.setVisible((bool.booleanValue() || activityC19749.f63469.getSelectedTabPosition() == activityC19749.f63470.size()) ? false : true);
        menuItem2.setVisible(!bool.booleanValue());
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        m44921(menuItem);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44932(ActivityC19749 activityC19749, boolean[] zArr) {
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
        String string = ApplicationC0716.f2992.getString("tfdp", null);
        String strMo33986 = string == null ? C11904.f39934.mo33986() : C6730.m18172(string);
        String strM18175 = string == null ? "TextFunctions.json" : C6730.m18175(string);
        C17215 c17215 = activityC19749.f63458;
        c17215.getClass();
        C17215.m40155(c17215, R.string.MT_Protector, bundle, strMo33986, strM18175, new String[]{"json"}, 32);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m44933(C21159 c21159, int i, boolean z, final InterfaceC17295 interfaceC17295) {
        EditText editText;
        View viewM30995 = m30995(R.layout.MT_Protector);
        ((TextView) viewM30995.findViewById(R.id.MT_Protector)).setText(i);
        final EditText editText2 = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        final Spinner spinner = (Spinner) viewM30995.findViewById(R.id.spinner);
        final EditText editText3 = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        final Button button = (Button) viewM30995.findViewById(R.id.MT_Protector);
        final TextView textView = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        button.setTag(R.id.MT_Protector, textView);
        final Spinner spinner2 = (Spinner) viewM30995.findViewById(R.id.spinner2);
        EditText editText4 = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        final Button button2 = (Button) viewM30995.findViewById(R.id.button2);
        final TextView textView2 = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        button2.setTag(R.id.MT_Protector, textView2);
        RunnableC20430 runnableC20430 = new RunnableC20430(editText3, editText4, viewM30995.findViewById(R.id.MT_Protector), 1);
        editText2.setText(c21159.m47614());
        C16958 c16958 = C13607.f44884;
        String[] strArr = new String[c16958.size()];
        C13607 c13607 = c21159.f68906;
        int iM33251 = c13607.m33251();
        int i2 = 0;
        for (int i3 = 0; i3 < c16958.size(); i3++) {
            int i4 = c16958.getInt(i3);
            strArr[i3] = C13607.m33243(i4);
            if (i4 == iM33251) {
                i2 = i3;
            }
        }
        spinner.setAdapter((SpinnerAdapter) new C0733(this, strArr));
        spinner.setSelection(i2);
        C13607.m33242(iM33251).mo1164(editText3, textView, button, c13607);
        C16958 c16959 = C13607.f44883;
        String[] strArr2 = new String[c16959.size() + 1];
        strArr2[0] = C16737.m39288(R.string.MT_Protector);
        C13607 c13608 = c21159.f68904;
        int iM33252 = c13608 == null ? -1 : c13608.m33251();
        int i5 = 0;
        int i6 = 0;
        while (i5 < c16959.size()) {
            int i7 = c16959.getInt(i5);
            i5++;
            strArr2[i5] = C13607.m33243(i7);
            if (i7 == iM33252) {
                i6 = i5;
            }
        }
        spinner2.setAdapter((SpinnerAdapter) new C0733(this, strArr2));
        spinner2.setSelection(i6);
        if (c13608 != null) {
            editText = editText4;
            C13607.m33242(iM33252).mo1164(editText, textView2, button2, c13608);
        } else {
            editText = editText4;
            C13607.f44885.mo1163(editText, textView2, button2);
        }
        runnableC20430.run();
        spinner.setOnItemSelectedListener(new C23485(editText3, textView, button, runnableC20430));
        spinner2.setOnItemSelectedListener(new C14313(editText, textView2, button2, runnableC20430));
        button.setOnClickListener(new View.OnClickListener() { // from class: l.᩹ۚۚ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i8 = ActivityC19749.f63457;
                C13607.m33242(C13607.f44884.getInt(spinner.getSelectedItemPosition())).mo1162((Button) view, this.f71523);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() { // from class: l.֨ۚۚ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i8 = ActivityC19749.f63457;
                C13607.m33242(C13607.f44883.getInt(spinner2.getSelectedItemPosition() - 1)).mo1162((Button) view, this.f3630);
            }
        });
        C8067 c8067BuildDialog = buildDialog();
        c8067BuildDialog.m21258(viewM30995);
        final DialogInterfaceC19356 dialogInterfaceC19356M10334 = C3509.m10334(c8067BuildDialog, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        if (z) {
            C16737.m39290(editText2);
        }
        final EditText editText5 = editText;
        dialogInterfaceC19356M10334.m44373().setOnClickListener(new View.OnClickListener(editText2, spinner, spinner2, editText3, textView, button, editText5, textView2, button2, interfaceC17295, dialogInterfaceC19356M10334) { // from class: l.۬ۚۚ

            /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ DialogInterfaceC19356 f42880;

            /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ EditText f42881;

            /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ Button f42882;

            /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ EditText f42883;

            /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ EditText f42884;

            /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ Spinner f42885;

            /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ Button f42886;

            /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ Spinner f42887;

            /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ InterfaceC17295 f42888;

            {
                this.f42886 = button;
                this.f42881 = editText5;
                this.f42882 = button2;
                this.f42888 = interfaceC17295;
                this.f42880 = dialogInterfaceC19356M10334;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C13607 c13607Mo1161;
                int i8 = ActivityC19749.f63457;
                EditText editText6 = this.f42884;
                String string = editText6.getText().toString();
                if (string.isEmpty()) {
                    editText6.requestFocus();
                    C15829.m37611(R.string.MT_Protector);
                    return;
                }
                Spinner spinner3 = this.f42887;
                int selectedItemPosition = spinner3.getSelectedItemPosition();
                Spinner spinner4 = this.f42885;
                int selectedItemPosition2 = spinner4.getSelectedItemPosition();
                int i9 = C13607.f44884.getInt(selectedItemPosition);
                int i10 = selectedItemPosition2 == 0 ? -1 : C13607.f44883.getInt(selectedItemPosition2 - 1);
                C13607 c13607Mo1162 = C13607.m33242(i9).mo1161(i9, this.f42883, this.f42886);
                if (c13607Mo1162 == null) {
                    return;
                }
                if (i10 == -1) {
                    c13607Mo1161 = null;
                } else {
                    c13607Mo1161 = C13607.m33242(i10).mo1161(i10, this.f42881, this.f42882);
                    if (c13607Mo1161 == null) {
                        return;
                    }
                }
                if (c13607Mo1161 == null || !c13607Mo1161.m33250() || c13607Mo1162.mo33244()) {
                    this.f42888.accept(new C21159(string, c13607Mo1162, c13607Mo1161));
                    this.f42880.dismiss();
                } else {
                    C15829.m37611(R.string.MT_Protector);
                    ActivityC19749.m44919(spinner3);
                    ActivityC19749.m44919(spinner4);
                }
            }
        });
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m44919(View view) {
        ObjectAnimator.ofFloat(view, "translationX", 0.0f, -25.0f, 0.0f, 25.0f, 0.0f, -15.0f, 0.0f, 15.0f, 0.0f, -5.0f, 0.0f, 5.0f, 0.0f).setDuration(600L).start();
    }
}
