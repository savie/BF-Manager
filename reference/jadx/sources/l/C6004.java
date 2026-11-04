package l;

import android.os.Build;
import android.text.SpannableString;
import android.text.style.TypefaceSpan;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۚ᩻۫, reason: contains not printable characters */
/* JADX INFO: compiled from: K250 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6004 extends C13352 {

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public static final C9097 f20541;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public static final C9097 f20542;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public static final C9097 f20543;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public C9097 f20544;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f20545;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public C25291 f20546;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public C21694 f20547;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public boolean f20548;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public boolean f20549;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public boolean f20550;

    static {
        int i;
        for (C11441 c11441 : C24868.m55394()) {
            if (c11441.f35957.equals("everybody")) {
                i = c11441.f35958;
                f20541 = new C9097(16816, 0, i);
                f20542 = new C9097(33200, 0, i);
                f20543 = new C9097(41392, 0, i);
            }
        }
        i = 0;
        f20541 = new C9097(16816, 0, i);
        f20542 = new C9097(33200, 0, i);
        f20543 = new C9097(41392, 0, i);
    }

    public C6004(AbstractC22044 abstractC22044) {
        C7302 c7302M42889;
        C21694 c21694Mo15567;
        super(abstractC22044.getName(), abstractC22044.getParent(), abstractC22044.mo2954(), abstractC22044.mo4285(), abstractC22044.mo4286(), !abstractC22044.mo4281());
        this.f20545 = abstractC22044;
        if (abstractC22044.mo19981() && abstractC22044.mo4294().equals("/data/adb/ksu/modules.img")) {
            m32930(abstractC22044.mo19983().m19982());
        }
        boolean zMo7468 = abstractC22044.mo7468();
        C9097 c9097 = f20541;
        if (zMo7468) {
            C2170 c2170Mo7467 = abstractC22044.mo7467();
            if (c2170Mo7467.m7466()) {
                this.f20546 = c2170Mo7467.m7465();
                this.f20544 = c9097;
                return;
            }
        }
        boolean zMo19981 = abstractC22044.mo19981();
        this.f20548 = zMo19981;
        C9097 c9098 = f20542;
        if (zMo19981) {
            try {
                C21694 c21694M19978 = abstractC22044.mo19983().m19978();
                this.f20547 = c21694M19978;
                this.f20544 = new C9097(c21694M19978);
                return;
            } catch (IOException unused) {
                this.f20544 = isDirectory() ? c9097 : c9098;
                return;
            }
        }
        if (Build.VERSION.SDK_INT >= 30 && (abstractC22044 instanceof C18379) && (c7302M42889 = abstractC22044.mo42890().m42889()) != null && (c21694Mo15567 = c7302M42889.mo15567()) != null) {
            this.f20544 = new C9097(c21694Mo15567);
            return;
        }
        if (abstractC22044 instanceof C0678) {
            C0678 c0678Mo2948 = abstractC22044.mo2948();
            if (c0678Mo2948.m2950()) {
                this.f20550 = true;
                C18577 c18577M2947 = c0678Mo2948.m2947();
                this.f20544 = new C9097(c18577M2947.m43157(), c18577M2947.m43154(), c18577M2947.m43152());
            }
        }
        if (this.f20550) {
            return;
        }
        if (mo8107()) {
            this.f20544 = f20543;
        } else {
            this.f20544 = isDirectory() ? c9097 : c9098;
        }
    }

    public C6004(C25291 c25291) {
        super(c25291.f81684, "/storage", null, -1L, 0L, false);
        this.f20545 = C14584.m35193(getPath(), new String[0]);
        this.f20546 = c25291;
        this.f20544 = f20541;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m17451() {
        return this.f20546 != null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C25291 m17452() {
        return this.f20546;
    }

    @Override // l.C13352, l.InterfaceC2386
    /* JADX INFO: renamed from: ۘ᩷ */
    public final AbstractC22044 mo8093() {
        return this.f20545;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m17450() {
        this.f20545 = C14584.m35193(this.f20545.mo4294(), new String[0]);
    }

    @Override // l.C13352, l.InterfaceC2386
    /* JADX INFO: renamed from: ᩺᩷ */
    public final int mo8115() {
        if (m17451()) {
            return 6;
        }
        return super.mo8115();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m17448() {
        C21694 c21694 = this.f20547;
        return c21694 == null || c21694.m49239() == '-' || c21694.m49235() == '-';
    }

    @Override // l.C13352, l.InterfaceC2386
    /* JADX INFO: renamed from: ܰۙ */
    public final boolean mo8102() {
        char cM49239;
        C21694 c21694 = this.f20547;
        return (c21694 == null || (cM49239 = c21694.m49239()) == '-' || (cM49239 == 'l' && c21694.m49235() == '-')) && super.mo8102() && !getParent().startsWith("/proc/");
    }

    @Override // l.C13352, l.InterfaceC2386
    /* JADX INFO: renamed from: ܰ */
    public final CharSequence mo8101() {
        C25291 c25291 = this.f20546;
        if (c25291 != null) {
            return c25291.f81686;
        }
        if (C17423.f56654 || isDirectory()) {
            return null;
        }
        boolean z = this.f20548;
        boolean z2 = this.f20550;
        if ((!z && !z2) || C14584.m35214(getPath()) || C17743.m41554(getPath()) != null) {
            return null;
        }
        if (z2 && getPath().charAt(19) != 'd') {
            return null;
        }
        SpannableString spannableString = new SpannableString(this.f20544.m24244());
        spannableString.setSpan(new TypefaceSpan("monospace"), 0, spannableString.length(), 18);
        return spannableString;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m17449() {
        return this.f20550;
    }

    @Override // l.C13352, l.InterfaceC2386
    /* JADX INFO: renamed from: ۛ᩷ */
    public final C9097 mo5155() {
        return this.f20544;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17447(C9097 c9097) {
        this.f20544 = c9097;
        this.f20549 = true;
    }

    @Override // l.C13352
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6004.class != obj.getClass() || this.f20549 || !super.equals(obj)) {
            return false;
        }
        C6004 c6004 = (C6004) obj;
        if (c6004.f20549) {
            return false;
        }
        return C17359.equals(this.f20544, c6004.f20544);
    }

    @Override // l.C13352
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        C9097 c9097 = this.f20544;
        return iHashCode + (c9097 != null ? c9097.hashCode() : 0);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m17446(C9097 c9097) {
        return c9097 == f20541 || c9097 == f20542 || c9097 == f20543;
    }
}
