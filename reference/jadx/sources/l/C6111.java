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
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.ۛܳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes.dex */
public class C6111 extends View implements InterfaceC11612 {

    /* JADX INFO: renamed from: ֨ۚ, reason: not valid java name and contains not printable characters */
    public static final TextKeyListener f20699;

    /* JADX INFO: renamed from: ᩹ۚ, reason: not valid java name and contains not printable characters */
    public static final float f20700;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C17400 f20701;

    /* JADX INFO: renamed from: ֡ۖ, reason: not valid java name and contains not printable characters */
    public boolean f20702;

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public C9640 f20703;

    /* JADX INFO: renamed from: ֡ۨ, reason: not valid java name and contains not printable characters */
    public InterfaceC19517 f20704;

    /* JADX INFO: renamed from: ֡ܰ, reason: not valid java name and contains not printable characters */
    public int f20705;

    /* JADX INFO: renamed from: ֨ۖ, reason: not valid java name and contains not printable characters */
    public final Rect f20706;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public boolean f20707;

    /* JADX INFO: renamed from: ֨ۨ, reason: not valid java name and contains not printable characters */
    public InterfaceC2916 f20708;

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public boolean f20709;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C0923 f20710;

    /* JADX INFO: renamed from: ֫ۖ, reason: not valid java name and contains not printable characters */
    public C9310 f20711;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public boolean f20712;

    /* JADX INFO: renamed from: ֫ۨ, reason: not valid java name and contains not printable characters */
    public C17400 f20713;

    /* JADX INFO: renamed from: ֫ܰ, reason: not valid java name and contains not printable characters */
    public C22339 f20714;

    /* JADX INFO: renamed from: ۖۖ, reason: not valid java name and contains not printable characters */
    public volatile boolean f20715;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f20716;

    /* JADX INFO: renamed from: ۖۚ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f20717;

    /* JADX INFO: renamed from: ۖۨ, reason: not valid java name and contains not printable characters */
    public OverScroller f20718;

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f20719;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f20720;

    /* JADX INFO: renamed from: ۗۖ, reason: not valid java name and contains not printable characters */
    public volatile long f20721;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public ViewOnTouchListenerC5405 f20722;

    /* JADX INFO: renamed from: ۗۨ, reason: not valid java name and contains not printable characters */
    public final Object f20723;

    /* JADX INFO: renamed from: ۗܰ, reason: not valid java name and contains not printable characters */
    public EdgeEffect f20724;

    /* JADX INFO: renamed from: ۘۖ, reason: not valid java name and contains not printable characters */
    public volatile boolean f20725;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC8228 f20726;

    /* JADX INFO: renamed from: ۘۨ, reason: not valid java name and contains not printable characters */
    public EdgeEffect f20727;

    /* JADX INFO: renamed from: ۘܰ, reason: not valid java name and contains not printable characters */
    public volatile C18105 f20728;

    /* JADX INFO: renamed from: ۙۖ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f20729;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public ClipboardManager f20730;

    /* JADX INFO: renamed from: ۙۚ, reason: not valid java name and contains not printable characters */
    public C2147 f20731;

    /* JADX INFO: renamed from: ۙۨ, reason: not valid java name and contains not printable characters */
    public ArrayList f20732;

    /* JADX INFO: renamed from: ۙܰ, reason: not valid java name and contains not printable characters */
    public C23805 f20733;

    /* JADX INFO: renamed from: ۚۖ, reason: not valid java name and contains not printable characters */
    public final RectF f20734;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public int f20735;

    /* JADX INFO: renamed from: ۚۚ, reason: not valid java name and contains not printable characters */
    public C6111 f20736;

    /* JADX INFO: renamed from: ۚۨ, reason: not valid java name and contains not printable characters */
    public long f20737;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public volatile boolean f20738;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public InterfaceC22091 f20739;

    /* JADX INFO: renamed from: ۛۖ, reason: not valid java name and contains not printable characters */
    public volatile C12462 f20740;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public volatile C16408 f20741;

    /* JADX INFO: renamed from: ۛۨ, reason: not valid java name and contains not printable characters */
    public int[] f20742;

    /* JADX INFO: renamed from: ۛܰ, reason: not valid java name and contains not printable characters */
    public C12919 f20743;

    /* JADX INFO: renamed from: ۜۖ, reason: not valid java name and contains not printable characters */
    public final ArrayList f20744;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public int f20745;

    /* JADX INFO: renamed from: ۜۨ, reason: not valid java name and contains not printable characters */
    public final Matrix f20746;

    /* JADX INFO: renamed from: ۜܰ, reason: not valid java name and contains not printable characters */
    public C18105 f20747;

    /* JADX INFO: renamed from: ۟ۖ, reason: not valid java name and contains not printable characters */
    public C15990 f20748;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public float f20749;

    /* JADX INFO: renamed from: ۟ۨ, reason: not valid java name and contains not printable characters */
    public float f20750;

    /* JADX INFO: renamed from: ۟ܰ, reason: not valid java name and contains not printable characters */
    public boolean f20751;

    /* JADX INFO: renamed from: ۠ۖ, reason: not valid java name and contains not printable characters */
    public boolean f20752;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f20753;

    /* JADX INFO: renamed from: ۠ۨ, reason: not valid java name and contains not printable characters */
    public boolean f20754;

    /* JADX INFO: renamed from: ۠ܰ, reason: not valid java name and contains not printable characters */
    public float f20755;

    /* JADX INFO: renamed from: ۡۖ, reason: not valid java name and contains not printable characters */
    public boolean f20756;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public float f20757;

    /* JADX INFO: renamed from: ۡۨ, reason: not valid java name and contains not printable characters */
    public boolean f20758;

    /* JADX INFO: renamed from: ۡܰ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f20759;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public volatile boolean f20760;

    /* JADX INFO: renamed from: ۢۖ, reason: not valid java name and contains not printable characters */
    public final Object f20761;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public C10614 f20762;

    /* JADX INFO: renamed from: ۢۨ, reason: not valid java name and contains not printable characters */
    public ViewTreeObserverOnGlobalLayoutListenerC10345 f20763;

    /* JADX INFO: renamed from: ۢܰ, reason: not valid java name and contains not printable characters */
    public AbstractC12359 f20764;

    /* JADX INFO: renamed from: ۤۖ, reason: not valid java name and contains not printable characters */
    public C20928 f20765;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public int f20766;

    /* JADX INFO: renamed from: ۤۨ, reason: not valid java name and contains not printable characters */
    public boolean f20767;

    /* JADX INFO: renamed from: ۤܰ, reason: not valid java name and contains not printable characters */
    public int f20768;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f20769;

    /* JADX INFO: renamed from: ۧۖ, reason: not valid java name and contains not printable characters */
    public C13190 f20770;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC3453 f20771;

    /* JADX INFO: renamed from: ۧۨ, reason: not valid java name and contains not printable characters */
    public long f20772;

    /* JADX INFO: renamed from: ۧܰ, reason: not valid java name and contains not printable characters */
    public final CursorAnchorInfo.Builder f20773;

    /* JADX INFO: renamed from: ۨۖ, reason: not valid java name and contains not printable characters */
    public volatile transient boolean f20774;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public C20120 f20775;

    /* JADX INFO: renamed from: ۨۚ, reason: not valid java name and contains not printable characters */
    public boolean f20776;

    /* JADX INFO: renamed from: ۨۨ, reason: not valid java name and contains not printable characters */
    public EdgeEffect f20777;

    /* JADX INFO: renamed from: ۨܰ, reason: not valid java name and contains not printable characters */
    public InputMethodManager f20778;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public volatile boolean f20779;

    /* JADX INFO: renamed from: ۫ۖ, reason: not valid java name and contains not printable characters */
    public InterfaceC19851 f20780;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public C4555 f20781;

    /* JADX INFO: renamed from: ۫ۨ, reason: not valid java name and contains not printable characters */
    public C4327 f20782;

    /* JADX INFO: renamed from: ۫ܰ, reason: not valid java name and contains not printable characters */
    public EdgeEffect f20783;

    /* JADX INFO: renamed from: ۬ۖ, reason: not valid java name and contains not printable characters */
    public float f20784;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public long f20785;

    /* JADX INFO: renamed from: ۬ۨ, reason: not valid java name and contains not printable characters */
    public final int[] f20786;

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public boolean f20787;

    /* JADX INFO: renamed from: ܰۖ, reason: not valid java name and contains not printable characters */
    public volatile long f20788;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public AbstractC15910 f20789;

    /* JADX INFO: renamed from: ܰۚ, reason: not valid java name and contains not printable characters */
    public final C22959 f20790;

    /* JADX INFO: renamed from: ܰۨ, reason: not valid java name and contains not printable characters */
    public ArrayList f20791;

    /* JADX INFO: renamed from: ܰܰ, reason: not valid java name and contains not printable characters */
    public boolean f20792;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f20793;

    /* JADX INFO: renamed from: ܳۖ, reason: not valid java name and contains not printable characters */
    public C1590 f20794;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public int f20795;

    /* JADX INFO: renamed from: ܳۨ, reason: not valid java name and contains not printable characters */
    public volatile C20223 f20796;

    /* JADX INFO: renamed from: ܳܰ, reason: not valid java name and contains not printable characters */
    public C19892 f20797;

    /* JADX INFO: renamed from: ܶۖ, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f20798;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public int f20799;

    /* JADX INFO: renamed from: ܶۨ, reason: not valid java name and contains not printable characters */
    public int f20800;

    /* JADX INFO: renamed from: ܶܰ, reason: not valid java name and contains not printable characters */
    public float f20801;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Runnable f20802;

    /* JADX INFO: renamed from: ܺۖ, reason: not valid java name and contains not printable characters */
    public long f20803;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final Rect f20804;

    /* JADX INFO: renamed from: ܺۨ, reason: not valid java name and contains not printable characters */
    public boolean f20805;

    /* JADX INFO: renamed from: ܺܰ, reason: not valid java name and contains not printable characters */
    public boolean f20806;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f20807;

    /* JADX INFO: renamed from: ܽۖ, reason: not valid java name and contains not printable characters */
    public int f20808;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public boolean f20809;

    /* JADX INFO: renamed from: ܽۨ, reason: not valid java name and contains not printable characters */
    public boolean f20810;

    /* JADX INFO: renamed from: ܽܰ, reason: not valid java name and contains not printable characters */
    public C19892 f20811;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f20812;

    /* JADX INFO: renamed from: ܿۖ, reason: not valid java name and contains not printable characters */
    public C22362 f20813;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public RuntimeException f20814;

    /* JADX INFO: renamed from: ܿۨ, reason: not valid java name and contains not printable characters */
    public InterfaceC10014 f20815;

    /* JADX INFO: renamed from: ܿܰ, reason: not valid java name and contains not printable characters */
    public final BreakIterator f20816;

    /* JADX INFO: renamed from: ᩳۖ, reason: not valid java name and contains not printable characters */
    public InterfaceC2916 f20817;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public boolean f20818;

    /* JADX INFO: renamed from: ᩳۨ, reason: not valid java name and contains not printable characters */
    public volatile boolean f20819;

    /* JADX INFO: renamed from: ᩳܰ, reason: not valid java name and contains not printable characters */
    public long f20820;

    /* JADX INFO: renamed from: ᩴۖ, reason: not valid java name and contains not printable characters */
    public boolean f20821;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public boolean f20822;

    /* JADX INFO: renamed from: ᩴۨ, reason: not valid java name and contains not printable characters */
    public boolean f20823;

    /* JADX INFO: renamed from: ᩴܰ, reason: not valid java name and contains not printable characters */
    public float f20824;

    /* JADX INFO: renamed from: ᩵ۖ, reason: not valid java name and contains not printable characters */
    public C12880 f20825;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public volatile int f20826;

    /* JADX INFO: renamed from: ᩵ۨ, reason: not valid java name and contains not printable characters */
    public boolean f20827;

    /* JADX INFO: renamed from: ᩵ܰ, reason: not valid java name and contains not printable characters */
    public boolean f20828;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Runnable f20829;

    /* JADX INFO: renamed from: ᩶ۖ, reason: not valid java name and contains not printable characters */
    public long f20830;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public C2877 f20831;

    /* JADX INFO: renamed from: ᩶ۨ, reason: not valid java name and contains not printable characters */
    public int f20832;

    /* JADX INFO: renamed from: ᩶ܰ, reason: not valid java name and contains not printable characters */
    public int f20833;

    /* JADX INFO: renamed from: ᩷ۖ, reason: not valid java name and contains not printable characters */
    public volatile C0466 f20834;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final Rect f20835;

    /* JADX INFO: renamed from: ᩷ۨ, reason: not valid java name and contains not printable characters */
    public boolean f20836;

    /* JADX INFO: renamed from: ᩷ܰ, reason: not valid java name and contains not printable characters */
    public int f20837;

    /* JADX INFO: renamed from: ᩸ۖ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f20838;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final C4327 f20839;

    /* JADX INFO: renamed from: ᩸ۨ, reason: not valid java name and contains not printable characters */
    public boolean f20840;

    /* JADX INFO: renamed from: ᩸ܰ, reason: not valid java name and contains not printable characters */
    public float f20841;

    /* JADX INFO: renamed from: ᩹ۖ, reason: not valid java name and contains not printable characters */
    public final RectF f20842;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public boolean f20843;

    /* JADX INFO: renamed from: ᩹ۨ, reason: not valid java name and contains not printable characters */
    public long f20844;

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public boolean f20845;

    /* JADX INFO: renamed from: ᩺ۖ, reason: not valid java name and contains not printable characters */
    public int f20846;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public int f20847;

    /* JADX INFO: renamed from: ᩺ۨ, reason: not valid java name and contains not printable characters */
    public C22714 f20848;

    /* JADX INFO: renamed from: ᩺ܰ, reason: not valid java name and contains not printable characters */
    public long f20849;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public AbstractActivityC12483 f20850;

    /* JADX INFO: renamed from: ᩻ۖ, reason: not valid java name and contains not printable characters */
    public InterfaceC8934 f20851;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public int f20852;

    /* JADX INFO: renamed from: ᩻ۨ, reason: not valid java name and contains not printable characters */
    public int f20853;

    /* JADX INFO: renamed from: ᩻ܰ, reason: not valid java name and contains not printable characters */
    public HandlerC9910 f20854;

