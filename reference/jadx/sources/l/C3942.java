package l;

import com.alipay.sdk.m.n.c;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۘۚۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: U4FJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C3942 implements InterfaceC2668 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4688 f13447;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final EnumC4225 f13448;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C19076 f13449;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C22478 f13450;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C11289 f13451;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final List f13446 = C19822.m45598("connection", c.f, "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final List f13445 = C19822.m45598("connection", c.f, "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    public C3942(C24363 c24363, C4688 c4688, C19076 c19076, C22478 c22478) {
        this.f13447 = c4688;
        this.f13449 = c19076;
        this.f13450 = c22478;
        List listM54457 = c24363.m54457();
        EnumC4225 enumC4225 = EnumC4225.H2_PRIOR_KNOWLEDGE;
        this.f13448 = listM54457.contains(enumC4225) ? enumC4225 : EnumC4225.HTTP_2;
    }

    @Override // l.InterfaceC2668
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC7099 mo8828(C7954 c7954, long j) {
        return this.f13451.m28539();
    }

    @Override // l.InterfaceC2668
    /* JADX INFO: renamed from: ۙ */
    public final void mo8831(C7954 c7954) {
        if (this.f13451 != null) {
            return;
        }
        boolean z = c7954.m21647() != null;
        C11682 c11682M21648 = c7954.m21648();
        ArrayList arrayList = new ArrayList(c11682M21648.m29363() + 4);
        arrayList.add(new C23334(C23334.f75572, c7954.m21651()));
        C16794 c16794 = C23334.f75571;
        C16903 c16903M21649 = c7954.m21649();
        String strM39877 = c16903M21649.m39877();
        String strM39878 = c16903M21649.m39878();
        if (strM39878 != null) {
            strM39877 = C8008.m21875('?', strM39877, strM39878);
        }
        arrayList.add(new C23334(c16794, strM39877));
        String strM21646 = c7954.m21646("Host");
        if (strM21646 != null) {
            arrayList.add(new C23334(C23334.f75573, strM21646));
        }
        arrayList.add(new C23334(C23334.f75570, c7954.m21649().m39873()));
        int iM29363 = c11682M21648.m29363();
        for (int i = 0; i < iM29363; i++) {
            C16794 c16794M39651 = C16794.m39651(c11682M21648.m29360(i).toLowerCase(Locale.US));
            if (!f13446.contains(c16794M39651.mo23092())) {
                arrayList.add(new C23334(c16794M39651, c11682M21648.m29364(i)));
            }
        }
        C11289 c11289M50692 = this.f13450.m50692(arrayList, z);
        this.f13451 = c11289M50692;
        C1595 c1595 = c11289M50692.f35601;
        C4688 c4688 = this.f13447;
        long jM14559 = c4688.m14559();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c1595.mo15814(jM14559);
        this.f13451.f35606.mo15814(c4688.m14552());
    }

    @Override // l.InterfaceC2668
    /* JADX INFO: renamed from: ᩷ */
    public final void mo8832() {
        this.f13450.f72736.flush();
    }

    @Override // l.InterfaceC2668
    /* JADX INFO: renamed from: ۙ */
    public final void mo8830() throws IOException {
        ((C12781) this.f13451.m28539()).close();
    }

    @Override // l.InterfaceC2668
    /* JADX INFO: renamed from: ۙ */
    public final C1242 mo8827(boolean z) throws ProtocolException {
        C11682 c11682M28538 = this.f13451.m28538();
        C1988 c1988 = new C1988();
        int iM29363 = c11682M28538.m29363();
        C22588 c22588M50912 = null;
        for (int i = 0; i < iM29363; i++) {
            String strM29360 = c11682M28538.m29360(i);
            String strM29364 = c11682M28538.m29364(i);
            if (strM29360.equals(":status")) {
                c22588M50912 = C22588.m50912("HTTP/1.1 " + strM29364);
            } else if (!f13445.contains(strM29360)) {
                AbstractC4906.f17137.mo15057(c1988, strM29360, strM29364);
            }
        }
        if (c22588M50912 == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        C1242 c1242 = new C1242();
        c1242.m4483(this.f13448);
        c1242.m4480(c22588M50912.f73024);
        c1242.m4492(c22588M50912.f73026);
        c1242.m4488(c1988.m6809());
        if (z && AbstractC4906.f17137.mo15050(c1242) == 100) {
            return null;
        }
        return c1242;
    }

    @Override // l.InterfaceC2668
    /* JADX INFO: renamed from: ۙ */
    public final C21842 mo8829(C9444 c9444) {
        this.f13449.f61770.getClass();
        return new C21842(c9444.m24817("Content-Type"), C13854.m33800(c9444), C14556.m35108(new C24080(this, this.f13451.m28546())));
    }

    @Override // l.InterfaceC2668
    public final void cancel() {
        C11289 c11289 = this.f13451;
        if (c11289 != null) {
            c11289.m28545(EnumC15874.CANCEL);
        }
    }
}
