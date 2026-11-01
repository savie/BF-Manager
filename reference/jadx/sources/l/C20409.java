package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Looper;
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
import android.widget.ProgressBar;
import android.widget.TextView;
import bin.mt.plugin.api.util.ResultCallback;
import bin.mt.plus.R;
import com.alipay.sdk.m.c0.d;
import com.alipay.sdk.m.t.e;
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
import java.util.concurrent.atomic.AtomicBoolean;
import org.bouncycastle.i18n.TextBundle;
import org.simpleframework.xml.stream.DocumentReader;

/* JADX INFO: renamed from: l.᩶᩷ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes.dex */
public class C20409 extends AbstractC4802 {

    /* JADX INFO: renamed from: ᩻᩵ۘ, reason: not valid java name and contains not printable characters */
    private static final short[] f66122;

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public C2063 f66123;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public Runnable f66124;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C6111 f66125;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public boolean f66126;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C23566 f66127;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public ResultCallback f66128;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public C9101 f66130;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public C17215 f66131;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public C8042 f66132;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f66134;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C20556 f66135;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C18292 f66137;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f66138;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC19356 f66140;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public C18998 f66141;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f66142;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public int f66144;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public String f66145;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public boolean f66146;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public C1295 f66147;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public C8352 f66148;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public FutureC12075 f66149;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public C16839 f66150;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public C14393 f66151;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public C11880 f66152;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public C15990 f66153;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f66155;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public FutureC12075 f66133 = FutureC12075.m30001(null);

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public C19641 f66136 = new C19641();

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC3453 f66129 = new C4886(this);

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public long f66139 = 0;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final Object f66154 = new Object();

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final C16609 f66143 = new C16609();

    static {
        ApplicationC6132.m17119(152);
        f66122 = new short[]{3940, 5143, 5158, 5179, 5175, 5229, 5179, 5166, 5167, 5229, 5152, 5167, 5154, 5168, 5168, 6608, -24428, -24443, -24445, -24435, -24438, -24445, -24389, -24447, -24448, -24435, -24432, -24435, -24438, -24445, -1371, -14029, -382, -24407, -24400, -24375, -24393, -24419, -24438, -24432, -24443, -24420};
    }

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    private native void m46088();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private native void m46117();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private native void m46124(boolean z);

