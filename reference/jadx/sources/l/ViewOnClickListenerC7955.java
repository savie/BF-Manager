package l;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;
import bin.mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.۠ۙ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: J57U */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC7955 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public View f26130;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public View f26131;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public View f26132;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public boolean f26133;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f26134;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C6543 f26135;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C6543 f26136;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f26137;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f26138;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public volatile C18538 f26139;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public ViewOnClickListenerC8793 f26140;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C3720 f26141;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public View f26142;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public View f26143;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21009(boolean z) {
        View view = this.f26131;
        this.f26134 = z;
        if (z) {
            if (this.f26138) {
                this.f26138 = false;
                this.f26143.setVisibility(8);
                view.setRotationX(0.0f);
            }
            view.setVisibility(8);
            return;
        }
        view.setVisibility(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ViewOnClickListenerC7955 m20995(ViewOnClickListenerC8793 viewOnClickListenerC8793) {
        ViewOnClickListenerC7955 viewOnClickListenerC7955 = new ViewOnClickListenerC7955();
        viewOnClickListenerC7955.f26133 = false;
        viewOnClickListenerC7955.f26138 = false;
        viewOnClickListenerC7955.f26137 = true;
        viewOnClickListenerC7955.f26140 = viewOnClickListenerC8793;
        viewOnClickListenerC7955.f26132 = viewOnClickListenerC8793.m31016(R.id.MT_Protector);
        viewOnClickListenerC7955.f26143 = viewOnClickListenerC8793.m31016(R.id.MT_Protector);
        viewOnClickListenerC8793.m31016(R.id.MT_Protector).setOnClickListener(viewOnClickListenerC7955);
        viewOnClickListenerC8793.m31016(R.id.MT_Protector).setOnClickListener(viewOnClickListenerC7955);
        View viewM31016 = viewOnClickListenerC8793.m31016(R.id.MT_Protector);
        viewOnClickListenerC7955.f26142 = viewM31016;
        viewM31016.setOnClickListener(viewOnClickListenerC7955);
        View viewM31017 = viewOnClickListenerC8793.m31016(R.id.MT_Protector);
        viewOnClickListenerC7955.f26130 = viewM31017;
        viewM31017.setOnClickListener(viewOnClickListenerC7955);
        viewOnClickListenerC8793.m31016(R.id.MT_Protector).setOnClickListener(viewOnClickListenerC7955);
        View viewM31018 = viewOnClickListenerC8793.m31016(R.id.MT_Protector);
        viewOnClickListenerC7955.f26131 = viewM31018;
        viewM31018.setOnClickListener(viewOnClickListenerC7955);
        viewOnClickListenerC7955.f26131 = ((ViewGroup) viewM31018).getChildAt(1);
        viewOnClickListenerC7955.f26135 = new C6543(true, (C9160) viewOnClickListenerC8793.m31016(R.id.MT_Protector), (TextView) viewOnClickListenerC8793.m31016(R.id.MT_Protector), (Spinner) viewOnClickListenerC8793.m31016(R.id.MT_Protector), (CheckBox) viewOnClickListenerC8793.m31016(R.id.MT_Protector));
        viewOnClickListenerC7955.f26136 = new C6543(false, (C9160) viewOnClickListenerC8793.m31016(R.id.MT_Protector), (TextView) viewOnClickListenerC8793.m31016(R.id.MT_Protector), (Spinner) viewOnClickListenerC8793.m31016(R.id.MT_Protector), (CheckBox) viewOnClickListenerC8793.m31016(R.id.MT_Protector));
        return viewOnClickListenerC7955;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m21007() {
        return this.f26139 != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21008() {
        C18538 c18538 = this.f26139;
        if (c18538 != null) {
            c18538.cancel();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m21012() {
        View view = this.f26130;
        View view2 = this.f26142;
        C6543 c6543 = this.f26135;
        if (c6543.f22034 || c6543.f22039) {
            m21011();
            return;
        }
        if (!this.f26138 || this.f26136.f22039) {
            view2.setEnabled(false);
            view.setEnabled(false);
        } else {
            view2.setEnabled(true);
            view.setEnabled(true);
        }
        if (this.f26133) {
            return;
        }
        this.f26140.m22902();
        this.f26132.setVisibility(0);
        this.f26133 = true;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m21011() {
        if (this.f26133) {
            this.f26132.setVisibility(8);
            this.f26133 = false;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m21010() {
        return this.f26133;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View view2 = this.f26131;
        View view3 = this.f26143;
        C6543 c6543 = this.f26136;
        ViewOnClickListenerC8793 viewOnClickListenerC8793 = this.f26140;
        if (m21007()) {
            return;
        }
        int id = view.getId();
        if ((id == R.id.MT_Protector || id == R.id.MT_Protector) && viewOnClickListenerC8793.f30239.m32242()) {
            C15829.m37611(R.string.MT_Protector);
            return;
        }
        if (id == R.id.MT_Protector) {
            m20993();
            return;
        }
        if (id == R.id.MT_Protector) {
            m21006();
            return;
        }
        if (id == R.id.MT_Protector) {
            C13026 c13026 = viewOnClickListenerC8793.f30239;
            C3720 c3720 = this.f26141;
            if (c3720 != null) {
                C13732 c13732 = c13026.f43452;
                if (c3720.m10888(c13732.m33458(), c13732.m33443(), c13732.m33465(), c13732.m33475())) {
                    c6543.m17775();
                    if (c13026.m32234(c6543.f22041)) {
                        if (this.f26137) {
                            m21006();
                            return;
                        } else {
                            m20993();
                            return;
                        }
                    }
                    return;
                }
            }
            if (this.f26137) {
                m21006();
                return;
            } else {
                m20993();
                return;
            }
        }
        if (id != R.id.MT_Protector) {
            if (id == R.id.MT_Protector) {
                m21011();
                return;
            }
            if (id != R.id.MT_Protector || this.f26134) {
                return;
            }
            if (this.f26138) {
                this.f26138 = false;
                view3.setVisibility(8);
                view2.setRotationX(0.0f);
                return;
            } else {
                this.f26138 = true;
                view3.setVisibility(0);
                view2.setRotationX(180.0f);
                return;
            }
        }
        C6543 c6544 = this.f26135;
        c6544.m17775();
        c6543.m17775();
        C13026 c13027 = viewOnClickListenerC8793.f30239;
        C2516 c2516M33458 = c13027.f43452.m33458();
        byte[] bArr = c6544.f22041;
        byte[] bArr2 = c6543.f22041;
        if (bArr == null || bArr.length == 0) {
            this.f26141 = null;
            return;
        }
        final C18538 c18538 = new C18538();
        final C21360 c21360 = new C21360(this, c13027, c2516M33458);
        C11615 c11615M32223 = c13027.m32223(new Runnable() { // from class: l.֫ۗۚ
            @Override // java.lang.Runnable
            public final void run() {
                c18538.cancel();
            }
        }, new Runnable() { // from class: l.ۢۗۚ
            @Override // java.lang.Runnable
            public final void run() {
                c21360.m47893();
            }
        });
        if (c11615M32223 == null) {
            C15829.m37611(R.string.MT_Protector);
        } else {
            new C12894(this, c18538, c2516M33458, c11615M32223, c21360, bArr, bArr2, c13027).m10243();
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private void m20993() {
        this.f26137 = false;
        C6543 c6543 = this.f26135;
        c6543.m17775();
        C13026 c13026 = this.f26140.f30239;
        C13732 c13732 = c13026.f43452;
        C2516 c2516M33458 = c13732.m33458();
        byte[] bArr = c6543.f22041;
        if (bArr == null || bArr.length == 0) {
            this.f26141 = null;
            return;
        }
        this.f26141 = null;
        new C13600(this, new C18538(), c2516M33458, bArr, !c13732.m33475() ? c13732.m33443() : ((long) c13732.m33443()) - 1, c13026).m10243();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m21006() {
        long jM33465;
        this.f26137 = true;
        C6543 c6543 = this.f26135;
        c6543.m17775();
        C13026 c13026 = this.f26140.f30239;
        C13732 c13732 = c13026.f43452;
        C2516 c2516M33458 = c13732.m33458();
        byte[] bArr = c6543.f22041;
        if (bArr == null || bArr.length == 0) {
            this.f26141 = null;
            return;
        }
        this.f26141 = null;
        if (!c13732.m33475()) {
            jM33465 = c13732.m33443();
        } else {
            jM33465 = ((long) c13732.m33465()) + 1;
        }
        new C5132(this, new C18538(), c2516M33458, bArr, m20994(jM33465, false), c13026).m10243();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22772 m20997(C2516 c2516, C15218 c15218, byte[] bArr, byte[] bArr2, C0898 c0898) {
        C13638.requireNonNull(c2516, "document");
        C13638.requireNonNull(bArr, "pattern");
        if (bArr.length == 0) {
            return new C22772(0L, 0, false);
        }
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArr3 = bArr2;
        InterfaceC5614 interfaceC5614M29777 = C11965.m29777(c0898);
        C13807 c13807M7792 = c2516.m7792(c15218);
        try {
            if (bArr.length > c15218.length()) {
                C22772 c22772 = new C22772(0L, 0, false);
                c13807M7792.close();
                return c22772;
            }
            C15011 c15011 = new C15011(c13807M7792.m33603(bArr.length, bArr3), c15218.length(), bArr, bArr3, interfaceC5614M29777);
            try {
                c15218.m36427(c15011, c15218.length());
                if (interfaceC5614M29777.mo2357()) {
                    C22772 c22772M50428 = C22772.m50428();
                    c13807M7792.close();
                    return c22772M50428;
                }
                try {
                    C22772 c22772Finish = c15011.finish();
                    if (interfaceC5614M29777.mo2357()) {
                        C22772 c22772M50429 = C22772.m50428();
                        c13807M7792.close();
                        return c22772M50429;
                    }
                    if (c22772Finish.f74148 != 0) {
                        int i = c22772Finish.f74147;
                        c13807M7792.m33609(i, i);
                        if (!c13807M7792.m33607(interfaceC5614M29777)) {
                            C22772 c22772M504210 = C22772.m50428();
                            c13807M7792.close();
                            return c22772M504210;
                        }
                    }
                    c13807M7792.close();
                    return c22772Finish;
                } catch (C1105 unused) {
                    C22772 c22772M504211 = C22772.m50428();
                    c13807M7792.close();
                    return c22772M504211;
                }
            } catch (C17832 unused2) {
                C22772 c22772M504212 = C22772.m50428();
                c13807M7792.close();
                return c22772M504212;
            }
        } catch (Throwable th) {
            try {
                c13807M7792.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21000(ViewOnClickListenerC7955 viewOnClickListenerC7955, C18538 c18538) {
        if (viewOnClickListenerC7955.f26139 != null) {
            throw new IllegalStateException("Another search task is active");
        }
        viewOnClickListenerC7955.f26139 = c18538;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m21005(ViewOnClickListenerC7955 viewOnClickListenerC7955, C18538 c18538) {
        if (viewOnClickListenerC7955.f26139 == c18538) {
            viewOnClickListenerC7955.f26139 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m21002(C2516 c2516) {
        ViewOnClickListenerC8793 viewOnClickListenerC8793 = this.f26140;
        return (viewOnClickListenerC8793.isFinishing() || viewOnClickListenerC8793.isDestroyed() || viewOnClickListenerC8793.f30239.f43452.m33458() != c2516) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m21004(ViewOnClickListenerC7955 viewOnClickListenerC7955, C2516 c2516, C15218 c15218) {
        return c15218 != null && viewOnClickListenerC7955.m21002(c2516) && c2516.m7808() == c15218.m36426();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20999(ViewOnClickListenerC7955 viewOnClickListenerC7955, C13026 c13026, C2516 c2516, Exception exc) {
        if (viewOnClickListenerC7955.m21002(c2516)) {
            if (exc instanceof C3015) {
                C15829.m37611(R.string.MT_Protector);
            } else if (!(exc instanceof IOException)) {
                viewOnClickListenerC7955.f26140.m31002(exc, (DialogInterface.OnDismissListener) null);
            } else {
                c13026.m32228((IOException) exc);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21001(C11690 c11690) {
        if (c11690 != null) {
            c11690.close();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m20994(long j, boolean z) {
        if (j < (z ? -1L : 0L) || j > 2147483647L) {
            throw new IndexOutOfBoundsException(C15489.m37074(j, "Search offset="));
        }
        return (int) j;
    }
}
