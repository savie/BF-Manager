package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۙ֫ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: I4F9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4578 extends AbstractRunnableC22060 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3086 f16287;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10543 f16288;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4578(C10543 c10543, Object[] objArr, C3086 c3086) {
        super("OkHttp %s ACK Settings", objArr);
        this.f16288 = c10543;
        this.f16287 = c3086;
    }

    @Override // l.AbstractRunnableC22060
    /* JADX INFO: renamed from: ۙ */
    public final void mo1658() {
        C11289[] c11289Arr;
        long j;
        C10543 c10543 = this.f16288;
        C3086 c3086 = this.f16287;
        synchronized (c10543.f33519.f72736) {
            synchronized (c10543.f33519) {
                int iM10060 = c10543.f33519.f72745.m10060();
                c10543.f33519.f72745.m10057(c3086);
                int iM10061 = c10543.f33519.f72745.m10060();
                c11289Arr = null;
                if (iM10061 == -1 || iM10061 == iM10060) {
                    j = 0;
                } else {
                    j = iM10061 - iM10060;
                    if (!c10543.f33519.f72729.isEmpty()) {
                        c11289Arr = (C11289[]) c10543.f33519.f72729.values().toArray(new C11289[c10543.f33519.f72729.size()]);
                    }
                }
            }
            try {
                C22478 c22478 = c10543.f33519;
                c22478.f72736.m55189(c22478.f72745);
            } catch (IOException unused) {
                C22478 c22479 = c10543.f33519;
                try {
                    EnumC15874 enumC15874 = EnumC15874.PROTOCOL_ERROR;
                    c22479.m50701(enumC15874, enumC15874);
                } catch (IOException unused2) {
                }
            }
        }
        if (c11289Arr != null) {
            for (C11289 c11289 : c11289Arr) {
                synchronized (c11289) {
                    c11289.f35597 += j;
                    if (j > 0) {
                        c11289.notifyAll();
                    }
                }
            }
        }
        C22478.f72723.execute(new C21732(c10543, c10543.f33519.f72725));
    }
}
