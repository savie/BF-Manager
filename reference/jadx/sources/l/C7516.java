package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.۟ܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I4F9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7516 extends AbstractRunnableC20602 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4631 f24999;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15984 f25000;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7516(C15984 c15984, Object[] objArr, C4631 c4631) {
        super("OkHttp %s ACK Settings", objArr);
        this.f25000 = c15984;
        this.f24999 = c4631;
    }

    @Override // l.AbstractRunnableC20602
    /* JADX INFO: renamed from: ۙ */
    public final void mo4299() {
        C11045[] c11045Arr;
        long j;
        C15984 c15984 = this.f25000;
        C4631 c4631 = this.f24999;
        synchronized (c15984.f51764.f65611) {
            synchronized (c15984.f51764) {
                int iM12788 = c15984.f51764.f65617.m12788();
                c15984.f51764.f65617.m12785(c4631);
                int iM12789 = c15984.f51764.f65617.m12788();
                c11045Arr = null;
                if (iM12789 == -1 || iM12789 == iM12788) {
                    j = 0;
                } else {
                    j = iM12789 - iM12788;
                    if (!c15984.f51764.f65616.isEmpty()) {
                        c11045Arr = (C11045[]) c15984.f51764.f65616.values().toArray(new C11045[c15984.f51764.f65616.size()]);
                    }
                }
            }
            try {
                C20217 c20217 = c15984.f51764;
                c20217.f65611.m52280(c20217.f65617);
            } catch (IOException unused) {
                C20217 c20218 = c15984.f51764;
                try {
                    EnumC9365 enumC9365 = EnumC9365.PROTOCOL_ERROR;
                    c20218.m45701(enumC9365, enumC9365);
                } catch (IOException unused2) {
                }
            }
        }
        if (c11045Arr != null) {
            for (C11045 c11045 : c11045Arr) {
                synchronized (c11045) {
                    c11045.f37511 += j;
                    if (j > 0) {
                        c11045.notifyAll();
                    }
                }
            }
        }
        C20217.f65601.execute(new C20922(c15984, c15984.f51764.f65613));
    }
}
