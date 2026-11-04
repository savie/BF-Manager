package l;

import android.text.TextUtils;
import bin.mt.plus.R;
import com.google.android.material.timepicker.RadialViewGroup;

/* JADX INFO: renamed from: l.᩻ܺ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: M7BP */
/* JADX INFO: loaded from: classes2.dex */
public final class C25154 extends C18616 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f81296;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean f81297;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final Object f81298;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f81299;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f81300;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public String f81301;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f81302;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public boolean f81303;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C21949 f81304;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f81305;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final String f81306;

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public C25154(String str, C21949 c21949, boolean z) {
        boolean z2;
        super(false);
        this.f81298 = new Object();
        if (C19632.m45281()) {
            z2 = C21576.f68932.getBoolean("def_mov_recycle_bin", true);
        }
        this.f81300 = z2;
        this.f81305 = 0;
        this.f81299 = 1L;
        this.f81301 = "";
        this.f81306 = str;
        this.f81304 = c21949;
        this.f81297 = z;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static int m56064(String str) {
        if ("replace".equals(str)) {
            return 0;
        }
        if (RadialViewGroup.SKIP_TAG.equals(str)) {
            return 1;
        }
        return "keep_both".equals(str) ? 2 : -1;
    }

    @Override // l.C18616, l.InterfaceC14864
    /* JADX INFO: renamed from: ᩴۙ */
    public final void mo28702() {
        synchronized (this.f81298) {
        }
    }

    @Override // l.C18616, l.InterfaceC14864
    /* JADX INFO: renamed from: ۗ */
    public final boolean mo28694() {
        boolean z;
        synchronized (this.f81298) {
            z = !this.f81302;
        }
        return z;
    }

    @Override // l.C18616, l.InterfaceC14864
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo28698(boolean z) {
        return (z || this.f81297 || !mo28694()) ? false : true;
    }

    @Override // l.C18616, l.InterfaceC14864
    /* JADX INFO: renamed from: ۘ */
    public final boolean mo28695() {
        boolean z;
        synchronized (this.f81298) {
            z = this.f81305 == 0 && this.f81300;
        }
        return z;
    }

    @Override // l.C18616, l.InterfaceC14864
    /* JADX INFO: renamed from: ۙ */
    public final void mo28697(String str, C21578 c21578, C21578 c21579, boolean z) {
        synchronized (this.f81298) {
            if (this.f81296) {
                return;
            }
            if (this.f81297) {
                throw new RuntimeException(C21576.m49088(R.string.MT_Protector));
            }
            if (this.f81302) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.f81306);
            sb.append("-c");
            long j = this.f81299;
            this.f81299 = 1 + j;
            sb.append(j);
            String string = sb.toString();
            this.f81301 = string;
            this.f81303 = true;
            if (!this.f81304.m49670(this.f81306, string, str, c21578, c21579, this, z)) {
                m56067(string);
                return;
            }
            synchronized (this.f81298) {
                while (this.f81303 && !this.f81296 && TextUtils.equals(string, this.f81301)) {
                    try {
                        this.f81298.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        this.f81296 = true;
                        this.f81303 = false;
                        this.f81301 = "";
                    }
                }
            }
        }
    }

    @Override // l.C18616, l.InterfaceC14864
    /* JADX INFO: renamed from: ۙ */
    public final int mo28696(String str, C21578 c21578, C21578 c21579, boolean z, boolean z2) {
        if (z2) {
            return 1;
        }
        if (mo28694()) {
            mo28697(str, c21578, c21579, z);
        }
        return mo28700();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String m56068() {
        String str;
        synchronized (this.f81298) {
            int i = this.f81305;
            if (i == 1) {
                str = RadialViewGroup.SKIP_TAG;
            } else {
                str = i == 2 ? "keep_both" : "replace";
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m56065(String str) {
        boolean z;
        synchronized (this.f81298) {
            z = this.f81303 && TextUtils.equals(this.f81301, str);
        }
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m56066(String str, String str2, boolean z, boolean z2) {
        int iM56064 = m56064(str2);
        if (iM56064 == -1) {
            return false;
        }
        synchronized (this.f81298) {
            if (this.f81303 && TextUtils.equals(this.f81301, str)) {
                this.f81305 = iM56064;
                this.f81302 = z;
                this.f81300 = iM56064 == 0 && z2;
                this.f81303 = false;
                this.f81301 = "";
                this.f81298.notifyAll();
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m56067(String str) {
        synchronized (this.f81298) {
            if (TextUtils.isEmpty(str) || TextUtils.equals(this.f81301, str)) {
                this.f81296 = true;
                this.f81303 = false;
                this.f81301 = "";
                this.f81298.notifyAll();
            }
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m56069() {
        boolean z;
        synchronized (this.f81298) {
            z = this.f81300;
        }
        return z;
    }

    @Override // l.C18616, l.InterfaceC7509
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo924() {
        boolean z;
        synchronized (this.f81298) {
            z = this.f81296;
        }
        return z;
    }

    @Override // l.C18616, l.InterfaceC14864
    /* JADX INFO: renamed from: ᩳ */
    public final int mo28700() {
        int i;
        synchronized (this.f81298) {
            i = this.f81305;
        }
        return i;
    }
}
