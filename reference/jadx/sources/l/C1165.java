package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.֨ܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I4F9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1165 extends AbstractRunnableC20602 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EnumC9365 f5218;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f5219;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20217 f5220;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1165(C20217 c20217, Object[] objArr, int i, EnumC9365 enumC9365) {
        super("OkHttp %s stream %d", objArr);
        this.f5220 = c20217;
        this.f5219 = i;
        this.f5218 = enumC9365;
    }

    @Override // l.AbstractRunnableC20602
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4299() {
        C20217 c20217 = this.f5220;
        try {
            try {
                c20217.f65611.m52277(this.f5219, this.f5218);
            } catch (IOException unused) {
            }
        } catch (IOException unused2) {
            EnumC9365 enumC9365 = EnumC9365.PROTOCOL_ERROR;
            c20217.m45701(enumC9365, enumC9365);
        }
    }
}
