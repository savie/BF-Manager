package l;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ۢ۫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: W8IZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C10133 extends AbstractC25280 {

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public final C21287 f32427;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC19084 f32428;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public long f32429;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final C5690 f32430;

    @Override // l.InterfaceC4002, l.InterfaceC18172
    public final String getName() {
        return "CameraMotionRenderer";
    }

    @Override // l.InterfaceC4002
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo11189() {
        return true;
    }

    public C10133() {
        super(6);
        this.f32430 = new C5690(1, 0);
        this.f32427 = new C21287();
    }

    @Override // l.InterfaceC18172
    /* JADX INFO: renamed from: ۙ */
    public final int mo11185(C15648 c15648) {
        return "application/x-camera-motion".equals(c15648.f50848) ? C14442.m34863(4, 0, 0, 0) : C14442.m34863(0, 0, 0, 0);
    }

    @Override // l.AbstractC25280, l.InterfaceC3256
    /* JADX INFO: renamed from: ۙ */
    public final void mo10630(int i, Object obj) {
        if (i == 8) {
            this.f32428 = (InterfaceC19084) obj;
        }
    }

    @Override // l.AbstractC25280
    /* JADX INFO: renamed from: ۙ */
    public final void mo11187(long j, boolean z) {
        this.f32429 = Long.MIN_VALUE;
        InterfaceC19084 interfaceC19084 = this.f32428;
        if (interfaceC19084 != null) {
            interfaceC19084.mo24944();
        }
    }

    @Override // l.InterfaceC4002
    /* JADX INFO: renamed from: ۙ */
    public final void mo11186(long j, long j2) {
        float[] fArr;
        while (!mo12948() && this.f32429 < 100000 + j) {
            C5690 c5690 = this.f32430;
            c5690.mo7();
            if (m56443(m56450(), c5690, 0) != -4 || c5690.m33305()) {
                return;
            }
            long j3 = c5690.f19652;
            this.f32429 = j3;
            boolean z = j3 < m56453();
            if (this.f32428 != null && !z) {
                c5690.m16713();
                ByteBuffer byteBuffer = c5690.f19651;
                String str = C7116.f23455;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] bArrArray = byteBuffer.array();
                    int iLimit = byteBuffer.limit();
                    C21287 c21287 = this.f32427;
                    c21287.m48491(iLimit, bArrArray);
                    c21287.m48510(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i = 0; i < 3; i++) {
                        fArr2[i] = Float.intBitsToFloat(c21287.m48483());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.f32428.mo24943(this.f32429 - m56448(), fArr);
                }
            }
        }
    }

    @Override // l.AbstractC25280
    /* JADX INFO: renamed from: ֨ */
    public final void mo11184() {
        InterfaceC19084 interfaceC19084 = this.f32428;
        if (interfaceC19084 != null) {
            interfaceC19084.mo24944();
        }
    }
}
