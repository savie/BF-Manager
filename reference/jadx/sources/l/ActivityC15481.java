package l;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ܶ᩷۬, reason: contains not printable characters */
/* JADX INFO: compiled from: X8B6 */
/* JADX INFO: loaded from: classes5.dex */
public class ActivityC15481 extends AbstractActivityC12483 {

    /* JADX INFO: renamed from: ۛܰ, reason: not valid java name and contains not printable characters */
    public static final int[] f50433 = {-16777216, -1, -7829368};

    /* JADX INFO: renamed from: ܿܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f50434 = 0;

    /* JADX INFO: renamed from: ֡ܰ, reason: not valid java name and contains not printable characters */
    public C23242 f50435;

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public int f50436;

    /* JADX INFO: renamed from: ۘܰ, reason: not valid java name and contains not printable characters */
    public View f50438;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public ValueAnimator f50439;

    /* JADX INFO: renamed from: ۜܰ, reason: not valid java name and contains not printable characters */
    public CheckBox f50440;

    /* JADX INFO: renamed from: ۟ܰ, reason: not valid java name and contains not printable characters */
    public View f50441;

    /* JADX INFO: renamed from: ۠ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC17679 f50442;

    /* JADX INFO: renamed from: ۤܰ, reason: not valid java name and contains not printable characters */
    public C0103 f50444;

    /* JADX INFO: renamed from: ۫ܰ, reason: not valid java name and contains not printable characters */
    public boolean f50445;

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public boolean f50446;

    /* JADX INFO: renamed from: ܶܰ, reason: not valid java name and contains not printable characters */
    public MenuItem f50447;

    /* JADX INFO: renamed from: ܺܰ, reason: not valid java name and contains not printable characters */
    public C17485 f50448;

    /* JADX INFO: renamed from: ܽܰ, reason: not valid java name and contains not printable characters */
    public boolean f50449;

    /* JADX INFO: renamed from: ᩳܰ, reason: not valid java name and contains not printable characters */
    public boolean f50450;

    /* JADX INFO: renamed from: ᩴܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC12741 f50451;

    /* JADX INFO: renamed from: ᩵ܰ, reason: not valid java name and contains not printable characters */
    public TextView f50452;

    /* JADX INFO: renamed from: ᩷ܰ, reason: not valid java name and contains not printable characters */
    public AtomicBoolean f50454;

    /* JADX INFO: renamed from: ᩸ܰ, reason: not valid java name and contains not printable characters */
    public boolean f50455;

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public int f50456;

    /* JADX INFO: renamed from: ᩺ܰ, reason: not valid java name and contains not printable characters */
    public float f50457;

    /* JADX INFO: renamed from: ᩶ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f50453 = new ArrayList();

    /* JADX INFO: renamed from: ۡܰ, reason: not valid java name and contains not printable characters */
    public AtomicBoolean f50443 = new AtomicBoolean();

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public int f50437 = 255;

    @Override // l.AbstractActivityC12483
    /* JADX INFO: renamed from: ۡ */
    public final String mo126() {
        return "ImageViewerActivity";
    }

    @Override // l.ActivityC4866
    /* JADX INFO: renamed from: ᩳ */
    public final int mo9927() {
        return 2;
    }

