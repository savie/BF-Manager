package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.text.GetChars;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import bin.mt.plugin.api.util.ResultCallback;
import bin.mt.plus.R;
import com.alipay.sdk.m.c0.d;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.o;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Supplier;
import org.bouncycastle.i18n.TextBundle;
import org.simpleframework.xml.stream.DocumentReader;

/* JADX INFO: renamed from: l.۟ܰ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes.dex */
public class C7941 extends AbstractC7283 {

    /* JADX INFO: renamed from: ۙۚۖ, reason: not valid java name and contains not printable characters */
    private static final short[] f26373;

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public C16320 f26374;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C25096 f26375;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public String f26376;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public C3466 f26377;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String f26378;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public FutureC23690 f26381;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public boolean f26383;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public C12679 f26384;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C23582 f26385;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public int f26386;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C24132 f26387;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public boolean f26388;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public long f26389;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public C10177 f26390;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public C23056 f26391;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public C17636 f26392;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public C15926 f26393;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public C5968 f26394;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public RunnableC23604 f26395;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C20956 f26396;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f26397;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public C3347 f26398;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public C23940 f26399;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC8327 f26400;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public ResultCallback f26401;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public C0902 f26402;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public C5639 f26403;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public boolean f26404;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public C23122 f26405;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public boolean f26407;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f26408;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public RunnableC20620 f26411;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public FutureC23690 f26410 = FutureC23690.m52928(null);

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public C6714 f26406 = new C6714();

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC19459 f26382 = new C8381(this);

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public long f26379 = 0;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final Object f26409 = new Object();

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public final C0107 f26380 = new C0107();

    static {
        ApplicationC23172.m52091(80);
        f26373 = new short[]{8973, 1030, 1047, 1041, 1055, 1048, 1041, 1065, 1043, 1042, 1055, 1026, 1055, 1048, 1041, -26567, 26678, -27352, 8601, 32476, 32493, 32496, 32508, 32422, 32496, 32485, 32484, 32422, 32491, 32484, 32489, 32507, 32507};
    }

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    private native void m21582();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private native void m21585(boolean z);

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private native void m21592();

