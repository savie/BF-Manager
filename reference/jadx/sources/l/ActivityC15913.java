package l;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CompoundButton;
import android.widget.TextView;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ܶۜۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: X8B6 */
/* JADX INFO: loaded from: classes5.dex */
public class ActivityC15913 extends AbstractActivityC17204 {

    /* JADX INFO: renamed from: ۖ᩷, reason: not valid java name and contains not printable characters */
    public static final int[] f51684 = {-16777216, -1, -7829368};

    /* JADX INFO: renamed from: ۡ᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f51685 = 0;

    /* JADX INFO: renamed from: ֨᩷, reason: not valid java name and contains not printable characters */
    public C9722 f51687;

    /* JADX INFO: renamed from: ֫᩷, reason: not valid java name and contains not printable characters */
    public View f51688;

    /* JADX INFO: renamed from: ۗ᩷, reason: not valid java name and contains not printable characters */
    public boolean f51689;

    /* JADX INFO: renamed from: ۘ᩷, reason: not valid java name and contains not printable characters */
    public C22403 f51690;

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public boolean f51691;

    /* JADX INFO: renamed from: ۛ᩷, reason: not valid java name and contains not printable characters */
    public TextView f51692;

    /* JADX INFO: renamed from: ۟᩷, reason: not valid java name and contains not printable characters */
    public C17405 f51693;

    /* JADX INFO: renamed from: ۢ᩷, reason: not valid java name and contains not printable characters */
    public boolean f51694;

    /* JADX INFO: renamed from: ۧ᩷, reason: not valid java name and contains not printable characters */
    public C23373 f51695;

    /* JADX INFO: renamed from: ۨ᩷, reason: not valid java name and contains not printable characters */
    public AbstractC13628 f51696;

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public int f51697;

    /* JADX INFO: renamed from: ܰ᩷, reason: not valid java name and contains not printable characters */
    public View f51698;

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public int f51699;

    /* JADX INFO: renamed from: ܶ᩷, reason: not valid java name and contains not printable characters */
    public MenuItem f51700;

    /* JADX INFO: renamed from: ܺ᩷, reason: not valid java name and contains not printable characters */
    public C21178 f51701;

    /* JADX INFO: renamed from: ܽ᩷, reason: not valid java name and contains not printable characters */
    public float f51702;

    /* JADX INFO: renamed from: ܿ᩷, reason: not valid java name and contains not printable characters */
    public C13511 f51703;

    /* JADX INFO: renamed from: ᩳ᩷, reason: not valid java name and contains not printable characters */
    public boolean f51704;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public ValueAnimator f51705;

    /* JADX INFO: renamed from: ᩵᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC6917 f51706;

    /* JADX INFO: renamed from: ᩶᩷, reason: not valid java name and contains not printable characters */
    public AtomicBoolean f51707;

    /* JADX INFO: renamed from: ᩹᩷, reason: not valid java name and contains not printable characters */
    public boolean f51709;

    /* JADX INFO: renamed from: ᩻᩷, reason: not valid java name and contains not printable characters */
    public AtomicBoolean f51711;

    /* JADX INFO: renamed from: ֡᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f51686 = new ArrayList();

    /* JADX INFO: renamed from: ᩺᩷, reason: not valid java name and contains not printable characters */
    public AtomicBoolean f51710 = new AtomicBoolean();

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public int f51708 = 255;

    @Override // l.ActivityC7405
    /* JADX INFO: renamed from: ۛ */
    public final int mo18669() {
        return 2;
    }

