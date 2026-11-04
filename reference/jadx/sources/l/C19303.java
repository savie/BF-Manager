package l;

import java.util.List;

/* JADX INFO: renamed from: l.ᩳ᩵᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: G8P7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19303 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List f62379;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C7688 f62380 = new C7688(new C25360(this));

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC22024[] f62381;

    public C19303(List list) {
        this.f62379 = list;
        this.f62381 = new InterfaceC22024[list.size()];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44674(InterfaceC12789 interfaceC12789, C10857 c10857) {
        int i = 0;
        while (true) {
            InterfaceC22024[] interfaceC22024Arr = this.f62381;
            if (i >= interfaceC22024Arr.length) {
                return;
            }
            c10857.m27594();
            InterfaceC22024 interfaceC22024Mo16658 = interfaceC12789.mo16658(c10857.m27595(), 3);
            C15648 c15648 = (C15648) this.f62379.get(i);
            String str = c15648.f50848;
            C20782.m47564("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            String strM27596 = c15648.f50817;
            if (strM27596 == null) {
                strM27596 = c10857.m27596();
            }
            C20124 c20124 = new C20124();
            c20124.m46309(strM27596);
            c20124.m46327("video/mp2t");
            c20124.m46315(str);
            c20124.m46294(c15648.f50850);
            c20124.m46321(c15648.f50811);
            c20124.m46297(c15648.f50818);
            c20124.m46301(c15648.f50835);
            interfaceC22024Mo16658.mo14384(c20124.m46295());
            interfaceC22024Arr[i] = interfaceC22024Mo16658;
            i++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44672(int i) {
        this.f62380.m20960(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44673(long j, C21287 c21287) {
        this.f62380.m20961(j, c21287);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m44675() {
        this.f62380.m20963();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44671() {
        this.f62380.m20963();
    }
}
