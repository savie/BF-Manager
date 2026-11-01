package l;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import java.util.Map;

/* JADX INFO: renamed from: l.ᩴۨۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 469I */
/* JADX INFO: loaded from: classes.dex */
public class C18731 extends AbstractC15910 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C6037 f60751;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C18025 f60752;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public ForegroundColorSpan f60753;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f60754;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21284 f60755;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C21553 f60756;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public Map f60757;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f60758;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f60759;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C14935 f60760;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C20848 f60761;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public ForegroundColorSpan f60762;

    static {
        ApplicationC6132.m17119(142);
    }

    public native C18731(Context context, C6037 c6037, Map map);

    @Override // l.AbstractC15910
    /* JADX INFO: renamed from: ۙ */
    public final void mo30809(C6111 c6111, CharSequence charSequence) {
        Runnable runnable;
        String string = ((SpannableString) charSequence).toString();
        int i = this.f60754;
        if (i == 1) {
            c6111.m17000().replace(this.f60759, this.f60758, string);
            c6111.mo17029(string.length() + this.f60759);
            int i2 = this.f60752.f57637;
            if (i2 != 1 && i2 != 2) {
                return;
            }
            m37827();
            runnable = new Runnable() { // from class: l.ۤۨۚ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f35007.m37824();
                }
            };
        } else {
            if (i != 2) {
                return;
            }
            if (string.endsWith(":")) {
                c6111.m17000().replace(this.f60759, this.f60758, string);
                c6111.mo17029(string.length() + this.f60759);
            } else {
                c6111.m17000().replace(this.f60759, this.f60758, string.concat("=\"\""));
                c6111.mo17029(string.length() + this.f60759 + 2);
            }
            m37827();
            runnable = new Runnable() { // from class: l.ۤۨۚ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f35007.m37824();
                }
            };
        }
        C16737.m39273(runnable);
    }

    @Override // l.AbstractC15910
    /* JADX INFO: renamed from: ۙ */
    public final C20848 mo30806(int i, CharSequence charSequence) {
        C18462.m42822(charSequence, i, this.f60755);
        C20848 c20848 = this.f60761;
        if (c20848.isEmpty()) {
            return null;
        }
        c20848.m46873(this.f60759);
        return c20848;
    }
}