    @Override // l.ComponentCallbacksC11612
    public native void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5704 m21522(final C7941 c7941, final C23056 c23056) {
        c7941.getClass();
        final C25096 c25096 = (C25096) m21599(new Callable() { // from class: l.ۖ᩺᩸
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C7941 c7942 = this.f9768;
                c7942.getClass();
                C25096 c25097 = new C25096(c7942, c23056);
                if (c7942.f26375 != null) {
                    throw new IllegalStateException("A save capture is already waiting");
                }
                c7942.f26375 = c25097;
                C24132 c24132 = c25097.f81163;
                if (c24132 != null) {
                    c24132.m53907(c25097.f81164);
                }
                C11713 c11713 = c25097.f81162;
                if (c11713 != null) {
                    c11713.m29395(c25097.f81166);
                }
                if (c7942.f26384 != null) {
                    FutureC23690 futureC23690M31470 = c7942.f26384.m31470();
                    c25097.f81167 = futureC23690M31470;
                    futureC23690M31470.m52931((InterfaceC2017) new C13579(c25097));
                }
                if (c7942.f26402 != null) {
                    C0902 c0902 = c7942.f26402;
                    c25097.f81161 = c0902;
                    FutureC23690 futureC23690M3666 = c0902.m3666();
                    c25097.f81168 = futureC23690M3666;
                    futureC23690M3666.m52931((InterfaceC2017) new C22288(c25097));
                }
                c25097.m55947();
                return c25097;
            }
        });
        try {
            try {
                return (C5704) c25096.f81159.get();
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause instanceof Exception) {
                    Exception exc = (Exception) cause;
                    C22327.m50389(exc);
                    throw exc;
                }
                if (!(cause instanceof Error)) {
                    throw new RuntimeException(cause);
                }
                Error error = (Error) cause;
                C22327.m50389(error);
                throw error;
            }
        } catch (Throwable th) {
            m21599(new Callable() { // from class: l.۠᩺᩸
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    CancellationException cancellationException = new CancellationException("Saving observation ended");
                    C25096 c25097 = c25096;
                    c25097.m55946(cancellationException);
                    C5704 c5704 = c25097.f81157;
                    if (c5704 == null) {
                        return null;
                    }
                    c5704.close();
                    return null;
                }
            });
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m21532(C6868 c6868, String str, Runnable runnable) {
        RunnableC20620 runnableC20620 = this.f26411;
        if (runnableC20620 != null && runnableC20620.f66142 != c6868) {
            m21516();
        }
        c6868.m19126(str);
        c6868.m19128(new C5399(0, this));
        this.f26411 = new RunnableC20620(runnable, c6868);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ String m21576(C7941 c7941) {
        C12679 c12679 = c7941.f26384;
        if (c12679 != null) {
            return c12679.mo3661();
        }
        C0902 c0902 = c7941.f26402;
        if (c0902 != null) {
            return c0902.mo3661();
        }
        C17636 c17636 = c7941.f26392;
        return "inactiveSave=".concat(C8950.m23920(c17636 == null ? null : c17636.f57981));
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final void m21618() {
        this.f23990.remove("temp");
        C11713 c11713 = this.f23993;
        if (c11713 != null) {
            c11713.m29414(false);
        }
        mo19931("temp");
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m21516() {
        RunnableC20620 runnableC20620 = this.f26411;
        if (runnableC20620 != null) {
            runnableC20620.f66142.m19127(new CancellationException("Pending session load was abandoned"));
            this.f26411 = null;
        }
    }

    public C7941() {
        setHasOptionsMenu(true);
    }

    @Override // l.AbstractC7283
    /* JADX INFO: renamed from: ܺ */
    public final boolean mo19940() {
        return this.f23990.getBoolean("temp", false);
    }

    @Override // l.AbstractC7283, l.ComponentCallbacksC11612
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f26408 = false;
        this.f26399 = ViewOnClickListenerC11499.m28900(this, new C6890(this));
        this.f26396 = ViewOnClickListenerC11499.m28897(this, new InterfaceC0073() { // from class: l.۠ۛ᩸
            @Override // l.InterfaceC0073
            /* JADX INFO: renamed from: ۙ */
            public final /* synthetic */ void mo1127() {
            }

            @Override // l.InterfaceC0073
            /* JADX INFO: renamed from: ۙ */
            public final void mo1128(String str) {
                C9431 c9431 = new C9431(C14584.m35193(str, new String[0]));
                C7941 c7941 = this.f27621;
                new C18077(c7941, (ActivityC18143) c7941.requireActivity(), c9431).m8197();
            }
        });
        this.f26398 = C12296.m30694(this, new InterfaceC16025() { // from class: l.ۜۛ᩸
            @Override // l.InterfaceC16025
            /* JADX INFO: renamed from: ۙ */
            public final void mo8384(Intent intent, int i) {
                C7941.m21603(this.f22979, i);
            }
        });
        if (bundle != null) {
            this.f26379 = bundle.getLong("xmlTransFileTime", 0L);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m21603(C7941 c7941, int i) {
        if (i == 2) {
            c7941.m21571();
        }
    }

    @Override // l.ComponentCallbacksC11612
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f23993.m29399(this, view.findViewById(R.id.MT_Protector), (C24132) view.findViewById(R.id.MT_Protector));
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.MT_Protector);
        C14459 c14459 = new C14459((ActivityC18143) requireActivity());
        c14459.m34928(false);
        c14459.m34926();
        progressBar.setIndeterminateDrawable(c14459);
        this.f23993.m29400(this, progressBar);
        final TextView textView = (TextView) view.findViewById(R.id.MT_Protector);
        TextView textView2 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f23993.m29401(this, textView);
        this.f23993.m29425(this, textView2);
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.֡ۛ᩸
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f1514.m21527(view2);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: l.ۙ᩺᩸
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C7941.m21537(this.f18484, view2);
            }
        });
        textView.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.֫᩺᩸
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                C21576.m49067((CharSequence) textView.getText().toString());
                return true;
            }
        });
        C24132 c24132 = (C24132) view.findViewById(R.id.MT_Protector);
        this.f26387 = c24132;
        c24132.m53927(this.f26382);
        C24132 c24133 = this.f26387;
        C11713 c11713 = this.f23993;
        C17359.requireNonNull(c11713);
        c24133.m53922(new C0156(1, c11713));
        this.f26387.m53918(new C15574(this));
        this.f26378 = bundle == null ? null : bundle.getString("editSessionIdOnStart");
        this.f26389 = bundle == null ? 0L : bundle.getLong("editSessionMarkOnStart");
        InterfaceC11217 viewLifecycleOwner = getViewLifecycleOwner();
        C24132 c24134 = this.f26387;
        C17359.requireNonNull(c24134);
        this.f26380.m1212(viewLifecycleOwner, new C4476(c24134));
        this.f26403 = new C5639(view, this.f26387);
        C23582 c23582 = new C23582((ActivityC18143) requireActivity(), this.f26387, TextBundle.TEXT_ENTRY, new C4958(this, view));
        this.f26385 = c23582;
        c23582.m52810(getViewLifecycleOwner(), this.f26403, ActivityC25140.class);
        this.f26387.m53912(new C22112(this));
        this.f26387.m53913(new InterfaceC11886() { // from class: l.֫ۘ᩸
            @Override // l.InterfaceC11886
            /* JADX INFO: renamed from: ۙ */
            public final void mo1160(int i, int i2) {
                this.f5773.m21617();
            }
        });
        this.f26387.m53916(new C10923(this));
        m21515();
        m21617();
        this.f26388 = true;
        this.f26403.m16625();
        m21621(-1, true, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m21537(C7941 c7941, View view) {
        int i;
        if (c7941.m21583() || c7941.m21569() || c7941.m21565()) {
            i = C2448.f7850;
        } else {
            C23056 c23056 = c7941.f26391;
            i = c23056 == null ? -1 : c23056.f74803;
        }
        if (i != -1 && !c7941.m21577()) {
            c7941.m21601(i);
        } else {
            c7941.m21527(view);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m21543(C7941 c7941, C3354 c3354, RuntimeException runtimeException) {
        C24132 c24132;
        if (c7941.f26388 && (c24132 = c7941.f26387) != null && c24132.m54021() == c3354) {
            C23122 c23122 = c7941.f26405;
            if (c23122 != null) {
                c23122.m52058();
                c7941.f26405 = null;
            }
            c7941.mo19935(true);
            c7941.f26387.m54107(true);
            c7941.f23989.m4466(runtimeException);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m21529(AbstractC2720 abstractC2720) {
        C2361 c2361BuildDialog = ((ActivityC18143) requireActivity()).buildDialog();
        c2361BuildDialog.m8024(m21639());
        int i = 0;
        c2361BuildDialog.m8008(getString(R.string.MT_Protector, ((C9431) abstractC2720).f30601.getName()));
        c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterfaceOnClickListenerC9192(i, this));
        c2361BuildDialog.m8022(R.string.MT_Protector, new DialogInterfaceOnClickListenerC2481(this, abstractC2720, i));
        c2361BuildDialog.m8012(false);
        m21560(c2361BuildDialog.m8016());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m21530(final AbstractC2720 abstractC2720, final long j) {
        C2361 c2361BuildDialog = ((ActivityC18143) requireActivity()).buildDialog();
        c2361BuildDialog.m8024(m21639());
        c2361BuildDialog.m8008(getString(R.string.MT_Protector, ((C9431) abstractC2720).f30601.getName()));
        c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ᩳۛ᩸
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                final C7941 c7941 = this.f61306;
                if (c7941.m19933()) {
                    C2361 c2361BuildDialog2 = ((ActivityC18143) c7941.requireActivity()).buildDialog();
                    c2361BuildDialog2.m8021(R.string.MT_Protector);
                    c2361BuildDialog2.m8000(R.string.MT_Protector);
                    c2361BuildDialog2.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩵᩺᩸
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface2, int i2) {
                            c7941.m21621(-1, false, true);
                        }
                    });
                    final AbstractC2720 abstractC2721 = abstractC2720;
                    final long j2 = j;
                    c2361BuildDialog2.m8022(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۨ᩺᩸
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface2, int i2) {
                            c7941.m21530(abstractC2721, j2);
                        }
                    });
                    c2361BuildDialog2.m8012(false);
                    c2361BuildDialog2.m8016();
                    return;
                }
                c7941.m21621(-1, false, true);
            }
        });
        c2361BuildDialog.m8022(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۢۛ᩸
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C7941 c7941 = this.f31876;
                c7941.f26387.m54016(true);
                c7941.m19932(true);
                c7941.m19930(j);
            }
        });
        c2361BuildDialog.m8012(false);
        m21560(c2361BuildDialog.m8016());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m21601(int i) {
        ActivityC18143 activityC18143 = (ActivityC18143) requireActivity();
        C24132 c24132 = this.f26387;
        C16320 c16320 = this.f26374;
        int[] iArrM53971 = c24132.m53971();
        Charset charsetM8272 = C2448.m8272(i);
        new C23802(c24132, c16320, iArrM53971, activityC18143, charsetM8272, c24132.m54047().getBytes(charsetM8272).length).m8197();
    }

    @Override // l.ComponentCallbacksC11612
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewM42296 = ((ActivityC18143) requireActivity()).m42296(R.layout.MT_Protector);
        if (viewM42296 == null) {
            viewM42296 = super.onCreateView(layoutInflater, viewGroup, bundle);
            C17359.requireNonNull(viewM42296);
        }
        C21576.m49069(new RunnableC11209(0, this), 600L);
        C7023.f23168.m40350(getViewLifecycleOwner(), new C10967(1, this));
        return viewM42296;
    }

    @Override // l.AbstractC7283, l.ComponentCallbacksC11612
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("editSessionIdOnStart", this.f26378);
        bundle.putLong("editSessionMarkOnStart", this.f26389);
        bundle.putLong("transFileTime", this.f26379);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21621(int i, boolean z, boolean z2) {
        if (this.f26397) {
            return;
        }
        if (!z) {
            this.f26377 = null;
        }
        C6868 c6868 = new C6868(z ? "open" : "reload", m19937());
        try {
            m21564(z, i, z2, c6868);
        } catch (Error | RuntimeException e) {
            c6868.m19127(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21558(C7941 c7941, boolean z, int i, boolean z2, C6868 c6868) {
        try {
            c7941.m21564(z, i, z2, c6868);
        } catch (Error | RuntimeException e) {
            c6868.m19127(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m21608(C7941 c7941, boolean z, int i, boolean z2, C6868 c6868) {
        try {
            c7941.m21564(z, i, z2, c6868);
        } catch (Error | RuntimeException e) {
            c6868.m19127(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m21564(final boolean z, final int i, final boolean z2, final C6868 c6868) {
        Point pointM53978;
        C12679 c12679;
        C24132 c24132;
        if (this.f26397) {
            c6868.m19127(new CancellationException("Session was deleted"));
            return;
        }
        if (this.f26392 != null) {
            m21532(c6868, "waiting_inactive_save", new Runnable() { // from class: l.۫᩺᩸
                @Override // java.lang.Runnable
                public final void run() {
                    C7941.m21608(this.f42821, z, i, z2, c6868);
                }
            });
            if (!this.f26388 || (c24132 = this.f26387) == null) {
                return;
            }
            c24132.m53992(true);
            this.f23993.m29404(this, true);
            return;
        }
        if (this.f26402 != null) {
            m21532(c6868, "waiting_previous_load", new Runnable() { // from class: l.ۚ᩺᩸
                @Override // java.lang.Runnable
                public final void run() {
                    C7941.m21558(this.f20507, z, i, z2, c6868);
                }
            });
            this.f26402.m3667();
            return;
        }
        boolean zM19941 = m19941();
        this.f26404 = zM19941;
        if (!zM19941 && !z && !m19934().f30601.mo2934()) {
            FileNotFoundException fileNotFoundException = new FileNotFoundException(m19934().f30601.mo4294());
            c6868.m19127(fileNotFoundException);
            m21531(m19934(), fileNotFoundException);
            this.f26408 = true;
            return;
        }
        Point point = new Point();
        if (z2 && (c12679 = this.f26384) != null) {
            pointM53978 = c12679.m31472();
            point = this.f26384.m31473();
        } else if (z2 && this.f26388) {
            C24132 c24133 = this.f26387;
            pointM53978 = c24133.m53978(c24133.m53968());
            point.x = this.f26387.getScrollX();
            point.y = this.f26387.m54026();
        } else {
            pointM53978 = null;
        }
        final Point point2 = pointM53978;
        final Point point3 = point;
        C12679 c126710 = this.f26384;
        if (c126710 != null || this.f26374 != null) {
            if (c126710 != null) {
                C24132 c24134 = c126710.f40607;
                C24132 c24135 = this.f26387;
                if (c24134 != c24135 && this.f26388) {
                    if (this.f26393 == null) {
                        this.f26393 = c24135.m53949();
                    }
                    this.f23993.m29404(this, true);
                }
            }
            m21532(c6868, "waiting_previous_close", new Runnable() { // from class: l.ۧ᩺᩸
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38496.m21631(z, i, point2, point3, c6868);
                }
            });
            m21595(false);
            return;
        }
        m21631(z, i, point2, point3, c6868);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21631(boolean z, int i, Point point, Point point2, C6868 c6868) {
        try {
            m21610(z, i, point, point2, c6868);
        } catch (Error | RuntimeException e) {
            c6868.m19127(e);
            throw e;
        }
    }

    @Override // l.ComponentCallbacksC11612
    public final void onResume() {
        super.onResume();
        if (this.f26388) {
            ((ActivityC18143) requireActivity()).m40419(this.f26387);
            if (this.f26385.m52804() && this.f26388) {
                this.f26403.m16625();
            }
        }
        m21579();
        m21638();
        m21572();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m21638() {
        C21246 c21246;
        if (!m21567() && m21574()) {
            if (this.f26383) {
                this.f26383 = false;
                if (m21583()) {
                    C23056 c23056 = this.f26391;
                    if (c23056.f74802 != null && (c21246 = c23056.f74807) != null && c21246.m48424() == null) {
                        C2361 c2361BuildDialog = ((ActivityC18143) requireActivity()).buildDialog();
                        c2361BuildDialog.m8024(m21639());
                        c2361BuildDialog.m8008(getString(R.string.MT_Protector, this.f26391.f74802.getName()));
                        c2361BuildDialog.m8026(R.string.MT_Protector, null);
                        c2361BuildDialog.m8016();
                    }
                }
            }
            DialogInterfaceC8327 dialogInterfaceC8327 = this.f26400;
            if (dialogInterfaceC8327 == null || !dialogInterfaceC8327.m22434()) {
                boolean z = ApplicationC17729.f58262.getBoolean("check_file_time", true);
                boolean z2 = ApplicationC17729.f58262.getBoolean("check_file_exists", true);
                if ((z2 || z) && !m19941()) {
                    C9431 c9431M19934 = m19934();
                    AbstractC22044 abstractC22044 = c9431M19934.f30601;
                    if (abstractC22044.getClass() == C22965.class) {
                        return;
                    }
                    if (!(abstractC22044 instanceof C2170)) {
                        boolean zMo2934 = abstractC22044.mo2934();
                        Bundle bundle = this.f23990;
                        if (!zMo2934) {
                            if (z2 && bundle.getBoolean("checkFileExists")) {
                                m21529(c9431M19934);
                                return;
                            }
                            return;
                        }
                        if (z) {
                            long j = bundle.getLong("fileTime", -1L);
                            if (j != -1) {
                                long jMo4286 = abstractC22044.mo4286();
                                if (jMo4286 != j) {
                                    m21530(c9431M19934, jMo4286);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    C2170 c2170 = (C2170) abstractC22044;
                    RunnableC23604 runnableC23604 = this.f26395;
                    if (runnableC23604 == null) {
                        RunnableC23604 runnableC23605 = new RunnableC23604(this, c9431M19934, c2170);
                        this.f26395 = runnableC23605;
                        runnableC23605.m52851();
                    } else if (runnableC23604.f76628 || SystemClock.elapsedRealtime() - runnableC23604.f76624 >= 2000) {
                        this.f26395.f76622 = true;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean m21574() {
        return this.f26388 && this.f26408 && isResumed() && !m19927() && m19946() && !this.f26397 && this.f26402 == null && this.f26384 == null && this.f26411 == null && !this.f23993.m29430() && !((ActivityC18143) requireActivity()).m42310();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private FutureC23690 m21595(boolean z) {
        RunnableC23604 runnableC23604 = this.f26395;
        if (runnableC23604 != null) {
            runnableC23604.f76628 = true;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Session close requires the main thread");
        }
        C12679 c12679 = this.f26384;
        if (c12679 != null) {
            return c12679.m31471();
        }
        C25096 c25096 = this.f26375;
        if (c25096 != null) {
            c25096.m55946(new CancellationException("Saving session is closing"));
        }
        C16320 c16320 = this.f26374;
        if (c16320 == null) {
            return FutureC23690.m52928(null);
        }
        C24132 c24132 = this.f26387;
        if (c24132 == null || this.f26385 == null || c24132.m54021() != c16320.f52980) {
            throw new IllegalStateException("Fragment session owner changed before close");
        }
        C23122 c23122 = this.f26405;
        if (c23122 != null) {
            c23122.m52058();
            this.f26405 = null;
        }
        FutureC23690 futureC23690 = new FutureC23690();
        this.f26381 = futureC23690;
        futureC23690.m52937((Throwable) new CancellationException("Saving session is closing"));
        this.f26384 = new C12679(this, c16320, this.f26386, this.f26391, z);
        if (z) {
            this.f23993.m29423(this);
        } else {
            this.f23993.m29404(this, true);
        }
        return this.f26384.m31471();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m21610(final boolean z, final int i, final Point point, final Point point2, final C6868 c6868) {
        C11713 c11713;
        String name;
        C5902 c5902M56477;
        C12303 c12303;
        byte[] bArr;
        byte[] bArr2;
        RunnableC23604 runnableC23604 = this.f26395;
        if (runnableC23604 != null) {
            runnableC23604.f76628 = true;
        }
        c6868.m19126("initializing_view");
        if (this.f23993 != null && Looper.myLooper() == Looper.getMainLooper()) {
            this.f23993.m29396(this);
        }
        if (Looper.myLooper() == Looper.getMainLooper() && this.f26388 && this.f26387 != null && this.f26385 != null && (c11713 = this.f23993) != null && ((!c11713.m29430() || this.f26393 != null) && !this.f26387.m53884() && this.f26402 == null && this.f26384 == null && this.f26374 == null && this.f26394 == null)) {
            final C19304 c19304 = C8117.f26791;
            final InterfaceC24329 interfaceC24329Of = C6429.of(C21301.m48536().mo4294(), new String[0]);
            final String strM19937 = m19937();
            final C24132 c24132 = this.f26387;
            final C9431 c9431M19934 = m19934();
            final boolean zM19941 = m19941();
            boolean zM21583 = m21583();
            Bundle bundle = this.f23990;
            final boolean z2 = zM21583 || m21569() || m21565() || bundle.getBoolean("forceTryAXml") || bundle.getBoolean("forceTryClass");
            final InterfaceC24329 interfaceC24329M4658 = C1273.m4658(strM19937, interfaceC24329Of);
            boolean z3 = (C10353.m26633(interfaceC24329M4658) || m19938().mo2934()) ? false : true;
            final Bundle bundle2 = new Bundle(bundle);
            int i2 = SharedPreferencesOnSharedPreferenceChangeListenerC3444.f11224;
            bundle2.putInt("textPageSize", C21576.f68932.getInt("text_page_size", 20000000));
            if (z3) {
                try {
                    C23582 c23582 = this.f26385;
                    if (bundle.getBoolean("forceTryAXml")) {
                        name = ".xml";
                    } else {
                        name = bundle.getBoolean("forceTryClass") ? ".class" : c9431M19934.f30601.getName();
                    }
                    c23582.m52807(name);
                    C12303 c12303M54063 = c24132.m54063();
                    C6178 c6178 = new C6178();
                    C6178 c6179 = new C6178();
                    this.f26385.m52823(c6178);
                    this.f26385.m52809(c6179);
                    byte[] bArrM17796 = c6178.m17796();
                    byte[] bArrM17797 = c6179.m17796();
                    c5902M56477 = zM19941 ? C25294.m56477() : null;
                    c12303 = c12303M54063;
                    bArr = bArrM17796;
                    bArr2 = bArrM17797;
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            } else {
                c12303 = null;
                bArr = null;
                bArr2 = null;
                c5902M56477 = null;
            }
            C5261.m15834(this.f23992);
            final FutureC23690 futureC23690M13588 = m19939().m13588();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(!z);
            final boolean z4 = z3;
            final C12303 c12304 = c12303;
            final byte[] bArr3 = bArr;
            final byte[] bArr4 = bArr2;
            final C5902 c5902 = c5902M56477;
            C0902 c0902 = new C0902(this, new InterfaceC9850() { // from class: l.ܳۘ᩸
                /* JADX WARN: Code duplicated, block: B:34:0x00c6  */
                /* JADX WARN: Code duplicated, block: B:86:0x015c A[Catch: all -> 0x013d, TryCatch #10 {all -> 0x013d, blocks: (B:84:0x0158, B:86:0x015c, B:88:0x0160, B:90:0x0164, B:91:0x0166, B:92:0x0167, B:93:0x016e, B:94:0x016f, B:95:0x0171, B:96:0x0172, B:97:0x0174, B:83:0x0155, B:64:0x0136, B:80:0x014c), top: B:102:0x0070, inners: #5 }] */
                /* JADX WARN: Code duplicated, block: B:88:0x0160 A[Catch: all -> 0x013d, TryCatch #10 {all -> 0x013d, blocks: (B:84:0x0158, B:86:0x015c, B:88:0x0160, B:90:0x0164, B:91:0x0166, B:92:0x0167, B:93:0x016e, B:94:0x016f, B:95:0x0171, B:96:0x0172, B:97:0x0174, B:83:0x0155, B:64:0x0136, B:80:0x014c), top: B:102:0x0070, inners: #5 }] */
                /* JADX WARN: Code duplicated, block: B:90:0x0164 A[Catch: all -> 0x013d, TryCatch #10 {all -> 0x013d, blocks: (B:84:0x0158, B:86:0x015c, B:88:0x0160, B:90:0x0164, B:91:0x0166, B:92:0x0167, B:93:0x016e, B:94:0x016f, B:95:0x0171, B:96:0x0172, B:97:0x0174, B:83:0x0155, B:64:0x0136, B:80:0x014c), top: B:102:0x0070, inners: #5 }] */
                /* JADX WARN: Code duplicated, block: B:92:0x0167 A[Catch: all -> 0x013d, TryCatch #10 {all -> 0x013d, blocks: (B:84:0x0158, B:86:0x015c, B:88:0x0160, B:90:0x0164, B:91:0x0166, B:92:0x0167, B:93:0x016e, B:94:0x016f, B:95:0x0171, B:96:0x0172, B:97:0x0174, B:83:0x0155, B:64:0x0136, B:80:0x014c), top: B:102:0x0070, inners: #5 }] */
                /* JADX WARN: Code duplicated, block: B:94:0x016f A[Catch: all -> 0x013d, TryCatch #10 {all -> 0x013d, blocks: (B:84:0x0158, B:86:0x015c, B:88:0x0160, B:90:0x0164, B:91:0x0166, B:92:0x0167, B:93:0x016e, B:94:0x016f, B:95:0x0171, B:96:0x0172, B:97:0x0174, B:83:0x0155, B:64:0x0136, B:80:0x014c), top: B:102:0x0070, inners: #5 }] */
                /* JADX WARN: Code duplicated, block: B:96:0x0172 A[Catch: all -> 0x013d, TryCatch #10 {all -> 0x013d, blocks: (B:84:0x0158, B:86:0x015c, B:88:0x0160, B:90:0x0164, B:91:0x0166, B:92:0x0167, B:93:0x016e, B:94:0x016f, B:95:0x0171, B:96:0x0172, B:97:0x0174, B:83:0x0155, B:64:0x0136, B:80:0x014c), top: B:102:0x0070, inners: #5 }] */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r14v1, types: [l.ܶ᩵᩸] */
                /* JADX WARN: Type inference failed for: r14v10 */
                /* JADX WARN: Type inference failed for: r14v11 */
                /* JADX WARN: Type inference failed for: r14v2 */
                /* JADX WARN: Type inference failed for: r14v3 */
                /* JADX WARN: Type inference failed for: r14v4 */
                /* JADX WARN: Type inference failed for: r14v5, types: [l.ܶ᩵᩸] */
                /* JADX WARN: Type inference failed for: r14v6, types: [l.ܶ᩵᩸] */
                /* JADX WARN: Type inference failed for: r14v7 */
                /* JADX WARN: Type inference failed for: r14v9, types: [l.ܶ᩵᩸] */
                /* JADX WARN: Type inference failed for: r15v0, types: [l.ᩳ᩵᩸] */
                /* JADX WARN: Type inference failed for: r15v1 */
                /* JADX WARN: Type inference failed for: r15v10 */
                /* JADX WARN: Type inference failed for: r15v2 */
                /* JADX WARN: Type inference failed for: r15v4, types: [l.ۜۗ᩸] */
                /* JADX WARN: Type inference failed for: r15v5 */
                /* JADX WARN: Type inference failed for: r15v7 */
                /* JADX WARN: Type inference failed for: r15v8 */
                /* JADX WARN: Type inference failed for: r3v1 */
                /* JADX WARN: Type inference failed for: r3v2 */
                /* JADX WARN: Type inference failed for: r3v3 */
                /* JADX WARN: Type inference failed for: r3v5 */
                /* JADX WARN: Type inference failed for: r3v6 */
                /* JADX WARN: Type inference failed for: r3v7 */
                /* JADX WARN: Type inference failed for: r3v8 */
                @Override // l.InterfaceC9850
                /* JADX INFO: renamed from: ۙ */
                public final C16320 mo25641(InterfaceC7509 interfaceC7509) throws Throwable {
                    String str;
                    InterfaceC24329 interfaceC24329;
                    C16320 c16320M26631;
                    ?? r14;
                    InterfaceC24329 interfaceC243210;
                    Throwable th;
                    boolean z5;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    boolean z6 = zM19941;
                    boolean z7 = z2;
                    C6868 c6869 = c6868;
                    c6869.m19126("waiting_legacy_writes");
                    futureC23690M13588.m52947();
                    c6869.m19126("opening_session_storage");
                    boolean z8 = z4;
                    InterfaceC24329 interfaceC243211 = interfaceC24329M4658;
                    ?? r15 = c19304;
                    InterfaceC24329 interfaceC243212 = interfaceC24329Of;
                    String str2 = strM19937;
                    if (z8 && !C10353.m26633(interfaceC243211) && !this.f49263.m19938().mo2934()) {
                        str = str2;
                        interfaceC24329 = interfaceC243212;
                        c16320M26631 = C14916.m35894(interfaceC243211, bundle2, c12304, bArr3, bArr4, c5902, r15, interfaceC7509);
                    } else {
                        str = str2;
                        interfaceC24329 = interfaceC243212;
                        c16320M26631 = C10353.m26631(interfaceC24329, str, r15, interfaceC7509);
                    }
                    ?? r16 = c16320M26631;
                    r16.f52979 = c6869;
                    boolean z9 = z;
                    c6869.m19126(z9 ? "preparing_source" : "reloading_source");
                    C9431 c9431 = c9431M19934;
                    int i3 = i;
                    ?? r3 = 1;
                     = 1;
                    ?? r4 = 1;
                    try {
                        try {
                            if (z9) {
                                try {
                                    Bundle bundleM11509 = r16.f52984.f63046.f41124.m11509();
                                    atomicBoolean2.set(bundleM11509.getBoolean("e2SourcePending"));
                                    String string = bundleM11509.getString("filePath");
                                    if (string == null) {
                                        throw new IOException("Session source path is missing");
                                    }
                                    C9431 c9432 = string.equals(c9431.f30601.mo4294()) ? c9431 : new C9431(C14584.m35193(string, new String[0]));
                                    if (bundleM11509.getBoolean("forceTryAXml")) {
                                        z5 = true;
                                    } else {
                                        try {
                                            if (bundleM11509.getBoolean("forceTryClass")) {
                                                z5 = true;
                                            } else {
                                                z5 = false;
                                            }
                                        } catch (Error e2) {
                                            e = e2;
                                            th = e;
                                            r15 = 0;
                                            r16 = r16;
                                            r16.m38744().m52947();
                                            if (th instanceof IOException) {
                                                throw ((IOException) th);
                                            }
                                            if (th instanceof RuntimeException) {
                                                throw ((RuntimeException) th);
                                            }
                                            if (th instanceof Error) {
                                                throw ((Error) th);
                                            }
                                            throw new IOException("Session source reload failed", th);
                                        } catch (Exception e3) {
                                            e = e3;
                                            th = e;
                                            r15 = 0;
                                            r16 = r16;
                                            r16.m38744().m52947();
                                            if (th instanceof IOException) {
                                                throw ((IOException) th);
                                            }
                                            if (th instanceof RuntimeException) {
                                                throw ((RuntimeException) th);
                                            }
                                            if (th instanceof Error) {
                                                throw ((Error) th);
                                            }
                                            throw new IOException("Session source reload failed", th);
                                        } catch (Throwable th2) {
                                            th = th2;
                                            r15 = 0;
                                            r16.f52979 = r15;
                                            throw th;
                                        }
                                    }
                                    C16320 c16320M38728 = r16.m38728(interfaceC243211, c9432, z5, i3, r15, interfaceC7509, true);
                                    r16.f52979 = null;
                                    return c16320M38728;
                                } catch (Error e4) {
                                    e = e4;
                                    interfaceC243211 = null;
                                    r4 = r16;
                                    r14 = r4;
                                    interfaceC243210 = interfaceC243211;
                                    th = e;
                                    r16 = r14;
                                    r15 = interfaceC243210;
                                } catch (Exception e5) {
                                    e = e5;
                                    interfaceC243211 = null;
                                    r4 = r16;
                                    r14 = r4;
                                    interfaceC243210 = interfaceC243211;
                                    th = e;
                                    r16 = r14;
                                    r15 = interfaceC243210;
                                } catch (Throwable th3) {
                                    th = th3;
                                    interfaceC243211 = null;
                                    r3 = r16;
                                    r16 = r3;
                                    r15 = interfaceC243211;
                                    r16.f52979 = r15;
                                    throw th;
                                }
                                try {
                                    r16.m38744().m52947();
                                } catch (Throwable th4) {
                                    th.addSuppressed(th4);
                                }
                                if (th instanceof IOException) {
                                    throw ((IOException) th);
                                }
                                if (th instanceof RuntimeException) {
                                    throw ((RuntimeException) th);
                                }
                                if (th instanceof Error) {
                                    throw ((Error) th);
                                }
                                throw new IOException("Session source reload failed", th);
                            }
                            int i4 = SharedPreferencesOnSharedPreferenceChangeListenerC3444.f11224;
                            r16.m38731(C21576.f68932.getInt("text_page_size", 20000000));
                            InterfaceC24329 interfaceC24329M4659 = C1273.m4658(str, interfaceC24329);
                            Point point3 = point;
                            Point point4 = point2;
                            r14 = r16;
                            interfaceC243210 = null;
                            try {
                                C16320 c16320M38729 = r16.m38729(interfaceC24329M4659, c9431, z6, z7, i3, point3 == null ? 0 : point4.x, point3 == null ? 0 : point4.y, r15, interfaceC7509, (point3 == null || point3.x == -1) ? false : true);
                                r14.f52979 = null;
                                return c16320M38729;
                            } catch (Error e6) {
                                e = e6;
                                th = e;
                                r16 = r14;
                                r15 = interfaceC243210;
                                r16.m38744().m52947();
                                if (th instanceof IOException) {
                                    throw ((IOException) th);
                                }
                                if (th instanceof RuntimeException) {
                                    throw ((RuntimeException) th);
                                }
                                if (th instanceof Error) {
                                    throw ((Error) th);
                                }
                                throw new IOException("Session source reload failed", th);
                            } catch (Exception e7) {
                                e = e7;
                                th = e;
                                r16 = r14;
                                r15 = interfaceC243210;
                                r16.m38744().m52947();
                                if (th instanceof IOException) {
                                    throw ((IOException) th);
                                }
                                if (th instanceof RuntimeException) {
                                    throw ((RuntimeException) th);
                                }
                                if (th instanceof Error) {
                                    throw ((Error) th);
                                }
                                throw new IOException("Session source reload failed", th);
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            r16.f52979 = r15;
                            throw th;
                        }
                    } catch (Error e8) {
                        e = e8;
                    } catch (Exception e9) {
                        e = e9;
                    } catch (Throwable th6) {
                        th = th6;
                    }
                }
            }, 8388608, c6868);
            c0902.f3369 = z || point == null || point.x == -1;
            FutureC23690 futureC23690M21524 = m21524(c0902, c19304.f62384, interfaceC24329M4658);
            if (z && !z3) {
                c0902.m3662(strM19937, interfaceC24329M4658);
            }
            futureC23690M21524.m52931(new InterfaceC2017() { // from class: l.۫ۘ᩸
                @Override // l.InterfaceC2017
                /* JADX INFO: renamed from: ᩷ */
                public final void mo1355(Object obj, Throwable th) {
                    C7941.m21553(this.f41162, c24132, c9431M19934, z, atomicBoolean, point, point2, (C16320) obj, th);
                }
            });
            return;
        }
        throw new IllegalStateException("Fragment session loading requires an idle foreground view");
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e1  */
    @Override // l.ComponentCallbacksC11612
    public final void onDestroyView() {
        C24132 c24132;
        C24132 c24133;
        RunnableC23604 runnableC23604 = this.f26395;
        if (runnableC23604 != null) {
            runnableC23604.f76628 = true;
        }
        C10177 c10177 = this.f26390;
        if (c10177 != null) {
            c10177.close();
            this.f26390 = null;
        }
        this.f26407 = false;
        this.f23993.m29420(0);
        C24132 c24134 = this.f26387;
        if (c24134 != null) {
            c24134.m53904(new C23144(0));
        }
        C25096 c25096 = this.f26375;
        if (c25096 != null) {
            c25096.m55946(new CancellationException("Saving view was destroyed"));
        }
        this.f26381 = null;
        super.onDestroyView();
        if (this.f26402 == null && this.f26374 != null && this.f26384 == null) {
            m21595(true);
        }
        C12679 c12679 = this.f26384;
        if (c12679 != null) {
            c12679.m31474();
        }
        this.f26388 = false;
        m21516();
        if (this.f26393 != null) {
            this.f26387.m53992(false);
            this.f26387.m53919(this.f26393);
            this.f26393 = null;
            if (this.f26384 == null && this.f26402 == null && this.f26392 == null) {
                this.f23993.m29404(this, false);
            }
        }
        C0902 c0902 = this.f26402;
        if (c0902 != null) {
            c0902.m3665();
        }
        C23582 c23582 = this.f26385;
        if (c23582 != null && (c12679 == null || c12679.f40607 != this.f26387)) {
            c23582.m52821();
        }
        m21560((DialogInterfaceC8327) null);
        C24132 c24135 = this.f26387;
        if (c24135 != null) {
            c24135.m53918((C15574) null);
            if (c12679 != null) {
                C24132 c24136 = c12679.f40607;
                C24132 c24137 = this.f26387;
                if (c24136 == c24137) {
                    c24137.m53916((InterfaceC12943) null);
                    this.f26387.m53922((InterfaceC16497) null);
                } else if (c0902 != null) {
                    c24132 = c0902.f3383;
                    c24133 = this.f26387;
                    if (c24132 == c24133) {
                        c24133.m53916((InterfaceC12943) null);
                        this.f26387.m53922((InterfaceC16497) null);
                    } else if (this.f26387.m54021() instanceof C3354) {
                        this.f26387.m53916((InterfaceC12943) null);
                        this.f26387.m53922((InterfaceC16497) null);
                        this.f26387.mo52335((CharSequence) "");
                    } else if (this.f26387.m54021().mo11042()) {
                        m19939().m13589(this.f26387.m54021(), C5261.f18538).m52931((InterfaceC2017) new C24159(this.f23989));
                    }
                } else if (this.f26387.m54021() instanceof C3354) {
                    this.f26387.m53916((InterfaceC12943) null);
                    this.f26387.m53922((InterfaceC16497) null);
                    this.f26387.mo52335((CharSequence) "");
                } else if (this.f26387.m54021().mo11042()) {
                    m19939().m13589(this.f26387.m54021(), C5261.f18538).m52931((InterfaceC2017) new C24159(this.f23989));
                }
            } else if (c0902 != null) {
                c24132 = c0902.f3383;
                c24133 = this.f26387;
                if (c24132 == c24133) {
                    c24133.m53916((InterfaceC12943) null);
                    this.f26387.m53922((InterfaceC16497) null);
                } else if (this.f26387.m54021() instanceof C3354) {
                    this.f26387.m53916((InterfaceC12943) null);
                    this.f26387.m53922((InterfaceC16497) null);
                    this.f26387.mo52335((CharSequence) "");
                } else if (this.f26387.m54021().mo11042()) {
                    m19939().m13589(this.f26387.m54021(), C5261.f18538).m52931((InterfaceC2017) new C24159(this.f23989));
                }
            } else if (this.f26387.m54021() instanceof C3354) {
                this.f26387.m53916((InterfaceC12943) null);
                this.f26387.m53922((InterfaceC16497) null);
                this.f26387.mo52335((CharSequence) "");
            } else if (this.f26387.m54021().mo11042()) {
                m19939().m13589(this.f26387.m54021(), C5261.f18538).m52931((InterfaceC2017) new C24159(this.f23989));
            }
        }
        this.f26394 = null;
        this.f26386 = 0;
        this.f26403 = null;
        this.f26387 = null;
        this.f26385 = null;
    }

    @Override // l.AbstractC7283, l.ComponentCallbacksC11612
    public final void onPause() {
        RunnableC23604 runnableC23604 = this.f26395;
        if (runnableC23604 != null) {
            runnableC23604.f76628 = true;
        }
        super.onPause();
        ((ActivityC18143) requireActivity()).m40414();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m21560(DialogInterfaceC8327 dialogInterfaceC8327) {
        DialogInterfaceC8327 dialogInterfaceC8328 = this.f26400;
        if (dialogInterfaceC8328 != null && dialogInterfaceC8328.m22434()) {
            dialogInterfaceC8328.dismiss();
        }
        this.f26400 = dialogInterfaceC8327;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m21636() {
        if (this.f26397) {
            return;
        }
        this.f26377 = null;
        int i = 0;
        final InterfaceC24329 interfaceC24329M4658 = C1273.m4658(m19937(), C6429.of(C21301.m48536().mo4294(), new String[0]));
        if (!C10353.m26633(interfaceC24329M4658) && this.f26374 == null && this.f26402 == null && this.f26392 == null) {
            final C4256 c4256M19939 = m19939();
            C5261.m15838().postDelayed(new Runnable() { // from class: l.۠ܽ᩸
                @Override // java.lang.Runnable
                public final void run() {
                    C7941 c7941 = this.f28536;
                    C4256 c4256 = c4256M19939;
                    C24394 c24394M13590 = c4256.m13590();
                    try {
                        if (c24394M13590 == null) {
                            return;
                        }
                        try {
                            c7941.m19938().mo4296();
                            C21301.m48539(c7941.m19937()).mo4296();
                            synchronized (c4256.f15487) {
                                C21301.m48537(c7941.m19937()).mo4296();
                            }
                            if (c7941.f23990.getBoolean("pageMode")) {
                                int iM19947 = c7941.m19947();
                                for (int i2 = 0; i2 < iM19947; i2++) {
                                    C21301.m48541(c7941.m19937() + "-" + i2).mo4296();
                                }
                            }
                            c24394M13590.close();
                        } catch (Error | RuntimeException e) {
                            c24394M13590.m54531(e);
                            throw e;
                        }
                    } catch (Throwable th) {
                        c24394M13590.close();
                        throw th;
                    }
                }
            }, 500L);
            return;
        }
        this.f26397 = true;
        m21516();
        C23122 c23122 = this.f26405;
        if (c23122 != null) {
            c23122.m52058();
            this.f26405 = null;
        }
        FutureC23690 futureC23690M52928 = FutureC23690.m52928(null);
        C0902 c0902 = this.f26402;
        if (c0902 != null) {
            futureC23690M52928 = c0902.m3666().m52933((InterfaceC11711) new C12110());
            this.f26402.m3667();
        }
        FutureC23690 futureC23690M52929 = (this.f26374 == null && this.f26384 == null) ? FutureC23690.m52928(null) : m21595(true);
        C17636 c17636 = this.f26392;
        FutureC23690 futureC23690M529210 = c17636 == null ? FutureC23690.m52928(null) : c17636.f57981;
        final C8950 c8950M23921 = C8950.m23921("session_delete", interfaceC24329M4658);
        FutureC23690 futureC23690M52933 = this.f26410.m52933((InterfaceC11711) new C25272(i));
        FutureC23690 futureC23690M23934 = c8950M23921.m23934();
        C5261.m15834(this.f23992);
        FutureC23690.m52921(futureC23690M52928, futureC23690M52929, futureC23690M529210, futureC23690M52933, futureC23690M23934, m19939().m13588()).m52948(new Runnable() { // from class: l.ۛۘ᩸
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    C17505.m41065(interfaceC24329M4658);
                    C7941 c7941 = this.f20970;
                    c7941.m19938().mo4296();
                    C21301.m48539(c7941.m19937()).mo4296();
                    C21301.m48537(c7941.m19937()).mo4296();
                    if (c7941.f23990.getBoolean("pageMode")) {
                        int iM19947 = c7941.m19947();
                        for (int i2 = 0; i2 < iM19947; i2++) {
                            C21301.m48541(c7941.m19937() + "-" + i2).mo4296();
                        }
                    }
                } catch (IOException e) {
                    throw new C3552(e);
                }
            }
        }, C5261.f18538).m52931(new InterfaceC2017() { // from class: l.۟ۛ᩸
            @Override // l.InterfaceC2017
            /* JADX INFO: renamed from: ᩷ */
            public final void mo1355(Object obj, Throwable th) {
                C1229 c1229;
                c8950M23921.m23931(th);
                if (th == null || (c1229 = this.f25409.f23989) == null) {
                    return;
                }
                c1229.m4466(th);
            }
        });
    }

    @Override // l.AbstractC7283
    /* JADX INFO: renamed from: ۙ */
    public final void mo19931(String... strArr) {
        InterfaceC24329 interfaceC24329M4658 = C1273.m4658(m19937(), C6429.of(C21301.m48536().mo4294(), new String[0]));
        if (!C10353.m26633(interfaceC24329M4658) && this.f26402 == null && this.f26374 == null) {
            AbstractC22044 abstractC22044M48537 = C21301.m48537(m19937());
            final C4256 c4256M19939 = m19939();
            final RunnableC8139 runnableC8139 = new RunnableC8139(abstractC22044M48537, this.f23990, c4256M19939.f15487);
            C5261.m15836(new Runnable() { // from class: l.ۖܽ᩸
                @Override // java.lang.Runnable
                public final void run() {
                    RunnableC8139 runnableC81310 = runnableC8139;
                    C24394 c24394M13590 = c4256M19939.m13590();
                    try {
                        if (c24394M13590 == null) {
                            return;
                        }
                        try {
                            runnableC81310.m22019();
                            c24394M13590.close();
                        } catch (IOException e) {
                            c24394M13590.m54531(e);
                            c24394M13590.close();
                        } catch (Error e2) {
                            e = e2;
                            c24394M13590.m54531(e);
                            throw e;
                        } catch (RuntimeException e3) {
                            e = e3;
                            c24394M13590.m54531(e);
                            throw e;
                        }
                    } catch (Throwable th) {
                        c24394M13590.close();
                        throw th;
                    }
                }
            }, this.f23992, 200L);
            return;
        }
        if (this.f26397 || strArr.length == 0) {
            return;
        }
        C6714 c6714 = new C6714();
        c6714.m18752(this.f23990, strArr);
        if (Looper.myLooper() != Looper.getMainLooper()) {
            C21576.m49068(new RunnableC20293(this, interfaceC24329M4658, c6714, 1));
            return;
        }
        C17636 c17636 = this.f26392;
        if (c17636 != null) {
            c17636.f57984.m18752(this.f23990, strArr);
        }
        m21563(interfaceC24329M4658, c6714);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m21563(final InterfaceC24329 interfaceC24329, final C6714 c6714) {
        FutureC23690 futureC23690M52928;
        if (this.f26397) {
            return;
        }
        if (this.f26402 != null) {
            this.f26406.m18753(c6714);
            futureC23690M52928 = this.f26402.m3666().m52933((InterfaceC11711) new C4498());
        } else {
            futureC23690M52928 = FutureC23690.m52928(Boolean.FALSE);
        }
        if (this.f26374 != null && this.f26384 == null && this.f26388) {
            return;
        }
        final C8950 c8950M23921 = C8950.m23921("config_write", interfaceC24329);
        final C19304 c19304 = C8117.f26791;
        this.f26410 = FutureC23690.m52921(this.f26410, futureC23690M52928.m52943(new InterfaceC25138() { // from class: l.ܰ᩺᩸
            @Override // l.InterfaceC25138
            public final Object apply(Object obj) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                C8950 c8950 = c8950M23921;
                if (zBooleanValue) {
                    c8950.m23931((Throwable) null);
                    return FutureC23690.m52928(null);
                }
                FutureC23690 futureC23690M23934 = c8950.m23934();
                final C7941 c7941 = this.f48779;
                final InterfaceC24329 interfaceC243210 = interfaceC24329;
                final C6714 c6715 = c6714;
                final C19304 c19305 = c19304;
                return futureC23690M23934.m52948(new Runnable() { // from class: l.֨᩺᩸
                    @Override // java.lang.Runnable
                    public final void run() {
                        C7941.m21555(c7941, interfaceC243210, c6715, c19305);
                    }
                }, c19305.f62384);
            }
        }).m52931((InterfaceC2017) new C5134(1, this, c8950M23921)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21555(C7941 c7941, InterfaceC24329 interfaceC24329, C6714 c6714, C19304 c19304) {
        if (c7941.f26397) {
            return;
        }
        try {
            C16320.m38719(interfaceC24329, c6714, c19304);
        } catch (IOException e) {
            throw new C3552(e);
        }
    }

    @Override // l.AbstractC7283
    /* JADX INFO: renamed from: ᩵ */
    public final void mo19943() {
        if (!C10353.m26633(C1273.m4658(m19937(), C6429.of(C21301.m48536().mo4294(), new String[0]))) && this.f26402 == null && this.f26374 == null) {
            AbstractC22044 abstractC22044M48537 = C21301.m48537(m19937());
            C5261.m15834(this.f23992);
            C4256 c4256M19939 = m19939();
            RunnableC8139 runnableC8139 = new RunnableC8139(abstractC22044M48537, this.f23990, c4256M19939.f15487);
            C24394 c24394M13590 = c4256M19939.m13590();
            try {
                if (c24394M13590 == null) {
                    return;
                }
                try {
                    runnableC8139.m22019();
                    c24394M13590.close();
                } catch (IOException e) {
                    c24394M13590.m54531(e);
                    c24394M13590.close();
                } catch (Error e2) {
                    e = e2;
                    c24394M13590.m54531(e);
                    throw e;
                } catch (RuntimeException e3) {
                    e = e3;
                    c24394M13590.m54531(e);
                    throw e;
                }
            } catch (Throwable th) {
                c24394M13590.close();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m21548(C7941 c7941, InterfaceMenuC10774 interfaceMenuC10774, MenuItem menuItem, MenuItem menuItem2, MenuItem menuItem3, Boolean bool) {
        C23056 c23056;
        interfaceMenuC10774.findItem(R.id.MT_Protector).setTitle(bool.booleanValue() ? R.string.MT_Protector : R.string.MT_Protector);
        boolean zBooleanValue = bool.booleanValue();
        int i = R.string.MT_Protector;
        if (zBooleanValue) {
            menuItem.setVisible(false);
            c7941.f23993.m29411(c7941.m21565());
            c7941.f23993.m29431(false);
            menuItem2.setTitle(R.string.MT_Protector);
        } else {
            menuItem.setVisible(true);
            menuItem.setTitle(R.string.MT_Protector);
            String lowerCase = c7941.m19934().m9060().toLowerCase();
            boolean zEquals = lowerCase.equals(".smali");
            boolean zEquals2 = lowerCase.equals(".jasm");
            c7941.f23993.m29411(zEquals || zEquals2);
            c7941.f23993.m29431(zEquals);
            if (!zEquals2) {
                i = R.string.MT_Protector;
            }
            menuItem2.setTitle(i);
        }
        if (bool.booleanValue() && (c23056 = c7941.f26391) != null && c23056.m51962() && c7941.f26391.f74805 > 0) {
            menuItem3.setVisible(true);
            C11713 c11713 = c7941.f23993;
            C21246 c21246 = c7941.f26391.f74807;
            c11713.m29419((c21246 == null || c21246.m48424() == null || !ActivityC18143.m42278()) ? false : true);
            return;
        }
        menuItem3.setVisible(false);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0042 A[PHI: r0
      0x0042: PHI (r0v4 int) = (r0v3 int), (r0v72 int) binds: [B:6:0x0018, B:14:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x004f  */
    /* JADX WARN: Code duplicated, block: B:20:0x0073  */
    /* JADX WARN: Code duplicated, block: B:21:0x0077  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:31:0x00be  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:35:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:39:0x0105  */
    /* JADX WARN: Code duplicated, block: B:41:0x010a  */
    /* JADX WARN: Code duplicated, block: B:43:0x010f  */
    /* JADX WARN: Code duplicated, block: B:45:0x011b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0146  */
    /* JADX WARN: Code duplicated, block: B:49:0x014a  */
    /* JADX WARN: Code duplicated, block: B:51:0x014f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0155  */
    /* JADX WARN: Code duplicated, block: B:55:0x015a  */
    /* JADX WARN: Code duplicated, block: B:57:0x0162  */
    @Override // l.ComponentCallbacksC11612
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C23940 c23940;
        final ActivityC18143 activityC18143;
        MenuItem menuItemFindItem;
        int i = 1;
        if (!this.f23993.m29430()) {
            this.f26387.m53970();
            int itemId = menuItem.getItemId();
            final int i2 = 0;
            z = false;
            boolean z = false;
            if (itemId != R.id.MT_Protector) {
                if (itemId == R.id.more) {
                    menuItem.getSubMenu().findItem(R.id.MT_Protector).setChecked(this.f26387.m53953());
                    menuItemFindItem = menuItem.getSubMenu().findItem(R.id.MT_Protector);
                    if (this.f26387.m53952() == null) {
                        menuItemFindItem.setVisible(false);
                    } else {
                        menuItemFindItem.setVisible(true);
                        if (C18978.m44078()) {
                            z = true;
                        }
                        menuItemFindItem.setChecked(z);
                    }
                    this.f23993.m29427(this.f26387.m54097());
                    this.f23993.m29429(this.f26387.m54060());
                    if (m21596()) {
                        menuItem.getSubMenu().findItem(R.id.MT_Protector).setVisible(C9398.m24740((GetChars) this.f26387.m54021()));
                        return true;
                    }
                    menuItem.getSubMenu().findItem(R.id.MT_Protector).setVisible(m21613());
                    return true;
                }
                if (itemId == R.id.MT_Protector) {
                    if (m19933()) {
                        m21621(-1, false, true);
                        return true;
                    }
                    C2361 c2361BuildDialog = ((ActivityC18143) requireActivity()).buildDialog();
                    c2361BuildDialog.m8021(R.string.MT_Protector);
                    c2361BuildDialog.m8000(R.string.MT_Protector);
                    c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۛ᩺᩸
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i3) {
                            this.f22452.m21621(-1, false, true);
                        }
                    });
                    c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                    c2361BuildDialog.m8016();
                    return true;
                }
                if (itemId == R.id.MT_Protector) {
                    activityC18143 = (ActivityC18143) requireActivity();
                    if (m19933()) {
                        activityC18143.m42295(this);
                        return true;
                    }
                    C2361 c2361BuildDialog2 = activityC18143.buildDialog();
                    c2361BuildDialog2.m8024(m21639());
                    c2361BuildDialog2.m8000(R.string.MT_Protector);
                    c2361BuildDialog2.m8026(R.string.MT_Protector, new DialogInterfaceOnClickListenerC3161(this, activityC18143, i));
                    c2361BuildDialog2.m8022(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܺ᩺᩸
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i3) {
                            C7941 c7941 = this.f55990;
                            c7941.getClass();
                            activityC18143.m42295(c7941);
                        }
                    });
                    c2361BuildDialog2.m8016();
                    return true;
                }
                if (itemId == R.id.MT_Protector) {
                    this.f26385.m52816();
                    return true;
                }
                if (itemId == R.id.MT_Protector) {
                    this.f26385.m52806(ActivityC25140.class);
                    return true;
                }
                if (itemId != R.id.MT_Protector) {
                }
                m21618();
                m19928();
                DialogInterfaceOnClickListenerC12983.m32394(R.string.MT_Protector, (ActivityC18143) requireActivity(), "menu_keep_in_editor_tip");
                return true;
            }
            m21579();
            itemId = m21519(this.f26385.m52818(), m19934().f30601.getName(), this.f26407 && m21583());
            if (itemId != 0) {
                if (itemId == R.id.more) {
                    menuItem.getSubMenu().findItem(R.id.MT_Protector).setChecked(this.f26387.m53953());
                    menuItemFindItem = menuItem.getSubMenu().findItem(R.id.MT_Protector);
                    if (this.f26387.m53952() == null) {
                        menuItemFindItem.setVisible(false);
                    } else {
                        menuItemFindItem.setVisible(true);
                        if (C18978.m44078() && ApplicationC17729.f58258.getBoolean("cc", true)) {
                            z = true;
                        }
                        menuItemFindItem.setChecked(z);
                    }
                    this.f23993.m29427(this.f26387.m54097());
                    this.f23993.m29429(this.f26387.m54060());
                    if (m21596()) {
                        menuItem.getSubMenu().findItem(R.id.MT_Protector).setVisible(C9398.m24740((GetChars) this.f26387.m54021()));
                        return true;
                    }
                    menuItem.getSubMenu().findItem(R.id.MT_Protector).setVisible(m21613());
                    return true;
                }
                if (itemId == R.id.MT_Protector) {
                    if (m19933()) {
                        m21621(-1, false, true);
                        return true;
                    }
                    C2361 c2361BuildDialog3 = ((ActivityC18143) requireActivity()).buildDialog();
                    c2361BuildDialog3.m8021(R.string.MT_Protector);
                    c2361BuildDialog3.m8000(R.string.MT_Protector);
                    c2361BuildDialog3.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۛ᩺᩸
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i3) {
                            this.f22452.m21621(-1, false, true);
                        }
                    });
                    c2361BuildDialog3.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                    c2361BuildDialog3.m8016();
                    return true;
                }
                if (itemId == R.id.MT_Protector) {
                    activityC18143 = (ActivityC18143) requireActivity();
                    if (m19933()) {
                        activityC18143.m42295(this);
                        return true;
                    }
                    C2361 c2361BuildDialog4 = activityC18143.buildDialog();
                    c2361BuildDialog4.m8024(m21639());
                    c2361BuildDialog4.m8000(R.string.MT_Protector);
                    c2361BuildDialog4.m8026(R.string.MT_Protector, new DialogInterfaceOnClickListenerC3161(this, activityC18143, i));
                    c2361BuildDialog4.m8022(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܺ᩺᩸
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i3) {
                            C7941 c7941 = this.f55990;
                            c7941.getClass();
                            activityC18143.m42295(c7941);
                        }
                    });
                    c2361BuildDialog4.m8016();
                    return true;
                }
                if (itemId == R.id.MT_Protector) {
                    this.f26385.m52816();
                    return true;
                }
                if (itemId == R.id.MT_Protector) {
                    this.f26385.m52806(ActivityC25140.class);
                    return true;
                }
                if (itemId != R.id.MT_Protector || itemId == R.id.MT_Protector) {
                    m21618();
                    m19928();
                    DialogInterfaceOnClickListenerC12983.m32394(R.string.MT_Protector, (ActivityC18143) requireActivity(), "menu_keep_in_editor_tip");
                    return true;
                }
                if (!m19927()) {
                    if (itemId == R.id.MT_Protector) {
                        int i3 = C2448.f7865;
                        String[] strArr = new String[i3];
                        for (int i4 = 0; i4 < i3; i4++) {
                            strArr[i4] = C2448.m8274(i4);
                        }
                        final int[] iArr = {this.f26391.f74803};
                        C2361 c2361BuildDialog5 = ((ActivityC18143) requireActivity()).buildDialog();
                        c2361BuildDialog5.m8021(R.string.MT_Protector);
                        c2361BuildDialog5.m8013(strArr, this.f26391.f74803, new DialogInterfaceOnClickListenerC21595(iArr, i));
                        c2361BuildDialog5.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩻᩺᩸
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i5) {
                                C7941.m21559(this.f81952, iArr, dialogInterface);
                            }
                        });
                        c2361BuildDialog5.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                        c2361BuildDialog5.m8016();
                        return true;
                    }
                    if (itemId == R.id.MT_Protector) {
                        ActivityC18143 activityC18144 = (ActivityC18143) requireActivity();
                        if (!m19941() || (c23940 = this.f26399) == null) {
                            m21628(activityC18144, (ResultCallback) null);
                            return true;
                        }
                        this.f26401 = null;
                        c23940.m53470(null, R.string.MT_Protector, m19934().f30601.getName(), Bundle.EMPTY);
                        return true;
                    }
                    Bundle bundle = this.f23990;
                    if (itemId == R.id.MT_Protector) {
                        AbstractC22044 abstractC22044 = m19934().f30601;
                        String string = bundle.getString("save_as_path");
                        if (string == null) {
                            string = abstractC22044.getParent();
                        }
                        this.f26401 = null;
                        this.f26399.m53470(string, R.string.MT_Protector, abstractC22044.getName(), Bundle.EMPTY);
                        return true;
                    }
                    if (itemId == R.id.MT_Protector) {
                        C9431 c9431M19934 = m19934();
                        String string2 = bundle.getString("save_as_path");
                        if (string2 == null) {
                            string2 = c9431M19934.f30601.getParent();
                        }
                        C20956 c20956 = this.f26396;
                        String str = c9431M19934.m9059() + "_plain" + c9431M19934.m9060();
                        c20956.getClass();
                        C20956.m47908(c20956, R.string.MT_Protector, string2, str, (String[]) null, 24);
                        return true;
                    }
                    if (itemId == R.id.MT_Protector) {
                        int i5 = C2448.f7865;
                        String[] strArr2 = new String[i5];
                        for (int i6 = 0; i6 < i5; i6++) {
                            strArr2[i6] = C2448.m8274(i6);
                        }
                        C2361 c2361BuildDialog6 = ((ActivityC18143) requireActivity()).buildDialog();
                        c2361BuildDialog6.m8021(R.string.MT_Protector);
                        c2361BuildDialog6.m8013(strArr2, this.f26391.f74803, new DialogInterface.OnClickListener() { // from class: l.᩶᩺᩸
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i7) {
                                C7941.m21604(this.f69121, dialogInterface, i7);
                            }
                        });
                        c2361BuildDialog6.m8026(R.string.MT_Protector, null);
                        c2361BuildDialog6.m8016();
                        return true;
                    }
                    if (itemId == R.id.MT_Protector) {
                        String[] strArr3 = {"Windows (CRLF)", "MacOS (CR)", "Unix-like (LF)"};
                        final String[] strArr4 = {"\r\n", "\r", "\n"};
                        String strM54047 = this.f26387.m54047();
                        strM54047.getClass();
                        if (strM54047.equals("\r")) {
                            i2 = 1;
                        } else if (!strM54047.equals("\r\n")) {
                            i2 = 2;
                        }
                        C2361 c2361BuildDialog7 = ((ActivityC18143) requireActivity()).buildDialog();
                        c2361BuildDialog7.m8021(R.string.MT_Protector);
                        c2361BuildDialog7.m8013(strArr3, i2, new DialogInterface.OnClickListener() { // from class: l.᩺᩺᩸
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i7) {
                                C7941 c7941 = this.f79762;
                                if (i7 != i2) {
                                    c7941.f26387.m53983(strArr4[i7]);
                                    c7941.f26387.m54016(true);
                                } else {
                                    c7941.getClass();
                                }
                                dialogInterface.dismiss();
                            }
                        });
                        c2361BuildDialog7.m8026(R.string.MT_Protector, null);
                        c2361BuildDialog7.m8016();
                        return true;
                    }
                    if (itemId == R.id.MT_Protector) {
                        C23056 c23056 = this.f26391;
                        if (c23056 != null) {
                            m21601(c23056.f74803);
                            return true;
                        }
                    } else if (itemId == R.id.MT_Protector) {
                        C24132 c24132 = this.f26387;
                        c24132.m54107(!c24132.m54083());
                        this.f23993.m29408(this.f26387.m54083());
                        this.f26385.m52826();
                        if (this.f26388) {
                            this.f26403.m16625();
                            return true;
                        }
                    } else {
                        if (itemId == R.id.MT_Protector) {
                            if (this.f26391.f74807.m48424() == null) {
                                ((ActivityC18143) requireActivity()).m40396(R.string.MT_Protector, R.string.MT_Protector, false);
                                return true;
                            }
                            ActivityC18143 activityC18145 = (ActivityC18143) requireActivity();
                            int i7 = DialogInterfaceC8327.f27315;
                            C2361 c2361 = new C2361(activityC18145);
                            c2361.m8021(R.string.MT_Protector);
                            c2361.m8000(R.string.MT_Protector);
                            c2361.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                            c2361.m8026(R.string.MT_Protector, new DialogInterfaceOnClickListenerC22398(i2, this, menuItem));
                            c2361.m8016();
                            return true;
                        }
                        if (itemId == R.id.MT_Protector) {
                            m21561(EnumC16890.VECTOR);
                            return true;
                        }
                        if (itemId == R.id.MT_Protector) {
                            if (m19941()) {
                                C22673.m51152(R.string.MT_Protector);
                                return true;
                            }
                            try {
                                C16800 c16800M23111 = C8596.m23111(this.f26387.m54021().toString(), (String) null);
                                C6178 c6178 = new C6178();
                                c6178.mo17812(o.a.h);
                                c16800M23111.mo9279(c6178);
                                String strM39683 = c16800M23111.m39683();
                                C6382.f21565.m49876(strM39683 + ".mtsx.bin").m49844(c6178);
                                Intent intent = new Intent((ActivityC18143) requireActivity(), (Class<?>) ActivityC14587.class);
                                intent.putExtra("syntaxName", c16800M23111.m39683());
                                intent.setData(C14584.m35193(m19934().f30601.mo4294() + "_preview", new String[0]).m49836());
                                startActivity(intent);
                                return true;
                            } catch (Exception e) {
                                m21528(e, (ActivityC18143) null, (C9431) null);
                                return true;
                            }
                        }
                        if (itemId == R.id.MT_Protector) {
                            m21561(EnumC16890.WEB);
                            return true;
                        }
                        if (itemId == R.id.MT_Protector) {
                            m21561(EnumC16890.SVG);
                            return true;
                        }
                        if (itemId == R.id.MT_Protector) {
                            m21571();
                            return true;
                        }
                        if (itemId == R.id.MT_Protector) {
                            new C24538((ActivityC18143) requireActivity(), C24538.m54820(this.f26387));
                            return true;
                        }
                        if (itemId != R.id.MT_Protector) {
                            if (itemId != R.id.MT_Protector) {
                                this.f26385.m52825(menuItem);
                                return true;
                            }
                            if (m21596()) {
                                new C19874(this, (ActivityC18143) requireActivity(), m19937(), C6382.f21568.m49876("xmlTrans")).m8197();
                                return true;
                            }
                            if (!m21613()) {
                                throw new RuntimeException();
                            }
                            new C15398(this, (ActivityC18143) requireActivity(), m19937(), C6382.f21568.m49876("jsonTrans")).m8197();
                            return true;
                        }
                        if (!C18978.m44079()) {
                            C22673.m51152(R.string.MT_Protector);
                            new ViewOnClickListenerC16544((ActivityC18143) requireActivity());
                            return true;
                        }
                        if (!C18978.m44078()) {
                            C22673.m51152(R.string.MT_Protector);
                            return true;
                        }
                        if (this.f26387.m53952() != null) {
                            menuItem.setChecked(!menuItem.isChecked());
                            ApplicationC17729.f58258.edit().putBoolean("cc", menuItem.isChecked()).apply();
                        }
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC0483 m21521(String str, String str2) {
        if ("HTML".equalsIgnoreCase(str)) {
            return EnumC0483.HTML;
        }
        if ("Markdown".equalsIgnoreCase(str)) {
            return EnumC0483.MARKDOWN;
        }
        String strM49832 = str2 == null ? "" : AbstractC22044.m49832(str2);
        if (".html".equalsIgnoreCase(strM49832) || ".htm".equalsIgnoreCase(strM49832) || ".mhtml".equalsIgnoreCase(strM49832)) {
            return EnumC0483.HTML;
        }
        if (".md".equalsIgnoreCase(strM49832) || ".markdown".equalsIgnoreCase(strM49832)) {
            return EnumC0483.MARKDOWN;
        }
        return EnumC0483.NONE;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m21519(String str, String str2, boolean z) {
        if (z) {
            return R.id.MT_Protector;
        }
        if ("MT-Syntax".equals(str)) {
            return R.id.MT_Protector;
        }
        if (str2 != null && ".mtsx".equalsIgnoreCase(AbstractC22044.m49832(str2))) {
            return R.id.MT_Protector;
        }
        if ("Svg".equalsIgnoreCase(str)) {
            return R.id.MT_Protector;
        }
        if (!"HTML".equalsIgnoreCase(str) && !"Markdown".equalsIgnoreCase(str) && str2 != null && ".svg".equalsIgnoreCase(AbstractC22044.m49832(str2))) {
            return R.id.MT_Protector;
        }
        if (m21521(str, str2) != EnumC0483.NONE) {
            return R.id.MT_Protector;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m21561(EnumC16890 enumC16890) {
        String name;
        boolean z = enumC16890 == EnumC16890.SVG;
        boolean z2 = enumC16890 == EnumC16890.VECTOR;
        ActivityC18143 activityC18143 = (ActivityC18143) requireActivity();
        InterfaceC19106 interfaceC19106M54021 = this.f26387.m54021();
        String strM54047 = this.f26387.m54047();
        boolean zM19941 = m19941();
        AbstractC22044 abstractC22044 = m19934().f30601;
        String strMo4294 = zM19941 ? null : abstractC22044.mo4294();
        String name2 = abstractC22044.getName();
        boolean z3 = (z || z2 || m21521(this.f26385.m52818(), abstractC22044.getName()) != EnumC0483.MARKDOWN) ? false : true;
        boolean zM52629 = C23434.m52629(activityC18143);
        int iM54040 = z3 ? this.f26387.m54040() : 0;
        boolean z4 = (z || z2 || z3 || strMo4294 == null || (name = abstractC22044.getName()) == null || !".mhtml".equalsIgnoreCase(AbstractC22044.m49832(name))) ? false : true;
        new C22858(this, (z || z4) ? this.f26391.f74803 : C2448.f7850, z2, interfaceC19106M54021, strM54047, activityC18143, z, z4, z3, iM54040, name2, zM52629, strMo4294).m8197();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public void m21572() {
        if (this.f26379 == 0 || !isVisible() || m19927()) {
            return;
        }
        int i = 1;
        if (!this.f26388 || !this.f26408) {
            C21576.m49069(new RunnableC24614(i, this), 100L);
            return;
        }
        if (!m21596()) {
            if (m21613()) {
                AbstractC22044 abstractC22044M49876 = C6382.f21568.m49876("jsonTrans");
                if (!abstractC22044M49876.mo2934() || abstractC22044M49876.mo4286() == this.f26379) {
                    this.f26379 = 0L;
                    return;
                }
                try {
                    C14691 c14691M30926 = AbstractC12454.m30926(abstractC22044M49876.m49871(), EnumC7234.OrderedField);
                    if (m19937().equals(c14691M30926.m35343("<--id-c5skl23kjndf-->"))) {
                        C18899.m43823(c14691M30926, this.f26387);
                        this.f26387.m53931(false);
                    }
                } catch (Exception unused) {
                } finally {
                    this.f26379 = 0L;
                }
                return;
            }
            return;
        }
        AbstractC22044 abstractC22044M49877 = C6382.f21568.m49876("xmlTrans");
        if (!abstractC22044M49877.mo2934() || abstractC22044M49877.mo4286() == this.f26379) {
            this.f26379 = 0L;
            return;
        }
        try {
            C14691 c14691M30927 = AbstractC12454.m30926(abstractC22044M49877.m49871(), EnumC7234.OrderedField);
            if (m19937().equals(c14691M30927.m35343("<--id-c5skl23kjndf-->"))) {
                C9398.m24739(c14691M30927, this.f26387.m54021());
                this.f26387.m53931(false);
            }
        } catch (Exception unused2) {
        } finally {
            this.f26379 = 0L;
        }
    }

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    private boolean m21596() {
        if (m21577()) {
            return false;
        }
        C24132 c24132 = this.f26387;
        return (c24132 != null && DocumentReader.RESERVED.equalsIgnoreCase(c24132.m53946())) || m19934().f30601.getName().toLowerCase().endsWith(".xml");
    }

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    private boolean m21613() {
        if (m21577()) {
            return false;
        }
        C24132 c24132 = this.f26387;
        return (c24132 != null && "json".equalsIgnoreCase(c24132.m53946())) || m19934().f30601.getName().toLowerCase().endsWith(".json");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public void m21571() {
        if (!this.f26408) {
            C21576.m49069(new RunnableC13161(this, C11555.m29068(getViewLifecycleOwner())), 100L);
            return;
        }
        String lowerCase = m19934().m9060().toLowerCase();
        if (!m21565() && !lowerCase.equals(".jasm")) {
            if (lowerCase.equals(".smali")) {
                new C24045(this, (ActivityC18143) requireActivity()).m8197();
                return;
            }
            return;
        }
        new C3907(this, (ActivityC18143) requireActivity()).m8197();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m21553(C7941 c7941, C24132 c24132, C9431 c9431, boolean z, AtomicBoolean atomicBoolean, Point point, Point point2, C16320 c16320, Throwable th) {
        if (c7941.f26388 && c7941.f26387 == c24132) {
            if (th != null) {
                Throwable cause = th;
                while ((cause instanceof C3552) && cause.getCause() != null) {
                    cause = cause.getCause();
                }
                if (cause instanceof CancellationException) {
                    return;
                }
                c7941.mo19935(true);
                c7941.f26387.m54107(true);
                c7941.m21531(c9431, th);
                c7941.f26408 = true;
                return;
            }
            c7941.m21585(z);
            c7941.f26383 = z && !atomicBoolean.get();
            if (atomicBoolean.get()) {
                c7941.m21582();
            }
            if (!z && point != null && point.x != -1) {
                new C18558(c7941, c16320, point, point2);
            }
            c7941.m21638();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m21557(C7941 c7941, boolean z) {
        c7941.f26407 = z;
        c7941.m21579();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private FutureC23690 m21524(C0902 c0902, Executor executor, InterfaceC24329 interfaceC24329) {
        try {
            C15926 c15926M53949 = this.f26393;
            if (c15926M53949 == null) {
                c15926M53949 = this.f26387.m53949();
            }
            c0902.f3391 = c15926M53949;
            this.f26393 = null;
            this.f26402 = c0902;
            this.f26381 = c0902.m3666();
            this.f23993.m29404(this, true);
            if (interfaceC24329 == null) {
                c0902.m3663(executor);
            } else {
                c0902.m3664(C8950.m23921("session_load", interfaceC24329), executor);
            }
            return c0902.m3666();
        } catch (Error | RuntimeException e) {
            c0902.f3387.m19127(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21623(C0902 c0902) {
        if (this.f26402 == c0902 && this.f26388 && this.f26387 == c0902.f3383) {
            this.f23993.m29409(this);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21624(C0902 c0902, C16320 c16320, boolean z) {
        if (this.f26402 != c0902) {
            return;
        }
        this.f26402 = null;
        if (z && c0902.m3668()) {
            this.f26374 = c16320;
            c16320.m38741(c0902.f3383);
            this.f26406.m18751(this.f23990);
            this.f26406 = new C6714();
            C23122 c23122 = new C23122(this, c16320, this.f26386);
            this.f26405 = c23122;
            c23122.m52057();
        }
        if (!z && c16320 != null && this.f26394 == c16320.f52985) {
            this.f26394 = null;
            this.f26386 = 0;
        }
        if (this.f26392 != null) {
            return;
        }
        this.f23993.m29404(this, false);
        m21579();
        m21587();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m21633(C16320 c16320, C24132 c24132) {
        return this.f26388 && this.f26387 == c24132 && this.f26374 == c16320 && this.f26384 == null && this.f26402 == null && c24132.m54021() == c16320.f52980;
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C23056 m21635() {
        return this.f26391;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21625(C12679 c12679) {
        if (this.f26384 != c12679) {
            return;
        }
        C16320 c16320 = c12679.f40619;
        if (c16320.f52985.m17386() != null) {
            this.f23989.m4466(c16320.f52985.m17386());
        }
        this.f26384 = null;
        if (this.f26374 == c16320) {
            this.f26374 = null;
        }
        if (this.f26394 == c16320.f52985) {
            this.f26394 = null;
            this.f26386 = 0;
        }
        if (this.f26392 != null) {
            return;
        }
        if (this.f26393 == null) {
            this.f23993.m29404(this, false);
        }
        m21587();
    }

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    private void m21587() {
        final RunnableC20620 runnableC20620 = this.f26411;
        final C24132 c24132 = this.f26387;
        if (runnableC20620 == null || !this.f26388) {
            m21516();
        } else {
            C21576.m49068(new Runnable() { // from class: l.ܶۘ᩸
                @Override // java.lang.Runnable
                public final void run() {
                    C7941.m21551(this.f51508, runnableC20620, c24132);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m21551(C7941 c7941, RunnableC20620 runnableC20620, C24132 c24132) {
        if (c7941.f26411 != runnableC20620) {
            return;
        }
        c7941.f26411 = null;
        try {
            try {
                if (c7941.f26388 && c7941.f26387 == c24132) {
                    runnableC20620.run();
                } else {
                    runnableC20620.f66142.m19127(new CancellationException("Pending session view changed"));
                }
                C25096 c25096 = c7941.f26375;
                if (c25096 != null) {
                    c25096.m55947();
                }
            } catch (Throwable th) {
                C25096 c25097 = c7941.f26375;
                if (c25097 != null) {
                    c25097.m55947();
                }
                throw th;
            }
        } catch (Error | RuntimeException e) {
            C25096 c25098 = c7941.f26375;
            if (c25098 != null) {
                c25098.m55946(e);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21626(C12679 c12679, Throwable th) {
        if (this.f26384 != c12679) {
            return;
        }
        RunnableC20620 runnableC20620 = this.f26411;
        if (runnableC20620 != null) {
            runnableC20620.f66142.m19131(th);
        }
        C1229 c1229 = this.f23989;
        if (c1229 != null) {
            c1229.m4466(th);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final FutureC23690 m21620(final C16320 c16320, int i, C15926 c15926) {
        C24132 c24132;
        C24132 c24133;
        FutureC23690 futureC23690M54069;
        C24132 c24134 = this.f26387;
        if (c24134 != null) {
            InterfaceC19106 interfaceC19106M54021 = c24134.m54021();
            C3354 c3354 = c16320.f52980;
            if (interfaceC19106M54021 == c3354) {
                C19547 c19547 = c16320.f52984;
                C5968 c5968 = c16320.f52985;
                if (Looper.myLooper() == Looper.getMainLooper() && this.f26388 && (c24132 = this.f26387) != null && this.f26385 != null) {
                    InterfaceC19106 interfaceC19106M54022 = c24132.m54021();
                    if (interfaceC19106M54022 instanceof C3354) {
                        C3354 c3355 = (C3354) interfaceC19106M54022;
                        if (c5968.m17385(c3355.mo11043())) {
                            if (this.f26394 != null) {
                                throw new IllegalStateException("Fragment recovery is already bound");
                            }
                            if (i < 0) {
                                throw new IllegalArgumentException("Negative fragment state limit");
                            }
                            C12834 c12834 = c19547.f63046;
                            c12834.m31881(c3355.mo11043());
                            c3355.mo11043().m41123();
                            Bundle bundleM11509 = c12834.f41124.m11509();
                            C24132 c24135 = this.f26387;
                            C23582 c23582 = this.f26385;
                            c23582.m52812(c12834.f41119, c12834.f41120, c12834.f41123);
                            if (!this.f26388 || this.f26387 != c24135 || this.f26385 != c23582 || c24135.m54021() != c3355) {
                                throw new CancellationException("Fragment owner changed during restoration");
                            }
                            c12834.m31881(c3355.mo11043());
                            if (Looper.myLooper() == Looper.getMainLooper() && (c24133 = this.f26387) != null) {
                                InterfaceC19106 interfaceC19106M54023 = c24133.m54021();
                                if (interfaceC19106M54023 instanceof C3354) {
                                    C3354 c3356 = (C3354) interfaceC19106M54023;
                                    if (c5968.m17385(c3356.mo11043())) {
                                        if (this.f26394 != null) {
                                            throw new IllegalStateException("Fragment persistence is already bound");
                                        }
                                        if (i < 0) {
                                            throw new IllegalArgumentException("Negative fragment state limit");
                                        }
                                        c3356.mo11043().m41123();
                                        this.f26394 = c5968;
                                        this.f26386 = i;
                                        Bundle bundle = this.f23990;
                                        bundle.clear();
                                        bundle.putAll(bundleM11509);
                                        this.f26406.m18751(bundle);
                                        this.f26391 = c19547.f63045;
                                        this.f26404 = m19941();
                                        m21592();
                                        final C24132 c24136 = this.f26387;
                                        final C23582 c23583 = this.f26385;
                                        if (c15926 == null) {
                                            futureC23690M54069 = c24136.m53979(c3354);
                                        } else {
                                            futureC23690M54069 = c24136.m54069(c3354, c15926);
                                        }
                                        return futureC23690M54069.m52930(new Runnable() { // from class: l.᩵ۘ᩸
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                C7941 c7941 = this.f65192;
                                                if (c7941.f26388) {
                                                    C24132 c24137 = c7941.f26387;
                                                    C24132 c24138 = c24136;
                                                    if (c24137 == c24138 && c7941.f26385 == c23583 && c24138.m54021() == c16320.f52980) {
                                                        return;
                                                    }
                                                }
                                                throw new CancellationException("Fragment changed before its restored view was ready");
                                            }
                                        });
                                    }
                                }
                            }
                            throw new IllegalStateException("Session persistence requires the foreground fragment owner");
                        }
                    }
                }
                throw new IllegalStateException("Fragment recovery requires the foreground session owner");
            }
        }
        throw new IllegalStateException("Fragment recovery editable does not belong to its resource owner");
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19777 m21619() {
        C24132 c24132;
        C11713 c11713 = this.f23993;
        if (c11713 != null && !c11713.m29430() && this.f26388) {
            if (this.f26394 == null && ((c24132 = this.f26387) == null || !(c24132.m54021() instanceof C3354))) {
                C24394 c24394M13590 = m19939().m13590();
                if (c24394M13590 != null) {
                    C24132 c24133 = this.f26387;
                    C23582 c23582 = this.f26385;
                    try {
                        AbstractC22044 abstractC22044M19938 = m19938();
                        if (m19927()) {
                            abstractC22044M19938.mo4296();
                            c24394M13590.close();
                            return null;
                        }
                        if (c24133 == null || c23582 == null) {
                            throw new IllegalStateException("Legacy save view is unavailable");
                        }
                        return new C14347(this, c24133, c23582, c24394M13590, abstractC22044M19938);
                    } catch (Error | RuntimeException e) {
                        c24394M13590.m54531(e);
                        throw e;
                    }
                }
            } else {
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    throw new IllegalStateException("Fragment state capture requires the foreground thread");
                }
                if (!m19927()) {
                    C24132 c24134 = this.f26387;
                    C17359.requireNonNull(c24134);
                    InterfaceC19106 interfaceC19106M54021 = c24134.m54021();
                    if (!(interfaceC19106M54021 instanceof C3354)) {
                        throw new IllegalStateException("Fragment session owner changed before capture");
                    }
                    C3354 c3354 = (C3354) interfaceC19106M54021;
                    C5968 c5968 = this.f26394;
                    if (c5968 == null || !c5968.m17385(c3354.mo11043())) {
                        throw new IllegalStateException("Fragment session persistence is not bound");
                    }
                    C1229 c1229 = this.f23989;
                    C17359.requireNonNull(c1229);
                    try {
                        return new C21061(m21512(), c1229);
                    } catch (IOException | IllegalStateException e2) {
                        c1229.m4466(e2);
                        return null;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public FutureC23690 m21512() {
        C24132 c24132 = this.f26387;
        C17359.requireNonNull(c24132);
        InterfaceC19106 interfaceC19106M54021 = c24132.m54021();
        if (!(interfaceC19106M54021 instanceof C3354)) {
            throw new IllegalStateException("Fragment session owner changed before capture");
        }
        C3354 c3354 = (C3354) interfaceC19106M54021;
        C5968 c5968 = this.f26394;
        if (c5968 == null || !c5968.m17385(c3354.mo11043())) {
            throw new IllegalStateException("Fragment session persistence is not bound");
        }
        C6178 c6178 = new C6178();
        C6178 c6179 = new C6178();
        this.f26385.m52823(c6178);
        this.f26385.m52809(c6179);
        FutureC23690 futureC23690M17384 = c5968.m17384(C4631.m14447(c24132, this.f23990, this.f26391, c6178.m17796(), c6179.m17796(), this.f26386, -1L, null));
        C17505 c17505Mo11043 = c3354.mo11043();
        C17359.requireNonNull(c17505Mo11043);
        return futureC23690M17384.m52943((InterfaceC25138) new C25360(c17505Mo11043));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21622(String str, boolean z) {
        C9431 c9431 = new C9431(C14584.m35193(str, new String[0]));
        ActivityC18143 activityC18143 = (ActivityC18143) requireActivity();
        ResultCallback resultCallback = this.f26401;
        this.f26401 = null;
        new C18823(this, activityC18143, c9431, z, resultCallback).m8197();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void m21609(final ActivityC18143 activityC18143) {
        if (m19941() && this.f26399 != null) {
            Bundle bundle = new Bundle();
            bundle.putBoolean(d.A, true);
            this.f26401 = null;
            this.f26399.m53470(null, R.string.MT_Protector, m19934().f30601.getName(), bundle);
            return;
        }
        m21629(activityC18143, new Runnable() { // from class: l.ᩴۘ᩸
            @Override // java.lang.Runnable
            public final void run() {
                C7941 c7941 = this.f63099;
                c7941.getClass();
                activityC18143.m42295(c7941);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m21562(final ActivityC18143 activityC18143, boolean z) {
        View viewM40395 = activityC18143.m40395(R.layout.MT_Protector);
        CheckBox checkBox = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
        checkBox.setChecked(z);
        final RunnableC11364 runnableC11364 = new RunnableC11364(this, checkBox, activityC18143);
        C2361 c2361BuildDialog = activityC18143.buildDialog();
        c2361BuildDialog.m8005(viewM40395);
        c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩻ۘ᩸
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f80238.m21629(activityC18143, runnableC11364);
            }
        });
        DialogInterfaceOnClickListenerC1704 dialogInterfaceOnClickListenerC1704 = new DialogInterfaceOnClickListenerC1704(1, runnableC11364);
        int i = R.string.MT_Protector;
        c2361BuildDialog.m8022(R.string.MT_Protector, dialogInterfaceOnClickListenerC1704);
        final Button buttonM22433 = c2361BuildDialog.m8016().m22433();
        if (!checkBox.isChecked()) {
            i = R.string.MT_Protector;
        }
        buttonM22433.setText(i);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ܺۘ᩸
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                buttonM22433.setText(z2 ? R.string.MT_Protector : R.string.MT_Protector);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21628(ActivityC18143 activityC18143, ResultCallback resultCallback) {
        if (m19933()) {
            new C9872(this, activityC18143, resultCallback, m19934()).m8197();
        } else if (resultCallback != null) {
            resultCallback.onSuccess();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21629(ActivityC18143 activityC18143, Runnable runnable) {
        if (!m19933()) {
            runnable.run();
        } else {
            C24132 c24132 = this.f26387;
            m21628(activityC18143, new C0924(this, c24132, c24132 == null ? null : c24132.m54021(), m19934().f30601.mo4294(), runnable));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Object m21599(Callable callable) {
        Object obj;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return callable.call();
        }
        FutureTask futureTask = new FutureTask(callable);
        C21576.m49068(futureTask);
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = futureTask.get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (ExecutionException e) {
                    Throwable cause = e.getCause();
                    if (cause instanceof Exception) {
                        Exception exc = (Exception) cause;
                        C22327.m50389(exc);
                        throw exc;
                    }
                    if (!(cause instanceof Error)) {
                        throw new RuntimeException(cause);
                    }
                    Error error = (Error) cause;
                    C22327.m50389(error);
                    throw error;
                }
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x0075  */
    /* JADX WARN: Code duplicated, block: B:39:0x0086  */
    /* JADX WARN: Code duplicated, block: B:43:0x0094  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b4 A[Catch: Error -> 0x00d2, Error | RuntimeException -> 0x00d4, TryCatch #2 {Error | RuntimeException -> 0x00d4, blocks: (B:50:0x00b0, B:52:0x00b4, B:53:0x00b7, B:55:0x00bd, B:57:0x00ca, B:58:0x00d1), top: B:67:0x00b0 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00bd A[Catch: Error -> 0x00d2, Error | RuntimeException -> 0x00d4, TryCatch #2 {Error | RuntimeException -> 0x00d4, blocks: (B:50:0x00b0, B:52:0x00b4, B:53:0x00b7, B:55:0x00bd, B:57:0x00ca, B:58:0x00d1), top: B:67:0x00b0 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00ca A[Catch: Error -> 0x00d2, Error | RuntimeException -> 0x00d4, TryCatch #2 {Error | RuntimeException -> 0x00d4, blocks: (B:50:0x00b0, B:52:0x00b4, B:53:0x00b7, B:55:0x00bd, B:57:0x00ca, B:58:0x00d1), top: B:67:0x00b0 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00d9  */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C5704 m21600(C7941 c7941, C23056 c23056) {
        C24132 c24132;
        InterfaceC19106 interfaceC19106M54021;
        C9431 c9431M19934;
        C16320 c16320;
        C17088 c17088M40243;
        RunnableC23604 runnableC23604;
        C3354 c3354;
        if (c7941.f26388 && c7941.f26387 != null && c7941.f26384 == null && c7941.f26411 == null && !c7941.f23993.m29430()) {
            FutureC23690 futureC23690 = c7941.f26381;
            if (futureC23690 != null) {
                if (futureC23690.isDone()) {
                    if (((C16320) c7941.f26381.m52947()).f52980 != c7941.f26387.m54021()) {
                        throw new CancellationException("Saving content was replaced after loading");
                    }
                    if (c7941.f26408) {
                        if (!c7941.m19927()) {
                            throw new IllegalStateException("Cannot save failed editor content");
                        }
                        c24132 = c7941.f26387;
                        interfaceC19106M54021 = c24132.m54021();
                        if (interfaceC19106M54021 instanceof C3354) {
                            c3354 = (C3354) interfaceC19106M54021;
                            if (!c3354.mo11043().m41081().m48300()) {
                                if (c3354.mo11043().m41081().m48299() != EnumC14456.LOADING) {
                                    throw new IllegalStateException("Cannot save incomplete source text");
                                }
                            }
                        }
                        c9431M19934 = c7941.m19934();
                        if (c23056 == null) {
                            c23056 = c7941.f26391;
                        }
                        c16320 = c7941.f26374;
                        if (c16320 != null) {
                            c17088M40243 = C17088.m40243(interfaceC19106M54021, c24132.m54047(), c23056, -1, null);
                        } else {
                            c17088M40243 = C17088.m40243(interfaceC19106M54021, c24132.m54047(), c23056, -1, null);
                        }
                        runnableC23604 = c7941.f26395;
                        if (runnableC23604 != null) {
                            runnableC23604.f76628 = true;
                        }
                        if (c24132.m54021() == interfaceC19106M54021) {
                            throw new IllegalStateException("Editor changed during saving capture");
                        }
                        return new C5704(c7941, c24132, interfaceC19106M54021, c24132.m54042(), c9431M19934, c17088M40243);
                    }
                }
            } else if (c7941.f26408 && c7941.f26391 != null && c7941.f26387.m54094()) {
                if (!c7941.m19927()) {
                    throw new IllegalStateException("Cannot save failed editor content");
                }
                c24132 = c7941.f26387;
                interfaceC19106M54021 = c24132.m54021();
                if (interfaceC19106M54021 instanceof C3354) {
                    c3354 = (C3354) interfaceC19106M54021;
                    if (!c3354.mo11043().m41081().m48300()) {
                        if (c3354.mo11043().m41081().m48299() != EnumC14456.LOADING) {
                            throw new IllegalStateException("Cannot save incomplete source text");
                        }
                    }
                }
                c9431M19934 = c7941.m19934();
                if (c23056 == null) {
                    c23056 = c7941.f26391;
                }
                c16320 = c7941.f26374;
                if (c16320 != null || c16320.f52980 != interfaceC19106M54021) {
                    c17088M40243 = C17088.m40243(interfaceC19106M54021, c24132.m54047(), c23056, -1, null);
                } else {
                    c17088M40243 = C17088.m40244(c16320, c24132.m54047(), c23056);
                }
                try {
                    runnableC23604 = c7941.f26395;
                    if (runnableC23604 != null) {
                        runnableC23604.f76628 = true;
                    }
                    if (c24132.m54021() == interfaceC19106M54021) {
                        throw new IllegalStateException("Editor changed during saving capture");
                    }
                    return new C5704(c7941, c24132, interfaceC19106M54021, c24132.m54042(), c9431M19934, c17088M40243);
                } catch (Error | RuntimeException e) {
                    c17088M40243.close();
                    throw e;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m21606(C7941 c7941, C17636 c17636) {
        if (c7941.f26392 != c17636) {
            return;
        }
        c7941.f26392 = null;
        c17636.f57982.m23931((Throwable) null);
        c17636.f57981.m52935((Object) null);
        if (c7941.f26411 != null && c7941.f26388) {
            c7941.f26387.m53992(false);
            c7941.f23993.m29404(c7941, false);
        }
        c7941.m21587();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21539(C7941 c7941, Exception exc, ActivityC18143 activityC18143) {
        c7941.m21528(exc, activityC18143, (C9431) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m21528(Exception exc, ActivityC18143 activityC18143, C9431 c9431) {
        int i;
        if (c9431 == null) {
            this.f23989.m4466(exc);
        } else {
            m21531(c9431, exc);
        }
        if (activityC18143 == null) {
            activityC18143 = (ActivityC18143) getActivity();
        }
        if (activityC18143 != null) {
            activityC18143.m42299();
            if (!isResumed()) {
                activityC18143.m42305(this);
            }
        }
        boolean z = exc instanceof C0200;
        C0107 c0107 = this.f26380;
        if (z) {
            int iM1593 = ((C0200) exc).m1593() - 1;
            if (iM1593 >= 0) {
                c0107.m1211(Integer.valueOf(iM1593));
                return;
            }
            return;
        }
        if (exc instanceof C10254) {
            int iM24888 = ((C10254) exc).m26443().m24888();
            if (iM24888 == -1 || (i = iM24888 - 1) < 0) {
                return;
            }
            c0107.m1211(Integer.valueOf(i));
            return;
        }
        if (exc instanceof C4511) {
            C4511 c4511 = (C4511) exc;
            C15301.m36736(c4511.f16093, c4511.f16098).m36745(this.f26387);
        } else if (exc instanceof C10833) {
            ((C10833) exc).m27560(this.f26387);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m21531(AbstractC2720 abstractC2720, Throwable th) {
        for (Throwable cause = th; cause != null; cause = cause.getCause()) {
            if (cause instanceof IOException) {
                if (!(abstractC2720 instanceof C9431)) {
                    break;
                }
                AbstractC22044 abstractC22044 = ((C9431) abstractC2720).f30601;
                if (!(abstractC22044 instanceof C2170)) {
                    break;
                }
                final C2170 c2170 = (C2170) abstractC22044;
                final C3466 c3466 = new C3466(abstractC22044.mo4294(), th);
                this.f26377 = c3466;
                try {
                    C5261.f18540.execute(new Runnable() { // from class: l.ܽ᩺᩸
                        @Override // java.lang.Runnable
                        public final void run() {
                            final C3661 c3661M47616 = C20815.m47616((AbstractC22044) c2170);
                            final C7941 c7941 = this.f58706;
                            final C3466 c3467 = c3466;
                            C21576.m49068(new Runnable() { // from class: l.ۡ᩺᩸
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C7941.m21544(c7941, c3467, c3661M47616);
                                }
                            });
                        }
                    });
                    return;
                } catch (RejectedExecutionException unused) {
                    c3466.f12005 = true;
                    m21567();
                    return;
                }
            }
        }
        this.f23989.m4466(th);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m21544(C7941 c7941, C3466 c3466, C3661 c3661) {
        if (c7941.f26377 != c3466) {
            return;
        }
        c3466.f12007 = c3661;
        c3466.f12005 = true;
        c7941.m21567();
    }

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    private boolean m21567() {
        C3466 c3466 = this.f26377;
        if (c3466 == null) {
            return false;
        }
        if (this.f26397 || !c3466.f12006.equals(m19934().f30601.mo4294())) {
            this.f26377 = null;
            return false;
        }
        if (c3466.f12005) {
            if (c3466.f12007 == null) {
                this.f26377 = null;
                this.f23989.m4466(c3466.f12004);
                return true;
            }
            if (this.f26388 && this.f26387 != null && this.f26408 && isResumed() && this.f26402 == null && this.f26384 == null && this.f26411 == null && !this.f23993.m29430()) {
                this.f26377 = null;
                m21560(c3466.f12007.m11907((ActivityC18143) requireActivity()));
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m21604(C7941 c7941, DialogInterface dialogInterface, int i) {
        C23056 c23056 = c7941.f26391;
        if (c23056.f74803 != i) {
            c23056.f74803 = i;
            c7941.f26387.m54016(true);
            c7941.m21617();
        }
        dialogInterface.dismiss();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21559(C7941 c7941, int[] iArr, DialogInterface dialogInterface) {
        dialogInterface.dismiss();
        if (c7941.f26391.f74803 != iArr[0]) {
            if (!c7941.m19933()) {
                c7941.m21621(iArr[0], false, false);
                return;
            }
            C2361 c2361BuildDialog = ((ActivityC18143) c7941.requireActivity()).buildDialog();
            c2361BuildDialog.m8021(R.string.MT_Protector);
            c2361BuildDialog.m8000(R.string.MT_Protector);
            c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterfaceOnClickListenerC10463(0, c7941, iArr));
            c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c2361BuildDialog.m8016();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0158, code lost:
    
        if (r0.mo11043().m41115() != r10.f26389) goto L63;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m21632() {
        /*
            Method dump skipped, instruction units count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7941.m21632():boolean");
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private boolean m21583() {
        C23056 c23056 = this.f26391;
        return c23056 != null && c23056.m51962();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private boolean m21569() {
        C23056 c23056 = this.f26391;
        return c23056 != null && c23056.m51963();
    }

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    private boolean m21565() {
        C23056 c23056 = this.f26391;
        return c23056 != null && c23056.m51964();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public boolean m21611() {
        C23056 c23056 = this.f26391;
        if (c23056 != null) {
            return c23056.m51962() || this.f26391.m51963() || this.f26391.m51964();
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String m21639() {
        String str = this.f26376;
        if (str != null) {
            return str;
        }
        String string = this.f23990.getString("remark");
        if (TextUtils.isEmpty(string)) {
            string = null;
        }
        if (string != null) {
            this.f26376 = string;
            return string;
        }
        try {
            String strM44060 = C18969.m44060(80, m19934().f30601.getName());
            this.f26376 = strM44060;
            return strM44060;
        } catch (Exception unused) {
            return "Error";
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m21637() {
        if (!m19933()) {
            return m21639();
        }
        return "*" + m21639();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public boolean m21577() {
        C13950 c13950;
        C16320 c16320 = this.f26374;
        return (c16320 == null || (c13950 = c16320.f52982) == null || c13950.m34016() <= 1) ? false : true;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m21640(boolean z) {
        C13950 c13950;
        if (z) {
            return true;
        }
        C16320 c16320 = this.f26374;
        return (c16320 == null || (c13950 = c16320.f52982) == null || !c13950.m34015(c16320.f52991)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public FutureC23690 m21523(final int i, Runnable runnable) {
        final FutureC23690 futureC23690 = new FutureC23690();
        final C16320 c16320 = this.f26374;
        if (!m21577() || i < 0 || i >= c16320.f52982.m34016() || c16320.f52982.m34014() || this.f26384 != null || this.f26402 != null || this.f23993.m29430()) {
            futureC23690.m52937((Throwable) new IllegalStateException("Text page is unavailable"));
            return futureC23690;
        }
        if (i == c16320.f52991) {
            if (runnable != null) {
                runnable.run();
            }
            futureC23690.m52935((Object) null);
            return futureC23690;
        }
        final C24132 c24132 = this.f26387;
        final C13950 c13950 = c16320.f52982;
        final int i2 = this.f26386;
        final C6868 c6868 = new C6868("page_switch", c13950.f44248.getFileName().toString());
        c6868.m19126("waiting_previous_close");
        try {
            FutureC23690 futureC23690M21595 = m21595(false);
            final C12679 c12679 = this.f26384;
            C17359.requireNonNull(c12679);
            c6868.m19128(new Supplier() { // from class: l.ܿ᩺᩸
                @Override // java.util.function.Supplier
                public final Object get() {
                    return c12679.mo3661();
                }
            });
            futureC23690M21595.m52943(new InterfaceC25138() { // from class: l.֡᩺᩸
                @Override // l.InterfaceC25138
                public final Object apply(Object obj) {
                    return C7941.m21526(this.f2781, c24132, c12679, c16320, c13950, i, i2, c6868);
                }
            }).m52932(new C8227(this, c24132, runnable)).m52931(new InterfaceC2017() { // from class: l.ᩳ᩺᩸
                @Override // l.InterfaceC2017
                /* JADX INFO: renamed from: ᩷ */
                public final void mo1355(Object obj, Throwable th) {
                    C7941.m21545(this.f62750, c6868, futureC23690, c24132, th);
                }
            });
            return futureC23690;
        } catch (RuntimeException e) {
            c6868.m19127(e);
            futureC23690.m52937((Throwable) e);
            return futureC23690;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ FutureC23690 m21526(C7941 c7941, C24132 c24132, C12679 c12679, C16320 c16320, final C13950 c13950, final int i, final int i2, final C6868 c6868) {
        if (!c7941.f26388 || c7941.f26387 != c24132) {
            throw new CancellationException("Page view was destroyed");
        }
        final C20884 c20884M31475 = c12679.m31475();
        final C19304 c19304 = c16320.f52985.f20454;
        return c7941.m21524(new C0902(c7941, new InterfaceC9850() { // from class: l.ܽۘ᩸
            @Override // l.InterfaceC9850
            /* JADX INFO: renamed from: ۙ */
            public final C16320 mo25641(InterfaceC7509 interfaceC7509) throws Throwable {
                C20884 c20884 = c20884M31475;
                C13950 c13950M34007 = C13950.m34007(c13950.f44248);
                int i3 = i;
                C19304 c19305 = c19304;
                int i4 = i2;
                C16320 c16320M34011 = c13950M34007.m34011(i3, c19305, i4, interfaceC7509, true);
                C6868 c6869 = c6868;
                c16320M34011.f52979 = c6869;
                c6869.m19126("preparing_page_state");
                try {
                    try {
                        c16320M34011.m38738(c20884.m47725(), c20884.m47726(), c20884.m47724(), c19305, i4);
                        c16320M34011.f52979 = null;
                        return c16320M34011;
                    } catch (Throwable th) {
                        c16320M34011.f52979 = null;
                        throw th;
                    }
                } catch (IOException | Error | RuntimeException e) {
                    c16320M34011.m38744().m52947();
                    throw e;
                }
            }
        }, i2, c6868), c19304.f62384, c13950.f44248);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m21552(C7941 c7941, C24132 c24132, Runnable runnable) {
        if (!c7941.f26388 || c7941.f26387 != c24132) {
            throw new CancellationException("Page view was destroyed");
        }
        c7941.m21585(false);
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m21545(C7941 c7941, C6868 c6868, FutureC23690 futureC23690, C24132 c24132, Throwable th) {
        c6868.m19127(th);
        if (th == null) {
            futureC23690.m52935((Object) null);
            return;
        }
        if (c7941.f26388 && c7941.f26387 == c24132) {
            if (c7941.f26374 == null) {
                c7941.mo19935(true);
            }
            c7941.f23989.m4466(th);
        }
        futureC23690.m52937(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public void m21515() {
        StringBuilder sb = new StringBuilder();
        if (m19933()) {
            sb.append("*");
        }
        if (m21577()) {
            sb.append(MotionUtils.EASING_TYPE_FORMAT_START);
            sb.append(this.f26374.f52991 + 1);
            sb.append("/");
            sb.append(this.f26374.f52982.m34016());
            sb.append(") ");
        }
        sb.append(m21639());
        this.f23993.m29394(sb.toString());
        this.f23993.m29393(m19933() ? C3296.f10764 : C3296.f10762);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public void m21617() {
        StringBuilder sb = new StringBuilder();
        C24132 c24132 = this.f26387;
        if (c24132 != null) {
            int iM53968 = c24132.m53968();
            int iM53882 = c24132.m53882();
            Point pointM53978 = c24132.m53978(iM53968);
            sb.append(pointM53978.x);
            sb.append(':');
            sb.append(pointM53978.y);
            if (iM53968 != iM53882) {
                sb.append(" (");
                sb.append(Math.abs(iM53882 - iM53968));
                sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
            }
        }
        if (this.f26391 != null) {
            if (sb.length() > 0) {
                sb.append("   ");
            }
            if (this.f26391.m51962()) {
                sb.append("AXML");
            } else if (this.f26391.m51963()) {
                sb.append("ABX");
            } else {
                sb.append(C2448.m8274(this.f26391.f74803));
            }
        }
        if (sb.length() == 0) {
            this.f23993.m29421("...");
        } else {
            this.f23993.m29421(sb.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m21527(View view) {
        final int i;
        String strM8274;
        int i2 = 0;
        if (m21577() && view.getId() == R.id.MT_Protector) {
            int iM34016 = this.f26374.f52982.m34016();
            CharSequence[] charSequenceArr = new CharSequence[iM34016];
            while (i2 < iM34016) {
                int i3 = i2 + 1;
                charSequenceArr[i2] = String.valueOf(i3);
                i2 = i3;
            }
            C2361 c2361BuildDialog = ((ActivityC18143) requireActivity()).buildDialog();
            c2361BuildDialog.m8021(R.string.MT_Protector);
            c2361BuildDialog.m8013(charSequenceArr, this.f26374.f52991, new DialogInterface.OnClickListener() { // from class: l.ܶ᩺᩸
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i4) {
                    C7941.m21536(this.f53313, dialogInterface, i4);
                }
            });
            c2361BuildDialog.m8026(R.string.MT_Protector, null);
            c2361BuildDialog.m8016();
            return;
        }
        C9431 c9431M19934 = m19934();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) getString(R.string.MT_Protector));
        spannableStringBuilder.setSpan(new StyleSpan(1), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) "\n").append((CharSequence) c9431M19934.f30601.mo4294()).append((CharSequence) "\n");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) getString(R.string.MT_Protector));
        if (m21583()) {
            i = C2448.f7850;
            strM8274 = "AXML";
        } else if (m21569()) {
            i = C2448.f7850;
            strM8274 = "ABX";
        } else if (m21565()) {
            i = C2448.f7850;
            strM8274 = "Class";
        } else {
            C23056 c23056 = this.f26391;
            i = c23056 == null ? -1 : c23056.f74803;
            strM8274 = i == -1 ? "?" : C2448.m8274(i);
        }
        spannableStringBuilder.setSpan(new StyleSpan(1), length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) "\n").append((CharSequence) strM8274).append((CharSequence) "\n");
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) getString(R.string.MT_Protector));
        spannableStringBuilder.setSpan(new StyleSpan(1), length2, spannableStringBuilder.length(), 33);
        SpannableStringBuilder spannableStringBuilderAppend = spannableStringBuilder.append((CharSequence) "\n");
        String[] strArr = {"Windows (CRLF)", "MacOS (CR)", "Unix-like (LF)"};
        String strM54047 = this.f26387.m54047();
        strM54047.getClass();
        if (strM54047.equals("\r")) {
            i2 = 1;
        } else if (!strM54047.equals("\r\n")) {
            i2 = 2;
        }
        spannableStringBuilderAppend.append((CharSequence) strArr[i2]);
        C2361 c2361BuildDialog2 = ((ActivityC18143) requireActivity()).buildDialog();
        c2361BuildDialog2.m8024(m21639());
        c2361BuildDialog2.m8008(spannableStringBuilder);
        c2361BuildDialog2.m8026(R.string.MT_Protector, null);
        c2361BuildDialog2.m8022(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩹᩺᩸
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                C7941.m21534(this.f77368, i);
            }
        });
        c2361BuildDialog2.m8018(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۗ᩺᩸
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                C7941 c7941 = this.f12870;
                c7941.m21630((ActivityC18143) c7941.requireActivity(), (DialogInterfaceC12551) dialogInterface);
            }
        });
        ((TextView) c2361BuildDialog2.m8016().m22423(android.R.id.message)).setTextIsSelectable(true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m21536(C7941 c7941, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        c7941.m21523(i, (Runnable) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m21534(C7941 c7941, int i) {
        if (i != -1) {
            c7941.m21601(i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21630(ActivityC18143 activityC18143, DialogInterfaceC12551 dialogInterfaceC12551) {
        C9126 c9126 = new C9126(this, activityC18143, activityC18143, dialogInterfaceC12551);
        c9126.m22945(R.string.MT_Protector);
        c9126.m22942(40);
        String string = this.f23990.getString("remark");
        if (TextUtils.isEmpty(string)) {
            string = null;
        }
        c9126.m22924((CharSequence) string);
        c9126.m22959();
        c9126.m22955(true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21627(final ActivityC18143 activityC18143) {
        if (m19933()) {
            if (m19941() && this.f26399 == null) {
                activityC18143.m42305(this);
            }
            int i = DialogInterfaceC8327.f27315;
            C2361 c2361 = new C2361(activityC18143);
            c2361.m8024(m21639());
            c2361.m8000(R.string.MT_Protector);
            c2361.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩹ۘ᩸
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    this.f75461.m21609(activityC18143);
                }
            });
            c2361.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c2361.m8018(R.string.MT_Protector, new DialogInterfaceOnClickListenerC3161(this, activityC18143, 0));
            c2361.m8016();
            return;
        }
        activityC18143.m42295(this);
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C21246 m21634() {
        C21246 c21246 = this.f26391.f74807;
        C17359.requireNonNull(c21246);
        return c21246;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final Map m21641() {
        Map map = this.f26391.f74808;
        C17359.requireNonNull(map);
        return map;
    }

    @Override // l.ComponentCallbacksC11612
    public final void onDestroyOptionsMenu() {
        C10177 c10177 = this.f26390;
        if (c10177 != null) {
            c10177.close();
            this.f26390 = null;
        }
        super.onDestroyOptionsMenu();
    }

    @Override // l.AbstractC7283
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo19935(boolean z) {
        boolean zMo19935 = super.mo19935(true);
        C11713 c11713 = this.f23993;
        if (c11713 != null) {
            c11713.m29420(0);
        }
        return zMo19935;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public void m21579() {
        if (!this.f26388 || !this.f26408 || this.f26385 == null || this.f23993.m29430()) {
            return;
        }
        C11713 c11713 = this.f23993;
        int iM21519 = 0;
        z = false;
        boolean z = false;
        if (!m19927()) {
            if (this.f26407 && m21583()) {
                z = true;
            }
            iM21519 = m21519(this.f26385.m52818(), m19934().f30601.getName(), z);
        }
        c11713.m29420(iM21519);
    }
}
