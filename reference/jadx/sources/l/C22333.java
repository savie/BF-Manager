package l;

import com.alipay.sdk.m.n.c;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.᩹ܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: U4FJ */
/* JADX INFO: loaded from: classes.dex */
public final class C22333 implements InterfaceC7953 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C11045 f72915;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7247 f72916;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C15009 f72917;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final EnumC22013 f72918;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C20217 f72919;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final List f72914 = C0140.m1228("connection", c.f, "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final List f72913 = C0140.m1228("connection", c.f, "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    public C22333(C5079 c5079, C7247 c7247, C15009 c15009, C20217 c20217) {
        this.f72916 = c7247;
        this.f72917 = c15009;
        this.f72919 = c20217;
        List listM14168 = c5079.m14168();
        EnumC22013 enumC22013 = EnumC22013.H2_PRIOR_KNOWLEDGE;
        this.f72918 = listM14168.contains(enumC22013) ? enumC22013 : EnumC22013.HTTP_2;
    }

    @Override // l.InterfaceC7953
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC8597 mo20987(C22719 c22719, long j) {
        return this.f72915.m27859();
    }

    @Override // l.InterfaceC7953
    /* JADX INFO: renamed from: ۙ */
    public final void mo20991(C22719 c22719) {
        if (this.f72915 != null) {
            return;
        }
        boolean z = c22719.m50358() != null;
        C10912 c10912M50360 = c22719.m50360();
        ArrayList arrayList = new ArrayList(c10912M50360.m27347() + 4);
        arrayList.add(new C3013(C3013.f11261, c22719.m50359()));
        C14511 c14511 = C3013.f11265;
        C14440 c14440M50355 = c22719.m50355();
        String strM34743 = c14440M50355.m34743();
        String strM34735 = c14440M50355.m34735();
        if (strM34735 != null) {
            strM34743 = strM34743 + '?' + strM34735;
        }
        arrayList.add(new C3013(c14511, strM34743));
        String strM50357 = c22719.m50357("Host");
        if (strM50357 != null) {
            arrayList.add(new C3013(C3013.f11266, strM50357));
        }
        arrayList.add(new C3013(C3013.f11263, c22719.m50355().m34747()));
        int iM27347 = c10912M50360.m27347();
        for (int i = 0; i < iM27347; i++) {
            C14511 c14511M34934 = C14511.m34934(c10912M50360.m27344(i).toLowerCase(Locale.US));
            if (!f72914.contains(c14511M34934.mo34948())) {
                arrayList.add(new C3013(c14511M34934, c10912M50360.m27348(i)));
            }
        }
        C11045 c11045M45692 = this.f72919.m45692(arrayList, z);
        this.f72915 = c11045M45692;
        C6105 c6105 = c11045M45692.f37508;
        C7247 c7247 = this.f72916;
        long jM19376 = c7247.m19376();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c6105.mo9654(jM19376);
        this.f72915.f37518.mo9654(c7247.m19368());
    }

    @Override // l.InterfaceC7953
    /* JADX INFO: renamed from: ܰ */
    public final void mo20992() {
        this.f72919.f65611.flush();
    }

    @Override // l.InterfaceC7953
    /* JADX INFO: renamed from: ۙ */
    public final void mo20990() throws IOException {
        ((C12456) this.f72915.m27859()).close();
    }

    @Override // l.InterfaceC7953
    /* JADX INFO: renamed from: ۙ */
    public final C17779 mo20988(boolean z) throws ProtocolException {
        C10912 c10912M27861 = this.f72915.m27861();
        C5972 c5972 = new C5972();
        int iM27347 = c10912M27861.m27347();
        C19948 c19948M45245 = null;
        for (int i = 0; i < iM27347; i++) {
            String strM27344 = c10912M27861.m27344(i);
            String strM27348 = c10912M27861.m27348(i);
            if (strM27344.equals(":status")) {
                c19948M45245 = C19948.m45245("HTTP/1.1 " + strM27348);
            } else if (!f72913.contains(strM27344)) {
                AbstractC7196.f24003.mo19138(c5972, strM27344, strM27348);
            }
        }
        if (c19948M45245 == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        C17779 c17779 = new C17779();
        c17779.m41348(this.f72918);
        c17779.m41341(c19948M45245.f63897);
        c17779.m41353(c19948M45245.f63899);
        c17779.m41344(c5972.m16265());
        if (z && AbstractC7196.f24003.mo19132(c17779) == 100) {
            return null;
        }
        return c17779;
    }

    @Override // l.InterfaceC7953
    /* JADX INFO: renamed from: ۙ */
    public final C20653 mo20989(C18485 c18485) {
        this.f72917.f48950.getClass();
        return new C20653(c18485.m42859("Content-Type"), C10070.m25481(c18485), C0834.m3437(new C5399(this, this.f72915.m27853())));
    }

    @Override // l.InterfaceC7953
    public final void cancel() {
        C11045 c11045 = this.f72915;
        if (c11045 != null) {
            c11045.m27863(EnumC9365.CANCEL);
        }
    }
}
