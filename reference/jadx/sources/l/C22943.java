package l;

import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.Locale;

/* JADX INFO: renamed from: l.᩺ۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes.dex */
public final class C22943 implements InterfaceC13856 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21531 f74573;

    public C22943(C21531 c21531) {
        this.f74573 = c21531;
    }

    @Override // l.InterfaceC13856
    /* JADX INFO: renamed from: ᩹ */
    public final void mo33695(String str) {
        this.f74573.f69943.m5832(str);
    }

    @Override // l.InterfaceC13856
    /* JADX INFO: renamed from: ۙ */
    public final void mo33694(final int i, final int i2, final String str) {
        C16737.m39273(new Runnable() { // from class: l.ۜۧۘ
            @Override // java.lang.Runnable
            public final void run() {
                C21531 c21531 = this.f22626.f74573;
                C1777 c1777 = c21531.f69943;
                Locale locale = Locale.ENGLISH;
                c1777.m5841(str + " (" + i + "/" + i2 + MotionUtils.EASING_TYPE_FORMAT_END);
                c21531.f69943.m5830(R.string.MT_Protector);
                c21531.f69943.m5840(0);
            }
        });
    }

    @Override // l.InterfaceC13856
    /* JADX INFO: renamed from: ֨ */
    public final void mo33692(int i) {
        this.f74573.f69943.m5840(i);
    }

    @Override // l.InterfaceC13856
    /* JADX INFO: renamed from: ۖ */
    public final void mo33693() {
        this.f74573.f69943.m5830(R.string.MT_Protector);
    }

    @Override // l.InterfaceC5614
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo2357() {
        return this.f74573.f69943.m5824();
    }
}
