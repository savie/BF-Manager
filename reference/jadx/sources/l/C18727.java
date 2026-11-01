package l;

import android.text.TextUtils;
import bin.mt.plus.R;
import com.google.android.material.timepicker.RadialViewGroup;

/* JADX INFO: renamed from: l.ᩴۨ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M7BP */
/* JADX INFO: loaded from: classes5.dex */
public final class C18727 extends C16608 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f60736;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C7340 f60737;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final Object f60738;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f60739;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f60740;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f60741;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public boolean f60742;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final String f60743;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f60744;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f60745;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String f60746;

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public C18727(String str, C7340 c7340, boolean z) {
        boolean z2;
        super(false);
        this.f60738 = new Object();
        if (C20370.m46024()) {
            z2 = C16737.f53615.getBoolean("def_mov_recycle_bin", true);
        }
        this.f60736 = z2;
        this.f60745 = 0;
        this.f60740 = 1L;
        this.f60746 = "";
        this.f60743 = str;
        this.f60737 = c7340;
        this.f60744 = z;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static int m43263(String str) {
        if ("replace".equals(str)) {
            return 0;
        }
        if (RadialViewGroup.SKIP_TAG.equals(str)) {
            return 1;
        }
        return "keep_both".equals(str) ? 2 : -1;
    }

    @Override // l.C16608, l.InterfaceC16088
    /* JADX INFO: renamed from: ۚۙ */
    public final void mo11427() {
        synchronized (this.f60738) {
        }
    }

    @Override // l.C16608, l.InterfaceC16088
    /* JADX INFO: renamed from: ۠ */
    public final boolean mo11428() {
        boolean z;
        synchronized (this.f60738) {
            z = !this.f60739;
        }
        return z;
    }

    @Override // l.C16608, l.InterfaceC16088
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo11425(boolean z) {
        return (z || this.f60744 || !mo11428()) ? false : true;
    }

    @Override // l.C16608, l.InterfaceC16088
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo11432() {
        boolean z;
        synchronized (this.f60738) {
            z = this.f60745 == 0 && this.f60736;
        }
        return z;
    }

    @Override // l.C16608, l.InterfaceC16088
    /* JADX INFO: renamed from: ۙ */
    public final void mo11424(String str, C20321 c20321, C20321 c20322, boolean z) {
        synchronized (this.f60738) {
            if (this.f60741) {
                return;
            }
            if (this.f60744) {
                throw new RuntimeException(C16737.m39288(R.string.MT_Protector));
            }
            if (this.f60739) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.f60743);
            sb.append("-c");
            long j = this.f60740;
            this.f60740 = 1 + j;
            sb.append(j);
            String string = sb.toString();
            this.f60746 = string;
            this.f60742 = true;
            if (!this.f60737.m19617(this.f60743, string, str, c20321, c20322, this, z)) {
                m43267(string);
                return;
            }
            synchronized (this.f60738) {
                while (this.f60742 && !this.f60741 && TextUtils.equals(string, this.f60746)) {
                    try {
                        this.f60738.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        this.f60741 = true;
                        this.f60742 = false;
                        this.f60746 = "";
                    }
                }
            }
        }
    }

    @Override // l.C16608, l.InterfaceC16088
    /* JADX INFO: renamed from: ۙ */
    public final int mo11423(String str, C20321 c20321, C20321 c20322, boolean z, boolean z2) {
        if (z2) {
            return 1;
        }
        if (mo11428()) {
            mo11424(str, c20321, c20322, z);
        }
        return mo11431();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m43266() {
        String str;
        synchronized (this.f60738) {
            int i = this.f60745;
            if (i == 1) {
                str = RadialViewGroup.SKIP_TAG;
            } else {
                str = i == 2 ? "keep_both" : "replace";
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m43264(String str) {
        boolean z;
        synchronized (this.f60738) {
            z = this.f60742 && TextUtils.equals(this.f60746, str);
        }
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m43265(String str, String str2, boolean z, boolean z2) {
        int iM43263 = m43263(str2);
        if (iM43263 == -1) {
            return false;
        }
        synchronized (this.f60738) {
            if (this.f60742 && TextUtils.equals(this.f60746, str)) {
                this.f60745 = iM43263;
                this.f60739 = z;
                this.f60736 = iM43263 == 0 && z2;
                this.f60742 = false;
                this.f60746 = "";
                this.f60738.notifyAll();
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m43267(String str) {
        synchronized (this.f60738) {
            if (TextUtils.isEmpty(str) || TextUtils.equals(this.f60746, str)) {
                this.f60741 = true;
                this.f60742 = false;
                this.f60746 = "";
                this.f60738.notifyAll();
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m43268() {
        boolean z;
        synchronized (this.f60738) {
            z = this.f60736;
        }
        return z;
    }

    @Override // l.C16608, l.InterfaceC5614
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo2357() {
        boolean z;
        synchronized (this.f60738) {
            z = this.f60741;
        }
        return z;
    }

    @Override // l.C16608, l.InterfaceC16088
    /* JADX INFO: renamed from: ܿ */
    public final int mo11431() {
        int i;
        synchronized (this.f60738) {
            i = this.f60745;
        }
        return i;
    }
}
