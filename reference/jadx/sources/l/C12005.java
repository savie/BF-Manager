package l;

import android.content.Intent;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۨ֨֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AY4 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12005 implements InterfaceC16025 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC0073 f38712;

    @Override // l.InterfaceC16025
    /* JADX INFO: renamed from: ۙ */
    public final void mo8384(Intent intent, int i) {
        String stringExtra;
        InterfaceC0073 interfaceC0073 = this.f38712;
        if (i != -1) {
            if (i != 0) {
                return;
            }
            interfaceC0073.mo1127();
        } else {
            if (intent == null || (stringExtra = intent.getStringExtra(MotionUtils.EASING_TYPE_PATH)) == null) {
                return;
            }
            interfaceC0073.mo1128(stringExtra);
        }
    }
}
