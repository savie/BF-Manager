package l;

import java.io.InputStream;

/* JADX INFO: renamed from: l.᩸ᩳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: C12B */
/* JADX INFO: loaded from: classes.dex */
public final class C22983 extends AbstractC20970 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15481 f74623;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8002 f74624;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22983(String str, long j, C11048 c11048, C15481 c15481, C8002 c8002) {
        super(str, j, c11048);
        this.f74623 = c15481;
        this.f74624 = c8002;
    }

    @Override // l.AbstractC20970
    /* JADX INFO: renamed from: ۙ */
    public final InputStream mo10654() {
        return this.f74623.m37046().m51727(this.f74624);
    }
}
