package l;

import android.animation.ObjectAnimator;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import bin.mt.plus.R;
import java.text.DecimalFormat;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۜ۫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes4.dex */
public class ActivityC7135 extends AbstractActivityC17204 {

    /* JADX INFO: renamed from: ۚᩴ, reason: not valid java name and contains not printable characters */
    public static final int[] f23492 = {15, 30, 45, 60, 90};

    /* JADX INFO: renamed from: ۫ᩴ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f23493 = 0;

    /* JADX INFO: renamed from: ֡ۤ, reason: not valid java name and contains not printable characters */
    public FrameLayout f23494;

    /* JADX INFO: renamed from: ֡᩷, reason: not valid java name and contains not printable characters */
    public View f23495;

    /* JADX INFO: renamed from: ֨ۤ, reason: not valid java name and contains not printable characters */
    public View f23497;

    /* JADX INFO: renamed from: ֨᩷, reason: not valid java name and contains not printable characters */
    public TextView f23498;

    /* JADX INFO: renamed from: ֨᩸, reason: not valid java name and contains not printable characters */
    public int f23499;

    /* JADX INFO: renamed from: ֫ۤ, reason: not valid java name and contains not printable characters */
    public View f23500;

    /* JADX INFO: renamed from: ֫᩸, reason: not valid java name and contains not printable characters */
    public View f23502;

    /* JADX INFO: renamed from: ۖ᩷, reason: not valid java name and contains not printable characters */
    public C23438 f23504;

    /* JADX INFO: renamed from: ۗ᩷, reason: not valid java name and contains not printable characters */
    public String f23507;

    /* JADX INFO: renamed from: ۗ᩸, reason: not valid java name and contains not printable characters */
    public ProgressBar f23508;

    /* JADX INFO: renamed from: ۘۤ, reason: not valid java name and contains not printable characters */
    public boolean f23509;

    /* JADX INFO: renamed from: ۘ᩷, reason: not valid java name and contains not printable characters */
    public View f23510;

    /* JADX INFO: renamed from: ۘ᩸, reason: not valid java name and contains not printable characters */
    public float f23511;

    /* JADX INFO: renamed from: ۙۤ, reason: not valid java name and contains not printable characters */
    public int f23512;

    /* JADX INFO: renamed from: ۙᩴ, reason: not valid java name and contains not printable characters */
    public View f23513;

    /* JADX INFO: renamed from: ۙ᩸, reason: not valid java name and contains not printable characters */
    public C15120 f23514;

    /* JADX INFO: renamed from: ۚ᩸, reason: not valid java name and contains not printable characters */
    public View f23517;

    /* JADX INFO: renamed from: ۛۤ, reason: not valid java name and contains not printable characters */
    public boolean f23518;

    /* JADX INFO: renamed from: ۛ᩸, reason: not valid java name and contains not printable characters */
    public boolean f23520;

    /* JADX INFO: renamed from: ۜۤ, reason: not valid java name and contains not printable characters */
    public boolean f23521;

    /* JADX INFO: renamed from: ۜ᩷, reason: not valid java name and contains not printable characters */
    public boolean f23522;

    /* JADX INFO: renamed from: ۜ᩸, reason: not valid java name and contains not printable characters */
    public TextView f23523;

    /* JADX INFO: renamed from: ۟ۤ, reason: not valid java name and contains not printable characters */
    public String f23524;

    /* JADX INFO: renamed from: ۟᩷, reason: not valid java name and contains not printable characters */
    public ImageView f23525;

    /* JADX INFO: renamed from: ۟᩸, reason: not valid java name and contains not printable characters */
    public TextView f23526;

    /* JADX INFO: renamed from: ۠ۤ, reason: not valid java name and contains not printable characters */
    public boolean f23527;

    /* JADX INFO: renamed from: ۠᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC15670 f23528;

    /* JADX INFO: renamed from: ۡۤ, reason: not valid java name and contains not printable characters */
    public long f23530;

    /* JADX INFO: renamed from: ۡ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC15670 f23531;

    /* JADX INFO: renamed from: ۡ᩸, reason: not valid java name and contains not printable characters */
    public boolean f23532;

    /* JADX INFO: renamed from: ۢۤ, reason: not valid java name and contains not printable characters */
    public InterfaceC20757 f23533;

    /* JADX INFO: renamed from: ۢ᩷, reason: not valid java name and contains not printable characters */
    public ProgressBar f23534;

    /* JADX INFO: renamed from: ۢ᩸, reason: not valid java name and contains not printable characters */
    public ViewGroup f23535;

    /* JADX INFO: renamed from: ۤۤ, reason: not valid java name and contains not printable characters */
    public C24734 f23536;

    /* JADX INFO: renamed from: ۤᩴ, reason: not valid java name and contains not printable characters */
    public View f23537;

    /* JADX INFO: renamed from: ۤ᩸, reason: not valid java name and contains not printable characters */
    public View f23538;

    /* JADX INFO: renamed from: ۧۤ, reason: not valid java name and contains not printable characters */
    public boolean f23539;

    /* JADX INFO: renamed from: ۧ᩷, reason: not valid java name and contains not printable characters */
    public TextView f23540;

    /* JADX INFO: renamed from: ۧ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC15670 f23541;

    /* JADX INFO: renamed from: ۨۤ, reason: not valid java name and contains not printable characters */
    public boolean f23542;

    /* JADX INFO: renamed from: ۨ᩷, reason: not valid java name and contains not printable characters */
    public C9771 f23543;

    /* JADX INFO: renamed from: ۨ᩸, reason: not valid java name and contains not printable characters */
    public View f23544;

    /* JADX INFO: renamed from: ۫ۤ, reason: not valid java name and contains not printable characters */
    public C5516 f23545;

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public String f23546;

    /* JADX INFO: renamed from: ۫᩸, reason: not valid java name and contains not printable characters */
    public C5243 f23547;

    /* JADX INFO: renamed from: ۬ۤ, reason: not valid java name and contains not printable characters */
    public Future f23548;

    /* JADX INFO: renamed from: ۬᩸, reason: not valid java name and contains not printable characters */
    public C11208 f23550;

    /* JADX INFO: renamed from: ܰۤ, reason: not valid java name and contains not printable characters */
    public boolean f23551;

    /* JADX INFO: renamed from: ܰ᩷, reason: not valid java name and contains not printable characters */
    public View f23552;

    /* JADX INFO: renamed from: ܰ᩸, reason: not valid java name and contains not printable characters */
    public VelocityTracker f23553;

    /* JADX INFO: renamed from: ܳۤ, reason: not valid java name and contains not printable characters */
    public int f23554;

    /* JADX INFO: renamed from: ܳᩴ, reason: not valid java name and contains not printable characters */
    public boolean f23555;

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public volatile int f23556;

    /* JADX INFO: renamed from: ܳ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC5054 f23557;

    /* JADX INFO: renamed from: ܶۤ, reason: not valid java name and contains not printable characters */
    public C13298 f23558;

    /* JADX INFO: renamed from: ܶ᩷, reason: not valid java name and contains not printable characters */
    public String f23559;

    /* JADX INFO: renamed from: ܶ᩸, reason: not valid java name and contains not printable characters */
    public View f23560;

    /* JADX INFO: renamed from: ܺۤ, reason: not valid java name and contains not printable characters */
    public C15535 f23561;

    /* JADX INFO: renamed from: ܺ᩷, reason: not valid java name and contains not printable characters */
    public View f23562;

    /* JADX INFO: renamed from: ܺ᩸, reason: not valid java name and contains not printable characters */
    public boolean f23563;

    /* JADX INFO: renamed from: ܽۤ, reason: not valid java name and contains not printable characters */
    public int f23564;

    /* JADX INFO: renamed from: ܽ᩸, reason: not valid java name and contains not printable characters */
    public View f23566;

    /* JADX INFO: renamed from: ܿۤ, reason: not valid java name and contains not printable characters */
    public ImageView f23567;

    /* JADX INFO: renamed from: ܿ᩷, reason: not valid java name and contains not printable characters */
    public boolean f23568;

    /* JADX INFO: renamed from: ᩳۤ, reason: not valid java name and contains not printable characters */
    public C16281 f23570;

    /* JADX INFO: renamed from: ᩳ᩷, reason: not valid java name and contains not printable characters */
    public GestureDetectorOnGestureListenerC23544 f23571;

    /* JADX INFO: renamed from: ᩳ᩸, reason: not valid java name and contains not printable characters */
    public TextView[] f23572;

    /* JADX INFO: renamed from: ᩴۤ, reason: not valid java name and contains not printable characters */
    public Future f23573;

    /* JADX INFO: renamed from: ᩴᩴ, reason: not valid java name and contains not printable characters */
    public String f23574;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public C12355 f23575;

    /* JADX INFO: renamed from: ᩴ᩸, reason: not valid java name and contains not printable characters */
    public boolean f23576;

    /* JADX INFO: renamed from: ᩵ۤ, reason: not valid java name and contains not printable characters */
    public boolean f23577;

    /* JADX INFO: renamed from: ᩵᩷, reason: not valid java name and contains not printable characters */
    public boolean f23578;

    /* JADX INFO: renamed from: ᩵᩸, reason: not valid java name and contains not printable characters */
    public TextView f23579;

    /* JADX INFO: renamed from: ᩶ۤ, reason: not valid java name and contains not printable characters */
    public View f23580;

    /* JADX INFO: renamed from: ᩶᩷, reason: not valid java name and contains not printable characters */
    public ViewGroup f23581;

    /* JADX INFO: renamed from: ᩷ۤ, reason: not valid java name and contains not printable characters */
    public C15036 f23583;

    /* JADX INFO: renamed from: ᩷ᩴ, reason: not valid java name and contains not printable characters */
    public TextView f23584;

    /* JADX INFO: renamed from: ᩷᩸, reason: not valid java name and contains not printable characters */
    public boolean f23585;

    /* JADX INFO: renamed from: ᩸ۤ, reason: not valid java name and contains not printable characters */
    public C4770 f23586;

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public volatile C21750 f23588;

    /* JADX INFO: renamed from: ᩹ۤ, reason: not valid java name and contains not printable characters */
    public long f23590;

    /* JADX INFO: renamed from: ᩹᩸, reason: not valid java name and contains not printable characters */
    public View f23592;

    /* JADX INFO: renamed from: ᩺ۤ, reason: not valid java name and contains not printable characters */
    public boolean f23593;

    /* JADX INFO: renamed from: ᩺᩷, reason: not valid java name and contains not printable characters */
    public C6279 f23594;

    /* JADX INFO: renamed from: ᩺᩸, reason: not valid java name and contains not printable characters */
    public View f23595;

    /* JADX INFO: renamed from: ᩻ۤ, reason: not valid java name and contains not printable characters */
    public ImageView f23596;

    /* JADX INFO: renamed from: ᩻᩷, reason: not valid java name and contains not printable characters */
    public boolean f23597;

    /* JADX INFO: renamed from: ᩻᩸, reason: not valid java name and contains not printable characters */
    public TextView f23598;

    /* JADX INFO: renamed from: ۬᩷, reason: not valid java name and contains not printable characters */
    public final C3406 f23549 = new C3406();

    /* JADX INFO: renamed from: ۗۤ, reason: not valid java name and contains not printable characters */
    public C18787 f23506 = C18787.f61010;

    /* JADX INFO: renamed from: ۛ᩷, reason: not valid java name and contains not printable characters */
    public boolean f23519 = false;

    /* JADX INFO: renamed from: ᩸᩸, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f23589 = new AtomicInteger();

    /* JADX INFO: renamed from: ᩸ᩴ, reason: not valid java name and contains not printable characters */
    public final ArrayList f23587 = new ArrayList();

    /* JADX INFO: renamed from: ܽ᩷, reason: not valid java name and contains not printable characters */
    public EnumC17576 f23565 = EnumC17576.NONE;

    /* JADX INFO: renamed from: ᩹᩷, reason: not valid java name and contains not printable characters */
    public List f23591 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public final C24290 f23516 = new C24290();

    /* JADX INFO: renamed from: ۖۤ, reason: not valid java name and contains not printable characters */
    public EnumC6390 f23503 = EnumC6390.NONE;

    /* JADX INFO: renamed from: ۠᩸, reason: not valid java name and contains not printable characters */
    public final C24290 f23529 = new C24290();

    /* JADX INFO: renamed from: ۖ᩸, reason: not valid java name and contains not printable characters */
    public final C24290 f23505 = new C24290();

    /* JADX INFO: renamed from: ֫᩷, reason: not valid java name and contains not printable characters */
    public final C24290 f23501 = new C24290();

    /* JADX INFO: renamed from: ᩶᩸, reason: not valid java name and contains not printable characters */
    public final C21986 f23582 = new C21986(new Runnable() { // from class: l.ۘᩴ֫
        @Override // java.lang.Runnable
        public final void run() {
            this.f15724.m19702();
        }
    });

    /* JADX INFO: renamed from: ֡᩸, reason: not valid java name and contains not printable characters */
    public final Runnable f23496 = new RunnableC2725(this);

    /* JADX INFO: renamed from: ܿ᩸, reason: not valid java name and contains not printable characters */
    public final C14789 f23569 = new InterfaceC4832() { // from class: l.ܰᩴ֫
        @Override // l.InterfaceC4832
        /* JADX INFO: renamed from: ۙ */
        public final void mo8856() {
            ActivityC7135.m19565(this.f48398);
        }
    };

    /* JADX INFO: renamed from: ۚۤ, reason: not valid java name and contains not printable characters */
    public final RunnableC21503 f23515 = new Runnable() { // from class: l.᩶ᩴ֫
        @Override // java.lang.Runnable
        public final void run() {
            ActivityC7135.m19684(this.f68730);
        }
    };

    @Override // l.ActivityC7405
    /* JADX INFO: renamed from: ۛ */
    public final int mo18669() {
        return 2;
    }

