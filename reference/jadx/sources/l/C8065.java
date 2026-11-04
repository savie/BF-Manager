package l;

import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.۟ᩳ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: C9QS */
/* JADX INFO: loaded from: classes4.dex */
public final class C8065 implements InterfaceC24957 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f26691 = 0;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f26692;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19252 f26693;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f26694;

    public C8065(C19252 c19252, C4819 c4819) {
        this.f26693 = c19252;
        this.f26692 = c4819.m14850();
    }

    @Override // l.InterfaceC24957
    /* JADX INFO: renamed from: ۙ */
    public final void mo13155(int i) {
        this.f26691 += (long) i;
        C19252 c19252 = this.f26693;
        boolean z = c19252.f62273;
        long j = this.f26692;
        if (z) {
            c19252.m43862(this.f26691, j);
        } else {
            c19252.m45193(this.f26691, j);
            c19252.m43862(c19252.f62272.m6383() + this.f26691, c19252.f62272.m6379());
        }
    }

    @Override // l.InterfaceC24957
    /* JADX INFO: renamed from: ᩷ */
    public final void mo13157(int i) {
        boolean z = this.f26694;
        C19252 c19252 = this.f26693;
        if (!z) {
            this.f26694 = true;
            if (c19252.f62272.m6381() > 1) {
                c19252.mo16837(C21576.m49088(R.string.MT_Protector) + MotionUtils.EASING_TYPE_FORMAT_START + c19252.f62272.m6385() + "/" + c19252.f62272.m6381() + MotionUtils.EASING_TYPE_FORMAT_END);
            } else {
                c19252.m43868(R.string.MT_Protector);
            }
        }
        if (c19252.f62273) {
            c19252.mo16839(i);
        } else {
            c19252.m45194(i);
        }
    }

    @Override // l.InterfaceC24957
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo13156() {
        return this.f26693.mo924();
    }
}