    /* JADX INFO: renamed from: ֡ۖ, reason: not valid java name and contains not printable characters */
    private native void m16626();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m16649(int i, int i2, int i3) {
        if (i3 >= i2 && i >= i2) {
            return i > i3 ? i3 : i;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private synchronized boolean m16683(C19186 c19186, C19186 c19187, int i, long j) {
        boolean z = this.f20774;
        this.f20774 = true;
        try {
            if (!this.f20819 && this.f20708 == c19186) {
                int iM16916 = m16916();
                int iM17020 = m17020();
                if (!c19186.m44046(i, j, new RunnableC22610(this, c19187, c19186, 0))) {
                    c19187.close();
                    this.f20774 = z;
                    return false;
                }
                try {
                    this.f20825.m31931(c19187);
                    this.f20770.m32657();
                    this.f20710.m3658();
                    this.f20764.mo14798(c19187);
                    m16767();
                    c19187.setSelection(iM16916, iM17020);
                    C1590 c1590 = this.f20794;
                    if (c1590.f6398) {
                        m16857(c1590.f6374, true);
                    }
                    this.f20825.m31939(c19187);
                    this.f20770.m32620(c19187);
                    m17063();
                    c19186.setReadOnly(false);
                    this.f20774 = z;
                    return true;
                } catch (Throwable th) {
                    c19186.setReadOnly(false);
                    throw th;
                }
            }
            c19187.close();
            this.f20774 = z;
            return false;
        } catch (Throwable th2) {
            this.f20774 = z;
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ᩶ۖ, reason: not valid java name and contains not printable characters */
    private native void m16783();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public native void m16876(AbstractC15910 abstractC15910);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public native void mo16878(C17367 c17367);

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public native void m16902();

    /* JADX INFO: renamed from: ۙۨ, reason: not valid java name and contains not printable characters */
    public boolean mo16903() {
        return false;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final synchronized void m16905() {
        if (this.f20819) {
            throw new IllegalStateException("Text view is released");
        }
        this.f20769++;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public void mo16920(int i) {
    }

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public int mo16933() {
        return 33554433;
    }

    /* JADX INFO: renamed from: ۡۨ, reason: not valid java name and contains not printable characters */
    public final synchronized void m16940() {
        if (!this.f20823) {
            InterfaceC2916 interfaceC2916 = this.f20708;
            if (interfaceC2916 instanceof C19186) {
                C19186 c19186 = (C19186) interfaceC2916;
                this.f20819 = true;
                if (c19186 instanceof C23464) {
                    ((C23464) c19186).m51712();
                }
                if (this.f20769 != 0) {
                    m17045();
                    return;
                }
                if (isAttachedToWindow()) {
                    return;
                }
                this.f20823 = true;
                m16997();
                this.f20716.clear();
                m17045();
                this.f20770.m32656();
                this.f20726 = null;
                m16635((CharSequence) new C19186(""));
                this.f20770.m32656();
                this.f20854.m25110();
                AbstractC12359 abstractC12359 = this.f20764;
                if (abstractC12359 != null) {
                    abstractC12359.f41325 = true;
                }
                c19186.close();
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public native void m16990(String str);

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final synchronized void m17001() {
        int i = this.f20769;
        if (i <= 0) {
            throw new IllegalStateException("No background text task");
        }
        this.f20769 = i - 1;
        if (this.f20819) {
            m16940();
        }
    }

    /* JADX INFO: renamed from: ܺۨ, reason: not valid java name and contains not printable characters */
    public boolean mo17013() {
        return false;
    }

    /* JADX INFO: renamed from: ᩳۨ, reason: not valid java name and contains not printable characters */
    public boolean mo17027() {
        return true;
    }

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public int mo17038() {
        return 917505;
    }

    /* JADX INFO: renamed from: ᩷ܰ, reason: not valid java name and contains not printable characters */
    public boolean mo17048() {
        return true;
    }

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public int mo17052() {
        return 0;
    }

    /* JADX INFO: renamed from: ᩺ۨ, reason: not valid java name and contains not printable characters */
    public void mo17067() {
    }

    /* JADX INFO: renamed from: ᩻ۨ, reason: not valid java name and contains not printable characters */
    public boolean mo17071() {
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m16662(C6111 c6111, C0135 c0135, Runnable runnable) {
        c6111.getClass();
        try {
            c6111.m16859(c0135);
            try {
                runnable.run();
            } finally {
                c6111.m16696();
            }
        } catch (Throwable th) {
            try {
                runnable.run();
                throw th;
            } finally {
                c6111.m16696();
            }
        }
    }

    public C6111(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C6111(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20830 = 0L;
        this.f20803 = 0L;
        this.f20853 = 0;
        this.f20737 = SystemClock.uptimeMillis();
        this.f20844 = 0L;
        this.f20800 = 0;
        this.f20745 = 0;
        this.f20846 = 0;
        this.f20838 = new AtomicInteger();
        this.f20750 = -1.0f;
        this.f20807 = true;
        this.f20792 = false;
        this.f20702 = false;
        this.f20808 = 0;
        this.f20822 = false;
        this.f20734 = new RectF();
        this.f20852 = -1;
        this.f20795 = -1;
        this.f20705 = -1;
        this.f20833 = -1;
        this.f20842 = new RectF();
        this.f20706 = new Rect();
        this.f20809 = true;
        C4327 c4327 = new C4327(this);
        this.f20839 = c4327;
        this.f20704 = c4327;
        this.f20742 = new int[2];
        this.f20744 = new ArrayList();
        this.f20774 = false;
        this.f20779 = false;
        this.f20788 = -1L;
        this.f20715 = false;
        this.f20716 = new ArrayList();
        this.f20719 = new AtomicInteger();
        this.f20775 = new C20120();
        this.f20835 = new Rect();
        this.f20804 = new Rect();
        this.f20785 = -1L;
        this.f20735 = 255;
        this.f20798 = new CopyOnWriteArrayList();
        this.f20759 = new AtomicInteger();
        this.f20725 = false;
        this.f20816 = BreakIterator.getWordInstance();
        this.f20729 = new ArrayDeque();
        this.f20723 = new Object();
        this.f20761 = new Object();
        this.f20708 = new C19186("");
        this.f20743 = new C12919(this);
        this.f20854 = new HandlerC9910(this);
        this.f20753 = new ArrayList();
        this.f20733 = new C23805();
        this.f20811 = new C19892();
        this.f20797 = new C19892();
        this.f20732 = new ArrayList();
        this.f20791 = new ArrayList();
        this.f20790 = C22959.m50799(300);
        this.f20773 = new CursorAnchorInfo.Builder();
        this.f20746 = new Matrix();
        this.f20786 = new int[2];
        this.f20717 = new AtomicInteger();
        this.f20787 = false;
        this.f20703 = C9640.f32437;
        setSaveEnabled(false);
        setFocusable(true);
        setFocusableInTouchMode(true);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            setDefaultFocusHighlightEnabled(false);
        }
        if (!isInEditMode()) {
            this.f20778 = (InputMethodManager) context.getSystemService("input_method");
            this.f20730 = (ClipboardManager) context.getSystemService("clipboard");
        } else {
            C9739.m24693();
        }
        C1590 c1590 = new C1590(this);
        if (!isInEditMode()) {
            c1590.m5428();
        }
        if (i2 >= 24) {
            setPointerIcon(PointerIcon.getSystemIcon(context, 1008));
        }
        this.f20794 = c1590;
        this.f20781 = new C4555();
        this.f20770 = new C13190(this);
        this.f20825 = new C12880(this);
        this.f20710 = new C0923(this);
        if (!mo17048()) {
            this.f20708.mo8735().m4524(0L);
        }
        this.f20708.setSelection(0);
        this.f20727 = new EdgeEffect(context);
        this.f20783 = new EdgeEffect(context);
        m16674(AbstractC12359.m30713(this, this.f20708, c1590, this.f20808), true);
        setLongClickable(true);
        this.f20718 = new OverScroller(context);
        ViewOnTouchListenerC5405 viewOnTouchListenerC5405 = new ViewOnTouchListenerC5405(this, context);
        this.f20722 = viewOnTouchListenerC5405;
        this.f20762 = new C10614(context, viewOnTouchListenerC5405);
        setOnTouchListener(viewOnTouchListenerC5405);
        Activity activityM22527 = C8703.m22527(context);
        if (activityM22527 instanceof AbstractActivityC12483) {
            this.f20850 = (AbstractActivityC12483) activityM22527;
        }
        m16756();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public void mo16959() {
        if (isInEditMode()) {
            return;
        }
        C2877 c2877 = this.f20831;
        if (c2877 != null) {
            c2877.m8665();
        }
        this.f20831 = null;
        this.f20794.m5428();
        C2147 c2147 = this.f20731;
        if (c2147 != null) {
            ViewTreeObserverOnPreDrawListenerC22758[] viewTreeObserverOnPreDrawListenerC22758Arr = c2147.f7815;
            viewTreeObserverOnPreDrawListenerC22758Arr[0].m50425();
            viewTreeObserverOnPreDrawListenerC22758Arr[1].m50425();
            viewTreeObserverOnPreDrawListenerC22758Arr[2].m50425();
        }
    }

    /* JADX INFO: renamed from: ᩶ۨ, reason: not valid java name and contains not printable characters */
    public final void m17043() {
        try {
            this.f20822 = true;
            AbstractC12359 abstractC12359 = this.f20764;
            abstractC12359.m30754();
            if (abstractC12359 instanceof C21489) {
                this.f20764 = new C21489(this, this.f20708, this.f20794);
            } else {
                if (!(abstractC12359 instanceof C5325)) {
                    throw new RuntimeException(String.valueOf(abstractC12359));
                }
                C5325 c5325 = new C5325(this, this.f20708, this.f20794, ((C5325) abstractC12359).m14792());
                this.f20764 = c5325;
                if (c5325.mo14790() == 0.0f) {
                    this.f20764.mo14805((int) abstractC12359.mo14790());
                }
            }
            while (this.f20764.mo14804()) {
                SystemClock.sleep(100L);
            }
            this.f20764.mo14785(abstractC12359.f41300);
            this.f20822 = false;
            m16651(m16974(getScrollX()), m16837(this.f20826), true);
            this.f20750 = -1.0f;
        } catch (Throwable th) {
            this.f20822 = false;
            m16651(m16974(getScrollX()), m16837(this.f20826), true);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16869(InterfaceC10014 interfaceC10014) {
        this.f20815 = interfaceC10014;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, this.f20826);
    }

    @Override // android.view.View
    public final void setScrollX(int i) {
        m16651(i, this.f20826, true);
    }

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final int m17066() {
        return this.f20826;
    }

    @Override // android.view.View
    public final void setScrollY(int i) {
        m16651(getScrollX(), i, true);
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        m16651(getScrollX() + i, this.f20826 + i2, true);
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        if (this.f20776) {
            return;
        }
        super.onScrollChanged(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    private void m16759(int i, int i2) {
        AbstractC12359 abstractC12359;
        int scrollX = getScrollX();
        int i3 = this.f20826;
        boolean z = this.f20751;
        InterfaceC2916 interfaceC2916 = this.f20817;
        InterfaceC2916 interfaceC2917 = this.f20708;
        if (interfaceC2916 != interfaceC2917) {
            this.f20817 = interfaceC2917;
            this.f20751 = false;
        }
        if (Math.abs(i2) + ((long) getHeight()) > 65536 || ((abstractC12359 = this.f20764) != null && abstractC12359.f41297 == this.f20708 && abstractC12359.m30743() > 65536.0d)) {
            this.f20751 = true;
        }
        this.f20826 = i2;
        this.f20776 = true;
        try {
            super.scrollTo(i, this.f20751 ? 0 : i2);
            this.f20776 = false;
            if (i != scrollX || i2 != i3) {
                super.onScrollChanged(i, i2, scrollX, i3);
            }
            if (z == this.f20751 && i == scrollX && i2 == i3) {
                return;
            }
            invalidate();
        } catch (Throwable th) {
            this.f20776 = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m16656(C6111 c6111, int i, int i2) {
        c6111.m16651(i, i2, true);
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        m16651(i, i2, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m16651(int i, int i2, boolean z) {
        int scrollX;
        int i3;
        if (z) {
            m16732();
            m16801();
            this.f20759.incrementAndGet();
        }
        if (this.f20822) {
            return;
        }
        InterfaceC10014 interfaceC10014 = this.f20815;
        if (interfaceC10014 != null) {
            scrollX = getScrollX();
            i3 = this.f20826;
        } else {
            scrollX = 0;
            i3 = 0;
        }
        try {
            m16759(i, i2);
            if (interfaceC10014 != null) {
                interfaceC10014.mo13621(scrollX, i3, i, i2);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m16976(int i, int i2) {
        m16732();
        m16801();
        this.f20759.incrementAndGet();
        this.f20854.removeMessages(1);
        if (!this.f20718.isFinished()) {
            this.f20718.forceFinished(true);
        }
        int scrollX = getScrollX();
        int i3 = this.f20826;
        if (scrollX == i && i3 == i2) {
            return;
        }
        if (scrollX != i) {
            i = m16974(i);
        }
        if (i3 != i2) {
            i2 = m16837(i2);
        }
        try {
            m16759(i, i2);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m16921(int i, int i2) {
        m16732();
        this.f20759.incrementAndGet();
        int scrollX = getScrollX();
        int i3 = this.f20826;
        if (i == -1) {
            i = this.f20718.isFinished() ? scrollX : this.f20718.getFinalX();
        }
        if (i2 == -1) {
            i2 = this.f20718.isFinished() ? i3 : this.f20718.getFinalY();
        }
        m16801();
        m16928();
        this.f20718.startScroll(scrollX, i3, i - scrollX, i2 - i3);
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m16674(AbstractC12359 abstractC12359, boolean z) {
        int iM17870;
        int i;
        int i2;
        m16760();
        AbstractC12359 abstractC123510 = this.f20764;
        if (abstractC123510 != abstractC12359) {
            if (abstractC123510 != null) {
                abstractC123510.m30754();
            }
            m16688("Session layout changed");
        }
        if (abstractC123510 != null) {
            abstractC12359.mo14785(abstractC123510.f41300);
        }
        int iM16837 = 0;
        if (z && abstractC123510 != null && (abstractC12359 instanceof C21489)) {
            int iM30729 = abstractC123510.m30729(this.f20826 + 1);
            C14435 c14435 = abstractC123510.f41308.get(iM30729);
            i2 = c14435.f47316;
            i = c14435.f47319;
            iM17870 = (int) (this.f20826 - (this.f20794.m17870() * iM30729));
        } else {
            iM17870 = 0;
            i = 0;
            i2 = 0;
        }
        if (abstractC123510 != abstractC12359 && (abstractC123510 instanceof C5325)) {
            ((C5325) abstractC123510).m14801();
        }
        this.f20764 = abstractC12359;
        if (abstractC12359.mo14788()) {
            this.f20724 = new EdgeEffect(getContext());
            this.f20777 = new EdgeEffect(getContext());
            if (this.f20712) {
                C11815.m29485(this.f20724);
                C11815.m29485(this.f20777);
            }
        } else {
            this.f20724 = null;
            this.f20777 = null;
        }
        if (z && abstractC123510 != null && (abstractC12359 instanceof C21489)) {
            while (i < abstractC12359.f41308.size()) {
                C14435 c14436 = abstractC12359.f41308.get(i);
                if (c14436.f47316 == i2 || c14436.f47317 > i2) {
                    iM16837 = m16837(((int) (this.f20794.m17870() * i)) + iM17870);
                    break;
                }
                i++;
            }
            if (this.f20713 == null) {
                m16651(getScrollX(), iM16837, true);
            }
        }
        this.f20750 = -1.0f;
        m16767();
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m16936(int i) {
        C1590 c1590 = this.f20794;
        c1590.m5424(c1590.f22196.getTextSize(), i);
        m16633();
        this.f20764.mo14802();
        this.f20750 = -1.0f;
        invalidate();
    }

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public static void m16634(C6111 c6111) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = c6111.f20724;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = c6111.f20724.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = c6111.f20727;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= c6111.f20727.isFinished();
        }
        EdgeEffect edgeEffect3 = c6111.f20777;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= c6111.f20777.isFinished();
        }
        EdgeEffect edgeEffect4 = c6111.f20783;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= c6111.f20783.isFinished();
        }
        if (zIsFinished) {
            int i = C5031.f17539;
            c6111.postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: renamed from: ֫ۨ, reason: not valid java name and contains not printable characters */
    public final void m16819() {
        this.f20844 = SystemClock.uptimeMillis();
        invalidate();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16864(InterfaceC7191 interfaceC7191) {
        this.f20791.add(interfaceC7191);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16874(C14018 c14018) {
        this.f20791.remove(c14018);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16851(int i, int i2) {
        if (m16809()) {
            return;
        }
        ArrayList arrayList = this.f20791;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((InterfaceC7191) arrayList.get(i3)).mo4041(i, i2);
        }
    }

    /* JADX INFO: renamed from: ۫ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m16973() {
        if (m16809()) {
            return true;
        }
        AbstractC12359 abstractC12359 = this.f20764;
        return abstractC12359 != null && abstractC12359.mo14804();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String m16970() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Session diagnostics require the main thread");
        }
        StringBuilder sb = new StringBuilder("viewSize=");
        sb.append(getWidth());
        sb.append("x");
        sb.append(getHeight());
        sb.append("\nattached=");
        sb.append(isAttachedToWindow());
        sb.append("\npreparing=");
        sb.append(this.f20774);
        sb.append("\npreparingManual=");
        sb.append(this.f20715);
        sb.append("\nawaitingPrepareFinish=");
        sb.append(this.f20779);
        sb.append("\nrestoringInstanceState=");
        sb.append(this.f20725);
        sb.append("\ncancelPrepare=");
        sb.append(this.f20760);
        sb.append("\ncontentLoading=");
        sb.append(this.f20843);
        sb.append("\nlargeChange=");
        sb.append(m16809());
        sb.append("\npendingScroll=");
        boolean z = false;
        sb.append(this.f20796 != null);
        sb.append("\nlayout=");
        AbstractC12359 abstractC12359 = this.f20764;
        sb.append(abstractC12359 == null ? "null" : abstractC12359.getClass().getName());
        sb.append("\nlayoutLoading=");
        AbstractC12359 abstractC123510 = this.f20764;
        sb.append(abstractC123510 != null && abstractC123510.mo14804());
        sb.append("\ntextPrepared=");
        C20928 c20928 = this.f20765;
        if (c20928 != null && c20928.f67997) {
            z = true;
        }
        sb.append(z);
        sb.append("\nsoftWrap=");
        return C12441.m30911(this.f20808, "\n", sb);
    }

    /* JADX INFO: renamed from: ۖۨ, reason: not valid java name and contains not printable characters */
    public final boolean m16831() {
        if (m16809() || this.f20774 || this.f20779 || this.f20715 || this.f20725) {
            return false;
        }
        AbstractC12359 abstractC12359 = this.f20764;
        return abstractC12359.f41297 == this.f20708 && abstractC12359.m30759() && !this.f20764.f41308.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۡۖ, reason: not valid java name and contains not printable characters */
    public boolean m16709() {
        return m16831() && !m16973() && !this.f20843 && this.f20796 == null && this.f20765 == null;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m16823(int i, int i2) {
        AbstractC15910 abstractC15910 = this.f20789;
        if (abstractC15910 == null || !abstractC15910.m37831()) {
            AtomicInteger atomicInteger = this.f20717;
            atomicInteger.incrementAndGet();
            try {
                if (this.f20807) {
                    C23805 c23805 = this.f20733;
                    InterfaceC2916 interfaceC2916 = this.f20708;
                    c23805.getClass();
                    int i3 = i <= 0 ? 0 : i - 1;
                    int iIndexOf = TextUtils.indexOf((CharSequence) interfaceC2916, '\n', i3);
                    if (iIndexOf == -1) {
                        iIndexOf = interfaceC2916.length();
                    }
                    StringBuilder sb = new StringBuilder(C1590.f6367);
                    for (int iLastIndexOf = TextUtils.lastIndexOf(interfaceC2916, '\n', i3) + 1; iLastIndexOf < iIndexOf; iLastIndexOf++) {
                        char cCharAt = interfaceC2916.charAt(iLastIndexOf);
                        if (cCharAt != ' ' && cCharAt != '\t') {
                            break;
                        }
                        sb.append(cCharAt);
                    }
                    interfaceC2916.replace(i, i2, sb.toString());
                    if (i != i2) {
                        interfaceC2916.setSelection(sb.length() + i);
                    }
                } else {
                    this.f20708.replace(i, i2, C1590.f6367);
                    if (i != i2) {
                        mo17029(i + 1);
                    }
                }
                invalidate();
            } finally {
                atomicInteger.decrementAndGet();
            }
        }
    }

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC15910 m16912() {
        return this.f20789;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16853(TextWatcher textWatcher) {
        this.f20732.add(textWatcher);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16880(C19665 c19665) {
        C23520.m51799(this.f20732, c19665);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m16981(int i) {
        int iM30744 = this.f20764.m30744(i);
        if (this.f20764.mo14788()) {
            return iM30744;
        }
        try {
            return this.f20764.f41308.get(iM30744).f47319;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m16891(int i, int[] iArr) {
        if (i >= 0 && i <= this.f20708.length()) {
            if (iArr.length < 2) {
                throw new IllegalArgumentException("lineColumn.length < 2");
            }
            try {
                if (m16809()) {
                    C3329 c3329Mo2399 = this.f20708.mo2399();
                    try {
                        int iM9893 = c3329Mo2399.m9893(i);
                        iArr[0] = iM9893;
                        iArr[1] = i - c3329Mo2399.m9892(iM9893);
                        c3329Mo2399.close();
                        return true;
                    } catch (Throwable th) {
                        try {
                            c3329Mo2399.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                int iM10801 = this.f20764.f41308.m10801(this.f20764.m30744(i));
                iArr[0] = this.f20764.f41308.m10821(iM10801);
                iArr[1] = i - this.f20764.f41308.m10813(iM10801);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m16955(int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            try {
                if (m16809()) {
                    C3329 c3329Mo2399 = this.f20708.mo2399();
                    try {
                        if (i < c3329Mo2399.m9889()) {
                            long jM9892 = ((long) c3329Mo2399.m9892(i)) + ((long) i2);
                            int i3 = jM9892 > ((long) c3329Mo2399.length()) ? -1 : (int) jM9892;
                            c3329Mo2399.close();
                            return i3;
                        }
                        c3329Mo2399.close();
                        return -1;
                    } catch (Throwable th) {
                        try {
                            c3329Mo2399.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                C3662 c3662 = this.f20764.f41308;
                int iM10804 = c3662.m10804(i);
                int iM10801 = iM10804 == -1 ? -1 : c3662.m10801(iM10804);
                if (iM10801 != -1) {
                    long j = ((long) this.f20764.f41308.get(iM10801).f47316) + ((long) i2);
                    if (j <= this.f20708.length()) {
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
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Point m16956(int i) {
        ?? Mo14788;
        int iM10813;
        int i2 = -1;
        if (m16809()) {
            int[] iArr = new int[2];
            return m16891(i, iArr) ? new Point(iArr[0] + 1, iArr[1] + 1) : new Point(-1, -1);
        }
        int iM30744 = this.f20764.m30744(i);
        try {
            Mo14788 = this.f20764.mo14788();
            try {
                if (Mo14788 != 0) {
                    int i3 = iM30744 + 1;
                    iM10813 = this.f20764.f41308.m10813(iM30744);
                    Mo14788 = i3;
                } else {
                    int iM10801 = this.f20764.f41308.m10801(iM30744);
                    int iM10821 = this.f20764.f41308.m10821(iM10801) + 1;
                    iM10813 = this.f20764.f41308.m10813(iM10801);
                    Mo14788 = iM10821;
                }
                i2 = (i - iM10813) + 1;
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            Mo14788 = -1;
        }
        return new Point(Mo14788, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16884(InterfaceC22091 interfaceC22091) {
        InterfaceC22091 interfaceC22092 = this.f20739;
        if (interfaceC22092 == interfaceC22091) {
            return;
        }
        if (this.f20812 != 0 && interfaceC22092 != null) {
            interfaceC22092.mo21236(false);
        }
        this.f20739 = interfaceC22091;
        if (this.f20812 == 0 || interfaceC22091 == null) {
            return;
        }
        interfaceC22091.mo21236(true);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m16722(C6111 c6111) {
        InterfaceC22091 interfaceC22091;
        int i = c6111.f20812 + 1;
        c6111.f20812 = i;
        if (i != 1 || (interfaceC22091 = c6111.f20739) == null) {
            return;
        }
        interfaceC22091.mo21236(true);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m16740(C6111 c6111) {
        InterfaceC22091 interfaceC22091;
        int i = c6111.f20812 - 1;
        c6111.f20812 = i;
        if (i != 0 || (interfaceC22091 = c6111.f20739) == null) {
            return;
        }
        interfaceC22091.mo21236(false);
    }

    /* JADX INFO: renamed from: ۠ۨ, reason: not valid java name and contains not printable characters */
    public final void m16934() {
        C15659 c15659M16763;
        if (m16973() || (c15659M16763 = m16763(m16916())) == null) {
            return;
        }
        C19892 c19892 = this.f20811;
        C15659 c15659M45156 = c19892.m45156();
        if (c15659M45156 != null && Math.abs(c15659M45156.f50867 - c15659M16763.f50867) <= 3) {
            c19892.m45155();
        }
        this.f20797.m45151();
        c19892.m45153(c15659M16763);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m17056(int i, int i2) {
        if (m16973()) {
            return;
        }
        C15659 c15659M16763 = m16763(i);
        C15659 c15659M16764 = m16763(i2);
        if (c15659M16763 != null) {
            int i3 = c15659M16763.f50867;
            if (c15659M16764 == null || i3 == c15659M16764.f50867) {
                return;
            }
            C19892 c19892 = this.f20811;
            C15659 c15659M45156 = c19892.m45156();
            if (c15659M45156 != null && Math.abs(c15659M45156.f50867 - i3) <= 3) {
                c19892.m45155();
            }
            this.f20797.m45151();
            c19892.m45153(c15659M16763);
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m17025() {
        return this.f20811.m45150();
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean m16932() {
        return this.f20797.m45150();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m16821() {
        C15659 c15659M16763;
        if (m16973()) {
            return;
        }
        C19892 c19892 = this.f20811;
        if (c19892.m45150() && (c15659M16763 = m16763(m16916())) != null) {
            this.f20797.m45153(c15659M16763);
            m16675(c19892.m45155());
        }
    }

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final void m16967() {
        C15659 c15659M16763;
        if (m16973()) {
            return;
        }
        C19892 c19892 = this.f20797;
        if (c19892.m45150() && (c15659M16763 = m16763(m16916())) != null) {
            this.f20811.m45153(c15659M16763);
            m16675(c19892.m45155());
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private C15659 m16763(int i) {
        int[] iArr = new int[2];
        if (m16891(i, iArr)) {
            return new C15659(iArr[0], iArr[1]);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m16675(C15659 c15659) {
        int i = c15659.f50867;
        int i2 = c15659.f50866;
        if (i < 0 || i2 < 0 || this.f20764.f41308.isEmpty()) {
            return;
        }
        int i3 = this.f20764.f41308.m10803().f47319;
        if (i > i3) {
            i = i3;
        }
        int iM16955 = m16955(i, i2);
        if (iM16955 == -1) {
            iM16955 = this.f20708.length();
        }
        this.f20708.setSelection(iM16955);
        this.f20750 = -1.0f;
        m16770();
        m16890(iM16955, false);
        m16819();
        requestFocus();
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m16938() {
        return !m17004() && this.f20708.mo8735().m4525();
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m17037() {
        return !m17004() && this.f20708.mo8735().m4548();
    }

    /* JADX INFO: renamed from: ۨۖ, reason: not valid java name and contains not printable characters */
    public final void m16966() {
        m16653(this.f20708, false);
    }

    /* JADX INFO: renamed from: ᩵ۨ, reason: not valid java name and contains not printable characters */
    public final void m17039() {
        m16653(this.f20708, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m16653(InterfaceC2916 interfaceC2916, boolean z) {
        InterfaceC2916 interfaceC2917 = this.f20708;
        try {
            boolean z2 = true;
            boolean z3 = (!this.f20787 || this.f20728 == null || this.f20728.f57899) ? false : true;
            if (m17004()) {
                return;
            }
            if (!m16973() || z3) {
                this.f20750 = -1.0f;
                if (this.f20787 || !interfaceC2916.mo8735().m4553(z)) {
                    z2 = false;
                }
                if (z2) {
                    m16901();
                }
                try {
                    if (z) {
                        interfaceC2916.mo8727();
                    } else {
                        interfaceC2916.mo8726();
                    }
                    if (z2) {
                        m16833();
                    }
                    if (this.f20708 != interfaceC2916) {
                        return;
                    }
                    this.f20737 = SystemClock.uptimeMillis();
                    m16770();
                    InterfaceC8228 interfaceC8228 = this.f20726;
                    if (interfaceC8228 != null) {
                        interfaceC8228.mo3560(this.f20708.isChanged());
                        this.f20726.mo3561(m16938(), m17037());
                    }
                    m16886(false);
                    invalidate();
                } catch (Throwable th) {
                    if (z2) {
                        m16833();
                    }
                    throw th;
                }
            }
        } catch (UncheckedIOException | C18188 e) {
            if (!m16894(interfaceC2917, e)) {
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ᩴۨ, reason: not valid java name and contains not printable characters */
    public final void m17033() {
        m16827(false);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m16827(boolean z) {
        this.f20708.mo8735().m4541(z);
        InterfaceC8228 interfaceC8228 = this.f20726;
        if (interfaceC8228 != null) {
            interfaceC8228.mo3561(m16938(), m17037());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16865(InterfaceC8228 interfaceC8228) {
        this.f20726 = interfaceC8228;
    }

    /* JADX INFO: renamed from: ۤۨ, reason: not valid java name and contains not printable characters */
    public final void m16949() {
        this.f20708.mo8735().m4558();
        InterfaceC8228 interfaceC8228 = this.f20726;
        if (interfaceC8228 != null) {
            interfaceC8228.mo3561(m16938(), m17037());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16856(String str) {
        String string = C1590.m5421(str).toString();
        int iM16916 = m16916();
        int iM17020 = m17020();
        if (iM16916 > iM17020) {
            iM17020 = iM16916;
            iM16916 = iM17020;
        }
        this.f20708.replace(iM16916, iM17020, string);
        mo17029(string.length() + iM16916);
        m16886(false);
    }

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public final int m16832() {
        return this.f20794.m17875();
    }

    /* JADX INFO: renamed from: ۨܰ, reason: not valid java name and contains not printable characters */
    public final int m16969() {
        return this.f20794.f6403;
    }

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public final int m16923() {
        return this.f20764.m30746() ? this.f20764.f41322.size() : this.f20764.f41308.size();
    }

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final int m16948() {
        if (!m16809()) {
            if (this.f20764.f41308.size() == 0) {
                return 1;
            }
            AbstractC12359 abstractC12359 = this.f20764;
            return abstractC12359.f41308.get(abstractC12359.f41308.size() - 1).f47319 + 1;
        }
        C3329 c3329Mo2399 = this.f20708.mo2399();
        try {
            int iM9889 = (int) c3329Mo2399.m9889();
            c3329Mo2399.close();
            return iM9889;
        } catch (Throwable th) {
            try {
                c3329Mo2399.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m17058(int i) {
        if (m16809()) {
            int iM16955 = m16955(i, 0);
            if (iM16955 >= 0) {
                mo17029(iM16955);
                return true;
            }
        } else if (i < m16948()) {
            C14435 c14435 = this.f20764.f41308.get(i);
            int i2 = i;
            while (c14435.f47319 < i) {
                i2++;
                c14435 = this.f20764.f41308.get(i2);
            }
            int i3 = c14435.f47316;
            m17056(m16916(), i3);
            mo17029(i3);
            m16890(i3, false);
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m16907(boolean z) {
        this.f20807 = z;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m16840(boolean z) {
        this.f20792 = z;
    }

    /* JADX INFO: renamed from: ܺܰ, reason: not valid java name and contains not printable characters */
    public final boolean m17014() {
        return this.f20792;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m16937(boolean z) {
        m17028();
        this.f20702 = z;
    }

    /* JADX INFO: renamed from: ܰۨ, reason: not valid java name and contains not printable characters */
    public final boolean m16999() {
        return this.f20702;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m17023(int i) {
        if (!m16809()) {
            if (i >= this.f20764.f41308.size()) {
                return;
            }
            C14435 c14435 = this.f20764.f41308.get(i);
            int i2 = i;
            while (c14435.f47319 < i && (i2 = i2 + 1) < this.f20764.f41308.size()) {
                c14435 = this.f20764.f41308.get(i2);
            }
            int i3 = c14435.f47316;
            int i4 = c14435.f47317;
            while (true) {
                i2++;
                if (i2 < this.f20764.f41308.size()) {
                    C14435 c14436 = this.f20764.f41308.get(i2);
                    if (c14436.f47319 != i) {
                        break;
                    } else {
                        i4 = c14436.f47317;
                    }
                } else {
                    break;
                }
            }
            mo16839(i3, i4);
            m16890(i3, false);
            return;
        }
        C3329 c3329Mo2399 = this.f20708.mo2399();
        if (i >= 0) {
            try {
                if (i < c3329Mo2399.m9889()) {
                    int iM9892 = c3329Mo2399.m9892(i);
                    int i5 = i + 1;
                    mo16839(iM9892, ((long) i5) < c3329Mo2399.m9889() ? c3329Mo2399.m9892(i5) - 1 : c3329Mo2399.length());
                    c3329Mo2399.close();
                    return;
                }
            } catch (Throwable th) {
                try {
                    c3329Mo2399.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        c3329Mo2399.close();
    }

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public final C4555 m17026() {
        return this.f20781;
    }

    /* JADX INFO: renamed from: ᩴܰ, reason: not valid java name and contains not printable characters */
    public final void m17034() {
        int i = this.f20800 + 1;
        this.f20800 = i;
        this.f20745 = i;
        C0466 c0466 = this.f20834;
        if (c0466 == null || c0466.f2103.mo2395() == c0466.f2105) {
            return;
        }
        m16688("Session text changed before view was ready");
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m17057(boolean z) {
        if (z) {
            this.f20838.incrementAndGet();
        }
        this.f20708.mo8728(z);
        this.f20846 = z ? -1 : this.f20745;
        InterfaceC8228 interfaceC8228 = this.f20726;
        if (interfaceC8228 != null) {
            interfaceC8228.mo3560(z);
        }
    }

    /* JADX INFO: renamed from: ܶۨ, reason: not valid java name and contains not printable characters */
    public final void m17009() {
        this.f20708.mo8728(false);
        this.f20846 = this.f20745;
        if (this.f20726 != null) {
            post(new Runnable() { // from class: l.᩸᩻ۖ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f71069.f20726.mo3560(false);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C7522 m17041() {
        return new C7522(this);
    }

    /* JADX INFO: renamed from: ֫ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m16820() {
        return (this.f20774 || this.f20779 || this.f20715 || this.f20725 || this.f20708.mo8725()) ? false : true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m16994(C7522 c7522) {
        return this.f20708 == c7522.f25011 && this.f20708.mo2395() == c7522.f25009 && this.f20745 == c7522.f25012 && this.f20838.get() == c7522.f25010 && this.f20794.f6419.equals(c7522.f25013);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m16895(C7522 c7522) {
        if (m16994(c7522)) {
            m17057(false);
            if (this.f20708 == c7522.f25011 && this.f20708.mo2395() == c7522.f25009 && this.f20745 == c7522.f25012 && !this.f20708.isChanged()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩵ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m17040() {
        return this.f20708.isChanged();
    }

    /* JADX INFO: renamed from: ᩴۖ, reason: not valid java name and contains not printable characters */
    private void m16776() {
        C1590 c1590 = this.f20794;
        if (c1590.f6388 && c1590.f6422) {
            boolean z = c1590.f6381;
            RectF rectF = this.f20734;
            if (z) {
                rectF.left -= this.f20764.f41316;
            } else {
                rectF.right += this.f20764.f41316;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16852(RectF rectF, int i) {
        this.f20764.m30753(rectF, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16886(boolean z) {
        if (m16809()) {
            return;
        }
        HandlerC9910 handlerC9910 = this.f20854;
        if (z) {
            handlerC9910.removeMessages(1);
            m16629(Selection.getSelectionEnd(this.f20708), true);
        } else {
            if (handlerC9910.hasMessages(1)) {
                return;
            }
            handlerC9910.sendEmptyMessage(1);
        }
    }

    /* JADX INFO: renamed from: ۟ۨ, reason: not valid java name and contains not printable characters */
    public final void m16928() {
        this.f20854.removeMessages(1);
    }

    /* JADX INFO: renamed from: ۤۖ, reason: not valid java name and contains not printable characters */
    private boolean m16715() {
        if (!m16831() || this.f20764.mo14804() || m16978() <= 0 || m16814() <= 0) {
            return false;
        }
        AbstractC12359 abstractC12359 = this.f20764;
        return !(abstractC12359 instanceof C5325) || ((C5325) abstractC12359).m14779(m16978());
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    private boolean m16799(int i, int i2) {
        m16801();
        boolean zM16809 = m16809();
        OverScroller overScroller = this.f20718;
        AtomicInteger atomicInteger = this.f20759;
        if (zM16809) {
            atomicInteger.incrementAndGet();
            overScroller.forceFinished(true);
            this.f20713 = new C17400(this, i, i2);
            return false;
        }
        if (!m16831()) {
            return false;
        }
        atomicInteger.incrementAndGet();
        overScroller.forceFinished(true);
        if (m16715()) {
            return true;
        }
        this.f20713 = new C17400(this, i, i2);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩺ۖ, reason: not valid java name and contains not printable characters */
    public void m16801() {
        this.f20713 = null;
        if (this.f20701 != null) {
            this.f20701 = null;
            this.f20718.forceFinished(true);
        }
    }

    /* JADX INFO: renamed from: ܶۖ, reason: not valid java name and contains not printable characters */
    private void m16760() {
        if (this.f20701 == null) {
            return;
        }
        OverScroller overScroller = this.f20718;
        if (!overScroller.isFinished() && this.f20701.m40546(this)) {
            this.f20713 = this.f20701;
        }
        this.f20701 = null;
        overScroller.forceFinished(true);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m16737(int i, int i2, int i3, int i4) {
        this.f20701 = new C17400(this, i, i2);
        this.f20709 = false;
        this.f20718.startScroll(getScrollX(), this.f20826, i3 - getScrollX(), i4 - this.f20826);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֨ۖ, reason: not valid java name and contains not printable characters */
    public boolean m16630() {
        C17400 c17400 = this.f20713;
        if (c17400 != null) {
            if (!c17400.m40546(this)) {
                m16801();
                return false;
            }
            if (m16715()) {
                C17400 c17401 = this.f20713;
                int i = c17401.f55369;
                int iMax = Math.max(0, Math.min(c17401.f55370, this.f20708.length()));
                m16801();
                if (i == 1) {
                    m16890(iMax, true);
                    return true;
                }
                if (i == 2) {
                    m16992(true);
                    return true;
                }
                if (i == 3) {
                    m16988(iMax, true);
                    return true;
                }
                if (i != 4) {
                    return true;
                }
                m16963(true);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m17050(int i) {
        if (this.f20713 == null && this.f20701 == null) {
            m16651(0, i, false);
        }
    }

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public final int m17062() {
        return Math.min(this.f20794.f6412, Math.max(0, m16814() / 2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m16890(int i, boolean z) {
        this.f20854.removeMessages(1);
        return m16629(i, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:44:0x00cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d5  */
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean m16629(int i, boolean z) {
        boolean z2;
        int iM16837;
        int iM16974;
        if (!m16799(1, i)) {
            return false;
        }
        if (!z && (!isAttachedToWindow() || getVisibility() != 0)) {
            z = true;
        }
        this.f20718.forceFinished(true);
        try {
            this.f20764.mo30739(this.f20734, i);
            m16776();
            int scrollX = getScrollX();
            int iM16838 = this.f20826;
            int i2 = this.f20852;
            if (i2 != -1) {
                scrollX = m16974(i2);
                this.f20852 = -1;
                z2 = true;
            } else {
                z2 = false;
            }
            int i3 = this.f20795;
            if (i3 != -1) {
                iM16838 = m16837(i3);
                this.f20795 = -1;
                z2 = true;
            }
            if (this.f20764.mo14788()) {
                float fMax = Math.max(this.f20794.m17870(), this.f20794.f6382.getIntrinsicWidth());
                float f = this.f20734.left;
                float f2 = scrollX;
                if (f < f2 + fMax) {
                    iM16974 = m16974((int) (f - fMax));
                } else {
                    float fMax2 = Math.max(m16978() - fMax, 0.0f);
                    float f3 = this.f20734.right;
                    if (f3 > f2 + fMax2) {
                        iM16974 = m16974((int) (f3 - fMax2));
                    } else {
                        iM16974 = m16974(scrollX);
                        if (iM16974 == scrollX) {
                            scrollX = iM16974;
                        }
                    }
                }
                scrollX = iM16974;
                z2 = true;
            }
            float f4 = this.f20734.top;
            float f5 = iM16838;
            if (f4 < f5) {
                iM16837 = m16837((int) f4);
            } else {
                float fMax3 = Math.max(m16814() - m17062(), 0);
                float f6 = this.f20734.bottom;
                if (f6 > f5 + fMax3) {
                    iM16837 = m16837((int) (f6 - fMax3));
                } else {
                    iM16837 = m16837(iM16838);
                    if (iM16837 != iM16838) {
                    }
                    if (z2) {
                        if (z) {
                            m16651(scrollX, iM16837, true);
                        } else {
                            m16737(1, i, scrollX, iM16837);
                        }
                    }
                    postInvalidate();
                    return z2;
                }
            }
            z2 = true;
            if (z2) {
                if (z) {
                    m16651(scrollX, iM16837, true);
                } else {
                    m16737(1, i, scrollX, iM16837);
                }
            }
            postInvalidate();
            return z2;
        } catch (IndexOutOfBoundsException unused) {
            this.f20795 = -1;
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:22:0x007c  */
    /* JADX WARN: Code duplicated, block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void m16786(int i) {
        int iM16974;
        boolean z;
        if (!m16809() && this.f20764.mo14788()) {
            m16801();
            this.f20854.removeMessages(1);
            this.f20718.forceFinished(true);
            try {
                this.f20764.mo30739(this.f20734, i);
                m16776();
                int scrollX = getScrollX();
                float fMax = Math.max(this.f20794.m17870(), this.f20794.f6382.getIntrinsicWidth());
                float f = this.f20734.left;
                float f2 = scrollX;
                if (f < f2 + fMax) {
                    iM16974 = m16974((int) (f - fMax));
                } else {
                    float fMax2 = Math.max(m16978() - fMax, 0.0f);
                    float f3 = this.f20734.right;
                    if (f3 > f2 + fMax2) {
                        iM16974 = m16974((int) (f3 - fMax2));
                    } else {
                        int iM16975 = m16974(scrollX);
                        if (iM16975 != scrollX) {
                            iM16974 = iM16975;
                        } else {
                            iM16974 = iM16975;
                            z = false;
                        }
                        if (z) {
                            m16651(iM16974, this.f20826, true);
                            invalidate();
                        }
                    }
                }
                z = true;
                if (z) {
                    m16651(iM16974, this.f20826, true);
                    invalidate();
                }
            } catch (IndexOutOfBoundsException unused) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0070  */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m16988(int i, boolean z) {
        boolean z2;
        int i2;
        this.f20854.removeMessages(1);
        if (m16799(3, i)) {
            if (!z && (!isAttachedToWindow() || getVisibility() != 0)) {
                z = true;
            }
            try {
                this.f20764.mo30739(this.f20734, i);
                m16776();
                int scrollX = getScrollX();
                int i3 = this.f20826;
                if (this.f20764.mo14788()) {
                    float fMax = Math.max(this.f20764.mo30751(), m16978() / 3);
                    float f = this.f20734.left;
                    float f2 = scrollX;
                    if (f < f2 + fMax) {
                        i2 = (int) (f - fMax);
                        if (i2 < 0) {
                            i2 = 0;
                        }
                    } else {
                        float fMax2 = Math.max(m16978() - fMax, 0.0f);
                        float f3 = this.f20734.right;
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
                RectF rectF = this.f20734;
                int iM16837 = m16837(Math.max((int) (((rectF.top + rectF.bottom) / 2.0f) - (m16814() / 2.0f)), (int) ((this.f20734.bottom + m17062()) - m16814())));
                if (iM16837 != i3) {
                    z2 = true;
                } else {
                    iM16837 = i3;
                }
                int iM16974 = m16974(i2);
                int iM16838 = m16837(iM16837);
                if (z2 | ((iM16974 == scrollX && iM16838 == i3) ? false : true)) {
                    if (z) {
                        m16651(iM16974, iM16838, true);
                    } else {
                        m16737(3, i, iM16974, iM16838);
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
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m16992(boolean z) {
        boolean z2;
        int i;
        float f;
        float f2;
        float fMax;
        float f3;
        int i2;
        int iM16974;
        int iM16837;
        boolean z3;
        float f4;
        float f5;
        float fMax2;
        float f6;
        this.f20854.removeMessages(1);
        if (m16799(2, 0)) {
            if (!z && (!isAttachedToWindow() || getVisibility() != 0)) {
                z = true;
            }
            this.f20718.forceFinished(true);
            int iM16916 = m16916();
            int iM17020 = m17020();
            if (iM16916 == iM17020) {
                m16886(z);
                return;
            }
            if (iM16916 <= iM17020) {
                iM17020 = iM16916;
                iM16916 = iM17020;
            }
            int scrollX = getScrollX();
            int i3 = this.f20826;
            float fMo30751 = this.f20764.mo30751();
            this.f20764.mo30739(this.f20734, iM16916);
            m16776();
            if (this.f20764.mo14788()) {
                float f7 = this.f20734.left;
                float f8 = scrollX;
                if (f7 < f8 + fMo30751) {
                    scrollX = (int) (f7 - fMo30751);
                    z2 = true;
                    if (scrollX < 0) {
                        scrollX = 0;
                    }
                } else {
                    float fMax3 = Math.max(m16978() - fMo30751, 0.0f);
                    float f9 = this.f20734.right;
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
            float f10 = this.f20734.top;
            float f11 = i3;
            if (f10 >= f11) {
                float fMax4 = Math.max(m16814() - m17062(), 0);
                float f12 = this.f20734.bottom;
                if (f12 > f11 + fMax4) {
                    i = (int) (f12 - fMax4);
                }
                this.f20764.mo30739(this.f20734, iM17020);
                m16776();
                if (this.f20764.mo14788()) {
                    f4 = this.f20734.left;
                    f5 = scrollX;
                    if (f4 < f5 + fMo30751) {
                        scrollX = (int) (f4 - fMo30751);
                        z2 = true;
                        if (scrollX < 0) {
                            scrollX = 0;
                        }
                    } else {
                        fMax2 = Math.max(m16978() - fMo30751, 0.0f);
                        f6 = this.f20734.right;
                        if (f6 > f5 + fMax2) {
                            scrollX = (int) (f6 - fMax2);
                            z2 = true;
                        }
                    }
                }
                f = this.f20734.top;
                f2 = i3;
                if (f < f2) {
                    fMax = Math.max(m16814() - m17062(), 0);
                    f3 = this.f20734.bottom;
                    if (f3 > f2 + fMax) {
                        i2 = (int) (f3 - fMax);
                    }
                    iM16974 = m16974(scrollX);
                    iM16837 = m16837(i3);
                    if (iM16974 == getScrollX() || iM16837 != this.f20826) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z2 | z3) {
                        if (z) {
                            m16651(iM16974, iM16837, true);
                        } else {
                            m16737(2, 0, iM16974, iM16837);
                        }
                    }
                    postInvalidate();
                }
                i2 = (int) f;
                i3 = i2;
                z2 = true;
                iM16974 = m16974(scrollX);
                iM16837 = m16837(i3);
                if (iM16974 == getScrollX()) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (z2 | z3) {
                    if (z) {
                        m16651(iM16974, iM16837, true);
                    } else {
                        m16737(2, 0, iM16974, iM16837);
                    }
                }
                postInvalidate();
            }
            i = (int) f10;
            i3 = i;
            z2 = true;
            this.f20764.mo30739(this.f20734, iM17020);
            m16776();
            if (this.f20764.mo14788()) {
                f4 = this.f20734.left;
                f5 = scrollX;
                if (f4 < f5 + fMo30751) {
                    scrollX = (int) (f4 - fMo30751);
                    z2 = true;
                    if (scrollX < 0) {
                        scrollX = 0;
                    }
                } else {
                    fMax2 = Math.max(m16978() - fMo30751, 0.0f);
                    f6 = this.f20734.right;
                    if (f6 > f5 + fMax2) {
                        scrollX = (int) (f6 - fMax2);
                        z2 = true;
                    }
                }
            }
            f = this.f20734.top;
            f2 = i3;
            if (f < f2) {
                fMax = Math.max(m16814() - m17062(), 0);
                f3 = this.f20734.bottom;
                if (f3 > f2 + fMax) {
                    i2 = (int) (f3 - fMax);
                }
                iM16974 = m16974(scrollX);
                iM16837 = m16837(i3);
                if (iM16974 == getScrollX()) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (z2 | z3) {
                    if (z) {
                        m16651(iM16974, iM16837, true);
                    } else {
                        m16737(2, 0, iM16974, iM16837);
                    }
                }
                postInvalidate();
            }
            i2 = (int) f;
            i3 = i2;
            z2 = true;
            iM16974 = m16974(scrollX);
            iM16837 = m16837(i3);
            if (iM16974 == getScrollX()) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (z2 | z3) {
                if (z) {
                    m16651(iM16974, iM16837, true);
                } else {
                    m16737(2, 0, iM16974, iM16837);
                }
            }
            postInvalidate();
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008d  */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m16963(boolean z) {
        boolean z2;
        int iM16837;
        this.f20854.removeMessages(1);
        if (m16799(4, 0)) {
            if (!z && (!isAttachedToWindow() || getVisibility() != 0)) {
                z = true;
            }
            this.f20718.forceFinished(true);
            int iM16916 = m16916();
            int iM17020 = m17020();
            if (iM16916 == iM17020) {
                m16988(iM16916, z);
                return;
            }
            if (iM16916 <= iM17020) {
                iM17020 = iM16916;
                iM16916 = iM17020;
            }
            int scrollX = getScrollX();
            int i = this.f20826;
            float fMax = Math.max(this.f20764.mo30751(), m16978() / 3);
            this.f20764.mo30739(this.f20734, iM16916);
            m16776();
            float f = this.f20734.bottom;
            if (this.f20764.mo14788()) {
                float f2 = this.f20734.left;
                float f3 = scrollX;
                if (f2 < f3 + fMax) {
                    scrollX = (int) (f2 - fMax);
                    if (scrollX < 0) {
                        scrollX = 0;
                    }
                } else {
                    float fMax2 = Math.max(m16978() - fMax, 0.0f);
                    float f4 = this.f20734.right;
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
            this.f20764.mo30739(this.f20734, iM17020);
            m16776();
            float f5 = this.f20734.top;
            if (this.f20764.mo14788()) {
                float f6 = this.f20734.left;
                float f7 = scrollX;
                if (f6 < f7 + fMax) {
                    scrollX = (int) (f6 - fMax);
                    if (scrollX < 0) {
                        scrollX = 0;
                    }
                } else {
                    float fMax3 = Math.max(m16978() - fMax, 0.0f);
                    float f8 = this.f20734.right;
                    if (f8 > f7 + fMax3) {
                        scrollX = (int) (f8 - fMax3);
                    }
                }
                z2 = true;
            }
            if (f - f5 >= m16814() ? (iM16837 = m16837((int) f5)) != this.f20826 : (iM16837 = m16837((int) (((f5 + f) / 2.0f) - (m16814() / 2.0f)))) != this.f20826) {
                i = iM16837;
                z2 = true;
            }
            int iM16974 = m16974(scrollX);
            int iM16838 = m16837(i);
            if (((iM16974 == getScrollX() && iM16838 == this.f20826) ? false : true) | z2) {
                if (z) {
                    m16651(iM16974, iM16838, true);
                } else {
                    m16737(4, 0, iM16974, iM16838);
                }
            }
            postInvalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܿۖ, reason: not valid java name and contains not printable characters */
    public void m16770() {
        this.f20833 = -1;
        this.f20705 = -1;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public void mo17029(int i) {
        BaseInputConnection.removeComposingSpans(this.f20708);
        this.f20708.setSelection(i);
        m16770();
        this.f20750 = -1.0f;
        invalidate();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public void mo16839(int i, int i2) {
        BaseInputConnection.removeComposingSpans(this.f20708);
        this.f20708.setSelection(i, i2);
        m16770();
        this.f20750 = -1.0f;
        invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0027  */
    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final void m16930(int i) {
        if (i != 0 && i != 1 && i != 2) {
            throw new IllegalArgumentException();
        }
        int i2 = this.f20808;
        if (i2 != i) {
            if (i2 == 0 || i == 0) {
                m16674(AbstractC12359.m30713(this, this.f20708, this.f20794, i), true);
            } else {
                AbstractC12359 abstractC12359 = this.f20764;
                if (!(abstractC12359 instanceof C5325)) {
                    m16674(AbstractC12359.m30713(this, this.f20708, this.f20794, i), true);
                } else {
                    ((C5325) abstractC12359).m14787(i == 1);
                }
            }
            this.f20808 = i;
            m17050(this.f20826);
            invalidate();
        }
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final void m16931(boolean z) {
        C1590 c1590 = this.f20794;
        if (c1590.f6415 != z) {
            c1590.f6415 = z;
            AbstractC12359 abstractC12359 = this.f20764;
            if (abstractC12359 instanceof C5325) {
                C5325 c5325 = (C5325) abstractC12359;
                c5325.m14787(c5325.m14792());
                m17050(this.f20826);
                invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final int m17070() {
        return this.f20808;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m16960(float f) {
        m16985(f * this.f20794.f22193);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16849(float f) {
        if (f < 0.8f || f > 2.0f) {
            throw new IllegalArgumentException("Line spacing must be between 0.8 and 2.0");
        }
        if (this.f20794.m17854() == f) {
            return;
        }
        this.f20718.forceFinished(true);
        float fM17870 = this.f20794.m17870();
        double d = fM17870 > 0.0f ? ((double) this.f20826) / ((double) fM17870) : 0.0d;
        this.f20759.incrementAndGet();
        this.f20794.mo5423(f);
        AbstractC12359 abstractC12359 = this.f20764;
        if (abstractC12359 instanceof C21489) {
            ((C21489) abstractC12359).m48128();
        }
        m16633();
        m16976(getScrollX(), m16837((int) Math.min(2147483647L, Math.round(d * ((double) this.f20794.m17870())))));
        this.f20750 = -1.0f;
        requestLayout();
        invalidate();
    }

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public final float m16980() {
        C1590 c1590 = this.f20794;
        return c1590.f22196.getTextSize() / c1590.f22193;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m16985(float f) {
        this.f20794.m5431(f);
        m16633();
        this.f20764.mo14802();
        this.f20750 = -1.0f;
        invalidate();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16850(float f, int i) {
        C1590 c1590 = this.f20794;
        c1590.m5424(f * c1590.f22193, i);
        m16633();
        this.f20764.mo14802();
        this.f20750 = -1.0f;
        invalidate();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16857(String str, boolean z) {
        if (!this.f20715 && !this.f20725) {
            this.f20740 = null;
        }
        this.f20770.m32658();
        if (str == null) {
            str = "Text";
        }
        if (this.f20770.m32654(str)) {
            this.f20770.m32651((CharSequence) this.f20708);
            C1590 c1590 = this.f20794;
            c1590.f6374 = str;
            c1590.f6398 = true;
        } else if (str.startsWith(".") && this.f20770.m32637(str)) {
            this.f20770.m32651((CharSequence) this.f20708);
            C1590 c1591 = this.f20794;
            c1591.f6374 = str;
            c1591.f6398 = true;
        } else {
            this.f20794.f6398 = false;
        }
        if (this.f20794.f6398 && this.f20770.m32663()) {
            this.f20710.m3667(this.f20770.m32643());
        } else {
            this.f20710.m3667(C0923.f3694);
        }
        this.f20764.mo14803();
        m17063();
        if (z) {
            postInvalidate();
        }
    }

    /* JADX INFO: renamed from: ۨۨ, reason: not valid java name and contains not printable characters */
    public final boolean m16968() {
        if ((!m16809() || m17018()) && !this.f20774) {
            return ((this.f20779 && this.f20788 != this.f20721) || this.f20715 || this.f20725) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩻ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m17072() {
        return (((!this.f20774 || !this.f20779) && (!m16809() || m17018())) || this.f20715 || this.f20725) ? false : true;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m16909(int i, int i2) {
        if (m16809() || !this.f20764.mo14789(i, i2)) {
            return false;
        }
        if (this.f20793) {
            return true;
        }
        m17063();
        invalidate();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m16900(int[] iArr) {
        return m16685(iArr, false, 0, 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m16889(int i, int i2, int[] iArr) {
        return m16685(iArr, true, i, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m16685(int[] iArr, boolean z, int i, int i2) {
        if (iArr == null || (iArr.length & 1) != 0) {
            throw new IllegalArgumentException("Invalid syntax dirty ranges");
        }
        boolean z2 = this.f20793;
        this.f20793 = true;
        try {
            return m16752(iArr, z, i, i2);
        } finally {
            this.f20793 = z2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m16684(boolean z, int i, int i2, int i3, int i4, int i5, int i6) {
        C0923 c0923;
        boolean z2 = this.f20793;
        this.f20793 = true;
        try {
            if (!(m16909(i, i2) && (i3 < 0 || m16909(i3, i4)))) {
                return false;
            }
            if (!z2) {
                if (z && (c0923 = this.f20710) != null) {
                    c0923.m3664(m16916(), m17020(), i5, i6);
                } else {
                    m17063();
                }
                invalidate();
            }
            return true;
        } finally {
            this.f20793 = z2;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m16752(int[] iArr, boolean z, int i, int i2) {
        boolean zM16684;
        int i3 = 0;
        while (true) {
            int i4 = i3 + 3;
            if (i4 >= iArr.length) {
                if (i3 >= iArr.length) {
                    return true;
                }
                if (z) {
                    return m16684(true, iArr[i3], iArr[i3 + 1], -1, -1, i, i2);
                }
                return m16909(iArr[i3], iArr[i3 + 1]);
            }
            if (!z) {
                zM16684 = m16684(false, iArr[i3], iArr[i3 + 1], iArr[i3 + 2], iArr[i4], 0, 0);
            } else {
                zM16684 = m16684(true, iArr[i3], iArr[i3 + 1], iArr[i3 + 2], iArr[i4], i, i2);
            }
            if (!zM16684) {
                return false;
            }
            i3 += 4;
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m17051(boolean z) {
        this.f20794.m17869(z);
        this.f20750 = -1.0f;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m17036(boolean z) {
        this.f20794.m17853(z);
        this.f20750 = -1.0f;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m17030(boolean z) {
        C1590 c1590 = this.f20794;
        if (c1590.f6388 != z) {
            c1590.f6388 = z;
        }
        this.f20750 = -1.0f;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m16813(boolean z) {
        C1590 c1590 = this.f20794;
        if (c1590.f6422 != z) {
            c1590.f6422 = z;
        }
        this.f20750 = -1.0f;
    }

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public final int m16927() {
        return this.f20768;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳۖ, reason: not valid java name and contains not printable characters */
    public void m16756() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            post(new RunnableC21198(0, this));
        } else {
            setPadding(getPaddingLeft(), getPaddingTop() - this.f20768, getPaddingRight(), getPaddingBottom());
        }
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        C1590 c1590 = this.f20794;
        int iMax = Math.max(0, (c1590 == null ? 0 : (int) Math.ceil(Math.max(0.0f, c1590.m17852() - c1590.m17851()))) - i2);
        this.f20768 = iMax;
        super.setPadding(i, i2 + iMax, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ۖ, reason: not valid java name and contains not printable characters */
    public void m16633() {
        m16756();
        C22714 c22714 = this.f20848;
        if (c22714 != null) {
            c22714.m50348(this.f20794.m17870());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩸ۖ, reason: not valid java name and contains not printable characters */
    public void m16790() {
        C22714 c22714 = this.f20848;
        if (c22714 != null) {
            c22714.m50347();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void m16736(int i, int i2, int i3) {
        if (isInEditMode()) {
            return;
        }
        if (this.f20848 == null) {
            this.f20848 = new C22714(this);
            m16633();
        }
        this.f20848.m50349(i, i2, i3);
    }

    /* JADX INFO: renamed from: ۛۨ, reason: not valid java name and contains not printable characters */
    public final void m16917() {
        this.f20809 = false;
    }

    /* JADX INFO: renamed from: ۟ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m16929() {
        return this.f20809;
    }

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC12483 m16830() {
        return this.f20850;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ܰ᩻ۖ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16858(ArrayList arrayList) {
        arrayList.addAll(C16926.m39620());
        arrayList.add(new C12732(this, new InterfaceC17295() { // from class: l.ܰ᩻ۖ
            @Override // l.InterfaceC17295
            public final void accept(Object obj) {
                TextKeyListener textKeyListener = C6111.f20699;
                this.f46414.m17064(R.string.MT_Protector);
            }
        }));
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m17064(int i) {
        int i2;
        AbstractActivityC12483 abstractActivityC12483 = this.f20850;
        if (i == R.string.MT_Protector) {
            abstractActivityC12483.m31012().m44772(this);
            return;
        }
        if (i == R.string.MT_Protector) {
            C22466.m49972(this);
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
                int iM16916 = m16916();
                int iM17020 = m17020();
                int iMin = Math.min(iM16916, iM17020);
                int iMax = Math.max(iM16916, iM17020);
                if (iMin == iMax || !m16893(this.f20708.subSequence(iMin, iMax))) {
                    return;
                }
                mo17029(iM17020);
                m16886(false);
                m16835();
                return;
            }
            if (i == 17039371) {
                i2 = android.R.id.paste;
            } else {
                if (i == R.string.MT_Protector) {
                    InterfaceC19851 interfaceC19851 = this.f20780;
                    if (interfaceC19851 != null) {
                        interfaceC19851.mo41933();
                    }
                } else if (i == R.string.MT_Protector) {
                    if (this.f20780 != null) {
                        int iM16917 = m16916();
                        int iM17021 = m17020();
                        int iMin2 = Math.min(iM16917, iM17021);
                        int iMax2 = Math.max(iM16917, iM17021);
                        C1590 c1590 = this.f20794;
                        c1590.f6392 = iMin2;
                        c1590.f6400 = iMax2;
                        mo17029(iMin2);
                        this.f20780.mo41940(true, true);
                        m17005();
                        return;
                    }
                } else {
                    if (i == R.string.MT_Protector) {
                        getContext().startActivity(new Intent(getContext(), (Class<?>) ActivityC6426.class));
                        return;
                    }
                    if (i == R.string.MT_Protector) {
                        C1877.m6130(this);
                        return;
                    }
                    if (i == R.string.MT_Protector) {
                        int iM16918 = m16916();
                        int iM17022 = m17020();
                        this.f20708.delete(Math.min(iM16918, iM17022), Math.max(iM16918, iM17022));
                        invalidate();
                    } else {
                        if (i == R.string.MT_Protector) {
                            try {
                                String strM17016 = m17016();
                                if (strM17016 != null) {
                                    Intent intent = new Intent();
                                    intent.setAction("android.intent.action.SEND");
                                    intent.putExtra("android.intent.extra.TEXT", strM17016);
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
                                        if (abstractActivityC12483 != null) {
                                            abstractActivityC12483.m31002(e, (DialogInterface.OnDismissListener) null);
                                            return;
                                        } else {
                                            C15829.m37613((CharSequence) e.toString());
                                            return;
                                        }
                                    }
                                }
                                C15829.m37611(R.string.MT_Protector);
                                return;
                            }
                        }
                        if (i == R.string.MT_Protector) {
                            try {
                                C13190.m32615(abstractActivityC12483, this.f20708, this.f20813.m49596(), this.f20813.m49594(), Integer.parseInt(this.f20813.m49595().m37369().split("\\|")[1]));
                            } catch (Exception e2) {
                                abstractActivityC12483.m31002(e2, (DialogInterface.OnDismissListener) null);
                            }
                        } else if (i == R.string.MT_Protector) {
                            String strM17017 = m17016();
                            if (strM17017 != null) {
                                String strM32847 = C13351.m32847(strM17017);
                                if (abstractActivityC12483 == null) {
                                    Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(strM32847));
                                    intent2.addFlags(268435456);
                                    try {
                                        C16737.m39277().startActivity(intent2);
                                        return;
                                    } catch (Throwable th) {
                                        C15829.m37613((CharSequence) th.toString());
                                        return;
                                    }
                                }
                                abstractActivityC12483.m31020(strM32847);
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
            m17006(i2);
        }
    }

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final C4327 m16841() {
        return this.f20839;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16879(InterfaceC19517 interfaceC19517) {
        this.f20704 = interfaceC19517;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m16750(MotionEvent motionEvent) {
        return (motionEvent.getSource() & o.a.r) == 8194;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m16751(int[] iArr) {
        int i;
        int i2;
        if (!isInEditMode()) {
            if (this.f20831 == null) {
                C2877 c2877 = new C2877(this);
                c2877.m8673(4500);
                c2877.m8669(new InterfaceC9229() { // from class: l.ۢۧۖ
                    @Override // l.InterfaceC9229
                    public final void onMenuItemClick(MenuItem menuItem) {
                        TextKeyListener textKeyListener = C6111.f20699;
                        C6111 c6111 = this.f32228;
                        c6111.getClass();
                        CharSequence title = menuItem.getTitle();
                        if (title instanceof C14894) {
                            ((C14894) title).m35599().mo20677(c6111);
                        }
                    }
                });
                this.f20831 = c2877;
            }
            this.f20831.m8663();
            this.f20831.m8670((C23648) null);
            ArrayList<AbstractC21243> arrayList = new ArrayList();
            InterfaceC19517 interfaceC19517 = this.f20704;
            if (interfaceC19517 != null) {
                interfaceC19517.mo5518(arrayList);
            }
            boolean z = (m16973() || this.f20794.f6433) ? false : true;
            boolean z2 = this.f20708.length() == 0;
            int iM16916 = m16916();
            int iM17020 = m17020();
            if (iM16916 > iM17020) {
                i2 = iM16916;
                i = iM17020;
            } else {
                i = iM16916;
                i2 = iM17020;
            }
            if (iArr != null) {
                iArr[0] = i;
                iArr[1] = i2;
            }
            ArrayList arrayList2 = new ArrayList();
            Map mapM39615 = C16926.m39615();
            for (AbstractC21243 abstractC21243 : arrayList) {
                Integer num = (Integer) mapM39615.get(abstractC21243.mo20676());
                if (num != null && abstractC21243.mo20678(this, z, z2, i, i2)) {
                    C5700 c5700M8664 = this.f20831.m8664(abstractC21243.mo20679(), num.intValue());
                    c5700M8664.m15726(abstractC21243.mo20675(getContext()));
                    if (num.intValue() >= 300) {
                        c5700M8664.m15725();
                    }
                    if (abstractC21243.mo20975()) {
                        arrayList2.add(abstractC21243);
                    }
                }
            }
            if (!this.f20831.m8671()) {
                if (!arrayList2.isEmpty()) {
                    this.f20831.m8670(new C23648(0, arrayList2));
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ed  */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m16946(int i) {
        boolean z;
        boolean z2;
        int[] iArr = new int[2];
        if (m16751(iArr)) {
            boolean z3 = false;
            int i2 = iArr[0];
            int i3 = iArr[1];
            RectF rectF = this.f20842;
            Rect rect = this.f20706;
            getWindowVisibleDisplayFrame(rect);
            getLocationOnScreen(this.f20742);
            int i4 = rect.top;
            int i5 = this.f20742[1];
            int i6 = i4 - i5;
            int i7 = rect.bottom - i5;
            if (i != -1) {
                z = true;
            } else {
                if (this.f20764.m30742(rectF)) {
                    rectF.left = ((rectF.left + rectF.right) / 2.0f) + 1.0f;
                    i = -2;
                } else {
                    this.f20764.m30753(rectF, i2);
                    if (rectF.top - this.f20826 < 0.0f || rectF.bottom - this.f20826 > m16814()) {
                        if (i2 != i3) {
                            try {
                                this.f20764.m30753(rectF, i3);
                            } catch (IndexOutOfBoundsException unused) {
                            }
                            if (rectF.top - this.f20826 >= 0.0f && rectF.bottom - this.f20826 <= m16814()) {
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
                this.f20831.m8666(C20368.m45982(0.8f, 0.86f));
                this.f20831.m8668(getWidth() / 2, (this.f20831.m8672() + getHeight()) / 2);
                return;
            }
            if (i >= 0) {
                this.f20764.mo30739(rectF, i);
            }
            rectF.offset(getPaddingLeft(), getPaddingTop());
            if (i != i3 || i2 == i3 || this.f20764.m30728(i2, i3)) {
                z2 = false;
            } else {
                z2 = true;
                z = false;
            }
            if (z) {
                if ((rectF.top - this.f20826) - this.f20831.m8672() >= i6) {
                    z3 = z;
                }
            } else if ((rectF.bottom - this.f20826) + this.f20831.m8672() + this.f20794.f6382.getIntrinsicHeight() > i7) {
                z3 = true;
            } else {
                z3 = z;
            }
            boolean z4 = (z3 || !mo17027() || ((float) getHeight()) - (rectF.bottom - ((float) this.f20826)) >= ((float) C13932.m33769(92.0f))) ? z3 : true;
            if (z4 && z2) {
                this.f20831.m8666(C20368.m45982(0.8f, 0.86f));
            }
            int scrollX = ((int) rectF.left) - getScrollX();
            int intrinsicHeight = z4 ? ((int) rectF.top) - this.f20826 : this.f20794.f6382.getIntrinsicHeight() + this.f20831.m8672() + (((int) rectF.bottom) - this.f20826);
            if (scrollX < 0 || scrollX > getWidth()) {
                scrollX = getWidth() / 2;
            }
            if (intrinsicHeight < i6 || intrinsicHeight > i7) {
                intrinsicHeight = getHeight() / 2;
            }
            this.f20831.m8668(scrollX, intrinsicHeight);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m16824(int i, boolean z) {
        int[] iArrM16965 = m16965(i, z);
        m17056(m16916(), iArrM16965[0]);
        mo16839(iArrM16965[0], iArrM16965[1]);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int[] m16965(int i, boolean z) {
        int[] iArrM32655;
        C13190 c13190 = this.f20770;
        if (c13190.m32642() && (iArrM32655 = c13190.m32655(i)) != null) {
            return iArrM32655;
        }
        int[] iArrM16731 = m16731(i, z);
        int i2 = iArrM16731[0];
        int i3 = iArrM16731[1];
        if (i2 == i3) {
            return iArrM16731;
        }
        String strSubstring = TextUtils.substring(this.f20708, i2, i3);
        BreakIterator breakIterator = this.f20816;
        breakIterator.setText(strSubstring);
        int i4 = i - i2;
        try {
            int iPreceding = breakIterator.preceding(i4);
            if (iPreceding < 0) {
                iPreceding = 0;
            }
            int next = breakIterator.next();
            iArrM16731[0] = iPreceding + i2;
            iArrM16731[1] = i2 + next;
            return iArrM16731;
        } catch (Exception unused) {
            int i5 = i4 + i2;
            iArrM16731[0] = i5;
            iArrM16731[1] = i5;
            return iArrM16731;
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private int[] m16731(int i, boolean z) {
        int i2;
        int length;
        int iM30744 = this.f20764.m30744(i);
        if (iM30744 != 0) {
            C14435 c14435 = this.f20764.f41308.get(iM30744);
            int i3 = c14435.f47316;
            int i4 = c14435.f47319;
            int i5 = iM30744 - 1;
            while (true) {
                if (i5 >= 0) {
                    C14435 c14436 = this.f20764.f41308.get(i5);
                    if (c14436.f47319 != i4) {
                        if (z) {
                            i2 = c14436.f47317;
                            break;
                        }
                    } else {
                        i3 = c14436.f47316;
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
        if (iM30744 == this.f20764.f41308.size() - 1) {
            length = this.f20708.length();
        } else {
            C14435 c14437 = this.f20764.f41308.get(iM30744);
            int i6 = c14437.f47317;
            int i7 = c14437.f47319;
            do {
                iM30744++;
                if (iM30744 >= this.f20764.f41308.size()) {
                    break;
                }
                C14435 c14438 = this.f20764.f41308.get(iM30744);
                if (c14438.f47319 == i7) {
                    i6 = c14438.f47317;
                } else if (z) {
                    length = c14438.f47316;
                }
            } while (Math.abs(i6 - i) <= 10000);
            length = i6;
        }
        return new int[]{i2, length};
    }

    /* JADX INFO: renamed from: ܰܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2916 m17000() {
        return this.f20708;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m16689(InterfaceC2916 interfaceC2916) {
        boolean z;
        if (!mo17048()) {
            interfaceC2916.mo8735().m4524(0L);
        }
        synchronized (this.f20761) {
            z = this.f20708 != interfaceC2916;
            if (z) {
                this.f20796 = null;
                m16801();
                this.f20759.incrementAndGet();
            }
            if (z) {
                this.f20741 = null;
                this.f20814 = null;
                this.f20772 = 0L;
                this.f20728 = null;
            }
            this.f20708 = interfaceC2916;
        }
        if (z) {
            AbstractC12359 abstractC12359 = this.f20764;
            if (abstractC12359 != null) {
                abstractC12359.m30754();
            }
            m16688("Session view owner changed");
            if (this.f20798.isEmpty()) {
                return;
            }
            C16737.m39273(new RunnableC7793(0, this));
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m16636(InterfaceC2916 interfaceC2916) {
        synchronized (this.f20744) {
            Iterator it = this.f20744.iterator();
            while (it.hasNext()) {
                if (((InterfaceC2916) it.next()) == interfaceC2916) {
                    return;
                }
            }
            this.f20744.add(interfaceC2916);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܽۖ, reason: not valid java name and contains not printable characters */
    public void m16767() {
        AbstractC12359 abstractC12359;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            C16737.m39273(new RunnableC16260(0, this));
            return;
        }
        synchronized (this.f20744) {
            int size = this.f20744.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                InterfaceC2916 interfaceC2916 = (InterfaceC2916) this.f20744.get(size);
                if (interfaceC2916 != this.f20708 && ((abstractC12359 = this.f20764) == null || interfaceC2916 != abstractC12359.f41297)) {
                    this.f20744.remove(size);
                    interfaceC2916.mo8723(false);
                }
            }
        }
        if (this.f20828 && !this.f20774 && this.f20764.f41297 == this.f20708) {
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: ۚۨ, reason: not valid java name and contains not printable characters */
    public final boolean m16913() {
        return this.f20819;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16882(AbstractC20745 abstractC20745) {
        if (this.f20708.mo8731()) {
            return;
        }
        InterfaceC2916 interfaceC2916 = this.f20708;
        if (interfaceC2916 instanceof C16408) {
            throw new IllegalStateException("Session already owns storage");
        }
        C19186 c19186 = (C19186) interfaceC2916;
        while (this.f20708 == c19186 && !this.f20819) {
            int iMo2395 = c19186.mo2395();
            long jMo8718 = c19186.mo8718();
            C23464 c23464M51704 = C23464.m51704(abstractC20745);
            try {
                C22422 c22422M4522 = c19186.mo8735().m4522();
                try {
                    c23464M51704.mo8735().m4540(c22422M4522);
                    c23464M51704.mo8719(c19186.mo8718());
                    c23464M51704.m51713();
                    c22422M4522.close();
                    if (m16683(c19186, c23464M51704, iMo2395, jMo8718)) {
                        return;
                    } else {
                        c23464M51704.mo8734();
                    }
                } catch (Throwable th) {
                    try {
                        c22422M4522.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException | Error | RuntimeException e) {
                c23464M51704.close();
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final FutureC12075 m17019() {
        InterfaceC2916 interfaceC2916 = this.f20708;
        if (!(interfaceC2916 instanceof C23464)) {
            return FutureC12075.m30001(null);
        }
        C23464 c23464 = (C23464) interfaceC2916;
        return c23464.m44048().m30031(new RunnableC23316(0, this, c23464), C4716.f16635);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m16671(C6111 c6111, C23464 c23464) {
        while (c6111.f20708 == c23464 && !c6111.f20819) {
            try {
                if (c6111.m16683(c23464, C19186.m44043(c23464), c23464.mo2395(), c23464.mo8718())) {
                    break;
                }
            } catch (IOException e) {
                throw new C17013(e);
            }
        }
        try {
            c23464.mo8734();
        } catch (IOException e2) {
            throw new C17013(e2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m16669(C6111 c6111, C19186 c19186, C19186 c19187) {
        C12919 c12919 = c6111.f20743;
        c19186.mo8721(c6111.f20771);
        c19186.mo8720(c19187.mo8733());
        for (Object obj : c19187.getSpans(0, c19187.length(), Object.class)) {
            if (obj != c12919 && obj != Selection.SELECTION_START && obj != Selection.SELECTION_END) {
                c19186.setSpan(obj, c19187.getSpanStart(obj), c19187.getSpanEnd(obj), c19187.getSpanFlags(obj));
            }
        }
        c19186.setFilters(c19187.getFilters());
        c19186.setSpan(c12919, 0, c19186.length(), 8388626);
        c6111.m16689(c19186);
    }

    /* JADX INFO: renamed from: ۚۖ, reason: not valid java name and contains not printable characters */
    public final void m16911() {
        if (this.f20840) {
            return;
        }
        if (this.f20708.length() != 0 || (this.f20708 instanceof C16408)) {
            throw new IllegalStateException("Memory text mode must be selected before loading text");
        }
        this.f20840 = true;
        m16635((CharSequence) new C19186(""));
        ComponentCallbacks2 componentCallbacks2M22527 = C8703.m22527(getContext());
        if (componentCallbacks2M22527 instanceof InterfaceC1423) {
            ((InterfaceC1423) componentCallbacks2M22527).getLifecycle().mo9171(new C17670(new WeakReference(this)));
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private InterfaceC2916 m16720(CharSequence charSequence) {
        if (!this.f20840 || (charSequence instanceof C19186) || (charSequence instanceof C16408)) {
            return charSequence instanceof InterfaceC2916 ? (InterfaceC2916) charSequence : new C19186(charSequence);
        }
        return new C19186(charSequence);
    }

    /* JADX INFO: renamed from: ۘۨ, reason: not valid java name and contains not printable characters */
    public final int m16842() {
        return this.f20708.length();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16859(C0135 c0135) {
        synchronized (this.f20723) {
            m16739(c0135);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16860(final C0135 c0135, final Runnable runnable) {
        synchronized (this.f20729) {
            this.f20729.addLast(new Runnable() { // from class: l.ۘ᩻ۖ
                @Override // java.lang.Runnable
                public final void run() {
                    C6111.m16662(this.f15394, c0135, runnable);
                }
            });
            if (this.f20802 == null) {
                m16696();
            }
        }
    }

    /* JADX INFO: renamed from: ۛۖ, reason: not valid java name and contains not printable characters */
    private void m16696() {
        C15990 c15990;
        synchronized (this.f20729) {
            this.f20802 = null;
            if (this.f20728 == null && ((c15990 = this.f20748) == null || !c15990.f51770)) {
                Runnable runnable = (Runnable) this.f20729.pollFirst();
                this.f20802 = runnable;
                if (runnable != null) {
                    try {
                        C4716.f16636.submit(runnable);
                    } catch (RuntimeException e) {
                        this.f20729.addFirst(this.f20802);
                        this.f20802 = null;
                        throw e;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m16680(final InterfaceC2916 interfaceC2916, final AbstractC12359 abstractC12359, final AbstractC12359 abstractC123510, final int i) {
        boolean zBooleanValue;
        FutureTask futureTask = new FutureTask(new Callable() { // from class: l.᩵᩻ۖ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C6111.m16650(this.f63554, interfaceC2916, abstractC12359, abstractC123510, i);
            }
        });
        if (Looper.myLooper() == Looper.getMainLooper()) {
            futureTask.run();
        } else {
            C16737.m39273(futureTask);
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
                        throw ((RuntimeException) cause);
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
        return zBooleanValue;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Boolean m16650(C6111 c6111, InterfaceC2916 interfaceC2916, AbstractC12359 abstractC12359, AbstractC12359 abstractC123510, int i) {
        synchronized (c6111.f20761) {
            if (c6111.f20708 == interfaceC2916 && c6111.f20764 == abstractC12359 && abstractC123510.m30759()) {
                c6111.f20808 = i;
                c6111.m16674(abstractC123510, true);
                c6111.f20770.m32661(interfaceC2916);
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m16739(final C0135 c0135) {
        AbstractC12359 abstractC12359;
        if (c0135.f1139 != this.f20794.m17854()) {
            FutureTask futureTask = new FutureTask(new Callable() { // from class: l.ᩳ᩻ۖ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    TextKeyListener textKeyListener = C6111.f20699;
                    C6111 c6111 = this.f58594;
                    c6111.getClass();
                    c6111.m16849(c0135.f1139);
                    return null;
                }
            });
            if (Looper.myLooper() == Looper.getMainLooper()) {
                futureTask.run();
            } else {
                C16737.m39273(futureTask);
            }
            boolean z = false;
            while (true) {
                try {
                    try {
                        futureTask.get();
                        break;
                    } catch (Throwable th) {
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                } catch (InterruptedException unused) {
                    z = true;
                } catch (ExecutionException e) {
                    throw new IllegalStateException("Cannot apply line spacing", e.getCause());
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
        this.f20854.removeMessages(1);
        this.f20718.forceFinished(true);
        this.f20750 = -1.0f;
        this.f20770.m32659();
        m16764();
        this.f20774 = true;
        boolean z2 = c0135.f1138;
        AbstractC12359 abstractC123510 = null;
        if (z2 != c0135.f1147) {
            if (z2) {
                m16857(c0135.f1152, false);
            } else {
                m16857((String) null, false);
            }
        }
        int i = c0135.f1141;
        boolean z3 = (i == c0135.f1154 && c0135.f1149 == c0135.f1153 && (i != 1 || C13638.equals(c0135.f1136, c0135.f1145))) ? false : true;
        boolean z4 = c0135.f1137;
        C1590 c1590 = this.f20794;
        boolean z5 = z4 != c1590.f6388;
        boolean z6 = c0135.f1135 != c1590.m17866();
        boolean z7 = c0135.f1155 != this.f20794.m17878();
        boolean z8 = c0135.f1157;
        C1590 c1591 = this.f20794;
        boolean z9 = z8 != c1591.f6415;
        int i2 = c0135.f1151;
        int i3 = this.f20808;
        boolean z10 = i2 != i3 || (i3 != 0 && z9);
        boolean z11 = c0135.f1143 != c1591.m17881();
        if (!z3 && !z5 && !z6 && !z7 && !z10 && !z11) {
            this.f20774 = false;
            this.f20770.m32620(this.f20708);
            m16728();
            m16793(this.f20826, false);
            return;
        }
        if (z3) {
            C1590 c1592 = this.f20794;
            c1592.m5424(c0135.f1149 * c1592.f22193, c0135.f1141);
            m16633();
        }
        if (z5) {
            this.f20794.f6388 = c0135.f1137;
        }
        if (z6) {
            this.f20794.m17869(c0135.f1135);
        }
        if (z7) {
            this.f20794.m17853(c0135.f1155);
        }
        if (z9) {
            this.f20794.f6415 = c0135.f1157;
        }
        if (z11) {
            this.f20794.m17861(c0135.f1143);
        }
        if (z3 || z6 || z7 || z10 || z11 || (z5 && c0135.f1151 != 0)) {
            int i4 = c0135.f1151;
            for (int i5 = 0; i5 < 2; i5++) {
                InterfaceC2916 interfaceC2916 = this.f20708;
                interfaceC2916.setReadOnly(true);
                try {
                    AbstractC12359 abstractC123511 = this.f20764;
                    abstractC123511.mo14797();
                    AbstractC12359 abstractC12359M30713 = AbstractC12359.m30713(this, interfaceC2916, this.f20794, i4);
                    if (!m16680(interfaceC2916, abstractC123511, abstractC12359M30713, i4)) {
                        abstractC12359M30713.mo14797();
                        interfaceC2916.setReadOnly(false);
                    } else {
                        interfaceC2916.setReadOnly(false);
                        abstractC123510 = abstractC12359M30713;
                        break;
                    }
                } catch (Throwable th2) {
                    interfaceC2916.setReadOnly(false);
                    throw th2;
                }
            }
            abstractC12359 = abstractC123510;
        } else {
            abstractC12359 = this.f20764;
        }
        if (abstractC12359 == null && m16809()) {
            this.f20808 = c0135.f1151;
        }
        if (abstractC12359 instanceof C5325) {
            final C5325 c5325 = (C5325) abstractC12359;
            post(new Runnable() { // from class: l.ᩴ᩻ۖ
                @Override // java.lang.Runnable
                public final void run() {
                    TextKeyListener textKeyListener = C6111.f20699;
                    C6111 c6111 = this.f61667;
                    int iM16978 = c6111.m16978();
                    AbstractC12359 abstractC123512 = c6111.f20764;
                    C5325 c5326 = c5325;
                    if (abstractC123512 != c5326 || iM16978 <= 0 || c5326.mo14790() == iM16978) {
                        return;
                    }
                    c5326.mo14805(iM16978);
                }
            });
        }
        this.f20774 = false;
        this.f20770.m32620(this.f20708);
        m16728();
        m16793(this.f20826, false);
    }

    /* JADX INFO: renamed from: ֡ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m16809() {
        C18105 c18105 = this.f20728;
        return c18105 != null && c18105.f57897 == this.f20708;
    }

    /* JADX INFO: renamed from: ܽܰ, reason: not valid java name and contains not printable characters */
    public final boolean m17018() {
        C18105 c18105 = this.f20728;
        return c18105 != null && c18105.f57913 != null && c18105.f57913.f53481 && this.f20764 == c18105.f57913.f53482 && c18105.m42169(this.f20764) && this.f20764.mo14782(new C16592(getScrollX(), this.f20826, m16978(), m16814())) > 0;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m16995(AbstractC12359 abstractC12359) {
        C18105 c18105 = this.f20728;
        if (m16964(abstractC12359)) {
            return true;
        }
        return c18105 != null && c18105.m42169(abstractC12359);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m16910(AbstractC12359 abstractC12359) {
        C18105 c18105 = this.f20728;
        C20928 c20928 = this.f20765;
        if (c20928 == null || c20928.f67995 == null || c20928.f67995.f53482 != abstractC12359) {
            return (c18105 == null || c18105.f57913 == null || c18105.f57913.f53482 != abstractC12359) ? false : true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c4, code lost:
    
        if (r0 == false) goto L67;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m16888(int r11, int r12, int r13, int r14) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6111.m16888(int, int, int, int):boolean");
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m16637(C6111 c6111) {
        c6111.f20720 = false;
        if (c6111.f20787) {
            return;
        }
        c6111.f20772 = 0L;
    }

    /* JADX INFO: renamed from: ۙܰ, reason: not valid java name and contains not printable characters */
    public static void m16687(C6111 c6111) {
        synchronized (c6111.f20729) {
            if (c6111.f20802 == null) {
                c6111.m16696();
            }
        }
    }

    /* JADX INFO: renamed from: ֨ۨ, reason: not valid java name and contains not printable characters */
    public final C18811 m16815() {
        return m16811(this.f20808);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C18811 m16811(int i) {
        C18811 c18811;
        synchronized (this.f20794) {
            Typeface typeface = this.f20794.f22196.getTypeface();
            float textSize = this.f20794.f22196.getTextSize();
            float textScaleX = this.f20794.f22196.getTextScaleX();
            float textSkewX = this.f20794.f22196.getTextSkewX();
            int iM17881 = this.f20794.m17881();
            boolean zM17866 = this.f20794.m17866();
            boolean zM17878 = this.f20794.m17878();
            boolean z = i != 0 && this.f20794.f6388;
            C1590 c1590 = this.f20794;
            c18811 = new C18811(typeface, textSize, textScaleX, textSkewX, iM17881, zM17866, zM17878, z, c1590.f6381, c1590.f6422, c1590.f6415, i, this.f20770.m32616());
        }
        return c18811;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܺۖ, reason: not valid java name and contains not printable characters */
    public void m16764() {
        C12462 c12462 = new C12462();
        c12462.f41543 = -1;
        c12462.f41549 = -1L;
        this.f20740 = c12462;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m16922(boolean z) {
        if (z) {
            m16764();
        }
        this.f20715 = z;
        if (z) {
            this.f20770.m32659();
        } else {
            this.f20740 = null;
            this.f20770.m32645(this.f20708);
        }
        postInvalidate();
        if (z) {
            return;
        }
        m16728();
    }

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final void m16998() {
        this.f20715 = false;
        this.f20770.m32620(this.f20708);
        m16793(this.f20826, false);
        postInvalidate();
        m16728();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence m16845(CharSequence charSequence, InterfaceC5614 interfaceC5614) {
        try {
            return m16735((AbstractC20745) null, interfaceC5614, charSequence);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16883(AbstractC20745 abstractC20745, CharSequence charSequence) {
        m16846(abstractC20745, new C7087(), charSequence);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence m16846(AbstractC20745 abstractC20745, InterfaceC5614 interfaceC5614, CharSequence charSequence) {
        if (this.f20819 || interfaceC5614.mo2357()) {
            return charSequence;
        }
        if (!this.f20819 && abstractC20745 != null) {
            InterfaceC2916 interfaceC2916 = this.f20708;
            if ((interfaceC2916 instanceof C23464) && ((C23464) interfaceC2916).m51711(abstractC20745)) {
                m17019().m30027();
            }
        }
        return m16735(abstractC20745, interfaceC5614, charSequence);
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
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private CharSequence m16735(AbstractC20745 abstractC20745, InterfaceC5614 interfaceC5614, CharSequence charSequence) {
        C20928 c20928;
        int iMo8733;
        C23464 c23464M51704;
        InterfaceC2916 interfaceC2916;
        InterfaceC2916 interfaceC2917;
        InterfaceC2916 interfaceC2918;
        InterfaceC2916 interfaceC2919;
        int length;
        InterfaceC2916 interfaceC2916M16720;
        C16408 c16408;
        if (this.f20819 || interfaceC5614.mo2357()) {
            return charSequence;
        }
        synchronized (this.f20761) {
            this.f20760 = false;
            m16764();
            this.f20774 = true;
            this.f20721++;
            this.f20779 = true;
        }
        postInvalidate();
        this.f20770.m32659();
        try {
            if (!this.f20764.mo14788()) {
                while (getWidth() <= 0) {
                    if (!this.f20760 && !this.f20819 && !interfaceC5614.mo2357()) {
                        SystemClock.sleep(10L);
                    }
                }
                if (!this.f20760 && !this.f20819 && !interfaceC5614.mo2357()) {
                    if (charSequence == null) {
                        charSequence = "";
                    }
                    c20928 = this.f20765;
                    if (c20928 != null && (charSequence != c20928.f67992 || this.f20764 != c20928.f67987)) {
                        throw new IllegalStateException("Session layout preparation was superseded");
                    }
                    if (charSequence instanceof C16408) {
                        c16408 = (C16408) charSequence;
                        if (c20928 != null || c20928.f67989.f40748 == null) {
                            this.f20794.f6419 = c16408.mo8735().m4556().m23301();
                        }
                    } else {
                        this.f20794.f6419 = C1590.m5422(charSequence);
                        charSequence = C1590.m5421(charSequence);
                    }
                    iMo8733 = this.f20708.mo8733();
                    if (abstractC20745 == null) {
                        c23464M51704 = C23464.m51704(abstractC20745);
                        try {
                            c23464M51704.replace(0, c23464M51704.length(), charSequence);
                            c23464M51704.mo8735().m4558();
                            c23464M51704.mo8728(false);
                            c23464M51704.m51713();
                            interfaceC2916 = c23464M51704;
                        } catch (Error | RuntimeException e) {
                            c23464M51704.close();
                            throw e;
                        }
                    } else {
                        interfaceC2916M16720 = m16720(charSequence);
                    }
                    if (abstractC20745 == null && (this.f20760 || this.f20819 || interfaceC5614.mo2357())) {
                        interfaceC2916 = interfaceC2916M16720;
                        interfaceC2916 = interfaceC2916M16720;
                        interfaceC2916 = interfaceC2916M16720;
                        ((C23464) interfaceC2916).close();
                    } else {
                        interfaceC2916 = interfaceC2916M16720;
                        interfaceC2916 = interfaceC2916M16720;
                        interfaceC2917 = this.f20708;
                        m16689(interfaceC2916);
                        if (interfaceC2917 != interfaceC2916) {
                            m16636(interfaceC2917);
                        }
                        this.f20825.m31931(this.f20708);
                        this.f20770.m32657();
                        this.f20710.m3658();
                        this.f20708.mo8721(this.f20771);
                        this.f20708.mo8720(iMo8733);
                        InterfaceC2916 interfaceC29110 = this.f20708;
                        interfaceC29110.setSpan(this.f20743, 0, interfaceC29110.length(), 8388626);
                        interfaceC2918 = this.f20708;
                        if (!(interfaceC2918 instanceof C16408)) {
                            interfaceC2918.setSelection(0);
                        }
                        this.f20750 = -1.0f;
                        m16770();
                        if (!this.f20760 && !this.f20819 && !interfaceC5614.mo2357()) {
                            if (this.f20770.m32663()) {
                                this.f20770.m32651((CharSequence) this.f20708);
                                this.f20770.m32617(this.f20708);
                            }
                            if (!this.f20794.f6398 && this.f20770.m32642()) {
                                this.f20710.m3667(this.f20770.m32643());
                            } else {
                                this.f20710.m3667(C0923.f3694);
                            }
                            if (!this.f20760 && !this.f20819 && !interfaceC5614.mo2357()) {
                                if (c20928 != null) {
                                    c20928.f67993 = this.f20708.mo2395();
                                }
                                this.f20764.mo14798(this.f20708);
                                m17034();
                                interfaceC2919 = this.f20708;
                                if (!(interfaceC2919 instanceof C16408)) {
                                    interfaceC2919.mo8728(true);
                                }
                                this.f20846 = -1;
                                if (c20928 != null || !c20928.f67989.m30276()) {
                                    length = this.f20708.length();
                                    int i = SharedPreferencesOnSharedPreferenceChangeListenerC15618.f50785;
                                    if (length > C16737.f53615.getInt("smooth_mode_threshold", 200000)) {
                                        this.f20702 = true;
                                    }
                                }
                                if (c20928 == null) {
                                    m16793(Math.max(0, 0), true);
                                }
                                if (c20928 != null && !this.f20760 && !this.f20819 && !interfaceC5614.mo2357()) {
                                    c20928.f67997 = true;
                                }
                                this.f20774 = false;
                                m16767();
                                m16728();
                                if (!this.f20760) {
                                    postInvalidate();
                                }
                                return charSequence;
                            }
                        }
                    }
                }
            } else if (!this.f20760) {
                if (charSequence == null) {
                    charSequence = "";
                }
                c20928 = this.f20765;
                if (c20928 != null) {
                    throw new IllegalStateException("Session layout preparation was superseded");
                }
                if (charSequence instanceof C16408) {
                    c16408 = (C16408) charSequence;
                    if (c20928 != null) {
                        this.f20794.f6419 = c16408.mo8735().m4556().m23301();
                    } else {
                        this.f20794.f6419 = c16408.mo8735().m4556().m23301();
                    }
                } else {
                    this.f20794.f6419 = C1590.m5422(charSequence);
                    charSequence = C1590.m5421(charSequence);
                }
                iMo8733 = this.f20708.mo8733();
                if (abstractC20745 == null) {
                    c23464M51704 = C23464.m51704(abstractC20745);
                    c23464M51704.replace(0, c23464M51704.length(), charSequence);
                    c23464M51704.mo8735().m4558();
                    c23464M51704.mo8728(false);
                    c23464M51704.m51713();
                    interfaceC2916 = c23464M51704;
                } else {
                    interfaceC2916M16720 = m16720(charSequence);
                }
                if (abstractC20745 == null) {
                    interfaceC2916 = interfaceC2916M16720;
                    interfaceC2916 = interfaceC2916M16720;
                    interfaceC2917 = this.f20708;
                    m16689(interfaceC2916);
                    if (interfaceC2917 != interfaceC2916) {
                        m16636(interfaceC2917);
                    }
                    this.f20825.m31931(this.f20708);
                    this.f20770.m32657();
                    this.f20710.m3658();
                    this.f20708.mo8721(this.f20771);
                    this.f20708.mo8720(iMo8733);
                    InterfaceC2916 interfaceC29111 = this.f20708;
                    interfaceC29111.setSpan(this.f20743, 0, interfaceC29111.length(), 8388626);
                    interfaceC2918 = this.f20708;
                    if (!(interfaceC2918 instanceof C16408)) {
                        interfaceC2918.setSelection(0);
                    }
                    this.f20750 = -1.0f;
                    m16770();
                    if (!this.f20760) {
                        if (this.f20770.m32663()) {
                            this.f20770.m32651((CharSequence) this.f20708);
                            this.f20770.m32617(this.f20708);
                        }
                        if (!this.f20794.f6398) {
                            this.f20710.m3667(C0923.f3694);
                        } else {
                            this.f20710.m3667(C0923.f3694);
                        }
                        if (!this.f20760) {
                            if (c20928 != null) {
                                c20928.f67993 = this.f20708.mo2395();
                            }
                            this.f20764.mo14798(this.f20708);
                            m17034();
                            interfaceC2919 = this.f20708;
                            if (!(interfaceC2919 instanceof C16408)) {
                                interfaceC2919.mo8728(true);
                            }
                            this.f20846 = -1;
                            if (c20928 != null) {
                                length = this.f20708.length();
                                int i2 = SharedPreferencesOnSharedPreferenceChangeListenerC15618.f50785;
                                if (length > C16737.f53615.getInt("smooth_mode_threshold", 200000)) {
                                    this.f20702 = true;
                                }
                            } else {
                                length = this.f20708.length();
                                int i3 = SharedPreferencesOnSharedPreferenceChangeListenerC15618.f50785;
                                if (length > C16737.f53615.getInt("smooth_mode_threshold", 200000)) {
                                    this.f20702 = true;
                                }
                            }
                            if (c20928 == null) {
                                m16793(Math.max(0, 0), true);
                            }
                            if (c20928 != null) {
                                c20928.f67997 = true;
                            }
                            this.f20774 = false;
                            m16767();
                            m16728();
                            if (!this.f20760) {
                                postInvalidate();
                            }
                            return charSequence;
                        }
                    }
                } else {
                    interfaceC2916 = interfaceC2916M16720;
                    interfaceC2916 = interfaceC2916M16720;
                    interfaceC2917 = this.f20708;
                    m16689(interfaceC2916);
                    if (interfaceC2917 != interfaceC2916) {
                        m16636(interfaceC2917);
                    }
                    this.f20825.m31931(this.f20708);
                    this.f20770.m32657();
                    this.f20710.m3658();
                    this.f20708.mo8721(this.f20771);
                    this.f20708.mo8720(iMo8733);
                    InterfaceC2916 interfaceC29112 = this.f20708;
                    interfaceC29112.setSpan(this.f20743, 0, interfaceC29112.length(), 8388626);
                    interfaceC2918 = this.f20708;
                    if (!(interfaceC2918 instanceof C16408)) {
                        interfaceC2918.setSelection(0);
                    }
                    this.f20750 = -1.0f;
                    m16770();
                    if (!this.f20760) {
                        if (this.f20770.m32663()) {
                            this.f20770.m32651((CharSequence) this.f20708);
                            this.f20770.m32617(this.f20708);
                        }
                        if (!this.f20794.f6398) {
                            this.f20710.m3667(C0923.f3694);
                        } else {
                            this.f20710.m3667(C0923.f3694);
                        }
                        if (!this.f20760) {
                            if (c20928 != null) {
                                c20928.f67993 = this.f20708.mo2395();
                            }
                            this.f20764.mo14798(this.f20708);
                            m17034();
                            interfaceC2919 = this.f20708;
                            if (!(interfaceC2919 instanceof C16408)) {
                                interfaceC2919.mo8728(true);
                            }
                            this.f20846 = -1;
                            if (c20928 != null) {
                                length = this.f20708.length();
                                int i4 = SharedPreferencesOnSharedPreferenceChangeListenerC15618.f50785;
                                if (length > C16737.f53615.getInt("smooth_mode_threshold", 200000)) {
                                    this.f20702 = true;
                                }
                            } else {
                                length = this.f20708.length();
                                int i5 = SharedPreferencesOnSharedPreferenceChangeListenerC15618.f50785;
                                if (length > C16737.f53615.getInt("smooth_mode_threshold", 200000)) {
                                    this.f20702 = true;
                                }
                            }
                            if (c20928 == null) {
                                m16793(Math.max(0, 0), true);
                            }
                            if (c20928 != null) {
                                c20928.f67997 = true;
                            }
                            this.f20774 = false;
                            m16767();
                            m16728();
                            if (!this.f20760) {
                                postInvalidate();
                            }
                            return charSequence;
                        }
                    }
                }
            }
            this.f20740 = null;
            this.f20779 = false;
            this.f20770.m32627();
            this.f20774 = false;
            m16767();
            m16728();
            return charSequence;
        } catch (Throwable th) {
            this.f20740 = null;
            this.f20779 = false;
            this.f20770.m32627();
            this.f20774 = false;
            m16767();
            m16728();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m16793(int i, boolean z) {
        if (Looper.myLooper() != Looper.getMainLooper() && this.f20794.f6398 && this.f20770.m32642()) {
            if (z || !(this.f20774 || this.f20715 || this.f20725)) {
                InterfaceC2916 interfaceC2916 = this.f20708;
                AbstractC12359 abstractC12359 = this.f20764;
                long j = this.f20721;
                while (abstractC12359.mo14804()) {
                    try {
                        if (interfaceC2916 != this.f20708 || j != this.f20721) {
                            return;
                        }
                        if (z && this.f20760) {
                            return;
                        } else {
                            Thread.sleep(10L);
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
                synchronized (this.f20761) {
                    if (interfaceC2916 == this.f20708 && abstractC12359 == this.f20764 && abstractC12359.f41297 == interfaceC2916 && j == this.f20721 && !abstractC12359.mo14804() && ((!z || !this.f20760) && (z || (!this.f20774 && !this.f20715 && !this.f20725)))) {
                        int iM16814 = m16814();
                        long jMo14796 = (!z || interfaceC2916.length() <= 1000000 || iM16814 <= 0) ? 0L : abstractC12359.mo14796(i, iM16814);
                        this.f20770.m32633(interfaceC2916, (int) (jMo14796 >>> 32), (int) jMo14796);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public final String m17042() {
        return this.f20794.f6419;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m16825(String str) {
        this.f20794.f6419 = str;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m17045() {
        m16688("Session text preparation was canceled");
        this.f20740 = null;
        this.f20760 = true;
        this.f20779 = false;
        this.f20770.m32627();
        this.f20764.f41288 = true;
        this.f20764.f41325 = true;
        C18105 c18105 = this.f20728;
        if (c18105 != null) {
            c18105.f57902 = true;
            RunnableC6672 runnableC6672 = new RunnableC6672(1, c18105);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                runnableC6672.run();
            } else {
                C16737.m39273(runnableC6672);
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final FutureC12075 m16957(InterfaceC2916 interfaceC2916) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Initial highlight readiness requires the foreground thread");
        }
        AbstractC12359 abstractC12359 = this.f20764;
        int iMo2395 = interfaceC2916.mo2395();
        long jUptimeMillis = SystemClock.uptimeMillis() + 500;
        FutureC12075 futureC12075 = new FutureC12075();
        new RunnableC6381(this, futureC12075, interfaceC2916, abstractC12359, iMo2395, jUptimeMillis).run();
        return futureC12075;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final FutureC12075 m16982(C16408 c16408, C15990 c15990) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Session readiness requires the foreground thread");
        }
        FutureC12075 futureC12075 = new FutureC12075();
        C16737.m39273(new RunnableC11321(this, futureC12075, c15990, c16408));
        return futureC12075;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private C15990 m16714(boolean z) {
        C15990 c15990;
        synchronized (this.f20729) {
            if (this.f20748 != null) {
                throw new IllegalStateException("Session task is already active");
            }
            c15990 = new C15990(z);
            this.f20748 = c15990;
        }
        return c15990;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C15990 m16810() {
        C15990 c15990M16714;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Session preparation requires the main thread");
        }
        synchronized (this.f20729) {
            if (this.f20748 != null || this.f20802 != null || !this.f20729.isEmpty() || !m16831() || m16973() || this.f20796 != null || this.f20708.mo8725()) {
                throw new IllegalStateException("View is busy before session preparation");
            }
            c15990M16714 = m16714(true);
            m16922(true);
        }
        return c15990M16714;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15990 m16847(C16408 c16408) {
        if (Looper.myLooper() != Looper.getMainLooper() || this.f20708 != c16408) {
            throw new IllegalStateException("Session close requires its foreground owner");
        }
        return m16714(false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m16899(C16408 c16408, C15990 c15990) {
        if (Looper.myLooper() != Looper.getMainLooper() || this.f20708 != c16408 || c15990 == null || c15990 != this.f20748) {
            throw new IllegalStateException("Session close requires its foreground task");
        }
        if (!c16408.m38634()) {
            return false;
        }
        synchronized (this.f20729) {
            if (this.f20802 == null && this.f20729.isEmpty() && !this.f20774 && !this.f20779 && !this.f20725 && this.f20796 == null && !m16973() && !this.f20708.mo8725()) {
                c15990.f51770 = true;
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16877(C15990 c15990) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Session preparation requires the main thread");
        }
        synchronized (this.f20729) {
            if (c15990 != null) {
                if (c15990 == this.f20748) {
                    m16747(c15990);
                    this.f20748 = null;
                    m16696();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16861(InterfaceC2916 interfaceC2916) {
        if (Looper.myLooper() != Looper.getMainLooper() || this.f20774 || m16973()) {
            throw new IllegalStateException("Session preparation is still reading the view");
        }
        if (this.f20708 != interfaceC2916) {
            return;
        }
        InterfaceC8228 interfaceC8228 = this.f20726;
        this.f20726 = null;
        try {
            mo16989("");
        } finally {
            this.f20726 = interfaceC8228;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 13111. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m16652(android.graphics.Canvas r23) {
        /*
            Method dump skipped, instruction units count: 1311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6111.m16652(android.graphics.Canvas):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16848() {
        this.f20740 = null;
        if (this.f20779) {
            this.f20779 = false;
            RunnableC13438 runnableC13438 = new RunnableC13438(0, this, this.f20708);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                runnableC13438.run();
            } else {
                post(runnableC13438);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m16664(C6111 c6111, InterfaceC2916 interfaceC2916) {
        if (c6111.f20708 == interfaceC2916 && c6111.m16968()) {
            c6111.requestLayout();
            c6111.invalidate();
            c6111.f20825.m31939(interfaceC2916);
            c6111.f20770.m32620(interfaceC2916);
            c6111.m16728();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void mo16989(CharSequence charSequence) {
        m16635(charSequence);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m16635(CharSequence charSequence) {
        this.f20740 = null;
        this.f20779 = false;
        if (charSequence == null) {
            charSequence = "";
        }
        if (charSequence instanceof C16408) {
            this.f20794.f6419 = ((C16408) charSequence).mo8735().m4556().m23301();
        } else {
            this.f20794.f6419 = C1590.m5422(charSequence);
            charSequence = C1590.m5421(charSequence);
        }
        int iMo8733 = this.f20708.mo8733();
        InterfaceC2916 interfaceC2916M16720 = m16720(charSequence);
        InterfaceC2916 interfaceC2916 = this.f20708;
        m16689(interfaceC2916M16720);
        this.f20825.m31931(this.f20708);
        this.f20770.m32657();
        this.f20710.m3658();
        if (interfaceC2916 != interfaceC2916M16720) {
            interfaceC2916.mo8723(false);
        }
        this.f20708.mo8721(this.f20771);
        this.f20708.mo8720(iMo8733);
        InterfaceC2916 interfaceC2917 = this.f20708;
        interfaceC2917.setSpan(this.f20743, 0, interfaceC2917.length(), 8388626);
        InterfaceC2916 interfaceC2918 = this.f20708;
        if (!(interfaceC2918 instanceof C16408)) {
            interfaceC2918.mo8735().m4558();
        }
        if (this.f20770.m32663()) {
            this.f20770.m32651((CharSequence) this.f20708);
        }
        if (this.f20794.f6398 && this.f20770.m32642()) {
            this.f20710.m3667(this.f20770.m32643());
        } else {
            this.f20710.m3667(C0923.f3694);
        }
        this.f20764.mo14798(this.f20708);
        m16767();
        this.f20825.m31939(this.f20708);
        m17063();
        m17034();
        InterfaceC2916 interfaceC2919 = this.f20708;
        if (!(interfaceC2919 instanceof C16408)) {
            m17057(false);
            this.f20708.setSelection(0);
        } else {
            InterfaceC8228 interfaceC8228 = this.f20726;
            if (interfaceC8228 != null) {
                interfaceC8228.mo3560(((C16408) interfaceC2919).isChanged());
            }
        }
        this.f20750 = -1.0f;
        m16770();
        if (!isInEditMode()) {
            int length = this.f20708.length();
            int i = SharedPreferencesOnSharedPreferenceChangeListenerC15618.f50785;
            if (length > C16737.f53615.getInt("smooth_mode_threshold", 200000)) {
                this.f20702 = true;
            }
        }
        requestLayout();
        invalidate();
    }

    /* JADX INFO: renamed from: ܰۖ, reason: not valid java name and contains not printable characters */
    public final void m16997() {
        this.f20738 = true;
        this.f20719.incrementAndGet();
        C22339 c22339 = this.f20714;
        if (c22339 != null) {
            c22339.f72927 = 0;
            c22339.f72926 = false;
            c22339.f72928 = false;
            c22339.f72929 = -1;
            c22339.f72930 = -1;
        }
        this.f20799 = 0;
        this.f20847 = 0;
    }

    /* JADX INFO: renamed from: ۫ۨ, reason: not valid java name and contains not printable characters */
    public final void m16972() {
        this.f20738 = false;
        if (!isFocused() || m17004()) {
            return;
        }
        if (C13890.m33728()) {
            m17017();
        } else {
            C16737.m39273(new RunnableC1442(0, this));
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m16828(int i) {
        return i == this.f20719.get() && !this.f20738;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m16908(int i) {
        return m16828(i) && !m17004() && m16709();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m17049() {
        this.f20764.mo14798(this.f20708);
        m16767();
        this.f20750 = -1.0f;
        m16770();
        requestLayout();
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        if (this.f20794.f6433 || this.f20738) {
            return null;
        }
        if (this.f20714 == null) {
            C22339 c22339 = new C22339();
            new ExtractedText();
            this.f20714 = c22339;
        }
        editorInfo.imeOptions = mo16933();
        editorInfo.inputType = mo17038();
        C20079 c20079 = new C20079(this, this.f20719.get());
        this.f20716.add(c20079);
        return new InputConnectionC0322(c20079);
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m17065(boolean z) {
        C1590 c1590 = this.f20794;
        if (c1590.f6433 != z) {
            c1590.f6433 = z;
            if (z) {
                m17028();
            } else {
                m17017();
            }
            InterfaceC8228 interfaceC8228 = this.f20726;
            if (interfaceC8228 != null) {
                interfaceC8228.mo3561(m16938(), m17037());
            }
        }
    }

    /* JADX INFO: renamed from: ܳܰ, reason: not valid java name and contains not printable characters */
    public final boolean m17004() {
        return this.f20794.f6433 || this.f20741 == this.f20708;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16885(C23565 c23565) {
        this.f20851 = c23565;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m16894(final InterfaceC2916 interfaceC2916, final RuntimeException runtimeException) {
        if (!(interfaceC2916 instanceof C16408)) {
            return false;
        }
        C16408 c16408 = (C16408) interfaceC2916;
        if (!(runtimeException instanceof UncheckedIOException) && !(runtimeException instanceof C18188)) {
            return false;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            C16737.m39273(new Runnable() { // from class: l.ܽ᩻ۖ
                @Override // java.lang.Runnable
                public final void run() {
                    TextKeyListener textKeyListener = C6111.f20699;
                    this.f54296.m16894(interfaceC2916, runtimeException);
                }
            });
            return true;
        }
        if (this.f20708 == interfaceC2916 && this.f20741 != interfaceC2916) {
            this.f20741 = c16408;
            this.f20814 = runtimeException;
            m16997();
            this.f20825.m31933();
            this.f20770.m32659();
            invalidate();
            C16737.m39273(new RunnableC22796(this, interfaceC2916, c16408, runtimeException, 1));
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m16665(C6111 c6111, InterfaceC2916 interfaceC2916, C16408 c16408, RuntimeException runtimeException) {
        InterfaceC8934 interfaceC8934;
        if (c6111.f20708 == interfaceC2916 && c6111.f20741 == interfaceC2916 && (interfaceC8934 = c6111.f20851) != null) {
            C20409.m46080((C20409) ((C23565) interfaceC8934).f76321, c16408, runtimeException);
        }
    }

    /* JADX INFO: renamed from: ܿۨ, reason: not valid java name and contains not printable characters */
    public final void m17021() {
        C1590 c1590 = this.f20794;
        if (!c1590.f6373) {
            c1590.f6373 = true;
            if (m17004()) {
                invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m17035(int i) {
        this.f20794.m17861(i);
        this.f20750 = -1.0f;
    }

    /* JADX INFO: renamed from: ۙܰ, reason: not valid java name and contains not printable characters */
    public final int m16904() {
        return this.f20794.m17881();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m17024(boolean z) {
        C1590 c1590 = this.f20794;
        if (c1590.m17876() != z) {
            c1590.m17862(z);
            postInvalidate();
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m16977(boolean z) {
        C1590 c1590 = this.f20794;
        if (c1590.m17877() != z) {
            c1590.m17874(z);
            postInvalidate();
        }
    }

    /* JADX INFO: renamed from: ܿܰ, reason: not valid java name and contains not printable characters */
    public boolean mo17022() {
        return this.f20794.f6399;
    }

    /* JADX INFO: renamed from: ֡ۨ, reason: not valid java name and contains not printable characters */
    public final void m16808() {
        this.f20750 = -1.0f;
    }

    /* JADX INFO: renamed from: ۨܰ, reason: not valid java name and contains not printable characters */
    public static void m16726(C6111 c6111) {
        c6111.f20758 = true;
        c6111.f20767 = false;
        if (!c6111.isFocused()) {
            c6111.requestFocus();
            c6111.invalidate();
        }
        c6111.m16915();
    }

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public static void m16784(C6111 c6111) {
        c6111.f20758 = false;
        c6111.f20767 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean m16693(float f, float f2) {
        return f >= ((float) getPaddingLeft()) && f <= ((float) (getWidth() - getPaddingRight())) && f2 >= ((float) getPaddingTop()) && f2 <= ((float) (getHeight() - getPaddingBottom()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public void m16721(MotionEvent motionEvent) {
        if (m16973()) {
            return;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (m16693(x, y)) {
            int iM30730 = this.f20764.m30730((getScrollX() + x) - getPaddingLeft(), (this.f20826 + y) - getPaddingTop());
            int iM16916 = m16916();
            int iM17020 = m17020();
            int iMin = Math.min(iM16916, iM17020);
            int iMax = Math.max(iM16916, iM17020);
            if (iMin == iMax || iMin > iM30730 || iM30730 > iMax) {
                mo17029(iM30730);
            }
            this.f20844 = SystemClock.uptimeMillis();
            m16835();
            if (m16751((int[]) null)) {
                this.f20831.m8668((int) x, (int) y);
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
        if (!m16809()) {
            if (Build.VERSION.SDK_INT < 23 || !m16750(motionEvent) || (((actionMasked = motionEvent.getActionMasked()) != 11 && actionMasked != 12) || motionEvent.getActionButton() != 2)) {
                boolean z = (motionEvent.getMetaState() & 4096) != 0;
                if ((motionEvent.getSource() & 2) == 0 && motionEvent.getAction() == 8) {
                    m16699();
                    float fM17012 = 0.0f;
                    if (z) {
                        float axisValue = (motionEvent.getAxisValue(9) / 20.0f) + 1.0f;
                        float textSize = this.f20794.f22196.getTextSize();
                        if (this.f20794.m5431(axisValue * textSize)) {
                            float textSize2 = this.f20794.f22196.getTextSize() / textSize;
                            this.f20764.mo14783(textSize);
                            if (this.f20764.mo14788()) {
                                float x = motionEvent.getX();
                                scrollX = ((getScrollX() + x) * textSize2) - x;
                                if (scrollX < 0.0f) {
                                    scrollX = 0.0f;
                                } else {
                                    float fM17046 = m17046();
                                    if (scrollX > fM17046) {
                                        scrollX = fM17046;
                                    }
                                }
                            } else {
                                scrollX = 0.0f;
                            }
                            float y = motionEvent.getY();
                            float f = ((this.f20826 + y) * textSize2) - y;
                            if (f >= 0.0f) {
                                fM17012 = m17012();
                                if (f <= fM17012) {
                                    fM17012 = f;
                                }
                            }
                            m16651((int) scrollX, (int) fM17012, true);
                            invalidate();
                            this.f20854.removeMessages(7);
                            this.f20854.sendEmptyMessageDelayed(7, 200L);
                            return true;
                        }
                    } else {
                        float axisValue2 = this.f20764.mo14788() ? motionEvent.getAxisValue(10) : 0.0f;
                        float axisValue3 = motionEvent.getAxisValue(9);
                        m16651(m16974((int) ((this.f20794.m17864() * axisValue2) + getScrollX())), m16837((int) (this.f20826 - (this.f20794.m17870() * axisValue3))), true);
                        if (axisValue2 != 0.0f) {
                            m17003();
                        }
                        if (axisValue3 != 0.0f) {
                            m16944();
                        }
                    }
                } else {
                    return super.onGenericMotionEvent(motionEvent);
                }
            } else if (actionMasked == 11) {
                if (!this.f20758) {
                    this.f20758 = true;
                    this.f20767 = false;
                    if (!isFocused()) {
                        requestFocus();
                        invalidate();
                    }
                    m16915();
                    m16721(motionEvent);
                    return true;
                }
            } else if (actionMasked == 12) {
                if (this.f20758 && !this.f20767) {
                    this.f20758 = false;
                    this.f20767 = false;
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
            this.f20728.m42164((int) (motionEvent.getAxisValue(10) * this.f20794.m17864()), (int) (motionEvent.getAxisValue(9) * (-this.f20794.m17870())));
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
        throw new UnsupportedOperationException("Method not decompiled: l.C6111.onResolvePointerIcon(android.view.MotionEvent, int):android.view.PointerIcon");
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int i;
        if (m16750(motionEvent)) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 10) {
                m16646();
            } else if (actionMasked == 9 || actionMasked == 7) {
                this.f20801 = motionEvent.getX();
                float y = motionEvent.getY();
                this.f20841 = y;
                int iM16792 = m16792(this.f20801, y);
                int i2 = iM16792 & 1;
                boolean z = i2 != 0 && m16779() > 0.0f;
                int i3 = iM16792 & 2;
                boolean z2 = i3 != 0 && m16706() > 0.0f;
                if (z && z2) {
                    if (this.f20803 >= this.f20830) {
                        z = false;
                    } else {
                        z2 = false;
                    }
                }
                this.f20827 = z;
                this.f20754 = z2;
                if (z) {
                    m16787();
                }
                if (this.f20754) {
                    m16703();
                }
                if (iM16792 == 0) {
                    m16699();
                }
                if (i3 != 0) {
                    i = 2;
                } else {
                    i = i2 != 0 ? 1 : 0;
                }
                if (i == 0 || (i != 1 ? !(i != 2 || m16706() <= 0.0f) : m16779() > 0.0f)) {
                    m16699();
                } else if (this.f20853 != i) {
                    this.f20853 = i;
                    HandlerC9910 handlerC9910 = this.f20854;
                    handlerC9910.removeMessages(8);
                    handlerC9910.sendEmptyMessageDelayed(8, 300L);
                }
            }
        }
        return m16750(motionEvent) || super.onHoverEvent(motionEvent);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private int m16792(float f, float f2) {
        int i = 0;
        if (!m16809() && !this.f20715 && !this.f20774 && !this.f20764.f41308.isEmpty()) {
            int iM16978 = m16978();
            int iM16814 = m16814();
            int scrollX = getScrollX();
            int i2 = this.f20826;
            if (m16678(this.f20804, scrollX, i2, iM16978, iM16814)) {
                float paddingLeft = (f + scrollX) - getPaddingLeft();
                float paddingTop = f2 - getPaddingTop();
                AbstractC12359 abstractC12359 = this.f20764;
                Rect rect = this.f20804;
                int i3 = rect.left;
                int i4 = rect.top - i2;
                int iWidth = rect.width();
                int iHeight = this.f20804.height();
                C1590 c1590 = abstractC12359.f41286;
                int iMo17052 = abstractC12359.f41314.mo17052();
                int i5 = iM16814 + iMo17052;
                if (iM16978 > 0 && iM16814 > 0 && i5 > 0 && iWidth > 0 && iHeight > 0) {
                    int i6 = iWidth + i3;
                    int i7 = iHeight + i4 + iMo17052;
                    double dM30743 = abstractC12359.m30743();
                    if (dM30743 > 0.0d) {
                        double d = i5;
                        if (dM30743 - d > 0.0d && c1590.f6391 && dM30743 / d > 3.0d && (!c1590.f6381 ? !(paddingLeft < i3 || paddingLeft > c1590.f6420 + i3 || paddingTop < i4 || paddingTop > i7) : !(paddingLeft < i6 - c1590.f6420 || paddingLeft > i6 || paddingTop < i4 || paddingTop > i7))) {
                            i = 1;
                        }
                    }
                    float fMo14790 = abstractC12359.mo14790();
                    if (abstractC12359.mo14788() && fMo14790 > 0.0f) {
                        float f3 = iM16978;
                        if (fMo14790 - f3 > 0.0f && c1590.f6428 && fMo14790 / f3 > 3.0f) {
                            if (c1590.f6388 && c1590.f6422) {
                                if (c1590.f6381) {
                                    i3 += abstractC12359.f41316;
                                } else {
                                    i6 -= abstractC12359.f41316;
                                }
                            }
                            if (i6 >= i3 && paddingLeft >= i3 && paddingLeft <= i6 && paddingTop >= i7 - c1590.f6420 && paddingTop <= i7) {
                                return i | 2;
                            }
                        }
                    }
                }
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ܰܰ, reason: not valid java name and contains not printable characters */
    public static void m16754(C6111 c6111) {
        int i;
        int i2 = c6111.f20853;
        c6111.f20853 = 0;
        if (i2 == 0) {
            return;
        }
        int iM16792 = c6111.m16792(c6111.f20801, c6111.f20841);
        if ((iM16792 & 2) != 0) {
            i = 2;
        } else {
            i = (iM16792 & 1) != 0 ? 1 : 0;
        }
        if (i != i2) {
            c6111.f20827 = false;
            c6111.f20754 = false;
        } else if (i2 == 1) {
            c6111.m16944();
            c6111.f20827 = true;
            c6111.f20754 = false;
        } else if (i2 == 2) {
            c6111.m17003();
            c6111.f20827 = false;
            c6111.f20754 = true;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m16658(C6111 c6111, int i, MotionEvent motionEvent) {
        c6111.f20801 = motionEvent.getX();
        float y = motionEvent.getY();
        c6111.f20841 = y;
        if ((c6111.m16792(c6111.f20801, y) & i) != 0) {
            c6111.f20827 = i == 1;
            c6111.f20754 = i == 2;
        } else {
            c6111.f20827 = false;
            c6111.f20754 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۜۖ, reason: not valid java name and contains not printable characters */
    public void m16699() {
        this.f20853 = 0;
        this.f20854.removeMessages(8);
    }

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public static void m16788(C6111 c6111) {
        c6111.f20827 = false;
        c6111.f20754 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۘۖ, reason: not valid java name and contains not printable characters */
    public void m16646() {
        m16699();
        this.f20827 = false;
        this.f20754 = false;
    }

    /* JADX INFO: renamed from: ᩵ۖ, reason: not valid java name and contains not printable characters */
    private float m16779() {
        if (this.f20752) {
            return 1.0f;
        }
        return m16648(this.f20830);
    }

    /* JADX INFO: renamed from: ۠ۖ, reason: not valid java name and contains not printable characters */
    private float m16706() {
        if (this.f20821) {
            return 1.0f;
        }
        return m16648(this.f20803);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static float m16648(long j) {
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
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean m16640(float f) {
        C1590 c1590 = this.f20794;
        if (!c1590.f6388) {
            return false;
        }
        if (c1590.f6422) {
            if (c1590.f6381) {
                return f - ((float) getScrollX()) <= ((float) this.f20764.f41316);
            }
            return f - ((float) getScrollX()) >= ((float) (m16978() - this.f20764.f41316));
        }
        if (c1590.f6381) {
            return f <= ((float) this.f20764.f41316);
        }
        return f >= this.f20764.mo14790() - ((float) this.f20764.f41316);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!m16709()) {
            return false;
        }
        C16408 c16408 = this.f20741;
        InterfaceC2916 interfaceC2916 = this.f20708;
        if (c16408 == interfaceC2916) {
            return false;
        }
        try {
            return m16677(i, keyEvent);
        } catch (UncheckedIOException | C18188 e) {
            if (m16894(interfaceC2916, e)) {
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
    private boolean m16677(int i, KeyEvent keyEvent) {
        int iIndexOf;
        int iM30734;
        int length;
        KeyEvent keyEvent2 = keyEvent == null ? new KeyEvent(0, i) : keyEvent;
        boolean z = MetaKeyKeyListener.getMetaState(this.f20708, 1) == 1;
        boolean zIsCtrlPressed = keyEvent2.isCtrlPressed();
        boolean zIsAltPressed = keyEvent2.isAltPressed();
        boolean z2 = z || MetaKeyKeyListener.getMetaState(this.f20708, 2048) != 0;
        int iM16916 = m16916();
        int iM17020 = m17020();
        int iMin = Math.min(iM16916, iM17020);
        int iMax = Math.max(iM16916, iM17020);
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
                                                    int iM30744 = this.f20764.m30744(iM17020);
                                                    if (iM30744 > 0) {
                                                        int iM16814 = (int) (m16814() / this.f20794.m17870());
                                                        int iMax2 = Math.max(0, iM30744 - iM16814);
                                                        C3329 c3329Mo2399 = this.f20708.mo2399();
                                                        try {
                                                            float fM17871 = this.f20750;
                                                            if (fM17871 < 0.0f) {
                                                                fM17871 = this.f20794.m17871(c3329Mo2399, this.f20764.f41308.get(iM30744).f47316, iM17020, 0.0f) + this.f20764.m30726(iM30744);
                                                                this.f20750 = fM17871;
                                                            }
                                                            int iM30735 = this.f20764.m30734(c3329Mo2399, iMax2, fM17871);
                                                            c3329Mo2399.close();
                                                            if (z2) {
                                                                this.f20708.setSelection(m16916(), iM30735);
                                                            } else {
                                                                this.f20708.setSelection(iM30735);
                                                                m16835();
                                                            }
                                                            this.f20844 = 0L;
                                                            int iM30729 = this.f20764.m30729(this.f20826 + 1) - iM16814;
                                                            if (iM30729 < 0) {
                                                                iM30729 = 0;
                                                            }
                                                            this.f20795 = (int) (this.f20794.m17870() * iM30729);
                                                            m16890(iM30735, false);
                                                            m16915();
                                                            m16770();
                                                            invalidate();
                                                            return true;
                                                        } catch (Throwable th) {
                                                            try {
                                                                c3329Mo2399.close();
                                                                throw th;
                                                            } catch (Throwable th2) {
                                                                th.addSuppressed(th2);
                                                                throw th;
                                                            }
                                                        }
                                                    }
                                                } else if (i == 93) {
                                                    int iM30745 = this.f20764.m30744(iM17020);
                                                    int size = this.f20764.f41308.size() - 1;
                                                    if (iM30745 < size) {
                                                        int iM16815 = (int) (m16814() / this.f20794.m17870());
                                                        int iMin2 = Math.min(size, iM30745 + iM16815);
                                                        C3329 c3329Mo23910 = this.f20708.mo2399();
                                                        try {
                                                            float fM17872 = this.f20750;
                                                            if (fM17872 < 0.0f) {
                                                                fM17872 = this.f20794.m17871(c3329Mo23910, this.f20764.f41308.get(iM30745).f47316, iM17020, 0.0f) + this.f20764.m30726(iM30745);
                                                                this.f20750 = fM17872;
                                                            }
                                                            int iM30736 = this.f20764.m30734(c3329Mo23910, iMin2, fM17872);
                                                            c3329Mo23910.close();
                                                            if (z2) {
                                                                this.f20708.setSelection(m16916(), iM30736);
                                                            } else {
                                                                this.f20708.setSelection(iM30736);
                                                                m16835();
                                                            }
                                                            this.f20844 = 0L;
                                                            int iM307210 = this.f20764.m30729(this.f20826 + 1) + iM16815;
                                                            if (iM307210 <= size) {
                                                                size = iM307210;
                                                            }
                                                            this.f20795 = (int) (this.f20794.m17870() * size);
                                                            m16890(iM30736, false);
                                                            m16770();
                                                            m16915();
                                                            invalidate();
                                                            return true;
                                                        } catch (Throwable th3) {
                                                            try {
                                                                c3329Mo23910.close();
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
                                                            C1877.m6113(this, z2);
                                                            return true;
                                                        }
                                                        C1877.m6121(this, z2);
                                                        return true;
                                                    }
                                                    if (i == 123) {
                                                        if (zIsCtrlPressed) {
                                                            C1877.m6128(this, z2);
                                                            return true;
                                                        }
                                                        C1877.m6124(this, z2);
                                                        return true;
                                                    }
                                                    switch (i) {
                                                        case 19:
                                                            int iM30746 = this.f20764.m30744(iM17020);
                                                            if (iM30746 > 0) {
                                                                C3329 c3329Mo23911 = this.f20708.mo2399();
                                                                try {
                                                                    float fM17873 = this.f20750;
                                                                    if (fM17873 < 0.0f) {
                                                                        fM17873 = this.f20794.m17871(c3329Mo23911, this.f20764.f41308.get(iM30746).f47316, iM17020, 0.0f) + this.f20764.m30726(iM30746);
                                                                        this.f20750 = fM17873;
                                                                    }
                                                                    iM30734 = this.f20764.m30734(c3329Mo23911, iM30746 - 1, fM17873);
                                                                    c3329Mo23911.close();
                                                                } catch (Throwable th5) {
                                                                    try {
                                                                        c3329Mo23911.close();
                                                                        throw th5;
                                                                    } catch (Throwable th6) {
                                                                        th5.addSuppressed(th6);
                                                                        throw th5;
                                                                    }
                                                                }
                                                            } else {
                                                                iM30734 = 0;
                                                            }
                                                            if (z2) {
                                                                this.f20708.setSelection(m16916(), iM30734);
                                                            } else {
                                                                this.f20708.setSelection(iM30734);
                                                                m16835();
                                                            }
                                                            this.f20844 = 0L;
                                                            m16890(iM30734, false);
                                                            m16915();
                                                            m16770();
                                                            invalidate();
                                                            return true;
                                                        case 20:
                                                            int iM30747 = this.f20764.m30744(iM17020);
                                                            if (iM30747 < this.f20764.f41308.size() - 1) {
                                                                C3329 c3329Mo23912 = this.f20708.mo2399();
                                                                try {
                                                                    float fM17874 = this.f20750;
                                                                    if (fM17874 < 0.0f) {
                                                                        fM17874 = this.f20794.m17871(c3329Mo23912, this.f20764.f41308.get(iM30747).f47316, iM17020, 0.0f) + this.f20764.m30726(iM30747);
                                                                        this.f20750 = fM17874;
                                                                    }
                                                                    length = this.f20764.m30734(c3329Mo23912, iM30747 + 1, fM17874);
                                                                    c3329Mo23912.close();
                                                                } catch (Throwable th7) {
                                                                    try {
                                                                        c3329Mo23912.close();
                                                                        throw th7;
                                                                    } catch (Throwable th8) {
                                                                        th7.addSuppressed(th8);
                                                                        throw th7;
                                                                    }
                                                                }
                                                            } else {
                                                                length = this.f20708.length();
                                                            }
                                                            if (z2) {
                                                                this.f20708.setSelection(m16916(), length);
                                                            } else {
                                                                this.f20708.setSelection(length);
                                                                m16835();
                                                            }
                                                            this.f20844 = 0L;
                                                            m16890(length, false);
                                                            m16915();
                                                            m16770();
                                                            invalidate();
                                                            return true;
                                                        case 21:
                                                            if (!zIsCtrlPressed || !zIsAltPressed) {
                                                                this.f20764.m30750();
                                                                if (zIsCtrlPressed) {
                                                                    int[] iArrM16731 = m16731(iM17020, true);
                                                                    String strSubstring = TextUtils.substring(this.f20708, iArrM16731[0], iArrM16731[1]);
                                                                    int i2 = iArrM16731[0];
                                                                    int iPreceding = iM17020 - i2;
                                                                    BreakIterator breakIterator = this.f20816;
                                                                    try {
                                                                        breakIterator.setText(strSubstring);
                                                                        do {
                                                                            iPreceding = breakIterator.preceding(iPreceding);
                                                                            if (iPreceding == -1) {
                                                                                iPreceding = 0;
                                                                            }
                                                                            iMin = i2 + iPreceding;
                                                                            if (z2) {
                                                                                this.f20708.setSelection(iM16916, iMin);
                                                                            } else {
                                                                                this.f20708.setSelection(iMin);
                                                                                m16835();
                                                                            }
                                                                        } while (!((iPreceding < 0 || iPreceding >= strSubstring.length()) ? false : Character.isLetterOrDigit(Character.codePointAt(strSubstring, iPreceding))));
                                                                    } catch (Exception unused) {
                                                                    }
                                                                    iMin = i2 + iPreceding;
                                                                    if (z2) {
                                                                        this.f20708.setSelection(iM16916, iMin);
                                                                    } else {
                                                                        this.f20708.setSelection(iMin);
                                                                        m16835();
                                                                    }
                                                                } else if (z2) {
                                                                    iMin = C20149.m45559(iM17020, this.f20708);
                                                                    this.f20708.setSelection(iM16916, iMin);
                                                                } else if (iM16916 != iM17020) {
                                                                    this.f20708.setSelection(iMin);
                                                                    m16835();
                                                                } else {
                                                                    iMin = C20149.m45559(iM16916, this.f20708);
                                                                    this.f20708.setSelection(iMin);
                                                                    m16835();
                                                                }
                                                                this.f20844 = 0L;
                                                                m16890(iMin, false);
                                                                m16915();
                                                                this.f20750 = -1.0f;
                                                                m16770();
                                                                invalidate();
                                                                return true;
                                                            }
                                                            break;
                                                        case 22:
                                                            if (zIsCtrlPressed && zIsAltPressed) {
                                                                return true;
                                                            }
                                                            this.f20764.m30750();
                                                            if (zIsCtrlPressed) {
                                                                int[] iArrM16732 = m16731(iM17020, true);
                                                                String strSubstring2 = TextUtils.substring(this.f20708, iArrM16732[0], iArrM16732[1]);
                                                                int i3 = iArrM16732[0];
                                                                int length2 = iM17020 - i3;
                                                                BreakIterator breakIterator2 = this.f20816;
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
                                                                            this.f20708.setSelection(iM16916, iMax);
                                                                        } else {
                                                                            this.f20708.setSelection(iMax);
                                                                            m16835();
                                                                        }
                                                                    } while (!((length2 <= 0 || length2 > strSubstring2.length()) ? false : Character.isLetterOrDigit(Character.codePointBefore(strSubstring2, length2))));
                                                                } catch (Exception unused2) {
                                                                    length2 = strSubstring2.length();
                                                                }
                                                                iMax = i3 + length2;
                                                                if (z2) {
                                                                    this.f20708.setSelection(iM16916, iMax);
                                                                } else {
                                                                    this.f20708.setSelection(iMax);
                                                                    m16835();
                                                                }
                                                            } else if (z2) {
                                                                InterfaceC2916 interfaceC2916 = this.f20708;
                                                                iMax = C20149.m45558(iM17020, interfaceC2916.length(), interfaceC2916);
                                                                this.f20708.setSelection(iM16916, iMax);
                                                            } else if (iM16916 != iM17020) {
                                                                this.f20708.setSelection(iMax);
                                                                m16835();
                                                            } else {
                                                                InterfaceC2916 interfaceC2917 = this.f20708;
                                                                iMax = C20149.m45558(iM16916, interfaceC2917.length(), interfaceC2917);
                                                                this.f20708.setSelection(iMax);
                                                                m16835();
                                                            }
                                                            this.f20844 = 0L;
                                                            m16890(iMax, false);
                                                            m16915();
                                                            this.f20750 = -1.0f;
                                                            m16770();
                                                            invalidate();
                                                            return true;
                                                        default:
                                                            switch (i) {
                                                                case 52:
                                                                    if (zIsCtrlPressed && !z && !zIsAltPressed) {
                                                                        if (m16916() == m17020()) {
                                                                            C1877.m6127(this);
                                                                            return true;
                                                                        }
                                                                        m17006(android.R.id.cut);
                                                                        return true;
                                                                    }
                                                                    break;
                                                                case 53:
                                                                    if (zIsCtrlPressed && !z && !zIsAltPressed) {
                                                                        if (!m17037()) {
                                                                            return true;
                                                                        }
                                                                        m17039();
                                                                        return true;
                                                                    }
                                                                    break;
                                                                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                                                                    if (zIsCtrlPressed && !z && !zIsAltPressed) {
                                                                        if (!m16938()) {
                                                                            return true;
                                                                        }
                                                                        m16966();
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
                                                                            if (this.f20794.f6433) {
                                                                                return true;
                                                                            }
                                                                            try {
                                                                                if (z) {
                                                                                    C1877.m6123(this);
                                                                                } else {
                                                                                    C1877.m6111(this);
                                                                                }
                                                                                this.f20717.decrementAndGet();
                                                                                return true;
                                                                            } catch (Throwable th9) {
                                                                                this.f20717.decrementAndGet();
                                                                                throw th9;
                                                                            }
                                                                        default:
                                                                            switch (i) {
                                                                                case 277:
                                                                                    m17006(android.R.id.cut);
                                                                                    return true;
                                                                                case 278:
                                                                                    m17006(android.R.id.copy);
                                                                                    return true;
                                                                                case 279:
                                                                                    m17006(android.R.id.paste);
                                                                                    return true;
                                                                            }
                                                                    }
                                                                    break;
                                                            }
                                                            break;
                                                    }
                                                }
                                            } else if (!this.f20794.f6433 && this.f20708.length() > 0) {
                                                if (iMin == iMax) {
                                                    iMin = C20149.m45559(iMax, this.f20708);
                                                }
                                                this.f20717.incrementAndGet();
                                                try {
                                                    this.f20708.delete(iMin, iMax);
                                                    this.f20717.decrementAndGet();
                                                    invalidate();
                                                    return true;
                                                } catch (Throwable th10) {
                                                    this.f20717.decrementAndGet();
                                                    throw th10;
                                                }
                                            }
                                        } else if (!mo16903() && !this.f20794.f6433) {
                                            m16823(iMin, iMax);
                                            invalidate();
                                            return true;
                                        }
                                    } else if (zIsCtrlPressed && !z && !zIsAltPressed) {
                                        this.f20703.mo7023(null);
                                        return true;
                                    }
                                } else if (zIsCtrlPressed && !z && !zIsAltPressed) {
                                    InterfaceC19851 interfaceC19851 = this.f20780;
                                    if (interfaceC19851 != null) {
                                        interfaceC19851.mo41946();
                                        interfaceC19851.mo41941(true);
                                        return true;
                                    }
                                }
                            } else if (!this.f20794.f6433 && this.f20708.length() > 0) {
                                if (iMin == iMax) {
                                    InterfaceC2916 interfaceC2918 = this.f20708;
                                    iMax = C20149.m45558(iMax, interfaceC2918.length(), interfaceC2918);
                                }
                                this.f20717.incrementAndGet();
                                try {
                                    this.f20708.delete(iMin, iMax);
                                    this.f20717.decrementAndGet();
                                    invalidate();
                                    return true;
                                } catch (Throwable th11) {
                                    this.f20717.decrementAndGet();
                                    throw th11;
                                }
                            }
                            return true;
                        }
                        f20699.onKeyDown(this, this.f20708, i, keyEvent2);
                        MetaKeyKeyListener.adjustMetaAfterKeypress(this.f20708);
                        return true;
                    }
                    if (zIsCtrlPressed && !z && !zIsAltPressed) {
                        m17006(android.R.id.paste);
                        return true;
                    }
                } else if (zIsCtrlPressed && !z && !zIsAltPressed) {
                    InterfaceC19851 interfaceC19852 = this.f20780;
                    if (interfaceC19852 == null) {
                        return true;
                    }
                    interfaceC19852.mo41933();
                    return true;
                }
            } else if (zIsCtrlPressed && !z && !zIsAltPressed) {
                if (m16916() == m17020()) {
                    C1877.m6117(this);
                    return true;
                }
                m17006(android.R.id.copy);
                return true;
            }
        } else if (zIsCtrlPressed && !z && !zIsAltPressed) {
            m17006(android.R.id.selectAll);
            return true;
        }
        if (!this.f20794.f6433 && !zIsCtrlPressed) {
            this.f20717.incrementAndGet();
            try {
                boolean z3 = keyEvent2.isCapsLockOn() != keyEvent2.isShiftPressed();
                if (29 <= i && i <= 54) {
                    this.f20708.replace(iMin, iMax, String.valueOf((char) (((z3 ? 65 : 97) + i) - 29)));
                    int i4 = iMin + 1;
                    mo17029(i4);
                    m16890(i4, false);
                    return true;
                }
                if (7 <= i && i <= 16) {
                    this.f20708.replace(iMin, iMax, String.valueOf(z3 ? ")!@#$%^&*(".charAt(i - 7) : (char) (i + 41)));
                    int i5 = iMin + 1;
                    mo17029(i5);
                    m16890(i5, false);
                    return true;
                }
                char displayLabel = keyEvent2.getDisplayLabel();
                if (displayLabel != 0) {
                    if (z3 && (iIndexOf = "`-=[]\\;',./".indexOf(displayLabel)) != -1) {
                        displayLabel = "~_+{}|:\"<>?".charAt(iIndexOf);
                    }
                    this.f20708.replace(iMin, iMax, String.valueOf(displayLabel));
                    int i6 = iMin + 1;
                    mo17029(i6);
                    m16890(i6, false);
                    return true;
                }
            } finally {
                this.f20717.decrementAndGet();
            }
        }
        return super.onKeyDown(i, keyEvent2);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 63) {
            if (i == 66) {
                if (mo16903()) {
                    View viewFocusSearch = focusSearch(130);
                    if (viewFocusSearch != null) {
                        viewFocusSearch.requestFocus();
                        return true;
                    }
                    m17028();
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
        f20699.onKeyUp(this, this.f20708, i, keyEvent);
        return true;
    }

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public final int m16916() {
        int selectionStart = Selection.getSelectionStart(this.f20708);
        if (selectionStart < 0) {
            return 0;
        }
        return selectionStart > this.f20708.length() ? this.f20708.length() : selectionStart;
    }

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public final int m17020() {
        int selectionEnd = Selection.getSelectionEnd(this.f20708);
        if (selectionEnd < 0) {
            return 0;
        }
        return selectionEnd > this.f20708.length() ? this.f20708.length() : selectionEnd;
    }

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final int[] m16971() {
        int iM16916 = m16916();
        int iM17020 = m17020();
        if (iM16916 > iM17020) {
            iM17020 = iM16916;
            iM16916 = iM17020;
        }
        return new int[]{iM16916, iM17020};
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16854(View view, boolean z, boolean z2) {
        view.setVisibility(z ? 0 : 8);
        m16887(z, z2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16887(boolean z, boolean z2) {
        if (z) {
            this.f20843 = true;
            this.f20707 = false;
            this.f20785 = -1L;
        } else if (this.f20843) {
            this.f20843 = false;
            this.f20707 = z2;
            this.f20785 = -1L;
        } else if (!z2) {
            this.f20707 = false;
            this.f20785 = -1L;
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final int m17060() {
        return this.f20735;
    }

    /* JADX INFO: renamed from: ۡܰ, reason: not valid java name and contains not printable characters */
    public final boolean m16941() {
        return this.f20843;
    }

    /* JADX INFO: renamed from: ᩻ۖ, reason: not valid java name and contains not printable characters */
    private int m16804() {
        if (!this.f20707) {
            return 255;
        }
        if (Build.VERSION.SDK_INT >= 26 && !ValueAnimator.areAnimatorsEnabled()) {
            this.f20707 = false;
            return 255;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.f20785 < 0) {
            this.f20785 = jUptimeMillis;
        }
        float fMin = Math.min(1.0f, (jUptimeMillis - this.f20785) / 100.0f);
        if (fMin >= 1.0f) {
            this.f20707 = false;
        } else {
            postInvalidateOnAnimation();
        }
        return Math.round(((fMin * 0.5f) + 0.5f) * 255.0f);
    }

    /* JADX INFO: renamed from: ۜۨ, reason: not valid java name and contains not printable characters */
    public final void m16924() {
        this.f20740 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00d9, code lost:
    
        r0.f41546 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00db, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m16873(l.AbstractC12359 r10, int r11, int r12) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6111.m16873(l.۫ۧۖ, int, int):void");
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        InterfaceC2916 interfaceC2916 = this.f20708;
        int saveCount = canvas.getSaveCount();
        try {
            try {
                m16652(canvas);
                canvas.restoreToCount(saveCount);
            } catch (Throwable th) {
                canvas.restoreToCount(saveCount);
                throw th;
            }
        } catch (UncheckedIOException | C18188 e) {
            if (!m16894(interfaceC2916, e)) {
                throw e;
            }
            canvas.restoreToCount(saveCount);
        }
    }

    /* JADX INFO: renamed from: ۧۖ, reason: not valid java name and contains not printable characters */
    private void m16718() {
        int scrollX = getScrollX();
        int i = this.f20826;
        ViewOnTouchListenerC5405 viewOnTouchListenerC5405 = this.f20722;
        boolean z = true;
        boolean z2 = viewOnTouchListenerC5405 != null && viewOnTouchListenerC5405.f18656;
        if ((this.f20756 || this.f20836 || this.f20806 || z2) && this.f20766 != 0) {
            int iUptimeMillis = ((int) ((((int) (SystemClock.uptimeMillis() - this.f20849)) / 20.0f) * this.f20766)) + i;
            int iM16837 = m16837(iUptimeMillis);
            if (iM16837 != i) {
                this.f20718.forceFinished(true);
                this.f20854.removeMessages(1);
                m16651(scrollX, iM16837, true);
                this.f20849 = SystemClock.uptimeMillis();
                postInvalidateOnAnimation();
                if (this.f20806) {
                    m16986(this.f20824, this.f20755);
                } else if (z2) {
                    this.f20722.m14967(this.f20824, this.f20755);
                } else if (this.f20756) {
                    m16822(this.f20824, this.f20755);
                } else {
                    m16961(this.f20824, this.f20755);
                }
            } else {
                if (iUptimeMillis == iM16837) {
                    postInvalidateOnAnimation();
                }
                z = false;
            }
        } else {
            z = false;
        }
        if (this.f20845 != z) {
            this.f20845 = z;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m16678(Rect rect, int i, int i2, int i3, int i4) {
        if (i3 > 0 && i4 > 0) {
            if (!mo17071()) {
                rect.set(i, i2, i3 + i, i4 + i2);
                return true;
            }
            Rect rect2 = this.f20835;
            if (!getLocalVisibleRect(rect2)) {
                return false;
            }
            rect2.offset(0, i2 - getScrollY());
            int iMax = Math.max(0, i);
            int iMax2 = Math.max(0, i2);
            int iMax3 = Math.max(iMax, i + i3);
            int iMax4 = Math.max(iMax2, i2 + i4);
            int iM16649 = m16649(rect2.left - getPaddingLeft(), iMax, iMax3);
            int iM166410 = m16649(rect2.top - getPaddingTop(), iMax2, iMax4);
            int iM166411 = m16649(rect2.right - getPaddingLeft(), iMax, iMax3);
            int iM166412 = m16649(rect2.bottom - getPaddingTop(), iMax2, iMax4);
            int iMax5 = Math.max(iM166411 - iM16649, 0);
            int iMax6 = Math.max(iM166412 - iM166410, 0);
            if (iMax5 != 0 && iMax6 != 0) {
                rect.set(iM16649, iM166410, iMax5 + iM16649, iMax6 + iM166410);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final int m17046() {
        int iM16978 = m16978();
        if (iM16978 <= 0) {
            return 0;
        }
        return Math.max((int) (this.f20764.mo14790() - iM16978), 0);
    }

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final int m17012() {
        int iM16814 = m16814();
        if (iM16814 <= 0) {
            return 0;
        }
        return Math.max((int) (this.f20764.m30743() - ((double) iM16814)), 0);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int m16974(int i) {
        if (i < 0) {
            return 0;
        }
        int iM17046 = m17046();
        return i > iM17046 ? iM17046 : i;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int m16837(int i) {
        if (i < 0) {
            return 0;
        }
        int iM17012 = m17012();
        return i > iM17012 ? iM17012 : i;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m16947() {
        OverScroller overScroller = this.f20718;
        if (!overScroller.isFinished()) {
            float currVelocity = overScroller.getCurrVelocity();
            if (currVelocity == 0.0f || currVelocity >= 5000.0f) {
                return false;
            }
        }
        InterfaceC18708 interfaceC18708 = this.f20794.f6389;
        if (m16926()) {
            return interfaceC18708 == null || interfaceC18708.mo19410();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean m16926() {
        return !this.f20752 || SystemClock.uptimeMillis() - this.f20820 >= 100;
    }

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public static void m16771(C6111 c6111) {
        if (c6111.f20752) {
            c6111.f20752 = false;
            c6111.f20854.removeMessages(6);
            c6111.invalidate();
            InterfaceC18708 interfaceC18708 = c6111.f20794.f6389;
            if (interfaceC18708 != null) {
                interfaceC18708.mo19404();
            }
        }
    }

    @Override // android.view.View
    public final void computeScroll() {
        EdgeEffect edgeEffect;
        if (this.f20818) {
            return;
        }
        InterfaceC2916 interfaceC2916 = this.f20708;
        try {
            m16759(getScrollX(), this.f20826);
            m16630();
            m16718();
            C17400 c17400 = this.f20701;
            if (c17400 != null && !c17400.m40546(this)) {
                m16801();
            }
            if (this.f20718.computeScrollOffset()) {
                int scrollX = getScrollX();
                int i = this.f20826;
                int currX = this.f20718.getCurrX();
                int currY = this.f20718.getCurrY();
                if (currY != i) {
                    m16944();
                    if (this.f20709 && this.f20794.f6426) {
                        if (i > 0 && currY <= 0) {
                            this.f20727.onAbsorb((int) this.f20718.getCurrVelocity());
                        } else {
                            int iM17012 = m17012();
                            if (i < iM17012 && currY >= iM17012) {
                                this.f20783.onAbsorb((int) this.f20718.getCurrVelocity());
                            }
                        }
                    }
                }
                if (currX != scrollX) {
                    m17003();
                    if (this.f20709 && (edgeEffect = this.f20724) != null && this.f20777 != null && this.f20794.f6426) {
                        if (scrollX > 0 && currX <= 0) {
                            edgeEffect.onAbsorb((int) this.f20718.getCurrVelocity());
                        } else {
                            int iM17046 = m17046();
                            if (scrollX < iM17046 && currX >= iM17046) {
                                this.f20777.onAbsorb((int) this.f20718.getCurrVelocity());
                            }
                        }
                    }
                }
                m16732();
                this.f20759.incrementAndGet();
                m16651(currX, currY, false);
                invalidate();
            }
            if (this.f20718.isFinished()) {
                this.f20701 = null;
            }
        } catch (UncheckedIOException | C18188 e) {
            if (!m16894(interfaceC2916, e)) {
                throw e;
            }
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m16915();
        this.f20722.f18652 = 0L;
        if (z || this.f20828) {
            m16773();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳۖ, reason: not valid java name and contains not printable characters */
    public void m16773() {
        m16760();
        if (m16809() || this.f20774 || this.f20764.f41297 != this.f20708) {
            this.f20828 = true;
            return;
        }
        if (this.f20725) {
            if (isAttachedToWindow()) {
                C16737.m39274(new Runnable() { // from class: l.ۚ᩻ۖ
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f19356.m16773();
                    }
                }, 100L);
                return;
            }
            return;
        }
        this.f20828 = false;
        boolean zM30758 = this.f20764.m30758();
        boolean zM30757 = this.f20764.m30757();
        int scrollX = getScrollX();
        if (this.f20764.mo14788()) {
            scrollX = m16974(scrollX);
        } else {
            this.f20764.mo14805(m16978());
        }
        if (this.f20774) {
            return;
        }
        this.f20718.forceFinished(true);
        m16651(scrollX, m16837(this.f20826), false);
        if (!m16630() && this.f20713 == null && this.f20796 == null) {
            if (zM30758 || zM30757) {
                int iM16916 = m16916();
                int iM17020 = m17020();
                if (iM16916 > iM17020) {
                    iM17020 = iM16916;
                    iM16916 = iM17020;
                }
                if (!zM30758) {
                    iM16916 = iM17020;
                }
                m16890(iM16916, false);
                m16915();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m16893(CharSequence charSequence) {
        try {
            this.f20730.setPrimaryClip(ClipData.newPlainText(null, charSequence));
            return true;
        } catch (Throwable unused) {
            C15829.m37611(R.string.MT_Protector);
            return false;
        }
    }

    /* JADX INFO: renamed from: ᩺ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m17068() {
        try {
            return this.f20730.hasPrimaryClip();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m17006(int i) {
        C16408 c16408 = this.f20741;
        InterfaceC2916 interfaceC2916 = this.f20708;
        if (c16408 == interfaceC2916) {
            return;
        }
        try {
            m16782(i);
        } catch (UncheckedIOException | C18188 e) {
            if (!m16894(interfaceC2916, e)) {
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    private void m16782(int i) {
        String string;
        int iM16916 = m16916();
        int iM17020 = m17020();
        if (iM16916 > iM17020) {
            iM17020 = iM16916;
            iM16916 = iM17020;
        }
        boolean z = this.f20794.f6433;
        if (z && i == 16908320) {
            i = android.R.id.copy;
        }
        HandlerC9910 handlerC9910 = this.f20854;
        if (i != 16908328) {
            switch (i) {
                case android.R.id.selectAll:
                    if (this.f20708.length() > 0) {
                        mo16839(0, this.f20708.length());
                        handlerC9910.sendEmptyMessageDelayed(2, m16890(this.f20708.length(), false) ? 250L : 50L);
                    }
                    break;
                case android.R.id.cut:
                    if (iM16916 != iM17020 && m16893(this.f20708.subSequence(iM16916, iM17020))) {
                        this.f20708.delete(iM16916, iM17020);
                        invalidate();
                        m16951();
                        break;
                    }
                    break;
                case android.R.id.copy:
                    if (iM16916 != iM17020 && m16893(this.f20708.subSequence(iM16916, iM17020))) {
                        m16951();
                        break;
                    }
                    break;
                case android.R.id.paste:
                    if (!z && m17068()) {
                        try {
                            CharSequence text = this.f20730.getText();
                            string = text != null ? text.toString() : "";
                        } catch (Throwable th) {
                            string = th.toString();
                        }
                        String string2 = C1590.m5421(string).toString();
                        this.f20708.replace(iM16916, iM17020, string2);
                        mo17029(string2.length() + iM16916);
                        m16886(false);
                        m16951();
                        break;
                    }
                    break;
                default:
                    switch (i) {
                        case android.R.id.undo:
                            m16966();
                            break;
                        case android.R.id.redo:
                            m17039();
                            break;
                        default:
                            System.out.println("onTextContextMenuItem: " + i);
                            break;
                    }
                    break;
            }
            return;
        }
        m16824(m16916(), true);
        handlerC9910.sendEmptyMessageDelayed(2, 100L);
    }

    /* JADX INFO: renamed from: ۗۨ, reason: not valid java name and contains not printable characters */
    public final void m16835() {
        this.f20737 = SystemClock.uptimeMillis();
        HandlerC9910 handlerC9910 = this.f20854;
        handlerC9910.removeMessages(4);
        handlerC9910.sendEmptyMessageAtTime(4, SystemClock.uptimeMillis() + 500);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        m16783();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        m16626();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        AbstractC12359 abstractC12359;
        super.onWindowVisibilityChanged(i);
        if (i == 0 || (abstractC12359 = this.f20764) == null) {
            return;
        }
        abstractC12359.m30754();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        AbstractC12359 abstractC12359;
        super.onVisibilityChanged(view, i);
        if (i == 0 || (abstractC12359 = this.f20764) == null) {
            return;
        }
        abstractC12359.m30754();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        HandlerC9910 handlerC9910 = this.f20854;
        if (z) {
            handlerC9910.m25111();
            m16835();
            return;
        }
        m16646();
        handlerC9910.m25110();
        this.f20737 = 0L;
        this.f20844 = 0L;
        invalidate();
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!z) {
            m16646();
            m17069();
            m16915();
        } else {
            this.f20737 = SystemClock.uptimeMillis();
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m16993(ExtractedTextRequest extractedTextRequest, ExtractedText extractedText) {
        InterfaceC2916 interfaceC2916;
        int iM9892;
        int i;
        if (extractedTextRequest == null || (interfaceC2916 = this.f20708) == null) {
            return false;
        }
        extractedText.startOffset = 0;
        int length = interfaceC2916.length();
        if (this.f20702) {
            int[] iArrM16971 = m16971();
            iM9892 = iArrM16971[0];
            int i2 = iArrM16971[1];
            if (i2 - iM9892 > 10000) {
                length = iM9892 + 10000;
            } else {
                if (iM9892 >= 1000) {
                    C3329 c3329Mo2399 = interfaceC2916.mo2399();
                    try {
                        iM9892 = c3329Mo2399.m9892(c3329Mo2399.m9893(iM9892 - 999));
                        c3329Mo2399.close();
                    } catch (Throwable th) {
                        try {
                            c3329Mo2399.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } else {
                    iM9892 = 0;
                }
                if (i2 - iM9892 <= 10000) {
                    i = iM9892 + 10000;
                } else {
                    int i3 = iArrM16971[1];
                    int i4 = iArrM16971[0];
                    int i5 = (10000 - (i3 - i4)) / 2;
                    int i6 = i3 + i5;
                    iM9892 = i4 - i5;
                    i = i6;
                }
                if (iM9892 < 0) {
                    iM9892 = 0;
                }
                if (i <= length) {
                    length = i;
                }
            }
            extractedText.partialEndOffset = -1;
            extractedText.partialStartOffset = -1;
            extractedText.startOffset = iM9892;
        } else {
            extractedText.partialEndOffset = -1;
            extractedText.partialStartOffset = -1;
            iM9892 = 0;
        }
        extractedText.text = interfaceC2916.mo2396(iM9892, length);
        extractedText.flags = 0;
        if (MetaKeyKeyListener.getMetaState(this.f20708, 2048) != 0) {
            extractedText.flags |= 2;
        }
        if (mo16903()) {
            extractedText.flags |= 1;
        }
        extractedText.selectionStart = m16916() - extractedText.startOffset;
        extractedText.selectionEnd = m17020() - extractedText.startOffset;
        if (Build.VERSION.SDK_INT >= 28) {
            extractedText.hint = this.f20764.f41300;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m16892(ExtractedTextRequest extractedTextRequest, ExtractedText extractedText) {
        InterfaceC2916 interfaceC2916 = this.f20708;
        try {
            return m16993(extractedTextRequest, extractedText);
        } catch (UncheckedIOException | C18188 e) {
            if (m16894(interfaceC2916, e)) {
                return false;
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m17055() {
        C22339 c22339 = this.f20714;
        if (c22339 != null) {
            int i = c22339.f72927 + 1;
            c22339.f72927 = i;
            if (i == 1) {
                if (c22339.f72926) {
                    c22339.f72929 = 0;
                    c22339.f72930 = this.f20708.length();
                } else {
                    c22339.f72929 = -1;
                    c22339.f72930 = -1;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16817() {
        int i;
        boolean z;
        C22339 c22339 = this.f20714;
        if (c22339 != null && (i = c22339.f72927) > 0) {
            int i2 = i - 1;
            c22339.f72927 = i2;
            if (i2 == 0 && (((z = c22339.f72926) || c22339.f72928) && c22339 != null && (z || c22339.f72928))) {
                c22339.f72926 = false;
                c22339.f72928 = false;
            }
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C12175 m17011() {
        if (Looper.myLooper() != Looper.getMainLooper() || this.f20708.length() != 0 || this.f20774 || this.f20779 || this.f20725 || this.f20796 != null || this.f20764.mo14804() || this.f20708.mo8725()) {
            throw new IllegalStateException("Initial session state requires an idle empty foreground view");
        }
        return C12175.m30260(0, 0, this.f20808, this.f20702, this.f20807, this.f20792, this.f20794, this.f20811, this.f20797);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16872(C12175 c12175, C0135 c0135, C16408 c16408, C15990 c15990) {
        if (Looper.myLooper() != Looper.getMainLooper() || c15990 == null || c15990 != this.f20748 || !c15990.f51770 || this.f20774 || this.f20779 || m16973() || this.f20765 != null) {
            throw new IllegalStateException("Session layout configuration requires its idle reserved view");
        }
        if (c12175.f40744 > c16408.length() || c12175.f40749 > c16408.length()) {
            throw new IllegalArgumentException("Session search range exceeds text length");
        }
        C12175 c12175M30260 = C12175.m30260(getScrollX(), this.f20826, this.f20808, this.f20702, this.f20807, this.f20792, this.f20794, this.f20811, this.f20797);
        C20928 c20928 = new C20928(c15990, c12175, c0135, c16408, this.f20708, this.f20764, c12175M30260);
        this.f20765 = c20928;
        try {
            m16746(c12175, c0135);
            AbstractC12359 abstractC12359M30713 = AbstractC12359.m30713(this, c20928.f67990, this.f20794, this.f20808);
            c20928.f67987 = abstractC12359M30713;
            m16674(abstractC12359M30713, true);
        } catch (Error | RuntimeException e) {
            m16746(c12175M30260, (C0135) null);
            if (this.f20764 == c20928.f67987) {
                m16674(c20928.f67988, true);
            }
            this.f20765 = null;
            c20928.f67990.close();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m16896(C12175 c12175) {
        C20928 c20928 = this.f20765;
        if (c20928 == null) {
            return false;
        }
        if (c20928.f67989 == c12175) {
            C16408 c16408 = c20928.f67992;
            InterfaceC2916 interfaceC2916 = this.f20708;
            if (c16408 == interfaceC2916 && c20928.f67987 == this.f20764 && c20928.f67997 && c20928.f67993 == interfaceC2916.mo2395() && !c20928.f67986 && c20928.f67991 == this.f20748) {
                c20928.f67986 = true;
                m16673(c12175, c20928.f67985, c20928);
                return true;
            }
        }
        throw new IllegalStateException("Prepared session layout does not belong to this restoration");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m16747(C15990 c15990) {
        AbstractC12359 abstractC12359;
        C20928 c20928 = this.f20765;
        if (c20928 != null) {
            C12175 c12175 = c20928.f67996;
            C19186 c19186 = c20928.f67990;
            if (c20928.f67991 != c15990) {
                return;
            }
            this.f20765 = null;
            try {
                if (this.f20708 == c20928.f67984 && (abstractC12359 = this.f20764) == c20928.f67987 && abstractC12359.f41297 == c19186) {
                    m16746(c12175, (C0135) null);
                    m16674(c20928.f67988, true);
                    m16651(c12175.f40747, c12175.f40754, true);
                }
            } finally {
                c19186.close();
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C16592 m16983(InterfaceC2916 interfaceC2916) {
        int scrollX;
        C20928 c20928 = this.f20765;
        if (c20928 == null) {
            return null;
        }
        C12175 c12175 = c20928.f67989;
        if (c20928.f67992 != interfaceC2916) {
            return null;
        }
        int iM16734 = m16734(c12175);
        if (c20928.f67985 == null && this.f20764.mo14788()) {
            scrollX = c12175.m30276() ? c12175.f40747 : getScrollX();
        } else {
            scrollX = 0;
        }
        return new C16592(Math.max(0, scrollX), Math.max(0, iM16734), m16978(), m16814());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m16898(C16408 c16408, C12318 c12318) {
        C15990 c15990;
        C20928 c20928 = this.f20765;
        if (Looper.myLooper() != Looper.getMainLooper() || c20928 == null || c20928.f67992 != c16408 || c16408 != this.f20708 || c20928.f67987 != this.f20764 || !c20928.f67997 || c20928.f67986 || this.f20774 || this.f20760 || c20928.f67993 != c16408.mo2395() || (c15990 = c20928.f67991) != this.f20748 || !c15990.f51770) {
            return false;
        }
        if ((c12318 != null && c12318.f41152) || c20928.f67989.f40744 >= 0 || !this.f20764.mo14804()) {
            return false;
        }
        C16592 c16592M16983 = m16983((InterfaceC2916) c16408);
        if (c16592M16983.m39026() <= 0 || c16592M16983.m39024() <= 0 || !this.f20764.mo14800(c16592M16983) || !this.f20764.mo14799(Math.max(m16916(), m17020()))) {
            return false;
        }
        AbstractC12359 abstractC12359 = this.f20764;
        c20928.f67995 = new C16695(abstractC12359, abstractC12359.mo14794(), c16592M16983);
        c20928.f67994 = true;
        return true;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m16942() {
        C20928 c20928 = this.f20765;
        if (c20928 != null) {
            c20928.f67994 = false;
        }
    }

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final Throwable m16952() {
        return this.f20741 == this.f20708 ? this.f20814 : this.f20764.mo14778();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m16964(AbstractC12359 abstractC12359) {
        C20928 c20928 = this.f20765;
        C16695 c16695 = c20928 == null ? null : c20928.f67995;
        if (c16695 == null) {
            return false;
        }
        C16408 c16408 = c20928.f67992;
        InterfaceC2916 interfaceC2916 = this.f20708;
        return c16408 == interfaceC2916 && c20928.f67993 == interfaceC2916.mo2395() && abstractC12359 == this.f20764 && c16695.f53482 == abstractC12359 && !this.f20760 && c16695.f53480 == c16695.f53482.mo14794() && c16695.f53479.m39026() == m16978() && c16695.f53479.m39024() == m16814() && c16695.f53482.mo14800(c16695.f53479);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m16996(C16408 c16408) {
        C20928 c20928 = this.f20765;
        if (Looper.myLooper() != Looper.getMainLooper() || c20928 == null || c20928.f67992 != c16408 || !c20928.f67986 || !m16964(this.f20764) || getScrollX() != c20928.f67995.f53479.m39025() || this.f20826 != c20928.f67995.f53479.m39023()) {
            return false;
        }
        c20928.f67995.f53481 = true;
        postInvalidate();
        return true;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m17015() {
        C20928 c20928 = this.f20765;
        if ((Looper.myLooper() != Looper.getMainLooper() || c20928 == null || !c20928.f67994 || !m16964(this.f20764) || this.f20774 || this.f20779 || this.f20708.mo8725() || c20928.f67991 != this.f20748) && !m16836()) {
            throw new IllegalStateException("Session view restoration requires an idle foreground owner");
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private int m16734(C12175 c12175) {
        if (!c12175.m30276()) {
            return this.f20826;
        }
        float f = this.f20784;
        if (f > 0.0f) {
            return (int) Math.min(2147483647L, Math.round((((double) c12175.f40754) / ((double) f)) * ((double) this.f20794.m17870())));
        }
        return c12175.f40754;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m16746(C12175 c12175, C0135 c0135) {
        C17256 c17256 = c12175.f40748;
        C1590 c1590 = this.f20794;
        if (c17256 != null) {
            c17256.m40218(c1590);
        }
        C17256 c17257 = c12175.f40748;
        float fM17870 = 0.0f;
        if (c17257 != null) {
            float f = c17257.f54986;
            fM17870 = f > 0.0f ? f : c1590.m17870();
        }
        this.f20784 = fM17870;
        if (c12175.m30276()) {
            this.f20808 = c12175.f40752;
            this.f20702 = c12175.f40751;
            this.f20807 = c12175.f40745;
            this.f20792 = c12175.f40753;
        }
        if (c0135 != null) {
            c1590.mo5423(c0135.f1139);
            int i = c0135.f1141;
            if (i != c0135.f1154 || c0135.f1149 != c0135.f1153 || (i == 1 && !C13638.equals(c0135.f1136, c0135.f1145))) {
                c1590.m5424(c0135.f1149 * c1590.f22193, c0135.f1141);
            }
            boolean z = c0135.f1138;
            if (z != c0135.f1147) {
                c1590.f6398 = z;
                if (z) {
                    c1590.f6374 = c0135.f1152;
                }
            }
            c1590.f6388 = c0135.f1137;
            c1590.m17869(c0135.f1135);
            c1590.m17853(c0135.f1155);
            c1590.f6415 = c0135.f1157;
            c1590.m17861(c0135.f1143);
            this.f20808 = c0135.f1151;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16871(C12175 c12175, C0135 c0135) {
        m16673(c12175, c0135, (C20928) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m16673(C12175 c12175, C0135 c0135, C20928 c20928) {
        int scrollX;
        m17015();
        if (c12175.f40744 > this.f20708.length() || c12175.f40749 > this.f20708.length()) {
            throw new IllegalArgumentException("Session search range exceeds text length");
        }
        m16997();
        this.f20725 = true;
        this.f20770.m32659();
        if (c20928 == null) {
            try {
                m16746(c12175, c0135);
            } catch (Throwable th) {
                this.f20725 = false;
                m16972();
                this.f20825.m31939(this.f20708);
                this.f20770.m32620(this.f20708);
                m16728();
                throw th;
            }
        }
        m16633();
        if (c12175.m30274()) {
            C1590 c1590 = this.f20794;
            c1590.f6392 = c12175.f40744;
            c1590.f6400 = c12175.f40749;
        }
        c12175.m30273(this.f20811, this.f20797);
        this.f20718.forceFinished(true);
        this.f20854.removeMessages(1);
        this.f20770.m32657();
        this.f20710.m3658();
        if (c20928 == null) {
            m16674(AbstractC12359.m30713(this, this.f20708, this.f20794, this.f20808), true);
        }
        this.f20750 = -1.0f;
        m16770();
        this.f20759.incrementAndGet();
        if (c0135 == null) {
            scrollX = c12175.m30276() ? c12175.f40747 : getScrollX();
        } else {
            scrollX = 0;
        }
        int iM16734 = m16734(c12175);
        AbstractC12359 abstractC12359 = this.f20764;
        InterfaceC2916 interfaceC2916 = this.f20708;
        this.f20796 = new C20223(abstractC12359, interfaceC2916, interfaceC2916.mo2395(), scrollX, iM16734);
        m16651(m16974(scrollX), m16837(iM16734), true);
        m16797(this.f20764);
        C1590 c1591 = this.f20794;
        if (c1591.f6398) {
            m16857(c1591.f6374, true);
        } else if (c0135 != null && c0135.f1138 != c0135.f1147) {
            m16857((String) null, false);
        }
        m17005();
        this.f20725 = false;
        m16972();
        this.f20825.m31939(this.f20708);
        this.f20770.m32620(this.f20708);
        m16728();
        if (this.f20794.f6398 && this.f20770.m32663()) {
            this.f20710.m3667(this.f20770.m32643());
        } else {
            this.f20710.m3667(C0923.f3694);
        }
        m17063();
        requestLayout();
        invalidate();
    }

    /* JADX INFO: renamed from: ۗܰ, reason: not valid java name and contains not printable characters */
    public final boolean m16836() {
        if (Looper.myLooper() != Looper.getMainLooper() || !(this.f20708 instanceof C16408) || m16809() || this.f20774 || this.f20779 || this.f20725 || this.f20796 != null) {
            return false;
        }
        C20928 c20928 = this.f20765;
        return ((c20928 != null && !c20928.f67997) || this.f20764.mo14804() || this.f20708.mo8725()) ? false : true;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m17031() {
        if (Looper.myLooper() != Looper.getMainLooper() || !(this.f20708 instanceof C16408) || this.f20774 || this.f20779 || this.f20725) {
            return false;
        }
        C20928 c20928 = this.f20765;
        return (c20928 == null || c20928.f67997) && !this.f20708.mo8725();
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C12175 m16806() {
        if (m17031()) {
            return C12175.m30260(getScrollX(), this.f20826, this.f20808, this.f20702, this.f20807, this.f20792, this.f20794, this.f20811, this.f20797);
        }
        throw new IllegalStateException("Session view state requires a stable foreground owner");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16866(RunnableC8769 runnableC8769) {
        this.f20798.add(runnableC8769);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m16991(RunnableC8769 runnableC8769) {
        this.f20798.remove(runnableC8769);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۫ۖ, reason: not valid java name and contains not printable characters */
    public void m16728() {
        if (!this.f20798.isEmpty()) {
            C16737.m39273(new RunnableC7793(0, this));
        }
        synchronized (this.f20761) {
            final C0466 c0466 = this.f20834;
            if (c0466 != null && !c0466.f2104) {
                c0466.f2104 = true;
                C16737.m39273(new Runnable() { // from class: l.᩶᩻ۖ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C6111.m16663(this.f66455, c0466);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m16654(C6111 c6111) {
        Iterator it = c6111.f20798.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final FutureC12075 m16958(C16408 c16408) {
        C0466 c0466;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Session view readiness requires the foreground thread");
        }
        synchronized (this.f20761) {
            if (this.f20708 != c16408) {
                throw new IllegalStateException("Session readiness owner is not installed in the view");
            }
            if (c16408.mo8725()) {
                throw new IllegalStateException("Cannot await view readiness during text replacement");
            }
            c0466 = this.f20834;
            if (c0466 == null) {
                c0466 = new C0466(c16408, this.f20764, c16408.mo2395());
                this.f20834 = c0466;
            }
        }
        m16728();
        return c0466.f2107.m30032((InterfaceC15954) new C9205());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m16663(C6111 c6111, C0466 c0466) {
        synchronized (c6111.f20761) {
            if (c6111.f20834 != c0466) {
                return;
            }
            c0466.f2104 = false;
            InterfaceC2916 interfaceC2916 = c6111.f20708;
            boolean z = (interfaceC2916 == c0466.f2103 && c6111.f20764 == c0466.f2106 && interfaceC2916.mo2395() == c0466.f2105) ? false : true;
            if (z || !(c6111.m16809() || c6111.f20774 || c6111.f20779 || c6111.f20725 || c6111.f20715 || c6111.f20796 != null || c6111.f20764.mo14804() || c6111.f20708.mo8725())) {
                c6111.f20834 = null;
                Throwable thM16952 = c6111.m16952();
                if (!z && thM16952 != null) {
                    c0466.f2107.m30021(thM16952);
                } else if (z) {
                    c0466.f2107.m30021((Throwable) new CancellationException("Session view preparation was superseded"));
                } else {
                    c0466.f2107.m30019((Object) null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m16688(final String str) {
        final C0466 c0466;
        synchronized (this.f20761) {
            c0466 = this.f20834;
            this.f20834 = null;
        }
        if (c0466 != null) {
            C16737.m39273(new Runnable() { // from class: l.ۤ᩻ۖ
                @Override // java.lang.Runnable
                public final void run() {
                    TextKeyListener textKeyListener = C6111.f20699;
                    c0466.f2107.m30021((Throwable) new CancellationException(str));
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۬ۖ, reason: not valid java name and contains not printable characters */
    private void m16732() {
        if (this.f20796 == null || this.f20725) {
            return;
        }
        this.f20796 = null;
        this.f20759.incrementAndGet();
        m16728();
    }

    /* JADX INFO: renamed from: ۬ۨ, reason: not valid java name and contains not printable characters */
    public final int m16979() {
        return this.f20759.get();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m16897(AbstractC12359 abstractC12359) {
        C20223 c20223 = this.f20796;
        return c20223 != null && c20223.f65637 == abstractC12359;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m16826(AbstractC12359 abstractC12359) {
        if (this.f20796 != null) {
            C16737.m39273(new RunnableC12027(0, this, abstractC12359));
        }
        m16728();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public void m16797(AbstractC12359 abstractC12359) {
        C20223 c20223 = this.f20796;
        if (c20223 == null || c20223.f65637 != abstractC12359) {
            return;
        }
        if (this.f20764 != abstractC12359 || this.f20708 != c20223.f65640 || this.f20708.mo2395() != c20223.f65639) {
            this.f20796 = null;
            m16728();
        } else {
            if (abstractC12359.mo14804()) {
                return;
            }
            this.f20796 = null;
            this.f20759.incrementAndGet();
            if (abstractC12359 instanceof C21489) {
                ((C21489) abstractC12359).m48127(c20223.f65636, m16978());
            }
            m16651(m16974(c20223.f65636), m16837(c20223.f65638), true);
            m16728();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16870(C11018 c11018, boolean z) {
        if (this.f20708 instanceof C16408) {
            throw new IllegalStateException("Session text requires the session recovery protocol");
        }
        c11018.writeInt(-249340294);
        c11018.m27799();
        c11018.writeByte(0);
        c11018.m27799();
        this.f20708.mo8722(c11018);
        c11018.writeInt(this.f20708.mo8732());
        c11018.m27777();
        c11018.writeByte(1);
        c11018.m27799();
        c11018.writeInt(this.f20800);
        c11018.writeInt(this.f20846);
        c11018.writeInt(this.f20745);
        c11018.m27777();
        c11018.writeByte(2);
        c11018.m27799();
        c11018.writeInt(m16916());
        c11018.writeInt(m17020());
        c11018.writeInt(getScrollX());
        c11018.writeInt(this.f20826);
        c11018.writeByte((byte) this.f20808);
        c11018.m27784(this.f20702);
        c11018.m27784(this.f20807);
        c11018.m27784(this.f20792);
        c11018.m27777();
        c11018.writeByte(10);
        c11018.m27799();
        c11018.m27791(this.f20708.mo8718());
        c11018.m27791(this.f20708.mo8735().m4560());
        c11018.m27777();
        c11018.writeByte(11);
        c11018.m27799();
        this.f20811.m45152(c11018);
        this.f20797.m45152(c11018);
        c11018.m27777();
        c11018.writeByte(4);
        c11018.m27799();
        this.f20794.m5426(c11018);
        c11018.m27777();
        c11018.writeByte(7);
        c11018.m27799();
        c11018.writeInt(this.f20794.f6392);
        c11018.writeInt(this.f20794.f6400);
        c11018.m27777();
        c11018.writeByte(5);
        c11018.m27799();
        this.f20764.mo14786(c11018);
        c11018.m27777();
        if (z) {
            c11018.writeByte(9);
            c11018.m27799();
            this.f20770.m32634(c11018);
            c11018.m27777();
        }
        c11018.writeByte(-1);
        c11018.m27777();
        c11018.writeInt(-249340294);
    }

    /* JADX WARN: Code duplicated, block: B:152:0x02b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:154:0x0015 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m16748(C17367 c17367) {
        String str;
        int iM29943;
        C19186 c19186;
        C19186 c19186M51706;
        AbstractC12359 c5325;
        String str2;
        if (!c17367.m40447(-249340294)) {
            throw new RuntimeException("Bad instance state magic");
        }
        int iM40445 = c17367.m40445() + c17367.readInt();
        boolean z = false;
        boolean z2 = false;
        while (true) {
            byte b = c17367.readByte();
            C19892 c19892 = this.f20797;
            C19892 c19893 = this.f20811;
            C13190 c13190 = this.f20770;
            C1590 c1590 = this.f20794;
            if (b != -1) {
                int iM40446 = c17367.m40445() + c17367.readInt();
                switch (b) {
                    case 0:
                        int iMo8733 = this.f20708.mo8733();
                        int iM40449 = c17367.m40449();
                        boolean z3 = iM40449 == -500019884 || iM40449 == -483177132;
                        if (z3) {
                            c19186M51706 = C19186.m44045(c17367, iM40446 - 4);
                            iM29943 = c19186M51706.hashCode();
                        } else {
                            if (c17367.m40449() == -500018348) {
                                c19186M51706 = C23464.m51706(c17367, this.f20771);
                                iM29943 = c19186M51706.hashCode();
                                if (this.f20840) {
                                    try {
                                        try {
                                            c19186 = C19186.m44043(c19186M51706);
                                            c19186M51706.close();
                                        } catch (IOException e) {
                                            throw new UncheckedIOException(e);
                                        }
                                    } catch (Throwable th) {
                                        c19186M51706.close();
                                        throw th;
                                    }
                                }
                            } else {
                                C12048 c12048M39773 = C16986.m39773(c17367, this.f20771);
                                iM29943 = c12048M39773.m29943();
                                c19186 = new C19186(c12048M39773.m29944());
                            }
                            c19186M51706 = c19186;
                        }
                        int i = c17367.readInt();
                        if (z3 && i != iM29943) {
                            c19186M51706.mo8723(false);
                            throw new IllegalArgumentException("Memory text state checksum mismatch");
                        }
                        InterfaceC2916 interfaceC2916 = this.f20708;
                        m16689(c19186M51706);
                        this.f20825.m31931(this.f20708);
                        c13190.m32657();
                        this.f20710.m3658();
                        interfaceC2916.mo8723(false);
                        this.f20708.mo8720(iMo8733);
                        InterfaceC2916 interfaceC2917 = this.f20708;
                        interfaceC2917.setSpan(this.f20743, 0, interfaceC2917.length(), 8388626);
                        z = i != iM29943;
                        if (c17367.m40445() != iM40446) {
                            c17367.seek(iM40446);
                        }
                        break;
                        break;
                    case 1:
                        this.f20800 = c17367.readInt();
                        this.f20846 = c17367.readInt();
                        int i2 = c17367.readInt();
                        this.f20745 = i2;
                        this.f20708.mo8728(this.f20846 != i2);
                        if (c17367.m40445() != iM40446) {
                            c17367.seek(iM40446);
                        }
                        break;
                    case 2:
                        this.f20708.setSelection(c17367.readInt(), c17367.readInt());
                        this.f20718.forceFinished(true);
                        HandlerC9910 handlerC9910 = this.f20854;
                        handlerC9910.removeMessages(1);
                        final int i3 = c17367.readInt();
                        final int i4 = c17367.readInt();
                        m16651(i3, i4, true);
                        handlerC9910.post(new Runnable() { // from class: l.۠᩻ۖ
                            @Override // java.lang.Runnable
                            public final void run() {
                                C6111.m16656(this.f29462, i3, i4);
                            }
                        });
                        this.f20808 = c17367.readByte() & 255;
                        this.f20702 = c17367.m40461();
                        this.f20807 = c17367.m40461();
                        this.f20792 = c17367.m40461();
                        this.f20750 = -1.0f;
                        m16770();
                        if (c17367.m40445() != iM40446) {
                            c17367.seek(iM40446);
                        }
                        break;
                    case 3:
                        m16749(c17367, iM40446);
                        m16749(c17367, iM40446);
                        c19893.m45154(c17367);
                        c19892.m45154(c17367);
                        if (c17367.m40445() != iM40446) {
                            c17367.seek(iM40446);
                        }
                        break;
                    case 4:
                        c1590.getClass();
                        c1590.f6419 = c17367.m40442();
                        c1590.f6388 = c17367.m40461();
                        c1590.m5424(c17367.m40450(), c17367.readByte());
                        c1590.m17861(c17367.m40462());
                        c1590.m17862(c17367.m40461());
                        c1590.m17874(c17367.m40461());
                        c1590.f6429 = c17367.m40461();
                        c1590.f6433 = c17367.m40461();
                        boolean zM40461 = c17367.m40461();
                        c1590.f6398 = zM40461;
                        if (zM40461) {
                            c1590.f6374 = c17367.m40442();
                        }
                        int i5 = c17367.available() > 4 ? c17367.readInt() : 0;
                        if (i5 < 591749667) {
                            c1590.mo5423(1.0f);
                        } else {
                            c1590.m17869(c17367.m40461());
                            if (i5 >= 591749669) {
                                c1590.m17853(c17367.m40461());
                            }
                            if (i5 >= 591749668) {
                                c1590.f6415 = c17367.m40461();
                            }
                            Integer numValueOf = null;
                            Integer numValueOf2 = (i5 < 591749670 || !c17367.m40461()) ? null : Integer.valueOf(c17367.readInt());
                            if (i5 >= 591749671 && c17367.m40461()) {
                                numValueOf = Integer.valueOf(c17367.readInt());
                            }
                            c1590.mo5423(i5 >= 591749672 ? c17367.m40450() : 1.0f);
                            if (i5 >= 591749672) {
                                c17367.m40450();
                            }
                            c1590.m5430(numValueOf2);
                            c1590.m5425(numValueOf);
                        }
                        if (c17367.m40445() != iM40446) {
                            c17367.seek(iM40446);
                        }
                        break;
                    case 5:
                        if (c17367.readByte() == 0) {
                            c5325 = new C21489(this, this.f20708, c1590, c17367);
                        } else {
                            c5325 = new C5325(this, this.f20708, c1590, c17367);
                        }
                        m16674(c5325, true);
                        if (c17367.m40445() != iM40446) {
                            c17367.seek(iM40446);
                        }
                        break;
                    case 6:
                    case 8:
                        c17367.seek(iM40446);
                        if (c1590.f6398) {
                            str2 = c1590.f6374;
                            m16857(str2, true);
                            z2 = true;
                            if (c17367.m40445() != iM40446) {
                                c17367.seek(iM40446);
                            }
                        } else if (c17367.m40445() != iM40446) {
                            c17367.seek(iM40446);
                        }
                        break;
                    case 7:
                        c1590.f6392 = c17367.readInt();
                        c1590.f6400 = c17367.readInt();
                        m17005();
                        if (c17367.m40445() != iM40446) {
                            c17367.seek(iM40446);
                        }
                        break;
                    case 9:
                        if (z) {
                            c17367.seek(iM40446);
                        } else if (!c13190.m32638(c17367, iM40446) && c1590.f6398) {
                            str2 = c1590.f6374;
                            m16857(str2, true);
                            z2 = true;
                        }
                        if (c17367.m40445() != iM40446) {
                            c17367.seek(iM40446);
                        }
                        break;
                    case 10:
                        this.f20708.mo8719(c17367.readLong());
                        if (c17367.readLong() != this.f20708.mo8735().m4560()) {
                            this.f20708.mo8728(true);
                        }
                        if (c17367.m40445() != iM40446) {
                            c17367.seek(iM40446);
                        }
                        break;
                    case 11:
                        c19893.m45154(c17367);
                        c19892.m45154(c17367);
                        if (c17367.m40445() != iM40446) {
                            c17367.seek(iM40446);
                        }
                        break;
                    default:
                        System.out.println("Unknown instance state record type: " + ((int) b));
                        c17367.seek((long) iM40446);
                        break;
                }
            } else {
                if (z) {
                    System.out.println("Text's fastHashCode changed, reset all.");
                    c19893.m45151();
                    c19892.m45151();
                    m17043();
                    if (!z2) {
                        str = c1590.f6374;
                        m16857(str, true);
                    }
                } else {
                    this.f20764.m30727();
                    this.f20764.mo14805(m16978());
                    if (!z2 && c1590.f6398 && (!c13190.m32642() || !c13190.m32636((CharSequence) this.f20708))) {
                        str = c1590.f6374;
                        m16857(str, true);
                    }
                }
                if (c17367.m40445() != iM40445) {
                    c17367.seek(iM40445);
                }
                if (c17367.readInt() != -249340294) {
                    throw new RuntimeException();
                }
                postInvalidate();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m16749(C17367 c17367, int i) {
        int i2 = c17367.readInt();
        if (i2 < 0 || i2 > (i - c17367.m40445()) / 12) {
            throw new IllegalArgumentException("Invalid legacy undo count");
        }
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = c17367.readInt();
            if (i4 < 0 || i4 > (i - c17367.m40445()) / 28) {
                throw new IllegalArgumentException("Invalid legacy undo changes");
            }
            for (int i5 = 0; i5 < i4; i5++) {
                if (i - c17367.m40445() < 28) {
                    throw new IllegalArgumentException("Truncated legacy undo change");
                }
                c17367.skipBytes(20);
                for (int i6 = 0; i6 < 2; i6++) {
                    if (i - c17367.m40445() < 4) {
                        throw new IllegalArgumentException("Truncated legacy undo text");
                    }
                    int i7 = c17367.readInt();
                    if (i7 < 0 || i7 > i - c17367.m40445()) {
                        throw new IllegalArgumentException("Invalid legacy undo text length");
                    }
                    c17367.skipBytes(i7);
                }
            }
            if (i - c17367.m40445() < 8) {
                throw new IllegalArgumentException("Truncated legacy undo time");
            }
            c17367.skipBytes(8);
        }
    }

    static {
        ApplicationC6132.m17119(85);
        f20699 = new TextKeyListener(TextKeyListener.Capitalize.NONE, false);
        f20700 = C13932.m33769(120.0f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16875(InterfaceC15887 interfaceC15887) {
        this.f20753.add(interfaceC15887);
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final void m16915() {
        AbstractC15910 abstractC15910 = this.f20789;
        if (abstractC15910 != null) {
            abstractC15910.m37827();
        }
        ArrayList arrayList = this.f20753;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC15887) arrayList.get(i)).mo30239();
        }
        m16951();
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static int m16701(int i) {
        float f = i;
        float f2 = f / f20700;
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        return (int) (f * f2 * 0.5f);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m16987(int i, int i2) {
        m16801();
        m16732();
        this.f20854.removeMessages(1);
        this.f20718.forceFinished(true);
        m16759(i, i2);
    }

    /* JADX INFO: renamed from: ۘܰ, reason: not valid java name and contains not printable characters */
    public final int m16843() {
        return this.f20764.f41308.get(this.f20764.m30729(this.f20826 + 1)).f47316;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷ۖ, reason: not valid java name and contains not printable characters */
    public void m16787() {
        this.f20830 = SystemClock.uptimeMillis();
        HandlerC9910 handlerC9910 = this.f20854;
        handlerC9910.removeMessages(3);
        handlerC9910.sendEmptyMessageDelayed(3, 1500L);
        postInvalidate();
    }

    /* JADX INFO: renamed from: ܳۨ, reason: not valid java name and contains not printable characters */
    public final void m17003() {
        if (this.f20764.mo14788()) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            int i = (int) (jUptimeMillis - this.f20830);
            this.f20827 = false;
            if (i >= 0 && i <= 1500) {
                this.f20854.removeMessages(3);
                this.f20830 = jUptimeMillis - 1500;
                postInvalidate();
            }
            m16703();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۟ۖ, reason: not valid java name and contains not printable characters */
    public void m16703() {
        if (this.f20764.mo14788()) {
            this.f20803 = SystemClock.uptimeMillis();
            HandlerC9910 handlerC9910 = this.f20854;
            handlerC9910.removeMessages(5);
            handlerC9910.sendEmptyMessageDelayed(5, 1500L);
            postInvalidate();
        }
    }

    /* JADX INFO: renamed from: ۢۨ, reason: not valid java name and contains not printable characters */
    public final void m16944() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        int i = (int) (jUptimeMillis - this.f20803);
        this.f20754 = false;
        if (i >= 0 && i <= 1500) {
            this.f20854.removeMessages(5);
            this.f20803 = jUptimeMillis - 1500;
            postInvalidate();
        }
        m16787();
    }

    /* JADX INFO: renamed from: ᩸ܰ, reason: not valid java name and contains not printable characters */
    public final void m17054() {
        this.f20803 = 0L;
        this.f20830 = 0L;
        m16646();
        postInvalidate();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m16844(int i) {
        C1590 c1590 = this.f20794;
        if (c1590.f6398) {
            C13190 c13190 = this.f20770;
            if (c13190.m32642()) {
                return c13190.m32618(i, c1590.m17875());
            }
        }
        return c1590.m17875();
    }

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final String m17002() {
        return this.f20770.m32648();
    }

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public final List m16834() {
        int[] iArrM16971 = m16971();
        int iM6126 = C1877.m6126(iArrM16971[0], this.f20708);
        int iM6115 = C1877.m6115(iArrM16971[1], this.f20708);
        if (iM6115 < this.f20708.length()) {
            iM6115++;
        }
        return this.f20770.m32650(iM6126, iM6115);
    }

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5366 m16818() {
        return this.f20770.m32619();
    }

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13128 m16943() {
        return this.f20770.m32639();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m16919() {
        m16851(m16916(), m17020());
        InterfaceC8228 interfaceC8228 = this.f20726;
        if (interfaceC8228 != null) {
            interfaceC8228.mo3561(m16938(), m17037());
            this.f20726.mo3560(this.f20708.isChanged());
        }
        m17063();
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m17063() {
        if (this.f20741 == this.f20708 || this.f20710 == null) {
            return;
        }
        int iM16916 = m16916();
        int iM17020 = m17020();
        long jM32649 = this.f20770.m32649();
        if (jM32649 == Long.MIN_VALUE) {
            this.f20710.m3671(iM16916, iM17020);
        } else if (jM32649 == -1) {
            this.f20710.m3663(iM16916, iM17020);
        } else {
            this.f20710.m3664(iM16916, iM17020, (int) (jM32649 >>> 32), (int) jM32649);
        }
    }

    /* JADX INFO: renamed from: ᩸ۨ, reason: not valid java name and contains not printable characters */
    public final void m17053() {
        C0923 c0923 = this.f20710;
        if (c0923 != null) {
            c0923.m3663(m16916(), m17020());
        }
    }

    /* JADX INFO: renamed from: ۠ܰ, reason: not valid java name and contains not printable characters */
    public final void m16935() {
        C0923 c0923 = this.f20710;
        if (c0923 != null) {
            c0923.m3658();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16867(C9310 c9310) {
        this.f20711 = c9310;
    }

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public final String m16914() {
        C9310 c9310 = this.f20711;
        if (c9310 == null) {
            return m17016();
        }
        return C7236.m19292(c9310.f31583);
    }

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final String m17016() {
        InterfaceC2916 interfaceC2916 = this.f20708;
        int selectionStart = Selection.getSelectionStart(interfaceC2916);
        int selectionEnd = Selection.getSelectionEnd(interfaceC2916);
        if (selectionStart == selectionEnd || selectionStart == -1 || selectionEnd == -1) {
            return null;
        }
        if (selectionStart < selectionEnd) {
            return interfaceC2916.subSequence(selectionStart, selectionEnd).toString();
        }
        return interfaceC2916.subSequence(selectionEnd, selectionStart).toString();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m16951() {
        C2877 c2877 = this.f20831;
        if (c2877 != null) {
            c2877.m8665();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16862(InterfaceC3453 interfaceC3453) {
        this.f20771 = interfaceC3453;
        this.f20708.mo8721(interfaceC3453);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m16975() {
        int iM3661;
        int iM16916 = m16916();
        if (iM16916 != m17020() || (iM3661 = this.f20710.m3661(iM16916)) == -1) {
            return;
        }
        mo17029(iM3661);
        this.f20737 = SystemClock.uptimeMillis();
        m16890(iM3661, false);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m16838() {
        int[] iArrM3672;
        int iM16916 = m16916();
        if (iM16916 != m17020() || (iArrM3672 = this.f20710.m3672(iM16916)) == null) {
            return;
        }
        mo16839(iArrM3672[0], iArrM3672[1] + 1);
        m16819();
        m16992(false);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m16984() {
        Runnable runnable = this.f20829;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16855(Runnable runnable) {
        this.f20829 = runnable;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16881(InterfaceC19851 interfaceC19851) {
        this.f20780 = interfaceC19851;
    }

    /* JADX INFO: renamed from: ܶܰ, reason: not valid java name and contains not printable characters */
    public final boolean m17010() {
        return this.f20780 != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16863(C4327 c4327) {
        this.f20782 = c4327;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m17005() {
        C4327 c4327 = this.f20782;
        if (c4327 != null) {
            C1590 c1590 = this.f20794;
            int i = c1590.f6392;
            int i2 = c1590.f6400;
            C20556.m46348((C20556) c4327.f15522, i != i2 && i >= 0 && i2 >= 0);
        }
    }

    /* JADX INFO: renamed from: ᩷ۨ, reason: not valid java name and contains not printable characters */
    public final void m17047() {
        C1590 c1590 = this.f20794;
        int i = c1590.f6392;
        int i2 = c1590.f6400;
        if (i == i2 || i < 0 || i2 < 0) {
            return;
        }
        c1590.f6400 = -1;
        c1590.f6392 = -1;
        m17005();
        invalidate();
    }

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public final C17069 m16807() {
        C1590 c1590 = this.f20794;
        int i = c1590.f6392;
        int i2 = c1590.f6400;
        if (i == i2 || i < 0 || i2 < 0) {
            return null;
        }
        C17069 c17069 = new C17069();
        c17069.f54487 = i;
        c17069.f54486 = i2;
        return c17069;
    }

    /* JADX INFO: renamed from: ۤܰ, reason: not valid java name and contains not printable characters */
    public final boolean m16950() {
        EdgeEffect edgeEffect = this.f20724;
        if (edgeEffect != null && !edgeEffect.isFinished()) {
            return false;
        }
        EdgeEffect edgeEffect2 = this.f20777;
        if (edgeEffect2 != null && !edgeEffect2.isFinished()) {
            return false;
        }
        EdgeEffect edgeEffect3 = this.f20727;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            return false;
        }
        EdgeEffect edgeEffect4 = this.f20783;
        return edgeEffect4 == null || edgeEffect4.isFinished();
    }

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public final float m16939() {
        return this.f20794.m17870();
    }

    /* JADX INFO: renamed from: ᩹ۖ, reason: not valid java name and contains not printable characters */
    public final void m17059() {
        C2147 c2147 = this.f20731;
        if (c2147 != null) {
            c2147.m6701();
        }
        this.f20731 = new C2147(this);
        if (this.f20763 == null) {
            this.f20763 = new ViewTreeObserverOnGlobalLayoutListenerC10345(this);
            if (isAttachedToWindow()) {
                ViewTreeObserver viewTreeObserver = getViewTreeObserver();
                viewTreeObserver.addOnGlobalLayoutListener(this.f20763);
                viewTreeObserver.addOnScrollChangedListener(this.f20763);
            }
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public final C2147 m16816() {
        return this.f20731;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m17007(boolean z) {
        this.f20756 = z;
        if (z) {
            return;
        }
        m16790();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m16906(int i, boolean z) {
        this.f20836 = z;
        if (z) {
            this.f20832 = i;
        } else {
            m16790();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m16986(float f, float f2) {
        int i;
        this.f20824 = f;
        this.f20755 = f2;
        int iM16916 = m16916();
        int iM17020 = m17020();
        if (iM16916 <= iM17020) {
            iM17020 = iM16916;
            iM16916 = iM17020;
        }
        int iM30730 = this.f20764.m30730(getScrollX() + f, this.f20826 + f2);
        if (this.f20837 != iM30730 && (i = this.f20832) != iM30730) {
            this.f20837 = -1;
            if (i > iM30730) {
                if (iM17020 != iM30730) {
                    this.f20708.setSelection(iM30730, i);
                    invalidate();
                }
            } else if (iM16916 != iM30730) {
                this.f20708.setSelection(i, iM30730);
                invalidate();
            }
        }
        if (mo17022()) {
            m16736((int) (f + getPaddingLeft()), (int) (f2 + getPaddingTop()), this.f20794.f6417);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m16822(float f, float f2) {
        this.f20824 = f;
        this.f20755 = f2;
        int iM30730 = this.f20764.m30730(getScrollX() + f, this.f20826 + f2);
        if (iM30730 != Selection.getSelectionStart(this.f20708)) {
            this.f20708.setSelection(iM30730);
            invalidate();
            m16786(iM30730);
        }
        this.f20844 = SystemClock.uptimeMillis();
        m16835();
        int iM17870 = (int) this.f20794.m17870();
        boolean z = f2 < ((float) (-iM17870)) || f2 > ((float) (m16814() + iM17870));
        if (mo17022()) {
            if (!z) {
                m16736((int) (f + getPaddingLeft()), (int) (f2 + getPaddingTop()), 0);
            } else {
                m16790();
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m16961(float f, float f2) {
        this.f20824 = f;
        this.f20755 = f2;
        int iM16916 = m16916();
        int iM17020 = m17020();
        if (iM16916 <= iM17020) {
            iM17020 = iM16916;
            iM16916 = iM17020;
        }
        int iM30730 = this.f20764.m30730(getScrollX() + f, this.f20826 + f2);
        int i = this.f20832;
        boolean z = true;
        if (i != iM30730) {
            if (i > iM30730) {
                if (iM17020 != iM30730) {
                    this.f20708.setSelection(iM30730, i);
                    m16786(iM30730);
                    if (!this.f20805) {
                        this.f20805 = true;
                    }
                }
            } else if (iM16916 != iM30730) {
                this.f20708.setSelection(i, iM30730);
                m16786(iM30730);
                if (this.f20805) {
                    this.f20805 = false;
                }
            }
            this.f20844 = SystemClock.uptimeMillis();
            invalidate();
        }
        int iM17870 = (int) this.f20794.m17870();
        if (f2 >= (-iM17870) && f2 <= m16814() + iM17870) {
            z = false;
        }
        if (mo17022()) {
            if (!z) {
                m16736((int) (f + getPaddingLeft()), (int) (f2 + getPaddingTop()), 0);
            } else {
                m16790();
            }
        }
    }

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final int m16978() {
        return (getWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final int m16814() {
        return (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    /* JADX INFO: renamed from: ᩳܰ, reason: not valid java name and contains not printable characters */
    public final void m17028() {
        this.f20778.hideSoftInputFromWindow(getWindowToken(), 0);
    }

    /* JADX INFO: renamed from: ܽۨ, reason: not valid java name and contains not printable characters */
    public final void m17017() {
        this.f20778.restartInput(this);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m17069() {
        C2147 c2147 = this.f20731;
        if (c2147 != null) {
            this.f20844 = 0L;
            c2147.m6701();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m16962(String str) {
        this.f20764.mo14785(str);
        invalidate();
    }

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final String m17032() {
        return this.f20764.f41300;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        return this.f20764 == null ? getHeight() : Math.max(getHeight(), (int) this.f20764.m30743());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setScrollY(this.f20826);
        accessibilityEvent.setMaxScrollY(this.f20764 == null ? 0 : m17012());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEditable(true);
    }

    @Override // android.view.View
    public final CharSequence getAccessibilityClassName() {
        return EditText.class.getName();
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (Build.VERSION.SDK_INT < 34 || !isAccessibilityDataSensitive() || accessibilityEvent.isAccessibilityDataSensitive()) {
            CharSequence charSequenceSubSequence = this.f20708;
            if (TextUtils.isEmpty(charSequenceSubSequence)) {
                charSequenceSubSequence = this.f20764.f41300;
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
        if (action == 4 || action == 6 || (!m17004() && m16709())) {
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
                    int iM30730 = this.f20764.m30730(getScrollX() + x, this.f20826 + y);
                    if (iM30730 != m16916() || iM30730 != m17020()) {
                        this.f20708.setSelection(iM30730);
                        m16890(iM30730, true);
                    }
                    invalidate();
                    if (mo17022()) {
                        m16736((int) x, (int) y, this.f20794.f6417);
                        return true;
                    }
                    return true;
                case 3:
                    ClipData clipData = dragEvent.getClipData();
                    if (clipData.getItemCount() > 0) {
                        CharSequence charSequenceM5421 = C1590.m5421(clipData.getItemAt(0).getText());
                        int[] iArrM16971 = m16971();
                        this.f20708.replace(iArrM16971[0], iArrM16971[1], charSequenceM5421);
                        int length = charSequenceM5421.length() + iArrM16971[0];
                        iArrM16971[1] = length;
                        mo16839(iArrM16971[0], length);
                        invalidate();
                        return true;
                    }
                    return true;
                case 4:
                    if (mo17022()) {
                        m16790();
                    }
                    this.f20810 = false;
                    invalidate();
                    return true;
                case 5:
                    if (mo17022()) {
                        m16736((int) dragEvent.getX(), (int) dragEvent.getY(), this.f20794.f6417);
                    }
                    this.f20810 = true;
                    invalidate();
                    return true;
                case 6:
                    if (mo17022()) {
                        m16790();
                    }
                    this.f20810 = false;
                    invalidate();
                    return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢܰ, reason: not valid java name and contains not printable characters */
    public final boolean m16945() {
        return this.f20756;
    }

    /* JADX INFO: renamed from: ۛܰ, reason: not valid java name and contains not printable characters */
    public final boolean m16918() {
        return this.f20836;
    }

    /* JADX INFO: renamed from: ۧܰ, reason: not valid java name and contains not printable characters */
    public final boolean m16954() {
        return this.f20805;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m16666(C6111 c6111, C6111 c6112) {
        if (c6111 == c6112) {
            throw new IllegalArgumentException();
        }
        c6111.f20736 = c6112;
        c6112.f20736 = c6111;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m16743(C6111 c6111, C6111 c6112) {
        if (c6111.f20752) {
            c6112.f20830 = SystemClock.uptimeMillis();
        } else if (c6112.f20752) {
            c6111.f20830 = SystemClock.uptimeMillis();
        } else {
            long jMax = Math.max(c6111.f20830, c6112.f20830);
            c6112.f20830 = jMax;
            c6111.f20830 = jMax;
        }
        if (c6111.f20821) {
            c6112.f20803 = SystemClock.uptimeMillis();
        } else {
            if (c6112.f20821) {
                c6111.f20803 = SystemClock.uptimeMillis();
                return;
            }
            long jMax2 = Math.max(c6111.f20803, c6112.f20803);
            c6112.f20803 = jMax2;
            c6111.f20803 = jMax2;
        }
    }

    /* JADX INFO: renamed from: ۧۨ, reason: not valid java name and contains not printable characters */
    public final void m16953() {
        if (!this.f20712) {
            this.f20712 = true;
            C11815.m29485(this.f20727);
            C11815.m29485(this.f20783);
            EdgeEffect edgeEffect = this.f20724;
            if (edgeEffect != null) {
                C11815.m29485(edgeEffect);
            }
            EdgeEffect edgeEffect2 = this.f20777;
            if (edgeEffect2 != null) {
                C11815.m29485(edgeEffect2);
            }
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m16812(int i, int i2) {
        this.f20799 = i;
        this.f20847 = i2;
        this.f20790.m50804();
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
    /* JADX INFO: renamed from: ۖۖ, reason: not valid java name and contains not printable characters */
    public final void m16829() {
        boolean z;
        boolean z2;
        boolean z3;
        ?? r1;
        int i;
        if ((this.f20799 & 3) == 0 || this.f20764 == null || m16973() || !this.f20778.isActive(this)) {
            return;
        }
        int i2 = this.f20847;
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
        CursorAnchorInfo.Builder builder = this.f20773;
        builder.reset();
        int iM16916 = m16916();
        builder.setSelectionRange(iM16916, m17020());
        if (i3 >= 29) {
            this.f20746.reset();
            transformMatrixToGlobal(this.f20746);
            builder.setMatrix(this.f20746);
        } else {
            this.f20746.set(getMatrix());
            getLocationOnScreen(this.f20786);
            Matrix matrix = this.f20746;
            int[] iArr = this.f20786;
            matrix.postTranslate(iArr[0], iArr[1]);
            builder.setMatrix(this.f20746);
        }
        if (z5 && i3 >= 34) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            builder.setEditorBoundsInfo(new EditorBoundsInfo.Builder().setEditorBounds(rectF).setHandwritingBounds(new RectF(-getHandwritingBoundsOffsetLeft(), -getHandwritingBoundsOffsetTop(), getHandwritingBoundsOffsetRight() + getWidth(), getHandwritingBoundsOffsetBottom() + getHeight())).build());
        }
        if (z6 || z7) {
            float paddingLeft = getPaddingLeft() - getScrollX();
            float paddingTop = getPaddingTop() - this.f20826;
            RectF rectF2 = new RectF();
            RectF rectF3 = new RectF(getPaddingLeft(), getPaddingRight(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            if (z6) {
                InterfaceC2916 interfaceC2916 = this.f20708;
                int composingSpanStart = BaseInputConnection.getComposingSpanStart(interfaceC2916);
                int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(interfaceC2916);
                if (composingSpanEnd < composingSpanStart) {
                    i = composingSpanStart;
                    composingSpanStart = composingSpanEnd;
                } else {
                    i = composingSpanEnd;
                }
                if (composingSpanStart >= 0 && composingSpanStart < i) {
                    builder.setComposingText(composingSpanStart, interfaceC2916.subSequence(composingSpanStart, i));
                    int i4 = composingSpanStart;
                    while (i4 < i) {
                        this.f20764.mo30739(rectF2, i4);
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
            if (z7 && iM16916 >= 0) {
                this.f20764.mo30739(rectF2, iM16916);
                rectF2.offset(paddingLeft, paddingTop);
                boolean zIntersects = RectF.intersects(rectF3, rectF2);
                if (!rectF3.contains(rectF2)) {
                    r1 = zIntersects;
                    r1 = (zIntersects ? 1 : 0) | 2;
                }
                r1 = zIntersects;
                float f = rectF2.left;
                float f2 = rectF2.top;
                builder.setInsertionMarkerLocation(f, f2, this.f20794.m17851() + f2, rectF2.bottom, r1 == true ? 1 : 0);
            }
        }
        this.f20778.updateCursorAnchorInfo(this, builder.build());
        this.f20799 &= -2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m16661(C6111 c6111, Runnable runnable) {
        if (c6111.m16973()) {
            if (c6111.isAttachedToWindow()) {
                C16737.m39267(100L, runnable);
                return;
            }
            return;
        }
        runnable.run();
    }

    /* JADX INFO: renamed from: ۜܰ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger m16925() {
        return this.f20717;
    }

    /* JADX INFO: renamed from: ᩹ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m17061() {
        return this.f20717.get() > 0;
    }

    /* JADX INFO: renamed from: ᩶ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m17044() {
        return this.f20787;
    }

    /* JADX INFO: renamed from: ۙۖ, reason: not valid java name and contains not printable characters */
    public final void m16901() {
        if (this.f20787) {
            throw new IllegalStateException();
        }
        this.f20708.getClass();
        this.f20787 = true;
        this.f20825.m31940(this.f20708);
        this.f20770.m32659();
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final void m16833() {
        if (!this.f20787) {
            throw new IllegalStateException();
        }
        this.f20787 = false;
        if (m16809()) {
            this.f20825.m31935(this.f20708);
            this.f20708.mo8730();
            C18105 c18105 = this.f20728;
            C13638.requireNonNull(c18105);
            C16737.m39273(new RunnableC14476(c18105));
            return;
        }
        if (this.f20770.m32642()) {
            this.f20770.m32652((InterfaceC0507) this.f20708);
        }
        this.f20825.m31935(this.f20708);
        this.f20708.mo8730();
        m16851(m16916(), m17020());
        m17063();
        this.f20750 = -1.0f;
    }

    @Override // l.InterfaceC11612
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo9107(float f, float f2) {
        AbstractC12359 abstractC12359 = this.f20764;
        boolean z = abstractC12359.f41301;
        boolean z2 = abstractC12359.f41319;
        if (!z && !z2) {
            return false;
        }
        int[] iArr = this.f20742;
        getLocationOnScreen(iArr);
        float scrollX = ((f + getScrollX()) - getPaddingLeft()) - iArr[0];
        float fM30752 = this.f20764.m30752(f2 - iArr[1]);
        if (z && this.f20764.f41318.m49671(scrollX, fM30752)) {
            return true;
        }
        return z2 && this.f20764.f41323.m49671(scrollX, fM30752);
    }

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final C9640 m17008() {
        return this.f20703;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16868(C9640 c9640) {
        this.f20703 = c9640;
    }
}
