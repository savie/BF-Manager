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

/* JADX INFO: renamed from: l.ۧۧ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes4.dex */
public class ActivityC10957 extends AbstractActivityC12483 {

    /* JADX INFO: renamed from: ֨ۚ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f37270 = 0;

    /* JADX INFO: renamed from: ۬ۚ, reason: not valid java name and contains not printable characters */
    public static final int[] f37271 = {15, 30, 45, 60, 90};

    /* JADX INFO: renamed from: ֡ۨ, reason: not valid java name and contains not printable characters */
    public ImageView f37273;

    /* JADX INFO: renamed from: ֡ܰ, reason: not valid java name and contains not printable characters */
    public boolean f37274;

    /* JADX INFO: renamed from: ֨ۖ, reason: not valid java name and contains not printable characters */
    public C18615 f37275;

    /* JADX INFO: renamed from: ֨ۨ, reason: not valid java name and contains not printable characters */
    public C10148 f37276;

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public String f37277;

    /* JADX INFO: renamed from: ֫ۨ, reason: not valid java name and contains not printable characters */
    public boolean f37279;

    /* JADX INFO: renamed from: ֫ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC20723 f37280;

    /* JADX INFO: renamed from: ۖۨ, reason: not valid java name and contains not printable characters */
    public C15087 f37283;

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public volatile C15170 f37284;

    /* JADX INFO: renamed from: ۗۖ, reason: not valid java name and contains not printable characters */
    public C19321 f37285;

    /* JADX INFO: renamed from: ۗۨ, reason: not valid java name and contains not printable characters */
    public Future f37286;

    /* JADX INFO: renamed from: ۘۖ, reason: not valid java name and contains not printable characters */
    public View f37288;

    /* JADX INFO: renamed from: ۘۨ, reason: not valid java name and contains not printable characters */
    public View f37289;

    /* JADX INFO: renamed from: ۙۖ, reason: not valid java name and contains not printable characters */
    public C14153 f37291;

    /* JADX INFO: renamed from: ۙۚ, reason: not valid java name and contains not printable characters */
    public View f37292;

    /* JADX INFO: renamed from: ۙۨ, reason: not valid java name and contains not printable characters */
    public int f37293;

    /* JADX INFO: renamed from: ۚۖ, reason: not valid java name and contains not printable characters */
    public boolean f37294;

    /* JADX INFO: renamed from: ۚۚ, reason: not valid java name and contains not printable characters */
    public String f37295;

    /* JADX INFO: renamed from: ۚۨ, reason: not valid java name and contains not printable characters */
    public Future f37296;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public C18011 f37297;

    /* JADX INFO: renamed from: ۛۖ, reason: not valid java name and contains not printable characters */
    public ViewGroup f37298;

    /* JADX INFO: renamed from: ۛۨ, reason: not valid java name and contains not printable characters */
    public InterfaceC6908 f37299;

    /* JADX INFO: renamed from: ۛܰ, reason: not valid java name and contains not printable characters */
    public ProgressBar f37300;

    /* JADX INFO: renamed from: ۜۖ, reason: not valid java name and contains not printable characters */
    public InterfaceC20723 f37301;

    /* JADX INFO: renamed from: ۜۨ, reason: not valid java name and contains not printable characters */
    public boolean f37302;

    /* JADX INFO: renamed from: ۜܰ, reason: not valid java name and contains not printable characters */
    public TextView f37303;

    /* JADX INFO: renamed from: ۟ۖ, reason: not valid java name and contains not printable characters */
    public View f37304;

    /* JADX INFO: renamed from: ۟ۨ, reason: not valid java name and contains not printable characters */
    public boolean f37305;

    /* JADX INFO: renamed from: ۟ܰ, reason: not valid java name and contains not printable characters */
    public C9203 f37306;

    /* JADX INFO: renamed from: ۠ۖ, reason: not valid java name and contains not printable characters */
    public ProgressBar f37307;

    /* JADX INFO: renamed from: ۠ܰ, reason: not valid java name and contains not printable characters */
    public String f37309;

    /* JADX INFO: renamed from: ۡۖ, reason: not valid java name and contains not printable characters */
    public View f37310;

    /* JADX INFO: renamed from: ۡۨ, reason: not valid java name and contains not printable characters */
    public boolean f37311;

    /* JADX INFO: renamed from: ۡܰ, reason: not valid java name and contains not printable characters */
    public C11601 f37312;

    /* JADX INFO: renamed from: ۢۖ, reason: not valid java name and contains not printable characters */
    public TextView f37313;

    /* JADX INFO: renamed from: ۢۨ, reason: not valid java name and contains not printable characters */
    public boolean f37314;

    /* JADX INFO: renamed from: ۢܰ, reason: not valid java name and contains not printable characters */
    public boolean f37315;

    /* JADX INFO: renamed from: ۤۖ, reason: not valid java name and contains not printable characters */
    public boolean f37316;

    /* JADX INFO: renamed from: ۤۨ, reason: not valid java name and contains not printable characters */
    public boolean f37317;

    /* JADX INFO: renamed from: ۧۖ, reason: not valid java name and contains not printable characters */
    public int f37319;

    /* JADX INFO: renamed from: ۧۨ, reason: not valid java name and contains not printable characters */
    public View f37320;

    /* JADX INFO: renamed from: ۧܰ, reason: not valid java name and contains not printable characters */
    public TextView f37321;

    /* JADX INFO: renamed from: ۨۖ, reason: not valid java name and contains not printable characters */
    public View f37322;

    /* JADX INFO: renamed from: ۨۚ, reason: not valid java name and contains not printable characters */
    public View f37323;

    /* JADX INFO: renamed from: ۨۨ, reason: not valid java name and contains not printable characters */
    public C20814 f37324;

    /* JADX INFO: renamed from: ۫ۖ, reason: not valid java name and contains not printable characters */
    public TextView f37325;

    /* JADX INFO: renamed from: ۫ۨ, reason: not valid java name and contains not printable characters */
    public String f37326;

    /* JADX INFO: renamed from: ۫ܰ, reason: not valid java name and contains not printable characters */
    public ImageView f37327;

    /* JADX INFO: renamed from: ۬ۖ, reason: not valid java name and contains not printable characters */
    public View f37328;

    /* JADX INFO: renamed from: ܰۖ, reason: not valid java name and contains not printable characters */
    public boolean f37331;

    /* JADX INFO: renamed from: ܰۚ, reason: not valid java name and contains not printable characters */
    public TextView f37332;

    /* JADX INFO: renamed from: ܰۨ, reason: not valid java name and contains not printable characters */
    public C8114 f37333;

    /* JADX INFO: renamed from: ܳܰ, reason: not valid java name and contains not printable characters */
    public C16540 f37336;

    /* JADX INFO: renamed from: ܶۖ, reason: not valid java name and contains not printable characters */
    public boolean f37337;

    /* JADX INFO: renamed from: ܶۨ, reason: not valid java name and contains not printable characters */
    public C1824 f37338;

    /* JADX INFO: renamed from: ܶܰ, reason: not valid java name and contains not printable characters */
    public View f37339;

    /* JADX INFO: renamed from: ܺۖ, reason: not valid java name and contains not printable characters */
    public VelocityTracker f37340;

    /* JADX INFO: renamed from: ܺۨ, reason: not valid java name and contains not printable characters */
    public boolean f37341;

    /* JADX INFO: renamed from: ܺܰ, reason: not valid java name and contains not printable characters */
    public View f37342;

    /* JADX INFO: renamed from: ܽۨ, reason: not valid java name and contains not printable characters */
    public FrameLayout f37344;

    /* JADX INFO: renamed from: ܽܰ, reason: not valid java name and contains not printable characters */
    public View f37345;

    /* JADX INFO: renamed from: ܿۖ, reason: not valid java name and contains not printable characters */
    public TextView[] f37346;

    /* JADX INFO: renamed from: ܿۨ, reason: not valid java name and contains not printable characters */
    public C1263 f37347;

    /* JADX INFO: renamed from: ܿܰ, reason: not valid java name and contains not printable characters */
    public GestureDetectorOnGestureListenerC22951 f37348;

    /* JADX INFO: renamed from: ᩳۖ, reason: not valid java name and contains not printable characters */
    public View f37349;

    /* JADX INFO: renamed from: ᩳۨ, reason: not valid java name and contains not printable characters */
    public C9587 f37350;

    /* JADX INFO: renamed from: ᩳܰ, reason: not valid java name and contains not printable characters */
    public String f37351;

    /* JADX INFO: renamed from: ᩴۖ, reason: not valid java name and contains not printable characters */
    public View f37352;

    /* JADX INFO: renamed from: ᩴۨ, reason: not valid java name and contains not printable characters */
    public long f37353;

    /* JADX INFO: renamed from: ᩵ۖ, reason: not valid java name and contains not printable characters */
    public TextView f37355;

    /* JADX INFO: renamed from: ᩵ۨ, reason: not valid java name and contains not printable characters */
    public boolean f37356;

    /* JADX INFO: renamed from: ᩵ܰ, reason: not valid java name and contains not printable characters */
    public boolean f37357;

    /* JADX INFO: renamed from: ᩶ۨ, reason: not valid java name and contains not printable characters */
    public View f37359;

    /* JADX INFO: renamed from: ᩶ܰ, reason: not valid java name and contains not printable characters */
    public ViewGroup f37360;

    /* JADX INFO: renamed from: ᩷ۖ, reason: not valid java name and contains not printable characters */
    public float f37361;

    /* JADX INFO: renamed from: ᩷ۨ, reason: not valid java name and contains not printable characters */
    public boolean f37362;

    /* JADX INFO: renamed from: ᩷ܰ, reason: not valid java name and contains not printable characters */
    public View f37363;

    /* JADX INFO: renamed from: ᩸ۖ, reason: not valid java name and contains not printable characters */
    public View f37364;

    /* JADX INFO: renamed from: ᩸ۨ, reason: not valid java name and contains not printable characters */
    public int f37365;

    /* JADX INFO: renamed from: ᩹ۖ, reason: not valid java name and contains not printable characters */
    public InterfaceC17693 f37367;

    /* JADX INFO: renamed from: ᩹ۚ, reason: not valid java name and contains not printable characters */
    public boolean f37368;

    /* JADX INFO: renamed from: ᩹ۨ, reason: not valid java name and contains not printable characters */
    public int f37369;

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public volatile int f37370;

    /* JADX INFO: renamed from: ᩺ۖ, reason: not valid java name and contains not printable characters */
    public TextView f37371;

    /* JADX INFO: renamed from: ᩺ۨ, reason: not valid java name and contains not printable characters */
    public ImageView f37372;

    /* JADX INFO: renamed from: ᩺ܰ, reason: not valid java name and contains not printable characters */
    public boolean f37373;

    /* JADX INFO: renamed from: ᩻ۖ, reason: not valid java name and contains not printable characters */
    public boolean f37374;

    /* JADX INFO: renamed from: ᩻ۨ, reason: not valid java name and contains not printable characters */
    public long f37375;

    /* JADX INFO: renamed from: ᩻ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC20723 f37376;

    /* JADX INFO: renamed from: ۗܰ, reason: not valid java name and contains not printable characters */
    public final C15190 f37287 = new C15190();

    /* JADX INFO: renamed from: ۠ۨ, reason: not valid java name and contains not printable characters */
    public C13314 f37308 = C13314.f44192;

    /* JADX INFO: renamed from: ۤܰ, reason: not valid java name and contains not printable characters */
    public boolean f37318 = false;

    /* JADX INFO: renamed from: ۖۖ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f37281 = new AtomicInteger();

    /* JADX INFO: renamed from: ۖۚ, reason: not valid java name and contains not printable characters */
    public final ArrayList f37282 = new ArrayList();

    /* JADX INFO: renamed from: ᩸ܰ, reason: not valid java name and contains not printable characters */
    public EnumC3899 f37366 = EnumC3899.NONE;

    /* JADX INFO: renamed from: ᩴܰ, reason: not valid java name and contains not printable characters */
    public List f37354 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public final C8134 f37330 = new C8134();

    /* JADX INFO: renamed from: ܳۨ, reason: not valid java name and contains not printable characters */
    public EnumC18717 f37335 = EnumC18717.NONE;

    /* JADX INFO: renamed from: ֫ۖ, reason: not valid java name and contains not printable characters */
    public final C8134 f37278 = new C8134();

    /* JADX INFO: renamed from: ܳۖ, reason: not valid java name and contains not printable characters */
    public final C8134 f37334 = new C8134();

    /* JADX INFO: renamed from: ۘܰ, reason: not valid java name and contains not printable characters */
    public final C8134 f37290 = new C8134();

    /* JADX INFO: renamed from: ᩶ۖ, reason: not valid java name and contains not printable characters */
    public final C10647 f37358 = new C10647(new Runnable() { // from class: l.ܶܿ۬
        @Override // java.lang.Runnable
        public final void run() {
            this.f50070.m27704();
        }
    });

    /* JADX INFO: renamed from: ܽۖ, reason: not valid java name and contains not printable characters */
    public final Runnable f37343 = new RunnableC17161(this);

    /* JADX INFO: renamed from: ֡ۖ, reason: not valid java name and contains not printable characters */
    public final C21725 f37272 = new InterfaceC5707() { // from class: l.᩸ܿ۬
        @Override // l.InterfaceC5707
        /* JADX INFO: renamed from: ۙ */
        public final void mo15742() {
            ActivityC10957.m27575(this.f70433);
        }
    };

    /* JADX INFO: renamed from: ۬ۨ, reason: not valid java name and contains not printable characters */
    public final RunnableC19008 f37329 = new RunnableC19008(1, this);

    @Override // l.AbstractActivityC12483
    /* JADX INFO: renamed from: ۡ */
    public final String mo126() {
        return "VideoPlayerActivity";
    }

