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
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import bin.mt.plus.R;
import com.alipay.sdk.m.t.e;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
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

/* JADX INFO: renamed from: l.ۚ᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityC5677 extends AbstractActivityC12483 {

    /* JADX INFO: renamed from: ۗ᩸ܺ, reason: not valid java name and contains not printable characters */
    private static final short[] f19357 = {2068, 24936, 24943, 24936, 24949, 5705, 22625, 26941, -18054, -22690, 19002, -16868, 13767, 13762, 13783, 13762, 13708, 13777, 13766, 13776, 13772, 13782, 13777, 13760, 13766, 13776, 13709, 13762, 13777, 13776, 13760, 24644, -16601, 28597, -24539, 26522, 20200};

    /* JADX INFO: renamed from: ᩻ܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f19358 = 0;

    /* JADX INFO: renamed from: ֡ܰ, reason: not valid java name and contains not printable characters */
    public C17492 f19359;

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public C8229 f19360;

    /* JADX INFO: renamed from: ۘܰ, reason: not valid java name and contains not printable characters */
    public int f19362;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public C14477 f19363;

    /* JADX INFO: renamed from: ۛܰ, reason: not valid java name and contains not printable characters */
    public C6382 f19364;

    /* JADX INFO: renamed from: ۜܰ, reason: not valid java name and contains not printable characters */
    public C6094 f19365;

    /* JADX INFO: renamed from: ۟ܰ, reason: not valid java name and contains not printable characters */
    public C7606 f19366;

    /* JADX INFO: renamed from: ۤܰ, reason: not valid java name and contains not printable characters */
    public C4647 f19369;

    /* JADX INFO: renamed from: ۧܰ, reason: not valid java name and contains not printable characters */
    public C18377 f19370;

    /* JADX INFO: renamed from: ۫ܰ, reason: not valid java name and contains not printable characters */
    public C11546 f19371;

    /* JADX INFO: renamed from: ܶܰ, reason: not valid java name and contains not printable characters */
    public C6938 f19373;

    /* JADX INFO: renamed from: ܺܰ, reason: not valid java name and contains not printable characters */
    public String f19374;

    /* JADX INFO: renamed from: ܽܰ, reason: not valid java name and contains not printable characters */
    public boolean f19375;

    /* JADX INFO: renamed from: ܿܰ, reason: not valid java name and contains not printable characters */
    public TextView f19376;

    /* JADX INFO: renamed from: ᩴܰ, reason: not valid java name and contains not printable characters */
    public boolean f19378;

    /* JADX INFO: renamed from: ᩵ܰ, reason: not valid java name and contains not printable characters */
    public boolean f19379;

    /* JADX INFO: renamed from: ᩶ܰ, reason: not valid java name and contains not printable characters */
    public C13626 f19380;

    /* JADX INFO: renamed from: ᩷ܰ, reason: not valid java name and contains not printable characters */
    public FloatingActionButton f19381;

    /* JADX INFO: renamed from: ᩸ܰ, reason: not valid java name and contains not printable characters */
    public boolean f19382;

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public boolean f19383;

    /* JADX INFO: renamed from: ᩺ܰ, reason: not valid java name and contains not printable characters */
    public C17381 f19384;

    /* JADX INFO: renamed from: ۠ܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f19367 = new ArrayList();

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public LinkedList f19372 = new LinkedList();

    /* JADX INFO: renamed from: ۡܰ, reason: not valid java name and contains not printable characters */
    public C16450 f19368 = new C16450(1, this);

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public final AtomicReference f19361 = new AtomicReference();

    /* JADX INFO: renamed from: ᩳܰ, reason: not valid java name and contains not printable characters */
    public C22959 f19377 = C22959.m50801();

    @Override // l.AbstractActivityC12483
    /* JADX INFO: renamed from: ۡ */
    public final String mo126() {
        return "ProjectActivity";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ Boolean m15582(ActivityC5677 activityC5677, AbstractC22611 abstractC22611) {
        activityC5677.getClass();
        return Boolean.valueOf((abstractC22611 instanceof InterfaceC14850) && ((InterfaceC14850) abstractC22611).mo19345(activityC5677.f19360));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m15588(ActivityC5677 activityC5677, int i, CheckBox checkBox) {
        activityC5677.getClass();
        ArrayList arrayList = new ArrayList(activityC5677.f19367.subList(0, i));
        C23520.m51799(arrayList, new C4597());
        boolean zIsChecked = checkBox.isChecked();
        LinkedList linkedList = new LinkedList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedList.add(new C4971(activityC5677, linkedList, (AbstractC22611) it.next(), zIsChecked));
        }
        if (linkedList.isEmpty()) {
            return;
        }
        ((C4971) linkedList.removeFirst()).m13792();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m15616(ActivityC5677 activityC5677) {
        activityC5677.getClass();
        try {
            C0549.m2560(activityC5677.f19380);
            activityC5677.m15675(true);
        } catch (Throwable th) {
            activityC5677.m31002(th, (DialogInterface.OnDismissListener) null);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m15618(ActivityC5677 activityC5677, int i, CheckBox checkBox) {
        activityC5677.getClass();
        ArrayList arrayList = activityC5677.f19367;
        ArrayList arrayList2 = new ArrayList(arrayList.subList(i + 1, arrayList.size()));
        C23520.m51799(arrayList2, new C9393());
        boolean zIsChecked = checkBox.isChecked();
        LinkedList linkedList = new LinkedList();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            linkedList.add(new C4971(activityC5677, linkedList, (AbstractC22611) it.next(), zIsChecked));
        }
        if (linkedList.isEmpty()) {
            return;
        }
        ((C4971) linkedList.removeFirst()).m13792();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ Boolean m15624(ActivityC5677 activityC5677, AbstractC22611 abstractC22611) {
        activityC5677.getClass();
        return Boolean.valueOf((abstractC22611 instanceof InterfaceC18088) && ((InterfaceC18088) abstractC22611).mo29298(activityC5677.f19365));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m15627(ActivityC5677 activityC5677, int i, CheckBox checkBox) {
        activityC5677.getClass();
        ArrayList arrayList = new ArrayList(activityC5677.f19367);
        arrayList.remove(i);
        C23520.m51799(arrayList, new C16073(1));
        boolean zIsChecked = checkBox.isChecked();
        LinkedList linkedList = new LinkedList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedList.add(new C4971(activityC5677, linkedList, (AbstractC22611) it.next(), zIsChecked));
        }
        if (linkedList.isEmpty()) {
            return;
        }
        ((C4971) linkedList.removeFirst()).m13792();
    }

    @Override // l.AbstractActivityC12483, l.ActivityC4866, l.ActivityC19126, l.ActivityC1086, l.ActivityC16858, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("");
        m31016(R.layout.MT_Protector);
        m31023();
        C14494 onBackPressedDispatcher = getOnBackPressedDispatcher();
        C10243 c10243 = new C10243(this);
        onBackPressedDispatcher.getClass();
        onBackPressedDispatcher.m34905(c10243);
        m31021().m16257(2);
        m15641();
        C6938 c6938 = (C6938) m31016(R.id.MT_Protector);
        this.f41645 = c6938;
        m31004(c6938);
        C6938 c6939 = (C6938) m31016(R.id.MT_Protector);
        this.f19373 = c6939;
        c6939.inflateMenu(R.menu.MT_Protector);
        this.f19371 = new C11546(this.f19373, R.id.MT_Protector, R.id.more);
        MenuItem menuItemFindItem = this.f19373.getMenu().findItem(R.id.MT_Protector);
        this.f19373.setOnMenuItemClickListener(new C11509(0, this));
        this.f19384 = (C17381) m31016(R.id.MT_Protector);
        this.f19381 = (FloatingActionButton) m31016(R.id.MT_Protector);
        m31006(this.f19384, m31016(R.id.MT_Protector), this.f41645, m31016(R.id.MT_Protector), this.f19373, this.f19381);
        this.f19384.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: l.ۖۛۘ
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                ActivityC5677.m15622(this.f8267);
            }
        });
        C2934 c2934 = new C2934(this, this.f19384, this.f41645);
        c2934.m8752().m22295(C20368.f65968.getDefaultColor());
        this.f19384.m40481(c2934);
        c2934.m8754();
        this.f19384.m40481(new C8832(this));
        C18377 c18377 = (C18377) new C16717(this).m39205(C18377.class);
        this.f19370 = c18377;
        C9186 c9186M42624 = c18377.m42624();
        C13638.requireNonNull(menuItemFindItem);
        c9186M42624.m44959(this, new C7905(menuItemFindItem));
        this.f19370.m42622().m44959(this, new InterfaceC10597() { // from class: l.ۚۛۘ
            @Override // l.InterfaceC10597
            /* JADX INFO: renamed from: ۙ */
            public final void mo1473(Object obj) {
                C6094 c6094 = (C6094) obj;
                int i = ActivityC5677.f19358;
                if (c6094 != null) {
                    c6094.m16562(this.f17905);
                }
            }
        });
        this.f19370.m42633(this, this.f19368);
        this.f19370.m42636(this, new C3078(4, this));
        C9186 c9186M42644 = this.f19370.m42644();
        C6938 c69310 = this.f19373;
        C13638.requireNonNull(c69310);
        c9186M42644.m44959(this, new C22092(0, c69310));
        this.f19364 = (C6382) new C16717(this).m39205(C6382.class);
        this.f19366 = new C7606();
        C16737.m39274(new RunnableC0924(0, this), 500L);
        if (getIntent().hasExtra("bundle") && bundle == null) {
            Bundle extras = getIntent().getExtras();
            C13638.requireNonNull(extras);
            bundle = extras.getBundle("bundle");
            getIntent().getExtras().remove("bundle");
            C6171.m17178(this.f19370.m42622().m44956());
            C6171.m17178(this.f19370.m42658().m44956());
        }
        if (bundle != null) {
            this.f19380 = (C13626) bundle.getSerializable("projectRootDir");
            String[] stringArray = bundle.getStringArray("backStack");
            this.f19362 = bundle.getInt("currentFragment", 0);
            this.f19374 = bundle.getString("outputPath", null);
            if (this.f19380 == null || stringArray == null) {
                finish();
                return;
            }
            LinkedList linkedList = this.f19372;
            linkedList.clear();
            Collections.addAll(linkedList, stringArray);
            try {
                m15619(false);
                C6094 c6094 = this.f19365;
                ArrayList arrayList = this.f19367;
                if (c6094 != null) {
                    ComponentCallbacksC22654 componentCallbacksC22654M23119 = m43943().m23119("000000-0000-0000-0000-000000000000");
                    if (componentCallbacksC22654M23119 == null) {
                        componentCallbacksC22654M23119 = new C0906();
                        this.f19362 = 0;
                        AbstractC11447 abstractC11447M23118 = m43943().m23118();
                        abstractC11447M23118.m28566(componentCallbacksC22654M23119, "000000-0000-0000-0000-000000000000");
                        abstractC11447M23118.mo8560();
                    }
                    arrayList.add((AbstractC22611) componentCallbacksC22654M23119);
                }
                if (this.f19360 != null) {
                    ComponentCallbacksC22654 componentCallbacksC22654M231110 = m43943().m23119("000000-0000-0000-0000-000000000001");
                    if (componentCallbacksC22654M231110 == null) {
                        componentCallbacksC22654M231110 = new C16324();
                        if (this.f19365 == null) {
                            this.f19362 = 0;
                            AbstractC11447 abstractC11447M23119 = m43943().m23118();
                            abstractC11447M23119.m28566(componentCallbacksC22654M231110, "000000-0000-0000-0000-000000000001");
                            abstractC11447M23119.mo8560();
                        }
                    }
                    arrayList.add((AbstractC22611) componentCallbacksC22654M231110);
                }
                m15577(true);
                if (this.f19360 == null && m15650() && C9030.stream(arrayList).noneMatch(new C21386(0))) {
                    arrayList.add(1, new C11613());
                    m15610();
                }
                m15637();
                m15612();
            } catch (IOException e) {
                m31003((Throwable) e, true);
            }
            m31016(R.id.MT_Protector).setVisibility(8);
            if (bundle.getBoolean("hideProjectLoadingView", false)) {
                m15681();
                return;
            }
            return;
        }
        new C20826(this).m10243();
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m15622(ActivityC5677 activityC5677) {
        int width = (activityC5677.f19384.getWidth() - activityC5677.f19384.getChildAt(1).getWidth()) - activityC5677.f19381.getWidth();
        int iM33769 = C13932.m33769(36.0f);
        float f = -(width > iM33769 * 2 ? width - iM33769 : width / 2);
        if (activityC5677.f19381.getTranslationX() != f) {
            activityC5677.f19381.setTranslationX(f);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15593(ActivityC5677 activityC5677, String str) {
        ArrayList arrayList = activityC5677.f19367;
        for (int i = 0; i < arrayList.size(); i++) {
            if (((AbstractC22611) arrayList.get(i)).m50129().equals(str)) {
                activityC5677.m15583(i, true, false);
                return;
            }
        }
    }

    @Override // l.AbstractActivityC12483, l.ActivityC4866, l.ActivityC10074, l.ActivityC1086, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m15641();
    }

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    private void m15641() {
        if (getResources().getConfiguration().orientation == 2) {
            m31021().m16253(1);
        } else if (getResources().getConfiguration().orientation == 1) {
            m31021().m16256(1);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15657(CharSequence charSequence) {
        this.f41645.setSubtitle(charSequence);
    }

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final TextView m15670() {
        if (this.f19376 == null) {
            try {
                Field declaredField = C6938.class.getDeclaredField("mSubtitleTextView");
                declaredField.setAccessible(true);
                this.f19376 = (TextView) declaredField.get(this.f41645);
            } catch (Exception unused) {
            }
        }
        return this.f19376;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m15664(int i) {
        C7606 c7606 = this.f19366;
        if (c7606 != null) {
            c7606.m20142(this, i);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final View m15651(int i) {
        C7606 c7606 = this.f19366;
        if (c7606 != null) {
            return c7606.m20141(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final void m15681() {
        View viewM31016 = m31016(R.id.MT_Protector);
        if (viewM31016.getVisibility() != 8) {
            viewM31016.setVisibility(8);
        }
        this.f19379 = true;
    }

    @Override // l.ActivityC4866
    /* JADX INFO: renamed from: ᩴ */
    public final void mo10632() {
        m15662(false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15662(boolean z) {
        C6094 c6094 = this.f19365;
        if (c6094 == null || !c6094.m16549(this, this.f19370)) {
            C8229 c8229 = this.f19360;
            if (c8229 == null || !c8229.m21589(this, this.f19370)) {
                if (z && this.f19377.m50802()) {
                    C15829.m37611(R.string.MT_Protector);
                } else {
                    finish();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final void m15682() {
        C6094 c6094;
        int i = 0;
        boolean z = !(this.f19360 == null || this.f19365 == null) || ((c6094 = this.f19365) != null && c6094.m16556());
        int i2 = DialogInterfaceC19356.f62401;
        C8067 c8067 = new C8067(this);
        c8067.m21274(R.string.MT_Protector);
        c8067.m21253(z ? R.string.MT_Protector : R.string.MT_Protector);
        c8067.m21251(R.string.MT_Protector, new DialogInterfaceOnClickListenerC3746(i, this));
        c8067.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067.m21271(R.string.MT_Protector, new DialogInterfaceOnClickListenerC6569(0, this));
        c8067.m21269();
    }

    @Override // l.ActivityC1086, l.ActivityC16858, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("hideProjectLoadingView", this.f19379);
        bundle.putStringArray("backStack", (String[]) this.f19372.toArray(new String[0]));
        C13626 c13626 = this.f19380;
        if (c13626 != null) {
            bundle.putSerializable("projectRootDir", c13626);
            bundle.putInt("currentFragment", this.f19362);
            bundle.putString("outputPath", this.f19374);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15591(ActivityC5677 activityC5677, Exception exc) {
        activityC5677.m31002(exc, (DialogInterface.OnDismissListener) null);
        if (exc instanceof C4682) {
            C4682 c4682 = (C4682) exc;
            C8500 c8500M22223 = C8500.m22223(c4682.f16563, c4682.f16564);
            c8500M22223.f29474 = false;
            activityC5677.m15660(c4682.m12987(), c8500M22223);
            C6094 c6094 = activityC5677.f19365;
            C13638.requireNonNull(c6094);
            c6094.m16532(c4682.m12987());
            return;
        }
        if (exc instanceof C8563) {
            C8563 c8563 = (C8563) exc;
            C8500 c8500M22224 = C8500.m22223(c8563.f29593, c8563.f29592);
            c8500M22224.f29474 = false;
            activityC5677.m15674(c8563.m22321(), c8500M22224);
            C8229 c8229 = activityC5677.f19360;
            C13638.requireNonNull(c8229);
            c8229.m21575(c8563.m22321());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m15574(ActivityC5677 activityC5677) {
        if (activityC5677.f19360 == null || !activityC5677.f19383) {
            return;
        }
        activityC5677.f19383 = false;
        new C20121(activityC5677, (C4245) activityC5677.getLifecycle()).m10243();
    }

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final void m15679() {
        C14477 c14477 = this.f19363;
        if (c14477 != null) {
            c14477.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m15667() {
        if (this.f19384.m40473(8388611)) {
            this.f19384.m40477(8388611);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public void m15637() {
        this.f19363 = new C14477(this);
        C17492 c17492 = (C17492) findViewById(R.id.MT_Protector);
        this.f19359 = c17492;
        c17492.setAdapter(this.f19363);
        this.f19359.setLayoutManager(new C13115(this));
        this.f19359.getItemAnimator().m5954(200L);
        this.f19359.getItemAnimator().m5952(200L);
        this.f19359.getItemAnimator().m5961(200L);
        this.f19359.getItemAnimator().m5964(200L);
        this.f19381.setOnClickListener(new ViewOnClickListenerC6505(6, this));
        this.f19359.addOnScrollListener(new C0364(this));
        C17492 c17493 = this.f19359;
        C11546 c11546 = this.f19371;
        C13638.requireNonNull(c11546);
        c17493.addOnItemTouchListener(new C9202(c17493, new C1006(c11546)));
        C4647 c4647 = new C4647(new C12360(this));
        this.f19369 = c4647;
        c4647.m12825(this.f19359);
        this.f19371.m28841(this.f19363);
        this.f19371.m28842(this.f19369);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m15620(ActivityC5677 activityC5677, AbstractC22611 abstractC22611) {
        return ((abstractC22611 instanceof C0906) || (abstractC22611 instanceof C16324) || (abstractC22611 instanceof C11613)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public void m15612() {
        boolean zM40473 = this.f19384.m40473(8388611);
        C13115 c13115 = (C13115) this.f19359.getLayoutManager();
        C13638.requireNonNull(c13115);
        int iFindFirstVisibleItemPosition = c13115.findFirstVisibleItemPosition();
        int childCount = c13115.getChildCount() + iFindFirstVisibleItemPosition;
        int i = this.f19362;
        if (i < iFindFirstVisibleItemPosition || i >= childCount) {
            if (this.f19375) {
                return;
            }
            this.f19375 = true;
            if (zM40473) {
                this.f19381.setVisibility(0);
                this.f19381.setAlpha(0.0f);
                ObjectAnimator.ofFloat(this.f19381, "alpha", 0.0f, 1.0f).setDuration(200L).start();
                return;
            }
            return;
        }
        if (this.f19375) {
            this.f19375 = false;
            if (zM40473) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f19381, "alpha", 1.0f, 0.0f);
                objectAnimatorOfFloat.addListener(new C17298(this));
                objectAnimatorOfFloat.setDuration(200L).start();
            }
        }
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static void m15606(ActivityC5677 activityC5677) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        boolean z2 = true;
        for (AbstractC20745 abstractC20745 : C11904.f39941.mo33983(true)) {
            if (abstractC20745.getName().endsWith(".project") && abstractC20745.mo33974()) {
                arrayList.add(abstractC20745);
            }
        }
        int i = 0;
        if (!arrayList.isEmpty()) {
            C4716.f16636.submit(new RunnableC10098(i, arrayList));
        }
        activityC5677.f19380 = new C13626(C11904.f39941.m46688(".project"));
        Bundle extras = activityC5677.getIntent().getExtras();
        C13638.requireNonNull(extras);
        if (extras.containsKey("dexFiles")) {
            ArrayList arrayList2 = new ArrayList();
            C17367 c17367M40440 = C17367.m40440(extras.getByteArray("dexFiles"));
            while (c17367M40440.available() > 0) {
                arrayList2.add(C5553.m15313(c17367M40440.m40458(), new String[0]));
            }
            C23734 c23734 = new C23734();
            C14562.m35035(arrayList2, activityC5677.f19380.m33318(), c23734, new C7275(activityC5677));
            if (c23734.m52266()) {
                activityC5677.m30997(R.string.MT_Protector, activityC5677.getString(R.string.MT_Protector, c23734.toString()), false);
            }
            activityC5677.f19374 = ((AbstractC20745) arrayList2.get(0)).getParent();
            z = true;
        } else {
            z = false;
        }
        if (extras.containsKey("arscFile")) {
            String string = extras.getString("arscFile");
            C13638.requireNonNull(string);
            AbstractC20745 abstractC20745M15313 = C5553.m15313(string, new String[0]);
            C6112.m17078(abstractC20745M15313, activityC5677.f19380.m33318());
            activityC5677.f19383 = true;
            activityC5677.f19374 = abstractC20745M15313.getParent();
        } else {
            z2 = z;
        }
        if (!z2) {
            throw new RuntimeException();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m15650() {
        return this.f19380.m33320("data/resources.arsc").mo33975();
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean m15654() {
        int i;
        if (this.f19360 != null || this.f19382) {
            return true;
        }
        C13626 c13626 = this.f19380;
        if (c13626 == null) {
            return false;
        }
        AbstractC20745 abstractC20745M33320 = c13626.m33320("data/resources.arsc");
        if (!abstractC20745M33320.mo33975()) {
            return false;
        }
        AbstractC8894 abstractC8894M43943 = m43943();
        if (abstractC8894M43943.m23115() || (i = this.f19362) < 0) {
            return false;
        }
        ArrayList arrayList = this.f19367;
        if (i >= arrayList.size()) {
            return false;
        }
        AbstractC22611 abstractC22611 = (AbstractC22611) arrayList.get(this.f19362);
        if (!(abstractC22611 instanceof C11613) || abstractC8894M43943.m23119("000000-0000-0000-0000-000000000001") != null) {
            return false;
        }
        if (!C1709.m5692()) {
            m31018(R.string.MT_Protector);
            return true;
        }
        if (!C1709.m5693()) {
            m31018(R.string.MT_Protector);
            return true;
        }
        this.f19382 = true;
        new C10949(this, abstractC20745M33320, (C11613) abstractC22611).m10243();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m15596(ActivityC5677 activityC5677, C8229 c8229) {
        c8229.m21581(activityC5677, activityC5677.f19368);
        c8229.m21580(activityC5677, new C0392(activityC5677));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public void m15619(boolean z) throws C8142 {
        C13626 c13626 = this.f19380;
        boolean z2 = false;
        boolean z3 = c13626 != null && c13626.m33320("dex").mo33974();
        C13626 c13627 = this.f19380;
        boolean z4 = c13627 != null && c13627.m33320("arsc").mo33974();
        if (!z3 && !z4) {
            throw new C8142("No a dex or arsc project.");
        }
        if (!z) {
            C6094 c6094 = this.f19365;
            if (z3 && c6094 != null) {
                if (!c6094.m47187().equals(this.f19380)) {
                    throw new RuntimeException("dex");
                }
                runOnUiThread(new RunnableC22233(3, this, c6094));
                z3 = false;
            }
            final C8229 c8229 = this.f19360;
            if (!z4 || c8229 == null) {
                z2 = z4;
            } else {
                if (!c8229.m47187().equals(this.f19380)) {
                    throw new RuntimeException("arsc");
                }
                runOnUiThread(new Runnable() { // from class: l.᩷ۛۘ
                    @Override // java.lang.Runnable
                    public final void run() {
                        ActivityC5677 activityC5677 = this.f67268;
                        c8229.m21581(activityC5677, activityC5677.f19368);
                    }
                });
            }
            if (!z3 && !z2) {
                this.f19370.m42624().mo23641(Boolean.valueOf(m15649()));
                this.f19370.m42644().mo23641((Object) (m15649() ? getString(R.string.MT_Protector) : this.f19380.getName()));
                return;
            }
            z4 = z2;
        }
        if (z3) {
            C6094 c6094M16518 = C6094.m16518(this.f19380);
            this.f19365 = c6094M16518;
            runOnUiThread(new RunnableC19976(0, this, c6094M16518));
            this.f19370.m42622().mo23641(c6094M16518);
        }
        if (z4) {
            C8229 c8229M21560 = C8229.m21560(this.f19380);
            this.f19360 = c8229M21560;
            runOnUiThread(new RunnableC7228(2, this, c8229M21560));
            this.f19370.m42658().mo23641(c8229M21560);
        }
        this.f19370.m42624().mo23641(Boolean.valueOf(m15649()));
        this.f19370.m42644().mo23641((Object) (m15649() ? getString(R.string.MT_Protector) : this.f19380.getName()));
    }

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m15649() {
        C13626 c13626 = this.f19380;
        return c13626 != null && c13626.m33318().m46705(C11904.f39941);
    }

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final String m15663() {
        return this.f19374;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15661(AbstractC22611 abstractC22611) {
        ArrayList arrayList = this.f19367;
        int iIndexOf = arrayList.indexOf(abstractC22611);
        boolean z = false;
        C6171.m17176(iIndexOf != -1);
        int i = this.f19362;
        LinkedList linkedList = this.f19372;
        if (iIndexOf == i) {
            String str = (String) linkedList.pop();
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (i2 != this.f19362 && ((AbstractC22611) arrayList.get(i2)).m50129().equals(str)) {
                    m15583(i2, false, true);
                    break;
                }
            }
            if (iIndexOf == this.f19362) {
                m15583(0, false, true);
            }
            C6171.m17176(iIndexOf != this.f19362);
        }
        ComponentCallbacksC22654 componentCallbacksC22654M23119 = m43943().m23119(abstractC22611.m50129());
        if (componentCallbacksC22654M23119 != null) {
            C6171.m17176(abstractC22611 == componentCallbacksC22654M23119);
            AbstractC11447 abstractC11447M23118 = m43943().m23118();
            abstractC11447M23118.mo8559(abstractC22611);
            abstractC11447M23118.mo8560();
        } else {
            if (!abstractC22611.isAdded() && !abstractC22611.isDetached()) {
                z = true;
            }
            C6171.m17176(z);
        }
        linkedList.removeAll(Collections.singleton(((AbstractC22611) arrayList.remove(iIndexOf)).m50129()));
        int i3 = this.f19362;
        if (iIndexOf < i3) {
            this.f19362 = i3 - 1;
            m15612();
        }
        m15639();
        this.f19363.notifyItemRemoved(iIndexOf);
        C13626 c13626M15676 = m15676();
        abstractC22611.m50132(c13626M15676).m33323();
        C23464.m51710(abstractC22611.m50130(c13626M15676).m33318()).m30022((InterfaceC15954) new C15037(0));
        abstractC22611.m50124(c13626M15676).m33323();
        m15610();
    }

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final void m15655() {
        if (this.f19360 == null) {
            return;
        }
        m15585(new Function() { // from class: l.ᩴۛۘ
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo33696andThen(Function function) {
                return C4277.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ActivityC5677.m15582(this.f59054, (AbstractC22611) obj);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C4277.$default$compose(this, function);
            }
        });
    }

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final void m15672() {
        if (this.f19365 == null) {
            return;
        }
        m15585(new C22798(0, this));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m15585(Function function) {
        int i = this.f19362;
        ArrayList arrayList = this.f19367;
        AbstractC22611 abstractC22611 = (AbstractC22611) arrayList.get(i);
        ArrayList<AbstractC22611> arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC22611 abstractC22612 = (AbstractC22611) it.next();
            if (((Boolean) function.apply(abstractC22612)).booleanValue()) {
                if (abstractC22611 == abstractC22612) {
                    abstractC22611 = null;
                }
                arrayList2.add(abstractC22612);
                arrayList3.add(abstractC22612.m50129());
                it.remove();
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        this.f19372.removeAll(arrayList3);
        if (abstractC22611 == null) {
            this.f19362 = 0;
        } else {
            this.f19362 = arrayList.indexOf(abstractC22611);
        }
        m15639();
        C13626 c13626M15676 = m15676();
        AbstractC8894 abstractC8894M43943 = m43943();
        AbstractC11447 abstractC11447M23118 = abstractC8894M43943.m23118();
        for (AbstractC22611 abstractC22613 : arrayList2) {
            ComponentCallbacksC22654 componentCallbacksC22654M23119 = abstractC8894M43943.m23119(abstractC22613.m50129());
            if (componentCallbacksC22654M23119 != null) {
                C6171.m17176(abstractC22613 == componentCallbacksC22654M23119);
                abstractC11447M23118.mo8559(abstractC22613);
            } else {
                C6171.m17176((abstractC22613.isAdded() || abstractC22613.isDetached()) ? false : true);
            }
            abstractC22613.m50132(c13626M15676).m33323();
            C23464.m51710(abstractC22613.m50130(c13626M15676).m33318()).m30022((InterfaceC15954) new C0219());
            abstractC22613.m50124(c13626M15676).m33323();
        }
        abstractC11447M23118.mo8558();
        m15610();
        this.f19363.notifyDataSetChanged();
        m15612();
    }

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    private void m15639() {
        String strM50129 = ((AbstractC22611) this.f19367.get(this.f19362)).m50129();
        LinkedList linkedList = this.f19372;
        linkedList.push(strM50129);
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

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m15576(ActivityC5677 activityC5677, AbstractC22611 abstractC22611) {
        int iIndexOf = activityC5677.f19367.indexOf(abstractC22611);
        if (iIndexOf != -1) {
            activityC5677.m15583(iIndexOf, true, false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15589(ActivityC5677 activityC5677, int i, boolean z) {
        activityC5677.m15583(i, z, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m15583(int i, boolean z, boolean z2) {
        InputMethodManager inputMethodManager;
        InterfaceC19083 interfaceC19083Mo19340;
        if (i >= 0) {
            ArrayList arrayList = this.f19367;
            if (i < arrayList.size()) {
                AbstractC8894 abstractC8894M43943 = m43943();
                if (abstractC8894M43943.m23132() || abstractC8894M43943.m23115()) {
                    return;
                }
                int i2 = this.f19362;
                if (i2 != i) {
                    AbstractC22611 abstractC22611 = (AbstractC22611) arrayList.get(i2);
                    AbstractC22611 abstractC22612 = (AbstractC22611) arrayList.get(i);
                    if (!z2 && (interfaceC19083Mo19340 = abstractC22611.mo19340()) != null) {
                        if (this.f19364.m17519()) {
                            this.f19364.m17520((Runnable) new RunnableC7981(0, interfaceC19083Mo19340));
                        } else {
                            interfaceC19083Mo19340.mo30475();
                            this.f19364.m17520((Runnable) new RunnableC17940(interfaceC19083Mo19340));
                        }
                    }
                    AbstractC11447 abstractC11447M23118 = abstractC8894M43943.m23118();
                    if (this.f19362 < i) {
                        abstractC11447M23118.m28561(R.anim.MT_Protector, R.anim.MT_Protector);
                    } else {
                        abstractC11447M23118.m28561(R.anim.MT_Protector, R.anim.MT_Protector);
                    }
                    if (abstractC22611.mo3617()) {
                        abstractC11447M23118.mo8552(abstractC22611);
                    } else {
                        abstractC11447M23118.mo8562((ComponentCallbacksC22654) abstractC22611);
                    }
                    if (abstractC22612.isAdded()) {
                        abstractC11447M23118.mo8561(abstractC22612);
                    } else if (abstractC22612.isDetached()) {
                        abstractC11447M23118.m28565((ComponentCallbacksC22654) abstractC22612);
                    } else {
                        abstractC11447M23118.m28566(abstractC22612, abstractC22612.m50129());
                    }
                    abstractC11447M23118.mo8558();
                    this.f19362 = i;
                    m15612();
                    this.f19363.notifyDataSetChanged();
                    if (abstractC22611.mo29300() && !abstractC22612.mo29300() && (inputMethodManager = (InputMethodManager) getApplicationContext().getSystemService("input_method")) != null) {
                        inputMethodManager.hideSoftInputFromWindow(getWindow().getDecorView().getWindowToken(), 0);
                    }
                    if (z) {
                        C6171.m17176(!z2);
                        String strM50129 = abstractC22611.m50129();
                        LinkedList linkedList = this.f19372;
                        linkedList.push(strM50129);
                        while (linkedList.size() > 5) {
                            linkedList.remove(linkedList.size() - 2);
                        }
                        return;
                    }
                    return;
                }
                ((AbstractC22611) arrayList.get(i2)).mo29302();
                return;
            }
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Code duplicated, block: B:105:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:145:0x05af A[PHI: r11 r15 r16 r17 r18 r19 r22
      0x05af: PHI (r11v5 java.lang.String) = (r11v4 java.lang.String), (r11v1 java.lang.String), (r11v1 java.lang.String) binds: [B:10:0x007e, B:144:0x05ad, B:135:0x054a] A[DONT_GENERATE, DONT_INLINE]
      0x05af: PHI (r15v90 short[]) = (r15v8 short[]), (r15v88 short[]), (r15v91 short[]) binds: [B:10:0x007e, B:144:0x05ad, B:135:0x054a] A[DONT_GENERATE, DONT_INLINE]
      0x05af: PHI (r16v2 int) = (r16v1 int), (r16v1 int), (r16v3 int) binds: [B:10:0x007e, B:144:0x05ad, B:135:0x054a] A[DONT_GENERATE, DONT_INLINE]
      0x05af: PHI (r17v2 short) = (r17v1 short), (r17v1 short), (r17v3 short) binds: [B:10:0x007e, B:144:0x05ad, B:135:0x054a] A[DONT_GENERATE, DONT_INLINE]
      0x05af: PHI (r18v4 short[]) = (r18v2 short[]), (r18v3 short[]), (r18v2 short[]) binds: [B:10:0x007e, B:144:0x05ad, B:135:0x054a] A[DONT_GENERATE, DONT_INLINE]
      0x05af: PHI (r19v4 char) = (r19v2 char), (r19v3 char), (r19v2 char) binds: [B:10:0x007e, B:144:0x05ad, B:135:0x054a] A[DONT_GENERATE, DONT_INLINE]
      0x05af: PHI (r22v7 int) = (r22v3 int), (r22v4 int), (r22v8 int) binds: [B:10:0x007e, B:144:0x05ad, B:135:0x054a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:36:0x010f  */
    /* JADX WARN: Code duplicated, block: B:62:0x01f5 A[PHI: r10
      0x01f5: PHI (r10v4 java.lang.String) = (r10v3 java.lang.String), (r10v1 java.lang.String), (r10v1 java.lang.String) binds: [B:61:0x01f3, B:19:0x00ad, B:15:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:84:0x02e4 A[PHI: r4
      0x02e4: PHI (r4v3 l.ۛܰۜ) = (r4v2 l.ۛܰۜ), (r4v1 l.ۛܰۜ) binds: [B:82:0x02ca, B:79:0x02c5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x0317  */
    /* JADX WARN: Code duplicated, block: B:94:0x034e A[PHI: r6 r9 r13 r14
      0x034e: PHI (r6v3 l.ܰۛۘ) = (r6v1 l.ܰۛۘ), (r6v2 l.ܰۛۘ), (r6v1 l.ܰۛۘ), (r6v1 l.ܰۛۘ), (r6v1 l.ܰۛۘ), (r6v1 l.ܰۛۘ) binds: [B:93:0x034c, B:74:0x028f, B:37:0x0127, B:34:0x010b, B:30:0x00ea, B:12:0x0088] A[DONT_GENERATE, DONT_INLINE]
      0x034e: PHI (r9v4 java.lang.String) = 
      (r9v3 java.lang.String)
      (r9v1 java.lang.String)
      (r9v1 java.lang.String)
      (r9v1 java.lang.String)
      (r9v1 java.lang.String)
      (r9v1 java.lang.String)
     binds: [B:93:0x034c, B:74:0x028f, B:37:0x0127, B:34:0x010b, B:30:0x00ea, B:12:0x0088] A[DONT_GENERATE, DONT_INLINE]
      0x034e: PHI (r13v4 short[]) = (r13v2 short[]), (r13v3 short[]), (r13v2 short[]), (r13v2 short[]), (r13v2 short[]), (r13v2 short[]) binds: [B:93:0x034c, B:74:0x028f, B:37:0x0127, B:34:0x010b, B:30:0x00ea, B:12:0x0088] A[DONT_GENERATE, DONT_INLINE]
      0x034e: PHI (r14v4 int) = (r14v2 int), (r14v3 int), (r14v2 int), (r14v2 int), (r14v2 int), (r14v2 int) binds: [B:93:0x034c, B:74:0x028f, B:37:0x0127, B:34:0x010b, B:30:0x00ea, B:12:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public void m15666() {
        int iM11306;
        int i;
        int i2;
        int iM11307;
        int i3;
        int i4;
        int iM45029;
        int i5;
        int i6;
        ActivityC5677 activityC5677 = this;
        InterfaceC21063 interfaceC21063 = null;
        AbstractC20745 abstractC20745M21601 = null;
        C6094 c6094 = null;
        AbstractC20745 abstractC20745M33320 = null;
        C13626 c13626M47187 = null;
        Object obj = null;
        int i7 = 0;
        String strM6241 = null;
        String strM940 = null;
        String strM5344 = null;
        int i8 = 0;
        short s = 0;
        int i9 = 723195380;
        int i10 = AbstractC0464.f2088;
        int i11 = C0629.f2722;
        int iM11308 = ThreadFactoryC3888.m11306("ܶܰ") ^ i11;
        int i12 = ((iM11308 ^ i10) * 7473) ^ 16839363;
        int i13 = iM11308 ^ (-1315138754);
        short[] sArr = null;
        short[] sArr2 = null;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        short s2 = 0;
        int i17 = 0;
        C8229 c8229 = null;
        int i18 = 0;
        short[] sArr3 = null;
        char c = 0;
        while (true) {
            i9 = i13 ^ (i12 & (((i9 ^ i10) * 28645) >> 31));
            switch (i9) {
                case -2120712502:
                case 91418168:
                    C1189.m4360(2125844074 ^ i7);
                    if (C3660.f13403 >= 0) {
                        iM11306 = C19806.m45029("۟᩵") ^ i11;
                        i = ((iM11306 ^ i10) * 30501) ^ (-1539654839);
                        i2 = 494407168;
                    } else {
                        iM11306 = (C19806.m45029("ܽ֫") ^ i11) * (-125);
                        i = ((iM11306 ^ i10) * (-25461)) ^ (-697385250);
                        i2 = 1173005204;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case -2103887922:
                case 1357872541:
                    if (C1148.m4231(abstractC20745M33320)) {
                        iM11306 = (C19806.m45029("ۖܰ") + i10) * 89;
                        i = ((iM11306 ^ i11) * (-8541)) ^ (-1192613532);
                        i2 = 859842593;
                    } else {
                        iM11306 = (i10 - C19806.m45029("᩵ܺ")) * 63;
                        i = ((iM11306 ^ i11) * (-1517)) ^ 1721077858;
                        i2 = 198591553;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case -1990227342:
                case 236401074:
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    if (C1398.f5802 <= 0) {
                        iM11306 = (i10 - ThreadFactoryC3888.m11306("᩺ۛ")) * (-25);
                        i = ((iM11306 ^ i11) * (-18291)) ^ (-759882775);
                        i2 = 52353735;
                    } else {
                        iM11306 = C19806.m45029("۟ۡ") ^ i10;
                        i = ((iM11306 ^ i11) * 3549) ^ 1530721831;
                        i2 = -788000123;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case -1989509568:
                case -1355689542:
                    if (RunnableC1895.f7152) {
                        iM11306 = (i10 - ThreadFactoryC3888.m11306("᩺ۛ")) * (-25);
                        i = ((iM11306 ^ i11) * (-18291)) ^ (-759882775);
                        i2 = 52353735;
                    } else {
                        iM11306 = (C19806.m45029("᩸ۨ") ^ i10) * (-93);
                        i = ((iM11306 ^ i11) * 14041) ^ 756991057;
                        i2 = -135339325;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case -1981943624:
                case 1053368555:
                    if (C6696.m18094(this)) {
                        iM11306 = C19806.m45029("֡۟") ^ i11;
                        i = ((iM11306 ^ i10) * 22213) ^ (-2141402886);
                        i2 = -1883516167;
                    } else {
                        iM11306 = C19806.m45029("۟֡") ^ i10;
                        i = ((iM11306 ^ i11) * 23377) ^ 627047735;
                        i2 = -916025668;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case -1962066596:
                case -1414377977:
                    c6094 = activityC5677.f19365;
                    if (c6094 != null) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۡۤ") + i11) * 63;
                        i = ((iM11306 ^ i10) * 24373) ^ (-1848943925);
                        i2 = -1979032742;
                    } else {
                        abstractC20745M33320 = abstractC20745M21601;
                        iM11306 = (C19806.m45029("֨ۤ") + i10) * 85;
                        i = ((iM11306 ^ i11) * (-9791)) ^ (-725336041);
                        i2 = -1981836362;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case -1915802959:
                case 1791240094:
                    short[] sArr4 = sArr3;
                    int i19 = i17;
                    int i20 = i18;
                    int iM450210 = C19806.m45029(C3722.m10901(sArr4, i20, i19, i14));
                    if (C1937.m6279() >= 0) {
                        i17 = i19;
                        i18 = i20;
                        sArr3 = sArr4;
                        i7 = iM450210;
                        iM45029 = (ThreadFactoryC3888.m11306("᩸᩷") ^ i10) * (-13);
                        i5 = ((iM45029 ^ i11) * 11009) ^ 1579050258;
                        i6 = -857436688;
                        i13 = iM45029 ^ i6;
                        i12 = i5;
                    } else {
                        int iM450211 = (i11 - C19806.m45029("ᩴۜ")) * (-31);
                        i12 = ((iM450211 ^ i10) * (-4433)) ^ (-1048075801);
                        i13 = iM450211 ^ (-1599392668);
                        i18 = i20;
                        sArr3 = sArr4;
                        i7 = iM450210;
                        i17 = i19;
                    }
                    activityC5677 = this;
                    break;
                case -1861950663:
                case 365290143:
                    try {
                        C16125.m38167(activityC5677, interfaceC21063);
                        iM11306 = (i11 - ThreadFactoryC3888.m11306("ܺ᩶")) * (-75);
                        i = ((iM11306 ^ i10) * (-6101)) ^ (-1741595698);
                        i2 = 1335531673;
                        i13 = iM11306 ^ i2;
                    } catch (Throwable th) {
                        int iM450212 = (i10 - C19806.m45029("ܽۘ")) * (-11);
                        i = ((iM450212 ^ i11) * (-9005)) ^ (-639873367);
                        i13 = iM450212 ^ (-1917377895);
                        obj = th;
                    }
                    i12 = i;
                    break;
                case -1663781021:
                case 2061948648:
                    C2332.m7081(new C19415(activityC5677, abstractC20745M33320));
                    break;
                case -1647782843:
                case 375644363:
                    if (C0278.f1572 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۫ܿ") ^ i11) * (-61);
                        i = ((iM11306 ^ i10) * (-26111)) ^ (-1613137652);
                        i2 = 480364971;
                    } else {
                        iM11306 = (C19806.m45029("᩸ۨ") ^ i10) * (-93);
                        i = ((iM11306 ^ i11) * 14041) ^ 756991057;
                        i2 = -135339325;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case -1645464205:
                case 297980390:
                    strM5344 = RunnableC1564.m5344(f19357, 34, 3, i14);
                    if (C2788.f10625 < 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܳ۟") ^ i11;
                        i = ((iM11306 ^ i10) * 3377) ^ 1364128068;
                        i2 = 632492791;
                        i13 = iM11306 ^ i2;
                        i12 = i;
                    } else {
                        sArr3 = sArr3;
                        i17 = i17;
                        iM11307 = ThreadFactoryC3888.m11306("ۚᩳ") ^ i11;
                        i3 = ((iM11307 ^ i10) * (-22435)) ^ 1503474842;
                        i4 = 761625697;
                        i13 = iM11307 ^ i4;
                        i12 = i3;
                        i17 = i17;
                        activityC5677 = this;
                        sArr3 = sArr3;
                    }
                    break;
                case -1594485037:
                case 1418339523:
                    abstractC20745M33320 = c13626M47187.m33320(C3286.m9788(sArr2, i15, 19, i14));
                    iM11306 = (C19806.m45029("֨ۤ") + i10) * 85;
                    i = ((iM11306 ^ i11) * (-9791)) ^ (-725336041);
                    i2 = -1981836362;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case -1561090752:
                case 1188003978:
                    sArr3 = sArr3;
                    i17 = i17;
                    sArr = f19357;
                    c = 5;
                    if (ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                        iM11307 = ThreadFactoryC3888.m11306("ۚᩳ") ^ i11;
                        i3 = ((iM11307 ^ i10) * (-22435)) ^ 1503474842;
                        i4 = 761625697;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("ۜܶ") + i10) * 45;
                        i3 = ((iM11307 ^ i11) * 10063) ^ (-1819095839);
                        i4 = 1461864708;
                    }
                    i13 = iM11307 ^ i4;
                    i12 = i3;
                    i17 = i17;
                    activityC5677 = this;
                    sArr3 = sArr3;
                    break;
                case -1516103644:
                case 1257035965:
                    C2788.m8472();
                    C1148.m4232();
                    iM11306 = (ThreadFactoryC3888.m11306("۫ܿ") ^ i11) * (-61);
                    i = ((iM11306 ^ i10) * (-26111)) ^ (-1613137652);
                    i2 = 480364971;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case -1468335115:
                case -585367612:
                    sArr3 = sArr3;
                    i17 = i17;
                    if (C1461.m5073()) {
                        iM11307 = (C19806.m45029("۬ۡ") ^ i11) * (-3);
                        i3 = ((iM11307 ^ i10) * (-28367)) ^ (-537958895);
                        i4 = 2042724643;
                    } else {
                        iM11307 = (C19806.m45029("۠᩺") ^ i10) * 83;
                        i3 = ((iM11307 ^ i11) * (-2983)) ^ 2139909425;
                        i4 = -1560529226;
                    }
                    i13 = iM11307 ^ i4;
                    i12 = i3;
                    i17 = i17;
                    activityC5677 = this;
                    sArr3 = sArr3;
                    break;
                case -1285686893:
                case -1263980289:
                    if (m15649()) {
                        iM11306 = C19806.m45029("᩷ܺ") ^ i10;
                        i = ((iM11306 ^ i11) * 29935) ^ 404486997;
                        i2 = -980567561;
                    } else {
                        iM11306 = (C19806.m45029("ۤ֫") + i10) * (-33);
                        i = ((iM11306 ^ i11) * (-19099)) ^ (-1700652754);
                        i2 = -1497464190;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case -1251427558:
                case 433609755:
                    if (C1460.f5948 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۫۟") ^ i10) * 47;
                        i = ((iM11306 ^ i11) * 16205) ^ 2094188508;
                        i2 = 1895650208;
                    } else {
                        iM11306 = C19806.m45029("ᩴ᩻") ^ i11;
                        i = ((iM11306 ^ i10) * (-2399)) ^ 769731434;
                        i2 = 84901512;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case -1202417884:
                case -1099222459:
                    C0671.m3019(activityC5677, obj, interfaceC21063);
                    break;
                case -1176498059:
                case -1133291570:
                    sArr3 = sArr3;
                    int i21 = i17;
                    if (C1977.m6366()) {
                        i17 = i21;
                        iM11307 = (i10 - C19806.m45029("ܽۤ")) * (-127);
                        i3 = ((iM11307 ^ i11) * 2053) ^ 179426523;
                        i4 = 1125768724;
                    } else {
                        iM11307 = C19806.m45029("ܰۗ") ^ i10;
                        i17 = i21;
                        i3 = ((iM11307 ^ i11) * (-29895)) ^ (-1299993711);
                        i4 = -1225015399;
                    }
                    i13 = iM11307 ^ i4;
                    i12 = i3;
                    i17 = i17;
                    activityC5677 = this;
                    sArr3 = sArr3;
                    break;
                case -1034463110:
                case 964395995:
                    sArr3 = sArr3;
                    i17 = i17;
                    if (i8 - (s2 * s) < 0) {
                        iM11307 = (C19806.m45029("᩺᩹") + i10) * (-93);
                        i3 = ((iM11307 ^ i11) * 23099) ^ (-432108804);
                        i4 = -1535461906;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("ᩳܽ") ^ i10;
                        i3 = ((iM11307 ^ i11) * (-11199)) ^ (-1195514252);
                        i4 = 322664780;
                    }
                    i13 = iM11307 ^ i4;
                    i12 = i3;
                    i17 = i17;
                    activityC5677 = this;
                    sArr3 = sArr3;
                    break;
                case -950494006:
                case 1222440871:
                    new ViewOnClickListenerC19680(activityC5677);
                    break;
                case -901823366:
                case 18718833:
                    break;
                case -714953812:
                case -291902183:
                    strM6241 = ViewGroupOnHierarchyChangeListenerC1916.m6241(f19357, 9, 3, i14);
                    if (C3743.f13569) {
                        iM11306 = (i11 - C19806.m45029("ۛ۠")) * (-85);
                        i = ((iM11306 ^ i10) * (-13167)) ^ (-1409242131);
                        i2 = 1935755644;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۫ܿ") ^ i11) * (-61);
                        i = ((iM11306 ^ i10) * (-26111)) ^ (-1613137652);
                        i2 = 480364971;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case -633946469:
                case 1684013556:
                    C8229 c82210 = activityC5677.f19360;
                    if (c82210 != null) {
                        int iM450213 = (C19806.m45029("֫۬") ^ i10) * (-37);
                        c8229 = c82210;
                        i12 = ((iM450213 ^ i11) * (-1113)) ^ 1750755054;
                        i13 = iM450213 ^ 1014433932;
                        interfaceC21063 = null;
                    } else {
                        c8229 = c82210;
                        interfaceC21063 = null;
                        abstractC20745M21601 = null;
                        iM11306 = (i11 - ThreadFactoryC3888.m11306("ۖ۬")) * 85;
                        i = ((iM11306 ^ i10) * (-28805)) ^ (-926756169);
                        i2 = -1976257867;
                        i13 = iM11306 ^ i2;
                        i12 = i;
                    }
                    break;
                case -559768023:
                case 1959247151:
                    sArr3 = sArr3;
                    i17 = i17;
                    s2 = sArr[c];
                    i16 = s2 * s2;
                    if (!C0817.f3443) {
                        i17 = i17;
                        sArr3 = sArr3;
                        iM45029 = (ThreadFactoryC3888.m11306("᩸᩷") ^ i10) * (-13);
                        i5 = ((iM45029 ^ i11) * 11009) ^ 1579050258;
                        i6 = -857436688;
                        i13 = iM45029 ^ i6;
                        i12 = i5;
                        activityC5677 = this;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("ܶܺ") ^ i11;
                        i3 = ((iM11307 ^ i10) * (-12387)) ^ (-757555307);
                        i4 = -453527362;
                        i13 = iM11307 ^ i4;
                        i12 = i3;
                        i17 = i17;
                        activityC5677 = this;
                        sArr3 = sArr3;
                    }
                    break;
                case -394518306:
                case 1118885763:
                    c13626M47187 = c6094.m47187();
                    sArr2 = f19357;
                    i15 = 12;
                    if (C1977.m6356()) {
                        iM11306 = (ThreadFactoryC3888.m11306("۫ܿ") ^ i11) * (-61);
                        i = ((iM11306 ^ i10) * (-26111)) ^ (-1613137652);
                        i2 = 480364971;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۖۛ") ^ i11;
                        i = ((iM11306 ^ i10) * 10665) ^ 1260439046;
                        i2 = -1281811246;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case -387332656:
                case 1033149776:
                    strM940 = C0050.m940(f19357, 31, 3, i14);
                    if (C2871.m8646()) {
                        iM11306 = C19806.m45029("ۜۚ") ^ i11;
                        i = ((iM11306 ^ i10) * 27575) ^ 2021784735;
                        i2 = -91938184;
                    } else {
                        iM11306 = (i10 - ThreadFactoryC3888.m11306("᩺ۛ")) * (-25);
                        i = ((iM11306 ^ i11) * (-18291)) ^ (-759882775);
                        i2 = 52353735;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case -370529854:
                case -171137434:
                    activityC5677.m31018(ThreadFactoryC3888.m11306(strM940) ^ 2118228633);
                    break;
                case -297046656:
                case 1109919227:
                    RunnableC0195.m1431();
                    break;
                case -140996930:
                case 1422896320:
                    sArr3 = sArr3;
                    i17 = i17;
                    i8 = i16 + 181360089;
                    s = 26934;
                    if (RunnableC1895.f7152) {
                        iM11307 = (C19806.m45029("ᩳۡ") + i11) * 49;
                        i3 = ((iM11307 ^ i10) * (-29787)) ^ 38571752;
                        i4 = 2068999816;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("ۚᩳ") ^ i11;
                        i3 = ((iM11307 ^ i10) * (-22435)) ^ 1503474842;
                        i4 = 761625697;
                    }
                    i13 = iM11307 ^ i4;
                    i12 = i3;
                    i17 = i17;
                    activityC5677 = this;
                    sArr3 = sArr3;
                    break;
                case -102557005:
                case 1013558239:
                    if (abstractC20745M21601 != null) {
                        iM11306 = (i10 - ThreadFactoryC3888.m11306("ۖۡ")) * (-73);
                        i = ((iM11306 ^ i11) * 3569) ^ 2001480443;
                        i2 = -123265848;
                    } else {
                        iM11306 = (i11 - ThreadFactoryC3888.m11306("ܺܰ")) * (-17);
                        i = ((iM11306 ^ i10) * (-15603)) ^ 46291306;
                        i2 = 1051672782;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case -81158924:
                case 1040859772:
                    if (C1937.m6279() >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۫ܿ") ^ i11) * (-61);
                        i = ((iM11306 ^ i10) * (-26111)) ^ (-1613137652);
                        i2 = 480364971;
                    } else {
                        iM11306 = C19806.m45029("۟᩵") ^ i11;
                        i = ((iM11306 ^ i10) * 30501) ^ (-1539654839);
                        i2 = 494407168;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case -11940343:
                case 2138952598:
                    C1668.m5582(ThreadFactoryC3888.m11306(strM6241) ^ 2099626774);
                    break;
                case 85914609:
                case 1385744459:
                    sArr3 = f19357;
                    i18 = 6;
                    i17 = 3;
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩸᩷") ^ i10) * (-13);
                        i5 = ((iM45029 ^ i11) * 11009) ^ 1579050258;
                        i6 = -857436688;
                    } else {
                        iM45029 = (i10 - C19806.m45029("ۘܰ")) * (-87);
                        i5 = ((iM45029 ^ i11) * (-2701)) ^ (-595856810);
                        i6 = -1669698759;
                    }
                    i13 = iM45029 ^ i6;
                    i12 = i5;
                    activityC5677 = this;
                    break;
                case 94555950:
                case 1359539274:
                    abstractC20745M21601 = c8229.m21601();
                    iM11306 = (i11 - ThreadFactoryC3888.m11306("ۖ۬")) * 85;
                    i = ((iM11306 ^ i10) * (-28805)) ^ (-926756169);
                    i2 = -1976257867;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case 282398862:
                case 327083686:
                    C19806.m45024();
                    if (C0216.f1393 == 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۫ܿ") ^ i11) * (-61);
                        i = ((iM11306 ^ i10) * (-26111)) ^ (-1613137652);
                        i2 = 480364971;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۫۟") ^ i10) * 47;
                        i = ((iM11306 ^ i11) * 16205) ^ 2094188508;
                        i2 = 1895650208;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case 879064823:
                case 884946188:
                    if (C1148.m4231(abstractC20745M21601)) {
                        abstractC20745M33320 = abstractC20745M21601;
                        iM11306 = (C19806.m45029("֨ۤ") + i10) * 85;
                        i = ((iM11306 ^ i11) * (-9791)) ^ (-725336041);
                        i2 = -1981836362;
                    } else {
                        iM11306 = (i11 - ThreadFactoryC3888.m11306("ܺܰ")) * (-17);
                        i = ((iM11306 ^ i10) * (-15603)) ^ 46291306;
                        i2 = 1051672782;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case 920396863:
                case 1790825668:
                    activityC5677.m31018(ThreadFactoryC3888.m11306(strM5344) ^ 2099887783);
                    break;
                case 1184176412:
                case 1961627538:
                    i14 = 6481;
                    iM11307 = (ThreadFactoryC3888.m11306("ۖ᩺") + i11) * (-43);
                    i3 = ((iM11307 ^ i10) * 12763) ^ 589273796;
                    i4 = 1628707724;
                    i13 = iM11307 ^ i4;
                    i12 = i3;
                    i17 = i17;
                    activityC5677 = this;
                    sArr3 = sArr3;
                    break;
                case 1264252225:
                case 1700007996:
                    i14 = 13731;
                    iM11307 = (ThreadFactoryC3888.m11306("ۖ᩺") + i11) * (-43);
                    i3 = ((iM11307 ^ i10) * 12763) ^ 589273796;
                    i4 = 1628707724;
                    i13 = iM11307 ^ i4;
                    i12 = i3;
                    i17 = i17;
                    activityC5677 = this;
                    sArr3 = sArr3;
                    break;
                case 1340268024:
                case 1492614182:
                    C2788.m8472();
                    if (C3660.f13403 >= 0) {
                        sArr3 = sArr3;
                        i17 = i17;
                        iM11307 = ThreadFactoryC3888.m11306("ۚᩳ") ^ i11;
                        i3 = ((iM11307 ^ i10) * (-22435)) ^ 1503474842;
                        i4 = 761625697;
                        i13 = iM11307 ^ i4;
                        i12 = i3;
                        i17 = i17;
                        activityC5677 = this;
                        sArr3 = sArr3;
                    } else {
                        iM11306 = C19806.m45029("۟᩵") ^ i11;
                        i = ((iM11306 ^ i10) * 30501) ^ (-1539654839);
                        i2 = 494407168;
                        i13 = iM11306 ^ i2;
                        i12 = i;
                    }
                    break;
                case 1571960109:
                case 1707340434:
                    if (AbstractC0464.f2088 > 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۫۟") ^ i10) * 47;
                        i = ((iM11306 ^ i11) * 16205) ^ 2094188508;
                        i2 = 1895650208;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶ܳ") ^ i11) * (-65);
                        i = ((iM11306 ^ i10) * 7585) ^ 485818913;
                        i2 = 142637596;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                default:
                    if (abstractC20745M33320 != null) {
                        iM11306 = ThreadFactoryC3888.m11306("ܰܶ") ^ i11;
                        i = ((iM11306 ^ i10) * 25861) ^ 435464234;
                        i2 = 1132481375;
                    } else {
                        iM11306 = (i10 - C19806.m45029("᩵ܺ")) * 63;
                        i = ((iM11306 ^ i11) * (-1517)) ^ 1721077858;
                        i2 = 198591553;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15660(String str, C8500 c8500) {
        C6094 c6094 = this.f19365;
        C23444 c23444 = null;
        if (c6094 != null) {
            try {
                if (!c6094.m16563(str)) {
                    throw new C8142("Class not found: " + str.replace('/', '.'));
                }
            } catch (IOException e) {
                m31002(e, (DialogInterface.OnDismissListener) null);
                return;
            }
        }
        ArrayList arrayList = this.f19367;
        int size = arrayList.size();
        int iM15581 = 0;
        while (true) {
            if (iM15581 >= size) {
                iM15581 = -1;
                break;
            }
            AbstractC22611 abstractC22611 = (AbstractC22611) arrayList.get(iM15581);
            if (abstractC22611 instanceof C23444) {
                C23444 c23445 = (C23444) abstractC22611;
                if (str.equals(c23445.m51659())) {
                    c23444 = c23445;
                    break;
                }
            }
            iM15581++;
        }
        if (c23444 == null) {
            c23444 = new C23444();
            c23444.m51661(str);
            iM15581 = m15581(this.f19362 + 1, false);
            arrayList.add(iM15581, c23444);
            m15610();
        }
        c23444.m51658(c8500);
        if (c8500 == null && iM15581 == this.f19362) {
            C15829.m37611(R.string.MT_Protector);
        }
        m15583(iM15581, true, false);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m15674(String str, C8500 c8500) {
        C8229 c8229 = this.f19360;
        C7236 c7236 = null;
        if (c8229 != null) {
            try {
                if (!c8229.m21609(str)) {
                    throw new C8142("Xml not found: " + str);
                }
            } catch (IOException e) {
                m31002(e, (DialogInterface.OnDismissListener) null);
                return;
            }
        }
        ArrayList arrayList = this.f19367;
        int size = arrayList.size();
        int iM15581 = 0;
        while (true) {
            if (iM15581 >= size) {
                iM15581 = -1;
                break;
            }
            AbstractC22611 abstractC22611 = (AbstractC22611) arrayList.get(iM15581);
            if (abstractC22611 instanceof C7236) {
                C7236 c7237 = (C7236) abstractC22611;
                if (str.equals(c7237.m19346())) {
                    c7236 = c7237;
                    break;
                }
            }
            iM15581++;
        }
        if (c7236 == null) {
            c7236 = new C7236();
            c7236.m19349(str);
            iM15581 = m15581(this.f19362 + 1, false);
            arrayList.add(iM15581, c7236);
            m15610();
        }
        c7236.m19343(c8500);
        if (c8500 == null && iM15581 == this.f19362) {
            C15829.m37611(R.string.MT_Protector);
        }
        m15583(iM15581, true, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15658(String str, String str2) {
        C14895 c14895;
        ArrayList arrayList = this.f19367;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c14895 = null;
                i = -1;
                break;
            }
            AbstractC22611 abstractC22611 = (AbstractC22611) arrayList.get(i);
            if (abstractC22611 instanceof C14895) {
                c14895 = (C14895) abstractC22611;
                if (str.equals(c14895.m35620()) && str2.equals(c14895.requireArguments().getString(e.s))) {
                    if (!c14895.m35619()) {
                        break;
                    }
                    c14895.m35621();
                    break;
                }
            }
            i++;
        }
        if (c14895 == null) {
            C14895 c14896 = new C14895();
            c14896.m35618(str, str2);
            int iM15581 = m15581(this.f19362 + 1, false);
            arrayList.add(iM15581, c14896);
            m15610();
            i = iM15581;
        }
        m15583(i, true, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15659(final String str, final String str2, ArrayList arrayList, final boolean z) {
        int iM15623;
        C6094 c6094 = this.f19365;
        if (c6094 == null) {
            return;
        }
        if (str2 != null) {
            m15584(str, str2, Collections.EMPTY_LIST, z);
            return;
        }
        if (!z && (iM15623 = m15623(str, (String) null)) >= 0) {
            m15583(iM15623, true, false);
            return;
        }
        final ArrayList arrayListM16560 = c6094.m16560(str);
        if (arrayListM16560.isEmpty()) {
            m15584(str, str2, Collections.EMPTY_LIST, z);
            return;
        }
        if (arrayList == null) {
            arrayList = arrayListM16560;
        }
        CharSequence[] charSequenceArr = new CharSequence[arrayListM16560.size()];
        final boolean[] zArr = new boolean[arrayListM16560.size()];
        for (int i = 0; i < arrayListM16560.size(); i++) {
            String str3 = (String) arrayListM16560.get(i);
            charSequenceArr[i] = C22627.m50150(str3);
            zArr[i] = arrayList.contains(str3);
        }
        View viewM30995 = m30995(R.layout.MT_Protector);
        ListView listView = (ListView) viewM30995.findViewById(R.id.MT_Protector);
        C16754.m39314(listView);
        listView.setDivider(null);
        ((TextView) viewM30995.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
        listView.setAdapter((ListAdapter) new C23649(charSequenceArr, zArr));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: l.ۖۧۘ
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i2, long j) {
                int i3 = ActivityC5677.f19358;
                boolean[] zArr2 = zArr;
                boolean z2 = !zArr2[i2];
                zArr2[i2] = z2;
                ((CheckedTextView) view).setChecked(z2);
            }
        });
        C8067 c8067BuildDialog = buildDialog();
        c8067BuildDialog.m21258(viewM30995);
        c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۚۧۘ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                ActivityC5677.m15601(this.f18335, zArr, arrayListM16560, str, str2, z);
            }
        });
        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21271(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21269().m44361().setOnClickListener(new ViewOnClickListenerC22237(zArr, listView, 0));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m15601(ActivityC5677 activityC5677, boolean[] zArr, ArrayList arrayList, String str, String str2, boolean z) {
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < zArr.length; i++) {
            if (zArr[i]) {
                arrayList2.add((String) arrayList.get(i));
            }
        }
        activityC5677.m15584(str, str2, (List) arrayList2, z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m15584(String str, String str2, List list, boolean z) {
        boolean zM29297;
        int iM15623 = m15623(str, str2);
        ArrayList arrayList = this.f19367;
        C11718 c11718 = iM15623 >= 0 ? (C11718) arrayList.get(iM15623) : null;
        if (c11718 == null) {
            C11718 c11719 = new C11718();
            c11719.m29296(str, str2, list);
            iM15623 = m15581(this.f19362 + 1, false);
            arrayList.add(iM15623, c11719);
            zM29297 = true;
        } else {
            zM29297 = c11718.m29297(list, z);
        }
        if (zM29297) {
            m15610();
        }
        m15583(iM15623, true, false);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private int m15623(String str, String str2) {
        ArrayList arrayList = this.f19367;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC22611 abstractC22611 = (AbstractC22611) arrayList.get(i);
            if (abstractC22611 instanceof C11718) {
                C11718 c11718 = (C11718) abstractC22611;
                if (str.equals(c11718.m29301()) && C13638.equals(str2, c11718.requireArguments().getString(e.s))) {
                    return i;
                }
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m15581(int i, boolean z) {
        while (true) {
            ArrayList arrayList = this.f19367;
            if (i >= arrayList.size()) {
                break;
            }
            AbstractC22611 abstractC22611 = (AbstractC22611) arrayList.get(i);
            if (!(abstractC22611 instanceof C0906) && !(abstractC22611 instanceof C16324) && !(abstractC22611 instanceof C11613) && (z || !abstractC22611.m50134())) {
                break;
            }
            i++;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public void m15610() {
        int i;
        AbstractC20745 abstractC20745M33320 = m15676().m33320("list");
        C11018 c11018M43576 = C18917.m43576(1736577895);
        for (AbstractC22611 abstractC22611 : this.f19367) {
            if (!(abstractC22611 instanceof C0906) && !(abstractC22611 instanceof C16324)) {
                if (abstractC22611 instanceof C23444) {
                    i = 16;
                } else if (abstractC22611 instanceof C11718) {
                    i = 17;
                } else if (abstractC22611 instanceof C14895) {
                    i = 20;
                } else if (abstractC22611 instanceof C7236) {
                    i = 18;
                } else {
                    if (!(abstractC22611 instanceof C11613)) {
                        throw new RuntimeException(abstractC22611.getClass().getSimpleName());
                    }
                    i = 19;
                }
                c11018M43576.writeByte(i);
                abstractC22611.getClass();
                Parcel parcelObtain = Parcel.obtain();
                abstractC22611.requireArguments().writeToParcel(parcelObtain, 0);
                byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                c11018M43576.m27794(bArrMarshall);
            }
        }
        try {
            abstractC20745M33320.mo46720();
            abstractC20745M33320.m46697(c11018M43576);
        } catch (IOException e) {
            this.f19370.m42627((Throwable) e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public void m15577(boolean z) {
        Class cls;
        C13626 c13626M15676 = m15676();
        AbstractC20745 abstractC20745M33320 = c13626M15676.m33320("list");
        if (abstractC20745M33320.mo33975()) {
            try {
                C17367 c17367 = new C17367(abstractC20745M33320.m46727());
                C20190.m45649((InterfaceC0433) c17367, 1736577895);
                while (c17367.available() > 0) {
                    int i = c17367.readByte() & 255;
                    byte[] bArrM40451 = c17367.m40451();
                    switch (i) {
                        case 16:
                            cls = C23444.class;
                            break;
                        case 17:
                            cls = C11718.class;
                            break;
                        case 18:
                            cls = C7236.class;
                            break;
                        case 19:
                            cls = C11613.class;
                            break;
                        case 20:
                            cls = C14895.class;
                            break;
                        default:
                            throw new RuntimeException("StateType: " + i);
                    }
                    AbstractC22611 abstractC22611 = (AbstractC22611) cls.newInstance();
                    abstractC22611.mo28945(bArrM40451);
                    ComponentCallbacksC22654 componentCallbacksC22654M23119 = m43943().m23119(abstractC22611.m50129());
                    ArrayList arrayList = this.f19367;
                    if (!z) {
                        C6171.m17178(componentCallbacksC22654M23119);
                        arrayList.add(abstractC22611);
                        abstractC22611.m50123(c13626M15676);
                    } else if (componentCallbacksC22654M23119 != null) {
                        arrayList.add((AbstractC22611) componentCallbacksC22654M23119);
                    } else {
                        arrayList.add(abstractC22611);
                        abstractC22611.m50123(c13626M15676);
                    }
                }
            } catch (Exception e) {
                this.f19370.m42627((Throwable) e);
            }
        }
    }

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final C13626 m15676() {
        C13626 c13626 = this.f19380;
        C13638.requireNonNull(c13626);
        return new C13626(c13626, "state");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15656(MenuItem menuItem) {
        if (C9886.f33734.m50803()) {
            return;
        }
        int itemId = menuItem.getItemId();
        if (itemId == R.id.MT_Protector) {
            this.f19371.m28844(true);
            return;
        }
        if (this.f19371.m28846()) {
            return;
        }
        if (itemId == R.id.MT_Protector) {
            m15673((Runnable) null);
            return;
        }
        if (itemId == R.id.MT_Protector) {
            startActivity(new Intent(this, (Class<?>) ActivityC11632.class));
            return;
        }
        if (itemId == R.id.MT_Protector) {
            m15678();
            return;
        }
        if (itemId == R.id.MT_Protector) {
            new C4452(this, new C0549(this.f19380)).m12422();
            return;
        }
        if (itemId != R.id.MT_Protector) {
            if (itemId == R.id.MT_Protector) {
                m15662(false);
                return;
            }
            return;
        }
        C8067 c8067BuildDialog = buildDialog();
        c8067BuildDialog.m21274(R.string.MT_Protector);
        c8067BuildDialog.m21253(R.string.MT_Protector);
        c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩵ۛۘ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ActivityC5677.m15616(this.f62217);
            }
        });
        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21271(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۡۛۘ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ActivityC5677 activityC5677 = this.f29894;
                new C4452(activityC5677, new C0549(activityC5677.f19380)).m12422();
            }
        });
        c8067BuildDialog.m21269();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private String m15579(int i) {
        if (i < 0) {
            return null;
        }
        ArrayList arrayList = this.f19367;
        if (i >= arrayList.size()) {
            return null;
        }
        return C13012.m32189(50, ((AbstractC22611) arrayList.get(i)).mo3620());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C14145 m15625(ActivityC5677 activityC5677, int i) {
        ArrayList arrayList = activityC5677.f19367;
        C14145 c14145 = new C14145();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            AbstractC22611 abstractC22611 = (AbstractC22611) arrayList.get(i2);
            if (abstractC22611.m50131()) {
                c14145.f46418++;
                if (!abstractC22611.mo19351()) {
                    c14145.f46415++;
                }
                if (i2 < i) {
                    c14145.f46416++;
                } else if (i2 > i) {
                    c14145.f46417++;
                }
            }
        }
        return c14145;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m15671(final int i) {
        String strM15579 = m15579(i);
        if (strM15579 == null) {
            return;
        }
        View viewM30995 = m30995(R.layout.MT_Protector);
        ((TextView) viewM30995.findViewById(R.id.MT_Protector)).setText(getString(R.string.MT_Protector, strM15579));
        final CheckBox checkBox = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: l.᩻ۛۘ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                ActivityC5677.m15627(this.f76089, i, checkBox);
            }
        };
        C8067 c8067BuildDialog = buildDialog();
        c8067BuildDialog.m21258(viewM30995);
        c8067BuildDialog.m21251(R.string.MT_Protector, onClickListener);
        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21269();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m15590(ActivityC5677 activityC5677, CheckBox checkBox) {
        ArrayList arrayList = new ArrayList(activityC5677.f19367);
        C23520.m51799(arrayList, new C3041());
        boolean zIsChecked = checkBox.isChecked();
        LinkedList linkedList = new LinkedList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedList.add(new C4971(activityC5677, linkedList, (AbstractC22611) it.next(), zIsChecked));
        }
        if (linkedList.isEmpty()) {
            return;
        }
        ((C4971) linkedList.removeFirst()).m13792();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m15607(ActivityC5677 activityC5677) {
        for (AbstractC22611 abstractC22611 : new ArrayList(activityC5677.f19367)) {
            if (abstractC22611.m50131() && !abstractC22611.mo19351()) {
                abstractC22611.m50126(activityC5677);
            }
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m15680(final int i) {
        String strM15579 = m15579(i);
        if (strM15579 == null) {
            return;
        }
        View viewM30995 = m30995(R.layout.MT_Protector);
        ((TextView) viewM30995.findViewById(R.id.MT_Protector)).setText(getString(R.string.MT_Protector, strM15579));
        final CheckBox checkBox = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: l.ܿۛۘ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                ActivityC5677.m15588(this.f54707, i, checkBox);
            }
        };
        C8067 c8067BuildDialog = buildDialog();
        c8067BuildDialog.m21258(viewM30995);
        c8067BuildDialog.m21251(R.string.MT_Protector, onClickListener);
        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21269();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m15648(int i) {
        String strM15579 = m15579(i);
        if (strM15579 == null) {
            return;
        }
        View viewM30995 = m30995(R.layout.MT_Protector);
        ((TextView) viewM30995.findViewById(R.id.MT_Protector)).setText(getString(R.string.MT_Protector, strM15579));
        DialogInterfaceOnClickListenerC15119 dialogInterfaceOnClickListenerC15119 = new DialogInterfaceOnClickListenerC15119(this, i, (CheckBox) viewM30995.findViewById(R.id.MT_Protector), 1);
        C8067 c8067BuildDialog = buildDialog();
        c8067BuildDialog.m21258(viewM30995);
        c8067BuildDialog.m21251(R.string.MT_Protector, dialogInterfaceOnClickListenerC15119);
        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21269();
    }

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final boolean m15665() {
        for (AbstractC22611 abstractC22611 : new ArrayList(this.f19367)) {
            if ((abstractC22611 instanceof C23444) && abstractC22611.f73689.getBoolean("changed", false)) {
                return true;
            }
            if ((abstractC22611 instanceof C7236) && abstractC22611.f73689.getBoolean("changed", false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m15669(final Runnable runnable) {
        if (m15665()) {
            this.f19384.m40484(8388611);
            C8067 c8067BuildDialog = buildDialog();
            c8067BuildDialog.m21274(R.string.MT_Protector);
            c8067BuildDialog.m21253(R.string.MT_Protector);
            c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.۬ۛۘ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    ActivityC5677.m15592(this.f42938, runnable);
                }
            });
            c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c8067BuildDialog.m21269();
            return;
        }
        runnable.run();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m15592(ActivityC5677 activityC5677, Runnable runnable) {
        activityC5677.f19384.m40477(8388611);
        activityC5677.m15673(runnable);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m15673(Runnable runnable) {
        LinkedList linkedList = new LinkedList();
        for (AbstractC22611 abstractC22611 : new ArrayList(this.f19367)) {
            if ((abstractC22611 instanceof C23444) && abstractC22611.f73689.getBoolean("changed", false)) {
                linkedList.add(((C23444) abstractC22611).m51660(this));
            } else if ((abstractC22611 instanceof C7236) && abstractC22611.f73689.getBoolean("changed", false)) {
                linkedList.add(((C7236) abstractC22611).m19348(this));
            }
        }
        if (!linkedList.isEmpty()) {
            new C1069(this, linkedList, runnable).m10243();
        } else if (runnable != null) {
            runnable.run();
        } else {
            C15829.m37611(R.string.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m15677() {
        C6094 c6094 = this.f19365;
        int i = 0;
        if (c6094 != null && c6094.m16575().m33320("strings_changed").mo33975()) {
            int i2 = DialogInterfaceC19356.f62401;
            C8067 c8067 = new C8067(this);
            c8067.m21274(R.string.MT_Protector);
            c8067.m21253(R.string.MT_Protector);
            c8067.m21251(R.string.MT_Protector, new DialogInterfaceOnClickListenerC10804(this, i));
            c8067.m21271(R.string.MT_Protector, new DialogInterfaceOnClickListenerC13771(i, this));
            c8067.m21269();
            return;
        }
        C8229 c8229 = this.f19360;
        if (c8229 != null && c8229.m21572().m33320("strings_changed").mo33975()) {
            int i3 = DialogInterfaceC19356.f62401;
            C8067 c8068 = new C8067(this);
            c8068.m21274(R.string.MT_Protector);
            c8068.m21253(R.string.MT_Protector);
            c8068.m21251(R.string.MT_Protector, new DialogInterfaceOnClickListenerC20268(4, this));
            c8068.m21271(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۨۧۘ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i4) {
                    ActivityC5677.m15586(this.f39178);
                }
            });
            c8068.m21269();
            return;
        }
        m15603(false, true);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m15605(ActivityC5677 activityC5677) {
        activityC5677.f19370.m42645(3);
        activityC5677.f19370.m42656();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m15580(ActivityC5677 activityC5677) {
        activityC5677.f19370.m42649(3);
        activityC5677.f19370.m42659();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m15598(ActivityC5677 activityC5677, C18106 c18106) {
        C8500 c8500M22223 = C8500.m22223(c18106.f57915, c18106.f57918);
        c8500M22223.f29474 = false;
        String str = c18106.f57917;
        activityC5677.m15674(str, c8500M22223);
        C8229 c8229 = activityC5677.f19360;
        C13638.requireNonNull(c8229);
        c8229.m21575(str);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static void m15573(ActivityC5677 activityC5677) {
        activityC5677.m15603(false, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15586(ActivityC5677 activityC5677) {
        activityC5677.m15603(false, true);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m15626(ActivityC5677 activityC5677) {
        activityC5677.m15603(true, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m15603(final boolean z, final boolean z2) {
        m15673(new Runnable() { // from class: l.ᩳۛۘ
            @Override // java.lang.Runnable
            public final void run() {
                int i = ActivityC5677.f19358;
                new C21531(this.f56551, z2, z).m10243();
            }
        });
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m15668(String str) {
        for (AbstractC22611 abstractC22611 : this.f19367) {
            if (abstractC22611 instanceof C23444) {
                C23444 c23444 = (C23444) abstractC22611;
                if (c23444.m51659().equals(str)) {
                    return c23444.m51657(this.f19365, this.f19364);
                }
            }
        }
        C6094 c6094 = this.f19365;
        C13638.requireNonNull(c6094);
        return c6094.m16578(str);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m15652(String str) {
        for (AbstractC22611 abstractC22611 : this.f19367) {
            if (abstractC22611 instanceof C7236) {
                C7236 c7236 = (C7236) abstractC22611;
                if (c7236.m19346().equals(str)) {
                    return c7236.m19341(this.f19360, this.f19364);
                }
            }
        }
        C8229 c8229 = this.f19360;
        C13638.requireNonNull(c8229);
        return c8229.m21568(str);
    }

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final void m15678() {
        AbstractC20745 abstractC20745 = C19575.f62891;
        if (!abstractC20745.mo33975()) {
            abstractC20745.mo33987();
        }
        int i = 1;
        while (true) {
            if (!abstractC20745.m46690("Project" + i).mo33975()) {
                C18709 c18709 = new C18709(this, this, abstractC20745);
                c18709.m40376(R.string.MT_Protector);
                c18709.m40346((CharSequence) ("Project" + i));
                c18709.m40340();
                c18709.m40336(6);
                c18709.m40355();
                c18709.m40363(R.string.MT_Protector);
                c18709.m40368(true);
                return;
            }
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:76:0x02e7 A[PHI: r3 r10 r11 r12 r16 r20
      0x02e7: PHI (r3v9 l.ۛۨۨ) = (r3v2 l.ۛۨۨ), (r3v8 l.ۛۨۨ), (r3v2 l.ۛۨۨ) binds: [B:75:0x02e5, B:14:0x0075, B:6:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x02e7: PHI (r10v3 int) = (r10v2 int), (r10v2 int), (r10v6 int) binds: [B:75:0x02e5, B:14:0x0075, B:6:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x02e7: PHI (r11v3 int) = (r11v2 int), (r11v2 int), (r11v6 int) binds: [B:75:0x02e5, B:14:0x0075, B:6:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x02e7: PHI (r12v3 int) = (r12v2 int), (r12v2 int), (r12v6 int) binds: [B:75:0x02e5, B:14:0x0075, B:6:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x02e7: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:75:0x02e5, B:14:0x0075, B:6:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x02e7: PHI (r20v35 l.ᩳ᩻ۘ) = (r20v10 l.ᩳ᩻ۘ), (r20v32 l.ᩳ᩻ۘ), (r20v39 l.ᩳ᩻ۘ) binds: [B:75:0x02e5, B:14:0x0075, B:6:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0071, code lost:
    
        if (l.ThreadFactoryC3888.f14547 <= 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007d, code lost:
    
        if (l.C0050.m946() > 0) goto L17;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m15602(l.InterfaceC6432 r25) {
        /*
            Method dump skipped, instruction units count: 1020
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC5677.m15602(l.ۜ֨ۨ):void");
    }

    @Override // android.app.Activity
    public final void finish() {
        this.f19378 = true;
        if (m15649()) {
            try {
                ExecutorService executorService = C4716.f16636;
                final C13626 c13626 = this.f19380;
                C13638.requireNonNull(c13626);
                executorService.submit(new Callable() { // from class: l.ܺۛۘ
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return Boolean.valueOf(c13626.m33323());
                    }
                }).get(100L, TimeUnit.MILLISECONDS);
            } catch (Exception unused) {
            }
            if (this.f19370.f58604) {
                C16737.m39270(new Intent("ACTION_MT_CLOSE_RESOURCE_QUERIER"));
            }
        }
        super.finish();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m15675(boolean z) {
        if (!z && m15665()) {
            throw new RuntimeException("hasModifiedFiles");
        }
        new C8126(this).m10243();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m15617(ActivityC5677 activityC5677, int i) {
        int iM15581;
        ArrayList arrayList = activityC5677.f19367;
        if (i == -1 || i >= arrayList.size()) {
            return;
        }
        AbstractC22611 abstractC22611 = (AbstractC22611) arrayList.get(i);
        if (abstractC22611.m50134()) {
            iM15581 = activityC5677.m15581(0, false);
            Bundle bundleRequireArguments = abstractC22611.requireArguments();
            C13638.requireNonNull(bundleRequireArguments);
            bundleRequireArguments.putBoolean("top", false);
            while (iM15581 < arrayList.size() && ((AbstractC22611) arrayList.get(iM15581)).m50134()) {
                iM15581++;
            }
        } else {
            int iM15582 = activityC5677.m15581(0, true);
            Bundle bundleRequireArguments2 = abstractC22611.requireArguments();
            C13638.requireNonNull(bundleRequireArguments2);
            bundleRequireArguments2.putBoolean("top", true);
            iM15581 = iM15582;
        }
        if (i != iM15581) {
            AbstractC22611 abstractC22612 = (AbstractC22611) arrayList.get(activityC5677.f19362);
            if (i < iM15581) {
                iM15581--;
            }
            arrayList.remove(i);
            arrayList.add(iM15581, abstractC22611);
            activityC5677.f19362 = arrayList.indexOf(abstractC22612);
            activityC5677.m15612();
        }
        activityC5677.m15610();
        activityC5677.f19363.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final C18377 m15653() {
        return this.f19370;
    }
}