    @Override // l.AbstractActivityC12483, l.ActivityC4866, l.ActivityC19126, l.ActivityC1086, l.ActivityC16858, android.app.Activity
    public final void onCreate(Bundle bundle) {
        this.f41637 = false;
        setTheme(R.style.MT_Protector);
        super.onCreate(bundle);
        this.f50435 = (C23242) new C16717(this).m39205(C23242.class);
        m31016(R.layout.MT_Protector);
        this.f50442 = (AbstractC17679) m31016(R.id.MT_Protector);
        boolean z = true;
        if (!this.f50435.f75413) {
            boolean z2 = ApplicationC0716.f2992.getBoolean("pvc", false);
            C23242 c23242 = this.f50435;
            if (bundle != null) {
                z2 = bundle.getBoolean("gallery.continuous", z2);
            }
            c23242.f75415 = z2;
            this.f50435.f75413 = true;
        }
        if (this.f50435.f75415) {
            m37045();
        }
        this.f50438 = m31016(R.id.MT_Protector);
        this.f41645 = (C6938) m31016(R.id.MT_Protector);
        this.f50440 = (CheckBox) m31016(R.id.MT_Protector);
        this.f50452 = (TextView) m31016(R.id.MT_Protector);
        this.f50441 = m31016(R.id.MT_Protector);
        m31004(this.f41645);
        m31017();
        this.f41645.setNavigationOnClickListener(new ViewOnClickListenerC11953(0, this));
        Window window = getWindow();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.layoutInDisplayCutoutMode = i >= 30 ? 3 : 1;
            window.setAttributes(attributes);
        }
        window.setBackgroundDrawableResource(android.R.color.transparent);
        C16321.m38489(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        C5965 c5965M31021 = m31021();
        c5965M31021.m16258(false);
        c5965M31021.m16254(false);
        c5965M31021.m16257(2);
        C5031.m13989(m31016(R.id.MT_Protector), new C11509(5, this));
        int i2 = ApplicationC0716.f2992.getInt("pvbi", 0);
        this.f50436 = i2;
        if (i2 < 0 || i2 >= 3) {
            this.f50436 = 0;
        }
        m37047();
        C7013 c7013 = new C7013(this);
        this.f50451 = c7013;
        this.f50442.mo19696(c7013);
        this.f50440.setSaveEnabled(false);
        this.f50440.setContentDescription(getString(R.string.MT_Protector));
        this.f50440.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ۖ᩷۬
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
                ActivityC15481.m37043(this.f10607, z3);
            }
        });
        this.f50441.setContentDescription(getString(R.string.MT_Protector));
        this.f50441.setOnClickListener(new ViewOnClickListenerC5602(this, 0));
        this.f50441.setEnabled(false);
        this.f50440.setVisibility(8);
        this.f50452.setText(R.string.MT_Protector);
        if (bundle != null) {
            m37030(false);
        }
        getOnBackPressedDispatcher().m34908(this, new C4190(this));
        C23242 c23243 = this.f50435;
        if (c23243.f75414 != null) {
            m37062();
            return;
        }
        if (bundle != null) {
            c23243.f75411 = bundle.getBoolean("gallery.internal");
            this.f50435.f75409 = bundle.getString("gallery.path");
            this.f50435.f75408 = bundle.getBundle("gallery.viewport");
            this.f50435.f75412 = bundle.getBoolean("gallery.bars", true);
            if (this.f50435.f75411) {
                String string = bundle.getString("gallery.localUri");
                if (string == null) {
                    m37032();
                    return;
                }
                this.f50435.f75416 = Uri.parse(string);
                ArrayList<String> stringArrayList = bundle.getStringArrayList("gallery.selected");
                if (stringArrayList != null) {
                    for (String str : stringArrayList) {
                        if (this.f50435.f75410.add(str)) {
                            this.f50435.f75407.add(str);
                        }
                    }
                }
                C4716.f16636.execute(new RunnableC1368(this, z, this.f50435.f75416, new ArrayList(this.f50435.f75407), this.f50443));
                return;
            }
        }
        m37060(bundle == null);
    }

    @Override // android.app.Activity
    public final void onEnterAnimationComplete() {
        super.onEnterAnimationComplete();
        this.f50455 = true;
        if (this.f50457 <= 0.0f || this.f50450 || isFinishing() || isDestroyed()) {
            return;
        }
        m37030(true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m37040(ActivityC15481 activityC15481, C15844 c15844) {
        C13954 c13954M37684 = c15844.m37684(135);
        C6938 c6938 = activityC15481.f41645;
        int i = c13954M37684.f45915;
        int i2 = c13954M37684.f45912;
        int i3 = c13954M37684.f45914;
        c6938.setPadding(i, i2, i3, 0);
        activityC15481.f50438.setPadding(c13954M37684.f45915, 0, i3, c13954M37684.f45913);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m37043(ActivityC15481 activityC15481, boolean z) {
        InterfaceC2557 interfaceC2557M37050;
        if (activityC15481.f50445) {
            return;
        }
        C23242 c23242 = activityC15481.f50435;
        if (!c23242.f75411 || c23242.f75414 == null || (interfaceC2557M37050 = activityC15481.m37050()) == null) {
            return;
        }
        if (z) {
            activityC15481.f50435.f75410.add(interfaceC2557M37050.getPath());
        } else {
            activityC15481.f50435.f75410.remove(interfaceC2557M37050.getPath());
            activityC15481.f50435.f75407.remove(interfaceC2557M37050.getPath());
        }
        activityC15481.m37026();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m37060(boolean z) {
        Intent intent = getIntent();
        boolean z2 = false;
        C21830 c21830 = (z && (intent.getComponent() != null && getClass().getName().equals(intent.getComponent().getClassName())) && intent.getData() == null) ? (C21830) C12670.m31505("ImageViewerArguments") : null;
        if (c21830 != null) {
            if (c21830.m48600() == null || c21830.m48602() == null || c21830.m48602().isEmpty() || c21830.m48601() < 0 || c21830.m48601() >= c21830.m48602().size()) {
                m37032();
                return;
            }
            Iterator it = c21830.m48602().iterator();
            while (it.hasNext()) {
                if (((InterfaceC2557) it.next()) == null) {
                    m37032();
                    return;
                }
            }
            this.f50435.f75414 = new C21830(c21830.m48600(), new ArrayList(c21830.m48602()), c21830.m48601());
            C23242 c23242 = this.f50435;
            c23242.f75411 = true;
            c23242.f75409 = m37029(c21830.m48601()).getPath();
            m37062();
            return;
        }
        C4716.f16636.execute(new RunnableC1368(this, z2, intent.getData(), new ArrayList(this.f50435.f75407), this.f50443));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m37039(ActivityC15481 activityC15481, AtomicBoolean atomicBoolean, C21830 c21830) {
        if (atomicBoolean.get() || activityC15481.isFinishing() || activityC15481.isDestroyed()) {
            return;
        }
        activityC15481.f50435.f75414 = c21830;
        activityC15481.m37062();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m37038(ActivityC15481 activityC15481, AtomicBoolean atomicBoolean) {
        if (atomicBoolean.get() || activityC15481.isFinishing() || activityC15481.isDestroyed()) {
            return;
        }
        activityC15481.m37032();
    }

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    private void m37045() {
        AbstractC17679 abstractC17679 = this.f50442;
        ViewGroup viewGroup = (ViewGroup) abstractC17679.getParent();
        int iIndexOfChild = viewGroup.indexOfChild(abstractC17679);
        AbstractC17679 c9214 = this.f50435.f75415 ? new C9214(this) : new C7387(this, null);
        this.f50442 = c9214;
        c9214.setId(R.id.MT_Protector);
        this.f50442.mo19696(this.f50451);
        viewGroup.removeView(abstractC17679);
        viewGroup.addView(this.f50442, iIndexOfChild, abstractC17679.getLayoutParams());
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m37062() {
        ArrayList arrayList;
        C21830 c21830 = this.f50435.f75414;
        int iM48601 = c21830.m48601();
        if (this.f50435.f75409 != null) {
            iM48601 = 0;
            while (true) {
                if (iM48601 >= c21830.m48602().size()) {
                    iM48601 = -1;
                    break;
                } else if (this.f50435.f75409.equals(m37029(iM48601).getPath())) {
                    break;
                } else {
                    iM48601++;
                }
            }
        }
        if (iM48601 < 0 || iM48601 >= c21830.m48602().size()) {
            m37032();
            return;
        }
        try {
            Iterator it = c21830.m48602().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                arrayList = this.f50453;
                if (!zHasNext) {
                    break;
                }
                arrayList.add(AbstractC1886.m6134(this, c21830.m48600(), (InterfaceC2557) it.next()));
            }
            C0103 c0103 = new C0103(this, arrayList);
            this.f50444 = c0103;
            c0103.m1127(getLifecycle().mo9170().m24173(EnumC9414.RESUMED));
            this.f50444.m1125(new RunnableC12918(2, this));
            this.f50444.m1126(this.f50442, iM48601);
            Bundle bundle = this.f50435.f75408;
            if (bundle != null) {
                this.f50442.mo19699(bundle);
            }
            this.f50435.f75409 = m37029(iM48601).getPath();
            m37054(this.f50435.f75412);
            m37026();
        } catch (RuntimeException unused) {
            m37032();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public InterfaceC2557 m37029(int i) {
        return (InterfaceC2557) this.f50435.f75414.m48602().get(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public InterfaceC2557 m37050() {
        int iMo19708 = this.f50442.mo19708();
        C21830 c21830 = this.f50435.f75414;
        if (c21830 == null || iMo19708 < 0 || iMo19708 >= c21830.m48602().size()) {
            return null;
        }
        return m37029(iMo19708);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public void m37026() {
        InterfaceC2557 interfaceC2557M37050 = m37050();
        if (interfaceC2557M37050 == null) {
            return;
        }
        int iMo19708 = this.f50442.mo19708();
        setTitle(interfaceC2557M37050.getName());
        String str = String.format(Locale.getDefault(), "%d/%d", Integer.valueOf(iMo19708 + 1), Integer.valueOf(this.f50453.size()));
        this.f50452.setText(str);
        this.f50442.setContentDescription(interfaceC2557M37050.getName() + " " + str);
        C20937 c20937M1123 = this.f50444.m1123(iMo19708);
        if (c20937M1123 == null) {
            this.f41645.setSubtitle(this.f50444.m1132(iMo19708) ? getString(R.string.MT_Protector) : null);
        } else {
            int i = c20937M1123.f68250;
            int i2 = c20937M1123.f68251;
            C14588 c14588 = c20937M1123.f68245;
            long time = c20937M1123.f68247;
            if (time < 0) {
                time = c14588.f47740;
            }
            if (time <= 0) {
                time = interfaceC2557M37050.getTime();
            }
            long j = c14588.f47739;
            String strM5873 = j >= 0 ? C1791.m5873(j) : null;
            int i3 = c20937M1123.f68246;
            int i4 = i3 >= 5 ? i2 : i;
            if (i3 < 5) {
                i = i2;
            }
            Locale locale = Locale.ENGLISH;
            String strM21119 = C8015.m21119(MotionUtils.EASING_TYPE_FORMAT_START, i4, "x", MotionUtils.EASING_TYPE_FORMAT_END, i);
            if (!C13012.m32190(interfaceC2557M37050)) {
                strM5873 = strM5873 == null ? strM21119 : C1679.m5594(strM5873, EnumC19730.f63352, strM21119);
            } else if (strM5873 == null) {
                strM5873 = "";
            }
            C6938 c6938 = this.f41645;
            if (time > 0) {
                strM5873 = C5319.m14739(time) + EnumC19730.f63352 + strM5873;
            }
            c6938.setSubtitle(strM5873);
        }
        this.f50445 = true;
        this.f50440.setVisibility(this.f50435.f75411 ? 0 : 8);
        this.f50440.setChecked(this.f50435.f75410.contains(interfaceC2557M37050.getPath()));
        this.f50440.setText(this.f50435.f75410.isEmpty() ? null : String.valueOf(this.f50435.f75410.size()));
        this.f50445 = false;
        this.f50441.setEnabled(this.f50454 == null);
        m37031();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public void m37054(boolean z) {
        this.f50435.f75412 = z;
        this.f41645.setVisibility(z ? 0 : 4);
        this.f50438.setVisibility(z ? 0 : 4);
        m37069();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public void m37069() {
        if (isFinishing() || isDestroyed()) {
            return;
        }
        if (this.f50435.f75412 || this.f50457 > 0.0f || this.f50450) {
            m31021().m16256(7);
        } else {
            m31021().m16253(7);
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        this.f50447 = menu.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector).setShowAsActionFlags(2);
        menu.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector).setShowAsActionFlags(2);
        menu.add(0, R.id.more, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector).setShowAsActionFlags(2);
        m37031();
        return true;
    }

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    private void m37031() {
        C0103 c0103;
        InterfaceC2557 interfaceC2557M37050 = m37050();
        MenuItem menuItem = this.f50447;
        if (menuItem != null) {
            menuItem.setVisible((interfaceC2557M37050 instanceof C6794) && ((C15404) interfaceC2557M37050).getName().toLowerCase(Locale.ROOT).endsWith(".9.png") && (c0103 = this.f50444) != null && c0103.m1123(this.f50442.mo19708()) != null);
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.more) {
            C16195 c16195M3001 = C0671.m3001(this.f41645.findViewById(R.id.more));
            C12418 c12418M38298 = c16195M3001.m38298();
            C17356.m40381(c12418M38298, R.string.MT_Protector);
            c12418M38298.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setCheckable(true).setChecked(!this.f50435.f75415);
            c12418M38298.add(0, R.string.MT_Protector, 1, R.string.MT_Protector).setCheckable(true).setChecked(this.f50435.f75415);
            c12418M38298.setGroupCheckable(0, true, true);
            c16195M3001.m38296(new C22536(this));
            C18498.m42893(C0671.m3000(c16195M3001));
            return true;
        }
        if (menuItem.getItemId() == R.string.MT_Protector || menuItem.getItemId() == R.string.MT_Protector) {
            menuItem.setChecked(true);
            boolean z = menuItem.getItemId() == R.string.MT_Protector;
            if (this.f50435.f75415 != z && this.f50444 != null && !this.f50450) {
                m37027();
                int iMo19708 = this.f50442.mo19708();
                C23242 c23242 = this.f50435;
                c23242.f75415 = z;
                c23242.f75408 = null;
                m37045();
                this.f50444.m1131(this.f50442, iMo19708);
                m37047();
                m37026();
                ApplicationC0716.f2992.edit().putBoolean("pvc", z).apply();
                invalidateOptionsMenu();
            }
        } else {
            if (menuItem.getItemId() == R.string.MT_Protector) {
                this.f50436 = (this.f50436 + 1) % 3;
                m37047();
                ApplicationC0716.f2992.edit().mo4065(this.f50436, "pvbi").apply();
                return true;
            }
            if (menuItem.getItemId() == R.string.MT_Protector) {
                InterfaceC2557 interfaceC2557M37050 = m37050();
                if ((interfaceC2557M37050 instanceof C6794) && ((C15404) interfaceC2557M37050).getName().toLowerCase(Locale.ROOT).endsWith(".9.png")) {
                    AbstractC20745 abstractC20745Mo7989 = ((C6794) interfaceC2557M37050).mo7989();
                    startActivity(new Intent(this, (Class<?>) ActivityC15472.class).setAction("android.intent.action.VIEW").setData(abstractC20745Mo7989.mo40126() ? abstractC20745Mo7989.mo40127() : abstractC20745Mo7989.m46732()));
                    return true;
                }
            } else {
                return super.onOptionsItemSelected(menuItem);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m37052(ActivityC15481 activityC15481, int i) {
        ArrayList arrayList = activityC15481.f50453;
        if (activityC15481.f50444 == null || activityC15481.f50450 || activityC15481.isFinishing() || i < 0 || i >= arrayList.size()) {
            return;
        }
        InterfaceC2557 interfaceC2557M37029 = activityC15481.m37029(i);
        if (C13012.m32190(interfaceC2557M37029)) {
            ArrayList arrayList2 = new ArrayList();
            int size = -1;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (C13012.m32190(activityC15481.m37029(i2))) {
                    if (i2 == i) {
                        size = arrayList2.size();
                    }
                    arrayList2.add(activityC15481.m37029(i2));
                }
            }
            activityC15481.m37027();
            C12670.m31503(ActivityC15481.class, new C21830(activityC15481.f50435.f75414.m48600(), arrayList2, size), "VideoPlayerArguments");
            Intent intent = new Intent(activityC15481, (Class<?>) ActivityC10957.class);
            ActivityC10957.m27597(activityC15481, intent, activityC15481.f50435.f75414.m48600(), interfaceC2557M37029);
            activityC15481.startActivity(intent);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m37051(final ActivityC15481 activityC15481) {
        ArrayList arrayList = activityC15481.f50453;
        if (activityC15481.f50444 == null || activityC15481.f50454 != null || activityC15481.m37050() == null) {
            return;
        }
        final ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            if (activityC15481.f50435.f75410.contains(activityC15481.m37029(i).getPath())) {
                arrayList2.add((AbstractC1886) arrayList.get(i));
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add((AbstractC1886) arrayList.get(activityC15481.f50442.mo19708()));
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        activityC15481.f50454 = atomicBoolean;
        final C17485 c17485 = new C17485(activityC15481, R.string.MT_Protector);
        activityC15481.f50448 = c17485;
        c17485.m40697(new RunnableC23440(4, atomicBoolean));
        c17485.m40701(200);
        activityC15481.f50441.setEnabled(false);
        C4716.f16636.execute(new Runnable() { // from class: l.֫۟۬
            @Override // java.lang.Runnable
            public final void run() {
                final ActivityC15481 activityC15482 = this.f6663;
                final ArrayList arrayList3 = arrayList2;
                final AtomicBoolean atomicBoolean2 = atomicBoolean;
                final C17485 c17486 = c17485;
                int i2 = ActivityC15481.f50434;
                try {
                    final C12099 c12099M39812 = C17037.m39812(arrayList3, new C13364(atomicBoolean2));
                    activityC15482.runOnUiThread(new Runnable() { // from class: l.ۢ۟۬
                        @Override // java.lang.Runnable
                        public final void run() {
                            ActivityC15481.m37042(activityC15482, c17486, atomicBoolean2, c12099M39812, arrayList3);
                        }
                    });
                } catch (Exception e) {
                    activityC15482.runOnUiThread(new RunnableC3091(activityC15482, c17486, atomicBoolean2, e));
                }
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37042(ActivityC15481 activityC15481, C17485 c17485, AtomicBoolean atomicBoolean, C12099 c12099, ArrayList arrayList) {
        String str;
        c17485.m40694();
        if (activityC15481.f50454 == atomicBoolean) {
            activityC15481.f50454 = null;
            activityC15481.f50448 = null;
        }
        try {
            try {
                if (!atomicBoolean.get() && !activityC15481.isFinishing() && !activityC15481.isDestroyed()) {
                    C5465 c5465 = new C5465(activityC15481);
                    c5465.m15129();
                    Iterator it = arrayList.iterator();
                    boolean z = false;
                    boolean z2 = false;
                    while (it.hasNext()) {
                        if (((AbstractC1886) it.next()).m6142()) {
                            z2 = true;
                        } else {
                            z = true;
                        }
                    }
                    if (z && z2) {
                        str = "*/*";
                    } else {
                        str = z2 ? "video/*" : "image/*";
                    }
                    c5465.m15133(str);
                    Iterator it2 = c12099.m30087().iterator();
                    while (it2.hasNext()) {
                        c5465.m15130((Uri) it2.next());
                    }
                    c5465.m15132();
                    c12099.m30088();
                    c12099.close();
                    if (activityC15481.isDestroyed()) {
                        return;
                    }
                    activityC15481.m37026();
                    return;
                }
                c12099.close();
                if (activityC15481.isDestroyed()) {
                    return;
                }
                activityC15481.m37026();
            } catch (Exception unused) {
                C15829.m37611(R.string.MT_Protector);
            } finally {
                if (!activityC15481.isDestroyed()) {
                    activityC15481.m37026();
                }
            }
        } catch (Throwable th) {
            try {
                c12099.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37041(ActivityC15481 activityC15481, C17485 c17485, AtomicBoolean atomicBoolean) {
        c17485.m40694();
        if (activityC15481.f50454 == atomicBoolean) {
            activityC15481.f50454 = null;
            activityC15481.f50448 = null;
        }
        if (!atomicBoolean.get() && !activityC15481.isFinishing() && !activityC15481.isDestroyed()) {
            C15829.m37611(R.string.MT_Protector);
        }
        if (activityC15481.isDestroyed()) {
            return;
        }
        activityC15481.m37026();
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    private void m37032() {
        C15829.m37611(R.string.MT_Protector);
        finish();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m37058(ActivityC15481 activityC15481) {
        activityC15481.m37044(false);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m37067(ActivityC15481 activityC15481) {
        activityC15481.m37044(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m37044(boolean z) {
        AbstractC12068 abstractC12068M15770;
        if (isFinishing() || this.f50450) {
            return;
        }
        C23242 c23242 = this.f50435;
        if (c23242 != null && c23242.f75411 && c23242.f75414 != null) {
            ArrayList arrayListM37061 = m37061();
            Intent intentPutExtra = new Intent().putExtra("gallery.currentPath", this.f50435.f75409);
            if (!arrayListM37061.isEmpty()) {
                intentPutExtra.putStringArrayListExtra("paths", arrayListM37061);
            }
            setResult(-1, intentPutExtra);
        }
        this.f50450 = true;
        InterfaceC2557 interfaceC2557M37050 = m37050();
        if (interfaceC2557M37050 != null) {
            if (!(this.f50435.f75414.m48600() instanceof C21611)) {
                AbstractC9677 abstractC9677M48600 = this.f50435.f75414.m48600();
                if ((abstractC9677M48600 instanceof AbstractC12233) && (abstractC12068M15770 = C5717.m15770(((AbstractC12233) abstractC9677M48600).m30345().f40385)) != null) {
                    C23186.m51183(interfaceC2557M37050.getPath(), new C5546(abstractC12068M15770, false));
                }
            } else if (!(interfaceC2557M37050.mo7989() instanceof C22383)) {
                String path = interfaceC2557M37050.getPath();
                C23186 c23186 = C23186.f75236;
                C13465.m32966(path, MotionUtils.EASING_TYPE_PATH);
                C23186.m51183(path, (C5546) null);
            }
        }
        ValueAnimator valueAnimator = this.f50439;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f50439 = null;
        }
        m37069();
        if (!z) {
            this.f50442.mo19691();
            if (this.f50449) {
                m37030(false);
            }
        }
        finish();
        if (z) {
            overridePendingTransition(0, 0);
        }
    }

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    private void m37047() {
        this.f50442.mo19705(f50433[this.f50436]);
        m37055();
    }

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    private void m37055() {
        int i;
        View viewM31016 = m31016(R.id.MT_Protector);
        int i2 = this.f50437;
        if (i2 == 0) {
            i = 0;
        } else {
            i = (i2 << 24) | (f50433[this.f50436] & 16777215);
        }
        viewM31016.setBackgroundColor(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m37037(ActivityC15481 activityC15481, ValueAnimator valueAnimator) {
        activityC15481.f50437 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        activityC15481.m37055();
    }

    @Override // l.AbstractActivityC12483, l.ActivityC10074, l.ActivityC19126, android.app.Activity
    public final void onDestroy() {
        ValueAnimator valueAnimator = this.f50439;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f50439 = null;
        }
        this.f50443.set(true);
        AtomicBoolean atomicBoolean = this.f50454;
        if (atomicBoolean != null) {
            atomicBoolean.set(true);
        }
        C17485 c17485 = this.f50448;
        if (c17485 != null) {
            c17485.m40694();
        }
        C0103 c0103 = this.f50444;
        if (c0103 != null) {
            c0103.close();
        }
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public void m37030(boolean z) {
        if (z && this.f50449) {
            return;
        }
        final int i = this.f50456 + 1;
        this.f50456 = i;
        ValueAnimator valueAnimator = this.f50439;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f50439 = null;
        }
        this.f50446 = false;
        this.f50437 = 255;
        m37047();
        try {
            if (z) {
                Class<?> cls = Class.forName("android.app.Activity$TranslucentConversionListener");
                Activity.class.getDeclaredMethod("convertToTranslucent", cls, ActivityOptions.class).invoke(this, Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: l.ܰ᩷۬
                    @Override // java.lang.reflect.InvocationHandler
                    public final Object invoke(Object obj, Method method, Object[] objArr) {
                        int i2 = ActivityC15481.f50434;
                        if (!method.getName().equals("onTranslucentConversionComplete") || objArr == null || !Boolean.TRUE.equals(objArr[0])) {
                            return null;
                        }
                        int i3 = i;
                        ActivityC15481 activityC15481 = this.f46217;
                        activityC15481.runOnUiThread(new RunnableC14540(i3, 1, activityC15481));
                        return null;
                    }
                }), null);
            } else if (Build.VERSION.SDK_INT >= 30) {
                setTranslucent(false);
            } else {
                Activity.class.getDeclaredMethod("convertFromTranslucent", null).invoke(this, null);
            }
            this.f50449 = z;
        } catch (ReflectiveOperationException | RuntimeException unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37036(final ActivityC15481 activityC15481, int i) {
        if (i != activityC15481.f50456 || activityC15481.f50450 || activityC15481.isFinishing() || activityC15481.isDestroyed() || activityC15481.f50446) {
            return;
        }
        activityC15481.f50446 = true;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(activityC15481.f50437, 0);
        activityC15481.f50439 = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(180L);
        activityC15481.f50439.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ۙ᩷۬
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ActivityC15481.m37037(this.f17179, valueAnimator);
            }
        });
        activityC15481.f50439.start();
    }

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    private ArrayList m37061() {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (String str : this.f50435.f75407) {
            if (this.f50435.f75410.contains(str) && hashSet.add(str)) {
                arrayList.add(str);
            }
        }
        C21830 c21830 = this.f50435.f75414;
        if (c21830 != null) {
            for (InterfaceC2557 interfaceC2557 : c21830.m48602()) {
                if (this.f50435.f75410.contains(interfaceC2557.getPath()) && hashSet.add(interfaceC2557.getPath())) {
                    arrayList.add(interfaceC2557.getPath());
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m37027() {
        if (this.f50444 == null || m37050() == null) {
            return;
        }
        this.f50435.f75409 = m37050().getPath();
        this.f50435.f75408 = this.f50442.mo19713();
        C23242 c23242 = this.f50435;
        c23242.f75416 = (c23242.f75411 && c23242.f75414.m48600() == C21611.f70098 && (m37050() instanceof C6794) && m37050().mo7989().mo36912()) ? m37050().mo7989().m46732() : null;
    }

    @Override // l.ActivityC1086, l.ActivityC16858, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        Uri uri;
        m37027();
        bundle.putBoolean("gallery.internal", this.f50435.f75411);
        bundle.putString("gallery.path", this.f50435.f75409);
        bundle.putBundle("gallery.viewport", this.f50435.f75408);
        bundle.putBoolean("gallery.bars", this.f50435.f75412);
        bundle.putBoolean("gallery.continuous", this.f50435.f75415);
        C23242 c23242 = this.f50435;
        if (c23242.f75411 && (uri = c23242.f75416) != null) {
            bundle.putString("gallery.localUri", uri.toString());
            bundle.putStringArrayList("gallery.selected", m37061());
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // l.AbstractActivityC12483, l.ActivityC19126, android.app.Activity
    public final void onResume() {
        super.onResume();
        C0103 c0103 = this.f50444;
        if (c0103 != null) {
            c0103.m1127(true);
        }
    }

    @Override // l.ActivityC1086, android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        C0103 c0103 = this.f50444;
        if (c0103 == null || i == 20) {
            return;
        }
        c0103.m1133();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        C0103 c0103 = this.f50444;
        if (c0103 != null) {
            c0103.m1133();
        }
    }

    @Override // l.AbstractActivityC12483, l.ActivityC19126, android.app.Activity
    public final void onPause() {
        m37027();
        C0103 c0103 = this.f50444;
        if (c0103 != null) {
            c0103.m1127(false);
        }
        this.f50442.mo19691();
        super.onPause();
    }

    @Override // l.AbstractActivityC12483, l.ActivityC10074, l.ActivityC19126, android.app.Activity
    public final void onStop() {
        AtomicBoolean atomicBoolean = this.f50454;
        if (atomicBoolean != null) {
            atomicBoolean.set(true);
        }
        C17485 c17485 = this.f50448;
        if (c17485 != null) {
            c17485.m40694();
        }
        super.onStop();
    }

    @Override // l.ActivityC1086, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f50450 = false;
        this.f50443.set(true);
        this.f50443 = new AtomicBoolean();
        AtomicBoolean atomicBoolean = this.f50454;
        if (atomicBoolean != null) {
            atomicBoolean.set(true);
        }
        C0103 c0103 = this.f50444;
        if (c0103 != null) {
            c0103.close();
        }
        this.f50444 = null;
        this.f50453.clear();
        C23242 c23242 = this.f50435;
        c23242.f75414 = null;
        c23242.f75410.clear();
        c23242.f75407.clear();
        c23242.f75409 = null;
        c23242.f75416 = null;
        c23242.f75408 = null;
        c23242.f75411 = false;
        c23242.f75412 = true;
        setIntent(intent);
        setTitle(R.string.MT_Protector);
        this.f41645.setSubtitle((CharSequence) null);
        this.f50452.setText(R.string.MT_Protector);
        this.f50440.setVisibility(8);
        this.f50441.setEnabled(false);
        m37054(true);
        m37031();
        m37060(true);
    }
}