    @Override // l.AbstractActivityC17204
    /* JADX INFO: renamed from: ᩶ */
    public final String mo122() {
        return "ImageViewerActivity";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37885(Activity activity, AbstractC22044 abstractC22044, String str) {
        m37886(activity, abstractC22044, str, false);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m37929(Activity activity, AbstractC22044 abstractC22044, String str) {
        m37886(activity, abstractC22044, str, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37886(Activity activity, AbstractC22044 abstractC22044, String str, boolean z) {
        if (!m37898(abstractC22044, z)) {
            throw new IllegalArgumentException("Invalid editor preview snapshot");
        }
        activity.startActivity(new Intent(activity, (Class<?>) ActivityC15913.class).setData(abstractC22044.m49836()).putExtra("gallery.editorPreview", true).putExtra("gallery.vectorPreview", z).putExtra("gallery.previewTitle", str));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m37898(AbstractC22044 abstractC22044, boolean z) {
        if (!abstractC22044.mo4295() || !abstractC22044.mo4304()) {
            return false;
        }
        if (!(z ? ".xml" : ".svg").equalsIgnoreCase(abstractC22044.m49864())) {
            return false;
        }
        try {
            return new File(C6382.f21565.mo4294()).getCanonicalFile().equals(new File(abstractC22044.mo4294()).getCanonicalFile().getParentFile());
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    private boolean m37882() {
        Intent intent = getIntent();
        return intent.getComponent() != null && getClass().getName().equals(intent.getComponent().getClassName());
    }

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    private boolean m37900() {
        return m37882() && getIntent().getBooleanExtra("gallery.editorPreview", false);
    }

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    private boolean m37941() {
        return m37882() && getIntent().getBooleanExtra("gallery.vectorPreview", false);
    }

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    private boolean m37910() {
        return m37900() || m37941();
    }

    @Override // l.AbstractActivityC17204, l.ActivityC7405, l.ActivityC3409, l.ActivityC5577, l.ActivityC8866, android.app.Activity
    public final void onCreate(Bundle bundle) {
        this.f56044 = false;
        setTheme(C7207.m19791());
        getTheme().applyStyle(R.style.MT_Protector, true);
        super.onCreate(bundle);
        this.f51693 = (C17405) new C16196(this).m38422(C17405.class);
        m40418(R.layout.MT_Protector);
        this.f51696 = (AbstractC13628) m40418(R.id.MT_Protector);
        boolean z = true;
        if (m37910()) {
            C17405 c17405 = this.f51693;
            c17405.f56588 = false;
            c17405.f56589 = true;
        } else if (!this.f51693.f56589) {
            boolean z2 = ApplicationC17729.f58258.getBoolean("pvc", false);
            C17405 c17406 = this.f51693;
            if (bundle != null) {
                z2 = bundle.getBoolean("gallery.continuous", z2);
            }
            c17406.f56588 = z2;
            this.f51693.f56589 = true;
        }
        if (this.f51693.f56588) {
            m37920();
        }
        this.f51688 = m40418(R.id.MT_Protector);
        this.f56046 = (C16390) m40418(R.id.MT_Protector);
        this.f51695 = (C23373) m40418(R.id.MT_Protector);
        this.f51692 = (TextView) m40418(R.id.MT_Protector);
        this.f51698 = m40418(R.id.MT_Protector);
        m40407(this.f56046);
        m40393();
        this.f56046.setNavigationOnClickListener(new ViewOnClickListenerC21881(this, 0));
        Window window = getWindow();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.layoutInDisplayCutoutMode = i >= 30 ? 3 : 1;
            window.setAttributes(attributes);
        }
        window.setBackgroundDrawableResource(android.R.color.transparent);
        C18190.m42352(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        C18893 c18893M40417 = m40417();
        c18893M40417.m43816(false);
        c18893M40417.m43812(false);
        c18893M40417.m43815(2);
        C22666.m51097(m40418(R.id.MT_Protector), new InterfaceC22491() { // from class: l.ۤۜۚ
            @Override // l.InterfaceC22491
            public final C3977 onApplyWindowInsets(View view, C3977 c3977) {
                ActivityC15913.m37894(this.f33930, c3977);
                return c3977;
            }
        });
        int i2 = ApplicationC17729.f58258.getInt("pvbi", 0);
        this.f51697 = i2;
        if (i2 < 0 || i2 >= 3) {
            this.f51697 = 0;
        }
        m37884();
        C16659 c16659 = new C16659(this);
        this.f51706 = c16659;
        this.f51696.mo1641(c16659);
        this.f51695.setSaveEnabled(false);
        this.f51695.setContentDescription(getString(R.string.MT_Protector));
        this.f51695.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.᩸ۜۚ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
                ActivityC15913.m37897(this.f73221, z3);
            }
        });
        this.f51698.setContentDescription(getString(R.string.MT_Protector));
        this.f51698.setOnClickListener(new ViewOnClickListenerC19643(this, 0));
        this.f51698.setEnabled(false);
        this.f51695.setVisibility(8);
        this.f51692.setText(R.string.MT_Protector);
        if (bundle != null) {
            m37924(false);
        }
        getOnBackPressedDispatcher().m19403(this, new C24865(this));
        C17405 c17407 = this.f51693;
        if (c17407.f56599 != null) {
            m37934();
            return;
        }
        if (bundle != null) {
            c17407.f56598 = bundle.getBoolean("gallery.internal");
            this.f51693.f56592 = bundle.getString("gallery.path");
            this.f51693.f56596 = bundle.getBundle("gallery.viewport");
            this.f51693.f56597 = bundle.getBoolean("gallery.bars", true);
            if (this.f51693.f56598) {
                String string = bundle.getString("gallery.localUri");
                if (string == null) {
                    m37916();
                    return;
                }
                this.f51693.f56595 = Uri.parse(string);
                ArrayList<String> stringArrayList = bundle.getStringArrayList("gallery.selected");
                if (stringArrayList != null) {
                    for (String str : stringArrayList) {
                        if (this.f51693.f56591.add(str)) {
                            this.f51693.f56593.add(str);
                        }
                    }
                }
                C5261.f18540.execute(new RunnableC12930(this, z, this.f51693.f56595, new ArrayList(this.f51693.f56593), this.f51710));
                return;
            }
        }
        m37907(bundle == null);
    }

    @Override // android.app.Activity
    public final void onEnterAnimationComplete() {
        super.onEnterAnimationComplete();
        this.f51709 = true;
        if (this.f51702 <= 0.0f || this.f51689 || isFinishing() || isDestroyed()) {
            return;
        }
        m37924(true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m37894(ActivityC15913 activityC15913, C3977 c3977) {
        C13275 c13275M12832 = c3977.m12832(135);
        C16390 c16390 = activityC15913.f56046;
        int i = c13275M12832.f42407;
        int i2 = c13275M12832.f42408;
        int i3 = c13275M12832.f42406;
        c16390.setPadding(i, i2, i3, 0);
        activityC15913.f51688.setPadding(c13275M12832.f42407, 0, i3, c13275M12832.f42405);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m37897(ActivityC15913 activityC15913, boolean z) {
        InterfaceC2386 interfaceC2386M37925;
        if (activityC15913.f51694) {
            return;
        }
        C17405 c17405 = activityC15913.f51693;
        if (!c17405.f56598 || c17405.f56599 == null || (interfaceC2386M37925 = activityC15913.m37925()) == null) {
            return;
        }
        if (z) {
            activityC15913.f51693.f56591.add(interfaceC2386M37925.getPath());
        } else {
            activityC15913.f51693.f56591.remove(interfaceC2386M37925.getPath());
            activityC15913.f51693.f56593.remove(interfaceC2386M37925.getPath());
        }
        activityC15913.m37902();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m37907(boolean z) {
        Intent intent = getIntent();
        boolean zM37882 = m37882();
        boolean z2 = false;
        C12184 c12184 = null;
        abstractC22044M35193 = null;
        abstractC22044M35193 = null;
        AbstractC22044 abstractC22044M35193 = null;
        c12184 = null;
        c12184 = null;
        if (m37910()) {
            Uri data = intent.getData();
            if (data != null && "file".equals(data.getScheme()) && data.getPath() != null) {
                abstractC22044M35193 = C14584.m35193(data.getPath(), new String[0]);
            }
            if (abstractC22044M35193 == null || !abstractC22044M35193.mo4295() || !abstractC22044M35193.mo4304() || (m37900() && !m37898(abstractC22044M35193, m37941()))) {
                m37916();
                return;
            }
            if (m37900()) {
                this.f51693.f56594 = abstractC22044M35193;
            }
            this.f51693.f56590 = intent.getStringExtra("gallery.previewTitle");
            C17405 c17405 = this.f51693;
            C11969 c11969 = C11969.f38536;
            Object[] objArr = {new C6004(abstractC22044M35193)};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            c17405.f56599 = new C12184(c11969, C24579.m54899(obj, arrayList, obj, arrayList), 0);
            this.f51693.f56592 = abstractC22044M35193.mo4294();
            m37934();
            return;
        }
        if (z && zM37882 && intent.getData() == null) {
            c12184 = (C12184) C23391.m52571("ImageViewerArguments");
        }
        if (c12184 == null) {
            C5261.f18540.execute(new RunnableC12930(this, z2, intent.getData(), new ArrayList(this.f51693.f56593), this.f51710));
            return;
        }
        if (c12184.m30459() == null || c12184.m30460() == null || c12184.m30460().isEmpty() || c12184.m30458() < 0 || c12184.m30458() >= c12184.m30460().size()) {
            m37916();
            return;
        }
        Iterator it = c12184.m30460().iterator();
        while (it.hasNext()) {
            if (((InterfaceC2386) it.next()) == null) {
                m37916();
                return;
            }
        }
        this.f51693.f56599 = new C12184(c12184.m30459(), new ArrayList(c12184.m30460()), c12184.m30458());
        C17405 c17406 = this.f51693;
        c17406.f56598 = true;
        c17406.f56592 = m37903(c12184.m30458()).getPath();
        m37934();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m37892(ActivityC15913 activityC15913, AtomicBoolean atomicBoolean, C12184 c12184) {
        if (atomicBoolean.get() || activityC15913.isFinishing() || activityC15913.isDestroyed()) {
            return;
        }
        activityC15913.f51693.f56599 = c12184;
        activityC15913.m37934();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m37891(ActivityC15913 activityC15913, AtomicBoolean atomicBoolean) {
        if (atomicBoolean.get() || activityC15913.isFinishing() || activityC15913.isDestroyed()) {
            return;
        }
        activityC15913.m37916();
    }

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    private void m37920() {
        AbstractC13628 abstractC13628 = this.f51696;
        ViewGroup viewGroup = (ViewGroup) abstractC13628.getParent();
        int iIndexOfChild = viewGroup.indexOfChild(abstractC13628);
        AbstractC13628 c0205 = this.f51693.f56588 ? new C0205(this) : new C22907(this, null);
        this.f51696 = c0205;
        c0205.setId(R.id.MT_Protector);
        this.f51696.mo1641(this.f51706);
        viewGroup.removeView(abstractC13628);
        viewGroup.addView(this.f51696, iIndexOfChild, abstractC13628.getLayoutParams());
    }

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    private void m37934() {
        ArrayList arrayList;
        AbstractC22044 abstractC22044M35193;
        C12184 c12184 = this.f51693.f56599;
        int iM30458 = c12184.m30458();
        if (this.f51693.f56592 != null) {
            iM30458 = 0;
            while (true) {
                if (iM30458 >= c12184.m30460().size()) {
                    iM30458 = -1;
                    break;
                } else if (this.f51693.f56592.equals(m37903(iM30458).getPath())) {
                    break;
                } else {
                    iM30458++;
                }
            }
        }
        if (iM30458 < 0 || iM30458 >= c12184.m30460().size()) {
            m37916();
            return;
        }
        try {
            Iterator it = c12184.m30460().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                arrayList = this.f51686;
                if (!zHasNext) {
                    break;
                } else {
                    arrayList.add(AbstractC13057.m32542(this, c12184.m30459(), (InterfaceC2386) it.next()));
                }
            }
            if (m37941()) {
                AbstractC22044 abstractC22044Mo8093 = m37903(0).mo8093();
                if (m37900()) {
                    abstractC22044M35193 = C14584.m35193(abstractC22044Mo8093.mo4294() + ".arsc", new String[0]);
                } else {
                    String parent = abstractC22044Mo8093.getParent();
                    abstractC22044M35193 = parent == null ? null : C14584.m35193(parent, "resources.arsc");
                }
                C9722 c9722 = new C9722(abstractC22044Mo8093, abstractC22044M35193, this.f51696, new RunnableC5473(0, this));
                this.f51687 = c9722;
                c9722.m25314();
                Bundle bundle = this.f51693.f56596;
                if (bundle != null) {
                    this.f51696.mo1645(bundle);
                }
                m37936(this.f51693.f56597);
                m37902();
                return;
            }
            C22403 c22403 = new C22403(this, arrayList);
            this.f51690 = c22403;
            c22403.m50539(getLifecycle().mo23076().m8762(EnumC2619.RESUMED));
            this.f51690.m50537(new RunnableC5473(0, this));
            this.f51690.m50538(this.f51696, iM30458);
            Bundle bundle2 = this.f51693.f56596;
            if (bundle2 != null) {
                this.f51696.mo1645(bundle2);
            }
            this.f51693.f56592 = m37903(iM30458).getPath();
            m37936(this.f51693.f56597);
            m37902();
        } catch (RuntimeException unused) {
            m37916();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public InterfaceC2386 m37903(int i) {
        return (InterfaceC2386) this.f51693.f56599.m30460().get(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC2386 m37925() {
        int iMo1650 = this.f51696.mo1650();
        C12184 c12184 = this.f51693.f56599;
        if (c12184 == null || iMo1650 < 0 || iMo1650 >= c12184.m30460().size()) {
            return null;
        }
        return m37903(iMo1650);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public void m37902() {
        InterfaceC2386 interfaceC2386M37925 = m37925();
        if (interfaceC2386M37925 == null) {
            return;
        }
        int iMo1650 = this.f51696.mo1650();
        String name = this.f51693.f56590;
        if (name == null) {
            name = interfaceC2386M37925.getName();
        }
        setTitle(name);
        boolean z = false;
        String str = String.format(Locale.getDefault(), "%d/%d", Integer.valueOf(iMo1650 + 1), Integer.valueOf(this.f51686.size()));
        this.f51692.setText(str);
        this.f51696.setContentDescription(interfaceC2386M37925.getName() + " " + str);
        C9722 c9722 = this.f51687;
        C9044 c9044M25311 = c9722 != null ? c9722.m25311() : this.f51690.m50542(iMo1650);
        C21178 c21178 = this.f51701;
        if (c21178 != null) {
            c21178.m48322(c9044M25311);
        }
        if (c9044M25311 == null) {
            C16390 c16390 = this.f56046;
            C9722 c9723 = this.f51687;
            c16390.setSubtitle((c9723 == null ? !this.f51690.m50541(iMo1650) : !c9723.m25313()) ? null : getString(R.string.MT_Protector));
        } else {
            int i = c9044M25311.f29428;
            int i2 = c9044M25311.f29431;
            C15294 c15294 = c9044M25311.f29430;
            long time = c9044M25311.f29429;
            if (time < 0) {
                time = c15294.f50005;
            }
            if (time <= 0) {
                time = interfaceC2386M37925.getTime();
            }
            long j = c15294.f50004;
            String strM22393 = j >= 0 ? C8311.m22393(j) : null;
            int i3 = c9044M25311.f29434;
            int i4 = i3 >= 5 ? i2 : i;
            if (i3 < 5) {
                i = i2;
            }
            Locale locale = Locale.ENGLISH;
            String strM3016 = C0703.m3016(MotionUtils.EASING_TYPE_FORMAT_START, i4, "x", MotionUtils.EASING_TYPE_FORMAT_END, i);
            if (!C6790.m18961(interfaceC2386M37925)) {
                strM22393 = strM22393 == null ? strM3016 : C20196.m46451(strM22393, EnumC7687.f25319, strM3016);
            } else if (strM22393 == null) {
                strM22393 = "";
            }
            C16390 c16391 = this.f56046;
            if (time > 0) {
                strM22393 = C22482.m50713(time) + EnumC7687.f25319 + strM22393;
            }
            c16391.setSubtitle(strM22393);
        }
        TextView textViewM18916 = C6784.m18916(this.f56046);
        if (textViewM18916 != null && C18085.m42115(textViewM18916) == 0) {
            int iMax = Math.max(2, Math.round(textViewM18916.getTextSize()));
            textViewM18916.setHorizontallyScrolling(false);
            textViewM18916.setMaxLines(1);
            ViewGroup.LayoutParams layoutParams = textViewM18916.getLayoutParams();
            layoutParams.width = -1;
            textViewM18916.setLayoutParams(layoutParams);
            Paint.FontMetricsInt fontMetricsInt = textViewM18916.getPaint().getFontMetricsInt();
            textViewM18916.setMinHeight(textViewM18916.getCompoundPaddingBottom() + textViewM18916.getCompoundPaddingTop() + (fontMetricsInt.bottom - fontMetricsInt.top));
            C18085.m42119(textViewM18916, iMax);
        }
        this.f51694 = true;
        this.f51695.setVisibility(this.f51693.f56598 ? 0 : 8);
        this.f51695.setChecked(this.f51693.f56591.contains(interfaceC2386M37925.getPath()));
        this.f51695.setText(this.f51693.f56591.isEmpty() ? null : String.valueOf(this.f51693.f56591.size()));
        this.f51694 = false;
        View view = this.f51698;
        if (!m37910() && this.f51707 == null) {
            z = true;
        }
        view.setEnabled(z);
        m37939();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public void m37936(boolean z) {
        this.f51693.f56597 = z;
        int i = 4;
        this.f56046.setVisibility(z ? 0 : 4);
        View view = this.f51688;
        if (m37910()) {
            i = 8;
        } else if (z) {
            i = 0;
        }
        view.setVisibility(i);
        m37912();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public void m37912() {
        if (isFinishing() || isDestroyed()) {
            return;
        }
        if (this.f51693.f56597 || this.f51702 > 0.0f || this.f51689) {
            m40417().m43814(7);
        } else {
            m40417().m43811(7);
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        this.f51700 = m37910() ? null : menu.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector).setShowAsActionFlags(2);
        menu.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector).setShowAsActionFlags(2);
        if (!m37910()) {
            menu.add(0, R.id.more, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector).setShowAsActionFlags(2);
        }
        m37939();
        return true;
    }

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    private void m37939() {
        C22403 c22403;
        InterfaceC2386 interfaceC2386M37925 = m37925();
        MenuItem menuItem = this.f51700;
        if (menuItem != null) {
            menuItem.setVisible((interfaceC2386M37925 instanceof C6004) && ((C13352) interfaceC2386M37925).getName().toLowerCase(Locale.ROOT).endsWith(".9.png") && (c22403 = this.f51690) != null && c22403.m50542(this.f51696.mo1650()) != null);
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.more) {
            if (!m37910()) {
                C18452 c18452 = new C18452(m37914(), this.f56046.findViewById(R.id.more), 8388611, R.attr.MT_Protector);
                C9898 c9898M42995 = c18452.m42995();
                if (m37925() != null && !C6790.m18961(m37925())) {
                    c9898M42995.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                }
                c9898M42995.setGroupDividerEnabled(true);
                c9898M42995.add(1, R.string.MT_Protector, 1, R.string.MT_Protector).setCheckable(true).setChecked(!this.f51693.f56588);
                c9898M42995.add(1, R.string.MT_Protector, 2, R.string.MT_Protector).setCheckable(true).setChecked(this.f51693.f56588);
                c9898M42995.setGroupCheckable(1, true, true);
                c18452.m42994(new InterfaceC21436() { // from class: l.ܳۜۚ
                    @Override // l.InterfaceC21436
                    public final boolean onMenuItemClick(MenuItem menuItem2) {
                        return this.f49460.onOptionsItemSelected(menuItem2);
                    }
                });
                c18452.mo21878();
                return true;
            }
        } else if (menuItem.getItemId() != R.string.MT_Protector) {
            if (menuItem.getItemId() == R.string.MT_Protector || menuItem.getItemId() == R.string.MT_Protector) {
                menuItem.setChecked(true);
                boolean z = menuItem.getItemId() == R.string.MT_Protector;
                if (!m37910() && this.f51693.f56588 != z && this.f51690 != null && !this.f51689) {
                    m37908();
                    int iMo1650 = this.f51696.mo1650();
                    C17405 c17405 = this.f51693;
                    c17405.f56588 = z;
                    c17405.f56596 = null;
                    m37920();
                    this.f51690.m50544(this.f51696, iMo1650);
                    m37884();
                    m37902();
                    ApplicationC17729.f58258.edit().putBoolean("pvc", z).apply();
                    invalidateOptionsMenu();
                }
            } else {
                if (menuItem.getItemId() == R.string.MT_Protector) {
                    this.f51697 = (this.f51697 + 1) % 3;
                    m37884();
                    ApplicationC17729.f58258.edit().mo3486(this.f51697, "pvbi").apply();
                    return true;
                }
                if (menuItem.getItemId() == R.string.MT_Protector) {
                    InterfaceC2386 interfaceC2386M37925 = m37925();
                    if ((interfaceC2386M37925 instanceof C6004) && ((C13352) interfaceC2386M37925).getName().toLowerCase(Locale.ROOT).endsWith(".9.png")) {
                        AbstractC22044 abstractC22044Mo8093 = ((C6004) interfaceC2386M37925).mo8093();
                        startActivity(new Intent(this, (Class<?>) ActivityC16597.class).setAction("android.intent.action.VIEW").setData(abstractC22044Mo8093.mo42886() ? abstractC22044Mo8093.mo42888() : abstractC22044Mo8093.m49836()));
                        return true;
                    }
                } else {
                    return super.onOptionsItemSelected(menuItem);
                }
            }
        } else {
            InterfaceC2386 interfaceC2386M37926 = m37925();
            if (!m37910() && this.f51690 != null && interfaceC2386M37926 != null && !C6790.m18961(interfaceC2386M37926)) {
                m37937();
                int iMo1651 = this.f51696.mo1650();
                AtomicBoolean atomicBoolean = new AtomicBoolean();
                this.f51711 = atomicBoolean;
                C21178 c21178 = new C21178(m37914(), interfaceC2386M37926.getName(), interfaceC2386M37926.getParent(), interfaceC2386M37926.getSize(), interfaceC2386M37926.getTime(), this.f51690.m50542(iMo1651), new RunnableC1744(this, atomicBoolean, 0));
                this.f51701 = c21178;
                c21178.m48325();
                this.f51690.m50536(iMo1651, new C11438(atomicBoolean), new C1041(this, atomicBoolean, c21178));
                return true;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m37905(ActivityC15913 activityC15913, int i) {
        ArrayList arrayList = activityC15913.f51686;
        if (activityC15913.f51690 == null || activityC15913.f51689 || activityC15913.isFinishing() || i < 0 || i >= arrayList.size()) {
            return;
        }
        InterfaceC2386 interfaceC2386M37903 = activityC15913.m37903(i);
        if (C6790.m18961(interfaceC2386M37903)) {
            ArrayList arrayList2 = new ArrayList();
            int size = -1;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (C6790.m18961(activityC15913.m37903(i2))) {
                    if (i2 == i) {
                        size = arrayList2.size();
                    }
                    arrayList2.add(activityC15913.m37903(i2));
                }
            }
            activityC15913.m37908();
            C23391.m52569(ActivityC15913.class, new C12184(activityC15913.f51693.f56599.m30459(), arrayList2, size), "VideoPlayerArguments");
            Intent intent = new Intent(activityC15913, (Class<?>) ActivityC7135.class);
            ActivityC7135.m19587(activityC15913, intent, activityC15913.f51693.f56599.m30459(), interfaceC2386M37903);
            activityC15913.startActivity(intent);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m37904(ActivityC15913 activityC15913) {
        ArrayList arrayList = activityC15913.f51686;
        if (activityC15913.m37910() || activityC15913.f51690 == null || activityC15913.f51707 != null || activityC15913.m37925() == null) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            if (activityC15913.f51693.f56591.contains(activityC15913.m37903(i).getPath())) {
                arrayList2.add((AbstractC13057) arrayList.get(i));
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add((AbstractC13057) arrayList.get(activityC15913.f51696.mo1650()));
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        activityC15913.f51707 = atomicBoolean;
        C13511 c13511 = new C13511(activityC15913, R.string.MT_Protector);
        activityC15913.f51703 = c13511;
        c13511.m33188(new RunnableC7007(0, atomicBoolean));
        c13511.m33191(200);
        activityC15913.f51698.setEnabled(false);
        C5261.f18540.execute(new RunnableC13039(activityC15913, arrayList2, atomicBoolean, c13511, 1));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37896(ActivityC15913 activityC15913, C13511 c13511, AtomicBoolean atomicBoolean, C23149 c23149, ArrayList arrayList) {
        String str;
        c13511.m33185();
        if (activityC15913.f51707 == atomicBoolean) {
            activityC15913.f51707 = null;
            activityC15913.f51703 = null;
        }
        try {
            try {
                if (!atomicBoolean.get() && !activityC15913.isFinishing() && !activityC15913.isDestroyed()) {
                    C16457 c16457 = new C16457(activityC15913);
                    c16457.m39005();
                    Iterator it = arrayList.iterator();
                    boolean z = false;
                    boolean z2 = false;
                    while (it.hasNext()) {
                        if (((AbstractC13057) it.next()).m32545()) {
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
                    c16457.m39009(str);
                    Iterator it2 = c23149.m52068().iterator();
                    while (it2.hasNext()) {
                        c16457.m39006((Uri) it2.next());
                    }
                    c16457.m39008();
                    c23149.m52069();
                    c23149.close();
                    if (activityC15913.isDestroyed()) {
                        return;
                    }
                    activityC15913.m37902();
                    return;
                }
                c23149.close();
                if (activityC15913.isDestroyed()) {
                    return;
                }
                activityC15913.m37902();
            } catch (Exception unused) {
                C22673.m51152(R.string.MT_Protector);
            } finally {
                if (!activityC15913.isDestroyed()) {
                    activityC15913.m37902();
                }
            }
        } catch (Throwable th) {
            try {
                c23149.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37895(ActivityC15913 activityC15913, C13511 c13511, AtomicBoolean atomicBoolean) {
        c13511.m33185();
        if (activityC15913.f51707 == atomicBoolean) {
            activityC15913.f51707 = null;
            activityC15913.f51703 = null;
        }
        if (!atomicBoolean.get() && !activityC15913.isFinishing() && !activityC15913.isDestroyed()) {
            C22673.m51152(R.string.MT_Protector);
        }
        if (activityC15913.isDestroyed()) {
            return;
        }
        activityC15913.m37902();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m37931(ActivityC15913 activityC15913, AtomicBoolean atomicBoolean) {
        atomicBoolean.set(true);
        if (activityC15913.f51711 == atomicBoolean) {
            activityC15913.f51711 = null;
            activityC15913.f51701 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m37893(ActivityC15913 activityC15913, AtomicBoolean atomicBoolean, C21178 c21178, C23653 c23653) {
        if (atomicBoolean.get() || activityC15913.f51701 != c21178 || activityC15913.isFinishing() || activityC15913.isDestroyed()) {
            return;
        }
        c21178.m48324(c23653);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public void m37937() {
        AtomicBoolean atomicBoolean = this.f51711;
        if (atomicBoolean != null) {
            atomicBoolean.set(true);
        }
        C21178 c21178 = this.f51701;
        if (c21178 != null) {
            c21178.m48321();
        }
        this.f51711 = null;
        this.f51701 = null;
    }

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    private void m37916() {
        C22673.m51152(R.string.MT_Protector);
        finish();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m37930(ActivityC15913 activityC15913) {
        activityC15913.m37933(false);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static void m37938(ActivityC15913 activityC15913) {
        activityC15913.m37933(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void m37933(boolean z) {
        InterfaceC2386 interfaceC2386M37925;
        AbstractC0148 abstractC0148M20792;
        if (isFinishing() || this.f51689) {
            return;
        }
        C17405 c17405 = this.f51693;
        if (c17405 != null && c17405.f56598 && c17405.f56599 != null) {
            ArrayList arrayListM37922 = m37922();
            Intent intentPutExtra = new Intent().putExtra("gallery.currentPath", this.f51693.f56592);
            if (!arrayListM37922.isEmpty()) {
                intentPutExtra.putStringArrayListExtra("paths", arrayListM37922);
            }
            setResult(-1, intentPutExtra);
        }
        this.f51689 = true;
        if (!m37910() && (interfaceC2386M37925 = m37925()) != null) {
            if (!(this.f51693.f56599.m30459() instanceof C11969)) {
                AbstractC7629 abstractC7629M30459 = this.f51693.f56599.m30459();
                if ((abstractC7629M30459 instanceof AbstractC18881) && (abstractC0148M20792 = C7606.m20792(((AbstractC18881) abstractC7629M30459).m43788().f1127)) != null) {
                    C22961.m51794(interfaceC2386M37925.getPath(), new C8877(abstractC0148M20792, false));
                }
            } else if (!(interfaceC2386M37925.mo8093() instanceof C22965)) {
                String path = interfaceC2386M37925.getPath();
                C22961 c22961 = C22961.f74590;
                C15243.m36590(path, MotionUtils.EASING_TYPE_PATH);
                C22961.m51794(path, (C8877) null);
            }
        }
        ValueAnimator valueAnimator = this.f51705;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f51705 = null;
        }
        m37912();
        if (!z) {
            this.f51696.mo1639();
            if (this.f51704) {
                m37924(false);
            }
        }
        finish();
        if (z) {
            overridePendingTransition(0, 0);
        }
    }

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    private void m37884() {
        this.f51696.mo1646(f51684[this.f51697]);
        m37918();
        m37927();
    }

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    private C9370 m37914() {
        C9370 c9370 = new C9370(this, C7207.m19791());
        Configuration configuration = new Configuration(getResources().getConfiguration());
        configuration.uiMode = (configuration.uiMode & (-49)) | (this.f51697 == 1 ? 16 : 32);
        c9370.m24681(configuration);
        return c9370;
    }

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    private void m37927() {
        C9370 c9370M37914 = m37914();
        this.f51695.m52539(this.f51697 == 1);
        ColorStateList colorStateListM24393 = C9217.m24393(c9370M37914.getResources(), R.color.MT_Protector, c9370M37914.getTheme());
        if (this.f51697 == 1) {
            int[] iArr = {android.R.attr.state_checked};
            int colorForState = colorStateListM24393.getColorForState(iArr, colorStateListM24393.getDefaultColor());
            float[] fArr = new float[3];
            C19988.m45963(colorForState, fArr);
            fArr[1] = fArr[1] * 0.8f;
            fArr[2] = fArr[2] * 0.85f;
            colorStateListM24393 = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{C19988.m45964(C19988.m45960(fArr), Color.alpha(colorForState)), colorStateListM24393.getDefaultColor()});
        }
        this.f51695.setButtonTintList(colorStateListM24393);
        this.f56046.getContext().getTheme().applyStyle(this.f51697 == 1 ? R.style.MT_Protector : R.style.MT_Protector, true);
        this.f56046.getContext().getTheme().applyStyle(R.style.MT_Protector, true);
    }

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    private void m37918() {
        int i;
        View viewM40418 = m40418(R.id.MT_Protector);
        int i2 = this.f51708;
        if (i2 == 0) {
            i = 0;
        } else {
            i = (i2 << 24) | (f51684[this.f51697] & 16777215);
        }
        viewM40418.setBackgroundColor(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m37890(ActivityC15913 activityC15913, ValueAnimator valueAnimator) {
        activityC15913.f51708 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        activityC15913.m37918();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public void m37924(boolean z) {
        if (z && this.f51704) {
            return;
        }
        final int i = this.f51699 + 1;
        this.f51699 = i;
        ValueAnimator valueAnimator = this.f51705;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f51705 = null;
        }
        this.f51691 = false;
        this.f51708 = 255;
        m37884();
        try {
            if (z) {
                Class<?> cls = Class.forName("android.app.Activity$TranslucentConversionListener");
                Activity.class.getDeclaredMethod("convertToTranslucent", cls, ActivityOptions.class).invoke(this, Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: l.ۢ۠ۚ
                    @Override // java.lang.reflect.InvocationHandler
                    public final Object invoke(Object obj, Method method, Object[] objArr) {
                        int i2 = ActivityC15913.f51685;
                        if (!method.getName().equals("onTranslucentConversionComplete") || objArr == null || !Boolean.TRUE.equals(objArr[0])) {
                            return null;
                        }
                        final ActivityC15913 activityC15913 = this.f32093;
                        final int i3 = i;
                        activityC15913.runOnUiThread(new Runnable() { // from class: l.ۡ۠ۚ
                            @Override // java.lang.Runnable
                            public final void run() {
                                ActivityC15913.m37889(activityC15913, i3);
                            }
                        });
                        return null;
                    }
                }), null);
            } else if (Build.VERSION.SDK_INT >= 30) {
                setTranslucent(false);
            } else {
                Activity.class.getDeclaredMethod("convertFromTranslucent", null).invoke(this, null);
            }
            this.f51704 = z;
        } catch (ReflectiveOperationException | RuntimeException unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37889(final ActivityC15913 activityC15913, int i) {
        if (i != activityC15913.f51699 || activityC15913.f51689 || activityC15913.isFinishing() || activityC15913.isDestroyed() || activityC15913.f51691) {
            return;
        }
        activityC15913.f51691 = true;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(activityC15913.f51708, 0);
        activityC15913.f51705 = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(180L);
        activityC15913.f51705.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ۙۜۚ
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ActivityC15913.m37890(this.f16651, valueAnimator);
            }
        });
        activityC15913.f51705.start();
    }

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    private ArrayList m37922() {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (String str : this.f51693.f56593) {
            if (this.f51693.f56591.contains(str) && hashSet.add(str)) {
                arrayList.add(str);
            }
        }
        C12184 c12184 = this.f51693.f56599;
        if (c12184 != null) {
            for (InterfaceC2386 interfaceC2386 : c12184.m30460()) {
                if (this.f51693.f56591.contains(interfaceC2386.getPath()) && hashSet.add(interfaceC2386.getPath())) {
                    arrayList.add(interfaceC2386.getPath());
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    private void m37908() {
        if ((this.f51690 == null && this.f51687 == null) || m37925() == null) {
            return;
        }
        this.f51693.f56592 = m37925().getPath();
        this.f51693.f56596 = this.f51696.mo1648();
        C17405 c17405 = this.f51693;
        c17405.f56595 = (c17405.f56598 && c17405.f56599.m30459() == C11969.f38536 && (m37925() instanceof C6004) && m37925().mo8093().mo4295()) ? m37925().mo8093().m49836() : null;
    }

    @Override // l.ActivityC5577, l.ActivityC8866, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        Uri uri;
        m37908();
        bundle.putBoolean("gallery.internal", this.f51693.f56598);
        bundle.putString("gallery.path", this.f51693.f56592);
        bundle.putBundle("gallery.viewport", this.f51693.f56596);
        bundle.putBoolean("gallery.bars", this.f51693.f56597);
        bundle.putBoolean("gallery.continuous", this.f51693.f56588);
        C17405 c17405 = this.f51693;
        if (c17405.f56598 && (uri = c17405.f56595) != null) {
            bundle.putString("gallery.localUri", uri.toString());
            bundle.putStringArrayList("gallery.selected", m37922());
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // l.AbstractActivityC17204, l.ActivityC3409, android.app.Activity
    public final void onResume() {
        super.onResume();
        setTheme(C7207.m19791());
        getTheme().applyStyle(R.style.MT_Protector, true);
        m37927();
        C22403 c22403 = this.f51690;
        if (c22403 != null) {
            c22403.m50539(true);
        }
    }

    @Override // l.AbstractActivityC17204, l.ActivityC7405, l.ActivityC4348, l.ActivityC5577, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f51695 != null) {
            setTheme(C7207.m19791());
            getTheme().applyStyle(R.style.MT_Protector, true);
            m37927();
            C21178 c21178 = this.f51701;
            if (c21178 != null) {
                c21178.m48323(m37914());
            }
        }
    }

    @Override // l.ActivityC5577, android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        C22403 c22403 = this.f51690;
        if (c22403 == null || i == 20) {
            return;
        }
        c22403.m50540();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        C22403 c22403 = this.f51690;
        if (c22403 != null) {
            c22403.m50540();
        }
    }

    @Override // l.AbstractActivityC17204, l.ActivityC3409, android.app.Activity
    public final void onPause() {
        m37937();
        m37908();
        C22403 c22403 = this.f51690;
        if (c22403 != null) {
            c22403.m50539(false);
        }
        this.f51696.mo1639();
        super.onPause();
    }

    @Override // l.AbstractActivityC17204, l.ActivityC4348, l.ActivityC3409, android.app.Activity
    public final void onStop() {
        AtomicBoolean atomicBoolean = this.f51707;
        if (atomicBoolean != null) {
            atomicBoolean.set(true);
        }
        C13511 c13511 = this.f51703;
        if (c13511 != null) {
            c13511.m33185();
        }
        super.onStop();
    }

    @Override // l.ActivityC5577, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        m37937();
        boolean zM37910 = m37910();
        this.f51689 = false;
        this.f51710.set(true);
        this.f51710 = new AtomicBoolean();
        AtomicBoolean atomicBoolean = this.f51707;
        if (atomicBoolean != null) {
            atomicBoolean.set(true);
        }
        C22403 c22403 = this.f51690;
        if (c22403 != null) {
            c22403.close();
        }
        C9722 c9722 = this.f51687;
        if (c9722 != null) {
            c9722.close();
        }
        this.f51690 = null;
        this.f51687 = null;
        this.f51686.clear();
        this.f51693.m40879();
        setIntent(intent);
        if (zM37910 || m37910()) {
            this.f51693.f56588 = !m37910() && ApplicationC17729.f58258.getBoolean("pvc", false);
            AbstractC13628 abstractC13628 = this.f51696;
            abstractC13628.getClass();
            if ((abstractC13628 instanceof C0205) != this.f51693.f56588) {
                m37920();
                m37884();
            }
        }
        setTitle(R.string.MT_Protector);
        this.f56046.setSubtitle((CharSequence) null);
        this.f51692.setText(R.string.MT_Protector);
        this.f51695.setVisibility(8);
        this.f51698.setEnabled(false);
        m37936(true);
        m37939();
        invalidateOptionsMenu();
        m37907(true);
    }

    @Override // l.AbstractActivityC17204, l.ActivityC4348, l.ActivityC3409, android.app.Activity
    public final void onDestroy() {
        m37937();
        ValueAnimator valueAnimator = this.f51705;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f51705 = null;
        }
        this.f51710.set(true);
        AtomicBoolean atomicBoolean = this.f51707;
        if (atomicBoolean != null) {
            atomicBoolean.set(true);
        }
        C13511 c13511 = this.f51703;
        if (c13511 != null) {
            c13511.m33185();
        }
        C22403 c22403 = this.f51690;
        if (c22403 != null) {
            c22403.close();
        }
        C9722 c9722 = this.f51687;
        if (c9722 != null) {
            c9722.close();
        }
        super.onDestroy();
    }
}
