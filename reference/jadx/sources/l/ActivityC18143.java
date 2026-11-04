package l;

import android.animation.ObjectAnimator;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import bin.mt.plus.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.ܿۛ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 75NJ */
/* JADX INFO: loaded from: classes5.dex */
public class ActivityC18143 extends AbstractActivityC17204 {

    /* JADX INFO: renamed from: ֡᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f59323 = 0;

    /* JADX INFO: renamed from: ۟᩷, reason: not valid java name and contains not printable characters */
    public static final Object f59324 = new Object();

    /* JADX INFO: renamed from: ᩳ᩷, reason: not valid java name and contains not printable characters */
    public static final Object f59325 = new Object();

    /* JADX INFO: renamed from: ۗ᩷, reason: not valid java name and contains not printable characters */
    public FloatingActionButton f59327;

    /* JADX INFO: renamed from: ۘ᩷, reason: not valid java name and contains not printable characters */
    public C8887 f59328;

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public C16390 f59329;

    /* JADX INFO: renamed from: ۛ᩷, reason: not valid java name and contains not printable characters */
    public C13511 f59330;

    /* JADX INFO: renamed from: ۧ᩷, reason: not valid java name and contains not printable characters */
    public boolean f59331;

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public C8147 f59333;

    /* JADX INFO: renamed from: ܰ᩷, reason: not valid java name and contains not printable characters */
    public C12318 f59334;

    /* JADX INFO: renamed from: ܶ᩷, reason: not valid java name and contains not printable characters */
    public C11999 f59336;

    /* JADX INFO: renamed from: ܽ᩷, reason: not valid java name and contains not printable characters */
    public boolean f59338;

    /* JADX INFO: renamed from: ᩵᩷, reason: not valid java name and contains not printable characters */
    public C25227 f59341;

    /* JADX INFO: renamed from: ᩶᩷, reason: not valid java name and contains not printable characters */
    public C1229 f59342;

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public C3227 f59343;

    /* JADX INFO: renamed from: ᩹᩷, reason: not valid java name and contains not printable characters */
    public C23551 f59344;

    /* JADX INFO: renamed from: ᩺᩷, reason: not valid java name and contains not printable characters */
    public boolean f59345;

    /* JADX INFO: renamed from: ܿ᩷, reason: not valid java name and contains not printable characters */
    public final C3347 f59339 = C12296.m30693(this, new C9492(2, this));

    /* JADX INFO: renamed from: ܺ᩷, reason: not valid java name and contains not printable characters */
    public C13841 f59337 = new InterfaceC16438() { // from class: l.۬ۨ᩸
        @Override // l.InterfaceC16438
        /* JADX INFO: renamed from: ۙ */
        public final void mo1486(Object obj) {
            this.f43937.m40401((Throwable) obj, (DialogInterface.OnDismissListener) null);
        }
    };

    /* JADX INFO: renamed from: ᩻᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f59346 = new ArrayList();

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public int f59340 = -1;

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public boolean f59335 = false;

    /* JADX INFO: renamed from: ֫᩷, reason: not valid java name and contains not printable characters */
    public C24720 f59326 = C24720.m55196();

    /* JADX INFO: renamed from: ۨ᩷, reason: not valid java name and contains not printable characters */
    public boolean f59332 = false;

