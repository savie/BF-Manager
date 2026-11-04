package l;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.os.TransactionTooLargeException;
import android.text.Selection;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.MetaKeyKeyListener;
import android.text.method.TextKeyListener;
import android.util.AttributeSet;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.OverScroller;
import bin.mt.plus.R;
import com.umeng.analytics.pro.o;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.lang.ref.WeakReference;
import java.text.BreakIterator;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.᩺ۜ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes.dex */
public class C24132 extends View implements InterfaceC9409 {

    /* JADX INFO: renamed from: ֫ᩴ, reason: not valid java name and contains not printable characters */
    public static final float f77976;

    /* JADX INFO: renamed from: ۧᩴ, reason: not valid java name and contains not printable characters */
    public static final TextKeyListener f77977;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f77978;

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public boolean f77979;

    /* JADX INFO: renamed from: ֡ۤ, reason: not valid java name and contains not printable characters */
    public InterfaceC5486 f77980;

    /* JADX INFO: renamed from: ֡᩷, reason: not valid java name and contains not printable characters */
    public C17853 f77981;

    /* JADX INFO: renamed from: ֡᩸, reason: not valid java name and contains not printable characters */
    public long f77982;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f77983;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC19459 f77984;

    /* JADX INFO: renamed from: ֨ۤ, reason: not valid java name and contains not printable characters */
    public int[] f77985;

    /* JADX INFO: renamed from: ֨᩷, reason: not valid java name and contains not printable characters */
    public final CursorAnchorInfo.Builder f77986;

    /* JADX INFO: renamed from: ֨᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC20598 f77987;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC12943 f77988;

    /* JADX INFO: renamed from: ֫ۤ, reason: not valid java name and contains not printable characters */
    public EdgeEffect f77989;

    /* JADX INFO: renamed from: ֫᩷, reason: not valid java name and contains not printable characters */
    public volatile C19656 f77990;

    /* JADX INFO: renamed from: ֫᩸, reason: not valid java name and contains not printable characters */
    public final Rect f77991;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f77992;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public int f77993;

    /* JADX INFO: renamed from: ۖۤ, reason: not valid java name and contains not printable characters */
    public int f77994;

    /* JADX INFO: renamed from: ۖ᩷, reason: not valid java name and contains not printable characters */
    public C17853 f77995;

    /* JADX INFO: renamed from: ۖ᩸, reason: not valid java name and contains not printable characters */
    public volatile C12197 f77996;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f77997;

    /* JADX INFO: renamed from: ۗۤ, reason: not valid java name and contains not printable characters */
    public boolean f77998;

    /* JADX INFO: renamed from: ۗ᩷, reason: not valid java name and contains not printable characters */
    public float f77999;

    /* JADX INFO: renamed from: ۗ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC19106 f78000;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final Rect f78001;

    /* JADX INFO: renamed from: ۘۤ, reason: not valid java name and contains not printable characters */
    public float f78002;

    /* JADX INFO: renamed from: ۘ᩷, reason: not valid java name and contains not printable characters */
    public int f78003;

    /* JADX INFO: renamed from: ۘ᩸, reason: not valid java name and contains not printable characters */
    public String f78004;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public ClipboardManager f78005;

    /* JADX INFO: renamed from: ۙۤ, reason: not valid java name and contains not printable characters */
    public ArrayList f78006;

    /* JADX INFO: renamed from: ۙᩴ, reason: not valid java name and contains not printable characters */
    public C18416 f78007;

    /* JADX INFO: renamed from: ۙ᩷, reason: not valid java name and contains not printable characters */
    public C5224 f78008;

    /* JADX INFO: renamed from: ۙ᩸, reason: not valid java name and contains not printable characters */
    public ViewTreeObserverOnGlobalLayoutListenerC11451 f78009;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public long f78010;

    /* JADX INFO: renamed from: ۚۤ, reason: not valid java name and contains not printable characters */
    public final int[] f78011;

    /* JADX INFO: renamed from: ۚᩴ, reason: not valid java name and contains not printable characters */
    public C24132 f78012;

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public boolean f78013;

    /* JADX INFO: renamed from: ۚ᩸, reason: not valid java name and contains not printable characters */
    public final RectF f78014;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public int f78015;

    /* JADX INFO: renamed from: ۛۤ, reason: not valid java name and contains not printable characters */
    public boolean f78016;

    /* JADX INFO: renamed from: ۛ᩷, reason: not valid java name and contains not printable characters */
    public int f78017;

    /* JADX INFO: renamed from: ۛ᩸, reason: not valid java name and contains not printable characters */
    public C2937 f78018;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public volatile boolean f78019;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public C24179 f78020;

    /* JADX INFO: renamed from: ۜۤ, reason: not valid java name and contains not printable characters */
    public volatile C23386 f78021;

    /* JADX INFO: renamed from: ۜ᩷, reason: not valid java name and contains not printable characters */
    public AbstractC13753 f78022;

    /* JADX INFO: renamed from: ۜ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC1757 f78023;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public volatile boolean f78024;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public C10155 f78025;

    /* JADX INFO: renamed from: ۟ۤ, reason: not valid java name and contains not printable characters */
    public boolean f78026;

    /* JADX INFO: renamed from: ۟᩷, reason: not valid java name and contains not printable characters */
    public EdgeEffect f78027;

    /* JADX INFO: renamed from: ۟᩸, reason: not valid java name and contains not printable characters */
    public long f78028;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C17243 f78029;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public boolean f78030;

    /* JADX INFO: renamed from: ۠ۤ, reason: not valid java name and contains not printable characters */
    public volatile C24878 f78031;

    /* JADX INFO: renamed from: ۠᩷, reason: not valid java name and contains not printable characters */
    public C8511 f78032;

    /* JADX INFO: renamed from: ۠᩸, reason: not valid java name and contains not printable characters */
    public C1314 f78033;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public AbstractActivityC17204 f78034;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public int f78035;

    /* JADX INFO: renamed from: ۡۤ, reason: not valid java name and contains not printable characters */
    public long f78036;

    /* JADX INFO: renamed from: ۡ᩷, reason: not valid java name and contains not printable characters */
    public HandlerC0308 f78037;

    /* JADX INFO: renamed from: ۡ᩸, reason: not valid java name and contains not printable characters */
    public C19213 f78038;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public InterfaceC16497 f78039;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public volatile InterfaceC19106 f78040;

    /* JADX INFO: renamed from: ۢۤ, reason: not valid java name and contains not printable characters */
    public InterfaceC2192 f78041;

    /* JADX INFO: renamed from: ۢ᩷, reason: not valid java name and contains not printable characters */
    public C15751 f78042;

    /* JADX INFO: renamed from: ۢ᩸, reason: not valid java name and contains not printable characters */
    public int f78043;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public C2567 f78044;

    /* JADX INFO: renamed from: ۤۤ, reason: not valid java name and contains not printable characters */
    public EdgeEffect f78045;

    /* JADX INFO: renamed from: ۤᩴ, reason: not valid java name and contains not printable characters */
    public volatile long f78046;

    /* JADX INFO: renamed from: ۤ᩷, reason: not valid java name and contains not printable characters */
    public InputMethodManager f78047;

    /* JADX INFO: renamed from: ۤ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f78048;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public int f78049;

    /* JADX INFO: renamed from: ۧۤ, reason: not valid java name and contains not printable characters */
    public final Matrix f78050;

    /* JADX INFO: renamed from: ۧ᩷, reason: not valid java name and contains not printable characters */
    public C19656 f78051;

    /* JADX INFO: renamed from: ۧ᩸, reason: not valid java name and contains not printable characters */
    public float f78052;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public float f78053;

    /* JADX INFO: renamed from: ۨۤ, reason: not valid java name and contains not printable characters */
    public boolean f78054;

    /* JADX INFO: renamed from: ۨ᩷, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f78055;

    /* JADX INFO: renamed from: ۨ᩸, reason: not valid java name and contains not printable characters */
    public boolean f78056;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public boolean f78057;

    /* JADX INFO: renamed from: ۫ۤ, reason: not valid java name and contains not printable characters */
    public InterfaceC19106 f78058;

    /* JADX INFO: renamed from: ۫ᩴ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f78059;

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public boolean f78060;

    /* JADX INFO: renamed from: ۫᩸, reason: not valid java name and contains not printable characters */
    public final RectF f78061;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f78062;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public ViewOnTouchListenerC2545 f78063;

    /* JADX INFO: renamed from: ۬ۤ, reason: not valid java name and contains not printable characters */
    public C6232 f78064;

    /* JADX INFO: renamed from: ۬᩷, reason: not valid java name and contains not printable characters */
    public EdgeEffect f78065;

    /* JADX INFO: renamed from: ۬᩸, reason: not valid java name and contains not printable characters */
    public C14540 f78066;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Runnable f78067;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final Rect f78068;

    /* JADX INFO: renamed from: ܰۤ, reason: not valid java name and contains not printable characters */
    public boolean f78069;

    /* JADX INFO: renamed from: ܰ᩷, reason: not valid java name and contains not printable characters */
    public boolean f78070;

    /* JADX INFO: renamed from: ܰ᩸, reason: not valid java name and contains not printable characters */
    public C17418 f78071;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public boolean f78072;

    /* JADX INFO: renamed from: ܳۤ, reason: not valid java name and contains not printable characters */
    public long f78073;

    /* JADX INFO: renamed from: ܳᩴ, reason: not valid java name and contains not printable characters */
    public boolean f78074;

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public boolean f78075;

    /* JADX INFO: renamed from: ܳ᩸, reason: not valid java name and contains not printable characters */
    public volatile boolean f78076;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public boolean f78077;

    /* JADX INFO: renamed from: ܶۤ, reason: not valid java name and contains not printable characters */
    public boolean f78078;

    /* JADX INFO: renamed from: ܶ᩷, reason: not valid java name and contains not printable characters */
    public long f78079;

    /* JADX INFO: renamed from: ܶ᩸, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f78080;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public int f78081;

    /* JADX INFO: renamed from: ܺۤ, reason: not valid java name and contains not printable characters */
    public int f78082;

    /* JADX INFO: renamed from: ܺ᩷, reason: not valid java name and contains not printable characters */
    public float f78083;

    /* JADX INFO: renamed from: ܺ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList f78084;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final C11882 f78085;

    /* JADX INFO: renamed from: ܽۤ, reason: not valid java name and contains not printable characters */
    public C16800 f78086;

    /* JADX INFO: renamed from: ܽ᩷, reason: not valid java name and contains not printable characters */
    public float f78087;

    /* JADX INFO: renamed from: ܽ᩸, reason: not valid java name and contains not printable characters */
    public int f78088;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C6232 f78089;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public C9959 f78090;

    /* JADX INFO: renamed from: ܿۤ, reason: not valid java name and contains not printable characters */
    public int f78091;

    /* JADX INFO: renamed from: ܿ᩷, reason: not valid java name and contains not printable characters */
    public int f78092;

    /* JADX INFO: renamed from: ܿ᩸, reason: not valid java name and contains not printable characters */
    public volatile C3248 f78093;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f78094;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public RuntimeException f78095;

    /* JADX INFO: renamed from: ᩳۤ, reason: not valid java name and contains not printable characters */
    public C9213 f78096;

    /* JADX INFO: renamed from: ᩳ᩷, reason: not valid java name and contains not printable characters */
    public final BreakIterator f78097;

    /* JADX INFO: renamed from: ᩳ᩸, reason: not valid java name and contains not printable characters */
    public boolean f78098;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public int f78099;

    /* JADX INFO: renamed from: ᩴۤ, reason: not valid java name and contains not printable characters */
    public long f78100;

    /* JADX INFO: renamed from: ᩴᩴ, reason: not valid java name and contains not printable characters */
    public final C24720 f78101;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public volatile boolean f78102;

    /* JADX INFO: renamed from: ᩴ᩸, reason: not valid java name and contains not printable characters */
    public volatile transient boolean f78103;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public volatile int f78104;

    /* JADX INFO: renamed from: ᩵ۤ, reason: not valid java name and contains not printable characters */
    public boolean f78105;

    /* JADX INFO: renamed from: ᩵᩷, reason: not valid java name and contains not printable characters */
    public boolean f78106;

    /* JADX INFO: renamed from: ᩵᩸, reason: not valid java name and contains not printable characters */
    public boolean f78107;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Runnable f78108;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public C20003 f78109;

    /* JADX INFO: renamed from: ᩶ۤ, reason: not valid java name and contains not printable characters */
    public boolean f78110;

    /* JADX INFO: renamed from: ᩶᩷, reason: not valid java name and contains not printable characters */
    public int f78111;

    /* JADX INFO: renamed from: ᩶᩸, reason: not valid java name and contains not printable characters */
    public C15926 f78112;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC17787 f78113;

    /* JADX INFO: renamed from: ᩷ۤ, reason: not valid java name and contains not printable characters */
    public ArrayList f78114;

    /* JADX INFO: renamed from: ᩷ᩴ, reason: not valid java name and contains not printable characters */
    public final Object f78115;

    /* JADX INFO: renamed from: ᩷᩷, reason: not valid java name and contains not printable characters */
    public boolean f78116;

    /* JADX INFO: renamed from: ᩷᩸, reason: not valid java name and contains not printable characters */
    public final Object f78117;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f78118;

    /* JADX INFO: renamed from: ᩸ۤ, reason: not valid java name and contains not printable characters */
    public OverScroller f78119;

    /* JADX INFO: renamed from: ᩸ᩴ, reason: not valid java name and contains not printable characters */
    public C18207 f78120;

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f78121;

    /* JADX INFO: renamed from: ᩸᩸, reason: not valid java name and contains not printable characters */
    public volatile long f78122;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public boolean f78123;

    /* JADX INFO: renamed from: ᩹ۤ, reason: not valid java name and contains not printable characters */
    public volatile boolean f78124;

    /* JADX INFO: renamed from: ᩹᩷, reason: not valid java name and contains not printable characters */
    public float f78125;

    /* JADX INFO: renamed from: ᩹᩸, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f78126;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public float f78127;

    /* JADX INFO: renamed from: ᩺ۤ, reason: not valid java name and contains not printable characters */
    public boolean f78128;

    /* JADX INFO: renamed from: ᩺᩷, reason: not valid java name and contains not printable characters */
    public boolean f78129;

    /* JADX INFO: renamed from: ᩺᩸, reason: not valid java name and contains not printable characters */
    public boolean f78130;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public int f78131;

    /* JADX INFO: renamed from: ᩻ۤ, reason: not valid java name and contains not printable characters */
    public C22329 f78132;

    /* JADX INFO: renamed from: ᩻᩷, reason: not valid java name and contains not printable characters */
    public long f78133;

    /* JADX INFO: renamed from: ᩻᩸, reason: not valid java name and contains not printable characters */
    public volatile boolean f78134;

