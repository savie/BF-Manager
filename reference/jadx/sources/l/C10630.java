package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۤ᩻᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: M605 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10630 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7807 f36289;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f36290;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f36291;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f36292;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f36293;

    public C10630(C7807 c7807, int i) {
        this.f36289 = c7807;
        this.f36292 = i;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static AbstractC15673 m26809(C10630 c10630) {
        C7807 c7807 = c10630.f36289;
        return new C19096(c10630, c7807.f25683, c10630.f36292, c7807.f25694);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private int m26811() {
        if (this.f36293 == 0) {
            C7807 c7807 = this.f36289;
            C18825 c18825M42184 = c7807.f25683.m41166().m42184(this.f36292);
            for (int i = 0; i < c7807.f25694; i++) {
                c18825M42184.m43449();
            }
            this.f36293 = c18825M42184.m43447();
        }
        return this.f36293;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Iterator m26812(C10630 c10630) {
        C7807 c7807 = c10630.f36289;
        return new C8513(c10630, c7807.f25683, c10630.m26811(), c7807.f25685);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m26806() {
        if (this.f36290 == 0) {
            C7807 c7807 = this.f36289;
            C18825 c18825M42184 = c7807.f25683.m41166().m42184(m26811());
            for (int i = 0; i < c7807.f25685; i++) {
                c18825M42184.m43449();
            }
            this.f36290 = c18825M42184.m43447();
        }
        return this.f36290;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Iterator m26807(C10630 c10630) {
        C7807 c7807 = c10630.f36289;
        return new C19802(c10630, c7807.f25683, c10630.m26806(), c7807.f25691);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static Iterator m26805(C10630 c10630) {
        C7807 c7807 = c10630.f36289;
        C17684 c17684 = c7807.f25683;
        if (c10630.f36291 == 0) {
            C18825 c18825M42184 = c17684.m41166().m42184(c10630.m26806());
            for (int i = 0; i < c7807.f25691; i++) {
                c18825M42184.m43449();
            }
            c10630.f36291 = c18825M42184.m43447();
        }
        return new C9219(c17684, c10630.f36291, c7807.f25684);
    }
}
