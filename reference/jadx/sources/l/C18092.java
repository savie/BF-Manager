package l;

import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܿۙܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2IQX */
/* JADX INFO: loaded from: classes4.dex */
public final class C18092 extends ViewGroup {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f59191;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f59192;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public boolean f59193;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f59194;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public int f59195;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public boolean f59196;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f59197;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C4842 f59198;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public long f59199;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public ActivityC22568 f59200;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C12628 f59201;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public boolean f59202;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public C23314 f59203;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f59204;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f59205;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public C23314 f59206;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f59207;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f59208;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public int f59209;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C13616 f59210;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public RunnableC3922 f59211;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final C12628 f59212;

    public C18092(ActivityC22568 activityC22568) {
        super(activityC22568);
        this.f59192 = true;
        this.f59205 = 4;
        this.f59209 = -1;
        this.f59204 = -1;
        this.f59195 = -1;
        this.f59199 = -1L;
        this.f59197 = -1L;
        this.f59194 = -1;
        this.f59191 = -1L;
        this.f59207 = true;
        C12628 c12628 = new C12628(activityC22568, null);
        this.f59201 = c12628;
        C12628 c12629 = new C12628(activityC22568, null);
        this.f59212 = c12629;
        m42157(c12628, true);
        m42157(c12629, false);
        c12628.f40533 = false;
        addView(c12628);
        addView(c12629);
        c12628.requestFocus();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m42157(C12628 c12628, final boolean z) {
        c12628.m31388(true);
        c12628.m31366(false);
        c12628.m31389(this.f59205);
        c12628.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.ۨۙܳ
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z2) {
                C18092.m42161(this.f38980, z, z2);
            }
        });
        c12628.setOnTouchListener(new View.OnTouchListener() { // from class: l.ۛۙܳ
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                C18092.m42160(this.f20996, z, motionEvent);
                return false;
            }
        });
        c12628.m31365(new C24060(this));
        c12628.m31363(new C14362(this, z));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m42161(C18092 c18092, boolean z, boolean z2) {
        if (!z2 || c18092.f59192 == z) {
            return;
        }
        c18092.f59192 = z;
        c18092.m42167();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m42160(C18092 c18092, boolean z, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1) {
            c18092.invalidate();
        }
        if (motionEvent.getActionMasked() == 0) {
            c18092.f59204 = -1;
            c18092.f59195 = -1;
            (z ? c18092.f59212 : c18092.f59201).m31384();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m42159(C18092 c18092, C12628 c12628, long j) {
        C12628 c12629 = c18092.f59201;
        if (c12628 == c12629) {
            c12629 = c18092.f59212;
        }
        c12629.m31384();
        c12629.m31390(j);
        ActivityC22568 activityC22568 = c18092.f59200;
        if (activityC22568 != null) {
            activityC22568.m50862(c18092.m42195());
        }
        c18092.invalidate();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42183(ActivityC22568 activityC22568) {
        this.f59200 = activityC22568;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m42188() {
        return this.f59193;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m42194(boolean z) {
        if (this.f59193 == z) {
            return;
        }
        C12628 c12628 = this.f59201;
        c12628.m31384();
        C12628 c12629 = this.f59212;
        c12629.m31384();
        this.f59193 = z;
        c12628.m31366(z);
        c12629.m31366(z);
        boolean z2 = !z;
        if (c12629.f40524 != z2) {
            c12629.f40524 = z2;
            c12629.requestLayout();
            c12629.invalidate();
        }
        c12628.f40533 = z;
        C3176 c3176 = c12628.f40510;
        if (c3176 != null) {
            c3176.f10300 = z;
        }
        C3176 c3177 = c12629.f40510;
        if (c3177 != null) {
            c3177.f10300 = z;
        }
        requestLayout();
        m42167();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42184(C23314 c23314, C23314 c23315, C13616 c13616) {
        this.f59208 = true;
        try {
            C23314 c23316 = this.f59206;
            C12628 c12628 = this.f59212;
            C12628 c12629 = this.f59201;
            if (c23316 != c23314 || this.f59203 != c23315) {
                C4842 c4842 = this.f59198;
                if (c4842 != null) {
                    c4842.close();
                }
                this.f59198 = null;
                c23314.m52457();
                C19143 c19143 = new C19143(c23314, null);
                try {
                    c23315.m52457();
                    C19143 c19144 = new C19143(c23315, null);
                    try {
                        c12629.m31354(c19143).close();
                    } catch (IOException unused) {
                    }
                    try {
                        c12628.m31354(c19144).close();
                    } catch (IOException unused2) {
                    }
                    this.f59206 = c23314;
                    this.f59203 = c23315;
                } catch (IOException | RuntimeException e) {
                    c19143.close();
                    throw e;
                }
            }
            this.f59210 = c13616;
            this.f59191 = -1L;
            c12629.m31362(new C3176(c13616, true));
            c12628.m31362(new C3176(c13616, false));
            C3176 c3176 = c12629.f40510;
            C3176 c3177 = c12628.f40510;
            boolean z = this.f59193;
            c3177.f10300 = z;
            c3176.f10300 = z;
            this.f59209 = -1;
            this.f59204 = -1;
            this.f59195 = -1;
            this.f59202 = false;
            this.f59208 = false;
            requestLayout();
            m42167();
        } catch (Throwable th) {
            this.f59208 = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42182(C19143 c19143, C19143 c19144, C13616 c13616) {
        C12628 c12628 = this.f59212;
        C12628 c12629 = this.f59201;
        this.f59208 = true;
        try {
            C4842 c4842 = this.f59198;
            if (c4842 != null) {
                c4842.close();
            }
            this.f59198 = null;
            this.f59203 = null;
            this.f59206 = null;
            try {
                c12629.m31354(c19143).close();
            } catch (IOException unused) {
            }
            try {
                c12628.m31354(c19144).close();
            } catch (IOException unused2) {
            }
            this.f59210 = c13616;
            this.f59191 = -1L;
            c12629.m31362(new C3176(c13616, true));
            c12628.m31362(new C3176(c13616, false));
            C3176 c3176 = c12629.f40510;
            C3176 c3177 = c12628.f40510;
            boolean z = this.f59193;
            c3177.f10300 = z;
            c3176.f10300 = z;
            this.f59204 = -1;
            this.f59209 = -1;
            this.f59195 = -1;
            this.f59202 = false;
            this.f59208 = false;
            requestLayout();
            m42167();
        } catch (Throwable th) {
            this.f59208 = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C12628 m42190(boolean z) {
        return z ? this.f59201 : this.f59212;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m42202() {
        C4842 c4842 = this.f59198;
        C12628 c12628 = this.f59212;
        C12628 c12629 = this.f59201;
        if (c4842 == null) {
            this.f59198 = new C4842(c12629.f40509.m17213(), c12628.f40509.m17213(), this.f59210);
        }
        c12629.m31388(false);
        c12628.m31388(false);
        C3176 c3176 = c12629.f40510;
        c12628.f40510.f10303 = true;
        c3176.f10303 = true;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C4842 m42193() {
        return this.f59198;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0035  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42179() {
        C13616 c13616M14875;
        int iM33368;
        C12628 c12628 = this.f59212;
        C12628 c12629 = this.f59201;
        C4842 c4842 = this.f59198;
        if (c4842 == null || this.f59208 || this.f59210 == (c13616M14875 = c4842.m14875())) {
            return;
        }
        if (m42197().m31371()) {
            long j = this.f59191;
            if (j >= 0) {
                iM33368 = this.f59210.m33368(j, !this.f59192);
            } else {
                iM33368 = -1;
            }
        } else {
            iM33368 = -1;
        }
        this.f59208 = true;
        try {
            this.f59210 = c13616M14875;
            this.f59191 = iM33368 >= 0 ? c13616M14875.m33369(iM33368, !this.f59192) : -1L;
            c12629.m31362(new C3176(c13616M14875, true));
            c12628.m31362(new C3176(c13616M14875, false));
            C3176 c3176 = c12629.f40510;
            C3176 c3177 = c12628.f40510;
            boolean z = this.f59193;
            c3177.f10300 = z;
            c3176.f10300 = z;
            c3177.f10303 = true;
            c3176.f10303 = true;
            m42177();
            this.f59204 = -1;
            this.f59209 = -1;
            this.f59208 = false;
            requestLayout();
            invalidate();
            ActivityC22568 activityC22568 = this.f59200;
            if (activityC22568 != null) {
                activityC22568.m50859(c13616M14875);
            }
        } catch (Throwable th) {
            this.f59208 = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m42191() {
        C4842 c4842 = this.f59198;
        if (c4842 != null) {
            c4842.close();
            this.f59198 = null;
        }
        this.f59204 = -1;
        this.f59195 = -1;
        RunnableC3922 runnableC3922 = this.f59211;
        if (runnableC3922 != null) {
            removeCallbacks(runnableC3922);
            this.f59211 = null;
        }
        C12628 c12628 = this.f59201;
        c12628.m31384();
        C12628 c12629 = this.f59212;
        c12629.m31384();
        m42156(c12628);
        m42156(c12629);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42156(C12628 c12628) {
        c12628.m31379();
        C19143 c19143M17213 = c12628.f40509.m17213();
        c12628.m31383();
        c12628.m31391();
        if (c12628.m31369(new RunnableC20330(0, c19143M17213))) {
            return;
        }
        try {
            c19143M17213.close();
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C12628 m42197() {
        return this.f59192 ? this.f59201 : this.f59212;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m42192() {
        return this.f59192;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m42203() {
        return m42197().f40509.m17202();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m42196(boolean z) {
        return (z ? this.f59201 : this.f59212).f40509.m17202();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m42201(boolean z) {
        return (z ? this.f59201 : this.f59212).f40509.m17208();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m42200(boolean z) {
        return (z ? this.f59201 : this.f59212).f40509.m17206();
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final long m42195() {
        C12628 c12628 = this.f59201;
        return (c12628.m31378() / ((long) Math.max(1, c12628.f40497.f18053))) * ((long) this.f59205);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Runnable, l.ۘۙܳ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42186(boolean z, int i, int i2, boolean z2, boolean z3, int i3, int i4, boolean z4, boolean z5, final long j) {
        this.f59204 = -1;
        this.f59195 = -1;
        this.f59191 = -1L;
        this.f59208 = true;
        C12628 c12628 = this.f59201;
        if (z2) {
            c12628.f40509.m17216(i, i2);
        } else {
            c12628.f40509.m17193(i, z3);
        }
        C5917 c5917 = this.f59212.f40509;
        if (z4) {
            c5917.m17216(i3, i4);
        } else {
            c5917.m17193(i3, z5);
        }
        this.f59208 = false;
        this.f59192 = z;
        m42197().requestFocus();
        RunnableC3922 runnableC3922 = this.f59211;
        if (runnableC3922 != null) {
            removeCallbacks(runnableC3922);
        }
        ?? r3 = new Runnable() { // from class: l.ۘۙܳ
            @Override // java.lang.Runnable
            public final void run() {
                C18092.m42158(this.f13385, j);
            }
        };
        this.f59211 = r3;
        post(r3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m42158(C18092 c18092, long j) {
        c18092.f59211 = null;
        C12628 c12628 = c18092.f59201;
        c12628.m31384();
        c18092.f59212.m31384();
        c12628.m31359((j / ((long) c18092.f59205)) * ((long) c12628.f40497.f18053));
        c18092.m42167();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m42189() {
        long jM42198;
        int i;
        C13616 c13616 = this.f59210;
        if (c13616 == null || c13616.f43258.f31798 == 0) {
            return -1;
        }
        if (m42197().f40509.m17206()) {
            jM42198 = this.f59210.m33369(m42203(), this.f59192);
        } else {
            jM42198 = m42198();
        }
        C13616 c13617 = this.f59210;
        if (jM42198 >= c13617.f43259) {
            return -1;
        }
        C4933 c4933 = c13617.f43256;
        if (c4933 == null) {
            i = 0;
        } else {
            long j = jM42198;
            while (true) {
                C4933 c4934 = c4933.f17200;
                if (c4934 == null) {
                    break;
                }
                long j2 = c4934.f17208;
                if (j < j2) {
                    c4933 = c4934;
                } else {
                    j -= j2;
                    c4933 = c4933.f17202;
                }
            }
            i = c4933.f17195;
        }
        if (i == 0) {
            return -1;
        }
        C4933 c4935 = this.f59210.f43256;
        if (c4935 == null) {
            return 0;
        }
        return c4935.m15139(jM42198, false, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42185(boolean z) {
        int i;
        C13616 c13616 = this.f59210;
        if (c13616 == null || (i = c13616.f43258.f31798) == 0) {
            return;
        }
        int i2 = this.f59204;
        if (i2 < 0) {
            i2 = this.f59209;
        }
        if (i2 >= 0) {
            m42180((i2 + (z ? 1 : i - 1)) % i);
            return;
        }
        long jM33369 = m42197().f40509.m17206() ? this.f59210.m33369(m42203(), this.f59192) : m42198();
        C4933 c4933 = this.f59210.f43256;
        m42180((((c4933 != null ? c4933.m15139(jM33369, z, false) : 0) - (!z ? 1 : 0)) + i) % i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42180(int i) {
        C13616 c13616 = this.f59210;
        if (c13616 == null || i < 0 || i >= c13616.f43258.f31798) {
            return;
        }
        this.f59195 = -1;
        this.f59204 = i;
        if (isLayoutRequested() || this.f59201.isLayoutRequested() || this.f59212.isLayoutRequested()) {
            requestLayout();
        } else {
            m42170();
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m42170() {
        int i = this.f59204;
        if (i < 0) {
            return;
        }
        this.f59204 = -1;
        C13616 c13616 = this.f59210;
        long j = c13616.f43255.get(c13616.f43258.f31799.f43256.m15137(i, false)).f29709;
        C12628 c12628M42197 = m42197();
        c12628M42197.m31384();
        this.f59191 = j;
        this.f59207 = true;
        m42177();
        this.f59209 = i;
        long j2 = j / ((long) this.f59205);
        long jMax = Math.max(0, c12628M42197.getHeight() - c12628M42197.f40530.m36667());
        long j3 = c12628M42197.f40497.f18053;
        c12628M42197.m31374(((j3 - jMax) / 2) + (j2 * j3));
        m42167();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m42199(int i) {
        this.f59204 = -1;
        this.f59209 = -1;
        this.f59191 = -1L;
        C12628 c12628M42197 = m42197();
        this.f59201.m31384();
        this.f59212.m31384();
        c12628M42197.m31386(i);
        this.f59195 = c12628M42197.f40509.m17202();
        m42167();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public void m42167() {
        m42179();
        m42177();
        invalidate();
        this.f59201.invalidate();
        this.f59212.invalidate();
        ActivityC22568 activityC22568 = this.f59200;
        if (activityC22568 == null || this.f59208) {
            return;
        }
        activityC22568.m50863();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m42177() {
        C12628 c12628M42197 = m42197();
        C5917 c5917 = c12628M42197.f40509;
        C5917 c5918 = c12628M42197.f40509;
        boolean zM17206 = c5917.m17206();
        C12628 c12628 = this.f59212;
        C12628 c12629 = this.f59201;
        if (zM17206 && this.f59191 < 0) {
            this.f59191 = -1L;
            C3176 c3176 = c12629.f40510;
            if (c3176 != null) {
                c3176.f10298 = false;
            }
            C3176 c3177 = c12628.f40510;
            if (c3177 != null) {
                c3177.f10298 = false;
            }
            C12628 c126210 = this.f59192 ? c12628 : c12629;
            C3176 c3178 = c12628M42197.f40510;
            C15282 c15282 = c12628M42197.f40530;
            if (c3178 != null) {
                C3176 c3179 = c126210.f40510;
                C5917 c5919 = c126210.f40509;
                if (c3179 != null) {
                    c3178.f10293 = false;
                    long jM36676 = c15282.m36676(c5918.m17202());
                    long jM36677 = c15282.m36676(c5918.m17208());
                    boolean zM17207 = c5918.m17206();
                    boolean zM17220 = c5918.m17220();
                    c3179.f10293 = true;
                    c3179.f10299 = jM36676;
                    c3179.f10291 = jM36677;
                    c3179.f10304 = zM17207;
                    c3179.f10295 = zM17220;
                    int iM10367 = c3179.m10367(jM36676);
                    int iM10368 = c3179.m10367(jM36677);
                    if (iM10367 < 0) {
                        iM10367 = c3179.m10368(jM36676, true);
                    }
                    if (iM10368 < 0) {
                        iM10368 = c3179.m10368(jM36677, false);
                    }
                    int i = iM10368;
                    boolean z = zM17207 && iM10367 >= 0 && i >= iM10367;
                    if (!z) {
                        int iM10369 = c3179.m10367(jM36676);
                        if (iM10369 < 0) {
                            iM10369 = c3179.m10368(jM36676, true);
                        }
                        if (iM10369 < 0) {
                            iM10369 = c3179.m10368(jM36676, false);
                        }
                        if (jM36676 >= this.f59210.f43259) {
                            iM10369 = c5919.m17218();
                        }
                        iM10367 = Math.max(0, iM10369);
                        i = iM10367;
                    }
                    if (c5919.m17206() != z || c5919.m17202() != iM10367 || c5919.m17208() != i || (!z && c5919.m17220() != zM17220)) {
                        this.f59196 = true;
                        try {
                            if (z) {
                                c5919.m17216(iM10367, i);
                            } else {
                                c5919.m17193(iM10367, zM17220);
                            }
                            this.f59196 = false;
                        } catch (Throwable th) {
                            this.f59196 = false;
                            throw th;
                        }
                    }
                }
            }
            C3176 c31710 = c12629.f40510;
            if (c31710 != null) {
                c31710.f10294 = -1L;
            }
            C3176 c31711 = c12628.f40510;
            if (c31711 != null) {
                c31711.f10294 = -1L;
                return;
            }
            return;
        }
        C13616 c13616 = this.f59210;
        if (c13616 == null) {
            return;
        }
        if (this.f59191 < 0) {
            this.f59191 = c13616.m33369(c5918.m17202(), this.f59192);
            this.f59207 = c5918.m17220();
        }
        this.f59191 = Math.min(this.f59191, this.f59210.f43259);
        m42173(c12629, true);
        m42173(c12628, false);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0054 A[Catch: all -> 0x0077, TRY_LEAVE, TryCatch #0 {all -> 0x0077, blocks: (B:17:0x0032, B:19:0x0038, B:21:0x003e, B:23:0x0046, B:25:0x004e, B:27:0x0054), top: B:37:0x0032 }] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m42173(C12628 c12628, boolean z) {
        C3176 c3176 = c12628.f40510;
        C5917 c5917 = c12628.f40509;
        if (c3176 == null) {
            return;
        }
        int iM33368 = this.f59210.m33368(this.f59191, z);
        boolean z2 = iM33368 < 0 && this.f59191 < this.f59210.f43259;
        if (iM33368 < 0) {
            C4933 c4933 = this.f59210.f43256;
            iM33368 = c4933 == null ? 0 : c4933.m15138(this.f59191, z);
        }
        this.f59196 = true;
        try {
            if (!c5917.m17206() && c5917.m17202() == iM33368 && c5917.m17220() == this.f59207) {
                long j = c3176.f10294;
                if (j >= 0 && j != this.f59191) {
                    c5917.m17193(iM33368, this.f59207);
                }
            } else {
                c5917.m17193(iM33368, this.f59207);
            }
            this.f59196 = false;
            c3176.f10298 = z2;
            c3176.f10293 = z != this.f59192;
            long j2 = this.f59191;
            c3176.f10294 = j2;
            c3176.f10291 = j2;
            c3176.f10299 = j2;
            c3176.f10304 = false;
            c3176.f10295 = this.f59207;
            c12628.m31392();
        } catch (Throwable th) {
            this.f59196 = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m42198() {
        if (m42197().f40509.m17206()) {
            return -1L;
        }
        long j = this.f59191;
        if (j >= 0) {
            return j;
        }
        C13616 c13616 = this.f59210;
        if (c13616 == null) {
            return 0L;
        }
        return c13616.m33369(m42203(), this.f59192);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m42187() {
        return this.f59191 < 0 ? m42197().f40509.m17220() : this.f59207;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42181(long j, boolean z) {
        C13616 c13616;
        if (j < 0 || (c13616 = this.f59210) == null || j > c13616.f43259 || m42197().f40509.m17206()) {
            return;
        }
        this.f59191 = j;
        this.f59207 = z;
        m42167();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        C4842 c4842 = this.f59198;
        if (c4842 == null) {
            m42155(canvas);
            return;
        }
        synchronized (c4842) {
            synchronized (c4842.f16913) {
                synchronized (c4842.f16907) {
                    m42179();
                    m42155(canvas);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m42155(Canvas canvas) {
        C12628 c12628 = this.f59212;
        c12628.computeScroll();
        c12628.f40499 = true;
        try {
            super.dispatchDraw(canvas);
            c12628.f40499 = false;
            boolean z = this.f59193;
            C12628 c12629 = this.f59201;
            if (z) {
                int bottom = c12629.getBottom();
                C5171 c5171 = c12629.f40497;
                int top = c12628.getTop();
                c5171.f18048.setColor(C19988.m45966((C3296.f10750 & 16777215) | (-1610612736), C3296.f10763));
                canvas.drawRect(0.0f, bottom, getWidth(), top, c5171.f18048);
                if (top - bottom > 4) {
                    c5171.f18048.setColor(C3296.f10750);
                    canvas.drawRect(0.0f, bottom + 2, getWidth(), top - 2, c5171.f18048);
                }
            }
            c12629.m31393();
            c12628.m31393();
            if (this.f59195 < 0 || !m42197().m31382()) {
                return;
            }
            this.f59195 = -1;
        } catch (Throwable th) {
            c12628.f40499 = false;
            throw th;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        long j = this.f59199;
        C12628 c12628 = this.f59201;
        if (j < 0) {
            this.f59199 = m42195();
            this.f59194 = c12628.f40497.f18053;
            C12628 c12628M42197 = m42197();
            long jM42198 = m42198();
            long jM31378 = ((jM42198 / ((long) this.f59205)) * ((long) c12628M42197.f40497.f18053)) - c12628M42197.m31378();
            if (this.f59210 == null || jM42198 < 0 || (i3 = c12628M42197.f40497.f18053) <= 0 || jM31378 < 0 || jM31378 + ((long) i3) > c12628M42197.getHeight() - c12628M42197.f40530.m36667()) {
                jM42198 = -1;
            }
            this.f59197 = jM42198;
        }
        int defaultSize = View.getDefaultSize(getSuggestedMinimumWidth(), i);
        int defaultSize2 = View.getDefaultSize(getSuggestedMinimumHeight(), i2);
        setMeasuredDimension(defaultSize, defaultSize2);
        C12628 c12629 = this.f59212;
        int iRound = Math.round(c12629.f40497.f18021);
        int i4 = getResources().getConfiguration().orientation == 2 ? 8 : 4;
        if (this.f59193) {
            i4 *= 2;
        }
        c12628.m31389(i4);
        c12629.m31389(i4);
        int iMax = this.f59193 ? defaultSize : Math.max(0, (defaultSize - iRound) / 2);
        c12628.setPadding(0, 0, this.f59193 ? iRound : 0, 0);
        if (!this.f59193) {
            iRound = defaultSize - (iMax * 2);
        }
        c12629.setPadding(0, 0, iRound, 0);
        int iMin = this.f59193 ? Math.min(defaultSize2, Math.round(c12629.f40497.f18046 * 2.5f) * 2) : 0;
        int i5 = this.f59193 ? (defaultSize2 - iMin) / 2 : defaultSize2;
        c12628.measure(View.MeasureSpec.makeMeasureSpec(iMax, 1073741824), View.MeasureSpec.makeMeasureSpec(i5, 1073741824));
        c12629.measure(View.MeasureSpec.makeMeasureSpec(this.f59193 ? defaultSize : defaultSize - iMax, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f59193 ? (defaultSize2 - iMin) - i5 : defaultSize2, 1073741824));
        if (this.f59193) {
            int i6 = defaultSize2 - iMin;
            int iMin2 = Math.min(c12628.f40530.m36667(), i6);
            int i7 = i6 - iMin2;
            int iMin3 = Math.min(c12629.f40530.m36667(), i7);
            int i8 = (i7 - iMin3) / 2;
            c12628.measure(View.MeasureSpec.makeMeasureSpec(defaultSize, 1073741824), View.MeasureSpec.makeMeasureSpec(iMin2 + i8, 1073741824));
            c12629.measure(View.MeasureSpec.makeMeasureSpec(defaultSize, 1073741824), View.MeasureSpec.makeMeasureSpec(i8 + iMin3, 1073741824));
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00b4  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        long jM42195 = this.f59199;
        if (jM42195 < 0) {
            jM42195 = m42195();
        }
        long j = this.f59197;
        int i5 = this.f59194;
        C12628 c12628 = this.f59201;
        if (i5 < 0) {
            i5 = c12628.f40497.f18053;
        }
        this.f59199 = -1L;
        this.f59197 = -1L;
        this.f59194 = -1;
        int i6 = getResources().getConfiguration().orientation == 2 ? 8 : 4;
        if (this.f59193) {
            i6 *= 2;
        }
        int measuredWidth = c12628.getMeasuredWidth();
        int measuredHeight = c12628.getMeasuredHeight();
        C12628 c12629 = this.f59212;
        int measuredHeight2 = c12629.getMeasuredHeight();
        boolean z3 = this.f59205 == i6 && i5 == c12628.f40497.f18053 && c12628.getWidth() == measuredWidth && c12629.getWidth() == c12629.getMeasuredWidth();
        boolean z4 = (z3 && c12628.getHeight() == measuredHeight && c12629.getHeight() == measuredHeight2) ? false : true;
        long jM31378 = z3 ? c12628.m31378() : (jM42195 / ((long) i6)) * ((long) c12628.f40497.f18053);
        if (z3 && j >= 0 && j == m42198()) {
            z2 = m42197().getHeight() > (this.f59192 ? measuredHeight : measuredHeight2) && this.f59204 < 0 && this.f59195 < 0;
        }
        if (z4) {
            c12628.m31384();
            c12629.m31384();
        }
        this.f59205 = i6;
        c12628.m31389(i6);
        c12629.m31389(this.f59205);
        c12628.layout(0, 0, measuredWidth, measuredHeight);
        boolean z5 = this.f59193;
        if (z5) {
            measuredWidth = 0;
        }
        int height = z5 ? getHeight() - measuredHeight2 : 0;
        int width = getWidth();
        if (this.f59193) {
            measuredHeight2 = getHeight();
        }
        c12629.layout(measuredWidth, height, width, measuredHeight2);
        if (z2) {
            C12628 c12628M42197 = m42197();
            jM31378 = Math.max(jM31378, ((((j / ((long) this.f59205)) + 1) * ((long) c12628M42197.f40497.f18053)) + ((long) c12628M42197.f40530.m36667())) - ((long) c12628M42197.getHeight()));
        }
        c12628.m31387(jM31378);
        c12629.m31387(c12628.m31378());
        m42170();
        if (!z4 || this.f59195 < 0) {
            return;
        }
        m42197().m31367(this.f59195);
    }
}