    @Override // l.ActivityC4866
    /* JADX INFO: renamed from: ᩳ */
    public final int mo9927() {
        return 2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m27575(ActivityC10957 activityC10957) {
        activityC10957.m27687();
        activityC10957.m27619();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m27544(ActivityC10957 activityC10957) {
        if (activityC10957.getLifecycle().mo9170().m24173(EnumC9414.STARTED)) {
            activityC10957.m27571(-9223372036854775807L, false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27597(final AbstractActivityC12483 abstractActivityC12483, Intent intent, AbstractC9677 abstractC9677, final InterfaceC2557 interfaceC2557) {
        if (!m27681() || abstractActivityC12483.isFinishing() || abstractActivityC12483.isDestroyed() || !(abstractC9677 instanceof C21611)) {
            return;
        }
        Future futureSubmit = C4716.f16636.submit(new Callable() { // from class: l.ۜۛ۬
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i = ActivityC10957.f37270;
                return Integer.valueOf(C8175.m21474(abstractActivityC12483, interfaceC2557.mo7989()));
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

    /* JADX WARN: Code duplicated, block: B:76:0x04a7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v48, types: [l.᩶ۛ۬] */
    @Override // l.AbstractActivityC12483, l.ActivityC4866, l.ActivityC19126, l.ActivityC1086, l.ActivityC16858, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C21830 c21830;
        C11122 c11122;
        C21830 c21831;
        int iMax;
        int iM48601;
        C5872 c5872;
        InterfaceC20723 c11828;
        final InterfaceC20723 c6661;
        C1057 c1057;
        final InterfaceC20723 interfaceC20723;
        EnumC13718 enumC13718;
        Intent intent;
        int intExtra;
        int i = 0;
        this.f41637 = false;
        setTheme(C2666.m8210());
        super.onCreate(bundle);
        int i2 = 1;
        if (m27681() && (intent = getIntent()) != null && ((intExtra = intent.getIntExtra("bin.mt.media.extra.INITIAL_REQUESTED_ORIENTATION", -1)) == 0 || intExtra == 1)) {
            this.f37335 = EnumC18717.AUTO;
            if (getRequestedOrientation() != intExtra) {
                setRequestedOrientation(intExtra);
            }
        }
        m31016(R.layout.MT_Protector);
        C14494 onBackPressedDispatcher = getOnBackPressedDispatcher();
        C16456 c16456 = new C16456(this);
        onBackPressedDispatcher.getClass();
        onBackPressedDispatcher.m34905(c16456);
        m27705(R.id.MT_Protector).setOnClickListener(new ViewOnClickListenerC14141(4, this));
        this.f37344 = (FrameLayout) m31016(R.id.MT_Protector);
        this.f37275 = (C18615) m31016(R.id.MT_Protector);
        this.f37332 = (TextView) m31016(R.id.MT_Protector);
        this.f37371 = (TextView) m27705(R.id.MT_Protector);
        View viewFindViewById = findViewById(R.id.MT_Protector);
        viewFindViewById.setBackground(new C19930(0));
        this.f37349 = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.MT_Protector);
        viewFindViewById2.setBackground(new C19930(0));
        this.f37273 = (ImageView) viewFindViewById2;
        this.f37359 = m31016(R.id.MT_Protector);
        this.f37289 = m31016(R.id.MT_Protector);
        this.f37372 = (ImageView) m31016(R.id.MT_Protector);
        this.f37339 = m31016(R.id.MT_Protector);
        this.f37323 = m31016(R.id.MT_Protector);
        this.f37352 = m31016(R.id.MT_Protector);
        this.f37307 = (ProgressBar) m31016(R.id.MT_Protector);
        this.f37355 = (TextView) m31016(R.id.MT_Protector);
        this.f37345 = m31016(R.id.MT_Protector);
        this.f37300 = (ProgressBar) m31016(R.id.MT_Protector);
        this.f37321 = (TextView) m31016(R.id.MT_Protector);
        this.f37327 = (ImageView) m31016(R.id.MT_Protector);
        this.f37360 = (ViewGroup) m31016(R.id.MT_Protector);
        this.f37349.setOnClickListener(new ViewOnClickListenerC17491(0, this));
        this.f37273.setOnClickListener(new ViewOnClickListenerC11517(0, this));
        this.f37328 = m31016(R.id.MT_Protector);
        this.f37363 = m31016(R.id.MT_Protector);
        this.f37322 = m27705(R.id.MT_Protector);
        this.f37364 = m27705(R.id.MT_Protector);
        this.f37342 = m27705(R.id.MT_Protector);
        View viewFindViewById3 = findViewById(R.id.MT_Protector);
        this.f37292 = viewFindViewById3;
        if (viewFindViewById3 instanceof InterfaceC7326) {
            ((InterfaceC7326) viewFindViewById3).mo9502(new C3049(this));
        }
        this.f37288 = m27705(R.id.MT_Protector);
        this.f37320 = m27705(R.id.MT_Protector);
        this.f37288.setOnClickListener(new ViewOnClickListenerC5602(this, i2));
        this.f37320.setOnClickListener(new ViewOnClickListenerC20689(i, this));
        m27705(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.ۡܿ۬
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityC10957.m27655(this.f30829);
            }
        });
        this.f37371.setOnClickListener(new ViewOnClickListenerC21808(2, this));
        View viewM31016 = m31016(R.id.MT_Protector);
        this.f37304 = viewM31016;
        this.f37310 = viewM31016.findViewById(R.id.MT_Protector);
        this.f37304.setOnClickListener(new ViewOnClickListenerC0557(0, this));
        C7000.m18808(this.f37323);
        C7000.m18808(this.f37339);
        C7000.m18808(this.f37310);
        C4177.m11819(this.f37360);
        C4177.m11819(this.f37273);
        C4177.m11819(this.f37349);
        C12562 c12562 = (C12562) this.f37310.findViewById(R.id.switch4);
        final C12562 c12563 = (C12562) this.f37310.findViewById(R.id.switch5);
        C12562 c12564 = (C12562) this.f37310.findViewById(R.id.switch7);
        c12562.setChecked(ApplicationC0716.f2992.getBoolean("vpffs", false));
        c12563.setChecked(ApplicationC0716.f2992.getBoolean("vpsm", false));
        c12564.setChecked(m27681());
        c12562.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ܽܿ۬
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                ActivityC10957.m27590(this.f53771, c12563, z);
            }
        });
        c12563.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.۫ܿ۬
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                ActivityC10957.m27638(this.f42022, z);
            }
        });
        if (c12562.isChecked()) {
            c12563.setEnabled(true);
        }
        m27665();
        c12564.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ۛܿ۬
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                ActivityC10957.m27596(this.f21086, z);
            }
        });
        C12562 c12565 = (C12562) this.f37310.findViewById(R.id.switch1);
        c12565.setChecked(ApplicationC0716.f2992.getBoolean("vplp", false));
        c12565.setOnCheckedChangeListener(new C11142());
        C12562 c12566 = (C12562) this.f37310.findViewById(R.id.switch6);
        c12566.setChecked(ApplicationC0716.f2992.getBoolean("vpsp", false));
        c12566.setOnCheckedChangeListener(new C23842());
        C12562 c12567 = (C12562) this.f37310.findViewById(R.id.switch2);
        c12567.setChecked(ApplicationC0716.f2992.getBoolean("vpapn", false));
        c12567.setOnCheckedChangeListener(new C14670());
        TextView textView = (TextView) this.f37310.findViewById(R.id.MT_Protector);
        this.f37303 = textView;
        textView.setText(R.string.MT_Protector);
        TextView textView2 = (TextView) this.f37310.findViewById(R.id.MT_Protector);
        this.f37313 = textView2;
        textView2.setText(R.string.MT_Protector);
        this.f37325 = (TextView) this.f37310.findViewById(R.id.MT_Protector);
        m27687();
        this.f37310.findViewById(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.֫ܿ۬
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityC10957.m27610(this.f7400, view);
            }
        });
        this.f37310.findViewById(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.ۤܿ۬
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityC10957.m27545(this.f35644, view);
            }
        });
        this.f37310.findViewById(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.۟ܿ۬
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityC10957.m27657(this.f25173, view);
            }
        });
        if (Build.VERSION.SDK_INT >= 28) {
            m27642();
            C12562 c12568 = (C12562) this.f37310.findViewById(R.id.switch3);
            c12568.setChecked(ApplicationC0716.f2992.getBoolean("vpun", true));
            c12568.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.᩷ܿ۬
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    ActivityC10957.m27661(this.f68459, z);
                }
            });
            if (ApplicationC0716.f2992.getBoolean("ins", false)) {
                c12568.setVisibility(0);
            }
            C5031.m13989(getWindow().getDecorView(), new C16081(this, c12568));
        }
        float[] fArr = {0.5f, 1.0f, 1.25f, 1.5f, 2.0f, 3.0f};
        int[] iArr = {R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector};
        this.f37346 = new TextView[6];
        DecimalFormat decimalFormat = new DecimalFormat("0.0##");
        for (int i3 = 0; i3 < 6; i3++) {
            TextView[] textViewArr = this.f37346;
            TextView textView3 = (TextView) this.f37310.findViewById(iArr[i3]);
            textViewArr[i3] = textView3;
            textView3.setBackground(new C19930());
            textView3.setText(decimalFormat.format(fArr[i3]));
            textView3.setTag(Float.valueOf(fArr[i3]));
            textView3.setOnClickListener(new ViewOnClickListenerC20314(i, this));
        }
        String stringExtra = getIntent().getStringExtra("bin.mt.media.extra.URL_ARGUMENTS_TOKEN");
        this.f37295 = stringExtra;
        InterfaceC20723 c6763 = null;
        if (!TextUtils.isEmpty(stringExtra)) {
            String str = this.f37295;
            C11122 c11123 = str == null ? null : (C11122) C12670.m31502("VideoPlayerUrlArguments:".concat(str));
            if (c11123 == null) {
                C15829.m37618(R.string.MT_Protector);
                finish();
                return;
            } else {
                this.f37368 = true;
                this.f37315 = c11123.m28046();
                c11122 = c11123;
                c21830 = null;
            }
        } else {
            C21830 c21832 = (C21830) C12670.m31502("VideoPlayerArguments");
            if (c21832 == null) {
                c21832 = C21830.m48599(this, "video/");
            }
            if (c21832 == null || c21832.m48602().isEmpty()) {
                c21832 = null;
            } else {
                int iM48602 = c21832.m48601();
                if (iM48602 < 0 || iM48602 >= c21832.m48602().size()) {
                    iM48602 = 0;
                }
                InterfaceC2557 interfaceC2557 = (InterfaceC2557) c21832.m48602().get(iM48602);
                if (!C11122.m28043(interfaceC2557.getName())) {
                    List listM48602 = c21832.m48602();
                    ArrayList arrayList = new ArrayList(listM48602.size());
                    boolean z = false;
                    int size = 0;
                    for (int i4 = 0; i4 < listM48602.size(); i4++) {
                        InterfaceC2557 interfaceC2558 = (InterfaceC2557) listM48602.get(i4);
                        if (C11122.m28043(interfaceC2558.getName())) {
                            z = true;
                        } else {
                            if (i4 == iM48602) {
                                size = arrayList.size();
                            }
                            arrayList.add(interfaceC2558);
                        }
                    }
                    if (z) {
                        c21831 = new C21830(c21832.m48600(), arrayList, size);
                    } else if (iM48602 != c21832.m48601()) {
                        c21832 = new C21830(c21832.m48600(), listM48602, iM48602);
                    }
                } else if ((c21832.m48600() instanceof C21611) || (c21832.m48600() instanceof AbstractC12233)) {
                    c21831 = new C21830(c21832.m48600(), Collections.singletonList(interfaceC2557), 0);
                } else {
                    c21832 = null;
                }
                c21832 = c21831;
            }
            if (c21832 == null) {
                C15829.m37618(R.string.MT_Protector);
                finish();
                return;
            } else {
                c21830 = c21832;
                c11122 = null;
            }
        }
        C3908.m11364(this);
        this.f37275.m43059();
        ViewGroup viewGroup = this.f37344;
        View viewM43056 = this.f37275.m43056();
        if (viewM43056 != null) {
            ViewParent parent = viewM43056.getParent();
            if (parent instanceof ViewGroup) {
                viewGroup = (ViewGroup) parent;
                iMax = Math.max(0, viewGroup.indexOfChild(viewM43056));
            } else {
                iMax = 1;
            }
            viewM43056.setVisibility(8);
        } else {
            iMax = 1;
        }
        C19321 c19321 = new C19321(this, null);
        c19321.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        c19321.setClickable(false);
        c19321.setFocusable(false);
        viewGroup.addView(c19321, iMax);
        this.f37285 = c19321;
        this.f37298 = viewGroup;
        this.f37319 = iMax;
        m27552(this.f37275.m43057());
        C19321 c19322 = this.f37285;
        if (c19322 != null) {
            c19322.m44301();
            c19322.m44304(new C1723(-855310, 0, 0, 1, -1342177280, null));
            c19322.m44302(0.04f);
            c19322.m44305();
        }
        this.f37348 = new GestureDetectorOnGestureListenerC22951(this);
        final GestureDetector gestureDetector = new GestureDetector(this, this.f37348);
        this.f37275.setOnTouchListener(new View.OnTouchListener() { // from class: l.ܺۛ۬
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                ActivityC10957.m27581(this.f51055, gestureDetector, motionEvent);
                return true;
            }
        });
        if (c11122 != null) {
            this.f37299 = new C23822(c11122, getString(R.string.MT_Protector));
            c5872 = null;
        } else {
            if (bundle == null || (iM48601 = bundle.getInt("bin.mt.media.state.CURRENT_MEDIA_INDEX", c21830.m48601())) < 0 || iM48601 >= c21830.m48602().size()) {
                iM48601 = c21830.m48601();
            }
            c5872 = new C5872(iM48601, c21830.m48602());
            this.f37299 = c5872;
            this.f37315 = C11122.m28043(c5872.mo7410().getName());
        }
        if (this.f37315 && bundle != null) {
            Bundle bundle2 = bundle.getBundle("bin.mt.media.state.VIDEO_QUALITY_SELECTION");
            this.f37291 = (bundle2 == null || bundle2.getInt("schema", 0) != 1 || bundle2.getInt("matching_ordinal", -1) < 0) ? null : new C14153(bundle2.getInt("width", -1), bundle2.getInt("height", -1), bundle2.getInt("average_bitrate", -1), bundle2.getInt("peak_bitrate", -1), bundle2.getFloat("frame_rate", -1.0f), bundle2.getString("codecs"), bundle2.getString("sample_mime_type"), bundle2.getInt("matching_ordinal"));
        }
        if (this.f37299.size() <= 1) {
            this.f37320.setEnabled(false);
            this.f37288.setEnabled(false);
            this.f37320.setAlpha(0.33f);
            this.f37288.setAlpha(0.33f);
        }
        this.f37347 = C4085.m11626(this);
        this.f37276 = new C10148();
        if (c5872 != null) {
            if (this.f37315) {
                enumC13718 = EnumC13718.HLS_DIRECT;
            } else {
                enumC13718 = EnumC13718.NORMAL;
            }
            C11601 c11601 = new C11601(this, c21830.m48600(), c5872, enumC13718, this.f37347);
            this.f37312 = c11601;
            if (this.f37315 || !(c21830.m48600() instanceof AbstractC12233)) {
                c6763 = c11601;
            } else {
                C1263 c1263 = this.f37347;
                final C11601 c11602 = this.f37312;
                C13638.requireNonNull(c11602);
                c6763 = new C6763(c1263, (C19984) new InterfaceC20723() { // from class: l.᩶ۛ۬
                    @Override // l.InterfaceC20723
                    /* JADX INFO: renamed from: ۙ */
                    public final InterfaceC15785 mo4000() {
                        C11601 c11603 = c11602;
                        c11603.getClass();
                        return new C12616(c11603);
                    }
                }, (InterfaceC20723) this.f37312, new C18267(this, c1263));
            }
            this.f37312.m28926(new InterfaceC23537() { // from class: l.֡ۛ۬
                @Override // java.util.function.IntConsumer
                public final void accept(int i5) {
                    ActivityC10957.m27576(this.f1419, i5);
                }

                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final /* bridge */ /* synthetic */ void n(Object obj) {
                    mo1000((Integer) obj);
                }

                @Override // l.InterfaceC23537
                /* JADX INFO: renamed from: ۨ */
                public final /* synthetic */ void mo1000(Integer num) {
                    C10837.m27159((InterfaceC23537) this, num);
                }

                public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                    return C10837.m27158((InterfaceC23537) this, intConsumer);
                }

                public final Consumer andThen(Consumer consumer) {
                    return C1455.$default$andThen(this, consumer);
                }
            });
        }
        if (c11122 == null) {
            c11828 = new C10846();
        } else {
            c11828 = new C11828(c11122.m28048(), c11122.m28044());
        }
        this.f37301 = c11828;
        C18758 c18758 = new C18758(c6763, c11828, this.f37347);
        C3455 c3455 = new C3455(this);
        c3455.m10162();
        C18511 c18511 = new C18511();
        c18511.m42902();
        C11601 c11603 = this.f37312;
        InterfaceC0166 c20606 = c18511;
        if (c11603 != null) {
            c20606 = new C20606(c18511, c11603);
        }
        C1598 c1598 = new C1598(c18758, c20606);
        c1598.m5449(new C2674());
        if (this.f37315) {
            this.f37333 = new C8114(new RunnableC4263(5, this));
            C1263 c1264 = this.f37347;
            if (c1264 == null) {
                throw new IllegalStateException("Media cache session is missing");
            }
            final InterfaceC20723 interfaceC20724 = this.f37312;
            if (interfaceC20724 != null && c21830 != null) {
                if (c21830.m48600() instanceof AbstractC12233) {
                    c1057 = new C1057(c1264, interfaceC20724, new C2039(this, c1264), C4085.m11624(), EnumC11642.f39117, new C6433(), null);
                    final C11601 c11604 = this.f37312;
                    C13638.requireNonNull(c11604);
                    c6661 = new C6763(c1264, new InterfaceC20723() { // from class: l.᩶ۛ۬
                        @Override // l.InterfaceC20723
                        /* JADX INFO: renamed from: ۙ */
                        public final InterfaceC15785 mo4000() {
                            C11601 c11605 = c11604;
                            c11605.getClass();
                            return new C12616(c11605);
                        }
                    }, this.f37312, new C9731(this, c1264));
                } else {
                    c6661 = interfaceC20724;
                    interfaceC20723 = c6661;
                }
                InterfaceC15992 interfaceC15992 = new InterfaceC15992() { // from class: l.ۙۛ۬
                    @Override // l.InterfaceC15992
                    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                    public final InterfaceC15785 mo12441(int i5) {
                        return ActivityC10957.m27568(this.f15871, interfaceC20724, c6661, interfaceC20723, i5);
                    }
                };
                this.f37376 = interfaceC20723;
                this.f37280 = c6661;
                C11053 c11053 = new C11053(interfaceC15992);
                c11053.m27873(new C17471(this.f37333, this.f37324));
                c11053.m27874((InterfaceC14113) new C2674());
                c1598.m5448(c11053);
            } else {
                interfaceC20724 = this.f37301;
                C13638.requireNonNull(interfaceC20724);
                C20814 c20814 = new C20814();
                this.f37324 = c20814;
                C1057 c1058 = new C1057(c1264, interfaceC20724, new InterfaceC1118() { // from class: l.֫ۡ۬
                    @Override // l.InterfaceC1118
                    /* JADX INFO: renamed from: ۙ */
                    public final String mo4141(C12257 c12257) {
                        return C4085.m11619(c12257.f41015, interfaceC20724);
                    }
                }, C4085.m11624(), EnumC11642.f39119, new C6433(), c20814);
                c6661 = new C6661(c20814, new C6763(c1264, interfaceC20724, new InterfaceC1118() { // from class: l.ۗܿ۬
                    @Override // l.InterfaceC1118
                    /* JADX INFO: renamed from: ۙ */
                    public final String mo4141(C12257 c12257) {
                        int i5 = ActivityC10957.f37270;
                        return C4085.m11619(c12257.f41015, interfaceC20724);
                    }
                }), interfaceC20724);
                c1057 = c1058;
            }
            C1057 c1059 = c1057;
            interfaceC20723 = interfaceC20724;
            interfaceC20724 = c1059;
            InterfaceC15992 interfaceC15993 = new InterfaceC15992() { // from class: l.ۙۛ۬
                @Override // l.InterfaceC15992
                /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                public final InterfaceC15785 mo12441(int i5) {
                    return ActivityC10957.m27568(this.f15871, interfaceC20724, c6661, interfaceC20723, i5);
                }
            };
            this.f37376 = interfaceC20723;
            this.f37280 = c6661;
            C11053 c11054 = new C11053(interfaceC15993);
            c11054.m27873(new C17471(this.f37333, this.f37324));
            c11054.m27874((InterfaceC14113) new C2674());
            c1598.m5448(c11054);
        }
        C14872 c14872 = new C14872(this, c3455, c1598);
        c14872.m35568();
        c14872.m35567();
        InterfaceC17693 interfaceC17693M35564 = c14872.m35564();
        this.f37367 = interfaceC17693M35564;
        this.f37275.m43053(interfaceC17693M35564);
        this.f37322.setOnClickListener(new View.OnClickListener() { // from class: l.᩵ܿ۬
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityC10957.m27667(this.f62960);
            }
        });
        this.f37367.mo25812(0);
        this.f37367.mo25839(new C9401(this));
        this.f37279 = true;
        C18615 c18615 = this.f37275;
        if (c18615 == null) {
            return;
        }
        RunnableC19008 runnableC19008 = this.f37329;
        c18615.removeCallbacks(runnableC19008);
        this.f37275.post(runnableC19008);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27581(ActivityC10957 activityC10957, GestureDetector gestureDetector, MotionEvent motionEvent) {
        gestureDetector.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            GestureDetectorOnGestureListenerC22951 gestureDetectorOnGestureListenerC22951 = activityC10957.f37348;
            int i = gestureDetectorOnGestureListenerC22951.f74612;
            gestureDetectorOnGestureListenerC22951.f74612 = -1;
            gestureDetectorOnGestureListenerC22951.f74618 = false;
            ActivityC10957 activityC10958 = gestureDetectorOnGestureListenerC22951.f74614;
            boolean z = activityC10958.f37318;
            if (!z && !activityC10958.f37311 && i == 0) {
                m27617(activityC10958);
                ((AbstractC22465) activityC10958.f37367).seekTo(gestureDetectorOnGestureListenerC22951.f74606);
                activityC10958.m27678();
            } else if (!z && activityC10958.f37345.getVisibility() != 8) {
                activityC10958.f37345.setVisibility(8);
            }
            gestureDetectorOnGestureListenerC22951.m50796();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m27576(ActivityC10957 activityC10957, int i) {
        if (i == -2) {
            activityC10957.f37345.setVisibility(8);
            activityC10957.f37318 = false;
        } else {
            if (i == -1) {
                activityC10957.f37318 = true;
                activityC10957.f37345.setVisibility(0);
                activityC10957.f37321.setVisibility(0);
                activityC10957.f37327.setVisibility(8);
                activityC10957.f37321.setText(R.string.MT_Protector);
                return;
            }
            activityC10957.f37300.setProgress(i * 10);
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m27667(ActivityC10957 activityC10957) {
        activityC10957.m27711();
        activityC10957.f37275.m43049();
    }

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public static void m27536(final ActivityC10957 activityC10957) {
        InterfaceC10161 interfaceC10161 = activityC10957.f37367;
        if (interfaceC10161 != null) {
            AbstractC22465 abstractC22465 = (AbstractC22465) interfaceC10161;
            if (abstractC22465.m49967()) {
                if (activityC10957.f37368 && activityC10957.f37315) {
                    boolean z = activityC10957.f37311;
                    activityC10957.f37311 = true;
                    boolean zM49965 = abstractC22465.m49965();
                    activityC10957.f37317 = zM49965;
                    if (zM49965) {
                        activityC10957.f37305 = false;
                    } else if (interfaceC10161.mo25808() == 4) {
                        activityC10957.f37305 = true;
                    }
                    activityC10957.m27708(true);
                    if (!z) {
                        String str = activityC10957.f37277;
                        if (!TextUtils.isEmpty(str)) {
                            C1783.m5853(str);
                        }
                        activityC10957.m27622();
                        abstractC22465.mo25855();
                    }
                    activityC10957.m27690();
                    return;
                }
                if (activityC10957.f37362 || activityC10957.isFinishing() || activityC10957.isDestroyed()) {
                    return;
                }
                activityC10957.f37362 = true;
                String str2 = activityC10957.f37277;
                if (!TextUtils.isEmpty(str2)) {
                    C1783.m5853(str2);
                }
                activityC10957.f37277 = null;
                C11122.m28041(activityC10957.f37295);
                activityC10957.f37295 = null;
                InterfaceC17693 interfaceC17693 = activityC10957.f37367;
                if (interfaceC17693 != null) {
                    interfaceC17693.stop();
                    ((AbstractC22465) activityC10957.f37367).mo25834();
                }
                C8067 c8067BuildDialog = activityC10957.buildDialog();
                c8067BuildDialog.m21274(R.string.MT_Protector);
                c8067BuildDialog.m21253(R.string.MT_Protector);
                c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩵ۛ۬
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        int i2 = ActivityC10957.f37270;
                        this.f62235.finish();
                    }
                });
                c8067BuildDialog.m21265(false);
                c8067BuildDialog.m21269();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27708(boolean z) {
        View view = this.f37292;
        if (view != null) {
            boolean z2 = !z;
            view.setEnabled(z2);
            this.f37292.setVisibility(z ? 8 : 0);
            this.f37292.setFocusable(z2);
            this.f37292.setImportantForAccessibility(z ? 4 : 0);
        }
        View view2 = this.f37328;
        if (view2 != null) {
            view2.setVisibility(z ? 8 : 0);
        }
        View view3 = this.f37363;
        if (view3 != null) {
            view3.setVisibility(z ? 8 : 0);
        }
        C18615 c18615 = this.f37275;
        if (c18615 != null) {
            boolean z3 = !z;
            c18615.m43058(z3);
            this.f37275.m43054(z3);
        }
        View view4 = this.f37364;
        if (view4 != null) {
            view4.setVisibility(z ? 8 : 0);
        }
        View view5 = this.f37342;
        if (view5 != null) {
            view5.setVisibility(z ? 8 : 0);
        }
        View view6 = this.f37288;
        if (view6 != null) {
            view6.setVisibility(z ? 8 : 0);
        }
        View view7 = this.f37320;
        if (view7 != null) {
            view7.setVisibility(z ? 8 : 0);
        }
        if (z) {
            View view8 = this.f37352;
            if (view8 != null) {
                view8.setVisibility(8);
                this.f37352.setTranslationX(0.0f);
                this.f37352.setTranslationY(0.0f);
            }
            m27678();
            GestureDetectorOnGestureListenerC22951 gestureDetectorOnGestureListenerC22951 = this.f37348;
            if (gestureDetectorOnGestureListenerC22951 != null) {
                ActivityC10957 activityC10957 = gestureDetectorOnGestureListenerC22951.f74614;
                if (gestureDetectorOnGestureListenerC22951.f74612 == 0) {
                    gestureDetectorOnGestureListenerC22951.f74612 = -2;
                }
                m27617(activityC10957);
                activityC10957.m27678();
                this.f37348.m50796();
            }
        }
        m27690();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public void m27690() {
        View view = this.f37322;
        if (view == null) {
            return;
        }
        boolean z = this.f37305;
        view.setEnabled(!z);
        this.f37322.setAlpha(!z ? 1.0f : 0.33f);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m27711() {
        InterfaceC10161 interfaceC10161 = this.f37367;
        if (interfaceC10161 == null) {
            return;
        }
        if (this.f37311) {
            if (this.f37305) {
                return;
            }
            if (!C17983.m41845(interfaceC10161, true)) {
                ((AbstractC22465) interfaceC10161).mo25820(false);
                return;
            }
            if (!this.f37317) {
                C17983.m41844(interfaceC10161);
                return;
            }
            InterfaceC10161 interfaceC10162 = this.f37367;
            if (interfaceC10162 == null || this.f37305) {
                return;
            }
            AbstractC22465 abstractC22465 = (AbstractC22465) interfaceC10162;
            abstractC22465.mo25855();
            if (interfaceC10162.mo25808() == 1) {
                interfaceC10162.mo25836();
            }
            abstractC22465.mo25820(true);
            return;
        }
        if (!C17983.m41845(interfaceC10161, true)) {
            AbstractC22465 abstractC22466 = (AbstractC22465) interfaceC10161;
            if (abstractC22466.mo25841(1)) {
                abstractC22466.pause();
                return;
            }
            return;
        }
        C17983.m41844(interfaceC10161);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m27604(ActivityC10957 activityC10957, C15100 c15100) {
        InterfaceC17693 interfaceC17693 = activityC10957.f37367;
        if (interfaceC17693 == null || !activityC10957.f37311 || !activityC10957.f37317 || c15100.f49319 != 1002 || activityC10957.f37373) {
            return false;
        }
        activityC10957.f37373 = true;
        boolean zMo25806 = interfaceC17693.mo25806();
        InterfaceC10161 interfaceC10161 = activityC10957.f37367;
        if (interfaceC10161 != null && !activityC10957.f37305) {
            AbstractC22465 abstractC22465 = (AbstractC22465) interfaceC10161;
            abstractC22465.mo25855();
            interfaceC10161.mo25836();
            if (zMo25806) {
                abstractC22465.mo25820(true);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m27623(ActivityC10957 activityC10957) {
        InterfaceC17693 interfaceC17693 = activityC10957.f37367;
        if (activityC10957.f37311 && !activityC10957.f37341 && interfaceC17693 != null) {
            C14395 c14395Mo25826 = interfaceC17693.mo25826();
            AbstractC0477 it = c14395Mo25826.f47176.values().iterator();
            while (it.hasNext()) {
                C5927 c5927 = (C5927) it.next();
                if (c5927.f20187.f54866 == 2 && !c5927.f20188.isEmpty()) {
                    activityC10957.f37341 = true;
                    activityC10957.f37291 = null;
                    boolean zMo25806 = interfaceC17693.mo25806();
                    interfaceC17693.mo25817(c14395Mo25826.mo5308().mo34363(2, false).mo34362(2).mo34361());
                    InterfaceC10161 interfaceC10161 = activityC10957.f37367;
                    if (interfaceC10161 != null && !activityC10957.f37305) {
                        if (activityC10957.f37317) {
                            ((AbstractC22465) interfaceC10161).mo25855();
                        }
                        interfaceC10161.mo25836();
                        if (zMo25806) {
                            ((AbstractC22465) interfaceC10161).mo25820(true);
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public static void m27620(final ActivityC10957 activityC10957) {
        if (activityC10957.f37356 || activityC10957.isFinishing() || activityC10957.isDestroyed()) {
            return;
        }
        activityC10957.f37356 = true;
        C8067 c8067BuildDialog = activityC10957.buildDialog();
        c8067BuildDialog.m21274(R.string.MT_Protector);
        c8067BuildDialog.m21253(R.string.MT_Protector);
        c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۡۛ۬
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ActivityC10957.m27700(this.f29913);
            }
        });
        c8067BuildDialog.m21275(R.string.MT_Protector, new DialogInterfaceOnClickListenerC10106(0, activityC10957));
        c8067BuildDialog.m21256(new DialogInterface.OnCancelListener() { // from class: l.۟ۛ۬
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                ActivityC10957.m27677(this.f24208);
            }
        });
        c8067BuildDialog.m21269();
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static void m27700(ActivityC10957 activityC10957) {
        activityC10957.f37356 = false;
        activityC10957.f37373 = false;
        InterfaceC10161 interfaceC10161 = activityC10957.f37367;
        if (interfaceC10161 == null || activityC10957.f37305) {
            return;
        }
        if (activityC10957.f37317) {
            ((AbstractC22465) interfaceC10161).mo25855();
        }
        interfaceC10161.mo25836();
        ((AbstractC22465) interfaceC10161).mo25820(true);
    }

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public static void m27630(ActivityC10957 activityC10957) {
        if (activityC10957.f37274 || activityC10957.isFinishing() || activityC10957.isDestroyed()) {
            return;
        }
        activityC10957.f37274 = true;
        C8067 c8067BuildDialog = activityC10957.buildDialog();
        c8067BuildDialog.m21274(R.string.MT_Protector);
        c8067BuildDialog.m21253(R.string.MT_Protector);
        c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterfaceOnClickListenerC21394(activityC10957, 0));
        c8067BuildDialog.m21265(false);
        c8067BuildDialog.m21269();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static void m27553(ActivityC10957 activityC10957) {
        C11122.m28041(activityC10957.f37295);
        activityC10957.f37295 = null;
        activityC10957.finish();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m27635(ActivityC10957 activityC10957) {
        C11122.m28041(activityC10957.f37295);
        activityC10957.f37295 = null;
        activityC10957.finish();
    }

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public static void m27648(ActivityC10957 activityC10957) {
        C11122.m28041(activityC10957.f37295);
        activityC10957.f37295 = null;
        activityC10957.finish();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m27677(ActivityC10957 activityC10957) {
        C11122.m28041(activityC10957.f37295);
        activityC10957.f37295 = null;
        activityC10957.finish();
    }

    @Override // l.AbstractActivityC12483, l.ActivityC10074, l.ActivityC19126, android.app.Activity
    public final void onStart() {
        C18615 c18615;
        super.onStart();
        C5965 c5965M31021 = m31021();
        c5965M31021.m16257(2);
        c5965M31021.m16253(7);
        boolean z = this.f37279;
        if (z) {
            if (!z || (c18615 = this.f37275) == null) {
                return;
            }
            RunnableC19008 runnableC19008 = this.f37329;
            c18615.removeCallbacks(runnableC19008);
            this.f37275.post(runnableC19008);
            return;
        }
        Object obj = this.f37367;
        if (obj != null) {
            if (this.f37311 && this.f37317) {
                ((AbstractC22465) obj).mo25855();
                if (this.f37331) {
                    ((AbstractC22465) this.f37367).mo25820(true);
                    return;
                }
                return;
            }
            if (this.f37331) {
                ((AbstractC22465) obj).mo25820(true);
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            final View decorView = getWindow().getDecorView();
            decorView.post(new Runnable() { // from class: l.ᩳܿ۬
                @Override // java.lang.Runnable
                public final void run() {
                    int i = ActivityC10957.f37270;
                    if (decorView.hasWindowFocus()) {
                        C5965 c5965M31021 = this.f58144.m31021();
                        c5965M31021.m16257(2);
                        c5965M31021.m16253(7);
                    }
                }
            });
        }
    }

    @Override // l.AbstractActivityC12483, l.ActivityC4866, l.ActivityC10074, l.ActivityC1086, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f37374 = false;
        m27535();
    }

    @Override // l.AbstractActivityC12483, l.ActivityC10074, l.ActivityC19126, android.app.Activity
    public final void onStop() {
        InterfaceC17693 interfaceC17693;
        super.onStop();
        C18615 c18615 = this.f37275;
        if (c18615 != null) {
            c18615.removeCallbacks(this.f37329);
        }
        m27622();
        if (this.f37286 != null) {
            this.f37279 = true;
            m27662(true);
        }
        GestureDetectorOnGestureListenerC22951 gestureDetectorOnGestureListenerC22951 = this.f37348;
        if (gestureDetectorOnGestureListenerC22951 != null) {
            gestureDetectorOnGestureListenerC22951.m50796();
        }
        InterfaceC17693 interfaceC17694 = this.f37367;
        if (interfaceC17694 != null) {
            int iMo25808 = interfaceC17694.mo25808();
            boolean z = (!this.f37367.mo25806() || iMo25808 == 1 || iMo25808 == 4) ? false : true;
            this.f37331 = z;
            if (z) {
                ((AbstractC22465) this.f37367).mo25820(false);
            }
        } else {
            this.f37331 = false;
        }
        if (!this.f37311 && (interfaceC17693 = this.f37367) != null && this.f37299 != null) {
            String str = this.f37277;
            long currentPosition = interfaceC17693.getCurrentPosition();
            long duration = this.f37367.getDuration();
            if (duration != -9223372036854775807L && !TextUtils.isEmpty(str)) {
                C1783.m5851(str, currentPosition, duration);
            }
        }
        if (isFinishing()) {
            m27684();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27704() {
        this.f37331 = false;
        this.f37279 = false;
        C18615 c18615 = this.f37275;
        if (c18615 != null) {
            c18615.removeCallbacks(this.f37329);
        }
        GestureDetectorOnGestureListenerC22951 gestureDetectorOnGestureListenerC22951 = this.f37348;
        if (gestureDetectorOnGestureListenerC22951 != null) {
            gestureDetectorOnGestureListenerC22951.m50796();
        }
        Object obj = this.f37367;
        if (obj != null) {
            ((AbstractC22465) obj).mo25820(false);
        }
        getWindow().clearFlags(128);
    }

    @Override // l.ActivityC1086, l.ActivityC16858, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        C14153 c14153;
        super.onSaveInstanceState(bundle);
        InterfaceC6908 interfaceC6908 = this.f37299;
        if (interfaceC6908 != null) {
            bundle.putInt("bin.mt.media.state.CURRENT_MEDIA_INDEX", interfaceC6908.mo7403());
        }
        if (this.f37315) {
            C14153 c14154 = this.f37291;
            if (this.f37367 != null) {
                List listM29938 = C12036.m29938(getResources(), this.f37367.mo25847());
                int iM29936 = C12036.m29936(listM29938, this.f37367.mo25826());
                if (iM29936 <= 0 || iM29936 > listM29938.size()) {
                    c14153 = null;
                } else {
                    int i = iM29936 - 1;
                    C3194 c3194 = (C3194) listM29938.get(i);
                    int i2 = 0;
                    for (int i3 = 0; i3 < i; i3++) {
                        C7648 c7648M9609 = ((C3194) listM29938.get(i3)).m9609();
                        C7648 c7648M96010 = c3194.m9609();
                        if (c7648M9609.f25246 == c7648M96010.f25246 && c7648M9609.f25253 == c7648M96010.f25253 && c7648M9609.f25259 == c7648M96010.f25259 && c7648M9609.f25266 == c7648M96010.f25266 && Float.compare(c7648M9609.f25273, c7648M96010.f25273) == 0 && TextUtils.equals(c7648M9609.f25277, c7648M96010.f25277) && TextUtils.equals(c7648M9609.f25265, c7648M96010.f25265)) {
                            i2++;
                        }
                    }
                    C7648 c7648M96011 = c3194.m9609();
                    c14153 = new C14153(c7648M96011.f25246, c7648M96011.f25253, c7648M96011.f25259, c7648M96011.f25266, c7648M96011.f25273, c7648M96011.f25277, c7648M96011.f25265, i2);
                }
                if (c14153 != null) {
                    c14154 = c14153;
                }
            }
            if (c14154 != null) {
                bundle.putBundle("bin.mt.media.state.VIDEO_QUALITY_SELECTION", c14154.m34230());
            }
        }
    }

    @Override // l.AbstractActivityC12483, android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (this.f37339.getVisibility() == 4) {
            this.f37273.setImageResource(R.drawable.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public static void m27679(ActivityC10957 activityC10957) {
        activityC10957.m27629();
        activityC10957.f37299.mo7411();
        activityC10957.m27571(-9223372036854775807L, false);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m27692(ActivityC10957 activityC10957) {
        activityC10957.m27629();
        activityC10957.f37299.mo7411();
        activityC10957.m27571(-9223372036854775807L, false);
        activityC10957.f37275.m43049();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static void m27539(ActivityC10957 activityC10957) {
        activityC10957.m27629();
        activityC10957.f37299.mo7405();
        activityC10957.m27571(-9223372036854775807L, false);
        activityC10957.f37275.m43049();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m27570(int i, Bitmap bitmap) {
        View view;
        if (i != this.f37365 || this.f37372 == null || (view = this.f37289) == null || view.getVisibility() != 0) {
            return;
        }
        if (bitmap == null && this.f37302) {
            m27678();
            m27671();
        } else {
            this.f37372.setImageBitmap(bitmap);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27579(ActivityC10957 activityC10957, int i, C9587 c9587) {
        if (i != activityC10957.f37365) {
            return;
        }
        activityC10957.f37350 = c9587;
        View view = activityC10957.f37289;
        if (view == null || view.getVisibility() != 0) {
            return;
        }
        activityC10957.m27652(activityC10957.f37353, activityC10957.f37302);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3235 m27564(final ActivityC10957 activityC10957, long j, boolean z, final boolean z2) {
        InterfaceC6908 interfaceC6908;
        C6265 c6265M28924;
        C14704 c14704;
        C10148 c10148;
        InterfaceC17693 interfaceC17693 = activityC10957.f37367;
        C3235 c3235M27652 = null;
        if (interfaceC17693 == null || (interfaceC6908 = activityC10957.f37299) == null || activityC10957.f37289 == null || activityC10957.f37372 == null) {
            return null;
        }
        if (activityC10957.f37311) {
            activityC10957.m27678();
            return null;
        }
        InterfaceC2557 interfaceC2557Mo7410 = interfaceC6908.mo7410();
        if (activityC10957.f37315) {
            InterfaceC17693 interfaceC17694 = activityC10957.f37367;
            C8114 c8114 = activityC10957.f37333;
            InterfaceC20723 interfaceC20723 = activityC10957.f37376;
            InterfaceC20723 interfaceC20724 = activityC10957.f37280;
            C1263 c1263 = activityC10957.f37347;
            C10148 c10149 = activityC10957.f37276;
            if (interfaceC17694 == null || c8114 == null || interfaceC20723 == null || interfaceC20724 == null || c1263 == null || c10149 == null || Build.VERSION.SDK_INT < 23 || !c1263.m4582()) {
                activityC10957.m27678();
                return null;
            }
            C21519 c21519M21379 = c8114.m21379();
            if (c21519M21379 == null) {
                activityC10957.m27678();
                return null;
            }
            if (z2) {
                activityC10957.m27540();
                C10148 c101410 = activityC10957.f37276;
                if (c101410 == null) {
                    activityC10957.m27678();
                    return null;
                }
                C16540 c16540 = activityC10957.f37336;
                if (c16540 != null) {
                    c16540.m38939();
                }
                activityC10957.f37372.setImageBitmap(null);
                c10148 = c101410;
            } else {
                c10148 = c10149;
            }
            int i = activityC10957.f37293;
            long j2 = 1 + activityC10957.f37375;
            activityC10957.f37375 = j2;
            activityC10957.f37353 = j;
            activityC10957.f37302 = z;
            C21539 c21539 = new C21539(i, j2, activityC10957.f37365, j, z, c21519M21379, interfaceC20723, interfaceC20724, c1263, c10148, activityC10957.f37312);
            activityC10957.f37287.m36407(c21539);
            long jM48260 = c21539.m48260();
            boolean zM48258 = c21539.m48258();
            View view = activityC10957.f37289;
            if (view != null && activityC10957.f37372 != null && view.getVisibility() == 0) {
                c3235M27652 = activityC10957.m27652(jM48260, zM48258);
            }
            C3235 c3235M27709 = activityC10957.m27709();
            return c3235M27709 != null ? c3235M27709 : c3235M27652;
        }
        if (interfaceC2557Mo7410 != null) {
            C11601 c11601 = activityC10957.f37312;
            if (c11601 == null) {
                c6265M28924 = C6265.f21234;
            } else {
                c6265M28924 = c11601.m28924(interfaceC2557Mo7410);
            }
            long duration = interfaceC17693.getDuration();
            if (duration <= 0 || duration == -9223372036854775807L || c6265M28924.m17340()) {
                activityC10957.m27678();
                return null;
            }
            if (z && !c6265M28924.m17345()) {
                activityC10957.m27678();
                return null;
            }
            activityC10957.f37353 = j;
            activityC10957.f37302 = z;
            if (z2) {
                activityC10957.f37372.setImageBitmap(null);
            }
            C3235 c3235M27653 = activityC10957.m27652(j, z);
            activityC10957.f37289.setVisibility(0);
            if (c6265M28924.m17345()) {
                if (activityC10957.f37338 == null) {
                    activityC10957.f37338 = new C1824(activityC10957.getApplicationContext());
                }
                activityC10957.f37338.m5947(interfaceC2557Mo7410, c6265M28924, duration, activityC10957.f37365, new C4605(activityC10957));
                activityC10957.f37338.m5945(c3235M27653.m9689(), c3235M27653.m9688(), j);
                return c3235M27653;
            }
            activityC10957.f37372.setImageBitmap(null);
            C1824 c1824 = activityC10957.f37338;
            if (c1824 != null) {
                c1824.m5944();
                if (c6265M28924.m17344()) {
                    activityC10957.f37338.m5948();
                }
            }
            return c3235M27653;
        }
        final InterfaceC17693 interfaceC17695 = activityC10957.f37367;
        final C1263 c1264 = activityC10957.f37347;
        final InterfaceC20723 interfaceC20725 = activityC10957.f37301;
        final C10148 c101411 = activityC10957.f37276;
        C13689 c13689Mo25853 = interfaceC17695 == 0 ? null : ((AbstractC22465) interfaceC17695).mo25853();
        Uri uri = (c13689Mo25853 == null || (c14704 = c13689Mo25853.f45157) == null) ? null : c14704.f48029;
        long duration2 = interfaceC17695 == 0 ? -9223372036854775807L : interfaceC17695.getDuration();
        if (interfaceC17695 == 0 || c1264 == null || interfaceC20725 == null || c101411 == null || uri == null || duration2 <= 0 || duration2 == -9223372036854775807L || Build.VERSION.SDK_INT < 23 || !c1264.m4582()) {
            activityC10957.m27678();
            return null;
        }
        activityC10957.f37353 = j;
        activityC10957.f37302 = z;
        C15087 c15087 = activityC10957.f37283;
        if (c15087 != null) {
            return activityC10957.m27565(c15087, duration2, j, z, z2);
        }
        Future future = activityC10957.f37296;
        if (future == null || future.isDone()) {
            final int i2 = activityC10957.f37369 + 1;
            activityC10957.f37369 = i2;
            final int i3 = activityC10957.f37365;
            final Uri uri2 = uri;
            activityC10957.f37296 = C4716.f16636.submit(new Runnable() { // from class: l.ۚۛ۬
                @Override // java.lang.Runnable
                public final void run() {
                    int i4 = ActivityC10957.f37270;
                    final C15087 c15087M36161 = C15087.m36161(c1264, uri2, interfaceC20725, c101411);
                    final ActivityC10957 activityC10958 = this.f17928;
                    final int i5 = i2;
                    final int i6 = i3;
                    final InterfaceC17693 interfaceC17696 = interfaceC17695;
                    final boolean z3 = z2;
                    C16737.m39273(new Runnable() { // from class: l.᩺ۛ۬
                        @Override // java.lang.Runnable
                        public final void run() {
                            ActivityC10957.m27577(activityC10958, i5, i6, c15087M36161, interfaceC17696, z3);
                        }
                    });
                }
            });
        }
        activityC10957.m27678();
        return 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m27577(ActivityC10957 activityC10957, int i, int i2, C15087 c15087, InterfaceC17693 interfaceC17693, boolean z) {
        activityC10957.f37296 = null;
        if (i == activityC10957.f37369 && i2 == activityC10957.f37365 && c15087 != null) {
            activityC10957.f37283 = c15087;
            activityC10957.m27565(c15087, interfaceC17693.getDuration(), activityC10957.f37353, activityC10957.f37302, z);
        } else if (c15087 != null) {
            c15087.close();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C3235 m27565(C15087 c15087, long j, long j2, boolean z, boolean z2) {
        ImageView imageView;
        if (j <= 0 || j == -9223372036854775807L || this.f37289 == null || (imageView = this.f37372) == null) {
            return null;
        }
        if (z2) {
            imageView.setImageBitmap(null);
        }
        C3235 c3235M27652 = m27652(j2, z);
        this.f37289.setVisibility(0);
        if (this.f37338 == null) {
            this.f37338 = new C1824(getApplicationContext());
        }
        this.f37338.m5947((InterfaceC2557) null, c15087.m36162(), j, this.f37365, new C13779(this));
        this.f37338.m5945(c3235M27652.m9689(), c3235M27652.m9688(), j2);
        return c3235M27652;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C3235 m27709() {
        C21539 c21539M36402;
        if (this.f37297 == null && !this.f37287.m36408() && (c21539M36402 = this.f37287.m36402()) != null) {
            C15170 c15170 = this.f37284;
            C15170 c15170M36390 = c15170 == null ? null : c15170.m36390(c21539M36402.m48255(), c21539M36402.m48260() * 1000);
            if (c15170M36390 != null) {
                return m27566(c21539M36402, c15170M36390);
            }
            final C18011 c18011 = new C18011(c21539M36402);
            this.f37297 = c18011;
            C4716.f16636.execute(new Runnable() { // from class: l.᩹ۛ۬
                @Override // java.lang.Runnable
                public final void run() {
                    final C15170 c15170M36386;
                    final C18011 c18012 = c18011;
                    int i = ActivityC10957.f37270;
                    try {
                        if (C18011.m41955(c18012, Thread.currentThread())) {
                            C21539 c21539M41956 = C18011.m41956(c18012);
                            c15170M36386 = C15170.m36386(c21539M41956.m48255(), c21539M41956.m48260() * 1000, c21539M41956.m48254(), c21539M41956.m48262(), c21539M41956.m48257(), c21539M41956.m48256(), c21539M41956.m48263());
                        } else {
                            c15170M36386 = null;
                        }
                        C18011.m41957(c18012);
                        final ActivityC10957 activityC10957 = this.f71572;
                        C16737.m39273(new Runnable() { // from class: l.ܶۛ۬
                            @Override // java.lang.Runnable
                            public final void run() {
                                ActivityC10957.m27593(activityC10957, c18012, c15170M36386);
                            }
                        });
                    } catch (Throwable th) {
                        C18011.m41957(c18012);
                        throw th;
                    }
                }
            });
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27593(ActivityC10957 activityC10957, C18011 c18011, C15170 c15170) {
        if (activityC10957.f37297 != c18011) {
            return;
        }
        activityC10957.f37297 = null;
        C21539 c21539M41956 = C18011.m41956(c18011);
        boolean z = c21539M41956.m48253() == activityC10957.f37293 && c21539M41956.m48259() == activityC10957.f37365;
        boolean zM36409 = activityC10957.f37287.m36409(c21539M41956);
        if (c15170 != null && z) {
            activityC10957.f37284 = c15170;
            if (activityC10957.m27566(c21539M41956, c15170) != null) {
                return;
            }
        }
        if (c15170 == null && z && !zM36409) {
            activityC10957.m27570(c21539M41956.m48259(), (Bitmap) null);
        }
        activityC10957.m27709();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C3235 m27566(C21539 c21539, C15170 c15170) {
        int iM48253 = c21539.m48253();
        int i = this.f37293;
        int iM48259 = c21539.m48259();
        int i2 = this.f37365;
        long jM48261 = c21539.m48261();
        long j = this.f37375;
        long jM36406 = this.f37287.m36406();
        if (iM48253 != i || iM48259 != i2 || jM48261 > j || jM48261 <= jM36406 || this.f37287.m36408() || this.f37289 == null || this.f37372 == null) {
            return null;
        }
        this.f37284 = c15170;
        C3235 c3235M27652 = m27652(this.f37353, this.f37302);
        this.f37289.setVisibility(0);
        if (this.f37336 == null) {
            this.f37336 = new C16540();
        }
        this.f37287.m36403(c21539);
        this.f37336.m38942(c15170, c21539.m48259(), new C11662(this, c21539));
        this.f37336.m38940(c3235M27652.m9689(), c3235M27652.m9688());
        return c3235M27652;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27707(C21539 c21539, int i, Bitmap bitmap) {
        if (this.f37287.m36405(c21539)) {
            boolean z = c21539.m48253() == this.f37293 && i == this.f37365;
            boolean z2 = c21539.m48261() == this.f37375;
            if (z && (bitmap != null || z2)) {
                m27570(i, bitmap);
            }
            m27709();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27594(ActivityC10957 activityC10957, C21539 c21539, int i, C9587 c9587) {
        int iM48253 = c21539.m48253();
        int i2 = activityC10957.f37293;
        int i3 = activityC10957.f37365;
        if (iM48253 == i2 && i == i3 && i == i3) {
            activityC10957.f37350 = c9587;
            View view = activityC10957.f37289;
            if (view == null || view.getVisibility() != 0) {
                return;
            }
            activityC10957.m27652(activityC10957.f37353, activityC10957.f37302);
        }
    }

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    private void m27540() {
        this.f37293++;
        this.f37287.m36404();
        C18011 c18011 = this.f37297;
        if (c18011 != null) {
            C18011.m41954(c18011);
            if (this.f37276 == C18011.m41956(c18011).m48256()) {
                this.f37276 = new C10148();
            }
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m27615(ActivityC10957 activityC10957) {
        activityC10957.f37284 = null;
        C16540 c16540 = activityC10957.f37336;
        activityC10957.f37336 = null;
        if (c16540 != null) {
            c16540.m38941(new RunnableC3575(1));
        }
        activityC10957.m27678();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public void m27678() {
        m27540();
        View view = this.f37289;
        if (view != null) {
            view.setVisibility(8);
        }
        ImageView imageView = this.f37372;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        C1824 c1824 = this.f37338;
        if (c1824 != null) {
            c1824.m5944();
        }
        C16540 c16540 = this.f37336;
        if (c16540 != null) {
            c16540.m38939();
        }
    }

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public static void m27691(ActivityC10957 activityC10957) {
        View view = activityC10957.f37352;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public static void m27617(ActivityC10957 activityC10957) {
        View view = activityC10957.f37352;
        if (view != null) {
            view.setVisibility(8);
            activityC10957.f37352.setTranslationX(0.0f);
            activityC10957.f37352.setTranslationY(0.0f);
        }
    }

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    private void m27622() {
        this.f37365++;
        this.f37308 = C13314.f44192;
        this.f37350 = null;
        View view = this.f37289;
        if (view != null) {
            view.setVisibility(8);
        }
        ImageView imageView = this.f37372;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        Future future = this.f37296;
        this.f37296 = null;
        this.f37369++;
        if (future != null) {
            future.cancel(true);
        }
        C15087 c15087 = this.f37283;
        this.f37283 = null;
        C1824 c1824 = this.f37338;
        if (c1824 != null) {
            c1824.m5946(new RunnableC13469(1, c15087));
        } else if (c15087 != null) {
            c15087.close();
        }
        m27540();
        this.f37284 = null;
        C16540 c16540 = this.f37336;
        if (c16540 != null) {
            c16540.m38941(new RunnableC3575(1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:90:0x01cf  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C3235 m27652(long j, boolean z) {
        C7648 c7648M5614;
        char c;
        int iM13302;
        int iMax;
        View view;
        InterfaceC17693 interfaceC17693 = this.f37367;
        if (interfaceC17693 == null) {
            c7648M5614 = null;
        } else {
            AbstractC16706 abstractC16706ListIterator = interfaceC17693.mo25847().m24212().listIterator(0);
            c7648M5614 = null;
            loop0: while (abstractC16706ListIterator.hasNext()) {
                C1693 c1693 = (C1693) abstractC16706ListIterator.next();
                if (c1693.m5618() == 2) {
                    for (int i = 0; i < c1693.f6705; i++) {
                        if (c1693.m5619(i)) {
                            c7648M5614 = c1693.m5614(i);
                            break loop0;
                        }
                        if (c7648M5614 == null && c1693.m5616(i, true)) {
                            c7648M5614 = c1693.m5614(i);
                        }
                    }
                }
            }
        }
        C9587 c9587 = this.f37350;
        C13314 c13314 = this.f37308;
        C9587 c9587M13303 = c7648M5614 == null ? null : C4791.m13303(c7648M5614.f25246, c7648M5614.f25253, c7648M5614.f25248, c7648M5614.f25241);
        if (c9587M13303 != null) {
            c9587 = c9587M13303;
        } else if (c9587 == null) {
            C9587 c9587M13304 = c13314 != null ? C4791.m13303(c13314.f44194, c13314.f44193, 0, c13314.f44195) : null;
            c9587 = c9587M13304 != null ? c9587M13304 : new C9587(16.0f, 9.0f);
        }
        int iM33769 = C13932.m33769(180.0f);
        int iM337610 = C13932.m33769(180.0f);
        if (iM33769 <= 0) {
            iM33769 = 16;
        }
        if (iM337610 <= 0) {
            iM337610 = 9;
        }
        float fM24460 = c9587.m24460();
        int iMax2 = Math.max(1, Math.round(iM33769 / fM24460));
        if (iMax2 > iM337610) {
            iM33769 = Math.max(1, Math.round(iM337610 * fM24460));
        } else {
            iM337610 = iMax2;
        }
        C3235 c3235 = new C3235(Math.max(1, iM33769), Math.max(1, iM337610));
        ViewGroup.LayoutParams layoutParams = this.f37289.getLayoutParams();
        layoutParams.width = c3235.m9689();
        layoutParams.height = c3235.m9688();
        this.f37289.setLayoutParams(layoutParams);
        FrameLayout frameLayout = this.f37344;
        int width = frameLayout == null ? 0 : frameLayout.getWidth();
        if (width <= 0) {
            width = getResources().getDisplayMetrics().widthPixels;
        }
        FrameLayout frameLayout2 = this.f37344;
        int height = frameLayout2 == null ? 0 : frameLayout2.getHeight();
        if (height <= 0) {
            height = getResources().getDisplayMetrics().heightPixels;
        }
        if (z) {
            iM13302 = C4791.m13302(width, c3235.m9689());
            c = 1;
        } else {
            int iM9689 = c3235.m9689();
            InterfaceC17693 interfaceC17694 = this.f37367;
            View view2 = this.f37292;
            if (interfaceC17694 == null || view2 == null || view2.getWidth() <= 0) {
                c = 1;
                iM13302 = C4791.m13302(width, iM9689);
            } else {
                int[] iArr = new int[2];
                int[] iArr2 = new int[2];
                view2.getLocationInWindow(iArr);
                this.f37344.getLocationInWindow(iArr2);
                int i2 = iArr[0] - iArr2[0];
                int width2 = view2.getWidth();
                long duration = interfaceC17694.getDuration();
                if (duration <= 0 || width2 <= 0) {
                    c = 1;
                    iM13302 = C4791.m13302(width, iM9689);
                } else {
                    c = 1;
                    iM13302 = Math.max(0, Math.min((Math.round(width2 * (Math.max(0L, Math.min(j, duration)) / duration)) + i2) - (iM9689 / 2), Math.max(0, width - iM9689)));
                }
            }
        }
        int iM9688 = c3235.m9688();
        int iM337611 = C13932.m33769(12.0f);
        if (z && (view = this.f37352) != null && view.getVisibility() == 0) {
            int iM27695 = iM9688 + iM337611 + m27695(width);
            int iMax3 = Math.max(0, iM337611);
            int i3 = height - iM27695;
            iMax = Math.max(iMax3, Math.min(i3 / 2, Math.max(iMax3, i3 - iMax3)));
        } else {
            View view3 = this.f37339;
            if (view3 == null || view3.getHeight() <= 0) {
                iMax = Math.max(iM337611, (height - iM9688) - C13932.m33769(96.0f));
            } else {
                int[] iArr3 = new int[2];
                int[] iArr4 = new int[2];
                this.f37339.getLocationInWindow(iArr3);
                this.f37344.getLocationInWindow(iArr4);
                int i4 = iArr3[c] - iArr4[c];
                if (i4 > 0) {
                    iMax = Math.max(iM337611, (i4 - iM9688) - iM337611);
                } else {
                    iMax = Math.max(iM337611, (height - iM9688) - C13932.m33769(96.0f));
                }
            }
        }
        this.f37289.setTranslationX(iM13302);
        this.f37289.setTranslationY(iMax);
        if (z) {
            int iM96810 = c3235.m9688();
            View view4 = this.f37352;
            if (view4 != null && view4.getVisibility() == 0) {
                int iM337612 = C13932.m33769(12.0f);
                m27608(width);
                int measuredWidth = this.f37352.getMeasuredWidth();
                if (measuredWidth <= 0 && (measuredWidth = this.f37352.getWidth()) <= 0) {
                    measuredWidth = width;
                }
                int iMin = Math.min(iMax + iM96810 + iM337612, Math.max(iM337612, (height - m27695(width)) - iM337612));
                this.f37352.setTranslationX(C4791.m13302(width, measuredWidth));
                this.f37352.setTranslationY(iMin);
            }
        }
        return c3235;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public void m27671() {
        View view = this.f37352;
        if (view == null || view.getVisibility() != 0) {
            return;
        }
        FrameLayout frameLayout = this.f37344;
        int width = frameLayout == null ? 0 : frameLayout.getWidth();
        if (width <= 0) {
            width = getResources().getDisplayMetrics().widthPixels;
        }
        FrameLayout frameLayout2 = this.f37344;
        int height = frameLayout2 == null ? 0 : frameLayout2.getHeight();
        if (height <= 0) {
            height = getResources().getDisplayMetrics().heightPixels;
        }
        int iM33769 = C13932.m33769(12.0f);
        m27608(width);
        int measuredWidth = this.f37352.getMeasuredWidth();
        if (measuredWidth <= 0 && (measuredWidth = this.f37352.getWidth()) <= 0) {
            measuredWidth = width;
        }
        int iM27695 = m27695(width);
        this.f37352.setTranslationX(C4791.m13302(width, measuredWidth));
        View view2 = this.f37352;
        int iMax = Math.max(0, iM33769);
        int i = height - iM27695;
        view2.setTranslationY(Math.max(iMax, Math.min(i / 2, Math.max(iMax, i - iMax))));
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private int m27695(int i) {
        m27608(i);
        int measuredHeight = this.f37352.getMeasuredHeight();
        return measuredHeight > 0 ? measuredHeight : Math.max(1, this.f37352.getHeight());
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m27608(int i) {
        int iMakeMeasureSpec;
        int i2;
        View view = this.f37352;
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null && (i2 = layoutParams.width) > 0) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE);
        }
        this.f37352.measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private void m27552(int i) {
        ViewGroup viewGroupM43051;
        int childCount;
        C19321 c19321 = this.f37285;
        ViewGroup viewGroup = this.f37298;
        if (c19321 == null || viewGroup == null) {
            return;
        }
        if (i != 4 || (viewGroupM43051 = this.f37275.m43051()) == null) {
            viewGroupM43051 = viewGroup;
        }
        if (c19321.getParent() == viewGroupM43051) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = c19321.getLayoutParams();
        ViewParent parent = c19321.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(c19321);
        }
        if (viewGroupM43051 == viewGroup) {
            childCount = Math.min(this.f37319, viewGroupM43051.getChildCount());
        } else {
            childCount = viewGroupM43051.getChildCount();
        }
        viewGroupM43051.addView(c19321, childCount, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public void m27535() {
        int i;
        C19321 c19321 = this.f37285;
        if (c19321 == null) {
            return;
        }
        if (this.f37374) {
            i = 4;
        } else {
            if (m27681()) {
                String str = (String) C8134.m21436(this.f37330);
                if (!TextUtils.isEmpty(str) && TextUtils.equals(str, m27625())) {
                    i = 4;
                }
            }
            i = 0;
        }
        c19321.setVisibility(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m27563(ActivityC10957 activityC10957, List list) {
        C17306 c17306;
        ArrayList arrayList = activityC10957.f37282;
        if (!((AbstractCollection) list).isEmpty()) {
            ArrayList<C0612> arrayList2 = new ArrayList();
            AbstractC22433 abstractC22433 = (AbstractC22433) list;
            AbstractC16706 abstractC16706ListIterator = abstractC22433.listIterator(0);
            while (abstractC16706ListIterator.hasNext()) {
                C0612 c0612 = (C0612) abstractC16706ListIterator.next();
                if (c0612.f2649 == null && c0612.f2663 != null && c0612.f2654 == -3.4028235E38f) {
                    arrayList2.add(c0612);
                }
            }
            if (!arrayList2.isEmpty()) {
                ArrayList arrayList3 = new ArrayList(arrayList);
                ArrayList arrayList4 = new ArrayList(arrayList2.size());
                for (C0612 c0613 : arrayList2) {
                    int size = arrayList3.size();
                    while (true) {
                        size--;
                        if (size >= 0) {
                            c17306 = (C17306) arrayList3.get(size);
                            if (c17306.f55084 == c0613) {
                                arrayList3.remove(size);
                                break;
                            }
                        } else {
                            int size2 = arrayList3.size();
                            while (true) {
                                size2--;
                                if (size2 < 0) {
                                    c17306 = null;
                                    break;
                                }
                                c17306 = (C17306) arrayList3.get(size2);
                                if (c17306.f55084.equals(c0613)) {
                                    arrayList3.remove(size2);
                                    break;
                                }
                            }
                        }
                    }
                    if (c17306 == null) {
                        int iM27557 = m27557(c0613);
                        int i = 0;
                        while (true) {
                            Iterator it = arrayList4.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                C17306 c17307 = (C17306) it.next();
                                int i2 = c17307.f55086;
                                if (i < c17307.f55085 + i2 && i2 < i + iM27557) {
                                    i++;
                                }
                            }
                        }
                        c17306 = new C17306(c0613, i, iM27557);
                    } else {
                        c17306.f55084 = c0613;
                        c17306.f55085 = m27557(c0613);
                    }
                    arrayList4.add(c17306);
                }
                arrayList.clear();
                arrayList.addAll(arrayList4);
                ArrayList arrayList5 = new ArrayList(list.size());
                AbstractC16706 abstractC16706ListIterator2 = abstractC22433.listIterator(0);
                int i3 = 0;
                while (abstractC16706ListIterator2.hasNext()) {
                    C0612 c0614 = (C0612) abstractC16706ListIterator2.next();
                    if (c0614.f2649 == null && c0614.f2663 != null && c0614.f2654 == -3.4028235E38f) {
                        int i4 = i3 + 1;
                        float fMax = Math.max(0.0f, 0.955f - (((C17306) arrayList4.get(i3)).f55086 * 0.049999997f));
                        C20369 c20369M2814 = c0614.m2814();
                        c20369M2814.m45998(fMax, 0);
                        c20369M2814.m45999(2);
                        arrayList5.add(c20369M2814.m45996());
                        i3 = i4;
                    } else {
                        arrayList5.add(c0614);
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
    public static int m27557(C0612 c0612) {
        CharSequence charSequence = c0612.f2663;
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

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    private void m27629() {
        if (this.f37311 || this.f37367 == null || this.f37299 == null) {
            return;
        }
        String str = this.f37277;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        long duration = this.f37367.getDuration();
        if (duration == -9223372036854775807L) {
            return;
        }
        C1783.m5851(str, this.f37367.getCurrentPosition(), duration);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m27571(long j, boolean z) {
        String strM27558;
        long jMax;
        C11601 c11601;
        if (this.f37367 == null || isFinishing() || isDestroyed()) {
            return;
        }
        this.f37311 = false;
        this.f37317 = false;
        this.f37305 = false;
        this.f37373 = false;
        this.f37341 = false;
        this.f37356 = false;
        m27708(false);
        this.f37279 = false;
        int iIncrementAndGet = this.f37281.incrementAndGet();
        this.f37370 = iIncrementAndGet;
        C13689 c13689Mo7413 = this.f37299.mo7413();
        InterfaceC2557 interfaceC2557Mo7410 = this.f37299.mo7410();
        if (interfaceC2557Mo7410 != null) {
            strM27558 = m27558(interfaceC2557Mo7410);
        } else {
            C14704 c14704 = c13689Mo7413.f45157;
            if (c14704 != null) {
                Object obj = c14704.f48035;
                if (obj instanceof String) {
                    strM27558 = (String) obj;
                }
            }
            throw new IllegalStateException("URL media item has no playback key");
        }
        String str = strM27558;
        if (j == -9223372036854775807L) {
            jMax = C1783.m5849(str);
        } else {
            jMax = Math.max(0L, j);
        }
        final C7428 c7428 = new C7428(iIncrementAndGet, c13689Mo7413, interfaceC2557Mo7410, jMax, str, z, (z || interfaceC2557Mo7410 == null || (c11601 = this.f37312) == null) ? null : c11601.m28920());
        List listM27633 = m27633(c7428.m19911());
        boolean zM27547 = m27547(c7428.m19911());
        this.f37337 = z;
        this.f37282.clear();
        m27554();
        m27662(false);
        m27549();
        if (z || c7428.m19915() == null) {
            m27574(c7428, C20834.m46859(c7428.m19913(), listM27633, zM27547));
        } else {
            this.f37286 = C4716.f16636.submit(new Runnable() { // from class: l.ᩴܿ۬
                @Override // java.lang.Runnable
                public final void run() {
                    ActivityC10957.m27587(this.f61189, c7428);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    private void m27549() {
        C11601 c11601 = this.f37312;
        if (c11601 != null) {
            c11601.m28933();
        }
        m27616();
        m27701();
        m27668();
        C8134.m21432(this.f37278);
        m27647();
        m27693();
        m27678();
        this.f37294 = true;
        InterfaceC17693 interfaceC17693 = this.f37367;
        m27645(interfaceC17693 != null ? interfaceC17693.mo25808() : 1);
        m27572((CharSequence) getString(R.string.MT_Protector));
        m27654((CharSequence) getString(R.string.MT_Protector));
        this.f37367.stop();
    }

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public static void m27626(ActivityC10957 activityC10957) {
        activityC10957.f37294 = false;
        InterfaceC17693 interfaceC17693 = activityC10957.f37367;
        activityC10957.m27645(interfaceC17693 == null ? 1 : interfaceC17693.mo25808());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public void m27645(int i) {
        int i2 = 0;
        if (this.f37294 && i != 1) {
            this.f37294 = false;
        }
        View view = this.f37359;
        if (view == null) {
            return;
        }
        if (!this.f37294 && i != 2) {
            i2 = 8;
        }
        view.setVisibility(i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27587(final ActivityC10957 activityC10957, final C7428 c7428) {
        final C20834 c20834M46859;
        AbstractC9677 abstractC9677M19915 = c7428.m19915();
        InterfaceC2557 interfaceC2557M19912 = c7428.m19912();
        if (abstractC9677M19915 == null || interfaceC2557M19912 == null) {
            c20834M46859 = C20834.m46859(c7428.m19913(), Collections.EMPTY_LIST, false);
        } else {
            List listM7903 = Collections.EMPTY_LIST;
            try {
                listM7903 = C2529.m7903(interfaceC2557M19912, abstractC9677M19915);
                C4646 c4646M7904 = C2529.m7904(listM7903, interfaceC2557M19912, abstractC9677M19915.mo24615());
                c20834M46859 = m27569(c7428.m19913(), listM7903, c4646M7904, c4646M7904 == null ? EnumC3899.NONE : EnumC3899.AUTO, true);
            } catch (Exception unused) {
                c20834M46859 = C20834.m46859(c7428.m19913(), listM7903, false);
            }
        }
        C16737.m39273(new Runnable() { // from class: l.ۖۛ۬
            @Override // java.lang.Runnable
            public final void run() {
                this.f8279.m27574(c7428, c20834M46859);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m27574(C7428 c7428, C20834 c20834) {
        String strM19911;
        C22619 c22619M12076;
        int iM19916 = c7428.m19916();
        if (this.f37367 == null || isFinishing() || isDestroyed() || iM19916 != this.f37370) {
            return;
        }
        this.f37286 = null;
        if (!getLifecycle().mo9170().m24173(EnumC9414.STARTED)) {
            this.f37279 = true;
            return;
        }
        if (!c7428.m19910() && c7428.m19915() != null && (c22619M12076 = C4273.m12076((strM19911 = c7428.m19911()))) != null && c22619M12076.m50141() == EnumC13447.FILE) {
            String strM50143 = c22619M12076.m50143();
            if (TextUtils.isEmpty(strM50143)) {
                C4273.m12081(strM19911);
            } else {
                C4646 c4646M27567 = m27567(strM50143, c20834.m46864());
                if (c4646M27567 != null) {
                    c20834 = m27569(c20834.m46861(), c20834.m46864(), c4646M27567, EnumC3899.MANUAL, c20834.m46860());
                } else if (c20834.m46860()) {
                    C4273.m12081(strM19911);
                }
            }
        }
        String strM19912 = c7428.m19911();
        this.f37354 = c20834.m46864();
        this.f37357 = c20834.m46860();
        this.f37309 = strM19912;
        this.f37366 = c20834.m46862();
        this.f37351 = c20834.m46863();
        try {
            String strM19913 = c7428.m19911();
            C8134 c8134 = this.f37330;
            if (this.f37314 && !TextUtils.isEmpty(strM19913)) {
                this.f37326 = strM19913;
                this.f37314 = false;
            }
            if (!TextUtils.equals(strM19913, this.f37326)) {
                this.f37326 = null;
            }
            if (m27681()) {
                if (TextUtils.equals(strM19913, this.f37326)) {
                    strM19913 = null;
                }
                C8134.m21433(c8134, (Object) strM19913);
            } else {
                if (this.f37335 == EnumC18717.AUTO) {
                    this.f37335 = EnumC18717.NONE;
                    if (getRequestedOrientation() != -1) {
                        setRequestedOrientation(-1);
                    }
                }
                C8134.m21432(c8134);
            }
            String strM19914 = c7428.m19911();
            C8134.m21433(this.f37334, TextUtils.isEmpty(strM19914) ? null : new C8840(strM19914, c7428.m19910()));
            C8134.m21433(this.f37290, (Object) c7428.m19911());
            String strM19915 = c7428.m19911();
            if (c20834.m46862() == EnumC3899.MANUAL && !TextUtils.isEmpty(c20834.m46863())) {
                C8134.m21433(this.f37278, new C10251(strM19915, c20834.m46863()));
            } else {
                C8134.m21432(this.f37278);
            }
            m27622();
            if (c7428.m19914() > 0) {
                Object obj = this.f37367;
                C13689 c13689M46861 = c20834.m46861();
                long jM19914 = c7428.m19914();
                AbstractC22465 abstractC22465 = (AbstractC22465) obj;
                abstractC22465.getClass();
                abstractC22465.mo25813(jM19914, AbstractC22433.of((Object) c13689M46861));
            } else {
                ((AbstractC22465) this.f37367).m49966(c20834.m46861());
            }
            this.f37277 = c7428.m19911();
            this.f37367.mo25836();
            ((AbstractC22465) this.f37367).mo25820(true);
        } catch (Exception e) {
            this.f37294 = false;
            InterfaceC17693 interfaceC17693 = this.f37367;
            m27645(interfaceC17693 != null ? interfaceC17693.mo25808() : 1);
            this.f37366 = EnumC3899.NONE;
            this.f37351 = null;
            C8134.m21432(this.f37278);
            m27616();
            m27701();
            m27668();
            C15829.m37613((CharSequence) e.toString());
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m27662(boolean z) {
        Future future = this.f37286;
        this.f37286 = null;
        if (future != null) {
            future.cancel(true);
        }
        if (z) {
            this.f37370 = this.f37281.incrementAndGet();
        }
    }

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    private void m27554() {
        this.f37366 = EnumC3899.NONE;
        this.f37351 = null;
        C8134.m21432(this.f37278);
        List list = Collections.EMPTY_LIST;
        this.f37354 = list;
        this.f37357 = false;
        this.f37309 = null;
        this.f37374 = false;
        C19321 c19321 = this.f37285;
        if (c19321 == null) {
            return;
        }
        c19321.m44303(list);
        c19321.setVisibility(0);
    }

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public static boolean m27682(ActivityC10957 activityC10957) {
        InterfaceC17693 interfaceC17693 = activityC10957.f37367;
        if (interfaceC17693 == null || activityC10957.f37366 == EnumC3899.NONE || activityC10957.f37337 || TextUtils.isEmpty(activityC10957.f37351)) {
            return false;
        }
        activityC10957.m27571(interfaceC17693.getCurrentPosition(), true);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27584(ActivityC10957 activityC10957, CharSequence charSequence, C13689 c13689) {
        if (!TextUtils.isEmpty(charSequence)) {
            activityC10957.f37332.setText(charSequence);
        } else {
            activityC10957.f37332.setText(c13689 == null ? null : c13689.f45154);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private String m27558(InterfaceC2557 interfaceC2557) {
        String path = interfaceC2557.getPath();
        C11601 c11601 = this.f37312;
        if (c11601 == null) {
            return path;
        }
        AbstractC9677 abstractC9677M28920 = c11601.m28920();
        if (!(abstractC9677M28920 instanceof AbstractC12233)) {
            return path;
        }
        return ((AbstractC12233) abstractC9677M28920).mo10276() + path;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private String m27561(C13689 c13689) {
        if (c13689 == null) {
            return null;
        }
        C14704 c14704 = c13689.f45157;
        if (c14704 != null) {
            Object obj = c14704.f48035;
            if (obj instanceof InterfaceC2557) {
                return m27558((InterfaceC2557) obj);
            }
            return obj instanceof String ? (String) obj : c14704.f48029.toString();
        }
        return c13689.f45154;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private String m27651(C13689 c13689) {
        if (c13689 == null) {
            return null;
        }
        C14704 c14704 = c13689.f45157;
        if (c14704 != null) {
            Object obj = c14704.f48035;
            if (obj instanceof InterfaceC2557) {
                return m27558((InterfaceC2557) obj);
            }
        }
        if (c14704 != null) {
            Object obj2 = c14704.f48035;
            if (obj2 instanceof String) {
                return (String) obj2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    private String m27625() {
        if (!TextUtils.isEmpty(this.f37277)) {
            return this.f37277;
        }
        InterfaceC17693 interfaceC17693 = this.f37367;
        if (interfaceC17693 == null) {
            return null;
        }
        return m27651(interfaceC17693.mo25853());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27592(ActivityC10957 activityC10957, C13689 c13689) {
        C8134.m21435(activityC10957.f37330, activityC10957.m27651(c13689), new C17866());
        activityC10957.m27535();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m27598(C13314 c13314) {
        InterfaceC17693 interfaceC17693 = this.f37367;
        C8134 c8134 = this.f37330;
        String str = (String) C8134.m21436(c8134);
        if (interfaceC17693 == null || TextUtils.isEmpty(str) || !m27681() || !TextUtils.equals(str, m27625())) {
            return;
        }
        int i = c13314.f44194;
        int i2 = c13314.f44193;
        boolean z = false;
        int iM51133 = C23137.m51133(i, i2, 0, c13314.f44195);
        if (iM51133 == -1) {
            if (c13314.f44194 <= 0 || i2 <= 0) {
                return;
            }
            C8134.m21437(c8134);
            this.f37374 = false;
            m27535();
            return;
        }
        C8134.m21437(c8134);
        int i3 = getResources().getConfiguration().orientation;
        if (iM51133 != 0 ? !(iM51133 != 1 || i3 == 1) : i3 != 2) {
            z = true;
        }
        this.f37374 = z;
        this.f37335 = EnumC18717.AUTO;
        if (getRequestedOrientation() != iM51133) {
            setRequestedOrientation(iM51133);
        }
        if (this.f37374) {
            return;
        }
        m27535();
    }

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    private void m27616() {
        C8134.m21432(this.f37330);
        this.f37374 = false;
        m27535();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static void m27609(ActivityC10957 activityC10957) {
        if (Build.VERSION.SDK_INT < 28) {
            return;
        }
        C7000.m18805(activityC10957.f37323);
        C7000.m18805(activityC10957.f37339);
        C7000.m18805(activityC10957.f37310);
        C4177.m11818(activityC10957.f37360);
        C4177.m11818(activityC10957.f37273);
        C4177.m11818(activityC10957.f37349);
        C9203 c9203 = activityC10957.f37306;
        if (c9203 == null) {
            return;
        }
        int iM23666 = c9203.m23666();
        int iM23669 = activityC10957.f37306.m23669();
        int iM23668 = activityC10957.f37306.m23668();
        int iM23667 = activityC10957.f37306.m23667();
        if (iM23666 > 0) {
            C4177.m11817(-1, Math.max(C13932.m33769(20.0f), C13932.m33769(10.0f) + iM23666), -1, activityC10957.f37360);
            C7000.m18806(activityC10957.f37323, -1, iM23666, -1, -1);
        }
        if (iM23669 > 0) {
            C4177.m11817(iM23669, -1, -1, activityC10957.f37273);
            C7000.m18806(activityC10957.f37323, iM23669, -1, -1, -1);
            C7000.m18806(activityC10957.f37339, iM23669, -1, -1, -1);
            C7000.m18806(activityC10957.f37310, iM23669, -1, -1, -1);
        }
        if (iM23668 > 0) {
            C4177.m11817(-1, -1, iM23668, activityC10957.f37349);
            C7000.m18806(activityC10957.f37323, -1, -1, iM23668, -1);
            C7000.m18806(activityC10957.f37339, -1, -1, iM23668, -1);
            C7000.m18806(activityC10957.f37310, -1, -1, iM23668, -1);
        }
        if (iM23667 > 0) {
            C7000.m18806(activityC10957.f37339, -1, -1, -1, iM23667);
            C7000.m18806(activityC10957.f37310, -1, -1, -1, iM23667);
        }
    }

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    private void m27642() {
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        if (!ApplicationC0716.f2992.getBoolean("ins", false) || ApplicationC0716.f2992.getBoolean("vpun", true)) {
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
    public static void m27590(ActivityC10957 activityC10957, C12562 c12562, boolean z) {
        c12562.setEnabled(z);
        C1679.m5597(ApplicationC0716.f2992, "vpffs", z);
        activityC10957.m27665();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27589(ActivityC10957 activityC10957, C12562 c12562, C15844 c15844) {
        activityC10957.f37306 = c15844.m37671();
        boolean z = ApplicationC0716.f2992.getBoolean("ins", false);
        if (activityC10957.f37306 == null || z) {
            if (z) {
                C16737.m39273(new RunnableC8383(1, activityC10957));
            }
        } else {
            ApplicationC0716.f2992.edit().putBoolean("ins", true).apply();
            c12562.setVisibility(0);
            if (c12562.isChecked()) {
                c12562.setChecked(false);
            } else {
                activityC10957.m27642();
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m27636(ActivityC10957 activityC10957, View view) {
        activityC10957.f37367.mo25819(new C21449(((Float) view.getTag()).floatValue()));
        TextView[] textViewArr = activityC10957.f37346;
        int length = textViewArr.length;
        for (int i = 0; i < length; i++) {
            TextView textView = textViewArr[i];
            boolean z = textView == view;
            textView.setTextColor(z ? C20368.f65970 : -1);
            textView.setTypeface(z ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m27655(ActivityC10957 activityC10957) {
        activityC10957.f37275.m43050();
        activityC10957.f37310.scrollTo(0, 0);
        View view = activityC10957.f37310;
        view.setTranslationY(view.getHeight());
        activityC10957.f37304.setVisibility(0);
        View view2 = activityC10957.f37310;
        ObjectAnimator.ofFloat(view2, "translationY", view2.getTranslationY(), 0.0f).start();
        activityC10957.m27572((CharSequence) null);
        activityC10957.m27654((CharSequence) null);
        activityC10957.f37358.m26835(activityC10957.f37272);
        ((RunnableC17161) activityC10957.f37343).run();
        float f = activityC10957.f37367.mo25832().f69728;
        for (TextView textView : activityC10957.f37346) {
            boolean z = Math.abs(((Float) textView.getTag()).floatValue() - f) < 0.001f;
            textView.setTextColor(z ? C20368.f65970 : -1);
            textView.setTypeface(z ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m27657(ActivityC10957 activityC10957, View view) {
        C16195 c16195 = new C16195(view.getContext(), view, 0);
        c16195.m38294(8388661);
        C12418 c12418M38298 = c16195.m38298();
        c12418M38298.add(0, 1, 0, R.string.MT_Protector);
        int i = 0;
        while (i < 5) {
            int i2 = f37271[i];
            int i3 = i + 100;
            i++;
            c12418M38298.add(0, i3, i, activityC10957.getString(R.string.MT_Protector, Integer.valueOf(i2)));
        }
        c12418M38298.add(0, 200, 6, R.string.MT_Protector);
        c16195.m38296(new C10177(activityC10957));
        c16195.m38297();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m27602(ActivityC10957 activityC10957, MenuItem menuItem) {
        C10647 c10647 = activityC10957.f37358;
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            c10647.m26833();
            return true;
        }
        if (itemId != 200) {
            int i = itemId - 100;
            if (i < 0 || i >= 5) {
                return false;
            }
            c10647.m26834(f37271[i]);
            return true;
        }
        C2488 c2488 = new C2488(activityC10957, activityC10957);
        c2488.m13797(R.string.MT_Protector);
        c2488.m13802();
        c2488.m13799();
        c2488.m13798(activityC10957.getString(R.string.MT_Protector));
        int iM26836 = c10647.m26836();
        if (iM26836 > 0) {
            c2488.m13801(String.valueOf(iM26836));
            c2488.m13795();
        }
        c2488.m13794();
        return true;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m27639(boolean z) {
        this.f37358.m26838(this.f37272);
        C16737.m39278().removeCallbacks(this.f37343);
        View view = this.f37310;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationY", view.getTranslationY(), this.f37310.getHeight());
        objectAnimatorOfFloat.addListener(new C5311(this));
        if (z) {
            objectAnimatorOfFloat.setDuration(150L);
        }
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public void m27687() {
        TextView textView = this.f37325;
        if (textView == null) {
            return;
        }
        int iM26836 = this.f37358.m26836();
        if (iM26836 > 0) {
            textView.setText(getString(R.string.MT_Protector, Integer.valueOf(iM26836)));
        } else {
            textView.setText(R.string.MT_Protector);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public void m27619() {
        Handler handlerM39278 = C16737.m39278();
        Runnable runnable = this.f37343;
        handlerM39278.removeCallbacks(runnable);
        long jM26837 = this.f37358.m26837();
        if (jM26837 <= 0) {
            return;
        }
        long j = jM26837 % 60000;
        C16737.m39278().postDelayed(runnable, j != 0 ? j : 60000L);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27586(ActivityC10957 activityC10957, C6017 c6017, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        InterfaceC10161 interfaceC10161 = activityC10957.f37367;
        if (interfaceC10161 == null || itemId < 0 || itemId > c6017.m16322().size()) {
            return;
        }
        C9456 c9456Mo25847 = interfaceC10161.mo25847();
        if (!TextUtils.equals(c6017.m16324(), activityC10957.m27561(((AbstractC22465) interfaceC10161).mo25853()))) {
            activityC10957.m27710(c9456Mo25847);
            return;
        }
        if (itemId == 0) {
            activityC10957.f37291 = null;
            interfaceC10161.mo25817(interfaceC10161.mo25826().mo5308().mo34363(2, false).mo34362(2).mo34361());
            activityC10957.m27710(c9456Mo25847);
            return;
        }
        C3194 c3194 = (C3194) c6017.m16322().get(itemId - 1);
        for (C3194 c3195 : C12036.m29938(activityC10957.getResources(), c9456Mo25847)) {
            if (c3195.m9608() == c3194.m9608() && c3195.m9612().m5615().equals(c3194.m9612().m5615())) {
                activityC10957.f37291 = null;
                interfaceC10161.mo25817(C12036.m29939(interfaceC10161.mo25826(), c3194));
                activityC10957.m27710(c9456Mo25847);
                return;
            }
        }
        activityC10957.m27710(c9456Mo25847);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27706(C9456 c9456) {
        C3194 c3194;
        InterfaceC17693 interfaceC17693 = this.f37367;
        C14153 c14153 = this.f37291;
        if (!this.f37315 || interfaceC17693 == null || c14153 == null) {
            return;
        }
        Iterator it = C12036.m29938(getResources(), c9456).iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                c3194 = null;
                break;
            }
            c3194 = (C3194) it.next();
            if (C14153.m34228(c14153, c3194.m9609())) {
                if (i == c14153.m34229()) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (c3194 == null) {
            return;
        }
        this.f37291 = null;
        interfaceC17693.mo25817(C12036.m29939(interfaceC17693.mo25826(), c3194));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m27710(C9456 c9456) {
        CharSequence text;
        if (this.f37315 && this.f37371 != null) {
            List listM29938 = C12036.m29938(getResources(), c9456);
            if (listM29938.size() >= 2) {
                InterfaceC17693 interfaceC17693 = this.f37367;
                int iM29936 = interfaceC17693 == null ? 0 : C12036.m29936(listM29938, interfaceC17693.mo25826());
                if (iM29936 > 0 && iM29936 <= listM29938.size()) {
                    text = ((C3194) listM29938.get(iM29936 - 1)).m9610();
                } else {
                    text = getText(R.string.MT_Protector);
                }
                this.f37371.setText(text);
                this.f37371.setContentDescription(getString(R.string.MT_Protector, text));
                this.f37371.setVisibility(0);
                return;
            }
            TextView textView = this.f37371;
            if (textView != null) {
                textView.setVisibility(8);
                return;
            }
            return;
        }
        TextView textView2 = this.f37371;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public static void m27669(ActivityC10957 activityC10957) {
        TextView textView = activityC10957.f37371;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27583(final ActivityC10957 activityC10957, View view) {
        final C6017 c6017M16321;
        InterfaceC10161 interfaceC10161 = activityC10957.f37367;
        int i = 0;
        C16195 c16195 = null;
        if (interfaceC10161 == null || !activityC10957.f37315) {
            c6017M16321 = C6017.m16321(null);
        } else {
            String strM27561 = activityC10957.m27561(((AbstractC22465) interfaceC10161).mo25853());
            List listM29938 = C12036.m29938(activityC10957.getResources(), interfaceC10161.mo25847());
            if (listM29938.size() < 2) {
                c6017M16321 = C6017.m16321(strM27561);
            } else {
                c6017M16321 = new C6017(strM27561, listM29938, C12036.m29936(listM29938, interfaceC10161.mo25826()), i);
            }
        }
        if (c6017M16321.m16322().size() >= 2) {
            c16195 = new C16195(view.getContext(), view, 0);
            c16195.m38294(8388661);
            C12418 c12418M38298 = c16195.m38298();
            c12418M38298.add(0, 0, 0, R.string.MT_Protector).setCheckable(true);
            int i2 = 0;
            while (i2 < c6017M16321.m16322().size()) {
                int i3 = i2 + 1;
                c12418M38298.add(0, i3, i3, ((C3194) c6017M16321.m16322().get(i2)).m9611()).setCheckable(true);
                i2 = i3;
            }
            c12418M38298.setGroupCheckable(0, true, true);
            int iM16323 = c6017M16321.m16323();
            if (iM16323 >= 0 && iM16323 < c12418M38298.size()) {
                c12418M38298.getItem(iM16323).setChecked(true);
            }
            c16195.m38296(new InterfaceC21133() { // from class: l.۬ۛ۬
                @Override // l.InterfaceC21133
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    ActivityC10957.m27586(this.f42960, c6017M16321, menuItem);
                    return true;
                }
            });
        } else {
            InterfaceC17693 interfaceC17693 = activityC10957.f37367;
            activityC10957.m27710(interfaceC17693 == null ? C9456.f32004 : interfaceC17693.mo25847());
        }
        if (c16195 != null) {
            c16195.m38297();
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static void m27610(final ActivityC10957 activityC10957, View view) {
        InterfaceC10161 interfaceC10161 = activityC10957.f37367;
        if (interfaceC10161 == null) {
            return;
        }
        if (interfaceC10161.mo25847().m24215() && ((AbstractC22465) interfaceC10161).mo25853() != null) {
            C15829.m37611(R.string.MT_Protector);
            return;
        }
        final C22245 c22245M27612 = activityC10957.m27612();
        if (!c22245M27612.m49379().isEmpty()) {
            C16195 c16195 = new C16195(view.getContext(), view, 0);
            c16195.m38294(8388661);
            C12418 c12418M38298 = c16195.m38298();
            c12418M38298.add(0, 0, 0, R.string.MT_Protector).setCheckable(true);
            int i = 0;
            while (i < c22245M27612.m49379().size()) {
                int i2 = i + 1;
                c12418M38298.add(0, i2, i2, ((C1077) c22245M27612.m49379().get(i)).m4053()).setCheckable(true);
                i = i2;
            }
            c12418M38298.setGroupCheckable(0, true, true);
            int iM49380 = c22245M27612.m49380();
            if (iM49380 >= 0 && iM49380 < c12418M38298.size()) {
                c12418M38298.getItem(iM49380).setChecked(true);
            }
            c16195.m38296(new InterfaceC21133() { // from class: l.֨ۛ۬
                @Override // l.InterfaceC21133
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    ActivityC10957.m27595(this.f3732, c22245M27612, menuItem);
                    return true;
                }
            });
            c16195.m38297();
            return;
        }
        C15829.m37611(R.string.MT_Protector);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27595(ActivityC10957 activityC10957, C22245 c22245, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        InterfaceC17693 interfaceC17693 = activityC10957.f37367;
        if (interfaceC17693 == 0 || itemId < 0 || itemId > c22245.m49379().size()) {
            return;
        }
        if (!TextUtils.equals(c22245.m49381(), activityC10957.m27561(((AbstractC22465) interfaceC17693).mo25853()))) {
            activityC10957.m27572((CharSequence) null);
            return;
        }
        if (itemId > 0) {
            C1077 c1077 = (C1077) c22245.m49379().get(itemId - 1);
            m27599(interfaceC17693, c1077);
            String strM49382 = c22245.m49382();
            if (!TextUtils.isEmpty(strM49382)) {
                C9711.m24668(c1077.m4052(), strM49382);
            }
            activityC10957.m27572(c1077.m4053());
            return;
        }
        activityC10957.m27647();
        String strM49383 = c22245.m49382();
        if (!TextUtils.isEmpty(strM49383)) {
            C9711.m24670(strM49383);
        }
        activityC10957.m27572((CharSequence) null);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m27663(ActivityC10957 activityC10957, C9456 c9456) {
        InterfaceC17693 interfaceC17693 = activityC10957.f37367;
        String str = (String) C8134.m21436(activityC10957.f37290);
        if (interfaceC17693 != null && !TextUtils.isEmpty(str) && !c9456.m24215() && TextUtils.equals(str, activityC10957.f37277)) {
            C22245 c22245M27612 = activityC10957.m27612();
            if (TextUtils.equals(str, c22245M27612.m49382())) {
                if (c22245M27612.m49379().isEmpty()) {
                    activityC10957.m27701();
                    return false;
                }
                if (m27556(c22245M27612.m49379(), interfaceC17693.mo25826()) > 0) {
                    activityC10957.m27701();
                    return false;
                }
                int iM24666 = C9711.m24666(str);
                activityC10957.m27701();
                if (iM24666 >= 0) {
                    if (iM24666 >= c22245M27612.m49379().size()) {
                        C9711.m24670(str);
                        return false;
                    }
                    C1077 c1077 = (C1077) c22245M27612.m49379().get(iM24666);
                    m27599(interfaceC17693, c1077);
                    activityC10957.m27572(c1077.m4053());
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public static void m27672(ActivityC10957 activityC10957) {
        activityC10957.m27572((CharSequence) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m27572(CharSequence charSequence) {
        CharSequence charSequenceM4053;
        TextView textView = this.f37303;
        InterfaceC17693 interfaceC17693 = this.f37367;
        if (textView == null || interfaceC17693 == null) {
            return;
        }
        if (!TextUtils.isEmpty(charSequence)) {
            textView.setText(charSequence);
            return;
        }
        Iterator it = m27634(interfaceC17693.mo25847()).iterator();
        while (true) {
            if (!it.hasNext()) {
                charSequenceM4053 = null;
                break;
            }
            C1077 c1077 = (C1077) it.next();
            if (c1077.m4054().m5617()) {
                charSequenceM4053 = c1077.m4053();
                break;
            }
        }
        if (!TextUtils.isEmpty(charSequenceM4053)) {
            textView.setText(charSequenceM4053);
            return;
        }
        C9456 c9456Mo25847 = interfaceC17693.mo25847();
        if (c9456Mo25847.m24215()) {
            textView.setText(R.string.MT_Protector);
        } else if (!c9456Mo25847.m24213(1)) {
            textView.setText(R.string.MT_Protector);
        } else {
            textView.setText(R.string.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    private C22245 m27612() {
        String strM27651;
        InterfaceC10161 interfaceC10161 = this.f37367;
        if (interfaceC10161 == null) {
            return C22245.m49378(null, null);
        }
        C13689 c13689Mo25853 = ((AbstractC22465) interfaceC10161).mo25853();
        String strM27561 = m27561(c13689Mo25853);
        if (!TextUtils.isEmpty(this.f37277)) {
            strM27651 = this.f37277;
        } else {
            strM27651 = m27651(c13689Mo25853);
        }
        String str = strM27651;
        C9456 c9456Mo25847 = interfaceC10161.mo25847();
        if (c9456Mo25847.m24215()) {
            return C22245.m49378(strM27561, str);
        }
        List listM27634 = m27634(c9456Mo25847);
        if (listM27634.isEmpty()) {
            return C22245.m49378(strM27561, str);
        }
        return new C22245(strM27561, str, listM27634, m27556(listM27634, interfaceC10161.mo25826()), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private List m27634(C9456 c9456) {
        ArrayList<C13073> arrayList = new ArrayList();
        AbstractC16706 abstractC16706ListIterator = c9456.m24212().listIterator(0);
        while (abstractC16706ListIterator.hasNext()) {
            C1693 c1693 = (C1693) abstractC16706ListIterator.next();
            int iM5618 = c1693.m5618();
            int i = c1693.f6705;
            if (iM5618 == 1) {
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    if (c1693.m5616(i2, true)) {
                        arrayList2.add(Integer.valueOf(i2));
                    }
                }
                if (!arrayList2.isEmpty()) {
                    arrayList.add(new C13073(c1693, arrayList2, c1693.m5614(((Integer) arrayList2.get(0)).intValue()), arrayList.size()));
                }
            }
        }
        if (arrayList.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        ArrayList arrayList4 = new ArrayList(arrayList.size());
        for (C13073 c13073 : arrayList) {
            arrayList3.add(m27559(c13073.m32285(), false));
            arrayList4.add(m27559(c13073.m32285(), true));
        }
        HashMap mapM27562 = m27562(arrayList3);
        HashMap mapM27563 = m27562(arrayList4);
        ArrayList arrayList5 = new ArrayList(arrayList.size());
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            C13073 c13074 = (C13073) arrayList.get(i3);
            String str = (String) arrayList3.get(i3);
            String strM27607 = m27607(str);
            if (TextUtils.isEmpty(str) || ((Integer) C9735.getOrDefault(mapM27562, strM27607, 0)).intValue() > 1) {
                str = (String) arrayList4.get(i3);
                String strM27608 = m27607(str);
                if (TextUtils.isEmpty(str) || ((Integer) C9735.getOrDefault(mapM27563, strM27608, 0)).intValue() != 1) {
                    str = getString(R.string.MT_Protector) + " " + (c13074.m32287() + 1);
                }
            }
            arrayList5.add(new C1077(c13074.m32286(), c13074.m32288(), str, c13074.m32287()));
        }
        return arrayList5;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m27559(C7648 c7648, boolean z) {
        ArrayList arrayList = new ArrayList(4);
        m27573(c7648.f25274, arrayList);
        m27573(m27696(c7648.f25269), arrayList);
        m27573(m27537(c7648.f25244), arrayList);
        int i = c7648.f25249;
        if (i > 0) {
            m27573(i + "ch", arrayList);
        }
        if (z) {
            String strSubstring = c7648.f25265;
            String upperCase = c7648.f25277;
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
            m27573(upperCase, arrayList);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return TextUtils.join(" · ", arrayList);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static String m27696(String str) {
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

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static String m27537(int i) {
        if (i == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C17983.m41847(i));
        arrayList.remove("main");
        if (arrayList.isEmpty()) {
            return null;
        }
        return TextUtils.join("/", arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27599(InterfaceC17693 interfaceC17693, C1077 c1077) {
        interfaceC17693.mo25817(interfaceC17693.mo25826().mo5308().mo34363(1, false).mo34362(1).mo34365(new C5927(c1077.m4054().m5615(), c1077.m4055())).mo34361());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m27660(ActivityC10957 activityC10957, C13689 c13689) {
        C8134.m21435(activityC10957.f37290, activityC10957.m27651(c13689), new C17866());
    }

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    private void m27701() {
        C8134.m21432(this.f37290);
    }

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    private void m27647() {
        InterfaceC17693 interfaceC17693 = this.f37367;
        if (interfaceC17693 == null) {
            return;
        }
        C14395 c14395Mo25826 = interfaceC17693.mo25826();
        AbstractC0477 it = c14395Mo25826.f47176.values().iterator();
        while (it.hasNext()) {
            if (((C5927) it.next()).f20187.f54866 == 1) {
                interfaceC17693.mo25817(c14395Mo25826.mo5308().mo34363(1, false).mo34362(1).mo34361());
            }
        }
        if (!c14395Mo25826.f47182.contains(1)) {
            return;
        }
        interfaceC17693.mo25817(c14395Mo25826.mo5308().mo34363(1, false).mo34362(1).mo34361());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static HashMap m27562(ArrayList arrayList) {
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String strM27607 = m27607((String) it.next());
            if (!TextUtils.isEmpty(strM27607)) {
                map.put(strM27607, Integer.valueOf(((Integer) C9735.getOrDefault(map, strM27607, 0)).intValue() + 1));
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static String m27607(String str) {
        return str == null ? "" : str.trim().toLowerCase(Locale.ROOT);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27573(String str, ArrayList arrayList) {
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
    public static int m27556(List list, C14395 c14395) {
        AbstractC0477 it = c14395.f47176.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                return 0;
            }
            C5927 c5927 = (C5927) it.next();
            if (c5927.f20187.f54866 == 1) {
                for (int i = 0; i < list.size(); i++) {
                    if (((C1077) list.get(i)).m4054().m5615().equals(c5927.f20187)) {
                        return i + 1;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007b  */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m27545(final ActivityC10957 activityC10957, View view) {
        final MenuItem item;
        int i;
        InterfaceC10161 interfaceC10161 = activityC10957.f37367;
        if (interfaceC10161 == null) {
            return;
        }
        final C0372 c0372M27698 = activityC10957.m27698();
        List listM2102 = c0372M27698.m2102();
        if (!listM2102.isEmpty()) {
            final C16195 c16195 = new C16195(view.getContext(), view, 0);
            c16195.m38294(8388661);
            C12418 c12418M38298 = c16195.m38298();
            C20491.m46296(c12418M38298);
            boolean[] zArr = new boolean[3];
            for (int i2 = 0; i2 < listM2102.size(); i2++) {
                C15896 c15896 = (C15896) listM2102.get(i2);
                int i3 = C12223.f40853[c15896.f51488.ordinal()];
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
                c12418M38298.add(i, i2, i2, c15896.m37807()).setCheckable(true);
            }
            for (int i4 = 0; i4 < 3; i4++) {
                if (zArr[i4]) {
                    c12418M38298.setGroupCheckable(i4, true, true);
                }
            }
            int iM2103 = c0372M27698.m2103();
            if (iM2103 < 0 || iM2103 >= c12418M38298.size()) {
                item = null;
            } else {
                item = c12418M38298.getItem(iM2103);
                item.setChecked(true);
            }
            c16195.m38296(new InterfaceC21133() { // from class: l.ۘۛ۬
                @Override // l.InterfaceC21133
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    ActivityC10957.m27582(this.f13599, item, c16195, c0372M27698, menuItem);
                    return true;
                }
            });
            c16195.m38297();
            return;
        }
        if (((AbstractC22465) interfaceC10161).mo25853() != null && interfaceC10161.mo25847().m24215()) {
            C15829.m37611(R.string.MT_Protector);
        } else {
            C15829.m37611(R.string.MT_Protector);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27582(ActivityC10957 activityC10957, MenuItem menuItem, C16195 c16195, C0372 c0372, MenuItem menuItem2) {
        C22619 c22619;
        boolean z = false;
        if (menuItem != null) {
            c16195.m38298().findItem(menuItem.getItemId()).setChecked(false);
        }
        menuItem2.setChecked(true);
        int itemId = menuItem2.getItemId();
        InterfaceC17693 interfaceC17693 = activityC10957.f37367;
        if (interfaceC17693 == 0 || itemId < 0 || itemId >= c0372.m2102().size()) {
            return;
        }
        if (TextUtils.equals(c0372.m2101(), activityC10957.m27561(((AbstractC22465) interfaceC17693).mo25853()))) {
            activityC10957.m27668();
            C15896 c15896 = (C15896) c0372.m2102().get(itemId);
            if (c15896.m37808() != EnumC20129.FILE) {
                C8134.m21432(activityC10957.f37278);
            }
            String strM2104 = c0372.m2104();
            int i = C12223.f40853[c15896.m37808().ordinal()];
            if (i == 1) {
                if (!TextUtils.isEmpty(strM2104)) {
                    C4273.m12081(strM2104);
                }
                if (activityC10957.f37366 == EnumC3899.MANUAL && activityC10957.f37299 != null) {
                    List listM27633 = activityC10957.m27633(c0372.m2104());
                    InterfaceC2557 interfaceC2557Mo7410 = activityC10957.f37299.mo7410();
                    if (interfaceC2557Mo7410 == null) {
                        activityC10957.m27693();
                        activityC10957.m27654((CharSequence) null);
                        return;
                    }
                    C11601 c11601 = activityC10957.f37312;
                    if (c11601 != null && c11601.m28920().mo24615()) {
                        z = true;
                    }
                    C4646 c4646M7904 = C2529.m7904(listM27633, interfaceC2557Mo7410, z);
                    activityC10957.m27601(m27569(activityC10957.f37299.mo7413(), listM27633, c4646M7904, c4646M7904 == null ? EnumC3899.NONE : EnumC3899.AUTO, activityC10957.m27547(c0372.m2104())));
                    return;
                }
                activityC10957.m27693();
                activityC10957.m27654((CharSequence) null);
                return;
            }
            if (i == 2) {
                if (!TextUtils.isEmpty(strM2104)) {
                    C4273.m12078(strM2104, new C22619(EnumC13447.OFF, -1, null));
                }
                interfaceC17693.mo25817(interfaceC17693.mo25826().mo5308().mo34363(3, true).mo34362(3).mo34361());
                activityC10957.m27654((CharSequence) activityC10957.getString(R.string.MT_Protector));
                return;
            }
            if (i == 3) {
                C16601 c16601M37805 = c15896.m37805();
                if (c16601M37805 == null) {
                    return;
                }
                if (!TextUtils.isEmpty(strM2104)) {
                    String strSubstring = activityC10957.f37351;
                    if (TextUtils.isEmpty(strSubstring)) {
                        strSubstring = null;
                    } else {
                        int iLastIndexOf = strSubstring.lastIndexOf(47);
                        if (iLastIndexOf >= 0) {
                            strSubstring = strSubstring.substring(iLastIndexOf + 1);
                        }
                    }
                    if (TextUtils.isEmpty(strSubstring) || (!TextUtils.equals(activityC10957.f37351, c16601M37805.m39043()) && !TextUtils.equals(activityC10957.m27538(activityC10957.f37351), c16601M37805.m39042()))) {
                        c22619 = new C22619(EnumC13447.TRACK, c16601M37805.m39039(), null);
                    } else {
                        c22619 = new C22619(EnumC13447.FILE, -1, strSubstring);
                    }
                    C4273.m12078(strM2104, c22619);
                }
                m27600(interfaceC17693, c16601M37805);
                activityC10957.m27654(c16601M37805.m39040());
                return;
            }
            if (i != 4 || activityC10957.f37299 == null || c15896.m37806() == null) {
                return;
            }
            if (!TextUtils.isEmpty(strM2104)) {
                C4273.m12078(strM2104, new C22619(EnumC13447.FILE, -1, c15896.m37806().m12815().getName()));
            }
            activityC10957.m27601(m27569(activityC10957.f37299.mo7413(), activityC10957.m27633(c0372.m2104()), c15896.m37806(), EnumC3899.MANUAL, activityC10957.m27547(c0372.m2104())));
            return;
        }
        activityC10957.m27654((CharSequence) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m27601(C20834 c20834) {
        InterfaceC17693 interfaceC17693 = this.f37367;
        if (interfaceC17693 == null || this.f37299 == null || isFinishing() || isDestroyed()) {
            return;
        }
        int iIncrementAndGet = this.f37281.incrementAndGet();
        this.f37370 = iIncrementAndGet;
        InterfaceC2557 interfaceC2557Mo7410 = this.f37299.mo7410();
        if (interfaceC2557Mo7410 == null) {
            return;
        }
        String strM27558 = m27558(interfaceC2557Mo7410);
        long jMax = Math.max(0L, interfaceC17693.getCurrentPosition());
        this.f37337 = false;
        this.f37282.clear();
        m27554();
        m27662(false);
        m27549();
        m27574(new C7428(iIncrementAndGet, this.f37299.mo7413(), interfaceC2557Mo7410, jMax, strM27558, false, null), c20834);
    }

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public static void m27676(ActivityC10957 activityC10957) {
        activityC10957.m27654((CharSequence) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void m27654(CharSequence charSequence) {
        CharSequence charSequenceM39040;
        String strM27651;
        TextView textView = this.f37313;
        InterfaceC10161 interfaceC10161 = this.f37367;
        if (textView == null || interfaceC10161 == null) {
            return;
        }
        if (!TextUtils.isEmpty(charSequence)) {
            textView.setText(charSequence);
            return;
        }
        if (interfaceC10161.mo25826().f47182.contains(3)) {
            textView.setText(R.string.MT_Protector);
            return;
        }
        Iterator it = m27543(interfaceC10161.mo25847()).iterator();
        while (true) {
            if (!it.hasNext()) {
                charSequenceM39040 = null;
                break;
            }
            C16601 c16601 = (C16601) it.next();
            if (c16601.m39041().m5619(c16601.m39038())) {
                charSequenceM39040 = c16601.m39040();
                break;
            }
        }
        if (!TextUtils.isEmpty(charSequenceM39040)) {
            textView.setText(charSequenceM39040);
            return;
        }
        if (this.f37366 == EnumC3899.MANUAL && !TextUtils.isEmpty(this.f37351)) {
            textView.setText(m27538(this.f37351));
            return;
        }
        C9456 c9456Mo25847 = interfaceC10161.mo25847();
        if (c9456Mo25847.m24215()) {
            textView.setText(R.string.MT_Protector);
            return;
        }
        if (!c9456Mo25847.m24213(3)) {
            C13689 c13689Mo25853 = ((AbstractC22465) interfaceC10161).mo25853();
            if (!TextUtils.isEmpty(this.f37277)) {
                strM27651 = this.f37277;
            } else {
                strM27651 = m27651(c13689Mo25853);
            }
            if (m27633(strM27651).isEmpty()) {
                textView.setText(R.string.MT_Protector);
                return;
            }
        }
        textView.setText(R.string.MT_Protector);
    }

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    private C0372 m27698() {
        String strM27651;
        List<C16601> listM27543;
        int i;
        InterfaceC10161 interfaceC10161 = this.f37367;
        if (interfaceC10161 == null) {
            return C0372.m2100(null, null);
        }
        C13689 c13689Mo25853 = ((AbstractC22465) interfaceC10161).mo25853();
        String strM27561 = m27561(c13689Mo25853);
        if (!TextUtils.isEmpty(this.f37277)) {
            strM27651 = this.f37277;
        } else {
            strM27651 = m27651(c13689Mo25853);
        }
        if (interfaceC10161.mo25847().m24215()) {
            listM27543 = Collections.EMPTY_LIST;
        } else {
            listM27543 = m27543(interfaceC10161.mo25847());
        }
        List<C4646> listM27633 = m27633(strM27651);
        if (!listM27633.isEmpty() && !TextUtils.isEmpty(this.f37351) && m27653(this.f37351, listM27543) != null) {
            ArrayList arrayList = new ArrayList(listM27633.size());
            for (C4646 c4646 : listM27633) {
                if (!TextUtils.equals(this.f37351, c4646.m12815().getPath())) {
                    arrayList.add(c4646);
                }
            }
            listM27633 = arrayList;
        }
        if (listM27543.isEmpty() && listM27633.isEmpty()) {
            return C0372.m2100(strM27561, strM27651);
        }
        ArrayList arrayList2 = new ArrayList(listM27633.size() + listM27543.size() + 2);
        arrayList2.add(new C15896(EnumC20129.AUTO, getString(R.string.MT_Protector), null, null));
        arrayList2.add(new C15896(EnumC20129.OFF, getString(R.string.MT_Protector), null, null));
        for (C16601 c16601 : listM27543) {
            arrayList2.add(new C15896(EnumC20129.TRACK, c16601.m39040(), c16601, null));
        }
        for (C4646 c4647 : listM27633) {
            arrayList2.add(new C15896(EnumC20129.FILE, c4647.m12815().mo7963(), null, c4647));
        }
        C14395 c14395Mo25826 = interfaceC10161.mo25826();
        if (!c14395Mo25826.f47182.contains(3)) {
            AbstractC0477 it = c14395Mo25826.f47176.values().iterator();
            loop3: while (true) {
                if (it.hasNext()) {
                    C5927 c5927 = (C5927) it.next();
                    if (c5927.f20187.f54866 == 3) {
                        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                            C15896 c15896 = (C15896) arrayList2.get(i2);
                            C16601 c16601M37805 = c15896.m37805();
                            if (c15896.m37808() == EnumC20129.TRACK && c16601M37805 != null && c16601M37805.m39041().m5615().equals(c5927.f20187) && c5927.f20188.contains(Integer.valueOf(c16601M37805.m39038()))) {
                                i = i2;
                                break loop3;
                            }
                        }
                    }
                } else {
                    if (this.f37366 == EnumC3899.MANUAL && !TextUtils.isEmpty(this.f37351)) {
                        i = 0;
                        while (i < arrayList2.size()) {
                            C15896 c15897 = (C15896) arrayList2.get(i);
                            if (c15897.m37808() == EnumC20129.FILE && c15897.m37806() != null && TextUtils.equals(this.f37351, c15897.m37806().m12815().getPath())) {
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
        return new C0372(i, strM27561, strM27651, arrayList2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private List m27543(C9456 c9456) {
        ArrayList<C12368> arrayList = new ArrayList();
        AbstractC16706 abstractC16706ListIterator = c9456.m24212().listIterator(0);
        while (abstractC16706ListIterator.hasNext()) {
            C1693 c1693 = (C1693) abstractC16706ListIterator.next();
            if (c1693.m5618() == 3) {
                for (int i = 0; i < c1693.f6705; i++) {
                    if (c1693.m5616(i, true)) {
                        arrayList.add(new C12368(c1693, i, c1693.m5614(i), arrayList.size()));
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (C12368 c12368 : arrayList) {
            arrayList2.add(m27649(c12368.m30780(), false));
            arrayList3.add(m27649(c12368.m30780(), true));
        }
        HashMap mapM27562 = m27562(arrayList2);
        HashMap mapM27563 = m27562(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList.size());
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            C12368 c12369 = (C12368) arrayList.get(i2);
            String str = (String) arrayList2.get(i2);
            if (TextUtils.isEmpty(str)) {
                str = getString(R.string.MT_Protector) + " " + (c12369.m30779() + 1);
            } else if (((Integer) C9735.getOrDefault(mapM27562, m27607(str), 0)).intValue() > 1) {
                str = (String) arrayList3.get(i2);
                String strM27607 = m27607(str);
                if (TextUtils.isEmpty(str) || ((Integer) C9735.getOrDefault(mapM27563, strM27607, 0)).intValue() != 1) {
                    str = getString(R.string.MT_Protector) + " " + (c12369.m30779() + 1);
                }
            }
            arrayList4.add(new C16601(c12369.m30781(), c12369.m30782(), c12369.m30780().f25275, c12369.m30780().f25274, str, c12369.m30779()));
        }
        return arrayList4;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004c  */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m27649(C7648 c7648, boolean z) {
        ArrayList arrayList = new ArrayList(4);
        m27573(c7648.f25274, arrayList);
        m27573(m27696(c7648.f25269), arrayList);
        m27573(m27537(c7648.f25244), arrayList);
        if (z) {
            String strSubstring = c7648.f25265;
            String upperCase = c7648.f25277;
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
            m27573(upperCase, arrayList);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return TextUtils.join(" · ", arrayList);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private List m27633(String str) {
        if (TextUtils.isEmpty(str) || !TextUtils.equals(str, this.f37309)) {
            return Collections.EMPTY_LIST;
        }
        return this.f37354;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private boolean m27547(String str) {
        return !TextUtils.isEmpty(str) && TextUtils.equals(str, this.f37309) && this.f37357;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20834 m27569(C13689 c13689, List list, C4646 c4646, EnumC3899 enumC3899, boolean z) {
        if (c4646 == null || enumC3899 == EnumC3899.NONE) {
            return C20834.m46859(c13689, list, z);
        }
        C20348 c20348M33394 = c13689.m33394();
        String path = c4646.m12815().getPath();
        C3413 c3413 = new C3413(new Uri.Builder().scheme("mt_media").path(path).build());
        c3413.m10123(c4646.m12816());
        c3413.m10124();
        c3413.m10125(c4646.m12815().mo7963());
        c3413.m10122(path);
        c20348M33394.m45919(Collections.singletonList(c3413.m10121()));
        return new C20834(c20348M33394.m45915(), list, z, enumC3899, c4646.m12815().getPath(), 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C4646 m27567(String str, List list) {
        boolean zEqualsIgnoreCase;
        C11601 c11601 = this.f37312;
        boolean z = c11601 != null && c11601.m28920().mo24615();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4646 c4646 = (C4646) it.next();
            String name = c4646.m12815().getName();
            if (name == null || str == null) {
                zEqualsIgnoreCase = false;
            } else {
                zEqualsIgnoreCase = z ? name.equalsIgnoreCase(str) : name.equals(str);
            }
            if (zEqualsIgnoreCase) {
                return c4646;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m27546(ActivityC10957 activityC10957, C13689 c13689) {
        C8134.m21435(activityC10957.f37278, activityC10957.m27651(c13689), new C7989());
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m27637(ActivityC10957 activityC10957, C13689 c13689) {
        C8134.m21435(activityC10957.f37334, activityC10957.m27651(c13689), new C18572());
    }

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    private void m27668() {
        C8134.m21432(this.f37334);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m27603(ActivityC10957 activityC10957, C9456 c9456) {
        C16601 c16601M27653;
        InterfaceC17693 interfaceC17693 = activityC10957.f37367;
        C8134 c8134 = activityC10957.f37278;
        C10251 c10251 = (C10251) C8134.m21436(c8134);
        if (interfaceC17693 == null || c10251 == null || c9456.m24215() || !TextUtils.equals(c10251.m26044(), activityC10957.f37277)) {
            return false;
        }
        if (!TextUtils.equals(c10251.m26044(), activityC10957.m27698().m2104())) {
            return false;
        }
        List listM27543 = activityC10957.m27543(c9456);
        if (listM27543.isEmpty() || (c16601M27653 = activityC10957.m27653(c10251.m26045(), listM27543)) == null) {
            return false;
        }
        C8134.m21432(c8134);
        m27600(interfaceC17693, c16601M27653);
        activityC10957.m27654(c16601M27653.m39040());
        return true;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m27640(ActivityC10957 activityC10957, C9456 c9456) {
        boolean zEqualsIgnoreCase;
        InterfaceC17693 interfaceC17693 = activityC10957.f37367;
        C8840 c8840 = (C8840) C8134.m21436(activityC10957.f37334);
        if (interfaceC17693 != null && c8840 != null && !c9456.m24215()) {
            String strM22971 = c8840.m22971();
            if (TextUtils.equals(strM22971, activityC10957.f37277) && TextUtils.equals(strM22971, activityC10957.m27698().m2104())) {
                C22619 c22619M12076 = C4273.m12076(strM22971);
                if (c22619M12076 == null) {
                    activityC10957.m27668();
                    return false;
                }
                int i = C12223.f40854[c22619M12076.m50141().ordinal()];
                if (i == 1) {
                    activityC10957.m27668();
                    interfaceC17693.mo25817(interfaceC17693.mo25826().mo5308().mo34363(3, true).mo34362(3).mo34361());
                    activityC10957.m27654((CharSequence) activityC10957.getString(R.string.MT_Protector));
                    return true;
                }
                if (i == 2) {
                    int iM50142 = c22619M12076.m50142();
                    List listM27543 = activityC10957.m27543(c9456);
                    if (!listM27543.isEmpty()) {
                        activityC10957.m27668();
                        if (iM50142 < 0 || iM50142 >= listM27543.size()) {
                            C4273.m12081(strM22971);
                            return false;
                        }
                        C16601 c16601 = (C16601) listM27543.get(iM50142);
                        m27600(interfaceC17693, c16601);
                        activityC10957.m27654(c16601.m39040());
                        return true;
                    }
                } else {
                    if (i != 3) {
                        throw new IncompatibleClassChangeError();
                    }
                    String strM50143 = c22619M12076.m50143();
                    if (TextUtils.isEmpty(strM50143)) {
                        activityC10957.m27668();
                        C4273.m12081(strM22971);
                        return false;
                    }
                    if (c8840.m22972()) {
                        activityC10957.m27668();
                        return false;
                    }
                    String strSubstring = activityC10957.f37351;
                    if (TextUtils.isEmpty(strSubstring)) {
                        strSubstring = null;
                    } else {
                        int iLastIndexOf = strSubstring.lastIndexOf(47);
                        if (iLastIndexOf >= 0) {
                            strSubstring = strSubstring.substring(iLastIndexOf + 1);
                        }
                    }
                    C11601 c11601 = activityC10957.f37312;
                    boolean z = c11601 != null && c11601.m28920().mo24615();
                    if (strSubstring == null || strM50143 == null) {
                        zEqualsIgnoreCase = false;
                    } else {
                        zEqualsIgnoreCase = z ? strSubstring.equalsIgnoreCase(strM50143) : strSubstring.equals(strM50143);
                    }
                    if (zEqualsIgnoreCase) {
                        activityC10957.m27668();
                        return false;
                    }
                    if (activityC10957.m27547(strM22971) && activityC10957.m27567(strM50143, activityC10957.m27633(strM22971)) == null) {
                        activityC10957.m27668();
                        C4273.m12081(strM22971);
                        return false;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private C16601 m27653(String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C16601 c16601 = (C16601) it.next();
            if (TextUtils.equals(str, c16601.m39043())) {
                return c16601;
            }
        }
        String strM27538 = m27538(str);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C16601 c16602 = (C16601) it2.next();
            if (TextUtils.equals(strM27538, c16602.m39042())) {
                return c16602;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27600(InterfaceC17693 interfaceC17693, C16601 c16601) {
        interfaceC17693.mo25817(interfaceC17693.mo25826().mo5308().mo34363(3, false).mo34362(3).mo34365(new C5927(c16601.m39041().m5615(), Collections.singletonList(Integer.valueOf(c16601.m39038())))).mo34361());
    }

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    private void m27693() {
        InterfaceC17693 interfaceC17693 = this.f37367;
        if (interfaceC17693 == null) {
            return;
        }
        C14395 c14395Mo25826 = interfaceC17693.mo25826();
        AbstractC0477 it = c14395Mo25826.f47176.values().iterator();
        while (it.hasNext()) {
            if (((C5927) it.next()).f20187.f54866 == 3) {
                interfaceC17693.mo25817(c14395Mo25826.mo5308().mo34363(3, false).mo34362(3).mo34361());
            }
        }
        if (!c14395Mo25826.f47182.contains(3)) {
            return;
        }
        interfaceC17693.mo25817(c14395Mo25826.mo5308().mo34363(3, false).mo34362(3).mo34361());
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private String m27538(String str) {
        for (C4646 c4646 : this.f37354) {
            if (TextUtils.equals(str, c4646.m12815().getPath())) {
                return c4646.m12815().mo7963();
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
        View view = this.f37304;
        if (view != null && view.getVisibility() == 0) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f37361 = motionEvent.getRawY();
                this.f37316 = false;
                if (this.f37340 == null) {
                    this.f37340 = VelocityTracker.obtain();
                }
                this.f37340.clear();
                this.f37340.addMovement(motionEvent);
            } else if (action == 1) {
                if (this.f37316) {
                    velocityTracker = this.f37340;
                    if (velocityTracker == null) {
                        this.f37316 = false;
                        View view2 = this.f37310;
                        ObjectAnimator.ofFloat(view2, "translationY", view2.getTranslationY(), 0.0f).start();
                        return true;
                    }
                    velocityTracker.addMovement(motionEvent);
                    this.f37340.computeCurrentVelocity(1000);
                    yVelocity = this.f37340.getYVelocity();
                    float translationY = this.f37310.getTranslationY();
                    float height = this.f37310.getHeight();
                    if (yVelocity < 1000.0f || (yVelocity > -1000.0f && translationY > height * 0.4f)) {
                        if (yVelocity >= 1000.0f) {
                            z = true;
                        } else {
                            z = false;
                        }
                        m27639(z);
                    } else {
                        ObjectAnimator.ofFloat(this.f37310, "translationY", translationY, 0.0f).start();
                    }
                    this.f37316 = false;
                    return true;
                }
            } else if (action == 2) {
                if (this.f37340 == null) {
                    this.f37361 = motionEvent.getRawY();
                    this.f37316 = false;
                    VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
                    this.f37340 = velocityTrackerObtain;
                    velocityTrackerObtain.clear();
                }
                this.f37340.addMovement(motionEvent);
                if (!this.f37316 && motionEvent.getRawY() - this.f37361 > ViewConfiguration.get(this).getScaledTouchSlop() && !this.f37310.canScrollVertically(-1)) {
                    this.f37316 = true;
                    this.f37361 = motionEvent.getRawY();
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.setAction(3);
                    super.dispatchTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (this.f37316) {
                    this.f37310.setTranslationY(Math.max((motionEvent.getRawY() - this.f37361) * 1.5f, 0.0f));
                    return true;
                }
            } else if (action == 3) {
                if (this.f37316) {
                    velocityTracker = this.f37340;
                    if (velocityTracker == null) {
                        this.f37316 = false;
                        View view3 = this.f37310;
                        ObjectAnimator.ofFloat(view3, "translationY", view3.getTranslationY(), 0.0f).start();
                        return true;
                    }
                    velocityTracker.addMovement(motionEvent);
                    this.f37340.computeCurrentVelocity(1000);
                    yVelocity = this.f37340.getYVelocity();
                    float translationY2 = this.f37310.getTranslationY();
                    float height2 = this.f37310.getHeight();
                    if (yVelocity < 1000.0f) {
                        if (yVelocity >= 1000.0f) {
                            z = true;
                        } else {
                            z = false;
                        }
                        m27639(z);
                    } else {
                        if (yVelocity >= 1000.0f) {
                            z = true;
                        } else {
                            z = false;
                        }
                        m27639(z);
                    }
                    this.f37316 = false;
                    return true;
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static void m27697(ActivityC10957 activityC10957) {
        activityC10957.m27639(false);
    }

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public static void m27702(ActivityC10957 activityC10957) {
        activityC10957.m27639(false);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static void m27680(ActivityC10957 activityC10957) {
        if (activityC10957.f37339.getVisibility() == 4) {
            activityC10957.f37323.setVisibility(0);
            activityC10957.f37339.setVisibility(0);
            activityC10957.f37349.setVisibility(0);
            activityC10957.f37273.setImageResource(R.drawable.MT_Protector);
        } else {
            activityC10957.f37323.setVisibility(4);
            activityC10957.f37339.setVisibility(4);
            activityC10957.f37349.setVisibility(4);
            activityC10957.f37273.setImageResource(R.drawable.MT_Protector);
        }
        activityC10957.f37275.m43049();
    }

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m27694(ActivityC10957 activityC10957) {
        return activityC10957.f37339.getVisibility() == 4;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static void m27646(ActivityC10957 activityC10957) {
        activityC10957.m27616();
        String strM27625 = activityC10957.m27625();
        if (!TextUtils.isEmpty(strM27625)) {
            activityC10957.f37326 = strM27625;
            activityC10957.f37314 = false;
        } else {
            activityC10957.f37314 = true;
        }
        if (activityC10957.getResources().getConfiguration().orientation == 1) {
            activityC10957.f37335 = EnumC18717.MANUAL;
            if (activityC10957.getRequestedOrientation() != 0) {
                activityC10957.setRequestedOrientation(0);
                return;
            }
            return;
        }
        activityC10957.f37335 = EnumC18717.MANUAL;
        if (activityC10957.getRequestedOrientation() != 1) {
            activityC10957.setRequestedOrientation(1);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final View m27705(int i) {
        View viewFindViewById = findViewById(i);
        viewFindViewById.setBackground(new C19930());
        return viewFindViewById;
    }

    @Override // l.AbstractActivityC12483, l.ActivityC10074, l.ActivityC16858, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode;
        Object obj;
        if (!this.f37311 || ((keyCode = keyEvent.getKeyCode()) != 90 && keyCode != 89 && keyCode != 87 && keyCode != 88 && keyCode != 85 && keyCode != 79 && keyCode != 126 && keyCode != 127)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            int keyCode2 = keyEvent.getKeyCode();
            if (keyCode2 == 79 || keyCode2 == 85) {
                m27711();
            } else if (keyCode2 == 126) {
                InterfaceC17693 interfaceC17693 = this.f37367;
                if (interfaceC17693 != null && C17983.m41845((InterfaceC10161) interfaceC17693, true)) {
                    m27711();
                    return true;
                }
            } else if (keyCode2 == 127 && (obj = this.f37367) != null) {
                ((AbstractC22465) obj).mo25820(false);
                return true;
            }
        }
        return true;
    }

    @Override // l.AbstractActivityC12483, l.ActivityC10074, l.ActivityC19126, android.app.Activity
    public final void onDestroy() {
        if (isFinishing() && !isChangingConfigurations()) {
            C11122.m28041(this.f37295);
            this.f37295 = null;
        }
        super.onDestroy();
        C18615 c18615 = this.f37275;
        if (c18615 != null) {
            c18615.removeCallbacks(this.f37329);
        }
        m27662(true);
        C21725 c21725 = this.f37272;
        C10647 c10647 = this.f37358;
        c10647.m26838(c21725);
        C16737.m39278().removeCallbacks(this.f37343);
        c10647.m26833();
        m27684();
    }

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    private void m27684() {
        this.f37294 = false;
        C11601 c11601 = this.f37312;
        this.f37312 = null;
        final C11848 c11848 = c11601 == null ? null : new C11848(c11601);
        C18615 c18615 = this.f37275;
        if (c18615 != null) {
            c18615.m43053((InterfaceC10161) null);
        }
        InterfaceC17693 interfaceC17693 = this.f37367;
        if (interfaceC17693 != null) {
            interfaceC17693.mo25843();
            this.f37367.mo36793();
            this.f37367 = null;
        }
        if (c11848 != null) {
            c11848.m29541();
        }
        m27616();
        this.f37326 = null;
        this.f37314 = false;
        this.f37335 = EnumC18717.NONE;
        m27701();
        m27668();
        m27554();
        this.f37277 = null;
        if (c11601 != null) {
            c11601.m28927();
            c11848.m29540();
        }
        C1263 c1263 = this.f37347;
        this.f37347 = null;
        final RunnableC3185 runnableC3185 = new RunnableC3185(6, c1263);
        this.f37365++;
        this.f37308 = C13314.f44192;
        this.f37350 = null;
        View view = this.f37289;
        if (view != null) {
            view.setVisibility(8);
        }
        ImageView imageView = this.f37372;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        C1824 c1824 = this.f37338;
        this.f37338 = null;
        Future future = this.f37296;
        this.f37296 = null;
        this.f37369++;
        if (future != null) {
            future.cancel(true);
        }
        final C15087 c15087 = this.f37283;
        this.f37283 = null;
        m27540();
        this.f37284 = null;
        C16540 c16540 = this.f37336;
        this.f37336 = null;
        int i = (c1824 == null ? 0 : 1) + (c16540 != null ? 1 : 0);
        if (i == 0) {
            if (c15087 != null) {
                c15087.close();
            }
            if (c11848 != null) {
                c11848.m29542();
            }
            runnableC3185.run();
        } else {
            final AtomicInteger atomicInteger = new AtomicInteger(i);
            Runnable runnable = new Runnable() { // from class: l.۠ܿ۬
                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = ActivityC10957.f37270;
                    if (atomicInteger.decrementAndGet() != 0) {
                        return;
                    }
                    C15087 c15088 = c15087;
                    if (c15088 != null) {
                        c15088.close();
                    }
                    C11848 c11849 = c11848;
                    if (c11849 != null) {
                        c11849.m29542();
                    }
                    runnableC3185.run();
                }
            };
            if (c1824 != null) {
                c1824.m5946(runnable);
            }
            if (c16540 != null) {
                c16540.m38941(runnable);
            }
        }
        C8114 c8114 = this.f37333;
        this.f37333 = null;
        if (c8114 != null) {
            c8114.m21375();
        }
        C20814 c20814 = this.f37324;
        this.f37324 = null;
        if (c20814 != null) {
            c20814.close();
        }
        this.f37376 = null;
        this.f37280 = null;
        this.f37301 = null;
        C10148 c10148 = this.f37276;
        this.f37276 = null;
        if (c10148 != null) {
            c10148.close();
        }
        VelocityTracker velocityTracker = this.f37340;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f37340 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ InterfaceC15785 m27568(ActivityC10957 activityC10957, InterfaceC20723 interfaceC20723, InterfaceC20723 interfaceC20724, InterfaceC20723 interfaceC20725, int i) {
        if (i == 4) {
            return interfaceC20723.mo4000();
        }
        if (i == 1) {
            return new C12307(interfaceC20724.mo4000(), activityC10957.f37333);
        }
        return interfaceC20725.mo4000();
    }

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    private void m27665() {
        int i = 0;
        if (ApplicationC0716.f2992.getBoolean("vpffs", false)) {
            i = ApplicationC0716.f2992.getBoolean("vpsm", false) ? 3 : 4;
        }
        this.f37275.m43052(i);
        m27552(i);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m27638(ActivityC10957 activityC10957, boolean z) {
        C1679.m5597(ApplicationC0716.f2992, "vpsm", z);
        activityC10957.m27665();
    }

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public static boolean m27681() {
        return ApplicationC0716.f2992.getBoolean("vpao", false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27596(ActivityC10957 activityC10957, boolean z) {
        C1679.m5597(ApplicationC0716.f2992, "vpao", z);
        if (!z) {
            activityC10957.m27616();
            if (activityC10957.f37335 != EnumC18717.AUTO) {
                return;
            }
            activityC10957.f37335 = EnumC18717.NONE;
            if (activityC10957.getRequestedOrientation() != -1) {
                activityC10957.setRequestedOrientation(-1);
                return;
            }
            return;
        }
        String strM27625 = activityC10957.m27625();
        if (!TextUtils.isEmpty(strM27625)) {
            if (!TextUtils.equals(strM27625, activityC10957.f37326)) {
                activityC10957.f37326 = null;
            }
            if (!TextUtils.equals(strM27625, activityC10957.f37326)) {
                C8134.m21434(activityC10957.f37330, strM27625);
                activityC10957.m27535();
            }
        }
        InterfaceC17693 interfaceC17693 = activityC10957.f37367;
        if (interfaceC17693 != null) {
            activityC10957.m27598(interfaceC17693.mo25831());
        }
    }

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static boolean m27606() {
        return ApplicationC0716.f2992.getBoolean("vplp", false);
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static boolean m27551() {
        return ApplicationC0716.f2992.getBoolean("vpapn", false);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m27661(ActivityC10957 activityC10957, boolean z) {
        C1679.m5597(ApplicationC0716.f2992, "vpun", z);
        activityC10957.m27642();
    }
}
