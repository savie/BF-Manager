package l;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.Map;

/* JADX INFO: renamed from: l.ܳᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 469I */
/* JADX INFO: loaded from: classes.dex */
public class C15549 extends AbstractC17787 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C20025 f50571;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f50572;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C23009 f50573;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ForegroundColorSpan f50574;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19893 f50575;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C21246 f50576;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f50577;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Map f50578;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C17041 f50579;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C22877 f50580;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f50581;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public ForegroundColorSpan f50582;

    static {
        ApplicationC23172.m52091(UMErrorCode.E_UM_BE_NOT_MAINPROCESS);
    }

    public native C15549(Context context, C21246 c21246, Map map);

    @Override // l.AbstractC17787
    /* JADX INFO: renamed from: ۙ */
    public final void mo23702(C24132 c24132, CharSequence charSequence) {
        Runnable runnable;
        String string = ((SpannableString) charSequence).toString();
        int i = this.f50572;
        if (i == 1) {
            c24132.m54021().replace(this.f50581, this.f50577, string);
            c24132.mo52339(string.length() + this.f50581);
            int i2 = this.f50571.f64329;
            if (i2 != 1 && i2 != 2) {
                return;
            }
            m41621();
            runnable = new Runnable() { // from class: l.ۧᩴᩴ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38147.m41628();
                }
            };
        } else {
            if (i != 2) {
                return;
            }
            if (string.endsWith(":")) {
                c24132.m54021().replace(this.f50581, this.f50577, string);
                c24132.mo52339(string.length() + this.f50581);
            } else {
                c24132.m54021().replace(this.f50581, this.f50577, string.concat("=\"\""));
                c24132.mo52339(string.length() + this.f50581 + 2);
            }
            m41621();
            runnable = new Runnable() { // from class: l.ۧᩴᩴ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38147.m41628();
                }
            };
        }
        C21576.m49068(runnable);
    }

    @Override // l.AbstractC17787
    /* JADX INFO: renamed from: ۙ */
    public final C17041 mo23701(int i, CharSequence charSequence) {
        C13180.m32702(charSequence, i, this.f50575);
        C17041 c17041 = this.f50579;
        if (c17041.isEmpty()) {
            return null;
        }
        c17041.m40150(this.f50581);
        return c17041;
    }
}