    @Override // l.ComponentCallbacksC22654
    public native void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23232 m46060(final C20409 c20409, final C2063 c2063) {
        c20409.getClass();
        final C18292 c18292 = (C18292) m46100(new Callable() { // from class: l.ۖ۟ۖ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C20409 c204010 = this.f8393;
                c204010.getClass();
                final C18292 c18293 = new C18292(c204010, c2063);
                if (c204010.f66137 != null) {
                    throw new IllegalStateException("A save capture is already waiting");
                }
                c204010.f66137 = c18293;
                C6111 c6111 = c18293.f58359;
                if (c6111 != null) {
                    c6111.m16866(c18293.f58358);
                }
                C6919 c6919 = c18293.f58361;
                if (c6919 != null) {
                    c6919.m18545(c18293.f58353);
                }
                if (c204010.f66148 != null) {
                    FutureC12075 futureC12075M21872 = c204010.f66148.m21872();
                    c18293.f58357 = futureC12075M21872;
                    futureC12075M21872.m30016(new InterfaceC7486() { // from class: l.᩸᩷ۖ
                        @Override // l.InterfaceC7486
                        /* JADX INFO: renamed from: ܰ */
                        public final void mo2142(Object obj, Throwable th) {
                            c18293.m42501();
                        }
                    });
                }
                if (c204010.f66132 != null) {
                    C8042 c8042 = c204010.f66132;
                    c18293.f58349 = c8042;
                    FutureC12075 futureC12075M21170 = c8042.m21170();
                    c18293.f58350 = futureC12075M21170;
                    futureC12075M21170.m30016((InterfaceC7486) new C13291(1, c18293));
                }
                c18293.m42501();
                return c18293;
            }
        });
        try {
            try {
                return (C23232) c18292.f58355.get();
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause instanceof Exception) {
                    throw ((Exception) cause);
                }
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException(cause);
            }
        } catch (Throwable th) {
            m46100(new Callable() { // from class: l.ۚ۟ۖ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    CancellationException cancellationException = new CancellationException("Saving observation ended");
                    C18292 c18293 = c18292;
                    c18293.m42500(cancellationException);
                    C23232 c23232 = c18293.f58352;
                    if (c23232 == null) {
                        return null;
                    }
                    c23232.close();
                    return null;
                }
            });
            throw th;
        }
    }

    public C20409() {
        setHasOptionsMenu(true);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m46150() {
        this.f16884.remove("temp");
        C6919 c6919 = this.f16887;
        if (c6919 != null) {
            c6919.m18564(false);
        }
        mo13341("temp");
    }

    @Override // l.AbstractC4802, l.ComponentCallbacksC22654
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f66138 = false;
        this.f66131 = ViewOnClickListenerC8374.m21924(this, new C14060(this));
        this.f66127 = ViewOnClickListenerC8374.m21927(this, new C22838(this));
        this.f66130 = C7689.m20322(this, new C1359(1, this));
        if (bundle != null) {
            this.f66139 = bundle.getLong("xmlTransFileTime", 0L);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m46067(C20409 c20409, int i) {
        if (i == 2) {
            c20409.m46128();
        }
    }

    @Override // l.AbstractC4802
    /* JADX INFO: renamed from: ܶ */
    public final boolean mo13352() {
        return this.f16884.getBoolean("temp", false);
    }

    @Override // l.ComponentCallbacksC22654
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f16887.m18549(this, view.findViewById(R.id.MT_Protector), (C6111) view.findViewById(R.id.MT_Protector));
        this.f16887.m18575(getResources().getBoolean(R.bool.MT_Protector));
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.MT_Protector);
        C11089 c11089 = new C11089((ActivityC11632) requireActivity());
        c11089.m27980(false);
        c11089.m27978();
        progressBar.setIndeterminateDrawable(c11089);
        this.f16887.m18550(this, progressBar);
        final TextView textView = (TextView) view.findViewById(R.id.MT_Protector);
        TextView textView2 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f16887.m18551(this, textView);
        this.f16887.m18570(this, textView2);
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.ۖۤۖ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f9795.m46061(view2);
            }
        });
        textView2.setOnClickListener(new ViewOnClickListenerC21509(0, this));
        textView.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.۟ۤۖ
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                C16737.m39272((CharSequence) textView.getText().toString());
                return true;
            }
        });
        C6111 c6111 = (C6111) view.findViewById(R.id.MT_Protector);
        this.f66125 = c6111;
        c6111.m16862(this.f66129);
        C6111 c6112 = this.f66125;
        C6919 c6919 = this.f16887;
        C13638.requireNonNull(c6919);
        c6112.m16884(new C8063(c6919));
        this.f66125.m16885(new C23565(this));
        this.f66142 = bundle == null ? null : bundle.getString("editSessionIdOnStart");
        this.f66155 = bundle == null ? 0L : bundle.getLong("editSessionMarkOnStart");
        InterfaceC1423 viewLifecycleOwner = getViewLifecycleOwner();
        C6111 c6113 = this.f66125;
        C13638.requireNonNull(c6113);
        this.f66143.m39052(viewLifecycleOwner, new C22838(c6113));
        this.f66150 = new C16839(view, this.f66125);
        C20556 c20556 = new C20556((ActivityC11632) requireActivity(), this.f66125, TextBundle.TEXT_ENTRY, new C2769(this, view));
        this.f66135 = c20556;
        c20556.m46371(getViewLifecycleOwner(), this.f66150, ActivityC23148.class);
        this.f66125.m16868(new C5592(this));
        this.f66125.m16864(new InterfaceC7191() { // from class: l.᩵۟ۖ
            @Override // l.InterfaceC7191
            /* JADX INFO: renamed from: ۙ */
            public final void mo4041(int i, int i2) {
                this.f62302.m46049();
            }
        });
        this.f66125.m16865(new C22526(this));
        m46126();
        m46049();
        this.f66146 = true;
        this.f66150.m39492();
        m46132(-1, true, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m46070(C20409 c20409, View view) {
        int i;
        if (c20409.m46050() || c20409.m46114() || c20409.m46094()) {
            i = C22037.f71424;
        } else {
            C2063 c2063 = c20409.f66123;
            i = c2063 == null ? -1 : c2063.f7652;
        }
        if (i != -1 && !c20409.m46085()) {
            c20409.m46102(i);
        } else {
            c20409.m46061(view);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m46080(C20409 c20409, C16408 c16408, RuntimeException runtimeException) {
        C6111 c6111;
        if (c20409.f66146 && (c6111 = c20409.f66125) != null && c6111.m17000() == c16408) {
            C11880 c11880 = c20409.f66152;
            if (c11880 != null) {
                c11880.m29633();
                c20409.f66152 = null;
            }
            c20409.m13347(true);
            c20409.f66125.m17065(true);
            c20409.f16882.m2969((Throwable) runtimeException);
        }
    }

    @Override // l.AbstractC4802, l.ComponentCallbacksC22654
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("editSessionIdOnStart", this.f66142);
        bundle.putLong("editSessionMarkOnStart", this.f66155);
        bundle.putLong("transFileTime", this.f66139);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m46065(final C16881 c16881) {
        C8067 c8067BuildDialog = ((ActivityC11632) requireActivity()).buildDialog();
        c8067BuildDialog.m21277(m46151());
        c8067BuildDialog.m21261(getString(R.string.MT_Protector, c16881.f53983.getName()));
        c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterfaceOnClickListenerC3828(1, this, c16881));
        c8067BuildDialog.m21275(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩷۟ۖ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C20409 c20409 = this.f67436;
                c20409.f66125.m17057(true);
                c20409.m13342(true);
                c20409.m13340(c16881.f53983.mo33991());
            }
        });
        c8067BuildDialog.m21265(false);
        DialogInterfaceC19356 dialogInterfaceC19356M21269 = c8067BuildDialog.m21269();
        DialogInterfaceC19356 dialogInterfaceC19356 = this.f66140;
        if (dialogInterfaceC19356 != null && dialogInterfaceC19356.m44375()) {
            dialogInterfaceC19356.dismiss();
        }
        this.f66140 = dialogInterfaceC19356M21269;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m46102(int i) {
        ActivityC11632 activityC11632 = (ActivityC11632) requireActivity();
        C6111 c6111 = this.f66125;
        C14393 c14393 = this.f66151;
        int[] iArrM16971 = c6111.m16971();
        Charset charsetM48953 = C22037.m48953(i);
        new C4034(c6111, c14393, iArrM16971, activityC11632, charsetM48953, c6111.m17042().getBytes(charsetM48953).length).m10243();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void m46104(C16881 c16881) {
        C8067 c8067BuildDialog = ((ActivityC11632) requireActivity()).buildDialog();
        c8067BuildDialog.m21277(m46151());
        int i = 0;
        c8067BuildDialog.m21261(getString(R.string.MT_Protector, c16881.f53983.getName()));
        c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterfaceOnClickListenerC6692(i, this));
        c8067BuildDialog.m21275(R.string.MT_Protector, new DialogInterfaceOnClickListenerC22921(this, c16881, i));
        c8067BuildDialog.m21265(false);
        DialogInterfaceC19356 dialogInterfaceC19356M21269 = c8067BuildDialog.m21269();
        DialogInterfaceC19356 dialogInterfaceC19356 = this.f66140;
        if (dialogInterfaceC19356 != null && dialogInterfaceC19356.m44375()) {
            dialogInterfaceC19356.dismiss();
        }
        this.f66140 = dialogInterfaceC19356M21269;
    }

    @Override // l.ComponentCallbacksC22654
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewM29013 = ((ActivityC11632) requireActivity()).m29013(R.layout.MT_Protector);
        if (viewM29013 == null) {
            viewM29013 = super.onCreateView(layoutInflater, viewGroup, bundle);
            C13638.requireNonNull(viewM29013);
        }
        C16737.m39274(new RunnableC10098(1, this), 600L);
        C3141.f11846.m44959(getViewLifecycleOwner(), new C16134(1, this));
        return viewM29013;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46132(final int i, final boolean z, final boolean z2) {
        Point pointM16956;
        C8352 c8352;
        C6111 c6111;
        if (this.f66134) {
            return;
        }
        if (this.f66141 != null) {
            this.f66124 = new Runnable() { // from class: l.ܽۤۖ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f53203.m46132(i, z, z2);
                }
            };
            if (!this.f66146 || (c6111 = this.f66125) == null) {
                return;
            }
            c6111.m16922(true);
            this.f16887.m18553(this, true);
            return;
        }
        C8042 c8042 = this.f66132;
        if (c8042 != null) {
            this.f66124 = new Runnable() { // from class: l.۫ۤۖ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f41231.m46132(i, z, z2);
                }
            };
            c8042.m21171();
            return;
        }
        boolean zM13356 = m13356();
        this.f66126 = zM13356;
        if (!zM13356 && !z && !m13346().f53983.mo33975()) {
            this.f16882.m2969((Throwable) new FileNotFoundException(m13346().f53983.mo33986()));
            this.f66138 = true;
            return;
        }
        Point point = new Point();
        if (z2 && (c8352 = this.f66148) != null) {
            pointM16956 = c8352.m21870();
            point = this.f66148.m21868();
        } else if (z2 && this.f66146) {
            C6111 c6112 = this.f66125;
            pointM16956 = c6112.m16956(c6112.m16916());
            point.x = this.f66125.getScrollX();
            point.y = this.f66125.m17066();
        } else {
            pointM16956 = null;
        }
        final Point point2 = pointM16956;
        final Point point3 = point;
        C8352 c8353 = this.f66148;
        if (c8353 != null || this.f66151 != null) {
            if (c8353 != null) {
                C6111 c6113 = c8353.f28950;
                C6111 c6114 = this.f66125;
                if (c6113 != c6114 && this.f66146) {
                    if (this.f66153 == null) {
                        this.f66153 = c6114.m16810();
                    }
                    this.f16887.m18553(this, true);
                }
            }
            this.f66124 = new Runnable() { // from class: l.ܿۤۖ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f55021.m46142(z, i, point2, point3);
                }
            };
            m46086(false);
            return;
        }
        m46142(z, i, point2, point3);
    }

    @Override // l.ComponentCallbacksC22654
    public final void onResume() {
        super.onResume();
        if (this.f66146) {
            ((ActivityC11632) requireActivity()).m31019(this.f66125);
            if (this.f66135.m46379() && this.f66146) {
                this.f66150.m39492();
            }
        }
        m46129();
        m46096();
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final void m46129() {
        ActivityC19126 activity = getActivity();
        if (activity == null || !((ActivityC11632) activity).m29020()) {
            boolean z = ApplicationC0716.f2988.getBoolean("check_file_time", true);
            boolean z2 = ApplicationC0716.f2988.getBoolean("check_file_exists", true);
            if ((z2 || z) && isResumed() && !m13344() && m13351() && !m13356()) {
                C16881 c16881M13346 = m13346();
                AbstractC20745 abstractC20745 = c16881M13346.f53983;
                if (abstractC20745.getClass() == C22383.class) {
                    return;
                }
                boolean zMo33975 = abstractC20745.mo33975();
                Bundle bundle = this.f16884;
                if (!zMo33975) {
                    if (z2 && bundle.getBoolean("checkFileExists")) {
                        m46104(c16881M13346);
                        return;
                    }
                    return;
                }
                if (z) {
                    long j = bundle.getLong("fileTime", -1L);
                    if (j == -1 || abstractC20745.mo33991() == j) {
                        return;
                    }
                    m46065(c16881M13346);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m46146() {
        if (this.f66134) {
            return;
        }
        final InterfaceC3800 interfaceC3800M28083 = C11153.m28083(m13348(), C12974.of(C2417.m7342().mo33986(), new String[0]));
        if (!C4138.m11771(interfaceC3800M28083) && this.f66151 == null && this.f66132 == null && this.f66141 == null) {
            final C21030 c21030M13353 = m13353();
            C4716.m13053().postDelayed(new Runnable() { // from class: l.ۗ᩸ۖ
                @Override // java.lang.Runnable
                public final void run() {
                    C20409 c20409 = this.f12812;
                    C21030 c21030 = c21030M13353;
                    C7625 c7625M47408 = c21030.m47408();
                    try {
                        if (c7625M47408 == null) {
                            return;
                        }
                        try {
                            c20409.m13357().mo24647();
                            C2417.m7345(c20409.m13348()).mo24647();
                            synchronized (c21030.f68493) {
                                C2417.m7343(c20409.m13348()).mo24647();
                            }
                            if (c20409.f16884.getBoolean("pageMode")) {
                                int iM13337 = c20409.m13337();
                                for (int i = 0; i < iM13337; i++) {
                                    C2417.m7347(c20409.m13348() + "-" + i).mo24647();
                                }
                            }
                            c7625M47408.close();
                        } catch (Error | RuntimeException e) {
                            c7625M47408.m20153(e);
                            throw e;
                        }
                    } catch (Throwable th) {
                        c7625M47408.close();
                        throw th;
                    }
                }
            }, 500L);
            return;
        }
        this.f66134 = true;
        this.f66124 = null;
        C11880 c11880 = this.f66152;
        if (c11880 != null) {
            c11880.m29633();
            this.f66152 = null;
        }
        FutureC12075 futureC12075M30001 = FutureC12075.m30001(null);
        C8042 c8042 = this.f66132;
        if (c8042 != null) {
            futureC12075M30001 = c8042.m21170().m30018((InterfaceC20892) new C5281());
            this.f66132.m21171();
        }
        FutureC12075 futureC12075M30002 = (this.f66151 == null && this.f66148 == null) ? FutureC12075.m30001(null) : m46086(true);
        C18998 c18998 = this.f66141;
        FutureC12075 futureC12075M30003 = c18998 == null ? FutureC12075.m30001(null) : c18998.f61492;
        final C20346 c20346M45910 = C20346.m45910(interfaceC3800M28083);
        FutureC12075 futureC12075M30018 = this.f66133.m30018((InterfaceC20892) new C1694(6));
        FutureC12075 futureC12075M45913 = c20346M45910.m45913();
        C4716.m13053().removeCallbacksAndMessages(this.f16886);
        FutureC12075.m30006(futureC12075M30001, futureC12075M30002, futureC12075M30003, futureC12075M30018, futureC12075M45913, m13353().m47406()).m30031(new Runnable() { // from class: l.᩹ۤۖ
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    C1254.m4508(interfaceC3800M28083);
                    C20409 c20409 = this.f72653;
                    c20409.m13357().mo24647();
                    C2417.m7345(c20409.m13348()).mo24647();
                    C2417.m7343(c20409.m13348()).mo24647();
                    if (c20409.f16884.getBoolean("pageMode")) {
                        int iM13337 = c20409.m13337();
                        for (int i = 0; i < iM13337; i++) {
                            C2417.m7347(c20409.m13348() + "-" + i).mo24647();
                        }
                    }
                } catch (IOException e) {
                    throw new C17013(e);
                }
            }
        }, C4716.f16635).m30016(new InterfaceC7486() { // from class: l.֨ۤۖ
            @Override // l.InterfaceC7486
            /* JADX INFO: renamed from: ܰ */
            public final void mo2142(Object obj, Throwable th) {
                C0652 c0652;
                c20346M45910.m45914(th);
                if (th == null || (c0652 = this.f4856.f16882) == null) {
                    return;
                }
                c0652.m2969(th);
            }
        });
    }

    @Override // l.AbstractC4802
    /* JADX INFO: renamed from: ۙ */
    public final void mo13341(String... strArr) {
        final InterfaceC3800 interfaceC3800M28083 = C11153.m28083(m13348(), C12974.of(C2417.m7342().mo33986(), new String[0]));
        if (!C4138.m11771(interfaceC3800M28083) && this.f66132 == null && this.f66151 == null) {
            AbstractC20745 abstractC20745M7343 = C2417.m7343(m13348());
            final C21030 c21030M13353 = m13353();
            final RunnableC7563 runnableC7563 = new RunnableC7563(abstractC20745M7343, this.f16884, c21030M13353.f68493);
            C4716.m13051(new Runnable() { // from class: l.ۢ᩸ۖ
                @Override // java.lang.Runnable
                public final void run() {
                    RunnableC7563 runnableC7564 = runnableC7563;
                    C7625 c7625M47408 = c21030M13353.m47408();
                    try {
                        if (c7625M47408 == null) {
                            return;
                        }
                        try {
                            runnableC7564.m20083();
                            c7625M47408.close();
                        } catch (IOException e) {
                            c7625M47408.m20153(e);
                            c7625M47408.close();
                        } catch (Error e2) {
                            e = e2;
                            c7625M47408.m20153(e);
                            throw e;
                        } catch (RuntimeException e3) {
                            e = e3;
                            c7625M47408.m20153(e);
                            throw e;
                        }
                    } catch (Throwable th) {
                        c7625M47408.close();
                        throw th;
                    }
                }
            }, this.f16886, 200L);
            return;
        }
        if (this.f66134 || strArr.length == 0) {
            return;
        }
        final C19641 c19641 = new C19641();
        c19641.m44756(this.f16884, strArr);
        if (Looper.myLooper() != Looper.getMainLooper()) {
            C16737.m39273(new Runnable() { // from class: l.ܺ۟ۖ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51125.m46063(interfaceC3800M28083, c19641);
                }
            });
            return;
        }
        C18998 c18998 = this.f66141;
        if (c18998 != null) {
            c18998.f61489.m44756(this.f16884, strArr);
        }
        m46063(interfaceC3800M28083, c19641);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m46063(final InterfaceC3800 interfaceC3800, final C19641 c19641) {
        FutureC12075 futureC12075M30001;
        if (this.f66134) {
            return;
        }
        if (this.f66132 != null) {
            this.f66136.m44757(c19641);
            futureC12075M30001 = this.f66132.m21170().m30018((InterfaceC20892) new C10927());
        } else {
            futureC12075M30001 = FutureC12075.m30001(Boolean.FALSE);
        }
        if (this.f66151 != null && this.f66148 == null && this.f66146) {
            return;
        }
        final C20346 c20346M45910 = C20346.m45910(interfaceC3800);
        final C13312 c13312 = C1316.f5607;
        this.f66133 = FutureC12075.m30006(this.f66133, futureC12075M30001.m30028(new InterfaceC15954() { // from class: l.᩻ۤۖ
            @Override // l.InterfaceC15954
            public final Object apply(Object obj) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                C20346 c20346 = c20346M45910;
                if (zBooleanValue) {
                    c20346.m45914((Throwable) null);
                    return FutureC12075.m30001(null);
                }
                FutureC12075 futureC12075M45913 = c20346.m45913();
                final C20409 c20409 = this.f76545;
                final InterfaceC3800 interfaceC3801 = interfaceC3800;
                final C19641 c19642 = c19641;
                final C13312 c13313 = c13312;
                return futureC12075M45913.m30031(new Runnable() { // from class: l.ۨ۟ۖ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C20409.m46075(c20409, interfaceC3801, c19642, c13313);
                    }
                }, c13313.f44190);
            }
        }).m30016(new InterfaceC7486() { // from class: l.ܳۤۖ
            @Override // l.InterfaceC7486
            /* JADX INFO: renamed from: ܰ */
            public final void mo2142(Object obj, Throwable th) {
                C0652 c0652;
                c20346M45910.m45914((Throwable) null);
                if (th == null || (c0652 = this.f47403.f16882) == null) {
                    return;
                }
                c0652.m2969(th);
            }
        }));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46075(C20409 c20409, InterfaceC3800 interfaceC3800, C19641 c19641, C13312 c13312) {
        if (c20409.f66134) {
            return;
        }
        try {
            C14393.m34634(interfaceC3800, c19641, c13312);
        } catch (IOException e) {
            throw new C17013(e);
        }
    }

    @Override // l.AbstractC4802
    /* JADX INFO: renamed from: ᩵ */
    public final void mo13355() {
        if (!C4138.m11771(C11153.m28083(m13348(), C12974.of(C2417.m7342().mo33986(), new String[0]))) && this.f66132 == null && this.f66151 == null) {
            AbstractC20745 abstractC20745M7343 = C2417.m7343(m13348());
            C4716.m13053().removeCallbacksAndMessages(this.f16886);
            C21030 c21030M13353 = m13353();
            RunnableC7563 runnableC7563 = new RunnableC7563(abstractC20745M7343, this.f16884, c21030M13353.f68493);
            C7625 c7625M47408 = c21030M13353.m47408();
            try {
                if (c7625M47408 == null) {
                    return;
                }
                try {
                    runnableC7563.m20083();
                    c7625M47408.close();
                } catch (IOException e) {
                    c7625M47408.m20153(e);
                    c7625M47408.close();
                } catch (Error e2) {
                    e = e2;
                    c7625M47408.m20153(e);
                    throw e;
                } catch (RuntimeException e3) {
                    e = e3;
                    c7625M47408.m20153(e);
                    throw e;
                }
            } catch (Throwable th) {
                c7625M47408.close();
                throw th;
            }
        }
    }

    @Override // l.AbstractC4802, l.ComponentCallbacksC22654
    public final void onPause() {
        super.onPause();
        ((ActivityC11632) requireActivity()).m31015();
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0090 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0092  */
    /* JADX WARN: Code duplicated, block: B:48:0x0098  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:52:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c9  */
    @Override // l.ComponentCallbacksC22654
    public final void onDestroyView() {
        C6111 c6111;
        C6111 c6112;
        C18292 c18292 = this.f66137;
        if (c18292 != null) {
            c18292.m42500(new CancellationException("Saving view was destroyed"));
        }
        this.f66149 = null;
        super.onDestroyView();
        if (this.f66132 == null && this.f66151 != null && this.f66148 == null) {
            m46086(true);
        }
        C8352 c8352 = this.f66148;
        if (c8352 != null) {
            c8352.m21869();
        }
        this.f66146 = false;
        this.f66124 = null;
        if (this.f66153 != null) {
            this.f66125.m16922(false);
            this.f66125.m16877(this.f66153);
            this.f66153 = null;
            if (this.f66148 == null && this.f66132 == null && this.f66141 == null) {
                this.f16887.m18553(this, false);
            }
        }
        C8042 c8042 = this.f66132;
        if (c8042 != null) {
            c8042.m21176();
        }
        C20556 c20556 = this.f66135;
        if (c20556 != null && (c8352 == null || c8352.f28950 != this.f66125)) {
            c20556.m46365();
        }
        DialogInterfaceC19356 dialogInterfaceC19356 = this.f66140;
        if (dialogInterfaceC19356 != null && dialogInterfaceC19356.m44375()) {
            dialogInterfaceC19356.dismiss();
        }
        this.f66140 = null;
        C6111 c6113 = this.f66125;
        if (c6113 != null) {
            c6113.m16885((C23565) null);
            if (c8352 != null) {
                C6111 c6114 = c8352.f28950;
                C6111 c6115 = this.f66125;
                if (c6114 == c6115) {
                    c6115.m16865((InterfaceC8228) null);
                    this.f66125.m16884((InterfaceC22091) null);
                } else if (c8042 != null) {
                    c6111 = c8042.f28152;
                    c6112 = this.f66125;
                    if (c6111 == c6112) {
                        c6112.m16865((InterfaceC8228) null);
                        this.f66125.m16884((InterfaceC22091) null);
                    } else if (this.f66125.m17000() instanceof C16408) {
                        this.f66125.m16865((InterfaceC8228) null);
                        this.f66125.m16884((InterfaceC22091) null);
                        this.f66125.mo16989((CharSequence) "");
                    } else if (this.f66125.m17000().mo8731()) {
                        final C0652 c0652 = this.f16882;
                        m13353().m47407(this.f66125.m17000(), C4716.f16635).m30016(new InterfaceC7486() { // from class: l.ᩴۤۖ
                            @Override // l.InterfaceC7486
                            /* JADX INFO: renamed from: ܰ */
                            public final void mo2142(Object obj, Throwable th) {
                                C0652 c0653;
                                if (th == null || (c0653 = c0652) == null) {
                                    return;
                                }
                                c0653.m2969(th);
                            }
                        });
                    }
                } else if (this.f66125.m17000() instanceof C16408) {
                    this.f66125.m16865((InterfaceC8228) null);
                    this.f66125.m16884((InterfaceC22091) null);
                    this.f66125.mo16989((CharSequence) "");
                } else if (this.f66125.m17000().mo8731()) {
                    final C0652 c0653 = this.f16882;
                    m13353().m47407(this.f66125.m17000(), C4716.f16635).m30016(new InterfaceC7486() { // from class: l.ᩴۤۖ
                        @Override // l.InterfaceC7486
                        /* JADX INFO: renamed from: ܰ */
                        public final void mo2142(Object obj, Throwable th) {
                            C0652 c0654;
                            if (th == null || (c0654 = c0653) == null) {
                                return;
                            }
                            c0654.m2969(th);
                        }
                    });
                }
            } else if (c8042 != null) {
                c6111 = c8042.f28152;
                c6112 = this.f66125;
                if (c6111 == c6112) {
                    c6112.m16865((InterfaceC8228) null);
                    this.f66125.m16884((InterfaceC22091) null);
                } else if (this.f66125.m17000() instanceof C16408) {
                    this.f66125.m16865((InterfaceC8228) null);
                    this.f66125.m16884((InterfaceC22091) null);
                    this.f66125.mo16989((CharSequence) "");
                } else if (this.f66125.m17000().mo8731()) {
                    final C0652 c0654 = this.f16882;
                    m13353().m47407(this.f66125.m17000(), C4716.f16635).m30016(new InterfaceC7486() { // from class: l.ᩴۤۖ
                        @Override // l.InterfaceC7486
                        /* JADX INFO: renamed from: ܰ */
                        public final void mo2142(Object obj, Throwable th) {
                            C0652 c0655;
                            if (th == null || (c0655 = c0654) == null) {
                                return;
                            }
                            c0655.m2969(th);
                        }
                    });
                }
            } else if (this.f66125.m17000() instanceof C16408) {
                this.f66125.m16865((InterfaceC8228) null);
                this.f66125.m16884((InterfaceC22091) null);
                this.f66125.mo16989((CharSequence) "");
            } else if (this.f66125.m17000().mo8731()) {
                final C0652 c0655 = this.f16882;
                m13353().m47407(this.f66125.m17000(), C4716.f16635).m30016(new InterfaceC7486() { // from class: l.ᩴۤۖ
                    @Override // l.InterfaceC7486
                    /* JADX INFO: renamed from: ܰ */
                    public final void mo2142(Object obj, Throwable th) {
                        C0652 c0656;
                        if (th == null || (c0656 = c0655) == null) {
                            return;
                        }
                        c0656.m2969(th);
                    }
                });
            }
        }
        this.f66147 = null;
        this.f66144 = 0;
        this.f66150 = null;
        this.f66125 = null;
        this.f66135 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m46073(C20409 c20409, InterfaceMenuC1957 interfaceMenuC1957, MenuItem menuItem, MenuItem menuItem2, MenuItem menuItem3, Boolean bool) {
        C2063 c2063;
        interfaceMenuC1957.findItem(R.id.MT_Protector).setTitle(bool.booleanValue() ? R.string.MT_Protector : R.string.MT_Protector);
        boolean zBooleanValue = bool.booleanValue();
        int i = R.string.MT_Protector;
        if (zBooleanValue) {
            menuItem.setVisible(false);
            c20409.f16887.m18562(c20409.m46094());
            c20409.f16887.m18573(false);
            menuItem2.setTitle(R.string.MT_Protector);
        } else {
            menuItem.setVisible(true);
            menuItem.setTitle(R.string.MT_Protector);
            String lowerCase = c20409.m13346().m31432().toLowerCase();
            boolean zEquals = lowerCase.equals(".smali");
            boolean zEquals2 = lowerCase.equals(".jasm");
            c20409.f16887.m18562(zEquals || zEquals2);
            c20409.f16887.m18573(zEquals);
            if (!zEquals2) {
                i = R.string.MT_Protector;
            }
            menuItem2.setTitle(i);
        }
        if (bool.booleanValue() && (c2063 = c20409.f66123) != null && c2063.m6571() && c20409.f66123.f7654 > 0) {
            menuItem3.setVisible(true);
            C6919 c6919 = c20409.f16887;
            C6037 c6037 = c20409.f66123.f7653;
            c6919.m18557((c6037 == null || c6037.m16369() == null || !ActivityC11632.m29003()) ? false : true);
            return;
        }
        menuItem3.setVisible(false);
    }

    @Override // l.ComponentCallbacksC22654
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        String name;
        C17215 c17215;
        int i = 1;
        if (this.f16887.m18540()) {
            return true;
        }
        this.f66125.m16915();
        int itemId = menuItem.getItemId();
        final int i2 = 0;
        z = false;
        boolean z = false;
        if (itemId == R.id.more) {
            menuItem.getSubMenu().findItem(R.id.MT_Protector).setChecked(this.f66125.m16999());
            menuItem.getSubMenu().findItem(R.id.MT_Protector).setVisible("HTML".equalsIgnoreCase(this.f66135.m46376()) || "Markdown".equalsIgnoreCase(this.f66135.m46376()));
            MenuItem menuItemFindItem = menuItem.getSubMenu().findItem(R.id.MT_Protector);
            if (this.f66125.m16912() == null) {
                menuItemFindItem.setVisible(false);
            } else {
                menuItemFindItem.setVisible(true);
                if (C1709.m5693() && ApplicationC0716.f2992.getBoolean("cc", true)) {
                    z = true;
                }
                menuItemFindItem.setChecked(z);
            }
            this.f16887.m18572(this.f66125.m17025());
            this.f16887.m18539(this.f66125.m16932());
            if (m46098()) {
                menuItem.getSubMenu().findItem(R.id.MT_Protector).setVisible(C23428.m51593((GetChars) this.f66125.m17000()));
                return true;
            }
            menuItem.getSubMenu().findItem(R.id.MT_Protector).setVisible(m46113());
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            if (!m13338()) {
                m46132(-1, false, true);
                return true;
            }
            C8067 c8067BuildDialog = ((ActivityC11632) requireActivity()).buildDialog();
            c8067BuildDialog.m21274(R.string.MT_Protector);
            c8067BuildDialog.m21253(R.string.MT_Protector);
            c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterfaceOnClickListenerC22880(i, this));
            c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c8067BuildDialog.m21269();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            ActivityC11632 activityC11632 = (ActivityC11632) requireActivity();
            if (!m13338()) {
                activityC11632.m29016(this);
                return true;
            }
            C8067 c8067BuildDialog2 = activityC11632.buildDialog();
            c8067BuildDialog2.m21277(m46151());
            c8067BuildDialog2.m21253(R.string.MT_Protector);
            c8067BuildDialog2.m21251(R.string.MT_Protector, new DialogInterfaceOnClickListenerC20804(this, activityC11632, i2));
            c8067BuildDialog2.m21275(R.string.MT_Protector, new DialogInterfaceOnClickListenerC15866(this, activityC11632, i2));
            c8067BuildDialog2.m21269();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            this.f66135.m46366();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            this.f66135.m46368(ActivityC23148.class);
            return true;
        }
        if (itemId == R.id.MT_Protector || itemId == R.id.MT_Protector) {
            m46150();
            m13345();
            DialogInterfaceOnClickListenerC14147.m34220(R.string.MT_Protector, (ActivityC11632) requireActivity(), "menu_keep_in_editor_tip");
            return true;
        }
        if (m13344()) {
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            int i3 = C22037.f71434;
            String[] strArr = new String[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                strArr[i4] = C22037.m48955(i4);
            }
            final int[] iArr = {this.f66123.f7652};
            C8067 c8067BuildDialog3 = ((ActivityC11632) requireActivity()).buildDialog();
            c8067BuildDialog3.m21274(R.string.MT_Protector);
            c8067BuildDialog3.m21266(strArr, this.f66123.f7652, new DialogInterfaceOnClickListenerC15867(i, iArr));
            c8067BuildDialog3.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۤۤۖ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i5) {
                    C20409.m46084(this.f34888, iArr, dialogInterface);
                }
            });
            c8067BuildDialog3.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c8067BuildDialog3.m21269();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            ActivityC11632 activityC11633 = (ActivityC11632) requireActivity();
            if (!m13356() || (c17215 = this.f66131) == null) {
                m46139(activityC11633, (ResultCallback) null);
                return true;
            }
            this.f66128 = null;
            c17215.m40156(null, R.string.MT_Protector, m13346().f53983.getName(), Bundle.EMPTY);
            return true;
        }
        Bundle bundle = this.f16884;
        if (itemId == R.id.MT_Protector) {
            AbstractC20745 abstractC20745 = m13346().f53983;
            String string = bundle.getString("save_as_path");
            if (string == null) {
                string = abstractC20745.getParent();
            }
            this.f66128 = null;
            this.f66131.m40156(string, R.string.MT_Protector, abstractC20745.getName(), Bundle.EMPTY);
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            C16881 c16881M13346 = m13346();
            String string2 = bundle.getString("save_as_path");
            if (string2 == null) {
                string2 = c16881M13346.f53983.getParent();
            }
            C23566 c23566 = this.f66127;
            String str = c16881M13346.m31431() + "_plain" + c16881M13346.m31432();
            c23566.getClass();
            C23566.m51965(c23566, R.string.MT_Protector, string2, str, (String[]) null, 24);
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            int i5 = C22037.f71434;
            String[] strArr2 = new String[i5];
            for (int i6 = 0; i6 < i5; i6++) {
                strArr2[i6] = C22037.m48955(i6);
            }
            C8067 c8067BuildDialog4 = ((ActivityC11632) requireActivity()).buildDialog();
            c8067BuildDialog4.m21274(R.string.MT_Protector);
            c8067BuildDialog4.m21266(strArr2, this.f66123.f7652, new DialogInterface.OnClickListener() { // from class: l.֫ۤۖ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i7) {
                    C20409.m46107(this.f6885, dialogInterface, i7);
                }
            });
            c8067BuildDialog4.m21251(R.string.MT_Protector, null);
            c8067BuildDialog4.m21269();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            String[] strArr3 = {"Windows (CRLF)", "MacOS (CR)", "Unix-like (LF)"};
            final String[] strArr4 = {"\r\n", "\r", "\n"};
            String strM17042 = this.f66125.m17042();
            strM17042.getClass();
            if (strM17042.equals("\r")) {
                i2 = 1;
            } else if (!strM17042.equals("\r\n")) {
                i2 = 2;
            }
            C8067 c8067BuildDialog5 = ((ActivityC11632) requireActivity()).buildDialog();
            c8067BuildDialog5.m21274(R.string.MT_Protector);
            c8067BuildDialog5.m21266(strArr3, i2, new DialogInterface.OnClickListener() { // from class: l.ۛۤۖ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i7) {
                    C20409 c20409 = this.f20353;
                    if (i7 != i2) {
                        c20409.f66125.m16825(strArr4[i7]);
                        c20409.f66125.m17057(true);
                    } else {
                        c20409.getClass();
                    }
                    dialogInterface.dismiss();
                }
            });
            c8067BuildDialog5.m21251(R.string.MT_Protector, null);
            c8067BuildDialog5.m21269();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            C2063 c2063 = this.f66123;
            if (c2063 == null) {
                return true;
            }
            m46102(c2063.f7652);
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            C6111 c6111 = this.f66125;
            c6111.m17065(!c6111.m17004());
            this.f16887.m18542(this.f66125.m17004());
            this.f66135.m46378();
            if (!this.f66146) {
                return true;
            }
            this.f66150.m39492();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            if (this.f66123.f7653.m16369() == null) {
                ((ActivityC11632) requireActivity()).m30996(R.string.MT_Protector, R.string.MT_Protector, false);
                return true;
            }
            ActivityC11632 activityC11634 = (ActivityC11632) requireActivity();
            int i7 = DialogInterfaceC19356.f62401;
            C8067 c8067 = new C8067(activityC11634);
            c8067.m21274(R.string.MT_Protector);
            c8067.m21253(R.string.MT_Protector);
            c8067.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c8067.m21251(R.string.MT_Protector, new DialogInterfaceOnClickListenerC17981(this, menuItem, i2));
            c8067.m21269();
            return true;
        }
        try {
            if (itemId == R.id.MT_Protector) {
                C11018 c11018 = new C11018();
                String string3 = this.f66125.m17000().toString();
                C4344 c4344 = new C4344(this.f66123.f7653);
                c4344.m12180(this.f66123.f7649);
                c4344.m12182(this.f66123.f7651);
                c4344.m12179(string3);
                c4344.m12181(c11018);
                Intent intent = new Intent((ActivityC11632) requireActivity(), (Class<?>) ActivityC0673.class);
                intent.putExtra(e.m, c11018.m27789());
                AbstractC20745 abstractC20746 = this.f66123.f7650;
                if (abstractC20746 != null) {
                    intent.putExtra("arscPath", abstractC20746.mo33986());
                }
                startActivity(intent);
                return true;
            }
            if (itemId == R.id.MT_Protector) {
                if (m13356()) {
                    C15829.m37611(R.string.MT_Protector);
                    return true;
                }
                C20889 c20889M17712 = C6508.m17712(this.f66125.m17000().toString(), (String) null);
                C11018 c11019 = new C11018();
                c11019.mo24508(o.a.h);
                c20889M17712.mo18446(c11019);
                String strM46958 = c20889M17712.m46958();
                C11904.f39939.m46690(strM46958 + ".mtsx.bin").m46697(c11019);
                Intent intent2 = new Intent((ActivityC11632) requireActivity(), (Class<?>) ActivityC11591.class);
                intent2.putExtra("syntaxName", c20889M17712.m46958());
                intent2.setData(C5553.m15313(m13346().f53983.mo33986() + "_preview", new String[0]).m46732());
                startActivity(intent2);
                return true;
            }
            if (itemId == R.id.MT_Protector) {
                ActivityC11632 activityC11635 = (ActivityC11632) requireActivity();
                InterfaceC2916 interfaceC2916M17000 = this.f66125.m17000();
                String strM17043 = this.f66125.m17042();
                boolean zM13356 = m13356();
                AbstractC20745 abstractC20747 = m13346().f53983;
                String strMo33986 = zM13356 ? null : abstractC20747.mo33986();
                String name2 = abstractC20747.getName();
                boolean zEqualsIgnoreCase = "Markdown".equalsIgnoreCase(this.f66135.m46376());
                boolean zM38190 = C16135.m38190(activityC11635);
                int iM16843 = zEqualsIgnoreCase ? this.f66125.m16843() : 0;
                boolean z2 = (zEqualsIgnoreCase || strMo33986 == null || (name = abstractC20747.getName()) == null || !".mhtml".equalsIgnoreCase(AbstractC20745.m46686(name))) ? false : true;
                new C1358(this, z2 ? this.f66123.f7652 : C22037.f71424, interfaceC2916M17000, strM17043, activityC11635, z2, zEqualsIgnoreCase, iM16843, name2, zM38190, strMo33986).m10243();
                return true;
            }
            if (itemId == R.id.MT_Protector) {
                m46128();
                return true;
            }
            if (itemId == R.id.MT_Protector) {
                new C4475((ActivityC11632) requireActivity(), C4475.m12493(this.f66125));
                return true;
            }
            if (itemId != R.id.MT_Protector) {
                if (itemId != R.id.MT_Protector) {
                    this.f66135.m46383(menuItem);
                    return true;
                }
                if (m46098()) {
                    new C13354(this, (ActivityC11632) requireActivity(), m13348(), C11904.f39938.m46690("xmlTrans")).m10243();
                    return true;
                }
                if (!m46113()) {
                    throw new RuntimeException();
                }
                new C4180(this, (ActivityC11632) requireActivity(), m13348(), C11904.f39938.m46690("jsonTrans")).m10243();
                return true;
            }
            if (!C1709.m5692()) {
                C15829.m37611(R.string.MT_Protector);
                new ViewOnClickListenerC19680((ActivityC11632) requireActivity());
                return true;
            }
            if (!C1709.m5693()) {
                C15829.m37611(R.string.MT_Protector);
                return true;
            }
            if (this.f66125.m16912() == null) {
                return true;
            }
            menuItem.setChecked(!menuItem.isChecked());
            ApplicationC0716.f2992.edit().putBoolean("cc", menuItem.isChecked()).apply();
            return true;
        } catch (Exception e) {
            m46062(e, (ActivityC11632) null);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void m46096() {
        if (this.f66139 == 0 || !isVisible() || m13344()) {
            return;
        }
        int i = 0;
        if (!this.f66146 || !this.f66138) {
            C16737.m39274(new RunnableC13043(i, this), 100L);
            return;
        }
        if (!m46098()) {
            if (m46113()) {
                AbstractC20745 abstractC20745M46690 = C11904.f39938.m46690("jsonTrans");
                if (!abstractC20745M46690.mo33975() || abstractC20745M46690.mo33991() == this.f66139) {
                    this.f66139 = 0L;
                    return;
                }
                try {
                    C15676 c15676M22397 = AbstractC8620.m22397(abstractC20745M46690.m46730(), EnumC9326.OrderedField);
                    if (m13348().equals(c15676M22397.m37351("<--id-c5skl23kjndf-->"))) {
                        C5975.m16273(c15676M22397, this.f66125);
                        this.f66125.m16886(false);
                    }
                } catch (Exception unused) {
                } finally {
                    this.f66139 = 0L;
                }
                return;
            }
            return;
        }
        AbstractC20745 abstractC20745M46691 = C11904.f39938.m46690("xmlTrans");
        if (!abstractC20745M46691.mo33975() || abstractC20745M46691.mo33991() == this.f66139) {
            this.f66139 = 0L;
            return;
        }
        try {
            C15676 c15676M22398 = AbstractC8620.m22397(abstractC20745M46691.m46730(), EnumC9326.OrderedField);
            if (m13348().equals(c15676M22398.m37351("<--id-c5skl23kjndf-->"))) {
                C23428.m51592(c15676M22398, this.f66125.m17000());
                this.f66125.m16886(false);
            }
        } catch (Exception unused2) {
        } finally {
            this.f66139 = 0L;
        }
    }

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    private boolean m46098() {
        C6111 c6111 = this.f66125;
        return (c6111 != null && DocumentReader.RESERVED.equalsIgnoreCase(c6111.m17002())) || m13346().f53983.getName().toLowerCase().endsWith(".xml");
    }

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    private boolean m46113() {
        C6111 c6111 = this.f66125;
        return (c6111 != null && "json".equalsIgnoreCase(c6111.m17002())) || m13346().f53983.getName().toLowerCase().endsWith(".json");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public void m46128() {
        if (!this.f66138) {
            C16737.m39274(new RunnableC7003(this, C23229.m51233(getViewLifecycleOwner())), 100L);
            return;
        }
        String lowerCase = m13346().m31432().toLowerCase();
        if (!m46094() && !lowerCase.equals(".jasm")) {
            if (lowerCase.equals(".smali")) {
                new C20016(this, (ActivityC11632) requireActivity()).m10243();
                return;
            }
            return;
        }
        new C0259(this, (ActivityC11632) requireActivity()).m10243();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m46077(C20409 c20409, C6111 c6111, boolean z, AtomicBoolean atomicBoolean, Point point, Point point2, C14393 c14393, Throwable th) {
        if (c20409.f66146 && c20409.f66125 == c6111) {
            if (th != null) {
                Throwable cause = th;
                while ((cause instanceof C17013) && cause.getCause() != null) {
                    cause = cause.getCause();
                }
                if (cause instanceof CancellationException) {
                    return;
                }
                c20409.m13347(true);
                c20409.f66125.m17065(true);
                c20409.f16882.m2969(th);
                c20409.f66138 = true;
                return;
            }
            c20409.m46124(z);
            if (atomicBoolean.get()) {
                c20409.m46088();
            }
            if (z || point == null || point.x == -1) {
                return;
            }
            new C5550(c20409, c14393, point, point2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46142(final boolean z, final int i, final Point point, final Point point2) {
        C6919 c6919;
        String name;
        C13914 c13914M15084;
        final C12175 c12175;
        byte[] bArr;
        byte[] bArr2;
        if (this.f16887 != null && Looper.myLooper() == Looper.getMainLooper()) {
            this.f16887.m18546(this);
        }
        if (Looper.myLooper() == Looper.getMainLooper() && this.f66146 && this.f66125 != null && this.f66135 != null && (c6919 = this.f16887) != null && ((!c6919.m18540() || this.f66153 != null) && !this.f66125.m16973() && this.f66132 == null && this.f66148 == null && this.f66151 == null && this.f66147 == null)) {
            final C13312 c13312 = C1316.f5607;
            final InterfaceC3800 interfaceC3800Of = C12974.of(C2417.m7342().mo33986(), new String[0]);
            final String strM13348 = m13348();
            final C6111 c6111 = this.f66125;
            final C16881 c16881M13346 = m13346();
            final boolean zM13356 = m13356();
            boolean zM46050 = m46050();
            Bundle bundle = this.f16884;
            final boolean z2 = zM46050 || m46114() || m46094() || bundle.getBoolean("forceTryAXml") || bundle.getBoolean("forceTryClass");
            final InterfaceC3800 interfaceC3800M28083 = C11153.m28083(strM13348, interfaceC3800Of);
            boolean z3 = (C4138.m11771(interfaceC3800M28083) || m13357().mo33975()) ? false : true;
            final Bundle bundle2 = new Bundle(bundle);
            int i2 = SharedPreferencesOnSharedPreferenceChangeListenerC15618.f50785;
            bundle2.putInt("textPageSize", C16737.f53615.getInt("text_page_size", 50000000));
            if (z3) {
                try {
                    C20556 c20556 = this.f66135;
                    if (bundle.getBoolean("forceTryAXml")) {
                        name = ".xml";
                    } else {
                        name = bundle.getBoolean("forceTryClass") ? ".class" : c16881M13346.f53983.getName();
                    }
                    c20556.m46369(name);
                    C12175 c12175M17011 = c6111.m17011();
                    C11018 c11018 = new C11018();
                    C11018 c11019 = new C11018();
                    this.f66135.m46381(c11018);
                    this.f66135.m46372(c11019);
                    byte[] bArrM27773 = c11018.m27773();
                    byte[] bArrM27774 = c11019.m27773();
                    c13914M15084 = zM13356 ? C5446.m15084() : null;
                    c12175 = c12175M17011;
                    bArr = bArrM27773;
                    bArr2 = bArrM27774;
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            } else {
                c12175 = null;
                bArr = null;
                bArr2 = null;
                c13914M15084 = null;
            }
            C4716.m13053().removeCallbacksAndMessages(this.f16886);
            final FutureC12075 futureC12075M47406 = m13353().m47406();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(!z);
            final boolean z4 = z3;
            final byte[] bArr3 = bArr;
            final byte[] bArr4 = bArr2;
            final C13914 c13914 = c13914M15084;
            C8042 c8042 = new C8042(this, new InterfaceC18625() { // from class: l.ۙ۟ۖ
                /* JADX WARN: Code duplicated, block: B:67:0x0116  */
                /* JADX WARN: Code duplicated, block: B:69:0x011a  */
                /* JADX WARN: Code duplicated, block: B:71:0x011e  */
                /* JADX WARN: Code duplicated, block: B:73:0x0121  */
                /* JADX WARN: Code duplicated, block: B:75:0x0129  */
                /* JADX WARN: Code duplicated, block: B:77:0x012c  */
                @Override // l.InterfaceC18625
                /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                public final C14393 mo12537(InterfaceC5614 interfaceC5614) throws Throwable {
                    String str;
                    C14393 c14393M11769;
                    C14393 c14393;
                    Throwable th;
                    C14393 c14394;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    boolean z5 = zM13356;
                    boolean z6 = z2;
                    futureC12075M47406.m30027();
                    boolean z7 = z4;
                    InterfaceC3800 interfaceC3800 = interfaceC3800M28083;
                    C13312 c13313 = c13312;
                    InterfaceC3800 interfaceC3801 = interfaceC3800Of;
                    String str2 = strM13348;
                    if (!z7 || C4138.m11771(interfaceC3800) || this.f15975.m13357().mo33975()) {
                        str = str2;
                        c14393M11769 = C4138.m11769(interfaceC3801, str, c13313, interfaceC5614);
                    } else {
                        str = str2;
                        c14393M11769 = C10469.m26450(interfaceC3800, bundle2, c12175, bArr3, bArr4, c13914, c13313, interfaceC5614);
                    }
                    C14393 c14395 = c14393M11769;
                    boolean z8 = z;
                    C16881 c16881 = c16881M13346;
                    int i3 = i;
                    try {
                        try {
                            if (!z8) {
                                int i4 = SharedPreferencesOnSharedPreferenceChangeListenerC15618.f50785;
                                c14395.m34647(C16737.f53615.getInt("text_page_size", 50000000));
                                InterfaceC3800 interfaceC3800M28084 = C11153.m28083(str, interfaceC3801);
                                Point point3 = point;
                                Point point4 = point2;
                                return c14395.m34646(interfaceC3800M28084, c16881, z5, z6, i3, point3 == null ? 0 : point4.x, point3 == null ? 0 : point4.y, c13313, interfaceC5614, (point3 == null || point3.x == -1) ? false : true);
                            }
                            Bundle bundleM21760 = c14395.f47156.f37855.f77154.m21760();
                            atomicBoolean2.set(bundleM21760.getBoolean("e2SourcePending"));
                            String string = bundleM21760.getString("filePath");
                            if (string == null) {
                                throw new IOException("Session source path is missing");
                            }
                            try {
                                return c14395.m34645(interfaceC3800, string.equals(c16881.f53983.mo33986()) ? c16881 : new C16881(C5553.m15313(string, new String[0])), bundleM21760.getBoolean("forceTryAXml") || bundleM21760.getBoolean("forceTryClass"), i3, c13313, interfaceC5614, true);
                            } catch (Error | Exception e2) {
                                th = e2;
                                c14394 = c14395;
                                try {
                                    c14394.m34643().m30027();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                if (!(th instanceof IOException)) {
                                    throw ((IOException) th);
                                }
                                if (!(th instanceof RuntimeException)) {
                                    throw ((RuntimeException) th);
                                }
                                if (th instanceof Error) {
                                    throw ((Error) th);
                                }
                                throw new IOException("Session source reload failed", th);
                            }
                        } catch (Error | Exception e3) {
                            e = e3;
                            c14393 = interfaceC3800;
                            th = e;
                            c14394 = c14393;
                            c14394.m34643().m30027();
                            if (!(th instanceof IOException)) {
                                throw ((IOException) th);
                            }
                            if (!(th instanceof RuntimeException)) {
                                throw ((RuntimeException) th);
                            }
                            if (th instanceof Error) {
                                throw ((Error) th);
                            }
                            throw new IOException("Session source reload failed", th);
                        }
                    } catch (Error e4) {
                        e = e4;
                        c14393 = c14395;
                        th = e;
                        c14394 = c14393;
                        c14394.m34643().m30027();
                        if (!(th instanceof IOException)) {
                            throw ((IOException) th);
                        }
                        if (!(th instanceof RuntimeException)) {
                            throw ((RuntimeException) th);
                        }
                        if (th instanceof Error) {
                            throw ((Error) th);
                        }
                        throw new IOException("Session source reload failed", th);
                    } catch (Exception e5) {
                        e = e5;
                        c14393 = c14395;
                        th = e;
                        c14394 = c14393;
                        c14394.m34643().m30027();
                        if (!(th instanceof IOException)) {
                            throw ((IOException) th);
                        }
                        if (!(th instanceof RuntimeException)) {
                            throw ((RuntimeException) th);
                        }
                        if (th instanceof Error) {
                            throw ((Error) th);
                        }
                        throw new IOException("Session source reload failed", th);
                    }
                }
            }, 8388608);
            c8042.f28156 = z || point == null || point.x == -1;
            FutureC12075 futureC12075M46057 = m46057(c8042, c13312.f44190, interfaceC3800M28083);
            if (z && !z3) {
                c8042.m21172(strM13348, interfaceC3800M28083);
            }
            futureC12075M46057.m30016(new InterfaceC7486() { // from class: l.ܰ۟ۖ
                @Override // l.InterfaceC7486
                /* JADX INFO: renamed from: ܰ */
                public final void mo2142(Object obj, Throwable th) {
                    C20409.m46077(this.f45062, c6111, z, atomicBoolean, point, point2, (C14393) obj, th);
                }
            });
            return;
        }
        throw new IllegalStateException("Fragment session loading requires an idle foreground view");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private FutureC12075 m46057(C8042 c8042, Executor executor, InterfaceC3800 interfaceC3800) {
        C15990 c15990M16810 = this.f66153;
        if (c15990M16810 == null) {
            c15990M16810 = this.f66125.m16810();
        }
        c8042.f28176 = c15990M16810;
        this.f66153 = null;
        this.f66132 = c8042;
        this.f66149 = c8042.m21170();
        this.f16887.m18553(this, true);
        if (interfaceC3800 == null) {
            c8042.m21173(executor);
        } else {
            c8042.m21174(C20346.m45910(interfaceC3800), executor);
        }
        return c8042.m21170();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46134(C8042 c8042) {
        if (this.f66132 == c8042 && this.f66146 && this.f66125 == c8042.f28152) {
            this.f16887.m18560(this);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46135(C8042 c8042, C14393 c14393, boolean z) {
        if (this.f66132 != c8042) {
            return;
        }
        this.f66132 = null;
        if (z && c8042.m21175()) {
            this.f66151 = c14393;
            this.f66136.m44755(this.f16884);
            this.f66136 = new C19641();
            C11880 c11880 = new C11880(this, c14393, this.f66144);
            this.f66152 = c11880;
            c11880.m29632();
        }
        if (!z && c14393 != null && this.f66147 == c14393.f47165) {
            this.f66147 = null;
            this.f66144 = 0;
        }
        if (this.f66141 != null) {
            return;
        }
        this.f16887.m18553(this, false);
        m46052();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private FutureC12075 m46086(boolean z) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Session close requires the main thread");
        }
        C8352 c8352 = this.f66148;
        if (c8352 != null) {
            return c8352.m21873();
        }
        C18292 c18292 = this.f66137;
        if (c18292 != null) {
            c18292.m42500(new CancellationException("Saving session is closing"));
        }
        C14393 c14393 = this.f66151;
        if (c14393 == null) {
            return FutureC12075.m30001(null);
        }
        C6111 c6111 = this.f66125;
        if (c6111 == null || this.f66135 == null || c6111.m17000() != c14393.f47162) {
            throw new IllegalStateException("Fragment session owner changed before close");
        }
        C11880 c11880 = this.f66152;
        if (c11880 != null) {
            c11880.m29633();
            this.f66152 = null;
        }
        FutureC12075 futureC12075 = new FutureC12075();
        this.f66149 = futureC12075;
        futureC12075.m30021((Throwable) new CancellationException("Saving session is closing"));
        this.f66148 = new C8352(this, c14393, this.f66144, this.f66123, z);
        if (z) {
            this.f16887.m18567(this);
        } else {
            this.f16887.m18553(this, true);
        }
        return this.f66148.m21873();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m46144(C14393 c14393, C6111 c6111) {
        return this.f66146 && this.f66125 == c6111 && this.f66151 == c14393 && this.f66148 == null && this.f66132 == null && c6111.m17000() == c14393.f47162;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C2063 m46148() {
        return this.f66123;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46136(C8352 c8352) {
        if (this.f66148 != c8352) {
            return;
        }
        C14393 c14393 = c8352.f28948;
        if (c14393.f47165.m4636() != null) {
            this.f16882.m2969((Throwable) c14393.f47165.m4636());
        }
        this.f66148 = null;
        if (this.f66151 == c14393) {
            this.f66151 = null;
        }
        if (this.f66147 == c14393.f47165) {
            this.f66147 = null;
            this.f66144 = 0;
        }
        if (this.f66141 != null) {
            return;
        }
        if (this.f66153 == null) {
            this.f16887.m18553(this, false);
        }
        m46052();
    }

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    private void m46052() {
        Runnable runnable = this.f66124;
        C6111 c6111 = this.f66125;
        if (runnable == null || !this.f66146) {
            this.f66124 = null;
        } else {
            C16737.m39273(new RunnableC18986(this, runnable, c6111, 1));
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m46109(C20409 c20409, C6111 c6111, Runnable runnable) {
        if (c20409.f66124 != runnable) {
            return;
        }
        c20409.f66124 = null;
        try {
            try {
                if (c20409.f66146 && c20409.f66125 == c6111) {
                    runnable.run();
                }
                C18292 c18292 = c20409.f66137;
                if (c18292 != null) {
                    c18292.m42501();
                }
            } catch (Throwable th) {
                C18292 c18293 = c20409.f66137;
                if (c18293 != null) {
                    c18293.m42501();
                }
                throw th;
            }
        } catch (Error | RuntimeException e) {
            C18292 c18294 = c20409.f66137;
            if (c18294 != null) {
                c18294.m42500(e);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46137(C8352 c8352, Throwable th) {
        C0652 c0652;
        if (this.f66148 != c8352 || (c0652 = this.f16882) == null) {
            return;
        }
        c0652.m2969(th);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final FutureC12075 m46131(final C14393 c14393, int i, C15990 c15990) {
        C6111 c6111;
        C6111 c6112;
        FutureC12075 futureC12075M16982;
        C6111 c6113 = this.f66125;
        if (c6113 != null) {
            InterfaceC2916 interfaceC2916M17000 = c6113.m17000();
            C16408 c16408 = c14393.f47162;
            if (interfaceC2916M17000 == c16408) {
                C11174 c11174 = c14393.f47156;
                C1295 c1295 = c14393.f47165;
                if (Looper.myLooper() == Looper.getMainLooper() && this.f66146 && (c6111 = this.f66125) != null && this.f66135 != null) {
                    InterfaceC2916 interfaceC2916M17001 = c6111.m17000();
                    if (interfaceC2916M17001 instanceof C16408) {
                        C16408 c16409 = (C16408) interfaceC2916M17001;
                        if (c1295.m4635(c16409.mo8735())) {
                            if (this.f66147 != null) {
                                throw new IllegalStateException("Fragment recovery is already bound");
                            }
                            if (i < 0) {
                                throw new IllegalArgumentException("Negative fragment state limit");
                            }
                            C23874 c23874 = c11174.f37855;
                            c23874.m52612(c16409.mo8735());
                            c16409.mo8735().m4526();
                            Bundle bundleM21760 = c23874.f77154.m21760();
                            C6111 c6114 = this.f66125;
                            C20556 c20556 = this.f66135;
                            c20556.m46373(c23874.f77150, c23874.f77156, c23874.f77151);
                            if (!this.f66146 || this.f66125 != c6114 || this.f66135 != c20556 || c6114.m17000() != c16409) {
                                throw new CancellationException("Fragment owner changed during restoration");
                            }
                            c23874.m52612(c16409.mo8735());
                            if (Looper.myLooper() == Looper.getMainLooper() && (c6112 = this.f66125) != null) {
                                InterfaceC2916 interfaceC2916M17002 = c6112.m17000();
                                if (interfaceC2916M17002 instanceof C16408) {
                                    C16408 c164010 = (C16408) interfaceC2916M17002;
                                    if (c1295.m4635(c164010.mo8735())) {
                                        if (this.f66147 != null) {
                                            throw new IllegalStateException("Fragment persistence is already bound");
                                        }
                                        if (i < 0) {
                                            throw new IllegalArgumentException("Negative fragment state limit");
                                        }
                                        c164010.mo8735().m4526();
                                        this.f66147 = c1295;
                                        this.f66144 = i;
                                        Bundle bundle = this.f16884;
                                        bundle.clear();
                                        bundle.putAll(bundleM21760);
                                        this.f66136.m44755(bundle);
                                        this.f66123 = c11174.f37854;
                                        this.f66126 = m13356();
                                        m46117();
                                        final C6111 c6115 = this.f66125;
                                        final C20556 c20557 = this.f66135;
                                        if (c15990 == null) {
                                            futureC12075M16982 = c6115.m16958(c16408);
                                        } else {
                                            futureC12075M16982 = c6115.m16982(c16408, c15990);
                                        }
                                        return futureC12075M16982.m30014(new Runnable() { // from class: l.۟۟ۖ
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                C20409 c20409 = this.f24307;
                                                if (c20409.f66146) {
                                                    C6111 c6116 = c20409.f66125;
                                                    C6111 c6117 = c6115;
                                                    if (c6116 == c6117 && c20409.f66135 == c20557 && c6117.m17000() == c14393.f47162) {
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

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC19083 m46152() {
        C6111 c6111;
        C6919 c6919 = this.f16887;
        if (c6919 != null && !c6919.m18540() && this.f66146) {
            if (this.f66147 == null && ((c6111 = this.f66125) == null || !(c6111.m17000() instanceof C16408))) {
                C7625 c7625M47408 = m13353().m47408();
                if (c7625M47408 != null) {
                    C6111 c6112 = this.f66125;
                    C20556 c20556 = this.f66135;
                    try {
                        AbstractC20745 abstractC20745M13357 = m13357();
                        if (m13344()) {
                            abstractC20745M13357.mo24647();
                            c7625M47408.close();
                            return null;
                        }
                        if (c6112 == null || c20556 == null) {
                            throw new IllegalStateException("Legacy save view is unavailable");
                        }
                        return new C16488(this, c6112, c20556, c7625M47408, abstractC20745M13357);
                    } catch (Error | RuntimeException e) {
                        c7625M47408.m20153(e);
                        throw e;
                    }
                }
            } else {
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    throw new IllegalStateException("Fragment state capture requires the foreground thread");
                }
                if (!m13344()) {
                    C6111 c6113 = this.f66125;
                    C13638.requireNonNull(c6113);
                    InterfaceC2916 interfaceC2916M17000 = c6113.m17000();
                    if (!(interfaceC2916M17000 instanceof C16408)) {
                        throw new IllegalStateException("Fragment session owner changed before capture");
                    }
                    C16408 c16408 = (C16408) interfaceC2916M17000;
                    C1295 c1295 = this.f66147;
                    if (c1295 == null || !c1295.m4635(c16408.mo8735())) {
                        throw new IllegalStateException("Fragment session persistence is not bound");
                    }
                    C0652 c0652 = this.f16882;
                    C13638.requireNonNull(c0652);
                    try {
                        return new C12255(m46089(), c0652);
                    } catch (IOException | IllegalStateException e2) {
                        c0652.m2969(e2);
                        return null;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public FutureC12075 m46089() {
        C6111 c6111 = this.f66125;
        C13638.requireNonNull(c6111);
        InterfaceC2916 interfaceC2916M17000 = c6111.m17000();
        if (!(interfaceC2916M17000 instanceof C16408)) {
            throw new IllegalStateException("Fragment session owner changed before capture");
        }
        C16408 c16408 = (C16408) interfaceC2916M17000;
        C1295 c1295 = this.f66147;
        if (c1295 == null || !c1295.m4635(c16408.mo8735())) {
            throw new IllegalStateException("Fragment session persistence is not bound");
        }
        C11018 c11018 = new C11018();
        C11018 c11019 = new C11018();
        this.f66135.m46381(c11018);
        this.f66135.m46372(c11019);
        FutureC12075 futureC12075M4634 = c1295.m4634(C17523.m40781(c6111, this.f16884, this.f66123, c11018.m27773(), c11019.m27773(), this.f66144, -1L, null));
        C1254 c1254Mo8735 = c16408.mo8735();
        C13638.requireNonNull(c1254Mo8735);
        return futureC12075M4634.m30028((InterfaceC15954) new C5925(1, c1254Mo8735));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46133(String str, boolean z) {
        C16881 c16881 = new C16881(C5553.m15313(str, new String[0]));
        ActivityC11632 activityC11632 = (ActivityC11632) requireActivity();
        ResultCallback resultCallback = this.f66128;
        this.f66128 = null;
        new C23544(this, activityC11632, c16881, z, resultCallback).m10243();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void m46103(final ActivityC11632 activityC11632) {
        if (m13356() && this.f66131 != null) {
            Bundle bundle = new Bundle();
            bundle.putBoolean(d.A, true);
            this.f66128 = null;
            this.f66131.m40156(null, R.string.MT_Protector, m13346().f53983.getName(), bundle);
            return;
        }
        m46140(activityC11632, new Runnable() { // from class: l.ܶ۟ۖ
            @Override // java.lang.Runnable
            public final void run() {
                C20409 c20409 = this.f49157;
                c20409.getClass();
                activityC11632.m29016(c20409);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m46064(final ActivityC11632 activityC11632, boolean z) {
        View viewM30995 = activityC11632.m30995(R.layout.MT_Protector);
        CheckBox checkBox = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
        checkBox.setChecked(z);
        final RunnableC21426 runnableC21426 = new RunnableC21426(this, checkBox, activityC11632);
        C8067 c8067BuildDialog = activityC11632.buildDialog();
        c8067BuildDialog.m21258(viewM30995);
        c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ᩳ۟ۖ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f56676.m46140(activityC11632, runnableC21426);
            }
        });
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: l.ᩴ۟ۖ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                runnableC21426.run();
            }
        };
        int i = R.string.MT_Protector;
        c8067BuildDialog.m21275(R.string.MT_Protector, onClickListener);
        Button buttonM44374 = c8067BuildDialog.m21269().m44374();
        if (!checkBox.isChecked()) {
            i = R.string.MT_Protector;
        }
        buttonM44374.setText(i);
        checkBox.setOnCheckedChangeListener(new C8021(buttonM44374, 0));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46139(ActivityC11632 activityC11632, ResultCallback resultCallback) {
        if (m13338()) {
            new C14372(this, activityC11632, resultCallback).m10243();
        } else if (resultCallback != null) {
            resultCallback.onSuccess();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46140(ActivityC11632 activityC11632, Runnable runnable) {
        if (!m13338()) {
            runnable.run();
        } else {
            C6111 c6111 = this.f66125;
            m46139(activityC11632, new C1670(this, c6111, c6111 == null ? null : c6111.m17000(), m13346().f53983.mo33986(), runnable));
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Object m46100(Callable callable) {
        Object obj;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return callable.call();
        }
        FutureTask futureTask = new FutureTask(callable);
        C16737.m39273(futureTask);
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
                        throw ((Exception) cause);
                    }
                    if (cause instanceof Error) {
                        throw ((Error) cause);
                    }
                    throw new RuntimeException(cause);
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
    /* JADX WARN: Code duplicated, block: B:52:0x00b6 A[Catch: Error | RuntimeException -> 0x00cb, RuntimeException -> 0x00cd, TryCatch #2 {Error | RuntimeException -> 0x00cb, blocks: (B:50:0x00b0, B:52:0x00b6, B:54:0x00c3, B:55:0x00ca), top: B:64:0x00b0 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00c3 A[Catch: Error | RuntimeException -> 0x00cb, RuntimeException -> 0x00cd, TryCatch #2 {Error | RuntimeException -> 0x00cb, blocks: (B:50:0x00b0, B:52:0x00b6, B:54:0x00c3, B:55:0x00ca), top: B:64:0x00b0 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00d2  */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C23232 m46101(C20409 c20409, C2063 c2063) {
        C6111 c6111;
        InterfaceC2916 interfaceC2916M17000;
        C16881 c16881M13346;
        C14393 c14393;
        C22380 c22380M49631;
        C16408 c16408;
        if (c20409.f66146 && c20409.f66125 != null && c20409.f66148 == null && c20409.f66124 == null && !c20409.f16887.m18540()) {
            FutureC12075 futureC12075 = c20409.f66149;
            if (futureC12075 != null) {
                if (futureC12075.isDone()) {
                    if (((C14393) c20409.f66149.m30027()).f47162 != c20409.f66125.m17000()) {
                        throw new CancellationException("Saving content was replaced after loading");
                    }
                    if (c20409.f66138) {
                        if (!c20409.m13344()) {
                            throw new IllegalStateException("Cannot save failed editor content");
                        }
                        c6111 = c20409.f66125;
                        interfaceC2916M17000 = c6111.m17000();
                        if (interfaceC2916M17000 instanceof C16408) {
                            c16408 = (C16408) interfaceC2916M17000;
                            if (!c16408.mo8735().m4556().m23300()) {
                                if (c16408.mo8735().m4556().m23305() != EnumC19579.LOADING) {
                                    throw new IllegalStateException("Cannot save incomplete source text");
                                }
                            }
                        }
                        c16881M13346 = c20409.m13346();
                        if (c2063 == null) {
                            c2063 = c20409.f66123;
                        }
                        c14393 = c20409.f66151;
                        if (c14393 != null) {
                            c22380M49631 = C22380.m49631(interfaceC2916M17000, c6111.m17042(), c2063, -1, null);
                        } else {
                            c22380M49631 = C22380.m49631(interfaceC2916M17000, c6111.m17042(), c2063, -1, null);
                        }
                        if (c6111.m17000() == interfaceC2916M17000) {
                            throw new IllegalStateException("Editor changed during saving capture");
                        }
                        return new C23232(c20409, c6111, interfaceC2916M17000, c6111.m17041(), c16881M13346, c22380M49631);
                    }
                }
            } else if (c20409.f66138 && c20409.f66123 != null && c20409.f66125.m16820()) {
                if (!c20409.m13344()) {
                    throw new IllegalStateException("Cannot save failed editor content");
                }
                c6111 = c20409.f66125;
                interfaceC2916M17000 = c6111.m17000();
                if (interfaceC2916M17000 instanceof C16408) {
                    c16408 = (C16408) interfaceC2916M17000;
                    if (!c16408.mo8735().m4556().m23300()) {
                        if (c16408.mo8735().m4556().m23305() != EnumC19579.LOADING) {
                            throw new IllegalStateException("Cannot save incomplete source text");
                        }
                    }
                }
                c16881M13346 = c20409.m13346();
                if (c2063 == null) {
                    c2063 = c20409.f66123;
                }
                c14393 = c20409.f66151;
                if (c14393 != null || c14393.f47162 != interfaceC2916M17000) {
                    c22380M49631 = C22380.m49631(interfaceC2916M17000, c6111.m17042(), c2063, -1, null);
                } else {
                    c22380M49631 = C22380.m49633(c14393, c6111.m17042(), c2063);
                }
                try {
                    if (c6111.m17000() == interfaceC2916M17000) {
                        throw new IllegalStateException("Editor changed during saving capture");
                    }
                    return new C23232(c20409, c6111, interfaceC2916M17000, c6111.m17041(), c16881M13346, c22380M49631);
                } catch (Error | RuntimeException e) {
                    c22380M49631.close();
                    throw e;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m46112(C20409 c20409, C18998 c18998) {
        if (c20409.f66141 != c18998) {
            return;
        }
        c20409.f66141 = null;
        c18998.f61491.m45914((Throwable) null);
        c18998.f61492.m30019((Object) null);
        if (c20409.f66124 != null && c20409.f66146) {
            c20409.f66125.m16922(false);
            c20409.f16887.m18553(c20409, false);
        }
        c20409.m46052();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m46062(Exception exc, ActivityC11632 activityC11632) {
        int i;
        this.f16882.m2969((Throwable) exc);
        if (activityC11632 == null) {
            activityC11632 = (ActivityC11632) getActivity();
        }
        if (activityC11632 != null) {
            activityC11632.m29012();
            if (!isResumed()) {
                activityC11632.m29023(this);
            }
        }
        boolean z = exc instanceof C16405;
        C16609 c16609 = this.f66143;
        if (z) {
            int iM38616 = ((C16405) exc).m38616() - 1;
            if (iM38616 >= 0) {
                c16609.m39051(Integer.valueOf(iM38616));
                return;
            }
            return;
        }
        if (exc instanceof C4811) {
            int iM29578 = ((C4811) exc).m13367().m29578();
            if (iM29578 == -1 || (i = iM29578 - 1) < 0) {
                return;
            }
            c16609.m39051(Integer.valueOf(i));
            return;
        }
        if (exc instanceof C22085) {
            C22085 c22085 = (C22085) exc;
            C8500.m22223(c22085.f71538, c22085.f71540).m22227(this.f66125);
        } else if (exc instanceof C18066) {
            ((C18066) exc).m42064(this.f66125);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m46107(C20409 c20409, DialogInterface dialogInterface, int i) {
        C2063 c2063 = c20409.f66123;
        if (c2063.f7652 != i) {
            c2063.f7652 = i;
            c20409.f66125.m17057(true);
            c20409.m46049();
        }
        dialogInterface.dismiss();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46084(C20409 c20409, int[] iArr, DialogInterface dialogInterface) {
        dialogInterface.dismiss();
        if (c20409.f66123.f7652 != iArr[0]) {
            if (!c20409.m13338()) {
                c20409.m46132(iArr[0], false, false);
                return;
            }
            C8067 c8067BuildDialog = ((ActivityC11632) c20409.requireActivity()).buildDialog();
            c8067BuildDialog.m21274(R.string.MT_Protector);
            c8067BuildDialog.m21253(R.string.MT_Protector);
            c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterfaceOnClickListenerC17981(c20409, iArr, 1));
            c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c8067BuildDialog.m21269();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0157, code lost:
    
        if (r0.mo8735().m4560() != r10.f66155) goto L63;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m46143() {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20409.m46143():boolean");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m46050() {
        C2063 c2063 = this.f66123;
        return c2063 != null && c2063.m6571();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private boolean m46114() {
        C2063 c2063 = this.f66123;
        return c2063 != null && c2063.m6572();
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private boolean m46094() {
        C2063 c2063 = this.f66123;
        return c2063 != null && c2063.m6567();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean m46053() {
        C2063 c2063 = this.f66123;
        if (c2063 != null) {
            return c2063.m6571() || this.f66123.m6572() || this.f66123.m6567();
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String m46151() {
        String str = this.f66145;
        if (str != null) {
            return str;
        }
        String string = this.f16884.getString("remark");
        if (TextUtils.isEmpty(string)) {
            string = null;
        }
        if (string != null) {
            this.f66145 = string;
            return string;
        }
        try {
            String strM32189 = C13012.m32189(80, m13346().f53983.getName());
            this.f66145 = strM32189;
            return strM32189;
        } catch (Exception unused) {
            return "Error";
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String m46149() {
        if (!m13338()) {
            return m46151();
        }
        return "*" + m46151();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public boolean m46085() {
        C9742 c9742;
        C14393 c14393 = this.f66151;
        return (c14393 == null || (c9742 = c14393.f47155) == null || c9742.m24720() <= 1) ? false : true;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m46130(boolean z) {
        C9742 c9742;
        if (z) {
            return true;
        }
        C14393 c14393 = this.f66151;
        return (c14393 == null || (c9742 = c14393.f47155) == null || !c9742.m24718(c14393.f47153)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public FutureC12075 m46056(final int i, Runnable runnable) {
        FutureC12075 futureC12075 = new FutureC12075();
        final C14393 c14393 = this.f66151;
        if (!m46085() || i < 0 || i >= c14393.f47155.m24720() || c14393.f47155.m24717() || this.f66148 != null || this.f66132 != null || this.f16887.m18540()) {
            futureC12075.m30021((Throwable) new IllegalStateException("Text page is unavailable"));
            return futureC12075;
        }
        if (i == c14393.f47153) {
            if (runnable != null) {
                runnable.run();
            }
            futureC12075.m30019((Object) null);
            return futureC12075;
        }
        final C6111 c6111 = this.f66125;
        final C9742 c9742 = c14393.f47155;
        final int i2 = this.f66144;
        try {
            FutureC12075 futureC12075M46086 = m46086(false);
            final C8352 c8352 = this.f66148;
            C13638.requireNonNull(c8352);
            futureC12075M46086.m30028(new InterfaceC15954() { // from class: l.ۢۤۖ
                @Override // l.InterfaceC15954
                public final Object apply(Object obj) {
                    return C20409.m46059(this.f32190, c6111, c8352, c14393, c9742, i, i2);
                }
            }).m30015(new C3164(this, c6111, runnable)).m30016((InterfaceC7486) new C17666(this, futureC12075, c6111));
            return futureC12075;
        } catch (RuntimeException e) {
            futureC12075.m30021((Throwable) e);
            return futureC12075;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ FutureC12075 m46059(C20409 c20409, C6111 c6111, C8352 c8352, C14393 c14393, final C9742 c9742, final int i, final int i2) {
        if (!c20409.f66146 || c20409.f66125 != c6111) {
            throw new CancellationException("Page view was destroyed");
        }
        final C18935 c18935M21871 = c8352.m21871();
        final C13312 c13312 = c14393.f47165.f5556;
        return c20409.m46057(new C8042(c20409, new InterfaceC18625() { // from class: l.ۡ۟ۖ
            @Override // l.InterfaceC18625
            /* JADX INFO: renamed from: ۙ */
            public final C14393 mo12537(InterfaceC5614 interfaceC5614) throws Throwable {
                C18935 c18935 = c18935M21871;
                C9742 c9742M24709 = C9742.m24709(c9742.f32780);
                int i3 = i;
                C13312 c13313 = c13312;
                int i4 = i2;
                C14393 c14393M24714 = c9742M24709.m24714(i3, c13313, i4, interfaceC5614, true);
                try {
                    c14393M24714.m34651(c18935.m43616(), c18935.m43618(), c18935.m43617(), c13313, i4);
                    return c14393M24714;
                } catch (IOException | Error | RuntimeException e) {
                    c14393M24714.m34643().m30027();
                    throw e;
                }
            }
        }, i2), c13312.f44190, c9742.f32780);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m46076(C20409 c20409, C6111 c6111, Runnable runnable) {
        if (!c20409.f66146 || c20409.f66125 != c6111) {
            throw new CancellationException("Page view was destroyed");
        }
        c20409.m46124(false);
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m46079(C20409 c20409, FutureC12075 futureC12075, C6111 c6111, Throwable th) {
        if (th == null) {
            futureC12075.m30019((Object) null);
            return;
        }
        if (c20409.f66146 && c20409.f66125 == c6111) {
            if (c20409.f66151 == null) {
                c20409.m13347(true);
            }
            c20409.f16882.m2969(th);
        }
        futureC12075.m30021(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public void m46126() {
        StringBuilder sb = new StringBuilder();
        if (m13338()) {
            sb.append("*");
        }
        if (m46085()) {
            sb.append(MotionUtils.EASING_TYPE_FORMAT_START);
            sb.append(this.f66151.f47153 + 1);
            sb.append("/");
            sb.append(this.f66151.f47155.m24720());
            sb.append(") ");
        }
        sb.append(m46151());
        this.f16887.m18544(sb.toString());
        this.f16887.m18543(m13338() ? C20368.f66005 : C20368.f65993);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public void m46049() {
        StringBuilder sb = new StringBuilder();
        C6111 c6111 = this.f66125;
        if (c6111 != null) {
            int iM16916 = c6111.m16916();
            int iM17020 = c6111.m17020();
            Point pointM16956 = c6111.m16956(iM16916);
            sb.append(pointM16956.x);
            sb.append(':');
            sb.append(pointM16956.y);
            if (iM16916 != iM17020) {
                sb.append(" (");
                sb.append(Math.abs(iM17020 - iM16916));
                sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
            }
        }
        if (this.f66123 != null) {
            if (sb.length() > 0) {
                sb.append("   ");
            }
            if (this.f66123.m6571()) {
                sb.append("AXML");
            } else if (this.f66123.m6572()) {
                sb.append("ABX");
            } else {
                sb.append(C22037.m48955(this.f66123.f7652));
            }
        }
        if (sb.length() == 0) {
            this.f16887.m18565("...");
        } else {
            this.f16887.m18565(sb.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m46061(View view) {
        final int i;
        String strM48955;
        int i2 = 0;
        if (m46085() && view.getId() == R.id.MT_Protector) {
            int iM24720 = this.f66151.f47155.m24720();
            CharSequence[] charSequenceArr = new CharSequence[iM24720];
            while (i2 < iM24720) {
                int i3 = i2 + 1;
                charSequenceArr[i2] = String.valueOf(i3);
                i2 = i3;
            }
            C8067 c8067BuildDialog = ((ActivityC11632) requireActivity()).buildDialog();
            c8067BuildDialog.m21274(R.string.MT_Protector);
            c8067BuildDialog.m21266(charSequenceArr, this.f66151.f47153, new DialogInterface.OnClickListener() { // from class: l.᩶ۤۖ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i4) {
                    C20409.m46069(this.f65281, dialogInterface, i4);
                }
            });
            c8067BuildDialog.m21251(R.string.MT_Protector, null);
            c8067BuildDialog.m21269();
            return;
        }
        C16881 c16881M13346 = m13346();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) getString(R.string.MT_Protector));
        int i4 = 1;
        spannableStringBuilder.setSpan(new StyleSpan(1), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) "\n").append((CharSequence) c16881M13346.f53983.mo33986()).append((CharSequence) "\n");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) getString(R.string.MT_Protector));
        if (m46050()) {
            i = C22037.f71424;
            strM48955 = "AXML";
        } else if (m46114()) {
            i = C22037.f71424;
            strM48955 = "ABX";
        } else if (m46094()) {
            i = C22037.f71424;
            strM48955 = "Class";
        } else {
            C2063 c2063 = this.f66123;
            i = c2063 == null ? -1 : c2063.f7652;
            strM48955 = i == -1 ? "?" : C22037.m48955(i);
        }
        spannableStringBuilder.setSpan(new StyleSpan(1), length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) "\n").append((CharSequence) strM48955).append((CharSequence) "\n");
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) getString(R.string.MT_Protector));
        spannableStringBuilder.setSpan(new StyleSpan(1), length2, spannableStringBuilder.length(), 33);
        SpannableStringBuilder spannableStringBuilderAppend = spannableStringBuilder.append((CharSequence) "\n");
        String[] strArr = {"Windows (CRLF)", "MacOS (CR)", "Unix-like (LF)"};
        String strM17042 = this.f66125.m17042();
        strM17042.getClass();
        if (strM17042.equals("\r")) {
            i2 = 1;
        } else if (!strM17042.equals("\r\n")) {
            i2 = 2;
        }
        spannableStringBuilderAppend.append((CharSequence) strArr[i2]);
        C8067 c8067BuildDialog2 = ((ActivityC11632) requireActivity()).buildDialog();
        c8067BuildDialog2.m21277(m46151());
        c8067BuildDialog2.m21261(spannableStringBuilder);
        c8067BuildDialog2.m21251(R.string.MT_Protector, null);
        c8067BuildDialog2.m21275(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.֡ۤۖ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i5) {
                C20409.m46106(this.f1753, i);
            }
        });
        c8067BuildDialog2.m21271(R.string.MT_Protector, new DialogInterfaceOnClickListenerC2627(i4, this));
        ((TextView) c8067BuildDialog2.m21269().m44364(android.R.id.message)).setTextIsSelectable(true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m46069(C20409 c20409, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        c20409.m46056(i, (Runnable) null);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m46106(C20409 c20409, int i) {
        if (i != -1) {
            c20409.m46102(i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46141(ActivityC11632 activityC11632, DialogInterfaceC7957 dialogInterfaceC7957) {
        C9433 c9433 = new C9433(this, activityC11632, activityC11632, dialogInterfaceC7957);
        c9433.m40376(R.string.MT_Protector);
        c9433.m40375(40);
        String string = this.f16884.getString("remark");
        if (TextUtils.isEmpty(string)) {
            string = null;
        }
        c9433.m40346((CharSequence) string);
        c9433.m40355();
        c9433.m40368(true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46138(ActivityC11632 activityC11632) {
        if (m13338()) {
            if (m13356() && this.f66131 == null) {
                activityC11632.m29023(this);
            }
            int i = DialogInterfaceC19356.f62401;
            C8067 c8067 = new C8067(activityC11632);
            c8067.m21277(m46151());
            c8067.m21253(R.string.MT_Protector);
            int i2 = 1;
            c8067.m21251(R.string.MT_Protector, new DialogInterfaceOnClickListenerC20804(this, activityC11632, i2));
            c8067.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c8067.m21271(R.string.MT_Protector, new DialogInterfaceOnClickListenerC15866(this, activityC11632, i2));
            c8067.m21269();
            return;
        }
        activityC11632.m29016(this);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C6037 m46147() {
        C6037 c6037 = this.f66123.f7653;
        C13638.requireNonNull(c6037);
        return c6037;
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final Map m46145() {
        Map map = this.f66123.f7649;
        C13638.requireNonNull(map);
        return map;
    }

    @Override // l.ComponentCallbacksC22654, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f16887.m18575(getResources().getBoolean(R.bool.MT_Protector));
    }
}
