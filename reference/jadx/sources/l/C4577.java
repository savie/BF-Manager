package l;

import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۙ֫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4577 implements InterfaceC0737 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22477 f16286;

    public C4577(C22477 c22477) {
        this.f16286 = c22477;
    }

    @Override // l.InterfaceC0737
    /* JADX INFO: renamed from: ܳ */
    public final void mo3061(String str) {
        this.f16286.f72721.m27393(str);
    }

    @Override // l.InterfaceC0737
    /* JADX INFO: renamed from: ۙ */
    public final void mo3058(final int i, final int i2, final String str) {
        C21576.m49068(new Runnable() { // from class: l.۬ۚۧ
            @Override // java.lang.Runnable
            public final void run() {
                C22477 c22477 = this.f43296.f16286;
                C10745 c10745 = c22477.f72721;
                Locale locale = Locale.ENGLISH;
                c10745.m27404(str + " (" + i + "/" + i2 + MotionUtils.EASING_TYPE_FORMAT_END);
                c22477.f72721.m27391(R.string.MT_Protector);
                c22477.f72721.m27403(0);
            }
        });
    }

    @Override // l.InterfaceC0737
    /* JADX INFO: renamed from: ۫ */
    public final void mo3060(int i) {
        this.f16286.f72721.m27403(i);
    }

    @Override // l.InterfaceC0737
    /* JADX INFO: renamed from: ۤ */
    public final void mo3059() {
        this.f16286.f72721.m27391(R.string.MT_Protector);
    }

    @Override // l.InterfaceC7509
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo924() {
        return this.f16286.f72721.m27399();
    }
}
