package l;

import android.animation.ObjectAnimator;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcel;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import bin.mt.plus.R;
import com.alipay.sdk.m.t.e;
import com.alipay.sdk.m.y.q;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.slider.BaseSlider;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;

/* JADX INFO: renamed from: l.֨֫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityC0848 extends AbstractActivityC17204 {

    /* JADX INFO: renamed from: ۜ۬۫, reason: not valid java name and contains not printable characters */
    private static final short[] f3168 = {1655, 26, 29, 26, 7, 1013, 16491, -20220, 30461, -23761, 23942, -21315, 11004, 11001, 10988, 11001, 10935, 10986, 11005, 10987, 10999, 10989, 10986, 11003, 11005, 10987, 10934, 11001, 10986, 10987, 11003, 23705, -19386, -23821, 18294, 31226, 23738};

    /* JADX INFO: renamed from: ۡ᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f3169 = 0;

    /* JADX INFO: renamed from: ֡᩷, reason: not valid java name and contains not printable characters */
    public boolean f3170;

    /* JADX INFO: renamed from: ֨᩷, reason: not valid java name and contains not printable characters */
    public C22761 f3171;

    /* JADX INFO: renamed from: ֫᩷, reason: not valid java name and contains not printable characters */
    public int f3172;

    /* JADX INFO: renamed from: ۘ᩷, reason: not valid java name and contains not printable characters */
    public FloatingActionButton f3174;

    /* JADX INFO: renamed from: ۛ᩷, reason: not valid java name and contains not printable characters */
    public C11999 f3176;

    /* JADX INFO: renamed from: ۟᩷, reason: not valid java name and contains not printable characters */
    public C8887 f3177;

    /* JADX INFO: renamed from: ۢ᩷, reason: not valid java name and contains not printable characters */
    public C12318 f3178;

    /* JADX INFO: renamed from: ۧ᩷, reason: not valid java name and contains not printable characters */
    public C20283 f3179;

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public C11967 f3181;

    /* JADX INFO: renamed from: ܰ᩷, reason: not valid java name and contains not printable characters */
    public String f3182;

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public boolean f3183;

    /* JADX INFO: renamed from: ܺ᩷, reason: not valid java name and contains not printable characters */
    public C16390 f3185;

    /* JADX INFO: renamed from: ܽ᩷, reason: not valid java name and contains not printable characters */
    public boolean f3186;

    /* JADX INFO: renamed from: ܿ᩷, reason: not valid java name and contains not printable characters */
    public C25227 f3187;

    /* JADX INFO: renamed from: ᩳ᩷, reason: not valid java name and contains not printable characters */
    public TextView f3188;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public C14271 f3189;

    /* JADX INFO: renamed from: ᩵᩷, reason: not valid java name and contains not printable characters */
    public boolean f3190;

    /* JADX INFO: renamed from: ᩶᩷, reason: not valid java name and contains not printable characters */
    public C9378 f3191;

    /* JADX INFO: renamed from: ᩹᩷, reason: not valid java name and contains not printable characters */
    public boolean f3193;

    /* JADX INFO: renamed from: ᩺᩷, reason: not valid java name and contains not printable characters */
    public C23551 f3194;

    /* JADX INFO: renamed from: ᩻᩷, reason: not valid java name and contains not printable characters */
    public C8147 f3195;

    /* JADX INFO: renamed from: ۗ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f3173 = new ArrayList();

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public LinkedList f3175 = new LinkedList();

    /* JADX INFO: renamed from: ۨ᩷, reason: not valid java name and contains not printable characters */
    public C2667 f3180 = new C2667(0, this);

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public final AtomicReference f3192 = new AtomicReference();

    /* JADX INFO: renamed from: ܶ᩷, reason: not valid java name and contains not printable characters */
    public C24720 f3184 = C24720.m55196();

    @Override // l.AbstractActivityC17204
    /* JADX INFO: renamed from: ᩶ */
    public final String mo122() {
        return "ProjectActivity";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ Boolean m3356(ActivityC0848 activityC0848, AbstractC9051 abstractC9051) {
        activityC0848.getClass();
        return Boolean.valueOf((abstractC9051 instanceof InterfaceC14555) && ((InterfaceC14555) abstractC9051).mo35102(activityC0848.f3181));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m3362(ActivityC0848 activityC0848, int i, CheckBox checkBox) {
        activityC0848.getClass();
        ArrayList arrayList = new ArrayList(activityC0848.f3173.subList(0, i));
        C9911.m25735(arrayList, new C18111());
        boolean zIsChecked = checkBox.isChecked();
        LinkedList linkedList = new LinkedList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedList.add(new C0102(activityC0848, linkedList, (AbstractC9051) it.next(), zIsChecked));
        }
        if (linkedList.isEmpty()) {
            return;
        }
        ((C0102) linkedList.removeFirst()).m1202();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m3388(ActivityC0848 activityC0848) {
        activityC0848.getClass();
        try {
            C12362.m30838(activityC0848.f3191);
            activityC0848.m3437(true);
        } catch (Throwable th) {
            activityC0848.m40401(th, (DialogInterface.OnDismissListener) null);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m3390(ActivityC0848 activityC0848, int i, CheckBox checkBox) {
        activityC0848.getClass();
        ArrayList arrayList = activityC0848.f3173;
        ArrayList arrayList2 = new ArrayList(arrayList.subList(i + 1, arrayList.size()));
        C9911.m25735(arrayList2, new C14381());
        boolean zIsChecked = checkBox.isChecked();
        LinkedList linkedList = new LinkedList();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            linkedList.add(new C0102(activityC0848, linkedList, (AbstractC9051) it.next(), zIsChecked));
        }
        if (linkedList.isEmpty()) {
            return;
        }
        ((C0102) linkedList.removeFirst()).m1202();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ Boolean m3411(ActivityC0848 activityC0848, AbstractC9051 abstractC9051) {
        activityC0848.getClass();
        return Boolean.valueOf((abstractC9051 instanceof InterfaceC10586) && ((InterfaceC10586) abstractC9051).mo1439(activityC0848.f3179));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m3414(ActivityC0848 activityC0848, int i, CheckBox checkBox) {
        activityC0848.getClass();
        ArrayList arrayList = new ArrayList(activityC0848.f3173);
        arrayList.remove(i);
        C9911.m25735(arrayList, new C3941());
        boolean zIsChecked = checkBox.isChecked();
        LinkedList linkedList = new LinkedList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedList.add(new C0102(activityC0848, linkedList, (AbstractC9051) it.next(), zIsChecked));
        }
        if (linkedList.isEmpty()) {
            return;
        }
        ((C0102) linkedList.removeFirst()).m1202();
    }

    @Override // l.AbstractActivityC17204, l.ActivityC7405, l.ActivityC3409, l.ActivityC5577, l.ActivityC8866, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("");
        m40418(R.layout.MT_Protector);
        m40415();
        C7068 onBackPressedDispatcher = getOnBackPressedDispatcher();
        C11288 c11288 = new C11288(this);
        onBackPressedDispatcher.getClass();
        onBackPressedDispatcher.m19400(c11288);
        m40417().m43815(2);
        m3397();
        C16390 c16390 = (C16390) m40418(R.id.MT_Protector);
        this.f56046 = c16390;
        m40407(c16390);
        C16390 c16391 = (C16390) m40418(R.id.MT_Protector);
        this.f3185 = c16391;
        c16391.inflateMenu(R.menu.MT_Protector);
        this.f3177 = new C8887(this.f3185, R.id.MT_Protector, R.id.more);
        MenuItem menuItemFindItem = this.f3185.getMenu().findItem(R.id.MT_Protector);
        this.f3185.setOnMenuItemClickListener(new InterfaceC25342() { // from class: l.۠۫ۧ
            @Override // l.InterfaceC25342
            public final boolean onMenuItemClick(MenuItem menuItem) {
                this.f28215.m3427(menuItem);
                return true;
            }
        });
        this.f3195 = (C8147) m40418(R.id.MT_Protector);
        this.f3174 = (FloatingActionButton) m40418(R.id.MT_Protector);
        m40404(this.f3195, m40418(R.id.MT_Protector), this.f56046, m40418(R.id.MT_Protector), this.f3185, this.f3174);
        this.f3195.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC7142(0, this));
        C22248 c22248 = new C22248(this, this.f3195, this.f56046);
        c22248.m50300().m54301(C3296.f10732.getDefaultColor());
        this.f3195.m22041(c22248);
        c22248.m50302();
        this.f3195.m22041(new C1594(this));
        C22761 c22761 = (C22761) new C16196(this).m38422(C22761.class);
        this.f3171 = c22761;
        C17930 c17930M51296 = c22761.m51296();
        C17359.requireNonNull(menuItemFindItem);
        c17930M51296.m40350(this, new C1038(1, menuItemFindItem));
        this.f3171.m51321().m40350(this, new InterfaceC16438() { // from class: l.۬۫ۧ
            @Override // l.InterfaceC16438
            /* JADX INFO: renamed from: ۙ */
            public final void mo1486(Object obj) {
                C20283 c20283 = (C20283) obj;
                int i = ActivityC0848.f3169;
                if (c20283 != null) {
                    c20283.m46616(this.f43952);
                }
            }
        });
        this.f3171.m51306(this, this.f3180);
        this.f3171.m51300(this, new C0249(4, this));
        C17930 c17930M51320 = this.f3171.m51320();
        final C16390 c16392 = this.f3185;
        C17359.requireNonNull(c16392);
        c17930M51320.m40350(this, new InterfaceC16438() { // from class: l.ۙۚۧ
            @Override // l.InterfaceC16438
            /* JADX INFO: renamed from: ۙ */
            public final void mo1486(Object obj) {
                c16392.setTitle((String) obj);
            }
        });
        this.f3178 = (C12318) new C16196(this).m38422(C12318.class);
        this.f3194 = new C23551();
        C21576.m49069(new RunnableC21841(this, 0), 500L);
        if (getIntent().hasExtra("bundle") && bundle == null) {
            Bundle extras = getIntent().getExtras();
            C17359.requireNonNull(extras);
            bundle = extras.getBundle("bundle");
            getIntent().getExtras().remove("bundle");
            C11972.m30030(this.f3171.m51321().m40346());
            C11972.m30030(this.f3171.m51322().m40346());
        }
        if (bundle != null) {
            this.f3191 = (C9378) bundle.getSerializable("projectRootDir");
            String[] stringArray = bundle.getStringArray("backStack");
            this.f3172 = bundle.getInt("currentFragment", 0);
            this.f3182 = bundle.getString("outputPath", null);
            if (this.f3191 == null || stringArray == null) {
                finish();
                return;
            }
            LinkedList linkedList = this.f3175;
            linkedList.clear();
            Collections.addAll(linkedList, stringArray);
            try {
                m3420(false);
                C20283 c20283 = this.f3179;
                ArrayList arrayList = this.f3173;
                if (c20283 != null) {
                    ComponentCallbacksC11612 componentCallbacksC11612M10493 = m11155().m10493("000000-0000-0000-0000-000000000000");
                    if (componentCallbacksC11612M10493 == null) {
                        componentCallbacksC11612M10493 = new C13831();
                        this.f3172 = 0;
                        AbstractC4573 abstractC4573M10492 = m11155().m10492();
                        abstractC4573M10492.m14357(componentCallbacksC11612M10493, "000000-0000-0000-0000-000000000000");
                        abstractC4573M10492.mo14363();
                    }
                    arrayList.add((AbstractC9051) componentCallbacksC11612M10493);
                }
                if (this.f3181 != null) {
                    ComponentCallbacksC11612 componentCallbacksC11612M10494 = m11155().m10493("000000-0000-0000-0000-000000000001");
                    if (componentCallbacksC11612M10494 == null) {
                        componentCallbacksC11612M10494 = new C24406();
                        if (this.f3179 == null) {
                            this.f3172 = 0;
                            AbstractC4573 abstractC4573M10493 = m11155().m10492();
                            abstractC4573M10493.m14357(componentCallbacksC11612M10494, "000000-0000-0000-0000-000000000001");
                            abstractC4573M10493.mo14363();
                        }
                    }
                    arrayList.add((AbstractC9051) componentCallbacksC11612M10494);
                }
                m3405(true);
                if (this.f3181 == null && m3438() && C1170.stream(arrayList).noneMatch(new C2340(2))) {
                    arrayList.add(1, new C2776());
                    m3355();
                }
                m3382();
                m3408();
            } catch (IOException e) {
                m40402((Throwable) e, true);
            }
            m40418(R.id.MT_Protector).setVisibility(8);
            if (bundle.getBoolean("hideProjectLoadingView", false)) {
                m3460();
                return;
            }
            return;
        }
        new C17255(this).m8197();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m3380(ActivityC0848 activityC0848) {
        int width = (activityC0848.f3195.getWidth() - activityC0848.f3195.getChildAt(1).getWidth()) - activityC0848.f3174.getWidth();
        int iM19160 = C6907.m19160(36.0f);
        float f = -(width > iM19160 * 2 ? width - iM19160 : width / 2);
        if (activityC0848.f3174.getTranslationX() != f) {
            activityC0848.f3174.setTranslationX(f);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m3367(ActivityC0848 activityC0848, String str) {
        ArrayList arrayList = activityC0848.f3173;
        for (int i = 0; i < arrayList.size(); i++) {
            if (((AbstractC9051) arrayList.get(i)).m24161().equals(str)) {
                activityC0848.m3357(i, true, false);
                return;
            }
        }
    }

    @Override // l.AbstractActivityC17204, l.ActivityC7405, l.ActivityC4348, l.ActivityC5577, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m3397();
    }

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    private void m3397() {
        if (getResources().getConfiguration().orientation == 2) {
            m40417().m43811(1);
        } else if (getResources().getConfiguration().orientation == 1) {
            m40417().m43814(1);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3428(CharSequence charSequence) {
        this.f56046.setSubtitle(charSequence);
    }

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final TextView m3433() {
        if (this.f3188 == null) {
            try {
                Field declaredField = C16390.class.getDeclaredField("mSubtitleTextView");
                declaredField.setAccessible(true);
                this.f3188 = (TextView) declaredField.get(this.f56046);
            } catch (Exception unused) {
            }
        }
        return this.f3188;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m3456(int i) {
        C23551 c23551 = this.f3194;
        if (c23551 != null) {
            c23551.m52754(this, i);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final View m3434(int i) {
        C23551 c23551 = this.f3194;
        if (c23551 != null) {
            return c23551.m52753(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final void m3460() {
        View viewM40418 = m40418(R.id.MT_Protector);
        if (viewM40418.getVisibility() != 8) {
            viewM40418.setVisibility(8);
        }
        this.f3190 = true;
    }

    @Override // l.ActivityC7405
    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void mo3459() {
        m3453(false);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m3453(boolean z) {
        C20283 c20283 = this.f3179;
        if (c20283 == null || !c20283.m46592(this, this.f3171)) {
            C11967 c11967 = this.f3181;
            if (c11967 == null || !c11967.m29986(this, this.f3171)) {
                if (z && this.f3184.m55199()) {
                    C22673.m51152(R.string.MT_Protector);
                } else {
                    finish();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public final void m3426() {
        C20283 c20283;
        int i = 0;
        boolean z = !(this.f3181 == null || this.f3179 == null) || ((c20283 = this.f3179) != null && c20283.m46599());
        int i2 = DialogInterfaceC8327.f27315;
        C2361 c2361 = new C2361(this);
        c2361.m8021(R.string.MT_Protector);
        c2361.m8000(z ? R.string.MT_Protector : R.string.MT_Protector);
        c2361.m8026(R.string.MT_Protector, new DialogInterfaceOnClickListenerC10652(i, this));
        c2361.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361.m8018(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩸ۚۧ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                int i4 = ActivityC0848.f3169;
                this.f73023.finish();
            }
        });
        c2361.m8016();
    }

    @Override // l.ActivityC5577, l.ActivityC8866, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("hideProjectLoadingView", this.f3190);
        bundle.putStringArray("backStack", (String[]) this.f3175.toArray(new String[0]));
        C9378 c9378 = this.f3191;
        if (c9378 != null) {
            bundle.putSerializable("projectRootDir", c9378);
            bundle.putInt("currentFragment", this.f3172);
            bundle.putString("outputPath", this.f3182);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m3365(ActivityC0848 activityC0848, Exception exc) {
        activityC0848.m40401(exc, (DialogInterface.OnDismissListener) null);
        if (exc instanceof C18636) {
            C18636 c18636 = (C18636) exc;
            C15301 c15301M36736 = C15301.m36736(c18636.f60596, c18636.f60595);
            c15301M36736.f50017 = false;
            activityC0848.m3431(c18636.m43392(), c15301M36736);
            C20283 c20283 = activityC0848.f3179;
            C17359.requireNonNull(c20283);
            c20283.m46575(c18636.m43392());
            return;
        }
        if (exc instanceof C17692) {
            C17692 c17692 = (C17692) exc;
            C15301 c15301M36737 = C15301.m36736(c17692.f58154, c17692.f58152);
            c15301M36737.f50017 = false;
            activityC0848.m3452(c17692.m41404(), c15301M36737);
            C11967 c11967 = activityC0848.f3181;
            C17359.requireNonNull(c11967);
            c11967.m29972(c17692.m41404());
        }
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static void m3385(ActivityC0848 activityC0848) {
        if (activityC0848.f3181 == null || !activityC0848.f3183) {
            return;
        }
        activityC0848.f3183 = false;
        new C23223(activityC0848, (C20168) activityC0848.getLifecycle()).m8197();
    }

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final void m3440() {
        C14271 c14271 = this.f3189;
        if (c14271 != null) {
            c14271.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final void m3457() {
        if (this.f3195.m22057(8388611)) {
            this.f3195.m22037(8388611);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public void m3382() {
        this.f3189 = new C14271(this);
        C25227 c25227 = (C25227) findViewById(R.id.MT_Protector);
        this.f3187 = c25227;
        c25227.setAdapter(this.f3189);
        this.f3187.setLayoutManager(new C0067(this));
        this.f3187.getItemAnimator().m10754(200L);
        this.f3187.getItemAnimator().m10769(200L);
        this.f3187.getItemAnimator().m10761(200L);
        this.f3187.getItemAnimator().m10766(200L);
        this.f3174.setOnClickListener(new ViewOnClickListenerC3238(6, this));
        this.f3187.addOnScrollListener(new C3085(this));
        C25227 c25228 = this.f3187;
        C8887 c8887 = this.f3177;
        C17359.requireNonNull(c8887);
        c25228.addOnItemTouchListener(new C11257(c25228, new C19063(c8887)));
        C11999 c11999 = new C11999(new C12034(this));
        this.f3176 = c11999;
        c11999.m30173(this.f3187);
        this.f3177.m23773(this.f3189);
        this.f3177.m23772(this.f3176);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m3391(ActivityC0848 activityC0848, AbstractC9051 abstractC9051) {
        return ((abstractC9051 instanceof C13831) || (abstractC9051 instanceof C24406) || (abstractC9051 instanceof C2776)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public void m3408() {
        boolean zM22057 = this.f3195.m22057(8388611);
        C0067 c0067 = (C0067) this.f3187.getLayoutManager();
        C17359.requireNonNull(c0067);
        int iFindFirstVisibleItemPosition = c0067.findFirstVisibleItemPosition();
        int childCount = c0067.getChildCount() + iFindFirstVisibleItemPosition;
        int i = this.f3172;
        if (i < iFindFirstVisibleItemPosition || i >= childCount) {
            if (this.f3170) {
                return;
            }
            this.f3170 = true;
            if (zM22057) {
                this.f3174.setVisibility(0);
                this.f3174.setAlpha(0.0f);
                ObjectAnimator.ofFloat(this.f3174, "alpha", 0.0f, 1.0f).setDuration(200L).start();
                return;
            }
            return;
        }
        if (this.f3170) {
            this.f3170 = false;
            if (zM22057) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f3174, "alpha", 1.0f, 0.0f);
                objectAnimatorOfFloat.addListener(new C6069(this));
                objectAnimatorOfFloat.setDuration(200L).start();
            }
        }
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static void m3387(ActivityC0848 activityC0848) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        boolean z2 = true;
        for (AbstractC22044 abstractC22044 : C6382.f21563.mo4299(true)) {
            if (abstractC22044.getName().endsWith(".project") && abstractC22044.mo4281()) {
                arrayList.add(abstractC22044);
            }
        }
        if (!arrayList.isEmpty()) {
            C5261.f18540.submit(new RunnableC4021(2, arrayList));
        }
        activityC0848.f3191 = new C9378(C6382.f21563.m49857(".project"));
        Bundle extras = activityC0848.getIntent().getExtras();
        C17359.requireNonNull(extras);
        int i = 0;
        if (extras.containsKey("dexFiles")) {
            ArrayList arrayList2 = new ArrayList();
            C20348 c20348M46739 = C20348.m46739(extras.getByteArray("dexFiles"));
            while (c20348M46739.available() > 0) {
                arrayList2.add(C14584.m35193(c20348M46739.m46758(), new String[0]));
            }
            C6113 c6113 = new C6113();
            C24013.m53565(arrayList2, activityC0848.f3191.m24699(), c6113, new C11398(i, activityC0848));
            if (c6113.m17640()) {
                activityC0848.m40397(R.string.MT_Protector, activityC0848.getString(R.string.MT_Protector, c6113.toString()), false);
            }
            activityC0848.f3182 = ((AbstractC22044) arrayList2.get(0)).getParent();
            z = true;
        } else {
            z = false;
        }
        if (extras.containsKey("arscFile")) {
            String string = extras.getString("arscFile");
            C17359.requireNonNull(string);
            AbstractC22044 abstractC22044M35193 = C14584.m35193(string, new String[0]);
            C21664.m49203(abstractC22044M35193, activityC0848.f3191.m24699());
            activityC0848.f3183 = true;
            activityC0848.f3182 = abstractC22044M35193.getParent();
        } else {
            z2 = z;
        }
        if (!z2) {
            throw new RuntimeException();
        }
    }

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final boolean m3438() {
        return this.f3191.m24694("data/resources.arsc").mo2934();
    }

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final boolean m3449() {
        int i;
        if (this.f3181 != null || this.f3186) {
            return true;
        }
        C9378 c9378 = this.f3191;
        if (c9378 != null) {
            AbstractC22044 abstractC22044M24694 = c9378.m24694("data/resources.arsc");
            if (abstractC22044M24694.mo2934()) {
                AbstractC3191 abstractC3191M11155 = m11155();
                if (!abstractC3191M11155.m10467() && (i = this.f3172) >= 0) {
                    ArrayList arrayList = this.f3173;
                    if (i < arrayList.size()) {
                        AbstractC9051 abstractC9051 = (AbstractC9051) arrayList.get(this.f3172);
                        if ((abstractC9051 instanceof C2776) && abstractC3191M11155.m10493("000000-0000-0000-0000-000000000001") == null) {
                            if (!C18978.m44079()) {
                                m40398(R.string.MT_Protector, false);
                                return true;
                            }
                            if (!C18978.m44078()) {
                                m40398(R.string.MT_Protector, false);
                                return true;
                            }
                            this.f3186 = true;
                            new C23969(this, abstractC22044M24694, (C2776) abstractC9051).m8197();
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m3371(ActivityC0848 activityC0848, C11967 c11967) {
        c11967.m29977(activityC0848, activityC0848.f3180);
        c11967.m29978(activityC0848, new C17365(activityC0848));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public void m3420(boolean z) throws C3090 {
        C9378 c9378 = this.f3191;
        boolean z2 = false;
        boolean z3 = c9378 != null && c9378.m24694("dex").mo4281();
        C9378 c9379 = this.f3191;
        boolean z4 = c9379 != null && c9379.m24694("arsc").mo4281();
        if (!z3 && !z4) {
            throw new C3090("No a dex or arsc project.");
        }
        if (!z) {
            C20283 c20283 = this.f3179;
            if (z3 && c20283 != null) {
                if (!c20283.m11160().equals(this.f3191)) {
                    throw new RuntimeException("dex");
                }
                runOnUiThread(new RunnableC9632(1, this, c20283));
                z3 = false;
            }
            C11967 c11967 = this.f3181;
            if (!z4 || c11967 == null) {
                z2 = z4;
            } else {
                if (!c11967.m11160().equals(this.f3191)) {
                    throw new RuntimeException("arsc");
                }
                runOnUiThread(new RunnableC21937(2, this, c11967));
            }
            if (!z3 && !z2) {
                this.f3171.m51296().mo40348(Boolean.valueOf(m3446()));
                this.f3171.m51320().mo40348((Object) (m3446() ? getString(R.string.MT_Protector) : this.f3191.getName()));
                return;
            }
            z4 = z2;
        }
        if (z3) {
            final C20283 c20283M46564 = C20283.m46564(this.f3191);
            this.f3179 = c20283M46564;
            runOnUiThread(new Runnable() { // from class: l.ܺۚۧ
                @Override // java.lang.Runnable
                public final void run() {
                    ActivityC0848 activityC0848 = this.f53741;
                    c20283M46564.m46584(activityC0848, activityC0848.f3180);
                }
            });
            this.f3171.m51321().mo40348(c20283M46564);
        }
        if (z4) {
            C11967 c11967M29958 = C11967.m29958(this.f3191);
            this.f3181 = c11967M29958;
            runOnUiThread(new RunnableC19852(4, this, c11967M29958));
            this.f3171.m51322().mo40348(c11967M29958);
        }
        this.f3171.m51296().mo40348(Boolean.valueOf(m3446()));
        this.f3171.m51320().mo40348((Object) (m3446() ? getString(R.string.MT_Protector) : this.f3191.getName()));
    }

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final boolean m3446() {
        C9378 c9378 = this.f3191;
        return c9378 != null && c9378.m24699().m49851(C6382.f21563);
    }

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final String m3444() {
        return this.f3182;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3432(AbstractC9051 abstractC9051) {
        ArrayList arrayList = this.f3173;
        int iIndexOf = arrayList.indexOf(abstractC9051);
        boolean z = false;
        C11972.m30026(iIndexOf != -1);
        int i = this.f3172;
        LinkedList linkedList = this.f3175;
        if (iIndexOf == i) {
            String str = (String) linkedList.pop();
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (i2 != this.f3172 && ((AbstractC9051) arrayList.get(i2)).m24161().equals(str)) {
                    m3357(i2, false, true);
                    break;
                }
            }
            if (iIndexOf == this.f3172) {
                m3357(0, false, true);
            }
            C11972.m30026(iIndexOf != this.f3172);
        }
        ComponentCallbacksC11612 componentCallbacksC11612M10493 = m11155().m10493(abstractC9051.m24161());
        if (componentCallbacksC11612M10493 != null) {
            C11972.m30026(abstractC9051 == componentCallbacksC11612M10493);
            AbstractC4573 abstractC4573M10492 = m11155().m10492();
            abstractC4573M10492.mo14360(abstractC9051);
            abstractC4573M10492.mo14363();
        } else {
            if (!abstractC9051.isAdded() && !abstractC9051.isDetached()) {
                z = true;
            }
            C11972.m30026(z);
        }
        linkedList.removeAll(Collections.singleton(((AbstractC9051) arrayList.remove(iIndexOf)).m24161()));
        int i3 = this.f3172;
        if (iIndexOf < i3) {
            this.f3172 = i3 - 1;
            m3408();
        }
        m3423();
        this.f3189.notifyItemRemoved(iIndexOf);
        C9378 c9378M3442 = m3442();
        abstractC9051.m24173(c9378M3442).m24697();
        C24238.m54225(abstractC9051.m24166(c9378M3442).m24699()).m52938((InterfaceC25138) new C15127());
        abstractC9051.m24162(c9378M3442).m24697();
        m3355();
    }

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final void m3445() {
        if (this.f3181 == null) {
            return;
        }
        m3359(new C5433(0, this));
    }

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final void m3447() {
        if (this.f3179 == null) {
            return;
        }
        m3359(new C19603(0, this));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m3359(Function function) {
        int i = this.f3172;
        ArrayList arrayList = this.f3173;
        AbstractC9051 abstractC9051 = (AbstractC9051) arrayList.get(i);
        ArrayList<AbstractC9051> arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC9051 abstractC9052 = (AbstractC9051) it.next();
            if (((Boolean) function.apply(abstractC9052)).booleanValue()) {
                if (abstractC9051 == abstractC9052) {
                    abstractC9051 = null;
                }
                arrayList2.add(abstractC9052);
                arrayList3.add(abstractC9052.m24161());
                it.remove();
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        this.f3175.removeAll(arrayList3);
        if (abstractC9051 == null) {
            this.f3172 = 0;
        } else {
            this.f3172 = arrayList.indexOf(abstractC9051);
        }
        m3423();
        C9378 c9378M3442 = m3442();
        AbstractC3191 abstractC3191M11155 = m11155();
        AbstractC4573 abstractC4573M10492 = abstractC3191M11155.m10492();
        for (AbstractC9051 abstractC9053 : arrayList2) {
            ComponentCallbacksC11612 componentCallbacksC11612M10493 = abstractC3191M11155.m10493(abstractC9053.m24161());
            if (componentCallbacksC11612M10493 != null) {
                C11972.m30026(abstractC9053 == componentCallbacksC11612M10493);
                abstractC4573M10492.mo14360(abstractC9053);
            } else {
                C11972.m30026((abstractC9053.isAdded() || abstractC9053.isDetached()) ? false : true);
            }
            abstractC9053.m24173(c9378M3442).m24697();
            C24238.m54225(abstractC9053.m24166(c9378M3442).m24699()).m52938((InterfaceC25138) new C2402());
            abstractC9053.m24162(c9378M3442).m24697();
        }
        abstractC4573M10492.mo14359();
        m3355();
        this.f3189.notifyDataSetChanged();
        m3408();
    }

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    private void m3423() {
        String strM24161 = ((AbstractC9051) this.f3173.get(this.f3172)).m24161();
        LinkedList linkedList = this.f3175;
        linkedList.push(strM24161);
        Iterator it = linkedList.iterator();
        String str = null;
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str != null && str.equals(str2)) {
                it.remove();
            } else {
                str = str2;
            }
        }
        linkedList.pop();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m3419(ActivityC0848 activityC0848, AbstractC9051 abstractC9051) {
        int iIndexOf = activityC0848.f3173.indexOf(abstractC9051);
        if (iIndexOf != -1) {
            activityC0848.m3357(iIndexOf, true, false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m3363(ActivityC0848 activityC0848, int i, boolean z) {
        activityC0848.m3357(i, z, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m3357(int i, boolean z, boolean z2) {
        InputMethodManager inputMethodManager;
        InterfaceC19777 interfaceC19777Mo1447;
        if (i >= 0) {
            ArrayList arrayList = this.f3173;
            if (i < arrayList.size()) {
                AbstractC3191 abstractC3191M11155 = m11155();
                if (abstractC3191M11155.m10487() || abstractC3191M11155.m10467()) {
                    return;
                }
                int i2 = this.f3172;
                if (i2 != i) {
                    AbstractC9051 abstractC9051 = (AbstractC9051) arrayList.get(i2);
                    AbstractC9051 abstractC9052 = (AbstractC9051) arrayList.get(i);
                    if (!z2 && (interfaceC19777Mo1447 = abstractC9051.mo1447()) != null) {
                        if (this.f3178.m30725()) {
                            this.f3178.m30723(new RunnableC13526(3, interfaceC19777Mo1447));
                        } else {
                            interfaceC19777Mo1447.mo34769();
                            this.f3178.m30723(new RunnableC4719(0, interfaceC19777Mo1447));
                        }
                    }
                    AbstractC4573 abstractC4573M10492 = abstractC3191M11155.m10492();
                    if (this.f3172 < i) {
                        abstractC4573M10492.m14352(R.anim.MT_Protector, R.anim.MT_Protector);
                    } else {
                        abstractC4573M10492.m14352(R.anim.MT_Protector, R.anim.MT_Protector);
                    }
                    if (abstractC9051.mo24168()) {
                        abstractC4573M10492.mo14348(abstractC9051);
                    } else {
                        abstractC4573M10492.mo14365((ComponentCallbacksC11612) abstractC9051);
                    }
                    if (abstractC9052.isAdded()) {
                        abstractC4573M10492.mo14364(abstractC9052);
                    } else if (abstractC9052.isDetached()) {
                        abstractC4573M10492.m14356((ComponentCallbacksC11612) abstractC9052);
                    } else {
                        abstractC4573M10492.m14357(abstractC9052, abstractC9052.m24161());
                    }
                    abstractC4573M10492.mo14359();
                    this.f3172 = i;
                    m3408();
                    this.f3189.notifyDataSetChanged();
                    if (abstractC9051.mo1433() && !abstractC9052.mo1433() && (inputMethodManager = (InputMethodManager) getApplicationContext().getSystemService("input_method")) != null) {
                        inputMethodManager.hideSoftInputFromWindow(getWindow().getDecorView().getWindowToken(), 0);
                    }
                    if (z) {
                        C11972.m30026(!z2);
                        String strM24161 = abstractC9051.m24161();
                        LinkedList linkedList = this.f3175;
                        linkedList.push(strM24161);
                        while (linkedList.size() > 5) {
                            linkedList.remove(linkedList.size() - 2);
                        }
                        return;
                    }
                    return;
                }
                ((AbstractC9051) arrayList.get(i2)).mo1448();
                return;
            }
        }
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3431(String str, C15301 c15301) {
        C20283 c20283 = this.f3179;
        C16332 c16332 = null;
        if (c20283 != null) {
            try {
                if (!c20283.m46617(str)) {
                    throw new C3090("Class not found: " + str.replace('/', '.'));
                }
            } catch (IOException e) {
                m40401(e, (DialogInterface.OnDismissListener) null);
                return;
            }
        }
        ArrayList arrayList = this.f3173;
        int size = arrayList.size();
        int iM3409 = 0;
        while (true) {
            if (iM3409 >= size) {
                iM3409 = -1;
                break;
            }
            AbstractC9051 abstractC9051 = (AbstractC9051) arrayList.get(iM3409);
            if (abstractC9051 instanceof C16332) {
                C16332 c16333 = (C16332) abstractC9051;
                if (str.equals(c16333.m38820())) {
                    c16332 = c16333;
                    break;
                }
            }
            iM3409++;
        }
        if (c16332 == null) {
            c16332 = new C16332();
            c16332.m38822(str);
            iM3409 = m3409(this.f3172 + 1, false);
            arrayList.add(iM3409, c16332);
            m3355();
        }
        c16332.m38819(c15301);
        if (c15301 == null && iM3409 == this.f3172) {
            C22673.m51152(R.string.MT_Protector);
        }
        m3357(iM3409, true, false);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m3452(String str, C15301 c15301) {
        C11967 c11967 = this.f3181;
        C25350 c25350 = null;
        if (c11967 != null) {
            try {
                if (!c11967.m30009(str)) {
                    throw new C3090("Xml not found: " + str);
                }
            } catch (IOException e) {
                m40401(e, (DialogInterface.OnDismissListener) null);
                return;
            }
        }
        ArrayList arrayList = this.f3173;
        int size = arrayList.size();
        int iM3409 = 0;
        while (true) {
            if (iM3409 >= size) {
                iM3409 = -1;
                break;
            }
            AbstractC9051 abstractC9051 = (AbstractC9051) arrayList.get(iM3409);
            if (abstractC9051 instanceof C25350) {
                C25350 c25351 = (C25350) abstractC9051;
                if (str.equals(c25351.m56683())) {
                    c25350 = c25351;
                    break;
                }
            }
            iM3409++;
        }
        if (c25350 == null) {
            c25350 = new C25350();
            c25350.m56682(str);
            iM3409 = m3409(this.f3172 + 1, false);
            arrayList.add(iM3409, c25350);
            m3355();
        }
        c25350.m56679(c15301);
        if (c15301 == null && iM3409 == this.f3172) {
            C22673.m51152(R.string.MT_Protector);
        }
        m3357(iM3409, true, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3429(String str, String str2) {
        C10608 c10608;
        ArrayList arrayList = this.f3173;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c10608 = null;
                i = -1;
                break;
            }
            AbstractC9051 abstractC9051 = (AbstractC9051) arrayList.get(i);
            if (abstractC9051 instanceof C10608) {
                c10608 = (C10608) abstractC9051;
                if (str.equals(c10608.m27091()) && str2.equals(c10608.requireArguments().getString(e.s))) {
                    if (!c10608.m27092()) {
                        break;
                    }
                    c10608.m27089();
                    break;
                }
            }
            i++;
        }
        if (c10608 == null) {
            C10608 c10609 = new C10608();
            c10609.m27090(str, str2);
            int iM3409 = m3409(this.f3172 + 1, false);
            arrayList.add(iM3409, c10609);
            m3355();
            i = iM3409;
        }
        m3357(i, true, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3430(final String str, final String str2, ArrayList arrayList, final boolean z) {
        int iM3410;
        C20283 c20283 = this.f3179;
        if (c20283 == null) {
            return;
        }
        if (str2 != null) {
            m3358(str, str2, Collections.EMPTY_LIST, z);
            return;
        }
        if (!z && (iM3410 = m3410(str, (String) null)) >= 0) {
            m3357(iM3410, true, false);
            return;
        }
        final ArrayList arrayListM46594 = c20283.m46594(str);
        if (arrayListM46594.isEmpty()) {
            m3358(str, str2, Collections.EMPTY_LIST, z);
            return;
        }
        if (arrayList == null) {
            arrayList = arrayListM46594;
        }
        CharSequence[] charSequenceArr = new CharSequence[arrayListM46594.size()];
        final boolean[] zArr = new boolean[arrayListM46594.size()];
        for (int i = 0; i < arrayListM46594.size(); i++) {
            String str3 = (String) arrayListM46594.get(i);
            charSequenceArr[i] = C15306.m36751(str3);
            zArr[i] = arrayList.contains(str3);
        }
        View viewM40395 = m40395(R.layout.MT_Protector);
        final ListView listView = (ListView) viewM40395.findViewById(R.id.MT_Protector);
        C18597.m43179(listView);
        listView.setDivider(null);
        ((TextView) viewM40395.findViewById(R.id.title)).setText(R.string.MT_Protector);
        listView.setAdapter((ListAdapter) new C3831(charSequenceArr, zArr));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: l.ۢۚۧ
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i2, long j) {
                int i3 = ActivityC0848.f3169;
                boolean[] zArr2 = zArr;
                boolean z2 = !zArr2[i2];
                zArr2[i2] = z2;
                ((CheckedTextView) view).setChecked(z2);
            }
        });
        C2361 c2361BuildDialog = buildDialog();
        c2361BuildDialog.m8005(viewM40395);
        c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.֨ۚۧ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                ActivityC0848.m3375(this.f3509, zArr, arrayListM46594, str, str2, z);
            }
        });
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8018(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8016().m22440().setOnClickListener(new View.OnClickListener() { // from class: l.ۡۚۧ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = ActivityC0848.f3169;
                int i3 = 0;
                while (true) {
                    boolean[] zArr2 = zArr;
                    if (i3 >= zArr2.length) {
                        ((BaseAdapter) listView.getAdapter()).notifyDataSetChanged();
                        return;
                    } else {
                        zArr2[i3] = !zArr2[i3];
                        i3++;
                    }
                }
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m3375(ActivityC0848 activityC0848, boolean[] zArr, ArrayList arrayList, String str, String str2, boolean z) {
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < zArr.length; i++) {
            if (zArr[i]) {
                arrayList2.add((String) arrayList.get(i));
            }
        }
        activityC0848.m3358(str, str2, (List) arrayList2, z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m3358(String str, String str2, List list, boolean z) {
        boolean zM1438;
        int iM3410 = m3410(str, str2);
        ArrayList arrayList = this.f3173;
        C0168 c0168 = iM3410 >= 0 ? (C0168) arrayList.get(iM3410) : null;
        if (c0168 == null) {
            C0168 c0169 = new C0168();
            c0169.m1435(str, str2, list);
            iM3410 = m3409(this.f3172 + 1, false);
            arrayList.add(iM3410, c0169);
            zM1438 = true;
        } else {
            zM1438 = c0168.m1438(list, z);
        }
        if (zM1438) {
            m3355();
        }
        m3357(iM3410, true, false);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private int m3410(String str, String str2) {
        ArrayList arrayList = this.f3173;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC9051 abstractC9051 = (AbstractC9051) arrayList.get(i);
            if (abstractC9051 instanceof C0168) {
                C0168 c0168 = (C0168) abstractC9051;
                if (str.equals(c0168.m1441()) && C17359.equals(str2, c0168.requireArguments().getString(e.s))) {
                    return i;
                }
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private int m3409(int i, boolean z) {
        while (true) {
            ArrayList arrayList = this.f3173;
            if (i >= arrayList.size()) {
                break;
            }
            AbstractC9051 abstractC9051 = (AbstractC9051) arrayList.get(i);
            if (!(abstractC9051 instanceof C13831) && !(abstractC9051 instanceof C24406) && !(abstractC9051 instanceof C2776) && (z || !abstractC9051.m24169())) {
                break;
            }
            i++;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public void m3355() {
        int i;
        AbstractC22044 abstractC22044M24694 = m3442().m24694("list");
        C6178 c6178M34975 = C14483.m34975(1736577895);
        for (AbstractC9051 abstractC9051 : this.f3173) {
            if (!(abstractC9051 instanceof C13831) && !(abstractC9051 instanceof C24406)) {
                if (abstractC9051 instanceof C16332) {
                    i = 16;
                } else if (abstractC9051 instanceof C0168) {
                    i = 17;
                } else if (abstractC9051 instanceof C10608) {
                    i = 20;
                } else if (abstractC9051 instanceof C25350) {
                    i = 18;
                } else {
                    if (!(abstractC9051 instanceof C2776)) {
                        throw new RuntimeException(abstractC9051.getClass().getSimpleName());
                    }
                    i = 19;
                }
                c6178M34975.writeByte(i);
                abstractC9051.getClass();
                Parcel parcelObtain = Parcel.obtain();
                abstractC9051.requireArguments().writeToParcel(parcelObtain, 0);
                byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                c6178M34975.m17806(bArrMarshall);
            }
        }
        try {
            abstractC22044M24694.mo49834();
            abstractC22044M24694.m49844(c6178M34975);
        } catch (IOException e) {
            this.f3171.m51299(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public void m3405(boolean z) {
        Class cls;
        C9378 c9378M3442 = m3442();
        AbstractC22044 abstractC22044M24694 = c9378M3442.m24694("list");
        if (abstractC22044M24694.mo2934()) {
            try {
                C20348 c20348 = new C20348(abstractC22044M24694.m49865());
                C17364.m40795((InterfaceC15872) c20348, 1736577895);
                while (c20348.available() > 0) {
                    int i = c20348.readByte() & 255;
                    byte[] bArrM46748 = c20348.m46748();
                    switch (i) {
                        case 16:
                            cls = C16332.class;
                            break;
                        case 17:
                            cls = C0168.class;
                            break;
                        case 18:
                            cls = C25350.class;
                            break;
                        case 19:
                            cls = C2776.class;
                            break;
                        case 20:
                            cls = C10608.class;
                            break;
                        default:
                            throw new RuntimeException("StateType: " + i);
                    }
                    AbstractC9051 abstractC9051 = (AbstractC9051) cls.newInstance();
                    abstractC9051.mo9149(bArrM46748);
                    ComponentCallbacksC11612 componentCallbacksC11612M10493 = m11155().m10493(abstractC9051.m24161());
                    ArrayList arrayList = this.f3173;
                    if (!z) {
                        C11972.m30030(componentCallbacksC11612M10493);
                        arrayList.add(abstractC9051);
                        abstractC9051.m24176(c9378M3442);
                    } else if (componentCallbacksC11612M10493 != null) {
                        arrayList.add((AbstractC9051) componentCallbacksC11612M10493);
                    } else {
                        arrayList.add(abstractC9051);
                        abstractC9051.m24176(c9378M3442);
                    }
                }
            } catch (Exception e) {
                this.f3171.m51299(e);
            }
        }
    }

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final C9378 m3442() {
        C9378 c9378 = this.f3191;
        C17359.requireNonNull(c9378);
        return new C9378(c9378, "state");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3427(MenuItem menuItem) {
        if (C14941.f48783.m55200()) {
            return;
        }
        int itemId = menuItem.getItemId();
        if (itemId == R.id.MT_Protector) {
            this.f3177.m23774(true);
            return;
        }
        if (this.f3177.m23776()) {
            return;
        }
        if (itemId == R.id.MT_Protector) {
            m3451((Runnable) null);
            return;
        }
        if (itemId == R.id.MT_Protector) {
            startActivity(new Intent(this, (Class<?>) ActivityC18143.class));
            return;
        }
        if (itemId == R.id.MT_Protector) {
            m3450();
            return;
        }
        if (itemId == R.id.MT_Protector) {
            new C1176(this, new C12362(this.f3191)).m4347();
            return;
        }
        if (itemId != R.id.MT_Protector) {
            if (itemId == R.id.MT_Protector) {
                m3453(false);
                return;
            }
            return;
        }
        C2361 c2361BuildDialog = buildDialog();
        c2361BuildDialog.m8021(R.string.MT_Protector);
        c2361BuildDialog.m8000(R.string.MT_Protector);
        c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterfaceOnClickListenerC16351(3, this));
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8018(R.string.MT_Protector, new DialogInterfaceOnClickListenerC1704(0, this));
        c2361BuildDialog.m8016();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private String m3379(int i) {
        if (i < 0) {
            return null;
        }
        ArrayList arrayList = this.f3173;
        if (i >= arrayList.size()) {
            return null;
        }
        return C18969.m44060(50, ((AbstractC9051) arrayList.get(i)).mo1445());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C7560 m3412(ActivityC0848 activityC0848, int i) {
        ArrayList arrayList = activityC0848.f3173;
        C7560 c7560 = new C7560();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            AbstractC9051 abstractC9051 = (AbstractC9051) arrayList.get(i2);
            if (abstractC9051.m24167()) {
                c7560.f24927++;
                if (!abstractC9051.mo24170()) {
                    c7560.f24928++;
                }
                if (i2 < i) {
                    c7560.f24925++;
                } else if (i2 > i) {
                    c7560.f24926++;
                }
            }
        }
        return c7560;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m3441(final int i) {
        String strM3379 = m3379(i);
        if (strM3379 == null) {
            return;
        }
        View viewM40395 = m40395(R.layout.MT_Protector);
        ((TextView) viewM40395.findViewById(R.id.MT_Protector)).setText(getString(R.string.MT_Protector, strM3379));
        final CheckBox checkBox = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: l.ۨۚۧ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                ActivityC0848.m3414(this.f39050, i, checkBox);
            }
        };
        C2361 c2361BuildDialog = buildDialog();
        c2361BuildDialog.m8005(viewM40395);
        c2361BuildDialog.m8026(R.string.MT_Protector, onClickListener);
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8016();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m3364(ActivityC0848 activityC0848, CheckBox checkBox) {
        ArrayList arrayList = new ArrayList(activityC0848.f3173);
        C9911.m25735(arrayList, new C21095());
        boolean zIsChecked = checkBox.isChecked();
        LinkedList linkedList = new LinkedList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedList.add(new C0102(activityC0848, linkedList, (AbstractC9051) it.next(), zIsChecked));
        }
        if (linkedList.isEmpty()) {
            return;
        }
        ((C0102) linkedList.removeFirst()).m1202();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m3392(ActivityC0848 activityC0848) {
        for (AbstractC9051 abstractC9051 : new ArrayList(activityC0848.f3173)) {
            if (abstractC9051.m24167() && !abstractC9051.mo24170()) {
                abstractC9051.m24164(activityC0848);
            }
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m3448(final int i) {
        String strM3379 = m3379(i);
        if (strM3379 == null) {
            return;
        }
        View viewM40395 = m40395(R.layout.MT_Protector);
        ((TextView) viewM40395.findViewById(R.id.MT_Protector)).setText(getString(R.string.MT_Protector, strM3379));
        final CheckBox checkBox = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: l.᩵ۚۧ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                ActivityC0848.m3362(this.f65272, i, checkBox);
            }
        };
        C2361 c2361BuildDialog = buildDialog();
        c2361BuildDialog.m8005(viewM40395);
        c2361BuildDialog.m8026(R.string.MT_Protector, onClickListener);
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8016();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m3443(int i) {
        String strM3379 = m3379(i);
        if (strM3379 == null) {
            return;
        }
        View viewM40395 = m40395(R.layout.MT_Protector);
        ((TextView) viewM40395.findViewById(R.id.MT_Protector)).setText(getString(R.string.MT_Protector, strM3379));
        DialogInterfaceOnClickListenerC8621 dialogInterfaceOnClickListenerC8621 = new DialogInterfaceOnClickListenerC8621(this, i, (CheckBox) viewM40395.findViewById(R.id.MT_Protector), 1);
        C2361 c2361BuildDialog = buildDialog();
        c2361BuildDialog.m8005(viewM40395);
        c2361BuildDialog.m8026(R.string.MT_Protector, dialogInterfaceOnClickListenerC8621);
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8016();
    }

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final boolean m3439() {
        for (AbstractC9051 abstractC9051 : new ArrayList(this.f3173)) {
            if ((abstractC9051 instanceof C16332) && abstractC9051.f29441.getBoolean("changed", false)) {
                return true;
            }
            if ((abstractC9051 instanceof C25350) && abstractC9051.f29441.getBoolean("changed", false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m3436(Runnable runnable) {
        if (m3439()) {
            this.f3195.m22049(8388611);
            C2361 c2361BuildDialog = buildDialog();
            c2361BuildDialog.m8021(R.string.MT_Protector);
            c2361BuildDialog.m8000(R.string.MT_Protector);
            c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterfaceOnClickListenerC7410(2, this, runnable));
            c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c2361BuildDialog.m8016();
            return;
        }
        runnable.run();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m3366(ActivityC0848 activityC0848, Runnable runnable) {
        activityC0848.f3195.m22037(8388611);
        activityC0848.m3451(runnable);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m3451(Runnable runnable) {
        LinkedList linkedList = new LinkedList();
        for (AbstractC9051 abstractC9051 : new ArrayList(this.f3173)) {
            if ((abstractC9051 instanceof C16332) && abstractC9051.f29441.getBoolean("changed", false)) {
                linkedList.add(((C16332) abstractC9051).m38821(this));
            } else if ((abstractC9051 instanceof C25350) && abstractC9051.f29441.getBoolean("changed", false)) {
                linkedList.add(((C25350) abstractC9051).m56681(this));
            }
        }
        if (!linkedList.isEmpty()) {
            new C2449(this, linkedList, runnable).m8197();
        } else if (runnable != null) {
            runnable.run();
        } else {
            C22673.m51152(R.string.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final void m3454() {
        C20283 c20283 = this.f3179;
        int i = 1;
        int i2 = 0;
        if (c20283 != null && c20283.m46610().m24694("strings_changed").mo2934()) {
            int i3 = DialogInterfaceC8327.f27315;
            C2361 c2361 = new C2361(this);
            c2361.m8021(R.string.MT_Protector);
            c2361.m8000(R.string.MT_Protector);
            c2361.m8026(R.string.MT_Protector, new DialogInterfaceOnClickListenerC13626(this, i));
            c2361.m8018(R.string.MT_Protector, new DialogInterfaceOnClickListenerC0212(0, this));
            c2361.m8016();
            return;
        }
        C11967 c11967 = this.f3181;
        if (c11967 != null && c11967.m29968().m24694("strings_changed").mo2934()) {
            int i4 = DialogInterfaceC8327.f27315;
            C2361 c2362 = new C2361(this);
            c2362.m8021(R.string.MT_Protector);
            c2362.m8000(R.string.MT_Protector);
            c2362.m8026(R.string.MT_Protector, new DialogInterfaceOnClickListenerC7670(i2, this));
            c2362.m8018(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ᩳۚۧ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i5) {
                    ActivityC0848.m3360(this.f61235);
                }
            });
            c2362.m8016();
            return;
        }
        m3377(false, true);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m3404(ActivityC0848 activityC0848) {
        activityC0848.f3171.m51318(3);
        activityC0848.f3171.m51323();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m3351(ActivityC0848 activityC0848) {
        activityC0848.f3171.m51326(3);
        activityC0848.f3171.m51333();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m3368(ActivityC0848 activityC0848, C6002 c6002) {
        C15301 c15301M36736 = C15301.m36736(c6002.f20535, c6002.f20530);
        c15301M36736.f50017 = false;
        String str = c6002.f20533;
        activityC0848.m3452(str, c15301M36736);
        C11967 c11967 = activityC0848.f3181;
        C17359.requireNonNull(c11967);
        c11967.m29972(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m3360(ActivityC0848 activityC0848) {
        activityC0848.m3377(false, true);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static void m3394(ActivityC0848 activityC0848) {
        activityC0848.m3377(false, true);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m3413(ActivityC0848 activityC0848) {
        activityC0848.m3377(true, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m3377(final boolean z, final boolean z2) {
        m3451(new Runnable() { // from class: l.۫ۚۧ
            @Override // java.lang.Runnable
            public final void run() {
                int i = ActivityC0848.f3169;
                new C22477(this.f41232, z2, z).m8197();
            }
        });
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m3435(String str) {
        for (AbstractC9051 abstractC9051 : this.f3173) {
            if (abstractC9051 instanceof C16332) {
                C16332 c16332 = (C16332) abstractC9051;
                if (c16332.m38820().equals(str)) {
                    return c16332.m38818(this.f3179, this.f3178);
                }
            }
        }
        C20283 c20283 = this.f3179;
        C17359.requireNonNull(c20283);
        return c20283.m46622(str);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m3455(String str) {
        for (AbstractC9051 abstractC9051 : this.f3173) {
            if (abstractC9051 instanceof C25350) {
                C25350 c25350 = (C25350) abstractC9051;
                if (c25350.m56683().equals(str)) {
                    return c25350.m56678(this.f3181, this.f3178);
                }
            }
        }
        C11967 c11967 = this.f3181;
        C17359.requireNonNull(c11967);
        return c11967.m29993(str);
    }

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final void m3450() {
        AbstractC22044 abstractC22044 = C23994.f77638;
        if (!abstractC22044.mo2934()) {
            abstractC22044.mo4274();
        }
        int i = 1;
        while (true) {
            if (!abstractC22044.m49876("Project" + i).mo2934()) {
                C15017 c15017 = new C15017(this, this, abstractC22044);
                c15017.m22945(R.string.MT_Protector);
                c15017.m22924((CharSequence) ("Project" + i));
                c15017.m22918();
                c15017.m22957(6);
                c15017.m22959();
                c15017.m22929(R.string.MT_Protector);
                c15017.m22955(true);
                return;
            }
            i++;
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        this.f3193 = true;
        if (m3446()) {
            try {
                ExecutorService executorService = C5261.f18540;
                final C9378 c9378 = this.f3191;
                C17359.requireNonNull(c9378);
                executorService.submit(new Callable() { // from class: l.᩻ۚۧ
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return Boolean.valueOf(c9378.m24697());
                    }
                }).get(100L, TimeUnit.MILLISECONDS);
            } catch (Exception unused) {
            }
            if (this.f3171.f73838) {
                C21576.m49065(new Intent("ACTION_MT_CLOSE_RESOURCE_QUERIER"));
            }
        }
        super.finish();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m3437(boolean z) {
        if (!z && m3439()) {
            throw new RuntimeException("hasModifiedFiles");
        }
        new C12780(this).m8197();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:77:0x02dd A[PHI: r5 r8 r9 r16 r20
      0x02dd: PHI (r5v4 java.lang.String) = (r5v2 java.lang.String), (r5v2 java.lang.String), (r5v5 java.lang.String) binds: [B:76:0x02db, B:68:0x0284, B:12:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x02dd: PHI (r8v4 short) = (r8v2 short), (r8v3 short), (r8v2 short) binds: [B:76:0x02db, B:68:0x0284, B:12:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x02dd: PHI (r9v4 short) = (r9v2 short), (r9v3 short), (r9v2 short) binds: [B:76:0x02db, B:68:0x0284, B:12:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x02dd: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:76:0x02db, B:68:0x0284, B:12:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x02dd: PHI (r20v33 l.᩸ۧۧ) = (r20v9 l.᩸ۧۧ), (r20v11 l.᩸ۧۧ), (r20v34 l.᩸ۧۧ) binds: [B:76:0x02db, B:68:0x0284, B:12:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0062, code lost:
    
        if (l.RunnableC1848.f6235 != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0082, code lost:
    
        if (l.C2288.f7433 > 0) goto L15;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m3376(l.InterfaceC7206 r25) {
        /*
            Method dump skipped, instruction units count: 1008
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC0848.m3376(l.ۜܳۤ):void");
    }

    /* JADX WARN: Code duplicated, block: B:72:0x026d A[PHI: r6 r14 r15
      0x026d: PHI (r6v3 l.ۡ۫ۧ) = (r6v2 l.ۡ۫ۧ), (r6v1 l.ۡ۫ۧ), (r6v1 l.ۡ۫ۧ), (r6v1 l.ۡ۫ۧ) binds: [B:71:0x026b, B:37:0x012e, B:210:0x026d, B:13:0x00a3] A[DONT_GENERATE, DONT_INLINE]
      0x026d: PHI (r14v4 short[]) = (r14v3 short[]), (r14v2 short[]), (r14v2 short[]), (r14v2 short[]) binds: [B:71:0x026b, B:37:0x012e, B:210:0x026d, B:13:0x00a3] A[DONT_GENERATE, DONT_INLINE]
      0x026d: PHI (r15v4 int) = (r15v3 int), (r15v2 int), (r15v2 int), (r15v2 int) binds: [B:71:0x026b, B:37:0x012e, B:210:0x026d, B:13:0x00a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:83:0x02ee A[PHI: r4
      0x02ee: PHI (r4v3 l.᩵ۗۧ) = (r4v2 l.᩵ۗۧ), (r4v1 l.᩵ۗۧ) binds: [B:81:0x02d6, B:78:0x02d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:87:0x031f  */
    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public void m3458() {
        int iM3169;
        int i;
        int i2;
        int iM2761;
        int i3;
        int i4;
        short[] sArr;
        int iM31610;
        int i5;
        int i6;
        int i7;
        ActivityC0848 activityC0848 = this;
        InterfaceC0085 interfaceC0085 = null;
        AbstractC22044 abstractC22044M29998 = null;
        C20283 c20283 = null;
        AbstractC22044 abstractC22044M24694 = null;
        C9378 c9378M11160 = null;
        boolean z = false;
        Object obj = null;
        String strM6310 = null;
        String strM9486 = null;
        String strM2756 = null;
        int i8 = 0;
        int i9 = 0;
        short s = 0;
        int i10 = -714929025;
        int i11 = C1564.f5401;
        int i12 = C1146.f4234;
        int iM31611 = C0773.m3169("֨ܰ") ^ i11;
        int i13 = ((iM31611 ^ i12) * 18207) ^ 1604693589;
        int i14 = iM31611 ^ 155268263;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i15 = 0;
        int i16 = 0;
        char c = 0;
        short s2 = 0;
        int i17 = 0;
        int i18 = 0;
        C11967 c11967 = null;
        int iM2762 = 0;
        while (true) {
            i10 = i14 ^ (i13 & (((i10 ^ i12) * (-29753)) >> 31));
            switch (i10) {
                case -2052467901:
                case -1037351232:
                    if (abstractC22044M24694 != null) {
                        iM3169 = C0619.m2761("ᩴܶ") ^ i11;
                        i = ((iM3169 ^ i12) * 14815) ^ (-1571622870);
                        i2 = -1362231831;
                    } else {
                        iM3169 = (C0773.m3169("ۧۖ") ^ i12) * (-57);
                        i = ((iM3169 ^ i11) * (-13437)) ^ (-1094607332);
                        i2 = -56693985;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -1989974816:
                case 1215236932:
                    z = false;
                    if (m3446()) {
                        iM3169 = C0773.m3169("ۨܺ") ^ i12;
                        i = ((iM3169 ^ i11) * 13305) ^ (-822297009);
                        i2 = -108143375;
                    } else {
                        iM3169 = C0619.m2761("᩶᩷") ^ i12;
                        i = ((iM3169 ^ i11) * 2467) ^ 86685751;
                        i2 = 2146618558;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -1964683056:
                case 1549601092:
                    if (abstractC22044M29998 != null) {
                        iM3169 = (C0619.m2761("᩸֡") ^ i11) * (-69);
                        i = ((iM3169 ^ i12) * 5141) ^ 436561703;
                        i2 = -1427733077;
                    } else {
                        iM3169 = C0773.m3169("۫ܳ") ^ i12;
                        i = ((iM3169 ^ i11) * (-4025)) ^ (-1377922834);
                        i2 = -646508823;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -1895327456:
                case 170201088:
                    sArr3 = sArr3;
                    interfaceC0085 = interfaceC0085;
                    i17 = i17;
                    i18 = i18;
                    i8 = s2 * 2;
                    if (C1146.f4234 >= 0) {
                        iM2761 = C0619.m2761("ۙܳ") ^ i11;
                        i3 = ((iM2761 ^ i12) * (-29149)) ^ 993242010;
                        i4 = -275043439;
                    } else {
                        iM2761 = (i12 - C0773.m3169("ۤۗ")) * (-49);
                        i3 = ((iM2761 ^ i11) * 8829) ^ (-1882311311);
                        i4 = -1493887126;
                    }
                    i14 = iM2761 ^ i4;
                    i13 = i3;
                    i18 = i18;
                    activityC0848 = this;
                    i17 = i17;
                    interfaceC0085 = interfaceC0085;
                    sArr3 = sArr3;
                    break;
                case -1859066000:
                case -1642453813:
                    sArr3 = sArr3;
                    interfaceC0085 = interfaceC0085;
                    i17 = i17;
                    i18 = i18;
                    i9 = i8 + 1;
                    s = 1;
                    if (C3492.f12043 <= 0) {
                        iM2761 = (C0773.m3169("ۢ۬") + i12) * 43;
                        i3 = ((iM2761 ^ i11) * (-3241)) ^ (-1462691604);
                        i4 = 1490075245;
                    } else {
                        iM2761 = (i11 - C0773.m3169("۠۬")) * 55;
                        i3 = ((iM2761 ^ i12) * (-511)) ^ 875990629;
                        i4 = -1366732560;
                    }
                    i14 = iM2761 ^ i4;
                    i13 = i3;
                    i18 = i18;
                    activityC0848 = this;
                    i17 = i17;
                    interfaceC0085 = interfaceC0085;
                    sArr3 = sArr3;
                    break;
                case -1842674847:
                case 675363755:
                    try {
                        C7543.m20612(activityC0848, interfaceC0085);
                        iM3169 = (C0619.m2761("۟ۙ") + i12) * 11;
                        i = ((iM3169 ^ i11) * (-14929)) ^ (-3161423);
                        i2 = -1932168240;
                        i14 = iM3169 ^ i2;
                    } catch (Throwable th) {
                        int iM31612 = (C0773.m3169("ۜۙ") + i11) * (-99);
                        i = ((iM31612 ^ i12) * 28885) ^ (-1398215486);
                        i14 = iM31612 ^ 1870788404;
                        obj = th;
                    }
                    i13 = i;
                    break;
                case -1812459858:
                case 156165555:
                    C3077.m10039(C0619.m2761(strM6310) ^ 2097278628);
                    break;
                case -1794371240:
                case 998955779:
                    if (C2419.m8174() < 0) {
                        iM3169 = C0619.m2761("ۡᩳ") ^ i12;
                        i = ((iM3169 ^ i11) * 31969) ^ 1481644298;
                        i2 = -59062896;
                        i14 = iM3169 ^ i2;
                        i13 = i;
                    } else {
                        sArr3 = sArr3;
                        interfaceC0085 = interfaceC0085;
                        i17 = i17;
                        i18 = i18;
                        iM2761 = (C0773.m3169("ۢ۬") + i12) * 43;
                        i3 = ((iM2761 ^ i11) * (-3241)) ^ (-1462691604);
                        i4 = 1490075245;
                        i14 = iM2761 ^ i4;
                        i13 = i3;
                        i18 = i18;
                        activityC0848 = this;
                        i17 = i17;
                        interfaceC0085 = interfaceC0085;
                        sArr3 = sArr3;
                    }
                    break;
                case -1756856261:
                case 1256292023:
                    c9378M11160 = c20283.m11160();
                    sArr4 = f3168;
                    i16 = 12;
                    if (C1080.f3865 >= 0) {
                        iM3169 = (i12 - C0773.m3169("᩶ܺ")) * (-29);
                        i = ((iM3169 ^ i11) * 13425) ^ 1683115215;
                        i2 = -1087672333;
                    } else {
                        iM3169 = (C0773.m3169("ۛ۟") + i11) * 27;
                        i = ((iM3169 ^ i12) * 28535) ^ (-1804422064);
                        i2 = 1987985897;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -1751498080:
                case 1647161407:
                    if (C1321.f4751 >= 0) {
                        sArr = sArr3;
                        interfaceC0085 = interfaceC0085;
                        iM31610 = C0773.m3169("ۘ᩻") ^ i11;
                        i5 = ((iM31610 ^ i12) * (-30521)) ^ (-275709746);
                        i6 = -1568333748;
                        i14 = iM31610 ^ i6;
                        activityC0848 = this;
                        InterfaceC0085 interfaceC0086 = interfaceC0085;
                        sArr3 = sArr;
                        i13 = i5;
                        interfaceC0085 = interfaceC0086;
                    } else {
                        iM3169 = (i12 - C0773.m3169("᩶ܺ")) * (-29);
                        i = ((iM3169 ^ i11) * 13425) ^ 1683115215;
                        i2 = -1087672333;
                        i14 = iM3169 ^ i2;
                        i13 = i;
                    }
                    break;
                case -1738166140:
                case -1511544499:
                    abstractC22044M24694 = c9378M11160.m24694(C0862.m3500(sArr4, i16, 19, i15));
                    iM3169 = (C0773.m3169("ۧᩳ") ^ i12) * 97;
                    i = ((iM3169 ^ i11) * (-6223)) ^ 1190117518;
                    i2 = 1538442477;
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -1631616222:
                case -1529465729:
                    i15 = 10006;
                    iM2761 = (i11 - C0773.m3169("ۢܰ")) * q.h;
                    i3 = ((iM2761 ^ i12) * 20987) ^ 2064664467;
                    i4 = -1354363120;
                    i14 = iM2761 ^ i4;
                    i13 = i3;
                    i18 = i18;
                    activityC0848 = this;
                    i17 = i17;
                    interfaceC0085 = interfaceC0085;
                    sArr3 = sArr3;
                    break;
                case -1620990832:
                case 1181629426:
                    C2966.m9668(iM2762 ^ 2125899626);
                    new ViewOnClickListenerC16544(activityC0848);
                    break;
                case -1536623624:
                case -820959358:
                    sArr3 = sArr3;
                    interfaceC0085 = interfaceC0085;
                    i17 = i17;
                    i18 = i18;
                    if (C2966.m9673()) {
                        iM2761 = C0619.m2761("᩵ܰ") ^ i11;
                        i3 = ((iM2761 ^ i12) * (-9725)) ^ 1197532431;
                        i4 = -2017460633;
                    } else {
                        iM2761 = C0619.m2761("ܿۡ") ^ i11;
                        i3 = ((iM2761 ^ i12) * 19197) ^ 1593126394;
                        i4 = 1382354937;
                    }
                    i14 = iM2761 ^ i4;
                    i13 = i3;
                    i18 = i18;
                    activityC0848 = this;
                    i17 = i17;
                    interfaceC0085 = interfaceC0085;
                    sArr3 = sArr3;
                    break;
                case -1523861182:
                case 1762561347:
                    c20283 = activityC0848.f3179;
                    if (c20283 != null) {
                        iM3169 = C0773.m3169("֨ۨ") ^ i11;
                        i = ((iM3169 ^ i12) * 25777) ^ (-1746993875);
                        i2 = -304097336;
                    } else {
                        abstractC22044M24694 = abstractC22044M29998;
                        iM3169 = (C0773.m3169("ۧᩳ") ^ i12) * 97;
                        i = ((iM3169 ^ i11) * (-6223)) ^ 1190117518;
                        i2 = 1538442477;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -1522134210:
                case -47504241:
                    C11967 c11968 = activityC0848.f3181;
                    if (c11968 != null) {
                        int iM2763 = (C0619.m2761("ۡ֨") + i11) * (-27);
                        c11967 = c11968;
                        i13 = ((iM2763 ^ i12) * (-1999)) ^ 1955885756;
                        i14 = iM2763 ^ 1413070095;
                        interfaceC0085 = null;
                    } else {
                        c11967 = c11968;
                        interfaceC0085 = null;
                        abstractC22044M29998 = null;
                        iM3169 = C0619.m2761("ۨ۫") ^ i12;
                        i = ((iM3169 ^ i11) * 28809) ^ 846784726;
                        i2 = 983356369;
                        i14 = iM3169 ^ i2;
                        i13 = i;
                    }
                    break;
                case -1520618724:
                case 429199268:
                    break;
                case -1425081269:
                case 1619845625:
                    activityC0848.m40398(C0773.m3169(strM2756) ^ 2125806541, z);
                    break;
                case -1286914282:
                case -1099849154:
                    activityC0848.m40398(C0619.m2761(strM9486) ^ 2128395690, z);
                    break;
                case -1156439762:
                case 1943430044:
                    sArr3 = sArr3;
                    interfaceC0085 = interfaceC0085;
                    i17 = i17;
                    i18 = i18;
                    sArr2 = f3168;
                    c = 5;
                    if (C1080.f3865 >= 0) {
                        iM2761 = C0619.m2761("֫᩻") ^ i11;
                        i3 = ((iM2761 ^ i12) * (-17039)) ^ (-2017912962);
                        i4 = 195202680;
                    } else {
                        iM2761 = C0773.m3169("ۗ᩶") ^ i12;
                        i3 = ((iM2761 ^ i11) * 32269) ^ (-1795674992);
                        i4 = -1463463915;
                    }
                    i14 = iM2761 ^ i4;
                    i13 = i3;
                    i18 = i18;
                    activityC0848 = this;
                    i17 = i17;
                    interfaceC0085 = interfaceC0085;
                    sArr3 = sArr3;
                    break;
                case -1112180663:
                case -608675457:
                    RunnableC3646.m11813();
                    C0269.m1775();
                    break;
                case -932665545:
                case 1246436373:
                    if (C0773.m3161() == 0) {
                        sArr3 = sArr3;
                        interfaceC0085 = interfaceC0085;
                        i17 = i17;
                        i18 = i18;
                        iM2761 = (C0773.m3169("ۢ۬") + i12) * 43;
                        i3 = ((iM2761 ^ i11) * (-3241)) ^ (-1462691604);
                        i4 = 1490075245;
                        i14 = iM2761 ^ i4;
                        i13 = i3;
                        i18 = i18;
                        activityC0848 = this;
                        i17 = i17;
                        interfaceC0085 = interfaceC0085;
                        sArr3 = sArr3;
                    } else {
                        sArr = sArr3;
                        interfaceC0085 = interfaceC0085;
                        iM31610 = C0773.m3169("ۘ᩻") ^ i11;
                        i5 = ((iM31610 ^ i12) * (-30521)) ^ (-275709746);
                        i6 = -1568333748;
                        i14 = iM31610 ^ i6;
                        activityC0848 = this;
                        InterfaceC0085 interfaceC0087 = interfaceC0085;
                        sArr3 = sArr;
                        i13 = i5;
                        interfaceC0085 = interfaceC0087;
                    }
                    break;
                case -921285523:
                case 651507967:
                    C3077.m10041();
                    if (!C0619.m2763()) {
                        sArr = sArr3;
                        interfaceC0085 = interfaceC0085;
                        iM31610 = C0773.m3169("ۘ᩻") ^ i11;
                        i5 = ((iM31610 ^ i12) * (-30521)) ^ (-275709746);
                        i6 = -1568333748;
                        i14 = iM31610 ^ i6;
                        activityC0848 = this;
                        InterfaceC0085 interfaceC0088 = interfaceC0085;
                        sArr3 = sArr;
                        i13 = i5;
                        interfaceC0085 = interfaceC0088;
                    } else {
                        sArr3 = sArr3;
                        i7 = i18;
                        interfaceC0085 = interfaceC0085;
                        i17 = i17;
                        iM2761 = (C0773.m3169("ۤۙ") + i12) * (-109);
                        i18 = i7;
                        i3 = ((iM2761 ^ i11) * 24509) ^ 345597777;
                        i4 = -1176982678;
                        i14 = iM2761 ^ i4;
                        i13 = i3;
                        i18 = i18;
                        activityC0848 = this;
                        i17 = i17;
                        interfaceC0085 = interfaceC0085;
                        sArr3 = sArr3;
                    }
                    break;
                case -813114243:
                case 1482673690:
                    strM9486 = C2878.m9486(f3168, 31, 3, i15);
                    if (C0773.f2792 > 0) {
                        iM3169 = C0619.m2761("ۙܿ") ^ i11;
                        i = ((iM3169 ^ i12) * 28777) ^ (-1968851033);
                        i2 = -991520757;
                        i14 = iM3169 ^ i2;
                        i13 = i;
                    } else {
                        sArr3 = sArr3;
                        i7 = i18;
                        interfaceC0085 = interfaceC0085;
                        i17 = i17;
                        iM2761 = (C0773.m3169("ۤۙ") + i12) * (-109);
                        i18 = i7;
                        i3 = ((iM2761 ^ i11) * 24509) ^ 345597777;
                        i4 = -1176982678;
                        i14 = iM2761 ^ i4;
                        i13 = i3;
                        i18 = i18;
                        activityC0848 = this;
                        i17 = i17;
                        interfaceC0085 = interfaceC0085;
                        sArr3 = sArr3;
                    }
                    break;
                case -779403873:
                case -732354792:
                    if (C3998.m12930(abstractC22044M24694)) {
                        iM3169 = C0619.m2761("ܿܰ") ^ i11;
                        i = ((iM3169 ^ i12) * 13511) ^ 1468142172;
                        i2 = 122280158;
                    } else {
                        iM3169 = (C0773.m3169("ۧۖ") ^ i12) * (-57);
                        i = ((iM3169 ^ i11) * (-13437)) ^ (-1094607332);
                        i2 = -56693985;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -669896868:
                case 1053014892:
                    RunnableC3055.m9933();
                    C2310.m7813();
                    iM3169 = (i12 - C0773.m3169("᩶ܺ")) * (-29);
                    i = ((iM3169 ^ i11) * 13425) ^ 1683115215;
                    i2 = -1087672333;
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -603084684:
                case 1899341307:
                    if (C2310.f7472 < 0) {
                        iM3169 = (C0619.m2761("۫ۧ") + i11) * (-59);
                        i = ((iM3169 ^ i12) * 23103) ^ (-2108516827);
                        i2 = 2011020262;
                        i14 = iM3169 ^ i2;
                        i13 = i;
                    } else {
                        sArr3 = sArr3;
                        i7 = i18;
                        interfaceC0085 = interfaceC0085;
                        i17 = i17;
                        iM2761 = (C0773.m3169("ۤۙ") + i12) * (-109);
                        i18 = i7;
                        i3 = ((iM2761 ^ i11) * 24509) ^ 345597777;
                        i4 = -1176982678;
                        i14 = iM2761 ^ i4;
                        i13 = i3;
                        i18 = i18;
                        activityC0848 = this;
                        i17 = i17;
                        interfaceC0085 = interfaceC0085;
                        sArr3 = sArr3;
                    }
                    break;
                case -594226303:
                case 1520286342:
                    C2834.m9339(new C5323(activityC0848, abstractC22044M24694));
                    break;
                case -563696759:
                case 1275294752:
                    if (C2310.f7472 < 0) {
                        iM3169 = (i12 - C0773.m3169("᩶ܺ")) * (-29);
                        i = ((iM3169 ^ i11) * 13425) ^ 1683115215;
                        i2 = -1087672333;
                    } else {
                        iM3169 = C0619.m2761("᩺ۨ") ^ i11;
                        i = ((iM3169 ^ i12) * 19357) ^ (-1954765023);
                        i2 = -1292075734;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -525982478:
                case -291802215:
                    sArr3 = sArr3;
                    i7 = i18;
                    interfaceC0085 = interfaceC0085;
                    i17 = i17;
                    iM2762 = C0619.m2761(C3690.m11996(sArr3, i7, i17, i15));
                    if (C1564.f5401 <= 0) {
                        iM2761 = (C0773.m3169("ۤۙ") + i12) * (-109);
                        i18 = i7;
                        i3 = ((iM2761 ^ i11) * 24509) ^ 345597777;
                        i4 = -1176982678;
                    } else {
                        i18 = i7;
                        iM2761 = (C0619.m2761("ܰۡ") + i12) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i3 = ((iM2761 ^ i11) * 1795) ^ 13633302;
                        i4 = 947999839;
                    }
                    i14 = iM2761 ^ i4;
                    i13 = i3;
                    i18 = i18;
                    activityC0848 = this;
                    i17 = i17;
                    interfaceC0085 = interfaceC0085;
                    sArr3 = sArr3;
                    break;
                case -238037452:
                case -61377367:
                    if (C1564.f5401 <= 0) {
                        iM3169 = (C0619.m2761("۫ۧ") + i11) * (-59);
                        i = ((iM3169 ^ i12) * 23103) ^ (-2108516827);
                        i2 = 2011020262;
                    } else {
                        iM3169 = (i12 - C0619.m2761("ܿܳ")) * (-73);
                        i = ((iM3169 ^ i11) * (-4489)) ^ (-198994986);
                        i2 = -785385716;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -235556130:
                case 1594247893:
                    if (C3998.m12930(abstractC22044M29998)) {
                        abstractC22044M24694 = abstractC22044M29998;
                        iM3169 = (C0773.m3169("ۧᩳ") ^ i12) * 97;
                        i = ((iM3169 ^ i11) * (-6223)) ^ 1190117518;
                        i2 = 1538442477;
                    } else {
                        iM3169 = C0773.m3169("۫ܳ") ^ i12;
                        i = ((iM3169 ^ i11) * (-4025)) ^ (-1377922834);
                        i2 = -646508823;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -117742063:
                case 66341527:
                    sArr3 = sArr3;
                    interfaceC0085 = interfaceC0085;
                    i17 = i17;
                    i18 = i18;
                    int i19 = s2 + s;
                    if ((i19 * i19) - i9 >= 0) {
                        iM2761 = C0619.m2761("᩻ܺ") ^ i11;
                        i3 = ((iM2761 ^ i12) * (-17367)) ^ 861189980;
                        i4 = 2059500138;
                    } else {
                        iM2761 = C0619.m2761("ۤܽ") ^ i12;
                        i3 = ((iM2761 ^ i11) * (-31931)) ^ 1910420565;
                        i4 = 347059876;
                    }
                    i14 = iM2761 ^ i4;
                    i13 = i3;
                    i18 = i18;
                    activityC0848 = this;
                    i17 = i17;
                    interfaceC0085 = interfaceC0085;
                    sArr3 = sArr3;
                    break;
                case -110157500:
                case 838970204:
                    AbstractC0641.m2814(activityC0848, obj, interfaceC0085);
                    break;
                case -65269965:
                case 1962642433:
                    sArr3 = sArr3;
                    interfaceC0085 = interfaceC0085;
                    i17 = i17;
                    i18 = i18;
                    if (C2288.m7766()) {
                        iM2761 = (C0619.m2761("ܰۖ") ^ i12) * (-105);
                        i3 = ((iM2761 ^ i11) * (-22997)) ^ 630286591;
                        i4 = 1359162942;
                    } else {
                        iM2761 = (C0773.m3169("ܰܶ") + i11) * 89;
                        i3 = ((iM2761 ^ i12) * 4707) ^ 13380772;
                        i4 = -946827289;
                    }
                    i14 = iM2761 ^ i4;
                    i13 = i3;
                    i18 = i18;
                    activityC0848 = this;
                    i17 = i17;
                    interfaceC0085 = interfaceC0085;
                    sArr3 = sArr3;
                    break;
                case 5613510:
                case 1510919748:
                    i15 = 10904;
                    iM2761 = (i11 - C0773.m3169("ۢܰ")) * q.h;
                    i3 = ((iM2761 ^ i12) * 20987) ^ 2064664467;
                    i4 = -1354363120;
                    i14 = iM2761 ^ i4;
                    i13 = i3;
                    i18 = i18;
                    activityC0848 = this;
                    i17 = i17;
                    interfaceC0085 = interfaceC0085;
                    sArr3 = sArr3;
                    break;
                case 21886623:
                case 2089401326:
                    C1826.m6301();
                    if (C2702.f8586 <= 0) {
                        sArr3 = sArr3;
                        interfaceC0085 = interfaceC0085;
                        i17 = i17;
                        i18 = i18;
                        iM2761 = C0619.m2761("֫᩻") ^ i11;
                        i3 = ((iM2761 ^ i12) * (-17039)) ^ (-2017912962);
                        i4 = 195202680;
                        i14 = iM2761 ^ i4;
                        i13 = i3;
                        i18 = i18;
                        activityC0848 = this;
                        i17 = i17;
                        interfaceC0085 = interfaceC0085;
                        sArr3 = sArr3;
                    } else {
                        iM3169 = (C0619.m2761("۫ۧ") + i11) * (-59);
                        i = ((iM3169 ^ i12) * 23103) ^ (-2108516827);
                        i2 = 2011020262;
                        i14 = iM3169 ^ i2;
                        i13 = i;
                    }
                    break;
                case 84724821:
                case 686950856:
                    strM6310 = C1826.m6310(f3168, 9, 3, i15);
                    if (C3779.f12953 > 0) {
                        iM3169 = (C0773.m3169("ۧܳ") + i12) * 127;
                        i = ((iM3169 ^ i11) * (-2845)) ^ 1118982942;
                        i2 = -2048016799;
                        i14 = iM3169 ^ i2;
                        i13 = i;
                    } else {
                        sArr3 = sArr3;
                        i7 = i18;
                        interfaceC0085 = interfaceC0085;
                        i17 = i17;
                        iM2761 = (C0773.m3169("ۤۙ") + i12) * (-109);
                        i18 = i7;
                        i3 = ((iM2761 ^ i11) * 24509) ^ 345597777;
                        i4 = -1176982678;
                        i14 = iM2761 ^ i4;
                        i13 = i3;
                        i18 = i18;
                        activityC0848 = this;
                        i17 = i17;
                        interfaceC0085 = interfaceC0085;
                        sArr3 = sArr3;
                    }
                    break;
                case 125248779:
                case 1485693110:
                    interfaceC0085 = interfaceC0085;
                    sArr = f3168;
                    i18 = 6;
                    i17 = 3;
                    if (C13473.f42873 != 0) {
                        iM31610 = C0773.m3169("ۘ᩻") ^ i11;
                        i5 = ((iM31610 ^ i12) * (-30521)) ^ (-275709746);
                        i6 = -1568333748;
                    } else {
                        iM31610 = C0773.m3169("ۛ᩵") ^ i12;
                        i5 = ((iM31610 ^ i11) * 6053) ^ 987067708;
                        i6 = 1356829706;
                    }
                    i14 = iM31610 ^ i6;
                    activityC0848 = this;
                    InterfaceC0085 interfaceC0089 = interfaceC0085;
                    sArr3 = sArr;
                    i13 = i5;
                    interfaceC0085 = interfaceC0089;
                    break;
                case 370755470:
                case 415031400:
                    sArr3 = sArr3;
                    interfaceC0085 = interfaceC0085;
                    i17 = i17;
                    i18 = i18;
                    s2 = sArr2[c];
                    if (C0950.f3488 < 0) {
                        iM2761 = C0619.m2761("᩷ܺ") ^ i11;
                        i3 = ((iM2761 ^ i12) * (-1331)) ^ 1782112074;
                        i4 = -174898384;
                        i14 = iM2761 ^ i4;
                        i13 = i3;
                        i18 = i18;
                        activityC0848 = this;
                        i17 = i17;
                        interfaceC0085 = interfaceC0085;
                        sArr3 = sArr3;
                    } else {
                        sArr = sArr3;
                        i18 = i18;
                        i17 = i17;
                        iM31610 = C0773.m3169("ۘ᩻") ^ i11;
                        i5 = ((iM31610 ^ i12) * (-30521)) ^ (-275709746);
                        i6 = -1568333748;
                        i14 = iM31610 ^ i6;
                        activityC0848 = this;
                        InterfaceC0085 interfaceC00810 = interfaceC0085;
                        sArr3 = sArr;
                        i13 = i5;
                        interfaceC0085 = interfaceC00810;
                    }
                    break;
                case 900042161:
                case 1172154061:
                    abstractC22044M29998 = c11967.m29998();
                    iM3169 = C0619.m2761("ۨ۫") ^ i12;
                    i = ((iM3169 ^ i11) * 28809) ^ 846784726;
                    i2 = 983356369;
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case 1240752033:
                case 1486456357:
                    strM2756 = C0619.m2756(f3168, 34, 3, i15);
                    if (C3734.f12817 < 0) {
                        iM3169 = C0619.m2761("֫᩹") ^ i12;
                        i = ((iM3169 ^ i11) * 6345) ^ 2076400741;
                        i2 = 460810343;
                        i14 = iM3169 ^ i2;
                        i13 = i;
                    } else {
                        sArr3 = sArr3;
                        interfaceC0085 = interfaceC0085;
                        i17 = i17;
                        i18 = i18;
                        iM2761 = C0619.m2761("ۙܳ") ^ i11;
                        i3 = ((iM2761 ^ i12) * (-29149)) ^ 993242010;
                        i4 = -275043439;
                        i14 = iM2761 ^ i4;
                        i13 = i3;
                        i18 = i18;
                        activityC0848 = this;
                        i17 = i17;
                        interfaceC0085 = interfaceC0085;
                        sArr3 = sArr3;
                    }
                    break;
                default:
                    if (C7756.m21107(this)) {
                        iM3169 = C0619.m2761("᩷᩶") ^ i11;
                        i = ((iM3169 ^ i12) * (-17755)) ^ 1028779745;
                        i2 = -1509917459;
                    } else {
                        iM3169 = (i12 - C0773.m3169("۟ۗ")) * (-27);
                        i = ((iM3169 ^ i11) * (-8109)) ^ 338833017;
                        i2 = 1259044409;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m3389(ActivityC0848 activityC0848, int i) {
        int iM3409;
        ArrayList arrayList = activityC0848.f3173;
        if (i == -1 || i >= arrayList.size()) {
            return;
        }
        AbstractC9051 abstractC9051 = (AbstractC9051) arrayList.get(i);
        if (abstractC9051.m24169()) {
            iM3409 = activityC0848.m3409(0, false);
            Bundle bundleRequireArguments = abstractC9051.requireArguments();
            C17359.requireNonNull(bundleRequireArguments);
            bundleRequireArguments.putBoolean("top", false);
            while (iM3409 < arrayList.size() && ((AbstractC9051) arrayList.get(iM3409)).m24169()) {
                iM3409++;
            }
        } else {
            int iM34010 = activityC0848.m3409(0, true);
            Bundle bundleRequireArguments2 = abstractC9051.requireArguments();
            C17359.requireNonNull(bundleRequireArguments2);
            bundleRequireArguments2.putBoolean("top", true);
            iM3409 = iM34010;
        }
        if (i != iM3409) {
            AbstractC9051 abstractC9052 = (AbstractC9051) arrayList.get(activityC0848.f3172);
            if (i < iM3409) {
                iM3409--;
            }
            arrayList.remove(i);
            arrayList.add(iM3409, abstractC9051);
            activityC0848.f3172 = arrayList.indexOf(abstractC9052);
            activityC0848.m3408();
        }
        activityC0848.m3355();
        activityC0848.f3189.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public final C22761 m3425() {
        return this.f3171;
    }
}
