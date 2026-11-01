package l;

import android.os.Build;
import android.text.SpannableString;
import android.text.style.TypefaceSpan;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۜܰ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: K250 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6794 extends C15404 {

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public static final C11731 f22927;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public static final C11731 f22928;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public static final C11731 f22929;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public C18295 f22930;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public boolean f22931;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public boolean f22932;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f22933;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public C11731 f22934;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public boolean f22935;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public C5574 f22936;

    static {
        int i;
        for (C14459 c14459 : C1757.m5804()) {
            if (c14459.f47427.equals("everybody")) {
                i = c14459.f47424;
                f22927 = new C11731(16816, 0, i);
                f22928 = new C11731(33200, 0, i);
                f22929 = new C11731(41392, 0, i);
            }
        }
        i = 0;
        f22927 = new C11731(16816, 0, i);
        f22928 = new C11731(33200, 0, i);
        f22929 = new C11731(41392, 0, i);
    }

    public C6794(AbstractC20745 abstractC20745) {
        C14042 c14042M40125;
        C5574 c5574Mo24649;
        super(abstractC20745.getName(), abstractC20745.getParent(), abstractC20745.mo33968(), abstractC20745.mo33964(), abstractC20745.mo33991(), !abstractC20745.mo33974());
        this.f22933 = abstractC20745;
        if (abstractC20745.mo33979() && abstractC20745.mo33986().equals("/data/adb/ksu/modules.img")) {
            m36873(abstractC20745.mo33969().m33980());
        }
        boolean zMo46731 = abstractC20745.mo46731();
        C11731 c11731 = f22927;
        if (zMo46731) {
            C23235 c23235Mo46707 = abstractC20745.mo46707();
            if (c23235Mo46707.m51274()) {
                this.f22930 = c23235Mo46707.m51272();
                this.f22934 = c11731;
                return;
            }
        }
        boolean zMo33979 = abstractC20745.mo33979();
        this.f22932 = zMo33979;
        C11731 c11732 = f22928;
        if (zMo33979) {
            try {
                C5574 c5574M33984 = abstractC20745.mo33969().m33984();
                this.f22936 = c5574M33984;
                this.f22934 = new C11731(c5574M33984);
                return;
            } catch (IOException unused) {
                this.f22934 = isDirectory() ? c11731 : c11732;
                return;
            }
        }
        if (Build.VERSION.SDK_INT >= 30 && (abstractC20745 instanceof C17196) && (c14042M40125 = abstractC20745.mo40129().m40125()) != null && (c5574Mo24649 = c14042M40125.mo24649()) != null) {
            this.f22934 = new C11731(c5574Mo24649);
            return;
        }
        if (abstractC20745 instanceof C17589) {
            C17589 c17589Mo40898 = abstractC20745.mo40898();
            if (c17589Mo40898.m40912()) {
                this.f22931 = true;
                C12651 c12651M40901 = c17589Mo40898.m40901();
                this.f22934 = new C11731(c12651M40901.m31442(), c12651M40901.m31447(), c12651M40901.m31443());
            }
        }
        if (this.f22931) {
            return;
        }
        if (mo7986()) {
            this.f22934 = f22929;
        } else {
            this.f22934 = isDirectory() ? c11731 : c11732;
        }
    }

    public C6794(C18295 c18295) {
        super(c18295.f58374, "/storage", null, -1L, 0L, false);
        this.f22933 = C5553.m15313(getPath(), new String[0]);
        this.f22930 = c18295;
        this.f22934 = f22927;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m18395() {
        return this.f22930 != null;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C18295 m18396() {
        return this.f22930;
    }

    @Override // l.C15404, l.InterfaceC2557
    /* JADX INFO: renamed from: ᩷ܰ */
    public final AbstractC20745 mo7989() {
        return this.f22933;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m18398() {
        this.f22933 = C5553.m15313(this.f22933.mo33986(), new String[0]);
    }

    @Override // l.C15404, l.InterfaceC2557
    /* JADX INFO: renamed from: ۟ܰ */
    public final int mo7968() {
        if (m18395()) {
            return 6;
        }
        return super.mo7968();
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m18397() {
        C5574 c5574 = this.f22936;
        return c5574 == null || c5574.m15393() == '-' || c5574.m15395() == '-';
    }

    @Override // l.C15404, l.InterfaceC2557
    /* JADX INFO: renamed from: ܺۙ */
    public final boolean mo7982() {
        char cM15393;
        C5574 c5574 = this.f22936;
        return (c5574 == null || (cM15393 = c5574.m15393()) == '-' || (cM15393 == 'l' && c5574.m15395() == '-')) && super.mo7982() && !getParent().startsWith("/proc/");
    }

    @Override // l.C15404, l.InterfaceC2557
    /* JADX INFO: renamed from: ܺ */
    public final CharSequence mo7981() {
        C18295 c18295 = this.f22930;
        if (c18295 != null) {
            return c18295.f58377;
        }
        if (C0674.f2832 || isDirectory()) {
            return null;
        }
        boolean z = this.f22932;
        boolean z2 = this.f22931;
        if ((!z && !z2) || C5553.m15304(getPath()) || C8272.m21690(getPath()) != null) {
            return null;
        }
        if (z2 && getPath().charAt(19) != 'd') {
            return null;
        }
        SpannableString spannableString = new SpannableString(this.f22934.m29328());
        spannableString.setSpan(new TypefaceSpan("monospace"), 0, spannableString.length(), 18);
        return spannableString;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m18393() {
        return this.f22931;
    }

    @Override // l.C15404, l.InterfaceC2557
    /* JADX INFO: renamed from: ۤܰ */
    public final C11731 mo7971() {
        return this.f22934;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18394(C11731 c11731) {
        this.f22934 = c11731;
        this.f22935 = true;
    }

    @Override // l.C15404
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6794.class != obj.getClass() || this.f22935 || !super.equals(obj)) {
            return false;
        }
        C6794 c6794 = (C6794) obj;
        if (c6794.f22935) {
            return false;
        }
        return C13638.equals(this.f22934, c6794.f22934);
    }

    @Override // l.C15404
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        C11731 c11731 = this.f22934;
        return iHashCode + (c11731 != null ? c11731.hashCode() : 0);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m18392(C11731 c11731) {
        return c11731 == f22927 || c11731 == f22928 || c11731 == f22929;
    }
}
