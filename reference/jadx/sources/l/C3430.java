package l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: renamed from: l.ۗ۬ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z8K9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3430 extends AbstractC25280 implements Handler.Callback {

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public boolean f11113;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC16108 f11114;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23568 f11115;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC13468 f11116;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final C15705 f11117;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public C19378 f11118;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public boolean f11119;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public long f11120;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public long f11121;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final Handler f11122;

    @Override // l.InterfaceC4002, l.InterfaceC18172
    public final String getName() {
        return "MetadataRenderer";
    }

    @Override // l.InterfaceC4002
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean mo11189() {
        return true;
    }

    public C3430(InterfaceC23568 interfaceC23568, Looper looper) {
        super(5);
        this.f11115 = interfaceC23568;
        this.f11122 = looper == null ? null : new Handler(looper, this);
        this.f11114 = InterfaceC16108.f52175;
        this.f11117 = new C15705(1, 0);
        this.f11120 = -9223372036854775807L;
    }

    @Override // l.InterfaceC18172
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo11185(C15648 c15648) {
        if (((C17600) this.f11114).m41263(c15648)) {
            return C14442.m34863(c15648.f50813 == 0 ? 4 : 2, 0, 0, 0);
        }
        return C14442.m34863(0, 0, 0, 0);
    }

    @Override // l.AbstractC25280
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo11188(C15648[] c15648Arr, long j, long j2, C8402 c8402) {
        this.f11116 = ((C17600) this.f11114).m41262(c15648Arr[0]);
        C19378 c19378 = this.f11118;
        if (c19378 != null) {
            this.f11118 = c19378.m44821((c19378.f62611 + this.f11120) - j2);
        }
        this.f11120 = j2;
    }

    @Override // l.AbstractC25280
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo11187(long j, boolean z) {
        this.f11118 = null;
        this.f11113 = false;
        this.f11119 = false;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0047  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m11182(C19378 c19378, ArrayList arrayList) {
        for (int i = 0; i < c19378.m44819(); i++) {
            C15648 c15648Mo12245 = c19378.m44820(i).mo12245();
            if (c15648Mo12245 != null) {
                C17600 c17600 = (C17600) this.f11114;
                if (c17600.m41263(c15648Mo12245)) {
                    AbstractC13468 abstractC13468M41262 = c17600.m41262(c15648Mo12245);
                    byte[] bArrMo12247 = c19378.m44820(i).mo12247();
                    bArrMo12247.getClass();
                    C15705 c15705 = this.f11117;
                    c15705.mo7();
                    c15705.m16711(bArrMo12247.length);
                    ByteBuffer byteBuffer = c15705.f19651;
                    String str = C7116.f23455;
                    byteBuffer.put(bArrMo12247);
                    c15705.m16713();
                    C19378 c19378M33129 = abstractC13468M41262.m33129(c15705);
                    if (c19378M33129 != null) {
                        m11182(c19378M33129, arrayList);
                    }
                } else {
                    arrayList.add(c19378.m44820(i));
                }
            } else {
                arrayList.add(c19378.m44820(i));
            }
        }
    }

    @Override // l.AbstractC25280
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void mo11184() {
        this.f11118 = null;
        this.f11116 = null;
        this.f11120 = -9223372036854775807L;
    }

    @Override // l.AbstractC25280, l.InterfaceC4002
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean mo11190() {
        return this.f11119;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            this.f11115.mo4884((C19378) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // l.InterfaceC4002
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo11186(long j, long j2) {
        boolean z = true;
        while (z) {
            if (!this.f11113 && this.f11118 == null) {
                C15705 c15705 = this.f11117;
                c15705.mo7();
                C16461 c16461M56450 = m56450();
                int iM56443 = m56443(c16461M56450, c15705, 0);
                if (iM56443 == -4) {
                    if (c15705.m33305()) {
                        this.f11113 = true;
                    } else if (c15705.f19652 >= m56453()) {
                        c15705.f51033 = this.f11121;
                        c15705.m16713();
                        AbstractC13468 abstractC13468 = this.f11116;
                        String str = C7116.f23455;
                        C19378 c19378M33129 = abstractC13468.m33129(c15705);
                        if (c19378M33129 != null) {
                            ArrayList arrayList = new ArrayList(c19378M33129.m44819());
                            m11182(c19378M33129, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.f11118 = new C19378(m11183(c15705.f19652), (InterfaceC8191[]) arrayList.toArray(new InterfaceC8191[0]));
                            }
                        }
                    }
                } else if (iM56443 == -5) {
                    C15648 c15648 = c16461M56450.f53378;
                    c15648.getClass();
                    this.f11121 = c15648.f50837;
                }
            }
            C19378 c19378 = this.f11118;
            if (c19378 == null || c19378.f62611 > m11183(j)) {
                z = false;
            } else {
                C19378 c19379 = this.f11118;
                Handler handler = this.f11122;
                if (handler != null) {
                    handler.obtainMessage(1, c19379).sendToTarget();
                } else {
                    this.f11115.mo4884(c19379);
                }
                this.f11118 = null;
                z = true;
            }
            if (this.f11113 && this.f11118 == null) {
                this.f11119 = true;
            }
        }
    }

    @SideEffectFree
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private long m11183(long j) {
        C20782.m47568(j != -9223372036854775807L);
        C20782.m47568(this.f11120 != -9223372036854775807L);
        return j - this.f11120;
    }
}
