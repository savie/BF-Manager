package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܰۙܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2IQX */
/* JADX INFO: loaded from: classes5.dex */
public final class C14362 implements InterfaceC16357 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18092 f45287;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f45288;

    public C14362(C18092 c18092, boolean z) {
        this.f45287 = c18092;
        this.f45288 = z;
    }

    @Override // l.InterfaceC16357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo34790(int i, int i2, int i3, boolean z) {
        C18092 c18092 = this.f45287;
        if (c18092.f59208 || c18092.f59196 || this.f45288 != c18092.f59192) {
            return;
        }
        c18092.f59191 = -1L;
        c18092.f59195 = -1;
        c18092.f59209 = -1;
        c18092.m42167();
    }

    @Override // l.InterfaceC16357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo34794(long j) {
        C18092 c18092 = this.f45287;
        if (c18092.f59210 == null || j < 0 || j >= c18092.f59210.f43259) {
            return false;
        }
        c18092.f59191 = j;
        c18092.f59207 = true;
        c18092.f59204 = -1;
        c18092.f59209 = -1;
        c18092.m42167();
        return true;
    }

    @Override // l.InterfaceC16357
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void mo34795() {
        C18092 c18092 = this.f45287;
        if (c18092.f59200 != null) {
            ((ActivityC22568) c18092.f59200).m50861();
        }
    }

    @Override // l.InterfaceC16357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo34793(boolean z, boolean z2, boolean z3) {
        C18092 c18092 = this.f45287;
        if (c18092.f59208) {
            return;
        }
        c18092.m42179();
        c18092.m42167();
    }

    @Override // l.InterfaceC16357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo34792(boolean z) {
        C18092 c18092 = this.f45287;
        if (c18092.f59200 != null) {
            ((ActivityC22568) c18092.f59200).m50860(z);
        }
    }

    @Override // l.InterfaceC16357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo34791(IOException iOException) {
        C18092 c18092 = this.f45287;
        if (c18092.f59202) {
            return;
        }
        c18092.f59202 = true;
        c18092.f59201.m31384();
        c18092.f59212.m31384();
        if (c18092.f59200 != null) {
            ((ActivityC22568) c18092.f59200).m50858(iOException);
        }
    }
}
