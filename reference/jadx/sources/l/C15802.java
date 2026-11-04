package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ܶۗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: O44L */
/* JADX INFO: loaded from: classes5.dex */
public final class C15802 extends AbstractC17294 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f51414;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public AbstractC22664 f51415;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6108 f51416;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15802(C6108 c6108, AbstractC22664 abstractC22664, int i) {
        super(c6108, C8935.m23847(abstractC22664));
        this.f51416 = c6108;
        C11972.m30026(i >= 0);
        this.f51415 = abstractC22664;
        this.f51414 = i;
    }

    @Override // l.AbstractC17294
    /* JADX INFO: renamed from: ᩸ */
    public final AbstractC17294 mo5785() {
        int i = this.f56323;
        C6108 c6108 = this.f51416;
        int i2 = this.f51414;
        if (i2 <= 3) {
            c6108.f20850.m23883((C8935.m23859(i) * 4) + 26 + i2);
        } else {
            c6108.f20850.m23868(C8935.m23859(i) + 21, i2);
        }
        return c6108.f20855[i];
    }

    @Override // l.AbstractC17294
    /* JADX INFO: renamed from: ܳ */
    public final void mo28618() {
        int i = this.f56323;
        C6108 c6108 = this.f51416;
        int i2 = this.f51414;
        if (i2 <= 3) {
            c6108.f20850.m23883((C8935.m23859(i) * 4) + 59 + i2);
        } else {
            c6108.f20850.m23868(C8935.m23859(i) + 54, i2);
        }
        c6108.f20850.m23887(i2);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m37732(int i) {
        C6108 c6108 = this.f51416;
        int i2 = this.f56323;
        if (i2 == 0 && i >= -32768 && i <= 32767) {
            c6108.f20850.m23894(this.f51414, i);
            return;
        }
        mo5785();
        if (i >= 0) {
            new C24754(c6108, c6108.f20856.f48253, Integer.valueOf(i)).mo5785();
            c6108.f20850.m23883(96);
        } else {
            new C24754(c6108, c6108.f20856.f48253, Integer.valueOf(-i)).mo5785();
            c6108.f20850.m23883(100);
        }
        c6108.m17627(c6108.f20856.f48253).mo40623(i2);
        mo28618();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("localItem(type=");
        sb.append(this.f51415);
        sb.append("; reg=");
        return C12669.m31437(this.f51414, MotionUtils.EASING_TYPE_FORMAT_END, sb);
    }
}
