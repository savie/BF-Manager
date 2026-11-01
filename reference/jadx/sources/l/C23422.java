package l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: renamed from: l.᩻ۗۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z8K9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C23422 extends AbstractC16862 implements Handler.Callback {

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC21188 f75838;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public boolean f75839;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10722 f75840;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5782 f75841;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public boolean f75842;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public C0987 f75843;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public long f75844;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public long f75845;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final C7783 f75846;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final Handler f75847;

    @Override // l.InterfaceC4784, l.InterfaceC2667
    public final String getName() {
        return "MetadataRenderer";
    }

    @Override // l.InterfaceC4784
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo13264() {
        return true;
    }

    public C23422(InterfaceC10722 interfaceC10722, Looper looper) {
        super(5);
        this.f75840 = interfaceC10722;
        this.f75847 = looper == null ? null : new Handler(looper, this);
        this.f75841 = InterfaceC5782.f19635;
        this.f75846 = new C7783(1, 0);
        this.f75845 = -9223372036854775807L;
    }

    @Override // l.InterfaceC2667
    /* JADX INFO: renamed from: ۙ */
    public final int mo8212(C7648 c7648) {
        if (((C17071) this.f75841).m39855(c7648)) {
            return C13958.m33811(c7648.f25245 == 0 ? 4 : 2, 0, 0, 0);
        }
        return C13958.m33811(0, 0, 0, 0);
    }

    @Override // l.AbstractC16862
    /* JADX INFO: renamed from: ۙ */
    public final void mo13950(C7648[] c7648Arr, long j, long j2, C15274 c15274) {
        this.f75838 = ((C17071) this.f75841).m39854(c7648Arr[0]);
        C0987 c0987 = this.f75843;
        if (c0987 != null) {
            this.f75843 = c0987.m3790((c0987.f4632 + this.f75845) - j2);
        }
        this.f75845 = j2;
    }

    @Override // l.AbstractC16862
    /* JADX INFO: renamed from: ۙ */
    public final void mo13942(long j, boolean z) {
        this.f75843 = null;
        this.f75839 = false;
        this.f75842 = false;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0047  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m51579(C0987 c0987, ArrayList arrayList) {
        for (int i = 0; i < c0987.m3789(); i++) {
            C7648 c7648Mo3145 = c0987.m3793(i).mo3145();
            if (c7648Mo3145 != null) {
                C17071 c17071 = (C17071) this.f75841;
                if (c17071.m39855(c7648Mo3145)) {
                    AbstractC21188 abstractC21188M39854 = c17071.m39854(c7648Mo3145);
                    byte[] bArrMo3147 = c0987.m3793(i).mo3147();
                    bArrMo3147.getClass();
                    C7783 c7783 = this.f75846;
                    c7783.mo7();
                    c7783.m38027(bArrMo3147.length);
                    ByteBuffer byteBuffer = c7783.f51912;
                    String str = C17983.f57504;
                    byteBuffer.put(bArrMo3147);
                    c7783.m38025();
                    C0987 c0987M47639 = abstractC21188M39854.m47639(c7783);
                    if (c0987M47639 != null) {
                        m51579(c0987M47639, arrayList);
                    }
                } else {
                    arrayList.add(c0987.m3793(i));
                }
            } else {
                arrayList.add(c0987.m3793(i));
            }
        }
    }

    @Override // l.AbstractC16862
    /* JADX INFO: renamed from: ۧ */
    public final void mo13958() {
        this.f75843 = null;
        this.f75838 = null;
        this.f75845 = -9223372036854775807L;
    }

    @Override // l.AbstractC16862, l.InterfaceC4784
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo13268() {
        return this.f75842;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            this.f75840.mo11573((C0987) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // l.InterfaceC4784
    /* JADX INFO: renamed from: ۙ */
    public final void mo13260(long j, long j2) {
        boolean z = true;
        while (z) {
            if (!this.f75839 && this.f75843 == null) {
                C7783 c7783 = this.f75846;
                c7783.mo7();
                C12526 c12526M39525 = m39525();
                int iM39515 = m39515(c12526M39525, c7783, 0);
                if (iM39515 == -4) {
                    if (c7783.m42264()) {
                        this.f75839 = true;
                    } else if (c7783.f51910 >= m39528()) {
                        c7783.f25648 = this.f75844;
                        c7783.m38025();
                        AbstractC21188 abstractC21188 = this.f75838;
                        String str = C17983.f57504;
                        C0987 c0987M47639 = abstractC21188.m47639(c7783);
                        if (c0987M47639 != null) {
                            ArrayList arrayList = new ArrayList(c0987M47639.m3789());
                            m51579(c0987M47639, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.f75843 = new C0987(m51580(c7783.f51910), (InterfaceC22155[]) arrayList.toArray(new InterfaceC22155[0]));
                            }
                        }
                    }
                } else if (iM39515 == -5) {
                    C7648 c7648 = c12526M39525.f41899;
                    c7648.getClass();
                    this.f75844 = c7648.f25278;
                }
            }
            C0987 c0987 = this.f75843;
            if (c0987 == null || c0987.f4632 > m51580(j)) {
                z = false;
            } else {
                C0987 c0988 = this.f75843;
                Handler handler = this.f75847;
                if (handler != null) {
                    handler.obtainMessage(1, c0988).sendToTarget();
                } else {
                    this.f75840.mo11573(c0988);
                }
                this.f75843 = null;
                z = true;
            }
            if (this.f75839 && this.f75843 == null) {
                this.f75842 = true;
            }
        }
    }

    @SideEffectFree
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private long m51580(long j) {
        C2023.m6510(j != -9223372036854775807L);
        C2023.m6510(this.f75845 != -9223372036854775807L);
        return j - this.f75845;
    }
}
