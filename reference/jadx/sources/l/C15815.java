package l;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: l.ܺ۠ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97TY */
/* JADX INFO: loaded from: classes4.dex */
public final class C15815 implements InterfaceC6951 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20753 f51182;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Inflater f51183;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C2460 f51181 = new C2460();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C2460 f51184 = new C2460();

    @Override // l.InterfaceC6951
    public final /* synthetic */ void reset() {
    }

    @Override // l.InterfaceC6951
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ InterfaceC9753 mo11108(int i, int i2, byte[] bArr) {
        return C22474.m49977(this, bArr, i2);
    }

    public C15815(List list) {
        C20753 c20753 = new C20753();
        this.f51182 = c20753;
        c20753.m46757(new String((byte[]) list.get(0), StandardCharsets.UTF_8));
    }

    @Override // l.InterfaceC6951
    /* JADX INFO: renamed from: ۙ */
    public final void mo11109(byte[] bArr, int i, int i2, C4128 c4128, InterfaceC1008 interfaceC1008) {
        C0612 c0612M46755;
        C2460 c2460 = this.f51181;
        c2460.m7508(i2 + i, bArr);
        c2460.m7510(i);
        if (this.f51183 == null) {
            this.f51183 = new Inflater();
        }
        Inflater inflater = this.f51183;
        String str = C17983.f57504;
        if (c2460.m7503() > 0 && c2460.m7534() == 120) {
            C2460 c2461 = this.f51184;
            if (C17983.m41843(c2460, c2461, inflater)) {
                c2460.m7508(c2461.m7509(), c2461.m7518());
            }
        }
        C20753 c20753 = this.f51182;
        c20753.m46756();
        int iM7503 = c2460.m7503();
        if (iM7503 < 2 || c2460.m7519() != iM7503) {
            c0612M46755 = null;
        } else {
            c20753.m46758(c2460);
            c0612M46755 = c20753.m46755(c2460);
        }
        interfaceC1008.accept(new C17513(-9223372036854775807L, 5000000L, c0612M46755 != null ? AbstractC22433.of((Object) c0612M46755) : AbstractC22433.of()));
    }
}