    @Override // l.AbstractActivityC17204
    /* JADX INFO: renamed from: ᩶ */
    public final String mo122() {
        return "TextEditor";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m42263(ActivityC18143 activityC18143, int i, CheckBox checkBox) {
        activityC18143.getClass();
        ArrayList arrayList = activityC18143.f59346;
        ArrayList arrayList2 = new ArrayList(arrayList.subList(i + 1, arrayList.size()));
        C9911.m25735(arrayList2, new C7130());
        boolean zIsChecked = checkBox.isChecked();
        LinkedList linkedList = new LinkedList();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            linkedList.add(new C24111(activityC18143, linkedList, (C7941) it.next(), zIsChecked));
        }
        if (linkedList.isEmpty()) {
            return;
        }
        activityC18143.f59335 = true;
        ((C24111) linkedList.removeFirst()).m53665();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m42274(ActivityC18143 activityC18143, int i, CheckBox checkBox) {
        activityC18143.getClass();
        ArrayList arrayList = new ArrayList(activityC18143.f59346);
        arrayList.remove(i);
        C9911.m25735(arrayList, new C7130());
        boolean zIsChecked = checkBox.isChecked();
        LinkedList linkedList = new LinkedList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedList.add(new C24111(activityC18143, linkedList, (C7941) it.next(), zIsChecked));
        }
        if (linkedList.isEmpty()) {
            return;
        }
        activityC18143.f59335 = true;
        ((C24111) linkedList.removeFirst()).m53665();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m42289(ActivityC18143 activityC18143, int i, CheckBox checkBox) {
        activityC18143.getClass();
        ArrayList arrayList = new ArrayList(activityC18143.f59346.subList(0, i));
        C9911.m25735(arrayList, new C7130());
        boolean zIsChecked = checkBox.isChecked();
        LinkedList linkedList = new LinkedList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedList.add(new C24111(activityC18143, linkedList, (C7941) it.next(), zIsChecked));
        }
        if (linkedList.isEmpty()) {
            return;
        }
        activityC18143.f59335 = true;
        ((C24111) linkedList.removeFirst()).m53665();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42262(ActivityC18143 activityC18143, int i, Intent intent) {
        if (i != -1 || intent == null) {
            return;
        }
        String stringExtra = intent.getStringExtra("preview_editor_state");
        if (stringExtra == null) {
            if (intent.getData() != null) {
                activityC18143.m42267(intent, false, false);
                return;
            }
            return;
        }
        for (C7941 c7941 : activityC18143.f59346) {
            if (stringExtra.equals(c7941.m19937())) {
                activityC18143.m42305(c7941);
                return;
            }
        }
        C22673.m51152(R.string.MT_Protector);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m42297(Intent intent) {
        this.f59339.m10999(intent);
    }

    @Override // l.AbstractActivityC17204, l.ActivityC7405, l.ActivityC3409, l.ActivityC5577, l.ActivityC8866, android.app.Activity
    public final void onCreate(Bundle bundle) {
        byte[] bArrM49865;
        int iM42270;
        super.onCreate(bundle);
        setTitle("");
        m40418(R.layout.MT_Protector);
        m40415();
        m40417().m43815(2);
        m42282();
        C16390 c16390 = (C16390) m40418(R.id.MT_Protector);
        this.f56046 = c16390;
        m40407(c16390);
        C7068 onBackPressedDispatcher = getOnBackPressedDispatcher();
        C11430 c11430 = new C11430(this);
        onBackPressedDispatcher.getClass();
        onBackPressedDispatcher.m19400(c11430);
        m40418(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.᩷ۛ᩸
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = ActivityC18143.f59323;
                this.f69709.m42306(false);
            }
        });
        C16390 c16391 = (C16390) m40418(R.id.MT_Protector);
        this.f59329 = c16391;
        c16391.setTitle(R.string.MT_Protector);
        this.f59329.inflateMenu(R.menu.MT_Protector);
        this.f59328 = new C8887(this.f59329, R.id.MT_Protector, R.id.more);
        this.f59329.setOnMenuItemClickListener(new InterfaceC25342() { // from class: l.ۤۛ᩸
            @Override // l.InterfaceC25342
            public final boolean onMenuItemClick(MenuItem menuItem) {
                this.f33917.m42294(menuItem);
                return true;
            }
        });
        this.f59333 = (C8147) m40418(R.id.MT_Protector);
        this.f59327 = (FloatingActionButton) m40418(R.id.MT_Protector);
        m40404(this.f59333, m40418(R.id.MT_Protector), this.f56046, m40418(R.id.MT_Protector), this.f59329, this.f59327);
        this.f59333.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: l.᩸ۛ᩸
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                ActivityC18143.m42260(this.f73098);
            }
        });
        C22248 c22248 = new C22248(this, this.f59333, this.f56046);
        c22248.m50300().m54301(C3296.f10732.getDefaultColor());
        this.f59333.m22041(c22248);
        c22248.m50302();
        this.f59333.m22041(new C1736(this));
        C1229 c1229 = (C1229) new C16196(this).m38422(C1229.class);
        this.f59342 = c1229;
        c1229.m4467(this, this.f59337);
        this.f59334 = (C12318) new C16196(this).m38422(C12318.class);
        this.f59344 = new C23551();
        C21576.m49069(new RunnableC19635(0, this), 500L);
        boolean z = bundle != null;
        synchronized (f59324) {
            try {
                AbstractC22044 abstractC22044M48538 = C21301.m48538();
                if (abstractC22044M48538.mo2934()) {
                    try {
                        bArrM49865 = abstractC22044M48538.m49865();
                    } catch (Exception e) {
                        this.f59342.m4466(e);
                        bArrM49865 = null;
                    }
                    if (bArrM49865 != null) {
                        try {
                            C20348 c20348 = new C20348(bArrM49865);
                            C17364.m40795((InterfaceC15872) c20348, 1736577895);
                            while (c20348.available() > 0) {
                                byte[] bArrM46748 = c20348.m46748();
                                C7941 c7941 = new C7941();
                                if (c7941.getArguments() != null) {
                                    throw new RuntimeException("Arguments is not null.");
                                }
                                Parcel parcelObtain = Parcel.obtain();
                                parcelObtain.unmarshall(bArrM46748, 0, bArrM46748.length);
                                parcelObtain.setDataPosition(0);
                                Bundle bundle2 = new Bundle();
                                bundle2.readFromParcel(parcelObtain);
                                c7941.setArguments(bundle2);
                                parcelObtain.recycle();
                                ComponentCallbacksC11612 componentCallbacksC11612M10493 = m11155().m10493(c7941.m19937());
                                if (!z) {
                                    C11972.m30030(componentCallbacksC11612M10493);
                                    c7941.m19948();
                                    if (c7941.m19946()) {
                                        this.f59346.add(c7941);
                                    }
                                } else if (componentCallbacksC11612M10493 != null) {
                                    C7941 c7942 = (C7941) componentCallbacksC11612M10493;
                                    if (!c7942.m19946()) {
                                        try {
                                            c7942.m19948();
                                        } catch (Exception e2) {
                                            this.f59342.m4466(e2);
                                        }
                                    }
                                    if (c7942.m19946()) {
                                        this.f59346.add(c7942);
                                    }
                                } else {
                                    c7941.m19948();
                                    if (c7941.m19946()) {
                                        this.f59346.add(c7941);
                                    }
                                }
                                this.f59342.m4466(e);
                            }
                        } catch (Exception e3) {
                            this.f59342.m4466(e3);
                        }
                    }
                    C1229 c12210 = this.f59342;
                    if (c12210.f4477) {
                        c12210.f4477 = false;
                        List listMo4299 = C21301.m48536().mo4299(true);
                        final ArrayList arrayList = new ArrayList();
                        arrayList.add(C18415.m42925("current|list").matcher((CharSequence) ""));
                        for (int i = 0; i < this.f59346.size(); i++) {
                            arrayList.add(C18415.m42925(C17370.m40798(((C7941) this.f59346.get(i)).m19937()) + "((-\\d+)?\\.dat|\\.tat|\\.lit|\\.e2)").matcher((CharSequence) ""));
                        }
                        C1170.stream(listMo4299).filter(new Predicate() { // from class: l.ۚۛ᩸
                            @Override // java.util.function.Predicate
                            public /* synthetic */ Predicate and(Predicate predicate) {
                                return C19025.$default$and(this, predicate);
                            }

                            @Override // java.util.function.Predicate
                            /* JADX INFO: renamed from: negate */
                            public /* synthetic */ Predicate mo7134negate() {
                                return C19025.$default$negate(this);
                            }

                            public /* synthetic */ Predicate or(Predicate predicate) {
                                return C19025.$default$or(this, predicate);
                            }

                            @Override // java.util.function.Predicate
                            public final boolean test(Object obj) {
                                int i2 = ActivityC18143.f59323;
                                String name = ((AbstractC22044) obj).getName();
                                for (C4245 c4245 : arrayList) {
                                    c4245.m13568reset((CharSequence) name);
                                    if (c4245.matches()) {
                                        return false;
                                    }
                                }
                                return true;
                            }
                        }).forEach(new C18317());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f59343 = new C3227(this);
        C25227 c25227 = (C25227) findViewById(R.id.MT_Protector);
        this.f59341 = c25227;
        c25227.setAdapter(this.f59343);
        this.f59341.setLayoutManager(new C0067(this));
        this.f59341.getItemAnimator().m10754(200L);
        this.f59341.getItemAnimator().m10769(200L);
        this.f59341.getItemAnimator().m10761(200L);
        this.f59341.getItemAnimator().m10766(200L);
        this.f59327.setOnClickListener(new ViewOnClickListenerC7876(0, this));
        this.f59341.addOnScrollListener(new C16651(this));
        C25227 c25228 = this.f59341;
        C8887 c8887 = this.f59328;
        C17359.requireNonNull(c8887);
        c25228.addOnItemTouchListener(new C11257(c25228, new C19063(c8887)));
        C11999 c11999 = new C11999(new C15905(this));
        this.f59336 = c11999;
        c11999.m30173(this.f59341);
        this.f59328.m23773(this.f59343);
        this.f59328.m23772(this.f59336);
        m42284();
        if ((bundle == null ? m42267(getIntent(), false, true) : false) || this.f59340 != -1 || (iM42270 = m42270()) == -1) {
            return;
        }
        m42271(iM42270, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m42260(ActivityC18143 activityC18143) {
        int width = (activityC18143.f59333.getWidth() - activityC18143.f59333.getChildAt(1).getWidth()) - activityC18143.f59327.getWidth();
        int iM19160 = C6907.m19160(36.0f);
        float f = -(width > iM19160 * 2 ? width - iM19160 : width / 2);
        if (activityC18143.f59327.getTranslationX() != f) {
            activityC18143.f59327.setTranslationX(f);
        }
    }

    @Override // l.AbstractActivityC17204, l.ActivityC4348, l.ActivityC3409, android.app.Activity
    public final void onStop() {
        this.f59331 = false;
        super.onStop();
    }

    @Override // l.AbstractActivityC17204, l.ActivityC7405, l.ActivityC4348, l.ActivityC5577, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m42282();
    }

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    private void m42282() {
        if (getResources().getConfiguration().orientation == 2) {
            m40417().m43811(1);
        } else if (getResources().getConfiguration().orientation == 1) {
            m40417().m43814(1);
        }
    }

    @Override // l.ActivityC5577, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (this.f59338) {
            return;
        }
        m42267(intent, false, false);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m42309(Intent intent) {
        m42267(intent, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00e1  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m42267(Intent intent, boolean z, final boolean z2) {
        C7941 c7941;
        boolean z3;
        String stringExtra;
        if (intent.getBooleanExtra("fromExternalApp", false)) {
            this.f59331 = true;
        }
        if ("bin.mt.edit2.ACTION_CREATE_WITH_TEXT".equals(intent.getAction())) {
            m42307();
            return false;
        }
        if (!"android.intent.action.SEND".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.TEXT") || (stringExtra = intent.getStringExtra("android.intent.extra.TEXT")) == null) {
            boolean zEquals = "android.intent.action.VIEW".equals(intent.getAction());
            ArrayList arrayList = this.f59346;
            if (!zEquals && !"android.intent.action.EDIT".equals(intent.getAction())) {
                if (arrayList.isEmpty()) {
                    m42307();
                    return false;
                }
            } else if (intent.getData() == null) {
                if (arrayList.isEmpty()) {
                    m42307();
                    return false;
                }
            } else if (z || C7756.m21112()) {
                try {
                    AbstractC22044 abstractC22044M35190 = C14584.m35190(intent);
                    int size = arrayList.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            i = -1;
                            c7941 = null;
                            break;
                        }
                        c7941 = (C7941) arrayList.get(i);
                        if (c7941.m19934().f30601.mo4294().equals(abstractC22044M35190.mo4294())) {
                            break;
                        }
                        i++;
                    }
                    if (c7941 == null) {
                        if (arrayList.size() == 1) {
                            C7941 c7942 = (C7941) arrayList.get(0);
                            if (!c7942.m19941() || c7942.m19933()) {
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                        } else {
                            z3 = false;
                        }
                        C7941 c7943 = new C7941();
                        c7943.m19944((String) null);
                        String strMo4294 = abstractC22044M35190.mo4294();
                        Bundle bundle = c7943.f23990;
                        bundle.putString("filePath", strMo4294);
                        if (EnumC17680.m41347() != EnumC17680.ALWAYS_KEEP) {
                            bundle.putBoolean("temp", true);
                        }
                        String stringExtra2 = intent.getStringExtra("save_as_path");
                        if (stringExtra2 != null) {
                            bundle.putString("save_as_path", stringExtra2);
                        }
                        if (intent.getBooleanExtra("axml", false)) {
                            bundle.putBoolean("forceTryAXml", true);
                        }
                        if (intent.getBooleanExtra(Name.LABEL, false)) {
                            bundle.putBoolean("forceTryClass", true);
                        }
                        int iM42286 = m42286(m42270() + 1, false);
                        arrayList.add(iM42286, c7943);
                        m42293();
                        c7943.mo19931(new String[0]);
                        i = iM42286;
                    } else {
                        z3 = false;
                    }
                    m42271(i, false);
                    if (z3) {
                        m42295((C7941) arrayList.get(0));
                    }
                } catch (Exception e) {
                    m40402((Throwable) e, true);
                    return false;
                }
            } else {
                final Intent intent2 = new Intent(intent);
                this.f59338 = true;
                C13511 c13511 = new C13511(this, R.string.MT_Protector);
                c13511.m33191(500);
                this.f59330 = c13511;
                C5261.f18540.execute(new Runnable() { // from class: l.۫ۛ᩸
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i2 = ActivityC18143.f59323;
                        try {
                            C7756.m21122();
                        } catch (Throwable unused) {
                        }
                        final ActivityC18143 activityC18143 = this.f41389;
                        final Intent intent3 = intent2;
                        final boolean z4 = z2;
                        C21576.m49068(new Runnable() { // from class: l.֡ۨ᩸
                            @Override // java.lang.Runnable
                            public final void run() {
                                ActivityC18143.m42264(activityC18143, intent3, z4);
                            }
                        });
                    }
                });
                return true;
            }
            return false;
        }
        C25294.f81698 = stringExtra;
        m42307();
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42264(ActivityC18143 activityC18143, Intent intent, boolean z) {
        int iM42270;
        C13511 c13511 = activityC18143.f59330;
        if (c13511 != null) {
            c13511.m33185();
            activityC18143.f59330 = null;
        }
        activityC18143.f59338 = false;
        AbstractC3191 abstractC3191M11155 = activityC18143.m11155();
        if (activityC18143.isFinishing() || activityC18143.isDestroyed() || abstractC3191M11155.m10487() || abstractC3191M11155.m10467()) {
            return;
        }
        activityC18143.m42267(intent, true, false);
        if (z && activityC18143.f59340 == -1 && (iM42270 = activityC18143.m42270()) != -1) {
            activityC18143.m42271(iM42270, false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42259(CharSequence charSequence) {
        C25294.f81698 = charSequence;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m42308(int i) {
        C23551 c23551 = this.f59344;
        if (c23551 != null) {
            c23551.m52754(this, R.layout.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final View m42296(int i) {
        C23551 c23551 = this.f59344;
        if (c23551 != null) {
            return c23551.m52753(R.layout.MT_Protector);
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final boolean m42304() {
        if (ApplicationC17729.f58262.getBoolean("double_confirm_before_exit", false)) {
            return this.f59326.m55199();
        }
        return false;
    }

    @Override // l.ActivityC7405
    /* JADX INFO: renamed from: ᩺ */
    public final void mo3459() {
        this.f59331 = false;
        m42306(false);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m42306(boolean z) {
        if (z && m42304()) {
            C22673.m51152(R.string.MT_Protector);
            return;
        }
        System.out.println("exitToExternalApp=" + this.f59331);
        m42276();
        finish();
        if (this.f59331) {
            moveTaskToBack(true);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m42298(boolean z) {
        if (this.f59332) {
            return;
        }
        boolean z2 = true;
        this.f59332 = true;
        ArrayList<C7941> arrayList = this.f59346;
        if (z) {
            C7941 c7941 = (C7941) arrayList.get(this.f59340);
            ArrayList arrayList2 = new ArrayList();
            for (C7941 c7942 : arrayList) {
                if (c7942.mo19940() && c7942 != c7941 && !c7942.m19933()) {
                    arrayList2.add(c7942);
                }
            }
            boolean zIsEmpty = arrayList2.isEmpty();
            boolean z3 = !zIsEmpty;
            if (!zIsEmpty) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((C7941) it.next()).m21636();
                }
                arrayList.removeAll(arrayList2);
                this.f59340 = arrayList.indexOf(c7941);
            }
            if (c7941.mo19940()) {
                arrayList.remove(this.f59340);
                int i = this.f59340;
                if (i > 0) {
                    this.f59340 = i - 1;
                }
                c7941.m21636();
            } else {
                z2 = z3;
            }
            if (z2) {
                m42258();
                m42293();
            }
        } else {
            C7941 c7943 = (C7941) arrayList.get(this.f59340);
            if (c7943.mo19940()) {
                arrayList.remove(this.f59340);
                int i2 = this.f59340;
                if (i2 > 0) {
                    this.f59340 = i2 - 1;
                }
                c7943.m21636();
                m42258();
                m42293();
            }
        }
        m42306(false);
    }

    @Override // l.ActivityC5577, l.ActivityC8866, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        m42276();
    }

    @Override // l.AbstractActivityC17204, l.ActivityC3409, android.app.Activity
    public final void onPause() {
        super.onPause();
        m42276();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42294(MenuItem menuItem) {
        if (C14941.f48783.m55200()) {
            return;
        }
        int itemId = menuItem.getItemId();
        if (itemId == R.id.MT_Protector) {
            this.f59328.m23774(true);
            return;
        }
        if (this.f59328.m23776()) {
            return;
        }
        ArrayList arrayList = this.f59346;
        if (itemId != R.id.MT_Protector) {
            if (itemId == R.id.MT_Protector) {
                m42299();
                m42307();
                return;
            } else {
                if (itemId == R.id.MT_Protector) {
                    ((C7941) arrayList.get(this.f59340)).onOptionsItemSelected(menuItem);
                    return;
                }
                return;
            }
        }
        LinkedList linkedList = new LinkedList();
        for (C7941 c7941 : new ArrayList(arrayList)) {
            if (c7941.m19933() && !c7941.m19941()) {
                linkedList.add(new C21366(c7941, this));
            }
        }
        if (linkedList.isEmpty()) {
            C22673.m51152(R.string.MT_Protector);
        } else {
            new C24857(this, linkedList).m8197();
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private String m42269(int i) {
        if (i < 0) {
            return null;
        }
        ArrayList arrayList = this.f59346;
        if (i >= arrayList.size()) {
            return null;
        }
        return C18969.m44060(50, ((C7941) arrayList.get(i)).m19934().f30601.getName());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42266(ActivityC18143 activityC18143, C9898 c9898, int i) {
        ArrayList arrayList = activityC18143.f59346;
        C3973 c3973 = new C3973();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            C7941 c7941 = (C7941) arrayList.get(i2);
            if (!c7941.m19936()) {
                c3973.f13614++;
                if (!c7941.m19933()) {
                    c3973.f13615++;
                }
                if (i2 < i) {
                    c3973.f13612++;
                } else if (i2 > i) {
                    c3973.f13613++;
                }
            }
        }
        if (C3973.m12801(c3973)) {
            SubMenu subMenuAddSubMenu = c9898.addSubMenu(0, R.id.MT_Protector, 0, activityC18143.getString(R.string.MT_Protector) + "…");
            subMenuAddSubMenu.getItem().setIcon(R.drawable.MT_Protector);
            subMenuAddSubMenu.setHeaderTitle(R.string.MT_Protector);
            subMenuAddSubMenu.add(0, R.id.MT_Protector, 0, R.string.MT_Protector).setEnabled(c3973.f13612 + c3973.f13613 > 0);
            subMenuAddSubMenu.add(0, R.id.MT_Protector, 0, R.string.MT_Protector).setEnabled(c3973.f13614 > 0);
            subMenuAddSubMenu.add(0, R.id.MT_Protector, 0, R.string.MT_Protector).setEnabled(c3973.f13615 > 0);
            subMenuAddSubMenu.add(0, R.id.MT_Protector, 0, R.string.MT_Protector).setEnabled(c3973.f13612 > 0);
            subMenuAddSubMenu.add(0, R.id.MT_Protector, 0, R.string.MT_Protector).setEnabled(c3973.f13613 > 0);
        }
    }

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m42310() {
        return this.f59335;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m42300(final int i) {
        String strM42269 = m42269(i);
        if (strM42269 == null) {
            return;
        }
        View viewM40395 = m40395(R.layout.MT_Protector);
        ((TextView) viewM40395.findViewById(R.id.MT_Protector)).setText(getString(R.string.MT_Protector, strM42269));
        final CheckBox checkBox = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: l.ۢۨ᩸
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                ActivityC18143.m42274(this.f32381, i, checkBox);
            }
        };
        C2361 c2361BuildDialog = buildDialog();
        c2361BuildDialog.m8005(viewM40395);
        c2361BuildDialog.m8026(R.string.MT_Protector, onClickListener);
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8016();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m42265(ActivityC18143 activityC18143, CheckBox checkBox) {
        ArrayList arrayList = new ArrayList(activityC18143.f59346);
        C9911.m25735(arrayList, new C7130());
        boolean zIsChecked = checkBox.isChecked();
        LinkedList linkedList = new LinkedList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedList.add(new C24111(activityC18143, linkedList, (C7941) it.next(), zIsChecked));
        }
        if (linkedList.isEmpty()) {
            return;
        }
        activityC18143.f59335 = true;
        ((C24111) linkedList.removeFirst()).m53665();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m42287(ActivityC18143 activityC18143) {
        activityC18143.f59335 = true;
        try {
            for (C7941 c7941 : new ArrayList(activityC18143.f59346)) {
                if (!c7941.m19933() && !c7941.m19936()) {
                    activityC18143.m42295(c7941);
                }
            }
            activityC18143.f59335 = false;
        } catch (Throwable th) {
            activityC18143.f59335 = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m42303(int i) {
        String strM42269 = m42269(i);
        if (strM42269 == null) {
            return;
        }
        View viewM40395 = m40395(R.layout.MT_Protector);
        ((TextView) viewM40395.findViewById(R.id.MT_Protector)).setText(getString(R.string.MT_Protector, strM42269));
        DialogInterfaceOnClickListenerC8621 dialogInterfaceOnClickListenerC8621 = new DialogInterfaceOnClickListenerC8621(this, i, (CheckBox) viewM40395.findViewById(R.id.MT_Protector), 0);
        C2361 c2361BuildDialog = buildDialog();
        c2361BuildDialog.m8005(viewM40395);
        c2361BuildDialog.m8026(R.string.MT_Protector, dialogInterfaceOnClickListenerC8621);
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8016();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m42301(final int i) {
        String strM42269 = m42269(i);
        if (strM42269 == null) {
            return;
        }
        View viewM40395 = m40395(R.layout.MT_Protector);
        ((TextView) viewM40395.findViewById(R.id.MT_Protector)).setText(getString(R.string.MT_Protector, strM42269));
        final CheckBox checkBox = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: l.ۡۨ᩸
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                ActivityC18143.m42263(this.f30434, i, checkBox);
            }
        };
        C2361 c2361BuildDialog = buildDialog();
        c2361BuildDialog.m8005(viewM40395);
        c2361BuildDialog.m8026(R.string.MT_Protector, onClickListener);
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8016();
    }

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final void m42302() {
        C3227 c3227 = this.f59343;
        if (c3227 != null) {
            c3227.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final void m42299() {
        if (this.f59333.m22057(8388611)) {
            this.f59333.m22037(8388611);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public void m42284() {
        boolean zM22057 = this.f59333.m22057(8388611);
        C0067 c0067 = (C0067) this.f59341.getLayoutManager();
        C17359.requireNonNull(c0067);
        int iFindFirstVisibleItemPosition = c0067.findFirstVisibleItemPosition();
        int childCount = c0067.getChildCount() + iFindFirstVisibleItemPosition;
        int i = this.f59340;
        if (i < iFindFirstVisibleItemPosition || i >= childCount) {
            if (this.f59345) {
                return;
            }
            this.f59345 = true;
            if (zM22057) {
                this.f59327.setVisibility(0);
                this.f59327.setAlpha(0.0f);
                ObjectAnimator.ofFloat(this.f59327, "alpha", 0.0f, 1.0f).setDuration(200L).start();
                return;
            }
            return;
        }
        if (this.f59345) {
            this.f59345 = false;
            if (zM22057) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f59327, "alpha", 1.0f, 0.0f);
                objectAnimatorOfFloat.addListener(new C23365(this));
                objectAnimatorOfFloat.setDuration(200L).start();
            }
        }
    }

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final void m42307() {
        C7941 c7941 = new C7941();
        c7941.m19944((String) null);
        c7941.f23990.putString("filePath", "untitled");
        ArrayList arrayList = this.f59346;
        if (arrayList.isEmpty()) {
            this.f59340 = -1;
        }
        int iM42286 = m42286(this.f59340 + 1, false);
        arrayList.add(iM42286, c7941);
        m42293();
        c7941.mo19931(new String[0]);
        m42271(iM42286, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42295(C7941 c7941) {
        int i;
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new RuntimeException();
        }
        ArrayList arrayList = this.f59346;
        int iIndexOf = arrayList.indexOf(c7941);
        C11972.m30026(iIndexOf != -1);
        if (arrayList.size() > 1 && iIndexOf == (i = this.f59340)) {
            if (i > 0) {
                m42271(i - 1, true);
            } else {
                m42271(i + 1, true);
            }
            C11972.m30026(iIndexOf != this.f59340);
        }
        ComponentCallbacksC11612 componentCallbacksC11612M10493 = m11155().m10493(c7941.m19937());
        if (componentCallbacksC11612M10493 != null) {
            C11972.m30026(c7941 == componentCallbacksC11612M10493);
            AbstractC4573 abstractC4573M10492 = m11155().m10492();
            abstractC4573M10492.mo14360(c7941);
            abstractC4573M10492.mo14363();
        } else {
            C11972.m30026((c7941.isAdded() || c7941.isDetached()) ? false : true);
        }
        arrayList.remove(iIndexOf);
        int i2 = this.f59340;
        if (iIndexOf < i2) {
            this.f59340 = i2 - 1;
            m42258();
            m42284();
        }
        this.f59343.notifyItemRemoved(iIndexOf);
        c7941.m21636();
        m42293();
        if (arrayList.isEmpty()) {
            m42306(false);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m42305(C7941 c7941) {
        int iIndexOf = this.f59346.indexOf(c7941);
        if (iIndexOf != -1) {
            m42271(iIndexOf, false);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m42288(ActivityC18143 activityC18143, int i) {
        activityC18143.m42271(i, false);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m42271(int i, boolean z) {
        InterfaceC19777 interfaceC19777M21619;
        if (i >= 0) {
            ArrayList arrayList = this.f59346;
            if (i < arrayList.size()) {
                AbstractC3191 abstractC3191M11155 = m11155();
                if (abstractC3191M11155.m10487() || abstractC3191M11155.m10467()) {
                    return;
                }
                int i2 = this.f59340;
                if (i2 == -1) {
                    C7941 c7941 = (C7941) arrayList.get(i);
                    AbstractC4573 abstractC4573M10492 = abstractC3191M11155.m10492();
                    abstractC4573M10492.m14353(R.id.MT_Protector, c7941, c7941.m19937());
                    abstractC4573M10492.mo14363();
                    this.f59340 = i;
                    m42258();
                    m42284();
                    this.f59343.notifyDataSetChanged();
                    return;
                }
                if (i2 != i) {
                    C7941 c7942 = (C7941) arrayList.get(i2);
                    C7941 c7943 = (C7941) arrayList.get(i);
                    if (!z && (interfaceC19777M21619 = c7942.m21619()) != null) {
                        if (this.f59334.m30725()) {
                            this.f59334.m30723(new RunnableC15159(0, interfaceC19777M21619));
                        } else {
                            interfaceC19777M21619.mo34769();
                            this.f59334.m30723(new RunnableC4719(0, interfaceC19777M21619));
                        }
                    }
                    AbstractC4573 abstractC4573M10493 = abstractC3191M11155.m10492();
                    if (this.f59340 < i) {
                        abstractC4573M10493.m14352(R.anim.MT_Protector, R.anim.MT_Protector);
                    } else {
                        abstractC4573M10493.m14352(R.anim.MT_Protector, R.anim.MT_Protector);
                    }
                    abstractC4573M10493.mo14365(c7942);
                    if (c7943.isDetached()) {
                        abstractC4573M10493.m14356(c7943);
                    } else {
                        abstractC4573M10493.m14357(c7943, c7943.m19937());
                    }
                    abstractC4573M10493.mo14359();
                    this.f59340 = i;
                    m42258();
                    m42284();
                    this.f59343.notifyDataSetChanged();
                    return;
                }
                ((C7941) arrayList.get(i2)).m21638();
                return;
            }
        }
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private int m42286(int i, boolean z) {
        while (true) {
            ArrayList arrayList = this.f59346;
            if (i >= arrayList.size()) {
                break;
            }
            C7941 c7941 = (C7941) arrayList.get(i);
            if (z || !c7941.m19936()) {
                break;
            }
            i++;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public void m42293() {
        AbstractC22044 abstractC22044M48538 = C21301.m48538();
        C6178 c6178M34975 = C14483.m34975(1736577895);
        for (C7941 c7941 : this.f59346) {
            c7941.getClass();
            Parcel parcelObtain = Parcel.obtain();
            c7941.requireArguments().writeToParcel(parcelObtain, 0);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            c6178M34975.m17806(bArrMarshall);
        }
        try {
            new RunnableC8139(abstractC22044M48538, c6178M34975, f59324).m22019();
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    private void m42276() {
        InterfaceC19777 interfaceC19777M21619;
        int i = this.f59340;
        if (i != -1) {
            ArrayList arrayList = this.f59346;
            if (i >= arrayList.size() || (interfaceC19777M21619 = ((C7941) arrayList.get(this.f59340)).m21619()) == null) {
                return;
            }
            interfaceC19777M21619.mo34769();
            this.f59334.m30723(new RunnableC4719(0, interfaceC19777M21619));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public void m42258() {
        C6178 c6178 = new C6178(4);
        c6178.writeInt(this.f59340);
        AbstractC22044 abstractC22044M48540 = C21301.m48540();
        Object obj = f59325;
        C5261.m15836(new RunnableC8139(abstractC22044M48540, c6178, obj), obj, 200L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0019, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [l.᩷ۨᩴ] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x001b -> B:16:0x0020). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int m42270() throws java.lang.Throwable {
        /*
            r4 = this;
            r0 = -1
            l.᩷ۨᩴ r1 = l.C21301.m48540()     // Catch: java.lang.Exception -> L24
            java.lang.Object r2 = l.ActivityC18143.f59325     // Catch: java.lang.Exception -> L24
            monitor-enter(r2)     // Catch: java.lang.Exception -> L24
            boolean r3 = r1.mo2934()     // Catch: java.lang.Throwable -> L1c
            if (r3 == 0) goto L17
            l.᩵ۚۤ r1 = r1.m49835()     // Catch: java.lang.Throwable -> L1c
            int r1 = r1.readInt()     // Catch: java.lang.Throwable -> L1c
            goto L18
        L17:
            r1 = -1
        L18:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1a
            goto L2c
        L1a:
            r3 = move-exception
            goto L20
        L1c:
            r1 = move-exception
            r3 = -1
            r3 = r1
            r1 = -1
        L20:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1a
            throw r3     // Catch: java.lang.Exception -> L22
        L22:
            r2 = move-exception
            goto L27
        L24:
            r1 = move-exception
            r2 = r1
            r1 = -1
        L27:
            l.֨ܰ᩸ r3 = r4.f59342
            r3.m4466(r2)
        L2c:
            java.util.ArrayList r2 = r4.f59346
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L35
            goto L43
        L35:
            if (r1 < 0) goto L42
            java.util.ArrayList r0 = r4.f59346
            int r0 = r0.size()
            if (r1 < r0) goto L40
            goto L42
        L40:
            r0 = r1
            goto L43
        L42:
            r0 = 0
        L43:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC18143.m42270():int");
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m42273(ActivityC18143 activityC18143, int i) {
        int iM42286;
        ArrayList arrayList = activityC18143.f59346;
        if (i == -1 || i >= arrayList.size()) {
            return;
        }
        C7941 c7941 = (C7941) arrayList.get(i);
        if (c7941.m19936()) {
            iM42286 = activityC18143.m42286(0, false);
            Bundle bundleRequireArguments = c7941.requireArguments();
            C17359.requireNonNull(bundleRequireArguments);
            bundleRequireArguments.putBoolean("top", false);
            while (iM42286 < arrayList.size() && ((C7941) arrayList.get(iM42286)).m19936()) {
                iM42286++;
            }
        } else {
            int iM42287 = activityC18143.m42286(0, true);
            Bundle bundleRequireArguments2 = c7941.requireArguments();
            C17359.requireNonNull(bundleRequireArguments2);
            bundleRequireArguments2.putBoolean("top", true);
            c7941.m21618();
            iM42286 = iM42287;
        }
        if (i != iM42286) {
            C7941 c7942 = (C7941) arrayList.get(activityC18143.f59340);
            if (i < iM42286) {
                iM42286--;
            }
            arrayList.remove(i);
            arrayList.add(iM42286, c7941);
            activityC18143.f59340 = arrayList.indexOf(c7942);
            activityC18143.m42258();
            activityC18143.m42284();
        }
        activityC18143.m42293();
        activityC18143.f59343.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m42278() {
        return ApplicationC17729.f58258.getBoolean("axml_id_2_name", true);
    }
}
