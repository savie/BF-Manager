package l;

import android.net.Uri;
import java.io.EOFException;
import java.util.Map;

/* JADX INFO: renamed from: l.ܶۙܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8KK */
/* JADX INFO: loaded from: classes4.dex */
public final class C15005 implements InterfaceC6101 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC10045 f48932;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC0166 f48933;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C14984 f48934;

    public C15005(InterfaceC0166 interfaceC0166) {
        this.f48933 = interfaceC0166;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x006f  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35980(InterfaceC15785 interfaceC15785, Uri uri, Map map, long j, long j2, InterfaceC15690 interfaceC15690) throws C14507 {
        C14984 c14984 = new C14984(interfaceC15785, j, j2);
        this.f48934 = c14984;
        if (this.f48932 != null) {
            return;
        }
        InterfaceC10045[] interfaceC10045ArrMo1323 = this.f48933.mo1323(uri, map);
        C4793 c4793M49796 = AbstractC22433.m49796(interfaceC10045ArrMo1323.length);
        if (interfaceC10045ArrMo1323.length == 1) {
            this.f48932 = interfaceC10045ArrMo1323[0];
        } else {
            for (InterfaceC10045 interfaceC10045 : interfaceC10045ArrMo1323) {
                try {
                    if (interfaceC10045.mo2754(c14984)) {
                        this.f48932 = interfaceC10045;
                        c14984.mo19217();
                        break;
                    } else {
                        c4793M49796.m52162(interfaceC10045.mo2756());
                        boolean z = this.f48932 != null || c14984.getPosition() == j;
                        C2023.m6510(z);
                        c14984.mo19217();
                    }
                } catch (EOFException unused) {
                    if (this.f48932 != null || c14984.getPosition() == j) {
                    }
                } catch (Throwable th) {
                    C2023.m6510(this.f48932 != null || c14984.getPosition() == j);
                    c14984.mo19217();
                    throw th;
                }
                C2023.m6510(z);
                c14984.mo19217();
            }
            if (this.f48932 == null) {
                String str = "None of the available extractors (" + C13366.m32865(", ").m32867((Iterable) C3051.m9144(AbstractC22433.m49800(interfaceC10045ArrMo1323), new C11996())) + ") could read the stream.";
                uri.getClass();
                throw new C14507(str, c4793M49796.m13309());
            }
        }
        this.f48932.mo2753(interfaceC15690);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m35981() {
        InterfaceC10045 interfaceC10045 = this.f48932;
        if (interfaceC10045 != null) {
            interfaceC10045.mo2751();
            this.f48932 = null;
        }
        this.f48934 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35978() {
        InterfaceC10045 interfaceC10045 = this.f48932;
        if (interfaceC10045 == null) {
            return;
        }
        InterfaceC10045 interfaceC10045Mo2755 = interfaceC10045.mo2755();
        if (interfaceC10045Mo2755 instanceof C5624) {
            ((C5624) interfaceC10045Mo2755).m15517();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long m35982() {
        C14984 c14984 = this.f48934;
        if (c14984 != null) {
            return c14984.getPosition();
        }
        return -1L;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35979(long j, long j2) {
        InterfaceC10045 interfaceC10045 = this.f48932;
        interfaceC10045.getClass();
        interfaceC10045.mo2752(j, j2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m35977(C0954 c0954) {
        InterfaceC10045 interfaceC10045 = this.f48932;
        interfaceC10045.getClass();
        C14984 c14984 = this.f48934;
        c14984.getClass();
        return interfaceC10045.mo2750(c14984, c0954);
    }
}
