package l;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ۜ۬ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: W8IZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C6785 extends AbstractC16862 {

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public long f22909;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final C2460 f22910;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC3962 f22911;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final C16033 f22912;

    @Override // l.InterfaceC4784, l.InterfaceC2667
    public final String getName() {
        return "CameraMotionRenderer";
    }

    @Override // l.InterfaceC4784
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo13264() {
        return true;
    }

    public C6785() {
        super(6);
        this.f22912 = new C16033(1, 0);
        this.f22910 = new C2460();
    }

    @Override // l.InterfaceC2667
    /* JADX INFO: renamed from: ۙ */
    public final int mo8212(C7648 c7648) {
        return "application/x-camera-motion".equals(c7648.f25265) ? C13958.m33811(4, 0, 0, 0) : C13958.m33811(0, 0, 0, 0);
    }

    @Override // l.AbstractC16862, l.InterfaceC23691
    /* JADX INFO: renamed from: ۙ */
    public final void mo13941(int i, Object obj) {
        if (i == 8) {
            this.f22911 = (InterfaceC3962) obj;
        }
    }

    @Override // l.AbstractC16862
    /* JADX INFO: renamed from: ۙ */
    public final void mo13942(long j, boolean z) {
        this.f22909 = Long.MIN_VALUE;
        InterfaceC3962 interfaceC3962 = this.f22911;
        if (interfaceC3962 != null) {
            interfaceC3962.mo11448();
        }
    }

    @Override // l.InterfaceC4784
    /* JADX INFO: renamed from: ۙ */
    public final void mo13260(long j, long j2) {
        float[] fArr;
        while (!mo13253() && this.f22909 < 100000 + j) {
            C16033 c16033 = this.f22912;
            c16033.mo7();
            if (m39515(m39525(), c16033, 0) != -4 || c16033.m42264()) {
                return;
            }
            long j3 = c16033.f51910;
            this.f22909 = j3;
            boolean z = j3 < m39528();
            if (this.f22911 != null && !z) {
                c16033.m38025();
                ByteBuffer byteBuffer = c16033.f51912;
                String str = C17983.f57504;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] bArrArray = byteBuffer.array();
                    int iLimit = byteBuffer.limit();
                    C2460 c2460 = this.f22910;
                    c2460.m7508(iLimit, bArrArray);
                    c2460.m7510(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i = 0; i < 3; i++) {
                        fArr2[i] = Float.intBitsToFloat(c2460.m7502());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.f22911.mo11447(this.f22909 - m39522(), fArr);
                }
            }
        }
    }

    @Override // l.AbstractC16862
    /* JADX INFO: renamed from: ۧ */
    public final void mo13958() {
        InterfaceC3962 interfaceC3962 = this.f22911;
        if (interfaceC3962 != null) {
            interfaceC3962.mo11448();
        }
    }
}