    /* JADX INFO: renamed from: ۖ᩸, reason: not valid java name and contains not printable characters */
    private native void m53682();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m53691(int i, int i2, int i3) {
        if (i3 >= i2 && i >= i2) {
            return i > i3 ? i3 : i;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۠᩸, reason: not valid java name and contains not printable characters */
    private native void m53751();

    /* JADX INFO: renamed from: ֡᩷ */
    public boolean mo52288() {
        return true;
    }

    /* JADX INFO: renamed from: ۗۙ */
    public int mo52292() {
        return 0;
    }

    /* JADX INFO: renamed from: ۗۤ */
    public void mo52293() {
    }

    /* JADX INFO: renamed from: ۘۙ */
    public int mo52297() {
        return 917505;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public native void m53924(AbstractC17787 abstractC17787);

    /* JADX INFO: renamed from: ۙ */
    public native void mo52303(C20348 c20348);

    /* JADX INFO: renamed from: ۙۙ */
    public void mo52306() {
    }

    /* JADX INFO: renamed from: ۛۤ */
    public void mo52308() {
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final synchronized void m53960() {
        int i = this.f77983;
        if (i <= 0) {
            throw new IllegalStateException("No background text task");
        }
        this.f77983 = i - 1;
        if (this.f78124) {
            m53966();
        }
    }

    /* JADX INFO: renamed from: ۟ۤ, reason: not valid java name and contains not printable characters */
    public final synchronized void m53966() {
        if (!this.f77998) {
            InterfaceC19106 interfaceC19106 = this.f78058;
            if (interfaceC19106 instanceof C13378) {
                C13378 c13378 = (C13378) interfaceC19106;
                this.f78124 = true;
                if (c13378 instanceof C24238) {
                    ((C24238) c13378).m54227();
                }
                if (this.f77983 != 0) {
                    m54012();
                    return;
                }
                if (isAttachedToWindow()) {
                    return;
                }
                this.f77998 = true;
                m54111();
                this.f78118.clear();
                m54012();
                this.f78033.m4823();
                this.f77988 = null;
                m53847((CharSequence) new C13378(""));
                this.f78033.m4823();
                this.f78037.m1895();
                AbstractC13753 abstractC13753 = this.f78022;
                if (abstractC13753 != null) {
                    abstractC13753.f43653 = true;
                }
                c13378.close();
            }
        }
    }

    /* JADX INFO: renamed from: ۟᩷ */
    public boolean mo52311() {
        return true;
    }

    /* JADX INFO: renamed from: ۡۤ */
    public boolean mo52313() {
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo52315(int i) {
    }

    /* JADX INFO: renamed from: ۫ */
    public void mo52319() {
    }

    /* JADX INFO: renamed from: ۫ۤ */
    public boolean mo52320() {
        return false;
    }

    /* JADX INFO: renamed from: ܰۤ */
    public boolean mo52322() {
        return true;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final synchronized void m54050() {
        if (this.f78124) {
            throw new IllegalStateException("Text view is released");
        }
        this.f77983++;
    }

    /* JADX INFO: renamed from: ᩴ */
    public void mo52329(int i, int i2) {
    }

    /* JADX INFO: renamed from: ᩴ᩸ */
    public boolean mo52330() {
        return true;
    }

    /* JADX INFO: renamed from: ᩵ۤ */
    public void mo52331() {
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public native void m54075(String str);

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public native void m54093();

    /* JADX INFO: renamed from: ᩸᩸ */
    public boolean mo52338() {
        return false;
    }

    /* JADX INFO: renamed from: ᩺ۙ */
    public int mo52341() {
        return 33554433;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private synchronized boolean m53726(C13378 c13378, final C13378 c13379, int i, long j) {
        boolean z = this.f78103;
        this.f78103 = true;
        try {
            if (!this.f78124 && this.f78058 == c13378) {
                int iM53968 = m53968();
                int iM53882 = m53882();
                if (!c13378.m32984(i, j, new RunnableC9828(this, c13379, c13378))) {
                    c13379.close();
                    this.f78103 = z;
                    return false;
                }
                C14540 c14540 = this.f78066;
                String str = c14540.f45783;
                int i2 = c14540.f45806;
                float textSize = c14540.f18967.getTextSize();
                C14540 c14541 = this.f78066;
                float f = textSize / c14541.f18979;
                float fM16208 = c14541.m16208();
                int i3 = this.f78043;
                C14540 c14542 = this.f78066;
                boolean z2 = c14542.f45763;
                boolean z3 = c14542.f45769;
                boolean zM16209 = c14542.m16209();
                boolean zM16204 = this.f78066.m16204();
                C14540 c14543 = this.f78066;
                final C16361 c16361 = new C16361(f, fM16208, i2, i3, c14543.m16214(), str, "", z2, z3, zM16209, zM16204, c14543.f45755);
                try {
                    try {
                        this.f78018.m9612(c13379);
                        this.f78033.m4822();
                        this.f78029.m40506();
                        this.f78022.mo25242(c13379);
                        final AbstractC13753 abstractC13753 = this.f78022;
                        C21576.m49068(new Runnable() { // from class: l.֨ۖ᩸
                            @Override // java.lang.Runnable
                            public final void run() {
                                C24132.m53714(this.f3274, c13379, abstractC13753, c16361);
                            }
                        });
                        m53745();
                        c13379.setSelection(iM53968, iM53882);
                        if (this.f78066.f45755 || this.f78086 != null) {
                            m53781();
                        }
                        this.f78018.m9609(c13379);
                        this.f78033.m4837(c13379);
                        m54030();
                        c13378.setReadOnly(false);
                        this.f78103 = z;
                        return true;
                    } catch (RuntimeException e) {
                        RuntimeException runtimeExceptionM53693 = m53693(e);
                        if (runtimeExceptionM53693 != null) {
                            m53700(c13379, runtimeExceptionM53693, c16361);
                        }
                        throw e;
                    }
                } catch (Throwable th) {
                    c13378.setReadOnly(false);
                    throw th;
                }
            }
            c13379.close();
            this.f78103 = z;
            return false;
        } catch (Throwable th2) {
            this.f78103 = z;
            throw th2;
        }
    }

    public C24132(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C24132(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f78028 = 0L;
        this.f77982 = 0L;
        this.f77994 = 0;
        this.f78100 = SystemClock.uptimeMillis();
        this.f78073 = 0L;
        this.f78082 = 0;
        this.f78049 = 0;
        this.f78088 = 0;
        this.f78126 = new AtomicInteger();
        this.f78002 = -1.0f;
        this.f77978 = true;
        this.f78116 = false;
        this.f78098 = false;
        this.f78043 = 0;
        this.f78123 = false;
        this.f78061 = new RectF();
        this.f78035 = -1;
        this.f77993 = -1;
        this.f78092 = -1;
        this.f78111 = -1;
        this.f78014 = new RectF();
        this.f77991 = new Rect();
        this.f77979 = true;
        C11882 c11882 = new C11882(this);
        this.f78085 = c11882;
        this.f77980 = c11882;
        this.f77985 = new int[2];
        this.f78084 = new ArrayList();
        this.f78103 = false;
        this.f78024 = false;
        this.f78122 = -1L;
        this.f78076 = false;
        this.f78004 = "not_checked";
        this.f78118 = new ArrayList();
        this.f78121 = new AtomicInteger();
        this.f78044 = new C2567();
        this.f78001 = new Rect();
        this.f78068 = new Rect();
        this.f78010 = -1L;
        this.f78099 = 255;
        this.f78080 = new CopyOnWriteArrayList();
        this.f78055 = new AtomicInteger();
        this.f78134 = false;
        this.f78097 = BreakIterator.getWordInstance();
        this.f78048 = new ArrayDeque();
        this.f78117 = new Object();
        this.f78115 = new Object();
        this.f78058 = new C13378("");
        this.f78042 = new C15751(this);
        this.f78037 = new HandlerC0308(this);
        this.f77997 = new ArrayList();
        this.f78008 = new C5224();
        this.f77981 = new C17853();
        this.f77995 = new C17853();
        this.f78006 = new ArrayList();
        this.f78114 = new ArrayList();
        this.f78101 = C24720.m55194(300);
        this.f77986 = new CursorAnchorInfo.Builder();
        this.f78050 = new Matrix();
        this.f78011 = new int[2];
        this.f78059 = new AtomicInteger();
        this.f78013 = false;
        this.f78090 = C9959.f32010;
        setSaveEnabled(false);
        setFocusable(true);
        setFocusableInTouchMode(true);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            setDefaultFocusHighlightEnabled(false);
        }
        if (!isInEditMode()) {
            this.f78047 = (InputMethodManager) context.getSystemService("input_method");
            this.f78005 = (ClipboardManager) context.getSystemService("clipboard");
        } else {
            C9383.m24704();
        }
        C14540 c14540 = new C14540(this);
        if (!isInEditMode()) {
            c14540.m35082();
        }
        if (i2 >= 24) {
            setPointerIcon(PointerIcon.getSystemIcon(context, 1008));
        }
        this.f78066 = c14540;
        this.f78025 = new C10155();
        this.f78033 = new C1314(this);
        this.f78018 = new C2937(this);
        this.f78029 = new C17243(this);
        if (!mo52311()) {
            this.f78058.mo11043().m41122(0L);
        }
        this.f78058.setSelection(0);
        this.f77989 = new EdgeEffect(context);
        this.f78027 = new EdgeEffect(context);
        m53698(AbstractC13753.m33599(this, this.f78058, c14540, this.f78043), true);
        setLongClickable(true);
        this.f78119 = new OverScroller(context);
        ViewOnTouchListenerC2545 viewOnTouchListenerC2545 = new ViewOnTouchListenerC2545(this, context);
        this.f78063 = viewOnTouchListenerC2545;
        this.f78020 = new C24179(context, viewOnTouchListenerC2545);
        setOnTouchListener(viewOnTouchListenerC2545);
        Activity activityM10534 = C3200.m10534(context);
        if (activityM10534 instanceof AbstractActivityC17204) {
            this.f78034 = (AbstractActivityC17204) activityM10534;
        }
        m53778();
    }

    /* JADX INFO: renamed from: ۤ */
    public void mo40460() {
        if (isInEditMode()) {
            return;
        }
        C20003 c20003 = this.f78109;
        if (c20003 != null) {
            c20003.m46003();
        }
        this.f78109 = null;
        this.f78066.m35082();
        C18207 c18207 = this.f78120;
        if (c18207 != null) {
            ViewTreeObserverOnPreDrawListenerC22000[] viewTreeObserverOnPreDrawListenerC22000Arr = c18207.f59453;
            viewTreeObserverOnPreDrawListenerC22000Arr[0].m49732();
            viewTreeObserverOnPreDrawListenerC22000Arr[1].m49732();
            viewTreeObserverOnPreDrawListenerC22000Arr[2].m49732();
        }
    }

    /* JADX INFO: renamed from: ۖۤ, reason: not valid java name and contains not printable characters */
    public final void m53883() {
        try {
            this.f78123 = true;
            AbstractC13753 abstractC13753 = this.f78022;
            abstractC13753.m33637();
            if (abstractC13753 instanceof C22572) {
                this.f78022 = new C22572(this, this.f78058, this.f78066);
            } else {
                if (!(abstractC13753 instanceof C9670)) {
                    throw new RuntimeException(String.valueOf(abstractC13753));
                }
                C9670 c9670 = new C9670(this, this.f78058, this.f78066, ((C9670) abstractC13753).m25227());
                this.f78022 = c9670;
                if (c9670.mo25232() == 0.0f) {
                    this.f78022.mo25236((int) abstractC13753.mo25232());
                }
            }
            while (this.f78022.mo25237()) {
                SystemClock.sleep(100L);
            }
            this.f78022.mo25223(abstractC13753.f43673);
            this.f78123 = false;
            m53694(m53948(getScrollX()), m53873(this.f78104), true);
            this.f78002 = -1.0f;
        } catch (Throwable th) {
            this.f78123 = false;
            m53694(m53948(getScrollX()), m53873(this.f78104), true);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53906(InterfaceC2192 interfaceC2192) {
        this.f78041 = interfaceC2192;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, this.f78104);
    }

    @Override // android.view.View
    public final void setScrollX(int i) {
        m53694(i, this.f78104, true);
    }

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final int m54026() {
        return this.f78104;
    }

    @Override // android.view.View
    public final void setScrollY(int i) {
        m53694(getScrollX(), i, true);
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        m53694(getScrollX() + i, this.f78104 + i2, true);
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        if (this.f78074) {
            return;
        }
        super.onScrollChanged(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m53800(int i, int i2) {
        AbstractC13753 abstractC13753;
        int scrollX = getScrollX();
        int i3 = this.f78104;
        boolean z = this.f78129;
        InterfaceC19106 interfaceC19106 = this.f78000;
        InterfaceC19106 interfaceC19107 = this.f78058;
        if (interfaceC19106 != interfaceC19107) {
            this.f78000 = interfaceC19107;
            this.f78129 = false;
        }
        if (Math.abs(i2) + ((long) getHeight()) > 65536 || ((abstractC13753 = this.f78022) != null && abstractC13753.f43646 == this.f78058 && abstractC13753.m33639() > 65536.0d)) {
            this.f78129 = true;
        }
        this.f78104 = i2;
        this.f78074 = true;
        try {
            super.scrollTo(i, this.f78129 ? 0 : i2);
            this.f78074 = false;
            if (i != scrollX || i2 != i3) {
                super.onScrollChanged(i, i2, scrollX, i3);
            }
            if (z == this.f78129 && i == scrollX && i2 == i3) {
                return;
            }
            invalidate();
        } catch (Throwable th) {
            this.f78074 = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m53705(C24132 c24132, int i, int i2) {
        c24132.m53694(i, i2, true);
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        m53694(i, i2, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m53694(int i, int i2, boolean z) {
        int scrollX;
        int i3;
        if (z) {
            m53819();
            m53864();
            this.f78055.incrementAndGet();
        }
        if (this.f78123) {
            return;
        }
        InterfaceC2192 interfaceC2192 = this.f78041;
        if (interfaceC2192 != null) {
            scrollX = getScrollX();
            i3 = this.f78104;
        } else {
            scrollX = 0;
            i3 = 0;
        }
        try {
            m53800(i, i2);
            if (interfaceC2192 != null) {
                interfaceC2192.mo7499(scrollX, i3, i, i2);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m53875(int i, int i2) {
        m53819();
        m53864();
        this.f78055.incrementAndGet();
        this.f78037.removeMessages(1);
        if (!this.f78119.isFinished()) {
            this.f78119.forceFinished(true);
        }
        int scrollX = getScrollX();
        int i3 = this.f78104;
        if (scrollX == i && i3 == i2) {
            return;
        }
        if (scrollX != i) {
            i = m53948(i);
        }
        if (i3 != i2) {
            i2 = m53873(i2);
        }
        try {
            m53800(i, i2);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m54106(int i, int i2) {
        m53819();
        this.f78055.incrementAndGet();
        int scrollX = getScrollX();
        int i3 = this.f78104;
        if (i == -1) {
            i = this.f78119.isFinished() ? scrollX : this.f78119.getFinalX();
        }
        if (i2 == -1) {
            i2 = this.f78119.isFinished() ? i3 : this.f78119.getFinalY();
        }
        m53864();
        m53975();
        this.f78119.startScroll(scrollX, i3, i - scrollX, i2 - i3);
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m53698(AbstractC13753 abstractC13753, boolean z) {
        int iM16189;
        int i;
        int i2;
        m53689();
        AbstractC13753 abstractC13754 = this.f78022;
        if (abstractC13754 != abstractC13753) {
            this.f78031 = null;
            if (abstractC13754 != null) {
                abstractC13754.m33637();
            }
            m53848("Session layout changed");
        }
        if (abstractC13754 != null) {
            abstractC13753.mo25223(abstractC13754.f43673);
        }
        int iM53873 = 0;
        if (z && abstractC13754 != null && (abstractC13753 instanceof C22572)) {
            int iM33615 = abstractC13754.m33615(this.f78104 + 1);
            C14366 c14366 = abstractC13754.f43643.get(iM33615);
            i2 = c14366.f45295;
            i = c14366.f45296;
            iM16189 = (int) (this.f78104 - (this.f78066.m16189() * iM33615));
        } else {
            iM16189 = 0;
            i = 0;
            i2 = 0;
        }
        if (abstractC13754 != abstractC13753 && (abstractC13754 instanceof C9670)) {
            ((C9670) abstractC13754).m25218();
        }
        this.f78022 = abstractC13753;
        if (abstractC13753.mo25225()) {
            this.f78065 = new EdgeEffect(getContext());
            this.f78045 = new EdgeEffect(getContext());
            if (this.f78030) {
                C13618.m33370(this.f78065);
                C13618.m33370(this.f78045);
            }
        } else {
            this.f78065 = null;
            this.f78045 = null;
        }
        if (z && abstractC13754 != null && (abstractC13753 instanceof C22572)) {
            while (i < abstractC13753.f43643.size()) {
                C14366 c14367 = abstractC13753.f43643.get(i);
                if (c14367.f45295 == i2 || c14367.f45294 > i2) {
                    iM53873 = m53873(((int) (this.f78066.m16189() * i)) + iM16189);
                    break;
                }
                i++;
            }
            if (this.f78064 == null) {
                m53694(getScrollX(), iM53873, true);
            }
        }
        this.f78002 = -1.0f;
        m53745();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m53997(int i) {
        C14540 c14540 = this.f78066;
        c14540.m35083(c14540.f18967.getTextSize(), i);
        m53738();
        this.f78022.mo25235();
        this.f78002 = -1.0f;
        invalidate();
    }

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public static void m53744(C24132 c24132) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = c24132.f78065;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = c24132.f78065.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = c24132.f77989;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= c24132.f77989.isFinished();
        }
        EdgeEffect edgeEffect3 = c24132.f78045;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= c24132.f78045.isFinished();
        }
        EdgeEffect edgeEffect4 = c24132.f78027;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= c24132.f78027.isFinished();
        }
        if (zIsFinished) {
            int i = C22666.f73603;
            c24132.postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: renamed from: ۫᩸, reason: not valid java name and contains not printable characters */
    public final void m54007() {
        this.f78073 = SystemClock.uptimeMillis();
        invalidate();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53913(InterfaceC11886 interfaceC11886) {
        this.f78114.add(interfaceC11886);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53908(C4388 c4388) {
        this.f78114.remove(c4388);
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo52299(int i, int i2) {
        if (m53872()) {
            return;
        }
        ArrayList arrayList = this.f78114;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((InterfaceC11886) arrayList.get(i3)).mo1160(i, i2);
        }
    }

    /* JADX INFO: renamed from: ۖ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m53884() {
        if (m53872()) {
            return true;
        }
        AbstractC13753 abstractC13753 = this.f78022;
        return abstractC13753 != null && abstractC13753.mo25237();
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String m53973() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Session diagnostics require the main thread");
        }
        StringBuilder sb = new StringBuilder("view=");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("\ntextOwner=");
        sb.append(Integer.toHexString(System.identityHashCode(this.f78058)));
        sb.append("\nviewSize=");
        sb.append(getWidth());
        sb.append("x");
        sb.append(getHeight());
        sb.append("\nattached=");
        sb.append(isAttachedToWindow());
        sb.append("\npreparing=");
        sb.append(this.f78103);
        sb.append("\npreparingManual=");
        sb.append(this.f78076);
        sb.append("\nawaitingPrepareFinish=");
        sb.append(this.f78024);
        sb.append("\nrestoringInstanceState=");
        sb.append(this.f78134);
        sb.append("\ncancelPrepare=");
        sb.append(this.f78019);
        sb.append("\ncontentLoading=");
        sb.append(this.f78072);
        sb.append("\nlargeChange=");
        sb.append(m53872());
        sb.append("\npendingScroll=");
        boolean z = false;
        sb.append(this.f78021 != null);
        sb.append("\nlayout=");
        AbstractC13753 abstractC13753 = this.f78022;
        sb.append(abstractC13753 == null ? "null" : abstractC13753.getClass().getName());
        sb.append("\nlayoutLoading=");
        AbstractC13753 abstractC13754 = this.f78022;
        sb.append(abstractC13754 != null && abstractC13754.mo25237());
        sb.append("\ntextPrepared=");
        C17418 c17418 = this.f78071;
        sb.append(c17418 != null && c17418.f56632);
        sb.append("\nlayoutPreparation=");
        sb.append(this.f78071 != null);
        sb.append("\nlastCloseCaptureWait=");
        sb.append(this.f78004);
        sb.append("\nbackgroundTextTasks=");
        sb.append(this.f77983);
        sb.append("\nactivePreferenceTask=");
        sb.append(this.f78067 != null);
        sb.append("\nsessionTask=");
        sb.append(this.f78112 != null);
        sb.append("\npreferencesPaused=");
        C15926 c15926 = this.f78112;
        if (c15926 != null && c15926.f51734) {
            z = true;
        }
        sb.append(z);
        sb.append("\nsoftWrap=");
        return C12669.m31437(this.f78043, "\n", sb);
    }

    /* JADX INFO: renamed from: ۧۤ, reason: not valid java name and contains not printable characters */
    public final boolean m53994() {
        if (m53872() || this.f78103 || this.f78024 || this.f78076 || this.f78134) {
            return false;
        }
        AbstractC13753 abstractC13753 = this.f78022;
        return abstractC13753.f43646 == this.f78058 && abstractC13753.m33641() && !this.f78022.f43643.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۟᩸, reason: not valid java name and contains not printable characters */
    public boolean m53748() {
        return m53994() && !m53884() && !this.f78072 && this.f78031 == null && this.f78021 == null && this.f78071 == null;
    }

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC17787 m53952() {
        return this.f78113;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m54088(int i, int i2) {
        AbstractC17787 abstractC17787 = this.f78113;
        if (abstractC17787 == null || !abstractC17787.m41626()) {
            AtomicInteger atomicInteger = this.f78059;
            atomicInteger.incrementAndGet();
            try {
                if (this.f77978) {
                    C5224 c5224 = this.f78008;
                    InterfaceC19106 interfaceC19106 = this.f78058;
                    c5224.getClass();
                    int i3 = i <= 0 ? 0 : i - 1;
                    int iIndexOf = TextUtils.indexOf((CharSequence) interfaceC19106, '\n', i3);
                    if (iIndexOf == -1) {
                        iIndexOf = interfaceC19106.length();
                    }
                    StringBuilder sb = new StringBuilder(C14540.f45741);
                    for (int iLastIndexOf = TextUtils.lastIndexOf(interfaceC19106, '\n', i3) + 1; iLastIndexOf < iIndexOf; iLastIndexOf++) {
                        char cCharAt = interfaceC19106.charAt(iLastIndexOf);
                        if (cCharAt != ' ' && cCharAt != '\t') {
                            break;
                        }
                        sb.append(cCharAt);
                    }
                    interfaceC19106.replace(i, i2, sb.toString());
                    if (i != i2) {
                        interfaceC19106.setSelection(sb.length() + i);
                    }
                } else {
                    this.f78058.replace(i, i2, C14540.f45741);
                    if (i != i2) {
                        mo52339(i + 1);
                    }
                }
                invalidate();
            } finally {
                atomicInteger.decrementAndGet();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53899(TextWatcher textWatcher) {
        this.f78006.add(textWatcher);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53904(Predicate predicate) {
        C9911.m25735(this.f78006, predicate);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m54067(int i) {
        int iM33646 = this.f78022.m33646(i);
        if (this.f78022.mo25225()) {
            return iM33646;
        }
        try {
            return this.f78022.f43643.get(iM33646).f45296;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m53936(int i, int[] iArr) {
        if (i >= 0 && i <= this.f78058.length()) {
            if (iArr.length < 2) {
                throw new IllegalArgumentException("lineColumn.length < 2");
            }
            try {
                if (m53872()) {
                    C15508 c15508Mo15350 = this.f78058.mo15350();
                    try {
                        int iM37179 = c15508Mo15350.m37179(i);
                        iArr[0] = iM37179;
                        iArr[1] = i - c15508Mo15350.m37174(iM37179);
                        c15508Mo15350.close();
                        return true;
                    } catch (Throwable th) {
                        try {
                            c15508Mo15350.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                int iM19185 = this.f78022.f43643.m19185(this.f78022.m33646(i));
                iArr[0] = this.f78022.f43643.m19188(iM19185);
                iArr[1] = i - this.f78022.f43643.m19176(iM19185);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m53977(int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            try {
                if (m53872()) {
                    C15508 c15508Mo15350 = this.f78058.mo15350();
                    try {
                        if (i < c15508Mo15350.m37175()) {
                            long jM37174 = ((long) c15508Mo15350.m37174(i)) + ((long) i2);
                            int i3 = jM37174 > ((long) c15508Mo15350.length()) ? -1 : (int) jM37174;
                            c15508Mo15350.close();
                            return i3;
                        }
                        c15508Mo15350.close();
                        return -1;
                    } catch (Throwable th) {
                        try {
                            c15508Mo15350.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                C6909 c6909 = this.f78022.f43643;
                int iM19167 = c6909.m19167(i);
                int iM19185 = iM19167 == -1 ? -1 : c6909.m19185(iM19167);
                if (iM19185 != -1) {
                    long j = ((long) this.f78022.f43643.get(iM19185).f45295) + ((long) i2);
                    if (j <= this.f78058.length()) {
                        return (int) j;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Point m53978(int i) {
        ?? Mo25225;
        int iM19176;
        int i2 = -1;
        if (m53872()) {
            int[] iArr = new int[2];
            return m53936(i, iArr) ? new Point(iArr[0] + 1, iArr[1] + 1) : new Point(-1, -1);
        }
        int iM33646 = this.f78022.m33646(i);
        try {
            Mo25225 = this.f78022.mo25225();
            try {
                if (Mo25225 != 0) {
                    int i3 = iM33646 + 1;
                    iM19176 = this.f78022.f43643.m19176(iM33646);
                    Mo25225 = i3;
                } else {
                    int iM19185 = this.f78022.f43643.m19185(iM33646);
                    int iM19188 = this.f78022.f43643.m19188(iM19185) + 1;
                    iM19176 = this.f78022.f43643.m19176(iM19185);
                    Mo25225 = iM19188;
                }
                i2 = (i - iM19176) + 1;
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            Mo25225 = -1;
        }
        return new Point(Mo25225, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53922(InterfaceC16497 interfaceC16497) {
        InterfaceC16497 interfaceC16498 = this.f78039;
        if (interfaceC16498 == interfaceC16497) {
            return;
        }
        if (this.f78094 != 0 && interfaceC16498 != null) {
            interfaceC16498.mo1354(false);
        }
        this.f78039 = interfaceC16497;
        if (this.f78094 == 0 || interfaceC16497 == null) {
            return;
        }
        interfaceC16497.mo1354(true);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m53761(C24132 c24132) {
        InterfaceC16497 interfaceC16497;
        int i = c24132.f78094 + 1;
        c24132.f78094 = i;
        if (i != 1 || (interfaceC16497 = c24132.f78039) == null) {
            return;
        }
        interfaceC16497.mo1354(true);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m53834(C24132 c24132) {
        InterfaceC16497 interfaceC16497;
        int i = c24132.f78094 - 1;
        c24132.f78094 = i;
        if (i != 0 || (interfaceC16497 = c24132.f78039) == null) {
            return;
        }
        interfaceC16497.mo1354(false);
    }

    /* JADX INFO: renamed from: ܿۤ, reason: not valid java name and contains not printable characters */
    public final void m54044() {
        C17107 c17107M53783;
        if (m53884() || (c17107M53783 = m53783(m53968())) == null) {
            return;
        }
        C17853 c17853 = this.f77981;
        C17107 c17107M41708 = c17853.m41708();
        if (c17107M41708 != null && Math.abs(c17107M41708.f55832 - c17107M53783.f55832) <= 3) {
            c17853.m41706();
        }
        this.f77995.m41702();
        c17853.m41704(c17107M53783);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m54003(int i, int i2) {
        if (m53884()) {
            return;
        }
        C17107 c17107M53783 = m53783(i);
        C17107 c17107M53784 = m53783(i2);
        if (c17107M53783 != null) {
            int i3 = c17107M53783.f55832;
            if (c17107M53784 == null || i3 == c17107M53784.f55832) {
                return;
            }
            C17853 c17853 = this.f77981;
            C17107 c17107M41708 = c17853.m41708();
            if (c17107M41708 != null && Math.abs(c17107M41708.f55832 - i3) <= 3) {
                c17853.m41706();
            }
            this.f77995.m41702();
            c17853.m41704(c17107M53783);
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m54097() {
        return this.f77981.m41709();
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m54060() {
        return this.f77995.m41709();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m54086() {
        C17107 c17107M53783;
        if (m53884()) {
            return;
        }
        C17853 c17853 = this.f77981;
        if (c17853.m41709() && (c17107M53783 = m53783(m53968())) != null) {
            this.f77995.m41704(c17107M53783);
            m53699(c17853.m41706());
        }
    }

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final void m54019() {
        C17107 c17107M53783;
        if (m53884()) {
            return;
        }
        C17853 c17853 = this.f77995;
        if (c17853.m41709() && (c17107M53783 = m53783(m53968())) != null) {
            this.f77981.m41704(c17107M53783);
            m53699(c17853.m41706());
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private C17107 m53783(int i) {
        int[] iArr = new int[2];
        if (m53936(i, iArr)) {
            return new C17107(iArr[0], iArr[1]);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m53699(C17107 c17107) {
        int i = c17107.f55832;
        int i2 = c17107.f55831;
        if (i < 0 || i2 < 0 || this.f78022.f43643.isEmpty()) {
            return;
        }
        int i3 = this.f78022.f43643.m19187().f45296;
        if (i > i3) {
            i = i3;
        }
        int iM53977 = m53977(i, i2);
        if (iM53977 == -1) {
            iM53977 = this.f78058.length();
        }
        this.f78058.setSelection(iM53977);
        this.f78002 = -1.0f;
        m53845();
        m53935(iM53977, false);
        m54007();
        requestFocus();
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean m53957() {
        return !m54083() && this.f78058.mo11043().m41106();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m53999() {
        return !m54083() && this.f78058.mo11043().m41119();
    }

    /* JADX INFO: renamed from: ܺ᩸ */
    public void mo52325() {
        m53701(this.f78058, false);
    }

    /* JADX INFO: renamed from: ֡ۤ */
    public void mo52287() {
        m53701(this.f78058, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m53701(InterfaceC19106 interfaceC19106, boolean z) {
        InterfaceC19106 interfaceC19107 = this.f78058;
        try {
            boolean z2 = true;
            boolean z3 = (!this.f78013 || this.f77990 == null || this.f77990.f63313) ? false : true;
            if (m54083()) {
                return;
            }
            if (!m53884() || z3) {
                this.f78002 = -1.0f;
                if (this.f78013 || !interfaceC19106.mo11043().m41120(z)) {
                    z2 = false;
                }
                if (z2) {
                    m53996();
                }
                try {
                    if (z) {
                        interfaceC19106.mo11041();
                    } else {
                        interfaceC19106.mo11033();
                    }
                    if (z2) {
                        m53987();
                    }
                    if (this.f78058 != interfaceC19106) {
                        return;
                    }
                    this.f78100 = SystemClock.uptimeMillis();
                    m53845();
                    InterfaceC12943 interfaceC12943 = this.f77988;
                    if (interfaceC12943 != null) {
                        interfaceC12943.mo15545(this.f78058.isChanged());
                        this.f77988.mo15546(m53957(), m53999());
                    }
                    m53931(false);
                    invalidate();
                } catch (Throwable th) {
                    if (z2) {
                        m53987();
                    }
                    throw th;
                }
            }
        } catch (UncheckedIOException | C24219 e) {
            if (!m53943(interfaceC19107, e)) {
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ᩶ۤ, reason: not valid java name and contains not printable characters */
    public final void m54065() {
        m54091(false);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m54091(boolean z) {
        this.f78058.mo11043().m41098(z);
        InterfaceC12943 interfaceC12943 = this.f77988;
        if (interfaceC12943 != null) {
            interfaceC12943.mo15546(m53957(), m53999());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53916(InterfaceC12943 interfaceC12943) {
        this.f77988 = interfaceC12943;
    }

    /* JADX INFO: renamed from: ᩳۤ, reason: not valid java name and contains not printable characters */
    public final void m54048() {
        this.f78058.mo11043().m41111();
        InterfaceC12943 interfaceC12943 = this.f77988;
        if (interfaceC12943 != null) {
            interfaceC12943.mo15546(m53957(), m53999());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53902(String str) {
        String string = C14540.m35080(str).toString();
        int iM53968 = m53968();
        int iM53882 = m53882();
        if (iM53968 > iM53882) {
            iM53882 = iM53968;
            iM53968 = iM53882;
        }
        this.f78058.replace(iM53968, iM53882, string);
        mo52339(string.length() + iM53968);
        m53931(false);
    }

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public final int m53954() {
        return this.f78066.m16212();
    }

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public final int m54006() {
        return this.f78066.f45799;
    }

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final int m54038() {
        return this.f78022.m33650() ? this.f78022.f43636.size() : this.f78022.f43643.size();
    }

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public final int m54064() {
        if (!m53872()) {
            if (this.f78022.f43643.size() == 0) {
                return 1;
            }
            AbstractC13753 abstractC13753 = this.f78022;
            return abstractC13753.f43643.get(abstractC13753.f43643.size() - 1).f45296 + 1;
        }
        C15508 c15508Mo15350 = this.f78058.mo15350();
        try {
            int iM37175 = (int) c15508Mo15350.m37175();
            c15508Mo15350.close();
            return iM37175;
        } catch (Throwable th) {
            try {
                c15508Mo15350.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m54017(int i) {
        if (m53872()) {
            int iM53977 = m53977(i, 0);
            if (iM53977 >= 0) {
                mo52339(iM53977);
                return true;
            }
        } else if (i < m54064()) {
            C14366 c14366 = this.f78022.f43643.get(i);
            int i2 = i;
            while (c14366.f45296 < i) {
                i2++;
                c14366 = this.f78022.f43643.get(i2);
            }
            int i3 = c14366.f45295;
            m54003(m53968(), i3);
            mo52339(i3);
            m53935(i3, false);
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m54052(boolean z) {
        this.f77978 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m53876(boolean z) {
        this.f78116 = z;
    }

    /* JADX INFO: renamed from: ᩳ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m54049() {
        return this.f78116;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m53998(boolean z) {
        m54001();
        this.f78098 = z;
    }

    /* JADX INFO: renamed from: ۚۤ, reason: not valid java name and contains not printable characters */
    public final boolean m53953() {
        return this.f78098;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m54024(int i) {
        if (!m53872()) {
            if (i >= this.f78022.f43643.size()) {
                return;
            }
            C14366 c14366 = this.f78022.f43643.get(i);
            int i2 = i;
            while (c14366.f45296 < i && (i2 = i2 + 1) < this.f78022.f43643.size()) {
                c14366 = this.f78022.f43643.get(i2);
            }
            int i3 = c14366.f45295;
            int i4 = c14366.f45294;
            while (true) {
                i2++;
                if (i2 < this.f78022.f43643.size()) {
                    C14366 c14367 = this.f78022.f43643.get(i2);
                    if (c14367.f45296 != i) {
                        break;
                    } else {
                        i4 = c14367.f45294;
                    }
                } else {
                    break;
                }
            }
            mo52316(i3, i4);
            m53935(i3, false);
            return;
        }
        C15508 c15508Mo15350 = this.f78058.mo15350();
        if (i >= 0) {
            try {
                if (i < c15508Mo15350.m37175()) {
                    int iM37174 = c15508Mo15350.m37174(i);
                    int i5 = i + 1;
                    mo52316(iM37174, ((long) i5) < c15508Mo15350.m37175() ? c15508Mo15350.m37174(i5) - 1 : c15508Mo15350.length());
                    c15508Mo15350.close();
                    return;
                }
            } catch (Throwable th) {
                try {
                    c15508Mo15350.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        c15508Mo15350.close();
    }

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final C10155 m54061() {
        return this.f78025;
    }

    /* JADX INFO: renamed from: ۛ᩷, reason: not valid java name and contains not printable characters */
    public final void m53959() {
        int i = this.f78082 + 1;
        this.f78082 = i;
        this.f78049 = i;
        C3248 c3248 = this.f78093;
        if (c3248 == null || c3248.f10582.mo15344() == c3248.f10580) {
            return;
        }
        m53848("Session text changed before view was ready");
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m54016(boolean z) {
        if (z) {
            this.f78126.incrementAndGet();
        }
        this.f78058.mo11051(z);
        this.f78088 = z ? -1 : this.f78049;
        InterfaceC12943 interfaceC12943 = this.f77988;
        if (interfaceC12943 != null) {
            interfaceC12943.mo15545(z);
        }
    }

    /* JADX INFO: renamed from: ᩺ۤ, reason: not valid java name and contains not printable characters */
    public final void m54103() {
        this.f78058.mo11051(false);
        this.f78088 = this.f78049;
        if (this.f77988 != null) {
            post(new RunnableC19699(0, this));
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C16672 m54042() {
        return new C16672(this);
    }

    /* JADX INFO: renamed from: ᩸ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m54094() {
        return (this.f78103 || this.f78024 || this.f78076 || this.f78134 || this.f78058.mo11034()) ? false : true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m54081(C16672 c16672) {
        return this.f78058 == c16672.f53855 && this.f78058.mo15344() == c16672.f53857 && this.f78049 == c16672.f53854 && this.f78126.get() == c16672.f53853 && this.f78066.f45796.equals(c16672.f53856);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m53942(C16672 c16672) {
        if (m54081(c16672)) {
            m54016(false);
            if (this.f78058 == c16672.f53855 && this.f78058.mo15344() == c16672.f53857 && this.f78049 == c16672.f53854 && !this.f78058.isChanged()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۘ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m53890() {
        return this.f78058.isChanged();
    }

    /* JADX INFO: renamed from: ܿ᩸, reason: not valid java name and contains not printable characters */
    private void m53804() {
        C14540 c14540 = this.f78066;
        if (c14540.f45769 && c14540.f45744) {
            boolean z = c14540.f45816;
            RectF rectF = this.f78061;
            if (z) {
                rectF.left -= this.f78022.f43630;
            } else {
                rectF.right += this.f78022.f43630;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53898(RectF rectF, int i) {
        this.f78022.m33645(rectF, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53931(boolean z) {
        if (m53872()) {
            return;
        }
        HandlerC0308 handlerC0308 = this.f78037;
        if (z) {
            handlerC0308.removeMessages(1);
            m53776(Selection.getSelectionEnd(this.f78058), true);
        } else {
            if (handlerC0308.hasMessages(1)) {
                return;
            }
            handlerC0308.sendEmptyMessage(1);
        }
    }

    /* JADX INFO: renamed from: ۢۤ, reason: not valid java name and contains not printable characters */
    public final void m53975() {
        this.f78037.removeMessages(1);
    }

    /* JADX INFO: renamed from: ᩳ᩸, reason: not valid java name and contains not printable characters */
    private boolean m53807() {
        if (!m53994() || this.f78022.mo25237() || m54108() <= 0 || m53993() <= 0) {
            return false;
        }
        AbstractC13753 abstractC13753 = this.f78022;
        return !(abstractC13753 instanceof C9670) || ((C9670) abstractC13753).m25234(m54108());
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private boolean m53796(int i, int i2) {
        m53864();
        boolean zM53872 = m53872();
        OverScroller overScroller = this.f78119;
        AtomicInteger atomicInteger = this.f78055;
        if (zM53872) {
            atomicInteger.incrementAndGet();
            overScroller.forceFinished(true);
            this.f78064 = new C6232(this, i, i2);
            return false;
        }
        if (!m53994()) {
            return false;
        }
        atomicInteger.incrementAndGet();
        overScroller.forceFinished(true);
        if (m53807()) {
            return true;
        }
        this.f78064 = new C6232(this, i, i2);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩺᩸, reason: not valid java name and contains not printable characters */
    public void m53864() {
        this.f78064 = null;
        if (this.f78089 != null) {
            this.f78089 = null;
            this.f78119.forceFinished(true);
        }
    }

    /* JADX INFO: renamed from: ۘ᩸, reason: not valid java name and contains not printable characters */
    private void m53689() {
        if (this.f78089 == null) {
            return;
        }
        OverScroller overScroller = this.f78119;
        if (!overScroller.isFinished() && this.f78089.m17857(this)) {
            this.f78064 = this.f78089;
        }
        this.f78089 = null;
        overScroller.forceFinished(true);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m53827(int i, int i2, int i3, int i4) {
        this.f78089 = new C6232(this, i, i2);
        this.f78060 = false;
        this.f78119.startScroll(getScrollX(), this.f78104, i3 - getScrollX(), i4 - this.f78104);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۗ᩸, reason: not valid java name and contains not printable characters */
    public boolean m53685() {
        C6232 c6232 = this.f78064;
        if (c6232 != null) {
            if (!c6232.m17857(this)) {
                m53864();
                return false;
            }
            if (m53807()) {
                C6232 c6233 = this.f78064;
                int i = c6233.f21158;
                int iMax = Math.max(0, Math.min(c6233.f21162, this.f78058.length()));
                m53864();
                if (i == 1) {
                    m53935(iMax, true);
                    return true;
                }
                if (i == 2) {
                    m54077(true);
                    return true;
                }
                if (i == 3) {
                    m54074(iMax, true);
                    return true;
                }
                if (i != 4) {
                    return true;
                }
                m53984(true);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m54036(int i) {
        if (this.f78064 == null && this.f78089 == null) {
            m53694(0, i, false);
        }
    }

    /* JADX INFO: renamed from: ۧ᩷, reason: not valid java name and contains not printable characters */
    public final int m53995() {
        return Math.min(this.f78066.f45809, Math.max(0, m53993() / 2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m53935(int i, boolean z) {
        this.f78037.removeMessages(1);
        return m53776(i, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:44:0x00cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d5  */
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean m53776(int i, boolean z) {
        boolean z2;
        int iM53873;
        int iM53948;
        if (!m53796(1, i)) {
            return false;
        }
        if (!z && (!isAttachedToWindow() || getVisibility() != 0)) {
            z = true;
        }
        this.f78119.forceFinished(true);
        try {
            this.f78022.mo33625(this.f78061, i);
            m53804();
            int scrollX = getScrollX();
            int iM53874 = this.f78104;
            int i2 = this.f78035;
            if (i2 != -1) {
                scrollX = m53948(i2);
                this.f78035 = -1;
                z2 = true;
            } else {
                z2 = false;
            }
            int i3 = this.f77993;
            if (i3 != -1) {
                iM53874 = m53873(i3);
                this.f77993 = -1;
                z2 = true;
            }
            if (this.f78022.mo25225()) {
                float fMax = Math.max(this.f78066.m16189(), this.f78066.f45772.getIntrinsicWidth());
                float f = this.f78061.left;
                float f2 = scrollX;
                if (f < f2 + fMax) {
                    iM53948 = m53948((int) (f - fMax));
                } else {
                    float fMax2 = Math.max(m54108() - fMax, 0.0f);
                    float f3 = this.f78061.right;
                    if (f3 > f2 + fMax2) {
                        iM53948 = m53948((int) (f3 - fMax2));
                    } else {
                        iM53948 = m53948(scrollX);
                        if (iM53948 == scrollX) {
                            scrollX = iM53948;
                        }
                    }
                }
                scrollX = iM53948;
                z2 = true;
            }
            float f4 = this.f78061.top;
            float f5 = iM53874;
            if (f4 < f5) {
                iM53873 = m53873((int) f4);
            } else {
                float fMax3 = Math.max(m53993() - m53995(), 0);
                float f6 = this.f78061.bottom;
                if (f6 > f5 + fMax3) {
                    iM53873 = m53873((int) (f6 - fMax3));
                } else {
                    iM53873 = m53873(iM53874);
                    if (iM53873 != iM53874) {
                    }
                    if (z2) {
                        if (z) {
                            m53694(scrollX, iM53873, true);
                        } else {
                            m53827(1, i, scrollX, iM53873);
                        }
                    }
                    postInvalidate();
                    return z2;
                }
            }
            z2 = true;
            if (z2) {
                if (z) {
                    m53694(scrollX, iM53873, true);
                } else {
                    m53827(1, i, scrollX, iM53873);
                }
            }
            postInvalidate();
            return z2;
        } catch (IndexOutOfBoundsException unused) {
            this.f77993 = -1;
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:22:0x007c  */
    /* JADX WARN: Code duplicated, block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public void m53687(int i) {
        int iM53948;
        boolean z;
        if (!m53872() && this.f78022.mo25225()) {
            m53864();
            this.f78037.removeMessages(1);
            this.f78119.forceFinished(true);
            try {
                this.f78022.mo33625(this.f78061, i);
                m53804();
                int scrollX = getScrollX();
                float fMax = Math.max(this.f78066.m16189(), this.f78066.f45772.getIntrinsicWidth());
                float f = this.f78061.left;
                float f2 = scrollX;
                if (f < f2 + fMax) {
                    iM53948 = m53948((int) (f - fMax));
                } else {
                    float fMax2 = Math.max(m54108() - fMax, 0.0f);
                    float f3 = this.f78061.right;
                    if (f3 > f2 + fMax2) {
                        iM53948 = m53948((int) (f3 - fMax2));
                    } else {
                        int iM53949 = m53948(scrollX);
                        if (iM53949 != scrollX) {
                            iM53948 = iM53949;
                        } else {
                            iM53948 = iM53949;
                            z = false;
                        }
                        if (z) {
                            m53694(iM53948, this.f78104, true);
                            invalidate();
                        }
                    }
                }
                z = true;
                if (z) {
                    m53694(iM53948, this.f78104, true);
                    invalidate();
                }
            } catch (IndexOutOfBoundsException unused) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0070  */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m54074(int i, boolean z) {
        boolean z2;
        int i2;
        this.f78037.removeMessages(1);
        if (m53796(3, i)) {
            if (!z && (!isAttachedToWindow() || getVisibility() != 0)) {
                z = true;
            }
            try {
                this.f78022.mo33625(this.f78061, i);
                m53804();
                int scrollX = getScrollX();
                int i3 = this.f78104;
                if (this.f78022.mo25225()) {
                    float fMax = Math.max(this.f78022.mo33629(), m54108() / 3);
                    float f = this.f78061.left;
                    float f2 = scrollX;
                    if (f < f2 + fMax) {
                        i2 = (int) (f - fMax);
                        if (i2 < 0) {
                            i2 = 0;
                        }
                    } else {
                        float fMax2 = Math.max(m54108() - fMax, 0.0f);
                        float f3 = this.f78061.right;
                        if (f3 > f2 + fMax2) {
                            i2 = (int) (f3 - fMax2);
                        } else {
                            z2 = false;
                            i2 = scrollX;
                        }
                    }
                    z2 = true;
                } else {
                    z2 = false;
                    i2 = scrollX;
                }
                RectF rectF = this.f78061;
                int iM53873 = m53873(Math.max((int) (((rectF.top + rectF.bottom) / 2.0f) - (m53993() / 2.0f)), (int) ((this.f78061.bottom + m53995()) - m53993())));
                if (iM53873 != i3) {
                    z2 = true;
                } else {
                    iM53873 = i3;
                }
                int iM53948 = m53948(i2);
                int iM53874 = m53873(iM53873);
                if (z2 | ((iM53948 == scrollX && iM53874 == i3) ? false : true)) {
                    if (z) {
                        m53694(iM53948, iM53874, true);
                    } else {
                        m53827(3, i, iM53948, iM53874);
                    }
                }
                postInvalidate();
            } catch (IndexOutOfBoundsException unused) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0080  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00df  */
    /* JADX WARN: Code duplicated, block: B:49:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:53:0x0105  */
    /* JADX WARN: Code duplicated, block: B:57:0x0117  */
    /* JADX WARN: Code duplicated, block: B:61:0x011e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0122 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x0124  */
    /* JADX WARN: Code duplicated, block: B:66:0x0128  */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m54077(boolean z) {
        boolean z2;
        int i;
        float f;
        float f2;
        float fMax;
        float f3;
        int i2;
        int iM53948;
        int iM53873;
        boolean z3;
        float f4;
        float f5;
        float fMax2;
        float f6;
        this.f78037.removeMessages(1);
        if (m53796(2, 0)) {
            if (!z && (!isAttachedToWindow() || getVisibility() != 0)) {
                z = true;
            }
            this.f78119.forceFinished(true);
            int iM53968 = m53968();
            int iM53882 = m53882();
            if (iM53968 == iM53882) {
                m53931(z);
                return;
            }
            if (iM53968 <= iM53882) {
                iM53882 = iM53968;
                iM53968 = iM53882;
            }
            int scrollX = getScrollX();
            int i3 = this.f78104;
            float fMo33629 = this.f78022.mo33629();
            this.f78022.mo33625(this.f78061, iM53968);
            m53804();
            if (this.f78022.mo25225()) {
                float f7 = this.f78061.left;
                float f8 = scrollX;
                if (f7 < f8 + fMo33629) {
                    scrollX = (int) (f7 - fMo33629);
                    z2 = true;
                    if (scrollX < 0) {
                        scrollX = 0;
                    }
                } else {
                    float fMax3 = Math.max(m54108() - fMo33629, 0.0f);
                    float f9 = this.f78061.right;
                    if (f9 > f8 + fMax3) {
                        scrollX = (int) (f9 - fMax3);
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
            } else {
                z2 = false;
            }
            float f10 = this.f78061.top;
            float f11 = i3;
            if (f10 >= f11) {
                float fMax4 = Math.max(m53993() - m53995(), 0);
                float f12 = this.f78061.bottom;
                if (f12 > f11 + fMax4) {
                    i = (int) (f12 - fMax4);
                }
                this.f78022.mo33625(this.f78061, iM53882);
                m53804();
                if (this.f78022.mo25225()) {
                    f4 = this.f78061.left;
                    f5 = scrollX;
                    if (f4 < f5 + fMo33629) {
                        scrollX = (int) (f4 - fMo33629);
                        z2 = true;
                        if (scrollX < 0) {
                            scrollX = 0;
                        }
                    } else {
                        fMax2 = Math.max(m54108() - fMo33629, 0.0f);
                        f6 = this.f78061.right;
                        if (f6 > f5 + fMax2) {
                            scrollX = (int) (f6 - fMax2);
                            z2 = true;
                        }
                    }
                }
                f = this.f78061.top;
                f2 = i3;
                if (f < f2) {
                    fMax = Math.max(m53993() - m53995(), 0);
                    f3 = this.f78061.bottom;
                    if (f3 > f2 + fMax) {
                        i2 = (int) (f3 - fMax);
                    }
                    iM53948 = m53948(scrollX);
                    iM53873 = m53873(i3);
                    if (iM53948 == getScrollX() || iM53873 != this.f78104) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z2 | z3) {
                        if (z) {
                            m53694(iM53948, iM53873, true);
                        } else {
                            m53827(2, 0, iM53948, iM53873);
                        }
                    }
                    postInvalidate();
                }
                i2 = (int) f;
                i3 = i2;
                z2 = true;
                iM53948 = m53948(scrollX);
                iM53873 = m53873(i3);
                if (iM53948 == getScrollX()) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (z2 | z3) {
                    if (z) {
                        m53694(iM53948, iM53873, true);
                    } else {
                        m53827(2, 0, iM53948, iM53873);
                    }
                }
                postInvalidate();
            }
            i = (int) f10;
            i3 = i;
            z2 = true;
            this.f78022.mo33625(this.f78061, iM53882);
            m53804();
            if (this.f78022.mo25225()) {
                f4 = this.f78061.left;
                f5 = scrollX;
                if (f4 < f5 + fMo33629) {
                    scrollX = (int) (f4 - fMo33629);
                    z2 = true;
                    if (scrollX < 0) {
                        scrollX = 0;
                    }
                } else {
                    fMax2 = Math.max(m54108() - fMo33629, 0.0f);
                    f6 = this.f78061.right;
                    if (f6 > f5 + fMax2) {
                        scrollX = (int) (f6 - fMax2);
                        z2 = true;
                    }
                }
            }
            f = this.f78061.top;
            f2 = i3;
            if (f < f2) {
                fMax = Math.max(m53993() - m53995(), 0);
                f3 = this.f78061.bottom;
                if (f3 > f2 + fMax) {
                    i2 = (int) (f3 - fMax);
                }
                iM53948 = m53948(scrollX);
                iM53873 = m53873(i3);
                if (iM53948 == getScrollX()) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (z2 | z3) {
                    if (z) {
                        m53694(iM53948, iM53873, true);
                    } else {
                        m53827(2, 0, iM53948, iM53873);
                    }
                }
                postInvalidate();
            }
            i2 = (int) f;
            i3 = i2;
            z2 = true;
            iM53948 = m53948(scrollX);
            iM53873 = m53873(i3);
            if (iM53948 == getScrollX()) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (z2 | z3) {
                if (z) {
                    m53694(iM53948, iM53873, true);
                } else {
                    m53827(2, 0, iM53948, iM53873);
                }
            }
            postInvalidate();
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008d  */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m53984(boolean z) {
        boolean z2;
        int iM53873;
        this.f78037.removeMessages(1);
        if (m53796(4, 0)) {
            if (!z && (!isAttachedToWindow() || getVisibility() != 0)) {
                z = true;
            }
            this.f78119.forceFinished(true);
            int iM53968 = m53968();
            int iM53882 = m53882();
            if (iM53968 == iM53882) {
                m54074(iM53968, z);
                return;
            }
            if (iM53968 <= iM53882) {
                iM53882 = iM53968;
                iM53968 = iM53882;
            }
            int scrollX = getScrollX();
            int i = this.f78104;
            float fMax = Math.max(this.f78022.mo33629(), m54108() / 3);
            this.f78022.mo33625(this.f78061, iM53968);
            m53804();
            float f = this.f78061.bottom;
            if (this.f78022.mo25225()) {
                float f2 = this.f78061.left;
                float f3 = scrollX;
                if (f2 < f3 + fMax) {
                    scrollX = (int) (f2 - fMax);
                    if (scrollX < 0) {
                        scrollX = 0;
                    }
                } else {
                    float fMax2 = Math.max(m54108() - fMax, 0.0f);
                    float f4 = this.f78061.right;
                    if (f4 > f3 + fMax2) {
                        scrollX = (int) (f4 - fMax2);
                    } else {
                        z2 = false;
                    }
                }
                z2 = true;
            } else {
                z2 = false;
            }
            this.f78022.mo33625(this.f78061, iM53882);
            m53804();
            float f5 = this.f78061.top;
            if (this.f78022.mo25225()) {
                float f6 = this.f78061.left;
                float f7 = scrollX;
                if (f6 < f7 + fMax) {
                    scrollX = (int) (f6 - fMax);
                    if (scrollX < 0) {
                        scrollX = 0;
                    }
                } else {
                    float fMax3 = Math.max(m54108() - fMax, 0.0f);
                    float f8 = this.f78061.right;
                    if (f8 > f7 + fMax3) {
                        scrollX = (int) (f8 - fMax3);
                    }
                }
                z2 = true;
            }
            if (f - f5 >= m53993() ? (iM53873 = m53873((int) f5)) != this.f78104 : (iM53873 = m53873((int) (((f5 + f) / 2.0f) - (m53993() / 2.0f)))) != this.f78104) {
                i = iM53873;
                z2 = true;
            }
            int iM53948 = m53948(scrollX);
            int iM53874 = m53873(i);
            if (((iM53948 == getScrollX() && iM53874 == this.f78104) ? false : true) | z2) {
                if (z) {
                    m53694(iM53948, iM53874, true);
                } else {
                    m53827(4, 0, iM53948, iM53874);
                }
            }
            postInvalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷ᩴ, reason: not valid java name and contains not printable characters */
    public void m53845() {
        this.f78111 = -1;
        this.f78092 = -1;
    }

    /* JADX INFO: renamed from: ᩹ */
    public void mo52339(int i) {
        BaseInputConnection.removeComposingSpans(this.f78058);
        this.f78058.setSelection(i);
        m53845();
        this.f78002 = -1.0f;
        invalidate();
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo52316(int i, int i2) {
        BaseInputConnection.removeComposingSpans(this.f78058);
        this.f78058.setSelection(i, i2);
        m53845();
        this.f78002 = -1.0f;
        invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0027  */
    /* JADX INFO: renamed from: ۗ */
    public void mo52291(int i) {
        if (i != 0 && i != 1 && i != 2) {
            throw new IllegalArgumentException();
        }
        int i2 = this.f78043;
        if (i2 != i) {
            if (i2 == 0 || i == 0) {
                m53698(AbstractC13753.m33599(this, this.f78058, this.f78066, i), true);
            } else {
                AbstractC13753 abstractC13753 = this.f78022;
                if (!(abstractC13753 instanceof C9670)) {
                    m53698(AbstractC13753.m33599(this, this.f78058, this.f78066, i), true);
                } else {
                    ((C9670) abstractC13753).m25231(i == 1);
                }
            }
            this.f78043 = i;
            m54036(this.f78104);
            invalidate();
        }
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final void m53885(boolean z) {
        C14540 c14540 = this.f78066;
        if (c14540.f45763 != z) {
            c14540.f45763 = z;
            AbstractC13753 abstractC13753 = this.f78022;
            if (abstractC13753 instanceof C9670) {
                C9670 c9670 = (C9670) abstractC13753;
                c9670.m25231(c9670.m25227());
                m54036(this.f78104);
                invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final int m54009() {
        return this.f78043;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m53981(float f) {
        m54071(f * this.f78066.f18979);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53896(float f) {
        if (f < 0.8f || f > 2.0f) {
            throw new IllegalArgumentException("Line spacing must be between 0.8 and 2.0");
        }
        if (this.f78066.m16208() == f) {
            return;
        }
        this.f78119.forceFinished(true);
        float fM16189 = this.f78066.m16189();
        double d = fM16189 > 0.0f ? ((double) this.f78104) / ((double) fM16189) : 0.0d;
        this.f78055.incrementAndGet();
        this.f78066.mo16197(f);
        AbstractC13753 abstractC13753 = this.f78022;
        if (abstractC13753 instanceof C22572) {
            ((C22572) abstractC13753).m50891();
        }
        m53738();
        m53875(getScrollX(), m53873((int) Math.min(2147483647L, Math.round(d * ((double) this.f78066.m16189())))));
        this.f78002 = -1.0f;
        requestLayout();
        invalidate();
    }

    /* JADX INFO: renamed from: ܺ᩷, reason: not valid java name and contains not printable characters */
    public final float m54034() {
        C14540 c14540 = this.f78066;
        return c14540.f18967.getTextSize() / c14540.f18979;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m54071(float f) {
        this.f78066.m35090(f);
        m53738();
        this.f78022.mo25235();
        this.f78002 = -1.0f;
        invalidate();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53897(float f, int i) {
        C14540 c14540 = this.f78066;
        c14540.m35083(f * c14540.f18979, i);
        m53738();
        this.f78022.mo25235();
        this.f78002 = -1.0f;
        invalidate();
    }

    /* JADX INFO: renamed from: ۬᩸, reason: not valid java name and contains not printable characters */
    private void m53781() {
        C16800 c16800 = this.f78086;
        if (c16800 != null) {
            m53923(c16800);
        } else {
            m53903(this.f78066.f45783, true);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53923(C16800 c16800) {
        if (c16800 != null) {
            if (!this.f78076 && !this.f78134) {
                this.f77996 = null;
            }
            this.f78033.m4839();
            this.f78066.f45755 = this.f78033.m4808(c16800);
            C14540 c14540 = this.f78066;
            boolean z = c14540.f45755;
            if (!z) {
                c16800 = null;
            }
            this.f78086 = c16800;
            c14540.f45783 = "Text";
            if (z) {
                this.f78033.m4830((CharSequence) this.f78058);
            }
            m53862(true);
            return;
        }
        m53903((String) null, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53903(String str, boolean z) {
        this.f78086 = null;
        if (!this.f78076 && !this.f78134) {
            this.f77996 = null;
        }
        this.f78033.m4839();
        if (str == null) {
            str = "Text";
        }
        if (this.f78033.m4833(str)) {
            this.f78033.m4830((CharSequence) this.f78058);
            C14540 c14540 = this.f78066;
            c14540.f45783 = str;
            c14540.f45755 = true;
        } else if (str.startsWith(".") && this.f78033.m4807(str)) {
            this.f78033.m4830((CharSequence) this.f78058);
            C14540 c14541 = this.f78066;
            c14541.f45783 = str;
            c14541.f45755 = true;
        } else {
            this.f78066.f45755 = false;
        }
        m53862(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    private void m53862(boolean z) {
        boolean z2 = this.f78066.f45755;
        C17243 c17243 = this.f78029;
        if (z2) {
            C1314 c1314 = this.f78033;
            if (c1314.m4840()) {
                c17243.m40504(c1314.m4811());
            } else {
                c17243.m40504(C17243.f56170);
            }
        } else {
            c17243.m40504(C17243.f56170);
        }
        this.f78022.mo25219();
        m54030();
        if (z) {
            postInvalidate();
        }
    }

    /* JADX INFO: renamed from: ֫ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m53878() {
        if ((!m53872() || m53972()) && !this.f78103) {
            return ((this.f78024 && this.f78122 != this.f78046) || this.f78076 || this.f78134) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙۤ, reason: not valid java name and contains not printable characters */
    public final boolean m53945() {
        return (((!this.f78103 || !this.f78024) && (!m53872() || m53972())) || this.f78076 || this.f78134) ? false : true;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m54018(int i, int i2) {
        if (m53872() || !this.f78022.mo25239(i, i2)) {
            return false;
        }
        if (this.f77992) {
            return true;
        }
        m54030();
        invalidate();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m53944(int[] iArr) {
        return m53731(iArr, false, 0, 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m53934(int i, int i2, int[] iArr) {
        return m53731(iArr, true, i, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m53731(int[] iArr, boolean z, int i, int i2) {
        if (iArr == null || (iArr.length & 1) != 0) {
            throw new IllegalArgumentException("Invalid syntax dirty ranges");
        }
        boolean z2 = this.f77992;
        this.f77992 = true;
        try {
            return m53843(iArr, z, i, i2);
        } finally {
            this.f77992 = z2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m53730(boolean z, int i, int i2, int i3, int i4, int i5, int i6) {
        C17243 c17243;
        boolean z2 = this.f77992;
        this.f77992 = true;
        try {
            if (!(m54018(i, i2) && (i3 < 0 || m54018(i3, i4)))) {
                return false;
            }
            if (!z2) {
                if (z && (c17243 = this.f78029) != null) {
                    c17243.m40501(m53968(), m53882(), i5, i6);
                } else {
                    m54030();
                }
                invalidate();
            }
            return true;
        } finally {
            this.f77992 = z2;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m53843(int[] iArr, boolean z, int i, int i2) {
        boolean zM53730;
        int i3 = 0;
        while (true) {
            int i4 = i3 + 3;
            if (i4 >= iArr.length) {
                if (i3 >= iArr.length) {
                    return true;
                }
                if (z) {
                    return m53730(true, iArr[i3], iArr[i3 + 1], -1, -1, i, i2);
                }
                return m54018(iArr[i3], iArr[i3 + 1]);
            }
            if (!z) {
                zM53730 = m53730(false, iArr[i3], iArr[i3 + 1], iArr[i3 + 2], iArr[i4], 0, 0);
            } else {
                zM53730 = m53730(true, iArr[i3], iArr[i3 + 1], iArr[i3 + 2], iArr[i4], i, i2);
            }
            if (!zM53730) {
                return false;
            }
            i3 += 4;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m54037(boolean z) {
        this.f78066.m16207(z);
        this.f78002 = -1.0f;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m54059(boolean z) {
        this.f78066.m16223(z);
        this.f78002 = -1.0f;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m54096(boolean z) {
        C14540 c14540 = this.f78066;
        if (c14540.f45769 != z) {
            c14540.f45769 = z;
        }
        this.f78002 = -1.0f;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m54004(boolean z) {
        C14540 c14540 = this.f78066;
        if (c14540.f45744 != z) {
            c14540.f45744 = z;
        }
        this.f78002 = -1.0f;
    }

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public final int m54043() {
        return this.f78017;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۫ᩴ, reason: not valid java name and contains not printable characters */
    public void m53778() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            post(new RunnableC15052(2, this));
        } else {
            setPadding(getPaddingLeft(), getPaddingTop() - this.f78017, getPaddingRight(), getPaddingBottom());
        }
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        C14540 c14540 = this.f78066;
        int iMax = Math.max(0, (c14540 == null ? 0 : (int) Math.ceil(Math.max(0.0f, c14540.m16215() - c14540.m16203()))) - i2);
        this.f78017 = iMax;
        super.setPadding(i, i2 + iMax, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۚᩴ, reason: not valid java name and contains not printable characters */
    public void m53738() {
        m53778();
        C22329 c22329 = this.f78132;
        if (c22329 != null) {
            c22329.m50396(this.f78066.m16189());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܰ᩸, reason: not valid java name and contains not printable characters */
    public void m53785() {
        C22329 c22329 = this.f78132;
        if (c22329 != null) {
            c22329.m50395();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void m53826(int i, int i2, int i3) {
        if (isInEditMode()) {
            return;
        }
        if (this.f78132 == null) {
            this.f78132 = new C22329(this);
            m53738();
        }
        this.f78132.m50397(i, i2, i3);
    }

    /* JADX INFO: renamed from: ᩷᩸, reason: not valid java name and contains not printable characters */
    public final void m54085() {
        this.f77979 = false;
    }

    /* JADX INFO: renamed from: ܿ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m54045() {
        return this.f77979;
    }

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC17204 m54005() {
        return this.f78034;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.᩶ۖ᩸] */
    /* JADX INFO: renamed from: ۙ */
    public void mo52301(ArrayList arrayList) {
        arrayList.addAll(C3202.m10540());
        arrayList.add(new C12240(this, new InterfaceC0818() { // from class: l.᩶ۖ᩸
            @Override // l.InterfaceC0818
            public final void accept(Object obj) {
                TextKeyListener textKeyListener = C24132.f77977;
                this.f67181.mo52343(R.string.MT_Protector);
            }
        }));
    }

    /* JADX INFO: renamed from: ᩻ */
    public void mo52343(int i) {
        int i2;
        AbstractActivityC17204 abstractActivityC17204 = this.f78034;
        if (i == R.string.MT_Protector) {
            abstractActivityC17204.m40391().m19119(this);
            return;
        }
        if (i == R.string.MT_Protector) {
            C21036.m48077(this);
            return;
        }
        if (i == R.string.MT_Protector) {
            i2 = android.R.id.startSelectingText;
        } else if (i == 17039373) {
            i2 = android.R.id.selectAll;
        } else if (i == 17039363) {
            i2 = android.R.id.cut;
        } else {
            if (i == 17039361) {
                int iM53968 = m53968();
                int iM53882 = m53882();
                int iMin = Math.min(iM53968, iM53882);
                int iMax = Math.max(iM53968, iM53882);
                if (iMin == iMax || !mo52305(this.f78058.subSequence(iMin, iMax))) {
                    return;
                }
                mo52339(iM53882);
                m53931(false);
                m53880();
                return;
            }
            if (i == 17039371) {
                i2 = android.R.id.paste;
            } else {
                if (i == R.string.MT_Protector) {
                    InterfaceC20598 interfaceC20598 = this.f77987;
                    if (interfaceC20598 != null) {
                        interfaceC20598.mo13072();
                    }
                } else if (i == R.string.MT_Protector) {
                    if (this.f77987 != null) {
                        int iM53969 = m53968();
                        int iM53883 = m53882();
                        int iMin2 = Math.min(iM53969, iM53883);
                        int iMax2 = Math.max(iM53969, iM53883);
                        C14540 c14540 = this.f78066;
                        c14540.f45785 = iMin2;
                        c14540.f45754 = iMax2;
                        mo52339(iMin2);
                        this.f77987.mo13079(true, true);
                        m54035();
                        return;
                    }
                } else {
                    if (i == R.string.MT_Protector) {
                        getContext().startActivity(new Intent(getContext(), (Class<?>) ActivityC4584.class));
                        return;
                    }
                    if (i == R.string.MT_Protector) {
                        C18910.m43910(this);
                        return;
                    }
                    if (i == R.string.MT_Protector) {
                        int iM539610 = m53968();
                        int iM53884 = m53882();
                        this.f78058.delete(Math.min(iM539610, iM53884), Math.max(iM539610, iM53884));
                        invalidate();
                    } else {
                        if (i == R.string.MT_Protector) {
                            try {
                                String strM53870 = m53870();
                                if (strM53870 != null) {
                                    Intent intent = new Intent();
                                    intent.setAction("android.intent.action.SEND");
                                    intent.putExtra("android.intent.extra.TEXT", strM53870);
                                    intent.setType("text/plain");
                                    getContext().startActivity(Intent.createChooser(intent, null));
                                    return;
                                }
                                return;
                            } catch (Exception e) {
                                Throwable cause = e;
                                while (!TransactionTooLargeException.class.isInstance(cause)) {
                                    cause = cause.getCause();
                                    if (cause == null) {
                                        if (abstractActivityC17204 != null) {
                                            abstractActivityC17204.m40401(e, (DialogInterface.OnDismissListener) null);
                                            return;
                                        } else {
                                            C22673.m51154((CharSequence) e.toString());
                                            return;
                                        }
                                    }
                                }
                                C22673.m51152(R.string.MT_Protector);
                                return;
                            }
                        }
                        if (i == R.string.MT_Protector) {
                            try {
                                C1314.m4790(abstractActivityC17204, this.f78058, this.f78038.m44540(), this.f78038.m44538(), Integer.parseInt(this.f78038.m44539().m30035().split("\\|")[1]));
                            } catch (Exception e2) {
                                abstractActivityC17204.m40401(e2, (DialogInterface.OnDismissListener) null);
                            }
                        } else if (i == R.string.MT_Protector) {
                            String strM53871 = m53870();
                            if (strM53871 != null) {
                                String strM16563 = C5590.m16563(strM53871);
                                if (abstractActivityC17204 == null) {
                                    Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(strM16563));
                                    intent2.addFlags(268435456);
                                    try {
                                        C21576.m49084().startActivity(intent2);
                                        return;
                                    } catch (Throwable th) {
                                        C22673.m51154((CharSequence) th.toString());
                                        return;
                                    }
                                }
                                abstractActivityC17204.m40420(strM16563);
                                return;
                            }
                            return;
                        }
                    }
                }
                i2 = -1;
            }
        }
        if (i2 > 0) {
            mo52324(i2);
        }
    }

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final C11882 m54032() {
        return this.f78085;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53909(InterfaceC5486 interfaceC5486) {
        this.f77980 = interfaceC5486;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m53841(MotionEvent motionEvent) {
        return (motionEvent.getSource() & o.a.r) == 8194;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m53842(int[] iArr) {
        int i;
        int i2;
        if (!isInEditMode()) {
            if (this.f78109 == null) {
                C20003 c20003 = new C20003(this);
                c20003.m46011(4500);
                c20003.m46008(new InterfaceC22987() { // from class: l.᩺ۖ᩸
                    @Override // l.InterfaceC22987
                    public final void onMenuItemClick(MenuItem menuItem) {
                        TextKeyListener textKeyListener = C24132.f77977;
                        C24132 c24132 = this.f77651;
                        c24132.getClass();
                        CharSequence title = menuItem.getTitle();
                        if (title instanceof C10549) {
                            ((C10549) title).m26996().mo31675(c24132);
                        }
                    }
                });
                this.f78109 = c20003;
            }
            this.f78109.m46012();
            this.f78109.m46007((C0134) null);
            ArrayList<AbstractC22484> arrayList = new ArrayList();
            InterfaceC5486 interfaceC5486 = this.f77980;
            if (interfaceC5486 != null) {
                interfaceC5486.mo6299(arrayList);
            }
            boolean z = (m53884() || this.f78066.f45805) ? false : true;
            boolean z2 = this.f78058.length() == 0;
            int iM53968 = m53968();
            int iM53882 = m53882();
            if (iM53968 > iM53882) {
                i2 = iM53968;
                i = iM53882;
            } else {
                i = iM53968;
                i2 = iM53882;
            }
            if (iArr != null) {
                iArr[0] = i;
                iArr[1] = i2;
            }
            ArrayList arrayList2 = new ArrayList();
            Map mapM10544 = C3202.m10544();
            for (AbstractC22484 abstractC22484 : arrayList) {
                Integer num = (Integer) mapM10544.get(abstractC22484.mo31674());
                if (num != null && abstractC22484.mo30572(this, z, z2, i, i2)) {
                    C9978 c9978M46002 = this.f78109.m46002(abstractC22484.mo31676(), num.intValue());
                    c9978M46002.m25823(abstractC22484.mo31673(getContext()));
                    if (num.intValue() >= 300) {
                        c9978M46002.m25822();
                    }
                    if (abstractC22484.mo7442()) {
                        arrayList2.add(abstractC22484);
                    }
                }
            }
            if (!this.f78109.m46009()) {
                if (!arrayList2.isEmpty()) {
                    this.f78109.m46007(new C0134(arrayList2));
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ed  */
    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final void m53956(int i) {
        boolean z;
        boolean z2;
        int[] iArr = new int[2];
        if (m53842(iArr)) {
            boolean z3 = false;
            int i2 = iArr[0];
            int i3 = iArr[1];
            RectF rectF = this.f78014;
            Rect rect = this.f77991;
            getWindowVisibleDisplayFrame(rect);
            getLocationOnScreen(this.f77985);
            int i4 = rect.top;
            int i5 = this.f77985[1];
            int i6 = i4 - i5;
            int i7 = rect.bottom - i5;
            if (i != -1) {
                z = true;
            } else {
                if (this.f78022.m33628(rectF)) {
                    rectF.left = ((rectF.left + rectF.right) / 2.0f) + 1.0f;
                    i = -2;
                } else {
                    this.f78022.m33645(rectF, i2);
                    if (rectF.top - this.f78104 < 0.0f || rectF.bottom - this.f78104 > m53993()) {
                        if (i2 != i3) {
                            try {
                                this.f78022.m33645(rectF, i3);
                            } catch (IndexOutOfBoundsException unused) {
                            }
                            if (rectF.top - this.f78104 >= 0.0f && rectF.bottom - this.f78104 <= m53993()) {
                                i = i3;
                                z = false;
                            }
                        }
                        i = -1;
                    } else {
                        i = i2;
                    }
                }
                z = true;
            }
            if (i == -1) {
                this.f78109.m46004(C3296.m10870(0.8f, 0.86f));
                this.f78109.m46006(getWidth() / 2, (this.f78109.m46010() + getHeight()) / 2);
                return;
            }
            if (i >= 0) {
                this.f78022.mo33625(rectF, i);
            }
            rectF.offset(getPaddingLeft(), getPaddingTop());
            if (i != i3 || i2 == i3 || this.f78022.m33648(i2, i3)) {
                z2 = false;
            } else {
                z2 = true;
                z = false;
            }
            if (z) {
                if ((rectF.top - this.f78104) - this.f78109.m46010() >= i6) {
                    z3 = z;
                }
            } else if ((rectF.bottom - this.f78104) + this.f78109.m46010() + this.f78066.f45772.getIntrinsicHeight() > i7) {
                z3 = true;
            } else {
                z3 = z;
            }
            boolean z4 = (z3 || !mo52322() || ((float) getHeight()) - (rectF.bottom - ((float) this.f78104)) >= ((float) C6907.m19160(92.0f))) ? z3 : true;
            if (z4 && z2) {
                this.f78109.m46004(C3296.m10870(0.8f, 0.86f));
            }
            int scrollX = ((int) rectF.left) - getScrollX();
            int intrinsicHeight = z4 ? ((int) rectF.top) - this.f78104 : this.f78066.f45772.getIntrinsicHeight() + this.f78109.m46010() + (((int) rectF.bottom) - this.f78104);
            if (scrollX < 0 || scrollX > getWidth()) {
                scrollX = getWidth() / 2;
            }
            if (intrinsicHeight < i6 || intrinsicHeight > i7) {
                intrinsicHeight = getHeight() / 2;
            }
            this.f78109.m46006(scrollX, intrinsicHeight);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m54089(int i, boolean z) {
        int[] iArrM53986 = m53986(i, z);
        m54003(m53968(), iArrM53986[0]);
        mo52316(iArrM53986[0], iArrM53986[1]);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int[] m53986(int i, boolean z) {
        int[] iArrM4834;
        C1314 c1314 = this.f78033;
        if (c1314.m4816() && (iArrM4834 = c1314.m4834(i)) != null) {
            return iArrM4834;
        }
        int[] iArrM53736 = m53736(i, z);
        int i2 = iArrM53736[0];
        int i3 = iArrM53736[1];
        if (i2 == i3) {
            return iArrM53736;
        }
        String strSubstring = TextUtils.substring(this.f78058, i2, i3);
        BreakIterator breakIterator = this.f78097;
        breakIterator.setText(strSubstring);
        int i4 = i - i2;
        try {
            int iPreceding = breakIterator.preceding(i4);
            if (iPreceding < 0) {
                iPreceding = 0;
            }
            int next = breakIterator.next();
            iArrM53736[0] = iPreceding + i2;
            iArrM53736[1] = i2 + next;
            return iArrM53736;
        } catch (Exception unused) {
            int i5 = i4 + i2;
            iArrM53736[0] = i5;
            iArrM53736[1] = i5;
            return iArrM53736;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private int[] m53736(int i, boolean z) {
        int i2;
        int length;
        int iM33646 = this.f78022.m33646(i);
        if (iM33646 != 0) {
            C14366 c14366 = this.f78022.f43643.get(iM33646);
            int i3 = c14366.f45295;
            int i4 = c14366.f45296;
            int i5 = iM33646 - 1;
            while (true) {
                if (i5 >= 0) {
                    C14366 c14367 = this.f78022.f43643.get(i5);
                    if (c14367.f45296 != i4) {
                        if (z) {
                            i2 = c14367.f45294;
                            break;
                        }
                    } else {
                        i3 = c14367.f45295;
                        if (Math.abs(i - i3) <= 10000) {
                            i5--;
                        }
                    }
                }
                i2 = i3;
                break;
            }
        } else {
            i2 = 0;
        }
        if (iM33646 == this.f78022.f43643.size() - 1) {
            length = this.f78058.length();
        } else {
            C14366 c14368 = this.f78022.f43643.get(iM33646);
            int i6 = c14368.f45294;
            int i7 = c14368.f45296;
            do {
                iM33646++;
                if (iM33646 >= this.f78022.f43643.size()) {
                    break;
                }
                C14366 c14369 = this.f78022.f43643.get(iM33646);
                if (c14369.f45296 == i7) {
                    i6 = c14369.f45294;
                } else if (z) {
                    length = c14369.f45295;
                }
            } while (Math.abs(i6 - i) <= 10000);
            length = i6;
        }
        return new int[]{i2, length};
    }

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC19106 m54021() {
        return this.f78058;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m53808(InterfaceC19106 interfaceC19106) {
        boolean z;
        boolean z2;
        if (!mo52311()) {
            interfaceC19106.mo11043().m41122(0L);
        }
        synchronized (this.f78115) {
            z = this.f78058 != interfaceC19106;
            z2 = this.f78040 == this.f78058;
            if (z) {
                this.f78021 = null;
                m53864();
                this.f78055.incrementAndGet();
            }
            if (z) {
                this.f78031 = null;
                this.f78040 = null;
                this.f78095 = null;
                this.f78036 = 0L;
                this.f77990 = null;
            }
            this.f78058 = interfaceC19106;
        }
        if (z) {
            AbstractC13753 abstractC13753 = this.f78022;
            if (abstractC13753 != null) {
                abstractC13753.m33637();
            }
            m53848("Session view owner changed");
            if (!this.f78080.isEmpty()) {
                C21576.m49068(new RunnableC3863(this));
            }
            if (z2) {
                C21576.m49068(new RunnableC3117(this, 0));
            }
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m53849(InterfaceC19106 interfaceC19106) {
        synchronized (this.f78084) {
            Iterator it = this.f78084.iterator();
            while (it.hasNext()) {
                if (((InterfaceC19106) it.next()) == interfaceC19106) {
                    return;
                }
            }
            this.f78084.add(interfaceC19106);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۜ᩸, reason: not valid java name and contains not printable characters */
    public void m53745() {
        AbstractC13753 abstractC13753;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            C21576.m49068(new RunnableC3291(0, this));
            return;
        }
        synchronized (this.f78084) {
            int size = this.f78084.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                InterfaceC19106 interfaceC19106 = (InterfaceC19106) this.f78084.get(size);
                if (interfaceC19106 != this.f78058 && ((abstractC13753 = this.f78022) == null || interfaceC19106 != abstractC13753.f43646)) {
                    this.f78084.remove(size);
                    interfaceC19106.mo11039(false);
                }
            }
        }
        if (this.f78106 && !this.f78103 && this.f78022.f43646 == this.f78058) {
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: ᩻ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m54109() {
        return this.f78124;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53929(AbstractC22044 abstractC22044) {
        if (this.f78058.mo11042()) {
            return;
        }
        InterfaceC19106 interfaceC19106 = this.f78058;
        if (interfaceC19106 instanceof C3354) {
            throw new IllegalStateException("Session already owns storage");
        }
        C13378 c13378 = (C13378) interfaceC19106;
        while (this.f78058 == c13378 && !this.f78124) {
            int iMo15344 = c13378.mo15344();
            long jMo11046 = c13378.mo11046();
            C24238 c24238M54226 = C24238.m54226(abstractC22044);
            try {
                C16759 c16759M41107 = c13378.mo11043().m41107();
                try {
                    c24238M54226.mo11043().m41097(c16759M41107);
                    c24238M54226.mo11052(c13378.mo11046());
                    c24238M54226.m54229();
                    c16759M41107.close();
                    if (m53726(c13378, c24238M54226, iMo15344, jMo11046)) {
                        return;
                    } else {
                        c24238M54226.mo11049();
                    }
                } catch (Throwable th) {
                    try {
                        c16759M41107.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException | Error | RuntimeException e) {
                c24238M54226.close();
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final FutureC23690 m53869() {
        InterfaceC19106 interfaceC19106 = this.f78058;
        if (!(interfaceC19106 instanceof C24238)) {
            return FutureC23690.m52928(null);
        }
        C24238 c24238 = (C24238) interfaceC19106;
        return c24238.m32986().m52948(new RunnableC21937(0, this, c24238), C5261.f18538);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m53721(C24132 c24132, C24238 c24238) {
        while (c24132.f78058 == c24238 && !c24132.f78124) {
            try {
                if (c24132.m53726(c24238, C13378.m32981(c24238), c24238.mo15344(), c24238.mo11046())) {
                    break;
                }
            } catch (IOException e) {
                throw new C3552(e);
            }
        }
        try {
            c24238.mo11049();
        } catch (IOException e2) {
            throw new C3552(e2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m53713(C24132 c24132, C13378 c13378, C13378 c13379) {
        C15751 c15751 = c24132.f78042;
        c13378.mo11038(c24132.f77984);
        c13378.mo11036(c13379.mo11048());
        for (Object obj : c13379.getSpans(0, c13379.length(), Object.class)) {
            if (obj != c15751 && obj != Selection.SELECTION_START && obj != Selection.SELECTION_END) {
                c13378.setSpan(obj, c13379.getSpanStart(obj), c13379.getSpanEnd(obj), c13379.getSpanFlags(obj));
            }
        }
        c13378.setFilters(c13379.getFilters());
        c13378.setSpan(c15751, 0, c13378.length(), 8388626);
        c24132.m53808(c13378);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m53714(C24132 c24132, C13378 c13378, AbstractC13753 abstractC13753, C16361 c16361) {
        if (c24132.f78058 == c13378 && c24132.f78022 == abstractC13753) {
            c24132.f78031 = new C24878(c13378, abstractC13753, c16361);
            c24132.m53788(abstractC13753);
        }
    }

    /* JADX INFO: renamed from: ܶ᩸, reason: not valid java name and contains not printable characters */
    public final void m54029() {
        if (this.f78078) {
            return;
        }
        if (this.f78058.length() != 0 || (this.f78058 instanceof C3354)) {
            throw new IllegalStateException("Memory text mode must be selected before loading text");
        }
        this.f78078 = true;
        m53847((CharSequence) new C13378(""));
        ComponentCallbacks2 componentCallbacks2M10534 = C3200.m10534(getContext());
        if (componentCallbacks2M10534 instanceof InterfaceC11217) {
            ((InterfaceC11217) componentCallbacks2M10534).getLifecycle().mo23077(new C6275(new WeakReference(this)));
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private InterfaceC19106 m53759(CharSequence charSequence) {
        if (!this.f78078 || (charSequence instanceof C13378) || (charSequence instanceof C3354)) {
            return charSequence instanceof InterfaceC19106 ? (InterfaceC19106) charSequence : new C13378(charSequence);
        }
        return new C13378(charSequence);
    }

    /* JADX INFO: renamed from: ᩹ۤ, reason: not valid java name and contains not printable characters */
    public final int m54099() {
        return this.f78058.length();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53920(C16361 c16361) {
        synchronized (this.f78117) {
            m53831(c16361);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53921(C16361 c16361, Runnable runnable) {
        m53696(new RunnableC6846(0, this, c16361), runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m53696(final Runnable runnable, final Runnable runnable2) {
        synchronized (this.f78048) {
            this.f78048.addLast(new Runnable() { // from class: l.ۤ۠᩸
                @Override // java.lang.Runnable
                public final void run() {
                    C24132.m53711(this.f34143, runnable, runnable2);
                }
            });
            if (this.f78067 == null) {
                m53856();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m53711(C24132 c24132, Runnable runnable, Runnable runnable2) {
        try {
            runnable.run();
            try {
                runnable2.run();
            } finally {
                c24132.m53856();
            }
        } catch (Throwable th) {
            try {
                runnable2.run();
                throw th;
            } finally {
                c24132.m53856();
            }
        }
    }

    /* JADX INFO: renamed from: ᩸ᩴ, reason: not valid java name and contains not printable characters */
    private void m53856() {
        C15926 c15926;
        synchronized (this.f78048) {
            this.f78067 = null;
            if (this.f77990 == null && ((c15926 = this.f78112) == null || !c15926.f51734)) {
                Runnable runnable = (Runnable) this.f78048.pollFirst();
                this.f78067 = runnable;
                if (runnable != null) {
                    try {
                        C5261.f18540.submit(runnable);
                    } catch (RuntimeException e) {
                        this.f78048.addFirst(this.f78067);
                        this.f78067 = null;
                        throw e;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m53727(final InterfaceC19106 interfaceC19106, final AbstractC13753 abstractC13753, final AbstractC13753 abstractC13754, final C16361 c16361) {
        boolean zBooleanValue;
        FutureTask futureTask = new FutureTask(new Callable() { // from class: l.ۧ۠᩸
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C24132.m53692(this.f36160, interfaceC19106, abstractC13753, abstractC13754, c16361);
            }
        });
        if (Looper.myLooper() == Looper.getMainLooper()) {
            futureTask.run();
        } else {
            C21576.m49068(futureTask);
        }
        boolean z = false;
        while (true) {
            try {
                try {
                    zBooleanValue = ((Boolean) futureTask.get()).booleanValue();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (ExecutionException e) {
                    Throwable cause = e.getCause();
                    if (cause instanceof RuntimeException) {
                        RuntimeException runtimeException = (RuntimeException) cause;
                        C22327.m50389(runtimeException);
                        throw runtimeException;
                    }
                    if (cause instanceof Error) {
                        Error error = (Error) cause;
                        C22327.m50389(error);
                        throw error;
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
        return zBooleanValue;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Boolean m53692(C24132 c24132, InterfaceC19106 interfaceC19106, AbstractC13753 abstractC13753, AbstractC13753 abstractC13754, C16361 c16361) {
        synchronized (c24132.f78115) {
            if (c24132.f78058 == interfaceC19106 && c24132.f78022 == abstractC13753 && abstractC13754.m33641()) {
                c24132.f78043 = c16361.f53132;
                c24132.m53698(abstractC13754, true);
                c24132.f78033.m4820(interfaceC19106);
                c24132.f78031 = new C24878(interfaceC19106, abstractC13754, c16361);
                c24132.m53788(abstractC13754);
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public void m53788(AbstractC13753 abstractC13753) {
        C24878 c24878 = this.f78031;
        if (c24878 == null || c24878.f80507 != abstractC13753 || abstractC13753.mo25237()) {
            return;
        }
        this.f78031 = null;
        if (this.f78022 == abstractC13753 && this.f78058 == c24878.f80506 && abstractC13753.m33641() && !abstractC13753.f43653) {
            Throwable thMo25238 = abstractC13753.mo25238();
            if (thMo25238 != null) {
                RuntimeException runtimeExceptionM53693 = m53693(thMo25238);
                if (runtimeExceptionM53693 != null) {
                    m53700(c24878.f80506, runtimeExceptionM53693, c24878.f80505);
                    return;
                }
                return;
            }
            if ((c24878.f80506 instanceof C3354) || this.f78040 != c24878.f80506) {
                return;
            }
            this.f78040 = null;
            this.f78095 = null;
            m53767();
            this.f78033.m4837(c24878.f80506);
            invalidate();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static RuntimeException m53693(Throwable th) {
        while (th != null) {
            if ((th instanceof UncheckedIOException) || (th instanceof C24219)) {
                return (RuntimeException) th;
            }
            if (th.getClass() != RuntimeException.class && !(th instanceof ExecutionException) && !(th instanceof C3552)) {
                return null;
            }
            th = th.getCause();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private AbstractC13753 m53758(final C16361 c16361) {
        for (int i = 0; i < 2; i++) {
            final InterfaceC19106 interfaceC19106 = this.f78058;
            interfaceC19106.setReadOnly(true);
            try {
                try {
                    AbstractC13753 abstractC13753 = this.f78022;
                    abstractC13753.mo25241();
                    AbstractC13753 abstractC13753M33599 = AbstractC13753.m33599(this, interfaceC19106, this.f78066, c16361.f53132);
                    if (!m53727(interfaceC19106, abstractC13753, abstractC13753M33599, c16361)) {
                        abstractC13753M33599.mo25241();
                        interfaceC19106.setReadOnly(false);
                    } else {
                        interfaceC19106.setReadOnly(false);
                        return abstractC13753M33599;
                    }
                } catch (RuntimeException e) {
                    final RuntimeException runtimeExceptionM53693 = m53693(e);
                    if (runtimeExceptionM53693 == null) {
                        throw e;
                    }
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        m53700(interfaceC19106, runtimeExceptionM53693, c16361);
                    } else {
                        FutureC23690.m52925(new Runnable() { // from class: l.ۚ۠᩸
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f19239.m53700(interfaceC19106, runtimeExceptionM53693, c16361);
                            }
                        }, new ExecutorC1800()).m52947();
                    }
                    throw e;
                }
            } catch (Throwable th) {
                interfaceC19106.setReadOnly(false);
                throw th;
            }
        }
        return null;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0037 */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m53831(final l.C16361 r14) {
        /*
            Method dump skipped, instruction units count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C24132.m53831(l.ܶ᩷ᩴ):void");
    }

    /* JADX INFO: renamed from: ֨᩷, reason: not valid java name and contains not printable characters */
    public final boolean m53872() {
        C19656 c19656 = this.f77990;
        return c19656 != null && c19656.f63328 == this.f78058;
    }

    /* JADX INFO: renamed from: ۡ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m53972() {
        C19656 c19656 = this.f77990;
        return c19656 != null && c19656.f63318 != null && c19656.f63318.f65394 && this.f78022 == c19656.f63318.f65395 && c19656.m45316(this.f78022) && this.f78022.mo25220(new C7042(getScrollX(), this.f78104, m54108(), m53993())) > 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m54080(AbstractC13753 abstractC13753) {
        C19656 c19656 = this.f77990;
        if (m53985(abstractC13753)) {
            return true;
        }
        return c19656 != null && c19656.m45316(abstractC13753);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m54054(AbstractC13753 abstractC13753) {
        C19656 c19656 = this.f77990;
        C17418 c17418 = this.f78071;
        if (c17418 == null || c17418.f56628 == null || c17418.f56628.f65395 != abstractC13753) {
            return (c19656 == null || c19656.f63318 == null || c19656.f63318.f65395 != abstractC13753) ? false : true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c3, code lost:
    
        if (r0 == false) goto L67;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m53933(int r11, int r12, int r13, int r14) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C24132.m53933(int, int, int, int):boolean");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m53703(C24132 c24132) {
        c24132.f78062 = false;
        if (c24132.f78013) {
            return;
        }
        c24132.f78036 = 0L;
    }

    /* JADX INFO: renamed from: ᩷᩷, reason: not valid java name and contains not printable characters */
    public static void m53846(C24132 c24132) {
        synchronized (c24132.f78048) {
            if (c24132.f78067 == null) {
                c24132.m53856();
            }
        }
    }

    /* JADX INFO: renamed from: ܽۤ, reason: not valid java name and contains not printable characters */
    public final C15180 m54039() {
        return m54002(this.f78043);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C15180 m54002(int i) {
        C15180 c15180;
        synchronized (this.f78066) {
            Typeface typeface = this.f78066.f18967.getTypeface();
            float textSize = this.f78066.f18967.getTextSize();
            float textScaleX = this.f78066.f18967.getTextScaleX();
            float textSkewX = this.f78066.f18967.getTextSkewX();
            int iM16214 = this.f78066.m16214();
            boolean zM16209 = this.f78066.m16209();
            boolean zM16204 = this.f78066.m16204();
            boolean z = i != 0 && this.f78066.f45769;
            C14540 c14540 = this.f78066;
            c15180 = new C15180(typeface, textSize, textScaleX, textSkewX, iM16214, zM16209, zM16204, z, c14540.f45816, c14540.f45744, c14540.f45763, i, this.f78033.m4817(), this.f78066.m16226());
        }
        return c15180;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۡ᩸, reason: not valid java name and contains not printable characters */
    public void m53754() {
        C12197 c12197 = new C12197();
        c12197.f39206 = -1;
        c12197.f39211 = -1L;
        this.f77996 = c12197;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m53992(boolean z) {
        if (z) {
            m53754();
        }
        this.f78076 = z;
        if (z) {
            this.f78033.m4824();
        } else {
            this.f77996 = null;
            this.f78033.m4813(this.f78058);
        }
        postInvalidate();
        if (z) {
            return;
        }
        m53733();
    }

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final void m54055() {
        this.f78076 = false;
        this.f78033.m4837(this.f78058);
        m53787(this.f78104, false);
        postInvalidate();
        m53733();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence m53892(CharSequence charSequence, InterfaceC7509 interfaceC7509) {
        try {
            return m53825((AbstractC22044) null, interfaceC7509, charSequence);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53930(AbstractC22044 abstractC22044, CharSequence charSequence) {
        m53893(abstractC22044, new C13557(), charSequence);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence m53893(AbstractC22044 abstractC22044, InterfaceC7509 interfaceC7509, CharSequence charSequence) {
        if (this.f78124 || interfaceC7509.mo924()) {
            return charSequence;
        }
        if (!this.f78124 && abstractC22044 != null) {
            InterfaceC19106 interfaceC19106 = this.f78058;
            if ((interfaceC19106 instanceof C24238) && ((C24238) interfaceC19106).m54228(abstractC22044)) {
                m53869().m52947();
            }
        }
        return m53825(abstractC22044, interfaceC7509, charSequence);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01a0 A[Catch: all -> 0x0203, TryCatch #0 {all -> 0x0203, blocks: (B:13:0x002b, B:15:0x0033, B:17:0x0039, B:19:0x003d, B:21:0x0041, B:24:0x0049, B:25:0x004f, B:27:0x0053, B:29:0x0057, B:34:0x0063, B:36:0x0067, B:38:0x006b, B:41:0x0072, B:42:0x0079, B:43:0x007a, B:45:0x007e, B:47:0x0083, B:51:0x00a6, B:53:0x00ae, B:57:0x00cd, B:59:0x00d1, B:61:0x00d5, B:63:0x00db, B:64:0x00e2, B:66:0x00e9, B:67:0x00ec, B:69:0x011d, B:70:0x0120, B:72:0x012b, B:74:0x012f, B:77:0x0137, B:79:0x013f, B:80:0x014d, B:82:0x0153, B:84:0x015b, B:86:0x016e, B:88:0x0172, B:90:0x0176, B:94:0x0180, B:95:0x0188, B:97:0x0198, B:98:0x019b, B:100:0x01a0, B:106:0x01c1, B:108:0x01ca, B:110:0x01ce, B:112:0x01d2, B:114:0x01d8, B:102:0x01a8, B:104:0x01bd, B:85:0x0167, B:54:0x00b3, B:55:0x00b7, B:122:0x01ed, B:123:0x01f0, B:49:0x0089, B:50:0x009a), top: B:133:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:102:0x01a8 A[Catch: all -> 0x0203, TryCatch #0 {all -> 0x0203, blocks: (B:13:0x002b, B:15:0x0033, B:17:0x0039, B:19:0x003d, B:21:0x0041, B:24:0x0049, B:25:0x004f, B:27:0x0053, B:29:0x0057, B:34:0x0063, B:36:0x0067, B:38:0x006b, B:41:0x0072, B:42:0x0079, B:43:0x007a, B:45:0x007e, B:47:0x0083, B:51:0x00a6, B:53:0x00ae, B:57:0x00cd, B:59:0x00d1, B:61:0x00d5, B:63:0x00db, B:64:0x00e2, B:66:0x00e9, B:67:0x00ec, B:69:0x011d, B:70:0x0120, B:72:0x012b, B:74:0x012f, B:77:0x0137, B:79:0x013f, B:80:0x014d, B:82:0x0153, B:84:0x015b, B:86:0x016e, B:88:0x0172, B:90:0x0176, B:94:0x0180, B:95:0x0188, B:97:0x0198, B:98:0x019b, B:100:0x01a0, B:106:0x01c1, B:108:0x01ca, B:110:0x01ce, B:112:0x01d2, B:114:0x01d8, B:102:0x01a8, B:104:0x01bd, B:85:0x0167, B:54:0x00b3, B:55:0x00b7, B:122:0x01ed, B:123:0x01f0, B:49:0x0089, B:50:0x009a), top: B:133:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:104:0x01bd A[Catch: all -> 0x0203, TryCatch #0 {all -> 0x0203, blocks: (B:13:0x002b, B:15:0x0033, B:17:0x0039, B:19:0x003d, B:21:0x0041, B:24:0x0049, B:25:0x004f, B:27:0x0053, B:29:0x0057, B:34:0x0063, B:36:0x0067, B:38:0x006b, B:41:0x0072, B:42:0x0079, B:43:0x007a, B:45:0x007e, B:47:0x0083, B:51:0x00a6, B:53:0x00ae, B:57:0x00cd, B:59:0x00d1, B:61:0x00d5, B:63:0x00db, B:64:0x00e2, B:66:0x00e9, B:67:0x00ec, B:69:0x011d, B:70:0x0120, B:72:0x012b, B:74:0x012f, B:77:0x0137, B:79:0x013f, B:80:0x014d, B:82:0x0153, B:84:0x015b, B:86:0x016e, B:88:0x0172, B:90:0x0176, B:94:0x0180, B:95:0x0188, B:97:0x0198, B:98:0x019b, B:100:0x01a0, B:106:0x01c1, B:108:0x01ca, B:110:0x01ce, B:112:0x01d2, B:114:0x01d8, B:102:0x01a8, B:104:0x01bd, B:85:0x0167, B:54:0x00b3, B:55:0x00b7, B:122:0x01ed, B:123:0x01f0, B:49:0x0089, B:50:0x009a), top: B:133:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:106:0x01c1 A[Catch: all -> 0x0203, TryCatch #0 {all -> 0x0203, blocks: (B:13:0x002b, B:15:0x0033, B:17:0x0039, B:19:0x003d, B:21:0x0041, B:24:0x0049, B:25:0x004f, B:27:0x0053, B:29:0x0057, B:34:0x0063, B:36:0x0067, B:38:0x006b, B:41:0x0072, B:42:0x0079, B:43:0x007a, B:45:0x007e, B:47:0x0083, B:51:0x00a6, B:53:0x00ae, B:57:0x00cd, B:59:0x00d1, B:61:0x00d5, B:63:0x00db, B:64:0x00e2, B:66:0x00e9, B:67:0x00ec, B:69:0x011d, B:70:0x0120, B:72:0x012b, B:74:0x012f, B:77:0x0137, B:79:0x013f, B:80:0x014d, B:82:0x0153, B:84:0x015b, B:86:0x016e, B:88:0x0172, B:90:0x0176, B:94:0x0180, B:95:0x0188, B:97:0x0198, B:98:0x019b, B:100:0x01a0, B:106:0x01c1, B:108:0x01ca, B:110:0x01ce, B:112:0x01d2, B:114:0x01d8, B:102:0x01a8, B:104:0x01bd, B:85:0x0167, B:54:0x00b3, B:55:0x00b7, B:122:0x01ed, B:123:0x01f0, B:49:0x0089, B:50:0x009a), top: B:133:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:108:0x01ca A[Catch: all -> 0x0203, TryCatch #0 {all -> 0x0203, blocks: (B:13:0x002b, B:15:0x0033, B:17:0x0039, B:19:0x003d, B:21:0x0041, B:24:0x0049, B:25:0x004f, B:27:0x0053, B:29:0x0057, B:34:0x0063, B:36:0x0067, B:38:0x006b, B:41:0x0072, B:42:0x0079, B:43:0x007a, B:45:0x007e, B:47:0x0083, B:51:0x00a6, B:53:0x00ae, B:57:0x00cd, B:59:0x00d1, B:61:0x00d5, B:63:0x00db, B:64:0x00e2, B:66:0x00e9, B:67:0x00ec, B:69:0x011d, B:70:0x0120, B:72:0x012b, B:74:0x012f, B:77:0x0137, B:79:0x013f, B:80:0x014d, B:82:0x0153, B:84:0x015b, B:86:0x016e, B:88:0x0172, B:90:0x0176, B:94:0x0180, B:95:0x0188, B:97:0x0198, B:98:0x019b, B:100:0x01a0, B:106:0x01c1, B:108:0x01ca, B:110:0x01ce, B:112:0x01d2, B:114:0x01d8, B:102:0x01a8, B:104:0x01bd, B:85:0x0167, B:54:0x00b3, B:55:0x00b7, B:122:0x01ed, B:123:0x01f0, B:49:0x0089, B:50:0x009a), top: B:133:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:117:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:45:0x007e A[Catch: all -> 0x0203, TryCatch #0 {all -> 0x0203, blocks: (B:13:0x002b, B:15:0x0033, B:17:0x0039, B:19:0x003d, B:21:0x0041, B:24:0x0049, B:25:0x004f, B:27:0x0053, B:29:0x0057, B:34:0x0063, B:36:0x0067, B:38:0x006b, B:41:0x0072, B:42:0x0079, B:43:0x007a, B:45:0x007e, B:47:0x0083, B:51:0x00a6, B:53:0x00ae, B:57:0x00cd, B:59:0x00d1, B:61:0x00d5, B:63:0x00db, B:64:0x00e2, B:66:0x00e9, B:67:0x00ec, B:69:0x011d, B:70:0x0120, B:72:0x012b, B:74:0x012f, B:77:0x0137, B:79:0x013f, B:80:0x014d, B:82:0x0153, B:84:0x015b, B:86:0x016e, B:88:0x0172, B:90:0x0176, B:94:0x0180, B:95:0x0188, B:97:0x0198, B:98:0x019b, B:100:0x01a0, B:106:0x01c1, B:108:0x01ca, B:110:0x01ce, B:112:0x01d2, B:114:0x01d8, B:102:0x01a8, B:104:0x01bd, B:85:0x0167, B:54:0x00b3, B:55:0x00b7, B:122:0x01ed, B:123:0x01f0, B:49:0x0089, B:50:0x009a), top: B:133:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0089 A[Catch: all -> 0x0203, TryCatch #0 {all -> 0x0203, blocks: (B:13:0x002b, B:15:0x0033, B:17:0x0039, B:19:0x003d, B:21:0x0041, B:24:0x0049, B:25:0x004f, B:27:0x0053, B:29:0x0057, B:34:0x0063, B:36:0x0067, B:38:0x006b, B:41:0x0072, B:42:0x0079, B:43:0x007a, B:45:0x007e, B:47:0x0083, B:51:0x00a6, B:53:0x00ae, B:57:0x00cd, B:59:0x00d1, B:61:0x00d5, B:63:0x00db, B:64:0x00e2, B:66:0x00e9, B:67:0x00ec, B:69:0x011d, B:70:0x0120, B:72:0x012b, B:74:0x012f, B:77:0x0137, B:79:0x013f, B:80:0x014d, B:82:0x0153, B:84:0x015b, B:86:0x016e, B:88:0x0172, B:90:0x0176, B:94:0x0180, B:95:0x0188, B:97:0x0198, B:98:0x019b, B:100:0x01a0, B:106:0x01c1, B:108:0x01ca, B:110:0x01ce, B:112:0x01d2, B:114:0x01d8, B:102:0x01a8, B:104:0x01bd, B:85:0x0167, B:54:0x00b3, B:55:0x00b7, B:122:0x01ed, B:123:0x01f0, B:49:0x0089, B:50:0x009a), top: B:133:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:50:0x009a A[Catch: all -> 0x0203, TryCatch #0 {all -> 0x0203, blocks: (B:13:0x002b, B:15:0x0033, B:17:0x0039, B:19:0x003d, B:21:0x0041, B:24:0x0049, B:25:0x004f, B:27:0x0053, B:29:0x0057, B:34:0x0063, B:36:0x0067, B:38:0x006b, B:41:0x0072, B:42:0x0079, B:43:0x007a, B:45:0x007e, B:47:0x0083, B:51:0x00a6, B:53:0x00ae, B:57:0x00cd, B:59:0x00d1, B:61:0x00d5, B:63:0x00db, B:64:0x00e2, B:66:0x00e9, B:67:0x00ec, B:69:0x011d, B:70:0x0120, B:72:0x012b, B:74:0x012f, B:77:0x0137, B:79:0x013f, B:80:0x014d, B:82:0x0153, B:84:0x015b, B:86:0x016e, B:88:0x0172, B:90:0x0176, B:94:0x0180, B:95:0x0188, B:97:0x0198, B:98:0x019b, B:100:0x01a0, B:106:0x01c1, B:108:0x01ca, B:110:0x01ce, B:112:0x01d2, B:114:0x01d8, B:102:0x01a8, B:104:0x01bd, B:85:0x0167, B:54:0x00b3, B:55:0x00b7, B:122:0x01ed, B:123:0x01f0, B:49:0x0089, B:50:0x009a), top: B:133:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00ae A[Catch: all -> 0x0203, TryCatch #0 {all -> 0x0203, blocks: (B:13:0x002b, B:15:0x0033, B:17:0x0039, B:19:0x003d, B:21:0x0041, B:24:0x0049, B:25:0x004f, B:27:0x0053, B:29:0x0057, B:34:0x0063, B:36:0x0067, B:38:0x006b, B:41:0x0072, B:42:0x0079, B:43:0x007a, B:45:0x007e, B:47:0x0083, B:51:0x00a6, B:53:0x00ae, B:57:0x00cd, B:59:0x00d1, B:61:0x00d5, B:63:0x00db, B:64:0x00e2, B:66:0x00e9, B:67:0x00ec, B:69:0x011d, B:70:0x0120, B:72:0x012b, B:74:0x012f, B:77:0x0137, B:79:0x013f, B:80:0x014d, B:82:0x0153, B:84:0x015b, B:86:0x016e, B:88:0x0172, B:90:0x0176, B:94:0x0180, B:95:0x0188, B:97:0x0198, B:98:0x019b, B:100:0x01a0, B:106:0x01c1, B:108:0x01ca, B:110:0x01ce, B:112:0x01d2, B:114:0x01d8, B:102:0x01a8, B:104:0x01bd, B:85:0x0167, B:54:0x00b3, B:55:0x00b7, B:122:0x01ed, B:123:0x01f0, B:49:0x0089, B:50:0x009a), top: B:133:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00b3 A[Catch: all -> 0x0203, TRY_LEAVE, TryCatch #0 {all -> 0x0203, blocks: (B:13:0x002b, B:15:0x0033, B:17:0x0039, B:19:0x003d, B:21:0x0041, B:24:0x0049, B:25:0x004f, B:27:0x0053, B:29:0x0057, B:34:0x0063, B:36:0x0067, B:38:0x006b, B:41:0x0072, B:42:0x0079, B:43:0x007a, B:45:0x007e, B:47:0x0083, B:51:0x00a6, B:53:0x00ae, B:57:0x00cd, B:59:0x00d1, B:61:0x00d5, B:63:0x00db, B:64:0x00e2, B:66:0x00e9, B:67:0x00ec, B:69:0x011d, B:70:0x0120, B:72:0x012b, B:74:0x012f, B:77:0x0137, B:79:0x013f, B:80:0x014d, B:82:0x0153, B:84:0x015b, B:86:0x016e, B:88:0x0172, B:90:0x0176, B:94:0x0180, B:95:0x0188, B:97:0x0198, B:98:0x019b, B:100:0x01a0, B:106:0x01c1, B:108:0x01ca, B:110:0x01ce, B:112:0x01d2, B:114:0x01d8, B:102:0x01a8, B:104:0x01bd, B:85:0x0167, B:54:0x00b3, B:55:0x00b7, B:122:0x01ed, B:123:0x01f0, B:49:0x0089, B:50:0x009a), top: B:133:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00e2 A[Catch: all -> 0x0203, TryCatch #0 {all -> 0x0203, blocks: (B:13:0x002b, B:15:0x0033, B:17:0x0039, B:19:0x003d, B:21:0x0041, B:24:0x0049, B:25:0x004f, B:27:0x0053, B:29:0x0057, B:34:0x0063, B:36:0x0067, B:38:0x006b, B:41:0x0072, B:42:0x0079, B:43:0x007a, B:45:0x007e, B:47:0x0083, B:51:0x00a6, B:53:0x00ae, B:57:0x00cd, B:59:0x00d1, B:61:0x00d5, B:63:0x00db, B:64:0x00e2, B:66:0x00e9, B:67:0x00ec, B:69:0x011d, B:70:0x0120, B:72:0x012b, B:74:0x012f, B:77:0x0137, B:79:0x013f, B:80:0x014d, B:82:0x0153, B:84:0x015b, B:86:0x016e, B:88:0x0172, B:90:0x0176, B:94:0x0180, B:95:0x0188, B:97:0x0198, B:98:0x019b, B:100:0x01a0, B:106:0x01c1, B:108:0x01ca, B:110:0x01ce, B:112:0x01d2, B:114:0x01d8, B:102:0x01a8, B:104:0x01bd, B:85:0x0167, B:54:0x00b3, B:55:0x00b7, B:122:0x01ed, B:123:0x01f0, B:49:0x0089, B:50:0x009a), top: B:133:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:66:0x00e9 A[Catch: all -> 0x0203, TryCatch #0 {all -> 0x0203, blocks: (B:13:0x002b, B:15:0x0033, B:17:0x0039, B:19:0x003d, B:21:0x0041, B:24:0x0049, B:25:0x004f, B:27:0x0053, B:29:0x0057, B:34:0x0063, B:36:0x0067, B:38:0x006b, B:41:0x0072, B:42:0x0079, B:43:0x007a, B:45:0x007e, B:47:0x0083, B:51:0x00a6, B:53:0x00ae, B:57:0x00cd, B:59:0x00d1, B:61:0x00d5, B:63:0x00db, B:64:0x00e2, B:66:0x00e9, B:67:0x00ec, B:69:0x011d, B:70:0x0120, B:72:0x012b, B:74:0x012f, B:77:0x0137, B:79:0x013f, B:80:0x014d, B:82:0x0153, B:84:0x015b, B:86:0x016e, B:88:0x0172, B:90:0x0176, B:94:0x0180, B:95:0x0188, B:97:0x0198, B:98:0x019b, B:100:0x01a0, B:106:0x01c1, B:108:0x01ca, B:110:0x01ce, B:112:0x01d2, B:114:0x01d8, B:102:0x01a8, B:104:0x01bd, B:85:0x0167, B:54:0x00b3, B:55:0x00b7, B:122:0x01ed, B:123:0x01f0, B:49:0x0089, B:50:0x009a), top: B:133:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:69:0x011d A[Catch: all -> 0x0203, TryCatch #0 {all -> 0x0203, blocks: (B:13:0x002b, B:15:0x0033, B:17:0x0039, B:19:0x003d, B:21:0x0041, B:24:0x0049, B:25:0x004f, B:27:0x0053, B:29:0x0057, B:34:0x0063, B:36:0x0067, B:38:0x006b, B:41:0x0072, B:42:0x0079, B:43:0x007a, B:45:0x007e, B:47:0x0083, B:51:0x00a6, B:53:0x00ae, B:57:0x00cd, B:59:0x00d1, B:61:0x00d5, B:63:0x00db, B:64:0x00e2, B:66:0x00e9, B:67:0x00ec, B:69:0x011d, B:70:0x0120, B:72:0x012b, B:74:0x012f, B:77:0x0137, B:79:0x013f, B:80:0x014d, B:82:0x0153, B:84:0x015b, B:86:0x016e, B:88:0x0172, B:90:0x0176, B:94:0x0180, B:95:0x0188, B:97:0x0198, B:98:0x019b, B:100:0x01a0, B:106:0x01c1, B:108:0x01ca, B:110:0x01ce, B:112:0x01d2, B:114:0x01d8, B:102:0x01a8, B:104:0x01bd, B:85:0x0167, B:54:0x00b3, B:55:0x00b7, B:122:0x01ed, B:123:0x01f0, B:49:0x0089, B:50:0x009a), top: B:133:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:72:0x012b A[Catch: all -> 0x0203, TryCatch #0 {all -> 0x0203, blocks: (B:13:0x002b, B:15:0x0033, B:17:0x0039, B:19:0x003d, B:21:0x0041, B:24:0x0049, B:25:0x004f, B:27:0x0053, B:29:0x0057, B:34:0x0063, B:36:0x0067, B:38:0x006b, B:41:0x0072, B:42:0x0079, B:43:0x007a, B:45:0x007e, B:47:0x0083, B:51:0x00a6, B:53:0x00ae, B:57:0x00cd, B:59:0x00d1, B:61:0x00d5, B:63:0x00db, B:64:0x00e2, B:66:0x00e9, B:67:0x00ec, B:69:0x011d, B:70:0x0120, B:72:0x012b, B:74:0x012f, B:77:0x0137, B:79:0x013f, B:80:0x014d, B:82:0x0153, B:84:0x015b, B:86:0x016e, B:88:0x0172, B:90:0x0176, B:94:0x0180, B:95:0x0188, B:97:0x0198, B:98:0x019b, B:100:0x01a0, B:106:0x01c1, B:108:0x01ca, B:110:0x01ce, B:112:0x01d2, B:114:0x01d8, B:102:0x01a8, B:104:0x01bd, B:85:0x0167, B:54:0x00b3, B:55:0x00b7, B:122:0x01ed, B:123:0x01f0, B:49:0x0089, B:50:0x009a), top: B:133:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:79:0x013f A[Catch: all -> 0x0203, TryCatch #0 {all -> 0x0203, blocks: (B:13:0x002b, B:15:0x0033, B:17:0x0039, B:19:0x003d, B:21:0x0041, B:24:0x0049, B:25:0x004f, B:27:0x0053, B:29:0x0057, B:34:0x0063, B:36:0x0067, B:38:0x006b, B:41:0x0072, B:42:0x0079, B:43:0x007a, B:45:0x007e, B:47:0x0083, B:51:0x00a6, B:53:0x00ae, B:57:0x00cd, B:59:0x00d1, B:61:0x00d5, B:63:0x00db, B:64:0x00e2, B:66:0x00e9, B:67:0x00ec, B:69:0x011d, B:70:0x0120, B:72:0x012b, B:74:0x012f, B:77:0x0137, B:79:0x013f, B:80:0x014d, B:82:0x0153, B:84:0x015b, B:86:0x016e, B:88:0x0172, B:90:0x0176, B:94:0x0180, B:95:0x0188, B:97:0x0198, B:98:0x019b, B:100:0x01a0, B:106:0x01c1, B:108:0x01ca, B:110:0x01ce, B:112:0x01d2, B:114:0x01d8, B:102:0x01a8, B:104:0x01bd, B:85:0x0167, B:54:0x00b3, B:55:0x00b7, B:122:0x01ed, B:123:0x01f0, B:49:0x0089, B:50:0x009a), top: B:133:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0153 A[Catch: all -> 0x0203, TryCatch #0 {all -> 0x0203, blocks: (B:13:0x002b, B:15:0x0033, B:17:0x0039, B:19:0x003d, B:21:0x0041, B:24:0x0049, B:25:0x004f, B:27:0x0053, B:29:0x0057, B:34:0x0063, B:36:0x0067, B:38:0x006b, B:41:0x0072, B:42:0x0079, B:43:0x007a, B:45:0x007e, B:47:0x0083, B:51:0x00a6, B:53:0x00ae, B:57:0x00cd, B:59:0x00d1, B:61:0x00d5, B:63:0x00db, B:64:0x00e2, B:66:0x00e9, B:67:0x00ec, B:69:0x011d, B:70:0x0120, B:72:0x012b, B:74:0x012f, B:77:0x0137, B:79:0x013f, B:80:0x014d, B:82:0x0153, B:84:0x015b, B:86:0x016e, B:88:0x0172, B:90:0x0176, B:94:0x0180, B:95:0x0188, B:97:0x0198, B:98:0x019b, B:100:0x01a0, B:106:0x01c1, B:108:0x01ca, B:110:0x01ce, B:112:0x01d2, B:114:0x01d8, B:102:0x01a8, B:104:0x01bd, B:85:0x0167, B:54:0x00b3, B:55:0x00b7, B:122:0x01ed, B:123:0x01f0, B:49:0x0089, B:50:0x009a), top: B:133:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0167 A[Catch: all -> 0x0203, TryCatch #0 {all -> 0x0203, blocks: (B:13:0x002b, B:15:0x0033, B:17:0x0039, B:19:0x003d, B:21:0x0041, B:24:0x0049, B:25:0x004f, B:27:0x0053, B:29:0x0057, B:34:0x0063, B:36:0x0067, B:38:0x006b, B:41:0x0072, B:42:0x0079, B:43:0x007a, B:45:0x007e, B:47:0x0083, B:51:0x00a6, B:53:0x00ae, B:57:0x00cd, B:59:0x00d1, B:61:0x00d5, B:63:0x00db, B:64:0x00e2, B:66:0x00e9, B:67:0x00ec, B:69:0x011d, B:70:0x0120, B:72:0x012b, B:74:0x012f, B:77:0x0137, B:79:0x013f, B:80:0x014d, B:82:0x0153, B:84:0x015b, B:86:0x016e, B:88:0x0172, B:90:0x0176, B:94:0x0180, B:95:0x0188, B:97:0x0198, B:98:0x019b, B:100:0x01a0, B:106:0x01c1, B:108:0x01ca, B:110:0x01ce, B:112:0x01d2, B:114:0x01d8, B:102:0x01a8, B:104:0x01bd, B:85:0x0167, B:54:0x00b3, B:55:0x00b7, B:122:0x01ed, B:123:0x01f0, B:49:0x0089, B:50:0x009a), top: B:133:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0172 A[Catch: all -> 0x0203, TryCatch #0 {all -> 0x0203, blocks: (B:13:0x002b, B:15:0x0033, B:17:0x0039, B:19:0x003d, B:21:0x0041, B:24:0x0049, B:25:0x004f, B:27:0x0053, B:29:0x0057, B:34:0x0063, B:36:0x0067, B:38:0x006b, B:41:0x0072, B:42:0x0079, B:43:0x007a, B:45:0x007e, B:47:0x0083, B:51:0x00a6, B:53:0x00ae, B:57:0x00cd, B:59:0x00d1, B:61:0x00d5, B:63:0x00db, B:64:0x00e2, B:66:0x00e9, B:67:0x00ec, B:69:0x011d, B:70:0x0120, B:72:0x012b, B:74:0x012f, B:77:0x0137, B:79:0x013f, B:80:0x014d, B:82:0x0153, B:84:0x015b, B:86:0x016e, B:88:0x0172, B:90:0x0176, B:94:0x0180, B:95:0x0188, B:97:0x0198, B:98:0x019b, B:100:0x01a0, B:106:0x01c1, B:108:0x01ca, B:110:0x01ce, B:112:0x01d2, B:114:0x01d8, B:102:0x01a8, B:104:0x01bd, B:85:0x0167, B:54:0x00b3, B:55:0x00b7, B:122:0x01ed, B:123:0x01f0, B:49:0x0089, B:50:0x009a), top: B:133:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0180 A[Catch: all -> 0x0203, TryCatch #0 {all -> 0x0203, blocks: (B:13:0x002b, B:15:0x0033, B:17:0x0039, B:19:0x003d, B:21:0x0041, B:24:0x0049, B:25:0x004f, B:27:0x0053, B:29:0x0057, B:34:0x0063, B:36:0x0067, B:38:0x006b, B:41:0x0072, B:42:0x0079, B:43:0x007a, B:45:0x007e, B:47:0x0083, B:51:0x00a6, B:53:0x00ae, B:57:0x00cd, B:59:0x00d1, B:61:0x00d5, B:63:0x00db, B:64:0x00e2, B:66:0x00e9, B:67:0x00ec, B:69:0x011d, B:70:0x0120, B:72:0x012b, B:74:0x012f, B:77:0x0137, B:79:0x013f, B:80:0x014d, B:82:0x0153, B:84:0x015b, B:86:0x016e, B:88:0x0172, B:90:0x0176, B:94:0x0180, B:95:0x0188, B:97:0x0198, B:98:0x019b, B:100:0x01a0, B:106:0x01c1, B:108:0x01ca, B:110:0x01ce, B:112:0x01d2, B:114:0x01d8, B:102:0x01a8, B:104:0x01bd, B:85:0x0167, B:54:0x00b3, B:55:0x00b7, B:122:0x01ed, B:123:0x01f0, B:49:0x0089, B:50:0x009a), top: B:133:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0198 A[Catch: all -> 0x0203, TryCatch #0 {all -> 0x0203, blocks: (B:13:0x002b, B:15:0x0033, B:17:0x0039, B:19:0x003d, B:21:0x0041, B:24:0x0049, B:25:0x004f, B:27:0x0053, B:29:0x0057, B:34:0x0063, B:36:0x0067, B:38:0x006b, B:41:0x0072, B:42:0x0079, B:43:0x007a, B:45:0x007e, B:47:0x0083, B:51:0x00a6, B:53:0x00ae, B:57:0x00cd, B:59:0x00d1, B:61:0x00d5, B:63:0x00db, B:64:0x00e2, B:66:0x00e9, B:67:0x00ec, B:69:0x011d, B:70:0x0120, B:72:0x012b, B:74:0x012f, B:77:0x0137, B:79:0x013f, B:80:0x014d, B:82:0x0153, B:84:0x015b, B:86:0x016e, B:88:0x0172, B:90:0x0176, B:94:0x0180, B:95:0x0188, B:97:0x0198, B:98:0x019b, B:100:0x01a0, B:106:0x01c1, B:108:0x01ca, B:110:0x01ce, B:112:0x01d2, B:114:0x01d8, B:102:0x01a8, B:104:0x01bd, B:85:0x0167, B:54:0x00b3, B:55:0x00b7, B:122:0x01ed, B:123:0x01f0, B:49:0x0089, B:50:0x009a), top: B:133:0x002b }] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private CharSequence m53825(AbstractC22044 abstractC22044, InterfaceC7509 interfaceC7509, CharSequence charSequence) {
        C17418 c17418;
        int iMo11048;
        C24238 c24238M54226;
        InterfaceC19106 interfaceC19106;
        InterfaceC19106 interfaceC19107;
        InterfaceC19106 interfaceC19108;
        InterfaceC19106 interfaceC19109;
        int length;
        InterfaceC19106 interfaceC19106M53759;
        C3354 c3354;
        if (this.f78124 || interfaceC7509.mo924()) {
            return charSequence;
        }
        synchronized (this.f78115) {
            this.f78019 = false;
            m53754();
            this.f78103 = true;
            this.f78046++;
            this.f78024 = true;
        }
        postInvalidate();
        this.f78033.m4824();
        try {
            if (!this.f78022.mo25225()) {
                while (getWidth() <= 0) {
                    if (!this.f78019 && !this.f78124 && !interfaceC7509.mo924()) {
                        SystemClock.sleep(10L);
                    }
                }
                if (!this.f78019 && !this.f78124 && !interfaceC7509.mo924()) {
                    if (charSequence == null) {
                        charSequence = "";
                    }
                    c17418 = this.f78071;
                    if (c17418 != null && (charSequence != c17418.f56630 || this.f78022 != c17418.f56620)) {
                        throw new IllegalStateException("Session layout preparation was superseded");
                    }
                    if (charSequence instanceof C3354) {
                        c3354 = (C3354) charSequence;
                        if (c17418 != null || c17418.f56623.f39557 == null) {
                            this.f78066.f45796 = c3354.mo11043().m41081().m48296();
                        }
                    } else {
                        this.f78066.f45796 = C14540.m35081(charSequence);
                        charSequence = C14540.m35080(charSequence);
                    }
                    iMo11048 = this.f78058.mo11048();
                    if (abstractC22044 == null) {
                        c24238M54226 = C24238.m54226(abstractC22044);
                        try {
                            c24238M54226.replace(0, c24238M54226.length(), charSequence);
                            c24238M54226.mo11043().m41111();
                            c24238M54226.mo11051(false);
                            c24238M54226.m54229();
                            interfaceC19106 = c24238M54226;
                        } catch (Error | RuntimeException e) {
                            c24238M54226.close();
                            throw e;
                        }
                    } else {
                        interfaceC19106M53759 = m53759(charSequence);
                    }
                    if (abstractC22044 == null && (this.f78019 || this.f78124 || interfaceC7509.mo924())) {
                        interfaceC19106 = interfaceC19106M53759;
                        interfaceC19106 = interfaceC19106M53759;
                        interfaceC19106 = interfaceC19106M53759;
                        ((C24238) interfaceC19106).close();
                    } else {
                        interfaceC19106 = interfaceC19106M53759;
                        interfaceC19106 = interfaceC19106M53759;
                        interfaceC19107 = this.f78058;
                        m53808(interfaceC19106);
                        if (interfaceC19107 != interfaceC19106) {
                            m53849(interfaceC19107);
                        }
                        this.f78018.m9612(this.f78058);
                        this.f78033.m4822();
                        this.f78029.m40506();
                        this.f78058.mo11038(this.f77984);
                        this.f78058.mo11036(iMo11048);
                        InterfaceC19106 interfaceC191010 = this.f78058;
                        interfaceC191010.setSpan(this.f78042, 0, interfaceC191010.length(), 8388626);
                        interfaceC19108 = this.f78058;
                        if (!(interfaceC19108 instanceof C3354)) {
                            interfaceC19108.setSelection(0);
                        }
                        this.f78002 = -1.0f;
                        m53845();
                        if (!this.f78019 && !this.f78124 && !interfaceC7509.mo924()) {
                            if (this.f78033.m4840()) {
                                this.f78033.m4830((CharSequence) this.f78058);
                                this.f78033.m4818(this.f78058);
                            }
                            if (!this.f78066.f45755 && this.f78033.m4816()) {
                                this.f78029.m40504(this.f78033.m4811());
                            } else {
                                this.f78029.m40504(C17243.f56170);
                            }
                            if (!this.f78019 && !this.f78124 && !interfaceC7509.mo924()) {
                                if (c17418 != null) {
                                    c17418.f56627 = this.f78058.mo15344();
                                }
                                this.f78022.mo25242(this.f78058);
                                m53959();
                                interfaceC19109 = this.f78058;
                                if (!(interfaceC19109 instanceof C3354)) {
                                    interfaceC19109.mo11051(true);
                                }
                                this.f78088 = -1;
                                if (c17418 != null || !c17418.f56623.m30714()) {
                                    length = this.f78058.length();
                                    int i = SharedPreferencesOnSharedPreferenceChangeListenerC3444.f11224;
                                    if (length > C21576.f68932.getInt("smooth_mode_threshold", 200000)) {
                                        this.f78098 = true;
                                    }
                                }
                                if (c17418 == null) {
                                    m53787(Math.max(0, 0), true);
                                }
                                if (c17418 != null && !this.f78019 && !this.f78124 && !interfaceC7509.mo924()) {
                                    c17418.f56632 = true;
                                }
                                this.f78103 = false;
                                m53745();
                                m53733();
                                if (!this.f78019) {
                                    postInvalidate();
                                }
                                return charSequence;
                            }
                        }
                    }
                }
            } else if (!this.f78019) {
                if (charSequence == null) {
                    charSequence = "";
                }
                c17418 = this.f78071;
                if (c17418 != null) {
                    throw new IllegalStateException("Session layout preparation was superseded");
                }
                if (charSequence instanceof C3354) {
                    c3354 = (C3354) charSequence;
                    if (c17418 != null) {
                        this.f78066.f45796 = c3354.mo11043().m41081().m48296();
                    } else {
                        this.f78066.f45796 = c3354.mo11043().m41081().m48296();
                    }
                } else {
                    this.f78066.f45796 = C14540.m35081(charSequence);
                    charSequence = C14540.m35080(charSequence);
                }
                iMo11048 = this.f78058.mo11048();
                if (abstractC22044 == null) {
                    c24238M54226 = C24238.m54226(abstractC22044);
                    c24238M54226.replace(0, c24238M54226.length(), charSequence);
                    c24238M54226.mo11043().m41111();
                    c24238M54226.mo11051(false);
                    c24238M54226.m54229();
                    interfaceC19106 = c24238M54226;
                } else {
                    interfaceC19106M53759 = m53759(charSequence);
                }
                if (abstractC22044 == null) {
                    interfaceC19106 = interfaceC19106M53759;
                    interfaceC19106 = interfaceC19106M53759;
                    interfaceC19107 = this.f78058;
                    m53808(interfaceC19106);
                    if (interfaceC19107 != interfaceC19106) {
                        m53849(interfaceC19107);
                    }
                    this.f78018.m9612(this.f78058);
                    this.f78033.m4822();
                    this.f78029.m40506();
                    this.f78058.mo11038(this.f77984);
                    this.f78058.mo11036(iMo11048);
                    InterfaceC19106 interfaceC191011 = this.f78058;
                    interfaceC191011.setSpan(this.f78042, 0, interfaceC191011.length(), 8388626);
                    interfaceC19108 = this.f78058;
                    if (!(interfaceC19108 instanceof C3354)) {
                        interfaceC19108.setSelection(0);
                    }
                    this.f78002 = -1.0f;
                    m53845();
                    if (!this.f78019) {
                        if (this.f78033.m4840()) {
                            this.f78033.m4830((CharSequence) this.f78058);
                            this.f78033.m4818(this.f78058);
                        }
                        if (!this.f78066.f45755) {
                            this.f78029.m40504(C17243.f56170);
                        } else {
                            this.f78029.m40504(C17243.f56170);
                        }
                        if (!this.f78019) {
                            if (c17418 != null) {
                                c17418.f56627 = this.f78058.mo15344();
                            }
                            this.f78022.mo25242(this.f78058);
                            m53959();
                            interfaceC19109 = this.f78058;
                            if (!(interfaceC19109 instanceof C3354)) {
                                interfaceC19109.mo11051(true);
                            }
                            this.f78088 = -1;
                            if (c17418 != null) {
                                length = this.f78058.length();
                                int i2 = SharedPreferencesOnSharedPreferenceChangeListenerC3444.f11224;
                                if (length > C21576.f68932.getInt("smooth_mode_threshold", 200000)) {
                                    this.f78098 = true;
                                }
                            } else {
                                length = this.f78058.length();
                                int i3 = SharedPreferencesOnSharedPreferenceChangeListenerC3444.f11224;
                                if (length > C21576.f68932.getInt("smooth_mode_threshold", 200000)) {
                                    this.f78098 = true;
                                }
                            }
                            if (c17418 == null) {
                                m53787(Math.max(0, 0), true);
                            }
                            if (c17418 != null) {
                                c17418.f56632 = true;
                            }
                            this.f78103 = false;
                            m53745();
                            m53733();
                            if (!this.f78019) {
                                postInvalidate();
                            }
                            return charSequence;
                        }
                    }
                } else {
                    interfaceC19106 = interfaceC19106M53759;
                    interfaceC19106 = interfaceC19106M53759;
                    interfaceC19107 = this.f78058;
                    m53808(interfaceC19106);
                    if (interfaceC19107 != interfaceC19106) {
                        m53849(interfaceC19107);
                    }
                    this.f78018.m9612(this.f78058);
                    this.f78033.m4822();
                    this.f78029.m40506();
                    this.f78058.mo11038(this.f77984);
                    this.f78058.mo11036(iMo11048);
                    InterfaceC19106 interfaceC191012 = this.f78058;
                    interfaceC191012.setSpan(this.f78042, 0, interfaceC191012.length(), 8388626);
                    interfaceC19108 = this.f78058;
                    if (!(interfaceC19108 instanceof C3354)) {
                        interfaceC19108.setSelection(0);
                    }
                    this.f78002 = -1.0f;
                    m53845();
                    if (!this.f78019) {
                        if (this.f78033.m4840()) {
                            this.f78033.m4830((CharSequence) this.f78058);
                            this.f78033.m4818(this.f78058);
                        }
                        if (!this.f78066.f45755) {
                            this.f78029.m40504(C17243.f56170);
                        } else {
                            this.f78029.m40504(C17243.f56170);
                        }
                        if (!this.f78019) {
                            if (c17418 != null) {
                                c17418.f56627 = this.f78058.mo15344();
                            }
                            this.f78022.mo25242(this.f78058);
                            m53959();
                            interfaceC19109 = this.f78058;
                            if (!(interfaceC19109 instanceof C3354)) {
                                interfaceC19109.mo11051(true);
                            }
                            this.f78088 = -1;
                            if (c17418 != null) {
                                length = this.f78058.length();
                                int i4 = SharedPreferencesOnSharedPreferenceChangeListenerC3444.f11224;
                                if (length > C21576.f68932.getInt("smooth_mode_threshold", 200000)) {
                                    this.f78098 = true;
                                }
                            } else {
                                length = this.f78058.length();
                                int i5 = SharedPreferencesOnSharedPreferenceChangeListenerC3444.f11224;
                                if (length > C21576.f68932.getInt("smooth_mode_threshold", 200000)) {
                                    this.f78098 = true;
                                }
                            }
                            if (c17418 == null) {
                                m53787(Math.max(0, 0), true);
                            }
                            if (c17418 != null) {
                                c17418.f56632 = true;
                            }
                            this.f78103 = false;
                            m53745();
                            m53733();
                            if (!this.f78019) {
                                postInvalidate();
                            }
                            return charSequence;
                        }
                    }
                }
            }
            this.f77996 = null;
            this.f78024 = false;
            this.f78033.m4797();
            this.f78103 = false;
            m53745();
            m53733();
            return charSequence;
        } catch (Throwable th) {
            this.f77996 = null;
            this.f78024 = false;
            this.f78033.m4797();
            this.f78103 = false;
            m53745();
            m53733();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m53787(int i, boolean z) {
        if (Looper.myLooper() != Looper.getMainLooper() && this.f78066.f45755 && this.f78033.m4816()) {
            if (z || !(this.f78103 || this.f78076 || this.f78134)) {
                InterfaceC19106 interfaceC19106 = this.f78058;
                AbstractC13753 abstractC13753 = this.f78022;
                long j = this.f78046;
                while (abstractC13753.mo25237()) {
                    try {
                        if (interfaceC19106 != this.f78058 || j != this.f78046) {
                            return;
                        }
                        if (z && this.f78019) {
                            return;
                        } else {
                            Thread.sleep(10L);
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
                synchronized (this.f78115) {
                    if (interfaceC19106 == this.f78058 && abstractC13753 == this.f78022 && abstractC13753.f43646 == interfaceC19106 && j == this.f78046 && !abstractC13753.mo25237() && ((!z || !this.f78019) && (z || (!this.f78103 && !this.f78076 && !this.f78134)))) {
                        int iM53993 = m53993();
                        long jMo25240 = (!z || interfaceC19106.length() <= 1000000 || iM53993 <= 0) ? 0L : abstractC13753.mo25240(i, iM53993);
                        this.f78033.m4804(interfaceC19106, (int) (jMo25240 >>> 32), (int) jMo25240);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public final String m54047() {
        return this.f78066.f45796;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m53983(String str) {
        this.f78066.f45796 = str;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m54012() {
        m53848("Session text preparation was canceled");
        this.f77996 = null;
        this.f78019 = true;
        this.f78024 = false;
        this.f78033.m4797();
        this.f78022.f43670 = true;
        this.f78022.f43653 = true;
        C19656 c19656 = this.f77990;
        if (c19656 != null) {
            c19656.m45311();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final FutureC23690 m53980(InterfaceC19106 interfaceC19106) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Initial highlight readiness requires the foreground thread");
        }
        AbstractC13753 abstractC13753 = this.f78022;
        int iMo15344 = interfaceC19106.mo15344();
        long jUptimeMillis = SystemClock.uptimeMillis() + 500;
        FutureC23690 futureC23690 = new FutureC23690();
        new RunnableC24175(this, futureC23690, interfaceC19106, abstractC13753, iMo15344, jUptimeMillis).run();
        return futureC23690;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final FutureC23690 m54069(C3354 c3354, C15926 c15926) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Session readiness requires the foreground thread");
        }
        FutureC23690 futureC23690 = new FutureC23690();
        C21576.m49068(new RunnableC4037(this, futureC23690, c15926, c3354));
        return futureC23690;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    private C15926 m53740(boolean z) {
        C15926 c15926;
        synchronized (this.f78048) {
            if (this.f78112 != null) {
                throw new IllegalStateException("Session task is already active");
            }
            c15926 = new C15926(z);
            this.f78112 = c15926;
        }
        return c15926;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C15926 m53949() {
        C15926 c15926M53740;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Session preparation requires the main thread");
        }
        synchronized (this.f78048) {
            if (this.f78112 != null || this.f78067 != null || !this.f78048.isEmpty() || !m53994() || m53884() || this.f78021 != null || this.f78058.mo11034()) {
                throw new IllegalStateException("View is busy before session preparation");
            }
            c15926M53740 = m53740(true);
            m53992(true);
        }
        return c15926M53740;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15926 m53894(C3354 c3354) {
        if (Looper.myLooper() != Looper.getMainLooper() || this.f78058 != c3354) {
            throw new IllegalStateException("Session close requires its foreground owner");
        }
        return m53740(false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m53938(C3354 c3354, C15926 c15926) {
        String str;
        if (Looper.myLooper() != Looper.getMainLooper() || this.f78058 != c3354 || c15926 == null || c15926 != this.f78112) {
            throw new IllegalStateException("Session close requires its foreground task");
        }
        if (!c3354.m11044()) {
            this.f78004 = "internal_edit";
            return false;
        }
        synchronized (this.f78048) {
            if (this.f78067 != null || !this.f78048.isEmpty()) {
                str = "preference_tasks";
            } else if (this.f78103) {
                str = "preparing_text";
            } else if (this.f78024) {
                str = "prepare_finish";
            } else if (this.f78134) {
                str = "restoring_state";
            } else if (this.f78021 != null) {
                str = "restoring_scroll";
            } else if (m53884()) {
                str = "layout";
            } else {
                str = this.f78058.mo11034() ? "replacing_text" : "none";
            }
            this.f78004 = str;
            if (!str.equals("none")) {
                return false;
            }
            c15926.f51734 = true;
            return true;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53919(C15926 c15926) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Session preparation requires the main thread");
        }
        synchronized (this.f78048) {
            if (c15926 != null) {
                if (c15926 == this.f78112) {
                    m53830(c15926);
                    this.f78112 = null;
                    m53856();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53926(InterfaceC19106 interfaceC19106) {
        if (Looper.myLooper() != Looper.getMainLooper() || this.f78103 || m53884()) {
            throw new IllegalStateException("Session preparation is still reading the view");
        }
        if (this.f78058 != interfaceC19106) {
            return;
        }
        InterfaceC12943 interfaceC12943 = this.f77988;
        this.f77988 = null;
        try {
            mo52335("");
        } finally {
            this.f77988 = interfaceC12943;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 13171. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m53695(android.graphics.Canvas r23) {
        /*
            Method dump skipped, instruction units count: 1317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C24132.m53695(android.graphics.Canvas):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53895() {
        this.f77996 = null;
        if (this.f78024) {
            this.f78024 = false;
            RunnableC8337 runnableC8337 = new RunnableC8337(0, this, this.f78058);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                runnableC8337.run();
            } else {
                post(runnableC8337);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m53716(C24132 c24132, InterfaceC19106 interfaceC19106) {
        if (c24132.f78058 == interfaceC19106 && c24132.m53878()) {
            c24132.requestLayout();
            c24132.invalidate();
            c24132.f78018.m9609(interfaceC19106);
            c24132.f78033.m4837(interfaceC19106);
            c24132.m53733();
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    public void mo52335(CharSequence charSequence) {
        m53847(charSequence);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m53847(CharSequence charSequence) {
        this.f77996 = null;
        this.f78024 = false;
        if (charSequence == null) {
            charSequence = "";
        }
        if (charSequence instanceof C3354) {
            this.f78066.f45796 = ((C3354) charSequence).mo11043().m41081().m48296();
        } else {
            this.f78066.f45796 = C14540.m35081(charSequence);
            charSequence = C14540.m35080(charSequence);
        }
        int iMo11048 = this.f78058.mo11048();
        InterfaceC19106 interfaceC19106M53759 = m53759(charSequence);
        InterfaceC19106 interfaceC19106 = this.f78058;
        m53808(interfaceC19106M53759);
        this.f78018.m9612(this.f78058);
        this.f78033.m4822();
        this.f78029.m40506();
        if (interfaceC19106 != interfaceC19106M53759) {
            interfaceC19106.mo11039(false);
        }
        this.f78058.mo11038(this.f77984);
        this.f78058.mo11036(iMo11048);
        InterfaceC19106 interfaceC19107 = this.f78058;
        interfaceC19107.setSpan(this.f78042, 0, interfaceC19107.length(), 8388626);
        InterfaceC19106 interfaceC19108 = this.f78058;
        if (!(interfaceC19108 instanceof C3354)) {
            interfaceC19108.mo11043().m41111();
        }
        if (this.f78033.m4840()) {
            this.f78033.m4830((CharSequence) this.f78058);
        }
        if (this.f78066.f45755 && this.f78033.m4816()) {
            this.f78029.m40504(this.f78033.m4811());
        } else {
            this.f78029.m40504(C17243.f56170);
        }
        this.f78022.mo25242(this.f78058);
        m53745();
        this.f78018.m9609(this.f78058);
        m54030();
        m53959();
        InterfaceC19106 interfaceC19109 = this.f78058;
        if (!(interfaceC19109 instanceof C3354)) {
            m54016(false);
            this.f78058.setSelection(0);
        } else {
            InterfaceC12943 interfaceC12943 = this.f77988;
            if (interfaceC12943 != null) {
                interfaceC12943.mo15545(((C3354) interfaceC19109).isChanged());
            }
        }
        this.f78002 = -1.0f;
        m53845();
        if (!isInEditMode()) {
            int length = this.f78058.length();
            int i = SharedPreferencesOnSharedPreferenceChangeListenerC3444.f11224;
            if (length > C21576.f68932.getInt("smooth_mode_threshold", 200000)) {
                this.f78098 = true;
            }
        }
        requestLayout();
        invalidate();
    }

    /* JADX INFO: renamed from: ᩻᩸, reason: not valid java name and contains not printable characters */
    public final void m54111() {
        this.f78102 = true;
        this.f78121.incrementAndGet();
        C8511 c8511 = this.f78032;
        if (c8511 != null) {
            c8511.f27818 = 0;
            c8511.f27822 = false;
            c8511.f27820 = false;
            c8511.f27819 = -1;
            c8511.f27821 = -1;
        }
        this.f78081 = 0;
        this.f78131 = 0;
    }

    /* JADX INFO: renamed from: ۬ۤ, reason: not valid java name and contains not printable characters */
    public final void m54010() {
        this.f78102 = false;
        m53767();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۤᩴ, reason: not valid java name and contains not printable characters */
    public void m53767() {
        if (!C22415.m50557()) {
            C21576.m49068(new RunnableC3117(this, 0));
        } else {
            if (this.f78102 || this.f78124 || !isFocused() || m54083()) {
                return;
            }
            m53962();
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m54092(int i) {
        return (i != this.f78121.get() || this.f78102 || this.f78040 == this.f78058) ? false : true;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m54053(int i) {
        return m54092(i) && !m54083() && m53748();
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public void m54023() {
        this.f78022.mo25242(this.f78058);
        m53745();
        this.f78002 = -1.0f;
        m53845();
        requestLayout();
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        if (m54083() || this.f78102) {
            return null;
        }
        if (this.f78032 == null) {
            C8511 c8511 = new C8511();
            new ExtractedText();
            this.f78032 = c8511;
        }
        editorInfo.imeOptions = mo52341();
        editorInfo.inputType = mo52297();
        C15858 c15858 = new C15858(this, this.f78121.get());
        this.f78118.add(c15858);
        return new InputConnectionC23318(c15858);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m54107(boolean z) {
        C14540 c14540 = this.f78066;
        if (c14540.f45805 != z) {
            c14540.f45805 = z;
            if (z) {
                m54001();
            } else {
                m53962();
            }
            InterfaceC12943 interfaceC12943 = this.f77988;
            if (interfaceC12943 != null) {
                interfaceC12943.mo15546(m53957(), m53999());
            }
        }
    }

    /* JADX INFO: renamed from: ۤۤ, reason: not valid java name and contains not printable characters */
    public final boolean m53988() {
        return this.f78066.f45805;
    }

    /* JADX INFO: renamed from: ᩷ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m54083() {
        return this.f78066.f45805 || this.f78040 == this.f78058;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53918(C15574 c15574) {
        this.f78023 = c15574;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m53943(InterfaceC19106 interfaceC19106, RuntimeException runtimeException) {
        if (!(interfaceC19106 instanceof C3354)) {
            return false;
        }
        if (!(runtimeException instanceof UncheckedIOException) && !(runtimeException instanceof C24219)) {
            return false;
        }
        m53700(interfaceC19106, runtimeException, (C16361) null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m53700(final InterfaceC19106 interfaceC19106, final RuntimeException runtimeException, final C16361 c16361) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            C21576.m49068(new Runnable() { // from class: l.ܶ۠᩸
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51845.m53700(interfaceC19106, runtimeException, c16361);
                }
            });
            return;
        }
        if (this.f78058 == interfaceC19106) {
            if (this.f78040 == interfaceC19106 && (c16361 == null || (interfaceC19106 instanceof C3354))) {
                return;
            }
            this.f78040 = interfaceC19106;
            this.f78095 = runtimeException;
            this.f78121.incrementAndGet();
            C8511 c8511 = this.f78032;
            if (c8511 != null) {
                c8511.f27818 = 0;
                c8511.f27822 = false;
                c8511.f27820 = false;
                c8511.f27819 = -1;
                c8511.f27821 = -1;
            }
            this.f78081 = 0;
            this.f78131 = 0;
            this.f78018.m9603();
            this.f78033.m4824();
            invalidate();
            C21576.m49068(new Runnable() { // from class: l.᩹۠᩸
                @Override // java.lang.Runnable
                public final void run() {
                    C24132.m53717(this.f75854, interfaceC19106, runtimeException, c16361);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m53717(final C24132 c24132, final InterfaceC19106 interfaceC19106, final RuntimeException runtimeException, final C16361 c16361) {
        AbstractActivityC17204 abstractActivityC17204;
        if (c24132.f78058 == interfaceC19106 && c24132.f78040 == interfaceC19106 && c24132.f78095 == runtimeException) {
            if (interfaceC19106 instanceof C3354) {
                C3354 c3354 = (C3354) interfaceC19106;
                InterfaceC1757 interfaceC1757 = c24132.f78023;
                if (interfaceC1757 != null) {
                    C7941.m21543((C7941) ((C15574) interfaceC1757).f50654, c3354, runtimeException);
                    return;
                }
                return;
            }
            if (c16361 == null || (abstractActivityC17204 = c24132.f78034) == null || abstractActivityC17204.isFinishing() || c24132.f78034.isDestroyed()) {
                return;
            }
            C2361 c2361BuildDialog = c24132.f78034.buildDialog();
            c2361BuildDialog.m8021(R.string.MT_Protector);
            c2361BuildDialog.m8008(C22327.m50390(runtimeException));
            c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܿۖ᩸
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    RuntimeException runtimeException2 = runtimeException;
                    C16361 c16362 = c16361;
                    C24132 c24133 = this.f59048;
                    c24133.m53696(new Runnable() { // from class: l.ۡۖ᩸
                        @Override // java.lang.Runnable
                        public final void run() {
                            C24132.m53838(this.f29514, interfaceC19106, runtimeException2, c16362);
                        }
                    }, new RunnableC2371());
                }
            });
            c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c2361BuildDialog.m8016();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m53838(C24132 c24132, InterfaceC19106 interfaceC19106, RuntimeException runtimeException, C16361 c16361) {
        if (c24132.f78058 == interfaceC19106 && c24132.f78040 == interfaceC19106 && c24132.f78095 == runtimeException) {
            c24132.m53920(c16361);
        }
    }

    /* JADX INFO: renamed from: ۙ᩸, reason: not valid java name and contains not printable characters */
    public final void m53947() {
        C14540 c14540 = this.f78066;
        if (!c14540.f45782) {
            c14540.f45782 = true;
            if (m54083()) {
                invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m54058(int i) {
        this.f78066.m16198(i);
        this.f78002 = -1.0f;
    }

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public final int m54057() {
        return this.f78066.m16214();
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m54025(boolean z) {
        C14540 c14540 = this.f78066;
        if (c14540.m16190() != z) {
            c14540.m16201(z);
            postInvalidate();
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m53951(boolean z) {
        C14540 c14540 = this.f78066;
        if (c14540.m16216() != z) {
            c14540.m16221(z);
            postInvalidate();
        }
    }

    /* JADX INFO: renamed from: ۠᩷ */
    public boolean mo40459() {
        return this.f78066.f45753;
    }

    /* JADX INFO: renamed from: ۠ۤ, reason: not valid java name and contains not printable characters */
    public final void m53969() {
        this.f78002 = -1.0f;
    }

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public static void m53857(C24132 c24132) {
        c24132.f78016 = true;
        c24132.f78128 = false;
        if (!c24132.isFocused()) {
            c24132.requestFocus();
            c24132.invalidate();
        }
        c24132.m53970();
    }

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public static void m53803(C24132 c24132) {
        c24132.f78016 = false;
        c24132.f78128 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean m53813(float f, float f2) {
        return f >= ((float) getPaddingLeft()) && f <= ((float) (getWidth() - getPaddingRight())) && f2 >= ((float) getPaddingTop()) && f2 <= ((float) (getHeight() - getPaddingBottom()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public void m53760(MotionEvent motionEvent) {
        if (m53884()) {
            return;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (m53813(x, y)) {
            int iM33616 = this.f78022.m33616((getScrollX() + x) - getPaddingLeft(), (this.f78104 + y) - getPaddingTop());
            int iM53968 = m53968();
            int iM53882 = m53882();
            int iMin = Math.min(iM53968, iM53882);
            int iMax = Math.max(iM53968, iM53882);
            if (iMin == iMax || iMin > iM33616 || iM33616 > iMax) {
                mo52339(iM33616);
            }
            this.f78073 = SystemClock.uptimeMillis();
            m53880();
            if (m53842((int[]) null)) {
                this.f78109.m46006((int) x, (int) y);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x008b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0093  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f6  */
    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float scrollX;
        int actionMasked;
        if (!m53872()) {
            if (Build.VERSION.SDK_INT < 23 || !m53841(motionEvent) || (((actionMasked = motionEvent.getActionMasked()) != 11 && actionMasked != 12) || motionEvent.getActionButton() != 2)) {
                boolean z = (motionEvent.getMetaState() & 4096) != 0;
                if ((motionEvent.getSource() & 2) == 0 && motionEvent.getAction() == 8) {
                    m53742();
                    float fM53965 = 0.0f;
                    if (z) {
                        float axisValue = (motionEvent.getAxisValue(9) / 20.0f) + 1.0f;
                        float textSize = this.f78066.f18967.getTextSize();
                        if (this.f78066.m35090(axisValue * textSize)) {
                            float textSize2 = this.f78066.f18967.getTextSize() / textSize;
                            this.f78022.mo25221(textSize);
                            if (this.f78022.mo25225()) {
                                float x = motionEvent.getX();
                                scrollX = ((getScrollX() + x) * textSize2) - x;
                                if (scrollX < 0.0f) {
                                    scrollX = 0.0f;
                                } else {
                                    float fM53868 = m53868();
                                    if (scrollX > fM53868) {
                                        scrollX = fM53868;
                                    }
                                }
                            } else {
                                scrollX = 0.0f;
                            }
                            float y = motionEvent.getY();
                            float f = ((this.f78104 + y) * textSize2) - y;
                            if (f >= 0.0f) {
                                fM53965 = m53965();
                                if (f <= fM53965) {
                                    fM53965 = f;
                                }
                            }
                            m53694((int) scrollX, (int) fM53965, true);
                            invalidate();
                            this.f78037.removeMessages(7);
                            this.f78037.sendEmptyMessageDelayed(7, 200L);
                            return true;
                        }
                    } else {
                        float axisValue2 = this.f78022.mo25225() ? motionEvent.getAxisValue(10) : 0.0f;
                        float axisValue3 = motionEvent.getAxisValue(9);
                        m53694(m53948((int) ((this.f78066.m16211() * axisValue2) + getScrollX())), m53873((int) (this.f78104 - (this.f78066.m16189() * axisValue3))), true);
                        if (axisValue2 != 0.0f) {
                            m54022();
                        }
                        if (axisValue3 != 0.0f) {
                            m53955();
                        }
                    }
                } else {
                    return super.onGenericMotionEvent(motionEvent);
                }
            } else if (actionMasked == 11) {
                if (!this.f78016) {
                    this.f78016 = true;
                    this.f78128 = false;
                    if (!isFocused()) {
                        requestFocus();
                        invalidate();
                    }
                    m53970();
                    m53760(motionEvent);
                    return true;
                }
            } else if (actionMasked == 12) {
                if (this.f78016 && !this.f78128) {
                    this.f78016 = false;
                    this.f78128 = false;
                    return true;
                }
            } else {
                if ((motionEvent.getMetaState() & 4096) != 0) {
                }
                if ((motionEvent.getSource() & 2) == 0) {
                }
                return super.onGenericMotionEvent(motionEvent);
            }
        } else if (motionEvent.getAction() == 8 && (motionEvent.getMetaState() & 4096) == 0) {
            this.f77990.m45312((int) (motionEvent.getAxisValue(10) * this.f78066.m16211()), (int) (motionEvent.getAxisValue(9) * (-this.f78066.m16189())));
            return true;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0078  */
    /* JADX WARN: Code duplicated, block: B:38:0x007f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0088  */
    /* JADX WARN: Code duplicated, block: B:43:0x0097  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00bb  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a7, code lost:
    
        if (r6 <= r7) goto L56;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.PointerIcon onResolvePointerIcon(android.view.MotionEvent r6, int r7) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C24132.onResolvePointerIcon(android.view.MotionEvent, int):android.view.PointerIcon");
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int i;
        if (m53841(motionEvent)) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 10) {
                m53773();
            } else if (actionMasked == 9 || actionMasked == 7) {
                this.f78083 = motionEvent.getX();
                float y = motionEvent.getY();
                this.f78087 = y;
                int iM53786 = m53786(this.f78083, y);
                int i2 = iM53786 & 1;
                boolean z = i2 != 0 && m53674() > 0.0f;
                int i3 = iM53786 & 2;
                boolean z2 = i3 != 0 && mo52317() > 0.0f;
                if (z && z2) {
                    if (this.f77982 >= this.f78028) {
                        z = false;
                    } else {
                        z2 = false;
                    }
                }
                this.f78054 = z;
                this.f78105 = z2;
                if (z) {
                    m53677();
                }
                if (this.f78105) {
                    m53757();
                }
                if (iM53786 == 0) {
                    m53742();
                }
                if (i3 != 0) {
                    i = 2;
                } else {
                    i = i2 != 0 ? 1 : 0;
                }
                if (i == 0 || (i != 1 ? !(i != 2 || mo52317() <= 0.0f) : m53674() > 0.0f)) {
                    m53742();
                } else if (this.f77994 != i) {
                    this.f77994 = i;
                    HandlerC0308 handlerC0308 = this.f78037;
                    handlerC0308.removeMessages(8);
                    handlerC0308.sendEmptyMessageDelayed(8, 300L);
                }
            }
        }
        return m53841(motionEvent) || super.onHoverEvent(motionEvent);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private int m53786(float f, float f2) {
        int i = 0;
        if (!m53872() && !this.f78076 && !this.f78103 && !this.f78022.f43643.isEmpty()) {
            int iM54108 = m54108();
            int iM53993 = m53993();
            int scrollX = getScrollX();
            int i2 = this.f78104;
            if (m53724(this.f78068, scrollX, i2, iM54108, iM53993)) {
                float paddingLeft = (f + scrollX) - getPaddingLeft();
                float paddingTop = f2 - getPaddingTop();
                AbstractC13753 abstractC13753 = this.f78022;
                Rect rect = this.f78068;
                int i3 = rect.left;
                int i4 = rect.top - i2;
                int iWidth = rect.width();
                int iHeight = this.f78068.height();
                C14540 c14540 = abstractC13753.f43640;
                int iMo52292 = abstractC13753.f43659.mo52292();
                int i5 = iM53993 + iMo52292;
                if (iM54108 > 0 && iM53993 > 0 && i5 > 0 && iWidth > 0 && iHeight > 0) {
                    int i6 = iWidth + i3;
                    int i7 = iHeight + i4 + iMo52292;
                    double dM33639 = abstractC13753.m33639();
                    if (dM33639 > 0.0d) {
                        double d = i5;
                        if (dM33639 - d > 0.0d && c14540.f45784 && dM33639 / d > 3.0d && (!c14540.f45816 ? !(paddingLeft < i3 || paddingLeft > c14540.f45797 + i3 || paddingTop < i4 || paddingTop > i7) : !(paddingLeft < i6 - c14540.f45797 || paddingLeft > i6 || paddingTop < i4 || paddingTop > i7))) {
                            i = 1;
                        }
                    }
                    float fMo25232 = abstractC13753.mo25232();
                    if (abstractC13753.mo25225() && fMo25232 > 0.0f) {
                        float f3 = iM54108;
                        if (fMo25232 - f3 > 0.0f && c14540.f45760 && fMo25232 / f3 > 3.0f) {
                            if (c14540.f45769 && c14540.f45744) {
                                if (c14540.f45816) {
                                    i3 += abstractC13753.f43630;
                                } else {
                                    i6 -= abstractC13753.f43630;
                                }
                            }
                            if (i6 >= i3 && paddingLeft >= i3 && paddingLeft <= i6 && paddingTop >= i7 - c14540.f45797 && paddingTop <= i7) {
                                return i | 2;
                            }
                        }
                    }
                }
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ۤ᩷, reason: not valid java name and contains not printable characters */
    public static void m53768(C24132 c24132) {
        int i;
        int i2 = c24132.f77994;
        c24132.f77994 = 0;
        if (i2 == 0) {
            return;
        }
        int iM53786 = c24132.m53786(c24132.f78083, c24132.f78087);
        if ((iM53786 & 2) != 0) {
            i = 2;
        } else {
            i = (iM53786 & 1) != 0 ? 1 : 0;
        }
        if (i != i2) {
            c24132.f78054 = false;
            c24132.f78105 = false;
        } else if (i2 == 1) {
            c24132.m53955();
            c24132.f78054 = true;
            c24132.f78105 = false;
        } else if (i2 == 2) {
            c24132.m54022();
            c24132.f78054 = false;
            c24132.f78105 = true;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m53707(C24132 c24132, int i, MotionEvent motionEvent) {
        c24132.f78083 = motionEvent.getX();
        float y = motionEvent.getY();
        c24132.f78087 = y;
        if ((c24132.m53786(c24132.f78083, y) & i) != 0) {
            c24132.f78054 = i == 1;
            c24132.f78105 = i == 2;
        } else {
            c24132.f78054 = false;
            c24132.f78105 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۛ᩸, reason: not valid java name and contains not printable characters */
    public void m53742() {
        this.f77994 = 0;
        this.f78037.removeMessages(8);
    }

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public static void m53784(C24132 c24132) {
        c24132.f78054 = false;
        c24132.f78105 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۨ᩸, reason: not valid java name and contains not printable characters */
    public void m53773() {
        m53742();
        this.f78054 = false;
        this.f78105 = false;
    }

    /* JADX INFO: renamed from: ֡᩸, reason: not valid java name and contains not printable characters */
    private float m53674() {
        if (this.f78056) {
            return 1.0f;
        }
        return m53690(this.f78028);
    }

    /* JADX INFO: renamed from: ۨۙ */
    public float mo52317() {
        if (this.f78107) {
            return 1.0f;
        }
        return m53690(this.f77982);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static float m53690(long j) {
        int iUptimeMillis = (int) (SystemClock.uptimeMillis() - j);
        if (iUptimeMillis < 0) {
            return 0.0f;
        }
        if (iUptimeMillis <= 1500) {
            return 1.0f;
        }
        int i = iUptimeMillis - 1500;
        if (i < 300) {
            return 1.0f - (i / 300.0f);
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean m53854(float f) {
        C14540 c14540 = this.f78066;
        if (!c14540.f45769) {
            return false;
        }
        if (c14540.f45744) {
            if (c14540.f45816) {
                return f - ((float) getScrollX()) <= ((float) this.f78022.f43630);
            }
            return f - ((float) getScrollX()) >= ((float) (m54108() - this.f78022.f43630));
        }
        if (c14540.f45816) {
            return f <= ((float) this.f78022.f43630);
        }
        return f >= this.f78022.mo25232() - ((float) this.f78022.f43630);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!m53748()) {
            return false;
        }
        InterfaceC19106 interfaceC19106 = this.f78040;
        InterfaceC19106 interfaceC19107 = this.f78058;
        if (interfaceC19106 == interfaceC19107) {
            return false;
        }
        try {
            return m53723(i, keyEvent);
        } catch (UncheckedIOException | C24219 e) {
            if (m53943(interfaceC19107, e)) {
                return false;
            }
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x017b  */
    /* JADX WARN: Code duplicated, block: B:105:0x0181  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e8  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m53723(int i, KeyEvent keyEvent) {
        int iIndexOf;
        int iM33620;
        int length;
        KeyEvent keyEvent2 = keyEvent == null ? new KeyEvent(0, i) : keyEvent;
        boolean z = MetaKeyKeyListener.getMetaState(this.f78058, 1) == 1;
        boolean zIsCtrlPressed = keyEvent2.isCtrlPressed();
        boolean zIsAltPressed = keyEvent2.isAltPressed();
        boolean z2 = z || MetaKeyKeyListener.getMetaState(this.f78058, 2048) != 0;
        int iM53968 = m53968();
        int iM53882 = m53882();
        int iMin = Math.min(iM53968, iM53882);
        int iMax = Math.max(iM53968, iM53882);
        if (i != 29) {
            if (i != 31) {
                if (i != 34) {
                    if (i != 50) {
                        if (i != 63) {
                            if (i != 112) {
                                if (i != 46) {
                                    if (i != 47) {
                                        if (i != 66) {
                                            if (i != 67) {
                                                if (i == 92) {
                                                    int iM33646 = this.f78022.m33646(iM53882);
                                                    if (iM33646 > 0) {
                                                        int iM53993 = (int) (m53993() / this.f78066.m16189());
                                                        int iMax2 = Math.max(0, iM33646 - iM53993);
                                                        C15508 c15508Mo15350 = this.f78058.mo15350();
                                                        try {
                                                            float fM16205 = this.f78002;
                                                            if (fM16205 < 0.0f) {
                                                                fM16205 = this.f78066.m16205(c15508Mo15350, this.f78022.f43643.get(iM33646).f45295, iM53882, 0.0f) + this.f78022.m33640(iM33646);
                                                                this.f78002 = fM16205;
                                                            }
                                                            int iM33621 = this.f78022.m33620(c15508Mo15350, iMax2, fM16205);
                                                            c15508Mo15350.close();
                                                            if (z2) {
                                                                this.f78058.setSelection(m53968(), iM33621);
                                                            } else {
                                                                this.f78058.setSelection(iM33621);
                                                                m53880();
                                                            }
                                                            this.f78073 = 0L;
                                                            int iM33615 = this.f78022.m33615(this.f78104 + 1) - iM53993;
                                                            if (iM33615 < 0) {
                                                                iM33615 = 0;
                                                            }
                                                            this.f77993 = (int) (this.f78066.m16189() * iM33615);
                                                            m53935(iM33621, false);
                                                            m53970();
                                                            m53845();
                                                            invalidate();
                                                            return true;
                                                        } catch (Throwable th) {
                                                            try {
                                                                c15508Mo15350.close();
                                                                throw th;
                                                            } catch (Throwable th2) {
                                                                th.addSuppressed(th2);
                                                                throw th;
                                                            }
                                                        }
                                                    }
                                                } else if (i == 93) {
                                                    int iM33647 = this.f78022.m33646(iM53882);
                                                    int size = this.f78022.f43643.size() - 1;
                                                    if (iM33647 < size) {
                                                        int iM53994 = (int) (m53993() / this.f78066.m16189());
                                                        int iMin2 = Math.min(size, iM33647 + iM53994);
                                                        C15508 c15508Mo15351 = this.f78058.mo15350();
                                                        try {
                                                            float fM16206 = this.f78002;
                                                            if (fM16206 < 0.0f) {
                                                                fM16206 = this.f78066.m16205(c15508Mo15351, this.f78022.f43643.get(iM33647).f45295, iM53882, 0.0f) + this.f78022.m33640(iM33647);
                                                                this.f78002 = fM16206;
                                                            }
                                                            int iM33622 = this.f78022.m33620(c15508Mo15351, iMin2, fM16206);
                                                            c15508Mo15351.close();
                                                            if (z2) {
                                                                this.f78058.setSelection(m53968(), iM33622);
                                                            } else {
                                                                this.f78058.setSelection(iM33622);
                                                                m53880();
                                                            }
                                                            this.f78073 = 0L;
                                                            int iM33616 = this.f78022.m33615(this.f78104 + 1) + iM53994;
                                                            if (iM33616 <= size) {
                                                                size = iM33616;
                                                            }
                                                            this.f77993 = (int) (this.f78066.m16189() * size);
                                                            m53935(iM33622, false);
                                                            m53845();
                                                            m53970();
                                                            invalidate();
                                                            return true;
                                                        } catch (Throwable th3) {
                                                            try {
                                                                c15508Mo15351.close();
                                                                throw th3;
                                                            } catch (Throwable th4) {
                                                                th3.addSuppressed(th4);
                                                                throw th3;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    if (i == 122) {
                                                        if (zIsCtrlPressed) {
                                                            C18910.m43908(this, z2);
                                                            return true;
                                                        }
                                                        C18910.m43906(this, z2);
                                                        return true;
                                                    }
                                                    if (i == 123) {
                                                        if (zIsCtrlPressed) {
                                                            C18910.m43917(this, z2);
                                                            return true;
                                                        }
                                                        C18910.m43912(this, z2);
                                                        return true;
                                                    }
                                                    switch (i) {
                                                        case 19:
                                                            int iM33648 = this.f78022.m33646(iM53882);
                                                            if (iM33648 > 0) {
                                                                C15508 c15508Mo15352 = this.f78058.mo15350();
                                                                try {
                                                                    float fM16207 = this.f78002;
                                                                    if (fM16207 < 0.0f) {
                                                                        fM16207 = this.f78066.m16205(c15508Mo15352, this.f78022.f43643.get(iM33648).f45295, iM53882, 0.0f) + this.f78022.m33640(iM33648);
                                                                        this.f78002 = fM16207;
                                                                    }
                                                                    iM33620 = this.f78022.m33620(c15508Mo15352, iM33648 - 1, fM16207);
                                                                    c15508Mo15352.close();
                                                                } catch (Throwable th5) {
                                                                    try {
                                                                        c15508Mo15352.close();
                                                                        throw th5;
                                                                    } catch (Throwable th6) {
                                                                        th5.addSuppressed(th6);
                                                                        throw th5;
                                                                    }
                                                                }
                                                            } else {
                                                                iM33620 = 0;
                                                            }
                                                            if (z2) {
                                                                this.f78058.setSelection(m53968(), iM33620);
                                                            } else {
                                                                this.f78058.setSelection(iM33620);
                                                                m53880();
                                                            }
                                                            this.f78073 = 0L;
                                                            m53935(iM33620, false);
                                                            m53970();
                                                            m53845();
                                                            invalidate();
                                                            return true;
                                                        case 20:
                                                            int iM33649 = this.f78022.m33646(iM53882);
                                                            if (iM33649 < this.f78022.f43643.size() - 1) {
                                                                C15508 c15508Mo15353 = this.f78058.mo15350();
                                                                try {
                                                                    float fM16208 = this.f78002;
                                                                    if (fM16208 < 0.0f) {
                                                                        fM16208 = this.f78066.m16205(c15508Mo15353, this.f78022.f43643.get(iM33649).f45295, iM53882, 0.0f) + this.f78022.m33640(iM33649);
                                                                        this.f78002 = fM16208;
                                                                    }
                                                                    length = this.f78022.m33620(c15508Mo15353, iM33649 + 1, fM16208);
                                                                    c15508Mo15353.close();
                                                                } catch (Throwable th7) {
                                                                    try {
                                                                        c15508Mo15353.close();
                                                                        throw th7;
                                                                    } catch (Throwable th8) {
                                                                        th7.addSuppressed(th8);
                                                                        throw th7;
                                                                    }
                                                                }
                                                            } else {
                                                                length = this.f78058.length();
                                                            }
                                                            if (z2) {
                                                                this.f78058.setSelection(m53968(), length);
                                                            } else {
                                                                this.f78058.setSelection(length);
                                                                m53880();
                                                            }
                                                            this.f78073 = 0L;
                                                            m53935(length, false);
                                                            m53970();
                                                            m53845();
                                                            invalidate();
                                                            return true;
                                                        case 21:
                                                            if (!zIsCtrlPressed || !zIsAltPressed) {
                                                                this.f78022.m33630();
                                                                if (zIsCtrlPressed) {
                                                                    int[] iArrM53736 = m53736(iM53882, true);
                                                                    String strSubstring = TextUtils.substring(this.f78058, iArrM53736[0], iArrM53736[1]);
                                                                    int i2 = iArrM53736[0];
                                                                    int iPreceding = iM53882 - i2;
                                                                    BreakIterator breakIterator = this.f78097;
                                                                    try {
                                                                        breakIterator.setText(strSubstring);
                                                                        do {
                                                                            iPreceding = breakIterator.preceding(iPreceding);
                                                                            if (iPreceding == -1) {
                                                                                iPreceding = 0;
                                                                            }
                                                                            iMin = i2 + iPreceding;
                                                                            if (z2) {
                                                                                this.f78058.setSelection(iM53968, iMin);
                                                                            } else {
                                                                                this.f78058.setSelection(iMin);
                                                                                m53880();
                                                                            }
                                                                        } while (!((iPreceding < 0 || iPreceding >= strSubstring.length()) ? false : Character.isLetterOrDigit(Character.codePointAt(strSubstring, iPreceding))));
                                                                    } catch (Exception unused) {
                                                                    }
                                                                    iMin = i2 + iPreceding;
                                                                    if (z2) {
                                                                        this.f78058.setSelection(iM53968, iMin);
                                                                    } else {
                                                                        this.f78058.setSelection(iMin);
                                                                        m53880();
                                                                    }
                                                                } else if (z2) {
                                                                    iMin = C1709.m6074(iM53882, this.f78058);
                                                                    this.f78058.setSelection(iM53968, iMin);
                                                                } else if (iM53968 != iM53882) {
                                                                    this.f78058.setSelection(iMin);
                                                                    m53880();
                                                                } else {
                                                                    iMin = C1709.m6074(iM53968, this.f78058);
                                                                    this.f78058.setSelection(iMin);
                                                                    m53880();
                                                                }
                                                                this.f78073 = 0L;
                                                                m53935(iMin, false);
                                                                m53970();
                                                                this.f78002 = -1.0f;
                                                                m53845();
                                                                invalidate();
                                                                return true;
                                                            }
                                                            break;
                                                        case 22:
                                                            if (zIsCtrlPressed && zIsAltPressed) {
                                                                return true;
                                                            }
                                                            this.f78022.m33630();
                                                            if (zIsCtrlPressed) {
                                                                int[] iArrM53737 = m53736(iM53882, true);
                                                                String strSubstring2 = TextUtils.substring(this.f78058, iArrM53737[0], iArrM53737[1]);
                                                                int i3 = iArrM53737[0];
                                                                int length2 = iM53882 - i3;
                                                                BreakIterator breakIterator2 = this.f78097;
                                                                try {
                                                                    breakIterator2.setText(strSubstring2);
                                                                    do {
                                                                        length2 = breakIterator2.following(length2);
                                                                        if (length2 == -1) {
                                                                            length2 = strSubstring2.length();
                                                                            break;
                                                                        }
                                                                        iMax = i3 + length2;
                                                                        if (z2) {
                                                                            this.f78058.setSelection(iM53968, iMax);
                                                                        } else {
                                                                            this.f78058.setSelection(iMax);
                                                                            m53880();
                                                                        }
                                                                    } while (!((length2 <= 0 || length2 > strSubstring2.length()) ? false : Character.isLetterOrDigit(Character.codePointBefore(strSubstring2, length2))));
                                                                } catch (Exception unused2) {
                                                                    length2 = strSubstring2.length();
                                                                }
                                                                iMax = i3 + length2;
                                                                if (z2) {
                                                                    this.f78058.setSelection(iM53968, iMax);
                                                                } else {
                                                                    this.f78058.setSelection(iMax);
                                                                    m53880();
                                                                }
                                                            } else if (z2) {
                                                                InterfaceC19106 interfaceC19106 = this.f78058;
                                                                iMax = C1709.m6073(iM53882, interfaceC19106.length(), interfaceC19106);
                                                                this.f78058.setSelection(iM53968, iMax);
                                                            } else if (iM53968 != iM53882) {
                                                                this.f78058.setSelection(iMax);
                                                                m53880();
                                                            } else {
                                                                InterfaceC19106 interfaceC19107 = this.f78058;
                                                                iMax = C1709.m6073(iM53968, interfaceC19107.length(), interfaceC19107);
                                                                this.f78058.setSelection(iMax);
                                                                m53880();
                                                            }
                                                            this.f78073 = 0L;
                                                            m53935(iMax, false);
                                                            m53970();
                                                            this.f78002 = -1.0f;
                                                            m53845();
                                                            invalidate();
                                                            return true;
                                                        default:
                                                            switch (i) {
                                                                case 52:
                                                                    if (zIsCtrlPressed && !z && !zIsAltPressed) {
                                                                        if (m53968() == m53882()) {
                                                                            C18910.m43916(this);
                                                                            return true;
                                                                        }
                                                                        mo52324(android.R.id.cut);
                                                                        return true;
                                                                    }
                                                                    break;
                                                                case 53:
                                                                    if (zIsCtrlPressed && !z && !zIsAltPressed) {
                                                                        if (!m53999()) {
                                                                            return true;
                                                                        }
                                                                        mo52287();
                                                                        return true;
                                                                    }
                                                                    break;
                                                                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                                                                    if (zIsCtrlPressed && !z && !zIsAltPressed) {
                                                                        if (!m53957()) {
                                                                            return true;
                                                                        }
                                                                        mo52325();
                                                                        return true;
                                                                    }
                                                                    break;
                                                                default:
                                                                    switch (i) {
                                                                        case 57:
                                                                        case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                                                                        case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                                                                        case 60:
                                                                            break;
                                                                        case 61:
                                                                            if (this.f78066.f45805) {
                                                                                return true;
                                                                            }
                                                                            try {
                                                                                if (z) {
                                                                                    C18910.m43911(this);
                                                                                } else {
                                                                                    C18910.m43894(this);
                                                                                }
                                                                                this.f78059.decrementAndGet();
                                                                                return true;
                                                                            } catch (Throwable th9) {
                                                                                this.f78059.decrementAndGet();
                                                                                throw th9;
                                                                            }
                                                                        default:
                                                                            switch (i) {
                                                                                case 277:
                                                                                    mo52324(android.R.id.cut);
                                                                                    return true;
                                                                                case 278:
                                                                                    mo52324(android.R.id.copy);
                                                                                    return true;
                                                                                case 279:
                                                                                    mo52324(android.R.id.paste);
                                                                                    return true;
                                                                            }
                                                                    }
                                                                    break;
                                                            }
                                                            break;
                                                    }
                                                }
                                            } else if (!this.f78066.f45805 && this.f78058.length() > 0) {
                                                if (iMin == iMax) {
                                                    iMin = C1709.m6074(iMax, this.f78058);
                                                }
                                                this.f78059.incrementAndGet();
                                                try {
                                                    this.f78058.delete(iMin, iMax);
                                                    this.f78059.decrementAndGet();
                                                    invalidate();
                                                    return true;
                                                } catch (Throwable th10) {
                                                    this.f78059.decrementAndGet();
                                                    throw th10;
                                                }
                                            }
                                        } else if (!mo52320() && !this.f78066.f45805) {
                                            m54088(iMin, iMax);
                                            invalidate();
                                            return true;
                                        }
                                    } else if (zIsCtrlPressed && !z && !zIsAltPressed) {
                                        this.f78090.mo4581(null);
                                        return true;
                                    }
                                } else if (zIsCtrlPressed && !z && !zIsAltPressed) {
                                    InterfaceC20598 interfaceC20598 = this.f77987;
                                    if (interfaceC20598 != null) {
                                        interfaceC20598.mo13087();
                                        interfaceC20598.mo13080(true);
                                        return true;
                                    }
                                }
                            } else if (!this.f78066.f45805 && this.f78058.length() > 0) {
                                if (iMin == iMax) {
                                    InterfaceC19106 interfaceC19108 = this.f78058;
                                    iMax = C1709.m6073(iMax, interfaceC19108.length(), interfaceC19108);
                                }
                                this.f78059.incrementAndGet();
                                try {
                                    this.f78058.delete(iMin, iMax);
                                    this.f78059.decrementAndGet();
                                    invalidate();
                                    return true;
                                } catch (Throwable th11) {
                                    this.f78059.decrementAndGet();
                                    throw th11;
                                }
                            }
                            return true;
                        }
                        f77977.onKeyDown(this, this.f78058, i, keyEvent2);
                        MetaKeyKeyListener.adjustMetaAfterKeypress(this.f78058);
                        return true;
                    }
                    if (zIsCtrlPressed && !z && !zIsAltPressed) {
                        mo52324(android.R.id.paste);
                        return true;
                    }
                } else if (zIsCtrlPressed && !z && !zIsAltPressed) {
                    InterfaceC20598 interfaceC20599 = this.f77987;
                    if (interfaceC20599 == null) {
                        return true;
                    }
                    interfaceC20599.mo13072();
                    return true;
                }
            } else if (zIsCtrlPressed && !z && !zIsAltPressed) {
                if (m53968() == m53882()) {
                    C18910.m43902(this);
                    return true;
                }
                mo52324(android.R.id.copy);
                return true;
            }
        } else if (zIsCtrlPressed && !z && !zIsAltPressed) {
            mo52324(android.R.id.selectAll);
            return true;
        }
        if (!this.f78066.f45805 && !zIsCtrlPressed) {
            this.f78059.incrementAndGet();
            try {
                boolean z3 = keyEvent2.isCapsLockOn() != keyEvent2.isShiftPressed();
                if (29 <= i && i <= 54) {
                    this.f78058.replace(iMin, iMax, String.valueOf((char) (((z3 ? 65 : 97) + i) - 29)));
                    int i4 = iMin + 1;
                    mo52339(i4);
                    m53935(i4, false);
                    return true;
                }
                if (7 <= i && i <= 16) {
                    this.f78058.replace(iMin, iMax, String.valueOf(z3 ? ")!@#$%^&*(".charAt(i - 7) : (char) (i + 41)));
                    int i5 = iMin + 1;
                    mo52339(i5);
                    m53935(i5, false);
                    return true;
                }
                char displayLabel = keyEvent2.getDisplayLabel();
                if (displayLabel != 0) {
                    if (z3 && (iIndexOf = "`-=[]\\;',./".indexOf(displayLabel)) != -1) {
                        displayLabel = "~_+{}|:\"<>?".charAt(iIndexOf);
                    }
                    this.f78058.replace(iMin, iMax, String.valueOf(displayLabel));
                    int i6 = iMin + 1;
                    mo52339(i6);
                    m53935(i6, false);
                    return true;
                }
            } finally {
                this.f78059.decrementAndGet();
            }
        }
        return super.onKeyDown(i, keyEvent2);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 63) {
            if (i == 66) {
                if (mo52320()) {
                    View viewFocusSearch = focusSearch(130);
                    if (viewFocusSearch != null) {
                        viewFocusSearch.requestFocus();
                        return true;
                    }
                    m54001();
                }
                return true;
            }
            switch (i) {
                case 57:
                case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                case 60:
                    break;
                default:
                    return super.onKeyUp(i, keyEvent);
            }
        }
        f77977.onKeyUp(this, this.f78058, i, keyEvent);
        return true;
    }

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public final int m53968() {
        int selectionStart = Selection.getSelectionStart(this.f78058);
        if (selectionStart < 0) {
            return 0;
        }
        return selectionStart > this.f78058.length() ? this.f78058.length() : selectionStart;
    }

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final int m53882() {
        int selectionEnd = Selection.getSelectionEnd(this.f78058);
        if (selectionEnd < 0) {
            return 0;
        }
        return selectionEnd > this.f78058.length() ? this.f78058.length() : selectionEnd;
    }

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public final int[] m53971() {
        int iM53968 = m53968();
        int iM53882 = m53882();
        if (iM53968 > iM53882) {
            iM53882 = iM53968;
            iM53968 = iM53882;
        }
        return new int[]{iM53968, iM53882};
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53900(View view, boolean z, boolean z2) {
        view.setVisibility(z ? 0 : 8);
        m53932(z, z2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53932(boolean z, boolean z2) {
        if (z) {
            this.f78072 = true;
            this.f78057 = false;
            this.f78010 = -1L;
        } else if (this.f78072) {
            this.f78072 = false;
            this.f78057 = z2;
            this.f78010 = -1L;
        } else if (!z2) {
            this.f78057 = false;
            this.f78010 = -1L;
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public final int m53877() {
        return this.f78099;
    }

    /* JADX INFO: renamed from: ܰ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m54014() {
        return this.f78072;
    }

    /* JADX INFO: renamed from: ܳᩴ, reason: not valid java name and contains not printable characters */
    private int m53793() {
        if (!this.f78057) {
            return 255;
        }
        if (Build.VERSION.SDK_INT >= 26 && !ValueAnimator.areAnimatorsEnabled()) {
            this.f78057 = false;
            return 255;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.f78010 < 0) {
            this.f78010 = jUptimeMillis;
        }
        float fMin = Math.min(1.0f, (jUptimeMillis - this.f78010) / 100.0f);
        if (fMin >= 1.0f) {
            this.f78057 = false;
        } else {
            postInvalidateOnAnimation();
        }
        return Math.round(((fMin * 0.5f) + 0.5f) * 255.0f);
    }

    /* JADX INFO: renamed from: ۨۤ, reason: not valid java name and contains not printable characters */
    public final void m54000() {
        this.f77996 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00d9, code lost:
    
        r0.f39209 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00db, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m53917(l.AbstractC13753 r10, int r11, int r12) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C24132.m53917(l.۬ۡ᩸, int, int):void");
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        InterfaceC19106 interfaceC19106 = this.f78058;
        int saveCount = canvas.getSaveCount();
        try {
            try {
                m53695(canvas);
                canvas.restoreToCount(saveCount);
            } catch (Throwable th) {
                canvas.restoreToCount(saveCount);
                throw th;
            }
        } catch (UncheckedIOException | C24219 e) {
            if (!m53943(interfaceC19106, e)) {
                throw e;
            }
            canvas.restoreToCount(saveCount);
        }
    }

    /* JADX INFO: renamed from: ᩴᩴ, reason: not valid java name and contains not printable characters */
    private void m53815() {
        int scrollX = getScrollX();
        int i = this.f78104;
        ViewOnTouchListenerC2545 viewOnTouchListenerC2545 = this.f78063;
        boolean z = true;
        boolean z2 = viewOnTouchListenerC2545 != null && viewOnTouchListenerC2545.f8155;
        if ((this.f78130 || this.f78069 || this.f78070 || z2) && this.f78015 != 0) {
            int iUptimeMillis = ((int) ((((int) (SystemClock.uptimeMillis() - this.f78133)) / 20.0f) * this.f78015)) + i;
            int iM53873 = m53873(iUptimeMillis);
            if (iM53873 != i) {
                this.f78119.forceFinished(true);
                this.f78037.removeMessages(1);
                m53694(scrollX, iM53873, true);
                this.f78133 = SystemClock.uptimeMillis();
                postInvalidateOnAnimation();
                if (this.f78070) {
                    m54072(this.f78125, this.f77999);
                } else if (z2) {
                    this.f78063.m8469(this.f78125, this.f77999);
                } else if (this.f78130) {
                    m54087(this.f78125, this.f77999);
                } else {
                    m53982(this.f78125, this.f77999);
                }
            } else {
                if (iUptimeMillis == iM53873) {
                    postInvalidateOnAnimation();
                }
                z = false;
            }
        } else {
            z = false;
        }
        if (this.f78075 != z) {
            this.f78075 = z;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m53724(Rect rect, int i, int i2, int i3, int i4) {
        if (i3 > 0 && i4 > 0) {
            if (!mo52338()) {
                rect.set(i, i2, i3 + i, i4 + i2);
                return true;
            }
            Rect rect2 = this.f78001;
            if (!getLocalVisibleRect(rect2)) {
                return false;
            }
            rect2.offset(0, i2 - getScrollY());
            int iMax = Math.max(0, i);
            int iMax2 = Math.max(0, i2);
            int iMax3 = Math.max(iMax, i + i3);
            int iMax4 = Math.max(iMax2, i2 + i4);
            int iM53691 = m53691(rect2.left - getPaddingLeft(), iMax, iMax3);
            int iM53692 = m53691(rect2.top - getPaddingTop(), iMax2, iMax4);
            int iM53693 = m53691(rect2.right - getPaddingLeft(), iMax, iMax3);
            int iM53694 = m53691(rect2.bottom - getPaddingTop(), iMax2, iMax4);
            int iMax5 = Math.max(iM53693 - iM53691, 0);
            int iMax6 = Math.max(iM53694 - iM53692, 0);
            if (iMax5 != 0 && iMax6 != 0) {
                rect.set(iM53691, iM53692, iMax5 + iM53691, iMax6 + iM53692);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public final int m53868() {
        int iM54108 = m54108();
        if (iM54108 <= 0) {
            return 0;
        }
        return Math.max((int) (this.f78022.mo25232() - iM54108), 0);
    }

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public final int m53965() {
        int iM53993 = m53993();
        if (iM53993 <= 0) {
            return 0;
        }
        return Math.max((int) (this.f78022.m33639() - ((double) iM53993)), 0);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m53948(int i) {
        if (i < 0) {
            return 0;
        }
        int iM53868 = m53868();
        return i > iM53868 ? iM53868 : i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m53873(int i) {
        if (i < 0) {
            return 0;
        }
        int iM53965 = m53965();
        return i > iM53965 ? iM53965 : i;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m54102() {
        OverScroller overScroller = this.f78119;
        if (!overScroller.isFinished()) {
            float currVelocity = overScroller.getCurrVelocity();
            if (currVelocity == 0.0f || currVelocity >= 5000.0f) {
                return false;
            }
        }
        InterfaceC14499 interfaceC14499 = this.f78066.f45791;
        if (m53888()) {
            return interfaceC14499 == null || interfaceC14499.mo7842();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m53888() {
        return !this.f78056 || SystemClock.uptimeMillis() - this.f78079 >= 100;
    }

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public static void m53756(C24132 c24132) {
        if (c24132.f78056) {
            c24132.f78056 = false;
            c24132.f78037.removeMessages(6);
            c24132.invalidate();
            InterfaceC14499 interfaceC14499 = c24132.f78066.f45791;
            if (interfaceC14499 != null) {
                interfaceC14499.mo7836();
            }
        }
    }

    @Override // android.view.View
    public final void computeScroll() {
        EdgeEffect edgeEffect;
        if (this.f78077) {
            return;
        }
        InterfaceC19106 interfaceC19106 = this.f78058;
        try {
            C19656 c19656 = this.f77990;
            if (c19656 != null) {
                c19656.m45320();
            }
            m53800(getScrollX(), this.f78104);
            m53685();
            m53815();
            C6232 c6232 = this.f78089;
            if (c6232 != null && !c6232.m17857(this)) {
                m53864();
            }
            if (this.f78119.computeScrollOffset()) {
                int scrollX = getScrollX();
                int i = this.f78104;
                int currX = this.f78119.getCurrX();
                int currY = this.f78119.getCurrY();
                if (currY != i) {
                    m53955();
                    if (this.f78060 && this.f78066.f45802) {
                        if (i > 0 && currY <= 0) {
                            this.f77989.onAbsorb((int) this.f78119.getCurrVelocity());
                        } else {
                            int iM53965 = m53965();
                            if (i < iM53965 && currY >= iM53965) {
                                this.f78027.onAbsorb((int) this.f78119.getCurrVelocity());
                            }
                        }
                    }
                }
                if (currX != scrollX) {
                    m54022();
                    if (this.f78060 && (edgeEffect = this.f78065) != null && this.f78045 != null && this.f78066.f45802) {
                        if (scrollX > 0 && currX <= 0) {
                            edgeEffect.onAbsorb((int) this.f78119.getCurrVelocity());
                        } else {
                            int iM53868 = m53868();
                            if (scrollX < iM53868 && currX >= iM53868) {
                                this.f78045.onAbsorb((int) this.f78119.getCurrVelocity());
                            }
                        }
                    }
                }
                m53819();
                this.f78055.incrementAndGet();
                m53694(currX, currY, false);
                invalidate();
            }
            if (this.f78119.isFinished()) {
                this.f78089 = null;
            }
        } catch (UncheckedIOException | C24219 e) {
            if (!m53943(interfaceC19106, e)) {
                throw e;
            }
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m53970();
        this.f78063.f8131 = 0L;
        if (z || this.f78106) {
            m53823();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩶᩸, reason: not valid java name and contains not printable characters */
    public void m53823() {
        m53689();
        if (m53872() || this.f78103 || this.f78022.f43646 != this.f78058) {
            this.f78106 = true;
            return;
        }
        if (this.f78134) {
            if (isAttachedToWindow()) {
                C21576.m49069(new RunnableC4783(0, this), 100L);
                return;
            }
            return;
        }
        this.f78106 = false;
        boolean zM33649 = this.f78022.m33649();
        boolean zM33636 = this.f78022.m33636();
        int scrollX = getScrollX();
        if (this.f78022.mo25225()) {
            scrollX = m53948(scrollX);
        } else {
            this.f78022.mo25236(m54108());
        }
        if (this.f78103) {
            return;
        }
        this.f78119.forceFinished(true);
        m53694(scrollX, m53873(this.f78104), false);
        if (!m53685() && this.f78064 == null && this.f78021 == null) {
            if (zM33649 || zM33636) {
                int iM53968 = m53968();
                int iM53882 = m53882();
                if (iM53968 > iM53882) {
                    iM53882 = iM53968;
                    iM53968 = iM53882;
                }
                if (!zM33649) {
                    iM53968 = iM53882;
                }
                m53935(iM53968, false);
                m53970();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public boolean mo52305(CharSequence charSequence) {
        try {
            this.f78005.setPrimaryClip(ClipData.newPlainText(null, charSequence));
            return true;
        } catch (Throwable unused) {
            C22673.m51152(R.string.MT_Protector);
            return false;
        }
    }

    /* JADX INFO: renamed from: ᩹᩷, reason: not valid java name and contains not printable characters */
    public final boolean m54100() {
        try {
            return this.f78005.hasPrimaryClip();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ܺ */
    public void mo52324(int i) {
        InterfaceC19106 interfaceC19106 = this.f78040;
        InterfaceC19106 interfaceC19107 = this.f78058;
        if (interfaceC19106 == interfaceC19107) {
            return;
        }
        try {
            m53821(i);
        } catch (UncheckedIOException | C24219 e) {
            if (!m53943(interfaceC19107, e)) {
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    private void m53821(int i) {
        String string;
        int iM53968 = m53968();
        int iM53882 = m53882();
        if (iM53968 > iM53882) {
            iM53882 = iM53968;
            iM53968 = iM53882;
        }
        boolean z = this.f78066.f45805;
        if (z && i == 16908320) {
            i = android.R.id.copy;
        }
        HandlerC0308 handlerC0308 = this.f78037;
        if (i != 16908328) {
            switch (i) {
                case android.R.id.selectAll:
                    if (this.f78058.length() > 0) {
                        mo52316(0, this.f78058.length());
                        handlerC0308.sendEmptyMessageDelayed(2, m53935(this.f78058.length(), false) ? 250L : 50L);
                    }
                    break;
                case android.R.id.cut:
                    if (iM53968 != iM53882 && mo52305(this.f78058.subSequence(iM53968, iM53882))) {
                        this.f78058.delete(iM53968, iM53882);
                        invalidate();
                        m53881();
                        break;
                    }
                    break;
                case android.R.id.copy:
                    if (iM53968 != iM53882 && mo52305(this.f78058.subSequence(iM53968, iM53882))) {
                        m53881();
                        break;
                    }
                    break;
                case android.R.id.paste:
                    if (!z && m54100()) {
                        try {
                            CharSequence text = this.f78005.getText();
                            string = text != null ? text.toString() : "";
                        } catch (Throwable th) {
                            string = th.toString();
                        }
                        String string2 = C14540.m35080(string).toString();
                        int length = this.f78058.length() - iM53882;
                        this.f78058.replace(iM53968, iM53882, string2);
                        mo52339(this.f78058.length() - length);
                        m53931(false);
                        m53881();
                        break;
                    }
                    break;
                default:
                    switch (i) {
                        case android.R.id.undo:
                            mo52325();
                            break;
                        case android.R.id.redo:
                            mo52287();
                            break;
                        default:
                            System.out.println("onTextContextMenuItem: " + i);
                            break;
                    }
                    break;
            }
            return;
        }
        m54089(m53968(), true);
        handlerC0308.sendEmptyMessageDelayed(2, 100L);
    }

    /* JADX INFO: renamed from: ֫᩸, reason: not valid java name and contains not printable characters */
    public final void m53880() {
        this.f78100 = SystemClock.uptimeMillis();
        HandlerC0308 handlerC0308 = this.f78037;
        handlerC0308.removeMessages(4);
        handlerC0308.sendEmptyMessageAtTime(4, SystemClock.uptimeMillis() + 500);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        m53682();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        m53751();
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        AbstractC13753 abstractC13753;
        super.onWindowVisibilityChanged(i);
        if (i == 0 || (abstractC13753 = this.f78022) == null) {
            return;
        }
        abstractC13753.m33637();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        AbstractC13753 abstractC13753;
        super.onVisibilityChanged(view, i);
        if (i == 0 || (abstractC13753 = this.f78022) == null) {
            return;
        }
        abstractC13753.m33637();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        HandlerC0308 handlerC0308 = this.f78037;
        if (z) {
            handlerC0308.m1896();
            m53880();
            return;
        }
        m53773();
        handlerC0308.m1895();
        this.f78100 = 0L;
        this.f78073 = 0L;
        invalidate();
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!z) {
            m53773();
            m53967();
            m53970();
        } else {
            this.f78100 = SystemClock.uptimeMillis();
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m54078(ExtractedTextRequest extractedTextRequest, ExtractedText extractedText) {
        InterfaceC19106 interfaceC19106;
        int iM37174;
        int i;
        if (extractedTextRequest == null || (interfaceC19106 = this.f78058) == null) {
            return false;
        }
        extractedText.startOffset = 0;
        int length = interfaceC19106.length();
        if (this.f78098) {
            int[] iArrM53971 = m53971();
            iM37174 = iArrM53971[0];
            int i2 = iArrM53971[1];
            if (i2 - iM37174 > 10000) {
                length = iM37174 + 10000;
            } else {
                if (iM37174 >= 1000) {
                    C15508 c15508Mo15350 = interfaceC19106.mo15350();
                    try {
                        iM37174 = c15508Mo15350.m37174(c15508Mo15350.m37179(iM37174 - 999));
                        c15508Mo15350.close();
                    } catch (Throwable th) {
                        try {
                            c15508Mo15350.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } else {
                    iM37174 = 0;
                }
                if (i2 - iM37174 <= 10000) {
                    i = iM37174 + 10000;
                } else {
                    int i3 = iArrM53971[1];
                    int i4 = iArrM53971[0];
                    int i5 = (10000 - (i3 - i4)) / 2;
                    int i6 = i3 + i5;
                    iM37174 = i4 - i5;
                    i = i6;
                }
                if (iM37174 < 0) {
                    iM37174 = 0;
                }
                if (i <= length) {
                    length = i;
                }
            }
            extractedText.partialEndOffset = -1;
            extractedText.partialStartOffset = -1;
            extractedText.startOffset = iM37174;
        } else {
            extractedText.partialEndOffset = -1;
            extractedText.partialStartOffset = -1;
            iM37174 = 0;
        }
        extractedText.text = interfaceC19106.mo15351(iM37174, length);
        extractedText.flags = 0;
        if (MetaKeyKeyListener.getMetaState(this.f78058, 2048) != 0) {
            extractedText.flags |= 2;
        }
        if (mo52320()) {
            extractedText.flags |= 1;
        }
        extractedText.selectionStart = m53968() - extractedText.startOffset;
        extractedText.selectionEnd = m53882() - extractedText.startOffset;
        if (Build.VERSION.SDK_INT >= 28) {
            extractedText.hint = this.f78022.f43673;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m53937(ExtractedTextRequest extractedTextRequest, ExtractedText extractedText) {
        InterfaceC19106 interfaceC19106 = this.f78058;
        try {
            return m54078(extractedTextRequest, extractedText);
        } catch (UncheckedIOException | C24219 e) {
            if (m53943(interfaceC19106, e)) {
                return false;
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m54015() {
        C8511 c8511 = this.f78032;
        if (c8511 != null) {
            int i = c8511.f27818 + 1;
            c8511.f27818 = i;
            if (i == 1) {
                if (c8511.f27822) {
                    c8511.f27819 = 0;
                    c8511.f27821 = this.f78058.length();
                } else {
                    c8511.f27819 = -1;
                    c8511.f27821 = -1;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m54008() {
        int i;
        boolean z;
        C8511 c8511 = this.f78032;
        if (c8511 != null && (i = c8511.f27818) > 0) {
            int i2 = i - 1;
            c8511.f27818 = i2;
            if (i2 == 0 && (((z = c8511.f27822) || c8511.f27820) && c8511 != null && (z || c8511.f27820))) {
                c8511.f27822 = false;
                c8511.f27820 = false;
            }
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C12303 m54063() {
        if (Looper.myLooper() != Looper.getMainLooper() || this.f78058.length() != 0 || this.f78103 || this.f78024 || this.f78134 || this.f78021 != null || this.f78022.mo25237() || this.f78058.mo11034()) {
            throw new IllegalStateException("Initial session state requires an idle empty foreground view");
        }
        return C12303.m30698(0, 0, this.f78043, this.f78098, this.f77978, this.f78116, this.f78066, this.f77981, this.f77995);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53915(C12303 c12303, C16361 c16361, C3354 c3354, C15926 c15926) {
        if (Looper.myLooper() != Looper.getMainLooper() || c15926 == null || c15926 != this.f78112 || !c15926.f51734 || this.f78103 || this.f78024 || m53884() || this.f78071 != null) {
            throw new IllegalStateException("Session layout configuration requires its idle reserved view");
        }
        if (c12303.f39554 > c3354.length() || c12303.f39556 > c3354.length()) {
            throw new IllegalArgumentException("Session search range exceeds text length");
        }
        C12303 c12303M30698 = C12303.m30698(getScrollX(), this.f78104, this.f78043, this.f78098, this.f77978, this.f78116, this.f78066, this.f77981, this.f77995);
        C17418 c17418 = new C17418(c15926, c12303, c16361, c3354, this.f78058, this.f78022, c12303M30698);
        this.f78071 = c17418;
        try {
            m53829(c12303, c16361);
            AbstractC13753 abstractC13753M33599 = AbstractC13753.m33599(this, c17418.f56622, this.f78066, this.f78043);
            c17418.f56620 = abstractC13753M33599;
            m53698(abstractC13753M33599, true);
        } catch (Error | RuntimeException e) {
            m53829(c12303M30698, (C16361) null);
            if (this.f78022 == c17418.f56620) {
                m53698(c17418.f56629, true);
            }
            this.f78071 = null;
            c17418.f56622.close();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m53940(C12303 c12303) {
        C17418 c17418 = this.f78071;
        if (c17418 == null) {
            return false;
        }
        if (c17418.f56623 == c12303) {
            C3354 c3354 = c17418.f56630;
            InterfaceC19106 interfaceC19106 = this.f78058;
            if (c3354 == interfaceC19106 && c17418.f56620 == this.f78022 && c17418.f56632 && c17418.f56627 == interfaceC19106.mo15344() && !c17418.f56619 && c17418.f56621 == this.f78112) {
                c17418.f56619 = true;
                m53697(c12303, c17418.f56631, c17418);
                return true;
            }
        }
        throw new IllegalStateException("Prepared session layout does not belong to this restoration");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m53830(C15926 c15926) {
        AbstractC13753 abstractC13753;
        C17418 c17418 = this.f78071;
        if (c17418 != null) {
            C12303 c12303 = c17418.f56625;
            C13378 c13378 = c17418.f56622;
            if (c17418.f56621 != c15926) {
                return;
            }
            this.f78071 = null;
            try {
                if (this.f78058 == c17418.f56624 && (abstractC13753 = this.f78022) == c17418.f56620 && abstractC13753.f43646 == c13378) {
                    m53829(c12303, (C16361) null);
                    m53698(c17418.f56629, true);
                    m53694(c12303.f39558, c12303.f39566, true);
                }
            } finally {
                c13378.close();
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C7042 m54068(InterfaceC19106 interfaceC19106) {
        int scrollX;
        C17418 c17418 = this.f78071;
        if (c17418 == null) {
            return null;
        }
        C12303 c12303 = c17418.f56623;
        if (c17418.f56630 != interfaceC19106) {
            return null;
        }
        int iM53824 = m53824(c12303);
        if (c17418.f56631 == null && this.f78022.mo25225()) {
            scrollX = c12303.m30714() ? c12303.f39558 : getScrollX();
        } else {
            scrollX = 0;
        }
        return new C7042(Math.max(0, scrollX), Math.max(0, iM53824), m54108(), m53993());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m53939(C3354 c3354, C20334 c20334) {
        C15926 c15926;
        C17418 c17418 = this.f78071;
        if (Looper.myLooper() != Looper.getMainLooper() || c17418 == null || c17418.f56630 != c3354 || c3354 != this.f78058 || c17418.f56620 != this.f78022 || !c17418.f56632 || c17418.f56619 || this.f78103 || this.f78019 || c17418.f56627 != c3354.mo15344() || (c15926 = c17418.f56621) != this.f78112 || !c15926.f51734) {
            return false;
        }
        if ((c20334 != null && c20334.f65239) || c17418.f56623.f39554 >= 0 || !this.f78022.mo25237()) {
            return false;
        }
        C7042 c7042M54068 = m54068((InterfaceC19106) c3354);
        if (c7042M54068.m19365() <= 0 || c7042M54068.m19363() <= 0 || !this.f78022.mo25244(c7042M54068) || !this.f78022.mo25243(Math.max(m53968(), m53882()))) {
            return false;
        }
        AbstractC13753 abstractC13753 = this.f78022;
        c17418.f56628 = new C20402(abstractC13753, abstractC13753.mo25216(), c7042M54068);
        c17418.f56626 = true;
        return true;
    }

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final void m54082() {
        C17418 c17418 = this.f78071;
        if (c17418 != null) {
            c17418.f56626 = false;
        }
    }

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public final Throwable m53961() {
        return this.f78040 == this.f78058 ? this.f78095 : this.f78022.mo25238();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m53985(AbstractC13753 abstractC13753) {
        C17418 c17418 = this.f78071;
        C20402 c20402 = c17418 == null ? null : c17418.f56628;
        if (c20402 == null) {
            return false;
        }
        C3354 c3354 = c17418.f56630;
        InterfaceC19106 interfaceC19106 = this.f78058;
        return c3354 == interfaceC19106 && c17418.f56627 == interfaceC19106.mo15344() && abstractC13753 == this.f78022 && c20402.f65395 == abstractC13753 && !this.f78019 && c20402.f65393 == c20402.f65395.mo25216() && c20402.f65396.m19365() == m54108() && c20402.f65396.m19363() == m53993() && c20402.f65395.mo25244(c20402.f65396);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m54079(C3354 c3354) {
        C17418 c17418 = this.f78071;
        if (Looper.myLooper() != Looper.getMainLooper() || c17418 == null || c17418.f56630 != c3354 || !c17418.f56619 || !m53985(this.f78022) || getScrollX() != c17418.f56628.f65396.m19366() || this.f78104 != c17418.f56628.f65396.m19364()) {
            return false;
        }
        c17418.f56628.f65394 = true;
        postInvalidate();
        return true;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m54046() {
        C17418 c17418 = this.f78071;
        if ((Looper.myLooper() != Looper.getMainLooper() || c17418 == null || !c17418.f56626 || !m53985(this.f78022) || this.f78103 || this.f78024 || this.f78058.mo11034() || c17418.f56621 != this.f78112) && !m54020()) {
            throw new IllegalStateException("Session view restoration requires an idle foreground owner");
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private int m53824(C12303 c12303) {
        if (!c12303.m30714()) {
            return this.f78104;
        }
        float f = this.f78052;
        if (f > 0.0f) {
            return (int) Math.min(2147483647L, Math.round((((double) c12303.f39566) / ((double) f)) * ((double) this.f78066.m16189())));
        }
        return c12303.f39566;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m53829(C12303 c12303, C16361 c16361) {
        C12129 c12129 = c12303.f39557;
        C14540 c14540 = this.f78066;
        if (c12129 != null) {
            c12129.m30320(c14540);
        }
        C12129 c121210 = c12303.f39557;
        float fM16189 = 0.0f;
        if (c121210 != null) {
            float f = c121210.f38997;
            fM16189 = f > 0.0f ? f : c14540.m16189();
        }
        this.f78052 = fM16189;
        if (c12303.m30714()) {
            this.f78043 = c12303.f39562;
            this.f78098 = c12303.f39561;
            this.f77978 = c12303.f39555;
            this.f78116 = c12303.f39560;
        }
        if (c16361 != null) {
            c14540.mo16197(c16361.f53127);
            int i = c16361.f53133;
            if (i != c16361.f53114 || c16361.f53122 != c16361.f53129 || (i == 1 && !C17359.equals(c16361.f53131, c16361.f53118))) {
                c14540.m35083(c16361.f53122 * c14540.f18979, c16361.f53133);
            }
            boolean z = c16361.f53115;
            if (z != c16361.f53130) {
                c14540.f45755 = z;
                if (z) {
                    c14540.f45783 = c16361.f53128;
                }
            }
            c14540.f45769 = c16361.f53112;
            c14540.m16207(c16361.f53121);
            c14540.m16223(c16361.f53126);
            c14540.f45763 = c16361.f53134;
            c14540.m16198(c16361.f53120);
            this.f78043 = c16361.f53132;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53914(C12303 c12303, C16361 c16361) {
        m53697(c12303, c16361, (C17418) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m53697(C12303 c12303, C16361 c16361, C17418 c17418) {
        int scrollX;
        m54046();
        if (c12303.f39554 > this.f78058.length() || c12303.f39556 > this.f78058.length()) {
            throw new IllegalArgumentException("Session search range exceeds text length");
        }
        m54111();
        this.f78134 = true;
        this.f78033.m4824();
        if (c17418 == null) {
            try {
                m53829(c12303, c16361);
            } catch (Throwable th) {
                this.f78134 = false;
                m54010();
                this.f78018.m9609(this.f78058);
                this.f78033.m4837(this.f78058);
                m53733();
                throw th;
            }
        }
        m53738();
        if (c12303.m30712()) {
            C14540 c14540 = this.f78066;
            c14540.f45785 = c12303.f39554;
            c14540.f45754 = c12303.f39556;
        }
        c12303.m30711(this.f77981, this.f77995);
        this.f78119.forceFinished(true);
        this.f78037.removeMessages(1);
        this.f78033.m4822();
        this.f78029.m40506();
        if (c17418 == null) {
            m53698(AbstractC13753.m33599(this, this.f78058, this.f78066, this.f78043), true);
        }
        this.f78002 = -1.0f;
        m53845();
        this.f78055.incrementAndGet();
        if (c16361 == null) {
            scrollX = c12303.m30714() ? c12303.f39558 : getScrollX();
        } else {
            scrollX = 0;
        }
        int iM53824 = m53824(c12303);
        AbstractC13753 abstractC13753 = this.f78022;
        InterfaceC19106 interfaceC19106 = this.f78058;
        this.f78021 = new C23386(abstractC13753, interfaceC19106, interfaceC19106.mo15344(), scrollX, iM53824);
        m53694(m53948(scrollX), m53873(iM53824), true);
        m53774(this.f78022);
        if (this.f78066.f45755 || this.f78086 != null) {
            m53781();
        } else if (c16361 != null && c16361.f53115 != c16361.f53130) {
            m53903((String) null, false);
        }
        m54035();
        this.f78134 = false;
        m54010();
        this.f78018.m9609(this.f78058);
        this.f78033.m4837(this.f78058);
        m53733();
        if (this.f78066.f45755 && this.f78033.m4840()) {
            this.f78029.m40504(this.f78033.m4811());
        } else {
            this.f78029.m40504(C17243.f56170);
        }
        m54030();
        requestLayout();
        invalidate();
    }

    /* JADX INFO: renamed from: ܳۤ, reason: not valid java name and contains not printable characters */
    public final boolean m54020() {
        if (Looper.myLooper() != Looper.getMainLooper() || !(this.f78058 instanceof C3354) || m53872() || this.f78103 || this.f78024 || this.f78134 || this.f78021 != null) {
            return false;
        }
        C17418 c17418 = this.f78071;
        return ((c17418 != null && !c17418.f56632) || this.f78022.mo25237() || this.f78058.mo11034()) ? false : true;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean m53886() {
        if (Looper.myLooper() != Looper.getMainLooper() || !(this.f78058 instanceof C3354) || this.f78103 || this.f78024 || this.f78134) {
            return false;
        }
        C17418 c17418 = this.f78071;
        return (c17418 == null || c17418.f56632) && !this.f78058.mo11034();
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C20508 m53867() {
        if (m53886()) {
            return new C20508(getScrollX(), this.f78104, this.f78043, this.f78098, this.f77978, this.f78116, this.f78066, this.f77981, this.f77995);
        }
        throw new IllegalStateException("Session view state requires a stable foreground owner");
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C12303 m53964() {
        if (m53886()) {
            return C12303.m30698(getScrollX(), this.f78104, this.f78043, this.f78098, this.f77978, this.f78116, this.f78066, this.f77981, this.f77995);
        }
        throw new IllegalStateException("Session view state requires a stable foreground owner");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53907(RunnableC2393 runnableC2393) {
        this.f78080.add(runnableC2393);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m54076(RunnableC2393 runnableC2393) {
        this.f78080.remove(runnableC2393);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙᩴ, reason: not valid java name and contains not printable characters */
    public void m53733() {
        if (!this.f78080.isEmpty()) {
            C21576.m49068(new RunnableC3863(this));
        }
        synchronized (this.f78115) {
            final C3248 c3248 = this.f78093;
            if (c3248 != null && !c3248.f10578) {
                c3248.f10578 = true;
                C21576.m49068(new Runnable() { // from class: l.᩵۠᩸
                    @Override // java.lang.Runnable
                    public final void run() {
                        C24132.m53712(this.f65489, c3248);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m53789(C24132 c24132) {
        Iterator it = c24132.f78080.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final FutureC23690 m53979(C3354 c3354) {
        C3248 c3248;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Session view readiness requires the foreground thread");
        }
        synchronized (this.f78115) {
            if (this.f78058 != c3354) {
                throw new IllegalStateException("Session readiness owner is not installed in the view");
            }
            if (c3354.mo11034()) {
                throw new IllegalStateException("Cannot await view readiness during text replacement");
            }
            c3248 = this.f78093;
            if (c3248 == null) {
                c3248 = new C3248(c3354, this.f78022, c3354.mo15344());
                this.f78093 = c3248;
            }
        }
        m53733();
        return c3248.f10581.m52949((InterfaceC25138) new C24921());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m53712(C24132 c24132, C3248 c3248) {
        synchronized (c24132.f78115) {
            if (c24132.f78093 != c3248) {
                return;
            }
            c3248.f10578 = false;
            InterfaceC19106 interfaceC19106 = c24132.f78058;
            boolean z = (interfaceC19106 == c3248.f10582 && c24132.f78022 == c3248.f10579 && interfaceC19106.mo15344() == c3248.f10580) ? false : true;
            if (z || !(c24132.m53872() || c24132.f78103 || c24132.f78024 || c24132.f78134 || c24132.f78076 || c24132.f78021 != null || c24132.f78022.mo25237() || c24132.f78058.mo11034())) {
                c24132.f78093 = null;
                Throwable thM53961 = c24132.m53961();
                if (!z && thM53961 != null) {
                    c3248.f10581.m52937(thM53961);
                } else if (z) {
                    c3248.f10581.m52937((Throwable) new CancellationException("Session view preparation was superseded"));
                } else {
                    c3248.f10581.m52935((Object) null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m53848(final String str) {
        final C3248 c3248;
        synchronized (this.f78115) {
            c3248 = this.f78093;
            this.f78093 = null;
        }
        if (c3248 != null) {
            C21576.m49068(new Runnable() { // from class: l.ܽ۠᩸
                @Override // java.lang.Runnable
                public final void run() {
                    TextKeyListener textKeyListener = C24132.f77977;
                    c3248.f10581.m52937((Throwable) new CancellationException(str));
                }
            });
        }
    }

    /* JADX INFO: renamed from: ᩵᩸, reason: not valid java name and contains not printable characters */
    private void m53819() {
        if (this.f78021 == null || this.f78134) {
            return;
        }
        this.f78021 = null;
        this.f78055.incrementAndGet();
        m53733();
    }

    /* JADX INFO: renamed from: ܶۤ, reason: not valid java name and contains not printable characters */
    public final int m54027() {
        return this.f78055.get();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m53941(AbstractC13753 abstractC13753) {
        C23386 c23386 = this.f78021;
        return c23386 != null && c23386.f75712 == abstractC13753;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m54090(AbstractC13753 abstractC13753) {
        C24878 c24878 = this.f78031;
        if (c24878 != null && c24878.f80507 == abstractC13753) {
            C21576.m49068(new RunnableC1014(1, this, abstractC13753));
        }
        if (this.f78021 != null) {
            C21576.m49068(new RunnableC7592(0, this, abstractC13753));
        }
        m53733();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public void m53774(AbstractC13753 abstractC13753) {
        C23386 c23386 = this.f78021;
        if (c23386 == null || c23386.f75712 != abstractC13753) {
            return;
        }
        if (this.f78022 != abstractC13753 || this.f78058 != c23386.f75715 || this.f78058.mo15344() != c23386.f75713) {
            this.f78021 = null;
            m53733();
        } else {
            if (abstractC13753.mo25237()) {
                return;
            }
            this.f78021 = null;
            this.f78055.incrementAndGet();
            if (abstractC13753 instanceof C22572) {
                ((C22572) abstractC13753).m50894(c23386.f75716, m54108());
            }
            m53694(m53948(c23386.f75716), m53873(c23386.f75714), true);
            m53733();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53910(C6178 c6178, boolean z) {
        if (this.f78058 instanceof C3354) {
            throw new IllegalStateException("Session text requires the session recovery protocol");
        }
        c6178.writeInt(-249340294);
        c6178.m17797();
        c6178.writeByte(0);
        c6178.m17797();
        this.f78058.mo11037(c6178);
        c6178.writeInt(this.f78058.mo11047());
        c6178.m17780();
        c6178.writeByte(1);
        c6178.m17797();
        c6178.writeInt(this.f78082);
        c6178.writeInt(this.f78088);
        c6178.writeInt(this.f78049);
        c6178.m17780();
        c6178.writeByte(2);
        c6178.m17797();
        c6178.writeInt(m53968());
        c6178.writeInt(m53882());
        c6178.writeInt(getScrollX());
        c6178.writeInt(this.f78104);
        c6178.writeByte((byte) this.f78043);
        c6178.m17789(this.f78098);
        c6178.m17789(this.f77978);
        c6178.m17789(this.f78116);
        c6178.m17780();
        c6178.writeByte(10);
        c6178.m17797();
        c6178.m17803(this.f78058.mo11046());
        c6178.m17803(this.f78058.mo11043().m41115());
        c6178.m17780();
        c6178.writeByte(11);
        c6178.m17797();
        this.f77981.m41703(c6178);
        this.f77995.m41703(c6178);
        c6178.m17780();
        c6178.writeByte(4);
        c6178.m17797();
        this.f78066.m35085(c6178);
        c6178.m17780();
        c6178.writeByte(7);
        c6178.m17797();
        c6178.writeInt(this.f78066.f45785);
        c6178.writeInt(this.f78066.f45754);
        c6178.m17780();
        c6178.writeByte(5);
        c6178.m17797();
        this.f78022.mo25224(c6178);
        c6178.m17780();
        if (z && this.f78086 == null) {
            c6178.writeByte(9);
            c6178.m17797();
            this.f78033.m4802(c6178);
            c6178.m17780();
        }
        c6178.writeByte(-1);
        c6178.m17780();
        c6178.writeInt(-249340294);
    }

    /* JADX WARN: Code duplicated, block: B:158:0x02b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x0015 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m53832(C20348 c20348) {
        int iM7787;
        InterfaceC19106 c13378;
        InterfaceC19106 interfaceC19106;
        C24238 c24238M54221;
        AbstractC13753 c9670;
        if (!c20348.m46746(-249340294)) {
            throw new RuntimeException("Bad instance state magic");
        }
        int iM46744 = c20348.m46744() + c20348.readInt();
        boolean z = false;
        boolean z2 = false;
        while (true) {
            byte b = c20348.readByte();
            C17853 c17853 = this.f77995;
            C17853 c17854 = this.f77981;
            C1314 c1314 = this.f78033;
            C14540 c14540 = this.f78066;
            if (b != -1) {
                int iM46745 = c20348.m46744() + c20348.readInt();
                switch (b) {
                    case 0:
                        int iMo11048 = this.f78058.mo11048();
                        int iM46759 = c20348.m46759();
                        boolean z3 = iM46759 == -500019884 || iM46759 == -483177132;
                        if (z3) {
                            C13378 c13378M32983 = C13378.m32983(c20348, iM46745 - 4);
                            iM7787 = c13378M32983.hashCode();
                            interfaceC19106 = c13378M32983;
                        } else {
                            if (c20348.m46759() == -500018348) {
                                c24238M54221 = C24238.m54221(c20348, this.f77984);
                                iM7787 = c24238M54221.hashCode();
                                if (this.f78078) {
                                    try {
                                        try {
                                            interfaceC19106 = c24238M54221;
                                            c13378 = C13378.m32981(c24238M54221);
                                            c24238M54221.close();
                                        } catch (IOException e) {
                                            throw new UncheckedIOException(e);
                                        }
                                    } catch (Throwable th) {
                                        c24238M54221.close();
                                        throw th;
                                    }
                                }
                            } else {
                                C2306 c2306M22327 = C8272.m22327(c20348, this.f77984);
                                iM7787 = c2306M22327.m7787();
                                c13378 = new C13378(c2306M22327.m7788());
                            }
                            interfaceC19106 = c13378;
                        }
                        interfaceC19106 = c24238M54221;
                        int i = c20348.readInt();
                        if (z3 && i != iM7787) {
                            interfaceC19106.mo11039(false);
                            throw new IllegalArgumentException("Memory text state checksum mismatch");
                        }
                        InterfaceC19106 interfaceC19107 = this.f78058;
                        m53808(interfaceC19106);
                        this.f78018.m9612(this.f78058);
                        c1314.m4822();
                        this.f78029.m40506();
                        interfaceC19107.mo11039(false);
                        this.f78058.mo11036(iMo11048);
                        InterfaceC19106 interfaceC19108 = this.f78058;
                        interfaceC19108.setSpan(this.f78042, 0, interfaceC19108.length(), 8388626);
                        z = i != iM7787;
                        if (c20348.m46744() != iM46745) {
                            c20348.seek(iM46745);
                        }
                        break;
                        break;
                    case 1:
                        this.f78082 = c20348.readInt();
                        this.f78088 = c20348.readInt();
                        int i2 = c20348.readInt();
                        this.f78049 = i2;
                        this.f78058.mo11051(this.f78088 != i2);
                        if (c20348.m46744() != iM46745) {
                            c20348.seek(iM46745);
                        }
                        break;
                    case 2:
                        this.f78058.setSelection(c20348.readInt(), c20348.readInt());
                        this.f78119.forceFinished(true);
                        HandlerC0308 handlerC0308 = this.f78037;
                        handlerC0308.removeMessages(1);
                        final int i3 = c20348.readInt();
                        final int i4 = c20348.readInt();
                        m53694(i3, i4, true);
                        handlerC0308.post(new Runnable() { // from class: l.ܺ۠᩸
                            @Override // java.lang.Runnable
                            public final void run() {
                                C24132.m53705(this.f53992, i3, i4);
                            }
                        });
                        this.f78043 = c20348.readByte() & 255;
                        this.f78098 = c20348.m46753();
                        this.f77978 = c20348.m46753();
                        this.f78116 = c20348.m46753();
                        this.f78002 = -1.0f;
                        m53845();
                        if (c20348.m46744() != iM46745) {
                            c20348.seek(iM46745);
                        }
                        break;
                    case 3:
                        m53833(c20348, iM46745);
                        m53833(c20348, iM46745);
                        c17854.m41705(c20348);
                        c17853.m41705(c20348);
                        if (c20348.m46744() != iM46745) {
                            c20348.seek(iM46745);
                        }
                        break;
                    case 4:
                        c14540.getClass();
                        c14540.f45796 = c20348.m46756();
                        c14540.f45769 = c20348.m46753();
                        c14540.m35083(c20348.m46747(), c20348.readByte());
                        c14540.m16198(c20348.m46749());
                        c14540.m16201(c20348.m46753());
                        c14540.m16221(c20348.m46753());
                        c14540.f45761 = c20348.m46753();
                        c14540.f45805 = c20348.m46753();
                        boolean zM46753 = c20348.m46753();
                        c14540.f45755 = zM46753;
                        if (zM46753) {
                            c14540.f45783 = c20348.m46756();
                        }
                        int i5 = c20348.available() > 4 ? c20348.readInt() : 0;
                        if (i5 < 591749667) {
                            c14540.mo16197(1.0f);
                        } else {
                            c14540.m16207(c20348.m46753());
                            if (i5 >= 591749669) {
                                c14540.m16223(c20348.m46753());
                            }
                            if (i5 >= 591749668) {
                                c14540.f45763 = c20348.m46753();
                            }
                            Integer numValueOf = null;
                            Integer numValueOf2 = (i5 < 591749670 || !c20348.m46753()) ? null : Integer.valueOf(c20348.readInt());
                            if (i5 >= 591749671 && c20348.m46753()) {
                                numValueOf = Integer.valueOf(c20348.readInt());
                            }
                            c14540.mo16197(i5 >= 591749672 ? c20348.m46747() : 1.0f);
                            if (i5 >= 591749672) {
                                c20348.m46747();
                            }
                            c14540.f45815 = numValueOf2;
                            c14540.m35088();
                            c14540.m35084(numValueOf);
                        }
                        if (c20348.m46744() != iM46745) {
                            c20348.seek(iM46745);
                        }
                        break;
                    case 5:
                        if (c20348.readByte() == 0) {
                            c9670 = new C22572(this, this.f78058, c14540, c20348);
                        } else {
                            c9670 = new C9670(this, this.f78058, c14540, c20348);
                        }
                        m53698(c9670, true);
                        if (c20348.m46744() != iM46745) {
                            c20348.seek(iM46745);
                        }
                        break;
                    case 6:
                    case 8:
                        c20348.seek(iM46745);
                        if (c14540.f45755) {
                            m53781();
                            z2 = true;
                            if (c20348.m46744() != iM46745) {
                                c20348.seek(iM46745);
                            }
                        } else if (c20348.m46744() != iM46745) {
                            c20348.seek(iM46745);
                        }
                        break;
                    case 7:
                        c14540.f45785 = c20348.readInt();
                        c14540.f45754 = c20348.readInt();
                        m54035();
                        if (c20348.m46744() != iM46745) {
                            c20348.seek(iM46745);
                        }
                        break;
                    case 9:
                        if (z || this.f78086 != null) {
                            c20348.seek(iM46745);
                        } else if (!c1314.m4809(c20348, iM46745) && c14540.f45755) {
                            m53781();
                            z2 = true;
                        }
                        if (c20348.m46744() != iM46745) {
                            c20348.seek(iM46745);
                        }
                        break;
                    case 10:
                        this.f78058.mo11052(c20348.readLong());
                        if (c20348.readLong() != this.f78058.mo11043().m41115()) {
                            this.f78058.mo11051(true);
                        }
                        if (c20348.m46744() != iM46745) {
                            c20348.seek(iM46745);
                        }
                        break;
                    case 11:
                        c17854.m41705(c20348);
                        c17853.m41705(c20348);
                        if (c20348.m46744() != iM46745) {
                            c20348.seek(iM46745);
                        }
                        break;
                    default:
                        System.out.println("Unknown instance state record type: " + ((int) b));
                        c20348.seek((long) iM46745);
                        break;
                }
            } else {
                if (z) {
                    System.out.println("Text's fastHashCode changed, reset all.");
                    c17854.m41702();
                    c17853.m41702();
                    m53883();
                    if (!z2) {
                        m53781();
                    }
                } else {
                    this.f78022.m33647();
                    this.f78022.mo25236(m54108());
                    if (!z2 && ((c14540.f45755 || this.f78086 != null) && (this.f78086 != null || !c1314.m4816() || !c1314.m4806((CharSequence) this.f78058)))) {
                        m53781();
                    }
                }
                if (c20348.m46744() != iM46744) {
                    c20348.seek(iM46744);
                }
                if (c20348.readInt() != -249340294) {
                    throw new RuntimeException();
                }
                postInvalidate();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m53833(C20348 c20348, int i) {
        int i2 = c20348.readInt();
        if (i2 < 0 || i2 > (i - c20348.m46744()) / 12) {
            throw new IllegalArgumentException("Invalid legacy undo count");
        }
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = c20348.readInt();
            if (i4 < 0 || i4 > (i - c20348.m46744()) / 28) {
                throw new IllegalArgumentException("Invalid legacy undo changes");
            }
            for (int i5 = 0; i5 < i4; i5++) {
                if (i - c20348.m46744() < 28) {
                    throw new IllegalArgumentException("Truncated legacy undo change");
                }
                c20348.skipBytes(20);
                for (int i6 = 0; i6 < 2; i6++) {
                    if (i - c20348.m46744() < 4) {
                        throw new IllegalArgumentException("Truncated legacy undo text");
                    }
                    int i7 = c20348.readInt();
                    if (i7 < 0 || i7 > i - c20348.m46744()) {
                        throw new IllegalArgumentException("Invalid legacy undo text length");
                    }
                    c20348.skipBytes(i7);
                }
            }
            if (i - c20348.m46744() < 8) {
                throw new IllegalArgumentException("Truncated legacy undo time");
            }
            c20348.skipBytes(8);
        }
    }

    static {
        ApplicationC23172.m52091(170);
        f77977 = new TextKeyListener(TextKeyListener.Capitalize.NONE, false);
        f77976 = C6907.m19160(120.0f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53905(InterfaceC1076 interfaceC1076) {
        this.f77997.add(interfaceC1076);
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m53970() {
        AbstractC17787 abstractC17787 = this.f78113;
        if (abstractC17787 != null) {
            abstractC17787.m41621();
        }
        ArrayList arrayList = this.f77997;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC1076) arrayList.get(i)).mo4037();
        }
        m53881();
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static int m53860(int i) {
        float f = i;
        float f2 = f / f77976;
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        return (int) (f * f2 * 0.5f);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m54073(int i, int i2) {
        m53864();
        m53819();
        this.f78037.removeMessages(1);
        this.f78119.forceFinished(true);
        m53800(i, i2);
    }

    /* JADX INFO: renamed from: ܽ᩷, reason: not valid java name and contains not printable characters */
    public final int m54040() {
        return this.f78022.f43643.get(this.f78022.m33615(this.f78104 + 1)).f45295;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֨᩸, reason: not valid java name and contains not printable characters */
    public void m53677() {
        this.f78028 = SystemClock.uptimeMillis();
        HandlerC0308 handlerC0308 = this.f78037;
        handlerC0308.removeMessages(3);
        handlerC0308.sendEmptyMessageDelayed(3, 1500L);
        postInvalidate();
    }

    /* JADX INFO: renamed from: ܳ᩸, reason: not valid java name and contains not printable characters */
    public final void m54022() {
        if (this.f78022.mo25225()) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            int i = (int) (jUptimeMillis - this.f78028);
            this.f78054 = false;
            if (i >= 0 && i <= 1500) {
                this.f78037.removeMessages(3);
                this.f78028 = jUptimeMillis - 1500;
                postInvalidate();
            }
            m53757();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۢ᩸, reason: not valid java name and contains not printable characters */
    public void m53757() {
        if (this.f78022.mo25225()) {
            this.f77982 = SystemClock.uptimeMillis();
            HandlerC0308 handlerC0308 = this.f78037;
            handlerC0308.removeMessages(5);
            handlerC0308.sendEmptyMessageDelayed(5, 1500L);
            postInvalidate();
        }
    }

    /* JADX INFO: renamed from: ۚ᩸, reason: not valid java name and contains not printable characters */
    public final void m53955() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        int i = (int) (jUptimeMillis - this.f77982);
        this.f78105 = false;
        if (i >= 0 && i <= 1500) {
            this.f78037.removeMessages(5);
            this.f77982 = jUptimeMillis - 1500;
            postInvalidate();
        }
        m53677();
    }

    /* JADX INFO: renamed from: ᩵᩷, reason: not valid java name and contains not printable characters */
    public final void m54062() {
        this.f77982 = 0L;
        this.f78028 = 0L;
        m53773();
        postInvalidate();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m53891(int i) {
        C14540 c14540 = this.f78066;
        if (c14540.f45755) {
            C1314 c1314 = this.f78033;
            if (c1314.m4816()) {
                return c1314.m4835(i, c14540.m16212());
            }
        }
        return c14540.m16212();
    }

    /* JADX INFO: renamed from: ۙ᩷, reason: not valid java name and contains not printable characters */
    public final String m53946() {
        return this.f78033.m4810();
    }

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public final List m54095() {
        int[] iArrM53971 = m53971();
        int iM43913 = C18910.m43913(iArrM53971[0], this.f78058);
        int iM43895 = C18910.m43895(iArrM53971[1], this.f78058);
        if (iM43895 < this.f78058.length()) {
            iM43895++;
        }
        return this.f78033.m4829(iM43913, iM43895);
    }

    /* JADX INFO: renamed from: ᩷᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC0855 m54084() {
        return this.f78033.m4836();
    }

    /* JADX INFO: renamed from: ۤ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC8313 m53989() {
        return this.f78033.m4825();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m54105() {
        mo52299(m53968(), m53882());
        InterfaceC12943 interfaceC12943 = this.f77988;
        if (interfaceC12943 != null) {
            interfaceC12943.mo15546(m53957(), m53999());
            this.f77988.mo15545(this.f78058.isChanged());
        }
        m54030();
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m54030() {
        if (this.f78040 == this.f78058 || this.f78029 == null) {
            return;
        }
        int iM53968 = m53968();
        int iM53882 = m53882();
        long jM4828 = this.f78033.m4828();
        if (jM4828 == Long.MIN_VALUE) {
            this.f78029.m40510(iM53968, iM53882);
        } else if (jM4828 == -1) {
            this.f78029.m40500(iM53968, iM53882);
        } else {
            this.f78029.m40501(iM53968, iM53882, (int) (jM4828 >>> 32), (int) jM4828);
        }
    }

    /* JADX INFO: renamed from: ۘۤ, reason: not valid java name and contains not printable characters */
    public final void m53889() {
        C17243 c17243 = this.f78029;
        if (c17243 != null) {
            c17243.m40500(m53968(), m53882());
        }
    }

    /* JADX INFO: renamed from: ᩺᩷, reason: not valid java name and contains not printable characters */
    public final void m54104() {
        C17243 c17243 = this.f78029;
        if (c17243 != null) {
            c17243.m40506();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53925(C18416 c18416) {
        this.f78007 = c18416;
    }

    /* JADX INFO: renamed from: ֫᩷, reason: not valid java name and contains not printable characters */
    public final String m53879() {
        C18416 c18416 = this.f78007;
        if (c18416 == null) {
            return m53870();
        }
        return C25350.m56630(c18416.f59988);
    }

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final String m53870() {
        InterfaceC19106 interfaceC19106 = this.f78058;
        int selectionStart = Selection.getSelectionStart(interfaceC19106);
        int selectionEnd = Selection.getSelectionEnd(interfaceC19106);
        if (selectionStart == selectionEnd || selectionStart == -1 || selectionEnd == -1) {
            return null;
        }
        if (selectionStart < selectionEnd) {
            return interfaceC19106.subSequence(selectionStart, selectionEnd).toString();
        }
        return interfaceC19106.subSequence(selectionEnd, selectionStart).toString();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m53881() {
        C20003 c20003 = this.f78109;
        if (c20003 != null) {
            c20003.m46003();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53927(InterfaceC19459 interfaceC19459) {
        this.f77984 = interfaceC19459;
        this.f78058.mo11038(interfaceC19459);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m53874() {
        int iM40498;
        int iM53968 = m53968();
        if (iM53968 != m53882() || (iM40498 = this.f78029.m40498(iM53968)) == -1) {
            return;
        }
        mo52339(iM40498);
        this.f78100 = SystemClock.uptimeMillis();
        m53935(iM40498, false);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m53991() {
        int[] iArrM40511;
        int iM53968 = m53968();
        if (iM53968 != m53882() || (iArrM40511 = this.f78029.m40511(iM53968)) == null) {
            return;
        }
        mo52316(iArrM40511[0], iArrM40511[1] + 1);
        m54007();
        m54077(false);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m54070() {
        Runnable runnable = this.f78108;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53901(Runnable runnable) {
        this.f78108 = runnable;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53928(InterfaceC20598 interfaceC20598) {
        this.f77987 = interfaceC20598;
    }

    /* JADX INFO: renamed from: ۗ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m53887() {
        return this.f77987 != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53911(C9213 c9213) {
        this.f78096 = c9213;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m54035() {
        C9213 c9213 = this.f78096;
        if (c9213 != null) {
            C14540 c14540 = this.f78066;
            int i = c14540.f45785;
            int i2 = c14540.f45754;
            C23582.m52787(c9213.f30030, i != i2 && i >= 0 && i2 >= 0);
        }
    }

    /* JADX INFO: renamed from: ֨ۤ, reason: not valid java name and contains not printable characters */
    public final void m53871() {
        C14540 c14540 = this.f78066;
        int i = c14540.f45785;
        int i2 = c14540.f45754;
        if (i == i2 || i < 0 || i2 < 0) {
            return;
        }
        c14540.f45754 = -1;
        c14540.f45785 = -1;
        m54035();
        invalidate();
    }

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public final C20837 m53974() {
        C14540 c14540 = this.f78066;
        int i = c14540.f45785;
        int i2 = c14540.f45754;
        if (i == i2 || i < 0 || i2 < 0) {
            return null;
        }
        C20837 c20837 = new C20837();
        c20837.f66719 = i;
        c20837.f66718 = i2;
        return c20837;
    }

    /* JADX INFO: renamed from: ᩶᩷, reason: not valid java name and contains not printable characters */
    public final boolean m54066() {
        EdgeEffect edgeEffect = this.f78065;
        if (edgeEffect != null && !edgeEffect.isFinished()) {
            return false;
        }
        EdgeEffect edgeEffect2 = this.f78045;
        if (edgeEffect2 != null && !edgeEffect2.isFinished()) {
            return false;
        }
        EdgeEffect edgeEffect3 = this.f77989;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            return false;
        }
        EdgeEffect edgeEffect4 = this.f78027;
        return edgeEffect4 == null || edgeEffect4.isFinished();
    }

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final float m54013() {
        return this.f78066.m16189();
    }

    /* JADX INFO: renamed from: ᩹᩸, reason: not valid java name and contains not printable characters */
    public final void m54101() {
        C18207 c18207 = this.f78120;
        if (c18207 != null) {
            c18207.m42355();
        }
        this.f78120 = new C18207(this);
        if (this.f78009 == null) {
            this.f78009 = new ViewTreeObserverOnGlobalLayoutListenerC11451(this);
            if (isAttachedToWindow()) {
                ViewTreeObserver viewTreeObserver = getViewTreeObserver();
                viewTreeObserver.addOnGlobalLayoutListener(this.f78009);
                viewTreeObserver.addOnScrollChangedListener(this.f78009);
            }
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ᩻᩷, reason: not valid java name and contains not printable characters */
    public final C18207 m54110() {
        return this.f78120;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m54031(boolean z) {
        this.f78130 = z;
        if (z) {
            return;
        }
        m53785();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m54051(int i, boolean z) {
        this.f78069 = z;
        if (z) {
            this.f78091 = i;
        } else {
            m53785();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m54072(float f, float f2) {
        int i;
        this.f78125 = f;
        this.f77999 = f2;
        int iM53968 = m53968();
        int iM53882 = m53882();
        if (iM53968 <= iM53882) {
            iM53882 = iM53968;
            iM53968 = iM53882;
        }
        int iM33616 = this.f78022.m33616(getScrollX() + f, this.f78104 + f2);
        if (this.f78003 != iM33616 && (i = this.f78091) != iM33616) {
            this.f78003 = -1;
            if (i > iM33616) {
                if (iM53882 != iM33616) {
                    this.f78058.setSelection(iM33616, i);
                    invalidate();
                }
            } else if (iM53968 != iM33616) {
                this.f78058.setSelection(i, iM33616);
                invalidate();
            }
        }
        if (mo40459()) {
            m53826((int) (f + getPaddingLeft()), (int) (f2 + getPaddingTop()), this.f78066.f45790);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m54087(float f, float f2) {
        this.f78125 = f;
        this.f77999 = f2;
        int iM33616 = this.f78022.m33616(getScrollX() + f, this.f78104 + f2);
        if (iM33616 != Selection.getSelectionStart(this.f78058)) {
            this.f78058.setSelection(iM33616);
            invalidate();
            m53687(iM33616);
        }
        this.f78073 = SystemClock.uptimeMillis();
        m53880();
        int iM16189 = (int) this.f78066.m16189();
        boolean z = f2 < ((float) (-iM16189)) || f2 > ((float) (m53993() + iM16189));
        if (mo40459()) {
            if (!z) {
                m53826((int) (f + getPaddingLeft()), (int) (f2 + getPaddingTop()), 0);
            } else {
                m53785();
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m53982(float f, float f2) {
        this.f78125 = f;
        this.f77999 = f2;
        int iM53968 = m53968();
        int iM53882 = m53882();
        if (iM53968 <= iM53882) {
            iM53882 = iM53968;
            iM53968 = iM53882;
        }
        int iM33616 = this.f78022.m33616(getScrollX() + f, this.f78104 + f2);
        int i = this.f78091;
        boolean z = true;
        if (i != iM33616) {
            if (i > iM33616) {
                if (iM53882 != iM33616) {
                    this.f78058.setSelection(iM33616, i);
                    m53687(iM33616);
                    if (!this.f78110) {
                        this.f78110 = true;
                    }
                }
            } else if (iM53968 != iM33616) {
                this.f78058.setSelection(i, iM33616);
                m53687(iM33616);
                if (this.f78110) {
                    this.f78110 = false;
                }
            }
            this.f78073 = SystemClock.uptimeMillis();
            invalidate();
        }
        int iM16189 = (int) this.f78066.m16189();
        if (f2 >= (-iM16189) && f2 <= m53993() + iM16189) {
            z = false;
        }
        if (mo40459()) {
            if (!z) {
                m53826((int) (f + getPaddingLeft()), (int) (f2 + getPaddingTop()), 0);
            } else {
                m53785();
            }
        }
    }

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final int m54108() {
        return (getWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final int m53993() {
        return (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    /* JADX INFO: renamed from: ۨ᩷, reason: not valid java name and contains not printable characters */
    public final void m54001() {
        this.f78047.hideSoftInputFromWindow(getWindowToken(), 0);
    }

    /* JADX INFO: renamed from: ۜۤ, reason: not valid java name and contains not printable characters */
    public final void m53962() {
        this.f78047.restartInput(this);
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final void m53967() {
        C18207 c18207 = this.f78120;
        if (c18207 != null) {
            this.f78073 = 0L;
            c18207.m42355();
        }
    }

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public final String m53958() {
        return this.f78022.f43673;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        return this.f78022 == null ? getHeight() : Math.max(getHeight(), (int) this.f78022.m33639());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setScrollY(this.f78104);
        accessibilityEvent.setMaxScrollY(this.f78022 == null ? 0 : m53965());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEditable(true);
    }

    @Override // android.view.View
    public final CharSequence getAccessibilityClassName() {
        return EditText.class.getName();
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (Build.VERSION.SDK_INT < 34 || !isAccessibilityDataSensitive() || accessibilityEvent.isAccessibilityDataSensitive()) {
            CharSequence charSequenceSubSequence = this.f78058;
            if (TextUtils.isEmpty(charSequenceSubSequence)) {
                charSequenceSubSequence = this.f78022.f43673;
            }
            if (charSequenceSubSequence != null) {
                int i = 10000;
                if (charSequenceSubSequence.length() > 10000) {
                    if (Character.isHighSurrogate(charSequenceSubSequence.charAt(9999)) && Character.isLowSurrogate(charSequenceSubSequence.charAt(10000))) {
                        i = 9999;
                    }
                    charSequenceSubSequence = charSequenceSubSequence.subSequence(0, i);
                }
            }
            if (TextUtils.isEmpty(charSequenceSubSequence)) {
                return;
            }
            accessibilityEvent.getText().add(charSequenceSubSequence);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        int action = dragEvent.getAction();
        if (action == 4 || action == 6 || (!m54083() && m53748())) {
            switch (action) {
                case 1:
                    ClipDescription clipDescription = dragEvent.getClipDescription();
                    if (clipDescription != null && (clipDescription.hasMimeType("text/plain") || clipDescription.hasMimeType("text/html"))) {
                        return true;
                    }
                    break;
                case 2:
                    float x = dragEvent.getX();
                    float y = dragEvent.getY();
                    int iM33616 = this.f78022.m33616(getScrollX() + x, this.f78104 + y);
                    if (iM33616 != m53968() || iM33616 != m53882()) {
                        this.f78058.setSelection(iM33616);
                        m53935(iM33616, true);
                    }
                    invalidate();
                    if (mo40459()) {
                        m53826((int) x, (int) y, this.f78066.f45790);
                        return true;
                    }
                    return true;
                case 3:
                    ClipData clipData = dragEvent.getClipData();
                    if (clipData.getItemCount() > 0) {
                        CharSequence charSequenceM35080 = C14540.m35080(clipData.getItemAt(0).getText());
                        int[] iArrM53971 = m53971();
                        this.f78058.replace(iArrM53971[0], iArrM53971[1], charSequenceM35080);
                        int length = charSequenceM35080.length() + iArrM53971[0];
                        iArrM53971[1] = length;
                        mo52316(iArrM53971[0], length);
                        invalidate();
                        return true;
                    }
                    return true;
                case 4:
                    if (mo40459()) {
                        m53785();
                    }
                    this.f78026 = false;
                    invalidate();
                    return true;
                case 5:
                    if (mo40459()) {
                        m53826((int) dragEvent.getX(), (int) dragEvent.getY(), this.f78066.f45790);
                    }
                    this.f78026 = true;
                    invalidate();
                    return true;
                case 6:
                    if (mo40459()) {
                        m53785();
                    }
                    this.f78026 = false;
                    invalidate();
                    return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩴۤ, reason: not valid java name and contains not printable characters */
    public final boolean m54056() {
        return this.f78130;
    }

    /* JADX INFO: renamed from: ۜ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m53963() {
        return this.f78069;
    }

    /* JADX INFO: renamed from: ۬᩷, reason: not valid java name and contains not printable characters */
    public final boolean m54011() {
        return this.f78110;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m53720(C24132 c24132, C24132 c24133) {
        if (c24132 == c24133) {
            throw new IllegalArgumentException();
        }
        c24132.f78012 = c24133;
        c24133.f78012 = c24132;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m53839(C24132 c24132, C24132 c24133) {
        if (c24132.f78056) {
            c24133.f78028 = SystemClock.uptimeMillis();
        } else if (c24133.f78056) {
            c24132.f78028 = SystemClock.uptimeMillis();
        } else {
            long jMax = Math.max(c24132.f78028, c24133.f78028);
            c24133.f78028 = jMax;
            c24132.f78028 = jMax;
        }
        if (c24132.f78107) {
            c24133.f77982 = SystemClock.uptimeMillis();
        } else {
            if (c24133.f78107) {
                c24132.f77982 = SystemClock.uptimeMillis();
                return;
            }
            long jMax2 = Math.max(c24132.f77982, c24133.f77982);
            c24133.f77982 = jMax2;
            c24132.f77982 = jMax2;
        }
    }

    /* JADX INFO: renamed from: ۤ᩸, reason: not valid java name and contains not printable characters */
    public final void m53990() {
        if (!this.f78030) {
            this.f78030 = true;
            C13618.m33370(this.f77989);
            C13618.m33370(this.f78027);
            EdgeEffect edgeEffect = this.f78065;
            if (edgeEffect != null) {
                C13618.m33370(edgeEffect);
            }
            EdgeEffect edgeEffect2 = this.f78045;
            if (edgeEffect2 != null) {
                C13618.m33370(edgeEffect2);
            }
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m53950(int i, int i2) {
        this.f78081 = i;
        this.f78131 = i2;
        this.f78101.m55201();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r7v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX INFO: renamed from: ܽ᩸, reason: not valid java name and contains not printable characters */
    public final void m54041() {
        boolean z;
        boolean z2;
        boolean z3;
        ?? r1;
        int i;
        if ((this.f78081 & 3) == 0 || this.f78022 == null || m53884() || !this.f78047.isActive(this)) {
            return;
        }
        int i2 = this.f78131;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 33) {
            z2 = (i2 & 4) != 0;
            z3 = (i2 & 8) != 0;
            z = (i2 & 16) != 0;
        } else {
            z = false;
            z2 = false;
            z3 = false;
        }
        boolean z4 = (z2 || z3 || z) ? false : true;
        boolean z5 = z2 | z4;
        boolean z6 = z3 | z4;
        boolean z7 = z | z4;
        CursorAnchorInfo.Builder builder = this.f77986;
        builder.reset();
        int iM53968 = m53968();
        builder.setSelectionRange(iM53968, m53882());
        if (i3 >= 29) {
            this.f78050.reset();
            transformMatrixToGlobal(this.f78050);
            builder.setMatrix(this.f78050);
        } else {
            this.f78050.set(getMatrix());
            getLocationOnScreen(this.f78011);
            Matrix matrix = this.f78050;
            int[] iArr = this.f78011;
            matrix.postTranslate(iArr[0], iArr[1]);
            builder.setMatrix(this.f78050);
        }
        if (z5 && i3 >= 34) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            builder.setEditorBoundsInfo(new EditorBoundsInfo.Builder().setEditorBounds(rectF).setHandwritingBounds(new RectF(-getHandwritingBoundsOffsetLeft(), -getHandwritingBoundsOffsetTop(), getHandwritingBoundsOffsetRight() + getWidth(), getHandwritingBoundsOffsetBottom() + getHeight())).build());
        }
        if (z6 || z7) {
            float paddingLeft = getPaddingLeft() - getScrollX();
            float paddingTop = getPaddingTop() - this.f78104;
            RectF rectF2 = new RectF();
            RectF rectF3 = new RectF(getPaddingLeft(), getPaddingRight(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            if (z6) {
                InterfaceC19106 interfaceC19106 = this.f78058;
                int composingSpanStart = BaseInputConnection.getComposingSpanStart(interfaceC19106);
                int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(interfaceC19106);
                if (composingSpanEnd < composingSpanStart) {
                    i = composingSpanStart;
                    composingSpanStart = composingSpanEnd;
                } else {
                    i = composingSpanEnd;
                }
                if (composingSpanStart >= 0 && composingSpanStart < i) {
                    builder.setComposingText(composingSpanStart, interfaceC19106.subSequence(composingSpanStart, i));
                    int i4 = composingSpanStart;
                    while (i4 < i) {
                        this.f78022.mo33625(rectF2, i4);
                        rectF2.offset(paddingLeft, paddingTop);
                        ?? Intersects = RectF.intersects(rectF3, rectF2);
                        if (!rectF3.contains(rectF2)) {
                            Intersects = (Intersects == true ? 1 : 0) | 2;
                        }
                        builder.addCharacterBounds(i4, rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, Intersects == true ? 1 : 0);
                        i4++;
                        i = i;
                    }
                }
            }
            if (z7 && iM53968 >= 0) {
                this.f78022.mo33625(rectF2, iM53968);
                rectF2.offset(paddingLeft, paddingTop);
                boolean zIntersects = RectF.intersects(rectF3, rectF2);
                if (!rectF3.contains(rectF2)) {
                    r1 = zIntersects;
                    r1 = (zIntersects ? 1 : 0) | 2;
                }
                r1 = zIntersects;
                float f = rectF2.left;
                float f2 = rectF2.top;
                builder.setInsertionMarkerLocation(f, f2, this.f78066.m16203() + f2, rectF2.bottom, r1 == true ? 1 : 0);
            }
        }
        this.f78047.updateCursorAnchorInfo(this, builder.build());
        this.f78081 &= -2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m53710(C24132 c24132, Runnable runnable) {
        if (c24132.m53884()) {
            if (c24132.isAttachedToWindow()) {
                C21576.m49062(100L, runnable);
                return;
            }
            return;
        }
        runnable.run();
    }

    /* JADX INFO: renamed from: ܶ᩷, reason: not valid java name and contains not printable characters */
    public final AtomicInteger m54028() {
        return this.f78059;
    }

    /* JADX INFO: renamed from: ܺۤ, reason: not valid java name and contains not printable characters */
    public final boolean m54033() {
        return this.f78059.get() > 0;
    }

    /* JADX INFO: renamed from: ۢ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m53976() {
        return this.f78013;
    }

    /* JADX INFO: renamed from: ۧ᩸, reason: not valid java name and contains not printable characters */
    public final void m53996() {
        if (this.f78013) {
            throw new IllegalStateException();
        }
        this.f78058.getClass();
        this.f78013 = true;
        this.f78018.m9610(this.f78058);
        this.f78033.m4824();
    }

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final void m53987() {
        if (!this.f78013) {
            throw new IllegalStateException();
        }
        this.f78013 = false;
        if (m53872()) {
            this.f78018.m9605(this.f78058);
            this.f78058.mo11045();
            C19656 c19656 = this.f77990;
            C17359.requireNonNull(c19656);
            C21576.m49068(new RunnableC12066(0, c19656));
            return;
        }
        if (this.f78033.m4816()) {
            this.f78033.m4831((InterfaceC9629) this.f78058);
        }
        this.f78018.m9605(this.f78058);
        this.f78058.mo11045();
        mo52299(m53968(), m53882());
        m54030();
        this.f78002 = -1.0f;
    }

    @Override // l.InterfaceC9409
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo24787(float f, float f2) {
        AbstractC13753 abstractC13753 = this.f78022;
        boolean z = abstractC13753.f43635;
        boolean z2 = abstractC13753.f43672;
        if (!z && !z2) {
            return false;
        }
        int[] iArr = this.f77985;
        getLocationOnScreen(iArr);
        float scrollX = ((f + getScrollX()) - getPaddingLeft()) - iArr[0];
        float fM33643 = this.f78022.m33643(f2 - iArr[1]);
        if (z && this.f78022.f43658.m51987(scrollX, fM33643)) {
            return true;
        }
        return z2 && this.f78022.f43661.m51987(scrollX, fM33643);
    }

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final C9959 m54098() {
        return this.f78090;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53912(C9959 c9959) {
        this.f78090 = c9959;
    }
}
