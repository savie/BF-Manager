package l;

import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.֡ۡ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C9QS */
/* JADX INFO: loaded from: classes2.dex */
public final class C0300 implements InterfaceC22920 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f1618;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f1619 = 0;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f1620;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16529 f1621;

    public C0300(C16529 c16529, C9474 c9474) {
        this.f1621 = c16529;
        this.f1620 = c9474.m24283();
    }

    @Override // l.InterfaceC22920
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1828(int i) {
        this.f1619 += (long) i;
        C16529 c16529 = this.f1621;
        boolean z = c16529.f53108;
        long j = this.f1620;
        if (z) {
            c16529.m41578(this.f1619, j);
        } else {
            c16529.m46156(this.f1619, j);
            c16529.m41578(c16529.f53102.m10995() + this.f1619, c16529.f53102.m10997());
        }
    }

    @Override // l.InterfaceC22920
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo1829(int i) {
        boolean z = this.f1618;
        C16529 c16529 = this.f1621;
        if (!z) {
            this.f1618 = true;
            if (c16529.f53102.m10990() > 1) {
                c16529.mo21457(C16737.m39288(R.string.MT_Protector) + MotionUtils.EASING_TYPE_FORMAT_START + c16529.f53102.m10991() + "/" + c16529.f53102.m10990() + MotionUtils.EASING_TYPE_FORMAT_END);
            } else {
                c16529.m41591(R.string.MT_Protector);
            }
        }
        if (c16529.f53108) {
            c16529.mo21455(i);
        } else {
            c16529.m46157(i);
        }
    }

    @Override // l.InterfaceC22920
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean mo1827() {
        return this.f1621.mo2357();
    }
}
