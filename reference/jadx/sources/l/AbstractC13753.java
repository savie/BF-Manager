package l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.text.Selection;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.۬ۡ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: UAZD */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13753 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f43630;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f43631;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f43632;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public final RectF f43633;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f43634;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f43635;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C6909 f43636;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f43637;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final Runnable f43638;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f43639;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public C14540 f43640;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final Rect f43641;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C15508 f43642;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C6909 f43643;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f43644;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f43645;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public InterfaceC19106 f43646;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public volatile C15508 f43647;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final int[] f43648;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C8533 f43649;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final RectF f43650;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Rect f43651;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f43652;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f43653;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Object f43654;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C17350 f43655;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public volatile C15180 f43656;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public boolean f43657;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C23073 f43658;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C24132 f43659;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public volatile int f43660;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C23073 f43661;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f43662;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public volatile boolean f43663;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C10155 f43664;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public boolean f43665;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final ArrayList f43666;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C15112 f43667;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC19106 f43668;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f43669;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile boolean f43670;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public boolean f43671;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f43672;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public String f43673;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f43674;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final RectF f43675;

    /* JADX INFO: renamed from: ֨ */
    public abstract int mo25216();

    /* JADX INFO: renamed from: ֫ */
    public abstract byte mo25217();

    /* JADX INFO: renamed from: ۘ */
    public abstract void mo25219();

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo25220(C7042 c7042);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo25221(float f);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo25222(int i, int i2, int i3);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo33622(Canvas canvas, int i, float f, int i2, C10232 c10232) {
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract boolean mo25225();

    /* JADX INFO: renamed from: ۛ */
    public boolean mo25226() {
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    public abstract float mo25232();

    /* JADX INFO: renamed from: ۨ */
    public boolean mo25233() {
        return false;
    }

    /* JADX INFO: renamed from: ܰ */
    public abstract void mo25235();

    /* JADX INFO: renamed from: ܳ */
    public void mo25236(int i) {
    }

    /* JADX INFO: renamed from: ܿ */
    public abstract Throwable mo25238();

    /* JADX INFO: renamed from: ᩷ */
    public abstract void mo25241();

    /* JADX INFO: renamed from: ᩷ */
    public abstract void mo25242(InterfaceC19106 interfaceC19106);

    /* JADX INFO: renamed from: ᩷ */
    public abstract boolean mo25244(C7042 c7042);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C15508 m33642() {
        C15508 c15508Mo15350;
        synchronized (this.f43654) {
            C15508 c15508 = this.f43642;
            c15508Mo15350 = c15508 == null ? this.f43646.mo15350() : c15508.m37172();
        }
        return c15508Mo15350;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m33651() {
        boolean z;
        synchronized (this.f43654) {
            z = this.f43642 != null;
        }
        return z;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int m33631() {
        return this.f43660;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo33625(RectF rectF, int i) {
        float fM45254;
        float f;
        if (i < 0) {
            i = 0;
        } else {
            int i2 = this.f43662;
            if (i > i2) {
                i = i2;
            }
        }
        int iM33619 = m33619(i, this.f43657);
        C14366 c14366 = this.f43643.get(iM33619);
        float fM33640 = m33640(iM33619);
        int iMin = Math.min(i, c14366.m34799());
        int i3 = c14366.f45295;
        int i4 = c14366.f45294;
        C14540 c14540 = this.f43640;
        if (i3 == i4) {
            fM45254 = c14540.f45786;
            f = 0.0f;
        } else {
            C15508 c15508Mo15350 = this.f43646.mo15350();
            try {
                C19608 c19608M33600 = m33600(c14366.f45295, c14366.m34799(), c15508Mo15350);
                float fM45255 = c19608M33600.m45254(Float.POSITIVE_INFINITY, iMin);
                if (c14366.m34799() <= iMin) {
                    fM45254 = c14540.f45786 + fM45255;
                } else {
                    fM45254 = c19608M33600.m45254(Float.POSITIVE_INFINITY, C1709.m6073(iMin, c14366.m34799(), c15508Mo15350));
                }
                c15508Mo15350.close();
                f = fM45255;
            } catch (Throwable th) {
                try {
                    c15508Mo15350.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        rectF.left = f + fM33640;
        rectF.right = fM45254 + fM33640;
        m33609(rectF, iM33619);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m33638() {
        return this.f43662;
    }

    /* JADX INFO: renamed from: ᩴ */
    public boolean mo25239(int i, int i2) {
        int i3 = this.f43662;
        int iMax = Math.max(0, i);
        int iMin = Math.min(i3, i2);
        if (iMax < iMin && !this.f43643.isEmpty() && !this.f43655.isEmpty()) {
            int iM33619 = m33619(iMax, true);
            int iM336110 = m33619(iMin - 1, false);
            int iM19188 = this.f43643.m19188(iM33619);
            int iM19189 = this.f43643.m19188(iM336110) + 1;
            int iM19185 = this.f43643.m19185(iM33619);
            int iM16214 = this.f43640.m16214();
            C15508 c15508Mo15350 = this.f43646.mo15350();
            for (int i4 = iM19188; i4 < iM19189; i4++) {
                try {
                    iM19185 = this.f43643.m19186(i4, iM19185);
                    if (iM19185 == -1 || i4 >= this.f43655.size()) {
                        break;
                        break;
                    }
                    this.f43655.m40743(i4, this, c15508Mo15350, this.f43643.m19176(iM19185), iM16214);
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
            this.f43655.m40749(iM19188, iM19189);
            this.f43667.f49323 = Integer.MIN_VALUE;
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m33645(RectF rectF, int i) {
        if (i < 0) {
            i = 0;
        } else {
            int i2 = this.f43662;
            if (i > i2) {
                i = i2;
            }
        }
        m33609(rectF, m33619(i, this.f43657));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m33648(int i, int i2) {
        if (i < 0) {
            i = 0;
        } else {
            int i3 = this.f43662;
            if (i > i3) {
                i = i3;
            }
        }
        if (i2 < 0) {
            i2 = 0;
        } else {
            int i4 = this.f43662;
            if (i2 > i4) {
                i2 = i4;
            }
        }
        return m33619(i, this.f43657) == m33619(i2, this.f43657);
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m33641() {
        return this.f43646 != null && this.f43660 == this.f43646.mo15344();
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final void m33612() {
        synchronized (this.f43654) {
            C15508 c15508 = this.f43642;
            if (c15508 != null) {
                c15508.close();
                this.f43642 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33627(InterfaceC19106 interfaceC19106, C15508 c15508) {
        synchronized (this.f43654) {
            m33612();
            this.f43646 = interfaceC19106;
            this.f43642 = c15508;
            this.f43660 = c15508.m37177();
            this.f43662 = c15508.length();
        }
        m33637();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m33605(AbstractC13753 abstractC13753) {
        abstractC13753.f43632.set(false);
        abstractC13753.m33597();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m33633() {
        int i;
        if (this instanceof C9670) {
            i = ((C9670) this).m25227() ? 1 : 2;
        } else {
            i = 0;
        }
        this.f43656 = this.f43659.m54002(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC13753 m33599(C24132 c24132, InterfaceC19106 interfaceC19106, C14540 c14540, int i) {
        if (i == 0) {
            return new C22572(c24132, interfaceC19106, c14540);
        }
        return new C9670(c24132, interfaceC19106, c14540, i == 1);
    }

    public AbstractC13753(C24132 c24132, C14540 c14540) {
        this.f43631 = C6907.m19160(10.0f);
        this.f43654 = new Object();
        this.f43639 = new AtomicInteger();
        this.f43632 = new AtomicBoolean();
        this.f43638 = new RunnableC9278(0, this);
        this.f43649 = new C8533(this);
        this.f43643 = new C6909();
        this.f43655 = new C17350();
        this.f43636 = new C6909();
        this.f43644 = -1;
        this.f43657 = true;
        this.f43633 = new RectF();
        this.f43650 = new RectF();
        this.f43675 = new RectF();
        this.f43658 = new C23073(-1);
        this.f43661 = new C23073(1);
        this.f43667 = new C15112();
        this.f43664 = new C10155();
        this.f43669 = new int[3];
        this.f43648 = new int[7];
        this.f43651 = new Rect();
        this.f43641 = new Rect();
        this.f43666 = new ArrayList(2);
        this.f43663 = false;
        this.f43653 = false;
        this.f43659 = c24132;
        this.f43640 = c14540;
        this.f43656 = c24132.m54039();
    }

    public AbstractC13753(C24132 c24132, InterfaceC19106 interfaceC19106, C14540 c14540, C20348 c20348) {
        this.f43631 = C6907.m19160(10.0f);
        this.f43654 = new Object();
        this.f43639 = new AtomicInteger();
        this.f43632 = new AtomicBoolean();
        this.f43638 = new RunnableC9278(0, this);
        this.f43649 = new C8533(this);
        this.f43643 = new C6909();
        this.f43655 = new C17350();
        this.f43636 = new C6909();
        this.f43644 = -1;
        this.f43657 = true;
        this.f43633 = new RectF();
        this.f43650 = new RectF();
        this.f43675 = new RectF();
        this.f43658 = new C23073(-1);
        this.f43661 = new C23073(1);
        this.f43667 = new C15112();
        this.f43664 = new C10155();
        this.f43669 = new int[3];
        this.f43648 = new int[7];
        this.f43651 = new Rect();
        this.f43641 = new Rect();
        this.f43666 = new ArrayList(2);
        this.f43663 = false;
        this.f43653 = false;
        this.f43659 = c24132;
        this.f43640 = c14540;
        this.f43656 = c24132.m54039();
        this.f43630 = c20348.readInt();
        int i = c20348.readInt();
        this.f43643.getClass();
        boolean zM46746 = c20348.m46746(-249333469);
        C14366 c14366 = new C14366();
        for (int i2 = 0; i2 < i; i2++) {
            c14366.m34800(c20348.readInt(), c20348.readInt(), c20348.readInt());
            this.f43643.m19173(c14366);
            if (!zM46746) {
                c20348.skipBytes(4);
            }
        }
        if (c20348.m46746(1916422180)) {
            int i3 = c20348.readInt();
            for (int i4 = 0; i4 < i3; i4++) {
                this.f43655.add(c20348.m46749() | ((c20348.readByte() & 255) << 16));
            }
            this.f43655.m40746();
            return;
        }
        this.f43655.m40744(this, interfaceC19106, this.f43643, c14540.m16214());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33626(InterfaceC19106 interfaceC19106) {
        synchronized (this.f43654) {
            if (this.f43642 == null || this.f43646 != interfaceC19106) {
                m33627(interfaceC19106, interfaceC19106.mo15350());
            }
        }
        m33637();
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m33637() {
        if (this instanceof C22572) {
            ((C22572) this).m50891();
        }
        this.f43639.incrementAndGet();
        if (this.f43647 == null) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            m33597();
        } else if (this.f43632.compareAndSet(false, true)) {
            C21576.m49068(this.f43638);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m33597() {
        if (this.f43674) {
            return;
        }
        if (this.f43637 == this.f43639.get() && this.f43668 == this.f43646) {
            return;
        }
        C15508 c15508 = this.f43647;
        this.f43647 = null;
        this.f43668 = null;
        if (c15508 != null) {
            c15508.close();
        }
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    private C15508 m33607() {
        InterfaceC19106 interfaceC19106 = this.f43646;
        int i = this.f43639.get();
        if (this.f43647 == null || this.f43668 != interfaceC19106 || this.f43637 != i || !interfaceC19106.mo15342(this.f43647)) {
            C15508 c15508 = this.f43647;
            this.f43647 = null;
            this.f43668 = null;
            if (c15508 != null) {
                c15508.close();
            }
            this.f43668 = interfaceC19106;
            this.f43637 = i;
            this.f43647 = interfaceC19106.mo15350();
            this.f43647.f50487 = true;
        }
        return this.f43647;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m33647() {
        if (this.f43643.isEmpty() || this.f43643.m19187().f45294 != this.f43662) {
            System.err.println("Lines check fail. Try fix.");
            mo25242(this.f43646);
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo25223(String str) {
        this.f43673 = str;
        this.f43645 = str != null && str.indexOf(10) >= 0;
        if (str == null || str.isEmpty()) {
            this.f43636.clear();
            return;
        }
        C6909 c6909 = new C6909();
        C14366 c14366 = new C14366();
        boolean z = true;
        int i = 0;
        int i2 = 0;
        while (z) {
            int iIndexOf = this.f43659.mo52320() ? -1 : str.indexOf(10, i);
            if (iIndexOf == -1) {
                iIndexOf = str.length();
                z = false;
            }
            c14366.m34800(i, iIndexOf, i2);
            c6909.m19173(c14366);
            i = iIndexOf + 1;
            i2++;
        }
        this.f43636 = c6909;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final double m33639() {
        boolean zM33650 = m33650();
        C24132 c24132 = this.f43659;
        AbstractC17787 abstractC17787 = c24132.f78113;
        return (((double) this.f43640.m16189()) * ((double) (zM33650 ? this.f43636 : this.f43643).size())) + ((double) Math.max(c24132.m53995(), abstractC17787 != null ? abstractC17787.m41618() : 0));
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int mo33635() {
        C14540 c14540 = this.f43640;
        boolean z = c14540.f45816;
        int i = c14540.f45797;
        if (z) {
            return c14540.f45769 ? this.f43630 + c14540.f45793 : c14540.f45789;
        }
        if (c14540.f45777) {
            return i + c14540.f45793;
        }
        return Math.max(c14540.f45793, i);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final float m33640(int i) {
        int iMo33635 = mo33635();
        if (mo25226() && !this.f43643.m19177(i)) {
            iMo33635 += this.f43640.m35087();
        }
        return iMo33635 + m33614(false);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private int m33608(boolean z) {
        C24132 c24132 = this.f43659;
        if (!(c24132 instanceof C23255)) {
            return 0;
        }
        C23255 c23255 = (C23255) c24132;
        if (c24132.f78022 != this || !(this instanceof C22572) || !m33641() || this.f43643.size() != 1) {
            return 0;
        }
        if (!z || (!this.f43645 && this.f43636.size() == 1)) {
            return c23255.m52318();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m33614(boolean z) {
        if ((m33608(z) & 7) == 1) {
            float fM50893 = ((C22572) this).m50893(z);
            if (fM50893 >= 0.0f) {
                return Math.max(0.0f, (((this.f43659.m54108() - mo33635()) - mo33629()) - fM50893) / 2.0f);
            }
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final float m33644(boolean z) {
        if ((m33608(z) & UMErrorCode.E_UM_BE_DEFLATE_FAILED) != 16) {
            return 0.0f;
        }
        return Math.max(0.0f, (this.f43659.m53993() - this.f43640.m16189()) / 2.0f);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int mo33629() {
        C14540 c14540 = this.f43640;
        boolean z = c14540.f45816;
        int i = c14540.f45797;
        if (!z) {
            return c14540.f45769 ? this.f43630 + c14540.f45793 : c14540.f45789;
        }
        if (c14540.f45777) {
            return i + c14540.f45793;
        }
        return Math.max(c14540.f45793, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m33617(int i) {
        float length = String.valueOf(((long) this.f43643.m19187().f45296) + 1 + ((long) i)).length() + 1;
        C14540 c14540 = this.f43640;
        return (int) ((length + c14540.f45792) * c14540.f45776);
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final void m33630() {
        this.f43657 = true;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean m33613() {
        return this.f43657;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m33616(float f, float f2) {
        this.f43634 = false;
        int iM33615 = m33615(f2);
        if (f <= m33640(iM33615)) {
            return m33620(this.f43646, iM33615, f);
        }
        C15508 c15508Mo15350 = this.f43646.mo15350();
        try {
            int iM33620 = m33620(c15508Mo15350, iM33615, f);
            c15508Mo15350.close();
            return iM33620;
        } catch (Throwable th) {
            try {
                c15508Mo15350.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m33615(double d) {
        int iM33644 = (int) ((d - ((double) m33644(false))) / ((double) this.f43640.m16189()));
        if (iM33644 < 0) {
            this.f43634 = true;
            return 0;
        }
        if (iM33644 < this.f43643.size()) {
            return iM33644;
        }
        this.f43634 = true;
        return this.f43643.m19178();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m33598(double d, boolean z) {
        int iM33644 = (int) ((d - ((double) m33644(z))) / ((double) this.f43640.m16189()));
        if (iM33644 < 0) {
            return 0;
        }
        if (z) {
            return iM33644 >= this.f43636.size() ? this.f43636.m19178() : iM33644;
        }
        return iM33644 >= this.f43643.size() ? this.f43643.m19178() : iM33644;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m33620(CharSequence charSequence, int i, float f) {
        float fM33640 = f - m33640(i);
        C14366 c14366 = this.f43643.get(i);
        int i2 = c14366.f45295;
        int iM34799 = c14366.m34799();
        boolean z = true;
        if (fM33640 <= 0.0f) {
            this.f43657 = true;
            return i2;
        }
        C19608 c19608M33600 = m33600(i2, iM34799, charSequence);
        int iM45255 = c19608M33600.m45255(fM33640);
        if (iM45255 == iM34799) {
            this.f43634 = fM33640 > c19608M33600.m45253();
        }
        if (iM45255 != i2 && !this.f43643.m19174(i)) {
            z = false;
        }
        this.f43657 = z;
        return iM45255;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C19608 m33600(int i, int i2, CharSequence charSequence) {
        C14540 c14540 = this.f43640;
        if (c14540.m16226() == null && c14540.f45755) {
            C24132 c24132 = this.f43659;
            if (c24132.f78033.m4816()) {
                return c24132.f78033.m4796(i, i2, c14540, charSequence);
            }
        }
        return this.f43640.m16196(charSequence, i, i2, 0.0f, (C0568) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m33628(RectF rectF) {
        int selectionStart = Selection.getSelectionStart(this.f43646);
        int selectionEnd = Selection.getSelectionEnd(this.f43646);
        if (selectionStart == selectionEnd) {
            return false;
        }
        if (selectionStart > selectionEnd) {
            selectionEnd = selectionStart;
            selectionStart = selectionEnd;
        }
        int iM33619 = m33619(selectionStart, this.f43657);
        C14366 c14366 = this.f43643.get(iM33619);
        if (c14366.f45295 >= selectionEnd || selectionEnd > c14366.f45294) {
            return false;
        }
        float fM33640 = m33640(iM33619);
        C15508 c15508Mo15350 = this.f43646.mo15350();
        try {
            C19608 c19608M33600 = m33600(c14366.f45295, c14366.m34799(), c15508Mo15350);
            float fM45254 = c19608M33600.m45254(Float.POSITIVE_INFINITY, Math.min(selectionStart, c14366.m34799()));
            float fM45255 = c19608M33600.m45254(Float.POSITIVE_INFINITY, Math.min(selectionEnd, c14366.m34799()));
            rectF.left = fM45254 + fM33640;
            rectF.right = fM45255 + fM33640;
            c15508Mo15350.close();
            m33609(rectF, iM33619);
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

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m33609(RectF rectF, int i) {
        float fM16189 = this.f43640.m16189();
        float fM33644 = (i * fM16189) + m33644(false);
        rectF.top = fM33644;
        rectF.bottom = fM33644 + fM16189;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m33646(int i) {
        return m33619(i, this.f43657);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m33619(int i, boolean z) {
        int i2;
        C14366 c14366M42205;
        int i3;
        int i4 = 0;
        if (i <= 0) {
            return 0;
        }
        if (i >= this.f43643.m19187().f45294) {
            return this.f43643.m19178();
        }
        C6909 c6909 = this.f43643;
        int size = c6909.size();
        C18096 c18096M19181 = c6909.m19181();
        while (true) {
            i2 = (i4 + size) >>> 1;
            c14366M42205 = c18096M19181.m42205(i2);
            i3 = c14366M42205.f45295;
            if (i >= i3) {
                int i5 = c14366M42205.f45294;
                if (i >= i5) {
                    if (i4 == i2) {
                        if (i == i5) {
                            break;
                        }
                        throw new RuntimeException();
                    }
                    i4 = i2;
                } else {
                    break;
                }
            } else {
                size = i2;
            }
        }
        if (i != i3 || c6909.m19177(i2)) {
            return (i == c14366M42205.f45294 && !c6909.m19174(i2) && z) ? i2 + 1 : i2;
        }
        return z ? i2 : i2 - 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22968 m33621(C15508 c15508, int i, int i2) {
        if (this.f43659.mo52320()) {
            i = i2;
        }
        return c15508.m37173(i, i2);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m33649() {
        return this.f43665;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m33636() {
        return this.f43671;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final float m33643(float f) {
        C24132 c24132 = this.f43659;
        return (f - c24132.getPaddingTop()) + (c24132.m54026() - this.f43652);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final float m33632(int i) {
        return (float) ((((double) i) * ((double) this.f43640.m16189())) - ((double) this.f43652));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33623(Canvas canvas, int i, int i2, int i3, int i4) {
        canvas.drawColor(this.f43640.f45799);
        m33601(canvas, i, i2, i3, i4, i3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33624(Canvas canvas, int i, int i2, int i3, int i4, int i5, int i6, C2567 c2567, C1314 c1314, C2937 c2937, C17243 c17243) {
        C24132 c24132 = this.f43659;
        C8533 c8533 = this.f43649;
        if (this instanceof C22572) {
            ((C22572) this).m50895(i2, i4);
        }
        this.f43674 = true;
        int iSave = canvas.save();
        this.f43652 = c24132.m54026() - c24132.getScrollY();
        try {
            m33611(canvas, i, i2, i3, i4, i5, i6, c2567, c1314, c2937, c17243);
            canvas.restoreToCount(iSave);
            c8533.f27879 = null;
            c8533.f27876 = null;
            c8533.f27880 = null;
            this.f43674 = false;
            m33597();
        } catch (Throwable th) {
            canvas.restoreToCount(iSave);
            c8533.f27879 = null;
            c8533.f27876 = null;
            c8533.f27880 = null;
            this.f43674 = false;
            C15508 c15508 = this.f43647;
            this.f43647 = null;
            this.f43668 = null;
            if (c15508 != null) {
                c15508.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:126:0x036b  */
    /* JADX WARN: Code duplicated, block: B:129:0x0384  */
    /* JADX WARN: Code duplicated, block: B:131:0x038a  */
    /* JADX WARN: Code duplicated, block: B:135:0x039a  */
    /* JADX WARN: Code duplicated, block: B:138:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:140:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:141:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:143:0x0410  */
    /* JADX WARN: Code duplicated, block: B:145:0x0441 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:146:0x0443  */
    /* JADX WARN: Code duplicated, block: B:148:0x0472  */
    /* JADX WARN: Code duplicated, block: B:149:0x0477  */
    /* JADX WARN: Code duplicated, block: B:151:0x0483  */
    /* JADX WARN: Code duplicated, block: B:152:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:155:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:158:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:15:0x009c  */
    /* JADX WARN: Code duplicated, block: B:160:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:162:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:163:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:164:0x0503  */
    /* JADX WARN: Code duplicated, block: B:166:0x0507  */
    /* JADX WARN: Code duplicated, block: B:168:0x050d  */
    /* JADX WARN: Code duplicated, block: B:16:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:170:0x0518  */
    /* JADX WARN: Code duplicated, block: B:174:0x053f  */
    /* JADX WARN: Code duplicated, block: B:175:0x0544  */
    /* JADX WARN: Code duplicated, block: B:177:0x054a  */
    /* JADX WARN: Code duplicated, block: B:178:0x055d  */
    /* JADX WARN: Code duplicated, block: B:181:0x057a  */
    /* JADX WARN: Code duplicated, block: B:184:0x0587  */
    /* JADX WARN: Code duplicated, block: B:185:0x058a  */
    /* JADX WARN: Code duplicated, block: B:188:0x059e  */
    /* JADX WARN: Code duplicated, block: B:18:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:190:0x05a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:195:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:199:0x05ce  */
    /* JADX WARN: Code duplicated, block: B:19:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:200:0x0606  */
    /* JADX WARN: Code duplicated, block: B:203:0x062b  */
    /* JADX WARN: Code duplicated, block: B:204:0x0642  */
    /* JADX WARN: Code duplicated, block: B:208:0x0669  */
    /* JADX WARN: Code duplicated, block: B:210:0x0675  */
    /* JADX WARN: Code duplicated, block: B:212:0x067b  */
    /* JADX WARN: Code duplicated, block: B:213:0x067d  */
    /* JADX WARN: Code duplicated, block: B:215:0x0686  */
    /* JADX WARN: Code duplicated, block: B:218:0x06b8  */
    /* JADX WARN: Code duplicated, block: B:219:0x06bf  */
    /* JADX WARN: Code duplicated, block: B:222:0x06d9  */
    /* JADX WARN: Code duplicated, block: B:224:0x06e4  */
    /* JADX WARN: Code duplicated, block: B:225:0x06ea  */
    /* JADX WARN: Code duplicated, block: B:229:0x06fd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:22:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:236:0x0722  */
    /* JADX WARN: Code duplicated, block: B:238:0x072c  */
    /* JADX WARN: Code duplicated, block: B:23:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:246:0x0789 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:251:0x0799  */
    /* JADX WARN: Code duplicated, block: B:253:0x07a3  */
    /* JADX WARN: Code duplicated, block: B:255:0x07bb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:26:0x0131  */
    /* JADX WARN: Code duplicated, block: B:271:0x07fa  */
    /* JADX WARN: Code duplicated, block: B:275:0x0805  */
    /* JADX WARN: Code duplicated, block: B:277:0x080b  */
    /* JADX WARN: Code duplicated, block: B:279:0x0815  */
    /* JADX WARN: Code duplicated, block: B:27:0x0134  */
    /* JADX WARN: Code duplicated, block: B:280:0x081c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:283:0x0823  */
    /* JADX WARN: Code duplicated, block: B:286:0x0861  */
    /* JADX WARN: Code duplicated, block: B:288:0x0867  */
    /* JADX WARN: Code duplicated, block: B:289:0x0882  */
    /* JADX WARN: Code duplicated, block: B:292:0x0891  */
    /* JADX WARN: Code duplicated, block: B:294:0x08a5  */
    /* JADX WARN: Code duplicated, block: B:296:0x08ab A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:299:0x08b1  */
    /* JADX WARN: Code duplicated, block: B:301:0x08b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:302:0x08b7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:326:0x091c  */
    /* JADX WARN: Code duplicated, block: B:332:0x0929  */
    /* JADX WARN: Code duplicated, block: B:334:0x092c  */
    /* JADX WARN: Code duplicated, block: B:336:0x0932  */
    /* JADX WARN: Code duplicated, block: B:338:0x097e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0165  */
    /* JADX WARN: Code duplicated, block: B:368:0x0a2a  */
    /* JADX WARN: Code duplicated, block: B:372:0x0a49 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:388:0x0a88  */
    /* JADX WARN: Code duplicated, block: B:390:0x0a92  */
    /* JADX WARN: Code duplicated, block: B:392:0x0a9c  */
    /* JADX WARN: Code duplicated, block: B:395:0x0aa4  */
    /* JADX WARN: Code duplicated, block: B:398:0x0aae  */
    /* JADX WARN: Code duplicated, block: B:400:0x0ab6  */
    /* JADX WARN: Code duplicated, block: B:402:0x0abc  */
    /* JADX WARN: Code duplicated, block: B:403:0x0abf  */
    /* JADX WARN: Code duplicated, block: B:406:0x0af1  */
    /* JADX WARN: Code duplicated, block: B:407:0x0af4  */
    /* JADX WARN: Code duplicated, block: B:410:0x0b20  */
    /* JADX WARN: Code duplicated, block: B:412:0x0b2c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:415:0x0b5c  */
    /* JADX WARN: Code duplicated, block: B:419:0x0bd3  */
    /* JADX WARN: Code duplicated, block: B:41:0x0178  */
    /* JADX WARN: Code duplicated, block: B:422:0x0bda  */
    /* JADX WARN: Code duplicated, block: B:424:0x0bde  */
    /* JADX WARN: Code duplicated, block: B:425:0x0be7  */
    /* JADX WARN: Code duplicated, block: B:427:0x0bfb  */
    /* JADX WARN: Code duplicated, block: B:430:0x0c0b  */
    /* JADX WARN: Code duplicated, block: B:431:0x0c24  */
    /* JADX WARN: Code duplicated, block: B:435:0x0c43  */
    /* JADX WARN: Code duplicated, block: B:437:0x0c55  */
    /* JADX WARN: Code duplicated, block: B:439:0x0c61  */
    /* JADX WARN: Code duplicated, block: B:440:0x0c65  */
    /* JADX WARN: Code duplicated, block: B:444:0x0c6e  */
    /* JADX WARN: Code duplicated, block: B:446:0x0c74  */
    /* JADX WARN: Code duplicated, block: B:447:0x0c76  */
    /* JADX WARN: Code duplicated, block: B:449:0x0c80  */
    /* JADX WARN: Code duplicated, block: B:452:0x0cab  */
    /* JADX WARN: Code duplicated, block: B:453:0x0cae  */
    /* JADX WARN: Code duplicated, block: B:456:0x0cc6  */
    /* JADX WARN: Code duplicated, block: B:458:0x0ccf  */
    /* JADX WARN: Code duplicated, block: B:459:0x0cd3  */
    /* JADX WARN: Code duplicated, block: B:462:0x0cdc  */
    /* JADX WARN: Code duplicated, block: B:463:0x0cde  */
    /* JADX WARN: Code duplicated, block: B:475:0x0cf7  */
    /* JADX WARN: Code duplicated, block: B:478:0x0cfe A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:480:0x0d30  */
    /* JADX WARN: Code duplicated, block: B:483:0x0d46  */
    /* JADX WARN: Code duplicated, block: B:484:0x0db9  */
    /* JADX WARN: Code duplicated, block: B:486:0x0dcb  */
    /* JADX WARN: Code duplicated, block: B:487:0x0df7  */
    /* JADX WARN: Code duplicated, block: B:489:0x0e29  */
    /* JADX WARN: Code duplicated, block: B:491:0x0e39  */
    /* JADX WARN: Code duplicated, block: B:495:0x0e70  */
    /* JADX WARN: Code duplicated, block: B:497:0x0e7d  */
    /* JADX WARN: Code duplicated, block: B:500:0x0ece  */
    /* JADX WARN: Code duplicated, block: B:512:0x0eef  */
    /* JADX WARN: Code duplicated, block: B:51:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:523:0x0f04 A[PHI: r10
      0x0f04: PHI (r10v34 int) = (r10v33 int), (r10v36 int) binds: [B:521:0x0f01, B:517:0x0efa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:526:0x0f26  */
    /* JADX WARN: Code duplicated, block: B:529:0x0f36  */
    /* JADX WARN: Code duplicated, block: B:532:0x0f3e  */
    /* JADX WARN: Code duplicated, block: B:535:0x0f43  */
    /* JADX WARN: Code duplicated, block: B:536:0x0f4f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:537:0x0f51  */
    /* JADX WARN: Code duplicated, block: B:540:0x0f58  */
    /* JADX WARN: Code duplicated, block: B:543:0x0f5e  */
    /* JADX WARN: Code duplicated, block: B:545:0x0f62  */
    /* JADX WARN: Code duplicated, block: B:54:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:551:0x0f71  */
    /* JADX WARN: Code duplicated, block: B:553:0x0f75 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:554:0x0f77  */
    /* JADX WARN: Code duplicated, block: B:555:0x0f84  */
    /* JADX WARN: Code duplicated, block: B:558:0x0fa9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:559:0x0fab  */
    /* JADX WARN: Code duplicated, block: B:560:0x0fb1  */
    /* JADX WARN: Code duplicated, block: B:562:0x0fcf  */
    /* JADX WARN: Code duplicated, block: B:564:0x0fd6  */
    /* JADX WARN: Code duplicated, block: B:567:0x0ffa  */
    /* JADX WARN: Code duplicated, block: B:568:0x1000  */
    /* JADX WARN: Code duplicated, block: B:570:0x1011  */
    /* JADX WARN: Code duplicated, block: B:573:0x1021  */
    /* JADX WARN: Code duplicated, block: B:579:0x1064  */
    /* JADX WARN: Code duplicated, block: B:585:0x10f0  */
    /* JADX WARN: Code duplicated, block: B:587:0x10fc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:596:0x112c  */
    /* JADX WARN: Code duplicated, block: B:59:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:600:0x1161  */
    /* JADX WARN: Code duplicated, block: B:602:0x116e  */
    /* JADX WARN: Code duplicated, block: B:605:0x1177  */
    /* JADX WARN: Code duplicated, block: B:608:0x117f  */
    /* JADX WARN: Code duplicated, block: B:625:0x125b  */
    /* JADX WARN: Code duplicated, block: B:627:0x126e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:628:0x1270  */
    /* JADX WARN: Code duplicated, block: B:629:0x1287  */
    /* JADX WARN: Code duplicated, block: B:632:0x12a7  */
    /* JADX WARN: Code duplicated, block: B:635:0x12b3  */
    /* JADX WARN: Code duplicated, block: B:636:0x12c5  */
    /* JADX WARN: Code duplicated, block: B:639:0x12da  */
    /* JADX WARN: Code duplicated, block: B:642:0x12ed A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:644:0x1302  */
    /* JADX WARN: Code duplicated, block: B:647:0x1318  */
    /* JADX WARN: Code duplicated, block: B:649:0x1321  */
    /* JADX WARN: Code duplicated, block: B:651:0x1325  */
    /* JADX WARN: Code duplicated, block: B:657:0x1335  */
    /* JADX WARN: Code duplicated, block: B:65:0x0228  */
    /* JADX WARN: Code duplicated, block: B:662:0x1342  */
    /* JADX WARN: Code duplicated, block: B:665:0x1348  */
    /* JADX WARN: Code duplicated, block: B:672:0x13ae  */
    /* JADX WARN: Code duplicated, block: B:674:0x13b2  */
    /* JADX WARN: Code duplicated, block: B:676:0x13ce  */
    /* JADX WARN: Code duplicated, block: B:679:0x13ee  */
    /* JADX WARN: Code duplicated, block: B:682:0x13f3  */
    /* JADX WARN: Code duplicated, block: B:698:0x0bb0 A[EDGE_INSN: B:698:0x0bb0->B:417:0x0bb0 BREAK  A[LOOP:0: B:206:0x065a->B:416:0x0b6c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:701:0x085e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:702:0x081e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:708:0x10b2 A[EDGE_INSN: B:708:0x10b2->B:583:0x10b2 BREAK  A[LOOP:3: B:433:0x0c36->B:582:0x1070], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:723:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0282  */
    /* JADX WARN: Code duplicated, block: B:74:0x0285  */
    /* JADX WARN: Code duplicated, block: B:76:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:77:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:79:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:81:0x02b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:83:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:86:0x02c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x09b6, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:602:0x116e, please report this as an issue */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m33611(android.graphics.Canvas r108, int r109, int r110, int r111, int r112, int r113, int r114, l.C2567 r115, l.C1314 r116, l.C2937 r117, l.C17243 r118) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5128
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC13753.m33611(android.graphics.Canvas, int, int, int, int, int, int, l.ۖۡ᩸, l.֨ܽᩴ, l.ۖ᩷ᩴ, l.ܽ֨᩸):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m33603(Drawable drawable, Drawable drawable2, Drawable drawable3) {
        if (Build.VERSION.SDK_INT >= 29) {
            C24132 c24132 = this.f43659;
            if (c24132.m54110() == null) {
                ArrayList arrayList = this.f43666;
                arrayList.clear();
                int width = c24132.getWidth();
                Rect rect = this.f43651;
                if (drawable != null) {
                    rect.set(drawable.getDirtyBounds());
                    rect.offset(-c24132.getScrollX(), this.f43652 - c24132.m54026());
                    if (rect.right < 200) {
                        rect.left = 0;
                        rect.right = 200;
                        arrayList.add(rect);
                    } else {
                        int i = width - 200;
                        if (rect.left > i) {
                            rect.left = i;
                            rect.right = width;
                            arrayList.add(rect);
                        }
                    }
                } else {
                    if (drawable2 != null) {
                        rect.set(drawable2.getDirtyBounds());
                        rect.offset(-c24132.getScrollX(), this.f43652 - c24132.m54026());
                        if (rect.right < 200) {
                            rect.left = 0;
                            rect.right = 200;
                            arrayList.add(rect);
                        } else {
                            int i2 = width - 200;
                            if (rect.left > i2) {
                                rect.left = i2;
                                rect.right = width;
                                arrayList.add(rect);
                            }
                        }
                    }
                    if (drawable3 != null) {
                        Rect dirtyBounds = drawable3.getDirtyBounds();
                        Rect rect2 = this.f43641;
                        rect2.set(dirtyBounds);
                        rect2.offset(-c24132.getScrollX(), this.f43652 - c24132.m54026());
                        if (rect2.right < 200) {
                            rect2.left = 0;
                            rect2.right = 200;
                            arrayList.add(rect2);
                        } else {
                            int i3 = width - 200;
                            if (rect2.left > i3) {
                                rect2.left = i3;
                                rect2.right = width;
                                arrayList.add(rect2);
                            }
                        }
                    }
                }
                c24132.setSystemGestureExclusionRects(arrayList);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m33606(C18207 c18207, Canvas canvas, boolean z, Drawable drawable, RectF rectF, int i) {
        if (drawable == null) {
            rectF.setEmpty();
            if (c18207 != null) {
                c18207.m42356(i, 0, 0, false);
                return;
            }
            return;
        }
        if (c18207 != null) {
            float f = rectF.left;
            C24132 c24132 = this.f43659;
            int paddingLeft = c24132.getPaddingLeft() + ((int) (f - c24132.getScrollX()));
            int paddingTop = c24132.getPaddingTop() + ((int) (rectF.top + (this.f43652 - c24132.m54026())));
            rectF.setEmpty();
            if (z) {
                c18207.m42356(i, paddingLeft, paddingTop, true);
                return;
            } else {
                c18207.m42356(i, 0, 0, false);
                return;
            }
        }
        drawable.draw(canvas);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C7042 mo33634() {
        int i = this.f43644;
        if (i < 0 || !mo25243(i)) {
            return null;
        }
        C24132 c24132 = this.f43659;
        int iM54108 = c24132.m54108();
        int iM53993 = c24132.m53993();
        if (iM54108 <= 0 || iM53993 <= 0) {
            return null;
        }
        RectF rectF = new RectF();
        mo33625(rectF, this.f43644);
        int iMax = Math.max(0, c24132.m54026());
        float f = rectF.top;
        if (f < iMax || rectF.bottom > ((long) iMax) + ((long) iM53993)) {
            iMax = Math.max(0, ((int) f) - (iM53993 / 2));
        }
        return new C7042(mo25225() ? Math.max(0, ((int) rectF.right) - (iM54108 / 2)) : 0, Math.min(iMax, Math.max(0, ((int) m33639()) - iM53993)), iM54108, iM53993);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int mo33618(int i, int i2) {
        return Math.max(0, Math.min(i, Math.max(0, (((int) (this.f43640.m16189() * (((long) this.f43643.size()) - 1))) - i2) - 1)));
    }

    /* JADX INFO: renamed from: ᩷ */
    public boolean mo25243(int i) {
        return !this.f43643.isEmpty() && i >= 0 && i <= this.f43643.m19187().f45294;
    }

    /* JADX INFO: renamed from: ۤ */
    public long mo25230(int i, int i2) {
        if (this.f43643.isEmpty()) {
            return -1L;
        }
        if (mo25237() && !this.f43659.m54080(this)) {
            return -1L;
        }
        C14366 c14366 = this.f43643.get(m33615(i));
        return (((long) this.f43643.get(m33615(i + i2)).m34799()) & 4294967295L) | (((long) c14366.f45295) << 32);
    }

    /* JADX INFO: renamed from: ᩷ */
    public long mo25240(int i, int i2) {
        if (this.f43643.isEmpty()) {
            return 0L;
        }
        if (!mo25237() || this.f43659.m54080(this)) {
            return m33610(m33615(i), m33615(i + i2));
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private long m33610(int i, int i2) {
        C14366 c14366 = this.f43643.get(i);
        C14366 c14367 = this.f43643.get(i2);
        int iMax = Math.max(0, c14366.f45295 - 10000);
        int iM19176 = this.f43643.m19176(Math.max(0, i - 200));
        int iMin = Math.min(this.f43662, c14367.m34804() ? c14367.m34799() : c14367.f45294 + 10000);
        C6909 c6909 = this.f43643;
        return (((long) Math.max(iMin, c6909.get(Math.min(c6909.m19178(), i2 + 200)).m34799())) & 4294967295L) | (((long) Math.min(iMax, iM19176)) << 32);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m33604(C1314 c1314, int i, int i2) {
        c1314.m4838(this.f43646, this.f43643.get(i).f45295, this.f43643.get(i2).m34799());
        if (this.f43662 <= 1000000 || !this.f43659.m54102()) {
            return;
        }
        if (c1314.m4821(this.f43643.get(i).f45295, this.f43643.get(i2).m34799())) {
            long jM33610 = m33610(i, i2);
            c1314.m4814(this.f43646, (int) (jM33610 >>> 32), (int) jM33610);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m33601(Canvas canvas, int i, int i2, int i3, int i4, float f) {
        float f2;
        C14540 c14540 = this.f43640;
        if (c14540.f45769) {
            boolean z = c14540.f45816;
            if (c14540.f45744) {
                f2 = z ? i : i3 - this.f43630;
            } else {
                f2 = z ? 0.0f : f - this.f43630;
            }
            float f3 = i3;
            if (f3 >= f2) {
                float f4 = i;
                if (f4 > this.f43630 + f2) {
                    return;
                }
                int iSave = canvas.save();
                try {
                    canvas.translate(f2, 0.0f);
                    float f5 = i2;
                    float f6 = i4;
                    canvas.clipRect(Math.max(0.0f, f4 - f2), f5, Math.min(this.f43630, f3 - f2), f6);
                    C10232 c10232 = c14540.f45759;
                    c10232.setColor(c14540.f45810);
                    canvas.drawRect(0.0f, f5, this.f43630, f6, c10232);
                    c10232.setColor(c14540.f45788);
                    float f7 = c14540.f45816 ? this.f43630 - 1 : 1.0f;
                    canvas.drawLine(f7, f5, f7, f6, c10232);
                } finally {
                    canvas.restoreToCount(iSave);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m33602(Canvas canvas, int i, int i2, int i3, int i4, int i5, int i6, float f, boolean z, C14540 c14540, C10232 c10232) {
        int i7;
        int i8 = i3;
        boolean z2 = c14540.f45816;
        int i9 = this.f43630;
        boolean z3 = this.f43659.m53877() < 255;
        if (!z3) {
            c10232.setColor(c14540.f45810);
            canvas.drawRect(0.0f, i, i9, i2, c10232);
        }
        float f2 = c14540.f45776;
        InterfaceC14499 interfaceC14499 = c14540.f45791;
        if (interfaceC14499 != null) {
            interfaceC14499.mo7839(this.f43643, i3, i4, i9, canvas, c10232, c14540);
        }
        if (!z3) {
            C14540 c14541 = this.f43640;
            c10232.setColor(c14541.f45788);
            float f3 = c14541.f45816 ? this.f43630 - 1 : 1.0f;
            canvas.drawLine(f3, i, f3, i2, c10232);
        }
        float f4 = z2 ? i9 - f2 : f2;
        float fM33632 = m33632(i8) + c14540.f45748;
        c10232.setColor(c14540.f45801);
        int iM19188 = i8 > 0 ? this.f43643.m19188(i8 - 1) + 1 : 0;
        C18096 c18096M19181 = this.f43643.m19181();
        float fM33633 = fM33632;
        int i10 = iM19188;
        while (i8 <= i4) {
            int i11 = c18096M19181.m42205(i8).f45296;
            if (i11 > i6 || i5 > i11) {
                i11 = i11;
            } else {
                c10232.setColor(c14540.f45781);
                float f5 = fM33633 - c14540.f45748;
                float f6 = f5 + f;
                if (z2) {
                    canvas.drawRect(i9 - 3, f5, i9, f6, c10232);
                } else {
                    canvas.drawRect(0.0f, f5, 3.0f, f6, c10232);
                }
                c10232.setColor(c14540.f45801);
            }
            int i12 = i11 + 1;
            if (i10 != i12 && (!z || i12 == 1)) {
                String strValueOf = String.valueOf(i12);
                if (z2) {
                    int length = strValueOf.length() - 1;
                    float f7 = f4;
                    while (length >= 0) {
                        canvas.drawText(strValueOf, length, length + 1, f7, fM33633, (Paint) c10232);
                        f7 -= f2;
                        length--;
                        i12 = i12;
                    }
                    i7 = i12;
                } else {
                    i7 = i12;
                    float f8 = f4;
                    int i13 = 0;
                    for (int length2 = strValueOf.length(); i13 < length2; length2 = length2) {
                        int i14 = i13 + 1;
                        canvas.drawText(strValueOf, i13, i14, f8, fM33633, (Paint) c10232);
                        f8 += f2;
                        i13 = i14;
                    }
                }
                i10 = i7;
            }
            i8++;
            fM33633 = m33632(i8) + c14540.f45748;
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo25224(C6178 c6178) {
        C6909 c6909;
        c6178.writeByte(mo25217());
        c6178.writeInt(this.f43630);
        if (this.f43663 && mo25217() == 1) {
            c6909 = new C6909(this.f43643);
        } else {
            c6909 = this.f43643;
        }
        c6178.writeInt(c6909.size());
        c6178.writeInt(-249333469);
        C18096 c18096M19181 = c6909.m19181();
        for (int i = 0; i < c6909.size(); i++) {
            C14366 c14366M42205 = c18096M19181.m42205(i);
            c6178.writeInt(c14366M42205.f45295);
            c6178.writeInt(c14366M42205.f45294);
            c6178.writeInt(c14366M42205.f45296);
        }
        c6178.writeInt(1916422180);
        c6178.writeInt(this.f43655.size());
        C17350 c17350 = this.f43655;
        c17350.getClass();
        C11383 c11383 = new C11383(c17350);
        for (int i2 = 0; i2 < this.f43655.size(); i2++) {
            c11383.m28730(i2);
            c6178.mo17812(c11383.m28729());
            char cM28727 = c11383.m28727();
            if (cM28727 > 255) {
                cM28727 = 255;
            }
            c6178.writeByte(cM28727);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public boolean mo25237() {
        return this.f43663;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m33650() {
        return this.f43659.mo52288() && this.f43662 == 0 && !this.f43636.isEmpty();
    }
}