    @Override // l.AbstractActivityC17204
    /* JADX INFO: renamed from: ᩶ */
    public final String mo122() {
        return "VideoPlayerActivity";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m19565(ActivityC7135 activityC7135) {
        activityC7135.m19608();
        activityC7135.m19530();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m19684(ActivityC7135 activityC7135) {
        if (activityC7135.getLifecycle().mo23076().m8762(EnumC2619.STARTED)) {
            activityC7135.m19559(-9223372036854775807L, false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19587(final AbstractActivityC17204 abstractActivityC17204, Intent intent, AbstractC7629 abstractC7629, final InterfaceC2386 interfaceC2386) {
        if (!m19695() || abstractActivityC17204.isFinishing() || abstractActivityC17204.isDestroyed() || !(abstractC7629 instanceof C11969)) {
            return;
        }
        Future futureSubmit = C5261.f18540.submit(new Callable() { // from class: l.ۨܳ֫
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i = ActivityC7135.f23493;
                return Integer.valueOf(C21591.m49121(abstractActivityC17204, interfaceC2386.mo8093()));
            }
        });
        try {
            int iIntValue = ((Integer) futureSubmit.get(150L, TimeUnit.MILLISECONDS)).intValue();
            if (iIntValue == 0 || iIntValue == 1) {
                intent.putExtra("bin.mt.media.extra.INITIAL_REQUESTED_ORIENTATION", iIntValue);
            }
        } catch (InterruptedException unused) {
            futureSubmit.cancel(true);
            Thread.currentThread().interrupt();
        } catch (Exception unused2) {
            futureSubmit.cancel(true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:76:0x04a9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v48, types: [l.ᩳܳ֫] */
    @Override // l.AbstractActivityC17204, l.ActivityC7405, l.ActivityC3409, l.ActivityC5577, l.ActivityC8866, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C12184 c12184;
        C22337 c22337;
        C12184 c12185;
        int iMax;
        int iM30458;
        C8691 c8691;
        InterfaceC15670 c11543;
        final InterfaceC15670 c4792;
        C2554 c2554;
        final InterfaceC15670 interfaceC15670;
        EnumC18722 enumC18722;
        Intent intent;
        int intExtra;
        int i = 0;
        this.f56044 = false;
        setTheme(C7207.m19791());
        super.onCreate(bundle);
        int i2 = 1;
        if (m19695() && (intent = getIntent()) != null && ((intExtra = intent.getIntExtra("bin.mt.media.extra.INITIAL_REQUESTED_ORIENTATION", -1)) == 0 || intExtra == 1)) {
            this.f23503 = EnumC6390.AUTO;
            if (getRequestedOrientation() != intExtra) {
                setRequestedOrientation(intExtra);
            }
        }
        m40418(R.layout.MT_Protector);
        C7068 onBackPressedDispatcher = getOnBackPressedDispatcher();
        C1234 c1234 = new C1234(this);
        onBackPressedDispatcher.getClass();
        onBackPressedDispatcher.m19400(c1234);
        m19701(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.ۛᩴ֫
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = ActivityC7135.f23493;
                this.f22075.finish();
            }
        });
        this.f23494 = (FrameLayout) m40418(R.id.MT_Protector);
        this.f23547 = (C5243) m40418(R.id.MT_Protector);
        this.f23584 = (TextView) m40418(R.id.MT_Protector);
        this.f23598 = (TextView) m19701(R.id.MT_Protector);
        View viewFindViewById = findViewById(R.id.MT_Protector);
        viewFindViewById.setBackground(new C20821(0));
        this.f23560 = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.MT_Protector);
        viewFindViewById2.setBackground(new C20821(0));
        this.f23567 = (ImageView) viewFindViewById2;
        this.f23580 = m40418(R.id.MT_Protector);
        this.f23500 = m40418(R.id.MT_Protector);
        this.f23596 = (ImageView) m40418(R.id.MT_Protector);
        this.f23562 = m40418(R.id.MT_Protector);
        this.f23537 = m40418(R.id.MT_Protector);
        this.f23592 = m40418(R.id.MT_Protector);
        this.f23508 = (ProgressBar) m40418(R.id.MT_Protector);
        this.f23579 = (TextView) m40418(R.id.MT_Protector);
        this.f23495 = m40418(R.id.MT_Protector);
        this.f23534 = (ProgressBar) m40418(R.id.MT_Protector);
        this.f23498 = (TextView) m40418(R.id.MT_Protector);
        this.f23525 = (ImageView) m40418(R.id.MT_Protector);
        this.f23581 = (ViewGroup) m40418(R.id.MT_Protector);
        this.f23560.setOnClickListener(new View.OnClickListener() { // from class: l.ۙܳ֫
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityC7135.m19595(this.f17282);
            }
        });
        this.f23567.setOnClickListener(new View.OnClickListener() { // from class: l.᩻ܳ֫
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityC7135.m19690(this.f81183);
            }
        });
        this.f23517 = m40418(R.id.MT_Protector);
        this.f23510 = m40418(R.id.MT_Protector);
        this.f23538 = m19701(R.id.MT_Protector);
        this.f23566 = m19701(R.id.MT_Protector);
        this.f23552 = m19701(R.id.MT_Protector);
        View viewFindViewById3 = findViewById(R.id.MT_Protector);
        this.f23513 = viewFindViewById3;
        if (viewFindViewById3 instanceof InterfaceC15683) {
            ((InterfaceC15683) viewFindViewById3).mo13285(new C22798(this));
        }
        this.f23502 = m19701(R.id.MT_Protector);
        this.f23497 = m19701(R.id.MT_Protector);
        this.f23502.setOnClickListener(new ViewOnClickListenerC3238(5, this));
        this.f23497.setOnClickListener(new ViewOnClickListenerC21881(this, i2));
        m19701(R.id.MT_Protector).setOnClickListener(new ViewOnClickListenerC11892(this, i2));
        this.f23598.setOnClickListener(new ViewOnClickListenerC17724(2, this));
        View viewM40418 = m40418(R.id.MT_Protector);
        this.f23595 = viewM40418;
        this.f23544 = viewM40418.findViewById(R.id.MT_Protector);
        this.f23595.setOnClickListener(new ViewOnClickListenerC23960(4, this));
        C0385.m2189(this.f23537);
        C0385.m2189(this.f23562);
        C0385.m2189(this.f23544);
        C1861.m6391(this.f23581);
        C1861.m6391(this.f23567);
        C1861.m6391(this.f23560);
        C1255 c1255 = (C1255) this.f23544.findViewById(R.id.switch4);
        final C1255 c1256 = (C1255) this.f23544.findViewById(R.id.switch5);
        C1255 c1257 = (C1255) this.f23544.findViewById(R.id.switch7);
        c1255.setChecked(ApplicationC17729.f58258.getBoolean("vpffs", false));
        c1256.setChecked(ApplicationC17729.f58258.getBoolean("vpsm", false));
        c1257.setChecked(m19695());
        c1255.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ۜᩴ֫
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                ActivityC7135.m19577(this.f24150, c1256, z);
            }
        });
        c1256.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.۬ᩴ֫
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                ActivityC7135.m19616(this.f44492, z);
            }
        });
        if (c1255.isChecked()) {
            c1256.setEnabled(true);
        }
        m19629();
        c1257.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.᩷ܳ֫
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                ActivityC7135.m19586(this.f71287, z);
            }
        });
        C1255 c1258 = (C1255) this.f23544.findViewById(R.id.switch1);
        c1258.setChecked(ApplicationC17729.f58258.getBoolean("vplp", false));
        c1258.setOnCheckedChangeListener(new C10928());
        C1255 c1259 = (C1255) this.f23544.findViewById(R.id.switch6);
        c1259.setChecked(ApplicationC17729.f58258.getBoolean("vpsp", false));
        c1259.setOnCheckedChangeListener(new C22863());
        C1255 c12510 = (C1255) this.f23544.findViewById(R.id.switch2);
        c12510.setChecked(ApplicationC17729.f58258.getBoolean("vpapn", false));
        c12510.setOnCheckedChangeListener(new C19879(i));
        TextView textView = (TextView) this.f23544.findViewById(R.id.MT_Protector);
        this.f23540 = textView;
        textView.setText(R.string.MT_Protector);
        TextView textView2 = (TextView) this.f23544.findViewById(R.id.MT_Protector);
        this.f23523 = textView2;
        textView2.setText(R.string.MT_Protector);
        this.f23526 = (TextView) this.f23544.findViewById(R.id.MT_Protector);
        m19608();
        this.f23544.findViewById(R.id.MT_Protector).setOnClickListener(new ViewOnClickListenerC15403(0, this));
        this.f23544.findViewById(R.id.MT_Protector).setOnClickListener(new ViewOnClickListenerC25319(3, this));
        this.f23544.findViewById(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.֨ᩴ֫
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityC7135.m19675(this.f4867, view);
            }
        });
        if (Build.VERSION.SDK_INT >= 28) {
            m19596();
            final C1255 c12511 = (C1255) this.f23544.findViewById(R.id.switch3);
            c12511.setChecked(ApplicationC17729.f58258.getBoolean("vpun", true));
            c12511.setOnCheckedChangeListener(new C9568(i, this));
            if (ApplicationC17729.f58258.getBoolean("ins", false)) {
                c12511.setVisibility(0);
            }
            C22666.m51097(getWindow().getDecorView(), new InterfaceC22491() { // from class: l.ۖᩴ֫
                @Override // l.InterfaceC22491
                public final C3977 onApplyWindowInsets(View view, C3977 c3977) {
                    ActivityC7135.m19576(this.f9430, c12511, c3977);
                    return c3977;
                }
            });
        }
        float[] fArr = {0.5f, 1.0f, 1.25f, 1.5f, 2.0f, 3.0f};
        int[] iArr = {R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector};
        this.f23572 = new TextView[6];
        DecimalFormat decimalFormat = new DecimalFormat("0.0##");
        for (int i3 = 0; i3 < 6; i3++) {
            TextView[] textViewArr = this.f23572;
            TextView textView3 = (TextView) this.f23544.findViewById(iArr[i3]);
            textViewArr[i3] = textView3;
            textView3.setBackground(new C20821());
            textView3.setText(decimalFormat.format(fArr[i3]));
            textView3.setTag(Float.valueOf(fArr[i3]));
            textView3.setOnClickListener(new View.OnClickListener() { // from class: l.۠ᩴ֫
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ActivityC7135.m19614(this.f28835, view);
                }
            });
        }
        String stringExtra = getIntent().getStringExtra("bin.mt.media.extra.URL_ARGUMENTS_TOKEN");
        this.f23574 = stringExtra;
        InterfaceC15670 c20845 = null;
        if (!TextUtils.isEmpty(stringExtra)) {
            String str = this.f23574;
            C22337 c22338 = str == null ? null : (C22337) C23391.m52568("VideoPlayerUrlArguments:".concat(str));
            if (c22338 == null) {
                C22673.m51159(R.string.MT_Protector);
                finish();
                return;
            } else {
                this.f23555 = true;
                this.f23522 = c22338.m50408();
                c22337 = c22338;
                c12184 = null;
            }
        } else {
            C12184 c12186 = (C12184) C23391.m52568("VideoPlayerArguments");
            if (c12186 == null) {
                c12186 = C12184.m30457(this, "video/");
            }
            if (c12186 == null || c12186.m30460().isEmpty()) {
                c12186 = null;
            } else {
                int iM30459 = c12186.m30458();
                if (iM30459 < 0 || iM30459 >= c12186.m30460().size()) {
                    iM30459 = 0;
                }
                InterfaceC2386 interfaceC2386 = (InterfaceC2386) c12186.m30460().get(iM30459);
                if (!C22337.m50405(interfaceC2386.getName())) {
                    List listM30460 = c12186.m30460();
                    ArrayList arrayList = new ArrayList(listM30460.size());
                    boolean z = false;
                    int size = 0;
                    for (int i4 = 0; i4 < listM30460.size(); i4++) {
                        InterfaceC2386 interfaceC2387 = (InterfaceC2386) listM30460.get(i4);
                        if (C22337.m50405(interfaceC2387.getName())) {
                            z = true;
                        } else {
                            if (i4 == iM30459) {
                                size = arrayList.size();
                            }
                            arrayList.add(interfaceC2387);
                        }
                    }
                    if (z) {
                        c12185 = new C12184(c12186.m30459(), arrayList, size);
                    } else if (iM30459 != c12186.m30458()) {
                        c12186 = new C12184(c12186.m30459(), listM30460, iM30459);
                    }
                } else if ((c12186.m30459() instanceof C11969) || (c12186.m30459() instanceof AbstractC18881)) {
                    c12185 = new C12184(c12186.m30459(), Collections.singletonList(interfaceC2386), 0);
                } else {
                    c12186 = null;
                }
                c12186 = c12185;
            }
            if (c12186 == null) {
                C22673.m51159(R.string.MT_Protector);
                finish();
                return;
            } else {
                c12184 = c12186;
                c22337 = null;
            }
        }
        C24969.m55775(this);
        this.f23547.m15793();
        ViewGroup viewGroup = this.f23494;
        View viewM15791 = this.f23547.m15791();
        if (viewM15791 != null) {
            ViewParent parent = viewM15791.getParent();
            if (parent instanceof ViewGroup) {
                viewGroup = (ViewGroup) parent;
                iMax = Math.max(0, viewGroup.indexOfChild(viewM15791));
            } else {
                iMax = 1;
            }
            viewM15791.setVisibility(8);
        } else {
            iMax = 1;
        }
        C11208 c11208 = new C11208(this, null);
        c11208.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        c11208.setClickable(false);
        c11208.setFocusable(false);
        viewGroup.addView(c11208, iMax);
        this.f23550 = c11208;
        this.f23535 = viewGroup;
        this.f23499 = iMax;
        m19594(this.f23547.m15795());
        C11208 c11209 = this.f23550;
        if (c11209 != null) {
            c11209.m28242();
            c11209.m28245(new C6384(-855310, 0, 0, 1, -1342177280, null));
            c11209.m28243(0.04f);
            c11209.m28246();
        }
        this.f23571 = new GestureDetectorOnGestureListenerC23544(this);
        this.f23547.setOnTouchListener(new ViewOnTouchListenerC12859(this, new GestureDetector(this, this.f23571), 1));
        if (c22337 != null) {
            this.f23533 = new C11148(c22337, getString(R.string.MT_Protector));
            c8691 = null;
        } else {
            if (bundle == null || (iM30458 = bundle.getInt("bin.mt.media.state.CURRENT_MEDIA_INDEX", c12184.m30458())) < 0 || iM30458 >= c12184.m30460().size()) {
                iM30458 = c12184.m30458();
            }
            c8691 = new C8691(iM30458, c12184.m30460());
            this.f23533 = c8691;
            this.f23522 = C22337.m50405(c8691.mo3303().getName());
        }
        if (this.f23522 && bundle != null) {
            Bundle bundle2 = bundle.getBundle("bin.mt.media.state.VIDEO_QUALITY_SELECTION");
            this.f23514 = (bundle2 == null || bundle2.getInt("schema", 0) != 1 || bundle2.getInt("matching_ordinal", -1) < 0) ? null : new C15120(bundle2.getInt("width", -1), bundle2.getInt("height", -1), bundle2.getInt("average_bitrate", -1), bundle2.getInt("peak_bitrate", -1), bundle2.getFloat("frame_rate", -1.0f), bundle2.getString("codecs"), bundle2.getString("sample_mime_type"), bundle2.getInt("matching_ordinal"));
        }
        if (this.f23533.size() <= 1) {
            this.f23497.setEnabled(false);
            this.f23502.setEnabled(false);
            this.f23497.setAlpha(0.33f);
            this.f23502.setAlpha(0.33f);
        }
        this.f23570 = C3603.m11690(this);
        this.f23545 = new C5516();
        if (c8691 != null) {
            if (this.f23522) {
                enumC18722 = EnumC18722.HLS_DIRECT;
            } else {
                enumC18722 = EnumC18722.NORMAL;
            }
            C9771 c9771 = new C9771(this, c12184.m30459(), c8691, enumC18722, this.f23570);
            this.f23543 = c9771;
            if (this.f23522 || !(c12184.m30459() instanceof AbstractC18881)) {
                c20845 = c9771;
            } else {
                C16281 c16281 = this.f23570;
                final C9771 c9772 = this.f23543;
                C17359.requireNonNull(c9772);
                c20845 = new C20845(c16281, (C19133) new InterfaceC15670() { // from class: l.ᩳܳ֫
                    @Override // l.InterfaceC15670
                    /* JADX INFO: renamed from: ۙ */
                    public final InterfaceC13433 mo3996() {
                        C9771 c9773 = c9772;
                        c9773.getClass();
                        return new C20214(c9773);
                    }
                }, (InterfaceC15670) this.f23543, new C8440(this, c16281));
            }
            this.f23543.m25473(new InterfaceC14984() { // from class: l.ۢܳ֫
                @Override // java.util.function.IntConsumer
                public final void accept(int i5) {
                    ActivityC7135.m19566(this.f32596, i5);
                }

                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final /* bridge */ /* synthetic */ void n(Object obj) {
                    mo15049((Integer) obj);
                }

                @Override // l.InterfaceC14984
                /* JADX INFO: renamed from: ۤ */
                public final /* synthetic */ void mo15049(Integer num) {
                    C19460.m45001((InterfaceC14984) this, num);
                }

                public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                    return C19460.m45000((InterfaceC14984) this, intConsumer);
                }

                public final Consumer andThen(Consumer consumer) {
                    return C12312.$default$andThen(this, consumer);
                }
            });
        }
        if (c22337 == null) {
            c11543 = new C16416();
        } else {
            c11543 = new C11543(c22337.m50410(), c22337.m50409());
        }
        this.f23541 = c11543;
        C14877 c14877 = new C14877(c20845, c11543, this.f23570);
        C24534 c24534 = new C24534(this);
        c24534.m54814();
        C13644 c13644 = new C13644();
        c13644.m33381();
        C9771 c9773 = this.f23543;
        InterfaceC1603 c3537 = c13644;
        if (c9773 != null) {
            c3537 = new C3537(c13644, c9773);
        }
        C12131 c12131 = new C12131(c14877, c3537);
        c12131.m30325(new C25233());
        if (this.f23522) {
            this.f23583 = new C15036(new RunnableC24487(this));
            final C16281 c16282 = this.f23570;
            if (c16282 == null) {
                throw new IllegalStateException("Media cache session is missing");
            }
            final InterfaceC15670 interfaceC15671 = this.f23543;
            if (interfaceC15671 != null && c12184 != null) {
                if (c12184.m30459() instanceof AbstractC18881) {
                    c2554 = new C2554(c16282, interfaceC15671, new C8468(this, c16282), C3603.m11688(), EnumC18962.f61479, new C22780(), null);
                    final C9771 c9774 = this.f23543;
                    C17359.requireNonNull(c9774);
                    c4792 = new C20845(c16282, new InterfaceC15670() { // from class: l.ᩳܳ֫
                        @Override // l.InterfaceC15670
                        /* JADX INFO: renamed from: ۙ */
                        public final InterfaceC13433 mo3996() {
                            C9771 c9775 = c9774;
                            c9775.getClass();
                            return new C20214(c9775);
                        }
                    }, this.f23543, new InterfaceC16369() { // from class: l.۫ܳ֫
                        @Override // l.InterfaceC16369
                        /* JADX INFO: renamed from: ۙ */
                        public final String mo16748(C25368 c25368) {
                            return this.f42091.f23543.m25469(c25368, c16282);
                        }
                    });
                } else {
                    c4792 = interfaceC15671;
                    interfaceC15670 = c4792;
                }
                InterfaceC5341 interfaceC5341 = new InterfaceC5341() { // from class: l.֫ܳ֫
                    @Override // l.InterfaceC5341
                    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                    public final InterfaceC13433 mo6799(int i5) {
                        return ActivityC7135.m19557(this.f6634, interfaceC15671, c4792, interfaceC15670, i5);
                    }
                };
                this.f23531 = interfaceC15670;
                this.f23528 = c4792;
                C3103 c3103 = new C3103(interfaceC5341);
                c3103.m10126(new C13780(this.f23583, this.f23536));
                c3103.m10125((InterfaceC4365) new C25233());
                c12131.m30324(c3103);
            } else {
                interfaceC15671 = this.f23541;
                C17359.requireNonNull(interfaceC15671);
                C24734 c24734 = new C24734();
                this.f23536 = c24734;
                C2554 c2555 = new C2554(c16282, interfaceC15671, new InterfaceC16369() { // from class: l.ܰۡۚ
                    @Override // l.InterfaceC16369
                    /* JADX INFO: renamed from: ۙ */
                    public final String mo16748(C25368 c25368) {
                        return C3603.m11682(c25368.f81907, interfaceC15671);
                    }
                }, C3603.m11688(), EnumC18962.f61480, new C22780(), c24734);
                c4792 = new C4792(c24734, new C20845(c16282, interfaceC15671, new InterfaceC16369() { // from class: l.ۚܳ֫
                    @Override // l.InterfaceC16369
                    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                    public final String mo16748(C25368 c25368) {
                        int i5 = ActivityC7135.f23493;
                        return C3603.m11682(c25368.f81907, interfaceC15671);
                    }
                }), interfaceC15671);
                c2554 = c2555;
            }
            C2554 c2556 = c2554;
            interfaceC15670 = interfaceC15671;
            interfaceC15671 = c2556;
            InterfaceC5341 interfaceC5342 = new InterfaceC5341() { // from class: l.֫ܳ֫
                @Override // l.InterfaceC5341
                /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                public final InterfaceC13433 mo6799(int i5) {
                    return ActivityC7135.m19557(this.f6634, interfaceC15671, c4792, interfaceC15670, i5);
                }
            };
            this.f23531 = interfaceC15670;
            this.f23528 = c4792;
            C3103 c3104 = new C3103(interfaceC5342);
            c3104.m10126(new C13780(this.f23583, this.f23536));
            c3104.m10125((InterfaceC4365) new C25233());
            c12131.m30324(c3104);
        }
        C7379 c7379 = new C7379(this, c24534, c12131);
        c7379.m20269();
        c7379.m20268();
        InterfaceC5054 interfaceC5054M20265 = c7379.m20265();
        this.f23557 = interfaceC5054M20265;
        this.f23547.m15789(interfaceC5054M20265);
        this.f23538.setOnClickListener(new View.OnClickListener() { // from class: l.ۢᩴ֫
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityC7135.m19643(this.f32913);
            }
        });
        this.f23557.mo23545(0);
        this.f23557.mo23577(new C10863(this));
        this.f23527 = true;
        C5243 c5243 = this.f23547;
        if (c5243 == null) {
            return;
        }
        RunnableC21503 runnableC21503 = this.f23515;
        c5243.removeCallbacks(runnableC21503);
        this.f23547.post(runnableC21503);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19571(ActivityC7135 activityC7135, GestureDetector gestureDetector, MotionEvent motionEvent) {
        gestureDetector.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            GestureDetectorOnGestureListenerC23544 gestureDetectorOnGestureListenerC23544 = activityC7135.f23571;
            int i = gestureDetectorOnGestureListenerC23544.f76056;
            gestureDetectorOnGestureListenerC23544.f76056 = -1;
            gestureDetectorOnGestureListenerC23544.f76063 = false;
            ActivityC7135 activityC7136 = gestureDetectorOnGestureListenerC23544.f76061;
            boolean z = activityC7136.f23519;
            if (!z && !activityC7136.f23542 && i == 0) {
                m19622(activityC7136);
                ((AbstractC7971) activityC7136.f23557).seekTo(gestureDetectorOnGestureListenerC23544.f76064);
                activityC7136.m19599();
            } else if (!z && activityC7136.f23495.getVisibility() != 8) {
                activityC7136.f23495.setVisibility(8);
            }
            gestureDetectorOnGestureListenerC23544.m52752();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m19566(ActivityC7135 activityC7135, int i) {
        if (i == -2) {
            activityC7135.f23495.setVisibility(8);
            activityC7135.f23519 = false;
        } else {
            if (i == -1) {
                activityC7135.f23519 = true;
                activityC7135.f23495.setVisibility(0);
                activityC7135.f23498.setVisibility(0);
                activityC7135.f23525.setVisibility(8);
                activityC7135.f23498.setText(R.string.MT_Protector);
                return;
            }
            activityC7135.f23534.setProgress(i * 10);
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m19643(ActivityC7135 activityC7135) {
        activityC7135.m19705();
        activityC7135.f23547.m15792();
    }

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public static void m19651(final ActivityC7135 activityC7135) {
        InterfaceC19533 interfaceC19533 = activityC7135.f23557;
        if (interfaceC19533 != null) {
            AbstractC7971 abstractC7971 = (AbstractC7971) interfaceC19533;
            if (abstractC7971.m21697()) {
                if (activityC7135.f23555 && activityC7135.f23522) {
                    boolean z = activityC7135.f23542;
                    activityC7135.f23542 = true;
                    boolean zM21691 = abstractC7971.m21691();
                    activityC7135.f23518 = zM21691;
                    if (zM21691) {
                        activityC7135.f23593 = false;
                    } else if (interfaceC19533.mo23580() == 4) {
                        activityC7135.f23593 = true;
                    }
                    activityC7135.m19704(true);
                    if (!z) {
                        String str = activityC7135.f23546;
                        if (!TextUtils.isEmpty(str)) {
                            C21834.m49508(str);
                        }
                        activityC7135.m19542();
                        abstractC7971.mo21705();
                    }
                    activityC7135.m19603();
                    return;
                }
                if (activityC7135.f23509 || activityC7135.isFinishing() || activityC7135.isDestroyed()) {
                    return;
                }
                activityC7135.f23509 = true;
                String str2 = activityC7135.f23546;
                if (!TextUtils.isEmpty(str2)) {
                    C21834.m49508(str2);
                }
                activityC7135.f23546 = null;
                C22337.m50406(activityC7135.f23574);
                activityC7135.f23574 = null;
                InterfaceC5054 interfaceC5054 = activityC7135.f23557;
                if (interfaceC5054 != null) {
                    interfaceC5054.stop();
                    ((AbstractC7971) activityC7135.f23557).mo23559();
                }
                C2361 c2361BuildDialog = activityC7135.buildDialog();
                c2361BuildDialog.m8021(R.string.MT_Protector);
                c2361BuildDialog.m8000(R.string.MT_Protector);
                c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩶ܳ֫
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        int i2 = ActivityC7135.f23493;
                        this.f68062.finish();
                    }
                });
                c2361BuildDialog.m8012(false);
                c2361BuildDialog.m8016();
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m19704(boolean z) {
        View view = this.f23513;
        if (view != null) {
            boolean z2 = !z;
            view.setEnabled(z2);
            this.f23513.setVisibility(z ? 8 : 0);
            this.f23513.setFocusable(z2);
            this.f23513.setImportantForAccessibility(z ? 4 : 0);
        }
        View view2 = this.f23517;
        if (view2 != null) {
            view2.setVisibility(z ? 8 : 0);
        }
        View view3 = this.f23510;
        if (view3 != null) {
            view3.setVisibility(z ? 8 : 0);
        }
        C5243 c5243 = this.f23547;
        if (c5243 != null) {
            boolean z3 = !z;
            c5243.m15796(z3);
            this.f23547.m15790(z3);
        }
        View view4 = this.f23566;
        if (view4 != null) {
            view4.setVisibility(z ? 8 : 0);
        }
        View view5 = this.f23552;
        if (view5 != null) {
            view5.setVisibility(z ? 8 : 0);
        }
        View view6 = this.f23502;
        if (view6 != null) {
            view6.setVisibility(z ? 8 : 0);
        }
        View view7 = this.f23497;
        if (view7 != null) {
            view7.setVisibility(z ? 8 : 0);
        }
        if (z) {
            View view8 = this.f23592;
            if (view8 != null) {
                view8.setVisibility(8);
                this.f23592.setTranslationX(0.0f);
                this.f23592.setTranslationY(0.0f);
            }
            m19599();
            GestureDetectorOnGestureListenerC23544 gestureDetectorOnGestureListenerC23544 = this.f23571;
            if (gestureDetectorOnGestureListenerC23544 != null) {
                ActivityC7135 activityC7135 = gestureDetectorOnGestureListenerC23544.f76061;
                if (gestureDetectorOnGestureListenerC23544.f76056 == 0) {
                    gestureDetectorOnGestureListenerC23544.f76056 = -2;
                }
                m19622(activityC7135);
                activityC7135.m19599();
                this.f23571.m52752();
            }
        }
        m19603();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public void m19603() {
        View view = this.f23538;
        if (view == null) {
            return;
        }
        boolean z = this.f23593;
        view.setEnabled(!z);
        this.f23538.setAlpha(!z ? 1.0f : 0.33f);
    }

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final void m19705() {
        InterfaceC19533 interfaceC19533 = this.f23557;
        if (interfaceC19533 == null) {
            return;
        }
        if (this.f23542) {
            if (this.f23593) {
                return;
            }
            if (!C7116.m19491(interfaceC19533, true)) {
                ((AbstractC7971) interfaceC19533).mo23554(false);
                return;
            }
            if (!this.f23518) {
                C7116.m19490(interfaceC19533);
                return;
            }
            InterfaceC19533 interfaceC19534 = this.f23557;
            if (interfaceC19534 == null || this.f23593) {
                return;
            }
            AbstractC7971 abstractC7971 = (AbstractC7971) interfaceC19534;
            abstractC7971.mo21705();
            if (interfaceC19534.mo23580() == 1) {
                interfaceC19534.mo23574();
            }
            abstractC7971.mo23554(true);
            return;
        }
        if (!C7116.m19491(interfaceC19533, true)) {
            AbstractC7971 abstractC7972 = (AbstractC7971) interfaceC19533;
            if (abstractC7972.mo21703(1)) {
                abstractC7972.pause();
                return;
            }
            return;
        }
        C7116.m19490(interfaceC19533);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m19591(ActivityC7135 activityC7135, C8936 c8936) {
        InterfaceC5054 interfaceC5054 = activityC7135.f23557;
        if (interfaceC5054 == null || !activityC7135.f23542 || !activityC7135.f23518 || c8936.f29167 != 1002 || activityC7135.f23597) {
            return false;
        }
        activityC7135.f23597 = true;
        boolean zMo23570 = interfaceC5054.mo23570();
        InterfaceC19533 interfaceC19533 = activityC7135.f23557;
        if (interfaceC19533 != null && !activityC7135.f23593) {
            AbstractC7971 abstractC7971 = (AbstractC7971) interfaceC19533;
            abstractC7971.mo21705();
            interfaceC19533.mo23574();
            if (zMo23570) {
                abstractC7971.mo23554(true);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public static boolean m19540(ActivityC7135 activityC7135) {
        InterfaceC5054 interfaceC5054 = activityC7135.f23557;
        if (activityC7135.f23542 && !activityC7135.f23551 && interfaceC5054 != null) {
            C3125 c3125Mo23582 = interfaceC5054.mo23582();
            AbstractC4516 it = c3125Mo23582.f10119.values().iterator();
            while (it.hasNext()) {
                C17295 c17295 = (C17295) it.next();
                if (c17295.f56324.f53565 == 2 && !c17295.f56325.isEmpty()) {
                    activityC7135.f23551 = true;
                    activityC7135.f23514 = null;
                    boolean zMo23570 = interfaceC5054.mo23570();
                    interfaceC5054.mo23550(c3125Mo23582.mo10195().mo12044(2, false).mo12043(2).mo12042());
                    InterfaceC19533 interfaceC19533 = activityC7135.f23557;
                    if (interfaceC19533 != null && !activityC7135.f23593) {
                        if (activityC7135.f23518) {
                            ((AbstractC7971) interfaceC19533).mo21705();
                        }
                        interfaceC19533.mo23574();
                        if (zMo23570) {
                            ((AbstractC7971) interfaceC19533).mo23554(true);
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public static void m19694(final ActivityC7135 activityC7135) {
        if (activityC7135.f23577 || activityC7135.isFinishing() || activityC7135.isDestroyed()) {
            return;
        }
        activityC7135.f23577 = true;
        C2361 c2361BuildDialog = activityC7135.buildDialog();
        c2361BuildDialog.m8021(R.string.MT_Protector);
        c2361BuildDialog.m8000(R.string.MT_Protector);
        c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܿܳ֫
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ActivityC7135.m19696(this.f59903);
            }
        });
        c2361BuildDialog.m8022(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.֡ܳ֫
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ActivityC7135.m19534(this.f2132);
            }
        });
        c2361BuildDialog.m8003(new DialogInterface.OnCancelListener() { // from class: l.۟ܳ֫
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                ActivityC7135.m19640(this.f26419);
            }
        });
        c2361BuildDialog.m8016();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static void m19696(ActivityC7135 activityC7135) {
        activityC7135.f23577 = false;
        activityC7135.f23597 = false;
        InterfaceC19533 interfaceC19533 = activityC7135.f23557;
        if (interfaceC19533 == null || activityC7135.f23593) {
            return;
        }
        if (activityC7135.f23518) {
            ((AbstractC7971) interfaceC19533).mo21705();
        }
        interfaceC19533.mo23574();
        ((AbstractC7971) interfaceC19533).mo23554(true);
    }

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public static void m19600(ActivityC7135 activityC7135) {
        if (activityC7135.f23568 || activityC7135.isFinishing() || activityC7135.isDestroyed()) {
            return;
        }
        activityC7135.f23568 = true;
        C2361 c2361BuildDialog = activityC7135.buildDialog();
        c2361BuildDialog.m8021(R.string.MT_Protector);
        c2361BuildDialog.m8000(R.string.MT_Protector);
        c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterfaceOnClickListenerC21741(3, activityC7135));
        c2361BuildDialog.m8012(false);
        c2361BuildDialog.m8016();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m19534(ActivityC7135 activityC7135) {
        C22337.m50406(activityC7135.f23574);
        activityC7135.f23574 = null;
        activityC7135.finish();
    }

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public static void m19597(ActivityC7135 activityC7135) {
        C22337.m50406(activityC7135.f23574);
        activityC7135.f23574 = null;
        activityC7135.finish();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m19613(ActivityC7135 activityC7135) {
        C22337.m50406(activityC7135.f23574);
        activityC7135.f23574 = null;
        activityC7135.finish();
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static void m19640(ActivityC7135 activityC7135) {
        C22337.m50406(activityC7135.f23574);
        activityC7135.f23574 = null;
        activityC7135.finish();
    }

    @Override // l.AbstractActivityC17204, l.ActivityC4348, l.ActivityC3409, android.app.Activity
    public final void onStart() {
        C5243 c5243;
        super.onStart();
        C18893 c18893M40417 = m40417();
        c18893M40417.m43815(2);
        c18893M40417.m43811(7);
        boolean z = this.f23527;
        if (z) {
            if (!z || (c5243 = this.f23547) == null) {
                return;
            }
            RunnableC21503 runnableC21503 = this.f23515;
            c5243.removeCallbacks(runnableC21503);
            this.f23547.post(runnableC21503);
            return;
        }
        Object obj = this.f23557;
        if (obj != null) {
            if (this.f23542 && this.f23518) {
                ((AbstractC7971) obj).mo21705();
                if (this.f23585) {
                    ((AbstractC7971) this.f23557).mo23554(true);
                    return;
                }
                return;
            }
            if (this.f23585) {
                ((AbstractC7971) obj).mo23554(true);
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            final View decorView = getWindow().getDecorView();
            decorView.post(new Runnable() { // from class: l.ܿᩴ֫
                @Override // java.lang.Runnable
                public final void run() {
                    int i = ActivityC7135.f23493;
                    if (decorView.hasWindowFocus()) {
                        C18893 c18893M40417 = this.f60215.m40417();
                        c18893M40417.m43815(2);
                        c18893M40417.m43811(7);
                    }
                }
            });
        }
    }

    @Override // l.AbstractActivityC17204, l.ActivityC7405, l.ActivityC4348, l.ActivityC5577, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f23532 = false;
        m19533();
    }

    @Override // l.AbstractActivityC17204, l.ActivityC4348, l.ActivityC3409, android.app.Activity
    public final void onStop() {
        InterfaceC5054 interfaceC5054;
        super.onStop();
        C5243 c5243 = this.f23547;
        if (c5243 != null) {
            c5243.removeCallbacks(this.f23515);
        }
        m19542();
        if (this.f23548 != null) {
            this.f23527 = true;
            m19617(true);
        }
        GestureDetectorOnGestureListenerC23544 gestureDetectorOnGestureListenerC23544 = this.f23571;
        if (gestureDetectorOnGestureListenerC23544 != null) {
            gestureDetectorOnGestureListenerC23544.m52752();
        }
        InterfaceC5054 interfaceC5055 = this.f23557;
        if (interfaceC5055 != null) {
            int iMo23580 = interfaceC5055.mo23580();
            boolean z = (!this.f23557.mo23570() || iMo23580 == 1 || iMo23580 == 4) ? false : true;
            this.f23585 = z;
            if (z) {
                ((AbstractC7971) this.f23557).mo23554(false);
            }
        } else {
            this.f23585 = false;
        }
        if (!this.f23542 && (interfaceC5054 = this.f23557) != null && this.f23533 != null) {
            String str = this.f23546;
            long currentPosition = interfaceC5054.getCurrentPosition();
            long duration = this.f23557.getDuration();
            if (duration != -9223372036854775807L && !TextUtils.isEmpty(str)) {
                C21834.m49506(str, currentPosition, duration);
            }
        }
        if (isFinishing()) {
            m19633();
        }
    }

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final void m19702() {
        this.f23585 = false;
        this.f23527 = false;
        C5243 c5243 = this.f23547;
        if (c5243 != null) {
            c5243.removeCallbacks(this.f23515);
        }
        GestureDetectorOnGestureListenerC23544 gestureDetectorOnGestureListenerC23544 = this.f23571;
        if (gestureDetectorOnGestureListenerC23544 != null) {
            gestureDetectorOnGestureListenerC23544.m52752();
        }
        Object obj = this.f23557;
        if (obj != null) {
            ((AbstractC7971) obj).mo23554(false);
        }
        getWindow().clearFlags(128);
    }

    @Override // l.ActivityC5577, l.ActivityC8866, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        C15120 c15120;
        super.onSaveInstanceState(bundle);
        InterfaceC20757 interfaceC20757 = this.f23533;
        if (interfaceC20757 != null) {
            bundle.putInt("bin.mt.media.state.CURRENT_MEDIA_INDEX", interfaceC20757.mo3299());
        }
        if (this.f23522) {
            C15120 c15121 = this.f23514;
            if (this.f23557 != null) {
                List listM31922 = C12883.m31922(getResources(), this.f23557.mo23568());
                int iM31920 = C12883.m31920(listM31922, this.f23557.mo23582());
                if (iM31920 <= 0 || iM31920 > listM31922.size()) {
                    c15120 = null;
                } else {
                    int i = iM31920 - 1;
                    C22580 c22580 = (C22580) listM31922.get(i);
                    int i2 = 0;
                    for (int i3 = 0; i3 < i; i3++) {
                        C15648 c15648M50907 = ((C22580) listM31922.get(i3)).m50907();
                        C15648 c15648M50908 = c22580.m50907();
                        if (c15648M50907.f50814 == c15648M50908.f50814 && c15648M50907.f50852 == c15648M50908.f50852 && c15648M50907.f50828 == c15648M50908.f50828 && c15648M50907.f50815 == c15648M50908.f50815 && Float.compare(c15648M50907.f50845, c15648M50908.f50845) == 0 && TextUtils.equals(c15648M50907.f50836, c15648M50908.f50836) && TextUtils.equals(c15648M50907.f50848, c15648M50908.f50848)) {
                            i2++;
                        }
                    }
                    C15648 c15648M50909 = c22580.m50907();
                    c15120 = new C15120(c15648M50909.f50814, c15648M50909.f50852, c15648M50909.f50828, c15648M50909.f50815, c15648M50909.f50845, c15648M50909.f50836, c15648M50909.f50848, i2);
                }
                if (c15120 != null) {
                    c15121 = c15120;
                }
            }
            if (c15121 != null) {
                bundle.putBundle("bin.mt.media.state.VIDEO_QUALITY_SELECTION", c15121.m36398());
            }
        }
    }

    @Override // l.AbstractActivityC17204, android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (this.f23562.getVisibility() == 4) {
            this.f23567.setImageResource(R.drawable.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public static void m19642(ActivityC7135 activityC7135) {
        activityC7135.m19650();
        activityC7135.f23533.mo3298();
        activityC7135.m19559(-9223372036854775807L, false);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m19646(ActivityC7135 activityC7135) {
        activityC7135.m19650();
        activityC7135.f23533.mo3298();
        activityC7135.m19559(-9223372036854775807L, false);
        activityC7135.f23547.m15792();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static void m19628(ActivityC7135 activityC7135) {
        activityC7135.m19650();
        activityC7135.f23533.mo3295();
        activityC7135.m19559(-9223372036854775807L, false);
        activityC7135.f23547.m15792();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m19558(int i, Bitmap bitmap) {
        View view;
        if (i != this.f23564 || this.f23596 == null || (view = this.f23500) == null || view.getVisibility() != 0) {
            return;
        }
        if (bitmap == null && this.f23539) {
            m19599();
            m19653();
        } else {
            this.f23596.setImageBitmap(bitmap);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19569(ActivityC7135 activityC7135, int i, C13298 c13298) {
        if (i != activityC7135.f23564) {
            return;
        }
        activityC7135.f23558 = c13298;
        View view = activityC7135.f23500;
        if (view == null || view.getVisibility() != 0) {
            return;
        }
        activityC7135.m19671(activityC7135.f23590, activityC7135.f23539);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5841 m19554(final ActivityC7135 activityC7135, long j, boolean z, final boolean z2) {
        InterfaceC20757 interfaceC20757;
        C6044 c6044M25471;
        C20870 c20870;
        C5516 c5516;
        InterfaceC5054 interfaceC5054 = activityC7135.f23557;
        C5841 c5841M19671 = null;
        if (interfaceC5054 == null || (interfaceC20757 = activityC7135.f23533) == null || activityC7135.f23500 == null || activityC7135.f23596 == null) {
            return null;
        }
        if (activityC7135.f23542) {
            activityC7135.m19599();
            return null;
        }
        InterfaceC2386 interfaceC2386Mo3303 = interfaceC20757.mo3303();
        if (activityC7135.f23522) {
            InterfaceC5054 interfaceC5055 = activityC7135.f23557;
            C15036 c15036 = activityC7135.f23583;
            InterfaceC15670 interfaceC15670 = activityC7135.f23531;
            InterfaceC15670 interfaceC15671 = activityC7135.f23528;
            C16281 c16281 = activityC7135.f23570;
            C5516 c5517 = activityC7135.f23545;
            if (interfaceC5055 == null || c15036 == null || interfaceC15670 == null || interfaceC15671 == null || c16281 == null || c5517 == null || Build.VERSION.SDK_INT < 23 || !c16281.m38630()) {
                activityC7135.m19599();
                return null;
            }
            C10561 c10561M36197 = c15036.m36197();
            if (c10561M36197 == null) {
                activityC7135.m19599();
                return null;
            }
            if (z2) {
                activityC7135.m19644();
                C5516 c5518 = activityC7135.f23545;
                if (c5518 == null) {
                    activityC7135.m19599();
                    return null;
                }
                C23438 c23438 = activityC7135.f23504;
                if (c23438 != null) {
                    c23438.m52655();
                }
                activityC7135.f23596.setImageBitmap(null);
                c5516 = c5518;
            } else {
                c5516 = c5517;
            }
            int i = activityC7135.f23512;
            long j2 = 1 + activityC7135.f23530;
            activityC7135.f23530 = j2;
            activityC7135.f23590 = j;
            activityC7135.f23539 = z;
            C20560 c20560 = new C20560(i, j2, activityC7135.f23564, j, z, c10561M36197, interfaceC15670, interfaceC15671, c16281, c5516, activityC7135.f23543);
            activityC7135.f23549.m11147(c20560);
            long jM47144 = c20560.m47144();
            boolean zM47136 = c20560.m47136();
            View view = activityC7135.f23500;
            if (view != null && activityC7135.f23596 != null && view.getVisibility() == 0) {
                c5841M19671 = activityC7135.m19671(jM47144, zM47136);
            }
            C5841 c5841M19706 = activityC7135.m19706();
            return c5841M19706 != null ? c5841M19706 : c5841M19671;
        }
        if (interfaceC2386Mo3303 != null) {
            C9771 c9771 = activityC7135.f23543;
            if (c9771 == null) {
                c6044M25471 = C6044.f20673;
            } else {
                c6044M25471 = c9771.m25471(interfaceC2386Mo3303);
            }
            long duration = interfaceC5054.getDuration();
            if (duration <= 0 || duration == -9223372036854775807L || c6044M25471.m17542()) {
                activityC7135.m19599();
                return null;
            }
            if (z && !c6044M25471.m17544()) {
                activityC7135.m19599();
                return null;
            }
            activityC7135.f23590 = j;
            activityC7135.f23539 = z;
            if (z2) {
                activityC7135.f23596.setImageBitmap(null);
            }
            C5841 c5841M19672 = activityC7135.m19671(j, z);
            activityC7135.f23500.setVisibility(0);
            if (c6044M25471.m17544()) {
                if (activityC7135.f23561 == null) {
                    activityC7135.f23561 = new C15535(activityC7135.getApplicationContext());
                }
                activityC7135.f23561.m37218(interfaceC2386Mo3303, c6044M25471, duration, activityC7135.f23564, new C19814(activityC7135));
                activityC7135.f23561.m37216(c5841M19672.m17025(), c5841M19672.m17024(), j);
                return c5841M19672;
            }
            activityC7135.f23596.setImageBitmap(null);
            C15535 c15535 = activityC7135.f23561;
            if (c15535 != null) {
                c15535.m37215();
                if (c6044M25471.m17545()) {
                    activityC7135.f23561.m37219();
                }
            }
            return c5841M19672;
        }
        final InterfaceC5054 interfaceC5056 = activityC7135.f23557;
        final C16281 c16282 = activityC7135.f23570;
        final InterfaceC15670 interfaceC15672 = activityC7135.f23541;
        final C5516 c5519 = activityC7135.f23545;
        C14902 c14902Mo21699 = interfaceC5056 == 0 ? null : ((AbstractC7971) interfaceC5056).mo21699();
        Uri uri = (c14902Mo21699 == null || (c20870 = c14902Mo21699.f48681) == null) ? null : c20870.f66802;
        long duration2 = interfaceC5056 == 0 ? -9223372036854775807L : interfaceC5056.getDuration();
        if (interfaceC5056 == 0 || c16282 == null || interfaceC15672 == null || c5519 == null || uri == null || duration2 <= 0 || duration2 == -9223372036854775807L || Build.VERSION.SDK_INT < 23 || !c16282.m38630()) {
            activityC7135.m19599();
            return null;
        }
        activityC7135.f23590 = j;
        activityC7135.f23539 = z;
        C4770 c4770 = activityC7135.f23586;
        if (c4770 != null) {
            return activityC7135.m19553(c4770, duration2, j, z, z2);
        }
        Future future = activityC7135.f23573;
        if (future == null || future.isDone()) {
            final int i2 = activityC7135.f23554 + 1;
            activityC7135.f23554 = i2;
            final int i3 = activityC7135.f23564;
            final Uri uri2 = uri;
            activityC7135.f23573 = C5261.f18540.submit(new Runnable() { // from class: l.ܽܳ֫
                @Override // java.lang.Runnable
                public final void run() {
                    int i4 = ActivityC7135.f23493;
                    final C4770 c4770M14735 = C4770.m14735(c16282, uri2, interfaceC15672, c5519);
                    final ActivityC7135 activityC7136 = this.f58008;
                    final int i5 = i2;
                    final int i6 = i3;
                    final InterfaceC5054 interfaceC5057 = interfaceC5056;
                    final boolean z3 = z2;
                    C21576.m49068(new Runnable() { // from class: l.ۛܳ֫
                        @Override // java.lang.Runnable
                        public final void run() {
                            ActivityC7135.m19567(activityC7136, i5, i6, c4770M14735, interfaceC5057, z3);
                        }
                    });
                }
            });
        }
        activityC7135.m19599();
        return 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m19567(ActivityC7135 activityC7135, int i, int i2, C4770 c4770, InterfaceC5054 interfaceC5054, boolean z) {
        activityC7135.f23573 = null;
        if (i == activityC7135.f23554 && i2 == activityC7135.f23564 && c4770 != null) {
            activityC7135.f23586 = c4770;
            activityC7135.m19553(c4770, interfaceC5054.getDuration(), activityC7135.f23590, activityC7135.f23539, z);
        } else if (c4770 != null) {
            c4770.close();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C5841 m19553(C4770 c4770, long j, long j2, boolean z, boolean z2) {
        ImageView imageView;
        if (j <= 0 || j == -9223372036854775807L || this.f23500 == null || (imageView = this.f23596) == null) {
            return null;
        }
        if (z2) {
            imageView.setImageBitmap(null);
        }
        C5841 c5841M19671 = m19671(j2, z);
        this.f23500.setVisibility(0);
        if (this.f23561 == null) {
            this.f23561 = new C15535(getApplicationContext());
        }
        this.f23561.m37218((InterfaceC2386) null, c4770.m14736(), j, this.f23564, new C15338(this));
        this.f23561.m37216(c5841M19671.m17025(), c5841M19671.m17024(), j2);
        return c5841M19671;
    }

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final C5841 m19706() {
        C20560 c20560M11150;
        if (this.f23575 == null && !this.f23549.m11148() && (c20560M11150 = this.f23549.m11150()) != null) {
            C21750 c21750 = this.f23588;
            C21750 c21750M49304 = c21750 == null ? null : c21750.m49304(c20560M11150.m47135(), c20560M11150.m47144() * 1000);
            if (c21750M49304 != null) {
                return m19555(c20560M11150, c21750M49304);
            }
            final C12355 c12355 = new C12355(c20560M11150);
            this.f23575 = c12355;
            C5261.f18540.execute(new Runnable() { // from class: l.ܶܳ֫
                @Override // java.lang.Runnable
                public final void run() {
                    final C21750 c21750M49301;
                    final C12355 c12356 = c12355;
                    int i = ActivityC7135.f23493;
                    try {
                        if (C12355.m30830(c12356, Thread.currentThread())) {
                            C20560 c20560M30831 = C12355.m30831(c12356);
                            c21750M49301 = C21750.m49301(c20560M30831.m47135(), c20560M30831.m47144() * 1000, c20560M30831.m47137(), c20560M30831.m47142(), c20560M30831.m47143(), c20560M30831.m47134(), c20560M30831.m47140());
                        } else {
                            c21750M49301 = null;
                        }
                        C12355.m30832(c12356);
                        final ActivityC7135 activityC7135 = this.f52438;
                        C21576.m49068(new Runnable() { // from class: l.᩺ܳ֫
                            @Override // java.lang.Runnable
                            public final void run() {
                                ActivityC7135.m19580(activityC7135, c12356, c21750M49301);
                            }
                        });
                    } catch (Throwable th) {
                        C12355.m30832(c12356);
                        throw th;
                    }
                }
            });
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19580(ActivityC7135 activityC7135, C12355 c12355, C21750 c21750) {
        if (activityC7135.f23575 != c12355) {
            return;
        }
        activityC7135.f23575 = null;
        C20560 c20560M30831 = C12355.m30831(c12355);
        boolean z = c20560M30831.m47138() == activityC7135.f23512 && c20560M30831.m47141() == activityC7135.f23564;
        boolean zM11149 = activityC7135.f23549.m11149(c20560M30831);
        if (c21750 != null && z) {
            activityC7135.f23588 = c21750;
            if (activityC7135.m19555(c20560M30831, c21750) != null) {
                return;
            }
        }
        if (c21750 == null && z && !zM11149) {
            activityC7135.m19558(c20560M30831.m47141(), (Bitmap) null);
        }
        activityC7135.m19706();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C5841 m19555(C20560 c20560, C21750 c21750) {
        int iM47138 = c20560.m47138();
        int i = this.f23512;
        int iM47141 = c20560.m47141();
        int i2 = this.f23564;
        long jM47139 = c20560.m47139();
        long j = this.f23530;
        long jM11146 = this.f23549.m11146();
        if (iM47138 != i || iM47141 != i2 || jM47139 > j || jM47139 <= jM11146 || this.f23549.m11148() || this.f23500 == null || this.f23596 == null) {
            return null;
        }
        this.f23588 = c21750;
        C5841 c5841M19671 = m19671(this.f23590, this.f23539);
        this.f23500.setVisibility(0);
        if (this.f23504 == null) {
            this.f23504 = new C23438();
        }
        this.f23549.m11151(c20560);
        this.f23504.m52658(c21750, c20560.m47141(), new C13101(this, c20560));
        this.f23504.m52656(c5841M19671.m17025(), c5841M19671.m17024());
        return c5841M19671;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19700(C20560 c20560, int i, Bitmap bitmap) {
        if (this.f23549.m11145(c20560)) {
            boolean z = c20560.m47138() == this.f23512 && i == this.f23564;
            boolean z2 = c20560.m47139() == this.f23530;
            if (z && (bitmap != null || z2)) {
                m19558(i, bitmap);
            }
            m19706();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19585(ActivityC7135 activityC7135, C20560 c20560, int i, C13298 c13298) {
        int iM47138 = c20560.m47138();
        int i2 = activityC7135.f23512;
        int i3 = activityC7135.f23564;
        if (iM47138 == i2 && i == i3 && i == i3) {
            activityC7135.f23558 = c13298;
            View view = activityC7135.f23500;
            if (view == null || view.getVisibility() != 0) {
                return;
            }
            activityC7135.m19671(activityC7135.f23590, activityC7135.f23539);
        }
    }

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    private void m19644() {
        this.f23512++;
        this.f23549.m11144();
        C12355 c12355 = this.f23575;
        if (c12355 != null) {
            C12355.m30829(c12355);
            if (this.f23545 == C12355.m30831(c12355).m47134()) {
                this.f23545 = new C5516();
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m19620(ActivityC7135 activityC7135) {
        activityC7135.f23588 = null;
        C23438 c23438 = activityC7135.f23504;
        activityC7135.f23504 = null;
        if (c23438 != null) {
            c23438.m52657(new RunnableC8078());
        }
        activityC7135.m19599();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public void m19599() {
        m19644();
        View view = this.f23500;
        if (view != null) {
            view.setVisibility(8);
        }
        ImageView imageView = this.f23596;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        C15535 c15535 = this.f23561;
        if (c15535 != null) {
            c15535.m37215();
        }
        C23438 c23438 = this.f23504;
        if (c23438 != null) {
            c23438.m52655();
        }
    }

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public static void m19543(ActivityC7135 activityC7135) {
        View view = activityC7135.f23592;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public static void m19622(ActivityC7135 activityC7135) {
        View view = activityC7135.f23592;
        if (view != null) {
            view.setVisibility(8);
            activityC7135.f23592.setTranslationX(0.0f);
            activityC7135.f23592.setTranslationY(0.0f);
        }
    }

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    private void m19542() {
        this.f23564++;
        this.f23506 = C18787.f61010;
        this.f23558 = null;
        View view = this.f23500;
        if (view != null) {
            view.setVisibility(8);
        }
        ImageView imageView = this.f23596;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        Future future = this.f23573;
        this.f23573 = null;
        this.f23554++;
        if (future != null) {
            future.cancel(true);
        }
        final C4770 c4770 = this.f23586;
        this.f23586 = null;
        C15535 c15535 = this.f23561;
        if (c15535 != null) {
            c15535.m37217(new Runnable() { // from class: l.֡ᩴ֫
                @Override // java.lang.Runnable
                public final void run() {
                    int i = ActivityC7135.f23493;
                    C4770 c4771 = c4770;
                    if (c4771 != null) {
                        c4771.close();
                    }
                }
            });
        } else if (c4770 != null) {
            c4770.close();
        }
        m19644();
        this.f23588 = null;
        C23438 c23438 = this.f23504;
        if (c23438 != null) {
            c23438.m52657(new RunnableC8078());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:90:0x01cf  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C5841 m19671(long j, boolean z) {
        C15648 c15648M46539;
        char c;
        int iM7290;
        int iMax;
        View view;
        InterfaceC5054 interfaceC5054 = this.f23557;
        if (interfaceC5054 == null) {
            c15648M46539 = null;
        } else {
            AbstractC14956 abstractC14956ListIterator = interfaceC5054.mo23568().m30246().listIterator(0);
            c15648M46539 = null;
            loop0: while (abstractC14956ListIterator.hasNext()) {
                C20279 c20279 = (C20279) abstractC14956ListIterator.next();
                if (c20279.m46543() == 2) {
                    for (int i = 0; i < c20279.f65101; i++) {
                        if (c20279.m46544(i)) {
                            c15648M46539 = c20279.m46539(i);
                            break loop0;
                        }
                        if (c15648M46539 == null && c20279.m46541(i, true)) {
                            c15648M46539 = c20279.m46539(i);
                        }
                    }
                }
            }
        }
        C13298 c13298 = this.f23558;
        C18787 c18787 = this.f23506;
        C13298 c13298M7291 = c15648M46539 == null ? null : C2112.m7291(c15648M46539.f50814, c15648M46539.f50852, c15648M46539.f50819, c15648M46539.f50825);
        if (c13298M7291 != null) {
            c13298 = c13298M7291;
        } else if (c13298 == null) {
            C13298 c13298M7292 = c18787 != null ? C2112.m7291(c18787.f61012, c18787.f61011, 0, c18787.f61013) : null;
            c13298 = c13298M7292 != null ? c13298M7292 : new C13298(16.0f, 9.0f);
        }
        int iM19160 = C6907.m19160(180.0f);
        int iM19161 = C6907.m19160(180.0f);
        if (iM19160 <= 0) {
            iM19160 = 16;
        }
        if (iM19161 <= 0) {
            iM19161 = 9;
        }
        float fM32839 = c13298.m32839();
        int iMax2 = Math.max(1, Math.round(iM19160 / fM32839));
        if (iMax2 > iM19161) {
            iM19160 = Math.max(1, Math.round(iM19161 * fM32839));
        } else {
            iM19161 = iMax2;
        }
        C5841 c5841 = new C5841(Math.max(1, iM19160), Math.max(1, iM19161));
        ViewGroup.LayoutParams layoutParams = this.f23500.getLayoutParams();
        layoutParams.width = c5841.m17025();
        layoutParams.height = c5841.m17024();
        this.f23500.setLayoutParams(layoutParams);
        FrameLayout frameLayout = this.f23494;
        int width = frameLayout == null ? 0 : frameLayout.getWidth();
        if (width <= 0) {
            width = getResources().getDisplayMetrics().widthPixels;
        }
        FrameLayout frameLayout2 = this.f23494;
        int height = frameLayout2 == null ? 0 : frameLayout2.getHeight();
        if (height <= 0) {
            height = getResources().getDisplayMetrics().heightPixels;
        }
        if (z) {
            iM7290 = C2112.m7290(width, c5841.m17025());
            c = 1;
        } else {
            int iM17025 = c5841.m17025();
            InterfaceC5054 interfaceC5055 = this.f23557;
            View view2 = this.f23513;
            if (interfaceC5055 == null || view2 == null || view2.getWidth() <= 0) {
                c = 1;
                iM7290 = C2112.m7290(width, iM17025);
            } else {
                int[] iArr = new int[2];
                int[] iArr2 = new int[2];
                view2.getLocationInWindow(iArr);
                this.f23494.getLocationInWindow(iArr2);
                int i2 = iArr[0] - iArr2[0];
                int width2 = view2.getWidth();
                long duration = interfaceC5055.getDuration();
                if (duration <= 0 || width2 <= 0) {
                    c = 1;
                    iM7290 = C2112.m7290(width, iM17025);
                } else {
                    c = 1;
                    iM7290 = Math.max(0, Math.min((Math.round(width2 * (Math.max(0L, Math.min(j, duration)) / duration)) + i2) - (iM17025 / 2), Math.max(0, width - iM17025)));
                }
            }
        }
        int iM17024 = c5841.m17024();
        int iM19162 = C6907.m19160(12.0f);
        if (z && (view = this.f23592) != null && view.getVisibility() == 0) {
            int iM19655 = iM17024 + iM19162 + m19655(width);
            int iMax3 = Math.max(0, iM19162);
            int i3 = height - iM19655;
            iMax = Math.max(iMax3, Math.min(i3 / 2, Math.max(iMax3, i3 - iMax3)));
        } else {
            View view3 = this.f23562;
            if (view3 == null || view3.getHeight() <= 0) {
                iMax = Math.max(iM19162, (height - iM17024) - C6907.m19160(96.0f));
            } else {
                int[] iArr3 = new int[2];
                int[] iArr4 = new int[2];
                this.f23562.getLocationInWindow(iArr3);
                this.f23494.getLocationInWindow(iArr4);
                int i4 = iArr3[c] - iArr4[c];
                if (i4 > 0) {
                    iMax = Math.max(iM19162, (i4 - iM17024) - iM19162);
                } else {
                    iMax = Math.max(iM19162, (height - iM17024) - C6907.m19160(96.0f));
                }
            }
        }
        this.f23500.setTranslationX(iM7290);
        this.f23500.setTranslationY(iMax);
        if (z) {
            int iM17026 = c5841.m17024();
            View view4 = this.f23592;
            if (view4 != null && view4.getVisibility() == 0) {
                int iM19163 = C6907.m19160(12.0f);
                m19683(width);
                int measuredWidth = this.f23592.getMeasuredWidth();
                if (measuredWidth <= 0 && (measuredWidth = this.f23592.getWidth()) <= 0) {
                    measuredWidth = width;
                }
                int iMin = Math.min(iMax + iM17026 + iM19163, Math.max(iM19163, (height - m19655(width)) - iM19163));
                this.f23592.setTranslationX(C2112.m7290(width, measuredWidth));
                this.f23592.setTranslationY(iMin);
            }
        }
        return c5841;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public void m19653() {
        View view = this.f23592;
        if (view == null || view.getVisibility() != 0) {
            return;
        }
        FrameLayout frameLayout = this.f23494;
        int width = frameLayout == null ? 0 : frameLayout.getWidth();
        if (width <= 0) {
            width = getResources().getDisplayMetrics().widthPixels;
        }
        FrameLayout frameLayout2 = this.f23494;
        int height = frameLayout2 == null ? 0 : frameLayout2.getHeight();
        if (height <= 0) {
            height = getResources().getDisplayMetrics().heightPixels;
        }
        int iM19160 = C6907.m19160(12.0f);
        m19683(width);
        int measuredWidth = this.f23592.getMeasuredWidth();
        if (measuredWidth <= 0 && (measuredWidth = this.f23592.getWidth()) <= 0) {
            measuredWidth = width;
        }
        int iM19655 = m19655(width);
        this.f23592.setTranslationX(C2112.m7290(width, measuredWidth));
        View view2 = this.f23592;
        int iMax = Math.max(0, iM19160);
        int i = height - iM19655;
        view2.setTranslationY(Math.max(iMax, Math.min(i / 2, Math.max(iMax, i - iMax))));
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private int m19655(int i) {
        m19683(i);
        int measuredHeight = this.f23592.getMeasuredHeight();
        return measuredHeight > 0 ? measuredHeight : Math.max(1, this.f23592.getHeight());
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m19683(int i) {
        int iMakeMeasureSpec;
        int i2;
        View view = this.f23592;
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null && (i2 = layoutParams.width) > 0) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE);
        }
        this.f23592.measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m19594(int i) {
        ViewGroup viewGroupM15787;
        int childCount;
        C11208 c11208 = this.f23550;
        ViewGroup viewGroup = this.f23535;
        if (c11208 == null || viewGroup == null) {
            return;
        }
        if (i != 4 || (viewGroupM15787 = this.f23547.m15787()) == null) {
            viewGroupM15787 = viewGroup;
        }
        if (c11208.getParent() == viewGroupM15787) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = c11208.getLayoutParams();
        ViewParent parent = c11208.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(c11208);
        }
        if (viewGroupM15787 == viewGroup) {
            childCount = Math.min(this.f23499, viewGroupM15787.getChildCount());
        } else {
            childCount = viewGroupM15787.getChildCount();
        }
        viewGroupM15787.addView(c11208, childCount, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public void m19533() {
        int i;
        C11208 c11208 = this.f23550;
        if (c11208 == null) {
            return;
        }
        if (this.f23532) {
            i = 4;
        } else {
            if (m19695()) {
                String str = (String) C24290.m54307(this.f23516);
                if (!TextUtils.isEmpty(str) && TextUtils.equals(str, m19665())) {
                    i = 4;
                }
            }
            i = 0;
        }
        c11208.setVisibility(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m19551(ActivityC7135 activityC7135, List list) {
        C2660 c2660;
        ArrayList arrayList = activityC7135.f23587;
        if (!((AbstractCollection) list).isEmpty()) {
            ArrayList<C2137> arrayList2 = new ArrayList();
            AbstractC1928 abstractC1928 = (AbstractC1928) list;
            AbstractC14956 abstractC14956ListIterator = abstractC1928.listIterator(0);
            while (abstractC14956ListIterator.hasNext()) {
                C2137 c2137 = (C2137) abstractC14956ListIterator.next();
                if (c2137.f7046 == null && c2137.f7061 != null && c2137.f7048 == -3.4028235E38f) {
                    arrayList2.add(c2137);
                }
            }
            if (!arrayList2.isEmpty()) {
                ArrayList arrayList3 = new ArrayList(arrayList);
                ArrayList arrayList4 = new ArrayList(arrayList2.size());
                for (C2137 c2138 : arrayList2) {
                    int size = arrayList3.size();
                    while (true) {
                        size--;
                        if (size >= 0) {
                            c2660 = (C2660) arrayList3.get(size);
                            if (c2660.f8474 == c2138) {
                                arrayList3.remove(size);
                                break;
                            }
                        } else {
                            int size2 = arrayList3.size();
                            while (true) {
                                size2--;
                                if (size2 < 0) {
                                    c2660 = null;
                                    break;
                                }
                                c2660 = (C2660) arrayList3.get(size2);
                                if (c2660.f8474.equals(c2138)) {
                                    arrayList3.remove(size2);
                                    break;
                                }
                            }
                        }
                    }
                    if (c2660 == null) {
                        int iM19545 = m19545(c2138);
                        int i = 0;
                        while (true) {
                            Iterator it = arrayList4.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                C2660 c2661 = (C2660) it.next();
                                int i2 = c2661.f8476;
                                if (i < c2661.f8475 + i2 && i2 < i + iM19545) {
                                    i++;
                                }
                            }
                        }
                        c2660 = new C2660(c2138, i, iM19545);
                    } else {
                        c2660.f8474 = c2138;
                        c2660.f8475 = m19545(c2138);
                    }
                    arrayList4.add(c2660);
                }
                arrayList.clear();
                arrayList.addAll(arrayList4);
                ArrayList arrayList5 = new ArrayList(list.size());
                AbstractC14956 abstractC14956ListIterator2 = abstractC1928.listIterator(0);
                int i3 = 0;
                while (abstractC14956ListIterator2.hasNext()) {
                    C2137 c2139 = (C2137) abstractC14956ListIterator2.next();
                    if (c2139.f7046 == null && c2139.f7061 != null && c2139.f7048 == -3.4028235E38f) {
                        int i4 = i3 + 1;
                        float fMax = Math.max(0.0f, 0.955f - (((C2660) arrayList4.get(i3)).f8476 * 0.049999997f));
                        C5866 c5866M7381 = c2139.m7381();
                        c5866M7381.m17075(fMax, 0);
                        c5866M7381.m17076(2);
                        arrayList5.add(c5866M7381.m17073());
                        i3 = i4;
                    } else {
                        arrayList5.add(c2139);
                    }
                }
                return arrayList5;
            }
            arrayList.clear();
            return list;
        }
        arrayList.clear();
        return list;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m19545(C2137 c2137) {
        CharSequence charSequence = c2137.f7061;
        int i = 1;
        if (charSequence != null && charSequence.length() != 0) {
            int length = charSequence.length();
            for (int i2 = 0; i2 < length; i2++) {
                if (charSequence.charAt(i2) == '\n') {
                    i++;
                }
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    private void m19650() {
        if (this.f23542 || this.f23557 == null || this.f23533 == null) {
            return;
        }
        String str = this.f23546;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        long duration = this.f23557.getDuration();
        if (duration == -9223372036854775807L) {
            return;
        }
        C21834.m49506(str, this.f23557.getCurrentPosition(), duration);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m19559(long j, boolean z) {
        String strM19546;
        long jMax;
        C9771 c9771;
        if (this.f23557 == null || isFinishing() || isDestroyed()) {
            return;
        }
        this.f23542 = false;
        this.f23518 = false;
        this.f23593 = false;
        this.f23597 = false;
        this.f23551 = false;
        this.f23577 = false;
        m19704(false);
        this.f23527 = false;
        int iIncrementAndGet = this.f23589.incrementAndGet();
        this.f23556 = iIncrementAndGet;
        C14902 c14902Mo3301 = this.f23533.mo3301();
        InterfaceC2386 interfaceC2386Mo3303 = this.f23533.mo3303();
        if (interfaceC2386Mo3303 != null) {
            strM19546 = m19546(interfaceC2386Mo3303);
        } else {
            C20870 c20870 = c14902Mo3301.f48681;
            if (c20870 != null) {
                Object obj = c20870.f66803;
                if (obj instanceof String) {
                    strM19546 = (String) obj;
                }
            }
            throw new IllegalStateException("URL media item has no playback key");
        }
        String str = strM19546;
        if (j == -9223372036854775807L) {
            jMax = C21834.m49504(str);
        } else {
            jMax = Math.max(0L, j);
        }
        C18322 c18322 = new C18322(iIncrementAndGet, c14902Mo3301, interfaceC2386Mo3303, jMax, str, z, (z || interfaceC2386Mo3303 == null || (c9771 = this.f23543) == null) ? null : c9771.m25481());
        List listM19611 = m19611(c18322.m42740());
        boolean zM19688 = m19688(c18322.m42740());
        this.f23563 = z;
        this.f23587.clear();
        m19641();
        m19617(false);
        m19535();
        if (z || c18322.m42743() == null) {
            m19588(c18322, C0423.m2225(c18322.m42744(), listM19611, zM19688));
        } else {
            this.f23548 = C5261.f18540.submit(new RunnableC1744(this, c18322, 1));
        }
    }

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    private void m19535() {
        C9771 c9771 = this.f23543;
        if (c9771 != null) {
            c9771.m25480();
        }
        m19691();
        m19539();
        m19662();
        C24290.m54303(this.f23529);
        m19647();
        m19624();
        m19599();
        this.f23576 = true;
        InterfaceC5054 interfaceC5054 = this.f23557;
        m19627(interfaceC5054 != null ? interfaceC5054.mo23580() : 1);
        m19560((CharSequence) getString(R.string.MT_Protector));
        m19672((CharSequence) getString(R.string.MT_Protector));
        this.f23557.stop();
    }

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public static void m19625(ActivityC7135 activityC7135) {
        activityC7135.f23576 = false;
        InterfaceC5054 interfaceC5054 = activityC7135.f23557;
        activityC7135.m19627(interfaceC5054 == null ? 1 : interfaceC5054.mo23580());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public void m19627(int i) {
        int i2 = 0;
        if (this.f23576 && i != 1) {
            this.f23576 = false;
        }
        View view = this.f23580;
        if (view == null) {
            return;
        }
        if (!this.f23576 && i != 2) {
            i2 = 8;
        }
        view.setVisibility(i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19582(final ActivityC7135 activityC7135, final C18322 c18322) {
        final C0423 c0423M2225;
        AbstractC7629 abstractC7629M42743 = c18322.m42743();
        InterfaceC2386 interfaceC2386M42738 = c18322.m42738();
        if (abstractC7629M42743 == null || interfaceC2386M42738 == null) {
            c0423M2225 = C0423.m2225(c18322.m42744(), Collections.EMPTY_LIST, false);
        } else {
            List listM56595 = Collections.EMPTY_LIST;
            try {
                listM56595 = C25321.m56595(interfaceC2386M42738, abstractC7629M42743);
                C5929 c5929M56596 = C25321.m56596(listM56595, interfaceC2386M42738, abstractC7629M42743.mo20839());
                c0423M2225 = m19552(c18322.m42744(), listM56595, c5929M56596, c5929M56596 == null ? EnumC17576.NONE : EnumC17576.AUTO, true);
            } catch (Exception unused) {
                c0423M2225 = C0423.m2225(c18322.m42744(), listM56595, false);
            }
        }
        C21576.m49068(new Runnable() { // from class: l.ܺܳ֫
            @Override // java.lang.Runnable
            public final void run() {
                this.f55254.m19588(c18322, c0423M2225);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m19588(C18322 c18322, C0423 c0423) {
        String strM42740;
        C11391 c11391M40783;
        int iM42742 = c18322.m42742();
        if (this.f23557 == null || isFinishing() || isDestroyed() || iM42742 != this.f23556) {
            return;
        }
        this.f23548 = null;
        if (!getLifecycle().mo23076().m8762(EnumC2619.STARTED)) {
            this.f23527 = true;
            return;
        }
        if (!c18322.m42741() && c18322.m42743() != null && (c11391M40783 = C17358.m40783((strM42740 = c18322.m42740()))) != null && c11391M40783.m28746() == EnumC16612.FILE) {
            String strM28747 = c11391M40783.m28747();
            if (TextUtils.isEmpty(strM28747)) {
                C17358.m40788(strM42740);
            } else {
                C5929 c5929M19556 = m19556(strM28747, c0423.m2229());
                if (c5929M19556 != null) {
                    c0423 = m19552(c0423.m2227(), c0423.m2229(), c5929M19556, EnumC17576.MANUAL, c0423.m2228());
                } else if (c0423.m2228()) {
                    C17358.m40788(strM42740);
                }
            }
        }
        String strM42741 = c18322.m42740();
        this.f23591 = c0423.m2229();
        this.f23578 = c0423.m2228();
        this.f23507 = strM42741;
        this.f23565 = c0423.m2226();
        this.f23559 = c0423.m2230();
        try {
            String strM42742 = c18322.m42740();
            C24290 c24290 = this.f23516;
            if (this.f23521 && !TextUtils.isEmpty(strM42742)) {
                this.f23524 = strM42742;
                this.f23521 = false;
            }
            if (!TextUtils.equals(strM42742, this.f23524)) {
                this.f23524 = null;
            }
            if (m19695()) {
                if (TextUtils.equals(strM42742, this.f23524)) {
                    strM42742 = null;
                }
                C24290.m54304(c24290, (Object) strM42742);
            } else {
                if (this.f23503 == EnumC6390.AUTO) {
                    this.f23503 = EnumC6390.NONE;
                    if (getRequestedOrientation() != -1) {
                        setRequestedOrientation(-1);
                    }
                }
                C24290.m54303(c24290);
            }
            String strM42743 = c18322.m42740();
            C24290.m54304(this.f23505, TextUtils.isEmpty(strM42743) ? null : new C14592(strM42743, c18322.m42741()));
            C24290.m54304(this.f23501, (Object) c18322.m42740());
            String strM42744 = c18322.m42740();
            if (c0423.m2226() == EnumC17576.MANUAL && !TextUtils.isEmpty(c0423.m2230())) {
                C24290.m54304(this.f23529, new C21306(strM42744, c0423.m2230()));
            } else {
                C24290.m54303(this.f23529);
            }
            m19542();
            if (c18322.m42739() > 0) {
                Object obj = this.f23557;
                C14902 c14902M2227 = c0423.m2227();
                long jM42739 = c18322.m42739();
                AbstractC7971 abstractC7971 = (AbstractC7971) obj;
                abstractC7971.getClass();
                abstractC7971.mo23546(jM42739, AbstractC1928.of((Object) c14902M2227));
            } else {
                ((AbstractC7971) this.f23557).m21694(c0423.m2227());
            }
            this.f23546 = c18322.m42740();
            this.f23557.mo23574();
            ((AbstractC7971) this.f23557).mo23554(true);
        } catch (Exception e) {
            this.f23576 = false;
            InterfaceC5054 interfaceC5054 = this.f23557;
            m19627(interfaceC5054 != null ? interfaceC5054.mo23580() : 1);
            this.f23565 = EnumC17576.NONE;
            this.f23559 = null;
            C24290.m54303(this.f23529);
            m19691();
            m19539();
            m19662();
            C22673.m51154((CharSequence) e.toString());
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m19617(boolean z) {
        Future future = this.f23548;
        this.f23548 = null;
        if (future != null) {
            future.cancel(true);
        }
        if (z) {
            this.f23556 = this.f23589.incrementAndGet();
        }
    }

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    private void m19641() {
        this.f23565 = EnumC17576.NONE;
        this.f23559 = null;
        C24290.m54303(this.f23529);
        List list = Collections.EMPTY_LIST;
        this.f23591 = list;
        this.f23578 = false;
        this.f23507 = null;
        this.f23532 = false;
        C11208 c11208 = this.f23550;
        if (c11208 == null) {
            return;
        }
        c11208.m28244(list);
        c11208.setVisibility(0);
    }

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m19692(ActivityC7135 activityC7135) {
        InterfaceC5054 interfaceC5054 = activityC7135.f23557;
        if (interfaceC5054 == null || activityC7135.f23565 == EnumC17576.NONE || activityC7135.f23563 || TextUtils.isEmpty(activityC7135.f23559)) {
            return false;
        }
        activityC7135.m19559(interfaceC5054.getCurrentPosition(), true);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19574(ActivityC7135 activityC7135, CharSequence charSequence, C14902 c14902) {
        if (!TextUtils.isEmpty(charSequence)) {
            activityC7135.f23584.setText(charSequence);
        } else {
            activityC7135.f23584.setText(c14902 == null ? null : c14902.f48685);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private String m19546(InterfaceC2386 interfaceC2386) {
        String path = interfaceC2386.getPath();
        C9771 c9771 = this.f23543;
        if (c9771 == null) {
            return path;
        }
        AbstractC7629 abstractC7629M25481 = c9771.m25481();
        if (!(abstractC7629M25481 instanceof AbstractC18881)) {
            return path;
        }
        return ((AbstractC18881) abstractC7629M25481).mo35579() + path;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private String m19548(C14902 c14902) {
        if (c14902 == null) {
            return null;
        }
        C20870 c20870 = c14902.f48681;
        if (c20870 != null) {
            Object obj = c20870.f66803;
            if (obj instanceof InterfaceC2386) {
                return m19546((InterfaceC2386) obj);
            }
            return obj instanceof String ? (String) obj : c20870.f66802.toString();
        }
        return c14902.f48685;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private String m19668(C14902 c14902) {
        if (c14902 == null) {
            return null;
        }
        C20870 c20870 = c14902.f48681;
        if (c20870 != null) {
            Object obj = c20870.f66803;
            if (obj instanceof InterfaceC2386) {
                return m19546((InterfaceC2386) obj);
            }
        }
        if (c20870 != null) {
            Object obj2 = c20870.f66803;
            if (obj2 instanceof String) {
                return (String) obj2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    private String m19665() {
        if (!TextUtils.isEmpty(this.f23546)) {
            return this.f23546;
        }
        InterfaceC5054 interfaceC5054 = this.f23557;
        if (interfaceC5054 == null) {
            return null;
        }
        return m19668(interfaceC5054.mo21699());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19581(ActivityC7135 activityC7135, C14902 c14902) {
        C24290.m54306(activityC7135.f23516, activityC7135.m19668(c14902), new C4217());
        activityC7135.m19533();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m19589(C18787 c18787) {
        InterfaceC5054 interfaceC5054 = this.f23557;
        C24290 c24290 = this.f23516;
        String str = (String) C24290.m54307(c24290);
        if (interfaceC5054 == null || TextUtils.isEmpty(str) || !m19695() || !TextUtils.equals(str, m19665())) {
            return;
        }
        int i = c18787.f61012;
        int i2 = c18787.f61011;
        boolean z = false;
        int iM31230 = C12552.m31230(i, i2, 0, c18787.f61013);
        if (iM31230 == -1) {
            if (c18787.f61012 <= 0 || i2 <= 0) {
                return;
            }
            C24290.m54308(c24290);
            this.f23532 = false;
            m19533();
            return;
        }
        C24290.m54308(c24290);
        int i3 = getResources().getConfiguration().orientation;
        if (iM31230 != 0 ? !(iM31230 != 1 || i3 == 1) : i3 != 2) {
            z = true;
        }
        this.f23532 = z;
        this.f23503 = EnumC6390.AUTO;
        if (getRequestedOrientation() != iM31230) {
            setRequestedOrientation(iM31230);
        }
        if (this.f23532) {
            return;
        }
        m19533();
    }

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    private void m19691() {
        C24290.m54303(this.f23516);
        this.f23532 = false;
        m19533();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static void m19657(ActivityC7135 activityC7135) {
        if (Build.VERSION.SDK_INT < 28) {
            return;
        }
        C0385.m2187(activityC7135.f23537);
        C0385.m2187(activityC7135.f23562);
        C0385.m2187(activityC7135.f23544);
        C1861.m6390(activityC7135.f23581);
        C1861.m6390(activityC7135.f23567);
        C1861.m6390(activityC7135.f23560);
        C6279 c6279 = activityC7135.f23594;
        if (c6279 == null) {
            return;
        }
        int iM17955 = c6279.m17955();
        int iM17954 = activityC7135.f23594.m17954();
        int iM17953 = activityC7135.f23594.m17953();
        int iM17952 = activityC7135.f23594.m17952();
        if (iM17955 > 0) {
            C1861.m6389(-1, Math.max(C6907.m19160(20.0f), C6907.m19160(10.0f) + iM17955), -1, activityC7135.f23581);
            C0385.m2188(activityC7135.f23537, -1, iM17955, -1, -1);
        }
        if (iM17954 > 0) {
            C1861.m6389(iM17954, -1, -1, activityC7135.f23567);
            C0385.m2188(activityC7135.f23537, iM17954, -1, -1, -1);
            C0385.m2188(activityC7135.f23562, iM17954, -1, -1, -1);
            C0385.m2188(activityC7135.f23544, iM17954, -1, -1, -1);
        }
        if (iM17953 > 0) {
            C1861.m6389(-1, -1, iM17953, activityC7135.f23560);
            C0385.m2188(activityC7135.f23537, -1, -1, iM17953, -1);
            C0385.m2188(activityC7135.f23562, -1, -1, iM17953, -1);
            C0385.m2188(activityC7135.f23544, -1, -1, iM17953, -1);
        }
        if (iM17952 > 0) {
            C0385.m2188(activityC7135.f23562, -1, -1, -1, iM17952);
            C0385.m2188(activityC7135.f23544, -1, -1, -1, iM17952);
        }
    }

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    private void m19596() {
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        if (!ApplicationC17729.f58258.getBoolean("ins", false) || ApplicationC17729.f58258.getBoolean("vpun", true)) {
            if (Build.VERSION.SDK_INT >= 30) {
                attributes.layoutInDisplayCutoutMode = 3;
            } else {
                attributes.layoutInDisplayCutoutMode = 1;
            }
        } else {
            attributes.layoutInDisplayCutoutMode = 2;
        }
        getWindow().setAttributes(attributes);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19577(ActivityC7135 activityC7135, C1255 c1255, boolean z) {
        c1255.setEnabled(z);
        C6421.m18184(ApplicationC17729.f58258, "vpffs", z);
        activityC7135.m19629();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19576(ActivityC7135 activityC7135, C1255 c1255, C3977 c3977) {
        activityC7135.f23594 = c3977.m12833();
        boolean z = ApplicationC17729.f58258.getBoolean("ins", false);
        if (activityC7135.f23594 == null || z) {
            if (z) {
                C21576.m49068(new RunnableC5458(7, activityC7135));
            }
        } else {
            ApplicationC17729.f58258.edit().putBoolean("ins", true).apply();
            c1255.setVisibility(0);
            if (c1255.isChecked()) {
                c1255.setChecked(false);
            } else {
                activityC7135.m19596();
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m19614(ActivityC7135 activityC7135, View view) {
        activityC7135.f23557.mo23551(new C7445(((Float) view.getTag()).floatValue()));
        TextView[] textViewArr = activityC7135.f23572;
        int length = textViewArr.length;
        for (int i = 0; i < length; i++) {
            TextView textView = textViewArr[i];
            boolean z = textView == view;
            textView.setTextColor(z ? C3296.f10738 : -1);
            textView.setTypeface(z ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m19673(ActivityC7135 activityC7135) {
        activityC7135.f23547.m15797();
        activityC7135.f23544.scrollTo(0, 0);
        View view = activityC7135.f23544;
        view.setTranslationY(view.getHeight());
        activityC7135.f23595.setVisibility(0);
        View view2 = activityC7135.f23544;
        ObjectAnimator.ofFloat(view2, "translationY", view2.getTranslationY(), 0.0f).start();
        activityC7135.m19560((CharSequence) null);
        activityC7135.m19672((CharSequence) null);
        activityC7135.f23582.m49722(activityC7135.f23569);
        ((RunnableC2725) activityC7135.f23496).run();
        float f = activityC7135.f23557.mo23563().f24500;
        for (TextView textView : activityC7135.f23572) {
            boolean z = Math.abs(((Float) textView.getTag()).floatValue() - f) < 0.001f;
            textView.setTextColor(z ? C3296.f10738 : -1);
            textView.setTypeface(z ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m19675(ActivityC7135 activityC7135, View view) {
        C18452 c18452 = new C18452(view.getContext(), view, 0);
        c18452.m42992(8388661);
        C9898 c9898M42995 = c18452.m42995();
        c9898M42995.add(0, 1, 0, R.string.MT_Protector);
        int i = 0;
        while (i < 5) {
            int i2 = f23492[i];
            int i3 = i + 100;
            i++;
            c9898M42995.add(0, i3, i, activityC7135.getString(R.string.MT_Protector, Integer.valueOf(i2)));
        }
        c9898M42995.add(0, 200, 6, R.string.MT_Protector);
        c18452.m42994(new C11398(7, activityC7135));
        c18452.mo21878();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m19590(ActivityC7135 activityC7135, MenuItem menuItem) {
        C21986 c21986 = activityC7135.f23582;
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            c21986.m49720();
            return true;
        }
        if (itemId != 200) {
            int i = itemId - 100;
            if (i < 0 || i >= 5) {
                return false;
            }
            c21986.m49721(f23492[i]);
            return true;
        }
        C5644 c5644 = new C5644(activityC7135, activityC7135);
        c5644.m36565(R.string.MT_Protector);
        c5644.m36568();
        c5644.m36569();
        c5644.m36566(activityC7135.getString(R.string.MT_Protector));
        int iM49723 = c21986.m49723();
        if (iM49723 > 0) {
            c5644.m36571(String.valueOf(iM49723));
            c5644.m36572();
        }
        c5644.m36567();
        return true;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m19687(boolean z) {
        this.f23582.m49725(this.f23569);
        C21576.m49077().removeCallbacks(this.f23496);
        View view = this.f23544;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationY", view.getTranslationY(), this.f23544.getHeight());
        objectAnimatorOfFloat.addListener(new C1915(this));
        if (z) {
            objectAnimatorOfFloat.setDuration(150L);
        }
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public void m19608() {
        TextView textView = this.f23526;
        if (textView == null) {
            return;
        }
        int iM49723 = this.f23582.m49723();
        if (iM49723 > 0) {
            textView.setText(getString(R.string.MT_Protector, Integer.valueOf(iM49723)));
        } else {
            textView.setText(R.string.MT_Protector);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public void m19530() {
        Handler handlerM49077 = C21576.m49077();
        Runnable runnable = this.f23496;
        handlerM49077.removeCallbacks(runnable);
        long jM49724 = this.f23582.m49724();
        if (jM49724 <= 0) {
            return;
        }
        long j = jM49724 % 60000;
        C21576.m49077().postDelayed(runnable, j != 0 ? j : 60000L);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19578(ActivityC7135 activityC7135, C8626 c8626, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        InterfaceC19533 interfaceC19533 = activityC7135.f23557;
        if (interfaceC19533 == null || itemId < 0 || itemId > c8626.m23256().size()) {
            return;
        }
        C12074 c12074Mo23568 = interfaceC19533.mo23568();
        if (!TextUtils.equals(c8626.m23257(), activityC7135.m19548(((AbstractC7971) interfaceC19533).mo21699()))) {
            activityC7135.m19703(c12074Mo23568);
            return;
        }
        if (itemId == 0) {
            activityC7135.f23514 = null;
            interfaceC19533.mo23550(interfaceC19533.mo23582().mo10195().mo12044(2, false).mo12043(2).mo12042());
            activityC7135.m19703(c12074Mo23568);
            return;
        }
        C22580 c22580 = (C22580) c8626.m23256().get(itemId - 1);
        for (C22580 c22581 : C12883.m31922(activityC7135.getResources(), c12074Mo23568)) {
            if (c22581.m50908() == c22580.m50908() && c22581.m50909().m46540().equals(c22580.m50909().m46540())) {
                activityC7135.f23514 = null;
                interfaceC19533.mo23550(C12883.m31923(interfaceC19533.mo23582(), c22580));
                activityC7135.m19703(c12074Mo23568);
                return;
            }
        }
        activityC7135.m19703(c12074Mo23568);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19699(C12074 c12074) {
        C22580 c22580;
        InterfaceC5054 interfaceC5054 = this.f23557;
        C15120 c15120 = this.f23514;
        if (!this.f23522 || interfaceC5054 == null || c15120 == null) {
            return;
        }
        Iterator it = C12883.m31922(getResources(), c12074).iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                c22580 = null;
                break;
            }
            c22580 = (C22580) it.next();
            if (C15120.m36396(c15120, c22580.m50907())) {
                if (i == c15120.m36397()) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (c22580 == null) {
            return;
        }
        this.f23514 = null;
        interfaceC5054.mo23550(C12883.m31923(interfaceC5054.mo23582(), c22580));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m19703(C12074 c12074) {
        CharSequence text;
        if (this.f23522 && this.f23598 != null) {
            List listM31922 = C12883.m31922(getResources(), c12074);
            if (listM31922.size() >= 2) {
                InterfaceC5054 interfaceC5054 = this.f23557;
                int iM31920 = interfaceC5054 == null ? 0 : C12883.m31920(listM31922, interfaceC5054.mo23582());
                if (iM31920 > 0 && iM31920 <= listM31922.size()) {
                    text = ((C22580) listM31922.get(iM31920 - 1)).m50906();
                } else {
                    text = getText(R.string.MT_Protector);
                }
                this.f23598.setText(text);
                this.f23598.setContentDescription(getString(R.string.MT_Protector, text));
                this.f23598.setVisibility(0);
                return;
            }
            TextView textView = this.f23598;
            if (textView != null) {
                textView.setVisibility(8);
                return;
            }
            return;
        }
        TextView textView2 = this.f23598;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public static void m19645(ActivityC7135 activityC7135) {
        TextView textView = activityC7135.f23598;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19573(final ActivityC7135 activityC7135, View view) {
        final C8626 c8626M23254;
        InterfaceC19533 interfaceC19533 = activityC7135.f23557;
        int i = 0;
        C18452 c18452 = null;
        if (interfaceC19533 == null || !activityC7135.f23522) {
            c8626M23254 = C8626.m23254(null);
        } else {
            String strM19548 = activityC7135.m19548(((AbstractC7971) interfaceC19533).mo21699());
            List listM31922 = C12883.m31922(activityC7135.getResources(), interfaceC19533.mo23568());
            if (listM31922.size() < 2) {
                c8626M23254 = C8626.m23254(strM19548);
            } else {
                c8626M23254 = new C8626(strM19548, listM31922, C12883.m31920(listM31922, interfaceC19533.mo23582()), i);
            }
        }
        if (c8626M23254.m23256().size() >= 2) {
            c18452 = new C18452(view.getContext(), view, 0);
            c18452.m42992(8388661);
            C9898 c9898M42995 = c18452.m42995();
            c9898M42995.add(0, 0, 0, R.string.MT_Protector).setCheckable(true);
            int i2 = 0;
            while (i2 < c8626M23254.m23256().size()) {
                int i3 = i2 + 1;
                c9898M42995.add(0, i3, i3, ((C22580) c8626M23254.m23256().get(i2)).m50910()).setCheckable(true);
                i2 = i3;
            }
            c9898M42995.setGroupCheckable(0, true, true);
            int iM23255 = c8626M23254.m23255();
            if (iM23255 >= 0 && iM23255 < c9898M42995.size()) {
                c9898M42995.getItem(iM23255).setChecked(true);
            }
            c18452.m42994(new InterfaceC21436() { // from class: l.ۗܳ֫
                @Override // l.InterfaceC21436
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    ActivityC7135.m19578(this.f12016, c8626M23254, menuItem);
                    return true;
                }
            });
        } else {
            InterfaceC5054 interfaceC5054 = activityC7135.f23557;
            activityC7135.m19703(interfaceC5054 == null ? C12074.f38882 : interfaceC5054.mo23568());
        }
        if (c18452 != null) {
            c18452.mo21878();
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static void m19658(final ActivityC7135 activityC7135, View view) {
        InterfaceC19533 interfaceC19533 = activityC7135.f23557;
        if (interfaceC19533 == null) {
            return;
        }
        if (interfaceC19533.mo23568().m30249() && ((AbstractC7971) interfaceC19533).mo21699() != null) {
            C22673.m51152(R.string.MT_Protector);
            return;
        }
        final C11609 c11609M19621 = activityC7135.m19621();
        if (!c11609M19621.m29168().isEmpty()) {
            C18452 c18452 = new C18452(view.getContext(), view, 0);
            c18452.m42992(8388661);
            C9898 c9898M42995 = c18452.m42995();
            c9898M42995.add(0, 0, 0, R.string.MT_Protector).setCheckable(true);
            int i = 0;
            while (i < c11609M19621.m29168().size()) {
                int i2 = i + 1;
                c9898M42995.add(0, i2, i2, ((C25036) c11609M19621.m29168().get(i)).m55855()).setCheckable(true);
                i = i2;
            }
            c9898M42995.setGroupCheckable(0, true, true);
            int iM29167 = c11609M19621.m29167();
            if (iM29167 >= 0 && iM29167 < c9898M42995.size()) {
                c9898M42995.getItem(iM29167).setChecked(true);
            }
            c18452.m42994(new InterfaceC21436() { // from class: l.᩹ܳ֫
                @Override // l.InterfaceC21436
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    ActivityC7135.m19579(this.f76637, c11609M19621, menuItem);
                    return true;
                }
            });
            c18452.mo21878();
            return;
        }
        C22673.m51152(R.string.MT_Protector);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19579(ActivityC7135 activityC7135, C11609 c11609, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        InterfaceC5054 interfaceC5054 = activityC7135.f23557;
        if (interfaceC5054 == 0 || itemId < 0 || itemId > c11609.m29168().size()) {
            return;
        }
        if (!TextUtils.equals(c11609.m29170(), activityC7135.m19548(((AbstractC7971) interfaceC5054).mo21699()))) {
            activityC7135.m19560((CharSequence) null);
            return;
        }
        if (itemId > 0) {
            C25036 c25036 = (C25036) c11609.m29168().get(itemId - 1);
            m19564(interfaceC5054, c25036);
            String strM29169 = c11609.m29169();
            if (!TextUtils.isEmpty(strM29169)) {
                C15623.m37372(c25036.m55856(), strM29169);
            }
            activityC7135.m19560(c25036.m55855());
            return;
        }
        activityC7135.m19647();
        String strM291610 = c11609.m29169();
        if (!TextUtils.isEmpty(strM291610)) {
            C15623.m37374(strM291610);
        }
        activityC7135.m19560((CharSequence) null);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m19680(ActivityC7135 activityC7135, C12074 c12074) {
        InterfaceC5054 interfaceC5054 = activityC7135.f23557;
        String str = (String) C24290.m54307(activityC7135.f23501);
        if (interfaceC5054 != null && !TextUtils.isEmpty(str) && !c12074.m30249() && TextUtils.equals(str, activityC7135.f23546)) {
            C11609 c11609M19621 = activityC7135.m19621();
            if (TextUtils.equals(str, c11609M19621.m29169())) {
                if (c11609M19621.m29168().isEmpty()) {
                    activityC7135.m19539();
                    return false;
                }
                if (m19544(c11609M19621.m29168(), interfaceC5054.mo23582()) > 0) {
                    activityC7135.m19539();
                    return false;
                }
                int iM37370 = C15623.m37370(str);
                activityC7135.m19539();
                if (iM37370 >= 0) {
                    if (iM37370 >= c11609M19621.m29168().size()) {
                        C15623.m37374(str);
                        return false;
                    }
                    C25036 c25036 = (C25036) c11609M19621.m29168().get(iM37370);
                    m19564(interfaceC5054, c25036);
                    activityC7135.m19560(c25036.m55855());
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public static void m19634(ActivityC7135 activityC7135) {
        activityC7135.m19560((CharSequence) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m19560(CharSequence charSequence) {
        CharSequence charSequenceM55855;
        TextView textView = this.f23540;
        InterfaceC5054 interfaceC5054 = this.f23557;
        if (textView == null || interfaceC5054 == null) {
            return;
        }
        if (!TextUtils.isEmpty(charSequence)) {
            textView.setText(charSequence);
            return;
        }
        Iterator it = m19612(interfaceC5054.mo23568()).iterator();
        while (true) {
            if (!it.hasNext()) {
                charSequenceM55855 = null;
                break;
            }
            C25036 c25036 = (C25036) it.next();
            if (c25036.m55858().m46542()) {
                charSequenceM55855 = c25036.m55855();
                break;
            }
        }
        if (!TextUtils.isEmpty(charSequenceM55855)) {
            textView.setText(charSequenceM55855);
            return;
        }
        C12074 c12074Mo23568 = interfaceC5054.mo23568();
        if (c12074Mo23568.m30249()) {
            textView.setText(R.string.MT_Protector);
        } else if (!c12074Mo23568.m30247(1)) {
            textView.setText(R.string.MT_Protector);
        } else {
            textView.setText(R.string.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    private C11609 m19621() {
        String strM19668;
        InterfaceC19533 interfaceC19533 = this.f23557;
        if (interfaceC19533 == null) {
            return C11609.m29166(null, null);
        }
        C14902 c14902Mo21699 = ((AbstractC7971) interfaceC19533).mo21699();
        String strM19548 = m19548(c14902Mo21699);
        if (!TextUtils.isEmpty(this.f23546)) {
            strM19668 = this.f23546;
        } else {
            strM19668 = m19668(c14902Mo21699);
        }
        String str = strM19668;
        C12074 c12074Mo23568 = interfaceC19533.mo23568();
        if (c12074Mo23568.m30249()) {
            return C11609.m29166(strM19548, str);
        }
        List listM19612 = m19612(c12074Mo23568);
        if (listM19612.isEmpty()) {
            return C11609.m29166(strM19548, str);
        }
        return new C11609(strM19548, str, listM19612, m19544(listM19612, interfaceC19533.mo23582()), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private List m19612(C12074 c12074) {
        ArrayList<C16830> arrayList = new ArrayList();
        AbstractC14956 abstractC14956ListIterator = c12074.m30246().listIterator(0);
        while (abstractC14956ListIterator.hasNext()) {
            C20279 c20279 = (C20279) abstractC14956ListIterator.next();
            int iM46543 = c20279.m46543();
            int i = c20279.f65101;
            if (iM46543 == 1) {
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    if (c20279.m46541(i2, true)) {
                        arrayList2.add(Integer.valueOf(i2));
                    }
                }
                if (!arrayList2.isEmpty()) {
                    arrayList.add(new C16830(c20279, arrayList2, c20279.m46539(((Integer) arrayList2.get(0)).intValue()), arrayList.size()));
                }
            }
        }
        if (arrayList.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        ArrayList arrayList4 = new ArrayList(arrayList.size());
        for (C16830 c16830 : arrayList) {
            arrayList3.add(m19549(c16830.m39747(), false));
            arrayList4.add(m19549(c16830.m39747(), true));
        }
        HashMap mapM19550 = m19550(arrayList3);
        HashMap mapM19551 = m19550(arrayList4);
        ArrayList arrayList5 = new ArrayList(arrayList.size());
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            C16830 c16831 = (C16830) arrayList.get(i3);
            String str = (String) arrayList3.get(i3);
            String strM19656 = m19656(str);
            if (TextUtils.isEmpty(str) || ((Integer) C11392.getOrDefault(mapM19550, strM19656, 0)).intValue() > 1) {
                str = (String) arrayList4.get(i3);
                String strM19657 = m19656(str);
                if (TextUtils.isEmpty(str) || ((Integer) C11392.getOrDefault(mapM19551, strM19657, 0)).intValue() != 1) {
                    str = getString(R.string.MT_Protector) + " " + (c16831.m39749() + 1);
                }
            }
            arrayList5.add(new C25036(c16831.m39746(), c16831.m39748(), str, c16831.m39749()));
        }
        return arrayList5;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m19549(C15648 c15648, boolean z) {
        ArrayList arrayList = new ArrayList(4);
        m19561(c15648.f50846, arrayList);
        m19561(m19636(c15648.f50811), arrayList);
        m19561(m19635(c15648.f50834), arrayList);
        int i = c15648.f50843;
        if (i > 0) {
            m19561(i + "ch", arrayList);
        }
        if (z) {
            String strSubstring = c15648.f50848;
            String upperCase = c15648.f50836;
            if (!TextUtils.isEmpty(strSubstring)) {
                int iLastIndexOf = strSubstring.lastIndexOf(47);
                if (iLastIndexOf >= 0) {
                    strSubstring = strSubstring.substring(iLastIndexOf + 1);
                }
                if (TextUtils.isEmpty(strSubstring)) {
                    upperCase = null;
                } else {
                    upperCase = strSubstring.toUpperCase(Locale.ROOT);
                }
            } else if (TextUtils.isEmpty(upperCase)) {
                upperCase = null;
            }
            m19561(upperCase, arrayList);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return TextUtils.join(" · ", arrayList);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static String m19636(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals("und", str)) {
            return null;
        }
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        String displayLanguage = localeForLanguageTag.getDisplayLanguage(Locale.getDefault());
        if (TextUtils.isEmpty(displayLanguage)) {
            displayLanguage = localeForLanguageTag.getDisplayLanguage(localeForLanguageTag);
        }
        return TextUtils.isEmpty(displayLanguage) ? str : displayLanguage;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static String m19635(int i) {
        if (i == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C7116.m19502(i));
        arrayList.remove("main");
        if (arrayList.isEmpty()) {
            return null;
        }
        return TextUtils.join("/", arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19564(InterfaceC5054 interfaceC5054, C25036 c25036) {
        interfaceC5054.mo23550(interfaceC5054.mo23582().mo10195().mo12044(1, false).mo12043(1).mo12046(new C17295(c25036.m55858().m46540(), c25036.m55857())).mo12042());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m19677(ActivityC7135 activityC7135, C14902 c14902) {
        C24290.m54306(activityC7135.f23501, activityC7135.m19668(c14902), new C4217());
    }

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    private void m19539() {
        C24290.m54303(this.f23501);
    }

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    private void m19647() {
        InterfaceC5054 interfaceC5054 = this.f23557;
        if (interfaceC5054 == null) {
            return;
        }
        C3125 c3125Mo23582 = interfaceC5054.mo23582();
        AbstractC4516 it = c3125Mo23582.f10119.values().iterator();
        while (it.hasNext()) {
            if (((C17295) it.next()).f56324.f53565 == 1) {
                interfaceC5054.mo23550(c3125Mo23582.mo10195().mo12044(1, false).mo12043(1).mo12042());
            }
        }
        if (!c3125Mo23582.f10131.contains(1)) {
            return;
        }
        interfaceC5054.mo23550(c3125Mo23582.mo10195().mo12044(1, false).mo12043(1).mo12042());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static HashMap m19550(ArrayList arrayList) {
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String strM19656 = m19656((String) it.next());
            if (!TextUtils.isEmpty(strM19656)) {
                map.put(strM19656, Integer.valueOf(((Integer) C11392.getOrDefault(map, strM19656, 0)).intValue() + 1));
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static String m19656(String str) {
        return str == null ? "" : str.trim().toLowerCase(Locale.ROOT);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19561(String str, ArrayList arrayList) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strTrim = str.trim();
        if (TextUtils.isEmpty(strTrim)) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equalsIgnoreCase(strTrim)) {
                return;
            }
        }
        arrayList.add(strTrim);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m19544(List list, C3125 c3125) {
        AbstractC4516 it = c3125.f10119.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                return 0;
            }
            C17295 c17295 = (C17295) it.next();
            if (c17295.f56324.f53565 == 1) {
                for (int i = 0; i < list.size(); i++) {
                    if (((C25036) list.get(i)).m55858().m46540().equals(c17295.f56324)) {
                        return i + 1;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007b  */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m19685(final ActivityC7135 activityC7135, View view) {
        final MenuItem item;
        int i;
        InterfaceC19533 interfaceC19533 = activityC7135.f23557;
        if (interfaceC19533 == null) {
            return;
        }
        final C10117 c10117M19697 = activityC7135.m19697();
        List listM26074 = c10117M19697.m26074();
        if (!listM26074.isEmpty()) {
            final C18452 c18452 = new C18452(view.getContext(), view, 0);
            c18452.m42992(8388661);
            C9898 c9898M42995 = c18452.m42995();
            C18211.m42360(c9898M42995);
            boolean[] zArr = new boolean[3];
            for (int i2 = 0; i2 < listM26074.size(); i2++) {
                C7881 c7881 = (C7881) listM26074.get(i2);
                int i3 = C9436.f30612[c7881.f26222.ordinal()];
                if (i3 != 1) {
                    i = 2;
                    if (i3 == 2) {
                        i = 0;
                    } else if (i3 == 3) {
                        i = 1;
                    } else if (i3 != 4) {
                        throw new IncompatibleClassChangeError();
                    }
                } else {
                    i = 0;
                }
                zArr[i] = true;
                c9898M42995.add(i, i2, i2, c7881.m21424()).setCheckable(true);
            }
            for (int i4 = 0; i4 < 3; i4++) {
                if (zArr[i4]) {
                    c9898M42995.setGroupCheckable(i4, true, true);
                }
            }
            int iM26077 = c10117M19697.m26077();
            if (iM26077 < 0 || iM26077 >= c9898M42995.size()) {
                item = null;
            } else {
                item = c9898M42995.getItem(iM26077);
                item.setChecked(true);
            }
            c18452.m42994(new InterfaceC21436() { // from class: l.᩵ܳ֫
                @Override // l.InterfaceC21436
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    ActivityC7135.m19572(this.f66149, item, c18452, c10117M19697, menuItem);
                    return true;
                }
            });
            c18452.mo21878();
            return;
        }
        if (((AbstractC7971) interfaceC19533).mo21699() != null && interfaceC19533.mo23568().m30249()) {
            C22673.m51152(R.string.MT_Protector);
        } else {
            C22673.m51152(R.string.MT_Protector);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19572(ActivityC7135 activityC7135, MenuItem menuItem, C18452 c18452, C10117 c10117, MenuItem menuItem2) {
        C11391 c11391;
        boolean z = false;
        if (menuItem != null) {
            c18452.m42995().findItem(menuItem.getItemId()).setChecked(false);
        }
        menuItem2.setChecked(true);
        int itemId = menuItem2.getItemId();
        InterfaceC5054 interfaceC5054 = activityC7135.f23557;
        if (interfaceC5054 == 0 || itemId < 0 || itemId >= c10117.m26074().size()) {
            return;
        }
        if (TextUtils.equals(c10117.m26075(), activityC7135.m19548(((AbstractC7971) interfaceC5054).mo21699()))) {
            activityC7135.m19662();
            C7881 c7881 = (C7881) c10117.m26074().get(itemId);
            if (c7881.m21423() != EnumC19068.FILE) {
                C24290.m54303(activityC7135.f23529);
            }
            String strM26076 = c10117.m26076();
            int i = C9436.f30612[c7881.m21423().ordinal()];
            if (i == 1) {
                if (!TextUtils.isEmpty(strM26076)) {
                    C17358.m40788(strM26076);
                }
                if (activityC7135.f23565 == EnumC17576.MANUAL && activityC7135.f23533 != null) {
                    List listM19611 = activityC7135.m19611(c10117.m26076());
                    InterfaceC2386 interfaceC2386Mo3303 = activityC7135.f23533.mo3303();
                    if (interfaceC2386Mo3303 == null) {
                        activityC7135.m19624();
                        activityC7135.m19672((CharSequence) null);
                        return;
                    }
                    C9771 c9771 = activityC7135.f23543;
                    if (c9771 != null && c9771.m25481().mo20839()) {
                        z = true;
                    }
                    C5929 c5929M56596 = C25321.m56596(listM19611, interfaceC2386Mo3303, z);
                    activityC7135.m19562(m19552(activityC7135.f23533.mo3301(), listM19611, c5929M56596, c5929M56596 == null ? EnumC17576.NONE : EnumC17576.AUTO, activityC7135.m19688(c10117.m26076())));
                    return;
                }
                activityC7135.m19624();
                activityC7135.m19672((CharSequence) null);
                return;
            }
            if (i == 2) {
                if (!TextUtils.isEmpty(strM26076)) {
                    C17358.m40785(strM26076, new C11391(EnumC16612.OFF, -1, null));
                }
                interfaceC5054.mo23550(interfaceC5054.mo23582().mo10195().mo12044(3, true).mo12043(3).mo12042());
                activityC7135.m19672((CharSequence) activityC7135.getString(R.string.MT_Protector));
                return;
            }
            if (i == 3) {
                C1169 c1169M21422 = c7881.m21422();
                if (c1169M21422 == null) {
                    return;
                }
                if (!TextUtils.isEmpty(strM26076)) {
                    String strSubstring = activityC7135.f23559;
                    if (TextUtils.isEmpty(strSubstring)) {
                        strSubstring = null;
                    } else {
                        int iLastIndexOf = strSubstring.lastIndexOf(47);
                        if (iLastIndexOf >= 0) {
                            strSubstring = strSubstring.substring(iLastIndexOf + 1);
                        }
                    }
                    if (TextUtils.isEmpty(strSubstring) || (!TextUtils.equals(activityC7135.f23559, c1169M21422.m4313()) && !TextUtils.equals(activityC7135.m19626(activityC7135.f23559), c1169M21422.m4310()))) {
                        c11391 = new C11391(EnumC16612.TRACK, c1169M21422.m4311(), null);
                    } else {
                        c11391 = new C11391(EnumC16612.FILE, -1, strSubstring);
                    }
                    C17358.m40785(strM26076, c11391);
                }
                m19563(interfaceC5054, c1169M21422);
                activityC7135.m19672(c1169M21422.m4309());
                return;
            }
            if (i != 4 || activityC7135.f23533 == null || c7881.m21421() == null) {
                return;
            }
            if (!TextUtils.isEmpty(strM26076)) {
                C17358.m40785(strM26076, new C11391(EnumC16612.FILE, -1, c7881.m21421().m17243().getName()));
            }
            activityC7135.m19562(m19552(activityC7135.f23533.mo3301(), activityC7135.m19611(c10117.m26076()), c7881.m21421(), EnumC17576.MANUAL, activityC7135.m19688(c10117.m26076())));
            return;
        }
        activityC7135.m19672((CharSequence) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m19562(C0423 c0423) {
        InterfaceC5054 interfaceC5054 = this.f23557;
        if (interfaceC5054 == null || this.f23533 == null || isFinishing() || isDestroyed()) {
            return;
        }
        int iIncrementAndGet = this.f23589.incrementAndGet();
        this.f23556 = iIncrementAndGet;
        InterfaceC2386 interfaceC2386Mo3303 = this.f23533.mo3303();
        if (interfaceC2386Mo3303 == null) {
            return;
        }
        String strM19546 = m19546(interfaceC2386Mo3303);
        long jMax = Math.max(0L, interfaceC5054.getCurrentPosition());
        this.f23563 = false;
        this.f23587.clear();
        m19641();
        m19617(false);
        m19535();
        m19588(new C18322(iIncrementAndGet, this.f23533.mo3301(), interfaceC2386Mo3303, jMax, strM19546, false, null), c0423);
    }

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public static void m19654(ActivityC7135 activityC7135) {
        activityC7135.m19672((CharSequence) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void m19672(CharSequence charSequence) {
        CharSequence charSequenceM4309;
        String strM19668;
        TextView textView = this.f23523;
        InterfaceC19533 interfaceC19533 = this.f23557;
        if (textView == null || interfaceC19533 == null) {
            return;
        }
        if (!TextUtils.isEmpty(charSequence)) {
            textView.setText(charSequence);
            return;
        }
        if (interfaceC19533.mo23582().f10131.contains(3)) {
            textView.setText(R.string.MT_Protector);
            return;
        }
        Iterator it = m19682(interfaceC19533.mo23568()).iterator();
        while (true) {
            if (!it.hasNext()) {
                charSequenceM4309 = null;
                break;
            }
            C1169 c1169 = (C1169) it.next();
            if (c1169.m4314().m46544(c1169.m4312())) {
                charSequenceM4309 = c1169.m4309();
                break;
            }
        }
        if (!TextUtils.isEmpty(charSequenceM4309)) {
            textView.setText(charSequenceM4309);
            return;
        }
        if (this.f23565 == EnumC17576.MANUAL && !TextUtils.isEmpty(this.f23559)) {
            textView.setText(m19626(this.f23559));
            return;
        }
        C12074 c12074Mo23568 = interfaceC19533.mo23568();
        if (c12074Mo23568.m30249()) {
            textView.setText(R.string.MT_Protector);
            return;
        }
        if (!c12074Mo23568.m30247(3)) {
            C14902 c14902Mo21699 = ((AbstractC7971) interfaceC19533).mo21699();
            if (!TextUtils.isEmpty(this.f23546)) {
                strM19668 = this.f23546;
            } else {
                strM19668 = m19668(c14902Mo21699);
            }
            if (m19611(strM19668).isEmpty()) {
                textView.setText(R.string.MT_Protector);
                return;
            }
        }
        textView.setText(R.string.MT_Protector);
    }

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    private C10117 m19697() {
        String strM19668;
        List<C1169> listM19682;
        int i;
        InterfaceC19533 interfaceC19533 = this.f23557;
        if (interfaceC19533 == null) {
            return C10117.m26073(null, null);
        }
        C14902 c14902Mo21699 = ((AbstractC7971) interfaceC19533).mo21699();
        String strM19548 = m19548(c14902Mo21699);
        if (!TextUtils.isEmpty(this.f23546)) {
            strM19668 = this.f23546;
        } else {
            strM19668 = m19668(c14902Mo21699);
        }
        if (interfaceC19533.mo23568().m30249()) {
            listM19682 = Collections.EMPTY_LIST;
        } else {
            listM19682 = m19682(interfaceC19533.mo23568());
        }
        List<C5929> listM19611 = m19611(strM19668);
        if (!listM19611.isEmpty() && !TextUtils.isEmpty(this.f23559) && m19670(this.f23559, listM19682) != null) {
            ArrayList arrayList = new ArrayList(listM19611.size());
            for (C5929 c5929 : listM19611) {
                if (!TextUtils.equals(this.f23559, c5929.m17243().getPath())) {
                    arrayList.add(c5929);
                }
            }
            listM19611 = arrayList;
        }
        if (listM19682.isEmpty() && listM19611.isEmpty()) {
            return C10117.m26073(strM19548, strM19668);
        }
        ArrayList arrayList2 = new ArrayList(listM19611.size() + listM19682.size() + 2);
        arrayList2.add(new C7881(EnumC19068.AUTO, getString(R.string.MT_Protector), null, null));
        arrayList2.add(new C7881(EnumC19068.OFF, getString(R.string.MT_Protector), null, null));
        for (C1169 c1169 : listM19682) {
            arrayList2.add(new C7881(EnumC19068.TRACK, c1169.m4309(), c1169, null));
        }
        for (C5929 c59210 : listM19611) {
            arrayList2.add(new C7881(EnumC19068.FILE, c59210.m17243().mo8100(), null, c59210));
        }
        C3125 c3125Mo23582 = interfaceC19533.mo23582();
        if (!c3125Mo23582.f10131.contains(3)) {
            AbstractC4516 it = c3125Mo23582.f10119.values().iterator();
            loop3: while (true) {
                if (it.hasNext()) {
                    C17295 c17295 = (C17295) it.next();
                    if (c17295.f56324.f53565 == 3) {
                        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                            C7881 c7881 = (C7881) arrayList2.get(i2);
                            C1169 c1169M21422 = c7881.m21422();
                            if (c7881.m21423() == EnumC19068.TRACK && c1169M21422 != null && c1169M21422.m4314().m46540().equals(c17295.f56324) && c17295.f56325.contains(Integer.valueOf(c1169M21422.m4312()))) {
                                i = i2;
                                break loop3;
                            }
                        }
                    }
                } else {
                    if (this.f23565 == EnumC17576.MANUAL && !TextUtils.isEmpty(this.f23559)) {
                        i = 0;
                        while (i < arrayList2.size()) {
                            C7881 c7882 = (C7881) arrayList2.get(i);
                            if (c7882.m21423() == EnumC19068.FILE && c7882.m21421() != null && TextUtils.equals(this.f23559, c7882.m21421().m17243().getPath())) {
                                break;
                            }
                            i++;
                        }
                        i = -1;
                        break;
                    }
                    i = 0;
                    break;
                }
            }
        } else {
            i = 1;
        }
        return new C10117(i, strM19548, strM19668, arrayList2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private List m19682(C12074 c12074) {
        ArrayList<C9371> arrayList = new ArrayList();
        AbstractC14956 abstractC14956ListIterator = c12074.m30246().listIterator(0);
        while (abstractC14956ListIterator.hasNext()) {
            C20279 c20279 = (C20279) abstractC14956ListIterator.next();
            if (c20279.m46543() == 3) {
                for (int i = 0; i < c20279.f65101; i++) {
                    if (c20279.m46541(i, true)) {
                        arrayList.add(new C9371(c20279, i, c20279.m46539(i), arrayList.size()));
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (C9371 c9371 : arrayList) {
            arrayList2.add(m19669(c9371.m24682(), false));
            arrayList3.add(m19669(c9371.m24682(), true));
        }
        HashMap mapM19550 = m19550(arrayList2);
        HashMap mapM19551 = m19550(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList.size());
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            C9371 c9372 = (C9371) arrayList.get(i2);
            String str = (String) arrayList2.get(i2);
            if (TextUtils.isEmpty(str)) {
                str = getString(R.string.MT_Protector) + " " + (c9372.m24683() + 1);
            } else if (((Integer) C11392.getOrDefault(mapM19550, m19656(str), 0)).intValue() > 1) {
                str = (String) arrayList3.get(i2);
                String strM19656 = m19656(str);
                if (TextUtils.isEmpty(str) || ((Integer) C11392.getOrDefault(mapM19551, strM19656, 0)).intValue() != 1) {
                    str = getString(R.string.MT_Protector) + " " + (c9372.m24683() + 1);
                }
            }
            arrayList4.add(new C1169(c9372.m24685(), c9372.m24684(), c9372.m24682().f50817, c9372.m24682().f50846, str, c9372.m24683()));
        }
        return arrayList4;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004c  */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m19669(C15648 c15648, boolean z) {
        ArrayList arrayList = new ArrayList(4);
        m19561(c15648.f50846, arrayList);
        m19561(m19636(c15648.f50811), arrayList);
        m19561(m19635(c15648.f50834), arrayList);
        if (z) {
            String strSubstring = c15648.f50848;
            String upperCase = c15648.f50836;
            if (!TextUtils.isEmpty(strSubstring)) {
                int iLastIndexOf = strSubstring.lastIndexOf(47);
                if (iLastIndexOf >= 0) {
                    strSubstring = strSubstring.substring(iLastIndexOf + 1);
                }
                if (TextUtils.isEmpty(strSubstring)) {
                    upperCase = null;
                } else {
                    upperCase = strSubstring.toUpperCase(Locale.ROOT);
                }
            } else if (TextUtils.isEmpty(upperCase)) {
                upperCase = null;
            }
            m19561(upperCase, arrayList);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return TextUtils.join(" · ", arrayList);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private List m19611(String str) {
        if (TextUtils.isEmpty(str) || !TextUtils.equals(str, this.f23507)) {
            return Collections.EMPTY_LIST;
        }
        return this.f23591;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private boolean m19688(String str) {
        return !TextUtils.isEmpty(str) && TextUtils.equals(str, this.f23507) && this.f23578;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0423 m19552(C14902 c14902, List list, C5929 c5929, EnumC17576 enumC17576, boolean z) {
        if (c5929 == null || enumC17576 == EnumC17576.NONE) {
            return C0423.m2225(c14902, list, z);
        }
        C2225 c2225M35851 = c14902.m35851();
        String path = c5929.m17243().getPath();
        C24600 c24600 = new C24600(new Uri.Builder().scheme("mt_media").path(path).build());
        c24600.m54921(c5929.m17244());
        c24600.m54922();
        c24600.m54923(c5929.m17243().mo8100());
        c24600.m54920(path);
        c2225M35851.m7574(Collections.singletonList(c24600.m54919()));
        return new C0423(c2225M35851.m7570(), list, z, enumC17576, c5929.m17243().getPath(), 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C5929 m19556(String str, List list) {
        boolean zEqualsIgnoreCase;
        C9771 c9771 = this.f23543;
        boolean z = c9771 != null && c9771.m25481().mo20839();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5929 c5929 = (C5929) it.next();
            String name = c5929.m17243().getName();
            if (name == null || str == null) {
                zEqualsIgnoreCase = false;
            } else {
                zEqualsIgnoreCase = z ? name.equalsIgnoreCase(str) : name.equals(str);
            }
            if (zEqualsIgnoreCase) {
                return c5929;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m19686(ActivityC7135 activityC7135, C14902 c14902) {
        C24290.m54306(activityC7135.f23529, activityC7135.m19668(c14902), new C12271());
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m19615(ActivityC7135 activityC7135, C14902 c14902) {
        C24290.m54306(activityC7135.f23505, activityC7135.m19668(c14902), new C14657());
    }

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    private void m19662() {
        C24290.m54303(this.f23505);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m19592(ActivityC7135 activityC7135, C12074 c12074) {
        C1169 c1169M19670;
        InterfaceC5054 interfaceC5054 = activityC7135.f23557;
        C24290 c24290 = activityC7135.f23529;
        C21306 c21306 = (C21306) C24290.m54307(c24290);
        if (interfaceC5054 == null || c21306 == null || c12074.m30249() || !TextUtils.equals(c21306.m48545(), activityC7135.f23546)) {
            return false;
        }
        if (!TextUtils.equals(c21306.m48545(), activityC7135.m19697().m26076())) {
            return false;
        }
        List listM19682 = activityC7135.m19682(c12074);
        if (listM19682.isEmpty() || (c1169M19670 = activityC7135.m19670(c21306.m48546(), listM19682)) == null) {
            return false;
        }
        C24290.m54303(c24290);
        m19563(interfaceC5054, c1169M19670);
        activityC7135.m19672(c1169M19670.m4309());
        return true;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m19618(ActivityC7135 activityC7135, C12074 c12074) {
        boolean zEqualsIgnoreCase;
        InterfaceC5054 interfaceC5054 = activityC7135.f23557;
        C14592 c14592 = (C14592) C24290.m54307(activityC7135.f23505);
        if (interfaceC5054 != null && c14592 != null && !c12074.m30249()) {
            String strM35217 = c14592.m35217();
            if (TextUtils.equals(strM35217, activityC7135.f23546) && TextUtils.equals(strM35217, activityC7135.m19697().m26076())) {
                C11391 c11391M40783 = C17358.m40783(strM35217);
                if (c11391M40783 == null) {
                    activityC7135.m19662();
                    return false;
                }
                int i = C9436.f30613[c11391M40783.m28746().ordinal()];
                if (i == 1) {
                    activityC7135.m19662();
                    interfaceC5054.mo23550(interfaceC5054.mo23582().mo10195().mo12044(3, true).mo12043(3).mo12042());
                    activityC7135.m19672((CharSequence) activityC7135.getString(R.string.MT_Protector));
                    return true;
                }
                if (i == 2) {
                    int iM28745 = c11391M40783.m28745();
                    List listM19682 = activityC7135.m19682(c12074);
                    if (!listM19682.isEmpty()) {
                        activityC7135.m19662();
                        if (iM28745 < 0 || iM28745 >= listM19682.size()) {
                            C17358.m40788(strM35217);
                            return false;
                        }
                        C1169 c1169 = (C1169) listM19682.get(iM28745);
                        m19563(interfaceC5054, c1169);
                        activityC7135.m19672(c1169.m4309());
                        return true;
                    }
                } else {
                    if (i != 3) {
                        throw new IncompatibleClassChangeError();
                    }
                    String strM28747 = c11391M40783.m28747();
                    if (TextUtils.isEmpty(strM28747)) {
                        activityC7135.m19662();
                        C17358.m40788(strM35217);
                        return false;
                    }
                    if (c14592.m35218()) {
                        activityC7135.m19662();
                        return false;
                    }
                    String strSubstring = activityC7135.f23559;
                    if (TextUtils.isEmpty(strSubstring)) {
                        strSubstring = null;
                    } else {
                        int iLastIndexOf = strSubstring.lastIndexOf(47);
                        if (iLastIndexOf >= 0) {
                            strSubstring = strSubstring.substring(iLastIndexOf + 1);
                        }
                    }
                    C9771 c9771 = activityC7135.f23543;
                    boolean z = c9771 != null && c9771.m25481().mo20839();
                    if (strSubstring == null || strM28747 == null) {
                        zEqualsIgnoreCase = false;
                    } else {
                        zEqualsIgnoreCase = z ? strSubstring.equalsIgnoreCase(strM28747) : strSubstring.equals(strM28747);
                    }
                    if (zEqualsIgnoreCase) {
                        activityC7135.m19662();
                        return false;
                    }
                    if (activityC7135.m19688(strM35217) && activityC7135.m19556(strM28747, activityC7135.m19611(strM35217)) == null) {
                        activityC7135.m19662();
                        C17358.m40788(strM35217);
                        return false;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private C1169 m19670(String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1169 c1169 = (C1169) it.next();
            if (TextUtils.equals(str, c1169.m4313())) {
                return c1169;
            }
        }
        String strM19626 = m19626(str);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C1169 c11610 = (C1169) it2.next();
            if (TextUtils.equals(strM19626, c11610.m4310())) {
                return c11610;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19563(InterfaceC5054 interfaceC5054, C1169 c1169) {
        interfaceC5054.mo23550(interfaceC5054.mo23582().mo10195().mo12044(3, false).mo12043(3).mo12046(new C17295(c1169.m4314().m46540(), Collections.singletonList(Integer.valueOf(c1169.m4312())))).mo12042());
    }

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    private void m19624() {
        InterfaceC5054 interfaceC5054 = this.f23557;
        if (interfaceC5054 == null) {
            return;
        }
        C3125 c3125Mo23582 = interfaceC5054.mo23582();
        AbstractC4516 it = c3125Mo23582.f10119.values().iterator();
        while (it.hasNext()) {
            if (((C17295) it.next()).f56324.f53565 == 3) {
                interfaceC5054.mo23550(c3125Mo23582.mo10195().mo12044(3, false).mo12043(3).mo12042());
            }
        }
        if (!c3125Mo23582.f10131.contains(3)) {
            return;
        }
        interfaceC5054.mo23550(c3125Mo23582.mo10195().mo12044(3, false).mo12043(3).mo12042());
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private String m19626(String str) {
        for (C5929 c5929 : this.f23591) {
            if (TextUtils.equals(str, c5929.m17243().getPath())) {
                return c5929.m17243().mo8100();
            }
        }
        int iLastIndexOf = str.lastIndexOf(47);
        return iLastIndexOf >= 0 ? str.substring(iLastIndexOf + 1) : str;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0086  */
    /* JADX WARN: Code duplicated, block: B:30:0x008a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0090  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ed  */
    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        float yVelocity;
        boolean z;
        View view = this.f23595;
        if (view != null && view.getVisibility() == 0) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f23511 = motionEvent.getRawY();
                this.f23520 = false;
                if (this.f23553 == null) {
                    this.f23553 = VelocityTracker.obtain();
                }
                this.f23553.clear();
                this.f23553.addMovement(motionEvent);
            } else if (action == 1) {
                if (this.f23520) {
                    velocityTracker = this.f23553;
                    if (velocityTracker == null) {
                        this.f23520 = false;
                        View view2 = this.f23544;
                        ObjectAnimator.ofFloat(view2, "translationY", view2.getTranslationY(), 0.0f).start();
                        return true;
                    }
                    velocityTracker.addMovement(motionEvent);
                    this.f23553.computeCurrentVelocity(1000);
                    yVelocity = this.f23553.getYVelocity();
                    float translationY = this.f23544.getTranslationY();
                    float height = this.f23544.getHeight();
                    if (yVelocity < 1000.0f || (yVelocity > -1000.0f && translationY > height * 0.4f)) {
                        if (yVelocity >= 1000.0f) {
                            z = true;
                        } else {
                            z = false;
                        }
                        m19687(z);
                    } else {
                        ObjectAnimator.ofFloat(this.f23544, "translationY", translationY, 0.0f).start();
                    }
                    this.f23520 = false;
                    return true;
                }
            } else if (action == 2) {
                if (this.f23553 == null) {
                    this.f23511 = motionEvent.getRawY();
                    this.f23520 = false;
                    VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
                    this.f23553 = velocityTrackerObtain;
                    velocityTrackerObtain.clear();
                }
                this.f23553.addMovement(motionEvent);
                if (!this.f23520 && motionEvent.getRawY() - this.f23511 > ViewConfiguration.get(this).getScaledTouchSlop() && !this.f23544.canScrollVertically(-1)) {
                    this.f23520 = true;
                    this.f23511 = motionEvent.getRawY();
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.setAction(3);
                    super.dispatchTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (this.f23520) {
                    this.f23544.setTranslationY(Math.max((motionEvent.getRawY() - this.f23511) * 1.5f, 0.0f));
                    return true;
                }
            } else if (action == 3) {
                if (this.f23520) {
                    velocityTracker = this.f23553;
                    if (velocityTracker == null) {
                        this.f23520 = false;
                        View view3 = this.f23544;
                        ObjectAnimator.ofFloat(view3, "translationY", view3.getTranslationY(), 0.0f).start();
                        return true;
                    }
                    velocityTracker.addMovement(motionEvent);
                    this.f23553.computeCurrentVelocity(1000);
                    yVelocity = this.f23553.getYVelocity();
                    float translationY2 = this.f23544.getTranslationY();
                    float height2 = this.f23544.getHeight();
                    if (yVelocity < 1000.0f) {
                        if (yVelocity >= 1000.0f) {
                            z = true;
                        } else {
                            z = false;
                        }
                        m19687(z);
                    } else {
                        if (yVelocity >= 1000.0f) {
                            z = true;
                        } else {
                            z = false;
                        }
                        m19687(z);
                    }
                    this.f23520 = false;
                    return true;
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m19637(ActivityC7135 activityC7135) {
        activityC7135.m19687(false);
    }

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public static void m19698(ActivityC7135 activityC7135) {
        activityC7135.m19687(false);
    }

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public static boolean m19648(ActivityC7135 activityC7135) {
        return activityC7135.f23562.getVisibility() == 4;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static void m19690(ActivityC7135 activityC7135) {
        if (activityC7135.f23562.getVisibility() == 4) {
            activityC7135.f23537.setVisibility(0);
            activityC7135.f23562.setVisibility(0);
            activityC7135.f23560.setVisibility(0);
            activityC7135.f23567.setImageResource(R.drawable.MT_Protector);
        } else {
            activityC7135.f23537.setVisibility(4);
            activityC7135.f23562.setVisibility(4);
            activityC7135.f23560.setVisibility(4);
            activityC7135.f23567.setImageResource(R.drawable.MT_Protector);
        }
        activityC7135.f23547.m15792();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static void m19595(ActivityC7135 activityC7135) {
        activityC7135.m19691();
        String strM19665 = activityC7135.m19665();
        if (!TextUtils.isEmpty(strM19665)) {
            activityC7135.f23524 = strM19665;
            activityC7135.f23521 = false;
        } else {
            activityC7135.f23521 = true;
        }
        if (activityC7135.getResources().getConfiguration().orientation == 1) {
            activityC7135.f23503 = EnumC6390.MANUAL;
            if (activityC7135.getRequestedOrientation() != 0) {
                activityC7135.setRequestedOrientation(0);
                return;
            }
            return;
        }
        activityC7135.f23503 = EnumC6390.MANUAL;
        if (activityC7135.getRequestedOrientation() != 1) {
            activityC7135.setRequestedOrientation(1);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final View m19701(int i) {
        View viewFindViewById = findViewById(i);
        viewFindViewById.setBackground(new C20821());
        return viewFindViewById;
    }

    @Override // l.AbstractActivityC17204, l.ActivityC4348, l.ActivityC8866, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode;
        Object obj;
        if (!this.f23542 || ((keyCode = keyEvent.getKeyCode()) != 90 && keyCode != 89 && keyCode != 87 && keyCode != 88 && keyCode != 85 && keyCode != 79 && keyCode != 126 && keyCode != 127)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            int keyCode2 = keyEvent.getKeyCode();
            if (keyCode2 == 79 || keyCode2 == 85) {
                m19705();
            } else if (keyCode2 == 126) {
                InterfaceC5054 interfaceC5054 = this.f23557;
                if (interfaceC5054 != null && C7116.m19491((InterfaceC19533) interfaceC5054, true)) {
                    m19705();
                    return true;
                }
            } else if (keyCode2 == 127 && (obj = this.f23557) != null) {
                ((AbstractC7971) obj).mo23554(false);
                return true;
            }
        }
        return true;
    }

    @Override // l.AbstractActivityC17204, l.ActivityC4348, l.ActivityC3409, android.app.Activity
    public final void onDestroy() {
        if (isFinishing() && !isChangingConfigurations()) {
            C22337.m50406(this.f23574);
            this.f23574 = null;
        }
        super.onDestroy();
        C5243 c5243 = this.f23547;
        if (c5243 != null) {
            c5243.removeCallbacks(this.f23515);
        }
        m19617(true);
        C14789 c14789 = this.f23569;
        C21986 c21986 = this.f23582;
        c21986.m49725(c14789);
        C21576.m49077().removeCallbacks(this.f23496);
        c21986.m49720();
        m19633();
    }

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    private void m19633() {
        this.f23576 = false;
        C9771 c9771 = this.f23543;
        this.f23543 = null;
        final C11806 c11806 = c9771 == null ? null : new C11806(c9771);
        C5243 c5243 = this.f23547;
        if (c5243 != null) {
            c5243.m15789((InterfaceC19533) null);
        }
        InterfaceC5054 interfaceC5054 = this.f23557;
        if (interfaceC5054 != null) {
            interfaceC5054.mo23543();
            this.f23557.mo15286();
            this.f23557 = null;
        }
        if (c11806 != null) {
            c11806.m29649();
        }
        m19691();
        this.f23524 = null;
        this.f23521 = false;
        this.f23503 = EnumC6390.NONE;
        m19539();
        m19662();
        m19641();
        this.f23546 = null;
        if (c9771 != null) {
            c9771.m25476();
            c11806.m29648();
        }
        C16281 c16281 = this.f23570;
        this.f23570 = null;
        final RunnableC5473 runnableC5473 = new RunnableC5473(1, c16281);
        this.f23564++;
        this.f23506 = C18787.f61010;
        this.f23558 = null;
        View view = this.f23500;
        if (view != null) {
            view.setVisibility(8);
        }
        ImageView imageView = this.f23596;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        C15535 c15535 = this.f23561;
        this.f23561 = null;
        Future future = this.f23573;
        this.f23573 = null;
        this.f23554++;
        if (future != null) {
            future.cancel(true);
        }
        final C4770 c4770 = this.f23586;
        this.f23586 = null;
        m19644();
        this.f23588 = null;
        C23438 c23438 = this.f23504;
        this.f23504 = null;
        int i = (c15535 == null ? 0 : 1) + (c23438 != null ? 1 : 0);
        if (i == 0) {
            if (c4770 != null) {
                c4770.close();
            }
            if (c11806 != null) {
                c11806.m29650();
            }
            runnableC5473.run();
        } else {
            final AtomicInteger atomicInteger = new AtomicInteger(i);
            Runnable runnable = new Runnable() { // from class: l.ᩳᩴ֫
                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = ActivityC7135.f23493;
                    if (atomicInteger.decrementAndGet() != 0) {
                        return;
                    }
                    C4770 c4771 = c4770;
                    if (c4771 != null) {
                        c4771.close();
                    }
                    C11806 c11807 = c11806;
                    if (c11807 != null) {
                        c11807.m29650();
                    }
                    runnableC5473.run();
                }
            };
            if (c15535 != null) {
                c15535.m37217(runnable);
            }
            if (c23438 != null) {
                c23438.m52657(runnable);
            }
        }
        C15036 c15036 = this.f23583;
        this.f23583 = null;
        if (c15036 != null) {
            c15036.m36193();
        }
        C24734 c24734 = this.f23536;
        this.f23536 = null;
        if (c24734 != null) {
            c24734.close();
        }
        this.f23531 = null;
        this.f23528 = null;
        this.f23541 = null;
        C5516 c5516 = this.f23545;
        this.f23545 = null;
        if (c5516 != null) {
            c5516.close();
        }
        VelocityTracker velocityTracker = this.f23553;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f23553 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ InterfaceC13433 m19557(ActivityC7135 activityC7135, InterfaceC15670 interfaceC15670, InterfaceC15670 interfaceC15671, InterfaceC15670 interfaceC15672, int i) {
        if (i == 4) {
            return interfaceC15670.mo3996();
        }
        if (i == 1) {
            return new C3300(interfaceC15671.mo3996(), activityC7135.f23583);
        }
        return interfaceC15672.mo3996();
    }

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    private void m19629() {
        int i = 0;
        if (ApplicationC17729.f58258.getBoolean("vpffs", false)) {
            i = ApplicationC17729.f58258.getBoolean("vpsm", false) ? 3 : 4;
        }
        this.f23547.m15788(i);
        m19594(i);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m19616(ActivityC7135 activityC7135, boolean z) {
        C6421.m18184(ApplicationC17729.f58258, "vpsm", z);
        activityC7135.m19629();
    }

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m19695() {
        return ApplicationC17729.f58258.getBoolean("vpao", false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19586(ActivityC7135 activityC7135, boolean z) {
        C6421.m18184(ApplicationC17729.f58258, "vpao", z);
        if (!z) {
            activityC7135.m19691();
            if (activityC7135.f23503 != EnumC6390.AUTO) {
                return;
            }
            activityC7135.f23503 = EnumC6390.NONE;
            if (activityC7135.getRequestedOrientation() != -1) {
                activityC7135.setRequestedOrientation(-1);
                return;
            }
            return;
        }
        String strM19665 = activityC7135.m19665();
        if (!TextUtils.isEmpty(strM19665)) {
            if (!TextUtils.equals(strM19665, activityC7135.f23524)) {
                activityC7135.f23524 = null;
            }
            if (!TextUtils.equals(strM19665, activityC7135.f23524)) {
                C24290.m54305(activityC7135.f23516, strM19665);
                activityC7135.m19533();
            }
        }
        InterfaceC5054 interfaceC5054 = activityC7135.f23557;
        if (interfaceC5054 != null) {
            activityC7135.m19589(interfaceC5054.mo23541());
        }
    }

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public static boolean m19638() {
        return ApplicationC17729.f58258.getBoolean("vplp", false);
    }

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public static boolean m19660() {
        return ApplicationC17729.f58258.getBoolean("vpapn", false);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m19679(ActivityC7135 activityC7135, boolean z) {
        C6421.m18184(ApplicationC17729.f58258, "vpun", z);
        activityC7135.m19596();
    }
}
